package com.hbisoft.hbrecorder;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.hardware.display.VirtualDisplay;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.crash.StacktraceProcessorFactory;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import yg.C1499aX;
import yg.C1561oA;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
public class ScreenRecordService extends Service {
    public static final String BUNDLED_LISTENER = "listener";
    private static final String TAG = "ScreenRecordService";
    private static String fileName = null;
    private static String filePath = null;
    private int audioBitrate;
    private int audioSamplingRate;
    private int audioSourceAsInt;
    private boolean isAudioEnabled;
    private boolean isCustomSettingsEnabled;
    private boolean isVideoHD;
    private Intent mIntent;
    private MediaProjection mMediaProjection;
    private MediaRecorder mMediaRecorder;
    private int mResultCode;
    private Intent mResultData;
    private int mScreenDensity;
    private int mScreenHeight;
    private int mScreenWidth;
    private VirtualDisplay mVirtualDisplay;
    private String name;
    private int orientationHint;
    private String outputFormat;
    private int outputFormatAsInt;
    private String path;
    private int videoBitrate;
    private int videoEncoderAsInt;
    private int videoFrameRate;
    private long maxFileSize = 0;
    private boolean hasMaxFileBeenReached = false;
    private Uri returnedUri = null;

    private void callOnComplete() {
        Intent intent = this.mIntent;
        if (intent != null) {
            ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("listener");
            Bundle bundle = new Bundle();
            bundle.putString(Constants.ON_COMPLETE_KEY, Constants.ON_COMPLETE);
            if (resultReceiver != null) {
                resultReceiver.send(-1, bundle);
            }
        }
    }

    private String getExtension(String str) {
        str.hashCode();
        switch (str) {
            case "MPEG_2_TS":
                return ".ts";
            case "OGG":
                return ".ogg";
            case "WEBM":
                return ".webm";
            case "AAC_ADTS":
                return ".aac";
            case "THREE_GPP":
                return ".3gp";
            case "AMR_NB":
            case "AMR_WB":
                return ".amr";
            default:
                return ".mp4";
        }
    }

    public static String getFileName() {
        return fileName;
    }

    public static String getFilePath() {
        return filePath;
    }

