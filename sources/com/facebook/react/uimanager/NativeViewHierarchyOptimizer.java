package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;

/* JADX INFO: loaded from: classes3.dex */
public class NativeViewHierarchyOptimizer {
    private static final boolean ENABLED = true;
    private static final String TAG = "NativeViewHierarchyOptimizer";
    private final ShadowNodeRegistry mShadowNodeRegistry;
    private final SparseBooleanArray mTagsWithLayoutVisited = new SparseBooleanArray();
    private final UIViewOperationQueue mUIViewOperationQueue;

    private static class NodeIndexPair {
        public final int index;
        public final ReactShadowNode node;

        NodeIndexPair(ReactShadowNode reactShadowNode, int i2) {
            this.node = reactShadowNode;
            this.index = i2;
        }
    }

    public NativeViewHierarchyOptimizer(UIViewOperationQueue uIViewOperationQueue, ShadowNodeRegistry shadowNodeRegistry) {
        this.mUIViewOperationQueue = uIViewOperationQueue;
        this.mShadowNodeRegistry = shadowNodeRegistry;
    }

    private void addGrandchildren(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i2) {
        Assertions.assertCondition(reactShadowNode2.getNativeKind() != NativeKind.PARENT);
        for (int i3 = 0; i3 < reactShadowNode2.getChildCount(); i3++) {
            ReactShadowNode childAt = reactShadowNode2.getChildAt(i3);
            Assertions.assertCondition(childAt.getNativeParent() == null);
            int nativeChildCount = reactShadowNode.getNativeChildCount();
            if (childAt.getNativeKind() == NativeKind.NONE) {
                addNonNativeChild(reactShadowNode, childAt, i2);
            } else {
                addNativeChild(reactShadowNode, childAt, i2);
            }
            i2 += reactShadowNode.getNativeChildCount() - nativeChildCount;
        }
    }

    private void addNativeChild(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i2) {
        reactShadowNode.addNativeChildAt(reactShadowNode2, i2);
        this.mUIViewOperationQueue.enqueueManageChildren(reactShadowNode.getReactTag(), null, new ViewAtIndex[]{new ViewAtIndex(reactShadowNode2.getReactTag(), i2)}, null);
        if (reactShadowNode2.getNativeKind() != NativeKind.PARENT) {
            addGrandchildren(reactShadowNode, reactShadowNode2, i2 + 1);
        }
    }

    private void addNodeToNode(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i2) {
        int nativeOffsetForChild = reactShadowNode.getNativeOffsetForChild(reactShadowNode.getChildAt(i2));
        if (reactShadowNode.getNativeKind() != NativeKind.PARENT) {
            NodeIndexPair nodeIndexPairWalkUpUntilNativeKindIsParent = walkUpUntilNativeKindIsParent(reactShadowNode, nativeOffsetForChild);
            if (nodeIndexPairWalkUpUntilNativeKindIsParent == null) {
                return;
            }
            reactShadowNode = nodeIndexPairWalkUpUntilNativeKindIsParent.node;
            nativeOffsetForChild = nodeIndexPairWalkUpUntilNativeKindIsParent.index;
        }
        if (reactShadowNode2.getNativeKind() != NativeKind.NONE) {
            addNativeChild(reactShadowNode, reactShadowNode2, nativeOffsetForChild);
        } else {
            addNonNativeChild(reactShadowNode, reactShadowNode2, nativeOffsetForChild);
        }
    }

    private void addNonNativeChild(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i2) {
        addGrandchildren(reactShadowNode, reactShadowNode2, i2);
    }

    private void applyLayoutBase(ReactShadowNode reactShadowNode) {
        int reactTag = reactShadowNode.getReactTag();
        if (this.mTagsWithLayoutVisited.get(reactTag)) {
            return;
        }
        this.mTagsWithLayoutVisited.put(reactTag, true);
        int screenX = reactShadowNode.getScreenX();
        int screenY = reactShadowNode.getScreenY();
        for (ReactShadowNode parent = reactShadowNode.getParent(); parent != null && parent.getNativeKind() != NativeKind.PARENT; parent = parent.getParent()) {
            if (!parent.isVirtual()) {
                screenX += Math.round(parent.getLayoutX());
                screenY += Math.round(parent.getLayoutY());
            }
        }
        applyLayoutRecursive(reactShadowNode, screenX, screenY);
    }

