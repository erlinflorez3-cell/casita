package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2ParameterSpec;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public final class PackageInfoCompat {
    public static long getLongVersionCode(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getLongVersionCode(packageInfo);
        }
        return packageInfo.versionCode;
    }

    public static List<Signature> getSignatures(PackageManager packageManager, String str) throws Throwable {
        Signature[] signingCertificateHistory;
        if (Build.VERSION.SDK_INT >= 28) {
            Object[] objArr = {str, 134217728};
            Method method = Class.forName(C1561oA.Xd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0013  '\u0019#*d(&g\u000b\u001d ) '&\u000f$2&-,:", (short) (C1607wl.Xd() ^ 9116))).getMethod(Qg.kd("*'5\u0010 !(\u001d\"\u001f\u0002&\u001d%", (short) (OY.Xd() ^ 7070), (short) (OY.Xd() ^ 24536)), Class.forName(Wg.vd("KCYE\u0013RHVP\u0018>`_W]W", (short) (C1580rY.Xd() ^ (-5122)))), Integer.TYPE);
            try {
                method.setAccessible(true);
                SigningInfo signingInfo = ((PackageInfo) method.invoke(packageManager, objArr)).signingInfo;
                if (Api28Impl.hasMultipleSigners(signingInfo)) {
                    signingCertificateHistory = Api28Impl.getApkContentsSigners(signingInfo);
                } else {
                    signingCertificateHistory = Api28Impl.getSigningCertificateHistory(signingInfo);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            Class<?> cls = Class.forName(hg.Vd(":F;HD=7\u007f4?=B2:?w95t\u0016&'.#(%\f\u001f+\u001d\"\u001f+", (short) (Od.Xd() ^ (-15327)), (short) (Od.Xd() ^ (-30207))));
            Class<?>[] clsArr = {Class.forName(C1561oA.ud("\u0016\f \nU\u0013\u0007\u0013\u000bPt\u0015\u0012\b\f\u0004", (short) (C1499aX.Xd() ^ (-32306)))), Integer.TYPE};
            Object[] objArr2 = {str, 64};
            short sXd = (short) (C1580rY.Xd() ^ (-9181));
            int[] iArr = new int["\u001a\u0019%\u0002\u0018\u001b \u0017\"!\u0002(%/".length()];
            QB qb = new QB("\u001a\u0019%\u0002\u0018\u001b \u0017\"!\u0002(%/");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method2.setAccessible(true);
                signingCertificateHistory = ((PackageInfo) method2.invoke(packageManager, objArr2)).signatures;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (signingCertificateHistory == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(signingCertificateHistory);
    }

    public static boolean hasSignatures(PackageManager packageManager, String str, Map<byte[], Integer> map, boolean z2) throws Throwable {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> setKeySet = map.keySet();
        for (byte[] bArr2 : setKeySet) {
            if (bArr2 == null) {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
            Integer num = map.get(bArr2);
            if (num == null) {
                throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
            }
            int iIntValue = num.intValue();
            if (iIntValue != 0 && iIntValue != 1) {
                throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        List<Signature> signatures = getSignatures(packageManager, str);
        if (!z2 && Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr3 : setKeySet) {
                if (!Api28Impl.hasSigningCertificate(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (signatures.size() != 0 && map.size() <= signatures.size() && (!z2 || map.size() == signatures.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[signatures.size()][];
                for (int i2 = 0; i2 < signatures.size(); i2++) {
                    bArr[i2] = computeSHA256Digest(signatures.get(i2).toByteArray());
                }
            } else {
                bArr = null;
            }
            Iterator<byte[]> it = setKeySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int iIntValue2 = num2.intValue();
                if (iIntValue2 != 0) {
                    if (iIntValue2 == 1) {
                        if (!byteArrayContains(bArr, next)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    }
                } else if (!signatures.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static boolean byteArrayContains(byte[][] bArr, byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] computeSHA256Digest(byte[] bArr) {
        try {
            return MessageDigest.getInstance(McElieceCCA2ParameterSpec.DEFAULT_MD).digest(bArr);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e2);
        }
    }

    private PackageInfoCompat() {
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        static boolean hasSigningCertificate(PackageManager packageManager, String str, byte[] bArr, int i2) throws Throwable {
            Class<?> cls = Class.forName(C1561oA.od("&2'40)#k +).\u001e&+c%!`\u0002\u0012\u0013\u001a\u000f\u0014\u0011w\u000b\u0017\t\u000e\u000b\u0017", (short) (C1607wl.Xd() ^ 1386)));
            Class<?>[] clsArr = {Class.forName(C1561oA.Kd("*\"8$q1'5/v\u001d?>6<6", (short) (C1580rY.Xd() ^ (-19330)))), byte[].class, Integer.TYPE};
            Object[] objArr = {str, bArr, Integer.valueOf(i2)};
            Method method = cls.getMethod(Wg.Zd("E8F=G\u001d\u007fr\u000b{3-.G8\r\u00045ny<", (short) (C1607wl.Xd() ^ 23496), (short) (C1607wl.Xd() ^ 28535)), clsArr);
            try {
                method.setAccessible(true);
                return ((Boolean) method.invoke(packageManager, objArr)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static boolean hasMultipleSigners(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        static Signature[] getApkContentsSigners(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        static Signature[] getSigningCertificateHistory(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        static long getLongVersionCode(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }
}
