package com.facebook.soloader.recovery;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultRecoveryStrategyFactory implements RecoveryStrategyFactory {
    private final BaseApkPathHistory mBaseApkPathHistory;
    private final Context mContext;
    private final int mRecoveryFlags;

    public DefaultRecoveryStrategyFactory(Context context, int i2) throws Throwable {
        Object obj;
        this.mContext = context;
        this.mRecoveryFlags = i2;
        BaseApkPathHistory baseApkPathHistory = new BaseApkPathHistory(5);
        this.mBaseApkPathHistory = baseApkPathHistory;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("DRIXNIE\u0010>KKR<FM\b\u0016CCJ4HE", (short) (C1607wl.Xd() ^ 230))).getMethod(C1561oA.Yd("$#3\u000112/-(';188\u0014:3=", (short) (C1499aX.Xd() ^ (-18471))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strQd = Xg.qd("{\n\u0001\u0010\u000e\t\u0005O\u0006\u0013\u0013\u001a\f\u0016\u001dW\u001b\u0019Zn\u001f \u001d\u001b\u0016\u0015)\u001f&&\u0002(!+", (short) (OY.Xd() ^ 32281), (short) (OY.Xd() ^ 21733));
            String strWd = Jg.Wd("\u001eY\u0005CRe\u001aYo", (short) (ZN.Xd() ^ 31957), (short) (ZN.Xd() ^ 16549));
            try {
                Class<?> cls = Class.forName(strQd);
                Field field = 1 != 0 ? cls.getField(strWd) : cls.getDeclaredField(strWd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            baseApkPathHistory.recordPathIfNew((String) obj);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategyFactory
    public RecoveryStrategy get() {
        return new CompositeRecoveryStrategy(new DetectDataAppMove(this.mContext, this.mBaseApkPathHistory), new CheckBaseApkExists(this.mContext, this.mBaseApkPathHistory), new WaitForAsyncInit(), new CheckOnDiskStateDataApp(this.mContext), new ReunpackBackupSoSources(this.mRecoveryFlags), new CheckOnDiskStateDataData(), new ReunpackNonBackupSoSources(), new WaitForAsyncInit());
    }
}