    private void applyLayoutRecursive(ReactShadowNode reactShadowNode, int i2, int i3) {
        if (reactShadowNode.getNativeKind() != NativeKind.NONE && reactShadowNode.getNativeParent() != null) {
            this.mUIViewOperationQueue.enqueueUpdateLayout(reactShadowNode.getLayoutParent().getReactTag(), reactShadowNode.getReactTag(), i2, i3, reactShadowNode.getScreenWidth(), reactShadowNode.getScreenHeight(), reactShadowNode.getLayoutDirection());
            return;
        }
        for (int i4 = 0; i4 < reactShadowNode.getChildCount(); i4++) {
            ReactShadowNode childAt = reactShadowNode.getChildAt(i4);
            int reactTag = childAt.getReactTag();
            if (!this.mTagsWithLayoutVisited.get(reactTag)) {
                this.mTagsWithLayoutVisited.put(reactTag, true);
                applyLayoutRecursive(childAt, childAt.getScreenX() + i2, childAt.getScreenY() + i3);
            }
        }
    }

    public static void assertNodeSupportedWithoutOptimizer(ReactShadowNode reactShadowNode) {
        Assertions.assertCondition(reactShadowNode.getNativeKind() != NativeKind.LEAF, "Nodes with NativeKind.LEAF are not supported when the optimizer is disabled");
    }

    public static void handleRemoveNode(ReactShadowNode reactShadowNode) {
        reactShadowNode.removeAllNativeChildren();
    }

