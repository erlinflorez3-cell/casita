package kotlinx.coroutines.selects;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.selects.SelectBuilder;
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
@Metadata(bv = {}, d1 = {"Яē\u0014D57\u001eqܜLDyt\fA\u001c0\u0013.X~*ܥ\u001aw\u001dfr96GmHDR[*\u001dӆ\u0004é,[2zK;[\u001d\u0006\"\u0017nVg}nRZ\u0011C\u0017\u0006$~r,OX\u0001] \u000f:B\u0006?;ݹw=O`|6\u001b :\">y\r\u00010*P\u0010\rzKK\u0012\u00128@\u0007:Z\rS\u000b\"\u0012\u001c>(\u0001$\\oNLHt]@4+\u0003\u007fBV'e7\u0005M\u001bG\\'\u0013vg-A¨_7\u001bǬa\u00027R\n?3E\u0002?\u0015hm&YJ$]FZ\u0010\u0014[*}\u000f\u0016qm\u001d\u0012ad\u001a*CO\u0012Oח\u0012*}\u007f\n\u0013\u0005\u0010\u001c\u001f?HdƦ`ǣFԧ7t\u0001m\t\\\u0010yZ\u007f1ʨ|Аcő7+G5/\u007foW1Ne\u0019-\rLA1\t/zl$f\u0014+\\\bWASP=~ݐ8zMq\u0014rx\u0001X\u000f^gF\u0092{ 2\u00173Y$y1=\u0004\u0002va\bx\u000b_vv\u0012XXB2n\\ZX-<zR\u0004\u001d\bVSh.!Mbw\u0017\u0006\u0018\u00190^\b<Wط>o_lylc\\80]\f}ցn«\u0012WG\u0005{\n_\u007f(a\u0001\u00144ABa\u0013\u007f\u0007DY\fh\u007fP.BJz\u0010>#TP\u001c\u0013xb Dd0?Bt\u0015\u000f*NbO\u001c!{`g \u0001d3j&y,\u0005\u000f\u0011Rlp&Ο'j<\u0001p$C@\u007f@GK\u001cȿhط\u0001#\u0015)<\u001eU\u0013dGz\n>\u007f\u0004\u0010p\u001c*;a/sП=ȯY8\b-Sx\u000be\u007fZX&C\u000b\b<Sh\\\u00058n~ZxjxZ\u001b\u0017j\u0005l\";\b\u0013\u001d*eT+_c\u0003<\"R\u0012\r\u0011\fTNf\u001a5',X\u0019s2|;.q[M\u001a\u0006IG\u0015\u0010t0\u0004v\npE>t\u0014!\\i$\bzSs1iC\u0010mGJ0[\u0005\u0003pe1̮Fɚ\r4\u001bM\u0011Or)n8{(_\u0002t5D\r\u001fa\":[\b\fmF_X\u0001s\u0002\"\r[%?X\u0004m{(c^!I=\u0015Q\u0010y\u0005 WU \u0005\u0014\u0013\r>4\f\u0018dLkh\u0013v!&J+j\u0013S[b'\u001e\u0010)\u0017vc\u001dEJB\"F\u0007\u0014b\u0011tX^\u0004\u000fP'!r\u001b\rMK*\u000f4_\u0019>Ld1s27ҵK̿Kn]-~%YO\u001b9c4f@#E\u0014ŝ\u0010ͼt\u0086K){\u000684FX\u0015\u001dxȰKG_Rw\u0001^r[[tPtvHצ\u0001ƉR/\r\u0013\u0015\u0010R\t=\u0016_\u06dd1ƚf-Z\u0011@OQ]\u0019\u0017rF7\u001a\u000b(^%[\u001a\u00063MKz\u0014]س\u0006ė\u0002}P0.C\u001ctOy\b\u0014tOu\u001dP\u0015 \\)\u0016Y%^#\u001c.xxI˭0ĝ:U\n֯\u001a\u0015d`y\u007fqM54\u0005\fRMxx8n\u001bmEά\rSx?b\u0012n[]SI}Ӑ0 \\^R\u0013Y.f P&#6766o_P&ɭjӗoSs\u000f1?y92C>c6}M\u0007,D\u0001ė*נ?Ze@j\u001aj{\u0013u\u001cp\u0003:t\u0001\u001c3B\u0011ONn\u0013#4|ݱLҋE6G22ƯSֿ\u000b\u0004MÒv/?gW\u001dM19z~ϖ\u001dܾ>b|ʔzN\u0017\t\u0018gZD\u001dªIՆ+Y,ݦ5\u00114c]:X\u0007Z\u001cdĴ;և< Fюӳ \u0004"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bu!5MK;tC\u001a$lkB\\", Global.BLANK, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gvp8\u007f$<Y\u000bu", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0014}\u001a5LCHA", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\u0018'$hnB\u0003j\u0002", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "\nh]6g\u0005", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|kq>", "5dc\u0010b5MS,\u000e", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "AsPAX", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "", "7mA2Z0Lb&z\nb6\u0006s2a\u000e(", "", "5dc\u0016a\u0019>U\u001d\r\nk(\f\r9nj+wN\u0001", "u(I", "7rB2_,<b\u0019}", "7r2.a*>Z ~y", "1kPBf,L", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bu!5MK;tC\u001a$lkBEA3J\u00075G+J;X(", "2hb=b::P ~]Z5{\u0010/O\r\u0016{B\t\u0017 V", "7mS2k\u0010GA\u0019\u0001\u0003^5\f", "", "7mc2e5:Z\u0006~\tn3\f", "2nB2_,<b", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "2nB2_,<b\u0007\u000f\ti,\u0006\b", "7me<^,", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0006A", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0017\u001eGm\u001dJ@\u00135`}\u001eFK\u001d*]Q;6\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-:\u001az\u0010", "\u001f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0007A", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0017\u001eGm\u001dJ@\u00135`}\u001eFK\u001d*]Q;7\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-;\u001az\u0010", "\u001e", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\bA", ">`a.`", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0017\u001eGm\u001dJ@\u00135`}\u001eFK\u001d*]Q;8\n\u0005\u001adr5Pj(Wxp1IS,ZaH$\u001a\u001ci\u0015R4V\njImoT@\u001d\u00170S\u000bI2a\u001c\u001f\fDnzK#e\u000bj", "@dV6f;>`", "@da2Z0Lb\u0019\f", "1gT0^\nEO)\rzH)\u0002\t-t", "1kPBf,(P\u001e~xm", "2hb=b:>=\"\\\u0005f7\u0004\t>i\n1", "2hb=b::P ~]Z5{\u0010/", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "7me<^,(\\vz\u0004\\,\u0004\u0010+t\u00042\u0005", "AdV:X5M", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00135[\u0006 @|k", "7mS2k", "Ad[2V;\"\\\u0006~|b:\f\u0016+t\u00042\u0005+\u0004\u0013%G", "E`XAH5MW lze,z\u0018/d", "@da2Z0Lb\u0019\fXe(\r\u0017/", "Bqh X3>Q(", "@dbB_;", "Bqh X3>Q(]zm(\u0001\u0010/d", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006e2IG}'7k%\rMR7o;\u001e\u0014UaG\u0017j;$", "Bqh X3>Q(b\u0004m,\n\u0012+l", "4h]163:c'~", "1n\\=_,MS", ">q^0X:L@\u0019\r\u000be;X\u0012.I\t9\u0006F\u0001s\u001eQm\u0014)v#?j}-;v\u0018\u000e`A;vC\"\u001fq", "1kPBf,", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0017\u001eGm\u001dJ@\u00135`}\u001eFQ\u001e9TCCk=-\u0011weC\u0010\"\nUr7UL-(kNH$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u00020\bEw\b\u0010\u001fW3t}Lf\u001fK\u0003\u0015\u0004\u000b\u0007rOhc\u0003W=Tf4ma#\u0004a6K ]x\u0015$j\u001a\u0018\u0007\u0001S\u000f\u0002(", "1kT.a<I", "Ad[2V;>Rv\u0006vn:|", "1`d@X", "", "\u0011kPBf,\u001dO(z", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class SelectImplementation<R> implements CancelHandler, SelectBuilder<R>, SelectInstanceInternal<R> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");
    private final CoroutineContext context;
    private Object disposableHandleOrSegment;
    private volatile /* synthetic */ Object state$volatile = SelectKt.STATE_REG;
    private List<SelectImplementation<R>.ClauseData> clauses = new ArrayList(2);
    private int indexInSegment = -1;
    private Object internalResult = SelectKt.NO_RESULT;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000fy{<řc$\bCCU ~*\teNo˧vJh\fK\u000f\u001c\u0016\u0001j2L]xk\u0018\u0017˰JoM<UoS9ht<\u000b&݆$Nц5\u0001H)\tǼv\u000bGY\f*0noJ&\u001bN\u001di\"\u0017N//\u001d֔kX<L|c@43\u0005oHt'oE\r`\u001dFZ(;|Ґ\"5F;E\u001b+X\u0013\tXae\nO\u0005M\u0016~&U*ʁwa<\\\u0010\u001a\u001b0_\u000fcxLd\u0015Sp\fU4}f4Pl*\bN\n\u0017TS\u001e\u00177W\\,բj\u0012\u00147\u0005xYE`\u0004dH&zqI'6\u00162Y8Ӹj[g?)T=\u0001\u0015\u000f$)'v1nd\u001fv\u0014ISɐU;WDMNT\u000fi?s\n\u0017n\u0012.\u00142]~]z?1\u007f%\u0016fI)/s\u001aJZf%\u0004plavjHn!~\nE8!{jYt\u0018{PZYZ\u0017ܖ ^\r\u0002\u0018\u0019&a\b>'+6U_{y{c\\8$çjA_r{\u0014]>n5;W\n\u0018qe\u0007%U;\u0011\u0004ֽjLY\u0010jb.'BJp\u0016\u001e\fTj\u001c-BA\u0002\u001cb=A\u001dl\u0017^\u0002LAQ~\u0019_\tz \u0001d3R\f\u0018'\u000b\b/SEr\u0006fWXض\u0001b(@Oe}+4n:hb\u0017S\u0011\rz\u0018MwNWL#ֵ$pD0$6QSE<A\u000e//@\u001fEGbq\u0014P\u0016(5\u0019\u0015yE\u0090\u00194u'\u0003rB_\u0019I\u0016ܾUȔz^\u0001CPh\u000e\u001byF)P,\u000b\u0019}Ve\u0003\u0005i<|I\r\t/ ;\u007f\u001e!\r7=CU/&y$/Cjsh\u001e1*j\u001d-\ri\u0014,i\u0017\u001eh\u0002c@KPKo}l!tz\u0011B`j&\u0007x\r\u000bه5ȈEdxމ\t+\u00190\u00166\u0017=\u001d\u007f\u0005Zǈ\u0017y\u00048>e0xS\u007f\u001adi%!bcz}mQ]9P؝\u000e\u0015\u00025~\u0018\"B0X]h/7\u0016\u0007(GW:\u0011\u0004Ø\r.:0L\u000e\u0011Hdk\f\u0016!\bVa\u001f\u0017`K\">?\u000e3z3ƊJϖdGh!8\u0016OlA(\u0011\u0005A\u0016}U\u0003.ҕ6\u000bY!\u0019!pT\u000fh+1jTI.8i\u0017\ns\\ƀM\f<\bW/sp\u007f\u000e>\u001e#%R++Jg\u0010\u000euҍb\u0015[h^j|\u0017vTT(O\u000b\u000b\u0001\u001e> \u000e9\u0018}uXb\fW%ߚ9ƴ\u001e\u0003\u001fD7\u001c\\\u000bqN3/\u001c4[< ݠ\u0016ր\u007fW[ȌN\u0014.-?\u0004# 3ީ\u0010ҁ\u000e]#ŭfތ\u0015p\u0010!\u0003`5\u0014AZtx\u000b\\\u000e˩S\f9\u0006#d_p\b#F-Qs\u0016U[y\u000f\t\u0012k̼r_\u0011\u0007v7\\~~/V#//]A#ip9?Rޓ\\\u001b\u0006\u0018%,%;\u0018d/\u0016usx\r{ik\u000f;/\u001a;q5@T4|Mx\u0006\u0006:TV'KX]>\u0013\u0012\u000boXV<aS*zsj8J\u0001UĤ`ǚ\u00176Nr,y\u007fI'5s\u000f]_5\u0003{Md%\bĤKװ;2\u0013 x\u0007\u001f\u001aRb#\u0018`FGvVפ8\u0082JTEԣƄ]G"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bu!5MK;tC\u001a$lkBEA3J\u00075G+J;X(", "", "1kPBf,(P\u001e~xm", "@dV\u0013h5<", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006c%7]\f/Di%2WL\u001c{=\u001c$lkB\\", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bv$=IL9k\n", "Ad[2V;", ">`a.`", "", ">q^0X:L@\u0019\r[n5z", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006a2?W}.EZ\u0016<]JJLD'\u0013weC\u00109", "1kPBf,+S'\u000f\u0002m", "0k^0^", "=m2.a*>Z z\nb6\u0006f9n\u000e7\tP~&!T", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006`.\u0013U\u0007\u001e7t\u001d*\\GEt\u0012(\u001evpF\u0017a;X\u0004|", "7mc2e5:Z\u0006~\tn3\f", "", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0017\u001eGm\u001dJ@\u00135`}\u001eFQ\u001e9TCCk=-\u0011weC\u00109\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJv>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[G=NL\u0015\f4mEidH\u000fYRAt%.!b|\u000eCT>2p6\u0006}\u00143i\u0005Ivm%d\u0003$3`Jp+GD\\@[ls{B\u0018q-+h\u001ek3@\u001don1\u001eRw", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "2hb=b::P ~]Z5{\u0010/O\r\u0016{B\t\u0017 V", "7mS2k\u0010GA\u0019\u0001\u0003^5\f", "", "Bqh\u001fX.Ba(~\b::n\u00053t\u007f5", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u001bu!5MK;tC\u001a$lkB\\", ">q^0X:L@\u0019\r\u000be;", "@dbB_;", "7me<^,\u001bZ#|\u0001", "/qVB`,Gb", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "2hb=b:>", "1qT.g,(\\vz\u0004\\,\u0004\u0010+t\u00042\u0005\u001c~&\u001bQx", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public final class ClauseData {
        private final Object block;
        public final Object clauseObject;
        public Object disposableHandleOrSegment;
        public int indexInSegment = -1;
        public final Function3<SelectInstance<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;
        private final Object param;
        private final Function3<Object, Object, Object, Object> processResFunc;
        private final Function3<Object, SelectInstance<?>, Object, Unit> regFunc;

        /* JADX WARN: Multi-variable type inference failed */
        public ClauseData(Object obj, Function3<Object, ? super SelectInstance<?>, Object, Unit> function3, Function3<Object, Object, Object, ? extends Object> function32, Object obj2, Object obj3, Function3<? super SelectInstance<?>, Object, Object, ? extends Function3<? super Throwable, Object, ? super CoroutineContext, Unit>> function33) {
            this.clauseObject = obj;
            this.regFunc = function3;
            this.processResFunc = function32;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = function33;
        }

        public final Function3<Throwable, Object, CoroutineContext, Unit> createOnCancellationAction(SelectInstance<?> selectInstance, Object obj) {
            Function3<SelectInstance<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> function3 = this.onCancellationConstructor;
            if (function3 != null) {
                return function3.invoke(selectInstance, this.param, obj);
            }
            return null;
        }

        public final void dispose() {
            Object obj = this.disposableHandleOrSegment;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof Segment) {
                ((Segment) obj).onCancellation(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            DisposableHandle disposableHandle = obj instanceof DisposableHandle ? (DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }

        public final Object invokeBlock(Object obj, Continuation<? super R> continuation) {
            Object obj2 = this.block;
            if (this.param == SelectKt.getPARAM_CLAUSE_0()) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1) obj2).invoke(continuation);
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function2) obj2).invoke(obj, continuation);
        }

        public final Object processResult(Object obj) {
            return this.processResFunc.invoke(this.clauseObject, this.param, obj);
        }

        public final boolean tryRegisterAsWaiter(SelectImplementation<R> selectImplementation) {
            if (DebugKt.getASSERTIONS_ENABLED() && !selectImplementation.getInRegistrationPhase() && !selectImplementation.isCancelled()) {
                throw new AssertionError();
            }
            if (DebugKt.getASSERTIONS_ENABLED() && ((SelectImplementation) selectImplementation).internalResult != SelectKt.NO_RESULT) {
                throw new AssertionError();
            }
            this.regFunc.invoke(this.clauseObject, selectImplementation, this.param);
            return ((SelectImplementation) selectImplementation).internalResult == SelectKt.NO_RESULT;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SelectImplementation<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SelectImplementation<R> selectImplementation, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = selectImplementation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doSelectSuspend(this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SelectImplementation<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14491(SelectImplementation<R> selectImplementation, Continuation<? super C14491> continuation) {
            super(continuation);
            this.this$0 = selectImplementation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.processResultAndInvokeBlockRecoveringException(null, null, this);
        }
    }

    public SelectImplementation(CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    private final void checkClauseObject(Object obj) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        Intrinsics.checkNotNull(list);
        List<SelectImplementation<R>.ClauseData> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((ClauseData) it.next()).clauseObject == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    private final void cleanup(SelectImplementation<R>.ClauseData clauseData) {
        if (DebugKt.getASSERTIONS_ENABLED() && !Intrinsics.areEqual(state$volatile$FU.get(this), clauseData)) {
            throw new AssertionError();
        }
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.ClauseData clauseData2 : list) {
            if (clauseData2 != clauseData) {
                clauseData2.dispose();
            }
        }
        state$volatile$FU.set(this, SelectKt.STATE_COMPLETED);
        this.internalResult = SelectKt.NO_RESULT;
        this.clauses = null;
    }

    public final Object complete(Continuation<? super R> continuation) {
        if (DebugKt.getASSERTIONS_ENABLED() && !isSelected()) {
            throw new AssertionError();
        }
        Object obj = state$volatile$FU.get(this);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj;
        Object obj2 = this.internalResult;
        cleanup(clauseData);
        return !DebugKt.getRECOVER_STACK_TRACES() ? clauseData.invokeBlock(clauseData.processResult(obj2), continuation) : processResultAndInvokeBlockRecoveringException(clauseData, obj2, continuation);
    }

    static /* synthetic */ <R> Object doSelect$suspendImpl(SelectImplementation<R> selectImplementation, Continuation<? super R> continuation) {
        return selectImplementation.isSelected() ? selectImplementation.complete(continuation) : selectImplementation.doSelectSuspend(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doSelectSuspend(kotlin.coroutines.Continuation<? super R> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1
            if (r0 == 0) goto L50
            r5 = r7
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r5 = (kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L50
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 == r0) goto L3d
            if (r1 != r2) goto L56
            kotlin.ResultKt.throwOnFailure(r4)
        L2c:
            return r4
        L2d:
            kotlin.ResultKt.throwOnFailure(r4)
            r5.L$0 = r6
            r5.label = r0
            java.lang.Object r0 = r6.waitUntilSelected(r5)
            if (r0 != r3) goto L3b
            return r3
        L3b:
            r1 = r6
            goto L44
        L3d:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.selects.SelectImplementation r1 = (kotlinx.coroutines.selects.SelectImplementation) r1
            kotlin.ResultKt.throwOnFailure(r4)
        L44:
            r0 = 0
            r5.L$0 = r0
            r5.label = r2
            java.lang.Object r4 = r1.complete(r5)
            if (r4 != r3) goto L2c
            return r3
        L50:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r5 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r5.<init>(r6, r7)
            goto L19
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.doSelectSuspend(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final SelectImplementation<R>.ClauseData findClause(Object obj) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ClauseData) next).clauseObject == obj) {
                obj2 = next;
                break;
            }
        }
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj2;
        if (clauseData != null) {
            return clauseData;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final boolean getInRegistrationPhase() {
        Object obj = state$volatile$FU.get(this);
        return obj == SelectKt.STATE_REG || (obj instanceof List);
    }

    private final /* synthetic */ Object getState$volatile() {
        return this.state$volatile;
    }

    public final boolean isCancelled() {
        return state$volatile$FU.get(this) == SelectKt.STATE_CANCELLED;
    }

    private final boolean isSelected() {
        return state$volatile$FU.get(this) instanceof ClauseData;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData r6, java.lang.Object r7, kotlin.coroutines.Continuation<? super R> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.selects.SelectImplementation.C14491
            if (r0 == 0) goto L21
            r4 = r8
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r4 = (kotlinx.coroutines.selects.SelectImplementation.C14491) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L21
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            goto L27
        L21:
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r4 = new kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            r4.<init>(r5, r8)
            goto L13
        L27:
            kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L44
            goto L43
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            kotlin.ResultKt.throwOnFailure(r3)
            java.lang.Object r0 = r6.processResult(r7)     // Catch: java.lang.Throwable -> L44
            r4.label = r1     // Catch: java.lang.Throwable -> L44
            java.lang.Object r3 = r6.invokeBlock(r0, r4)     // Catch: java.lang.Throwable -> L44
            if (r3 != r2) goto L43
            return r2
        L43:
            return r3
        L44:
            r1 = move-exception
            boolean r0 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r0 == 0) goto L57
            boolean r0 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r0 != 0) goto L50
            throw r1
        L50:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r4
            java.lang.Throwable r0 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r1, r4)
            throw r0
        L57:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation$ClauseData, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void register$default(SelectImplementation selectImplementation, ClauseData clauseData, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = false;
        }
        selectImplementation.register(clauseData, z2);
    }

    public final void reregisterClause(Object obj) {
        SelectImplementation<R>.ClauseData clauseDataFindClause = findClause(obj);
        Intrinsics.checkNotNull(clauseDataFindClause);
        clauseDataFindClause.disposableHandleOrSegment = null;
        clauseDataFindClause.indexInSegment = -1;
        register(clauseDataFindClause, true);
    }

    private final /* synthetic */ void setState$volatile(Object obj) {
        this.state$volatile = obj;
    }

    private final int trySelectInternal(Object obj, Object obj2) {
        while (true) {
            Object obj3 = state$volatile$FU.get(this);
            if (obj3 instanceof CancellableContinuation) {
                SelectImplementation<R>.ClauseData clauseDataFindClause = findClause(obj);
                if (clauseDataFindClause == null) {
                    continue;
                } else {
                    Function3<Throwable, Object, CoroutineContext, Unit> function3CreateOnCancellationAction = clauseDataFindClause.createOnCancellationAction(this, obj2);
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(state$volatile$FU, this, obj3, clauseDataFindClause)) {
                        this.internalResult = obj2;
                        if (SelectKt.tryResume((CancellableContinuation) obj3, function3CreateOnCancellationAction)) {
                            return 0;
                        }
                        this.internalResult = SelectKt.NO_RESULT;
                        return 2;
                    }
                }
            } else {
                if (Intrinsics.areEqual(obj3, SelectKt.STATE_COMPLETED) || (obj3 instanceof ClauseData)) {
                    return 3;
                }
                if (Intrinsics.areEqual(obj3, SelectKt.STATE_CANCELLED)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj3, SelectKt.STATE_REG)) {
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(state$volatile$FU, this, obj3, CollectionsKt.listOf(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(state$volatile$FU, this, obj3, CollectionsKt.plus((Collection<? extends Object>) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, ? extends Object> function1) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, obj2, function1.invoke(obj2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x002e, code lost:
    
        r1 = r4.getResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0036, code lost:
    
        if (r1 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0038, code lost:
    
        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x003f, code lost:
    
        if (r1 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0041, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0084, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object waitUntilSelected(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r7)
            r0 = 1
            r4.<init>(r1, r0)
            r4.initCancellability()
            r3 = r4
            kotlinx.coroutines.CancellableContinuation r3 = (kotlinx.coroutines.CancellableContinuation) r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = access$getState$volatile$FU()
        L14:
            java.lang.Object r5 = r2.get(r6)
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
            if (r5 != r0) goto L42
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getState$volatile$FU()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r6, r5, r3)
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.CancelHandler r0 = (kotlinx.coroutines.CancelHandler) r0
            kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(r3, r0)
        L2e:
            java.lang.Object r1 = r4.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L3b
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7)
        L3b:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L82
            return r1
        L42:
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L6b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getState$volatile$FU()
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r6, r5, r0)
            if (r0 == 0) goto L14
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r1 = r5.iterator()
        L5d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r1.next()
            access$reregisterClause(r6, r0)
            goto L5d
        L6b:
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData
            if (r0 == 0) goto L85
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r5 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r5
            r1 = r6
            kotlinx.coroutines.selects.SelectInstance r1 = (kotlinx.coroutines.selects.SelectInstance) r1
            java.lang.Object r0 = access$getInternalResult$p(r6)
            kotlin.jvm.functions.Function3 r0 = r5.createOnCancellationAction(r1, r0)
            r3.resume(r2, r0)
            goto L2e
        L82:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L85:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.waitUntilSelected(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(DisposableHandle disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    public Object doSelect(Continuation<? super R> continuation) {
        return doSelect$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public void invoke(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.STATE_COMPLETED) {
                return;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, SelectKt.STATE_CANCELLED));
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ClauseData) it.next()).dispose();
        }
        this.internalResult = SelectKt.NO_RESULT;
        this.clauses = null;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(SelectClause0 selectClause0, Function1<? super Continuation<? super R>, ? extends Object> function1) {
        register$default(this, new ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), function1, selectClause0.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(SelectClause1<? extends Q> selectClause1, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        register$default(this, new ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, function2, selectClause1.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p2, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        register$default(this, new ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p2, function2, selectClause2.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        SelectBuilder.DefaultImpls.invoke(this, selectClause2, function2);
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int i2) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = i2;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0015K\fArw\u001a[\u0018^1\u000fXT@Va\f\u001c(\u0012mKW\u000fZsxa}3t(RyPPpqHT", replaceWith = @ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @InterfaceC1492Gx
    public void onTimeout(long j2, Function1<? super Continuation<? super R>, ? extends Object> function1) {
        SelectBuilder.DefaultImpls.onTimeout(this, j2, function1);
    }

    public final void register(SelectImplementation<R>.ClauseData clauseData, boolean z2) {
        if (DebugKt.getASSERTIONS_ENABLED() && state$volatile$FU.get(this) == SelectKt.STATE_CANCELLED) {
            throw new AssertionError();
        }
        if (state$volatile$FU.get(this) instanceof ClauseData) {
            return;
        }
        if (!z2) {
            checkClauseObject(clauseData.clauseObject);
        }
        if (!clauseData.tryRegisterAsWaiter(this)) {
            state$volatile$FU.set(this, clauseData);
            return;
        }
        if (!z2) {
            List<SelectImplementation<R>.ClauseData> list = this.clauses;
            Intrinsics.checkNotNull(list);
            list.add(clauseData);
        }
        clauseData.disposableHandleOrSegment = this.disposableHandleOrSegment;
        clauseData.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(Object obj) {
        this.internalResult = obj;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(Object obj, Object obj2) {
        return trySelectInternal(obj, obj2) == 0;
    }

    public final TrySelectDetailedResult trySelectDetailed(Object obj, Object obj2) {
        return SelectKt.TrySelectDetailedResult(trySelectInternal(obj, obj2));
    }
}