    private void initMediaProjection() throws Throwable {
        this.mMediaProjection = ((MediaProjectionManager) Objects.requireNonNull(getSystemService(C1561oA.od("[RPTKHXYUOIFVJOM", (short) (Od.Xd() ^ (-30715)))))).getMediaProjection(this.mResultCode, this.mResultData);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Kd("#1(750,v9>y\u0019=>@6D", (short) (C1499aX.Xd() ^ (-22292)))).getDeclaredMethod(Wg.Zd("\u0005.\u001a`O\u0005g01\u001e>\u001d\u0007", (short) (ZN.Xd() ^ 4596), (short) (ZN.Xd() ^ 4676)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            if (Build.VERSION.SDK_INT >= 34) {
                this.mMediaProjection.registerCallback(new MediaProjection.Callback() { // from class: com.hbisoft.hbrecorder.ScreenRecordService.3
                    @Override // android.media.projection.MediaProjection.Callback
                    public void onStop() {
                        super.onStop();
                    }
                }, handler);
            } else {
                this.mMediaProjection.registerCallback(new MediaProjection.Callback() { // from class: com.hbisoft.hbrecorder.ScreenRecordService.4
                }, handler);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void initRecorder() throws Exception {
        String strReplace = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.getDefault()).format((Date) new java.sql.Date(System.currentTimeMillis())).replace(Global.BLANK, "");
        String str = !this.isVideoHD ? "SD" : "HD";
        if (this.name == null) {
            this.name = str + strReplace;
        }
        filePath = this.path + RemoteSettings.FORWARD_SLASH_STRING + this.name + ".mp4";
        fileName = this.name + ".mp4";
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.mMediaRecorder = mediaRecorder;
        if (this.isAudioEnabled) {
            mediaRecorder.setAudioSource(this.audioSourceAsInt);
        }
        this.mMediaRecorder.setVideoSource(2);
        this.mMediaRecorder.setOutputFormat(this.outputFormatAsInt);
        int i2 = this.orientationHint;
        if (i2 != 400) {
            this.mMediaRecorder.setOrientationHint(i2);
        }
        if (this.isAudioEnabled) {
            this.mMediaRecorder.setAudioEncoder(3);
            this.mMediaRecorder.setAudioEncodingBitRate(this.audioBitrate);
            this.mMediaRecorder.setAudioSamplingRate(this.audioSamplingRate);
        }
        this.mMediaRecorder.setVideoEncoder(this.videoEncoderAsInt);
        if (this.returnedUri != null) {
            try {
                this.mMediaRecorder.setOutputFile(((ParcelFileDescriptor) Objects.requireNonNull(getContentResolver().openFileDescriptor(this.returnedUri, "rw"))).getFileDescriptor());
            } catch (Exception e2) {
                ResultReceiver resultReceiver = (ResultReceiver) this.mIntent.getParcelableExtra("listener");
                Bundle bundle = new Bundle();
                bundle.putString(Constants.ERROR_REASON_KEY, Log.getStackTraceString(e2));
                if (resultReceiver != null) {
                    resultReceiver.send(-1, bundle);
                }
            }
        } else {
            if (this.outputFormat != null) {
                filePath = this.path + RemoteSettings.FORWARD_SLASH_STRING + this.name + getExtension(this.outputFormat);
                fileName = this.name + getExtension(this.outputFormat);
            } else {
                filePath = this.path + RemoteSettings.FORWARD_SLASH_STRING + this.name + ".mp4";
                fileName = this.name + ".mp4";
            }
            this.mMediaRecorder.setOutputFile(filePath);
        }
        this.mMediaRecorder.setVideoSize(this.mScreenWidth, this.mScreenHeight);
        if (this.isCustomSettingsEnabled) {
            this.mMediaRecorder.setVideoEncodingBitRate(this.videoBitrate);
            this.mMediaRecorder.setVideoFrameRate(this.videoFrameRate);
        } else if (this.isVideoHD) {
            this.mMediaRecorder.setVideoEncodingBitRate(this.mScreenWidth * 5 * this.mScreenHeight);
            this.mMediaRecorder.setVideoFrameRate(60);
        } else {
            this.mMediaRecorder.setVideoEncodingBitRate(12000000);
            this.mMediaRecorder.setVideoFrameRate(30);
        }
        long j2 = this.maxFileSize;
        if (j2 > 0) {
            this.mMediaRecorder.setMaxFileSize(j2);
        }
        this.mMediaRecorder.prepare();
    }

    private void initVirtualDisplay() {
        MediaProjection mediaProjection = this.mMediaProjection;
        if (mediaProjection == null) {
            return;
        }
        this.mVirtualDisplay = mediaProjection.createVirtualDisplay(TAG, this.mScreenWidth, this.mScreenHeight, this.mScreenDensity, 16, this.mMediaRecorder.getSurface(), null, null);
    }

    private void pauseRecording() {
        this.mMediaRecorder.pause();
        ResultReceiver resultReceiver = (ResultReceiver) this.mIntent.getParcelableExtra("listener");
        Bundle bundle = new Bundle();
        bundle.putString(Constants.ON_PAUSE_KEY, Constants.ON_PAUSE);
        if (resultReceiver != null) {
            resultReceiver.send(-1, bundle);
        }
    }

    private void resetAll() {
        stopForeground(true);
        VirtualDisplay virtualDisplay = this.mVirtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.mVirtualDisplay = null;
        }
        MediaRecorder mediaRecorder = this.mMediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.setOnErrorListener(null);
            this.mMediaRecorder.reset();
        }
        MediaProjection mediaProjection = this.mMediaProjection;
        if (mediaProjection != null) {
            mediaProjection.stop();
            this.mMediaProjection = null;
        }
    }

    private void resumeRecording() {
        this.mMediaRecorder.resume();
        ResultReceiver resultReceiver = (ResultReceiver) this.mIntent.getParcelableExtra("listener");
        Bundle bundle = new Bundle();
        bundle.putString(Constants.ON_RESUME_KEY, Constants.ON_RESUME);
        if (resultReceiver != null) {
            resultReceiver.send(-1, bundle);
        }
    }

