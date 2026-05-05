package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLcz\u0006I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000fy{<$a%yCQU\"}(\nWN}gvϺb\u000bQ\u0010\u000e\u0016\u000fj4կ]xs\u0012\u00172XoG3coEʠfjLӌP2P7J\u0015\u000f\u001aBH>uQŶMë\u00164Xr@S\u001bOUy \tVo\u0011/lv|5Ղpg@53\toI^)e6#M\u001d[d:\u001dvg\u001fYH˝9\u001f+Y\u0013\rXbO\u0005Ewc\u000ex:7<_r\u00065ݼ\u0004\u001e\u001b1_\u0013cy6^\u000bW\u0007\u00167-_cy[<-`zZ\u0011\u0013ǰ\u0010Ν+LF/ r\u0016\u001b\u0004T\u0001aX \u0012oR\u000f)`ي\u001b/\u00069;?!macA\u001ft7\f\u0018\u001d/9\u007f\u001d ƟX\u0018f\u001b+Z}XASFCnX\u001alM~\u001ao\u0011\u0001ò\b:M\u0006?\u0002\u00175''=a_31o\u0012JZf%\u0004\u000fm<i1W\u0017̵pގ;.!\u000e`Ur\u0012<®Sf>)=,i\u0017\u0011\u0018\u0013&]&DƼ)\u001aTUxopTm\f+5\r@i\u0002{\u001fm8\r2̳Um\u0016gb|\u001aFLd\u000b^\rLc\u001fjm>!`Gн\u0014\u0002\u0002J^\u0012\u00199Os\":RE)x%b\u0013 RA+\u001eo^x\u0012\u0015Sa#\u0013k4t7\u0017`^\u0001o\u0016\u0004w1\u0013_P2*SK\u0018\u0005hxע6č'\u000b\u0017u\u0006^uY܄Km.\u000foޑ$1"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0011", "", "1kPBf,(P\u001e~xm", "5dc\u0010_(Na\u0019hwc,z\u0018", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "@dV\u0013h5<", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006c%7]\f/Di%2WL\u001c{=\u001c$lkB\\", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "Ad[2V;", ">`a.`", "", "5dc\u001fX.\u001fc\"|", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bKu", ">q^0X:L@\u0019\r[n5z", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006a2?W}.EZ\u0016<]JJLD'\u0013weC\u00109", "1kPBf,+S'\u000f\u0002m", "5dc\u001de6<S'\rg^:]\u00198c", "=m2.a*>Z z\nb6\u0006f9n\u000e7\tP~&!T", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006`.\u0013U\u0007\u001e7t\u001d*\\GEt\u0012(\u001evpF\u0017a;X\u0004|", "7mc2e5:Z\u0006~\tn3\f", "", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u001ca\n:\\\u0017~\u0002e(\f\r9n]2\u0005N\u0010$'E~\u0018I", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0006A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0007A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bA", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface SelectClause {
    Object getClauseObject();

    Function3<SelectInstance<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> getOnCancellationConstructor();

    Function3<Object, Object, Object, Object> getProcessResFunc();

    Function3<Object, SelectInstance<?>, Object, Unit> getRegFunc();
}
