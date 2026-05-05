package io.invertase.firebase.common;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import io.invertase.firebase.app.ReactNativeFirebaseApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    @OverridingMethodsMustInvokeSuper
    public boolean onCreate() throws Throwable {
        if (ReactNativeFirebaseApp.getApplicationContext() != null) {
            return false;
        }
        Context context = getContext();
        if (context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("iujwslf/cnlqain';fdiYkf", (short) (FB.Xd() ^ 6434), (short) (FB.Xd() ^ 16927))).getMethod(hg.Vd("\u0004\u0001\u000fZ\t\b\u0003~wt\u0007z\u007f}Q|z\u007fo\u0002|", (short) (OY.Xd() ^ 30692), (short) (OY.Xd() ^ 31256)), new Class[0]);
            try {
                method.setAccessible(true);
                if (((Context) method.invoke(context, objArr)) != null) {
                    short sXd = (short) (C1633zX.Xd() ^ (-22446));
                    int[] iArr = new int["`lanjc]&ZechX`e\u001e2][`Pb]".length()];
                    QB qb = new QB("`lanjc]&ZechX`e\u001e2][`Pb]");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.yd("c`n:pojfgdvjwuItz\u007fo\u0002\u0005", (short) (Od.Xd() ^ (-22442))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        context = (Context) method2.invoke(context, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        ReactNativeFirebaseApp.setApplicationContext(context);
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
