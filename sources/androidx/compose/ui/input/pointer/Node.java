package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG9LeN0ZS@\u000fsڔ<$q$yCAV\"}8\tWN}gvJ`\u000eK\u000f\u001c\u0016\u0001j2I]xk\u0012\u00172HrG3coE9fy>\u0005.9*\u0600\u0002\u0005\u0017\u001a2Ϻ\u0018v\tOSÈ\u0018ؓV\u0081jR;LE%\"\nL \u0019\u001e\u000bhߑ:Hz_\u0003[1\u0017\u0002B|-\u0010:\u000bb%Ld)\u001dv\u00100YQg9#;k\u00035V\fC\u0011V\n=3\u0001W+9b\fWd^F(]9]'urTw5Un#?+}{\u0012dV.\u0006\u0017\u0014\rj\u001fT\u0006oN<J2f6)y\t;aNn\u001a^p\u0006+eD.=\u007faC\u007f//foZ1Ne\u00025\u0017,C\u0019t1]d\u000e\u000f0Iu>Ά7\u001alKjf\n\bC\u001e\u000e~w\u001a0\u00142W\u007f]\u000e??G)EqQ#Oo2LR~\u000f\u0005\u000f\u0001\u0004m`aX\"\u001d\u001c}>Q$hg|\u0005\u001aV\u0005^:5e\u001ej\u0006,\u0013C$j\u001dT!S\u001b\u0015O1mxsu\nSJ/Sg\u0016\u0004\u000e\u0006T\u000f7Cy{\u0010\u0010{'\u001eMfz\u000bhhRS:ȗ\u000bShF\u0011p\u001e$\u0014D|9YF\u0010\u007f*7D3/[CLYٟN˩\u0001\tgʳ9\u001c\rYK$1ozڒ\u0015ɹT\\xב8\u0005W3\u0015`P3\u0018ٞAԊ*U*ֻ\u0005\f1\u0007\u0017s.HѨPMT˾.w[\u0004.\u001fjG_9U\u0015%}W=XΒQʆveY˧b6\t\t\u0012\u000fiu\u05cek\u000erѱDbpX]cg4\u0005n\u000b)\u0018f\u0010y\u0010X)X:ҽ\rИBIzÅ*H\\K\u0015\u0005M${˝{ݕ\u000155ξۘ!D"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001V -M\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001V -M.7x4'$>", ";nS6Y0>`\u0002\ty^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2sB\b\u001f7CY\u001f", "1n^?W0GO(~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "6`b\u0012k0MS\u0018", "", "7r8;", "5dc\u001ab+BT\u001d~\bG6{\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B\u0018f*6mk", ">nX;g,K3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", ">nX;g,K7\u0018\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r&u8'$hn\u001d\u0006?9[r;\u001d", "5dc\u001db0Gb\u0019\f^]:", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_>\\GB5\u001f(\u0019qp9\u0014G+*\u00044C`$", "@d[2i(Gbv\u0002vg.|\u0017", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! I]\u00198\u0004355\u000b-3\u0002k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "E`b\u0016a", "0tX9W\n:Q\u001c~", "1gP;Z,L", ">`a2a;\u001c]#\fyb5x\u0018/s", "7mc2e5:Z\u0004\t~g;|\u0016\u000fv\u007f1\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001Q\u001f=MPDg;\t\u001fljH\u0007p\f_v0V\"", "7r8;56N\\\u0018\r", "1kT.a\u001cI6\u001d\u000e\t", "", "1kT.e\n:Q\u001c~", "2hb=T;<Vvz\u0004\\,\u0004", "2hb=T;<Vy\u0003\u0004Z3\\\u001a/n\u000f\u0013wN\u000f", "2hb=T;<V|\u007fc^,{\t.", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "2hb=T;<V\u0001z~g\f\u000e\t8tj$\nN", "6`b\u001db:Bb\u001d\t\u0004</x\u00121e~", "=kS\u0012i,Gb", "<df\u0012i,Gb", ";`a8<:\"\\", "@d\\<i,\"\\*z\u0002b+g\u00133n\u000f(\t$\u007f%rPnk?r.7Y\f", ">nX;g,K7\u0018ove<|", "", "6hc\u001bb+>a", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=#", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Node extends NodeParent {
    public static final int $stable = 8;
    private LayoutCoordinates coordinates;
    private final Modifier.Node modifierNode;
    private PointerEvent pointerEvent;
    private boolean wasIn;
    private final PointerIdArray pointerIds = new PointerIdArray();
    private final LongSparseArray<PointerInputChange> relevantChanges = new LongSparseArray<>(2);
    private boolean isIn = true;
    private boolean hasExited = true;

    public Node(Modifier.Node node) {
        this.modifierNode = node;
    }

    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void removeInvalidPointerIdsAndChanges(long j2, MutableObjectList<Node> mutableObjectList) {
        if (this.pointerIds.contains(j2) && !mutableObjectList.contains(this)) {
            this.pointerIds.remove(j2);
            this.relevantChanges.remove(j2);
        }
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            Node[] content = children.getContent();
            int i2 = 0;
            do {
                content[i2].removeInvalidPointerIdsAndChanges(j2, mutableObjectList);
                i2++;
            } while (i2 < size);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023b  */
    /* JADX WARN: Type inference failed for: r8v10 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean buildCache(androidx.collection.LongSparseArray<androidx.compose.ui.input.pointer.PointerInputChange> r44, androidx.compose.ui.layout.LayoutCoordinates r45, androidx.compose.ui.input.pointer.InternalPointerEvent r46, boolean r47) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.buildCache(androidx.collection.LongSparseArray, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    private final boolean hasPositionChanged(PointerEvent pointerEvent, PointerEvent pointerEvent2) {
        if (pointerEvent == null || pointerEvent.getChanges().size() != pointerEvent2.getChanges().size()) {
            return true;
        }
        int size = pointerEvent2.getChanges().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!Offset.m3934equalsimpl0(pointerEvent.getChanges().get(i2).m5385getPositionF1C5BW0(), pointerEvent2.getChanges().get(i2).m5385getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(Function0<Unit> function0) {
        if (this.relevantChanges.isEmpty() || !this.modifierNode.isAttached()) {
            return false;
        }
        function0.invoke();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            Node[] content = children.getContent();
            int i2 = 0;
            do {
                content[i2].dispatchCancel();
                i2++;
            } while (i2 < size);
        }
        Modifier.Node nodePop = this.modifierNode;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(16);
        MutableVector mutableVector = null;
        while (nodePop != 0) {
            if (nodePop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) nodePop).onCancelPointerInput();
            } else {
                int kindSet$ui_release = nodePop.getKindSet$ui_release();
                if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                    int i3 = 0;
                    nodePop = nodePop;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                            i3++;
                            if (i3 == 1) {
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
                    if (i3 == 1) {
                    }
                }
            }
            nodePop = DelegatableNodeKt.pop(mutableVector);
        }
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            boolean pressed = pointerInputChange.getPressed();
            boolean zM5314activeHoverEvent0FcD4WY = internalPointerEvent.m5314activeHoverEvent0FcD4WY(pointerInputChange.m5383getIdJ3iCeTQ());
            boolean z2 = this.isIn;
            if ((!pressed && !zM5314activeHoverEvent0FcD4WY) || (!pressed && !z2)) {
                this.pointerIds.m5481remove0FcD4WY(pointerInputChange.m5383getIdJ3iCeTQ());
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m5334equalsimpl0(pointerEvent.m5327getType7fucELk(), PointerEventType.Companion.m5339getExit7fucELk());
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(LongSparseArray<PointerInputChange> longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z2) {
        MutableVector<Node> children;
        int size;
        if (this.relevantChanges.isEmpty() || !this.modifierNode.isAttached()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        Intrinsics.checkNotNull(pointerEvent);
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        Intrinsics.checkNotNull(layoutCoordinates2);
        long jMo5522getSizeYbymL2g = layoutCoordinates2.mo5522getSizeYbymL2g();
        Modifier.Node nodePop = this.modifierNode;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(16);
        MutableVector mutableVector = null;
        while (nodePop != 0) {
            if (nodePop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) nodePop).mo546onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, jMo5522getSizeYbymL2g);
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
        if (this.modifierNode.isAttached() && (size = (children = getChildren()).getSize()) > 0) {
            Node[] content = children.getContent();
            int i3 = 0;
            do {
                Node node = content[i3];
                LongSparseArray<PointerInputChange> longSparseArray2 = this.relevantChanges;
                LayoutCoordinates layoutCoordinates3 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates3);
                node.dispatchMainEventPass(longSparseArray2, layoutCoordinates3, internalPointerEvent, z2);
                i3++;
            } while (i3 < size);
        }
        if (this.modifierNode.isAttached()) {
            Modifier.Node nodePop2 = this.modifierNode;
            int iM5749constructorimpl2 = NodeKind.m5749constructorimpl(16);
            MutableVector mutableVector2 = null;
            while (nodePop2 != 0) {
                if (nodePop2 instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) nodePop2).mo546onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, jMo5522getSizeYbymL2g);
                } else if ((-1) - (((-1) - nodePop2.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl2)) != 0 && (nodePop2 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release2 = ((DelegatingNode) nodePop2).getDelegate$ui_release();
                    int i4 = 0;
                    nodePop2 = nodePop2;
                    while (delegate$ui_release2 != null) {
                        if ((delegate$ui_release2.getKindSet$ui_release() & iM5749constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                nodePop2 = delegate$ui_release2;
                            } else {
                                if (mutableVector2 == null) {
                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (nodePop2 != 0) {
                                    if (mutableVector2 != null) {
                                        mutableVector2.add(nodePop2);
                                    }
                                    nodePop2 = 0;
                                }
                                if (mutableVector2 != null) {
                                    mutableVector2.add(delegate$ui_release2);
                                }
                            }
                        }
                        delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                        nodePop2 = nodePop2;
                    }
                    if (i4 == 1) {
                    }
                }
                nodePop2 = DelegatableNodeKt.pop(mutableVector2);
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> children;
        int size;
        boolean z2 = false;
        int i2 = 0;
        z2 = false;
        if (!this.relevantChanges.isEmpty() && this.modifierNode.isAttached()) {
            PointerEvent pointerEvent = this.pointerEvent;
            Intrinsics.checkNotNull(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            Intrinsics.checkNotNull(layoutCoordinates);
            long jMo5522getSizeYbymL2g = layoutCoordinates.mo5522getSizeYbymL2g();
            Modifier.Node nodePop = this.modifierNode;
            int iM5749constructorimpl = NodeKind.m5749constructorimpl(16);
            MutableVector mutableVector = null;
            while (nodePop != 0) {
                if (nodePop instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) nodePop).mo546onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, jMo5522getSizeYbymL2g);
                } else {
                    int kindSet$ui_release = nodePop.getKindSet$ui_release();
                    if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                        int i3 = 0;
                        nodePop = nodePop;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                                i3++;
                                if (i3 == 1) {
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
                        if (i3 == 1) {
                        }
                    }
                }
                nodePop = DelegatableNodeKt.pop(mutableVector);
            }
            if (this.modifierNode.isAttached() && (size = (children = getChildren()).getSize()) > 0) {
                Node[] content = children.getContent();
                do {
                    content[i2].dispatchFinalEventPass(internalPointerEvent);
                    i2++;
                } while (i2 < size);
            }
            z2 = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z2;
    }
}
