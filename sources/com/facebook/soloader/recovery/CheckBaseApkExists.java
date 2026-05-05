package com.facebook.soloader.recovery;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.NoBaseApkException;
import com.facebook.soloader.SoSource;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class CheckBaseApkExists implements RecoveryStrategy {
    private static final String TAG = "soloader.recovery.CheckBaseApkExists";
    private final BaseApkPathHistory mBaseApkPathHistory;
    private final Context mContext;

    public CheckBaseApkExists(Context context, BaseApkPathHistory baseApkPathHistory) {
        this.mContext = context;
        this.mBaseApkPathHistory = baseApkPathHistory;
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) throws Throwable {
        Object obj;
        Context context = this.mContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("\\hanf_]&fqsxdlu.Ny{\u0001l~}", (short) (ZN.Xd() ^ 23114))).getMethod(Qg.kd("QN\\(VUPLEBTHMK%I@H", (short) (OY.Xd() ^ 18247), (short) (OY.Xd() ^ 27416)), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strVd = hg.Vd("\u0003\u000f\u0004\u0011\r\u0006\u007fH|\b\u0006\u000bz\u0003\b@\u0002}=O}|wsli{otrLpgo", (short) (C1633zX.Xd() ^ (-117)), (short) (C1633zX.Xd() ^ (-26618)));
            String strUd = C1561oA.ud("|w|xhiGks", (short) (OY.Xd() ^ 31590));
            try {
                Class<?> cls = Class.forName(strVd);
                Field field = 1 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            String str = (String) obj;
            if (new File(str).exists()) {
                LogUtil.w(C1561oA.Yd("zwuylpr\u0001=\u0003vu\u0003\u000bz\t\u0011F\\\u0003\u0001\u007f\t`\u0001\u0014\u0007c\u0014\u0010j\u001f\u0011\u001c\u001e\u001e", (short) (Od.Xd() ^ (-24683))), C1561oA.yd(".N]P\bJVR\u0004JZLSUQ\u0019{", (short) (C1633zX.Xd() ^ (-17067))) + str);
                return false;
            }
            StringBuilder sbAppend = new StringBuilder(Xg.qd("?_re!cso%jvm|*y{\u0002.t\tz\u0006\bN5", (short) (C1633zX.Xd() ^ (-26658)), (short) (C1633zX.Xd() ^ (-23564)))).append(str).append(Jg.Wd(":\u007f", (short) (Od.Xd() ^ (-25171)), (short) (Od.Xd() ^ (-14715))));
            this.mBaseApkPathHistory.report(sbAppend);
            throw new NoBaseApkException(sbAppend.toString(), unsatisfiedLinkError);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
