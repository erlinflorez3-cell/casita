package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DefaultClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.OY;

/* JADX INFO: loaded from: classes8.dex */
final class zzhs implements zzhg {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ('%s' TEXT UNIQUE);", "gtm_hit_unique_ids", "hit_unique_id");
    private static final String zzb = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT UNIQUE, '%s' TEXT, '%s' TEXT);", "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body");
    private static final String zzc = String.format("CREATE TRIGGER IF NOT EXISTS %s DELETE ON %s FOR EACH ROW WHEN OLD.%s NOTNULL BEGIN     INSERT OR IGNORE INTO %s (%s) VALUES (OLD.%s); END;", "save_unique_on_delete", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id");
    private static final String zzd = String.format("CREATE TRIGGER IF NOT EXISTS %s BEFORE INSERT ON %s FOR EACH ROW WHEN NEW.%s NOT NULL BEGIN     SELECT RAISE(ABORT, 'Duplicate unique ID.')     WHERE EXISTS (SELECT 1 FROM %s WHERE %s = NEW.%s); END;", "check_unique_on_insert", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id");
    private final zzhr zze;
    private volatile zzgy zzf;
    private final Context zzg;
    private final String zzh;
    private long zzi;
    private final Clock zzj;
    private final int zzk;
    private final zzih zzl;

    zzhs(zzih zzihVar, Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("Q&0d<rG{k\u001a\u0019;Zo\r$~\u0015k\u001aF%~", (short) (C1607wl.Xd() ^ 30051))).getMethod(C1561oA.Qd("\u001b\u0018&q \u001f\u001a\u0016\u000f\f\u001e\u0012\u0017\u0015h\u0014\u0012\u0017\u0007\u0019\u0014", (short) (OY.Xd() ^ 3468)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            this.zzg = context2;
            String strZd = C1593ug.zd("AOI<SQLT\u0010GF", (short) (FB.Xd() ^ 23472), (short) (FB.Xd() ^ 28511));
            this.zzh = strZd;
            this.zzl = zzihVar;
            this.zzj = DefaultClock.getInstance();
            this.zze = new zzhr(this, context2, strZd);
            this.zzf = new zziq(context2, new zzhq(this));
            this.zzi = 0L;
            this.zzk = 2000;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* bridge */ /* synthetic */ void zzl(zzhs zzhsVar, long j2, long j3) {
        SQLiteDatabase sQLiteDatabaseZzn = zzhsVar.zzn("Error opening database for getNumStoredHits.");
        if (sQLiteDatabaseZzn == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_first_send_time", Long.valueOf(j3));
        try {
            sQLiteDatabaseZzn.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j2)});
        } catch (SQLiteException e2) {
            zzho.zze("Error setting HIT_FIRST_DISPATCH_TIME for hitId " + j2 + ": " + e2.getMessage());
            zzhsVar.zzo(j2);
        }
    }

    private final SQLiteDatabase zzn(String str) {
        try {
            return this.zze.getWritableDatabase();
        } catch (SQLiteException e2) {
            Context context = this.zzg;
            zzho.zzf(str, e2);
            if (CrashUtils.addDynamiteErrorToDropBox(context, e2)) {
                zzho.zzd("Crash reported successfully.");
                return null;
            }
            zzho.zzd("Failed to report crash");
            return null;
        }
    }

    public final void zzo(long j2) {
        zzm(new String[]{String.valueOf(j2)});
    }

    private final void zzp(long j2, String str, String str2, String str3, Map map, String str4) {
        SQLiteDatabase sQLiteDatabaseZzn = zzn("Error opening database for putHit");
        if (sQLiteDatabaseZzn == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_time", Long.valueOf(j2));
        contentValues.put("hit_url", str);
        contentValues.put("hit_first_send_time", (Integer) 0);
        if (str2 == null) {
            str2 = "GET";
        }
        contentValues.put("hit_method", str2);
        contentValues.put("hit_unique_id", str3);
        contentValues.put("hit_headers", map == null ? null : new JSONObject(map).toString());
        contentValues.put("hit_body", str4);
        try {
            sQLiteDatabaseZzn.insertOrThrow("gtm_hits", null, contentValues);
            zzho.zzd("Hit stored (url = " + str + ")");
            this.zzl.zza(false);
        } catch (SQLiteConstraintException unused) {
            zzho.zzd("Hit has already been sent: ".concat(String.valueOf(str)));
        } catch (SQLiteException e2) {
            zzho.zze("Error storing hit: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:245:0x0272 A[DONT_GENERATE] */
    @Override // com.google.android.gms.internal.gtm.zzhg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzhs.zza():void");
    }

    @Override // com.google.android.gms.internal.gtm.zzhg
    public final void zzb(long j2, String str, String str2, String str3, Map map, String str4) throws Throwable {
        long jCurrentTimeMillis = this.zzj.currentTimeMillis();
        if (jCurrentTimeMillis > this.zzi + CalendarModelKt.MillisecondsIn24Hours) {
            this.zzi = jCurrentTimeMillis;
            SQLiteDatabase sQLiteDatabaseZzn = zzn("Error opening database for deleteStaleHits.");
            if (sQLiteDatabaseZzn != null) {
                zzho.zzd("Removed " + sQLiteDatabaseZzn.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.zzj.currentTimeMillis() - 2592000000L)}) + " stale hits.");
                this.zzl.zza(zzc("gtm_hits") == 0);
            }
        }
        int iZzc = (zzc("gtm_hits") - this.zzk) + 1;
        if (iZzc > 0) {
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase sQLiteDatabaseZzn2 = zzn("Error opening database for peekHitIds.");
            if (sQLiteDatabaseZzn2 != null) {
                Cursor cursorQuery = null;
                try {
                    try {
                        cursorQuery = sQLiteDatabaseZzn2.query("gtm_hits", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(iZzc));
                        if (cursorQuery.moveToFirst()) {
                            do {
                                arrayList.add(String.valueOf(cursorQuery.getLong(0)));
                            } while (cursorQuery.moveToNext());
                        }
                    } catch (SQLiteException e2) {
                        zzho.zze("Error in peekHits fetching hitIds: " + e2.getMessage());
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            zzho.zzd("Store full, deleting " + arrayList.size() + " hits to make room.");
            zzm((String[]) arrayList.toArray(new String[0]));
        }
        zzp(j2, str, str2, str3, map, str4);
        if (zzhv.zza().zzd()) {
            zzho.zzd("Sending hits immediately under preview.");
            zza();
        }
    }

    final int zzc(String str) {
        SQLiteDatabase sQLiteDatabaseZzn = zzn("Error opening database for getNumRecords.");
        int i2 = 0;
        if (sQLiteDatabaseZzn == null) {
            return 0;
        }
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseZzn.rawQuery("SELECT COUNT(*) from gtm_hits", null);
                if (cursorRawQuery.moveToFirst()) {
                    i2 = (int) cursorRawQuery.getLong(0);
                }
                if (cursorRawQuery != null) {
                    return i2;
                }
            } catch (SQLiteException e2) {
                zzho.zze("Error getting numStoredRecords: " + e2.getMessage());
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return i2;
                }
            }
            return i2;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    final void zzm(String[] strArr) {
        int length;
        SQLiteDatabase sQLiteDatabaseZzn;
        if (strArr == null || (length = strArr.length) == 0 || (sQLiteDatabaseZzn = zzn("Error opening database for deleteHits.")) == null) {
            return;
        }
        try {
            sQLiteDatabaseZzn.delete("gtm_hits", String.format("HIT_ID in (%s)", TextUtils.join(",", Collections.nCopies(length, Global.QUESTION))), strArr);
            this.zzl.zza(zzc("gtm_hits") == 0);
        } catch (SQLiteException e2) {
            zzho.zze("Error deleting hits: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