    private static boolean isLayoutOnlyAndCollapsable(ReactStylesDiffMap reactStylesDiffMap) {
        if (reactStylesDiffMap == null) {
            return true;
        }
        if (reactStylesDiffMap.hasKey(ViewProps.COLLAPSABLE) && !reactStylesDiffMap.getBoolean(ViewProps.COLLAPSABLE, true)) {
            return false;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = reactStylesDiffMap.mBackingMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            if (!ViewProps.isLayoutOnly(reactStylesDiffMap.mBackingMap, readableMapKeySetIteratorKeySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    private void removeNodeFromParent(ReactShadowNode reactShadowNode, boolean z2) {
        if (reactShadowNode.getNativeKind() != NativeKind.PARENT) {
            for (int childCount = reactShadowNode.getChildCount() - 1; childCount >= 0; childCount--) {
                removeNodeFromParent(reactShadowNode.getChildAt(childCount), z2);
            }
        }
        ReactShadowNode nativeParent = reactShadowNode.getNativeParent();
        if (nativeParent != null) {
            int iIndexOfNativeChild = nativeParent.indexOfNativeChild(reactShadowNode);
            nativeParent.removeNativeChildAt(iIndexOfNativeChild);
            this.mUIViewOperationQueue.enqueueManageChildren(nativeParent.getReactTag(), new int[]{iIndexOfNativeChild}, null, z2 ? new int[]{reactShadowNode.getReactTag()} : null);
        }
    }

    private void transitionLayoutOnlyViewToNativeView(ReactShadowNode reactShadowNode, ReactStylesDiffMap reactStylesDiffMap) {
        ReactShadowNode parent = reactShadowNode.getParent();
        if (parent == null) {
            reactShadowNode.setIsLayoutOnly(false);
            return;
        }
        int iIndexOf = parent.indexOf(reactShadowNode);
        parent.removeChildAt(iIndexOf);
        removeNodeFromParent(reactShadowNode, false);
        reactShadowNode.setIsLayoutOnly(false);
        this.mUIViewOperationQueue.enqueueCreateView(reactShadowNode.getThemedContext(), reactShadowNode.getReactTag(), reactShadowNode.getViewClass(), reactStylesDiffMap);
        parent.addChildAt(reactShadowNode, iIndexOf);
        addNodeToNode(parent, reactShadowNode, iIndexOf);
        for (int i2 = 0; i2 < reactShadowNode.getChildCount(); i2++) {
            addNodeToNode(reactShadowNode, reactShadowNode.getChildAt(i2), i2);
        }
        FLog.i(TAG, "Transitioning LayoutOnlyView - tag: " + reactShadowNode.getReactTag() + " - rootTag: " + reactShadowNode.getRootTag() + " - hasProps: " + (reactStylesDiffMap != null) + " - tagsWithLayout.size: " + this.mTagsWithLayoutVisited.size());
        Assertions.assertCondition(this.mTagsWithLayoutVisited.size() == 0);
        applyLayoutBase(reactShadowNode);
        for (int i3 = 0; i3 < reactShadowNode.getChildCount(); i3++) {
            applyLayoutBase(reactShadowNode.getChildAt(i3));
        }
        this.mTagsWithLayoutVisited.clear();
    }

    private NodeIndexPair walkUpUntilNativeKindIsParent(ReactShadowNode reactShadowNode, int i2) {
        while (reactShadowNode.getNativeKind() != NativeKind.PARENT) {
            ReactShadowNode parent = reactShadowNode.getParent();
            if (parent == null) {
                return null;
            }
            i2 = i2 + (reactShadowNode.getNativeKind() == NativeKind.LEAF ? 1 : 0) + parent.getNativeOffsetForChild(reactShadowNode);
            reactShadowNode = parent;
        }
        return new NodeIndexPair(reactShadowNode, i2);
    }

    public void handleCreateView(ReactShadowNode reactShadowNode, ThemedReactContext themedReactContext, ReactStylesDiffMap reactStylesDiffMap) {
        reactShadowNode.setIsLayoutOnly(reactShadowNode.getViewClass().equals("RCTView") && isLayoutOnlyAndCollapsable(reactStylesDiffMap));
        if (reactShadowNode.getNativeKind() != NativeKind.NONE) {
            this.mUIViewOperationQueue.enqueueCreateView(themedReactContext, reactShadowNode.getReactTag(), reactShadowNode.getViewClass(), reactStylesDiffMap);
        }
    }

    public void handleForceViewToBeNonLayoutOnly(ReactShadowNode reactShadowNode) {
        if (reactShadowNode.isLayoutOnly()) {
            transitionLayoutOnlyViewToNativeView(reactShadowNode, null);
        }
    }

    public void handleManageChildren(ReactShadowNode reactShadowNode, int[] iArr, int[] iArr2, ViewAtIndex[] viewAtIndexArr, int[] iArr3) {
        boolean z2;
        for (int i2 : iArr2) {
            int i3 = 0;
            while (true) {
                if (i3 >= iArr3.length) {
                    z2 = false;
                    break;
                } else {
                    if (iArr3[i3] == i2) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
            }
            removeNodeFromParent(this.mShadowNodeRegistry.getNode(i2), z2);
        }
        for (ViewAtIndex viewAtIndex : viewAtIndexArr) {
            addNodeToNode(reactShadowNode, this.mShadowNodeRegistry.getNode(viewAtIndex.mTag), viewAtIndex.mIndex);
        }
    }

    public void handleSetChildren(ReactShadowNode reactShadowNode, ReadableArray readableArray) {
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            addNodeToNode(reactShadowNode, this.mShadowNodeRegistry.getNode(readableArray.getInt(i2)), i2);
        }
    }

    public void handleUpdateLayout(ReactShadowNode reactShadowNode) {
        applyLayoutBase(reactShadowNode);
    }

    public void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode.isLayoutOnly() && !isLayoutOnlyAndCollapsable(reactStylesDiffMap)) {
            transitionLayoutOnlyViewToNativeView(reactShadowNode, reactStylesDiffMap);
        } else {
            if (reactShadowNode.isLayoutOnly()) {
                return;
            }
            this.mUIViewOperationQueue.enqueueUpdateProperties(reactShadowNode.getReactTag(), str, reactStylesDiffMap);
        }
    }

    public void onBatchComplete() {
        this.mTagsWithLayoutVisited.clear();
    }

    void onViewUpdatesCompleted(ReactShadowNode reactShadowNode) {
        this.mTagsWithLayoutVisited.clear();
    }
}
