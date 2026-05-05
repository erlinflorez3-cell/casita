package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.view.ViewCompat;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.TextLayout;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a&yCQU\"}(\nWN}gvJ`\u0010K\u000f\u001c\u0016\u0001j2K]xs\u0012\u00172XoG\u074cUoS9ht<\b(288\u0002\u0005\u0007\u001c2H\u001ev\u0003CQ\u0012\u001a0NvBĥ\u0015M\u001b\u001a\u001a\u0006D \u0007\u001drɡ~6vk\u00169hc0yF\\'w0+N\u001dJb)%v\u0010!;DE9-%\u0002\b\u0017ViE\u001b? D\u0015n5/CK\nVdaÿ\u0018\u00159YUi\u0001Rt\u0005\u007f\u000e<+9}{K~.p{\t+%<2;N+V^E\u001a\u00155V9\u0003$k@~/%VH~oh/%.`s=)\u001aiaiF\u0017E\n9%\u001eQ.\u001f'i\u0003&b+\u001a\u0003\u0018\u001aC_uUH|@\u0002=\u001c&!f\u0010a\u001c0u8u{a=%%O[g$\u074co\bPֳ\u007fx\u000bkv_:^VM:nDE\u0001¡\u000eʑHd\rߘ!`f;)MJb]å\n˙$\\\u007f˓q1\u001e^gh\u0018x$έ\fɻ3f?ժ?w\u001c[Q^a:(Ҳ\u0012уVv\u001c̳\r{\u0013i~B\u0002\u001e\u0011\u001d~βúHн\u0014\u0002\u0004FT!!HWs\"G:Eik#J\u001b\u001epDҴ\rebӐ(\u0001ZJ2\u001b:=\u0003\"\u0019P\u000b\u000b&(Oؘ̥|˃&7IS;64k:j:\u00181#O\u007f\u000eM\u007fLuSCָwʀ\u007f \u001e֝\ne=[+\u0017\u000f+B\u0002[ebq\u0014p$ȿ3ϸ\u0001y\u0017\u00909:u)\u0003pZ\u0003A\u07bdQݚ\u001b\"~ܥC1\u0016l\u0018{wE)P:ҽ\rИBIzÅ*U\\[\u0015\u0005M@[AFܵġ5ԩG1%\u0018}:=+y_o\u0014<\u001f3(4\u001c}\u0004Z\fL09ЖϦ2֑<Sa\u0001DM2\u0003\u001bDN\u0014\u00062ɠ\rn"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+j", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0017\t@\u0001\u0001\u0014Uo\u001bMv2sC\u0007~Di(\u0015QQJk=\u001e\">", "1n]3\\.", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rrj:\u000be\u0002", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", ";`X;?6H^\u0019\f]Z5{\u0010/r", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001eKz,~Ay$@T 8XCHN0'\u0014oaF\\", "@dR<e+>`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0005\u0015Jo\rL}%49\u0011 5}%8Z1;xE\"\u0013h7", "Aba2X5LV#\u000eg^*\u0007\u0016.e\r\u0006wG\b\u0014\u0013Eu", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rdh@\u0004_*TL", "uKX<\":>\\(\f\u000f((\u0006\b<o\u0004'EM\u0001\"\u001eC\u0004W*t25Y\u0007.:w%\u001bMAEx3\u001e\"FkB\bg.$]+Q\u0016\\,ea\u007fQ]\u007fZ\u0017]8!ndP(xMEtn0SKIh\n\u001b#\"~fyAc\u001aKx^\u0003A4oBm)\nVEL,\u0012`\u0010h\u0004fDE$!T\u0015$gW.\u0017Q:\u0016ncu1wV\u001d\u0002\u0002\"HvYVR|UE\u0004p\rI~w\u0011B_t*T@\u00042:En\u00129g%Obv\u0015\u0002CE1oD<\u001cNXw?hG\ru)e\u0007Wo5< ay-6\r\u0014]\u0017dCdi\u0010$R\u0004HVn\u00154$zIbv\u0011\u0007\ry1V", "5dc\u0010b5?W\u001b", "u(;6buLS\"\u000e\brux\u0012.r\n,z\n\u000e\u0017\"Nk\"\u0006d#BY})Ep =:C9uA\u001d\u0015u?C\u0010d0PL", "1n]AX5M1\u001cz\u0004`,{", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "7r2.c;N`\u001d\b|", ":`bA6(Ib)\fzL<z\u0007/s\u000e)\fG", ";`b8\\5@>\u0015\u0003\u0004m", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "5dc\u001aT:DW\"\u0001eZ0\u0006\u0018", "u(;.a+K]\u001d}D`9x\u00142i}6E+|\u001b VE", ";`b8\\5@>\u0015\u0003\u0004mj{\t6e\u0002$\u000b@", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "5dc\u001cc;B]\"\r", "u(;6buLS\"\u000e\bruj\t8t\r<eK\u0010\u001b!P}c", ">qT@V(ES\u0018fvm9\u0001\u001c", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "5dc\u001de,LQ\u0015\u0006z]\u0014x\u0018<i\u0013", "u(;.a+K]\u001d}D`9x\u00142i}6E(|&$K\u0003c", ">qT@V(ES\u0018fvm9\u0001\u001cmd\u007f/{B|&\u0017", "@n^AI0>e", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "Aba2X5LV#\u000e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "Ah]4_,)W,~\u0002;0\f\u0011+p", "5dc \\5@Z\u0019i~q,\u0004e3t\b$\u0007", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001d\u0005&\u001fCzc", "Ah]4_,)W,~\u0002;0\f\u0011+p>'{G\u0001\u0019\u0013Vo", "Ah]4_,)W,~\u0002;0\f\u0011+p]$\u0005Q|%", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "5dc \\5@Z\u0019i~q,\u0004e3t\b$\u0007\u001e| (C}", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001e| (C}c", "Ah]4_,)W,~\u0002;0\f\u0011+p]$\u0005Q|%UFo\u0015<x!DY", "0h]1", "", "@n^A", "1`_Ah9>", "1k^@X", "=m3?T>", ">`d@X", "@dbB`,", "CmQ6a+", "2n\\6a(Gbv\t\u0002h9]\u0013<R\u007f&\u000b", "", "@dRA", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", " dR<e+>`x\u0012z\\<\f\u0013<S\u007f5\rD~\u0017\u0006J|\u000e8u\u00061W\r*D\u0002", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScreenshotRecorder implements ViewTreeObserver.OnDrawListener {
    private final ScreenshotRecorderConfig config;
    private final AtomicBoolean contentChanged;
    private final AtomicBoolean isCapturing;
    private final AtomicBoolean lastCaptureSuccessful;
    private final MainLooperHandler mainLooperHandler;
    private final Lazy maskingPaint$delegate;
    private final SentryOptions options;
    private final Lazy prescaledMatrix$delegate;
    private final ScheduledExecutorService recorder;
    private WeakReference<View> rootView;
    private final Bitmap screenshot;
    private final ScreenshotRecorderCallback screenshotRecorderCallback;
    private final Lazy singlePixelBitmap$delegate;
    private final Lazy singlePixelBitmapCanvas$delegate;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjO0L͜N.hݷZ\u000f\u001azt'Ӯ(qQ;\u001e(\f%!O|k\u0018rX_#C=\f\\\r;8WV\u0011]@\u0011\tԒ{У7Mwމˉd{"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+SUa7\u0011p+N\u0004\u0007ZLL<k\\\u007f+\u0014\u001fk\u0012L+{\bfA m%3\u001d\u00176V\u0016\u0011", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001aTo\n;W!3h\b-KC", "u(E", "1mc", "", "<df![9>O\u0018", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "@", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class RecorderExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r2) {
            Intrinsics.checkNotNullParameter(r2, "r");
            StringBuilder sb = new StringBuilder("SentryReplayRecorder-");
            int i2 = this.cnt;
            this.cnt = i2 + 1;
            Thread thread = new Thread(r2, sb.append(i2).toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public ScreenshotRecorder(ScreenshotRecorderConfig config, SentryOptions options, MainLooperHandler mainLooperHandler, ScheduledExecutorService recorder, ScreenshotRecorderCallback screenshotRecorderCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(recorder, "recorder");
        this.config = config;
        this.options = options;
        this.mainLooperHandler = mainLooperHandler;
        this.recorder = recorder;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.maskingPaint$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Paint>() { // from class: io.sentry.android.replay.ScreenshotRecorder$maskingPaint$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Paint invoke() {
                return new Paint();
            }
        });
        this.singlePixelBitmap$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Bitmap>() { // from class: io.sentry.android.replay.ScreenshotRecorder$singlePixelBitmap$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Bitmap invoke() {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
                return bitmapCreateBitmap;
            }
        });
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(config.getRecordingWidth(), config.getRecordingHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n        co…ap.Config.ARGB_8888\n    )");
        this.screenshot = bitmapCreateBitmap;
        this.singlePixelBitmapCanvas$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Canvas>() { // from class: io.sentry.android.replay.ScreenshotRecorder$singlePixelBitmapCanvas$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Canvas invoke() {
                return new Canvas(this.this$0.getSinglePixelBitmap());
            }
        });
        this.prescaledMatrix$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Matrix>() { // from class: io.sentry.android.replay.ScreenshotRecorder$prescaledMatrix$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Matrix invoke() {
                Matrix matrix = new Matrix();
                ScreenshotRecorder screenshotRecorder = this.this$0;
                matrix.preScale(screenshotRecorder.getConfig().getScaleFactorX(), screenshotRecorder.getConfig().getScaleFactorY());
                return matrix;
            }
        });
        this.contentChanged = new AtomicBoolean(false);
        this.isCapturing = new AtomicBoolean(true);
        this.lastCaptureSuccessful = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2(final ScreenshotRecorder this$0, Window window, final View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.contentChanged.set(false);
            PixelCopy.request(window, this$0.screenshot, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.ScreenshotRecorder$$ExternalSyntheticLambda1
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i2) {
                    ScreenshotRecorder.capture$lambda$2$lambda$1(this.f$0, view, i2);
                }
            }, this$0.mainLooperHandler.getHandler());
        } catch (Throwable th) {
            this$0.options.getLogger().log(SentryLevel.WARNING, "Failed to capture replay recording", th);
            this$0.lastCaptureSuccessful.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2$lambda$1(final ScreenshotRecorder this$0, View view, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 != 0) {
            this$0.options.getLogger().log(SentryLevel.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i2));
            this$0.lastCaptureSuccessful.set(false);
        } else if (this$0.contentChanged.get()) {
            this$0.options.getLogger().log(SentryLevel.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            this$0.lastCaptureSuccessful.set(false);
        } else {
            final ViewHierarchyNode viewHierarchyNodeFromView = ViewHierarchyNode.Companion.fromView(view, null, 0, this$0.options);
            ViewsKt.traverse(view, viewHierarchyNodeFromView, this$0.options);
            ExecutorsKt.submitSafely(this$0.recorder, this$0.options, "screenshot_recorder.mask", new Runnable() { // from class: io.sentry.android.replay.ScreenshotRecorder$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ScreenshotRecorder.capture$lambda$2$lambda$1$lambda$0(this.f$0, viewHierarchyNodeFromView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2$lambda$1$lambda$0(final ScreenshotRecorder this$0, ViewHierarchyNode viewHierarchy) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewHierarchy, "$viewHierarchy");
        final Canvas canvas = new Canvas(this$0.screenshot);
        canvas.setMatrix(this$0.getPrescaledMatrix());
        viewHierarchy.traverse(new Function1<ViewHierarchyNode, Boolean>() { // from class: io.sentry.android.replay.ScreenshotRecorder$capture$1$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(ViewHierarchyNode node) {
                Pair pair;
                Integer dominantColor;
                Intrinsics.checkNotNullParameter(node, "node");
                if (node.getShouldMask() && node.getWidth() > 0 && node.getHeight() > 0) {
                    if (node.getVisibleRect() == null) {
                        return false;
                    }
                    if (node instanceof ViewHierarchyNode.ImageViewHierarchyNode) {
                        List listListOf = CollectionsKt.listOf(node.getVisibleRect());
                        ScreenshotRecorder screenshotRecorder = this.this$0;
                        pair = TuplesKt.to(listListOf, Integer.valueOf(screenshotRecorder.dominantColorForRect(screenshotRecorder.screenshot, node.getVisibleRect())));
                    } else {
                        boolean z2 = node instanceof ViewHierarchyNode.TextViewHierarchyNode;
                        int iIntValue = ViewCompat.MEASURED_STATE_MASK;
                        if (z2) {
                            ViewHierarchyNode.TextViewHierarchyNode textViewHierarchyNode = (ViewHierarchyNode.TextViewHierarchyNode) node;
                            TextLayout layout = textViewHierarchyNode.getLayout();
                            if ((layout != null && (dominantColor = layout.getDominantTextColor()) != null) || (dominantColor = textViewHierarchyNode.getDominantColor()) != null) {
                                iIntValue = dominantColor.intValue();
                            }
                            pair = TuplesKt.to(ViewsKt.getVisibleRects(textViewHierarchyNode.getLayout(), node.getVisibleRect(), textViewHierarchyNode.getPaddingLeft(), textViewHierarchyNode.getPaddingTop()), Integer.valueOf(iIntValue));
                        } else {
                            pair = TuplesKt.to(CollectionsKt.listOf(node.getVisibleRect()), Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
                        }
                    }
                    List list = (List) pair.component1();
                    this.this$0.getMaskingPaint().setColor(((Number) pair.component2()).intValue());
                    Canvas canvas2 = canvas;
                    ScreenshotRecorder screenshotRecorder2 = this.this$0;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        canvas2.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, screenshotRecorder2.getMaskingPaint());
                    }
                }
                return true;
            }
        });
        ScreenshotRecorderCallback screenshotRecorderCallback = this$0.screenshotRecorderCallback;
        if (screenshotRecorderCallback != null) {
            screenshotRecorderCallback.onScreenshotRecorded(this$0.screenshot);
        }
        this$0.lastCaptureSuccessful.set(true);
        this$0.contentChanged.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dominantColorForRect(Bitmap bitmap, Rect rect) {
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        getPrescaledMatrix().mapRect(rectF);
        rectF.round(rect2);
        getSinglePixelBitmapCanvas().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return getSinglePixelBitmap().getPixel(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint getMaskingPaint() {
        return (Paint) this.maskingPaint$delegate.getValue();
    }

    private final Matrix getPrescaledMatrix() {
        return (Matrix) this.prescaledMatrix$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getSinglePixelBitmap() {
        return (Bitmap) this.singlePixelBitmap$delegate.getValue();
    }

    private final Canvas getSinglePixelBitmapCanvas() {
        return (Canvas) this.singlePixelBitmapCanvas$delegate.getValue();
    }

    public final void bind(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.rootView = new WeakReference<>(root);
        ViewsKt.addOnDrawListenerSafe(root, this);
        this.contentChanged.set(true);
    }

    public final void capture() throws Throwable {
        if (!this.isCapturing.get()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
            return;
        }
        if (!this.contentChanged.get() && this.lastCaptureSuccessful.get()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Content hasn't changed, repeating last known frame", new Object[0]);
            ScreenshotRecorderCallback screenshotRecorderCallback = this.screenshotRecorderCallback;
            if (screenshotRecorderCallback != null) {
                screenshotRecorderCallback.onScreenshotRecorded(this.screenshot);
                return;
            }
            return;
        }
        WeakReference<View> weakReference = this.rootView;
        final View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        final Window phoneWindow = WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
        } else {
            this.mainLooperHandler.post(new Runnable() { // from class: io.sentry.android.replay.ScreenshotRecorder$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ScreenshotRecorder.capture$lambda$2(this.f$0, phoneWindow, view);
                }
            });
        }
    }

    public final void close() {
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        if (!this.screenshot.isRecycled()) {
            this.screenshot.recycle();
        }
        this.isCapturing.set(false);
    }

    public final ScreenshotRecorderConfig getConfig() {
        return this.config;
    }

    public final SentryOptions getOptions() {
        return this.options;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        WeakReference<View> weakReference = this.rootView;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
        } else {
            this.contentChanged.set(true);
        }
    }

    public final void pause() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
    }

    public final void resume() {
        View view;
        WeakReference<View> weakReference = this.rootView;
        if (weakReference != null && (view = weakReference.get()) != null) {
            ViewsKt.addOnDrawListenerSafe(view, this);
        }
        this.isCapturing.set(true);
    }

    public final void unbind(View view) {
        if (view != null) {
            ViewsKt.removeOnDrawListenerSafe(view, this);
        }
    }
}
