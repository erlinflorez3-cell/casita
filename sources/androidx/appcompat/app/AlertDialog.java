package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    static final int LAYOUT_HINT_NONE = 0;
    static final int LAYOUT_HINT_SIDE = 1;
    final AlertController mAlert;

    protected AlertDialog(Context context) {
        this(context, 0);
    }

    protected AlertDialog(Context context, int i2) {
        super(context, resolveDialogTheme(context, i2));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    protected AlertDialog(Context context, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z2);
        setOnCancelListener(onCancelListener);
    }

    static int resolveDialogTheme(Context context, int i2) throws Throwable {
        if ((-1) - (((-1) - (i2 >>> 24)) | ((-1) - 255)) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        Class<?> cls = Class.forName(ZO.xd("M4iCNOU7\u0001x9\u007f'WmwO\u0019\u0003\u0014);4", (short) (C1633zX.Xd() ^ (-11002)), (short) (C1633zX.Xd() ^ (-22929))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 11542);
        short sXd2 = (short) (ZN.Xd() ^ 6143);
        int[] iArr = new int["K2o\rL^:h".length()];
        QB qb = new QB("K2o\rL^:h");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            ((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
            return typedValue.resourceId;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public Button getButton(int i2) {
        return this.mAlert.getButton(i2);
    }

    public ListView getListView() {
        return this.mAlert.getListView();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.setTitle(charSequence);
    }

    public void setCustomTitle(View view) {
        this.mAlert.setCustomTitle(view);
    }

    public void setMessage(CharSequence charSequence) {
        this.mAlert.setMessage(charSequence);
    }

    public void setView(View view) {
        this.mAlert.setView(view);
    }

    public void setView(View view, int i2, int i3, int i4, int i5) {
        this.mAlert.setView(view, i2, i3, i4, i5);
    }

    void setButtonPanelLayoutHint(int i2) {
        this.mAlert.setButtonPanelLayoutHint(i2);
    }

    public void setButton(int i2, CharSequence charSequence, Message message) {
        this.mAlert.setButton(i2, charSequence, null, message, null);
    }

    public void setButton(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.setButton(i2, charSequence, onClickListener, null, null);
    }

    public void setButton(int i2, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.setButton(i2, charSequence, onClickListener, null, drawable);
    }

    public void setIcon(int i2) {
        this.mAlert.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        this.mAlert.setIcon(drawable);
    }

    public void setIconAttribute(int i2) throws Throwable {
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        Class<?> cls = Class.forName(Ig.wd("\u000ebv(}3\u0006G*eNj-D*|m{R|+\u0006\u0018", (short) (FB.Xd() ^ 24053)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 16166);
        int[] iArr = new int["4i'&b\u0015x`".length()];
        QB qb = new QB("4i'&b\u0015x`");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            ((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(i2, typedValue, true);
            this.mAlert.setIcon(typedValue.resourceId);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mAlert.installContent();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.mAlert.onKeyDown(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.mAlert.onKeyUp(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Builder {
        private final AlertController.AlertParams P;
        private final int mTheme;

        public Builder(Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        public Builder(Context context, int i2) {
            this.P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i2)));
            this.mTheme = i2;
        }

        public Context getContext() {
            return this.P.mContext;
        }

        public Builder setTitle(int i2) throws Throwable {
            AlertController.AlertParams alertParams = this.P;
            Context context = alertParams.mContext;
            Class<?> cls = Class.forName(Qg.kd("LXMZVOI\u0012FQOTDLQ\n\u001eIGL<NI", (short) (OY.Xd() ^ 9825), (short) (OY.Xd() ^ 28855)));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method method = cls.getMethod(hg.Vd("jguTdvq", (short) (C1633zX.Xd() ^ (-24399)), (short) (C1633zX.Xd() ^ (-26164))), clsArr);
            try {
                method.setAccessible(true);
                alertParams.mTitle = (CharSequence) method.invoke(context, objArr);
                return this;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Builder setTitle(CharSequence charSequence) {
            this.P.mTitle = charSequence;
            return this;
        }

        public Builder setCustomTitle(View view) {
            this.P.mCustomTitleView = view;
            return this;
        }

        public Builder setMessage(int i2) throws Throwable {
            AlertController.AlertParams alertParams = this.P;
            Context context = alertParams.mContext;
            Class<?> cls = Class.forName(Jg.Wd("\rAY\u0019Hu\u0013\u000eu1R\n-i\u0012|\u0004b\t1c\u0019H", (short) (C1580rY.Xd() ^ (-5817)), (short) (C1580rY.Xd() ^ (-4605))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            short sXd = (short) (OY.Xd() ^ 4751);
            short sXd2 = (short) (OY.Xd() ^ 12370);
            int[] iArr = new int["\u0004}Hs`~\"".length()];
            QB qb = new QB("\u0004}Hs`~\"");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                alertParams.mMessage = (CharSequence) method.invoke(context, objArr);
                return this;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Builder setMessage(CharSequence charSequence) {
            this.P.mMessage = charSequence;
            return this;
        }

        public Builder setIcon(int i2) {
            this.P.mIconId = i2;
            return this;
        }

        public Builder setIcon(Drawable drawable) {
            this.P.mIcon = drawable;
            return this;
        }

        public Builder setIconAttribute(int i2) throws Throwable {
            TypedValue typedValue = new TypedValue();
            Context context = this.P.mContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("gshuqjd-aljo_gl%9dbgWid", (short) (OY.Xd() ^ 13843))).getMethod(C1561oA.yd("2/A 73>5", (short) (Od.Xd() ^ (-3156))), new Class[0]);
            try {
                method.setAccessible(true);
                ((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(i2, typedValue, true);
                this.P.mIconId = typedValue.resourceId;
                return this;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Builder setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) throws Throwable {
            AlertController.AlertParams alertParams = this.P;
            Context context = alertParams.mContext;
            Class<?> cls = Class.forName(C1561oA.Kd("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96", (short) (ZN.Xd() ^ 5135)));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method method = cls.getMethod(Wg.Zd("\u0004\"P7bf\u007f", (short) (ZN.Xd() ^ 6762), (short) (ZN.Xd() ^ 10423)), clsArr);
            try {
                method.setAccessible(true);
                alertParams.mPositiveButtonText = (CharSequence) method.invoke(context, objArr);
                this.P.mPositiveButtonListener = onClickListener;
                return this;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.P.mPositiveButtonText = charSequence;
            this.P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButtonIcon(Drawable drawable) {
            this.P.mPositiveButtonIcon = drawable;
            return this;
        }

        public Builder setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) throws Throwable {
            AlertController.AlertParams alertParams = this.P;
            Context context = alertParams.mContext;
            Class<?> cls = Class.forName(EO.Od("?\u001ddSO\u0006\u001d\u0007vgdHgz9\u0011j\t`n\u001ay\u0014", (short) (Od.Xd() ^ (-30788))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method method = cls.getMethod(C1561oA.Qd("yv\u0005cs\u0006\u0001", (short) (C1580rY.Xd() ^ (-25365))), clsArr);
            try {
                method.setAccessible(true);
                alertParams.mNegativeButtonText = (CharSequence) method.invoke(context, objArr);
                this.P.mNegativeButtonListener = onClickListener;
                return this;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.P.mNegativeButtonText = charSequence;
            this.P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNegativeButtonIcon(Drawable drawable) {
            this.P.mNegativeButtonIcon = drawable;
            return this;
        }

        public Builder setNeutralButton(int i2, DialogInterface.OnClickListener onClickListener) throws Throwable {
            AlertController.AlertParams alertParams = this.P;
            Context context = alertParams.mContext;
            Class<?> cls = Class.forName(C1593ug.zd("P^Udb]Y$Zggn`jq,Boovh|y", (short) (C1580rY.Xd() ^ (-14012)), (short) (C1580rY.Xd() ^ (-971))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method method = cls.getMethod(C1561oA.od("ur\u0001_o\u0002|", (short) (FB.Xd() ^ 5170)), clsArr);
            try {
                method.setAccessible(true);
                alertParams.mNeutralButtonText = (CharSequence) method.invoke(context, objArr);
                this.P.mNeutralButtonListener = onClickListener;
                return this;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.P.mNeutralButtonText = charSequence;
            this.P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButtonIcon(Drawable drawable) {
            this.P.mNeutralButtonIcon = drawable;
            return this;
        }

        public Builder setCancelable(boolean z2) {
            this.P.mCancelable = z2;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.mOnCancelListener = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.mOnDismissListener = onDismissListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.mOnKeyListener = onKeyListener;
            return this;
        }

        public Builder setItems(int i2, DialogInterface.OnClickListener onClickListener) throws Throwable {
            AlertController.AlertParams alertParams = this.P;
            Context context = alertParams.mContext;
            Class<?> cls = Class.forName(C1561oA.Yd("&4+:83/y0==D6@G\u0002\u0018EEL>RO", (short) (C1580rY.Xd() ^ (-7101))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-29717));
            short sXd2 = (short) (Od.Xd() ^ (-29488));
            int[] iArr = new int["/.>\u001d1@=DB47F".length()];
            QB qb = new QB("/.>\u001d1@=DB47F");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                i3++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                alertParams.mItems = ((Resources) method.invoke(context, objArr)).getTextArray(i2);
                this.P.mOnClickListener = onClickListener;
                return this;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.P.mItems = charSequenceArr;
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            this.P.mAdapter = listAdapter;
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            this.P.mCursor = cursor;
            this.P.mLabelColumn = str;
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setMultiChoiceItems(int i2, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) throws Throwable {
            AlertController.AlertParams alertParams = this.P;
            Context context = alertParams.mContext;
            Class<?> cls = Class.forName(C1626yg.Ud("g+#+]\u0007:[X\t\u0011H\u001exu\n%Zr|+&\"", (short) (C1580rY.Xd() ^ (-26912)), (short) (C1580rY.Xd() ^ (-18263))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1607wl.Xd() ^ 22217);
            int[] iArr = new int["\u00066um\u0007g9\u0016Wjh\u001f".length()];
            QB qb = new QB("\u00066um\u0007g9\u0016Wjh\u001f");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                alertParams.mItems = ((Resources) method.invoke(context, objArr)).getTextArray(i2);
                this.P.mOnCheckboxClickListener = onMultiChoiceClickListener;
                this.P.mCheckedItems = zArr;
                this.P.mIsMultiChoice = true;
                return this;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.P.mItems = charSequenceArr;
            this.P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.P.mCheckedItems = zArr;
            this.P.mIsMultiChoice = true;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.P.mCursor = cursor;
            this.P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.P.mIsCheckedColumn = str;
            this.P.mLabelColumn = str2;
            this.P.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(int i2, int i3, DialogInterface.OnClickListener onClickListener) throws Throwable {
            AlertController.AlertParams alertParams = this.P;
            Context context = alertParams.mContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("JXO^\\WS\u001eTaahZdk&<iipbvs", (short) (OY.Xd() ^ 23336))).getMethod(Wg.vd("\u0011\u000e |\u0013 \u001f$$\u0014\u0019&", (short) (Od.Xd() ^ (-213))), new Class[0]);
            try {
                method.setAccessible(true);
                alertParams.mItems = ((Resources) method.invoke(context, objArr)).getTextArray(i2);
                this.P.mOnClickListener = onClickListener;
                this.P.mCheckedItem = i3;
                this.P.mIsSingleChoice = true;
                return this;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i2, String str, DialogInterface.OnClickListener onClickListener) {
            this.P.mCursor = cursor;
            this.P.mOnClickListener = onClickListener;
            this.P.mCheckedItem = i2;
            this.P.mLabelColumn = str;
            this.P.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
            this.P.mItems = charSequenceArr;
            this.P.mOnClickListener = onClickListener;
            this.P.mCheckedItem = i2;
            this.P.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            this.P.mAdapter = listAdapter;
            this.P.mOnClickListener = onClickListener;
            this.P.mCheckedItem = i2;
            this.P.mIsSingleChoice = true;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.mOnItemSelectedListener = onItemSelectedListener;
            return this;
        }

        public Builder setView(int i2) {
            this.P.mView = null;
            this.P.mViewLayoutResId = i2;
            this.P.mViewSpacingSpecified = false;
            return this;
        }

        public Builder setView(View view) {
            this.P.mView = view;
            this.P.mViewLayoutResId = 0;
            this.P.mViewSpacingSpecified = false;
            return this;
        }

        @Deprecated
        public Builder setView(View view, int i2, int i3, int i4, int i5) {
            this.P.mView = view;
            this.P.mViewLayoutResId = 0;
            this.P.mViewSpacingSpecified = true;
            this.P.mViewSpacingLeft = i2;
            this.P.mViewSpacingTop = i3;
            this.P.mViewSpacingRight = i4;
            this.P.mViewSpacingBottom = i5;
            return this;
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z2) {
            this.P.mForceInverseBackground = z2;
            return this;
        }

        public Builder setRecycleOnMeasureEnabled(boolean z2) {
            this.P.mRecycleOnMeasure = z2;
            return this;
        }

        public AlertDialog create() {
            AlertDialog alertDialog = new AlertDialog(this.P.mContext, this.mTheme);
            this.P.apply(alertDialog.mAlert);
            alertDialog.setCancelable(this.P.mCancelable);
            if (this.P.mCancelable) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.P.mOnCancelListener);
            alertDialog.setOnDismissListener(this.P.mOnDismissListener);
            if (this.P.mOnKeyListener != null) {
                alertDialog.setOnKeyListener(this.P.mOnKeyListener);
            }
            return alertDialog;
        }

        public AlertDialog show() {
            AlertDialog alertDialogCreate = create();
            alertDialogCreate.show();
            return alertDialogCreate;
        }
    }
}
