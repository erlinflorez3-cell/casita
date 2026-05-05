package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final boolean onCreate() throws Throwable {
        Context context = getContext();
        if (context == null) {
            throw new StartupException(C1561oA.Qd("\u001bFDI9KFp30<;;?i+-f4:0/", (short) (FB.Xd() ^ 3757)));
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("\u0006\u0018$+\u0012kD8Kr\u0014\u0014M$R.\u000f7\u007f4E\u000fj", (short) (OY.Xd() ^ 10308), (short) (OY.Xd() ^ 251))).getMethod(Ig.wd("a\u0010M98\fc(SAV-diNd\u000b#K6s", (short) (ZN.Xd() ^ 28969)), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Context) method.invoke(context, objArr)) != null) {
                AppInitializer.getInstance(context).discoverAndInitialize();
                return true;
            }
            StartupLogger.w(EO.Od("5\u00103NDxGE`I\t8anc\u0002ALx\u0006\\\u001fxuz\u0017}I\u000f\u0017f@\\|M$\u007fU7E=:Vtv]2\t^-zL\u0012#4O\u007ff98\u001av", (short) (C1607wl.Xd() ^ 29869)));
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
