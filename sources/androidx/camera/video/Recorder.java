package androidx.camera.video;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.MutableStateObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.StateObservable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.utils.ArrayRingBuffer;
import androidx.camera.core.internal.utils.RingBuffer;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.Recorder;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.compat.Api26Impl;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.camera.video.internal.config.AudioMimeInfo;
import androidx.camera.video.internal.encoder.BufferCopiedEncodedData;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.OutputConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.utils.OutputUtil;
import androidx.camera.video.internal.workaround.CorrectNegativeLatLongForMediaMuxer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class Recorder implements VideoOutput {
    private static final int AUDIO_CACHE_SIZE = 60;
    private static final Executor AUDIO_EXECUTOR;
    static final EncoderFactory DEFAULT_ENCODER_FACTORY;
    public static final QualitySelector DEFAULT_QUALITY_SELECTOR;
    private static final String MEDIA_COLUMN = "_data";
    private static final MediaSpec MEDIA_SPEC_DEFAULT;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final Exception PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
    private static final long RETRY_SETUP_VIDEO_DELAY_MS = 1000;
    private static final int RETRY_SETUP_VIDEO_MAX_COUNT = 3;
    private static final long SOURCE_NON_STREAMING_TIMEOUT_MS = 1000;
    private static final String TAG = "Recorder";
    public static final int VIDEO_CAPABILITIES_SOURCE_CAMCORDER_PROFILE = 0;
    public static final int VIDEO_CAPABILITIES_SOURCE_CODEC_CAPABILITIES = 1;
    private static final VideoSpec VIDEO_SPEC_DEFAULT;
    static long sRetrySetupVideoDelayMs = 0;
    static int sRetrySetupVideoMaxCount = 0;
    RecordingRecord mActiveRecordingRecord;
    Surface mActiveSurface;
    double mAudioAmplitude;
    Encoder mAudioEncoder;
    private final EncoderFactory mAudioEncoderFactory;
    Throwable mAudioErrorCause;
    OutputConfig mAudioOutputConfig;
    AudioSource mAudioSource;
    AudioState mAudioState;
    Integer mAudioTrackIndex;
    long mDurationLimitNs;
    private final boolean mEncoderNotUsePersistentInputSurface;
    final List<ListenableFuture<Void>> mEncodingFutures;
    private final Executor mExecutor;
    long mFileSizeLimitInBytes;
    long mFirstRecordingAudioDataTimeUs;
    int mFirstRecordingVideoBitrate;
    long mFirstRecordingVideoDataTimeUs;
    RecordingRecord mInProgressRecording;
    boolean mInProgressRecordingStopping;
    private SurfaceRequest.TransformationInfo mInProgressTransformationInfo;
    boolean mIsAudioSourceSilenced;
    private final MutableStateObservable<Boolean> mIsRecording;
    private long mLastGeneratedRecordingId;
    Surface mLatestSurface;
    SurfaceRequest mLatestSurfaceRequest;
    private final Object mLock = new Object();
    MediaMuxer mMediaMuxer;
    final MutableStateObservable<MediaSpec> mMediaSpec;
    private boolean mNeedsResetBeforeNextStart;
    private State mNonPendingState;
    Uri mOutputUri;
    final RingBuffer<EncodedData> mPendingAudioRingBuffer;
    EncodedData mPendingFirstVideoData;
    RecordingRecord mPendingRecordingRecord;
    long mPreviousRecordingAudioDataTimeUs;
    long mPreviousRecordingVideoDataTimeUs;
    long mRecordingBytes;
    long mRecordingDurationNs;
    int mRecordingStopError;
    Throwable mRecordingStopErrorCause;
    private VideoValidatedEncoderProfilesProxy mResolvedEncoderProfiles;
    final Executor mSequentialExecutor;
    private SetupVideoTask mSetupVideoTask;
    private boolean mShouldSendResumeEvent;
    ScheduledFuture<?> mSourceNonStreamingTimeout;
    VideoOutput.SourceState mSourceState;
    private SurfaceRequest.TransformationInfo mSourceTransformationInfo;
    private State mState;
    int mStreamId;
    private final MutableStateObservable<StreamInfo> mStreamInfo;
    private final Executor mUserProvidedExecutor;
    private final int mVideoCapabilitiesSource;
    Encoder mVideoEncoder;
    Range<Integer> mVideoEncoderBitrateRange;
    private final EncoderFactory mVideoEncoderFactory;
    VideoEncoderSession mVideoEncoderSession;
    VideoEncoderSession mVideoEncoderSessionToRelease;
    OutputConfig mVideoOutputConfig;
    Timebase mVideoSourceTimebase;
    Integer mVideoTrackIndex;
    private static final Set<State> PENDING_STATES = Collections.unmodifiableSet(EnumSet.of(State.PENDING_RECORDING, State.PENDING_PAUSED));
    private static final Set<State> VALID_NON_PENDING_STATES_WHILE_PENDING = Collections.unmodifiableSet(EnumSet.of(State.CONFIGURING, State.IDLING, State.RESETTING, State.STOPPING, State.ERROR));

    enum AudioState {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    enum State {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        QualitySelector qualitySelectorFromOrderedList = QualitySelector.fromOrderedList(Arrays.asList(Quality.FHD, Quality.HD, Quality.SD), FallbackStrategy.higherQualityOrLowerThan(Quality.FHD));
        DEFAULT_QUALITY_SELECTOR = qualitySelectorFromOrderedList;
        VideoSpec videoSpecBuild = VideoSpec.builder().setQualitySelector(qualitySelectorFromOrderedList).setAspectRatio(-1).build();
        VIDEO_SPEC_DEFAULT = videoSpecBuild;
        MEDIA_SPEC_DEFAULT = MediaSpec.builder().setOutputFormat(-1).setVideoSpec(videoSpecBuild).build();
        PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE = new RuntimeException("The video frame producer became inactive before any data was received.");
        DEFAULT_ENCODER_FACTORY = new EncoderFactory() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda8
            @Override // androidx.camera.video.internal.encoder.EncoderFactory
            public final Encoder createEncoder(Executor executor, EncoderConfig encoderConfig) {
                return new EncoderImpl(executor, encoderConfig);
            }
        };
        AUDIO_EXECUTOR = CameraXExecutors.newSequentialExecutor(CameraXExecutors.ioExecutor());
        sRetrySetupVideoMaxCount = 3;
        sRetrySetupVideoDelayMs = 1000L;
    }

    Recorder(Executor executor, MediaSpec mediaSpec, int i2, EncoderFactory encoderFactory, EncoderFactory encoderFactory2) {
        this.mEncoderNotUsePersistentInputSurface = DeviceQuirks.get(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.mState = State.CONFIGURING;
        this.mNonPendingState = null;
        this.mStreamId = 0;
        this.mActiveRecordingRecord = null;
        this.mPendingRecordingRecord = null;
        this.mLastGeneratedRecordingId = 0L;
        this.mInProgressRecording = null;
        this.mInProgressRecordingStopping = false;
        this.mInProgressTransformationInfo = null;
        this.mSourceTransformationInfo = null;
        this.mResolvedEncoderProfiles = null;
        this.mEncodingFutures = new ArrayList();
        this.mAudioTrackIndex = null;
        this.mVideoTrackIndex = null;
        this.mLatestSurface = null;
        this.mActiveSurface = null;
        this.mMediaMuxer = null;
        this.mAudioSource = null;
        this.mVideoEncoder = null;
        this.mVideoOutputConfig = null;
        this.mAudioEncoder = null;
        this.mAudioOutputConfig = null;
        this.mAudioState = AudioState.INITIALIZING;
        this.mOutputUri = Uri.EMPTY;
        this.mRecordingBytes = 0L;
        this.mRecordingDurationNs = 0L;
        this.mFirstRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mFirstRecordingVideoBitrate = 0;
        this.mVideoEncoderBitrateRange = null;
        this.mFirstRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mFileSizeLimitInBytes = 0L;
        this.mDurationLimitNs = 0L;
        this.mRecordingStopError = 1;
        this.mRecordingStopErrorCause = null;
        this.mPendingFirstVideoData = null;
        this.mPendingAudioRingBuffer = new ArrayRingBuffer(60);
        this.mAudioErrorCause = null;
        this.mIsAudioSourceSilenced = false;
        this.mSourceState = VideoOutput.SourceState.INACTIVE;
        this.mSourceNonStreamingTimeout = null;
        this.mNeedsResetBeforeNextStart = false;
        this.mVideoEncoderSessionToRelease = null;
        this.mAudioAmplitude = 0.0d;
        this.mShouldSendResumeEvent = false;
        this.mSetupVideoTask = null;
        this.mUserProvidedExecutor = executor;
        executor = executor == null ? CameraXExecutors.ioExecutor() : executor;
        this.mExecutor = executor;
        Executor executorNewSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mSequentialExecutor = executorNewSequentialExecutor;
        this.mMediaSpec = MutableStateObservable.withInitialState(composeRecorderMediaSpec(mediaSpec));
        this.mVideoCapabilitiesSource = i2;
        this.mStreamInfo = MutableStateObservable.withInitialState(StreamInfo.of(this.mStreamId, internalStateToStreamState(this.mState)));
        this.mIsRecording = MutableStateObservable.withInitialState(false);
        this.mVideoEncoderFactory = encoderFactory;
        this.mAudioEncoderFactory = encoderFactory2;
        this.mVideoEncoderSession = new VideoEncoderSession(encoderFactory, executorNewSequentialExecutor, executor);
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        onSurfaceRequested(surfaceRequest, Timebase.UPTIME);
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSurfaceRequested(final SurfaceRequest surfaceRequest, final Timebase timebase) {
        synchronized (this.mLock) {
            Logger.d(TAG, "Surface is requested in state: " + this.mState + ", Current surface: " + this.mStreamId);
            if (this.mState == State.ERROR) {
                setState(State.CONFIGURING);
            }
        }
        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m262lambda$onSurfaceRequested$0$androidxcameravideoRecorder(surfaceRequest, timebase);
            }
        });
    }

    @Override // androidx.camera.video.VideoOutput
    public Observable<MediaSpec> getMediaSpec() {
        return this.mMediaSpec;
    }

    @Override // androidx.camera.video.VideoOutput
    public Observable<StreamInfo> getStreamInfo() {
        return this.mStreamInfo;
    }

    @Override // androidx.camera.video.VideoOutput
    public Observable<Boolean> isSourceStreamRequired() {
        return this.mIsRecording;
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSourceStateChanged(final VideoOutput.SourceState sourceState) {
        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m261lambda$onSourceStateChanged$1$androidxcameravideoRecorder(sourceState);
            }
        });
    }

    @Override // androidx.camera.video.VideoOutput
    public VideoCapabilities getMediaCapabilities(CameraInfo cameraInfo) {
        return getVideoCapabilities(cameraInfo, this.mVideoCapabilitiesSource);
    }

    public PendingRecording prepareRecording(Context context, FileOutputOptions fileOutputOptions) {
        return prepareRecordingInternal(context, fileOutputOptions);
    }

    public PendingRecording prepareRecording(Context context, FileDescriptorOutputOptions fileDescriptorOutputOptions) {
        return prepareRecordingInternal(context, fileDescriptorOutputOptions);
    }

    public PendingRecording prepareRecording(Context context, MediaStoreOutputOptions mediaStoreOutputOptions) {
        return prepareRecordingInternal(context, mediaStoreOutputOptions);
    }

    private PendingRecording prepareRecordingInternal(Context context, OutputOptions outputOptions) {
        Preconditions.checkNotNull(outputOptions, "The OutputOptions cannot be null.");
        return new PendingRecording(context, this, outputOptions);
    }

    public QualitySelector getQualitySelector() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getQualitySelector();
    }

    public int getVideoCapabilitiesSource() {
        return this.mVideoCapabilitiesSource;
    }

    public int getAudioSource() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getSource();
    }

    public Executor getExecutor() {
        return this.mUserProvidedExecutor;
    }

    public int getTargetVideoEncodingBitRate() {
        return ((Integer) ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getBitrate().getLower()).intValue();
    }

    public int getAspectRatio() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getAspectRatio();
    }

    Recording start(PendingRecording pendingRecording) {
        long j2;
        RecordingRecord recordingRecord;
        int i2;
        RecordingRecord recordingRecord2;
        IOException e2;
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        synchronized (this.mLock) {
            j2 = this.mLastGeneratedRecordingId + 1;
            this.mLastGeneratedRecordingId = j2;
            recordingRecord = null;
            i2 = 0;
            switch (this.mState) {
                case CONFIGURING:
                case IDLING:
                case STOPPING:
                case RESETTING:
                case ERROR:
                    if (this.mState == State.IDLING) {
                        Preconditions.checkState(this.mActiveRecordingRecord == null && this.mPendingRecordingRecord == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                    }
                    try {
                        RecordingRecord recordingRecordFrom = RecordingRecord.from(pendingRecording, j2);
                        recordingRecordFrom.initializeRecording(pendingRecording.getApplicationContext());
                        this.mPendingRecordingRecord = recordingRecordFrom;
                        if (this.mState == State.IDLING) {
                            setState(State.PENDING_RECORDING);
                            this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda10
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f$0.tryServicePendingRecording();
                                }
                            });
                        } else if (this.mState == State.ERROR) {
                            setState(State.PENDING_RECORDING);
                            this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda11
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f$0.m266lambda$start$2$androidxcameravideoRecorder();
                                }
                            });
                        } else {
                            setState(State.PENDING_RECORDING);
                        }
                        e2 = null;
                    } catch (IOException e3) {
                        e2 = e3;
                        i2 = 5;
                    }
                    break;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    recordingRecord2 = (RecordingRecord) Preconditions.checkNotNull(this.mPendingRecordingRecord);
                    e2 = null;
                    recordingRecord = recordingRecord2;
                    break;
                case RECORDING:
                case PAUSED:
                    recordingRecord2 = this.mActiveRecordingRecord;
                    e2 = null;
                    recordingRecord = recordingRecord2;
                    break;
                default:
                    e2 = null;
                    break;
            }
        }
        if (recordingRecord != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i2 != 0) {
            Logger.e(TAG, "Recording was started when the Recorder had encountered error " + e2);
            finalizePendingRecording(RecordingRecord.from(pendingRecording, j2), i2, e2);
            return Recording.createFinalizedFrom(pendingRecording, j2);
        }
        return Recording.from(pendingRecording, j2);
    }

    /* JADX INFO: renamed from: lambda$start$2$androidx-camera-video-Recorder */
    /* synthetic */ void m266lambda$start$2$androidxcameravideoRecorder() {
        SurfaceRequest surfaceRequest = this.mLatestSurfaceRequest;
        if (surfaceRequest == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        configureInternal(surfaceRequest, this.mVideoSourceTimebase, false);
    }

    void pause(Recording recording) {
        synchronized (this.mLock) {
            if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                Logger.d(TAG, "pause() called on a recording that is no longer active: " + recording.getOutputOptions());
                return;
            }
            int iOrdinal = this.mState.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    setState(State.PENDING_PAUSED);
                } else if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        setState(State.PAUSED);
                        final RecordingRecord recordingRecord = this.mActiveRecordingRecord;
                        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda13
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.m263lambda$pause$3$androidxcameravideoRecorder(recordingRecord);
                            }
                        });
                    }
                }
                return;
            }
            throw new IllegalStateException("Called pause() from invalid state: " + this.mState);
        }
    }

    void resume(Recording recording) {
        synchronized (this.mLock) {
            if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                Logger.d(TAG, "resume() called on a recording that is no longer active: " + recording.getOutputOptions());
                return;
            }
            int iOrdinal = this.mState.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 5) {
                    setState(State.RECORDING);
                    final RecordingRecord recordingRecord = this.mActiveRecordingRecord;
                    this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m264lambda$resume$4$androidxcameravideoRecorder(recordingRecord);
                        }
                    });
                } else if (iOrdinal == 2) {
                    setState(State.PENDING_RECORDING);
                } else if (iOrdinal != 3) {
                }
                return;
            }
            throw new IllegalStateException("Called resume() from invalid state: " + this.mState);
        }
    }

    void stop(Recording recording, final int i2, final Throwable th) {
        synchronized (this.mLock) {
            if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                Logger.d(TAG, "stop() called on a recording that is no longer active: " + recording.getOutputOptions());
                return;
            }
            RecordingRecord recordingRecord = null;
            switch (this.mState) {
                case CONFIGURING:
                case IDLING:
                    throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    Preconditions.checkState(isSameRecording(recording, this.mPendingRecordingRecord));
                    RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                    this.mPendingRecordingRecord = null;
                    restoreNonPendingState();
                    recordingRecord = recordingRecord2;
                    break;
                case RECORDING:
                case PAUSED:
                    setState(State.STOPPING);
                    final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                    final RecordingRecord recordingRecord3 = this.mActiveRecordingRecord;
                    this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda17
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m267lambda$stop$5$androidxcameravideoRecorder(recordingRecord3, micros, i2, th);
                        }
                    });
                    break;
                case STOPPING:
                case RESETTING:
                    Preconditions.checkState(isSameRecording(recording, this.mActiveRecordingRecord));
                    break;
            }
            if (recordingRecord != null) {
                if (i2 == 10) {
                    Logger.e(TAG, "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                }
                finalizePendingRecording(recordingRecord, 8, new RuntimeException("Recording was stopped before any data could be produced.", th));
            }
        }
    }

    void mute(Recording recording, final boolean z2) {
        synchronized (this.mLock) {
            if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                Logger.d(TAG, "mute() called on a recording that is no longer active: " + recording.getOutputOptions());
            } else {
                final RecordingRecord recordingRecord = isSameRecording(recording, this.mPendingRecordingRecord) ? this.mPendingRecordingRecord : this.mActiveRecordingRecord;
                this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m260lambda$mute$6$androidxcameravideoRecorder(recordingRecord, z2);
                    }
                });
            }
        }
    }

    private void finalizePendingRecording(RecordingRecord recordingRecord, int i2, Throwable th) {
        recordingRecord.finalizeRecording(Uri.EMPTY);
        recordingRecord.updateVideoRecordEvent(VideoRecordEvent.finalizeWithError(recordingRecord.getOutputOptions(), RecordingStats.of(0L, 0L, AudioStats.of(1, this.mAudioErrorCause, 0.0d)), OutputResults.of(Uri.EMPTY), i2, th));
    }

    /* JADX INFO: renamed from: onSurfaceRequestedInternal */
    public void m262lambda$onSurfaceRequested$0$androidxcameravideoRecorder(SurfaceRequest surfaceRequest, Timebase timebase) {
        SurfaceRequest surfaceRequest2 = this.mLatestSurfaceRequest;
        if (surfaceRequest2 != null && !surfaceRequest2.isServiced()) {
            this.mLatestSurfaceRequest.willNotProvideSurface();
        }
        this.mLatestSurfaceRequest = surfaceRequest;
        this.mVideoSourceTimebase = timebase;
        configureInternal(surfaceRequest, timebase, true);
    }

    /* JADX INFO: renamed from: onSourceStateChangedInternal */
    public void m261lambda$onSourceStateChanged$1$androidxcameravideoRecorder(VideoOutput.SourceState sourceState) {
        ScheduledFuture<?> scheduledFuture;
        Encoder encoder;
        VideoOutput.SourceState sourceState2 = this.mSourceState;
        this.mSourceState = sourceState;
        if (sourceState2 != sourceState) {
            Logger.d(TAG, "Video source has transitioned to state: " + sourceState);
            if (sourceState == VideoOutput.SourceState.INACTIVE) {
                if (this.mActiveSurface == null) {
                    SetupVideoTask setupVideoTask = this.mSetupVideoTask;
                    if (setupVideoTask != null) {
                        setupVideoTask.cancelFailedRetry();
                        this.mSetupVideoTask = null;
                    }
                    requestReset(4, null, false);
                    return;
                }
                this.mNeedsResetBeforeNextStart = true;
                RecordingRecord recordingRecord = this.mInProgressRecording;
                if (recordingRecord != null && !recordingRecord.isPersistent()) {
                    onInProgressRecordingInternalError(this.mInProgressRecording, 4, null);
                    return;
                }
                return;
            }
            if (sourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING || (scheduledFuture = this.mSourceNonStreamingTimeout) == null || !scheduledFuture.cancel(false) || (encoder = this.mVideoEncoder) == null) {
                return;
            }
            notifyEncoderSourceStopped(encoder);
            return;
        }
        Logger.d(TAG, "Video source transitions to the same state: " + sourceState);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    void requestReset(int i2, Throwable th, boolean z2) {
        boolean z3;
        boolean z4;
        synchronized (this.mLock) {
            z3 = true;
            z4 = false;
            switch (this.mState) {
                case CONFIGURING:
                case IDLING:
                case ERROR:
                    break;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    updateNonPendingState(State.RESETTING);
                    break;
                case RECORDING:
                case PAUSED:
                    Preconditions.checkState(this.mInProgressRecording != null, "In-progress recording shouldn't be null when in state " + this.mState);
                    if (this.mActiveRecordingRecord != this.mInProgressRecording) {
                        throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                    }
                    if (!isPersistentRecordingInProgress()) {
                        setState(State.RESETTING);
                        z4 = true;
                        z3 = false;
                    }
                    break;
                    break;
                case STOPPING:
                    setState(State.RESETTING);
                    z3 = false;
                    break;
                case RESETTING:
                    z3 = false;
                    break;
                default:
                    z3 = false;
                    break;
            }
        }
        if (!z3) {
            if (z4) {
                m267lambda$stop$5$androidxcameravideoRecorder(this.mInProgressRecording, -1L, i2, th);
            }
        } else if (z2) {
            resetVideo();
        } else {
            reset();
        }
    }

    private void configureInternal(SurfaceRequest surfaceRequest, Timebase timebase, boolean z2) {
        if (surfaceRequest.isServiced()) {
            Logger.w(TAG, "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        surfaceRequest.setTransformationInfoListener(this.mSequentialExecutor, new SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda12
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                this.f$0.m259lambda$configureInternal$7$androidxcameravideoRecorder(transformationInfo);
            }
        });
        Size resolution = surfaceRequest.getResolution();
        DynamicRange dynamicRange = surfaceRequest.getDynamicRange();
        VideoCapabilities videoCapabilities = getVideoCapabilities(surfaceRequest.getCamera().getCameraInfo());
        Quality qualityFindNearestHigherSupportedQualityFor = videoCapabilities.findNearestHigherSupportedQualityFor(resolution, dynamicRange);
        Logger.d(TAG, "Using supported quality of " + qualityFindNearestHigherSupportedQualityFor + " for surface size " + resolution);
        if (qualityFindNearestHigherSupportedQualityFor != Quality.NONE) {
            VideoValidatedEncoderProfilesProxy profiles = videoCapabilities.getProfiles(qualityFindNearestHigherSupportedQualityFor, dynamicRange);
            this.mResolvedEncoderProfiles = profiles;
            if (profiles == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        SetupVideoTask setupVideoTask = this.mSetupVideoTask;
        if (setupVideoTask != null) {
            setupVideoTask.cancelFailedRetry();
        }
        SetupVideoTask setupVideoTask2 = new SetupVideoTask(surfaceRequest, timebase, z2 ? sRetrySetupVideoMaxCount : 0);
        this.mSetupVideoTask = setupVideoTask2;
        setupVideoTask2.start();
    }

    /* JADX INFO: renamed from: lambda$configureInternal$7$androidx-camera-video-Recorder */
    /* synthetic */ void m259lambda$configureInternal$7$androidxcameravideoRecorder(SurfaceRequest.TransformationInfo transformationInfo) {
        this.mSourceTransformationInfo = transformationInfo;
    }

    class SetupVideoTask {
        private final int mMaxRetryCount;
        private final SurfaceRequest mSurfaceRequest;
        private final Timebase mTimebase;
        private boolean mIsFailedRetryCanceled = false;
        private int mRetryCount = 0;
        private ScheduledFuture<?> mRetryFuture = null;

        static /* synthetic */ int access$408(SetupVideoTask setupVideoTask) {
            int i2 = setupVideoTask.mRetryCount;
            setupVideoTask.mRetryCount = i2 + 1;
            return i2;
        }

        SetupVideoTask(SurfaceRequest surfaceRequest, Timebase timebase, int i2) {
            this.mSurfaceRequest = surfaceRequest;
            this.mTimebase = timebase;
            this.mMaxRetryCount = i2;
        }

        void start() {
            setupVideo(this.mSurfaceRequest, this.mTimebase);
        }

        void cancelFailedRetry() {
            if (this.mIsFailedRetryCanceled) {
                return;
            }
            this.mIsFailedRetryCanceled = true;
            ScheduledFuture<?> scheduledFuture = this.mRetryFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.mRetryFuture = null;
            }
        }

        public void setupVideo(final SurfaceRequest surfaceRequest, final Timebase timebase) {
            Recorder.this.safeToCloseVideoEncoder().addListener(new Runnable() { // from class: androidx.camera.video.Recorder$SetupVideoTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m272xdf7f9b96(surfaceRequest, timebase);
                }
            }, Recorder.this.mSequentialExecutor);
        }

        /* JADX INFO: renamed from: lambda$setupVideo$0$androidx-camera-video-Recorder$SetupVideoTask */
        /* synthetic */ void m272xdf7f9b96(SurfaceRequest surfaceRequest, Timebase timebase) {
            if (surfaceRequest.isServiced() || (Recorder.this.mVideoEncoderSession.isConfiguredSurfaceRequest(surfaceRequest) && !Recorder.this.isPersistentRecordingInProgress())) {
                Logger.w(Recorder.TAG, "Ignore the SurfaceRequest " + surfaceRequest + " isServiced: " + surfaceRequest.isServiced() + " VideoEncoderSession: " + Recorder.this.mVideoEncoderSession + " has been configured with a persistent in-progress recording.");
                return;
            }
            VideoEncoderSession videoEncoderSession = new VideoEncoderSession(Recorder.this.mVideoEncoderFactory, Recorder.this.mSequentialExecutor, Recorder.this.mExecutor);
            Recorder recorder = Recorder.this;
            ListenableFuture<Encoder> listenableFutureConfigure = videoEncoderSession.configure(surfaceRequest, timebase, (MediaSpec) recorder.getObservableData(recorder.mMediaSpec), Recorder.this.mResolvedEncoderProfiles);
            Recorder.this.mVideoEncoderSession = videoEncoderSession;
            Futures.addCallback(listenableFutureConfigure, new AnonymousClass1(videoEncoderSession), Recorder.this.mSequentialExecutor);
        }

        /* JADX INFO: renamed from: androidx.camera.video.Recorder$SetupVideoTask$1 */
        /* JADX INFO: loaded from: classes2.dex */
        class AnonymousClass1 implements FutureCallback<Encoder> {
            final /* synthetic */ VideoEncoderSession val$videoEncoderSession;

            AnonymousClass1(VideoEncoderSession videoEncoderSession) {
                this.val$videoEncoderSession = videoEncoderSession;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Encoder encoder) {
                Logger.d(Recorder.TAG, "VideoEncoder is created. " + encoder);
                if (encoder == null) {
                    return;
                }
                Preconditions.checkState(Recorder.this.mVideoEncoderSession == this.val$videoEncoderSession);
                Preconditions.checkState(Recorder.this.mVideoEncoder == null);
                Recorder.this.onVideoEncoderReady(this.val$videoEncoderSession);
                Recorder.this.onConfigured();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Logger.w(Recorder.TAG, "VideoEncoder Setup error: " + th, th);
                if (SetupVideoTask.this.mRetryCount < SetupVideoTask.this.mMaxRetryCount) {
                    SetupVideoTask.access$408(SetupVideoTask.this);
                    SetupVideoTask.this.mRetryFuture = Recorder.scheduleTask(new Runnable() { // from class: androidx.camera.video.Recorder$SetupVideoTask$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m273xdc553cf6();
                        }
                    }, Recorder.this.mSequentialExecutor, Recorder.sRetrySetupVideoDelayMs, TimeUnit.MILLISECONDS);
                    return;
                }
                Recorder.this.onEncoderSetupError(th);
            }

            /* JADX INFO: renamed from: lambda$onFailure$0$androidx-camera-video-Recorder$SetupVideoTask$1 */
            /* synthetic */ void m273xdc553cf6() {
                if (SetupVideoTask.this.mIsFailedRetryCanceled) {
                    return;
                }
                Logger.d(Recorder.TAG, "Retry setupVideo #" + SetupVideoTask.this.mRetryCount);
                SetupVideoTask setupVideoTask = SetupVideoTask.this;
                setupVideoTask.setupVideo(setupVideoTask.mSurfaceRequest, SetupVideoTask.this.mTimebase);
            }
        }
    }

    boolean isPersistentRecordingInProgress() {
        RecordingRecord recordingRecord = this.mInProgressRecording;
        return recordingRecord != null && recordingRecord.isPersistent();
    }

    public ListenableFuture<Void> safeToCloseVideoEncoder() {
        Logger.d(TAG, "Try to safely release video encoder: " + this.mVideoEncoder);
        return this.mVideoEncoderSession.signalTermination();
    }

    void onVideoEncoderReady(VideoEncoderSession videoEncoderSession) {
        Encoder videoEncoder = videoEncoderSession.getVideoEncoder();
        this.mVideoEncoder = videoEncoder;
        this.mVideoEncoderBitrateRange = ((VideoEncoderInfo) videoEncoder.getEncoderInfo()).getSupportedBitrateRange();
        this.mFirstRecordingVideoBitrate = this.mVideoEncoder.getConfiguredBitrate();
        Surface activeSurface = videoEncoderSession.getActiveSurface();
        this.mActiveSurface = activeSurface;
        setLatestSurface(activeSurface);
        videoEncoderSession.setOnSurfaceUpdateListener(this.mSequentialExecutor, new Encoder.SurfaceInput.OnSurfaceUpdateListener() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda14
            @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
            public final void onSurfaceUpdate(Surface surface) {
                this.f$0.setLatestSurface(surface);
            }
        });
        Futures.addCallback(videoEncoderSession.getReadyToReleaseFuture(), new FutureCallback<Encoder>() { // from class: androidx.camera.video.Recorder.1
            final /* synthetic */ VideoEncoderSession val$videoEncoderSession;

            AnonymousClass1(VideoEncoderSession videoEncoderSession2) {
                videoEncoderSession = videoEncoderSession2;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Encoder encoder) {
                Logger.d(Recorder.TAG, "VideoEncoder can be released: " + encoder);
                if (encoder == null) {
                    return;
                }
                if (Recorder.this.mSourceNonStreamingTimeout != null && Recorder.this.mSourceNonStreamingTimeout.cancel(false) && Recorder.this.mVideoEncoder != null && Recorder.this.mVideoEncoder == encoder) {
                    Recorder.notifyEncoderSourceStopped(Recorder.this.mVideoEncoder);
                }
                Recorder.this.mVideoEncoderSessionToRelease = videoEncoderSession;
                Recorder.this.setLatestSurface(null);
                Recorder recorder = Recorder.this;
                recorder.requestReset(4, null, recorder.isPersistentRecordingInProgress());
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Logger.d(Recorder.TAG, "Error in ReadyToReleaseFuture: " + th);
            }
        }, this.mSequentialExecutor);
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$1 */
    class AnonymousClass1 implements FutureCallback<Encoder> {
        final /* synthetic */ VideoEncoderSession val$videoEncoderSession;

        AnonymousClass1(VideoEncoderSession videoEncoderSession2) {
            videoEncoderSession = videoEncoderSession2;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(Encoder encoder) {
            Logger.d(Recorder.TAG, "VideoEncoder can be released: " + encoder);
            if (encoder == null) {
                return;
            }
            if (Recorder.this.mSourceNonStreamingTimeout != null && Recorder.this.mSourceNonStreamingTimeout.cancel(false) && Recorder.this.mVideoEncoder != null && Recorder.this.mVideoEncoder == encoder) {
                Recorder.notifyEncoderSourceStopped(Recorder.this.mVideoEncoder);
            }
            Recorder.this.mVideoEncoderSessionToRelease = videoEncoderSession;
            Recorder.this.setLatestSurface(null);
            Recorder recorder = Recorder.this;
            recorder.requestReset(4, null, recorder.isPersistentRecordingInProgress());
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            Logger.d(Recorder.TAG, "Error in ReadyToReleaseFuture: " + th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0065 A[Catch: all -> 0x00bb, TryCatch #0 {, blocks: (B:56:0x0005, B:57:0x000e, B:82:0x0076, B:59:0x0012, B:62:0x001b, B:79:0x0065, B:81:0x006b, B:84:0x0078, B:65:0x0020, B:66:0x0034, B:69:0x0038, B:70:0x0046, B:73:0x004b, B:74:0x0052, B:75:0x0053), top: B:99:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void onConfigured() {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.onConfigured():void");
    }

    private MediaSpec composeRecorderMediaSpec(MediaSpec mediaSpec) {
        MediaSpec.Builder builder = mediaSpec.toBuilder();
        if (mediaSpec.getVideoSpec().getAspectRatio() == -1) {
            builder.configureVideo(new Consumer() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda9
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setAspectRatio(Recorder.VIDEO_SPEC_DEFAULT.getAspectRatio());
                }
            });
        }
        return builder.build();
    }

    private static boolean isSameRecording(Recording recording, RecordingRecord recordingRecord) {
        return recordingRecord != null && recording.getRecordingId() == recordingRecord.getRecordingId();
    }

    private void setupAudio(RecordingRecord recordingRecord) throws InvalidConfigException, AudioSourceAccessException {
        MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
        AudioMimeInfo audioMimeInfoResolveAudioMimeInfo = AudioConfigUtil.resolveAudioMimeInfo(mediaSpec, this.mResolvedEncoderProfiles);
        Timebase timebase = Timebase.UPTIME;
        AudioSettings audioSettingsResolveAudioSettings = AudioConfigUtil.resolveAudioSettings(audioMimeInfoResolveAudioMimeInfo, mediaSpec.getAudioSpec());
        if (this.mAudioSource != null) {
            releaseCurrentAudioSource();
        }
        AudioSource audioSource = setupAudioSource(recordingRecord, audioSettingsResolveAudioSettings);
        this.mAudioSource = audioSource;
        Logger.d(TAG, String.format("Set up new audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        Encoder encoderCreateEncoder = this.mAudioEncoderFactory.createEncoder(this.mExecutor, AudioConfigUtil.resolveAudioEncoderConfig(audioMimeInfoResolveAudioMimeInfo, timebase, audioSettingsResolveAudioSettings, mediaSpec.getAudioSpec()));
        this.mAudioEncoder = encoderCreateEncoder;
        Encoder.EncoderInput input = encoderCreateEncoder.getInput();
        if (!(input instanceof Encoder.ByteBufferInput)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.mAudioSource.setBufferProvider((Encoder.ByteBufferInput) input);
    }

    private AudioSource setupAudioSource(RecordingRecord recordingRecord, AudioSettings audioSettings) throws AudioSourceAccessException {
        return recordingRecord.performOneTimeAudioSourceCreation(audioSettings, AUDIO_EXECUTOR);
    }

    private void releaseCurrentAudioSource() {
        AudioSource audioSource = this.mAudioSource;
        if (audioSource == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.mAudioSource = null;
        Logger.d(TAG, String.format("Releasing audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        Futures.addCallback(audioSource.release(), new FutureCallback<Void>() { // from class: androidx.camera.video.Recorder.2
            final /* synthetic */ AudioSource val$audioSource;

            AnonymousClass2(AudioSource audioSource2) {
                audioSource = audioSource2;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r3) {
                Logger.d(Recorder.TAG, String.format("Released audio source successfully: 0x%x", Integer.valueOf(audioSource.hashCode())));
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Logger.d(Recorder.TAG, String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
            }
        }, CameraXExecutors.directExecutor());
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$2 */
    class AnonymousClass2 implements FutureCallback<Void> {
        final /* synthetic */ AudioSource val$audioSource;

        AnonymousClass2(AudioSource audioSource2) {
            audioSource = audioSource2;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(Void r3) {
            Logger.d(Recorder.TAG, String.format("Released audio source successfully: 0x%x", Integer.valueOf(audioSource.hashCode())));
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            Logger.d(Recorder.TAG, String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    void onEncoderSetupError(Throwable th) {
        RecordingRecord recordingRecord;
        synchronized (this.mLock) {
            recordingRecord = null;
            switch (this.mState) {
                case CONFIGURING:
                    setStreamId(-1);
                    setState(State.ERROR);
                    break;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                    this.mPendingRecordingRecord = null;
                    recordingRecord = recordingRecord2;
                    setStreamId(-1);
                    setState(State.ERROR);
                    break;
                case IDLING:
                case RECORDING:
                case PAUSED:
                case STOPPING:
                case RESETTING:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.mState + ": " + th);
            }
        }
        if (recordingRecord != null) {
            finalizePendingRecording(recordingRecord, 7, th);
        }
    }

    void setupAndStartMediaMuxer(RecordingRecord recordingRecord) {
        if (this.mMediaMuxer != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (isAudioEnabled() && this.mPendingAudioRingBuffer.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        EncodedData encodedData = this.mPendingFirstVideoData;
        if (encodedData == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.mPendingFirstVideoData = null;
            List<EncodedData> audioDataToWriteAndClearCache = getAudioDataToWriteAndClearCache(encodedData.getPresentationTimeUs());
            long size = encodedData.size();
            Iterator<EncodedData> it = audioDataToWriteAndClearCache.iterator();
            while (it.hasNext()) {
                size += it.next().size();
            }
            long j2 = this.mFileSizeLimitInBytes;
            if (j2 != 0 && size > j2) {
                Logger.d(TAG, String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
                onInProgressRecordingInternalError(recordingRecord, 2, null);
                if (encodedData != null) {
                    encodedData.close();
                    return;
                }
                return;
            }
            try {
                MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
                MediaMuxer mediaMuxerPerformOneTimeMediaMuxerCreation = recordingRecord.performOneTimeMediaMuxerCreation(mediaSpec.getOutputFormat() == -1 ? supportedMuxerFormatOrDefaultFrom(this.mResolvedEncoderProfiles, MediaSpec.outputFormatToMuxerFormat(MEDIA_SPEC_DEFAULT.getOutputFormat())) : MediaSpec.outputFormatToMuxerFormat(mediaSpec.getOutputFormat()), new Consumer() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda15
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        this.f$0.m265lambda$setupAndStartMediaMuxer$9$androidxcameravideoRecorder((Uri) obj);
                    }
                });
                SurfaceRequest.TransformationInfo transformationInfo = this.mSourceTransformationInfo;
                if (transformationInfo != null) {
                    setInProgressTransformationInfo(transformationInfo);
                    mediaMuxerPerformOneTimeMediaMuxerCreation.setOrientationHint(transformationInfo.getRotationDegrees());
                }
                Location location = recordingRecord.getOutputOptions().getLocation();
                if (location != null) {
                    try {
                        Pair<Double, Double> pairAdjustGeoLocation = CorrectNegativeLatLongForMediaMuxer.adjustGeoLocation(location.getLatitude(), location.getLongitude());
                        mediaMuxerPerformOneTimeMediaMuxerCreation.setLocation((float) ((Double) pairAdjustGeoLocation.first).doubleValue(), (float) ((Double) pairAdjustGeoLocation.second).doubleValue());
                    } catch (IllegalArgumentException e2) {
                        mediaMuxerPerformOneTimeMediaMuxerCreation.release();
                        onInProgressRecordingInternalError(recordingRecord, 5, e2);
                        if (encodedData != null) {
                            encodedData.close();
                            return;
                        }
                        return;
                    }
                }
                this.mVideoTrackIndex = Integer.valueOf(mediaMuxerPerformOneTimeMediaMuxerCreation.addTrack(this.mVideoOutputConfig.getMediaFormat()));
                if (isAudioEnabled()) {
                    this.mAudioTrackIndex = Integer.valueOf(mediaMuxerPerformOneTimeMediaMuxerCreation.addTrack(this.mAudioOutputConfig.getMediaFormat()));
                }
                mediaMuxerPerformOneTimeMediaMuxerCreation.start();
                this.mMediaMuxer = mediaMuxerPerformOneTimeMediaMuxerCreation;
                writeVideoData(encodedData, recordingRecord);
                Iterator<EncodedData> it2 = audioDataToWriteAndClearCache.iterator();
                while (it2.hasNext()) {
                    writeAudioData(it2.next(), recordingRecord);
                }
                if (encodedData != null) {
                    encodedData.close();
                }
            } catch (IOException e3) {
                onInProgressRecordingInternalError(recordingRecord, 5, e3);
                if (encodedData != null) {
                    encodedData.close();
                }
            }
        } catch (Throwable th) {
            if (encodedData != null) {
                try {
                    encodedData.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: lambda$setupAndStartMediaMuxer$9$androidx-camera-video-Recorder */
    /* synthetic */ void m265lambda$setupAndStartMediaMuxer$9$androidxcameravideoRecorder(Uri uri) {
        this.mOutputUri = uri;
    }

    private List<EncodedData> getAudioDataToWriteAndClearCache(long j2) {
        ArrayList arrayList = new ArrayList();
        while (!this.mPendingAudioRingBuffer.isEmpty()) {
            EncodedData encodedDataDequeue = this.mPendingAudioRingBuffer.dequeue();
            if (encodedDataDequeue.getPresentationTimeUs() >= j2) {
                arrayList.add(encodedDataDequeue);
            }
        }
        return arrayList;
    }

    private void startInternal(RecordingRecord recordingRecord) {
        AudioState audioState;
        if (this.mInProgressRecording != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        if (recordingRecord.getOutputOptions().getFileSizeLimit() > 0) {
            this.mFileSizeLimitInBytes = Math.round(recordingRecord.getOutputOptions().getFileSizeLimit() * 0.95d);
            Logger.d(TAG, "File size limit in bytes: " + this.mFileSizeLimitInBytes);
        } else {
            this.mFileSizeLimitInBytes = 0L;
        }
        if (recordingRecord.getOutputOptions().getDurationLimitMillis() > 0) {
            this.mDurationLimitNs = TimeUnit.MILLISECONDS.toNanos(recordingRecord.getOutputOptions().getDurationLimitMillis());
            Logger.d(TAG, "Duration limit in nanoseconds: " + this.mDurationLimitNs);
        } else {
            this.mDurationLimitNs = 0L;
        }
        this.mInProgressRecording = recordingRecord;
        int iOrdinal = this.mAudioState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                setAudioState(recordingRecord.hasAudioEnabled() ? AudioState.ENABLED : AudioState.DISABLED);
            } else if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.mAudioState);
            }
        } else if (recordingRecord.hasAudioEnabled()) {
            if (!isAudioSupported()) {
                throw new AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                if (!this.mInProgressRecording.isPersistent() || this.mAudioEncoder == null) {
                    setupAudio(recordingRecord);
                }
                setAudioState(AudioState.ENABLED);
            } catch (AudioSourceAccessException | InvalidConfigException e2) {
                Logger.e(TAG, "Unable to create audio resource with error: ", e2);
                if (e2 instanceof InvalidConfigException) {
                    audioState = AudioState.ERROR_ENCODER;
                } else {
                    audioState = AudioState.ERROR_SOURCE;
                }
                setAudioState(audioState);
                this.mAudioErrorCause = e2;
            }
        }
        updateEncoderCallbacks(recordingRecord, false);
        if (isAudioEnabled()) {
            this.mAudioSource.start(recordingRecord.isMuted());
            this.mAudioEncoder.start();
        }
        this.mVideoEncoder.start();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.start(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    private void updateEncoderCallbacks(final RecordingRecord recordingRecord, boolean z2) {
        if (!this.mEncodingFutures.isEmpty()) {
            ListenableFuture listenableFutureAllAsList = Futures.allAsList(this.mEncodingFutures);
            if (!listenableFutureAllAsList.isDone()) {
                listenableFutureAllAsList.cancel(true);
            }
            this.mEncodingFutures.clear();
        }
        this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f$0.m268lambda$updateEncoderCallbacks$10$androidxcameravideoRecorder(recordingRecord, completer);
            }
        }));
        if (isAudioEnabled() && !z2) {
            this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda2
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return this.f$0.m270lambda$updateEncoderCallbacks$12$androidxcameravideoRecorder(recordingRecord, completer);
                }
            }));
        }
        Futures.addCallback(Futures.allAsList(this.mEncodingFutures), new FutureCallback<List<Void>>() { // from class: androidx.camera.video.Recorder.6
            AnonymousClass6() {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(List<Void> list) {
                Logger.d(Recorder.TAG, "Encodings end successfully.");
                Recorder recorder = Recorder.this;
                recorder.finalizeInProgressRecording(recorder.mRecordingStopError, Recorder.this.mRecordingStopErrorCause);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Preconditions.checkState(Recorder.this.mInProgressRecording != null, "In-progress recording shouldn't be null");
                if (Recorder.this.mInProgressRecording.isPersistent()) {
                    return;
                }
                Logger.d(Recorder.TAG, "Encodings end with error: " + th);
                Recorder recorder = Recorder.this;
                recorder.finalizeInProgressRecording(recorder.mMediaMuxer == null ? 8 : 6, th);
            }
        }, CameraXExecutors.directExecutor());
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$3 */
    class AnonymousClass3 implements EncoderCallback {
        final /* synthetic */ CallbackToFutureAdapter.Completer val$completer;
        final /* synthetic */ RecordingRecord val$recordingToStart;

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStart() {
        }

        AnonymousClass3(CallbackToFutureAdapter.Completer completer, RecordingRecord recordingRecord) {
            completer = completer;
            recordingRecord = recordingRecord;
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStop() {
            completer.set(null);
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeError(EncodeException encodeException) {
            completer.setException(encodeException);
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodedData(EncodedData encodedData) {
            boolean z2;
            if (Recorder.this.mMediaMuxer == null) {
                if (!Recorder.this.mInProgressRecordingStopping) {
                    if (Recorder.this.mPendingFirstVideoData != null) {
                        Recorder.this.mPendingFirstVideoData.close();
                        Recorder.this.mPendingFirstVideoData = null;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (encodedData.isKeyFrame()) {
                        Recorder.this.mPendingFirstVideoData = encodedData;
                        if (Recorder.this.isAudioEnabled() && Recorder.this.mPendingAudioRingBuffer.isEmpty()) {
                            if (z2) {
                                Logger.d(Recorder.TAG, "Replaced cached video keyframe with newer keyframe.");
                                return;
                            } else {
                                Logger.d(Recorder.TAG, "Cached video keyframe while we wait for first audio sample before starting muxer.");
                                return;
                            }
                        }
                        Logger.d(Recorder.TAG, "Received video keyframe. Starting muxer...");
                        Recorder.this.setupAndStartMediaMuxer(recordingRecord);
                        return;
                    }
                    if (z2) {
                        Logger.d(Recorder.TAG, "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                    }
                    Logger.d(Recorder.TAG, "Dropped video data since muxer has not yet started and data is not a keyframe.");
                    Recorder.this.mVideoEncoder.requestKeyFrame();
                    encodedData.close();
                    return;
                }
                Logger.d(Recorder.TAG, "Drop video data since recording is stopping.");
                encodedData.close();
                return;
            }
            try {
                Recorder.this.writeVideoData(encodedData, recordingRecord);
                if (encodedData != null) {
                    encodedData.close();
                }
            } catch (Throwable th) {
                if (encodedData != null) {
                    try {
                        encodedData.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onOutputConfigUpdate(OutputConfig outputConfig) {
            Recorder.this.mVideoOutputConfig = outputConfig;
        }
    }

    /* JADX INFO: renamed from: lambda$updateEncoderCallbacks$10$androidx-camera-video-Recorder */
    /* synthetic */ Object m268lambda$updateEncoderCallbacks$10$androidxcameravideoRecorder(RecordingRecord recordingRecord, CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mVideoEncoder.setEncoderCallback(new EncoderCallback() { // from class: androidx.camera.video.Recorder.3
            final /* synthetic */ CallbackToFutureAdapter.Completer val$completer;
            final /* synthetic */ RecordingRecord val$recordingToStart;

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStart() {
            }

            AnonymousClass3(CallbackToFutureAdapter.Completer completer2, RecordingRecord recordingRecord2) {
                completer = completer2;
                recordingRecord = recordingRecord2;
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStop() {
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeError(EncodeException encodeException) {
                completer.setException(encodeException);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodedData(EncodedData encodedData) {
                boolean z2;
                if (Recorder.this.mMediaMuxer == null) {
                    if (!Recorder.this.mInProgressRecordingStopping) {
                        if (Recorder.this.mPendingFirstVideoData != null) {
                            Recorder.this.mPendingFirstVideoData.close();
                            Recorder.this.mPendingFirstVideoData = null;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (encodedData.isKeyFrame()) {
                            Recorder.this.mPendingFirstVideoData = encodedData;
                            if (Recorder.this.isAudioEnabled() && Recorder.this.mPendingAudioRingBuffer.isEmpty()) {
                                if (z2) {
                                    Logger.d(Recorder.TAG, "Replaced cached video keyframe with newer keyframe.");
                                    return;
                                } else {
                                    Logger.d(Recorder.TAG, "Cached video keyframe while we wait for first audio sample before starting muxer.");
                                    return;
                                }
                            }
                            Logger.d(Recorder.TAG, "Received video keyframe. Starting muxer...");
                            Recorder.this.setupAndStartMediaMuxer(recordingRecord);
                            return;
                        }
                        if (z2) {
                            Logger.d(Recorder.TAG, "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                        }
                        Logger.d(Recorder.TAG, "Dropped video data since muxer has not yet started and data is not a keyframe.");
                        Recorder.this.mVideoEncoder.requestKeyFrame();
                        encodedData.close();
                        return;
                    }
                    Logger.d(Recorder.TAG, "Drop video data since recording is stopping.");
                    encodedData.close();
                    return;
                }
                try {
                    Recorder.this.writeVideoData(encodedData, recordingRecord);
                    if (encodedData != null) {
                        encodedData.close();
                    }
                } catch (Throwable th) {
                    if (encodedData != null) {
                        try {
                            encodedData.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onOutputConfigUpdate(OutputConfig outputConfig) {
                Recorder.this.mVideoOutputConfig = outputConfig;
            }
        }, this.mSequentialExecutor);
        return "videoEncodingFuture";
    }

    /* JADX INFO: renamed from: lambda$updateEncoderCallbacks$12$androidx-camera-video-Recorder */
    /* synthetic */ Object m270lambda$updateEncoderCallbacks$12$androidxcameravideoRecorder(RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) throws Exception {
        Consumer consumer = new Consumer() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda7
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f$0.m269lambda$updateEncoderCallbacks$11$androidxcameravideoRecorder(completer, (Throwable) obj);
            }
        };
        this.mAudioSource.setAudioSourceCallback(this.mSequentialExecutor, new AudioSource.AudioSourceCallback() { // from class: androidx.camera.video.Recorder.4
            final /* synthetic */ Consumer val$audioErrorConsumer;

            AnonymousClass4(Consumer consumer2) {
                consumer = consumer2;
            }

            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onSilenceStateChanged(boolean z2) {
                if (Recorder.this.mIsAudioSourceSilenced != z2) {
                    Recorder.this.mIsAudioSourceSilenced = z2;
                    Recorder.this.updateInProgressStatusEvent();
                } else {
                    Logger.w(Recorder.TAG, "Audio source silenced transitions to the same state " + z2);
                }
            }

            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onError(Throwable th) {
                Logger.e(Recorder.TAG, "Error occurred after audio source started.", th);
                if (th instanceof AudioSourceAccessException) {
                    consumer.accept(th);
                }
            }

            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onAmplitudeValue(double d2) {
                Recorder.this.mAudioAmplitude = d2;
            }
        });
        this.mAudioEncoder.setEncoderCallback(new EncoderCallback() { // from class: androidx.camera.video.Recorder.5
            final /* synthetic */ Consumer val$audioErrorConsumer;
            final /* synthetic */ CallbackToFutureAdapter.Completer val$completer;
            final /* synthetic */ RecordingRecord val$recordingToStart;

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStart() {
            }

            AnonymousClass5(final CallbackToFutureAdapter.Completer completer2, Consumer consumer2, RecordingRecord recordingRecord2) {
                completer = completer2;
                consumer = consumer2;
                recordingRecord = recordingRecord2;
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStop() {
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeError(EncodeException encodeException) {
                if (Recorder.this.mAudioErrorCause == null) {
                    consumer.accept(encodeException);
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodedData(EncodedData encodedData) {
                if (Recorder.this.mAudioState == AudioState.DISABLED) {
                    encodedData.close();
                    throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
                }
                if (Recorder.this.mMediaMuxer == null) {
                    if (!Recorder.this.mInProgressRecordingStopping) {
                        Recorder.this.mPendingAudioRingBuffer.enqueue(new BufferCopiedEncodedData(encodedData));
                        if (Recorder.this.mPendingFirstVideoData != null) {
                            Logger.d(Recorder.TAG, "Received audio data. Starting muxer...");
                            Recorder.this.setupAndStartMediaMuxer(recordingRecord);
                        } else {
                            Logger.d(Recorder.TAG, "Cached audio data while we wait for video keyframe before starting muxer.");
                        }
                    } else {
                        Logger.d(Recorder.TAG, "Drop audio data since recording is stopping.");
                    }
                    encodedData.close();
                    return;
                }
                try {
                    Recorder.this.writeAudioData(encodedData, recordingRecord);
                    if (encodedData != null) {
                        encodedData.close();
                    }
                } catch (Throwable th) {
                    if (encodedData != null) {
                        try {
                            encodedData.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onOutputConfigUpdate(OutputConfig outputConfig) {
                Recorder.this.mAudioOutputConfig = outputConfig;
            }
        }, this.mSequentialExecutor);
        return "audioEncodingFuture";
    }

    /* JADX INFO: renamed from: lambda$updateEncoderCallbacks$11$androidx-camera-video-Recorder */
    /* synthetic */ void m269lambda$updateEncoderCallbacks$11$androidxcameravideoRecorder(CallbackToFutureAdapter.Completer completer, Throwable th) {
        if (this.mAudioErrorCause == null) {
            if (th instanceof EncodeException) {
                setAudioState(AudioState.ERROR_ENCODER);
            } else {
                setAudioState(AudioState.ERROR_SOURCE);
            }
            this.mAudioErrorCause = th;
            updateInProgressStatusEvent();
            completer.set(null);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$4 */
    class AnonymousClass4 implements AudioSource.AudioSourceCallback {
        final /* synthetic */ Consumer val$audioErrorConsumer;

        AnonymousClass4(Consumer consumer2) {
            consumer = consumer2;
        }

        @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
        public void onSilenceStateChanged(boolean z2) {
            if (Recorder.this.mIsAudioSourceSilenced != z2) {
                Recorder.this.mIsAudioSourceSilenced = z2;
                Recorder.this.updateInProgressStatusEvent();
            } else {
                Logger.w(Recorder.TAG, "Audio source silenced transitions to the same state " + z2);
            }
        }

        @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
        public void onError(Throwable th) {
            Logger.e(Recorder.TAG, "Error occurred after audio source started.", th);
            if (th instanceof AudioSourceAccessException) {
                consumer.accept(th);
            }
        }

        @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
        public void onAmplitudeValue(double d2) {
            Recorder.this.mAudioAmplitude = d2;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$5 */
    class AnonymousClass5 implements EncoderCallback {
        final /* synthetic */ Consumer val$audioErrorConsumer;
        final /* synthetic */ CallbackToFutureAdapter.Completer val$completer;
        final /* synthetic */ RecordingRecord val$recordingToStart;

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStart() {
        }

        AnonymousClass5(final CallbackToFutureAdapter.Completer completer2, Consumer consumer2, RecordingRecord recordingRecord2) {
            completer = completer2;
            consumer = consumer2;
            recordingRecord = recordingRecord2;
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStop() {
            completer.set(null);
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeError(EncodeException encodeException) {
            if (Recorder.this.mAudioErrorCause == null) {
                consumer.accept(encodeException);
            }
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodedData(EncodedData encodedData) {
            if (Recorder.this.mAudioState == AudioState.DISABLED) {
                encodedData.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            if (Recorder.this.mMediaMuxer == null) {
                if (!Recorder.this.mInProgressRecordingStopping) {
                    Recorder.this.mPendingAudioRingBuffer.enqueue(new BufferCopiedEncodedData(encodedData));
                    if (Recorder.this.mPendingFirstVideoData != null) {
                        Logger.d(Recorder.TAG, "Received audio data. Starting muxer...");
                        Recorder.this.setupAndStartMediaMuxer(recordingRecord);
                    } else {
                        Logger.d(Recorder.TAG, "Cached audio data while we wait for video keyframe before starting muxer.");
                    }
                } else {
                    Logger.d(Recorder.TAG, "Drop audio data since recording is stopping.");
                }
                encodedData.close();
                return;
            }
            try {
                Recorder.this.writeAudioData(encodedData, recordingRecord);
                if (encodedData != null) {
                    encodedData.close();
                }
            } catch (Throwable th) {
                if (encodedData != null) {
                    try {
                        encodedData.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onOutputConfigUpdate(OutputConfig outputConfig) {
            Recorder.this.mAudioOutputConfig = outputConfig;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$6 */
    class AnonymousClass6 implements FutureCallback<List<Void>> {
        AnonymousClass6() {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(List<Void> list) {
            Logger.d(Recorder.TAG, "Encodings end successfully.");
            Recorder recorder = Recorder.this;
            recorder.finalizeInProgressRecording(recorder.mRecordingStopError, Recorder.this.mRecordingStopErrorCause);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            Preconditions.checkState(Recorder.this.mInProgressRecording != null, "In-progress recording shouldn't be null");
            if (Recorder.this.mInProgressRecording.isPersistent()) {
                return;
            }
            Logger.d(Recorder.TAG, "Encodings end with error: " + th);
            Recorder recorder = Recorder.this;
            recorder.finalizeInProgressRecording(recorder.mMediaMuxer == null ? 8 : 6, th);
        }
    }

    void writeVideoData(EncodedData encodedData, RecordingRecord recordingRecord) {
        if (this.mVideoTrackIndex == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = this.mRecordingBytes + encodedData.size();
        long j2 = this.mFileSizeLimitInBytes;
        long j3 = 0;
        if (j2 != 0 && size > j2) {
            Logger.d(TAG, String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(recordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        if (this.mFirstRecordingVideoDataTimeUs == Long.MAX_VALUE) {
            this.mFirstRecordingVideoDataTimeUs = presentationTimeUs;
            Logger.d(TAG, String.format("First video time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.mFirstRecordingVideoDataTimeUs)));
        } else {
            long nanos = TimeUnit.MICROSECONDS.toNanos(presentationTimeUs - Math.min(this.mFirstRecordingVideoDataTimeUs, this.mFirstRecordingAudioDataTimeUs));
            Preconditions.checkState(this.mPreviousRecordingVideoDataTimeUs != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = TimeUnit.MICROSECONDS.toNanos(presentationTimeUs - this.mPreviousRecordingVideoDataTimeUs) + nanos;
            long j4 = this.mDurationLimitNs;
            if (j4 != 0 && nanos2 > j4) {
                Logger.d(TAG, String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.mDurationLimitNs)));
                onInProgressRecordingInternalError(recordingRecord, 9, null);
                return;
            }
            j3 = nanos;
        }
        this.mMediaMuxer.writeSampleData(this.mVideoTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
        this.mRecordingBytes = size;
        this.mRecordingDurationNs = j3;
        this.mPreviousRecordingVideoDataTimeUs = presentationTimeUs;
        updateInProgressStatusEvent();
    }

    void writeAudioData(EncodedData encodedData, RecordingRecord recordingRecord) {
        long size = this.mRecordingBytes + encodedData.size();
        long j2 = this.mFileSizeLimitInBytes;
        if (j2 != 0 && size > j2) {
            Logger.d(TAG, String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(recordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        if (this.mFirstRecordingAudioDataTimeUs == Long.MAX_VALUE) {
            this.mFirstRecordingAudioDataTimeUs = presentationTimeUs;
            Logger.d(TAG, String.format("First audio time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.mFirstRecordingAudioDataTimeUs)));
        } else {
            long nanos = TimeUnit.MICROSECONDS.toNanos(presentationTimeUs - Math.min(this.mFirstRecordingVideoDataTimeUs, this.mFirstRecordingAudioDataTimeUs));
            Preconditions.checkState(this.mPreviousRecordingAudioDataTimeUs != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + TimeUnit.MICROSECONDS.toNanos(presentationTimeUs - this.mPreviousRecordingAudioDataTimeUs);
            long j3 = this.mDurationLimitNs;
            if (j3 != 0 && nanos2 > j3) {
                Logger.d(TAG, String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.mDurationLimitNs)));
                onInProgressRecordingInternalError(recordingRecord, 9, null);
                return;
            }
        }
        this.mMediaMuxer.writeSampleData(this.mAudioTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
        this.mRecordingBytes = size;
        this.mPreviousRecordingAudioDataTimeUs = presentationTimeUs;
    }

    /* JADX INFO: renamed from: pauseInternal */
    public void m263lambda$pause$3$androidxcameravideoRecorder(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        if (isAudioEnabled()) {
            this.mAudioEncoder.pause();
        }
        this.mVideoEncoder.pause();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.pause(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    /* JADX INFO: renamed from: resumeInternal */
    public void m264lambda$resume$4$androidxcameravideoRecorder(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording == recordingRecord && !this.mInProgressRecordingStopping) {
            if (isAudioEnabled()) {
                this.mAudioEncoder.start();
            }
            Encoder encoder = this.mVideoEncoder;
            if (encoder != null) {
                encoder.start();
                RecordingRecord recordingRecord2 = this.mInProgressRecording;
                recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.resume(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
                return;
            }
            this.mShouldSendResumeEvent = true;
        }
    }

    /* JADX INFO: renamed from: stopInternal */
    public void m267lambda$stop$5$androidxcameravideoRecorder(RecordingRecord recordingRecord, long j2, int i2, Throwable th) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        this.mInProgressRecordingStopping = true;
        this.mRecordingStopError = i2;
        this.mRecordingStopErrorCause = th;
        if (isAudioEnabled()) {
            clearPendingAudioRingBuffer();
            this.mAudioEncoder.stop(j2);
        }
        EncodedData encodedData = this.mPendingFirstVideoData;
        if (encodedData != null) {
            encodedData.close();
            this.mPendingFirstVideoData = null;
        }
        if (this.mSourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING) {
            final Encoder encoder = this.mVideoEncoder;
            this.mSourceNonStreamingTimeout = scheduleTask(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    Recorder.lambda$stopInternal$13(encoder);
                }
            }, this.mSequentialExecutor, 1000L, TimeUnit.MILLISECONDS);
        } else {
            notifyEncoderSourceStopped(this.mVideoEncoder);
        }
        this.mVideoEncoder.stop(j2);
    }

    static /* synthetic */ void lambda$stopInternal$13(Encoder encoder) {
        Logger.d(TAG, "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (DeviceQuirks.get(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            notifyEncoderSourceStopped(encoder);
        }
    }

    /* JADX INFO: renamed from: muteInternal */
    public void m260lambda$mute$6$androidxcameravideoRecorder(RecordingRecord recordingRecord, boolean z2) {
        AudioSource audioSource;
        if (recordingRecord.isMuted() == z2) {
            return;
        }
        recordingRecord.mute(z2);
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping || (audioSource = this.mAudioSource) == null) {
            return;
        }
        audioSource.mute(z2);
    }

    static void notifyEncoderSourceStopped(Encoder encoder) {
        if (encoder instanceof EncoderImpl) {
            ((EncoderImpl) encoder).signalSourceStopped();
        }
    }

    private void clearPendingAudioRingBuffer() {
        while (!this.mPendingAudioRingBuffer.isEmpty()) {
            this.mPendingAudioRingBuffer.dequeue();
        }
    }

    private void reset() {
        if (this.mAudioEncoder != null) {
            Logger.d(TAG, "Releasing audio encoder.");
            this.mAudioEncoder.release();
            this.mAudioEncoder = null;
            this.mAudioOutputConfig = null;
        }
        if (this.mAudioSource != null) {
            releaseCurrentAudioSource();
        }
        setAudioState(AudioState.INITIALIZING);
        resetVideo();
    }

    private void tryReleaseVideoEncoder() {
        VideoEncoderSession videoEncoderSession = this.mVideoEncoderSessionToRelease;
        if (videoEncoderSession != null) {
            Preconditions.checkState(videoEncoderSession.getVideoEncoder() == this.mVideoEncoder);
            Logger.d(TAG, "Releasing video encoder: " + this.mVideoEncoder);
            this.mVideoEncoderSessionToRelease.terminateNow();
            this.mVideoEncoderSessionToRelease = null;
            this.mVideoEncoder = null;
            this.mVideoOutputConfig = null;
            setLatestSurface(null);
            return;
        }
        safeToCloseVideoEncoder();
    }

    private void onResetVideo() {
        boolean z2;
        SurfaceRequest surfaceRequest;
        synchronized (this.mLock) {
            switch (this.mState.ordinal()) {
                case 1:
                case 2:
                    updateNonPendingState(State.CONFIGURING);
                    z2 = true;
                    break;
                case 4:
                case 5:
                case 8:
                    if (isPersistentRecordingInProgress()) {
                        z2 = false;
                        break;
                    }
                case 3:
                case 6:
                case 7:
                    setState(State.CONFIGURING);
                    z2 = true;
                    break;
                default:
                    z2 = true;
                    break;
            }
        }
        this.mNeedsResetBeforeNextStart = false;
        if (!z2 || (surfaceRequest = this.mLatestSurfaceRequest) == null || surfaceRequest.isServiced()) {
            return;
        }
        configureInternal(this.mLatestSurfaceRequest, this.mVideoSourceTimebase, false);
    }

    private void resetVideo() {
        if (this.mVideoEncoder != null) {
            Logger.d(TAG, "Releasing video encoder.");
            tryReleaseVideoEncoder();
        }
        onResetVideo();
    }

    private int internalAudioStateToAudioStatsState(AudioState audioState) {
        int iOrdinal = audioState.ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return 3;
            }
            if (iOrdinal == 5) {
                return 4;
            }
            throw new AssertionError("Invalid internal audio state: " + audioState);
        }
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord == null || !recordingRecord.isMuted()) {
            return this.mIsAudioSourceSilenced ? 2 : 0;
        }
        return 5;
    }

    private StreamInfo.StreamState internalStateToStreamState(State state) {
        return (state == State.RECORDING || (state == State.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) DeviceQuirks.get(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? StreamInfo.StreamState.ACTIVE : StreamInfo.StreamState.INACTIVE;
    }

    boolean isAudioEnabled() {
        return this.mAudioState == AudioState.ENABLED;
    }

    void finalizeInProgressRecording(int i2, Throwable th) {
        VideoRecordEvent.Finalize finalizeFinalizeWithError;
        if (this.mInProgressRecording == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.mMediaMuxer.release();
            } catch (IllegalStateException e2) {
                Logger.e(TAG, "MediaMuxer failed to stop or release with error: " + e2.getMessage());
                if (i2 == 0) {
                    i2 = 1;
                }
            }
            this.mMediaMuxer = null;
        } else if (i2 == 0) {
            i2 = 8;
        }
        this.mInProgressRecording.finalizeRecording(this.mOutputUri);
        OutputOptions outputOptions = this.mInProgressRecording.getOutputOptions();
        RecordingStats inProgressRecordingStats = getInProgressRecordingStats();
        OutputResults outputResultsOf = OutputResults.of(this.mOutputUri);
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (i2 == 0) {
            finalizeFinalizeWithError = VideoRecordEvent.finalize(outputOptions, inProgressRecordingStats, outputResultsOf);
        } else {
            finalizeFinalizeWithError = VideoRecordEvent.finalizeWithError(outputOptions, inProgressRecordingStats, outputResultsOf, i2, th);
        }
        recordingRecord.updateVideoRecordEvent(finalizeFinalizeWithError);
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        this.mInProgressRecording = null;
        this.mInProgressRecordingStopping = false;
        this.mAudioTrackIndex = null;
        this.mVideoTrackIndex = null;
        this.mEncodingFutures.clear();
        this.mOutputUri = Uri.EMPTY;
        this.mRecordingBytes = 0L;
        this.mRecordingDurationNs = 0L;
        this.mFirstRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mFirstRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mRecordingStopError = 1;
        this.mRecordingStopErrorCause = null;
        this.mAudioErrorCause = null;
        this.mAudioAmplitude = 0.0d;
        clearPendingAudioRingBuffer();
        setInProgressTransformationInfo(null);
        int iOrdinal = this.mAudioState.ordinal();
        if (iOrdinal == 1) {
            throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            setAudioState(AudioState.IDLING);
            this.mAudioSource.stop();
        } else if (iOrdinal == 4 || iOrdinal == 5) {
            setAudioState(AudioState.INITIALIZING);
        }
        onRecordingFinalized(recordingRecord2);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0066 A[Catch: all -> 0x00df, TryCatch #0 {, blocks: (B:73:0x0005, B:75:0x0009, B:76:0x001b, B:97:0x0074, B:94:0x0060, B:96:0x0066, B:99:0x0076, B:101:0x007a, B:103:0x0080, B:105:0x0086, B:107:0x008e, B:109:0x0092, B:80:0x0023, B:81:0x0037, B:82:0x0038, B:84:0x003c, B:86:0x0042, B:88:0x0048, B:90:0x0050, B:128:0x00d7, B:129:0x00de), top: B:133:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0076 A[Catch: all -> 0x00df, TryCatch #0 {, blocks: (B:73:0x0005, B:75:0x0009, B:76:0x001b, B:97:0x0074, B:94:0x0060, B:96:0x0066, B:99:0x0076, B:101:0x007a, B:103:0x0080, B:105:0x0086, B:107:0x008e, B:109:0x0092, B:80:0x0023, B:81:0x0037, B:82:0x0038, B:84:0x003c, B:86:0x0042, B:88:0x0048, B:90:0x0050, B:128:0x00d7, B:129:0x00de), top: B:133:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onRecordingFinalized(androidx.camera.video.Recorder.RecordingRecord r11) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.onRecordingFinalized(androidx.camera.video.Recorder$RecordingRecord):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0041 A[Catch: all -> 0x0049, TryCatch #0 {, blocks: (B:34:0x000a, B:35:0x0011, B:36:0x0014, B:38:0x0016, B:39:0x001c, B:47:0x0041, B:48:0x0048, B:45:0x002c, B:46:0x0040), top: B:54:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void onInProgressRecordingInternalError(androidx.camera.video.Recorder.RecordingRecord r8, int r9, java.lang.Throwable r10) {
        /*
            r7 = this;
            java.lang.String r4 = "In-progress recording error occurred while in unexpected state: "
            androidx.camera.video.Recorder$RecordingRecord r0 = r7.mInProgressRecording
            r2 = r8
            if (r2 != r0) goto L4c
            java.lang.Object r3 = r7.mLock
            monitor-enter(r3)
            androidx.camera.video.Recorder$State r0 = r7.mState     // Catch: java.lang.Throwable -> L49
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L49
            r1 = 0
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L1c;
                case 2: goto L1c;
                case 3: goto L2c;
                case 4: goto L16;
                case 5: goto L16;
                case 6: goto L1c;
                case 7: goto L1c;
                case 8: goto L2c;
                default: goto L14;
            }     // Catch: java.lang.Throwable -> L49
        L14:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            goto L21
        L16:
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.STOPPING     // Catch: java.lang.Throwable -> L49
            r7.setState(r0)     // Catch: java.lang.Throwable -> L49
            r1 = 1
        L1c:
            androidx.camera.video.Recorder$RecordingRecord r0 = r7.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L49
            if (r2 != r0) goto L41
            goto L14
        L21:
            if (r1 == 0) goto L2b
            r3 = -1
            r1 = r7
            r6 = r10
            r5 = r9
            r1.m267lambda$stop$5$androidxcameravideoRecorder(r2, r3, r5, r6)
        L2b:
            return
        L2c:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L49
            androidx.camera.video.Recorder$State r0 = r7.mState     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L49
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L49
            throw r2     // Catch: java.lang.Throwable -> L49
        L41:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "Internal error occurred for recording but it is not the active recording."
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L49
            throw r1     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            throw r0
        L4c:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r0 = "Internal error occurred on recording that is not the current in-progress recording."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.onInProgressRecordingInternalError(androidx.camera.video.Recorder$RecordingRecord, int, java.lang.Throwable):void");
    }

    void tryServicePendingRecording() {
        boolean z2;
        RecordingRecord recordingRecordMakePendingRecordingActiveLocked;
        int i2;
        RecordingRecord recordingRecord;
        Throwable th;
        synchronized (this.mLock) {
            int iOrdinal = this.mState.ordinal();
            boolean z3 = true;
            z2 = false;
            recordingRecordMakePendingRecordingActiveLocked = null;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    i2 = 0;
                    recordingRecord = null;
                }
                th = recordingRecord;
            } else {
                z3 = false;
            }
            if (this.mActiveRecordingRecord == null && !this.mNeedsResetBeforeNextStart) {
                if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                    recordingRecord = this.mPendingRecordingRecord;
                    this.mPendingRecordingRecord = null;
                    restoreNonPendingState();
                    th = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                    i2 = 4;
                    z2 = z3;
                } else if (this.mVideoEncoder != null) {
                    i2 = 0;
                    z2 = z3;
                    th = null;
                    recordingRecordMakePendingRecordingActiveLocked = makePendingRecordingActiveLocked(this.mState);
                    recordingRecord = null;
                }
            }
            i2 = 0;
            recordingRecord = null;
            z2 = z3;
            th = recordingRecord;
        }
        if (recordingRecordMakePendingRecordingActiveLocked != null) {
            startRecording(recordingRecordMakePendingRecordingActiveLocked, z2);
        } else if (recordingRecord != null) {
            finalizePendingRecording(recordingRecord, i2, th);
        }
    }

    private RecordingRecord makePendingRecordingActiveLocked(State state) {
        boolean z2;
        if (state == State.PENDING_PAUSED) {
            z2 = true;
        } else {
            if (state != State.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z2 = false;
        }
        if (this.mActiveRecordingRecord != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        RecordingRecord recordingRecord = this.mPendingRecordingRecord;
        if (recordingRecord == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.mActiveRecordingRecord = recordingRecord;
        recordingRecord.getRecordingState().addObserver(CameraXExecutors.directExecutor(), new Observable.Observer<Boolean>() { // from class: androidx.camera.video.Recorder.7
            AnonymousClass7() {
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public void onNewData(Boolean bool) {
                Recorder.this.mIsRecording.setState(bool);
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public void onError(Throwable th) {
                Recorder.this.mIsRecording.setError(th);
            }
        });
        this.mPendingRecordingRecord = null;
        if (z2) {
            setState(State.PAUSED);
        } else {
            setState(State.RECORDING);
        }
        return recordingRecord;
    }

    /* JADX INFO: renamed from: androidx.camera.video.Recorder$7 */
    class AnonymousClass7 implements Observable.Observer<Boolean> {
        AnonymousClass7() {
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onNewData(Boolean bool) {
            Recorder.this.mIsRecording.setState(bool);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(Throwable th) {
            Recorder.this.mIsRecording.setError(th);
        }
    }

    private void startRecording(RecordingRecord recordingRecord, boolean z2) {
        startInternal(recordingRecord);
        if (z2) {
            m263lambda$pause$3$androidxcameravideoRecorder(recordingRecord);
        }
    }

    void updateInProgressStatusEvent() {
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord != null) {
            recordingRecord.updateVideoRecordEvent(VideoRecordEvent.status(recordingRecord.getOutputOptions(), getInProgressRecordingStats()));
        }
    }

    RecordingStats getInProgressRecordingStats() {
        return RecordingStats.of(this.mRecordingDurationNs, this.mRecordingBytes, AudioStats.of(internalAudioStateToAudioStatsState(this.mAudioState), this.mAudioErrorCause, this.mAudioAmplitude));
    }

    <T> T getObservableData(StateObservable<T> stateObservable) {
        try {
            return stateObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    boolean isAudioSupported() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getChannelCount() != 0;
    }

    void setState(State state) {
        if (this.mState == state) {
            throw new AssertionError("Attempted to transition to state " + state + ", but Recorder is already in state " + state);
        }
        Logger.d(TAG, "Transitioning Recorder internal state: " + this.mState + " --> " + state);
        Set<State> set = PENDING_STATES;
        StreamInfo.StreamState streamStateInternalStateToStreamState = null;
        if (set.contains(state)) {
            if (!set.contains(this.mState)) {
                if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(this.mState)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.mState);
                }
                State state2 = this.mState;
                this.mNonPendingState = state2;
                streamStateInternalStateToStreamState = internalStateToStreamState(state2);
            }
        } else if (this.mNonPendingState != null) {
            this.mNonPendingState = null;
        }
        this.mState = state;
        if (streamStateInternalStateToStreamState == null) {
            streamStateInternalStateToStreamState = internalStateToStreamState(state);
        }
        this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, streamStateInternalStateToStreamState, this.mInProgressTransformationInfo));
    }

    void setLatestSurface(Surface surface) {
        if (this.mLatestSurface == surface) {
            return;
        }
        this.mLatestSurface = surface;
        synchronized (this.mLock) {
            setStreamId(surface != null ? surface.hashCode() : 0);
        }
    }

    private void setStreamId(int i2) {
        if (this.mStreamId == i2) {
            return;
        }
        Logger.d(TAG, "Transitioning streamId: " + this.mStreamId + " --> " + i2);
        this.mStreamId = i2;
        this.mStreamInfo.setState(StreamInfo.of(i2, internalStateToStreamState(this.mState), this.mInProgressTransformationInfo));
    }

    void setInProgressTransformationInfo(SurfaceRequest.TransformationInfo transformationInfo) {
        Logger.d(TAG, "Update stream transformation info: " + transformationInfo);
        this.mInProgressTransformationInfo = transformationInfo;
        synchronized (this.mLock) {
            this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, internalStateToStreamState(this.mState), transformationInfo));
        }
    }

    private void updateNonPendingState(State state) {
        if (!PENDING_STATES.contains(this.mState)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.mState);
        }
        if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(state)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + state);
        }
        if (this.mNonPendingState != state) {
            this.mNonPendingState = state;
            this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, internalStateToStreamState(state), this.mInProgressTransformationInfo));
        }
    }

    private void restoreNonPendingState() {
        if (!PENDING_STATES.contains(this.mState)) {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.mState);
        }
        setState(this.mNonPendingState);
    }

    void setAudioState(AudioState audioState) {
        Logger.d(TAG, "Transitioning audio state: " + this.mAudioState + " --> " + audioState);
        this.mAudioState = audioState;
    }

    public static ScheduledFuture<?> scheduleTask(final Runnable runnable, final Executor executor, long j2, TimeUnit timeUnit) {
        return CameraXExecutors.mainThreadExecutor().schedule(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        }, j2, timeUnit);
    }

    private static int supportedMuxerFormatOrDefaultFrom(VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, int i2) {
        if (videoValidatedEncoderProfilesProxy != null) {
            int recommendedFileFormat = videoValidatedEncoderProfilesProxy.getRecommendedFileFormat();
            if (recommendedFileFormat == 1) {
                return 2;
            }
            if (recommendedFileFormat == 2) {
                return 0;
            }
            if (recommendedFileFormat == 9) {
                return 1;
            }
        }
        return i2;
    }

    public static VideoCapabilities getVideoCapabilities(CameraInfo cameraInfo) {
        return getVideoCapabilities(cameraInfo, 0);
    }

    public static VideoCapabilities getVideoCapabilities(CameraInfo cameraInfo, int i2) {
        return new RecorderVideoCapabilities(i2, (CameraInfoInternal) cameraInfo, VideoEncoderInfoImpl.FINDER);
    }

    /* JADX INFO: loaded from: classes2.dex */
    static abstract class RecordingRecord implements AutoCloseable {
        private final CloseGuardHelper mCloseGuard = CloseGuardHelper.create();
        private final AtomicBoolean mInitialized = new AtomicBoolean(false);
        private final AtomicReference<MediaMuxerSupplier> mMediaMuxerSupplier = new AtomicReference<>(null);
        private final AtomicReference<AudioSourceSupplier> mAudioSourceSupplier = new AtomicReference<>(null);
        private final AtomicReference<Consumer<Uri>> mRecordingFinalizer = new AtomicReference<>(new Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda5
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                Recorder.RecordingRecord.lambda$new$0((Uri) obj);
            }
        });
        private final AtomicBoolean mMuted = new AtomicBoolean(false);
        private final MutableStateObservable<Boolean> mRecordingState = MutableStateObservable.withInitialState(false);

        /* JADX INFO: loaded from: classes.dex */
        private interface AudioSourceSupplier {
            AudioSource get(AudioSettings audioSettings, Executor executor) throws AudioSourceAccessException;
        }

        /* JADX INFO: loaded from: classes.dex */
        interface MediaMuxerSupplier {
            MediaMuxer get(int i2, Consumer<Uri> consumer) throws IOException;
        }

        static /* synthetic */ void lambda$new$0(Uri uri) {
        }

        abstract Executor getCallbackExecutor();

        abstract Consumer<VideoRecordEvent> getEventListener();

        abstract OutputOptions getOutputOptions();

        abstract long getRecordingId();

        abstract boolean hasAudioEnabled();

        abstract boolean isPersistent();

        RecordingRecord() {
        }

        static RecordingRecord from(PendingRecording pendingRecording, long j2) {
            return new AutoValue_Recorder_RecordingRecord(pendingRecording.getOutputOptions(), pendingRecording.getListenerExecutor(), pendingRecording.getEventListener(), pendingRecording.isAudioEnabled(), pendingRecording.isPersistent(), j2);
        }

        void initializeRecording(final Context context) throws IOException {
            if (this.mInitialized.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final OutputOptions outputOptions = getOutputOptions();
            boolean z2 = outputOptions instanceof FileDescriptorOutputOptions;
            Consumer<Uri> consumer = null;
            final ParcelFileDescriptor parcelFileDescriptorDup = z2 ? ((FileDescriptorOutputOptions) outputOptions).getParcelFileDescriptor().dup() : null;
            this.mCloseGuard.open("finalizeRecording");
            this.mMediaMuxerSupplier.set(new MediaMuxerSupplier() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda0
                @Override // androidx.camera.video.Recorder.RecordingRecord.MediaMuxerSupplier
                public final MediaMuxer get(int i2, Consumer consumer2) {
                    return Recorder.RecordingRecord.lambda$initializeRecording$1(outputOptions, parcelFileDescriptorDup, i2, consumer2);
                }
            });
            if (hasAudioEnabled()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.mAudioSourceSupplier.set(new AudioSourceSupplier() { // from class: androidx.camera.video.Recorder.RecordingRecord.1
                        final /* synthetic */ Context val$context;

                        AnonymousClass1(final Context context2) {
                            context = context2;
                        }

                        @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
                        public AudioSource get(AudioSettings audioSettings, Executor executor) throws AudioSourceAccessException {
                            return new AudioSource(audioSettings, executor, context);
                        }
                    });
                } else {
                    this.mAudioSourceSupplier.set(new AudioSourceSupplier() { // from class: androidx.camera.video.Recorder.RecordingRecord.2
                        AnonymousClass2() {
                        }

                        @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
                        public AudioSource get(AudioSettings audioSettings, Executor executor) throws AudioSourceAccessException {
                            return new AudioSource(audioSettings, executor, null);
                        }
                    });
                }
            }
            if (outputOptions instanceof MediaStoreOutputOptions) {
                final MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                if (Build.VERSION.SDK_INT >= 29) {
                    consumer = new Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda1
                        @Override // androidx.core.util.Consumer
                        public final void accept(Object obj) {
                            Recorder.RecordingRecord.lambda$initializeRecording$2(mediaStoreOutputOptions, (Uri) obj);
                        }
                    };
                } else {
                    consumer = new Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda2
                        @Override // androidx.core.util.Consumer
                        public final void accept(Object obj) throws Throwable {
                            Recorder.RecordingRecord.lambda$initializeRecording$4(mediaStoreOutputOptions, context2, (Uri) obj);
                        }
                    };
                }
            } else if (z2) {
                consumer = new Consumer() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda3
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        Recorder.RecordingRecord.lambda$initializeRecording$5(parcelFileDescriptorDup, (Uri) obj);
                    }
                };
            }
            if (consumer != null) {
                this.mRecordingFinalizer.set(consumer);
            }
        }

        static /* synthetic */ MediaMuxer lambda$initializeRecording$1(OutputOptions outputOptions, ParcelFileDescriptor parcelFileDescriptor, int i2, Consumer consumer) throws IOException {
            MediaMuxer mediaMuxerCreateMediaMuxer;
            Uri uriInsert = Uri.EMPTY;
            if (outputOptions instanceof FileOutputOptions) {
                File file = ((FileOutputOptions) outputOptions).getFile();
                if (!OutputUtil.createParentFolder(file)) {
                    Logger.w(Recorder.TAG, "Failed to create folder for " + file.getAbsolutePath());
                }
                mediaMuxerCreateMediaMuxer = new MediaMuxer(file.getAbsolutePath(), i2);
                uriInsert = Uri.fromFile(file);
            } else if (outputOptions instanceof FileDescriptorOutputOptions) {
                mediaMuxerCreateMediaMuxer = Api26Impl.createMediaMuxer(parcelFileDescriptor.getFileDescriptor(), i2);
            } else if (outputOptions instanceof MediaStoreOutputOptions) {
                MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                ContentValues contentValues = new ContentValues(mediaStoreOutputOptions.getContentValues());
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues.put("is_pending", (Integer) 1);
                }
                try {
                    uriInsert = mediaStoreOutputOptions.getContentResolver().insert(mediaStoreOutputOptions.getCollectionUri(), contentValues);
                    if (uriInsert == null) {
                        throw new IOException("Unable to create MediaStore entry.");
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = mediaStoreOutputOptions.getContentResolver().openFileDescriptor(uriInsert, "rw");
                    mediaMuxerCreateMediaMuxer = Api26Impl.createMediaMuxer(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), i2);
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (RuntimeException e2) {
                    throw new IOException("Unable to create MediaStore entry by " + e2, e2);
                }
            } else {
                throw new AssertionError("Invalid output options type: " + outputOptions.getClass().getSimpleName());
            }
            consumer.accept(uriInsert);
            return mediaMuxerCreateMediaMuxer;
        }

        /* JADX INFO: renamed from: androidx.camera.video.Recorder$RecordingRecord$1 */
        /* JADX INFO: loaded from: classes.dex */
        class AnonymousClass1 implements AudioSourceSupplier {
            final /* synthetic */ Context val$context;

            AnonymousClass1(final Context context2) {
                context = context2;
            }

            @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
            public AudioSource get(AudioSettings audioSettings, Executor executor) throws AudioSourceAccessException {
                return new AudioSource(audioSettings, executor, context);
            }
        }

        /* JADX INFO: renamed from: androidx.camera.video.Recorder$RecordingRecord$2 */
        /* JADX INFO: loaded from: classes.dex */
        class AnonymousClass2 implements AudioSourceSupplier {
            AnonymousClass2() {
            }

            @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
            public AudioSource get(AudioSettings audioSettings, Executor executor) throws AudioSourceAccessException {
                return new AudioSource(audioSettings, executor, null);
            }
        }

        static /* synthetic */ void lambda$initializeRecording$2(MediaStoreOutputOptions mediaStoreOutputOptions, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_pending", (Integer) 0);
            mediaStoreOutputOptions.getContentResolver().update(uri, contentValues, null, null);
        }

        static /* synthetic */ void lambda$initializeRecording$4(MediaStoreOutputOptions mediaStoreOutputOptions, Context context, Uri uri) throws Throwable {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            String absolutePathFromUri = OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), uri, Recorder.MEDIA_COLUMN);
            if (absolutePathFromUri != null) {
                MediaScannerConnection.scanFile(context, new String[]{absolutePathFromUri}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda4
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri2) {
                        Recorder.RecordingRecord.lambda$initializeRecording$3(str, uri2);
                    }
                });
            } else {
                Logger.d(Recorder.TAG, "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
            }
        }

        static /* synthetic */ void lambda$initializeRecording$3(String str, Uri uri) {
            if (uri == null) {
                Logger.e(Recorder.TAG, String.format("File scanning operation failed [path: %s]", str));
            } else {
                Logger.d(Recorder.TAG, String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        static /* synthetic */ void lambda$initializeRecording$5(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e2) {
                Logger.e(Recorder.TAG, "Failed to close dup'd ParcelFileDescriptor", e2);
            }
        }

        void updateVideoRecordEvent(final VideoRecordEvent videoRecordEvent) {
            if (!Objects.equals(videoRecordEvent.getOutputOptions(), getOutputOptions())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + videoRecordEvent.getOutputOptions() + ", Expected: " + getOutputOptions() + "]");
            }
            String str = "Sending VideoRecordEvent " + videoRecordEvent.getClass().getSimpleName();
            if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                VideoRecordEvent.Finalize finalize = (VideoRecordEvent.Finalize) videoRecordEvent;
                if (finalize.hasError()) {
                    str = str + String.format(" [error: %s]", VideoRecordEvent.Finalize.errorToString(finalize.getError()));
                }
            }
            Logger.d(Recorder.TAG, str);
            updateRecordingState(videoRecordEvent);
            if (getCallbackExecutor() == null || getEventListener() == null) {
                return;
            }
            try {
                getCallbackExecutor().execute(new Runnable() { // from class: androidx.camera.video.Recorder$RecordingRecord$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m271x1386b2b0(videoRecordEvent);
                    }
                });
            } catch (RejectedExecutionException e2) {
                Logger.e(Recorder.TAG, "The callback executor is invalid.", e2);
            }
        }

        /* JADX INFO: renamed from: lambda$updateVideoRecordEvent$6$androidx-camera-video-Recorder$RecordingRecord */
        /* synthetic */ void m271x1386b2b0(VideoRecordEvent videoRecordEvent) {
            getEventListener().accept(videoRecordEvent);
        }

        private void updateRecordingState(VideoRecordEvent videoRecordEvent) {
            if ((videoRecordEvent instanceof VideoRecordEvent.Start) || (videoRecordEvent instanceof VideoRecordEvent.Resume)) {
                this.mRecordingState.setState(true);
            } else if ((videoRecordEvent instanceof VideoRecordEvent.Pause) || (videoRecordEvent instanceof VideoRecordEvent.Finalize)) {
                this.mRecordingState.setState(false);
            }
        }

        StateObservable<Boolean> getRecordingState() {
            return this.mRecordingState;
        }

        AudioSource performOneTimeAudioSourceCreation(AudioSettings audioSettings, Executor executor) throws AudioSourceAccessException {
            if (!hasAudioEnabled()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            AudioSourceSupplier andSet = this.mAudioSourceSupplier.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
            }
            return andSet.get(audioSettings, executor);
        }

        MediaMuxer performOneTimeMediaMuxerCreation(int i2, Consumer<Uri> consumer) throws IOException {
            if (!this.mInitialized.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            MediaMuxerSupplier andSet = this.mMediaMuxerSupplier.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return andSet.get(i2, consumer);
            } catch (RuntimeException e2) {
                throw new IOException("Failed to create MediaMuxer by " + e2, e2);
            }
        }

        void finalizeRecording(Uri uri) {
            if (this.mInitialized.get()) {
                finalizeRecordingInternal(this.mRecordingFinalizer.getAndSet(null), uri);
            }
        }

        void mute(boolean z2) {
            this.mMuted.set(z2);
        }

        boolean isMuted() {
            return this.mMuted.get();
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            finalizeRecording(Uri.EMPTY);
        }

        protected void finalize() throws Throwable {
            try {
                this.mCloseGuard.warnIfOpen();
                Consumer<Uri> andSet = this.mRecordingFinalizer.getAndSet(null);
                if (andSet != null) {
                    finalizeRecordingInternal(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        private void finalizeRecordingInternal(Consumer<Uri> consumer, Uri uri) {
            if (consumer == null) {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
            this.mCloseGuard.close();
            consumer.accept(uri);
        }
    }

    public static final class Builder {
        private int mVideoCapabilitiesSource = 0;
        private Executor mExecutor = null;
        private EncoderFactory mVideoEncoderFactory = Recorder.DEFAULT_ENCODER_FACTORY;
        private EncoderFactory mAudioEncoderFactory = Recorder.DEFAULT_ENCODER_FACTORY;
        private final MediaSpec.Builder mMediaSpecBuilder = MediaSpec.builder();

        public Builder setExecutor(Executor executor) {
            Preconditions.checkNotNull(executor, "The specified executor can't be null.");
            this.mExecutor = executor;
            return this;
        }

        public Builder setQualitySelector(final QualitySelector qualitySelector) {
            Preconditions.checkNotNull(qualitySelector, "The specified quality selector can't be null.");
            this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda3
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setQualitySelector(qualitySelector);
                }
            });
            return this;
        }

        public Builder setVideoCapabilitiesSource(int i2) {
            boolean z2 = true;
            if (i2 != 0 && i2 != 1) {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "Not a supported video capabilities source: " + i2);
            this.mVideoCapabilitiesSource = i2;
            return this;
        }

        public Builder setTargetVideoEncodingBitRate(final int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The requested target bitrate " + i2 + " is not supported. Target bitrate must be greater than 0.");
            }
            this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    int i3 = i2;
                    ((VideoSpec.Builder) obj).setBitrate(new Range<>(Integer.valueOf(i3), Integer.valueOf(i3)));
                }
            });
            return this;
        }

        public Builder setAspectRatio(final int i2) {
            this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda2
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setAspectRatio(i2);
                }
            });
            return this;
        }

        public Builder setAudioSource(final int i2) {
            this.mMediaSpecBuilder.configureAudio(new Consumer() { // from class: androidx.camera.video.Recorder$Builder$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((AudioSpec.Builder) obj).setSource(i2);
                }
            });
            return this;
        }

        Builder setVideoEncoderFactory(EncoderFactory encoderFactory) {
            this.mVideoEncoderFactory = encoderFactory;
            return this;
        }

        Builder setAudioEncoderFactory(EncoderFactory encoderFactory) {
            this.mAudioEncoderFactory = encoderFactory;
            return this;
        }

        public Recorder build() {
            return new Recorder(this.mExecutor, this.mMediaSpecBuilder.build(), this.mVideoCapabilitiesSource, this.mVideoEncoderFactory, this.mAudioEncoderFactory);
        }
    }
}
