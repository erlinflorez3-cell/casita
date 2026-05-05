package io.invertase.firebase.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.ReactNativeFirebaseApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebasePreferences {
    private static final String PREFERENCES_FILE = "io.invertase.firebase";
    private static ReactNativeFirebasePreferences sharedInstance = new ReactNativeFirebasePreferences();
    private SharedPreferences preferences;

    private SharedPreferences getPreferences() throws Throwable {
        if (this.preferences == null) {
            Context applicationContext = ReactNativeFirebaseApp.getApplicationContext();
            Object[] objArr = {ZO.xd("\u0012\u0010[)Rv\u0007B\u007fyh\u001eG\u000ebb0}\u001atL", (short) (Od.Xd() ^ (-29533)), (short) (Od.Xd() ^ (-4372))), 0};
            Method method = Class.forName(C1626yg.Ud("\u000edgh\u001cI;\u0018a\u0013/\n\u0005av9\rjh1\u0001u\u001b", (short) (ZN.Xd() ^ 3317), (short) (ZN.Xd() ^ 15761))).getMethod(EO.Od("0\\\u001c\u0015[!\u0018U\u0013-Kb\u000e\rD[\u0011\u000e:r", (short) (FB.Xd() ^ 15367)), Class.forName(Ig.wd("MstA\f\u000e)S\u00126[`0\u001bh\u0004", (short) (C1607wl.Xd() ^ 25768))), Integer.TYPE);
            try {
                method.setAccessible(true);
                this.preferences = (SharedPreferences) method.invoke(applicationContext, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return this.preferences;
    }

    public static ReactNativeFirebasePreferences getSharedInstance() {
        return sharedInstance;
    }

    public void clearAll() {
        getPreferences().edit().clear().apply();
    }

    public boolean contains(String str) {
        return getPreferences().contains(str);
    }

    public WritableMap getAll() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, ?> entry : getPreferences().getAll().entrySet()) {
            SharedUtils.mapPutValue(entry.getKey(), entry.getValue(), writableMapCreateMap);
        }
        return writableMapCreateMap;
    }

    public boolean getBooleanValue(String str, boolean z2) {
        return getPreferences().getBoolean(str, z2);
    }

    public long getLongValue(String str, long j2) {
        return getPreferences().getLong(str, j2);
    }

    public String getStringValue(String str, String str2) {
        return getPreferences().getString(str, str2);
    }

    public void setBooleanValue(String str, boolean z2) {
        getPreferences().edit().putBoolean(str, z2).apply();
    }

    public void setLongValue(String str, long j2) {
        getPreferences().edit().putLong(str, j2).apply();
    }

    public void setStringValue(String str, String str2) {
        getPreferences().edit().putString(str, str2).apply();
    }
}
