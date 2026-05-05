package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import io.sentry.IHub;
import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.protocol.SentryId;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.FileUtils;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яė\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,[:qK;k\u001a\u0006\"\u000fOVg}nRZ\u0011C\u0017\u0006$xrߚQU\u0007f\u001aƁ:B\u0006?;ݹw=O`|6\u000b :\"F\u0006\rЏ\"*^\u0010~zIK\u0014\u0012F@x:X\rU\u00050\u0012\u000ē(\u00014\\oNDOtҗB/9\u0003qBT(g0\u000bS\u0015Ͽ\\'#vi\u001e1A=ߎ+Ǭq27R\n>;>!}Qx+5+as\u00067h\u0006\"\u0017CQ#\\!)l\t_d$'YTsO^\u0014@w)\u0003\u001d_\n\u000e\u0014/`K=+v\u0017<=Ϣv]F[\u0012dH\f\u000bc<\u001dK\rC-I\u001b\u0015_w:GWѼ\u007f\u0005\u001b-k#|1sT<qE\u001fb\ni1\u007fSmX\\\u001eqI}\u0006\u0001b0?\u00142W\u007f]\r?7]9\u007faG99k0_\u000b{?'n\u0001ki\u0001Yp&|/O*7&\u000bTr \u0004\\dZ<\u0011{8d\t\u000e\bA1\u000b\u0001\u0003!m\u001e\\l\u0001i\u0019^\u000e\u000e3M~7\b\u000e2\" wlSMQ\u0012!\u0012X\u00055W>x\u0004\u0007\tr}\u001a}tN24Xj>\u0006\fU^\u001bAWƐu&:7A\u001fb!X\u0005$Hg#\u0019ajh>\u0010\u0003Wʗ\u0007i*\u001cO\u0015\u0019b~\u0018\u007fxw=CtjUOzM\u0019TfRlB\u001b;\u0007-\u00130Kuv_L\u001bA&Y\n-.\u001ag[_C!;\u0017+H\u0001[r\u0013\u0007.W[@?z+\u000bUO9:u\f\u0003pZeA\u07bdQݚ\u001b\"~ܥC1\u0016f\u0018{wE)J:ҽ\rИBIzÅ*H\\8\u0015\u0005M\u001f{˝qݕ\u000155ξۘ!F"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i%m$<QMDI0)$xn9tr9J\u0006'I`$", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0014i$.+?FzD+\u0015VpF\u0003r,P\u000b|", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", "6tQ", "\u001ah^{f,Gb&\u0013DB\u000f\r\u0006\u0005", "2`c2C9Hd\u001d}zk", "\u001ah^{f,Gb&\u0013Dm9x\u0012=p\n5\u000b\ndt'T|\u000eE\u0006\u00041h}\u000bDw'2LCHA", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0005\u0015Jo\rL}%49\u0011 5}%8Z1;xE\"\u0013h7", "@d_9T@\u001cO\u0017\u0002zI9\u0007\u001a3d\u007f5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ah^{f,Gb&\u0013Di9\u0007\u00189c\n/E.\u0001 &T\u0004q;L", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "@d_9T@\"R", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m[\u001c5p\u0016\u0004", "uKX<\":>\\(\f\u000f(\u001a|\u0012>r\u0014\u0012\u0007O\u0005! UEt@\u0001nCY\u0007/D\u0002_\u00120S8A\u001b\"\u001f2o9\u0010r9b@6THW:g\\\u007fL]u8\u001e[8\r\u000eh  }D\",\u0012=M\u0001;uVr\u001b\nFf:Re\u0014NC\u0013\u007fJ'xSf_\u0003V\u000b3`-d\u000bo$\\9\u001a7\u0014o)*r]\u001c\n\td\u0015pRONmQ(\u0002<-\brlN\u000fpeEr6#U\u0005\u0006[\u0013h})\u00041\u000e=u\f(u", "1`_Ah9>@\u0019\n\u0002Z@", "", "7rC2e4B\\\u0015\u000e~g.", "", "=mB2Z4>\\(lzg;", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "1n]CX9M", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b9", "1qT.g,\u001cc&\fzg;j\t1m\u007f1\u000b", "B`b8A(FS", "", "=mB2Z4>\\(\\\b^(\f\t.", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\u0019N\u0002.C`<,^ZrF#g", "=m2<a-BU)\fvm0\u0007\u0012\rh{1}@\u007f", "@dR<e+>`v\t\u0004_0~", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rrj:\u000be\u0002", "=mB0e,>\\'\u0002\u0005m\u0019|\u00079r~(z", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "As^?X", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "4qP:X\u001bB[\u0019\r\nZ4\b", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">`d@X", "AsP?g", "AdV:X5M7\u0018", "", "@d_9T@-g$~", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yl(\u0007G|+vXo\u0017K5\u00125d\u0005\u001cK\\*9M\u0019", "As^=", "\u0011n\\=T5B]\"", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SessionCaptureStrategy extends BaseCaptureStrategy {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SessionCaptureStrategy";
    private final ICurrentDateProvider dateProvider;
    private final IHub hub;
    private final SentryOptions options;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӭ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i%m$<QMDI0)$xn9tr9J\u0006'I`\r\nfZ}9\u001d\u0016d\u0017$", "", "u(E", "\"@6", "", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCaptureStrategy(SentryOptions options, IHub iHub, ICurrentDateProvider dateProvider, ScheduledExecutorService executor, Function1<? super SentryId, ReplayCache> function1) {
        super(options, iHub, dateProvider, executor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.options = options;
        this.hub = iHub;
        this.dateProvider = dateProvider;
    }

    public /* synthetic */ SessionCaptureStrategy(SentryOptions sentryOptions, IHub iHub, ICurrentDateProvider iCurrentDateProvider, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, iHub, iCurrentDateProvider, scheduledExecutorService, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? null : function1);
    }

    private final void createCurrentSegment(String str, final Function1<? super CaptureStrategy.ReplaySegment, Unit> function1) {
        long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
        final Date segmentTimestamp = getSegmentTimestamp();
        if (segmentTimestamp == null) {
            return;
        }
        final long time = currentTimeMillis - segmentTimestamp.getTime();
        final SentryId currentReplayId = getCurrentReplayId();
        final int recordingHeight = getRecorderConfig().getRecordingHeight();
        final int recordingWidth = getRecorderConfig().getRecordingWidth();
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "SessionCaptureStrategy." + str, new Runnable() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SessionCaptureStrategy.createCurrentSegment$lambda$4(this.f$0, time, segmentTimestamp, currentReplayId, recordingHeight, recordingWidth, function1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCurrentSegment$lambda$4(SessionCaptureStrategy this$0, long j2, Date currentSegmentTimestamp, SentryId replayId, int i2, int i3, Function1 onSegmentCreated) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "$currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "$replayId");
        Intrinsics.checkNotNullParameter(onSegmentCreated, "$onSegmentCreated");
        onSegmentCreated.invoke(BaseCaptureStrategy.createSegmentInternal$default(this$0, j2, currentSegmentTimestamp, replayId, this$0.getCurrentSegment(), i2, i3, null, null, 0, 0, null, null, null, 8128, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$3(SessionCaptureStrategy this$0, Function2 store, long j2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(store, "$store");
        ReplayCache cache = this$0.getCache();
        if (cache != null) {
            store.invoke(cache, Long.valueOf(j2));
        }
        Date segmentTimestamp = this$0.getSegmentTimestamp();
        if (segmentTimestamp == null) {
            this$0.options.getLogger().log(SentryLevel.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (this$0.isTerminating().get()) {
            this$0.options.getLogger().log(SentryLevel.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        long currentTimeMillis = this$0.dateProvider.getCurrentTimeMillis();
        if (currentTimeMillis - segmentTimestamp.getTime() >= this$0.options.getSessionReplay().getSessionSegmentDuration()) {
            CaptureStrategy.ReplaySegment replaySegmentCreateSegmentInternal$default = BaseCaptureStrategy.createSegmentInternal$default(this$0, this$0.options.getSessionReplay().getSessionSegmentDuration(), segmentTimestamp, this$0.getCurrentReplayId(), this$0.getCurrentSegment(), i2, i3, null, null, 0, 0, null, null, null, 8128, null);
            if (replaySegmentCreateSegmentInternal$default instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegmentInternal$default;
                CaptureStrategy.ReplaySegment.Created.capture$default(created, this$0.hub, null, 2, null);
                this$0.setCurrentSegment(this$0.getCurrentSegment() + 1);
                this$0.setSegmentTimestamp(created.getReplay().getTimestamp());
            }
        }
        if (currentTimeMillis - this$0.getReplayStartTimestamp().get() >= this$0.options.getSessionReplay().getSessionDuration()) {
            this$0.options.getReplayController().stop();
            this$0.options.getLogger().log(SentryLevel.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(SessionCaptureStrategy this$0, IScope it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        it.setReplayId(this$0.getCurrentReplayId());
        String screen = it.getScreen();
        this$0.setScreenAtStart(screen != null ? StringsKt.substringAfterLast$default(screen, '.', (String) null, 2, (Object) null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(IScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setReplayId(SentryId.EMPTY_ID);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void captureReplay(boolean z2, Function1<? super Date, Unit> onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        this.options.getLogger().log(SentryLevel.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        isTerminating().set(z2);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public CaptureStrategy convert() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        createCurrentSegment("onConfigurationChanged", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy.onConfigurationChanged.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CaptureStrategy.ReplaySegment replaySegment) {
                invoke2(replaySegment);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CaptureStrategy.ReplaySegment segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                    CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) segment;
                    CaptureStrategy.ReplaySegment.Created.capture$default(created, SessionCaptureStrategy.this.hub, null, 2, null);
                    SessionCaptureStrategy sessionCaptureStrategy = SessionCaptureStrategy.this;
                    sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
                    SessionCaptureStrategy.this.setSegmentTimestamp(created.getReplay().getTimestamp());
                }
            }
        });
        super.onConfigurationChanged(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenshotRecorded(Bitmap bitmap, final Function2<? super ReplayCache, ? super Long, Unit> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
        final int recordingHeight = getRecorderConfig().getRecordingHeight();
        final int recordingWidth = getRecorderConfig().getRecordingWidth();
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SessionCaptureStrategy.onScreenshotRecorded$lambda$3(this.f$0, store, currentTimeMillis, recordingHeight, recordingWidth);
            }
        });
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
        createCurrentSegment("pause", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy.pause.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CaptureStrategy.ReplaySegment replaySegment) {
                invoke2(replaySegment);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CaptureStrategy.ReplaySegment segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                    CaptureStrategy.ReplaySegment.Created.capture$default((CaptureStrategy.ReplaySegment.Created) segment, SessionCaptureStrategy.this.hub, null, 2, null);
                    SessionCaptureStrategy sessionCaptureStrategy = SessionCaptureStrategy.this;
                    sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
                }
            }
        });
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void start(ScreenshotRecorderConfig recorderConfig, int i2, SentryId replayId, SentryReplayEvent.ReplayType replayType) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        super.start(recorderConfig, i2, replayId, replayType);
        IHub iHub = this.hub;
        if (iHub != null) {
            iHub.configureScope(new ScopeCallback() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy$$ExternalSyntheticLambda2
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    SessionCaptureStrategy.start$lambda$0(this.f$0, iScope);
                }
            });
        }
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache cache = getCache();
        final File replayCacheDir$sentry_android_replay_release = cache != null ? cache.getReplayCacheDir$sentry_android_replay_release() : null;
        createCurrentSegment("stop", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy.stop.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CaptureStrategy.ReplaySegment replaySegment) {
                invoke2(replaySegment);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CaptureStrategy.ReplaySegment segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                    CaptureStrategy.ReplaySegment.Created.capture$default((CaptureStrategy.ReplaySegment.Created) segment, SessionCaptureStrategy.this.hub, null, 2, null);
                }
                SessionCaptureStrategy.this.setCurrentSegment(-1);
                FileUtils.deleteRecursively(replayCacheDir$sentry_android_replay_release);
            }
        });
        IHub iHub = this.hub;
        if (iHub != null) {
            iHub.configureScope(new ScopeCallback() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy$$ExternalSyntheticLambda3
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    SessionCaptureStrategy.stop$lambda$1(iScope);
                }
            });
        }
        super.stop();
    }
}
