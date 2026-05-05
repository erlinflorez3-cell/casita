package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.Soundex;
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
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яį\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H~*,(w\u000ff\u000198D{H6ɟ[*%k\u00044:[,ڎK;c \u0006\"\u000fPVguwRZ\u0011Q\u0017\u0006,xrߚQU\u000f]\u001a\u000f8Cw?A`w=?f|6\u001b :\">z\r\u0001(9P\u0010|\u007fKK\"\u00128@\u0007:Z\rc\u0005\"\u0012\f@(\u0001,\\oN<bt]P/+\u0003\u007fBV'e:\u0005M\u001bl\\'\u0013vi\u001e9L?5\u001b*[\u0003\u0015pc?\t\ty=\u001bh/'AI{W<[\u0006Ϭ+ۀm֡\\#&\u000b\u0004\n`л&kZsO^\u000e@w)|Ɂ@\u0004\u001c\boT<n2f6Pcx\u0001\u0017XP0i\u000b\u000e\t&N\u0017S\u0005c1?\u001bt\u0017y;GY\u007f\b\u0013S6#/yQ_bRx\u0015IY@g?\u0019X=v\u0011:]K2\u001cp\u0011\u0007Z\n>\u0010\u00181\u0012\u0010\\\u0016m;i\u0003;!\u001aD\u0011HuA\u001d`\u0017\u00162`V\f:nDFZ\r\u001a'\\d3v\u0017T!2\u001f\u001b4T5@N\u0013hh\u0006\u000b9%>\u0011\u007flw:e]84wtE*\u0007k<fibA\u0002ic>l\u0019v\\MJ4\u001dX\u0015Q\u0004\u0010h)@\"`S1\u0010@\u001aR!$\u0013`J\" BpI\u0019\u000b x\u0007,\u0016Y|7j\u000bl\u001e\tl3R\u000e0$=\u0017\u000f%tp\u001er)M:Bx\"[L\u00185a4cw\u00014+.7\u0003\u0002T_gzR\u0013l^\u001ccR8\u0016HD\u00023KX'~W=21S$\u000be\u007fXB+\tP\u0012\u000fis^k\u0016t\t,\u000fu\u0011O\u001d\u001b0OvrQ\u0013-\u0004\b;^zu&\u001d\u0017i\u0019ar1\u001clRFA\u001d\u001fL*I{0WM-qiM\u001a\u0006YG\u0015\u0010h2\u000e<Uz\u000fT7\u0016\b:\u0010.o\u0011\\\u000e6I\u0011aY-IR(z_ZH\u0019\u0003NBQ}\u001b\u0011`A\u00133\u0007<[WG}\u0015\u0012\\C~5sl#\u0001\u000eC\\jͫwM\u0004tnI+r]Ums\u0014\u0011l\u001eZ  \n*0ߎ\u0016&C\u0001f]hj@\by\u001e\\$Kd\u0015<7fb\f\u0003ޑ\u0011\f\u001ewi(z.\t\u0010\u0013%~Zsia>\u000b\u0007;nz\u0015qUoO5ܣ\u0003\u00199~\t;7f}HZ5\nw\u0011f-\u001a1i}}ݝ)5J5I!.:\u0011\rKci,\u00128\u0014GW0\u001aORՋ\u001eEPP|39\u007fS\u0010z>D#U\u0013Y\u0015z MjNP4/\u0013\u000blT\u001e\u001f\r)O!zr1\\P\u000e6q\u0019\u0011\u0019T)5N+C\rɘ3NC;%al*&*V\u0004?\fM8 U\u000f=/j@&f8hK>$7.b0\u0014YPh\u0010<4\rr898:]GK\u0002Ai\"y\u0006\fX)Ak4A{l\u0007O{l\u0012y\u001e\u0017\u0011RIV(y]T+N?M\\\u001e!fH}k(h\u0015\u0010\u0016+%M56Pq*]R\u0001r\u0002N\nI[3yVy1^]N\u0004-i\u000e\u0006@SV\u0006\u0002V\u0016Jrztlpf>bxm|t:4\\\u0011\r;v\u0011ACvv,*G7G*\f\u0011U-\u001f\u0004sTn-?FW\u001beA;s6<)\u0003hm=\u000e87!r.*\\3T\u001dU\u001c=XRl-\u00114A]8pJ\\\u0015\u001cAGZf+\u0005\\b2IHKAGS1\u0019F6\b\u0007G@\u001bUaqB\u0001+\fS?B=yc\f7!2_\u0013}`ofi0}qZ\u001f$\buL\u000fM\u0012a=ZrI}S,sm@.LO**\u0006\u0004o\u0018E_Sr}j;ns\u0006FV.Dj\\#uw)w\u0018)\u0002\u0018\"o\feBq\u0013\u0014GO\u0005*u\u0012\u0015Cen\n\rT\rs\u0019e\b6-A\u0017\u0015\u0010}rp/W8e/\u000bhl\u001ay\u0004Hߒ`NyuO\"8\u0014Ў\u0011lc\u0019-\u001eVmݓ7*\r;\u000f@@`ϖ~x\u001dFi{zT{tx{L)\u000b\t32ې-Z\u0012\u001b\b&.v\u001c0vze#\u03782_soRBZ\n!5\u0011\n&6)u0_?\u0004|!TGߘ\n\u0006J\u0007w\u0016`\u0013\u001b9K\u00136E\u0004xwFG\u0005I`*!+\u001cȑc`\u0016TzT(\u001c5^)\u0001\u0003h\bu\u0001J$mZ#֪}Jbef\u0015\u00169œV\u0007R\u0004ƪu\b\u0010Ѐ\u000fY\u001b)\nLRi618%1l\u0001PkWʙ{\u0006K&\u0002\u0010IQ3\u0014\u0005GAyw\u001fqMCo?-\u0017P+2K+$\u0011r[u\u001cNw\u0003zA\u0007-V\u0010q\u0011\u0015G3\u001b\t!$.:C\u0006\nKK)bJ@\u0004nNڄ-\t\tuZ\u001b\u007f8+\bf#d\u0014Es\r'ѭ0\n\u0011\u0012Z\u0010\u0018|\u0017tXl\"\b*Nj\u001a\u001aK1({\u0011<>ňT{o\u0001r\u0003_A_B4Hf\u0010q\u0015c\u0005c\u0007CVԼ\u0018~O,]\u0018D+\u0016nͭGY\u0010\u0011/\\+D8\u0003\u0019/q\u0014f%֞6\\vQ*{P0ڳ!k]S\nz\u000b\u001cß`\u0010\u0015*hc:\u001b8D|Cu\u0007&\u0001êk\u001dM^\u0013\u001c3@\u001er@J8\u000b+{\u0019 *<\u0017-):)kraw/r\u0013\u00043 *A\u0006u] A>\u0002J\u00184]X)sh^5.*B5\u0011!9{l\nx\nٜV\nOblfB\f§v8\r\u001a!4hXфN\u0002b?h^R\u0006ˤXTYo\rP\"qE\u0016Ɛ&\u001aHb\rb'1ä\u000eN\u0018xq\u001f}3ߥd$/#\u0001>6{\u000b\ff\frzA\u0006Zk˻DE/ J\u0014P{ȳ*_\u000ew!\u0001O\u0015t\u0004أ<l\u0016`I6\u0004y\u001d\u0002ԶZZ\u0017&J\u00138y~\u0014G1\u00193Z<ߪY~n\u001b9\u0001g\u001e\u0006.\u000f*\u0004lrq<NЎ^xi\u0016:7oM;_\u000b|\u000br\u001cXf@\u0007*\u0011^W\u0015\rc#\u0013ħc2\u0018OD'?{\u0019iP\u007fc\u007f-\u0018LymG\n&!f#\u000e}Q\u000f\nO\r40e\u0017Պ\"&)\u0005N6px7UʒY8/\n\u0013VOtǼO%A5/v\u000e\u0005݃\u0016W\u0017\u0018)s!MGs]\u007f\u0005dqkav\u0019|zLy$r5ަ|\u001e#)@M\u0015>(\u0016e\r[bZ&\u0005N\u000e+\fHNv\u001d\"֛dd\u0005c\u0015q5M \t\u0019Y\u0003\u0010bPJ%%O3S-6ߛk+oC3RG!\\3m7\u001bbФ֣\r.WȮybG\u001e٤T(?8\u001e\u0013b\u0006e9I^;:պۮPn\u0004ҩi8\u007f\u0006я\u000fgqjh/{D+@\u0010T]\u0002Ѿߘ`E-ɕ'\r(\u001cڔ\u001eB&H\u000b\u001dlK`vJ\bv\u0001mX`|\bCӘ?M+QCV\u0006\u000f۴\"u+BI\n\\TŬ\u000e~xfB@]=bwϖ\u0007I\u001d2H{j@Փ8ayOvdG0ƍa,&{\u000b;K\u00014(ֺ^T$O;Irx\u0004%ؾ?\u0003t2q\u000f\u001f\u0001ѱoI2w\"\r$:ԣ(\tk(:\u0019kOƾmG\u001aEhhfE̮J}\"JP\u0018DWƇ\u0014%!\u0001\u000b#\u0002ec\u007f¨]B?0HT\u0019Pީ5\tC\u0019I&#Bؔs:d\u007f3\\A\u0013S8?*e|6\bxrޒ`L\u007fPLH\u0001%IO&4к,#\u001bXE|I_ûk{G\u0004\u0002\r\u0014\u001d\u07bc<\u0002IFK$yF@@ۍ?\u0010r\u0010.fJ\u000eʆ(\\I_=2\u0013^μn\u00152_\u0011z\nr\u0019!ֆ?6\u00021U\u0015H|M\u0004Ǧ5\u0005]r\u001aF\u0015tʉlV\f{6\u001dBNC+ԩi\u0017s%\u0019\u0017\u0017M}*\u0016+\n\u0005\u0005sԭd>%@E.Xce\n$kj=S]ޓǥ8C\u001aр\nf;bɺ\n#Q}3L7|~T\u0017]c\u001b-P\u0019+A\u001bˬo\bPh\u001b1bTٹ:5s\u0003kivn֠V?P\u0017B\\\u000b:AQא^v![\";\u0019Xek\u0015i\u0001\u007f,\u001bJEފX Wt/82-\u0012\u0002\u001f\u001e\u0010~n\bcxĩ&WW&\u001e\u0011.NP\u001b(COP+ ϗ\fV=L&Z6o\u001c\u0019يO|\u0002!\rJ\u0019y\u0015!7@JmIc)ssQ$\rIT 3ݡ.!\u001aW*\u001d,\u0003]\u0007f\"Pg\\xJ^ź\t\u0002Q\u001cR+\u0001*y.\"\b\u001dq\u001c)19;]fw2{\u0004V_^§}IX#.\u001ehf\\J\u00054BhwPof®\u0018\u0014X\u001d%\u000f8mͻE1\u0010Pop¿ʱT*?Ǽa1\u000e\u0004ŦX}\u0016\ri9Əٽ\u0003\u0001uƶD/[Sەd8u\u0001\u0006DY\u0003\u0013?o\u0007ѿDTd%MrB\u0015\n.`$P\u0015CG:y Xq6ܮ(\t%\u000bm\u0011N\u001a\"\u001fƓY\u0015*\u000fbM>K~d\u007fC\u0013p=A\n:&gψ\f\r6s\u0010\u0002gOٖ`#uJȢ2K\u0017\u0012YG\u0014\u000bf/|r\nwÁ+H$qviOSGA(z\u05cd6a`)\u0005'arU\u00151>\u0017u\frsv\u00151Dn4n7v2tv;\u001b1Ӣk2\u0014\u001a[UY$\rMjFɵ{+]rm\u0013\rYC8Ю\f4J7\u0010qSiWV\u0011\"П\u001ckQ \u000f^\u0012\u0001eJ~.)|u\u0017}\u0003f\u0010LUDmi9Sd8n\u0015ZV\u0003\u0004^\u0001sRgНhӜx\u0005fƄ.35\u0015\u0013\u000f@\u001f\rp\u0014MC\u0001>nv\u0381PŴQ\b ۼ\u001cK/k\u0004\u0004$\u0001\u000e%m۽M\u008c\u001f\u0004Y\u00058\fS5;\u0004|\u0019\\\u0016\"+n_cz'NIE%^\u001dґ1߳ht\u0016ݺ#\u0012XxH1\u000fY\nZfI\u0013\u001c#+Ʊ)Pev7F#\u0011cR0\u0016W;M\u0007\u000f+Բyh\u0013_-)9\r,+\tL_L\u000bpS8n++MP^\u001cR\u0011û{ŷ\u0002\u0006\u0010Ξ`\u001a\u0007E\\?u_y<\n\tp{sS|f\u0001vL\u0003!#\u0001ڌ\u0013ȥ*<PԍC\u00153+\u0011\u00113Cb\u0016\u0002G}%Kg\u001fό\u0011ż\u001bqh\u000fc4UL\u0018_r;O\u007f\u000er\"ۭ ӫ0/\u0018ܜ\u001et}H\u000f\u001e[:%Ϙ\nèzq\u001dž!@\"Qj\u000f\r.H\"8\u0006$G2\u001c\u0017b*,COiC_ϽZځt\u00059ۙE{\u0001\u00077R9c9ȥ\u0001ȃL1!ğ\"J-\u0016|DYp\tǊOۊ\"/8ހ\u000b\u0015|]<c\u001a\u0010O˓cҒ\u001dc3ȅ\u000fmSiJB4Q`͓\u001c֓\\8!͙3cf\u0016+n-_ ؓtۉFn\u0011ڳ\u00027\u001b;hjkJv\u0013ԃ*tCI3W}/y\u001c\u001dAmUd2k'Л'ET%\u007fc\u00175eX))\"4p(QÐ\bɜMNhσ\u0014?ok\u000ep1X6֫>\u07b6wT)ȯyOxh8N\u0017?VIy3k+Q\u001e]3fݗ\u0017هE\u0001mȫEH\u000f67F\u0018\u0010[\"fu!\u0002Qbmç\u0017тr;1Ͱ:^AF4o\u0003<u4?٠mÕ\bCq \b\u001b^ bA:^*&^\faKn=\u001e/~\u000eRŦ$م:HzDA\u0010E\u000f\fY^{xpMٚ\b؎O\u0005\u001cٻ\u001d^Hs!\u000f\u007f`Kϳ?ڜ\u0019Q\u001c͎o\"\u001bz;\u0005Rj@ϒGŢva?і8U;>.jR~vXսN^B\u0014C_r|T?\b\u0014\u00048TM%!2\u0011QxR\b\u001biB.}4?Hl\u0007g[)\u001ab#FpN\t,$ng\u0005ŵ7ӯ\u0016Rt٘\u0010K]>aSx\rfڈ3ʂs\r\u001aΦH\u0019eCm\u0006\u001bF\u001aӓ'ۮ`pOʶ\u0007\u0001ejc%̫\"дy"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "", "B`Q9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*}/DHy\u001d>mkq>", "/mR5b9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "1`[9X+\u001bg\u0001z\u0006", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DCz%7k%\u0016IN\u0011", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DG}/\r", "1`_.V0Mg", "", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "\nrTA \u0006\u0017", "", "1k^@X+", "5dc\u0010_6LS\u0018", "u(I", "1n[9X*MW\"\u0001XZ3\u0004\t.I\t)\u0006M\t\u0013&Ky\u0017", "5dc\u0010b3ES\u0017\u000e~g.Z\u00056l\u007f'_I\u0002!$Ok\u001d@\u0001.", "1n[9X*MW\"\u0001hh<\n\u0007/I\t)\u0006M\t\u0013&Ky\u0017", "5dc\u0010b3ES\u0017\u000e~g.j\u0013?r}(_I\u0002!$Ok\u001d@\u0001.", "1ta?X5M5&\t\u000bi", "5dc\u0010h9KS\"\u000e\\k6\r\u0014", "1ta?X5M5&\t\u000bi\f\u0006\b", "5dc\u0010h9KS\"\u000e\\k6\r\u0014\u000fn~", "1ta?X5M5&\t\u000bi\u001a\u0004\u0013>I\t'{S", "5dc\u0010h9KS\"\u000e\\k6\r\u0014\u001dl\n7_I\u007f\u0017*", "1ta?X5MA \t\n", "1ta?X5MA \t\n>5{", "2dU2e9>R\u0007\u0006\u0005m\u001e\n\r>e\u000e", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=#", "3mS g(<Y", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9qE\u0006\u0013DU{&\r", "5q^Bc\u000e:^\u007f~\u0004", "5q^Bc\u000e:^\u0007\u000evk;", "5q^Bc:", "", "7mb2e;\u001c])\b\n", "7r6?b<I3\"}", "7r=<W,", "<nS266N\\(", "<nS266N\\(l\nZ*\u0003", ">`a2a;", "5dc\u001dT9>\\(", ">d]1\\5@@\u0019|ve*\r\u0010+t\u007f\u0010wM\u0007%", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xIz/B]\r4%m%\u0004", "Ahi2", "5dc \\A>\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "Ak^Af", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "Ak^Af\u000e:^\u007f~\u0004", "Ak^Af\u000e:^\u0003\u0011\u0004^9", "Ak^Af\u000e:^\u0007\u000evk;", "Ak^Af\u001aBh\u0019", "5dc _6Ma\u0007\u0003\u0010^", "And?V,\"\\\u001a\t\bf(\f\r9ng$\u0007", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9oI\u00015@G\b0Dk\u0016\u0012VDEx<\u001a$lkB\\", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "AsP?g\u001aMO\u0017\u0005", "5dc!T)ESW\f\u000bg;\u0001\u0011/_\r(\u0003@|%\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d,?hl\u001c4t\u0016\u0004", "/ce.a*>0-", "", "/l^Ba;", "/mR5b9", "7mS2k", "/mR5b9\"\\\u0018~\u000e", "/o_2a+,Z#\u000e", "D`[BX", "0`b56<K`\u0019\b\n@9\u0007\u0019:", "0dV6a\u0010Ga\u0019\f\n", "1gX9W\nH\\(z~g:X\u0012CM{5\u0002N", "5q^Bc", "1kT.e\u001aE](`vi", "1k^@X", "<na:T3\u001cZ#\rz", "1n]AT0Gat\b\u000f@9\u0007\u0019:M{5\u0002N", "1n]AT0Gaz\f\u0005n7d\u0005<k", "2`c.45<V#\fih\u000bx\u0018+I\t'{S", "5`_\u0019X5", "2`c.<5=S,", "2`c.<5=S,m\u0005=(\f\u0005\u000bd~5{N\u000f", "2`c.<5=S,m\u0005=(\f\u0005\u000bn}+\u0006M", "5`_ g(Kb", "3mS\u0014e6N^", "3mS\u0016a:>`(", "3mbBe,,b\u0015\f\n^+", "4hg\u001dT9>\\(Z\u0004\\/\u0007\u0016=F\n5", "4ha@g\nAW }", "4na\u000e_3\u001dO(z", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2`c.", "4na\u0012T*A2\u0015\u000ev", "4na\u0012T*AB\u0015\u0003\u0002L3\u0007\u0018", "5q^Bc\u0010GR\u0019\u0012", "1nd;g", "5q^Bc\bNf", "5q^Bc\u0010GR\u0019\u0012ih\b{\b<e\u000e6", "5q^Bc\u0012>g", "5q^Bc\u0016;X\u0019|\nD,\u0011", "5q^Bc\u001aBh\u0019", "5q^Bc\u001aE](\r", "", "5q^Bc\u001aHc&|zB5}\u0013<m{7\u007fJ\nw!T", "And?V,\"\\\u001a\t\bf(\f\r9n", "", "7mS2k\u0010G1)\f\b^5\fj<o\u00103", "7mS2k\u0010G5&\t\u000bi", "7mS2k\u0010G>\u0015\fzg;", "7mb2e;\u001ac,", "7mb2e; `#\u000f\u0006l", "7mb2e;,Z#\u000e\t", "9dh@", "", ";`a8:9Hc$", ";ne245<V#\f\t", "=qX4\\5:Z\u007f\txZ;\u0001\u00138", "<df\u0019b*:b\u001d\t\u0004", ";ne299H[", "@d\\<i,,])\fx^\u000e\n\u0013?p", ";ne2:9Hc$", "=eU@X;", ";ne2:9Hc$`vi\u001b\u0007", ";ne2<5M]z\f\u0005n7]\u00169m", ";ne2F3Hbzz\u0006M6", ";ne2G6", "EqXAX9", "<nS2", ">`a2a;\u001a\\\u0017\u0002\u0005k\u001b\u0007l8d\u007f;", ">`a2a;\"\\\u0018~\u000eM6X\u0012-h\n5", "@`f\"c+:b\u0019", "@dR._*NZ\u0015\u000ezF(\n\u000f=", "@dR<e+ `#\u000f\u0006L6\r\u0016-ec1|J\u000e\u001f\u0013Vs\u0018E", "@dR<e+ `#\u000f\u0006e,\u000b\u0017\ra\u0007/iJ\u0011$\u0015GS\u0017=\u00012=U\r$Avu7L", "@dR<e+ `#\u000f\u0006e,\u000b\u0017\ra\u0007/iJ\u0011$\u0015GS\u0017=\u00012=U\r$Av\u0004=IPJ", "9dh", "@d\\<i,\u001a\\\u0017\u0002\u0005k:", "@d\\<i, `#\u000f\u0006", "@d\\<i, `#\u000f\u0006l", "AsP?g", ":d]", "@d\\<i,,Z#\u000e\t", "@db2g", "@dbAb9>1)\f\b^5\fj<o\u00103[I\u007f", "A`e26<K`\u0019\b\n@9\u0007\u0019:E\t'", "AdT8", "Adc", "AjX=", "AjX=:9Hc$", "AjX=G6 `#\u000f\u0006>5{", "Ak^A", "Ak^A<5=S,h{@9\u0007\u0019:S\u00072\u000b$\n\u0016\u0017Z", "Ak^Af\fGRt\u0006\u0002B5{\tB", "Ak^Af\fGRt\u0006\u0002B5{\tB$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "Ak^Af\fGR|\by^?", "Ak^Af\fGR|\by^?;\u0016?n\u000f,\u0004@z$\u0017No\nJv", "Ak^Af\u001aMO&\u000e^g+|\u001c", "Ak^Af\u001aMO&\u000e^g+|\u001cmr\u00101\u000bD\t\u0017\u0011To\u0015<r35", "And?V,\"\\\u001a\t\bf(\f\r9ni)", "AsP?g\u000b:b\u0015", "/tg", "=aY2V;$S-", "AsP?g\u000eK])\n", "2`c.>,R", "AsP?g\u0015HR\u0019", "Bn32U<@A(\f~g.", "BnBAe0GU", "BqX:G(BZ\u0007\u0006\u0005m:", "Bqh\u000ea*A]&", "Bqh\u000ea*A]&=\bn5\f\r7ey5{G\u0001\u0013%G", "CoS.g,", "CoS.g,\u001a\\\u0017\u0002\u0005k:", ">qTC\\6Nazz\u0006L;x\u0016>", "<df\u0014T7,b\u0015\f\n", "CoS.g,\u001ac,", "CoS.g,\u001c]\"\u000evb5\u000bp+r\u0006", "CoS.g,\u001c]\"\u000evb5\u000bp+r\u0006\u0011\u0006R", "CoS.g,']\u0018~", "CoS.g,']\u0018~d_\u000e\n\u0013?p", "CoS.g,)O&~\u0004m\u0015\u0007\b/", "CoS.g,-]\bzwe,d\u0005:s", "Dda6Y@\u001dO(zVg*\u007f\u0013<s", "Dda6Y@\u001dO(zVg*\u007f\u0013<s>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "Dda6Y@)O&~\u0004m\b\u0006\u00072o\r6", "Dda6Y@)O&~\u0004m\b\u0006\u00072o\r6:M\u0011 &Kw\u000e6\u0004%<Yy.7", "/tg\u0016a+>f", "/cS?X:L", "2`c.<5=S,~\t", "5q^Bc\bLA(\f~g.", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "<nS2<5=S,", "Ak^A<5=S,", "CoS.g,\u001dO(z^g+|\u001c", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SlotWriter {
    private ArrayList<Anchor> anchors;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private MutableIntObjectMap<MutableObjectList<Object>> deferredSlotWrites;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private PrioritySet pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startStack = new IntStack();
    private final IntStack endStack = new IntStack();
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    private final int dataAnchorToDataIndex(int i2, int i3, int i4) {
        return i2 < 0 ? (i4 - i3) + i2 + 1 : i2;
    }

    public final int dataIndexToDataAnchor(int i2, int i3, int i4, int i5) {
        return i2 > i3 ? -(((i5 - i4) - i2) + 1) : i2;
    }

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime_release();
        this.calledByMap = slotTable.getCalledByMap$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final int getSlotsSize() {
        return this.slots.length - this.slotsGapLen;
    }

    public final boolean isNode() {
        int i2 = this.currentGroup;
        return i2 < this.currentGroupEnd && SlotTableKt.isNode(this.groups, groupIndexToAddress(i2));
    }

    public final boolean getCollectingSourceInformation() {
        return this.sourceInformationMap != null;
    }

    public final boolean getCollectingCalledInformation() {
        return this.calledByMap != null;
    }

    public final boolean isNode(int i2) {
        return SlotTableKt.isNode(this.groups, groupIndexToAddress(i2));
    }

    public final int nodeCount(int i2) {
        return SlotTableKt.nodeCount(this.groups, groupIndexToAddress(i2));
    }

    public final int groupKey(int i2) {
        return SlotTableKt.key(this.groups, groupIndexToAddress(i2));
    }

    public final Object groupObjectKey(int i2) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        if (SlotTableKt.hasObjectKey(this.groups, iGroupIndexToAddress)) {
            return this.slots[SlotTableKt.objectKeyIndex(this.groups, iGroupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int i2) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(i2));
    }

    public final Object groupAux(int i2) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        return SlotTableKt.hasAux(this.groups, iGroupIndexToAddress) ? this.slots[auxIndex(this.groups, iGroupIndexToAddress)] : Composer.Companion.getEmpty();
    }

    public final boolean indexInParent(int i2) {
        int i3 = this.parent;
        return (i2 > i3 && i2 < this.currentGroupEnd) || (i3 == 0 && i2 == 0);
    }

    public final boolean indexInCurrentGroup(int i2) {
        return indexInGroup(i2, this.currentGroup);
    }

    public final boolean indexInGroup(int i2, int i3) {
        int iIndexOf;
        int capacity;
        if (i3 == this.parent) {
            capacity = this.currentGroupEnd;
        } else if (i3 > this.startStack.peekOr(0) || (iIndexOf = this.startStack.indexOf(i3)) < 0) {
            int iGroupSize = groupSize(i3);
            capacity = iGroupSize + i3;
        } else {
            capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(iIndexOf);
        }
        return i2 > i3 && i2 < capacity;
    }

    public final Object node(int i2) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))];
        }
        return null;
    }

    public final Object node(Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final int getParent() {
        return this.parent;
    }

    public final int parent(int i2) {
        return parent(this.groups, i2);
    }

    public final int parent(Anchor anchor) {
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void close(boolean z2) {
        this.closed = true;
        if (z2 && this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final void reset() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final Object update(Object obj) {
        if (this.insertCount > 0 && this.currentSlot != this.slotsGapStart) {
            MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
            if (mutableIntObjectMap == null) {
                mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
            }
            this.deferredSlotWrites = mutableIntObjectMap;
            int i2 = this.parent;
            MutableObjectList<Object> mutableObjectList = mutableIntObjectMap.get(i2);
            if (mutableObjectList == null) {
                mutableObjectList = new MutableObjectList<>(0, 1, null);
                mutableIntObjectMap.set(i2, mutableObjectList);
            }
            mutableObjectList.add(obj);
            return Composer.Companion.getEmpty();
        }
        return rawUpdate(obj);
    }

    private final Object rawUpdate(Object obj) {
        Object objSkip = skip();
        set(obj);
        return objSkip;
    }

    public final void appendSlot(Anchor anchor, Object obj) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i2 = this.currentSlot;
        int i3 = this.currentSlotEnd;
        int iAnchorIndex = anchorIndex(anchor);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(iAnchorIndex + 1));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
        insertSlots(1, iAnchorIndex);
        if (i2 >= iDataIndex) {
            i2++;
            i3++;
        }
        this.slots[iDataIndex] = obj;
        this.currentSlot = i2;
        this.currentSlotEnd = i3;
    }

    public final void trimTailSlots(int i2) {
        ComposerKt.runtimeCheck(i2 > 0);
        int i3 = this.parent;
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i3));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i3 + 1)) - i2;
        ComposerKt.runtimeCheck(iDataIndex >= iSlotIndex);
        removeSlots(iDataIndex, i2, i3);
        int i4 = this.currentSlot;
        if (i4 >= iSlotIndex) {
            this.currentSlot = i4 - i2;
        }
    }

    public final void updateAux(Object obj) {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (!SlotTableKt.hasAux(this.groups, iGroupIndexToAddress)) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, iGroupIndexToAddress))] = obj;
    }

    public final void insertAux(Object obj) {
        if (!(this.insertCount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int i2 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        if (SlotTableKt.hasAux(this.groups, iGroupIndexToAddress)) {
            ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        insertSlots(1, i2);
        int iAuxIndex = auxIndex(this.groups, iGroupIndexToAddress);
        int iDataIndexToDataAddress = dataIndexToDataAddress(iAuxIndex);
        int i3 = this.currentSlot;
        if (i3 > iAuxIndex) {
            int i4 = i3 - iAuxIndex;
            if (!(i4 < 3)) {
                PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
            }
            if (i4 > 1) {
                Object[] objArr = this.slots;
                objArr[iDataIndexToDataAddress + 2] = objArr[iDataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[iDataIndexToDataAddress + 1] = objArr2[iDataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, iGroupIndexToAddress);
        this.slots[iDataIndexToDataAddress] = obj;
        this.currentSlot++;
    }

    public final void updateToTableMaps() {
        this.sourceInformationMap = this.table.getSourceInformationMap$runtime_release();
        this.calledByMap = this.table.getCalledByMap$runtime_release();
    }

    public final void recordGroupSourceInformation(String str) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, str);
        }
    }

    public final void recordGrouplessCallSourceInformationStart(int i2, String str) {
        if (this.insertCount > 0) {
            MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
            if (mutableIntObjectMap != null) {
                SlotTableKt.add(mutableIntObjectMap, i2, groupKey(this.parent));
            }
            GroupSourceInformation groupSourceInformationGroupSourceInformationFor = groupSourceInformationFor(this.parent, null);
            if (groupSourceInformationGroupSourceInformationFor != null) {
                groupSourceInformationGroupSourceInformationFor.startGrouplessCall(i2, str, getCurrentGroupSlotIndex());
            }
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        GroupSourceInformation groupSourceInformationGroupSourceInformationFor;
        if (this.insertCount <= 0 || (groupSourceInformationGroupSourceInformationFor = groupSourceInformationFor(this.parent, null)) == null) {
            return;
        }
        groupSourceInformationGroupSourceInformationFor.endGrouplessCall(getCurrentGroupSlotIndex());
    }

    private final GroupSourceInformation groupSourceInformationFor(int i2, String str) {
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map != null) {
            HashMap<Anchor, GroupSourceInformation> map2 = map;
            Anchor anchor = anchor(i2);
            GroupSourceInformation groupSourceInformation = map2.get(anchor);
            if (groupSourceInformation == null) {
                groupSourceInformation = new GroupSourceInformation(0, str, 0);
                if (str == null) {
                    int iGroupSize = i2 + 1;
                    int i3 = this.currentGroup;
                    while (iGroupSize < i3) {
                        groupSourceInformation.reportGroup(this, iGroupSize);
                        iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
                    }
                }
                map2.put(anchor, groupSourceInformation);
            }
            return groupSourceInformation;
        }
        return null;
    }

    public final void updateNode(Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void updateNode(Anchor anchor, Object obj) {
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    public final void updateParentNode(Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void set(Object obj) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = obj;
    }

    public final Object set(int i2, Object obj) {
        return set(this.currentGroup, i2, obj);
    }

    public final int slotIndexOfGroupSlotIndex(int i2, int i3) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i2));
        int i4 = iSlotIndex + i3;
        if (!(i4 >= iSlotIndex && i4 < dataIndex(this.groups, groupIndexToAddress(i2 + 1)))) {
            ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + i3 + " for group " + i2);
        }
        return i4;
    }

    public final Object set(int i2, int i3, Object obj) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(slotIndexOfGroupSlotIndex(i2, i3));
        Object[] objArr = this.slots;
        Object obj2 = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = obj;
        return obj2;
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i2 = this.currentSlot;
        this.currentSlot = i2 + 1;
        return objArr[dataIndexToDataAddress(i2)];
    }

    public final Object slot(Anchor anchor, int i2) {
        return slot(anchorIndex(anchor), i2);
    }

    public final Object slot(int i2, int i3) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i2));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i2 + 1));
        int i4 = i3 + iSlotIndex;
        if (iSlotIndex > i4 || i4 >= iDataIndex) {
            return Composer.Companion.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i4)];
    }

    public final void forEachTailSlot(int i2, int i3, Function2<? super Integer, Object, Unit> function2) {
        int iSlotsStartIndex$runtime_release = slotsStartIndex$runtime_release(i2);
        int iSlotsEndIndex$runtime_release = slotsEndIndex$runtime_release(i2);
        for (int iMax = Math.max(iSlotsStartIndex$runtime_release, iSlotsEndIndex$runtime_release - i3); iMax < iSlotsEndIndex$runtime_release; iMax++) {
            function2.invoke(Integer.valueOf(iMax), this.slots[dataIndexToDataAddress(iMax)]);
        }
    }

    public final int slotsStartIndex$runtime_release(int i2) {
        return slotIndex(this.groups, groupIndexToAddress(i2));
    }

    public final int slotsEndIndex$runtime_release(int i2) {
        return dataIndex(this.groups, groupIndexToAddress(i2 + 1));
    }

    public final int slotsEndAllIndex$runtime_release(int i2) {
        return dataIndex(this.groups, groupIndexToAddress(i2 + groupSize(i2)));
    }

    private final int getCurrentGroupSlotIndex() {
        MutableObjectList<Object> mutableObjectList;
        int iSlotsStartIndex$runtime_release = this.currentSlot - slotsStartIndex$runtime_release(this.parent);
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        return iSlotsStartIndex$runtime_release + ((mutableIntObjectMap == null || (mutableObjectList = mutableIntObjectMap.get(this.parent)) == null) ? 0 : mutableObjectList.getSize());
    }

    public final void advanceBy(int i2) {
        if (!(i2 >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (i2 == 0) {
            return;
        }
        int i3 = this.currentGroup + i2;
        if (!(i3 >= this.parent && i3 <= this.currentGroupEnd)) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + Soundex.SILENT_MARKER + this.currentGroupEnd + ')');
        }
        this.currentGroup = i3;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i3));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
    }

    public final void seek(Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void skipToGroupEnd() {
        int i2 = this.currentGroupEnd;
        this.currentGroup = i2;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i2));
    }

    public final void beginInsert() {
        int i2 = this.insertCount;
        this.insertCount = i2 + 1;
        if (i2 == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void endInsert() {
        if (!(this.insertCount > 0)) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i2 = this.insertCount - 1;
        this.insertCount = i2;
        if (i2 == 0) {
            if (!(this.nodeCountStack.getSize() == this.startStack.getSize())) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            restoreCurrentGroupEnd();
        }
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        startGroup(0, Composer.Companion.getEmpty(), false, Composer.Companion.getEmpty());
    }

    public final void startGroup(int i2) {
        startGroup(i2, Composer.Companion.getEmpty(), false, Composer.Companion.getEmpty());
    }

    public final void startGroup(int i2, Object obj) {
        startGroup(i2, obj, false, Composer.Companion.getEmpty());
    }

    public final void startNode(int i2, Object obj) {
        startGroup(i2, obj, true, Composer.Companion.getEmpty());
    }

    public final void startNode(int i2, Object obj, Object obj2) {
        startGroup(i2, obj, true, obj2);
    }

    public final void startData(int i2, Object obj, Object obj2) {
        startGroup(i2, obj, false, obj2);
    }

    public final void startData(int i2, Object obj) {
        startGroup(i2, Composer.Companion.getEmpty(), false, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    private final void startGroup(int i2, Object obj, boolean z2, Object obj2) {
        int iGroupSize;
        GroupSourceInformation groupSourceInformationSourceInformationOf;
        int i3 = this.parent;
        byte b2 = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (b2 != false) {
            int i4 = this.currentGroup;
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i4));
            insertGroups(1);
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            int iGroupIndexToAddress = groupIndexToAddress(i4);
            ?? r14 = obj != Composer.Companion.getEmpty() ? 1 : 0;
            ?? r15 = (z2 || obj2 == Composer.Companion.getEmpty()) ? 0 : 1;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(iDataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (iDataIndexToDataAnchor >= 0 && this.slotsGapOwner < i4) {
                iDataIndexToDataAnchor = -(((this.slots.length - this.slotsGapLen) - iDataIndexToDataAnchor) + 1);
            }
            SlotTableKt.initGroup(this.groups, iGroupIndexToAddress, i2, z2, r14, r15, this.parent, iDataIndexToDataAnchor);
            int i5 = (z2 ? 1 : 0) + r14 + r15;
            if (i5 > 0) {
                insertSlots(i5, i4);
                Object[] objArr = this.slots;
                int i6 = this.currentSlot;
                if (z2) {
                    objArr[i6] = obj2;
                    i6++;
                }
                if (r14 != 0) {
                    objArr[i6] = obj;
                    i6++;
                }
                if (r15 != 0) {
                    objArr[i6] = obj2;
                    i6++;
                }
                this.currentSlot = i6;
            }
            this.nodeCount = 0;
            iGroupSize = i4 + 1;
            this.parent = i4;
            this.currentGroup = iGroupSize;
            if (i3 >= 0 && (groupSourceInformationSourceInformationOf = sourceInformationOf(i3)) != null) {
                groupSourceInformationSourceInformationOf.reportGroup(this, i4);
            }
        } else {
            this.startStack.push(i3);
            saveCurrentGroupEnd();
            int i7 = this.currentGroup;
            int iGroupIndexToAddress2 = groupIndexToAddress(i7);
            if (!Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
                if (z2) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, iGroupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            this.nodeCount = SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress2);
            this.parent = i7;
            this.currentGroup = i7 + 1;
            iGroupSize = i7 + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2);
        }
        this.currentGroupEnd = iGroupSize;
    }

    public final int endGroup() {
        MutableObjectList<Object> mutableObjectList;
        boolean z2 = this.insertCount > 0;
        int i2 = this.currentGroup;
        int i3 = this.currentGroupEnd;
        int i4 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i4);
        int i5 = this.nodeCount;
        int i6 = i2 - i4;
        boolean zIsNode = SlotTableKt.isNode(this.groups, iGroupIndexToAddress);
        if (z2) {
            MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
            if (mutableIntObjectMap != null && (mutableObjectList = mutableIntObjectMap.get(i4)) != null) {
                MutableObjectList<Object> mutableObjectList2 = mutableObjectList;
                Object[] objArr = mutableObjectList2.content;
                int i7 = mutableObjectList2._size;
                for (int i8 = 0; i8 < i7; i8++) {
                    rawUpdate(objArr[i8]);
                }
                mutableIntObjectMap.remove(i4);
            }
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i6);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i5);
            this.nodeCount = this.nodeCountStack.pop() + (zIsNode ? 1 : i5);
            int iParent = parent(this.groups, i4);
            this.parent = iParent;
            int size$runtime_release = iParent < 0 ? getSize$runtime_release() : groupIndexToAddress(iParent + 1);
            int iDataIndex = size$runtime_release >= 0 ? dataIndex(this.groups, size$runtime_release) : 0;
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
        } else {
            if (!(i2 == i3)) {
                ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
            }
            int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
            int iNodeCount = SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i6);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i5);
            int iPop = this.startStack.pop();
            restoreCurrentGroupEnd();
            this.parent = iPop;
            int iParent2 = parent(this.groups, i4);
            int iPop2 = this.nodeCountStack.pop();
            this.nodeCount = iPop2;
            if (iParent2 == iPop) {
                this.nodeCount = iPop2 + (zIsNode ? 0 : i5 - iNodeCount);
            } else {
                int i9 = i6 - iGroupSize;
                int i10 = zIsNode ? 0 : i5 - iNodeCount;
                if (i9 != 0 || i10 != 0) {
                    while (iParent2 != 0 && iParent2 != iPop && (i10 != 0 || i9 != 0)) {
                        int iGroupIndexToAddress2 = groupIndexToAddress(iParent2);
                        if (i9 != 0) {
                            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2) + i9);
                        }
                        if (i10 != 0) {
                            int[] iArr = this.groups;
                            SlotTableKt.updateNodeCount(iArr, iGroupIndexToAddress2, SlotTableKt.nodeCount(iArr, iGroupIndexToAddress2) + i10);
                        }
                        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress2)) {
                            i10 = 0;
                        }
                        iParent2 = parent(this.groups, iParent2);
                    }
                }
                this.nodeCount += i10;
            }
        }
        return i5;
    }

    public final void ensureStarted(int i2) {
        if (!(this.insertCount <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i3 = this.parent;
        if (i3 != i2) {
            if (!(i2 >= i3 && i2 < this.currentGroupEnd)) {
                ComposerKt.composeImmediateRuntimeError("Started group at " + i2 + " must be a subgroup of the group at " + i3);
            }
            int i4 = this.currentGroup;
            int i5 = this.currentSlot;
            int i6 = this.currentSlotEnd;
            this.currentGroup = i2;
            startGroup();
            this.currentGroup = i4;
            this.currentSlot = i5;
            this.currentSlotEnd = i6;
        }
    }

    public final void ensureStarted(Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }

    public final int skipGroup() {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int iGroupSize = this.currentGroup + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        this.currentGroup = iGroupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            return 1;
        }
        return SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
    }

    public final boolean removeGroup() {
        Anchor anchorTryAnchor$runtime_release;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i2 = this.currentGroup;
        int i3 = this.currentSlot;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i2));
        int iSkipGroup = skipGroup();
        GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(this.parent);
        if (groupSourceInformationSourceInformationOf != null && (anchorTryAnchor$runtime_release = tryAnchor$runtime_release(i2)) != null) {
            groupSourceInformationSourceInformationOf.removeAnchor(anchorTryAnchor$runtime_release);
        }
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty() && prioritySet.peek() >= i2) {
                prioritySet.takeMax();
            }
        }
        boolean zRemoveGroups = removeGroups(i2, this.currentGroup - i2);
        removeSlots(iDataIndex, this.currentSlot - iDataIndex, i2 - 1);
        this.currentGroup = i2;
        this.currentSlot = i3;
        this.nodeCount -= iSkipGroup;
        return zRemoveGroups;
    }

    public final Iterator<Object> groupSlots() {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i2 = this.currentGroup;
        return new AnonymousClass1(iDataIndex, dataIndex(iArr, groupIndexToAddress(i2 + groupSize(i2))), this);
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.SlotWriter$groupSlots$1 */
    /* JADX INFO: compiled from: SlotTable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!,\u0010\bDRш|İI\u0006>\u00116B\u0005%4\u0012\u0006\u0010nj?0ld߉4Ziճ?s\f84]:pq;\u0004\u0019F)\u0017Vfg\u0016v\u0011Ұ\u000b\f\u0018\u0014\u001f\u0011lBH\u0004x$ܟ\u000f\u0003Z}@KM\u001e?\u0010Ţ\u0001ȥ\t,:ĲP{\u000b\u0004(.h\u0012|\u007fQQñ\u0016:"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\r8\u0005O\u0005\u001f\u0017\u0011]\u0015F\u0006\u0017B]\r D,\u0018;WSFY;($v \u0005", "", "", "1ta?X5M", "", "5dc\u0010h9KS\"\u000e", "u(8", "Adc\u0010h9KS\"\u000e", "uH\u0018#", "6`b\u001bX?M", "", "<dgA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        final /* synthetic */ int $end;
        private int current;
        final /* synthetic */ SlotWriter this$0;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1(int i2, int i3, SlotWriter slotWriter) {
            this.$end = i3;
            this.this$0 = slotWriter;
            this.current = i2;
        }

        public final int getCurrent() {
            return this.current;
        }

        public final void setCurrent(int i2) {
            this.current = i2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current < this.$end;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.this$0.slots;
            SlotWriter slotWriter = this.this$0;
            int i2 = this.current;
            this.current = i2 + 1;
            return objArr[slotWriter.dataIndexToDataAddress(i2)];
        }
    }

    public final void forEachData(int i2, Function2<? super Integer, Object, Unit> function2) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i2));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i2 + 1));
        for (int i3 = iSlotIndex; i3 < iDataIndex; i3++) {
            function2.invoke(Integer.valueOf(i3 - iSlotIndex), this.slots[dataIndexToDataAddress(i3)]);
        }
    }

    public final void forAllData(int i2, Function2<? super Integer, Object, Unit> function2) {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(getCurrentGroup() + groupSize(getCurrentGroup())));
        for (int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(i2)); iDataIndex2 < iDataIndex; iDataIndex2++) {
            function2.invoke(Integer.valueOf(iDataIndex2), this.slots[dataIndexToDataAddress(iDataIndex2)]);
        }
    }

    public final void moveGroup(int i2) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (!(i2 >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (i2 == 0) {
            return;
        }
        int i3 = this.currentGroup;
        int i4 = this.parent;
        int i5 = this.currentGroupEnd;
        int iGroupSize = i3;
        while (i2 > 0) {
            iGroupSize += SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
            if (!(iGroupSize <= i5)) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
            i2--;
        }
        int iGroupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i6 = iGroupSize + iGroupSize2;
        int iDataIndex3 = dataIndex(this.groups, groupIndexToAddress(i6));
        int i7 = iDataIndex3 - iDataIndex2;
        insertSlots(i7, Math.max(this.currentGroup - 1, 0));
        insertGroups(iGroupSize2);
        int[] iArr = this.groups;
        int iGroupIndexToAddress = groupIndexToAddress(i6) * 5;
        ArraysKt.copyInto(iArr, iArr, groupIndexToAddress(i3) * 5, iGroupIndexToAddress, (iGroupSize2 * 5) + iGroupIndexToAddress);
        if (i7 > 0) {
            Object[] objArr = this.slots;
            ArraysKt.copyInto(objArr, objArr, iDataIndex, dataIndexToDataAddress(iDataIndex2 + i7), dataIndexToDataAddress(iDataIndex3 + i7));
        }
        int i8 = iDataIndex2 + i7;
        int i9 = i8 - iDataIndex;
        int i10 = this.slotsGapStart;
        int i11 = this.slotsGapLen;
        int length = this.slots.length;
        int i12 = this.slotsGapOwner;
        int i13 = i3 + iGroupSize2;
        for (int i14 = i3; i14 < i13; i14++) {
            int iGroupIndexToAddress2 = groupIndexToAddress(i14);
            updateDataIndex(iArr, iGroupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, iGroupIndexToAddress2) - i9, i12 < iGroupIndexToAddress2 ? 0 : i10, i11, length));
        }
        moveAnchors(i6, i3, iGroupSize2);
        if (removeGroups(i6, iGroupSize2)) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        fixParentAnchorsFor(i4, this.currentGroupEnd, i3);
        if (i7 > 0) {
            removeSlots(i8, i7, i6 - 1);
        }
    }

    /* JADX INFO: compiled from: SlotTable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>)6B\u0015\"4ߚ\u007f\u0007|jAӄLeV4ZS0\u000fs{B-c$wDA٬\u001b\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A):Jm~m\u0014\u001f2prm5}sK=xtd\nP60>\u0012\u0005/!ZL\u001e~\u0013Cy\u0011B4NyRR;W5\u001e \u0011V /(\rmT6Vxu:]-IiŒR4"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zT\fWKFg=\"\u001fq7", "", "u(E", ";ne2:9Hc$", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "4q^:J9Bb\u0019\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "4q^:<5=S,", "", "BnF?\\;>`", "CoS.g,\u001f`#\u0007Xn9\u000b\u0013<", "", "CoS.g,-]v\u000f\bl6\n", "@d\\<i,,])\fx^\u000e\n\u0013?p", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i2, SlotWriter slotWriter2, boolean z2, boolean z3, boolean z4, int i3, Object obj) {
            if ((i3 + 32) - (i3 | 32) != 0) {
                z4 = true;
            }
            return companion.moveGroup(slotWriter, i2, slotWriter2, z2, z3, z4);
        }

        public final List<Anchor> moveGroup(SlotWriter slotWriter, int i2, SlotWriter slotWriter2, boolean z2, boolean z3, boolean z4) {
            boolean zRemoveGroups;
            ArrayList arrayListEmptyList;
            int iGroupSize = slotWriter.groupSize(i2);
            int i3 = i2 + iGroupSize;
            int iDataIndex = slotWriter.dataIndex(i2);
            int iDataIndex2 = slotWriter.dataIndex(i3);
            int i4 = iDataIndex2 - iDataIndex;
            boolean zContainsAnyGroupMarks = slotWriter.containsAnyGroupMarks(i2);
            slotWriter2.insertGroups(iGroupSize);
            slotWriter2.insertSlots(i4, slotWriter2.getCurrentGroup());
            if (slotWriter.groupGapStart < i3) {
                slotWriter.moveGroupGapTo(i3);
            }
            if (slotWriter.slotsGapStart < iDataIndex2) {
                slotWriter.moveSlotGapTo(iDataIndex2, i3);
            }
            int[] iArr = slotWriter2.groups;
            int currentGroup = slotWriter2.getCurrentGroup();
            ArraysKt.copyInto(slotWriter.groups, iArr, currentGroup * 5, i2 * 5, i3 * 5);
            Object[] objArr = slotWriter2.slots;
            int i5 = slotWriter2.currentSlot;
            ArraysKt.copyInto(slotWriter.slots, objArr, i5, iDataIndex, iDataIndex2);
            int parent = slotWriter2.getParent();
            SlotTableKt.updateParentAnchor(iArr, currentGroup, parent);
            int i6 = currentGroup - i2;
            int i7 = currentGroup + iGroupSize;
            int iDataIndex3 = i5 - slotWriter2.dataIndex(iArr, currentGroup);
            int i8 = slotWriter2.slotsGapOwner;
            int i9 = slotWriter2.slotsGapLen;
            int length = objArr.length;
            int i10 = currentGroup;
            while (true) {
                zRemoveGroups = false;
                if (i10 >= i7) {
                    break;
                }
                if (i10 != currentGroup) {
                    SlotTableKt.updateParentAnchor(iArr, i10, SlotTableKt.parentAnchor(iArr, i10) + i6);
                }
                SlotTableKt.updateDataAnchor(iArr, i10, slotWriter2.dataIndexToDataAnchor(slotWriter2.dataIndex(iArr, i10) + iDataIndex3, i8 >= i10 ? slotWriter2.slotsGapStart : 0, i9, length));
                if (i10 == i8) {
                    i8++;
                }
                i10++;
            }
            slotWriter2.slotsGapOwner = i8;
            int iLocationOf = SlotTableKt.locationOf(slotWriter.anchors, i2, slotWriter.getSize$runtime_release());
            int iLocationOf2 = SlotTableKt.locationOf(slotWriter.anchors, i3, slotWriter.getSize$runtime_release());
            if (iLocationOf < iLocationOf2) {
                ArrayList arrayList = slotWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iLocationOf2 - iLocationOf);
                for (int i11 = iLocationOf; i11 < iLocationOf2; i11++) {
                    Anchor anchor = (Anchor) arrayList.get(i11);
                    anchor.setLocation$runtime_release(anchor.getLocation$runtime_release() + i6);
                    arrayList2.add(anchor);
                }
                slotWriter2.anchors.addAll(SlotTableKt.locationOf(slotWriter2.anchors, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime_release()), arrayList2);
                arrayList.subList(iLocationOf, iLocationOf2).clear();
                arrayListEmptyList = arrayList2;
            } else {
                arrayListEmptyList = CollectionsKt.emptyList();
            }
            if (!arrayListEmptyList.isEmpty()) {
                HashMap map = slotWriter.sourceInformationMap;
                HashMap map2 = slotWriter2.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = arrayListEmptyList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        Anchor anchor2 = arrayListEmptyList.get(i12);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) map.get(anchor2);
                        if (groupSourceInformation != null) {
                            map.remove(anchor2);
                            map2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = slotWriter2.getParent();
            GroupSourceInformation groupSourceInformationSourceInformationOf = slotWriter2.sourceInformationOf(parent);
            if (groupSourceInformationSourceInformationOf != null) {
                int iGroupSize2 = parent2 + 1;
                int currentGroup2 = slotWriter2.getCurrentGroup();
                int i13 = -1;
                while (iGroupSize2 < currentGroup2) {
                    i13 = iGroupSize2;
                    iGroupSize2 = SlotTableKt.groupSize(slotWriter2.groups, iGroupSize2) + iGroupSize2;
                }
                groupSourceInformationSourceInformationOf.addGroupAfter(slotWriter2, i13, currentGroup2);
            }
            int iParent = slotWriter.parent(i2);
            if (z4) {
                if (!z2) {
                    zRemoveGroups = slotWriter.removeGroups(i2, iGroupSize);
                    slotWriter.removeSlots(iDataIndex, i4, i2 - 1);
                } else {
                    byte b2 = iParent >= 0 ? (byte) 1 : (byte) 0;
                    if (b2 != 0) {
                        slotWriter.startGroup();
                        slotWriter.advanceBy(iParent - slotWriter.getCurrentGroup());
                        slotWriter.startGroup();
                    }
                    slotWriter.advanceBy(i2 - slotWriter.getCurrentGroup());
                    boolean zRemoveGroup = slotWriter.removeGroup();
                    if (b2 != 0) {
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                    }
                    zRemoveGroups = zRemoveGroup;
                }
            }
            if (zRemoveGroups) {
                ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            slotWriter2.nodeCount += SlotTableKt.isNode(iArr, currentGroup) ? 1 : SlotTableKt.nodeCount(iArr, currentGroup);
            if (z3) {
                slotWriter2.currentGroup = i7;
                slotWriter2.currentSlot = i5 + i4;
            }
            if (zContainsAnyGroupMarks) {
                slotWriter2.updateContainsMark(parent);
            }
            return arrayListEmptyList;
        }
    }

    public final List<Anchor> moveTo(Anchor anchor, int i2, SlotWriter slotWriter) {
        ComposerKt.runtimeCheck(slotWriter.insertCount > 0);
        ComposerKt.runtimeCheck(this.insertCount == 0);
        ComposerKt.runtimeCheck(anchor.getValid());
        int iAnchorIndex = anchorIndex(anchor) + i2;
        int i3 = this.currentGroup;
        ComposerKt.runtimeCheck(i3 <= iAnchorIndex && iAnchorIndex < this.currentGroupEnd);
        int iParent = parent(iAnchorIndex);
        int iGroupSize = groupSize(iAnchorIndex);
        int iNodeCount = isNode(iAnchorIndex) ? 1 : nodeCount(iAnchorIndex);
        List<Anchor> listMoveGroup$default = Companion.moveGroup$default(Companion, this, iAnchorIndex, slotWriter, false, false, false, 32, null);
        updateContainsMark(iParent);
        boolean z2 = iNodeCount > 0;
        while (iParent >= i3) {
            int iGroupIndexToAddress = groupIndexToAddress(iParent);
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, SlotTableKt.groupSize(iArr, iGroupIndexToAddress) - iGroupSize);
            if (z2) {
                if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
                    z2 = false;
                } else {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress, SlotTableKt.nodeCount(iArr2, iGroupIndexToAddress) - iNodeCount);
                }
            }
            iParent = parent(iParent);
        }
        if (z2) {
            ComposerKt.runtimeCheck(this.nodeCount >= iNodeCount);
            this.nodeCount -= iNodeCount;
        }
        return listMoveGroup$default;
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i2, boolean z2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            z2 = true;
        }
        return slotWriter.moveFrom(slotTable, i2, z2);
    }

    public final List<Anchor> moveFrom(SlotTable slotTable, int i2, boolean z2) {
        ComposerKt.runtimeCheck(this.insertCount > 0);
        if (i2 == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0 && SlotTableKt.groupSize(slotTable.getGroups(), i2) == slotTable.getGroupsSize()) {
            int[] iArr = this.groups;
            Object[] objArr = this.slots;
            ArrayList<Anchor> arrayList = this.anchors;
            HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
            MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
            int[] groups = slotTable.getGroups();
            int groupsSize = slotTable.getGroupsSize();
            Object[] slots = slotTable.getSlots();
            int slotsSize = slotTable.getSlotsSize();
            HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release = slotTable.getSourceInformationMap$runtime_release();
            MutableIntObjectMap<MutableIntSet> calledByMap$runtime_release = slotTable.getCalledByMap$runtime_release();
            this.groups = groups;
            this.slots = slots;
            this.anchors = slotTable.getAnchors$runtime_release();
            this.groupGapStart = groupsSize;
            this.groupGapLen = (groups.length / 5) - groupsSize;
            this.slotsGapStart = slotsSize;
            this.slotsGapLen = slots.length - slotsSize;
            this.slotsGapOwner = groupsSize;
            this.sourceInformationMap = sourceInformationMap$runtime_release;
            this.calledByMap = calledByMap$runtime_release;
            slotTable.setTo$runtime_release(iArr, 0, objArr, 0, arrayList, map, mutableIntObjectMap);
            return this.anchors;
        }
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            List<Anchor> listMoveGroup = Companion.moveGroup(slotWriterOpenWriter, i2, this, true, true, z2);
            slotWriterOpenWriter.close(true);
            return listMoveGroup;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    public final void bashCurrentGroup() {
        SlotTableKt.updateGroupKey(this.groups, this.currentGroup, -3);
    }

    public final List<Anchor> moveIntoGroupFrom(int i2, SlotTable slotTable, int i3) {
        ComposerKt.runtimeCheck(this.insertCount <= 0 && groupSize(this.currentGroup + i2) == 1);
        int i4 = this.currentGroup;
        int i5 = this.currentSlot;
        int i6 = this.currentSlotEnd;
        advanceBy(i2);
        startGroup();
        beginInsert();
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            List<Anchor> listMoveGroup$default = Companion.moveGroup$default(Companion, slotWriterOpenWriter, i3, this, false, true, false, 32, null);
            slotWriterOpenWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i4;
            this.currentSlot = i5;
            this.currentSlotEnd = i6;
            return listMoveGroup$default;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i2);
    }

    public final Anchor anchor(int i2) {
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, i2, getSize$runtime_release());
        if (iSearch < 0) {
            if (i2 > this.groupGapStart) {
                i2 = -(getSize$runtime_release() - i2);
            }
            Anchor anchor = new Anchor(i2);
            arrayList.add(-(iSearch + 1), anchor);
            return anchor;
        }
        return arrayList.get(iSearch);
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = slotWriter.parent;
        }
        slotWriter.markGroup(i2);
    }

    public final void markGroup(int i2) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        if (SlotTableKt.hasMark(this.groups, iGroupIndexToAddress)) {
            return;
        }
        SlotTableKt.updateMark(this.groups, iGroupIndexToAddress, true);
        if (SlotTableKt.containsMark(this.groups, iGroupIndexToAddress)) {
            return;
        }
        updateContainsMark(parent(i2));
    }

    private final boolean containsGroupMark(int i2) {
        return i2 >= 0 && SlotTableKt.containsMark(this.groups, groupIndexToAddress(i2));
    }

    public final boolean containsAnyGroupMarks(int i2) {
        return i2 >= 0 && SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i2));
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    public final void updateContainsMark(int i2) {
        if (i2 >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, null);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(i2);
        }
    }

    private final void updateContainsMarkNow(int i2, PrioritySet prioritySet) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        boolean zChildContainsAnyMarks = childContainsAnyMarks(i2);
        if (SlotTableKt.containsMark(this.groups, iGroupIndexToAddress) != zChildContainsAnyMarks) {
            SlotTableKt.updateContainsMark(this.groups, iGroupIndexToAddress, zChildContainsAnyMarks);
            int iParent = parent(i2);
            if (iParent >= 0) {
                prioritySet.add(iParent);
            }
        }
    }

    private final boolean childContainsAnyMarks(int i2) {
        int iGroupSize = i2 + 1;
        int iGroupSize2 = i2 + groupSize(i2);
        while (iGroupSize < iGroupSize2) {
            if (SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(iGroupSize))) {
                return true;
            }
            iGroupSize += groupSize(iGroupSize);
        }
        return false;
    }

    public final int anchorIndex(Anchor anchor) {
        int location$runtime_release = anchor.getLocation$runtime_release();
        return location$runtime_release < 0 ? location$runtime_release + getSize$runtime_release() : location$runtime_release;
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + Soundex.SILENT_MARKER + (this.groupGapStart + this.groupGapLen) + ')';
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void fixParentAnchorsFor(int i2, int i3, int i4) {
        int iParentIndexToAnchor = parentIndexToAnchor(i2, this.groupGapStart);
        while (i4 < i3) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(i4), iParentIndexToAnchor);
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i4)) + i4;
            fixParentAnchorsFor(i4, iGroupSize, i4 + 1);
            i4 = iGroupSize;
        }
    }

    public final void moveGroupGapTo(int i2) {
        int i3 = this.groupGapLen;
        int i4 = this.groupGapStart;
        if (i4 != i2) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i4, i2);
            }
            if (i3 > 0) {
                int[] iArr = this.groups;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                int i7 = i4 * 5;
                if (i2 < i4) {
                    ArraysKt.copyInto(iArr, iArr, i6 + i5, i5, i7);
                } else {
                    ArraysKt.copyInto(iArr, iArr, i7, i7 + i6, i5 + i6);
                }
            }
            if (i2 < i4) {
                i4 = i2 + i3;
            }
            int capacity = getCapacity();
            ComposerKt.runtimeCheck(i4 < capacity);
            while (i4 < capacity) {
                int iParentAnchor = SlotTableKt.parentAnchor(this.groups, i4);
                int iParentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(iParentAnchor), i2);
                if (iParentIndexToAnchor != iParentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i4, iParentIndexToAnchor);
                }
                i4++;
                if (i4 == i2) {
                    i4 += i3;
                }
            }
        }
        this.groupGapStart = i2;
    }

    public final void moveSlotGapTo(int i2, int i3) {
        boolean z2;
        boolean z3;
        int i4 = this.slotsGapLen;
        int i5 = this.slotsGapStart;
        int i6 = this.slotsGapOwner;
        if (i5 != i2) {
            Object[] objArr = this.slots;
            if (i2 < i5) {
                ArraysKt.copyInto(objArr, objArr, i2 + i4, i2, i5);
            } else {
                ArraysKt.copyInto(objArr, objArr, i5, i5 + i4, i2 + i4);
            }
        }
        int iMin = Math.min(i3 + 1, getSize$runtime_release());
        if (i6 != iMin) {
            int length = this.slots.length - i4;
            if (iMin < i6) {
                int iGroupIndexToAddress = groupIndexToAddress(iMin);
                int iGroupIndexToAddress2 = groupIndexToAddress(i6);
                int i7 = this.groupGapStart;
                while (iGroupIndexToAddress < iGroupIndexToAddress2) {
                    int iDataAnchor = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress);
                    if (iDataAnchor >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    SlotTableKt.updateDataAnchor(this.groups, iGroupIndexToAddress, -((length - iDataAnchor) + 1));
                    iGroupIndexToAddress++;
                    if (iGroupIndexToAddress == i7) {
                        iGroupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int iGroupIndexToAddress3 = groupIndexToAddress(i6);
                int iGroupIndexToAddress4 = groupIndexToAddress(iMin);
                while (iGroupIndexToAddress3 < iGroupIndexToAddress4) {
                    int iDataAnchor2 = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress3);
                    if (iDataAnchor2 < 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    SlotTableKt.updateDataAnchor(this.groups, iGroupIndexToAddress3, iDataAnchor2 + length + 1);
                    iGroupIndexToAddress3++;
                    if (iGroupIndexToAddress3 == this.groupGapStart) {
                        iGroupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = i2;
    }

    private final void clearSlotGap() {
        int i2 = this.slotsGapStart;
        ArraysKt.fill(this.slots, (Object) null, i2, this.slotsGapLen + i2);
    }

    public final void insertGroups(int i2) {
        if (i2 > 0) {
            int i3 = this.currentGroup;
            moveGroupGapTo(i3);
            int i4 = this.groupGapStart;
            int i5 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i6 = length - i5;
            if (i5 < i2) {
                int iMax = Math.max(Math.max(length * 2, i6 + i2), 32);
                int[] iArr2 = new int[iMax * 5];
                int i7 = iMax - i6;
                ArraysKt.copyInto(iArr, iArr2, 0, 0, i4 * 5);
                ArraysKt.copyInto(iArr, iArr2, (i4 + i7) * 5, (i5 + i4) * 5, length * 5);
                this.groups = iArr2;
                i5 = i7;
            }
            int i8 = this.currentGroupEnd;
            if (i8 >= i4) {
                this.currentGroupEnd = i8 + i2;
            }
            int i9 = i4 + i2;
            this.groupGapStart = i9;
            this.groupGapLen = i5 - i2;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(i6 > 0 ? dataIndex(i3 + i2) : 0, this.slotsGapOwner >= i4 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i10 = i4; i10 < i9; i10++) {
                SlotTableKt.updateDataAnchor(this.groups, i10, iDataIndexToDataAnchor);
            }
            int i11 = this.slotsGapOwner;
            if (i11 >= i4) {
                this.slotsGapOwner = i11 + i2;
            }
        }
    }

    public final void insertSlots(int i2, int i3) {
        if (i2 > 0) {
            moveSlotGapTo(this.currentSlot, i3);
            int i4 = this.slotsGapStart;
            int i5 = this.slotsGapLen;
            if (i5 < i2) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i6 = length - i5;
                int iMax = Math.max(Math.max(length * 2, i6 + i2), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i7 = 0; i7 < iMax; i7++) {
                    objArr2[i7] = null;
                }
                int i8 = iMax - i6;
                ArraysKt.copyInto(objArr, objArr2, 0, 0, i4);
                ArraysKt.copyInto(objArr, objArr2, i4 + i8, i5 + i4, length);
                this.slots = objArr2;
                i5 = i8;
            }
            int i9 = this.currentSlotEnd;
            if (i9 >= i4) {
                this.currentSlotEnd = i9 + i2;
            }
            this.slotsGapStart = i4 + i2;
            this.slotsGapLen = i5 - i2;
        }
    }

    public final boolean removeGroups(int i2, int i3) {
        if (i3 > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(i2);
            zRemoveAnchors = arrayList.isEmpty() ? false : removeAnchors(i2, i3, this.sourceInformationMap);
            this.groupGapStart = i2;
            this.groupGapLen += i3;
            int i4 = this.slotsGapOwner;
            if (i4 > i2) {
                this.slotsGapOwner = Math.max(i2, i4 - i3);
            }
            int i5 = this.currentGroupEnd;
            if (i5 >= this.groupGapStart) {
                this.currentGroupEnd = i5 - i3;
            }
            int i6 = this.parent;
            if (containsGroupMark(i6)) {
                updateContainsMark(i6);
            }
        }
        return zRemoveAnchors;
    }

    public final GroupSourceInformation sourceInformationOf(int i2) {
        Anchor anchorTryAnchor$runtime_release;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor$runtime_release = tryAnchor$runtime_release(i2)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor$runtime_release);
    }

    public final Anchor tryAnchor$runtime_release(int i2) {
        if (i2 < 0 || i2 >= getSize$runtime_release()) {
            return null;
        }
        return SlotTableKt.find(this.anchors, i2, getSize$runtime_release());
    }

    public final void removeSlots(int i2, int i3, int i4) {
        if (i3 > 0) {
            int i5 = this.slotsGapLen;
            int i6 = i2 + i3;
            moveSlotGapTo(i6, i4);
            this.slotsGapStart = i2;
            this.slotsGapLen = i5 + i3;
            ArraysKt.fill(this.slots, (Object) null, i2, i6);
            int i7 = this.currentSlotEnd;
            if (i7 >= i2) {
                this.currentSlotEnd = i7 - i3;
            }
        }
    }

    private final void updateNodeOfGroup(int i2, Object obj) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        int[] iArr = this.groups;
        if (!(iGroupIndexToAddress < iArr.length && SlotTableKt.isNode(iArr, iGroupIndexToAddress))) {
            ComposerKt.composeImmediateRuntimeError("Updating the node of a group at " + i2 + " that was not created with as a node group");
        }
        this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))] = obj;
    }

    private final void updateAnchors(int i2, int i3) {
        Anchor anchor;
        int location$runtime_release;
        Anchor anchor2;
        int location$runtime_release2;
        int i4;
        int capacity = getCapacity() - this.groupGapLen;
        if (i2 < i3) {
            for (int iLocationOf = SlotTableKt.locationOf(this.anchors, i2, capacity); iLocationOf < this.anchors.size() && (location$runtime_release2 = (anchor2 = this.anchors.get(iLocationOf)).getLocation$runtime_release()) < 0 && (i4 = location$runtime_release2 + capacity) < i3; iLocationOf++) {
                anchor2.setLocation$runtime_release(i4);
            }
            return;
        }
        for (int iLocationOf2 = SlotTableKt.locationOf(this.anchors, i3, capacity); iLocationOf2 < this.anchors.size() && (location$runtime_release = (anchor = this.anchors.get(iLocationOf2)).getLocation$runtime_release()) >= 0; iLocationOf2++) {
            anchor.setLocation$runtime_release(-(capacity - location$runtime_release));
        }
    }

    private final boolean removeAnchors(int i2, int i3, HashMap<Anchor, GroupSourceInformation> map) {
        int i4 = i3 + i2;
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i4, getCapacity() - this.groupGapLen);
        if (iLocationOf >= this.anchors.size()) {
            iLocationOf--;
        }
        int i5 = iLocationOf + 1;
        int i6 = 0;
        while (iLocationOf >= 0) {
            Anchor anchor = this.anchors.get(iLocationOf);
            int iAnchorIndex = anchorIndex(anchor);
            if (iAnchorIndex < i2) {
                break;
            }
            if (iAnchorIndex < i4) {
                anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                if (map != null) {
                    map.remove(anchor);
                }
                if (i6 == 0) {
                    i6 = iLocationOf + 1;
                }
                i5 = iLocationOf;
            }
            iLocationOf--;
        }
        boolean z2 = i5 < i6;
        if (z2) {
            this.anchors.subList(i5, i6).clear();
        }
        return z2;
    }

    private final void moveAnchors(int i2, int i3, int i4) {
        Anchor anchor;
        int iAnchorIndex;
        int i5 = i4 + i2;
        int size$runtime_release = getSize$runtime_release();
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i2, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (iLocationOf >= 0) {
            while (iLocationOf < this.anchors.size() && (iAnchorIndex = anchorIndex((anchor = this.anchors.get(iLocationOf)))) >= i2 && iAnchorIndex < i5) {
                arrayList.add(anchor);
                this.anchors.remove(iLocationOf);
            }
        }
        int i6 = i3 - i2;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Anchor anchor2 = (Anchor) arrayList.get(i7);
            int iAnchorIndex2 = anchorIndex(anchor2) + i6;
            if (iAnchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - iAnchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(iAnchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, iAnchorIndex2, size$runtime_release), anchor2);
        }
    }

    public final String toDebugString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbAppend = sb.append(toString());
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(value)");
        Intrinsics.checkNotNullExpressionValue(sbAppend.append('\n'), "append('\\n')");
        StringBuilder sbAppend2 = sb.append("  parent:    " + this.parent);
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(value)");
        Intrinsics.checkNotNullExpressionValue(sbAppend2.append('\n'), "append('\\n')");
        StringBuilder sbAppend3 = sb.append("  current:   " + this.currentGroup);
        Intrinsics.checkNotNullExpressionValue(sbAppend3, "append(value)");
        Intrinsics.checkNotNullExpressionValue(sbAppend3.append('\n'), "append('\\n')");
        StringBuilder sbAppend4 = sb.append("  group gap: " + this.groupGapStart + Soundex.SILENT_MARKER + (this.groupGapStart + this.groupGapLen) + '(' + this.groupGapLen + ')');
        Intrinsics.checkNotNullExpressionValue(sbAppend4, "append(value)");
        Intrinsics.checkNotNullExpressionValue(sbAppend4.append('\n'), "append('\\n')");
        StringBuilder sbAppend5 = sb.append("  slots gap: " + this.slotsGapStart + Soundex.SILENT_MARKER + (this.slotsGapStart + this.slotsGapLen) + '(' + this.slotsGapLen + ')');
        Intrinsics.checkNotNullExpressionValue(sbAppend5, "append(value)");
        Intrinsics.checkNotNullExpressionValue(sbAppend5.append('\n'), "append('\\n')");
        StringBuilder sbAppend6 = sb.append("  gap owner: " + this.slotsGapOwner);
        Intrinsics.checkNotNullExpressionValue(sbAppend6, "append(value)");
        Intrinsics.checkNotNullExpressionValue(sbAppend6.append('\n'), "append('\\n')");
        int size$runtime_release = getSize$runtime_release();
        for (int i2 = 0; i2 < size$runtime_release; i2++) {
            groupAsString(sb, i2);
            sb.append('\n');
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final void groupAsString(StringBuilder sb, int i2) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        sb.append("Group(");
        if (i2 < 10) {
            sb.append(TokenParser.SP);
        }
        if (i2 < 100) {
            sb.append(TokenParser.SP);
        }
        if (i2 < 1000) {
            sb.append(TokenParser.SP);
        }
        sb.append(i2);
        if (iGroupIndexToAddress != i2) {
            sb.append("(");
            sb.append(iGroupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        sb.append(SlotTableKt.groupSize(this.groups, iGroupIndexToAddress));
        sb.append('^');
        sb.append(parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, iGroupIndexToAddress)));
        sb.append(": key=");
        sb.append(SlotTableKt.key(this.groups, iGroupIndexToAddress));
        sb.append(", nodes=");
        sb.append(SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress));
        sb.append(", dataAnchor=");
        sb.append(SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress));
        sb.append(", parentAnchor=");
        sb.append(SlotTableKt.parentAnchor(this.groups, iGroupIndexToAddress));
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            sb.append(", node=" + SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))]), 10));
        }
        int iSlotIndex = slotIndex(this.groups, iGroupIndexToAddress);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i2 + 1));
        if (iDataIndex > iSlotIndex) {
            sb.append(", [");
            for (int i3 = iSlotIndex; i3 < iDataIndex; i3++) {
                if (i3 != iSlotIndex) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(i3)]), 10)));
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        sb.append(")");
    }

    public final void verifyDataAnchors$runtime_release() {
        int i2 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        while (i3 < size$runtime_release) {
            int iGroupIndexToAddress = groupIndexToAddress(i3);
            int iDataAnchor = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress);
            int iDataIndex = dataIndex(this.groups, iGroupIndexToAddress);
            if (!(iDataIndex >= i4)) {
                PreconditionsKt.throwIllegalStateException("Data index out of order at " + i3 + ", previous = " + i4 + ", current = " + iDataIndex);
            }
            if (!(iDataIndex <= length)) {
                PreconditionsKt.throwIllegalStateException("Data index, " + iDataIndex + ", out of bound at " + i3);
            }
            if (iDataAnchor < 0 && !z2) {
                if (!(i2 == i3)) {
                    PreconditionsKt.throwIllegalStateException("Expected the slot gap owner to be " + i2 + " found gap at " + i3);
                }
                z2 = true;
            }
            i3++;
            i4 = iDataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int i2 = this.groupGapStart;
        int i3 = this.groupGapLen;
        int capacity = getCapacity();
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            if (!(SlotTableKt.parentAnchor(this.groups, i4) > -2)) {
                PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i4);
            }
            i4++;
        }
        for (int i5 = i3 + i2; i5 < capacity; i5++) {
            int iParentAnchor = SlotTableKt.parentAnchor(this.groups, i5);
            if (parentAnchorToIndex(iParentAnchor) < i2) {
                if (!(iParentAnchor > -2)) {
                    PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i5);
                }
            } else if (!(iParentAnchor <= -2)) {
                PreconditionsKt.throwIllegalStateException("Expected an end relative anchor at " + i5);
            }
        }
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    public final int groupIndexToAddress(int i2) {
        return i2 < this.groupGapStart ? i2 : i2 + this.groupGapLen;
    }

    public final int dataIndexToDataAddress(int i2) {
        return i2 < this.slotsGapStart ? i2 : i2 + this.slotsGapLen;
    }

    private final int parent(int[] iArr, int i2) {
        return parentAnchorToIndex(SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i2)));
    }

    public final int dataIndex(int i2) {
        return dataIndex(this.groups, groupIndexToAddress(i2));
    }

    public final int dataIndex(int[] iArr, int i2) {
        return i2 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.dataAnchor(iArr, i2), this.slotsGapLen, this.slots.length);
    }

    public final int slotIndex(int[] iArr, int i2) {
        return i2 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i2), this.slotsGapLen, this.slots.length);
    }

    private final void updateDataIndex(int[] iArr, int i2, int i3) {
        SlotTableKt.updateDataAnchor(iArr, i2, dataIndexToDataAnchor(i3, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    private final int nodeIndex(int[] iArr, int i2) {
        return dataIndex(iArr, i2);
    }

    private final int auxIndex(int[] iArr, int i2) {
        return dataIndex(iArr, i2) + SlotTableKt.countOneBits(SlotTableKt.groupInfo(iArr, i2) >> 29);
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List listDataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.slice(listDataAnchors$default, RangesKt.until(0, this.groupGapStart)), (Iterable) CollectionsKt.slice(listDataAnchors$default, RangesKt.until(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(listPlus.size());
        int size = listPlus.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) listPlus.get(i2)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final List<Integer> keys() {
        List listKeys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(listKeys$default.size());
        int size = listKeys$default.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listKeys$default.get(i2);
            ((Number) obj).intValue();
            int i3 = this.groupGapStart;
            if (i2 < i3 || i2 >= i3 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final int parentIndexToAnchor(int i2, int i3) {
        return i2 < i3 ? i2 : -((getSize$runtime_release() - i2) + 2);
    }

    private final int parentAnchorToIndex(int i2) {
        return i2 > -2 ? i2 : getSize$runtime_release() + i2 + 2;
    }
}
