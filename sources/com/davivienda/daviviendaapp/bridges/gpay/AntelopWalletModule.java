package com.davivienda.daviviendaapp.bridges.gpay;

import android.app.Activity;
import com.davivienda.daviviendaapp.bridges.gpay.WalletNotificationService;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import fr.antelop.sdk.AntelopCallback;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.AsyncRequestType;
import fr.antelop.sdk.EligibilityDenialReason;
import fr.antelop.sdk.Wallet;
import fr.antelop.sdk.WalletManager;
import fr.antelop.sdk.WalletProvisioning;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.CustomerCredentialsRequiredReason;
import fr.antelop.sdk.authentication.LocalAuthenticationErrorReason;
import fr.antelop.sdk.card.CardDisplay;
import fr.antelop.sdk.card.CardInfo;
import fr.antelop.sdk.digitalcard.DigitalCard;
import fr.antelop.sdk.digitalcard.DigitalCardServiceStatus;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.AndroidActivityResultCallback;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0012-\u0015\u001e('\u001f-\u0005\u0018$\u0016\u001b\u0018$")
@Metadata(bv = {}, d1 = {"Яġ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*,(w\u000f߿r9FDm߉6Ra3\u0017k\u00024,[2}KП]\u001a\u0014\"\u0011ѧVg}nRZ\u0011F\u0017\u0006,xrߚQU\u0007]\u001a\u000f8Gw?A]w=?d|6\u001b :\">\u000b\r\u0001(9P\u0010\rzKK\u001a۵8@v;Z\rc\u0005\"Ň\u000e>6\u0001&\\mW>H\u0003]B/)\u0004qBd'g0\u0013M\u0015FZ,\u0015vo$3@=;\u001d%i\u0003\u000fRaU\tD\bܵ#dW'YH,V2\u0019\u000b$\u00199O%]!'ػ\tQn\u000eoA]ycP<?(~\n%T\u0004<\u0011WL<F2f6\u0012yy;iNj\u001a^p\u0017+eD2=\u007fa3i\u001ftjy;GR}\u0001M#,?\u0019nOr\u0005\u0012n-3T&\\aUNV`N8]\u0004rL~p\u001fB\u0004^^03\n*F\u0017S;\">k7y `D\u0016\u00165dvs\u0002RvKRr$XB\t:e\u000bdMq^vp,?dbYO\u0018\u001668\\&SQ)\u001ergh\u0018u}e\u0010%=\fO[\u0005j<}\u007f^{K_\u000b(a\u0001\u000eDCJ\u000b\u001dX\u0015M\u0004\u0010hu@\"`L1\u0015@\nRw$\u0013`V\" BEI\u0019\u000b\u0019\u000f\bfXO'!_\t\u007f@\u0003bK<\u0003\u0018/%\r\u000fitp\u001ek?Nt\u0003nMEA\u007f@_:\u001e(v`\u0015#5\u0016:\u0014\u0010}ZtdlD\r\u0006\u007f..29\u007f:m\u0017\u001d\u0018A201\fQ;\u001a_{*')\u0014*\u0015I\u0018Fi\u001ei\u001f7\u0011pX\u007fl\u00198u\r}S\fr1\u0012at\u0006wib=s@_q1dlRF\u0016\u001d\u001fL)Gtj\u001dC`['K-(\u0018=Iy]\u0018z^\u007fpA>v{\u0003ZnFspju2i<\u0010^Gf0Y\u0005\u0003p_\u001b{\u0016x!4;>xEr(n8{\u0016_\u0004t9D\u000f\u0007U\nECs\fMF_Xw\n\u0003\\\u001aQ])M\u0002\u000e\u001e\u001aY\u0016#`\u001f\u001c\u0011zA|\"\u001eM \u0005br\r@\b\n\u0017d}i\u001e3v)2D.L\b9Ndm\u0016\u0012\u0011~t\u001c=RxBǠ?V\u001c\u0012Awd\u0007\u001d`swQ.\u000f>'3L9e5\u0013/^T]&xܬӘ!\t!.\u0018\u0012tiCD\u0003PK,f@#E\f\u0004\u0010\u0379\u0530\bG/34\u0003\u001a~0|KYH\u001fG\u0019)_%r%ΗڀhNj?Zy`\u0018:)-\u0012-\u0012JT'\u000bG^9ŷܑ1LTC\u007f`(M/DW\u001e<\u0001q\u00143-4\u0004]CW2,)\u0012V\u0002}DИÙ$'\nDi\u0002e^~\n\f2j\u001a\u007fgz\u00027e\u0001$\u0012{bt!]^\u000eD$\u001a5\u0018\u0012\rd2լ̝D'1BNUY?\u0011\n\u0012\u0004\u0014rc\\\u001bf_)@ҧ\u0094T\u001d\u000f~\u0016I!1r:?jP\\\u001fY,\u0015T'f\fp\u0004(O\u0012D7աϪ_\r1\f4=o\u000fHRL\u0015O}\u0004EBTVW\u0002ۮ؉Bd\u000f;5UemvjV{%\u00107U\u0015~v!Wӂ̭Jr$EwB'\u0001s\ruwMʗ٣M&'\u0014\u001b\\)\u001bJ\u000b\u001e?'\u0015\u0011\bzt.\u000fr\u000f\u0001e\u007f.CE\u0003H`śڵ(mjinVS Z\bZ(Tı˲^8&'%7*%i3o0A\r##\u001ew\u0017\u001d;iaSS5/7G\u008dק}3q&\u0002$;.=|\b\u001b\u0006}\u0002ä̂iL-zJpXnec\u0005&(βޜ9E$j\u001eV\u000e{7$R\u001d&'\u000e]IHXj\rDd\ro\u0004T.|s\r)U_\u0011s8C0\u001d<|iULA)+IHL\u001fEl5P}n\b\u0001\\\u000f[\u0013e\u001aL){-\u000b\u0007gqnByv['t]j\u001e$\bHKy6(K\u0007^r\u0014;\u000blc\u0019\u0002\u001eUm)P\u0012;\u0011J|ygnyx\u001dF>{|T\u0001tzc@\u0011\u001a\u0007ǃľb.H\u0007[\u0014$1`\u0019\u0018|xdk\u0378?˝wAÖ'\u000e/\")];\u0005Sm!K}YHرIٝ7\u000buԲ)Asc\u001dUOS;Ɩ!ʛn+6ܘ'J(3p\u0006<M;Э\u001cͭ|D0Ғ\u0001>>Z\u0017\\Y\\/'u\u07baaȀi~:ď\bir\u001dC9mm\u0001byٍ\u0005߲\u0007\u0010IÈc\u0017,SQ2QtcЖ@ϳ\f\\QʐM\bW\u001e\u001bc` ]\u0015\u0016ĈMپpbmǪ1YE\u000f\u001a1G&\f%2u8!w\":a\u0019Kdk\u007fڲWá\u0015fJب٦~q"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wON7\u007f}y\u001ewa@\u0011n\u001eJ}.G[66[by=i", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nMf", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "/tc<93He\u0004\f\u0005f0\u000b\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "5oPF4*MW*\u0003\nr\u0019|\u0017?l\u000f\u0006wG\b\u0014\u0013Eu", "\u001aea{T5MS \t\u0006(:{\u000fxu\u000f,\u0003\n\\ \u0016Ty\u0012;R#D]\u000f$F\u0002\u0003.[SBz\u0012\u001a\u001co^5\u0005i\u0002", "7r0Bg6\u001fZ#\u0011V\\;\u0001\u001a/", "", "7r??b=Ba\u001d\t\u0004b5~l8i\u000f", ">d]1\\5@/\u0017\u000e~o(\f\r9n]2z@", "", ">q^C\\:B]\"\u0003\u0004`", "\u001aea{T5MS \t\u0006(:{\u000fxW{/\u0003@\u0010\u0002$Q\u0001\u0012Jz/>]\u0007\"\r", "E`[9X;", "\u001aea{T5MS \t\u0006(:{\u000fxW{/\u0003@\u0010l", "5dc$T3ES(=vi7v\u0016/l\u007f$\n@", "u(;3eu:\\(~\u0002h7F\u0017.kI\u001awG\b\u0017&\u001d", "Adc$T3ES(=vi7v\u0016/l\u007f$\n@", "uKU?\"(Gb\u0019\u0006\u0005iu\u000b\b5/q$\u0003G\u0001&l\u000b`", "El", "\u001aea{T5MS \t\u0006(:{\u000fxW{/\u0003@\u0010~\u0013Pk\u0010<\u0004z", "1`]\u001dh:AB#`\u0005h.\u0004\t\u001aa\u0014", "", "2hV6g(E1\u0015\fyB+", ">q^:\\:>", "1gT0^\fEW\u001b\u0003wb3\u0001\u0018C", "@n^AX+\u001dS*\u0003x^\r\u0007\u0016,i~'{I", "1n]3\\.N`\u0019`\u0005h.\u0004\t\u001aa\u0014\u001awG\b\u0017&", "1n];X*ME\u0015\u0006\u0002^;d\u00058a\u0002(\t", "2dR<W,\u001b$gh\bM/\n\u0013A", "", "05#", "4hT9W", "2hb0b5GS\u0017\u000elZ3\u0004\t>M{1wB\u0001$", "3lXA", "3uT;g", ">`h9b(=", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "3ma<_3\u001dW\u001b\u0003\nZ3Z\u0005<d", "3ma<_3FS\"\u000eYZ;x", "5dc\u0011\\.Bb\u0015\u0006XZ9{\u0017", "5dc\u0014b6@Z\u0019ivr\u001a\f\u0005>u\u000e", "5dc\u001bT4>", "7me._0=O(~", "7r2.e+\"\\z\t\u0005`3|s+y", ":`d;V/)`#\u0010~l0\u0007\u00123n\u0002\u0004\fO\u000b", "1kX2a;\"R", "E`[9X;\"R", "AdcA\\5@a\u0004\f\u0005_0\u0004\t\u0013d", ">g^;X\f\n$g", ":`d;V/)`#\u0010~l0\u0007\u00123n\u0002\u001a\u007fO\u0004r\u0015Vs\u001f8\u0006)?b[*6m", "/bc6i(MW#\bXh+|", ":`d;V/)`#\u0010~l0\u0007\u00123n\u0002\u001a\u007fO\u0004z%U\u007f\u000eIZ$", "7rbBX9\u001aQ(\u0003\fZ;\u0001\u00138I~\u0005L\u000f", "7rbBX9\u001aQ(\u0003\fZ;\u0001\u00138C\n'{\u001dQe", ";`_\u001cY", ">`X?f", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "uZ;8b;EW\"HeZ0\n^rL}2\u0004\n\u0002\u0013\u0015Gl\u0018F|nBYy\u001eF7\u0013;QB=k}\u0010\"lp5\u0004j,6r2\u001d", "=m0@l5<3&\f\u0005k", "@d`", "\u001aea{T5MS \t\u0006(:{\u000fxA\u000e<\u0005>m\u0017#Wo\u001cKe9@YS", "3qa", "\u001aea{T5MS \t\u0006(:{\u000fxA\t7{G\u000b\"vT|\u0018IL", "=m0@l5<3&\f\u0005kjx\u0014:_\r(\u0003@|%\u0017", "=m0@l5<A)|x^:\u000b", "=m0@l5<A)|x^:\u000bG+p\u000b\"\t@\b\u0017\u0013Uo", "=m2<a5>Q(\u0003\u0005g\f\n\u00169r", "3qa<e", "=m2<a5>Q(\u0003\u0005g\f\n\u00169r>$\u0007Kz$\u0017No\nJv", "=m2<a5>Q(\u0003\u0005g\u001a\r\u0007-e\u000e6", "<df$T3ES(", "=m2<a5>Q(\u0003\u0005g\u001a\r\u0007-e\u000e6:<\f\"\u0011To\u0015<r35", "=m2?X+>\\(\u0003ve:i\t;u\u00045{?", "@dP@b5", "\u001aea{T5MS \t\u0006(:{\u000fxa\u00107~@\n&\u001bEk\u001d@\u0001.~7\u000e.Fw\u001e.Z!Hk3\u001e\u001ewe5\u000eq\u0019N\u00037KYN+IRnK\u001e\u001b0", "=m2?X+>\\(\u0003ve:i\t;u\u00045{??\u0013\"Ri\u001b<}%1g}", "=m;<V(E/)\u000e}>9\n\u0013<", "Bx_2", "\u001aea{T5MS \t\u0006(:{\u000fxa\u00107~@\n&\u001bEk\u001d@\u0001.~7\u000e.Fw\u001e.Z\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u000fG[Q6[A\u0007H\u0014g", "\u001aea{T5MS \t\u0006(:{\u000fxa\u00107~@\n&\u001bEk\u001d@\u0001.~@\b\u001e3tq>\\F;tC\"\u0013dp=\u0011l\f[\u00041T9N(j\\{\u0013", ";db@T.>", "=m;<V(E/)\u000e}>9\n\u0013<${3\u0007:\u000e\u0017\u001eGk\u001c<", "=m;<V(E/)\u000e}L<z\u0007/s\u000e", "=m;<V(E/)\u000e}L<z\u0007/s\u000efwK\f\u0011$Gv\u000e8\u0005%", "=m??b=\u001eZ\u001d\u0001~[3|", "4h]4X9I`\u001d\b\n:3\u0004\u0013Ae~", ">q^1h*Mav\t\u000bg;", "", "=m??b=\u001eZ\u001d\u0001~[3|G+p\u000b\"\t@\b\u0017\u0013Uo", "=m??b=\u001e`&\t\b", "=m??b=\u001e`&\t\b\u001d(\b\u0014)r\u007f/{<\u000f\u0017", "=m??b=\"\\\u001d\u000eZk9\u0007\u0016", "=m??b=\"\\\u001d\u000eZk9\u0007\u0016ma\u000b3uM\u0001\u001e\u0017C}\u000e", "=m??b=\"\\\u001d\u000ehn*z\t=s", "=m??b=\"\\\u001d\u000ehn*z\t=s>$\u0007Kz$\u0017No\nJv", "=m??b='](^\u0002b.\u0001\u00066e", "\u001aea{T5MS \t\u0006(:{\u000fxE\u0007,}D}\u001b\u001eK~\"\u001bv.9U\u0005\r7i$8V\u0019", "@dU", "=m??b='](^\u0002b.\u0001\u00066e>$\u0007Kz$\u0017No\nJv", "=m??b=)S\"}~g.", "=m??b=)S\"}~g.;\u0005:py5{G\u0001\u0013%G", "=m??b=)S&\u0007~l:\u0001\u00138N\n7]M| &Gn", ">da:f", "=m??b=)S&\u0007~l:\u0001\u00138N\n7]M| &GnL8\u00020/f}'7i$.", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004q", "=m??b=,c\u0017|zl:", "=m??b=,c\u0017|zl:;\u0005:py5{G\u0001\u0013%G", "=m??b=Ba\u001d\t\u0004b5~u/q\u0010,\t@\u007f", "=m??b=Ba\u001d\t\u0004b5~u/q\u0010,\t@\u007fU\u0013Rz\bIv,5U\f ", ">tb5G6 ]#\u0001\u0002^\u0017x\u001d", "@db2g\u001aMO(~", "Ad]18=>\\(m\u0005C\u001a", "3uT;g\u0015:[\u0019", ">`a.`:", "AsP?g\bNb#i\bh=\u0001\u00173o\t,\u0005Ba\u001e!Y", "/bc6i(MW#\bXh+|k/x", "AsP?g\u0017K]*\u0003\tb6\u0006\r8g", "CoS.g,0O \u0006zm", "CoS.g,0O \u0006zmjx\u0014:_\r(\u0003@|%\u0017", "\u0011n\\=T5B]\"", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AntelopWalletModule extends ReactContextBaseJavaModule {
    public static final Companion Companion;
    private static final String EVT_AUTH_ERROR;
    private static final String EVT_AUTH_SUCCESS;
    private static final String EVT_PROV_ELIGIBILITY_BUSY;
    private static final String EVT_PROV_ELIGIBILITY_ERROR;
    private static final String EVT_PROV_ELIGIBLE;
    private static final String EVT_PROV_ERROR;
    private static final String EVT_PROV_INIT_ERROR;
    private static final String EVT_PROV_INIT_SUCCESS;
    private static final String EVT_PROV_NOT_ELIGIBLE;
    private static final String EVT_PROV_PENDING;
    private static final String EVT_PROV_PERMISSION_NOT_GRANTED;
    private static final String EVT_PROV_SUCCESS;
    private static final String EVT_WM_ASYNC_ERROR;
    private static final String EVT_WM_CONNECTED;
    private static final String EVT_WM_CONNECTION_ERROR;
    private static final String EVT_WM_PROVISIONING_REQUIRED;
    public static final String TAG;
    private Promise autoFlowPromise;
    public AndroidActivityResultCallback gpayActivityResultCallback;
    private volatile boolean isAutoFlowActive;
    private volatile boolean isProvisioningInit;
    private String pendingActivationCode;
    private WalletProvisioning provisioning;
    private final ReactApplicationContext reactCtx;
    private Wallet wallet;
    private WalletManager wm;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u000512ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͏MŲO\f\u001aؓ\u0011|HX%M3\u001châ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݆\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѫ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݞ;Ҋ++Q֕(Bf\n,\u0015YQcơE͉`\u0005YӠ\\39Z{K~\u0010~¾Mԫ\u0011<\f\u05faV3V:E\u001a\u0015\ndޚGɤW@X\u061c/N\u000e\by6E'VĔ}ݰ\u001ffYĥ\f%\\E\u0014\u0005; yЪAĲ_T\u0016֫e'b\u0007i1\u007fB\u0014ʳ!̆]=uՎAn\u0010:\u001c0u\u0002\u0006Ɉcѧ\u001b%?ك\n//|\u001aHriMݖ3ĈWiZ̲\u0011.|(O*7\u000e1լ7ʰoP\\Аµ\u0015`"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wON7\u007f}y\u001ewa@\u0011n\u001eJ}.G[66[by=Rod\u0016Y'\u0016\tcJy", "", "u(E", "\u0013UC,4\u001c-6\u0013^gK\u0016i", "", "\u0013UC,4\u001c-6\u0013lj<\n\\v\u001d", "\u0013UC,C\u0019(D\u0013^aB\u000e`e\u0013Lc\u0017o:]\u0007\u0005;", "\u0013UC,C\u0019(D\u0013^aB\u000e`e\u0013Lc\u0017o:`\u0004\u00041\\", "\u0013UC,C\u0019(D\u0013^aB\u000e`e\u0016E", "\u0013UC,C\u0019(D\u0013^gK\u0016i", "\u0013UC,C\u0019(D\u0013bcB\u001bvh\u001cRi\u0015", "\u0013UC,C\u0019(D\u0013bcB\u001bvv\u001fC]\bi.", "\u0013UC,C\u0019(D\u0013gdM&\\o\u0013Gc\u0005b ", "\u0013UC,C\u0019(D\u0013iZG\u000b`q\u0011", "\u0013UC,C\u0019(D\u0013iZK\u0014`v\u001dIi\u0011u)j\u0006\u0011)\\i%e\u0005\u0014", "\u0013UC,C\u0019(D\u0013lj<\n\\v\u001d", "\u0013UC,J\u00148/\u0007rc<&\\u\u001cOl", "\u0013UC,J\u001481\u0003gc>\nkh\u000e", "\u0013UC,J\u001481\u0003gc>\nkl\u0019Ny\bh-j\u0004", "\u0013UC,J\u00148>\u0006hkB\u001a`r\u0018Ih\nu-`\u0003\u0007+\\m\u001b", "\"@6", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void $r8$lambda$dqO4ZIyEmsLZ3rUxC23b9d357T4(AntelopWalletModule antelopWalletModule, DigitalCard digitalCard, Activity activity, Promise promise) throws Throwable {
        Class<?> cls = Class.forName(C1593ug.zd("\u0004\u0011\u0010Q\t\u0007\u001d\u0011\u001f\u0013\u0010\u001a\u0011\u000f\\\u0014\u0012(\u001c*\u001e\u001b%\u001c\u001a\u001b+,j 1)%)(7r-7)Bw\f:A3;?A)4@A;K%H>PHB", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134234972))), (short) (ZN.Xd() ^ (956899615 ^ 956893821))));
        Class<?>[] clsArr = new Class[371855904 ^ 371855908];
        clsArr[0] = Class.forName(C1561oA.od("ITQ\u0011FBVHTFAI>:\u0006;7K=I;6>3/.<;w+:0*,)6o(0 7j|).\u001e$&&\f\u0015\u001f\u001e\u0016${\u001d\u0011!\u0017\u000f", (short) (C1499aX.Xd() ^ (1909811389 ^ (-1909810203)))));
        clsArr[1] = Class.forName(C1561oA.Kd("Wd!Ucj\\dhj)oai-djilxfrji{n9Pvux\u0005r~Vu\bz", (short) (C1499aX.Xd() ^ (1325990457 ^ (-1325997929)))));
        clsArr[1530961895 ^ 1530961893] = Class.forName(Wg.Zd("}Ci0Y\f7yY!RD\b\"c\rJu1k", (short) (C1607wl.Xd() ^ ((2001333802 ^ 504862303) ^ 1767770894)), (short) (C1607wl.Xd() ^ ((1321453770 ^ 717605515) ^ 1678127646))));
        clsArr[(660575693 ^ 1530492381) ^ 2087116819] = Class.forName(C1561oA.Xd("N[Z\u001cUQTWUcda%j^[^p+`qieih2Uxvur}p", (short) (C1633zX.Xd() ^ (965066942 ^ (-965066554)))));
        Object[] objArr = new Object[358056616 ^ 358056620];
        objArr[0] = antelopWalletModule;
        objArr[1] = digitalCard;
        objArr[C1633zX.Xd() ^ (-1951491127)] = activity;
        objArr[2030123766 ^ 2030123765] = promise;
        short sXd = (short) (FB.Xd() ^ (1347893991 ^ 1347885581));
        int[] iArr = new int["v|wmVrGp}vxrZl\u0002-\u0003x\u0002wvt4I".length()];
        QB qb = new QB("v|wmVrGp}vxrZl\u0002-\u0003x\u0002wvt4I");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static {
        int iXd = C1633zX.Xd() ^ 1951494120;
        TAG = Qg.kd("\u001d8 )32*8\u0010#/!&#/", (short) (C1633zX.Xd() ^ ((1187731964 ^ 1869546203) ^ (-698637740))), (short) (C1633zX.Xd() ^ iXd));
        int iXd2 = C1633zX.Xd() ^ (-1951476910);
        int iXd3 = C1580rY.Xd() ^ (-831084986);
        short sXd = (short) (OY.Xd() ^ iXd2);
        short sXd2 = (short) (OY.Xd() ^ iXd3);
        int[] iArr = new int["s\u007f\u0005\u000f\u0006z\f{|x~pynsqkog~pbmpck][".length()];
        QB qb = new QB("s\u007f\u0005\u000f\u0006z\f{|x~pynsqkog~pbmpck][");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        EVT_WM_PROVISIONING_REQUIRED = new String(iArr, 0, i2);
        EVT_WM_CONNECTION_ERROR = C1561oA.ud("R^cmdYjMXVUKHXLQO_DPOKM", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (-864682971))));
        EVT_WM_CONNECTED = C1561oA.yd("4BIUF=P5JJKC:L>>", (short) (ZN.Xd() ^ (Od.Xd() ^ (796917388 ^ 1753354957))));
        EVT_WM_ASYNC_ERROR = C1561oA.Yd("P^eqjatWjqg]zaopnr", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951475583)));
        EVT_PROV_SUCCESS = Xg.qd(";IP\\NQOWaVYHIL[\\", (short) (Od.Xd() ^ (1571297986 ^ (-1571303669))), (short) (Od.Xd() ^ ((266381051 ^ 2038373313) ^ (-1990174421))));
        EVT_PROV_PERMISSION_NOT_GRANTED = Jg.Wd("\u007f5\u0005Cy!U\u0006W{6X\u001bP\u0014Vq-S>T\u001b5\u0003\u0014h\u001fA\r!x", (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831089315)), (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207815117))));
        EVT_PROV_PENDING = ZO.xd("c}\u0018\"\u007fv1iI\u0005`\u0004L^*#", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (1731074505 ^ (-1661294538)))), (short) (C1633zX.Xd() ^ ((1956585233 ^ 1280432248) ^ (-953082504))));
        int iXd4 = C1607wl.Xd() ^ (1935622194 ^ (-488336017));
        EVT_PROV_NOT_ELIGIBLE = C1626yg.Ud("h\u007f\u0007\u0013\u0001q\"\u0002jg\u001aue!8);\u0013)\u0003#", (short) (C1499aX.Xd() ^ ((1883334468 ^ 1221755444) ^ (-949211753))), (short) (C1499aX.Xd() ^ iXd4));
        EVT_PROV_INIT_SUCCESS = Ig.wd("\u001cSI75\n\u001dB\u0010LM0\bcUz  G e", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849971507)));
        EVT_PROV_INIT_ERROR = EO.Od("Z\u0016LxzB-}^U^uLOW\u007f-:v", (short) (C1499aX.Xd() ^ ((1875444342 ^ 539925544) ^ (-1340582240))));
        EVT_PROV_ERROR = C1561oA.Qd("ZfkuefbhpUa`\\^", (short) (Od.Xd() ^ ((731547368 ^ 159231701) ^ (-585581367))));
        int iXd5 = Od.Xd() ^ (408424116 ^ (-1604696985));
        EVT_PROV_ELIGIBLE = C1593ug.zd("7ELXJMKS]DLJILFQK", (short) (C1633zX.Xd() ^ ((1800479125 ^ 1299565079) ^ (-639936128))), (short) (C1633zX.Xd() ^ iXd5));
        EVT_PROV_ELIGIBILITY_ERROR = C1561oA.od("BNS]MNJPX=C?<=5;=9CGL1=<8:", (short) (OY.Xd() ^ ((1158976470 ^ 230062415) ^ 1218630816)));
        short sXd3 = (short) (C1499aX.Xd() ^ ((1029907579 ^ 611960222) ^ (-421185284)));
        int[] iArr2 = new int["5CJVHKIQ[BJHGJDLPNZ`gK_^e".length()];
        QB qb2 = new QB("5CJVHKIQ[BJHGJDLPNZ`gK_^e");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
            i3++;
        }
        EVT_PROV_ELIGIBILITY_BUSY = new String(iArr2, 0, i3);
        EVT_AUTH_SUCCESS = Wg.Zd("\\}\b,Sp\u0004>]b20==(,", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134246416))), (short) (C1607wl.Xd() ^ ((1098576856 ^ 1427355029) ^ 342442314)));
        short sXd4 = (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831078865)));
        int[] iArr3 = new int["Welx[ppe}drsqu".length()];
        QB qb3 = new QB("Welx[ppe}drsqu");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i4));
            i4++;
        }
        EVT_AUTH_ERROR = new String(iArr3, 0, i4);
        Companion = new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AntelopWalletModule(ReactApplicationContext reactApplicationContext) throws Throwable {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, Wg.vd("8*)*6\u00048;", (short) (C1580rY.Xd() ^ ((1630074818 ^ 1796711959) ^ (-171918834)))));
        this.reactCtx = reactApplicationContext;
        WalletNotificationService.Companion companion = WalletNotificationService.Companion;
        Object[] objArr = {reactApplicationContext};
        Method method = Class.forName(Qg.kd("nyv6kg{mykfnc_+`\\pbn`[cXTSa`\u001dP_UOQN[\u0015MUE\\\u00108AKJBP)IMA=?85G;@>\"3?B4-.k\n524$0*/-", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831088418))), (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951496813))))).getMethod(C1561oA.ud("[LZ7IDEU#NLQASN", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134233145)))), Class.forName(hg.Vd("itq1hbcd`lkf(k]XYi\"UdZTVS\u001b>PKL\\(VUPLEBTHMK\u001fJHM=OJ", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (889790345 ^ (-75509009)))), (short) (C1607wl.Xd() ^ (1883578489 ^ 1883584005)))));
        try {
            method.setAccessible(true);
            method.invoke(companion, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final /* synthetic */ void access$emit(AntelopWalletModule antelopWalletModule, String str, WritableMap writableMap) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.yd("\u000e\u001b\u0016W\u0013\u0011#\u0017)\u001d\u0016 \u001b\u0019b\u001a{\u0012\u0002\u0010\b\u0005\u000b\u0002\u0004\u0005\u0011\u0012T\n\u0017\u000f/3.=|7=/L\u0002\u0012@K=AE+\u0013\u001a&+%1\u000b2(6.,", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (1663405501 ^ (-224501408))))));
        Class<?>[] clsArr = new Class[C1607wl.Xd() ^ (817007726 ^ 1593221046)];
        clsArr[0] = Class.forName(C1561oA.Yd("\u0011\t\u001f\u000bX\u0018\u000e\u001c\u0016]\u0004&%\u001d#\u001d", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951479554))));
        int iXd = Od.Xd() ^ (1158366739 ^ (-49723954));
        clsArr[1] = Class.forName(Xg.qd("8ED\u0006?;>A?MNK\u000fTHEHZ\u0015J[SOSR\u001cFbZfTVa[DYi", (short) (Od.Xd() ^ (515530056 ^ (-515529858))), (short) (Od.Xd() ^ iXd)));
        Object[] objArr = new Object[C1607wl.Xd() ^ (2048686514 ^ 341338730)];
        objArr[0] = str;
        objArr[1] = writableMap;
        int iXd2 = Od.Xd() ^ (1600167102 ^ (-412952628));
        int iXd3 = C1580rY.Xd() ^ 831084101;
        short sXd = (short) (C1633zX.Xd() ^ iXd2);
        short sXd2 = (short) (C1633zX.Xd() ^ iXd3);
        int[] iArr = new int["\\7,\u0006".length()];
        QB qb = new QB("\\7,\u0006");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final /* synthetic */ WritableMap access$mapOf(AntelopWalletModule antelopWalletModule, Pair... pairArr) throws Throwable {
        Object[] objArr = {pairArr};
        Method declaredMethod = Class.forName(ZO.xd("\u0004D~W~1\u0018y7o/{B\u001c\u000e5(Xste0:ubq \u000e\"#)}qDN$|VY<MNtL\u0015\u0005F o89\u000eq?~K\u0018I\u000f\u0011\\", (short) (C1607wl.Xd() ^ ((348462998 ^ 2113895448) ^ 1765420598)), (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (587137528 ^ (-1454253387)))))).getDeclaredMethod(C1626yg.Ud("\u0006.9{m", (short) (C1607wl.Xd() ^ (659193995 ^ 659215796)), (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134262441)))), Pair[].class);
        try {
            declaredMethod.setAccessible(true);
            return (WritableMap) declaredMethod.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final byte[] decodeB64OrThrow(String str, String str2) throws Throwable {
        try {
            Class<?> cls = Class.forName(Ig.wd("T\u0017?i?{^h\u0001\u0010\u000b(>DW\b\\;a", (short) (C1499aX.Xd() ^ (1000070865 ^ (-1000065363)))));
            Class<?>[] clsArr = new Class[997473189 ^ 997473191];
            short sXd = (short) (FB.Xd() ^ ((2125219767 ^ 702861652) ^ 1464387950));
            int[] iArr = new int["*q\u0017(4HY}>h\u0010\u000bTQJ\u001d".length()];
            QB qb = new QB("*q\u0017(4HY}>h\u0010\u000bTQJ\u001d");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = new Object[(1243794231 ^ 1113140100) ^ 142336177];
            objArr[0] = str;
            objArr[1] = 0;
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Qd("oolwkk", (short) (C1633zX.Xd() ^ (575082511 ^ (-575088023)))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                Intrinsics.checkNotNull(bArr);
                return bArr;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(str2 + C1593ug.zd("Dg\b\u001b\u000e_^K\u0016\u001c%ل\u001d\u001b\u0017#", (short) (C1607wl.Xd() ^ ((131266793 ^ 1001526524) ^ 1012976244)), (short) (C1607wl.Xd() ^ ((86361887 ^ 388698926) ^ 302968386))));
        }
    }

    private final void emit(String str, WritableMap writableMap) {
        try {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactCtx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        } catch (Throwable unused) {
        }
    }

    static /* synthetic */ void emit$default(AntelopWalletModule antelopWalletModule, String str, WritableMap writableMap, int i2, Object obj) throws Throwable {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            writableMap = null;
        }
        short sXd = (short) (C1633zX.Xd() ^ (FB.Xd() ^ (144533980 ^ (-1467096166))));
        int[] iArr = new int["hsp0eaugse`h]Y%ZVj\\hZU]RNM[Z\u0017JYOIKHU\u000fGO?V\n\u001cHM=CEE+4>=5C\u001b<0@6.".length()];
        QB qb = new QB("hsp0eaugse`h]Y%ZVj\\hZU]RNM[Z\u0017JYOIKHU\u000fGO?V\n\u001cHM=CEE+4>=5C\u001b<0@6.");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[Od.Xd() ^ (1257221462 ^ 219298049)];
        clsArr[0] = Class.forName(C1561oA.Kd("\u0012\n \fY\u0019\u000f\u001d\u0017^\u0005'&\u001e$\u001e", (short) (C1499aX.Xd() ^ ((1140758473 ^ 663179604) ^ (-1685684509)))));
        int iXd = Od.Xd() ^ (-1207803728);
        clsArr[1] = Class.forName(Wg.Zd(";\u0007&$3k\u000fP6\u0001 \u0019tx\r\b3\u007f\u001a\f7kG\u0006-r?\u0018(,:xk$-~d", (short) (C1499aX.Xd() ^ (1141136553 ^ (-1141144865))), (short) (C1499aX.Xd() ^ iXd)));
        Object[] objArr = new Object[(1813965015 ^ 256252641) ^ 1666773556];
        objArr[0] = str;
        objArr[1] = writableMap;
        short sXd2 = (short) (ZN.Xd() ^ (FB.Xd() ^ (1861146280 ^ 822209785)));
        int[] iArr2 = new int["PYVb".length()];
        QB qb2 = new QB("PYVb");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i4));
            i4++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i4), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(antelopWalletModule, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final WritableMap mapOf(Pair<String, ? extends Object>... pairArr) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Pair<String, ? extends Object> pair : pairArr) {
            String strComponent1 = pair.component1();
            Object objComponent2 = pair.component2();
            if (objComponent2 != null) {
                if (objComponent2 instanceof String) {
                    writableMapCreateMap.putString(strComponent1, (String) objComponent2);
                } else if (objComponent2 instanceof Boolean) {
                    writableMapCreateMap.putBoolean(strComponent1, ((Boolean) objComponent2).booleanValue());
                } else if (objComponent2 instanceof Integer) {
                    writableMapCreateMap.putInt(strComponent1, ((Number) objComponent2).intValue());
                } else {
                    writableMapCreateMap.putString(strComponent1, objComponent2.toString());
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, Wg.vd("\f\u001c\u0019\u0016 ORSPL", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849977217))));
        return writableMapCreateMap;
    }

    private static final void pushToGooglePay$lambda$8(final AntelopWalletModule antelopWalletModule, DigitalCard digitalCard, Activity activity, Promise promise) {
        int iXd = Od.Xd() ^ (398467105 ^ 1346234984);
        String strKd = Qg.kd("\u007f\f\u0011\u001b\u0002\ny\u0011\u0016\u0006\n\u0007z\u0011u\u0002\u0001|~", (short) (ZN.Xd() ^ ((1758056888 ^ 130244861) ^ 1862975032)), (short) (ZN.Xd() ^ iXd));
        int iXd2 = C1499aX.Xd() ^ (95140610 ^ (-1177613879));
        Intrinsics.checkNotNullParameter(antelopWalletModule, hg.Vd("_RR[\u000b\u0016", (short) (C1607wl.Xd() ^ ((39856065 ^ 999784075) ^ 972514772)), (short) (C1607wl.Xd() ^ iXd2)));
        short sXd = (short) (C1633zX.Xd() ^ ((1360746193 ^ 1629889586) ^ (-809314680)));
        int[] iArr = new int["\u0004CA".length()];
        QB qb = new QB("\u0004CA");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(digitalCard, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(activity, C1561oA.yd("\u0013QPbTbR^`", (short) (C1607wl.Xd() ^ ((1711999151 ^ 45933381) ^ 1689767886))));
        short sXd2 = (short) (C1607wl.Xd() ^ ((1865858484 ^ 1798179840) ^ 68723264));
        int[] iArr2 = new int["/|\u007f}|y\u0005w".length()];
        QB qb2 = new QB("/|\u007f}|y\u0005w");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
            i3++;
        }
        Intrinsics.checkNotNullParameter(promise, new String(iArr2, 0, i3));
        try {
            antelopWalletModule.gpayActivityResultCallback = digitalCard.getGooglePayService().pushCard(activity, new OperationCallback<Void>() { // from class: com.davivienda.daviviendaapp.bridges.gpay.AntelopWalletModule$pushToGooglePay$1$1
                @Override // fr.antelop.sdk.util.OperationCallback
                public void onError(AntelopError antelopError) throws Throwable {
                    String strVd = hg.Vd("Q]\\XZ", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831076591))), (short) (FB.Xd() ^ (ZN.Xd() ^ (1518065891 ^ 1777445287))));
                    Intrinsics.checkNotNullParameter(antelopError, strVd);
                    AntelopBridgeUtils antelopBridgeUtils = AntelopBridgeUtils.INSTANCE;
                    Object[] objArr = {antelopError};
                    Method method = Class.forName(C1561oA.ud("\f\u0017\u0014S\t\u0005\u0019\u000b\u0017\t\u0004\f\u0001|H}y\u000e\u007f\f}x\u0001uqp~}:m|rlnkx2jrby-?kp`fhh9h^XZWFdXZ`", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69944162))))).getMethod(C1561oA.Yd("AOVHPTV,Z[Y]@\\;TcdSZY", (short) (OY.Xd() ^ (430233368 ^ 430238125))), Class.forName(C1561oA.yd("'2l\u001f38(.((d)!'hz?D4:DD\u0018D;79", (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609504002)))));
                    try {
                        method.setAccessible(true);
                        String str = (String) method.invoke(antelopBridgeUtils, objArr);
                        AntelopWalletModule antelopWalletModule2 = this.this$0;
                        Pair[] pairArr = new Pair[(1149750113 ^ 653120087) ^ 1651120436];
                        short sXd3 = (short) (C1499aX.Xd() ^ ((1881300789 ^ 1219274079) ^ (-948872562)));
                        short sXd4 = (short) (C1499aX.Xd() ^ (111764878 ^ (-111761164)));
                        int[] iArr3 = new int["*-\u001c\u001d /0".length()];
                        QB qb3 = new QB("*-\u001c\u001d /0");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                            i4++;
                        }
                        pairArr[0] = TuplesKt.to(new String(iArr3, 0, i4), false);
                        pairArr[1] = TuplesKt.to(strVd, str);
                        AntelopWalletModule.access$emit(antelopWalletModule2, Jg.Wd("v:^\b\u000e6E\u0004(6Yu\t7HY\u0006)>l", (short) (C1607wl.Xd() ^ ((1977559667 ^ 1939655741) ^ 105099156)), (short) (C1607wl.Xd() ^ ((817013444 ^ 408884241) ^ 686662304))), AntelopWalletModule.access$mapOf(antelopWalletModule2, pairArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }

                @Override // fr.antelop.sdk.util.OperationCallback
                public /* bridge */ /* synthetic */ void onSuccess(Void r12) throws Throwable {
                    Class<?> cls = Class.forName(ZO.xd("}}v7erS\u0014\u0006x\u0014SE}/AO\u0018yt\rs\u0015d,Q\u001916rbMk$Z`!v5p!\u0018{uFOJBJ\u0012:Q\u001dfW\u001bhO:l,[:\\X/!b:<y+eE$:.O{-x", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (2062079119 ^ (-1231201213)))), (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (2025131469 ^ 1228694836)))));
                    Class<?>[] clsArr = {Class.forName(C1626yg.Ud("0DD\u001fOg.\u0016\u0010]Ud<h", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849968338)), (short) (OY.Xd() ^ ((925320517 ^ 2093289208) ^ 1273125548))))};
                    Object[] objArr = {r12};
                    short sXd3 = (short) (Od.Xd() ^ (FB.Xd() ^ (1677581173 ^ (-1007856195))));
                    int[] iArr3 = new int["\u000bW\u001a\u0015\u0003M{\nf".length()];
                    QB qb3 = new QB("\u000bW\u001a\u0015\u0003M{\nf");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd3 + i4)));
                        i4++;
                    }
                    Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(this, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }

                /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
                public void onSuccess2(Void r10) throws Throwable {
                    AntelopWalletModule antelopWalletModule2 = this.this$0;
                    WritableMap writableMapAccess$mapOf = AntelopWalletModule.access$mapOf(antelopWalletModule2, TuplesKt.to(EO.Od("H\u0002]9S\u00177", (short) (ZN.Xd() ^ (364067485 ^ 364069675))), true));
                    short sXd3 = (short) (C1580rY.Xd() ^ (Od.Xd() ^ (65345574 ^ (-1142458128))));
                    int[] iArr3 = new int["]inx_gWnscgdXn`R_`V]".length()];
                    QB qb3 = new QB("]inx_gWnscgdXn`R_`V]");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
                        i4++;
                    }
                    AntelopWalletModule.access$emit(antelopWalletModule2, new String(iArr3, 0, i4), writableMapAccess$mapOf);
                }
            });
            promise.resolve(true);
        } catch (WalletValidationException e2) {
            promise.reject(strKd, e2);
        } catch (Throwable th) {
            promise.reject(strKd, th);
        }
    }

    private final void sendEventToJS(String str, String str2) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, str2);
    }

    @ReactMethod
    public final void canPushToGooglePay(String str, final Promise promise) {
        Intrinsics.checkNotNullParameter(str, Xg.qd("\u0017\u001d\u001c\u001f+\u0019%|\u001c.!\u0007#", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849978469))), (short) (Od.Xd() ^ (1211255009 ^ (-1211259103)))));
        Intrinsics.checkNotNullParameter(promise, Jg.Wd("$B.\u0015,&\u0001", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864692362))), (short) (C1633zX.Xd() ^ (632782921 ^ (-632798926)))));
        Wallet wallet = this.wallet;
        if (wallet == null) {
            int iXd = Od.Xd() ^ (783916974 ^ (-1766093297));
            int iXd2 = OY.Xd() ^ (-69941591);
            short sXd = (short) (C1633zX.Xd() ^ iXd);
            short sXd2 = (short) (C1633zX.Xd() ^ iXd2);
            int[] iArr = new int["=M\"}EY\\%\u001f\u0016'Wj".length()];
            QB qb = new QB("=M\"}EY\\%\u001f\u0016'Wj");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            promise.reject(new String(iArr, 0, i2), C1626yg.Ud("?4Oap\u000bWpq\u0013\"E$Ąq?yhy\t3V=\u0018f", (short) (FB.Xd() ^ (OY.Xd() ^ (1432291257 ^ 1366558431))), (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951480173)))));
            return;
        }
        try {
            DigitalCard digitalCard = wallet.getDigitalCard(str);
            if (digitalCard == null) {
                throw new IllegalStateException(EO.Od("\u007f`Yn", (short) (C1633zX.Xd() ^ (617676602 ^ (-617658594)))).toString());
            }
            try {
                digitalCard.getGooglePayService().canPushCardOffline(this.reactCtx, new OperationCallback<Boolean>() { // from class: com.davivienda.daviviendaapp.bridges.gpay.AntelopWalletModule.canPushToGooglePay.1
                    @Override // fr.antelop.sdk.util.OperationCallback
                    public void onError(AntelopError antelopError) throws Throwable {
                        Intrinsics.checkNotNullParameter(antelopError, Ig.wd("-kW:k", (short) (C1499aX.Xd() ^ ((1870781914 ^ 588198026) ^ (-1284415538)))));
                        AntelopBridgeUtils antelopBridgeUtils = AntelopBridgeUtils.INSTANCE;
                        short sXd3 = (short) (FB.Xd() ^ (ZN.Xd() ^ 864684398));
                        int[] iArr2 = new int["$vHo_\t(uMb^\u0004HA\u0004Z,9v9fAVR\n$W\u0004yBl\u0002'R\u0003Q.\n9\u00140L/F\u0006b~*\u0019R\u001a^}\u0010MAZ1_d".length()];
                        QB qb2 = new QB("$vHo_\t(uMb^\u0004HA\u0004Z,9v9fAVR\n$W\u0004yBl\u0002'R\u0003Q.\n9\u00140L/F\u0006b~*\u0019R\u001a^}\u0010MAZ1_d");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                            i3++;
                        }
                        Object[] objArr = {antelopError};
                        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1593ug.zd("\u0003\u0011\u0018\n\u0012\u0016\u0018m\u001c\u001d\u001b\u001f\u0002\u001e|\u0016%&\u0015\u001c\u001b", (short) (C1607wl.Xd() ^ (1738327637 ^ 1738341169)), (short) (C1607wl.Xd() ^ (78107176 ^ 78105881))), Class.forName(C1561oA.Qd("Ze R^cSY[[\u0018\\LR\u0014&RWGMOO#ONJL", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134264109)))));
                        try {
                            method.setAccessible(true);
                            promise.reject(C1561oA.od("t\u0001\u0006\u0010v~n\u0006\u000bmjvw{xl\u0003gsrnp", (short) (C1633zX.Xd() ^ ((1383676688 ^ 1723786327) ^ (-885502822)))), (String) method.invoke(antelopBridgeUtils, objArr));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }

                    @Override // fr.antelop.sdk.util.OperationCallback
                    public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) throws Throwable {
                        boolean zBooleanValue = bool.booleanValue();
                        short sXd3 = (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (786651950 ^ 1836605467)));
                        int[] iArr2 = new int["ivu7nl\u0003v\u0005xu\u007fvtByw\u000e\u0002\u0010\u0004\u0001\u000b\u0002\u007f\u0001\u0011\u0012P\u0006\u0017\u000f\u000b\u000f\u000e\u001dX\u0013\u001d\u000f(]q '\u0019!%'\u000f\u001a&'!1\u000b.$6.(g('5\u0018>=3 <\u0015>?8>8$6Oz\t".length()];
                        QB qb2 = new QB("ivu7nl\u0003v\u0005xu\u007fvtByw\u000e\u0002\u0010\u0004\u0001\u000b\u0002\u007f\u0001\u0011\u0012P\u0006\u0017\u000f\u000b\u000f\u000e\u001dX\u0013\u001d\u000f(]q '\u0019!%'\u000f\u001a&'!1\u000b.$6.(g('5\u0018>=3 <\u0015>?8>8$6Oz\t");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
                            i3++;
                        }
                        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                        Class<?>[] clsArr = {Boolean.TYPE};
                        Object[] objArr = {Boolean.valueOf(zBooleanValue)};
                        Method method = cls.getMethod(Wg.Zd("\u0016\u0019Q7x|U'z", (short) (C1580rY.Xd() ^ ((336732687 ^ 1705516244) ^ (-1908040449))), (short) (C1580rY.Xd() ^ ((215737750 ^ 1501636504) ^ (-1432017437)))), clsArr);
                        try {
                            method.setAccessible(true);
                            method.invoke(this, objArr);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }

                    public void onSuccess(boolean z2) {
                        promise.resolve(Boolean.valueOf(z2));
                    }
                });
            } catch (WalletValidationException e2) {
                promise.reject(Ig.wd("\u0002:0!GtEN\t\u0011\r<jq{\u0017T<\u0002\u0006Gz", (short) (C1499aX.Xd() ^ ((377294463 ^ 1681787281) ^ (-1917010567)))), e2);
            }
        } catch (Throwable unused) {
            short sXd3 = (short) (Od.Xd() ^ (266559124 ^ (-266549076)));
            int[] iArr2 = new int["x\u0019H\r\u001f\u000f\u0018\u0018\bAd\t\u0006\u0007\u0011|\u0007\\y\nz5".length()];
            QB qb2 = new QB("x\u0019H\r\u001f\u000f\u0018\u0018\bAd\t\u0006\u0007\u0011|\u0007\\y\nz5");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            promise.reject(C1593ug.zd("\u001c*1=\"!3&B24:F.8?90", (short) (C1580rY.Xd() ^ ((758911753 ^ 1391713324) ^ (-2144336232))), (short) (C1580rY.Xd() ^ ((235360035 ^ 704674988) ^ (-604465292)))), new String(iArr2, 0, i3) + str);
        }
    }

    @ReactMethod
    public final void checkEligibility(boolean z2, Promise promise) throws Throwable {
        String strOd = C1561oA.od("\u0003y\u0007\u0006rwt", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849960627))));
        Intrinsics.checkNotNullParameter(promise, C1561oA.Kd("[^\\[XcV", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (1044638403 ^ (-1242743854))))));
        WalletProvisioning walletProvisioning = this.provisioning;
        if (walletProvisioning == null) {
            String strZd = Wg.Zd("\u0010/'A+\u0005sK\u000e\u000e6,\u000f37lGM", (short) (ZN.Xd() ^ (815550328 ^ 815553492)), (short) (ZN.Xd() ^ (622618494 ^ 622593507)));
            short sXd = (short) (FB.Xd() ^ (1104241081 ^ 1104219623));
            int[] iArr = new int["Dgemalcjjflf oq#msojqjvt\u0007nr~".length()];
            QB qb = new QB("Dgemalcjjflf oq#msojqjvt\u0007nr~");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            promise.reject(strZd, new String(iArr, 0, i2));
            return;
        }
        try {
            walletProvisioning.checkEligibility(true);
            promise.resolve(true);
        } catch (WalletValidationException e2) {
            Pair[] pairArr = new Pair[1];
            String message = e2.getMessage();
            if (message == null) {
                message = ZO.xd("K\u0004\u0019+\u0004SOd\u001e'\u0010\\|@\u007f'\u001cq\u001bC\rHj", (short) (OY.Xd() ^ ((1212381478 ^ 638369029) ^ 1850735187)), (short) (OY.Xd() ^ ((2073675433 ^ 1289950150) ^ 930806041)));
            }
            pairArr[0] = TuplesKt.to(strOd, message);
            Object[] objArr = {pairArr};
            Method declaredMethod = Class.forName(C1626yg.Ud("@Q$\u001dK\rH0\u000f >\u001c|;\u001aM&ie8[\u0016B(W^Owukn`dI\u0011\u0007C}@'\b%A/\u0016FDz\u00186\u001a\u0011\"\u0002y_=\u000e\r\u0007H", (short) (Od.Xd() ^ ((2117512189 ^ 1060393174) ^ (-1090694485))), (short) (Od.Xd() ^ (1842215573 ^ (-1842210570))))).getDeclaredMethod(Ig.wd("(fQ\u0017c", (short) (C1633zX.Xd() ^ ((1973796741 ^ 1526227609) ^ (-794672903)))), Pair[].class);
            try {
                declaredMethod.setAccessible(true);
                WritableMap writableMap = (WritableMap) declaredMethod.invoke(this, objArr);
                String strOd2 = EO.Od("Y7\ruw'Fv_VYv@BEo@)}\tNz62W", (short) (C1499aX.Xd() ^ ((1628527259 ^ 1437970160) ^ (-883204341))));
                short sXd2 = (short) (C1580rY.Xd() ^ ((1541507798 ^ 610527823) ^ (-2139241458)));
                int[] iArr2 = new int["!,)h\u001e\u001a. ,\u001e\u0019!\u0016\u0012]\u0013\u000f#\u0015!\u0013\u000e\u0016\u000b\u0007\u0006\u0014\u0013O\u0003\u0012\b\u0002\u0004\u0001\u000eG\u007f\bw\u000fBT\u0001\u0006u{}}clvum{Sthxnf".length()];
                QB qb2 = new QB("!,)h\u001e\u001a. ,\u001e\u0019!\u0016\u0012]\u0013\u000f#\u0015!\u0013\u000e\u0016\u000b\u0007\u0006\u0014\u0013O\u0003\u0012\b\u0002\u0004\u0001\u000eG\u007f\bw\u000fBT\u0001\u0006u{}}clvum{Sthxnf");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = new Class[157680812 ^ 157680814];
                clsArr[0] = Class.forName(C1593ug.zd("qi\u007fk9xn|v>d\u0007\u0006}\u0004}", (short) (FB.Xd() ^ ((2119071131 ^ 1292591736) ^ 860190775)), (short) (FB.Xd() ^ ((184154073 ^ 1686322802) ^ 1853525072))));
                clsArr[1] = Class.forName(C1561oA.od("&1.m%\u001f !\u001d)(#d(\u001a\u0015\u0016&^\u0012!\u0017\u0011\u0013\u0010W\u007f\u001a\u0010\u001a\u0006\u0006\u000f\u0007m\u0001\u000f", (short) (C1607wl.Xd() ^ ((88479840 ^ 1552297743) ^ 1505767940))));
                Object[] objArr2 = new Object[1549639159 ^ 1549639157];
                objArr2[0] = strOd2;
                objArr2[1] = writableMap;
                short sXd3 = (short) (C1499aX.Xd() ^ (1136554442 ^ (-1136528358)));
                int[] iArr3 = new int["S\\Ye".length()];
                QB qb3 = new QB("S\\Ye");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd3 + sXd3) + i4));
                    i4++;
                }
                Method declaredMethod2 = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
                try {
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(this, objArr2);
                    promise.reject(strOd2, e2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Throwable th) {
            Pair[] pairArr2 = new Pair[1];
            String message2 = th.getMessage();
            if (message2 == null) {
                short sXd4 = (short) (C1607wl.Xd() ^ ((124352227 ^ 1191284464) ^ 1080607919));
                int[] iArr4 = new int["\u007f,/+1]%%&\u0015$\"&\u0019\"\u001c\u001a".length()];
                QB qb4 = new QB("\u007f,/+1]%%&\u0015$\"&\u0019\"\u001c\u001a");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK((sXd4 ^ i5) + xuXd4.CK(iKK4));
                    i5++;
                }
                message2 = new String(iArr4, 0, i5);
            }
            pairArr2[0] = TuplesKt.to(strOd, message2);
            short sXd5 = (short) (C1633zX.Xd() ^ ((1151851495 ^ 1384150509) ^ (-371704945)));
            short sXd6 = (short) (C1633zX.Xd() ^ (1752023536 ^ (-1752028262)));
            int[] iArr5 = new int["~\n\u0007F{w\f}\n{v~so;pl\u0001r~pkshdcqp-`oe_a^k%]eUl 2^cSY[[AJTSKY1RFVLD".length()];
            QB qb5 = new QB("~\n\u0007F{w\f}\n{v~so;pl\u0001r~pkshdcqp-`oe_a^k%]eUl 2^cSY[[AJTSKY1RFVLD");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK(((sXd5 + i6) + xuXd5.CK(iKK5)) - sXd6);
                i6++;
            }
            Object[] objArr3 = {pairArr2};
            Method declaredMethod3 = Class.forName(new String(iArr5, 0, i6)).getDeclaredMethod(hg.Vd("uhvTj", (short) (FB.Xd() ^ (978463220 ^ 978472880)), (short) (FB.Xd() ^ ((963593132 ^ 2068456606) ^ 1109738327))), Pair[].class);
            try {
                declaredMethod3.setAccessible(true);
                WritableMap writableMap2 = (WritableMap) declaredMethod3.invoke(this, objArr3);
                String strUd = C1561oA.ud("\u000f\u001b *\u001a\u001b\u0017\u001d%\n\u0010\f\t\n\u0002\b\n\u0006\u0010\u0014\u0019}\n\t\u0005\u0007", (short) (C1607wl.Xd() ^ (915406936 ^ 915437659)));
                Class<?> cls2 = Class.forName(C1561oA.yd("?JG\u0007<8L>ZLGOD@\fA-A3?1,4)54BA}1@6 \"\u001f,e\u001e&\u0016=p\u0003/4$*,\u001c\u0002\u000b\u0015\u0014\f\u001aq#\u0017'\u001d\u0015", (short) (FB.Xd() ^ (91398794 ^ 91405518))));
                Class<?>[] clsArr2 = new Class[(615561281 ^ 1149194584) ^ 1624238363];
                clsArr2[0] = Class.forName(C1561oA.Yd("*\"8$q1'5/v\u001d?>6<6", (short) (C1607wl.Xd() ^ (1118880539 ^ 1118874334))));
                clsArr2[1] = Class.forName(Xg.qd("P]\\\u001eWSVYWefc'l`]`r-bskgkj4^zr~lnys\\q\u0002", (short) (ZN.Xd() ^ ((1659126195 ^ 611441530) ^ 1184219704)), (short) (ZN.Xd() ^ (1559730645 ^ 1559742503))));
                Object[] objArr4 = new Object[(660926000 ^ 1677630169) ^ 1150973163];
                objArr4[0] = strUd;
                objArr4[1] = writableMap2;
                Method declaredMethod4 = cls2.getDeclaredMethod(Jg.Wd("&~F8", (short) (Od.Xd() ^ ((114400331 ^ 1496438174) ^ (-1608525771))), (short) (Od.Xd() ^ (1271601313 ^ (-1271621867)))), clsArr2);
                try {
                    declaredMethod4.setAccessible(true);
                    declaredMethod4.invoke(this, objArr4);
                    promise.reject(strUd, th);
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        }
    }

    @ReactMethod
    public final void configureGooglePayWallet(String str, Promise promise) {
        Intrinsics.checkNotNullParameter(str, Wg.Zd("\u001eg\"f:h2M\"s'J.", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (920516234 ^ (-89640942)))), (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609518738)))));
        short sXd = (short) (C1580rY.Xd() ^ ((469615625 ^ 1747679880) ^ (-1943459321)));
        int[] iArr = new int["X[YXU`S".length()];
        QB qb = new QB("X[YXU`S");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(promise, new String(iArr, 0, i2));
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(Wg.vd("R^gqccvWL\\T`V`h", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (-69928046)))), Qg.kd("p\u0011@\b\u007f\u0017<\\}\u000e\u0002\u000e\u007f\n\u000e3st\u0005\u0005oy", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69946390)), (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (275954670 ^ (-1407841575))))));
            return;
        }
        Wallet wallet = this.wallet;
        if (wallet == null) {
            promise.reject(hg.Vd("MY^hVVe\\EONFT", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951491633)), (short) (C1633zX.Xd() ^ (Od.Xd() ^ (1458650072 ^ (-286063276))))), C1561oA.ud("x\u0002\f\u000b\u0003\u0011;\t\t8|\n\n\u061c3u\u0001~tq\u0002mok7", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864688008)))));
            return;
        }
        try {
            DigitalCard digitalCard = wallet.getDigitalCard(str);
            if (digitalCard == null) {
                throw new IllegalStateException(C1561oA.Yd("5=5+", (short) (Od.Xd() ^ ((2035841105 ^ 360370131) ^ (-1814230450)))).toString());
            }
            try {
                digitalCard.getGooglePayService().configureWallet(currentActivity);
                promise.resolve(true);
            } catch (Exception e2) {
                promise.reject(C1561oA.yd("\u001f+0:)1!85\u0018#! \"\u001f, \u0012+\u0010$#\u001f!", (short) (C1607wl.Xd() ^ ((1581078699 ^ 117273471) ^ 1489004725))), e2);
            }
        } catch (Throwable unused) {
            promise.reject(Jg.Wd("_\bjW`?,~/\u007f]Fv>%\f\u001ao", (short) (FB.Xd() ^ (1033990439 ^ 1033981806)), (short) (FB.Xd() ^ ((1212830204 ^ 1411015490) ^ 475027060))), Xg.qd("\"Du<PBMOA|\"HGJVDP(GYL\t", (short) (OY.Xd() ^ ((1836773981 ^ 61377476) ^ 1859279282)), (short) (OY.Xd() ^ (268141810 ^ 268168928))) + str);
        }
    }

    @ReactMethod
    public final void connectWalletManager(Promise promise) {
        short sXd = (short) (C1607wl.Xd() ^ ((1321343703 ^ 1864824948) ^ 568640927));
        short sXd2 = (short) (C1607wl.Xd() ^ ((834760492 ^ 1309234061) ^ 2143837086));
        int[] iArr = new int["\u0012Fj\u001e{\u0015\u00020z\b/\u0006L\u0010h%[".length()];
        QB qb = new QB("\u0012Fj\u001e{\u0015\u00020z\b/\u0006L\u0010h%[");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Intrinsics.checkNotNullParameter(promise, C1626yg.Ud("c1|+8e\u000f", (short) (Od.Xd() ^ (57490407 ^ (-57482212))), (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831070096))));
        try {
            if (this.wm == null) {
                ReactApplicationContext reactApplicationContext = this.reactCtx;
                Class<?> cls = Class.forName(Ig.wd("K(4 6nS>t\u001b\u0011 gr\u0017nCF\u0001Bn6YGaq\"\u000617\u0017oV7\u001em}\u0017\u0003\u0006\u001e:z&U2\u00036)a\rmp\u000eQ2\u0001\u0001Y, C{\f:", (short) (FB.Xd() ^ ((1372357980 ^ 2071482327) ^ 716502397))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(EO.Od("U\t9\"1z[G~60W{rW,]\r(\r:rNB\u001bxk5Nvd; ~N\u001c:Ykh\u0007%g\u0011210\u0001Q\u0012^\u0017=_NDb{XOB", (short) (OY.Xd() ^ ((207498402 ^ 571837489) ^ 776708238))));
                Object[] objArr = {this};
                Constructor<?> constructor = cls.getConstructor(clsArr);
                try {
                    constructor.setAccessible(true);
                    this.wm = new WalletManager(reactApplicationContext, (AntelopManagerCallbacks) constructor.newInstance(objArr), null);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            WalletManager walletManager = this.wm;
            if (walletManager != null) {
                walletManager.connect();
            }
            promise.resolve(true);
        } catch (WalletValidationException e3) {
            promise.reject(str, e3);
        } catch (Throwable th) {
            promise.reject(str, th);
        }
    }

    @ReactMethod
    public final void disconnectWalletManager() {
        try {
            WalletManager walletManager = this.wm;
            if (walletManager != null) {
                walletManager.disconnect();
            }
        } catch (Throwable unused) {
        }
    }

    @ReactMethod
    public final void enrollDigitalCard(String str, final Promise promise) {
        String strQd = C1561oA.Qd("\u000e\u001a\u001f)\u000e\u0016\u0019\u0015\u0011\u0010\"\u0007\u0013\u0012\u000e\u0010", (short) (ZN.Xd() ^ (OY.Xd() ^ (374010022 ^ 308390029))));
        int iXd = C1633zX.Xd() ^ (190073667 ^ (-2131046464));
        short sXd = (short) (FB.Xd() ^ ((379159919 ^ 1816879389) ^ 2060639144));
        short sXd2 = (short) (FB.Xd() ^ iXd);
        int[] iArr = new int["OY^\\Z[]V`g8VjX".length()];
        QB qb = new QB("OY^\\Z[]V`g8VjX");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(promise, C1561oA.od("6730+4%", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864702079))));
        Wallet wallet = this.wallet;
        if (wallet != null) {
            try {
                wallet.enrollDigitalCard(this.reactCtx, str, new AntelopCallback() { // from class: com.davivienda.daviviendaapp.bridges.gpay.AntelopWalletModule.enrollDigitalCard.1
                    @Override // fr.antelop.sdk.AntelopCallback
                    public void onError(AntelopError antelopError) throws Throwable {
                        Intrinsics.checkNotNullParameter(antelopError, C1561oA.Xd("iwxvz", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (1932318127 ^ (-751017816))))));
                        AntelopBridgeUtils antelopBridgeUtils = AntelopBridgeUtils.INSTANCE;
                        Object[] objArr = {antelopError};
                        Method method = Class.forName(Wg.vd("7DC\u000542H<RFCM<:\b?E[O]IFPGMN^_\u0016K\\TX\\[j\u001eXbTu+?ml^fjtGxpdhgX\u0001vz\u0003", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831081230))))).getMethod(hg.Vd("v\u0003\bw}\u007f\u007fS\u007f~z|]wTkxwdif", (short) (FB.Xd() ^ ((911242964 ^ 256771664) ^ 958295652)), (short) (FB.Xd() ^ (FB.Xd() ^ 1609521153))), Class.forName(Qg.kd("=H\u00035AF6<>>z?/5v\t5:*022\u000621-/", (short) (OY.Xd() ^ ((1602157541 ^ 1379479670) ^ 222795852)), (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134241609))))));
                        try {
                            method.setAccessible(true);
                            promise.reject(C1561oA.ud("\u001c(-7\u001c$'#\u001f\u001e0\u0015! \u001c\u001e", (short) (C1580rY.Xd() ^ ((844186776 ^ 600451442) ^ (-295389899)))), (String) method.invoke(antelopBridgeUtils, objArr));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }

                    @Override // fr.antelop.sdk.AntelopCallback
                    public void onSuccess() {
                        promise.resolve(true);
                    }
                });
                return;
            } catch (WalletValidationException e2) {
                promise.reject(strQd, e2);
                return;
            } catch (Throwable th) {
                promise.reject(strQd, th);
                return;
            }
        }
        short sXd3 = (short) (C1633zX.Xd() ^ (OY.Xd() ^ (475855979 ^ (-410487653))));
        int[] iArr2 = new int["Welxhj{t_klfv".length()];
        QB qb2 = new QB("Welxhj{t_klfv");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
            i3++;
        }
        promise.reject(new String(iArr2, 0, i3), Wg.Zd("\u001c\u001e\u001d&39hOUyRh^ɣ&`p\u0005ot\u001a^f{K1q\u001b\u0004'\u001fV\u001cn%9ME?Uj&@RFWk<Sx\\j|\u0001:TO\b%3\u0019\u001f\\", (short) (C1607wl.Xd() ^ (1012582401 ^ 1012573074)), (short) (C1607wl.Xd() ^ ((1842018375 ^ 513254496) ^ 1935491174))));
    }

    @ReactMethod
    public final void getDigitalCards(Promise promise) {
        String label;
        CardDisplay display;
        CardDisplay display2;
        Intrinsics.checkNotNullParameter(promise, C1561oA.Xd("lomlitg", (short) (OY.Xd() ^ (FB.Xd() ^ 1609525636))));
        Wallet wallet = this.wallet;
        if (wallet == null) {
            promise.reject(Wg.vd("\u0006\u0012\u001b%\u0017\u0017*!\u000e\u0018\u001b\u0013%", (short) (FB.Xd() ^ (578984434 ^ 578988863))), Qg.kd("3<FE=KuCCr7DD߲m0;9/,<(*&q", (short) (C1607wl.Xd() ^ ((487558326 ^ 538456886) ^ 1024972673)), (short) (C1607wl.Xd() ^ (1101177950 ^ 1101196016))));
            return;
        }
        try {
            Map<String, DigitalCard> mapDigitalCards = wallet.digitalCards(true);
            Intrinsics.checkNotNullExpressionValue(mapDigitalCards, hg.Vd("y}z{\u0006q{Qn~o}1654.", (short) (FB.Xd() ^ ((1810487738 ^ 182574312) ^ 1627923404)), (short) (FB.Xd() ^ (1122023806 ^ 1122038547))));
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (DigitalCard digitalCard : mapDigitalCards.values()) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString(C1561oA.ud("@:", (short) (Od.Xd() ^ ((2026557782 ^ 621918981) ^ (-1574654974)))), digitalCard.getId());
                String strYd = C1561oA.yd("3>;>+9\u0007&D7\u00195", (short) (C1499aX.Xd() ^ ((699955262 ^ 1906256616) ^ (-1478960228))));
                CardInfo cardInfo = digitalCard.getCardInfo();
                String description = null;
                writableMapCreateMap.putString(strYd, cardInfo != null ? cardInfo.getIssuerCardId() : null);
                String strYd2 = C1561oA.Yd("\u001b!,*'\u001d6\f -&", (short) (C1499aX.Xd() ^ (711907942 ^ (-711897736))));
                CardInfo cardInfo2 = digitalCard.getCardInfo();
                if (cardInfo2 == null || (display2 = cardInfo2.getDisplay()) == null || (label = display2.getLabel()) == null) {
                    CardInfo cardInfo3 = digitalCard.getCardInfo();
                    if (cardInfo3 != null && (display = cardInfo3.getDisplay()) != null) {
                        description = display.getDescription();
                    }
                    label = description == null ? "" : description;
                }
                writableMapCreateMap.putString(strYd2, label);
                writableMapCreateMap.putString(Xg.qd("\u001b\u001d\u000b\u001f\u0011", (short) (Od.Xd() ^ ((1751482618 ^ 1179396961) ^ (-774496183))), (short) (Od.Xd() ^ ((1862481714 ^ 1668787974) ^ (-208988137)))), String.valueOf(digitalCard.getStatus()));
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
            promise.resolve(writableArrayCreateArray);
        } catch (Exception e2) {
            promise.reject(Jg.Wd("P<%\u0007O,\u0010hX\u001d\reE'", (short) (ZN.Xd() ^ ((1423389889 ^ 1399123873) ^ 129226884)), (short) (ZN.Xd() ^ ((350275620 ^ 52093151) ^ 402261899))), e2);
        }
    }

    @ReactMethod
    public final void getGooglePayStatus(String str, final Promise promise) throws Throwable {
        int iXd = C1633zX.Xd() ^ (-1951469324);
        int iXd2 = FB.Xd() ^ (1109661822 ^ 499850730);
        short sXd = (short) (OY.Xd() ^ iXd);
        short sXd2 = (short) (OY.Xd() ^ iXd2);
        int[] iArr = new int["\u0005hSJHO\u0011X)Rw5m".length()];
        QB qb = new QB("\u0005hSJHO\u0011X)Rw5m");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(promise, C1626yg.Ud("Z\r(aRD)", (short) (Od.Xd() ^ ((1395309024 ^ 737782170) ^ (-2027102985))), (short) (Od.Xd() ^ (C1607wl.Xd() ^ (44952559 ^ (-1827258196))))));
        Wallet wallet = this.wallet;
        if (wallet == null) {
            promise.reject(Ig.wd("!~V:(c\b8JRP/r", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (675070809 ^ (-1182325050))))), EO.Od("_\u001aUz%in7_A\u000b1]ݖ3\u0012[^~#K\u0003UX{", (short) (OY.Xd() ^ (21220377 ^ 21231207))));
            return;
        }
        try {
            DigitalCard digitalCard = wallet.getDigitalCard(str);
            if (digitalCard == null) {
                throw new IllegalStateException(C1593ug.zd("=E=3", (short) (C1633zX.Xd() ^ (1807101714 ^ (-1807090004))), (short) (C1633zX.Xd() ^ (1854605192 ^ (-1854607842)))).toString());
            }
            try {
                digitalCard.getGooglePayService().getStatus(this.reactCtx, new OperationCallback<DigitalCardServiceStatus>() { // from class: com.davivienda.daviviendaapp.bridges.gpay.AntelopWalletModule.getGooglePayStatus.1
                    @Override // fr.antelop.sdk.util.OperationCallback
                    public void onError(AntelopError antelopError) throws Throwable {
                        Intrinsics.checkNotNullParameter(antelopError, C1561oA.yd("\f\u001a\u001b\u0019\u001d", (short) (FB.Xd() ^ ((1282198857 ^ 434589675) ^ 1435209713))));
                        AntelopBridgeUtils antelopBridgeUtils = AntelopBridgeUtils.INSTANCE;
                        Class<?> cls = Class.forName(C1561oA.Yd("+87x0.D8F:7A86\u0004;9OCQEBLCABRS\u0012GXPLPO^\u001aT^Pi\u001f3ahZbfh;ld`dcTtjnv", (short) (ZN.Xd() ^ (596728350 ^ 596717815))));
                        Class<?>[] clsArr = new Class[1];
                        int iXd3 = ZN.Xd() ^ (1914307963 ^ 1099963445);
                        int iXd4 = ZN.Xd() ^ (100020361 ^ 914098608);
                        short sXd3 = (short) (C1607wl.Xd() ^ iXd3);
                        short sXd4 = (short) (C1607wl.Xd() ^ iXd4);
                        int[] iArr2 = new int["x\u0006Bv\u0005\f}\u0006\n\fJ\u0011\u0003\u000bNb\u0011\u0018\n\u0012\u0016\u0018m\u001c\u001d\u001b\u001f".length()];
                        QB qb2 = new QB("x\u0006Bv\u0005\f}\u0006\n\fJ\u0011\u0003\u000bNb\u0011\u0018\n\u0012\u0016\u0018m\u001c\u001d\u001b\u001f");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) + sXd4);
                            i3++;
                        }
                        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                        Object[] objArr = {antelopError};
                        Method method = cls.getMethod(Jg.Wd("UPE&\u0018\n{B`P7*z\u0004W]\\H#\u001a\u000b", (short) (Od.Xd() ^ (ZN.Xd() ^ (-864685083))), (short) (Od.Xd() ^ (C1633zX.Xd() ^ (1516243309 ^ 774977213)))), clsArr);
                        try {
                            method.setAccessible(true);
                            String str2 = (String) method.invoke(antelopBridgeUtils, objArr);
                            Promise promise2 = promise;
                            short sXd5 = (short) (C1633zX.Xd() ^ ((582316699 ^ 623965060) ^ (-126216724)));
                            short sXd6 = (short) (C1633zX.Xd() ^ (707920569 ^ (-707944614)));
                            int[] iArr3 = new int["\u00185xX][;Ni\u0004\u001fV\u0013Q\u0013%F\u001b|O(".length()];
                            QB qb3 = new QB("\u00185xX][;Ni\u0004\u001fV\u0013Q\u0013%F\u001b|O(");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd6) + sXd5)));
                                i4++;
                            }
                            promise2.reject(new String(iArr3, 0, i4), str2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }

                    /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
                    public void onSuccess2(DigitalCardServiceStatus digitalCardServiceStatus) {
                        int iXd3 = Od.Xd() ^ (1471184381 ^ 273530842);
                        int iXd4 = Od.Xd() ^ (497683937 ^ 1515687652);
                        short sXd3 = (short) (OY.Xd() ^ iXd3);
                        short sXd4 = (short) (OY.Xd() ^ iXd4);
                        int[] iArr2 = new int["C".length()];
                        QB qb2 = new QB("C");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                            i3++;
                        }
                        Intrinsics.checkNotNullParameter(digitalCardServiceStatus, new String(iArr2, 0, i3));
                        promise.resolve(digitalCardServiceStatus.toString());
                    }

                    @Override // fr.antelop.sdk.util.OperationCallback
                    public /* bridge */ /* synthetic */ void onSuccess(DigitalCardServiceStatus digitalCardServiceStatus) throws Throwable {
                        Object[] objArr = {digitalCardServiceStatus};
                        Method method = Class.forName(Ig.wd("\u0004bnW}5\u001e\n?rh{BM\u0002Z.=xMxMtb{\u0018I0gnR*\u0011nb3B_gj\u0007$c\u000b;\u001c;pc#T2FW+d\u0005_=\u0007\foj~5_M\t\u001b JY\bSc23k\u0011,s6", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ 1134263944)))).getMethod(C1561oA.Qd("CA%F323@?", (short) (C1633zX.Xd() ^ ((881562879 ^ 413004449) ^ (-739647519)))), Class.forName(EO.Od("\u001erB\u001cr%a\u007fN#^\u0002BC\u000e\"|d.Ai@\u0005\u0007\u0014q\u001d`o?\u001d\b\\QhD9\u000f#\u001f0[\u001e\u0002}W}\u0015V~$", (short) (OY.Xd() ^ ((113292412 ^ 133921749) ^ 20690428)))));
                        try {
                            method.setAccessible(true);
                            method.invoke(this, objArr);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                });
            } catch (WalletValidationException e2) {
                promise.reject(C1561oA.Qd("my~\towg~\u0004vvbttq|amlhj", (short) (OY.Xd() ^ (592745881 ^ 592765987))), e2);
            }
        } catch (Throwable unused) {
            promise.reject(C1561oA.Kd("SahtYXj]yikq}eovpg", (short) (C1580rY.Xd() ^ ((1437110974 ^ 1223150333) ^ (-491734054)))), C1561oA.od("\u001c<k0B2;;+d\b,)*4 *\u007f\u001d-\u001eX", (short) (Od.Xd() ^ (970336737 ^ (-970340199)))) + str);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        int iXd = ZN.Xd() ^ 864693287;
        return Wg.Zd("\u0018?7Lnx\u0001\u001b\u000b*EC`i\u0006", (short) (C1607wl.Xd() ^ (1386446349 ^ 1386435562)), (short) (C1607wl.Xd() ^ iXd));
    }

    public final Wallet getWallet$app_release() {
        return this.wallet;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        try {
            WalletManager walletManager = this.wm;
            if (walletManager != null) {
                walletManager.disconnect();
            }
        } catch (Throwable unused) {
        }
        try {
            WalletManager walletManager2 = this.wm;
            if (walletManager2 != null) {
                walletManager2.clean();
            }
        } catch (Throwable unused2) {
        }
        try {
            WalletProvisioning walletProvisioning = this.provisioning;
            if (walletProvisioning != null) {
                walletProvisioning.clean();
            }
        } catch (Throwable unused3) {
        }
        this.wm = null;
        this.wallet = null;
        this.provisioning = null;
        this.isProvisioningInit = false;
        super.invalidate();
    }

    @ReactMethod
    public final void isCardInGooglePay(String str, final Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(str, C1561oA.Xd("6<;>J8D\u001c;M@&B", (short) (FB.Xd() ^ (OY.Xd() ^ 69947704))));
        short sXd = (short) (Od.Xd() ^ (C1607wl.Xd() ^ (1778894189 ^ (-71548761))));
        int[] iArr = new int["'*$#$/\u001e".length()];
        QB qb = new QB("'*$#$/\u001e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(promise, new String(iArr, 0, i2));
        Wallet wallet = this.wallet;
        if (wallet == null) {
            promise.reject(Qg.kd("\u001a&+5##2)\u0012\u001c\u001b\u0013!", (short) (Od.Xd() ^ ((1733745322 ^ 189496418) ^ (-1813888643))), (short) (Od.Xd() ^ (Od.Xd() ^ (-1207822350)))), hg.Vd("\b\u0011\u001b\u001a\u0012 J\u0018\u0018G\f\u0019\u0019ʣB\u0005\u0010\u000e\u0004\u0001\u0011|~zF", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849958859)), (short) (OY.Xd() ^ (1527897673 ^ 1527880939))));
            return;
        }
        try {
            DigitalCard digitalCard = wallet.getDigitalCard(str);
            if (digitalCard == null) {
                throw new IllegalStateException(C1561oA.yd("\u007f\b{q", (short) (C1580rY.Xd() ^ (1044206258 ^ (-1044204507)))).toString());
            }
            try {
                digitalCard.getGooglePayService().isCardInGooglePay(this.reactCtx, new OperationCallback<Boolean>() { // from class: com.davivienda.daviviendaapp.bridges.gpay.AntelopWalletModule.isCardInGooglePay.1
                    @Override // fr.antelop.sdk.util.OperationCallback
                    public void onError(AntelopError antelopError) throws Throwable {
                        Intrinsics.checkNotNullParameter(antelopError, C1593ug.zd("=KLJN", (short) (ZN.Xd() ^ ((1225213248 ^ 907527800) ^ 2131798429)), (short) (ZN.Xd() ^ (1951628807 ^ 1951621600))));
                        AntelopBridgeUtils antelopBridgeUtils = AntelopBridgeUtils.INSTANCE;
                        Class<?> cls = Class.forName(C1561oA.od("\b\u0013\u0010O\u0005\u0001\u0015\u0007\u0013\u0005\u007f\b|xDyu\n{\byt|qmlzy6ixnhjgt.fn^u);gl\\bdd5dZTVSB`TV\\", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849973719)))));
                        Class<?>[] clsArr = new Class[1];
                        short sXd2 = (short) (OY.Xd() ^ (1161969023 ^ 1161978569));
                        int[] iArr2 = new int["\u0003\u0010L\u0001\u000f\u0016\b\u0010\u0014\u0016T\u001b\r\u0015Xl\u001b\"\u0014\u001c \"w&'%)".length()];
                        QB qb2 = new QB("\u0003\u0010L\u0001\u000f\u0016\b\u0010\u0014\u0016T\u001b\r\u0015Xl\u001b\"\u0014\u001c \"w&'%)");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                            i3++;
                        }
                        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                        Object[] objArr = {antelopError};
                        Method method = cls.getMethod(Wg.Zd("e`\u001dy9*_\"Ekf\u0010o/\u000bKM;_S\b", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207808468))), (short) (C1580rY.Xd() ^ ((1758581122 ^ 836574309) ^ (-1494008030)))), clsArr);
                        try {
                            method.setAccessible(true);
                            String str2 = (String) method.invoke(antelopBridgeUtils, objArr);
                            Promise promise2 = promise;
                            short sXd3 = (short) (C1633zX.Xd() ^ ((1754213426 ^ 556601257) ^ (-1235379202)));
                            int[] iArr3 = new int["7ELXAK=V]RTBVXWdKYZX\\".length()];
                            QB qb3 = new QB("7ELXAK=V]RTBVXWdKYZX\\");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i4));
                                i4++;
                            }
                            promise2.reject(new String(iArr3, 0, i4), str2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }

                    @Override // fr.antelop.sdk.util.OperationCallback
                    public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) throws Throwable {
                        boolean zBooleanValue = bool.booleanValue();
                        Class<?> cls = Class.forName(Wg.vd("(34s%!9+3%$,\u001d\u0019h\u001e6J@L:5A6.-?>v*=3IKLY\u000fGSCV\n LM=GIeKXb]Ug?\\PdZN\fT]GdxiImIpkbjbHXs\u001dE", (short) (C1607wl.Xd() ^ ((1205955539 ^ 682134126) ^ 1867101781))));
                        Class<?>[] clsArr = {Boolean.TYPE};
                        Object[] objArr = {Boolean.valueOf(zBooleanValue)};
                        Method method = cls.getMethod(Qg.kd("&$\b)\u0016\u0015\u0016#\"", (short) (C1580rY.Xd() ^ (1270434461 ^ (-1270420785))), (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ 1134244084))), clsArr);
                        try {
                            method.setAccessible(true);
                            method.invoke(this, objArr);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }

                    public void onSuccess(boolean z2) {
                        promise.resolve(Boolean.valueOf(z2));
                    }
                });
            } catch (WalletValidationException e2) {
                short sXd2 = (short) (ZN.Xd() ^ ((273956671 ^ 100623930) ^ 363542057));
                int[] iArr2 = new int["@LQ[BJ:QVII5GGDO4@?;=".length()];
                QB qb2 = new QB("@LQ[BJ:QVII5GGDO4@?;=");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                promise.reject(new String(iArr2, 0, i3), e2);
            }
        } catch (Throwable unused) {
            promise.reject(Xg.qd("r\u0001\b\u0014xw\n|\u0019\t\u000b\u0011\u001d\u0005\u000f\u0016\u0010\u0007", (short) (C1633zX.Xd() ^ (623140665 ^ (-623132085))), (short) (C1633zX.Xd() ^ (906467986 ^ (-906474585)))), C1561oA.Yd("u\u0018I\u0010$\u0016!#\u0015Pu\u001c\u001b\u001e*\u0018${\u001b- \\", (short) (OY.Xd() ^ ((1278551535 ^ 1917635854) ^ 1048159991))) + str);
        }
    }

    @ReactMethod
    public final void launchProvisioningAuto(String str, String str2, String str3, String str4, Promise promise) {
        String strWd = Jg.Wd("L|dmI10Vve\u000176L5\u0010\u0010z=]L", (short) (OY.Xd() ^ (28210806 ^ 28191173)), (short) (OY.Xd() ^ (C1633zX.Xd() ^ (448224233 ^ (-1860578813)))));
        Intrinsics.checkNotNullParameter(str3, ZO.xd("/\u000f\u000fs|gSV\u001af#=o}3)6", (short) (C1607wl.Xd() ^ (225717900 ^ 225708824)), (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (2064529854 ^ 1216621008)))));
        Intrinsics.checkNotNullParameter(promise, C1626yg.Ud("Y\u001c\u0012o\u0013lU", (short) (ZN.Xd() ^ ((364020783 ^ 1376485826) ^ 1203313761)), (short) (ZN.Xd() ^ ((1692029516 ^ 1560607465) ^ 970905018))));
        WalletProvisioning walletProvisioning = this.provisioning;
        if (walletProvisioning == null) {
            promise.reject(Ig.wd(",r%N&jI't\u0006\u0007,\bnK(e\u0017", (short) (C1633zX.Xd() ^ (66494908 ^ (-66513307)))), EO.Od("=1<k?mO>s\u0013\u001a-M\u0014\u0007\u0013*\u0017k\u0010M\u000bytM\u001a|U", (short) (Od.Xd() ^ ((824711226 ^ 2019472838) ^ (-1232511149)))));
            return;
        }
        try {
            if (StringsKt.isBlank(str3)) {
                promise.reject(strWd, C1561oA.Qd("_P^]QUMX4UQGIKC&@zL>IL;G=7A", (short) (C1607wl.Xd() ^ ((1187751292 ^ 1467166033) ^ 297315001))));
                return;
            }
            String str5 = str4;
            if (str5 != null && !StringsKt.isBlank(str5)) {
                AntelopBridgeUtils antelopBridgeUtils = AntelopBridgeUtils.INSTANCE;
                Class<?> cls = Class.forName(C1593ug.zd("p}|>us\n}\f\u007f|\u0007}{I\u0001~\u0015\t\u0017\u000b\b\u0012\t\u0007\b\u0018\u0019W\r\u001e\u0016\u0012\u0016\u0015$_\u001a$\u0016/dx'. (,.\u00012*&*)\u001a:04<", (short) (FB.Xd() ^ (439110464 ^ 439102179)), (short) (FB.Xd() ^ ((1587627981 ^ 943344979) ^ 1721438914))));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (ZN.Xd() ^ (106899089 ^ 106891500));
                int[] iArr = new int["\u000e\u0004\u0018\u0002M\u000b~\u000b\u0003Hl\r\n\u007f\u0004{".length()];
                QB qb = new QB("\u000e\u0004\u0018\u0002M\u000b~\u000b\u0003Hl\r\n\u007f\u0004{");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                Object[] objArr = {str4};
                Method method = cls.getMethod(C1561oA.Kd("$/\u0013\u001f+)%\u0007syx", (short) (FB.Xd() ^ (1113125249 ^ 1113110754))), clsArr);
                try {
                    method.setAccessible(true);
                    if (!((Boolean) method.invoke(antelopBridgeUtils, objArr)).booleanValue()) {
                        promise.reject(strWd, Wg.Zd("I+\u001c\u0005U\u001fve=\u0013F3\u0015׃^E\\Qk]T'\u0012\u0001X7", (short) (C1580rY.Xd() ^ ((1881850600 ^ 685943719) ^ (-1489517944))), (short) (C1580rY.Xd() ^ ((336635256 ^ 1249608787) ^ (-1584085304)))));
                        return;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            walletProvisioning.launch(str, str2, str3, str4);
            promise.resolve(true);
        } catch (WalletValidationException e3) {
            promise.reject(strWd, e3);
        } catch (Throwable th) {
            promise.reject(strWd, th);
        }
    }

    @ReactMethod
    public final void launchProvisioningWithActivationCode(String str, String str2, Promise promise) {
        String strXd = C1561oA.Xd("Zho{mpnv\u0001ndysio\bn|}{\u007f", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951470798)));
        short sXd = (short) (FB.Xd() ^ ((863812274 ^ 1865429010) ^ 1548521248));
        int[] iArr = new int["WZlbhTh^]]3`NP".length()];
        QB qb = new QB("WZlbhTh^]]3`NP");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        int iXd = ZN.Xd() ^ 864689950;
        int iXd2 = OY.Xd() ^ (108956176 ^ 39164547);
        short sXd2 = (short) (OY.Xd() ^ iXd);
        short sXd3 = (short) (OY.Xd() ^ iXd2);
        int[] iArr2 = new int["LMIFAJ;".length()];
        QB qb2 = new QB("LMIFAJ;");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        Intrinsics.checkNotNullParameter(promise, new String(iArr2, 0, i3));
        WalletProvisioning walletProvisioning = this.provisioning;
        if (walletProvisioning != null) {
            try {
                Class<?> cls = Class.forName(C1561oA.yd("t\u0001u\u0003\u0007\u007fyB\u0001~rt=Pn\u007fh85", (short) (C1580rY.Xd() ^ (1901142449 ^ (-1901141525)))));
                Class<?>[] clsArr = new Class[(144333925 ^ 280084326) ^ 405529345];
                clsArr[0] = Class.forName(C1561oA.Yd("!\u0019/\u001bh(\u001e,&m\u001465-3-", (short) (Od.Xd() ^ ((360342253 ^ 498797823) ^ (-146875390)))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr = new Object[56548792 ^ 56548794];
                objArr[0] = str;
                objArr[1] = 0;
                Method declaredMethod = cls.getDeclaredMethod(Xg.qd("\u001e \u001f,\"$", (short) (FB.Xd() ^ (766891684 ^ 766889961)), (short) (FB.Xd() ^ ((932688829 ^ 1999803481) ^ 1084573249))), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    walletProvisioning.launch((byte[]) declaredMethod.invoke(null, objArr), str2);
                    promise.resolve(true);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (WalletValidationException e3) {
                promise.reject(strXd, e3);
                return;
            } catch (Throwable th) {
                promise.reject(strXd, th);
                return;
            }
        }
        short sXd4 = (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831078886)));
        short sXd5 = (short) (FB.Xd() ^ ((325639453 ^ 1986244291) ^ 1695239057));
        int[] iArr3 = new int["Vbgqab^dlZZ^hZLGI]".length()];
        QB qb3 = new QB("Vbgqab^dlZZ^hZLGI]");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
            i4++;
        }
        String str3 = new String(iArr3, 0, i4);
        short sXd6 = (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134251257));
        int[] iArr4 = new int["\u000f0,2$-\"'%\u001f#\u001bR  O\u0018\u001c\u0016\u000f\u0014\u000b\u0015\u0011!\u0007\t\u0013".length()];
        QB qb4 = new QB("\u000f0,2$-\"'%\u001f#\u001bR  O\u0018\u001c\u0016\u000f\u0014\u000b\u0015\u0011!\u0007\t\u0013");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK(sXd6 + i5 + xuXd4.CK(iKK4));
            i5++;
        }
        promise.reject(str3, new String(iArr4, 0, i5));
    }

    @ReactMethod
    public final void launchProvisioningWithIssuerId(String str, String str2, String str3, Promise promise) {
        int iXd = OY.Xd() ^ (-69952786);
        String strWd = Jg.Wd("rTAT,e7\u0013D\u00184\u001dl\nw6pT\r`x", (short) (C1633zX.Xd() ^ ((1615116092 ^ 1249371513) ^ (-708014807))), (short) (C1633zX.Xd() ^ iXd));
        int iXd2 = Od.Xd() ^ 1207821418;
        String strXd = ZO.xd("X[\u001bH\u0018:\u0001>g\u00173(U\u007f8\u0013\u000e,\nRo", (short) (OY.Xd() ^ (230493203 ^ 230519038)), (short) (OY.Xd() ^ iXd2));
        Intrinsics.checkNotNullParameter(str, strXd);
        int iXd3 = Od.Xd() ^ (141217197 ^ 1335326766);
        String strUd = C1626yg.Ud("H 5JI zV\u0013\u0005UU\u0010\u0002-\u00105\u001d\u001ec}\u000e\u0019", (short) (FB.Xd() ^ ((586218395 ^ 1425904759) ^ 1980590757)), (short) (FB.Xd() ^ iXd3));
        Intrinsics.checkNotNullParameter(str2, strUd);
        Intrinsics.checkNotNullParameter(promise, Ig.wd("E\u001afKL\u0001\u001d", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (1913033165 ^ (-106402071))))));
        WalletProvisioning walletProvisioning = this.provisioning;
        if (walletProvisioning == null) {
            promise.reject(EO.Od("\u0003E/\u0018S\u000b\u001aZ\u0007g`I\u0004z\fo(M", (short) (Od.Xd() ^ (ZN.Xd() ^ (22739087 ^ (-852551251))))), C1561oA.Qd("Uvrxjshmkeia\u0019ff\u0016^b\\UZQ[WgMOY", (short) (Od.Xd() ^ (ZN.Xd() ^ (-864696739)))));
            return;
        }
        try {
            Class<?> cls = Class.forName(C1593ug.zd("FSR\u0014KI_SaUR\\SQ\u001fVTj^l`]g^\\]mn-bskgkjy5oyk\u0005:N|\u0004u}\u0002\u0004kv\u0003\u0004}\u000eg\u000b\u0001\u0013\u000b\u0005", (short) (FB.Xd() ^ (1138356450 ^ 1138336665)), (short) (FB.Xd() ^ ((1656842680 ^ 1091676208) ^ 600897736))));
            Class<?>[] clsArr = new Class[1134530616 ^ 1134530618];
            clsArr[0] = Class.forName(C1561oA.od("\u0003x\rvB\u007fs\u007fw=a\u0002~txp", (short) (C1499aX.Xd() ^ ((436141362 ^ 1638332432) ^ (-2019043819)))));
            clsArr[1] = Class.forName(C1561oA.Kd("qi\u007fk9xn|v>d\u0007\u0006}\u0004}", (short) (OY.Xd() ^ (284625484 ^ 284651330))));
            Object[] objArr = new Object[(1200850711 ^ 193883476) ^ 1277028929];
            objArr[0] = str;
            objArr[1] = strXd;
            Method declaredMethod = cls.getDeclaredMethod(Wg.Zd("\u001eW{@_\u0011\u001cCi;\u0007\u001b_\u0019@\u0001", (short) (C1607wl.Xd() ^ ((338805206 ^ 1559134086) ^ 1222634697)), (short) (C1607wl.Xd() ^ (1380596731 ^ 1380592491))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(this, objArr);
                Class<?> cls2 = Class.forName(C1561oA.Xd("'43t,*@4B63=42\u007f75K?MA>H?=>NO\u000eCTLHLKZ\u0016PZLe\u001b/]dV^bdLWcd^nHkaske", (short) (C1633zX.Xd() ^ ((285329763 ^ 2011572750) ^ (-1726456495)))));
                Class<?>[] clsArr2 = new Class[(995361959 ^ 1944431426) ^ 1219604455];
                clsArr2[0] = Class.forName(Wg.vd("H>V@\bE=I=\u0003+KD:B:", (short) (Od.Xd() ^ (1555888449 ^ (-1555862218)))));
                clsArr2[1] = Class.forName(Qg.kd("\u0013\t\u001d\u0007R\u0010\u0004\u0010\bMq\u0012\u000f\u0005\t\u0001", (short) (OY.Xd() ^ (350984768 ^ 351002440)), (short) (OY.Xd() ^ ((913049144 ^ 1335983251) ^ 2043493201))));
                Object[] objArr2 = new Object[(500301958 ^ 528402139) ^ 44877407];
                objArr2[0] = str2;
                objArr2[1] = strUd;
                Method declaredMethod2 = cls2.getDeclaredMethod(hg.Vd("qqnymmI<9SuVirnu", (short) (FB.Xd() ^ (1462827942 ^ 1462815594)), (short) (FB.Xd() ^ (132918584 ^ 132932847))), clsArr2);
                try {
                    declaredMethod2.setAccessible(true);
                    walletProvisioning.launch(bArr, (byte[]) declaredMethod2.invoke(this, objArr2), str3);
                    promise.resolve(true);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (WalletValidationException e4) {
            promise.reject(strWd, e4);
        } catch (Throwable th) {
            promise.reject(strWd, th);
        }
    }

    public final void onAsyncError$app_release(AsyncRequestType asyncRequestType, AntelopError antelopError) throws Throwable {
        Intrinsics.checkNotNullParameter(asyncRequestType, C1561oA.ud("5'2", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609508837)))));
        Intrinsics.checkNotNullParameter(antelopError, C1561oA.yd("O]Z", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951481368))));
        Pair[] pairArr = new Pair[Od.Xd() ^ 1207800918];
        pairArr[0] = TuplesKt.to(C1561oA.Yd("C7DI:IK,RJ@", (short) (C1607wl.Xd() ^ ((1225369322 ^ 745263420) ^ 1700921717))), asyncRequestType.name());
        pairArr[1] = TuplesKt.to(Xg.qd("boeg", (short) (ZN.Xd() ^ (Od.Xd() ^ 1207818747)), (short) (ZN.Xd() ^ ((1322966776 ^ 191995103) ^ 1168835345))), antelopError.getCode().toString());
        String message = antelopError.getMessage();
        if (message == null) {
            message = "";
        }
        pairArr[FB.Xd() ^ (1746570029 ^ 938861596)] = TuplesKt.to(Jg.Wd("lv\u001b\u0015!\u0019-", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (1989658390 ^ (-829050622)))), (short) (C1633zX.Xd() ^ ((98046072 ^ 1262779040) ^ (-1318849918)))), message);
        Object[] objArr = {pairArr};
        Method declaredMethod = Class.forName(ZO.xd("\u001d:\u0013=K3Nr||\u001eU@u\u0007jVgi\u0003EsP(~\u0011T\\lD2\u0013jj82\u000fX\u000f.\u001b\u0017sU\u0017E^\u0005Z\"\u001c~\u0001GS8\u0002\",Ad", (short) (C1633zX.Xd() ^ ((501555661 ^ 1170141796) ^ (-1482420535))), (short) (C1633zX.Xd() ^ (2076256903 ^ (-2076264075))))).getDeclaredMethod(C1626yg.Ud("S\u0002_ko", (short) (Od.Xd() ^ (FB.Xd() ^ (-1609518561))), (short) (Od.Xd() ^ ((697207539 ^ 796008765) ^ (-117230013)))), Pair[].class);
        try {
            declaredMethod.setAccessible(true);
            WritableMap writableMap = (WritableMap) declaredMethod.invoke(this, objArr);
            String strWd = Ig.wd("*e\u001eH0yg!TFA\u0014eMN,\\q", (short) (C1580rY.Xd() ^ ((45151002 ^ 612278976) ^ (-651035165))));
            short sXd = (short) (ZN.Xd() ^ ((558595109 ^ 83021695) ^ 632938645));
            int[] iArr = new int["-\u0011Rn]0]g8\u000b|o54Pl?R|\u0006<oRD5|m\u001fRX@\u001fyZxL\"{\u0006h\u0001\\7ZB+\bDsu\tI)\u0012H`\u0005\u0018TQ>".length()];
            QB qb = new QB("-\u0011Rn]0]g8\u000b|o54Pl?R|\u0006<oRD5|m\u001fRX@\u001fyZxL\"{\u0006h\u0001\\7ZB+\bDsu\tI)\u0012H`\u0005\u0018TQ>");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[857330377 ^ 857330379];
            clsArr[0] = Class.forName(C1561oA.Qd("yo\u0004m9vjvn4Xxukog", (short) (C1580rY.Xd() ^ ((724175288 ^ 744493498) ^ (-122300979)))));
            clsArr[1] = Class.forName(C1593ug.zd("2?>\u007f958;9GHE\tNB?BT\u000fDUMIML\u0016@\\T`NP[U>Sc", (short) (FB.Xd() ^ ((384999448 ^ 606335030) ^ 852562724)), (short) (FB.Xd() ^ ((1314182269 ^ 1679883062) ^ 712259888))));
            Object[] objArr2 = new Object[(1662499534 ^ 1572514180) ^ 1051530056];
            objArr2[0] = strWd;
            objArr2[1] = writableMap;
            Method declaredMethod2 = cls.getDeclaredMethod(C1561oA.od(":A<F", (short) (C1580rY.Xd() ^ (527248947 ^ (-527262907)))), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void onAsyncSuccess$app_release(AsyncRequestType asyncRequestType) {
        short sXd = (short) (C1580rY.Xd() ^ (96042049 ^ (-96014297)));
        int[] iArr = new int["\"\u0016#".length()];
        QB qb = new QB("\"\u0016#");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(asyncRequestType, new String(iArr, 0, i2));
    }

    public final void onConnectionError$app_release(AntelopError antelopError) throws Throwable {
        Intrinsics.checkNotNullParameter(antelopError, Wg.Zd("V\u0017UL\u0006", (short) (Od.Xd() ^ (OY.Xd() ^ (-69946737))), (short) (Od.Xd() ^ (1380221519 ^ (-1380232277)))));
        this.wallet = null;
        Pair[] pairArr = new Pair[Od.Xd() ^ (67109710 ^ 1140692761)];
        String string = antelopError.getCode().toString();
        short sXd = (short) (Od.Xd() ^ (2003001933 ^ (-2002989002)));
        int[] iArr = new int["^kac".length()];
        QB qb = new QB("^kac");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        pairArr[0] = TuplesKt.to(new String(iArr, 0, i2), string);
        String message = antelopError.getMessage();
        if (message == null) {
            message = "";
        }
        pairArr[1] = TuplesKt.to(Wg.vd("XO\\[PUR", (short) (C1607wl.Xd() ^ ((2140958461 ^ 968951524) ^ 1180531543))), message);
        short sXd2 = (short) (ZN.Xd() ^ (ZN.Xd() ^ 864695109));
        short sXd3 = (short) (ZN.Xd() ^ ((798515072 ^ 1609462743) ^ 1886794759));
        int[] iArr2 = new int["%0-l\"\u001e2$0\"\u001d%\u001a\u0016a\u0017\u0013'\u0019%\u0017\u0012\u001a\u000f\u000b\n\u0018\u0017S\u0007\u0016\f\u0006\b\u0005\u0012K\u0004\f{\u0013FX\u0005\ny\u007f\u0002\u0002gpzyq\u007fWxl|rj".length()];
        QB qb2 = new QB("%0-l\"\u001e2$0\"\u001d%\u001a\u0016a\u0017\u0013'\u0019%\u0017\u0012\u001a\u000f\u000b\n\u0018\u0017S\u0007\u0016\f\u0006\b\u0005\u0012K\u0004\f{\u0013FX\u0005\ny\u007f\u0002\u0002gpzyq\u007fWxl|rj");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        Object[] objArr = {pairArr};
        Method declaredMethod = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(hg.Vd("\u0018\u000b\u0019v\r", (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (-1951491670))), (short) (C1607wl.Xd() ^ (87861439 ^ 87852316))), Pair[].class);
        try {
            declaredMethod.setAccessible(true);
            WritableMap writableMap = (WritableMap) declaredMethod.invoke(this, objArr);
            String strUd = C1561oA.ud("v\u0003\b\u0012\t}\u000fq|zyol|pus\u0004htsoq", (short) (C1633zX.Xd() ^ ((1892552249 ^ 1779061813) ^ (-449063705))));
            short sXd4 = (short) (C1607wl.Xd() ^ (1912983838 ^ 1912973269));
            int[] iArr3 = new int["@KL\fEAYK[MLTMI\u0019N.B8D:5A665GF\u0007:MCacdq/gsc~2Ht}mwy]CPZ]Ug?dXlb^".length()];
            QB qb3 = new QB("@KL\fEAYK[MLTMI\u0019N.B8D:5A665GF\u0007:MCacdq/gsc~2Ht}mwy]CPZ]Ug?dXlb^");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
                i4++;
            }
            Class<?> cls = Class.forName(new String(iArr3, 0, i4));
            Class<?>[] clsArr = new Class[(928948694 ^ 1160398265) ^ 1920263277];
            clsArr[0] = Class.forName(C1561oA.Yd("nf|h6ukys;a\u0004\u0003z\u0001z", (short) (OY.Xd() ^ ((1507866254 ^ 1502986027) ^ 7725763))));
            clsArr[1] = Class.forName(Xg.qd("0=<}73697EFC\u0007L@=@R\rBSKGKJ\u0014>ZR^LNYS<Qa", (short) (C1580rY.Xd() ^ ((1194869902 ^ 870592171) ^ (-1960594064))), (short) (C1580rY.Xd() ^ (1739693534 ^ (-1739716242)))));
            Object[] objArr2 = new Object[932892857 ^ 932892859];
            objArr2[0] = strUd;
            objArr2[1] = writableMap;
            Method declaredMethod2 = cls.getDeclaredMethod(Jg.Wd("\u000f\u007fJ)", (short) (C1499aX.Xd() ^ (1785563075 ^ (-1785575717))), (short) (C1499aX.Xd() ^ ((1783153011 ^ 817870003) ^ (-1526151436)))), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void onConnectionSuccess$app_release(Wallet wallet) throws Throwable {
        Intrinsics.checkNotNullParameter(wallet, ZO.xd("o\f_v14W(%", (short) (OY.Xd() ^ (1638804290 ^ 1638812936)), (short) (OY.Xd() ^ (1308866084 ^ 1308862439))));
        this.wallet = wallet;
        Pair[] pairArr = new Pair[1];
        int iXd = ZN.Xd() ^ (1625567151 ^ 1399725037);
        short sXd = (short) (C1607wl.Xd() ^ ((2107784309 ^ 1621505143) ^ 486806163));
        short sXd2 = (short) (C1607wl.Xd() ^ iXd);
        int[] iArr = new int["<b\\dI\u001bM\u0019".length()];
        QB qb = new QB("<b\\dI\u001bM\u0019");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        pairArr[0] = TuplesKt.to(new String(iArr, 0, i2), wallet.getWalletId());
        Object[] objArr = {pairArr};
        Method declaredMethod = Class.forName(Ig.wd("G{w\u001d:\u0012?J$w\u001d<cn+z3Z\u0005Fv*IC}u\"qI+Sc\u000f3 wG!)\b {h0C<~J\u001dg\tO_\u0018P)I fg,", (short) (Od.Xd() ^ (C1499aX.Xd() ^ (402975746 ^ 1537209869))))).getDeclaredMethod(EO.Od("\tEbi\t", (short) (C1499aX.Xd() ^ (728616091 ^ (-728609141)))), Pair[].class);
        try {
            declaredMethod.setAccessible(true);
            WritableMap writableMap = (WritableMap) declaredMethod.invoke(this, objArr);
            String strQd = C1561oA.Qd("\u0011\u001d\",#\u0018)\f\u0017\u0015\u0014\n\u0007\u0017\u0007\u0005", (short) (OY.Xd() ^ (1029986855 ^ 1029971641)));
            Class<?> cls = Class.forName(C1593ug.zd("Xed&][qesgdnec1hf|p~roypno\u007f\u0001?t\u0006}y}|\fG\u0002\f}\u0017L`\u000f\u0016\b\u0010\u0014\u0016}\t\u0015\u0016\u0010 y\u001d\u0013%\u001d\u0017", (short) (C1580rY.Xd() ^ (1286067323 ^ (-1286072970))), (short) (C1580rY.Xd() ^ ((2139124532 ^ 2136546611) ^ (-14241361)))));
            Class<?>[] clsArr = new Class[1417138904 ^ 1417138906];
            clsArr[0] = Class.forName(C1561oA.od(".$8\"m+\u001f+#h\r-* $\u001c", (short) (C1607wl.Xd() ^ ((1105296250 ^ 754036090) ^ 1829815885))));
            clsArr[1] = Class.forName(C1561oA.Kd("IVU\u0017PLORP^_\\ eYVYk&[ld`dc-WskwegrlUjz", (short) (FB.Xd() ^ (1663988462 ^ 1663971402))));
            Object[] objArr2 = new Object[(1009959428 ^ 289225342) ^ 756021368];
            objArr2[0] = strQd;
            objArr2[1] = writableMap;
            short sXd3 = (short) (C1633zX.Xd() ^ ((1073490284 ^ 1626798791) ^ (-1594552891)));
            short sXd4 = (short) (C1633zX.Xd() ^ (1884957855 ^ (-1884974784)));
            int[] iArr2 = new int["4sIk".length()];
            QB qb2 = new QB("4sIk");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd4) ^ sXd3) + xuXd2.CK(iKK2));
                i3++;
            }
            Method declaredMethod2 = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void onCredentialsRequired$app_release(CustomerCredentialsRequiredReason customerCredentialsRequiredReason, AntelopError antelopError) {
        Intrinsics.checkNotNullParameter(customerCredentialsRequiredReason, C1561oA.Xd("l`]pmm", (short) (OY.Xd() ^ (C1607wl.Xd() ^ (338448386 ^ 2053653079)))));
    }

    public final void onLocalAuthError$app_release(CustomerAuthenticationMethodType customerAuthenticationMethodType, LocalAuthenticationErrorReason localAuthenticationErrorReason, String str) throws Throwable {
        String str2 = str;
        String strVd = Wg.vd("GME;", (short) (ZN.Xd() ^ (OY.Xd() ^ 69935335)));
        Intrinsics.checkNotNullParameter(customerAuthenticationMethodType, strVd);
        String strKd = Qg.kd("\\NIZUS", (short) (Od.Xd() ^ ((2014128644 ^ 105893759) ^ (-2118316630))), (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831083065)));
        Intrinsics.checkNotNullParameter(localAuthenticationErrorReason, strKd);
        Pair[] pairArr = new Pair[752812767 ^ 752812764];
        pairArr[0] = TuplesKt.to(strVd, customerAuthenticationMethodType.name());
        pairArr[1] = TuplesKt.to(strKd, localAuthenticationErrorReason.name());
        if (str2 == null) {
            str2 = "";
        }
        short sXd = (short) (Od.Xd() ^ (C1499aX.Xd() ^ (1830338661 ^ 780400420)));
        short sXd2 = (short) (Od.Xd() ^ (1239260633 ^ (-1239284715)));
        int[] iArr = new int["H?LK8=:".length()];
        QB qb = new QB("H?LK8=:");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        pairArr[(1217938918 ^ 578080279) ^ 1793887219] = TuplesKt.to(new String(iArr, 0, i2), str2);
        Object[] objArr = {pairArr};
        Method declaredMethod = Class.forName(C1561oA.ud("Yda!VRfXdVQYNJ\u0016KG[MYKFNC?>LK\b;J@:<9F\u007f8@0Gz\r9>.466\u001c%/.&4\f-!1'\u001f", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849961994)))).getDeclaredMethod(C1561oA.yd("K@P0@", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864692734))), Pair[].class);
        try {
            declaredMethod.setAccessible(true);
            WritableMap writableMap = (WritableMap) declaredMethod.invoke(this, objArr);
            String strYd = C1561oA.Yd("\u000b\u0019 ,\u000f$$\u00191\u0018&'%)", (short) (OY.Xd() ^ ((1568406187 ^ 1817038349) ^ 825639457)));
            short sXd3 = (short) (C1580rY.Xd() ^ (1422719164 ^ (-1422713577)));
            short sXd4 = (short) (C1580rY.Xd() ^ (460318256 ^ (-460307810)));
            int[] iArr2 = new int["[hg)`^thvjgqhf4ki\u007fs\u0002ur|sqr\u0003\u0004Bw\t\u0001|\u0001\u007f\u000fJ\u0005\u000f\u0001\u001aOc\u0012\u0019\u000b\u0013\u0017\u0019\u0001\f\u0018\u0019\u0013#| \u0016( \u001a".length()];
            QB qb2 = new QB("[hg)`^thvjgqhf4ki\u007fs\u0002ur|sqr\u0003\u0004Bw\t\u0001|\u0001\u007f\u000fJ\u0005\u000f\u0001\u001aOc\u0012\u0019\u000b\u0013\u0017\u0019\u0001\f\u0018\u0019\u0013#| \u0016( \u001a");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) + sXd4);
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr2, 0, i3));
            Class<?>[] clsArr = new Class[(1085662884 ^ 670173565) ^ 1732767707];
            clsArr[0] = Class.forName(Jg.Wd("\u0001v\u001f\tF\u0004\f\u0018F\fDbSIa\u0004", (short) (OY.Xd() ^ ((1461887187 ^ 1318651738) ^ 431728096)), (short) (OY.Xd() ^ ((1279231359 ^ 1219224506) ^ 76815374))));
            short sXd5 = (short) (C1633zX.Xd() ^ (1772951370 ^ (-1772974209)));
            short sXd6 = (short) (C1633zX.Xd() ^ (1169784248 ^ (-1169772493)));
            int[] iArr3 = new int["i\rn{vZ\u0012>\u0019\u0018\u001c\u000bI\u0011&mS\t\u000f-\u0019=cp\u0018?\u001f~4!c5\u0002PKD:".length()];
            QB qb3 = new QB("i\rn{vZ\u0012>\u0019\u0018\u001c\u000bI\u0011&mS\t\u000f-\u0019=cp\u0018?\u001f~4!c5\u0002PKD:");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd6) + sXd5)));
                i4++;
            }
            clsArr[1] = Class.forName(new String(iArr3, 0, i4));
            Object[] objArr2 = new Object[813454060 ^ 813454062];
            objArr2[0] = strYd;
            objArr2[1] = writableMap;
            Method declaredMethod2 = cls.getDeclaredMethod(C1626yg.Ud("E\u001e/U", (short) (C1580rY.Xd() ^ (981740147 ^ (-981735600))), (short) (C1580rY.Xd() ^ (534134081 ^ (-534129959)))), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void onLocalAuthSuccess$app_release(CustomerAuthenticationMethodType customerAuthenticationMethodType) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849963356));
        int[] iArr = new int["(WJ%".length()];
        QB qb = new QB("(WJ%");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Intrinsics.checkNotNullParameter(customerAuthenticationMethodType, str);
        Object[] objArr = {new Pair[]{TuplesKt.to(str, customerAuthenticationMethodType.name())}};
        Method declaredMethod = Class.forName(EO.Od("b\u0019I1\u001fyj%\u000e\u0004}%jq6\n,KuKy!HBj\u00077dL\u0012nD\u0017\u0005B\u001f,IW2N[=d\u0015q=\u000bY)J\u0012&_\u001dZvM\t\u000e\u0003", (short) (Od.Xd() ^ (ZN.Xd() ^ (-864691084))))).getDeclaredMethod(C1561oA.Qd("\u0003u\u0004aw", (short) (Od.Xd() ^ ((224356751 ^ 635263814) ^ (-679611693)))), Pair[].class);
        try {
            declaredMethod.setAccessible(true);
            WritableMap writableMap = (WritableMap) declaredMethod.invoke(this, objArr);
            short sXd2 = (short) (FB.Xd() ^ (1588724623 ^ 1588752983));
            short sXd3 = (short) (FB.Xd() ^ (172391110 ^ 172375041));
            int[] iArr2 = new int["3AHT7LLAYNQ@ADST".length()];
            QB qb2 = new QB("3AHT7LLAYNQ@ADST");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                i3++;
            }
            String str2 = new String(iArr2, 0, i3);
            Class<?> cls = Class.forName(C1561oA.od("ozw7lh|nzlgod`,a]qcoa\\dYUTba\u001eQ`VPRO\\\u0016NVF]\u0011#OTDJLL2;ED<J\"C7G=5", (short) (C1607wl.Xd() ^ ((1336806187 ^ 1852208302) ^ 566786320))));
            Class<?>[] clsArr = new Class[1653053866 ^ 1653053864];
            clsArr[0] = Class.forName(C1561oA.Kd("IAWC\u0011PFTN\u0016<^]U[U", (short) (C1607wl.Xd() ^ (738130096 ^ 738112644))));
            clsArr[1] = Class.forName(Wg.Zd("oV \u001c \u0017c!iq=s\u0002B\u00018\u0006\u0011\u0016\u0006aT\u001aX\"eZ0ry2nD7j:\u0015", (short) (C1607wl.Xd() ^ (1278124771 ^ 1278125821)), (short) (C1607wl.Xd() ^ (1067849300 ^ 1067853434))));
            Object[] objArr2 = new Object[749096060 ^ 749096062];
            objArr2[0] = str2;
            objArr2[1] = writableMap;
            short sXd4 = (short) (C1580rY.Xd() ^ (1324532944 ^ (-1324536863)));
            int[] iArr3 = new int["?HEQ".length()];
            QB qb3 = new QB("?HEQ");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i4));
                i4++;
            }
            Method declaredMethod2 = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void onProvEligible$app_release(boolean z2, int i2) throws Throwable {
        Pair[] pairArr = new Pair[Od.Xd() ^ (272117215 ^ 1472575880)];
        pairArr[0] = TuplesKt.to(Wg.vd("JNPJESNQU[^,TUU^YY", (short) (ZN.Xd() ^ (831941223 ^ 831940014))), Boolean.valueOf(z2));
        pairArr[1] = TuplesKt.to(Qg.kd("451%5\"20~*/',", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134249226)), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951483752))), Integer.valueOf(i2));
        Object[] objArr = {pairArr};
        Method declaredMethod = Class.forName(hg.Vd("\f\u0017\u0014S\t\u0005\u0019\u000b\u0017\t\u0004\f\u0001|H}y\u000e\u007f\f}x\u0001uqp~}:m|rlnkx2jrby-?kp`fhhNWa`Xf>_ScYQ", (short) (OY.Xd() ^ (1089428556 ^ 1089422053)), (short) (OY.Xd() ^ ((1445910471 ^ 1854578850) ^ 950304613)))).getDeclaredMethod(C1561oA.ud("G:H&<", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609516043)))), Pair[].class);
        try {
            declaredMethod.setAccessible(true);
            WritableMap writableMap = (WritableMap) declaredMethod.invoke(this, objArr);
            String strYd = C1561oA.yd("\n\u0016\u001b%\u001d\u001e\u001a 0\u0015\u001b\u0017\u001c\u001d\u0015\u001e\u001e", (short) (Od.Xd() ^ (363188157 ^ (-363181749))));
            Class<?> cls = Class.forName(C1561oA.Yd("Uba#ZXnbpdakb`.ecym{olvmkl|}<q\u0003zvzy\tD~\tz\u0014I]\f\u0013\u0005\r\u0011\u0013z\u0006\u0012\u0013\r\u001dv\u001a\u0010\"\u001a\u0014", (short) (C1633zX.Xd() ^ ((1574158925 ^ 1326164506) ^ (-316168188)))));
            Class<?>[] clsArr = new Class[(1377027035 ^ 1680031873) ^ 909149016];
            clsArr[0] = Class.forName(Xg.qd("\u001c\u0014*\u0016c#\u0019'!h\u000f10(.(", (short) (FB.Xd() ^ (1560331894 ^ 1560334484)), (short) (FB.Xd() ^ (1835456137 ^ 1835462238))));
            clsArr[1] = Class.forName(Jg.Wd("$w?B\u0006C\rQU%n/|\u0004@~\u0010!%\u001d7o7y\u0002\f\u007f\\]*ai>;n\u0005]", (short) (C1499aX.Xd() ^ (1701889543 ^ (-1701900215))), (short) (C1499aX.Xd() ^ ((623236994 ^ 1611674071) ^ (-1161136793)))));
            Object[] objArr2 = new Object[104119125 ^ 104119127];
            objArr2[0] = strYd;
            objArr2[1] = writableMap;
            Method declaredMethod2 = cls.getDeclaredMethod(ZO.xd("a+\u0015.", (short) (ZN.Xd() ^ (757132392 ^ 757124263)), (short) (ZN.Xd() ^ (385392878 ^ 385416383))), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void onProvError$app_release(AntelopError antelopError) throws Throwable {
        int iXd = C1633zX.Xd() ^ 1951484835;
        int iXd2 = ZN.Xd() ^ (-864697445);
        short sXd = (short) (C1580rY.Xd() ^ iXd);
        short sXd2 = (short) (C1580rY.Xd() ^ iXd2);
        int[] iArr = new int["c\bb".length()];
        QB qb = new QB("c\bb");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(antelopError, new String(iArr, 0, i2));
        this.isProvisioningInit = false;
        Pair[] pairArr = new Pair[Od.Xd() ^ (163115266 ^ 1313170773)];
        pairArr[0] = TuplesKt.to(Ig.wd("r0\u0015p", (short) (OY.Xd() ^ (1751330805 ^ 1751321129))), antelopError.getCode().toString());
        String message = antelopError.getMessage();
        if (message == null) {
            message = "";
        }
        pairArr[1] = TuplesKt.to(EO.Od("e\rKi*|\\", (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (581906800 ^ (-1459511595))))), message);
        short sXd3 = (short) (FB.Xd() ^ (Od.Xd() ^ (1038815918 ^ 2048327241)));
        int[] iArr2 = new int["R]Z\u001aOK_Q]OJRGC\u000fD@TFRD?G<87ED\u00014C9352?x19)@s\u000627'-//\u0015\u001e('\u001f-\u0005&\u001a* \u0018".length()];
        QB qb2 = new QB("R]Z\u001aOK_Q]OJRGC\u000fD@TFRD?G<87ED\u00014C9352?x19)@s\u000627'-//\u0015\u001e('\u001f-\u0005&\u001a* \u0018");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = {pairArr};
        Method declaredMethod = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(C1593ug.zd("_TdD\\", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (2085072329 ^ (-1002046701)))), (short) (C1499aX.Xd() ^ (OY.Xd() ^ (-69951246)))), Pair[].class);
        try {
            declaredMethod.setAccessible(true);
            WritableMap writableMap = (WritableMap) declaredMethod.invoke(this, objArr);
            short sXd4 = (short) (Od.Xd() ^ (208950914 ^ (-208948822)));
            int[] iArr3 = new int["u\u0002\u0007\u0011\u0001\u0002}\u0004\fp|{wy".length()];
            QB qb3 = new QB("u\u0002\u0007\u0011\u0001\u0002}\u0004\fp|{wy");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                i4++;
            }
            String str = new String(iArr3, 0, i4);
            Class<?> cls = Class.forName(C1561oA.Kd("x\u0006\u0005F}{\u0012\u0006\u0014\b\u0005\u000f\u0006\u0004Q\t\u0007\u001d\u0011\u001f\u0013\u0010\u001a\u0011\u000f\u0010 !_\u0015&\u001e\u001a\u001e\u001d,g\",\u001e7l\u0001/6(046\u001e)560@\u001a=3E=7", (short) (C1607wl.Xd() ^ ((1633167234 ^ 22943384) ^ 1611019357))));
            Class<?>[] clsArr = new Class[(329066264 ^ 1793303830) ^ 2038333964];
            clsArr[0] = Class.forName(Wg.Zd("\u001doKn\u007fz2{9X\u0004^ T\u001bQ", (short) (C1499aX.Xd() ^ ((819645786 ^ 1897761394) ^ (-1103573144))), (short) (C1499aX.Xd() ^ ((1043218094 ^ 1764989855) ^ (-1461562493)))));
            clsArr[1] = Class.forName(C1561oA.Xd("Ta`\"[WZ][ijg+pdadv1fwokon8b~v\u0003pr}w`u\u0006", (short) (C1499aX.Xd() ^ ((241771791 ^ 1959481198) ^ (-2057460276)))));
            Object[] objArr2 = new Object[952367897 ^ 952367899];
            objArr2[0] = str;
            objArr2[1] = writableMap;
            Method declaredMethod2 = cls.getDeclaredMethod(Wg.vd("\u0017\u001e\u001d'", (short) (OY.Xd() ^ ((1070568666 ^ 135524128) ^ 937182412))), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void onProvInitError$app_release(AntelopError antelopError) throws Throwable {
        int iXd = C1580rY.Xd() ^ 831085307;
        int iXd2 = C1499aX.Xd() ^ (819464257 ^ 1933774372);
        short sXd = (short) (C1580rY.Xd() ^ iXd);
        short sXd2 = (short) (C1580rY.Xd() ^ iXd2);
        int[] iArr = new int["\b\u0014\u0013".length()];
        QB qb = new QB("\b\u0014\u0013");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(antelopError, new String(iArr, 0, i2));
        Pair[] pairArr = new Pair[C1633zX.Xd() ^ (-1951491127)];
        String string = antelopError.getCode().toString();
        short sXd3 = (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831072277));
        short sXd4 = (short) (C1633zX.Xd() ^ (1301036939 ^ (-1301033180)));
        int[] iArr2 = new int["6A55".length()];
        QB qb2 = new QB("6A55");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
            i3++;
        }
        pairArr[0] = TuplesKt.to(new String(iArr2, 0, i3), string);
        String message = antelopError.getMessage();
        if (message == null) {
            message = "";
        }
        pairArr[1] = TuplesKt.to(C1561oA.ud("\u0016\r\u001a\u0019\u0006\u000b\b", (short) (Od.Xd() ^ (1386076422 ^ (-1386070339)))), message);
        Object[] objArr = {pairArr};
        Method declaredMethod = Class.forName(C1561oA.yd("\u0006\u0013\u000eO\u0003\u0001\u0013\u0007\u0011\u0005}\bzxBy\u0014*\u001a(\u0018\u0015\u001b\u0012\f\r\u0019\u001aT\n\u0017\u000ffjet,fl^s)9gj\\`d\u0003jq}zt\u0001Zyo}uk", (short) (ZN.Xd() ^ (126234811 ^ 126236645)))).getDeclaredMethod(C1561oA.Yd("odtTl", (short) (C1499aX.Xd() ^ ((589581591 ^ 702738415) ^ (-180810027)))), Pair[].class);
        try {
            declaredMethod.setAccessible(true);
            WritableMap writableMap = (WritableMap) declaredMethod.invoke(this, objArr);
            String strQd = Xg.qd("p~\u0006\u0012\u0004\u0007\u0005\r\u0017}\u0006\u0004\u0003\u0006\u007f\b\f\n\u0016\u001c#\n\u0018\u0019\u0017\u001b", (short) (OY.Xd() ^ ((604500878 ^ 539999996) ^ 69730841)), (short) (OY.Xd() ^ (429584985 ^ 429577787)));
            short sXd5 = (short) (OY.Xd() ^ (1226564896 ^ 1226546427));
            short sXd6 = (short) (OY.Xd() ^ ((1392171140 ^ 1989167299) ^ 610961256));
            int[] iArr3 = new int["zCIq0\u00152\r\"\u0015y\u000bhi\"`E^UKF&7\u0019\u001e\"\u0019\u001dC{srY`f\\\u001b9J#C\u007fz0\u001e\u000f~\nr]sfnK^ JC<? ".length()];
            QB qb3 = new QB("zCIq0\u00152\r\"\u0015y\u000bhi\"`E^UKF&7\u0019\u001e\"\u0019\u001dC{srY`f\\\u001b9J#C\u007fz0\u001e\u000f~\nr]sfnK^ JC<? ");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd6) ^ sXd5));
                i4++;
            }
            Class<?> cls = Class.forName(new String(iArr3, 0, i4));
            Class<?>[] clsArr = new Class[(2079906000 ^ 939954496) ^ 1140738450];
            clsArr[0] = Class.forName(ZO.xd("abui\u001d=mgBG[~\u0003\u007f\u0015E", (short) (Od.Xd() ^ ((1304074787 ^ 1443948007) ^ (-464132792))), (short) (Od.Xd() ^ ((1367732119 ^ 1474158242) ^ (-106455293)))));
            clsArr[1] = Class.forName(C1626yg.Ud("\u001c\u0011}8om\u0012\u0014\u001d\u0003e\u0017h6qei8\b\n<AiJE/7!/0N\u0007Fw\u0018Kc", (short) (ZN.Xd() ^ ((496967056 ^ 1633276476) ^ 2093394413)), (short) (ZN.Xd() ^ ((296906715 ^ 1523595332) ^ 1264714109))));
            Object[] objArr2 = new Object[1172295025 ^ 1172295027];
            objArr2[0] = strQd;
            objArr2[1] = writableMap;
            Method declaredMethod2 = cls.getDeclaredMethod(Ig.wd("S\u0014>`", (short) (C1499aX.Xd() ^ (1133846199 ^ (-1133851766)))), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void onProvInitSuccess$app_release() throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ ((846030852 ^ 284232329) ^ 580673760));
        int[] iArr = new int["\fOy#M\u0004RT\u007f,)H\u0002\u0011\u0013=_\u007f\u001b!d".length()];
        QB qb = new QB("\fOy#M\u0004RT\u007f,)H\u0002\u0011\u0013=_\u007f\u001b!d");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Class<?> cls = Class.forName(C1561oA.Qd("\u001e)&e\u001b\u0017+\u001d)\u001b\u0016\u001e\u0013\u000fZ\u0010\f \u0012\u001e\u0010\u000b\u0013\b\u0004\u0003\u0011\u0010L\u007f\u000f\u0005~\u0001}\u000bD|\u0005t\f?Q}\u0003rxzz`isrjxPqeukc", (short) (C1633zX.Xd() ^ ((1889477310 ^ 678211883) ^ (-1492380025)))));
        Class<?>[] clsArr = new Class[ZN.Xd() ^ (823178388 ^ 43682406)];
        int iXd = OY.Xd() ^ (1046463044 ^ (-980716345));
        clsArr[0] = Class.forName(C1593ug.zd("/'=)v6,:4{\"DC;A;", (short) (C1633zX.Xd() ^ ((780154057 ^ 500027056) ^ (-860740482))), (short) (C1633zX.Xd() ^ iXd)));
        short sXd2 = (short) (ZN.Xd() ^ ((2103377521 ^ 1121730937) ^ 1065531050));
        int[] iArr2 = new int["`kh(_YZ[Wcb]\u001fbTOP`\u0019L[QKMJ\u0012:TJT@@IA(;I".length()];
        QB qb2 = new QB("`kh(_YZ[Wcb]\u001fbTOP`\u0019L[QKMJ\u0012:TJT@@IA(;I");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[1] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = new Object[(1561321119 ^ 1900675926) ^ 742776267];
        objArr[0] = str;
        objArr[1] = null;
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.Kd("1:7C", (short) (Od.Xd() ^ ((1296673618 ^ 414625964) ^ (-1442783059)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void onProvNotEligible$app_release(EligibilityDenialReason eligibilityDenialReason, String str) throws Throwable {
        String strZd = Wg.Zd("%DUr\u007f\u0012", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (1694878686 ^ (-1418506838)))), (short) (C1607wl.Xd() ^ (1389828104 ^ 1389830892)));
        Intrinsics.checkNotNullParameter(eligibilityDenialReason, strZd);
        Pair[] pairArr = new Pair[380686676 ^ 380686678];
        pairArr[0] = TuplesKt.to(strZd, eligibilityDenialReason.name());
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.to(C1561oA.Xd("`TVVdXbX[", (short) (C1499aX.Xd() ^ ((1317846089 ^ 280110472) ^ (-1581182495)))), str);
        short sXd = (short) (C1607wl.Xd() ^ ((2088461272 ^ 340378494) ^ 1748147785));
        int[] iArr = new int["S`[\u001dXVh\\^RKUPN\u0018OawgumjpgYZfg*_ldtxs\u0003B|\u0003t\u00027Gu\u0001rvz\u0011x\u007f\f\u0011\u000b\u0017p\b}\f\u0004\u0002".length()];
        QB qb = new QB("S`[\u001dXVh\\^RKUPN\u0018OawgumjpgYZfg*_ldtxs\u0003B|\u0003t\u00027Gu\u0001rvz\u0011x\u007f\f\u0011\u000b\u0017p\b}\f\u0004\u0002");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Pair[].class};
        Object[] objArr = {pairArr};
        int iXd = Od.Xd() ^ 1207815629;
        short sXd2 = (short) (OY.Xd() ^ (381288965 ^ 381306191));
        short sXd3 = (short) (OY.Xd() ^ iXd);
        int[] iArr2 = new int["?2@\u001e4".length()];
        QB qb2 = new QB("?2@\u001e4");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            WritableMap writableMap = (WritableMap) declaredMethod.invoke(this, objArr);
            String strVd = hg.Vd("T`eo_`\\bjXX\\fKQMJKCLD", (short) (C1580rY.Xd() ^ (654004954 ^ (-654002925))), (short) (C1580rY.Xd() ^ ((1029845662 ^ 476352633) ^ (-554081709))));
            short sXd4 = (short) (ZN.Xd() ^ ((1952366400 ^ 495665613) ^ 1775603274));
            int[] iArr3 = new int["\u000f\u001a\u0017V\f\b\u001c\u000e\u001a\f\u0007\u000f\u0004\u007fK\u0001|\u0011\u0003\u000f\u0001{\u0004xts\u0002\u0001=p\u007fuoqn{5mue|0BnscikkQZdc[iAbVf\\T".length()];
            QB qb3 = new QB("\u000f\u001a\u0017V\f\b\u001c\u000e\u001a\f\u0007\u000f\u0004\u007fK\u0001|\u0011\u0003\u000f\u0001{\u0004xts\u0002\u0001=p\u007fuoqn{5mue|0BnscikkQZdc[iAbVf\\T");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3));
                i4++;
            }
            Class<?> cls2 = Class.forName(new String(iArr3, 0, i4));
            Class<?>[] clsArr2 = new Class[(2037168668 ^ 617334729) ^ 1571257815];
            clsArr2[0] = Class.forName(C1561oA.yd("qg\u007fi9vnzv<d\u0005\u0006{\u0004{", (short) (OY.Xd() ^ ((1213906022 ^ 56497409) ^ 1258617822))));
            clsArr2[1] = Class.forName(C1561oA.Yd("\u0006\u0013\u0012S\r\t\f\u000f\r\u001b\u001c\u0019\\\"\u0016\u0013\u0016(b\u0018)!\u001d! i\u00140(4\"$/)\u0012'7", (short) (Od.Xd() ^ ((906792987 ^ 381313297) ^ (-548849026)))));
            Object[] objArr2 = new Object[1362209211 ^ 1362209209];
            objArr2[0] = strVd;
            objArr2[1] = writableMap;
            short sXd5 = (short) (C1607wl.Xd() ^ (770645663 ^ 770649171));
            short sXd6 = (short) (C1607wl.Xd() ^ ((940695431 ^ 1714795908) ^ 1579435748));
            int[] iArr4 = new int["\u0002\u000b\b\u0014".length()];
            QB qb4 = new QB("\u0002\u000b\b\u0014");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i5)) + sXd6);
                i5++;
            }
            Method declaredMethod2 = cls2.getDeclaredMethod(new String(iArr4, 0, i5), clsArr2);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void onProvPending$app_release() throws Throwable {
        String strWd = Jg.Wd(".I\u001dF\u0005\u0015o\u0005ml/V\u001a-\u0010\u0017", (short) (ZN.Xd() ^ ((611416065 ^ 1963700893) ^ 1367000811)), (short) (ZN.Xd() ^ ((1731456468 ^ 1755492705) ^ 261171782)));
        Class<?> cls = Class.forName(ZO.xd("7!h\u000fFz}Uz!HOWW!Bk@k>\u001b[\u001bA\u0016=k1,m\";'xsT!s\u001a{\nb_>\u00057y9#sJ.^X\"`h@\u0004\u001a\u0003", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (1130460708 ^ (-77377102)))), (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ (1178000420 ^ 95257217)))));
        Class<?>[] clsArr = new Class[872179962 ^ 872179960];
        clsArr[0] = Class.forName(C1626yg.Ud("lE\u0002\u001e\u0002WCw\u000bC947F\u0016\u0005", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69959169)), (short) (C1607wl.Xd() ^ (139974369 ^ 139965745))));
        clsArr[1] = Class.forName(Ig.wd("$\u0003\roe\u0013r[)88Xk4)M\u0016\u000b\u001bY*gz[>\u0005\u000f`3\u000fYC\u001f|,\tt", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69945344)))));
        Object[] objArr = new Object[OY.Xd() ^ (679334667 ^ 743889889)];
        objArr[0] = strWd;
        objArr[1] = null;
        Method declaredMethod = cls.getDeclaredMethod(EO.Od("f<Lq", (short) (C1580rY.Xd() ^ ((1542740069 ^ 1854043219) ^ (-896940818)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void onProvPermissionNotGranted$app_release(String[] strArr) throws Throwable {
        Intrinsics.checkNotNullParameter(strArr, C1561oA.Qd("\"\u0016\"\u001c!", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (806496461 ^ 60299154)))));
        Object[] objArr = {new Pair[]{TuplesKt.to(C1561oA.od("nbnhclk`ecg", (short) (FB.Xd() ^ (C1607wl.Xd() ^ (725032699 ^ 1165175032)))), ArraysKt.joinToString$default(strArr, C1593ug.zd("\u0011", (short) (C1607wl.Xd() ^ ((1059599574 ^ 788116843) ^ 298943318)), (short) (C1607wl.Xd() ^ (741726212 ^ 741718642))), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 88707336 ^ 88707382, (Object) null))}};
        Method declaredMethod = Class.forName(C1561oA.Kd("'43t,*@4B63=42\u007f75K?MA>H?=>NO\u000eCTLHLKZ\u0016PZLe\u001b/]dV^bdLWcd^nHkaske", (short) (ZN.Xd() ^ ((1673239525 ^ 876626437) ^ 1476125898)))).getDeclaredMethod(Wg.Zd("j!\u000b#u", (short) (OY.Xd() ^ (1918639678 ^ 1918635801)), (short) (OY.Xd() ^ ((1014661970 ^ 19490911) ^ 1028912642))), Pair[].class);
        try {
            declaredMethod.setAccessible(true);
            WritableMap writableMap = (WritableMap) declaredMethod.invoke(this, objArr);
            String strXd = C1561oA.Xd("esz\u0007x{y\u0002\f}s\u0002}z\u0006\u0007}\u0005\u0005\u0017\u0007\t\u000f\u001b\u0004\u0010\u007f\u000e\u0015\u0007\u0007", (short) (C1580rY.Xd() ^ (1892947170 ^ (-1892948753))));
            Class<?> cls = Class.forName(Wg.vd("fsr4ki\u007fs\u0002ur|sq?vTj^l`]g^\\]mn-bsk\b\f\u000b\u001aU\u0010\u001a\f%Zn\u001d$\u0016\u001e\"\u0004kv\u0003\u0004}\u000eg\u000b\u0001\u0013\u000b\u0005", (short) (C1499aX.Xd() ^ (1067907709 ^ (-1067883394)))));
            Class<?>[] clsArr = new Class[(108027436 ^ 1988637596) ^ 1895329202];
            short sXd = (short) (C1607wl.Xd() ^ (1222078565 ^ 1222080664));
            short sXd2 = (short) (C1607wl.Xd() ^ ((1919335991 ^ 965549728) ^ 1273729772));
            int[] iArr = new int["qg{e1nbnf,Ppmcg_".length()];
            QB qb = new QB("qg{e1nbnf,Ppmcg_");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Class.forName(hg.Vd("CNK\u000bB<=>:FE@\u0002E723C{/>4.0-t\u001d7-7##,$\u000b\u001e,", (short) (C1580rY.Xd() ^ ((818992847 ^ 91532354) ^ (-899967865))), (short) (C1580rY.Xd() ^ (1133630417 ^ (-1133611079)))));
            Object[] objArr2 = new Object[(325692581 ^ 2025803924) ^ 1809251379];
            objArr2[0] = strXd;
            objArr2[1] = writableMap;
            Method declaredMethod2 = cls.getDeclaredMethod(C1561oA.ud("-4/9", (short) (OY.Xd() ^ ((515065721 ^ 1235906670) ^ 1461268201))), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void onProvSuccess$app_release() throws Throwable {
        String strYd = C1561oA.yd("GU\\hZ][cmbeTUXgh", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831074976)));
        Class<?> cls = Class.forName(C1561oA.Yd("_lk-dbxlznkulj8om\u0004w\u0006yv\u0001wuv\u0007\bF{\r\u0005\u0001\u0005\u0004\u0013N\t\u0013\u0005\u001eSg\u0016\u001d\u000f\u0017\u001b\u001d\u0005\u0010\u001c\u001d\u0017'\u0001$\u001a,$\u001e", (short) (ZN.Xd() ^ (1268778858 ^ 1268784126))));
        Class<?>[] clsArr = new Class[Od.Xd() ^ 1207800919];
        clsArr[0] = Class.forName(Xg.qd(";3I5\u0003B8F@\b.POGMG", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849973336)), (short) (C1607wl.Xd() ^ (2014515269 ^ 2014514876))));
        int iXd = C1607wl.Xd() ^ 1849979019;
        short sXd = (short) (ZN.Xd() ^ (1493284417 ^ 1493282875));
        short sXd2 = (short) (ZN.Xd() ^ iXd);
        int[] iArr = new int["_f?\\\u0016qJM\u001b\u0005_X{!\u000beZf|\f~tH*\u001b>DZ2\u001eac^4\u0017\nw".length()];
        QB qb = new QB("_f?\\\u0016qJM\u001b\u0005_X{!\u000beZf|\f~tH*\u001b>DZ2\u001eac^4\u0017\nw");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        clsArr[1] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = new Object[616102162 ^ 616102160];
        objArr[0] = strYd;
        objArr[1] = null;
        int iXd2 = C1633zX.Xd() ^ (-1951486105);
        Method declaredMethod = cls.getDeclaredMethod(ZO.xd("\fZFq", (short) (ZN.Xd() ^ (296164866 ^ 296165333)), (short) (ZN.Xd() ^ iXd2)), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void onProvisioningRequired$app_release() throws Throwable {
        String strUd = C1626yg.Ud("Z(\u001f*G\t*\bB8bB(Al\u000ea\\cr\u0007G\u0015]67]i", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207801095))), (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609525450))));
        Class<?> cls = Class.forName(Ig.wd("\u0019v\u0005bg0'_FJBo;0Z4t\nRuR\b|lS%\u0014?txjG\u0018zN ,GS4NX9^\u0014nP\ry>>\u001dM/r{ 3tqb", (short) (FB.Xd() ^ (OY.Xd() ^ (517947545 ^ 452203278)))));
        Class<?>[] clsArr = new Class[C1580rY.Xd() ^ (-831067165)];
        clsArr[0] = Class.forName(EO.Od("*N\u0014\u001c+7\u000ed\u001d%F\b1('C", (short) (FB.Xd() ^ (1756515007 ^ 1756520472))));
        clsArr[1] = Class.forName(C1561oA.Qd("_jg'^XYZVba\\\u001eaSNO_\u0018KZPJLI\u00119SIS??H@':H", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831070114)))));
        Object[] objArr = new Object[Od.Xd() ^ (1042229174 ^ 2044900321)];
        objArr[0] = strUd;
        objArr[1] = null;
        Method declaredMethod = cls.getDeclaredMethod(C1593ug.zd("\n\u0013\u0010\u001c", (short) (OY.Xd() ^ ((1999286018 ^ 276613498) ^ 1733708495)), (short) (OY.Xd() ^ (973991123 ^ 973984308))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, objArr);
            if (this.isAutoFlowActive) {
                Promise promise = this.autoFlowPromise;
                Intrinsics.checkNotNull(promise);
                Class<?> cls2 = Class.forName(C1561oA.od("\u0001\f\tH}y\u000e\u007f\f}x\u0001uq=rn\u0003t\u0001rmujfesr/bqgac`m'_gWn\"4`eU[]]CLVUM[3THXNF", (short) (OY.Xd() ^ (887516655 ^ 887515551))));
                Class<?>[] clsArr2 = new Class[1];
                short sXd = (short) (ZN.Xd() ^ (1595922325 ^ 1595928355));
                int[] iArr = new int["\t\u0016\u0015V\u0010\f\u000f\u0012\u0010\u001e\u001f\u001c_%\u0019\u0016\u0019+e\u001b,$ $#l\u0010310-8+".length()];
                QB qb = new QB("\t\u0016\u0015V\u0010\f\u000f\u0012\u0010\u001e\u001f\u001c_%\u0019\u0016\u0019+e\u001b,$ $#l\u0010310-8+");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                clsArr2[0] = Class.forName(new String(iArr, 0, i2));
                Object[] objArr2 = {promise};
                Method method = cls2.getMethod(Wg.Zd("d-9\u0002+\u001eo\u0016D~(U\u0003#Ei\u0012", (short) (Od.Xd() ^ (713380197 ^ (-713375564))), (short) (Od.Xd() ^ ((1913934459 ^ 423870006) ^ (-1800919283)))), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(this, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @ReactMethod
    public final void pushToGooglePay(String str, final Promise promise) {
        Intrinsics.checkNotNullParameter(str, C1561oA.Xd("\u0002\b\u0007\n\u0016\u0004\u0010g\u0007\u0019\fq\u000e", (short) (FB.Xd() ^ ((200794922 ^ 174497150) ^ 26302702))));
        Intrinsics.checkNotNullParameter(promise, Wg.vd("SVTSHSF", (short) (C1580rY.Xd() ^ ((1727745046 ^ 1402755686) ^ (-895964702)))));
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(Qg.kd("+7<F44C$%5)5'15", (short) (OY.Xd() ^ (606599815 ^ 606589275)), (short) (OY.Xd() ^ (Od.Xd() ^ (1520415328 ^ 492975726)))), hg.Vd("_\u007f/vn\u0006+Kl|p|nx|\"bcss^h", (short) (ZN.Xd() ^ ((2073511304 ^ 573297251) ^ 1505531876)), (short) (ZN.Xd() ^ ((130820042 ^ 744293942) ^ 730938791))));
            return;
        }
        Wallet wallet = this.wallet;
        if (wallet == null) {
            promise.reject(C1561oA.ud("\u001d).8&&5,\u0015\u001f\u001e\u0016$", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951478374))), C1561oA.yd("-6@??MwEM|ANVڕ\u007fB53)&>*,({", (short) (ZN.Xd() ^ (ZN.Xd() ^ (526057092 ^ 751873591)))));
            return;
        }
        try {
            final DigitalCard digitalCard = wallet.getDigitalCard(str);
            if (digitalCard != null) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.davivienda.daviviendaapp.bridges.gpay.AntelopWalletModule$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        AntelopWalletModule.$r8$lambda$dqO4ZIyEmsLZ3rUxC23b9d357T4(this.f$0, digitalCard, currentActivity, promise);
                    }
                });
                return;
            }
            short sXd = (short) (Od.Xd() ^ (246849174 ^ (-246859081)));
            int[] iArr = new int["owoe".length()];
            QB qb = new QB("owoe");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            throw new IllegalStateException(new String(iArr, 0, i2).toString());
        } catch (Throwable unused) {
            short sXd2 = (short) (OY.Xd() ^ (847400310 ^ 847406266));
            short sXd3 = (short) (OY.Xd() ^ ((638816548 ^ 465291002) ^ 1034444173));
            int[] iArr2 = new int["t\u0017H\u000f#\u0015 \"\u0014Ot\u001b\u001a\u001d)\u0017#z\u001a,\u001f[".length()];
            QB qb2 = new QB("t\u0017H\u000f#\u0015 \"\u0014Ot\u001b\u001a\u001d)\u0017#z\u001a,\u001f[");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            promise.reject(Jg.Wd("{\u0007\u00130\u001e\u001apt\u0012~\u0006_rUf\tI;", (short) (ZN.Xd() ^ (2071457840 ^ 2071430244)), (short) (ZN.Xd() ^ ((1997120630 ^ 1316583341) ^ 963677549))), new String(iArr2, 0, i3) + str);
        }
    }

    @ReactMethod
    public final void resetState() {
        try {
            WalletManager walletManager = this.wm;
            if (walletManager != null) {
                walletManager.disconnect();
            }
        } catch (Throwable unused) {
        }
        try {
            WalletManager walletManager2 = this.wm;
            if (walletManager2 != null) {
                walletManager2.clean();
            }
        } catch (Throwable unused2) {
        }
        try {
            WalletProvisioning walletProvisioning = this.provisioning;
            if (walletProvisioning != null) {
                walletProvisioning.clean();
            }
        } catch (Throwable unused3) {
        }
        this.wm = null;
        this.wallet = null;
        this.provisioning = null;
        this.isProvisioningInit = false;
    }

    public final void setWallet$app_release(Wallet wallet) {
        this.wallet = wallet;
    }

    @ReactMethod
    public final void startAutoProvisioningFlow(String str, Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(str, ZO.xd("\u001f}r*MOw9`\u000f0\r\u001d\u0002\u0018v\u007f", (short) (ZN.Xd() ^ (ZN.Xd() ^ (365177131 ^ 642650209))), (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (278428740 ^ (-1690920106))))));
        Intrinsics.checkNotNullParameter(promise, C1626yg.Ud("\u000f~.L\u0001\u00154", (short) (OY.Xd() ^ (C1607wl.Xd() ^ (1618891524 ^ 238713402))), (short) (OY.Xd() ^ (OY.Xd() ^ (1617593551 ^ 1682026648)))));
        if (this.isAutoFlowActive) {
            short sXd = (short) (C1607wl.Xd() ^ (FB.Xd() ^ (1862713227 ^ 820628618)));
            int[] iArr = new int["I.~Y\u00193U\u0010Y-\u0016\u0007Zb".length()];
            QB qb = new QB("I.~Y\u00193U\u0010Y-\u0016\u0007Zb");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            promise.reject(new String(iArr, 0, i2), EO.Od("\u0011}Z2`M-k%\u000f\rÔ\"#Cod2tllUv߿2\u001eKM2hs\n/F\u0007S", (short) (FB.Xd() ^ ((59243368 ^ 2051126130) ^ 2043051776))));
            return;
        }
        try {
            this.isAutoFlowActive = true;
            this.autoFlowPromise = promise;
            this.pendingActivationCode = str;
            Class<?> cls = Class.forName(C1561oA.Qd("DOL\fA=QCOA<D95\u000162F8D619.*)76r&5+%'$1j#+\u001b2ew$)\u0019\u001f!!\u0007\u0010\u001a\u0019\u0011\u001fv\u0018\f\u001c\u0012\n", (short) (C1633zX.Xd() ^ (1052197224 ^ (-1052210158)))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1593ug.zd("9FE\u0007@<?B@NOL\u0010UIFI[\u0016K\\TPTS\u001d@ca`]h[", (short) (OY.Xd() ^ (229527592 ^ 229533263)), (short) (OY.Xd() ^ (1038092072 ^ 1038111050))));
            Object[] objArr = {promise};
            Method method = cls.getMethod(C1561oA.od("\u0011\u001c\u001a\u0019\u000f\f\u001c}\u0007\u0011\u0010\b\u0016m\u0001\r~\u0004\u0001\r", (short) (Od.Xd() ^ (1306947525 ^ (-1306928781)))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(this, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            this.isAutoFlowActive = false;
            this.autoFlowPromise = null;
            promise.reject(C1561oA.Kd("I^^ZkSZ^gpWefdh", (short) (FB.Xd() ^ (385412984 ^ 385411943))), e3.getMessage());
        }
    }

    @ReactMethod
    public final void startProvisioning(Promise promise) {
        int iXd = OY.Xd() ^ 69953298;
        short sXd = (short) (FB.Xd() ^ (1677340154 ^ 1677343731));
        short sXd2 = (short) (FB.Xd() ^ iXd);
        int[] iArr = new int["\u0013e9\u0006<\u0004F\u0017l nK\u001ch\u0018m;\u0002J".length()];
        QB qb = new QB("\u0013e9\u0006<\u0004F\u0017l nK\u001ch\u0018m;\u0002J");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Intrinsics.checkNotNullParameter(promise, C1561oA.Xd("RUSROZM", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831076972))));
        if (this.isProvisioningInit) {
            promise.resolve(true);
            return;
        }
        try {
            ReactApplicationContext reactApplicationContext = this.reactCtx;
            Class<?> cls = Class.forName(Wg.vd("}\t\nIzv\u000f\u0001\u0019\u000b\n\u0012\u0003~N\u0004\f \u0016\"\u0010\u000b\u0017\f\u0014\u0013%$\\\u0010#\u0019^`an$\\hX{/EqrblnzY~z|n{p\u0002\u007f}\u0002uPq{F;=>AH", (short) (ZN.Xd() ^ ((1891277413 ^ 2107248121) ^ 220253302))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Qg.kd("}\t\u0006Ezv\u000b|\tzu}rn:ok\u007fq}ojrgcbpo,_nd^`]j$\\dTk\u001f1]bRXZZ@ISRJX0QEUKC", (short) (Od.Xd() ^ ((250385651 ^ 1699321033) ^ (-1806006016))), (short) (Od.Xd() ^ (174929369 ^ (-174935535)))));
            Object[] objArr = {this};
            Constructor<?> constructor = cls.getConstructor(clsArr);
            try {
                constructor.setAccessible(true);
                WalletProvisioning walletProvisioning = new WalletProvisioning(reactApplicationContext, (AntelopProvisioningCallbacks) constructor.newInstance(objArr));
                walletProvisioning.initialize();
                this.provisioning = walletProvisioning;
                this.isProvisioningInit = true;
                promise.resolve(true);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (WalletValidationException e3) {
            promise.reject(str, e3);
        } catch (Throwable th) {
            promise.reject(str, th);
        }
    }

    public final void updateWallet$app_release(Wallet wallet) {
        this.wallet = wallet;
    }
}
