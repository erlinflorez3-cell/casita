package com.facebook.react.modules.debug;

import android.view.Choreographer;
import com.dynatrace.android.agent.Global;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.`Y2\u000fq}<$i+yCAU\"}0\rWNmhvJh\u0014K\u000f\f\u001f\u0001jBI]xs\u0012\u00172HpG3coEʠhtD\u0005(2(A\u0010ڎ\u001fJZH>u3C{=R;PtHR%M3\u001bŪ\n>.\u0003fjutNH\u001b\u0005j31+\u0002B|4&DEQ\u001bol';~*,9jO7+$\u0002$7Vij\u001b? JMl5SCI\"~~h\u000eA-+}4\u000ex,\\\u0013ox\fU;\u0016h\u0014T\u001cV\u0010z*4\u0005\b\u001c5?H\\Tjt\u0016\u0011Kv\tRnTXތNȸ~a>Ѝu\fA0Q\u001b\u0015W8ݥ\u001b\u05ee;{\rټn2\u000fu9[\u0003\u0016\u0017YôX{i3WIKR\u001f\u0016gH\u0006\u0004\u001fjXÒ\u0010ΥK\u007f7Ʌa:%1O[g0wȀ\u000eҩHg~ݓ1tawjHn*EݮCҊ\r\fbե5\u0014y_lXZ!\u0004`Τ\u000b\u0002 \u0015&m\u0006Nq1\u001eagh\u0018~$έ\u0016ɻ3f?ժ?z\u001clQ^aE\b(ߧeV\u000f\u0016ERp\u0017)rPj$Z\u000b5xøTн\u0014w\u0004ͩ\u001f\u0018!JWqJ<\u0003վ%Å\u0019H\u000bٜ\u0013M\u000b\"wZ\u0017\u0018Uԡ?ʗ\u0007i,ڏY\u0010^v\to\u0016\u0001\u007fpʬd&ECWP'0&1vP\u0015#5\u0007*DěkP_Nr3\u0004_L,$\u001aQQ]>iÄ\u0001Ȟ6\u00025զ\u001d~soe\u0012U\u000bSȭ\u001b³l.oō;\u000b:\u007f\u0003X_V'\"%k\u0003%\u0018d.\u001bwE)g:ҽ\u0017ИBIzÅ*K\\Z\u0015\u0005M&[EȞ&\u0001M/IJ+ H\"=9y_\u007fn\\\u001f9ϊ(܌i\u00044ϣ݇s\u0015"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%2i\u007fi\u0018x$\rM@Km\u0015+\u0011pa\u0017\u0003j3Kr%M\"", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001bzW21a}}3t\u001d+IAAA", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r}Av%.`R\u0011/%", "1g^?X6@`\u0015\n}^9", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001b\u0012", "2hS\u0017F\u001cIR\u0015\u000ezN0[\u0019<i\t*\\M|\u001f\u0017&o\u001d<t4?f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%2i\u007fi\u0016q\u0015\u0013;3Fj0-\u0015Xe\u0018\u0017p0Wx\bTHV,;R\u0002=\u0012!d\u001b$", "3w_2V;>R\u0002\u000f\u0003?9x\u0011/s", "", "5dc\u0012k7>Q(~yG<\u0005i<a\b(\n", "u(8", "3w_2V;>R\u0002\u000f\u0003?9x\u0011/sj5{Q", "4ha@g\rKO!~ib4|", "", "4nd?C3Nay\fvf,j\u0018?t\u000f(\tN", "4ob", "", "5dc\u0013c:", "u(3", "7rA2V6KR\u001d\b|?7\u000bl8f\n\u0004\u000b |\u0015\u001a(|\nDv", "", "8r5\u001dF", "5dc\u0017f\r)A", ":`bA99:[\u0019m~f,", "<t\\\u0013e(FSvz\u0002e)x\u00075s", "<t\\\u0013e(FSvz\u0002e)x\u00075sq,\u000bC]\u0013&Erl@\u000501h{#7{", "<t\\\u0013e(FS'", "5dc\u001bh4\u001f`\u0015\u0007zl", "<t\\\u0017F\rKO!~\t", "5dc\u001bh4#Ay\fvf,\u000b", "B`a4X;\u001f^'", "Bh\\2G6\u001f^'", "\u001aiPCTuNb\u001d\u0006DM9|\t\u0017a\u000b}", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%2i\u007fi\u0018x$\rM@Km\u0015+\u0011pa\u0017\u0003j3Kr%M\u000b/7j6{>\u001eg", "Bnc._\u001bB[\u0019fh", "5dc!b;:Z\b\u0003\u0003^\u0014j", "Ch<.a(@S&f\u0005]<\u0004\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n%=e\u001c@i\u0018.Z+EjD%\u0015>", "2n5?T4>", "", Global.COLON, "5dc\u0001C3Nay\fvf,j\u0018?t\u000f(\tN", "5dc\u0013c:\"\\\u001a\t", "CoC<G0FS\u0001\r", "@db2g", "AsP?g", "AsP?g\bGR\u0006~xh9{i:s[7[<~\u001awTk\u0016<", "As^=", "\u0011n\\=T5B]\"", "\u0014ob\u0016a-H", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FpsDebugFrameCallback implements Choreographer.FrameCallback {
    private static final Companion Companion = new Companion(null);
    private static final double DEFAULT_FPS = 60.0d;
    private Choreographer choreographer;
    private final DidJSUpdateUiDuringFrameDetector didJSUpdateUiDuringFrameDetector;
    private int expectedNumFramesPrev;
    private long firstFrameTime;
    private int fourPlusFrameStutters;
    private boolean isRecordingFpsInfoAtEachFrame;
    private long lastFrameTime;
    private int numFrameCallbacks;
    private int numFrameCallbacksWithBatchDispatches;
    private final ReactContext reactContext;
    private double targetFps;
    private TreeMap<Long, FpsInfo> timeToFps;
    private final UIManagerModule uiManagerModule;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%2i\u007fi\u0018x$\rM@Km\u0015+\u0011pa\u0017\u0003j3Kr%M\u000b,6d]nF\u0018\u001ccc", "", "u(E", "\u0012D5\u000eH\u0013-Myih", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4D\u0007\":\u0016\u007f\u0007luOӄtev-\u0013\u000f:\u0013y{L$\n%\u0002GIW2}P\n_Ruj\u0007J\t\fS\u0013\u0014\u001a\u0011jZJe|k\u0017'2puO7[vU9\u000fzF\t.::8(\u0006в\u001e*V\u0019G\nQP$\u0012^F¤>X\u0015˟\u001d\u001c\u0018\u0010L+Q-jnf6vrҺ>5+Ʌ\u0002DT3m;M\\\u001bJl';wҐ\"1HʺM\u0017+`\u0011\u0015#jM\u0006Wqk\u0006ص+-3ɞ\fY<g\u000e\"e:]\rurT]ԇUf\u0014ʬCQi[^\u001cx\u0007\t}%<2\u000fΝ+N6Ʀ2h\u000e\u001fA\u0003CbNX\u001a^p\u0001ѐe<\u001fӛ\u001851K)tЈeN"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%2i\u007fi\u0018x$\rM@Km\u0015+\u0011pa\u0017\u0003j3Kr%M\u000b/7j6{>\u001eg", "", "Bnc._\rKO!~\t", "", "Bnc._\u0011L4&z\u0003^:", "Bnc._\fQ^\u0019|\n^+]\u0016+m\u007f6", "Bnc._z)Z)\r[k(\u0005\t\u001dt\u00107\u000b@\u000e%", "4ob", "", "8r5=f", "Bnc._\u001bB[\u0019f\t", "uH8\u0016<\u000b\u001d7\\o", "5dc\u0013c:", "u(3", "5dc\u0017f\rIa", "5dc!b;:Zgi\u0002n:]\u0016+m\u007f\u0016\u000bP\u0010&\u0017T}", "u(8", "5dc!b;:Zx\u0012\u0006^*\f\t.F\r$\u0004@\u000f", "5dc!b;:Zy\fvf,\u000b", "5dc!b;:Z}\r[k(\u0005\t=", "5dc!b;:Z\b\u0003\u0003^\u0014\u000b", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class FpsInfo {
        private final double fps;
        private final double jsFps;
        private final int total4PlusFrameStutters;
        private final int totalExpectedFrames;
        private final int totalFrames;
        private final int totalJsFrames;
        private final int totalTimeMs;

        public FpsInfo(int i2, int i3, int i4, int i5, double d2, double d3, int i6) {
            this.totalFrames = i2;
            this.totalJsFrames = i3;
            this.totalExpectedFrames = i4;
            this.total4PlusFrameStutters = i5;
            this.fps = d2;
            this.jsFps = d3;
            this.totalTimeMs = i6;
        }

        public final double getFps() {
            return this.fps;
        }

        public final double getJsFps() {
            return this.jsFps;
        }

        public final int getTotal4PlusFrameStutters() {
            return this.total4PlusFrameStutters;
        }

        public final int getTotalExpectedFrames() {
            return this.totalExpectedFrames;
        }

        public final int getTotalFrames() {
            return this.totalFrames;
        }

        public final int getTotalJsFrames() {
            return this.totalJsFrames;
        }

        public final int getTotalTimeMs() {
            return this.totalTimeMs;
        }
    }

    public FpsDebugFrameCallback(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.uiManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.didJSUpdateUiDuringFrameDetector = new DidJSUpdateUiDuringFrameDetector();
        this.firstFrameTime = -1L;
        this.lastFrameTime = -1L;
        this.targetFps = DEFAULT_FPS;
    }

    public static /* synthetic */ void start$default(FpsDebugFrameCallback fpsDebugFrameCallback, double d2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            d2 = fpsDebugFrameCallback.targetFps;
        }
        fpsDebugFrameCallback.start(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(FpsDebugFrameCallback this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Choreographer choreographer = Choreographer.getInstance();
        this$0.choreographer = choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(FpsDebugFrameCallback this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Choreographer choreographer = Choreographer.getInstance();
        this$0.choreographer = choreographer;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this$0);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        if (this.firstFrameTime == -1) {
            this.firstFrameTime = j2;
        }
        long j3 = this.lastFrameTime;
        this.lastFrameTime = j2;
        if (this.didJSUpdateUiDuringFrameDetector.getDidJSHitFrameAndCleanup(j3, j2)) {
            this.numFrameCallbacksWithBatchDispatches++;
        }
        this.numFrameCallbacks++;
        int expectedNumFrames = getExpectedNumFrames();
        if ((expectedNumFrames - this.expectedNumFramesPrev) - 1 >= 4) {
            this.fourPlusFrameStutters++;
        }
        if (this.isRecordingFpsInfoAtEachFrame) {
            Assertions.assertNotNull(this.timeToFps);
            FpsInfo fpsInfo = new FpsInfo(getNumFrames(), getNumJSFrames(), expectedNumFrames, this.fourPlusFrameStutters, getFps(), getJsFPS(), getTotalTimeMS());
            TreeMap<Long, FpsInfo> treeMap = this.timeToFps;
            if (treeMap != null) {
                treeMap.put(Long.valueOf(System.currentTimeMillis()), fpsInfo);
            }
        }
        this.expectedNumFramesPrev = expectedNumFrames;
        Choreographer choreographer = this.choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }

    public final int get4PlusFrameStutters() {
        return this.fourPlusFrameStutters;
    }

    public final int getExpectedNumFrames() {
        return (int) (((this.targetFps * ((double) getTotalTimeMS())) / ((double) 1000)) + ((double) 1));
    }

    public final double getFps() {
        if (this.lastFrameTime == this.firstFrameTime) {
            return 0.0d;
        }
        return (((double) getNumFrames()) * 1.0E9d) / (this.lastFrameTime - this.firstFrameTime);
    }

    public final FpsInfo getFpsInfo(long j2) {
        Assertions.assertNotNull(this.timeToFps, "FPS was not recorded at each frame!");
        TreeMap<Long, FpsInfo> treeMap = this.timeToFps;
        Map.Entry<Long, FpsInfo> entryFloorEntry = treeMap != null ? treeMap.floorEntry(Long.valueOf(j2)) : null;
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    public final double getJsFPS() {
        if (this.lastFrameTime == this.firstFrameTime) {
            return 0.0d;
        }
        return (((double) getNumJSFrames()) * 1.0E9d) / (this.lastFrameTime - this.firstFrameTime);
    }

    public final int getNumFrames() {
        return this.numFrameCallbacks - 1;
    }

    public final int getNumJSFrames() {
        return this.numFrameCallbacksWithBatchDispatches - 1;
    }

    public final int getTotalTimeMS() {
        return ((int) (this.lastFrameTime - this.firstFrameTime)) / 1000000;
    }

    public final void reset() {
        this.firstFrameTime = -1L;
        this.lastFrameTime = -1L;
        this.numFrameCallbacks = 0;
        this.fourPlusFrameStutters = 0;
        this.numFrameCallbacksWithBatchDispatches = 0;
        this.isRecordingFpsInfoAtEachFrame = false;
        this.timeToFps = null;
    }

    public final void start() {
        start$default(this, 0.0d, 1, null);
    }

    public final void start(double d2) {
        if (!this.reactContext.isBridgeless()) {
            this.reactContext.getCatalystInstance().addBridgeIdleDebugListener(this.didJSUpdateUiDuringFrameDetector);
        }
        UIManagerModule uIManagerModule = this.uiManagerModule;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(this.didJSUpdateUiDuringFrameDetector);
        }
        this.targetFps = d2;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.FpsDebugFrameCallback$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FpsDebugFrameCallback.start$lambda$0(this.f$0);
            }
        });
    }

    public final void startAndRecordFpsAtEachFrame() {
        this.timeToFps = new TreeMap<>();
        this.isRecordingFpsInfoAtEachFrame = true;
        start$default(this, 0.0d, 1, null);
    }

    public final void stop() {
        if (!this.reactContext.isBridgeless()) {
            this.reactContext.getCatalystInstance().removeBridgeIdleDebugListener(this.didJSUpdateUiDuringFrameDetector);
        }
        UIManagerModule uIManagerModule = this.uiManagerModule;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(null);
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.FpsDebugFrameCallback$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                FpsDebugFrameCallback.stop$lambda$1(this.f$0);
            }
        });
    }
}
