package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.facebook.common.logging.FLog;
import com.facebook.react.common.ReactConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public class ReactDatabaseSupplier extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "RKStorage";
    private static final int DATABASE_VERSION = 1;
    static final String KEY_COLUMN = "key";
    private static final int SLEEP_TIME_MS = 30;
    static final String TABLE_CATALYST = "catalystLocalStorage";
    static final String VALUE_COLUMN = "value";
    static final String VERSION_TABLE_CREATE = "CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)";

    @Nullable
    private static ReactDatabaseSupplier sReactDatabaseSupplierInstance = null;
    private Context mContext;

    @Nullable
    private SQLiteDatabase mDb;
    private long mMaximumDatabaseSize;

    private ReactDatabaseSupplier(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        this.mMaximumDatabaseSize = BuildConfig.AsyncStorage_db_size.longValue() * 1048576;
        this.mContext = context;
    }

    private synchronized boolean deleteDatabase() {
        Context context;
        Object[] objArr;
        Method method;
        closeDatabase();
        context = this.mContext;
        short sXd = (short) (Od.Xd() ^ (-19240));
        short sXd2 = (short) (Od.Xd() ^ (-4644));
        int[] iArr = new int["!CtEvY\u0003\u000eR".length()];
        QB qb = new QB("!CtEvY\u0003\u000eR");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        objArr = new Object[]{new String(iArr, 0, i2)};
        method = Class.forName(C1626yg.Ud("P\"c\u001cYk[\\K{tOaV^G`o@\\\u001f}&", (short) (Od.Xd() ^ (-5992)), (short) (Od.Xd() ^ (-17704)))).getMethod(EO.Od("zSj|'li\u0019r.3\u000ejd", (short) (Od.Xd() ^ (-16565))), Class.forName(Ig.wd("\u0005+n\u0001Nh1\u0016X.Mx(-*\u0005", (short) (Od.Xd() ^ (-2688)))));
        try {
            method.setAccessible(true);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
        return ((Boolean) method.invoke(context, objArr)).booleanValue();
    }

    public static void deleteInstance() {
        sReactDatabaseSupplierInstance = null;
    }

    public static ReactDatabaseSupplier getInstance(Context context) throws Throwable {
        if (sReactDatabaseSupplierInstance == null) {
            Class<?> cls = Class.forName(C1561oA.Qd("VbWd`YS\u001cP[Y^NV[\u0014(SQVFXS", (short) (C1633zX.Xd() ^ (-3312))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1607wl.Xd() ^ 1667);
            short sXd2 = (short) (C1607wl.Xd() ^ 32603);
            int[] iArr = new int["GFV$TURPKJ^T[[1^^eWkh".length()];
            QB qb = new QB("GFV$TURPKJ^T[[1^^eWkh");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                sReactDatabaseSupplierInstance = new ReactDatabaseSupplier((Context) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return sReactDatabaseSupplierInstance;
    }

    synchronized void clear() {
        get().delete(TABLE_CATALYST, null, null);
    }

    public synchronized void clearAndCloseDatabase() throws RuntimeException {
        try {
            clear();
            closeDatabase();
            FLog.d(ReactConstants.TAG, "Cleaned RKStorage");
        } catch (Exception unused) {
            if (!deleteDatabase()) {
                throw new RuntimeException("Clearing and deleting database RKStorage failed");
            }
            FLog.d(ReactConstants.TAG, "Deleted Local Database RKStorage");
        }
    }

    public synchronized void closeDatabase() {
        SQLiteDatabase sQLiteDatabase = this.mDb;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.mDb.close();
            this.mDb = null;
        }
    }

    synchronized boolean ensureDatabase() {
        SQLiteDatabase sQLiteDatabase = this.mDb;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        SQLiteException e2 = null;
        for (int i2 = 0; i2 < 2; i2++) {
            if (i2 > 0) {
                try {
                    deleteDatabase();
                } catch (SQLiteException e3) {
                    e2 = e3;
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            this.mDb = getWritableDatabase();
        }
        SQLiteDatabase sQLiteDatabase2 = this.mDb;
        if (sQLiteDatabase2 == null) {
            throw e2;
        }
        sQLiteDatabase2.setMaximumSize(this.mMaximumDatabaseSize);
        return true;
    }

    public synchronized SQLiteDatabase get() {
        ensureDatabase();
        return this.mDb;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(VERSION_TABLE_CREATE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 != i3) {
            deleteDatabase();
            onCreate(sQLiteDatabase);
        }
    }

    public synchronized void setMaximumSize(long j2) {
        this.mMaximumDatabaseSize = j2;
        SQLiteDatabase sQLiteDatabase = this.mDb;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.setMaximumSize(j2);
        }
    }
}
