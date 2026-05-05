package com.google.android.gms.internal.gtm;

import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.android.gms.common.internal.Preconditions;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzob extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) throws Throwable {
        byte[] bArrZzb;
        String strZza;
        short sXd = (short) (Od.Xd() ^ (-28040));
        short sXd2 = (short) (Od.Xd() ^ (-31123));
        int[] iArr = new int["RmOd\u000f\u001fJX;\u0015T!\u0017\u0014P\u0010\u0015:QKXdh\u000bPQA,VY".length()];
        QB qb = new QB("RmOd\u000f\u001fJX;\u0015T!\u0017\u0014P\u0010\u0015:QKXdh\u000bPQA,VY");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length > 0);
        String strZzd = zzjx.zzd(zzqzVarArr[0]);
        String strWd = Ig.wd("d\u0006Wn", (short) (OY.Xd() ^ PhotoshopDirectory.TAG_AUTO_SAVE_FILE_PATH));
        String strZzd2 = length > 1 ? zzjx.zzd(zzqzVarArr[1]) : strWd;
        String strOd = EO.Od("+Y]+'y", (short) (ZN.Xd() ^ 13749));
        int i3 = 2;
        String strZzd3 = length > 2 ? zzjx.zzd(zzqzVarArr[2]) : strOd;
        if (length > 3 && zzjx.zzg(zzqzVarArr[3])) {
            i3 = 3;
        }
        try {
            boolean zEquals = strWd.equals(strZzd2);
            String strQd = C1561oA.Qd("igxi96vrk", (short) (Od.Xd() ^ (-32683)));
            String strZd = C1593ug.zd("33F9\u000b\n", (short) (Od.Xd() ^ (-2811)), (short) (Od.Xd() ^ (-13656)));
            if (zEquals) {
                bArrZzb = strZzd.getBytes();
            } else if (strOd.equals(strZzd2)) {
                bArrZzb = zzgh.zzb(strZzd);
            } else if (strZd.equals(strZzd2)) {
                Class<?> cls = Class.forName(C1561oA.od("7C8EA:4|CA57w\u000b):+zw", (short) (OY.Xd() ^ 31064)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.Kd("H@VB\u0010OESM\u0015;]\\TZT", (short) (ZN.Xd() ^ 5608)));
                clsArr[1] = Integer.TYPE;
                Object[] objArr = {strZzd, Integer.valueOf(i3)};
                Method declaredMethod = cls.getDeclaredMethod(Wg.Zd("\u0018\u0010%(4,", (short) (C1499aX.Xd() ^ (-32012)), (short) (C1499aX.Xd() ^ (-8980))), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    bArrZzb = (byte[]) declaredMethod.invoke(null, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                if (!strQd.equals(strZzd2)) {
                    throw new UnsupportedOperationException(str + strZzd2);
                }
                int i4 = (-1) - (((-1) - i3) & ((-1) - 8));
                Class<?> cls2 = Class.forName(C1561oA.Xd("kyp\u007f}xt?\b\b}\u0002DYy\r\u007fQP", (short) (C1580rY.Xd() ^ (-5657))));
                Class<?>[] clsArr2 = new Class[2];
                clsArr2[0] = Class.forName(Wg.vd("rh\u0001j2ogsg-Uundld", (short) (OY.Xd() ^ 10842)));
                clsArr2[1] = Integer.TYPE;
                Object[] objArr2 = {strZzd, Integer.valueOf(i4)};
                Method declaredMethod2 = cls2.getDeclaredMethod(Qg.kd("MMJUII", (short) (C1607wl.Xd() ^ IDStepResponseCodes.STEP_RESULT_DOCUMENT_MAX_LOCAL_ATTEMPS), (short) (C1607wl.Xd() ^ LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE)), clsArr2);
                try {
                    declaredMethod2.setAccessible(true);
                    bArrZzb = (byte[]) declaredMethod2.invoke(null, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            if (strOd.equals(strZzd3)) {
                strZza = zzgh.zza(bArrZzb);
            } else if (strZd.equals(strZzd3)) {
                Class<?> cls3 = Class.forName(hg.Vd("myn{wpj3ywkm.A_pa1.", (short) (OY.Xd() ^ 29345), (short) (OY.Xd() ^ 12044)));
                Class<?>[] clsArr3 = {byte[].class, Integer.TYPE};
                Object[] objArr3 = {bArrZzb, Integer.valueOf(i3)};
                Method declaredMethod3 = cls3.getDeclaredMethod(C1561oA.ud("\u0010\u0018\f\u0017\u000b\u000bx\u0013u\u0016\u0013\t\r\u0005", (short) (C1499aX.Xd() ^ (-6731))), clsArr3);
                try {
                    declaredMethod3.setAccessible(true);
                    strZza = (String) declaredMethod3.invoke(null, objArr3);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } else {
                if (!strQd.equals(strZzd3)) {
                    throw new RuntimeException(Xg.qd("\t3)6,.\u0004jA;9=?H@rCJJGMMyAKOK@T\u001b\u0002", (short) (Od.Xd() ^ (-2956)), (short) (Od.Xd() ^ (-4096))).concat(String.valueOf(strZzd3)));
                }
                Class<?> cls4 = Class.forName(C1561oA.yd("|\t\u0002\u000f\u0007\u007f}F\u0019\u0017\u000f\u0011M`\u0003\u0014p@A", (short) (OY.Xd() ^ 6685)));
                Class<?>[] clsArr4 = {byte[].class, Integer.TYPE};
                Object[] objArr4 = {bArrZzb, Integer.valueOf(i3 | 8)};
                short sXd3 = (short) (OY.Xd() ^ 30479);
                int[] iArr2 = new int[" * -#%\u00151\u001687/5/".length()];
                QB qb2 = new QB(" * -#%\u00151\u001687/5/");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i5));
                    i5++;
                }
                Method declaredMethod4 = cls4.getDeclaredMethod(new String(iArr2, 0, i5), clsArr4);
                try {
                    declaredMethod4.setAccessible(true);
                    strZza = (String) declaredMethod4.invoke(null, objArr4);
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            }
            return new zzrk(strZza);
        } catch (IllegalArgumentException unused) {
            throw new RuntimeException(Jg.Wd("AU(\u0013eCu:qW=\u0007oI\"<SY9\u001dy\u001c", (short) (C1580rY.Xd() ^ (-16592)), (short) (C1580rY.Xd() ^ (-7010))).concat(String.valueOf(strZzd2)));
        }
    }
}
