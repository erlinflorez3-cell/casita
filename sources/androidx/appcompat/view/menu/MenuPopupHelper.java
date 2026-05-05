package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.GravityCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class MenuPopupHelper implements MenuHelper {
    private static final int TOUCH_EPICENTER_SIZE_DP = 48;
    private View mAnchorView;
    private final Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private final PopupWindow.OnDismissListener mInternalOnDismissListener;
    private final MenuBuilder mMenu;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private MenuPopup mPopup;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private MenuPresenter.Callback mPresenterCallback;

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder) {
        this(context, menuBuilder, null, false, R.attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view) {
        this(context, menuBuilder, view, false, R.attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view, boolean z2, int i2) {
        this(context, menuBuilder, view, z2, i2, 0);
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view, boolean z2, int i2, int i3) {
        this.mDropDownGravity = GravityCompat.START;
        this.mInternalOnDismissListener = new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.view.menu.MenuPopupHelper.1
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                MenuPopupHelper.this.onDismiss();
            }
        };
        this.mContext = context;
        this.mMenu = menuBuilder;
        this.mAnchorView = view;
        this.mOverflowOnly = z2;
        this.mPopupStyleAttr = i2;
        this.mPopupStyleRes = i3;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setAnchorView(View view) {
        this.mAnchorView = view;
    }

    public void setForceShowIcon(boolean z2) {
        this.mForceShowIcon = z2;
        MenuPopup menuPopup = this.mPopup;
        if (menuPopup != null) {
            menuPopup.setForceShowIcon(z2);
        }
    }

    public void setGravity(int i2) {
        this.mDropDownGravity = i2;
    }

    public int getGravity() {
        return this.mDropDownGravity;
    }

    public void show() {
        if (!tryShow()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void show(int i2, int i3) {
        if (!tryShow(i2, i3)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public MenuPopup getPopup() {
        if (this.mPopup == null) {
            this.mPopup = createPopup();
        }
        return this.mPopup;
    }

    public boolean tryShow() throws Throwable {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        showPopup(0, 0, false, false);
        return true;
    }

    public boolean tryShow(int i2, int i3) throws Throwable {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        showPopup(i2, i3, true, true);
        return true;
    }

    private MenuPopup createPopup() throws Throwable {
        MenuPopup standardMenuPopup;
        Context context = this.mContext;
        String strZd = Wg.Zd("\"8\u0015/3\u000f", (short) (OY.Xd() ^ 26142), (short) (OY.Xd() ^ 24893));
        short sXd = (short) (OY.Xd() ^ 24902);
        int[] iArr = new int["drixvqm8n{{\u0003t~\u0006@V\u0004\u0004\u000b|\u0011\u000e".length()];
        QB qb = new QB("drixvqm8n{{\u0003t~\u0006@V\u0004\u0004\u000b|\u0011\u000e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (FB.Xd() ^ 13828);
        int[] iArr2 = new int["\u007fw\u000eyG\u0007|\u000bt<b\u0005\u0004{\u0002{".length()];
        QB qb2 = new QB("\u007fw\u000eyG\u0007|\u000bt<b\u0005\u0004{\u0002{");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {strZd};
        Method method = cls.getMethod(Qg.kd("yv\u0005b\b\u0001\u0001pw\\my|ngh", (short) (FB.Xd() ^ 12192), (short) (FB.Xd() ^ 6277)), clsArr);
        try {
            method.setAccessible(true);
            Display defaultDisplay = ((WindowManager) method.invoke(context, objArr)).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            Context context2 = this.mContext;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(hg.Vd("jvkxtmg0domrbjo(<gejZlg", (short) (C1499aX.Xd() ^ (-15051)), (short) (C1499aX.Xd() ^ (-24445)))).getMethod(C1561oA.ud("pm{Xjwrwscdq", (short) (OY.Xd() ^ 14110)), new Class[0]);
            try {
                method2.setAccessible(true);
                if (iMin >= ((Resources) method2.invoke(context2, objArr2)).getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                    standardMenuPopup = new CascadingMenuPopup(this.mContext, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
                } else {
                    standardMenuPopup = new StandardMenuPopup(this.mContext, this.mMenu, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
                }
                standardMenuPopup.addMenu(this.mMenu);
                standardMenuPopup.setOnDismissListener(this.mInternalOnDismissListener);
                standardMenuPopup.setAnchorView(this.mAnchorView);
                standardMenuPopup.setCallback(this.mPresenterCallback);
                standardMenuPopup.setForceShowIcon(this.mForceShowIcon);
                standardMenuPopup.setGravity(this.mDropDownGravity);
                return standardMenuPopup;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private void showPopup(int i2, int i3, boolean z2, boolean z3) throws Throwable {
        MenuPopup popup = getPopup();
        popup.setShowTitle(z3);
        if (z2) {
            if ((GravityCompat.getAbsoluteGravity(this.mDropDownGravity, this.mAnchorView.getLayoutDirection()) & 7) == 5) {
                i2 -= this.mAnchorView.getWidth();
            }
            popup.setHorizontalOffset(i2);
            popup.setVerticalOffset(i3);
            Context context = this.mContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("jvkxtmg0domrbjo(<gejZlg", (short) (C1633zX.Xd() ^ (-16524)))).getMethod(C1561oA.Yd("65E$8GDKI;>M", (short) (Od.Xd() ^ (-13251))), new Class[0]);
            try {
                method.setAccessible(true);
                int i4 = (int) ((((Resources) method.invoke(context, objArr)).getDisplayMetrics().density * 48.0f) / 2.0f);
                popup.setEpicenterBounds(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        popup.show();
    }

    @Override // androidx.appcompat.view.menu.MenuHelper
    public void dismiss() {
        if (isShowing()) {
            this.mPopup.dismiss();
        }
    }

    protected void onDismiss() {
        this.mPopup = null;
        PopupWindow.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean isShowing() {
        MenuPopup menuPopup = this.mPopup;
        return menuPopup != null && menuPopup.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuHelper
    public void setPresenterCallback(MenuPresenter.Callback callback) {
        this.mPresenterCallback = callback;
        MenuPopup menuPopup = this.mPopup;
        if (menuPopup != null) {
            menuPopup.setCallback(callback);
        }
    }

    public ListView getListView() {
        return getPopup().getListView();
    }
}
