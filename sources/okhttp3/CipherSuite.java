package okhttp3;

import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4F\u0015ӬJ\u0018(\u0007\u0015iq/J&U4Rc.\u001dk\u00144R\\ҸuCIWb\t0\tgN\u0016h5OҼ\u000fC\u0015\n^~x1aU'^X#\u0003S}?KM\u001e>oeҽ:\u000b(݅::\u007f\u0005\u000f\u001dݻL\u0017"}, d2 = {"\u001anZ5g;I!b\\~i/|\u0016\u001du\u00047{\u0016", "", "8`e.A(FS", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "zcT=e,<O(~yX1x\u001a+N{0{", "BnBAe0GU", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CipherSuite {
    public static final Companion Companion;
    private static final Map<String, CipherSuite> INSTANCES;
    private static final Comparator<String> ORDER_BY_NAME;
    public static final CipherSuite TLS_AES_128_CCM_8_SHA256;
    public static final CipherSuite TLS_AES_128_CCM_SHA256;
    public static final CipherSuite TLS_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV;
    public static final CipherSuite TLS_FALLBACK_SCSV;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA;
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5;
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5;
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5;
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256;
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA;
    private final String javaName;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>.6B\r.4\u0012\u000e\u0007nʑA0ZeP.hS2\u000fqw<$i*yCAU ԉ#\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jtYcސ\\*\u000f`F DAݾnU9\u000fw|\nhL0؆x\u001d\u0001H.x\u0015\u0005ٞBc\f@3pvHĬ\fe\u0006Hŏ\u0005\u0005 I.jɪMNH\u001b`j41ɊhZNUbv|\u001e%TU?\u0019\u0007c.+n:E\u00175S1\u000b\u0001]\u0016ŤAџA\u0005pѧwMWxoFh\u0002$\u0015YR;c[,l\u0007a`:*\nV:֠Rˎ,}\u0003Ԉ%>\n\u0016\u00140\u0019<;$~\b<7+v*ûRؿbB\bЭ2D%0\u00183Y=Qj(ĭ=ϭR7\u0004˜],1\r\u0007!\nXDdkÙVɐU1Y̵\u000eV\\\u0017q=\u001c\b'fX×\u0006ΥK\u007f7Ʌa<%3O[g'WoXҎFϼz\u0005hå$w`WX\"\u001d\u001am._ȹ\\ֈh\u0005s¬%f:!e\u001c\u0003\u000b4\fi؆^ʟ@!-ī\u001f]vz\u0003M\f\u000e[3=ƅ[ˇo\u000e_ު/ACc{\u0010\u0010V-\u0018\u0016ׂdۖ\\fJͭ\\hj;:2vnF{RͱPܟ\u00172GڤlB:E1\\CL9\"\u0019ˎ~ȤcZpɭObA9\u001biRx?\u0005'ʜr״kxQؓMn0CYQc\u001d\\Yx׃6č'\u0007\u0007͞PUuc_L\u001b\u001a,YR\u0095\u0018׀=Q7ˋc\u001d\rAJ\u0002[I\u0003v<ˀOɟ+z\u0005Ȫ_IvG\u007f\b\u0019tbdA߂Qݚ\u001b\"~ܥC1\u0016~\u0018y\u0010J1K:ӂ\rИBIzÅ*J\\S\u0015\u0005M\"[\u0005Fܺ~ީ1C/ݴf\u0006\"K-a\fm&2Pʴ\u0011֑xe\fϺ4$}\u007fi]`?nM0ˢ@ѐ(l\u000bܩ\u0019x\u0006&Z\tb\u0011iL\u0018дrެ<M\u0013ɀNt\u0015K%p\u0005_p\u0017FϠ6ˀc*{ʕN\"lc=\u0011{W\u001eqDо^\u05c8N\u000f\u0012ΚL?|34=NZ\u000ef_ݽ\b֯\u001c6Iݥ3\u0013J+<4Z@>\u000f\u001aҕkѕ\u0014z\bʋ0\u001d%UZsiZDXOּX߃\t`MǷq8\u000f#'3L|k5[֏Hߟ3c:ܬ$+\u0017@\u0003O-j[/\u001bǼ;Ь,X\tՊ\u0016kQo\u001a62K_qBƙ\u000eէ\u001c|%\u00adh)Gx)_%4\u0015\u000f,̬PЩz\u0012nŚ\u001f07'\u0013|<@@\u0013aćQζsb5ً\u001f\u0006El2\u0001EH_\u000bbŹe̍\u001f-\u000eז}KW\u0015,'*[\n?TР\"Č+\u0004|ե-e\u001c\u0012\"]I>LulȐ\u0004Ƥ\u0017P(Ɍ~X\u0003\u001f\".6:\u0006\u0006\nĀ\u0015Ȩ]k\u007f˺\u001159\u001a\u001eByl/\u000e:ءe߾Y\u000b\u000bϟ\u0002d\b\u001dEPK\r]Q\u0005\u0085Zŷ>\u0011[ݰ)\u001f\u000eC-&M:>f\u007f։Qʍlpsχ,\u001b9_\u0004*\u00105fVtݡ!ݺy\u00042Ĕx#I\be>\u0013\r\u0013p\u0019Ĩ\u0010߿n(lÆ\\7\"/\u0017H\r\u0015I8\u001dݹ Ү37!ے,\u001bU\u0014\u001f\u0004sM\\%\bĤAװ;2\u0013 x\u0005\u001f7Rb#\u0004`F_ۊ\u0002\u05ff0-N§\u000e(5\u000f<m\u0013\u0007\\O\u001cзDݭ0\u0011\u0016ı\u007fhFVV\\H qU\n\u0086\u001b֩\u0005\u0015@ۍ@\u0015'l\u0003Q\u0002)`\u0005Sӝ\u000fק}1s\u009fDE\u0001[G\u000f\u001e\u001f\u000ej\u0012ì7ְP'\u0014\u058b6X\r\u0007{V=ebM\f\u009e ¼Y@\bʩo22@\u000e#.IgL\u0001ث^ȡZs_ƨv8D*\\#up/w`߇k҅wdcȥ\u0005O\tP1Dl.cp]ŽO˫}\u000bLԹ\u0016\"EL\u001e)a\u001b3\u0014&ƈB\u0557MrUҍ-kJQ\f\u0004h6\u0018:PáBĐ.\u00065\u009a%qx*\u0006Q\u000e\u0014n\u0016cŷ\u0006ֶ5Rhٻ1+&gcvt:\u0013|$ڱd\u07b4D\u000f,ۋ~P\u001aL\u001e\u0016\\LM\u0006T߇bū\u00173Oؓ\u0012U \u0019\u0014!K\u0015\u0012)\\ȿi\u0095K?]ߎ)KGv#mx\\ki3ոW٠Od3ۢPx9r_Vl\u001e`\\\\ڎGŜL\u0010Lэ\u00156{uH0~\u0003\u0011G4ӥ\u001e؞AU\u001d֧O@p}sd?/m[EָWǍ1x\nϷ`O'Z#\u001e\u0002=h'JԤ3Ĩ\u007f\bdų&\u000b{\u0012(\u0003\u0010NW3\\ܢ1ϸOl^̮\u0010'e\t\u0017\fN+Z\niکdԝ\u0017i\u0016݁0\u0011Z\u0001n)vO\u0010\u0015=ަl٠~t\u0014˘\\FcQU\u0006?fR9\u0012ܲBڝ2p\u0011\u0097 x\nv}o\u0015x\u0010Q\u001cΖw֟B1y±4]ma\u0007Q\u000b\\t\u001b.ڼBȠ\u0006\u001a%õ2\nVwH\u0017\u0004g$nJ؋bؕ]4sž5\b\u00016|>\u0012BrLCËh\u008f\u0002\u001bYɂ3\u0017nA`A>f#0}̆Jц\u001d\u0001\tɘ2%\"\t\\vQki>xګ$̏a%O͆V\u001cx4\u0010\u0015*ai:cѭ.̺\u0019\u0005F܌C\u0012zXe02oe6\u001dۣB̛1Z/л9\u00168b$|30%W)ދw٘vd\u0007ӽn(O-QGO\u00179\u001d\u0013Έ4ï\\zvˉ-3<R\u001e\u001f@F29C͒uڥ7Wyغ\u0005k,\u0001\u0016i&$Coh˗e˫'Oqαak<&\u0010\u0007\b@\u0010EX܇$˙(\b\u001dֲRVB$J\"Q\u0005E:nɟhó|%\u0011½\\=\u0003P&2\u001cB*j4à6\u0088AUeˣ\u0016;=M Kwq5/\u001e؎Kۢ>OTҬFiK1.25s:5fӕbݖF\u0017\u007fÏ3By\u0018\u0014G1\u0018!O\u0005ߖ\\ɼrl~ʶ2\u001eKt%\u00143B*-yՔ'߫dg\bãY~+\u0017iE\u0013\u000fz\u0015~З4ӟ\u0016\u000fPږ7\u001c)b\u001dK\u0013\u001eL=\u001c߆Bѽ\u0019[\f߅4_0I`kV3@{l\u0095\u001fס99\u0015߿!lCJv\t\u0004'D+Eʻ\nË42Oɴ+.=? \u000exj\u0003Tc\u0604\tؼ2v~ܣgM#fBEP!yio˳\u0007܅p;eԭ$r\t\u0004\u0007[\n+f\u0002\\Ò\u0015Ֆ#\u0016\u0016ǮX\u000e\u0003BLO$\u0005vLi»\u001cÿ2\b\u001cպ6Z\u0013\u001d\"A_C\ntoݮyҥbB\rʘu/6s0(\u0010pIskܞ$Ȑ\u0017v#˷Y\u001e*3=\t[U-~pĤ\u0012٣Y\u0010Gԁcplb\u0018!w4fw_ۓNʸ\u0002.rЪ;\u0006l{gqja5{\rݪ*Ո*RCѾ3jR\u0014s(r\u001bD\"uۂ&\u05fa\u0010n8ٰ-v\f]\u000fR\u0011\u0016\u00178EςZև9++ժv\u000f\u000fw;]Y\u0018t],\u070ffޒjvXثbl\u0003.\u0002|65S\b\\ڶgۙ 9Q٠qyB1:*\u0011\u0018Zib̟Nݥ1\u001a>Μ\r0G.3s^\u0003M\u0015\u0017\u0558vӀ3F\u0019ۋY~?%a_\u000b#bb\u007fտmۓ3PZү\u001e|=\u000e/&fem'\"Ӗ$̍IgE҇u#\u001b\u0014\u0003\f#\u0007S9H\u0084`ʚC\u0002\u000eϤdP\r,\tC\u0019B, \u000bױv\u0099fi<Ť\u0013p]!.\u0012\u0014R][Hý\u0015˔8}Bͽj\u0010lA\u001f\rT'c\u000fq۶\u0005ϬHQ;Ģ4Ucot\r=5sm\u001eʹNۀ~}$ʶBN\u0006lykdI6\u001c\u007fܣKД6\u0002\u0014ɤ\u001d}\u000b+a\u0012z\u000fx\u0016iօBլ\u0004\u001b^܂\u001aBVqt6\u001baz-Tޜhɼq>\u0014͑\u0016d<\u0003N\u001d\u000en5wMűhքC\u0017\u001aǯM\rJk}\u0005\u0014*Y.\u001dƼUށe{_ޠ;\u001eV\u05cd1|4p\u0018U\u000ftݬVɩ\u000f\u000bWۦ\u0005-Fļw^Nse;2xɖd՝\u0011.xٳ!If̿\\^9i!*X7ӓsŏzW/ÿɮ;ͬ\n"}, d2 = {"\u001anZ5g;I!b\\~i/|\u0016\u001du\u00047{~^!\u001fRk\u0017@\u0001.\u000b", "", "u(E", "\u0017MB!4\u0015\u001c3\u0007", "", "", "\u001anZ5g;I!b\\~i/|\u0016\u001du\u00047{\u0016", "\u001dQ3\u0012E&\u001bG\u0013gVF\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "5dc\u001cE\u000b\u001e@\u0013[nX\u0015Xp\u000f$\n.~O\u0010\"", "u(;7T=:\u001d)\u000e~euZ\u00137p{5wO\u000b$l", "\"KB,4\f,MdKMX\nZp)8y\u0016^\u001cMfg", "\"KB,4\f,MdKMX\nZp)Sb\u0004H\u0010Q", "\"KB,4\f,MdKMX\u000eZp)Sb\u0004H\u0010Q", "\"KB,4\f,MeNKX\u000eZp)Sb\u0004I\u0013O", "\"KB,6\u000f\u001a1{ZG)&gr\u0016YKuF\u0010z\u0005y#<]\r", "\"KB,7\u000f\u001eMwlhX\fos\u0019Rn\"m$oy\u0011&O{\u000bA\u001f\u00136[\u001a%Pq", "\"KB,7\u000f\u001eMwlhX\u001e`w\u0012_M\u0007[.zvu'ik\u0019T\u001f#<Y", "\"KB,7\u000f\u001eMwlhX\u001e`w\u0012_[\bi:LciAMj\u001ap\u0013\u00185", "\"KB,7\u000f\u001eMwlhX\u001e`w\u0012_[\bi:LciAMj\u001ap\u0013\u00185Jo\b", "\"KB,7\u000f\u001eMwlhX\u001e`w\u0012_[\bi:LciAQk$p\u0013\u00185Jo\b", "\"KB,7\u000f\u001eMwlhX\u001e`w\u0012_[\bi:MfgAMj\u001ap\u0013\u00185", "\"KB,7\u000f\u001eMwlhX\u001e`w\u0012_[\bi:MfgAMj\u001ap\u0013\u00185Jo\b", "\"KB,7\u000f\u001eMwlhX\u001e`w\u0012_[\bi:MfgAQk$p\u0013\u00185Kr\u0006", "\"KB,7\u000f\u001eMwlhX\u001e`w\u0012_]\u0004c g}z#iY\tI\u001f\u00136[\u001a%Pq", "\"KB,7\u000f\u001eMwlhX\u001e`w\u0012_]\u0004c g}z#iZ\fG\u001f\u00136[\u001a%Pq", "\"KB,7\u000f\u001eMwlhX\u001e`w\u0012_^\bi:^stA]p\u0018", "\"KB,7\u000f\u001eM\u0006lVX\fos\u0019Rn\"m$oy\u0011&O{\u000bA\u001f\u00136[\u001a%Pq", "\"KB,7\u000f\u001eM\u0006lVX\u001e`w\u0012_M\u0007[.zvu'ik\u0019T\u001f#<Y", "\"KB,7\u000f\u001eM\u0006lVX\u001e`w\u0012_[\bi:LciAMj\u001ap\u0013\u00185", "\"KB,7\u000f\u001eM\u0006lVX\u001e`w\u0012_[\bi:LciAMj\u001ap\u0013\u00185Jo\b", "\"KB,7\u000f\u001eM\u0006lVX\u001e`w\u0012_[\bi:LciAQk$p\u0013\u00185Jo\b", "\"KB,7\u000f\u001eM\u0006lVX\u001e`w\u0012_[\bi:MfgAMj\u001ap\u0013\u00185", "\"KB,7\u000f\u001eM\u0006lVX\u001e`w\u0012_[\bi:MfgAMj\u001ap\u0013\u00185Jo\b", "\"KB,7\u000f\u001eM\u0006lVX\u001e`w\u0012_[\bi:MfgAQk$p\u0013\u00185Kr\u0006", "\"KB,7\u000f\u001eM\u0006lVX\u001e`w\u0012_]\u0004c g}z#iY\tI\u001f\u00136[\u001a%Pq", "\"KB,7\u000f\u001eM\u0006lVX\u001e`w\u0012_]\u0004c g}z#iZ\fG\u001f\u00136[\u001a%Pq", "\"KB,7\u000f\u001eM\u0006lVX\u001e`w\u0012_]\u000bW\u001ecrc\u0012ix&]\u0019\u0001'Ho1[x\n\u001a\u0013\f", "\"KB,7\u000f\u001eM\u0006lVX\u001e`w\u0012_^\bi:^stA]p\u0018", "\"KB,7\u000f8O\"\t\u0004X\fos\u0019Rn\"m$oy\u0011&O{\u000bA\u001f\u00136[\u001a%Pq", "\"KB,7\u000f8O\"\t\u0004X\fos\u0019Rn\"m$oy\u00114M\\6Eo/A\\o", "\"KB,7\u000f8O\"\t\u0004X\u001e`w\u0012_M\u0007[.zvu'ik\u0019T\u001f#<Y", "\"KB,7\u000f8O\"\t\u0004X\u001e`w\u0012_[\bi:LciAMj\u001ap\u0013\u00185", "\"KB,7\u000f8O\"\t\u0004X\u001e`w\u0012_[\bi:LciAMj\u001ap\u0013\u00185Jo\b", "\"KB,7\u000f8O\"\t\u0004X\u001e`w\u0012_[\bi:LciAQk$p\u0013\u00185Jo\b", "\"KB,7\u000f8O\"\t\u0004X\u001e`w\u0012_[\bi:MfgAMj\u001ap\u0013\u00185", "\"KB,7\u000f8O\"\t\u0004X\u001e`w\u0012_[\bi:MfgAMj\u001ap\u0013\u00185Jo\b", "\"KB,7\u000f8O\"\t\u0004X\u001e`w\u0012_[\bi:MfgAQk$p\u0013\u00185Kr\u0006", "\"KB,7\u000f8O\"\t\u0004X\u001e`w\u0012_^\bi:^stA]p\u0018", "\"KB,7\u000f8O\"\t\u0004X\u001e`w\u0012_l\u0006J:LciAWl\f", "\"KB,8\n\u001d6xxZ<\u000bjd)Wc\u0017^:Nuv5im\u001bV\u001f\u00136[\u001a%Pq", "\"KB,8\n\u001d6xxZ<\u000bjd)Wc\u0017^:\\v\u0005A;Z\u000fp\u0003\u00127w\u000e\u001aI", "\"KB,8\n\u001d6xxZ<\u000bjd)Wc\u0017^:\\v\u0005A;Z\u000fp\u0003\u00127w\u000e\u001aIb}\u001e", "\"KB,8\n\u001d6xxZ<\u000bjd)Wc\u0017^:\\v\u0005A;Z\u000fp\u0007\u0013Aw\u000e\u001aIb}\u001e", "\"KB,8\n\u001d6xxZ<\u000bjd)Wc\u0017^:\\v\u0005A<]\rp\u0003\u00127w\u000e\u001aI", "\"KB,8\n\u001d6xxZ<\u000bjd)Wc\u0017^:\\v\u0005A<]\rp\u0003\u00127w\u000e\u001aIc\u0001\u001c", "\"KB,8\n\u001d6xxZ<\u000bjd)Wc\u0017^:\\v\u0005A<]\rp\u0007\u0013Aw\u000e\u001aIc\u0001\u001c", "\"KB,8\n\u001d6xxZ<\u000bjd)Wc\u0017^:^yr%Ri\tA\u001f Cd\u0014\u0003;`}G1\u001eG\u0001me", "\"KB,8\n\u001d6xxZ<\u000bjd)Wc\u0017^:i\u0007}.i{\u001fR", "\"KB,8\n\u001d6xxZ<\u000bjd)Wc\u0017^:mteA;Z\u000fp\u0013\u00185", "\"KB,8\n\u001d6xxeL\u0012vz\u0013Tb\"W n\u0011b\u0014B\b\u001aS\u0003/G`{", "\"KB,8\n\u001d6xxeL\u0012vz\u0013Tb\"W n\u0011c\u0017@\b\u001aS\u0003/G`{", "\"KB,8\n\u001d6xxeL\u0012vz\u0013Tb\"Y#\\ty#<X6a\u000f\u001cMIm\u0002=\u0010\u001c0\u001f\b;\u0005", "\"KB,8\n\u001d6xxgL\bvz\u0013Tb\"I\u001f`\u0005\u0011'Nm6T\u0002\u0013Sk\u0003\u0013", "\"KB,8\n\u001d6xxgL\bvz\u0013Tb\"W n\u0011b\u0014B\b\u001aS\u0003/G`{", "\"KB,8\n\u001d6xxgL\bvz\u0013Tb\"W n\u0011b\u0014B\b\u001aS\u0003/G`{\u0004=f", "\"KB,8\n\u001d6xxgL\bvz\u0013Tb\"W n\u0011b\u0014B\b\u001eT\r/G`{\u0004=f", "\"KB,8\n\u001d6xxgL\bvz\u0013Tb\"W n\u0011c\u0017@\b\u001aS\u0003/G`{", "\"KB,8\n\u001d6xxgL\bvz\u0013Tb\"W n\u0011c\u0017@\b\u001aS\u0003/G`{\u0005@d", "\"KB,8\n\u001d6xxgL\bvz\u0013Tb\"W n\u0011c\u0017@\b\u001eT\r/G`{\u0005@d", "\"KB,8\n\u001d6xxgL\bvz\u0013Tb\"Y#\\ty#<X6a\u000f\u001cMIm\u0002=\u0010\u001c0\u001f\b;\u0005", "\"KB,8\n\u001d6xxgL\bvz\u0013Tb\"d0g}\u00115Ri", "\"KB,8\n\u001d6xxgL\bvz\u0013Tb\"h\u001eO\u0011b\u0014B\b*Y\u0001", "\"KB,8\n\u001d6\u0013^X=\u001aX\u0003!In\u000bu\u000e_v\u0005AOl\u001cp\u0003\u00127w\u000e\u001aI", "\"KB,8\n\u001d6\u0013^X=\u001aX\u0003!In\u000bu\u001c`\u0005\u0011\u0013<`6T\u0002\u0013Sk\u0003\u0013", "\"KB,8\n\u001d6\u0013^X=\u001aX\u0003!In\u000bu\u001c`\u0005\u0011\u0013<`6T\u0002\u0013Sk\u0003\u0013:e~", "\"KB,8\n\u001d6\u0013^X=\u001aX\u0003!In\u000bu\u001c`\u0005\u0011\u0013<`6X\u0003\u001dSk\u0003\u0013:e~", "\"KB,8\n\u001d6\u0013^X=\u001aX\u0003!In\u000bu\u001c`\u0005\u0011\u0014?^6T\u0002\u0013Sk\u0003\u0013", "\"KB,8\n\u001d6\u0013^X=\u001aX\u0003!In\u000bu\u001c`\u0005\u0011\u0014?^6T\u0002\u0013Sk\u0003\u0013;h|", "\"KB,8\n\u001d6\u0013^X=\u001aX\u0003!In\u000bu\u001c`\u0005\u0011\u0014?^6X\u0003\u001dSk\u0003\u0013;h|", "\"KB,8\n\u001d6\u0013^X=\u001aX\u0003!In\u000bu)p}}A]p\u0018", "\"KB,8\n\u001d6\u0013^X=\u001aX\u0003!In\u000bu-^e\u0011\u0013<`6d\b\u0011", "\"KB,8\n\u001d6\u0013kh:&nl\u001eHyuZ n\u0011v&O\b\u001aS\u0003/G`{", "\"KB,8\n\u001d6\u0013kh:&nl\u001eHy\u0004[.zbc\u001aik\u0019T\u001f#<Y", "\"KB,8\n\u001d6\u0013kh:&nl\u001eHy\u0004[.zbc\u001aik\u0019T\u001f#<Yl\u0007>", "\"KB,8\n\u001d6\u0013kh:&nl\u001eHy\u0004[.zbc\u001aio\u001a^\u001f#<Yl\u0007>", "\"KB,8\n\u001d6\u0013kh:&nl\u001eHy\u0004[.zcf\u0018ik\u0019T\u001f#<Y", "\"KB,8\n\u001d6\u0013kh:&nl\u001eHy\u0004[.zcf\u0018ik\u0019T\u001f#<Ym\n<", "\"KB,8\n\u001d6\u0013kh:&nl\u001eHy\u0004[.zcf\u0018io\u001a^\u001f#<Ym\n<", "\"KB,8\n\u001d6\u0013kh:&nl\u001eHy\u0011k'g\u0011\u0005*K", "\"KB,8\n\u001d6\u0013kh:&nl\u001eHy\u0015Y\u000fzbc\u001ai{\u001fR", "\"KB,8\n\u001d6\u0013z\u0004h5vz\u0013Tb\"I\u001f`\u0005\u0011'Nm6T\u0002\u0013Sk\u0003\u0013", "\"KB,8\n\u001d6\u0013z\u0004h5vz\u0013Tb\"W n\u0011b\u0014B\b\u001aS\u0003/G`{", "\"KB,8\n\u001d6\u0013z\u0004h5vz\u0013Tb\"W n\u0011c\u0017@\b\u001aS\u0003/G`{", "\"KB,8\n\u001d6\u0013z\u0004h5vz\u0013Tb\"d0g}\u00115Ri", "\"KB,8\n\u001d6\u0013z\u0004h5vz\u0013Tb\"h\u001eO\u0011b\u0014B\b*Y\u0001", "\"KB,8\u0014)B\rxg>\u0015\\j\u0019Tc\u0004j$j\u007f\u0011+Xn&p\u0013\u0013Gn", "\"KB,9\b%:uZXD&jf\u001dV", "\"KB,>\u0019\u001b#\u0013^mI\u0016iw)Wc\u0017^:_v\u0005AMj\u001aps\u007fSe~\u0007", "\"KB,>\u0019\u001b#\u0013^mI\u0016iw)Wc\u0017^:_v\u0005AMj\u001aps\u007fSk\u0003\u0013", "\"KB,>\u0019\u001b#\u0013^mI\u0016iw)Wc\u0017^:mteA>X6^\u0004\u0005", "\"KB,>\u0019\u001b#\u0013^mI\u0016iw)Wc\u0017^:mteA>X6d\b\u0011", "\"KB,>\u0019\u001b#\u0013p^M\u000fvV\u000eEm\"[\u001f`\u0011t$M\b$Ut", "\"KB,>\u0019\u001b#\u0013p^M\u000fvV\u000eEm\"[\u001f`\u0011t$M\b*Y\u0001", "\"KB,>\u0019\u001b#\u0013p^M\u000fvg\u000fSy\u0006X\u001ez~u\u0017", "\"KB,>\u0019\u001b#\u0013p^M\u000fvg\u000fSy\u0006X\u001ez\u0005y#", "\"KB,>\u0019\u001b#\u0013p^M\u000fvu\r4ysH\u0013z~u\u0017", "\"KB,>\u0019\u001b#\u0013p^M\u000fvu\r4ysH\u0013z\u0005y#", "\"KB,C\u001a$M\u000bbiA&Jg\u000fSy\bZ zts%i{\u001fR", "\"KB,C\u001a$M\u000bbiA&Xh\u001d_KtN:^stA]p\u0018", "\"KB,C\u001a$M\u000bbiA&Xh\u001d_LwL:^stA]p\u0018", "\"KB,C\u001a$M\u000bbiA&if}_KtN:nyr", "\"KB,E\u001a\u001aMxqeH\u0019k\u0003!In\u000bu\u001f`\u0005e\u0012ik\u0019T\u001f#<Y", "\"KB,E\u001a\u001aMxqeH\u0019k\u0003!In\u000bu-^e\u0011\u0016:\b$Ut", "\"KB,E\u001a\u001aM\u000bbiA&Jg\u000fSy\bZ zts%i{\u001fR", "\"KB,E\u001a\u001aM\u000bbiA&Xh\u001d_KtN:^stA]p\u0018", "\"KB,E\u001a\u001aM\u000bbiA&Xh\u001d_KtN:^stA]p\u0018Ct\u0006", "\"KB,E\u001a\u001aM\u000bbiA&Xh\u001d_KtN:bt~A]p\u0018Ct\u0006", "\"KB,E\u001a\u001aM\u000bbiA&Xh\u001d_LwL:^stA]p\u0018", "\"KB,E\u001a\u001aM\u000bbiA&Xh\u001d_LwL:^stA]p\u0018Ct\u0006", "\"KB,E\u001a\u001aM\u000bbiA&Xh\u001d_LwL:bt~A]p\u0018Dw\u0004", "\"KB,E\u001a\u001aM\u000bbiA&Zd\u0017Ef\u000f_\u001czbc\u001aik\u0019T\u001f#<Y", "\"KB,E\u001a\u001aM\u000bbiA&Zd\u0017Ef\u000f_\u001czcf\u0018ik\u0019T\u001f#<Y", "\"KB,E\u001a\u001aM\u000bbiA&[h\u001d_]\u0005Y:nyr", "\"KB,E\u001a\u001aM\u000bbiA&ex\u0016Ly\u0010Z\u0010", "\"KB,E\u001a\u001aM\u000bbiA&ex\u0016Ly\u0016^\u001c", "\"KB,E\u001a\u001aM\u000bbiA&ex\u0016Ly\u0016^\u001cMfg", "\"KB,E\u001a\u001aM\u000bbiA&if}_KtN:huf", "\"KB,E\u001a\u001aM\u000bbiA&if}_KtN:nyr", "\"KB,E\u001a\u001aM\u000bbiA&jh\u000fDy\u0006X\u001ez\u0005y#", "4na\u0017T=:<\u0015\u0007z", "8`e.A(FS", "7mXA", "D`[BX", "", "AdR<a+:`-gvf,", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CipherSuite init(String str, int i2) {
            CipherSuite cipherSuite = new CipherSuite(str, null);
            CipherSuite.INSTANCES.put(str, cipherSuite);
            return cipherSuite;
        }

        private final String secondaryName(String str) {
            if (StringsKt.startsWith$default(str, "TLS_", false, 2, (Object) null)) {
                StringBuilder sb = new StringBuilder("SSL_");
                String strSubstring = str.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                return sb.append(strSubstring).toString();
            }
            if (!StringsKt.startsWith$default(str, "SSL_", false, 2, (Object) null)) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder("TLS_");
            String strSubstring2 = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            return sb2.append(strSubstring2).toString();
        }

        @JvmStatic
        public final synchronized CipherSuite forJavaName(String javaName) {
            CipherSuite cipherSuite;
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            cipherSuite = (CipherSuite) CipherSuite.INSTANCES.get(javaName);
            if (cipherSuite == null) {
                cipherSuite = (CipherSuite) CipherSuite.INSTANCES.get(secondaryName(javaName));
                if (cipherSuite == null) {
                    cipherSuite = new CipherSuite(javaName, null);
                }
                CipherSuite.INSTANCES.put(javaName, cipherSuite);
            }
            return cipherSuite;
        }

        public final Comparator<String> getORDER_BY_NAME$okhttp() {
            return CipherSuite.ORDER_BY_NAME;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        ORDER_BY_NAME = new Comparator<String>() { // from class: okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1
            @Override // java.util.Comparator
            public int compare(String a2, String b2) {
                Intrinsics.checkNotNullParameter(a2, "a");
                Intrinsics.checkNotNullParameter(b2, "b");
                int iMin = Math.min(a2.length(), b2.length());
                for (int i2 = 4; i2 < iMin; i2++) {
                    char cCharAt = a2.charAt(i2);
                    char cCharAt2 = b2.charAt(i2);
                    if (cCharAt != cCharAt2) {
                        return Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0 ? -1 : 1;
                    }
                }
                int length = a2.length();
                int length2 = b2.length();
                if (length != length2) {
                    return length < length2 ? -1 : 1;
                }
                return 0;
            }
        };
        INSTANCES = new LinkedHashMap();
        TLS_RSA_WITH_NULL_MD5 = companion.init("SSL_RSA_WITH_NULL_MD5", 1);
        TLS_RSA_WITH_NULL_SHA = companion.init("SSL_RSA_WITH_NULL_SHA", 2);
        TLS_RSA_EXPORT_WITH_RC4_40_MD5 = companion.init("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        TLS_RSA_WITH_RC4_128_MD5 = companion.init("SSL_RSA_WITH_RC4_128_MD5", 4);
        TLS_RSA_WITH_RC4_128_SHA = companion.init("SSL_RSA_WITH_RC4_128_SHA", 5);
        TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = companion.init("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        TLS_RSA_WITH_DES_CBC_SHA = companion.init("SSL_RSA_WITH_DES_CBC_SHA", 9);
        TLS_RSA_WITH_3DES_EDE_CBC_SHA = companion.init("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = companion.init("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        TLS_DHE_DSS_WITH_DES_CBC_SHA = companion.init("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = companion.init("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = companion.init("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        TLS_DHE_RSA_WITH_DES_CBC_SHA = companion.init("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = companion.init("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = companion.init("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        TLS_DH_anon_WITH_RC4_128_MD5 = companion.init("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = companion.init("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        TLS_DH_anon_WITH_DES_CBC_SHA = companion.init("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = companion.init("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        TLS_KRB5_WITH_DES_CBC_SHA = companion.init("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        TLS_KRB5_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        TLS_KRB5_WITH_RC4_128_SHA = companion.init("TLS_KRB5_WITH_RC4_128_SHA", 32);
        TLS_KRB5_WITH_DES_CBC_MD5 = companion.init("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = companion.init("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        TLS_KRB5_WITH_RC4_128_MD5 = companion.init("TLS_KRB5_WITH_RC4_128_MD5", 36);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = companion.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        TLS_KRB5_EXPORT_WITH_RC4_40_SHA = companion.init("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = companion.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = companion.init("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        TLS_RSA_WITH_AES_128_CBC_SHA = companion.init("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA = companion.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA = companion.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        TLS_DH_anon_WITH_AES_128_CBC_SHA = companion.init("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        TLS_RSA_WITH_AES_256_CBC_SHA = companion.init("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA = companion.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA = companion.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        TLS_DH_anon_WITH_AES_256_CBC_SHA = companion.init("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        TLS_RSA_WITH_NULL_SHA256 = companion.init("TLS_RSA_WITH_NULL_SHA256", 59);
        TLS_RSA_WITH_AES_128_CBC_SHA256 = companion.init("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        TLS_RSA_WITH_AES_256_CBC_SHA256 = companion.init("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = companion.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = companion.init("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = companion.init("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = companion.init("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = companion.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = companion.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = companion.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        TLS_DH_anon_WITH_AES_128_CBC_SHA256 = companion.init("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        TLS_DH_anon_WITH_AES_256_CBC_SHA256 = companion.init("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = companion.init("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = companion.init("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = companion.init("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        TLS_PSK_WITH_RC4_128_SHA = companion.init("TLS_PSK_WITH_RC4_128_SHA", 138);
        TLS_PSK_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        TLS_PSK_WITH_AES_128_CBC_SHA = companion.init("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        TLS_PSK_WITH_AES_256_CBC_SHA = companion.init("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        TLS_RSA_WITH_SEED_CBC_SHA = companion.init("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        TLS_RSA_WITH_AES_128_GCM_SHA256 = companion.init("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        TLS_RSA_WITH_AES_256_GCM_SHA384 = companion.init("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = companion.init("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = companion.init("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = companion.init("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = companion.init("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        TLS_DH_anon_WITH_AES_128_GCM_SHA256 = companion.init("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        TLS_DH_anon_WITH_AES_256_GCM_SHA384 = companion.init("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        TLS_EMPTY_RENEGOTIATION_INFO_SCSV = companion.init("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        TLS_FALLBACK_SCSV = companion.init("TLS_FALLBACK_SCSV", 22016);
        TLS_ECDH_ECDSA_WITH_NULL_SHA = companion.init("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        TLS_ECDH_ECDSA_WITH_RC4_128_SHA = companion.init("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = companion.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = companion.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        TLS_ECDHE_ECDSA_WITH_NULL_SHA = companion.init("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = companion.init("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = companion.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = companion.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        TLS_ECDH_RSA_WITH_NULL_SHA = companion.init("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        TLS_ECDH_RSA_WITH_RC4_128_SHA = companion.init("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = companion.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = companion.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        TLS_ECDHE_RSA_WITH_NULL_SHA = companion.init("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        TLS_ECDHE_RSA_WITH_RC4_128_SHA = companion.init("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = companion.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = companion.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        TLS_ECDH_anon_WITH_NULL_SHA = companion.init("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        TLS_ECDH_anon_WITH_RC4_128_SHA = companion.init("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        TLS_ECDH_anon_WITH_AES_128_CBC_SHA = companion.init("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        TLS_ECDH_anon_WITH_AES_256_CBC_SHA = companion.init("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = companion.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = companion.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = companion.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = companion.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = companion.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = companion.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = companion.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = companion.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = companion.init("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = companion.init("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = companion.init("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = companion.init("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = companion.init("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = companion.init("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = companion.init("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = companion.init("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = companion.init("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = companion.init("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = companion.init("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", org.bouncycastle.crypto.tls.CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = companion.init("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", org.bouncycastle.crypto.tls.CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256);
        TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = companion.init("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", org.bouncycastle.crypto.tls.CipherSuite.DRAFT_TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = companion.init("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", org.bouncycastle.crypto.tls.CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256);
        TLS_AES_128_GCM_SHA256 = companion.init("TLS_AES_128_GCM_SHA256", FujifilmMakernoteDirectory.TAG_FOCUS_WARNING);
        TLS_AES_256_GCM_SHA384 = companion.init("TLS_AES_256_GCM_SHA384", FujifilmMakernoteDirectory.TAG_AUTO_EXPOSURE_WARNING);
        TLS_CHACHA20_POLY1305_SHA256 = companion.init("TLS_CHACHA20_POLY1305_SHA256", 4867);
        TLS_AES_128_CCM_SHA256 = companion.init("TLS_AES_128_CCM_SHA256", FujifilmMakernoteDirectory.TAG_GE_IMAGE_SIZE);
        TLS_AES_128_CCM_8_SHA256 = companion.init("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    private CipherSuite(String str) {
        this.javaName = str;
    }

    public /* synthetic */ CipherSuite(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @JvmStatic
    public static final synchronized CipherSuite forJavaName(String str) {
        return Companion.forJavaName(str);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "javaName", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m10686deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }

    public String toString() {
        return this.javaName;
    }
}
