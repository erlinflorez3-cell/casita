package yg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yg.vK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1596vK extends TK {
    public final String Xd;

    public C1596vK(EnumC1506bu enumC1506bu, String str) {
        super(enumC1506bu);
        String strOd = EO.Od("\\\u001deU*", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849951282)));
        short sXd = (short) (FB.Xd() ^ (C1633zX.Xd() ^ (2082161890 ^ (-139071414))));
        int[] iArr = new int["cn".length()];
        QB qb = new QB("cn");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strOd);
            Field field = 1 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
            field.setAccessible(true);
            field.set(this, str);
        } catch (Throwable th) {
        }
    }

    @Override // yg.TK
    public void tK(LY ly) throws Throwable {
        Object obj;
        Object obj2;
        short sXd = (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207797346)));
        short sXd2 = (short) (C1580rY.Xd() ^ (1923228686 ^ (-1923231985)));
        int[] iArr = new int["\u0012\u0001Hog".length()];
        QB qb = new QB("\u0012\u0001Hog");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strOd = C1561oA.od(";F", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (1254773491 ^ (-1050366032)))));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 1 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        long jIntValue = ((Integer) obj).intValue();
        short sXd3 = (short) (OY.Xd() ^ (166388841 ^ 166365001));
        int[] iArr2 = new int["<+r\u0012 ".length()];
        QB qb2 = new QB("<+r\u0012 ");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
            i3++;
        }
        Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = {Long.TYPE};
        Object[] objArr = {Long.valueOf(jIntValue)};
        Method method = cls2.getMethod(Wg.Zd("SY", (short) (Od.Xd() ^ (413116863 ^ (-413121201))), (short) (Od.Xd() ^ (998251176 ^ (-998256689)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(ly, objArr);
            String strXd = C1561oA.Xd("\tw?\t^", (short) (C1633zX.Xd() ^ (1159232750 ^ (-1159201026))));
            short sXd4 = (short) (OY.Xd() ^ (1810747356 ^ 1810748216));
            int[] iArr3 = new int["$/".length()];
            QB qb3 = new QB("$/");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((sXd4 ^ i4) + xuXd3.CK(iKK3));
                i4++;
            }
            String str2 = new String(iArr3, 0, i4);
            try {
                Class<?> cls3 = Class.forName(strXd);
                Field field2 = 1 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                field2.setAccessible(true);
                obj2 = field2.get(this);
            } catch (Throwable th2) {
                obj2 = null;
            }
            String str3 = (String) obj2;
            short sXd5 = (short) (FB.Xd() ^ ((103492206 ^ 1832000205) ^ 1796806478));
            short sXd6 = (short) (FB.Xd() ^ (1764999131 ^ 1764989387));
            int[] iArr4 = new int["?,q\u000f\u001b".length()];
            QB qb4 = new QB("?,q\u000f\u001b");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(((sXd5 + i5) + xuXd4.CK(iKK4)) - sXd6);
                i5++;
            }
            Class<?> cls4 = Class.forName(new String(iArr4, 0, i5));
            Class<?>[] clsArr2 = new Class[1];
            short sXd7 = (short) (ZN.Xd() ^ (110092372 ^ 110072799));
            short sXd8 = (short) (ZN.Xd() ^ (1011180142 ^ 1011164493));
            int[] iArr5 = new int["\u000b\u0001\u0015~J\b{\b\u007fEi\n\u0007|\u0001x".length()];
            QB qb5 = new QB("\u000b\u0001\u0015~J\b{\b\u007fEi\n\u0007|\u0001x");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK(sXd7 + i6 + xuXd5.CK(iKK5) + sXd8);
                i6++;
            }
            clsArr2[0] = Class.forName(new String(iArr5, 0, i6));
            Object[] objArr2 = {str3};
            Method method2 = cls4.getMethod(C1561oA.ud("\u0015}", (short) (C1580rY.Xd() ^ ((901079678 ^ 1063761077) ^ (-181593539)))), clsArr2);
            try {
                method2.setAccessible(true);
                method2.invoke(ly, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
