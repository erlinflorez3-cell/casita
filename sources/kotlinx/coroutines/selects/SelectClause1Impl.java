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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&˛\bDZc|İI\u0006>é6Ȑ\u0007\"B\u0012\u007f\u0007|jA0ZeP\u008cZS@\u000fs{:$c$\u007fCC٥\"}8\tWNmgvJp\u000bKƤ\u000e\u0016\u0007k4Ikxe\u0012\u0015:HģU\u074cuqCʠnsf\u000b0428@\u0004/\u001ajб\u0010\u0007~QL$\u0012^B\u0001\u000e`\u0010eT*#\u0016MN\u0003ɉ`qT<XrcA?%\tohO7t@\u0010]\rLUU\u0015țe(1FG;\u001b,c\u0005\rX\u0002H\u0013R\u0002N\u001bgU)ȅM}]<h\u0006\u001a\u001c;Q\u0013c\u00190l\u0007a`:2YTLK/\u00128K\t\b%\f\u0014\u001f\u00166v0ǉ\u001ep\u000e\u0014CzxZPR\bdh\u0001\u000btF(;~a-ݰ\u001fpWgK\u001fT>\f\u0007\u0013$I\u000b~4ke$_C\u001dƻ{[7WPCNU\u001a[Cs*~r\u0006:\u0006FF.1*\u0016\u0017\u0017\u0004Dk/)!y\u0011`4w\f\u0015sxSoSvH̱r =0\u0019\u0012`Kt\u0007qVza<$]-j\u0006,\n˙$f}B1+\u0016U_jopsg\u001a8?wMX\u001dmް[Cd9EWi\u0017qT|\u001aeMr!h\u0001RU\u001cZ\u000b:26Xl&v*F^\u000e#2m\u0005,6<1GgCM\u0019\u001dpFe\u000buYG њX5*\u0017w9E\u001b\u000fQtp\u001eiO̹.ʬd(5ۋi7\u001f<c99\u0018\u000b&\u001fN\u0004\u0011WvzIƥp {[\f&\u001c!IS5C9\u0010\u000f>B\u0015=ERs\u0014Y̊\u00161\u0001\u0003\n\u0015Ao>i\u000ep\u00175p}Z`j\u0016Px݈v-\u000ej\u0010\u007fgM\u000bIiZ1eNK\u0003\u0003\bG|=e\u0005}\"{˱qݕ\u0001=5C57.y\u001aG#z.M}:\u00122\u001f7\u0005t2.І\u001ayhWm8A?Y[\u0005DH%|\u0016RY\u0001v6Dީ8\u00179NQjv]HO\u00115$p\u0017?\u001d\u0002lZh\u0015̭\u0002>4e:yI\u0005$`I+7[ck}oa[9L=\u000fs{\u0010{hΩ?֕Z_j\t> \f\u001a<\\I{U»\b2CD,\u0018 Sgy\u0006\u0016{.Nݍ\u0013!8H\u0004A\\\u0015dzb\\n\u000epXp2@\u007f-\u0011ʟ\"\u0003;7\u0015sL[?e8\u0007y'\u0019.z`\u0015eS-\u05ffXC!.h\u0007\u0011LmEO\b\\\u0015WE}\u0006\u007f\u000eH\u0018+/R\u001c+;g\u0010\u000ex@`\u001bU\u0013atx\"f\u0001YP.\u0015y+\u0013%\f%\nw_IƎdυPV\u007f7Q4\u0019\u0019JE\u0015%ƚgc"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0007O<)\u001c>", "\u001f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0007A", "1kPBf,(P\u001e~xm", "", "@dV\u0013h5<", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006c%7]\f/Di%2WL\u001c{=\u001c$lkB\\", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "Ad[2V;", ">`a.`", "", ">q^0X:L@\u0019\r[n5z", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006a2?W}.EZ\u0016<]JJLD'\u0013weC\u00109", "1kPBf,+S'\u000f\u0002m", "=m2.a*>Z z\nb6\u0006f9n\u000e7\tP~&!T", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006`.\u0013U\u0007\u001e7t\u001d*\\GEt\u0012(\u001evpF\u0017a;X\u0004|", "7mc2e5:Z\u0006~\tn3\f", "", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00101\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\t>g\u0012 \u001d<ny\f[!OC\u0016\u0006J'wJch\b\u0011\"Uk(s\u0010i&*\u0010}\u0015", "5dc\u0010_(Na\u0019hwc,z\u0018", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u001fX.\u001fc\"|", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bKu", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "5dc\u001de6<S'\rg^:]\u00198c", "5dc\u001ca\n:\\\u0017~\u0002e(\f\r9n]2\u0005N\u0010$'E~\u0018I", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SelectClause1Impl<Q> implements SelectClause1<Q> {
    private final Object clauseObject;
    private final Function3<SelectInstance<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;
    private final Function3<Object, Object, Object, Object> processResFunc;
    private final Function3<Object, SelectInstance<?>, Object, Unit> regFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectClause1Impl(Object obj, Function3<Object, ? super SelectInstance<?>, Object, Unit> function3, Function3<Object, Object, Object, ? extends Object> function32, Function3<? super SelectInstance<?>, Object, Object, ? extends Function3<? super Throwable, Object, ? super CoroutineContext, Unit>> function33) {
        this.clauseObject = obj;
        this.regFunc = function3;
        this.processResFunc = function32;
        this.onCancellationConstructor = function33;
    }

    public /* synthetic */ SelectClause1Impl(Object obj, Function3 function3, Function3 function32, Function3 function33, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, function32, (i2 + 8) - (i2 | 8) != 0 ? null : function33);
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
