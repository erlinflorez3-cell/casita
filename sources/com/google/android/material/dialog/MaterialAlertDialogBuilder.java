package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public class MaterialAlertDialogBuilder extends AlertDialog.Builder {
    private static final int DEF_STYLE_ATTR = R.attr.alertDialogStyle;
    private static final int DEF_STYLE_RES = R.style.MaterialAlertDialog_MaterialComponents;
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = R.attr.materialAlertDialogTheme;
    private Drawable background;
    private final Rect backgroundInsets;

    public MaterialAlertDialogBuilder(Context context) {
        this(context, 0);
    }

    public MaterialAlertDialogBuilder(Context context, int i2) throws Throwable {
        super(createMaterialAlertDialogThemedContext(context), getOverridingThemeResId(context, i2));
        Context context2 = getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("w\u0006|\f\n\u0005\u0001K\u0002\u000f\u000f\u0016\b\u0012\u0019Si\u0017\u0017\u001e\u0010$!", (short) (OY.Xd() ^ 3327), (short) (OY.Xd() ^ 3603))).getMethod(Jg.Wd("LfPK[2Y-", (short) (FB.Xd() ^ 13471), (short) (FB.Xd() ^ 30567)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources.Theme theme = (Resources.Theme) method.invoke(context2, objArr);
            int i3 = DEF_STYLE_ATTR;
            int i4 = DEF_STYLE_RES;
            this.backgroundInsets = MaterialDialogs.getDialogBackgroundInsets(context2, i3, i4);
            int color = MaterialColors.getColor(context2, R.attr.colorSurface, getClass().getCanonicalName());
            int[] iArr = R.styleable.MaterialAlertDialog;
            Class<?> cls = Class.forName(ZO.xd("o@i1f\u000fttrrv\u0016$<,sw-r#A0\u001d", (short) (ZN.Xd() ^ 31602), (short) (ZN.Xd() ^ 32382)));
            Class<?>[] clsArr = new Class[4];
            short sXd = (short) (C1499aX.Xd() ^ (-18649));
            short sXd2 = (short) (C1499aX.Xd() ^ (-20741));
            int[] iArr2 = new int["\u000bD+\u0011\u0010T<[lxk*::|m/\u0010`m>\u0011\"\u001e?".length()];
            QB qb = new QB("\u000bD+\u0011\u0010T<[lxk*::|m/\u0010`m>\u0011\"\u001e?");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i5] = xuXd.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i5 * sXd2))) + xuXd.CK(iKK));
                i5++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i5));
            clsArr[1] = int[].class;
            clsArr[2] = Integer.TYPE;
            clsArr[3] = Integer.TYPE;
            Object[] objArr2 = {null, iArr, Integer.valueOf(i3), Integer.valueOf(i4)};
            Method method2 = cls.getMethod(Ig.wd("v>\\s\u001aY\u0014,Y~oz(gA_-\u0012kd\u000eb", (short) (FB.Xd() ^ 28214)), clsArr);
            try {
                method2.setAccessible(true);
                TypedArray typedArray = (TypedArray) method2.invoke(context2, objArr2);
                int color2 = typedArray.getColor(R.styleable.MaterialAlertDialog_backgroundTint, color);
                typedArray.recycle();
                MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, i3, i4);
                materialShapeDrawable.initializeElevationOverlay(context2);
                materialShapeDrawable.setFillColor(ColorStateList.valueOf(color2));
                if (Build.VERSION.SDK_INT >= 28) {
                    TypedValue typedValue = new TypedValue();
                    theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
                    Context context3 = getContext();
                    Class<?> cls2 = Class.forName(EO.Od("\u001bY=/|,GH%!\"\u0006\"1;N!Ou\b\u0010fx", (short) (C1607wl.Xd() ^ 15772)));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd3 = (short) (C1633zX.Xd() ^ (-18538));
                    int[] iArr3 = new int["DAO,>KFKG78E".length()];
                    QB qb2 = new QB("DAO,>KFKG78E");
                    int i6 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr3[i6] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i6 + xuXd2.CK(iKK2));
                        i6++;
                    }
                    Method method3 = cls2.getMethod(new String(iArr3, 0, i6), clsArr2);
                    try {
                        method3.setAccessible(true);
                        float dimension = typedValue.getDimension(((Resources) method3.invoke(context3, objArr3)).getDisplayMetrics());
                        if (typedValue.type == 5 && dimension >= 0.0f) {
                            materialShapeDrawable.setCornerSize(dimension);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                this.background = materialShapeDrawable;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private static Context createMaterialAlertDialogThemedContext(Context context) throws Throwable {
        int materialAlertDialogThemeOverlay = getMaterialAlertDialogThemeOverlay(context);
        Context contextWrap = MaterialThemeOverlay.wrap(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        return materialAlertDialogThemeOverlay == 0 ? contextWrap : new ContextThemeWrapper(contextWrap, materialAlertDialogThemeOverlay);
    }

    private static int getMaterialAlertDialogThemeOverlay(Context context) throws Throwable {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, MATERIAL_ALERT_DIALOG_THEME_OVERLAY);
        if (typedValueResolve == null) {
            return 0;
        }
        return typedValueResolve.data;
    }

    private static int getOverridingThemeResId(Context context, int i2) {
        return i2 == 0 ? getMaterialAlertDialogThemeOverlay(context) : i2;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public AlertDialog create() {
        AlertDialog alertDialogCreate = super.create();
        Window window = alertDialogCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.background;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(ViewCompat.getElevation(decorView));
        }
        window.setBackgroundDrawable(MaterialDialogs.insetDrawable(this.background, this.backgroundInsets));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(alertDialogCreate, this.backgroundInsets));
        return alertDialogCreate;
    }

    public Drawable getBackground() {
        return this.background;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setAdapter(listAdapter, onClickListener);
    }

    public MaterialAlertDialogBuilder setBackground(Drawable drawable) {
        this.background = drawable;
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetBottom(int i2) {
        this.backgroundInsets.bottom = i2;
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetEnd(int i2) throws Throwable {
        Context context = getContext();
        Class<?> cls = Class.forName(C1593ug.zd("SaXge`\\']jjqcmt/Erryk\u007f|", (short) (C1633zX.Xd() ^ (-5310)), (short) (C1633zX.Xd() ^ (-11091))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-22051));
        int[] iArr = new int["_\\jGYfafbRS`".length()];
        QB qb = new QB("_\\jGYfafbRS`");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            if (((Resources) method.invoke(context, objArr)).getConfiguration().getLayoutDirection() == 1) {
                this.backgroundInsets.left = i2;
            } else {
                this.backgroundInsets.right = i2;
            }
            return this;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public MaterialAlertDialogBuilder setBackgroundInsetStart(int i2) throws Throwable {
        Context context = getContext();
        Class<?> cls = Class.forName(C1561oA.Kd("Vd[jhc_*`mmtfpw2Huu|n\u0003\u007f", (short) (C1607wl.Xd() ^ 30263)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-20205));
        short sXd2 = (short) (Od.Xd() ^ (-30636));
        int[] iArr = new int["V+u)w[\u0013n\u0017^\u001a\u007f".length()];
        QB qb = new QB("V+u)w[\u0013n\u0017^\u001a\u007f");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            if (((Resources) method.invoke(context, objArr)).getConfiguration().getLayoutDirection() == 1) {
                this.backgroundInsets.right = i2;
            } else {
                this.backgroundInsets.left = i2;
            }
            return this;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public MaterialAlertDialogBuilder setBackgroundInsetTop(int i2) {
        this.backgroundInsets.top = i2;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setCancelable(boolean z2) {
        return (MaterialAlertDialogBuilder) super.setCancelable(z2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        return (MaterialAlertDialogBuilder) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setCustomTitle(View view) {
        return (MaterialAlertDialogBuilder) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setIcon(int i2) {
        return (MaterialAlertDialogBuilder) super.setIcon(i2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setIconAttribute(int i2) {
        return (MaterialAlertDialogBuilder) super.setIconAttribute(i2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setItems(int i2, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setMessage(int i2) {
        return (MaterialAlertDialogBuilder) super.setMessage(i2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setMessage(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setMultiChoiceItems(int i2, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(i2, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setNegativeButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setNeutralButton(int i2, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setNeutralButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return (MaterialAlertDialogBuilder) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return (MaterialAlertDialogBuilder) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (MaterialAlertDialogBuilder) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        return (MaterialAlertDialogBuilder) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setPositiveButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setSingleChoiceItems(int i2, int i3, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(i2, i3, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setSingleChoiceItems(Cursor cursor, int i2, String str, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(cursor, i2, str, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setSingleChoiceItems(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(listAdapter, i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setSingleChoiceItems(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(charSequenceArr, i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setTitle(int i2) {
        return (MaterialAlertDialogBuilder) super.setTitle(i2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setTitle(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setView(int i2) {
        return (MaterialAlertDialogBuilder) super.setView(i2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public MaterialAlertDialogBuilder setView(View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }
}
