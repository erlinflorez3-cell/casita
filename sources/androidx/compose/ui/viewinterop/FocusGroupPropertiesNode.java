package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionManager;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
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
/* JADX INFO: compiled from: FocusGroupNode.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012}\u0007njO0LeN1ZS8\u000fsڔ<$q$yّCU0}*\tUOog\u0005JbŏK\u000f\u001c\u0016\u0001j2R[xs܈?2pno3{om9\u000fuf\u0005N4b;ѩ\t\u0001(-\u0011\u001e\u0005\u0005[K:\u001d`D~Fj\r{\u0012`&ND.\u000f6\\\u0016]|H5cH?;\u0003\u0018M\u0015;(6\u000b^%F\u00032S\u000b*49RO5C8\u0004\u0007\u0015fs?1Tҵ<ݛص+)1_\u0002n~n\u000e,-+} \u000ev4p\u001dQ\u000f!̥*ՒӍOR\u0014A\u0006\u0012D'J\u001e&\u0006US^3(\u0002 \u0010Is!XpV\u0010zZ\u0002\u0011`d\u001ck\u0014{9G8~Q\u0010FIRE\u001a\u001d\rL(G\u0003iib-x\u0015I_(U?oX=vSPm\u000e\b\u0012tz\u0004@\u0003^LV\u0082\b 2#-ڛs;)'y\thFm~\u0013ièSnZKF̰\u000bD6Ґ\r,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG\u0001Ak&</PE{?\t\"rl9\u0014r0N\u0005\u0010QKN\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egh-Ax\u0016;\\G;y\u001c(\u0014lb=\u0007p\u0015Xu'\u001d", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0017\t@\u0001\u0001\u0014Uo\u001bMv2sC\u0007\u0002>w\u0013*T$EiD,rk]B\tc\u0013R\u00056GUN92", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI\\&&Cm\u0011*\u0006!DY[#3v\u0018.4GIz4'\u0015u7", "u(E", "4nRBf,=1\u001c\u0003\u0002]", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u0013b*Na\u0019}Xa0\u0004\b", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "Adc\u0013b*Na\u0019}Xa0\u0004\b", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004q", "/o_9l\rHQ)\rek6\b\t<t\u0004(\n", "", "4nRBf\u0017K]$~\bm0|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egh-Ax\u0016;\\G;y\n", "5dc\u0013b*Na\bz\b`,\fr0E\b%{?\u007f\u0017\u00168s\u000eNh21d\t D", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl\u001cDo\u0016=6M:k\n", "=m0Ag(<V", "=m32g(<V", "=m4;g,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CHA", "4nRBf\u000bB`\u0019|\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg\\$Dm\u0014=QMDA", "=m4;g,K\u001bf^h?2f[", "uH\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Hy\fL\u0005n\u0016c{0EZ\u0016:]CIz4+j", "=m4E\\;", "=m4E\\;\u0006!xl[d\u0016O", "=m69b):Zy\txn:Z\f+n\u0002(z", "=kS\u0013b*Na", "<df\u0013b*Na", "=mE6X>\u001ab(zxa,{w9W\u00041zJ\u0013", "D", "=mE6X>\u001dS(zxa,{i<o\b\u001a\u007fI\u007f!)", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {
    private View focusedChild;

    public final View getFocusedChild() {
        return this.focusedChild;
    }

    public final void setFocusedChild(View view) {
        this.focusedChild = view;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
        focusProperties.setEnter(new AnonymousClass1(this));
        focusProperties.setExit(new AnonymousClass2(this));
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$applyFocusProperties$1, reason: invalid class name */
    /* JADX INFO: compiled from: FocusGroupNode.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<FocusDirection, FocusRequester> {
        AnonymousClass1(Object obj) {
            super(1, obj, FocusGroupPropertiesNode.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
            return m6890invoke3ESFkO8(focusDirection.m3852unboximpl());
        }

        /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
        public final FocusRequester m6890invoke3ESFkO8(int i2) {
            return ((FocusGroupPropertiesNode) this.receiver).m6888onEnter3ESFkO8(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$applyFocusProperties$2, reason: invalid class name */
    /* JADX INFO: compiled from: FocusGroupNode.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<FocusDirection, FocusRequester> {
        AnonymousClass2(Object obj) {
            super(1, obj, FocusGroupPropertiesNode.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
            return m6891invoke3ESFkO8(focusDirection.m3852unboximpl());
        }

        /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
        public final FocusRequester m6891invoke3ESFkO8(int i2) {
            return ((FocusGroupPropertiesNode) this.receiver).m6889onExit3ESFkO8(i2);
        }
    }

    /* JADX INFO: renamed from: onEnter-3ESFkO8, reason: not valid java name */
    public final FocusRequester m6888onEnter3ESFkO8(int i2) {
        View view = FocusGroupNode_androidKt.getView(this);
        if (view.isFocused() || view.hasFocus()) {
            return FocusRequester.Companion.getDefault();
        }
        FocusGroupPropertiesNode focusGroupPropertiesNode = this;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusGroupPropertiesNode).getFocusOwner();
        Object objRequireOwner = DelegatableNodeKt.requireOwner(focusGroupPropertiesNode);
        Intrinsics.checkNotNull(objRequireOwner, "null cannot be cast to non-null type android.view.View");
        return FocusInteropUtils_androidKt.requestInteropFocus(view, FocusInteropUtils_androidKt.m3863toAndroidFocusDirection3ESFkO8(i2), FocusGroupNode_androidKt.getCurrentlyFocusedRect(focusOwner, (View) objRequireOwner, view)) ? FocusRequester.Companion.getDefault() : FocusRequester.Companion.getCancel();
    }

    /* JADX INFO: renamed from: onExit-3ESFkO8, reason: not valid java name */
    public final FocusRequester m6889onExit3ESFkO8(int i2) {
        View viewFindNextFocusFromRect;
        View view = FocusGroupNode_androidKt.getView(this);
        if (!view.hasFocus()) {
            return FocusRequester.Companion.getDefault();
        }
        FocusGroupPropertiesNode focusGroupPropertiesNode = this;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusGroupPropertiesNode).getFocusOwner();
        Object objRequireOwner = DelegatableNodeKt.requireOwner(focusGroupPropertiesNode);
        Intrinsics.checkNotNull(objRequireOwner, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) objRequireOwner;
        if (view instanceof ViewGroup) {
            Rect currentlyFocusedRect = FocusGroupNode_androidKt.getCurrentlyFocusedRect(focusOwner, view2, view);
            Integer numM3863toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m3863toAndroidFocusDirection3ESFkO8(i2);
            int iIntValue = numM3863toAndroidFocusDirection3ESFkO8 != null ? numM3863toAndroidFocusDirection3ESFkO8.intValue() : 130;
            FocusFinder focusFinder = FocusFinder.getInstance();
            View view3 = this.focusedChild;
            if (view3 != null) {
                viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) view2, view3, iIntValue);
            } else {
                viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) view2, currentlyFocusedRect, iIntValue);
            }
            if (viewFindNextFocusFromRect != null && FocusGroupNode_androidKt.containsDescendant(view, viewFindNextFocusFromRect)) {
                viewFindNextFocusFromRect.requestFocus(iIntValue, currentlyFocusedRect);
                return FocusRequester.Companion.getCancel();
            }
            if (!view2.requestFocus()) {
                throw new IllegalStateException("host view did not take focus".toString());
            }
            return FocusRequester.Companion.getDefault();
        }
        if (!view2.requestFocus()) {
            throw new IllegalStateException("host view did not take focus".toString());
        }
        return FocusRequester.Companion.getDefault();
    }

    private final FocusTargetNode getFocusTargetOfEmbeddedViewWrapper() {
        FocusGroupPropertiesNode focusGroupPropertiesNode = this;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(1024);
        if (!focusGroupPropertiesNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = focusGroupPropertiesNode.getNode();
        int aggregateChildKindSet$ui_release = node.getAggregateChildKindSet$ui_release();
        if ((aggregateChildKindSet$ui_release + iM5749constructorimpl) - (aggregateChildKindSet$ui_release | iM5749constructorimpl) != 0) {
            boolean z2 = false;
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((-1) - (((-1) - child$ui_release.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                    Modifier.Node nodePop = child$ui_release;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        if (nodePop instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) nodePop;
                            if (z2) {
                                return focusTargetNode;
                            }
                            z2 = true;
                        } else if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0 && (nodePop instanceof DelegatingNode)) {
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
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper".toString());
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        FocusGroupPropertiesNode focusGroupPropertiesNode = this;
        if (DelegatableNodeKt.requireLayoutNode(focusGroupPropertiesNode).getOwner$ui_release() == null) {
            return;
        }
        View view3 = FocusGroupNode_androidKt.getView(this);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusGroupPropertiesNode).getFocusOwner();
        Owner ownerRequireOwner = DelegatableNodeKt.requireOwner(focusGroupPropertiesNode);
        boolean z2 = (view == null || Intrinsics.areEqual(view, ownerRequireOwner) || !FocusGroupNode_androidKt.containsDescendant(view3, view)) ? false : true;
        boolean z3 = (view2 == null || Intrinsics.areEqual(view2, ownerRequireOwner) || !FocusGroupNode_androidKt.containsDescendant(view3, view2)) ? false : true;
        if (!z2 || !z3) {
            if (!z3) {
                if (z2) {
                    this.focusedChild = null;
                    if (getFocusTargetOfEmbeddedViewWrapper().getFocusState().isFocused()) {
                        focusOwner.mo3866clearFocusI7lrPNg(false, true, false, FocusDirection.Companion.m3857getExitdhqQ8s());
                        return;
                    }
                    return;
                }
                this.focusedChild = null;
                return;
            }
            this.focusedChild = view2;
            FocusTargetNode focusTargetOfEmbeddedViewWrapper = getFocusTargetOfEmbeddedViewWrapper();
            if (!focusTargetOfEmbeddedViewWrapper.getFocusState().getHasFocus()) {
                FocusTransactionManager focusTransactionManager = focusOwner.getFocusTransactionManager();
                try {
                    if (focusTransactionManager.ongoingTransaction) {
                        focusTransactionManager.cancelTransaction();
                    }
                    focusTransactionManager.beginTransaction();
                    FocusTransactionsKt.performRequestFocus(focusTargetOfEmbeddedViewWrapper);
                    return;
                } finally {
                    focusTransactionManager.commitTransaction();
                }
            }
            return;
        }
        this.focusedChild = view2;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        FocusGroupNode_androidKt.getView(this).addOnAttachStateChangeListener(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        FocusGroupNode_androidKt.getView(this).removeOnAttachStateChangeListener(this);
        this.focusedChild = null;
        super.onDetach();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
