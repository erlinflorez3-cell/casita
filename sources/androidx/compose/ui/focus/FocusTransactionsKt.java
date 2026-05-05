package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: FocusTransactions.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!,r\bDZc|\u0004G\u000b8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj??\\oV\u008cjSX\u000e\u0014{b$\"ҕ\naIV2}P\bwN\u0016g\u001fP`\u000bQ\u0011\u001e\u0016'i\\O[xk\u0015'2pn\u00063e\fK=xtd\u0004H2P8*\u000b\u0007\u001a8J(v)B{\u0010 3XphQS˟\u001d$ \u000bV /\u001d\u0005g|6\u000fǍuD=)\u001bipMO_^|\u0014\r^p5\u0014\u000faL3h7c\u0015UW\u0011\u0010j[m\r\u0006мޮ\u0004ؒҊ+-O~eBp\u001c\"\"CO;e\u001b&\u000b\u0005\u0002d\u001a0CO\u0012U\u0017\u000eÂv\u07beԫ\u0011>\n\u001c\u00143`J;)~\b<;\u001dr\u0002@\u0001\u0006lK\u0018z\u0010@]%Ƨ2ٿݰ\u001fhWqI%fS\n\u0016%\u001eQ\t\u0017!\nT>d#$lw\u007f;\u0018̵عGݐ̆]?s\u0016~n\u001a4\u0012C_\u007f]z9.E%}كQ-/\u007f\u001aHrf\u001f\u0005\u000fh\u001a֟jfN6\u0007\u0018M)7\u000b\u0003D\u0013\u0005\u001cTbaD\u0011{&\u001b͵ś\u0007ʶء`yB63&fav\u0001\u0003M\f\tM/\u00157\nry&o9\r3{Q{\u001aok\u000f\u0014m;\u000b\u0005\u0007f\tS$djB:2vj8w*D\u0015\fƑ2Dy\u001f:ϛMG[ĒL\u001e"}, d2 = {"1`_Ah9>4#|\u000bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl\u001cDo\u0016=6M:k\n", "1kT.e\nAW }[h*\r\u0017", "4na0X+", "@dU?X:A4#|\u000bl\f\u000e\t8t\u000e", "1kT.e\rHQ)\r", "4qT296<c'", "5qP;g\rHQ)\r", ">da3b9F1)\r\nh4Z\u0010/a\r\t\u0006>\u0011%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001a\u00073Dc\u0006~7{%2V?Jo>'\u0002hoI\u000er\u0002", "4nRBf\u000bB`\u0019|\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg\\$Dm\u0014=QMDA", ">da3b9F1)\r\nh4Z\u0010/a\r\t\u0006>\u0011%^/\u0003\"6\u007f#\u007f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4sx,H5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u0018,\u0017\u0003iOmLTE.\u00124(\u0002Iw\u0005\u0015\u0012\u001d9ty/V\u001eW\u0001$K", ">da3b9F1)\r\nh4\\\u0012>e\r", ">da3b9F1)\r\nh4\\\u0012>e\rocS\u0015\u0011 E:", ">da3b9F1)\r\nh4\\\u001c3t", ">da3b9F1)\r\nh4\\\u001c3tG\u0010\u000fTz \u0015\u0012", ">da3b9F1)\r\nh4i\t;u\u007f6\u000b!\u000b\u0015'U", ">da3b9F1)\r\nh4i\t;u\u007f6\u000b!\u000b\u0015'U7uO\u000b\u001f>WH", ">da3b9F@\u0019\u000b\u000b^:\fi9c\u00106", "@d`BX:M4#|\u000bl", "@d`BX:M4#|\u000blsd\u001cC_\t&F", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4sx,H>\u0003t(\u0018}#PN\u0018\tf\\y=\u0010\u001b0", "@d`BX:M4#|\u000bl\r\u0007\u0016\rh\u0004/z", "1gX9W\u0015HR\u0019", "@d`BX:M4#|\u000bl\r\u0007\u0016\u0019w\t(\t", "@d`B\\9>/\u0017\u000e~o,Z\f3l~", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FocusTransactionsKt {

    /* JADX INFO: compiled from: FocusTransactions.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean requestFocus(FocusTargetNode focusTargetNode) {
        Boolean boolM3888requestFocusMxy_nc0 = m3888requestFocusMxy_nc0(focusTargetNode, FocusDirection.Companion.m3856getEnterdhqQ8s());
        if (boolM3888requestFocusMxy_nc0 != null) {
            return boolM3888requestFocusMxy_nc0.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusTransactionsKt$requestFocus$1 */
    /* JADX INFO: compiled from: FocusTransactions.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07531 extends Lambda implements Function0<Unit> {
        C07531() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            if (focusTargetNode.getNode().isAttached()) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
        }
    }

    /* JADX INFO: renamed from: requestFocus-Mxy_nc0 */
    public static final Boolean m3888requestFocusMxy_nc0(FocusTargetNode focusTargetNode, int i2) {
        Boolean boolValueOf;
        FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        C07531 c07531 = new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.requestFocus.1
            C07531() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                if (focusTargetNode.getNode().isAttached()) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                }
            }
        };
        try {
            if (focusTransactionManagerRequireTransactionManager.ongoingTransaction) {
                focusTransactionManagerRequireTransactionManager.cancelTransaction();
            }
            focusTransactionManagerRequireTransactionManager.beginTransaction();
            focusTransactionManagerRequireTransactionManager.cancellationListener.add(c07531);
            int i3 = WhenMappings.$EnumSwitchMapping$0[m3887performCustomRequestFocusMxy_nc0(focusTargetNode, i2).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    boolValueOf = true;
                } else if (i3 == 3 || i3 == 4) {
                    boolValueOf = null;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                boolValueOf = Boolean.valueOf(performRequestFocus(focusTargetNode));
            }
            return boolValueOf;
        } finally {
            focusTransactionManagerRequireTransactionManager.commitTransaction();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean performRequestFocus(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.performRequestFocus(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean captureFocus(FocusTargetNode focusTargetNode) {
        FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (focusTransactionManagerRequireTransactionManager.ongoingTransaction) {
                focusTransactionManagerRequireTransactionManager.cancelTransaction();
            }
            focusTransactionManagerRequireTransactionManager.beginTransaction();
            int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
            boolean z2 = true;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3 || i2 == 4) {
                        z2 = false;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                focusTargetNode.setFocusState(FocusStateImpl.Captured);
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
            return z2;
        } finally {
            focusTransactionManagerRequireTransactionManager.commitTransaction();
        }
    }

    public static final boolean freeFocus(FocusTargetNode focusTargetNode) {
        FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (focusTransactionManagerRequireTransactionManager.ongoingTransaction) {
                focusTransactionManagerRequireTransactionManager.cancelTransaction();
            }
            focusTransactionManagerRequireTransactionManager.beginTransaction();
            int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
            boolean z2 = true;
            if (i2 != 1) {
                if (i2 == 2) {
                    focusTargetNode.setFocusState(FocusStateImpl.Active);
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                } else if (i2 == 3 || i2 == 4) {
                    z2 = false;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return z2;
        } finally {
            focusTransactionManagerRequireTransactionManager.commitTransaction();
        }
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return clearFocus(focusTargetNode, z2, z3);
    }

    public static final boolean clearFocus(FocusTargetNode focusTargetNode, boolean z2, boolean z3) {
        int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i2 == 1) {
            focusTargetNode.setFocusState(FocusStateImpl.Inactive);
            if (z3) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
        } else {
            if (i2 == 2) {
                if (!z2) {
                    return z2;
                }
                focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                if (!z3) {
                    return z2;
                }
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                return z2;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!clearChildFocus(focusTargetNode, z2, z3)) {
                    return false;
                }
                focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                if (z3) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1 */
    /* JADX INFO: compiled from: FocusTransactions.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            focusTargetNode.fetchFocusProperties$ui_release();
        }
    }

    private static final boolean grantFocus(FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.grantFocus.1
            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                focusTargetNode.fetchFocusProperties$ui_release();
            }
        });
        int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i2 == 3 || i2 == 4) {
            focusTargetNode.setFocusState(FocusStateImpl.Active);
            return true;
        }
        return true;
    }

    static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode focusTargetNode, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        return clearChildFocus(focusTargetNode, z2, z3);
    }

    private static final boolean clearChildFocus(FocusTargetNode focusTargetNode, boolean z2, boolean z3) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z2, z3);
        }
        return true;
    }

    private static final boolean requestFocusForChild(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        Modifier.Node node;
        Modifier.Node nodePop;
        NodeChain nodes$ui_release;
        NodeChain nodes$ui_release2;
        FocusTargetNode focusTargetNode3 = focusTargetNode2;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(1024);
        if (!focusTargetNode3.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = focusTargetNode3.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode3);
        loop0: while (true) {
            node = null;
            if (layoutNodeRequireLayoutNode == null) {
                nodePop = null;
                break;
            }
            int aggregateChildKindSet$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + iM5749constructorimpl) - (aggregateChildKindSet$ui_release | iM5749constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                        nodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    int kindSet$ui_release = delegate$ui_release.getKindSet$ui_release();
                                    if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0) {
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
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release2 = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
        }
        if (!Intrinsics.areEqual(nodePop, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int i3 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i3 == 1) {
            boolean zGrantFocus = grantFocus(focusTargetNode2);
            if (zGrantFocus) {
                focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
                return zGrantFocus;
            }
            return zGrantFocus;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                requireActiveChild(focusTargetNode);
                if (clearChildFocus$default(focusTargetNode, false, false, 3, null) && grantFocus(focusTargetNode2)) {
                    return true;
                }
            } else if (i3 == 4) {
                FocusTargetNode focusTargetNode4 = focusTargetNode;
                int iM5749constructorimpl2 = NodeKind.m5749constructorimpl(1024);
                if (!focusTargetNode4.getNode().isAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                Modifier.Node parent$ui_release2 = focusTargetNode4.getNode().getParent$ui_release();
                LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode4);
                loop4: while (true) {
                    if (layoutNodeRequireLayoutNode2 == null) {
                        break;
                    }
                    if ((-1) - (((-1) - layoutNodeRequireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release()) | ((-1) - iM5749constructorimpl2)) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & iM5749constructorimpl2) != 0) {
                                Modifier.Node nodePop2 = parent$ui_release2;
                                MutableVector mutableVector2 = null;
                                while (nodePop2 != null) {
                                    if (nodePop2 instanceof FocusTargetNode) {
                                        node = nodePop2;
                                        break loop4;
                                    }
                                    if ((nodePop2.getKindSet$ui_release() & iM5749constructorimpl2) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                        int i4 = 0;
                                        for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) nodePop2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                            if ((delegate$ui_release2.getKindSet$ui_release() & iM5749constructorimpl2) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    nodePop2 = delegate$ui_release2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop2 != null) {
                                                        if (mutableVector2 != null) {
                                                            mutableVector2.add(nodePop2);
                                                        }
                                                        nodePop2 = null;
                                                    }
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(delegate$ui_release2);
                                                    }
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    nodePop2 = DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                    parent$ui_release2 = (layoutNodeRequireLayoutNode2 == null || (nodes$ui_release = layoutNodeRequireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
                }
                FocusTargetNode focusTargetNode5 = (FocusTargetNode) node;
                if (focusTargetNode5 == null && requestFocusForOwner(focusTargetNode)) {
                    boolean zGrantFocus2 = grantFocus(focusTargetNode2);
                    if (zGrantFocus2) {
                        focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
                        return zGrantFocus2;
                    }
                    return zGrantFocus2;
                }
                if (focusTargetNode5 != null && requestFocusForChild(focusTargetNode5, focusTargetNode)) {
                    boolean zRequestFocusForChild = requestFocusForChild(focusTargetNode, focusTargetNode2);
                    if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
                        throw new IllegalStateException("Deactivated node is focused".toString());
                    }
                    if (!zRequestFocusForChild) {
                        return zRequestFocusForChild;
                    }
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode5);
                    return zRequestFocusForChild;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    private static final boolean requestFocusForOwner(FocusTargetNode focusTargetNode) {
        return DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().mo3870requestFocusForOwner7o62pno(null, null);
    }

    private static final FocusTargetNode requireActiveChild(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return activeChild;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child".toString());
    }

    /* JADX INFO: renamed from: performCustomRequestFocus-Mxy_nc0 */
    public static final CustomDestinationResult m3887performCustomRequestFocusMxy_nc0(FocusTargetNode focusTargetNode, int i2) {
        Modifier.Node nodePop;
        NodeChain nodes$ui_release;
        int i3 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i3 == 1 || i3 == 2) {
            return CustomDestinationResult.None;
        }
        if (i3 == 3) {
            return m3884performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i2);
        }
        if (i3 == 4) {
            FocusTargetNode focusTargetNode2 = focusTargetNode;
            int iM5749constructorimpl = NodeKind.m5749constructorimpl(1024);
            if (!focusTargetNode2.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent$ui_release = focusTargetNode2.getNode().getParent$ui_release();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    nodePop = null;
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM5749constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        int kindSet$ui_release = parent$ui_release.getKindSet$ui_release();
                        if ((kindSet$ui_release + iM5749constructorimpl) - (kindSet$ui_release | iM5749constructorimpl) != 0) {
                            nodePop = parent$ui_release;
                            MutableVector mutableVector = null;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    break loop0;
                                }
                                if ((nodePop.getKindSet$ui_release() & iM5749constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i4 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        int kindSet$ui_release2 = delegate$ui_release.getKindSet$ui_release();
                                        if ((kindSet$ui_release2 + iM5749constructorimpl) - (kindSet$ui_release2 | iM5749constructorimpl) != 0) {
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
                                nodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            FocusTargetNode focusTargetNode3 = (FocusTargetNode) nodePop;
            if (focusTargetNode3 == null) {
                return CustomDestinationResult.None;
            }
            int i5 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode3.getFocusState().ordinal()];
            if (i5 == 1) {
                return m3885performCustomEnterMxy_nc0(focusTargetNode3, i2);
            }
            if (i5 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i5 == 3) {
                return m3887performCustomRequestFocusMxy_nc0(focusTargetNode3, i2);
            }
            if (i5 == 4) {
                CustomDestinationResult customDestinationResultM3887performCustomRequestFocusMxy_nc0 = m3887performCustomRequestFocusMxy_nc0(focusTargetNode3, i2);
                CustomDestinationResult customDestinationResult = customDestinationResultM3887performCustomRequestFocusMxy_nc0 != CustomDestinationResult.None ? customDestinationResultM3887performCustomRequestFocusMxy_nc0 : null;
                if (customDestinationResult != null) {
                    return customDestinationResult;
                }
                return m3885performCustomEnterMxy_nc0(focusTargetNode3, i2);
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: performCustomClearFocus-Mxy_nc0 */
    public static final CustomDestinationResult m3884performCustomClearFocusMxy_nc0(FocusTargetNode focusTargetNode, int i2) {
        int i3 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i3 == 3) {
                CustomDestinationResult customDestinationResultM3884performCustomClearFocusMxy_nc0 = m3884performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i2);
                if (customDestinationResultM3884performCustomClearFocusMxy_nc0 == CustomDestinationResult.None) {
                    customDestinationResultM3884performCustomClearFocusMxy_nc0 = null;
                }
                return customDestinationResultM3884performCustomClearFocusMxy_nc0 == null ? m3886performCustomExitMxy_nc0(focusTargetNode, i2) : customDestinationResultM3884performCustomClearFocusMxy_nc0;
            }
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: performCustomEnter-Mxy_nc0 */
    private static final CustomDestinationResult m3885performCustomEnterMxy_nc0(FocusTargetNode focusTargetNode, int i2) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusRequester focusRequesterInvoke = focusTargetNode.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m3846boximpl(i2));
                if (focusRequesterInvoke != FocusRequester.Companion.getDefault()) {
                    if (focusRequesterInvoke == FocusRequester.Companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return focusRequesterInvoke.focus$ui_release() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: performCustomExit-Mxy_nc0 */
    private static final CustomDestinationResult m3886performCustomExitMxy_nc0(FocusTargetNode focusTargetNode, int i2) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusRequester focusRequesterInvoke = focusTargetNode.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m3846boximpl(i2));
                if (focusRequesterInvoke != FocusRequester.Companion.getDefault()) {
                    if (focusRequesterInvoke == FocusRequester.Companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return focusRequesterInvoke.focus$ui_release() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return CustomDestinationResult.None;
    }
}
