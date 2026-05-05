package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
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
/* JADX INFO: compiled from: ContentInViewNode.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<řc$\bCCU }*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4I[|e\u0012%2JoE6UoK9hҚ>\u000562*8\u007f\u0006\t\u001a8M\u0018v\u0001PS\f(0Hp@U\u0015M\u0013 \u001a\u0006T \t\u001ebnTȤ^Ǎ\u000e:]\"3ipNW_^}}\rtV_\f:\"C;DE8-%\u0002\u0007\u0017ViD\u001b? C\u0015l5.CI\"_F^\u000e\u001d--e\f\f|͉`\u0005_kTC9l{K~,X\u0004\t\u001b%D\u0014\u0012\u0016)^-[+\u0015(Tޮ3ɤW@^#'P\u000e\u001dy6E6079X3f\u007fr\u0002-\u0017E\n(%\u001eQ%\u001f%i]&`C%\u001bw\u001aQ_eUH|\u001b\nA{*\tb0;44U'G{?F]%ܔZݽ؝%m\bpR\u0011?\rn\u0013kkhGn35\u0016\u007f2\u00177rFz\u0004\u001aa\u001bXt\u0017[Hl\u0007,&Y %\u0006JN=\u0010|m\u0019ox{u\f;.\u0015F\"\u0007y=o9\rQeUq@yR%,\u0006PѮ\u0004֚ڋFU\u0012\fjZjRV\u001e(w*x~\u0010!XWqJE\\5'\u0004-H16\tAԊ\bݠ˖l\u0012\u0005\nAZKo2,!\u0001~f7o0\u0017Wd\u0015`PKqUC\u001c>UPld\u00011\u000e\u0017s.O\u0018RUU\u0005\u0018\fT**^7G\u000bG=AI')`=]IZ/}Q{MmϘ|ʣ\u000e\u0090ÿ2i\u000e(~j)\bX\tl\u0017P1\u0007rQ \u0015\u0004\b\u001e^zu{\u001bޯ[ǥHͿè]>Tw\u000bCg<3A\b\"+=UCU.F}\u001a/#\u0012ui\u001eF@bр%۩Ф\b.iW}%\"i@GPI\b\f\u0015а&к\u0007BP۳H\u0016P\u0012L\u000fIGonGތDԪ\u000f/\u0006օW:\u001b~n]P\u0012\u001e\r\u000bʠkͫwC\u0006ж/Q3!eU}l\u001c\\3֨V؝\u000e\u000b\u0004ς?\u001e*O8V\u0006j_ݸ\u0012֯\u001c6Iݥ3\u0011J\f<4Z@^ՄOҰm\u0006\u0018ÿPRm\u0016/2p{\u0012ٜ\u001a֭|\\^ޠUlSe9*/\u0005eɿ א91\rև\u0017f=vJ\u0001\u0002%_Ɯ-ˍ\u0003l-Ľ\\V?/6mQ\u0017Ss[I0>Zڞ5Թoo\u0014Մh!+[0\u001bgiAc\u0005Gv\u000b\u0004|\r%MԤrǓMÝƏ}yէ\u0012D\u0012\u000f\u00195gtu|;gϘw@K\u001d\u0007ӡ`W\u0006\u0014|ieɺ1J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w+MDz4'$Lj*\u000bc>7\u0001&G\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@25`\b\u001e3|\u001a8V\r\u0018x8'\u0017LjH\u0011T0N\t\u0014GZY6eQrJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/EhY23z\u0016\u0016WB?l8\u001e\"Qk8\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g\u0002/;w\u001f\u0015WA7r\u0012(\u001evqA\u0007p\u0014Xu+HPN9E\\q=i", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "Aba<_3B\\\u001be\u0005`0z", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0019qc \u0011e0LL", "@de2e:>2\u001d\fz\\;\u0001\u00138", "", "0qX;Z\u0010Gb#o~^>j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w*P?t6\u0002\u001ewk*\u000bc><\u0002'E\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017-Ho4'$dp=\u0011l\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0006cQ-m@F#\u00125\u0013\u0004;v\u0010\u001c#\u000eC4^@c\u001aN\u0001\u0019~C\u0010rH]]O<(Ak)q\u0016c\u001co\u00048.\u001c|#)h\u001a/\u0014\f\\\u0010na}qp\u0011\u001bzF3Nz[T\u000fLb@})\u0003T\u000b\u0002\u00036X\u0007\u0019\u007f-\u0002\nm'", "0qX;Z\u0010Gb#o~^>i\t;u\u007f6\u000bN", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w*P?t6\u0002\u001ewk*\u000bc>;v3WL\\;G_vG!\u0016i\":;\r\u0015Y\u0017", "4nRBf,=1\u001c\u0003\u0002]", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "4nRBf,=1\u001c\u0003\u0002]\t\u0007\u00198d\u000e\t\tJ\t\u0002$G\u0001\u0012F\u00073\"Y\u0006 3{&;M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "7r0;\\4:b\u001d\t\u0004K<\u0006\u00123n\u0002", "Ag^B_+\u001ac(\t^g=x\u00103d{7{", "5dc [6NZ\u0018Z\u000bm6`\u0012@a\u0007,z<\u0010\u0017", "u(I", "BqP0^0GUy\txn:|\b\rh\u0004/z", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "DhTDc6Kb\u0007\u0003\u0010^", "5dc#\\,P^#\f\nL0\u0012\tvY|<\u0004'M\u0019UHy\u001eEu!D]\b)1z\u00165M?Ik", "u(9", "\u0018", "0qX;Z\nAW }^g;\u0007y3e\u0012", "", ":nR._\u0019>Q(", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "1`[0h3:b\u0019kz\\;]\u0013<P{5{I\u0010", "1`[0h3:b\u0019lxk6\u0004\u0010\u000ee\u00077w", "", "1n\\=h;>2\u0019\r\nb5x\u00183o\t", "1gX9W\tHc\"}\t", "1n]AT0GS&l~s,", "1n\\=h;>2\u0019\r\nb5x\u00183o\toe\u000b\u0007~$Am", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCzq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&TrG\u001c\u0012i\u001bbty\u0005WPy", "4h]159B\\\u001bb\u0004m6m\r/wl(\bP\u0001%&", "5dc\u0013b*Na\u0019}Xa0\u0004\b\fo\u00101zN", ":`d;V/\u001a\\\u001d\u0007vm0\u0007\u0012", "=m5<V<L0#\u000f\u0004]:Z\f+n\u0002(z", "<df\u000fb<GR'", "=mA2`,:a)\fz]", "Ahi2", "=mA2`,:a)\fz]s\u0007\u001e7zt\u0013_", "uI\u0018#", "@d[<V(MW#\bd_-\u000b\t>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@d[<V(MW#\bd_-\u000b\t>-\\\u0010\u000f+]\u001dz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCzq2", "@d`B\\9>0&\u0003\u0004`\u0010\u0006\u00189V\u0004(\u000e.\f\u0017\u0015", "CoS.g,", "1n\\=T9>B#", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "=sW2e", "1n\\=T9>B#F~E\tfv\rw", "uI9u<", "1n\\=T9>B#Fi^4gU@Q", "7r<.k\u001dBa\u001d{\u0002^", "7r<.k\u001dBa\u001d{\u0002^sfS5M\r\"y", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCzqB", " d`BX:M", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private BringIntoViewSpec bringIntoViewSpec;
    private LayoutCoordinates focusedChild;
    private Rect focusedChildBoundsFromPreviousRemeasure;
    private boolean isAnimationRunning;
    private Orientation orientation;
    private boolean reverseDirection;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;
    private boolean trackingFocusedChild;
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private long viewportSize = IntSize.Companion.m6813getZeroYbymL2g();

    /* JADX INFO: compiled from: ContentInViewNode.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z2, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z2;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* JADX INFO: renamed from: getViewportSize-YbymL2g$foundation_release */
    public final long m738getViewportSizeYbymL2g$foundation_release() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect calculateRectForParent(Rect rect) {
        if (IntSize.m6806equalsimpl0(this.viewportSize, IntSize.Companion.m6813getZeroYbymL2g())) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
        }
        return m734computeDestinationO0kMr_c(rect, this.viewportSize);
    }

    private final BringIntoViewSpec requireBringIntoViewSpec() {
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return bringIntoViewSpec == null ? (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec()) : bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object bringChildIntoView(Function0<Rect> function0, Continuation<? super Unit> continuation) throws Throwable {
        Rect rectInvoke = function0.invoke();
        if (rectInvoke == null || m736isMaxVisibleO0kMr_c$default(this, rectInvoke, 0L, 1, null)) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.bringIntoViewRequests.enqueue(new Request(function0, cancellableContinuationImpl)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public final void onFocusBoundsChanged(LayoutCoordinates layoutCoordinates) {
        this.focusedChild = layoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo700onRemeasuredozmzZPI(long j2) {
        Rect focusedChildBounds;
        long j3 = this.viewportSize;
        this.viewportSize = j2;
        if (m732compareToTemP2vQ(j2, j3) < 0 && (focusedChildBounds = getFocusedChildBounds()) != null) {
            Rect rect = this.focusedChildBoundsFromPreviousRemeasure;
            if (rect == null) {
                rect = focusedChildBounds;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && m735isMaxVisibleO0kMr_c(rect, j3) && !m735isMaxVisibleO0kMr_c(focusedChildBounds, j2)) {
                this.trackingFocusedChild = true;
                launchAnimation();
            }
            this.focusedChildBoundsFromPreviousRemeasure = focusedChildBounds;
        }
    }

    public final Rect getFocusedChildBounds() {
        if (!isAttached()) {
            return null;
        }
        LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(this);
        LayoutCoordinates layoutCoordinates = this.focusedChild;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return layoutCoordinatesRequireLayoutCoordinates.localBoundingBoxOf(layoutCoordinates, false);
            }
        }
        return null;
    }

    public final void launchAnimation() {
        BringIntoViewSpec bringIntoViewSpecRequireBringIntoViewSpec = requireBringIntoViewSpec();
        if (this.isAnimationRunning) {
            throw new IllegalStateException("launchAnimation called when previous animation was running".toString());
        }
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(new UpdatableAnimationState(bringIntoViewSpecRequireBringIntoViewSpec.getScrollAnimationSpec()), bringIntoViewSpecRequireBringIntoViewSpec, null), 1, null);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2 */
    /* JADX INFO: compiled from: ContentInViewNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUk\u0019\u0019 \u0012\u001c#x\u001f\b\u001c\u0019,\u0004&\u001c\u001e]'\u001d2,\"(\u00020,1&:077m|", f = "\u0010;9>.6;\u000f3\u001a,'8\u000e.\"\"i&.", i = {}, l = {196}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UpdatableAnimationState $animationState;
        final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$animationState = updatableAnimationState;
            this.$bringIntoViewSpec = bringIntoViewSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = ContentInViewNode.this.new AnonymousClass2(this.$animationState, this.$bringIntoViewSpec, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                        ContentInViewNode.this.isAnimationRunning = true;
                        this.label = 1;
                        if (ContentInViewNode.this.scrollingLogic.scroll(MutatePriority.Default, new AnonymousClass1(this.$animationState, ContentInViewNode.this, this.$bringIntoViewSpec, job, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    ContentInViewNode.this.bringIntoViewRequests.resumeAndRemoveAll();
                    ContentInViewNode.this.isAnimationRunning = false;
                    ContentInViewNode.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                    ContentInViewNode.this.trackingFocusedChild = false;
                    return Unit.INSTANCE;
                } catch (CancellationException e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                ContentInViewNode.this.isAnimationRunning = false;
                ContentInViewNode.this.bringIntoViewRequests.cancelAndRemoveAll((Throwable) null);
                ContentInViewNode.this.trackingFocusedChild = false;
                throw th;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1 */
        /* JADX INFO: compiled from: ContentInViewNode.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w6CIz4\u001d\u0003fnC\u000ej\u001aL\u00012G\""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUk\u0019\u0019 \u0012\u001c#x\u001f\b\u001c\u0019,\u0004&\u001c\u001e]'\u001d2,\"(\u00020,1&:077m|o}", f = "\u0010;9>.6;\u000f3\u001a,'8\u000e.\"\"i&.", i = {}, l = {201}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Job $animationJob;
            final /* synthetic */ UpdatableAnimationState $animationState;
            final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ContentInViewNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, Job job, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$animationState = updatableAnimationState;
                this.this$0 = contentInViewNode;
                this.$bringIntoViewSpec = bringIntoViewSpec;
                this.$animationJob = job;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$animationJob, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(NestedScrollScope nestedScrollScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(nestedScrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
                    this.$animationState.setValue(this.this$0.calculateScrollDelta(this.$bringIntoViewSpec));
                    this.label = 1;
                    if (this.$animationState.animateToZero(new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                        final /* synthetic */ NestedScrollScope $$this$scroll;
                        final /* synthetic */ Job $animationJob;
                        final /* synthetic */ UpdatableAnimationState $animationState;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00211(UpdatableAnimationState updatableAnimationState, Job job, NestedScrollScope nestedScrollScope2) {
                            super(1);
                            updatableAnimationState = updatableAnimationState;
                            job = job;
                            nestedScrollScope = nestedScrollScope2;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                            invoke(f2.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f2) {
                            float f3 = contentInViewNode.reverseDirection ? 1.0f : -1.0f;
                            ScrollingLogic scrollingLogic = contentInViewNode.scrollingLogic;
                            float fM835toFloatk4lQ0M = f3 * scrollingLogic.m835toFloatk4lQ0M(scrollingLogic.m833reverseIfNeededMKHz9U(nestedScrollScope.mo791scrollByOzD1aCk(scrollingLogic.m833reverseIfNeededMKHz9U(scrollingLogic.m836toOffsettuRUvjQ(f3 * f2)), NestedScrollSource.Companion.m5280getUserInputWNlRxjI())));
                            if (Math.abs(fM835toFloatk4lQ0M) < Math.abs(f2)) {
                                JobKt__JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + fM835toFloatk4lQ0M + " < " + f2 + ')', null, 2, null);
                            }
                        }
                    }, new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                        final /* synthetic */ UpdatableAnimationState $animationState;
                        final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00222(UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec) {
                            super(0);
                            updatableAnimationState = updatableAnimationState;
                            bringIntoViewSpec = bringIntoViewSpec;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke */
                        public final void invoke2() {
                            BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode.bringIntoViewRequests;
                            ContentInViewNode contentInViewNode = contentInViewNode;
                            while (true) {
                                if (!bringIntoViewRequestPriorityQueue.requests.isNotEmpty()) {
                                    break;
                                }
                                Rect rectInvoke = ((Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                                if (!(rectInvoke == null ? true : ContentInViewNode.m736isMaxVisibleO0kMr_c$default(contentInViewNode, rectInvoke, 0L, 1, null))) {
                                    break;
                                }
                                CancellableContinuation<Unit> continuation = ((Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation();
                                Unit unit = Unit.INSTANCE;
                                Result.Companion companion = Result.Companion;
                                continuation.resumeWith(Result.m8980constructorimpl(unit));
                            }
                            if (contentInViewNode.trackingFocusedChild) {
                                Rect focusedChildBounds = contentInViewNode.getFocusedChildBounds();
                                if (focusedChildBounds != null && ContentInViewNode.m736isMaxVisibleO0kMr_c$default(contentInViewNode, focusedChildBounds, 0L, 1, null)) {
                                    contentInViewNode.trackingFocusedChild = false;
                                }
                            }
                            updatableAnimationState.setValue(contentInViewNode.calculateScrollDelta(bringIntoViewSpec));
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1$1 */
            /* JADX INFO: compiled from: ContentInViewNode.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u0003\tIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "2d[AT", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class C00211 extends Lambda implements Function1<Float, Unit> {
                final /* synthetic */ NestedScrollScope $$this$scroll;
                final /* synthetic */ Job $animationJob;
                final /* synthetic */ UpdatableAnimationState $animationState;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00211(UpdatableAnimationState updatableAnimationState, Job job, NestedScrollScope nestedScrollScope2) {
                    super(1);
                    updatableAnimationState = updatableAnimationState;
                    job = job;
                    nestedScrollScope = nestedScrollScope2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                    invoke(f2.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f2) {
                    float f3 = contentInViewNode.reverseDirection ? 1.0f : -1.0f;
                    ScrollingLogic scrollingLogic = contentInViewNode.scrollingLogic;
                    float fM835toFloatk4lQ0M = f3 * scrollingLogic.m835toFloatk4lQ0M(scrollingLogic.m833reverseIfNeededMKHz9U(nestedScrollScope.mo791scrollByOzD1aCk(scrollingLogic.m833reverseIfNeededMKHz9U(scrollingLogic.m836toOffsettuRUvjQ(f3 * f2)), NestedScrollSource.Companion.m5280getUserInputWNlRxjI())));
                    if (Math.abs(fM835toFloatk4lQ0M) < Math.abs(f2)) {
                        JobKt__JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + fM835toFloatk4lQ0M + " < " + f2 + ')', null, 2, null);
                    }
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1$2 */
            /* JADX INFO: compiled from: ContentInViewNode.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class C00222 extends Lambda implements Function0<Unit> {
                final /* synthetic */ UpdatableAnimationState $animationState;
                final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00222(UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec) {
                    super(0);
                    updatableAnimationState = updatableAnimationState;
                    bringIntoViewSpec = bringIntoViewSpec;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke */
                public final void invoke2() {
                    BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode.bringIntoViewRequests;
                    ContentInViewNode contentInViewNode = contentInViewNode;
                    while (true) {
                        if (!bringIntoViewRequestPriorityQueue.requests.isNotEmpty()) {
                            break;
                        }
                        Rect rectInvoke = ((Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                        if (!(rectInvoke == null ? true : ContentInViewNode.m736isMaxVisibleO0kMr_c$default(contentInViewNode, rectInvoke, 0L, 1, null))) {
                            break;
                        }
                        CancellableContinuation<Unit> continuation = ((Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation();
                        Unit unit = Unit.INSTANCE;
                        Result.Companion companion = Result.Companion;
                        continuation.resumeWith(Result.m8980constructorimpl(unit));
                    }
                    if (contentInViewNode.trackingFocusedChild) {
                        Rect focusedChildBounds = contentInViewNode.getFocusedChildBounds();
                        if (focusedChildBounds != null && ContentInViewNode.m736isMaxVisibleO0kMr_c$default(contentInViewNode, focusedChildBounds, 0L, 1, null)) {
                            contentInViewNode.trackingFocusedChild = false;
                        }
                    }
                    updatableAnimationState.setValue(contentInViewNode.calculateScrollDelta(bringIntoViewSpec));
                }
            }
        }
    }

    public final float calculateScrollDelta(BringIntoViewSpec bringIntoViewSpec) {
        if (IntSize.m6806equalsimpl0(this.viewportSize, IntSize.Companion.m6813getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect rectFindBringIntoViewRequest = findBringIntoViewRequest();
        if (rectFindBringIntoViewRequest == null) {
            rectFindBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (rectFindBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long jM6820toSizeozmzZPI = IntSizeKt.m6820toSizeozmzZPI(this.viewportSize);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            return bringIntoViewSpec.calculateScrollDistance(rectFindBringIntoViewRequest.getTop(), rectFindBringIntoViewRequest.getBottom() - rectFindBringIntoViewRequest.getTop(), Size.m4003getHeightimpl(jM6820toSizeozmzZPI));
        }
        if (i2 == 2) {
            return bringIntoViewSpec.calculateScrollDistance(rectFindBringIntoViewRequest.getLeft(), rectFindBringIntoViewRequest.getRight() - rectFindBringIntoViewRequest.getLeft(), Size.m4006getWidthimpl(jM6820toSizeozmzZPI));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize();
        Rect rect = null;
        if (size > 0) {
            int i2 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                Rect rectInvoke = ((Request) content[i2]).getCurrentBounds().invoke();
                if (rectInvoke != null) {
                    if (m733compareToiLBOSCw(rectInvoke.m3970getSizeNHjbRc(), IntSizeKt.m6820toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect == null ? rectInvoke : rect;
                    }
                    rect = rectInvoke;
                }
                i2--;
            } while (i2 >= 0);
        }
        return rect;
    }

    /* JADX INFO: renamed from: computeDestination-O0kMr_c */
    private final Rect m734computeDestinationO0kMr_c(Rect rect, long j2) {
        return rect.m3974translatek4lQ0M(Offset.m3946unaryMinusF1C5BW0(m737relocationOffsetBMxPBkI(rect, j2)));
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c$default */
    static /* synthetic */ boolean m736isMaxVisibleO0kMr_c$default(ContentInViewNode contentInViewNode, Rect rect, long j2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j2 = contentInViewNode.viewportSize;
        }
        return contentInViewNode.m735isMaxVisibleO0kMr_c(rect, j2);
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c */
    private final boolean m735isMaxVisibleO0kMr_c(Rect rect, long j2) {
        long jM737relocationOffsetBMxPBkI = m737relocationOffsetBMxPBkI(rect, j2);
        return Math.abs(Offset.m3937getXimpl(jM737relocationOffsetBMxPBkI)) <= 0.5f && Math.abs(Offset.m3938getYimpl(jM737relocationOffsetBMxPBkI)) <= 0.5f;
    }

    /* JADX INFO: renamed from: relocationOffset-BMxPBkI */
    private final long m737relocationOffsetBMxPBkI(Rect rect, long j2) {
        long jM6820toSizeozmzZPI = IntSizeKt.m6820toSizeozmzZPI(j2);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            return OffsetKt.Offset(0.0f, requireBringIntoViewSpec().calculateScrollDistance(rect.getTop(), rect.getBottom() - rect.getTop(), Size.m4003getHeightimpl(jM6820toSizeozmzZPI)));
        }
        if (i2 == 2) {
            return OffsetKt.Offset(requireBringIntoViewSpec().calculateScrollDistance(rect.getLeft(), rect.getRight() - rect.getLeft(), Size.m4006getWidthimpl(jM6820toSizeozmzZPI)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: compareTo-TemP2vQ */
    private final int m732compareToTemP2vQ(long j2, long j3) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            return Intrinsics.compare(IntSize.m6807getHeightimpl(j2), IntSize.m6807getHeightimpl(j3));
        }
        if (i2 == 2) {
            return Intrinsics.compare(IntSize.m6808getWidthimpl(j2), IntSize.m6808getWidthimpl(j3));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: compareTo-iLBOSCw */
    private final int m733compareToiLBOSCw(long j2, long j3) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            return Float.compare(Size.m4003getHeightimpl(j2), Size.m4003getHeightimpl(j3));
        }
        if (i2 == 2) {
            return Float.compare(Size.m4006getWidthimpl(j2), Size.m4006getWidthimpl(j3));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void update(Orientation orientation, boolean z2, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = z2;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    /* JADX INFO: compiled from: ContentInViewNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007njG0LeN2ZS8\u001bsڔ:řqҕ\"CiTZ\u001f2\u0015]N\u007fo~Nj\rY\u000e4\u0018'k<Sc{u\u0018\u001f4Rom8{sެ=`\u0003<M&@-Py3\r`>\u0019%\u0005}[Q\u001c\u0014@@\u001f?\u0001\u0011̂\t \u001aßV\"\u0007%jo\u001fMVluB?'\u0013kXMUa^}֔\u0011L\\܋%xg'9Jˣ9\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w+MDz4'$Lj*\u000bc>7\u0001&G\u000b;,hbrK#g", "", "1ta?X5M0#\u000f\u0004]:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QLN52(\"rqH\u000bl,\\@\u0005CUL,cYn:\u001b\u00128\u0018W:\u0011\u000ei=3rN@tK\u001d", "5dc\u0010b5MW\"\u000fvm0\u0007\u0012", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt\u0013Pm\u000eC}!2`}}Av%2VS7z8(\u001e>", "5dc\u0010h9KS\"\u000eWh<\u0006\b=", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Request {
        public static final int $stable = 8;
        private final CancellableContinuation<Unit> continuation;
        private final Function0<Rect> currentBounds;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(Function0<Rect> function0, CancellableContinuation<? super Unit> cancellableContinuation) {
            this.currentBounds = function0;
            this.continuation = cancellableContinuation;
        }

        public final Function0<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        public final CancellableContinuation<Unit> getContinuation() {
            return this.continuation;
        }

        public String toString() {
            String str;
            CoroutineName coroutineName = (CoroutineName) this.continuation.getContext().get(CoroutineName.Key);
            String name = coroutineName != null ? coroutineName.getName() : null;
            StringBuilder sb = new StringBuilder("Request@");
            String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
            StringBuilder sbAppend = sb.append(string);
            if (name == null || (str = "[" + name + "](") == null) {
                str = "(";
            }
            return sbAppend.append(str).append("currentBounds()=").append(this.currentBounds.invoke()).append(", continuation=").append(this.continuation).append(')').toString();
        }
    }
}
