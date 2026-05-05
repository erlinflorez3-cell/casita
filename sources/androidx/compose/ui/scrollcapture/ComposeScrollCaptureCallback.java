package androidx.compose.ui.scrollcapture;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import androidx.core.internal.view.SupportMenu;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.random.Random;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
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
/* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{B*cҕyCQU\"Ԃ*\t]No˧vJp\u000bK\u000f\f\u0016\u0001jBI]ތe\u0012%2JģG3coEʠhtL\u0005(2(:\u0002\u0005\u0017\u001a2H\u0016w\u0001BaÈB0norQ-\u000e(*\u0016\u0014>8\u0001L]wRDJ\u0005]h23\u0007wFf'\u000e5\rQ\u001bLl';}Ґ\"+N?}#3`\u001b\u0007\u0001io\u0007M\u0001U\u0005\u00177m?\u0012 eGp\u007fB#[S\u001bo\u000b&\u000b\u0018\u0002d\u001a;CO\u0012`\u0001\u00126\u000e\u0013{;S4\u0018\u0014?`4=\u001cv\b<J#\f\u001aT\u0019\u001elS\u0018z\u00109G)\u000eEC9Iy\u0002eI/f7*\bS̗aъr!inV|#6lw\u007f?\u0002DK\\f\n\bR\u001e\u000e~q\u001a0\u00142W\u007f]\u0013?G]9\u007fyG?9k0Vtk\u0005\u0017xh\u0002|\u0003LN6\u0007\u0016e?9\u0010hS|\u0005\u001a`\u001blt\u001b[9l\u0007,\u0016; \u000b\u0016\u0003!m\u001a\\n\u0001i\u0019[\u0006\nSM-7*zy\u0012o9\r8\fȤeߧeR~ܝ\u0010Hp\u000bpfpZbȚ^͈&2PК`\u0004\nDf\fA3\u0016ڧ\u001eٜ01!¢eT\u0011'ZA+\u00136ʶtʐ\u0003T;ɴSu2\u007f!\u0001~hGהi֑M,\u0005ʠr9OSM\u0019TXx־6č'\u0007\u0007͞ûK\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0015$Qv\u0015:r0Di\u000b \u0001K 6XMIk\"\u001c\"rh@d_7]\u00074G*J3cOn;\u001ag", "\u001a`]1e6BRb\u0010~^>Fv-r\n/\u0003\u001e|\"&W|\u000e\u001ar,<Vy\u001e=C", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "DhTDc6Kbu\t\u000bg+\u000bl8W\u00041zJ\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", ":hbAX5>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0015$Qv\u0015:r0Di\u000b \u0001K 6XMIk\"\u001c\"rh@d_7]\u00074G*J3cOn;\u001aPH\f[5\u0014\f7=/}TD\u001fu,W\u0010?r\nr\u001a\u001cDjyBce", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIT>\u001d\u0015>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u0018;\u0016\th\u000b\bwS$\u001f\u0006;\u001fhAr\u0010\u0013\u001a\u0017H4nLc\u001aW\t\u0019~A72$cl\u0004WPIk*R\ni(\\\u0010! \u001dp&%lOASy]\u0019}\\\bg1W\u001dDF\"KwbMCk`K\u00054\u001f\u0015Y\u0002\u001a=b\u0003+b+\u0011>1=B\u0001Vv(K^V\u00113c>#$<z\u0001=Xm|s\u001c\ns.q\u0015\u000eP5?'iol/\u0013\u0015l\u0017d5n5D(", "@d`BX:M1#\u000f\u0004m", "", "Aba<_3-`\u0015|\u0001^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0015$Qv\u0015:r0Di\u000b \u0001Z\u00165IR?|4\f\u0013uk@\u000ec9$", "=mB0e6EZvz\u0006m<\n\t\u000fn~", "", "=mA2T+R", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "=mB0e6EZvz\u0006m<\n\t\u0013m{*{-\u0001#'G}\u001d", "Adb@\\6G", "\u001a`]1e6BRb\u0010~^>Fv-r\n/\u0003\u001e|\"&W|\u000e*v3C]\b)\r", "AhV;T3", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "1`_Ah9>/&~v", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "=m2<`7ES(~", "\u001aiPCTuNb\u001d\u0006D_<\u0006\u0007>i\n1E\u001e\u000b %Ww\u000eIL", "uKP;W9HW\u0018H\fb,\u000fR\u001dc\r2\u0003G^\u0013\"V\u007f\u001b<d%Cg\u0002*@C|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018<eV\u0002\u0007w\u001bizN)\u001cZ@G.}K;(Q*S\u000fEx\u0010\u0010\u001f\u000eC4NL_\u001fK\u0003%qP-rO/#`L=V^sk\bh\u001f&$7)\u0014o(p", "=mB0e6EZvz\u0006m<\n\t\u001de{5yC", "=mB0e6EZvz\u0006m<\n\t\u001dt{5\u000b", "2qPD7,;c\u001b[v\\2~\u00169u\t'", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "2qPD7,;c\u001bh\f^9\u0004\u0005C", "!ba<_3\u001cO$\u000e\u000bk,j\t=s\u00042\u0005'\u0005%&Gx\u000eI", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final ScrollCaptureSessionListener listener;
    private final SemanticsNode node;
    private int requestCount;
    private final RelativeScroller scrollTracker;
    private final IntRect viewportBoundsInWindow;

    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u00068\u000b4B\u0005\u0007Bߚ(\u0007\u0015i\u00026Re`.\u0001Tp34\u0002B&s$ D\u0002yܵ|̝ޞORoiti\t\nå\u0013\tȞ|i"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0015$Qv\u0015:r0Di\u000b \u0001K 6XMIk\"\u001c\"rh@d_7]\u00074G*J3cOn;\u001aPH\f[5\u0014\f7=/}TD\u001fu,W\u0010?r\nr\u001a\u001cDjyBce", "", "=mB2f:B]\"^\u0004],{", "", "=mB2f:B]\"l\nZ9\f\t.", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface ScrollCaptureSessionListener {
        void onSessionEnded();

        void onSessionStarted();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2, reason: invalid class name */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\u000b{\f\n\b\t\u0001\u007f\u0010\u0015\u0017\u0015\tRh\u0016\u0015\u0019\u0019\u001e\u0011\u007f\u0011!\u001f\u001d\u001eu\u0015%*,*\u001e|\u001c()  #,", f = "\u0010;8:8;,\u0019(62.-\u0003 .11-\u001f{\u0019#\"\u0017\u0015\u0016\u001d^\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u0013\u001b", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {129, 132}, m = ">>$5ECAB\u001a9INPNB'LAHG5IV[L[]", n = {"c^kY", "b[uY[eP", "RWrZghG(H?G", "cWtMWj/PD", "cWtMWj/HN", "c^kY", "b[uY[eP", "RWrZghG(H?G", "cWtMWj/PD", "cWtMWj/HN"}, s = {"xQ^", "xQ_", "xQ`", "uQ^", "uQ_", "xQ^", "xQ_", "xQ`", "uQ^", "uQ_"})
    static final class AnonymousClass2 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ComposeScrollCaptureCallback.this.onScrollCaptureImageRequest(null, null, this);
        }
    }

    public ComposeScrollCaptureCallback(SemanticsNode semanticsNode, IntRect intRect, CoroutineScope coroutineScope, ScrollCaptureSessionListener scrollCaptureSessionListener) {
        this.node = semanticsNode;
        this.viewportBoundsInWindow = intRect;
        this.listener = scrollCaptureSessionListener;
        this.coroutineScope = CoroutineScopeKt.plus(coroutineScope, DisableAnimationMotionDurationScale.INSTANCE);
        this.scrollTracker = new RelativeScroller(intRect.getHeight(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(RectHelper_androidKt.toAndroidRect(this.viewportBoundsInWindow));
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.scrollTracker.reset();
        this.requestCount = 0;
        this.listener.onSessionStarted();
        runnable.run();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\u000b{\f\n\b\t\u0001\u007f\u0010\u0015\u0017\u0015\tRh\u0016\u0015\u0019\u0019\u001e\u0011\u007f\u0011!\u001f\u001d\u001eu\u0015%*,*\u001e|\u001c()  #,e22\u0018)9756\u000e-=BDB6\u001b@5<;)=JO@OQ\u0002\u0010", f = "\u0010;8:8;,\u0019(62.-\u0003 .11-\u001f{\u0019#\"\u0017\u0015\u0016\u001d^\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u0013\u001b", i = {}, l = {116}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C07771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Rect $captureArea;
        final /* synthetic */ Consumer<Rect> $onComplete;
        final /* synthetic */ ScrollCaptureSession $session;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07771(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, Continuation<? super C07771> continuation) {
            super(2, continuation);
            this.$session = scrollCaptureSession;
            this.$captureArea = rect;
            this.$onComplete = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ComposeScrollCaptureCallback.this.new C07771(this.$session, this.$captureArea, this.$onComplete, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = ComposeScrollCaptureCallback.this.onScrollCaptureImageRequest(this.$session, RectHelper_androidKt.toComposeIntRect(this.$captureArea), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$onComplete.accept(RectHelper_androidKt.toAndroidRect((IntRect) obj));
            return Unit.INSTANCE;
        }
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        ComposeScrollCaptureCallback_androidKt.launchWithCancellationSignal(this.coroutineScope, cancellationSignal, new C07771(scrollCaptureSession, rect, consumer, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onScrollCaptureImageRequest(android.view.ScrollCaptureSession r18, androidx.compose.ui.unit.IntRect r19, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.IntRect> r20) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.onScrollCaptureImageRequest(android.view.ScrollCaptureSession, androidx.compose.ui.unit.IntRect, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1, reason: invalid class name */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\u000b{\f\n\b\t\u0001\u007f\u0010\u0015\u0017\u0015\tRh\u0016\u0015\u0019\u0019\u001e\u0011\u007f\u0011!\u001f\u001d\u001eu\u0015%*,*\u001e|\u001c()  #,e22\u0018)9756\u000e-=BDB6\u0017A8x\u0007", f = "\u0010;8:8;,\u0019(62.-\u0003 .11-\u001f{\u0019#\"\u0017\u0015\u0016\u001d^\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u0013\u001b", i = {}, l = {190}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Runnable $onReady;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Runnable runnable, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onReady = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ComposeScrollCaptureCallback.this.new AnonymousClass1(this.$onReady, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ComposeScrollCaptureCallback.this.scrollTracker.scrollTo(0.0f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ComposeScrollCaptureCallback.this.listener.onSessionEnded();
            this.$onReady.run();
            return Unit.INSTANCE;
        }
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureEnd(Runnable runnable) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, NonCancellable.INSTANCE, null, new AnonymousClass1(runnable, null), 2, null);
    }

    private final void drawDebugBackground(Canvas canvas) {
        canvas.drawColor(ColorKt.m4232toArgb8_81llA(Color.Companion.m4202hslJlNiLsg$default(Color.Companion, Random.Default.nextFloat() * 360.0f, 0.75f, 0.5f, 1.0f, null, 16, null)));
    }

    private final void drawDebugOverlay(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setTextSize(48.0f);
        canvas.drawCircle(0.0f, 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), canvas.getHeight(), 20.0f, paint);
        canvas.drawCircle(0.0f, canvas.getHeight(), 20.0f, paint);
        canvas.drawText(String.valueOf(this.requestCount), canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, paint);
        this.requestCount++;
    }
}
