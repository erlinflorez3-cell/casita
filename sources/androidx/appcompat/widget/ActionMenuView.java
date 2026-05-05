package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1593ug;
import yg.C1607wl;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        setBaselineAligned(false);
        short sXd = (short) (ZN.Xd() ^ 2356);
        int[] iArr = new int["DPERNGA\n>IGL<DI\u0002\u0016A?D4FA".length()];
        QB qb = new QB("DPERNGA\n>IGL<DI\u0002\u0016A?D4FA");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("}|\rk\u007f\u000f\f\u0013\u0011\u0003\u0006\u0015", (short) (C1607wl.Xd() ^ 25493), (short) (C1607wl.Xd() ^ 21901)), new Class[0]);
        try {
            method.setAccessible(true);
            float f2 = ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density;
            this.mMinCellSize = (int) (56.0f * f2);
            this.mGeneratedItemPadding = (int) (f2 * 4.0f);
            this.mPopupContext = context;
            this.mPopupTheme = 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setPopupTheme(int i2) {
        if (this.mPopupTheme != i2) {
            this.mPopupTheme = i2;
            if (i2 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        actionMenuPresenter.setMenuView(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i2, int i3) {
        MenuBuilder menuBuilder;
        boolean z2 = this.mFormatItems;
        boolean z3 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.mFormatItems = z3;
        if (z2 != z3) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.mFormatItems && (menuBuilder = this.mMenu) != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.mFormatItems || childCount <= 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        onMeasureExactFormat(i2, i3);
    }

    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v83 */
    private void onMeasureExactFormat(int i2, int i3) {
        int i4;
        ?? r02;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i3, paddingTop, -2);
        int i5 = size - paddingLeft;
        int i6 = this.mMinCellSize;
        int i7 = i5 / i6;
        int i8 = i5 % i6;
        int iMax = 0;
        if (i7 == 0) {
            setMeasuredDimension(i5, 0);
            return;
        }
        int i9 = i6 + (i8 / i7);
        int childCount = getChildCount();
        boolean z2 = false;
        int i10 = 0;
        int iMax2 = 0;
        int i11 = 0;
        long j2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                boolean z3 = childAt instanceof ActionMenuItemView;
                i10++;
                if (z3) {
                    int i13 = this.mGeneratedItemPadding;
                    r02 = 0;
                    childAt.setPadding(i13, 0, i13, 0);
                } else {
                    r02 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = r02;
                layoutParams.extraPixels = r02;
                layoutParams.cellsUsed = r02;
                layoutParams.expandable = r02;
                layoutParams.leftMargin = r02;
                layoutParams.rightMargin = r02;
                layoutParams.preventEdgeOffset = z3 && ((ActionMenuItemView) childAt).hasText();
                int iMeasureChildForCells = measureChildForCells(childAt, i9, layoutParams.isOverflowButton ? 1 : i7, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iMeasureChildForCells);
                if (layoutParams.expandable) {
                    i11++;
                }
                if (layoutParams.isOverflowButton) {
                    z2 = true;
                }
                i7 -= iMeasureChildForCells;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iMeasureChildForCells == 1) {
                    long j3 = 1 << i12;
                    j2 = (j2 + j3) - (j2 & j3);
                }
            }
        }
        boolean z4 = z2 && i10 == 2;
        boolean z5 = false;
        while (i11 > 0 && i7 > 0) {
            int i14 = Integer.MAX_VALUE;
            int i15 = 0;
            long j4 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i16).getLayoutParams();
                if (layoutParams2.expandable) {
                    if (layoutParams2.cellsUsed < i14) {
                        i14 = layoutParams2.cellsUsed;
                        j4 = 1 << i16;
                        i15 = 1;
                    } else if (layoutParams2.cellsUsed == i14) {
                        j4 |= 1 << i16;
                        i15++;
                    }
                }
            }
            j2 = (-1) - (((-1) - j2) & ((-1) - j4));
            if (i15 > i7) {
                break;
            }
            int i17 = i14 + 1;
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt2 = getChildAt(i18);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                long j5 = 1 << i18;
                if ((j4 & j5) != 0) {
                    if (z4 && layoutParams3.preventEdgeOffset && i7 == 1) {
                        int i19 = this.mGeneratedItemPadding;
                        childAt2.setPadding(i19 + i9, 0, i19, 0);
                    }
                    layoutParams3.cellsUsed++;
                    layoutParams3.expanded = true;
                    i7--;
                } else if (layoutParams3.cellsUsed == i17) {
                    j2 = (j2 + j5) - (j2 & j5);
                }
            }
            z5 = true;
        }
        boolean z6 = !z2 && i10 == 1;
        if (i7 <= 0 || j2 == 0 || (i7 >= i10 - 1 && !z6 && iMax2 <= 1)) {
            i4 = 0;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (z6) {
                i4 = 0;
            } else {
                i4 = 0;
                if ((j2 + 1) - (j2 | 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                    fBitCount -= 0.5f;
                }
                int i20 = childCount - 1;
                long j6 = 1 << i20;
                if ((j2 + j6) - (j2 | j6) != 0 && !((LayoutParams) getChildAt(i20).getLayoutParams()).preventEdgeOffset) {
                    fBitCount -= 0.5f;
                }
            }
            int i21 = fBitCount > 0.0f ? (int) ((i7 * i9) / fBitCount) : i4;
            for (int i22 = i4; i22 < childCount; i22++) {
                long j7 = 1 << i22;
                if ((j2 + j7) - (j2 | j7) != 0) {
                    View childAt3 = getChildAt(i22);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.extraPixels = i21;
                        layoutParams4.expanded = true;
                        if (i22 == 0 && !layoutParams4.preventEdgeOffset) {
                            layoutParams4.leftMargin = (-i21) / 2;
                        }
                        z5 = true;
                    } else if (layoutParams4.isOverflowButton) {
                        layoutParams4.extraPixels = i21;
                        z5 = true;
                        layoutParams4.expanded = true;
                        layoutParams4.rightMargin = (-i21) / 2;
                    } else {
                        if (i22 != 0) {
                            layoutParams4.leftMargin = i21 / 2;
                        }
                        if (i22 != childCount - 1) {
                            layoutParams4.rightMargin = i21 / 2;
                        }
                    }
                }
            }
        }
        if (z5) {
            while (i4 < childCount) {
                View childAt4 = getChildAt(i4);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.cellsUsed * i9) + layoutParams5.extraPixels, 1073741824), childMeasureSpec);
                }
                i4++;
            }
        }
        if (mode == 1073741824) {
            iMax = size2;
        }
        setMeasuredDimension(i5, iMax);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int measureChildForCells(android.view.View r8, int r9, int r10, int r11, int r12) {
        /*
            android.view.ViewGroup$LayoutParams r7 = r8.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r7 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r7
            int r1 = android.view.View.MeasureSpec.getSize(r11)
            int r1 = r1 - r12
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            boolean r0 = r8 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r0 == 0) goto L62
            r0 = r8
            androidx.appcompat.view.menu.ActionMenuItemView r0 = (androidx.appcompat.view.menu.ActionMenuItemView) r0
        L1a:
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L60
            boolean r0 = r0.hasText()
            if (r0 == 0) goto L60
            r3 = r5
        L25:
            if (r10 <= 0) goto L5e
            r2 = 2
            if (r3 == 0) goto L2c
            if (r10 < r2) goto L5e
        L2c:
            int r10 = r10 * r9
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r0)
            r8.measure(r0, r6)
            int r1 = r8.getMeasuredWidth()
            int r0 = r1 / r9
            int r1 = r1 % r9
            if (r1 == 0) goto L41
            int r0 = r0 + 1
        L41:
            if (r3 == 0) goto L5c
            if (r0 >= r2) goto L5c
        L45:
            boolean r0 = r7.isOverflowButton
            if (r0 != 0) goto L5a
            if (r3 == 0) goto L5a
        L4b:
            r7.expandable = r5
            r7.cellsUsed = r2
            int r9 = r9 * r2
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            r8.measure(r0, r6)
            return r2
        L5a:
            r5 = r4
            goto L4b
        L5c:
            r2 = r0
            goto L45
        L5e:
            r2 = r4
            goto L45
        L60:
            r3 = r4
            goto L25
        L62:
            r0 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.measureChildForCells(android.view.View, int, int, int, int):int");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.mFormatItems) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zIsLayoutRtl) {
                        paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    hasSupportDividerBeforeChildAt(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int i15 = 0;
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zIsLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            while (i15 < childCount) {
                View childAt3 = getChildAt(i15);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i16 = width2 - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + layoutParams2.leftMargin) + iMax);
                }
                i15++;
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        while (i15 < childCount) {
            View childAt4 = getChildAt(i15);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i18 = paddingLeft2 + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = i18 + measuredWidth4 + layoutParams3.rightMargin + iMax;
            }
            i15++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.mPresenter.setOverflowIcon(drawable);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.mPresenter.getOverflowIcon();
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    public void setOverflowReserved(boolean z2) {
        this.mReserveOverflow = z2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (layoutParams2.gravity <= 0) {
                layoutParams2.gravity = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.isOverflowButton = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.mMenu = menuBuilder;
            menuBuilder.setCallback(new MenuBuilderCallback());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.mPresenter = actionMenuPresenter;
            actionMenuPresenter.setReserveOverflow(true);
            ActionMenuPresenter actionMenuPresenter2 = this.mPresenter;
            MenuPresenter.Callback actionMenuPresenterCallback = this.mActionMenuPresenterCallback;
            if (actionMenuPresenterCallback == null) {
                actionMenuPresenterCallback = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter2.setCallback(actionMenuPresenterCallback);
            this.mMenu.addMenuPresenter(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return this.mMenu;
    }

    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    public MenuBuilder peekMenu() {
        return this.mMenu;
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.showOverflowMenu();
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.hideOverflowMenu();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowing();
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowPending();
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    protected boolean hasSupportDividerBeforeChildAt(int i2) {
        ?? NeedsDividerAfter = 0;
        NeedsDividerAfter = 0;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            NeedsDividerAfter = ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        if (i2 <= 0 || !(childAt2 instanceof ActionMenuChildView)) {
            return NeedsDividerAfter;
        }
        return (-1) - (((-1) - NeedsDividerAfter) & ((-1) - (((ActionMenuChildView) childAt2).needsDividerBefore() ? 1 : 0))) == 1;
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.mPresenter.setExpandedActionViewsExclusive(z2);
    }

    private class MenuBuilderCallback implements MenuBuilder.Callback {
        MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return ActionMenuView.this.mOnMenuItemClickListener != null && ActionMenuView.this.mOnMenuItemClickListener.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(MenuBuilder menuBuilder) {
            if (ActionMenuView.this.mMenuBuilderCallback != null) {
                ActionMenuView.this.mMenuBuilderCallback.onMenuModeChange(menuBuilder);
            }
        }
    }

    private static class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            return false;
        }

        ActionMenuPresenterCallback() {
        }
    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        @ViewDebug.ExportedProperty
        public int cellsUsed;

        @ViewDebug.ExportedProperty
        public boolean expandable;
        boolean expanded;

        @ViewDebug.ExportedProperty
        public int extraPixels;

        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.isOverflowButton = false;
        }

        LayoutParams(int i2, int i3, boolean z2) {
            super(i2, i3);
            this.isOverflowButton = z2;
        }
    }
}
