package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
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
/* JADX INFO: compiled from: DelegatingNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLcz\tI\u0006>\u00116B\u0005$4\u0012\u000e\u0007nj?3LeV.Zݷ2\u000f\u0002{<$a6yCQU\"}(\u000bWNupvJ`\rI4\u001cǝ)jZH\u0016{ٕ\u0016\u000f@B8\\AN\b=\u007fk\u0015<\u000bړ@-`y3\rJ.V\u001d\u000fz\nVR\u0014ضDpH`Ul\u0013)*\u0006\u0005+!$bɡ\\Apl\fF_'\u0011vZNmjvŧ֔\u0011HZ7\u001b\u0005*>9QO5C7\u0004\u0013\u0015esK\u0013A\u0002=3g7);I\"idlFϭ\u001bۣS\rc\bng\u0013gx\fU=\u0016qׂT\u000e.\u000fC\u0007\u001bT\u001c\u000e49\u000f<ǉ\u001ef\u000e'{\u007f\u0001mXP0p\t\u000eѐe6\u001d@H>9U3f\u007fs\u0002'\u05ee;{\u000b*f.\u000f\r9[\u0003 '#ôXwWP\u001aSKhf\n\bO\u001e\b~\u0004\u001a*2/\u000e\u000e\u009e\u007f\u001149mEi\\;!\u001a\u0014xHu\u001b\u001d`\u0017_0T\u0011S0\u0014.7X\u001b<^R\t\u001dk~`\u001f\u008cҭQ\u001cZ-F\u001d!Gtwj3U\u0016\\w\u0001k\u0001L\f3k=Ϭ;Yt\u0016VmG\nK5\u007fu@e`#,?ji5\\tok\f\t\u000bn\"z^x?\u0010{r`<\u0017@o\n\u001cb3a\u001djF`\u0003LA\b|Yyhi(\u0001j2R\u0002@ˆ\u0001֊\u0005\\dʙ\bi~K:\u007f\u0001$3E_:i>c(\u00014+*]ѩuõKsT܁\\n\u001c}c{8\u0018 B_9˴\u0017A"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r$@o~8LC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "u(E", "2d[2Z(MS", "5dc\u0011X3>U\u0015\u000ez\u001d<\u0001\u0003<e\u0007(wN\u0001", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B\u0018f*6mk", "Adc\u0011X3>U\u0015\u000ez\u001d<\u0001\u0003<e\u0007(wN\u0001", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2sB\b\u001f7CY\u001f", "Ad[3>0GR\u0007~\n", "", "5dc X3?9\u001d\byL,\fG?iy5{G\u0001\u0013%G.\nE\u007f/DU\r$Av$", "5dc X3?9\u001d\byL,\fG?iy5{G\u0001\u0013%G", "u(8", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r\u001c4t\u0016\u0017WB;A", "2d[2Z(MO\u0016\u0006zG6{\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001bv,5[y/3j\u001d.6M:k\na{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u0017X*\rN8A+nF3.\u0004)P\u0002$r\u007f\fk", "2d[2Z(MS\t\b\u0006k6\f\t-t\u007f'", "2d[2Z(MS\t\b\u0006k6\f\t-t\u007f':P\u0005\u0011$Gv\u000e8\u0005%", "4na\u0012T*A7!\u0007z]0x\u0018/D\u007f/{B|&\u0017", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "4na\u0012T*A7!\u0007z]0x\u0018/D\u007f/{B|&\u0017\u0006\u007f\u00126\u0004%<Yy.7", ";`a84:\u001ab(zxa,{", ";`a84:\u001ab(zxa,{G?iy5{G\u0001\u0013%G", ";`a84:\u001dS(zxa,{", ";`a84:\u001dS(zxa,{G?iy5{G\u0001\u0013%G", "@db2g", "@db2gjNW\u0013\fze,x\u0017/", "@t]\u000eg;:Q\u001ce~_,z\u001d-l\u007f", "@t]\u000eg;:Q\u001ce~_,z\u001d-l\u007ff\fDz$\u0017No\nJv", "@t]\u0011X;:Q\u001ce~_,z\u001d-l\u007f", "@t]\u0011X;:Q\u001ce~_,z\u001d-l\u007ff\fDz$\u0017No\nJv", "Adc\u000ef\u000b>Z\u0019\u0001vm,k\u0013", "=v]2e", "Adc\u000ef\u000b>Z\u0019\u0001vm,k\u0013mu\u0004\"\t@\b\u0017\u0013Uo", "CmS2_,@O(~", "7mbAT5<S", "CmS2_,@O(~jg7\n\u0013>e}7{?", "CmS2_,@O(~jg7\n\u0013>e}7{??'\u001bA|\u000eCv!CY", "CoS.g,\u001c]#\fyb5x\u00189r", "1n^?W0GO(\t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "CoS.g,\u001c]#\fyb5x\u00189r>8\u007f:\u000e\u0017\u001eGk\u001c<", "CoS.g,']\u0018~`b5{v/t", "<df\u0018\\5=A\u0019\u000e", "@dR._*NZ\u0015\u000ezH>\u0006\t<", "", "D`[6W(MSw~\u0002^.x\u0018/K\u00041z.\u0001&", "2d[2Z(MS~\u0003\u0004]\u001a|\u0018", "2d[2Z(MS\u0002\ty^", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class DelegatingNode extends Modifier.Node {
    public static final int $stable = 8;
    private Modifier.Node delegate;
    private final int selfKindSet = NodeKindKt.calculateNodeKindSetFrom(this);

    public static /* synthetic */ void getSelfKindSet$ui_release$annotations() {
    }

    public final int getSelfKindSet$ui_release() {
        return this.selfKindSet;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void updateCoordinator$ui_release(NodeCoordinator nodeCoordinator) {
        super.updateCoordinator$ui_release(nodeCoordinator);
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.updateCoordinator$ui_release(nodeCoordinator);
        }
    }

    public final Modifier.Node getDelegate$ui_release() {
        return this.delegate;
    }

    public final void setDelegate$ui_release(Modifier.Node node) {
        this.delegate = node;
    }

    public final <T extends DelegatableNode> T delegateUnprotected$ui_release(T t2) {
        return (T) delegate(t2);
    }

    public final void undelegateUnprotected$ui_release(DelegatableNode delegatableNode) {
        undelegate(delegatableNode);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void setAsDelegateTo$ui_release(Modifier.Node node) {
        super.setAsDelegateTo$ui_release(node);
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.setAsDelegateTo$ui_release(node);
        }
    }

    protected final <T extends DelegatableNode> T delegate(T t2) {
        Modifier.Node node = t2.getNode();
        if (node != t2) {
            Modifier.Node node2 = t2 instanceof Modifier.Node ? (Modifier.Node) t2 : null;
            Modifier.Node parent$ui_release = node2 != null ? node2.getParent$ui_release() : null;
            if (node == getNode() && Intrinsics.areEqual(parent$ui_release, this)) {
                return t2;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
        }
        if (node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui_release(getNode());
        int kindSet$ui_release = getKindSet$ui_release();
        int iCalculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
        node.setKindSet$ui_release(iCalculateNodeKindSetFromIncludingDelegates);
        validateDelegateKindSet(iCalculateNodeKindSetFromIncludingDelegates, node);
        node.setChild$ui_release(this.delegate);
        this.delegate = node;
        node.setParent$ui_release(this);
        updateNodeKindSet((-1) - (((-1) - getKindSet$ui_release()) & ((-1) - iCalculateNodeKindSetFromIncludingDelegates)), false);
        if (isAttached()) {
            if ((-1) - (((-1) - iCalculateNodeKindSetFromIncludingDelegates) | ((-1) - NodeKind.m5749constructorimpl(2))) != 0 && (kindSet$ui_release & NodeKind.m5749constructorimpl(2)) == 0) {
                NodeChain nodes$ui_release = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
                getNode().updateCoordinator$ui_release(null);
                nodes$ui_release.syncCoordinators();
            } else {
                updateCoordinator$ui_release(getCoordinator$ui_release());
            }
            node.markAsAttached$ui_release();
            node.runAttachLifecycle$ui_release();
            NodeKindKt.autoInvalidateInsertedNode(node);
        }
        return t2;
    }

    protected final void undelegate(DelegatableNode delegatableNode) {
        Modifier.Node node = null;
        for (Modifier.Node child$ui_release = this.delegate; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            if (child$ui_release == delegatableNode) {
                if (child$ui_release.isAttached()) {
                    NodeKindKt.autoInvalidateRemovedNode(child$ui_release);
                    child$ui_release.runDetachLifecycle$ui_release();
                    child$ui_release.markAsDetached$ui_release();
                }
                child$ui_release.setAsDelegateTo$ui_release(child$ui_release);
                child$ui_release.setAggregateChildKindSet$ui_release(0);
                if (node == null) {
                    this.delegate = child$ui_release.getChild$ui_release();
                } else {
                    node.setChild$ui_release(child$ui_release.getChild$ui_release());
                }
                child$ui_release.setChild$ui_release(null);
                child$ui_release.setParent$ui_release(null);
                int kindSet$ui_release = getKindSet$ui_release();
                int iCalculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(this);
                updateNodeKindSet(iCalculateNodeKindSetFromIncludingDelegates, true);
                if (isAttached() && (-1) - (((-1) - kindSet$ui_release) | ((-1) - NodeKind.m5749constructorimpl(2))) != 0 && (NodeKind.m5749constructorimpl(2) & iCalculateNodeKindSetFromIncludingDelegates) == 0) {
                    NodeChain nodes$ui_release = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
                    getNode().updateCoordinator$ui_release(null);
                    nodes$ui_release.syncCoordinators();
                    return;
                }
                return;
            }
            node = child$ui_release;
        }
        throw new IllegalStateException(("Could not find delegate: " + delegatableNode).toString());
    }

    private final void validateDelegateKindSet(int i2, Modifier.Node node) {
        int kindSet$ui_release = getKindSet$ui_release();
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(2);
        if ((i2 + iM5749constructorimpl) - (i2 | iM5749constructorimpl) == 0 || (NodeKind.m5749constructorimpl(2) & kindSet$ui_release) == 0 || (this instanceof LayoutModifierNode)) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
    }

    private final void updateNodeKindSet(int i2, boolean z2) {
        Modifier.Node child$ui_release;
        int kindSet$ui_release = getKindSet$ui_release();
        setKindSet$ui_release(i2);
        if (kindSet$ui_release != i2) {
            if (DelegatableNodeKt.isDelegationRoot(this)) {
                setAggregateChildKindSet$ui_release(i2);
            }
            if (isAttached()) {
                Modifier.Node node = getNode();
                DelegatingNode parent$ui_release = this;
                while (parent$ui_release != null) {
                    i2 = (-1) - (((-1) - i2) & ((-1) - parent$ui_release.getKindSet$ui_release()));
                    parent$ui_release.setKindSet$ui_release(i2);
                    if (parent$ui_release == node) {
                        break;
                    } else {
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                if (z2 && parent$ui_release == node) {
                    i2 = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
                    node.setKindSet$ui_release(i2);
                }
                int aggregateChildKindSet$ui_release = i2 | ((parent$ui_release == null || (child$ui_release = parent$ui_release.getChild$ui_release()) == null) ? 0 : child$ui_release.getAggregateChildKindSet$ui_release());
                while (parent$ui_release != null) {
                    int kindSet$ui_release2 = parent$ui_release.getKindSet$ui_release();
                    aggregateChildKindSet$ui_release = (aggregateChildKindSet$ui_release + kindSet$ui_release2) - (aggregateChildKindSet$ui_release & kindSet$ui_release2);
                    parent$ui_release.setAggregateChildKindSet$ui_release(aggregateChildKindSet$ui_release);
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
        }
    }

    public final void forEachImmediateDelegate$ui_release(Function1<? super Modifier.Node, Unit> function1) {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            function1.invoke(delegate$ui_release);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.updateCoordinator$ui_release(getCoordinator$ui_release());
            if (!delegate$ui_release.isAttached()) {
                delegate$ui_release.markAsAttached$ui_release();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.runDetachLifecycle$ui_release();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void reset$ui_release() {
        super.reset$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.reset$ui_release();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runAttachLifecycle$ui_release() {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsDetached$ui_release() {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }
}
