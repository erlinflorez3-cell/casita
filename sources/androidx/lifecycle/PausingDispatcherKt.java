package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: PausingDispatcher.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<;!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007f\u0007tʑA0ZeP\u008cZS@\u000fs{:'c$\bCCU }:H]Ȟ\u007fg5Iz\rIƤ\u0014\u0015!jZI\u0006\u001ek\u0013'SHnO5]ok<p|F\u000b0428@\u0004/\u001e:L x\u0011By\u0011@2Ϯt:X\u0013\u0014İXŪ\n>.\b6\u001cuޮNH3\\Z1)ɅwAv'\u000e8-r\u001bGlH\u0013uq ;@e8%-c\t\u0017Tk?I> A\u0015l7)AH\"\\dZÿ\u0018\u00151USƦ1͉`\u0005_i$f9Y{K\u0017\rHy\u0001Ԉ\u001b;,\u000e4'xS;\u001b~)\u00142\u0005tc@~\u0005nJ\u0010\u0001q8'%F2Y=+jacQ\u0018|<*\u0007ڟ\"#\u0007tgƄ\u0013\u05f8d\u0015)[\u0010\u0011?[X=\u000fM*[CЧ\u0012o\u000b\u0002X\f`l\u000e0\u001424\u001659k9Q${\nXJwx\u0015`/R\u0018VXD2p,6X\u000e:\\ֈh\u0005qV\u001bИjҭQ\u001cb\u0010\u0016G!+tw\u0003 E\u0012Tиvh\u0013M\f\nUTt8q\u0010q\rg;n3cTs\u0018qX\u0007\u0016O<)\u0004\u0007jRW\u001c\\r'P7vlݻ{{JTRƖpƐu\u001cB3IXj `\u0003dAa~\u000fݠhg8~\u0003;T(w%\r*\u0007Olr\u007fg'L<\u0005p(=Ca5_%\u0004&x8\r%\u001d}\"\u0005ui֙KLr\u001c<ɥ:°\u001a\u001aGZG\u0005!\u001b\u0017)x\u0001MGRǩsPu\u0012Uz-}\u001dH\u0001.\u0016\u0016\u001b\u0016:a\u0003kUS'$\u0007^!&\u0018l\u0010\u007fqH\u000bG*S9_NM\u0003\u0005o;|=+\u0007ȷ\"%\u0007uhĤsԩG'+%߹\u0018?"}, d2 = {"EgT;69>O(~y", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\nix`\u0018]2\u0011\u000e#?.{NG.\f5I\u0010\u0005F\u000b\u0015%\u0012>zlQZ\u001aPOX\\F%yB#fuPC\u000fL'i\f],2", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DC|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u001b\u0001s\u000bcP+rM\u0001\u001d\u00129S\u0012Jl\n\f$W\u0013tyQZ\u0019Wu$yK2>\n@duX=\u000fi&m\u000e)\u0007Y?:\"#G", "EgT;E,Lc!~y", "EgT;F;:`(~y", "EgT;F;:b\u0019Z\nE,x\u0017>", ";h] g(MS", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc#hy/7C", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u000b@y)6z 2LV\u0005r8\u001f\u0015fu7\u000ecu5z(GJb*cR1+#\u000ei\u000e$\u0012\u0013\u000fhH(w\u000e<0\u0010uJ\u0012Df\u0010\u0010 \u0017C4QR_\u000eV}\u001f~\u000e~OLcn\u0001KJ\u000f`4q\u0016o,`C:2]O#$wT7\u001awb\u0015|[O+NL\u0015\f4mEidH\u000fYRAt%.!", ":hU2V@<Z\u0019Fxh4\u0005\u00138"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PausingDispatcherKt {
    @Deprecated(message = ":N\u0001CT\u0007\u001aXlL,:X\u0016?\u000e^Q\u000e5Dl\u0011b\tKqkby(&jQgCbomxO2rL'd_96`MzgJC\u0015\u0017\u0007#RZws\u0012s!\u0003@*R=\u007ff5\u0018|\\\u0013G\u007fSm<9T\u0004zf1\u0002\f%\u0004&W[e\u0011\u001c)\u0013>dQ4'?E%}\u00184D@bp\u000bH+aDq\u0006-eAW\u0014\r\tnpt\u001eIZp\r+':K\u0011U\u0011{\u0004%8\u007f{0Ldl=#.|\u0014oW5qdg\u0003(nb\u001d[k\u0017XO;$ \\@ I\u0014ZQ#oP$nS/\u001b'pEu>f\u00059DXB\u0018r4\u0005^\u001c1:\nA\u0018;~Ytu6I\u0018.\u000bs\u001a2M\u0007\u0014D\u00120/\u0014S)^1RWqh\u001fw\u001d.\u001eD e\f)Y<PcA3ho6$\u000fO\u001a@\u0016")
    @InterfaceC1492Gx
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return whenCreated(lifecycleOwner.getLifecycle(), function2, continuation);
    }

    @Deprecated(message = ":N\u0001CT\u0007\u001aXlL,:X\u0016?\u000e^Q\u000e5Dl\u0011b\tKqkby(&jQgCbomxO2rL'd_96`MzgJC\u0015\u0017\u0007#RZws\u0012s!\u0003@*R=\u007ff5\u0018|\\\u0013G\u007fSm<9T\u0004zf1\u0002\f%\u0004&W[e\u0011\u001c)\u0013>dQ4'?E%}\u00184D@bp\u000bH+aDq\u0006-eAW\u0014\r\tnpt\u001eIZp\r+':K\u0011U\u0011{\u0004%8\u007f{0Ldl=#.|\u0014oW5qdg\u0003(nb\u001d[k\u0017XO;$ \\@ I\u0014ZQ#oP$nS/\u001b'pEu>f\u00059DXB\u0018r4\u0005^\u001c1:\nA\u0018;~Ytu6I\u0018.\u000bs\u001a2M\u0007\u0014D\u00120/\u0014S)^1RWqh\u001fw\u001d.\u001eD e\f)Y<PcA3ho6$\u000fO\u001a@\u0016")
    @InterfaceC1492Gx
    public static final <T> Object whenCreated(Lifecycle lifecycle, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, function2, continuation);
    }

    @Deprecated(message = ":N\u0001Cd\t\u0016ilL,:X\u0016?\u000e^Q\u000e5Dl\u0011b\tKqkby(&jQgCbomxO2rL'd_96`MzgJC\u0015\u0017\u0007#RZws\u0012s!\u0003@*R=\u007ff5\u0018|\\\u0013G\u007fSm<9T\u0004zf1\u0002\f%\u0004&W[e\u0011\u001c)\u0013>dQ4'?E%}\u00184D@bp\u000bH+aDq\u0006-eAW\u0014\r\tnpt\u001eIZp\r+':K\u0011U\u0011{\u0004%8\u007f{0Ldl=#.|\u0014oW5qdg\u0003(nb\u001d[k\u0017XO;$ \\@ I$\\M4oP$nS/\u001b'pEu>f\u00059DXB\u0018r4\u0005^\u001c1:\nA\u0018;~Ytu6I\u0018.\u000bs\u001a2M\u0007\u0014D\u00120/\u0014S)^1RWqh\u001fw\u001d.\u001eD e\f)Y<PcA3ho6$\u000fO\u001a@\u0016")
    @InterfaceC1492Gx
    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return whenStarted(lifecycleOwner.getLifecycle(), function2, continuation);
    }

    @Deprecated(message = ":N\u0001Cd\t\u0016ilL,:X\u0016?\u000e^Q\u000e5Dl\u0011b\tKqkby(&jQgCbomxO2rL'd_96`MzgJC\u0015\u0017\u0007#RZws\u0012s!\u0003@*R=\u007ff5\u0018|\\\u0013G\u007fSm<9T\u0004zf1\u0002\f%\u0004&W[e\u0011\u001c)\u0013>dQ4'?E%}\u00184D@bp\u000bH+aDq\u0006-eAW\u0014\r\tnpt\u001eIZp\r+':K\u0011U\u0011{\u0004%8\u007f{0Ldl=#.|\u0014oW5qdg\u0003(nb\u001d[k\u0017XO;$ \\@ I$\\M4oP$nS/\u001b'pEu>f\u00059DXB\u0018r4\u0005^\u001c1:\nA\u0018;~Ytu6I\u0018.\u000bs\u001a2M\u0007\u0014D\u00120/\u0014S)^1RWqh\u001fw\u001d.\u001eD e\f)Y<PcA3ho6$\u000fO\u001a@\u0016")
    @InterfaceC1492Gx
    public static final <T> Object whenStarted(Lifecycle lifecycle, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, function2, continuation);
    }

    @Deprecated(message = ":N\u0001Ccy(leL,:X\u0016?\u000e^Q\u000e5Dl\u0011b\tKqkby(&jQgCbomxO2rL'd_96`MzgJC\u0015\u0017\u0007#RZws\u0012s!\u0003@*R=\u007ff5\u0018|\\\u0013G\u007fSm<9T\u0004zf1\u0002\f%\u0004&W[e\u0011\u001c)\u0013>dQ4'?E%}\u00184D@bp\u000bH+aDq\u0006-eAW\u0014\r\tnpt\u001eIZp\r+':K\u0011U\u0011{\u0004%8\u007f{0Ldl=#.|\u0014oW5qdg\u0003(nb\u001d[k\u0017XO;$ \\@ I#M_7hP$nS/\u001b'pEu>f\u00059DXB\u0018r4\u0005^\u001c1:\nA\u0018;~Ytu6I\u0018.\u000bs\u001a2M\u0007\u0014D\u00120/\u0014S)^1RWqh\u001fw\u001d.\u001eD e\f)Y<PcA3ho6$\u000fO\u001a@\u0016")
    @InterfaceC1492Gx
    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return whenResumed(lifecycleOwner.getLifecycle(), function2, continuation);
    }

    @Deprecated(message = ":N\u0001Ccy(leL,:X\u0016?\u000e^Q\u000e5Dl\u0011b\tKqkby(&jQgCbomxO2rL'd_96`MzgJC\u0015\u0017\u0007#RZws\u0012s!\u0003@*R=\u007ff5\u0018|\\\u0013G\u007fSm<9T\u0004zf1\u0002\f%\u0004&W[e\u0011\u001c)\u0013>dQ4'?E%}\u00184D@bp\u000bH+aDq\u0006-eAW\u0014\r\tnpt\u001eIZp\r+':K\u0011U\u0011{\u0004%8\u007f{0Ldl=#.|\u0014oW5qdg\u0003(nb\u001d[k\u0017XO;$ \\@ I#M_7hP$nS/\u001b'pEu>f\u00059DXB\u0018r4\u0005^\u001c1:\nA\u0018;~Ytu6I\u0018.\u000bs\u001a2M\u0007\u0014D\u00120/\u0014S)^1RWqh\u001fw\u001d.\u001eD e\f)Y<PcA3ho6$\u000fO\u001a@\u0016")
    @InterfaceC1492Gx
    public static final <T> Object whenResumed(Lifecycle lifecycle, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, function2, continuation);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 */
    /* JADX INFO: compiled from: PausingDispatcher.jvm.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d<;!&i\u0016DRш\r\u0004\b\u0005P\r4Ȑ\r!T\u0012&\u0007-ʜw"}, d2 = {"\n`]<a@F])\rS", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039xvtts\u000bu\u007fyCfx\u000e\r\u0004\n\u0004a\b\u0013\u0011\u0003\u0017\u0007\r\u000b\u0019r\u001dM\"\u0014\u0012\u001c\u0002$\u0012&\u0018t)\u0002\u001c\u0019,.^m", f = "\u001d-@=26.\n.73#5#'#/i%0&e\"*", i = {0}, l = {205}, m = "8>GA>9(KJH>H?", n = {"RepZdeNS;L"}, s = {"xQ^"})
    static final class AnonymousClass2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Lifecycle lifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_whenStateAtLeast, this.$minState, this.$block, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleController lifecycleController;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.finish();
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            Job job = (Job) ((CoroutineScope) this.L$0).getCoroutineContext().get(Job.Key);
            if (job == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            lifecycleController = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, job);
            try {
                this.L$0 = lifecycleController;
                this.label = 1;
                obj = BuildersKt.withContext(pausingDispatcher, this.$block, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lifecycleController.finish();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                lifecycleController.finish();
                throw th;
            }
        }
    }

    @Deprecated(message = ":N\u0001Cd\t\u0016k](<fU\u0016?b\u001cT\n:Dj\u0011W\u0005\u0006ro^\u0007)ii`iF\r^m<G3F?Q_`94mVN%R<\u0017KI S\u001e\u0002s\u0011\u0001Kpv,L\u0013\u000ff0\u000f;L\u0019R\u000bBB+9X\u0002zg$o\u0010_\t7W +\r\u001f(Vxd\u00134'CI%\u000f\u001f'OzY^Y4![Lq\u00064r>W\u0017\r\t=$\u007f I\u0017c\u0013%'}Q\u007f`\u00026W2*\u000fm0QneAKpm\u0018y/m|Vg4odd!U&\\-[<$.\u0005,\u001fFp_U6c>40a%i{N;h\u0005g/,Ces\"x4J2\u001a58\u0004\u0010\b<\fLt~@V\u001fZ_g\f\u0007z\u007f\u000b\n\u00075b\u000f#YbC[Win&\u0003\u001d)$Be9\u001a+YGvt=3hX7)\u0006K.0T\u00188C\u000b]t\"QF\b")
    @InterfaceC1492Gx
    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new AnonymousClass2(lifecycle, state, function2, null), continuation);
    }
}
