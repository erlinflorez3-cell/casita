package yg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yg.lX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1554lX extends TK {
    public final long Xd;

    public C1554lX(EnumC1506bu enumC1506bu, long j2) {
        super(enumC1506bu);
        String strZd = C1593ug.zd("F5|<)", (short) (C1607wl.Xd() ^ ((830287600 ^ 2032121510) ^ 1214420247)), (short) (C1607wl.Xd() ^ (1005201069 ^ 1005215190)));
        String strOd = C1561oA.od("\u007f\u000b", (short) (C1607wl.Xd() ^ ((630360046 ^ 964145871) ^ 484790727)));
        Long lValueOf = Long.valueOf(j2);
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 1 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            field.set(this, lValueOf);
        } catch (Throwable th) {
        }
    }

    @Override // yg.TK
    public void tK(LY ly) throws Throwable {
        Object obj;
        Object obj2;
        String strKd = C1561oA.Kd("\u001e\rT{s", (short) (FB.Xd() ^ (Od.Xd() ^ 1207798852)));
        String strZd = Wg.Zd("fE", (short) (ZN.Xd() ^ (895885788 ^ 895880545)), (short) (ZN.Xd() ^ (569051164 ^ 569078607)));
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 1 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        long jIntValue = ((Integer) obj).intValue();
        short sXd = (short) (FB.Xd() ^ (1963779686 ^ 1963754585));
        int[] iArr = new int[" \u000fVu\u0004".length()];
        QB qb = new QB(" \u000fVu\u0004");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Class<?> cls2 = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Long.TYPE};
        Object[] objArr = {Long.valueOf(jIntValue)};
        Method method = cls2.getMethod(Wg.vd("B<", (short) (C1499aX.Xd() ^ (32950992 ^ (-32941007)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(ly, objArr);
            short sXd2 = (short) (C1607wl.Xd() ^ (801034303 ^ 801032598));
            short sXd3 = (short) (C1607wl.Xd() ^ ((1310241675 ^ 1793373267) ^ 620516848));
            int[] iArr2 = new int["hU\u001bXC".length()];
            QB qb2 = new QB("hU\u001bXC");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                i3++;
            }
            String str = new String(iArr2, 0, i3);
            String strVd = hg.Vd("z\u0006", (short) (ZN.Xd() ^ ((1828461625 ^ 991044531) ^ 1475235601)), (short) (ZN.Xd() ^ (547379861 ^ 547369038)));
            try {
                Class<?> cls3 = Class.forName(str);
                Field field2 = 1 != 0 ? cls3.getField(strVd) : cls3.getDeclaredField(strVd);
                field2.setAccessible(true);
                obj2 = field2.get(this);
            } catch (Throwable th2) {
                obj2 = null;
            }
            long jLongValue = ((Long) obj2).longValue();
            Class<?> cls4 = Class.forName(C1561oA.ud("S@\u0006#/", (short) (C1580rY.Xd() ^ (134977141 ^ (-134993182)))));
            Class<?>[] clsArr2 = {Long.TYPE};
            Object[] objArr2 = {Long.valueOf(jLongValue)};
            Method method2 = cls4.getMethod(C1561oA.yd("aY", (short) (OY.Xd() ^ ((1829189681 ^ 1584825280) ^ 863088758))), clsArr2);
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
