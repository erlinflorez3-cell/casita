package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.Ig;
import yg.Jg;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
final class zzhr extends SQLiteOpenHelper {
    final /* synthetic */ zzhs zza;
    private boolean zzb;
    private long zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhr(zzhs zzhsVar, Context context, String str) {
        super(context, "gtm_urls.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzhsVar;
        this.zzc = 0L;
    }

    private static final boolean zza(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            boolean zMoveToFirst = cursorQuery.moveToFirst();
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return zMoveToFirst;
        } catch (SQLiteException unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    private static final void zzb(SQLiteDatabase sQLiteDatabase, String str, List list) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " WHERE 0", null);
        HashSet hashSet = new HashSet();
        try {
            for (String str2 : cursorRawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            cursorRawQuery.close();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (!hashSet.remove(str3)) {
                    throw new SQLiteException(String.format("Database column %s missing in table %s.", str3, str));
                }
            }
            if (!hashSet.isEmpty()) {
                throw new SQLiteException(String.format("Database has extra columns in table %s.", str));
            }
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws Throwable {
        SQLiteDatabase writableDatabase;
        if (this.zzb && this.zzc + 3600000 > this.zza.zzj.currentTimeMillis()) {
            throw new SQLiteException(Jg.Wd(":\u0019Yf\u0014W\u00137\u000e\u0003Qq\u001eNq<dI)X\u001fOx\u0015", (short) (C1580rY.Xd() ^ (-20257)), (short) (C1580rY.Xd() ^ (-8828))));
        }
        this.zzb = true;
        this.zzc = this.zza.zzj.currentTimeMillis();
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzhs zzhsVar = this.zza;
            Context context = zzhsVar.zzg;
            String str = zzhsVar.zzh;
            Class<?> cls = Class.forName(ZO.xd("0*\u0007c\u001998Qn\te:2&nK^1IE=7\u0001", (short) (ZN.Xd() ^ 11736), (short) (ZN.Xd() ^ 32704)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1499aX.Xd() ^ (-20518));
            short sXd2 = (short) (C1499aX.Xd() ^ (-580));
            int[] iArr = new int[" S\u0010?\u0014\u0019n\u0016\nbq\u0015`j\u007fq".length()];
            QB qb = new QB(" S\u0010?\u0014\u0019n\u0016\nbq\u0015`j\u007fq");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {str};
            Method method = cls.getMethod(Ig.wd("2\u007f\u001d\fY hQ\"C7D'@$", (short) (C1499aX.Xd() ^ (-6363))), clsArr);
            try {
                method.setAccessible(true);
                ((File) method.invoke(context, objArr)).delete();
                writableDatabase = null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (writableDatabase == null) {
            writableDatabase = super.getWritableDatabase();
        }
        this.zzb = false;
        return writableDatabase;
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
            zzho.zza("Invalid version number: ".concat(String.valueOf(Build.VERSION.SDK)));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (zza("gtm_hit_unique_ids", sQLiteDatabase)) {
            zzb(sQLiteDatabase, "gtm_hit_unique_ids", Arrays.asList("hit_unique_id"));
        } else {
            sQLiteDatabase.execSQL(zzhs.zza);
        }
        if (zza("gtm_hits", sQLiteDatabase)) {
            zzb(sQLiteDatabase, "gtm_hits", Arrays.asList("hit_id", "hit_url", "hit_time", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"));
        } else {
            sQLiteDatabase.execSQL(zzhs.zzb);
        }
        sQLiteDatabase.execSQL(zzhs.zzc);
        sQLiteDatabase.execSQL(zzhs.zzd);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
