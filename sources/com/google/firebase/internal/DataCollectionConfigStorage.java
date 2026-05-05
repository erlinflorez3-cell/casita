package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.core.content.ContextCompat;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
public class DataCollectionConfigStorage {
    public static final String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";
    private static final String FIREBASE_APP_PREFS = "com.google.firebase.common.prefs:";
    private boolean dataCollectionDefaultEnabled;
    private final Context deviceProtectedContext;
    private final Publisher publisher;
    private final SharedPreferences sharedPreferences;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) throws Throwable {
        Context contextDirectBootSafe = directBootSafe(context);
        this.deviceProtectedContext = contextDirectBootSafe;
        String str2 = EO.Od("*pPqb\u001f3c\u000b\tGe\u0017\"%\t<pzzr[ok\u007f+\r\u001c8]r&\r", (short) (FB.Xd() ^ 5844)) + str;
        Class<?> cls = Class.forName(C1561oA.Qd(";G<IE>8\u00015@>C3;@x\r86;+=8", (short) (C1580rY.Xd() ^ (-2534))));
        Class<?>[] clsArr = {Class.forName(C1593ug.zd("\u000e\u0006\u001c\bU\u0015\u000b\u0019\u0013Z\u0001#\"\u001a \u001a", (short) (C1633zX.Xd() ^ (-15958)), (short) (C1633zX.Xd() ^ (-25164)))), Integer.TYPE};
        Object[] objArr = {str2, 0};
        short sXd = (short) (C1607wl.Xd() ^ 27357);
        int[] iArr = new int["qn|ZnfvhfQrddbn`h\\]j".length()];
        QB qb = new QB("qn|ZnfvhfQrddbn`h\\]j");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this.sharedPreferences = (SharedPreferences) method.invoke(contextDirectBootSafe, objArr);
            this.publisher = publisher;
            this.dataCollectionDefaultEnabled = readAutoDataCollectionEnabled();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static Context directBootSafe(Context context) {
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }

    private boolean readAutoDataCollectionEnabled() {
        return this.sharedPreferences.contains(DATA_COLLECTION_DEFAULT_ENABLED) ? this.sharedPreferences.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED, true) : readManifestDataCollectionEnabled();
    }

    private boolean readManifestDataCollectionEnabled() throws Throwable {
        String strKd = C1561oA.Kd("\u0006\n\u0014\b\u0006\u0006\u0019\f\u0007\r\u000b\u001f\r\f\u0011\u001e\u001c\u001d\u0017\u0016(\u001e%%\u0017\u001d\u001f!\u001d2*3\u001f&0$&1++", (short) (FB.Xd() ^ 29222));
        try {
            Context context = this.deviceProtectedContext;
            short sXd = (short) (C1580rY.Xd() ^ (-31979));
            short sXd2 = (short) (C1580rY.Xd() ^ (-906));
            int[] iArr = new int["\u001a\u000bydY(\u0018:k8T\u000f\u0018Utj\u0018\u0001|[(L\u0001".length()];
            QB qb = new QB("\u001a\u000bydY(\u0018:k8T\u000f\u0018Utj\u0018\u0001|[(L\u0001");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = cls.getMethod(C1561oA.Xd("dcsPbenelkTiwkrq\u007f", (short) (FB.Xd() ^ 15200)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                if (packageManager == null) {
                    return true;
                }
                Context context2 = this.deviceProtectedContext;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.vd("\u0010\u001e\u0015$\u001a\u0015\u0011[\u001a''.\u0018\")ca\u000f\u000f\u0016\u007f\u0014\u0011", (short) (ZN.Xd() ^ 31803))).getMethod(Qg.kd("\n\u0007\u0015o\u007f\u0001\b|\u0002~fx\u0004z", (short) (OY.Xd() ^ 27351), (short) (OY.Xd() ^ 29018)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context2, objArr2);
                    short sXd3 = (short) (C1499aX.Xd() ^ (-7306));
                    short sXd4 = (short) (C1499aX.Xd() ^ (-4645));
                    int[] iArr2 = new int["+7,95.(p%0.3#+0h*&e\u0007\u0017\u0018\u001f\u0014\u0019\u0016|\u0010\u001c\u000e\u0013\u0010\u001c".length()];
                    QB qb2 = new QB("+7,95.(p%0.3#+0h*&e\u0007\u0017\u0018\u001f\u0014\u0019\u0016|\u0010\u001c\u000e\u0013\u0010\u001c");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                        i3++;
                    }
                    Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1561oA.ud("\u001b\u0011%\u000fZ\u0018\f\u0018\u0010Uy\u001a\u0017\r\u0011\t", (short) (FB.Xd() ^ 16157)));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 128};
                    Method method3 = cls2.getMethod(C1561oA.yd("\u0016\u0015%r#$!\u001f\u001a\u0019-#**\u0006,\u0005\u000f", (short) (ZN.Xd() ^ 4128)), clsArr);
                    try {
                        method3.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method3.invoke(packageManager, objArr3);
                        if (applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(strKd)) {
                            return true;
                        }
                        return applicationInfo.metaData.getBoolean(strKd);
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
            return true;
        }
    }

    private synchronized void updateDataCollectionDefaultEnabled(boolean z2) {
        if (this.dataCollectionDefaultEnabled != z2) {
            this.dataCollectionDefaultEnabled = z2;
            this.publisher.publish(new Event<>(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z2)));
        }
    }

    public synchronized boolean isEnabled() {
        return this.dataCollectionDefaultEnabled;
    }

    public synchronized void setEnabled(Boolean bool) {
        if (bool == null) {
            this.sharedPreferences.edit().remove(DATA_COLLECTION_DEFAULT_ENABLED).apply();
            updateDataCollectionDefaultEnabled(readManifestDataCollectionEnabled());
        } else {
            boolean zEquals = Boolean.TRUE.equals(bool);
            this.sharedPreferences.edit().putBoolean(DATA_COLLECTION_DEFAULT_ENABLED, zEquals).apply();
            updateDataCollectionDefaultEnabled(zEquals);
        }
    }
}
