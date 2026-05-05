package com.rnbiometrics;

import androidx.biometric.BiometricPrompt;
import androidx.exifinterface.media.ExifInterface;
import com.braze.Constants;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Signature;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class CreateSignatureCallback extends BiometricPrompt.AuthenticationCallback {
    private String payload;
    private Promise promise;

    public CreateSignatureCallback(Promise promise, String str) {
        this.promise = promise;
        this.payload = str;
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i2, CharSequence charSequence) {
        super.onAuthenticationError(i2, charSequence);
        if (i2 != 13 && i2 != 10) {
            this.promise.reject(charSequence.toString(), charSequence.toString());
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean(FirebaseAnalytics.Param.SUCCESS, false);
        writableNativeMap.putString("error", "User cancellation");
        this.promise.resolve(writableNativeMap);
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) throws Throwable {
        super.onAuthenticationSucceeded(authenticationResult);
        try {
            Signature signature = authenticationResult.getCryptoObject().getSignature();
            signature.update(this.payload.getBytes());
            Object[] objArr = {signature.sign(), 0};
            Method declaredMethod = Class.forName(Wg.vd("O]Tca\\X#kkae(=]pc54", (short) (C1580rY.Xd() ^ (-3394)))).getDeclaredMethod(Qg.kd("\"*\u001e)\u001d\u001d\u000b%\b(%\u001b\u001f\u0017", (short) (ZN.Xd() ^ 3977), (short) (ZN.Xd() ^ 23969)), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                String strReplaceAll = ((String) declaredMethod.invoke(null, objArr)).replaceAll(hg.Vd(ExifInterface.LONGITUDE_WEST, (short) (FB.Xd() ^ 28783), (short) (FB.Xd() ^ 5653)), "").replaceAll(C1561oA.ud(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, (short) (C1633zX.Xd() ^ (-28342))), "");
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putBoolean(C1561oA.yd("&)\u0018\u0019\u001c+,", (short) (C1580rY.Xd() ^ (-17551))), true);
                writableNativeMap.putString(C1561oA.Yd("]TS[OcecW", (short) (ZN.Xd() ^ 3149)), strReplaceAll);
                this.promise.resolve(writableNativeMap);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            Promise promise = this.promise;
            String str = Xg.qd("\u0019GHFJx=MA>RHNH\u0002VMLTH\\^\\P&\r", (short) (C1633zX.Xd() ^ (-1797)), (short) (C1633zX.Xd() ^ (-2302))) + e3.getMessage();
            short sXd = (short) (OY.Xd() ^ 23243);
            short sXd2 = (short) (OY.Xd() ^ 5298);
            int[] iArr = new int["\u000e\n`+\u0005D\u0017r=G48\u001ab4W\"/E\tsA\u0016b".length()];
            QB qb = new QB("\u000e\n`+\u0005D\u0017r=G48\u001ab4W\"/E\tsA\u0016b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            promise.reject(str, new String(iArr, 0, i2));
        }
    }
}
