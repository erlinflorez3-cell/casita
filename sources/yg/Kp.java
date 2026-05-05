package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class Kp extends Thread {
    long Kd;
    int Xd;
    String Yd;
    String ud;

    public Kp(int i2, String str, String str2) {
        this.Xd = i2;
        this.Yd = str;
        this.ud = str2;
    }

    private void Xd() throws Throwable {
        Method method;
        int i2;
        Object[] objArr;
        Method declaredMethod;
        try {
            try {
                this.Kd = Thread.currentThread().getId();
                int i3 = this.Xd;
                long j2 = this.Kd;
                this.Xd = (i3 << 7) ^ (659964872 ^ (-738072951));
                method = Class.forName(this.Yd).getMethod(this.ud, new Class[0]);
                this.Yd = "";
                this.ud = "";
                i2 = this.Xd;
                long j3 = this.Kd;
                long j4 = (5180685151635720152L ^ 7908032463519019491L) ^ 3052178389213230788L;
                int i4 = ((1916504406 ^ 1625637610) ^ 316028875) ^ ((int) ((j4 + j3) - (j4 | j3)));
                short sXd = (short) (C1633zX.Xd() ^ ((147505330 ^ 695758258) ^ (-565369400)));
                short sXd2 = (short) (C1633zX.Xd() ^ ((1409409549 ^ 1591483010) ^ (-182320697)));
                int[] iArr = new int["b'w>".length()];
                QB qb = new QB("b'w>");
                int i5 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i5] = xuXd.fK(xuXd.CK(iKK) - ((i5 * sXd2) ^ sXd));
                    i5++;
                }
                int i6 = Integer.parseInt(new String(iArr, 0, i5), (25982513 ^ 1074915329) ^ 1100848672);
                int i7 = Integer.parseInt(ZO.xd("!\t\r\f\u0012", (short) (C1499aX.Xd() ^ ((1879626765 ^ 1922378784) ^ (-43887687))), (short) (C1499aX.Xd() ^ ((1420572301 ^ 1794416074) ^ (-1045996545)))), ((i6 + 15) - (i6 | 15)) + 1) >> 18;
                int i8 = (i4 * i4) + i4 + (i7 * i4 * (i4 << 2)) + ((i4 << 2) * (i4 << i7));
                Class<?> cls = Class.forName(C1626yg.Ud("\u001d\u0007X`\u001c", (short) (Od.Xd() ^ ((273216981 ^ 1954703523) ^ (-1691005690))), (short) (Od.Xd() ^ (449874685 ^ (-449882320)))));
                Class<?>[] clsArr = {Integer.TYPE};
                objArr = new Object[]{Integer.valueOf(i8)};
                declaredMethod = cls.getDeclaredMethod(Ig.wd("7\u0015", (short) (ZN.Xd() ^ ((1049469195 ^ 2098731695) ^ 1133898581))), clsArr);
            } catch (InvocationTargetException e2) {
                C1597vN.Xd(e2.getTargetException());
            } catch (Exception e3) {
            }
            try {
                declaredMethod.setAccessible(true);
                this.Xd = i2 ^ ((Integer) declaredMethod.invoke(null, objArr)).intValue();
                method.invoke(null, new Object[0]);
                int i9 = this.Xd ^ ((117006259 ^ 117006127) << ((byte) (((458554175574279830L ^ 6388452678931269779L) ^ 6842457993975942666L) & this.Kd)));
                Class<?> cls2 = Class.forName(EO.Od("{\u0011\fG\u0017", (short) (C1580rY.Xd() ^ ((765873051 ^ 1027007878) ^ (-277912755)))));
                Class<?>[] clsArr2 = {Integer.TYPE};
                Object[] objArr2 = {Integer.valueOf(i9)};
                Method declaredMethod2 = cls2.getDeclaredMethod(C1561oA.Qd("8C", (short) (FB.Xd() ^ (203293731 ^ 203318922))), clsArr2);
                try {
                    declaredMethod2.setAccessible(true);
                    this.Xd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                    CX.Qd(this.Xd);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (Throwable th) {
            int i10 = this.Xd ^ (((1871966872 ^ 1595417347) ^ 814469383) << ((byte) ((-1) - (((-1) - (4800430828176689304L ^ 4800430828176689303L)) | ((-1) - this.Kd)))));
            Class<?> cls3 = Class.forName(C1593ug.zd("kZ\"8N", (short) (ZN.Xd() ^ (2064070241 ^ 2064057702)), (short) (ZN.Xd() ^ (1775828177 ^ 1775823786))));
            Class<?>[] clsArr3 = {Integer.TYPE};
            Object[] objArr3 = {Integer.valueOf(i10)};
            Method declaredMethod3 = cls3.getDeclaredMethod(C1561oA.od("+6", (short) (OY.Xd() ^ ((2010056211 ^ 747822056) ^ 1532855098))), clsArr3);
            try {
                declaredMethod3.setAccessible(true);
                this.Xd = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                CX.Qd(this.Xd);
                throw th;
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        Xd();
    }
}
