package io.invertase.firebase.common;

import android.content.Context;
import android.content.SharedPreferences;
import io.invertase.firebase.app.ReactNativeFirebaseApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class UniversalFirebasePreferences {
    private static final String PREFERENCES_FILE = "io.invertase.firebase";
    private static UniversalFirebasePreferences sharedInstance = new UniversalFirebasePreferences();
    private SharedPreferences preferences;

    private SharedPreferences getPreferences() throws Throwable {
        if (this.preferences == null) {
            Context applicationContext = ReactNativeFirebaseApp.getApplicationContext();
            Object[] objArr = {EO.Od("\b=i\u000e\u0013OZ H:N\u001a\rKB&Uh\u0010Zb", (short) (C1499aX.Xd() ^ (-9206))), 0};
            Method method = Class.forName(C1561oA.Qd("0<1>:3-u*538(05m\u0002-+0 2-", (short) (ZN.Xd() ^ 5986))).getMethod(C1561oA.od("jguSg_oa_Jk]][gYaUVc", (short) (C1633zX.Xd() ^ (-22642))), Class.forName(C1593ug.zd("\u0013\u000b!\rZ\u001a\u0010\u001e\u0018_\u0006('\u001f%\u001f", (short) (C1580rY.Xd() ^ (-14221)), (short) (C1580rY.Xd() ^ (-31843)))), Integer.TYPE);
            try {
                method.setAccessible(true);
                this.preferences = (SharedPreferences) method.invoke(applicationContext, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return this.preferences;
    }

    public static UniversalFirebasePreferences getSharedInstance() {
        return sharedInstance;
    }

    public void clearAll() {
        getPreferences().edit().clear().apply();
    }

    public boolean contains(String str) {
        return getPreferences().contains(str);
    }

    public boolean getBooleanValue(String str, boolean z2) {
        return getPreferences().getBoolean(str, z2);
    }

    public int getIntValue(String str, int i2) {
        return getPreferences().getInt(str, i2);
    }

    public long getLongValue(String str, long j2) {
        return getPreferences().getLong(str, j2);
    }

    public String getStringValue(String str, String str2) {
        return getPreferences().getString(str, str2);
    }

    public SharedPreferences.Editor remove(String str) {
        return getPreferences().edit().remove(str);
    }

    public void setBooleanValue(String str, boolean z2) {
        getPreferences().edit().putBoolean(str, z2).apply();
    }

    public void setIntValue(String str, int i2) {
        getPreferences().edit().putInt(str, i2).apply();
    }

    public void setLongValue(String str, long j2) {
        getPreferences().edit().putLong(str, j2).apply();
    }

    public void setStringValue(String str, String str2) {
        getPreferences().edit().putString(str, str2).apply();
    }
}
