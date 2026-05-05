package com.swmansion.reanimated;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder;
import com.swmansion.reanimated.nativeProxy.NativeProxyCommon;
import com.swmansion.worklets.JSCallInvokerResolver;
import com.swmansion.worklets.WorkletsModule;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class NativeProxy extends NativeProxyCommon {
    private final HybridData mHybridData;
    private final AtomicBoolean mInvalidated;

    /* JADX INFO: renamed from: com.swmansion.reanimated.NativeProxy$1 */
    class AnonymousClass1 implements NativeMethodsHolder {
        final /* synthetic */ WeakReference val$weakLayoutAnimations;

        AnonymousClass1(WeakReference weakReference) {
            weakReference = weakReference;
        }

        @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
        public void cancelAnimation(int i2) {
            LayoutAnimations layoutAnimations = (LayoutAnimations) weakReference.get();
            if (layoutAnimations != null) {
                layoutAnimations.cancelAnimationForTag(i2);
            }
        }

        @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
        public void checkDuplicateSharedTag(int i2, int i3) {
            LayoutAnimations layoutAnimations = (LayoutAnimations) weakReference.get();
            if (layoutAnimations != null) {
                layoutAnimations.checkDuplicateSharedTag(i2, i3);
            }
        }

        @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
        public void clearAnimationConfig(int i2) {
            LayoutAnimations layoutAnimations = (LayoutAnimations) weakReference.get();
            if (layoutAnimations != null) {
                layoutAnimations.clearAnimationConfigForTag(i2);
            }
        }

        @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
        public int findPrecedingViewTagForTransition(int i2) {
            LayoutAnimations layoutAnimations = (LayoutAnimations) weakReference.get();
            if (layoutAnimations != null) {
                return layoutAnimations.findPrecedingViewTagForTransition(i2);
            }
            return -1;
        }

        @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
        public int[] getSharedGroup(int i2) {
            LayoutAnimations layoutAnimations = (LayoutAnimations) weakReference.get();
            return layoutAnimations != null ? layoutAnimations.getSharedGroup(i2) : new int[0];
        }

        @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
        public boolean hasAnimation(int i2, int i3) {
            LayoutAnimations layoutAnimations = (LayoutAnimations) weakReference.get();
            if (layoutAnimations != null) {
                return layoutAnimations.hasAnimationForTag(i2, i3);
            }
            return false;
        }

        @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
        public boolean isLayoutAnimationEnabled() {
            LayoutAnimations layoutAnimations = (LayoutAnimations) weakReference.get();
            if (layoutAnimations != null) {
                return layoutAnimations.isLayoutAnimationEnabled();
            }
            return false;
        }

        @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
        public boolean shouldAnimateExiting(int i2, boolean z2) {
            LayoutAnimations layoutAnimations = (LayoutAnimations) weakReference.get();
            if (layoutAnimations != null) {
                return layoutAnimations.shouldAnimateExiting(i2, z2);
            }
            return false;
        }

        @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
        public void startAnimation(int i2, int i3, HashMap<String, Object> map) {
            LayoutAnimations layoutAnimations = (LayoutAnimations) weakReference.get();
            if (layoutAnimations != null) {
                HashMap map2 = new HashMap();
                for (String str : map.keySet()) {
                    String string = map.get(str).toString();
                    if (str.endsWith("TransformMatrix")) {
                        map2.put(str, Utils.simplifyStringNumbersList(string));
                    } else {
                        map2.put(str, string);
                    }
                }
                layoutAnimations.startAnimationForTag(i2, i3, map2);
            }
        }
    }

    public NativeProxy(ReactApplicationContext reactApplicationContext, WorkletsModule workletsModule) {
        super(reactApplicationContext);
        this.mInvalidated = new AtomicBoolean(false);
        CallInvokerHolderImpl jSCallInvokerHolder = JSCallInvokerResolver.getJSCallInvokerHolder(reactApplicationContext);
        LayoutAnimations layoutAnimations = new LayoutAnimations(reactApplicationContext);
        this.mHybridData = initHybrid(workletsModule, ((JavaScriptContextHolder) Objects.requireNonNull(reactApplicationContext.getJavaScriptContextHolder())).get(), jSCallInvokerHolder, layoutAnimations, false);
        prepareLayoutAnimations(layoutAnimations);
        installJSIBindings();
    }

    public static NativeMethodsHolder createNativeMethodsHolder(LayoutAnimations layoutAnimations) {
        return new NativeMethodsHolder() { // from class: com.swmansion.reanimated.NativeProxy.1
            final /* synthetic */ WeakReference val$weakLayoutAnimations;

            AnonymousClass1(WeakReference weakReference) {
                weakReference = weakReference;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void cancelAnimation(int i2) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    layoutAnimations2.cancelAnimationForTag(i2);
                }
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void checkDuplicateSharedTag(int i2, int i3) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    layoutAnimations2.checkDuplicateSharedTag(i2, i3);
                }
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void clearAnimationConfig(int i2) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    layoutAnimations2.clearAnimationConfigForTag(i2);
                }
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public int findPrecedingViewTagForTransition(int i2) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    return layoutAnimations2.findPrecedingViewTagForTransition(i2);
                }
                return -1;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public int[] getSharedGroup(int i2) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                return layoutAnimations2 != null ? layoutAnimations2.getSharedGroup(i2) : new int[0];
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean hasAnimation(int i2, int i3) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    return layoutAnimations2.hasAnimationForTag(i2, i3);
                }
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean isLayoutAnimationEnabled() {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    return layoutAnimations2.isLayoutAnimationEnabled();
                }
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean shouldAnimateExiting(int i2, boolean z2) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    return layoutAnimations2.shouldAnimateExiting(i2, z2);
                }
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void startAnimation(int i2, int i3, HashMap<String, Object> map) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    HashMap map2 = new HashMap();
                    for (String str : map.keySet()) {
                        String string = map.get(str).toString();
                        if (str.endsWith("TransformMatrix")) {
                            map2.put(str, Utils.simplifyStringNumbersList(string));
                        } else {
                            map2.put(str, string);
                        }
                    }
                    layoutAnimations2.startAnimationForTag(i2, i3, map2);
                }
            }
        };
    }

    private native HybridData initHybrid(WorkletsModule workletsModule, long j2, CallInvokerHolderImpl callInvokerHolderImpl, LayoutAnimations layoutAnimations, boolean z2);

    private native void invalidateCpp();

    @Override // com.swmansion.reanimated.nativeProxy.NativeProxyCommon
    protected HybridData getHybridData() {
        return this.mHybridData;
    }

    protected void invalidate() {
        HybridData hybridData;
        if (this.mInvalidated.getAndSet(true) || (hybridData = this.mHybridData) == null || !hybridData.isValid()) {
            return;
        }
        invalidateCpp();
    }

    public native boolean isAnyHandlerWaitingForEvent(String str, int i2);

    public native void performOperations();
}
