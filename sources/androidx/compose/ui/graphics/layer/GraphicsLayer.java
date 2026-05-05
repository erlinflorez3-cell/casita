package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яũ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aw\rfr9>ImH4U[*%k\u00044*_,qY;]\u001a\u0014\"\u0011OTnon`Z\u0013C\u001d\u000f\u001exp2QU\u000f]\u001a\u000fHBw?AMw=O`|6\u001b :\">|\r\u00010*P\u0010||KK\"\u00128@v<Z\rc\u0005\"\u0012\f?(\u0001,coN<Ht]P/+\u0003oEV'u0\u0005M\u0013G\\'\u001b|iӜ3@M5\u001d%i\u0003\u000fRaA\u000b?\b=\rh-63I\nW>X\u0006\u001c\u001d+e\rer,^\rQv\f/+UdSP$(\u007fz\u0002\u001dD\u0004$\u0006/H4@\"f\u001e\u000e;tx^HP\u0018^J\u007f\u0001b>\u0017;\u007f;+?\u001c|ϟ\u007fޝ\u0018~7*\u0004E\u001eŻ\u007f/8a٪\u001ed#\u001blw\u007f2aFKJf\fo<\u001c\u0007Ͳf\u00028\bxW\u000e\u0084z).EOg`G\u0604 \u0004\u0002vֳ.vMgvאhjHnL5\u0016\u007f1\u0017ȽY\\d3\u0016\u0017T!9\u001f܀\u001bl\u0007,2Y\u05feϢ{='م\u000f\u0017qvȘie]8O_lEպm\u0004\u000f\u0006\u07bb]c<_Ӂ\u000fyT\r\u0013mֺ)ڳֽjCYۡY%?0ĉG\u0003\u0010&&tT\u001aƞ1WrJي+wǉÅ\u0019I\tٱA\n\n\u0017ݶY\u0001\u0010-~y#ғm%zվ\u007f\u0019c~שf\u0011IZ\u0010'\"uH_ښ\u0018>UP8z|k\u000e\r\u0378~_gzq\u0013l^|cރ\u001f.\u001ag{u=[R\rȗ1\u001a-sv#i_\u0004*')4*\u0013I+Fg6.!0n^bO\u0003\nR\rlэ\" u\u0010{qF)psV\u001b[ls!+ʾ@N>(ŷ\u001eǇݵ\u0005s(ĺ4;ϝ&e\u001d\u0006Ӂ.-a\f\u00146.Bi\u001d֏s}\u0004Z\u000e\\o+^kш:PI\b)\u0005Эٝp\u0004H\u05f8i@\u000fPު3%3vk+p\u001fk[߷.\u0016gMՓ\f\u0011Yaƥ!̰|dGmͥr[\u0012$`S%?\u001eci}myD\u001bM\u001f\u000bQְ0\u001d݅\u001b\u0004յ\\͓f\n>ӗr`DOގa\u001d<7Nd1J\u07b4\n[T\u0018OX\u001e\u000eʶ^'\u0017`l$?d\u000blx\u000bRx\tn9x!XsE\u000f˵\u001d֭\u00985\tsܚS=ҟ1Ix+ͭ\u001a\u0003O-\u0011U1JTG\u0018@X/[ucII\u0010*\u001cGWUęnȯէ\u001c\u0001#Ü\u0017)ʰPY\u0010\u0005Қ]#U\u0013x\u0015|\u0018f`K:)-K-\u0014B\n\u001d~1O!W\u00134RN\u0006̰B2\u0001EJρ\u0006љƔgJ!Ӏ\u0005C϶<\u0012y\"֑zoTiְ\u0007fðeؗx\"jߜ\r/\u001bkΠ9.qD\r2\u000f!ћ\u001f\u001c/xǌqP.PH]؈2\u001a\u0015tX\u001a\u000bQE5\u0085k\u001eBy2?\n4\u000fqum\u000b1laZ\bsEPK\u000f]\u0012lW/śFñW*p\u0013\u0006\u001c#/?8\u000el7\u001b \fv}\u0004O\n\u0019[3y/y1^^TB]>Lé6ƍ'ֽπUL̡h\u0013tnHe\u001cm\u000b*j\u0005\u001a:d\u000b\rZv\u0013)3t\u0006tҎ;ё\u001d\u001fcƬ\u0018\t\u0015\u0019]IT5aVM O29\u0004^;OG\u0011Ŏ\u0001̍)Х\u05f5q~\u05ff07^VC05pDoj\u001b4d\u0016ZP\"D\u0011<\u0017_^F%V\\H\"q\u0016q\u0006o֍\rͤ<\u0010\b\t\u001fPxZs'0\u001d\u000b\f]K\bN\u0004:\"UI\u070f1ތs\u001b_Ơ\fOC\u0006d':!\u0016N\rR{V=\u0001b\u000es\nt aˑ\u0004\u001c'\u07fb4\b{D\u000egIJ0\u0003jdvu])4P\u0007\fRJ_}\tu\u001a,\u0018A\u0004fkabk)<ԯH>0XC؎Gޣly\u0013ލ]k\"d'\b?2E)@U\u007fECK\tL]\t\u0014\u0001Q8Zͨ>ݦ:\u0004_B_X\u0014\\2Vi\u001bx\u001f\"\b\u001ek*\r;6(5`e\u0018`KJ]\u00105\u000b\rˮ\u0005ĉ@Ǔ\u0089?\u000eľb8Z\u000e\u0011:$Eh\u0019\b3Xye\u001fA}\fAuI-½-ͻ\u0015[-̵u\u0005x\u007fWf\u0002ZM9a4}Lh5\u0014\u00073}٠Od1@VӰ7ʜKVFϖzj\u0014\u000e]dv\u0011\u001bюFڍq68ߣh\u0001`|k;l-K\u0011-g\u00151\u0011s2۬\u001dӘ;Wvְ&?;7\u001a\u0003>`I\u0017\u0019[k9`B2M\bČ\bţ`O]ޮ\u0006K\u0016Aonq>\u0014~GAy-\r*ȍ\u001d[W\u0001\u0012a53V!2d\u007f\u0015\u007f\rPbYԘ8̨-HS¾arP-'z#O\u0005ۂD˴\n=\u000e\u00863+C\u007fw@Zj'MºSn\u0014,k5t;*YSr\u000e\u0019lPH´oٷc\u0014vҭ-fL_o(V\u00120csømҨL)8ļ&r{5\fT\u000fQ\u0010xɬ4h\u0012tl0Lr\u000fHV91f}KqЭPС\r`xֳ\u0012\u001ep;D)LG\u0019hW;Wڼ\u001b\u0014?ݮGMu\u0005R\"\u0010r\u0004a3Lb\u0006<; <kؿiמ5ŧӞ+{В\tLnr\u0012A\u001dO6Vy>RH`\u0014*>+M{? ,$\u000b+Z\\taWiw5q\u0013TYbX\u0006.ټS̹\u0017\r1>\u000e\n[1\u001bp^63\tL(-mZ{crqw\n8oq}:\u0014bgB@ʷ,ɋo\u001c\u001ceP\u007f]r\u0003\u0013c\f[\u0003W{J8Y\u00028(Y(\u0016\u001a?\u0002v:\u0001v`gWغBφNp\u0007z+hs\u0015Ov{n@x\u000f\u0016t?\u007f4oC\u0006a\rJE/ \u000e\u0002\u000e,C\u0002¾\u001aʋ\u001aDgNsXiFt\u00188j}\u000f\u0002\u001e\u0002EsD-v6,\u000bĉF߾K\u0003\u001cӳ\u001c:(@~n\u001b|'ݐ\u001cĜ\u001a\r\u001c؊\u000f\b7\nX%\u000eH>ՓG̹oƸжPDڻ\u000fF\u0019(n\u0007\u000f&\u001d1pf<kXܘWأ\u0019ұ͐DwݍO\u0017c\u0004u8\"Du2\u0004(]\u0010(\u001aD\"\u00185g\u0013*\u0015\u001dy>ϯ\u0015Ր'\u0018?pUr\u007f9RIcF.:,*\u001c7~L~\u0013q\u000bz3\u000fv!\u001duY@n\u001cگ)ܞi#\u007f\u0007<ZIf\tUji,y,}5 \u0016\u0006O\u0019q#$\u0013<\b.z\u0012x\u000e:WΆTײ\u0010$[0\u000e\u0005\u0013nl\u0007;{O<\u0010}~\rCw\u000eQr\t\u001b*9(9\u000bf\"Cı{ʲ'ɘɦ\u0012u˗q\u0017\u0018\u001cWy!/Wk\t)R\u0012&K\u001ePZ!pU\u0010\u00027H^(JսY֒q}6ŗ@\u0013\u0006W(O H\u000e\u0003\u0006;](>2\t\u007fR'3Î3ʧ'ېު\r\u001dҕ..J\u000et*)k\t\u007fuq`sb\fBkMXn1['\u000f+\u0019\u00017\u001f\u001cojşe˧EłߨeuؚG!ftL>\u0015\n7\u001b\u0012\u0015kh8Ճ8W\u000bq\u0011BҰ!BbB*\u0016\u0010\u001bQh-H<\u0016\u0001`}\u0013Ҳ\u007fԵ\u0003#)Cpߙ\u0003=O1u\u000f٠0@T0\u0002-ݡ]Ap\u001a\u007f_T`Fen] Mjv&\u000e̤Wӱ&(]jCҍ$#\u0016?m\u0012Ŗ\u0002+@Bilɿ>\u001a\u0006R3\u0019ޛBŬGjFؚܐ4\u001d|%hݔP\\AjO05ؼiň&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "", "7l_9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u0014G4Y}|", ":`h2e\u0014:\\\u0015\u0001zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7|*aCHS0'\u0011jaF\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~`y47z_\u0010Z?Fn8\u001c#O]M\u0007p\u0010V\u0002.\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001!\u0015(T\u0005?f\u000fU\u001d\nIj}\f=\f[y\"]=2dHYlO\u000b2", "D`[BX", "", "/k_5T", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "/lQ6X5MA\u001czyh>Z\u00136o\r", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHa\u0016\u0019isAf", "u(9", "Adc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHi\u0011\u001a;\u0015CR", "uI\u0018#", "/mS?b0==)\u000e\u0002b5|", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0012\fO\b\u001b GE", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "0kT;W\u0014HR\u0019", "5dc\u000f_,GR\u0001\ty^sG\u0012\u00196p:k", "u(8", "Adc\u000f_,GR\u0001\ty^s\u000b\\+n\u0001.N", "uH\u0018#", "1`\\2e(\u001dW'\u000evg*|", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "Adc\u0010T4>`\u0015]~l;x\u0012-e", "1gX9W\u000b>^\u0019\by^5z\r/sn5w>\u0007\u0017$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7s1QJ:R02\u0015u@9\u0012c5Mv0EPN:K_n;\u001a\u0012gc", "", "1kX=", "5dc\u0010_0I\u0012\u0015\b\u0004h;x\u00183o\t6", "u(E", "5dc\u0010_0I", "u(I", "Adc\u0010_0I", "uY\u0018#", "1kX=79:eu\u0006\u0005\\2", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "1n[<e\rBZ(~\b", "5dc\u0010b3H`y\u0003\u0002m,\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[*>w#\u000fQJJkAs", "Adc\u0010b3H`y\u0003\u0002m,\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7\b'Azv2TR;x\na\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7s8UNEy8-\u0019qc'\u0016p(]v)[\"", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\u001dG<sPF7", "Adc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\tR\u0002a:\u007f'", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "2qPD53HQ\u001f", "5dc\u0016`7E\u0012)\u0003t`9x\u00142i}6uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#\u0005\u001cKm#w/P7v7\"\u0013vH5\u001bc92~2N\"", "7mc2e5:Z\u0003\u000f\ne0\u0006\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016\u0004", "\nrTA \u0006\u0017", "7rA2_,:a\u0019}", ":`h2e\u0010=", "", "5dc\u0019T@>`|}", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "=tc9\\5>", "5dc\u001ch;EW\"~", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#g0Ft\u001a7M\u0019", "=tc9\\5>2\u001d\f\nr", "=tc9\\5>>\u0015\u000e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "=v]2e\u001dBS+by", "5dc\u001cj5>`\n\u0003zp\u0010{", ">`a2a;%O-~\bN:x\u000b/s", "", ">`c556N\\\u0018\r", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">he<g\u0016?T'~\n", "5dc\u001d\\=Hb\u0003\u007f{l,\fP\u00101]wX2K", "Adc\u001d\\=Hb\u0003\u007f{l,\fP5-N/g\u000bh", "\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "@d]1X9\u001eT\u001a~xm", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "Adc\u001fX5=S&^{_,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~F})6m#\u000eND;iCsXY", "@nc.g0H\\\f", "5dc\u001fb;:b\u001d\t\u0004Q", "Adc\u001fb;:b\u001d\t\u0004Q", "@nc.g0H\\\r", "5dc\u001fb;:b\u001d\t\u0004R", "Adc\u001fb;:b\u001d\t\u0004R", "@nc.g0H\\\u000e", "5dc\u001fb;:b\u001d\t\u0004S", "Adc\u001fb;:b\u001d\t\u0004S", "@nd;W\u0019>Q(\\\u0002b7g\u0005>h", "@nd;W\u0019>Q(\\\u0005k5|\u0016\u001ca~,\fN", "@nd;W\u0019>Q(h\u000bm3\u0001\u0012/S\u0004={", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "@nd;W\u0019>Q(h\u000bm3\u0001\u0012/T\n3b@\u0002&", "AbP9X\u001f", "5dc V(ES\f", "Adc V(ES\f", "AbP9X ", "5dc V(ES\r", "Adc V(ES\r", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "5dc [(=]+^\u0002^=x\u00183o\t", "Adc [(=]+^\u0002^=x\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "Ahi2", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "Adc \\A>\u001b#\u0014\u0003s!gl", "AnUAj(KS\u007fz\u000f^9g\u00053n\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "5dc c6MA\u001czyh>Z\u00136o\roF?R\u0011|L_", "Adc c6MA\u001czyh>Z\u00136o\roN:Sb\u001eNK", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "Bn_\u0019X-M", "5dc!b7%S\u001a\u000eBg\u0016z\u0007va}", "Adc!b7%S\u001a\u000eB&.\u0011\u001d#B\u000e", "BqP;f3:b\u001d\t\u0004Q", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "BqP;f3:b\u001d\t\u0004R", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "CrT\u001dT;A4#\fXe0\b", "/cS h)%O-~\b", "5qP=[0<a\u007fz\u000f^9", "1n]3\\.N`\u0019h\u000bm3\u0001\u0012/A\t'YG\u0005\"", "2hb0T9=1#\b\n^5\fl0R\u007f/{<\u000f\u0017\u0016#x\r\u001fr65B\b\u000b3z\u00167\\*7\u007f4+\u0005v];\u0007q", "2hb0T9=2\u001d\r\u0006e(\u0011o3s\u000f", "2hb0T9=2\u001d\r\u0006e(\u0011o3s\u000ff\fDz\u0019$Cz\u0011@t3/f}'7i$.", "2qPD", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", ">`a2a;%O-~\b", "2qPD\u0017<BM\u001b\fvi/\u0001\u0007=_\r(\u0003@|%\u0017", "2qPD96K>\u0019\f\tb:\f\t8c\u007f", "2qPD96K>\u0019\f\tb:\f\t8c\u007ff\fDz\u0019$Cz\u0011@t3/f}'7i$.", "3ld9T;>B&\u0003\u0003F,\u0005\u0013<y", "3ld9T;>B&\u0003\u0003F,\u0005\u0013<y>8\u007f:\u0003$\u0013Rr\u0012:\u0005\u001fBY\u0005 3{\u0016", "=ac.\\5\u001a\\\u0018\f\u0005b+f\u0019>l\u00041{", "=ac.\\5)O(\u0002Wh<\u0006\b=", "=m01W,=B#ivk,\u0006\u0018\u0016a\u0014(\t", "=mA2`6OS\u0018_\bh4g\u0005<e\t7b<\u0015\u0017$", "@dR<e+", "0k^0^", "@dR<e+\u0006[\u007fF}H)p", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rT\u00127LPEo31^fkA\u0012m:N@7K\u0016^5`a<$\u0010&d\u001e]\n\u0011\u0012Y?3rN@tl\u0013O\fJo\u0005\u0015_\u0013Fr:Cf\u0019E\t\u0019\u007fJ72'ihwVEOku:OP", "@dR<e+\"\\(~\bg(\u0004", "@dR?X(MSw\u0003\ti3x\u001d\u0016i\u000e7_Ai\u0017\u0017Fo\r", "@d[2T:>", "@d[2T:>\u0012)\u0003t`9x\u00142i}6uM\u0001\u001e\u0017C}\u000e", "@db2g\u0016Nb \u0003\u0004^\u0017x\u0016+m\u000e", "@db<_=>=)\u000e\u0002b5|s9s\u00047\u007fJ\n", "\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "Adc\u001dT;A=)\u000e\u0002b5|", ">`c5", "Adc\u001db:Bb\u001d\t\u0004", "Adc\u001db:Bb\u001d\t\u0004&\u001dy\t\rj\b\u001c", "uI9uI", "Adc\u001fX*M=)\u000e\u0002b5|", "Adc\u001fX*M=)\u000e\u0002b5|P>zQy\u0001,\u0013", "Adc\u001fb<GR\u0006~xm\u0016\r\u00186i\t(", "1na;X9+O\u0018\u0003\u000bl", "Adc\u001fb<GR\u0006~xm\u0016\r\u00186i\t(C/i\t\u0011*A`", "uI9\u0013\u001c\u001d", "Bn8:T.>0\u001d\u000e\u0003Z7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "BqP;f-H`!\\vg=x\u0017", "/mS?b0=1\u0015\b\fZ:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "CoS.g,)O(\u0002dn;\u0004\r8e", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class GraphicsLayer {
    public static final Companion Companion = new Companion(null);
    private static final LayerSnapshotImpl SnapshotImpl;
    private Outline androidOutline;
    private boolean clip;
    private final GraphicsLayerImpl impl;
    private androidx.compose.ui.graphics.Outline internalOutline;
    private boolean isReleased;
    private final LayerManager layerManager;
    private Path outlinePath;
    private int parentLayerUsages;
    private RectF pathBounds;
    private long pivotOffset;
    private Path roundRectClipPath;
    private float roundRectCornerRadius;
    private long size;
    private Paint softwareLayerPaint;
    private long topLeft;
    private boolean usePathForClip;
    private Density density = DrawContextKt.getDefaultDensity();
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private Function1<? super DrawScope, Unit> drawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }
    };
    private final Function1<DrawScope, Unit> clipDrawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            Path path = this.this$0.outlinePath;
            if (!this.this$0.usePathForClip || !this.this$0.getClip() || path == null) {
                this.this$0.drawBlock.invoke(drawScope);
                return;
            }
            Function1 function1 = this.this$0.drawBlock;
            int iM4167getIntersectrtfAjoo = ClipOp.Companion.m4167getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo4657clipPathmtrdDE(path, iM4167getIntersectrtfAjoo);
                function1.invoke(drawScope);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            }
        }
    };
    private boolean outlineDirty = true;
    private long roundRectOutlineTopLeft = Offset.Companion.m3953getZeroF1C5BW0();
    private long roundRectOutlineSize = Size.Companion.m4014getUnspecifiedNHjbRc();
    private final ChildLayerDependenciesTracker childDependenciesTracker = new ChildLayerDependenciesTracker();

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 */
    /* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D~\u000bz\u000b\u0004\u0006\u0001\u0012M\r\u0003\u001c\t\u0017Sm\u001a\n\u001a\u0013\u0015\u0010!z\u0011*\u0017%", f = "\u000e:/<81+\r7%3**#2\n\u001e5 ,f\u0019%\u001a'#\u001c\u0016^\u001b#", i = {}, l = {864}, m = "C?\u001a?4;:\u0018@LF;K", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return GraphicsLayer.this.toImageBitmap(this);
        }
    }

    public static /* synthetic */ void getClip$annotations() {
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl, LayerManager layerManager) {
        this.impl = graphicsLayerImpl;
        this.layerManager = layerManager;
        graphicsLayerImpl.setClip(false);
        this.topLeft = IntOffset.Companion.m6776getZeronOccac();
        this.size = IntSize.Companion.m6813getZeroYbymL2g();
        this.pivotOffset = Offset.Companion.m3952getUnspecifiedF1C5BW0();
    }

    public final GraphicsLayerImpl getImpl$ui_graphics_release() {
        return this.impl;
    }

    public final boolean isReleased() {
        return this.isReleased;
    }

    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w */
    public final int m4823getCompositingStrategyke2Ky5w() {
        return this.impl.mo4839getCompositingStrategyke2Ky5w();
    }

    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng */
    public final void m4831setCompositingStrategyWpw9cng(int i2) {
        if (CompositingStrategy.m4810equalsimpl0(this.impl.mo4839getCompositingStrategyke2Ky5w(), i2)) {
            return;
        }
        this.impl.mo4844setCompositingStrategyWpw9cng(i2);
    }

    /* JADX INFO: renamed from: getTopLeft-nOcc-ac */
    public final long m4827getTopLeftnOccac() {
        return this.topLeft;
    }

    /* JADX INFO: renamed from: setTopLeft--gyyYBs */
    public final void m4836setTopLeftgyyYBs(long j2) {
        if (IntOffset.m6765equalsimpl0(this.topLeft, j2)) {
            return;
        }
        this.topLeft = j2;
        m4817setPositionVbeCjmY(j2, this.size);
    }

    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long m4825getSizeYbymL2g() {
        return this.size;
    }

    /* JADX INFO: renamed from: setSize-ozmzZPI */
    private final void m4820setSizeozmzZPI(long j2) {
        if (IntSize.m6806equalsimpl0(this.size, j2)) {
            return;
        }
        this.size = j2;
        m4817setPositionVbeCjmY(this.topLeft, j2);
        if (this.roundRectOutlineSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    public final void setAlpha(float f2) {
        if (this.impl.getAlpha() == f2) {
            return;
        }
        this.impl.setAlpha(f2);
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public final int m4822getBlendMode0nO6VwU() {
        return this.impl.mo4838getBlendMode0nO6VwU();
    }

    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public final void m4830setBlendModes9anfk8(int i2) {
        if (BlendMode.m4089equalsimpl0(this.impl.mo4838getBlendMode0nO6VwU(), i2)) {
            return;
        }
        this.impl.mo4843setBlendModes9anfk8(i2);
    }

    public final ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (Intrinsics.areEqual(this.impl.getColorFilter(), colorFilter)) {
            return;
        }
        this.impl.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0 */
    public final long m4824getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M */
    public final void m4832setPivotOffsetk4lQ0M(long j2) {
        if (Offset.m3934equalsimpl0(this.pivotOffset, j2)) {
            return;
        }
        this.pivotOffset = j2;
        this.impl.mo4846setPivotOffsetk4lQ0M(j2);
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final void setScaleX(float f2) {
        if (this.impl.getScaleX() == f2) {
            return;
        }
        this.impl.setScaleX(f2);
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final void setScaleY(float f2) {
        if (this.impl.getScaleY() == f2) {
            return;
        }
        this.impl.setScaleY(f2);
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final void setTranslationX(float f2) {
        if (this.impl.getTranslationX() == f2) {
            return;
        }
        this.impl.setTranslationX(f2);
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    public final void setTranslationY(float f2) {
        if (this.impl.getTranslationY() == f2) {
            return;
        }
        this.impl.setTranslationY(f2);
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    public final void setShadowElevation(float f2) {
        if (this.impl.getShadowElevation() != f2) {
            this.impl.setShadowElevation(f2);
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final void setRotationX(float f2) {
        if (this.impl.getRotationX() == f2) {
            return;
        }
        this.impl.setRotationX(f2);
    }

    /* JADX INFO: renamed from: setRoundRectOutline-TNW_H78$default */
    public static /* synthetic */ void m4819setRoundRectOutlineTNW_H78$default(GraphicsLayer graphicsLayer, long j2, long j3, float f2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j2 = Offset.Companion.m3953getZeroF1C5BW0();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = Size.Companion.m4014getUnspecifiedNHjbRc();
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        graphicsLayer.m4834setRoundRectOutlineTNW_H78(j2, j3, f2);
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    public final void setRotationY(float f2) {
        if (this.impl.getRotationY() == f2) {
            return;
        }
        this.impl.setRotationY(f2);
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final void setRotationZ(float f2) {
        if (this.impl.getRotationZ() == f2) {
            return;
        }
        this.impl.setRotationZ(f2);
    }

    /* JADX INFO: renamed from: setRectOutline-tz77jQw$default */
    public static /* synthetic */ void m4818setRectOutlinetz77jQw$default(GraphicsLayer graphicsLayer, long j2, long j3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            j2 = Offset.Companion.m3953getZeroF1C5BW0();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = Size.Companion.m4014getUnspecifiedNHjbRc();
        }
        graphicsLayer.m4833setRectOutlinetz77jQw(j2, j3);
    }

    public final float getCameraDistance() {
        return this.impl.getCameraDistance();
    }

    public final void setCameraDistance(float f2) {
        if (this.impl.getCameraDistance() == f2) {
            return;
        }
        this.impl.setCameraDistance(f2);
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final void setClip(boolean z2) {
        if (this.clip != z2) {
            this.clip = z2;
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final RenderEffect getRenderEffect() {
        return this.impl.getRenderEffect();
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        if (Intrinsics.areEqual(this.impl.getRenderEffect(), renderEffect)) {
            return;
        }
        this.impl.setRenderEffect(renderEffect);
    }

    /* JADX INFO: renamed from: setPosition-VbeCjmY */
    private final void m4817setPositionVbeCjmY(long j2, long j3) {
        this.impl.mo4847setPositionH0pRuoY(IntOffset.m6766getXimpl(j2), IntOffset.m6767getYimpl(j2), j3);
    }

    /* JADX INFO: renamed from: record-mL-hObY */
    public final void m4828recordmLhObY(Density density, LayoutDirection layoutDirection, long j2, Function1<? super DrawScope, Unit> function1) {
        m4820setSizeozmzZPI(j2);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = function1;
        this.impl.setInvalidated(true);
        recordInternal();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void recordInternal() {
        /*
            r16 = this;
            r5 = r16
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r4 = r5.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependency$p(r4)
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setOldDependency$p(r4, r0)
            androidx.collection.MutableScatterSet r2 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependenciesSet$p(r4)
            if (r2 == 0) goto L2d
            boolean r0 = r2.isNotEmpty()
            if (r0 == 0) goto L2d
            androidx.collection.MutableScatterSet r1 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(r4)
            if (r1 != 0) goto L24
            androidx.collection.MutableScatterSet r1 = androidx.collection.ScatterSetKt.mutableScatterSetOf()
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setOldDependenciesSet$p(r4, r1)
        L24:
            r0 = r2
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            r1.addAll(r0)
            r2.clear()
        L2d:
            r0 = 1
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setTrackingInProgress$p(r4, r0)
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r3 = r5.impl
            androidx.compose.ui.unit.Density r2 = r5.density
            androidx.compose.ui.unit.LayoutDirection r1 = r5.layoutDirection
            kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> r0 = r5.clipDrawBlock
            r3.record(r2, r1, r5, r0)
            r11 = 0
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setTrackingInProgress$p(r4, r11)
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependency$p(r4)
            if (r0 == 0) goto L49
            r0.onRemovedFromParentLayer()
        L49:
            androidx.collection.MutableScatterSet r15 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(r4)
            if (r15 == 0) goto La2
            boolean r0 = r15.isNotEmpty()
            if (r0 == 0) goto La2
            r0 = r15
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            java.lang.Object[] r10 = r0.elements
            long[] r9 = r0.metadata
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L9f
            r7 = r11
        L62:
            r4 = r9[r7]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r4
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r0 + r12
            long r0 = r0 | r12
            long r2 = r2 - r0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 == 0) goto L9a
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r6 = 8 - r0
            r3 = r11
        L7f:
            if (r3 >= r6) goto L98
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r4
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L94
            int r0 = r7 << 3
            int r0 = r0 + r3
            r0 = r10[r0]
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r0
            r0.onRemovedFromParentLayer()
        L94:
            long r4 = r4 >> r12
            int r3 = r3 + 1
            goto L7f
        L98:
            if (r6 != r12) goto L9f
        L9a:
            if (r7 == r8) goto L9f
            int r7 = r7 + 1
            goto L62
        L9f:
            r15.clear()
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.recordInternal():void");
    }

    private final void addSubLayer(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.onDependencyAdded(graphicsLayer)) {
            graphicsLayer.onAddedToParentLayer();
        }
    }

    private final void transformCanvas(Canvas canvas) {
        float fM6766getXimpl = IntOffset.m6766getXimpl(this.topLeft);
        float fM6767getYimpl = IntOffset.m6767getYimpl(this.topLeft);
        float fM6766getXimpl2 = IntOffset.m6766getXimpl(this.topLeft) + IntSize.m6808getWidthimpl(this.size);
        float fM6767getYimpl2 = IntOffset.m6767getYimpl(this.topLeft) + IntSize.m6807getHeightimpl(this.size);
        float alpha = getAlpha();
        ColorFilter colorFilter = getColorFilter();
        int iM4822getBlendMode0nO6VwU = m4822getBlendMode0nO6VwU();
        if (alpha < 1.0f || !BlendMode.m4089equalsimpl0(iM4822getBlendMode0nO6VwU, BlendMode.Companion.m4120getSrcOver0nO6VwU()) || colorFilter != null || CompositingStrategy.m4810equalsimpl0(m4823getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m4816getOffscreenke2Ky5w())) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            Paint.setAlpha(alpha);
            Paint.mo4056setBlendModes9anfk8(iM4822getBlendMode0nO6VwU);
            Paint.setColorFilter(colorFilter);
            canvas.saveLayer(fM6766getXimpl, fM6767getYimpl, fM6766getXimpl2, fM6767getYimpl2, Paint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(fM6766getXimpl, fM6767getYimpl);
        canvas.concat(this.impl.calculateMatrix());
    }

    public final void drawForPersistence$ui_graphics_release(androidx.compose.ui.graphics.Canvas canvas) {
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated()) {
            recreateDisplayListIfNeeded();
            this.impl.draw(canvas);
        }
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.impl.getHasDisplayList()) {
            return;
        }
        try {
            recordInternal();
        } catch (Throwable unused) {
        }
    }

    public final void draw$ui_graphics_release(androidx.compose.ui.graphics.Canvas canvas, GraphicsLayer graphicsLayer) {
        if (this.isReleased) {
            return;
        }
        configureOutlineAndClip();
        recreateDisplayListIfNeeded();
        boolean z2 = getShadowElevation() > 0.0f;
        if (z2) {
            canvas.enableZ();
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            nativeCanvas.save();
            transformCanvas(nativeCanvas);
        }
        boolean z3 = !zIsHardwareAccelerated && this.clip;
        if (z3) {
            canvas.save();
            androidx.compose.ui.graphics.Outline outline = getOutline();
            if (outline instanceof Outline.Rectangle) {
                androidx.compose.ui.graphics.Canvas.m4151clipRectmtrdDE$default(canvas, outline.getBounds(), 0, 2, null);
            } else if (outline instanceof Outline.Rounded) {
                Path Path = this.roundRectClipPath;
                if (Path != null) {
                    Path.rewind();
                } else {
                    Path = AndroidPath_androidKt.Path();
                    this.roundRectClipPath = Path;
                }
                Path.addRoundRect$default(Path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
                androidx.compose.ui.graphics.Canvas.m4149clipPathmtrdDE$default(canvas, Path, 0, 2, null);
            } else if (outline instanceof Outline.Generic) {
                androidx.compose.ui.graphics.Canvas.m4149clipPathmtrdDE$default(canvas, ((Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
        if (graphicsLayer != null) {
            graphicsLayer.addSubLayer(this);
        }
        this.impl.draw(canvas);
        if (z3) {
            canvas.restore();
        }
        if (z2) {
            canvas.disableZ();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        nativeCanvas.restore();
    }

    private final void onAddedToParentLayer() {
        this.parentLayerUsages++;
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final RectF obtainPathBounds() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void configureOutlineAndClip() {
        if (this.outlineDirty) {
            android.graphics.Outline outline = null;
            if (!this.clip && getShadowElevation() <= 0.0f) {
                this.impl.setClip(false);
                this.impl.mo4845setOutlineO0kMr_c(null, IntSize.Companion.m6813getZeroYbymL2g());
            } else {
                Path path = this.outlinePath;
                if (path == null) {
                    this.impl.setClip(this.clip);
                    Size.Companion.m4015getZeroNHjbRc();
                    android.graphics.Outline outlineObtainAndroidOutline = obtainAndroidOutline();
                    long jM6820toSizeozmzZPI = IntSizeKt.m6820toSizeozmzZPI(this.size);
                    long j2 = this.roundRectOutlineTopLeft;
                    long j3 = this.roundRectOutlineSize;
                    if (j3 != InlineClassHelperKt.UnspecifiedPackedFloats) {
                        jM6820toSizeozmzZPI = j3;
                    }
                    outlineObtainAndroidOutline.setRoundRect(Math.round(Offset.m3937getXimpl(j2)), Math.round(Offset.m3938getYimpl(j2)), Math.round(Offset.m3937getXimpl(j2) + Size.m4006getWidthimpl(jM6820toSizeozmzZPI)), Math.round(Offset.m3938getYimpl(j2) + Size.m4003getHeightimpl(jM6820toSizeozmzZPI)), this.roundRectCornerRadius);
                    outlineObtainAndroidOutline.setAlpha(getAlpha());
                    this.impl.mo4845setOutlineO0kMr_c(outlineObtainAndroidOutline, IntSizeKt.m6816roundToIntSizeuvyYCjk(jM6820toSizeozmzZPI));
                } else {
                    RectF rectFObtainPathBounds = obtainPathBounds();
                    if (path instanceof AndroidPath) {
                        ((AndroidPath) path).getInternalPath().computeBounds(rectFObtainPathBounds, false);
                        android.graphics.Outline outlineUpdatePathOutline = updatePathOutline(path);
                        if (outlineUpdatePathOutline != null) {
                            outlineUpdatePathOutline.setAlpha(getAlpha());
                            outline = outlineUpdatePathOutline;
                        }
                        this.impl.mo4845setOutlineO0kMr_c(outline, IntSizeKt.IntSize(Math.round(rectFObtainPathBounds.width()), Math.round(rectFObtainPathBounds.height())));
                        if (!this.usePathForClip || !this.clip) {
                            this.impl.setClip(this.clip);
                        } else {
                            this.impl.setClip(false);
                            this.impl.discardDisplayList();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                }
            }
        }
        this.outlineDirty = false;
    }

    private final <T> T resolveOutlinePosition(Function2<? super Offset, ? super Size, ? extends T> function2) {
        long jM6820toSizeozmzZPI = IntSizeKt.m6820toSizeozmzZPI(this.size);
        long j2 = this.roundRectOutlineTopLeft;
        long j3 = this.roundRectOutlineSize;
        if (j3 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM6820toSizeozmzZPI = j3;
        }
        return function2.invoke(Offset.m3926boximpl(j2), Size.m3994boximpl(jM6820toSizeozmzZPI));
    }

    private final android.graphics.Outline updatePathOutline(Path path) {
        android.graphics.Outline outlineObtainAndroidOutline;
        if (Build.VERSION.SDK_INT > 28 || path.isConvex()) {
            outlineObtainAndroidOutline = obtainAndroidOutline();
            if (Build.VERSION.SDK_INT >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(outlineObtainAndroidOutline, path);
            } else if (path instanceof AndroidPath) {
                outlineObtainAndroidOutline.setConvexPath(((AndroidPath) path).getInternalPath());
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            this.usePathForClip = !outlineObtainAndroidOutline.canClip();
        } else {
            android.graphics.Outline outline = this.androidOutline;
            if (outline != null) {
                outline.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.setInvalidated(true);
            outlineObtainAndroidOutline = null;
        }
        this.outlinePath = path;
        return outlineObtainAndroidOutline;
    }

    private final android.graphics.Outline obtainAndroidOutline() {
        android.graphics.Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        android.graphics.Outline outline2 = new android.graphics.Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    public final void release$ui_graphics_release() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            LayerManager layerManager = this.layerManager;
            if (layerManager != null) {
                layerManager.release(this);
            } else {
                discardDisplayList$ui_graphics_release();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void discardDisplayList$ui_graphics_release() {
        /*
            r19 = this;
            r11 = r19
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r1 = r11.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependency$p(r1)
            if (r0 == 0) goto L11
            r0.onRemovedFromParentLayer()
            r0 = 0
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setDependency$p(r1, r0)
        L11:
            androidx.collection.MutableScatterSet r18 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependenciesSet$p(r1)
            if (r18 == 0) goto L70
            r0 = r18
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            java.lang.Object[] r10 = r0.elements
            long[] r9 = r0.metadata
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L6d
            r17 = 0
            r7 = r17
        L28:
            r4 = r9[r7]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r12 = r0 + r4
            long r0 = r0 | r4
            long r12 = r12 - r0
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r1
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L68
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r6 = 8 - r0
            r3 = r17
        L46:
            if (r3 >= r6) goto L66
            r0 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r4
            long r13 = r13 | r0
            long r15 = r15 - r13
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L62
            int r0 = r7 << 3
            int r0 = r0 + r3
            r0 = r10[r0]
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r0
            r0.onRemovedFromParentLayer()
        L62:
            long r4 = r4 >> r12
            int r3 = r3 + 1
            goto L46
        L66:
            if (r6 != r12) goto L6d
        L68:
            if (r7 == r8) goto L6d
            int r7 = r7 + 1
            goto L28
        L6d:
            r18.clear()
        L70:
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r0 = r11.impl
            r0.discardDisplayList()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.discardDisplayList$ui_graphics_release():void");
    }

    public final void emulateTrimMemory$ui_graphics_release() {
        this.impl.discardDisplayList();
    }

    public final long getLayerId() {
        return this.impl.getLayerId();
    }

    public final long getOwnerViewId() {
        return this.impl.getOwnerId();
    }

    public final androidx.compose.ui.graphics.Outline getOutline() {
        Outline.Rectangle rectangle;
        androidx.compose.ui.graphics.Outline outline = this.internalOutline;
        Path path = this.outlinePath;
        if (outline == null) {
            if (path != null) {
                Outline.Generic generic = new Outline.Generic(path);
                this.internalOutline = generic;
                return generic;
            }
            long jM6820toSizeozmzZPI = IntSizeKt.m6820toSizeozmzZPI(this.size);
            long j2 = this.roundRectOutlineTopLeft;
            long j3 = this.roundRectOutlineSize;
            if (j3 != InlineClassHelperKt.UnspecifiedPackedFloats) {
                jM6820toSizeozmzZPI = j3;
            }
            float fM3937getXimpl = Offset.m3937getXimpl(j2);
            float fM3938getYimpl = Offset.m3938getYimpl(j2);
            float fM4006getWidthimpl = fM3937getXimpl + Size.m4006getWidthimpl(jM6820toSizeozmzZPI);
            float fM4003getHeightimpl = fM3938getYimpl + Size.m4003getHeightimpl(jM6820toSizeozmzZPI);
            float f2 = this.roundRectCornerRadius;
            if (f2 > 0.0f) {
                rectangle = new Outline.Rounded(RoundRectKt.m3991RoundRectgG7oq9Y(fM3937getXimpl, fM3938getYimpl, fM4006getWidthimpl, fM4003getHeightimpl, CornerRadiusKt.CornerRadius$default(f2, 0.0f, 2, null)));
            } else {
                rectangle = new Outline.Rectangle(new Rect(fM3937getXimpl, fM3938getYimpl, fM4006getWidthimpl, fM4003getHeightimpl));
            }
            this.internalOutline = rectangle;
            return rectangle;
        }
        return outline;
    }

    private final void resetOutlineParams() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.Companion.m4014getUnspecifiedNHjbRc();
        this.roundRectOutlineTopLeft = Offset.Companion.m3953getZeroF1C5BW0();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    public final void setPathOutline(Path path) {
        resetOutlineParams();
        this.outlinePath = path;
        configureOutlineAndClip();
    }

    /* JADX INFO: renamed from: setRoundRectOutline-TNW_H78 */
    public final void m4834setRoundRectOutlineTNW_H78(long j2, long j3, float f2) {
        if (Offset.m3934equalsimpl0(this.roundRectOutlineTopLeft, j2) && Size.m4002equalsimpl0(this.roundRectOutlineSize, j3) && this.roundRectCornerRadius == f2 && this.outlinePath == null) {
            return;
        }
        resetOutlineParams();
        this.roundRectOutlineTopLeft = j2;
        this.roundRectOutlineSize = j3;
        this.roundRectCornerRadius = f2;
        configureOutlineAndClip();
    }

    /* JADX INFO: renamed from: setRectOutline-tz77jQw */
    public final void m4833setRectOutlinetz77jQw(long j2, long j3) {
        m4834setRoundRectOutlineTNW_H78(j2, j3, 0.0f);
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU */
    public final long m4821getAmbientShadowColor0d7_KjU() {
        return this.impl.mo4837getAmbientShadowColor0d7_KjU();
    }

    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA */
    public final void m4829setAmbientShadowColor8_81llA(long j2) {
        if (Color.m4179equalsimpl0(j2, this.impl.mo4837getAmbientShadowColor0d7_KjU())) {
            return;
        }
        this.impl.mo4842setAmbientShadowColor8_81llA(j2);
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU */
    public final long m4826getSpotShadowColor0d7_KjU() {
        return this.impl.mo4841getSpotShadowColor0d7_KjU();
    }

    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA */
    public final void m4835setSpotShadowColor8_81llA(long j2) {
        if (Color.m4179equalsimpl0(j2, this.impl.mo4841getSpotShadowColor0d7_KjU())) {
            return;
        }
        this.impl.mo4848setSpotShadowColor8_81llA(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object toImageBitmap(kotlin.coroutines.Continuation<? super androidx.compose.ui.graphics.ImageBitmap> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.graphics.layer.GraphicsLayer.AnonymousClass1
            if (r0 == 0) goto L38
            r4 = r6
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r4 = (androidx.compose.ui.graphics.layer.GraphicsLayer.AnonymousClass1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L38
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L3e
            kotlin.ResultKt.throwOnFailure(r3)
        L23:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            androidx.compose.ui.graphics.ImageBitmap r0 = androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(r3)
            return r0
        L2a:
            kotlin.ResultKt.throwOnFailure(r3)
            androidx.compose.ui.graphics.layer.LayerSnapshotImpl r0 = androidx.compose.ui.graphics.layer.GraphicsLayer.SnapshotImpl
            r4.label = r1
            java.lang.Object r3 = r0.toBitmap(r5, r4)
            if (r3 != r2) goto L23
            return r2
        L38:
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r4 = new androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1
            r4.<init>(r6)
            goto L13
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.toImageBitmap(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨\u001cԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u0014\"\nX~2CUR6e(", "", "u(E", "!mP=f/Hb|\u0007\u0006e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7|*aCHY=\u001a vdC\u0016G4Y}|", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        LayerSnapshotV21 layerSnapshotV21;
        if (LayerManager.Companion.isRobolectric()) {
            layerSnapshotV21 = LayerSnapshotV21.INSTANCE;
        } else if (Build.VERSION.SDK_INT >= 28) {
            layerSnapshotV21 = LayerSnapshotV28.INSTANCE;
        } else if (SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable()) {
            layerSnapshotV21 = LayerSnapshotV22.INSTANCE;
        } else {
            layerSnapshotV21 = LayerSnapshotV21.INSTANCE;
        }
        SnapshotImpl = layerSnapshotV21;
    }
}
