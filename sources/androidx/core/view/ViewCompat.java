package androidx.core.view;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.ReplaceWith;
import androidx.collection.SimpleArrayMap;
import androidx.core.R;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.autofill.AutofillIdCompat;
import androidx.core.view.contentcapture.ContentCaptureSessionCompat;
import androidx.core.viewtree.ViewTree;
import androidx.webkit.ProxyConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class ViewCompat {
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    @Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;

    @Deprecated
    public static final int LAYOUT_DIRECTION_INHERIT = 2;

    @Deprecated
    public static final int LAYOUT_DIRECTION_LOCALE = 3;

    @Deprecated
    public static final int LAYOUT_DIRECTION_LTR = 0;

    @Deprecated
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;

    @Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    private static final String TAG = "ViewCompat";
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    private static boolean sAccessibilityDelegateCheckFailed = false;
    private static Field sAccessibilityDelegateField = null;
    private static Method sChildrenDrawingOrderMethod = null;
    private static Method sDispatchFinishTemporaryDetach = null;
    private static Method sDispatchStartTemporaryDetach = null;
    private static boolean sTempDetachBound = false;
    private static ThreadLocal<Rect> sThreadLocalRect = null;
    private static WeakHashMap<View, String> sTransitionNameMap = null;
    private static boolean sTryHiddenViewTransformMatrixToGlobal = true;
    private static WeakHashMap<View, ViewPropertyAnimatorCompat> sViewPropertyAnimatorMap = null;
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final OnReceiveContentViewBehavior NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = new OnReceiveContentViewBehavior() { // from class: androidx.core.view.ViewCompat$$ExternalSyntheticLambda0
        @Override // androidx.core.view.OnReceiveContentViewBehavior
        public final ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
            return ViewCompat.lambda$static$0(contentInfoCompat);
        }
    };
    private static final AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager = new AccessibilityPaneVisibilityManager();

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    static /* synthetic */ ContentInfoCompat lambda$static$0(ContentInfoCompat contentInfoCompat) {
        return contentInfoCompat;
    }

    private static Rect getEmptyTempRect() {
        if (sThreadLocalRect == null) {
            sThreadLocalRect = new ThreadLocal<>();
        }
        Rect rect = sThreadLocalRect.get();
        if (rect == null) {
            rect = new Rect();
            sThreadLocalRect.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void saveAttributeDataForStyleable(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.saveAttributeDataForStyleable(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kc^W+@<%\\@\u0018.\u001dxvVQ<\u0014]J[u\u001e \rmge.n[\u0002", imports = {})
    @Deprecated
    public static boolean canScrollHorizontally(View view, int i2) {
        return view.canScrollHorizontally(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kc^W+@<%\\@&$\u001d\u0004eJD4\u001fj\u0006F7,\u001c}|m`3(", imports = {})
    @Deprecated
    public static boolean canScrollVertically(View view, int i2) {
        return view.canScrollVertically(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]'S/(C7B.\u0017{IVG-Z\u001a", imports = {})
    @Deprecated
    public static int getOverScrollMode(View view) {
        return view.getOverScrollMode();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]'S/(C7B.\u0017{IVG-Z`TG@\r\u001a\rwp]\u0012nQ>x", imports = {})
    @Deprecated
    public static void setOverScrollMode(View view, int i2) {
        view.setOverScrollMode(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001aw&!mom^D>>\u001b173$\u001e\u0003eIL4\u001ceW'D\u001f%\u000f0ig*ma\u0002", imports = {})
    @Deprecated
    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001aw&!fnf]A>6\u001fj9\u0011\"\u000etoZL*\u001c]GVG~-\u007fvx\u0019*uRGDd", imports = {})
    @Deprecated
    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001aw&!fnf]A>6\u001fj9\u0011\"\u000etoZL*\u001c]GVG\b&~mM_+n\u0015B>\"'Q\f\u0001w^\u0004\u007f\"\u001eq", imports = {})
    @Deprecated
    public static void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.unwrap());
    }

    public static void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (getAccessibilityDelegateInternal(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        setImportantForAccessibilityIfNeeded(view);
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.getBridge());
    }

    public static void setAutofillHints(View view, String... strArr) {
        Api26Impl.setAutofillHints(view, strArr);
    }

    public static int getImportantForAutofill(View view) {
        return Api26Impl.getImportantForAutofill(view);
    }

    public static void setImportantForAutofill(View view, int i2) {
        Api26Impl.setImportantForAutofill(view, i2);
    }

    public static boolean isImportantForAutofill(View view) {
        return Api26Impl.isImportantForAutofill(view);
    }

    public static AutofillIdCompat getAutofillId(View view) {
        return AutofillIdCompat.toAutofillIdCompat(Api26Impl.getAutofillId(view));
    }

    public static void setAutofillId(View view, AutofillIdCompat autofillIdCompat) {
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setAutofillId(view, autofillIdCompat);
        }
    }

    public static void setImportantForContentCapture(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setImportantForContentCapture(view, i2);
        }
    }

    public static int getImportantForContentCapture(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getImportantForContentCapture(view);
        }
        return 0;
    }

    public static boolean isImportantForContentCapture(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.isImportantForContentCapture(view);
        }
        return false;
    }

    public static ContentCaptureSessionCompat getContentCaptureSession(View view) {
        ContentCaptureSession contentCaptureSession;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSession = Api29Impl.getContentCaptureSession(view)) == null) {
            return null;
        }
        return ContentCaptureSessionCompat.toContentCaptureSessionCompat(contentCaptureSession, view);
    }

    public static void setContentCaptureSession(View view, ContentCaptureSessionCompat contentCaptureSessionCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setContentCaptureSession(view, contentCaptureSessionCompat);
        }
    }

    public static boolean hasAccessibilityDelegate(View view) {
        return getAccessibilityDelegateInternal(view) != null;
    }

    public static AccessibilityDelegateCompat getAccessibilityDelegate(View view) {
        View.AccessibilityDelegate accessibilityDelegateInternal = getAccessibilityDelegateInternal(view);
        if (accessibilityDelegateInternal == null) {
            return null;
        }
        if (accessibilityDelegateInternal instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter) {
            return ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) accessibilityDelegateInternal).mCompat;
        }
        return new AccessibilityDelegateCompat(accessibilityDelegateInternal);
    }

    static void ensureAccessibilityDelegateCompat(View view) {
        AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new AccessibilityDelegateCompat();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
    }

    private static View.AccessibilityDelegate getAccessibilityDelegateInternal(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getAccessibilityDelegate(view);
        }
        return getAccessibilityDelegateThroughReflection(view);
    }

    private static View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(View view) {
        if (sAccessibilityDelegateCheckFailed) {
            return null;
        }
        if (sAccessibilityDelegateField == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                sAccessibilityDelegateField = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                sAccessibilityDelegateCheckFailed = true;
                return null;
            }
        }
        try {
            Object obj = sAccessibilityDelegateField.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            sAccessibilityDelegateCheckFailed = true;
            return null;
        }
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kh^\\,O+$c=5-\u001fbpHW-Z\u001a", imports = {})
    @Deprecated
    public static boolean hasTransientState(View view) {
        return view.hasTransientState();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb] >=\nb5>2\u0014tj[6<\u0014eC\n6\u001b*nze_8hRGD\u000f,\u0005\u000bw)", imports = {})
    @Deprecated
    public static void setHasTransientState(View view, boolean z2) {
        view.setHasTransientState(z2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kpl\\L&8,Q@9#\f\u0004a6Q\t!ZKCB#&\t0-", imports = {})
    @Deprecated
    public static void postInvalidateOnAnimation(View view) {
        view.postInvalidateOnAnimation();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kpl\\L&8,Q@9#\f\u0004a6Q\t!ZKCB#&\t0pV+s\u0019xD+(O6\u0005iS\u000b\u0004&\u0015+5&\u0016\u0005o\u0017", imports = {})
    @Deprecated
    public static void postInvalidateOnAnimation(View view, int i2, int i3, int i4, int i5) {
        view.postInvalidateOnAnimation(i2, i3, i4, i5);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kpl\\L,8v^== \u001fxkU\u000b)\u0016eGQ<b", imports = {})
    @Deprecated
    public static void postOnAnimation(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kpl\\L,8v^== \u001fxkU'-\u001fRWG2a\u0018}|m`3+\r=5(\u0019\u001dc{lX\f\u0003#", imports = {})
    @Deprecated
    public static void postOnAnimationDelayed(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]!J:%bH1-\u001fUkY$+\u0016VQU7\u001c \u0007qxjl(", imports = {})
    @Deprecated
    public static int getImportantForAccessibility(View view) {
        return view.getImportantForAccessibility();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]!J:%bH1-\u001fUkY$+\u0016VQU7\u001c \u0007qxjll\\=5d", imports = {})
    @Deprecated
    public static void setImportantForAccessibility(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }

    public static boolean isImportantForAccessibility(View view) {
        return Api21Impl.isImportantForAccessibility(view);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kpb[>L<#173$\u001e\u0003eIL4\u001ceW#1. \nv,R(sVH>gW\u0005\tyuY\b}nhq", imports = {})
    @Deprecated
    public static boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    public static boolean performHapticFeedback(View view, int i2) {
        int feedbackConstantOrFallback = HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(i2);
        if (feedbackConstantOrFallback == -1) {
            return false;
        }
        return view.performHapticFeedback(feedbackConstantOrFallback);
    }

    public static boolean performHapticFeedback(View view, int i2, int i3) {
        int feedbackConstantOrFallback = HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(i2);
        if (feedbackConstantOrFallback == -1) {
            return false;
        }
        return view.performHapticFeedback(feedbackConstantOrFallback, i3);
    }

    public static int addAccessibilityAction(View view, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) throws Throwable {
        int availableActionIdFromResources = getAvailableActionIdFromResources(view, charSequence);
        if (availableActionIdFromResources != -1) {
            addAccessibilityAction(view, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(availableActionIdFromResources, charSequence, accessibilityViewCommand));
        }
        return availableActionIdFromResources;
    }

    private static int getAvailableActionIdFromResources(View view, CharSequence charSequence) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        for (int i2 = 0; i2 < actionList.size(); i2++) {
            if (TextUtils.equals(charSequence, actionList.get(i2).getLabel())) {
                return actionList.get(i2).getId();
            }
        }
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int[] iArr = ACCESSIBILITY_ACTIONS_RESOURCE_IDS;
            if (i4 >= iArr.length || i3 != -1) {
                break;
            }
            int i5 = iArr[i4];
            boolean z2 = true;
            for (int i6 = 0; i6 < actionList.size(); i6++) {
                z2 &= actionList.get(i6).getId() != i5;
            }
            if (z2) {
                i3 = i5;
            }
            i4++;
        }
        return i3;
    }

    public static void replaceAccessibilityAction(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) throws Throwable {
        if (accessibilityViewCommand == null && charSequence == null) {
            removeAccessibilityAction(view, accessibilityActionCompat.getId());
        } else {
            addAccessibilityAction(view, accessibilityActionCompat.createReplacementAction(charSequence, accessibilityViewCommand));
        }
    }

    private static void addAccessibilityAction(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) throws Throwable {
        ensureAccessibilityDelegateCompat(view);
        removeActionWithId(accessibilityActionCompat.getId(), view);
        getActionList(view).add(accessibilityActionCompat);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    public static void removeAccessibilityAction(View view, int i2) throws Throwable {
        removeActionWithId(i2, view);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    private static void removeActionWithId(int i2, View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        for (int i3 = 0; i3 < actionList.size(); i3++) {
            if (actionList.get(i3).getId() == i2) {
                actionList.remove(i3);
                return;
            }
        }
    }

    private static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void setStateDescription(View view, CharSequence charSequence) throws Throwable {
        stateDescriptionProperty().set(view, charSequence);
    }

    public static CharSequence getStateDescription(View view) {
        return stateDescriptionProperty().get(view);
    }

    public static void enableAccessibleClickableSpanSupport(View view) {
        ensureAccessibilityDelegateCompat(view);
    }

    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]\u0019I:\u001eQ{x", imports = {})
    @Deprecated
    public static float getAlpha(View view) {
        return view.getAlpha();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]$>C\u001bb(I/\u00107hH\\-%EWR3eV\u000bim_9(", imports = {})
    @Deprecated
    public static void setLayerType(View view, int i2, Paint paint) {
        view.setLayerType(i2, paint);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]$>C\u001bb(I/\u00107%", imports = {})
    @Deprecated
    public static int getLayerType(View view) {
        return view.getLayerType();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]$>,\u001b\\\u001a?1R8", imports = {})
    @Deprecated
    public static int getLabelFor(View view) {
        return view.getLabelFor();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]$>,\u001b\\\u001a?1R{]IH4\u0018U'Fv", imports = {})
    @Deprecated
    public static void setLabelFor(View view, int i2) {
        view.setLabelFor(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]$>C\u001bb$1(\u0019\u0004$WD1!e\u0007", imports = {})
    @Deprecated
    public static void setLayerPaint(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]$>C%eH\u0014(\u001dt_[L7!\u0019\u0007", imports = {})
    @Deprecated
    public static int getLayoutDirection(View view) {
        return view.getLayoutDirection();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]$>C%eH\u0014(\u001dt_[L7!\u0019JCG),\u000fLmc*baB?*`", imports = {})
    @Deprecated
    public static void setLayoutDirection(View view, int i2) {
        view.setLayoutDirection(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb](><\u001b^H\u0016.\u001dP_JH;&Z@K:#+\u00140-", imports = {})
    @Deprecated
    public static ViewParent getParentForAccessibility(View view) {
        return view.getParentForAccessibility();
    }

    public static <T extends View> T requireViewById(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) Api28Impl.requireViewById(view, i2);
        }
        T t2 = (T) view.findViewById(i2);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kip8H>;+U{x", imports = {})
    @Deprecated
    public static boolean isOpaque(View view) {
        return view.isOpaque();
    }

    @Deprecated
    public static int resolveSizeAndState(int i2, int i3, int i4) {
        return View.resolveSizeAndState(i2, i3, i4);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]%B+)eF5#\u0002x`[K\t!U1V/.\u001cB1", imports = {})
    @Deprecated
    public static int getMeasuredWidthAndState(View view) {
        return view.getMeasuredWidthAndState();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]%B+)eF5#rteNK<s_B5B\u001b+\u007f0-", imports = {})
    @Deprecated
    public static int getMeasuredHeightAndState(View view) {
        return view.getMeasuredHeightAndState();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]%B+)eF5#}\u0004][Ho[", imports = {})
    @Deprecated
    public static int getMeasuredState(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    public static int combineMeasuredStates(int i2, int i3) {
        return View.combineMeasuredStates(i2, i3);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]\u0019@-\u001bcG9!\u0014{e[\\\u0014\u001cgC43! \nv,\u001a", imports = {})
    @Deprecated
    public static int getAccessibilityLiveRegion(View view) {
        return view.getAccessibilityLiveRegion();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]\u0019@-\u001bcG9!\u0014{e[\\\u0014\u001cgC43! \nv,^4cR\u0002", imports = {})
    @Deprecated
    public static void setAccessibilityLiveRegion(View view, int i2) {
        view.setAccessibilityLiveRegion(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb](>.\u001aYB7\u0012\u001fpn[\u000bp", imports = {})
    @Deprecated
    public static int getPaddingStart(View view) {
        return view.getPaddingStart();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb](>.\u001aYB7\u0004\u0019s$\u0010", imports = {})
    @Deprecated
    public static int getPaddingEnd(View view) {
        return view.getPaddingEnd();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb](>.\u001aYB7\u0011\u0010{][L>\u0018\u0019QV/,+F(x`5+\r>> cCx\u0002t`\u0012|#", imports = {})
    @Deprecated
    public static void setPaddingRelative(View view, int i2, int i3, int i4, int i5) {
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    private static void bindTempDetach() {
        try {
            sDispatchStartTemporaryDetach = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            sDispatchFinishTemporaryDetach = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e2) {
        }
        sTempDetachBound = true;
    }

    public static void dispatchStartTemporaryDetach(View view) {
        Api24Impl.dispatchStartTemporaryDetach(view);
    }

    public static void dispatchFinishTemporaryDetach(View view) {
        Api24Impl.dispatchFinishTemporaryDetach(view);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb],O+$c@13\u0014~j?\u000bp", imports = {})
    @Deprecated
    public static float getTranslationX(View view) {
        return view.getTranslationX();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb],O+$c@13\u0014~j@\u000bp", imports = {})
    @Deprecated
    public static float getTranslationY(View view) {
        return view.getTranslationY();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]%>>(YLwg", imports = {})
    @Deprecated
    public static Matrix getMatrix(View view) {
        return view.getMatrix();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]%F8\u001f]I=\u0016\u0014spO\u000bp", imports = {})
    @Deprecated
    public static int getMinimumWidth(View view) {
        return view.getMinimumWidth();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]%F8\u001f]I=\u0007\u0010xcOWo[", imports = {})
    @Deprecated
    public static int getMinimumHeight(View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static ViewPropertyAnimatorCompat animate(View view) {
        if (sViewPropertyAnimatorMap == null) {
            sViewPropertyAnimatorMap = new WeakHashMap<>();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = sViewPropertyAnimatorMap.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        sViewPropertyAnimatorMap.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb],O+$c@13\u0014~j?\u000b>\u0014]SGv", imports = {})
    @Deprecated
    public static void setTranslationX(View view, float f2) {
        view.setTranslationX(f2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb],O+$c@13\u0014~j@\u000b>\u0014]SGv", imports = {})
    @Deprecated
    public static void setTranslationY(View view, float f2) {
        view.setTranslationY(f2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]\u0019I:\u001eQ{F \u0017\u0005a\u0010", imports = {})
    @Deprecated
    public static void setAlpha(View view, float f2) {
        view.setAlpha(f2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]0\u0005@\u0017\\I5g", imports = {})
    @Deprecated
    public static void setX(View view, float f2) {
        view.setX(f2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]1\u0005@\u0017\\I5g", imports = {})
    @Deprecated
    public static void setY(View view, float f2) {
        view.setY(f2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]*L>\u0017d=?-R\u0006]SX-[", imports = {})
    @Deprecated
    public static void setRotation(View view, float f2) {
        view.setRotation(f2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]*L>\u0017d=?-\u00037rHO=\u0018\u001a", imports = {})
    @Deprecated
    public static void setRotationX(View view, float f2) {
        view.setRotationX(f2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]*L>\u0017d=?-\u00047rHO=\u0018\u001a", imports = {})
    @Deprecated
    public static void setRotationY(View view, float f2) {
        view.setRotationY(f2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]+@+\"U,w5\f{qL\f", imports = {})
    @Deprecated
    public static void setScaleX(View view, float f2) {
        view.setScaleX(f2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]+@+\"U-w5\f{qL\f", imports = {})
    @Deprecated
    public static void setScaleY(View view, float f2) {
        view.setScaleY(f2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb](F@%d,wg", imports = {})
    @Deprecated
    public static float getPivotX(View view) {
        return view.getPivotX();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb](F@%d,w5\f{qL\f", imports = {})
    @Deprecated
    public static void setPivotX(View view, float f2) {
        view.setPivotX(f2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb](F@%d-wg", imports = {})
    @Deprecated
    public static float getPivotY(View view) {
        return view.getPivotY();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb](F@%d-w5\f{qL\f", imports = {})
    @Deprecated
    public static void setPivotY(View view, float f2) {
        view.setPivotY(f2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]*L>\u0017d=?-R8", imports = {})
    @Deprecated
    public static float getRotation(View view) {
        return view.getRotation();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]*L>\u0017d=?-\u00037%", imports = {})
    @Deprecated
    public static float getRotationX(View view) {
        return view.getRotationX();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]*L>\u0017d=?-\u00047%", imports = {})
    @Deprecated
    public static float getRotationY(View view) {
        return view.getRotationY();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]+@+\"U,wg", imports = {})
    @Deprecated
    public static float getScaleX(View view) {
        return view.getScaleX();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]+@+\"U-wg", imports = {})
    @Deprecated
    public static float getScaleY(View view) {
        return view.getScaleY();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]0\u0005r", imports = {})
    @Deprecated
    public static float getX(View view) {
        return view.getX();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]1\u0005r", imports = {})
    @Deprecated
    public static float getY(View view) {
        return view.getY();
    }

    public static void setElevation(View view, float f2) {
        Api21Impl.setElevation(view, f2);
    }

    public static float getElevation(View view) {
        return Api21Impl.getElevation(view);
    }

    public static void setTranslationZ(View view, float f2) {
        Api21Impl.setTranslationZ(view, f2);
    }

    public static float getTranslationZ(View view) {
        return Api21Impl.getTranslationZ(view);
    }

    public static void setTransitionName(View view, String str) {
        Api21Impl.setTransitionName(view, str);
    }

    public static String getTransitionName(View view) {
        return Api21Impl.getTransitionName(view);
    }

    public static void addOverlayView(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        ViewTree.setViewTreeDisjointParent((View) view.getParent(), viewGroup);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]/F8\u001a_K#8\u001e\u0004aT81\tZQK0##\u0004|}\u0019m", imports = {})
    @Deprecated
    public static int getWindowSystemUiVisibility(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void requestApplyInsets(View view) {
        Api20Impl.requestApplyInsets(view);
    }

    @Deprecated
    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z2) {
        if (sChildrenDrawingOrderMethod == null) {
            try {
                sChildrenDrawingOrderMethod = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e2) {
            }
            sChildrenDrawingOrderMethod.setAccessible(true);
        }
        try {
            sChildrenDrawingOrderMethod.invoke(viewGroup, Boolean.valueOf(z2));
        } catch (IllegalAccessException e3) {
        } catch (IllegalArgumentException e4) {
        } catch (InvocationTargetException e5) {
        }
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]\u001eF>)CMC3\u0010|SPQ,\"hQ\nv", imports = {})
    @Deprecated
    public static boolean getFitsSystemWindows(View view) {
        return view.getFitsSystemWindows();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]\u001eF>)CMC3\u0010|SPQ,\"hQ\n4#+m\u0002we*lDB> '\u001b\n;", imports = {})
    @Deprecated
    public static void setFitsSystemWindows(View view, boolean z2) {
        view.setFitsSystemWindows(z2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*KjrVH!<\u0017g52+\u0010\u0003PV&=%cCPB\r+{|i\u0019m", imports = {})
    @Deprecated
    public static void jumpDrawablesToCurrentState(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Api21Impl.setOnApplyWindowInsetsListener(view, onApplyWindowInsetsListener);
    }

    public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = Api20Impl.onApplyWindowInsets(view, windowInsets);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    public static WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsDispatchApplyWindowInsets;
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                windowInsetsDispatchApplyWindowInsets = Api30Impl.dispatchApplyWindowInsets(view, windowInsets);
            } else {
                windowInsetsDispatchApplyWindowInsets = Api20Impl.dispatchApplyWindowInsets(view, windowInsets);
            }
            if (!windowInsetsDispatchApplyWindowInsets.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(windowInsetsDispatchApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void setSystemGestureExclusionRects(View view, List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setSystemGestureExclusionRects(view, list);
        }
    }

    public static List<Rect> getSystemGestureExclusionRects(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getSystemGestureExclusionRects(view);
        }
        return Collections.emptyList();
    }

    public static WindowInsetsCompat getRootWindowInsets(View view) {
        return Api23Impl.getRootWindowInsets(view);
    }

    public static WindowInsetsCompat computeSystemWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return Api21Impl.computeSystemWindowInsets(view, windowInsetsCompat, rect);
    }

    @Deprecated
    public static WindowInsetsControllerCompat getWindowInsetsController(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getWindowInsetsController(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return WindowCompat.getInsetsController(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void setWindowInsetsAnimationCallback(View view, WindowInsetsAnimationCompat.Callback callback) {
        WindowInsetsAnimationCompat.setCallback(view, callback);
    }

    public static void setOnReceiveContentListener(View view, String[] strArr, OnReceiveContentListener onReceiveContentListener) {
        if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.setOnReceiveContentListener(view, strArr, onReceiveContentListener);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z2 = false;
        if (onReceiveContentListener != null) {
            Preconditions.checkArgument(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (strArr[i2].startsWith(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            Preconditions.checkArgument(!z2, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, onReceiveContentListener);
    }

    public static String[] getOnReceiveContentMimeTypes(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.getReceiveContentMimeTypes(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static ContentInfoCompat performReceiveContent(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable(TAG, 3)) {
            String str = "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]";
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.performReceiveContent(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        if (onReceiveContentListener != null) {
            ContentInfoCompat contentInfoCompatOnReceiveContent = onReceiveContentListener.onReceiveContent(view, contentInfoCompat);
            if (contentInfoCompatOnReceiveContent == null) {
                return null;
            }
            return getFallback(view).onReceiveContent(contentInfoCompatOnReceiveContent);
        }
        return getFallback(view).onReceiveContent(contentInfoCompat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static OnReceiveContentViewBehavior getFallback(View view) {
        if (view instanceof OnReceiveContentViewBehavior) {
            return (OnReceiveContentViewBehavior) view;
        }
        return NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR;
    }

    private static final class Api31Impl {
        private Api31Impl() {
        }

        public static void setOnReceiveContentListener(View view, String[] strArr, OnReceiveContentListener onReceiveContentListener) {
            if (onReceiveContentListener == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerAdapter(onReceiveContentListener));
            }
        }

        public static String[] getReceiveContentMimeTypes(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static ContentInfoCompat performReceiveContent(View view, ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfo = contentInfoCompat.toContentInfo();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfo);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfo ? contentInfoCompat : ContentInfoCompat.toContentInfoCompat(contentInfoPerformReceiveContent);
        }
    }

    private static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {
        private final OnReceiveContentListener mJetpackListener;

        OnReceiveContentListenerAdapter(OnReceiveContentListener onReceiveContentListener) {
            this.mJetpackListener = onReceiveContentListener;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompat = ContentInfoCompat.toContentInfoCompat(contentInfo);
            ContentInfoCompat contentInfoCompatOnReceiveContent = this.mJetpackListener.onReceiveContent(view, contentInfoCompat);
            if (contentInfoCompatOnReceiveContent == null) {
                return null;
            }
            return contentInfoCompatOnReceiveContent == contentInfoCompat ? contentInfo : contentInfoCompatOnReceiveContent.toContentInfo();
        }
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]+>@\u001b6F?,zpnLQ<w_?D:\u001f\u001bBmrR'kR=x", imports = {})
    @Deprecated
    public static void setSaveFromParentEnabled(View view, boolean z2) {
        view.setSaveFromParentEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]\u0019@>\u001ff5D$\u000f7]JW1)RRG2b", imports = {})
    @Deprecated
    public static void setActivated(View view, boolean z2) {
        view.setActivated(z2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kh^\\'S/(\\5@/\u0014}c9H6\u0017VPK<!^C", imports = {})
    @Deprecated
    public static boolean hasOverlappingRendering(View view) {
        return view.hasOverlappingRendering();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kip99A.\u001f^;\"$\u0017ppPY-Z\u001a", imports = {})
    @Deprecated
    public static boolean isPaddingRelative(View view) {
        return view.isPaddingRelative();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]\u001a>-!WF?4\u0019s$ID+\u001eXPQC(\u001bC", imports = {})
    @Deprecated
    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList getBackgroundTintList(View view) {
        return Api21Impl.getBackgroundTintList(view);
    }

    public static void setBackgroundTintList(View view, ColorStateList colorStateList) {
        Api21Impl.setBackgroundTintList(view, colorStateList);
    }

    public static PorterDuff.Mode getBackgroundTintMode(View view) {
        return Api21Impl.getBackgroundTintMode(view);
    }

    public static void setBackgroundTintMode(View view, PorterDuff.Mode mode) {
        Api21Impl.setBackgroundTintMode(view, mode);
    }

    public static void setNestedScrollingEnabled(View view, boolean z2) {
        Api21Impl.setNestedScrollingEnabled(view, z2);
    }

    public static boolean isNestedScrollingEnabled(View view) {
        return Api21Impl.isNestedScrollingEnabled(view);
    }

    public static boolean startNestedScroll(View view, int i2) {
        return Api21Impl.startNestedScroll(view, i2);
    }

    public static void stopNestedScroll(View view) {
        Api21Impl.stopNestedScroll(view);
    }

    public static boolean hasNestedScrollingParent(View view) {
        return Api21Impl.hasNestedScrollingParent(view);
    }

    public static boolean dispatchNestedScroll(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        return Api21Impl.dispatchNestedScroll(view, i2, i3, i4, i5, iArr);
    }

    public static boolean dispatchNestedPreScroll(View view, int i2, int i3, int[] iArr, int[] iArr2) {
        return Api21Impl.dispatchNestedPreScroll(view, i2, i3, iArr, iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(View view, int i2, int i3) {
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).startNestedScroll(i2, i3);
        }
        if (i3 == 0) {
            return startNestedScroll(view, i2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(View view, int i2) {
        if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).stopNestedScroll(i2);
        } else if (i2 == 0) {
            stopNestedScroll(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(View view, int i2) {
        if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).hasNestedScrollingParent(i2);
            return false;
        }
        if (i2 == 0) {
            return hasNestedScrollingParent(view);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchNestedScroll(View view, int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        if (view instanceof NestedScrollingChild3) {
            ((NestedScrollingChild3) view).dispatchNestedScroll(i2, i3, i4, i5, iArr, i6, iArr2);
        } else {
            dispatchNestedScroll(view, i2, i3, i4, i5, iArr, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(View view, int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).dispatchNestedScroll(i2, i3, i4, i5, iArr, i6);
        }
        if (i6 == 0) {
            return dispatchNestedScroll(view, i2, i3, i4, i5, iArr);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(View view, int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).dispatchNestedPreScroll(i2, i3, iArr, iArr2, i4);
        }
        if (i4 == 0) {
            return dispatchNestedPreScroll(view, i2, i3, iArr, iArr2);
        }
        return false;
    }

    public static boolean dispatchNestedFling(View view, float f2, float f3, boolean z2) {
        return Api21Impl.dispatchNestedFling(view, f2, f3, z2);
    }

    public static boolean dispatchNestedPreFling(View view, float f2, float f3) {
        return Api21Impl.dispatchNestedPreFling(view, f2, f3);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kip2F)+/_IDfS", imports = {})
    @Deprecated
    public static boolean isInLayout(View view) {
        return view.isInLayout();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kip59F.\u0005eHwg", imports = {})
    @Deprecated
    public static boolean isLaidOut(View view) {
        return view.isLaidOut();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kip59V9+d\u001891\u0010rpPR6\u0005VQQ:0\u001c~0-", imports = {})
    @Deprecated
    public static boolean isLayoutDirectionResolved(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static float getZ(View view) {
        return Api21Impl.getZ(view);
    }

    public static void setZ(View view, float f2) {
        Api21Impl.setZ(view, f2);
    }

    public static void offsetTopAndBottom(View view, int i2) {
        view.offsetTopAndBottom(i2);
    }

    private static void compatOffsetTopAndBottom(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    public static void offsetLeftAndRight(View view, int i2) {
        view.offsetLeftAndRight(i2);
    }

    private static void compatOffsetLeftAndRight(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    private static void tickleInvalidationFlag(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Ksb]\u001bI3&2CE-\u000f\u0003$JO1#3MW<\u001e*C", imports = {})
    @Deprecated
    public static void setClipBounds(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]\u001bI3&2CE-\u000f\u0003$\u0010", imports = {})
    @Deprecated
    public static Rect getClipBounds(View view) {
        return view.getClipBounds();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kip*LQ+\u0019X94\u0013\u001afeUG7*\u0019\u0007", imports = {})
    @Deprecated
    public static boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kh^\\'K\r\"Y7;\u000b\u0014\u0003pLQ-%d\u0006\u000b", imports = {})
    @Deprecated
    public static boolean hasOnClickListeners(View view) {
        return view.hasOnClickListeners();
    }

    public static void setScrollIndicators(View view, int i2) {
        Api23Impl.setScrollIndicators(view, i2);
    }

    public static void setScrollIndicators(View view, int i2, int i3) {
        Api23Impl.setScrollIndicators(view, i2, i3);
    }

    public static int getScrollIndicators(View view) {
        return Api23Impl.getScrollIndicators(view);
    }

    public static void setPointerIcon(View view, PointerIconCompat pointerIconCompat) {
        Api24Impl.setPointerIcon(view, (PointerIcon) (pointerIconCompat != null ? pointerIconCompat.getPointerIcon() : null));
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u001a3\u001c*Kgb]\u001cF=&\\5IfS", imports = {})
    @Deprecated
    public static Display getDisplay(View view) {
        return view.getDisplay();
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        Api26Impl.setTooltipText(view, charSequence);
    }

    public static boolean startDragAndDrop(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i2) {
        return Api24Impl.startDragAndDrop(view, clipData, dragShadowBuilder, obj, i2);
    }

    public static void cancelDragAndDrop(View view) {
        Api24Impl.cancelDragAndDrop(view);
    }

    public static void updateDragShadow(View view, View.DragShadowBuilder dragShadowBuilder) {
        Api24Impl.updateDragShadow(view, dragShadowBuilder);
    }

    public static int getNextClusterForwardId(View view) {
        return Api26Impl.getNextClusterForwardId(view);
    }

    public static void setNextClusterForwardId(View view, int i2) {
        Api26Impl.setNextClusterForwardId(view, i2);
    }

    public static boolean isKeyboardNavigationCluster(View view) {
        return Api26Impl.isKeyboardNavigationCluster(view);
    }

    public static void setKeyboardNavigationCluster(View view, boolean z2) {
        Api26Impl.setKeyboardNavigationCluster(view, z2);
    }

    public static boolean isFocusedByDefault(View view) {
        return Api26Impl.isFocusedByDefault(view);
    }

    public static void setFocusedByDefault(View view, boolean z2) {
        Api26Impl.setFocusedByDefault(view, z2);
    }

    public static View keyboardNavigationClusterSearch(View view, View view2, int i2) {
        return Api26Impl.keyboardNavigationClusterSearch(view, view2, i2);
    }

    public static void addKeyboardNavigationClusters(View view, Collection<View> collection, int i2) {
        Api26Impl.addKeyboardNavigationClusters(view, collection, i2);
    }

    public static boolean restoreDefaultFocus(View view) {
        return Api26Impl.restoreDefaultFocus(view);
    }

    public static boolean hasExplicitFocusable(View view) {
        return Api26Impl.hasExplicitFocusable(view);
    }

    @Deprecated
    public static int generateViewId() {
        return View.generateViewId();
    }

    public static void addOnUnhandledKeyEventListener(View view, OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.addOnUnhandledKeyEventListener(view, onUnhandledKeyEventListenerCompat);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(onUnhandledKeyEventListenerCompat);
        if (arrayList.size() == 1) {
            UnhandledKeyEventManager.registerListeningView(view);
        }
    }

    public static void removeOnUnhandledKeyEventListener(View view, OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.removeOnUnhandledKeyEventListener(view, onUnhandledKeyEventListenerCompat);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(onUnhandledKeyEventListenerCompat);
            if (arrayList.size() == 0) {
                UnhandledKeyEventManager.unregisterListeningView(view);
            }
        }
    }

    @Deprecated
    protected ViewCompat() {
    }

    static boolean dispatchUnhandledKeyEventBeforeHierarchy(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return UnhandledKeyEventManager.at(view).preDispatch(keyEvent);
    }

    static boolean dispatchUnhandledKeyEventBeforeCallback(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return UnhandledKeyEventManager.at(view).dispatch(view, keyEvent);
    }

    public static void transformMatrixToGlobal(View view, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.transformMatrixToGlobal(view, matrix);
            return;
        }
        if (sTryHiddenViewTransformMatrixToGlobal) {
            try {
                Api29Impl.transformMatrixToGlobal(view, matrix);
                return;
            } catch (NoSuchMethodError unused) {
                sTryHiddenViewTransformMatrixToGlobal = false;
            }
        }
        fallbackTransformMatrixToGlobal(view, matrix);
    }

    static void fallbackTransformMatrixToGlobal(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            fallbackTransformMatrixToGlobal((View) parent, matrix);
            matrix.preTranslate(-r2.getScrollX(), -r2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        matrix.preConcat(view.getMatrix());
    }

    public static void setScreenReaderFocusable(View view, boolean z2) throws Throwable {
        screenReaderFocusableProperty().set(view, Boolean.valueOf(z2));
    }

    public static boolean isScreenReaderFocusable(View view) {
        Boolean bool = screenReaderFocusableProperty().get(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$1 */
    class AnonymousClass1 extends AccessibilityViewProperty<Boolean> {
        AnonymousClass1(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public Boolean frameworkGet(View view) {
            return Boolean.valueOf(Api28Impl.isScreenReaderFocusable(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public void frameworkSet(View view, Boolean bool) {
            Api28Impl.setScreenReaderFocusable(view, bool.booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public boolean shouldUpdate(Boolean bool, Boolean bool2) {
            return !booleanNullToFalseEquals(bool, bool2);
        }
    }

    private static AccessibilityViewProperty<Boolean> screenReaderFocusableProperty() {
        return new AccessibilityViewProperty<Boolean>(R.id.tag_screen_reader_focusable, Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.1
            AnonymousClass1(int i2, Class cls, int i3) {
                super(i2, cls, i3);
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public Boolean frameworkGet(View view) {
                return Boolean.valueOf(Api28Impl.isScreenReaderFocusable(view));
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public void frameworkSet(View view, Boolean bool) {
                Api28Impl.setScreenReaderFocusable(view, bool.booleanValue());
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(Boolean bool, Boolean bool2) {
                return !booleanNullToFalseEquals(bool, bool2);
            }
        };
    }

    public static void setAccessibilityPaneTitle(View view, CharSequence charSequence) throws Throwable {
        paneTitleProperty().set(view, charSequence);
        if (charSequence != null) {
            sAccessibilityPaneVisibilityManager.addAccessibilityPane(view);
        } else {
            sAccessibilityPaneVisibilityManager.removeAccessibilityPane(view);
        }
    }

    public static CharSequence getAccessibilityPaneTitle(View view) {
        return paneTitleProperty().get(view);
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$2 */
    class AnonymousClass2 extends AccessibilityViewProperty<CharSequence> {
        AnonymousClass2(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public CharSequence frameworkGet(View view) {
            return Api28Impl.getAccessibilityPaneTitle(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public void frameworkSet(View view, CharSequence charSequence) {
            Api28Impl.setAccessibilityPaneTitle(view, charSequence);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public boolean shouldUpdate(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    private static AccessibilityViewProperty<CharSequence> paneTitleProperty() {
        return new AccessibilityViewProperty<CharSequence>(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28) { // from class: androidx.core.view.ViewCompat.2
            AnonymousClass2(int i2, Class cls, int i3, int i4) {
                super(i2, cls, i3, i4);
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public CharSequence frameworkGet(View view) {
                return Api28Impl.getAccessibilityPaneTitle(view);
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public void frameworkSet(View view, CharSequence charSequence) {
                Api28Impl.setAccessibilityPaneTitle(view, charSequence);
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$3 */
    class AnonymousClass3 extends AccessibilityViewProperty<CharSequence> {
        AnonymousClass3(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public CharSequence frameworkGet(View view) {
            return Api30Impl.getStateDescription(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public void frameworkSet(View view, CharSequence charSequence) {
            Api30Impl.setStateDescription(view, charSequence);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public boolean shouldUpdate(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    private static AccessibilityViewProperty<CharSequence> stateDescriptionProperty() {
        return new AccessibilityViewProperty<CharSequence>(R.id.tag_state_description, CharSequence.class, 64, 30) { // from class: androidx.core.view.ViewCompat.3
            AnonymousClass3(int i2, Class cls, int i3, int i4) {
                super(i2, cls, i3, i4);
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public CharSequence frameworkGet(View view) {
                return Api30Impl.getStateDescription(view);
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public void frameworkSet(View view, CharSequence charSequence) {
                Api30Impl.setStateDescription(view, charSequence);
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    public static boolean isAccessibilityHeading(View view) {
        Boolean bool = accessibilityHeadingProperty().get(view);
        return bool != null && bool.booleanValue();
    }

    public static void setAccessibilityHeading(View view, boolean z2) throws Throwable {
        accessibilityHeadingProperty().set(view, Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$4 */
    class AnonymousClass4 extends AccessibilityViewProperty<Boolean> {
        AnonymousClass4(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public Boolean frameworkGet(View view) {
            return Boolean.valueOf(Api28Impl.isAccessibilityHeading(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public void frameworkSet(View view, Boolean bool) {
            Api28Impl.setAccessibilityHeading(view, bool.booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public boolean shouldUpdate(Boolean bool, Boolean bool2) {
            return !booleanNullToFalseEquals(bool, bool2);
        }
    }

    private static AccessibilityViewProperty<Boolean> accessibilityHeadingProperty() {
        return new AccessibilityViewProperty<Boolean>(R.id.tag_accessibility_heading, Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.4
            AnonymousClass4(int i2, Class cls, int i3) {
                super(i2, cls, i3);
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public Boolean frameworkGet(View view) {
                return Boolean.valueOf(Api28Impl.isAccessibilityHeading(view));
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public void frameworkSet(View view, Boolean bool) {
                Api28Impl.setAccessibilityHeading(view, bool.booleanValue());
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(Boolean bool, Boolean bool2) {
                return !booleanNullToFalseEquals(bool, bool2);
            }
        };
    }

    static abstract class AccessibilityViewProperty<T> {
        private final int mContentChangeType;
        private final int mFrameworkMinimumSdk;
        private final int mTagKey;
        private final Class<T> mType;

        abstract T frameworkGet(View view);

        abstract void frameworkSet(View view, T t2);

        AccessibilityViewProperty(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        AccessibilityViewProperty(int i2, Class<T> cls, int i3, int i4) {
            this.mTagKey = i2;
            this.mType = cls;
            this.mContentChangeType = i3;
            this.mFrameworkMinimumSdk = i4;
        }

        void set(View view, T t2) throws Throwable {
            if (frameworkAvailable()) {
                frameworkSet(view, t2);
            } else if (shouldUpdate(get(view), t2)) {
                ViewCompat.ensureAccessibilityDelegateCompat(view);
                view.setTag(this.mTagKey, t2);
                ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, this.mContentChangeType);
            }
        }

        T get(View view) {
            if (frameworkAvailable()) {
                return frameworkGet(view);
            }
            T t2 = (T) view.getTag(this.mTagKey);
            if (this.mType.isInstance(t2)) {
                return t2;
            }
            return null;
        }

        private boolean frameworkAvailable() {
            return Build.VERSION.SDK_INT >= this.mFrameworkMinimumSdk;
        }

        boolean shouldUpdate(T t2, T t3) {
            return !t3.equals(t2);
        }

        boolean booleanNullToFalseEquals(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }
    }

    static void notifyViewAccessibilityStateChangedIfNeeded(View view, int i2) throws Throwable {
        Context context = view.getContext();
        Object[] objArr = {C1561oA.Qd("TUTUbaVNTVR\\`", (short) (OY.Xd() ^ 28134))};
        Method method = Class.forName(C1593ug.zd(">LCRPKG\u0012HUU\\NX_\u001a0]]dVjg", (short) (ZN.Xd() ^ 17368), (short) (ZN.Xd() ^ 26875))).getMethod(C1561oA.Kd("jiyY\u0001{}ox_r\u0001\u0006ytw", (short) (C1633zX.Xd() ^ (-13095))), Class.forName(C1561oA.od("\u001c\u0012&\u0010[\u0019\r\u0019\u0011Vz\u001b\u0018\u000e\u0012\n", (short) (C1499aX.Xd() ^ (-976)))));
        try {
            method.setAccessible(true);
            AccessibilityManager accessibilityManager = (AccessibilityManager) method.invoke(context, objArr);
            short sXd = (short) (ZN.Xd() ^ 10634);
            short sXd2 = (short) (ZN.Xd() ^ 20627);
            int[] iArr = new int["8a\u000ea\u0015j0+>l~WC5~Q\u001de\u001dYh-v'|[J!y7_\"k\u001cN8r.~:6\u0004K\u007f@\u001am".length()];
            QB qb = new QB("8a\u000ea\u0015j0+>l~WC5~Q\u001de\u001dYh-v'|[J!y7_\"k\u001cN8r.~:6\u0004K\u007f@\u001am");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i3++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i3)).getMethod(C1561oA.Xd("7B\u0015?35@::", (short) (Od.Xd() ^ (-16851))), new Class[0]);
            try {
                method2.setAccessible(true);
                if (((Boolean) method2.invoke(accessibilityManager, objArr2)).booleanValue()) {
                    boolean z2 = getAccessibilityPaneTitle(view) != null && view.isShown() && view.getWindowVisibility() == 0;
                    if (view.getAccessibilityLiveRegion() == 0 && !z2) {
                        if (i2 == 32) {
                            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
                            accessibilityEventObtain.setEventType(32);
                            accessibilityEventObtain.setContentChangeTypes(i2);
                            accessibilityEventObtain.setSource(view);
                            view.onPopulateAccessibilityEvent(accessibilityEventObtain);
                            accessibilityEventObtain.getText().add(getAccessibilityPaneTitle(view));
                            Object[] objArr3 = {accessibilityEventObtain};
                            Method method3 = Class.forName(Wg.vd(":H;JD?7\u0002G;4Gz/./.=:1'//-5;l\u0001 ! /,#\u0019!!\u001f'-}\u0013\u001d\u0011\u0014\u0013\u001d", (short) (C1580rY.Xd() ^ (-9952)))).getMethod(hg.Vd("\u000f\u007f\b|Xyxy\u0007\u0006zrxzv\u0001\u0005O\u007fmuz", (short) (FB.Xd() ^ 28857), (short) (FB.Xd() ^ 29267)), Class.forName(Qg.kd("JVKXTMG\u0010WIDU\u000b=>=>KJ?7=?;EI|\u000f0/0=<1)/1-7;\u00066$,1", (short) (FB.Xd() ^ 10503), (short) (FB.Xd() ^ 8893))));
                            try {
                                method3.setAccessible(true);
                                method3.invoke(accessibilityManager, objArr3);
                                return;
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }
                        if (view.getParent() != null) {
                            try {
                                view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                                return;
                            } catch (AbstractMethodError e3) {
                                String str = view.getParent().getClass().getSimpleName() + C1561oA.ud("\tLVKX\u0004QQU\u007fESIHTyBEGB:A8@Eo%72C\u001b+;-5:", (short) (Od.Xd() ^ (-31068)));
                                short sXd3 = (short) (C1580rY.Xd() ^ (-749));
                                int[] iArr2 = new int["v\u000b\u0004\u0017g\u0015\u0010\u0014\n\u001e".length()];
                                QB qb2 = new QB("v\u000b\u0004\u0017g\u0015\u0010\u0014\n\u001e");
                                int i4 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i4));
                                    i4++;
                                }
                                new String(iArr2, 0, i4);
                                return;
                            }
                        }
                        return;
                    }
                    AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                    accessibilityEventObtain2.setEventType(z2 ? 32 : 2048);
                    accessibilityEventObtain2.setContentChangeTypes(i2);
                    if (z2) {
                        accessibilityEventObtain2.getText().add(getAccessibilityPaneTitle(view));
                        setImportantForAccessibilityIfNeeded(view);
                    }
                    view.sendAccessibilityEventUnchecked(accessibilityEventObtain2);
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private static void setImportantForAccessibilityIfNeeded(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    static class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private final WeakHashMap<View, Boolean> mPanesToVisible = new WeakHashMap<>();

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        AccessibilityPaneVisibilityManager() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws Throwable {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.mPanesToVisible.entrySet().iterator();
                while (it.hasNext()) {
                    checkPaneVisibility(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            registerForLayoutCallback(view);
        }

        void addAccessibilityPane(View view) {
            this.mPanesToVisible.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                registerForLayoutCallback(view);
            }
        }

        void removeAccessibilityPane(View view) {
            this.mPanesToVisible.remove(view);
            view.removeOnAttachStateChangeListener(this);
            unregisterForLayoutCallback(view);
        }

        private void checkPaneVisibility(Map.Entry<View, Boolean> entry) throws Throwable {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z2 = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z2) {
                ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(key, z2 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z2));
            }
        }

        private void registerForLayoutCallback(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void unregisterForLayoutCallback(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    static class UnhandledKeyEventManager {
        private static final ArrayList<WeakReference<View>> sViewsWithListeners = new ArrayList<>();
        private WeakHashMap<View, Boolean> mViewsContainingListeners = null;
        private SparseArray<WeakReference<View>> mCapturedKeys = null;
        private WeakReference<KeyEvent> mLastDispatchedPreViewKeyEvent = null;

        UnhandledKeyEventManager() {
        }

        private SparseArray<WeakReference<View>> getCapturedKeys() {
            if (this.mCapturedKeys == null) {
                this.mCapturedKeys = new SparseArray<>();
            }
            return this.mCapturedKeys;
        }

        static UnhandledKeyEventManager at(View view) {
            UnhandledKeyEventManager unhandledKeyEventManager = (UnhandledKeyEventManager) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (unhandledKeyEventManager != null) {
                return unhandledKeyEventManager;
            }
            UnhandledKeyEventManager unhandledKeyEventManager2 = new UnhandledKeyEventManager();
            view.setTag(R.id.tag_unhandled_key_event_manager, unhandledKeyEventManager2);
            return unhandledKeyEventManager2;
        }

        boolean dispatch(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                recalcViewsWithUnhandled();
            }
            View viewDispatchInOrder = dispatchInOrder(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewDispatchInOrder != null && !KeyEvent.isModifierKey(keyCode)) {
                    getCapturedKeys().put(keyCode, new WeakReference<>(viewDispatchInOrder));
                }
            }
            return viewDispatchInOrder != null;
        }

        private View dispatchInOrder(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.mViewsContainingListeners;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewDispatchInOrder = dispatchInOrder(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewDispatchInOrder != null) {
                            return viewDispatchInOrder;
                        }
                    }
                }
                if (onUnhandledKeyEvent(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        boolean preDispatch(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.mLastDispatchedPreViewKeyEvent;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.mLastDispatchedPreViewKeyEvent = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> capturedKeys = getCapturedKeys();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = capturedKeys.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = capturedKeys.valueAt(iIndexOfKey);
                capturedKeys.removeAt(iIndexOfKey);
            } else {
                weakReferenceValueAt = null;
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = capturedKeys.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                onUnhandledKeyEvent(view, keyEvent);
            }
            return true;
        }

        private boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        static void registerListeningView(View view) {
            ArrayList<WeakReference<View>> arrayList = sViewsWithListeners;
            synchronized (arrayList) {
                Iterator<WeakReference<View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                sViewsWithListeners.add(new WeakReference<>(view));
            }
        }

        static void unregisterListeningView(View view) {
            synchronized (sViewsWithListeners) {
                int i2 = 0;
                while (true) {
                    ArrayList<WeakReference<View>> arrayList = sViewsWithListeners;
                    if (i2 >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i2).get() == view) {
                        arrayList.remove(i2);
                        return;
                    }
                    i2++;
                }
            }
        }

        private void recalcViewsWithUnhandled() {
            WeakHashMap<View, Boolean> weakHashMap = this.mViewsContainingListeners;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = sViewsWithListeners;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.mViewsContainingListeners == null) {
                    this.mViewsContainingListeners = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = sViewsWithListeners;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.mViewsContainingListeners.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.mViewsContainingListeners.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        public static WindowInsetsCompat getRootWindowInsets(View view) {
            return WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(view);
        }

        static WindowInsetsCompat computeSystemWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        /* JADX INFO: renamed from: androidx.core.view.ViewCompat$Api21Impl$1 */
        class AnonymousClass1 implements View.OnApplyWindowInsetsListener {
            WindowInsetsCompat mLastInsets = null;
            final /* synthetic */ OnApplyWindowInsetsListener val$listener;
            final /* synthetic */ View val$v;

            AnonymousClass1(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
                view = view;
                onApplyWindowInsetsListener = onApplyWindowInsetsListener;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                if (Build.VERSION.SDK_INT < 30) {
                    Api21Impl.callCompatInsetAnimationCallback(windowInsets, view);
                    if (windowInsetsCompat.equals(this.mLastInsets)) {
                        return onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsetsCompat).toWindowInsets();
                    }
                }
                this.mLastInsets = windowInsetsCompat;
                WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsetsCompat);
                if (Build.VERSION.SDK_INT >= 30) {
                    return windowInsetsCompatOnApplyWindowInsets.toWindowInsets();
                }
                ViewCompat.requestApplyInsets(view);
                return windowInsetsCompatOnApplyWindowInsets.toWindowInsets();
            }
        }

        static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            AnonymousClass1 anonymousClass1 = onApplyWindowInsetsListener != null ? new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.Api21Impl.1
                WindowInsetsCompat mLastInsets = null;
                final /* synthetic */ OnApplyWindowInsetsListener val$listener;
                final /* synthetic */ View val$v;

                AnonymousClass1(View view2, OnApplyWindowInsetsListener onApplyWindowInsetsListener2) {
                    view = view2;
                    onApplyWindowInsetsListener = onApplyWindowInsetsListener2;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view2);
                    if (Build.VERSION.SDK_INT < 30) {
                        Api21Impl.callCompatInsetAnimationCallback(windowInsets, view);
                        if (windowInsetsCompat.equals(this.mLastInsets)) {
                            return onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat).toWindowInsets();
                        }
                    }
                    this.mLastInsets = windowInsetsCompat;
                    WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat);
                    if (Build.VERSION.SDK_INT >= 30) {
                        return windowInsetsCompatOnApplyWindowInsets.toWindowInsets();
                    }
                    ViewCompat.requestApplyInsets(view2);
                    return windowInsetsCompatOnApplyWindowInsets.toWindowInsets();
                }
            } : null;
            if (Build.VERSION.SDK_INT < 30) {
                view2.setTag(R.id.tag_on_apply_window_listener, anonymousClass1);
            }
            if (view2.getTag(R.id.tag_compat_insets_dispatch) != null) {
                return;
            }
            if (anonymousClass1 != null) {
                view2.setOnApplyWindowInsetsListener(anonymousClass1);
            } else {
                view2.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view2.getTag(R.id.tag_window_insets_animation_callback));
            }
        }

        static void callCompatInsetAnimationCallback(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static boolean dispatchNestedFling(View view, float f2, float f3, boolean z2) {
            return view.dispatchNestedFling(f2, f3, z2);
        }

        static boolean dispatchNestedPreFling(View view, float f2, float f3) {
            return view.dispatchNestedPreFling(f2, f3);
        }

        static float getZ(View view) {
            return view.getZ();
        }

        static void setZ(View view, float f2) {
            view.setZ(f2);
        }

        static void setElevation(View view, float f2) {
            view.setElevation(f2);
        }

        static void setTranslationZ(View view, float f2) {
            view.setTranslationZ(f2);
        }

        static float getTranslationZ(View view) {
            return view.getTranslationZ();
        }

        static void setTransitionName(View view, String str) {
            view.setTransitionName(str);
        }

        static boolean isImportantForAccessibility(View view) {
            return view.isImportantForAccessibility();
        }

        static float getElevation(View view) {
            return view.getElevation();
        }

        static String getTransitionName(View view) {
            return view.getTransitionName();
        }

        static void setBackgroundTintList(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static ColorStateList getBackgroundTintList(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode getBackgroundTintMode(View view) {
            return view.getBackgroundTintMode();
        }

        static void setBackgroundTintMode(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void setNestedScrollingEnabled(View view, boolean z2) {
            view.setNestedScrollingEnabled(z2);
        }

        static boolean isNestedScrollingEnabled(View view) {
            return view.isNestedScrollingEnabled();
        }

        static boolean startNestedScroll(View view, int i2) {
            return view.startNestedScroll(i2);
        }

        static void stopNestedScroll(View view) {
            view.stopNestedScroll();
        }

        static boolean hasNestedScrollingParent(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean dispatchNestedScroll(View view, int i2, int i3, int i4, int i5, int[] iArr) {
            return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }

        static boolean dispatchNestedPreScroll(View view, int i2, int i3, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        public static WindowInsetsCompat getRootWindowInsets(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.setRootWindowInsets(windowInsetsCompat);
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
            return windowInsetsCompat;
        }

        static void setScrollIndicators(View view, int i2) {
            view.setScrollIndicators(i2);
        }

        static void setScrollIndicators(View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }

        static int getScrollIndicators(View view) {
            return view.getScrollIndicators();
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static void saveAttributeDataForStyleable(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }

        static View.AccessibilityDelegate getAccessibilityDelegate(View view) {
            return view.getAccessibilityDelegate();
        }

        static void setSystemGestureExclusionRects(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }

        static List<Rect> getSystemGestureExclusionRects(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static ContentCaptureSession getContentCaptureSession(View view) {
            return view.getContentCaptureSession();
        }

        static void setContentCaptureSession(View view, ContentCaptureSessionCompat contentCaptureSessionCompat) {
            view.setContentCaptureSession(contentCaptureSessionCompat == null ? null : contentCaptureSessionCompat.toContentCaptureSession());
        }

        static void transformMatrixToGlobal(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        public static WindowInsetsControllerCompat getWindowInsetsController(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return WindowInsetsControllerCompat.toWindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }

        static void setStateDescription(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        static CharSequence getStateDescription(View view) {
            return view.getStateDescription();
        }

        static void setImportantForContentCapture(View view, int i2) {
            view.setImportantForContentCapture(i2);
        }

        static boolean isImportantForContentCapture(View view) {
            return view.isImportantForContentCapture();
        }

        static int getImportantForContentCapture(View view) {
            return view.getImportantForContentCapture();
        }

        static WindowInsets dispatchApplyWindowInsets(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void setAutofillHints(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void setTooltipText(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }

        static int getNextClusterForwardId(View view) {
            return view.getNextClusterForwardId();
        }

        static void setNextClusterForwardId(View view, int i2) {
            view.setNextClusterForwardId(i2);
        }

        static boolean isKeyboardNavigationCluster(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static void setKeyboardNavigationCluster(View view, boolean z2) {
            view.setKeyboardNavigationCluster(z2);
        }

        static boolean isFocusedByDefault(View view) {
            return view.isFocusedByDefault();
        }

        static void setFocusedByDefault(View view, boolean z2) {
            view.setFocusedByDefault(z2);
        }

        static View keyboardNavigationClusterSearch(View view, View view2, int i2) {
            return view.keyboardNavigationClusterSearch(view2, i2);
        }

        static void addKeyboardNavigationClusters(View view, Collection<View> collection, int i2) {
            view.addKeyboardNavigationClusters(collection, i2);
        }

        static boolean restoreDefaultFocus(View view) {
            return view.restoreDefaultFocus();
        }

        static boolean hasExplicitFocusable(View view) {
            return view.hasExplicitFocusable();
        }

        static int getImportantForAutofill(View view) {
            return view.getImportantForAutofill();
        }

        static void setImportantForAutofill(View view, int i2) {
            view.setImportantForAutofill(i2);
        }

        static boolean isImportantForAutofill(View view) {
            return view.isImportantForAutofill();
        }

        public static AutofillId getAutofillId(View view) {
            return view.getAutofillId();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void setPointerIcon(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean startDragAndDrop(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i2) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i2);
        }

        static void cancelDragAndDrop(View view) {
            view.cancelDragAndDrop();
        }

        static void updateDragShadow(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }

        static void dispatchStartTemporaryDetach(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void dispatchFinishTemporaryDetach(View view) {
            view.dispatchFinishTemporaryDetach();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static <T> T requireViewById(View view, int i2) {
            return (T) view.requireViewById(i2);
        }

        static CharSequence getAccessibilityPaneTitle(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static void setAccessibilityPaneTitle(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void setAccessibilityHeading(View view, boolean z2) {
            view.setAccessibilityHeading(z2);
        }

        static boolean isAccessibilityHeading(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean isScreenReaderFocusable(View view) {
            return view.isScreenReaderFocusable();
        }

        static void setScreenReaderFocusable(View view, boolean z2) {
            view.setScreenReaderFocusable(z2);
        }

        static void addOnUnhandledKeyEventListener(View view, final OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap();
                view.setTag(R.id.tag_unhandled_key_listeners, simpleArrayMap);
            }
            Objects.requireNonNull(onUnhandledKeyEventListenerCompat);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.ViewCompat$Api28Impl$$ExternalSyntheticLambda0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return onUnhandledKeyEventListenerCompat.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            simpleArrayMap.put(onUnhandledKeyEventListenerCompat, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static void removeOnUnhandledKeyEventListener(View view, OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) simpleArrayMap.get(onUnhandledKeyEventListenerCompat)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static void setAutofillId(View view, AutofillIdCompat autofillIdCompat) {
            view.setAutofillId(autofillIdCompat == null ? null : autofillIdCompat.toAutofillId());
        }
    }

    static class Api20Impl {
        private Api20Impl() {
        }

        static void requestApplyInsets(View view) {
            view.requestApplyInsets();
        }

        static WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static WindowInsets dispatchApplyWindowInsets(View view, WindowInsets windowInsets) {
            return ViewGroupCompat.sCompatInsetsDispatchInstalled ? ViewGroupCompat.dispatchApplyWindowInsets(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }
    }
}
