package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import yg.C1499aX;
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

/* JADX INFO: loaded from: classes.dex */
public final class CameraValidator {
    private static final CameraSelector EXTERNAL_LENS_FACING = new CameraSelector.Builder().requireLensFacing(2).build();
    private static final String TAG = "CameraValidator";

    private CameraValidator() {
    }

    public static void validateCameras(Context context, CameraRepository cameraRepository, CameraSelector cameraSelector) throws Throwable {
        Integer lensFacing;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        IllegalArgumentException e2 = null;
        String strZd = Wg.Zd("Q__8\u0011nGqiF\u0014pp{s", (short) (ZN.Xd() ^ 7514), (short) (ZN.Xd() ^ 17813));
        if (i2 >= 34 && Api34Impl.getDeviceId(context) != 0) {
            LinkedHashSet<CameraInternal> cameras = cameraRepository.getCameras();
            if (cameras.isEmpty()) {
                throw new CameraIdListIncorrectException(hg.Vd("z\u001bJ\r\n\u0015\f\u0018\u0006\u0017B\u0003\u0017\u0001\b\n}}\u0007~", (short) (C1580rY.Xd() ^ (-17168)), (short) (C1580rY.Xd() ^ (-19778))), 0, null);
            }
            StringBuilder sbAppend = new StringBuilder(C1561oA.Xd("j~\t\f\u000ez\u0007;\u0001\u0003\u0015\t\u0004\u0007B\u001b\u000e\u001a\u000fGqmdK", (short) (C1633zX.Xd() ^ (-24768)))).append(Api34Impl.getDeviceId(context)).append(Wg.vd("P\u001a\u0014'L", (short) (C1607wl.Xd() ^ 7657))).append(cameras.size());
            short sXd = (short) (Od.Xd() ^ (-17747));
            short sXd2 = (short) (Od.Xd() ^ (-25389));
            int[] iArr = new int["`# +\".\u001c-fW\n!\u001e$#\u001b\u001f\u0017N$\u000e\u0018\u0014\u000e\n\u001c\u0010\u0015\u0013Q".length()];
            QB qb = new QB("`# +\".\u001c-fW\n!\u001e$#\u001b\u001f\u0017N$\u000e\u0018\u0014\u000e\n\u001c\u0010\u0015\u0013Q");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(((sXd + i4) + xuXd.CK(iKK)) - sXd2);
                i4++;
            }
            Logger.d(strZd, sbAppend.append(new String(iArr, 0, i4)).toString());
            return;
        }
        if (cameraSelector != null) {
            try {
                lensFacing = cameraSelector.getLensFacing();
                if (lensFacing == null) {
                    Logger.w(strZd, C1561oA.ud("Jj\u001ae]ei\u0015ZTUZ^V\u000eVZQY\tQU\u0006YLH\u0002BV@GI==F>\u001b8C:F4E$5;30@:<tg+53j7a7%1'#5Z.!\u001dV\u0019\u0016!\u0018$\u0012O\u001b\u0013\u001b\u001fJ\u0010\n\u000b\u0010\u0014\fQ", (short) (C1499aX.Xd() ^ (-9066))));
                    return;
                }
            } catch (IllegalStateException e3) {
                short sXd3 = (short) (C1633zX.Xd() ^ (-4741));
                int[] iArr2 = new int["b\u0002\u0010\u0011\u0013\u0019E\u000e\r\u001dI\u0017\u0011\u001b!Nuqt{\u0002{5|\n\b\u0007:\u0010\u0005\u0003>`vbkoegrlKjwp~n\u0002BU]WVhdh\u0017\\hh\"p\u001dtESKI]\u0005ZOM\tMLYR`Po=7AGt<8;BHB\n".length()];
                QB qb2 = new QB("b\u0002\u0010\u0011\u0013\u0019E\u000e\r\u001dI\u0017\u0011\u001b!Nuqt{\u0002{5|\n\b\u0007:\u0010\u0005\u0003>`vbkoegrlKjwp~n\u0002BU]WVhdh\u0017\\hh\"p\u001dtESKI]\u0005ZOM\tMLYR`Po=7AGt<8;BHB\n");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i5));
                    i5++;
                }
                Logger.e(strZd, new String(iArr2, 0, i5), e3);
                return;
            }
        } else {
            lensFacing = null;
        }
        short sXd4 = (short) (C1499aX.Xd() ^ (-2366));
        int[] iArr3 = new int["z\u000b\u0019\u0011\u000f#\u0014\u001a\u0014M\u0012\u0011\u001e\u0017%\u0015T\"\u001c&,Y!\u001d '-'`11c".length()];
        QB qb3 = new QB("z\u000b\u0019\u0011\u000f#\u0014\u001a\u0014M\u0012\u0011\u001e\u0017%\u0015T\"\u001c&,Y!\u001d '-'`11c");
        int i6 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i6] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd4 + sXd4) + sXd4) + i6));
            i6++;
        }
        StringBuilder sbAppend2 = new StringBuilder(new String(iArr3, 0, i6)).append(Build.DEVICE);
        short sXd5 = (short) (C1499aX.Xd() ^ (-5822));
        short sXd6 = (short) (C1499aX.Xd() ^ (-15490));
        int[] iArr4 = new int["ti71;A\u001514;A;\u001eDK=@?M\u0016|".length()];
        QB qb4 = new QB("ti71;A\u001514;A;\u001eDK=@?M\u0016|");
        int i7 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i7] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i7)) + sXd6);
            i7++;
        }
        Logger.d(strZd, sbAppend2.append(new String(iArr4, 0, i7)).append(lensFacing).toString());
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("7U K\u001dk\u0004\",Q%@mKf|f$\u007f\u001bhPa", (short) (Od.Xd() ^ (-4683)), (short) (Od.Xd() ^ (-6943)))).getMethod(ZO.xd("\r\u000bWpd\u000f\u001au\t[\u0017KpbJ@Y", (short) (FB.Xd() ^ 501), (short) (FB.Xd() ^ 6670)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            String strUd = C1626yg.Ud(";)8]z\u00134\u001fM\u000bDph[\u0001t*o.LF/z", (short) (ZN.Xd() ^ 21580), (short) (ZN.Xd() ^ 24440));
            try {
                Class<?> cls = Class.forName(Ig.wd(":\"iTPt\u0018\u0002styYvy$<%<E[)\fqg6$jE4\u0016\u0004^G", (short) (C1580rY.Xd() ^ (-2178))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(EO.Od("r\u0019^gf\u0002H0wPq3{\u0003Qn", (short) (C1499aX.Xd() ^ (-17060))));
                Object[] objArr2 = {strUd};
                Method method2 = cls.getMethod(C1561oA.Qd("]UfEjccSZ2PK]]YK", (short) (FB.Xd() ^ 21508)), clsArr);
                try {
                    method2.setAccessible(true);
                    if (((Boolean) method2.invoke(packageManager, objArr2)).booleanValue() && (cameraSelector == null || lensFacing.intValue() == 1)) {
                        CameraSelector.DEFAULT_BACK_CAMERA.select(cameraRepository.getCameras());
                        i3 = 1;
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (IllegalArgumentException e5) {
                e2 = e5;
                Logger.w(strZd, C1593ug.zd("\u001c;HAO?~,&06C+'*171J..1:\u0010gWe][_ZYmcjj\u001dd`imgg", (short) (C1633zX.Xd() ^ (-13539)), (short) (C1633zX.Xd() ^ (-23254))), e2);
            }
            String strOd = C1561oA.od("2>3@<5/w1)9*<%5'n# +\".\u001cg\u001f*&$)", (short) (C1580rY.Xd() ^ (-17838)));
            try {
                Class<?> cls2 = Class.forName(C1561oA.Kd("UcZigb^)_llseov1tr4Wilulsr[p~ryx\u0007", (short) (C1607wl.Xd() ^ 18068)));
                Class<?>[] clsArr2 = new Class[1];
                short sXd7 = (short) (Od.Xd() ^ (-13192));
                short sXd8 = (short) (Od.Xd() ^ (-3987));
                int[] iArr5 = new int["\fSvmHVYrx\u000eCr|AV]".length()];
                QB qb5 = new QB("\fSvmHVYrx\u000eCr|AV]");
                int i8 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i8] = xuXd5.fK(((i8 * sXd8) ^ sXd7) + xuXd5.CK(iKK5));
                    i8++;
                }
                clsArr2[0] = Class.forName(new String(iArr5, 0, i8));
                Object[] objArr3 = {strOd};
                short sXd9 = (short) (C1580rY.Xd() ^ (-8245));
                int[] iArr6 = new int["{u\ti\u0011\f\u000e\u007f\tb\u0003\u007f\u0014\u0016\u0014\b".length()];
                QB qb6 = new QB("{u\ti\u0011\f\u000e\u007f\tb\u0003\u007f\u0014\u0016\u0014\b");
                int i9 = 0;
                while (qb6.YK()) {
                    int iKK6 = qb6.KK();
                    Xu xuXd6 = Xu.Xd(iKK6);
                    iArr6[i9] = xuXd6.fK(xuXd6.CK(iKK6) - (sXd9 + i9));
                    i9++;
                }
                Method method3 = cls2.getMethod(new String(iArr6, 0, i9), clsArr2);
                try {
                    method3.setAccessible(true);
                    if (((Boolean) method3.invoke(packageManager, objArr3)).booleanValue() && (cameraSelector == null || lensFacing.intValue() == 0)) {
                        CameraSelector.DEFAULT_FRONT_CAMERA.select(cameraRepository.getCameras());
                        i3++;
                    }
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            } catch (IllegalArgumentException e7) {
                e2 = e7;
                short sXd10 = (short) (OY.Xd() ^ 18232);
                int[] iArr7 = new int["Rozq}k)TLTXcICDIme|bmigl7\rz\u0007|xzsPbV[Y\nOIPRJH".length()];
                QB qb7 = new QB("Rozq}k)TLTXcICDIme|bmigl7\rz\u0007|xzsPbV[Y\nOIPRJH");
                int i10 = 0;
                while (qb7.YK()) {
                    int iKK7 = qb7.KK();
                    Xu xuXd7 = Xu.Xd(iKK7);
                    iArr7[i10] = xuXd7.fK((sXd10 ^ i10) + xuXd7.CK(iKK7));
                    i10++;
                }
                Logger.w(strZd, new String(iArr7, 0, i10), e2);
            }
            try {
                EXTERNAL_LENS_FACING.select(cameraRepository.getCameras());
                Logger.d(strZd, Qg.kd("'OTLA{<y%\u001d%)4\u001a\u0014\u0015\u001a\u001e\u0016-\u0012$\u001f\u000f\u001b\u0016\b\u0012d'$/&2 ", (short) (C1607wl.Xd() ^ 19498), (short) (C1607wl.Xd() ^ 30110)));
                i3++;
            } catch (IllegalArgumentException unused) {
            }
            if (e2 == null) {
                return;
            }
            Logger.e(strZd, hg.Vd("Xu\u0001w\u0004q/Zrz~Pjkptl$ygsieg`]ochf\u0017\\V]_WU\u001c\u000fSeU^^RVN\u0006HEPGSAR\u0018|", (short) (C1607wl.Xd() ^ 10358), (short) (C1607wl.Xd() ^ 31400)) + cameraRepository.getCameras());
            throw new CameraIdListIncorrectException(C1561oA.ud("?qh\\YiYW\u0012TQ\\S_M\u000bWR[ZOSK\u0003HSOL}AAQC<=\u0005", (short) (ZN.Xd() ^ 27179)), i3, e2);
        } catch (InvocationTargetException e8) {
            throw e8.getCause();
        }
    }

    public static class CameraIdListIncorrectException extends Exception {
        private int mAvailableCameraCount;

        public CameraIdListIncorrectException(String str, int i2, Throwable th) {
            super(str, th);
            this.mAvailableCameraCount = i2;
        }

        public int getAvailableCameraCount() {
            return this.mAvailableCameraCount;
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        static int getDeviceId(Context context) throws Throwable {
            Class<?> cls = Class.forName(C1561oA.Xd("R`Wfd_[&\\iipbls.Dqqxj~{", (short) (ZN.Xd() ^ 5840)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1580rY.Xd() ^ (-26099));
            int[] iArr = new int["\u0016\u0013!o\u0018(\u001a\u0013\u001c~\u0019".length()];
            QB qb = new QB("\u0016\u0013!o\u0018(\u001a\u0013\u001c~\u0019");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                return ((Integer) method.invoke(context, objArr)).intValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
