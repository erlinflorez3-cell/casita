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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLш|\u0004Oي8é6B\u0015\"4\u0012\u000e\u0007njO0L͜P.hS2\u000fq{<$i$yّCU0}*ޛWNuhvJp\u000bK\u000f\f\u001d\u0001jBI]xc\u0013\u0015˰Xģo3{n}̀_\u0005:\u0013 J\"fz\u0015T(,`_\u0007\fSZ:\u0013ضDz@W\u001dS\u000b \"\bD&'\u001el|^IXlc;]*ɨmLT,o6\u0003S\u001dHZ-3~q1;QM4C&٨\u0007\u0011X`O\tEwM\u0007n-M4Yug6\u0007\nB\u0019\u0014Ok`\u0003\u001cb\u0005_k$\u0017;ds^`\u000e.x)\u0003Ɂ@\u000e\u0014\u000b7N43*h\u000e\u0014Y|\u0003fPa\u0018]p\u0001ѐe@\u001d*\u001091?+hWga\"^J\f\u0016#\u001dQ\u0002ͼ%eZ\u0013p\u001b!Z\bS7WfJXj\u001asMo\u0014p\u0011\u0010:\b@I\u0016.*\u0012>\u001957\nH3#{\u0002vN\u0016z\u001b_\u0017WRT^?\u0001zގ;,\u000f\u001chU5\u0017yPlXZ\u0012$ɓVΘ\u0002\u000e\u001b\u05fetyB33#\u001f3vk\u0003\u001dm\u001b5>\u00158֍ru\u0014\\Id9;ae\u0016gxv$TLu\u0015XlC\u0002\u0013Ⱥ`2(7Xp\u0016}\fFT\u00129:O\u0005,EB0G]ČL\r$GQ\u0003\u000fejj\u0016\u0005z<4\u0005y$#\u0013/TEpNjO̹.ʬd*5A_K1([6vIMɃ\u0006\r~\u00187waW_|\u0016{V*'ک\u001eCW4M\u0019\u0015\u000594\b3kT\u0003xa^(&)}ɍ\u0013En3w\u000epv<bpPu]'5\u0007o\t\"6eѣ}kL\u007fWiZ\u0011k@Ox)fLjH\u0017\u0015!.%/}2\u0001E/Y&K\u0017\b\u0016?\u0015\u0010lyq>y\u0011\u0019Tx{\u0003Zg~qxP<>\u0012ΆK˕\u0003F*$z\u0019ZJp\u000f\u0016WY\u0018\u001bK`\u0011t\u0002fG{\fɣ\u0002p\r1\u001dv\\aJ\u0015u\u0004Z.o=\u0004T\u0014\u0013\rDѼ\u0015WYl}sQb\u001bL\u0015\u00101\u0005A\u0002\"-S\u001f\u0005Xť\r:\fx(<GAr\u0007B\u000fJN<@\u0018\rYS\u0018\u0007>~hF>(mϿDǠ?^\u0016T\u0007rnJ\u000b{SuՉ.\u001d"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0006O<)\u001c>", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0006A", "1kPBf,(P\u001e~xm", "", "@dV\u0013h5<", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006c%7]\f/Di%2WL\u001c{=\u001c$lkB\\", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "Ad[2V;", ">`a.`", "", "=m2.a*>Z z\nb6\u0006f9n\u000e7\tP~&!T", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006`.\u0013U\u0007\u001e7t\u001d*\\GEt\u0012(\u001evpF\u0017a;X\u0004|", "7mc2e5:Z\u0006~\tn3\f", "", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00101\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\t>D|", "5dc\u0010_(Na\u0019hwc,z\u0018", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u001fX.\u001fc\"|", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bKu", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "5dc\u001ca\n:\\\u0017~\u0002e(\f\r9n]2\u0005N\u0010$'E~\u0018I", ">q^0X:L@\u0019\r[n5z", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006a2?W}.EZ\u0016<]JJLD'\u0013weC\u00109", "1kPBf,+S'\u000f\u0002m", "5dc\u001de6<S'\rg^:]\u00198c", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SelectClause0Impl implements SelectClause0 {
    private final Object clauseObject;
    private final Function3<SelectInstance<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;
    private final Function3<Object, Object, Object, Object> processResFunc;
    private final Function3<Object, SelectInstance<?>, Object, Unit> regFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectClause0Impl(Object obj, Function3<Object, ? super SelectInstance<?>, Object, Unit> function3, Function3<? super SelectInstance<?>, Object, Object, ? extends Function3<? super Throwable, Object, ? super CoroutineContext, Unit>> function32) {
        this.clauseObject = obj;
        this.regFunc = function3;
        this.onCancellationConstructor = function32;
        this.processResFunc = SelectKt.DUMMY_PROCESS_RESULT_FUNCTION;
    }

    public /* synthetic */ SelectClause0Impl(Object obj, Function3 function3, Function3 function32, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, (i2 + 4) - (i2 | 4) != 0 ? null : function32);
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
