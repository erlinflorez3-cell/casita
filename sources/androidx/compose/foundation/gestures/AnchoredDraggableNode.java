package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9LeN.ZS@\u000fsڔ<$q$yCAY\"}0\tWȞog\u0005Jb\u000bY\u000f\u000e\u0016\u000fj4Ikxe\u0012\u00152JoU3UoKʠht<\u0006(288\u0002\u0005\u0007\u001c2H&v\u0003CQ\u0011\u001a0NuBR\u0013T\u000b\u001a(ßf\"\u0007Ȧjf~6vl\u001e\u0002?-\u0011jZT7a@|\u0004εtV7\u0011\u0005d6+n;E\u00193X\u001b\u0007\u0001aO\tMxU\u0007~&U1Yye>p\u0002*\u0014YX\u001dc\u00010t\u0007g_:2;SqWh\u000eV}ߡ\u007f\rJ\u0011VQ5YF-Hx8IA\b\u000b\u000bFO\u0012{R\u001b\u000brF&S\u0016Ĵ/C!}agA1^9\u0002\u000b373\u0003~!\nf<u%#d}a3a@kZ|$iA}\u0006\u0007a0E2D\u000eĠmɨ\u0015.%A\u007fsG@9k0Ztk\u0005#xh\u0002\t\u0019\\ڐ!Âގ;,\u000f,he-\u001dyrlXZ#} b*\u0016\bAD#\f͌ طŎRQn\u000fxn&\u00103;~7\bt2\" \u0007lYMQ\u0012\"\u0012\\\u0005\u0015WBr\u0007hfxͭ:\\\r,05`j>{,H\\\u0011+2mwL::81^+G1$rG\u000b\u0011w\\~\u000f-]c*\u0011s<v\u001f\u007f~g!su\u0005a,+fĘ1A_Ba:cI\u00014+B/~\"\u001f\u000egׯFƂ̡\u001aw[$.?bM_VU\u0013=#Q20Q\fLɢdʸ̊\u0016)\u0001'\b8\u0004|<\u0013 j\u001fX\tjxn\u001b\u0017ɪuܥѓ'\nj-\b\u0010\u000f\u000fU\u000fl\u000b\njqr1}\u0003Nʹ{þȷ\"'\u0007\u001f0+}DQW5\u0016&3W\u0015\u0010\n0oѼxaр%۩Ф\b.iG}\u0015\u001at@nPI\b#f\"R\u0019IBَiv\u06ddAކΌ\u00115Nur#'J[\u0019G}\u0015\rbMG¦]ǈ\u0017s\u001664m8\u0003\u0014\n\"a[%?Q*܍yߑO\\\u0013ͧ_\u0018\u0019\u0006Ip(\u001bk+-̳nס4\u0006{̸\u0007QIi\u001d>\u001f#b2\u0013ލ\u0017ͲXk\u000e\u0010\t\u0010\u0017k\u001d#JB\"A-\u0558`ܢ`VPγ1Wn\"B\u0007\u000f\u0011C\u001e/߶_\u0007D۱`вg2\tҵ\u07fc\t$rR\u0005ݜAYC\\9!G\u0098\u0005@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e.Js.G5X+\\(", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0016\u001e#wqF\u0007L6Mv|", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e.Js.G:](kRH", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "3mP/_,=", "", "@de2e:>2\u001d\fz\\;\u0001\u00138", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "=uT?f*K] \u0006Z_-|\u0007>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u000fFY\u000b.5z 5T#<l4\u001c$>", "AsP?g\u000bKO\u001bb\u0003f,{\r+t\u007f/\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017\u001fDi7(\"h`\u0018\u0014_.Pr$NL<;Xar\u0013z\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u0003Ex\n\u000b\u0012\u001d9ty\fX\u0010U\t%\u0003A720fcyPPAq.n\u00155\u0012C?65\u0010; \u0017qRwf\u0006]\u0018rN\u0003=NC\"yE.Bln\u0010Cy]G~5\u001f\u0015|\u0002\";Wp:x7\r}.?s\u0005Xc\u0016Mb\u0003\u001euDQ6\"3C\u0013#Truy:\fw#k\u0011{lE>\u0017e;JD\u0018\u0006j!_4t)~AZ\u0011HWo^(P\u000fKZu$\r\u0011-7OZC(b~'zK)?\u0012\u0004\u0003d'q#Y.", "7rA2i,Ka\u0019]~k,z\u00183o\t", "u(I", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "2qP4", "", "4na\u0012T*A2\u0019\u0006\nZ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(PU'N[J\u0002", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2qP47,Eb\u0015", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "=m3?T.,b\u0015\f\n^+", "AsP?g,=>#\r~m0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "=m3?T.,b\u0015\f\n^+D\u000fv4\u0007\u0014F(", "uI\u0018#", "=m3?T.,b#\n\u0006^+", "Dd[<V0Mg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "=m3?T.,b#\n\u0006^+Dw\u00121[6W\u000b", "CoS.g,", "@de2e:>7\u001agz^+|\b", "@de2e:>7\u001agz^+|\bvMeo^UT\u0007", "uI\u0018\u0017", "@de2e:>7\u001agz^+|\bvAbtH\u0013b\u0015", "Bn59b(M", "", "Bn59b(M\u001b\u001fFIe\u0018Gp", "uI\u0018\u0013", "Bn59b(M\u001b\baF::XS", "Bn>3Y:>b", "Bn>3Y:>b`\u000e\u000bK\u001c\u000e\u000e\u001b", "uE\u0018\u0017", "BnE2_6<W(\u0013", "BnE2_6<W(\u0013BZ+\u0002h\u0016r[", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class AnchoredDraggableNode<T> extends DragGestureNode {
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    private Boolean reverseDirection;
    private boolean startDragImmediately;
    private AnchoredDraggableState<T> state;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: onDragStarted-k-4lQ0M, reason: not valid java name */
    public void mo727onDragStartedk4lQ0M(long j2) {
    }

    public AnchoredDraggableNode(AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z2, Boolean bool, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z3) {
        super(AnchoredDraggableKt.AlwaysDrag, z2, mutableInteractionSource, orientation);
        this.state = anchoredDraggableState;
        this.orientation = orientation;
        this.reverseDirection = bool;
        this.overscrollEffect = overscrollEffect;
        this.startDragImmediately = z3;
    }

    private final boolean isReverseDirection() {
        Boolean bool = this.reverseDirection;
        if (bool == null) {
            return DelegatableNodeKt.requireLayoutDirection(this) == LayoutDirection.Rtl && this.orientation == Orientation.Horizontal;
        }
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\rӬD\u0012&\u0006\u0007l?ӄRep.\u0001TZ\u0019y}L*k&\u0002C\u0002UH\u0001hަ\u000e"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e\u001aL\u00012G\"", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\b* \"a#2\")fu", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {251}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, AnchoredDraggableNode<T> anchoredDraggableNode, Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
            this.$forEachDelta = function2;
            this.this$0 = anchoredDraggableNode;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$forEachDelta, this.this$0, continuation);
            anonymousClass2.L$0 = anchoredDragScope;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> function2 = this.$forEachDelta;
                final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                Function1<DragEvent.DragDelta, Unit> function1 = new Function1<DragEvent.DragDelta, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode.drag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DragEvent.DragDelta dragDelta) {
                        invoke2(dragDelta);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DragEvent.DragDelta dragDelta) {
                        if (((AnchoredDraggableNode) anchoredDraggableNode).overscrollEffect != null) {
                            OverscrollEffect overscrollEffect = ((AnchoredDraggableNode) anchoredDraggableNode).overscrollEffect;
                            Intrinsics.checkNotNull(overscrollEffect);
                            long jM722reverseIfNeededMKHz9U = anchoredDraggableNode.m722reverseIfNeededMKHz9U(dragDelta.m742getDeltaF1C5BW0());
                            int iM5280getUserInputWNlRxjI = NestedScrollSource.Companion.m5280getUserInputWNlRxjI();
                            final AnchoredDraggableNode<T> anchoredDraggableNode2 = anchoredDraggableNode;
                            final AnchoredDragScope anchoredDragScope2 = anchoredDragScope;
                            overscrollEffect.mo555applyToScrollRhakbz0(jM722reverseIfNeededMKHz9U, iM5280getUserInputWNlRxjI, new Function1<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode.drag.2.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
                                    return Offset.m3926boximpl(m729invokeMKHz9U(offset.m3947unboximpl()));
                                }

                                /* JADX INFO: renamed from: invoke-MK-Hz9U, reason: not valid java name */
                                public final long m729invokeMKHz9U(long j2) {
                                    float fNewOffsetForDelta$foundation_release = ((AnchoredDraggableNode) anchoredDraggableNode2).state.newOffsetForDelta$foundation_release(anchoredDraggableNode2.m724toFloatk4lQ0M(j2));
                                    AnchoredDraggableNode<T> anchoredDraggableNode3 = anchoredDraggableNode2;
                                    long jM725toOffsettuRUvjQ = anchoredDraggableNode3.m725toOffsettuRUvjQ(fNewOffsetForDelta$foundation_release - ((AnchoredDraggableNode) anchoredDraggableNode3).state.requireOffset());
                                    AnchoredDragScope.dragTo$default(anchoredDragScope2, fNewOffsetForDelta$foundation_release, 0.0f, 2, null);
                                    return jM725toOffsettuRUvjQ;
                                }
                            });
                            return;
                        }
                        AnchoredDragScope anchoredDragScope3 = anchoredDragScope;
                        AnchoredDraggableState anchoredDraggableState = ((AnchoredDraggableNode) anchoredDraggableNode).state;
                        AnchoredDraggableNode<T> anchoredDraggableNode3 = anchoredDraggableNode;
                        AnchoredDragScope.dragTo$default(anchoredDragScope3, anchoredDraggableState.newOffsetForDelta$foundation_release(anchoredDraggableNode3.m724toFloatk4lQ0M(anchoredDraggableNode3.m722reverseIfNeededMKHz9U(dragDelta.m742getDeltaF1C5BW0()))), 0.0f, 2, null);
                    }
                };
                this.label = 1;
                if (function2.invoke(function1, this) == coroutine_suspended) {
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
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.state, null, new AnonymousClass2(function2, this, null), continuation, 1, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: onDragStopped-TH1AsA0, reason: not valid java name */
    public void mo728onDragStoppedTH1AsA0(long j2) {
        if (isAttached()) {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, j2, null), 3, null);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z2, Boolean bool, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z3) {
        boolean z4;
        boolean z5 = true;
        if (!Intrinsics.areEqual(this.state, anchoredDraggableState)) {
            this.state = anchoredDraggableState;
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z4 = true;
        }
        if (!Intrinsics.areEqual(this.reverseDirection, bool)) {
            this.reverseDirection = bool;
        } else {
            z5 = z4;
        }
        this.startDragImmediately = z3;
        this.overscrollEffect = overscrollEffect;
        DragGestureNode.update$default(this, null, z2, mutableInteractionSource, orientation, z5, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m725toOffsettuRUvjQ(float f2) {
        float f3 = this.orientation == Orientation.Horizontal ? f2 : 0.0f;
        if (this.orientation != Orientation.Vertical) {
            f2 = 0.0f;
        }
        return OffsetKt.Offset(f3, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m726toVelocityadjELrA(float f2) {
        float f3 = this.orientation == Orientation.Horizontal ? f2 : 0.0f;
        if (this.orientation != Orientation.Vertical) {
            f2 = 0.0f;
        }
        return VelocityKt.Velocity(f3, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m723toFloatTH1AsA0(long j2) {
        return this.orientation == Orientation.Vertical ? Velocity.m6876getYimpl(j2) : Velocity.m6875getXimpl(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m724toFloatk4lQ0M(long j2) {
        return this.orientation == Orientation.Vertical ? Offset.m3938getYimpl(j2) : Offset.m3937getXimpl(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m721reverseIfNeededAH228Gc(long j2) {
        return Velocity.m6881timesadjELrA(j2, isReverseDirection() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m722reverseIfNeededMKHz9U(long j2) {
        return Offset.m3944timestuRUvjQ(j2, isReverseDirection() ? -1.0f : 1.0f);
    }
}
