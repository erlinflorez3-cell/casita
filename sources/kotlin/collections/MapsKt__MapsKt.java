package kotlin.collections;

import com.dynatrace.android.agent.Global;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0001\u001d̉=!,\f\bDJd|\u0004O\f8é6B\u0015\"4\u0012\u0006*njG0Le^.ZS0\u000fs{J$c$\bCC٥\"}0\u0018WN}gvJ`\u000bK\u000f\u001c\u0016\u0001jBI]xc\u0015\u00172P\u0014G3SpE9n}>\u000562*8\u007f\u0016\t\u001a@H\u0018v\u0001KS\f VHpHy\u0015M\u0013?\u001a\u0006D(\t\u001ej\u0002V6^le:58\u001bHP÷?k@~]\r\rT7\u000f\u0007ad,n6U\u0017+م\u0011\u0007r]E\u0002Mrm\tv)?+wv\bY^~\"\u0019Cl\u001dk\u00032l\u0007a`R';QsK\u0017\u000fV}\u000b}\u001d<2\u00154,ρ2- nNԌ9иqԟöP\nfH\u0006yq6%%\u001e2C\u0010)ƘimK\u001b^7B\u0005\u001d 3\u00015\"\nS.b\u001bÑbwq3W?KI~-_<{\b\t\u007f\u00128\u0014<W\u0002?{W.''G[\u007f$Oq\u0012JTg%\f\u000fmרmRNHhÊ\u001c\u05ec)\u009eȴZLl\u000bqOdX:\u0010k\u001bl#\f\u0011+,lyL!k\u0010^Qxi1N\f\tE1lŽgn\f\u0010]8l4M\u0001q\u001ayn\u0007\u0016O<)\u0005hhRSR[\u000b3\u000b>Xl wBD^\u000e#2\u0006rz@L3\u001f¢#H# H@\u000b\n&ʻn(\\b=<\u001fy&\u0005\tGPlr\u007fg?JZ\bI.=Ca5_&e$x4C$e\u000b\u0014\u0002MхZGln\u001ctc|P>(FiCM#\u0015}9>\u0012/UL9eaO\"'A}(\u001eivNs\u0018l\u0001,'jZQd\u0017hw\r\u0002ן\fd\u000e\nyu\tX{p\u001b]NI9\u0003i>^8C\u0006M0\u000e\r\u007f$\r5sC7\u001f&wZ0st}kuЃ\bb/(zd\u0012-*ܦuz/kCSTY[\u000f>h$|\u0005RH1x6Tq@\u001d5XA+pf:]\u000bu~E\u001aL\u000fv£i:3q\u00043<`Z\u001cQ\u000b,rS5\u0017Lcs}o[\\QJ\u001f\f\u001b{wo@+k.vcr\u000b@\u0006:\u0018FCKbK=73Ҭ0<\u0016\u001f[sw\u001b(\u0007\u0010Ho\u000f]2RuKVTU'[vJ\u000bݺS`A,\u0007}\u001d4dֵ;IR{[l;s4\u0011Sc\t+l_~-&YCt;!ιf\u0001+GcBW\u0003f,U6\u0006\u007f\u007f\u001c>\u0017\r)R\u001a+9\u0018\u0011ox@^QV\u0013]\u0013\u00052rbP2)Ez\r\u0010L\nU\fG^ζsb;bf\u0017EZ2\r'F9\u0007R|sH+-L6[Cil\u001a՝\nWs=\u0004\u0007.!m\u05fcz9*e%~\u0016m\u001dJ\u00168\u0016r\u0004\u0019\u0013\u0017!24jvx˖<\bVQ\b2\u0010\u0014\u000f\u0002y\u00059T7;r\u0005RWxz\u001ac3c~W\u001b\u0003-2\u0005\t\u001d;p)\u0019)].YXj<!SfY?\u000fȗ\u0019&-L \u000b7(gc/p\fQa¾9/\f,g0>SF\n/{\u0006\u0004pT8\u0017KV\u0014?\u0013\"#ִJŃ\u0012^xB|\u001d\u001aD,|EI~\u0013\u0019̊Tr>f56' \u0004\u0019Wb\u0017\u0004\fI6#AR\u0006\u001ceKQ¨0϶\u0015\u0003H|\r78^!r.\u0005L4L§K\u001až]$s\u0003#(QDFC0:!\u0012\u0017.j8f>l\u001c,;\u00184o\u0018A\u0005#W\u001eoM\u0019{տYƽ)*\u000f\u001d\u0019<M\u001bIkh\u0011Wy)˄\u001do\u0088[fAC]q\\+\u0012\u0001uJEMsV\u0015bZHeI,\u0019m@F\ne\u0082*Թy#\u000eeI}8\u0002t@\u0005\u0011w\u0006,ġDnd*Mk\u0007tԤ0i\u001e\u0012\rgq6QzZ\u0019T@:-3\bsL\u0019}\u0019g%EZ8UѰ/ط\u001b|\u001eo\n\u00159m\u000bY?^m<Ys\u0014<Ba|zu?y,\fЌ T\u0004lpl_`8F\"\u0011\u0013\u0003\b1\u0019`\u0010b-\u0018mL%Efx\u0007rYz\u001bN\u001f0n0R\fQ\u0006&0X\u0017H~xy%\u0015CG\"^u\u0017\u001dÁ'ϑ\u0010\u0603=N3\u000e\u0003SOW\u0002X\u00049C\r}J\u001f6\u0014[%W'ɿr+5\u0002p*<H~L*.^\u0005\u001eE+H F\tDnn^/``\r\u007f[i\u0011\u001e/=\u001c\u0015u\u0001Bbex\u0013\u0016qŒ]ؒQд;\u0002\u0007)\u001b\u001cQ\u001b#\u000bdSI43sS2lz(^Oʐ\u000bmi\u0012\t`X\"W\u0014O3GJ|V,?)YO~R!U#6/2\b\u007f+y\u001c2k\u0013NFVoH[[!f\tk=\u0014\u0005\u000e>\ffr4BL\u008dhˈ4ģw0:V\t\t\u000ex\u000b}0ڜ}f\u0015[SD9v9T7q\u001f\rwo$rWƁh>]W6D\u0019˫*\u001dlb*NQ>'Yilzs\u001b`![Dkve(q\u0017hL\u000eV<\u000f\u0016I\u0003]#3iTp\u0019l\u0001JQ\u0010)l<)FH1\u001a/\u001a[c'\u0014ea%(.ʯ@˂`ͩ̏a%Uu\u001e}x\u000e\u0010\u0015B\u0007S8\u0013ѥ:|5\u0007De\u0001\u0005\r\u001bS0\u0012\u0015WBV^F˸=Zmmx\f0ă\u001c|K-\u001dYz_\u0006#xc\u000f#d\u001aQYIGg\u00141\u0018l\f@wpz5\u0002\rA<!\u001e7\"P\fA|C\u0004{yW\u0002QD]d*,\u0003\b\"\u001dk@!\u0012OiԂoЪ\u0010ѭęQw\u0015\u0005T\"O/\".9&\u0018\u0015m\u0002X6Z2h$/\u000eV\u001aPՠ|xE\u000bk\u000b=u\u001e\u001cBqDrv].4Q?e]EF[.\"\u0018Yn\u0006\u000b;I\u001eI\\;_N}u\nZ\u0003\u001bxΕu˸0։\f\u001aip/y\u001eazlZ\u0003Mǟ\"jץ2\u001a`\u0005\u000fn|Oo\u0011e$\u001d\u0018\u000b=\u0004)i@5apgF<7oM;_d|\u000b\u000b\u0011nЗ:ӟ\u0016\u000fV\b~O)2\u001dK+\u001b6;K\u07beNK5]\nfqRJsXm8/Pw&8-\u007f{:;r\u0001bC\u0007v\t\u001c#>1|\u0001 w@4W]!!]\u000eNͣP܈Kȡ֭E\u0007za\u000f8\u0001KW\u0015H+e$#ۻs\u0019\b\u0007<kI^\u0011_t|.n\"[72\u000e\u0006g\u0014o\u001eF\u00122'\u0018t\"4\u007f\u007f\u000fq`\u0019\u001c\u001cS.N\u00153\u0018\u0013\u05cc;ɣ@\u05ccجWp'^\u0010!lw\u001d\rk\"H\r\u001eєol3q\u001b'0D;\u0003+o\u0019\u0010bI5\u000b=Q={H8@$c/W\nYb\u000f\u0002\u000eRa6@u\u0019M\u0013n,`1бpœ]ƃխu<k2\u0010eS^(&\u0019<4dbÇ5[HF\u001d\r, R0B\u000e~0a\\x\u007f\u007fv\u0019c@_drCwX5q#G+ދ\u0005\t1\rCQL\u0011mF+G\u0007\tVث \b\u001dFy|\u000e2-\u0004\fL\u00141D9\u00102Am:?0b\u000b\u0014j\u000f<\u0017Z\u0002E FaL\"\u007ftI&vߤ\u001dڋ?Ր߹\b/TJ\u000b.~kJI\u000ey?.d\u05fe~k\u001a1VQON\u0017=*\u001b,7q7iKu$,E.>w$[ք%\u0003D\u0003>55 y~,Eډ\u0014$4D\u00055~D\u0013N\u0006 :\u0013\u0005\")iD0Rb\u0016+,\u0011\u0014MmҶwø\u0013m<\b@ͽ*\u0002tH\u001f\u000f,$;Ζ3a\u0011\t\\cCzsSexl\rU1MkW0\u0013v)\u0017Jo\u0012B}ۡokVG\u0006\u00177Eq?B\u0006\u0012O\\oC0Y\u0014\\\u000b\t\u0013A1\u0007Ց\b3\u0011t\u0006LZ\u0006jFxmF9}TfFoN\f\u0014F\u0005m4t=ap͍\u0002vvh\u0019>%\u0013>\t\u000f>}eKe6%:FFTagBԐ[\u05ff\u0013H\u001dr|\u000fPU7\u0017.,d QC_iD\u001e~M'EnGgĺ<\":d.\f<q\u0010R@X\u000f\u0016nGK!ySp98`\u0007Y7P/8D\n\"NQ\u000fwv1;o\u0017#L-SYS\u0012S=R\u00028ur\u0018YVlNfMJ0ٜuɯ7ܘWAxY??\u001e!{b0Ӛ\u0012\u0003H\u0017J\u001f4\u0013G\u000fD=,/4L-\u0006\u0019\u0001xt\u0012vPܕ%k\u0017AG\u0016KݿSU'\\ AMlZ\u0010\u0017$6/O\u001a9i|&;\u0016\u001dc<UG\bH1\u0017\f:\u0006_0(\u0013\r*D\"2[\"A\\\u001bx#IG.JaN\u0014\u0010`P67_];˜sͷW֊ς\u0007\u001eQe\u0011bx\u001d|%\fZ~b\r+o0V\u0019VZ[)\u0007yV֫G \u0003j\u0007t\u0001Z\u0006\u0018d'\u0001o\u0006\r\u0010smDvG\fMu\"\u0006RA\u001d\bS\u001d+x;l]Lr\u0007N<D\\vf\f\u001cRv8e;y\u00138n8Eo)Sa)ӐTϐ\u0010ؓ\fP\u000bi\u0017`\u0004g=u<ޏ)\u0013b\u0019\u0001\t\u007f\u000ey:\u0013tD}mog\"@\u000bb\u0005{\u00059\u0383#\u0004Z/$`a۱\r*<\":2X2SoGN5!W#|\u000eGI'{(_\u0012.Q1\u001d&]p1f\u0002\u000b\u0007\u0019Pn~bGJ7.=r\u0017%\u001cl`\u0015\u001ai=[\u0006fc\u001ef\tCŝcӬaѪۼ\u0015'8X%ZXOeUc=A&R\u0014K\u001fcQ8\u0005\\\r\u0013\u00138ϩ\u000e\u001eVwL`\u0003d JUFch\u001bN|4\u0016\u0011ZT9\u0005^zEP\u001fbtQ;\u0005%ƌ]ǣ+\u000e\tNHc\u000b7}P=\u0004 ffqT\u0010]\b^oy8AcqӸ\u0004uwf\u001dAY\u0013C\u000eQ\u00078~U(1g~\u000bT\u0016:\u001dlZ\u0006x\u001d\u00173>v\"L\u00115M+n<2QƭRϞ>\u001fL\u0014\u0014\u0007\\\u0010|\u0019|hl%\u0013M\u00053B\u0015E\u0014q!!AA҉\u0006X\u0007C{c\t^O!;~a\u000e\u000b5\u000eLlg34'\u001eALR]kZR\u001a\u007f\u0017\u000e\u007fN vbGޡNJdQ2;}\u0019D\u0001C\u0016nhj\u0007\u001e>c\u0011)e\t\rۋDHB-\u0019,\u001f\u0004,pAX\u0001hWO`\u00157J;\u000f\\\u0018\u001cO=g&\u0010WMcf.7F_\u0016\u0017XƏ(D_\u001eieh\u001e1\u0017 3Ә\\\u0016\u001e |p#(x0$4b~C$H\u001c8\u0002ZFJ#\u0019g\n+EP\u0002;OЂVځt\u0005?-\r(\u000127R9H\u0003\b\u0005ǠV19-W=-s\rP;gBJ\n\u0012.1@)\u0001\n\u001d?ToyM\u0011\u007fgk\u001fb;s\u0005asRxҪ\u000eķ\u000e\n\u001expi'\bzW\u0007u3p\u0005\u0000W@\tvHm\u0017\u0011Y4\u001d\u0015`j\u0004;PP\u000f&7,u3_y+q%\u0015(We6i5\u0011\u000ei¨D;+HU;\u0015z\"\u001f\f:з+z1}BH\\a\u000eOCcPu7\u0003Fae<\u0019t\u0003'R3A3T&^jD&\fkS\u001fqڎ\u001b7!\u001eI#%Q|ucsF\u0019\u000b99\u000e\u0003{rnu\u0011ę137}\u0011j|<QQyNC\u0016bod3Ou/\"\u001a5J݀qO\u0010:h\u001f\"-<,X\u001e^\naI\u001f?\u001e/p\\\u0002ţ&\u0016VHxCA\\\u001d\u0011\u000e&V{\u0011e\u0007o\f>\u0012\u0006*,zQ\u0001Ύ\u000f'$cF\u001a?\u0011\u0017a\u0014\u0002\u001f&\u000fS#K%\u000ehd=S\u05eeo7\u0017iL,\u0014\u0017\u00132\u0004D\u001aPZZp\u0012M(toJ\u0014(X\u001c0RX-5\u0014\u001cGuR\u0014|/</\u0016xf<l\u0005\u001e\\)$\u0001/|ߒ ޛ\u001a%\u001e|F\u001a9c*^|?O?\u0016\u007fYUZjV2_ \u0010\u000f\u0018Φ\u0006\u0007wE[\u0005zFkK5\fbiWw5~o-ed\u0006\u001fByoZm6}RBf2\u0016\u0018$\\\"h|\u001b5\u0004S\u0007טT'*QC!B9I\u007fG>\u0011TvQUe\u001cY:\u0004\u0001lӅ=E%\u00101;W&S%B\u0018SA7s_=>q `\u0010j?l\u00060+\tl%q&aM[Wv`@?5ic\u0013Z-]?<i\u0017҄sC5,E\f\u001fp@r9\u0001Gy\u0017vVA\u001a3}FJ$ލ\u0014\u0018o\"1k47wud@H\b2S\u001ev\u00148mw9u\f\\I]\u0014y^S\u0012\u0011i^\u0004\u0014IY\u0007tX109\u0001DZԯ7X7\n\u001eIL;g\u007f\u0006]{ln)er)nc.\u0005\u0001ѳXknRVo'{\b\f7_d{#rIZcD|v\r2xW(?#\u001e{\u007fOMO\\\u000f-\u0004+D2\u00064sq\u0014T\t)TF,ߘ)$2[\u0016?\nl\u0016G\u0019V։z\u000e\u0017\u000bc7&|kZrfnťEf\u0006y\u0001\ftƔ0|_5EM\u0013\u0006\u0004@\u001bx#;>3[{;[C%[#\u0005\u0004LM#\u00041x\u001b?\rՍ\u0016ڻ?J\u0016$!\r\u0006#[k b\\S\u0016Ӳ\u0010i,2\u0017v*\u001f&dEE\u0002ұ3w~\b\u0012\u001fo՚yUX'\\7` /#&`\\PR69\u00153@4Z!g;HOȴ$SP\u000e}d\u007f~l\u0019q\bȝYGyo\u0011XKD14cY\u007fجG~PQ*Beި]\n*J\u0017,^\u001d\u0012!M6\f\t\u0006XA\f*tl\u001eT\u0018q\rjo\u0002QX99̑!\u0017\u0018wqaN7+)P\u000eƜ\u0011LMuvr\"<E\u00111CaǛ\u000f\u0015\u001d#Jv*̹,)\u0019i) [&#<\u0005ORCa\u0001#S^a${:f`P;ͿD__\u0016mb-:Vc)\u0012ӥ~G\u001ar\t\r;\u0019S\u000fk\u001c\tΆZc,fX;m˝:RqM\u000f'q1\u0003'~\u0019\u001f%c1\u0016,]<}M\u007fM\n\u0017\u000f\u007fsfQ);ջ.\u001b1}\u0007`\n<4[O-ˆ84<\u0012\u000fjB\\&\u0005@X)Å>Sx\u0010.#\u0006ɢ'gbTq_\u000e\u00031H${~f\u001b'=9@\u00154Pct?q5<xXQ\u0012Q\fؔ\f0g\u007f1{kh\u001d$z)R\n\bԷ2-\rj\u0002\u000f;ZlP\u001c)[˞\u0006\n|b<v\u0002л4_X!\u0014\u00118`[5<HfI0\u0007\u0007PAm\u0001VW\u000289\u000b/t\u001c%\u000fC/~a1~\rq>j6\u058bSlpKAFx/=!%7gя4B(_p\u0003\u001fǕ\u0019b\u001cE\u0007\u0005x\n\u001b)QC($wyNFUUH=\u00042\u00116\u0005sVC@?9\u001av\u001aB<uOtTf,\u0014ؒ\u001f)ܵV%t,YL'}&\u0006i\\uknEhf\f\r\u0004\u0010~d)F\u007f|\f\u000e9MTu\u000e'\u0012ɅB\u008cSq=\u000bO_-\u0003\r\u0006-\u001e=C\fč\u00012k\f\u0018/Jo/^\u0019Y\u000f\u000eP,H\u001e\u0011\u0016\u0019vr8rzaQ8\u001cFXiM2\u001a={\u0005\t\u000bЖ6ŖvY&\u0004FhCr;_\u000fV`Q\u000e|Emu\u0003+\"M*q{Q;n}3\n,K\u0012S\u00127\u0004\u0016VN\u001a$:RiE\t\u000e4ZhwO94\u0019\u0003-\u0382*#$v>[9F\u0007M\u000b\u0002\u001a^Hџ\u0006NS\u0012&w6!h,mOxW:V=wx¼,\u0003%n/KXܧ:\rUQ,OU\u0006FC<U\u0014_Wc\u0014a$\u0005)\\9D='+-W#^Bj]3\u001f.\u0019ͪJcbav\t_=1JF\u001c\u0003\u0014{B\u0011\u000epJ#\u0002 MsG-ǂTrk\u0006x\u007f 2\u0003zK,+\u0012RQtk-Iii7+\u001d.\u00026\u0012Pi\u0007h\u0007cO$1\fJrɝF9ouU`%K!_[#.dgs\u0018swҫ\\\fU0Qq.ߺ:;cS=4#.RE\t#wVt\u00169V4!\u0016Zaj2f}(\u0010ns g-9\u0004Ɉ-1@\u0015-Rc{\u0011>\u0005+\u000fx2eUgTA\u0013cLlq\u0004\u001eՏ\u0015&n*:\u000b\u0012THC\u0003/@J\u007f]\u000eE 'lXB\fgcr|\u00162z\u007fnbptn\u000f\u0016ϯfx9\u0002jw\u000bQU\bFXY+TGTt\u0012єEIzr\u0005\u0011$ܓqqdka1s{#\u0014\n\u000b=r\u001eYe{4u-\fVb\u000f\u000b7'#f\u001ew%\u0006Ո:Fj^LN.D\u000bLXhc\u0006\u0007x@\t=\u0001\u007f]%QXg'Ё\u0002n\u001d(\u0019geIO v'=1d#\u0005\u0014B\rmB1\u0005\rR\u0014t\u0018\u0019r7Th\u0010\u0011>TC\n\u001aŻ*P\fr\u0007)\u0018j0J@>k\u001f[\u0012G7)˽\u0007\u0006\bYp\u000b\u0010À\u00026\u0012\u0010?4j\u0002\u001d`\u001ch\u000fV`tE^SZ+&Qs5FJDT\"\u0014\u0015WKn\"Ɏ\u0004B\u001cf0\u001e^St-9DB9[$f\u0003iQ\u001e<o\u007fL*Iܓqa\u000e\u0006H\r\u0005\"b'\u001a,V\u0007hsmu\u0012XoL$nAa\rM&V\u0005>\u0017\u0018L\u0006\u001dXgG|gf%1M >S\u0012\u0001ǿN!%|\u0004]E\u0015J\u0005B$^\u0018.\u00128tdI{r&%h\u05ceeː\u001fS[\u0011bܥ\u0006AEоu\u0017"}, d2 = {"0tX9W\u0014:^", "", "\u0019", "$", "1`_.V0Mg", "", "0tX9W,K/\u0017\u000e~h5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "3l_Al\u0014:^", "6`b5@(I=\u001a", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", ">`X?f", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "uZ;8b;EW\"HeZ0\n^rL\u0005$\r<J'&KvW\u001fr38Ay+\r", ":h]8X+&O$h{", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/db$\nCh\u0013\"\u001d", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E'\u0005 \u001dGnp8\u0005(\u001dU\tu", "uZ;8b;EW\"HeZ0\n^rL\u0005$\r<J'&KvW#z.;Y|\u00033{\u0019\u0016IN\u0011", ";`_\u001cY", "uZ;8b;EW\"HeZ0\n^rL\u0005$\r<J'&KvW$r0\u000b", ";tc.U3>;\u0015\nd_", "1n\\=b5>\\(J", "", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014mE\t7\tTVZ}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", "1n\\=b5>\\(K", "1n]AT0Ga", "", "\u001aj^A_0G\u001d\u001d\b\n^9\u0006\u00056/i1\u0003Td \"W~|P\u0002%C/", "9dh", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW&s*5W\ruzb", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "4h[AX9", ">qT1\\*:b\u0019", "4h[AX9$S-\r", "4h[AX9'](", "4h[AX9'](m\u0005", "\u001b", "2dbA\\5:b\u001d\t\u0004", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J'&KvW$r0\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\tiUA\u0013J<\tNiP(u\u000e\u001f\u001b\u0013\u0002", "4h[AX9-]", "4h[AX9/O \u000fzl", "5dc", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW&s*5W\ruzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "5dc\u001ce\fEa\u0019", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW&s*5W\ru\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b%c\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", "5dc\u001ce\fEa\u0019g\u000be3x\u00066e", "5dc\u001ce\u0017Nb", "5dc#T3NS", "7e4:c;R", Global.BLANK, "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u00062\u000bG\u0005 `L\u0001\u0016\u0006w5>W\r$Av$w.SDiC\"\u001fq,\u000fJJ1J\b#\u0011SJ5^\u001c\\:\u0019\u0012X\u001d$", "7r=<g\fF^(\u0013", "7r=B_3(`x\u0007\u0006m@", "7sT?T;H`", "", "", "", ";tc.U3>7(~\bZ;\u0007\u0016", ";`_\u0018X@L", "BqP;f-H`!", ";`_\u0018X@LB#", ";`_#T3NS'", ";`_#T3NS'm\u0005", ";h]Bf", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW&s*5W\ruzT\u001b*^?\u0005{C\"\u001c2I5\u00129", "9dh@", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005[f-wQ|`\u001eCx\u0010\u0006`\":Y{/\r1|3IT75D-\u0019o+!\u0003n\u0002", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", ";h]Bf\bLa\u001d\u0001\u0004", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW&s*5W\ruz^", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005[f-wQ|`\u001eCx\u0010\u0006`\":Y{/\r1\u0007", "=oc6`0SS\u0006~v]\u0016\u0006\u0010CM{3", "=q4:c;R", ">kd@", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005[f.\u0006O\b\u001b \u0011Z\n@\u0004zx@\u0003\u001cHi_>\\GB5\u001c\u001a >", ">`X?", ";`_", ">kd@4:LW\u001b\b", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005[f.\u0006O\b\u001b \u0011Z\n@\u0004zxJ", ">tc\u000e_3", "@d\\<i,", "Adc", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW&s*5W\ru\u001er\u0012?I\rBg= ^R^>\u0007a;$:\u0018", "Bn<.c", "uZ;8b;EW\"HeZ0\n^\u0016j{9w\n\u0011&\u001bN9u8\u0002zx@\u0003\u001cHi_>\\GB5\u001c\u001a >", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWL\u0006)<#e\u001cBCY\u0015R?Lg}.$lh\u0003n_7$", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J'&KvW$r0\u000b\u001dd%3~\u0012w]R?r}\u0006\u0011s7", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012]*1jyiG|\u001a5\u0017+7v\na{m]J\u0003-<]z.\u00114J72", "Bn<Bg(;Z\u0019fvi", "Bn?.\\9", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\r .0\u0007/")
public class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
    private static final <K, V> Map<K, V> buildMap(int i2, Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(i2);
        builderAction.invoke(mapCreateMapBuilder);
        return MapsKt.build(mapCreateMapBuilder);
    }

    private static final <K, V> Map<K, V> buildMap(Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        builderAction.invoke(mapCreateMapBuilder);
        return MapsKt.build(mapCreateMapBuilder);
    }

    private static final <K, V> K component1(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    private static final <K, V> V component2(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    private static final <K, V> boolean contains(Map<? extends K, ? extends V> map, K k2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.containsKey(k2);
    }

    private static final <K> boolean containsKey(Map<? extends K, ?> map, K k2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.containsKey(k2);
    }

    private static final <K, V> boolean containsValue(Map<K, ? extends V> map, V v2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.containsValue(v2);
    }

    public static final <K, V> Map<K, V> emptyMap() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        Intrinsics.checkNotNull(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static final <K, V> Map<K, V> filter(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> filterKeys(Map<? extends K, ? extends V> map, Function1<? super K, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> filterNot(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M filterNotTo(Map<? extends K, ? extends V> map, M destination, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M filterTo(Map<? extends K, ? extends V> map, M destination, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    public static final <K, V> Map<K, V> filterValues(Map<? extends K, ? extends V> map, Function1<? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    private static final <K, V> V get(Map<? extends K, ? extends V> map, K k2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.get(k2);
    }

    private static final <K, V> V getOrElse(Map<K, ? extends V> map, K k2, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = map.get(k2);
        return v2 == null ? defaultValue.invoke() : v2;
    }

    public static final <K, V> V getOrElseNullable(Map<K, ? extends V> map, K k2, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = map.get(k2);
        return (v2 != null || map.containsKey(k2)) ? v2 : defaultValue.invoke();
    }

    public static final <K, V> V getOrPut(Map<K, V> map, K k2, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = map.get(k2);
        if (v2 != null) {
            return v2;
        }
        V vInvoke = defaultValue.invoke();
        map.put(k2, vInvoke);
        return vInvoke;
    }

    public static final <K, V> V getValue(Map<K, ? extends V> map, K k2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return (V) MapsKt.getOrImplicitDefaultNullable(map, k2);
    }

    private static final <K, V> HashMap<K, V> hashMapOf() {
        return new HashMap<>();
    }

    public static final <K, V> HashMap<K, V> hashMapOf(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap<K, V> map = new HashMap<>(MapsKt.mapCapacity(pairs.length));
        MapsKt.putAll(map, pairs);
        return map;
    }

    private static final Object ifEmpty(Map map, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return map.isEmpty() ? defaultValue.invoke() : map;
    }

    private static final <K, V> boolean isNotEmpty(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return !map.isEmpty();
    }

    private static final <K, V> boolean isNullOrEmpty(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    private static final <K, V> Iterator<Map.Entry<K, V>> iterator(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    private static final <K, V> LinkedHashMap<K, V> linkedMapOf() {
        return new LinkedHashMap<>();
    }

    public static final <K, V> LinkedHashMap<K, V> linkedMapOf(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return (LinkedHashMap) MapsKt.toMap(pairs, new LinkedHashMap(MapsKt.mapCapacity(pairs.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<R, V> mapKeys(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(transform.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R, M extends Map<? super R, ? super V>> M mapKeysTo(Map<? extends K, ? extends V> map, M destination, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(transform.invoke(entry), entry.getValue());
        }
        return destination;
    }

    private static final <K, V> Map<K, V> mapOf() {
        return MapsKt.emptyMap();
    }

    public static final <K, V> Map<K, V> mapOf(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return pairs.length > 0 ? MapsKt.toMap(pairs, new LinkedHashMap(MapsKt.mapCapacity(pairs.length))) : MapsKt.emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<K, R> mapValues(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), transform.invoke(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R, M extends Map<? super K, ? super R>> M mapValuesTo(Map<? extends K, ? extends V> map, M destination, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(entry.getKey(), transform.invoke(entry));
        }
        return destination;
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Map mutableMap = MapsKt.toMutableMap(map);
        CollectionsKt.removeAll(mutableMap.keySet(), keys);
        return MapsKt.optimizeReadOnlyMap(mutableMap);
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, K k2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map mutableMap = MapsKt.toMutableMap(map);
        mutableMap.remove(k2);
        return MapsKt.optimizeReadOnlyMap(mutableMap);
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Map mutableMap = MapsKt.toMutableMap(map);
        CollectionsKt.removeAll(mutableMap.keySet(), keys);
        return MapsKt.optimizeReadOnlyMap(mutableMap);
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, K[] keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Map mutableMap = MapsKt.toMutableMap(map);
        CollectionsKt.removeAll(mutableMap.keySet(), keys);
        return MapsKt.optimizeReadOnlyMap(mutableMap);
    }

    private static final <K, V> void minusAssign(Map<K, V> map, Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        CollectionsKt.removeAll(map.keySet(), keys);
    }

    private static final <K, V> void minusAssign(Map<K, V> map, K k2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        map.remove(k2);
    }

    private static final <K, V> void minusAssign(Map<K, V> map, Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        CollectionsKt.removeAll(map.keySet(), keys);
    }

    private static final <K, V> void minusAssign(Map<K, V> map, K[] keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        CollectionsKt.removeAll(map.keySet(), keys);
    }

    private static final <K, V> Iterator<Map.Entry<K, V>> mutableIterator(Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    private static final <K, V> Map<K, V> mutableMapOf() {
        return new LinkedHashMap();
    }

    public static final <K, V> Map<K, V> mutableMapOf(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(pairs.length));
        MapsKt.putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> optimizeReadOnlyMap(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : MapsKt.toSingletonMap(map) : MapsKt.emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <K, V> Map<K, V> orEmpty(Map<K, ? extends V> map) {
        return map == 0 ? MapsKt.emptyMap() : map;
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (map.isEmpty()) {
            return MapsKt.toMap(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        MapsKt.putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        if (map.isEmpty()) {
            return MapsKt.mapOf(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        MapsKt.putAll(linkedHashMap, pairs);
        return MapsKt.optimizeReadOnlyMap(linkedHashMap);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (map.isEmpty()) {
            return MapsKt.toMap(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        MapsKt.putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MapsKt.putAll(map, pairs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        map.putAll(map2);
    }

    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        map.put(pair.getFirst(), pair.getSecond());
    }

    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MapsKt.putAll(map, pairs);
    }

    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MapsKt.putAll(map, pairs);
    }

    public static final <K, V> void putAll(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final <K, V> void putAll(Map<? super K, ? super V> map, Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final <K, V> void putAll(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    private static final <K, V> V remove(Map<? extends K, V> map, K k2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return (V) TypeIntrinsics.asMutableMap(map).remove(k2);
    }

    private static final <K, V> void set(Map<K, V> map, K k2, V v2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        map.put(k2, v2);
    }

    public static final <K, V> Map<K, V> toMap(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return MapsKt.optimizeReadOnlyMap(MapsKt.toMap(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return MapsKt.emptyMap();
        }
        if (size != 1) {
            return MapsKt.toMap(iterable, new LinkedHashMap(MapsKt.mapCapacity(collection.size())));
        }
        return MapsKt.mapOf(iterable instanceof List ? (Pair<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MapsKt.putAll(destination, iterable);
        return destination;
    }

    public static final <K, V> Map<K, V> toMap(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? MapsKt.toMutableMap(map) : MapsKt.toSingletonMap(map) : MapsKt.emptyMap();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Map<? extends K, ? extends V> map, M destination) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.putAll(map);
        return destination;
    }

    public static final <K, V> Map<K, V> toMap(Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return MapsKt.optimizeReadOnlyMap(MapsKt.toMap(sequence, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Sequence<? extends Pair<? extends K, ? extends V>> sequence, M destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MapsKt.putAll(destination, sequence);
        return destination;
    }

    public static final <K, V> Map<K, V> toMap(Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        int length = pairArr.length;
        return length != 0 ? length != 1 ? MapsKt.toMap(pairArr, new LinkedHashMap(MapsKt.mapCapacity(pairArr.length))) : MapsKt.mapOf(pairArr[0]) : MapsKt.emptyMap();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Pair<? extends K, ? extends V>[] pairArr, M destination) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MapsKt.putAll(destination, pairArr);
        return destination;
    }

    public static final <K, V> Map<K, V> toMutableMap(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }

    private static final <K, V> Pair<K, V> toPair(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return new Pair<>(entry.getKey(), entry.getValue());
    }
}
