package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTargetNodeKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.semantics.SemanticsModifier;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!,o\bDJh|\u0004W\u00068\u000b<Ȑ\u0007Ӭ4\u0012\u0006\u0010njO0LeN/ZS8\u000fsڔ<$q$yCA\\\"}8\tWNmovJp\u000bK\u000f\f\u0016\u0011x:Wmx\f!?6P\u007fW3{\u0001\u0004ʠx\u0013D\u001782PG*\t\u000f*BH>\b+GY\u001f*0nojV\u001ba\u001d\u001a@\u0005\u0005Ĩ\u0019<j|f6v{\u000e>=3\u001bip_Wc>\u0013e\rtSW\u0011\u0005u6+n6{\u0015=a\u0011\u001ej[m\u0012ouK\u0015\u0001'U<\u0010֕oDf\u0018,\u0015Y^=a\u00016t\u0005\u007fqRʬC]qdh\u000eVv+\u007f\u001bV\u001c\u000e4B\u000f͓E(t!&3#q\u0004D^\u0012vB.\f(ا/3\u000eOC9Ie\u0002eI)f7*\u0016S̔;\"|>sT<j=\u001b\u0003v\u00029_^UL^\n_>\u001c\u000f7è\nň\u0003\u0382Ͻ\u00041\u00020<7=XiZ;!\u001a\u0001pD\u0016u5hvu\u0002VX@(oDBp\u009f\u0016˧CߟʰoRZ{:5e&b,\u0016\bA/\u0005wjGk\u0010fYv\u0011\u0003M\f\u0014M/\u0015] n\f eުv3cP:߇4؏z\u001aGֺr\u0007^fPT,lj*:2vifǱNΌR\u0012\u001bԵOs\"7:29n#L\u001b\u001ep@SȄ2˖l\u0016\u0007ԞC&\tn2u)\u0013^b\tuwzY,+hP4\u0018ٞ7Ԋ*U*ֻT\u00171\u0010\u0017s.Q\u0010PWLr\u0017$`2^l֞;ֺ3A+\u0011\u00055@\u000fΒEQzhW̉.Uy܉}7"}, d2 = {"\u0017mb2e;>R", "", "5dc\u0016a:>`(~y\u001d(\u0006\u00129t{7\u007fJ\n%", "u(E", " d\\<i,=", "5dc\u001fX4Hd\u0019}9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "#oS.g,=", "5dc\"c+:b\u0019}9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "1kP@f\u001bH9\u001d\byL,\fp+p", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001bv%\u0016IN\u0011", "", "7mR9h+>A\u0019\u0006{B5k\u0016+v\u007f5\n<\b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001b]\u0007\u001f\r", "5dc\u0016a*Ec\u0018~h^3}l8T\r$\r@\u000e%\u0013N7p\u0010B6?7a", "uH\u0018'", "/tc<<5OO \u0003yZ;|l8s\u007f5\u000b@\u007f\u007f!Fo", "", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "/tc<<5OO \u0003yZ;|q9d\u007f\f\u0005>\b'\u0016Kx\u0010\u001bv,5[y/7{", "@d\\.\\5B\\\u001blzm", ">gP@X", "/tc<<5OO \u0003yZ;|q9d\u007f\u0016{G\u0002", "Ad[3>0GR\u0007~\n", "/tc<<5OO \u0003yZ;|u/m\n9{?i!\u0016G", "/tc<<5OO \u0003yZ;|x:d{7{?i!\u0016G", "1`[0h3:b\u0019g\u0005],b\r8dm(\u000b!\u000e!\u001f", "3kT:X5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0015`}(7v%\u0004", "1`[0h3:b\u0019g\u0005],b\r8dm(\u000b!\u000e!\u001f+x\fC\u0007$9b\u007f~7t\u00160IR;y", "1n]AT0Ga", "D`[BX", "1n]AT0Ga`OI=\u0014x\b9", "uH8uM", "=q", "=sW2e", "=q\u001c\u0003'\u000b&O\u0018\t", "uH8u<", "AbW2W<ES|\b\fZ3\u0001\b+t\u00042\u0005*\u0002r%Uy\f@r45X^*5}$\u001dIP=kC,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egh-Ax\u0016;\\G;y\u001c(\u0014lb=\u0007p\u0015Xu'\u001d", "AoT0\\-BS'\\vg\r\u0007\u0007?sj5\u0006K\u0001$&[", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;
    private static final MutableObjectIntMap<Object> classToKindSetMap = ObjectIntMapKt.mutableObjectIntMapOf();

    /* JADX INFO: renamed from: contains-64DMado */
    public static final boolean m5757contains64DMado(int i2, int i3) {
        return (i2 + i3) - (i2 | i3) != 0;
    }

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    /* JADX INFO: renamed from: or-64DMado */
    public static final int m5759or64DMado(int i2, int i3) {
        return (i2 + i3) - (i2 & i3);
    }

    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        if (node.getKindSet$ui_release() != 0) {
            return node.getKindSet$ui_release();
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = classToKindSetMap;
        Object objClassKeyForObject = Actual_jvmKt.classKeyForObject(node);
        int iFindKeyIndex = mutableObjectIntMap.findKeyIndex(objClassKeyForObject);
        if (iFindKeyIndex >= 0) {
            return mutableObjectIntMap.values[iFindKeyIndex];
        }
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            iM5749constructorimpl = (-1) - (((-1) - iM5749constructorimpl) & ((-1) - NodeKind.m5749constructorimpl(2)));
        }
        if (node instanceof DrawModifierNode) {
            iM5749constructorimpl |= NodeKind.m5749constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            int iM5749constructorimpl2 = NodeKind.m5749constructorimpl(8);
            iM5749constructorimpl = (iM5749constructorimpl + iM5749constructorimpl2) - (iM5749constructorimpl & iM5749constructorimpl2);
        }
        if (node instanceof PointerInputModifierNode) {
            iM5749constructorimpl |= NodeKind.m5749constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            iM5749constructorimpl = (-1) - (((-1) - iM5749constructorimpl) & ((-1) - NodeKind.m5749constructorimpl(32)));
        }
        if (node instanceof ParentDataModifierNode) {
            iM5749constructorimpl |= NodeKind.m5749constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            iM5749constructorimpl |= NodeKind.m5749constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            int iM5749constructorimpl3 = NodeKind.m5749constructorimpl(256);
            iM5749constructorimpl = (iM5749constructorimpl + iM5749constructorimpl3) - (iM5749constructorimpl & iM5749constructorimpl3);
        }
        if (node instanceof ApproachLayoutModifierNode) {
            int iM5749constructorimpl4 = NodeKind.m5749constructorimpl(512);
            iM5749constructorimpl = (iM5749constructorimpl + iM5749constructorimpl4) - (iM5749constructorimpl & iM5749constructorimpl4);
        }
        if (node instanceof FocusTargetNode) {
            iM5749constructorimpl = (-1) - (((-1) - iM5749constructorimpl) & ((-1) - NodeKind.m5749constructorimpl(1024)));
        }
        if (node instanceof FocusPropertiesModifierNode) {
            int iM5749constructorimpl5 = NodeKind.m5749constructorimpl(2048);
            iM5749constructorimpl = (iM5749constructorimpl + iM5749constructorimpl5) - (iM5749constructorimpl & iM5749constructorimpl5);
        }
        if (node instanceof FocusEventModifierNode) {
            iM5749constructorimpl |= NodeKind.m5749constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            int iM5749constructorimpl6 = NodeKind.m5749constructorimpl(8192);
            iM5749constructorimpl = (iM5749constructorimpl + iM5749constructorimpl6) - (iM5749constructorimpl & iM5749constructorimpl6);
        }
        if (node instanceof RotaryInputModifierNode) {
            iM5749constructorimpl = (-1) - (((-1) - iM5749constructorimpl) & ((-1) - NodeKind.m5749constructorimpl(16384)));
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            int iM5749constructorimpl7 = NodeKind.m5749constructorimpl(32768);
            iM5749constructorimpl = (iM5749constructorimpl + iM5749constructorimpl7) - (iM5749constructorimpl & iM5749constructorimpl7);
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            iM5749constructorimpl |= NodeKind.m5749constructorimpl(131072);
        }
        int iM5749constructorimpl8 = node instanceof TraversableNode ? NodeKind.m5749constructorimpl(262144) | iM5749constructorimpl : iM5749constructorimpl;
        mutableObjectIntMap.set(objClassKeyForObject, iM5749constructorimpl8);
        return iM5749constructorimpl8;
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final void autoInvalidateNodeIncludingDelegates(Modifier.Node node, int i2, int i3) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            autoInvalidateNodeSelf(node, (-1) - (((-1) - delegatingNode.getSelfKindSet$ui_release()) | ((-1) - i2)), i3);
            int i4 = (~delegatingNode.getSelfKindSet$ui_release()) & i2;
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                autoInvalidateNodeIncludingDelegates(delegate$ui_release, i4, i3);
            }
            return;
        }
        autoInvalidateNodeSelf(node, (-1) - (((-1) - i2) | ((-1) - node.getKindSet$ui_release())), i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(Modifier.Node node, int i2, int i3) {
        if (i3 != 0 || node.getShouldAutoInvalidate()) {
            if ((NodeKind.m5749constructorimpl(2) & i2) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
                if (i3 == 2) {
                    DelegatableNodeKt.m5636requireCoordinator64DMado(node, NodeKind.m5749constructorimpl(2)).onRelease();
                }
            }
            if ((-1) - (((-1) - NodeKind.m5749constructorimpl(128)) | ((-1) - i2)) != 0 && (node instanceof LayoutAwareModifierNode) && i3 != 2) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
            }
            if ((-1) - (((-1) - NodeKind.m5749constructorimpl(256)) | ((-1) - i2)) != 0 && (node instanceof GlobalPositionAwareModifierNode) && i3 != 2) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateOnPositioned$ui_release();
            }
            if ((NodeKind.m5749constructorimpl(4) & i2) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
            }
            int iM5749constructorimpl = NodeKind.m5749constructorimpl(8);
            if ((iM5749constructorimpl + i2) - (iM5749constructorimpl | i2) != 0 && (node instanceof SemanticsModifierNode)) {
                SemanticsModifierNodeKt.invalidateSemantics((SemanticsModifierNode) node);
            }
            if ((-1) - (((-1) - NodeKind.m5749constructorimpl(64)) | ((-1) - i2)) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
            }
            int iM5749constructorimpl2 = NodeKind.m5749constructorimpl(1024);
            if ((iM5749constructorimpl2 + i2) - (iM5749constructorimpl2 | i2) != 0 && (node instanceof FocusTargetNode) && i3 != 2) {
                FocusTargetNodeKt.invalidateFocusTarget((FocusTargetNode) node);
            }
            int iM5749constructorimpl3 = NodeKind.m5749constructorimpl(2048);
            if ((iM5749constructorimpl3 + i2) - (iM5749constructorimpl3 | i2) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    if (i3 == 2) {
                        scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                    } else {
                        FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                    }
                }
            }
            int iM5749constructorimpl4 = NodeKind.m5749constructorimpl(4096);
            if ((i2 + iM5749constructorimpl4) - (i2 | iM5749constructorimpl4) == 0 || !(node instanceof FocusEventModifierNode)) {
                return;
            }
            FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
        }
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        FocusPropertiesModifierNode focusPropertiesModifierNode2 = focusPropertiesModifierNode;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(1024);
        if (!focusPropertiesModifierNode2.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusPropertiesModifierNode2.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode2.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            int aggregateChildKindSet$ui_release = nodePop.getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + iM5749constructorimpl) - (aggregateChildKindSet$ui_release | iM5749constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, nodePop);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                        MutableVector mutableVector2 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNodeKt.invalidateFocusTarget((FocusTargetNode) nodePop);
                            } else if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    int kindSet$ui_release = delegate$ui_release.getKindSet$ui_release();
                                    if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker.INSTANCE.reset();
        focusPropertiesModifierNode.applyFocusProperties(CanFocusChecker.INSTANCE);
        return CanFocusChecker.INSTANCE.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(Modifier.Node node) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            int selfKindSet$ui_release = delegatingNode.getSelfKindSet$ui_release();
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                selfKindSet$ui_release = (-1) - (((-1) - selfKindSet$ui_release) & ((-1) - calculateNodeKindSetFromIncludingDelegates(delegate$ui_release)));
            }
            return selfKindSet$ui_release;
        }
        return calculateNodeKindSetFrom(node);
    }

    /* JADX INFO: renamed from: getIncludeSelfInTraversal-H91voCI */
    public static final boolean m5758getIncludeSelfInTraversalH91voCI(int i2) {
        return (i2 & NodeKind.m5749constructorimpl(128)) != 0;
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(1);
        if (element instanceof LayoutModifier) {
            iM5749constructorimpl |= NodeKind.m5749constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            iM5749constructorimpl |= NodeKind.m5749constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            iM5749constructorimpl |= NodeKind.m5749constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            iM5749constructorimpl = (-1) - (((-1) - iM5749constructorimpl) & ((-1) - NodeKind.m5749constructorimpl(16)));
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            int iM5749constructorimpl2 = NodeKind.m5749constructorimpl(32);
            iM5749constructorimpl = (iM5749constructorimpl + iM5749constructorimpl2) - (iM5749constructorimpl & iM5749constructorimpl2);
        }
        if (element instanceof FocusEventModifier) {
            iM5749constructorimpl = (-1) - (((-1) - iM5749constructorimpl) & ((-1) - NodeKind.m5749constructorimpl(4096)));
        }
        if (element instanceof FocusOrderModifier) {
            iM5749constructorimpl |= NodeKind.m5749constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            iM5749constructorimpl = (-1) - (((-1) - iM5749constructorimpl) & ((-1) - NodeKind.m5749constructorimpl(256)));
        }
        if (element instanceof ParentDataModifier) {
            int iM5749constructorimpl3 = NodeKind.m5749constructorimpl(64);
            iM5749constructorimpl = (iM5749constructorimpl + iM5749constructorimpl3) - (iM5749constructorimpl & iM5749constructorimpl3);
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) ? iM5749constructorimpl | NodeKind.m5749constructorimpl(128) : iM5749constructorimpl;
    }
}
