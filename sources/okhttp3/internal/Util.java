package okhttp3.internal;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Sink;
import okio.Source;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĿ\u0015D߬)\u001ew\u0010L܀kt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8D{H6ɟ[*%k\u0004é,[:qKП]\u001a\f+\u0011ѧVguzRZ\u0011C\u0017\u0006$~r,OU\u0001] \u0016:ԏw?IMwމA`\u00036\r 8%@y\u0013\u0010\"*VƵ~zIL\u0014\u0012F@xíZ\r[#\"\u0012\fC(\u00014\\oN<It]P/+\u0003oDV'mO\u0005M\u0013G\\'\u001byiӜ3@E=\u001dǬ[\u0003\u001dRc?\u0019?y=\u000bj/'AI{W<X\b\u0014++W\rsr.\\\u001bQh\f-.WcYZ\u0016(}|\u0004\rR\u0004\u0016\u0006-I6-(\u0001\u0010Ԅ;t\tSHP\u0018^J\u007f\u0001a>\u0017;\u007f;+?\u001bnQw;!N=\u0003\r\r4#\t͙)[j\u000eh\u0015!T\u007fQGQH=NQ\u0012YSm\fph\u00032\u0004FG\b/\u0002\u00116\u0017;7c9)%s\u0002Vfov\u000bfpSwSP@8n\u001e7@\t\u0014ZJd\rkfT`,\u0017M4r\u0015\u000f \u0013Nn(@/8(N}w\u001an[q\"%]{g_|\u0002&YO]aLi\u007f\u001eyjvBXlf\u0013r~B\u0002!\u000b`6=JH\u0019%(\u007fRj$\u0013`T\nABII\u0019\u000b$x\u0007,_Y|7n\u000bx\u001e\u001dl;4\u0007o#\u0005\t/p\u000b\u0010\u0010g'iض\u0001`0NYiC;>UP\u0002d\u00071*\u0017y\u0010IwLue\u001b:<ɤ\u0002Ć\u0015֝Q|=b+\u0015\u000f+B\u0002slz\u0019\u0006SSȼ5\"-\n\u001dc\u00016w\fpo<`1q}s7\"=\u00069(ϋh\u007f\b\u000b^\u0007U\u000el\u000b\nKyv\u0011lTNf\f\u001dN,P\u0019q8{{Tc)#ȶ\u0006;_\u0019o\n\u0002o\\\u001a\u0013\u00194\"}\n<e&o)x\f`k<W\t\u0017>P3к\u0007BV\u001b\u0010\u001cP:L\razqh~iPM9>.j\u0015_%p\u0005hR3}2L.\u000eC$G\f'vCS }]u\u0011\u0006Ql\rZ\u000f8$*U5ܥ\"\u07b4\u001f݈o\u0006\u0017e\u001esFOa=hŝJ?L:<>\u0018\u000b\n\u000b\u0018=@~\u000e~w\u000f]h\tƽŌZ\u000eb2tiV?xE\u000f3R\u0001-Jc\"\u0007qI\u0005\u001cX\u001bЖeJ\u0014aW!\u001b\u0019d'fS=tXGW@X/ \fؖEa\u0015D>_)\u001c}\u0018\ffU-!PT39\u007f#&ۂ2v\u0013c#fd%Q\u000fR|bA\n\t>&<8(3\u0019}\u00136ۯ3dY\u0006y[\u001a/0l)5,CݮL35\u0014xE=ww<'*fkK\fL8 U\u0011\u001d!\u000b\u001d>j\u0018$3:D7.j\u0010P+PN\u001dVJ#;\"6\u0016}g\u0002a\u001b;^\b5\u0010)NnCl4[sh'T{\u000eq:m\u0011\u0013hAV(}[oE\u000f7O>\u0013\u0007ih0\u0004$f]\u0018\u0014C5̢:\bpv(sq7\tk}m5+]zZe?\u007fj\u001e,o*{\n*by-;\u0005_nj\u000f\\z\u0015o\u000e\r|@\t\u0003ZA\u0014+\u0011p^?\"dJ\u0001q|/e(Oa\u0013GnX\u001cEw8Q7X?)\nJ\u000b\u001e:\u000f)\u0011\u000fzt.7j\t!U\u00180;\u001dl=H9\n({<\u001b&y\\P{\u0016\u0005)\u0014!1j8fe\u000b@<=W߂O@9\u0007%:\u0016oM@cD\u0002h3\u0005\u0019\u000e\u0011\u000fOyw\u0013JuGrQ<=K\u0088[fA\u0002{֔Rܷ\u000b\u058b}}\r+{V=nTOEG.y\u0004O.)O02L\u000e+\u0010GAHXnr?\u0005\u0013\b\u00104\tNvT'M؝\ts8;\u0018wŘh[o\u0015Y\u0003\"z\\>XB\u0015\u0007s0\u0001#\u0019(%EBI7\f95'|>^ _[M\u0001\u001aG\\\fKC}\u0012\u0019JgF{W@\b94\r½XcxO\u0006YmuP\u0012;\u001f,w_ax\u001cn\u00040'y\tn6\u000b\b}Gh\u000bN`<^\\T<\u0011\f\u0016<\u001b/\u0002,\\x1!\u001b_soY:V*0M\u0017a%\u0014v\u007fjuQ\u0006w^=G\u0006#mxjMwjmm!yvS\u0015.y[4MVLkBX4 ]\u001cVy\\~T*}0^?~\u001e\u0003Im\u0003,\u001fkdC\u0005/<p}sj!-GW\u001da\u0004B]\u0005\u0010a(I)\u0017\u0011̻c9`2\"lжB{\u0016Gae\u000bYa\u00101nr!]ro3O9\u0005V\u0014.1gMn$ U1.\u0013R-\u0018\u0017w~:_1>Na7;cY?\u007fjj=\u001b;ޢ4$CcyU\u0006?{D5i\u007f\u0007ځ4\t\u0011UD\u0003{Xw\u0018f#*eM9k1>_\u00019c}*,~_Sp>EON@AsJ!4Z\u0014HW(/]qg\u0003s\u0003r9Yb]Ht\bm~dluf<vhIj]z3Qr\u001e!x~CY\u0010\u0011yT'd\u001e\u001b\u001d\u000f\u0015caE&gH\u0005z\u007f3h9y1a[=NZ\t\u001ek\u0010߀\u0014*\u0004[6;pD\r#ѡ=~r2m-T@\u0007{0`ՌYnBEc5оg *<\u001b%\u0005Z\u0001k[_\u0381\u001e\u000bd-2F\u001aolQ[/ˎ\u00021<6AuX)4\tc+.\nݥ\u001e*B*B\u0005\\\u0002ڈ2ow_6m\u001eo%\u0018\u001e@\u000fqԷ\u0012\u000br)_kr\u0011$U{\u001e\u001f\u000fJմ@\u001a\u00192,4\t[ֻ\u0001X7Z3hӀ\u007f=գ\u0017jitݰ3ߘd,2zt\u001cټlf\u0003v`w5\bǸTm\u0002U.uʡ\u0007yɝl\u0017=UؑH.:}a\u0016u\nL\u0005\u001b@Κn\u001c1>\txoPƹv bb}b}]\u0002By{3(ˈe\u0007l%by-Kӷ\f,\u0005l\u0003Q#n4\u0010fm\u007fIZ\t\u001decuj\u0011D\u001fzx2l$'Tfл\r3\u00023d\r\u001aDY\f߅Fc:i߾f{RPٺG\u0014.]ޒv~7{ב4i\u001e\u0002Ϲ]Msn\u0011e)<ޠm8\tPȪ1u\u0004r3=ؖ\u0007&J\u0015ex\u000eo؋k^{\u0005ܺ\u0016W\u00150<e0+ۻ}\u0019\u0016\u0004lp\u0012˭jǒhz&ɮ{i50\u0016\u0006O\u0014w#l̾&Ԃ\u0004tcʑo\u0004\u000fB`\u0013:\u001dy2^é\u0007\u0087P\u0005=Ǫa?MW\t\u0019Y|\u0016b\u0019Ѳ\u000fۚ%(\u0013ěHmz\u0019\b\u0015V)\u001aׇx˗q\t\u0018\u008fi3\u00175iv)#h\u0014vڞ\u0012њ\u000e\u0013jƏ\u0018\f/SH0\"\u0014$ղo߱2jwȈ\u0018l\u001e[\n<\f\f.ñ\u001c̰\u0012˂V;\u001c\u07b5|R5i@DE\u001dTѲ\u0001Ɓ4Ҷr0#Ֆ\t\n}\u0007jb@o\u000bΌ\bӒD53Ĵխ&\u0006\t\f)Ʈ[B=ІYܟc"}, d2 = {"\u0013L?!L&\u001bG\b^t:\u0019id#", "", "\u0013L?!L&!3t]ZK\u001a", "\u001anZ5g;I!bazZ+|\u0016=;", "\u0013L?!L&+3\u0005nZL\u001b", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "\u0013L?!L&+3\u0007idG\u001a\\", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "#M8\u0010B\u000b\u001eMuhbL", "\u001anZ6bu(^(\u0003\u0005g:R", "#S2", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t$o\t(Q", "$DA\u00169 8/\u0007x^I&Xg\u000eR_\u0016i", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "/rb2e;B]\"\rZg(y\u0010/d", "", "=j7Ag7'O!~", "", "CrT?4.>\\(", "1gT0^\u000bN`\u0015\u000e~h5", "", "<`\\2", "2ta.g0H\\", "", "CmXA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "1gT0^\u0016?T'~\n:5{f9u\t7", "", "/qa.l\u0013>\\\u001b\u000e}", "=eU@X;", "1nd;g", "4na:T;", "/qV@", "", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u0011*@gE\u001a^o]B\t-\u001a]\u0004+PN$", "7f]<e,\"]x\u0012x^7\f\r9n\u000e", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "7l\\Bg(;Z\u0019e~l;f\n", "", "\"", "3kT:X5Ma", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWL\u0006)<#d$E|k", "7rB2a:Bb\u001d\u0010zA,x\b/r", "@dP190>Z\u0018h\bG<\u0004\u0010", "7mbAT5<S", "4hT9W\u001bR^\u0019", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "4hT9W\u0015:[\u0019", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u0013`y.EC|3IT75;\u001a\u001ej+'\u0016p0Wx|\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "Bga2T+\u001fO\u0017\u000e\u0005k@", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001aTo\n;W!3h\b-KC", "2`T:b5", "Bga2T+'O!~", "/cS\u0016Y\b;a\u0019\b\n", "\u0013", "", "3kT:X5M", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006`\":Y{/\r1\u0007", "/mS", "", ";`b8", "", "/r5.V;H`-", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000eUwCm\u001dF\u00049\u000b", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000el", "/rb2e;-V&~v]\u000b\u0007\t=n\u000f\u000b\u0006G\u007f}!Eu", "/rb2e;-V&~v]\u000f\u0007\u0010.sf2yF", "1`]\u001dT9LSt\r^i\b{\b<e\u000e6", "1`]\u001fX<LSv\t\u0004g,z\u00183o\t\t\u0006M", "\u001anZ5g;I!ba\nm7l\u00166;", "=sW2e", "1k^@X\u0018NW\u0019\u000e\u0002r", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "\u001aiPCTuGS(Hh^9\u000e\t<S\n&\u0002@\u0010l", "\u001aiPCTuGS(Hhh*\u0003\t>;", "1n]0T;", "D`[BX", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00119\"p0/\u00112h5\u0010eu<\u00064KUP\u0002", "2d[6`0MS&h{_:|\u0018", "2d[6`0MS&", "", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "2d[6`0MS&\r", "2hb0T9=", "\u001anZ6bu,])\fx^\u0002", "Bh\\2b<M", "Bh\\2H5Bb", "4h[AX9%W'\u000e", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "6`b\u0016a;>`'~xm0\u0007\u0012", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q6g\u001c\u0013XkWCr.7#k/Dq\u001f0#*@gE\u001a^xp=\u000e-\nX~2CYJ;f_H\u0001\t", "6dP1X9L1#\b\n^5\fo/n\u00027~", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "7mS2k\u0016?", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g%we@PA6V\u0002#TH]6i(6!", "7mS2k\u0016?1#\b\nk6\u0004r<N\n1WN~\u001b\u001b", "7mS2k\u0016?4\u001d\f\tm\u0015\u0007\u0012\u000bs},\u007f2\u0004\u001b&G}\u00198t%", "7mS2k\u0016?:\u0015\r\nG6\u0006d=c\u0004,mC\u0005&\u0017Uz\n:v", "7mS2k\u0016?<#\bla0\f\t=p{&{", "7mc2e:>Q(", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q6g\u001c\u0013XkWCr.7#k/Dq\u001f0#*@gE\u001a^xp=\u000e-\nX~2CYJ;f_H\u0001\nx_\n_'V\fUJ&82F,\f5KW", "7r26i0EW.~y", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI,\u0006\na\u001b\u001eG]\"J\u0006%=/", "4h[2", "\u001aiPCTuB]b_~e,R", "7r72T3MV-", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "<nc6Y@", "<nc6Y@\u001aZ ", ">`a@X\u000f>fw\u0003|b;", ">dT?A(FS", "@dP156F/'\\}Z9\u000b\t>", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "2dU.h3M", "@dP1@,=W)\u0007", "AjX=43E", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", AdkSettings.PLATFORM_TYPE_MOBILE, "Bn72T+>`\u007f\u0003\tm", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", "Bn72T+>`'", "Bn72k\u001aM`\u001d\b|", "Bn7<f;!S\u0015}zk", "7mR9h+>2\u0019\u007fvn3\fs9r\u000f", "Bn8:`<MO\u0016\u0006zE0\u000b\u0018", "Bn8:`<MO\u0016\u0006zF(\b", "", "\u0019", "$", "Bn;<a.(`w~{Z<\u0004\u0018", "2dU.h3MD\u0015\u0006\u000b^", "Bn=<a\u0015>U\u0015\u000e~o,`\u0012>", "BqX:F<;a(\f~g.", "E`XA", "Ehc5F<I^&~\tl,{", "", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "At_=e,La\u0019}", "EqXAX\u0014>R\u001d\u000f\u0003", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", ";dS6h4", "=jWAg7"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    public static final TimeZone UTC;
    private static final Regex VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.12.0";
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    private static final Options UNICODE_BOMS = Options.Companion.of(ByteString.Companion.decodeHex("efbbbf"), ByteString.Companion.decodeHex("feff"), ByteString.Companion.decodeHex("fffe"), ByteString.Companion.decodeHex("0000ffff"), ByteString.Companion.decodeHex("ffff0000"));

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        okHttpName = StringsKt.removeSuffix(StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static final <E> void addIfAbsent(List<E> list, E e2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(e2)) {
            return;
        }
        list.add(e2);
    }

    public static final int and(byte b2, int i2) {
        return (b2 + i2) - (b2 | i2);
    }

    public static final int and(short s2, int i2) {
        return (s2 + i2) - (s2 | i2);
    }

    public static final long and(int i2, long j2) {
        return ((long) i2) & j2;
    }

    public static final EventListener.Factory asFactory(final EventListener eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "<this>");
        return new EventListener.Factory() { // from class: okhttp3.internal.Util$$ExternalSyntheticLambda0
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                return Util.asFactory$lambda$8(eventListener, call);
            }
        };
    }

    public static final EventListener asFactory$lambda$8(EventListener this_asFactory, Call it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (assertionsEnabled && !Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
        }
    }

    public static final boolean canParseAsIpAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.matches(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl other) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(httpUrl.host(), other.host()) && httpUrl.port() == other.port() && Intrinsics.areEqual(httpUrl.scheme(), other.scheme());
    }

    public static final int checkDuration(String name, long j2, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j2 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j2);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j2 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void checkOffsetAndCount(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        Intrinsics.checkNotNullParameter(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!Intrinsics.areEqual(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[ArraysKt.getLastIndex(strArr2)] = value;
        return strArr2;
    }

    public static final int delimiterOffset(String str, char c2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int delimiterOffset(String str, String delimiters, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i2 < i3) {
            if (StringsKt.contains$default((CharSequence) delimiters, str.charAt(i2), false, 2, (Object) null)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c2, int i2, int i3, int i4, Object obj) {
        if ((2 & i4) != 0) {
            i2 = 0;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i3 = str.length();
        }
        return delimiterOffset(str, c2, i2, i3);
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i2, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return delimiterOffset(str, str2, i2, i3);
    }

    public static final boolean discard(Source source, int i2, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return skipAll(source, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayListEmptyList = CollectionsKt.emptyList();
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                if (arrayListEmptyList.isEmpty()) {
                    arrayListEmptyList = new ArrayList();
                }
                Intrinsics.checkNotNull(arrayListEmptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                TypeIntrinsics.asMutableList(arrayListEmptyList).add(t2);
            }
        }
        return arrayListEmptyList;
    }

    public static final String format(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator it = ArrayIteratorKt.iterator(strArr2);
                while (it.hasNext()) {
                    if (comparator.compare(str, (String) it.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int indexOf(String[] strArr, String value, Comparator<String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], value) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i2, i3);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i4 = i3 - 1;
        if (i2 <= i4) {
            while (true) {
                char cCharAt = str.charAt(i4);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4--;
            }
        }
        return i2;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i2, int i3, int i4, Object obj) {
        if ((1 & i4) != 0) {
            i2 = 0;
        }
        if ((i4 + 2) - (i4 | 2) != 0) {
            i3 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i2, i3);
    }

    public static final int indexOfNonWhitespace(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        return indexOfNonWhitespace(str, i2);
    }

    public static final String[] intersect(String[] strArr, String[] other, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        Sink sink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                CloseableKt.closeFinally(sink, null);
                return true;
            } catch (IOException unused) {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(sink, null);
                fileSystem.delete(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean isHealthy(Socket socket, BufferedSource source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z2 = !source.exhausted();
                socket.setSoTimeout(soTimeout);
                return z2;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.equals(name, "Authorization", true) || StringsKt.equals(name, "Cookie", true) || StringsKt.equals(name, "Proxy-Authorization", true) || StringsKt.equals(name, "Set-Cookie", true);
    }

    public static final void notify(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final String peerName(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        Intrinsics.checkNotNullExpressionValue(hostName, "address.hostName");
        return hostName;
    }

    public static final Charset readBomAsCharset(BufferedSource bufferedSource, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iSelect = bufferedSource.select(UNICODE_BOMS);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iSelect == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iSelect == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iSelect == 3) {
            return Charsets.INSTANCE.UTF32_BE();
        }
        if (iSelect == 4) {
            return Charsets.INSTANCE.UTF32_LE();
        }
        throw new AssertionError();
    }

    public static final <T> T readFieldOrNull(Object instance, Class<T> fieldType, String fieldName) throws IllegalAccessException {
        T tCast;
        Object fieldOrNull;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Class<?> superclass = instance.getClass();
        while (true) {
            tCast = null;
            if (Intrinsics.areEqual(superclass, Object.class)) {
                if (Intrinsics.areEqual(fieldName, "delegate") || (fieldOrNull = readFieldOrNull(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, fieldType, fieldName);
            }
            try {
                Field declaredField = superclass.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(instance);
                if (!fieldType.isInstance(obj)) {
                    break;
                }
                tCast = fieldType.cast(obj);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                Intrinsics.checkNotNullExpressionValue(superclass, "c.superclass");
            }
        }
        return tCast;
    }

    public static final int readMedium(BufferedSource bufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        int iAnd = (and(bufferedSource.readByte(), 255) << 16) | (and(bufferedSource.readByte(), 255) << 8);
        int iAnd2 = and(bufferedSource.readByte(), 255);
        return (iAnd2 + iAnd) - (iAnd2 & iAnd);
    }

    public static final int skipAll(Buffer buffer, byte b2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        int i2 = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b2) {
            i2++;
            buffer.readByte();
        }
        return i2;
    }

    public static final boolean skipAll(Source source, int i2, TimeUnit timeUnit) throws IOException {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = source.timeout().hasDeadline() ? source.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i2)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(final String name, final boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: okhttp3.internal.Util$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.threadFactory$lambda$1(name, z2, runnable);
            }
        };
    }

    public static final Thread threadFactory$lambda$1(String name, boolean z2, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z2);
        return thread;
    }

    public static final void threadName(String name, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        threadCurrentThread.setName(name);
        try {
            block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            threadCurrentThread.setName(name2);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        IntRange intRangeUntil = RangesKt.until(0, headers.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new Header(headers.name(iNextInt), headers.value(iNextInt)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().utf8(), header.component2().utf8());
        }
        return builder.build();
    }

    public static final String toHexString(int i2) {
        String hexString = Integer.toHexString(i2);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHexString(long j2) {
        String hexString = Long.toHexString(j2);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z2) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        String strHost = StringsKt.contains$default((CharSequence) httpUrl.host(), (CharSequence) Global.COLON, false, 2, (Object) null) ? "[" + httpUrl.host() + AbstractJsonLexerKt.END_LIST : httpUrl.host();
        return (z2 || httpUrl.port() != HttpUrl.Companion.defaultPort(httpUrl.scheme())) ? strHost + AbstractJsonLexerKt.COLON + httpUrl.port() : strHost;
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = false;
        }
        return toHostHeader(httpUrl, z2);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    public static final int toNonNegativeInt(String str, int i2) {
        if (str != null) {
            try {
                long j2 = Long.parseLong(str);
                if (j2 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j2 < 0) {
                    return 0;
                }
                return (int) j2;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    public static final String trimSubstring(String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i2, i3);
        String strSubstring = str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i3));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = str.length();
        }
        return trimSubstring(str, i2, i3);
    }

    public static final void wait(Object obj) throws InterruptedException {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> suppressed) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(BufferedSink bufferedSink, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        bufferedSink.writeByte((i2 >>> 16) & 255);
        int i3 = i2 >>> 8;
        bufferedSink.writeByte((i3 + 255) - (i3 | 255));
        bufferedSink.writeByte((i2 + 255) - (i2 | 255));
    }
}
