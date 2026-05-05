package yg;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class Tg {
    public static int Qd(byte[] bArr) {
        return Xd(Ug.wd()[C1499aX.Xd() ^ (-1134258098)]) & ((((bArr[(2141779917 ^ 296936135) ^ 1847203072] ^ bArr[(790562428 ^ 2044744592) ^ 1459574247]) ^ bArr[FB.Xd() ^ (733730642 ^ 1951709293)]) ^ bArr[(27578186 ^ 1524809839) ^ 1531318056]) ^ bArr[C1580rY.Xd() ^ (-831067153)]);
    }

    public static boolean Wd(float f2) {
        return f2 > C1603vu.Xd;
    }

    public static int Xd(byte b2) {
        return (-1) - (((-1) - b2) | ((-1) - 255));
    }

    public static void Yd(float f2) {
        if (f2 < 0.0f) {
            C1603vu.Xd = (C1603vu.Xd + f2) % Float.intBitsToFloat(ZN.Xd() ^ (1813468893 ^ 480077869));
        }
    }

    public static long od(ByteBuffer byteBuffer, int i2) {
        long j2 = byteBuffer.getInt(i2);
        long jKd = C1633zX.Kd() ^ 5236203346440840244L;
        return (j2 + jKd) - (j2 | jKd);
    }

    public static String[] vd(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    arrayList.add(new String(line.getBytes(), StandardCharsets.UTF_8));
                }
                bufferedReader.close();
                arrayList.trimToSize();
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                return strArr;
            } finally {
            }
        } catch (Exception e2) {
            return null;
        }
    }

    public static boolean wd() throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ ((221160938 ^ 1477913455) ^ (-1429864389)));
        int[] iArr = new int["ve-xZ".length()];
        QB qb = new QB("ve-xZ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        try {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Xg.qd("(5", (short) (C1607wl.Xd() ^ ((20478521 ^ 967204319) ^ 949880069)), (short) (C1607wl.Xd() ^ ((71979122 ^ 581405526) ^ 653125394))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                Context context = (Context) declaredMethod.invoke(null, objArr);
                Object[] objArr2 = new Object[0];
                Method method = Class.forName(Jg.Wd("|\r75ff \u000f9\u0014\t3cq)U K\u000f:\u001a\u0003s", (short) (ZN.Xd() ^ ((1661881656 ^ 1920648221) ^ 292848865)), (short) (ZN.Xd() ^ (743205949 ^ 743193489)))).getMethod(ZO.xd("(gy9/yE\u0002!\u001dKN\\hR\u0003l2", (short) (Od.Xd() ^ (745176443 ^ (-745171092))), (short) (Od.Xd() ^ (1728983537 ^ (-1728976420)))), new Class[0]);
                try {
                    method.setAccessible(true);
                    return Settings.Global.getInt((ContentResolver) method.invoke(context, objArr2), C1626yg.Ud("+mZA?d4\u001av8\u001e", (short) (ZN.Xd() ^ (1197013837 ^ 1197012101)), (short) (ZN.Xd() ^ ((19586226 ^ 613159003) ^ 631698159))), 0) == 1;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            return false;
        }
    }

    public static void yd(String str, String str2, Class cls) {
    }
}
