package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
/* JADX INFO: compiled from: FocusTraversal.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d̉=!4i\bDJd|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq~<$q$yCAV\"}8\tWNmh\u0007nh\u0010[\u000f4\u001c!jZH\u0006|k\u0019'2pwo7[xU9\u000f~|ӌ܌1Ĳأ}\u0007\u0007%8T(\u0003\tPc\u000e(/nobR;LK܅*\u0012L.\u0019 rf|5pl\f9u#\u001bsP]?_^\ru\rtSm˙\u000f&,<X9K\u0014SV+\u0007\u0001Zo\u0007MxU\u0005\u0017/W/W|o6\u0007\nD\u001b9a%_\t%\u000b\u0015\u0002p\u001a:C[sM`\u000eVv\u000b}\u001d<2\u00114;\u000f͓ȟ\u0019Ǒڿ\u00125z\baVp\u001alۍ\u0018|w5E$(3Y8Q%(Ħ=ϭR;\u0014\u0007\u0013\u001e1\u0002\u000f7iV&`C\u001e|w\u007f0\b~\u0014ʱP̆]A\u0006\u0006vd\u0010.ʹ0L\b2\u0002\u009fJE$ۄ_P"}, d2 = {"/bc6i,\u001cV\u001d\u0006y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl\u001cDo\u0016=6M:k\n", "5dc\u000eV;Bd\u0019\\}b3{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4sXO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^WO5\u000b\u0015g\u000b\u0005xBG-v(V\u0004;wi\u0016\u0015\u000e\u000b", "7r49\\.BP ~[h9]\u0013-u\u000e\u0016{<\u000e\u0015\u001a", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4sX]", "1tbAb4\u001f]\u0017\u000f\tL,x\u0016-h", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CHA", "4nRBf\u000bB`\u0019|\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg\\$Dm\u0014=QMDA", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1tbAb4\u001f]\u0017\u000f\tL,x\u0016-hGoe(H()\u001a", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4sxO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W^4\u0011\u0014#( \u0003NG.f0V\u00029w\u0005\u0016\u001fcxQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bUfse\u0016]-j\u0004\u001b.\u0012\u0002'\bh\\>\n\nb\u0011\u007f(", "4h]14*MW*~[h*\r\u0017\u0018o~(", "4h]1A6G2\u0019zxm0\u000e\u0005>e~\u0013wM\u0001 &", "4nRBf\u0019>Q(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "4nRBf\u001a>O&|}", ">qTC\\6Na \u0013[h*\r\u0017/dl(yO", "=m5<h5=", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "4nRBf\u001a>O&|}&vo[!O\u007f\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4sxO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W^4\u0011\u0014#( \u0003NG.f0V\u00029w\u0005\u0016\u001fc\u001cfyAc\u001aKx(??3pQcmy\u0011QI,,d\u0016g\u001dkGNm\u0001q\u0017*>74\u0014\u000bZ\u0015{\u001c~xo\u0011\u001a\u000bA\"MqeOS96L}%.O\u0006\u0001]\b\u001c[0p>\u007f}12m\u0007\u0015D\"Hex\u001152", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FocusTraversalKt {

    /* JADX INFO: compiled from: FocusTraversal.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: customFocusSearch--OM-vw8 */
    public static final FocusRequester m3889customFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i2, LayoutDirection layoutDirection) {
        FocusRequester end;
        FocusRequester start;
        FocusProperties focusPropertiesFetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3859getNextdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3860getPreviousdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3862getUpdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3855getDowndhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                start = focusPropertiesFetchFocusProperties$ui_release.getStart();
            } else if (i3 == 2) {
                start = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (start == FocusRequester.Companion.getDefault()) {
                start = null;
            }
            return start == null ? focusPropertiesFetchFocusProperties$ui_release.getLeft() : start;
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s())) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i4 == 1) {
                end = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            } else if (i4 == 2) {
                end = focusPropertiesFetchFocusProperties$ui_release.getStart();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (end == FocusRequester.Companion.getDefault()) {
                end = null;
            }
            return end == null ? focusPropertiesFetchFocusProperties$ui_release.getRight() : end;
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3856getEnterdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getEnter().invoke(FocusDirection.m3846boximpl(i2));
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3857getExitdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getExit().invoke(FocusDirection.m3846boximpl(i2));
        }
        throw new IllegalStateException("invalid FocusDirection".toString());
    }

    /* JADX INFO: renamed from: focusSearch-0X8WOeE */
    public static final Boolean m3890focusSearch0X8WOeE(FocusTargetNode focusTargetNode, int i2, LayoutDirection layoutDirection, Rect rect, Function1<? super FocusTargetNode, Boolean> function1) {
        int iM3861getRightdhqQ8s;
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3859getNextdhqQ8s()) ? true : FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3860getPreviousdhqQ8s())) {
            return Boolean.valueOf(OneDimensionalFocusSearchKt.m3893oneDimensionalFocusSearchOMvw8(focusTargetNode, i2, function1));
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s()) ? true : FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s()) ? true : FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3862getUpdhqQ8s()) ? true : FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3855getDowndhqQ8s())) {
            return TwoDimensionalFocusSearchKt.m3902twoDimensionalFocusSearchsMXa3k8(focusTargetNode, i2, rect, function1);
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3856getEnterdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                iM3861getRightdhqQ8s = FocusDirection.Companion.m3861getRightdhqQ8s();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iM3861getRightdhqQ8s = FocusDirection.Companion.m3858getLeftdhqQ8s();
            }
            FocusTargetNode focusTargetNodeFindActiveFocusNode = findActiveFocusNode(focusTargetNode);
            if (focusTargetNodeFindActiveFocusNode != null) {
                return TwoDimensionalFocusSearchKt.m3902twoDimensionalFocusSearchsMXa3k8(focusTargetNodeFindActiveFocusNode, iM3861getRightdhqQ8s, rect, function1);
            }
            return null;
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3857getExitdhqQ8s())) {
            FocusTargetNode focusTargetNodeFindActiveFocusNode2 = findActiveFocusNode(focusTargetNode);
            FocusTargetNode focusTargetNodeFindNonDeactivatedParent = focusTargetNodeFindActiveFocusNode2 != null ? findNonDeactivatedParent(focusTargetNodeFindActiveFocusNode2) : null;
            return Boolean.valueOf((focusTargetNodeFindNonDeactivatedParent == null || Intrinsics.areEqual(focusTargetNodeFindNonDeactivatedParent, focusTargetNode)) ? false : function1.invoke(focusTargetNodeFindNonDeactivatedParent).booleanValue());
        }
        throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m3851toStringimpl(i2))).toString());
    }

    public static final Rect focusRect(FocusTargetNode focusTargetNode) {
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            NodeCoordinator nodeCoordinator = coordinator$ui_release;
            Rect rectLocalBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(nodeCoordinator).localBoundingBoxOf(nodeCoordinator, false);
            if (rectLocalBoundingBoxOf != null) {
                return rectLocalBoundingBoxOf;
            }
        }
        return Rect.Companion.getZero();
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator$ui_release;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator$ui_release2 = focusTargetNode.getCoordinator$ui_release();
        return (coordinator$ui_release2 == null || (layoutNode = coordinator$ui_release2.getLayoutNode()) == null || !layoutNode.isPlaced() || (coordinator$ui_release = focusTargetNode.getCoordinator$ui_release()) == null || (layoutNode2 = coordinator$ui_release.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0039, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode getActiveChild(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x004d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode findNonDeactivatedParent(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(1024);
        if (!focusTargetNode2.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = focusTargetNode2.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        while (layoutNodeRequireLayoutNode != null) {
            if ((-1) - (((-1) - layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                while (parent$ui_release != null) {
                    int kindSet$ui_release = parent$ui_release.getKindSet$ui_release();
                    if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0) {
                        Modifier.Node nodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) nodePop;
                                if (focusTargetNode3.fetchFocusProperties$ui_release().getCanFocus()) {
                                    return focusTargetNode3;
                                }
                            } else if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
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
}
