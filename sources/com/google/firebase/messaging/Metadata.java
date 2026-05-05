package com.google.firebase.messaging;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.dynatrace.android.agent.Global;
import com.google.firebase.FirebaseApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
class Metadata {
    private static final String ACTION_C2DM_REGISTER = "com.google.android.c2dm.intent.REGISTER";
    private static final String ACTION_IID_TOKEN_REQUEST = "com.google.iid.TOKEN_REQUEST";
    static final int GMSCORE_NOT_FOUND = 0;
    private static final String GMSCORE_SEND_PERMISSION = "com.google.android.c2dm.permission.SEND";
    static final String GMS_PACKAGE = "com.google.android.gms";
    static final int IID_VIA_RECEIVER = 2;
    static final int IID_VIA_SERVICE = 1;
    private String appVersionCode;
    private String appVersionName;
    private final Context context;
    private int gmsVersionCode;
    private int iidImplementation = 0;

    Metadata(Context context) {
        this.context = context;
    }

    static String getDefaultSenderId(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(Global.COLON);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo getPackageInfo(String str) throws Throwable {
        try {
            Context context = this.context;
            short sXd = (short) (C1633zX.Xd() ^ (-10541));
            int[] iArr = new int["zU[\u0003\u0013J\u001b^C|w\">WG$VzT4cM%".length()];
            QB qb = new QB("zU[\u0003\u0013J\u001b^C|w\">WG$VzT4cM%");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("2/=\u0018()0%*'\u000e!-\u001f$!-", (short) (FB.Xd() ^ 8492)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls = Class.forName(C1593ug.zd("\u0011\u001f\u0016%#\u001e\u001ad\u001b((/!+2l0.o\u0013%(1(/.\u0017,:.54B", (short) (C1607wl.Xd() ^ 21348), (short) (C1607wl.Xd() ^ 14078)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.od("\u0017\r!\u000bV\u0014\b\u0014\fQu\u0016\u0013\t\r\u0005", (short) (C1607wl.Xd() ^ 30795)));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {str, 0};
                Method method2 = cls.getMethod(C1561oA.Kd("dcsPbenelkPvoy", (short) (FB.Xd() ^ 8168)), clsArr);
                try {
                    method2.setAccessible(true);
                    return (PackageInfo) method2.invoke(packageManager, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException e4) {
            String str2 = Wg.Zd("\u000b\u0003\\f9\rm\u001e\u000e\"C}\u0005Q\u0007<b@\rvW=)", (short) (C1607wl.Xd() ^ 9866), (short) (C1607wl.Xd() ^ 12988)) + e4;
            C1561oA.Xd("!EOCAATG0IXYHORXR", (short) (OY.Xd() ^ 7878));
            return null;
        }
    }

    private synchronized void populateAppVersionInfo() {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("AMBOSLF\u000f;FDIAIN\u0007\u0013><A9KF", (short) (C1607wl.Xd() ^ 3646))).getMethod(Qg.kd("\u001e\u001b)\u0004\u0014\u0015\u001c\u0011\u0016\u0013z\r\u0018\u000f", (short) (FB.Xd() ^ 27893), (short) (FB.Xd() ^ 6050)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageInfo packageInfo = getPackageInfo((String) method.invoke(context, objArr));
            if (packageInfo != null) {
                this.appVersionCode = Integer.toString(packageInfo.versionCode);
                this.appVersionName = packageInfo.versionName;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    synchronized String getAppVersionCode() {
        if (this.appVersionCode == null) {
            populateAppVersionInfo();
        }
        return this.appVersionCode;
    }

    synchronized String getAppVersionName() {
        if (this.appVersionName == null) {
            populateAppVersionInfo();
        }
        return this.appVersionName;
    }

    synchronized int getGmsVersionCode() {
        PackageInfo packageInfo;
        if (this.gmsVersionCode == 0 && (packageInfo = getPackageInfo("com.google.android.gms")) != null) {
            this.gmsVersionCode = packageInfo.versionCode;
        }
        return this.gmsVersionCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x025d A[Catch: all -> 0x0342, LOOP:3: B:130:0x0257->B:132:0x025d, LOOP_END, TryCatch #0 {, blocks: (B:90:0x0001, B:94:0x0007, B:95:0x003c, B:96:0x0043, B:97:0x005b, B:99:0x0061, B:100:0x0079, B:101:0x0108, B:102:0x010f, B:104:0x0119, B:105:0x012f, B:107:0x0135, B:108:0x0157, B:111:0x016d, B:113:0x0174, B:114:0x01fa, B:116:0x0200, B:117:0x0219, B:118:0x0224, B:119:0x022b, B:121:0x022f, B:123:0x0235, B:127:0x023a, B:128:0x023e, B:129:0x023f, B:130:0x0257, B:132:0x025d, B:133:0x0275, B:134:0x02ee, B:135:0x02f5, B:137:0x02fa, B:139:0x0300, B:142:0x0304, B:144:0x0326, B:145:0x0328, B:146:0x032b, B:150:0x0331, B:151:0x0335, B:153:0x0337, B:154:0x033b, B:156:0x033d, B:157:0x0341), top: B:161:0x0001, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0326 A[Catch: all -> 0x0342, TryCatch #0 {, blocks: (B:90:0x0001, B:94:0x0007, B:95:0x003c, B:96:0x0043, B:97:0x005b, B:99:0x0061, B:100:0x0079, B:101:0x0108, B:102:0x010f, B:104:0x0119, B:105:0x012f, B:107:0x0135, B:108:0x0157, B:111:0x016d, B:113:0x0174, B:114:0x01fa, B:116:0x0200, B:117:0x0219, B:118:0x0224, B:119:0x022b, B:121:0x022f, B:123:0x0235, B:127:0x023a, B:128:0x023e, B:129:0x023f, B:130:0x0257, B:132:0x025d, B:133:0x0275, B:134:0x02ee, B:135:0x02f5, B:137:0x02fa, B:139:0x0300, B:142:0x0304, B:144:0x0326, B:145:0x0328, B:146:0x032b, B:150:0x0331, B:151:0x0335, B:153:0x0337, B:154:0x033b, B:156:0x033d, B:157:0x0341), top: B:161:0x0001, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032b A[Catch: all -> 0x0342, TRY_LEAVE, TryCatch #0 {, blocks: (B:90:0x0001, B:94:0x0007, B:95:0x003c, B:96:0x0043, B:97:0x005b, B:99:0x0061, B:100:0x0079, B:101:0x0108, B:102:0x010f, B:104:0x0119, B:105:0x012f, B:107:0x0135, B:108:0x0157, B:111:0x016d, B:113:0x0174, B:114:0x01fa, B:116:0x0200, B:117:0x0219, B:118:0x0224, B:119:0x022b, B:121:0x022f, B:123:0x0235, B:127:0x023a, B:128:0x023e, B:129:0x023f, B:130:0x0257, B:132:0x025d, B:133:0x0275, B:134:0x02ee, B:135:0x02f5, B:137:0x02fa, B:139:0x0300, B:142:0x0304, B:144:0x0326, B:145:0x0328, B:146:0x032b, B:150:0x0331, B:151:0x0335, B:153:0x0337, B:154:0x033b, B:156:0x033d, B:157:0x0341), top: B:161:0x0001, inners: #1, #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    synchronized int getIidImplementation() {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.Metadata.getIidImplementation():int");
    }

    boolean isGmscorePresent() {
        return getIidImplementation() != 0;
    }
}
