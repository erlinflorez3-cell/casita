package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŝ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~02\u001aՄ\u000ffxB8ǏmH<W[*\u0015k\u00044:[,ڎK;k\u001a\u0006̝\u0011O\\\u0006on`Z\u0013C%\u0006\u001eюr,_U\u0001ز\u001a\u000fHBw?9Mw=O`|6\u000b :\"Ny\r\u0001 AP\u0010\rzKK\u0012\u00138@\u0007:Z\rS\u0006\"\u0012\u0014P(ҵ&\\}N>Hr`B/9\u0003qBT:g0\u0013M\u0015FZ)\u0015vw\u001e3@=8\u001d%i\u0003\u000fѸc?\u0019?y=\u000bm/'9I{Ɏ>X\u0016\u0014\u001dۀW\rsr.\\\u000bQh\f=+WҪSP$(\u007f\u07be\u0004\rR\u0004\u0016ͺ/HD-\"f\u000e\u000f;t\tSHP\bdH\u0005\u0011ʨf\u0017S~sT?0vUo;1Ne|\u0015\u0013$#\u000fp9[\u0003\u0011p\u001b!T\u0006UIQnBXR\u0018_Um2wĊ\u0006*\u00128\bW5\u0011!2%.O[g-1o\u0010S\\g%\u0011pzYi`UX.~\u001eG0\u0019\u000ejD\u0013\u0015\u001a_\u0003f<\u0017S\u001cb\t\u0016\bA#l}B!3\u0014fO\u0017nzQk\u0010=/\u0015>iry\u001fo9\rEEUq#yR%(͖@b\u0013m'\u001aY!j`6+JH\u0019\u001a\b\u007fRY$\u0013`K\u0002 B2I\u0019\u000b\u001cX\u0007,SY|7qjl\u001e\u0015l3R\u001ay6z\t\u000f]t|\u007fo\tO<~p\"[Q\u007fDG4e(n4\u000b%\u001f~\"\u0003WmRGZp.u\u0004\u0001°\u001a\u001aGio\u0015\u0019#\u000f-@\u000bEEz|uU[\u001d?z+\u0006\u001f?vG\u007f\b\u0019\u000b<dx[gTE4\u0007b\u00019 d.\u0011qX\u0001Gqa#gNQ\u0003\ti>^8+\u0015M-S\u000f\u007f(\u00035;E?\u001dDz$5\u001bakm\b.(gϪ*ts\u001fl\u000b&spQu2i9Y]\rW:$\u001b\u001dRNpw\u0016D!4;6XGjpd<e\u000b]\u0003֨\u000b,\u001b\r\u001f\u0004HN\b}bj\u0010.\u0002\u0001\u0016\u0014\r\u0002U\u0015[\u0013\u007fm\u001c\b\r\u0011P\u000e\u0018K\u00141\u001d\u0015Ћ<ղݫ[d\u000fq\u00146`BO~z\u0005jMT8:\u0002 \u000bqW2\u0012\u001eA\u0018F\u000eGG6P9SV<WAhd\u0010\u001d`s\u0019Q.\u000fD'3L{}E\u00136^T]jb\u0005ab!\u001b\u0019R/j3t\\Tg pd\u000fU]]qP2:\u0012\u0013Am\u001arTD&I5BF\"iU\u001f+\u000f0\r\u000e\u001ez\\2\u000f\u0012\u0015U~&7J\u0013|<?:\u0015\u0011\u0019]A\bb[Q\u0017\u0004E\u00132\u0001EGY\u000b\u001aB{FI0NA;\u000eajB*,[a\r\u0016\bN'o\u0010\u0003stW<m:a)\u0006.qDeJ\u0015!$8\u0004\\Q%v\u0018y 6}\u0005{\u000e!3qk&(p+98\u001eBykA\u0016qB{n\u0004\u000e3j?\"\u0012n[Se\u00155$F\u0013\u0007aj\u0015akp\u0011.\u0017]2-\u000e bW\u0017\u007fgv<\u0004O\n\u0010sEy\u0003y1^UN\u0002-S\u000e\u0004X/Ո\u0014ܑ͇Q@jdjI\u000bc\u001c<\u0003(\u00139<-\"B\u0017H\r\u0014[HTQ6d]\u0017I#im_`5\u0007uM4\u0003IRm\u001e\u007fX\u0019R@v?Ajf\u0003cBB7+0k:\u0012^Tk\u007fW]2T|\u0003T3\u05907܂ݭ0\u0013\u0014y=D\u00019LG2\u001ci\u0010cE'V\u0019\u0015f\t͈\u0006\u0018ȳi\u070eƽ),\u0007h\u000fy\b\u0006?YRsewS3\u001d;3W\u0015>m\rs;?\f0Uz\u0003[Tn\u000f\u0010\u001ey9S\u0011\u0012Uns:%*$\u0014j;\u007fs8x2e\\NL\fY\u001a%X-\u001fL)Gzp\f\fBhFl\u0015cg4Ot,\u001bZ=X(\u001d\rKMvu#D;BǢ6ʔҋ-6\u001dz\u001eނp\tiWae/\u000bMl\u0017\u0002tR2\u0010(*OFY8ƌ,*U\u0012Èi\u001eYe\u0010F\b%\u000f\u001av_I\u0011\bf\u001d&\u001fcx\\5\u000bq\u0014FɌ\nٺǦ(b4˻\u000b\u0019ʔ\u0015v\u001b%p\u0016J\u000f\u0005C7UdYG@H,)#\u0011iܫ\u0005=h\u0019\u07b2>\u0006y^=G)#o`Wc\\\r\r[!Y\\C\u0017\u0016iY'w^D\u001a8R\u001e\u0010[cv\u000bt~J({,H0~{ØBיԀ #Cջ\u0014s܆1+Fi۱\u0010C7\u0006^\u0003Y1r\u0011\u00021\u0013\b\u0019[\u001a,Җ8J#\"|aB\nMtI\u0004\u007f4IX\u0012oĸ G\u0006m\u001fqOz\"}?GZ\u0006~\\25-\u001e\u0013Rl\u001eS@ځ$ό\u0007PNX/eYwauP\n'z#\u0011˻\u0010>]\u0381U\b\u0017\u0003*V\fnNNFp7N\u0006/ʛ.i\bhz|[i{\u0005'cIq?jٷc\u001avҭtZD=eJ\u0011\"\u0010\u001a5&\u0010|ž-6\u001fƉ{op\u001bb\tahB\u0015Hd(y\u001d)ٍgBTJrCtsN*_oz\t\u000fsזE\u0016j۪D)<txFQ\u0010Y\u0010/\u0014eK-gת7>:c(\u0003kI\u0018Y\u0014\u0010\u0003a&\u0018ٛa9>ŧ\b.\u0003E\u0013k7\u0002\u0012\u001e\u001dM^\u000b\"sȭJ^X\u001e3\r5\u00129 8A$\u0003\u0015.~S\u0001\u0006$-IՍ\u0001Ԡ\" I\u008eQI'H\u0011O\r\u001f@\u0005p\u0003~\\l'Dz4W@Pܐ9rIо\u00145]+]j.-7\u0004\u0002wN\u0014ܡ\u0016\nkˈ;Qo\u001d\u001f\u0002ùM\u0001\u000f\\B֏]0\t*)*'Ƣ+ܨG"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9uL}49Dy-3o#*XF\u0011", "", "7mc?\\5LW\u0017\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9uL}49Dy-3o#*XF\u001ftC+\u0019qo=\u0005q\u0002", ";`g\u0019\\5>a", "", "3k[6c:Ba", "", "EhSA[", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W$\u0007,D]h\u001cDi\u0018;IN>O=-\"ljG\u000ba:$Z\u001c(\u0010?", "/m]<g(MS\u0018l\nk0\u0006\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "@db<h9<S\u007f\tv],\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F,\u0003.[MKx2\u001e{r]8\u0007p\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020\u00077y|U&\u001d9q:)Z\u001eVOxj\"\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;)$l_wh{\\\u001fva\u000e=NC\"yE.Bln\u0010Cy]G~5\u001f\u0015\f{[AX\b:>.\u000e=9\u007fE\u000fTvV+^\u0007\u001f<i?'\r@8\u0012?X99]", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u0002*h7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010ih}V\u000b$b3r\u0010n12!6-\u0013~#\u001fgcw\b\u0006[\u001c|`y1wKb\n87M7\\PN~\u001f\u001d~0.,w\u007f\u00169l3\u0018t;\u000e;;6qZ2l\u0014OZB%;`Hp\r:J\"\u0015/X9]", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u0002.h7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010ih}V\u000b$b3r\u0010n12!6-\u0013~#\u001fgcw\b\u0006[\u001c|`y1wKb\n87M7\\PN~\u001f\u001d~0.,w\u007f\u00169l3\u0018t;\u000e;;6qZ2l\u0014OZB%;`Hp\r:J\"\u0015/X\\rH\u001do#jQ\u0013s=z\u001dntcU\u0018\u0003d`:5b[\u0011>acHR}$4V|Qe\u0007|\u0005\u0014*mr\u001f\u0007\f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W$\u0007,D]h\u001cDi\u0018;IN>O=-\"ljG\u000ba:$[\u000b<3T6kYvF]\u0017k\u0016\u0018/\u0016\u0014YN-jK\u0001}\b-E\u0012Bw^\u0016\u001f\u001cDw\u0001@e\u001aTa\u0011\u0003G)u\u001c\u001dP", "5dc\u000ea5Hb\u0015\u000ez]\u001a\f\u00163n\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006R.>c\r\u001cFm\u0015\u001c\\P?t6s", "2hS\u0012k*>S\u0018fvq\u0013\u0001\u0012/s", "5dc\u0011\\+\u001ef\u0017~z]\u0014x\u001c\u0016i\t(\n", "u(I", "4ha@g\t:a\u0019\u0006~g,", "5dc\u0013\\9Lbuz\t^3\u0001\u0012/", "u(5", "6dX4[;", "5dc\u0015X0@V(", "5dc\u0016a;KW\"\r~\\:", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006^5<h\u0002\u000b3z\u00120Z?Fn\u0018'$ueB\u0015g*\\L", ":`bA5(LS \u0003\u0004^", "5dc\u0019T:M0\u0015\rze0\u0006\t", ":h]266N\\(", "5dc\u0019\\5>1#\u000f\u0004m", "u(8", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001aT?\"\\(\f~g:\u0001\u0007!i~7~", "5dc\u001aT?%W\"~\t", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001a\\5\"\\(\f~g:\u0001\u0007!i~7~", ">`a.Z9:^\u001cb\u0004_6c\r=t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:Q\u001f/W\u0019", "5dc\u001dT9:U&z\u0006a\u0010\u0006\n9L\u00046\u000b~\u0011\u001b\u0011Vo!Kp25`}\u001cEm", "u(;7T=:\u001d)\u000e~euc\r=tU", ">kP0X/HZ\u0018~\bK,z\u0018=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "5dc\u001d_(<S\u001c\t\u0002],\nu/c\u000f6", "5dc$\\+MV", "4h[956N\\\u0018\u0003\u0004`\t\u0007\u001c/s", "", "@`]4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "/qa.l", "/qa.l\u001aMO&\u000e", "4h[956N\\\u0018\u0003\u0004`\t\u0007\u001c/sGz|A\u0006ga3", "uIJ\u0013<o44", "5dc\u000f\\+B@)\bYb9|\u0007>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "=eU@X;", "5dc\u000fb<GR\u001d\b|;6\u0010", "5dc\u0010h9L]&kz\\;", "5dc\u0015b9Bh#\b\nZ3g\u0013=i\u000f,\u0006I", "CrT\u001de0FO&\u0013Yb9|\u0007>i\n1", "5dc\u0019\\5>0\u0015\rze0\u0006\t", ":h]2<5=S,", "5dc\u0019\\5>0#\u000e\nh4", "5dc\u0019\\5>3\"}", "Dhb6U3>3\"}", "5dc\u0019\\5>4#\fd_-\u000b\t>", "5dc\u0019\\5>4#\fk^9\f\r-a\u0007\u0013\u0006N\u0005&\u001bQx", "DdaA\\*:Z", "5dc\u0019\\5>6\u0019\u0003|a;", "5dc\u0019\\5>:\u0019\u007f\n", "5dc\u0019\\5>@\u001d\u0001}m", "5dc\u0019\\5>A(z\bm", "5dc\u0019\\5>B#\n", "5dc\u0019\\5>E\u001d}\na", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005\b\u0007^eN[X$", "uI\u0018\u0016", "5dc\u001dT9:U&z\u0006a\u000b\u0001\u0016/c\u000f,\u0006I", "5dc\u001dT;A4#\fgZ5~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "AsP?g", "3mS", "5dc\u001fT5@Sy\t\bK,z\u0018", "@dRA", "5qP;h3:`\u001d\u000e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u0017fy)Gt\u0012;QROA", "7mR9h:B]\"l\nk(\f\t1y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u0019b{'G{\u001a8V1Jx0-\u0015ju\u000f", "5dc\u001fT5@Sy\t\bK,z\u0018v8GxXH\\z", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCy\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\RukR\u0006L]\u0001Z!]\u000f\u0016\u0003`Q2rN@\r\u00179E\u0011;j\u0015aYr", "5dc$b9=0#\u000f\u0004](\n\u001d", "5dc$b9=0#\u000f\u0004](\n\u001dv-\u0005;M%a%", "uH\u0018\u0017", "7r;6a,\u001eZ \u0003\u0006l0\u0012\t.", ">`X;g", "", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "/k_5T", "AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "2dR<e(MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "2qPDF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", ">`X;gsA\\hmZq.", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00044?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\ti\u0012iO'D%\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYW}^wN%sI]]\b\u0011/H^)n\u001e5\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001c\nk1V\u0019\u000eGmL|oME9D<\b6}Ky\u0002\u001f.gx5}\u0003j035q\u000fOf+\b\\\u0003\u001d7fO'oF@\\AX_\u0001oB\fvh`\u0015\ntC/#pe-'\u001c\u0003o\u0005jIh_V\u001b\u0016v", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", ">`X;gs+>!rZd2", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00042*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001ctJ\u0010\u001d]\u0012L9Vr\\=#xV\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?P){U#m\t[HE,\u0019d\u001fn{\\8D1\u0010\u0001\u001d%q&qz", ">`X;gs%5hKN<\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00042*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001ctJ\u0010\u001d]\u0012L9Vr\\=#xV\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?P){U#m\t[HE,\u0019d\u001fn{\\8D1\u0010\u0001\u001d%q&\u0015\u0006\u0005R\u001e|Vxz1E#\u0003C.Lm%VI9WIp2\"Oy\u0006[1ep=\u0003+\u000e?*\u007fC\u0012Gy\u0006Mr\u007f\u0015\u0002@\u0005\u0018", "@d`B\\9>7\"}zq\u0010\u0006u+n\u0002(", "@d`B\\9>7\"}zq\u0010\u0006u+n\u0002(_I~\u001e'Us\u001f<V.4", "@d`B\\9>:\u001d\bzB5{\tBI\t\u0015wI\u0003\u0017", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List<ParagraphInfo> paragraphInfoList;
    private final List<Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List list, int i2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j2, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i2, z2);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j2, i2, z2);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, boolean z2) {
        boolean z3;
        int iM6590getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i2;
        if (Constraints.m6593getMinWidthimpl(j2) != 0 || Constraints.m6592getMinHeightimpl(j2) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
        int size = infoList$ui_text_release.size();
        int i3 = 0;
        float f2 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i5);
            ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2);
            if (Constraints.m6586getHasBoundedHeightimpl(j2)) {
                iM6590getMaxHeightimpl = RangesKt.coerceAtLeast(Constraints.m6590getMaxHeightimpl(j2) - ParagraphKt.ceilToInt(f2), i3);
            } else {
                iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j2);
            }
            Paragraph paragraphM6007Paragraph_EkL_Y = ParagraphKt.m6007Paragraph_EkL_Y(intrinsics, ConstraintsKt.Constraints$default(0, iM6591getMaxWidthimpl, 0, iM6590getMaxHeightimpl, 5, null), this.maxLines - i4, z2);
            float height = f2 + paragraphM6007Paragraph_EkL_Y.getHeight();
            int lineCount = i4 + paragraphM6007Paragraph_EkL_Y.getLineCount();
            arrayList.add(new ParagraphInfo(paragraphM6007Paragraph_EkL_Y, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i4, lineCount, f2, height));
            if (paragraphM6007Paragraph_EkL_Y.getDidExceedMaxLines() || (lineCount == this.maxLines && i5 != CollectionsKt.getLastIndex(this.intrinsics.getInfoList$ui_text_release()))) {
                z3 = true;
                i4 = lineCount;
                f2 = height;
                break;
            } else {
                i5++;
                i4 = lineCount;
                f2 = height;
                i3 = 0;
            }
        }
        z3 = false;
        this.height = f2;
        this.lineCount = i4;
        this.didExceedMaxLines = z3;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.m6591getMaxWidthimpl(j2);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i6);
            List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i7 = 0; i7 < size3; i7++) {
                ArrayList arrayList4 = arrayList3;
                Rect rect = placeholderRects.get(i7);
                arrayList4.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        ArrayList arrayListPlus = arrayList2;
        if (arrayListPlus.size() < this.intrinsics.getPlaceholders().size()) {
            ArrayList arrayList5 = arrayListPlus;
            int size4 = this.intrinsics.getPlaceholders().size() - arrayListPlus.size();
            ArrayList arrayList6 = new ArrayList(size4);
            for (int i8 = 0; i8 < size4; i8++) {
                arrayList6.add(null);
            }
            arrayListPlus = CollectionsKt.plus((Collection) arrayList5, (Iterable) arrayList6);
        }
        this.placeholderRects = arrayListPlus;
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j2, (i3 + 4) - (4 | i3) != 0 ? Integer.MAX_VALUE : i2, (i3 & 8) != 0 ? false : z2, null);
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i2, boolean z2, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? Integer.MAX_VALUE : i2, (i3 + 4) - (i3 | 4) != 0 ? false : z2, f2);
    }

    @Deprecated(message = "\u0010[\bIzd\u0016iYN:{`\u001dkbdM\u001df\u0019i\u0017W\n\u0006{kf}1{u\feNYk\u007f>J]JC\u0016jT9+k\b?jNF\u0017\u000fH(I\u001fBs\u0012s\u001f\u0003v\u001fZ\f\u000fq4\t\u0005V$R:J<;EXp?!", replaceWith = @ReplaceWith(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @InterfaceC1492Gx
    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i2, boolean z2, float f2) {
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f2), 0, 0, 13, null), i2, z2, null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z2, float f2, Density density, Font.ResourceLoader resourceLoader, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i3 + 4) - (i3 | 4) != 0 ? CollectionsKt.emptyList() : list), (i3 + 8) - (i3 | 8) != 0 ? Integer.MAX_VALUE : i2, (-1) - (((-1) - i3) | ((-1) - 16)) != 0 ? false : z2, f2, density, resourceLoader);
    }

    @Deprecated(message = "\tU\nI?f\u001ajg\\:}U\u0001;O`Q\u001bf\u000e{KV{V\u0001oQu8kl\u0018$W`a(?U,G \u0013cU\u0006;JMNtJJ\u0017\u001e\u0007\u001dR.\u000b9\u0003v", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @InterfaceC1492Gx
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z2, float f2, Density density, Font.ResourceLoader resourceLoader) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader)), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f2), 0, 0, 13, null), i2, z2, null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f2, Density density, FontFamily.Resolver resolver, List list, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, f2, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i3 & 32) != 0 ? CollectionsKt.emptyList() : list), (i3 + 64) - (i3 | 64) != 0 ? Integer.MAX_VALUE : i2, (i3 + 128) - (i3 | 128) != 0 ? false : z2);
    }

    @Deprecated(message = "\u0010[\bIzd\u0016iYN:{`\u001dkbdM\u001df\u0019i\u0017W\n\u0006{kf}1{u\feNYk\u007f>J]JC\u0016jT9+k\b?jNF\u0017\u000fH(I\u001fBs\u0012s\u001f\u0003v\u001fZ\f\u000fq4\t\u0005V$R:J<;EXp?!", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @InterfaceC1492Gx
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f2, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z2) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f2), 0, 0, 13, null), i2, z2, null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List list, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j2, density, resolver, (i3 & 32) != 0 ? CollectionsKt.emptyList() : list, (i3 & 64) != 0 ? Integer.MAX_VALUE : i2, (i3 + 128) - (i3 | 128) != 0 ? false : z2, null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z2) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j2, i2, z2, null);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt.last((List) this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default */
    public static /* synthetic */ void m5986paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, int i2, Object obj) {
        Shadow shadow2 = shadow;
        long jM4214getUnspecified0d7_KjU = j2;
        if ((2 & i2) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            shadow2 = null;
        }
        multiParagraph.m5993paintRPmYEkk(canvas, jM4214getUnspecified0d7_KjU, shadow2, (i2 + 8) - (i2 | 8) == 0 ? textDecoration : null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t\u0006|\u001a\u0017fL?:`\u00165\\p\f\u000f<\u0013k [\u0006T.~Vu8&|MoG`\u001ck:T44MQW_96`MztL@+KY\u0019U0\u007fF\u0007vK\u007f8.L\u000b\u0001q'\u001aI")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: paint-RPmYEkk */
    public final /* synthetic */ void m5993paintRPmYEkk(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = list.get(i2);
            paragraphInfo.getParagraph().mo5960paintRPmYEkk(canvas, j2, shadow, textDecoration);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: paint-LG529CI$default */
    public static /* synthetic */ void m5985paintLG529CI$default(MultiParagraph multiParagraph, Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        int iM4736getDefaultBlendMode0nO6VwU = i2;
        long jM4214getUnspecified0d7_KjU = j2;
        Shadow shadow2 = shadow;
        TextDecoration textDecoration2 = textDecoration;
        if ((i3 & 2) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            shadow2 = null;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            textDecoration2 = null;
        }
        DrawStyle drawStyle2 = (i3 + 16) - (i3 | 16) == 0 ? drawStyle : null;
        if ((i3 & 32) != 0) {
            iM4736getDefaultBlendMode0nO6VwU = DrawScope.Companion.m4736getDefaultBlendMode0nO6VwU();
        }
        multiParagraph.m5992paintLG529CI(canvas, jM4214getUnspecified0d7_KjU, shadow2, textDecoration2, drawStyle2, iM4736getDefaultBlendMode0nO6VwU);
    }

    /* JADX INFO: renamed from: paint-LG529CI */
    public final void m5992paintLG529CI(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ParagraphInfo paragraphInfo = list.get(i3);
            paragraphInfo.getParagraph().mo5959paintLG529CI(canvas, j2, shadow, textDecoration, drawStyle, i2);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: paint-hn5TExg$default */
    public static /* synthetic */ void m5987painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        float f3 = f2;
        Shadow shadow2 = shadow;
        int iM4736getDefaultBlendMode0nO6VwU = i2;
        TextDecoration textDecoration2 = textDecoration;
        if ((i3 & 4) != 0) {
            f3 = Float.NaN;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            shadow2 = null;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            textDecoration2 = null;
        }
        DrawStyle drawStyle2 = (i3 + 32) - (i3 | 32) == 0 ? drawStyle : null;
        if ((i3 & 64) != 0) {
            iM4736getDefaultBlendMode0nO6VwU = DrawScope.Companion.m4736getDefaultBlendMode0nO6VwU();
        }
        multiParagraph.m5994painthn5TExg(canvas, brush, f3, shadow2, textDecoration2, drawStyle2, iM4736getDefaultBlendMode0nO6VwU);
    }

    /* JADX INFO: renamed from: paint-hn5TExg */
    public final void m5994painthn5TExg(Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        AndroidMultiParagraphDraw_androidKt.m6377drawMultiParagraph7AXcY_I(this, canvas, brush, f2, shadow, textDecoration, drawStyle, i2);
    }

    public final Path getPathForRange(int i2, int i3) {
        if (i2 < 0 || i2 > i3 || i3 > getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("Start(" + i2 + ") or End(" + i3 + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!").toString());
        }
        if (i2 == i3) {
            return AndroidPath_androidKt.Path();
        }
        Path Path = AndroidPath_androidKt.Path();
        MultiParagraphKt.m5995findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(i2, i3), new Function1<ParagraphInfo, Unit>() { // from class: androidx.compose.ui.text.MultiParagraph.getPathForRange.2
            final /* synthetic */ int $end;
            final /* synthetic */ int $start;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(int i22, int i32) {
                super(1);
                i = i22;
                i = i32;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ParagraphInfo paragraphInfo) {
                invoke2(paragraphInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(ParagraphInfo paragraphInfo) {
                Path.m4448addPathUv8p0NA$default(path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i), paragraphInfo.toLocalIndex(i))), 0L, 2, null);
            }
        });
        return Path;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.MultiParagraph$getPathForRange$2 */
    /* JADX INFO: compiled from: MultiParagraph.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", ">`a.Z9:^\u001cb\u0004_6", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:Q\u001f/W\u0019", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<ParagraphInfo, Unit> {
        final /* synthetic */ int $end;
        final /* synthetic */ int $start;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i22, int i32) {
            super(1);
            i = i22;
            i = i32;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ParagraphInfo paragraphInfo) {
            invoke2(paragraphInfo);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(ParagraphInfo paragraphInfo) {
            Path.m4448addPathUv8p0NA$default(path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i), paragraphInfo.toLocalIndex(i))), 0L, 2, null);
        }
    }

    public final int getLineForVerticalPosition(float f2) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, f2));
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartLineIndex();
        }
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(f2)));
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M */
    public final int m5989getOffsetForPositionk4lQ0M(long j2) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Offset.m3938getYimpl(j2)));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo5956getOffsetForPositionk4lQ0M(paragraphInfo.m6004toLocalMKHz9U(j2)));
    }

    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI */
    public final long m5990getRangeForRect86BmAI(Rect rect, int i2, TextInclusionStrategy textInclusionStrategy) {
        int iFindParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(iFindParagraphByY).getBottom() >= rect.getBottom() || iFindParagraphByY == CollectionsKt.getLastIndex(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByY);
            return ParagraphInfo.m6002toGlobalxdX6G0$default(paragraphInfo, paragraphInfo.getParagraph().mo5957getRangeForRect86BmAI(paragraphInfo.toLocal(rect), i2, textInclusionStrategy), false, 1, null);
        }
        int iFindParagraphByY2 = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
        long jM6128getZerod9O1mEE = TextRange.Companion.m6128getZerod9O1mEE();
        while (TextRange.m6116equalsimpl0(jM6128getZerod9O1mEE, TextRange.Companion.m6128getZerod9O1mEE()) && iFindParagraphByY <= iFindParagraphByY2) {
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iFindParagraphByY);
            jM6128getZerod9O1mEE = ParagraphInfo.m6002toGlobalxdX6G0$default(paragraphInfo2, paragraphInfo2.getParagraph().mo5957getRangeForRect86BmAI(paragraphInfo2.toLocal(rect), i2, textInclusionStrategy), false, 1, null);
            iFindParagraphByY++;
        }
        if (TextRange.m6116equalsimpl0(jM6128getZerod9O1mEE, TextRange.Companion.m6128getZerod9O1mEE())) {
            return TextRange.Companion.m6128getZerod9O1mEE();
        }
        long jM6128getZerod9O1mEE2 = TextRange.Companion.m6128getZerod9O1mEE();
        while (TextRange.m6116equalsimpl0(jM6128getZerod9O1mEE2, TextRange.Companion.m6128getZerod9O1mEE()) && iFindParagraphByY <= iFindParagraphByY2) {
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iFindParagraphByY2);
            jM6128getZerod9O1mEE2 = ParagraphInfo.m6002toGlobalxdX6G0$default(paragraphInfo3, paragraphInfo3.getParagraph().mo5957getRangeForRect86BmAI(paragraphInfo3.toLocal(rect), i2, textInclusionStrategy), false, 1, null);
            iFindParagraphByY2--;
        }
        return TextRange.m6116equalsimpl0(jM6128getZerod9O1mEE2, TextRange.Companion.m6128getZerod9O1mEE()) ? jM6128getZerod9O1mEE : TextRangeKt.TextRange(TextRange.m6123getStartimpl(jM6128getZerod9O1mEE), TextRange.m6118getEndimpl(jM6128getZerod9O1mEE2));
    }

    public final Rect getBoundingBox(int i2) {
        requireIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i2)));
    }

    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q */
    public final float[] m5988fillBoundingBoxes8ffj60Q(final long j2, final float[] fArr, int i2) {
        requireIndexInRange(TextRange.m6121getMinimpl(j2));
        requireIndexInRangeInclusiveEnd(TextRange.m6120getMaximpl(j2));
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i2;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        MultiParagraphKt.m5995findParagraphsByRangeSbBc2M(this.paragraphInfoList, j2, new Function1<ParagraphInfo, Unit>() { // from class: androidx.compose.ui.text.MultiParagraph$fillBoundingBoxes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ParagraphInfo paragraphInfo) {
                invoke2(paragraphInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ParagraphInfo paragraphInfo) {
                long j3 = j2;
                float[] fArr2 = fArr;
                Ref.IntRef intRef2 = intRef;
                Ref.FloatRef floatRef2 = floatRef;
                long jTextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m6121getMinimpl(j3) ? paragraphInfo.getStartIndex() : TextRange.m6121getMinimpl(j3)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m6120getMaximpl(j3) ? paragraphInfo.getEndIndex() : TextRange.m6120getMaximpl(j3)));
                paragraphInfo.getParagraph().mo5954fillBoundingBoxes8ffj60Q(jTextRange, fArr2, intRef2.element);
                int iM6119getLengthimpl = intRef2.element + (TextRange.m6119getLengthimpl(jTextRange) * 4);
                for (int i3 = intRef2.element; i3 < iM6119getLengthimpl; i3 += 4) {
                    int i4 = i3 + 1;
                    fArr2[i4] = fArr2[i4] + floatRef2.element;
                    int i5 = i3 + 3;
                    fArr2[i5] = fArr2[i5] + floatRef2.element;
                }
                intRef2.element = iM6119getLengthimpl;
                floatRef2.element += paragraphInfo.getParagraph().getHeight();
            }
        });
        return fArr;
    }

    public final float getHorizontalPosition(int i2, boolean z2) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i2);
        if (i2 == getAnnotatedString().length()) {
            iFindParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i2), z2);
    }

    public final ResolvedTextDirection getParagraphDirection(int i2) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i2);
        if (i2 == getAnnotatedString().length()) {
            iFindParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(i2));
    }

    public final ResolvedTextDirection getBidiRunDirection(int i2) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i2);
        if (i2 == getAnnotatedString().length()) {
            iFindParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i2));
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs */
    public final long m5991getWordBoundaryjx7JFs(int i2) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i2);
        if (i2 == getAnnotatedString().length()) {
            iFindParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.m6003toGlobalxdX6G0(paragraphInfo.getParagraph().mo5958getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i2)), false);
    }

    public final Rect getCursorRect(int i2) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i2);
        if (i2 == getAnnotatedString().length()) {
            iFindParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(i2)));
    }

    public final int getLineForOffset(int i2) {
        int iFindParagraphByIndex;
        if (i2 >= getAnnotatedString().length()) {
            iFindParagraphByIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iFindParagraphByIndex = i2 < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(i2)));
    }

    public final float getLineLeft(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(i2));
    }

    public final float getLineRight(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(i2));
    }

    public final float getLineTop(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(i2)));
    }

    public final float getLineBaseline(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBaseline(paragraphInfo.toLocalLineIndex(i2)));
    }

    public final float getLineBottom(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(i2)));
    }

    public final float getLineHeight(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(i2));
    }

    public final float getLineWidth(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(i2));
    }

    public final int getLineStart(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(i2)));
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i2, boolean z2, int i3, Object obj) {
        if ((i3 + 2) - (i3 | 2) != 0) {
            z2 = false;
        }
        return multiParagraph.getLineEnd(i2, z2);
    }

    public final int getLineEnd(int i2, boolean z2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(i2), z2));
    }

    public final boolean isLineEllipsized(int i2) {
        requireLineIndexInRange(i2);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2)).getParagraph().isLineEllipsized(i2);
    }

    private final void requireIndexInRange(int i2) {
        if (i2 < 0 || i2 >= getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("offset(" + i2 + ") is out of bounds [0, " + getAnnotatedString().length() + ')').toString());
        }
    }

    private final void requireIndexInRangeInclusiveEnd(int i2) {
        if (i2 < 0 || i2 > getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("offset(" + i2 + ") is out of bounds [0, " + getAnnotatedString().length() + AbstractJsonLexerKt.END_LIST).toString());
        }
    }

    private final void requireLineIndexInRange(int i2) {
        if (i2 < 0 || i2 >= this.lineCount) {
            throw new IllegalArgumentException(("lineIndex(" + i2 + ") is out of bounds [0, " + this.lineCount + ')').toString());
        }
    }
}
