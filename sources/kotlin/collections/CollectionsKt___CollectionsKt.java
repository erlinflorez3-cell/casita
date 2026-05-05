package kotlin.collections;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import defpackage.Architecture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яű\u0015D߬)\u001ew\tL܀kt\u0012[\u000eֶ\u0013.X~*,\u0018x\u000ff\u000198ǏmH<t[*\u0015l\u00044:[,qI>]\u001a\fE\u0011OTmonX^\u0013C\u001d\t\u001exp,QU\u0007b\u001aƁ:B}E;ݹw=Gg|Ȃ\r @*@y\u000b\u0001\"*V.~zIR\u0014\u0012F@x:X\u000eU\u0005(.\u000e>&\u0012&\\}N>H\u0003]B/)\u0004qB\\Dg0\u0003M\u0015Fj'\u0015vg 3@Eߎ\u001d%Y\u001e\u000fRq?\u000b?wA\rh5'3Iy[>X\u000e3\u001dۀW\rsr.\\\u000bUh\f5KWcQQ\u0016(\u000ez\u0004\rR\u0004\u0016\u0006-H6-(q\u0010\u000e9xzSN\\\n^H\n\u0003aD$-\u007f95A\u001b|Qi;/N?{\u000b$&#\u000f})[Z\u001ah\u00151T\u007fQ7mH=^N\u0012YC~\fpx\u00022\u00046G\b/\u0012\u00116\u0017+<c917sȵPDu\u0007\r\u009bpSwiP@0x\u001e70\t\u0014ZRu\rߘXTf>\u0019۳$T\u001d}\u0010\u00136\\\u007f˓)%\u001eaWhojU]\u001897f=Yvk\u001cxA^95Yc\u001evZv\u001aBDb\u001bXnBY\u0010r\u000b6ίJH\u0019\u000f\u0018}J\u0088\u001a\u0013ZE\u0002\u001eD,w\u0019\u000b\u0016x\u0013,DY\t\u0019ajhV~d54\u0003\u0018##\fGˍb̒nΟ\u0011]:\u0001x\"[@q7\u001fğc\"\u0011:\r%\u0017~:\u007fuhduZp.u\u0004z@\u0018 ߙ_/e\u0019\u001f\u000192H-sM#u_O*3\u000b~\n\u000f\u0002h>i\u0018j\u001f+\u000fm\u0011֩Zј!Ԯv\u00101\r|\u0006\ncVz\u000ec\u0003\f{@OͿ\u0011YdTH~\u0015\u001fd%/phĤ;E]5#.}$1%a$i\u001e5\u001ad\u0015ծ\u0003e,2s\u0018\u007fb\u0018]`<P\u001cg\u0007V.4n\u0013B\u000ft\b\nR\tz\u0018aQafvމFM+1\u0004e\u00156-r\\[H\u001e\u0018\u0004D0o*:C,\u0015\u000f_3\u001dekwo}K#\u000bZ\u001d\u001a\u0017\f3~\u0012bG0XgbO;4\u0001F9\bݬhǖ;ɿ<t:J \u0017SVy\u0006V\u0005\u0010Ho\u000f]2p|[X\u0014֊\u0007\\vJ\u000b_SjI0\u0011\u0001\u001f3dxc25}TcGoB\u0003c\u001dO\u001bzQ\u000ffk5rW\u007fА.è\u007fՊ]8QW\u001aB\u0014I9m2y\u001c:(|cMF$YS\u0017٣\u00050~\r[c\\n\u0017\u0014lR\\-Q\u0005\u000b~\u001e<P\u000f9\u001a\u007f\u0003}qEX^yGC`\u0001'F9\u0007R\u0007\u0012IK=\u0014EEIYl$'BWc=\u000e\bf+U\u0007;լb\u009e\rў\"9)K.q\\t\"\u000b\u0019У.\u0004NLzq\u00188(LU\u0002A\u0014;nio}˺P'qv\u0016FQЕ\t\n*l\u0012\u0002}\u0011\u0013hAV@n[QM\r5aF\u0013\u001flj!a/p\u001d\u0010\u0016%&e6\u0018d9\u0010\u0016m\u0017s2ώaķ*Ԛ֗.a?Ej\u0014\f0\u0012uJ<t*\u001b͇dM^f\u000f[zLw\u0010dj6o\u0015\"/\u0015\u000b\u0011pn!\u0017:И\u0003\u001e+9G\u001d%ʺ\u001dG'\u00122Xq,13b?a7`\f ,\u0005%\u001b:)\u00070:P\u0018\u000b\fw.=F\u001b=*)i$4n1){UFR 8!\u0010!/!80@l\u001abF\u007f6\b˙\u0017ݭ\u0014Ɖ۰s\u0007'K\u0003?a<B\u0001C\u0013-A\u007fۧy:\u00149x\"=\u0019\u0010\u001d]fI0U{R(\u001a\u0014\u000eZ\u000fQiǾ\u001farSEI$\u0099e@F\u0015M7L\f\u0006%\u0010EwHX`\rDd\bo\u0004l<f\u000bR/_\u0005\tu\u001a,0\u0018\u0004rkmDC\u000b\u0014_NN,=lMP{u(\u000e\u000bՀKǢ6ʔҋ-3%\u0012(\u0010\u007fXCU\u0003O?\\$F#u\u0014:xld\u0003gB_آ\u001472Viixxye :\"\rS\u000e&2\u0003p\u000ey5$7M\u0007F|f\tOQbQK='%݃Hֶ\nʏ.\nV1\u001a}\u0011r5\u00159ʺ\u0002Kg\u0014\\z/(1q+\u00063y\u0013WOYwةM9y\u0015}N^˂u\\K`O^\r1%\u0002z+tQ\u0005?J.f\u001a&E+Z@T\u0007]@y@2@PEdS_\u0011\u001ceH\u0004\u0018,܇8ƈ6֡܌\u0015+El\u0007gc>Ex0\u001f8G)\u0015\u001b\u001e\u0002V`$:\u0012жB{\u000ezaj\u000b\ta\u00101}r'?\bO/og\u001bW,D϶[?\u0005+8<2!+$\u0011\u0004;o\u001e$o\u0003zV\u0005*\u000fPá\u0015fH\f'\u0010\u0003'F\ffq.C\u0016\u0013r\u001cc]\u000eAr3 \rGU\u000e\u0014?s\u000b~t\bim1\u0006\u001bN1 5\u0012P&\u0019،U\\^c/l4[+\u0002H9Ng\fJ90E{\u0012n1xئd\u0011_[\u0004Zr\"\u000brtFsDLJ|\u0019-O,D\u007fm\u0003\u000bf͟VA8h|.76\u000fjG\u00021OoA,7r\u0019ilK~0\n:Ym'WJL9\u0019\u000b\u0018\u0017\u0002֞A6-q2{#0fl\u0003\u0006|\u0005\u001402l_6T\u0005X\u001c[|W\u0004v\u0014B \u001c\u0005\u00152~UbQ<\u001f!\u000e\u000f%.\u001a\b\u0003gJg\u0018\u001b5J4JM\u001fz\u000fZbÌ<{.%\"D\f53A\"%yݦyٝ8],V\u0016\u0006\u0006N%kX\u0004\u0004L)ӻwb9c>O\b\u0007 <\bjH܇*˙(\b#T\u001adByJ\"i\u0001/8\u001eɗtn!+\u0019g\u001c/;u<[4Ҭ{ՑagBnUqk/]-uq(MOԄ\r+o\u0014Y\u0018JO\u0013m$\u0005\u0004Ԡ\u001eߵ\u000bo\u0012^(\u0010n\rZ\u0017>\b\u00036qϐ\nG+\u001azM>\u001a!f\u001d\u0016=ʾiшA\u0016\u001bA\u001dg\u0002[;@S^\u0001n\u0006ã\u0017pǛ;QK\u00183J!*p2\u0005\u0012=I\tj\u001cO\u001a\u0005\u0012d`Ҹ9س|@YJs\u001bu\u001ai\"\u0016j\f*5ހ\u0006\u0016^#\u00107I\r:P\rl.ϰ\u000fm7\u001c]\u0007O6\u0014P4Mɴh Wa\u0018\u0010Zf\u0013P;B\u001f\u001b<-\u000frEa5\u00040ԝ0\u001dkk)i\u001563;\fi\u0004t\t \u0007gk)@}L!#C/\u0016<#6\u0003;۶:ӕtÖXb!D2I>\n$\u0005,L3^*C7؉apA1\banBK\rS\"@E&ayr#q%(hCA ;o\u000f߱*IE\u000b3P\u0005\u0005B8 \"e\u0010\u0006\nAc\u000f\b\u000e[a<@u\u0019M\u0013m\u000e0zo1\u0002\r\u0013\u0016ӕB֤}ԧNg6K>XK\u0016r\\\u000b'\nQd\u0019\u0014٬-*L8\u001cp@\u001b#h,p'VpNx4\u001dWpbCh;\u00076\u0003\u0011\ti]Y=^[[܇r\u000f\u000f|`E\"^;>\u0018&85+@\u001eK\u0014T4mW89qDB2*)\u0014R\u000f,\u000fR݂;\u001a^eL$I<as^(G!Nl\r\u0010?H!rOpA4Y_\u000b\u001eZaoվqܩ.Ôju[.G '(Ha}#y\u000fB\u001eKӒKIM\u001b\u001d!z\f;\u0003K6\"ll,W\u000e\u0016&$BE6\u0001Ez>$\u001bb\u0017;߾hޫ3ŤZ\u0004]j.\u0012,NGYwõ!a\\\u0004JO*\u0002%I5\u000eV';L3*1nŬU3z&_y\u0005\u001d%\u000fw=\nI6ҙ\u0004z&\"BsPw9a\u001a_u\u0004&j\\I_THғVδs|>\r*\u0002\u0019\u0007*\u0013x@>\u0002!ޒtI\\N\u0006^Fl$DW~>jD/V\f{g\u0007>\u0014{5kz\u0001\u0004v\u0005\t#A'\u0012\\|-?ހi\u0005sl;eTDk3({wUpșV\u0017ZjDD$\u001fQ\u001eX}P\u000f\u0019\u0011\u007f4LZ|\tT\u0014]m\u001502\u001a\u0011J\u001d0\u0001o\u0017:\u0007\u0004$ٵ?ӓ\u001cуɌd9\u007f(\u000fz5\u0019\u00019,\n82cNeǔ/-\b\u0011#L-SYS0R]VIx_Y6yϠp\b<a]\u0010-8\u001d:\u0005>\u0012j6)Eǣ\u0006[\t0P\u0006\u0013([DNOB+\u001b\u007fU\u001e%6|\u008f\u000b۵[PrE\u000b~(^\u0004V\u00199\"E\u0004C\u0004\n{sAĹlJ4\u00175(?\t`)\u0016mV\u0005#p|\u0018a;m0wPr\fyQ\u001c\u000f)\u007fb\u0557\u001cϽXȉY_)39?WiY3{\u0004<ypq\u0005׀ft\u0014srZ$2I\u001eq;)-xZ|:\fi~qtM\u00952P\u001f\\2304\bR/?F$x\u0003\u0006r e&`7re\\-K6ŻKǞFΡeH.Djzb)tn\u0015ښ\u0007TeJjuP{jT\u0007$\u0012\u058c`f~\u001fh\u001c\".|*U)7%\u000bczR_%)s!LT$n?V>\u0004G\u0017*AdĴ~\u0014wYi>\u0013BFGS_\bbBcJt2\u0001C\u001d#\u0004B.B(\"۸\u0003ޝtό\u009b002\u0015\u0004c]w9\u001c3s\u001c<\u0010\f؞}`g}q0%*\u001dր\u000fu\nG\u0017\u0005P`tWeImۨ|\u000b=1`\u0005\u001aZ;p1_ӊtH{7$\u000b\u0019\\R2t\u0015!+0ϣ\u001d\u001c\u00114{\u001a{?A&\u0012\u0015i\u001e\u0004U\u007f\u0018F\u000e9`xϰ\u0006͟:uT7\r\u0018\u0006\u0013]Hmk\u001bN|448jVx\u009a>{=R!ElQ;\u0005\rE\u000e/5\u0010\u0013\u0013@\u001f\rp,D=\u0004 fNpr\u0011\u0014ߧ\u001eݵJ\u05c89\u0002y[\u000e{gf'B\u0012\u0012I)a\t8΄S(\u0013g\u001dal\u001e\u0004 N]kkUNI7~WTk=M+>.2\u0011ƥ`7b'NN\u0002ؙ^I+\r\u001b7|+RL\u00031Z\u0015-kk*\u0011CK!\u000eW-A$e+a5'Cz\"^ŋ9GZ2}pB;5\u0013\u0014qs_\u0018\u05fd\"o5\f\u0006\u0007.\u0018@\t=R8ՈSkiq7\u0013\u0019I_phh=\u001e&c\u0013.S\u001b\u001f&|\u0018R;!/)\u000f\u0014dATAiWQ*\u0015UGY\u0012\\ٸsߤ\f؝ĄK?U/|kE\\wg\u0012a4*2̅\u001e\u001dmvu)\u0005mU7^\u001a\u0004Å\u0007q['~t<8b\u0001\r$~\u001aV\u0003DI*1\u0001cB[]`I=!\u001a^Y\u0001\u0005w_\u0005q\u0003eMQ9D)ȩ\u0005əGή\u05c8/QLz\u000b\u001aR\t}4`BX\u001eO2/Ľ\u0017na*sm\u0015x>W\u0016\u001a\u0014;\u0002@yQT4R\u0006q\n\u001a\u0012:Xf\u0018ie\u001e\u0085tɰmڬ¢M@vSZ$\u0017oI*#\u0012\u0017j]=F©\r&\u00191W/?oc);\u0010Hec8;ArE3A\u0003#\n<\u0019#CKI\u0002PݨHݤyÍݮ@I\\?}xAAXw\u0007\u0002|_u>Xλb!J/ClL \u0015hbOu{3UC/#!\u0003\u0010@\u000b)C\u000be\u0012,t\fOɬ?ˎ\u0001ӕ۾Rs\u0019c;L%]#k5;IGoͩA\u0016Dud3Ou/!\u001a7ؙCY,d\u0002\u0004!sC,r\u0012>P\u000eɉWXfu@Rj{&\u0018D7v\u0003R5s\u0001\u0013\u007f4FBJux}{lJ3\u0017sΪXӪ<ٛʿUU\u0003`K\u001a#3,;e\u0016-E)ߖ2_\u0012JKO\u0003a}v\u0016oĊ\n\u0016xQ\f\u007f\"5bZp=](j؍\u0012\u0013\u001a_q\u0017Rv=!2di|R\n|-r/}y\u0007Lj\u0011oi\u000b\u0017b!|p0P&'&)t\u007fY\u0015Xјrۑ>Ɠۯ\u0004Ia)\u0003Q?\u00169q#\u0011\u007f#'YIޱ\u0014leIC$\u0016\b\u0013G&G'e;Wt?d\u0014)@zqpq^@t$&QjL0\\\rVJT\u000bkzWUŗI߁\bմ̞KoUV)_\u0003'm!1*\u0002c\u001fhkښS\u000561LK5+]2BNÚ+s' F%\u001eFak'l\u001c\u001a=}ZĆo\u0018yG[Wv`@?Sh\u0004#\".G<\u001e!`j:+} \u0004sA_le\u007fڸMǈ\u0014߁Ư~\u0019\u0013]>c,\u0010\u001e\u001ae\u001fqlF8Uλb<j\u000f2UgvJ6\f!ǧx]kFcF3-]\b\u001deosZ.\b \u0013J7ӪFRe\u0016*6N\u0017$RAB;e6\u0006E|\r\u0003'qD:Pf\u001e\u0003A\u0005Zs^V`r)z&)U\\\r\u007fY̩\tܬR͔\u0005<T\u0018b^\b+%\u0011*\u0019mh_R\u0005֊\u0002+\u001e4{1q\u001duYj\u001c6z,wW\r\u001acN3\"P\u001f)'Pgl\u001e~\u0019cH\u001a\fC\u0011\u000e\u0011ov8-Ձ\u007fڤ\u0007ԺƷ$|\u001f\u001c/\"pV\u000e9\u0013f#+~_y\u0019K[9ϊ##\u0015\u0004BLj.+o|3V\bT+iK8x\u0017]\u0010tS|\u0002jjsЕ5\foX@\u0017}i.\u007fZ;g=\u0005%\b8N\u0002+qXoe\u00146.w[>\"}Y\u001bčTħ5͋ɡ'>*DrA\u001b\"!\u007f,=\u001f\u007fnw.y\u0006zuט\\Kg[s\nghk\u000f4UeyM7-\u000b\u0002ELkxt\u001atYwTPσ\b\u001e;p\f\u0001{\u001aA\f zL_T\u0018q\rjncJ:t\u0003\t)~#\u0015JP|Tj܂T\u0092<ƕ˞1sv^,,+l9?\"/\u001f\u0017\\ވHrDz\"(`\u0014\u001b(1\u0016#7\u0015KREWяlS\u0015\u000bBL\u001ckBS\u0005{\u0003GL\tHN; gCm[\u0013\u001cU\u0006\t*\u001e>(:-}˟\u0007NP0ulN\u0005w\"0XQ\u000ep#Q\u001b;\u001av\u000f\u001f\u001dc'\u0016*\u0014geN\u001e\u0017@ںNόDۧύav\u0005\u0013\u0011=\b Vu&-\u0002\u001dG00ɿ*\u0010)m:Z\f Pb)\f<#Z\u0018.#\u0006ɢ'gb~q*\u0006p3=\u001cg5VC)]1>'<PcD_\u001b3HJ~3\u00143\r+*ȡ]3\u001f\nm\u0017\u000bq\\$8\u000e(\u00134/|hB\u0010=aTF\u001c'eX<5diZ>Bу*ٔ\u0011Ŵǟ\u000f\nP;6uN0I\u000f\u0013v\u0015\u0001\u000e<\\Ŀ\u000e(YF4E\u001b\"d9vp\u0018h'fz\"n\u008a8E3{w\fop>\u0017!\u0015yam%remt\u0017\u0019?X\u0013kRd\u0017Z\u0004\u000f,9w\u0018&o}DTGe\u0002\u0004\u001f^\u0002dA9̳:̂r҆ߣlA8\u0016w,<B^%T\u00121+)ڄ3n.;P \rC%OTeu8n`vI\u0013ݧ\u001en+\u000es\"\u001fa\u001a-><<GUL\"@Dc\n/\"\u0007W57\u0001\u001e\u0011'\u001fQ\u00063rBS\u001a\u0018@>~\u0007\u00194\u0006\u0006<\rrȼ\"ݞ\u0015̲ӄH4Hfa\u000e8r\u000eIQIj\"E}D߿R]N\fxX&TV5E\u00193SET~Rw\u0001C]}\u0003+LOP_lcQp\u000f#\u0017lw߂Vs)@\u0016VUW(,V_k6\u001e&hX>\tH\b\u001aTemTn\\Ȫ,ܾ*ƀζQDfnt.\u0005mf3VK\u0019*&ڕ$gol4\u0011TX\u001cx\u001b\u001e\u0013^5\u001fuS:.\u001b\u0001h}\u0010X\"pA)n:cXq\u0013\u0010\u007f;\u001dd/\u0011\u0007,\u0003k9\u00174D\u0003t+0w~\u0007qҽX\u000fd#ag\u001f\fF\u001cx\u001a[6\u0011\u000epJ#\u0001\u0002PcEm9ti\u0012Ņxˢ\u0011ֵ֣l;,\u0013\u001e\u0019]]\u0004f\u0010\u0005\b)1պ;SGe\fPG\u0006SQ__\u0018k\u000flBaiS\u0002Ay\u0017\u0011,yz1\u0013S`s\n\u007fqxL\u001c @P4S\u009c.E#\u001f\u001f4\u0001iR9~\u001d\u000eHt\u0018\u0003VjJ4&aߠ\nΊNǌ߶ne\u0004IE^h\u001bA1xb5$[Ѻ\u00072\u0015+\u0005wy\u0011mkTC\\bdm\u007f+H\u0019\u0015\u0018f(z74\u000e.(\u000baJ\\\u007flugР)f^H\u001b?jy\b\u007flrJ\u0018r,[NS\u0010~i\t(F\u0010ܜ\u0001Z;>P^QO<9Jv2DEKDr;8L\u0016(Բ$Ɇ2ۇ̡q\u0013\u001e\u007f$\\\u0001TqU(\"\u0016h\u0011ĝq^//\r\rvW\u0015^/MfWjȓ34,xtPH-S\u0016B\t05+/<#ԜXھdڑE9|ٓ%+h\u0006FG\u0010lĎ;%|'\u0005\u0016\f\r$@O\u0006vwsߝhe{yW\u001d\u0007?\u001aз'\u0012\u001a\b,Vq>\u0011,\u0010o6uJ@muy\u0002G53-%\u0004o%'ͱ\u0010ĹpмcK\u001fҬA\b\r\u0019\f|\u0001ZǙ\u0003~\u0007Ih\u001d6\u000b9\u0007eE)(,G\u0003?yJ)?\u000e\b&\u0013(o`r\u000bC9DB9[$\u0005\u0004 \u070e]Ĩ@Ⱥ˱,C7+y\u0012\u0012ֈ\r\u000f#P\u0018P(p\n^ϳ5u*\\oNmmYbtq>+\u0005\u001e\u0017\fj&Ī\\!U0}\u001e3ƎK\nAC\u0012\u000b\u001b\u0007+\u0015\u0003\u000edG\u00162xx\"|A\u0016\u001bHtZٙCq\u0018\u000e(\u001emzGTc\u0010l\u0010\u001c\u0013t\u0011\"D\t\u000b\u001f)T\u001c\u0018,\u0011eo\t9`sR'3GĒ5Չgޤ2\u0016-̙i\u001cT[hf\b&dap]\u0007\u000b^IT@\u0010swC\u001cCI8ܮgUI\u0014Pwa\u0012\u0017\u0007\u001e!+:'i3\fYO/h\u001cP\f|3>\u0002>g/6J^{-s\u007f\u0014fVZ\u0014afJOu\u0002ee+TIMi+rxQ1:y9ˤSՠ\u000eкZR<Ō.E%]e\u0017Cfٔ\f;g0\u001b*fI;K'\bx1\u0018\u001fiUgΖ~(\u0002\u001a{\u0001o)=FD;^)\u0004Ĵz`\u000eFGO2:\u0006p\u00074\u000eYhB,Z^_'^b:I,\u0012g(G\u00034\u007f\u001c7tK\u0016\u001bXy&֝\u0013߾fƖо\u0007i={3!xغ\u0012iTw/[cHǾ\u000b~~7}Cj_$Z?JAU=\u0012S5\u0002\u001a590guȿ\u007f3uH\u0006^dMbsc\u001e`3lʜ;Wb\u0013wr\u000b=\u0001Wf\nS\u00133Z\r! \u0004JQ3z\u0012]Sx\\\u0017BO3\u001c/S\u007fgCC}8y{JKQvU?[\u001d-$n+5miS{\u000bѧ\\ݶ\u0006Ş߿TQx~\n\u0010i\u009aG*\u0016'y\u007fi\u0013V\fb#\u0012{M\u001dǉ3prDӡmuW\u0006C43C%\u0010\u0014\u001d=IUu&G~'\u00177O\u0003Sa P\u0018\u001b]7S%\u0014\u001f\"t}<\u0010ܖfķ/ދ\"\u0017Qł'\u001334r.P_ϋ\u001cyӑ'.Ik` :X\u0014\n\u001c\\l\u0005pxx<\u0004(p.ǂ\u0007YEޥ\u007f5@<Ɉ\rtwW\u0002&_kа6.ĵfNWDS~q~\u001e?O\u00117Q{78Q\u007f\u000bW4ȣyUMǜ\u0006yr\u000fٻ_O\u0018V\u001fV(@ԖyT\u0017D*SFxN\u0010M#\u0016\u00042^o\u001dq\u001a,UMVDVQ<y^;]\u0011ѯ\u0013̉dͤG\u0014Ą\u0002J\u0005>Q:,HքJ&Jt\u0015KWh\"\b\u0014\u0015\u0007z_GY1\u007f\u001bJ+R\u000fkUy\u0006\u001dP\fZuϒTߨXζ\u00198(ݍ^\u0011?XF/QXƗxqvd\u001d,Bi~\\\"i=hJcL@df#n\u001eq%BSa(X\u0018F\u001d̖aܜ(ϰWzyާu\u0011G\u007f/69Jۥ+7W88_&7N!sk0\u001c~_\u0002\u001d\u0012_D'Ln5u\u001a\u0004\u0002d\u001es1ҶY\u05cdzˡ;^RԤ72.h){7D\"2ֹu!LpҷXO\u0016+\u000bX\u000f!e\u0019^S`G&Ҕ\u0001B;\u00172VO:d~S[م}{\u0379\u000fLް0\u0003\n4υ(\u007fiSףc\u00165\u0005gr6ݽd)\u0003\u000fƕz3e6Ђ[iP\u0006\u0012l=\u0018;(\tB%6ޚs=~~՚C)&\u001dz'ۄ\u0017za\u001bۈ,+k\u0018/\u0004ћ\u0006E\u0006Cߋd\u0005n7PIҙ[\u0018>S֓n6RMk\u0007ۀF$7<X6NmqgѲMB3-ѝ\u000bY%wWh=,\u007f\u0011;9bqvX\u0004)brҲ\u000fhU\u0019qʑTb\u001c˅\u0011%\u0007\r̡n)\u001anגVvw\u0010\u07b6\u0015x;=R@uy\u0004\fS8WE\u0005\fTɤk'\u0014,߮H\u0003\u0018 3Uȗ?q\u0012\u0004ח`\bS\fcVŒ#E\u0013,щ3Q\t<(\u0016ӣFk,\u0015W2Z\u0018\f*̟O\u0016fTƖFmM\")i\u0012&gnHV\u0007{\u0005Z/~k!ƈ:3xNF14@đ\u0011zwqa,ZkͰwq;oaU%,F}0\u0014ܗ\u000f\u0012\u001c\rf(~Տ)gQ?:V\u001d\nЀS$0\u000b\u0010hK\u001cr\u0007f1n0y\u0019@\u000bpTN~Q\u00131,\u0015uR`\t\u0014.ޒhģ<̄߮\u001d\u0004\u0013j,i+ƭ0cu0\tO\u000b;ş\u00136+\u001cC^|zh?TR̮\rKX\u001b\u0012ArٺU\bXR\b\u00068_Ӵ}L{$\u001c*Z1ZY\fZFd1[$\u000f\u001d\u001a7\"\u0002\u0003s.#T\u0005j q\u001bÇ\u0016Å1ֵʮd2?63)0ڹw/+\u0002K6E]ħOgћakM\u000e9eq/wuU2A\u00010ObF25\u000eu >3F٫#p8V\u05fe\t\u001dDzI@5]͉*8ޝ\u000ep/-6\fee\bts?:\u001d3j7daU\u0003\u001fʿ`&~̶\u0003AhTʒF#1(\fZ0};#۩s\u001bGDf6T\u001aZ\u0004\\8رv\f\"\u0019\u0006\u000bbϛ,\u001a\u0002\u0018\u0011\tnTp\u0012֪BsN6\"\u0015,Z0<R;\u0017_6\u0007\u0019t[\u0002\\h \u0012rE^8t 1W\u0006ݝ\u0013ܤ$ŎѺz&\u0013\u0017Le;ކXWY\rYk%M9wӐ6R\u0016\u007fz\u000bAjat\u0016\u007fƉ;B\f>4{OɃ)\b\f\\O4~.G\u0016ѷ#68\r8:*\u007fWR#j^Z\u0002RNipA(tI;Ef?xvB\t(Mɔ\u001bʡUĆ̺tRnseP\u001eÓ\u0002\r<ec\u0013cdFXu\u0016M=̨\bF`k\u0012@\u001cTa7S\u0011 \t]1w\u00171\u0013[o.&HJ\u0007B!\u0015g\u00012\u001aVsV\flҨsݩA۠\u000f4L֟5\"x[]Fh}1\u0007Knc4أ\u0011mH3PVOJWa\u0017\u0013Xe\u000e\u0011s|y0~=KTa\u000fkS\u000f,ݙ&J\\bt\u0002;3 \\o\u001aR{hoeVl0\u0012\u0003\u0014\u0011\u000b9DYeӕ<Ǡ%Β(jMȶ\nuNj\f\u0001JW-\u0017tB4\u0011͛@Bnw_iPE\u0003A2gK.;\r\u000b'*ZDkAJn\u000eq\\i;W]\t6ܓK\u007f\u0016H\b\u00159ZKX\u000f>-Ys!B>/C?3\u0004\u000e^Q2,;69ҝ{ĸQϘFf*Ӊ1\r\u0014+\u001e\r\u0017w߮k_a\u001e^$kA-\u001bJ\u0004\u0005\u000bQ*=e~n\u0001wxՄq\u0014ub\u001d\u0002\u0010|\b\u0018uA-?iL\u001e yp\u0019\u001c\u0019\u0013\u001a5o\u007fa\u007f#t\u007f<X]זo&\u0006R^j\u001edLK\u007f*\u0011wK#r#\u0019\u000b8N[\u000b'j+$DR%Ĭ?ȡs؏Ż\u001a\bO9\u0012n}͞OQ\u00035\u007fUKaޱ+.}.vj\u0017T3\u0017\u0006\u0006[A|]dz$݁u\u0002jJO\u0011\u0001@V &\u0006`?;6~_\n\u0002oYn\u00015*\u0012\u001f]\u001eH\u0001R\u0006+Zفz\\=+-2\u0005:\t/\u0016r9HzQ\u0014R1]$hANA7\u0013\t#σ\r\u07b9$Ƿχ\u0011y8TcxY؇\"<\n,;+K0\u001d(]*h\u0015ԯ\fx19t\u001c\u0007\u0015\thi\u001fh\\p\nT0vt9M\u0001\u0001\u000e\u001ad\u001f\\\u0019MT\u0010p\u0007bPW+4N\u001a?9YЕgɬ@í\u0011eMտeS~\u0013UAoRԚ'W\nwstc\u0012;>Gh5\u0016Et&wk0pcpԐN\nDKn#pm G$)*5u\u0012@Ok\t'\u001eKU~y)%RX\fG^\u0018#\u0003thd%\u0001J3V`\u000eMܧ=ڒ\u007fοպ\u0014t_9R?o̟[@\u0011nAx\tvŘCJ~C'/l81[mOcYh\u0010\u007f5}ݑ\u0006\u0018\tM5un)4Dj\u001a1\u0006ghldwj\n}eA\u000bh8?\u0017\u0015\u0017\u001aT _\u00115Y\u0011u1d\u0001{HχQ؈\u000eȑ߁5\u0011#c\u0001|4܃\n\\4\u000fR\u0012)2ün]m\r *:+R\u0019Yƥn>v$g7FZyLoR\u0018ݴ\\.\u0010זQ\u000eܒ\u0010K(M\u0081\nZ\u000bD\u0004\n~\u0013$X/c\u0013:O\u001awܲ5lxɶwy(\u0019̺8x\u0002'U~/#)g6C\u0004\u000eDbaќI\u001b\u000fך!CoMԃnK\u001e k\u0011r\u007f̙u\u0015\u0002Dw5ul^58\u00069\u0002J7bނ+=GrXYgVg$Nv%u.Kx\u000e\rB\u001cM\u0007^j+\u001b\u0001u+)5ξGݙ&˪ȡ)k\u0015ʈJa\rA\u0003jջ\"R=(sw\u0002<\u000eIґ\u0006\tRX\u001ar\u001a\u001b^<\\bS$w\rXפm38aUPJ82I\u0017IIrr@Rv%/H#>\\((\bfl;zVãDق^ˬ˛6\u0003\u0017\u00041\f\u0012ךr\\y\n\"?7\u001dȶ1e\rR3>q}[\u001e\u0019j_(\u001d\u001a\u0016ߕa[ZMP-\u0003$H6\u0011Y<:F49\u0018QGR|ixHfy&9\\7\u0005\u038dRĦNמԉ\u0001\u0014EؓB\u0011\u001drؐ8^\u0003K@eN6ʶ\u0003\u000fyU\u0005\u0004CJ[OJBC$?w9\u000f,[\nJ}I\u0007YGe\u000fcL\u0002SȰ?څ>\u05cffweĝ\u000eM \u000f\u000e\u0013v\u007fªu\u0016l %\u0019\u001c\u0004\u007fp\u0015\t\u001974g_\u000b`6t|\u001fJy\u0012Y\u0016]\beF]ӗ\u0014̇,ª7R\u0016ڴi5\u001fSLBrq\u001ahŻ='9t1\u000f=\u001b\u001bXM[\u000e`\u000eelƲw}iJns\u0010!(\u0002nb'\u001c/OB_bq&xb\u001c\u0018]l\u0019?\u0003\b\u0015Գy\u05909ܓɓ\u000bYUƻ\b?YVݲ\u001f\u0007\fQpn~\u0010\u001b.ѳnv\u0007g=5\u0015\no\u0016u&I%6J[F1y'9\u000f\u0004\u001eZ_a5\u0012y\u001eRղWω9۰ɵ<Efޏ]\u0007u4ۑH!\u0016>&\\.?.nλ'u@uu\rf<'1~T\u0014\u001dx\t\t%\f\u0002/9]%j\u0017T\u000fH\nRA\t˻R݅5ِމUT~Ȁ3\u0006R|چ`m\u0015{/AHA߳\u0019kwk }g\u0013\nO<b=Kb\u0013Q%_\u0005\u0007һ1P5so\nغ\nZ-D\u0012Րt!i\u0014\u0001tµXi\u000fo/ҫ\"#g\u0014WrY{\u0016{{\u001cH)g\nCuj}ziƦ\u000fƒhҪۢCQ\u000b۵nS#6Ǝ%siCP\u0019?4vcր3\u0002\n@G\u001f\u0007b.\"&G\u007fyQt<Ui'\u0006ǝ7hxt&9ڏ?w5-`ý\u0017o\u001eBzcİ{}o&Ió,Y3X'ZZ:\u001e$$6\u0011JLs{?\f\u00150\r\u008d\u0012ɑ\u0017ׁӑAwWԪ\u0001U\n\n֧9\u0002(Gv<\bH$sĀ%j}5lxy\u0018-;3ì\u000f\tKuQ\u001a\u0014p+^\u0013g2հTMbڍ1?('љ\u001flV\u000b\u0004[+\u001c\u001aK\u0002\u0013!e\u0013s\u007f>kх?KSجk$fGى\b*Uir3Sw\u001e_\u0014VY\u0005\u00184b\u000ecޥ.\u0010\bȐ<8=\u007fʫJF\u0003Yk[vKƒ`\u000bEw\\>0f5\u0007%}\r\u0005(ٳ\u001d-2\u0013F\nٯ=Hqk\u0015ڬ\t0 \t+EʍhoZO|Ւh\u007fLۮ*Tgޕ\u00165ȓ\u0010m)Iֵ>g\u0001bP\u0013e,smǏ4ox{D7&}fDS\u000bp]0ȀX}T\tk\u0002ݷ<\u0016r}\u000b¶x\u001fS_ijݜEcX\u0016/õU!\u001cӠ\u0019s&Ԫ}#LYȥ\rHOy$j}*ޤ\u0018=\u001cKbqkmH\u001f)ߙfUN\u0018\f;\u001b\u0012#\\\u0017t\u0015Έ\teD͢|xϿQ3/6٢7(\u001fH\r}\u0014N\u001bZBvv\u0014\"~\b߯jO\u0019ȍ*EI\u001fڡ/\u0006r[\u0018E8<S'\u0001O\u0018#\u0019nTד\u00196Y֚\u0003;\u0002)ŏ]/Hc \u000eh\u0003ܜ<OZE\u0012\u0010e\u0002\u001e\rDb\br:\u0014Nӈxnk\u0019\u0002PKx\u001cZ_q0\u0002\"c<v7[\u001e['B3<?Y\u001bj*/ۅ\u000eÿyƙד g4ʍ>n%]|=ѳ-#\u000f)*.9:@iاiq4|\u0004XZn\u0012\u0003Ws\u001a\u0013\u0001R>ޤR\u0016D2C_\u0002qs\\I`DzZB\u001c\"\u001bdX}\"RiV$\tnP}\u0002Ԝ&ŔFؗԱ\u00137]~\u0014Z\t݄Kia+RXfGи\u0002\u0004Ym\\Je\"\u007f)1.Tm\u0004X\u007fԪ4QN\u0001Hf,l\u0016VrA\r\u001e^Z\nxf@IP\f: Z\u0007\u0017\"}u\u000fߣ,ͮ\u0019ĥ\u06ddrrJÇI\u0003~B\u070e\u001a\u000bU`z\u001bm*٪K\tj`1\rxOZ\u0015\\.c#-\f%`\\[Qt4Ok\u0001r\u0019CUux\u0018ˆ\\ɨ\u0003چ;j\u000b۪e\u0012h+al\n'ڼ[Ua@\u001c\u0014bX@\u0007d\u0003Hd#\u00058#LJ6\bkb|WNN\"\u0005nz1γ8Ȉ\u0014б??WڡQe]K\u0012\u0003T\u0006t\rܩ\u000bZ\r(OM&M+\u0010V{S\u000b6Y]հO2aKa\u0016`!sDTPKy]e%:\u0015;1\u001c*!\u0019eo\u0005QrSI̷\\ǐjɪש2!z̰\u0014R.\bߋEn\r}Er\\D~cڰVz\u0012\u0006r.hq\t\u001fE~l]`\u001e\u00017Gi3\u0019\u001b%k#i\u007f\bS\u0007H\nؚk\u05cf^ӿެ\u00168:ԭo@.\u001c̹vbV\n\u001dZ^\u0005\u007foІ@H6\u0013<?\\*t\u001aa\u0018zW8/4L?\u0011#a\u001fn\u001erf\u001bJ\u0013\u0004\u0017+ׯRˁKΜǵg\u007fP¹ijr%̇/O\u0013j~\fx4ۛ/t\u0015\u0014c@sea`z\u001aw[<\u001a4\u0003YX-\u0085\u00063`1&sܑRR7\u0003m̑\u000b|]j{\u000fҁrz<!Kξ\u0019~\u00176\u0004^\u0011 vnp[\u0006ryyKx\u0016eR\u000fд+ͧ4܁ϻS3Mħe\u000be\u000e\u07b3\\\u0006\u001e\u0001.Al\b\r\u000eـ\u0014M\u000fQUR\u007fG(b\u0011*l]:\u0018\"\u0007\fiSʙx_J_W~ĩ$\u0016\u001d\u001cn߿C>\u000b<z4ګAvy\u000eM͕U\f-'6\u0001\u0005:\tzF\n*\u000fA\u001e(`~P\u0007U۩\u0010ٶ@Ɋ҄HNc˨ja`wۇ{\f\u000bS\"c\u007f:D طsp\u001f9\u0010g&,\u007f+xҌ+\u000168\u001a4w]?|`J\u0007ֶm5Wĳ\fHU[ϪO\u0014T\u0011Mv\u0007\u001fdOTA41\t;.Z}ƛ%ugҮC\u0015\t4ӻ:!\u00076cw\r\u0001\u001d)3B3CF\u0001\u0010\u001eTҢE8\u0002ʾ\u001fYfi٠x&8Pz?>\u000eǊ9M)Uz}\u0003\u0003\fPx[!/fئC$-d`\u0001խJ\u0004cTIԄcFY\u001bjR\u05c851N\u0003oؘ&C\u0001ڗO6\u0011ɟp7؊D1\u0015\u001eĿplG?j<\n:\u007fgԟ-Jy\"5\u000e_\t\u0003\b}1%\u000b\u0005ظ=6\u00144LbȜ\u0012\u001a\u001e&i։&:$:Ysǜ+._\u00169ʶC\fGӣ\bRdۍo+%\u0003ʠ2l]\rAZ\u001fM\u001dyY-JHŒ\u001bc\u0018R\ru\u0014fx\u001bZ\u0003\u0015\u001b\u000fyef-m\u0010\u0602jс!V:ʂd6v*̼\u001c \f\"\u001af\"Q5|fNNzŠ\u000b\u0018s\u007fV\\4`8\u0002U\u0007\u001bz@Ԫ\n);PT.0-5a\u00118ؕ8%\u009buͶ[%\u001dϕSMF-\u038b\u0002s\u001ev\u001ffF\u0019\\\u001aO\\\tnØg\u0016D6F5$%\u001ar&3!/GѽY<\f6\u0001\u0010\u000bwX\\\u001b\u0007˅\n\u001cX[֕0%#d'@q2|AWxEKڋ6V\b\u0001\u001b;s~<|\u0010&\r\u001c[ɐ\r!O`+77\"FO\u0003@ΐ6\u0007ieǖ\u001aABU3S\u0010>G\\\u0017\u0014\u000f ̢qoIoC-Vk\u0018JlM@5$H04'@kʑpٓg\u0003(Ũ\u0007wmUü|ev<\u001eZ2!։xpoIVX\u00152=30:S'9\u05fd\u0014/\"\u000ejb+EŮa/|K<\u0011S\u0014t\u001e\u0004'\"#JQ<\f+\u0006VQ/h\u007fMMit~%\u00128Ƌiљ]ȍvK8ӛ<\u0011Hr&\u0013??ۖ\u00050~D0\u00198K/\b$\"Z\t6scO3\u0015w\u0011\u0002\u001dc\u061cW\u0016\u001f\u001b1I\u001fJ\u0017ezU1}u\u0005>g՜\tՇ9˱Ӫ})\u000b͕\f_4?Îpp\u0019r\u0001X6\u001eͿd\u0014w_XI\b\n\u0003l\u0016i2\u001etR+QecEc7S_ۡT\u0003!\u0007\u0018c_;?ŧUfJ\u0014!-_)\r\u0010A\r3\u00190C7$[M9\u0011<m Lu%AؒI\u0098y\u07b4Ӄ\u0015 \b˷\"advؽjI3U8\u0005{\u001e\u001f\u0016_6\"z~\u001d3\u001c\u001a]\u0003Z\u0010;7db\u0006\u0010\u0001Jjݐpd, k*Qyo}O/H?O_K&,l\u0003I\fIe\noY\u0003aJB\u0002ħ}ɥ7ͧ\u0018;oу\\&z_VX.Yg$u\u001fw\u0010į@]\u0016L/ \u0019G\u0019g\u001b!~Bx\\FYtRnؒ\tڙ@^:ɮQvMzϜn-GLT\u0005PG\u001c{-j^.ֱJB\u0015\r\u0003tEOS\u0016_y\u0004;C؎;8`^5\u0002\u001eU8>\u001a\u0017ĉpaǑW\u0379*\u0006iүk9\bXŪa\bn\u0013T>u \u001dZ]S8 ̡f!$;\u0006.\u0010yajv uK]ţ \u0007d\u0015#&\noSW8SɓVAa\u0002\u05ee>nvpLV\u0013n]\n&0>oޭ\t~\u000eo5[s-\u0015O>J r\f\u03a2\u0002}\b\fUFr\u0006]|\fs۾I\f9aڸGKy\b\u0012/\u0006)rO\u0019V0Rܬ&\r+\u0013@whX\u001fzU\u0004\u001c\n7\u0019}\u0006d}T҃Zׁc\u0005[׃Rw7Eʌ\u001c\u0004{QM[XOA*\\(>\bȪy{}Av&@\u00058}U\u0017\"fY܄\u0012a!>,])\u0004\u0015E\u000e\u0017ܩ\u001fNȽTƮrm\\̴kc=\tȉu@.\u001b\u0017N\u001f\u0018n\"+Y\u0011pƩCCeZ\u00076p<t&\\z;OhѸ\u0007!y\u0007;^\u0010^3qsT߳\u000fu/c۸r\u0014gV[*9Ru6e7{+\u0098\u0013_hT9}:\u0001\f\u000f8%!\\\u0004֏\u001dD<C>*) \u0002\u000b[\u001f۷B\u0013[;č+|j\u0001\u0017Q\u000f>$qC--WԤepR~\u001bWdO%pB\u0019yM\u001f^w[F\r\u0006ȗ\u0016\u05cd&Kw߇X>\u001a]ڨ-N\u0017\u001a\"M$L{+~X\u0017+Ŭ;%w!|\u0017=u\u001cLbw+\u00131=|uhO\u001dԣ6ݯZ\u0015SƨsO\u001a\tͥ\u001d_\u001bS'khhà,aXO\f-\u0012#vZ$9iÓ(ɸqwQсfs2r߽S\u0002\u001cL{\u007f<]ܤ\u0014Hy,\"\"X5\\ZzcCQ\u0006α\n\u0012\u0007EΝ\u001fv\u0007Ώ&\nXϢj\n\r^ǦnB4r2!jKK\u001fǚ.r7\u001d1QA\u000ezWku\u001b˹\\߉ P\u0014\u05c9[B\u000f\f¡&'w\u000e8\u0017\u001429Mǲ=6ZD4\u001adu\u0005c46n`=ǧ+q;Jǽ#Qdʷr\fj٨a|I9څ\u0012\rw)ܣ/W8Dڶ8ċ&\u001f<\u0002,T<[,Oٝ\u00071\u0016:eA\u0019\f_H\u000f]z;,),j9J\b7ɾ\u000eϟgTR`=edO\u001eBn:!w|2{\u001apm!\u0017`Xxܽ;\r\u0011n҅\b\u008a9ۧɓaQ\u0015ܞ;c%]ҭvh8?ғ\u000fE&nɁ2α5RVzUcIwu|ž\u001cCEw?:R2j\u0014\r^>\u001e^v\u000es\u0017a\u000b8E֮;.*<\u0006LT7k\fM\u0002\\N@Z\r4\u0001ł|ϻlzA~Rq\\}lO2\u001b\u0014\u0012B,i&B\u0019QV0\tjڄL\u0003d0ۻV֔oľɉ\u007f\u0019\tϿicL\rܟ\u0013I;Zp\u0014еR\u001aBIݞ\të\u0006^?.1\n\u000b/!nˣ\u0011!~LS&\u0014|F%\u0014\tOmy0PJU6\u0016N\u0001̆TBTGsB/r\u001dqJVS?F\u0019W#\u0013ƿ4վ|m*}V?Eh;[\u000fb~QQ\u000bMs2\u000b~,92\u0012ӽTj]Hٶ\u0015ֻTϗ߄|-\tϐZ~m3αX}Pd\u0013tܥc\"\u0016Hɋ\"۞(j;1\u001bz.<6=̪Tjd\u0018f\\\u0002Kcj\u001aW%G\u001ck@|i\u007fIaҴ8ы~\u001d.qvz-\u001fj\u0016h\u001d?N\u001aYGw\t?^c\u001c`\u0012Ԑ\r\u00190RřkɽLԌĠ\n\u0014Bҹ*]7Iө&\n\t\u0011ěl|\u000elèg҈SfE*{*=r\fXŗU\u0013\u0011\bTnZt\u0017})\u000b4\n|5IrwR+m\u0012\\g~{;߽bڪ/?r\u0006kzo]mAj;]Ku\u0015\u007fY;ʅ@t0AУnڹX͐нb/6ץM\u0005\u0001\bǬIl\u0017[؞D\u00185@лAıY;A\u000f#VC'\u00108ƜmF\u000bn76\r6&%8\u000f\u0013te\u000e&\u000fg>\u000e\u0011JЯKFEk<a.LJ\u0001+\u000b+7}O}N\u0010R~:\fkP۷\u001fт7a7\f)\u0013bxL\n9IxpwVc\u0019sʾe.\f\bť:ؑ\tɀԖ.cvޮTn\n&С_\u0019,\u001cmHŀb\\\u007fOߍhҕ\\`V~\u0010m>{;Aǧ\u0014P-yw8r\u00023s%KX\u0018\rMSsp\u007f\u0011^\"ݑ\u0019:|4\u001e8\fe}b]mZ\u0013NQw\u0001\u0007$:\u0005\u0019\\\u0011ߜ\\܉L\u0019@[E\rM4\u000f^DUS)\u0010{\u001d+aۇ_\f+_Ɣ&֩+̀ǭ\u0002J\u0012Ԩce\u0003!İX\u0006r\u000eP)ȇO5\u0013#ЌEڐ\u0013:J,Wgx33Zٵ\u0015`IUf\u000b>QBhSn)\u001f<z\u0013 \u0014\r}\u0013U)+HX@Ȓ[\u05faZ\u0015h)\u000b\u0011l\u0019r%6\u0019'\u0001Q'\u00138qɲrv\"sǺ>ʦT\u07fcϤ%y_\u009bgCRXϫ:94n\t![&Eu\tX6Sե}m\u001e\u000evv#+T&-7m\u0012(|\\e%\u0001xФi\r\"xVd\u0018u\u0001\u0013,4H\u0016݉\u001f+yx\u001c=SZd}I;2\u0002kJU2\u001e\"s͡\u001cG\nK-O#7\u001ac+\u0002WCǽ\u001c\u0016J/y|7b$\u0014\u0017\u001d{wZҺv4\u000b\u0014\u00115Rd=b}\u0017n\u0012ܖw8m\n?\u000b#_\bw\u0016%R)pr:M}rl\u0002\u0002r \u001c\b.\u0017[O}\u0010\u0002_eeFÔO>\u001b/l:\u001d#\u0012`\u0015\f4\u0013<'L\u00063+\"Win9!\u0004-Yƕ;ٯ;Ο̚2U*Ð$\u0014k(їUN!IZWH-*\r\u0018h_\u0012ٞr.\u000b\b\u00182$*%Tg\u0015-:\u0013xR>e=9\u0017q~\u0014\u0012=@UBPY?iU4gNˈy4~[\u0019^rD\u00062F\u001d\u001bCy;C[\u0005j\u05c81i0@J\u000b.\u0017[<N\u0014X\u0007 \u0019Al\u0005\u001eTh4\u001e{\u0003c:eȐ\rڻ9ݏʹ\u0011\u0018EѱRqt>ƃf\u001f\u001aUrGrSْ4\u001fNM\u0018\u001c٨gȊ<GBqI7\u0006,h\u0007ϖN\u0012b\u001deVO\u0002SR\u0005\bi\f\u0003-I>}\f9LՄ6ҟ\u007fo`\u000fl\u007fcs82Nvh\u001dex\u000bmR2\u001c\u001d\u0002k Ԏ5\u0006LX֖Lݧ+۸\u000b{]ټm\u0018\u0018Z\u0016K\u0017\u007fĊ\u000bYb=\u0006\u0018ڒ\u0006ǈ<owY6l_^\u001a<ȅ?Xm@}]F&(60D\u0017gc\r0gv&]F5\u0093\n\u007f=!n\fll*?S~r}j\rWS3\u07fbAߩ.F2\u0011\u0016\u0017\u0012qDT\u001f\n*Df\u0019-9\u0014yW`(YT\u06dd\u001aA@qο-՛oڰY2\u0006ΥFS3\u001du\\Zy\u0017h0w\u0019Wп?\u0017\"n/3[kh&@`\u001c\u0014\"fx\u000fz~X\u007f\f2xa\u0003&n4{,.2Gj]\u0013Τ4r\u0017*z\u001d7\u0003irZa?'\u0013\u0006\u0019\u0016\u000e\u000f)\u0013@U}cS=YΟFˋ|Сޙ_\fyז\t\u001d_Pރ0$CEE7r#\u0017sLyF\u000bɍ$)N\u000e\u0002)v\tAq0*m\u0005!<\u000bLzUi\u0005|H?<-)\u001c'&pc\u001dK\u0017IZ˴7Ko\u000f>2|\\aSv\b6-\u0006m\u0007j\u001avȳ\u007f)J\u007f$\u001dk\u001f}\u0014za\u0005VH\u001fi(%\u0011\u0018\u0016/,.-t\"x݇aγrċι^g%ǒ9\ndtƴw1brg`@dα)l\u0006\u000b-MVlUb!ؼ^Fjtؑ,TW#ڽ\u0002MVo3,ҵI\u0015)\u00049\\&mݬc\fSS\\\n$l*uI\u000bуA0\u001dXF3!՟[\u0001|@r#U@Ĝ{-`RlD23'-\">:<\"\f\u0017\u0017`veT\u001ew1\u0001r\u0005[\u001fRF$ӾOޒ\u0018ҺҩB\u000eF2n\u0017~ǉY34L\b%\u001aN۰Ir;{\n;yw\u001cZ\u000eIƅ\u0004k\f[+\n\u001aǐlh\u0007gn'\u0017\bJYʁ\u001bgnaS\n (q.<{ٗ\f>H/L^/ݑ\u001cT \u0003g;zW\tqˉ?~\u0018\u0016Hq0y3[\u0018?wSae!S?/\b\u000e\u0014S\u0004\u0007!MB>F?\u001c˂u۠`̗ν\u001c8\u0017P*S$ߎa}F3xP@Zk:ٝ[\tJn]2,X#t%\"͛k\u0016aI+@\u0015̈́x3/V-qb4\u0012k8\u001f%GņUn9L#0P8\u000f\u0014Cw\u000f\u0003\u001eս\u0004#Wz\u001e0?y!tb3\u0003\u0014Ӈ`k\u0016}P}*{\f8E\\-\b̀I\u000f\"Xp=}<Q_W=Uzg®sF9{øD>zoْ\u0014hh|T+E\u0013֝Bx\u0019\u0006\u001f@13PV4)U[a\u00151ސi=f~[\u0003\u0001fq\f\u0092,f\u001c\u000e\n'\u0002-*$(j}AmJYk\u0005XMk9NTzؖ\u001cѵnפ?|\u001eä7aU%\u001dQ\bg\u0088R\u000b3811\u001f)Vnr\u001b\u0002\u0017-Ss˱{Iv\u001b\u0018.[q\u000fiҗ\u007f-(>\u0014P\u0016&K\u001c\u001fxd<\u0006;OB8\u0010\u000e\u0016\u0002\"\u0007YǠ{̃xʫ.-\u0002֊c\u001dyfWJ\u001f:ϏG\u001e\rmV\u001fm*)\u001d:Ԛ X1P\u0014\u00012cZ\u001dҵx\u0011~v݇6RzGlN;$)5U#\u0010\u0015Ѡm1JKsYXn[h'ʥ`@n\u00076\u007f\u0003\\3M\u0007$\u001cyÀ\u001eWU\u0010)\u0002:\t$V\u00126TqЄ\u001dNv<2;kuLJN\u0017\n2GH=زk'\u0010EN'|Qre9\u007fuL'@\u001fG\u0005\u0002\u000eAV\u0017C[\u0019E\u001e/\u001b\u0001\u000fs,\u0010͗*ץFӕW\u00161\u0098\u000b9J\"|!#\u0006s\r\u0006P7\u0012ʷ\u0018\u001ah\u0012BuS(l\u0003><*zj\u0010\u001eҜ/hxe6(\f6T9Z v\u001fmD\u0010Xa8\u0006pKS\u0013<1?\u0013\u0017/O}hV{ԬoĊbҮz5?\u009b?\u0014S>T\b\u0005F\u0016f\u001dB\u000bvÐ{@s\r.)^Ky8&ԹQ~{\u0013\u0018_\u0018\u0019\u001dr\u0019)nLו\u00065^\rMFVBZf\u0010\bH%ш\u001eDdqP\bcK*4>9Ox~ހt\u0011r|\u001dKظ(\u0018U\u0005h֙jst8)6Ԁ\u0012Q\bgdτL\u0005CXљ0\u0003A\\\u0018%\u0011j8\u0005Ø\f)Wsݜ.>z\u0005\\V+cM,V\u001d\u00199!Ŋq\u000eX\\`\u000fc\u000fCk\u0018@²dW\u0007tõaEV\u001dWG\u0013\u0004:IR\u0010dU4,\u0016֫Tn[ʁQ\u001cfA̱=Q=\n&\u000eRz\f8)u{OrQCνEfvſ5]x\bҾ^H64-6!Z(,\u0018W~r<v\u0002Ұ@J\rݣijy\u0016ȅT4\u000f\u001cxS? MKM\u0006\u0019\u0010p\u0010,ԁP\u000b\u001dО0I&.֯m\u000b\u001c%;Up\u001eYOc`w\u0005ebtܲw\u001b\u000bѺ\u0016R/Rը\u0010_\u0010K\u0011OEUk[5i BS!zĮ;o\u0001ͩ\u007f|\u0006`ȴ\u0001<Ij\u001d>n`ò-y\u0003ntJ1avLM\u000fT7>'\u001ebC=2`5v\b~okJ\u0007k{\u007fգ\u000bٳpǶc\u001cWȷS\u0012\"\"t)(aԼ|\u0015\u0015\u0001bM,n?8`A\u0003\t0H\"b|$1@\u0018\u007f>tNGY\u000bYa/ѕZɒ\u0012ڕ\u000e\"\u0011ߴ\u0005\u0003?n3\u001a:\u000f۩\u001fH\u0019\u0003 y#W\u0001\u000f%=kcq\u0006?Dw2\u000bqY5)\u001b\u0016\u0012c\u0016\r`%ș2ŻnѻТ.'ŞCi`-݇%^\u0012ky\u0007\u0007\u0002ǋu0a\u000f\u001f.-MM@(K1\u0017L\u001d\u0015hMl94Ot\u0015+*vJ0\u001cYu߽yڵ\u001a۸Г]\u0004\u0017НF|\u0004\u0019څ-L/AFP\u0011Y˷c=W2\u001e\u001cQ#\u001cs&\u0007`$~QT\r\u0012\u001aLw\u000f\u007f\u0003k\u0002>yl\u0012jS̱>߆yىٟZy\u0010҆P3\r1ʱZow1ҲJ\u007f#Cȡ\u000b\rf!\u000flwNi\u0004@mn\tTBk\u001b.ve;ig\u0002|\b\u0001\f\u05f6\u001dv$^ʵ\u0018Վ\u007fڰƦO2rɚt\u0019ݾ\u0014\u0012dNǣO\u0007\u0016~Ț4\r>N܌)S\u000bz((\u001d\u000e\u001fmS\"ta\u0010\bl-v\u0011\u0003l%+\u0003V\u00074f܊\u0001ODnӈG̈\u0018̉ړlCyۼ\u0015m֖\u0019I\u001ckÚ|SCbhw)\u0001fABsu[ģ&L:{K\u0002\u0012}hJL\u0010cT:ceqS\u0016'c\u0005߅i\rd~\u00078y+h^d)\u00132ۮ\\(I\u001f?\u0015\u0019\u0002+?\t*>McX/%|])U\u001f̍V'G&OMI$zR^&koğ\u001e\u001aV4A\u0018335uN\"PC;R4\u00104z$\u001boRB\u0014H\\/\u0006TAbőe߉J\u07fb7$wʇ\nGXM;\u000f\u0014\u001fY%4Ww\u0001Ċ\u0013gE^\rIx\fGC|4KAmF9xvPAgzP1\u001a8)d.n\u0019?̄,ՀpМ\u0013\u0012kԑ\u001f\u0002B(˝csHD2\u001c1:\u000bDc\u0003F-߽dyS\u001fʜp)`_ z~v\u00125MS;\u001dӝV\t@SĠT-3\u0007DY0cÑ\u001f]*-Ne٫8=C/\u0019MELܶ\u000e<+/!I\u0005P8B`\u001f\u0003˘\u000e:\u0006T\u00198P?w8\fvK8\f\\~\\\bN;$u\u0015ҚF.bHF8]ޅGm2OĞ)\u001d\u001c\u0010\u00137C+\u0004\u0018jd\u001b!̐\u001fe\tqވP\u001eO\u0011'Q\u001d0M\u001c,UbYܫZM2.sj3({\u001d̎m)\u0011UY4\f2Rpݫ1N8\u001eـC\u000e\u007fUjB\u0006n\u0019`0f2(Jۡtj:\bՠ\u00050,L\u007f\\\u0004+\u000e$wi&0ܮNlBK\u0011%[\u001ez6bv\u001d]ݾ[\u001dDEY+\u001b&(o\u0005>k\u0011uϒx\u0002Qaă\u0018\u0019H\nL&W~\u0005fKWDxۃ\n\u0015\u000bos.Jj\u001bQϘ\tgzxΎ\u0001/V;a\u000fl@1\u0007\u0010\u0015\u000f7bŹ<\u0007E^\";\u0016n4\rƾ\u00138ZxӚ7E}\f_[`lX7]$\u0006O&ɝy\u0015`Ue\u001cj\u0016Euʅ}~nK̸z\u0001\n7ktU \\|kQm\tuǾ8\u0003\u001f,Y6^d^=݇9{HHٓt\u0011\rW\b\u0015H+\u0018uWz'R\tړW\r\"_۶e)n{7[\u000f>WP\u0007C_+ͦ\u0016cO9\u0004/Cv\u0012DԡZ\u0010\u0011\u0002ˏ2\u001f\u001e`%E.O\u000eM\u000em\u0017\u000bSϕhm\u001f*4A:Z%dq@Ǯ\u00028;\u007fɪ^\\tKDmq'vlxa\u00077QlILg$ѵ0%\u001b2SW\u0002V\u0005@=\u0018\u000e]\u000b4Tc,\u001b'vi\u001fKĀ+dG25&hw\"\u0017Ͻx\u0005Rej\u0001U;u<ͪ6\n\bj5R-2!:*\u001edx̅y2\u001eDl\u000b\u0017(\u001bV\u0002RbV9+/^4-s\u000b\u000f\u0019#'\u0011XNn\u000fͫ7hV/MG\u001e_sOֽEn\u0005_xafB\bHw\u007f[ib,\u001e\rgL/8\u0015WL9\u007f\u0007<S \u0015(\u001f6\u000bȥcZ'\u000eJ`_tl>;3E.۬\nn%>\u0011%̎+i\ry\u00187\u0011r_5h/e>[܅1C-=\u0005(Ncl\u0015\u00052jGN\"\u0010wO~\u001b\u0002(s{\u0014ݜ{w\u0002DY3E/$\u0018>\u0019\n&fw\t8\u0014\u0010\u0001жpZ\u0017\u0018%mQ{W^Gb֞9\\۲WԱ^Sn܆;IÂ Rǔ\\t\u0003\u001f='\u007f`H73JD\bЦy~\u000e\u0006NP[\u0013\u0014\u0017a?O\u001aB[o\u0002\u001d=K \u0006\u001d\u0001slϐ\u000f\u0002Xz,:\u0018\u0016\u0012\u0002U4Űn~m\u001a(\u000b^\f`(gY\"̇YO29\t\u0014\tNrr(Uzޜ&\u001b^\u001eOO}Ĩy}\u007fb]*\u0005tYhg~A҂%Pr:Rd:\u0007:?г3ź\u001aٽˠI-Uф\u0007j\u0019b\u05cc\u0016\u0012\u0004w>gf\u000e@M P\u001e`-\u001eI\fT2q!v p\u000bүA\u001eY\u0007k\u0019\u0012mx_wr>=4&NY]itΌB9\u00010\u000b\u0019\u0015o\u0001Q\r~з@IF\u0004ݤ{-T\rQix*}3Q%osϱ\\\u001405GR;_@8$\u000e\u001dxbg\u0014xbZk\u001ebRh%.ƌxt\u001fy$aI\u001a\u000b\u001f*q@w|pM/EGJ_*ʈw\u0006;N7A>'1\f/\u0006%Յ2kA/K&6ш2M*\u0001\u001e'Us7ut\u0010<̶[VH\"\u001b\u001em*[\u0003ճ\bܕ|̼B\u0007\"ܸk)\u001c\\aJ2D^Y*Cp`9\u007f<\u001bML7icTF\u0019ӭT-\u0017| \b\u0011d7$\u001d7GL\u00070]֖M+:'\u0015+5*pPq\fchÄ-z+bYI\u0001,v\u007f#\u001cK3`\u001c\ftx|Yg e\nHbH\u0003xǑ6# oreIyPpT6s׳/\u0014V#?gXɲ\r\u001fE\u001d7\u0010 TWWao\u0019տ>|M\u0013yVl\u0019,\u000e܌\u0003ŭ+ıӇ>|M0_Ùn^Pɽ5ю5"}, d2 = {"/k[", "", "\"", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "/mh", "/r8AX9:P ~", "/rB2d<>\\\u0017~", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "/rb<V0:b\u0019", "", "\u0019", "$", "BqP;f-H`!", "\u001aj^A_0G\u001d\u0004z~k\u0002", "/rb<V0:b\u0019[\u000f", "9dh X3>Q(\t\b", "D`[BX\u001bKO\"\r{h9\u0005", "/rb<V0:b\u0019[\u000fM6", "\u001b", "", "2dbA\\5:b\u001d\t\u0004", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWL\u0006)<#e\u001cBC|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u001a\u0001Pk^=5j\u000eG.\f3\u0013i7sV", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWL\u0006)<#e\u001cBC|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u001a\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJt>\n@duX=\u000fr9h\u0013)\u0005XE\u0010", "/rb<V0:b\u0019m\u0005", "/rb<V0:b\u0019p~m/", "D`[BX\u001a>Z\u0019|\nh9", "/rb<V0:b\u0019p~m/k\u0013", "/uT?T.>", "", "", "/uT?T.>=\u001a[\u000fm,", "/uT?T.>=\u001a]\u0005n)\u0004\t", "", "/uT?T.>=\u001a_\u0002h(\f", "", "/uT?T.>=\u001ab\u0004m", "", "/uT?T.>=\u001ae\u0005g.", "", "/uT?T.>=\u001al}h9\f", "1gd;^,=", "", "Ahi2", Global.BLANK, "1n\\=b5>\\(J", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u000f\u0001<\u0012\u0013`Nk\u0017>@\u000f2^}\u001eFC", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n]AT0Ga", "\u001aj^A_0G\u001d\u001d\b\n^9\u0006\u00056/i1\u0003Td \"W~|P\u0002%C/", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u00070", "1nd;g", "", "2hbA\\5<b", "2hbA\\5<bu\u0013", "Ad[2V;H`", "2q^=", "<", "2q^=?(Lb", "2q^=?(Lb\u000b\u0002~e,", "2q^=J/BZ\u0019", "3kT:X5M/(", "7mS2k", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016dZ}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;ckbE|(\u0013\u0011v\nExn\u001fV\u0003 5|k", "3kT:X5M/(h\b>3\u000b\t", "2dU.h3MD\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016d}\u001dQ~\u0015@\u007fn:j\u0006i8}\u001f,\\GEtBguxj7\u0016g6WB|\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\u000f\u0002J\u0010\u001e\u001bP9\u0013M~n6i\u0007\u001eFq 7[\r\u001c{=\u001c$lkBR9o5{#XH\u00183X[t\u0007}\u000f_\u000eL:b", "3kT:X5M/(h\bG<\u0004\u0010", "4h[AX9", "4h[AX9\"\\\u0018~\u000e^+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4h[AX9\"\\\u0018~\u000e^+k\u0013", "\u0011", "", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWL\u0006)<#[*>t\u0016,\\GEt\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-;\u001az\u0006\r(Z}\u0005x\u0010\u0010\u001dW\u0013twIV\u000eV}\u001f~\u0017", "4h[AX9\"a|\b\tm(\u0006\u0007/", "\u001aj^A_0G\u001d\u001d\b\n^9\u0006\u00056/h2_I\u0002\u0017$\u001d", "4h[AX9\"a|\b\tm(\u0006\u0007/T\n", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWL\u0006)<#[*>t\u0016,\\GEt\na{m]J\u0003-<]z.\u0011*X3cRpL\u0018\u001ccc", "4h[AX9'](", "4h[AX9'](g\u000be3", "", "4h[AX9'](g\u000be3k\u0013", "4h[AX9'](m\u0005", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWL\u0006)<#[*>t\u0016,\\GEt\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-:\u001az\u0006\r(Z}\u0005x\u0010\u0010\u001dW\u0013twIV\u000eV}\u001f~\u0017", "4h[AX9-]", "4h]1", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001aLj.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017", "4h]1?(Lb", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f.\u0006O\b\u001b \u0011t\u001fD@&Eb{/;w\u001f<\u0017$Kt2-\u0019rj\u0005\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "4ha@g", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016D}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019", "4ha@g\u0015Hb\u0002\u000f\u0002e\u0016}", "4ha@g\u0015Hb\u0002\u000f\u0002e\u0016}r<N\u0010/\u0003", "4ha@g\u0016K<)\u0006\u0002", "4kPA@(I", "4kPA@(IA\u0019\u000b\u000b^5z\t", "4kPA@(I7\"}zq,{", "4kPA@(I7\"}zq,{l>e\r$xG\u0001", "4kPA@(I7\"}zq,{v/q\u0010(\u0005>\u0001", "4kPA@(I7\"}zq,{w9", "4kPA@(I7\"}zq,{l>e\r$xG\u0001\u0006!", "4kPA@(I7\"}zq,{v/q\u0010(\u0005>\u0001\u0006!", "4kPA@(IB#", "4kPA@(IA\u0019\u000b\u000b^5z\t\u001eo", "4n[1", "7mXA\\(E", "=oT?T;B]\"", "/bR", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#*AuC%\u0019q+>\u0018kuO\u00070E[R6e`<\u001e$\u001bX\u001dR5\u0016Q/\u0005\u000bs@H\u001bQ3E\u000b=2j\t\u001b\u000e3yF", "4n[1<5=S,~y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#*AuC%\u0019q+>\u0018kuO\u00070E[R6e`<\u001e$\u001bX\u001dR5\u0016R/\u0005\u000bs@H\u001bQ3E\u000b=2j\t\u001b\u000e3yF", "4n[1E0@V(", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006`\":Y{/\rT\u001c8\\J?t}#&p+:\u0017l*]z1PZ\u0018\rl[pL\u0018\u001ccZ$ns\nUR 8K3(\nu3~@h~\u001bk", "4n[1E0@V(b\u0004],\u0010\t.", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006`\":Y{/\rT\u001c8\\J?t}#&p+:\u0017l*]z1PZ\u0018\rl[pL\u0018\u001cc[$ns\nUR 8K3(\nu3~@h~\u001bk", "4na\u0012T*A", "", "/bc6b5", "4na\u0012T*A7\"}zq,{", "5dc\u001ce\fEa\u0019", "5dc\u001ce\u0015NZ ", "5q^Bc\tR", "5q^Bc\tRB#", "", "5q^Bc0GUu\u0013", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\"\u000e!'Rs\u0017>L", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u0007\u001f", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006`\":Y{/\r1y", "7mS2k\u0016?4\u001d\f\tm", "7mS2k\u0016?:\u0015\r\n", "7mc2e:>Q(", "", "=sW2e", "8nX;G6", "\u000f", "\u001aiPCTuEO\"\u0001D:7\b\t8d{%\u0003@V", "\u001aj^A_0G\u001d(~\u000emuX\u0014:e\t'w=\b\u0017l", "0tU3X9", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWCr.7#Y+Bm\u001f-I@Bk\n\u0005\u001adr5Pj(Wxp%OJ9JR~M\u0014\u001bX\u000e$\u0012\u0012\u0001j=mu@@!Q\nL}HV\u0001\u0018&\u000e>hp\u0018=\u0015C\u000b\u0011?H%qH#=|CN3b6t\fh\u001b\\\u0010\u001e\u000b\u0019m*\u00172W*\u0013}\u001dnuN\u0007UgS)zA\">CBLO~\\@}p$\\\u0004A\u0013Bar:x7\rBs\u0017t\u000eIv\u001cHgDjoCF#72\u0006\u001a;Te?HI\u0019h(`\u0004\u000bi5\u0007", "8nX;G6,b&\u0003\u0004`", "", ":`bA", ":`bA<5=S,h{", ":`bAB9'c \u0006", ";`_", ";`_\u0016a+>f\u0019}", ";`_\u0016a+>f\u0019}ch;e\u00196l", ";`_\u0016a+>f\u0019}ch;e\u00196ln2", ";`_\u0016a+>f\u0019}ih", ";`_\u001bb;'c \u0006", ";`_\u001bb;'c \u0006ih", ";`_!b", ";`g", "", ";`g\u001ce\u001bA`#\u0011", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016D}\u001cC\u0001\n\u0006}!>[G}Au!*Z?8r4s", ";`g\u000fl", ";`g\u000fl\u0016KB\u001c\f\u0005p", ";`g\u000fl\u0016K<)\u0006\u0002", ";`g\u001cY", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001aLj.QJ=X\u001cy9\u001d\u0014$kX3\u0018\u0001f=!uD\r", ";`g\u001cY\u0016K<)\u0006\u0002", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001aLj.QJ=X\u001cy9\u001d\u0014$lX;\n\fY\u0017", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001aLj.QJ=X\u001cy9\u001d\u0014$nU5\t\u0014/", ";`g\u001cY\u001eBb\u001c", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWL\u0006)<#[*?x\u0012;IREx\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-:\u001az\u0006\r(Z}\u0005o|\u0015\u0018W\u001fguBT\u001f\u001d", ";`g\u001cY\u001eBb\u001ch\bG<\u0004\u0010", ";`g\u001ce\u0015NZ ", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016D}\u001cC\u0001\n\u0006}!>[G~A}\u00135M\u0019", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016D}\u001cC\u0001\n\u0006}!>[G\u0001>w\u0012=#", ";`g$\\;A", ";`g$\\;A=&m}k6\u000f", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWL\u0006)<#[*?x\u0012;IREx\na{m]J\u0003-3J\u007f)\u00116K1\\P\u0002\u0013", ";`g$\\;A=&g\u000be3", ";h]", ";h]\u001ce\u001bA`#\u0011", ";h]\u000fl", ";h]\u000fl\u0016KB\u001c\f\u0005p", ";h]\u000fl\u0016K<)\u0006\u0002", ";h]\u001cY", ";h]\u001cY\u0016K<)\u0006\u0002", ";h]\u001cY\u001eBb\u001c", ";h]\u001cY\u001eBb\u001ch\bG<\u0004\u0010", ";h]\u001ce\u0015NZ ", ";h]$\\;A", ";h]$\\;A=&m}k6\u000f", ";h]$\\;A=&g\u000be3", ";h]Bf", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u0007\"p0/\u00112qH\u000bju5z5V\"", "3kT:X5Ma", "", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016v}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019~R9\u001a&d+I\u0016g3\u0018]+U[$", ";h]Bf\fES!~\u0004m", "<n]2", "=m4.V/", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001aLj.QJ=X\u001cy9\u001d\u0014$q]+\u001a\u0001VH$D", "=m4.V/\"\\\u0018~\u000e^+", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001bLj.QJ=X\u001cy9\u001d\u0014$q]+\u001a\u0001VH$D", ">`aA\\;B]\"", ">kd@", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011/\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl\r.t\nMrn<U\u0007\"\u0001W\u00133MAJAw\u0005\u001adr5Ps;R}p.P\\;2", ">kd@83>[\u0019\b\n", "@`]1b4", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ.t\nMrn<U\u0007\"\u0001W\u00133MAJA", "\u001aj^A_0G\u001d&z\u0004]6\u0005R\u001ca\t'\u0006HV", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl}My\u001dCz.~fy)6w\u001ew:?Dj>&j,H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g", "@`]1b4(`\u0002\u000f\u0002e", "@dSBV,", "!", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001bLj.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017", "@dSBV,\"\\\u0018~\u000e^+", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001cLj.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017", "@dSBV,\"\\\u0018~\u000e^+f\u0016\u0018u\u0007/", "@dSBV,(`\u0002\u000f\u0002e", "@dSBV,+W\u001b\u0002\n", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f.\u0006O\b\u001b \u0011t\u001fD@&Eb{/;w\u001f<\u0017$Kt2-\u0019rj\u0006\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "@dSBV,+W\u001b\u0002\nB5{\tBe~", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f.\u0006O\b\u001b \u0011t\u001fD@&Eb{/;w\u001f<\u0017$Kt2-\u0019rj\u0007\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "@dSBV,+W\u001b\u0002\nB5{\tBe~\u0012\t)\u0011\u001e\u001e", "@dSBV,+W\u001b\u0002\nH9e\u00196l", "@d`B\\9><#g\u000be3\u000b", "@de2e:>R", "@t];\\5@4#\u0006y", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#*AuC%\u0019q+>\u0018kuO\u00070E[R6e`<\u001e$\u001bX\u001dR5\u0016Q/\u0005\u000bs@H\u001bQ<X\u0006B2g\u0010$\u001d\u000b", "@t];\\5@4#\u0006yB5{\tBe~", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#*AuC%\u0019q+>\u0018kuO\u00070E[R6e`<\u001e$\u001bX\u001dR5\u0016R/\u0005\u000bs@H\u001bQ<X\u0006B2g\u0010$\u001d\u000b", "@t];\\5@@\u0019}\u000b\\,", "@t];\\5@@\u0019}\u000b\\,`\u0012.e\u0013(z", "AbP;", "AbP;<5=S,~y", "Agd3Y3>", "Ah]4_,", "Ah]4_,(`\u0002\u000f\u0002e", "AkX0X", "7mS6V,L", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "AnaA5@", "AnaA5@\u001dS'|zg+\u0001\u00121", "AnaA7,LQ\u0019\byb5~", "AnaAX+", "AnaAX+\u001bg", "AnaAX+\u001bgw~\t\\,\u0006\b3n\u0002", "AnaAX+\u001dS'|zg+\u0001\u00121", "AnaAX+0W(\u0002", "AtQAe(<b", "At\\", "At\\\u001cY\tRb\u0019", "At\\\u001cY\u000bHc\u0016\u0006z", "At\\\u001cY\rE]\u0015\u000e", "At\\\u001cY\u0010Gb", "At\\\u001cY\u0013H\\\u001b", "At\\\u001cY\u001aA]&\u000e", "At\\\u000fl", "At\\\u000fl\u000bHc\u0016\u0006z", "At\\\u001cY", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "At\\\u001cY\u001c\"\\(", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001aLj+", "\u001aj^A_0G\u001d\te\u0005g.R", "At\\\u001cY\u001c%]\"\u0001", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001aLj,", "B`Z2", "B`Z2?(Lb", "B`Z2?(Lb\u000b\u0002~e,", "B`Z2J/BZ\u0019", "Bn1<b3>O\"Z\bk(\u0011", "", "Bn1Fg,\u001a`&z\u000f", "", "Bn25T9\u001a`&z\u000f", "", "", "Bn2<_3>Q(\u0003\u0005g", "Bn3<h)ESt\f\bZ@", "", "Bn59b(M/&\fvr", "", "Bn7.f/,S(", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a5o\u001d\u0012", "Bn8;g\bK`\u0015\u0013", "", "Bn;6f;", "Bn;<a.\u001a`&z\u000f", "", "Bn<Bg(;Z\u0019e~l;", "Bn<Bg(;Z\u0019lzm", "", "BnB2g", "BnB5b9M/&\fvr", "", "CmX<a", "Eh]1b>>R", "AsT=", ">`aA\\(EE\u001d\byh>\u000b", "Ehc5<5=S,", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E$\n\u0016\u0017Zo\r-r,EYS", "Hh_", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016v}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019\"q>-\u001clj\u0003\ft4\u0018w7PJ]0f[\u0001\u0007t\"c\f]/\u0017\u000e&\u0017gUI30\u0004uY\u0011?oJr\u001a\u001cD@", "Hh_$\\;A<\u0019\u0012\n", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\u0003.*)!\u001e.\"'%)\u007f(")
public class CollectionsKt___CollectionsKt extends CollectionsKt___CollectionsJvmKt {

    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt___CollectionsKt$elementAt$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;\"&i\u000eJLcz\u0004OيH\u000btA\u001f$2ߚ\u0006\u0006\u0017nG0\\ev/\u0019[֖\u0013m\u000262^"}, d2 = {"\n`]<a@F])\rS", "\"", "7s", "", "7me<^,", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1<T> extends Lambda implements Function1<Integer, T> {
        final /* synthetic */ int $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i2) {
            super(1);
            i = i2;
        }

        public final T invoke(int i2) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt___CollectionsKt$groupingBy$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0015\u001d̉=!4i\bDJe|\u0004O,8éVAչ(4(Մ7rz;@D\u001c߉>Tc*Ej*3ln2q[;\f\u0019.&\u0017Pfg\u001eñ\u0011nŲG\u000f\u0014\u0018Av:Lm~m\u0014\u001f2xģm7\u0014\u0004\u07b2=e"}, d2 = {"9nc9\\5\bQ#\u0006\u0002^*\f\r9n\u000eqYJ\b\u001e\u0017E~\u0012F\u007f3\u001bhw\u001a1K 5TC9z8(\u001evGHEe9X\u00072KUP\tp\u0011>", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\"\u000e!'Rs\u0017>L", "9dh\u001cY", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "And?V,\"b\u0019\fvm6\n", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class C13421<K, T> implements Grouping<T, K> {
        final /* synthetic */ Function1<T, K> $keySelector;
        final /* synthetic */ Iterable<T> $this_groupingBy;

        /* JADX WARN: Multi-variable type inference failed */
        public C13421(Iterable<? extends T> iterable, Function1<? super T, ? extends K> function1) {
            iterable = iterable;
            function1 = function1;
        }

        @Override // kotlin.collections.Grouping
        public K keyOf(T t2) {
            return function1.invoke(t2);
        }

        @Override // kotlin.collections.Grouping
        public Iterator<T> sourceIterator() {
            return iterable.iterator();
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt___CollectionsKt$withIndex$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,\u0010\bDJc\u0003İY\f@\r>BE\"Z\u0011\u0018\tlʑG0\u000bm߬2RY+"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C13431<T> extends Lambda implements Function0<Iterator<? extends T>> {
        final /* synthetic */ Iterable<T> $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13431(Iterable<? extends T> iterable) {
            super(0);
            iterable = iterable;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<T> invoke() {
            return iterable.iterator();
        }
    }

    public static final <T> boolean all(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static final <T> boolean any(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Iterable<T> asIterable(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable;
    }

    public static final <T> Sequence<T> asSequence(final Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new Sequence<T>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return iterable.iterator();
            }
        };
    }

    public static final <T, K, V> Map<K, V> associate(Iterable<? extends T> iterable, Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(it.next());
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <T, K> Map<K, T> associateBy(Iterable<? extends T> iterable, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (T t2 : iterable) {
            linkedHashMap.put(keySelector.invoke(t2), t2);
        }
        return linkedHashMap;
    }

    public static final <T, K, V> Map<K, V> associateBy(Iterable<? extends T> iterable, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (T t2 : iterable) {
            linkedHashMap.put(keySelector.invoke(t2), valueTransform.invoke(t2));
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(Iterable<? extends T> iterable, M destination, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t2 : iterable) {
            destination.put(keySelector.invoke(t2), t2);
        }
        return destination;
    }

    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(Iterable<? extends T> iterable, M destination, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t2 : iterable) {
            destination.put(keySelector.invoke(t2), valueTransform.invoke(t2));
        }
        return destination;
    }

    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(Iterable<? extends T> iterable, M destination, Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(it.next());
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    public static final <K, V> Map<K, V> associateWith(Iterable<? extends K> iterable, Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (K k2 : iterable) {
            linkedHashMap.put(k2, valueSelector.invoke(k2));
        }
        return linkedHashMap;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(Iterable<? extends K> iterable, M destination, Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k2 : iterable) {
            destination.put(k2, valueSelector.invoke(k2));
        }
        return destination;
    }

    public static final double averageOfByte(Iterable<Byte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double dByteValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dByteValue += (double) it.next().byteValue();
            i2++;
            if (i2 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i2);
    }

    public static final double averageOfDouble(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i2++;
            if (i2 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i2);
    }

    public static final double averageOfFloat(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i2++;
            if (i2 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i2);
    }

    public static final double averageOfInt(Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double dIntValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dIntValue += (double) it.next().intValue();
            i2++;
            if (i2 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i2);
    }

    public static final double averageOfLong(Iterable<Long> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double dLongValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i2++;
            if (i2 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i2);
    }

    public static final double averageOfShort(Iterable<Short> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double dShortValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dShortValue += (double) it.next().shortValue();
            i2++;
            if (i2 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i2);
    }

    public static final <T> List<List<T>> chunked(Iterable<? extends T> iterable, int i2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.windowed(iterable, i2, i2, true);
    }

    public static final <T, R> List<R> chunked(Iterable<? extends T> iterable, int i2, Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return CollectionsKt.windowed(iterable, i2, i2, true, transform);
    }

    private static final <T> T component1(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(0);
    }

    private static final <T> T component2(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(1);
    }

    private static final <T> T component3(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(2);
    }

    private static final <T> T component4(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(3);
    }

    private static final <T> T component5(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(4);
    }

    public static final <T> boolean contains(Iterable<? extends T> iterable, T t2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t2) : CollectionsKt.indexOf(iterable, t2) >= 0;
    }

    public static final <T> int count(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i2;
    }

    public static final <T> int count(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue() && (i2 = i2 + 1) < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
                CollectionsKt.throwCountOverflow();
            }
        }
        return i2;
    }

    private static final <T> int count(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }

    public static final <T> List<T> distinct(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.toList(CollectionsKt.toMutableSet(iterable));
    }

    public static final <T, K> List<T> distinctBy(Iterable<? extends T> iterable, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (hashSet.add(selector.invoke(t2))) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> drop(Iterable<? extends T> iterable, int i2) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt.toList(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i2;
            if (size <= 0) {
                return CollectionsKt.emptyList();
            }
            if (size == 1) {
                return CollectionsKt.listOf(CollectionsKt.last(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i2 < size2) {
                        arrayList.add(((List) iterable).get(i2));
                        i2++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i2);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i3 = 0;
        for (T t2 : iterable) {
            if (i3 >= i2) {
                arrayList.add(t2);
            } else {
                i3++;
            }
        }
        return CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static final <T> List<T> dropLast(List<? extends T> list, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i2 >= 0) {
            return CollectionsKt.take(list, RangesKt.coerceAtLeast(list.size() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static final <T> List<T> dropLastWhile(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                    return CollectionsKt.take(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return CollectionsKt.emptyList();
    }

    public static final <T> List<T> dropWhile(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (T t2 : iterable) {
            if (z2) {
                arrayList.add(t2);
            } else if (!predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
                z2 = true;
            }
        }
        return arrayList;
    }

    public static final <T> T elementAt(Iterable<? extends T> iterable, int i2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i2) : (T) CollectionsKt.elementAtOrElse(iterable, i2, new Function1<Integer, T>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt.elementAt.1
            final /* synthetic */ int $index;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(int i22) {
                super(1);
                i = i22;
            }

            public final T invoke(int i22) {
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        });
    }

    private static final <T> T elementAt(List<? extends T> list, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(i2);
    }

    public static final <T> T elementAtOrElse(Iterable<? extends T> iterable, int i2, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i2 < 0 || i2 > CollectionsKt.getLastIndex(list)) ? defaultValue.invoke(Integer.valueOf(i2)) : (T) list.get(i2);
        }
        if (i2 < 0) {
            return defaultValue.invoke(Integer.valueOf(i2));
        }
        int i3 = 0;
        for (T t2 : iterable) {
            int i4 = i3 + 1;
            if (i2 == i3) {
                return t2;
            }
            i3 = i4;
        }
        return defaultValue.invoke(Integer.valueOf(i2));
    }

    private static final <T> T elementAtOrElse(List<? extends T> list, int i2, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > CollectionsKt.getLastIndex(list)) ? defaultValue.invoke(Integer.valueOf(i2)) : list.get(i2);
    }

    public static final <T> T elementAtOrNull(Iterable<? extends T> iterable, int i2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) CollectionsKt.getOrNull((List) iterable, i2);
        }
        if (i2 < 0) {
            return null;
        }
        int i3 = 0;
        for (T t2 : iterable) {
            int i4 = i3 + 1;
            if (i2 == i3) {
                return t2;
            }
            i3 = i4;
        }
        return null;
    }

    private static final <T> T elementAtOrNull(List<? extends T> list, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return (T) CollectionsKt.getOrNull(list, i2);
    }

    public static final <T> List<T> filter(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterIndexed(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(Integer.valueOf(i2), t2).booleanValue()) {
                arrayList.add(t2);
            }
            i2 = i3;
        }
        return arrayList;
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(Iterable<? extends T> iterable, C destination, Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(Integer.valueOf(i2), t2).booleanValue()) {
                destination.add(t2);
            }
            i2 = i3;
        }
        return destination;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Iterable<?> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Iterable<?> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : iterable) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T> List<T> filterNot(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (!predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterNotNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (List) CollectionsKt.filterNotNullTo(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t2 : iterable) {
            if (t2 != null) {
                destination.add(t2);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(Iterable<? extends T> iterable, C destination, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t2 : iterable) {
            if (!predicate.invoke(t2).booleanValue()) {
                destination.add(t2);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(Iterable<? extends T> iterable, C destination, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                destination.add(t2);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    private static final <T> T find(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        return null;
    }

    private static final <T> T findLast(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t2 = null;
        for (T t3 : iterable) {
            if (predicate.invoke(t3).booleanValue()) {
                t2 = t3;
            }
        }
        return t2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    private static final <T> T findLast(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    public static final <T> T first(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) CollectionsKt.first((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public static final <T> T first(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final <T> T first(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    private static final <T, R> R firstNotNullOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    private static final <T, R> R firstNotNullOfOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    public static final <T> T firstOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    public static final <T> T firstOrNull(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        return null;
    }

    public static final <T> T firstOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T, R> List<R> flatMap(Iterable<? extends T> iterable, Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    private static final <T, R> List<R> flatMapIndexedIterable(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return arrayList;
    }

    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(Iterable<? extends T> iterable, C destination, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return destination;
    }

    private static final <T, R> List<R> flatMapIndexedSequence(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return arrayList;
    }

    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(Iterable<? extends T> iterable, C destination, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return destination;
    }

    public static final <T, R> List<R> flatMapSequence(Iterable<? extends T> iterable, Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(Iterable<? extends T> iterable, C destination, Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(Iterable<? extends T> iterable, C destination, Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R> R fold(Iterable<? extends T> iterable, R r2, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r2 = operation.invoke(r2, it.next());
        }
        return r2;
    }

    public static final <T, R> R foldIndexed(Iterable<? extends T> iterable, R r2, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            r2 = operation.invoke(Integer.valueOf(i2), r2, t2);
            i2 = i3;
        }
        return r2;
    }

    public static final <T, R> R foldRight(List<? extends T> list, R r2, Function2<? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r2 = operation.invoke(listIterator.previous(), r2);
            }
        }
        return r2;
    }

    public static final <T, R> R foldRightIndexed(List<? extends T> list, R r2, Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r2 = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r2);
            }
        }
        return r2;
    }

    public static final <T> void forEach(Iterable<? extends T> iterable, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public static final <T> void forEachIndexed(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i2), t2);
            i2 = i3;
        }
    }

    private static final <T> T getOrElse(List<? extends T> list, int i2, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > CollectionsKt.getLastIndex(list)) ? defaultValue.invoke(Integer.valueOf(i2)) : list.get(i2);
    }

    public static final <T> T getOrNull(List<? extends T> list, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i2 < 0 || i2 > CollectionsKt.getLastIndex(list)) {
            return null;
        }
        return list.get(i2);
    }

    public static final <T, K> Map<K, List<T>> groupBy(Iterable<? extends T> iterable, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t2 : iterable) {
            K kInvoke = keySelector.invoke(t2);
            Object obj = linkedHashMap.get(kInvoke);
            if (obj == null) {
                obj = (List) new ArrayList();
                linkedHashMap.put(kInvoke, obj);
            }
            ((List) obj).add(t2);
        }
        return linkedHashMap;
    }

    public static final <T, K, V> Map<K, List<V>> groupBy(Iterable<? extends T> iterable, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t2 : iterable) {
            K kInvoke = keySelector.invoke(t2);
            ArrayList arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(t2));
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(Iterable<? extends T> iterable, M destination, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t2 : iterable) {
            K kInvoke = keySelector.invoke(t2);
            Object obj = destination.get(kInvoke);
            if (obj == null) {
                obj = (List) new ArrayList();
                destination.put(kInvoke, obj);
            }
            ((List) obj).add(t2);
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(Iterable<? extends T> iterable, M destination, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t2 : iterable) {
            K kInvoke = keySelector.invoke(t2);
            Object obj = destination.get(kInvoke);
            if (obj == null) {
                obj = (List) new ArrayList();
                destination.put(kInvoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(t2));
        }
        return destination;
    }

    public static final <T, K> Grouping<T, K> groupingBy(Iterable<? extends T> iterable, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<T, K>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt.groupingBy.1
            final /* synthetic */ Function1<T, K> $keySelector;
            final /* synthetic */ Iterable<T> $this_groupingBy;

            /* JADX WARN: Multi-variable type inference failed */
            public C13421(Iterable<? extends T> iterable2, Function1<? super T, ? extends K> keySelector2) {
                iterable = iterable2;
                function1 = keySelector2;
            }

            @Override // kotlin.collections.Grouping
            public K keyOf(T t2) {
                return function1.invoke(t2);
            }

            @Override // kotlin.collections.Grouping
            public Iterator<T> sourceIterator() {
                return iterable.iterator();
            }
        };
    }

    public static final <T> int indexOf(Iterable<? extends T> iterable, T t2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t2);
        }
        int i2 = 0;
        for (T t3 : iterable) {
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t2, t3)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final <T> int indexOf(List<? extends T> list, T t2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.indexOf(t2);
    }

    public static final <T> int indexOfFirst(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i2 = 0;
        for (T t2 : iterable) {
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(t2).booleanValue()) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i2 = -1;
        int i3 = 0;
        for (T t2 : iterable) {
            if (i3 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(t2).booleanValue()) {
                i2 = i3;
            }
            i3++;
        }
        return i2;
    }

    public static final <T> int indexOfLast(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (predicate.invoke(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static final <T> Set<T> intersect(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = CollectionsKt.toMutableSet(iterable);
        CollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T, A extends Appendable> A joinTo(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (T t2 : iterable) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            StringsKt.appendElement(buffer, t2, function1);
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ Appendable joinTo$default(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        Function1 function12 = function1;
        int i4 = i2;
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence2;
        CharSequence charSequence7 = charSequence;
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        CharSequence charSequence8 = (i3 + 8) - (i3 | 8) != 0 ? "" : charSequence3;
        if ((i3 & 16) != 0) {
            i4 = -1;
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            function12 = null;
        }
        return CollectionsKt.joinTo(iterable, appendable, charSequence7, charSequence6, charSequence8, i4, charSequence5, function12);
    }

    public static final <T> String joinToString(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) CollectionsKt.joinTo(iterable, new StringBuilder(), separator, prefix, postfix, i2, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
        }
        if ((i3 + 4) - (4 | i3) != 0) {
        }
        if ((8 & i3) != 0) {
            i2 = -1;
        }
        if ((i3 + 16) - (16 | i3) != 0) {
        }
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return CollectionsKt.joinToString(iterable, charSequence, charSequence2, charSequence3, i2, charSequence4, function1);
    }

    public static final <T> T last(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) CollectionsKt.last((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> T last(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t2 = null;
        boolean z2 = false;
        for (T t3 : iterable) {
            if (predicate.invoke(t3).booleanValue()) {
                z2 = true;
                t2 = t3;
            }
        }
        if (z2) {
            return t2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final <T> T last(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(CollectionsKt.getLastIndex(list));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public static final <T> T last(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public static final <T> int lastIndexOf(Iterable<? extends T> iterable, T t2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t2);
        }
        int i2 = -1;
        int i3 = 0;
        for (T t3 : iterable) {
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t2, t3)) {
                i2 = i3;
            }
            i3++;
        }
        return i2;
    }

    public static final <T> int lastIndexOf(List<? extends T> list, T t2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.lastIndexOf(t2);
    }

    public static final <T> T lastOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> T lastOrNull(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t2 = null;
        for (T t3 : iterable) {
            if (predicate.invoke(t3).booleanValue()) {
                t2 = t3;
            }
        }
        return t2;
    }

    public static final <T> T lastOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    public static final <T> T lastOrNull(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    public static final <T, R> List<R> map(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexed(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexedNotNull(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            R rInvoke = transform.invoke(Integer.valueOf(i2), t2);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i2 = i3;
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(Iterable<? extends T> iterable, C destination, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            R rInvoke = transform.invoke(Integer.valueOf(i2), t2);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i2 = i3;
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(Iterable<? extends T> iterable, C destination, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            destination.add(transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return destination;
    }

    public static final <T, R> List<R> mapNotNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(Iterable<? extends T> iterable, C destination, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(Iterable<? extends T> iterable, C destination, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    private static final <T> double maxOf(Iterable<? extends T> iterable, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: maxOf */
    private static final <T> float m9411maxOf(Iterable<? extends T> iterable, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    /* JADX INFO: renamed from: maxOf */
    private static final <T, R extends Comparable<? super R>> R m9412maxOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX INFO: renamed from: maxOfOrNull */
    private static final <T> Double m9413maxOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX INFO: renamed from: maxOfOrNull */
    private static final <T> Float m9414maxOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    private static final <T, R> R maxOfWith(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    private static final <T, R> R maxOfWithOrNull(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <T extends Comparable<? super T>> T maxOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX INFO: renamed from: maxOrNull */
    public static final Double m9415maxOrNull(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX INFO: renamed from: maxOrNull */
    public static final Float m9416maxOrNull(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final double maxOrThrow(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: maxOrThrow */
    public static final float m9417maxOrThrow(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    /* JADX INFO: renamed from: maxOrThrow */
    public static final <T extends Comparable<? super T>> T m9418maxOrThrow(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> T maxWithOrNull(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> T maxWithOrThrow(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final <T, R extends Comparable<? super R>> T minByOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    private static final <T> double minOf(Iterable<? extends T> iterable, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: minOf */
    private static final <T> float m9419minOf(Iterable<? extends T> iterable, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    /* JADX INFO: renamed from: minOf */
    private static final <T, R extends Comparable<? super R>> R m9420minOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    private static final <T, R extends Comparable<? super R>> R minOfOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX INFO: renamed from: minOfOrNull */
    private static final <T> Double m9421minOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX INFO: renamed from: minOfOrNull */
    private static final <T> Float m9422minOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    private static final <T, R> R minOfWith(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    private static final <T, R> R minOfWithOrNull(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <T extends Comparable<? super T>> T minOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX INFO: renamed from: minOrNull */
    public static final Double m9423minOrNull(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX INFO: renamed from: minOrNull */
    public static final Float m9424minOrNull(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final double minOrThrow(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: minOrThrow */
    public static final float m9425minOrThrow(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    /* JADX INFO: renamed from: minOrThrow */
    public static final <T extends Comparable<? super T>> T m9426minOrThrow(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> T minWithOrNull(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> T minWithOrThrow(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collectionConvertToListIfNotCollection = CollectionsKt.convertToListIfNotCollection(elements);
        if (collectionConvertToListIfNotCollection.isEmpty()) {
            return CollectionsKt.toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (!collectionConvertToListIfNotCollection.contains(t2)) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, T t2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        boolean z2 = false;
        for (T t3 : iterable) {
            boolean z3 = true;
            if (!z2 && Intrinsics.areEqual(t3, t2)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = SequencesKt.toList(elements);
        if (list.isEmpty()) {
            return CollectionsKt.toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (!list.contains(t2)) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, T[] elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return CollectionsKt.toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (!ArraysKt.contains(elements, t2)) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    private static final <T> List<T> minusElement(Iterable<? extends T> iterable, T t2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.minus(iterable, t2);
    }

    public static final <T> boolean none(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static final <T> boolean none(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T, C extends Iterable<? extends T>> C onEach(C c2, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(c2, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<T> it = c2.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return c2;
    }

    public static final <T, C extends Iterable<? extends T>> C onEachIndexed(C c2, Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(c2, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i2 = 0;
        for (T t2 : c2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i2), t2);
            i2 = i3;
        }
        return c2;
    }

    public static final <T> Pair<List<T>, List<T>> partition(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
            } else {
                arrayList2.add(t2);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return CollectionsKt.plus((Collection) iterable, (Iterable) elements);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        CollectionsKt.addAll(arrayList2, iterable);
        CollectionsKt.addAll(arrayList2, elements);
        return arrayList;
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, T t2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return CollectionsKt.plus((Collection) iterable, (Object) t2);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, iterable);
        arrayList.add(t2);
        return arrayList;
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        CollectionsKt.addAll(arrayList2, iterable);
        CollectionsKt.addAll(arrayList2, elements);
        return arrayList;
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, T[] elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return CollectionsKt.plus((Collection) iterable, (Object[]) elements);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        CollectionsKt.addAll(arrayList2, iterable);
        CollectionsKt.addAll(arrayList2, elements);
        return arrayList;
    }

    public static final <T> List<T> plus(Collection<? extends T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            CollectionsKt.addAll(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static final <T> List<T> plus(Collection<? extends T> collection, T t2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t2);
        return arrayList;
    }

    public static final <T> List<T> plus(Collection<? extends T> collection, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        CollectionsKt.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> List<T> plus(Collection<? extends T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        CollectionsKt.addAll(arrayList, elements);
        return arrayList;
    }

    private static final <T> List<T> plusElement(Iterable<? extends T> iterable, T t2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.plus(iterable, t2);
    }

    private static final <T> List<T> plusElement(Collection<? extends T> collection, T t2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return CollectionsKt.plus((Collection) collection, (Object) t2);
    }

    private static final <T> T random(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return (T) CollectionsKt.random(collection, Random.Default);
    }

    public static final <T> T random(Collection<? extends T> collection, Random random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) CollectionsKt.elementAt(collection, random.nextInt(collection.size()));
    }

    private static final <T> T randomOrNull(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return (T) CollectionsKt.randomOrNull(collection, Random.Default);
    }

    public static final <T> T randomOrNull(Collection<? extends T> collection, Random random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) CollectionsKt.elementAt(collection, random.nextInt(collection.size()));
    }

    public static final <S, T extends S> S reduce(Iterable<? extends T> iterable, Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexed(Iterable<? extends T> iterable, Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        int i2 = 1;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            next = operation.invoke(Integer.valueOf(i2), next, it.next());
            i2 = i3;
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexedOrNull(Iterable<? extends T> iterable, Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i2 = 1;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            next = operation.invoke(Integer.valueOf(i2), next, it.next());
            i2 = i3;
        }
        return next;
    }

    public static final <S, T extends S> S reduceOrNull(Iterable<? extends T> iterable, Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceRight(List<? extends T> list, Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    public static final <S, T extends S> S reduceRightIndexed(List<? extends T> list, Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    public static final <S, T extends S> S reduceRightIndexedOrNull(List<? extends T> list, Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    public static final <S, T extends S> S reduceRightOrNull(List<? extends T> list, Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Iterable<T> requireNoNulls(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> requireNoNulls(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    public static final <T> List<T> reversed(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return CollectionsKt.toList(iterable);
        }
        List<T> mutableList = CollectionsKt.toMutableList(iterable);
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    public static final <T, R> List<R> runningFold(Iterable<? extends T> iterable, R r2, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r2);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r2 = operation.invoke(r2, it.next());
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final <T, R> List<R> runningFoldIndexed(Iterable<? extends T> iterable, R r2, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r2);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, it.next());
            arrayList.add(r2);
            i2++;
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduce(Iterable<? extends T> iterable, Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduceIndexed(Iterable<? extends T> iterable, Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        int i2 = 1;
        while (it.hasNext()) {
            next = operation.invoke(Integer.valueOf(i2), next, it.next());
            arrayList.add(next);
            i2++;
        }
        return arrayList;
    }

    public static final <T, R> List<R> scan(Iterable<? extends T> iterable, R r2, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r2);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r2 = operation.invoke(r2, it.next());
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final <T, R> List<R> scanIndexed(Iterable<? extends T> iterable, R r2, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.listOf(r2);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r2);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, it.next());
            arrayList.add(r2);
            i2++;
        }
        return arrayList;
    }

    public static final <T> void shuffle(List<T> list, Random random) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = CollectionsKt.getLastIndex(list); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            list.set(iNextInt, list.set(lastIndex, list.get(iNextInt)));
        }
    }

    public static final <T> T single(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) CollectionsKt.single((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T single(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t2 = null;
        boolean z2 = false;
        for (T t3 : iterable) {
            if (predicate.invoke(t3).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z2 = true;
                t2 = t3;
            }
        }
        if (z2) {
            return t2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final <T> T single(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final <T> T singleOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static final <T> T singleOrNull(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean z2 = false;
        T t2 = null;
        for (T t3 : iterable) {
            if (predicate.invoke(t3).booleanValue()) {
                if (z2) {
                    return null;
                }
                z2 = true;
                t2 = t3;
            }
        }
        if (z2) {
            return t2;
        }
        return null;
    }

    public static final <T> T singleOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final <T> List<T> slice(List<? extends T> list, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    public static final <T> List<T> slice(List<? extends T> list, IntRange indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : CollectionsKt.toList(list.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(List<T> list, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new ComparisonsKt__ComparisonsKt.AnonymousClass2(selector));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(List<T> list, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new ComparisonsKt__ComparisonsKt.AnonymousClass1(selector));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        CollectionsKt.sortWith(list, ComparisonsKt.reverseOrder());
    }

    public static final <T extends Comparable<? super T>> List<T> sorted(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = CollectionsKt.toMutableList(iterable);
            CollectionsKt.sort(mutableList);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return CollectionsKt.toList(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        ArraysKt.sort(array);
        return ArraysKt.asList(array);
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return CollectionsKt.sortedWith(iterable, new ComparisonsKt__ComparisonsKt.AnonymousClass2(selector));
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return CollectionsKt.sortedWith(iterable, new ComparisonsKt__ComparisonsKt.AnonymousClass1(selector));
    }

    public static final <T extends Comparable<? super T>> List<T> sortedDescending(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.sortedWith(iterable, ComparisonsKt.reverseOrder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> sortedWith(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = CollectionsKt.toMutableList(iterable);
            CollectionsKt.sortWith(mutableList, comparator);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return CollectionsKt.toList(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        ArraysKt.sortWith(array, comparator);
        return ArraysKt.asList(array);
    }

    public static final <T> Set<T> subtract(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = CollectionsKt.toMutableSet(iterable);
        CollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "\u0018Y\u0001t\u0005\n\"F^\u00071\tc)1O`\u001a", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    public static final <T> int sumBy(Iterable<? extends T> iterable, Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += selector.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "\u0018Y\u0001t\u0005\n\"F^\u00071\tc)1O`\u001a", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    public static final <T> double sumByDouble(Iterable<? extends T> iterable, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += selector.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    public static final int sumOfByte(Iterable<Byte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    public static final double sumOfDouble(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    private static final <T> double sumOfDouble(Iterable<? extends T> iterable, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += selector.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    public static final float sumOfFloat(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    public static final int sumOfInt(Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    private static final <T> int sumOfInt(Iterable<? extends T> iterable, Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += selector.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    public static final long sumOfLong(Iterable<Long> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    private static final <T> long sumOfLong(Iterable<? extends T> iterable, Function1<? super T, Long> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += selector.invoke(it.next()).longValue();
        }
        return jLongValue;
    }

    public static final int sumOfShort(Iterable<Short> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    private static final <T> int sumOfUInt(Iterable<? extends T> iterable, Function1<? super T, UInt> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iM9075constructorimpl = UInt.m9075constructorimpl(0);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            iM9075constructorimpl = UInt.m9075constructorimpl(iM9075constructorimpl + selector.invoke(it.next()).m9127unboximpl());
        }
        return iM9075constructorimpl;
    }

    private static final <T> long sumOfULong(Iterable<? extends T> iterable, Function1<? super T, ULong> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jM9154constructorimpl = ULong.m9154constructorimpl(0L);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            jM9154constructorimpl = ULong.m9154constructorimpl(jM9154constructorimpl + selector.invoke(it.next()).m9206unboximpl());
        }
        return jM9154constructorimpl;
    }

    public static final <T> List<T> take(Iterable<? extends T> iterable, int i2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt.emptyList();
        }
        if (iterable instanceof Collection) {
            if (i2 >= ((Collection) iterable).size()) {
                return CollectionsKt.toList(iterable);
            }
            if (i2 == 1) {
                return CollectionsKt.listOf(CollectionsKt.first(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator<? extends T> it = iterable.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static final <T> List<T> takeLast(List<? extends T> list, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt.emptyList();
        }
        int size = list.size();
        if (i2 >= size) {
            return CollectionsKt.toList(list);
        }
        if (i2 == 1) {
            return CollectionsKt.listOf(CollectionsKt.last((List) list));
        }
        ArrayList arrayList = new ArrayList(i2);
        if (list instanceof RandomAccess) {
            for (int i3 = size - i2; i3 < size; i3++) {
                arrayList.add(list.get(i3));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i2);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final <T> List<T> takeLastWhile(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return CollectionsKt.toList(list);
    }

    public static final <T> List<T> takeWhile(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (!predicate.invoke(t2).booleanValue()) {
                break;
            }
            arrayList.add(t2);
        }
        return arrayList;
    }

    public static final boolean[] toBooleanArray(Collection<Boolean> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = it.next().booleanValue();
            i2++;
        }
        return zArr;
    }

    public static final byte[] toByteArray(Collection<Byte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            bArr[i2] = it.next().byteValue();
            i2++;
        }
        return bArr;
    }

    public static final char[] toCharArray(Collection<Character> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            cArr[i2] = it.next().charValue();
            i2++;
        }
        return cArr;
    }

    public static final <T, C extends Collection<? super T>> C toCollection(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static final double[] toDoubleArray(Collection<Double> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            dArr[i2] = it.next().doubleValue();
            i2++;
        }
        return dArr;
    }

    public static final float[] toFloatArray(Collection<Float> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fArr[i2] = it.next().floatValue();
            i2++;
        }
        return fArr;
    }

    public static final <T> HashSet<T> toHashSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (HashSet) CollectionsKt.toCollection(iterable, new HashSet(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 12))));
    }

    public static final int[] toIntArray(Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        return iArr;
    }

    public static final <T> List<T> toList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return CollectionsKt.optimizeReadOnlyList(CollectionsKt.toMutableList(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return CollectionsKt.emptyList();
        }
        if (size != 1) {
            return CollectionsKt.toMutableList(collection);
        }
        return CollectionsKt.listOf(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final long[] toLongArray(Collection<Long> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        return jArr;
    }

    public static final <T> List<T> toMutableList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? CollectionsKt.toMutableList((Collection) iterable) : (List) CollectionsKt.toCollection(iterable, new ArrayList());
    }

    public static final <T> List<T> toMutableList(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> toMutableSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) CollectionsKt.toCollection(iterable, new LinkedHashSet());
    }

    public static final <T> Set<T> toSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return SetsKt.optimizeReadOnlySet((Set) CollectionsKt.toCollection(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return SetsKt.emptySet();
        }
        if (size != 1) {
            return (Set) CollectionsKt.toCollection(iterable, new LinkedHashSet(MapsKt.mapCapacity(collection.size())));
        }
        return SetsKt.setOf(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final short[] toShortArray(Collection<Short> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            sArr[i2] = it.next().shortValue();
            i2++;
        }
        return sArr;
    }

    public static final <T> Set<T> union(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = CollectionsKt.toMutableSet(iterable);
        CollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> List<List<T>> windowed(Iterable<? extends T> iterable, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        SlidingWindowKt.checkWindowSizeStep(i2, i3);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itWindowedIterator = SlidingWindowKt.windowedIterator(iterable.iterator(), i2, i3, z2, false);
            while (itWindowedIterator.hasNext()) {
                arrayList.add((List) itWindowedIterator.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i3) + (size % i3 == 0 ? 0 : 1));
        int i4 = 0;
        while (i4 >= 0 && i4 < size) {
            int iCoerceAtMost = RangesKt.coerceAtMost(i2, size - i4);
            if (iCoerceAtMost < i2 && !z2) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iCoerceAtMost);
            for (int i5 = 0; i5 < iCoerceAtMost; i5++) {
                arrayList3.add(list.get(i5 + i4));
            }
            arrayList2.add(arrayList3);
            i4 += i3;
        }
        return arrayList2;
    }

    public static final <T, R> List<R> windowed(Iterable<? extends T> iterable, int i2, int i3, boolean z2, Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i2, i3);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itWindowedIterator = SlidingWindowKt.windowedIterator(iterable.iterator(), i2, i3, z2, true);
            while (itWindowedIterator.hasNext()) {
                arrayList.add(transform.invoke((List) itWindowedIterator.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i4 = 0;
        ArrayList arrayList2 = new ArrayList((size / i3) + (size % i3 == 0 ? 0 : 1));
        MovingSubList movingSubList = new MovingSubList(list);
        while (i4 >= 0 && i4 < size) {
            int iCoerceAtMost = RangesKt.coerceAtMost(i2, size - i4);
            if (!z2 && iCoerceAtMost < i2) {
                break;
            }
            movingSubList.move(i4, iCoerceAtMost + i4);
            arrayList2.add(transform.invoke(movingSubList));
            i4 += i3;
        }
        return arrayList2;
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = 1;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            z2 = false;
        }
        return CollectionsKt.windowed(iterable, i2, i3, z2);
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i2, int i3, boolean z2, Function1 function1, int i4, Object obj) {
        if ((2 & i4) != 0) {
            i3 = 1;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        return CollectionsKt.windowed(iterable, i2, i3, z2, function1);
    }

    public static final <T> Iterable<IndexedValue<T>> withIndex(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends T>>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt.withIndex.1
            final /* synthetic */ Iterable<T> $this_withIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C13431(Iterable<? extends T> iterable2) {
                super(0);
                iterable = iterable2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<T> invoke() {
                return iterable.iterator();
            }
        });
    }

    public static final <T, R> List<Pair<T, R>> zip(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(iterable, 10), CollectionsKt.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(TuplesKt.to(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T, R, V> List<V> zip(Iterable<? extends T> iterable, Iterable<? extends R> other, Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(iterable, 10), CollectionsKt.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(transform.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T, R> List<Pair<T, R>> zip(Iterable<? extends T> iterable, R[] other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (T t2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(t2, other[i2]));
            i2++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R, V> List<V> zip(Iterable<? extends T> iterable, R[] other, Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (T t2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(transform.invoke(t2, other[i2]));
            i2++;
        }
        return arrayList;
    }

    public static final <T> List<Pair<T, T>> zipWithNext(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(TuplesKt.to(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T, R> List<R> zipWithNext(Iterable<? extends T> iterable, Function2<? super T, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Architecture next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(transform.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }
}
