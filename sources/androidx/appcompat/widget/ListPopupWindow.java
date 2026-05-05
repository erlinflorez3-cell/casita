package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.widget.PopupWindowCompat;
import com.dynatrace.android.callback.Callback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements ShowableListMenu {
    private static final boolean DEBUG = false;
    static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private static Method sGetMaxAvailableHeightMethod = null;
    private static Method sSetClipToWindowEnabledMethod = null;
    private static Method sSetEpicenterBoundsMethod = null;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    private View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    DropDownListView mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private Rect mEpicenterBounds;
    private boolean mForceIgnoreOutsideTouch;
    final Handler mHandler;
    private final ListSelectorHider mHideSelector;
    private AdapterView.OnItemClickListener mItemClickListener;
    private AdapterView.OnItemSelectedListener mItemSelectedListener;
    int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    final ResizePopupRunnable mResizePopupRunnable;
    private final PopupScrollListener mScrollListener;
    private Runnable mShowDropDownRunnable;
    private final Rect mTempRect;
    private final PopupTouchInterceptor mTouchInterceptor;

    private static boolean isConfirmKey(int i2) {
        return i2 == 66 || i2 == 23;
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                sSetClipToWindowEnabledMethod = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                sSetEpicenterBoundsMethod = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mDropDownWindowLayoutType = 1002;
        this.mDropDownGravity = 0;
        this.mDropDownAlwaysVisible = false;
        this.mForceIgnoreOutsideTouch = false;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        this.mPromptPosition = 0;
        this.mResizePopupRunnable = new ResizePopupRunnable();
        this.mTouchInterceptor = new PopupTouchInterceptor();
        this.mScrollListener = new PopupScrollListener();
        this.mHideSelector = new ListSelectorHider();
        this.mTempRect = new Rect();
        this.mContext = context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("p]3\u001bwM KXD##sX6Q>J)\tYH{", (short) (FB.Xd() ^ 9838), (short) (FB.Xd() ^ 8179))).getMethod(C1561oA.Xd("A@P*?HN-QRTJX", (short) (Od.Xd() ^ (-14880))), new Class[0]);
        try {
            method.setAccessible(true);
            this.mHandler = new Handler((Looper) method.invoke(context, objArr));
            int[] iArr = R.styleable.ListPopupWindow;
            Class<?> cls = Class.forName(Wg.vd("BNCPLE?\b<GEJ:BG\u007f4_]bRd_", (short) (Od.Xd() ^ (-27707))));
            Class<?>[] clsArr = new Class[4];
            short sXd = (short) (C1607wl.Xd() ^ 30461);
            short sXd2 = (short) (C1607wl.Xd() ^ 12147);
            int[] iArr2 = new int["\u0012\u001e\u0013 \u001c\u0015\u000fW\u001e\u001c\u0010\u0012Rd\u0017\u0016\u0013\t\u0001\u0013\u0011\u0001m~\r".length()];
            QB qb = new QB("\u0012\u001e\u0013 \u001c\u0015\u000fW\u001e\u001c\u0010\u0012Rd\u0017\u0016\u0013\t\u0001\u0013\u0011\u0001m~\r");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i4] = xuXd.fK(((sXd + i4) + xuXd.CK(iKK)) - sXd2);
                i4++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i4));
            clsArr[1] = int[].class;
            clsArr[2] = Integer.TYPE;
            clsArr[3] = Integer.TYPE;
            Object[] objArr2 = {attributeSet, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
            Method method2 = cls.getMethod(hg.Vd("N@Q=DH,LPB:8\u0014FEB80B@0=", (short) (C1499aX.Xd() ^ (-27123)), (short) (C1499aX.Xd() ^ (-9354))), clsArr);
            try {
                method2.setAccessible(true);
                TypedArray typedArray = (TypedArray) method2.invoke(context, objArr2);
                this.mDropDownHorizontalOffset = typedArray.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
                int dimensionPixelOffset = typedArray.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
                this.mDropDownVerticalOffset = dimensionPixelOffset;
                if (dimensionPixelOffset != 0) {
                    this.mDropDownVerticalOffsetSet = true;
                }
                typedArray.recycle();
                AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i2, i3);
                this.mPopup = appCompatPopupWindow;
                appCompatPopupWindow.setInputMethodMode(1);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void setAdapter(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.mObserver;
        if (dataSetObserver == null) {
            this.mObserver = new PopupDataSetObserver();
        } else {
            ListAdapter listAdapter2 = this.mAdapter;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.mAdapter = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.mObserver);
        }
        DropDownListView dropDownListView = this.mDropDownList;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.mAdapter);
        }
    }

    public void setPromptPosition(int i2) {
        this.mPromptPosition = i2;
    }

    public int getPromptPosition() {
        return this.mPromptPosition;
    }

    public void setModal(boolean z2) {
        this.mModal = z2;
        this.mPopup.setFocusable(z2);
    }

    public boolean isModal() {
        return this.mModal;
    }

    public void setForceIgnoreOutsideTouch(boolean z2) {
        this.mForceIgnoreOutsideTouch = z2;
    }

    public void setDropDownAlwaysVisible(boolean z2) {
        this.mDropDownAlwaysVisible = z2;
    }

    public boolean isDropDownAlwaysVisible() {
        return this.mDropDownAlwaysVisible;
    }

    public void setSoftInputMode(int i2) {
        this.mPopup.setSoftInputMode(i2);
    }

    public int getSoftInputMode() {
        return this.mPopup.getSoftInputMode();
    }

    public void setListSelector(Drawable drawable) {
        this.mDropDownListHighlight = drawable;
    }

    public Drawable getBackground() {
        return this.mPopup.getBackground();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.mPopup.setBackgroundDrawable(drawable);
    }

    public void setAnimationStyle(int i2) {
        this.mPopup.setAnimationStyle(i2);
    }

    public int getAnimationStyle() {
        return this.mPopup.getAnimationStyle();
    }

    public View getAnchorView() {
        return this.mDropDownAnchorView;
    }

    public void setAnchorView(View view) {
        this.mDropDownAnchorView = view;
    }

    public int getHorizontalOffset() {
        return this.mDropDownHorizontalOffset;
    }

    public void setHorizontalOffset(int i2) {
        this.mDropDownHorizontalOffset = i2;
    }

    public int getVerticalOffset() {
        if (this.mDropDownVerticalOffsetSet) {
            return this.mDropDownVerticalOffset;
        }
        return 0;
    }

    public void setVerticalOffset(int i2) {
        this.mDropDownVerticalOffset = i2;
        this.mDropDownVerticalOffsetSet = true;
    }

    public void setEpicenterBounds(Rect rect) {
        this.mEpicenterBounds = rect != null ? new Rect(rect) : null;
    }

    public Rect getEpicenterBounds() {
        if (this.mEpicenterBounds != null) {
            return new Rect(this.mEpicenterBounds);
        }
        return null;
    }

    public void setDropDownGravity(int i2) {
        this.mDropDownGravity = i2;
    }

    public int getWidth() {
        return this.mDropDownWidth;
    }

    public void setWidth(int i2) {
        this.mDropDownWidth = i2;
    }

    public void setContentWidth(int i2) {
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            this.mDropDownWidth = this.mTempRect.left + this.mTempRect.right + i2;
        } else {
            setWidth(i2);
        }
    }

    public int getHeight() {
        return this.mDropDownHeight;
    }

    public void setHeight(int i2) {
        if (i2 < 0 && -2 != i2 && -1 != i2) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.mDropDownHeight = i2;
    }

    public void setWindowLayoutType(int i2) {
        this.mDropDownWindowLayoutType = i2;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mItemClickListener = onItemClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.mItemSelectedListener = onItemSelectedListener;
    }

    public void setPromptView(View view) {
        boolean zIsShowing = isShowing();
        if (zIsShowing) {
            removePromptView();
        }
        this.mPromptView = view;
        if (zIsShowing) {
            show();
        }
    }

    public void postShow() throws Throwable {
        Handler handler = this.mHandler;
        Object[] objArr = {this.mShowDropDownRunnable};
        Method method = Class.forName(C1626yg.Ud(";j%\u0001$m<\u001cN\u0018\u0019 r'<.0]", (short) (C1607wl.Xd() ^ 436), (short) (C1607wl.Xd() ^ 16936))).getMethod(EO.Od("W\t~\\", (short) (C1499aX.Xd() ^ (-21623))), Class.forName(Ig.wd("Q\u001eAD\nzc9\u0007Y\u007fE\u000f\u0015\u007f#wf", (short) (C1580rY.Xd() ^ (-31125)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        int iBuildDropDown = buildDropDown();
        boolean zIsInputMethodNotNeeded = isInputMethodNotNeeded();
        PopupWindowCompat.setWindowLayoutType(this.mPopup, this.mDropDownWindowLayoutType);
        if (this.mPopup.isShowing()) {
            if (getAnchorView().isAttachedToWindow()) {
                int width = this.mDropDownWidth;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = getAnchorView().getWidth();
                }
                int i2 = this.mDropDownHeight;
                if (i2 == -1) {
                    if (!zIsInputMethodNotNeeded) {
                        iBuildDropDown = -1;
                    }
                    if (zIsInputMethodNotNeeded) {
                        this.mPopup.setWidth(this.mDropDownWidth == -1 ? -1 : 0);
                        this.mPopup.setHeight(0);
                    } else {
                        this.mPopup.setWidth(this.mDropDownWidth == -1 ? -1 : 0);
                        this.mPopup.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    iBuildDropDown = i2;
                }
                this.mPopup.setOutsideTouchable((this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) ? false : true);
                PopupWindow popupWindow = this.mPopup;
                View anchorView = getAnchorView();
                int i3 = this.mDropDownHorizontalOffset;
                int i4 = this.mDropDownVerticalOffset;
                if (width < 0) {
                    width = -1;
                }
                popupWindow.update(anchorView, i3, i4, width, iBuildDropDown >= 0 ? iBuildDropDown : -1);
                return;
            }
            return;
        }
        int width2 = this.mDropDownWidth;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = getAnchorView().getWidth();
        }
        int i5 = this.mDropDownHeight;
        if (i5 == -1) {
            iBuildDropDown = -1;
        } else if (i5 != -2) {
            iBuildDropDown = i5;
        }
        this.mPopup.setWidth(width2);
        this.mPopup.setHeight(iBuildDropDown);
        setPopupClipToScreenEnabled(true);
        this.mPopup.setOutsideTouchable((this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) ? false : true);
        this.mPopup.setTouchInterceptor(this.mTouchInterceptor);
        if (this.mOverlapAnchorSet) {
            PopupWindowCompat.setOverlapAnchor(this.mPopup, this.mOverlapAnchor);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = sSetEpicenterBoundsMethod;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, this.mEpicenterBounds);
                } catch (Exception e2) {
                    C1561oA.Qd("\u001f;DD\u001f==A;!26+5<", (short) (C1607wl.Xd() ^ 21540));
                    C1593ug.zd("\u0001.5-&b24:f17@:72mB5E\u0017C=8;EL>L\u001dKRLCS\u0001QQ\u00045UW]YATZQ]f", (short) (C1607wl.Xd() ^ 24812), (short) (C1607wl.Xd() ^ 8028));
                }
            }
        } else {
            Api29Impl.setEpicenterBounds(this.mPopup, this.mEpicenterBounds);
        }
        PopupWindowCompat.showAsDropDown(this.mPopup, getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, this.mDropDownGravity);
        this.mDropDownList.setSelection(-1);
        if (!this.mModal || this.mDropDownList.isInTouchMode()) {
            clearListSelection();
        }
        if (!this.mModal) {
            Handler handler = this.mHandler;
            Object[] objArr = {this.mHideSelector};
            Method method2 = Class.forName(C1561oA.od("\u0010\u001c\u0011\u001e\u001a\u0013\rU\u0016\u0019Rk\u0004\u0010\u0005\f\u0004\u0010", (short) (C1580rY.Xd() ^ (-8223)))).getMethod(Wg.Zd("8\u000faq", (short) (C1607wl.Xd() ^ 462), (short) (C1607wl.Xd() ^ 26073)), Class.forName(C1561oA.Kd("XPfR _Uc]%Jnhi]_jd", (short) (C1499aX.Xd() ^ (-23661)))));
            try {
                method2.setAccessible(true);
                method2.invoke(handler, objArr);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        this.mPopup.dismiss();
        removePromptView();
        this.mPopup.setContentView(null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks(this.mResizePopupRunnable);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mPopup.setOnDismissListener(onDismissListener);
    }

    private void removePromptView() {
        View view = this.mPromptView;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mPromptView);
            }
        }
    }

    public void setInputMethodMode(int i2) {
        this.mPopup.setInputMethodMode(i2);
    }

    public int getInputMethodMode() {
        return this.mPopup.getInputMethodMode();
    }

    public void setSelection(int i2) {
        DropDownListView dropDownListView = this.mDropDownList;
        if (!isShowing() || dropDownListView == null) {
            return;
        }
        dropDownListView.setListSelectionHidden(false);
        dropDownListView.setSelection(i2);
        if (dropDownListView.getChoiceMode() != 0) {
            dropDownListView.setItemChecked(i2, true);
        }
    }

    public void clearListSelection() {
        DropDownListView dropDownListView = this.mDropDownList;
        if (dropDownListView != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        return this.mPopup.isShowing();
    }

    public boolean isInputMethodNotNeeded() {
        return this.mPopup.getInputMethodMode() == 2;
    }

    public boolean performItemClick(int i2) {
        if (!isShowing()) {
            return false;
        }
        if (this.mItemClickListener == null) {
            return true;
        }
        DropDownListView dropDownListView = this.mDropDownList;
        this.mItemClickListener.onItemClick(dropDownListView, dropDownListView.getChildAt(i2 - dropDownListView.getFirstVisiblePosition()), i2, dropDownListView.getAdapter().getItemId(i2));
        return true;
    }

    public Object getSelectedItem() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItem();
        }
        return null;
    }

    public int getSelectedItemPosition() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItemPosition();
        }
        return -1;
    }

    public long getSelectedItemId() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public View getSelectedView() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedView();
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView getListView() {
        return this.mDropDownList;
    }

    DropDownListView createDropDownListView(Context context, boolean z2) {
        return new DropDownListView(context, z2);
    }

    void setListItemExpandMax(int i2) {
        this.mListItemExpandMaximum = i2;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        int iLookForSelectablePosition;
        int iLookForSelectablePosition2;
        if (isShowing() && i2 != 62 && (this.mDropDownList.getSelectedItemPosition() >= 0 || !isConfirmKey(i2))) {
            int selectedItemPosition = this.mDropDownList.getSelectedItemPosition();
            boolean zIsAboveAnchor = this.mPopup.isAboveAnchor();
            ListAdapter listAdapter = this.mAdapter;
            if (listAdapter != null) {
                boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
                iLookForSelectablePosition = zAreAllItemsEnabled ? 0 : this.mDropDownList.lookForSelectablePosition(0, true);
                if (zAreAllItemsEnabled) {
                    iLookForSelectablePosition2 = listAdapter.getCount() - 1;
                } else {
                    iLookForSelectablePosition2 = this.mDropDownList.lookForSelectablePosition(listAdapter.getCount() - 1, false);
                }
            } else {
                iLookForSelectablePosition = Integer.MAX_VALUE;
                iLookForSelectablePosition2 = Integer.MIN_VALUE;
            }
            if ((!zIsAboveAnchor && i2 == 19 && selectedItemPosition <= iLookForSelectablePosition) || (zIsAboveAnchor && i2 == 20 && selectedItemPosition >= iLookForSelectablePosition2)) {
                clearListSelection();
                this.mPopup.setInputMethodMode(1);
                show();
                return true;
            }
            this.mDropDownList.setListSelectionHidden(false);
            if (this.mDropDownList.onKeyDown(i2, keyEvent)) {
                this.mPopup.setInputMethodMode(2);
                this.mDropDownList.requestFocusFromTouch();
                show();
                if (i2 == 19 || i2 == 20 || i2 == 23 || i2 == 66) {
                    return true;
                }
            } else if (zIsAboveAnchor || i2 != 20) {
                if (zIsAboveAnchor && i2 == 19 && selectedItemPosition == iLookForSelectablePosition) {
                    return true;
                }
            } else if (selectedItemPosition == iLookForSelectablePosition2) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (!isShowing() || this.mDropDownList.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.mDropDownList.onKeyUp(i2, keyEvent);
        if (zOnKeyUp && isConfirmKey(i2)) {
            dismiss();
        }
        return zOnKeyUp;
    }

    public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !isShowing()) {
            return false;
        }
        View view = this.mDropDownAnchorView;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    public View.OnTouchListener createDragToOpenListener(View view) {
        return new ForwardingListener(view) { // from class: androidx.appcompat.widget.ListPopupWindow.1
            @Override // androidx.appcompat.widget.ForwardingListener
            public ListPopupWindow getPopup() {
                return ListPopupWindow.this;
            }
        };
    }

    private int buildDropDown() throws Throwable {
        int measuredHeight;
        int i2;
        int iMakeMeasureSpec;
        View view;
        int i3;
        if (this.mDropDownList == null) {
            Context context = this.mContext;
            this.mShowDropDownRunnable = new Runnable() { // from class: androidx.appcompat.widget.ListPopupWindow.2
                @Override // java.lang.Runnable
                public void run() {
                    View anchorView = ListPopupWindow.this.getAnchorView();
                    if (anchorView == null || anchorView.getWindowToken() == null) {
                        return;
                    }
                    ListPopupWindow.this.show();
                }
            };
            DropDownListView dropDownListViewCreateDropDownListView = createDropDownListView(context, !this.mModal);
            this.mDropDownList = dropDownListViewCreateDropDownListView;
            Drawable drawable = this.mDropDownListHighlight;
            if (drawable != null) {
                dropDownListViewCreateDropDownListView.setSelector(drawable);
            }
            this.mDropDownList.setAdapter(this.mAdapter);
            this.mDropDownList.setOnItemClickListener(this.mItemClickListener);
            this.mDropDownList.setFocusable(true);
            this.mDropDownList.setFocusableInTouchMode(true);
            this.mDropDownList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view2, int i4, long j2) {
                    Callback.onItemSelected_enter(view2, i4);
                    if (i4 != -1) {
                        try {
                            DropDownListView dropDownListView = ListPopupWindow.this.mDropDownList;
                            if (dropDownListView != null) {
                                dropDownListView.setListSelectionHidden(false);
                            }
                        } finally {
                            Callback.onItemSelected_exit();
                        }
                    }
                }
            });
            this.mDropDownList.setOnScrollListener(this.mScrollListener);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.mItemSelectedListener;
            if (onItemSelectedListener != null) {
                this.mDropDownList.setOnItemSelectedListener(onItemSelectedListener);
            }
            DropDownListView dropDownListView = this.mDropDownList;
            View view2 = this.mPromptView;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.mPromptPosition;
                if (i4 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(dropDownListView, layoutParams);
                } else if (i4 != 1) {
                    String str = C1561oA.ud("Tx\u007fisoi$kkot\u001fnlodnbge\u0016", (short) (C1633zX.Xd() ^ (-28245))) + this.mPromptPosition;
                    C1561oA.yd("\u00151::\u001d;;?A'8<9CJ", (short) (C1633zX.Xd() ^ (-30360)));
                } else {
                    linearLayout.addView(dropDownListView, layoutParams);
                    linearLayout.addView(view2);
                }
                int i5 = this.mDropDownWidth;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = dropDownListView;
            }
            this.mPopup.setContentView(view);
        } else {
            View view3 = this.mPromptView;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            i2 = this.mTempRect.top + this.mTempRect.bottom;
            if (!this.mDropDownVerticalOffsetSet) {
                this.mDropDownVerticalOffset = -this.mTempRect.top;
            }
        } else {
            this.mTempRect.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = getMaxAvailableHeight(getAnchorView(), this.mDropDownVerticalOffset, this.mPopup.getInputMethodMode() == 2);
        if (!this.mDropDownAlwaysVisible && this.mDropDownHeight != -1) {
            int i6 = this.mDropDownWidth;
            if (i6 == -2) {
                Context context2 = this.mContext;
                Object[] objArr = new Object[0];
                Method method = Class.forName(Jg.Wd("/@rs-+_%l69yi%'&U}.0es,", (short) (FB.Xd() ^ 12962), (short) (FB.Xd() ^ 25601))).getMethod(ZO.xd("C \u0007R$x'\nV\u007fGJ", (short) (C1607wl.Xd() ^ 4364), (short) (C1607wl.Xd() ^ 6318)), new Class[0]);
                try {
                    method.setAccessible(true);
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((Resources) method.invoke(context2, objArr)).getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), Integer.MIN_VALUE);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else if (i6 == -1) {
                Context context3 = this.mContext;
                Class<?> cls = Class.forName(C1561oA.Yd("n|s\u0003\u0001{wBx\u0006\u0006\r~\t\u0010J`\u000e\u000e\u0015\u0007\u001b\u0018", (short) (C1499aX.Xd() ^ (-3989))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (FB.Xd() ^ 10370);
                short sXd2 = (short) (FB.Xd() ^ 25545);
                int[] iArr = new int["\u0015\u0014$\u0003\u0017&#*(\u001a\u001d,".length()];
                QB qb = new QB("\u0015\u0014$\u0003\u0017&#*(\u001a\u001d,");
                int i7 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i7] = xuXd.fK((xuXd.CK(iKK) - (sXd + i7)) + sXd2);
                    i7++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i7), clsArr);
                try {
                    method2.setAccessible(true);
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((Resources) method2.invoke(context3, objArr2)).getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), 1073741824);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            }
            int iMeasureHeightOfChildrenCompat = this.mDropDownList.measureHeightOfChildrenCompat(iMakeMeasureSpec, 0, -1, maxAvailableHeight - measuredHeight, -1);
            if (iMeasureHeightOfChildrenCompat > 0) {
                measuredHeight += i2 + this.mDropDownList.getPaddingTop() + this.mDropDownList.getPaddingBottom();
            }
            return iMeasureHeightOfChildrenCompat + measuredHeight;
        }
        return maxAvailableHeight + i2;
    }

    public void setOverlapAnchor(boolean z2) {
        this.mOverlapAnchorSet = true;
        this.mOverlapAnchor = z2;
    }

    private class PopupDataSetObserver extends DataSetObserver {
        PopupDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.isShowing()) {
                ListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    private class ListSelectorHider implements Runnable {
        ListSelectorHider() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.clearListSelection();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    private class ResizePopupRunnable implements Runnable {
        ResizePopupRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ListPopupWindow.this.mDropDownList == null || !ListPopupWindow.this.mDropDownList.isAttachedToWindow() || ListPopupWindow.this.mDropDownList.getCount() <= ListPopupWindow.this.mDropDownList.getChildCount() || ListPopupWindow.this.mDropDownList.getChildCount() > ListPopupWindow.this.mListItemExpandMaximum) {
                return;
            }
            ListPopupWindow.this.mPopup.setInputMethodMode(2);
            ListPopupWindow.this.show();
        }
    }

    private class PopupTouchInterceptor implements View.OnTouchListener {
        PopupTouchInterceptor() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) throws Throwable {
            int action = motionEvent.getAction();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (action != 0 || ListPopupWindow.this.mPopup == null || !ListPopupWindow.this.mPopup.isShowing() || x2 < 0 || x2 >= ListPopupWindow.this.mPopup.getWidth() || y2 < 0 || y2 >= ListPopupWindow.this.mPopup.getHeight()) {
                if (action != 1) {
                    return false;
                }
                ListPopupWindow.this.mHandler.removeCallbacks(ListPopupWindow.this.mResizePopupRunnable);
                return false;
            }
            Handler handler = ListPopupWindow.this.mHandler;
            Object[] objArr = {ListPopupWindow.this.mResizePopupRunnable, 250L};
            Method method = Class.forName(C1561oA.Qd("\u0004\u0010\u0005\u0012\u000e\u0007\u0001I\n\rF_w\u0004x\u007fw\u0004", (short) (C1580rY.Xd() ^ (-15266)))).getMethod(C1561oA.od("\u0004\u0002\u0005\u0005Ssym\u0005om", (short) (OY.Xd() ^ 23652)), Class.forName(C1593ug.zd("A9O;\tH>LF\u000e3WQRFHSM", (short) (Od.Xd() ^ (-32399)), (short) (Od.Xd() ^ (-15486)))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
                return false;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private class PopupScrollListener implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        PopupScrollListener() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || ListPopupWindow.this.isInputMethodNotNeeded() || ListPopupWindow.this.mPopup.getContentView() == null) {
                return;
            }
            ListPopupWindow.this.mHandler.removeCallbacks(ListPopupWindow.this.mResizePopupRunnable);
            ListPopupWindow.this.mResizePopupRunnable.run();
        }
    }

    private void setPopupClipToScreenEnabled(boolean z2) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = sSetClipToWindowEnabledMethod;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, Boolean.valueOf(z2));
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        Api29Impl.setIsClippedToScreen(this.mPopup, z2);
    }

    private int getMaxAvailableHeight(View view, int i2, boolean z2) {
        return Api24Impl.getMaxAvailableHeight(this.mPopup, view, i2, z2);
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void setEpicenterBounds(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void setIsClippedToScreen(PopupWindow popupWindow, boolean z2) {
            popupWindow.setIsClippedToScreen(z2);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static int getMaxAvailableHeight(PopupWindow popupWindow, View view, int i2, boolean z2) {
            return popupWindow.getMaxAvailableHeight(view, i2, z2);
        }
    }
}
