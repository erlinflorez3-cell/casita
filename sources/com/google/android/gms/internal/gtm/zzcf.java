package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.braze.models.FeatureFlag;
import io.sentry.protocol.Message;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Wg;

/* JADX INFO: loaded from: classes8.dex */
final class zzcf extends SQLiteOpenHelper {
    final /* synthetic */ zzcg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcf(zzcg zzcgVar, Context context, String str) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzcgVar;
    }

    private final boolean zza(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return zMoveToFirst;
            } catch (SQLiteException e2) {
                this.zza.zzS("Error querying for table", str, e2);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    private static final Set zzb(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            for (String str2 : cursorRawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws Throwable {
        if (!this.zza.zze.zzc(3600000L)) {
            throw new SQLiteException(Wg.Zd("WJ\\/K)\u0011\u001ew\r\n\u000e\\I\u001f/R\u0005CM", (short) (C1580rY.Xd() ^ (-32393)), (short) (C1580rY.Xd() ^ (-22348))));
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            this.zza.zze.zzb();
            this.zza.zzI(EO.Od("\bpy(m b5T\u001b\u0018.A:S!v]:2'<\u0003\u0011\u000fqUI%>&\u0002lU\rR.HB\"!\u0006)}{ooQCv\u0017\u001fS\u0019U\u0017\u0006\"_T\u0004!\u0006S\t", (short) (C1633zX.Xd() ^ (-1706))));
            zzcg zzcgVar = this.zza;
            String strZzad = zzcgVar.zzad();
            Context contextZzo = zzcgVar.zzo();
            Object[] objArr = {strZzad};
            Method method = Class.forName(C1561oA.Qd("htivrke.bmkp`hm&:echXje", (short) (OY.Xd() ^ 27955))).getMethod(C1561oA.od("!\u001e,z\u0017)\u0015\u0015\u0013$\u0015~\u000f!\u0014", (short) (C1607wl.Xd() ^ 13708)), Class.forName(C1593ug.zd("#\u001b1\u001dj* .(o\u001687/5/", (short) (FB.Xd() ^ 10377), (short) (FB.Xd() ^ 3992))));
            try {
                method.setAccessible(true);
                ((File) method.invoke(contextZzo, objArr)).delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.zza.zze.zza();
                    return writableDatabase;
                } catch (SQLiteException e2) {
                    this.zza.zzJ(C1561oA.Kd("\u0006\"+/))e;7h9;1;m5B6E;@Nu:J>;OAA}CAUCEEXK", (short) (C1580rY.Xd() ^ (-3765))), e2);
                    throw e2;
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) < 9) {
                return;
            }
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        } catch (NumberFormatException unused) {
            zzfc.zzb("Invalid version number", Build.VERSION.SDK);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (zza(sQLiteDatabase, "hits2")) {
            Set setZzb = zzb(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i2 = 0; i2 < 4; i2++) {
                String str = strArr[i2];
                if (!setZzb.remove(str)) {
                    throw new SQLiteException("Database hits2 is missing required column: ".concat(String.valueOf(str)));
                }
            }
            boolean zRemove = setZzb.remove("hit_app_id");
            if (!setZzb.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            }
            if (!zRemove) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        } else {
            sQLiteDatabase.execSQL(zzcg.zza);
        }
        if (!zza(sQLiteDatabase, FeatureFlag.PROPERTIES)) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            return;
        }
        Set setZzb2 = zzb(sQLiteDatabase, FeatureFlag.PROPERTIES);
        String[] strArr2 = {"app_uid", "cid", "tid", Message.JsonKeys.PARAMS, "adid", "hits_count"};
        for (int i3 = 0; i3 < 6; i3++) {
            String str2 = strArr2[i3];
            if (!setZzb2.remove(str2)) {
                throw new SQLiteException("Database properties is missing required column: ".concat(String.valueOf(str2)));
            }
        }
        if (!setZzb2.isEmpty()) {
            throw new SQLiteException("Database properties table has extra columns");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
