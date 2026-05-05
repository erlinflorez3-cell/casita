package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.firebase.FirebaseError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
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

/* JADX INFO: loaded from: classes8.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_BottomSheet_DragHandle;
    private final AccessibilityManager accessibilityManager;
    private boolean accessibilityServiceEnabled;
    private BottomSheetBehavior<?> bottomSheetBehavior;
    private final BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    private final String clickFeedback;
    private final String clickToCollapseActionLabel;
    private boolean clickToExpand;
    private final String clickToExpandActionLabel;
    private boolean interactable;

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, DEF_STYLE_RES), attributeSet, i2);
        this.clickToExpandActionLabel = getResources().getString(R.string.bottomsheet_action_expand);
        this.clickToCollapseActionLabel = getResources().getString(R.string.bottomsheet_action_collapse);
        this.clickFeedback = getResources().getString(R.string.bottomsheet_drag_handle_clicked);
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view, float f2) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i3) throws Throwable {
                BottomSheetDragHandleView.this.onBottomSheetStateChanged(i3);
            }
        };
        Context context2 = getContext();
        Object[] objArr = {hg.Vd(">?>?LK@8>@<FJ", (short) (C1580rY.Xd() ^ (-286)), (short) (C1580rY.Xd() ^ (-31934)))};
        Method method = Class.forName(C1561oA.ud("FRGTPIC\f@KIN>FK\u0004\u0018CAF6HC", (short) (OY.Xd() ^ FirebaseError.ERROR_USER_DISABLED))).getMethod(C1561oA.Yd("#\"2\u0012946(1\u0018+9>2-0", (short) (C1607wl.Xd() ^ 5483)), Class.forName(C1561oA.yd("UKcM\u001dZR^J\u00108XYOWO", (short) (OY.Xd() ^ 22689))));
        try {
            method.setAccessible(true);
            this.accessibilityManager = (AccessibilityManager) method.invoke(context2, objArr);
            updateInteractableState();
            ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.2
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) throws Throwable {
                    super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                    if (accessibilityEvent.getEventType() == 1) {
                        BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
                    }
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void announceAccessibilityEvent(String str) throws Throwable {
        if (this.accessibilityManager == null) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.getText().add(str);
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        Object[] objArr = {accessibilityEventObtain};
        Method method = Class.forName(Xg.qd("R`Wfd_[&oc`s+_bcfuvmgosq}\u00049Mpqt\u0004\u0005{u}\u0002\u007f\f\u0012f{\n}\u0005\u0004\u0012", (short) (OY.Xd() ^ 2321), (short) (OY.Xd() ^ 10181))).getMethod(ZO.xd("/4wNd\u001b)k\u0015\u001af\u0001\u0014b\u001e_\tA\"R J", (short) (C1499aX.Xd() ^ (-1512)), (short) (C1499aX.Xd() ^ (-12575))), Class.forName(Jg.Wd("\u0012&3@TU_0\b\u0002\u0015F\u0014F_fw\r\u001c\u0019)\u000f)%GS\u00171bi\u00030G<LZlp\u000b\u0017y\u000b\u0011\u00196", (short) (C1607wl.Xd() ^ 1502), (short) (C1607wl.Xd() ^ 29462))));
        try {
            method.setAccessible(true);
            method.invoke(accessibilityManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean expandOrCollapseBottomSheetIfPossible() throws Throwable {
        boolean z2 = false;
        if (!this.interactable) {
            return false;
        }
        announceAccessibilityEvent(this.clickFeedback);
        if (!this.bottomSheetBehavior.isFitToContents() && !this.bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
            z2 = true;
        }
        int state = this.bottomSheetBehavior.getState();
        int i2 = 6;
        int i3 = 3;
        if (state == 4) {
            if (!z2) {
                i2 = i3;
            }
        } else if (state != 3) {
            if (!this.clickToExpand) {
                i3 = 4;
            }
            i2 = i3;
        } else if (!z2) {
            i2 = 4;
        }
        this.bottomSheetBehavior.setState(i2);
        return true;
    }

    private BottomSheetBehavior<?> findParentBottomSheetBehavior() {
        View parentView = this;
        while (true) {
            parentView = getParentView(parentView);
            if (parentView == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = parentView.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) behavior;
                }
            }
        }
    }

    private static View getParentView(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBottomSheetStateChanged(int i2) throws Throwable {
        if (i2 == 4) {
            this.clickToExpand = true;
        } else if (i2 == 3) {
            this.clickToExpand = false;
        }
        ViewCompat.replaceAccessibilityAction(this, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK, this.clickToExpand ? this.clickToExpandActionLabel : this.clickToCollapseActionLabel, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView$$ExternalSyntheticLambda0
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                return this.f$0.m7578xa7b4c95f(view, commandArguments);
            }
        });
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) throws Throwable {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(this.bottomSheetCallback);
            this.bottomSheetBehavior.setAccessibilityDelegateView(null);
        }
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setAccessibilityDelegateView(this);
            onBottomSheetStateChanged(this.bottomSheetBehavior.getState());
            this.bottomSheetBehavior.addBottomSheetCallback(this.bottomSheetCallback);
        }
        updateInteractableState();
    }

    private void updateInteractableState() {
        this.interactable = this.accessibilityServiceEnabled && this.bottomSheetBehavior != null;
        ViewCompat.setImportantForAccessibility(this, this.bottomSheetBehavior == null ? 2 : 1);
        setClickable(this.interactable);
    }

    /* JADX INFO: renamed from: lambda$onBottomSheetStateChanged$0$com-google-android-material-bottomsheet-BottomSheetDragHandleView, reason: not valid java name */
    /* synthetic */ boolean m7578xa7b4c95f(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return expandOrCollapseBottomSheetIfPossible();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z2) {
        this.accessibilityServiceEnabled = z2;
        updateInteractableState();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() throws Throwable {
        super.onAttachedToWindow();
        setBottomSheetBehavior(findParentBottomSheetBehavior());
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            short sXd = (short) (Od.Xd() ^ (-32363));
            short sXd2 = (short) (Od.Xd() ^ (-19206));
            int[] iArr = new int["\nVMLBwnRF^\nd9txC\u001ab\u0019\u0007*\"\u001aa\u0004\u000f\u0012\u007f@\u0001mi\u0014ML\u0003_1'-sT(\u0012d^R".length()];
            QB qb = new QB("\nVMLBwnRF^\nd9txC\u001ab\u0019\u0007*\"\u001aa\u0004\u000f\u0012\u007f@\u0001mi\u0014ML\u0003_1'-sT(\u0012d^R");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {this};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("{/]U\u0007d>$sxk\u0019gri\u0010'b\u00076fw;0l\u00161M%<UiB\u0014:", (short) (Od.Xd() ^ (-31483))), Class.forName(Ig.wd("z@h\u0013\u0010T7Afmo\u001c\u001fL2P\u0019a\ns)pQNB\u0017*c\bV@+\u0007o`&\nfxk?4\u0012f+\u0015:\u001c'5U\u0003pX\b45^\r\u0016\u0013\u000eVa,\u0001\u0018\u0019<AGU]>f\u0019*Tg\u0012", (short) (ZN.Xd() ^ 31359))));
            try {
                method.setAccessible(true);
                method.invoke(accessibilityManager, objArr);
                AccessibilityManager accessibilityManager2 = this.accessibilityManager;
                short sXd3 = (short) (C1633zX.Xd() ^ (-17703));
                int[] iArr2 = new int["codqmf`)pb]n$VWVWdcXPVXT^b\u0016(IHIVUJBHJFPT':F8=:F".length()];
                QB qb2 = new QB("codqmf`)pb]n$VWVWdcXPVXT^b\u0016(IHIVUJBHJFPT':F8=:F");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1593ug.zd("_j=g[]hbb", (short) (OY.Xd() ^ 17553), (short) (OY.Xd() ^ 27889)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    onAccessibilityStateChanged(((Boolean) method2.invoke(accessibilityManager2, objArr2)).booleanValue());
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() throws Throwable {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            Object[] objArr = {this};
            Method method = Class.forName(C1561oA.od("\u0007\u0013\b\u0015\u0011\n\u0004L\u0014\u0006\u0001\u0012Gyzyz\b\u0007{sy{w\u0002\u00069KlklyxmekmiswJ]i[`]i", (short) (C1580rY.Xd() ^ (-29635)))).getMethod(Wg.Zd("P4X\u0017\u000b\u0012*hU\u0014B~av:U?\u0007(r@I\u0019flNcm\u00131TN\u0005BKQt\u001e", (short) (Od.Xd() ^ (-26275)), (short) (Od.Xd() ^ (-4193))), Class.forName(C1561oA.Kd("KYP_]XT\u001fh\\Yl$X[\\_nof`hljv|2Fijm|}tnvzx\u0005\u000b_t\u0003v}|\u000b=[~\u007f\u0003\u0012\u0013\n\u0004\f\u0010\u000e\u001a z\u001d\u000b\u001f\u0011o\u0016\u0010\u001e\u0018\u0017~\u001d(*\u001c&\u001e,", (short) (C1607wl.Xd() ^ 19949))));
            try {
                method.setAccessible(true);
                method.invoke(accessibilityManager, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }
}
