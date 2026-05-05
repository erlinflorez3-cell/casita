package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0006DLc\u000b\u0004Iي8\u000b<Ȑ\u0007Ӭ4\u0012\u000e\u0007njO0Le^.Zݷ2\u000f\u0002{<$a$yCIU\"Ԃ*\teNogtJb\u000bY\u000f\u000eǝ\u0001j:J]xs\u0012\u00172HwE\u074ccڎe;fҚD\u0004H4(7\b\u00051&:J vAB[\u000e\"0\u0007phSM̖\u0005*\u0016\u0014@8\u0001L_w\"DL\u0005-J@3\u0012\u0018EĚ+i6\u0004]\u0013L\\7\u000f|gD-PLE(5S\t\b\u0001dύ\u0007IwD\u0015n-/;Ky]\\b\u0010'%<e\f\fu͉`\u000fWg\u001c-1WsMV\u0014N\u0003\u000b}\u001d<2\u001a4-1.\f\u001fv[\u001c@\rBcQ`\u0011\rEȸ~k<\u001e5\u000693I\u001dlW\b=)aG\r\u001b\fL&ъr+a[\u001ef\u001b#dyW7wKM[^\u001bo<\u001c\u0007Ͳf\f0\u000b@M\u00067\f\u00134\u001dKFk=3#\u0002\u0001vG\u0016|m`GayHN@0~.':\u001e\u001cmTd\u000bl~]г0\u001bS#d\r\u0004\u0010#\"b}b+5#^`~h\u0019Pύ\u000e/5mG_ts\u001eY?dY@av rhuBBםf\u000f^mRY\u0012bl*(8n| \u0014\f^^\u000e#2m\u0005,8<3/[CK\u0013 RA+\u001do\\x\u0010-`a*\u0019hRzq\u0003f[O\u0001ς|K2\u0012n8}S_71&\u0004%?ث~ɠ\u000b\u0005{Ò_iR^Z\u0005fYc\u007f8e*Ja>k\u0016ä\u000338\t=KRzuSS\u0018M|\r\u000f\u001fNx.m\t\u0019yݽdtPVd\u001d(~nt)\u000e\u000b\n\ntV\f]b\u0003\u000eИBSx\niBT@\r\u0007%$K\f\u007f$\r5[OU#~wr4kˬ_ɳs6\u0002b\u001dA\rg\nEq0@F_jJ\u000bHZi\u000el%ٝp\rHOz}\u000eJ\u00196\u00139nCt\u0004fIc\n]\u0001֨\u000b6\u0013wfa@\u001b\u007f\u007f:4\u00065\u0004V\u000e%tBS\u0014ߠWqst[b\u0011R\u001f\f\u0011\u0002W}\" M\"lV\u0011\f^\f\\\u0018\u0015O\u0012ط\u0007Ø\r,<,J##EZ\u0006\u0014*KĚEm\u001f/\"R\tKi\u001eT~]\u0005QϖdOf(:\u0007\u0005\u0017C ~;W\u000f}Yd@y1/V\u009b\r%pV\u000fl+3TV?!Nc\u0011\u001eUnYH09\u0086K3sr\u007f\u0012> \r\u001fH\u001eAKa-o\u0011@`\u001bU\u0013atz\"hhMP,\u000f|\r\u000ej\u001e\u001f\r)O!{\u00113bM&=,\u001c\u0017\u0016#:]Ѱ~ސJ#5\u0006CHUKp15\u0016¢WY"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bO<)\u001c>", "\u001e", "\u001f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bA", "1kPBf,(P\u001e~xm", "", "@dV\u0013h5<", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006c%7]\f/Di%2WL\u001c{=\u001c$lkB\\", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "Ad[2V;", ">`a.`", "", ">q^0X:L@\u0019\r[n5z", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006a2?W}.EZ\u0016<]JJLD'\u0013weC\u00109", "1kPBf,+S'\u000f\u0002m", "=m2.a*>Z z\nb6\u0006f9n\u000e7\tP~&!T", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006`.\u0013U\u0007\u001e7t\u001d*\\GEt\u0012(\u001evpF\u0017a;X\u0004|", "7mc2e5:Z\u0006~\tn3\f", "", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00101\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\t>g\u0012 \u001d<ny\f[!OC\u0016\u0006J'wJch\b\u0011\"Uk(s\u0010i&*\u0010}\u0015", "5dc\u0010_(Na\u0019hwc,z\u0018", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u001fX.\u001fc\"|", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bKu", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "5dc\u001de6<S'\rg^:]\u00198c", "5dc\u001ca\n:\\\u0017~\u0002e(\f\r9n]2\u0005N\u0010$'E~\u0018I", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SelectClause2Impl<P, Q> implements SelectClause2<P, Q> {
    private final Object clauseObject;
    private final Function3<SelectInstance<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;
    private final Function3<Object, Object, Object, Object> processResFunc;
    private final Function3<Object, SelectInstance<?>, Object, Unit> regFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectClause2Impl(Object obj, Function3<Object, ? super SelectInstance<?>, Object, Unit> function3, Function3<Object, Object, Object, ? extends Object> function32, Function3<? super SelectInstance<?>, Object, Object, ? extends Function3<? super Throwable, Object, ? super CoroutineContext, Unit>> function33) {
        this.clauseObject = obj;
        this.regFunc = function3;
        this.processResFunc = function32;
        this.onCancellationConstructor = function33;
    }

    public /* synthetic */ SelectClause2Impl(Object obj, Function3 function3, Function3 function32, Function3 function33, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, function32, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : function33);
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Object getClauseObject() {
        return this.clauseObject;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Function3<SelectInstance<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> getOnCancellationConstructor() {
        return this.onCancellationConstructor;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Function3<Object, Object, Object, Object> getProcessResFunc() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Function3<Object, SelectInstance<?>, Object, Unit> getRegFunc() {
        return this.regFunc;
    }
}
