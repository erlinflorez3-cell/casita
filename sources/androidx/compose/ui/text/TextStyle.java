package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.ViewCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: TextStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŉ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aw\rfr9FDm߉6Ri*\u0017ӆ\u00044:[,ڎK;k\u001a\u0006̝\u0011OdgoñRZ!C\u0017إ\u001exx8QU~]\u001a\u000fHBwЀ;M\u0006=Aś|6\u001b :\">y\r\u00010*PƵ~zYK\u0014۵8@\u0007:Z҈U\u00050\u0012\u000e>&\u0001&\\}N>Hr]B/9\u0003qĩV'u0\u0005M\u0013F\\'#viӜ3@M5\u001d%Y\u0003\u000fRq?\u000bӊy=\u001bh/'1J{WLX\bϬ\u001d+]\u0012er,0\rQn\u0015/+UeSP\u001c.\u007fz\u0002\u0018B\t$ͺEς-]\u001a\u0015\u0007F3ϣq\u0014UV\u0010nF\u000ezy6E&\u001079;3f\u007fdޅ\u001dNE\u007fEے\u001d)\u0016~'aT\u001ce-\u001b\u0003}a7W@KOf\n\bE}\fvb\u00103\u001c2]~]\u0006!6\u001d%EfQ%7j0TTo|\u0005nukkhGn0~\u001e=*\u0017\u001brFz\u0004\u001a`d`2\u0011[-l\t\u0014\u0007A2l}B!3#fO\u0017qzUc\n3C~9om\u001a#gAd3Cg{\u0012wQ%+ODh\u0005f~ZU\"Y\u000bA28Nj\u001e\u0012\u0014D|\u0012#:Eq*OD3/[Cd\u0013&HA\u000b&w\\~\u000f-rC,\ti2\u0014!\u0003f[\u001f\u0010w\u0001O,\u000b\u0002:/WPc;6[(hB ;\u0007-{\u0010OmLUp\u0005\u0018\fT*Eک\u001e9_U}ҍ\u000e\u0005>B\b3EZw}Q{\u00187\u0001\u0003y\u001dB\u0001.\u0016\u0010zx2`xSgV-!%h\u0003+\u000ed\u000e\u0005yH\u0011F\u0012`\u001bcDI\u0001\u0010q>d7+\u0013/&+\u0001}1\u00157CBU-&\u007f\u001a/#ruk\u0006-(t\u001f,ze\u0012?{\u0016\u001ejae8;F]q\u0001T!R\u0002\u0013JNj\u0006\u001eZ\u000bJ\fa_QlvVFe#1\u0014e5E\u001dv\\[H-\b}b4o2yC\f/vE;\u0010{owusKj(b\u0011 \n*O~\u001a\"=.uod\u001f/4\u0014(>G;p&T\u000b:3Z^\u0018\u0011ITw)(z.No\u0017\u001d2P\u0018SX$S'\u0002fP\u000b`S\b9,\u0017}=[.\u0001;1\u0013\u0017^VEb`+Ә!\t)\u0016\u0010Ʊf+@TZ?\u001b6]\u0019\u000bscSO\b6\u0012NAm\u001aw\u001c@\u001e|+K0\u001dOP?i\u00078d\u000bcoff\r\u0011\u0015^^*/~\t\n&> \u000e9'_zub;[fyMBH\u0011'L/\u0007\u001a\u000e{H1,4G=COj\":\u0014W\u0002C\u000e\u0010& 5\u0018\r#rV<{\u001ae!:$\b.d\u0018\bAg0\f4J\u0003\u000b\"0\u001e5}\u001bC\b\u0019^g\u0006\u0010!n-;t\fBY\u0004\u0011\fyk\u0012\u000be\u0013\tf?s\u0012pCOK'7U4\u0013fyR\u0013i\u001f\u00071\u0010\u001c\u001b&-W d?\u000f}\u0006xvqOi0C/\u001a2q96R,\"7{\f\u0003Xy8\u001dAV[e|\u000brkp\u007f\u001efp(r\u001e$+*{-rn\u0019\u00194T\u001f6fE6GLk\u0015M`\u00152]K< _\u0002̫\u001f7@;0ħv\u0017\u0018Jhz\u007f8G!r.m<3LTK!?YRut\u000b,KSAZ\nB\u0010<\u001b?b> Lg2\u001eQPaM)\u0019\u0007\u0015F\u0013\b\t/4\u0019_c-0\u0001\u000b\u0010%A\u00100\u001aJ\u0004?x#= \b\u001dmei7EkR'\u001a\u0015}J-Us^\u0015a:]MG4x\u0004U\u0010\u0012%$2\u001c\u000e%\u0016D__:gb@d\fo\u0006<)d\bT)Ml\u0007\u000e\",\u0018\u001e\u0004laaB\\\u0013\u0016/ClF=t\rE[\u0006\u0012\rZ\fs2G\u0017\f)AH\u0015\u0012epn]YzS/j|T\u0015\n\u0003hRq>\u007fGNzB\bC\u0011\u0003\u0006zpsQm3P\u0012;\u0015\u0014\u007f7Rn$x\u001f.&y\u001cV>bx[hz\rV\u000eR\u0007>J\u0012\u000b\u0014?FJ-\u0001,tp\u001d\u00193U YI(U*N-\u0019a%\u0014S\u007fl]>\u0004!hE?3\u0019!bZKd\u000b9Ȝ%Kr`Uʎj1BW\\D\u001a8]\u001e\u000esjX\u0016JxR/\u00060^8`\u0007`Ck\n4!STCo\u000f:h7io)-MV\u001d^e+3x\u0010\u0010(C/\u00129,cA8#\u0002\u001cI@\u0012\u0007\u000bYe\u0005sI\u001e\u0014yL7.4Q?GQldxW\u0019\u0006G\u000f\u0014&'2\u001a+&xfA~\u001e*e\u0003ZLn+^J\b(vJp\u000f\t\r$0\"7\u0004\u001fM\f\u0017b*OS_n2>x\u000fG]\u0006\u0014,{n\u0015\u0011iUK+\u00046V3\b\u0010\u0012mo\u001ctQj\nV\u0019m%nE\u0012 #&o\u001b`)^7eisj\u0002ux\u0011\bV{6jy\u0001\n|>\u0012FLPr\u0019ts\u0016\u001dgC\u0011.pxNA\u001e\n\u0005.=5v\u0013)\t\u0007Ko@,9ZuQ\u0012C@(a0\u007fu%uw\u0016\u0014pa\u0006C\u0014]ae\u001dw2|#8Vh\t\u0003\u001b9Վ4\u0004yerիZF0=`5%\u0001\n@\r:5\u00152tS`\u000b\u000e\u001f!\u001f\u000f)$\u001aO^QGO\u001b\u0013!B\b@Vp|\u0005W\u000b/>\u0004\f\u001f M\u00147\u0003@\"\bC_wOBj6+\u0014h&.\u001ds\u0018\u0004qY;Q\u007fa?m>U}\u0007gMqC\u0018\tP;4\u000e\u001b'\u0010[LJ`*3\t\u00156&^~p\u000f$7z\u001c7zu\u001cH\u0006@\ne\f~DICUk\u0017]/Ep6dYs\u0005+U(a\u0016hU\\u{[Ko.4\u001dn2M {f[P4\u0010\nx3\u001aX\fO\t\u0014x|F\u001cpe\u001d\u001f\u0007Vg\u0010K5%\u00143^\u0004/)@3\u0001xg.]\u0019v#7_h|\u000br\u00198h8> 3`Z|\rI'\u0015Sj\u001a$`]zVJC\u0004\u0014oiQ0\u0011`m>.8\"&<#\u007fCe%s~\fEmd\tcQ&'\u001d~\u0018y62U\u0011r\"EZ6BϘjL^H\u0002؝l4\f\u0007x%v-\u0004@DPUSk\u001fg\u0013o\u0005;\f#cj\u0001\u001e|bs'^\u0006\u0016)\u0019A-\u001f&&\u001e~#eDW{\u0001NS+\u000e0B\\\u0014$\rkL\u0013B\"CG>\u0002~)3}_lQ\u001d\u000f; V\u001b(0gl!\u0001-*8BA\t+s\u000f\u0010*\\=\t[Y\u0007\u0003 2\u001e4m\u0012U\tAwn\u007f\u0006!WFHu\u001fLz\u0005\u000e6pox\u0010v\u0012epjv\u000f}<E6*>Ri\u001ardJ'iC\\\u0019$\u001dMF4:\u0012n>8tj\u0014n%pr\u001af4|fpBK*Q36\t\u0007\t1|C\u0016TX\u0004ft\u0017lv^d*`\u000b=\u0018\u001f\u00187#\u0004\u0014n}2JAY\u0002'kBd:,x\u0013R\u000b\u001c\u0015RP;ANaR!gd+{6~%:Xl\u000b\u0003]p!z\u000fp?^aar\u001eZ\f9xqy=~jCcm]I'.>aEVcg8\u001bs\u001cӜM%#I_\f\u0012ŏ\u0013!Cqt^X@\u0012\n2\u0016Z~dsSrDu*[,v8a\u0018\\ƇFb]g^ؿe\\ɶV\ndAʱd\u0004H\u00052\u0004tH5EV)3\u000b)c\u001bLr\fcriGc}t\r=9mqM0Z~\u0013\u007f21 J(zgkDP\u0018\u001a?Cw=b\n\u0012PZ|\u00152_\u0011z\u0019r\u001a\u00192N-\u0018\u001dlewDx}b6zn\\+\u0014\r\u0015H\u001eD\u0012MSiF\u0006d%\u0010r\u0005s\u0005j~\u0015U\u0016@+-\u0007Bms\u001b}(9)t\u0017\u0004;g{ek\u0003\u0011^\u0016`}dH\u001a\u001f\u00198BTN\u0011;Wm4,Sdz\\Ms}56(\u001apE%0\u0007n~X\t\tcFGl5uj_g$\u0011|]'^\bO\u00169\u0012bIR_lBE_95z#Y\u0013a%i-\u0001CgO_\bej\u0005\nD\u001es\u000fOw\u000b8|fcl,&m\u007f(cf*N-\u001b*+CNPB-\u0013>KJ\u000f\u0014dT5\u0011]Pr0\u000bJHD\u001cX\u000f7 xUEk_\n&߭$ٜǳ\u0010\u0015+ܪ.\u0017Ք(0ΰ&\u0003ڒm|\f\u007fՊ\u000e6?\bz\f\u007fP\u001cH+\u0003\"4$[q\u0012oPKn'9Una3c\f>XVo\r:pv\u0002l\u0011bD:\t\u001eQE\u0011\n\u0001W\u0013%,`tbT8w0\\\u0018>0]2lw^8Q\"xg/\u0006#ak\u0016l8\u000b9s}.\u0002\u0018KlGS`} $Z+$_Tz#\u0003zjDjy'J2BZ\r8\u000e\"O\u0015OOBQy6\u0005@G?oSu\u0013PTQ\u001f+\fZ+*/hC>+\u000fN\t1\u0012p3+\u0012w\rgU%vLD{w\u0012)8aH&\u0004\u0003I\u001aA6D7\u001a\\i\b\u0015,\fh:L`,IkOp=#'\"\u001b.gOfz\b\u0004y*q\u000f5.\u001dG\u000fn\fJ\u0005\u007fn\u0006\u001f^=H5U\u000ft\u001d\":\u0015J\u001cqP;\u0003\u000eh3df.-\u001bcDpx%\u0013=)[:LR\u000fMW\u0002S3<\u000bBjM[Wq\u0012a&t'1-4d;՜E˳шg{BɴAk͊\n\u0017־4\u0014\u05caIlr2ϳ,\u001bR\u0011Qait3dtc%'\u001c\u0002\u001f0K\u0005!mJ-\u0010\u0019~\"\bC<W8 tKG,ym\u001at$c\u0015\u001fHK (\u0018C\u00191.SXrmn\u0017S.u2=\ne\u001d\u0017T\u001bDw6H(${v\u001f\u0014*\u000b\u001ee\u007f:MFz\u0004MNWx%n|[Sa}|72#\u0015+E8\u007fmRO\u007f^fO\u000e||s&AD+a\u0015zCad\\\u0014)dh#\u0013[=k_(9B\fE\u0006\u0006\b.e0\u0003CM`Css)q\u0017s\tEem\u0007\u001b'$}bpI]\u00075FfN(+!N)\u00032\u0005aZ\u0001iUr2\u0015UP[\u0017\u001c\u0017{t%_.Fml\u0004l$7\u000e\u0007\u007fM(\u0013VT_\u0018#Mv\u0019Bx4,]xF\u0004$v\u007fA?PRAbX\u0005|2f2(0Cu$#hq/$/f:i=ѳMٞÉ\t5eʲn\u0001у\u001e\u001b\u05f9Apȥ}YH_֥[WD\u001f\u0001i\\+\u00148zI\u0018\u001e=7A:7vi,ik\u0013\u0002\u0010Y}\u0018\u00125$FgER=Z\bA\t8\u001cZ`>\u0019IooZ\u0005\u0012\u001d\r\u0005QFh\u0003Q\u0007\u000b&0V\u001dCXp=IQf\u0001<oYY]5u\u001d7 '\u0018\u0004]f+;bQ7Y>9xh\u001eS\u001dR\u001b\r LD3y?\u0013lQT`s[KcVt\u001f\u001cfe[<`\u000el!P/crB \\\u0004L([jSo[+\u0019\u001f\u0001-\u0012\r/@)\u0004\u00145L\t\u0017ZQI\u0018L\"\u0001$\u0013\t#A6\u0014\r\u0002miIuqR3$=\bVG>$\u000bQq<\u0004M|6\u0002\u0018XC\u001a1,:66P\u001ePw}nw6Ph#w\u001a,5t\u001bt;at\u0011'<H\u0012I\u0014!\u001e\u0004DK\u0013@ENh9k6?Y[t\u0010a\u0019\u0017g\u0013iNF\u0015I#\u0013WwkZ:{'(<ӏfͪĊ\n\u001apߝrN P\u0013՛) Ҡ%|o2Ӧ*_q\u0018RP-!2\u0012q|H\bz4D/}\u0001\u0007Bb\u0005ed\u0013\u0017h dzPT\u001c%\u001e5FVA\u0011@^\u001dEE?]\raU`i>?a)u\r H\u0010\tmB\u0004\u0016\u001dMI=3\u0019tl]v\u001d\u0011\u00101[dM1,zmR\u0010jkF@x:\u0018g#z5\t\u0005Z4cZXNj\u000e\rZ\"\u0011<)U\b_y'C#Z\u0006%!+I}\u0017f\u00145u\r\u0014+Jd=--1Bir/y\u0019KK\b\u0012vH\u0018/\u001e] \u001d\ns+c.Pok\u0006nfyMF\u007fU)\u0013ZQ`\u0014%Px\u0017CmL{$\u001bf>p]RI\u007f\u0014\u0015{A\u001eՀ}Ԛ\u07fb\".\fҍN.֓knҒNuſ;Z\tPև\b|\n6k|\u000bt\fcIQ\f%TL\u001a\r\u0012g$\u001c\tY\u0005{`3\u007f7\u0001OD,=@y\u0007d3V*\u0014{6\u001f\u0002\\z&}.>?\u0013\u001c3\u0003\u000bJy]hR\u0007\u0018)o./a^\u000b$\u000b\u0005pRp~'L7Jf\u000bA\u0015?k\u001eGE?^\u0013CuA|`\u000bbkwMap2(\u0011d&@<qS@5\"V\u0011=\u0016~:\u001d\u0014|\tkR0{qP\u0013jnHC\u0002W{\u0007\u0007\u001d:P\u0005\u001f4%dzo\f21\u0003C3>4Y\u000fC[I$CC%\nBMj$\u001bk\u00030t*>1AJ\u0016p!Q&Ussw[Ju(3\u0018h:UA\u007f\"\u001e\f{MC\u0012sQ h\u0010\b\u001bwq\u0002W(%\\[v\u0015ۢNҌΨPRHݱq#ޱ=l˼Ztš8!yJ͝?\u0006.L\u000eU}x\u001e\b~QMY{\u0012q=q\u0011T[[y\u0015@\u0017\fg\u0019li\u0011U\u0010cWs>0\u001d\u0003BAT\u0004\u0001uZ>\"\u001c\u000b%LRFi\u0013$|bZ,\u0005q5)/do\u001cW_!&\u001fM6O3R3s~\u0007,;K\tQGa_\r)n%PqR\u000eL1Xh\t0C\u0018+f\u001bZrIW\u0001jkfa*z\"~bWz{Ja6\bFP]\u0014UC5'zr]x\u001f\u001f>5\u001e+\rx0\u0005ZI\u0012\u0004\u0017P=g.Ij-b_OaK| f\u00150/U;\u0005Xol=SoY\u001d/H-M\b+ct\rJ\u001bm\u0006.v/>5AM5UB62\u000f7\u0014dc\u0004t>};\u000eDR`:N'\u0006V%\u00144UYX\f\u0018SC\u0012g|\u0005-*C,^BjU̦sڙԓ)@8ͬ\"\u0011ۗ|E\u001c>Ӈ(1>\fܞ\u0004TS0ݔ\u0007\u001aS:,\u001bgBź-\"SNٟ$mY$Ր5\u00131\u0001Ǟ]<_@Ŵ.\u001a\u0016ɶL@%dѐ:P\u007f\u0005՜0\u0006:\u0005ĿH0Gѐ-^\u000e%ւ*7\u0005R'\rۡi6i^֣D3\u05f5Ú?Hpۀ\u0014YѶ3oѪ#Za\u000e҆/\u001f~\tpZ\\X-N$\u0013\"9?\u001f.g\u001cFtM[\u0002K|H\u0003L=!2d\u001ay!nsY,P^~:\u0004N+\u000eP\u001eA%h$\u001d\u001ciR'~&\u0014YP{f\u0017V\tnK\r\u0002\u001f\u0007fxD\u007f\t\f\u00101.J\t_'yyl>Uq=oO)5(#\u001b/\u001f#A\u0014\u0003\u000b4a\t@Glv\rR\u0017o\u0017\u0010 +f51\u001cXuRLZv\u00028P$\u0006XGd<x;zl$te4\n\u0001v0+D.c5S[\u0005T^\u0003_~Kj\u00145\u0015'%+_\u0019c0\u000f\u001eC\u000e,L\u0012s\u0002#\"(\u0001U\u0010\u00188sqEp\u0016T`^w\u0017\\\u001e\fj\u001epKS\u001ef&\u001aT\u0003pcC\u0007$\rH|w\\_( 'UPN\u001cg]\u0019F\u0012t\\$z\u0011\u001c\u0011\u0006\u0007!]Q8R=\u0017V}W`\n8I5\u00058\u001aLǲ\u0003ȈӃ\t\u001d`ۨC\u0005ɑ{fĹ\u0015<ŭ[K\u001bM͏ FLcb\nvV\u007fgID<\u001a\u0001\u001bMB/\u0014\u0011Rb\u0001\u007fWkG=\rt|{\fx\u0001 <rjQ\u001dI\u0012rWjktVqi=*\u0005;\u0004/i\u0006_Hr-aN\f\u0018\u001cPr\u0014FJgue`E\\1O[#.NWc6w\":R\f\u001dDYo>1XPMZ\u0015.\t2Z9\u000f\u0016\u0016k\u0015\u001exV27\u001e\\1h2p\u007fcejs\u0010g-!`P172E0:W6w`\u0011Y\u0007~ksb}FWK\u0011<\u001eY\b\u0018#8>P>3:6\u0004(;r9YcqsFs0Ud^{\u0019Z|.\u000e|\u0015\u000fT\\h*Yq%\u0010\u001d`)!\u0006d\u0007!h7\b?\u0007p24=D~5h7_3!\u001f=&%a\u007fJ\u00035AJ\u001c@@\f\u0012-\u0001\u0006qW\u0010#$\u0016;0i^\u0015P\u0015\r|V|\u00071T<Fj3L\u001e6g!t\u000fkͧ\u0005҉Ǚ4\u000b3ˀ8jԳQ\u0001u/Мr\u0007|Tָ\u0019\\Vڄ\r~\u0019[(\u001b&=$\n܊\\X!3˵\u0002jsƓLrit\u000e>\u0016@?1Ӻ\u0013S\u001c~ƀ!\n0\nwż3R@sta\u05c9}8k>\u0005Ȫ@q`5\u05cc%vD\u0090\u000e).prS\u07b3\f%\u0010bǹs\u0017^q¸K+\u0019Ĺ\u0006O\u001c'%dۛj\b\\6ۚ.\u0018B<ԀHr^ڒ[9)p͈\u007fѣ$\u001f\bgܧVSA(/nHqjoʹ\u0003Z\u000e%\"\u0001\u001eR/^؆W\f'$\u0014\u001ds\u001dl{LzFvH];ݹ\u0003\u0010T\u0006\u0013\u0017/\u0007=zd?\u0003L 5iTݿ\u001aڮǱ\u0004yŝb;,$~r0\u0010h~ <\u000bV_4 \rBfؿ^ˍޟMRӽ`\u0014m\u0015LR\u007fwK\r\u0015T\\\u001c\u001e+x\u001e\u0016K\u0380d1`z6E\u001at(}\r\u001fL\u001fRp:\u0007Зeǿη^YѾlQ\u0019|b\u007fb;Ue\\\\+%]1;\t\fnh߸zڈ\u0007ݠĦ\u0017 ӣ3\ts%\u0010\u0012]2\u0001oU&zp\u007f\n@$E(`\u0017*J(5jθNʈ\u0010Ĉʧ;>Ҧy_s\u001dZP[#Ad~Y4[G\u0013T\u001e+\u0011HA\u001fNit\u0004ۖ\u0019ǴuԣÄ\u0002|ФK8%-^\u0011)y9\npq}]*qoB\u0007*Q\u000f\u001a\u001a\u0016g\u0004ʾ6í\u0017ҋÜ!zӍ~(QA6\u007f\u0014s\u001f\b\u0013\u007fr\fhSlJ-0h+hF<\u001c̛;\u0007\u0006\u0002\u0012\u000er% \"8\u0006w~#<\u0016A\u001eGՍ3j3'ph!-%B+LyD={-pk<Ȓ`Y\u001cZ?'A(m\f[;\f\b;,V(Ź Љڕ.=ہYX^Tw2,[xUvGAQ\u0001p\u0011\u0015cE¤eȢމa.ƌ|\r8?>\u00011MS\\Uur\tX\ba\u001ac\bԳ ӥēy\u0007âq>KGl5=>'>\"u37=]S\u0003z\u0003\u05c9!\u000b9\u000eV5xMB`i\u001c`\u00127F.4ސKĂÅ_\u0012ǥ9G\u0007N:6~%\u0011t\u0004J\u001c=c-oAÇ\u0003ƞ\u008bH\u000eư{Jf\u0017\u0017\u001dO5\fj\u001ez \u001bEdygկ\u001eβ̛N8҃}dS2,r|*\"=\tV\u001eP<Q\u0010vʓxҮږ-BȞ<\u001eBX\nsc\u001e\u000f\u0015N\u001e\u0003\n\u0002'XX\u0001GƲ;_\u0019\u001f\u001e\u0019^y-\t7w\u001eZ{\u000eVG\u000f'\u0603U\u0015Czgi\u001c-Y#\u0017*c3X >۞\u0013ۻw{\\ڵu\tg2\u000fq1H&O\u00158<9L\u0014уrD\"،Nz\u000e\u0001-\u00146\u00052yo\u0013w\u0017Js=\u001bƜXETMe\u007fh>A\u001f\u007fe\u001d/\u00134\u001fŋ4֩\u00145\"ǧZ^B\u001b0dU^U\bs\b\u0014\f\r/ħD\u0558ψn\u0018ח/\u0010']Y`\u0014U\"neJ*P\u0013X8\u001d?^ݢc|W,*\u0007]K<\u007f\u007fov\rXT |ؤrՊهW;Ը88lf\u0019heXeQQw\u0012[\u007fB\u0005\u001e\u0012$ʉ)Ccm\u0019q\u0007C\"\u001e$[\\v36]W^\"ߎ;\f9GH|\u001an.|\u001f5u6=\u0005\u001dY*NʺWk\btpҰR;Ìb\u07ba0MC; \u0082tUj?}(#גz\u07b9I"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "", "AoP;F;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", ">`a.Z9:^\u001cl\nr3|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:[%BTC\u0011", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W*\u0002!>G\r4>mk\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\RukR\u0006L]|V\u001bJ-\u001a\u0001dD\u0012}X>\u001f]o:", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "4n]AF0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "4n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "4n]AF@Gb\u001c~\tb:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[*7\\F;y8,j", "4n]A9(FW \u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "4n]A9,:b)\fzL,\f\u00183n\u00026", "", ":dcAX9,^\u0015|~g.", "0`b2_0GS\u0007\u0002~_;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#Z\u001cEm\u001d2VC)n8\u001f$>", "BdgA:,H[\u0019\u000e\bb*k\u0016+n\u000e)\u0006M\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|w.WK;zA\"\u0013Wn5\u0010q-X\u0004/\u001d", ":nR._,%W'\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u0006,~@\b\u001e3t\u0016\u0015QQJA", "0`R8Z9Hc\"}", "BdgA7,<]&z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "BdgA43BU\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|q5QEDA", "BdgA70KS\u0017\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t2ZC9z8(\u001e>", ":h]2;,BU\u001c\u000e", "BdgA<5=S\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|y7LCDz\n", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|RxpQ5\u001b>dN*U;^' -\u00101Lym\f*K\u0006\n+#\u0006=m\u0006X:>b\u0001'?vuyK1|v4KU6b\u0012\"5:W$\u0019vEv\u0002R\u0002\u001f/C:P+#N'?Z1\u0001sow(.\fVM'}\u007f\u0003!fXq'M>\u00156[j\n\u000bb\u0018Kb)N\\*)*\\F\rCl5TyjZ[PsZa\u0004[\u000f\u001dH'.\u0004\u000b\u0014OS)\b(C\"\f`I#WA\u0015\u000f\u007f\f<^zM*QN", ">kPAY6K[\u0007\u000e\u000fe,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr46c\u000b(&m)=;ROr4s", ":h]2;,BU\u001c\u000ehm@\u0004\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oa\u000f", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|RxpQ5\u001b>dN*U;^' -\u00101Lym\f*K\u0006\n+#\u0006=m\u0006X:>b\u0001'?vuyK1|v4KU6b\u0012\"5:W$\u0019vEv\u0002R\u0002\u001f/C:P+#N'?Z1\u0001sow(.\fVM'}\u007f\u0003!fXq'M>\u00156[j\n\u000bb\u0018Kb)N\\*)*\\F\u0003B\\;Zt h\u0014F4^c~i\u0002]\\$.4\u000b&b\r\r\u007fFH\u001a\b^D\u0002YE\u001ao'$6XP'P\u0017\\x\u0019\u00042\u001e<Baa\u0003S]?2@*G@rao\n4%\f2\u00194)0\te@'\t^bxOH#\u0014.w#qgPP)F\u001e'61\u0013y\u0007#0s\u007f)\u000e\r\\\u0012\u0019Lv\ndK$Ab\u000e$>x\u001a;Y :\u001aCUnI.%", ":h]259>O\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?AA", "6x_5X5L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#`4Bp\u00167[\u0019", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|RxpQ5\u001b>dN*U;^' -\u00101Lym\f*K\u0006\n+#\u0006=m\u0006X:>b\u0001'?vuyK1|v4KU6b\u0012\"5:W$\u0019vEv\u0002R\u0002\u001f/C:P+#N'?Z1\u0001sow(.\fVM'}\u007f\u0003!fXq'M>\u00156[j\n\u000bb\u0018Kb)N\\*)*\\F\u0003B\\;Zt h\u0014F4^c~i\u0002]\\$.4\u000b&b\r\r\u007fFH\u001a\b^D\u0002YE\u001ao'$6XP'P\u0017\\x\u0019\u00042\u001e<Baa\u0003S]?2@*G@rao\n4%\f2\u00194)0\te@'\t^bxOH#\u0014.w#gf@V/AS5n'S}\t\u001e>f@=\u000b\r\r\u0012+_0\u0011d\u0002!8\u001ee\u001b7zg>L4Db$Qjrw>\u0004q,\u001dg2X^U%g=mB^\u0018O,`q\u0016\u0015v?\u0019Q\u001f_l\u0006-Y\u0017\u001eD\n\u0005\u001a\u0018:l1TR!\fv\u001d\u0002F)\u0003;g&cR#,$Rj^d)gDH=\tu,\u001feOF!\u0003gc;F", "2qPDF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "BdgA@6MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|}8\\GEt\n", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|Rxc^\u001e\u0017wZ=$\u0018:\"42(~_Pu5aa`\u001cn;*\u00039DY\u000bE3g\u007f!0\nugQox\u0001/<U8WG*5\u0004wm\u0014vzyt\u001cr\u0010>H\r\u0002J>[s'I0{\u0002f2)7MIM!\t@\u0001\u001dfYu]Mt\u001a6\u0011q\u0019Uz\u0018\u0002BEXl\t$(\u0007]\u0016=g7&U\bQSG7`\\snK\u0012V(o/\u0019\u0013\u001dS&BY9,\r\u001bJ\"m9\u000bK\u0007\u0010Bg^IS\u000efzdf/\u0014qQa]v\\\u0019=r81\b?r\u0018pDo%w>(4-3{t^1\u0012dNitH|\u001cB)<AD=R$J^&$<\u0013s\b\u001c;p\u0005-PS\u0002['Py\u0012\u001f{)L[~`\u0015~\u00141/8B\u000f@dO\u0003~;\u007fH\u007fOr']]O\u0016z=[H\u001d\u0014Y'Qq\u0018\n,G\u0019\u001bK\u0015o\u0012AW\t\u0012D\b\u0004\u000bmCccU\u0017\u007f>{\u0013\u007fP xR*Z\u000fZ-:\"K%\u0011^ih5N<Tt1&\u0005S\u0003}\u0017e\u0011w^v2AD\u001b\u0001B\u0019K\u00168\u000fDr\\Xw<0\u001c\u0013|b2y~C5:\u0014?2?%lTq %oX0-f \r+9:\u001bL[.\u0002\u0007-`{\u0019i\u0007\u001ct8IiKfkE Et\u001b\u0005?fo\u0017>I\u000e?OV\b5cu@*<\u0005", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|Rxc^\u001e\u0017wZ=$\u0018:\"42(~_Pu5aa`\u001cn;*\u00039DVr!\u001bV~\u001c>\u00010hZ1k\u0001)G\u00166SG+9:w$\u0019v0\u0001\u0004f\u000b\u0010t(1\u000eU [\u001d@V6R[X7)1\u000eOB,G4|%(S\u007f\u0014\b\u0005\u000bpVc\u001dP=\u0003?OTFg7(\n\u0007r\u0016'lBWpv<FQ)cbxZ\u0015]J*l0\u0015!S\r2|\u0014H\u0019\u0011`\u0006!hF\u0012\u0002av3az#T\u0012_n\u001emB\u001fyD-=[0KHg=0\u00020\u0006\u0018^J.!\u00029\u00194R0It]:\u0014&mxu@\u000fV\u001d\"OzEKX)G]w\f/S\u0005\u0005\u001890{>\u000f\r\u0002\u001b'Ps\fQtc\u0017T\u007f\u0013>\u0002\u001a\u000fVAL\u001cJe_\u0003tAgn&Yi5&\u0017<", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "/k_5T", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f2*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001c\u0002='!$\u000fX4\u001cN:K-}67#\n/XW\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArxJ#nyZP\u000fc4m\u001b)}fCI\u0012#\u0006 \u001b>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7kJ\u000f~UO\u0004p U\u0005\u0007[\u0013b}:bA\rC-6r\tY=~:gw\"6`@:o4F\u001bJUqu6N\u00122.a\u001b\u001d,6;\"t/DR\u0018\u0016>\u0013c9hsV\u001eW\u0002OE9\u001c#O\u0001\fI\t\"\r\u0010&CJ0?$S\u000e$tC5)\u000f\r\u000bq\"*._M]Xw*rF\u0017!\u0018|?\fE6?#pO\u0014vK`^[p3\f_\rR @U@ue\rm\u001a\u001e?\u000b\u0019~f\u0004m\f\t6&4nKhLi`xygf1zgB$\u001f<>\u0006P/{Z\u00015\u0016\b\u001bpR{YG7\u000f=EH}k:mS\u0010FhRY<Q^>`\b%\f_|DQ8t\n\u0002'\u007f\u0013\u000304\u0005\u001d\u0004N\u00178e\u0019\u0016\u000en0x\u0019\u000b`Y [\u00138XLc\r[B\u0014Y0U|\u001cLJ\u0018CM]'v\u001d=\u0015yc\n<a\r`_Cy.+E\u0011\u0019QN\u0011'P%i\u0016C\bp\u00181nM-\u000fxTM_<>\u00117*,V<A~j\u0010^h\t\u0014u\u0014\u0006Ay|\u001d<}jyf3\u0004(tJkk\u0005j;\u0019$e\f\u0019?{hmdtb\u0005ba\u0018\u0017+\u000f\u0015^+#N'?Z1\u0001sow(.\fVM'}\u007f\u0003!fXq'M>\u00156[j\n\u000bb\u0018Kb)N\\*)*\\F\u0003B\\;Zt h\u0014F4^c~i\u0002]\\$.4\u000b&b\r\r\u007fFH\u001a\b^D\u0002YE\u001ao'$6XP'P\u0017\\x\u0019\u00042\u001e<Baa\u0003S]?2@*G@rao\n4%\f2\u00194)0\te@'\t^bxOH#\u0014.w OD=R$J^&$<\u0013s\b\u001c;p\u0005-PS\u0002['Py\u0012\u001f{)L[~`\u001dz\u001e@4BM\u0011G^7Zp>\u000fy\u001d\\3-a[\u0015\u001bp\u0003]K\u001e\u0005Vb0(\t\u0002r?(eFTo\u0012:`\u0007Wg\u0011b\u0007\u001e<ct%\u0005\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f2*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001c\u0002='!$\u000fX4\u001cN:K-}67#\n/XW\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArxJ#nyZP\u000fc4m\u001b)}fCI\u0012#\u0006 \u001b>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7kJ\u000f~UO\u0004p U\u0005\u0007[\u0013b}:bA\rC-6r\tY=~:gw\"6`@:o4F\u001bJUqu6N\u00122.a\u001b\u001d,6;\"t/DR\u0018\u0016>\u0013c9hsV\u001eW\u0002OE9\u001c#O\u0001\fI\t\"\r\u0010&CJ0?$S\u000e$tC5)\u000f\r\u000bq\"*._M]Xw*rF\u0017!\u0018|?\fE6?#pO\u0014vK`^[p3\f_\rR @U@ue\rm\u001a\u001e?\u000b\u0019~f\u0004m\f\t6&4nKhLi`xygf1zgB$\u001f<>\u0006P/{Z\u00015\u0016\b\u001bpR{YG7\u000f=EH}k:mS\u0010FhRY<Q^>`\b%\f_|DQ8t\n\u0002'\u007f\u0013\u000304\u0005\u001d\u0004N\u00178e\u0019\u0016\u000en0x\u0019\u000b`Y [\u00138XLc\r[B\u0014Y0U|\u001cLJ\u0018CM]'v\u001d=\u0015yc\n<a\r`_Cy.+E\u0011\u0019QN\u0011'P%i\u0016C\bp\u00181nM-\u000fxTM_<>\u00117*,V<A~j\u0010^h\t\u0014u\u0014\u0006Ay|\u001d<}jyf3\u0004(tJkk\u0005j;\u0019$e\f\u0019?{hmdtb\u0005ba\u0018\u0017+\u000f\u0018vO;_(DL:Frf65.\u0012K\r)\u0002\u007f\u0002\u001d0X;\"M\t\u000e'\u0011R\nT\u0003s?WGN3\u0011\u001c$\u0006l\u0011=\\A\u001an+]UR8V\"\u0005_K#L3sn\u0019\"gJ\"B99,\r0@ Y0\u001a\u0006\"\u0019\u0005=a<]\rju\u0013~FTpN_d\u0002WO\tx4o\r1\u0006]*N5*~+bYB?\u000fIf&\u0005en?H5\u0018\f;,@jp\u000bG/E_,3)\u0013\u0006\u0002]?f\n<P.\u0005\u000e'Qp\u0010]\\\u001aKcl&B\u0002\u000b\u000734G\fJ_er}}}|!^s6P\u001d[\u001b1\u0003]Q$R](e/\bOI<\"\b\u001fKe\u00050_vWq\u000bz`w2lf\\K\u001dA\u0006]pP$\u0005In\\Nb&y#Kn\u0010$.hIB-TM&\u001b}0F\u001b~`c^Qq[gR\u0016\u0001HXE!-PPvT\u0017}2ya\u0003\f(l\bzHr,N\u000e?J^}]lf$aR+0gN%8x)\u001eP]n\u000bun'{Yi\u0007\"z\u0006P/\u0001mj\u0013~>xLb@gd\u00147!e;L}\u0013,f?8e\u0001]\u0006\u000f4vicF+\u0015X)b\tAg)g\u000ev-,B'<_\u0012\\p\\[T\u001c\r7ts", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W*\u0002!>G\r4>mk\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\RukR\u0006L]|V\u001bJ-\u001a\u0001dD\u0012}X>\u001f]\u0013E\u000b:u\u000b\u0010\u0015!~hzJa\u001aUy^\u0006ErwFlnC2HAq+n\u0019g\f\\MI\u0012#\u0006 \u001b>\u0014\u001f", "5dc\u000e_7AO", "u(5", "5dc\u000fT*DU&\t\u000bg+DS.7y\u000e\u00010", "u(9", "5dc\u000fT:>Z\u001d\bzL/\u0001\n>-O\u0016i@s{a", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i\u0014i$.TGDk\"!\u0019ip\u000f", "5dc\u000fe<LV", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#Z-G{\u0019\u0004", "5dc\u0010b3H``Iy0&b\u000e\u001f", "2d_?X*:b\u0019}t[6\u0010\r8gy+\u0010K\u0004\u0017 U", "5dc\u0015l7AS\"\rB>(j\u001c\u0013n\u000efwI\n!&C~\u0012F\u007f3", "u(E", "5dc\u0015l7AS\"\rB>(j\u001c\u0013n\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i\u001a\u0002!1MLIA", "2d_?X*:b\u0019}t[6\u0010\r8gy/\u007fI\u0001s$Gk\u0014", "5dc\u0019\\5>0&~vdsc\u000b\rV\u007f=\u0006~|  Q~\nKz/>g", "5dc\u0019\\5>0&~vdsc\u000b\rV\u007f=\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i\u001eq\u001f.*P;g:s", "2d_?X*:b\u0019}t[6\u0010\r8gy7{S\u0010r\u001eKq\u0017", "5dc!X?M/ \u0003|gsy\u0019\u000b5Ltk~|  Q~\nKz/>g", "5dc!X?M/ \u0003|gsy\u0019\u000b5Ltk", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=)J?m=s", "2d_?X*:b\u0019}t[6\u0010\r8gy7{S\u0010u\u001bTo\fKz/>", "5dc!X?M2\u001d\fz\\;\u0001\u00138-\b0\fFL&!\u0006k\u0017E\u000141h\u0002*@{", "5dc!X?M2\u001d\fz\\;\u0001\u00138-\b0\fFL&!", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=,GHk2-\u0019rj\u000f", "5dc\u0011e(PA(\u0013\u0002^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#|-3\u007f$,WN;5\u0013+\u0011zOH\u001bj,$", "5dc\u0013b5M4\u0015\u0007~e@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u000fIK?rHs", "5dc\u0013b5M4\u0019z\nn9|v/t\u000f,\u0005B\u000f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0013b5MA\u001d\u0014z&\u001fjd\u0013It\b", "5dc\u0013b5MA(\u0013\u0002^sKo<2[y\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u001c\\WBk\n", "5dc\u0013b5MA-\b\na,\u000b\r=-t\u0014]%\u0006\b!", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u001caLJn4,\u0019v7", "5dc\u0013b5ME\u0019\u0003|a;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCs", "5dc\u0015l7AS\"\rBo4y}.UR", "u(8", "5dc\u0019X;MS&l\u0006Z*\u0001\u00121-r\u0016W$d\fv", "5dc\u0019\\5>0&~vds\nd\u00113nt\u0002", "5dc\u0019\\5>6\u0019\u0003|a;D{\u001dAc\fp ", "5dc\u0019\\5>6\u0019\u0003|a;j\u0018Cl\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i\u001eq\u001f.0C?m7-\u0003wu@\u00079", "5dc\u0019b*:Z\u0019e~l;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.D`G\u0007Ak\u00125M*?yCs", "5dc\u001dT9:U&z\u0006a\u001a\f\u001d6e>8\u007f:\u0010\u0017*Vi\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006a!BU\u007f-3x\u0019\u001c\\WBk\n", "5dc\u001d_(MT#\f\u0003L;\u0011\u0010/", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006a,1h~*Du\u0005.`R)zH%\u0015>", "5dc [(=]+", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3l @#", "5dc c(GA(\u0013\u0002^j\r\r)t\u007f;\u000b:\u000e\u0017\u001eGk\u001c<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006d01bk/Kt\u0016\u0004", "5dc!X?M/ \u0003|gs|S\u0016S\u0006\u000e\u0002", "5dc!X?M2\u0019|\u0005k(\f\r9n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=,C9uA\u001a$lkB\\", "5dc!X?M2\u001d\fz\\;\u0001\u00138-\u000e\"M3H\u0015!", "5dc!X?M5\u0019\t\u0003^;\n\r-T\r$\u0005N\u0002!$O", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=/CEs4-\"l_(\u0014_5\\w1TT$", "5dc!X?M7\"}zg;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=1L:k=-j", "5dc!X?M;#\u000e~h5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=5MJo>'j", "1n_F", "1n_F \u0015L%f\u0006Nl", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f2*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001c\u0002='!$\u000fX4\u001cN:K-}67#\n/XW\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArxJ#nyZP\u000fc4m\u001b)}fCI\u0012#\u0006 \u001b>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7kJ\u000f~UO\u0004p U\u0005\u0007[\u0013b}:bA\rC-6r\tY=~:gw\"6`@:o4F\u001bJUqu6N\u00122.a\u001b\u001d,6;\"t/DR\u0018\u0016>\u0013c9hsV\u001eW\u0002OE9\u001c#O\u0001\fI\t\"\r\u0010&CJ0?$S\u000e$tC5)\u000f\r\u000bq\"*._M]Xw*rF\u0017!\u0018|?\fE6?#pO\u0014vK`^[p3\f_\rR @U@ue\rm\u001a\u001e?\u000b\u0019~f\u0004m\f\t6&4nKhLi`xygf1zgB$\u001f<>\u0006P/{Z\u00015\u0016\b\u001bpR{YG7\u000f=EH}k:mS\u0010FhRY<Q^>`\b%\f_|DQ8t\n\u0002'\u007f\u0013\u000304\u0005\u001d\u0004N\u00178e\u0019\u0016\u000en0x\u0019\u000b`Y [\u00138XLc\r[B\u0014Y0U|\u001cLJ\u0018CM]'v\u001d=\u0015yc\n<a\r`_Cy.+E\u0011\u0019QN\u0011'P%i\u0016C\bp\u00181nM-\u000fxTM_<>\u00117*,V<A~j\u0010^h\t\u0014u\u0014\u0006Ay|\u001d<}jyf3\u0004(tJkk\u0005j;\u0019$e\f\u0019?{hmdtb\u0005ba\u0018\u0017+\u000f\u0015^+#N'?Z1\u0001sow(.\fVM'}\u007f\u0003!fXq'M>\u00156[j\n\u000bb\u0018Kb)N\\*)*\\F\u0003B\\;Zt h\u0014F4^c~i\u0002]\\$.4\u000b&b\r\r\u007fFH\u001a\b^D\u0002YE\u001ao'$6XP'P\u0017\\x\u0019\u00042\u001e<Baa\u0003S]?2@*G@rao\n4%\f2\u00194)0\te@'\t^bxOH#\u0014.w OD=R$J^&$<\u0013s\b\u001c;p\u0005-PS\u0002['Py\u0012\u001f{)L[~`\u001dz\u001e@4BM\u0011G^77Q0\tq&]m'c\u001dI!o~gL\u0015R_\u001d\u001b7\b\u0019q\u0002\b\bOZO\u0012AW\t\u001e", "1n_F (\"@\u001bR\u0007-", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f2*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001c\u0002='!$\u000fX4\u001cN:K-}67#\n/XW\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArxJ#nyZP\u000fc4m\u001b)}fCI\u0012#\u0006 \u001b>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7kJ\u000f~UO\u0004p U\u0005\u0007[\u0013b}:bA\rC-6r\tY=~:gw\"6`@:o4F\u001bJUqu6N\u00122.a\u001b\u001d,6;\"t/DR\u0018\u0016>\u0013c9hsV\u001eW\u0002OE9\u001c#O\u0001\fI\t\"\r\u0010&CJ0?$S\u000e$tC5)\u000f\r\u000bq\"*._M]Xw*rF\u0017!\u0018|?\fE6?#pO\u0014vK`^[p3\f_\rR @U@ue\rm\u001a\u001e?\u000b\u0019~f\u0004m\f\t6&4nKhLi`xygf1zgB$\u001f<>\u0006P/{Z\u00015\u0016\b\u001bpR{YG7\u000f=EH}k:mS\u0010FhRY<Q^>`\b%\f_|DQ8t\n\u0002'\u007f\u0013\u000304\u0005\u001d\u0004N\u00178e\u0019\u0016\u000en0x\u0019\u000b`Y [\u00138XLc\r[B\u0014Y0U|\u001cLJ\u0018CM]'v\u001d=\u0015yc\n<a\r`_Cy.+E\u0011\u0019QN\u0011'P%i\u0016C\bp\u00181nM-\u000fxTM_<>\u00117*,V<A~j\u0010^h\t\u0014u\u0014\u0006Ay|\u001d<}jyf3\u0004(tJkk\u0005j;\u0019$e\f\u0019?{hmdtb\u0005ba\u0018\u0017+\u000f\u0018vO;_(DL:Frf65.\u0012K\r)\u0002\u007f\u0002\u001d0X;\"M\t\u000e'\u0011R\nT\u0003s?WGN3\u0011\u001c$\u0006l\u0011=\\A\u001an+]UR8V\"\u0005_K#L3sn\u0019\"gJ\"B99,\r0@ Y0\u001a\u0006\"\u0019\u0005=a<]\rju\u0013~FTpN_d\u0002WO\tx4o\r1\u0006]*N5*~+bYB?\u000fIf&\u0005en?H5\u0018\f;,@jp\u000bG/E_,3)\u0013\u0006\u0002]?f\n<P.\u0005\u000e'Qp\u0010]\\\u001aKcl&B\u0002\u000b\u000734G\fJ_er}}}|!^s6P\u001d[\u001b1\u0003]Q$R](e/\bOI<\"\b\u001fKe\u00050_vWq\u000bz`w2lf\\K\u001dA\u0006]pP$\u0005In\\Nb&y#Kn\u0010$.hIB-TM&\u001b}0F\u001b~`c^Qq[gR\u0016\u0001HXE!-PPvT\u0017}2ya\u0003\f(l\bzHr,N\u000e?J^}]lf$aR+0gN%8x)\u001eP]n\u000bun'{Yi\u0007\"z\u0006P/\u0001mj\u0013~>xLb@gd\u00147!B\u001c>w\u000b5gy2gB\u0012\f\u000e0\u0001jZ\u00144OC8a @*\t\n\u0017|\r,I\u001e>&", "1n_F 7\n3(\u0012Z`", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|Rxc^\u001e\u0017wZ=$\u0018:\"42(~_Pu5aa`\u001cn;*\u00039DVr!\u001bV~\u001c>\u00010hZ1k\u0001)G\u00166SG+9:w$\u0019v0\u0001\u0004f\u000b\u0010t(1\u000eU [\u001d@V6R[X7)1\u000eOB,G4|%(S\u007f\u0014\b\u0005\u000bpVc\u001dP=\u0003?OTFg7(\n\u0007r\u0016'lBWpv<FQ)cbxZ\u0015]J*l0\u0015!S\r2|\u0014H\u0019\u0011`\u0006!hF\u0012\u0002av3az#T\u0012_n\u001emB\u001fyD-=[0KHg=0\u00020\u0006\u0018^J.!\u00029\u00194R0It]:\u0014&mxu@\u000fV\u001d\"OzEKX)G]wh\u0010E~|!:ju@PA\b\u001a#Zt\u0003\u001f}\u001e\u0002c~*=Dy1_G,\u001cQ\\aI", "1n_F =\u000b`'\t\u0005p", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|Rxc^\u001e\u0017wZ=$\u0018:\"42(~_Pu5aa`\u001cn;*\u00039DY\u000bE3g\u007f!0\nugQox\u0001/<U8WG*5\u0004wm\u0014vzyt\u001cr\u0010>H\r\u0002J>[s'I0{\u0002f2)7MIM!\t@\u0001\u001dfYu]Mt\u001a6\u0011q\u0019Uz\u0018\u0002BEXl\t$(\u0007]\u0016=g7&U\bQSG7`\\snK\u0012V(o/\u0019\u0013\u001dS&BY9,\r\u001bJ\"m9\u000bK\u0007\u0010Bg^IS\u000efzdf/\u0014qQa]v\\\u0019=r81\b?r\u0018pDo%w>(4-3{t^1\u0012dNitH|\u001cB)<AD=R$J^&$<\u0013s\b\u001c;p\u0005-PS\u0002['Py\u0012\u001f{)L[~`\u0015~\u00141/8B\u000f@dO\u0003~;\u007fH\u007fOr']]O\u0016z=[H\u001d\u0014Y'Qq\u0018\n,G\u0019\u001bK\u0015o\u0012AW\t\u0012D\b\u0004\u000bmCccU\u0017\u007f>{\u0013\u007fP xR*Z\u000fZ-:\"K%\u0011^ih5N<Tt1&\u0005S\u0003}\u0017e\u0011w^v2AD\u001b\u0001B\u0019K\u00168\u000fDr\\Xw<0\u001c\u0013|b2y~C5:\u0014?2?%lTq %oX0-f i\f+4\u0013U\\h{\tn\u0015\u0002\u0018e\u0011\u001dk\u0006R$6uj\\\u001f\bT=\u000eEFo\u001e5KT", "1n_F \u000f%#\u0015\u0010yR", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|RxpQ5\u001b>dN*U;^' -\u00101Lym\f*K\u0006\n+#\u0006=m\u0006X:>b\u0001'?vuyK1|v4KU6b\u0012\"5:W$\u0019vEv\u0002R\u0002\u001f/C:P+#N'?Z1\u0001sow(.\fVM'}\u007f\u0003!fXq'M>\u00156[j\n\u000bb\u0018Kb)N\\*)*\\#m5f-]z%T]\u0012(``\u007fe\u0010\u0014\u00160hn\u001a\u0013fRkgJL(k`P\u001aY\b", "1n_F \u0015(Oymjh", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|RxpQ5\u001b>dN*U;^' -\u00101Lym\f*K\u0006\n+#\u0006=m\u0006X:>b\u0001'?vuyK1|v4KU6b\u0012\"5:W$\u0019vEv\u0002R\u0002\u001f/C:P+#N'?Z1\u0001sow(.\fVM'}\u007f\u0003!fXq'M>\u00156[j\n\u000bb\u0018Kb)N\\*)*\\F\u0003B\\;Zt h\u0014F4^c~i\u0002]\\$.4\u000b&b\r\r\u007fFH\u001a\b^D\u0002YE\u001ao'$6XP'P\u0017\\x\u0019\u00042\u001e<Baa\u0003S]?2@*G@rao\n4%\f2\u00194)0\te@'\t^bxOH#\u0014.w\u007fRYJH2GX!8rG\u007f\u0006\u001f:tvv\u0017GG!\u0018cuLDm-GB\u000e+5z`", "1n_F \n1D\u0005|J)", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|RxpQ5\u001b>dN*U;^' -\u00101Lym\f*K\u0006\n+#\u0006=m\u0006X:>b\u0001'?vuyK1|v4KU6b\u0012\"5:W$\u0019vEv\u0002R\u0002\u001f/C:P+#N'?Z1\u0001sow(.\fVM'}\u007f\u0003!fXq'M>\u00156[j\n\u000bb\u0018Kb)N\\*)*\\F\u0003B\\;Zt h\u0014F4^c~i\u0002]\\$.4\u000b&b\r\r\u007fFH\u001a\b^D\u0002YE\u001ao'$6XP'P\u0017\\x\u0019\u00042\u001e<Baa\u0003S]?2@*G@rao\n4%\f2\u00194)0\te@'\t^bxOH#\u0014.w#gf@V/AS5n'S}\t\u001e>f@=\u000b\r\r\u0012+_0\u0011d\u0002!8\u001ee\u001b7zg>L4Db$Qjrw>\u0004q,\u001dg2X^U%g=mB^\u0018O,`q\u0016\u0015v?\u0019Q\u001f_l\u0006-Y\u0017\u001e!jv\u0014\u0010CmkNTb@|\u001c}P*y\tp`Na\"C#\u0015J\u0001m/GDO4\u000b<", "3pd._:", "", "=sW2e", "6`b T4>2&z\r:-}\t-t\u00041}\u001c\u0010&$Kl\u001eKv3", "6`b T4>:\u0015\u0013\u0005n;X\n0e}7\u007fI\u0003r&V|\u00129\u000745g", "6`b566=S", "", "6`b566=S\u007fz\u000fh<\fd0f\u007f&\u000bD\n\u0019rV~\u001b@s5DY\f", "6`b566=S\u007fz\u000fh<\fd0f\u007f&\u000bD\n\u0019rV~\u001b@s5DY\f^Gq\u0010=MVJeA\u001e\u001ch]G\u0007", ";da4X", ";da4Xs=/j\u0010\u000e)6", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|Rxc^\u001e\u0017wZ=$\u0018:\"42(~_Pu5aa`\u001cn;*\u00039DVr!\u001bV~\u001c>\u00010hZ1k\u0001)G\u00166SG+9:w$\u0019v0\u0001\u0004f\u000b\u0010t(1\u000eU [\u001d@V6R[X7)1\u000eOB,G4|%(S\u007f\u0014\b\u0005\u000bpVc\u001dP=&GgLE'\u0011$$\u0007B\u0007=_1_^0iQH\u007f:<[W\u000b\u0013Y*h$\u001e\\QM*\u0004TG\u0019Ga@\\h2\u001e\u0011az6T\nA^\u001beZ\u000f\u0013Bx\u0002X^YM0KHg=0\u00020\u0006\u0018^J.!\u00029\u00194R0It]:\u0014&mxu@\u000fV\u001d\"OzEKX)G]wh\u0010E~|!:ju@PA\b\u001a#Zt\u0003\u001f}\u001e\u0002c~*=Dy1_G,\u001cQ\\aI", ";da4Xs3\u001fz\fzd\u0010", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ6\u0004 .K\u0016\u0005\u001b\u001a\u0005)M&e$yA|Rxc^\u001e\u0017wZ=$\u0018:\"42(~_Pu5aa`\u001cn;*\u00039DY\u000bE3g\u007f!0\nugQox\u0001/<U8WG*5\u0004wm\u0014vzyt\u001cr\u0010>H\r\u0002J>[s'I0{\u0002f2)7MIM!\t@\u0001\u001dfYu]Mt\u001a6\u0011q\u0019Uz\u0018\u0002BEXl\t$(\u0007]\u0016=g7&U\bQSG7`\\snK\u0012V(o/\u0019\u0013\u001dS&BY9,\r\u001bJ\"m9\u000bK\u0007\u0010Bg^IS\u000efzdf/\u0014qQa]v\\\u0019=r81\b?r\u0018pDo%w>(4P;\u0014l]pk`hiD9\u0013\u000f11*zqHIz$P+$6Sy|'yd\u00015\u0012M\f\u0012a`jLdm-G\u001e\r&B\u0002\u000bz3<G\r\u001abaop\nfn\"Rv2TR^`e}eI\u001f\u0017Oba,Q\u0015bK(QJZu\n-\u001ak\\h\u0007z\u0014\u001f\fJcX@&Lv\u0013\u0006\u0010\u001a\u0004Gkf\u0013Rk@\u0018\u0015j\u0001m/# B)\u001ag,\u001f\u0006B9.\u0012H\u001d\f\\h2AD\u001b\u0001B\u0019K\u00168\u000fDr\\Xw<0\u001c\u0013|b2y~C5:\u0014?2?%lTq %oX0-f i\f+4\u0013U\\h{\tn\u0015\u0002\u0018e\u0011\u001dk\u0006R$6uj\\\u001f\bT=\u000eEFo\u001e5KT", ">kd@", "Bn?.e(@`\u0015\n}L;\u0011\u0010/", "BnB=T5,b-\u0006z", "BnBAe0GU", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, ViewCompat.MEASURED_SIZE_MASK, (DefaultConstructorMarker) null);
    private final ParagraphStyle paragraphStyle;
    private final PlatformTextStyle platformStyle;
    private final SpanStyle spanStyle;

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, drawStyle, i2, i3, j6, textIndent, platformTextStyle, lineHeightStyle, i4, i5, textMotion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017K\u0014Id\t.c]\u0007+\n^(@`qO\u001d6\u0017{Kf~G\u0003*bu/k(ZyNY]jEK]'?*j-\u0006+_V\u0007%29* +\u001dV yH\u000b\u0002\u001a;v\bT\f\u0001?4\r|S[~{O2g\u0019l\u007fCX*\u0002;!\b'\u0004\u0014+\u000f-\u001a\u000e:f\u0017$l}'q\u007f\u00189FzkpPp\u001d\u000fG7\u0006dcB&\u0013\u0019\u0016Dg\u007f'V\u0017n\u0012$4\u007fw\u0011\\\u0002\nI]9{zqWdt3\u001e\u0002(\r|\u001dmv]pAvpZ(HhU\u001e(g\ruQCKW2Ta'\u001bS!B\r\"\u000elpuyvc{'7X8Sk?= D58\u0004\u0005\r4\n\u0005*uDT\u0019\u001eTe\u0014w?1\u0015\u0007\r'&\u000fS _@\r(_r xo'\u0017Mc~B5Y:JoC{")
    @InterfaceC1492Gx
    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, drawStyle, textAlign, textDirection, j6, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017K\u0014Id\t.c]\u0007+\n^(@`qO\u001d6\u0017{Kf~G\u0003*R\u0004ctw`$VNgmxT#Jy%jM{.]\bKfP5\u001f\u0011[\u0019V.6@\u000b}\u0011/+!c\u0012hl6\u0011\u000bVO@\rFm,6c\u0002@V\u001d\u0003\u0001$Ca4\u001c+\u007f.\u001aJNe\u0017_3F<%\t\u001c=\u0001Nj^M=!\u000f<A|8tE-\u0003\u0019\u0013A2")
    @InterfaceC1492Gx
    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, textAlign, textDirection, j6, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017K\u0014Id\t.c]\u0007+\n^(@`qO\u001d6\u0017{Kf~G\u0003*R\u0004ctw`$VNgmxT#Jy%jM{.]\bKfP5\u001f\u0011[\u0019V.6@\u000b}\u0011/#%Y\u0003cb+\u000f\u0004\\\u0003S\u0014M3sp?xIX}\u0001\u0001!\u0001m\u0004w?\u000f#\u001a\u0019L\u0012\u00132$};j\u000b)+D<jbO~[?E7o8er-\u0013\nCClpWR\\nI26{:\tY<yS,<\u000fz\u0006Mso@Y")
    @InterfaceC1492Gx
    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, textAlign, textDirection, j6, textIndent, platformTextStyle, lineHeightStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017K\u0014Id\t.c]\u0007+\n^(@`qO\u001d6\u0017{Kf~G\u0003*R\u0004ctw`$VNgmxT#Jy%jM{.]\bKfP5\u001f\u0011[\u0019V.6@\u000b}\u0011/#%Y\u0003cb+\u000f\u0004\\\u0003S\u0014M3sp?xIX}\u0001\u0001!\u0001m\u0004w?\u000f#\u001a\u0019L\u0012\u00132$};j\u000b)+D<jbO~[?E7o8er-\u0013\nCClpWR\\nI26{:\tY<yS,<\u000fz\u0006Mso@Y")
    @InterfaceC1492Gx
    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, textAlign, textDirection, j6, textIndent);
    }

    public /* synthetic */ TextStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, i2, i3, j5, textIndent, platformTextStyle, lineHeightStyle, i4, i5, textMotion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017K\u0014Id\t.c]\u0007+\n^(@`qO\u001d6\u0017{Kf~G\u0003*bu/k(ZyNY]jEK]'?*j-\u0006+_V\u0007%29* +\u001dV yH\u000b\u0002\u001a;v\bT\f\u0001?4\r|S[~{O2g\u0019l\u007fCX*\u0002;!\b'\u0004\u0014+\u000f-\u001a\u000e:f\u0017$l}'q\u007f\u00189FzkpPp\u001d\u000fG7\u0006dcB&\u0013\u0019\u0016Dg\u007f'V\u0017n\u0012$4\u007fw\u0011\\\u0002\nI]9{zqWdt3\u001e\u0002(\r|\u001dmv]pAvpZ(HhU\u001e(g\ruQCKW2Ta'\u001bS!B\r\"\u000elpuyvc{'7X8Sk?= D58\u0004\u0005\r4\n\u0005*uDT\u0019\u001eTe\u0014w?1\u0015\u0007\r'&\u000fS _@\r(_r xo'\u0017Mc~B5Y:JoC{")
    @InterfaceC1492Gx
    public /* synthetic */ TextStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u000eK\fI1z$i\u0018I)}[,-``_H*\u0014u\u001cS\u000bOpsZ}8\u007f6")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getHyphens-EaSxIns$annotations */
    public static /* synthetic */ void m6138getHyphensEaSxIns$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u000eK\fI1z$i\u0018I)}[,-``_H*\u0014u\u001cS\u000bOpsZ}8\u007f6")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getLineBreak-LgCVezo$annotations */
    public static /* synthetic */ void m6139getLineBreakLgCVezo$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u000eK\fI1z$i\u0018I)}[,-``_H*\u0014u\u001cS\u000bOpsZ}8\u007f6")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getTextAlign-buA522U$annotations */
    public static /* synthetic */ void m6140getTextAlignbuA522U$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u000eK\fI1z$i\u0018I)}[,-``_H*\u0014u\u001cS\u000bOpsZ}8\u007f6")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getTextDirection-mmuk1to$annotations */
    public static /* synthetic */ void m6141getTextDirectionmmuk1to$annotations() {
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(spanStyle, paragraphStyle, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : platformTextStyle);
    }

    public final SpanStyle getSpanStyle$ui_text_release() {
        return this.spanStyle;
    }

    public final ParagraphStyle getParagraphStyle$ui_text_release() {
        return this.paragraphStyle;
    }

    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j2, (i2 + 2) - (i2 | 2) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (i2 + 4) - (i2 | 4) != 0 ? null : fontWeight, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : fontStyle, (i2 & 16) != 0 ? null : fontSynthesis, (i2 + 32) - (i2 | 32) != 0 ? null : fontFamily, (i2 + 64) - (i2 | 64) != 0 ? null : str, (i2 + 128) - (i2 | 128) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j4, (i2 & 256) != 0 ? null : baselineShift, (i2 + 512) - (i2 | 512) != 0 ? null : textGeometricTransform, (-1) - (((-1) - i2) | ((-1) - 1024)) != 0 ? null : localeList, (-1) - (((-1) - i2) | ((-1) - 2048)) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j5, (i2 & 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (i2 & 16384) != 0 ? null : textAlign, (-1) - (((-1) - i2) | ((-1) - 32768)) != 0 ? null : textDirection, (i2 & 65536) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j6, (i2 + 131072) - (i2 | 131072) != 0 ? null : textIndent, null);
    }

    private TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent) {
        this(new SpanStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j6, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null), null);
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j2, (i2 & 2) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : fontWeight, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : fontStyle, (i2 + 16) - (i2 | 16) != 0 ? null : fontSynthesis, (i2 & 32) != 0 ? null : fontFamily, (i2 + 64) - (i2 | 64) != 0 ? null : str, (-1) - (((-1) - i2) | ((-1) - 128)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j4, (-1) - (((-1) - i2) | ((-1) - 256)) != 0 ? null : baselineShift, (i2 + 512) - (i2 | 512) != 0 ? null : textGeometricTransform, (-1) - (((-1) - i2) | ((-1) - 1024)) != 0 ? null : localeList, (i2 & 2048) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j5, (i2 & 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (-1) - (((-1) - i2) | ((-1) - 16384)) != 0 ? null : textAlign, (-1) - (((-1) - i2) | ((-1) - 32768)) != 0 ? null : textDirection, (-1) - (((-1) - i2) | ((-1) - 65536)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j6, (i2 + 131072) - (i2 | 131072) != 0 ? null : textIndent, (i2 + 262144) - (i2 | 262144) != 0 ? null : platformTextStyle, (-1) - (((-1) - i2) | ((-1) - 524288)) != 0 ? null : lineHeightStyle, null);
    }

    private TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j2, (i2 + 2) - (i2 | 2) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (i2 + 4) - (i2 | 4) != 0 ? null : fontWeight, (i2 & 8) != 0 ? null : fontStyle, (i2 + 16) - (i2 | 16) != 0 ? null : fontSynthesis, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? null : fontFamily, (i2 & 64) != 0 ? null : str, (i2 + 128) - (i2 | 128) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j4, (i2 & 256) != 0 ? null : baselineShift, (-1) - (((-1) - i2) | ((-1) - 512)) != 0 ? null : textGeometricTransform, (i2 + 1024) - (i2 | 1024) != 0 ? null : localeList, (-1) - (((-1) - i2) | ((-1) - 2048)) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j5, (i2 + 4096) - (i2 | 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (i2 + 16384) - (i2 | 16384) != 0 ? null : textAlign, (-1) - (((-1) - i2) | ((-1) - 32768)) != 0 ? null : textDirection, (i2 & 65536) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j6, (i2 + 131072) - (i2 | 131072) != 0 ? null : textIndent, (i2 & 262144) != 0 ? null : platformTextStyle, (-1) - (((-1) - i2) | ((-1) - 524288)) != 0 ? null : lineHeightStyle, (i2 + 1048576) - (i2 | 1048576) != 0 ? null : lineBreak, (-1) - (((-1) - i2) | ((-1) - 2097152)) != 0 ? null : hyphens, null);
    }

    private TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(new SpanStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, 32768, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m6452unboximpl() : LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m6436unboximpl() : Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), (TextMotion) null, 256, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j2, (i2 + 2) - (i2 | 2) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : fontWeight, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : fontStyle, (i2 & 16) != 0 ? null : fontSynthesis, (i2 & 32) != 0 ? null : fontFamily, (i2 & 64) != 0 ? null : str, (-1) - (((-1) - i2) | ((-1) - 128)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j4, (i2 & 256) != 0 ? null : baselineShift, (i2 & 512) != 0 ? null : textGeometricTransform, (i2 & 1024) != 0 ? null : localeList, (-1) - (((-1) - i2) | ((-1) - 2048)) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j5, (-1) - (((-1) - i2) | ((-1) - 4096)) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (i2 + 16384) - (i2 | 16384) != 0 ? null : drawStyle, (i2 + 32768) - (i2 | 32768) != 0 ? null : textAlign, (i2 + 65536) - (i2 | 65536) != 0 ? null : textDirection, (i2 & 131072) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j6, (i2 + 262144) - (i2 | 262144) != 0 ? null : textIndent, (i2 & 524288) != 0 ? null : platformTextStyle, (i2 + 1048576) - (i2 | 1048576) != 0 ? null : lineHeightStyle, (i2 + 2097152) - (i2 | 2097152) != 0 ? null : lineBreak, (i2 & 4194304) != 0 ? null : hyphens, (-1) - (((-1) - i2) | ((-1) - 8388608)) != 0 ? null : textMotion, (DefaultConstructorMarker) null);
    }

    private TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m6452unboximpl() : LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m6436unboximpl() : Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i6) | ((-1) - 1)) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j2, (-1) - (((-1) - i6) | ((-1) - 2)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (-1) - (((-1) - i6) | ((-1) - 4)) != 0 ? null : fontWeight, (i6 & 8) != 0 ? null : fontStyle, (i6 + 16) - (i6 | 16) != 0 ? null : fontSynthesis, (i6 + 32) - (i6 | 32) != 0 ? null : fontFamily, (i6 + 64) - (i6 | 64) != 0 ? null : str, (i6 + 128) - (i6 | 128) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j4, (i6 & 256) != 0 ? null : baselineShift, (i6 + 512) - (i6 | 512) != 0 ? null : textGeometricTransform, (-1) - (((-1) - i6) | ((-1) - 1024)) != 0 ? null : localeList, (i6 & 2048) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j5, (i6 + 4096) - (i6 | 4096) != 0 ? null : textDecoration, (i6 + 8192) - (i6 | 8192) != 0 ? null : shadow, (i6 + 16384) - (i6 | 16384) != 0 ? null : drawStyle, (i6 & 32768) != 0 ? TextAlign.Companion.m6533getUnspecifiede0LSkKk() : i2, (i6 & 65536) != 0 ? TextDirection.Companion.m6546getUnspecifieds_7Xco() : i3, (-1) - (((-1) - i6) | ((-1) - 131072)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j6, (-1) - (((-1) - i6) | ((-1) - 262144)) != 0 ? null : textIndent, (i6 + 524288) - (i6 | 524288) != 0 ? null : platformTextStyle, (i6 & 1048576) != 0 ? null : lineHeightStyle, (-1) - (((-1) - i6) | ((-1) - 2097152)) != 0 ? LineBreak.Companion.m6460getUnspecifiedrAG3T2k() : i4, (-1) - (((-1) - i6) | ((-1) - 4194304)) != 0 ? Hyphens.Companion.m6439getUnspecifiedvmbZdU8() : i5, (i6 + 8388608) - (i6 | 8388608) != 0 ? null : textMotion, (DefaultConstructorMarker) null);
    }

    private TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        this(new SpanStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(i2, i3, j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i4, i5, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i6 + 2) - (i6 | 2) != 0 ? Float.NaN : f2, (i6 + 4) - (i6 | 4) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j2, (-1) - (((-1) - i6) | ((-1) - 8)) != 0 ? null : fontWeight, (i6 + 16) - (i6 | 16) != 0 ? null : fontStyle, (-1) - (((-1) - i6) | ((-1) - 32)) != 0 ? null : fontSynthesis, (-1) - (((-1) - i6) | ((-1) - 64)) != 0 ? null : fontFamily, (i6 & 128) != 0 ? null : str, (i6 & 256) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (i6 & 512) != 0 ? null : baselineShift, (i6 & 1024) != 0 ? null : textGeometricTransform, (i6 & 2048) != 0 ? null : localeList, (i6 & 4096) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j4, (i6 & 8192) != 0 ? null : textDecoration, (i6 + 16384) - (i6 | 16384) != 0 ? null : shadow, (32768 + i6) - (32768 | i6) != 0 ? null : drawStyle, (-1) - (((-1) - 65536) | ((-1) - i6)) != 0 ? TextAlign.Companion.m6533getUnspecifiede0LSkKk() : i2, (131072 + i6) - (131072 | i6) != 0 ? TextDirection.Companion.m6546getUnspecifieds_7Xco() : i3, (-1) - (((-1) - 262144) | ((-1) - i6)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j5, (524288 + i6) - (524288 | i6) != 0 ? null : textIndent, (-1) - (((-1) - 1048576) | ((-1) - i6)) != 0 ? null : platformTextStyle, (-1) - (((-1) - 2097152) | ((-1) - i6)) != 0 ? null : lineHeightStyle, (4194304 + i6) - (4194304 | i6) != 0 ? LineBreak.Companion.m6460getUnspecifiedrAG3T2k() : i4, (8388608 & i6) != 0 ? Hyphens.Companion.m6439getUnspecifiedvmbZdU8() : i5, (i6 + 16777216) - (i6 | 16777216) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    private TextStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        this(new SpanStyle(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(i2, i3, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i4, i5, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i2 & 2) != 0 ? Float.NaN : f2, (i2 & 4) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j2, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : fontWeight, (i2 + 16) - (i2 | 16) != 0 ? null : fontStyle, (i2 & 32) != 0 ? null : fontSynthesis, (i2 & 64) != 0 ? null : fontFamily, (-1) - (((-1) - i2) | ((-1) - 128)) != 0 ? null : str, (i2 + 256) - (i2 | 256) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (i2 & 512) != 0 ? null : baselineShift, (-1) - (((-1) - i2) | ((-1) - 1024)) != 0 ? null : textGeometricTransform, (i2 & 2048) != 0 ? null : localeList, (-1) - (((-1) - i2) | ((-1) - 4096)) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j4, (i2 + 8192) - (i2 | 8192) != 0 ? null : textDecoration, (i2 + 16384) - (i2 | 16384) != 0 ? null : shadow, (32768 & i2) != 0 ? null : drawStyle, (-1) - (((-1) - 65536) | ((-1) - i2)) != 0 ? null : textAlign, (131072 & i2) != 0 ? null : textDirection, (262144 + i2) - (262144 | i2) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j5, (-1) - (((-1) - 524288) | ((-1) - i2)) != 0 ? null : textIndent, (1048576 & i2) != 0 ? null : platformTextStyle, (2097152 + i2) - (2097152 | i2) != 0 ? null : lineHeightStyle, (4194304 & i2) != 0 ? null : lineBreak, (8388608 & i2) != 0 ? null : hyphens, (i2 + 16777216) - (i2 | 16777216) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    private TextStyle(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m6452unboximpl() : LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m6436unboximpl() : Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    public final TextStyle merge(TextStyle textStyle) {
        return (textStyle == null || Intrinsics.areEqual(textStyle, Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    /* JADX INFO: renamed from: merge-dA7vx0o$default */
    public static /* synthetic */ TextStyle m6143mergedA7vx0o$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, LineHeightStyle lineHeightStyle, int i4, int i5, PlatformTextStyle platformTextStyle, TextMotion textMotion, int i6, Object obj) {
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            j2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            j3 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
        }
        if ((i6 + 4) - (i6 | 4) != 0) {
            fontWeight = null;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 8)) != 0) {
            fontStyle = null;
        }
        if ((i6 & 16) != 0) {
            fontSynthesis = null;
        }
        if ((i6 + 32) - (i6 | 32) != 0) {
            fontFamily = null;
        }
        if ((i6 + 64) - (i6 | 64) != 0) {
            str = null;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 128)) != 0) {
            j4 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
        }
        if ((i6 + 256) - (i6 | 256) != 0) {
            baselineShift = null;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 512)) != 0) {
            textGeometricTransform = null;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 1024)) != 0) {
            localeList = null;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2048)) != 0) {
            j5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i6 + 4096) - (i6 | 4096) != 0) {
            textDecoration = null;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 8192)) != 0) {
            shadow = null;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 16384)) != 0) {
            drawStyle = null;
        }
        if ((i6 & 32768) != 0) {
            i2 = TextAlign.Companion.m6533getUnspecifiede0LSkKk();
        }
        if ((i6 + 65536) - (i6 | 65536) != 0) {
            i3 = TextDirection.Companion.m6546getUnspecifieds_7Xco();
        }
        if ((i6 + 131072) - (i6 | 131072) != 0) {
            j6 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
        }
        if ((i6 + 262144) - (i6 | 262144) != 0) {
            textIndent = null;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 524288)) != 0) {
            lineHeightStyle = null;
        }
        if ((i6 & 1048576) != 0) {
            i4 = LineBreak.Companion.m6460getUnspecifiedrAG3T2k();
        }
        if ((i6 + 2097152) - (i6 | 2097152) != 0) {
            i5 = Hyphens.Companion.m6439getUnspecifiedvmbZdU8();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 4194304)) != 0) {
            platformTextStyle = null;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 8388608)) != 0) {
            textMotion = null;
        }
        return textStyle.m6168mergedA7vx0o(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, drawStyle, i2, i3, j6, textIndent, lineHeightStyle, i4, i5, platformTextStyle, textMotion);
    }

    /* JADX INFO: renamed from: merge-dA7vx0o */
    public final TextStyle m6168mergedA7vx0o(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, LineHeightStyle lineHeightStyle, int i4, int i5, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle spanStyleM6078fastMergedSHsh3o = SpanStyleKt.m6078fastMergedSHsh3o(this.spanStyle, j2, null, Float.NaN, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleM6032fastMergej5T8yCg = ParagraphStyleKt.m6032fastMergej5T8yCg(this.paragraphStyle, i2, i3, j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i4, i5, textMotion);
        return (this.spanStyle == spanStyleM6078fastMergedSHsh3o && this.paragraphStyle == paragraphStyleM6032fastMergej5T8yCg) ? this : new TextStyle(spanStyleM6078fastMergedSHsh3o, paragraphStyleM6032fastMergej5T8yCg);
    }

    /* JADX INFO: renamed from: merge-Z1GrekI$default */
    public static /* synthetic */ TextStyle m6142mergeZ1GrekI$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformTextStyle, TextMotion textMotion, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            j3 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
        }
        if ((i2 & 4) != 0) {
            fontWeight = null;
        }
        if ((i2 & 8) != 0) {
            fontStyle = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            fontSynthesis = null;
        }
        if ((i2 & 32) != 0) {
            fontFamily = null;
        }
        if ((i2 & 64) != 0) {
            str = null;
        }
        if ((i2 & 128) != 0) {
            j4 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            baselineShift = null;
        }
        if ((i2 + 512) - (i2 | 512) != 0) {
            textGeometricTransform = null;
        }
        if ((i2 & 1024) != 0) {
            localeList = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2048)) != 0) {
            j5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4096)) != 0) {
            textDecoration = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8192)) != 0) {
            shadow = null;
        }
        if ((i2 + 16384) - (i2 | 16384) != 0) {
            drawStyle = null;
        }
        if ((i2 + 32768) - (i2 | 32768) != 0) {
            textAlign = null;
        }
        if ((i2 & 65536) != 0) {
            textDirection = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 131072)) != 0) {
            j6 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
        }
        if ((i2 + 262144) - (i2 | 262144) != 0) {
            textIndent = null;
        }
        if ((i2 & 524288) != 0) {
            lineHeightStyle = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1048576)) != 0) {
            lineBreak = null;
        }
        if ((i2 & 2097152) != 0) {
            hyphens = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4194304)) != 0) {
            platformTextStyle = null;
        }
        if ((i2 + 8388608) - (i2 | 8388608) != 0) {
            textMotion = null;
        }
        return textStyle.m6167mergeZ1GrekI(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, drawStyle, textAlign, textDirection, j6, textIndent, lineHeightStyle, lineBreak, hyphens, platformTextStyle, textMotion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "0K\u000e<v4)_Y[g\u000fQ 1a\u001cZ\u001e3\u0011i\u000e^{\u0006bof\t\u0005rqSr\u000e\rPmQZ\u0002<L\u0017Y`\u00031f\u0014zQGB\u0017mY\u0019E&Bs\u0003\u0001\u0010/\u001f5[\u0006\u0001k5G|Z\u0015~~F>:6VpOX <;\u0010\u0002'E#+>0(\u0010xSQ.$Uvh\n%9UMk`_@.\u000fP:s7er,\b\n\u00174${\u0019VXd\u000f3'\rK<U\u000f{\u0004,8\t5~_kl/\u000ezmY*\u0006CtZ\"\u000bigc!\u0007nJ,\u001a*$eSv\u001eFATM%`O_1f_\n'uFlt\\p2sHB'y+\u0001(\u000b+-\u0003A\u00135\bJ8{pJ#-\u000bo\u0010\u0005A\u0001\u0018\u0012\u00040&\u007fS,U/`'h.")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: merge-Z1GrekI */
    public final /* synthetic */ TextStyle m6167mergeZ1GrekI(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle spanStyleM6078fastMergedSHsh3o = SpanStyleKt.m6078fastMergedSHsh3o(this.spanStyle, j2, null, Float.NaN, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleM6032fastMergej5T8yCg = ParagraphStyleKt.m6032fastMergej5T8yCg(this.paragraphStyle, textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j6, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m6452unboximpl() : LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m6436unboximpl() : Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), textMotion);
        return (this.spanStyle == spanStyleM6078fastMergedSHsh3o && this.paragraphStyle == paragraphStyleM6032fastMergej5T8yCg) ? this : new TextStyle(spanStyleM6078fastMergedSHsh3o, paragraphStyleM6032fastMergej5T8yCg);
    }

    public final TextStyle merge(SpanStyle spanStyle) {
        return new TextStyle(toSpanStyle().merge(spanStyle), toParagraphStyle());
    }

    public final TextStyle merge(ParagraphStyle paragraphStyle) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(paragraphStyle));
    }

    public final TextStyle plus(TextStyle textStyle) {
        return merge(textStyle);
    }

    public final TextStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    public final TextStyle plus(SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    /* JADX INFO: renamed from: copy-HL5avdY$default */
    public static /* synthetic */ TextStyle m6132copyHL5avdY$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = textStyle.spanStyle.m6073getColor0d7_KjU();
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            j3 = textStyle.spanStyle.m6074getFontSizeXSAIIZE();
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            fontWeight = textStyle.spanStyle.getFontWeight();
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            fontStyle = textStyle.spanStyle.m6075getFontStyle4Lr2A7w();
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            fontSynthesis = textStyle.spanStyle.m6076getFontSynthesisZQGJjVo();
        }
        if ((i2 & 32) != 0) {
            fontFamily = textStyle.spanStyle.getFontFamily();
        }
        if ((i2 & 64) != 0) {
            str = textStyle.spanStyle.getFontFeatureSettings();
        }
        if ((i2 & 128) != 0) {
            j4 = textStyle.spanStyle.m6077getLetterSpacingXSAIIZE();
        }
        if ((i2 & 256) != 0) {
            baselineShift = textStyle.spanStyle.m6072getBaselineShift5SSeXJ0();
        }
        if ((i2 & 512) != 0) {
            textGeometricTransform = textStyle.spanStyle.getTextGeometricTransform();
        }
        if ((i2 + 1024) - (i2 | 1024) != 0) {
            localeList = textStyle.spanStyle.getLocaleList();
        }
        if ((i2 + 2048) - (i2 | 2048) != 0) {
            j5 = textStyle.spanStyle.m6071getBackground0d7_KjU();
        }
        if ((i2 + 4096) - (i2 | 4096) != 0) {
            textDecoration = textStyle.spanStyle.getTextDecoration();
        }
        if ((i2 + 8192) - (i2 | 8192) != 0) {
            shadow = textStyle.spanStyle.getShadow();
        }
        if ((i2 + 16384) - (i2 | 16384) != 0) {
            textAlign = TextAlign.m6520boximpl(textStyle.paragraphStyle.m6029getTextAligne0LSkKk());
        }
        if ((i2 & 32768) != 0) {
            textDirection = TextDirection.m6534boximpl(textStyle.paragraphStyle.m6031getTextDirections_7Xco());
        }
        if ((i2 & 65536) != 0) {
            j6 = textStyle.paragraphStyle.m6027getLineHeightXSAIIZE();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 131072)) != 0) {
            textIndent = textStyle.paragraphStyle.getTextIndent();
        }
        return textStyle.m6145copyHL5avdY(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, textAlign, textDirection, j6, textIndent);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017K\u0014Id\t.c]\u0007+\n`.kQkZ\u001c;\u0017}\u000ff\u0006X\u0002*b|%z(Ps\u0002[k|xZ\u001f>?QdQ\u0011ak\\<gJ9Q\u001cH&E({H\u0007\u0005\u001f/C%V\u0003;I+\u0016\u00010\u0015H\u0002IB\u001bEl{@\u001f[Z\u0005.z\u0004V\u0015'\nfTrRb\u001a%-Qvf\r\u001ceE@foP4\u001dc>6<dP?\u001d\u0001\u0018\tny~\u001d\u0004k_\u000f^0\u007fO<g\u0011wF*.:k\u007fZx 1\u001b|{ |-1|]tB")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-HL5avdY */
    public final /* synthetic */ TextStyle m6145copyHL5avdY(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent) {
        TextForegroundStyle textForegroundStyleM6548from8_81llA;
        if (Color.m4179equalsimpl0(j2, this.spanStyle.m6073getColor0d7_KjU())) {
            textForegroundStyleM6548from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            textForegroundStyleM6548from8_81llA = TextForegroundStyle.Companion.m6548from8_81llA(j2);
        }
        return new TextStyle(new SpanStyle(textForegroundStyleM6548from8_81llA, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j6, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m6161getLineBreakrAG3T2k(), m6158getHyphensvmbZdU8(), getTextMotion(), (DefaultConstructorMarker) null), this.platformStyle);
    }

    /* JADX INFO: renamed from: copy-NOaFTUo$default */
    public static /* synthetic */ TextStyle m6133copyNOaFTUo$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i2, Object obj) {
        PlatformTextStyle platformTextStyle2 = platformTextStyle;
        if ((i2 + 1) - (i2 | 1) != 0) {
            j2 = textStyle.spanStyle.m6073getColor0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = textStyle.spanStyle.m6074getFontSizeXSAIIZE();
        }
        if ((i2 & 4) != 0) {
            fontWeight = textStyle.spanStyle.getFontWeight();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            fontStyle = textStyle.spanStyle.m6075getFontStyle4Lr2A7w();
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            fontSynthesis = textStyle.spanStyle.m6076getFontSynthesisZQGJjVo();
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            fontFamily = textStyle.spanStyle.getFontFamily();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            str = textStyle.spanStyle.getFontFeatureSettings();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            j4 = textStyle.spanStyle.m6077getLetterSpacingXSAIIZE();
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            baselineShift = textStyle.spanStyle.m6072getBaselineShift5SSeXJ0();
        }
        if ((i2 & 512) != 0) {
            textGeometricTransform = textStyle.spanStyle.getTextGeometricTransform();
        }
        if ((i2 & 1024) != 0) {
            localeList = textStyle.spanStyle.getLocaleList();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2048)) != 0) {
            j5 = textStyle.spanStyle.m6071getBackground0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4096)) != 0) {
            textDecoration = textStyle.spanStyle.getTextDecoration();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8192)) != 0) {
            shadow = textStyle.spanStyle.getShadow();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16384)) != 0) {
            textAlign = TextAlign.m6520boximpl(textStyle.paragraphStyle.m6029getTextAligne0LSkKk());
        }
        if ((i2 & 32768) != 0) {
            textDirection = TextDirection.m6534boximpl(textStyle.paragraphStyle.m6031getTextDirections_7Xco());
        }
        if ((-1) - (((-1) - i2) | ((-1) - 65536)) != 0) {
            j6 = textStyle.paragraphStyle.m6027getLineHeightXSAIIZE();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 131072)) != 0) {
            textIndent = textStyle.paragraphStyle.getTextIndent();
        }
        if ((i2 + 262144) - (i2 | 262144) != 0) {
            platformTextStyle2 = textStyle.platformStyle;
        }
        if ((i2 + 524288) - (i2 | 524288) != 0) {
            lineHeightStyle = textStyle.paragraphStyle.getLineHeightStyle();
        }
        return textStyle.m6146copyNOaFTUo(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, textAlign, textDirection, j6, textIndent, platformTextStyle2, lineHeightStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017K\u0014Id\t.c]\u0007+\n`.kQkZ\u001c;\u0017}\u000ff\u0006X\u0002*b|%z(Ps\u0002[k|xZ\u001f>?QdQ\u0011ak\\<gJ9Q\u001cH&E({H\u0007\u0005\u001f/C%V\u0003;I+\u0016\u00010\u0015H\u0002IB\u001bEl{@\u001f[Z\u0005.z\u0004V\u0015'\nfTrRb\u001a%-Qvf\r\u001ceE@foP4\u001dc>6<dP?\u001d\u0001\u0018\tny~\u001d\u0004k_\u000f^0\u007fO<g\u0011wF*.:k\u007fZx 1\u001b|{ |-1|]tB")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-NOaFTUo */
    public final /* synthetic */ TextStyle m6146copyNOaFTUo(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        TextForegroundStyle textForegroundStyleM6548from8_81llA;
        if (Color.m4179equalsimpl0(j2, this.spanStyle.m6073getColor0d7_KjU())) {
            textForegroundStyleM6548from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            textForegroundStyleM6548from8_81llA = TextForegroundStyle.Companion.m6548from8_81llA(j2);
        }
        PlatformParagraphStyle paragraphStyle = null;
        SpanStyle spanStyle = new SpanStyle(textForegroundStyleM6548from8_81llA, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (DefaultConstructorMarker) null);
        int iM6526unboximpl = textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk();
        int iM6540unboximpl = textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco();
        if (platformTextStyle != null) {
            paragraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(iM6526unboximpl, iM6540unboximpl, j6, textIndent, paragraphStyle, lineHeightStyle, m6161getLineBreakrAG3T2k(), m6158getHyphensvmbZdU8(), getTextMotion(), (DefaultConstructorMarker) null), platformTextStyle);
    }

    /* JADX INFO: renamed from: copy-CXVQc50$default */
    public static /* synthetic */ TextStyle m6131copyCXVQc50$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i2, Object obj) {
        PlatformTextStyle platformTextStyle2 = platformTextStyle;
        if ((i2 + 1) - (i2 | 1) != 0) {
            j2 = textStyle.spanStyle.m6073getColor0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = textStyle.spanStyle.m6074getFontSizeXSAIIZE();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            fontWeight = textStyle.spanStyle.getFontWeight();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            fontStyle = textStyle.spanStyle.m6075getFontStyle4Lr2A7w();
        }
        if ((i2 & 16) != 0) {
            fontSynthesis = textStyle.spanStyle.m6076getFontSynthesisZQGJjVo();
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            fontFamily = textStyle.spanStyle.getFontFamily();
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            str = textStyle.spanStyle.getFontFeatureSettings();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            j4 = textStyle.spanStyle.m6077getLetterSpacingXSAIIZE();
        }
        if ((i2 & 256) != 0) {
            baselineShift = textStyle.spanStyle.m6072getBaselineShift5SSeXJ0();
        }
        if ((i2 & 512) != 0) {
            textGeometricTransform = textStyle.spanStyle.getTextGeometricTransform();
        }
        if ((i2 + 1024) - (i2 | 1024) != 0) {
            localeList = textStyle.spanStyle.getLocaleList();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2048)) != 0) {
            j5 = textStyle.spanStyle.m6071getBackground0d7_KjU();
        }
        if ((i2 + 4096) - (i2 | 4096) != 0) {
            textDecoration = textStyle.spanStyle.getTextDecoration();
        }
        if ((i2 + 8192) - (i2 | 8192) != 0) {
            shadow = textStyle.spanStyle.getShadow();
        }
        if ((i2 & 16384) != 0) {
            textAlign = TextAlign.m6520boximpl(textStyle.paragraphStyle.m6029getTextAligne0LSkKk());
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32768)) != 0) {
            textDirection = TextDirection.m6534boximpl(textStyle.paragraphStyle.m6031getTextDirections_7Xco());
        }
        if ((i2 & 65536) != 0) {
            j6 = textStyle.paragraphStyle.m6027getLineHeightXSAIIZE();
        }
        if ((i2 & 131072) != 0) {
            textIndent = textStyle.paragraphStyle.getTextIndent();
        }
        if ((i2 & 262144) != 0) {
            platformTextStyle2 = textStyle.platformStyle;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 524288)) != 0) {
            lineHeightStyle = textStyle.paragraphStyle.getLineHeightStyle();
        }
        if ((i2 & 1048576) != 0) {
            lineBreak = LineBreak.m6440boximpl(textStyle.paragraphStyle.m6026getLineBreakrAG3T2k());
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2097152)) != 0) {
            hyphens = Hyphens.m6430boximpl(textStyle.paragraphStyle.m6024getHyphensvmbZdU8());
        }
        return textStyle.m6144copyCXVQc50(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, textAlign, textDirection, j6, textIndent, platformTextStyle2, lineHeightStyle, lineBreak, hyphens);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017K\u0014Id\t.c]\u0007+\n`.kQkZ\u001c;\u0017}\u000ff\u0006X\u0002*b|%z(Ps\u0002[k|xZ\u001f>?QdQ\u0011ak\\<gJ9Q\u001cH&E({H\u0007\u0005\u001f/C%V\u0003;I+\u0016\u0001*\"D{Lyg\u0019l\u007fCX*\u0002G_v0HO\u001a\u00043)wHf\u001b/-}8w\u007fV*FKhbN20T=\u007f.\u0015l8\u0019\u0013\nCDwpWX_\\I-'\u0012w\u0010h}xP#h}w\u0001c\u001fc=\u001a\u0002|\u001e\u007f\u001bBw`0")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-CXVQc50 */
    public final /* synthetic */ TextStyle m6144copyCXVQc50(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        TextForegroundStyle textForegroundStyleM6548from8_81llA;
        if (Color.m4179equalsimpl0(j2, this.spanStyle.m6073getColor0d7_KjU())) {
            textForegroundStyleM6548from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            textForegroundStyleM6548from8_81llA = TextForegroundStyle.Companion.m6548from8_81llA(j2);
        }
        PlatformParagraphStyle paragraphStyle = null;
        SpanStyle spanStyle = new SpanStyle(textForegroundStyleM6548from8_81llA, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, getDrawStyle(), (DefaultConstructorMarker) null);
        int iM6526unboximpl = textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk();
        int iM6540unboximpl = textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco();
        if (platformTextStyle != null) {
            paragraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(iM6526unboximpl, iM6540unboximpl, j6, textIndent, paragraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m6452unboximpl() : LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m6436unboximpl() : Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), getTextMotion(), (DefaultConstructorMarker) null), platformTextStyle);
    }

    /* JADX INFO: renamed from: copy-v2rsoow$default */
    public static /* synthetic */ TextStyle m6137copyv2rsoow$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, Object obj) {
        PlatformTextStyle platformTextStyle2 = platformTextStyle;
        if ((i2 & 1) != 0) {
            j2 = textStyle.spanStyle.m6073getColor0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = textStyle.spanStyle.m6074getFontSizeXSAIIZE();
        }
        if ((i2 & 4) != 0) {
            fontWeight = textStyle.spanStyle.getFontWeight();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            fontStyle = textStyle.spanStyle.m6075getFontStyle4Lr2A7w();
        }
        if ((i2 & 16) != 0) {
            fontSynthesis = textStyle.spanStyle.m6076getFontSynthesisZQGJjVo();
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            fontFamily = textStyle.spanStyle.getFontFamily();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            str = textStyle.spanStyle.getFontFeatureSettings();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            j4 = textStyle.spanStyle.m6077getLetterSpacingXSAIIZE();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            baselineShift = textStyle.spanStyle.m6072getBaselineShift5SSeXJ0();
        }
        if ((i2 + 512) - (i2 | 512) != 0) {
            textGeometricTransform = textStyle.spanStyle.getTextGeometricTransform();
        }
        if ((i2 + 1024) - (i2 | 1024) != 0) {
            localeList = textStyle.spanStyle.getLocaleList();
        }
        if ((i2 & 2048) != 0) {
            j5 = textStyle.spanStyle.m6071getBackground0d7_KjU();
        }
        if ((i2 + 4096) - (i2 | 4096) != 0) {
            textDecoration = textStyle.spanStyle.getTextDecoration();
        }
        if ((i2 + 8192) - (i2 | 8192) != 0) {
            shadow = textStyle.spanStyle.getShadow();
        }
        if ((i2 & 16384) != 0) {
            drawStyle = textStyle.spanStyle.getDrawStyle();
        }
        if ((i2 + 32768) - (i2 | 32768) != 0) {
            textAlign = TextAlign.m6520boximpl(textStyle.paragraphStyle.m6029getTextAligne0LSkKk());
        }
        if ((i2 + 65536) - (i2 | 65536) != 0) {
            textDirection = TextDirection.m6534boximpl(textStyle.paragraphStyle.m6031getTextDirections_7Xco());
        }
        if ((i2 + 131072) - (i2 | 131072) != 0) {
            j6 = textStyle.paragraphStyle.m6027getLineHeightXSAIIZE();
        }
        if ((i2 + 262144) - (i2 | 262144) != 0) {
            textIndent = textStyle.paragraphStyle.getTextIndent();
        }
        if ((i2 + 524288) - (i2 | 524288) != 0) {
            platformTextStyle2 = textStyle.platformStyle;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1048576)) != 0) {
            lineHeightStyle = textStyle.paragraphStyle.getLineHeightStyle();
        }
        if ((i2 & 2097152) != 0) {
            lineBreak = LineBreak.m6440boximpl(textStyle.paragraphStyle.m6026getLineBreakrAG3T2k());
        }
        if ((i2 & 4194304) != 0) {
            hyphens = Hyphens.m6430boximpl(textStyle.paragraphStyle.m6024getHyphensvmbZdU8());
        }
        if ((i2 + 8388608) - (i2 | 8388608) != 0) {
            textMotion = textStyle.paragraphStyle.getTextMotion();
        }
        return textStyle.m6150copyv2rsoow(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, drawStyle, textAlign, textDirection, j6, textIndent, platformTextStyle2, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "&U\fN1w$ek[:\u0010S);`o\f\u001d/\u0006|KfwQs*\\\n0riNpG\rPmQZ~?C\u0019d\u00189\u0016]`OIGF\u0017\u000f[\u001dS)Bsm{\u001at\u0019.P~\u0007)a\t\nLO'\u0014Q6-?f/<e!.\u007f%\u00064I\u0013'\u0013 \u0019XxB\u001e% Q<%\u0010*+\u0001<\u0016kPH[RH@\u00029rH\u001b\u0014\u0014\u0016n{s\u001dV\\\u0017\u001e''\u000e=<d}\tE+.\u000fm\u0003]\u001fa@\u0011.v\u001bxd<}ZnujgSi\u0007T^%fg5aQL\u0011\u00019I_a]P%=\r2\u000ewn7jvW/(M\u00135S|6\u0003\"\u000e#4>v\u0012F\u000eJ8p7M\u0019\u001f\u000bn\r|@t\u001aD\t15:$\u001fb4\\*ga(lbY(Da\r\u00121\"")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-v2rsoow */
    public final /* synthetic */ TextStyle m6150copyv2rsoow(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        TextForegroundStyle textForegroundStyleM6548from8_81llA;
        if (Color.m4179equalsimpl0(j2, this.spanStyle.m6073getColor0d7_KjU())) {
            textForegroundStyleM6548from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            textForegroundStyleM6548from8_81llA = TextForegroundStyle.Companion.m6548from8_81llA(j2);
        }
        PlatformParagraphStyle paragraphStyle = null;
        SpanStyle spanStyle = new SpanStyle(textForegroundStyleM6548from8_81llA, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null);
        int iM6526unboximpl = textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk();
        int iM6540unboximpl = textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco();
        if (platformTextStyle != null) {
            paragraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(iM6526unboximpl, iM6540unboximpl, j6, textIndent, paragraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m6452unboximpl() : LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m6436unboximpl() : Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    /* JADX INFO: renamed from: copy-p1EtxEg$default */
    public static /* synthetic */ TextStyle m6136copyp1EtxEg$default(TextStyle textStyle, long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, Object obj) {
        PlatformTextStyle platformTextStyle2 = platformTextStyle;
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            j2 = textStyle.spanStyle.m6073getColor0d7_KjU();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            j3 = textStyle.spanStyle.m6074getFontSizeXSAIIZE();
        }
        if ((i6 & 4) != 0) {
            fontWeight = textStyle.spanStyle.getFontWeight();
        }
        if ((i6 & 8) != 0) {
            fontStyle = textStyle.spanStyle.m6075getFontStyle4Lr2A7w();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 16)) != 0) {
            fontSynthesis = textStyle.spanStyle.m6076getFontSynthesisZQGJjVo();
        }
        if ((i6 & 32) != 0) {
            fontFamily = textStyle.spanStyle.getFontFamily();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 64)) != 0) {
            str = textStyle.spanStyle.getFontFeatureSettings();
        }
        if ((i6 + 128) - (i6 | 128) != 0) {
            j4 = textStyle.spanStyle.m6077getLetterSpacingXSAIIZE();
        }
        if ((i6 & 256) != 0) {
            baselineShift = textStyle.spanStyle.m6072getBaselineShift5SSeXJ0();
        }
        if ((i6 & 512) != 0) {
            textGeometricTransform = textStyle.spanStyle.getTextGeometricTransform();
        }
        if ((i6 & 1024) != 0) {
            localeList = textStyle.spanStyle.getLocaleList();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2048)) != 0) {
            j5 = textStyle.spanStyle.m6071getBackground0d7_KjU();
        }
        if ((i6 + 4096) - (i6 | 4096) != 0) {
            textDecoration = textStyle.spanStyle.getTextDecoration();
        }
        if ((i6 & 8192) != 0) {
            shadow = textStyle.spanStyle.getShadow();
        }
        if ((i6 + 16384) - (i6 | 16384) != 0) {
            drawStyle = textStyle.spanStyle.getDrawStyle();
        }
        if ((i6 + 32768) - (i6 | 32768) != 0) {
            i2 = textStyle.paragraphStyle.m6029getTextAligne0LSkKk();
        }
        if ((i6 & 65536) != 0) {
            i3 = textStyle.paragraphStyle.m6031getTextDirections_7Xco();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 131072)) != 0) {
            j6 = textStyle.paragraphStyle.m6027getLineHeightXSAIIZE();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 262144)) != 0) {
            textIndent = textStyle.paragraphStyle.getTextIndent();
        }
        if ((i6 + 524288) - (i6 | 524288) != 0) {
            platformTextStyle2 = textStyle.platformStyle;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 1048576)) != 0) {
            lineHeightStyle = textStyle.paragraphStyle.getLineHeightStyle();
        }
        if ((i6 + 2097152) - (i6 | 2097152) != 0) {
            i4 = textStyle.paragraphStyle.m6026getLineBreakrAG3T2k();
        }
        if ((i6 & 4194304) != 0) {
            i5 = textStyle.paragraphStyle.m6024getHyphensvmbZdU8();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 8388608)) != 0) {
            textMotion = textStyle.paragraphStyle.getTextMotion();
        }
        return textStyle.m6149copyp1EtxEg(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, drawStyle, i2, i3, j6, textIndent, platformTextStyle2, lineHeightStyle, i4, i5, textMotion);
    }

    /* JADX INFO: renamed from: copy-p1EtxEg */
    public final TextStyle m6149copyp1EtxEg(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j6, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        TextForegroundStyle textForegroundStyleM6548from8_81llA;
        if (Color.m4179equalsimpl0(j2, this.spanStyle.m6073getColor0d7_KjU())) {
            textForegroundStyleM6548from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            textForegroundStyleM6548from8_81llA = TextForegroundStyle.Companion.m6548from8_81llA(j2);
        }
        PlatformParagraphStyle paragraphStyle = null;
        SpanStyle spanStyle = new SpanStyle(textForegroundStyleM6548from8_81llA, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null);
        if (platformTextStyle != null) {
            paragraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(i2, i3, j6, textIndent, paragraphStyle, lineHeightStyle, i4, i5, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    /* JADX INFO: renamed from: copy-aIRg9q4$default */
    public static /* synthetic */ TextStyle m6135copyaIRg9q4$default(TextStyle textStyle, Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, Object obj) {
        PlatformTextStyle platformTextStyle2 = platformTextStyle;
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f2 = textStyle.spanStyle.getAlpha();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            j2 = textStyle.spanStyle.m6074getFontSizeXSAIIZE();
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            fontWeight = textStyle.spanStyle.getFontWeight();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            fontStyle = textStyle.spanStyle.m6075getFontStyle4Lr2A7w();
        }
        if ((i2 & 32) != 0) {
            fontSynthesis = textStyle.spanStyle.m6076getFontSynthesisZQGJjVo();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            fontFamily = textStyle.spanStyle.getFontFamily();
        }
        if ((i2 & 128) != 0) {
            str = textStyle.spanStyle.getFontFeatureSettings();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            j3 = textStyle.spanStyle.m6077getLetterSpacingXSAIIZE();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
            baselineShift = textStyle.spanStyle.m6072getBaselineShift5SSeXJ0();
        }
        if ((i2 & 1024) != 0) {
            textGeometricTransform = textStyle.spanStyle.getTextGeometricTransform();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2048)) != 0) {
            localeList = textStyle.spanStyle.getLocaleList();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4096)) != 0) {
            j4 = textStyle.spanStyle.m6071getBackground0d7_KjU();
        }
        if ((i2 & 8192) != 0) {
            textDecoration = textStyle.spanStyle.getTextDecoration();
        }
        if ((i2 & 16384) != 0) {
            shadow = textStyle.spanStyle.getShadow();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32768)) != 0) {
            drawStyle = textStyle.spanStyle.getDrawStyle();
        }
        if ((i2 + 65536) - (i2 | 65536) != 0) {
            textAlign = TextAlign.m6520boximpl(textStyle.paragraphStyle.m6029getTextAligne0LSkKk());
        }
        if ((i2 & 131072) != 0) {
            textDirection = TextDirection.m6534boximpl(textStyle.paragraphStyle.m6031getTextDirections_7Xco());
        }
        if ((-1) - (((-1) - i2) | ((-1) - 262144)) != 0) {
            j5 = textStyle.paragraphStyle.m6027getLineHeightXSAIIZE();
        }
        if ((524288 & i2) != 0) {
            textIndent = textStyle.paragraphStyle.getTextIndent();
        }
        if ((i2 + 1048576) - (i2 | 1048576) != 0) {
            platformTextStyle2 = textStyle.platformStyle;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2097152)) != 0) {
            lineHeightStyle = textStyle.paragraphStyle.getLineHeightStyle();
        }
        if ((i2 & 4194304) != 0) {
            lineBreak = LineBreak.m6440boximpl(textStyle.paragraphStyle.m6026getLineBreakrAG3T2k());
        }
        if ((i2 & 8388608) != 0) {
            hyphens = Hyphens.m6430boximpl(textStyle.paragraphStyle.m6024getHyphensvmbZdU8());
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16777216)) != 0) {
            textMotion = textStyle.paragraphStyle.getTextMotion();
        }
        return textStyle.m6148copyaIRg9q4(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, textAlign, textDirection, j5, textIndent, platformTextStyle2, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "&U\fN1w$ek[:\u0010S);`o\f\u001d/\u0006|KfwQs*\\\n0riNpG\rPmQZ~?C\u0019d\u00189\u0016]`OIGF\u0017\u000f[\u001dS)Bsm{\u001at\u0019.P~\u0007)a\t\nLO'\u0014Q6-?f/<e!.\u007f%\u00064I\u0013'\u0013 \u0019XxB\u001e% Q<%\u0010*+\u0001<\u0016kPH[RH@\u00029rH\u001b\u0014\u0014\u0016n{s\u001dV\\\u0017\u001e''\u000e=<d}\tE+.\u000fm\u0003]\u001fa@\u0011.v\u001bxd<}ZnujgSi\u0007T^%fg5aQL\u0011\u00019I_a]P%=\r2\u000ewn7jvW/(M\u00135S|6\u0003\"\u000e#4>v\u0012F\u000eJ8p7M\u0019\u001f\u000bn\r|@t\u001aD\t15:$\u001fb4\\*ga(lbY(Da\r\u00121\"")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-aIRg9q4 */
    public final /* synthetic */ TextStyle m6148copyaIRg9q4(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m6452unboximpl() : LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m6436unboximpl() : Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    /* JADX INFO: renamed from: copy-Ns73l9s$default */
    public static /* synthetic */ TextStyle m6134copyNs73l9s$default(TextStyle textStyle, Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, Object obj) {
        PlatformTextStyle platformTextStyle2 = platformTextStyle;
        if ((i6 & 2) != 0) {
            f2 = textStyle.spanStyle.getAlpha();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 4)) != 0) {
            j2 = textStyle.spanStyle.m6074getFontSizeXSAIIZE();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 8)) != 0) {
            fontWeight = textStyle.spanStyle.getFontWeight();
        }
        if ((i6 & 16) != 0) {
            fontStyle = textStyle.spanStyle.m6075getFontStyle4Lr2A7w();
        }
        if ((i6 + 32) - (i6 | 32) != 0) {
            fontSynthesis = textStyle.spanStyle.m6076getFontSynthesisZQGJjVo();
        }
        if ((i6 + 64) - (i6 | 64) != 0) {
            fontFamily = textStyle.spanStyle.getFontFamily();
        }
        if ((i6 + 128) - (i6 | 128) != 0) {
            str = textStyle.spanStyle.getFontFeatureSettings();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 256)) != 0) {
            j3 = textStyle.spanStyle.m6077getLetterSpacingXSAIIZE();
        }
        if ((i6 + 512) - (i6 | 512) != 0) {
            baselineShift = textStyle.spanStyle.m6072getBaselineShift5SSeXJ0();
        }
        if ((i6 + 1024) - (i6 | 1024) != 0) {
            textGeometricTransform = textStyle.spanStyle.getTextGeometricTransform();
        }
        if ((i6 + 2048) - (i6 | 2048) != 0) {
            localeList = textStyle.spanStyle.getLocaleList();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 4096)) != 0) {
            j4 = textStyle.spanStyle.m6071getBackground0d7_KjU();
        }
        if ((i6 + 8192) - (i6 | 8192) != 0) {
            textDecoration = textStyle.spanStyle.getTextDecoration();
        }
        if ((i6 + 16384) - (i6 | 16384) != 0) {
            shadow = textStyle.spanStyle.getShadow();
        }
        if ((i6 + 32768) - (i6 | 32768) != 0) {
            drawStyle = textStyle.spanStyle.getDrawStyle();
        }
        if ((i6 & 65536) != 0) {
            i2 = textStyle.paragraphStyle.m6029getTextAligne0LSkKk();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 131072)) != 0) {
            i3 = textStyle.paragraphStyle.m6031getTextDirections_7Xco();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 262144)) != 0) {
            j5 = textStyle.paragraphStyle.m6027getLineHeightXSAIIZE();
        }
        if ((524288 + i6) - (524288 | i6) != 0) {
            textIndent = textStyle.paragraphStyle.getTextIndent();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 1048576)) != 0) {
            platformTextStyle2 = textStyle.platformStyle;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2097152)) != 0) {
            lineHeightStyle = textStyle.paragraphStyle.getLineHeightStyle();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 4194304)) != 0) {
            i4 = textStyle.paragraphStyle.m6026getLineBreakrAG3T2k();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 8388608)) != 0) {
            i5 = textStyle.paragraphStyle.m6024getHyphensvmbZdU8();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 16777216)) != 0) {
            textMotion = textStyle.paragraphStyle.getTextMotion();
        }
        return textStyle.m6147copyNs73l9s(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, i2, i3, j5, textIndent, platformTextStyle2, lineHeightStyle, i4, i5, textMotion);
    }

    /* JADX INFO: renamed from: copy-Ns73l9s */
    public final TextStyle m6147copyNs73l9s(Brush brush, float f2, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i2, int i3, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(i2, i3, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i4, i5, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU */
    public final long m6153getColor0d7_KjU() {
        return this.spanStyle.m6073getColor0d7_KjU();
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE */
    public final long m6154getFontSizeXSAIIZE() {
        return this.spanStyle.m6074getFontSizeXSAIIZE();
    }

    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w */
    public final FontStyle m6155getFontStyle4Lr2A7w() {
        return this.spanStyle.m6075getFontStyle4Lr2A7w();
    }

    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo */
    public final FontSynthesis m6156getFontSynthesisZQGJjVo() {
        return this.spanStyle.m6076getFontSynthesisZQGJjVo();
    }

    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE */
    public final long m6159getLetterSpacingXSAIIZE() {
        return this.spanStyle.m6077getLetterSpacingXSAIIZE();
    }

    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0 */
    public final BaselineShift m6152getBaselineShift5SSeXJ0() {
        return this.spanStyle.m6072getBaselineShift5SSeXJ0();
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU */
    public final long m6151getBackground0d7_KjU() {
        return this.spanStyle.m6071getBackground0d7_KjU();
    }

    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    /* JADX INFO: renamed from: getTextAlign-e0LSkKk */
    public final int m6164getTextAligne0LSkKk() {
        return this.paragraphStyle.m6029getTextAligne0LSkKk();
    }

    /* JADX INFO: renamed from: getTextAlign-buA522U */
    public final TextAlign m6163getTextAlignbuA522U() {
        return TextAlign.m6520boximpl(m6164getTextAligne0LSkKk());
    }

    /* JADX INFO: renamed from: getTextDirection-s_7X-co */
    public final int m6166getTextDirections_7Xco() {
        return this.paragraphStyle.m6031getTextDirections_7Xco();
    }

    /* JADX INFO: renamed from: getTextDirection-mmuk1to */
    public final TextDirection m6165getTextDirectionmmuk1to() {
        return TextDirection.m6534boximpl(m6166getTextDirections_7Xco());
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE */
    public final long m6162getLineHeightXSAIIZE() {
        return this.paragraphStyle.m6027getLineHeightXSAIIZE();
    }

    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    /* JADX INFO: renamed from: getHyphens-vmbZdU8 */
    public final int m6158getHyphensvmbZdU8() {
        return this.paragraphStyle.m6024getHyphensvmbZdU8();
    }

    /* JADX INFO: renamed from: getHyphens-EaSxIns */
    public final Hyphens m6157getHyphensEaSxIns() {
        return Hyphens.m6430boximpl(m6158getHyphensvmbZdU8());
    }

    /* JADX INFO: renamed from: getLineBreak-rAG3T2k */
    public final int m6161getLineBreakrAG3T2k() {
        return this.paragraphStyle.m6026getLineBreakrAG3T2k();
    }

    /* JADX INFO: renamed from: getLineBreak-LgCVezo */
    public final LineBreak m6160getLineBreakLgCVezo() {
        return LineBreak.m6440boximpl(m6161getLineBreakrAG3T2k());
    }

    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return Intrinsics.areEqual(this.spanStyle, textStyle.spanStyle) && Intrinsics.areEqual(this.paragraphStyle, textStyle.paragraphStyle) && Intrinsics.areEqual(this.platformStyle, textStyle.platformStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle textStyle) {
        return this == textStyle || (Intrinsics.areEqual(this.paragraphStyle, textStyle.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(textStyle.spanStyle));
    }

    public final boolean hasSameDrawAffectingAttributes(TextStyle textStyle) {
        return this == textStyle || this.spanStyle.hasSameNonLayoutAttributes$ui_text_release(textStyle.spanStyle);
    }

    public int hashCode() {
        int iHashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int iHashCodeLayoutAffectingAttributes$ui_text_release = ((this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text_release() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCodeLayoutAffectingAttributes$ui_text_release + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) Color.m4186toStringimpl(m6153getColor0d7_KjU())).append(", brush=").append(getBrush()).append(", alpha=").append(getAlpha()).append(", fontSize=").append((Object) TextUnit.m6838toStringimpl(m6154getFontSizeXSAIIZE())).append(", fontWeight=").append(getFontWeight()).append(", fontStyle=").append(m6155getFontStyle4Lr2A7w()).append(", fontSynthesis=").append(m6156getFontSynthesisZQGJjVo()).append(", fontFamily=").append(getFontFamily()).append(", fontFeatureSettings=").append(getFontFeatureSettings()).append(", letterSpacing=").append((Object) TextUnit.m6838toStringimpl(m6159getLetterSpacingXSAIIZE())).append(", baselineShift=").append(m6152getBaselineShift5SSeXJ0()).append(", textGeometricTransform=");
        sb.append(getTextGeometricTransform()).append(", localeList=").append(getLocaleList()).append(", background=").append((Object) Color.m4186toStringimpl(m6151getBackground0d7_KjU())).append(", textDecoration=").append(getTextDecoration()).append(", shadow=").append(getShadow()).append(", drawStyle=").append(getDrawStyle()).append(", textAlign=").append((Object) TextAlign.m6525toStringimpl(m6164getTextAligne0LSkKk())).append(", textDirection=").append((Object) TextDirection.m6539toStringimpl(m6166getTextDirections_7Xco())).append(", lineHeight=").append((Object) TextUnit.m6838toStringimpl(m6162getLineHeightXSAIIZE())).append(", textIndent=").append(getTextIndent()).append(", platformStyle=").append(this.platformStyle).append(", lineHeightStyle=").append(getLineHeightStyle());
        sb.append(", lineBreak=").append((Object) LineBreak.m6451toStringimpl(m6161getLineBreakrAG3T2k())).append(", hyphens=").append((Object) Hyphens.m6435toStringimpl(m6158getHyphensvmbZdU8())).append(", textMotion=").append(getTextMotion()).append(')');
        return sb.toString();
    }

    /* JADX INFO: compiled from: TextStyle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005>i%\nCiWP\u0002xޣQɁksvϺj\rI\u0012\u0014\u0016\u0011l2Mc}ٛ\u0016\u0015"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7,s8UN7t8(\u001e>", "", "u(E", "\u0012dU.h3M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "5dc\u0011X-:c \u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc\u0011X-:c \u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhk/Kt\u0016\u0004", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        private Companion() {
        }

        public final TextStyle getDefault() {
            return TextStyle.Default;
        }
    }
}