    private void setAudioSourceAsInt(String str) {
        str.hashCode();
        switch (str) {
            case "DEFAULT":
                this.audioSourceAsInt = 0;
                break;
            case "VOICE_PERFORMANCE":
                this.audioSourceAsInt = 10;
                break;
            case "VOICE_CALL":
                this.audioSourceAsInt = 4;
                break;
            case "MIC":
                this.audioSourceAsInt = 1;
                break;
            case "VOICE_DOWNLINK":
                this.audioSourceAsInt = 3;
                break;
            case "CAMCODER":
                this.audioSourceAsInt = 5;
                break;
            case "VOICE_RECOGNITION":
                this.audioSourceAsInt = 6;
                break;
            case "VOICE_UPLINK":
                this.audioSourceAsInt = 2;
                break;
            case "UNPROCESSED":
                this.audioSourceAsInt = 9;
                break;
            case "VOICE_COMMUNICATION":
                this.audioSourceAsInt = 7;
                break;
            case "REMOTE_SUBMIX":
                this.audioSourceAsInt = 8;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setOutputFormatAsInt(java.lang.String r9) {
        /*
            r8 = this;
            int r0 = r9.hashCode()
            r7 = 2
            r6 = 8
            r5 = 6
            r4 = 4
            r3 = 3
            r2 = 1
            r1 = 0
            switch(r0) {
                case -2032180703: goto L32;
                case -2014514182: goto L3c;
                case -813934554: goto L46;
                case 78191: goto L50;
                case 2660249: goto L5a;
                case 1179611262: goto L64;
                case 1228866118: goto L6e;
                case 1934542573: goto L78;
                case 1934542852: goto L82;
                default: goto Lf;
            }
        Lf:
            r0 = -1
        L10:
            switch(r0) {
                case 0: goto L16;
                case 1: goto L19;
                case 2: goto L1c;
                case 3: goto L1f;
                case 4: goto L22;
                case 5: goto L25;
                case 6: goto L28;
                case 7: goto L2d;
                default: goto L13;
            }
        L13:
            r8.outputFormatAsInt = r7
        L15:
            return
        L16:
            r8.outputFormatAsInt = r1
            goto L15
        L19:
            r8.outputFormatAsInt = r2
            goto L15
        L1c:
            r8.outputFormatAsInt = r3
            goto L15
        L1f:
            r8.outputFormatAsInt = r4
            goto L15
        L22:
            r8.outputFormatAsInt = r5
            goto L15
        L25:
            r8.outputFormatAsInt = r6
            goto L15
        L28:
            r0 = 9
            r8.outputFormatAsInt = r0
            goto L15
        L2d:
            r0 = 11
            r8.outputFormatAsInt = r0
            goto L15
        L32:
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = r1
            goto L10
        L3c:
            java.lang.String r0 = "MPEG_4"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = r6
            goto L10
        L46:
            java.lang.String r0 = "MPEG_2_TS"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = 5
            goto L10
        L50:
            java.lang.String r0 = "OGG"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = 7
            goto L10
        L5a:
            java.lang.String r0 = "WEBM"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = r5
            goto L10
        L64:
            java.lang.String r0 = "AAC_ADTS"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        L6e:
            java.lang.String r0 = "THREE_GPP"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = r2
            goto L10
        L78:
            java.lang.String r0 = "AMR_NB"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = r7
            goto L10
        L82:
            java.lang.String r0 = "AMR_WB"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lf
            r0 = r3
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hbisoft.hbrecorder.ScreenRecordService.setOutputFormatAsInt(java.lang.String):void");
    }

    private void setvideoEncoderAsInt(String str) {
        str.hashCode();
        switch (str) {
            case "DEFAULT":
                this.videoEncoderAsInt = 0;
                break;
            case "MPEG_4_SP":
                this.videoEncoderAsInt = 3;
                break;
            case "VP8":
                this.videoEncoderAsInt = 4;
                break;
            case "H263":
                this.videoEncoderAsInt = 1;
                break;
            case "H264":
                this.videoEncoderAsInt = 2;
                break;
            case "HEVC":
                this.videoEncoderAsInt = 5;
                break;
        }
    }

    private void startFgs(int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.isAudioEnabled) {
                startForeground(i2, notification, 160);
                return;
            } else {
                startForeground(i2, notification, 32);
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(i2, notification, 32);
        } else {
            startForeground(i2, notification);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        resetAll();
        callOnComplete();
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i2, int i3) throws Throwable {
        if (intent == null) {
            stopSelf(i3);
        } else if (intent.getAction() == null) {
            this.hasMaxFileBeenReached = false;
            this.mIntent = intent;
            this.maxFileSize = intent.getLongExtra(Constants.MAX_FILE_SIZE_KEY, 0L);
            byte[] byteArrayExtra = intent.getByteArrayExtra("notificationSmallBitmap");
            int intExtra = intent.getIntExtra("notificationSmallVector", 0);
            String stringExtra = intent.getStringExtra("notificationTitle");
            String stringExtra2 = intent.getStringExtra("notificationDescription");
            String stringExtra3 = intent.getStringExtra("notificationButtonText");
            this.orientationHint = intent.getIntExtra("orientation", 400);
            this.mResultCode = intent.getIntExtra("code", -1);
            this.mResultData = (Intent) intent.getParcelableExtra("data");
            this.mScreenWidth = intent.getIntExtra("width", 0);
            this.mScreenHeight = intent.getIntExtra("height", 0);
            if (intent.getStringExtra("mUri") != null) {
                this.returnedUri = Uri.parse(intent.getStringExtra("mUri"));
            }
            if (this.mScreenHeight == 0 || this.mScreenWidth == 0) {
                HBRecorderCodecInfo hBRecorderCodecInfo = new HBRecorderCodecInfo();
                hBRecorderCodecInfo.setContext(this);
                this.mScreenHeight = hBRecorderCodecInfo.getMaxSupportedHeight();
                this.mScreenWidth = hBRecorderCodecInfo.getMaxSupportedWidth();
            }
            this.mScreenDensity = intent.getIntExtra("density", 1);
            this.isVideoHD = intent.getBooleanExtra("quality", true);
            this.isAudioEnabled = intent.getBooleanExtra("audio", true);
            this.path = intent.getStringExtra("path");
            this.name = intent.getStringExtra("fileName");
            String stringExtra4 = intent.getStringExtra("audioSource");
            String stringExtra5 = intent.getStringExtra("videoEncoder");
            this.videoFrameRate = intent.getIntExtra("videoFrameRate", 30);
            this.videoBitrate = intent.getIntExtra("videoBitrate", 40000000);
            if (stringExtra4 != null && this.isAudioEnabled) {
                setAudioSourceAsInt(stringExtra4);
            }
            if (stringExtra5 != null) {
                setvideoEncoderAsInt(stringExtra5);
            }
            filePath = this.name;
            if (this.isAudioEnabled) {
                this.audioBitrate = intent.getIntExtra("audioBitrate", StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH);
                this.audioSamplingRate = intent.getIntExtra("audioSamplingRate", 44100);
            }
            String stringExtra6 = intent.getStringExtra("outputFormat");
            this.outputFormat = stringExtra6;
            if (stringExtra6 != null) {
                setOutputFormatAsInt(stringExtra6);
            }
            this.isCustomSettingsEnabled = intent.getBooleanExtra("enableCustomSettings", false);
            if (stringExtra3 == null) {
                stringExtra3 = "STOP RECORDING";
            }
            if (this.audioBitrate == 0 && this.isAudioEnabled) {
                this.audioBitrate = StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH;
            }
            if (this.audioSamplingRate == 0 && this.isAudioEnabled) {
                this.audioSamplingRate = 44100;
            }
            if (stringExtra == null || stringExtra.equals("")) {
                stringExtra = getString(R.string.stop_recording_notification_title);
            }
            if (stringExtra2 == null || stringExtra2.equals("")) {
                stringExtra2 = getString(R.string.stop_recording_notification_message);
            }
            NotificationChannel notificationChannel = new NotificationChannel(PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY, "RecordChannel", 0);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.setLockscreenVisibility(0);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
                Intent intent2 = new Intent(this, (Class<?>) NotificationReceiver.class);
                Notification.Action actionBuild = new Notification.Action.Builder(Icon.createWithResource(this, android.R.drawable.presence_video_online), stringExtra3, Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(this, 0, intent2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) : PendingIntent.getBroadcast(this, 0, intent2, 0)).build();
                startFgs(101, byteArrayExtra != null ? new Notification.Builder(getApplicationContext(), PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY).setOngoing(true).setSmallIcon(Icon.createWithBitmap(BitmapFactory.decodeByteArray(byteArrayExtra, 0, byteArrayExtra.length))).setContentTitle(stringExtra).setContentText(stringExtra2).addAction(actionBuild).build() : intExtra != 0 ? new Notification.Builder(getApplicationContext(), PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY).setOngoing(true).setSmallIcon(intExtra).setContentTitle(stringExtra).setContentText(stringExtra2).addAction(actionBuild).build() : new Notification.Builder(getApplicationContext(), PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY).setOngoing(true).setSmallIcon(R.drawable.icon).setContentTitle(stringExtra).setContentText(stringExtra2).addAction(actionBuild).build());
            }
            if (this.returnedUri == null && this.path == null) {
                this.path = String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES));
            }
            try {
                initRecorder();
            } catch (Exception e2) {
                ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("listener");
                Bundle bundle = new Bundle();
                bundle.putString(Constants.ERROR_REASON_KEY, Log.getStackTraceString(e2));
                if (resultReceiver != null) {
                    resultReceiver.send(-1, bundle);
                }
            }
            try {
                initMediaProjection();
            } catch (Exception e3) {
                ResultReceiver resultReceiver2 = (ResultReceiver) intent.getParcelableExtra("listener");
                Bundle bundle2 = new Bundle();
                bundle2.putString(Constants.ERROR_REASON_KEY, Log.getStackTraceString(e3));
                if (resultReceiver2 != null) {
                    resultReceiver2.send(-1, bundle2);
                }
            }
            try {
                initVirtualDisplay();
            } catch (Exception e4) {
                ResultReceiver resultReceiver3 = (ResultReceiver) intent.getParcelableExtra("listener");
                Bundle bundle3 = new Bundle();
                bundle3.putString(Constants.ERROR_REASON_KEY, Log.getStackTraceString(e4));
                if (resultReceiver3 != null) {
                    resultReceiver3.send(-1, bundle3);
                }
            }
            this.mMediaRecorder.setOnErrorListener(new MediaRecorder.OnErrorListener() { // from class: com.hbisoft.hbrecorder.ScreenRecordService.1
                @Override // android.media.MediaRecorder.OnErrorListener
                public void onError(MediaRecorder mediaRecorder, int i4, int i5) {
                    if (i4 == 268435556 && ScreenRecordService.this.hasMaxFileBeenReached) {
                        return;
                    }
                    ResultReceiver resultReceiver4 = (ResultReceiver) intent.getParcelableExtra("listener");
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("error", 38);
                    bundle4.putString(Constants.ERROR_REASON_KEY, String.valueOf(i4));
                    if (resultReceiver4 != null) {
                        resultReceiver4.send(-1, bundle4);
                    }
                }
            });
            this.mMediaRecorder.setOnInfoListener(new MediaRecorder.OnInfoListener() { // from class: com.hbisoft.hbrecorder.ScreenRecordService.2
                @Override // android.media.MediaRecorder.OnInfoListener
                public void onInfo(MediaRecorder mediaRecorder, int i4, int i5) {
                    if (i4 == 801) {
                        ScreenRecordService.this.hasMaxFileBeenReached = true;
                        String.format(Locale.US, "onInfoListen what : %d | extra %d", Integer.valueOf(i4), Integer.valueOf(i5));
                        ResultReceiver resultReceiver4 = (ResultReceiver) intent.getParcelableExtra("listener");
                        Bundle bundle4 = new Bundle();
                        bundle4.putInt("error", 48);
                        bundle4.putString(Constants.ERROR_REASON_KEY, ScreenRecordService.this.getString(R.string.max_file_reached));
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(-1, bundle4);
                        }
                    }
                }
            });
            try {
                this.mMediaRecorder.start();
                ResultReceiver resultReceiver4 = (ResultReceiver) intent.getParcelableExtra("listener");
                Bundle bundle4 = new Bundle();
                bundle4.putInt(Constants.ON_START_KEY, 111);
                if (resultReceiver4 != null) {
                    resultReceiver4.send(-1, bundle4);
                }
            } catch (Exception e5) {
                ResultReceiver resultReceiver5 = (ResultReceiver) intent.getParcelableExtra("listener");
                Bundle bundle5 = new Bundle();
                bundle5.putInt("error", 38);
                bundle5.putString(Constants.ERROR_REASON_KEY, Log.getStackTraceString(e5));
                if (resultReceiver5 != null) {
                    resultReceiver5.send(-1, bundle5);
                }
            }
        } else if (intent.getAction().equals("pause")) {
            pauseRecording();
        } else if (intent.getAction().equals("resume")) {
            resumeRecording();
        }
        return 1;
    }
}
