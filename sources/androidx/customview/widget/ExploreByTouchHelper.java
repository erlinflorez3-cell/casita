package androidx.customview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.customview.widget.FocusStrategy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> NODE_ADAPTER = new FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat>() { // from class: androidx.customview.widget.ExploreByTouchHelper.1
        AnonymousClass1() {
        }

        @Override // androidx.customview.widget.FocusStrategy.BoundsAdapter
        public void obtainBounds(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
            accessibilityNodeInfoCompat.getBoundsInParent(rect);
        }
    };
    private static final FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> SPARSE_VALUES_ADAPTER = new FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat>() { // from class: androidx.customview.widget.ExploreByTouchHelper.2
        AnonymousClass2() {
        }

        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        public AccessibilityNodeInfoCompat get(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat, int i2) {
            return sparseArrayCompat.valueAt(i2);
        }

        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        public int size(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat) {
            return sparseArrayCompat.size();
        }
    };
    private final View mHost;
    private final AccessibilityManager mManager;
    private MyNodeProvider mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    private static int keyToDirection(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    protected abstract int getVirtualViewAt(float f2, float f3);

    protected abstract void getVisibleVirtualViews(List<Integer> list);

    protected abstract boolean onPerformActionForVirtualView(int i2, int i3, Bundle bundle);

    protected void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateEventForVirtualView(int i2, AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    protected abstract void onPopulateNodeForVirtualView(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    protected void onVirtualViewKeyboardFocusChanged(int i2, boolean z2) {
    }

    public ExploreByTouchHelper(View view) throws Throwable {
        if (view == null) {
            throw new IllegalArgumentException(Xg.qd("Oc`s\u001dk`y!prx%hl(w\u007fwx", (short) (FB.Xd() ^ 7332), (short) (FB.Xd() ^ 1927)));
        }
        this.mHost = view;
        Context context = view.getContext();
        Object[] objArr = {hg.Vd(";<;<IH=5;=9CG", (short) (C1633zX.Xd() ^ (-4112)), (short) (C1633zX.Xd() ^ (-28249)))};
        Method method = Class.forName(C1561oA.ud("\u0015!\u0016#\u001f\u0018\u0012Z\u000f\u001a\u0018\u001d\r\u0015\u001aRf\u0012\u0010\u0015\u0005\u0017\u0012", (short) (C1607wl.Xd() ^ 16168))).getMethod(C1561oA.Yd("|{\fk\u0013\u000e\u0010\u0002\u000bq\u0005\u0013\u0018\f\u0007\n", (short) (Od.Xd() ^ (-13312))), Class.forName(C1561oA.yd("xn\u0007p8umy}Ck\f\u0005z\u0003z", (short) (Od.Xd() ^ (-30720)))));
        try {
            method.setAccessible(true);
            this.mManager = (AccessibilityManager) method.invoke(context, objArr);
            view.setFocusable(true);
            if (ViewCompat.getImportantForAccessibility(view) == 0) {
                ViewCompat.setImportantForAccessibility(view, 1);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new MyNodeProvider();
        }
        return this.mNodeProvider;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) throws Throwable {
        AccessibilityManager accessibilityManager = this.mManager;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("\u0019%\u001a'#\u001c\u0016^&\u0018\u0013$Y\f\r\f\r\u001a\u0019\u000e\u0006\f\u000e\n\u0014\u0018K]~}~\f\u000b\u007fw}\u007f{\u0006\n\\o{mro{", (short) (C1633zX.Xd() ^ (-31289)))).getMethod(C1561oA.yd("\\g:dXZe__", (short) (C1580rY.Xd() ^ (-21743))), new Class[0]);
        try {
            method.setAccessible(true);
            if (!((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue()) {
                return false;
            }
            AccessibilityManager accessibilityManager2 = this.mManager;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Yd(">LCRPKG\u0012[OL_\u0017KNORabYS[_]io%9\\]`opgaimkw}Rguipo}", (short) (ZN.Xd() ^ 3736))).getMethod(Xg.qd("0;\u001d9@/5\u0013G@=AE5I?FF\u001eH<>ICC", (short) (C1499aX.Xd() ^ (-7987)), (short) (C1499aX.Xd() ^ (-12303))), new Class[0]);
            try {
                method2.setAccessible(true);
                if (!((Boolean) method2.invoke(accessibilityManager2, objArr2)).booleanValue()) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
                    updateHoveredVirtualView(virtualViewAt);
                    return virtualViewAt != Integer.MIN_VALUE;
                }
                if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                    return false;
                }
                updateHoveredVirtualView(Integer.MIN_VALUE);
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (keyEvent.hasNoModifiers()) {
                            int iKeyToDirection = keyToDirection(keyCode);
                            int repeatCount = keyEvent.getRepeatCount() + 1;
                            boolean z2 = false;
                            while (i2 < repeatCount && moveFocus(iKeyToDirection, null)) {
                                i2++;
                                z2 = true;
                            }
                        }
                        break;
                }
                return false;
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            clickKeyboardFocusedVirtualView();
            return true;
        }
        if (keyEvent.hasNoModifiers()) {
            return moveFocus(2, null);
        }
        if (keyEvent.hasModifiers(1)) {
            return moveFocus(1, null);
        }
        return false;
    }

    public final void onFocusChanged(boolean z2, int i2, Rect rect) throws Throwable {
        int i3 = this.mKeyboardFocusedVirtualViewId;
        if (i3 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i3);
        }
        if (z2) {
            moveFocus(i2, rect);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    private void getBoundsInParent(int i2, Rect rect) {
        obtainAccessibilityNodeInfo(i2).getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: androidx.customview.widget.ExploreByTouchHelper$1 */
    class AnonymousClass1 implements FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> {
        AnonymousClass1() {
        }

        @Override // androidx.customview.widget.FocusStrategy.BoundsAdapter
        public void obtainBounds(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
            accessibilityNodeInfoCompat.getBoundsInParent(rect);
        }
    }

    /* JADX INFO: renamed from: androidx.customview.widget.ExploreByTouchHelper$2 */
    class AnonymousClass2 implements FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> {
        AnonymousClass2() {
        }

        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        public AccessibilityNodeInfoCompat get(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat, int i2) {
            return sparseArrayCompat.valueAt(i2);
        }

        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        public int size(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat) {
            return sparseArrayCompat.size();
        }
    }

    private boolean moveFocus(int i2, Rect rect) throws Throwable {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        SparseArrayCompat<AccessibilityNodeInfoCompat> allNodes = getAllNodes();
        int i3 = this.mKeyboardFocusedVirtualViewId;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = i3 == Integer.MIN_VALUE ? null : allNodes.get(i3);
        boolean z2 = true;
        if (i2 == 1 || i2 == 2) {
            if (ViewCompat.getLayoutDirection(this.mHost) != 1) {
                z2 = false;
            }
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) FocusStrategy.findNextFocusInRelativeDirection(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, accessibilityNodeInfoCompat2, i2, z2, false);
        } else if (i2 == 17 || i2 == 33 || i2 == 66 || i2 == 130) {
            Rect rect2 = new Rect();
            int i4 = this.mKeyboardFocusedVirtualViewId;
            if (i4 != Integer.MIN_VALUE) {
                getBoundsInParent(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.mHost, i2, rect2);
            }
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) FocusStrategy.findNextFocusInAbsoluteDirection(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, accessibilityNodeInfoCompat2, rect2, i2);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return requestKeyboardFocusForVirtualView(accessibilityNodeInfoCompat != null ? allNodes.keyAt(allNodes.indexOfValue(accessibilityNodeInfoCompat)) : Integer.MIN_VALUE);
    }

    private SparseArrayCompat<AccessibilityNodeInfoCompat> getAllNodes() throws Throwable {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat = new SparseArrayCompat<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sparseArrayCompat.put(arrayList.get(i2).intValue(), createNodeForChild(arrayList.get(i2).intValue()));
        }
        return sparseArrayCompat;
    }

    private static Rect guessPreviouslyFocusedRect(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i2 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        return i2 != Integer.MIN_VALUE && onPerformActionForVirtualView(i2, 16, null);
    }

    public final boolean sendEventForVirtualView(int i2, int i3) throws Throwable {
        ViewParent parent;
        if (i2 != Integer.MIN_VALUE) {
            AccessibilityManager accessibilityManager = this.mManager;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("*1 \u00170\u001cc\u000f[9;?OJqM{d \u0001\u001e\u001cs.OS~tSs#bI9@<Qc(JNjEK*-P", (short) (Od.Xd() ^ (-11249)), (short) (Od.Xd() ^ (-26289)))).getMethod(Ig.wd("kF6v\u0019e[\u0014p", (short) (C1633zX.Xd() ^ (-32251))), new Class[0]);
            try {
                method.setAccessible(true);
                if (((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue() && (parent = this.mHost.getParent()) != null) {
                    return parent.requestSendAccessibilityEvent(this.mHost, createEvent(i2, i3));
                }
                return false;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return false;
    }

    public final void invalidateRoot() throws Throwable {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i2) throws Throwable {
        invalidateVirtualView(i2, 0);
    }

    public final void invalidateVirtualView(int i2, int i3) throws Throwable {
        ViewParent parent;
        if (i2 != Integer.MIN_VALUE) {
            AccessibilityManager accessibilityManager = this.mManager;
            short sXd = (short) (FB.Xd() ^ 27730);
            short sXd2 = (short) (FB.Xd() ^ 2175);
            int[] iArr = new int["Ie|i\u0004\u001dhOv\u000b&\u0015\\/\u000e-\u0010;J!9]AM5Y/\u001f`qR}^s\n_\u0004 \b.P\u0002.\u0002%B ".length()];
            QB qb = new QB("Ie|i\u0004\u001dhOv\u000b&\u0015\\/\u000e-\u0010;J!9]AM5Y/\u001f`qR}^s\n_\u0004 \b.P\u0002.\u0002%B ");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - ((i4 * sXd2) ^ sXd));
                i4++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i4)).getMethod(ZO.xd("_3ZGAjVe'", (short) (FB.Xd() ^ 2069), (short) (FB.Xd() ^ 15557)), new Class[0]);
            try {
                method.setAccessible(true);
                if (!((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue() || (parent = this.mHost.getParent()) == null) {
                    return;
                }
                AccessibilityEvent accessibilityEventCreateEvent = createEvent(i2, 2048);
                AccessibilityEventCompat.setContentChangeTypes(accessibilityEventCreateEvent, i3);
                parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventCreateEvent);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    private void updateHoveredVirtualView(int i2) throws Throwable {
        int i3 = this.mHoveredVirtualViewId;
        if (i3 == i2) {
            return;
        }
        this.mHoveredVirtualViewId = i2;
        sendEventForVirtualView(i2, 128);
        sendEventForVirtualView(i3, 256);
    }

    private AccessibilityEvent createEvent(int i2, int i3) {
        if (i2 == -1) {
            return createEventForHost(i3);
        }
        return createEventForChild(i2, i3);
    }

    private AccessibilityEvent createEventForHost(int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    private AccessibilityEvent createEventForChild(int i2, int i3) throws Throwable {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i2);
        accessibilityEventObtain.getText().add(accessibilityNodeInfoCompatObtainAccessibilityNodeInfo.getText());
        accessibilityEventObtain.setContentDescription(accessibilityNodeInfoCompatObtainAccessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain.setScrollable(accessibilityNodeInfoCompatObtainAccessibilityNodeInfo.isScrollable());
        accessibilityEventObtain.setPassword(accessibilityNodeInfoCompatObtainAccessibilityNodeInfo.isPassword());
        accessibilityEventObtain.setEnabled(accessibilityNodeInfoCompatObtainAccessibilityNodeInfo.isEnabled());
        accessibilityEventObtain.setChecked(accessibilityNodeInfoCompatObtainAccessibilityNodeInfo.isChecked());
        onPopulateEventForVirtualView(i2, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException(Jg.Wd("h5-\u001b\nz%\u001d\u001b<sh!\u0011%XTF&mYY?[eXm!T\nB0-\u000f\u0002xZ\u0013zwda\u0001vv[G;#\\Lm6'PH3\u001b\u0019v\u00112\f\u0005\u0003\u0007\u0014\nik\\\u000e\neW5?jh)<n[", (short) (C1580rY.Xd() ^ (-31580)), (short) (C1580rY.Xd() ^ (-22869))));
        }
        accessibilityEventObtain.setClassName(accessibilityNodeInfoCompatObtainAccessibilityNodeInfo.getClassName());
        AccessibilityRecordCompat.setSource(accessibilityEventObtain, this.mHost, i2);
        Context context = this.mHost.getContext();
        short sXd = (short) (C1633zX.Xd() ^ (-28104));
        short sXd2 = (short) (C1633zX.Xd() ^ (-25820));
        int[] iArr = new int["h80UjG\u000eRA\u0013\"X\u0006G3WLR\t\b\u0019t/".length()];
        QB qb = new QB("h80UjG\u000eRA\u0013\"X\u0006G3WLR\t\b\u0019t/");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd2) + sXd)));
            i4++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i4)).getMethod(C1626yg.Ud("O9\u001cnV\u0010g\u0006ND Gx.", (short) (C1633zX.Xd() ^ (-31356)), (short) (C1633zX.Xd() ^ (-3619))), new Class[0]);
        try {
            method.setAccessible(true);
            accessibilityEventObtain.setPackageName((String) method.invoke(context, objArr));
            return accessibilityEventObtain;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int i2) {
        if (i2 == -1) {
            return createNodeForHost();
        }
        return createNodeForChild(i2);
    }

    private AccessibilityNodeInfoCompat createNodeForHost() {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(this.mHost);
        ViewCompat.onInitializeAccessibilityNodeInfo(this.mHost, accessibilityNodeInfoCompatObtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (accessibilityNodeInfoCompatObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            accessibilityNodeInfoCompatObtain.addChild(this.mHost, ((Integer) arrayList.get(i2)).intValue());
        }
        return accessibilityNodeInfoCompatObtain;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        onPopulateNodeForHost(accessibilityNodeInfoCompat);
    }

    private AccessibilityNodeInfoCompat createNodeForChild(int i2) throws Throwable {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        accessibilityNodeInfoCompatObtain.setEnabled(true);
        accessibilityNodeInfoCompatObtain.setFocusable(true);
        short sXd = (short) (C1607wl.Xd() ^ 1553);
        int[] iArr = new int["X8@e:wVg\u0006\b\u0002:>hWxR".length()];
        QB qb = new QB("X8@e:wVg\u0006\b\u0002:>hWxR");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
            i3++;
        }
        accessibilityNodeInfoCompatObtain.setClassName(new String(iArr, 0, i3));
        Rect rect = INVALID_PARENT_BOUNDS;
        accessibilityNodeInfoCompatObtain.setBoundsInParent(rect);
        accessibilityNodeInfoCompatObtain.setBoundsInScreen(rect);
        accessibilityNodeInfoCompatObtain.setParent(this.mHost);
        onPopulateNodeForVirtualView(i2, accessibilityNodeInfoCompatObtain);
        if (accessibilityNodeInfoCompatObtain.getText() == null && accessibilityNodeInfoCompatObtain.getContentDescription() == null) {
            throw new RuntimeException(EO.Od("p@=\u001ao;M\u00068e1\u001bGB\u0006&]{_P{GU|f\nYc@6b\u007f.=\u0015Y'\u0014\u001e6.e\u000b\u0010nsn?~d*\b@(\u0007m`5\u0014\u0005gl/,Vu8upwY<\bD*\rj`\u0014\u000b\u0006:", (short) (Od.Xd() ^ (-2768))));
        }
        accessibilityNodeInfoCompatObtain.getBoundsInParent(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException(Wg.Zd("\u0003Oj6:\t\u0017n\u0005|Z.:\u000bBee`\u001c87\u00187O$Zm\u0006Zb%C>sH\b$3\u007f\u0013YZ=<PBB\u0012\u0002\u0018*\\zTa1,\u0004|^eH%\u000fan", (short) (ZN.Xd() ^ 13919), (short) (ZN.Xd() ^ 9903)));
        }
        int actions = accessibilityNodeInfoCompatObtain.getActions();
        if ((64 & actions) != 0) {
            throw new RuntimeException(C1561oA.Kd("a\u0001\r\u000e\u0005\u0005\b\u0011\u001aG\u0016\u001f\u001e L\u001c\u001e$P\u0013\u0017\u0018Tvy\f\u0002\t\t\u001b}\u0001\u0002\u0005\u0014\u0015\f\u0006\u000e\u0012\u0010\u001c\")\u0011\u001b\u0010#\"o:@rDDFLD:N@*LBD&PT9MWZ\\IU@TQd7S\u0018\u001a", (short) (C1580rY.Xd() ^ (-23021))));
        }
        if ((actions + 128) - (actions | 128) != 0) {
            throw new RuntimeException(C1561oA.od("\u001b8BA645<Cn;B??i77;e&('a\u0002\u0003\u0013\u0007\f\n\u001a|\u0005|w\b\u0014tutu\u0003\u0002vntvr|\u0001\u0006ksfwt@\t\r=\r\u000b\u000b\u000f\u0005x\u000bzb\u0003vvV~\u0001cu}~~is\\nizKe((", (short) (OY.Xd() ^ 9427)));
        }
        Context context = this.mHost.getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("LXMZVOI\u0012FQOTDLQ\n\u001eIGL<NI", (short) (C1580rY.Xd() ^ (-2645)))).getMethod(C1593ug.zd("ihxUgjsjqpZn{t", (short) (C1607wl.Xd() ^ 20905), (short) (C1607wl.Xd() ^ 9283)), new Class[0]);
        try {
            method.setAccessible(true);
            accessibilityNodeInfoCompatObtain.setPackageName((String) method.invoke(context, objArr));
            accessibilityNodeInfoCompatObtain.setSource(this.mHost, i2);
            if (this.mAccessibilityFocusedVirtualViewId == i2) {
                accessibilityNodeInfoCompatObtain.setAccessibilityFocused(true);
                accessibilityNodeInfoCompatObtain.addAction(128);
            } else {
                accessibilityNodeInfoCompatObtain.setAccessibilityFocused(false);
                accessibilityNodeInfoCompatObtain.addAction(64);
            }
            boolean z2 = this.mKeyboardFocusedVirtualViewId == i2;
            if (z2) {
                accessibilityNodeInfoCompatObtain.addAction(2);
            } else if (accessibilityNodeInfoCompatObtain.isFocusable()) {
                accessibilityNodeInfoCompatObtain.addAction(1);
            }
            accessibilityNodeInfoCompatObtain.setFocused(z2);
            this.mHost.getLocationOnScreen(this.mTempGlobalRect);
            accessibilityNodeInfoCompatObtain.getBoundsInScreen(this.mTempScreenRect);
            if (this.mTempScreenRect.equals(rect)) {
                accessibilityNodeInfoCompatObtain.getBoundsInParent(this.mTempScreenRect);
                if (accessibilityNodeInfoCompatObtain.mParentVirtualDescendantId != -1) {
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain2 = AccessibilityNodeInfoCompat.obtain();
                    for (int i4 = accessibilityNodeInfoCompatObtain.mParentVirtualDescendantId; i4 != -1; i4 = accessibilityNodeInfoCompatObtain2.mParentVirtualDescendantId) {
                        accessibilityNodeInfoCompatObtain2.setParent(this.mHost, -1);
                        accessibilityNodeInfoCompatObtain2.setBoundsInParent(INVALID_PARENT_BOUNDS);
                        onPopulateNodeForVirtualView(i4, accessibilityNodeInfoCompatObtain2);
                        accessibilityNodeInfoCompatObtain2.getBoundsInParent(this.mTempParentRect);
                        this.mTempScreenRect.offset(this.mTempParentRect.left, this.mTempParentRect.top);
                    }
                    accessibilityNodeInfoCompatObtain2.recycle();
                }
                this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            }
            if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
                this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                    accessibilityNodeInfoCompatObtain.setBoundsInScreen(this.mTempScreenRect);
                    if (isVisibleToUser(this.mTempScreenRect)) {
                        accessibilityNodeInfoCompatObtain.setVisibleToUser(true);
                    }
                }
            }
            return accessibilityNodeInfoCompatObtain;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 == -1) {
            return performActionForHost(i3, bundle);
        }
        return performActionForChild(i2, i3, bundle);
    }

    private boolean performActionForHost(int i2, Bundle bundle) {
        return ViewCompat.performAccessibilityAction(this.mHost, i2, bundle);
    }

    private boolean performActionForChild(int i2, int i3, Bundle bundle) {
        if (i3 == 1) {
            return requestKeyboardFocusForVirtualView(i2);
        }
        if (i3 == 2) {
            return clearKeyboardFocusForVirtualView(i2);
        }
        if (i3 == 64) {
            return requestAccessibilityFocus(i2);
        }
        if (i3 == 128) {
            return clearAccessibilityFocus(i2);
        }
        return onPerformActionForVirtualView(i2, i3, bundle);
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private boolean requestAccessibilityFocus(int i2) throws Throwable {
        int i3;
        AccessibilityManager accessibilityManager = this.mManager;
        short sXd = (short) (C1633zX.Xd() ^ (-86));
        int[] iArr = new int["\r\u001b\u0012!\u001f\u001a\u0016`*\u001e\u001b.e\u001a\u001d\u001e!01(\"*.,8>s\b+,/>?608<:FL!6D8?>L".length()];
        QB qb = new QB("\r\u001b\u0012!\u001f\u001a\u0016`*\u001e\u001b.e\u001a\u001d\u001e!01(\"*.,8>s\b+,/>?608<:FL!6D8?>L");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd + i4));
            i4++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i4)).getMethod(Wg.vd("v\u007fPxrr{si", (short) (Od.Xd() ^ (-23727))), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue()) {
                AccessibilityManager accessibilityManager2 = this.mManager;
                short sXd2 = (short) (C1580rY.Xd() ^ (-25188));
                short sXd3 = (short) (C1580rY.Xd() ^ (-26592));
                int[] iArr2 = new int[" ,!.*#\u001de-\u001f\u001a+`\u0013\u0014\u0013\u0014! \u0015\r\u0013\u0015\u0011\u001b\u001fRd\u0006\u0005\u0006\u0013\u0012\u0007~\u0005\u0007\u0003\r\u0011cv\u0003tyv\u0003".length()];
                QB qb2 = new QB(" ,!.*#\u001de-\u001f\u001a+`\u0013\u0014\u0013\u0014! \u0015\r\u0013\u0015\u0011\u001b\u001fRd\u0006\u0005\u0006\u0013\u0012\u0007~\u0005\u0007\u0003\r\u0011cv\u0003tyv\u0003");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(((sXd2 + i5) + xuXd2.CK(iKK2)) - sXd3);
                    i5++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr2, 0, i5)).getMethod(hg.Vd("NW7QVCG#ULGIK9K?DB\u0018@22;31", (short) (C1499aX.Xd() ^ (-19672)), (short) (C1499aX.Xd() ^ (-25059))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    if (((Boolean) method2.invoke(accessibilityManager2, objArr2)).booleanValue() && (i3 = this.mAccessibilityFocusedVirtualViewId) != i2) {
                        if (i3 != Integer.MIN_VALUE) {
                            clearAccessibilityFocus(i3);
                        }
                        this.mAccessibilityFocusedVirtualViewId = i2;
                        this.mHost.invalidate();
                        sendEventForVirtualView(i2, 32768);
                        return true;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return false;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private boolean clearAccessibilityFocus(int i2) throws Throwable {
        if (this.mAccessibilityFocusedVirtualViewId != i2) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i2, 65536);
        return true;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i2) throws Throwable {
        int i3;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i3 = this.mKeyboardFocusedVirtualViewId) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i2;
        onVirtualViewKeyboardFocusChanged(i2, true);
        sendEventForVirtualView(i2, 8);
        return true;
    }

    public final boolean clearKeyboardFocusForVirtualView(int i2) throws Throwable {
        if (this.mKeyboardFocusedVirtualViewId != i2) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i2, false);
        sendEventForVirtualView(i2, 8);
        return true;
    }

    private class MyNodeProvider extends AccessibilityNodeProviderCompat {
        MyNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i2) {
            return AccessibilityNodeInfoCompat.obtain(ExploreByTouchHelper.this.obtainAccessibilityNodeInfo(i2));
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int i2, int i3, Bundle bundle) {
            return ExploreByTouchHelper.this.performAction(i2, i3, bundle);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat findFocus(int i2) {
            int i3 = i2 == 2 ? ExploreByTouchHelper.this.mAccessibilityFocusedVirtualViewId : ExploreByTouchHelper.this.mKeyboardFocusedVirtualViewId;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return createAccessibilityNodeInfo(i3);
        }
    }
}
