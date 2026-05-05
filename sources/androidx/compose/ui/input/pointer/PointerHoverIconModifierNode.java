package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLeV7ZS0\u0019s{J$c$wDCU(\n*\tUOog|Jb\u000bI\u0019\u000e\u0016\u000fj4կ]xs\u0012\u0017˰JoU3UoC:fҚLӌP2P7*\u0005/\u001aZH>w+Cy\u000eREPtHU%M3\u001e\"\fD \u000f#tg|<Ղp]H6k\tw\\f'\u000eKCMULbC%v\u00109q@\u007f;#Bk\u00035m\"?KE\u007f[\u001dhUBqI<]Dw\u0018\u0014CF\u0016\r&z4|\u001dSv\u000bU˃\u0016c\u0014X\u001cI\u0010|\u0012\fjǉT\u0006oN<O2f6)y\t;YNs\u001a^p\u001bAu~\u001d3$K+g6-Q*A'sO{3(d#I\u0017/\u0002l\u000e\u000f0KX\u0006xIQnexR\u0018\u0003Um2\u001b\u0013\u00068/HG.[B%ҽ\u0016¦ھ_;)Ny0\u0019Pu~\u001d`\u0017Y@ɰTغ&n\u001eճz+\u001a]\\d3o\u0001Xf5)MJXEB^ʽ,Ϣ{H)ط(PUrwum_\u00101=s\b{|p&Wgdc9_l(a\u0001|R\u0004\u0013ϼ\u0011ֽjN[ێr^.0@W\u000b\u0012}\fR_\\'@Q\n\u001eJ+_,\u0013U\u001fҔ նE\u0001!a`|\u001e\u0014%E2\u0019\u0002$# W˝\u001fʼsm\u0001̢D~f:;Zٞ5\u001e.X(םP+\"Ƚ\u0003#"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0017(&hn\u001d\u0005m56\u0001&KMR,i;|<\u0014g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9xFz.DY\u000b\u0004@x&=5M:o5\"\u0015uJC\u0006c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g\u0002/;w\u001f\u0015WA7r\u0012(\u001evqA\u0007p\u0014Xu+HPN9E\\q=i", "7b^;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001c\u001fq7", "=uT?e0=Sw~\t\\,\u0006\b+n\u000f6", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u0013rj\u000f{'\u001d", "1ta@b9\"\\u\t\u000bg+\u000br0N\n'{", "D`[BX", "5dc\u0016V6G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_\u0019WGDz4+xfkB\\", "Adc\u0016V6G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u0013rj\u000fJT", "5dc\u001ci,K`\u001d}z=,\u000b\u0007/n~$\u0005O\u000f", "u(I", "Adc\u001ci,K`\u001d}z=,\u000b\u0007/n~$\u0005O\u000f", "uY\u0018#", ">nX;g,K7\u0017\t\u0004L,\n\u001a3c\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001c\u001fqO9\u0014t0Lv|", "5dc\u001db0Gb\u0019\f^\\6\u0006v/r\u0011,y@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_\u0019WGDz4+xfkBtc9_z%G\"", "BqPCX9LS~~\u000f", "", "5dc!e(OS&\rzD,\u0011", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "2hb=_(R2\u0019\u007fvn3\fl-o\t", "", "2hb=_(R7\u0017\t\u0004", "2hb=_(R7\u0017\t\u0004?9\u0007\u0011\u000bn}(\nO\u000b$\u007fQn\u000e.z487\u000e-Ew#\u0012V E{=\u001d#Rn\u0018\u0007d(^}6+JX5", "2hb=_(R7\u0017\t\u0004?9\u0007\u0011\ru\r5{I\u0010\u007f!FowIU%CW})6i\u001f=[5?z7{%uoC\u0014G5+\u00017PK\\", "2hb=_(R7\u0017\t\u0004B-[\t=c\u007f1z<\n&%&yvF\u0006\b1j}\u000bDq ;QRO", "4h]17,LQ\u0019\byZ5\fq9d\u007f\u001a\u007fO\u0004t'T}\u0018IZ.\u0012c\u000e)6{", "4h]1B=>`&\u0003yb5~d8c\u007f6\u000bJ\u000e\u007f!Fo", "=m2.a*>Z\u0004\t~g;|\u0016\u0013n\u000b8\u000b", "=m32g(<V", "=m4;g,K", "=m4E\\;", "=m?<\\5MS&^\f^5\f", ">nX;g,K3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", ">`b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "=m?<\\5MS&^\f^5\fP\u00120\u000b\u0015\fJt", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N]J/~S\u0001*\u00120R\u0011;uJv \u0012>ypO6!G\u0003$`=7v\u001c>#j", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PointerHoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private boolean cursorInBoundsOfNode;
    private PointerIcon icon;
    private boolean overrideDescendants;
    private final String traverseKey;

    public /* synthetic */ PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(pointerIcon, (i2 & 2) != 0 ? false : z2);
    }

    public PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z2) {
        this.traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";
        this.icon = pointerIcon;
        this.overrideDescendants = z2;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }

    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final void setIcon(PointerIcon pointerIcon) {
        if (Intrinsics.areEqual(this.icon, pointerIcon)) {
            return;
        }
        this.icon = pointerIcon;
        if (this.cursorInBoundsOfNode) {
            displayIconIfDescendantsDoNotHavePriority();
        }
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    public final void setOverrideDescendants(boolean z2) {
        if (this.overrideDescendants != z2) {
            this.overrideDescendants = z2;
            if (z2) {
                if (this.cursorInBoundsOfNode) {
                    displayIcon();
                }
            } else if (this.cursorInBoundsOfNode) {
                displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
            }
        }
    }

    private final PointerIconService getPointerIconService() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo546onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        if (pointerEventPass == PointerEventPass.Main) {
            if (PointerEventType.m5334equalsimpl0(pointerEvent.m5327getType7fucELk(), PointerEventType.Companion.m5338getEnter7fucELk())) {
                onEnter();
            } else if (PointerEventType.m5334equalsimpl0(pointerEvent.m5327getType7fucELk(), PointerEventType.Companion.m5339getExit7fucELk())) {
                onExit();
            }
        }
    }

    private final void onEnter() {
        this.cursorInBoundsOfNode = true;
        displayIconIfDescendantsDoNotHavePriority();
    }

    private final void onExit() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (isAttached()) {
                displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        onExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        onExit();
        super.onDetach();
    }

    private final void displayIcon() {
        PointerIcon pointerIcon;
        PointerHoverIconModifierNode pointerHoverIconModifierNodeFindOverridingAncestorNode = findOverridingAncestorNode();
        if (pointerHoverIconModifierNodeFindOverridingAncestorNode == null || (pointerIcon = pointerHoverIconModifierNodeFindOverridingAncestorNode.icon) == null) {
            pointerIcon = this.icon;
        }
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(pointerIcon);
        }
    }

    private final void displayDefaultIcon() {
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(null);
        }
    }

    private final void displayIconIfDescendantsDoNotHavePriority() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (!this.overrideDescendants) {
            TraversableNodeKt.traverseDescendants(this, new Function1<PointerHoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode.displayIconIfDescendantsDoNotHavePriority.1
                C07541() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final TraversableNode.Companion.TraverseDescendantsAction invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
                    if (!pointerHoverIconModifierNode.cursorInBoundsOfNode) {
                        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                    }
                    booleanRef.element = false;
                    return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                }
            });
        }
        if (booleanRef.element) {
            displayIcon();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1 */
    /* JADX INFO: compiled from: PointerIcon.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;*\u0012(\u001ds]B\u000bm5\re4C]N9jRQ=\"\u0010Z\u0017M'\u0016\u0014g\u001d\"}HA(]", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0017(&hn\u001d\u0005m56\u0001&KMR,i;|<\u0014g", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07541 extends Lambda implements Function1<PointerHoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction> {
        C07541() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final TraversableNode.Companion.TraverseDescendantsAction invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
            if (!pointerHoverIconModifierNode.cursorInBoundsOfNode) {
                return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
            booleanRef.element = false;
            return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PointerHoverIconModifierNode findDescendantNodeWithCursorInBounds() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.traverseDescendants(this, new Function1<PointerHoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode.findDescendantNodeWithCursorInBounds.1
            final /* synthetic */ Ref.ObjectRef<PointerHoverIconModifierNode> $descendantNodeWithCursorInBounds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07551(Ref.ObjectRef<PointerHoverIconModifierNode> objectRef2) {
                super(1);
                objectRef = objectRef2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                if (!pointerHoverIconModifierNode.cursorInBoundsOfNode) {
                    return traverseDescendantsAction;
                }
                objectRef.element = pointerHoverIconModifierNode;
                return pointerHoverIconModifierNode.getOverrideDescendants() ? TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal : traverseDescendantsAction;
            }
        });
        return (PointerHoverIconModifierNode) objectRef2.element;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode$findDescendantNodeWithCursorInBounds$1 */
    /* JADX INFO: compiled from: PointerIcon.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;*\u0012(\u001ds]B\u000bm5\re4C]N9jRQ=\"\u0010Z\u0017M'\u0016\u0014g\u001d\"}HA(]", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0017(&hn\u001d\u0005m56\u0001&KMR,i;|<\u0014g", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07551 extends Lambda implements Function1<PointerHoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction> {
        final /* synthetic */ Ref.ObjectRef<PointerHoverIconModifierNode> $descendantNodeWithCursorInBounds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07551(Ref.ObjectRef<PointerHoverIconModifierNode> objectRef2) {
            super(1);
            objectRef = objectRef2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final TraversableNode.Companion.TraverseDescendantsAction invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
            TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            if (!pointerHoverIconModifierNode.cursorInBoundsOfNode) {
                return traverseDescendantsAction;
            }
            objectRef.element = pointerHoverIconModifierNode;
            return pointerHoverIconModifierNode.getOverrideDescendants() ? TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal : traverseDescendantsAction;
        }
    }

    private final void displayIconFromCurrentNodeOrDescendantsWithCursorInBounds() {
        PointerHoverIconModifierNode pointerHoverIconModifierNodeFindDescendantNodeWithCursorInBounds;
        if (this.cursorInBoundsOfNode) {
            if (this.overrideDescendants || (pointerHoverIconModifierNodeFindDescendantNodeWithCursorInBounds = findDescendantNodeWithCursorInBounds()) == null) {
                pointerHoverIconModifierNodeFindDescendantNodeWithCursorInBounds = this;
            }
            pointerHoverIconModifierNodeFindDescendantNodeWithCursorInBounds.displayIcon();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PointerHoverIconModifierNode findOverridingAncestorNode() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new Function1<PointerHoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode.findOverridingAncestorNode.1
            final /* synthetic */ Ref.ObjectRef<PointerHoverIconModifierNode> $pointerHoverIconModifierNode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07561(Ref.ObjectRef<PointerHoverIconModifierNode> objectRef2) {
                super(1);
                objectRef = objectRef2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
                if (pointerHoverIconModifierNode.getOverrideDescendants() && pointerHoverIconModifierNode.cursorInBoundsOfNode) {
                    objectRef.element = pointerHoverIconModifierNode;
                }
                return true;
            }
        });
        return (PointerHoverIconModifierNode) objectRef2.element;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode$findOverridingAncestorNode$1 */
    /* JADX INFO: compiled from: PointerIcon.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0017(&hn\u001d\u0005m56\u0001&KMR,i;|<\u0014g", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0001\u001fyaFja6W^1FPO0\\_[G\u0013\u00120Q50\t\u0016U\u000b+jM9hd6S\t;d\na"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07561 extends Lambda implements Function1<PointerHoverIconModifierNode, Boolean> {
        final /* synthetic */ Ref.ObjectRef<PointerHoverIconModifierNode> $pointerHoverIconModifierNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07561(Ref.ObjectRef<PointerHoverIconModifierNode> objectRef2) {
            super(1);
            objectRef = objectRef2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
            if (pointerHoverIconModifierNode.getOverrideDescendants() && pointerHoverIconModifierNode.cursorInBoundsOfNode) {
                objectRef.element = pointerHoverIconModifierNode;
            }
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        Unit unit;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new Function1<PointerHoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode.displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon.1
            final /* synthetic */ Ref.ObjectRef<PointerHoverIconModifierNode> $pointerHoverIconModifierNode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Ref.ObjectRef<PointerHoverIconModifierNode> objectRef2) {
                super(1);
                objectRef = objectRef2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
                if (objectRef.element == null && pointerHoverIconModifierNode.cursorInBoundsOfNode) {
                    objectRef.element = pointerHoverIconModifierNode;
                } else if (objectRef.element != null && pointerHoverIconModifierNode.getOverrideDescendants() && pointerHoverIconModifierNode.cursorInBoundsOfNode) {
                    objectRef.element = pointerHoverIconModifierNode;
                }
                return true;
            }
        });
        PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) objectRef2.element;
        if (pointerHoverIconModifierNode != null) {
            pointerHoverIconModifierNode.displayIcon();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            displayDefaultIcon();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1 */
    /* JADX INFO: compiled from: PointerIcon.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0017(&hn\u001d\u0005m56\u0001&KMR,i;|<\u0014g", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0001\u001fyaFja6W^1FPO0\\_[G\u0013\u00120Q50\t\u0016U\u000b+jM9hd6S\t;d\na"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<PointerHoverIconModifierNode, Boolean> {
        final /* synthetic */ Ref.ObjectRef<PointerHoverIconModifierNode> $pointerHoverIconModifierNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<PointerHoverIconModifierNode> objectRef2) {
            super(1);
            objectRef = objectRef2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
            if (objectRef.element == null && pointerHoverIconModifierNode.cursorInBoundsOfNode) {
                objectRef.element = pointerHoverIconModifierNode;
            } else if (objectRef.element != null && pointerHoverIconModifierNode.getOverrideDescendants() && pointerHoverIconModifierNode.cursorInBoundsOfNode) {
                objectRef.element = pointerHoverIconModifierNode;
            }
            return true;
        }
    }
}
