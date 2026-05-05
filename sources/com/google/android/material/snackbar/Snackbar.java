package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR = {R.attr.snackbarButtonStyle};
    private static final int[] SNACKBAR_CONTENT_STYLE_ATTRS = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    private final AccessibilityManager accessibilityManager;
    private BaseTransientBottomBar.BaseCallback<Snackbar> callback;
    private boolean hasAction;

    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onDismissed(Snackbar snackbar, int i2) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onShown(Snackbar snackbar) {
        }
    }

    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) throws Throwable {
        super(context, viewGroup, view, contentViewCallback);
        Context context2 = viewGroup.getContext();
        String strXd = ZO.xd("dG4\u0018Upj#\u001e[RWM", (short) (C1580rY.Xd() ^ (-16052)), (short) (C1580rY.Xd() ^ (-16527)));
        short sXd = (short) (FB.Xd() ^ 3244);
        short sXd2 = (short) (FB.Xd() ^ 14315);
        int[] iArr = new int["\u0012aa\u000b\u0015T\u0010|Y[\u0016i\u0002\u001b0\u0005vN}$Ijj".length()];
        QB qb = new QB("\u0012aa\u000b\u0015T\u0010|Y[\u0016i\u0002\u001b0\u0005vN}$Ijj");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {strXd};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("m\u001c\u000fS;j}0[3=.aXpZ", (short) (FB.Xd() ^ 21940)), Class.forName(Ig.wd("d\f\u000fYuw\u0011={\u000e58\btD]", (short) (C1499aX.Xd() ^ (-25826)))));
        try {
            method.setAccessible(true);
            this.accessibilityManager = (AccessibilityManager) method.invoke(context2, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static ViewGroup findSuitableParent(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button getActionView() {
        return getContentLayout().getActionView();
    }

    private SnackbarContentLayout getContentLayout() {
        return (SnackbarContentLayout) this.view.getChildAt(0);
    }

    private TextView getMessageView() {
        return getContentLayout().getMessageView();
    }

    @Deprecated
    protected static boolean hasSnackbarButtonStyleAttr(Context context) throws Throwable {
        int[] iArr = SNACKBAR_BUTTON_STYLE_ATTR;
        short sXd = (short) (ZN.Xd() ^ 10161);
        int[] iArr2 = new int["\u0006\u0012\u0007\u0014\u0010\t\u0003K\u007f\u000b\t\u000e}\u0006\u000bCW\u0003\u0001\u0006u\b\u0003".length()];
        QB qb = new QB("\u0006\u0012\u0007\u0014\u0010\t\u0003K\u007f\u000b\t\u000e}\u0006\u000bCW\u0003\u0001\u0006u\b\u0003");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {iArr};
        Method method = Class.forName(new String(iArr2, 0, i2)).getMethod(C1593ug.zd("%\u0019,\u001a#)\u000f17+%%\u0003787/)==/>", (short) (C1633zX.Xd() ^ (-4682)), (short) (C1633zX.Xd() ^ (-76))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int resourceId = typedArray.getResourceId(0, -1);
            typedArray.recycle();
            return resourceId != -1;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static boolean hasSnackbarContentStyleAttrs(Context context) throws Throwable {
        Object[] objArr = {SNACKBAR_CONTENT_STYLE_ATTRS};
        Method method = Class.forName(C1561oA.od("\b\u0014\t\u0016\u0012\u000b\u0005M\u0002\r\u000b\u0010\u007f\b\rEY\u0005\u0003\bw\n\u0005", (short) (C1607wl.Xd() ^ 3316))).getMethod(C1561oA.Kd("\u0012\u0006\u0019\u0007\u0010\u0016{\u001e$\u0018\u0012\u0012o$%$\u001c\u0016**\u001c+", (short) (C1607wl.Xd() ^ 3083)), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int resourceId = typedArray.getResourceId(0, -1);
            int resourceId2 = typedArray.getResourceId(1, -1);
            typedArray.recycle();
            return (resourceId == -1 || resourceId2 == -1) ? false : true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$setAction$-Ljava-lang-CharSequence-Landroid-view-View$OnClickListener--Lcom-google-android-material-snackbar-Snackbar-, reason: not valid java name */
    public static /* synthetic */ void m7651x7644152b(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        com.dynatrace.android.callback.Callback.onClick_enter(view);
        try {
            snackbar.lambda$setAction$0(onClickListener, view);
        } finally {
            com.dynatrace.android.callback.Callback.onClick_exit();
        }
    }

    private /* synthetic */ void lambda$setAction$0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        dispatchDismiss(1);
    }

    public static Snackbar make(Context context, View view, CharSequence charSequence, int i2) {
        return makeInternal(context, view, charSequence, i2);
    }

    public static Snackbar make(View view, int i2, int i3) {
        return make(view, view.getResources().getText(i2), i3);
    }

    public static Snackbar make(View view, CharSequence charSequence, int i2) {
        return makeInternal(null, view, charSequence, i2);
    }

    private static Snackbar makeInternal(Context context, View view, CharSequence charSequence, int i2) {
        ViewGroup viewGroupFindSuitableParent = findSuitableParent(view);
        if (viewGroupFindSuitableParent == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupFindSuitableParent.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(hasSnackbarContentStyleAttrs(context) ? R.layout.mtrl_layout_snackbar_include : R.layout.design_layout_snackbar_include, viewGroupFindSuitableParent, false);
        Snackbar snackbar = new Snackbar(context, viewGroupFindSuitableParent, snackbarContentLayout, snackbarContentLayout);
        snackbar.setText(charSequence);
        snackbar.setDuration(i2);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() throws Throwable {
        int duration = super.getDuration();
        if (duration == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = this.hasAction ? 4 : 0;
            AccessibilityManager accessibilityManager = this.accessibilityManager;
            Class<?> cls = Class.forName(Wg.Zd("[\f\u001d\u0007\u001f\\.S7m\u0005.\u007fv\u0014oLyUf;E_w^nvd^i?h\u0004\u0001-\u0010.vT1 \u007f .K\u0015=", (short) (C1633zX.Xd() ^ (-4653)), (short) (C1633zX.Xd() ^ (-29619))));
            Class<?>[] clsArr = {Integer.TYPE, Integer.TYPE};
            Object[] objArr = {Integer.valueOf(duration), Integer.valueOf((-1) - (((-1) - i2) & ((-1) - 3)))};
            Method method = cls.getMethod(C1561oA.Xd("nm}\\po|{|u\u007fvxxi\u007f\u0005}\t\u0010\u0010i\u0007\u000b\f\n\u0015", (short) (ZN.Xd() ^ 7987)), clsArr);
            try {
                method.setAccessible(true);
                return ((Integer) method.invoke(accessibilityManager, objArr)).intValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (!this.hasAction) {
            return duration;
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        Object[] objArr2 = new Object[0];
        Method method2 = Class.forName(Wg.vd("u\u0004z\n\b\u0003~I\u0003vs\u0007>ruv\n\u0019\u001a\u0011\u000b\u0013\u0017\u0015\u0011\u0017L`\u0004\u0005\b\u0017(\u001f\u0019!%#/5y\u000f\u001d\u0011\u0018\u0017%", (short) (C1499aX.Xd() ^ (-32037)))).getMethod(Qg.kd("foOin[_;md_acQcW\\Z0XJJSKI", (short) (ZN.Xd() ^ 30786), (short) (ZN.Xd() ^ 14916)), new Class[0]);
        try {
            method2.setAccessible(true);
            if (((Boolean) method2.invoke(accessibilityManager2, objArr2)).booleanValue()) {
                return -2;
            }
            return duration;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
        return super.isShown();
    }

    public Snackbar setAction(int i2, View.OnClickListener onClickListener) throws Throwable {
        Context context = getContext();
        Class<?> cls = Class.forName(hg.Vd("t\u0001u\u0003~wq:nyw|lty2Fqotdvq", (short) (OY.Xd() ^ 7811), (short) (OY.Xd() ^ 16269)));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method method = cls.getMethod(C1561oA.ud("\u0002~\rk{\u000e\t", (short) (C1580rY.Xd() ^ (-12018))), clsArr);
        try {
            method.setAccessible(true);
            return setAction((CharSequence) method.invoke(context, objArr), onClickListener);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public Snackbar setAction(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button actionView = getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.hasAction = false;
        } else {
            this.hasAction = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.Snackbar$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Snackbar.m7651x7644152b(this.f$0, onClickListener, view);
                }
            });
        }
        return this;
    }

    public Snackbar setActionTextColor(int i2) {
        getActionView().setTextColor(i2);
        return this;
    }

    public Snackbar setActionTextColor(ColorStateList colorStateList) {
        getActionView().setTextColor(colorStateList);
        return this;
    }

    public Snackbar setBackgroundTint(int i2) {
        return setBackgroundTintList(ColorStateList.valueOf(i2));
    }

    public Snackbar setBackgroundTintList(ColorStateList colorStateList) {
        this.view.setBackgroundTintList(colorStateList);
        return this;
    }

    public Snackbar setBackgroundTintMode(PorterDuff.Mode mode) {
        this.view.setBackgroundTintMode(mode);
        return this;
    }

    @Deprecated
    public Snackbar setCallback(Callback callback) {
        BaseTransientBottomBar.BaseCallback<Snackbar> baseCallback = this.callback;
        if (baseCallback != null) {
            removeCallback(baseCallback);
        }
        if (callback != null) {
            addCallback(callback);
        }
        this.callback = callback;
        return this;
    }

    public Snackbar setMaxInlineActionWidth(int i2) {
        getContentLayout().setMaxInlineActionWidth(i2);
        return this;
    }

    public Snackbar setText(int i2) throws Throwable {
        Context context = getContext();
        short sXd = (short) (C1633zX.Xd() ^ (-214));
        int[] iArr = new int["\u000e\u001a\u0013  \u0019\u0017_\u0018#%*\u001e&/g\u007f+-2&87".length()];
        QB qb = new QB("\u000e\u001a\u0013  \u0019\u0017_\u0018#%*\u001e&/g\u007f+-2&87");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        short sXd2 = (short) (C1580rY.Xd() ^ (-32235));
        int[] iArr2 = new int["DCS4FZW".length()];
        QB qb2 = new QB("DCS4FZW");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i4));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            return setText((CharSequence) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public Snackbar setText(CharSequence charSequence) {
        getMessageView().setText(charSequence);
        return this;
    }

    public Snackbar setTextColor(int i2) {
        getMessageView().setTextColor(i2);
        return this;
    }

    public Snackbar setTextColor(ColorStateList colorStateList) {
        getMessageView().setTextColor(colorStateList);
        return this;
    }

    public Snackbar setTextMaxLines(int i2) {
        getMessageView().setMaxLines(i2);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
        super.show();
    }
}
