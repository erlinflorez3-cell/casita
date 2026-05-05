package kotlinx.coroutines.sync;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.dynatrace.android.agent.Global;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<K\u0007\"2\u0013\u007f\u0007|jA0R͜P\u008cZS@\u000fs{J$c$\bCCU0}*\tUPog|Kb\u000bY\u000f\u000e\u0016\u0007j4I[{e\u0012\u001d8JoE8UoS9ht<\u000b(20D\u0002\u0005\u0007\u001b0V&͌+Cy\u000bB0nprR8yE'\"\nL!\u0019\u001e\u000biߑ:Jr`H3k\u0011wYf'\u000e2-Q\u001bKl';}(2sPEM-%\u0002\u001c7XiD\u001bA\b<3om's_\u0002qNX.'E1]\u0012ut<[3X'Іe˦ScYkV>\u0006\u0017\u0014\rj\u0017>\f5MF/0e6\u0015yς1ՂDP\u0010y\u000b\u0010\t~N\u0017S\u0002c1G ~Sw:GU}\u0010M\u001d,A\u0019nOt\u0005\u0014n\u001a3V\u000eP_X\u0007=\u0011^\u0018xUm2\u0004\u0013\b8\tHI\u0016.*\u0018t+mSi_;!\u001a\u0015xLu\u0005\u001ddxSoSvKRt$<B\u000b\"YrkK}\u0019pfS)O2S5\u00058\u0019.a\u0010>7$>U\u007fnw\u0013e_ $]m}k7q\u001c\u0001Q^a_\u0018w`p`{,GLf\u0015Z|A\u0002\u0013\tb~β4\u0019d\u001e\u007f\u00140^!#EOq\"5Z<Ǭ`\u001fN\u000f.HG\n\u0019a`n6\rdF4\u0014\u007f##\u0010ɹTfv{w~O9\rb(3g`E,6f8gb\u0004ɠ\u000b\ty\fWmRT\\n\u001c{{\f02*Sa1M\u0013=\u001096\u0012/[K!laO\"')\u000f\n\u0011Kh\\z6t\u001f6Ij)X+Ϣ$Ցbt+\br\u0014JsT\u0010_c\u0003\r\u0012\u0013 Ζ\u0005ʾ@RP~\u000b4,;Q\u00160\u001dM;S+-\u0018\u000e\u0013]\u001cq_yo\\y\u00110\\I<ה.І\u001ayrScTI[a[\u0005b0Iр\u0007o"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u0019a\t'\r", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011]\u000eDr08c\u000b \u0013v\u0015\u0016]R;~\u0018& o7", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u000b", ":nR8X+", "", "\nh]6g\u0005", "uY\u0018#", "=v]2e", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "", "=mB2_,<bvz\u0004\\,\u0004\u0010+t\u00042\u00050\n\u001e!EukF\u007f3Df\u000e\u001eFw#", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006`.\u0013U\u0007\u001e7t\u001d*\\GEt\u0012(\u001evpF\u0017a;X\u0004|", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Ad[2V;", ">`a.`", "7mc2e5:Z\u0006~\tn3\f", "", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "7r;<V2>R", "u(I", "6n[1f\u0013HQ\u001f", "6n[1f\u0013HQ\u001fb\u0003i3", "", ":nR8", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", ":nR8F<L^\u0019\by", "Bqh\u0019b*D", "Bqh\u0019b*D7!\n\u0002", "Cm[<V2", "=m;<V2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bA", "5dc\u001ca\u0013HQ\u001f=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u001ca\u0013HQ\u001f", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%\u0017No\fK\u0005n#Y\u0005 5|s5ISIk\u0001s", "=m;<V2+S\u001b_\u000bg*\f\r9n", "=m;<V2)`#|zl:i\t=u\u00077", "@dbB_;", "BnBAe0GU", "", "\u0011`]0X3EO\u0016\u0006z<6\u0006\u00183n\u0010$\u000bD\u000b \tK~\u0011&\t.5f", "!d[2V;\"\\'\u000evg*|z3t\u0003\u0012\u000eI\u0001$", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class MutexImpl extends SemaphoreAndMutexImpl implements Mutex {
    private static final /* synthetic */ AtomicReferenceFieldUpdater owner$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");
    private final Function3<SelectInstance<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLc\u0003\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjGӄLeN3ZS@\u000fs{B%c$\bCCU }*\teNogtMb\u000bQ\u0018\u000e\u0016~m4Ikxe\u0012%2JģG3coEʠhtD\u000b(݅*8\u0010\u0005\t\u001a0J\u0018v\u0011CS\f\u00183F\u0084<h҈}\u000b*\u0014\u0016>N\u0001L[\u0018NdI-zJ91\u0005\u0002H^)o0+M;Id-\u001bzy A?e:չ)U\t\r`b\b{MyU\u0007~&U0iy]̬f\t<\u0015YO=a\u00010t\u0005\u0018i<-9Z{Mf\rV|+G\u001bH\u001cU\u00168X=[(Ǵ\f\u00189\u0004\u0003YF`\u0012`H\u0006!rF(5\u000fy4ݰ\u001fpWpK\u001fTG\f\u0007\u0013$I\u000b~2kc<rڠ\u001f^}`AWFMXP\u0010_c\u0001\u0014rr\u0002X\u0004FF.<B%ѧ\u001b%Eo\u0002\u0010/\u0001\u001aHrg\u0017\u000bfåarzHn\"\u001f\u001aE4!\f!M\u0015Py\\l <\"]+\u0003\u0015ą\f\u001d&k\bB'5 PUn\u0010{]n\u001a4uoƠ]xq\u001dg?dCESi\u0016\b\\\u0007%OK\u0011\u0017ֽjLY\u001bjb.2BJp\u0016\u001e\u000fTP\u001c\u0013`?\b\u001bb9w-Å\u0019H\u00114\u000bR\u000b wZ\u0017(/ZA5\u001bk:s7\u000f\u0017ʫo8v\u0007bD|\u000f\"]E_O1&\u0004'/ج{k\u000e\r\u000f\u0018G\u0016L\u000eƚk^&c\u00188\u0016H9\u0002TK0' 9E\u0012>[K!s˛Q\u001c-\n\r\u007f\u0015Kx0m\u000e\u0011\u0002<bzJ}TEA_^QAN܄~B|T\u0017_c\u0003\u000b\fFW\u0013\u001b]LN>}3@N)\u000f\u0012:|cP\nۆ\u001c^,\"D-a\fi 2\bl'&#e4Mq\"\b\u007fanBJfW˕\u0003H(3|\tHXzy\u000eH/E\u001d5XA\u0013pl7{*u̦eO?\u001b\u0015n[h\u0013\u0018}bS\u0010.\u0002M\u0016\u0014\rCkݦL\u001cz{\u0014c\\9J7\n9!ar CU \u0005e)ז/N\t&^Y;\u0011\u0005l\u00132]DB\u0018\rST\u0018\u0006>%Fʢ^W2@J\f=l\r\u0003}\rZV\u000fxE\u000f!Z\u0007\r\u001aK \u000f4_\n4܆Swt@,k\u001f\u001f\u001a\u0019T/j3R\\Tg)n\u0087\u007f[YkEa\bF\u0006W)\u001ck\u001e\u000fn\u001cSܐDɓ\u001f9YΙ0\u0007>b#WzM\u0013{Hj)Ƒ$Ĺ\u0003z\u0005ɚ\r\u0011\u001d\u001e1O!\u00029ιO\u001f~Eo2\u0001E\\\u007fܤ\u000fMjTHE\u0006cE\u0014ƭmd.\n\u0006k;, vĀ*؝xP"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u0019a\t'uK\u00127KCBr0\u001b\u001ch?C\u0010r0W\u0007#VPX5NV\u0002@}$c\u000e[\u0001", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E2|\u001b&G|c", "1n]A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=\u0002\u001dsh\u000f", "=v]2e", "", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f+ E9uL\u0006%H=\u0006+>C|4WRBo=1^fkF\u0011s;R\u007f'U\u0016,(ePrD\u001b\u000eW\u0015N\t\u0017\u000ehE-~@F#\u00125-\nFoVr\u001b\nFf:IR\u0019IC~rF)fU/#j", "Bqh\u001fX:N[\u0019", Global.BLANK, "D`[BX", "7cT:c6MS\"\u000e", "=m2.a*>Z z\nb6\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`d@X", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1n]AX?M", "uKZ<g3B\\bn\u0004b;Ro4a\u0011$EG| \u0019\u0011Y\u000bAv#D/d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|Fag\u001etS'\u001e\u0001#H wF\u0001\t\u00051I\u007fJ>", "@dbB`,", "uKZ<g3B\\bn\u0004b;Ro5o\u000f/\u007fIJ\u001c(O9\u000fL\u007f#D]\b)E7v>VAJo>'b>%*", "1`]0X3", "", "1n\\=_,MS\u0006~\tn4|", "BnZ2a", "7mXA6(GQ\u0019\u0006\u0002Z)\u0001\u00103t\u0014", "7me<^,(\\vz\u0004\\,\u0004\u0010+t\u00042\u0005", "6`]1_,K", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d@\u0001.\u0018U\u0007\u001f>m#\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "AdV:X5M", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00135[\u0006 @|k", "7mS2k", "", "@dbB`,.\\\u0018\u0003\ti(\f\u00072e~", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "@dbB`,.\\\u0018\u0003\ti(\f\u00072e~\u001a\u007fO\u0004v*Eo\u0019Kz/>", "3wR2c;B]\"", "@dbB`,0W(\u0002", "@dbB_;", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "Bqh\u001fX:N[\u0019p~m/\\\u001c-e\u000b7\u007fJ\n", "7r00g0OS", "7r2.a*>Z ~y", "7r2<`7ES(~y", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    final class CancellableContinuationWithOwner implements CancellableContinuation<Unit>, Waiter {
        public final CancellableContinuationImpl<Unit> cont;
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public CancellableContinuationWithOwner(CancellableContinuationImpl<? super Unit> cancellableContinuationImpl, Object obj) {
            this.cont = cancellableContinuationImpl;
            this.owner = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit resume$lambda$6(MutexImpl mutexImpl, CancellableContinuationWithOwner cancellableContinuationWithOwner, Throwable th) {
            mutexImpl.unlock(cancellableContinuationWithOwner.owner);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit tryResume$lambda$3(MutexImpl mutexImpl, CancellableContinuationWithOwner cancellableContinuationWithOwner, Throwable th, Unit unit, CoroutineContext coroutineContext) {
            Object obj;
            if (DebugKt.getASSERTIONS_ENABLED() && (obj = MutexImpl.getOwner$volatile$FU().get(mutexImpl)) != MutexKt.NO_OWNER && obj != cancellableContinuationWithOwner.owner) {
                throw new AssertionError();
            }
            MutexImpl.getOwner$volatile$FU().set(mutexImpl, cancellableContinuationWithOwner.owner);
            mutexImpl.unlock(cancellableContinuationWithOwner.owner);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean cancel(Throwable th) {
            return this.cont.cancel(th);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void completeResume(Object obj) {
            this.cont.completeResume(obj);
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.cont.getContext();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void initCancellability() {
            this.cont.initCancellability();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void invokeOnCancellation(Function1<? super Throwable, Unit> function1) {
            this.cont.invokeOnCancellation(function1);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i2) {
            this.cont.invokeOnCancellation(segment, i2);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isActive() {
            return this.cont.isActive();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCancelled() {
            return this.cont.isCancelled();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCompleted() {
            return this.cont.isCompleted();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ void resume(Unit unit, Function1 function1) {
            resume2(unit, (Function1<? super Throwable, Unit>) function1);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ void resume(Object obj, Function3 function3) {
            resume((Unit) obj, (Function3<? super Throwable, ? super Unit, ? super CoroutineContext, Unit>) function3);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001t\u0006|\u001a\u0017g]-\r\\$-R\u001c`\u0011(\u0019(\r^\nU.kQw)v|_$VUa(9\\\u001f?O\u0017V\fz0\\\bOmCs\u0015\u001bY#Y/\u007fB\u00072\u000f~E0P\u0016\u0010\u001d+\u0016;T\u0011L|E/", replaceWith = @ReplaceWith(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: resume, reason: avoid collision after fix types in other method */
        public void resume2(Unit unit, Function1<? super Throwable, Unit> function1) {
            this.cont.resume(unit, function1);
        }

        public <R extends Unit> void resume(R r2, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3) {
            MutexImpl mutexImpl = MutexImpl.this;
            if (DebugKt.getASSERTIONS_ENABLED() && MutexImpl.getOwner$volatile$FU().get(mutexImpl) != MutexKt.NO_OWNER) {
                throw new AssertionError();
            }
            MutexImpl.getOwner$volatile$FU().set(MutexImpl.this, this.owner);
            CancellableContinuationImpl<Unit> cancellableContinuationImpl = this.cont;
            final MutexImpl mutexImpl2 = MutexImpl.this;
            cancellableContinuationImpl.resume(r2, new Function1() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MutexImpl.CancellableContinuationWithOwner.resume$lambda$6(mutexImpl2, this, (Throwable) obj);
                }
            });
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, Unit unit) {
            this.cont.resumeUndispatched(coroutineDispatcher, unit);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th) {
            this.cont.resumeUndispatchedWithException(coroutineDispatcher, th);
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            this.cont.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ Object tryResume(Object obj, Object obj2, Function3 function3) {
            return tryResume((Unit) obj, obj2, (Function3<? super Throwable, ? super Unit, ? super CoroutineContext, Unit>) function3);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public Object tryResume(Unit unit, Object obj) {
            return this.cont.tryResume(unit, obj);
        }

        public <R extends Unit> Object tryResume(R r2, Object obj, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3) {
            MutexImpl mutexImpl = MutexImpl.this;
            if (DebugKt.getASSERTIONS_ENABLED() && MutexImpl.getOwner$volatile$FU().get(mutexImpl) != MutexKt.NO_OWNER) {
                throw new AssertionError();
            }
            CancellableContinuationImpl<Unit> cancellableContinuationImpl = this.cont;
            final MutexImpl mutexImpl2 = MutexImpl.this;
            Object objTryResume = cancellableContinuationImpl.tryResume(r2, obj, new Function3() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return MutexImpl.CancellableContinuationWithOwner.tryResume$lambda$3(mutexImpl2, this, (Throwable) obj2, (Unit) obj3, (CoroutineContext) obj4);
                }
            });
            if (objTryResume != null) {
                MutexImpl mutexImpl3 = MutexImpl.this;
                if (DebugKt.getASSERTIONS_ENABLED() && MutexImpl.getOwner$volatile$FU().get(mutexImpl3) != MutexKt.NO_OWNER) {
                    throw new AssertionError();
                }
                MutexImpl.getOwner$volatile$FU().set(MutexImpl.this, this.owner);
            }
            return objTryResume;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public Object tryResumeWithException(Throwable th) {
            return this.cont.tryResumeWithException(th);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&˛\bDZc|\u0004G\u00068\u000b<Ȑ\u0007\"2\u0013\u007f\u0007tsA0JfP.`S2\u000fq|<$q$yCAU\"}8\tWȞog|PbŏK\u000f\u001c\u0016\u0001̓2ղW\u000fز:\u00118ԏ}>cS\u007f?I`;53 r?H\u0004\u0013\u000220X\u0012\u0007zyŷ:\u0012@F~<j\u000fc\u0004H\u0015ĂB\"\u0007\"jl\u0017NVru:]*3mPV?_^\u007f}\u0013T]?\u000f\r`L.\u0007K}%3]\u001b\u0007\u0001fo\tM}U\u0007~&U.\u0010\b Ef\r,\u0015YZ=a\u00014t\u0005\u007foR˃*\u0018~Y`&(&\u0006,\u0015J\u0015&\n7H4.Hx8\u0012A\b\u000bSndHޠAP\u000fo7/+\u00105;9QƘ\u007faq\u001d%ѡ}˿\u0011\u001e+Ч?1iV&b+\u001a\u0003z\b5(̽?˓R\naƝ>\u000b~w\u001a*2F\u001eĠ2ɮ\u0015E"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u0019a\t'u[\u00165MAJO=,$dj7\u0007U0]y\u0011YUN92", "\u001f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\u0018'$hnB\u0003j\u0002", "Ad[2V;", "=v]2e", "", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f+ E9uL\u0006%H=\u0006+>C|4WRBo=1^fkF\u0011s;R\u007f'U\u0016\\,cRpL\"[H\u000eU+\u000b\u0014=J2}@@\u001d\b\u0010R\u0011;u\n\b\u001dc\u001colSRYNu\u001ew\u000b\u0013eKY]\t\u001d\u00056", "Bqh X3>Q(", "", "1kPBf,(P\u001e~xm", "@dbB_;", "Ad[2V;\"\\\u0006~|b:\f\u0016+t\u00042\u0005+\u0004\u0013%G", "", "7mc2e5:Z\u0006~\tn3\f", "2hb=b:>=\"\\\u0005f7\u0004\t>i\n1", "2hb=b::P ~]Z5{\u0010/", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "7me<^,(\\vz\u0004\\,\u0004\u0010+t\u00042\u0005", "AdV:X5M", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00135[\u0006 @|k", "7mS2k", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private final class SelectInstanceWithOwner<Q> implements SelectInstanceInternal<Q> {
        public final Object owner;
        public final SelectInstanceInternal<Q> select;

        public SelectInstanceWithOwner(SelectInstanceInternal<Q> selectInstanceInternal, Object obj) {
            this.select = selectInstanceInternal;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void disposeOnCompletion(DisposableHandle disposableHandle) {
            this.select.disposeOnCompletion(disposableHandle);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public CoroutineContext getContext() {
            return this.select.getContext();
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i2) {
            this.select.invokeOnCancellation(segment, i2);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void selectInRegistrationPhase(Object obj) {
            MutexImpl mutexImpl = MutexImpl.this;
            if (DebugKt.getASSERTIONS_ENABLED() && MutexImpl.getOwner$volatile$FU().get(mutexImpl) != MutexKt.NO_OWNER) {
                throw new AssertionError();
            }
            MutexImpl.getOwner$volatile$FU().set(MutexImpl.this, this.owner);
            this.select.selectInRegistrationPhase(obj);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public boolean trySelect(Object obj, Object obj2) {
            MutexImpl mutexImpl = MutexImpl.this;
            if (DebugKt.getASSERTIONS_ENABLED() && MutexImpl.getOwner$volatile$FU().get(mutexImpl) != MutexKt.NO_OWNER) {
                throw new AssertionError();
            }
            boolean zTrySelect = this.select.trySelect(obj, obj2);
            MutexImpl mutexImpl2 = MutexImpl.this;
            if (zTrySelect) {
                MutexImpl.getOwner$volatile$FU().set(mutexImpl2, this.owner);
            }
            return zTrySelect;
        }
    }

    public MutexImpl(boolean z2) {
        super(1, z2 ? 1 : 0);
        this.owner$volatile = z2 ? null : MutexKt.NO_OWNER;
        this.onSelectCancellationUnlockConstructor = new Function3() { // from class: kotlinx.coroutines.sync.MutexImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1(this.f$0, (SelectInstance) obj, obj2, obj3);
            }
        };
    }

    public static /* synthetic */ void getOnLock$annotations() {
    }

    private final /* synthetic */ Object getOwner$volatile() {
        return this.owner$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getOwner$volatile$FU() {
        return owner$volatile$FU;
    }

    private final int holdsLockImpl(Object obj) {
        while (isLocked()) {
            Object obj2 = owner$volatile$FU.get(this);
            if (obj2 != MutexKt.NO_OWNER) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object lock$suspendImpl(MutexImpl mutexImpl, Object obj, Continuation<? super Unit> continuation) {
        Object objLockSuspend;
        return (!mutexImpl.tryLock(obj) && (objLockSuspend = mutexImpl.lockSuspend(obj, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objLockSuspend : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lockSuspend(Object obj, Continuation<? super Unit> continuation) throws Throwable {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            acquire((CancellableContinuation<? super Unit>) new CancellableContinuationWithOwner(orCreateCancellableContinuation, obj));
            Object result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 onSelectCancellationUnlockConstructor$lambda$1(final MutexImpl mutexImpl, SelectInstance selectInstance, final Object obj, Object obj2) {
        return new Function3() { // from class: kotlinx.coroutines.sync.MutexImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1$lambda$0(this.f$0, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSelectCancellationUnlockConstructor$lambda$1$lambda$0(MutexImpl mutexImpl, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        mutexImpl.unlock(obj);
        return Unit.INSTANCE;
    }

    private final /* synthetic */ void setOwner$volatile(Object obj) {
        this.owner$volatile = obj;
    }

    private final int tryLockImpl(Object obj) {
        while (!tryAcquire()) {
            if (obj == null) {
                return 1;
            }
            int iHoldsLockImpl = holdsLockImpl(obj);
            if (iHoldsLockImpl == 1) {
                return 2;
            }
            if (iHoldsLockImpl == 2) {
                return 1;
            }
        }
        if (DebugKt.getASSERTIONS_ENABLED() && owner$volatile$FU.get(this) != MutexKt.NO_OWNER) {
            throw new AssertionError();
        }
        owner$volatile$FU.set(this, obj);
        return 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public SelectClause2<Object, Mutex> getOnLock() {
        MutexImpl$onLock$1 mutexImpl$onLock$1 = MutexImpl$onLock$1.INSTANCE;
        Intrinsics.checkNotNull(mutexImpl$onLock$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$1, 3);
        MutexImpl$onLock$2 mutexImpl$onLock$2 = MutexImpl$onLock$2.INSTANCE;
        Intrinsics.checkNotNull(mutexImpl$onLock$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause2Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$2, 3), this.onSelectCancellationUnlockConstructor);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(Object obj) {
        return holdsLockImpl(obj) == 1;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return getAvailablePermits() == 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public Object lock(Object obj, Continuation<? super Unit> continuation) {
        return lock$suspendImpl(this, obj, continuation);
    }

    protected Object onLockProcessResult(Object obj, Object obj2) {
        if (Intrinsics.areEqual(obj2, MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER)) {
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return this;
    }

    protected void onLockRegFunction(SelectInstance<?> selectInstance, Object obj) {
        if (obj != null && holdsLock(obj)) {
            selectInstance.selectInRegistrationPhase(MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER);
        } else {
            Intrinsics.checkNotNull(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            onAcquireRegFunction(new SelectInstanceWithOwner((SelectInstanceInternal) selectInstance, obj), obj);
        }
    }

    public String toString() {
        return "Mutex@" + DebugStringsKt.getHexAddress(this) + "[isLocked=" + isLocked() + ",owner=" + owner$volatile$FU.get(this) + AbstractJsonLexerKt.END_LIST;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(Object obj) {
        int iTryLockImpl = tryLockImpl(obj);
        if (iTryLockImpl == 0) {
            return true;
        }
        if (iTryLockImpl == 1) {
            return false;
        }
        if (iTryLockImpl != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(Object obj) {
        while (isLocked()) {
            Object obj2 = owner$volatile$FU.get(this);
            if (obj2 != MutexKt.NO_OWNER) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(owner$volatile$FU, this, obj2, MutexKt.NO_OWNER)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }
}
