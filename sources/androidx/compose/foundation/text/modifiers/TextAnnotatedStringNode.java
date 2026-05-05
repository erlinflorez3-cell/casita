package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŏ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,Ӌ,qY;]\u001a\u0014\"\u0011O\\goñRZ!C\u0017إ\u001exx5Qǁ\u0001] \u0015:Bu?;M}[A`\u000b6\r H\"@ц\r\u00010*PƵ~zYK\u0014۵8@\u0007:Z҈U\u00050\u0012\u000e>&\u0001&\\}N>ԟt]HR+\u0003\u007fBV'e5\u0005M\u001be\\'\u0013\u0003i\u001eA@?ߎ\u001d%i\u0003\u000fRa@\u000b?\b=\rؒ/'AI{W<Z\b\u0014++WՕer<\\\rQv\f/˃WcaP\u0016(}\b\u0004\rR\u0004\u0016\u0006-O4Ʀ0Ǒ8\u000eas#SnP2^p\u0001+ad\u0019]~\u001akޓ\u001avUo>1Ne\u007f\u0015\u0011,(\u0019nOad\u0012n\u001c3T&YAeF=VW\"gMo\u0014p\u0011\r:\u0006@G.;\u0012\u0010\\!5=a91.\u0004\u0002vRw|\u000b`vb\u0002RvP2t\u001c78\u001a$Zrv\u0015qVTf?)MJf\u0017\u0012\u000e\u0013.p\u0010J1- T_jyj{t8;Eeen~\b\u0014WGvKKam ibz$ARa3q\u0015Wc\u000ej\\V.HG\u0019\u001a\b\u0004JN\u001a-JA\b\u001bbGA!b\u0015V\u001f6DW{7|j|\u0016~bQ<\u0011y&\u0005\t/olr\u007fg'UB{\u000f,έEQC9n`0\u001cL|Q\u0013E͞õKgR{\u0015\u0011$+m{N\"J=_eU\u0013=\u000fY6\u0010d]L!u\u0002Q _\u0013|(\u001fkl<! j\u001f<)vX\nl\u0017P\u0003\u000fv1C|\u007f(\u001e\u000f\tU\rl\u000b\n`yv\u0011\u0017TNf;K\u001ff+\u000f/:|c9\n'e2\u0006TG\u0015\u0010o\u001as<;z\u000fT7\u0016\b:'.o\u0011\u0016\u000e6I}aY-Pj@zIZH\u0019\n8F\u0017u%3v\u0004\u0015td{e\u000b]B\u0017\u000b:T\tV\nL[\u0016\f|F_X=s\u0002\")[%?\u0019\u0004k{1c\\9\u0017?\u000e\u0019IIn@j\u07b4\u001f݈͓f\u000b6U\u0002h~]I4\u001d<76d0JI#C\u0003,6\u0014\tC^_=[bF\u0002\u0001n\u000e\u0003\u000b%rVWxE\u000f3Z\u0005\rPK\u001e'wa\t{\nl/\u0012v1W+P3j}\u0011/39\u0018l9I8\t\u0005\u0019\u001auCw\u0006|\u0004\u0010\u0002{A\b\ff(-/P!3Ga\u0013ov^i\u001bWtN\u0013\u0003(e\u0001XRC\r\u0013\u0015$L\u0014\u001f\u0013)S\u0003qx,zg&LS\u001c\u0011\u0017r5\u001d\u000b+mv!; M/SH\u0019/W\u000eeqS\f\u0018\"0'2\u00141^g\u000e\u0015\u0016s\u001ah :,pX!\u0013~044XL\u000b\fD\u0007dl27\u0010\u0018vY\u001a}i\u00155\u0004\u0005\u0006p[\u0019|\u0018h\u0005c\u001d[;\u0015tEn\b~5`#\u0019)].Ao\tP'RNmA\u0004\"(>\u001fd\u001a\u0013-\u001e`{h\u001f}\u007f_\u001b:GkXqa4`%\u0016\u001f(}4.b5-;\u0005[ͷcӷЁpD]glEpw\u0003gA\u0014+\u000fxb\u001f\u0016LF!\"+ӵё\u001d\u001fai\u0010j\u0015a]IT-YRmy}FSy6V)\u0003hn\u001d\u007fX~O\u0007H\u0002:\u000e^Tk,OYR0\u0015\u00074\u000f]8pL\\\u0015\u001cVGZf2\u0005pb6I3KAG#)\u0015fH \u000b'x\u0003Q\u0002iZ\u0005\u000bH%?(C2N<[\u0001\u0006G\u000f\u001ed\u007ffipeiZj$\u0002\u0014\u0017/Qq$'aZ\u0018{Y˃x\u07baˑ\u0004\f%\b2V>=\u000e*IHXq\u0005@\u00056\b\b4mNnrgwp\u00079\",\u0018*:x${B'\u0013\u0014GVf*[/7I[,\u0012\u000brQu\u0018EV\u001e)a)C$ \u007fNLatc.\u000b\u007f\u0013ͫ\u007f̿>2i\u058cJgN|B\u0014=\u0014dc\u0019\u0010}So\u0010f$#\f2\u001c\bײlڞd# ñ[xL\\j \u001eMp\u0012X\u000fRf\u0005˺\u0018ƨ\n\u00166Ѓg\u0014\frx\u0015AU}4\u0018ڪ\u0014\u0382\u007f%5\u0013aN\u0014O8vUPmq\u0007O\u0010ߕ\u0017ǮNX=ƶ-\u0011c4cdY'VӰ7ʜKVFϖzz\u0014&]zX\u001aT\u0001T,}2F/~\u0018\tXm\u0003,\u001fka+d-<9ۜg܌\u0015+?ǚ?lcAE\u0007\u0012\u0005 AG2\u001b c9`/\n\f_HRŃhƖY|u۞`\u001doS9=\u0016A?AywfgO\u0019\u0006K\u0015\u000bN1zʪ\u001fۄfg\u001bث^6m\u0010d6\u00057\u001fÄeͭeޞڡ\u000eyȁ\u00100\u00148c1\u000e\u0014\u001f~47Q^nI\u0005\u0080\u0015ºSj\u0004ۑ6\nt\tq[U3\u0006\u001fN3\u0002\u0011\u0012f\u000e*\u0005P\u000bm\u0015܅cۗD\u0013\n§m4o\u0016`+F\u0016\u0004~D؍\u007fئd\u0011aۅ<Pr&\u000bztFsDLJ|\u0019\u0015Z,HaFr\t\u000f\u0001^@>lCԱ3̡Lj!ɮQWo&,7r\u0007y\u05ca?؞&a*ˬ.1UO\u001e\u000e\u0019gNð\bׁ76\u0015ѥ|\t#\bVf!\bCϹYܝ\bk7Ȋ\u0017tNJE\\=l\u0017'\u0001Ą\u0018Ё\t8vևjS{N\u0001\u0015\u001f%$KO\nٸG*\u001b\u0006\u001f۟$`L`ztw\u05ff)\u0016"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0004htHbl5X\u0006#VLM\u001ak_vF\u0016zd\rN\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9{<~!>h\u0002\u001eEU -QD?kA\u0007\u001fga\u000f", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "=mC2k;%O-\t\u000bm", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "AnUAJ9:^", "", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "=m?9T*>V#\u0006y^9c\u0005Co\u00107", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "Ad[2V;B]\"\\\u0005g;\n\u00136l\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0003hh9\u0005r0X\u007f\u0005QU]9fYy=!g", "=uT?e0=Sv\t\u0002h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DX#8LS9kAs", "=mB5b>-`\u0015\b\te(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0004htHbl5X\u0006#VLM\u001ak_vF\u0016zd\rNi{\u0005lP\u0012~AE.\f;Y\u0011?r\n|\u0012\u0015EjF", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2UYr\t\u0011BOk9.li&k\u001b6,\u0018x-YUP<\u0014\u0003d\u0011\u007f(`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r\u007f\u007f\u001aYh/N\u001d:ot^<kE.o\u001d@!N!J{vM\u0015l(+\r\u001fj~2)ncrL\u0019\u0010k`<Ej]\u0010;\\\u000f\n\u001fV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\u0002$\u0001M![ \u0007\roa+.)L#\u0017r)c8Q\u0013\u0016v\u0002y{`C\u0013\u007fL\u001av)|df|.=\u007f\u0011Vv\u001aGEu_Ms\u000f)}~\u0015\u0007(}wBCF\u0017n'JUCed-\u001911, qE\u0007,70\u0012P@{4^-\u001f\r\u0015l\u0006^bO@K4QRh1@mT\u0013\u0006;b\u0019*\\\u00199i@k)a}DQr\u0017I\t<\u0001\\ 55uT(c\"xE\f\r\u0006\u007f$>x\u000ba\\%Z#lWR'eW<\u000b\u0010/\u001c,\u0006", "-kPFb<M1\u0015|}^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg|xhH\u000bN([r)THY/CN\u0007G$!8\nL.\rZ", "0`b2_0GSvzxa,", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "5dc\u000fT:>Z\u001d\bz<(z\f/${1\u0005J\u0010\u0013&Ky\u0017J", "u(E", ":`h<h;\u001cO\u0017\u0002z", "5dc\u0019T@Hc(\\v\\/|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001e8LG<o4+#2II\u000er09r4CN[(gUY9(\u001cj\u001d,'\u000b\bY\u0017", "\u0017", "Ad\\.a;BQ'mzq;c\u0005Co\u00107h@\u000f'\u001eV", "", "BdgAF<;a(\u0003\nn;\u0001\u00138", "5dc!X?MA){\tm0\f\u0019>i\n1:A\u000b' Fk\u001d@\u0001./f}'7i$.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001e8LG<o4+#2P9\u001ar\bW\u007f1VH],[@\u0002J\u0018\u001b\\vX*\rCHA7}2G\u001c\u0016;M\u0011Kw\u0005\u0016\u001f~1q\u0001B,", "Adc!X?MA){\tm0\f\u0019>i\n1:A\u000b' Fk\u001d@\u0001./f}'7i$.", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001u -QD?kA,^WaL\u0016?5W\u00016C[N+Ja\u007fA\u001d\u0014C\u0018M+KsYT3\\T4-\u00170X\u0012Jl\u000b\u0015\u0007\n<zp\u0018\u001a\u0001", "1kT.e\u001aNP'\u000e~m<\f\r9n", "1kT.e\u001aNP'\u000e~m<\f\r9n>)\u0006P\n\u0016\u0013Vs\u0018Ep25`}\u001cEm", "2n8;i(EW\u0018z\nb6\u0006\u0017", "2qPD6/:\\\u001b~y", "BdgA6/:\\\u001b~y", ":`h<h;\u001cV\u0015\b|^+", "1`[9U(<Y'\\}Z5~\t.", "2qPDA6G3,\u000ezg:\u0001\u00138", "1n]AX5M2&z\rL*\u0007\u0014/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "7me._0=O(~[h9k\u0016+n\u000e/wO\u0001", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f\u0011\u0006I`*&Gx\u001c@\u0001.", "7mc?\\5LW\u0017fzZ:\r\u0016/S}2\u0007@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>hh2\u0005 \u0014&\u0017P}\u0012F\u007f", "6dX4[;", ";dP@h9><#\bZq;|\u0012=i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", ";dP@h9>A\u0017\t\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9><#\bZq;|\u0012=i\n1C\u000e\fc%\u001a:\u001c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f\u0011\u0006I`*&Gx\u001c@\u0001.", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>hh2\u0005 \u0014&\u0017P}\u0012F\u007f", "Adc h)Lb\u001d\u000e\u000bm0\u0007\u0012", "CoS.g,=B\u0019\u0012\n", "CoS.g,\u001cO \u0006wZ*\u0003\u0017", "CoS.g,\u001d`\u0015\u0011", "1n[<e", "CoS.g,%O-\t\u000bm\u0019|\u0010+t\u007f'WM\u0003%", "CoS.g,%O-\t\u000bm\u0019|\u0010+t\u007f'WM\u0003%^/Z|\rI-;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8DG\r4>mk\u0015R?Lg}.$lh\u0003mg:]L\u000b+A5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;h\u0017,\\\u0011\u0005i\u000b\u0015%W\u0016tyQ7\fO}\u001c\n\u007f\u0016hTcf\u000bGN\u001bFmY", "CoS.g,-S,\u000e", "CoS.g,-S,\u000e9_6\r\u0012.a\u000f,\u0006Iz$\u0017No\nJv", "/o_9l\u001a>[\u0015\b\nb*\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "2qPD", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", ";dP@h9>", ";dP@h9>\u001bf\nGl~G\u0017", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "\"dgAF<;a(\u0003\nn;\u0001\u00138V{/\f@", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private MultiParagraphLayoutCache _layoutCache;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private Function1<? super List<Rect>, Unit> onPlaceholderLayout;
    private Function1<? super TextSubstitutionValue, Unit> onShowTranslation;
    private Function1<? super TextLayoutResult, Unit> onTextLayout;
    private int overflow;
    private ColorProducer overrideColor;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private SelectionController selectionController;
    private Function1<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;
    private TextSubstitutionValue textSubstitution;

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, selectionController, colorProducer, function13);
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, Function1 function13, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (-1) - (((-1) - i5) | ((-1) - 8)) != 0 ? null : function1, (i5 + 16) - (i5 | 16) != 0 ? TextOverflow.Companion.m6576getClipgIe3tQ8() : i2, (i5 + 32) - (i5 | 32) != 0 ? true : z2, (i5 + 64) - (i5 | 64) != 0 ? Integer.MAX_VALUE : i3, (i5 + 128) - (i5 | 128) == 0 ? i4 : 1, (i5 & 256) != 0 ? null : list, (-1) - (((-1) - i5) | ((-1) - 512)) != 0 ? null : function12, (i5 + 1024) - (i5 | 1024) != 0 ? null : selectionController, (-1) - (((-1) - i5) | ((-1) - 2048)) != 0 ? null : colorProducer, (i5 & 4096) == 0 ? function13 : null, null);
    }

    private TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1<? super TextLayoutResult, Unit> function1, int i2, boolean z2, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer, Function1<? super TextSubstitutionValue, Unit> function13) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = function1;
        this.overflow = i2;
        this.softWrap = z2;
        this.maxLines = i3;
        this.minLines = i4;
        this.placeholders = list;
        this.onPlaceholderLayout = function12;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
        this.onShowTranslation = function13;
    }

    public final MultiParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        Intrinsics.checkNotNull(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    private final MultiParagraphLayoutCache getLayoutCache(Density density) {
        MultiParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.isShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation_release(density);
            return layoutCache;
        }
        MultiParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation_release(density);
        return layoutCache2;
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle textStyle) {
        boolean zAreEqual = Intrinsics.areEqual(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return (zAreEqual && textStyle.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    public final boolean updateText$foundation_release(AnnotatedString annotatedString) {
        boolean zAreEqual = Intrinsics.areEqual(this.text.getText(), annotatedString.getText());
        boolean z2 = (zAreEqual && Intrinsics.areEqual(this.text.getSpanStyles(), annotatedString.getSpanStyles()) && Intrinsics.areEqual(this.text.getParagraphStyles(), annotatedString.getParagraphStyles()) && this.text.hasEqualAnnotations(annotatedString)) ? false : true;
        if (z2) {
            this.text = annotatedString;
        }
        if (!zAreEqual) {
            clearSubstitution$foundation_release();
        }
        return z2;
    }

    /* JADX INFO: renamed from: updateLayoutRelatedArgs-MPT68mk */
    public final boolean m1659updateLayoutRelatedArgsMPT68mk(TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, int i3, boolean z2, FontFamily.Resolver resolver, int i4) {
        boolean z3 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
        if (!Intrinsics.areEqual(this.placeholders, list)) {
            this.placeholders = list;
            z3 = true;
        }
        if (this.minLines != i2) {
            this.minLines = i2;
            z3 = true;
        }
        if (this.maxLines != i3) {
            this.maxLines = i3;
            z3 = true;
        }
        if (this.softWrap != z2) {
            this.softWrap = z2;
            z3 = true;
        }
        if (!Intrinsics.areEqual(this.fontFamilyResolver, resolver)) {
            this.fontFamilyResolver = resolver;
            z3 = true;
        }
        if (TextOverflow.m6569equalsimpl0(this.overflow, i4)) {
            return z3;
        }
        this.overflow = i4;
        return true;
    }

    public final boolean updateCallbacks(Function1<? super TextLayoutResult, Unit> function1, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, Function1<? super TextSubstitutionValue, Unit> function13) {
        boolean z2;
        if (this.onTextLayout != function1) {
            this.onTextLayout = function1;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.onPlaceholderLayout != function12) {
            this.onPlaceholderLayout = function12;
            z2 = true;
        }
        if (!Intrinsics.areEqual(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z2 = true;
        }
        if (this.onShowTranslation == function13) {
            return z2;
        }
        this.onShowTranslation = function13;
        return true;
    }

    public final void doInvalidations(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (z3 || z4 || z5) {
            getLayoutCache().m1647updateZNqEYIc(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
        }
        if (isAttached()) {
            if (z3 || (z2 && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (z3 || z4 || z5) {
                LayoutModifierNodeKt.invalidateMeasurement(this);
                DrawModifierNodeKt.invalidateDraw(this);
            }
            if (z2) {
                DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    /* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007fјnjO0LeNAZS8\u0015sڔ<$i0yّA٭ \u0014̝9O|f(\u0018Z^\u0019C'\u0006Dyz0WW\u0011]@\u0010BHu?AP\b=gd\u0005>\u000b @'P{\u001b\u007fH0Н\u0014v\tJ\u0014\u0013 DXphSȘ\u0006b\u0019\u0014S8\u0001L].ߵ7\u0011skPG#1m\tľ((9\u000bd%Hj&;|(ԣ,\thC-=S1ޗ\u0003aE\u0003MqU\u0005\u0017(W1Ose8p\u007fB\u0016[U\u0013]\u0001)t\u0005\u007fd</1OqPh\u0010>v)\u0002Sʤ\u0003V\u00175aF-Hj8\u0014A\u000f\u000bUVO0]\tɬ{*=%@\u00183YUaǯP*B'kO{3+dƗ\u007f?9iW&`C\u001f+ȴ]śULEʰf\f_@{\f\u0011d\b3\u0012:\u0018\u001a=\u0001)0-$ea\u0010\u0601-Ƞ\u0006TLϙ\u000f\u0007fsaurJF/|$\b9\u0017\frD\u0013\u0006\u07fbTZ`\u008c)O\"c\u0015\u000eX+.^\u0010<O&fʡ[ŹmvUΪ\"'5wEi\u000fm\u0014iGqۑ9p"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0004htHbl5X\u0006#VLM\u001ak_vF\u0016zd\rNi{\u0005lP\u0012~AE.\f;Y\u0011?r\n|\u0012\u0015EjF", "", "=qX4\\5:Z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "AtQ@g0Mc(\u0003\u0005g", "7rB5b>B\\\u001bl\u000b[:\f\r>u\u000f,\u0006I", "", ":`h<h;\u001cO\u0017\u0002z", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg|xhH\u000bN([r)THY/CN\u0007G$!8\nL.\rZ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V`bJ.}@F\u001f\u0007\u001aX\u000f?q\u0003a\u000bt1soO`\u0014F\r^sK1sPg_CHKUk)`\u001bc'e\u0004I$'\u0001b#rO2\u000b\u007fS\u001e\u0001\u001cawnV\u001de41:ohBPr<8\t1/ZYs\u00105XJne", "u(I", "Adc [6PW\"\u0001hn)\u000b\u00183t\u00107\u007fJ\n", "uY\u0018#", "5dc\u0019T@Hc(\\v\\/|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001e8LG<o4+#2II\u000er09r4CN[(gUY9(\u001cj\u001d,'\u000b\bY\u0017", "Adc\u0019T@Hc(\\v\\/|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001u -QD?kA,^Pq@\u0016g\u0017J\u0004#IYJ7_9nQ\u001e\"ikJ)\u0010\u0005/\u0005\u0015", "5dc\u001ce0@W\"z\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006R.>c\r\u001cFm\u0015\u001c\\P?t6s", "5dc h)Lb\u001d\u000e\u000bm0\u0007\u0012", "Adc h)Lb\u001d\u000e\u000bm0\u0007\u0012", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\na\u0006", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;
        private MultiParagraphLayoutCache layoutCache;
        private final AnnotatedString original;
        private AnnotatedString substitution;

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z2, MultiParagraphLayoutCache multiParagraphLayoutCache, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                annotatedString = textSubstitutionValue.original;
            }
            if ((i2 + 2) - (2 | i2) != 0) {
                annotatedString2 = textSubstitutionValue.substitution;
            }
            if ((i2 + 4) - (4 | i2) != 0) {
                z2 = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i2 + 8) - (i2 | 8) != 0) {
                multiParagraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(annotatedString, annotatedString2, z2, multiParagraphLayoutCache);
        }

        public final AnnotatedString component1() {
            return this.original;
        }

        public final AnnotatedString component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        public final MultiParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        public final TextSubstitutionValue copy(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z2, MultiParagraphLayoutCache multiParagraphLayoutCache) {
            return new TextSubstitutionValue(annotatedString, annotatedString2, z2, multiParagraphLayoutCache);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return Intrinsics.areEqual(this.original, textSubstitutionValue.original) && Intrinsics.areEqual(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && Intrinsics.areEqual(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.layoutCache;
            return iHashCode + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z2, MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
            this.isShowingSubstitution = z2;
            this.layoutCache = multiParagraphLayoutCache;
        }

        public /* synthetic */ TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z2, MultiParagraphLayoutCache multiParagraphLayoutCache, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(annotatedString, annotatedString2, (4 & i2) != 0 ? false : z2, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : multiParagraphLayoutCache);
        }

        public final AnnotatedString getOriginal() {
            return this.original;
        }

        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public final void setSubstitution(AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setShowingSubstitution(boolean z2) {
            this.isShowingSubstitution = z2;
        }

        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final void setLayoutCache(MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.layoutCache = multiParagraphLayoutCache;
        }
    }

    public final TextSubstitutionValue getTextSubstitution$foundation_release() {
        return this.textSubstitution;
    }

    public final void setTextSubstitution$foundation_release(TextSubstitutionValue textSubstitutionValue) {
        this.textSubstitution = textSubstitutionValue;
    }

    public final boolean setSubstitution(AnnotatedString annotatedString) {
        Unit unit;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (Intrinsics.areEqual(annotatedString, textSubstitutionValue.getSubstitution())) {
                return false;
            }
            textSubstitutionValue.setSubstitution(annotatedString);
            MultiParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
            if (layoutCache != null) {
                layoutCache.m1647updateZNqEYIc(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            return unit != null;
        }
        TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, annotatedString, false, null, 12, null);
        MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        multiParagraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
        textSubstitutionValue2.setLayoutCache(multiParagraphLayoutCache);
        this.textSubstitution = textSubstitutionValue2;
        return true;
    }

    public final void invalidateForTranslate() {
        SemanticsModifierNodeKt.invalidateSemantics(this);
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    public final void clearSubstitution$foundation_release() {
        this.textSubstitution = null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        AnonymousClass1 anonymousClass1 = this.semanticsTextLayoutResult;
        if (anonymousClass1 == null) {
            anonymousClass1 = new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.1
                AnonymousClass1() {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Boolean invoke(java.util.List<androidx.compose.ui.text.TextLayoutResult> r54) {
                    /*
                        r53 = this;
                        r1 = r53
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getLayoutCache(r0)
                        androidx.compose.ui.text.TextLayoutResult r47 = r0.getLayoutOrNull()
                        if (r47 == 0) goto Lc4
                        androidx.compose.ui.text.TextLayoutInput r34 = new androidx.compose.ui.text.TextLayoutInput
                        androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                        androidx.compose.ui.text.AnnotatedString r35 = r0.getText()
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.ui.text.TextStyle r2 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getStyle$p(r0)
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.ui.graphics.ColorProducer r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getOverrideColor$p(r0)
                        if (r0 == 0) goto Lbc
                        long r3 = r0.mo2078invoke0d7_KjU()
                    L2a:
                        r32 = 16777214(0xfffffe, float:2.3509884E-38)
                        r33 = 0
                        r5 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r10 = 0
                        r11 = 0
                        r12 = 0
                        r14 = 0
                        r15 = 0
                        r16 = 0
                        r17 = 0
                        r19 = 0
                        r20 = 0
                        r21 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 0
                        r26 = 0
                        r27 = 0
                        r28 = 0
                        r29 = 0
                        r30 = 0
                        r31 = 0
                        androidx.compose.ui.text.TextStyle r36 = androidx.compose.ui.text.TextStyle.m6143mergedA7vx0o$default(r2, r3, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33)
                        androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                        java.util.List r37 = r0.getPlaceholders()
                        androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                        int r38 = r0.getMaxLines()
                        androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                        boolean r39 = r0.getSoftWrap()
                        androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                        int r40 = r0.m6092getOverflowgIe3tQ8()
                        androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                        androidx.compose.ui.unit.Density r41 = r0.getDensity()
                        androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                        androidx.compose.ui.unit.LayoutDirection r42 = r0.getLayoutDirection()
                        androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                        androidx.compose.ui.text.font.FontFamily$Resolver r43 = r0.getFontFamilyResolver()
                        androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                        long r44 = r0.m6091getConstraintsmsEJaDk()
                        r46 = 0
                        r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46)
                        r51 = 2
                        r52 = 0
                        r49 = 0
                        r48 = r34
                        androidx.compose.ui.text.TextLayoutResult r0 = androidx.compose.ui.text.TextLayoutResult.m6093copyO0kMr_c$default(r47, r48, r49, r51, r52)
                        if (r0 == 0) goto Lc4
                        r1 = r54
                        r1.add(r0)
                    Lb2:
                        if (r0 == 0) goto Lba
                        r0 = 1
                    Lb5:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    Lba:
                        r0 = 0
                        goto Lb5
                    Lbc:
                        androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.Companion
                        long r3 = r0.m4214getUnspecified0d7_KjU()
                        goto L2a
                    Lc4:
                        r0 = 0
                        goto Lb2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.AnonymousClass1.invoke(java.util.List):java.lang.Boolean");
                }
            };
            this.semanticsTextLayoutResult = anonymousClass1;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.getSubstitution());
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.2
            AnonymousClass2() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(AnnotatedString annotatedString) {
                TextAnnotatedStringNode.this.setSubstitution(annotatedString);
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new Function1<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.3
            AnonymousClass3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }

            public final Boolean invoke(boolean z2) {
                if (TextAnnotatedStringNode.this.getTextSubstitution$foundation_release() != null) {
                    Function1 function1 = TextAnnotatedStringNode.this.onShowTranslation;
                    if (function1 != null) {
                        TextSubstitutionValue textSubstitution$foundation_release = TextAnnotatedStringNode.this.getTextSubstitution$foundation_release();
                        Intrinsics.checkNotNull(textSubstitution$foundation_release);
                        function1.invoke(textSubstitution$foundation_release);
                    }
                    TextSubstitutionValue textSubstitution$foundation_release2 = TextAnnotatedStringNode.this.getTextSubstitution$foundation_release();
                    if (textSubstitution$foundation_release2 != null) {
                        textSubstitution$foundation_release2.setShowingSubstitution(z2);
                    }
                    TextAnnotatedStringNode.this.invalidateForTranslate();
                    return true;
                }
                return false;
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.4
            AnonymousClass4() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                TextAnnotatedStringNode.this.clearSubstitution$foundation_release();
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, anonymousClass1, 1, null);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$1 */
    /* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,r\bӵLc\u0003#I\u0006F\u000b6B\u0005\":ߚ\u0010\u0007\u0015ii:Re`4bU:\u000f\u001a}b%\",ڱG=[\u001d\f&"}, d2 = {"\n`]<a@F])\rS", "", "BdgA?(R])\u000eg^:\r\u0010>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "7me<^,", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0002?c\u0005 3vk"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<TextLayoutResult> v2) {
            /*
                this = this;
                r1 = r53
                androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getLayoutCache(r0)
                androidx.compose.ui.text.TextLayoutResult r47 = r0.getLayoutOrNull()
                if (r47 == 0) goto Lc4
                androidx.compose.ui.text.TextLayoutInput r34 = new androidx.compose.ui.text.TextLayoutInput
                androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                androidx.compose.ui.text.AnnotatedString r35 = r0.getText()
                androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                androidx.compose.ui.text.TextStyle r2 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getStyle$p(r0)
                androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                androidx.compose.ui.graphics.ColorProducer r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getOverrideColor$p(r0)
                if (r0 == 0) goto Lbc
                long r3 = r0.mo2078invoke0d7_KjU()
            L2a:
                r32 = 16777214(0xfffffe, float:2.3509884E-38)
                r33 = 0
                r5 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                androidx.compose.ui.text.TextStyle r36 = androidx.compose.ui.text.TextStyle.m6143mergedA7vx0o$default(r2, r3, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33)
                androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                java.util.List r37 = r0.getPlaceholders()
                androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                int r38 = r0.getMaxLines()
                androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                boolean r39 = r0.getSoftWrap()
                androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                int r40 = r0.m6092getOverflowgIe3tQ8()
                androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                androidx.compose.ui.unit.Density r41 = r0.getDensity()
                androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                androidx.compose.ui.unit.LayoutDirection r42 = r0.getLayoutDirection()
                androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                androidx.compose.ui.text.font.FontFamily$Resolver r43 = r0.getFontFamilyResolver()
                androidx.compose.ui.text.TextLayoutInput r0 = r47.getLayoutInput()
                long r44 = r0.m6091getConstraintsmsEJaDk()
                r46 = 0
                r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46)
                r51 = 2
                r52 = 0
                r49 = 0
                r48 = r34
                androidx.compose.ui.text.TextLayoutResult r0 = androidx.compose.ui.text.TextLayoutResult.m6093copyO0kMr_c$default(r47, r48, r49, r51, r52)
                if (r0 == 0) goto Lc4
                r1 = r54
                r1.add(r0)
            Lb2:
                if (r0 == 0) goto Lba
                r0 = 1
            Lb5:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            Lba:
                r0 = 0
                goto Lb5
            Lbc:
                androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.Companion
                long r3 = r0.m4214getUnspecified0d7_KjU()
                goto L2a
            Lc4:
                r0 = 0
                goto Lb2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.AnonymousClass1.invoke(java.util.List):java.lang.Boolean");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$2 */
    /* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "CoS.g,=B\u0019\u0012\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\na{m]J\u0003-3J\u007f)\u0011)X6cRnFi"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<AnnotatedString, Boolean> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AnnotatedString annotatedString) {
            TextAnnotatedStringNode.this.setSubstitution(annotatedString);
            TextAnnotatedStringNode.this.invalidateForTranslate();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$3 */
    /* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "", "7s", "7me<^,", "uY\u0018\u0019](OOb\u0006vg.Fe9o\u0007(wIV"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function1<Boolean, Boolean> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }

        public final Boolean invoke(boolean z2) {
            if (TextAnnotatedStringNode.this.getTextSubstitution$foundation_release() != null) {
                Function1 function1 = TextAnnotatedStringNode.this.onShowTranslation;
                if (function1 != null) {
                    TextSubstitutionValue textSubstitution$foundation_release = TextAnnotatedStringNode.this.getTextSubstitution$foundation_release();
                    Intrinsics.checkNotNull(textSubstitution$foundation_release);
                    function1.invoke(textSubstitution$foundation_release);
                }
                TextSubstitutionValue textSubstitution$foundation_release2 = TextAnnotatedStringNode.this.getTextSubstitution$foundation_release();
                if (textSubstitution$foundation_release2 != null) {
                    textSubstitution$foundation_release2.setShowingSubstitution(z2);
                }
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$4 */
    /* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function0<Boolean> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            TextAnnotatedStringNode.this.clearSubstitution$foundation_release();
            TextAnnotatedStringNode.this.invalidateForTranslate();
            return true;
        }
    }

    /* JADX INFO: renamed from: measureNonExtension-3p2s80s */
    public final MeasureResult m1658measureNonExtension3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        return mo428measure3p2s80s(measureScope, measurable, j2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        MultiParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
        boolean zM1646layoutWithConstraintsK40F9xA = layoutCache.m1646layoutWithConstraintsK40F9xA(j2, measureScope.getLayoutDirection());
        TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (zM1646layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Function1<? super TextLayoutResult, Unit> function1 = this.onTextLayout;
            if (function1 != null) {
                function1.invoke(textLayoutResult);
            }
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.updateTextLayout(textLayoutResult);
            }
            LinkedHashMap linkedHashMap = this.baselineCache;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResult.getFirstBaseline())));
            linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResult.getLastBaseline())));
            this.baselineCache = linkedHashMap;
        }
        Function1<? super List<Rect>, Unit> function12 = this.onPlaceholderLayout;
        if (function12 != null) {
            function12.invoke(textLayoutResult.getPlaceholderRects());
        }
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(Constraints.Companion.m6600fitPrioritizingWidthZbe2FdA(IntSize.m6808getWidthimpl(textLayoutResult.m6096getSizeYbymL2g()), IntSize.m6808getWidthimpl(textLayoutResult.m6096getSizeYbymL2g()), IntSize.m6807getHeightimpl(textLayoutResult.m6096getSizeYbymL2g()), IntSize.m6807getHeightimpl(textLayoutResult.m6096getSizeYbymL2g())));
        int iM6808getWidthimpl = IntSize.m6808getWidthimpl(textLayoutResult.m6096getSizeYbymL2g());
        int iM6807getHeightimpl = IntSize.m6807getHeightimpl(textLayoutResult.m6096getSizeYbymL2g());
        Map<AlignmentLine, Integer> map = this.baselineCache;
        Intrinsics.checkNotNull(map);
        return measureScope.layout(iM6808getWidthimpl, iM6807getHeightimpl, map, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo5514measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        });
    }

    public final int minIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    public final void drawNonExtension(ContentDrawScope contentDrawScope) {
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        if (isAttached()) {
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.draw(contentDrawScope);
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            TextLayoutResult textLayoutResult = getLayoutCache(contentDrawScope).getTextLayoutResult();
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            boolean z2 = true;
            boolean z3 = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m6569equalsimpl0(this.overflow, TextOverflow.Companion.m6578getVisiblegIe3tQ8());
            if (z3) {
                Rect rectM3977Recttz77jQw = RectKt.m3977Recttz77jQw(Offset.Companion.m3953getZeroF1C5BW0(), SizeKt.Size(IntSize.m6808getWidthimpl(textLayoutResult.m6096getSizeYbymL2g()), IntSize.m6807getHeightimpl(textLayoutResult.m6096getSizeYbymL2g())));
                canvas.save();
                Canvas.m4151clipRectmtrdDE$default(canvas, rectM3977Recttz77jQw, 0, 2, null);
            }
            try {
                TextDecoration textDecoration = this.style.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.Companion.getNone();
                }
                Shadow shadow = this.style.getShadow();
                if (shadow == null) {
                    shadow = Shadow.Companion.getNone();
                }
                Fill drawStyle = this.style.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                Brush brush = this.style.getBrush();
                if (brush != null) {
                    MultiParagraph.m5987painthn5TExg$default(multiParagraph, canvas, brush, this.style.getAlpha(), shadow, textDecoration, drawStyle, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long jMo2078invoke0d7_KjU = colorProducer != null ? colorProducer.mo2078invoke0d7_KjU() : Color.Companion.m4214getUnspecified0d7_KjU();
                    if (jMo2078invoke0d7_KjU == 16) {
                        if (this.style.m6153getColor0d7_KjU() != 16) {
                            jMo2078invoke0d7_KjU = this.style.m6153getColor0d7_KjU();
                        } else {
                            jMo2078invoke0d7_KjU = Color.Companion.m4204getBlack0d7_KjU();
                        }
                    }
                    MultiParagraph.m5985paintLG529CI$default(multiParagraph, canvas, jMo2078invoke0d7_KjU, shadow, textDecoration, drawStyle, 0, 32, null);
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (!((textSubstitutionValue == null || !textSubstitutionValue.isShowingSubstitution()) ? TextAnnotatedStringNodeKt.hasLinks(this.text) : false)) {
                    List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
                    if (list != null && !list.isEmpty()) {
                        z2 = false;
                    }
                    if (z2) {
                        return;
                    }
                }
                contentDrawScope.drawContent();
            } finally {
                if (z3) {
                    canvas.restore();
                }
            }
        }
    }
}
