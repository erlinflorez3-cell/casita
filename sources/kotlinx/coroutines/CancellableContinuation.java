package kotlinx.coroutines;

import com.dynatrace.android.agent.Global;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&˛\bDZc|İI\u0006>\u00146B\u0005$4\u0012\u0006јnj?3Le^.ZS8\u0010s{J$c$wCCU0}*ޛWNugvJ`\u0012K\u000f\u001c\u0016\u0001jBI]xc\u0012\u00172XoG3SsC\u001fvҚ^\t&݅07\u0018ڎ1 :J vABy\fZQNvRT#L3!B\nL(\u0019\u001e\u0013ɡ~>NlkCG%\u0019hpUm\u0005݁\u0001M\u001bP\u001d \u001b|y A?e<5+Y\u0002\u0015]\u0004?9ӊ\"A\u0013p?'qT$]Da\u0018\u0016+*}\u0014\u000e>4h\u001d\u0019p\u001d7:}qׂT\u0018.\u0007\u000b\u0002\u0013L\u0014\u0010\f-n?=+v\u0017T>Ϣv]F_\u0012dH\u0010\u000bc<\u001dK\bC<I*\u0015cň?#TF\f\u000b\u0013.3\u0003t'\u0002g\u001eb%\u001b\u0003\fg0\u007fM\u0004mݳ\u000eYK\u0003L\u0001p\u0018B\u0006FF.6,\u0015<.=7\nGiF4\u0010V\\\u007fv3t\u0019Wwk`@Pu\\\\r\u000f\u001at\\d3\u007f\u0017y!>\u001fh4T5\u007f8\u001b&\\\u0006M9'&M}v0\u000f\u0016\u0012\u0018AGfem\u001f\u0011\u001ctQ\u007fCHat&`\u0001\u0005݀CFh\u0014hlHc\u001c\\b.HCXl w*X|+{2\u001e\u0010bXϜ5\u0019j5\u0011\u001a,cY|7s\u0003h>!\u000572\u000b\u0002$+էGuʷtou\u001c\u0012>\u000b\u0005:-oe]\u0019TwRlB\u0014;\u0007-\u0002Fl0\u0005Uq\u0005\u0016$i,$$\"QQeˋC0\r5J\u001f=V\\\u0002\u0014_̊\u00161\u0001\f\n\u0015Ax>i\u000ep\u0017=plZO\u0003+8u\r\u0012i-ܐ\u0004yolC4qy#[l]\u0013\t_;\\C%\u0005UǇU\u0005}*\u00155sNWh$\u0004,v%rmx\u001e<ԃf\u0019,\u0004u\n2s&qhW\u0004CKIYhEIѐ(v\tQXp}\u0018R\u000b:\u0013YPQu\u0001ef_ߵ3\bl\u0016<\u0013vfk<\u0019u$G>a:sq\u0012*]q2WqϬkm{r-\u001bX\u0010\"\u000b*3E݅\u001eݞ$Zod\u000f1\u0014vhFO?z\u0005j\u000bzҰ.ѧ\f\u000f[Vo\n\u001e}PVm\u0014/2pu\u0012ڀ\u0010֭|`nJ\u000beScՉ.)"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "\"", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "7r00g0OS", "", "u(I", "7r2<`7ES(~y", "7r2.a*>Z ~y", "Bqh\u001fX:N[\u0019", "", "D`[BX", "7cT:c6MS\"\u000e", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", Global.BLANK, "=m2.a*>Z z\nb6\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`d@X", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1n]AX?M", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WxbH@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b", "Bqh\u001fX:N[\u0019p~m/\\\u001c-e\u000b7\u007fJ\n", "3wR2c;B]\"", "1n\\=_,MS\u0006~\tn4|", "BnZ2a", "7mXA6(GQ\u0019\u0006\u0002Z)\u0001\u00103t\u0014", "1`]0X3", "7me<^,(\\vz\u0004\\,\u0004\u0010+t\u00042\u0005", "6`]1_,K", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d@\u0001.\u0018U\u0007\u001f>m#\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "@dbB`,.\\\u0018\u0003\ti(\f\u00072e~", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0014]\f+3|\u00141MP\u0011R9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016c", "@dbB`,.\\\u0018\u0003\ti(\f\u00072e~\u001a\u007fO\u0004v*Eo\u0019Kz/>", "@dbB`,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u0002\u0012g", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00101\u0002\u0012g", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface CancellableContinuation<T> extends Continuation<T> {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(CancellableContinuation cancellableContinuation, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 + 1) - (i2 | 1) != 0) {
                th = null;
            }
            return cancellableContinuation.cancel(th);
        }

        public static /* synthetic */ Object tryResume$default(CancellableContinuation cancellableContinuation, Object obj, Object obj2, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            return cancellableContinuation.tryResume(obj, obj2);
        }
    }

    boolean cancel(Throwable th);

    void completeResume(Object obj);

    void initCancellability();

    void invokeOnCancellation(Function1<? super Throwable, Unit> function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001t\u0006|\u001a\u0017g]-\r\\$-R\u001c`\u0011(\u0019(\r^\nU.kQw)v|_$VUa(9\\\u001f?O\u0017V\fz0\\\bOmCs\u0015\u001bY#Y/\u007fB\u00072\u000f~E0P\u0016\u0010\u001d+\u0016;T\u0011L|E/", replaceWith = @ReplaceWith(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
    @InterfaceC1492Gx
    void resume(T t2, Function1<? super Throwable, Unit> function1);

    <R extends T> void resume(R r2, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3);

    void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t2);

    void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th);

    Object tryResume(T t2, Object obj);

    <R extends T> Object tryResume(R r2, Object obj, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3);

    Object tryResumeWithException(Throwable th);
}
