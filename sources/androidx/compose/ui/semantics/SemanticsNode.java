package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
    	... 4 more
    */
/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яė\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~05\u001aՄ\u000ff\u000198ǏmHDR[*\u0015k\u00044:[,qI@]\u001a\f@\u0011OTlonX`\u0013C\u0015\u0012\u001ex\u0001,QU~f\u001a\u000fHBw?9Tw=O`|6\u000b!:\"Ny\r\u0001 /P\u0010\u0005zKŷ\u0014\u0012>_x:X\rU\u00050\u0012\u000ē(\u00014\\oNLHt]P/+\u0003oBV'u0\u0005M\u0013I\\'#vi\u001e1G=:+Ǭ\u0004\u00035Q\u001cd\tӊ\u0002A\u0013h?'YJ\u0004[DZ\u0018\u0014C._\u0011kv>\\3Vp\u001051gcyWˎ,w\t\u0004UG\u0012V\u001e'v͓sԿǴ\f\u000e9>;gN\u001b\u001a^pK+kDc=\u0006C-I\u001b\u0015ϟ\u0010\t_N\u007f-\u0013[6#/͙Qab]x\u00171S&\"afN\u000f`_\u001a[Mm2Dr\u0004:\u0004^\u0013.\u0002ɨ\u0015.\u001dy}[߶\"ܩȠ\u0006HJ=?\u0012n?kkhGny5ݫ֖.\t\u00123\r\u0001\u0013EhZh.!MJ\u03815\u00108\u001f&\\\u0006\u00179+ P_h\u0018Ҕ{+P%wrE5\u0007k<qibA\u0012ic>?\u001b&\"RTh\u0015ZvB\u0002ێ\tnX(8Hxn\u0010{rQ<\u00198?\u007f{L,_\u001c\r\u001bN\u0003,#Y|7b!Ӑʐ\u0003T9\u0006Kw2W!\u0001~(!su\\a,+gh-\nvCe>[2jD|QȔ-\u00060MmLU,\u0005\u0016$X,&\u001c\u001aG2G=A\u0012Eǻɨ\u0006-K1;\u0006_3*')H\"\u000fim^q\u0016E\t2plZO\u0003ϟPD\u000fv1h|\u007f(d\rz\u0018ub\u0014s>w|9\u0018\u0013ѿ:٫\t#6'\u0007z0\t\u0006<Q45\u0016&\u001eeY˸am\b0\u007fp\u001d2Et\u0012;{\u0016\u001el\b\"щ?<a[\u0005N00=\u0018PY\u0003}\u0018D\u00194;ΉvS\u001b5ެ<Q#1\u0004y\u0015@]\u007fdpR\u0013\u001e\u0005jrʡ.w[\u007f\u001atQ<a[a\u007f\u0006oa[9ͧeϛ\u0017֭5n\u001aΒ\u000e/dpz\t^ ֯\u001c<Iݥz\u0007B$2P|T\u0016([T\u0018\tfĀ\fʮc\u001b\u001fϨZuAt\u001cs\u0019^\\h\u0013\u0002\u0016r/L\u0019~=6T9\f̐\u0007֪JXGe8#a<Y*xr\u0017fS.z\u0019ۆ\u001f,p\u0003\u0011hkb\u001a\u0014D(_)\u001cn&J\u000f\u008f~ܫF\u001c3;W6m\u0016\u0001p\u0019{|N\u0013yH%)Ɗ$Ĺ\u0003~\u0015\u0010B1\u001d*i^\u0001\u0018z-zw.{ƴ\u001e\u0005/F/1\u001a(4X)1\u001e5[B ݞ\u0016ր\u007f][Ȍ\u0016\n&L51E0jY&f8`Ό>\u001cyдz\u0004\u000fA^?T@Xt\u000b\n\\\t\rП\u0004ג\u0006\u0019f̏\u0004y'o5[=\u0017P|\u0001z b\u001b̙%\u001a̦\u0007jIX\u007f!;\u0004m\u001e5\u0002F\u0013\u0007\u0010pU؟\u001fǅԲ~\u0013ޞ*#N\nh_\u001e\u00074}~$g[;`e0̈́`ɵŁQ\u001dݼ#}\u000e\u00060\u000e6L\fk[x|\t\u000b\"x\u001cҋ]ȥݣcsצ-\u0018\u0015\u0001N\u001a\u001fJ\u0005^\u0001Z|5G\u001b/[;ӑ\u000f\u0019:\u0004 \u008f#ܳVC398H}<G\"\u0011xzv\u0016)pH)D\u05ff01^VCZ5\u001bt\u0003rE>Ks{xLѭ\u0010Àƪ.Yߣ$Bt\u001c\"\u007f_j\u0012(\u001fF-84y=]ǝnUk'0G\u000b\r]Q\b7\u0004:\">I܍1ތs!_ƠS';-Z>ڇ\u0002nR\u0002Sޱr=`4I;dɳ}<"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "", "=tc2e\u001a>[\u0015\b\nb*\u000bq9d\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", ";da4\\5@3\"zwe,{", "", ":`h<h;']\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "Cm\\2e.>Rv\t\u0004_0~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2sB\b\u001f7C\u000b\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\Rue\\q=]xV\"X;\u001cmc@$D+3(\u00079S\u0006:{J\n \u0016@t~B  KC#uI%qU]]\b\u0011/Ej&m\u001bc\u001bj\u0018D-\u0015u\u001b+uL=\u000e\u0006\\f6C", "0nd;W:\"\\\u0004z\b^5\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "5dc\u000fb<GR'b\u0004I(\n\t8t>8\u007f:\u000e\u0017\u001eGk\u001c<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|k", "0nd;W:\"\\\u0006\t\u0005m", "5dc\u000fb<GR'b\u0004K6\u0007\u0018", "0nd;W:\"\\\u000b\u0003\u0004]6\u000f", "5dc\u000fb<GR'b\u0004P0\u0006\b9w", "1gX9W9>\\", "", "5dc\u0010[0ER&~\u0004", "u(;7T=:\u001d)\u000e~euc\r=tU", "1n]3\\.", "5dc\u0010b5?W\u001b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\u000e7u\u00127\\G9y\u0012(\u001eie;\u0017p(]z1P\"", "4`Z2A6=S\u0004z\b^5\f", "7c", "", "5dc\u0016W", "u(8", "7r5.^,", "7r5.^,|c\u001dx\b^3|\u0005=e", "u(I", "Adc\u0013T2>\u0012)\u0003tk,\u0004\t+s\u007f", "uY\u0018#", "7r<2e.B\\\u001blzf(\u0006\u00183c\u000e\u0012|\u001f\u0001%\u0015Gx\r8\u007f4C", "7rA<b;", "7rC?T5L^\u0015\fzg;", "7rC?T5L^\u0015\fzg;;\u00193_\r(\u0003@|%\u0017", "7rD;`,KU\u0019}a^(}q9d\u007f", "7rD;`,KU\u0019}a^(}q9d\u007ff\fDz$\u0017No\nJv", ":`h<h;\"\\\u001a\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u001bv\u00178#", "5dc\u0019T@Hc(b\u0004_6", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|y7NM\u0011", "5dc\u0019T@Hc(g\u0005],;\u00193_\r(\u0003@|%\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.#", "5dc\u001aX9@W\"\u0001Zg(y\u0010/d", "5dc\u001ch;>`\u0007~\u0003Z5\f\r-sh2z@?'\u001bA|\u000eCv!CY", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B\u0018f*6mk", ">`a2a;", "5dc\u001dT9>\\(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\u000e7u\u00127\\G9y\u001d(\u0014h7", ">nb6g0H\\|\bgh6\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u001db:Bb\u001d\t\u0004B5i\u00139tG\tG\u001ePs\t\u0012", "u(9", ">nb6g0H\\|\blb5{\u0013A", "5dc\u001db:Bb\u001d\t\u0004B5n\r8d\n:C!Ltf$aX", ">nb6g0H\\\u0003\bh\\9|\t8", "5dc\u001db:Bb\u001d\t\u0004H5j\u0007<e\u007f1C!Ltf$aX", "@d_9T*>Rv\u0002~e+\n\t8", "5dc\u001fX7EO\u0017~y</\u0001\u0010.r\u007f1:P\u0005\u0011$Gv\u000e8\u0005%", "@n^A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9zF\u00014\u0016c\u000b\u000f7{%\u0004", "5dc\u001fb6M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006c/?h^*D\\\u0016<\\\u0019", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "Bnd0[\tHc\"}\tB5i\u00139t", "5dc!b<<Vu\t\u000bg+\u000bl8R\n2\u000b", "5dc\"a4>`\u001b~y<6\u0006\n3g>8\u007f:\u000e\u0017\u001eGk\u001c<", "1n_FJ0MV\u0001~\b`0\u0006\u000b\u000fn{%\u0003@\u007f", "1n_FJ0MV\u0001~\b`0\u0006\u000b\u000fn{%\u0003@\u007fU'Ki\u001b<}%1g}", "3lXA9(DS\u0002\ty^:", "", "Cm\\2e.>Rv\u0002~e+\n\t8", "", "4`Z2F,FO\"\u000e~\\:e\u0013.e", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", ">q^=X9MW\u0019\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "4`Z2F,FO\"\u000e~\\:e\u0013.eG<\u0007T\u0004\u001a\u001b#", "4h]166H`\u0018\u0003\u0004Z;\u0007\u0016\u001eoa(\u000b\u001d\u000b' F}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "4h]166H`\u0018\u0003\u0004Z;\u0007\u0016\u001eoa(\u000b\u001d\u000b' F}LLz\u001fBY\u0005 3{\u0016", "4h]1B5>:\u0015\u0013zk\u0016}p/r\u0002,\u0005Bn\u0017\u001fCx\u001d@t3\u001ec| E", ":hbA", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/P\n6\u007fO\u0005! ", "/kX4a4>\\(e~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "7mR9h+>@\u0019\n\u0002Z*|\b\u001de\b$\u0005O\u0005\u0015%", "7mR9h+>4\u0015\u0005zG6{\t=", "7mR9h+>2\u0019zxm0\u000e\u0005>e~\u0011\u0006?\u0001%", "5dc\u0010[0ER&~\u0004\u001d<\u0001\u0003<e\u0007(wN\u0001", ";da4X\nH\\\u001a\u0003|", ";da4X+\u001c]\"\u007f~`", "Cm\\2e.>Rv\u0002~e+\n\t8$\u0010,uM\u0001\u001e\u0017C}\u000e", "4h[9B5>:\u0015\u0013zk\u0016}v/m{1\u000bD~%\tTk\u0019Gv2C", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SemanticsNode {
    public static final int $stable = 8;
    private SemanticsNode fakeNodeParent;
    private final int id;
    private boolean isFake;
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;
    private final Modifier.Node outerSemanticsNode;
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNode(Modifier.Node node, boolean z2, LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        this.outerSemanticsNode = node;
        this.mergingEnabled = z2;
        this.layoutNode = layoutNode;
        this.unmergedConfig = semanticsConfiguration;
        this.id = layoutNode.getSemanticsId();
    }

    public final Modifier.Node getOuterSemanticsNode$ui_release() {
        return this.outerSemanticsNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    public final LayoutNode getLayoutNode$ui_release() {
        return this.layoutNode;
    }

    public final SemanticsConfiguration getUnmergedConfig$ui_release() {
        return this.unmergedConfig;
    }

    public final boolean isFake$ui_release() {
        return this.isFake;
    }

    public final void setFake$ui_release(boolean z2) {
        this.isFake = z2;
    }

    public final boolean isUnmergedLeafNode$ui_release() {
        return !this.isFake && getReplacedChildren$ui_release().isEmpty() && SemanticsNodeKt.findClosestParentNode(this.layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$isUnmergedLeafNode$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(LayoutNode layoutNode) {
                SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
                boolean z2 = false;
                if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isMergingSemanticsOfDescendants()) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }) == null;
    }

    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    public final RootForTest getRoot() {
        Owner owner$ui_release = this.layoutNode.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release.getRootForTest();
        }
        return null;
    }

    public final int getId() {
        return this.id;
    }

    public final Rect getTouchBoundsInRoot() {
        Modifier.Node node;
        if (this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            DelegatableNode outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
            if (outerMergingSemantics == null) {
                outerMergingSemantics = this.outerSemanticsNode;
            }
            node = outerMergingSemantics;
        } else {
            node = this.outerSemanticsNode;
        }
        return SemanticsModifierNodeKt.touchBoundsInRoot(node.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.unmergedConfig));
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m5944getSizeYbymL2g() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        return nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null ? nodeCoordinatorFindCoordinatorToGetBounds$ui_release.mo5522getSizeYbymL2g() : IntSize.Companion.m6813getZeroYbymL2g();
    }

    public final Rect getBoundsInRoot() {
        Rect rectBoundsInRoot;
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null && (rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(nodeCoordinatorFindCoordinatorToGetBounds$ui_release)) != null) {
                return rectBoundsInRoot;
            }
        }
        return Rect.Companion.getZero();
    }

    /* JADX INFO: renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m5941getPositionInRootF1C5BW0() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInRoot(nodeCoordinatorFindCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.Companion.m3953getZeroF1C5BW0();
    }

    public final Rect getBoundsInWindow() {
        Rect rectBoundsInWindow;
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null && (rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(nodeCoordinatorFindCoordinatorToGetBounds$ui_release)) != null) {
                return rectBoundsInWindow;
            }
        }
        return Rect.Companion.getZero();
    }

    /* JADX INFO: renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m5942getPositionInWindowF1C5BW0() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInWindow(nodeCoordinatorFindCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.Companion.m3953getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m5943getPositionOnScreenF1C5BW0() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionOnScreen(nodeCoordinatorFindCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.Companion.m3953getZeroF1C5BW0();
    }

    public final Rect getBoundsInParent$ui_release() {
        LayoutCoordinates coordinates;
        SemanticsNode parent = getParent();
        if (parent == null) {
            return Rect.Companion.getZero();
        }
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui_release = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null && (coordinates = nodeCoordinatorFindCoordinatorToGetBounds$ui_release.getCoordinates()) != null) {
                return LayoutCoordinates.localBoundingBoxOf$default(DelegatableNodeKt.m5636requireCoordinator64DMado(parent.outerSemanticsNode, NodeKind.m5749constructorimpl(8)), coordinates, false, 2, null);
            }
        }
        return Rect.Companion.getZero();
    }

    public final boolean isTransparent$ui_release() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            return nodeCoordinatorFindCoordinatorToGetBounds$ui_release.isTransparent();
        }
        return false;
    }

    public final int getAlignmentLinePosition(AlignmentLine alignmentLine) {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui_release != null) {
            return nodeCoordinatorFindCoordinatorToGetBounds$ui_release.get(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    public final SemanticsConfiguration getConfig() {
        if (isMergingSemanticsOfDescendants()) {
            SemanticsConfiguration semanticsConfigurationCopy = this.unmergedConfig.copy();
            mergeConfig(semanticsConfigurationCopy);
            return semanticsConfigurationCopy;
        }
        return this.unmergedConfig;
    }

    private final void mergeConfig(SemanticsConfiguration semanticsConfiguration) {
        if (this.unmergedConfig.isClearingSemantics()) {
            return;
        }
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, false, 3, null);
        int size = listUnmergedChildren$ui_release$default.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode = (SemanticsNode) listUnmergedChildren$ui_release$default.get(i2);
            if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                semanticsConfiguration.mergeChild$ui_release(semanticsNode.unmergedConfig);
                semanticsNode.mergeConfig(semanticsConfiguration);
            }
        }
    }

    private final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.isMergingSemanticsOfDescendants();
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode semanticsNode, boolean z2, boolean z3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            z2 = false;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z3 = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z2, z3);
    }

    public final List<SemanticsNode> unmergedChildren$ui_release(boolean z2, boolean z3) {
        if (this.isFake) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        fillOneLayerOfSemanticsWrappers(this.layoutNode, arrayList, z3);
        if (z2) {
            emitFakeNodes(arrayList);
        }
        return arrayList;
    }

    private final void fillOneLayerOfSemanticsWrappers(LayoutNode layoutNode, List<SemanticsNode> list, boolean z2) {
        MutableVector<LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode2 = content[i2];
                if (layoutNode2.isAttached() && (z2 || !layoutNode2.isDeactivated())) {
                    if (layoutNode2.getNodes$ui_release().m5710hasH91voCI$ui_release(NodeKind.m5749constructorimpl(8))) {
                        list.add(SemanticsNodeKt.SemanticsNode(layoutNode2, this.mergingEnabled));
                    } else {
                        fillOneLayerOfSemanticsWrappers(layoutNode2, list, z2);
                    }
                }
                i2++;
            } while (i2 < size);
        }
    }

    public final List<SemanticsNode> getChildren() {
        return getChildren$ui_release$default(this, false, false, false, 7, null);
    }

    public final List<SemanticsNode> getReplacedChildren$ui_release() {
        return getChildren$ui_release$default(this, false, true, false, 4, null);
    }

    public static /* synthetic */ List getChildren$ui_release$default(SemanticsNode semanticsNode, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = !semanticsNode.mergingEnabled;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z3 = false;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            z4 = false;
        }
        return semanticsNode.getChildren$ui_release(z2, z3, z4);
    }

    public final List<SemanticsNode> getChildren$ui_release(boolean z2, boolean z3, boolean z4) {
        if (!z2 && this.unmergedConfig.isClearingSemantics()) {
            return CollectionsKt.emptyList();
        }
        if (isMergingSemanticsOfDescendants()) {
            return findOneLayerOfMergingSemanticsNodes$default(this, null, 1, null);
        }
        return unmergedChildren$ui_release(z3, z4);
    }

    public final boolean isRoot() {
        return getParent() == null;
    }

    public final SemanticsNode getParent() {
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNodeFindClosestParentNode = this.mergingEnabled ? SemanticsNodeKt.findClosestParentNode(this.layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(LayoutNode layoutNode) {
                SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
                boolean z2 = false;
                if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isMergingSemanticsOfDescendants()) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }) : null;
        if (layoutNodeFindClosestParentNode == null) {
            layoutNodeFindClosestParentNode = SemanticsNodeKt.findClosestParentNode(this.layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$2
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(LayoutNode layoutNode) {
                    return Boolean.valueOf(layoutNode.getNodes$ui_release().m5710hasH91voCI$ui_release(NodeKind.m5749constructorimpl(8)));
                }
            });
        }
        if (layoutNodeFindClosestParentNode == null) {
            return null;
        }
        return SemanticsNodeKt.SemanticsNode(layoutNodeFindClosestParentNode, this.mergingEnabled);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            list = new ArrayList();
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> list) {
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, false, 3, null);
        int size = listUnmergedChildren$ui_release$default.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode = (SemanticsNode) listUnmergedChildren$ui_release$default.get(i2);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.isClearingSemantics()) {
                semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
            }
        }
        return list;
    }

    public final NodeCoordinator findCoordinatorToGetBounds$ui_release() {
        if (this.isFake) {
            SemanticsNode parent = getParent();
            if (parent != null) {
                return parent.findCoordinatorToGetBounds$ui_release();
            }
            return null;
        }
        DelegatableNode outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
        if (outerMergingSemantics == null) {
            outerMergingSemantics = this.outerSemanticsNode;
        }
        return DelegatableNodeKt.m5636requireCoordinator64DMado(outerMergingSemantics, NodeKind.m5749constructorimpl(8));
    }

    private final void emitFakeNodes(List<SemanticsNode> list) {
        final Role role = SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.isMergingSemanticsOfDescendants() && !list.isEmpty()) {
            list.add(m5940fakeSemanticsNodeypyhhiA(role, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, role.m5932unboximpl());
                }
            }));
        }
        if (this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getContentDescription()) && !list.isEmpty() && this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            List list2 = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, SemanticsProperties.INSTANCE.getContentDescription());
            final String str = list2 != null ? (String) CollectionsKt.firstOrNull(list2) : null;
            if (str != null) {
                list.add(0, m5940fakeSemanticsNodeypyhhiA(null, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final SemanticsNode m5940fakeSemanticsNodeypyhhiA(Role role, Function1<? super SemanticsPropertyReceiver, Unit> function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(false);
        function1.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(function1), false, new LayoutNode(true, role != null ? SemanticsNodeKt.roleFakeNodeId(this) : SemanticsNodeKt.contentDescriptionFakeNodeId(this)), semanticsConfiguration);
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    public final SemanticsNode copyWithMergingEnabled$ui_release() {
        return new SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }
}
