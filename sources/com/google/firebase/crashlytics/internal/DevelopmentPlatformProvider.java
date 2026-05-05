package com.google.firebase.crashlytics.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
public class DevelopmentPlatformProvider {
    private static final String FLUTTER_ASSET_FILE = "flutter_assets/NOTICES.Z";
    private static final String FLUTTER_PLATFORM = "Flutter";
    private static final String UNITY_PLATFORM = "Unity";
    private static final String UNITY_VERSION_FIELD = "com.google.firebase.crashlytics.unity_version";
    private final Context context;
    private DevelopmentPlatform developmentPlatform = null;

    private class DevelopmentPlatform {
        private final String developmentPlatform;
        private final String developmentPlatformVersion;

        private DevelopmentPlatform() throws Throwable {
            Context context = DevelopmentPlatformProvider.this.context;
            short sXd = (short) (Od.Xd() ^ (-29975));
            int[] iArr = new int["itq1ipofjb*ack]YWhY!UcQbVYe_SL[\u0015[SMW[@VDPPEJH".length()];
            QB qb = new QB("itq1ipofjb*ack]YWhY!UcQbVYe_SL[\u0015[SMW[@VDPPEJH");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(context, new String(iArr, 0, i2), C1561oA.yd("ced\\ZT", (short) (C1633zX.Xd() ^ (-30201))));
            if (resourcesIdentifier == 0) {
                if (!DevelopmentPlatformProvider.this.assetFileExists(C1626yg.Ud("\u001b\u0007\u0003]\u0003\u007f\u000f,J\bEVk\b-\u000b7:\u0019/.%I\\", (short) (C1499aX.Xd() ^ (-15168)), (short) (C1499aX.Xd() ^ (-20451))))) {
                    this.developmentPlatform = null;
                    this.developmentPlatformVersion = null;
                    return;
                } else {
                    this.developmentPlatform = Ig.wd("\u0015\u000beH`\r2", (short) (C1499aX.Xd() ^ (-5621)));
                    this.developmentPlatformVersion = null;
                    Logger.getLogger().v(EO.Od("up\u0010\u001e}&\u0013o\u001f[c)dV/\u001d[b>Q:\\H\u000b79>\u0010tC \b", (short) (C1499aX.Xd() ^ (-714))));
                    return;
                }
            }
            this.developmentPlatform = C1561oA.Yd("Oieqw", (short) (C1633zX.Xd() ^ (-1422)));
            Context context2 = DevelopmentPlatformProvider.this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Xg.qd("\u0017%\u001c+)$ j!..5'18r\t66=/C@", (short) (C1580rY.Xd() ^ (-10132)), (short) (C1580rY.Xd() ^ (-12782)))).getMethod(Jg.Wd("\u0014di?\t+\u001d\u001bM\u0016\n\u0010", (short) (C1607wl.Xd() ^ 32648), (short) (C1607wl.Xd() ^ 30694)), new Class[0]);
            try {
                method.setAccessible(true);
                String string = ((Resources) method.invoke(context2, objArr)).getString(resourcesIdentifier);
                this.developmentPlatformVersion = string;
                Logger.getLogger().v(ZO.xd("\u0006\u001f\u0016\u0010N{@5/\u0016\u0005\u0019'1GHDcoYD_K\u0003]", (short) (OY.Xd() ^ 8754), (short) (OY.Xd() ^ 8009)) + string);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* synthetic */ DevelopmentPlatform(DevelopmentPlatformProvider developmentPlatformProvider, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.context = context;
    }

    public boolean assetFileExists(String str) throws Throwable {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("myn{wpj3grpuemr+?jhm]oj", (short) (C1633zX.Xd() ^ (-31371)))).getMethod(C1593ug.zd("ihxFyzm}}", (short) (C1633zX.Xd() ^ (-16029)), (short) (C1633zX.Xd() ^ (-17749))), new Class[0]);
        try {
            method.setAccessible(true);
            if (((AssetManager) method.invoke(context, objArr)) == null) {
                return false;
            }
            try {
                Context context2 = this.context;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.od("\u001d)\u001e+' \u001ab\u0017\" %\u0015\u001d\"Zn\u001a\u0018\u001d\r\u001f\u001a", (short) (C1633zX.Xd() ^ (-27060)))).getMethod(C1561oA.Kd("ts\u0004Q\u0005\u0006x\t\t", (short) (C1633zX.Xd() ^ (-5336))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    InputStream inputStreamOpen = ((AssetManager) method2.invoke(context2, objArr2)).open(str);
                    if (inputStreamOpen == null) {
                        return true;
                    }
                    inputStreamOpen.close();
                    return true;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IOException unused) {
                return false;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private DevelopmentPlatform initDevelopmentPlatform() {
        if (this.developmentPlatform == null) {
            this.developmentPlatform = new DevelopmentPlatform();
        }
        return this.developmentPlatform;
    }

    public static boolean isUnity(Context context) {
        return CommonUtils.getResourcesIdentifier(context, UNITY_VERSION_FIELD, "string") != 0;
    }

    public String getDevelopmentPlatform() {
        return initDevelopmentPlatform().developmentPlatform;
    }

    public String getDevelopmentPlatformVersion() {
        return initDevelopmentPlatform().developmentPlatformVersion;
    }
}
