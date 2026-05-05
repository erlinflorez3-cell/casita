package androidx.biometric;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.drew.metadata.exif.makernotes.OlympusFocusInfoMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes.dex */
class DeviceUtils {
    private DeviceUtils() {
    }

    static boolean shouldUseFingerprintForCrypto(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return isVendorInList(context, str, R.array.crypto_fingerprint_fallback_vendors) || isModelInPrefixList(context, str2, R.array.crypto_fingerprint_fallback_prefixes);
    }

    static boolean shouldHideFingerprintDialog(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return isModelInPrefixList(context, str, R.array.hide_fingerprint_instantly_prefixes);
    }

    static boolean shouldDelayShowingPrompt(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return isModelInList(context, str, R.array.delay_showing_prompt_models);
    }

    static boolean canAssumeStrongBiometrics(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return isModelInList(context, str, R.array.assume_strong_biometrics_models);
    }

    static boolean shouldUseKeyguardManagerForBiometricAndCredential(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return !isVendorInList(context, str, R.array.keyguard_biometric_and_credential_exclude_vendors);
    }

    private static boolean isVendorInList(Context context, String str, int i2) throws Throwable {
        if (str == null) {
            return false;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("SaXge`\\']jjqcmt/Erryk\u007f|", (short) (FB.Xd() ^ 12805))).getMethod(Wg.vd("FEQ0@OHOYKJY", (short) (Od.Xd() ^ (-30804))), new Class[0]);
        try {
            method.setAccessible(true);
            String[] stringArray = ((Resources) method.invoke(context, objArr)).getStringArray(i2);
            for (String str2 : stringArray) {
                if (str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static boolean isModelInPrefixList(Context context, String str, int i2) throws Throwable {
        if (str == null) {
            return false;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("DRIXVQM\u0018N[[bT^e 6ccj\\pm", (short) (OY.Xd() ^ 9916))).getMethod(Wg.Zd("%M\u0017'd%Z\u0013:]\u001a[", (short) (C1607wl.Xd() ^ 19935), (short) (C1607wl.Xd() ^ OlympusFocusInfoMakernoteDirectory.TagImageStabilization)), new Class[0]);
        try {
            method.setAccessible(true);
            String[] stringArray = ((Resources) method.invoke(context, objArr)).getStringArray(i2);
            for (String str2 : stringArray) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static boolean isModelInList(Context context, String str, int i2) throws Throwable {
        if (str == null) {
            return false;
        }
        short sXd = (short) (OY.Xd() ^ 32014);
        short sXd2 = (short) (OY.Xd() ^ 32682);
        int[] iArr = new int["gul{ytp;q~~\u0006w\u0002\tCY\u0007\u0007\u000e\u007f\u0014\u0011".length()];
        QB qb = new QB("gul{ytp;q~~\u0006w\u0002\tCY\u0007\u0007\u000e\u007f\u0014\u0011");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (C1633zX.Xd() ^ (-1042));
        int[] iArr2 = new int["\u001a\u0017%\u0002\u0014!\u001c!\u001d\r\u000e\u001b".length()];
        QB qb2 = new QB("\u001a\u0017%\u0002\u0014!\u001c!\u001d\r\u000e\u001b");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(sXd3 + sXd3 + i4 + xuXd2.CK(iKK2));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            String[] stringArray = ((Resources) method.invoke(context, objArr)).getStringArray(i2);
            for (String str2 : stringArray) {
                if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
