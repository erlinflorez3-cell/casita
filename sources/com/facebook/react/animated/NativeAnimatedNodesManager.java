package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import io.sentry.protocol.SentryStackTrace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class NativeAnimatedNodesManager implements EventDispatcherListener {
    private static final String TAG = "NativeAnimatedNodesManager";
    private final ReactApplicationContext mReactApplicationContext;
    private final SparseArray<AnimatedNode> mAnimatedNodes = new SparseArray<>();
    private final SparseArray<AnimationDriver> mActiveAnimations = new SparseArray<>();
    private final SparseArray<AnimatedNode> mUpdatedNodes = new SparseArray<>();
    private final List<EventAnimationDriver> mEventDrivers = new ArrayList();
    private int mAnimatedGraphBFSColor = 0;
    private final List<AnimatedNode> mRunUpdateNodeList = new LinkedList();
    private boolean mEventListenerInitializedForFabric = false;
    private boolean mEventListenerInitializedForNonFabric = false;
    private boolean mWarnedAboutGraphTraversal = false;

    public NativeAnimatedNodesManager(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleEvent(Event event) {
        ReactApplicationContext reactApplicationContext;
        if (this.mEventDrivers.isEmpty() || (reactApplicationContext = this.mReactApplicationContext) == null || UIManagerHelper.getUIManager(reactApplicationContext, ViewUtil.getUIManagerType(event.getViewTag(), event.getSurfaceId())) == null) {
            return;
        }
        Event.EventAnimationDriverMatchSpec eventAnimationDriverMatchSpec = event.getEventAnimationDriverMatchSpec();
        boolean z2 = false;
        for (EventAnimationDriver eventAnimationDriver : this.mEventDrivers) {
            if (eventAnimationDriverMatchSpec.match(eventAnimationDriver.viewTag, eventAnimationDriver.eventName)) {
                stopAnimationsForNode(eventAnimationDriver.valueNode);
                event.dispatchModern(eventAnimationDriver);
                this.mRunUpdateNodeList.add(eventAnimationDriver.valueNode);
                z2 = true;
            }
        }
        if (z2) {
            updateNodes(this.mRunUpdateNodeList);
            this.mRunUpdateNodeList.clear();
        }
    }

    private String normalizeEventName(String str) {
        return str.startsWith("on") ? "top" + str.substring(2) : str;
    }

    private void stopAnimationsForNode(AnimatedNode animatedNode) {
        WritableArray writableArrayCreateArray = null;
        int i2 = 0;
        while (i2 < this.mActiveAnimations.size()) {
            AnimationDriver animationDriverValueAt = this.mActiveAnimations.valueAt(i2);
            if (animatedNode.equals(animationDriverValueAt.animatedValue)) {
                if (animationDriverValueAt.endCallback != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    writableMapCreateMap.putDouble("value", animationDriverValueAt.animatedValue.nodeValue);
                    animationDriverValueAt.endCallback.invoke(writableMapCreateMap);
                } else if (this.mReactApplicationContext != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putInt("animationId", animationDriverValueAt.id);
                    writableMapCreateMap2.putBoolean("finished", false);
                    writableMapCreateMap2.putDouble("value", animationDriverValueAt.animatedValue.nodeValue);
                    if (writableArrayCreateArray == null) {
                        writableArrayCreateArray = Arguments.createArray();
                    }
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.mActiveAnimations.removeAt(i2);
                i2--;
            }
            i2++;
        }
        if (writableArrayCreateArray != null) {
            this.mReactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }

    private void updateNodes(List<AnimatedNode> list) {
        int i2 = this.mAnimatedGraphBFSColor;
        int i3 = i2 + 1;
        this.mAnimatedGraphBFSColor = i3;
        if (i3 == 0) {
            this.mAnimatedGraphBFSColor = i2 + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i4 = 0;
        for (AnimatedNode animatedNode : list) {
            int i5 = animatedNode.BFSColor;
            int i6 = this.mAnimatedGraphBFSColor;
            if (i5 != i6) {
                animatedNode.BFSColor = i6;
                i4++;
                arrayDeque.add(animatedNode);
            }
        }
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode2 = (AnimatedNode) arrayDeque.poll();
            if (animatedNode2.children != null) {
                for (int i7 = 0; i7 < animatedNode2.children.size(); i7++) {
                    AnimatedNode animatedNode3 = animatedNode2.children.get(i7);
                    animatedNode3.activeIncomingNodes++;
                    int i8 = animatedNode3.BFSColor;
                    int i9 = this.mAnimatedGraphBFSColor;
                    if (i8 != i9) {
                        animatedNode3.BFSColor = i9;
                        i4++;
                        arrayDeque.add(animatedNode3);
                    }
                }
            }
        }
        int i10 = this.mAnimatedGraphBFSColor;
        int i11 = i10 + 1;
        this.mAnimatedGraphBFSColor = i11;
        if (i11 == 0) {
            this.mAnimatedGraphBFSColor = i10 + 2;
        }
        int i12 = 0;
        for (AnimatedNode animatedNode4 : list) {
            if (animatedNode4.activeIncomingNodes == 0) {
                int i13 = animatedNode4.BFSColor;
                int i14 = this.mAnimatedGraphBFSColor;
                if (i13 != i14) {
                    animatedNode4.BFSColor = i14;
                    i12++;
                    arrayDeque.add(animatedNode4);
                }
            }
        }
        int i15 = 0;
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode5 = (AnimatedNode) arrayDeque.poll();
            try {
                animatedNode5.update();
                if (animatedNode5 instanceof PropsAnimatedNode) {
                    ((PropsAnimatedNode) animatedNode5).updateView();
                }
            } catch (JSApplicationCausedNativeException e2) {
                FLog.e(TAG, "Native animation workaround, frame lost as result of race condition", e2);
            }
            if (animatedNode5 instanceof ValueAnimatedNode) {
                ((ValueAnimatedNode) animatedNode5).onValueUpdate();
            }
            if (animatedNode5.children != null) {
                for (int i16 = 0; i16 < animatedNode5.children.size(); i16++) {
                    AnimatedNode animatedNode6 = animatedNode5.children.get(i16);
                    animatedNode6.activeIncomingNodes--;
                    if (animatedNode6.BFSColor != this.mAnimatedGraphBFSColor && animatedNode6.activeIncomingNodes == 0) {
                        animatedNode6.BFSColor = this.mAnimatedGraphBFSColor;
                        i12++;
                        arrayDeque.add(animatedNode6);
                    } else if (animatedNode6.BFSColor == this.mAnimatedGraphBFSColor) {
                        i15++;
                    }
                }
            }
        }
        if (i4 == i12) {
            this.mWarnedAboutGraphTraversal = false;
            return;
        }
        if (this.mWarnedAboutGraphTraversal) {
            return;
        }
        this.mWarnedAboutGraphTraversal = true;
        FLog.e(TAG, "Detected animation cycle or disconnected graph. ");
        Iterator<AnimatedNode> it = list.iterator();
        while (it.hasNext()) {
            FLog.e(TAG, it.next().prettyPrintWithChildren());
        }
        IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + (i15 > 0 ? "cycles (" + i15 + ")" : "disconnected regions") + ", there are " + i4 + " but toposort visited only " + i12);
        boolean z2 = this.mEventListenerInitializedForFabric;
        if (z2 && i15 == 0) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(illegalStateException));
        } else {
            if (!z2) {
                throw illegalStateException;
            }
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(illegalStateException));
        }
    }

    public void addAnimatedEventToView(int i2, String str, ReadableMap readableMap) {
        int i3 = readableMap.getInt("animatedValueTag");
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i3);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i3 + "] does not exist");
        }
        if (!(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i2 + "] connected to event handler (" + str + ") should be of type " + ValueAnimatedNode.class.getName());
        }
        ReadableArray array = readableMap.getArray("nativeEventPath");
        ArrayList arrayList = new ArrayList(array.size());
        for (int i4 = 0; i4 < array.size(); i4++) {
            arrayList.add(array.getString(i4));
        }
        String strNormalizeEventName = normalizeEventName(str);
        this.mEventDrivers.add(new EventAnimationDriver(strNormalizeEventName, i2, arrayList, (ValueAnimatedNode) animatedNode));
        if (strNormalizeEventName.equals("topScroll")) {
            addAnimatedEventToView(i2, "topScrollEnded", readableMap);
        }
    }

    public void connectAnimatedNodeToView(int i2, int i3) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + i2 + "] does not exist");
        }
        if (!(animatedNode instanceof PropsAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + i3 + "] should be of type " + PropsAnimatedNode.class.getName());
        }
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext == null) {
            throw new IllegalStateException("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + i3);
        }
        UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(reactApplicationContext, i3);
        if (uIManagerForReactTag == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + i3));
        } else {
            ((PropsAnimatedNode) animatedNode).connectToView(i3, uIManagerForReactTag);
            this.mUpdatedNodes.put(i2, animatedNode);
        }
    }

    public void connectAnimatedNodes(int i2, int i3) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + i2 + "] does not exist");
        }
        AnimatedNode animatedNode2 = this.mAnimatedNodes.get(i3);
        if (animatedNode2 == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + i3 + "] does not exist");
        }
        animatedNode.addChild(animatedNode2);
        this.mUpdatedNodes.put(i3, animatedNode2);
    }

    public void createAnimatedNode(int i2, ReadableMap readableMap) {
        AnimatedNode objectAnimatedNode;
        if (this.mAnimatedNodes.get(i2) != null) {
            throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + i2 + "] already exists");
        }
        String string = readableMap.getString("type");
        if ("style".equals(string)) {
            objectAnimatedNode = new StyleAnimatedNode(readableMap, this);
        } else if ("value".equals(string)) {
            objectAnimatedNode = new ValueAnimatedNode(readableMap);
        } else if ("color".equals(string)) {
            objectAnimatedNode = new ColorAnimatedNode(readableMap, this, this.mReactApplicationContext);
        } else if ("props".equals(string)) {
            objectAnimatedNode = new PropsAnimatedNode(readableMap, this);
        } else if ("interpolation".equals(string)) {
            objectAnimatedNode = new InterpolationAnimatedNode(readableMap);
        } else if ("addition".equals(string)) {
            objectAnimatedNode = new AdditionAnimatedNode(readableMap, this);
        } else if ("subtraction".equals(string)) {
            objectAnimatedNode = new SubtractionAnimatedNode(readableMap, this);
        } else if ("division".equals(string)) {
            objectAnimatedNode = new DivisionAnimatedNode(readableMap, this);
        } else if ("multiplication".equals(string)) {
            objectAnimatedNode = new MultiplicationAnimatedNode(readableMap, this);
        } else if ("modulus".equals(string)) {
            objectAnimatedNode = new ModulusAnimatedNode(readableMap, this);
        } else if ("diffclamp".equals(string)) {
            objectAnimatedNode = new DiffClampAnimatedNode(readableMap, this);
        } else if (ViewProps.TRANSFORM.equals(string)) {
            objectAnimatedNode = new TransformAnimatedNode(readableMap, this);
        } else if ("tracking".equals(string)) {
            objectAnimatedNode = new TrackingAnimatedNode(readableMap, this);
        } else {
            if (!"object".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            objectAnimatedNode = new ObjectAnimatedNode(readableMap, this);
        }
        objectAnimatedNode.tag = i2;
        this.mAnimatedNodes.put(i2, objectAnimatedNode);
        this.mUpdatedNodes.put(i2, objectAnimatedNode);
    }

    public void disconnectAnimatedNodeFromView(int i2, int i3) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + i2 + "] does not exist");
        }
        if (!(animatedNode instanceof PropsAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + i3 + "] should be of type " + PropsAnimatedNode.class.getName());
        }
        ((PropsAnimatedNode) animatedNode).disconnectFromView(i3);
    }

    public void disconnectAnimatedNodes(int i2, int i3) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + i2 + "] does not exist");
        }
        AnimatedNode animatedNode2 = this.mAnimatedNodes.get(i3);
        if (animatedNode2 == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + i3 + "] does not exist");
        }
        animatedNode.removeChild(animatedNode2);
        this.mUpdatedNodes.put(i3, animatedNode2);
    }

    public void dropAnimatedNode(int i2) {
        this.mAnimatedNodes.remove(i2);
        this.mUpdatedNodes.remove(i2);
    }

    public void extractAnimatedNodeOffset(int i2) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + i2 + "] does not exist, or is not a 'value' node");
        }
        ((ValueAnimatedNode) animatedNode).extractOffset();
    }

    public void flattenAnimatedNodeOffset(int i2) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + i2 + "] does not exist, or is not a 'value' node");
        }
        ((ValueAnimatedNode) animatedNode).flattenOffset();
    }

    public AnimatedNode getNodeById(int i2) {
        return this.mAnimatedNodes.get(i2);
    }

    Set<Integer> getTagsOfConnectedNodes(int i2, String str) {
        HashSet hashSet = new HashSet();
        ListIterator<EventAnimationDriver> listIterator = this.mEventDrivers.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver next = listIterator.next();
            if (next != null && str.equals(next.eventName) && i2 == next.viewTag) {
                hashSet.add(Integer.valueOf(next.viewTag));
                if (next.valueNode != null && next.valueNode.children != null) {
                    Iterator<AnimatedNode> it = next.valueNode.children.iterator();
                    while (it.hasNext()) {
                        hashSet.add(Integer.valueOf(it.next().tag));
                    }
                }
            }
        }
        return hashSet;
    }

    public void getValue(int i2, Callback callback) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + i2 + "] does not exist or is not a 'value' node");
        }
        double value = ((ValueAnimatedNode) animatedNode).getValue();
        if (callback != null) {
            callback.invoke(Double.valueOf(value));
        } else {
            if (this.mReactApplicationContext == null) {
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("tag", i2);
            writableMapCreateMap.putDouble("value", value);
            this.mReactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleGetValue", writableMapCreateMap);
        }
    }

    public boolean hasActiveAnimations() {
        return this.mActiveAnimations.size() > 0 || this.mUpdatedNodes.size() > 0;
    }

    public void initializeEventListenerForUIManagerType(int i2) {
        if (i2 == 2) {
            if (this.mEventListenerInitializedForFabric) {
                return;
            }
        } else if (this.mEventListenerInitializedForNonFabric) {
            return;
        }
        UIManager uIManager = UIManagerHelper.getUIManager(this.mReactApplicationContext, i2);
        if (uIManager != null) {
            uIManager.getEventDispatcher().addListener(this);
            if (i2 == 2) {
                this.mEventListenerInitializedForFabric = true;
            } else {
                this.mEventListenerInitializedForNonFabric = true;
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherListener
    public void onEventDispatch(final Event event) {
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(event);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.animated.NativeAnimatedNodesManager.1
                @Override // java.lang.Runnable
                public void run() {
                    NativeAnimatedNodesManager.this.handleEvent(event);
                }
            });
        }
    }

    public void removeAnimatedEventFromView(int i2, String str, int i3) {
        String strNormalizeEventName = normalizeEventName(str);
        ListIterator<EventAnimationDriver> listIterator = this.mEventDrivers.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver next = listIterator.next();
            if (strNormalizeEventName.equals(next.eventName) && i2 == next.viewTag && i3 == next.valueNode.tag) {
                listIterator.remove();
                return;
            }
        }
    }

    public void restoreDefaultValues(int i2) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == null) {
            return;
        }
        if (!(animatedNode instanceof PropsAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + PropsAnimatedNode.class.getName());
        }
        ((PropsAnimatedNode) animatedNode).restoreDefaultValues();
    }

    public void runUpdates(long j2) {
        UiThreadUtil.assertOnUiThread();
        for (int i2 = 0; i2 < this.mUpdatedNodes.size(); i2++) {
            this.mRunUpdateNodeList.add(this.mUpdatedNodes.valueAt(i2));
        }
        this.mUpdatedNodes.clear();
        boolean z2 = false;
        for (int i3 = 0; i3 < this.mActiveAnimations.size(); i3++) {
            AnimationDriver animationDriverValueAt = this.mActiveAnimations.valueAt(i3);
            animationDriverValueAt.runAnimationStep(j2);
            this.mRunUpdateNodeList.add(animationDriverValueAt.animatedValue);
            if (animationDriverValueAt.hasFinished) {
                z2 = true;
            }
        }
        updateNodes(this.mRunUpdateNodeList);
        this.mRunUpdateNodeList.clear();
        if (z2) {
            WritableArray writableArrayCreateArray = null;
            for (int size = this.mActiveAnimations.size() - 1; size >= 0; size--) {
                AnimationDriver animationDriverValueAt2 = this.mActiveAnimations.valueAt(size);
                if (animationDriverValueAt2.hasFinished) {
                    if (animationDriverValueAt2.endCallback != null) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean("finished", true);
                        writableMapCreateMap.putDouble("value", animationDriverValueAt2.animatedValue.nodeValue);
                        animationDriverValueAt2.endCallback.invoke(writableMapCreateMap);
                    } else if (this.mReactApplicationContext != null) {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        writableMapCreateMap2.putInt("animationId", animationDriverValueAt2.id);
                        writableMapCreateMap2.putBoolean("finished", true);
                        writableMapCreateMap2.putDouble("value", animationDriverValueAt2.animatedValue.nodeValue);
                        if (writableArrayCreateArray == null) {
                            writableArrayCreateArray = Arguments.createArray();
                        }
                        writableArrayCreateArray.pushMap(writableMapCreateMap2);
                    }
                    this.mActiveAnimations.removeAt(size);
                }
            }
            if (writableArrayCreateArray != null) {
                this.mReactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
            }
        }
    }

    public void setAnimatedNodeOffset(int i2, double d2) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + i2 + "] does not exist, or is not a 'value' node");
        }
        ((ValueAnimatedNode) animatedNode).offset = d2;
        this.mUpdatedNodes.put(i2, animatedNode);
    }

    public void setAnimatedNodeValue(int i2, double d2) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + i2 + "] does not exist, or is not a 'value' node");
        }
        stopAnimationsForNode(animatedNode);
        ((ValueAnimatedNode) animatedNode).nodeValue = d2;
        this.mUpdatedNodes.put(i2, animatedNode);
    }

    public void startAnimatingNode(int i2, int i3, ReadableMap readableMap, Callback callback) {
        AnimationDriver decayAnimation;
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i3);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i3 + "] does not exist");
        }
        if (!(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i3 + "] should be of type " + ValueAnimatedNode.class.getName());
        }
        AnimationDriver animationDriver = this.mActiveAnimations.get(i2);
        if (animationDriver != null) {
            animationDriver.resetConfig(readableMap);
            return;
        }
        String string = readableMap.getString("type");
        if (SentryStackTrace.JsonKeys.FRAMES.equals(string)) {
            decayAnimation = new FrameBasedAnimationDriver(readableMap);
        } else if ("spring".equals(string)) {
            decayAnimation = new SpringAnimation(readableMap);
        } else {
            if (!"decay".equals(string)) {
                throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i3 + "]: " + string);
            }
            decayAnimation = new DecayAnimation(readableMap);
        }
        decayAnimation.id = i2;
        decayAnimation.endCallback = callback;
        decayAnimation.animatedValue = (ValueAnimatedNode) animatedNode;
        this.mActiveAnimations.put(i2, decayAnimation);
    }

    public void startListeningToAnimatedNodeValue(int i2, AnimatedNodeValueListener animatedNodeValueListener) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i2 + "] does not exist, or is not a 'value' node");
        }
        ((ValueAnimatedNode) animatedNode).setValueListener(animatedNodeValueListener);
    }

    public void stopAnimation(int i2) {
        WritableArray writableArrayCreateArray;
        int i3 = 0;
        while (true) {
            writableArrayCreateArray = null;
            if (i3 >= this.mActiveAnimations.size()) {
                break;
            }
            AnimationDriver animationDriverValueAt = this.mActiveAnimations.valueAt(i3);
            if (animationDriverValueAt.id == i2) {
                if (animationDriverValueAt.endCallback != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    writableMapCreateMap.putDouble("value", animationDriverValueAt.animatedValue.nodeValue);
                    animationDriverValueAt.endCallback.invoke(writableMapCreateMap);
                } else if (this.mReactApplicationContext != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putInt("animationId", animationDriverValueAt.id);
                    writableMapCreateMap2.putBoolean("finished", false);
                    writableMapCreateMap2.putDouble("value", animationDriverValueAt.animatedValue.nodeValue);
                    writableArrayCreateArray = Arguments.createArray();
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.mActiveAnimations.removeAt(i3);
            } else {
                i3++;
            }
        }
        if (writableArrayCreateArray != null) {
            this.mReactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }

    public void stopListeningToAnimatedNodeValue(int i2) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i2 + "] does not exist, or is not a 'value' node");
        }
        ((ValueAnimatedNode) animatedNode).setValueListener(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateAnimatedNodeConfig(int i2, ReadableMap readableMap) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode == 0) {
            throw new JSApplicationIllegalArgumentException("updateAnimatedNode: Animated node [" + i2 + "] does not exist");
        }
        if (animatedNode instanceof AnimatedNodeWithUpdateableConfig) {
            stopAnimationsForNode(animatedNode);
            ((AnimatedNodeWithUpdateableConfig) animatedNode).onUpdateConfig(readableMap);
            this.mUpdatedNodes.put(i2, animatedNode);
        }
    }
}
