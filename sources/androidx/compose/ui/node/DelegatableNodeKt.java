package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: DelegatableNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я~\u001d̉=!,r\bDZc|\u0004G\u00068\u000b<B\u0007\"B\u0012\u007f\u0007|jA0JeP.`q2\u000fq{<$q$yCAV\"}8\tWNmhvJp\u000bK\u000f\f\u001b\u0001j:կ]xc\u0013\u00172PuG3SoE9vt>\u0005&3*8\u0010\u0005\tɝ2H&v\u0003ŏS\f(0H\u0081BR#M\r܅\u001a\u0006T \tȦdgd6PlcPG;\u0011kZNUbX\u0003]\u000fVTU\u0012%eN/N=M\u0015SXI\u0007j\u000fM\nWyM\u0007x'm4_r\u0006>x\u0004\u001aƃ9X#\\\u001b&\u000b\u0005\u0002j\u001a1CUsM`\u000en\u0001)\u0007Sɞ\nٳ\u0005Ωρ2/ r\u0016\u001bK\u0001\u0001aXR\u0018]p\u000f#ad\u001ckĮKjG+~Q\u0010>9R=ަ\u0013\u00164\")nO`\u0005\u0018n&3Z\bSAQ\u0007FvY:iK\u007f\u001c|r\u0004:\u0004vP\u00101\f\u0011\\\u001aSJ\"ݾ)ޢjȵҩHi|\u0019n}k\n`^X\"\u001d\u0015_*7\f\u000bLr\u000f\u0004TdX2\u0012{'\u001b͵ś\u0007ʶء`yB83(fWv\u0003\u0003M\f\rM/\u00157q y(o;t2{Z\u0004\u0018g\u05ec\u0005\u001dU;\u000b\u0005\u0007\u0002jS:Z\r20<`p y\fD\u0015\u0015A=\u0006ڥ\"ڲ+ջǬ`\u0017N\u001f,_Y\u0011\u0017yrj&}\u00038L\u0003\u0018$%\r\u000fntp\u001e\u0007?̢D\u0011nBECg4G+}*x6\r#5\u0004\n~uk\u0013Gd\r$\u0017m{N8B9\u007f/m\u001b\u001d\u0010A6\u0012-KM!p\u0018˧ʵ&ϕ܃}\u0011A\f<\f r~Qxjxu|\u0017Pvvz1/|\u007f(\nnzucl\u0013igar1\u0004dNf|\u001d',P\u0019oP)]-q'5 \u0006AG\u0015\u0010\f\u0012o\\y)χ>~s3DcD \u000bQ\f2\u0002ͯa#\ro:$\u001b\u0006bLp̫\u0016K\u001f353vA\u0015zdBe\u0011?\u007fv\u0007r\u0016\u001fa\f@\u0019o\ffF_Xrs\u000e\"p[1!Ocg4v[^\u001bJ=\r9\u000fwެ\u0018Ћ<ղݫ[d\u000fc\u0014(0gOlz\u0005j\fL4Z<8\u000fQr\u0002\u0006>\u001a0Le\u000f%dZsiU>d\u0007nnT\u0015bU`O/\u0011\u0001\u001f3L{cDKֈLlnqg\u0019SK\f;nUƫt.AC|9I(\t\u000b\u0019OuIY\u0004F\u0004\u000e2\u001cv \u001cF*\u0015)R\u001a+9\u0018\u001aox@^9X\u0013a+ɻ\u0018ٟQƉĀ-\u0001\u00013\u001cs\"6\u0019Ngr\u001eeUL|wgG(\u001f/DW&<\rqX39\u00167==wo$)\fW\u0002>,\u001bfê-\u001c4/\u0015o\u000e\u0015\r}\u001f@σ\u007f\u001fx\u00011\u0013~ 48X~\u000b\u0010>\nFOH<0\u001e\u000fiy\n9L7-|\u0006\tTxz\u001ac\u001bf\u001dhQӇlݫUҳӊ1R#B5\u0005F:f\u0013R\u0011\u0002#\u0001\u0011.\u0014E*-T bW/\u007fsv\u0003\u0004[k\u000f;/\u001a/q3@RL\u0001M\r<ã0lg#unMlg)`r܀e\u0017tiPd#\fY\u001e\u000b\t`d!\u0015DF9'\u0013:g)-m%Sp\t\u0014E\u0010/13b?I:`\u001e6Ċ|ؤ\u0002̌Ūx\u00020}\u0017*\u0018\u000f:g^Tk\u001dOYRm\u0015\u00074i]8p'\\!\u001c#GfH\"N\\H!KSCAG\u0014/(~ێu\u001fJC%iSS-)|/\ro}?\nRse\u0012S5\u0015o)\n~;S4\u0016\\5\u001e\u001aqZ\u0001]c\u0005\u0014q.Y5s!(h\u0007\u0095\u00107o2B\u000e#.HQL0أjIlr\u007f\u0004T*fxR-_r\tu\u001a,0!\"o\fiB~\u0013\u0018)DD+[w7U[z\u0012\u0017T\u000fU\u0014}\u0018\u0016+C\u0017+\u0013}\u0005\u0007ԵOٕLҍۺa>\u00192\u0012yJ!D:_@\b-&1\u0018˧qs\u0001ly_>8B\u0017\u001b\u000e\u00107bb\u0010`c!UV'VDn\u0011YQd\u001b@U-n0R\f9\tDA\u000fǇ\bӣI߷ū\u00175M5O~*\u0016\nc5\u0011\n(&)m߳UHkp\u0001=g3;wXbMkl\u0007e!\u0012mY 0z9@_bN\u001c:XL\u0017UfX\u0010r{r;4Ө6ÛOڄ\u0082G_\u0007_-tmTsCJbe^\u0005\u00151ŋewhTK-'\u00023\u001aO#+\u0011.UI2i|;<n\f\u0016naa\roY\u0010IjZ#?\u0006m2o^3ɠkɣ\u0018ًĄ\u0003\u000e&l2=+Kp,+i<%\b\u0003z6\u0007-Viq\u0011\u0015a\u001b\u001f\t\u0007$:\u001c:e\u0006k\u000b!d,5ibn?t߿\u000f_\u000fxBBe\u001ei\u0015]Sҗ9~/=Yq?c\u007fi\"xibh@'WlIA\rJ-4s\u0014T92'U*vzud`?Xb~vٚ\u007fݱeٍͣg@B\u0010zP~v\faiD\u0011\f\tpvA@fzJ?6v\nI\u0011\u000f]y#$9TvQlC<2aPR\f8\u000e͇\f.\u0001o\u07bf-{\f2^\r\u001e,3S[Àh̴\bp\u001dO6ʚy0ȍF_H\u001f3ށC\u001cgȂ.V"}, d2 = {"7r32_,@O(\u0003\u0005g\u0019\u0007\u0013>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r\u001c4t\u0016\u0017WB;A", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001bv,5[y/3j\u001d.6M:k\na\n", "/cS\u0019T@Hc(g\u0005],Z\f3l~5{I", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "<nS2", "/mR2f;H`'", "", "\"", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001b]\u0007\u001f\r", "/mR2f;H`'FK-\u000bd\u0005.o", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001bv,5[y/3j\u001d.6M:k\n\u0002XOf5\u0018_u^\u0006+N\u001650jaH", "/r;.l6Nb\u0001\tyb-\u0001\t<N\n'{", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "2hb=T;<Vy\t\bD0\u0006\b", "9h]1", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "2hb=T;<Vy\t\bD0\u0006\bv6\r\td2\u0010a", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2sB\b\u001f7Cy\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WvbHJ", "6`b", "6`by)z\u001d;\u0015}\u0005", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001bv,5[y/3j\u001d.6M:k\n\u0002X]", "7me._0=O(~hn)\f\u0016/e", "<dP?X:M/\"|zl;\u0007\u0016", "", "<dP?X:M/\"|zl;\u0007\u0016v6N\u0007c<\u007f!", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001bv,5[y/3j\u001d.6M:k\n\u0002XOf5\u0018_uUr0I\u00168)aRpLi", ";`b8", "", ">n_", "@d`B\\9>1#\t\b]0\u0006\u0005>o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "@d`B\\9>1#\t\b]0\u0006\u0005>o\roL\u000f_~\u0013Fy", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001bv,5[y/3j\u001d.6M:k\n\u0002XO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^WW5\f\u0005#*.mD\u0015)\u00129H\u0006Dd\u0010\u0016#c", "@d`B\\9>2\u0019\b\tb;\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "@d`B\\9>5&z\u0006a0z\u0017\ro\t7{S\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "@d`B\\9>:\u0015\u0013\u0005n;Z\u00139r~,\u0005<\u0010\u0017%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "@d`B\\9>:\u0015\u0013\u0005n;[\r<e}7\u007fJ\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "@d`B\\9>:\u0015\u0013\u0005n;e\u0013.e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "@d`B\\9>=+\bzk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B/", "Dhb6g\bGQ\u0019\r\nh9\u000b", "7mR9h+>A\u0019\u0006{", "Dhb6g\bGQ\u0019\r\nh9\u000bP#-s\u000e\u0004C\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001bv,5[y/3j\u001d.6M:k\n\u0002\nOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0003tK\u001d", "Dhb6g\nAW }\b^5", "Dhb6g\nAW }\b^5DY<Fh\u001a\u000b\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001bv,5[y/3j\u001d.6M:k\n\u0002{nkH\u000eg5\u0018{8O\u0016O<eP\u0002A\u001e\u001bhW/;\u0016\u0003hE.w\u0010\rbx", "Dhb6g\u0013HQ\u0015\u0006Vg*|\u0017>o\r6", "Dhb6g\u0013HQ\u0015\u0006Vg*|\u0017>o\r6C\u0011\u000ew\u007f9~X", "Dhb6g\u0013HQ\u0015\u0006Y^:z\t8d{1\u000bN", "Dhb6g\u0013HQ\u0015\u0006Y^:z\t8d{1\u000bNHg$(X\u007fKA", "Dhb6g\u001a>Z\u001aZ\u0004]\b\u0006\u0007/s\u000f2\tN", "Cmc6_\u001bR^\u0019", "Dhb6g\u001a>Z\u001aZ\u0004]\b\u0006\u0007/s\u000f2\tNHfsDZ^\tZ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001bv,5[y/3j\u001d.6M:k\n\u0002xOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0003tK\u001d", "Dhb6g\u001a>Z\u001aZ\u0004]\n\u007f\r6d\r(\u0005", "Dhb6g\u001a>Z\u001aZ\u0004]\n\u007f\r6d\r(\u0005\bQ$w0a\u001d\u0007", "Dhb6g\u001a>Z\u001aZ\u0004]\u0013\u0007\u0007+l^(\n>\u0001 \u0016Cx\u001dJ", "Dhb6g\u001a>Z\u001aZ\u0004]\u0013\u0007\u0007+l^(\n>\u0001 \u0016Cx\u001dJ>uB:f\u0012F8", "Dhb6g\u001aNP(\fz^", "Dhb6g\u001aNP(\fz^sM\u0016\u0010Nq7F", "Dhb6g\u001aNP(\fz^\u0010}", "Dhb6g\u001aNP(\fz^\u0010}P\u007fr`\u0011mOK", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DelegatableNodeKt {
    public static final boolean isDelegationRoot(DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    public static final void visitAncestors(DelegatableNode delegatableNode, int i2, boolean z2, Function1<? super Modifier.Node, Unit> function1) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = z2 ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            int aggregateChildKindSet$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + i2) - (aggregateChildKindSet$ui_release | i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i2) != 0) {
                        function1.invoke(node);
                    }
                    node = node.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode delegatableNode, int i2, boolean z2, Function1 function1, int i3, Object obj) {
        NodeChain nodes$ui_release;
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = z2 ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i2) != 0) {
                while (node != null) {
                    if ((-1) - (((-1) - node.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                        function1.invoke(node);
                    }
                    node = node.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    public static final Modifier.Node nearestAncestor(DelegatableNode delegatableNode, int i2) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("nearestAncestor called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i2) != 0) {
                while (parent$ui_release != null) {
                    int kindSet$ui_release = parent$ui_release.getKindSet$ui_release();
                    if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                        return parent$ui_release;
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    public static final void visitSubtree(DelegatableNode delegatableNode, int i2, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtree called on an unattached node");
        }
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child$ui_release == null) {
                child$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release();
            }
            int aggregateChildKindSet$ui_release = child$ui_release.getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + i2) - (aggregateChildKindSet$ui_release | i2) != 0) {
                while (child$ui_release != null) {
                    int kindSet$ui_release = child$ui_release.getKindSet$ui_release();
                    if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                        function1.invoke(child$ui_release);
                    }
                    child$ui_release = child$ui_release.getChild$ui_release();
                }
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            child$ui_release = null;
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
        }
    }

    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node) {
        MutableVector<LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i2 = size - 1;
            LayoutNode[] content = mutableVector2.getContent();
            do {
                mutableVector.add(content[i2].getNodes$ui_release().getHead$ui_release());
                i2--;
            } while (i2 >= 0);
        }
    }

    public static final void visitChildren(DelegatableNode delegatableNode, int i2, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child$ui_release2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child$ui_release2.getAggregateChildKindSet$ui_release() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, child$ui_release2);
            } else {
                while (true) {
                    if (child$ui_release2 == null) {
                        break;
                    }
                    if ((-1) - (((-1) - child$ui_release2.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                        function1.invoke(child$ui_release2);
                        break;
                    }
                    child$ui_release2 = child$ui_release2.getChild$ui_release();
                }
            }
        }
    }

    public static final void visitSubtreeIf(DelegatableNode delegatableNode, int i2, Function1<? super Modifier.Node, Boolean> function1) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i2) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((-1) - (((-1) - child$ui_release2.getKindSet$ui_release()) | ((-1) - i2)) == 0 || function1.invoke(child$ui_release2).booleanValue()) {
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node);
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i2, boolean z2, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        int aggregateChildKindSet$ui_release = node.getAggregateChildKindSet$ui_release();
        if ((aggregateChildKindSet$ui_release + i2) - (aggregateChildKindSet$ui_release | i2) == 0) {
            return;
        }
        if (!z2) {
            node = node.getChild$ui_release();
        }
        while (node != null) {
            if ((node.getKindSet$ui_release() & i2) != 0) {
                function1.invoke(node);
            }
            node = node.getChild$ui_release();
        }
    }

    public static /* synthetic */ void visitLocalDescendants$default(DelegatableNode delegatableNode, int i2, boolean z2, Function1 function1, int i3, Object obj) {
        if ((i3 + 2) - (i3 | 2) != 0) {
            z2 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i2) == 0) {
            return;
        }
        if (!z2) {
            node = node.getChild$ui_release();
        }
        while (node != null) {
            int kindSet$ui_release = node.getKindSet$ui_release();
            if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                function1.invoke(node);
            }
            node = node.getChild$ui_release();
        }
    }

    public static final void visitLocalAncestors(DelegatableNode delegatableNode, int i2, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if ((-1) - (((-1) - parent$ui_release.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                function1.invoke(parent$ui_release);
            }
        }
    }

    /* JADX INFO: renamed from: visitSelfAndAncestors-5BbP62I */
    public static final /* synthetic */ <T> void m5642visitSelfAndAncestors5BbP62I(DelegatableNode delegatableNode, int i2, int i3, Function1<? super T, Unit> function1) {
        NodeChain nodes$ui_release;
        Modifier.Node node = delegatableNode.getNode();
        int i4 = (i2 + i3) - (i2 & i3);
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node2 = delegatableNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((-1) - (((-1) - layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release()) | ((-1) - i4)) != 0) {
                while (node2 != null) {
                    int kindSet$ui_release = node2.getKindSet$ui_release();
                    if ((kindSet$ui_release + i4) - (kindSet$ui_release | i4) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & i3) != 0) {
                            return;
                        }
                        if ((-1) - (((-1) - node2.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                            Modifier.Node nodePop = node2;
                            MutableVector mutableVector = null;
                            while (nodePop != null) {
                                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                                if (nodePop instanceof Object) {
                                    function1.invoke(nodePop);
                                } else if ((nodePop.getKindSet$ui_release() & i2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i5 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & i2) != 0) {
                                            i5++;
                                            if (i5 == 1) {
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
                                    if (i5 == 1) {
                                    }
                                }
                                nodePop = pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* JADX INFO: renamed from: visitSelfAndChildren-6rFNWt0 */
    public static final /* synthetic */ <T> void m5643visitSelfAndChildren6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1) {
        Modifier.Node node = delegatableNode.getNode();
        MutableVector mutableVector = null;
        while (node != null) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (node instanceof Object) {
                function1.invoke(node);
            } else if ((node.getKindSet$ui_release() & i2) != 0 && (node instanceof DelegatingNode)) {
                int i3 = 0;
                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                    if ((-1) - (((-1) - delegate$ui_release.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                        i3++;
                        if (i3 == 1) {
                            node = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                if (mutableVector != null) {
                                    mutableVector.add(node);
                                }
                                node = null;
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
            node = pop(mutableVector);
        }
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector2, delegatableNode.getNode());
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui_release() & i2) == 0) {
                addLayoutNodeChildren(mutableVector2, nodePop);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (nodePop instanceof Object) {
                                function1.invoke(nodePop);
                            } else {
                                int kindSet$ui_release = nodePop.getKindSet$ui_release();
                                if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i4 = 0;
                                    for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                        int kindSet$ui_release2 = delegate$ui_release2.getKindSet$ui_release();
                                        if ((kindSet$ui_release2 + i2) - (kindSet$ui_release2 | i2) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                nodePop = delegate$ui_release2;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    if (mutableVector3 != null) {
                                                        mutableVector3.add(nodePop);
                                                    }
                                                    nodePop = null;
                                                }
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(delegate$ui_release2);
                                                }
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                            }
                            nodePop = pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: has-64DMado */
    public static final boolean m5634has64DMado(DelegatableNode delegatableNode, int i2) {
        return (delegatableNode.getNode().getAggregateChildKindSet$ui_release() & i2) != 0;
    }

    /* JADX INFO: renamed from: requireCoordinator-64DMado */
    public static final NodeCoordinator m5636requireCoordinator64DMado(DelegatableNode delegatableNode, int i2) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        Intrinsics.checkNotNull(coordinator$ui_release);
        if (coordinator$ui_release.getTail() == delegatableNode && NodeKindKt.m5758getIncludeSelfInTraversalH91voCI(i2)) {
            NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
            Intrinsics.checkNotNull(wrapped$ui_release);
            return wrapped$ui_release;
        }
        return coordinator$ui_release;
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.getLayoutNode();
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Owner owner$ui_release = requireLayoutNode(delegatableNode).getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }

    public static final Density requireDensity(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    public static final GraphicsContext requireGraphicsContext(DelegatableNode delegatableNode) {
        return requireOwner(delegatableNode).getGraphicsContext();
    }

    public static final LayoutDirection requireLayoutDirection(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    public static final LayoutCoordinates requireLayoutCoordinates(DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates coordinates = m5636requireCoordinator64DMado(delegatableNode, NodeKind.m5749constructorimpl(2)).getCoordinates();
        if (!coordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    public static final void invalidateSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    /* JADX INFO: renamed from: dispatchForKind-6rFNWt0 */
    public static final /* synthetic */ <T> void m5633dispatchForKind6rFNWt0(Modifier.Node node, int i2, Function1<? super T, Unit> function1) {
        MutableVector mutableVector = null;
        while (node != null) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (node instanceof Object) {
                function1.invoke(node);
            } else if ((node.getKindSet$ui_release() & i2) != 0 && (node instanceof DelegatingNode)) {
                int i3 = 0;
                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                    if ((delegate$ui_release.getKindSet$ui_release() & i2) != 0) {
                        i3++;
                        if (i3 == 1) {
                            node = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                if (mutableVector != null) {
                                    mutableVector.add(node);
                                }
                                node = null;
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
            node = pop(mutableVector);
        }
    }

    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector == null || mutableVector.isEmpty()) {
            return null;
        }
        return mutableVector.removeAt(mutableVector.getSize() - 1);
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i2, Function1<? super Modifier.Node, Unit> function1) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((-1) - (((-1) - node.getAggregateChildKindSet$ui_release()) | ((-1) - i2)) != 0) {
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                int kindSet$ui_release = child$ui_release.getKindSet$ui_release();
                if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                    function1.invoke(child$ui_release);
                }
            }
        }
    }

    /* JADX INFO: renamed from: visitSelfAndLocalDescendants-6rFNWt0 */
    public static final /* synthetic */ <T> void m5644visitSelfAndLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((-1) - (((-1) - node.getAggregateChildKindSet$ui_release()) | ((-1) - i2)) != 0) {
            while (node != null) {
                if ((-1) - (((-1) - node.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                    Modifier.Node nodePop = node;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (nodePop instanceof Object) {
                            function1.invoke(nodePop);
                        } else if ((nodePop.getKindSet$ui_release() & i2) != 0 && (nodePop instanceof DelegatingNode)) {
                            int i3 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                int kindSet$ui_release = delegate$ui_release.getKindSet$ui_release();
                                if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
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
                        nodePop = pop(mutableVector);
                    }
                }
                node = node.getChild$ui_release();
            }
        }
    }

    /* JADX INFO: renamed from: visitLocalDescendants-6rFNWt0 */
    public static final /* synthetic */ <T> void m5641visitLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i2) != 0) {
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                int kindSet$ui_release = child$ui_release.getKindSet$ui_release();
                if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                    Modifier.Node nodePop = child$ui_release;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (nodePop instanceof Object) {
                            function1.invoke(nodePop);
                        } else {
                            int kindSet$ui_release2 = nodePop.getKindSet$ui_release();
                            if ((kindSet$ui_release2 + i2) - (kindSet$ui_release2 | i2) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & i2) != 0) {
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
                        }
                        nodePop = pop(mutableVector);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: visitLocalAncestors-6rFNWt0 */
    public static final /* synthetic */ <T> void m5640visitLocalAncestors6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if ((-1) - (((-1) - parent$ui_release.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                Modifier.Node nodePop = parent$ui_release;
                MutableVector mutableVector = null;
                while (nodePop != null) {
                    Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                    if (nodePop instanceof Object) {
                        function1.invoke(nodePop);
                    } else if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - i2)) != 0 && (nodePop instanceof DelegatingNode)) {
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
                    nodePop = pop(mutableVector);
                }
            }
        }
    }

    /* JADX INFO: renamed from: visitAncestors-Y-YKmho */
    public static final /* synthetic */ <T> void m5637visitAncestorsYYKmho(DelegatableNode delegatableNode, int i2, boolean z2, Function1<? super T, Unit> function1) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = z2 ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((-1) - (((-1) - layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release()) | ((-1) - i2)) != 0) {
                while (node != null) {
                    if ((-1) - (((-1) - node.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                        Modifier.Node nodePop = node;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (nodePop instanceof Object) {
                                function1.invoke(nodePop);
                            } else if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - i2)) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    int kindSet$ui_release = delegate$ui_release.getKindSet$ui_release();
                                    if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
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
                            nodePop = pop(mutableVector);
                        }
                    }
                    node = node.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* JADX INFO: renamed from: visitAncestors-Y-YKmho$default */
    public static /* synthetic */ void m5638visitAncestorsYYKmho$default(DelegatableNode delegatableNode, int i2, boolean z2, Function1 function1, int i3, Object obj) {
        NodeChain nodes$ui_release;
        if ((i3 + 2) - (i3 | 2) != 0) {
            z2 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = z2 ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            int aggregateChildKindSet$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + i2) - (aggregateChildKindSet$ui_release | i2) != 0) {
                while (node != null) {
                    int kindSet$ui_release = node.getKindSet$ui_release();
                    if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                        Modifier.Node nodePop = node;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (!(nodePop instanceof Object)) {
                                if ((nodePop.getKindSet$ui_release() & i2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i4 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((-1) - (((-1) - delegate$ui_release.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                                            i4++;
                                            if (i4 == 1) {
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
                                    if (i4 == 1) {
                                    }
                                }
                            } else {
                                function1.invoke(nodePop);
                            }
                            nodePop = pop(mutableVector);
                        }
                    }
                    node = node.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* JADX INFO: renamed from: ancestors-64DMado */
    public static final /* synthetic */ <T> List<T> m5632ancestors64DMado(DelegatableNode delegatableNode, int i2) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            int aggregateChildKindSet$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + i2) - (aggregateChildKindSet$ui_release | i2) != 0) {
                while (parent$ui_release != null) {
                    int kindSet$ui_release = parent$ui_release.getKindSet$ui_release();
                    if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                        Modifier.Node nodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (nodePop instanceof Object) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(nodePop);
                            } else {
                                int kindSet$ui_release2 = nodePop.getKindSet$ui_release();
                                if ((kindSet$ui_release2 + i2) - (kindSet$ui_release2 | i2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        int kindSet$ui_release3 = delegate$ui_release.getKindSet$ui_release();
                                        if ((kindSet$ui_release3 + i2) - (kindSet$ui_release3 | i2) != 0) {
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
                            }
                            nodePop = pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: nearestAncestor-64DMado */
    public static final /* synthetic */ <T> T m5635nearestAncestor64DMado(DelegatableNode delegatableNode, int i2) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            int aggregateChildKindSet$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + i2) - (aggregateChildKindSet$ui_release | i2) != 0) {
                while (parent$ui_release != null) {
                    if ((-1) - (((-1) - parent$ui_release.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                        Object obj = (T) parent$ui_release;
                        MutableVector mutableVector = null;
                        while (obj != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (obj instanceof Object) {
                                return (T) obj;
                            }
                            int kindSet$ui_release = ((Modifier.Node) obj).getKindSet$ui_release();
                            if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0 && (obj instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui_release = obj.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    int kindSet$ui_release2 = delegate$ui_release.getKindSet$ui_release();
                                    if ((kindSet$ui_release2 + i2) - (kindSet$ui_release2 | i2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            obj = (T) delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (obj != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(obj);
                                                }
                                                obj = (T) null;
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
                            obj = (T) pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    /* JADX INFO: renamed from: visitSubtree-6rFNWt0 */
    public static final /* synthetic */ <T> void m5645visitSubtree6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtree called on an unattached node");
        }
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child$ui_release == null) {
                child$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release();
            }
            if ((-1) - (((-1) - child$ui_release.getAggregateChildKindSet$ui_release()) | ((-1) - i2)) != 0) {
                while (child$ui_release != null) {
                    if ((child$ui_release.getKindSet$ui_release() & i2) != 0) {
                        Modifier.Node nodePop = child$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (nodePop instanceof Object) {
                                function1.invoke(nodePop);
                            } else if ((nodePop.getKindSet$ui_release() & i2) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    int kindSet$ui_release = delegate$ui_release.getKindSet$ui_release();
                                    if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
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
                            nodePop = pop(mutableVector);
                        }
                    }
                    child$ui_release = child$ui_release.getChild$ui_release();
                }
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
            child$ui_release = null;
        }
    }

    /* JADX INFO: renamed from: visitChildren-6rFNWt0 */
    public static final /* synthetic */ <T> void m5639visitChildren6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1) {
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui_release() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui_release() & i2) != 0) {
                        MutableVector mutableVector2 = null;
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (nodePop instanceof Object) {
                                function1.invoke(nodePop);
                            } else if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - i2)) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((-1) - (((-1) - delegate$ui_release.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(nodePop);
                                                }
                                                nodePop = null;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            nodePop = pop(mutableVector2);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: visitSubtreeIf-6rFNWt0 */
    public static final /* synthetic */ <T> void m5646visitSubtreeIf6rFNWt0(DelegatableNode delegatableNode, int i2, Function1<? super T, Boolean> function1) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            int aggregateChildKindSet$ui_release = node.getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + i2) - (aggregateChildKindSet$ui_release | i2) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    int kindSet$ui_release = child$ui_release2.getKindSet$ui_release();
                    if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                        Modifier.Node nodePop = child$ui_release2;
                        MutableVector mutableVector2 = null;
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (nodePop instanceof Object) {
                                if (!function1.invoke(nodePop).booleanValue()) {
                                    break;
                                }
                            } else {
                                int kindSet$ui_release2 = nodePop.getKindSet$ui_release();
                                if ((kindSet$ui_release2 + i2) - (kindSet$ui_release2 | i2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        int kindSet$ui_release3 = delegate$ui_release.getKindSet$ui_release();
                                        if ((kindSet$ui_release3 + i2) - (kindSet$ui_release3 | i2) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nodePop = delegate$ui_release;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(nodePop);
                                                    }
                                                    nodePop = null;
                                                }
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                            }
                            nodePop = pop(mutableVector2);
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode asLayoutModifierNode(Modifier.Node node) {
        if ((NodeKind.m5749constructorimpl(2) & node.getKindSet$ui_release()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release();
                while (delegate$ui_release != 0) {
                    if (delegate$ui_release instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) delegate$ui_release;
                    }
                    if ((delegate$ui_release instanceof DelegatingNode) && (NodeKind.m5749constructorimpl(2) & delegate$ui_release.getKindSet$ui_release()) != 0) {
                        delegate$ui_release = ((DelegatingNode) delegate$ui_release).getDelegate$ui_release();
                    } else {
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    }
                }
            }
        }
        return null;
    }
}
