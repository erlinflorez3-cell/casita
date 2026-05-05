package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĻ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aw\rfr9>Pm߉6Ri*\u0017k\u00027,[2wK;[\u001a\u0006\"\u001fOVg}nRZ!C\u0017إ\u001ex\u0001,QU\u0007ز\u001aƁ:B\u0006?;ݹw=G\u0004|6\u001b :\">{\r\u00010*PƵ~zYK\u0014\u00126Ex:h\rUĨ\"\u0012\u001c>(\u00014\\oNLHt]P/+\u0003\u007fBV'e1\u0005M#F\\'\u001bvi\u001e1J?5#.[\u0003\rXc?\u0011]y=\u001bh/'1I{WLX\b\u0014\u001b1W\rsr.\\\u000b[fϯ=˃\u007fcyOF)Y]_MO\u0014\u0012\u0014'`.[\u001bv\f\u001c5\rr\u0002Cг\u0006^P\u0004C\u0005D@=\u007faUi6t|yR)PG{3:.%\u0011nO\nd\u0010p\u0015I\u0004&}śU@Cx\u0017)gn\u0006\u0004\u001f\u00122.\u0012b_\u007f]+A:\u001d'E\u000fQ)1m\u0012Hr\u001d%9'èY2`Vv:nD8Z\r\u001a\u0012\\d3y\u0017T!2\u001f\u00064T53N\u0013hh\u0006u9%>\u0004\u007flw%e]83wlE\u0015\u0007k<\r\u007f^{9_ (a\u0001,\\OJ \u001dZ|A\u0002\"\u000b`6YJH\u0019\u001e>{\rc\u001aQJ? Qd6?Dt\u001bX\u0005.Bo27\u0014!ӓ\u0016GXAc\u001biR*Q\u000f^\u001d\to\u0016.y0\u000b\":-o\u0014{\u0019nu0,L|Q</w\u000e\f\u007fLuZ\u001d\u001a\u0004\u001b\u0014 D(iW5=!U\u0017)`\u0010sE\u0015xs\u0019e\u0012U0C\u000eWAvv\u007f\b\u0019&rt3P]\u001e/\"%\u001497P\u0013\u000eDyL\u000bIsT9(l\u0015#\tg\nf:\u0013\u0004M4U\u0010}p\u0015@=E7\u001dD-Bcֵe]o?tyˏ\u0013&\u00036LRqg\bb\u007fxbAF\u0017q\u0001T!R\u00033QV9\u0010\u0013R\u000bD\ra}o\u0019ވZ8SZɣ\u0002f\u0015~U\u0007d/R\u0013\u001e3d2m~\fC,\u0015\u000fG3feS\u0016\u007f4K%;Xb\"\u000b*f\u001f\u0016*\u00128V\u0006c96\u0014A08W:\u0011\u001bl\u00182\u0003DG\u0018\rST\u0018;>/ķJ_\u0015fxBǠ?V\u001c+A\td\u001c\u001dfUb1*/K=~N~C~\u001do\\S]yb\u0010ak!&zQ\u000ffS`r\tۆ\u001f(^PխI]Q\u001aJv\u0012\u001fAm\u001aH<>&V5D.\u001ag*Ac\u0005\u000bv\u000b\u0004e~h\u0005m~R|dY\u0003\tY&<8\u0017;(]P\bm=N^wexH5ӢH)\r[Cc̍\u001f-\u0014\u0014uOWJ,)\u0012V\u0002<.\u000e.m?\u0006\u000b \u000bmTfRg)\u001b.qD\u0018*\tAQf\u0004~V\u0003w\".6<&בuě\u0017^aŕH;N.Cn\u001cAypOƄoؼgz]̃\u001bh7_\bxMR#\u00145Y~\u001ffgR\u0011\u0002./Ҽ\fȗ\u0019&'ߎXn7\u001fgc\u0017~Bϊgá//sˋ2Y>b6\u001a/{\u0006\u0004XU8\u0017KV{P\u0013\u001aExRY\u001e^\u0019)tv\u001c)B\u000f][5ƺ\u0015̭Jr&ҋ\u007fK'3s\u0015Wd\u0017\u0006[HT7_g\u0016א9כ\u000fo0ϓa\u0013Hy\r\u0004XZYr.ל\u0003ߣHÊA\u001a/ڒt\br\u001c>YU<R\nB\u0010<'?\\H lwH6\u0012Ǟ5¡\u001d\u0011\t́\t2}#1UzUc'@\u007f+\u0017\u001dA\n1\u001a;\"H[1?\u0013\u007f\u001dmei;Eg\\':\u0003D]U\u07baeȡ\u0013a4ݹ\u0006Q,\u0017m@.\u0018u߾0Թy#\bӚ\u0002T8}t@\u0005\u0002.ƫ2ń:nLì\u0018x\u0007\u0013\",\u00188J߭]Ɉ8A\u0003߭iPL*El5F$ˋ{߃H\rMũ\b\u001f\u0014JK\u001b+2 qnԴ ןOҰ`]DͨD0HUyV\nKP[@\u0005[(dezj\u001cR\u000e!! \u001d\u0011\u0014yGQ\u000f\u0016p\u001f('yw%I3ܑOیf\u000bHǃt\u0001<D$\u000b4\u0019^L%&\u0016J\u000f\u0018Qw\u001eؚMۊ\u0016b\u0004״5\u0013aJ\u0014K\blMfc\u001aْA\u001e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/ w\u0015.;S8i>& ro=\u0016g6W\u0005\u0015VH],2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}\tAl\u0016\u0015QD;iH\u001c\u001ch?5\u000ej)Jt-\u001d", "@n^A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "Ak^AE,Na\u0019i\u0005e0z\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.;JEz!\u001e%va$\u0011j0L\u000b|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u00044?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&YnQ\u001e\"iW<;\n\u0003cI/xR7\r\u000f6Xn;x\u000f\f\u0001\u0018<nnV,S8", "\u001cn8;g9B\\'\u0003xl\u0014|\u0017=a\u0002(", "", "1n\\=b:Bb\u001d\t\u0004<6\u0006\u0018/x\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "5dc\u0010b4I]'\u0003\nb6\u0006f9n\u000f(\u000fO", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.;|\u001a8V!EtC\u001e(w7", "Adc\u0010b4I]'\u0003\nb6\u0006f9n\u000f(\u000fO", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 7+MDz41$>%*", "1ta?X5M7\"}zq", "", "1ta?X5M>#\r\nE6\u0007\u000f+h\u007f$z$\n\u0016\u0017Z", "<nS2G6']\u0018~hm(\f\t", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/ w\u0015.;S8i>& ro=\u0016g6W\u0005\u0015VH],\u001b;|<\u0014\u007fi\n]+b", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", ">nbA?6HY\u0015\u0002zZ+Z\u00137p\n6{?n\u001e!VS\rJ", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "", ">nbA?6HY\u0015\u0002zZ+d\t+s\u00105{.~!\"G", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/ w\u0015.;S8i>& ro=\u0016g6W\u0005\u0015VH],\u001b=|K#xd\u0018T'\u0010\u0005U@\fn@E/\u0015,7\u007fEs\u0001o\u001e\u0019<@", ">nbA?6HY\u0015\u0002zZ+g\u0016/c\n0\u0007J\u000f\u0017\u0005Ny\u001d\u001fr.4`}\b3x", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.4?OuD-\u0003w]H\u0007\"\u0017[v%QTY6jRq+\u001b\u001cipJ4\f\fY\u0017", ">qT0b4I]'~bZ7", ">qT0b4I]'~y<6\r\u0012>", "@dd@T)ESv\t\u000bg;", "@dd@T)ES\u0007\u0006\u0005m\u0010{\u0017\u001de\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.;JEz!\u001e%va$\u0011j0L\u000be5SX;@Q\u0001+\u0014!0", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/ w\u0015.;S8i>& ro=\u0016g6W\u0005\u0015VH],\u001b@pG\u001f\u00120", "Ak^A<+-]\u0002\ty^", "D`[BX", "5dc _6M@\u0019\u000f\t^\u0017\u0007\u00103c\u0014", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n#iz\u001eAu!8[C)r>-\u0002hqG\u0007N6Uz%[\"", "Adc _6M@\u0019\u000f\t^\u0017\u0007\u00103c\u0014", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0013EV{*?x <M1BuC\u000b\u0015xo9qm3Rt;\u001d\u0010?", "1qT.g,&S\u0015\r\u000bk,g\u00136i}<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.5C7yD+\u0015V_C\u0012c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1qT.g,&S\u0015\r\u000bk,i\t=u\u00077", "@dbB_;", ">kP0X\nAW }\b^5Y\u00109c\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "1qT.g,']\u0018~Vm", "7mS2k", "2hb=b:>1)\f\b^5\fq9d\u007f6", "2hb=b:>=&kzn:|v>a\r7\u007fI\u0003w$QwqEu%H", "AsP?g\u0010GR\u0019\u0012", "2hb=b:>C\"\u000f\t^+j\u00109t\u000e\f\u0005+\u000b%&.y\u0018Br(5U|", "4na0X\u0019>Q#\u0007\u0006h:|f2i\u0007'\t@\n", "5dc _6M7\u0018Z\nB5{\tB", "7f]<e,+S!~vl<\n\t\u001ce\f8{N\u0010%", ";`Z2F<KS\u0007\u000evm,`\u0017\ro\t6\u007fN\u0010\u0017 V", ";`a84*MW*~ch+|\u0017\u000bsl(\fN\u0001\u0016", "2dP0g0OO(~", "", ";ne2", "4q^:", "Bn", "1nd;g", "=m32T*MW*z\n^", "=mA2_,:a\u0019", "=mA2h:>", ">nbA?6HY\u0015\u0002zZ+j\u0019,c\n0\u0007J\u000f\u0017", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "Ak^A<+", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012],C]JulavD]x^\u001c]\u0001", ">qT0b4I]'~", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNiEmu@K)\u0018;\u0013oKe~\u0016\u001e\u0019?xp)R$Q\n$cP%wF\u0018J\u0007G?Oj5n\u001a_\u001cJAD3vm\"\u001aoP\u0004", "AtQ0b4I]'~", "<nS2", "<nS2F;:b\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u00044H7|0g\u001cdj;PM)Sv%V\"52fayA\u001d[_\u001fVt\u000e\u0015b?3rN@-Q\rY\u000b9w\u0005\u0016\u001fZ\u000b.a", "AtQ0b4I]'~^g;\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<\u000731V\u0005 \u0015w\u001e9WQ?z8(\u001e>", "3wX@g0GU", "1n]AT0GS&", "@dd@X\nH\\(~\u0004m", ">`a2a;", "1n\\=b::P ~", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW)v5CUz'7K 6XMIoC\"\u001fq7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRt\u0016\u000fXAmU@K)\u0018;2\f:hV\u0001|\n>i}LZ\u000fZC\u0013\u007fI4rTY)\u0007WJTf2dU='dED2\u0018\u0001\u001d%q.8\u0013\u000bS$\u0002(`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r\u0001\u007fyK\u0001Tf%Hbw(uZK/1@J\u0013\tXs~{B\u0016hhN\b\u001ep1. eCmP\u001a\u0011k\u001bj9khV", "B`Z2A6=Sy\f\u0005f\u0019|\u0019=a|/{N", "@db2g\u0013:g#\u000f\nL;x\u0018/", "\u001cnS2F;:b\u0019", "\u001enbA?6HY\u0015\u0002zZ+d\t+s\u00105{.~!\"GS\u0016G}", "!b^=X", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    public static final int $stable = 8;
    private CompositionContext compositionContext;
    private int currentIndex;
    private int currentPostLookaheadIndex;
    private int precomposedCount;
    private int reusableCount;
    private final LayoutNode root;
    private SubcomposeSlotReusePolicy slotReusePolicy;
    private final HashMap<LayoutNode, NodeState> nodeToNodeState = new HashMap<>();
    private final HashMap<Object, LayoutNode> slotIdToNode = new HashMap<>();
    private final Scope scope = new Scope();
    private final PostLookaheadMeasureScopeImpl postLookaheadMeasureScope = new PostLookaheadMeasureScopeImpl();
    private final HashMap<Object, LayoutNode> precomposeMap = new HashMap<>();
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);
    private final Map<Object, SubcomposeLayoutState.PrecomposedSlotHandle> postLookaheadPrecomposeSlotHandleMap = new LinkedHashMap();
    private final MutableVector<Object> postLookaheadComposedSlotIds = new MutableVector<>(new Object[16], 0);
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
    }

    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    public final void setCompositionContext(CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void setSlotReusePolicy(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            markActiveNodesAsReused(false);
            LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, false, 7, null);
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        markActiveNodesAsReused(false);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        disposeCurrentNodes();
    }

    public final List<Measurable> subcompose(Object obj, Function2<? super Composer, ? super Integer, Unit> function2) {
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState$ui_release = this.root.getLayoutState$ui_release();
        if (!(layoutState$ui_release == LayoutNode.LayoutState.Measuring || layoutState$ui_release == LayoutNode.LayoutState.LayingOut || layoutState$ui_release == LayoutNode.LayoutState.LookaheadMeasuring || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut)) {
            InlineClassHelperKt.throwIllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        HashMap<Object, LayoutNode> map = this.slotIdToNode;
        LayoutNode layoutNodeRemove = map.get(obj);
        if (layoutNodeRemove == null) {
            layoutNodeRemove = this.precomposeMap.remove(obj);
            if (layoutNodeRemove != null) {
                if (!(this.precomposedCount > 0)) {
                    InlineClassHelperKt.throwIllegalStateException("Check failed.");
                }
                this.precomposedCount--;
            } else {
                layoutNodeRemove = takeNodeFromReusables(obj);
                if (layoutNodeRemove == null) {
                    layoutNodeRemove = createNodeAt(this.currentIndex);
                }
            }
            map.put(obj, layoutNodeRemove);
        }
        LayoutNode layoutNode = layoutNodeRemove;
        if (CollectionsKt.getOrNull(this.root.getFoldedChildren$ui_release(), this.currentIndex) != layoutNode) {
            int iIndexOf = this.root.getFoldedChildren$ui_release().indexOf(layoutNode);
            int i2 = this.currentIndex;
            if (iIndexOf < i2) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i2 != iIndexOf) {
                move$default(this, iIndexOf, i2, 0, 4, null);
            }
        }
        this.currentIndex++;
        subcompose(layoutNode, obj, function2);
        if (layoutState$ui_release == LayoutNode.LayoutState.Measuring || layoutState$ui_release == LayoutNode.LayoutState.LayingOut) {
            return layoutNode.getChildMeasurables$ui_release();
        }
        return layoutNode.getChildLookaheadMeasurables$ui_release();
    }

    private final void subcompose(LayoutNode layoutNode, Object obj, Function2<? super Composer, ? super Integer, Unit> function2) {
        HashMap<LayoutNode, NodeState> map = this.nodeToNodeState;
        NodeState nodeState = map.get(layoutNode);
        if (nodeState == null) {
            nodeState = new NodeState(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m5504getLambda1$ui_release(), null, 4, null);
            map.put(layoutNode, nodeState);
        }
        NodeState nodeState2 = nodeState;
        ReusableComposition composition = nodeState2.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (nodeState2.getContent() != function2 || hasInvalidations || nodeState2.getForceRecompose()) {
            nodeState2.setContent(function2);
            subcompose(layoutNode, nodeState2);
            nodeState2.setForceRecompose(false);
        }
    }

    private final void subcompose(LayoutNode layoutNode, final NodeState nodeState) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            LayoutNode layoutNode2 = this.root;
            layoutNode2.ignoreRemeasureRequests = true;
            final Function2<Composer, Integer, Unit> content = nodeState.getContent();
            ReusableComposition composition = nodeState.getComposition();
            CompositionContext compositionContext = this.compositionContext;
            if (compositionContext != null) {
                nodeState.setComposition(subcomposeInto(composition, layoutNode, nodeState.getForceReuse(), compositionContext, ComposableLambdaKt.composableLambdaInstance(-1750409193, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i2) {
                        ComposerKt.sourceInformation(composer, "C493@21310L46:SubcomposeLayout.kt#80mrfh");
                        if ((i2 + 3) - (3 | i2) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1750409193, i2, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:493)");
                        }
                        boolean active = nodeState.getActive();
                        Function2<Composer, Integer, Unit> function2 = content;
                        composer.startReusableGroup(207, Boolean.valueOf(active));
                        boolean zChanged = composer.changed(active);
                        composer.startReplaceGroup(-869707859);
                        ComposerKt.sourceInformation(composer, "175@6712L9");
                        if (active) {
                            function2.invoke(composer, 0);
                        } else {
                            composer.deactivateToEndGroup(zChanged);
                        }
                        composer.endReplaceGroup();
                        composer.endReusableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                })));
                nodeState.setForceReuse(false);
                layoutNode2.ignoreRemeasureRequests = false;
                Unit unit = Unit.INSTANCE;
                return;
            }
            throw new IllegalStateException("parent composition reference not set".toString());
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    private final ReusableComposition subcomposeInto(ReusableComposition reusableComposition, LayoutNode layoutNode, boolean z2, CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> function2) {
        if (reusableComposition == null || reusableComposition.isDisposed()) {
            reusableComposition = Wrapper_androidKt.createSubcomposition(layoutNode, compositionContext);
        }
        if (z2) {
            reusableComposition.setContentWithReuse(function2);
        } else {
            reusableComposition.setContent(function2);
        }
        return reusableComposition;
    }

    private final Object getSlotIdAtIndex(int i2) {
        NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(i2));
        Intrinsics.checkNotNull(nodeState);
        return nodeState.getSlotId();
    }

    public final void disposeOrReuseStartingFromIndex(int i2) {
        boolean z2 = false;
        this.reusableCount = 0;
        int size = (this.root.getFoldedChildren$ui_release().size() - this.precomposedCount) - 1;
        if (i2 <= size) {
            this.reusableSlotIdsSet.clear();
            if (i2 <= size) {
                int i3 = i2;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(i3));
                    if (i3 == size) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            boolean z3 = false;
            while (size >= i2) {
                try {
                    LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(size);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    Intrinsics.checkNotNull(nodeState);
                    NodeState nodeState2 = nodeState;
                    Object slotId = nodeState2.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        this.reusableCount++;
                        if (nodeState2.getActive()) {
                            resetLayoutState(layoutNode);
                            nodeState2.setActive(false);
                            z3 = true;
                        }
                    } else {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.remove(layoutNode);
                        ReusableComposition composition = nodeState2.getComposition();
                        if (composition != null) {
                            composition.dispose();
                        }
                        this.root.removeAt$ui_release(size, 1);
                        layoutNode2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.remove(slotId);
                    size--;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            z2 = z3;
        }
        if (z2) {
            Snapshot.Companion.sendApplyNotifications();
        }
        makeSureStateIsConsistent();
    }

    private final void markActiveNodesAsReused(boolean z2) {
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        int size = this.root.getFoldedChildren$ui_release().size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(i2);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    if (nodeState != null && nodeState.getActive()) {
                        resetLayoutState(layoutNode);
                        if (z2) {
                            ReusableComposition composition = nodeState.getComposition();
                            if (composition != null) {
                                composition.deactivate();
                            }
                            nodeState.setActiveState(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null));
                        } else {
                            nodeState.setActive(false);
                        }
                        nodeState.setSlotId(SubcomposeLayoutKt.ReusedSlotId);
                    }
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            this.slotIdToNode.clear();
        }
        makeSureStateIsConsistent();
    }

    private final void disposeCurrentNodes() {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        Iterator<T> it = this.nodeToNodeState.values().iterator();
        while (it.hasNext()) {
            ReusableComposition composition = ((NodeState) it.next()).getComposition();
            if (composition != null) {
                composition.dispose();
            }
        }
        this.root.removeAll$ui_release();
        layoutNode.ignoreRemeasureRequests = false;
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        makeSureStateIsConsistent();
    }

    public final void makeSureStateIsConsistent() {
        int size = this.root.getFoldedChildren$ui_release().size();
        if (this.nodeToNodeState.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.reusableCount) - this.precomposedCount < 0) {
            throw new IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount).toString());
        }
        if (this.precomposeMap.size() != this.precomposedCount) {
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.size()).toString());
        }
    }

    private final void resetLayoutState(LayoutNode layoutNode) {
        layoutNode.getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        }
    }

    private final LayoutNode takeNodeFromReusables(Object obj) {
        int i2;
        if (this.reusableCount == 0) {
            return null;
        }
        int size = this.root.getFoldedChildren$ui_release().size() - this.precomposedCount;
        int i3 = size - this.reusableCount;
        int i4 = size - 1;
        int i5 = i4;
        while (true) {
            if (i5 < i3) {
                i2 = -1;
                break;
            }
            if (Intrinsics.areEqual(getSlotIdAtIndex(i5), obj)) {
                i2 = i5;
                break;
            }
            i5--;
        }
        if (i2 == -1) {
            while (i4 >= i3) {
                NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(i4));
                Intrinsics.checkNotNull(nodeState);
                NodeState nodeState2 = nodeState;
                if (nodeState2.getSlotId() != SubcomposeLayoutKt.ReusedSlotId && !this.slotReusePolicy.areCompatible(obj, nodeState2.getSlotId())) {
                    i4--;
                } else {
                    nodeState2.setSlotId(obj);
                    i5 = i4;
                    i2 = i5;
                    break;
                }
            }
            i5 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        if (i5 != i3) {
            move(i5, i3, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(i3);
        NodeState nodeState3 = this.nodeToNodeState.get(layoutNode);
        Intrinsics.checkNotNull(nodeState3);
        NodeState nodeState4 = nodeState3;
        nodeState4.setActiveState(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null));
        nodeState4.setForceReuse(true);
        nodeState4.setForceRecompose(true);
        return layoutNode;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1 */
    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я)\u001d̉=!4i\bӵLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\":0\u007f\u0007|jAӄLe^.ZS0\u0010\u0014zé*c:ڎs;\u0004\u0019FL\u0017Ofg\u0016orZ9E?\u0010${\u00032YW\t]@\u0014`F CAS\b=gg;JՅ\u001f݅ŕ<{\u000b\t(3Ͻ\u0010{\u0003FQê.^?ª>\\"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EG|+!W~W#r9?i\r\tAl\u0016\u001c]@9u<)\u001fveH\u000bm5\\d6C[NjZ_r9#\u0012B\u000eJ9\u001d\u0012Y,.uH53Fw", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mT\u0017W'DzA\"\u001eve7\u0015K,J\u00057TL96cVpQi", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002A\u0016Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKBd\u0015\u0016&\u001d~Rp>d Ty\u0002uO9oU/", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends LayoutNode.NoIntrinsicsMeasurePolicy {
        final /* synthetic */ Function2<SubcomposeMeasureScope, Constraints, MeasureResult> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2, String str) {
            super(str);
            function2 = function2;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
            LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
            LayoutNodeSubcompositionsState.this.scope.setDensity(measureScope.getDensity());
            LayoutNodeSubcompositionsState.this.scope.setFontScale(measureScope.getFontScale());
            if (measureScope.isLookingAhead() || LayoutNodeSubcompositionsState.this.root.getLookaheadRoot$ui_release() == null) {
                LayoutNodeSubcompositionsState.this.currentIndex = 0;
                final MeasureResult measureResultInvoke = function2.invoke(LayoutNodeSubcompositionsState.this.scope, Constraints.m6579boximpl(j2));
                final int i2 = LayoutNodeSubcompositionsState.this.currentIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return measureResultInvoke.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return measureResultInvoke.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Function1<RulerScope, Unit> getRulers() {
                        return measureResultInvoke.getRulers();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return measureResultInvoke.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState.currentIndex = i2;
                        measureResultInvoke.placeChildren();
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                        layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState2.currentIndex);
                    }
                };
            }
            LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex = 0;
            final MeasureResult measureResultInvoke2 = function2.invoke(LayoutNodeSubcompositionsState.this.postLookaheadMeasureScope, Constraints.m6579boximpl(j2));
            final int i3 = LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex;
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
            return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return measureResultInvoke2.getAlignmentLines();
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return measureResultInvoke2.getHeight();
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public Function1<RulerScope, Unit> getRulers() {
                    return measureResultInvoke2.getRulers();
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return measureResultInvoke2.getWidth();
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    layoutNodeSubcompositionsState2.currentPostLookaheadIndex = i3;
                    measureResultInvoke2.placeChildren();
                    layoutNodeSubcompositionsState2.disposeUnusedSlotsInPostLookahead();
                }
            };
        }
    }

    public final MeasurePolicy createMeasurePolicy(Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2) {
        return new LayoutNode.NoIntrinsicsMeasurePolicy(this.NoIntrinsicsMessage) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createMeasurePolicy.1
            final /* synthetic */ Function2<SubcomposeMeasureScope, Constraints, MeasureResult> $block;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function22, String str) {
                super(str);
                function2 = function22;
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
                LayoutNodeSubcompositionsState.this.scope.setDensity(measureScope.getDensity());
                LayoutNodeSubcompositionsState.this.scope.setFontScale(measureScope.getFontScale());
                if (measureScope.isLookingAhead() || LayoutNodeSubcompositionsState.this.root.getLookaheadRoot$ui_release() == null) {
                    LayoutNodeSubcompositionsState.this.currentIndex = 0;
                    final MeasureResult measureResultInvoke = function2.invoke(LayoutNodeSubcompositionsState.this.scope, Constraints.m6579boximpl(j2));
                    final int i2 = LayoutNodeSubcompositionsState.this.currentIndex;
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                        @Override // androidx.compose.ui.layout.MeasureResult
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return measureResultInvoke.getAlignmentLines();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getHeight() {
                            return measureResultInvoke.getHeight();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public Function1<RulerScope, Unit> getRulers() {
                            return measureResultInvoke.getRulers();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getWidth() {
                            return measureResultInvoke.getWidth();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            layoutNodeSubcompositionsState.currentIndex = i2;
                            measureResultInvoke.placeChildren();
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                            layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState2.currentIndex);
                        }
                    };
                }
                LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex = 0;
                final MeasureResult measureResultInvoke2 = function2.invoke(LayoutNodeSubcompositionsState.this.postLookaheadMeasureScope, Constraints.m6579boximpl(j2));
                final int i3 = LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return measureResultInvoke2.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return measureResultInvoke2.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Function1<RulerScope, Unit> getRulers() {
                        return measureResultInvoke2.getRulers();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return measureResultInvoke2.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState2.currentPostLookaheadIndex = i3;
                        measureResultInvoke2.placeChildren();
                        layoutNodeSubcompositionsState2.disposeUnusedSlotsInPostLookahead();
                    }
                };
            }
        };
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1 */
    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d̉=!,r\bӵLc\u0003)I\u0006>é6B\u0015\"4\u0012}\u0007tʑQ0rdx@`SB\u001d{\u007fD&q# EKW*}P\f}O.oĔN\\\u0011G\u001d\u000b"}, d2 = {"\n`]<a@F])\rS", "", "\nmP:Xf?]&9y^:\f\u0016?c\u000f8\tD\n\u0019QRk\u001b8~%DY\u000bZ\u0002F", "", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.4?OuD-\u0003w]H\u0007\"\u0017[v%QTY6jRq+\u001b\u001cipJ4\f\fY\u0017", "7me<^,", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014mE\t7\tTVZ}Lk\u001f8@,1b\u007fi\u0014w 5M?DA"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07621 extends Lambda implements Function1<Map.Entry<Object, SubcomposeLayoutState.PrecomposedSlotHandle>, Boolean> {
        C07621() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Map.Entry<Object, SubcomposeLayoutState.PrecomposedSlotHandle> entry) {
            boolean z2;
            Object key = entry.getKey();
            SubcomposeLayoutState.PrecomposedSlotHandle value = entry.getValue();
            int iIndexOf = LayoutNodeSubcompositionsState.this.postLookaheadComposedSlotIds.indexOf(key);
            if (iIndexOf >= 0 && iIndexOf < LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex) {
                z2 = false;
            } else {
                value.dispose();
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
    }

    public final void disposeUnusedSlotsInPostLookahead() {
        CollectionsKt.removeAll(this.postLookaheadPrecomposeSlotHandleMap.entrySet(), new Function1<Map.Entry<Object, SubcomposeLayoutState.PrecomposedSlotHandle>, Boolean>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.disposeUnusedSlotsInPostLookahead.1
            C07621() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Map.Entry<Object, SubcomposeLayoutState.PrecomposedSlotHandle> entry) {
                boolean z2;
                Object key = entry.getKey();
                SubcomposeLayoutState.PrecomposedSlotHandle value = entry.getValue();
                int iIndexOf = LayoutNodeSubcompositionsState.this.postLookaheadComposedSlotIds.indexOf(key);
                if (iIndexOf >= 0 && iIndexOf < LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex) {
                    z2 = false;
                } else {
                    value.dispose();
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasureResult$1 */
    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я1\u001d̉=!4i\bӵLc\u0003&I\u0006F\u000b6B\r(4\u0012}\u000bnjO0Le^.ZS8\u000fs{J$c$wGcTڼ\u0004*\u001fѧ~g\u0016m\u0013`\u0019U'\u0006D\u00051@\u001aq\u0007]*\u001bBD\u007f?aO\u007f?I`#93!\tŉ;ѩ\t\u00052,N\u0014\u0005\u007f\u0014[\u001a\u0018H@\u001f=)ҟPŋ\u001e\u0016\u001e@&\b,d8sDQ\u0005pJ13\u0003\u0018M^)o0+Y#E\u00031˼za$8v\f\fխ(٨\u0007\u000bj]E\u0011M\u0001\u000e\u0015v7?+wv.̓[ÿ\u0018\u0019CQ\u0013n\u0001.ف\td"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EG|+!W~W#r9?i\r\tAl\u0016\u001c]@9u<)\u001fveH\u000bm5\\d6C[NjZ_r9#\u0012B\u000eJ9\u001d\u0012Y.$|T>.Fw", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", "u(;7T=:\u001d)\u000e~eud\u0005:;", "6dX4[;", "5dc\u0015X0@V(", "u(8", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001fh3>`'", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "EhSA[", "5dc$\\+MV", ">kP0X\nAW }\b^5", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C07611 implements MeasureResult {
        private final /* synthetic */ MeasureResult $$delegate_0;
        final /* synthetic */ Function0<Unit> $placeChildrenBlock;

        @Override // androidx.compose.ui.layout.MeasureResult
        public Map<AlignmentLine, Integer> getAlignmentLines() {
            return measureResult.getAlignmentLines();
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getHeight() {
            return measureResult.getHeight();
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public Function1<RulerScope, Unit> getRulers() {
            return measureResult.getRulers();
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getWidth() {
            return measureResult.getWidth();
        }

        public C07611(MeasureResult measureResult, Function0<Unit> function0) {
            function0 = function0;
            measureResult = measureResult;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public void placeChildren() {
            function0.invoke();
        }
    }

    private final MeasureResult createMeasureResult(MeasureResult measureResult, Function0<Unit> function0) {
        return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createMeasureResult.1
            private final /* synthetic */ MeasureResult $$delegate_0;
            final /* synthetic */ Function0<Unit> $placeChildrenBlock;

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return measureResult.getAlignmentLines();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return measureResult.getHeight();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Function1<RulerScope, Unit> getRulers() {
                return measureResult.getRulers();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return measureResult.getWidth();
            }

            public C07611(MeasureResult measureResult2, Function0<Unit> function02) {
                function0 = function02;
                measureResult = measureResult2;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                function0.invoke();
            }
        };
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$1 */
    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u0004IيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EG|+!W~W#r9?i\r\tAl\u0016\u001c]@9u<)\u001fveH\u000bm5\\d6C[Njg_r;\u001e\u001ae\u0018\\+KP", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.4?OuD-\u0003w]H\u0007\"\u0017[v%QTY6jRq+\u001b\u001cipJ4\f\fY\u0017", "2hb=b:>", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C07631 implements SubcomposeLayoutState.PrecomposedSlotHandle {
        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
        public void dispose() {
        }

        C07631() {
        }
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(Object obj, Function2<? super Composer, ? super Integer, Unit> function2) {
        if (!this.root.isAttached()) {
            return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precompose.1
                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                public void dispose() {
                }

                C07631() {
                }
            };
        }
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(obj)) {
            this.postLookaheadPrecomposeSlotHandleMap.remove(obj);
            HashMap<Object, LayoutNode> map = this.precomposeMap;
            LayoutNode layoutNodeTakeNodeFromReusables = map.get(obj);
            if (layoutNodeTakeNodeFromReusables == null) {
                layoutNodeTakeNodeFromReusables = takeNodeFromReusables(obj);
                if (layoutNodeTakeNodeFromReusables != null) {
                    move(this.root.getFoldedChildren$ui_release().indexOf(layoutNodeTakeNodeFromReusables), this.root.getFoldedChildren$ui_release().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNodeTakeNodeFromReusables = createNodeAt(this.root.getFoldedChildren$ui_release().size());
                    this.precomposedCount++;
                }
                map.put(obj, layoutNodeTakeNodeFromReusables);
            }
            subcompose(layoutNodeTakeNodeFromReusables, obj, function2);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precompose.2
            final /* synthetic */ Object $slotId;

            AnonymousClass2(Object obj2) {
                obj = obj2;
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                LayoutNodeSubcompositionsState.this.makeSureStateIsConsistent();
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.remove(obj);
                if (layoutNode != null) {
                    if (LayoutNodeSubcompositionsState.this.precomposedCount > 0) {
                        int iIndexOf = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode);
                        if (iIndexOf < LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size() - LayoutNodeSubcompositionsState.this.precomposedCount) {
                            throw new IllegalStateException("Item is not in pre-composed item range".toString());
                        }
                        LayoutNodeSubcompositionsState.this.reusableCount++;
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                        layoutNodeSubcompositionsState.precomposedCount--;
                        int size = (LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size() - LayoutNodeSubcompositionsState.this.precomposedCount) - LayoutNodeSubcompositionsState.this.reusableCount;
                        LayoutNodeSubcompositionsState.this.move(iIndexOf, size, 1);
                        LayoutNodeSubcompositionsState.this.disposeOrReuseStartingFromIndex(size);
                        return;
                    }
                    throw new IllegalStateException("No pre-composed items to dispose".toString());
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                List<LayoutNode> children$ui_release;
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                if (layoutNode == null || (children$ui_release = layoutNode.getChildren$ui_release()) == null) {
                    return 0;
                }
                return children$ui_release.size();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* JADX INFO: renamed from: premeasure-0kLqBqw */
            public void mo5540premeasure0kLqBqw(int i2, long j2) {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                if (layoutNode != null && layoutNode.isAttached()) {
                    int size = layoutNode.getChildren$ui_release().size();
                    if (i2 < 0 || i2 >= size) {
                        throw new IndexOutOfBoundsException("Index (" + i2 + ") is out of bound of [0, " + size + ')');
                    }
                    if (!layoutNode.isPlaced()) {
                        LayoutNode layoutNode2 = LayoutNodeSubcompositionsState.this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        LayoutNodeKt.requireOwner(layoutNode).mo5805measureAndLayout0kLqBqw(layoutNode.getChildren$ui_release().get(i2), j2);
                        layoutNode2.ignoreRemeasureRequests = false;
                        return;
                    }
                    throw new IllegalArgumentException("Pre-measure called on node that is not placed".toString());
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void traverseDescendants(Object obj2, Function1<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> function1) {
                NodeChain nodes$ui_release;
                Modifier.Node head$ui_release;
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                if (layoutNode == null || (nodes$ui_release = layoutNode.getNodes$ui_release()) == null || (head$ui_release = nodes$ui_release.getHead$ui_release()) == null) {
                    return;
                }
                TraversableNodeKt.traverseDescendants(head$ui_release, obj2, function1);
            }
        };
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$2 */
    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я9\u001d̉=!4i\bӵLc\u0003\nI\u00066\f6B\r\"4\u0012}\bnjO0LeN0ZS8şsڔ<$q$yCQU\"}8\tWȞ\u0010fñPb!¼?\u0006Dw32WY\u0011]@\u0014xV8_AS\b=ge%:\u0013'J\"fz5\u0005(2`\u0010%\u0004\n_Ł\u0011ؓϮt<X\u0017[\u0010b6\u0014J8\u0001La\u0018TDU\u0005_P.Q\u0011\u001aR\\6w<\rO\u001dF\u00038\u001dxq\u001eYReE[9$\u0015\u0015Rs?1@(\u0012[ة)ݳ/M\fY<Z\u000e\u0017Ɔ+T\u0015`x͈x3Pԉ\u0010:"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EG|+!W~W#r9?i\r\tAl\u0016\u001c]@9u<)\u001fveH\u000bm5\\d6C[Njg_r;\u001e\u001ae\u0018\\+KQ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.4?OuD-\u0003w]H\u0007\"\u0017[v%QTY6jRq+\u001b\u001cipJ4\f\fY\u0017", ">kP0X(;Z\u0019\rXh<\u0006\u0018", "", "5dc\u001d_(<S\u0015{\u0002^:Z\u0013?n\u000f", "u(8", "2hb=b:>", "", ">qT:X(Lc&~", "7mS2k", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ">qT:X(Lc&~B)2c\u0015\fq\u0012", "uH9uI", "BqPCX9LSw~\t\\,\u0006\b+n\u000f6", "9dh", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;*\u0012(\u001ds]B\u000bm5\re4C]N9jRQ=\"\u0010Z\u0017M'\u0016\u0014g\u001d\"}HA(]", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass2 implements SubcomposeLayoutState.PrecomposedSlotHandle {
        final /* synthetic */ Object $slotId;

        AnonymousClass2(Object obj2) {
            obj = obj2;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
        public void dispose() {
            LayoutNodeSubcompositionsState.this.makeSureStateIsConsistent();
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.remove(obj);
            if (layoutNode != null) {
                if (LayoutNodeSubcompositionsState.this.precomposedCount > 0) {
                    int iIndexOf = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode);
                    if (iIndexOf < LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size() - LayoutNodeSubcompositionsState.this.precomposedCount) {
                        throw new IllegalStateException("Item is not in pre-composed item range".toString());
                    }
                    LayoutNodeSubcompositionsState.this.reusableCount++;
                    LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    layoutNodeSubcompositionsState.precomposedCount--;
                    int size = (LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size() - LayoutNodeSubcompositionsState.this.precomposedCount) - LayoutNodeSubcompositionsState.this.reusableCount;
                    LayoutNodeSubcompositionsState.this.move(iIndexOf, size, 1);
                    LayoutNodeSubcompositionsState.this.disposeOrReuseStartingFromIndex(size);
                    return;
                }
                throw new IllegalStateException("No pre-composed items to dispose".toString());
            }
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
        public int getPlaceablesCount() {
            List<LayoutNode> children$ui_release;
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
            if (layoutNode == null || (children$ui_release = layoutNode.getChildren$ui_release()) == null) {
                return 0;
            }
            return children$ui_release.size();
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
        /* JADX INFO: renamed from: premeasure-0kLqBqw */
        public void mo5540premeasure0kLqBqw(int i2, long j2) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
            if (layoutNode != null && layoutNode.isAttached()) {
                int size = layoutNode.getChildren$ui_release().size();
                if (i2 < 0 || i2 >= size) {
                    throw new IndexOutOfBoundsException("Index (" + i2 + ") is out of bound of [0, " + size + ')');
                }
                if (!layoutNode.isPlaced()) {
                    LayoutNode layoutNode2 = LayoutNodeSubcompositionsState.this.root;
                    layoutNode2.ignoreRemeasureRequests = true;
                    LayoutNodeKt.requireOwner(layoutNode).mo5805measureAndLayout0kLqBqw(layoutNode.getChildren$ui_release().get(i2), j2);
                    layoutNode2.ignoreRemeasureRequests = false;
                    return;
                }
                throw new IllegalArgumentException("Pre-measure called on node that is not placed".toString());
            }
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
        public void traverseDescendants(Object obj2, Function1<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> function1) {
            NodeChain nodes$ui_release;
            Modifier.Node head$ui_release;
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
            if (layoutNode == null || (nodes$ui_release = layoutNode.getNodes$ui_release()) == null || (head$ui_release = nodes$ui_release.getHead$ui_release()) == null) {
                return;
            }
            TraversableNodeKt.traverseDescendants(head$ui_release, obj2, function1);
        }
    }

    public final void forceRecomposeChildren() {
        if (this.reusableCount != this.root.getFoldedChildren$ui_release().size()) {
            Iterator<Map.Entry<LayoutNode, NodeState>> it = this.nodeToNodeState.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().setForceRecompose(true);
            }
            if (this.root.getMeasurePending$ui_release()) {
                return;
            }
            LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, false, 7, null);
        }
    }

    private final LayoutNode createNodeAt(int i2) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.insertAt$ui_release(i2, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 1;
        }
        layoutNodeSubcompositionsState.move(i2, i3, i4);
    }

    private final void ignoreRemeasureRequests(Function0<Unit> function0) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        function0.invoke();
        layoutNode.ignoreRemeasureRequests = false;
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000fy\u0005<$a(yCQU\"}(\u001fUN}˧\u001fJ\t\n\u0004;\u0016\u001c\u0007jDKkw\f\u0011\u001fAPpW>]qM9\u000fwd\u0007ڶ6\">}\u0015\t *V\u0015\u000f|YJ:\u0018ضDpHY]o\u0013$*\u0006l)1\"jof6vu\u0014~mgY݊NĚ+iH~S\u0018T`G\u000f|n,9\u0011UC$=Y\u0013\tb[m\fm\u0002\u0014ݢtҊ+7Q֕o8^\u0011\"'KQ\u0013p\u0001:-\u001f_e$)AN\u0012Q'ʲ4Þ~\b\u0015ɝ\u001c\u0010\f<VDM\u001cl\u001f\u001cKE\u0018aAh\rnD\u0010z\u00109E'ő7+?\u001f=Ϧmޅ\u001d\\?{\u0013*6%\u0007\b/ut\u0010f0)pHi?oX=vW`ԶIъ\b|j̣B\u00066f\u000e;\u001c\u0013473E,Q1B\u0004\u0002vM>Ͽ\u0011¾l_qɭ`B(\u0011$CJ\u000b\u0012}RrU\u0006^Tp.'LJS]é\u0014˙$h\u007f˓9'\u0016r]\u000e\nlS\u0004\u0018Líj_"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/ w\u0015.;S8i>& ro=\u0016g6W\u0005\u0015VH],\u001b;|<\u0014\u007fi\n]+b", "", "Ak^A<+", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "1n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<\u000731V\u0005 \u0015w\u001e9WQ?z8(\u001e>", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0012iJ3rL7ht,Y\u00107e\b\fs\u0018=uzPZ\u001fK\u0004\u001eK\u0005\u001a", "D`[BX", "", "/bc6i,", "5dc\u000eV;Bd\u0019", "u(I", "Adc\u000eV;Bd\u0019", "uY\u0018#", "/bc6i,,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "5dc\u000eV;Bd\u0019l\nZ;|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006^5DUz'7[%*\\C\u0011", "Adc\u000eV;Bd\u0019l\nZ;|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW$\u000741V\u0005 %|\u0012=M\u0019~\\", "5dc\u0010b4I]'\u0003\nb6\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006c%Egy\u001d>ms8UNEy8-\u0019rj\u000f", "Adc\u0010b4I]'\u0003\nb6\u0006", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW)v5CUz'7K 6XMIoC\"\u001fq7|w", "5dc\u0010b5MS\"\u000e", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u0010b5MS\"\u000e", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002/", "4na0X\u0019>Q#\u0007\u0006h:|", "5dc\u0013b9<S\u0006~xh4\b\u0013=e", "Adc\u0013b9<S\u0006~xh4\b\u0013=e", "4na0X\u0019>c'~", "5dc\u0013b9<S\u0006~\u000bl,", "Adc\u0013b9<S\u0006~\u000bl,", "5dc _6M7\u0018", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc _6M7\u0018", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class NodeState {
        private MutableState<Boolean> activeState;
        private ReusableComposition composition;
        private Function2<? super Composer, ? super Integer, Unit> content;
        private boolean forceRecompose;
        private boolean forceReuse;
        private Object slotId;

        public NodeState(Object obj, Function2<? super Composer, ? super Integer, Unit> function2, ReusableComposition reusableComposition) {
            this.slotId = obj;
            this.content = function2;
            this.composition = reusableComposition;
            this.activeState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        }

        public /* synthetic */ NodeState(Object obj, Function2 function2, ReusableComposition reusableComposition, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : reusableComposition);
        }

        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setSlotId(Object obj) {
            this.slotId = obj;
        }

        public final Function2<Composer, Integer, Unit> getContent() {
            return this.content;
        }

        public final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
            this.content = function2;
        }

        public final ReusableComposition getComposition() {
            return this.composition;
        }

        public final void setComposition(ReusableComposition reusableComposition) {
            this.composition = reusableComposition;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final void setForceRecompose(boolean z2) {
            this.forceRecompose = z2;
        }

        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        public final void setForceReuse(boolean z2) {
            this.forceReuse = z2;
        }

        public final MutableState<Boolean> getActiveState() {
            return this.activeState;
        }

        public final void setActiveState(MutableState<Boolean> mutableState) {
            this.activeState = mutableState;
        }

        public final boolean getActive() {
            return this.activeState.getValue().booleanValue();
        }

        public final void setActive(boolean z2) {
            this.activeState.setValue(Boolean.valueOf(z2));
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00106B\u0005(4\u0012\u0006\u0010nj?0Le^.ZS0\u0012s{J$cҕyCI[\"}(\tWNu\nvJp\u000bKƤ\u000e\u0016\u000fj4Ikxe\u0012\u001d2JoU3UڎE9vt>ӌ(20V\u0002\u0005\u0017\u001a2Ϻ\u0018v\tŏSÈ\u001a0VpBR#M\r\u001a\u0018\u0006Dī\u00034ձ\u0018NdG-`Ơ3#\u0011i\u000b-5rH|{!vX5\"\u000faLAp;C,=S1\u001d\u0003kM\u001bW}M\u0007x'UEYug6\u0007\u0016B.[f\u001bx\u000b9l\u0007a`:D;QsK~,>v)\u0018Ɂ@\u0004\u0014%W]<M2w\u0018\u0010Ct!tPR\u0012^p\u001e)}ي\u001b%\u0006RqMc\u0015_\u0004S\u001f^9\f\u0005;BQ$\u001f'iy&b+\u001a\u0003\u001e\u0002@_gUS^\fi=\u001c\"\u001f\u000b͆.\u00046pFCɨ\u0015.%O\bsG$9k0J\u001bϰ\u0003ݶdt[֟jJF%|\u001aW,\u000f\u0011hJ5\u001dyWlXZ\u0013$ɓ`Θ\u0002\u0014\u001b\u05fetyB)3\u0014nQnrxS.\u001c39~7\by\"b.߁`ۋ9U{\u0012g\\\u0005 \u0010Tp\u0012pfpabȮh͈&>PК(y\u0002S\\\u001c34E\u0003*FϢ5D"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/ w\u0015.;S8i>& ro=\u0016g6W\u0005\u0015VH],\u001b@pG\u001f\u00120", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.5C7yD+\u0015V_C\u0012c\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FV -M1Kh2(\u001dskG\u000br0X\u007f55[J;\\(6.", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "Adc\u0011X5LW(\u0013", "uE\u0018#", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "Adc\u0013b5MA\u0017z\u0002^", "7r;<b2B\\\u001bZ}^({", "", "u(I", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Adc\u0019T@Hc(]~k,z\u00183o\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\na\u0006", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "EhSA[", "", "6dX4[;", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X4>\\([\u0002h*\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "AtQ0b4I]'~", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "Ak^A<+", "", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012],C]JulavD]x^\u001c]\u0001", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        public void setDensity(float f2) {
            this.density = f2;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        public void setFontScale(float f2) {
            this.fontScale = f2;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut || LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, Function2<? super Composer, ? super Integer, Unit> function2) {
            return LayoutNodeSubcompositionsState.this.subcompose(obj, function2);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(final int i2, final int i3, final Map<AlignmentLine, Integer> map, final Function1<? super RulerScope, Unit> function1, final Function1<? super Placeable.PlacementScope, Unit> function12) {
            if (!((i2 + ViewCompat.MEASURED_STATE_MASK) - (i2 | ViewCompat.MEASURED_STATE_MASK) == 0 && (ViewCompat.MEASURED_STATE_MASK + i3) - ((-16777216) | i3) == 0)) {
                InlineClassHelperKt.throwIllegalStateException("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return i2;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return i3;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public Function1<RulerScope, Unit> getRulers() {
                    return function1;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    LookaheadDelegate lookaheadDelegate;
                    if (!this.isLookingAhead() || (lookaheadDelegate = layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getLookaheadDelegate()) == null) {
                        function12.invoke(layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getPlacementScope());
                    } else {
                        function12.invoke(lookaheadDelegate.getPlacementScope());
                    }
                }
            };
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яģ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0\u0011.J~01\u001aw\rir9>MmH4R[*%k\u00044*\\,qY;]ڼ\u0006\"\u0017UVgmnRZ\u0019e\u0017\u0006,xrߚQU\u000f]\u001a\u000fHBw?AMw=O`|Ȃ\r H\"@ц\r\u0001(HP\u0010\rzKŷ\u0014\u0012>ϋxíZ\rc\u0005\"\u0012\u001c>(\u0001$\\oNLHt]@/+\u0003\u007fBV'e7\u0005M#F\\'#vi\u001e1D?5+%[\u0003\u001dRc?\tEwܸ\u0007~ѧW+wr\b6\u0007\u007fT\u0018ۣS\rksn@\u0013`x\fU;\u007fgYa&(&\r,\u0011J\u0017&\u0006UZ^? f\u0016\"K\u0001\u0003UPP0tR\u0002\u000bad)S\u0015cD?\u001bthyN)PG{3&.%\u0011nOuj\r\u000f-ôXwWL\u0002UKdf\u001bi?}\u0004\u001f\u007f\u0012,\u00140u\u001a]\u0014 2\u0017+R\"ޔ\"i2\u0010W\\g%\u0015\u0011lazjHn4\u001f\u001aE=!\f\tV\u0015\u0017qPblD\u001d]\u001ed\u0007,\u001e#\"lwj3S%~dv\u0006\u0003^m\f5/\u0015Tip{\u000e\u0006S\rK̳Uc\u0016|\u0019ί\u0013\bjp#plRU\u001cZ\u000bHPQxp\u001e\u0019\u0014Fd\u000bATo\u0001*WD<)^%H18peҴ\r_`\u000eV\u0013Ձ7$\u0011\u0010l\n\u0017(h\\\u001f\u0002\u0010xwTCʸ!Ѓ@ٛڤ\u001d([Kv^E8\u0015&\f\u007fuytGz\u0018\\\u0086Tߡ\u001fچ׀=S5i!<G>@0EEz\u001b\u000eQ{=mϭ{ʣ\u000e\u0090ÿ2i\u000e\u001a~\\)\u0003X}l\u0017P\u001f\u0007rQ\u000b+јxՌEyūbҺߏ_@O$\u0011\f\u0005fF+\u001d\u001fLM)oP\u000f{ԞBܨ\u001c\u0015È\u0013٬ֵe_o!<-+$4)}\u0004Z\u0019>o\u0011\b$о:ϨHʲ˽B$*$\u0011z\u0011\u007f\u0006AZ\tb\u0010[Ho\r7ޡ7ր\nɀ̱j\t2G~\t$O!)\u00164\\bRsq)ZڃBӒ\u0010\u07bdϬkos\u0007j;\u0013\u001a\u0018G\u00141\u001dOD=N\u0015\u001eŚ\bx\u001b\u0002WNAi\u0019-<7Yzʎ;\u0082\n͏Ұm\b\u0016;\u000e~($%sZsi\u00026T'\u0005\u001d\u07b8\u0004߳DǷՃ.\u0003\u0005QAaAM?F\u0006F\u0003Z\f2/Vc͗\u001a̻N}\u07b3$Ľ\u05ffX;!lfDS]k\u0005a\u0002d/o)\u001c}6ɇ7ć{\u001cĦ\u0017ÇʦU\u0013e;>$[grP|v@i\tbxĮ\u0002Ҷ\u0001\u0012T\f\u0015\u000f'TC\u0002p3dN&:y.WӗGͫ\u000b\u0010\u0015eL\";\u000b\u0006?KQ\u0003\u0014U\u0005\u000e(\u0012֒\u000bÙ$+\u001cv'de\u00187\u001ak&R\u0016 \"9ֆ\f\u07b3T$\u001c0P\u0002\u0001\u0018ڗ\b?W\u00059Ě/\rXsw'_Ӹ/3"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/ w\u0015.;S8i>& ro=\u0016g6W\u0005\u0015VH],\u001b=|K#xd\u0018T'\u0010\u0005U@\fn@E/\u0015,7\u007fEs\u0001o\u001e\u0019<@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.5C7yD+\u0015V_C\u0012c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FV -M1Kh2(\u001dskG\u000br0X\u007f55[J;\\(6.", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "7r;<b2B\\\u001bZ}^({", "", "u(I", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "EhSA[", "", "6dX4[;", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X4>\\([\u0002h*\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "AtQ0b4I]'~", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "Ak^A<+", "", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012],C]JulavD]x^\u001c]\u0001", "@nd;W\u001bH>,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@nd;W\u001bH>,FE/~G\u000e)4", "uE\u0018\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "@nd;W\u001bH>,FBKxo\u0003\u007fo", "uI\u0018\u0016", "Bn3=", "Bn3= \u000e:<d]n:", "uI\u0018\u0013", "Bn3= <\u000bc#ljF", "uE\u0018\u0013", "uH\u0018\u0013", "Bn3=F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "Bn3=F0SS`\u0005Bk-my\u0017", "uI\u0018\u0017", "Bn?E", "Bn?E v\u000f&c\u0004t-", "Bn?E s+ \fxKh", "BnA2V;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3hS", "BnB6m,", "BnB6m,\u0006F\u001fzlG\u001bh", "BnB=", "BnB= vQ;\tNyh", "uE\u0018\u0017", "BnB= 2)he`\u000f-", "uH\u0018\u0017", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class PostLookaheadMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {
        private final /* synthetic */ Scope $$delegate_0;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super Placeable.PlacementScope, Unit> function1) {
            return this.$$delegate_0.layout(i2, i3, map, function1);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super RulerScope, Unit> function1, Function1<? super Placeable.PlacementScope, Unit> function12) {
            return this.$$delegate_0.layout(i2, i3, map, function1, function12);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public int mo703roundToPxR2X_6o(long j2) {
            return this.$$delegate_0.mo703roundToPxR2X_6o(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public int mo704roundToPx0680j_4(float f2) {
            return this.$$delegate_0.mo704roundToPx0680j_4(f2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public float mo705toDpGaN1DYA(long j2) {
            return this.$$delegate_0.mo705toDpGaN1DYA(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo706toDpu2uoSUM(float f2) {
            return this.$$delegate_0.mo706toDpu2uoSUM(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo707toDpu2uoSUM(int i2) {
            return this.$$delegate_0.mo707toDpu2uoSUM(i2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public long mo708toDpSizekrfVVM(long j2) {
            return this.$$delegate_0.mo708toDpSizekrfVVM(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public float mo709toPxR2X_6o(long j2) {
            return this.$$delegate_0.mo709toPxR2X_6o(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public float mo710toPx0680j_4(float f2) {
            return this.$$delegate_0.mo710toPx0680j_4(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public long mo711toSizeXkaWNTQ(long j2) {
            return this.$$delegate_0.mo711toSizeXkaWNTQ(j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public long mo712toSp0xMU5do(float f2) {
            return this.$$delegate_0.mo712toSp0xMU5do(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo713toSpkPz2Gy4(float f2) {
            return this.$$delegate_0.mo713toSpkPz2Gy4(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo714toSpkPz2Gy4(int i2) {
            return this.$$delegate_0.mo714toSpkPz2Gy4(i2);
        }

        public PostLookaheadMeasureScopeImpl() {
            this.$$delegate_0 = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, Function2<? super Composer, ? super Integer, Unit> function2) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.slotIdToNode.get(obj);
            List<Measurable> childMeasurables$ui_release = layoutNode != null ? layoutNode.getChildMeasurables$ui_release() : null;
            return childMeasurables$ui_release != null ? childMeasurables$ui_release : LayoutNodeSubcompositionsState.this.postLookaheadSubcompose(obj, function2);
        }
    }

    public final List<Measurable> postLookaheadSubcompose(Object obj, Function2<? super Composer, ? super Integer, Unit> function2) {
        if (this.postLookaheadComposedSlotIds.getSize() < this.currentPostLookaheadIndex) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
        }
        int size = this.postLookaheadComposedSlotIds.getSize();
        int i2 = this.currentPostLookaheadIndex;
        if (size == i2) {
            this.postLookaheadComposedSlotIds.add(obj);
        } else {
            this.postLookaheadComposedSlotIds.set(i2, obj);
        }
        this.currentPostLookaheadIndex++;
        if (!this.precomposeMap.containsKey(obj)) {
            this.postLookaheadPrecomposeSlotHandleMap.put(obj, precompose(obj, function2));
            if (this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                this.root.requestLookaheadRelayout$ui_release(true);
            } else {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(this.root, true, false, false, 6, null);
            }
        }
        LayoutNode layoutNode = this.precomposeMap.get(obj);
        if (layoutNode != null) {
            List<LayoutNodeLayoutDelegate.MeasurePassDelegate> childDelegates$ui_release = layoutNode.getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
            int size2 = childDelegates$ui_release.size();
            for (int i3 = 0; i3 < size2; i3++) {
                childDelegates$ui_release.get(i3).markDetachedFromParentLookaheadPass$ui_release();
            }
            if (childDelegates$ui_release != null) {
                return childDelegates$ui_release;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final void move(int i2, int i3, int i4) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.move$ui_release(i2, i3, i4);
        layoutNode.ignoreRemeasureRequests = false;
    }
}
