package io.sentry.android.replay;

import android.view.View;
import io.sentry.SentryOptions;
import io.sentry.android.replay.WindowRecorder;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:*c$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001jBI]xs\u0012\u00172XoG\u074cUoKʠhҚ>\u0005.2*8\u007f\u0006\t\u001a8Q\u0018v\u0001ES\f(0Hp@T\u0013L\u001b܅0/n /\u001d\rg|6\u0001l\u0007doJ\u0013mPO?_^~]\u0015LT5\u0010\u000fc4*n;E\u00193X\u001b\u0007\u0001aO\u0007MxU\u0005\u0017/ݳ/I\u0002`~^\u000e1-+}+$\u0007nr\u0013px\fUI\u007fgYp&(&\u0014,\u0011J%&\u0006UjtAbl\u00161Kt!q\u0007dJdP$\u0013ad5k\u0014{9G@~Q\u0010YIRE\"\u001d\rLJG\u0003iab6x\u0015Ir>e\u0002rNG`V(deo\u001ao\u0011\nX\ff\bV߿Ɋ\u0011ѧ\u001b/?]?1/z\u001aJJs\u0005\u00121zayjNP\"t\u0017M)7\u001d1ըpʰoP\\А|\u001d[.l\u0007,\u001bi\u0601^ʟ@!-ī\u001f[vn\u0003M\f\u0010{ÇhƠ]nsލ(El4MQ\u0012\u00128ׯx݀C<jڳ)tPg$\\r'PG\u001fН\u001cȑ\u007fDVۼc>Mx44Z9o¥\u0017Ƞ\u0007\u001eJˆM1mp\u0001,\u000f\\C*\u0013k4t7\u001a~t\u001f\u0007P\u0005Y4\rf2/QQc2Tm\u0001\u0003\u000bí%ȷ\u0003s\bø8XUg\u0005\u0016$qR\u0090\u0018׀=Q7ˋc\u001d\r,J\u0004CDzv<ʻOɟ+z\u0005Ȫӡ?\u0014"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u007f@\u007f$?kj 5w#-MP\u0011", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<t/BX}-\r", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9wEc/?hn$7\u007f$\fP?Dm4\u001d{loH\u0007l,[L", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", "Aba2X5LV#\u000eg^*\u0007\u0016.e\r\u0006wG\b\u0014\u0013Eu", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rdh@\u0004_*TL", ";`X;?6H^\u0019\f]Z5{\u0010/r", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001eKz,~Ay$@T 8XCHN0'\u0014oaF\\", "@d_9T@\u001ef\u0019|\u000bm6\n", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0005\u0015Jo\rL}%49\u0011 5}%8Z1;xE\"\u0013h7", "uKX<\":>\\(\f\u000f(\u001a|\u0012>r\u0014\u0012\u0007O\u0005! UEt@\u0001nCY\u0007/D\u0002_*VBHu8\u001d^uaD\u000e_@\u0018d%TLN5jU|L\u0001\u0012X\u0018[*\r\u00127=+uA3\u001d\u000e\u00020\u0006E2\u000f\f\u001f\u001dB~:>_\u000fT\u0004\u0019t\u000b6hQ`[\u000e\u0011QTf1.s[!e!D.\u001fq&}dY-\u0011{`fYWuxc\u0011)\n<+\bkeOC\u007fbIt0.\u0015iu\u00152W\u00052t,cG*4t\u0014Ut\u0006>k\n\u0019*\\\u0017j\u0017", "1`_Ah9>`", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "5dc\u0010T7Mc&~\b", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`5m\u0011<u5<Y|\u007fJm\u0014>\\MHY4+&l_9\\", "1`_Ah9>`W}ze,~\u0005>e", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "1`_Ah9B\\\u001bmvl2", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0005\u0015Jo\rL}%4:\u000e/Gz\u0016\u0004", "7rA2V6KR\u001d\b|", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "@dR<e+>`", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+j", "@n^AI0>e'", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "@n^AI0>e'e\u0005\\2", "", "1k^@X", "", "=mA<b;/W\u0019\u0011\t</x\u00121e~", "@n^A", "/cS2W", "", ">`d@X", "@dbB`,", "AsP?g", "@dR<e+>`v\t\u0004_0~", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rrj:\u000be\u0002", "As^=", "\u0011n\\=T5B]\"", " dR<e+>`x\u0012z\\<\f\u0013<S\u007f5\rD~\u0017\u0006J|\u000e8u\u00061W\r*D\u0002", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WindowRecorder implements Recorder, OnRootViewsChangedListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "WindowRecorder";
    private final Lazy capturer$delegate;
    private ScheduledFuture<?> capturingTask;
    private final AtomicBoolean isRecording;
    private final MainLooperHandler mainLooperHandler;
    private final SentryOptions options;
    private ScreenshotRecorder recorder;
    private final ScheduledExecutorService replayExecutor;
    private final ArrayList<WeakReference<View>> rootViews;
    private final Object rootViewsLock;
    private final ScreenshotRecorderCallback screenshotRecorderCallback;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӭ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u007f@\u007f$?kj 5w#-MPyI>& dj=\u0011l\u0002", "", "u(E", "\"@6", "", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjO0L͜N.hݷZ\u000f\u001azt'Ӯ(qQ;\u001e(\f%!O|k\u0018rX_#C=\f\\\r;8WV\u0011]@\u0011\tԒ{У7Mwމˉd{"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u007f@\u007f$?kj 5w#-MPyX4\u001c\u001fu`9\u0014C?Nt7VV[\u001a\\_\u0004A\u0012\u0012I\u0011[+\t\u0004:=\"}ND3]", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001aTo\n;W!3h\b-KC", "u(E", "1mc", "", "<df![9>O\u0018", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "@", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class RecorderExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r2) {
            Intrinsics.checkNotNullParameter(r2, "r");
            StringBuilder sb = new StringBuilder("SentryWindowRecorder-");
            int i2 = this.cnt;
            this.cnt = i2 + 1;
            Thread thread = new Thread(r2, sb.append(i2).toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public WindowRecorder(SentryOptions options, ScreenshotRecorderCallback screenshotRecorderCallback, MainLooperHandler mainLooperHandler, ScheduledExecutorService replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.options = options;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.mainLooperHandler = mainLooperHandler;
        this.replayExecutor = replayExecutor;
        this.isRecording = new AtomicBoolean(false);
        this.rootViews = new ArrayList<>();
        this.rootViewsLock = new Object();
        this.capturer$delegate = LazyKt.lazy(new Function0<ScheduledExecutorService>() { // from class: io.sentry.android.replay.WindowRecorder$capturer$2
            @Override // kotlin.jvm.functions.Function0
            public final ScheduledExecutorService invoke() {
                return Executors.newSingleThreadScheduledExecutor(new WindowRecorder.RecorderExecutorServiceThreadFactory());
            }
        });
    }

    public /* synthetic */ WindowRecorder(SentryOptions sentryOptions, ScreenshotRecorderCallback screenshotRecorderCallback, MainLooperHandler mainLooperHandler, ScheduledExecutorService scheduledExecutorService, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : screenshotRecorderCallback, mainLooperHandler, scheduledExecutorService);
    }

    private final ScheduledExecutorService getCapturer() {
        return (ScheduledExecutorService) this.capturer$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(WindowRecorder this$0) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScreenshotRecorder screenshotRecorder = this$0.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.capture();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        stop();
        ScheduledExecutorService capturer = getCapturer();
        Intrinsics.checkNotNullExpressionValue(capturer, "capturer");
        ExecutorsKt.gracefullyShutdown(capturer, this.options);
    }

    @Override // io.sentry.android.replay.OnRootViewsChangedListener
    public void onRootViewsChanged(final View root, boolean z2) {
        Intrinsics.checkNotNullParameter(root, "root");
        synchronized (this.rootViewsLock) {
            if (z2) {
                this.rootViews.add(new WeakReference<>(root));
                ScreenshotRecorder screenshotRecorder = this.recorder;
                if (screenshotRecorder != null) {
                    screenshotRecorder.bind(root);
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                ScreenshotRecorder screenshotRecorder2 = this.recorder;
                if (screenshotRecorder2 != null) {
                    screenshotRecorder2.unbind(root);
                }
                CollectionsKt.removeAll((List) this.rootViews, (Function1) new Function1<WeakReference<View>, Boolean>() { // from class: io.sentry.android.replay.WindowRecorder$onRootViewsChanged$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(WeakReference<View> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(Intrinsics.areEqual(it.get(), root));
                    }
                });
                WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) this.rootViews);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view == null || Intrinsics.areEqual(root, view)) {
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    ScreenshotRecorder screenshotRecorder3 = this.recorder;
                    if (screenshotRecorder3 != null) {
                        screenshotRecorder3.bind(view);
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            }
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void pause() {
        ScreenshotRecorder screenshotRecorder = this.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.pause();
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void resume() {
        ScreenshotRecorder screenshotRecorder = this.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.resume();
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void start(ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        if (this.isRecording.getAndSet(true)) {
            return;
        }
        this.recorder = new ScreenshotRecorder(recorderConfig, this.options, this.mainLooperHandler, this.replayExecutor, this.screenshotRecorderCallback);
        ScheduledExecutorService capturer = getCapturer();
        Intrinsics.checkNotNullExpressionValue(capturer, "capturer");
        this.capturingTask = ExecutorsKt.scheduleAtFixedRateSafely(capturer, this.options, "WindowRecorder.capture", 100L, 1000 / ((long) recorderConfig.getFrameRate()), TimeUnit.MILLISECONDS, new Runnable() { // from class: io.sentry.android.replay.WindowRecorder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                WindowRecorder.start$lambda$1(this.f$0);
            }
        });
    }

    @Override // io.sentry.android.replay.Recorder
    public void stop() {
        synchronized (this.rootViewsLock) {
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ScreenshotRecorder screenshotRecorder = this.recorder;
                if (screenshotRecorder != null) {
                    screenshotRecorder.unbind((View) weakReference.get());
                }
            }
            this.rootViews.clear();
            Unit unit = Unit.INSTANCE;
        }
        ScreenshotRecorder screenshotRecorder2 = this.recorder;
        if (screenshotRecorder2 != null) {
            screenshotRecorder2.close();
        }
        this.recorder = null;
        ScheduledFuture<?> scheduledFuture = this.capturingTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.capturingTask = null;
        this.isRecording.set(false);
    }
}
