package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Velocity;
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
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007njG9L͜P.hS2\u000fq{<$q$yCAU\"}8\tWN}gvJp\u000bK\u000f\u001c\u0016\u0001j2I]xs\u0012\u00172PoG3[ڎE9vt>ӌ(20=\u0002\u0005\u0007\u001e2H&v\u0003Ca\f\u001a0FrBR#M\r\u001a\u0018\u000bDĨ\u0017Ȧ\rg|5\tȕ\\J31\u0003\u0002B|(o@\u000bO%Rd)\u001dv\u0010\";BG5C*\u0002\u0006\u0017ViE\u001b? D\u0015l5/CI\"\\F^\u000e\u001d--e\f\f|6`\u0013\\x\fU0_\u001eY\\&^}y\f\u000fL\u0004<\u00147Y><Huڿ\u0012=z\u0003cFV\u0013nD\u0006\u0001\bH'-\u00109;;+f\u007fui,^;\f\u0007#\u001dQ\u0016\u001d.ƟX\u000ef++\u000f\u0006hI\bF<XP\u001aYk{\u0014\u0002r\u0011X\u001cΥK\n5\f!4\u001d6G]?)G\u0005\u0012PTm\u0007\u0007ph\u0002}\u0001[P&~\u0018M)7!\tQ\u0081\tkVjh0\u001fg4T5\u0003ݔ\u0017 j\u0013\u0005l3-fO\u0017}\u001b\tk(=fl6i\f{)gJnBcqӒ\u0014kX\u0007$EBs\u0015ZlHy-j^8\"`\\\u0019\u0013\b\u0004TT\u001c\u0015B? 0b?A\u001dl\u0017^\u0002LWo\u001cOݷ\u0019ӳ\u0014~bUl\u001bw0\r\t/d\rt}y\u0011IZ\f'6Ѓ@ٛڤ\u001d([EvXE;\u0015\u0016\f\u007fu{|KZ\u0006.u\u0004!f*ؖ8֗ȠA\u0015\u0015%7VJ3SW\u000be\u007fRX;Cܮx\u001db\u0001.\u0016\u001c\u001bt:`\u0003J}UG2\u0005`\u000b/\u0018f\u0010y\u0010J\u000bIsT9`lL#\u0007gBf8+\fO\"3\t\b\"+:]I5&.y*.Ck\u000em}9\u0012b=+% \u00128{Luaa_B;fWi\u0010N1R{úFRp\b\u0018H\u000fE\u001d5NG\u000b\u0003f@]\u0011?\u007fv\u0007Z!\u001fik>#q\u00143\\tX\u0001ʸ\u0002\u0014dYUK[j\u007f$sJl\rZ\u000f8\u0019\fB~!JU֕Zah\u0019@\fy)FCAh+U\u0019,D2L\n\u001bC\u0003}4#\u000b\u0004Va%\u0016`W\"Hټ\u0012T~r\u0007L\u0013z]`O/ܣ\u0003\u000fA9AI?-\u0006F\u0003>\f2/bc\tǾiʪǎj'1mbcc<f)#E\fhq\u0002d)\u000e)֏jƑɒ<\u001a\u0003HPBk}_\u001dw-6]\u001bWtN\u0013\u0005\"wb]P8Ή~\u0007\u0014L\u001a\u0015\u0011*_tuhS^^\u007fGI*\u0003'DW\u001b:\u0010sJ+/\u001c4[Rww͂+{]i\u0012վ\u0014Ù$)\ft/x(Rt!uQ@\u0015\u0002\u0018r\u00027!`1\u0014=x\rҽ\u000e8\u000eF_\b9\u0013#`_q\u001e:P/;r\u0016D[h'\u001e\u0012\u007fsre\r\u0019e_k({\u0094T\u001d\u000f=$ܛ\u001f͠^<\u0019S.ta\f\"\u001b>\u001fd\u000f9ϭ\u001c˹ghxա g\u001bEGkXf\bË^˗\u0002\u001f\u0002ǡT6b3-;\u0005R\u0015ļ\u0015ЁpB_В/v6d\r\fW\u0015SۋTր\u0015\u0013<Иݴ\u001ei7:\u001f۴w;Fׅ\u000b0"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\"\u0011b,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0016\u001e#wqF\u0007L6Mv|", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa'\u0016_;NL", "1`]\u0011e(@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "3mP/_,=", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "AsP?g\u000bKO\u001bb\u0003f,{\r+t\u007f/\u0010", "=m3?T.,b\u0015\f\n^+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsP?g,=>#\r~m0\u0007\u0012", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "=m3?T.,b#\n\u0006^+", "", "Dd[<V0Mg", "@de2e:>2\u001d\fz\\;\u0001\u00138", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017\"Hg6 \u0011eh9tr(]v|.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nWkt1soO`\u0014F\r^sK1sPg_CHKUk)`\u001bc'e\u0004<$\"\u0001)(h^ws\tW\u0011{auvkQ\"P-\u000b:vZSOsTO>%)S\u0007\u0002 2\"u5\u00056\u000309:n\u000e\u0015k!M^\u0006\u0011*kE1/\u007f$#NG`|l\"\u0017w\u001fn\u0004\fq9;\"SosU\r\u00073\fB;kn\b;[OCZw^(V\b@j}\u001f\u0012\u0015mNuRA*X\u000b#>\u001a\te\u001b\u0012\nj!e3'E#\u0010x3]FQ\u001d\u0012v\u0002l\fbA$tR\u0019;!g\u001fH", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "2qP4", "4na\u0012T*A2\u0019\u0006\nZ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(PU'N[J\u0002", "2qP47,Eb\u0015", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "=m3?T.,b\u0015\f\n^+D\u000fv4\u0007\u0014F(", "uI\u0018#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "=m3?T.,b#\n\u0006^+Dw\u00121[6W\u000b", "CoS.g,", "@de2e:>7\u001agz^+|\b", "@de2e:>7\u001agz^+|\bvMeo^UT\u0007", "uI\u0018\u0017", "@de2e:>7\u001agz^+|\bvAbtH\u0013b\u0015", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DraggableNode extends DragGestureNode {
    public static final int $stable = 8;
    private Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted;
    private Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped;
    private Orientation orientation;
    private boolean reverseDirection;
    private boolean startDragImmediately;
    private DraggableState state;

    public DraggableNode(DraggableState draggableState, Function1<? super PointerInputChange, Boolean> function1, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z4) {
        super(function1, z2, mutableInteractionSource, orientation);
        this.state = draggableState;
        this.orientation = orientation;
        this.startDragImmediately = z3;
        this.onDragStarted = function3;
        this.onDragStopped = function32;
        this.reverseDirection = z4;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableNode$drag$2, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\"\u001c\u001fsa\u000f"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013\u0014\u000f\u0011\u001c\u0016\u007f\"\u0018\u001aY\u001b*\u001a!^m", f = "\u0011>,10))2*q.6", i = {}, l = {305}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, DraggableNode draggableNode, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$forEachDelta = function2;
            this.this$0 = draggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$forEachDelta, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> function2 = this.$forEachDelta;
                final DraggableNode draggableNode = this.this$0;
                Function1<DragEvent.DragDelta, Unit> function1 = new Function1<DragEvent.DragDelta, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableNode.drag.2.1
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
                        dragScope.dragBy(DraggableKt.m783toFloat3MmeM6k(draggableNode.m790reverseIfNeededMKHz9U(dragDelta.m742getDeltaF1C5BW0()), draggableNode.orientation));
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
        Object objDrag = this.state.drag(MutatePriority.UserInput, new AnonymousClass2(function2, this, null), continuation);
        return objDrag == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDrag : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: onDragStarted-k-4lQ0M */
    public void mo727onDragStartedk4lQ0M(long j2) {
        if (!isAttached() || Intrinsics.areEqual(this.onDragStarted, DraggableKt.NoOpOnDragStarted)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new DraggableNode$onDragStarted$1(this, j2, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: onDragStopped-TH1AsA0 */
    public void mo728onDragStoppedTH1AsA0(long j2) {
        if (!isAttached() || Intrinsics.areEqual(this.onDragStopped, DraggableKt.NoOpOnDragStopped)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new DraggableNode$onDragStopped$1(this, j2, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(DraggableState draggableState, Function1<? super PointerInputChange, Boolean> function1, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z4) {
        boolean z5;
        boolean z6 = true;
        if (!Intrinsics.areEqual(this.state, draggableState)) {
            this.state = draggableState;
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z5 = true;
        }
        if (this.reverseDirection != z4) {
            this.reverseDirection = z4;
        } else {
            z6 = z5;
        }
        this.onDragStarted = function3;
        this.onDragStopped = function32;
        this.startDragImmediately = z3;
        update(function1, z2, mutableInteractionSource, orientation, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m789reverseIfNeededAH228Gc(long j2) {
        return Velocity.m6881timesadjELrA(j2, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m790reverseIfNeededMKHz9U(long j2) {
        return Offset.m3944timestuRUvjQ(j2, this.reverseDirection ? -1.0f : 1.0f);
    }
}
