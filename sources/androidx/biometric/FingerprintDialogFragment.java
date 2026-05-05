package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Observer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class FingerprintDialogFragment extends DialogFragment {
    private static final String ARG_HOST_ACTIVITY = "host_activity";
    private static final int MESSAGE_DISPLAY_TIME_MS = 2000;
    static final int STATE_FINGERPRINT = 1;
    static final int STATE_FINGERPRINT_AUTHENTICATED = 3;
    static final int STATE_FINGERPRINT_ERROR = 2;
    static final int STATE_NONE = 0;
    private static final String TAG = "FingerprintFragment";
    private int mErrorTextColor;
    private ImageView mFingerprintIcon;
    final Handler mHandler;
    TextView mHelpMessageView;
    private int mNormalTextColor;
    final Runnable mResetDialogRunnable;
    BiometricViewModel mViewModel;

    private boolean shouldAnimateForTransition(int i2, int i3) {
        if (i2 == 0 && i3 == 1) {
            return false;
        }
        if (i2 == 1 && i3 == 2) {
            return true;
        }
        return i2 == 2 && i3 == 1;
    }

    private FingerprintDialogFragment() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1593ug.zd("\u0011\u001f\u0016%#\u001e\u001ad',g\u0007+,.$2", (short) (ZN.Xd() ^ 12496), (short) (ZN.Xd() ^ 25289))).getDeclaredMethod(C1561oA.od(";8F\u001e18<\u0019;::.:", (short) (C1633zX.Xd() ^ (-30953))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.mResetDialogRunnable = new Runnable() { // from class: androidx.biometric.FingerprintDialogFragment.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    FingerprintDialogFragment.this.resetDialog();
                }
            };
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static FingerprintDialogFragment newInstance(boolean z2) {
        FingerprintDialogFragment fingerprintDialogFragment = new FingerprintDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(ARG_HOST_ACTIVITY, z2);
        fingerprintDialogFragment.setArguments(bundle);
        return fingerprintDialogFragment;
    }

    private boolean isHostedInActivity() {
        return getArguments().getBoolean(ARG_HOST_ACTIVITY, true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        connectViewModel();
        this.mErrorTextColor = getThemedColorFor(Api26Impl.getColorErrorAttr());
        this.mNormalTextColor = getThemedColorFor(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        CharSequence negativeButtonText;
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setTitle(this.mViewModel.getTitle());
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence subtitle = this.mViewModel.getSubtitle();
            if (TextUtils.isEmpty(subtitle)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(subtitle);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            CharSequence description = this.mViewModel.getDescription();
            if (TextUtils.isEmpty(description)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(description);
            }
        }
        this.mFingerprintIcon = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.mHelpMessageView = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        if (AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators())) {
            negativeButtonText = getString(R.string.confirm_device_credential_password);
        } else {
            negativeButtonText = this.mViewModel.getNegativeButtonText();
        }
        builder.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() { // from class: androidx.biometric.FingerprintDialogFragment.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                FingerprintDialogFragment.this.mViewModel.setNegativeButtonPressPending(true);
            }
        });
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        return alertDialogCreate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mViewModel.setFingerprintDialogPreviousState(0);
        this.mViewModel.setFingerprintDialogState(1);
        this.mViewModel.setFingerprintDialogHelpMessage(getString(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.mViewModel.setFingerprintDialogCancelPending(true);
    }

    private void connectViewModel() {
        BiometricViewModel viewModel = BiometricPrompt.getViewModel(this, isHostedInActivity());
        this.mViewModel = viewModel;
        viewModel.getFingerprintDialogState().observe(this, new Observer<Integer>() { // from class: androidx.biometric.FingerprintDialogFragment.3
            @Override // androidx.lifecycle.Observer
            public void onChanged(Integer num) throws Throwable {
                FingerprintDialogFragment.this.mHandler.removeCallbacks(FingerprintDialogFragment.this.mResetDialogRunnable);
                FingerprintDialogFragment.this.updateFingerprintIcon(num.intValue());
                FingerprintDialogFragment.this.updateHelpMessageColor(num.intValue());
                Handler handler = FingerprintDialogFragment.this.mHandler;
                Runnable runnable = FingerprintDialogFragment.this.mResetDialogRunnable;
                short sXd = (short) (C1580rY.Xd() ^ (-29130));
                int[] iArr = new int["\u0006\u0012\u0007\u0014\u0010\t\u0003K\u001c\u001fXq\n\u0016\u000b\u0012y\u0006".length()];
                QB qb = new QB("\u0006\u0012\u0007\u0014\u0010\t\u0003K\u001c\u001fXq\n\u0016\u000b\u0012y\u0006");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                Object[] objArr = {runnable, 2000L};
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd(")).0\u0001#+!:''", (short) (Od.Xd() ^ (-1786)), (short) (Od.Xd() ^ (-25726))), Class.forName(C1561oA.Yd("\u0012\n \fY\u0019\u000f\u001d\u0017^\u0004(\"#\u0017\u0019$\u001e", (short) (C1633zX.Xd() ^ (-2588)))), Long.TYPE);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        });
        this.mViewModel.getFingerprintDialogHelpMessage().observe(this, new Observer<CharSequence>() { // from class: androidx.biometric.FingerprintDialogFragment.4
            @Override // androidx.lifecycle.Observer
            public void onChanged(CharSequence charSequence) throws Throwable {
                FingerprintDialogFragment.this.mHandler.removeCallbacks(FingerprintDialogFragment.this.mResetDialogRunnable);
                FingerprintDialogFragment.this.updateHelpMessageText(charSequence);
                Handler handler = FingerprintDialogFragment.this.mHandler;
                Object[] objArr = {FingerprintDialogFragment.this.mResetDialogRunnable, 2000L};
                Method method = Class.forName(hg.Vd("CODQMF@\tIL\u0006\u001f7C8?7C", (short) (C1607wl.Xd() ^ 8828), (short) (C1607wl.Xd() ^ 5715))).getMethod(C1561oA.yd("\b\b\t\u000bWy}s\tuq", (short) (OY.Xd() ^ 23302)), Class.forName(C1561oA.ud("0&:$o-!-%j\u000e0('\u0019\u0019\"\u001a", (short) (C1499aX.Xd() ^ (-868)))), Long.TYPE);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        });
    }

    void updateFingerprintIcon(int i2) {
        int fingerprintDialogPreviousState;
        Drawable assetForTransition;
        if (this.mFingerprintIcon == null || (assetForTransition = getAssetForTransition((fingerprintDialogPreviousState = this.mViewModel.getFingerprintDialogPreviousState()), i2)) == null) {
            return;
        }
        this.mFingerprintIcon.setImageDrawable(assetForTransition);
        if (shouldAnimateForTransition(fingerprintDialogPreviousState, i2)) {
            Api21Impl.startAnimation(assetForTransition);
        }
        this.mViewModel.setFingerprintDialogPreviousState(i2);
    }

    void updateHelpMessageColor(int i2) {
        TextView textView = this.mHelpMessageView;
        if (textView != null) {
            textView.setTextColor(i2 == 2 ? this.mErrorTextColor : this.mNormalTextColor);
        }
    }

    void updateHelpMessageText(CharSequence charSequence) {
        TextView textView = this.mHelpMessageView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void resetDialog() throws Throwable {
        Context context = getContext();
        if (context == null) {
            C1561oA.ud("\u00179=52>;<26;\f7%*/&.3", (short) (OY.Xd() ^ 15788));
            C1561oA.yd("\u0006(*V&\u001a%\u001845'-#\\.#-h*0%11*}p\u0011>:A/C\f8~\n3\u0003\u0007~\fN", (short) (Od.Xd() ^ (-3149)));
            return;
        }
        this.mViewModel.setFingerprintDialogState(1);
        BiometricViewModel biometricViewModel = this.mViewModel;
        int i2 = R.string.fingerprint_dialog_touch_sensor;
        short sXd = (short) (C1633zX.Xd() ^ (-5300));
        int[] iArr = new int["\u001f-$31,(r)66=/9@z\u0011>>E7KH".length()];
        QB qb = new QB("\u001f-$31,(r)66=/9@z\u0011>>E7KH");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method method = cls.getMethod(Xg.qd("=<L,NMEKE", (short) (Od.Xd() ^ (-13473)), (short) (Od.Xd() ^ (-19854))), clsArr);
        try {
            method.setAccessible(true);
            biometricViewModel.setFingerprintDialogHelpMessage((String) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private int getThemedColorFor(int i2) throws Throwable {
        Context context = getContext();
        if (context == null) {
            C1561oA.Kd("Z~\u0005~}\f\u000b\u000e\u0006\f\u0013e\u0013\u0003\n\u0011\n\u0014\u001b", (short) (C1499aX.Xd() ^ (-3751)));
            Wg.Zd("6yfcgLpA6R\u0014}\u0007\u001el\\Swid\u001aI?85$Y7TlegR\u007fw\u001dhUn*(#\u0014\u001byno\u0010Uy\"jmN:u", (short) (OY.Xd() ^ 2928), (short) (OY.Xd() ^ 11350));
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        Class<?> cls = Class.forName(C1561oA.Xd("gul{ytp;q~~\u0006w\u0002\tCY\u0007\u0007\u000e\u007f\u0014\u0011", (short) (C1633zX.Xd() ^ (-9))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-6802));
        int[] iArr = new int[";:J+@>G@".length()];
        QB qb = new QB(";:J+@>G@");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            ((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(i2, typedValue, true);
            int i4 = typedValue.data;
            int[] iArr2 = {i2};
            short sXd2 = (short) (ZN.Xd() ^ 22455);
            short sXd3 = (short) (ZN.Xd() ^ 14685);
            int[] iArr3 = new int["\u0003\u000f\u0004\u0011\r\u0006\u007fH|\b\u0006\u000bz\u0003\b@T\u007f}\u0003r\u0005\u007f".length()];
            QB qb2 = new QB("\u0003\u000f\u0004\u0011\r\u0006\u007fH|\b\u0006\u000bz\u0003\b@T\u007f}\u0003r\u0005\u007f");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr3[i5] = xuXd2.fK(((sXd2 + i5) + xuXd2.CK(iKK2)) - sXd3);
                i5++;
            }
            Class<?> cls2 = Class.forName(new String(iArr3, 0, i5));
            Class<?>[] clsArr2 = {Integer.TYPE, int[].class};
            Object[] objArr2 = {Integer.valueOf(i4), iArr2};
            Method method2 = cls2.getMethod(hg.Vd("m_p\\cgKkoaYW3edaWOa_O\\", (short) (ZN.Xd() ^ 24037), (short) (ZN.Xd() ^ 3151)), clsArr2);
            try {
                method2.setAccessible(true);
                TypedArray typedArray = (TypedArray) method2.invoke(context, objArr2);
                int color = typedArray.getColor(0, 0);
                typedArray.recycle();
                return color;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private Drawable getAssetForTransition(int i2, int i3) {
        int i4;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (i2 != 0 || i3 != 1) {
            if (i2 != 1 || i3 != 2) {
                if (i2 == 2 && i3 == 1) {
                    i4 = R.drawable.fingerprint_dialog_fp_icon;
                } else {
                    if (i2 != 1 || i3 != 3) {
                        return null;
                    }
                    i4 = R.drawable.fingerprint_dialog_fp_icon;
                }
            } else {
                i4 = R.drawable.fingerprint_dialog_error;
            }
        } else {
            i4 = R.drawable.fingerprint_dialog_fp_icon;
        }
        return ContextCompat.getDrawable(context, i4);
    }

    /* JADX INFO: loaded from: classes.dex */
    private static class Api26Impl {
        private Api26Impl() {
        }

        static int getColorErrorAttr() {
            return androidx.appcompat.R.attr.colorError;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private static class Api21Impl {
        private Api21Impl() {
        }

        static void startAnimation(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }
}
