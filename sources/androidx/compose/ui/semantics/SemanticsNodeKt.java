package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!4i\bDZc|\u0004G\u00078\u000bDB\u0007\"B\u0012\u007f\u0007lmA0RnP.XS2\u000fy\u0002<$a$yCQU\"}(\tgduo\u0007J\t\u0010s\u0013\u0014\u001f\u0011jZI\u0006|k\u001c'2pz\u0006\u074ce\u0010KAxtd\nP60D\u0012\u0005/\u0019ZL\u001e\u0001\u0013Cy\u0017B6FpH[%M3\u001aXßV*\u000f+tg|Dpl\f?u#\u001b\nP]?aF{{\rnTU\r'q,;XCE\u00175S1\u0007b]O\u0003m|k\u0016/ѧ?5W\u0006o6\u0007\u000e<\u0015YTS]\u0013>jӤib\"&YN\fK~\u000e^6Qԉ\u000fʀ\b\u0012\u001e)N/;\u001c\u0007 \u001c6\rti?~\u0006\u0007B.\u007f\u0018vmӞ\u0002Ĵ/=3hWgI ״;\u000f"}, d2 = {"=tc2e\u0014>`\u001b\u0003\u0004`\u001a|\u0011+n\u000f,yN", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9{<~!>h\u0002\u001eEU -QD?kA\u0007\u001fga\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "5dc\u001ch;>`\u0001~\b`0\u0006\u000b\u001de\b$\u0005O\u0005\u0015%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0004\u0011*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001c{G\u0013\u0012${N3\t\u000ehE\"|,A\u001e\f-M\u0002HQ\u000b\u000b\u0016c", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "5dc\u001fb3>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIT>\u001d\u0015>% \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRt\u001b\u0005a=-}H5-Q\u0019S\t;>", "!d\\.a;BQ'g\u0005],", ":`h<h;']\u0018~", ";da4\\5@3\"zwe,{", "", "=tc2e\u001a>[\u0015\b\nb*\u000bq9d\u007f", "1n]AX5M2\u0019\rxk0\b\u00183o\t\twF\u0001\u007f!Foq;", "", "4h]163Ha\u0019\r\nI(\n\t8th2z@", "Ad[2V;H`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@n[29(DS\u0002\ty^\u0010{", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SemanticsNodeKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x002e A[EDGE_INSN: B:100:0x002e->B:70:0x002e BREAK  A[LOOP:0: B:62:0x001c->B:98:0x00a0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a0 A[LOOP:0: B:62:0x001c->B:98:0x00a0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.semantics.SemanticsNode SemanticsNode(androidx.compose.ui.node.LayoutNode r10, boolean r11) {
        /*
            androidx.compose.ui.node.NodeChain r2 = r10.getNodes$ui_release()
            r0 = 8
            int r9 = androidx.compose.ui.node.NodeKind.m5749constructorimpl(r0)
            int r0 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r2)
            int r1 = (-1) - r0
            int r0 = (-1) - r9
            r1 = r1 | r0
            int r0 = (-1) - r1
            r5 = 0
            if (r0 == 0) goto L2e
            androidx.compose.ui.Modifier$Node r8 = r2.getHead$ui_release()
        L1c:
            if (r8 == 0) goto L2e
            int r0 = r8.getKindSet$ui_release()
            r0 = r0 & r9
            if (r0 == 0) goto L93
            r7 = r8
            r6 = r5
        L27:
            if (r7 == 0) goto L93
            boolean r0 = r7 instanceof androidx.compose.ui.node.SemanticsModifierNode
            if (r0 == 0) goto L44
            r5 = r7
        L2e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            androidx.compose.ui.node.SemanticsModifierNode r5 = (androidx.compose.ui.node.SemanticsModifierNode) r5
            androidx.compose.ui.Modifier$Node r2 = r5.getNode()
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r10.getCollapsedSemantics$ui_release()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.compose.ui.semantics.SemanticsNode r0 = new androidx.compose.ui.semantics.SemanticsNode
            r0.<init>(r2, r11, r10, r1)
            return r0
        L44:
            int r0 = r7.getKindSet$ui_release()
            int r1 = (-1) - r0
            int r0 = (-1) - r9
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L8e
            boolean r0 = r7 instanceof androidx.compose.ui.node.DelegatingNode
            if (r0 == 0) goto L8e
            r0 = r7
            androidx.compose.ui.node.DelegatingNode r0 = (androidx.compose.ui.node.DelegatingNode) r0
            androidx.compose.ui.Modifier$Node r4 = r0.getDelegate$ui_release()
            r3 = 0
            r2 = r3
        L5e:
            r1 = 1
            if (r4 == 0) goto L8b
            int r0 = r4.getKindSet$ui_release()
            r0 = r0 & r9
            if (r0 == 0) goto L6d
            int r2 = r2 + 1
            if (r2 != r1) goto L72
            r7 = r4
        L6d:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            goto L5e
        L72:
            if (r6 != 0) goto L7d
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            r0 = 16
            androidx.compose.ui.Modifier$Node[] r0 = new androidx.compose.ui.Modifier.Node[r0]
            r6.<init>(r0, r3)
        L7d:
            if (r7 == 0) goto L85
            if (r6 == 0) goto L84
            r6.add(r7)
        L84:
            r7 = r5
        L85:
            if (r6 == 0) goto L6d
            r6.add(r4)
            goto L6d
        L8b:
            if (r2 != r1) goto L8e
            goto L27
        L8e:
            androidx.compose.ui.Modifier$Node r7 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L27
        L93:
            int r0 = r8.getAggregateChildKindSet$ui_release()
            int r1 = (-1) - r0
            int r0 = (-1) - r9
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L2e
            androidx.compose.ui.Modifier$Node r8 = r8.getChild$ui_release()
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsNodeKt.SemanticsNode(androidx.compose.ui.node.LayoutNode, boolean):androidx.compose.ui.semantics.SemanticsNode");
    }

    public static /* synthetic */ SemanticsNode SemanticsNode$default(SemanticsModifierNode semanticsModifierNode, boolean z2, LayoutNode layoutNode, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            layoutNode = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode);
        }
        return SemanticsNode(semanticsModifierNode, z2, layoutNode);
    }

    public static final SemanticsNode SemanticsNode(SemanticsModifierNode semanticsModifierNode, boolean z2, LayoutNode layoutNode) {
        Modifier.Node node = semanticsModifierNode.getNode();
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        if (collapsedSemantics$ui_release == null) {
            collapsedSemantics$ui_release = new SemanticsConfiguration();
        }
        return new SemanticsNode(node, z2, layoutNode, collapsedSemantics$ui_release);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0090 A[LOOP:0: B:65:0x001c->B:103:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0037 A[EDGE_INSN: B:106:0x0037->B:75:0x0037 BREAK  A[LOOP:0: B:65:0x001c->B:103:0x0090], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.node.SemanticsModifierNode getOuterMergingSemantics(androidx.compose.ui.node.LayoutNode r9) {
        /*
            androidx.compose.ui.node.NodeChain r2 = r9.getNodes$ui_release()
            r0 = 8
            int r9 = androidx.compose.ui.node.NodeKind.m5749constructorimpl(r0)
            int r0 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r2)
            int r1 = (-1) - r0
            int r0 = (-1) - r9
            r1 = r1 | r0
            int r0 = (-1) - r1
            r6 = 0
            if (r0 == 0) goto L37
            androidx.compose.ui.Modifier$Node r8 = r2.getHead$ui_release()
        L1c:
            if (r8 == 0) goto L37
            int r0 = r8.getKindSet$ui_release()
            r0 = r0 & r9
            if (r0 == 0) goto L89
            r7 = r8
            r5 = r6
        L27:
            if (r7 == 0) goto L89
            boolean r0 = r7 instanceof androidx.compose.ui.node.SemanticsModifierNode
            if (r0 == 0) goto L3a
            r0 = r7
            androidx.compose.ui.node.SemanticsModifierNode r0 = (androidx.compose.ui.node.SemanticsModifierNode) r0
            boolean r0 = r0.getShouldMergeDescendantSemantics()
            if (r0 == 0) goto L84
            r6 = r7
        L37:
            androidx.compose.ui.node.SemanticsModifierNode r6 = (androidx.compose.ui.node.SemanticsModifierNode) r6
            return r6
        L3a:
            int r0 = r7.getKindSet$ui_release()
            int r1 = (-1) - r0
            int r0 = (-1) - r9
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L84
            boolean r0 = r7 instanceof androidx.compose.ui.node.DelegatingNode
            if (r0 == 0) goto L84
            r0 = r7
            androidx.compose.ui.node.DelegatingNode r0 = (androidx.compose.ui.node.DelegatingNode) r0
            androidx.compose.ui.Modifier$Node r4 = r0.getDelegate$ui_release()
            r3 = 0
            r2 = r3
        L54:
            r1 = 1
            if (r4 == 0) goto L81
            int r0 = r4.getKindSet$ui_release()
            r0 = r0 & r9
            if (r0 == 0) goto L63
            int r2 = r2 + 1
            if (r2 != r1) goto L68
            r7 = r4
        L63:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            goto L54
        L68:
            if (r5 != 0) goto L73
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            r0 = 16
            androidx.compose.ui.Modifier$Node[] r0 = new androidx.compose.ui.Modifier.Node[r0]
            r5.<init>(r0, r3)
        L73:
            if (r7 == 0) goto L7b
            if (r5 == 0) goto L7a
            r5.add(r7)
        L7a:
            r7 = r6
        L7b:
            if (r5 == 0) goto L63
            r5.add(r4)
            goto L63
        L81:
            if (r2 != r1) goto L84
            goto L27
        L84:
            androidx.compose.ui.Modifier$Node r7 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r5)
            goto L27
        L89:
            int r0 = r8.getAggregateChildKindSet$ui_release()
            r0 = r0 & r9
            if (r0 == 0) goto L37
            androidx.compose.ui.Modifier$Node r8 = r8.getChild$ui_release()
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsNodeKt.getOuterMergingSemantics(androidx.compose.ui.node.LayoutNode):androidx.compose.ui.node.SemanticsModifierNode");
    }

    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (function1.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    public static final Role getRole(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
    }

    public static final int contentDescriptionFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    public static final int roleFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }
}
