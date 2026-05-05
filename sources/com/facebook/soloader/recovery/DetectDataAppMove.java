package com.facebook.soloader.recovery;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.RecoverableSoSource;
import com.facebook.soloader.SoSource;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class DetectDataAppMove implements RecoveryStrategy {
    private static final String TAG = "soloader.recovery.DetectDataAppMove";
    private final BaseApkPathHistory mBaseApkPathHistory;
    private final Context mContext;
    private final int mInitialHistorySize;

    public DetectDataAppMove(Context context, BaseApkPathHistory baseApkPathHistory) {
        this.mContext = context;
        this.mBaseApkPathHistory = baseApkPathHistory;
        this.mInitialHistorySize = baseApkPathHistory.size();
    }

    private boolean detectMove() throws Throwable {
        String baseApkPath = getBaseApkPath();
        return new File(baseApkPath).exists() && this.mBaseApkPathHistory.recordPathIfNew(baseApkPath);
    }

    private String getBaseApkPath() throws Throwable {
        Object obj;
        Context context = this.mContext;
        short sXd = (short) (OY.Xd() ^ 6175);
        short sXd2 = (short) (OY.Xd() ^ 20910);
        int[] iArr = new int["z(N\u0001;\u0003j\u000b\n\u0015\f\bC-L7\u0018b4\u000f\u000b]\u0017".length()];
        QB qb = new QB("z(N\u0001;\u0003j\u000b\n\u0015\f\bC-L7\u0018b4\u000f\u000b]\u0017");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1626yg.Ud("\u0019!H6omq$\u0001@8\n\u001e\"K\u0015\"\u0014", (short) (C1499aX.Xd() ^ (-32614)), (short) (C1499aX.Xd() ^ (-255))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strWd = Ig.wd("z1\u0017\f\u000fcpXV50\u001a 15\u0012\b\rrLEn\u0007\u00069As\u001cBp](Fv", (short) (OY.Xd() ^ 15068));
            String strOd = EO.Od("]\u00015Z4\u0013EK#", (short) (C1580rY.Xd() ^ (-22767)));
            try {
                Class<?> cls = Class.forName(strWd);
                Field field = 1 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            return (String) obj;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void recoverSoSources(SoSource[] soSourceArr) {
        for (int i2 = 0; i2 < soSourceArr.length; i2++) {
            Object[] objArr = soSourceArr[i2];
            if (objArr instanceof RecoverableSoSource) {
                soSourceArr[i2] = ((RecoverableSoSource) objArr).recover(this.mContext);
            }
        }
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        if (detectMove()) {
            recoverSoSources(soSourceArr);
            return true;
        }
        if (this.mInitialHistorySize == this.mBaseApkPathHistory.size()) {
            return false;
        }
        LogUtil.w(TAG, "Context was updated (perhaps by another thread)");
        return true;
    }
}
