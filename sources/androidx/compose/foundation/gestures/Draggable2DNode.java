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
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: Draggable2D.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007njG9LeN.ZS@\u000fs{:%c$\bCCU0}*\teNog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4Icxe\u0012\u001d˰JoU3UoC9htL\u0005(2(<\u0002\u0005\u0017\u001a2H&v\u0003CQ\u0016\u0018ؓV\u0081jR;LEܓ\u0012\u0016B.\u00016\\\u0016OFXz_R;3\u0005yB|+o2\rM;K\u0003*\u001dzo$C@e:%+a\n\u001fTq>1G\u0002A\u0013q?'YN\u0004[Db\u0018\u0014C0_Icr4g\u001d\bf\u000b7-_cy]\u001e9\b\n*\u001bʀ\b\u0018\f6X43*v\n\u00149\u001b\u0004cH`\bnD\u0010z\u0010IE7\u00107;;1e\u007fui%\u05ee;{\u000b\".D\u0007n/ql)p&+c&_śUJCW^\u0010_M}\u0006vh(;\u00142W\u007f]\u000f?1'a=[G:9\"\bGTi\u0007\u0005\u000fuczbWn:å\u001aA0\u0018\u001c`Jt\u0015mVZ~E!U,Z\u0017\u007f\u0018\u0013No&N1) Peg\u0018~{iܦ)/lLi\u0010q\u000eeSvNEbs\u001f\u0010jλ\u0018IBq\u0015^lRc\u000e`bN;BJz\u0010&\u000frQܟ\u00172M\rd\u007f:N1\\C[3YP_\u0015@eYx-\u000foC5\u0013xR\u0015֊\u0005Zb\u007f\u007fm~Y<~f(Sba7)&\u00045\u00177\r+\u0017\u0005\u0004\u0002WgzZz~&ye}6\u0015HM\u007fN\u0004жMɒ-2\u0010O\u000ed\u0001piM@:+\u0001\b Sh\\uN~Ӫ+ߌʧNQZ:0\u001b'\u000b1\u001f|\u007f(tv~U|l\u000b\nV\u0010\u0007ľXߢҡ<~\u000bD,IIu0\u0006M-q,c*@ҵ/#\bui\u001eA*f\u001d&\re2-\u0014&}diiB=HI\b\u0003N$4l1Gvm(\fP\u000fL\raMqj~]PO!.,n70\u001byn[h\u0018 \u0002B8w*\"H.PdC3\u001ce\nml}Ml\u000bx\u001c\u001a\u001c\f@\u001d εA*\\fr\u000f6\u0016\u0004\u001a<Gas\u0015D\u0019*D.L\b9V\u0003{\u0016\u0014\u000b\u0002\\^=+`NǠ?V\u0014i)\u0019\\H\u0013w]\u0017')\u0011\u0001\u001f3L\u0006EB\u0015|tlвg<\u0007b-\u000f!z_\u0001l+Q]dA+.h\u0003\u001bE\fVw\u0014F\bW+\u0004j\u001e f$Ԡ!B\u001e0ir\u0017_\u0005Fv&eu^s% ؉VX(8\u000f\u0001\u0003\u001eL\f\u0015\u0011?`\u0003qr-za&:s;\u0007\u0017RC\u001f'\rtV*[\u001e\u05f91GOy$-\u0002gc=\u0004\u000eF97\u0006\u0005!\u000bj<iŭa\u001bH=:*p*!\u0013~.,.x\u00039\n܍\u0007ˆс\u00065\b<l\u00044\f/h?+\u001b\u001ejK\u0017\u0011Pcڒbߛό\u000f\u0005l\\d$?T^3!B]?#g\tHñW*^ \u0010\u001a\u001b6/8\u000ehO!_exp\u001ab\n\u0010\u0002ԝwˮe18ܼnB-\u0005\u000e:0S8\u0017KV{Kt\u001al{peеbt.s\u0005\u0012/$\r\u0001Nd7$DN\u0003$t1G\u0019Mn;Yp\u000b\u0014G_%OE\u0001Kװ;2\u0011\u0005~ϖ\u001dܾ>d|\u007f8^Y\u001a\u000e\u0002DHVeM)Uqޡqn\t5[K>R\u0018.\u0017\u00147Hj:0>\u000b-J>(߅M˵\u0015\u0001\u001dƉV4\u00150M!WR5,\u0011|/\u001aO\u000bAzh\f٥v-5\u001e\u007f!]vK';kr@\u001c\nuP\u000fOsV=tZ[EI.{k?.\u001eM0ڱ\nu)\u0015\u001cʼT\u008dc^HV\u0002sT28@\u0007DQLC\u0530\u007fԤ0i ĵ5go=YzB\u001e\u001bî6̘p\u0007Mހ9\u0006\u0019D%EB8eѫ5ط\u001b|\u0018ށƃ@0QuSүx\f;Αw0"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0006eL6Mv|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0016\u001e#wqF\u0007L6Mv|", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0006eQ;J\u0006'\u001d", "1`]\u0011e(@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "", "3mP/_,=", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "AsP?g\u000bKO\u001bb\u0003f,{\r+t\u007f/\u0010", "@de2e:>2\u001d\fz\\;\u0001\u00138", "=m3?T.,b\u0015\f\n^+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsP?g,=>#\r~m0\u0007\u0012", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "=m3?T.,b\u0015\f\n", "=m3?T.,b#\n\u0006^+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "Dd[<V0Mg", "=m3?T.,b#\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017\"Hg6 \u0011eh9SB\u001a]r6G\"52fayA\u001d[_\u001fVt\u000e\u0015b?3rN@-Q\rY\u000b9w\u0005\u0016\u001fY\u000b_W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000fc4t\u0015^\u0019k>D-]u\"*h]*\b\u000bW\u001b{\u001cawvC\u0016\u00028\bG|[SAmd@~0\rU\f\u0005\u00102.i [3\u000eC1:mNPx \b_\t\u001e*kE1/D\u0006sOTa\u0005pH\u00176tH\u000e\u0018q<5\"/jtPX\bm YDei\nE\u001cfNRm$+P\b\u000e1`\u001b\u0013\u0016+qn\u0013H,\\J\u001b\u0001M n\u0015\r\fta|>\u001f;h\u0013r3-\r4\u0019\u0013w?\u0010\u0005#H&x\u0012\u0011}Tpj[y-DBqY*1Z@\u0001[\u000fES\u0007", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "2qP4", "4na\u0012T*A2\u0019\u0006\nZ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(PU'N[J\u0002", "2qP47,Eb\u0015", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "=m3?T.,b\u0015\f\n^+D\u000fv4\u0007\u0014F(", "uI\u0018#", "=m3?T.,b#\n\u0006^+Dw\u00121[6W\u000b", "CoS.g,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017\"Hg6 \u0011eh9SB\u001a]r6G\"52fayA\u001d[_\u001fVt\u000e\u0015b?3rN@-Q\rY\u000b9w\u0005\u0016\u001fY\u000b_W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000fc4t\u0015^\u0019k>D-]u\"*h]*\b\u000bW\u001b{\u001cawvC\u0016\u00028\bG|[SAmd@~0\rU\f\u0005\u00102.i [3\u000eC1:mNPx \b_\t\u001e*kE1/D\u0006sOTa\u0005pH\u00176tH\u000e\u0018q<5\"/jtPX\bm YDei\nE\u001cfNRm$+P\b\u00101`\u001b\u0013\u0016+qn\u0013H,\\J\u001b\u0001M n\u0015\r\fta|>\u001f;h\u0013r3+\r4\u0019\u0013w?\u0010\u0005#H&x\u0012\u0011}Tpj[y-DBqY*1Z@\u0001[\u000fES\u0007", "@de2e:>7\u001agz^+|\b", "@de2e:>7\u001agz^+|\bvMeo^UT\u0007", "uI\u0018\u0017", "@de2e:>7\u001agz^+|\bvAbtH\u0013b\u0015", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Draggable2DNode extends DragGestureNode {
    public static final int $stable = 8;
    private Function1<? super Offset, Unit> onDragStart;
    private Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted;
    private Function1<? super Velocity, Unit> onDragStop;
    private Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped;
    private boolean reverseDirection;
    private boolean startDragImmediately;
    private Draggable2DState state;

    public /* synthetic */ Draggable2DNode(Draggable2DState draggable2DState, Function1 function1, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, boolean z4, Function3 function3, Function1 function12, Function3 function32, Function1 function13, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(draggable2DState, function1, z2, mutableInteractionSource, z3, z4, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? Draggable2DKt.NoOpOnDragStarted : function3, (-1) - (((-1) - i2) | ((-1) - 128)) != 0 ? Draggable2DKt.NoOpOnDragStart : function12, (i2 + 256) - (i2 | 256) != 0 ? Draggable2DKt.NoOpOnDragStopped : function32, (i2 + 512) - (i2 | 512) != 0 ? Draggable2DKt.NoOpOnDragStop : function13);
    }

    public Draggable2DNode(Draggable2DState draggable2DState, Function1<? super PointerInputChange, Boolean> function1, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, boolean z4, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function12, Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function32, Function1<? super Velocity, Unit> function13) {
        super(function1, z2, mutableInteractionSource, null);
        this.state = draggable2DState;
        this.startDragImmediately = z3;
        this.reverseDirection = z4;
        this.onDragStarted = function3;
        this.onDragStart = function12;
        this.onDragStopped = function32;
        this.onDragStop = function13;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.Draggable2DNode$drag$2, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable2D.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0001|\u0003fkD\u00079"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013\u0014\u000f\u0011\u001c\u0016cv\u0002$\u001a\u001c[\u001d,\u001c#`o", f = "\u0011>,10))2*u\u0007o,4", i = {}, l = {416}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Drag2DScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ Draggable2DNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Draggable2DNode draggable2DNode, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$forEachDelta = function2;
            this.this$0 = draggable2DNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$forEachDelta, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Drag2DScope drag2DScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(drag2DScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final Drag2DScope drag2DScope = (Drag2DScope) this.L$0;
                Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> function2 = this.$forEachDelta;
                final Draggable2DNode draggable2DNode = this.this$0;
                Function1<DragEvent.DragDelta, Unit> function1 = new Function1<DragEvent.DragDelta, Unit>() { // from class: androidx.compose.foundation.gestures.Draggable2DNode.drag.2.1
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
                        drag2DScope.mo740dragByk4lQ0M(draggable2DNode.m779reverseIfNeededMKHz9U(dragDelta.m742getDeltaF1C5BW0()));
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
        this.onDragStart.invoke(Offset.m3926boximpl(j2));
        if (!isAttached() || this.onDragStarted == Draggable2DKt.NoOpOnDragStarted) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new Draggable2DNode$onDragStarted$1(this, j2, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: onDragStopped-TH1AsA0 */
    public void mo728onDragStoppedTH1AsA0(long j2) {
        this.onDragStop.invoke(Velocity.m6866boximpl(j2));
        if (!isAttached() || this.onDragStopped == Draggable2DKt.NoOpOnDragStopped) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new Draggable2DNode$onDragStopped$1(this, j2, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void update$default(Draggable2DNode draggable2DNode, Draggable2DState draggable2DState, Function1 function1, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, boolean z4, Function3 function3, Function3 function32, Function1 function12, Function1 function13, int i2, Object obj) {
        if ((i2 + 64) - (64 | i2) != 0) {
            function3 = draggable2DNode.onDragStarted;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            function32 = draggable2DNode.onDragStopped;
        }
        if ((256 & i2) != 0) {
            function12 = draggable2DNode.onDragStart;
        }
        if ((i2 & 512) != 0) {
            function13 = draggable2DNode.onDragStop;
        }
        draggable2DNode.update(draggable2DState, function1, z2, mutableInteractionSource, z3, z4, function3, function32, function12, function13);
    }

    public final void update(Draggable2DState draggable2DState, Function1<? super PointerInputChange, Boolean> function1, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, boolean z4, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function32, Function1<? super Offset, Unit> function12, Function1<? super Velocity, Unit> function13) {
        boolean z5;
        if (!Intrinsics.areEqual(this.state, draggable2DState)) {
            this.state = draggable2DState;
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.reverseDirection != z4) {
            this.reverseDirection = z4;
            z5 = true;
        }
        this.onDragStarted = function3;
        this.onDragStopped = function32;
        this.onDragStart = function12;
        this.onDragStop = function13;
        this.startDragImmediately = z3;
        update(function1, z2, mutableInteractionSource, null, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m778reverseIfNeededAH228Gc(long j2) {
        return Velocity.m6881timesadjELrA(j2, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m779reverseIfNeededMKHz9U(long j2) {
        return Offset.m3944timestuRUvjQ(j2, this.reverseDirection ? -1.0f : 1.0f);
    }
}
