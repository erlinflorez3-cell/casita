package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int zaa;
    private int zab;
    private View zac;
    private View.OnClickListener zad;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(Context context) {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        this.zad = null;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("\u0010\u001e\u0015$\"\u001d\u0019c\u001a''. *1k\u0002//6(<9", (short) (ZN.Xd() ^ 19520))).getMethod(Wg.Zd("jix\\pqyu", (short) (ZN.Xd() ^ 8654), (short) (ZN.Xd() ^ 32140)), new Class[0]);
        try {
            method.setAccessible(true);
            TypedArray typedArrayObtainStyledAttributes = ((Resources.Theme) method.invoke(context, objArr)).obtainStyledAttributes(attributeSet, com.google.android.gms.base.R.styleable.SignInButton, 0, 0);
            try {
                this.zaa = typedArrayObtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_buttonSize, 0);
                this.zab = typedArrayObtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_colorScheme, 2);
                typedArrayObtainStyledAttributes.recycle();
                setStyle(this.zaa, this.zab);
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void zaa(Context context) throws Throwable {
        View view = this.zac;
        if (view != null) {
            removeView(view);
        }
        try {
            this.zac = zaz.zaa(context, this.zaa, this.zab);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            C1561oA.Xd("\u0018/.6\u00128\rAAB>>", (short) (OY.Xd() ^ 345));
            Wg.vd("\u0019./5i2:j0BDCA?sAEIw=INJ?\n|URKOK\u0003VQIJOQ[WRRb\u000f[_gg[V\\", (short) (C1580rY.Xd() ^ (-26913)));
            int i2 = this.zaa;
            int i3 = this.zab;
            zaaa zaaaVar = new zaaa(context, null);
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("6B7D@93{0;9>.6;s\b316&83", (short) (Od.Xd() ^ (-19972)), (short) (Od.Xd() ^ (-5864)))).getMethod(hg.Vd("\u001f\u001c*\u0007\u0019&!&\"\u0012\u0013 ", (short) (FB.Xd() ^ 22644), (short) (FB.Xd() ^ 25801)), new Class[0]);
            try {
                method.setAccessible(true);
                zaaaVar.zaa((Resources) method.invoke(context, objArr), i2, i3);
                this.zac = zaaaVar;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        addView(this.zac);
        this.zac.setEnabled(isEnabled());
        this.zac.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Callback.onClick_enter(view);
        try {
            View.OnClickListener onClickListener = this.zad;
            if (onClickListener == null || view != this.zac) {
                return;
            }
            onClickListener.onClick(this);
        } finally {
            Callback.onClick_exit();
        }
    }

    public void setColorScheme(int i2) throws Throwable {
        setStyle(this.zaa, i2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.zac.setEnabled(z2);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.zad = onClickListener;
        View view = this.zac;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) throws Throwable {
        setStyle(this.zaa, this.zab);
    }

    public void setSize(int i2) throws Throwable {
        setStyle(i2, this.zab);
    }

    public void setStyle(int i2, int i3) throws Throwable {
        this.zaa = i2;
        this.zab = i3;
        zaa(getContext());
    }

    @Deprecated
    public void setStyle(int i2, int i3, Scope[] scopeArr) throws Throwable {
        setStyle(i2, i3);
    }
}
