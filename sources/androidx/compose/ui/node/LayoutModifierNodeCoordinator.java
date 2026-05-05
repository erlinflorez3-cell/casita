package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0001\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN3ZS@\u000fs{:'c$\bCCU \u0002*\teNogtNb\u000bQ\u0015\u000eǝ\u0001jBI]ތe\u0012\u001d2JoE6UoS9ht<\u000b(288\u0002ڎ\t\u001a@H\u0018v\u0001CS\f(0H\u0081BR\u001bR\r܅\u001a\u0006T \t\u001ergV6^le:5(\t݃X÷E%`|{\f~TlS7t./N7M\u0015ST\u0013\u000b`]W\u0003mtݘ\th5+sW\u0002xNX.6E/]0urT\u0001Ke)\u00125PgcyvT<@\t\n4T\u0004<(WL<U2f60y\t;aNy\u001a^p\"+eDA=\u007faM\u007f//iof1Ne(5\u0011,P\u0019nOi\u001b\"ؤ\u0014Ñƻ{S7\u007fNl\u0011\\\u0018\nUm2\u0013\u0013\u00068,HG.QB%v%3hs9QC\u001c\u0006Vn\u007fv3\u0003/g2XVr:nD]p\tTrR\u0018\u001dk~z\t0\u001f\u00024T538\u0019.\u0013\u0010>7$>\u0006\u0016|2&[\u0016\"%]\rg]|%&Wg\u0019c9_\u001f(a\u00013DVJ \u001dkvDc\f\t\u001c8$BH\u00196\u000ezr\rܟ\u00172E2bFв0ǉÅ\u0019J\t_P\u0004E1m\u0013\u0001\u0010-zc(\u0011#<t7;\u0001`~+\u007fxwh-d0pYQcPlgʡgؔč'\t\u00055\u000e\f8ZUQ\u0005\u0018\fT*&l֠Eֺ3=\u001bÁOK@\nEEzu\u0016U[\u0019?z+|My?ֲsŰn|4ߌ\u0003LU]%,\u0017`x.\u0016pP\u001aoS\u0013IyS9i\u0015ε~ľXߢӷ7{ġ#*-˚\b$\u0003D;SG\u001f\u001c\t\"Ae\bk~\b0\u0010a=:%k\u0012?{\u0018\u0006a\u007fqp\u000e\u000fՕe˽B.,З\u001bDN\u0001\u0006\u001fb\u000b:%Aa\u0012v~pPM9J4;]Մ\u000f\u0080Z_R\u0015u\u001aBK09\u0002a\u0016\u0014\rB[UߠWk\u0006oQ{\u0019j\u05fd\n\u0014\u00044t݀8k\u001f^Wh(ޞ\n;"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001errkF\u0006g5J\u00061T\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", ":`h<h;']\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", ";dP@h9><#}z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u00044?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&[|<\u0014[A\nb5\u001d\u0014AK#rE;\u001f\u0015\u0015S\u0001;>D|", "/o_?b(<V\u0001~vl<\n\t\u001dc\n3{", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p}.IQKx4\f\u0013rl9jk7UL", "D`[BX", ":`h<h;&]\u0018\u0003{b,\nq9d\u007f", "5dc\u0019T@Hc(f\u0005]0}\r/rh2z@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/\u001fw\u00152NG;x\u001d(\u0014h7", "Adc\u0019T@Hc(f\u0005]0}\r/rh2z@?'\u001bA|\u000eCv!CY", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\bAl\u001a/QCHT>\u001d\u0015>%*", ":n^8T/>O\u0018\\\u0005g:\f\u0016+i\t7\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u0019b6DO\u001c~v]\n\u0007\u0012=t\r$\u007fI\u0010%^&a}?\t\u000bG\u0018\u000e$1z\u00165M?Ik", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006T/>g\r-3q\u001f=[\u0019", "Adc\u0019b6DO\u001c~v]\n\u0007\u0012=t\r$\u007fI\u0010%^A]!\fi,\u001d\u0018\u000e$1z\u00165M?Ik", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001a\u0001.Ch\u000b\u001c;v%<#\u0007,", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6L\u00165ME7z4s", ":n^8T/>O\u0018]ze,~\u0005>e", "5dc\u0019b6DO\u001c~v]\u000b|\u0010/g{7{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]/?_y#7i\u0015\rMJ;m0-\u0015>", "Adc\u0019b6DO\u001c~v]\u000b|\u0010/g{7{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#\u0001/;U\u0001 3lt.TC=gC\u001ej,R", "B`X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "5dc!T0E", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B\u0018f*6mk", "EqP=c,=<#\bcn3\u0004", "5dc$e(I^\u0019}ch5e\u00196l", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Y[*Az\u00152V?JuAs", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001", "", "/kX4a4>\\(e~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "3mbBe,%]#\u0005va,x\b\u000ee\u0007(}<\u0010\u0017tTo\nKv$", "", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1n]@g9:W\"\u000e\t", ";dP@h9>\u001bukik@\u0007S", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Nk\"F\u00074~D\u0005\u001c5m\u0012+TC\u0011", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "=m03g,K> zx^\b\f", ">da3b9F2&z\r", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "5qP=[0<a\u007fz\u000f^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", ">kP0X\bM", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "HH]1X?", "", ":`h2e\tE]\u0017\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X\bM\u001b\u001aQ\u000eO\u000e\u0006\u0013", "uI5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1\u0007", ":`h2e", "uI5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG'3\u0002\u0016;\u0017%Hg?!\u0019fo \u0003w,[Lj8", "\u0011n\\=T5B]\"", "\u001an^8T/>O\u0018]ze,~\u0005>e`2\t'|+!W~uFu)6]}- w\u0015.", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Paint modifierBoundsPaint;
    private ApproachMeasureScopeImpl approachMeasureScope;
    private LayoutModifierNode layoutModifierNode;
    private Constraints lookaheadConstraints;
    private LookaheadDelegate lookaheadDelegate;

    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        this.layoutModifierNode = layoutModifierNode;
        ApproachMeasureScopeImpl approachMeasureScopeImpl = null;
        this.lookaheadDelegate = layoutNode.getLookaheadRoot$ui_release() != null ? new LookaheadDelegateForLayoutModifierNode() : null;
        Modifier.Node node = layoutModifierNode.getNode();
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(512);
        int kindSet$ui_release = node.getKindSet$ui_release();
        if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0) {
            Intrinsics.checkNotNull(layoutModifierNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) layoutModifierNode);
        }
        this.approachMeasureScope = approachMeasureScopeImpl;
    }

    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    public final void setLayoutModifierNode$ui_release(LayoutModifierNode layoutModifierNode) {
        if (!Intrinsics.areEqual(layoutModifierNode, this.layoutModifierNode)) {
            if ((-1) - (((-1) - layoutModifierNode.getNode().getKindSet$ui_release()) | ((-1) - NodeKind.m5749constructorimpl(512))) != 0) {
                Intrinsics.checkNotNull(layoutModifierNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) layoutModifierNode;
                ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
                if (approachMeasureScopeImpl != null) {
                    approachMeasureScopeImpl.setApproachNode(approachLayoutModifierNode);
                } else {
                    approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, approachLayoutModifierNode);
                }
                this.approachMeasureScope = approachMeasureScopeImpl;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator wrapped$ui_release = getWrapped$ui_release();
        Intrinsics.checkNotNull(wrapped$ui_release);
        return wrapped$ui_release;
    }

    /* JADX INFO: renamed from: getLookaheadConstraints-DWUhwKw$ui_release */
    public final Constraints m5660getLookaheadConstraintsDWUhwKw$ui_release() {
        return this.lookaheadConstraints;
    }

    /* JADX INFO: renamed from: setLookaheadConstraints-_Sx5XlM$ui_release */
    public final void m5661setLookaheadConstraints_Sx5XlM$ui_release(Constraints constraints) {
        this.lookaheadConstraints = constraints;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007f\u0007lmA0ZeP\u008cZS@\u000fs{:'aҘsYП\u0006\u001a,!IRɁkg|J#\u0019Q\u0010\u001e\u0016'l\\Mc{u\u0012=6\t\u0004\bA[tU9\u000fvf\t.8:8(\u0007G.rV\u001e}\u0013Cy\u000eB4NxRR;OK.Z\u001eL)\u0019\u001e\u000bq~:Vwu:]/I}ƢMϋۢ4~S\u001aTbo\u001b\u0005p6+n9e\u00193Y\u001b\u0007\u0001]\u0006\u0017\b\u007fK\u0015\u0001'U-ywe>p\u007fB\u0017qc\u0558]w._\u000bŋ|:&ˬSt"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001errkF\u0006g5J\u00061T\u000b56fXn@\u0014\u000eYlN2\r\u0007UP$OND\u0006\u0004@S\u0012JP\u000b\u000b\u001a\u000f9j}+`\u000fGO", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6L\u00165ME7z4s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\bAl\u001a/QCHT>\u001d\u0015FkC\u0014b0Wr6QY$oM", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001", "", "/kX4a4>\\(e~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bukik@\u0007S", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Nk\"F\u00074~D\u0005\u001c5m\u0012+TC\u0011", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo5514measureBRTryo0(long j2) {
            LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode = this;
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            lookaheadDelegateForLayoutModifierNode.m5577setMeasurementConstraintsBRTryo0(j2);
            layoutModifierNodeCoordinator.m5661setLookaheadConstraints_Sx5XlM$ui_release(Constraints.m6579boximpl(j2));
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            lookaheadDelegateForLayoutModifierNode.set_measureResult(layoutModifierNodeCoordinator.getLayoutModifierNode().mo428measure3p2s80s(this, lookaheadDelegate, j2));
            return lookaheadDelegateForLayoutModifierNode;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            int iCalculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(iCalculateAlignmentAndPlaceChildAsNeeded));
            return iCalculateAlignmentAndPlaceChildAsNeeded;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i2) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, i2);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i2) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, i2);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i2) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, i2);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i2) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, i2);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateForLayoutModifierNode());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00ae  */
    @Override // androidx.compose.ui.layout.Measurable
    /* JADX INFO: renamed from: measure-BRTryo0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.ui.layout.Placeable mo5514measureBRTryo0(long r7) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutModifierNodeCoordinator.mo5514measureBRTryo0(long):androidx.compose.ui.layout.Placeable");
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            return approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), i2);
        }
        return this.layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            return approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), i2);
        }
        return this.layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            return approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), i2);
        }
        return this.layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            return approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), i2);
        }
        return this.layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), i2);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo5575placeAtf8xVGno(long j2, float f2, GraphicsLayer graphicsLayer) {
        super.mo5575placeAtf8xVGno(j2, f2, graphicsLayer);
        onAfterPlaceAt();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo5515placeAtf8xVGno(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
        super.mo5515placeAtf8xVGno(j2, f2, function1);
        onAfterPlaceAt();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onAfterPlaceAt() {
        /*
            r6 = this;
            boolean r0 = r6.isShallowPlacing$ui_release()
            if (r0 == 0) goto L7
            return
        L7:
            r6.onPlaced()
            androidx.compose.ui.layout.ApproachMeasureScopeImpl r3 = r6.approachMeasureScope
            r4 = 0
            if (r3 == 0) goto L71
            androidx.compose.ui.layout.ApproachLayoutModifierNode r2 = r3.getApproachNode()
            androidx.compose.ui.layout.Placeable$PlacementScope r1 = r6.getPlacementScope()
            androidx.compose.ui.node.LookaheadDelegate r0 = r6.getLookaheadDelegate()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            androidx.compose.ui.layout.LookaheadLayoutCoordinates r0 = r0.getLookaheadLayoutCoordinates()
            androidx.compose.ui.layout.LayoutCoordinates r0 = (androidx.compose.ui.layout.LayoutCoordinates) r0
            boolean r0 = r2.isPlacementApproachInProgress(r1, r0)
            if (r0 != 0) goto L82
            boolean r0 = r3.getApproachMeasureRequired$ui_release()
            if (r0 != 0) goto L82
            long r2 = r6.mo5522getSizeYbymL2g()
            androidx.compose.ui.node.LookaheadDelegate r0 = r6.getLookaheadDelegate()
            r5 = 0
            if (r0 == 0) goto L80
            long r0 = r0.m5696getSizeYbymL2g$ui_release()
            androidx.compose.ui.unit.IntSize r0 = androidx.compose.ui.unit.IntSize.m6800boximpl(r0)
        L43:
            boolean r0 = androidx.compose.ui.unit.IntSize.m6805equalsimpl(r2, r0)
            if (r0 == 0) goto L82
            androidx.compose.ui.node.NodeCoordinator r0 = r6.getWrappedNonNull()
            long r2 = r0.mo5522getSizeYbymL2g()
            androidx.compose.ui.node.NodeCoordinator r0 = r6.getWrappedNonNull()
            androidx.compose.ui.node.LookaheadDelegate r0 = r0.getLookaheadDelegate()
            if (r0 == 0) goto L63
            long r0 = r0.m5696getSizeYbymL2g$ui_release()
            androidx.compose.ui.unit.IntSize r5 = androidx.compose.ui.unit.IntSize.m6800boximpl(r0)
        L63:
            boolean r0 = androidx.compose.ui.unit.IntSize.m6805equalsimpl(r2, r5)
            if (r0 == 0) goto L82
            r1 = 1
        L6a:
            androidx.compose.ui.node.NodeCoordinator r0 = r6.getWrappedNonNull()
            r0.setForcePlaceWithLookaheadOffset$ui_release(r1)
        L71:
            androidx.compose.ui.layout.MeasureResult r0 = r6.getMeasureResult$ui_release()
            r0.placeChildren()
            androidx.compose.ui.node.NodeCoordinator r0 = r6.getWrappedNonNull()
            r0.setForcePlaceWithLookaheadOffset$ui_release(r4)
            return
        L80:
            r0 = r5
            goto L43
        L82:
            r1 = r4
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutModifierNodeCoordinator.onAfterPlaceAt():void");
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.getCachedAlignmentLine$ui_release(alignmentLine) : LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        getWrappedNonNull().draw(canvas, graphicsLayer);
        if (LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            drawBorder(canvas, modifierBoundsPaint);
        }
    }

    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001errkF\u0006g5J\u00061T\u000b,6d]nF\u0018\u001ccc", "", "u(E", ";nS6Y0>`u\t\u000bg+\u000bs+i\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "5dc\u001ab+BT\u001d~\b;6\r\u0012.sj$\u007fI\u0010", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001c;v%\u0004", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.modifierBoundsPaint;
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo4057setColor8_81llA(Color.Companion.m4205getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo4061setStylek9PVt8s(PaintingStyle.Companion.m4446getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }
}
