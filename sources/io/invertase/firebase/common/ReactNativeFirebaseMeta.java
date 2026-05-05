package io.invertase.firebase.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.ReactNativeFirebaseApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseMeta {
    private static final String META_PREFIX = "rnfirebase_";
    private static final String TAG = "RNFBMetaProvider";
    private static ReactNativeFirebaseMeta sharedInstance = new ReactNativeFirebaseMeta();

    private Bundle getMetaData() throws Throwable {
        try {
            Context applicationContext = ReactNativeFirebaseApp.getApplicationContext();
            Class<?> cls = Class.forName(Qg.kd("dpernga*^igl\\di\"6a_dTfa", (short) (C1580rY.Xd() ^ (-5780)), (short) (C1580rY.Xd() ^ (-11454))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (OY.Xd() ^ 13242);
            short sXd2 = (short) (OY.Xd() ^ 4929);
            int[] iArr = new int["=:H#34;052\u0019,8*/,8".length()];
            QB qb = new QB("=:H#34;052\u0019,8*/,8");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(applicationContext, objArr);
                if (packageManager == null) {
                    return null;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.ud("q}r\u007f{tn7kvtyiqv/Cnlqasn", (short) (Od.Xd() ^ (-24691)))).getMethod(C1561oA.yd("ZYiFPS\\SbaK_d]", (short) (Od.Xd() ^ (-7471))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(applicationContext, objArr2);
                    Class<?> cls2 = Class.forName(C1561oA.Yd("#1(750,v-::A3=D~B@\u0002%7:C:A@)>L@GFT", (short) (OY.Xd() ^ 3167)));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(Xg.qd("\u0005|\u0013~L\f\u0002\u0010\nQw\u001a\u0019\u0011\u0017\u0011", (short) (C1633zX.Xd() ^ (-14782)), (short) (C1633zX.Xd() ^ (-26259))));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 128};
                    Method method3 = cls2.getMethod(Jg.Wd("O[za`~\u000b\"k\u0006+k\u0010\u001b\u0018\t!4", (short) (FB.Xd() ^ 27730), (short) (FB.Xd() ^ 19194)), clsArr2);
                    try {
                        method3.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method3.invoke(packageManager, objArr3);
                        if (applicationInfo != null) {
                            return applicationInfo.metaData;
                        }
                        return null;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static ReactNativeFirebaseMeta getSharedInstance() {
        return sharedInstance;
    }

    public boolean contains(String str) throws Throwable {
        Bundle metaData = getMetaData();
        if (metaData == null) {
            return false;
        }
        return metaData.containsKey(META_PREFIX + str);
    }

    public WritableMap getAll() throws Throwable {
        Bundle metaData = getMetaData();
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (metaData == null) {
            return writableMapCreateMap;
        }
        for (String str : metaData.keySet()) {
            if (str.startsWith(META_PREFIX)) {
                Object obj = metaData.get(str);
                if (obj == null) {
                    writableMapCreateMap.putNull(str);
                } else if (obj instanceof String) {
                    writableMapCreateMap.putString(str, (String) obj);
                } else if (obj instanceof Boolean) {
                    writableMapCreateMap.putBoolean(str, ((Boolean) obj).booleanValue());
                }
            }
        }
        return writableMapCreateMap;
    }

    public boolean getBooleanValue(String str, boolean z2) {
        Bundle metaData = getMetaData();
        return metaData == null ? z2 : metaData.getBoolean(META_PREFIX + str, z2);
    }

    public String getStringValue(String str, String str2) throws Throwable {
        Bundle metaData = getMetaData();
        return metaData == null ? str2 : metaData.getString(META_PREFIX + str, str2);
    }
}
