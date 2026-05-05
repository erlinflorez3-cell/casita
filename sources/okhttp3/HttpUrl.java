package okhttp3;

import androidx.autofill.HintConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.sessions.settings.RemoteSettings;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import io.sentry.protocol.Request;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import okio.Utf8;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4D\u0007\":\u0018\u007fјnjGNLeN9ZS8\u0018s{:'c$\u007fcCU \n*\teNogt[b\u000bY\u000f\u000e\u0016~j4Ikxe\u0012\u00157Xģ]{}ok8\u0019t}M`\u0012(\u0600\n\t\u000f\u001aBH>w\u000bGY\u000e*0nqJV\u001bP\u001d\u001a@\u0007N$\u000f\"tg|7Xpk?G#1oRX5fH\u0003]\u000fVTU\u000e%i.9N@M\u001f5W\u0013\thZm\u0004Upk\rx-55aum5\u0007\u0001$\u00199Z%]!'ػ\tQn\u0018o8]pcR$'&{B\u0012ʀ\b\u000e\fF\u00119;)~\b<4;wՂDP\b~\u000b\u000b\tqN\u0017S\u0001y0ݰ\u001ffW\u0003\u0004*\\H\u0014\u000b\u001d 3\u0001\u001d\"\n\\Teڠ\u001fT}sy^NP`P XknJuĊ\u0006*\nS\u0010\u000b=\u0010).E&}`ޠ'!q&\u0011Uu\u001c\u001d`\u0017i\u001aXVf:p,6X\bRʅD-\u0012yZlZB\u0010{\u001d\u001b\fą\f\u0013&\u0004@B/M(N}n0~\u0016h\u0018)GfeZ5pް[9d\\}Uq:yR%?\bJp/phXR:\u0006\r,0^`j>xDO\\\u000f+2mrb9Ϝ5\u0019bB\u0011\u0014,IY\u0003\u0019ajh>\u007f\u0003;j\bȐ(t\u000f/\u0019g~\b\u007fxw2CeĘ1AWda1c'\u00014+)M\u0004\u0381\u0004Gm|\u0010Yz0\u000eW\u0012\u001fD\u001b\u007fVȠA\u0013\u00150q@\u0010_]N\td\u007fNB+\t0\u0012\u000fiivs\u0016\u001f\t,\u000fkzSbL:v\rxk\u0019r\u001b\u0012gV|Wc\u0003\f\nZ\u0010wè]<TnE\u0013-U=\u0003\u0006!+6]G5R.wB5]uk\"\b6\nf\u001f(\u000bd2-\u0012\u001e f_\u0011J;fJ\"\nL@<l1H\u000fo͎\fB\u000fmU7V{|p\u00059\u0016\u0019=9~\tB\f\u001f£\f>!\u001c\u00164\\`r~Q},^q&WRϬkms\b%\u0011XL\"\u000b*25&dH.\u0015ob7oLx͛:AA#MG\u0017eL,jJQHҰm\u0006\u0016\u0006HLmR/4XriWV_\u0007\u001dnH3 \feՃ.\u0001\u0005S{)\u0007@I\u0005\u001c\t\u001b4ҕ6\u0001YbQ&xQ\u0017fS,\u000bYۆ\u001f(^G[VkPa\u0004L\u0003u*$1ƴ\u0010<0~#O&)\n`\u001fn\u000f0\r\f\f*͒hz*hX]07O\n\u000b\u001eT\n=\fO\u0015ζsfENT\bEQj\u0016%UA\r\u001c~sFI.4=c\u0003ƹn\u0018?}]dI\u0010X1.:\u001cv7[\u0006\u000f\u001dOܤ\u001f>.s\u001cu\u0010\u0017c_.\u0018FJ#s@sĝ:S\u001a5\b'lg<\u000b/J?-\u0003\u0005pL\u001f}Ơgrkߛm\r\tp?dJ\u007f;T5\tUNd\u0018͠^@\u0019֦8Z\u0017\u0004\"#v.D\u001dz)>eʍlvsχs\u000f1DyA2B>U6}Mz,\tցX.\u001d͇nODg\u0017j=Ye\u0015vp8f\u0005\fW\u0015+\u0007~cǚ\u0017:Nݱ6f5>'1,\u001cUx\u001f\u0004sO\\fܳVC398#}AG\"\u0011?zt.0x\u000eۥ\u0004m4ߠ^VC\u001f5rt~r\u001d>M[7p\tbVã\u00153r:&Xj(lQ_<Y#!\u0005%:\u001cn5\u001aKi\u007f[{ܼ\u0003Ϙ\u0005\rGƗ\u0002\u0001H\u000fOx31\u001foIX\u0015W[zְP+$\u0004ke\rj4e\u001d\u007fDIcKT?ߝD\u0004\"!*B\u0014\u000fs\u0011S1`*\u000e]v[ؾ[\n.ġNpJ#UzI\u007f\u00187\u0002\u0018\"e2Ȩ6ф~\u0014!ܒ\u000f;;n\u001fE{i0\u0010ް\u0011K\u001cɞ'\b/5%\u000bԁS;"}, d2 = {"\u001anZ5g;I!ba\nm7l\u00166;", "", "AbW2`,", "", "CrT?a(FS", ">`b@j6KR", "6nbA", ">naA", "", ">`c5F,@[\u0019\b\nl", "", "?tT?l\u0015:[\u0019\rVg+m\u00056u\u007f6", "4qP4`,Gb", "Cq[", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCyR+<\u001b\u0019(\u0013\u0012Jl\bU|\u0012CyF)[\fXu^\u0006P-o\u0010@c\bV\u0017,g&u\b)$XC<m\u0002\u0001&\u001fqR\u0004p\u0001O\"n\u001c\u0001cpIbhG1Bv]\u001c\t`", "3mR<W,=4&z|f,\u0006\u0018", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "3mR<W,=>\u0015\r\tp6\n\b", "3mR<W,=>\u0015\u000e}", "3mR<W,=>\u0015\u000e}L,~\u0011/n\u000f6", "u(;7T=:\u001d)\u000e~euc\r=tU", "3mR<W,=?)~\br", "3mR<W,=C'~\bg(\u0005\t", "7r7Ag7L", "", "u(I", ">`c5F0SS", "u(8", "?tT?l", "?tT?l\u0017:`\u0015\u0007zm,\nq+m\u007f6", "", "u(;7T=:\u001d)\u000e~euj\t>;", "?tT?l\u001aBh\u0019", "zcT=e,<O(~yX,\u0006\u00079d\u007f'\\M|\u0019\u001fGx\u001d", "zcT=e,<O(~yX,\u0006\u00079d\u007f'f<\u000f%)Q|\r", "zcT=e,<O(~yX,\u0006\u00079d\u007f'f<\u0010\u001a", "zcT=e,<O(~yX,\u0006\u00079d\u007f'f<\u0010\u001a\u0005Gq\u0016<\u007f4C", "zcT=e,<O(~yX,\u0006\u00079d\u007f'gP\u0001$+", "zcT=e,<O(~yX,\u0006\u00079d\u007f'kN\u0001$ Cw\u000e", "3pd._:", "=sW2e", "zcT=e,<O(~yX-\n\u00051m\u007f1\u000b", "6`b566=S", "zcT=e,<O(~yX/\u0007\u0017>", "<df\u000fh0ER\u0019\f", "\u001anZ5g;I!ba\nm7l\u00166$\\8\u007fG\u007f\u0017$\u001d", ":h]8", "zcT=e,<O(~yX7x\u0017=w\n5z", "zcT=e,<O(~yX7x\u00182S\u007f*\u0004@\n&%", "zcT=e,<O(~yX7x\u00182S\u0004={", "zcT=e,<O(~yX7\u0007\u0016>", "zcT=e,<O(~yX8\r\t<y", "?tT?l\u0017:`\u0015\u0007zm,\n", "<`\\2", "?tT?l\u0017:`\u0015\u0007zm,\nq+m\u007f", "7mS2k", "zcT=e,<O(~yX8\r\t<yj$\t<\t\u0017&G|v8~%C", "?tT?l\u0017:`\u0015\u0007zm,\ny+l\u0010(", "?tT?l\u0017:`\u0015\u0007zm,\ny+l\u0010(\n", "zcT=e,<O(~yX8\r\t<ym,\u0011@", "@dS.V;", "@db<_=>", "zcT=e,<O(~yX:z\f/m\u007f", "BnBAe0GU", "BnD?\\", "\u001aiPCTuGS(HjK\u0010R", "CqX", "BnD?_", "\u001aiPCTuGS(HjK\u0013R", "Bn_\u001de0OO(~Yh4x\r8", "zcT=e,<O(~yX<\n\r", "zcT=e,<O(~yX<\n\u0010", "zcT=e,<O(~yX<\u000b\t<n{0{", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005(4\u0012\u0006&nj?;LeV4ZS0\u001fs{B-c$wECU0}*\tUXog|Jb\u000bI$\u001cǝ\u0017?\\I\u0004w\u0016\u0011crEņC3[o\u0006En\u0016N\u0005N݅R<\b'\u0019\u001aXJX\u0003\tfc\f@ؓptH\\%M3\u001cZ\u001cLD\u0019\u001e\u000bɡ~:V\u0012u:]%3oPt?aF{{\u000f\u000f`54\u000faLѨp;C==S1\t\u001bgM,Wqkݛ\u0019+5Uas\u00068!\u0016\">CO;ƞ#*j/i`:)[Sqvh\u000eV$A{UR\u0012;\u001e'v͓]\u001et6&3#t\u0004F^1vD\u0016y\u00108_)\u000ecC9I\u0018\u001agIKf7*\u001eS\u001ek\u000f|\"sT<֫E!bxi3g?kJ\u0017\u0016gD\u0006\u0004\u001fç2.\u00127_\u007f]}Y:%XO[g\u05faQo\u0010{\\g%\u0007)va\u001ejHn̎\u001f\u001cE^!\u000epC\u0013\u00074\\bjD\u0011{ȼ\u0005\u000b\f\u001a+ \u000by\u0005/3EfO\u0017ȉ\u001bSk?=1|6\bp4\u001aeNv3cȡ\u0014\u0014og\u000f\u0014m>+\u0013f\u001dZS:\u0007\r,0i`j>yBD\u0017\u001a!jWqJ`\\5'\u0014-H1 \tAE&m\u0014\u0001\u0010-Ԟc*\u0011$<v\u001f\u007f~\u000e!su0a,+bhΊۮU5\u001fa\u001e.vp\u0015#5Ѩ$\u0004U$dGzn^{c98\u0016Hw\u0018/\u0006\u001f\u001d\u0017A20ΏuP\u0001}iM@@C+\bNSh\\&8n~cxjxQ\u0005\u001b07vrQ!\u0015\u0004\b#^zu|\u0005\u000fi\u0001ar1\u0006lRF(\u001d\u001fLQGoj\u000bCp['Kȶ(\u001a=Xy_\u007fn\\{+\u001a49}\u0004Zϣ\\˱͈U]8\u0001\u0001WgEV\"R+3FV2\u0010\bp\u000bz\r{TO-\tVfԇ;3\f\f\u001f,;r\u001fgH\\\b}bʝ\u0010.\u0002q\u0016\u0014\rEm\u001d[\u001e\u007fm\u001cж\r\u000fXZ\"\u000b*J70*\n8V\u0006!94\u0014+06o=\u0013\tJV<4ZU8\u000fQ\u0016\u0002\u0006>\u0014FF(\u001b%PZsiٙ>X\u0007znH3b\u000et/x\u0019~=ɼN|C|\u001dmtm_g@#k\u001d7\u001d3e\r6=+rǴi\u001f6}\u0019\u000bs_sO\u0010\\\u001cI?l\u001aqTL&M5BFÇiU\u001f+\u000f0\r$\u0006h\\\r\u000f\u0012\u0015T\u001787P\u0013|<ڳ:\u0013\u0019Ggr\u001ed]R\\'OE0\u007fEFq\r\u001aO{FI/LIuIW>,'*ߺ\u0004?\f[8 U\u0006E;jX&h \\I<lދ\"ȫ\u0006\u0015\u001bУ8\u00064M\u0003v*0\u000e;]\b\u0004\u001a!eqk&#\u0017Ӑ7˭\nNSЕ\u0011\fitqru\r\to?\\J\u0007;Z5\u000f7O>\u0013\u0007\\h\u001c*ݱZӜ\u0004\u001a\u001dұ78\u000en7\u001d \u0006v~\u0004Yk\u0011;1\u0002)\u00103FQL\tuݘ\u0002ą.`0ֽSXSMr\u0016|nHg\u001co;@r\u0007$)B~Uĝjǚ\u0017@Nݱ6f5J'#{\u000fMt\u0015\n\u0016c46ITU\u001ae4a¡4϶\u0015\u000fBŇ\r\u00020X\u0017v i2DTZ\u000e25q<m\u0013\u001c|ɕQђF\u00144ֶ&\u00135tF;^^ 8In\u0004['/\u0019\u0017N\u0005\u001e\toƻvܱW12ʈ\u0015\u0003\u0013^\b5\f<yW\u0001)˭\u0013E"}, d2 = {"\u001anZ5g;I!ba\nm7l\u00166$\\8\u007fG\u007f\u0017$\u001d", "", "u(E", "3mR<W,=4&z|f,\u0006\u0018", "", "5dc\u0012a*HR\u0019}[k(~\u0011/n\u000ff\u0006F\u0004&&R", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012a*HR\u0019}[k(~\u0011/n\u000ff\u0006F\u0004&&R", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "3mR<W,=>\u0015\r\tp6\n\b", "5dc\u0012a*HR\u0019}eZ:\u000b\u001b9r~f\u0006F\u0004&&R", "Adc\u0012a*HR\u0019}eZ:\u000b\u001b9r~f\u0006F\u0004&&R", "3mR<W,=>\u0015\u000e}L,~\u0011/n\u000f6", "", "5dc\u0012a*HR\u0019}eZ;\u007fv/g\b(\u0005O\u000fU!Mr\u001dK\u0002", "u(;7T=:\u001d)\u000e~euc\r=tU", "3mR<W,=?)~\br\u0015x\u0011/s[1z1|\u001e'G}", "5dc\u0012a*HR\u0019}fn,\n\u001d\u0018a\b(\n\u001c\n\u0016\bCv\u001e<\u0005c?_\u0001/Fx", "Adc\u0012a*HR\u0019}fn,\n\u001d\u0018a\b(\n\u001c\n\u0016\bCv\u001e<\u0005c?_\u0001/Fx", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "3mR<W,=C'~\bg(\u0005\t", "5dc\u0012a*HR\u0019}jl,\n\u0012+m\u007ff\u0006F\u0004&&R", "Adc\u0012a*HR\u0019}jl,\n\u0012+m\u007ff\u0006F\u0004&&R", "6nbA", "5dc\u0015b:M\u0012#\u0005}m;\b", "Adc\u0015b:M\u0012#\u0005}m;\b", ">naA", "", "5dc\u001db9M\u0012#\u0005}m;\b", "u(8", "Adc\u001db9M\u0012#\u0005}m;\b", "uH\u0018#", "AbW2`,", "5dc V/>[\u0019=\u0005d/\f\u0018:", "Adc V/>[\u0019=\u0005d/\f\u0018:", "/cS\u0012a*HR\u0019}eZ;\u007fv/g\b(\u0005O", "3mR<W,=>\u0015\u000e}L,~\u0011/n\u000f", "/cS\u0012a*HR\u0019}eZ;\u007fv/g\b(\u0005O\u000f", "/cS\u0012a*HR\u0019}fn,\n\u001d\u001aa\r$\u0004@\u0010\u0017$", "3mR<W,=<\u0015\u0007z", "3mR<W,=D\u0015\u0006\u000b^", "/cS\u001dT;AA\u0019\u0001\u0003^5\f", ">`c5F,@[\u0019\b\n", "/cS\u001dT;AA\u0019\u0001\u0003^5\f\u0017", ">`c5F,@[\u0019\b\nl", "/ka2T+R3\"|\u0005],{", "", "/cS\u001eh,Kg\u0004z\bZ4|\u0018/r", "<`\\2", "D`[BX", "0tX9W", "\u001anZ5g;I!ba\nm7l\u00166;", "3eU2V;Bd\u0019i\u0005k;", "3mR<W,=>\u0015\u000e}", "3mR<W,=?)~\br", "4qP4`,Gb", "7r3<g", "7m_Bg", "7r3<g\u000bHb", ">`a@X", "0`b2", ">`a@XjHY\u001c\u000e\ni", ">`b@j6KR", ">n_", "", ">tb5", ">nb", ":h\\6g", "/cS!e(BZ\u001d\b|L3x\u00172", "?tT?l", "@dT;V6=Sy\t\bN9\u0001", "@dT;V6=Sy\t\bN9\u0001G9k\u00037\u000bK", "@d\\<i,\u001aZ \\vg6\u0006\r-a\u0007\u0014\f@\u000e+\u0002C|\nDv45f\f", "1`]<a0<O gvf,", "@d\\<i,\u001aZ ^\u0004\\6{\t.Q\u0010(\tTk\u0013$Cw\u000eKv2C", "@d\\<i,\u001aZ j\u000b^9\u0011s+r{0{O\u0001$%", "@d\\<i,)O(\u0002h^.\u0005\t8t", "7mS2k", "@db<_=>>\u0015\u000e}", "AsP?g\u0017Ha", "Adc\u0012a*HR\u0019}eZ;\u007fv/g\b(\u0005O", "Adc\u0012a*HR\u0019}fn,\n\u001d\u001aa\r$\u0004@\u0010\u0017$", "Adc\u001dT;AA\u0019\u0001\u0003^5\f", "Adc\u001eh,Kg\u0004z\bZ4|\u0018/r", "BnBAe0GU", "CrT?a(FS", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0018\u007f\u0007lo?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004s(\u0001:\t}R\u0018k|Or\u000bq\u00116\u001a\u0007pDI\u0004|\u000e\u0016\u001d9Zom7\u0014o\u0006Wn|N\u0005N6R<\b\n\u0019\u001aXJ@z\tIc\f@4ptHY%M3\u001eX\u0006\u0007>\u000f'tg|:xpk?G#1krR5eH|{\u0011vX5\u0014\u000faL/\u00077}/3]\u001b\u0007\u0001_g\u0003msm\tv-?+ww\b:f\u0007,\u0015YSS]C2j\u0006i`:)\u0002Փ6ׂT\u000e0»ߧ\u007f\u0018"}, d2 = {"\u001anZ5g;I!ba\nm7l\u00166$\\8\u007fG\u007f\u0017$\u0006M\u0018D\u0002!>]\b)\r", "", "u(E", "\u0017ME\u000e?\u0010\u001dM{hhM", "", ">`a@X\u0017H`(", "", "7m_Bg", ">nb", ":h\\6g", ">naA66E]\"h{_:|\u0018", "AbW2`,\u001dS \u0003\u0003b;|\u0016\u0019f\u00016{O", "AkP@[\nHc\"\u000e", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int parsePort(String str, int i2, int i3) {
                try {
                    int i4 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i2, i3, "", false, false, false, false, null, 248, null));
                    if (1 > i4 || i4 >= 65536) {
                        return -1;
                    }
                    return i4;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int portColonOffset(String str, int i2, int i3) {
                while (i2 < i3) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == '[') {
                        do {
                            i2++;
                            if (i2 < i3) {
                            }
                        } while (str.charAt(i2) != ']');
                    } else if (cCharAt == ':') {
                        return i2;
                    }
                    i2++;
                }
                return i3;
            }

            public final int schemeDelimiterOffset(String str, int i2, int i3) {
                if (i3 - i2 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i2);
                if ((Intrinsics.compare((int) cCharAt, 97) < 0 || Intrinsics.compare((int) cCharAt, 122) > 0) && (Intrinsics.compare((int) cCharAt, 65) < 0 || Intrinsics.compare((int) cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        return -1;
                    }
                    char cCharAt2 = str.charAt(i2);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i2;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public final int slashCount(String str, int i2, int i3) {
                int i4 = 0;
                while (i2 < i3) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i4++;
                    i2++;
                }
                return i4;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final Builder addPathSegments(String str, boolean z2) {
            int i2 = 0;
            do {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i2, str.length());
                push(str, i2, iDelimiterOffset, iDelimiterOffset < str.length(), z2);
                i2 = iDelimiterOffset + 1;
            } while (i2 <= str.length());
            return this;
        }

        private final int effectivePort() {
            int i2 = this.port;
            if (i2 != -1) {
                return i2;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            Intrinsics.checkNotNull(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return Intrinsics.areEqual(str, ".") || StringsKt.equals(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return Intrinsics.areEqual(str, "..") || StringsKt.equals(str, "%2e.", true) || StringsKt.equals(str, ".%2e", true) || StringsKt.equals(str, "%2e%2e", true);
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r1.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r1.size() - 1, "");
            }
        }

        private final void push(String str, int i2, int i3, boolean z2, boolean z3) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i2, i3, HttpUrl.PATH_SEGMENT_ENCODE_SET, z3, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            if (this.encodedPathSegments.get(r1.size() - 1).length() == 0) {
                this.encodedPathSegments.set(r1.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (z2) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            int size = list.size() - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list2);
                if (Intrinsics.areEqual(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == progressionLastElement) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        private final void resolvePath(String str, int i2, int i3) {
            int iDelimiterOffset = i2;
            if (iDelimiterOffset == i3) {
                return;
            }
            char cCharAt = str.charAt(iDelimiterOffset);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                iDelimiterOffset++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i4 = iDelimiterOffset;
                while (i4 < i3) {
                    iDelimiterOffset = Util.delimiterOffset(str, "/\\", i4, i3);
                    boolean z2 = iDelimiterOffset < i3;
                    push(str, i4, iDelimiterOffset, z2, true);
                    if (z2) {
                        i4 = iDelimiterOffset + 1;
                    }
                }
                return;
            }
        }

        public final Builder addEncodedPathSegment(String encodedPathSegment) {
            Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String encodedPathSegments) {
            Intrinsics.checkNotNullParameter(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        public final Builder addEncodedQueryParameter(String encodedName, String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            list.add(Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final Builder addPathSegment(String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String pathSegments) {
            Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        public final Builder addQueryParameter(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            list.add(Companion.canonicalize$okhttp$default(HttpUrl.Companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            ArrayList arrayList3 = arrayList2;
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (String str3 : list3) {
                    arrayList4.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList3, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        public final Builder encodedPassword(String encodedPassword) {
            Intrinsics.checkNotNullParameter(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String encodedPath) {
            Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
            if (!StringsKt.startsWith$default(encodedPath, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) null)) {
                throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
            }
            resolvePath(encodedPath, 0, encodedPath.length());
            return this;
        }

        public final Builder encodedQuery(String str) {
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) == null) ? null : HttpUrl.Companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final Builder encodedUsername(String encodedUsername) {
            Intrinsics.checkNotNullParameter(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, host, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException("unexpected host: " + host);
            }
            this.host = canonicalHost;
            return this;
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int iDelimiterOffset;
            int i2;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            boolean z2 = false;
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b2 = -1;
            if (iSchemeDelimiterOffset != -1) {
                if (StringsKt.startsWith(input, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!StringsKt.startsWith(input, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iSchemeDelimiterOffset);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        throw new IllegalArgumentException(sb.append(strSubstring).append('\'').toString());
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    if (input.length() > 6) {
                        input = StringsKt.take(input, 6) + "...";
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + input);
                }
                this.scheme = httpUrl.scheme();
            }
            int iSlashCount = companion.slashCount(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b3 = Utf8.REPLACEMENT_BYTE;
            byte b4 = 35;
            if (iSlashCount >= 2 || httpUrl == null || !Intrinsics.areEqual(httpUrl.scheme(), this.scheme)) {
                int i3 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z3 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(input, "@/\\?#", i3, iIndexOfLastNonAsciiWhitespace$default);
                    byte bCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? input.charAt(iDelimiterOffset) : b2;
                    if (bCharAt == b2 || bCharAt == b4 || bCharAt == 47 || bCharAt == 92 || bCharAt == b3) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z2) {
                            i2 = iDelimiterOffset;
                            this.encodedPassword += "%40" + Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i3, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(input, AbstractJsonLexerKt.COLON, i3, iDelimiterOffset);
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i3, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z3) {
                                strCanonicalize$okhttp$default = this.encodedUsername + "%40" + strCanonicalize$okhttp$default;
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                i2 = iDelimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, iDelimiterOffset2 + 1, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z2 = true;
                            } else {
                                i2 = iDelimiterOffset;
                            }
                            z3 = true;
                        }
                        i3 = i2 + 1;
                        b4 = 35;
                        b3 = Utf8.REPLACEMENT_BYTE;
                        b2 = -1;
                    }
                }
                Companion companion2 = Companion;
                int iPortColonOffset = companion2.portColonOffset(input, i3, iDelimiterOffset);
                int i4 = iPortColonOffset + 1;
                if (i4 < iDelimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, input, i3, iPortColonOffset, false, 4, null));
                    int port = companion2.parsePort(input, i4, iDelimiterOffset);
                    this.port = port;
                    if (port == -1) {
                        StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i4, iDelimiterOffset);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        throw new IllegalArgumentException(sb2.append(strSubstring2).append('\"').toString().toString());
                    }
                } else {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, input, i3, iPortColonOffset, false, 4, null));
                    Companion companion3 = HttpUrl.Companion;
                    String str2 = this.scheme;
                    Intrinsics.checkNotNull(str2);
                    this.port = companion3.defaultPort(str2);
                }
                if (this.host == null) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i3, iPortColonOffset);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    throw new IllegalArgumentException(sb3.append(strSubstring3).append('\"').toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || input.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
            }
            int iDelimiterOffset3 = Util.delimiterOffset(input, "?#", iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            resolvePath(input, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 < iIndexOfLastNonAsciiWhitespace$default && input.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = Util.delimiterOffset(input, '#', iDelimiterOffset3, iIndexOfLastNonAsciiWhitespace$default);
                this.encodedQueryNamesAndValues = HttpUrl.Companion.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < iIndexOfLastNonAsciiWhitespace$default && input.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, iDelimiterOffset3 + 1, iIndexOfLastNonAsciiWhitespace$default, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int i2) {
            if (1 > i2 || i2 >= 65536) {
                throw new IllegalArgumentException(("unexpected port: " + i2).toString());
            }
            this.port = i2;
            return this;
        }

        public final Builder query(String str) {
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) == null) ? null : HttpUrl.Companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.encodedPathSegments.set(i2, Companion.canonicalize$okhttp$default(HttpUrl.Companion, this.encodedPathSegments.get(i2), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str2 = list.get(i3);
                    list.set(i3, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String encodedName) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int i2) {
            this.encodedPathSegments.remove(i2);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder scheme(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.equals(scheme, "http", true)) {
                this.scheme = "http";
            } else {
                if (!StringsKt.equals(scheme, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.scheme = "https";
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i2, String encodedPathSegment) {
            Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i2, strCanonicalize$okhttp$default);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String encodedName, String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, str);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i2, String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
            }
            this.encodedPathSegments.set(i2, strCanonicalize$okhttp$default);
            return this;
        }

        public final void setPort$okhttp(int i2) {
            this.port = i2;
        }

        public final Builder setQueryParameter(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, str);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x0078  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#4\u0012\u0006\u001enj?7LeV4ZS0\u000fs{J$cҕyCQU\"}(\tWN}gvJ`\u0010K\u000f\u0014\u001f\u0001j2K]xs\u0012\u00172HtG3[oE9n\u0013>ӌ(288\u0002\u0005\u0017\u001a2H\u0016v\u0003CY+\u001a0FrBR#M\r\u001a\u0018\bDį\u00024ձ\u0018NdG-b@/ݭ\u0007iPNom>\fe\rtdW\u0011\u0005r6+n9{\u001amh\u0011\u0019j]U\u0002m\u0005m\tv;?+w\t\u001e;ݼ\u0004\u0014\u001bA\u0018\"k\u0005>^\u001bP\u000f\u001fW/]zcP<@>\u007fԫ\u0011<\n$N:V@E\u001a\u0015\u001b>7\u0003\nk@~\u0004%Gȸ~a<-m\u0015ADQ\u001d|P\u0010NIRE\u0013\u001d\rL%GsĲ_T\u0014z]zb\u0013i1\u007fBeH|\f\nCs\u0004~~\u001a*2@w\u00065{\u001fK/%eki'/\n\u001aHri'\u000bfha\tjHnB\u001f\u001c=*\u0017-rD\u0013%\u001cVZX:3e\u001c\u0003'.\u000e\u0019 j\u001bT!S0~Wnixqu\f;.\u0015\\ ʤ«\u0012W?\u0005{O_\u000b(a\u0001\u0017<?jd5\\t^k\f\tlX&@e\u0003\u0010&\f\u000bNT@@g\n\u001cb.Y\u0019\u000b\u0017x\t$BO\u0019!_\tx@\u0005Z32 \u0002$#\u00191Vbp}\n\u0011IZ\u001d'õέEQ;Bnd0\u0013L|Q\u001a's.I.QܤPl\u001c\b\u001e\r.A2;g.k&7~WGH2։Prkc\u0016#5&\u0015{%:\u0017A\u0010\b\u0019\treʧNOZ)j\bl\u001e;\nz~(tnzue\u001b\u0010ИBIx\u001c\"]\\d\u0015\u0005MKM\u0007\u007f$\r5[EUKF\u007f\"^-e\f\u001aX.X\u0014Uծ܌i\u00042\u0016^\u0007p\u0005u:K<Y[\u0015=P&\u001b7jH\u0019yNȷީ8\r9}\n\b~\rPM9\\&n\u00170\u001drlZh\u0015\u001e,d6mY\fG,DGC\u0004B\u0014ωܭqmQ\u0014S\u001f\u001dB#{_\u001c:\u001ckY\u0007[pCH\u0006\"\u001afEI~\u001d<74d0J%#C\u0003y6\u0014\t\u001e^_=\u0019bF\u0002Zn\u000e\u0003\u0019\rZV&xE\u000fAZ\u0005\r1K\u001e'Ua\t{il/\u0012R1Y+-3le}\u0015JqD\u001dc)cp\u00019r\u0006Cw;f\bUe\u0006k\u001e\u000eh\u001c\u000b9Z\u0018II\u0002\u0015m\u0014H^9e\u0015Rr\u0019*f\u0001nh)O\u0007\u000b\u000fT\n=\roۛEƚf-TϕHCQ\u001d\u0019\u0017r+]њOސJ\u001b5ݢ\u00069KM\u0003\u0014U}.Ę\u000e֞\f (ٴT\u0001/ao\u000e\u0015\u00104ͬ<Ϧu\u0016jկY\u001f^'\u001c.xvI˗\u0001ĝ:O\n֯R\u001fla\u0004wOB}ߝ?ތFKpǍZozl\u0007U9\u0005=۳)Ӗr-XȿY3[8+X\t<g֧rǨ\u0015\u007f\u001cݻv+D\u0013z)>Q:֭CքS[\u0015ċ\u007fw8mI0\u0001 TΦLȄ\b*\\ӏeGdZVd7^C܁*еbj0˯E\u00187\"\u0015~v`gӃ\u0007лv\u001elӵї\u001d\\"}, d2 = {"\u001anZ5g;I!ba\nm7l\u00166$]2\u0004K| \u001bQxc", "", "u(E", "\u0014NA\u001aR\f'1\u0003]ZX\u001a\\w", "", "\u0014Q0\u0014@\f'B\u0013^c<\u0016[h)S_\u0017", "\u0014Q0\u0014@\f'B\u0013^c<\u0016[h)S_\u0017u0mz", "\u0016DG,7\u0010 7\bl", "", "\u001e@B J\u0016+2\u0013^c<\u0016[h)S_\u0017", "\u001e@C\u0015R\u001a\u001e5\u0001^cM&\\q\rO^\bu.`\u0006", "\u001e@C\u0015R\u001a\u001e5\u0001^cM&\\q\rO^\bu.`\u0006\u00117\\q", "\u001fT4\u001fL&\u001c=\u0001idG\few)Eh\u0006e\u001f`\u0011\u0005'^", "\u001fT4\u001fL&\u001c=\u0001idG\few)Eh\u0006e\u001f`\u0011\u0005'^\b,c\t", "\u001fT4\u001fL&\u001c=\u0001idG\few)R_\bd\u001ejuvA]m+", "\u001fT4\u001fL&\u001e<vhY>&jh\u001e", "#R4\u001fA\b&3\u0013^c<\u0016[h)S_\u0017", "2dU.h3M>#\f\n", "", "AbW2`,", "5dc", "\u001anZ5g;I!ba\nm7l\u00166;", "CqX", "\u001aiPCTuGS(HjK\u0010R", "zcT=e,<O(~yX.|\u0018", "Cq[", "\u001aiPCTuGS(HjK\u0013R", ">`a@X", "zcT=e,<O(~yX7x\u0016=e", "1`]<a0<O \u0003\u0010^", ">nb", ":h\\6g", "3mR<W,,S(", "/ka2T+R3\"|\u0005],{", "", "Asa6V;", ">kd@<:,^\u0015|z", "CmX0b+>/ \u0006\u0005p,{", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "1`]<a0<O \u0003\u0010^j\u0007\u000f2t\u000f3", "7r?2e*>\\(^\u0004\\6{\t.", ">da0X5M2\u0019|\u0005],", ">da0X5M2\u0019|\u0005],;\u00135h\u000f7\u0007", "Bn7Ag7.` ", "Bn7Ag7.` h\bG<\u0004\u0010", "Bn?.g/,b&\u0003\u0004`", "", "", "=tc", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "Bn?.g/,b&\u0003\u0004`j\u0007\u000f2t\u000f3", "Bn@BX9R<\u0015\u0007zl\b\u0006\b a\u00078{N", "", "Bn@BX9R<\u0015\u0007zl\b\u0006\b a\u00078{N?!\u001dJ~\u001dG", "Bn@BX9RA(\f~g.", "Bn@BX9RA(\f~g.;\u00135h\u000f7\u0007", "EqXAX\n:\\#\b~\\(\u0004\rDe~", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "7m_Bg", "EqXAX\u0017>`\u0017~\u0004m\u000b|\u00079d\u007f'", "3mR<W,=", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, Charset charset, int i4, Object obj) {
            boolean z6 = z3;
            boolean z7 = z2;
            int length = i3;
            Charset charset2 = charset;
            boolean z8 = z4;
            int i5 = i2;
            if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
                i5 = 0;
            }
            if ((i4 + 2) - (i4 | 2) != 0) {
                length = str.length();
            }
            if ((i4 + 8) - (i4 | 8) != 0) {
                z7 = false;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
                z6 = false;
            }
            if ((i4 + 32) - (i4 | 32) != 0) {
                z8 = false;
            }
            boolean z9 = (-1) - (((-1) - i4) | ((-1) - 64)) == 0 ? z5 : false;
            if ((i4 + 128) - (i4 | 128) != 0) {
                charset2 = null;
            }
            return companion.canonicalize$okhttp(str, i5, length, str2, z7, z6, z8, z9, charset2);
        }

        private final boolean isPercentEncoded(String str, int i2, int i3) {
            int i4 = i2 + 2;
            return i4 < i3 && str.charAt(i2) == '%' && Util.parseHexDigit(str.charAt(i2 + 1)) != -1 && Util.parseHexDigit(str.charAt(i4)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i2, int i3, boolean z2, int i4, Object obj) {
            if ((i4 + 1) - (1 | i4) != 0) {
                i2 = 0;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
                i3 = str.length();
            }
            if ((i4 & 4) != 0) {
                z2 = false;
            }
            return companion.percentDecode$okhttp(str, i2, i3, z2);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0077 A[LOOP:1: B:102:0x0071->B:104:0x0077, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:106:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void writeCanonicalized(okio.Buffer r9, java.lang.String r10, int r11, int r12, java.lang.String r13, boolean r14, boolean r15, boolean r16, boolean r17, java.nio.charset.Charset r18) throws java.io.EOFException {
            /*
                r8 = this;
                r7 = 0
                r5 = r7
            L2:
                if (r11 >= r12) goto Lb3
                int r4 = r10.codePointAt(r11)
                if (r14 == 0) goto L21
                r0 = 9
                if (r4 == r0) goto L1a
                r0 = 10
                if (r4 == r0) goto L1a
                r0 = 12
                if (r4 == r0) goto L1a
                r0 = 13
                if (r4 != r0) goto L21
            L1a:
                r0 = r8
            L1b:
                int r0 = java.lang.Character.charCount(r4)
                int r11 = r11 + r0
                goto L2
            L21:
                r0 = 43
                if (r4 != r0) goto L32
                if (r16 == 0) goto L32
                if (r14 == 0) goto L2f
                java.lang.String r0 = "+"
            L2b:
                r9.writeUtf8(r0)
                goto L1a
            L2f:
                java.lang.String r0 = "%2B"
                goto L2b
            L32:
                r0 = 32
                r3 = 37
                if (r4 < r0) goto Lab
                r0 = 127(0x7f, float:1.78E-43)
                if (r4 == r0) goto Lab
                r0 = 128(0x80, float:1.8E-43)
                if (r4 < r0) goto L42
                if (r17 == 0) goto Lab
            L42:
                r6 = r13
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                char r2 = (char) r4
                r1 = 0
                r0 = 2
                boolean r0 = kotlin.text.StringsKt.contains$default(r6, r2, r1, r0, r7)
                if (r0 != 0) goto Lab
                if (r4 != r3) goto Lad
                if (r14 == 0) goto Lab
                if (r15 == 0) goto Lad
                r0 = r8
                boolean r0 = r8.isPercentEncoded(r10, r11, r12)
                if (r0 != 0) goto Lae
            L5b:
                if (r5 != 0) goto L62
                okio.Buffer r5 = new okio.Buffer
                r5.<init>()
            L62:
                r1 = r18
                if (r1 == 0) goto L6e
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                if (r0 == 0) goto La2
            L6e:
                r5.writeUtf8CodePoint(r4)
            L71:
                boolean r0 = r5.exhausted()
                if (r0 != 0) goto L1b
                byte r6 = r5.readByte()
                r0 = 255(0xff, float:3.57E-43)
                int r1 = r6 + r0
                r0 = r0 | r6
                int r1 = r1 - r0
                r9.writeByte(r3)
                char[] r2 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r1 = r1 >> 4
                r0 = 15
                r1 = r1 & r0
                char r0 = r2[r1]
                r9.writeByte(r0)
                char[] r2 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r1 = 15
                int r0 = r6 + r1
                r6 = r6 | r1
                int r0 = r0 - r6
                char r0 = r2[r0]
                r9.writeByte(r0)
                goto L71
            La2:
                int r0 = java.lang.Character.charCount(r4)
                int r0 = r0 + r11
                r5.writeString(r10, r11, r0, r1)
                goto L71
            Lab:
                r0 = r8
                goto L5b
            Lad:
                r0 = r8
            Lae:
                r9.writeUtf8CodePoint(r4)
                goto L1b
            Lb3:
                r0 = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(Buffer buffer, String str, int i2, int i3, boolean z2) {
            int i4;
            while (i2 < i3) {
                int iCodePointAt = str.codePointAt(i2);
                if (iCodePointAt == 37 && (i4 = i2 + 2) < i3) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i2 + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i4));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i2 += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((hexDigit << 4) + hexDigit2);
                        i2 = Character.charCount(iCodePointAt) + i4;
                    }
                } else if (iCodePointAt == 43 && z2) {
                    buffer.writeByte(32);
                    i2++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i2 += Character.charCount(iCodePointAt);
                }
            }
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_get */
        public final HttpUrl m10730deprecated_get(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return get(url);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_get */
        public final HttpUrl m10731deprecated_get(URI uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return get(uri);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_get */
        public final HttpUrl m10732deprecated_get(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return get(url);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_parse */
        public final HttpUrl m10733deprecated_parse(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return parse(url);
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x006c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String canonicalize$okhttp(java.lang.String r18, int r19, int r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25, java.nio.charset.Charset r26) throws java.io.EOFException {
            /*
                r17 = this;
                java.lang.String r0 = "<this>"
                r8 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "encodeSet"
                r11 = r21
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                r1 = r19
                r9 = r1
            L11:
                r10 = r20
                r2 = r17
                if (r9 >= r10) goto L70
                int r3 = r8.codePointAt(r9)
                r0 = 32
                r15 = r25
                r14 = r24
                r13 = r23
                r12 = r22
                if (r3 < r0) goto L6e
                r0 = 127(0x7f, float:1.78E-43)
                if (r3 == r0) goto L6e
                r0 = 128(0x80, float:1.8E-43)
                if (r3 < r0) goto L31
                if (r15 == 0) goto L6e
            L31:
                r7 = r11
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                char r6 = (char) r3
                r5 = 2
                r4 = 0
                r0 = 0
                boolean r0 = kotlin.text.StringsKt.contains$default(r7, r6, r0, r5, r4)
                if (r0 != 0) goto L6e
                r0 = 37
                if (r3 != r0) goto L6c
                if (r12 == 0) goto L6e
                if (r13 == 0) goto L6c
                r0 = r2
                boolean r0 = r2.isPercentEncoded(r8, r9, r10)
                if (r0 == 0) goto L53
            L4d:
                r0 = 43
                if (r3 != r0) goto L66
                if (r14 == 0) goto L66
            L53:
                okio.Buffer r7 = new okio.Buffer
                r7.<init>()
                r7.writeUtf8(r8, r1, r9)
                r6 = r2
                r16 = r26
                r6.writeCanonicalized(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r0 = r7.readUtf8()
                return r0
            L66:
                int r0 = java.lang.Character.charCount(r3)
                int r9 = r9 + r0
                goto L11
            L6c:
                r0 = r2
                goto L4d
            L6e:
                r0 = r2
                goto L53
            L70:
                r0 = r2
                java.lang.String r1 = r8.substring(r1, r10)
                java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.canonicalize$okhttp(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        @JvmStatic
        public final int defaultPort(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        @JvmStatic
        public final HttpUrl get(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        @JvmStatic
        public final HttpUrl get(URI uri) {
            Intrinsics.checkNotNullParameter(uri, "<this>");
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString()");
            return parse(string);
        }

        @JvmStatic
        public final HttpUrl get(URL url) {
            Intrinsics.checkNotNullParameter(url, "<this>");
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString()");
            return parse(string);
        }

        @JvmStatic
        public final HttpUrl parse(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i2, int i3, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            for (int i4 = i2; i4 < i3; i4++) {
                char cCharAt = str.charAt(i4);
                if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i2, i4);
                    writePercentDecoded(buffer, str, i4, i3, z2);
                    return buffer.readUtf8();
                }
            }
            String strSubstring = str.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                out.append('/');
                out.append(list.get(i2));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 <= str.length()) {
                String str2 = str;
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, Typography.amp, i2, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = str.length();
                }
                int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, '=', i2, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > iIndexOf$default) {
                    String strSubstring = str.substring(i2, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i2, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iIndexOf$default2 + 1, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i2 = iIndexOf$default + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, list.size()), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    out.append(Typography.amp);
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i2, List<String> pathSegments, List<String> list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i2;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = Intrinsics.areEqual(scheme, "https");
    }

    @JvmStatic
    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    @JvmStatic
    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    @JvmStatic
    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    @JvmStatic
    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    @JvmStatic
    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "encodedFragment", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_encodedFragment */
    public final String m10711deprecated_encodedFragment() {
        return encodedFragment();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "encodedPassword", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_encodedPassword */
    public final String m10712deprecated_encodedPassword() {
        return encodedPassword();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "encodedPath", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_encodedPath */
    public final String m10713deprecated_encodedPath() {
        return encodedPath();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "encodedPathSegments", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments */
    public final List<String> m10714deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "encodedQuery", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_encodedQuery */
    public final String m10715deprecated_encodedQuery() {
        return encodedQuery();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "encodedUsername", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_encodedUsername */
    public final String m10716deprecated_encodedUsername() {
        return encodedUsername();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = Request.JsonKeys.FRAGMENT, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_fragment */
    public final String m10717deprecated_fragment() {
        return this.fragment;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "host", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_host */
    public final String m10718deprecated_host() {
        return this.host;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = HintConstants.AUTOFILL_HINT_PASSWORD, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_password */
    public final String m10719deprecated_password() {
        return this.password;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "pathSegments", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_pathSegments */
    public final List<String> m10720deprecated_pathSegments() {
        return this.pathSegments;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "pathSize", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_pathSize */
    public final int m10721deprecated_pathSize() {
        return pathSize();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = ClientCookie.PORT_ATTR, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_port */
    public final int m10722deprecated_port() {
        return this.port;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = SearchIntents.EXTRA_QUERY, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_query */
    public final String m10723deprecated_query() {
        return query();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "queryParameterNames", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_queryParameterNames */
    public final Set<String> m10724deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "querySize", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_querySize */
    public final int m10725deprecated_querySize() {
        return querySize();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "scheme", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_scheme */
    public final String m10726deprecated_scheme() {
        return this.scheme;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018[7ob\u001es\u0017", replaceWith = @ReplaceWith(expression = "toUri()", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_uri */
    public final URI m10727deprecated_uri() {
        return uri();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018[7ob!s\u0017", replaceWith = @ReplaceWith(expression = "toUrl()", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_url */
    public final URL m10728deprecated_url() {
        return url();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "username", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_username */
    public final String m10729deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(StringsKt.indexOf$default((CharSequence) this.url, '#', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        String strSubstring = this.url.substring(StringsKt.indexOf$default((CharSequence) this.url, AbstractJsonLexerKt.COLON, this.scheme.length() + 3, false, 4, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) this.url, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedPath() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        String strSubstring = this.url.substring(iIndexOf$default, Util.delimiterOffset(str, "?#", iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List<String> encodedPathSegments() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iDelimiterOffset) {
            int i2 = iIndexOf$default + 1;
            iIndexOf$default = Util.delimiterOffset(this.url, '/', i2, iDelimiterOffset);
            String strSubstring = this.url.substring(i2, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.url, '?', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iIndexOf$default, Util.delimiterOffset(str, '#', iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && Intrinsics.areEqual(((HttpUrl) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final Builder newBuilder(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, list.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(name, this.queryNamesAndValues.get(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return this.queryNamesAndValues.get(first + 1);
        }
        return null;
    }

    public final String queryParameterName(int i2) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i2 * 2);
        Intrinsics.checkNotNull(str);
        return str;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return SetsKt.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                String str = this.queryNamesAndValues.get(first);
                Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final String queryParameterValue(int i2) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i2 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.queryNamesAndValues == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (Intrinsics.areEqual(name, this.queryNamesAndValues.get(first))) {
                    arrayList.add(this.queryNamesAndValues.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        Intrinsics.checkNotNull(builderNewBuilder);
        return builderNewBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        Builder builderNewBuilder = newBuilder(link);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String username() {
        return this.username;
    }
}
