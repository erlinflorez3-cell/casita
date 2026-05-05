package com.facebook.soloader.recovery;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.soloader.BackupSoSource;
import com.facebook.soloader.DirectorySoSource;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.SoLoaderULError;
import com.facebook.soloader.SoSource;
import com.facebook.soloader.UnpackingSoSource;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
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
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class CheckOnDiskStateDataApp implements RecoveryStrategy {
    private final Context mContext;

    public CheckOnDiskStateDataApp(Context context) {
        this.mContext = context;
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) throws Throwable {
        Object obj;
        if (!(unsatisfiedLinkError instanceof SoLoaderULError)) {
            return false;
        }
        String strXd = ZO.xd("nH^$%\fk\u001dV K) NK\u0003A*{n\u0012$l\u001a\u0001\u000b-\u0012EuE`&l\u001b\r\u0012", (short) (Od.Xd() ^ (-20086)), (short) (Od.Xd() ^ (-4554)));
        String strUd = C1626yg.Ud("OD0\bkC\u000fZ", (short) (Od.Xd() ^ (-9417)), (short) (Od.Xd() ^ (-22225)));
        LogUtil.e(strUd, strXd);
        Context context = this.mContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("8t\\FQuV\u0007t/*X}~#\u00018\u00016\u0016/\u0019E", (short) (ZN.Xd() ^ 4620))).getMethod(EO.Od("H\u0016r\u001bJw\u001c@\u001a7D_1.\u0005K\u0011\u0014", (short) (Od.Xd() ^ (-10983))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strQd = C1561oA.Qd("DPERNGA\n>IGL<DI\u0002C?~\u0011?>95.+=164\u000e2)1", (short) (OY.Xd() ^ 17905));
            String strZd = C1593ug.zd("eYmcqaIgarbt|Hnx", (short) (C1633zX.Xd() ^ (-5369)), (short) (C1633zX.Xd() ^ (-27033)));
            try {
                Class<?> cls = Class.forName(strQd);
                Field field = 1 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            File file = new File((String) obj);
            if (!file.exists()) {
                short sXd = (short) (FB.Xd() ^ 4466);
                int[] iArr = new int["Oasgsa\u001bfbZiWgm\u0013VZbTQa[]c\t".length()];
                QB qb = new QB("Oasgsa\u001bfbZiWgm\u0013VZbTQa[]c\t");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                LogUtil.e(strUd, new String(iArr, 0, i2) + file + C1561oA.Kd("s9E<KxHJP|CWITV\u000f\u0004J^P\\RXR\f\u001cRPdR!Tde\u0016i]\\iqaow-", (short) (OY.Xd() ^ 9082)));
                return false;
            }
            ArrayList arrayList = new ArrayList();
            int length = soSourceArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                SoSource soSource = soSourceArr[i3];
                if (soSource instanceof BackupSoSource) {
                    BackupSoSource backupSoSource = (BackupSoSource) soSource;
                    try {
                        for (UnpackingSoSource.Dso dso : backupSoSource.getDsosBaseApk()) {
                            if (!new File(file, dso.name).exists()) {
                                arrayList.add(dso.name);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            LogUtil.e(strUd, Wg.Zd("A$(\u0006R]11\u0012\u0019h8s\u0013#~\u000eE\\'n\u0007Ve3v", (short) (ZN.Xd() ^ 4675), (short) (ZN.Xd() ^ 14768)) + file);
                            return false;
                        }
                        StringBuilder sbAppend = new StringBuilder().append(C1561oA.Xd("C`klcic\u001djhbscumjy'n{yx,", (short) (C1580rY.Xd() ^ (-9613)))).append(file);
                        short sXd2 = (short) (C1607wl.Xd() ^ 18499);
                        int[] iArr2 = new int["hO".length()];
                        QB qb2 = new QB("hO");
                        int i4 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i4] = xuXd2.fK((sXd2 ^ i4) + xuXd2.CK(iKK2));
                            i4++;
                        }
                        LogUtil.e(strUd, sbAppend.append(new String(iArr2, 0, i4)).append(arrayList.toString()).append(Qg.kd("bU,\u001d\u001f\u001eP\"$\u001cL\u001c\u001d\u000f\u0019\t\u0019\u000bD\u0013\u0011A\u0015\u0002\u0004=~|}\u0005\u000e\b6\t\u00043\u0006\u0001\u0006\u0002qr", (short) (C1580rY.Xd() ^ (-30838)), (short) (C1580rY.Xd() ^ (-22510)))).toString());
                        backupSoSource.prepare(0);
                    } catch (Exception e2) {
                        short sXd3 = (short) (OY.Xd() ^ 31003);
                        short sXd4 = (short) (OY.Xd() ^ 14094);
                        int[] iArr3 = new int["\u0006.\"-2*/\u001f+\u001d\u001bU\u0016\"R\u0017)\u0013\u0014\u001e!\u0015\u001a\u0018H\u001f\u000f\u000f\u0011\tB\u0014\u0006\u0003\u000e\u0014\u0002\u000e\u0004\b\u007f7|\b\u0004\u00012@tp\u0003n;lzy(mgnpxtf ".length()];
                        QB qb3 = new QB("\u0006.\"-2*/\u001f+\u001d\u001bU\u0016\"R\u0017)\u0013\u0014\u001e!\u0015\u001a\u0018H\u001f\u000f\u000f\u0011\tB\u0014\u0006\u0003\u000e\u0014\u0002\u000e\u0004\b\u007f7|\b\u0004\u00012@tp\u0003n;lzy(mgnpxtf ");
                        int i5 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i5] = xuXd3.fK(sXd3 + i5 + xuXd3.CK(iKK3) + sXd4);
                            i5++;
                        }
                        LogUtil.e(strUd, new String(iArr3, 0, i5), e2);
                        return false;
                    }
                } else {
                    i3++;
                }
            }
            for (SoSource soSource2 : soSourceArr) {
                if ((soSource2 instanceof DirectorySoSource) && !(soSource2 instanceof BackupSoSource)) {
                    ((DirectorySoSource) soSource2).setExplicitDependencyResolution();
                }
            }
            LogUtil.e(strUd, C1561oA.ud("8YFEFSRDRHGSxJ<9DJ8D64n4?;8iw,(:&r$21_#'0'Z \u001a!#+'\u0019`", (short) (C1499aX.Xd() ^ (-27538))));
            return true;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
