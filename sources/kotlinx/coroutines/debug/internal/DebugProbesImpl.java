package kotlinx.coroutines.debug.internal;

import _COROUTINE.ArtificialStackFrames;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.dynatrace.android.agent.Global;
import com.facebook.common.callercontext.ContextChain;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яř\u0014D57\u001eq\u007fR܀kt\nB\u000e0!.Jչ*,(w\u000f߿r9FDm߉6Ri*\u0017k\u00124,[2zKП]\u001a\fB\u0011OThon`Z\u0013C\u0015\b\u001ex\u0001,QU~f\u001a\u000fHBw?AMw=?`|6\u001b :\"Ny\r\u0001 /P\u0010\u0005\u0007Kŷ\u0014\u0012F@x:X\u000eU\u0005(4\u000ē(\u00014\\oNLHt]@5+\u0003w`V'e0\u0005M#F\\'#viӜ3@ED\u001d%Y\u0004\u000fRq?\u000b?w>\rh='3IyW>X\u0016\u0014\u001d+U\u0015er<\\\rQn\u0012/+UiSP$(\u007fz\u0002\u0017D\u0004$\u0006/H4.\"f\u0016\u000f;txWFђ\u0002tۍ0z\u00105O$}s2?\u001bƻUcA\u0019\\8D\u0019\u001bB;\u000f~#kT<k%\u001ddw\u007fTg?kj\u0015\n\"H{,\tb0MJ\u0382Ͻ\u0004/\u0002:v\"3as9QD2ȵҩHg|0)na\u0016jHnE5\u0016\u007f0\u00179rD\u0013(2P\u001dk:?e\u001c\u00036.\f!PtwjRkīʽSho\u001d\u0016\u0015\u0018XGfe|\u0017k<\tinAiio cbvBpLd\u0015X\u0015i\u0002A\u000bd6XJL\u0019H`{#\u0006<\u0017@x\n\u001cb[w\u0019Å\u0019H\u0011X\u000bx\u000bIw`x\u0012\u000fTyf1+Dz\u000fɖ^\u001f\u0019o\u0016wyH\u0003b0pYgE\u001f6Y2h:}Q\u0011\u000fu\u0010G\u0016\u0012WN|\u0016<\u0018*d\\֠?\u001a>KY'\u000594\u0012-sK!-˛Q\u00125CE\u0006\u001d\u0005\u0001.\u00167\u001bt:+\u0003J} _,\u0005+\u000b#6\u0014(y\u0010EAG,^\u0019)VO\u0003\u0005i<|\u0004+Fg(3O\b(\r7=CUlD9\\=#2ui\u001eQ*f\u001dw\re2~*\u00158p_1J;fT\u0002\u0003N\"*m1L\u000fj@\u0016P]L\rakqh~(PM9\u0002DfOH\u001bFn[h6 \u0002B\u007fw*\"\u0016.\u001el\u001a=\u0017]Uwm\u001cN\u000bL\u0011\u000fR+\n\t\u0007\u0018,?0V\u0006e7q6w&\u0001Y;\u0011Pl\u00132\rDB\u0018\rST\u0018\t><Hrmh/8RuKV<W'\u001e\u0007L\u0013;]`OY1\u0005\u001d\u000f6zK03tv^=<J\u0007c\u001f\u0019\u001b\u0019R-(k+\r\u0010Gw@d\u0011\rU]q(\u00128\u0014GWL\u001aM<<&\\5BFyi[\u001f@\u000f6n\red|g%Y\u0017\\\\zA\u0005\u000b~\u001e<8\u00129Z\u0016rƚf-Z0@fQ|\u0019\u0017r\b7\u0010\u000bG^\u001b[de7K*\u0003\u001a7}gSi\u00016gP1\u0012M9bg\u0010v\n\f\u001ehW8\u0016ȫ\u0006\t!5h\u001b<0\rr8Q8>]hK\u0006#^_l&\t\u0007ӏ߿p\u0006H41\u0010\u0018M\u0005c\u001dx;\u000bt\u0018n}~-V\u001e7\u000f\u0014ܘ \\Z@{\u001c:f|\u0018\u0014CIO>\u0016IA\u0014_cnq\u001a7\f\u00119\n\u0004*\u0010`vRf\u0014-f\u000e\u0004XwX\u0019I=e>\u0013/\rpP2&^\u0019W+tT6\"j\u0017Jt\u0010AZnrL\u000buб'g\u0002\u001b3x\u00072hy./ jC+78\f\u001e2'\u0019\u0011!zx\u0010*H\n!g\u00180;!l=HV $6x\u0011\u0015cKHB\u000e-'\r?9\u0003<0>b\u001bJ#\u00183\n*\u001fo->\u0016o\r\u001aKi\u007f]M*/#G\u0090MBVy*\f=\u0003%?\u000f6\f\u0006N[';֍Z\u0018<\fs<\u0017SsX\u001far:c-d\u0099ߝD\u007f\u0010\u0012l4\u0014i;\u007fs&p0o^PV\"Z2gp67n1=\u0005~\u0004\f<i^d\u0013C\u00026Gʯ\"\ntH8\u001f\u0005\rUOxyQ5;-D=\u001dlA5-{>D8@s[\u0001DG\\\f_C{\u0012)JeFyMA\b4L-Zwqb\u0003saa 8@\u0010;E\u00187Xϒ\u000eQE\u0018UD'JDV\u0011M\bSQ@Ǧ(^<=\\\u0017\u0014\u0018FHE\u0005T߂bū\u00173Oؓ\u0012S Z\u0014!K\u00162ܬ\bɚkjOʤ&\u007ffCQ5!lx_\fƹh֓Y!S\u07bd{1\u000erC>W\\N\u001e:X\f\u000fsnX\u0012Txr3\u001c9\u0007ߦRڧ^Ceӝl;Ka-o\u000f8r;kd\u0017,ea\u001d_\fc\u0004ҿ\u0004К\u0014E1\u0015\u0011,aH\u0003*\u0002\u001dI>*\u00193ŶWM|W\"\u001bax,eKܽ3Ecn\\xM-(F\r!8'R\u001ciڤd8+w%:_1W\r̆5ےOe\u0019ޯZl\u0015\u0013\u0003 N\u000e>n\u0014WV)p7M;\u000eK\u0003ȩ|ŇK[rɸBgu\u0003\u0003mmG1\u0013'X\u0002\n\u001f\u0002g_By(ƈdƦ\u001bc.ċ+\u0004 <4u\u001cJ/P%o4\bx\u0015ln![Dk^o\ntvdl\u0007T;v\u000foʣQʪ\u001fQLϾYx~mY\u001crn<'dnz\u001b\u0011\u0001y\tE\u001d\u000eݱxƛk3Bɉ2>a\u0019=Gx56j\u0010)K<4ը8Ɗs6\r\u0017\u000bzt0\u001cn\u000b\f>C<E@Br@J8\u0003'\u001ck>jd۫~۶0rkTWq-oյ\u0003Ӿ\u001d"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001L\u0016+]E&x>\u001b\u0015vEA\u0012j\u0002", "", "\nh]6g\u0005", "u(E", "\u000fQC\u00169\u0010\u001c7tet?\u0019Xp\u000f", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", "2`c296K[\u0015\u000e", "\u001aiPCTuMS,\u000eDL0\u0005\u00146e^$\u000b@a!$Ok\u001d\u0012", "EdP8E,?1 ~vg,\nw2r\u007f$z", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "1`_Ah9>Rv\t\bh<\f\r8e\u000e\u0010wK", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001K 7KSHx4'$Za5\rK(YL", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001L\u0016+]E&x>\u001b\u0015vEA\u0012jj,\u00014Q\\]0eR\\O\u001d\u0012gc", "", "1`_Ah9>Rv\t\bh<\f\r8e\u000e", "", "5dc\u0010T7Mc&~y<6\n\u0013?t\u00041{N", "u(;7T=:\u001d)\u000e~euj\t>;", "7mbAT3EO(\u0003\u0005g:", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "7r8;f;:Z ~y", "7r8;f;:Z ~y\u001d2\u0007\u00186i\t;u>\u000b$!W~\u0012Ev3/X}\u001dGo", "u(I", "Ad`BX5<S\u0002\u000f\u0003[,\n", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015.y\u0017>L", "A`]6g0SS\u0007\u000ev\\2k\u0016+c\u007f6", "5dc T5Bb\u001d\u0014zL;x\u00075T\r$y@\u000fU\u001dQ~\u0015@\u007f8/W\b-A}%2VCIe2(\"h", "Adc T5Bb\u001d\u0014zL;x\u00075T\r$y@\u000fU\u001dQ~\u0015@\u007f8/W\b-A}%2VCIe2(\"h", "uY\u0018#", "3mP/_,\u001c`\u0019z\nb6\u0006v>a}.jM|\u0015\u0017U", "5dc\u0012a(;Z\u0019\\\b^(\f\r9nm7w>\u0007\u0006$Cm\u000eJ5+?h\u0005$@\u0001\u0010,WPE{C\"\u001eho3\u0005m9N", "Adc\u0012a(;Z\u0019\\\b^(\f\r9nm7w>\u0007\u0006$Cm\u000eJ5+?h\u0005$@\u0001\u0010,WPE{C\"\u001eho3\u0005m9N", "7f]<e,\u001c]&\t\u000bm0\u0006\t=W\u00047~ \t\"&[M\u0018E\u0006%Hh", "5dc\u0016Z5H`\u0019\\\u0005k6\r\u00183n\u007f6mD\u0010\u001avOz\u001dPT/>h}3F", "Adc\u0016Z5H`\u0019\\\u0005k6\r\u00183n\u007f6mD\u0010\u001avOz\u001dPT/>h}3F", "2x].`0</(\u000ev\\/", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "5dc\u0011l5:[\u001d|Vm;x\u00072", "1`[9X9\"\\\u001a\tXZ*\u007f\t", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eq\u0001Q\t`\u001bP~\u000eI\u007f!<#[*Dw&=QL;YC\u001a\u0013nBF\u0003k,$", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001L\u0016+]E\u0019uA(%weB\u0007G5O\u0001\u000bOWU\u0002", "7mbAT3E", "7mbAT3E\u0012\u001f\t\ne0\u0006\u001c)c\n5\u0006P\u0010\u001b G}\b:\u000125", "CmX;f;:Z ", "CmX;f;:Z =\u0001h;\u0004\r8xy&\u0006M\u000b'&Kx\u000eJp#?f}", "AsP?g\u001e>O\u001fkz_\n\u0004\t+n\u007f5jC\u000e\u0017\u0013F", "As^=J,:Y\u0006~{<3|\u00058e\r\u0017~M\u0001\u0013\u0016", "6hT?T9<V-m\u0005L;\n\r8g", "", "8nQ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "6hT?T9<V-m\u0005L;\n\r8g>.\u0006O\b\u001b Zi\fF\u0004/Eh\u0002)7{\u0010,WP;", "0tX9W", ";`_", "", "0tX9W,K", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "7mS2a;", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\ne!\u0014\u001dV\u00138\b!~i\r$>7}*X\u0019\"p0/\u00112h5\u0010eu<\u00064KUP\tlVy<\u0014\u001f0tS'\u001e\u0001#H wF\u0001\r\u00179M\u000b=>D|", "2dQBZ\u001aM`\u001d\b|", "5dc\u0011X)NU\u0007\u000e\bb5~G+n\t2\u000b<\u0010\u001b!P}", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\ne!\u0014\u001d3~", "5dc\u0011X)NU\u0007\u000e\bb5~", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\ne!\u0014\u001d3tAr61#\u0005\u001c@o_\u001c\\P?t6s", "2t\\=66K])\u000e~g,\u000bl8f\n\f\u0004K\b", "", Global.BLANK, "1qT.g,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "2t\\=66K])\u000e~g,\u000bl8f\n\u0004\n%\u000f! #x\r)v&5f})5m$", "", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "3mW.a*>A(zxd\u001b\n\u0005-eq,\u000bCo\u001a$Gk\r\u001b\u0007-@5\f\u0005Ew\u001f", "7mU<", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001L\u0016+]E\u0019uA(%weB\u0007G5O\u0001|", "BnBAe0GU\u0006~\u0006k", "2t\\=66K])\u000e~g,\u000bl8f\n", "2t\\=7,;c\u001b\u0001zk\u0010\u0006\n9", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001L\u0016+]E=kA\u0002\u001eik\u000f", "2t\\=66K])\u000e~g,\u000b", "=tc", "\u001aiPCTuB]bi\bb5\fv>r\u007f$\u0004\u0016", "7r56a0LV\u0019}", "2t\\=66K])\u000e~g,\u000bvCn}+\tJ\n\u001b,Gn", ">qX;g\u001aMO\u0017\u0005ik(z\t", "4qP:X:", "3mW.a*>A(zxd\u001b\n\u0005-eq,\u000bCo\u001a$Gk\r\u001b\u0007-@", "1na<h;B\\\u0019m\bZ*|", "3mW.a*>A(zxd\u001b\n\u0005-eq,\u000bCo\u001a$Gk\r\u001b\u0007-@=\u0006+>", "AsPAX", "Bga2T+", "4h]166Gb\u001d\b\u000bZ;\u0001\u00138S\u000f$\tOd \u0016G\u0003", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "7mS2k\u0016?@\u0019\r\u000bf,n\r>h", "/bcBT3-`\u0015|z", "uHJ\u0019](OOb\u0006vg.Fv>a}.jM|\u0015\u0017'v\u000eDv.D/d%3~\u0012w]R?r}\u0005\u0019vp\u000fJJ2X\u0006.KU\u0018\u0017XV\u007f\u0013", "4h]1<5=S,h{?9x\u0011/", "4qP:X\u0010GR\u0019\u0012", "uHJ\u0019](OOb\u0006vg.Fv>a}.jM|\u0015\u0017'v\u000eDv.D/d%3~\u0012w]R?r}\u0005\u0019vp\u000fJG", ">q^/X\nH`#\u000f\nb5|u/s\u00100{?", "4qP:X", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", ">q^/X\nH`#\u000f\nb5|u/s\u00100{??\u001d!Vv\u0012E\n\u001f3c\u000b*G|\u001a7MQ5i>+\u0015", ">q^/X\nH`#\u000f\nb5|v?s\u000b(\u0005?\u0001\u0016", ">q^/X\nH`#\u000f\nb5|v?s\u000b(\u0005?\u0001\u0016UMy\u001dCz.HS{*Dw&=QL;y.\u001c\u001fua", "CoS.g,,b\u0015\u000ez", "CoS.g,+c\"\b~g.j\u0018+t\u007f", "@dP96(EZ\u0019\f", "=v]2e", ">q^/X\nH`#\u000f\nb5|f<e{7{?", "\"", "1n\\=_,MW#\b", ">q^/X\nH`#\u000f\nb5|f<e{7{??\u001d!Vv\u0012E\n\u001f3c\u000b*G|\u001a7MQ5i>+\u0015", "BnBAT*DB&zx^\r\n\u00057e", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001[%*KI*x0\u001c\u0015In5\u000fc\u0002", "1qT.g,(e\"~\b", ">q^/X\nH`#\u000f\nb5|f9m\u000b/{O\u0001\u0016", "A`]6g0SS\u0007\u000ev\\2k\u0016+c\u007f", "", "Bga<j(;Z\u0019", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@VZ}Lk\u001f8@5D]\u0005i\u001eq$=#", "7r8;g,K\\\u0015\u0006b^;\u007f\u0013.", "uKY.i(\bZ\u0015\b|(\u001a\f\u0005-kn5w>\u0001v\u001eGw\u000eE\u0006zxN", "\u0011na<h;B\\\u0019h\rg,\n", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DebugProbesImpl {
    private static final StackTraceElement ARTIFICIAL_FRAME;
    public static final DebugProbesImpl INSTANCE;
    private static final ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> callerInfoCache;
    private static final ConcurrentWeakMap<CoroutineOwner<?>, Boolean> capturedCoroutinesMap;
    private static final SimpleDateFormat dateFormat;
    private static final /* synthetic */ DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private debugProbesImpl$VolatileWrapper$atomicfu$private;
    private static final Function1<Boolean, Unit> dynamicAttach;
    private static boolean enableCreationStackTraces = false;
    private static boolean ignoreCoroutinesWithEmptyContext = false;
    private static boolean sanitizeStackTraces = false;
    private static Thread weakRefCleanerThread = null;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0ZeP.XW2\u000f\u0002{<řc$\u007fCC٥\"}8\tWNmgvJh\u0017KƤ\u000e\u0016\u000fj4կkތ\u0006\u0014\u0015˰Pno9]qM9'sd\u0005P2P9:\"\u0007ɝ:R\u001ex\u0013I[\u000e\"0v\u0081hR\u001dQ\u0013\u001d*\u0006l$Ә\"^mSDN5eH=;\u0005\u007fA|6&DEf\u001bVl';\b\u0012(9RO;%'c\u0003=Ѹ\nRISџA\u0005v;o1W\to6\u0007\u0016Z){c\u001b_\u000b,l\u0007a`BʬYO\u001a֟'ʭ*Þ~{\u0015ɝT\u001c\u0014*`.[\u001e\u001d\fdޟvɤW@X\u061c/V\u000e\u0002y8-$.;ayqƛSň?\u001df9\u0002\u000e\u001b(s\u0015|,sV$_C\u001c\u000bL(ŏS͘ALf\f_I{\u0011Ai\u0010A\u001c0u\u0018\u0006ɜ\u0014ѭ\u001b>"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001L\u0016+]E&x>\u001b\u0015vEA\u0012jj,\u00014Q\\]0eR\\O\u001d\u0012gc", "\"", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eq\u0001Q\t`\u001bP~\u000eI\u007f!<#[*Dw&=QL;YC\u001a\u0013nBF\u0003k,$", "2d[2Z(MS", "7mU<", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001L\u0016+]E\u0019uA(%weB\u0007G5O\u0001\u000bOWU\u0002", "\nh]6g\u0005", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bS\u0007=w%5QLN52(\"rqH\u000bl,\\@&GI^.&V{L\u0014\u001fc\nUtk\u0005VQ&LND)\u0018;M\u000b;L\n\r q=uw\u0018\u001a\u0001", "4qP:X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001[%*KI*x0\u001c\u0015In5\u000fc\u0002", "5dc\u0013e(FS", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0016\u0017D\u007f\u0010\u0006z.DY\u000b)3t_\u001c\\?9q#+\u0011fa\u001a\u0014_4NL", "1`[9X9\u001f`\u0015\u0007z", "5dc\u0010T3ES&_\bZ4|", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n\u0006(\u001f\u0011s\u0017Kv2>U\u0005i\u0015w#8]R?t4\f$d_?gp(Vv|", "5dc g(<Y\b\fv\\,\\\u0010/m\u007f1\u000b", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", "@dbB`,0W(\u0002", "", "@dbB_;", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "BnBAe0GU", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class CoroutineOwner<T> implements Continuation<T>, CoroutineStackFrame {
        public final Continuation<T> delegate;
        public final DebugCoroutineInfoImpl info;

        /* JADX WARN: Multi-variable type inference failed */
        public CoroutineOwner(Continuation<? super T> continuation, DebugCoroutineInfoImpl debugCoroutineInfoImpl) {
            this.delegate = continuation;
            this.info = debugCoroutineInfoImpl;
        }

        private final StackTraceFrame getFrame() {
            return this.info.getCreationStackBottom$kotlinx_coroutines_core();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public CoroutineStackFrame getCallerFrame() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.delegate.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public StackTraceElement getStackTraceElement() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getStackTraceElement();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            DebugProbesImpl.INSTANCE.probeCoroutineCompleted(this);
            this.delegate.resumeWith(obj);
        }

        public String toString() {
            return this.delegate.toString();
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        INSTANCE = debugProbesImpl;
        ARTIFICIAL_FRAME = new ArtificialStackFrames().coroutineCreation();
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new ConcurrentWeakMap<>(false, 1, null);
        sanitizeStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = debugProbesImpl.getDynamicAttach();
        callerInfoCache = new ConcurrentWeakMap<>(true);
        debugProbesImpl$VolatileWrapper$atomicfu$private = new DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private(null);
    }

    private DebugProbesImpl() {
    }

    private final void build(Job job, Map<Job, DebugCoroutineInfoImpl> map, StringBuilder sb, String str) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl = map.get(job);
        if (debugCoroutineInfoImpl != null) {
            sb.append(str + getDebugString(job) + ", continuation is " + debugCoroutineInfoImpl.getState$kotlinx_coroutines_core() + " at line " + ((StackTraceElement) CollectionsKt.firstOrNull((List) debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core())) + '\n');
            str = str + '\t';
        } else if (!(job instanceof ScopeCoroutine)) {
            sb.append(str + getDebugString(job) + '\n');
            str = str + '\t';
        }
        Iterator<Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            build(it.next(), map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> Continuation<T> createOwner(Continuation<? super T> continuation, StackTraceFrame stackTraceFrame) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return continuation;
        }
        CoroutineOwner<?> coroutineOwner = new CoroutineOwner<>(continuation, new DebugCoroutineInfoImpl(continuation.getContext(), stackTraceFrame, DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.sequenceNumber$volatile$FU.incrementAndGet(debugProbesImpl$VolatileWrapper$atomicfu$private)));
        ConcurrentWeakMap<CoroutineOwner<?>, Boolean> concurrentWeakMap = capturedCoroutinesMap;
        concurrentWeakMap.put(coroutineOwner, true);
        if (!isInstalled$kotlinx_coroutines_debug()) {
            concurrentWeakMap.clear();
        }
        return coroutineOwner;
    }

    private final <R> List<R> dumpCoroutinesInfoImpl(final Function2<? super CoroutineOwner<?>, ? super CoroutineContext, ? extends R> function2) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.sortedWith(CollectionsKt.asSequence(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new Function1<CoroutineOwner<?>, R>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfoImpl.3
                @Override // kotlin.jvm.functions.Function1
                public final R invoke(CoroutineOwner<?> coroutineOwner) {
                    CoroutineContext context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return function2.invoke(coroutineOwner, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    private final void dumpCoroutinesSynchronized(PrintStream printStream) throws Throwable {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed".toString());
        }
        printStream.print("Coroutines dump " + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
        for (CoroutineOwner coroutineOwner : SequencesKt.sortedWith(SequencesKt.filter(CollectionsKt.asSequence(getCapturedCoroutines()), new Function1() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DebugProbesImpl.dumpCoroutinesSynchronized$lambda$14((DebugProbesImpl.CoroutineOwner) obj));
            }
        }), new Comparator() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt.compareValues(Long.valueOf(((DebugProbesImpl.CoroutineOwner) t2).info.sequenceNumber), Long.valueOf(((DebugProbesImpl.CoroutineOwner) t3).info.sequenceNumber));
            }
        })) {
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = coroutineOwner.info;
            List<StackTraceElement> listLastObservedStackTrace$kotlinx_coroutines_core = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
            DebugProbesImpl debugProbesImpl = INSTANCE;
            List<StackTraceElement> listEnhanceStackTraceWithThreadDumpImpl = debugProbesImpl.enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfoImpl.getState$kotlinx_coroutines_core(), debugCoroutineInfoImpl.lastObservedThread, listLastObservedStackTrace$kotlinx_coroutines_core);
            printStream.print("\n\nCoroutine " + coroutineOwner.delegate + ", state: " + ((Intrinsics.areEqual(debugCoroutineInfoImpl.getState$kotlinx_coroutines_core(), DebugCoroutineInfoImplKt.RUNNING) && listEnhanceStackTraceWithThreadDumpImpl == listLastObservedStackTrace$kotlinx_coroutines_core) ? debugCoroutineInfoImpl.getState$kotlinx_coroutines_core() + " (Last suspension stacktrace, not an actual stacktrace)" : debugCoroutineInfoImpl.getState$kotlinx_coroutines_core()));
            if (listLastObservedStackTrace$kotlinx_coroutines_core.isEmpty()) {
                printStream.print("\n\tat " + ARTIFICIAL_FRAME);
                debugProbesImpl.printStackTrace(printStream, debugCoroutineInfoImpl.getCreationStackTrace());
            } else {
                debugProbesImpl.printStackTrace(printStream, listEnhanceStackTraceWithThreadDumpImpl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dumpCoroutinesSynchronized$lambda$14(CoroutineOwner coroutineOwner) {
        return !INSTANCE.isFinished(coroutineOwner);
    }

    private final List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl(String str, Thread thread, List<StackTraceElement> list) throws Throwable {
        Object objM8980constructorimpl;
        if (!Intrinsics.areEqual(str, Wg.Zd(";i\u0019UO~,", (short) (C1633zX.Xd() ^ (-14442)), (short) (C1633zX.Xd() ^ (-29502)))) || thread == null) {
            return list;
        }
        try {
            Result.Companion companion = Result.Companion;
            DebugProbesImpl debugProbesImpl = this;
            objM8980constructorimpl = Result.m8980constructorimpl(thread.getStackTrace());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8986isFailureimpl(objM8980constructorimpl)) {
            objM8980constructorimpl = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objM8980constructorimpl;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("'\u001f5!n.$2,s\u001a<*-6 ?/25\u0016>8A:DK", (short) (FB.Xd() ^ 31527))).getMethod(Wg.vd("\u001f\u001e*y(\u001e-.}\u0012\u001b\u0014", (short) (Od.Xd() ^ (-2736))), new Class[0]);
            try {
                method.setAccessible(true);
                if (Intrinsics.areEqual((String) method.invoke(stackTraceElement, objArr), Qg.kd("7:>515s(35164(,\"/h$/%d\u001f#(\u0018$\u001f\u0011\u001b[n\r\u001e\u000fk\u0017\u0015\u001a\u000e\u0012\u0018\u0003\u0015\t\u000e\fe\t\u000b\u0006", (short) (C1633zX.Xd() ^ (-3129)), (short) (C1633zX.Xd() ^ (-14135))))) {
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(hg.Vd("i_s])fZf^$HhTU\\DaOPQ0VNULTY", (short) (C1633zX.Xd() ^ (-17405)), (short) (C1633zX.Xd() ^ (-24939)))).getMethod(C1561oA.ud("\u0019\u0016${\u0013!\u0014\u001a\u000ev\t\u0014\u000b", (short) (C1580rY.Xd() ^ (-21088))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        if (Intrinsics.areEqual((String) method2.invoke(stackTraceElement, objArr2), C1561oA.yd("\u0003t\u0002\u0003ypar|o", (short) (ZN.Xd() ^ 1775)))) {
                            Class<?> cls = Class.forName(C1561oA.Yd("B:P<\nI?MG\u000f5WEHQ;ZJMP1YS\\U_f", (short) (OY.Xd() ^ 8070)));
                            Class<?>[] clsArr = new Class[0];
                            Object[] objArr3 = new Object[0];
                            short sXd = (short) (OY.Xd() ^ 24738);
                            short sXd2 = (short) (OY.Xd() ^ TypedValues.PositionType.TYPE_PERCENT_X);
                            int[] iArr = new int["_^nAeicMang".length()];
                            QB qb = new QB("_^nAeicMang");
                            int i3 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                                i3++;
                            }
                            Method method3 = cls.getMethod(new String(iArr, 0, i3), clsArr);
                            try {
                                method3.setAccessible(true);
                                String str2 = (String) method3.invoke(stackTraceElement, objArr3);
                                short sXd3 = (short) (C1607wl.Xd() ^ 19296);
                                short sXd4 = (short) (C1607wl.Xd() ^ 31259);
                                int[] iArr2 = new int["0N??/\b~c`K$\u001bm\u0006[Q|/(".length()];
                                QB qb2 = new QB("0N??/\b~c`K$\u001bm\u0006[Q|/(");
                                int i4 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd4) ^ sXd3));
                                    i4++;
                                }
                                if (Intrinsics.areEqual(str2, new String(iArr2, 0, i4))) {
                                    break;
                                }
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } else {
                            continue;
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                i2++;
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
        Pair<Integer, Integer> pairFindContinuationStartIndex = findContinuationStartIndex(i2, stackTraceElementArr, list);
        int iIntValue = pairFindContinuationStartIndex.component1().intValue();
        int iIntValue2 = pairFindContinuationStartIndex.component2().intValue();
        if (iIntValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i2) - iIntValue) - 1) - iIntValue2);
        int i5 = i2 - iIntValue2;
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList.add(stackTraceElementArr[i6]);
        }
        int size = list.size();
        for (int i7 = iIntValue + 1; i7 < size; i7++) {
            arrayList.add(list.get(i7));
        }
        return arrayList;
    }

    private final Pair<Integer, Integer> findContinuationStartIndex(int i2, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) throws Throwable {
        for (int i3 = 0; i3 < 3; i3++) {
            int iFindIndexOfFrame = INSTANCE.findIndexOfFrame((i2 - 1) - i3, stackTraceElementArr, list);
            if (iFindIndexOfFrame != -1) {
                return TuplesKt.to(Integer.valueOf(iFindIndexOfFrame), Integer.valueOf(i3));
            }
        }
        return TuplesKt.to(-1, 0);
    }

    private final int findIndexOfFrame(int i2, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) throws Throwable {
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.getOrNull(stackTraceElementArr, i2);
        if (stackTraceElement == null) {
            return -1;
        }
        int i3 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("\u0003\u001dPh!P@{C8\u0019\"\u000eA\u0006ah_H4=qtp\tK}", (short) (C1499aX.Xd() ^ (-4793)), (short) (C1499aX.Xd() ^ (-19817)))).getMethod(C1626yg.Ud("\b?DzJlE\u0010@j-", (short) (C1633zX.Xd() ^ (-16014)), (short) (C1633zX.Xd() ^ (-2978))), new Class[0]);
            try {
                method.setAccessible(true);
                String str = (String) method.invoke(stackTraceElement2, objArr);
                Class<?> cls = Class.forName(Ig.wd("Y\u0002GLw\u0011[?\u0001e\u0007PQ[q?\u0010\u001bC\u001fG%}\u007fpW>", (short) (ZN.Xd() ^ 5092)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (C1499aX.Xd() ^ (-1499));
                int[] iArr = new int["G\u000fo)D\u0005\u001a*xh^".length()];
                QB qb = new QB("G\u000fo)D\u0005\u001a*xh^");
                int i4 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + i4)) + xuXd.CK(iKK));
                    i4++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i4), clsArr);
                try {
                    method2.setAccessible(true);
                    if (Intrinsics.areEqual(str, (String) method2.invoke(stackTraceElement, objArr2))) {
                        Object[] objArr3 = new Object[0];
                        Method method3 = Class.forName(C1561oA.Qd("OEYC\u000fL@LD\n.N:;B*G567\u0016<4;2:?", (short) (C1499aX.Xd() ^ (-172)))).getMethod(C1593ug.zd("('7\u00071':;\u0017+81", (short) (ZN.Xd() ^ 1167), (short) (ZN.Xd() ^ 28503)), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            String str2 = (String) method3.invoke(stackTraceElement2, objArr3);
                            short sXd2 = (short) (Od.Xd() ^ (-16615));
                            int[] iArr2 = new int["$\u001a.\u0018c!\u0015!\u0019^\u0003#\u000f\u0010\u0017~\u001c\n\u000b\fj\u0011\t\u0010\u0007\u000f\u0014".length()];
                            QB qb2 = new QB("$\u001a.\u0018c!\u0015!\u0019^\u0003#\u000f\u0010\u0017~\u001c\n\u000b\fj\u0011\t\u0010\u0007\u000f\u0014");
                            int i5 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i5] = xuXd2.fK(sXd2 + sXd2 + i5 + xuXd2.CK(iKK2));
                                i5++;
                            }
                            Object[] objArr4 = new Object[0];
                            Method method4 = Class.forName(new String(iArr2, 0, i5)).getMethod(C1561oA.Kd("\u0006\u0005\u0015d\u000f\u0005\u0018\u0019t\t\u0016\u000f", (short) (ZN.Xd() ^ 4806)), new Class[0]);
                            try {
                                method4.setAccessible(true);
                                if (Intrinsics.areEqual(str2, (String) method4.invoke(stackTraceElement, objArr4))) {
                                    Object[] objArr5 = new Object[0];
                                    Method method5 = Class.forName(Wg.Zd("{\u0001;t:\u0017`j>\u0016=+45\u0007\u000ehc\t[6:GN\u001f7B", (short) (ZN.Xd() ^ 28474), (short) (ZN.Xd() ^ 6357))).getMethod(C1561oA.Xd("65E\u001f8H=E;&:G@", (short) (OY.Xd() ^ 24136)), new Class[0]);
                                    try {
                                        method5.setAccessible(true);
                                        String str3 = (String) method5.invoke(stackTraceElement2, objArr5);
                                        Class<?> cls2 = Class.forName(Wg.vd("kcua+j\\jp8Z|finX\u0004sruRzpy~\t\f", (short) (C1499aX.Xd() ^ (-1323))));
                                        Class<?>[] clsArr2 = new Class[0];
                                        Object[] objArr6 = new Object[0];
                                        short sXd3 = (short) (Od.Xd() ^ (-21434));
                                        short sXd4 = (short) (Od.Xd() ^ (-2176));
                                        int[] iArr3 = new int["\u0002~\rd{\n|\u0003v_q|s".length()];
                                        QB qb3 = new QB("\u0002~\rd{\n|\u0003v_q|s");
                                        int i6 = 0;
                                        while (qb3.YK()) {
                                            int iKK3 = qb3.KK();
                                            Xu xuXd3 = Xu.Xd(iKK3);
                                            iArr3[i6] = xuXd3.fK(((sXd3 + i6) + xuXd3.CK(iKK3)) - sXd4);
                                            i6++;
                                        }
                                        Method method6 = cls2.getMethod(new String(iArr3, 0, i6), clsArr2);
                                        try {
                                            method6.setAccessible(true);
                                            if (Intrinsics.areEqual(str3, (String) method6.invoke(stackTraceElement, objArr6))) {
                                                return i3;
                                            }
                                        } catch (InvocationTargetException e2) {
                                            throw e2.getCause();
                                        }
                                    } catch (InvocationTargetException e3) {
                                        throw e3.getCause();
                                    }
                                } else {
                                    continue;
                                }
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    }
                    i3++;
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            } catch (InvocationTargetException e7) {
                throw e7.getCause();
            }
        }
        return -1;
    }

    private final Set<CoroutineOwner<?>> getCapturedCoroutines() {
        return capturedCoroutinesMap.keySet();
    }

    private final String getDebugString(Job job) {
        return job instanceof JobSupport ? ((JobSupport) job).toDebugString() : job.toString();
    }

    private static /* synthetic */ void getDebugString$annotations(Job job) {
    }

    private final Function1<Boolean, Unit> getDynamicAttach() {
        Object objM8980constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            DebugProbesImpl debugProbesImpl = this;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            objM8980constructorimpl = Result.m8980constructorimpl((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(objNewInstance, 1));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8986isFailureimpl(objM8980constructorimpl)) {
            objM8980constructorimpl = null;
        }
        return (Function1) objM8980constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFinished(CoroutineOwner<?> coroutineOwner) {
        Job job;
        CoroutineContext context = coroutineOwner.info.getContext();
        if (context == null || (job = (Job) context.get(Job.Key)) == null || !job.isCompleted()) {
            return false;
        }
        capturedCoroutinesMap.remove(coroutineOwner);
        return true;
    }

    private final boolean isInternalMethod(StackTraceElement stackTraceElement) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("\u0017\r!\u000bV\u0014\b\u0014\fQu\u0016\u0002\u0003\nq\u000f|}~]\u0004{\u0003y\u0002\u0007", (short) (OY.Xd() ^ 20965), (short) (OY.Xd() ^ 21427))).getMethod(C1561oA.ud("b_m;cWhgAS^U", (short) (C1607wl.Xd() ^ 7856)), new Class[0]);
        try {
            method.setAccessible(true);
            return StringsKt.startsWith$default((String) method.invoke(stackTraceElement, objArr), C1561oA.yd("puwprx\u007f6p}}{\u0007\u0007x~Zi", (short) (FB.Xd() ^ 6049)), false, 2, (Object) null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final CoroutineOwner<?> owner(Continuation<?> continuation) {
        CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
        if (coroutineStackFrame != null) {
            return owner(coroutineStackFrame);
        }
        return null;
    }

    private final CoroutineOwner<?> owner(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof CoroutineOwner)) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        }
        return (CoroutineOwner) coroutineStackFrame;
    }

    private final void printStackTrace(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void probeCoroutineCompleted(CoroutineOwner<?> coroutineOwner) {
        CoroutineStackFrame coroutineStackFrameRealCaller;
        capturedCoroutinesMap.remove(coroutineOwner);
        CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = coroutineOwner.info.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null || (coroutineStackFrameRealCaller = realCaller(lastObservedFrame$kotlinx_coroutines_core)) == null) {
            return;
        }
        callerInfoCache.remove(coroutineStackFrameRealCaller);
    }

    private final CoroutineStackFrame realCaller(CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.getStackTraceElement() == null);
        return coroutineStackFrame;
    }

    private final <T extends Throwable> List<StackTraceElement> sanitizeStackTrace(T t2) throws Throwable {
        StackTraceElement[] stackTrace = t2.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i3 = length2 - 1;
                StackTraceElement stackTraceElement = stackTrace[length2];
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Yd("ldzf4siwq9_\u0002or{e\u0005twz[\u0004}\u0007\u007f\n\u0011", (short) (C1580rY.Xd() ^ (-18671)))).getMethod(Xg.qd("32B\u0012<2EF\"6C<", (short) (ZN.Xd() ^ 28804), (short) (ZN.Xd() ^ 25696)), new Class[0]);
                try {
                    method.setAccessible(true);
                    String str = (String) method.invoke(stackTraceElement, objArr);
                    short sXd = (short) (Od.Xd() ^ (-17979));
                    short sXd2 = (short) (Od.Xd() ^ (-29671));
                    int[] iArr = new int["W87-$\u0006\u0002xC!\u001a\u001c\u0015f R\u001d2jre\t\u0001A\u0004QX\t7^\u001d-Jc9i\fLD12RfL".length()];
                    QB qb = new QB("W87-$\u0006\u0002xC!\u001a\u001c\u0015f R\u001d2jre\t\u0001A\u0004QX\t7^\u001d-Jc9i\fLD12RfL");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK(xuXd.CK(iKK) - ((i4 * sXd2) ^ sXd));
                        i4++;
                    }
                    if (Intrinsics.areEqual(str, new String(iArr, 0, i4))) {
                        i2 = length2;
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    length2 = i3;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        int i5 = i2 + 1;
        if (!sanitizeStackTraces) {
            int i6 = length - i5;
            ArrayList arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList.add(stackTrace[i7 + i5]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i5) + 1);
        while (i5 < length) {
            if (isInternalMethod(stackTrace[i5])) {
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(stackTrace[i5]);
                int i8 = i5 + 1;
                while (i8 < length && isInternalMethod(stackTrace[i8])) {
                    i8++;
                }
                int i9 = i8 - 1;
                int i10 = i9;
                while (i10 > i5) {
                    StackTraceElement stackTraceElement2 = stackTrace[i10];
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(ZO.xd("\u0004X\u0019-$yN8TsR /\u00100S\u0002o}E \u0011S\r\u0006WU", (short) (C1499aX.Xd() ^ (-3284)), (short) (C1499aX.Xd() ^ (-12787)))).getMethod(C1626yg.Ud("7\u001eJ2\u0003,\tD\u0005el", (short) (C1633zX.Xd() ^ (-20469)), (short) (C1633zX.Xd() ^ (-23546))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        if (((String) method2.invoke(stackTraceElement2, objArr2)) != null) {
                            break;
                        }
                        i10--;
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                if (i10 > i5 && i10 < i9) {
                    arrayList3.add(stackTrace[i10]);
                }
                arrayList3.add(stackTrace[i9]);
                i5 = i8;
            } else {
                arrayList2.add(stackTrace[i5]);
                i5++;
            }
        }
        return arrayList2;
    }

    private final void startWeakRefCleanerThread() {
        weakRefCleanerThread = ThreadsKt.thread$default(false, true, null, "Coroutines Debugger Cleaner", 0, new Function0() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebugProbesImpl.startWeakRefCleanerThread$lambda$2();
            }
        }, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startWeakRefCleanerThread$lambda$2() {
        callerInfoCache.runWeakRefQueueCleaningLoopUntilInterrupted();
        return Unit.INSTANCE;
    }

    private final void stopWeakRefCleanerThread() throws InterruptedException {
        Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    private final StackTraceFrame toStackTraceFrame(List<StackTraceElement> list) {
        StackTraceFrame stackTraceFrame = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                stackTraceFrame = new StackTraceFrame(stackTraceFrame, listIterator.previous());
            }
        }
        return new StackTraceFrame(stackTraceFrame, ARTIFICIAL_FRAME);
    }

    private final String toStringRepr(Object obj) {
        return DebugProbesImplKt.repr(obj.toString());
    }

    private final void updateRunningState(CoroutineStackFrame coroutineStackFrame, String str) {
        boolean z2;
        if (isInstalled$kotlinx_coroutines_debug()) {
            ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> concurrentWeakMap = callerInfoCache;
            DebugCoroutineInfoImpl debugCoroutineInfoImplRemove = concurrentWeakMap.remove(coroutineStackFrame);
            if (debugCoroutineInfoImplRemove != null) {
                z2 = false;
            } else {
                CoroutineOwner<?> coroutineOwnerOwner = owner(coroutineStackFrame);
                if (coroutineOwnerOwner == null || (debugCoroutineInfoImplRemove = coroutineOwnerOwner.info) == null) {
                    return;
                }
                CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = debugCoroutineInfoImplRemove.getLastObservedFrame$kotlinx_coroutines_core();
                CoroutineStackFrame coroutineStackFrameRealCaller = lastObservedFrame$kotlinx_coroutines_core != null ? realCaller(lastObservedFrame$kotlinx_coroutines_core) : null;
                if (coroutineStackFrameRealCaller != null) {
                    concurrentWeakMap.remove(coroutineStackFrameRealCaller);
                }
                z2 = true;
            }
            Intrinsics.checkNotNull(coroutineStackFrame, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            debugCoroutineInfoImplRemove.updateState$kotlinx_coroutines_core(str, (Continuation) coroutineStackFrame, z2);
            CoroutineStackFrame coroutineStackFrameRealCaller2 = realCaller(coroutineStackFrame);
            if (coroutineStackFrameRealCaller2 == null) {
                return;
            }
            concurrentWeakMap.put(coroutineStackFrameRealCaller2, debugCoroutineInfoImplRemove);
        }
    }

    private final void updateState(Continuation<?> continuation, String str) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            if (ignoreCoroutinesWithEmptyContext && continuation.getContext() == EmptyCoroutineContext.INSTANCE) {
                return;
            }
            if (Intrinsics.areEqual(str, DebugCoroutineInfoImplKt.RUNNING)) {
                CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
                if (coroutineStackFrame == null) {
                    return;
                }
                updateRunningState(coroutineStackFrame, str);
                return;
            }
            CoroutineOwner<?> coroutineOwnerOwner = owner(continuation);
            if (coroutineOwnerOwner == null) {
                return;
            }
            updateState(coroutineOwnerOwner, continuation, str);
        }
    }

    private final void updateState(CoroutineOwner<?> coroutineOwner, Continuation<?> continuation, String str) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            coroutineOwner.info.updateState$kotlinx_coroutines_core(str, continuation, true);
        }
    }

    public final void dumpCoroutines(PrintStream printStream) {
        synchronized (printStream) {
            INSTANCE.dumpCoroutinesSynchronized(printStream);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final List<DebugCoroutineInfo> dumpCoroutinesInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.sortedWith(CollectionsKt.asSequence(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new Function1<CoroutineOwner<?>, DebugCoroutineInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // kotlin.jvm.functions.Function1
                public final DebugCoroutineInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    CoroutineContext context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebugCoroutineInfo(coroutineOwner.info, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    public final Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        String name;
        List<DebugCoroutineInfo> listDumpCoroutinesInfo = dumpCoroutinesInfo();
        int size = listDumpCoroutinesInfo.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (DebugCoroutineInfo debugCoroutineInfo : listDumpCoroutinesInfo) {
            CoroutineContext context = debugCoroutineInfo.getContext();
            CoroutineName coroutineName = (CoroutineName) context.get(CoroutineName.Key);
            Long lValueOf = null;
            String stringRepr = (coroutineName == null || (name = coroutineName.getName()) == null) ? null : toStringRepr(name);
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) context.get(CoroutineDispatcher.Key);
            String stringRepr2 = coroutineDispatcher != null ? toStringRepr(coroutineDispatcher) : null;
            StringBuilder sbAppend = new StringBuilder("\n                {\n                    \"name\": ").append(stringRepr).append(",\n                    \"id\": ");
            CoroutineId coroutineId = (CoroutineId) context.get(CoroutineId.Key);
            if (coroutineId != null) {
                lValueOf = Long.valueOf(coroutineId.getId());
            }
            arrayList3.add(StringsKt.trimIndent(sbAppend.append(lValueOf).append(",\n                    \"dispatcher\": ").append(stringRepr2).append(",\n                    \"sequenceNumber\": ").append(debugCoroutineInfo.getSequenceNumber()).append(",\n                    \"state\": \"").append(debugCoroutineInfo.getState()).append("\"\n                } \n                ").toString()));
            arrayList2.add(debugCoroutineInfo.getLastObservedFrame());
            arrayList.add(debugCoroutineInfo.getLastObservedThread());
        }
        return new Object[]{"[" + CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, null, 63, null) + AbstractJsonLexerKt.END_LIST, arrayList.toArray(new Thread[0]), arrayList2.toArray(new CoroutineStackFrame[0]), listDumpCoroutinesInfo.toArray(new DebugCoroutineInfo[0])};
    }

    public final List<DebuggerInfo> dumpDebuggerInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.sortedWith(CollectionsKt.asSequence(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new Function1<CoroutineOwner<?>, DebuggerInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // kotlin.jvm.functions.Function1
                public final DebuggerInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    CoroutineContext context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebuggerInfo(coroutineOwner.info, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(DebugCoroutineInfo debugCoroutineInfo, List<StackTraceElement> list) {
        return enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfo.getState(), debugCoroutineInfo.getLastObservedThread(), list);
    }

    public final String enhanceStackTraceWithThreadDumpAsJson(DebugCoroutineInfo debugCoroutineInfo) throws Throwable {
        List<StackTraceElement> listEnhanceStackTraceWithThreadDump = enhanceStackTraceWithThreadDump(debugCoroutineInfo, debugCoroutineInfo.lastObservedStackTrace());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : listEnhanceStackTraceWithThreadDump) {
            StringBuilder sb = new StringBuilder(Ig.wd("\u0011x\u00153Q\u001c\u0006D!3;S$ \":\u0005\\Q}:pXR?1\u000e48\u0005nG%\u0002.fK-TB\u0007^5\"SN\u001fU>xo\u0010\u0004iQ\u001b|#", (short) (C1580rY.Xd() ^ (-10257))));
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("\u0017<u\u0007E8~\u000f*3P\u001617M^18S\r03\u0002\u000eYF.", (short) (ZN.Xd() ^ 26183))).getMethod(C1561oA.Qd("74B\u00108,=<\u0016(3*", (short) (FB.Xd() ^ 12540)), new Class[0]);
            try {
                method.setAccessible(true);
                StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement, objArr)).append(C1593ug.zd("x\u0004byz{|}~\u007f\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0010\\UeZbXCWd]\u001b4\u001b\u001e", (short) (C1607wl.Xd() ^ 18375), (short) (C1607wl.Xd() ^ 11338)));
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.od("\u0004y\u000ewC\u0001t\u0001x>b\u0003nov^{ijkJphofns", (short) (C1607wl.Xd() ^ 8471))).getMethod(C1561oA.Kd("\u000f\u000e\u001ew\u0011!\u0016\u001e\u0014~\u0013 \u0019", (short) (C1607wl.Xd() ^ 4247)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    StringBuilder sbAppend2 = sbAppend.append((String) method2.invoke(stackTraceElement, objArr2)).append(Wg.Zd("}qn0OvZq!<kCd\f+Vu]\u0001\u0018KbRqU\u007f&\u0007\u000f=x\bwgz", (short) (C1580rY.Xd() ^ (-22276)), (short) (C1580rY.Xd() ^ (-28229))));
                    Class<?> cls = Class.forName(C1561oA.Xd("E=S?\rLBPJ\u00128ZHKT>]MPS4\\V_Xbi", (short) (ZN.Xd() ^ 5620)));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd = (short) (C1580rY.Xd() ^ (-19522));
                    int[] iArr = new int["VUe8\\`ZDXe^".length()];
                    QB qb = new QB("VUe8\\`ZDXe^");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                        i2++;
                    }
                    Method method3 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method3.setAccessible(true);
                        String str = (String) method3.invoke(stackTraceElement, objArr3);
                        StringBuilder sbAppend3 = sbAppend2.append(str != null ? toStringRepr(str) : null).append(Qg.kd("@\u001d210/.-,+*)('&%$#\"! \u001f iei_GmdXZf\u0015,\u0011", (short) (C1499aX.Xd() ^ (-20776)), (short) (C1499aX.Xd() ^ (-18018))));
                        short sXd2 = (short) (Od.Xd() ^ (-19145));
                        short sXd3 = (short) (Od.Xd() ^ (-18759));
                        int[] iArr2 = new int["\u0013\t\u001d\u0007R\u0010\u0004\u0010\bMq\u0012}~\u0006m\u000bxyzY\u007fw~u}\u0003".length()];
                        QB qb2 = new QB("\u0013\t\u001d\u0007R\u0010\u0004\u0010\bMq\u0012}~\u0006m\u000bxyzY\u007fw~u}\u0003");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                            i3++;
                        }
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.ud("zw\u0006\\x|rZ\u0001wkmy", (short) (OY.Xd() ^ 17341)), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            arrayList.add(StringsKt.trimIndent(sbAppend3.append(((Integer) method4.invoke(stackTraceElement, objArr4)).intValue()).append(C1561oA.yd("NcbahgfelkjiponmT1<QXWVU\\[ZY`_^]DCB", (short) (C1580rY.Xd() ^ (-29678)))).toString()));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        return C1561oA.Yd(ContextChain.TAG_INFRA, (short) (Od.Xd() ^ (-26042))) + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null) + AbstractJsonLexerKt.END_LIST;
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
        return enableCreationStackTraces;
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return ignoreCoroutinesWithEmptyContext;
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return sanitizeStackTraces;
    }

    public final String hierarchyToString$kotlinx_coroutines_core(Job job) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed".toString());
        }
        Set<CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        ArrayList arrayList = new ArrayList();
        for (Object obj : capturedCoroutines) {
            if (((CoroutineOwner) obj).delegate.getContext().get(Job.Key) != null) {
                arrayList.add(obj);
            }
        }
        ArrayList<CoroutineOwner> arrayList2 = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (CoroutineOwner coroutineOwner : arrayList2) {
            linkedHashMap.put(JobKt.getJob(coroutineOwner.delegate.getContext()), coroutineOwner.info);
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.build(job, linkedHashMap, sb, "");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void install$kotlinx_coroutines_core() {
        Function1<Boolean, Unit> function1;
        if (DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.installations$volatile$FU.incrementAndGet(debugProbesImpl$VolatileWrapper$atomicfu$private) > 1) {
            return;
        }
        startWeakRefCleanerThread();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (function1 = dynamicAttach) == null) {
            return;
        }
        function1.invoke(true);
    }

    public final boolean isInstalled$kotlinx_coroutines_debug() {
        return DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.installations$volatile$FU.get(debugProbesImpl$VolatileWrapper$atomicfu$private) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(Continuation<? super T> continuation) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return continuation;
        }
        if (!(ignoreCoroutinesWithEmptyContext && continuation.getContext() == EmptyCoroutineContext.INSTANCE) && owner(continuation) == null) {
            return createOwner(continuation, enableCreationStackTraces ? toStackTraceFrame(sanitizeStackTrace(new Exception())) : null);
        }
        return continuation;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(Continuation<?> continuation) {
        updateState(continuation, DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(Continuation<?> continuation) {
        updateState(continuation, DebugCoroutineInfoImplKt.SUSPENDED);
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean z2) {
        enableCreationStackTraces = z2;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean z2) {
        ignoreCoroutinesWithEmptyContext = z2;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean z2) {
        sanitizeStackTraces = z2;
    }

    public final void uninstall$kotlinx_coroutines_core() throws InterruptedException {
        Function1<Boolean, Unit> function1;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Agent was not installed".toString());
        }
        if (DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.installations$volatile$FU.decrementAndGet(debugProbesImpl$VolatileWrapper$atomicfu$private) != 0) {
            return;
        }
        stopWeakRefCleanerThread();
        capturedCoroutinesMap.clear();
        callerInfoCache.clear();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (function1 = dynamicAttach) == null) {
            return;
        }
        function1.invoke(false);
    }
}
