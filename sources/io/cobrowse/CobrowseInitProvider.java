package io.cobrowse;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.android.volley.DefaultRetryPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.OY;
import yg.Wg;

/* JADX INFO: loaded from: classes3.dex */
public final class CobrowseInitProvider extends ContentProvider {
    static final String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = "io.cobrowse.cobrowseioinitprovider";
    private static Application application = null;
    private ActivityWatcher activities;

    private static void checkContentProviderAuthority(ProviderInfo providerInfo) {
        if (EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    static Application getApplication() {
        Application application2 = application;
        if (application2 != null) {
            return application2;
        }
        throw new IllegalStateException("CobrowseInitProvider is not initialized. Is it declared in AndroidManifest.xml?");
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        checkContentProviderAuthority(providerInfo);
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
    public boolean onCreate() throws Throwable {
        Context context = getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("GSHUQJD\rALJO?GL\u0005\u0019DBG7ID", (short) (C1580rY.Xd() ^ (-3139)))).getMethod(C1561oA.Kd("^]m;kligbaukrrHuu|n\u0003\u007f", (short) (C1580rY.Xd() ^ (-16382))), new Class[0]);
        try {
            method.setAccessible(true);
            application = (Application) ((Context) method.invoke(context, objArr));
            Context context2 = getContext();
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Wg.Zd("G\u001dL`7fl\fK\req\u001bm\n|\u0018\u001ecc*\u0007x", (short) (OY.Xd() ^ 21257), (short) (OY.Xd() ^ 12932))).getMethod(C1561oA.Xd(".-=\u000b;<9721E;BB\u0018EEL>RO", (short) (FB.Xd() ^ DefaultRetryPolicy.DEFAULT_TIMEOUT_MS)), new Class[0]);
            try {
                method2.setAccessible(true);
                this.activities = new ActivityWatcher((Application) ((Context) method2.invoke(context2, objArr2)));
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
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
