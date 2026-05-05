package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record.<init>(JvmProtoBuf.java:368)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record.<init>(JvmProtoBuf.java:327)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1.parsePartialFrom(JvmProtoBuf.java:474)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1.parsePartialFrom(JvmProtoBuf.java:469)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readMessage(CodedInputStream.java:507)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:121)
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
    	... 4 more
    */
/* JADX INFO: compiled from: LayoutNodeDrawScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĕ\u0015D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*,\u0018y\u000ff\u000198DkI6Ra/\u0017k\u00025,[:qK;[\u001b\u0006\"\u001fOVgmoRZ!C\u0017\u0006\u001cyr,_U\u0001]\u0018\u000f:B}?;ݹw=O`|Ȃ\r H\"@y\u001b\u0001\"ݒP\u0010\rzKK\u0012\u00148@\u0007:Z\rS\u0006\"\u0012\u0014G(\u0001$]oNLHtҗB/9\u0003qĩV'u0\u0005M\u0013G\\'#vi\u001e1L?5+%[\u0003\rSc?\u0019?yܵ\rh='3IyZ>X\u0016\u0014\u001d+U\u0012er<\\\rĩh\f=+WcQY\u0016(\u000ez\u0004\rB\b\u0016\u00065f6Ʀ\"f\u001e\u000e;txZHP\u0018^J\u007f\u0001f>\u0017;\u007f;+O\u001bnQg<!NE\u0002\r\r4#\tn'[\\\u000ev\u0015#T}X9QV=PN\u0010]Em\u001apj\u0002@\u00048G\u00065\u0002߾DϏU7\n8S!\u001a\u0002\tQw|\u000b`vT\u0002RvḆr\u0016E-QFha|\u0005\u001an\u0005\\:0e\u001c\u0003'.\f!:twj<U\u0014\\p\u0001i\u0019o\u000e\u000e3A~7\b\u0012\u001c\u0014e]v5KP\u00125(\u05ecБ\u0013̳םf\u0007^\rPzTJjP:2v\t@{\nmf\fA\\ou*_D1GgEL\u0011JZA+\u0014\u0010^v=\u0017TaR3o*t\u00170h\\\u001fv\u0018~O,\u000bz:-ole\u001f,V0\u0019L|Q\u0012/y\u0006Gu}_L\u001bH&]\u0002 $MQSE<AC//8\u0002;zdr\u0014\b\u0014ɓ&ю{Ȫӛ?j4\u001f\u0016#9\u001cn\u0013bO\u00035Rzl,;\b\u0013:*eT&_c\u0003\u0016\fBW\u001f\u001bYjYh\u0001\u0013L6%/\u001eR\u0003;-QV5\u0016&\u001b_\u001bg]w\nFy\u0011*Vzk\u0005:\u0014.o\u0011\\\u000e8A8W\u000b\u0017>PV\u001d\u000bHHx+ D\u001f3;gxGjpdme\u000b]4-\u0095+߱o£ݍ>\u0015u9Bj(\u0002\u0002\u0001\u0016\u0014\raU\u0015[|\u007fm\u001cu\r\u0011P\u000f\u0018I\u00141\u001d\u001dLC&Veh!04zH<G<p5T\tR?\\B\u000e\u000bQ\u0006\u0002\u0006>-0Ne\u000f%eZuQU<\t)b\\H\u0013\u0016]`O`GϪ\u000e˵\u001d֭\u00985\u0007s\u0006bo,\n\u000f\u00115\tI\t\u007f\u0003t^CD\u0003sK.^\u0001\u0019\u0004uCw\rf\nM){q\b\ff\u001f-#H\u0019)ii\u0011\u000e\u0002`d\u0011Ur\u007f|v@\u0019\u0003V()\r.\u0015\u0010R\t=?IUxopbdN&m\nץ\u007fԸC͈ܰ\u0010~i\b)oN;;\u0001ajBEBk\u001cu\fL8 U\"%%jv&f8}K>$\f.b0$CT.%FJ#\u0015:2\u0016Hg\u0002a\u0015Cdg\u0010\u0010#V&Y\u0012LלǧgǍƠgni4cQK4?\u001e\u0012n[nM\r5\u0016F\u0013\u0007$j\u0017Y f@\u0018\u0014C-O<\u000ec7@gc\u0017{\u001cUa\r9`\u0004*\u0010c`Z$}--\u000e\u0006@SVIk\\S>r>tlp\u000eT߳iݣcÆצ-\u0016\u0003IV*Y~B\u000e\u000b\u001e\u0013Mg\u001d-$%G\u000fP4KO&/}j?I\u0005b\u0011u(\u0005_\u001b:\u0011D00H\t\u0001P\u007f,[\u0014\u0005C 'gu\u0006d1u{K>C\u0016\\)\u000e?:\u000b>&>jK4;\u007feq!\u0017\u0001#k\u001eq\u001d\u0018c\u001f\u0002Y+*\u000f2\u0019\rm0wˡ9ߢ6\u0088ܯ3\u0011ume:\u0004\u001bC-d': \u0016N\r\u0016{V=+\\O;E,Fm@.WO**\u0006\u0004q\u0018E_\u0018Zeb@dDo\u0004TwftJ#U>\u0011s8{\u001a\u001eyei\u0012LA)\u001fIJD*;\u001e\u001fE{\u001b*\u0013J\rSGO\u0011\u001c(aK-\u0016UqN`ar{e\rcB\u0013\u0002XR2\u0010\f@ð?Ŧ)ƊЯ\u0016ViAxE\u001aI\u001e\u0011*\r;\"(5`\n\u0018`KBWO\u0005 N\\'Tqf\u0019\u001b'$\r5r\u0012\u0011\u0006$\n`\u00170\tzf\u001b\u0013A$\fAuo\u0007\u0004'\u001d\u001f:=\b;f\u0019'o[wYKiK\u000b\u001cU\t=k\\\u0013\t9Mz*C4\u001b14Gds2*\u0007<Tȡcң\u000f͊ѰH*s\u0011>\u0012\u0019hh\u001cu\u0001J=mY#\u001f\u00172\u0011q\fh\u001f\u0005OW\u001dY\u0006';S\u001a\u0003>HI\u0019\u0011\u001ea\u0015J#\"\u0018aD\u0002\bj&m|\u001c'@\u000bgJ/\u000e\u001eAE@yL\u0007kE\u001aeo\u0017\fN2T\u000e\u0019$p\u001b+k$!\u000e7|<\\)V\u0001q\u0011\u0015x1ٔyɗ\u000b˘ۢ<W\f \u0014t+sC w@ZL!\rUx\u0003{X\u0010 lzY[tCuGEaw\u0017c]y,n\u007fw\tD\u001dX4p+\u0002H(Vg\u0002H7a/U\u0012 \u001b{Z`\u001f\rLmFc('\u0017jDcLq`lG\u001d\u0016ʞ\u001aңCϾŞdrN'\u001eI5\u00045\u001b`jG\u001f1OoP,7r1Sm9:0\u0011:S\f,wP\f\u000ex{\u0010\u0015*xc<\u0013p:--\u0005lq#\nr\u0005[a\u001ck]dvbF\u001c;\u000e?o~\u0007XB<\u0003\u000b,|\tjQ$U9գ}ն\u001d֦҄[;M\t!ka\b\u0016\u001ceX)\r\t`3\u0019\u0014\u0006M}r\u007fC\u0016Ys*]\bwU5kNA}\u0018\u0003P\u0013q\u0012\u0012\u0015b#}\u001c\u0013\u0019c.[+\u001f[RXo6:(/$\u0016J?\u0002vj\u0011\u07b5!ԯ\u007fسվ\u001cLl[\u0007\u0013Q1\u001a\u0019\ru<P\u001eB\u0002Qugb-mYk8]-],8QOn\r[_\u000ew!jURm\u0004\rUTDd7w\n1\u001e'x]X\u0016&<\u0013:q:\n|\u001b\u0014\u0019\u0002tߥY˒mԬÐTc\u0016,$|\\tLdA#nC\u0010juqS\u000f\u0001\u001fGQsk97A,n&V\u0012==\tj\u001cD\u001a\u0005y\u000fJ\u001c?E\u0007\u001cc\u0015\n\u000f\u0018iW\"u%\u0004(]g(\u001e<\u001d\u000e\u0014Q\u000f\nO\r\u0015\u0018d\u000fV1>?n}\u0013\"88Gk\u000e81q\u0007<~\u0017RV\rO<\u0005.%-9̵>̈\u0001ȇՀ&\u001fI['^M&z,uh\u0002\u0003+(|Ms-@\u007f\u0016!AHM\t>(\u0016s\r[bD&\u0005N\u0002+\fH}^\u000e\u001a\u0005s(\u001d58LaEYp'\b\u0010_\r 5\u0015+!6i0*wkAOE.(D!'3m7\u001bLQ+\t;\u0005\u000f|01>T\u0006\u0016E\n!\u0018vw.W\u0010զ/Ȳ\bۋ֒q\u007f4b}c@6\u001eI\n<\f\u001d(:SQ(&\u0001eDhbD5\u000b@DE\u0015N%0$@&\u00070Iw\u0019\u0004uw`\u0013*`bye^F59T\u0019&/39+c+\"qqW\\c=\u001b'VI\u0012l*Vi+>wۄ\u0003ذJьۙ ;Ot/R|\u00180$z\u0014R\u0004<\u0011Z\nE\u001ad\u001al(?<)#H~E\u0018ppz\u0004=`)r7\fa8O`jOD^W{\u001c\u007f5P`ren]LG.>aEVcg8\u001bs\u001cmO+\u0015\u001bT\u0003\f#9cǚpõ]ɷٛ\u0006\b*\u0010Pg~UQgVuJRDx0\f\u00024\\l\u0013U0\u0016 \u0015f'\u0006x\u0015\u0019g4\fTe\u001a0yy\u000e\u0013&1+#\u001cXݚKtW9mqwmv\u000b\u0018?7CiUadu)0L:w@\u0006&ymLD.LYJO1@7$Pz&CܵHвKûͰ\u0016\u00178ĕ\u001d\u000e\u05caU/.BE\u000e\\d\u000b\u000eH77&fd(n\u0012SEd]\u001e6Kf\u001b\u0005yvd\u0001+?E-F\u0004\u0005<{c\u001dfT˱)v\u0006Y3o-oS\u0019Ax\u001d8eBr,\u001f9)Z\\&\u000b\u0019\u0003\u007f647z-vTKa\u0013c:\u001a\u0011^Sˎo۬O̔ד\u0005aLه:+шS)T\u007fĲuo'~\u0007_\u00169\u0005bGZ~v![\u007f;\u0019XAk\u0015i\u0001\u007fR\u001byEݘX Wt\u000b0.Mj\u001a%u\u0005F\tWK\u0019eWWeءZx=P\u0006\u0013(CC0(\"';\\kظuЮ:(\u000bۜV\u0017֖\u0001ǰIܕǏoT\u000fצ\u0011SދB\u001eziǃ:=_xÄ\u0010M']Ç\u0019oڄk͞sڏߨh\u0010W՚\\>قO+$w̙l({+°3>#\bț@\\Ԗgň8ܬϕM7;ڡ\r^̶nGKfתj\u0006c\u0007֙1+\u001fqԊwN̗Wé\u0018èӡrfLȟ^<Κ\u0018X>;̓e\u0010QW\u07b5\u001f\u000bh/\u00019қdӫ]&Ʊ6ٚ͘\u0004smԱeUκL.=\u0004ؓy4Z\u0003Ą\u000e\u0013y\u0003ͽ;+ϹAĨAKȂ\u001f֯͝Tj>ږ9Y͏'5ASɵo=]\u0011ӥMy\u0011?\u000f!ٗ#ӂ_ɜޗ!w<ެ\u001a!˦\u0016C#\u007fۼXP\r#AmN\bӽ x٦9Σjǚ˱\u001f\u0017\nɡ.\"ؠZ1\u00168\u009fh$,^/kloϝ$g͇\"Ļ\u000b\u008fٹd~\u007f۳`8Ђ\u0006M4%֢\u007fbtvӑ\u007fha\u001dՍ6\u000f҈-?\f\u0015׳\u000b\u0005\u001aB\u0007x.\bӦecč7ʪ{ŖήHfRۿ\u00105ە,U6XسLaTiŴ%4\u0015iȲR\u0018ٺ\u0003Ҏ\r̽ѫ6\u0003\u0006ͤ5\u0004ŕ`=\u007f\u0006ōDZ^\u0018ߜM^44\u001a\u0011͜qē/zծKܯн`UzŽ]Rׁ\u001eo+\t·/5}\u001fмCU\u0003>ں\u001f8ß\rޏ\u0007\u0017ݵJ\u05c8\u0081eo\nזte։\u0016\u0013Z \u001c\u0018A14ΧI.rρ\u0007\u000bJ\u001a\u0002!\u000fscr'NI=\u001dr\u001dҡ(Ècܓļ#\nǈVkR!DR\nP\u001f[r\u0017\u0005f\u000b0\u0003aK\u05c95đ\u0003\u0017[$\u0007KI,HhtO\u000ed)l}ߗ.Ͷ_\u0013\u00137M\\jvsBn/+O8R\f%\u0011÷{ŷ\u0002\u007f\u0010Ξ\u0019*\u000fAf2SN\"7HߓEѿGS\u0007Zn\f,\u00053r8[\u001f\u0007TM\u001fԤ.Ǚ1\u0015\u001b\u0006hIb\u0014:_]4-'vFEjm҄Sˌ\\áݏ>Fغh\"O\u0002e\u0004Y\u001bƊ(57\u0013#ϴ\u0005\u001e)~\u001e3N̅\u001aԥ\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mt;IU)i>)\u0015>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "1`]CT:\u001d`\u0015\u0011h\\6\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019g=/\u0011v@F\u0003u\u001aL\u00012G\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005I0'&do\u0018\u0014_><t1RL$oM", "5dc\u0010T5OO']\bZ>j\u00079p\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#|-3\u007f$,WN;5\u0012\u001a\u001ey]Gep(`d%QWN\u0002", "1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u0010X5MS&F[*\nLe!0", "u(9", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "2qPD66Gb\u0019\u0012\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00rrjH\u0007v;$", "5dc\u0011e(P1#\b\n^?\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#|-3\u007f$,WN;5\u0013+\u0011z?C\u0010r,a\u0006|", "2qPDA6=S", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc \\A>\u001b\u0002aBc)i\u0007", "2qPD", "", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "1n^?W0GO(\t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", ":`h2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "2qPD ,3V\u0004Zm)j\r\r)r\u007f/{<\u000f\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00042*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001c{G\u0013\u0012$vX*\rbcK1mH@\u001b\u00176VW\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArxJ#G\u0004FEFf*qJH'[:\u0010\u000b\u0010z\u0018(rT-\u001dEQ\u001bz]\u0004ug\u0011)~\u0002&KifIImc\u0006{#3K\tAs?T\u007f.x+\u0012\u001b&Jd\u0012!+\t", "2qPD49<", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "AsP?g\bGU ~", "AvT2c\bGU ~", "CrT\u0010X5MS&", "", "Bn_\u0019X-M", "/k_5T", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "1n[<e\rBZ(~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "2qPD49<\u001b\u001d\u0006\u0002>\u007fHl", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f.8 P\u0015\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[\\\u001bJ6\u0010\tWOmmQ31\u0016*S\r;2_\u0019\u0012 #y\u0005IVe.u\u001etN3lEl)wQIPl8dUo!&<G \u001ft\u001d\u0019v\u001a\f\u0014\u0003]\u001eSV\u0001vgTn^{\u0015", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2qPD49<\u001b-]H@\u001cb\u0013", "uI5\u0013M\u0011#4\u007fz\u0004]9\u0007\r.xI&\u0006H\f!%G9\u001e@@'BU\t#;k$wLP7}B\u001c\u001fsa\u0003ep(`d6[SN\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuK\u000f7s\u0004\u0010\u0014\u001c~HzI`\u001d(}\u001c\u0005A6>*\u001dP", "2qPD60KQ ~", "@`S6h:", "2qPD60KQ ~BO\u007fY\u0013\u001as\u0012", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f2$\"g=\u001d\"re8\u001a-*X~2QZNulV<?!\u000ee\u0011R)\u001bNXN \u0001R5)\u0013,\u0013`Hd\u0013y%\"<jF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUa*XE=(\u0012\u007fbxrW8\u0017\\W\u0018\u0002R\u0007=K\u000b\n", "2qPD60KQ ~BO(ff\u0003B\u0002", "uI5\u00179\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001l#*_Q9u?\u001e^Gn5\u0019Q;b}'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001!\u0015(T\u0005?f\u000fUs\u0018<t}#Z\u0017Vy\"K%lY", "2qPD66Gb\u0019\b\n", "2qPD70KS\u0017\u000e", "2qPD70KS\u0017\u000eB^!\u007fs\u000bXJf\fDz$\u0017No\nJv", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7y)Hi$\u00042*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001c{G\u0013\u0012$vX*\rbcK1mH@\u001b\u00176VW\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArxJ#h\u0004FA\u000fA7`\u001eG'[>;(\u0014~\u0002%gP\u0004pw\\\u0010\u007f\\}fz\u0011\u0017\u0005@/H{[\u0010Us\u001f>\u0002#*N\u007fu {_p?t:M\u001672o\bOe&%Z\r\u001592\u0005\u0018", "2qPD<4:U\u0019", "7lP4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "2qPD<4:U\u0019F|[\u001day\u00128", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003uO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^WP8\t\u0010\\E\"|\u000e6,\u0004>W\u007fEs\u0001Ut\u001b1|^Qj\u0017GO{qJ(uP]^\r\u0011?Oj5n\u001a_fl>\u0004&!m$\u001elN<SY]\u0018|_ZknV\u0019\b\u000e\b\u0002^", "AqR\u001cY-LS(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "AqR \\A>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "2rc\u001cY-LS(", "2rc \\A>", "2qPD<4:U\u0019FNc\u000e\b\u000f\u001fE", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003yMF\u001am_5M\u00041KKauZ\\zH\u001e ZW^/V\u0007f=/qH5-Q+V}Mv~\u0016!\u000e~I}>h}V\u000e\u001cu\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u001b(d[1\u000eyaZP\\\u0001qt(\u001d\u0002G$KC?\n6", "4h[AX9*c\u0015\u0006~m@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016]\u0005/7z\u0002>IJ?zHs", "2qPD<4:U\u0019FVSx}h\u0017s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003yMF\u001am_5M\u00041KKauZ\\zH\u001e ZW^/V\u0007f=/qH5-Q+V}Mv~\u0016!\u000e~I}>h}V\u000e\u001cu\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u001b(d[1\u000eyaZP\\\u0001qt(\u001d\u0002G$KC?*\t`", "2qPD?0GS", "AsP?g", "3mS", "Asa<^,0W\u0018\u000e}", "1`_", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", ">`c58-?S\u0017\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0017n\u0017.KR\u0011", "2qPD?0GS`JgM4\fq-", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u00132$\u001fR0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u0016\u001fV\u0019Q/\u000b\u0013#, }G\u0017 \t,G\u0011\u0011Ig\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCINAm-h\nmf:DA.!R\u001d\"wP;__\u0017\u0002", "2qPD?0GS`g\\F|`\u0006y", "uI9\u00179\u0010%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsW>\u0004!@\\\u0002\u001eE7\u0001*\\F\u001bl5\u001e\u0013w7\u001am_5M\u00041KKauZ\\zH\u001e ZW^/V\u0007f=/qH5-Q\nS\tEua\u0010\u001d\u001d5wF&\u001a\u0001", "2qPDB=:Z", "2qPDB=:Z`Z\tN4KUA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u00132$\"g=\u001d\"re8\u001a-*X~2QZNulV<?!\u000ee\u0011R)\u001bNXN \u0001R5)\u0013,\u0013`Hd\u0013y%\"<jF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUa*XE=(\u0012\u007fbxrW8\u0017\\W\u0018\u0002R\u0007=K\u000b\n", "2qPDB=:Z`\bBC\u007ffjy", "uI9\u00179\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001l#*_Q9u?\u001e^Gn5\u0019Q;b}'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001!\u0015(T\u0005?f\u000fUs\u0018<t}#Z\u0017Vy\"K%lY", "2qPDC(MV", ">`c5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "2qPDC(MV``WF>\u0002s\u001f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:C|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018.iN}@\u0018\u0010hW+8\u001d\u0013\\\u0017\u0005U@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011{\"qL,lDg)xT=Wp(n\u0017_f;G66\u0002\u0001-\"h&\u0015\u0006\u0005R\u001e|Vxz1E#\u0003C.Lm%VI9WIp2\"Oy\u0006[\u0010b{5\u0002\u000e\b;96qZ/+\t", "2qPDC(MV`e\\.xPf\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:Cz\u000f4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\t\f\u0012US2lNB\u001fQ\u000bV}MV\u0010 \u001d\u000e\u000bQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bUfsf\u0019[(_>82]O#\"r]\u000f\u000e\u0003b\u0011\u007f(]+X", "2qPDC6B\\(\r", ">nX;g:", "", ">nX;g\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n c\u0002)FU -M\u0019", "2qPDC6B\\(\rB@:}\u0018yW\u000e", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\u000fwI\u007f$!Kn!\u0006t/=d\b.77&2\u0017EHg?!\u0019fo\u0003cp<\\y|(05(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;h\n9E\r>l~\u001a_x1ys\"W\u0011Gw$K\"\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u001b(d[1\u000eyaZP\\\u0001qt(\u001d\u0002G$KC?\n6", "2qPDC6B\\(\rB?~q\u001b\u0017PR", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\r\\$g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005qu9r6J,O-\\P\u0002\u0013txV\u0017M8\u0017\tXTmlN?*\u0012:IKKlJ\u000e#\n@mt@dY%\u0004\u001c\u007fN\nlMh_\u0007\u001d%\tS", "2qPDE,<b", "2qPDE,<b`Z\tN4KUA", "2qPDE,<b`\bBC\u007ffjy", "2qPDE6N\\\u0018kz\\;", "1na;X9+O\u0018\u0003\u000bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u0013c\u000b)7z\u0003*LGKy\n", "2qPDE6N\\\u0018kz\\;D}?i\f\u0019\u000b,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u00132(\u001cR0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u0016\u001fV\u0019Q/\u000b\u0013#@1jVE\u001d\u00127IK\u001au|\u001e\u0004\u001dIqp\u0018=\fPx\"\u007fE({\u0010Wi\u0002RKSbst\u0010)\u001fi6E'\u0018o'dFZ5\u0014\t4\u0015yayt=+\\k", "2qPDE6N\\\u0018kz\\;D\u0019vA\u0012w_\u001c", "uI9\u0017=\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001l#*_Q9u?\u001e^Gn5\u0019Q;b}'\u001d-5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;h\n9E\r>l~\u001a_k?qzO7\u0014N\t\u0015\u0003\u0017\r,7", ">da3b9F2&z\r", "@dR<e+", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "@dR<e+\u00068\n\u000e`*\u001aK", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~`y47z_\u0010Z?Fn8\u001c#O]M\u0007p\u00023]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD4VO\u0007", "@nd;W\u001bH>,", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@nd;W\u001bH>,FE/~G\u000e)4", "uE\u0018\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "@nd;W\u001bH>,FBKxo\u0003\u007fo", "uI\u0018\u0016", "Bn3=", "Bn3= \u000e:<d]n:", "uI\u0018\u0013", "Bn3= <\u000bc#ljF", "uE\u0018\u0013", "uH\u0018\u0013", "Bn3=F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "Bn3=F0SS`\u0005Bk-my\u0017", "uI\u0018\u0017", "Bn?E", "Bn?E v\u000f&c\u0004t-", "Bn?E s+ \fxKh", "BnA2V;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3hS", "BnB6m,", "BnB6m,\u0006F\u001fzlG\u001bh", "BnB=", "BnB= vQ;\tNyh", "uE\u0018\u0017", "BnB= 2)he`\u000f-", "uH\u0018\u0017", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    public static final int $stable = 0;
    private final CanvasDrawScope canvasDrawScope;
    private DrawModifierNode drawNode;

    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-illE91I */
    public void mo4631drawArcillE91I(Brush brush, float f2, float f3, boolean z2, long j2, long j3, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4631drawArcillE91I(brush, f2, f3, z2, j2, j3, f4, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-yD3GUKo */
    public void mo4632drawArcyD3GUKo(long j2, float f2, float f3, boolean z2, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4632drawArcyD3GUKo(j2, f2, f3, z2, j3, j4, f4, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-V9BoPsw */
    public void mo4633drawCircleV9BoPsw(Brush brush, float f2, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4633drawCircleV9BoPsw(brush, f2, j2, f3, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg */
    public void mo4634drawCircleVaOC9Bg(long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4634drawCircleVaOC9Bg(j2, f2, j3, f3, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013X\u0001;v\u0007TlkH/\u007f\u0010$2\u000e`^\n>mu\rY{\u0006\u0003rO\tciwZwWZa{xG,rI\"jU\t0YTzKG@&\u0011Y\u0005Y\u001c\u0003=\u0016\fK\u007f8.L\u000b\u0001q'\u001a", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo4635drawImage9jGpkUE(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4635drawImage9jGpkUE(imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-AZ2fEMs */
    public void mo4636drawImageAZ2fEMs(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
        this.canvasDrawScope.mo4636drawImageAZ2fEMs(imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2, i3);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-gbVJVH8 */
    public void mo4637drawImagegbVJVH8(ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4637drawImagegbVJVH8(imageBitmap, j2, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-1RTmtNc */
    public void mo4638drawLine1RTmtNc(Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.canvasDrawScope.mo4638drawLine1RTmtNc(brush, j2, j3, f2, i2, pathEffect, f3, colorFilter, i3);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-NGM6Ib0 */
    public void mo4639drawLineNGM6Ib0(long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.canvasDrawScope.mo4639drawLineNGM6Ib0(j2, j3, j4, f2, i2, pathEffect, f3, colorFilter, i3);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-AsUm42w */
    public void mo4640drawOvalAsUm42w(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4640drawOvalAsUm42w(brush, j2, j3, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-n-J9OG0 */
    public void mo4641drawOvalnJ9OG0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4641drawOvalnJ9OG0(j2, j3, j4, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-GBMwjPU */
    public void mo4642drawPathGBMwjPU(Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4642drawPathGBMwjPU(path, brush, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-LG529CI */
    public void mo4643drawPathLG529CI(Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4643drawPathLG529CI(path, j2, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8 */
    public void mo4644drawPointsF8ZwMP8(List<Offset> list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4) {
        this.canvasDrawScope.mo4644drawPointsF8ZwMP8(list, i2, j2, f2, i3, pathEffect, f3, colorFilter, i4);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws */
    public void mo4645drawPointsGsft0Ws(List<Offset> list, int i2, Brush brush, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4) {
        this.canvasDrawScope.mo4645drawPointsGsft0Ws(list, i2, brush, f2, i3, pathEffect, f3, colorFilter, i4);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-AsUm42w */
    public void mo4646drawRectAsUm42w(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4646drawRectAsUm42w(brush, j2, j3, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-n-J9OG0 */
    public void mo4647drawRectnJ9OG0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4647drawRectnJ9OG0(j2, j3, j4, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ */
    public void mo4648drawRoundRectZuiqVtQ(Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4648drawRoundRectZuiqVtQ(brush, j2, j3, j4, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA */
    public void mo4649drawRoundRectuAw5IA(long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.mo4649drawRoundRectuAw5IA(j2, j3, j4, j5, drawStyle, f2, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    public long mo4733getCenterF1C5BW0() {
        return this.canvasDrawScope.mo4733getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public long mo4734getSizeNHjbRc() {
        return this.canvasDrawScope.mo4734getSizeNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: record-JVtK1S4 */
    public void mo4735recordJVtK1S4(GraphicsLayer graphicsLayer, long j2, Function1<? super DrawScope, Unit> function1) {
        this.canvasDrawScope.mo4735recordJVtK1S4(graphicsLayer, j2, function1);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo703roundToPxR2X_6o(long j2) {
        return this.canvasDrawScope.mo703roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo704roundToPx0680j_4(float f2) {
        return this.canvasDrawScope.mo704roundToPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo705toDpGaN1DYA(long j2) {
        return this.canvasDrawScope.mo705toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo706toDpu2uoSUM(float f2) {
        return this.canvasDrawScope.mo706toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo707toDpu2uoSUM(int i2) {
        return this.canvasDrawScope.mo707toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo708toDpSizekrfVVM(long j2) {
        return this.canvasDrawScope.mo708toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo709toPxR2X_6o(long j2) {
        return this.canvasDrawScope.mo709toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo710toPx0680j_4(float f2) {
        return this.canvasDrawScope.mo710toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo711toSizeXkaWNTQ(long j2) {
        return this.canvasDrawScope.mo711toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo712toSp0xMU5do(float f2) {
        return this.canvasDrawScope.mo712toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo713toSpkPz2Gy4(float f2) {
        return this.canvasDrawScope.mo713toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo714toSpkPz2Gy4(int i2) {
        return this.canvasDrawScope.mo714toSpkPz2Gy4(i2);
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    public final CanvasDrawScope getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        Intrinsics.checkNotNull(drawModifierNode);
        DrawModifierNode drawModifierNode2 = drawModifierNode;
        Modifier.Node nodeNextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode2);
        if (nodeNextDrawNode == 0) {
            NodeCoordinator nodeCoordinatorM5636requireCoordinator64DMado = DelegatableNodeKt.m5636requireCoordinator64DMado(drawModifierNode2, NodeKind.m5749constructorimpl(4));
            if (nodeCoordinatorM5636requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
                nodeCoordinatorM5636requireCoordinator64DMado = nodeCoordinatorM5636requireCoordinator64DMado.getWrapped$ui_release();
                Intrinsics.checkNotNull(nodeCoordinatorM5636requireCoordinator64DMado);
            }
            nodeCoordinatorM5636requireCoordinator64DMado.performDraw(canvas, getDrawContext().getGraphicsLayer());
            return;
        }
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(4);
        MutableVector mutableVector = null;
        while (nodeNextDrawNode != 0) {
            if (nodeNextDrawNode instanceof DrawModifierNode) {
                performDraw((DrawModifierNode) nodeNextDrawNode, canvas, getDrawContext().getGraphicsLayer());
            } else {
                int kindSet$ui_release = nodeNextDrawNode.getKindSet$ui_release();
                if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0 && (nodeNextDrawNode instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release = ((DelegatingNode) nodeNextDrawNode).getDelegate$ui_release();
                    int i2 = 0;
                    nodeNextDrawNode = nodeNextDrawNode;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                            i2++;
                            if (i2 == 1) {
                                nodeNextDrawNode = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (nodeNextDrawNode != 0) {
                                    if (mutableVector != null) {
                                        mutableVector.add(nodeNextDrawNode);
                                    }
                                    nodeNextDrawNode = 0;
                                }
                                if (mutableVector != null) {
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                        }
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                        nodeNextDrawNode = nodeNextDrawNode;
                    }
                    if (i2 == 1) {
                    }
                }
            }
            nodeNextDrawNode = DelegatableNodeKt.pop(mutableVector);
        }
    }

    public final void performDraw(DrawModifierNode drawModifierNode, Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinatorM5636requireCoordinator64DMado = DelegatableNodeKt.m5636requireCoordinator64DMado(drawModifierNode, NodeKind.m5749constructorimpl(4));
        nodeCoordinatorM5636requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m5677drawDirecteZhPAX0$ui_release(canvas, IntSizeKt.m6820toSizeozmzZPI(nodeCoordinatorM5636requireCoordinator64DMado.mo5522getSizeYbymL2g()), nodeCoordinatorM5636requireCoordinator64DMado, drawModifierNode, graphicsLayer);
    }

    /* JADX INFO: renamed from: drawDirect-eZhPAX0$ui_release, reason: not valid java name */
    public final void m5677drawDirecteZhPAX0$ui_release(Canvas canvas, long j2, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode, GraphicsLayer graphicsLayer) {
        DrawModifierNode drawModifierNode2 = this.drawNode;
        this.drawNode = drawModifierNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        Density density = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long jMo4655getSizeNHjbRc = canvasDrawScope.getDrawContext().mo4655getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(nodeCoordinator);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo4656setSizeuvyYCjk(j2);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            drawModifierNode.draw(this);
            canvas.restore();
            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            this.drawNode = drawModifierNode2;
        } catch (Throwable th) {
            canvas.restore();
            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas2);
            drawContext3.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX INFO: renamed from: draw-eZhPAX0$ui_release, reason: not valid java name */
    public final void m5676draweZhPAX0$ui_release(Canvas canvas, long j2, NodeCoordinator nodeCoordinator, Modifier.Node node, GraphicsLayer graphicsLayer) {
        Modifier.Node nodePop = node;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(4);
        MutableVector mutableVector = null;
        while (nodePop != 0) {
            if (nodePop instanceof DrawModifierNode) {
                m5677drawDirecteZhPAX0$ui_release(canvas, j2, nodeCoordinator, (DrawModifierNode) nodePop, graphicsLayer);
            } else if ((nodePop.getKindSet$ui_release() & iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                int i2 = 0;
                nodePop = nodePop;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                        i2++;
                        if (i2 == 1) {
                            nodePop = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (nodePop != 0) {
                                if (mutableVector != null) {
                                    mutableVector.add(nodePop);
                                }
                                nodePop = 0;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate$ui_release);
                            }
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    nodePop = nodePop;
                }
                if (i2 == 1) {
                }
            }
            nodePop = DelegatableNodeKt.pop(mutableVector);
        }
    }
}
