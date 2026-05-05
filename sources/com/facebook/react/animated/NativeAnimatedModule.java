package com.facebook.react.animated;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.GuardedFrameCallback;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.common.ViewUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u000e 2&2 z'!$\u0017)\u0019\u0017~ \u0014$\u001a\u0012")
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    private final GuardedFrameCallback mAnimatedFrameCallback;
    private boolean mBatchingControlledByJS;
    private volatile long mCurrentBatchNumber;
    private volatile long mCurrentFrameNumber;
    private boolean mEnqueuedAnimationOnFrame;
    private boolean mInitializedForFabric;
    private boolean mInitializedForNonFabric;
    private final AtomicReference<NativeAnimatedNodesManager> mNodesManager;
    private int mNumFabricAnimations;
    private int mNumNonFabricAnimations;
    private final ConcurrentOperationQueue mOperations;
    private final ConcurrentOperationQueue mPreOperations;
    private final ReactChoreographer mReactChoreographer;
    private int mUIManagerType;

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$1 */
    class AnonymousClass1 extends GuardedFrameCallback {
        AnonymousClass1(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.uimanager.GuardedFrameCallback
        protected void doFrameGuarded(long j2) {
            try {
                NativeAnimatedModule.this.mEnqueuedAnimationOnFrame = false;
                NativeAnimatedNodesManager nodesManager = NativeAnimatedModule.this.getNodesManager();
                if (nodesManager != null && nodesManager.hasActiveAnimations()) {
                    nodesManager.runUpdates(j2);
                }
                if (nodesManager != null && NativeAnimatedModule.this.mReactChoreographer != null) {
                    if (!ReactNativeFeatureFlags.lazyAnimationCallbacks() || nodesManager.hasActiveAnimations()) {
                        NativeAnimatedModule.this.enqueueFrameCallback();
                    }
                }
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$10 */
    class AnonymousClass10 extends UIThreadOperation {
        final /* synthetic */ int val$tag;
        final /* synthetic */ double val$value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(int i2, double d2) {
            super();
            i = i2;
            d = d2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.setAnimatedNodeValue(i, d);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$11 */
    class AnonymousClass11 extends UIThreadOperation {
        final /* synthetic */ int val$tag;
        final /* synthetic */ double val$value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass11(int i2, double d2) {
            super();
            i = i2;
            d = d2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.setAnimatedNodeOffset(i, d);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$12 */
    class AnonymousClass12 extends UIThreadOperation {
        final /* synthetic */ int val$tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass12(int i2) {
            super();
            i = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.flattenAnimatedNodeOffset(i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$13 */
    class AnonymousClass13 extends UIThreadOperation {
        final /* synthetic */ int val$tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass13(int i2) {
            super();
            i = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.extractAnimatedNodeOffset(i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$14 */
    class AnonymousClass14 extends UIThreadOperation {
        final /* synthetic */ int val$animatedNodeTag;
        final /* synthetic */ ReadableMap val$animationConfig;
        final /* synthetic */ int val$animationId;
        final /* synthetic */ Callback val$endCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass14(int i2, int i3, ReadableMap readableMap, Callback callback) {
            super();
            i = i2;
            i = i3;
            readableMap = readableMap;
            callback = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.startAnimatingNode(i, i, readableMap, callback);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$15 */
    class AnonymousClass15 extends UIThreadOperation {
        final /* synthetic */ int val$animationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass15(int i2) {
            super();
            i = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.stopAnimation(i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$16 */
    class AnonymousClass16 extends UIThreadOperation {
        final /* synthetic */ int val$childNodeTag;
        final /* synthetic */ int val$parentNodeTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass16(int i2, int i3) {
            super();
            i = i2;
            i = i3;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.connectAnimatedNodes(i, i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$17 */
    class AnonymousClass17 extends UIThreadOperation {
        final /* synthetic */ int val$childNodeTag;
        final /* synthetic */ int val$parentNodeTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass17(int i2, int i3) {
            super();
            i = i2;
            i = i3;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.disconnectAnimatedNodes(i, i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$18 */
    class AnonymousClass18 extends UIThreadOperation {
        final /* synthetic */ int val$animatedNodeTag;
        final /* synthetic */ int val$viewTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass18(int i2, int i3) {
            super();
            i = i2;
            i = i3;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.connectAnimatedNodeToView(i, i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$19 */
    class AnonymousClass19 extends UIThreadOperation {
        final /* synthetic */ int val$animatedNodeTag;
        final /* synthetic */ int val$viewTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass19(int i2, int i3) {
            super();
            i = i2;
            i = i3;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.disconnectAnimatedNodeFromView(i, i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$2 */
    class AnonymousClass2 implements UIBlock {
        final /* synthetic */ long val$frameNo;

        AnonymousClass2(long j2) {
            j = j2;
        }

        @Override // com.facebook.react.uimanager.UIBlock
        public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            NativeAnimatedModule.this.mPreOperations.executeBatch(j, NativeAnimatedModule.this.getNodesManager());
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$20 */
    class AnonymousClass20 extends UIThreadOperation {
        final /* synthetic */ int val$animatedNodeTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass20(int i2) {
            super();
            i = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.restoreDefaultValues(i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$21 */
    class AnonymousClass21 extends UIThreadOperation {
        final /* synthetic */ ReadableMap val$eventMapping;
        final /* synthetic */ String val$eventName;
        final /* synthetic */ int val$viewTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass21(int i2, String str, ReadableMap readableMap) {
            super();
            i = i2;
            str = str;
            readableMap = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.addAnimatedEventToView(i, str, readableMap);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$22 */
    class AnonymousClass22 extends UIThreadOperation {
        final /* synthetic */ int val$animatedValueTag;
        final /* synthetic */ String val$eventName;
        final /* synthetic */ int val$viewTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass22(int i2, String str, int i3) {
            super();
            i = i2;
            str = str;
            i = i3;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.removeAnimatedEventFromView(i, str, i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$23 */
    class AnonymousClass23 extends UIThreadOperation {
        final /* synthetic */ int val$animatedValueNodeTag;
        final /* synthetic */ Callback val$callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass23(int i2, Callback callback) {
            super();
            i = i2;
            callback = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.getValue(i, callback);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$24 */
    class AnonymousClass24 extends UIThreadOperation {
        final /* synthetic */ int val$opBufferSize;
        final /* synthetic */ ReadableArray val$opsAndArgs;

        /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$24$1 */
        class AnonymousClass1 implements AnimatedNodeValueListener {
            final /* synthetic */ int val$tag;

            AnonymousClass1(int i2) {
                i = i2;
            }

            @Override // com.facebook.react.animated.AnimatedNodeValueListener
            public void onValueUpdate(double d2) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("tag", i);
                writableMapCreateMap.putDouble("value", d2);
                ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass24(int i2, ReadableArray readableArray) {
            super();
            i = i2;
            readableArray = readableArray;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                switch (AnonymousClass25.$SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.fromId(readableArray.getInt(i2)).ordinal()]) {
                    case 1:
                        i2 += 2;
                        nativeAnimatedNodesManager.getValue(readableArray.getInt(i3), null);
                        break;
                    case 2:
                        i2 += 2;
                        int i4 = readableArray.getInt(i3);
                        nativeAnimatedNodesManager.startListeningToAnimatedNodeValue(i4, new AnimatedNodeValueListener() { // from class: com.facebook.react.animated.NativeAnimatedModule.24.1
                            final /* synthetic */ int val$tag;

                            AnonymousClass1(int i42) {
                                i = i42;
                            }

                            @Override // com.facebook.react.animated.AnimatedNodeValueListener
                            public void onValueUpdate(double d2) {
                                WritableMap writableMapCreateMap = Arguments.createMap();
                                writableMapCreateMap.putInt("tag", i);
                                writableMapCreateMap.putDouble("value", d2);
                                ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                                if (reactApplicationContextIfActiveOrWarn != null) {
                                    reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
                                }
                            }
                        });
                        break;
                    case 3:
                        i2 += 2;
                        nativeAnimatedNodesManager.stopListeningToAnimatedNodeValue(readableArray.getInt(i3));
                        break;
                    case 4:
                        i2 += 2;
                        nativeAnimatedNodesManager.stopAnimation(readableArray.getInt(i3));
                        break;
                    case 5:
                        i2 += 2;
                        nativeAnimatedNodesManager.flattenAnimatedNodeOffset(readableArray.getInt(i3));
                        break;
                    case 6:
                        i2 += 2;
                        nativeAnimatedNodesManager.extractAnimatedNodeOffset(readableArray.getInt(i3));
                        break;
                    case 7:
                        i2 += 2;
                        nativeAnimatedNodesManager.restoreDefaultValues(readableArray.getInt(i3));
                        break;
                    case 8:
                        i2 += 2;
                        nativeAnimatedNodesManager.dropAnimatedNode(readableArray.getInt(i3));
                        break;
                    case 9:
                    case 10:
                        i2 += 2;
                        break;
                    case 11:
                        int i5 = i2 + 2;
                        i2 += 3;
                        nativeAnimatedNodesManager.createAnimatedNode(readableArray.getInt(i3), readableArray.getMap(i5));
                        break;
                    case 12:
                        int i6 = i2 + 2;
                        i2 += 3;
                        nativeAnimatedNodesManager.updateAnimatedNodeConfig(readableArray.getInt(i3), readableArray.getMap(i6));
                        break;
                    case 13:
                        int i7 = i2 + 2;
                        i2 += 3;
                        nativeAnimatedNodesManager.connectAnimatedNodes(readableArray.getInt(i3), readableArray.getInt(i7));
                        break;
                    case 14:
                        int i8 = i2 + 2;
                        i2 += 3;
                        nativeAnimatedNodesManager.disconnectAnimatedNodes(readableArray.getInt(i3), readableArray.getInt(i8));
                        break;
                    case 15:
                        int i9 = i2 + 2;
                        i2 += 3;
                        nativeAnimatedNodesManager.setAnimatedNodeValue(readableArray.getInt(i3), readableArray.getDouble(i9));
                        break;
                    case 16:
                        int i10 = i2 + 2;
                        i2 += 3;
                        nativeAnimatedNodesManager.setAnimatedNodeValue(readableArray.getInt(i3), readableArray.getDouble(i10));
                        break;
                    case 17:
                        int i11 = i2 + 2;
                        int i12 = readableArray.getInt(i3);
                        i2 += 3;
                        int i13 = readableArray.getInt(i11);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i13);
                        nativeAnimatedNodesManager.disconnectAnimatedNodeFromView(i12, i13);
                        break;
                    case 18:
                        if (ReactNativeFeatureFlags.lazyAnimationCallbacks()) {
                            NativeAnimatedModule.this.enqueueFrameCallback();
                        }
                        int i14 = readableArray.getInt(i3);
                        int i15 = i2 + 3;
                        int i16 = readableArray.getInt(i2 + 2);
                        i2 += 4;
                        nativeAnimatedNodesManager.startAnimatingNode(i14, i16, readableArray.getMap(i15), null);
                        break;
                    case 19:
                        int i17 = readableArray.getInt(i3);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i17);
                        int i18 = i2 + 3;
                        String string = readableArray.getString(i2 + 2);
                        i2 += 4;
                        nativeAnimatedNodesManager.removeAnimatedEventFromView(i17, string, readableArray.getInt(i18));
                        break;
                    case 20:
                        int i19 = i2 + 2;
                        i2 += 3;
                        nativeAnimatedNodesManager.connectAnimatedNodeToView(readableArray.getInt(i3), readableArray.getInt(i19));
                        break;
                    case 21:
                        int i20 = readableArray.getInt(i3);
                        int i21 = i2 + 3;
                        String string2 = readableArray.getString(i2 + 2);
                        i2 += 4;
                        nativeAnimatedNodesManager.addAnimatedEventToView(i20, string2, readableArray.getMap(i21));
                        break;
                    default:
                        throw new IllegalArgumentException("Batch animation execution op: unknown op code");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$25 */
    static /* synthetic */ class AnonymousClass25 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes;

        static {
            int[] iArr = new int[BatchExecutionOpCodes.values().length];
            $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes = iArr;
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_GET_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_STOP_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_ADD_LISTENER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_REMOVE_LISTENERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_START_ANIMATING_NODE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$3 */
    class AnonymousClass3 implements UIBlock {
        final /* synthetic */ long val$frameNo;

        AnonymousClass3(long j2) {
            j = j2;
        }

        @Override // com.facebook.react.uimanager.UIBlock
        public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            NativeAnimatedModule.this.mOperations.executeBatch(j, NativeAnimatedModule.this.getNodesManager());
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$4 */
    class AnonymousClass4 extends UIThreadOperation {
        final /* synthetic */ ReadableMap val$config;
        final /* synthetic */ int val$tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(int i2, ReadableMap readableMap) {
            super();
            i = i2;
            readableMap = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.createAnimatedNode(i, readableMap);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$5 */
    class AnonymousClass5 extends UIThreadOperation {
        final /* synthetic */ ReadableMap val$config;
        final /* synthetic */ int val$tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(int i2, ReadableMap readableMap) {
            super();
            i = i2;
            readableMap = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.updateAnimatedNodeConfig(i, readableMap);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$6 */
    class AnonymousClass6 implements AnimatedNodeValueListener {
        final /* synthetic */ int val$tag;

        AnonymousClass6(int i2) {
            i = i2;
        }

        @Override // com.facebook.react.animated.AnimatedNodeValueListener
        public void onValueUpdate(double d2) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("tag", i);
            writableMapCreateMap.putDouble("value", d2);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$7 */
    class AnonymousClass7 extends UIThreadOperation {
        final /* synthetic */ AnimatedNodeValueListener val$listener;
        final /* synthetic */ int val$tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(int i2, AnimatedNodeValueListener animatedNodeValueListener) {
            super();
            i = i2;
            animatedNodeValueListener = animatedNodeValueListener;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.startListeningToAnimatedNodeValue(i, animatedNodeValueListener);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$8 */
    class AnonymousClass8 extends UIThreadOperation {
        final /* synthetic */ int val$tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(int i2) {
            super();
            i = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.stopListeningToAnimatedNodeValue(i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$9 */
    class AnonymousClass9 extends UIThreadOperation {
        final /* synthetic */ int val$tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(int i2) {
            super();
            i = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            nativeAnimatedNodesManager.dropAnimatedNode(i);
        }
    }

    private enum BatchExecutionOpCodes {
        OP_CODE_CREATE_ANIMATED_NODE(1),
        OP_CODE_UPDATE_ANIMATED_NODE_CONFIG(2),
        OP_CODE_GET_VALUE(3),
        OP_START_LISTENING_TO_ANIMATED_NODE_VALUE(4),
        OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE(5),
        OP_CODE_CONNECT_ANIMATED_NODES(6),
        OP_CODE_DISCONNECT_ANIMATED_NODES(7),
        OP_CODE_START_ANIMATING_NODE(8),
        OP_CODE_STOP_ANIMATION(9),
        OP_CODE_SET_ANIMATED_NODE_VALUE(10),
        OP_CODE_SET_ANIMATED_NODE_OFFSET(11),
        OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET(12),
        OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET(13),
        OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW(14),
        OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW(15),
        OP_CODE_RESTORE_DEFAULT_VALUES(16),
        OP_CODE_DROP_ANIMATED_NODE(17),
        OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW(18),
        OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW(19),
        OP_CODE_ADD_LISTENER(20),
        OP_CODE_REMOVE_LISTENERS(21);

        private static BatchExecutionOpCodes[] valueMap = null;
        private final int value;

        BatchExecutionOpCodes(int i2) {
            this.value = i2;
        }

        public static BatchExecutionOpCodes fromId(int i2) {
            if (valueMap == null) {
                valueMap = values();
            }
            return valueMap[i2 - 1];
        }

        public int getValue() {
            return this.value;
        }
    }

    private class ConcurrentOperationQueue {
        private UIThreadOperation mPeekedOperation;
        private final Queue<UIThreadOperation> mQueue;

        private ConcurrentOperationQueue() {
            this.mQueue = new ConcurrentLinkedQueue();
            this.mPeekedOperation = null;
        }

        /* synthetic */ ConcurrentOperationQueue(NativeAnimatedModule nativeAnimatedModule, ConcurrentOperationQueueIA concurrentOperationQueueIA) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0019 A[EDGE_INSN: B:41:0x0019->B:32:0x0019 BREAK  A[LOOP:0: B:28:0x000d->B:40:0x0037], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.util.List<com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation> drainQueueIntoList(long r7) {
            /*
                r6 = this;
                boolean r0 = r6.isEmpty()
                r5 = 0
                if (r0 == 0) goto L8
                return r5
            L8:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
            Ld:
                com.facebook.react.animated.NativeAnimatedModule$UIThreadOperation r0 = r6.mPeekedOperation
                if (r0 == 0) goto L21
                long r1 = r0.getBatchNumber()
                int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                if (r0 <= 0) goto L1a
            L19:
                return r4
            L1a:
                com.facebook.react.animated.NativeAnimatedModule$UIThreadOperation r0 = r6.mPeekedOperation
                r4.add(r0)
                r6.mPeekedOperation = r5
            L21:
                java.util.Queue<com.facebook.react.animated.NativeAnimatedModule$UIThreadOperation> r0 = r6.mQueue
                java.lang.Object r3 = r0.poll()
                com.facebook.react.animated.NativeAnimatedModule$UIThreadOperation r3 = (com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation) r3
                if (r3 != 0) goto L2c
                goto L19
            L2c:
                long r1 = r3.getBatchNumber()
                int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                if (r0 <= 0) goto L37
                r6.mPeekedOperation = r3
                goto L19
            L37:
                r4.add(r3)
                goto Ld
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.NativeAnimatedModule.ConcurrentOperationQueue.drainQueueIntoList(long):java.util.List");
        }

        void add(UIThreadOperation uIThreadOperation) {
            this.mQueue.add(uIThreadOperation);
        }

        void executeBatch(long j2, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            List<UIThreadOperation> listDrainQueueIntoList = drainQueueIntoList(j2);
            if (listDrainQueueIntoList != null) {
                Iterator<UIThreadOperation> it = listDrainQueueIntoList.iterator();
                while (it.hasNext()) {
                    it.next().execute(nativeAnimatedNodesManager);
                }
            }
        }

        boolean isEmpty() {
            return this.mQueue.isEmpty() && this.mPeekedOperation == null;
        }
    }

    private abstract class UIThreadOperation {
        long mBatchNumber;

        private UIThreadOperation() {
            this.mBatchNumber = -1L;
        }

        /* synthetic */ UIThreadOperation(NativeAnimatedModule nativeAnimatedModule, UIThreadOperationIA uIThreadOperationIA) {
            this();
        }

        abstract void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager);

        public long getBatchNumber() {
            return this.mBatchNumber;
        }

        public void setBatchNumber(long j2) {
            this.mBatchNumber = j2;
        }
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ConcurrentOperationQueue();
        this.mPreOperations = new ConcurrentOperationQueue();
        this.mNodesManager = new AtomicReference<>();
        this.mBatchingControlledByJS = false;
        this.mInitializedForFabric = false;
        this.mInitializedForNonFabric = false;
        this.mEnqueuedAnimationOnFrame = false;
        this.mUIManagerType = 1;
        this.mNumFabricAnimations = 0;
        this.mNumNonFabricAnimations = 0;
        this.mReactChoreographer = ReactChoreographer.getInstance();
        this.mAnimatedFrameCallback = new GuardedFrameCallback(reactApplicationContext) { // from class: com.facebook.react.animated.NativeAnimatedModule.1
            AnonymousClass1(ReactContext reactApplicationContext2) {
                super(reactApplicationContext2);
            }

            @Override // com.facebook.react.uimanager.GuardedFrameCallback
            protected void doFrameGuarded(long j2) {
                try {
                    NativeAnimatedModule.this.mEnqueuedAnimationOnFrame = false;
                    NativeAnimatedNodesManager nodesManager = NativeAnimatedModule.this.getNodesManager();
                    if (nodesManager != null && nodesManager.hasActiveAnimations()) {
                        nodesManager.runUpdates(j2);
                    }
                    if (nodesManager != null && NativeAnimatedModule.this.mReactChoreographer != null) {
                        if (!ReactNativeFeatureFlags.lazyAnimationCallbacks() || nodesManager.hasActiveAnimations()) {
                            NativeAnimatedModule.this.enqueueFrameCallback();
                        }
                    }
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
        };
    }

    private void addOperation(UIThreadOperation uIThreadOperation) {
        uIThreadOperation.setBatchNumber(this.mCurrentBatchNumber);
        this.mOperations.add(uIThreadOperation);
    }

    private void addPreOperation(UIThreadOperation uIThreadOperation) {
        uIThreadOperation.setBatchNumber(this.mCurrentBatchNumber);
        this.mPreOperations.add(uIThreadOperation);
    }

    private void addUnbatchedOperation(UIThreadOperation uIThreadOperation) {
        uIThreadOperation.setBatchNumber(-1L);
        this.mOperations.add(uIThreadOperation);
    }

    private void clearFrameCallback() {
        ((ReactChoreographer) Assertions.assertNotNull(this.mReactChoreographer)).removeFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = false;
    }

    public void decrementInFlightAnimationsForViewTag(int i2) {
        if (ViewUtil.getUIManagerType(i2) == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i3 = this.mNumNonFabricAnimations;
        if (i3 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else {
            if (this.mNumFabricAnimations != 0 || i3 <= 0 || this.mUIManagerType == 1) {
                return;
            }
            this.mUIManagerType = 1;
        }
    }

    public void enqueueFrameCallback() {
        if (this.mEnqueuedAnimationOnFrame) {
            return;
        }
        ((ReactChoreographer) Assertions.assertNotNull(this.mReactChoreographer)).postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = true;
    }

    private void initializeLifecycleEventListenersForViewTag(int i2) {
        UIManager uIManager;
        int uIManagerType = ViewUtil.getUIManagerType(i2);
        this.mUIManagerType = uIManagerType;
        if (uIManagerType == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        NativeAnimatedNodesManager nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.initializeEventListenerForUIManagerType(this.mUIManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException(NativeAnimatedModuleSpec.NAME, new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mUIManagerType == 2) {
            if (this.mInitializedForFabric) {
                return;
            }
        } else if (this.mInitializedForNonFabric) {
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (uIManager = UIManagerHelper.getUIManager(reactApplicationContext, this.mUIManagerType)) == null) {
            return;
        }
        uIManager.addUIManagerEventListener(this);
        if (this.mUIManagerType == 2) {
            this.mInitializedForFabric = true;
        } else {
            this.mInitializedForNonFabric = true;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double d2, String str, ReadableMap readableMap) {
        int i2 = (int) d2;
        initializeLifecycleEventListenersForViewTag(i2);
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.21
            final /* synthetic */ ReadableMap val$eventMapping;
            final /* synthetic */ String val$eventName;
            final /* synthetic */ int val$viewTag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass21(int i22, String str2, ReadableMap readableMap2) {
                super();
                i = i22;
                str = str2;
                readableMap = readableMap2;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.addAnimatedEventToView(i, str, readableMap);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double d2, double d3) {
        int i2 = (int) d3;
        initializeLifecycleEventListenersForViewTag(i2);
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.18
            final /* synthetic */ int val$animatedNodeTag;
            final /* synthetic */ int val$viewTag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass18(int i22, int i23) {
                super();
                i = i22;
                i = i23;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.connectAnimatedNodeToView(i, i);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double d2, double d3) {
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.16
            final /* synthetic */ int val$childNodeTag;
            final /* synthetic */ int val$parentNodeTag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass16(int i2, int i3) {
                super();
                i = i2;
                i = i3;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.connectAnimatedNodes(i, i);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double d2, ReadableMap readableMap) {
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.4
            final /* synthetic */ ReadableMap val$config;
            final /* synthetic */ int val$tag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(int i2, ReadableMap readableMap2) {
                super();
                i = i2;
                readableMap = readableMap2;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.createAnimatedNode(i, readableMap);
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
        if (this.mUIManagerType != 2) {
            return;
        }
        long j2 = this.mCurrentBatchNumber - 1;
        if (!this.mBatchingControlledByJS) {
            this.mCurrentFrameNumber++;
            if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                j2 = this.mCurrentBatchNumber;
            }
        }
        this.mPreOperations.executeBatch(j2, getNodesManager());
        this.mOperations.executeBatch(j2, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
        this.mCurrentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double d2, double d3) {
        int i2 = (int) d3;
        decrementInFlightAnimationsForViewTag(i2);
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.19
            final /* synthetic */ int val$animatedNodeTag;
            final /* synthetic */ int val$viewTag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass19(int i22, int i23) {
                super();
                i = i22;
                i = i23;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.disconnectAnimatedNodeFromView(i, i);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double d2, double d3) {
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.17
            final /* synthetic */ int val$childNodeTag;
            final /* synthetic */ int val$parentNodeTag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass17(int i2, int i3) {
                super();
                i = i2;
                i = i3;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.disconnectAnimatedNodes(i, i);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double d2) {
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.9
            final /* synthetic */ int val$tag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(int i2) {
                super();
                i = i2;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.dropAnimatedNode(i);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double d2) {
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.13
            final /* synthetic */ int val$tag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass13(int i2) {
                super();
                i = i2;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.extractAnimatedNodeOffset(i);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.mBatchingControlledByJS = false;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double d2) {
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.12
            final /* synthetic */ int val$tag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass12(int i2) {
                super();
                i = i2;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.flattenAnimatedNodeOffset(i);
            }
        });
    }

    public NativeAnimatedNodesManager getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.mNodesManager, null, new NativeAnimatedNodesManager(reactApplicationContextIfActiveOrWarn));
        }
        return this.mNodesManager.get();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double d2, Callback callback) {
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.23
            final /* synthetic */ int val$animatedValueNodeTag;
            final /* synthetic */ Callback val$callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass23(int i2, Callback callback2) {
                super();
                i = i2;
                callback = callback2;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.getValue(i, callback);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
        int size = readableArray.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            switch (AnonymousClass25.$SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.fromId(readableArray.getInt(i2)).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    i2 += 2;
                    continue;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    i2 += 3;
                    continue;
                case 18:
                case 19:
                    break;
                case 20:
                    int i4 = i2 + 2;
                    i2 += 3;
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i4));
                    continue;
                case 21:
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i3));
                    break;
                default:
                    throw new IllegalArgumentException("Batch animation execution op: fetching viewTag: unknown op code");
            }
            i2 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.24
            final /* synthetic */ int val$opBufferSize;
            final /* synthetic */ ReadableArray val$opsAndArgs;

            /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$24$1 */
            class AnonymousClass1 implements AnimatedNodeValueListener {
                final /* synthetic */ int val$tag;

                AnonymousClass1(int i42) {
                    i = i42;
                }

                @Override // com.facebook.react.animated.AnimatedNodeValueListener
                public void onValueUpdate(double d2) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putInt("tag", i);
                    writableMapCreateMap.putDouble("value", d2);
                    ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                    if (reactApplicationContextIfActiveOrWarn != null) {
                        reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass24(int size2, ReadableArray readableArray2) {
                super();
                i = size2;
                readableArray = readableArray2;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                int i22 = 0;
                while (i22 < i) {
                    int i32 = i22 + 1;
                    switch (AnonymousClass25.$SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes[BatchExecutionOpCodes.fromId(readableArray.getInt(i22)).ordinal()]) {
                        case 1:
                            i22 += 2;
                            nativeAnimatedNodesManager.getValue(readableArray.getInt(i32), null);
                            break;
                        case 2:
                            i22 += 2;
                            int i42 = readableArray.getInt(i32);
                            nativeAnimatedNodesManager.startListeningToAnimatedNodeValue(i42, new AnimatedNodeValueListener() { // from class: com.facebook.react.animated.NativeAnimatedModule.24.1
                                final /* synthetic */ int val$tag;

                                AnonymousClass1(int i422) {
                                    i = i422;
                                }

                                @Override // com.facebook.react.animated.AnimatedNodeValueListener
                                public void onValueUpdate(double d2) {
                                    WritableMap writableMapCreateMap = Arguments.createMap();
                                    writableMapCreateMap.putInt("tag", i);
                                    writableMapCreateMap.putDouble("value", d2);
                                    ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                                    if (reactApplicationContextIfActiveOrWarn != null) {
                                        reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
                                    }
                                }
                            });
                            break;
                        case 3:
                            i22 += 2;
                            nativeAnimatedNodesManager.stopListeningToAnimatedNodeValue(readableArray.getInt(i32));
                            break;
                        case 4:
                            i22 += 2;
                            nativeAnimatedNodesManager.stopAnimation(readableArray.getInt(i32));
                            break;
                        case 5:
                            i22 += 2;
                            nativeAnimatedNodesManager.flattenAnimatedNodeOffset(readableArray.getInt(i32));
                            break;
                        case 6:
                            i22 += 2;
                            nativeAnimatedNodesManager.extractAnimatedNodeOffset(readableArray.getInt(i32));
                            break;
                        case 7:
                            i22 += 2;
                            nativeAnimatedNodesManager.restoreDefaultValues(readableArray.getInt(i32));
                            break;
                        case 8:
                            i22 += 2;
                            nativeAnimatedNodesManager.dropAnimatedNode(readableArray.getInt(i32));
                            break;
                        case 9:
                        case 10:
                            i22 += 2;
                            break;
                        case 11:
                            int i5 = i22 + 2;
                            i22 += 3;
                            nativeAnimatedNodesManager.createAnimatedNode(readableArray.getInt(i32), readableArray.getMap(i5));
                            break;
                        case 12:
                            int i6 = i22 + 2;
                            i22 += 3;
                            nativeAnimatedNodesManager.updateAnimatedNodeConfig(readableArray.getInt(i32), readableArray.getMap(i6));
                            break;
                        case 13:
                            int i7 = i22 + 2;
                            i22 += 3;
                            nativeAnimatedNodesManager.connectAnimatedNodes(readableArray.getInt(i32), readableArray.getInt(i7));
                            break;
                        case 14:
                            int i8 = i22 + 2;
                            i22 += 3;
                            nativeAnimatedNodesManager.disconnectAnimatedNodes(readableArray.getInt(i32), readableArray.getInt(i8));
                            break;
                        case 15:
                            int i9 = i22 + 2;
                            i22 += 3;
                            nativeAnimatedNodesManager.setAnimatedNodeValue(readableArray.getInt(i32), readableArray.getDouble(i9));
                            break;
                        case 16:
                            int i10 = i22 + 2;
                            i22 += 3;
                            nativeAnimatedNodesManager.setAnimatedNodeValue(readableArray.getInt(i32), readableArray.getDouble(i10));
                            break;
                        case 17:
                            int i11 = i22 + 2;
                            int i12 = readableArray.getInt(i32);
                            i22 += 3;
                            int i13 = readableArray.getInt(i11);
                            NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i13);
                            nativeAnimatedNodesManager.disconnectAnimatedNodeFromView(i12, i13);
                            break;
                        case 18:
                            if (ReactNativeFeatureFlags.lazyAnimationCallbacks()) {
                                NativeAnimatedModule.this.enqueueFrameCallback();
                            }
                            int i14 = readableArray.getInt(i32);
                            int i15 = i22 + 3;
                            int i16 = readableArray.getInt(i22 + 2);
                            i22 += 4;
                            nativeAnimatedNodesManager.startAnimatingNode(i14, i16, readableArray.getMap(i15), null);
                            break;
                        case 19:
                            int i17 = readableArray.getInt(i32);
                            NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i17);
                            int i18 = i22 + 3;
                            String string = readableArray.getString(i22 + 2);
                            i22 += 4;
                            nativeAnimatedNodesManager.removeAnimatedEventFromView(i17, string, readableArray.getInt(i18));
                            break;
                        case 20:
                            int i19 = i22 + 2;
                            i22 += 3;
                            nativeAnimatedNodesManager.connectAnimatedNodeToView(readableArray.getInt(i32), readableArray.getInt(i19));
                            break;
                        case 21:
                            int i20 = readableArray.getInt(i32);
                            int i21 = i22 + 3;
                            String string2 = readableArray.getString(i22 + 2);
                            i22 += 4;
                            nativeAnimatedNodesManager.addAnimatedEventToView(i20, string2, readableArray.getMap(i21));
                            break;
                        default:
                            throw new IllegalArgumentException("Batch animation execution op: unknown op code");
                    }
                }
            }
        });
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double d2, String str, double d3) {
        int i2 = (int) d2;
        decrementInFlightAnimationsForViewTag(i2);
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.22
            final /* synthetic */ int val$animatedValueTag;
            final /* synthetic */ String val$eventName;
            final /* synthetic */ int val$viewTag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass22(int i22, String str2, int i3) {
                super();
                i = i22;
                str = str2;
                i = i3;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.removeAnimatedEventFromView(i, str, i);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double d2) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double d2) {
        addPreOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.20
            final /* synthetic */ int val$animatedNodeTag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass20(int i2) {
                super();
                i = i2;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.restoreDefaultValues(i);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double d2, double d3) {
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.11
            final /* synthetic */ int val$tag;
            final /* synthetic */ double val$value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass11(int i2, double d32) {
                super();
                i = i2;
                d = d32;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.setAnimatedNodeOffset(i, d);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double d2, double d3) {
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.10
            final /* synthetic */ int val$tag;
            final /* synthetic */ double val$value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(int i2, double d32) {
                super();
                i = i2;
                d = d32;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.setAnimatedNodeValue(i, d);
            }
        });
    }

    @VisibleForTesting
    public void setNodesManager(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.mNodesManager.set(nativeAnimatedNodesManager);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double d2, double d3, ReadableMap readableMap, Callback callback) {
        addUnbatchedOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.14
            final /* synthetic */ int val$animatedNodeTag;
            final /* synthetic */ ReadableMap val$animationConfig;
            final /* synthetic */ int val$animationId;
            final /* synthetic */ Callback val$endCallback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass14(int i2, int i3, ReadableMap readableMap2, Callback callback2) {
                super();
                i = i2;
                i = i3;
                readableMap = readableMap2;
                callback = callback2;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.startAnimatingNode(i, i, readableMap, callback);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double d2) {
        int i2 = (int) d2;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.7
            final /* synthetic */ AnimatedNodeValueListener val$listener;
            final /* synthetic */ int val$tag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(int i22, AnimatedNodeValueListener animatedNodeValueListener) {
                super();
                i = i22;
                animatedNodeValueListener = animatedNodeValueListener;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.startListeningToAnimatedNodeValue(i, animatedNodeValueListener);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double d2) {
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.15
            final /* synthetic */ int val$animationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass15(int i2) {
                super();
                i = i2;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.stopAnimation(i);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double d2) {
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.8
            final /* synthetic */ int val$tag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(int i2) {
                super();
                i = i2;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.stopListeningToAnimatedNodeValue(i);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double d2, ReadableMap readableMap) {
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.5
            final /* synthetic */ ReadableMap val$config;
            final /* synthetic */ int val$tag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(int i2, ReadableMap readableMap2) {
                super();
                i = i2;
                readableMap = readableMap2;
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.updateAnimatedNodeConfig(i, readableMap);
            }
        });
    }

    public void userDrivenScrollEnded(int i2) {
        NativeAnimatedNodesManager nativeAnimatedNodesManager = this.mNodesManager.get();
        if (nativeAnimatedNodesManager == null) {
            return;
        }
        Set<Integer> tagsOfConnectedNodes = nativeAnimatedNodesManager.getTagsOfConnectedNodes(i2, "topScrollEnded");
        if (tagsOfConnectedNodes.isEmpty()) {
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<Integer> it = tagsOfConnectedNodes.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushInt(it.next().intValue());
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("tags", writableArrayCreateArray);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onUserDrivenAnimationEnded", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        if ((this.mOperations.isEmpty() && this.mPreOperations.isEmpty()) || this.mUIManagerType == 2) {
            return;
        }
        long j2 = this.mCurrentBatchNumber;
        this.mCurrentBatchNumber = 1 + j2;
        AnonymousClass2 anonymousClass2 = new UIBlock() { // from class: com.facebook.react.animated.NativeAnimatedModule.2
            final /* synthetic */ long val$frameNo;

            AnonymousClass2(long j22) {
                j = j22;
            }

            @Override // com.facebook.react.uimanager.UIBlock
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                NativeAnimatedModule.this.mPreOperations.executeBatch(j, NativeAnimatedModule.this.getNodesManager());
            }
        };
        AnonymousClass3 anonymousClass3 = new UIBlock() { // from class: com.facebook.react.animated.NativeAnimatedModule.3
            final /* synthetic */ long val$frameNo;

            AnonymousClass3(long j22) {
                j = j22;
            }

            @Override // com.facebook.react.uimanager.UIBlock
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                NativeAnimatedModule.this.mOperations.executeBatch(j, NativeAnimatedModule.this.getNodesManager());
            }
        };
        UIManagerModule uIManagerModule = (UIManagerModule) uIManager;
        uIManagerModule.prependUIBlock(anonymousClass2);
        uIManagerModule.addUIBlock(anonymousClass3);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
    }
}
