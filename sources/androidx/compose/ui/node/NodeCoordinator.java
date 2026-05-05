package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яħ\u0015D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aՄ\u000ff\u000198DkH6Ri*\u0017ӆ\u00044:[,ڎK;k\u001a\u0006\"\u000fVVgusRZ\u0011D\u0017\u0006,xr,_U\u0001](\u000f:B}?;MuAA`\u0003?\r 8,@y\u001b\u0001\"*N\u0016~zYK\u0014\u00126@x:h\rU\u0005 \u0013\u000e>6\u0001&\\}N>H\u0003]B/)\u0005qBd'gܞ\u0005M#F\\܋\u0015vw\u001e3@=8\u001d%i\u0003\u000fRaI\u000b?\b=\rh-'3I\u0002z>X\u0016\u0014\u001d+]\u0013er,_\rQnϯ/+UeSP$(\u007fz\u0002\u0011D\u0004\u001c&/H42\"f\u001e\u000e;txSHP\u0018^J\u007f\u0001b>\u0017;\u007f;+?+nQw;!N=\n\r\r4#\tn'e\\\u000ev\u0015#T}X9QV=Pݐ\u0012YSm\fph\f2\u0004FG\b/\u0002+6\u0017;7c9);s\u0002^Dov\u000b\u0005nq\u007fɭfن\"\u001f\u0016e)9\f\tD\u0015\u0005\u001aQ\u0005XZ\u0013\u0006\u001eΰ\u0007Ē\bS+l{J$=\u0010|SŹmj[bRG=ϟ6qn\u001a*\b>lڿ4ic>Р\u0003{\"͋;z\u0005\u0007orX\u001aȰ[@\"`k1\u0010@,R\u009e\u000b+3mھ\u001bd1?Ǡ[-H1ٜrG\u000bȜ^ri>ёSc)\u0011ȉ#\r\t/s#pيfծͅ0\u0001fĒ,Oٹ4aAcɇgL|Qe/w\u000e%\u007fLu+3\u0018çTݨ°\u001a\u001e?ַ.Kр\u000eGN@Ī,]L!z\u0002S ؠy\u0015z=ªg^k\u0016H\t,\u000fI\u0011Qް\u0016ǱՑbv)όc\u000e\u05fd`\u000f\u0014UϰS#[le#\bg\u0088MP|39N,\u000fȣ!\u00157CBU8^\u0012\"ڕ\u0014y]\u0018\f^~pϮ%\re2F\u0014\u001c}͏Pu3iΚH \u0001\u0007=2у\u0002ZH\u0019\u00148G\u0017ΐ\fKHo~!]Fԯ\nG\u007f|\u0006Z(7V$A!̷|L.\u000eF:gF*lǧ$)M\u0002܊\u001erYŻ\nb\u000f8ΚBςߎ\u0016\u001dC֢U \u000b\u0017ަ\u0005\f\u0019dק:\u0013\nJx<5Zў\u0007;JZi\u0014اy\u0018F\u000e2]F÷rĩټ\u0012X~צUVϦ_\u000ey/Ǖ\u007f\u0017\u000fa:):?ܿl^T]lb\u0006a\u0091\b3j}\"-%sebۙ\u001a@X/.ugQͩ\u0001N\tW)sl\u001eɧ7^|ށAȰê=U\u0017ڜu>Ζ\n\u001e\u0007\\сu*ihMPĝ}+\u0007\u001c۪\t'\u0010)Oxp\u0011ϚKюv˿ƴ\u001e\u0005\u001dة(\u0015Җ{,Y)ӌ\u0005M0SH\u0019̦&,\\aɋ|  NJJti\u001ee˪e\"]IVFw$ɉ\u0001!\u0014~݂\u0003^P\u0003ҽ\tF\tdи\u0001c\b!ɈX\u0004xOͼ&[q\u0014ءJ\u0001x8\u0007\u001dh|ϯ\n\u001bf_yԬm߲ȃ!\r-Ԕ-!΅Y\u0003Ta\u07b9W)\u007fB1V%DˋaA\u0011}ʬg!q]ܣ\fC0\u001a˥`a6`˷|7z$Ħ)\u0005-#ΌUe>\u0013,\rqPŦ\rvjV\b; ł\u0013Ι۫Lb\u0017Ԍ3T\u07b9\u001d-6E٪\u001es\ru|M\u0018\u000ef4п0j?IZb\u0011}Ĭu)\u0004hšsF,Ҟ\bۂϨk03łSKձ&\"){ҵ\u0002>Ks[\u000b\":؆\r)0\t\u0090\u001fna(̳:i3o\u001aA\u0006#Ƣ\u0005\b\u0007GX1e\u001cL8˛{\u0019\u000emƱ0\u001c?\u0002ڔq;/=pK]tׂ$Mfzۘ\u000bHy۽}\u07b7\u07b2Z\u0013gЇHCì\u001dB\u0006Nç\t7%R\u0530tS\u0005S̋GB_\u000bA\u0007yeǼ%B7\u001dީ\"wq\u0007ݡ\tDiF\u0017+oʞ3С˒\u0018\u001dJł);ń\u0006\u000ekv\u07b8\n\\\u000esƃ6?\f7ٮ\u0016\u0015\u0011}ƚ?q]ٕLҍۺa@\u0019Ʃ\u0003H߲`~\u0018U˻XB\u0007[´S\u0014pxӝPw\u0011fݐ\fS\u0018،0ׯϵ\u0004d#ɞ&YŕE~z\u0007î@z\fnǝ#\u000f4P֗\n\u001e\u0017\\Н\u0016H\u0012·_ňΘ7Ky\u07bcF \u0380zi;\u001f٣$\u001e&\u0016\u008cFo[\u007fٌ<Q49ǥI\u001f5ȯ[հȜ%OjǴ\u0014\u000eԎ*vTdį\u0019BX4*\fĹэ\u0014E~ڇ'67>ÆO\u0017ZqyG0gBcɂd\u00172\u0011S$}\u001fԛ6on\u0001qS2\u0007µ\u0002(AGv;#a\u05cc1;s;\u0015\u0005\u000ePaW˹{\u0006I>\u001f*O/ȼ\u0005W/og5[sɕ\u0018o?-(hB2̓\u0012<b\u0016/\u001a\u00130ϐ\u0002d6\u0005CxRg̜eZl%y#'t \u0001\u0006\u0014ݠ\u0005)cJ\u07fb:\u0010E:ʗo!G}$,8kqt۾XeL;x)?_\u008e\u0010\u0012\u007f&ցtԦ[ЙƦ\u001b[,ż\u0012\u0010ę\u001cn!\nǎ(H\u0017\u0004\u007f\u001en\u0002Dx\u0011\b#\u001c5rӇq~dlxnSV01y_\u007f+Qr$\u0019b\u0001Ho,xkZg̡Lj\u001fCG]ܒ\u0016֏ϘHz)ػ2Hʾ`j\u007fk־Fb\u0006<\u0007\u0012{#ku3d{ 1\u000bЁ\u0004Vf!\u0019\u001d\t[m\u001ck]M\rlߩ\u001bޏނ+qnɍ)\u001cݞ{Mu|\u05feQiuM\u000f\u0015\u00031\u000e2A\u0006(w&!ъ\u0018T\b`b\t\u0012|\u001ct8>}\u0016\u001f@\u0004\f7|A\"\u0018IV \u0010͇a\u001e/@\u001a}.,\u0004\u0014\u001abx>\u0016iЪ\u0010ѭęQ{\rǺ;gϴ\u0001Ri7ϝ\u0007-'0ddN@\u0012;\u0001=%HOtâw=\t\u0014!_\f\u0004QJ\u0001Nuv]\u0016uQ?e]-aC. HߌMm\u0005mw\u0014WSRQbl$v̎Sŀߵ\u000bs\nШ\u000f\u0002֔Z\u000bA\u0006ŋaLkh\u0018w\b\"ԨJF\u001a\to\u001fq\u0005ˏ`(=D0D\fDs7˾?=_\u000f\u000bFãˣt\u001e=ۓD-\u0010R܇'x2l.WUfҬ\r3\u00023g+(Ӕ=F~ܫK]y\u0012߇ci#\u0016ʏjX5\u0018ϗ\u0016N\u001e.\u00988S\bў]ڇڞb\r[˴\u000e5ӬNPv>\u07b2GuZNR$0\u001cλfdQ;ؖ\u0006\u001d3\u0005f\u000b\u0018mʩ\u0001ZL(\u001dQɔ\u0018\u007f\u0005d\u0010\u0002q֦R˭Ҧ\"raА'>ܫ\u0005i\u0019O܄\u0016&%6٤s$Z]ϋ\u0001XHA(JH<ϟ\u0013\u001dez\u0006e\u0010Oז?kqGݱw&rʖ\u0004ʘۚ%,\u0011ħ(oڲ\u00138;6ɦC+vI\n9\u0015*л$!-\u007fȋ+ @ԍ m\u0011mԌ\u0013)^ߗ~̃ϛ44y։MZʥ}v\u0011}șwv\u0010}\u000elb\rԾ5](>ʟ\u0003A\"\u07bf\\\\(\nЃD]\u000eۥ\u001eںƢ6\u0010tЍ\u001bjú}8\u0014`\u0602\u0012x4\u001dQ\tFCى#\u0019'/˛\tiq͙\u0013ŘЀYJjރf\u0005،CZ\n\u0003ɶi\u0015\b_94\u001dY)J/IK\n!\u001auP$:bB@{\u000b;\rݥ1\u001a<\"l)?<)ˀ0\u0017\u0017?c3\u0007\u0012ŷF)r7\ra9O_jμ,v)\u001f\u000f@/\u0019\u0017OƬnG\u001aEBXf=̝Yө\"2D\u0018JWƑ\u0014%'z\u000f\u0005\u0004cǞq\u000bϣ)o\u0014\u0014є\u0013Z\fFsSk\u0005ص\u001cD\u0016\u0005\"\u0011\u0006bn\tޕUЦ\u0015ؓʲR+]ڢd!ˎ4Fj[߮\u0002vI5)V(;δ\u001bB\u0003z(\u00028z̵Fmv\u000b0?CKδFHY\u0006}\u000e\u001d`ڦ?\btqkda.XoܢOyP\u0010ҪPdp+ܸHBR\u0019ͭ\u0012+3nգ~ajݻHִˢy`<ހ]Rڀ|V\rD\u05ed>$Msr^\u000bDư^\u0003~\"\u0011\u0007w!֝\u0016*\"\r\u0001Lm\u0014\u001fu(3*t\u001c\u0002s(Ђ]\u001c\b\u001d̥\u0017JdbeD%\u0019Ͱ)l!9܄N.6ӝ7ĺҶJRKѲ\u0005<Ȧ\u0019+r\u001b˜p\bPht)`\\8i\u074cr\u0005fG\u0000_\u000fXUŁgg\u001c\u0019ԡ1[M\u000eǮ ]e\u0019ՉI5TAٽ\u0001\u00022`؛6_Y6zvq\u0016Ʊ\u001e]iM\u0013K8ޑ>ԫȃ\u001a+Eȉwi٬*\tW\u0011Ν\u0015\\ T.O\u0010T<Lɩ\u0013f-\u0013ܓVhe0ƹIJ\u001byω\bO\u0013sޙB\u0006fiǹ:=_xú\u0010U+=ý\u0019Ag\u001bI%\u001a|ɯ\u000bi9\fSaUp̞iim>\u0010C\u001c\u05c9\u0015΄ӽ\u0016E\u001cԨh/ɀG0\u001dAŃ\u0004&P~\f'4ns\u001aږa\t\u001a@ɲ\u001d[;'ۤi\tj'ċW\u0007ctȣ^^L'ȥ!E+\u0015˒OY>.юg\u0019u!|\u0016\u001blҝqO]-# lSƎG]M\u00145<Rԁ\u001b²˭p\u0013pޕTSćd?M:ƴL\u000f :\u058cxff \u0001KJ6z.]+\u0007$\u000bi!˅]أ\u0015sbؿt\rnEV\u001f\n55$iˋ#ܽ\u000eq\u0015γ\t\u001f\u0003@]M\blW\u00078ېvߎ\u000573\u0015\n =!-ov\u000bBw\u007f\u000bZ/Z\u0018B̔QՂ%\u0015;n\u0012FWpK\fnrBC5\u0006\\k\u001eքLʨLr\u0019Bf\u0001dJ\u00199<\u000b\u000b\u0007Q!#njǪRŉ]y~\u001fkN\u0012\u0014c\u0004Rzd!!):-;6Z\r]Ki:_A\u001c\u0016K\u001d\u0002m \u001d\u0005ْtѫ6\u0005\b̼FwL~\u0003\u0002HJSauk!MdO\\\u05caVͧv\u00048нe^\u001fctQ#\u001a\u0015\u00194Ǘ)ς~\u000bH\u001f\u0003\u0012s[}\u001a\u001e\t8qr1$ߡ$ܟOE)ƫ\u0004\u0006{\u001ae\n7DQ8)'\u0012\u001b@(](\u0019\u000bEבPգw(F͌mn\u0015w)[\u0007 L<3t5\u0001\u001cO#\u0010\u0001\u000bps\u0015ҧ}ؼRM|\u000fr\u0013jJ\u001d_\u0003^J\u0015-6yvWԍ=Ҭ{\\~C{\u0013\t\u0003w%9*s\u0015\u000b7WL\u000b\u0002Qd7ӏ\u0015ǩ&SeЊ\u000b&}F\u0016\u007f6C~lWްPݓ)G\u0004%w:P\u0016\u0014[|\u000b\u0001vL\u001b9˻6ڨ\u000b\u0007.ݪ\u001949FE\u00111'\u0019\u0006+əkγS\u001e-)N^\u001d;gy^Au\u0018uT\u001eؚp߃;\u007fgʆ\u001c.\"^D/>@}l}_\u000f\u001e[R\rVTÆ\u0003ԥ\u0019-X߰,4X6\u000bI\t26:,EJV\u001f\"Rۜ/т:ìı\rMځt\tIaz*\u0001!or\u0019~z\b\u0015@vmI1_s7tzCY\"p\u000b\u001aڮ*ԝ4/Bڔ\u0007;*\"yDI:e+1v;uNas\u0006BD\u0016+8&&)\u0007xې?b]\u001b\u001f*|4l\\Pj\u0005B\u001dJ 38\rAl\u0001<i\u0001Ì\u0003&vm\u0006m\u0006Ю)ѷ\u0011\u0015 ۑm8)yp\tsMJi\u0012:7jkЏ'Ӱ\u000e4J۫K\u001d\n\u0005aN\u000f/\u001aَm֏yp\u000bЊ0cJ\u001d\fV7!W~AĲ,ݜl4.ȝ<7aw;\u0013M<FNaػCثigEH\u000fV7\b\u0018\u0014[vfs9\u0007yϋ\u0019ć\u000fqvրAGo\u001cAfl\u0014b\u0004Ww~ \u001a\b4EgS\u001akf\u0012@|j\u000fhץZ\u05fcUSp@u\u0004^/\u001ca\u001ekD\u001dCfA4\r\u0003,+v\u007fX=\u000fm*E\u0002SR{#ɫFΩ\r\u0019iWz[A[5S\u001a\u0017-r]X1b<_\u0018#q\u0012٧`ĞӏfEĊ\n\u001a\u0003&y \"\r\u001bt8rU4tq\u0014\u0013(<{\u001aTKC\u0005\u001a\u000boX\u0019̏xĪ0/WƵ'Njio]\u0011\u0014\u0001 lEvޏ\u0018ڨ\u0014.FV1w b=NM&g\u0002_RxkFuӪ%s%\u0014?_\u0015j\u0014i\u0014U]ES$6F!\u001cN\u07bb\u0001ڝ/Y|A$~\t+\u001bppR^4z!DRZ\u0011ҕ\\\u0001l6[2N_%9l3\n\td\u0018wsU-)D#0\u0014qqӞG݃}ܟԾ.DɎ\u00129DI3\u001f/4\u001a>Pb\u0014\u001bC }\u00031aw\u0006\u0006[*\u001f\fTADFGw ,¨bӀC)\u007fU\u0019\u000b:'\u0001 -I\u0003sYvT6Jβbϭf=RIo\u000ftQK%\u0013z>HLM\\҄[џ/l.Ж }b9Z\tPQ\u000e;܃5ʮџqsΑa\u001ec\t+ôD\u0010H4u\u0002\u0590\u0002qw!؇0 x)Ͼ\u0016Ջ;F\u0004\u007fRȷ?9ȟnV+\nʚk1fZļ?;ً\u0005¡\tP\u0004RVҫo'И^NFi\u074c{+t\u0019Y\u0002͔CϫRۓNh\u007fè-\u0015iГ>MߓO\u001f/yو|@\u009f14\u0011[őY2(\u0011d&ɜb̎Y\u008e+\u001aFЗ?\u001bV֙k\u001cڬ\b}<\u001eбBX͇a9nCӠ>\u0012p6\u0004N$\u000bNL\u0017uw,8\ṅp܋/G<š\b._Щ$#:\u0015\u0006Bò[\u0011אh٪1O\u0010\u00111Ѳf6L\u0011Q}l܃oƶ["}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6K\u00129I@Bk\u001f%\u0011fa5\u0004j,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%BG{*Bmk", ":`h<h;']\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0004\u00114", "-lT.f<KS\u0006~\tn3\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "-qT0g\n:Q\u001c~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001di\r\u001c4t\u0016\u001bMAJA", "/kX4a4>\\(e~g,\u000brAn\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9iCz'>a})FT\u001a7MQ%}=\u001e\">", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/si:\u0005@\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006R,9[\u0007(7v%\u0015QL;y\u001e0\u001ehn\u000f", "1gX9W", "5dc\u0010[0ER", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]/?_y#7i\u0015\fIN7h;\u001e\u007fo]7\u0007_)Uv|", "1n^?W0GO(~\t", "5dc\u0010b6KR\u001d\bvm,\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "2qPD53HQ\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "", "5dc\u0011e(P0 \txdjx\u00128o\u000f$\u000bD\u000b %", "u(E", "3w_9\\*Bb\u007fz\u000f^9", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "4na0X\u0014>O'\u000f\b^\u001e\u0001\u00182L\n2\u0002<\u0004\u0017\u0013FM\u0018E\u00054BU\u0002)F{", "", "5dc\u0013b9<S\u0001~vl<\n\t!i\u000f+bJ\u000b\u001d\u0013Jo\n;T/>g\r-3q\u001f=[\u0002Ko.+\u0015oa5\u0015c", "u(I", "Adc\u0013b9<S\u0001~vl<\n\t!i\u000f+bJ\u000b\u001d\u0013Jo\n;T/>g\r-3q\u001f=[\u0002Ko.+\u0015oa5\u0015c", "uY\u0018#", "4na0X\u0017EO\u0017~lb;\u007fo9o\u0006$~@|\u0016\u0001Hp\u001c<\u0006", "5dc\u0013b9<S\u0004\u0006v\\,n\r>hf2\u0006F|\u001a\u0017Cnw=w35h<0;g#.TC7y4", "Adc\u0013b9<S\u0004\u0006v\\,n\r>hf2\u0006F|\u001a\u0017Cnw=w35h<0;g#.TC7y4", "6`b\u001aX(Lc&~g^:\r\u0010>", "5dc\u0015T:&S\u0015\r\u000bk,i\t=u\u00077", "7mc?b+NQ\u0019\rbh;\u0001\u00138F\r$\u0004@j\u0018\u0004Gp\u000eIv.3Y", "5dc\u0016a;K]\u0018\u000fx^:d\u0013>i\n1\\M|\u001f\u00171pz<w%BY\u0007\u001e7", "7me._0=O(~eZ9|\u0012>L{<{M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "7r0Ag(<V\u0019}", "7r29\\7IW\"\u0001", "7rE._0==+\bzk\u001az\u0013:e", ":`bA?(RS&Z\u0002i/x", "\nrTA \u0006\u0017", ":`bA?(RS&]\bZ>\u0001\u00121W{6iF\u0005\"\"Gn", "5dc\u0019T:M:\u0015\u0013zk\u000b\n\u0005Ai\t*m<\u000f\u0005\u001dKz\u0019<ucE]w-7t\u0016*[C", ":`bA@,:a)\fzf,\u0006\u0018\ro\t6\u000bM|\u001b V}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u0019T:M;\u0019z\tn9|\u0011/n\u000f\u0006\u0006I\u000f&$Cs\u0017K\u0005l=g]\u00053L\u001cl]G5x4%\u0015do9", "u(9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%4@y47zk", ":`h2e", "5dc\u0019T@>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006`7>Y|\u00073\u0002\u0016;#", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ":`h2e\tE]\u0017\u0005", "5dc\u0019T@>`u\u0006\u0005\\2", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", ":`h2e\u000b>\\'\u0003\nr", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ":`h2e\u0013:g#\u000f\n=0\n\t-t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ":`h2e\u0017Ha\u001d\u000e~h5x\u0010\u001ar\n3{M\u0010\u001b\u0017U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b%BD\b.;|\u001a8V?BVA( hnH\u000bc:$", ":`h<h;\u001dW&~xm0\u0007\u0012", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "5dc\u0019T@Hc(g\u0005],", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6L\u00165ME7z4s", ":n^8T/>O\u0018]ze,~\u0005>e", "5dc\u0019b6DO\u001c~v]\u000b|\u0010/g{7{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]/?_y#7i\u0015\rMJ;m0-\u0015>", "Adc\u0019b6DO\u001c~v]\u000b|\u0010/g{7{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#\u0001/;U\u0001 3lt.TC=gC\u001ej,R", "D`[BX", ";dP@h9>@\u0019\r\u000be;", "5dc\u001aX(Lc&~g^:\r\u0010>$\u0010,uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001dYy.Gz\u0016\u001bMQKrCs", "Adc\u001aX(Lc&~g^:\r\u0010>$\u0010,uM\u0001\u001e\u0017C}\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0003.[SBz\na\u0006", ";h]6`<FB#\u000fxa\u001bx\u00161e\u000f\u0016\u007fU\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u001a\\5B[)\u0007ih<z\f\u001ea\r*{On\u001b,G7v\u001f>*2F{", "=kS\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "", ">`a2a;", "5dc\u001dT9>\\(", ">`a2a;\u001c]#\fyb5x\u0018/s", "5dc\u001dT9>\\(\\\u0005h9{\r8a\u000f(\n", ">`a2a;\u001dO(z", "", "5dc\u001dT9>\\(]vm(", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ">`a2a;%O-\t\u000bm\n\u0007\u0013<d\u00041wO\u0001%", "5dc\u001dT9>\\(evr6\r\u0018\ro\n5zD\n\u0013&G}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", ">nb6g0H\\", "5dc\u001db:Bb\u001d\t\u0004&5f\u0007--{&", "Adc\u001db:Bb\u001d\t\u0004&s~\u001dCY\\6", "uI\u0018#", "\u0018", ">q^C\\+>Rt\u0006~`5\u0005\t8tf,\u0005@\u000f", "", "5dc\u001de6OW\u0018~y:3\u0001\u000b8m\u007f1\u000b'\u0005 \u0017U", "u(;7T=:\u001d)\u000e~euj\t>;", "@dRA6(<V\u0019", "5dc\u001fX*M1\u0015|}^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#e0Fi\u00135M0;iCs", "@d[2T:>R", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "AmP=f/Hb\u0003{\t^9\u000e\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%BG\u0007\u001cB{\u00198\\-8y4+&hn\u000f", "5dc a(Ia\u001c\t\nH)\u000b\t<v\u007f5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006`7>Y\u000b\u000e@i!<PMJU1,\u0015ur9\u00149", "B`X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "5dc!T0E", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B\u0018f*6mk", "EqP=c,=", "5dc$e(I^\u0019}9n0v\u0016/l\u007f$\n@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Y[*Az\u00152V?JuAs", "Adc$e(I^\u0019}9n0v\u0016/l\u007f$\n@", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW%\u0001$57\b*Dl\u001a7IREx\na\u0006", "EqP=c,=0-", "5dc$e(I^\u0019}Wrj\r\r)r\u007f/{<\u000f\u0017", "Adc$e(I^\u0019}Wrj\r\r)r\u007f/{<\u000f\u0017", "HH]1X?", "5dc'<5=S,", "Adc'<5=S,", "uE\u0018#", "/mR2f;H`\b\tah*x\u0010", "/mR2f;H`", "@dRA", "1kX=56N\\\u0018\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "=eU@X;", "7mR9h+>;#\u000e~h5]\u0016+m\u007f\u0012|-\u0001\u0018\u0017To\u0017:v", "/mR2f;H`\b\tah*x\u0010vSy\u0011\u0006<a\u0007", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW%\u0001$57\b*Dl\u001a7IREx\n\u0003\n,F", "1`[0h3:b\u0019f~g0\u0005\u00197T\n8yCo\u0013$Io\u001d'r$4]\u0007\"", "1`[0h3:b\u0019f~g0\u0005\u00197T\n8yCo\u0013$Io\u001d'r$4]\u0007\"~Mg\u0014`4&[", "uI\u0018\u0017", "2hbAT5<S|\bbb5\u0001\u0011?mn2\f>\u0004\u0006\u0013Tq\u000eK", ">nX;g,K>#\r~m0\u0007\u0012", "2hbAT5<S|\bbb5\u0001\u0011?mn2\f>\u0004\u0006\u0013Tq\u000eK>4J+O%#\u007f", "uI9u9", "2qPD", "1`]CT:", "5qP=[0<a\u007fz\u000f^9", "2qPD56KR\u0019\f", ">`X;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "2qPD66Gb\u0015\u0003\u0004^+[\u0016+wg2zD\u0002\u001b\u0017T}", "3mbBe,%]#\u0005va,x\b\u000ee\u0007(}<\u0010\u0017tTo\nKv$", "4h]166F[#\bVg*|\u0017>o\r", "=sW2e", "4h]166F[#\bVg*|\u0017>o\rf\fDz$\u0017No\nJv", "4q^:C(KS\"\u000eeh:\u0001\u00183o\t", "4q^:C(KS\"\u000eeh:\u0001\u00183o\toN.T\bzVu", "uIIu=", "4q^:C(KS\"\u000eg^*\f", "0nd;W:", "6`b\u001bb+>", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001b]\u0007\u001f\r", "6`b\u001bb+>\u001b{RFo6Zl", "uH\u0018'", "6dP1", "6dP1 \u000f\u0012\u001f*\tXB", "uH\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`/y\r@w)5f<\tAl\u0016\u0004", "6dP1A6=S", "7mR9h+>B\u0015\u0003\u0002", "6hc!X:M", "6hc!X:MA#\u000f\b\\,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MH*\u0017\"$WaG\u0016Q6^\u0004%G\"", "6hc!X:M@\u0019\r\u000be;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9p@\u0006\u00145g\r\r7{&5\\\u0019", "7rC<h*A3*~\u0004m", "7r8;?(RS&", "6hc!X:M\u001b\r\u000bk:;\rl", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW%\u0001$57\b*Dl\u001a7IRExr\u0001\u0019wP9\u0015r\u001aX\u00074EL$\u0011CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuR\f:hJn\u001a\u001d$j~QC\u0010U\n\u001c\u0005\u0017\u001e]\nJ", "6hc!X:M1\u001c\u0003\u0002]", "6hc!X:M1\u001c\u0003\u0002]sp\u0015 A\u000f8_", "7me._0=O(~aZ@|\u0016", "7r?<\\5MS&b\u0004;6\r\u0012.s", "7r?<\\5MS&b\u0004;6\r\u0012.sG.C\u000f\b\u0003a/", "uI\u0018'", "7rC?T5L^\u0015\fzg;", ":nR._\tHc\"}~g.Y\u0013BO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "And?V,\u001c]#\fyb5x\u0018/s", ":nR._\u0017Ha\u001d\u000e~h5f\n", "@d[.g0OS\b\thh<\n\u0007/", ":nR._\u0017Ha\u001d\u000e~h5f\nvRO\u0007{\u0012Pr", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7\u001eJH", ":nR._\u0017Ha\u001d\u000e~h5f\nvSy\u0011\u0006<a\u0007", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7\u001e{'\u0011", ":nR._\u001bH@#\t\n", "@d[.g0OS\b\tah*x\u0010", ":nR._\u001bH@#\t\n&\u0014bP\u0012zS\u0018", ":nR._\u001bHA\u0017\fz^5", ":nR._\u001bHA\u0017\fz^5Dp\u0015-b=O0", ":nR._\u001bHE\u001d\byh>", ":nR._\u001bHE\u001d\byh>Dp\u0015-b=O0", "=eU@X;\u001f`#\u0007Z].|", "=eU@X;\u001f`#\u0007Z].|P\u0017KG\u000b\u0011\u0014p", "=m2<b9=W\"z\n^:l\u0017/d", "=m2<b9=W\"z\n^:l\u0017/d>8\u007f:\u000e\u0017\u001eGk\u001c<", "=m;.l6Nb\u0001\tyb-\u0001\t<N\n'{\u001e\u0004\u0013 Io\r", "=m;.l6Nb\u0002\ty^\b\f\u0018+c\u0003", "=m<2T:N`\u0019kzl<\u0004\u0018\rh{1}@\u007f", "EhSA[", "6dX4[;", "=m<2T:N`\u0019}", "=m?9T*>R", "=mA2_,:a\u0019", ">da3b9F2&z\r", ">da3b9FW\"\u0001b^(\u000b\u0019<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1n]@g9:W\"\u000e\t", "0k^0^", ">da3b9FW\"\u0001b^(\u000b\u0019<eG\u000eJ\u000baj*#", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzT\u00127LPEo31^fkA\u0012m:N@7K\u0016U(p\\\u0003L]|a\nL+\t\u0002`Ay", ">kP0X\bM", ">kP0X\bM\u001b\u001aQ\u000eO\u000e\u0006\u0013", "uI5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1\u0007", "uI5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG'3\u0002\u0016;\u0017%Hg?!\u0019fo \u0003w,[Lj8", ">kP0X\u001a>Z\u001a", ">kP0X\u001a>Z\u001aFbE.\u0010e)4", "uI5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\rT\u00127LPEo31^fkA\u0012m:N@7K\u0016P9X]uA\u0012 $\u0015J?\r\u0012##1jO:#\u0006:0}Oh\u000eaY~", ">kP0X\u001a>Z\u001aZ\u0006i(\n\t8tn2h@|\u001e\u0001Hp\u001c<\u0006", ">kP0X\u001a>Z\u001aZ\u0006i(\n\t8tn2h@|\u001e\u0001Hp\u001c<\u0006l\u001d@\u007f3\u0014gd", "@dRA<5)O&~\u0004m", "1kX=G6&W\"\u0003\u0003n4k\u0013?c\u0003\u0017wM\u0003\u0017&5s#<", "@dRA<5)O&~\u0004mj\r\r)r\u007f/{<\u000f\u0017", "@d[2T:>:\u0015\u0013zk", "@d_9T*>", "@d_9T*>\u0012)\u0003tk,\u0004\t+s\u007f", "Aba2X5-]\u007f\txZ3", "@d[.g0OS\b\th\\9|\t8", "Aba2X5-]\u007f\txZ3Dp\u0015-b=O0", "Ag^B_+,V\u0015\fzI6\u0001\u0012>e\r\f\u0005K\u0011&\tK~\u0011*z\"<]\u0007\"E", "Bn?.e,Gb\u0004\t\tb;\u0001\u00138", "Bn?.e,Gb\u0004\t\tb;\u0001\u00138-R\u0016O1d&\u001d", "Bnd0[\tHc\"}\tB5i\u00139t", "BqP;f-H`!_\bh4", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "BqP;f-H`!_\bh4Dh\u00168\\\u0017\u007f\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7/g'\u001d", "BqP;f-H`!_\bh4X\u0012-e\u000e7\u0006M", "BqP;f-H`!_\bh4X\u0012-e\u000e7\u0006MHv}\u001aL|@I", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW%\u0001$57\b*Dl\u001a7IREx\n\u0014u,R", "BqP;f-H`!m\u0005:5z\t=t\n5", "BqP;f-H`!m\u0005:5z\t=t\n5C gis6s`", "BqP;f-H`!m\u0005L*\n\t/n", "BqP;f-H`!m\u0005L*\n\t/nGwN=f\u0014\tE", "uZ5uI", "CoS.g,%O-~\b;3\u0007\u00075", "4na0X\u001cIR\u0015\u000ezE(\u0011\t<P{5wH\u0001&\u0017T}", "CoS.g,%O-~\bI(\n\u00057e\u000f(\tN", "7me<^,(\\\u007fz\u000fh<\ff2a\t*{", "Dhb6g\u0015HR\u0019\r", "\"", "Dhb6g\u0015HR\u0019\rBZ\u0013zj\u007fgk", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuz^", ";`b8", "Eh]1b>-]\u007f\txZ3", "@d[.g0OS\b\tlb5{\u0013A", "Eh]1b>-]\u007f\txZ3Dp\u0015-b=O0", "Ehc5C6LW(\u0003\u0005g\u001b\n\u00058s\u0007$\u000bD\u000b ", "Ehc5\\5%O-~\b;6\r\u0012.s", "Ehc5\\5%O-~\b;6\r\u0012.sG.C\u000f\b\u0003a/", "6hc", "6hcy$/\"F\t\u0004j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2sB\b\u001f7C|*VBHu8\u001d(2_C\u000fn6\\vpWP\u00185fQr\u0007|\u001cY\u000e,5\u0017\u0012XE-jSA,F\u000fM\u0011*h\u000f\u001b\u0004\u0018EwnB,t.u\u001etN3lEl)wQIPl8dUo!&CD#\u0014;{\u001fw?.\u0018\u000b@\u0011\u0001b\u0001v=<\u000e>)", "6hc\u001bX(K", "2hbAT5<Sy\f\u0005f\f{\u000b/", "6hc\u001bX(K\u001b}awA6jt", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2sB\b\u001f7C|*VBHu8\u001d(2_C\u000fn6\\vpWP\u00185fQr\u0007|\u001cY\u000e,5\u0017\u0012XE-jSA,F\u000fM\u0011*h\u000f\u001b\u0004\u0018EwnB,t.u\u001etN3lEl)wQIPl8dUo!&CD#\u0014;{\u001fw?.\u0018\u000b@\u0011\u0001b\u0001v=<\u000e[{\u0015", "AoT0h3:b\u001d\u0010zA0\f", "AoT0h3:b\u001d\u0010zA0\fP\u0014H|\u000b\u0006.l", "Bn2<b9=W\"z\nh9", "\u0011n\\=T5B]\"", "\u0016hc!X:MA#\u000f\b\\,", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final int $stable = 0;
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private GraphicsLayer explicitLayer;
    private boolean forceMeasureWithLookaheadConstraints;
    private boolean forcePlaceWithLookaheadOffset;
    private boolean isClipping;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private boolean released;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;
    public static final Companion Companion = new Companion(null);
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayerParams = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator nodeCoordinator) {
            if (nodeCoordinator.isValidOwnerScope()) {
                LayerPositionalProperties layerPositionalProperties = nodeCoordinator.layerPositionalProperties;
                if (layerPositionalProperties != null) {
                    NodeCoordinator.tmpLayerPositionalProperties.copyFrom(layerPositionalProperties);
                    NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
                    if (!NodeCoordinator.tmpLayerPositionalProperties.hasSameValuesAs(layerPositionalProperties)) {
                        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                        LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                        if (layoutDelegate$ui_release.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                            if (layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement()) {
                                LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                            }
                            layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                        }
                        Owner owner$ui_release = layoutNode.getOwner$ui_release();
                        if (owner$ui_release != null) {
                            owner$ui_release.requestOnPositionedCallback(layoutNode);
                            return;
                        }
                        return;
                    }
                    return;
                }
                NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
            }
        }
    };
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayer = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator nodeCoordinator) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m4409constructorimpl$default(null, 1, null);
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-YqVAtuI, reason: not valid java name */
        public void mo5744childHitTestYqVAtuI(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, boolean z2, boolean z3) {
            layoutNode.m5666hitTestM_7yMNQ$ui_release(j2, hitTestResult, z2, z3);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo5745entityTypeOLwlOKw() {
            return NodeKind.m5749constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v6 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            int iM5749constructorimpl = NodeKind.m5749constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != 0) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else {
                    int kindSet$ui_release = node.getKindSet$ui_release();
                    if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release();
                        int i2 = 0;
                        node = node;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    node = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node != 0) {
                                        if (mutableVector != null) {
                                            mutableVector.add(node);
                                        }
                                        node = 0;
                                    }
                                    if (mutableVector != null) {
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            delegate$ui_release = delegate$ui_release.getChild$ui_release();
                            node = node;
                        }
                        if (i2 == 1) {
                        }
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector);
            }
            return false;
        }
    };
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
            boolean z2 = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isClearingSemantics()) {
                z2 = true;
            }
            return !z2;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        public void mo5744childHitTestYqVAtuI(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, boolean z2, boolean z3) {
            layoutNode.m5667hitTestSemanticsM_7yMNQ$ui_release(j2, hitTestResult, z2, z3);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw */
        public int mo5745entityTypeOLwlOKw() {
            return NodeKind.m5749constructorimpl(8);
        }
    };
    private Density layerDensity = getLayoutNode().getDensity();
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.Companion.m6776getZeronOccac();
    private final Function2<Canvas, GraphicsLayer, Unit> drawBlock = new Function2<Canvas, GraphicsLayer, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas, GraphicsLayer graphicsLayer) {
            invoke2(canvas, graphicsLayer);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final Canvas canvas, final GraphicsLayer graphicsLayer) {
            if (this.this$0.getLayoutNode().isPlaced()) {
                OwnerSnapshotObserver snapshotObserver = this.this$0.getSnapshotObserver();
                NodeCoordinator nodeCoordinator = this.this$0;
                Function1 function1 = NodeCoordinator.onCommitAffectingLayer;
                final NodeCoordinator nodeCoordinator2 = this.this$0;
                snapshotObserver.observeReads$ui_release(nodeCoordinator, function1, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        nodeCoordinator2.drawContainedDrawModifiers(canvas, graphicsLayer);
                    }
                });
                this.this$0.lastLayerDrawingWasSkipped = false;
                return;
            }
            this.this$0.lastLayerDrawingWasSkipped = true;
        }
    };
    private final Function0<Unit> invalidateParentLayer = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NodeCoordinator wrappedBy$ui_release = this.this$0.getWrappedBy$ui_release();
            if (wrappedBy$ui_release != null) {
                wrappedBy$ui_release.invalidateLayer();
            }
        }
    };

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<$a&yCQU\"}(\u000bWN}gvJ`\fIm\u001cǝ)jZH\u001e1k\u0012'2ppo7[qU9\u000fwf\t.6:8(\n1\u001e8N(v)J{\u0010 8Xph[=Q\u0013$*\u0006l)GBתfޮɇLncE=/K\u0001P[?c@|S\u000etbm1ɱ`\u001dӡ?ʺ߱\u0019'Y\u0012\u0015b$M\u0011P\n=3qW+9[\fWdkF8]9]!urTe5Un!?+}f\u0012t̤'w߁{\u001cD\u0007\u0014ΜCv-5\u001al'\u00165z\u0012\u0002?й\u0006t\u070e\u0004y"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MH*\u0017\"$WaG\u0016Q6^\u0004%G\"", "", "1gX9W\u000fBb\b~\tm", "", ":`h<h;']\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", ">nX;g,K>#\r~m0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "6hc!X:M@\u0019\r\u000be;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9p@\u0006\u00145g\r\r7{&5\\\u0019", "7rC<h*A3*~\u0004m", "", "7r8;?(RS&", "1gX9W\u000fBb\b~\tmsp\u0015 A\u000f8_", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u00042*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001c{G\u0013\u0012$pR:{\u0005gP\u0011nRG&\u0017\u0002>v~Y", "3mc6g@-g$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001b]\u0007\u001f\r", "3mc6g@-g$~BH\u0013\u000f\u0010\u0019K\u0012", "u(8", "7mc2e*>^(h\u000bm\u0016}e9u\t'\n\u001e\u0004\u001b\u001eFO\u001f<\u007f4C", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "Ag^B_+!W(mzl;Z\f3l~5{I", ">`a2a;%O-\t\u000bm\u0015\u0007\b/", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface HitTestSource {
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        void mo5744childHitTestYqVAtuI(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, boolean z2, boolean z3);

        /* JADX INFO: renamed from: entityType-OLwlOKw */
        int mo5745entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(Modifier.Node node);

        boolean shouldHitTestChildren(LayoutNode layoutNode);
    }

    private static /* synthetic */ void getDrawBlock$annotations() {
    }

    public abstract void ensureLookaheadDelegateCreated();

    public abstract LookaheadDelegate getLookaheadDelegate();

    public abstract Modifier.Node getTail();

    protected abstract void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate);

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    public final boolean getForcePlaceWithLookaheadOffset$ui_release() {
        return this.forcePlaceWithLookaheadOffset;
    }

    public final void setForcePlaceWithLookaheadOffset$ui_release(boolean z2) {
        this.forcePlaceWithLookaheadOffset = z2;
    }

    public final boolean getForceMeasureWithLookaheadConstraints$ui_release() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    public final void setForceMeasureWithLookaheadConstraints$ui_release(boolean z2) {
        this.forceMeasureWithLookaheadConstraints = z2;
    }

    public final NodeCoordinator getWrapped$ui_release() {
        return this.wrapped;
    }

    public final void setWrapped$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final NodeCoordinator getWrappedBy$ui_release() {
        return this.wrappedBy;
    }

    public final void setWrappedBy$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return isPlacedUnderMotionFrameOfReference();
    }

    public final Modifier.Node headNode(boolean z2) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes$ui_release().getHead$ui_release();
        }
        if (z2) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator == null || (tail = nodeCoordinator.getTail()) == null) {
                return null;
            }
            return tail.getChild$ui_release();
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            return nodeCoordinator2.getTail();
        }
        return null;
    }

    public final void visitNodes(int i2, boolean z2, Function1<? super Modifier.Node, Unit> function1) {
        Modifier.Node tail = getTail();
        if (!z2 && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(z2); nodeHeadNode != null; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
            int aggregateChildKindSet$ui_release = nodeHeadNode.getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + i2) - (aggregateChildKindSet$ui_release | i2) == 0) {
                return;
            }
            int kindSet$ui_release = nodeHeadNode.getKindSet$ui_release();
            if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                function1.invoke(nodeHeadNode);
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: visitNodes-aLcG6gQ */
    public final /* synthetic */ <T> void m5742visitNodesaLcG6gQ(int i2, Function1<? super T, Unit> function1) {
        boolean zM5758getIncludeSelfInTraversalH91voCI = NodeKindKt.m5758getIncludeSelfInTraversalH91voCI(i2);
        Modifier.Node tail = getTail();
        if (zM5758getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(zM5758getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui_release() & i2) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
                int kindSet$ui_release = nodeHeadNode.getKindSet$ui_release();
                if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                    Modifier.Node nodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (nodePop instanceof Object) {
                            function1.invoke(nodePop);
                        } else if ((nodePop.getKindSet$ui_release() & i2) != 0 && (nodePop instanceof DelegatingNode)) {
                            int i3 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((-1) - (((-1) - delegate$ui_release.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        nodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(nodePop);
                                            }
                                            nodePop = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (nodeHeadNode == tail) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: hasNode-H91voCI */
    private final boolean m5721hasNodeH91voCI(int i2) {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m5758getIncludeSelfInTraversalH91voCI(i2));
        return nodeHeadNode != null && DelegatableNodeKt.m5634has64DMado(nodeHeadNode, i2);
    }

    /* JADX INFO: renamed from: head-H91voCI */
    public final Modifier.Node m5735headH91voCI(int i2) {
        boolean zM5758getIncludeSelfInTraversalH91voCI = NodeKindKt.m5758getIncludeSelfInTraversalH91voCI(i2);
        Modifier.Node tail = getTail();
        if (zM5758getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(zM5758getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui_release() & i2) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
                int kindSet$ui_release = nodeHeadNode.getKindSet$ui_release();
                if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                    return nodeHeadNode;
                }
                if (nodeHeadNode == tail) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long mo5522getSizeYbymL2g() {
        return m5573getMeasuredSizeYbymL2g();
    }

    protected final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            mo5575placeAtf8xVGno(mo5692getPositionnOccac(), this.zIndex, graphicsLayer);
        } else {
            mo5515placeAtf8xVGno(mo5692getPositionnOccac(), this.zIndex, this.layerBlock);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().isAttached();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    public void setMeasureResult$ui_release(MeasureResult measureResult) {
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                onMeasureResultChanged(measureResult.getWidth(), measureResult.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if (((map == null || map.isEmpty()) && measureResult.getAlignmentLines().isEmpty()) || Intrinsics.areEqual(measureResult.getAlignmentLines(), this.oldAlignmentLines)) {
                return;
            }
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            LinkedHashMap linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(measureResult.getAlignmentLines());
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? SetsKt.emptySet() : linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    protected void onMeasureResultChanged(int i2, int i3) {
        NodeCoordinator nodeCoordinator;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo5800resizeozmzZPI(IntSizeKt.IntSize(i2, i3));
        } else if (getLayoutNode().isPlaced() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.invalidateLayer();
        }
        m5576setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i2, i3));
        if (this.layerBlock != null) {
            updateLayerParameters(false);
        }
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(4);
        boolean zM5758getIncludeSelfInTraversalH91voCI = NodeKindKt.m5758getIncludeSelfInTraversalH91voCI(iM5749constructorimpl);
        Modifier.Node tail = getTail();
        if (zM5758getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(zM5758getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (-1) - (((-1) - nodeHeadNode.getAggregateChildKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
                if ((nodeHeadNode.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                    Modifier.Node nodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof DrawModifierNode) {
                            ((DrawModifierNode) nodePop).onMeasureResultChanged();
                        } else {
                            int kindSet$ui_release = nodePop.getKindSet$ui_release();
                            if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                                int i4 = 0;
                                nodePop = nodePop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                                        i4++;
                                        if (i4 == 1) {
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
                                if (i4 == 1) {
                                }
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (nodeHeadNode == tail) {
                    break;
                }
            }
        }
        Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac */
    public long mo5692getPositionnOccac() {
        return this.position;
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs */
    protected void m5740setPositiongyyYBs(long j2) {
        this.position = j2;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    protected final void setZIndex(float f2) {
        this.zIndex = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        if (!getLayoutNode().getNodes$ui_release().m5710hasH91voCI$ui_release(NodeKind.m5749constructorimpl(64))) {
            return null;
        }
        getTail();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Modifier.Node tail$ui_release = getLayoutNode().getNodes$ui_release().getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((-1) - (((-1) - NodeKind.m5749constructorimpl(64)) | ((-1) - tail$ui_release.getKindSet$ui_release())) != 0) {
                int iM5749constructorimpl = NodeKind.m5749constructorimpl(64);
                MutableVector mutableVector = null;
                Modifier.Node nodePop = tail$ui_release;
                while (nodePop != 0) {
                    if (nodePop instanceof ParentDataModifierNode) {
                        objectRef.element = ((ParentDataModifierNode) nodePop).modifyParentData(getLayoutNode().getDensity(), objectRef.element);
                    } else {
                        int kindSet$ui_release = nodePop.getKindSet$ui_release();
                        if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
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
                    }
                    nodePop = DelegatableNodeKt.pop(mutableVector);
                }
            }
        }
        return objectRef.element;
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        return this.wrappedBy;
    }

    protected final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: getLastMeasurementConstraints-msEJaDk$ui_release */
    public final long m5733getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return m5574getMeasurementConstraintsmsEJaDk();
    }

    /* JADX INFO: renamed from: performingMeasure-K40F9xA */
    protected final Placeable m5738performingMeasureK40F9xA(long j2, Function0<? extends Placeable> function0) {
        m5577setMeasurementConstraintsBRTryo0(j2);
        return function0.invoke();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo5515placeAtf8xVGno(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            m5725placeSelfMLgxB_4(lookaheadDelegate.mo5692getPositionnOccac(), f2, function1, null);
            return;
        }
        m5725placeSelfMLgxB_4(j2, f2, function1, null);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo5575placeAtf8xVGno(long j2, float f2, GraphicsLayer graphicsLayer) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            m5725placeSelfMLgxB_4(lookaheadDelegate.mo5692getPositionnOccac(), f2, null, graphicsLayer);
            return;
        }
        m5725placeSelfMLgxB_4(j2, f2, null, graphicsLayer);
    }

    /* JADX INFO: renamed from: placeSelf-MLgxB_4 */
    private final void m5725placeSelfMLgxB_4(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1, GraphicsLayer graphicsLayer) {
        if (graphicsLayer != null) {
            if (!(function1 == null)) {
                InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != graphicsLayer) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
                this.explicitLayer = graphicsLayer;
            }
            if (this.layer == null) {
                OwnedLayer ownedLayerCreateLayer = LayoutNodeKt.requireOwner(getLayoutNode()).createLayer(this.drawBlock, this.invalidateParentLayer, graphicsLayer);
                ownedLayerCreateLayer.mo5800resizeozmzZPI(m5573getMeasuredSizeYbymL2g());
                ownedLayerCreateLayer.mo5799movegyyYBs(j2);
                this.layer = ownedLayerCreateLayer;
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
            }
            updateLayerBlock$default(this, function1, false, 2, null);
        }
        if (!IntOffset.m6765equalsimpl0(mo5692getPositionnOccac(), j2)) {
            m5740setPositiongyyYBs(j2);
            getLayoutNode().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo5799movegyyYBs(j2);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
            if (owner$ui_release != null) {
                owner$ui_release.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = f2;
        if (isPlacingForAlignment$ui_release()) {
            return;
        }
        captureRulers$ui_release(getMeasureResult$ui_release());
    }

    public final void releaseLayer() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            updateLayerBlock$default(this, null, false, 2, null);
            LayoutNode.requestRelayout$ui_release$default(getLayoutNode(), false, 1, null);
        }
    }

    /* JADX INFO: renamed from: placeSelfApparentToRealOffset-MLgxB_4 */
    public final void m5739placeSelfApparentToRealOffsetMLgxB_4(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1, GraphicsLayer graphicsLayer) {
        m5725placeSelfMLgxB_4(IntOffset.m6770plusqkQi6aY(j2, m5572getApparentToRealOffsetnOccac()), f2, function1, graphicsLayer);
    }

    public final void draw(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas, graphicsLayer);
            return;
        }
        float fM6766getXimpl = IntOffset.m6766getXimpl(mo5692getPositionnOccac());
        float fM6767getYimpl = IntOffset.m6767getYimpl(mo5692getPositionnOccac());
        canvas.translate(fM6766getXimpl, fM6767getYimpl);
        drawContainedDrawModifiers(canvas, graphicsLayer);
        canvas.translate(-fM6766getXimpl, -fM6767getYimpl);
    }

    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas, graphicsLayer);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        nodeCoordinator.updateLayerBlock(function1, z2);
    }

    public final void updateLayerBlock(Function1<? super GraphicsLayerScope, Unit> function1, boolean z2) {
        Owner owner$ui_release;
        if (!(function1 == null || this.explicitLayer == null)) {
            InlineClassHelperKt.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z3 = (!z2 && this.layerBlock == function1 && Intrinsics.areEqual(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.isAttached() && function1 != null) {
            this.layerBlock = function1;
            if (this.layer == null) {
                OwnedLayer ownedLayerCreateLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(layoutNode), this.drawBlock, this.invalidateParentLayer, null, 4, null);
                ownedLayerCreateLayer$default.mo5800resizeozmzZPI(m5573getMeasuredSizeYbymL2g());
                ownedLayerCreateLayer$default.mo5799movegyyYBs(mo5692getPositionnOccac());
                this.layer = ownedLayerCreateLayer$default;
                updateLayerParameters$default(this, false, 1, null);
                layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                return;
            }
            if (z3) {
                updateLayerParameters$default(this, false, 1, null);
                return;
            }
            return;
        }
        this.layerBlock = null;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.destroy();
            layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
            this.invalidateParentLayer.invoke();
            if (isAttached() && (owner$ui_release = layoutNode.getOwner$ui_release()) != null) {
                owner$ui_release.onLayoutChange(layoutNode);
            }
        }
        this.layer = null;
        this.lastLayerDrawingWasSkipped = false;
    }

    static /* synthetic */ void updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = true;
        }
        nodeCoordinator.updateLayerParameters(z2);
    }

    private final void updateLayerParameters(boolean z2) {
        Owner owner$ui_release;
        if (this.explicitLayer != null) {
            return;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            Function1<? super GraphicsLayerScope, Unit> function1 = this.layerBlock;
            if (function1 != null) {
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
                reusableGraphicsLayerScope.reset();
                reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
                reusableGraphicsLayerScope.setLayoutDirection$ui_release(getLayoutNode().getLayoutDirection());
                reusableGraphicsLayerScope.m4490setSizeuvyYCjk(IntSizeKt.m6820toSizeozmzZPI(mo5522getSizeYbymL2g()));
                getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator.updateLayerParameters.1
                    final /* synthetic */ Function1<GraphicsLayerScope, Unit> $layerBlock;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Function1<? super GraphicsLayerScope, Unit> function12) {
                        super(0);
                        function1 = function12;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke */
                    public final void invoke2() {
                        function1.invoke(NodeCoordinator.graphicsLayerScope);
                        NodeCoordinator.graphicsLayerScope.updateOutline$ui_release();
                    }
                });
                LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
                if (layerPositionalProperties == null) {
                    layerPositionalProperties = new LayerPositionalProperties();
                    this.layerPositionalProperties = layerPositionalProperties;
                }
                layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
                ownedLayer.updateLayerProperties(reusableGraphicsLayerScope);
                this.isClipping = reusableGraphicsLayerScope.getClip();
                this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
                if (!z2 || (owner$ui_release = getLayoutNode().getOwner$ui_release()) == null) {
                    return;
                }
                owner$ui_release.onLayoutChange(getLayoutNode());
                return;
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        if (!(this.layerBlock == null)) {
            InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1 */
    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function1<GraphicsLayerScope, Unit> $layerBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super GraphicsLayerScope, Unit> function12) {
            super(0);
            function1 = function12;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            function1.invoke(NodeCoordinator.graphicsLayerScope);
            NodeCoordinator.graphicsLayerScope.updateOutline$ui_release();
        }
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.lastLayerDrawingWasSkipped;
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-NH-jbRc */
    public final long m5734getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo711toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo5670getMinimumTouchTargetSizeMYxV2XQ());
    }

    /* JADX INFO: renamed from: hitTest-YqVAtuI */
    public final void m5736hitTestYqVAtuI(HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, boolean z2, boolean z3) {
        Modifier.Node nodeM5735headH91voCI = m5735headH91voCI(hitTestSource.mo5745entityTypeOLwlOKw());
        if (!m5743withinLayerBoundsk4lQ0M(j2)) {
            if (z2) {
                float fM5731distanceInMinimumTouchTargettz77jQw = m5731distanceInMinimumTouchTargettz77jQw(j2, m5734getMinimumTouchTargetSizeNHjbRc());
                if (!Float.isInfinite(fM5731distanceInMinimumTouchTargettz77jQw) && !Float.isNaN(fM5731distanceInMinimumTouchTargettz77jQw) && hitTestResult.isHitInMinimumTouchTargetBetter(fM5731distanceInMinimumTouchTargettz77jQw, false)) {
                    m5723hitNearJHbHoSQ(nodeM5735headH91voCI, hitTestSource, j2, hitTestResult, z2, false, fM5731distanceInMinimumTouchTargettz77jQw);
                    return;
                }
                return;
            }
            return;
        }
        if (nodeM5735headH91voCI == null) {
            mo5658hitTestChildYqVAtuI(hitTestSource, j2, hitTestResult, z2, z3);
            return;
        }
        if (!m5737isPointerInBoundsk4lQ0M(j2)) {
            float fM5731distanceInMinimumTouchTargettz77jQw2 = !z2 ? Float.POSITIVE_INFINITY : m5731distanceInMinimumTouchTargettz77jQw(j2, m5734getMinimumTouchTargetSizeNHjbRc());
            if (!Float.isInfinite(fM5731distanceInMinimumTouchTargettz77jQw2) && !Float.isNaN(fM5731distanceInMinimumTouchTargettz77jQw2) && hitTestResult.isHitInMinimumTouchTargetBetter(fM5731distanceInMinimumTouchTargettz77jQw2, z3)) {
                m5723hitNearJHbHoSQ(nodeM5735headH91voCI, hitTestSource, j2, hitTestResult, z2, z3, fM5731distanceInMinimumTouchTargettz77jQw2);
                return;
            } else {
                m5726speculativeHitJHbHoSQ(nodeM5735headH91voCI, hitTestSource, j2, hitTestResult, z2, z3, fM5731distanceInMinimumTouchTargettz77jQw2);
                return;
            }
        }
        m5722hit1hIXUjU(nodeM5735headH91voCI, hitTestSource, j2, hitTestResult, z2, z3);
    }

    /* JADX INFO: renamed from: hit-1hIXUjU */
    public final void m5722hit1hIXUjU(final Modifier.Node node, final HitTestSource hitTestSource, final long j2, final HitTestResult hitTestResult, final boolean z2, final boolean z3) {
        if (node == null) {
            mo5658hitTestChildYqVAtuI(hitTestSource, j2, hitTestResult, z2, z3);
        } else {
            hitTestResult.hit(node, z3, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$hit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.m5722hit1hIXUjU(NodeCoordinatorKt.m5747nextUntilhw7D004(node, hitTestSource.mo5745entityTypeOLwlOKw(), NodeKind.m5749constructorimpl(2)), hitTestSource, j2, hitTestResult, z2, z3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: hitNear-JHbHoSQ */
    public final void m5723hitNearJHbHoSQ(final Modifier.Node node, final HitTestSource hitTestSource, final long j2, final HitTestResult hitTestResult, final boolean z2, final boolean z3, final float f2) {
        if (node == null) {
            mo5658hitTestChildYqVAtuI(hitTestSource, j2, hitTestResult, z2, z3);
        } else {
            hitTestResult.hitInMinimumTouchTarget(node, f2, z3, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$hitNear$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.m5723hitNearJHbHoSQ(NodeCoordinatorKt.m5747nextUntilhw7D004(node, hitTestSource.mo5745entityTypeOLwlOKw(), NodeKind.m5749constructorimpl(2)), hitTestSource, j2, hitTestResult, z2, z3, f2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: speculativeHit-JHbHoSQ */
    public final void m5726speculativeHitJHbHoSQ(final Modifier.Node node, final HitTestSource hitTestSource, final long j2, final HitTestResult hitTestResult, final boolean z2, final boolean z3, final float f2) {
        if (node == null) {
            mo5658hitTestChildYqVAtuI(hitTestSource, j2, hitTestResult, z2, z3);
        } else if (!hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            m5726speculativeHitJHbHoSQ(NodeCoordinatorKt.m5747nextUntilhw7D004(node, hitTestSource.mo5745entityTypeOLwlOKw(), NodeKind.m5749constructorimpl(2)), hitTestSource, j2, hitTestResult, z2, z3, f2);
        } else {
            hitTestResult.speculativeHit(node, f2, z3, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.m5726speculativeHitJHbHoSQ(NodeCoordinatorKt.m5747nextUntilhw7D004(node, hitTestSource.mo5745entityTypeOLwlOKw(), NodeKind.m5749constructorimpl(2)), hitTestSource, j2, hitTestResult, z2, z3, f2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: hitTestChild-YqVAtuI */
    public void mo5658hitTestChildYqVAtuI(HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, boolean z2, boolean z3) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m5736hitTestYqVAtuI(hitTestSource, m5720fromParentPosition8S9VItk$default(nodeCoordinator, j2, false, 2, null), hitTestResult, z2, z3);
        }
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long jM5730calculateMinimumTouchTargetPaddingE7KxVPU = m5730calculateMinimumTouchTargetPaddingE7KxVPU(m5734getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m4006getWidthimpl(jM5730calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m4003getHeightimpl(jM5730calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(getMeasuredWidth() + Size.m4006getWidthimpl(jM5730calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setBottom(getMeasuredHeight() + Size.m4003getHeightimpl(jM5730calculateMinimumTouchTargetPaddingE7KxVPU));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesFindRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo5528screenToLocalMKHz9U(long j2) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return mo5523localPositionOfR5De75A(LayoutCoordinatesKt.findRootCoordinates(this), LayoutNodeKt.requireOwner(getLayoutNode()).mo5468screenToLocalMKHz9U(j2));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo5526localToScreenMKHz9U(long j2) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo5467localToScreenMKHz9U(mo5525localToRootMKHz9U(j2));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo5531windowToLocalMKHz9U(long j2) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo5523localPositionOfR5De75A(layoutCoordinatesFindRootCoordinates, Offset.m3941minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo5802calculateLocalPositionMKHz9U(j2), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRootCoordinates)));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo5527localToWindowMKHz9U(long j2) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo5803calculatePositionInWindowMKHz9U(mo5525localToRootMKHz9U(j2));
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (coordinator = lookaheadLayoutCoordinates.getCoordinator()) != null) {
            return coordinator;
        }
        Intrinsics.checkNotNull(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo5523localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j2) {
        return mo5524localPositionOfS_NoaFU(layoutCoordinates, j2, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-S_NoaFU */
    public long mo5524localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j2, boolean z2) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            ((LookaheadLayoutCoordinates) layoutCoordinates).getCoordinator().onCoordinatesUsed$ui_release();
            return Offset.m3946unaryMinusF1C5BW0(layoutCoordinates.mo5524localPositionOfS_NoaFU(this, Offset.m3946unaryMinusF1C5BW0(j2), z2));
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            j2 = coordinator.m5741toParentPosition8S9VItk(j2, z2);
            coordinator = coordinator.wrappedBy;
            Intrinsics.checkNotNull(coordinator);
        }
        return m5719ancestorToLocalS_NoaFU(nodeCoordinatorFindCommonAncestor$ui_release, j2, z2);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo5529transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m4418resetimpl(fArr);
        coordinator.m5729transformToAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, fArr);
        m5728transformFromAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformToScreen-58bKbWc */
    public void mo5530transformToScreen58bKbWc(float[] fArr) {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        m5729transformToAncestorEL8BTi8(toCoordinator(LayoutCoordinatesKt.findRootCoordinates(this)), fArr);
        ownerRequireOwner.mo5466localToScreen58bKbWc(fArr);
    }

    /* JADX INFO: renamed from: transformToAncestor-EL8BTi8 */
    private final void m5729transformToAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!Intrinsics.areEqual(nodeCoordinator2, nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.layer;
            if (ownedLayer != null) {
                ownedLayer.mo5801transform58bKbWc(fArr);
            }
            if (!IntOffset.m6765equalsimpl0(nodeCoordinator2.mo5692getPositionnOccac(), IntOffset.Companion.m6776getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m4418resetimpl(fArr2);
                Matrix.m4429translateimpl$default(fArr2, IntOffset.m6766getXimpl(r0), IntOffset.m6767getYimpl(r0), 0.0f, 4, null);
                Matrix.m4426timesAssign58bKbWc(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator2);
        }
    }

    /* JADX INFO: renamed from: transformFromAncestor-EL8BTi8 */
    private final void m5728transformFromAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (Intrinsics.areEqual(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        Intrinsics.checkNotNull(nodeCoordinator2);
        nodeCoordinator2.m5728transformFromAncestorEL8BTi8(nodeCoordinator, fArr);
        if (!IntOffset.m6765equalsimpl0(mo5692getPositionnOccac(), IntOffset.Companion.m6776getZeronOccac())) {
            float[] fArr2 = tmpMatrix;
            Matrix.m4418resetimpl(fArr2);
            Matrix.m4429translateimpl$default(fArr2, -IntOffset.m6766getXimpl(mo5692getPositionnOccac()), -IntOffset.m6767getYimpl(mo5692getPositionnOccac()), 0.0f, 4, null);
            Matrix.m4426timesAssign58bKbWc(fArr, fArr2);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo5796inverseTransform58bKbWc(fArr);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z2) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        if (!layoutCoordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates " + layoutCoordinates + " is not attached!");
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight(IntSize.m6808getWidthimpl(layoutCoordinates.mo5522getSizeYbymL2g()));
        rectCache.setBottom(IntSize.m6807getHeightimpl(layoutCoordinates.mo5522getSizeYbymL2g()));
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            rectInParent$ui_release$default(coordinator, rectCache, z2, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            coordinator = coordinator.wrappedBy;
            Intrinsics.checkNotNull(coordinator);
        }
        ancestorToLocal(nodeCoordinatorFindCommonAncestor$ui_release, rectCache, z2);
        return MutableRectKt.toRect(rectCache);
    }

    /* JADX INFO: renamed from: ancestorToLocal-S_NoaFU */
    private final long m5719ancestorToLocalS_NoaFU(NodeCoordinator nodeCoordinator, long j2, boolean z2) {
        if (nodeCoordinator == this) {
            return j2;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || Intrinsics.areEqual(nodeCoordinator, nodeCoordinator2)) {
            return m5732fromParentPosition8S9VItk(j2, z2);
        }
        return m5732fromParentPosition8S9VItk(nodeCoordinator2.m5719ancestorToLocalS_NoaFU(nodeCoordinator, j2, z2), z2);
    }

    private final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z2) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z2);
        }
        fromParentRect(mutableRect, z2);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo5525localToRootMKHz9U(long j2) {
        long jM5727toParentPosition8S9VItk$default = j2;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            jM5727toParentPosition8S9VItk$default = m5727toParentPosition8S9VItk$default(nodeCoordinator, jM5727toParentPosition8S9VItk$default, false, 2, null);
        }
        return jM5727toParentPosition8S9VItk$default;
    }

    protected final void withPositionTranslation(Canvas canvas, Function1<? super Canvas, Unit> function1) {
        float fM6766getXimpl = IntOffset.m6766getXimpl(mo5692getPositionnOccac());
        float fM6767getYimpl = IntOffset.m6767getYimpl(mo5692getPositionnOccac());
        canvas.translate(fM6766getXimpl, fM6767getYimpl);
        function1.invoke(canvas);
        canvas.translate(-fM6766getXimpl, -fM6767getYimpl);
    }

    /* JADX INFO: renamed from: toParentPosition-8S9VItk$default */
    public static /* synthetic */ long m5727toParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j2, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = true;
        }
        return nodeCoordinator.m5741toParentPosition8S9VItk(j2, z2);
    }

    /* JADX INFO: renamed from: toParentPosition-8S9VItk */
    public long m5741toParentPosition8S9VItk(long j2, boolean z2) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            j2 = ownedLayer.mo5798mapOffset8S9VItk(j2, false);
        }
        return (z2 || !isPlacedUnderMotionFrameOfReference()) ? IntOffsetKt.m6780plusNvtHpc(j2, mo5692getPositionnOccac()) : j2;
    }

    /* JADX INFO: renamed from: fromParentPosition-8S9VItk$default */
    public static /* synthetic */ long m5720fromParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j2, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = true;
        }
        return nodeCoordinator.m5732fromParentPosition8S9VItk(j2, z2);
    }

    /* JADX INFO: renamed from: fromParentPosition-8S9VItk */
    public long m5732fromParentPosition8S9VItk(long j2, boolean z2) {
        if (z2 || !isPlacedUnderMotionFrameOfReference()) {
            j2 = IntOffsetKt.m6778minusNvtHpc(j2, mo5692getPositionnOccac());
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo5798mapOffset8S9VItk(j2, true) : j2;
    }

    protected final void drawBorder(Canvas canvas, Paint paint) {
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m6808getWidthimpl(m5573getMeasuredSizeYbymL2g()) - 0.5f, IntSize.m6807getHeightimpl(m5573getMeasuredSizeYbymL2g()) - 0.5f), paint);
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.layerBlock, true);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        releaseLayer();
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z2, boolean z3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            z3 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z2, z3);
    }

    public final void rectInParent$ui_release(MutableRect mutableRect, boolean z2, boolean z3) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z3) {
                    long jM5734getMinimumTouchTargetSizeNHjbRc = m5734getMinimumTouchTargetSizeNHjbRc();
                    float fM4006getWidthimpl = Size.m4006getWidthimpl(jM5734getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float fM4003getHeightimpl = Size.m4003getHeightimpl(jM5734getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    mutableRect.intersect(-fM4006getWidthimpl, -fM4003getHeightimpl, IntSize.m6808getWidthimpl(mo5522getSizeYbymL2g()) + fM4006getWidthimpl, IntSize.m6807getHeightimpl(mo5522getSizeYbymL2g()) + fM4003getHeightimpl);
                } else if (z2) {
                    mutableRect.intersect(0.0f, 0.0f, IntSize.m6808getWidthimpl(mo5522getSizeYbymL2g()), IntSize.m6807getHeightimpl(mo5522getSizeYbymL2g()));
                }
                if (mutableRect.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(mutableRect, false);
        }
        float fM6766getXimpl = IntOffset.m6766getXimpl(mo5692getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() + fM6766getXimpl);
        mutableRect.setRight(mutableRect.getRight() + fM6766getXimpl);
        float fM6767getYimpl = IntOffset.m6767getYimpl(mo5692getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() + fM6767getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() + fM6767getYimpl);
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z2) {
        float fM6766getXimpl = IntOffset.m6766getXimpl(mo5692getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - fM6766getXimpl);
        mutableRect.setRight(mutableRect.getRight() - fM6766getXimpl);
        float fM6767getYimpl = IntOffset.m6767getYimpl(mo5692getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - fM6767getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - fM6767getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z2) {
                mutableRect.intersect(0.0f, 0.0f, IntSize.m6808getWidthimpl(mo5522getSizeYbymL2g()), IntSize.m6807getHeightimpl(mo5522getSizeYbymL2g()));
                mutableRect.isEmpty();
            }
        }
    }

    /* JADX INFO: renamed from: withinLayerBounds-k-4lQ0M */
    protected final boolean m5743withinLayerBoundsk4lQ0M(long j2) {
        if (!OffsetKt.m3954isFinitek4lQ0M(j2)) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo5797isInLayerk4lQ0M(j2);
    }

    /* JADX INFO: renamed from: isPointerInBounds-k-4lQ0M */
    protected final boolean m5737isPointerInBoundsk4lQ0M(long j2) {
        float fM3937getXimpl = Offset.m3937getXimpl(j2);
        float fM3938getYimpl = Offset.m3938getYimpl(j2);
        return fM3937getXimpl >= 0.0f && fM3938getYimpl >= 0.0f && fM3937getXimpl < ((float) getMeasuredWidth()) && fM3938getYimpl < ((float) getMeasuredHeight());
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final NodeCoordinator findCommonAncestor$ui_release(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = nodeCoordinator.getTail();
            Modifier.Node tail2 = getTail();
            int iM5749constructorimpl = NodeKind.m5749constructorimpl(2);
            if (!tail2.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node parent$ui_release = tail2.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                int kindSet$ui_release = parent$ui_release.getKindSet$ui_release();
                if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0 && parent$ui_release == tail) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (layoutNode.getDepth$ui_release() > layoutNode2.getDepth$ui_release()) {
            layoutNode = layoutNode.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth$ui_release() > layoutNode.getDepth$ui_release()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return layoutNode2 == getLayoutNode() ? this : layoutNode == nodeCoordinator.getLayoutNode() ? nodeCoordinator : layoutNode.getInnerCoordinator$ui_release();
    }

    /* JADX INFO: renamed from: offsetFromEdge-MK-Hz9U */
    private final long m5724offsetFromEdgeMKHz9U(long j2) {
        float fM3937getXimpl = Offset.m3937getXimpl(j2);
        float fMax = Math.max(0.0f, fM3937getXimpl < 0.0f ? -fM3937getXimpl : fM3937getXimpl - getMeasuredWidth());
        float fM3938getYimpl = Offset.m3938getYimpl(j2);
        return OffsetKt.Offset(fMax, Math.max(0.0f, fM3938getYimpl < 0.0f ? -fM3938getYimpl : fM3938getYimpl - getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: calculateMinimumTouchTargetPadding-E7KxVPU */
    protected final long m5730calculateMinimumTouchTargetPaddingE7KxVPU(long j2) {
        return SizeKt.Size(Math.max(0.0f, (Size.m4006getWidthimpl(j2) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m4003getHeightimpl(j2) - getMeasuredHeight()) / 2.0f));
    }

    /* JADX INFO: renamed from: distanceInMinimumTouchTarget-tz77jQw */
    protected final float m5731distanceInMinimumTouchTargettz77jQw(long j2, long j3) {
        if (getMeasuredWidth() >= Size.m4006getWidthimpl(j3) && getMeasuredHeight() >= Size.m4003getHeightimpl(j3)) {
            return Float.POSITIVE_INFINITY;
        }
        long jM5730calculateMinimumTouchTargetPaddingE7KxVPU = m5730calculateMinimumTouchTargetPaddingE7KxVPU(j3);
        float fM4006getWidthimpl = Size.m4006getWidthimpl(jM5730calculateMinimumTouchTargetPaddingE7KxVPU);
        float fM4003getHeightimpl = Size.m4003getHeightimpl(jM5730calculateMinimumTouchTargetPaddingE7KxVPU);
        long jM5724offsetFromEdgeMKHz9U = m5724offsetFromEdgeMKHz9U(j2);
        if ((fM4006getWidthimpl > 0.0f || fM4003getHeightimpl > 0.0f) && Offset.m3937getXimpl(jM5724offsetFromEdgeMKHz9U) <= fM4006getWidthimpl && Offset.m3938getYimpl(jM5724offsetFromEdgeMKHz9U) <= fM4003getHeightimpl) {
            return Offset.m3936getDistanceSquaredimpl(jM5724offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007lnA0ZeP\u008cZS@\u000fs{J$c$\u007fCCU }*\teNo˧vJp\u000bK\u000f\f\u0016~̔-_ǁ)]@\u000erGu?ݯQoK91\u0001D\u000682P:PڕSʀ.H\u0018͌KRY\u000f*0ntĐV\u0013UĨ2\u0014\fC.\u0007nkuUNH\u001baƠ3)\u000b݃ZP-g>\u0003\u001e\u0019T]?\r%ctѯ\u0013˝9\u0015-مS\u0013`eW\u0003m|\u0014ݞjҊ++Q֕(Nf\f,!;Q\u001d]!4l\u0007a`:6Y\\:֢Rˎ,w\u0003Ԉ]T\u0012\u001e\u001e3X0=\u001a\u0015\u0016\u001e5\u0005r\u0002O~\u000f5ې\u0002ѐe6\u001fӛP?9J3f\u007fs\u0012ύPѼ\u007f\u0005\u0015̔s\u0015|4sT<tkÔVʦPĸӾ?<˓R\fa={\u0019͒b\u000b2\u00076ϼ\u001c]z\u0019.\u001dDۄ_O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MH*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\u0013w_2V;\u001ab(zxa,{o+y\n8\u000b\u001e\u000b!$Fs\u00178\u0006%C", "", "\u001enX;g,K7\"\n\u000bm\u001a\u0007\u0019<c\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MH*\u0017\"$WaG\u0016Q6^\u0004%G\"", "5dc\u001db0Gb\u0019\f^g7\r\u0018\u001do\u00105y@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Y[*Az\u00152V?JuA\\wlp(\u0007q;<\u00017TJN\u0002", "!d\\.a;BQ'l\u0005n9z\t", "5dc X4:\\(\u0003xl\u001a\u0007\u0019<c\u007f", "#m\\2T:N`\u0019}Zk9\u0007\u0016", "5qP=[0<a\u007fz\u000f^9j\u00079p\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u000e.3j\u001d./P7v7\"\u0013vH5\u001bc9<t1RL$", "=m2<`4Bbt\u007f{^*\f\r8gf$\u0010@\u000e", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "", "=m2<`4Bbt\u007f{^*\f\r8gf$\u0010@\u000e\u0002\u0013Tk\u0016J", "Bl_\u0019T@>`\u0004\t\tb;\u0001\u00138a\u0007\u0013\tJ\f\u0017$Vs\u000eJ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b%BD\b.;|\u001a8V?BVA( hnH\u000bc:$", "Bl_\u001aT;KW,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", ")E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final void onMeasured() {
        Modifier.Node parent$ui_release;
        if (m5721hasNodeH91voCI(NodeKind.m5749constructorimpl(128))) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int iM5749constructorimpl = NodeKind.m5749constructorimpl(128);
                boolean zM5758getIncludeSelfInTraversalH91voCI = NodeKindKt.m5758getIncludeSelfInTraversalH91voCI(iM5749constructorimpl);
                if (zM5758getIncludeSelfInTraversalH91voCI) {
                    parent$ui_release = getTail();
                } else {
                    parent$ui_release = getTail().getParent$ui_release();
                    if (parent$ui_release != null) {
                    }
                    Unit unit = Unit.INSTANCE;
                }
                for (Modifier.Node nodeHeadNode = headNode(zM5758getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (-1) - (((-1) - nodeHeadNode.getAggregateChildKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
                    if ((nodeHeadNode.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                        MutableVector mutableVector = null;
                        Modifier.Node nodePop = nodeHeadNode;
                        while (nodePop != 0) {
                            if (nodePop instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) nodePop).mo700onRemeasuredozmzZPI(m5573getMeasuredSizeYbymL2g());
                            } else {
                                int kindSet$ui_release = nodePop.getKindSet$ui_release();
                                if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                                    int i2 = 0;
                                    nodePop = nodePop;
                                    while (delegate$ui_release != null) {
                                        int kindSet$ui_release2 = delegate$ui_release.getKindSet$ui_release();
                                        if ((kindSet$ui_release2 + iM5749constructorimpl) - (kindSet$ui_release2 | iM5749constructorimpl) != 0) {
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
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (nodeHeadNode == parent$ui_release) {
                        break;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            }
        }
    }

    public final void drawContainedDrawModifiers(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node nodeM5735headH91voCI = m5735headH91voCI(NodeKind.m5749constructorimpl(4));
        if (nodeM5735headH91voCI == null) {
            performDraw(canvas, graphicsLayer);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m5676draweZhPAX0$ui_release(canvas, IntSizeKt.m6820toSizeozmzZPI(mo5522getSizeYbymL2g()), this, nodeM5735headH91voCI, graphicsLayer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final void onPlaced() {
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(128);
        boolean zM5758getIncludeSelfInTraversalH91voCI = NodeKindKt.m5758getIncludeSelfInTraversalH91voCI(iM5749constructorimpl);
        Modifier.Node tail = getTail();
        if (zM5758getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(zM5758getIncludeSelfInTraversalH91voCI); nodeHeadNode != null; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
                int aggregateChildKindSet$ui_release = nodeHeadNode.getAggregateChildKindSet$ui_release();
                if ((aggregateChildKindSet$ui_release + iM5749constructorimpl) - (aggregateChildKindSet$ui_release | iM5749constructorimpl) != 0) {
                    if ((nodeHeadNode.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                        Modifier.Node nodePop = nodeHeadNode;
                        MutableVector mutableVector = null;
                        while (nodePop != 0) {
                            if (nodePop instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) nodePop).onPlaced(this);
                            } else {
                                int kindSet$ui_release = nodePop.getKindSet$ui_release();
                                if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
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
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (nodeHeadNode == tail) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m5758getIncludeSelfInTraversalH91voCI(NodeKind.m5749constructorimpl(16)));
        if (nodeHeadNode != null && nodeHeadNode.isAttached()) {
            Modifier.Node node = nodeHeadNode;
            int iM5749constructorimpl = NodeKind.m5749constructorimpl(16);
            if (!node.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Modifier.Node node2 = node.getNode();
            int aggregateChildKindSet$ui_release = node2.getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + iM5749constructorimpl) - (aggregateChildKindSet$ui_release | iM5749constructorimpl) != 0) {
                while (node2 != null) {
                    int kindSet$ui_release = node2.getKindSet$ui_release();
                    if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0) {
                        Modifier.Node nodePop = node2;
                        MutableVector mutableVector = null;
                        while (nodePop != 0) {
                            if (nodePop instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) nodePop).sharePointerInputWithSiblings()) {
                                    return true;
                                }
                            } else {
                                int kindSet$ui_release2 = nodePop.getKindSet$ui_release();
                                if ((kindSet$ui_release2 + iM5749constructorimpl) - (kindSet$ui_release2 | iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                                    int i2 = 0;
                                    nodePop = nodePop;
                                    while (delegate$ui_release != null) {
                                        if ((-1) - (((-1) - delegate$ui_release.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
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
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    node2 = node2.getChild$ui_release();
                }
            }
        }
        return false;
    }
}
