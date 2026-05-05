package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.protocol.App;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yg.C1561oA;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
final class zzal extends zznr {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {App.JsonKeys.APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzf = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzj = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzk = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    private final zzat zzl;
    private final zznl zzm;

    zzal(zznv zznvVar) {
        super(zznvVar);
        this.zzm = new zznl(zzb());
        this.zzl = new zzat(this, zza(), "google_app_measurement.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0032 A[FINALLY_INSNS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zza(java.lang.String r5, java.lang.String[] r6, long r7) {
        /*
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.e_()
            r3 = 0
            android.database.Cursor r3 = r0.rawQuery(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L20 java.lang.Throwable -> L2f
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L20 java.lang.Throwable -> L2f
            if (r0 == 0) goto L1a
            r0 = 0
            long r0 = r3.getLong(r0)     // Catch: android.database.sqlite.SQLiteException -> L20 java.lang.Throwable -> L2f
            if (r3 == 0) goto L19
            r3.close()
        L19:
            return r0
        L1a:
            if (r3 == 0) goto L1f
            r3.close()
        L1f:
            return r7
        L20:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r0 = r4.zzj()     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzg()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "Database error"
            r1.zza(r0, r5, r2)     // Catch: java.lang.Throwable -> L2f
            throw r2     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            if (r3 == 0) goto L35
            r3.close()
        L35:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[], long):long");
    }

    private final Object zza(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            zzj().zzg().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0044: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:54:0x0044 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> T zza(java.lang.String r6, java.lang.String[] r7, com.google.android.gms.measurement.internal.zzau<T> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            r4 = 0
            android.database.sqlite.SQLiteDatabase r0 = r5.e_()     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> L46
            android.database.Cursor r3 = r0.rawQuery(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L2e java.lang.Throwable -> L46
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L43
            if (r0 != 0) goto L22
            com.google.android.gms.measurement.internal.zzgo r0 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L43
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzp()     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L43
            java.lang.String r0 = "No data found"
            r1.zza(r0)     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L43
            if (r3 == 0) goto L21
            r3.close()
        L21:
            return r4
        L22:
            java.lang.Object r0 = r8.zza(r3)     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L43
            if (r3 == 0) goto L2b
            r3.close()
        L2b:
            return r0
        L2c:
            r2 = move-exception
            goto L30
        L2e:
            r2 = move-exception
            r3 = r4
        L30:
            com.google.android.gms.measurement.internal.zzgo r0 = r5.zzj()     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzg()     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "Error querying database."
            r1.zza(r0, r2)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L42
            r3.close()
        L42:
            return r4
        L43:
            r0 = move-exception
            r4 = r3
            goto L47
        L46:
            r0 = move-exception
        L47:
            if (r4 == 0) goto L4c
            r4.close()
        L4c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.zzau):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0032 A[FINALLY_INSNS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zza(java.lang.String r5, java.lang.String[] r6, java.lang.String r7) {
        /*
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.e_()
            r3 = 0
            android.database.Cursor r3 = r0.rawQuery(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L20 java.lang.Throwable -> L2f
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L20 java.lang.Throwable -> L2f
            if (r0 == 0) goto L1a
            r0 = 0
            java.lang.String r0 = r3.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L20 java.lang.Throwable -> L2f
            if (r3 == 0) goto L19
            r3.close()
        L19:
            return r0
        L1a:
            if (r3 == 0) goto L1f
            r3.close()
        L1f:
            return r7
        L20:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r0 = r4.zzj()     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzg()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "Database error"
            r1.zza(r0, r5, r2)     // Catch: java.lang.Throwable -> L2f
            throw r2     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            if (r3 == 0) goto L35
            r3.close()
        L35:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[], java.lang.String):java.lang.String");
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    private final void zza(String str, zzbb zzbbVar) {
        Preconditions.checkNotNull(zzbbVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbbVar.zza);
        contentValues.put("name", zzbbVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbbVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbbVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbbVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbbVar.zzg));
        contentValues.put("last_bundled_day", zzbbVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbbVar.zzi);
        contentValues.put("last_sampling_rate", zzbbVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbbVar.zze));
        contentValues.put("last_exempt_from_sampling", (zzbbVar.zzk == null || !zzbbVar.zzk.booleanValue()) ? null : 1L);
        try {
            if (e_().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzgo.zza(zzbbVar.zza));
            }
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing event aggregates. appId", zzgo.zza(zzbbVar.zza), e2);
        }
    }

    private final void zza(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseE_ = e_();
            if (contentValues.getAsString(str2) == null) {
                zzj().zzm().zza("Value of the primary key is not set.", zzgo.zza(str2));
            } else if (sQLiteDatabaseE_.update(str, contentValues, str2 + " = ?", new String[]{r3}) == 0 && sQLiteDatabaseE_.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update table (got -1). key", zzgo.zza(str), zzgo.zza(str2));
            }
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing into table. key", zzgo.zza(str), zzgo.zza(str2), e2);
        }
    }

    private final boolean zza(long j2, zzbc zzbcVar, long j3, boolean z2) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] bArrZzca = g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbcVar.zza);
        contentValues.put("name", zzbcVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j3));
        contentValues.put("data", bArrZzca);
        contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
        try {
            long jUpdate = e_().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
            if (jUpdate == 1) {
                return true;
            }
            zzj().zzg().zza("Failed to update raw event. appId, updatedRows", zzgo.zza(zzbcVar.zza), Long.valueOf(jUpdate));
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error updating raw event. appId", zzgo.zza(zzbcVar.zza), e2);
            return false;
        }
    }

    private final boolean zza(String str, int i2, zzfo.zzb zzbVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().zzu().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i2), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] bArrZzca = zzbVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put("data", bArrZzca);
        try {
            if (e_().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert event filter (got -1). appId", zzgo.zza(str));
            return true;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing event filter. appId", zzgo.zza(str), e2);
            return false;
        }
    }

    private final boolean zza(String str, int i2, zzfo.zze zzeVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().zzu().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i2), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] bArrZzca = zzeVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put("data", bArrZzca);
        try {
            if (e_().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert property filter (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing property filter. appId", zzgo.zza(str), e2);
            return false;
        }
    }

    private final String zzao() {
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        return "(" + ("(upload_type = " + zznt.GOOGLE_SIGNAL.zza() + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + zzbh.zzaf.zza(null).longValue() + " AS INTEGER)))") + " OR " + ("(upload_type != " + zznt.GOOGLE_SIGNAL.zza() + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + zzag.zzm() + " AS INTEGER)))") + ")";
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = e_().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j2;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean zzb(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzal();
        zzt();
        SQLiteDatabase sQLiteDatabaseE_ = e_();
        try {
            long jZzb = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, zze().zzb(str, zzbh.zzah)));
            if (jZzb <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            return sQLiteDatabaseE_.delete("audience_filter_values", new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ").append(new StringBuilder("(").append(TextUtils.join(",", arrayList)).append(")").toString()).append(" order by rowid desc limit -1 offset ?)").toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.measurement.internal.zzbb zzc(java.lang.String r30, java.lang.String r31, java.lang.String r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzbb");
    }

    private final void zzi(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            e_().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error deleting snapshot. appId", zzgo.zza(str2), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b_() {
        /*
            r6 = this;
            r4 = -1
            r3 = 0
            android.database.sqlite.SQLiteDatabase r1 = r6.e_()     // Catch: android.database.sqlite.SQLiteException -> L24 java.lang.Throwable -> L38
            java.lang.String r0 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r3 = r1.rawQuery(r0, r3)     // Catch: android.database.sqlite.SQLiteException -> L24 java.lang.Throwable -> L38
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L24 java.lang.Throwable -> L38
            if (r0 != 0) goto L19
            if (r3 == 0) goto L18
            r3.close()
        L18:
            return r4
        L19:
            r0 = 0
            long r0 = r3.getLong(r0)     // Catch: android.database.sqlite.SQLiteException -> L24 java.lang.Throwable -> L38
            if (r3 == 0) goto L23
            r3.close()
        L23:
            return r0
        L24:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r0 = r6.zzj()     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzg()     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "Error querying raw events"
            r1.zza(r0, r2)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L37
            r3.close()
        L37:
            return r4
        L38:
            r0 = move-exception
            if (r3 == 0) goto L3e
            r3.close()
        L3e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.b_():long");
    }

    public final long c_() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    public final long d_() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    final SQLiteDatabase e_() {
        zzt();
        try {
            return this.zzl.getWritableDatabase();
        } catch (SQLiteException e2) {
            zzj().zzu().zza("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f_() throws java.lang.Throwable {
        /*
            r5 = this;
            android.database.sqlite.SQLiteDatabase r1 = r5.e_()
            r4 = 0
            java.lang.String r0 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r3 = r1.rawQuery(r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L24 java.lang.Throwable -> L3b
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L39
            if (r0 == 0) goto L1c
            r0 = 0
            java.lang.String r0 = r3.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L39
            if (r3 == 0) goto L1b
            r3.close()
        L1b:
            return r0
        L1c:
            if (r3 == 0) goto L21
            r3.close()
        L21:
            return r4
        L22:
            r2 = move-exception
            goto L26
        L24:
            r2 = move-exception
            r3 = r4
        L26:
            com.google.android.gms.measurement.internal.zzgo r0 = r5.zzj()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzg()     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = "Database error getting next bundle app id"
            r1.zza(r0, r2)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L38
            r3.close()
        L38:
            return r4
        L39:
            r0 = move-exception
            goto L3d
        L3b:
            r0 = move-exception
            r3 = r4
        L3d:
            if (r3 == 0) goto L42
            r3.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.f_():java.lang.String");
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            return e_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error deleting conditional property", zzgo.zza(str), zzi().zzc(str2), e2);
            return 0;
        }
    }

    public final long zza(zzfy.zzk zzkVar) throws IOException {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        byte[] bArrZzca = zzkVar.zzca();
        long jZza = g_().zza(bArrZzca);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkVar.zzz());
        contentValues.put("metadata_fingerprint", Long.valueOf(jZza));
        contentValues.put("metadata", bArrZzca);
        try {
            e_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jZza;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing raw event metadata. appId", zzgo.zza(zzkVar.zzz()), e2);
            throw e2;
        }
    }

    public final long zza(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        try {
            return e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zze().zzb(str, zzbh.zzp))))});
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error deleting over the limit events. appId", zzgo.zza(str), e2);
            return 0L;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x008f: MOVE (r6 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:70:0x008f */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzfy.zzf, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.zzt()
            r7.zzal()
            r6 = 0
            android.database.sqlite.SQLiteDatabase r5 = r7.e_()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> L91
            java.lang.String r4 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> L91
            r2 = 0
            r3[r2] = r8     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> L91
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> L91
            r1 = 1
            r3[r1] = r0     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> L91
            android.database.Cursor r4 = r5.rawQuery(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> L91
            boolean r0 = r4.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            if (r0 != 0) goto L37
            com.google.android.gms.measurement.internal.zzgo r0 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzp()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            java.lang.String r0 = "Main event not found"
            r1.zza(r0)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            if (r4 == 0) goto L36
            r4.close()
        L36:
            return r6
        L37:
            byte[] r2 = r4.getBlob(r2)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            long r0 = r4.getLong(r1)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r0 = com.google.android.gms.internal.measurement.zzfy.zzf.zze()     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            com.google.android.gms.internal.measurement.zzlb r0 = com.google.android.gms.measurement.internal.zzoo.zza(r0, r2)     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r0 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza) r0     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            com.google.android.gms.internal.measurement.zzlc r0 = r0.zzai()     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            com.google.android.gms.internal.measurement.zzjt r0 = (com.google.android.gms.internal.measurement.zzjt) r0     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            com.google.android.gms.internal.measurement.zzfy$zzf r0 = (com.google.android.gms.internal.measurement.zzfy.zzf) r0     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            if (r4 == 0) goto L5e
            r4.close()
        L5e:
            return r0
        L5f:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzgo r0 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            com.google.android.gms.measurement.internal.zzgq r2 = r0.zzg()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            java.lang.String r1 = "Failed to merge main event. appId, eventId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzgo.zza(r8)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            r2.zza(r1, r0, r9, r3)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L8e
            if (r4 == 0) goto L76
            r4.close()
        L76:
            return r6
        L77:
            r2 = move-exception
            goto L7b
        L79:
            r2 = move-exception
            r4 = r6
        L7b:
            com.google.android.gms.measurement.internal.zzgo r0 = r7.zzj()     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzg()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "Error selecting main event"
            r1.zza(r0, r2)     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L8d
            r4.close()
        L8d:
            return r6
        L8e:
            r0 = move-exception
            r6 = r4
            goto L92
        L91:
            r0 = move-exception
        L92:
            if (r6 == 0) goto L97
            r6.close()
        L97:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzaq zza(long r24, java.lang.String r26, long r27, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.zzaq");
    }

    public final zzaq zza(long j2, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        return zza(j2, str, 1L, false, false, z4, false, z6, z7, z8);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0056: MOVE (r5 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:54:0x0056 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zza(long r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.zzt()
            r6.zzal()
            r5 = 0
            android.database.sqlite.SQLiteDatabase r4 = r6.e_()     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L58
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L58
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L58
            r1 = 0
            r2[r1] = r0     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L58
            android.database.Cursor r3 = r4.rawQuery(r3, r2)     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L58
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L55
            if (r0 != 0) goto L34
            com.google.android.gms.measurement.internal.zzgo r0 = r6.zzj()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L55
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzp()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L55
            java.lang.String r0 = "No expired configs for apps with pending events"
            r1.zza(r0)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L55
            if (r3 == 0) goto L33
            r3.close()
        L33:
            return r5
        L34:
            java.lang.String r0 = r3.getString(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L55
            if (r3 == 0) goto L3d
            r3.close()
        L3d:
            return r0
        L3e:
            r2 = move-exception
            goto L42
        L40:
            r2 = move-exception
            r3 = r5
        L42:
            com.google.android.gms.measurement.internal.zzgo r0 = r6.zzj()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzg()     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "Error selecting expired configs"
            r1.zza(r0, r2)     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L54
            r3.close()
        L54:
            return r5
        L55:
            r0 = move-exception
            r5 = r3
            goto L59
        L58:
            r0 = move-exception
        L59:
            if (r5 == 0) goto L5e
            r5.close()
        L5e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(long):java.lang.String");
    }

    public final List<Pair<zzfy.zzk, Long>> zza(String str, int i2, int i3) {
        byte[] bArrZzc;
        long jZzc;
        long jZzc2;
        zzt();
        zzal();
        int i4 = 1;
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkArgument(i3 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = e_().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i2));
                if (!cursorQuery.moveToFirst()) {
                    List<Pair<zzfy.zzk, Long>> listEmptyList = Collections.emptyList();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j2 = cursorQuery.getLong(0);
                    try {
                        bArrZzc = g_().zzc(cursorQuery.getBlob(i4));
                    } catch (IOException e2) {
                        zzj().zzg().zza("Failed to unzip queued bundle. appId", zzgo.zza(str), e2);
                    }
                    if (!arrayList.isEmpty() && bArrZzc.length + length > i3) {
                        break;
                    }
                    try {
                        zzfy.zzk.zza zzaVar = (zzfy.zzk.zza) zzoo.zza(zzfy.zzk.zzw(), bArrZzc);
                        if (!arrayList.isEmpty()) {
                            zzfy.zzk zzkVar = (zzfy.zzk) ((Pair) arrayList.get(0)).first;
                            zzfy.zzk zzkVar2 = (zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai());
                            if (!zzkVar.zzae().equals(zzkVar2.zzae()) || !zzkVar.zzad().equals(zzkVar2.zzad()) || zzkVar.zzau() != zzkVar2.zzau() || !zzkVar.zzaf().equals(zzkVar2.zzaf())) {
                                break;
                            }
                            Iterator<zzfy.zzo> it = zzkVar.zzas().iterator();
                            while (true) {
                                jZzc = -1;
                                if (!it.hasNext()) {
                                    jZzc2 = -1;
                                    break;
                                }
                                zzfy.zzo next = it.next();
                                if ("_npa".equals(next.zzg())) {
                                    jZzc2 = next.zzc();
                                    break;
                                }
                            }
                            Iterator<zzfy.zzo> it2 = zzkVar2.zzas().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                zzfy.zzo next2 = it2.next();
                                if ("_npa".equals(next2.zzg())) {
                                    jZzc = next2.zzc();
                                    break;
                                }
                            }
                            if (jZzc2 != jZzc) {
                                break;
                            }
                        }
                        if (!cursorQuery.isNull(2)) {
                            zzaVar.zzi(cursorQuery.getInt(2));
                        }
                        length += bArrZzc.length;
                        arrayList.add(Pair.create((zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai()), Long.valueOf(j2)));
                    } catch (IOException e3) {
                        zzj().zzg().zza("Failed to merge queued bundle. appId", zzgo.zza(str), e3);
                    }
                    if (!cursorQuery.moveToNext() || length > i3) {
                        break;
                    }
                    i4 = 1;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (SQLiteException e4) {
                zzj().zzg().zza("Error querying bundles. appId", zzgo.zza(str), e4);
                List<Pair<zzfy.zzk, Long>> listEmptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return listEmptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<zzae> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + ProxyConfig.MATCH_ALL_SCHEMES);
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0080, code lost:
    
        zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzae> zza(java.lang.String r33, java.lang.String[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void zza(zzbb zzbbVar) {
        zza("events", zzbbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.measurement.internal.zzg r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(com.google.android.gms.measurement.internal.zzg, boolean, boolean):void");
    }

    final void zza(Long l2) {
        zzt();
        zzal();
        Preconditions.checkNotNull(l2);
        if ((!zzpu.zza() || zze().zza(zzbh.zzcb)) && zzaa()) {
            if (zzb("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l2 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l2 + " AND retry_count < 2147483647");
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error incrementing retry count. error", e2);
            }
        }
    }

    public final void zza(String str, Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        zzt();
        zzal();
        zzar zzarVar = new zzar(this, str);
        for (List<zzap> listZza = zzarVar.zza(); !listZza.isEmpty(); listZza = zzarVar.zza()) {
            for (zzap zzapVar : listZza) {
                zzoo zzooVarG_ = g_();
                zzfy.zzf zzfVar = zzapVar.zzd;
                Bundle bundle2 = new Bundle();
                for (zzfy.zzh zzhVar : zzfVar.zzh()) {
                    if (zzhVar.zzj()) {
                        bundle2.putDouble(zzhVar.zzg(), zzhVar.zza());
                    } else if (zzhVar.zzk()) {
                        bundle2.putFloat(zzhVar.zzg(), zzhVar.zzb());
                    } else if (zzhVar.zzl()) {
                        bundle2.putLong(zzhVar.zzg(), zzhVar.zzd());
                    } else if (zzhVar.zzn()) {
                        bundle2.putString(zzhVar.zzg(), zzhVar.zzh());
                    } else if (zzhVar.zzi().isEmpty()) {
                        zzooVarG_.zzj().zzg().zza("Unexpected parameter type for parameter", zzhVar);
                    } else {
                        bundle2.putParcelableArray(zzhVar.zzg(), zzoo.zzb(zzhVar.zzi()));
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String strZzg = zzfVar.zzg();
                if (string == null) {
                    string = "";
                }
                zzgs zzgsVar = new zzgs(strZzg, string, bundle2, zzfVar.zzd());
                zzq().zza(zzgsVar.zzc, bundle);
                zza(zzapVar.zza, new zzbc(this.zzu, zzgsVar.zzb, str, zzapVar.zzd.zzg(), zzapVar.zzd.zzd(), zzapVar.zzd.zzc(), zzgsVar.zzc), zzapVar.zzb, zzapVar.zzc);
            }
        }
    }

    public final void zza(String str, zzax zzaxVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaxVar);
        zzt();
        zzal();
        if (zze().zza(zzbh.zzcr) && zzi(str) == zzje.zza) {
            zzb(str, zzje.zza);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzaxVar.zzf());
        zza("consent_settings", "app_id", contentValues);
    }

    public final void zza(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        zzt();
        zzal();
        zzb(str, zzi(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjeVar.zzf());
        zza("consent_settings", "app_id", contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01e4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zza(java.lang.String r17, java.util.List<com.google.android.gms.internal.measurement.zzfo.zza> r18) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.util.List):void");
    }

    final void zza(List<Long> list) {
        zzt();
        zzal();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzaa()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzb("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error incrementing retry count. error", e2);
            }
        }
    }

    public final boolean zza(zzfy.zzk zzkVar, boolean z2) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        Preconditions.checkState(zzkVar.zzbj());
        zzv();
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        if (zzkVar.zzm() < jCurrentTimeMillis - zzag.zzm() || zzkVar.zzm() > zzag.zzm() + jCurrentTimeMillis) {
            zzj().zzu().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgo.zza(zzkVar.zzz()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzkVar.zzm()));
        }
        try {
            byte[] bArrZzb = g_().zzb(zzkVar.zzca());
            zzj().zzp().zza("Saving bundle, size", Integer.valueOf(bArrZzb.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzkVar.zzz());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzkVar.zzm()));
            contentValues.put("data", bArrZzb);
            contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
            if (zzkVar.zzbq()) {
                contentValues.put("retry_count", Integer.valueOf(zzkVar.zzg()));
            }
            try {
                if (e_().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzgo.zza(zzkVar.zzz()));
                return false;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error storing bundle. appId", zzgo.zza(zzkVar.zzz()), e2);
                return false;
            }
        } catch (IOException e3) {
            zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzgo.zza(zzkVar.zzz()), e3);
            return false;
        }
    }

    public final boolean zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        zzt();
        zzal();
        String str = zzaeVar.zza;
        Preconditions.checkNotNull(str);
        if (zze(str, zzaeVar.zzc.zza) == null && zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzaeVar.zzb);
        contentValues.put("name", zzaeVar.zzc.zza);
        zza(contentValues, "value", Preconditions.checkNotNull(zzaeVar.zzc.zza()));
        contentValues.put("active", Boolean.valueOf(zzaeVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzaeVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzaeVar.zzh));
        zzq();
        contentValues.put("timed_out_event", zzos.zza((Parcelable) zzaeVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzaeVar.zzd));
        zzq();
        contentValues.put("triggered_event", zzos.zza((Parcelable) zzaeVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzaeVar.zzc.zzb));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzaeVar.zzj));
        zzq();
        contentValues.put("expired_event", zzos.zza((Parcelable) zzaeVar.zzk));
        try {
            if (e_().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzgo.zza(str));
            }
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing conditional user property", zzgo.zza(str), e2);
        }
        return true;
    }

    public final boolean zza(zzbc zzbcVar, long j2, boolean z2) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] bArrZzca = g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbcVar.zza);
        contentValues.put("name", zzbcVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", bArrZzca);
        contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
        try {
            if (e_().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzgo.zza(zzbcVar.zza));
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing raw event. appId", zzgo.zza(zzbcVar.zza), e2);
            return false;
        }
    }

    public final boolean zza(zzop zzopVar) {
        Preconditions.checkNotNull(zzopVar);
        zzt();
        zzal();
        if (zze(zzopVar.zza, zzopVar.zzc) == null) {
            if (zzos.zzh(zzopVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzopVar.zza}) >= zze().zza(zzopVar.zza, zzbh.zzai, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzopVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzopVar.zza, zzopVar.zzb}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzopVar.zza);
        contentValues.put("origin", zzopVar.zzb);
        contentValues.put("name", zzopVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzopVar.zzd));
        zza(contentValues, "value", zzopVar.zze);
        try {
            if (e_().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzgo.zza(zzopVar.zza));
            }
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing user property. appId", zzgo.zza(zzopVar.zza), e2);
        }
        return true;
    }

    public final boolean zza(String str, zzfy.zzj zzjVar, String str2, Map<String, String> map, zznt zzntVar) {
        int iDelete;
        zzt();
        zzal();
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotEmpty(str);
        if (zzpu.zza() && !zze().zza(zzbh.zzcb)) {
            return false;
        }
        zzt();
        zzal();
        if (zzaa()) {
            long jZza = zzn().zzb.zza();
            long jElapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jZza) > zzag.zzn()) {
                zzn().zzb.zza(jElapsedRealtime);
                zzt();
                zzal();
                if (zzaa() && (iDelete = e_().delete("upload_queue", zzao(), new String[0])) > 0) {
                    zzj().zzp().zza("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        byte[] bArrZzca = zzjVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrZzca);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i2 = 1;
            while (i2 < size) {
                sb.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i2);
                i2++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(zzntVar.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzb().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        try {
            if (e_().insert("upload_queue", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return false;
        }
    }

    public final boolean zza(String str, zzno zznoVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zznoVar);
        Preconditions.checkNotEmpty(str);
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        if (zznoVar.zzb < jCurrentTimeMillis - zzbh.zzbh.zza(null).longValue() || zznoVar.zzb > zzbh.zzbh.zza(null).longValue() + jCurrentTimeMillis) {
            zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgo.zza(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zznoVar.zzb));
        }
        zzj().zzp().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zznoVar.zza);
        contentValues.put("source", Integer.valueOf(zznoVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zznoVar.zzb));
        try {
            if (e_().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing trigger URI. appId", zzgo.zza(str), e2);
            return false;
        }
    }

    public final boolean zza(String str, Long l2, long j2, zzfy.zzf zzfVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzfVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l2);
        byte[] bArrZzca = zzfVar.zzca();
        zzj().zzp().zza("Saving complex main event, appId, data size", zzi().zza(str), Integer.valueOf(bArrZzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrZzca);
        try {
            if (e_().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing complex main event. appId", zzgo.zza(str), e2);
            return false;
        }
    }

    protected final boolean zzaa() throws Throwable {
        Context contextZza = zza();
        String strOd = EO.Od("nHVi F(\u0012\u007fP9-oigL\u0016rC'n9`\u0013o", (short) (Od.Xd() ^ (-1271)));
        Class<?> cls = Class.forName(C1561oA.Qd("\u0012\u001e\u0013 \u001c\u0015\u000fW\f\u0017\u0015\u001a\n\u0012\u0017Oc\u000f\r\u0012\u0002\u0014\u000f", (short) (OY.Xd() ^ 13978)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (FB.Xd() ^ 728);
        short sXd2 = (short) (FB.Xd() ^ 30854);
        int[] iArr = new int["\u0018\u0010&\u0012_\u001f\u0015#\u001dd\u000b-,$*$".length()];
        QB qb = new QB("\u0018\u0010&\u0012_\u001f\u0015#\u001dd\u000b-,$*$");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strOd};
        Method method = cls.getMethod(C1561oA.od("~{\nXt\u0007rrp\u0002r\\l~q", (short) (Od.Xd() ^ (-16036))), clsArr);
        try {
            method.setAccessible(true);
            return ((File) method.invoke(contextZza, objArr)).exists();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        return zza("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    protected final long zzb(String str, String str2) {
        long jZza;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        SQLiteDatabase sQLiteDatabaseE_ = e_();
        sQLiteDatabaseE_.beginTransaction();
        long j2 = 0;
        try {
            try {
                jZza = zza("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
            } catch (SQLiteException e2) {
                e = e2;
            }
            if (jZza == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (sQLiteDatabaseE_.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    zzj().zzg().zza("Failed to insert column (got -1). appId", zzgo.zza(str), str2);
                    return -1L;
                }
                jZza = 0;
                zzj().zzg().zza("Error inserting column. appId", zzgo.zza(str), str2, e);
                sQLiteDatabaseE_.endTransaction();
                return j2;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + jZza));
                if (sQLiteDatabaseE_.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    zzj().zzg().zza("Failed to update column (got 0). appId", zzgo.zza(str), str2);
                    return -1L;
                }
                sQLiteDatabaseE_.setTransactionSuccessful();
                return jZza;
            } catch (SQLiteException e3) {
                e = e3;
                j2 = jZza;
            }
        } finally {
            sQLiteDatabaseE_.endTransaction();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x00a2, code lost:
    
        zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ee A[LOOP:0: B:94:0x009a->B:107:0x00ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ed A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzop> zzb(java.lang.String r21, java.lang.String r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void zzb(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjeVar.zzf());
        contentValues.put("consent_source", Integer.valueOf(zzjeVar.zza()));
        zza("consent_settings", "app_id", contentValues);
    }

    final boolean zzb(String str, Bundle bundle) {
        zzt();
        zzal();
        byte[] bArrZzca = g_().zza(new zzbc(this.zzu, "", str, "dep", 0L, 0L, bundle)).zzca();
        zzj().zzp().zza("Saving default event parameters, appId, data size", zzi().zza(str), Integer.valueOf(bArrZzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrZzca);
        try {
            if (e_().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing default event parameters. appId", zzgo.zza(str), e2);
            return false;
        }
    }

    public final long zzc(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzae zzc(java.lang.String r32, java.lang.String r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzae");
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0087: MOVE (r5 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:70:0x0087 */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle zzd(java.lang.String r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.zzt()
            r6.zzal()
            r5 = 0
            android.database.sqlite.SQLiteDatabase r3 = r6.e_()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L89
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L89
            r1 = 0
            r0[r1] = r7     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L89
            android.database.Cursor r4 = r3.rawQuery(r2, r0)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L89
            boolean r0 = r4.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.zzgo r0 = r6.zzj()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzp()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            java.lang.String r0 = "Default event parameters not found"
            r1.zza(r0)     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            if (r4 == 0) goto L2f
            r4.close()
        L2f:
            return r5
        L30:
            byte[] r1 = r4.getBlob(r1)     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r0 = com.google.android.gms.internal.measurement.zzfy.zzf.zze()     // Catch: java.io.IOException -> L57 android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            com.google.android.gms.internal.measurement.zzlb r0 = com.google.android.gms.measurement.internal.zzoo.zza(r0, r1)     // Catch: java.io.IOException -> L57 android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r0 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza) r0     // Catch: java.io.IOException -> L57 android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            com.google.android.gms.internal.measurement.zzlc r0 = r0.zzai()     // Catch: java.io.IOException -> L57 android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            com.google.android.gms.internal.measurement.zzjt r0 = (com.google.android.gms.internal.measurement.zzjt) r0     // Catch: java.io.IOException -> L57 android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            com.google.android.gms.internal.measurement.zzfy$zzf r0 = (com.google.android.gms.internal.measurement.zzfy.zzf) r0     // Catch: java.io.IOException -> L57 android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            r6.g_()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            java.util.List r0 = r0.zzh()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            android.os.Bundle r0 = com.google.android.gms.measurement.internal.zzoo.zza(r0)     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            if (r4 == 0) goto L56
            r4.close()
        L56:
            return r0
        L57:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzgo r0 = r6.zzj()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzgq r2 = r0.zzg()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            java.lang.String r1 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzgo.zza(r7)     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            r2.zza(r1, r0, r3)     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.Throwable -> L86
            if (r4 == 0) goto L6e
            r4.close()
        L6e:
            return r5
        L6f:
            r2 = move-exception
            goto L73
        L71:
            r2 = move-exception
            r4 = r5
        L73:
            com.google.android.gms.measurement.internal.zzgo r0 = r6.zzj()     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzg()     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "Error selecting default event parameters"
            r1.zza(r0, r2)     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L85
            r4.close()
        L85:
            return r5
        L86:
            r0 = move-exception
            r5 = r4
            goto L8a
        L89:
            r0 = move-exception
        L8a:
            if (r5 == 0) goto L8f
            r5.close()
        L8f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzd(java.lang.String):android.os.Bundle");
    }

    public final zzbb zzd(String str, String str2) {
        return zzc("events", str, str2);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0427: MOVE (r10 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:249:0x0427 */
    /* JADX WARN: Removed duplicated region for block: B:252:0x042c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzg zze(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zze(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzop zze(java.lang.String r23, java.lang.String r24) {
        /*
            r22 = this;
            r16 = r23
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r16)
            r1 = r24
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            r22.zzt()
            r22.zzal()
            r7 = 0
            android.database.sqlite.SQLiteDatabase r8 = r22.e_()     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L88
            java.lang.String r9 = "user_attributes"
            r0 = 3
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L88
            java.lang.String r0 = "set_timestamp"
            r4 = 0
            r10[r4] = r0     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L88
            java.lang.String r0 = "value"
            r3 = 1
            r10[r3] = r0     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L88
            java.lang.String r0 = "origin"
            r2 = 2
            r10[r2] = r0     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L88
            java.lang.String r11 = "app_id=? and name=?"
            java.lang.String[] r12 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L88
            r12[r4] = r16     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L88
            r12[r3] = r1     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L88
            r14 = 0
            r15 = 0
            r13 = 0
            android.database.Cursor r6 = r8.query(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L88
            boolean r0 = r6.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lad
            if (r0 != 0) goto L44
            if (r6 == 0) goto L43
            r6.close()
        L43:
            return r7
        L44:
            long r19 = r6.getLong(r4)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lad
            r0 = r22
            java.lang.Object r21 = r0.zza(r6, r3)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> Lab
            if (r21 != 0) goto L56
            if (r6 == 0) goto L55
            r6.close()
        L55:
            return r7
        L56:
            java.lang.String r17 = r6.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> Lab
            com.google.android.gms.measurement.internal.zzop r15 = new com.google.android.gms.measurement.internal.zzop     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> Lab
            r18 = r1
            r15.<init>(r16, r17, r18, r19, r21)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> Lab
            boolean r0 = r6.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> Lab
            if (r0 == 0) goto L78
            com.google.android.gms.measurement.internal.zzgo r0 = r22.zzj()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> Lab
            com.google.android.gms.measurement.internal.zzgq r3 = r0.zzg()     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> Lab
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzgo.zza(r16)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> Lab
            r3.zza(r2, r0)     // Catch: android.database.sqlite.SQLiteException -> L7e java.lang.Throwable -> Lab
        L78:
            if (r6 == 0) goto L7d
            r6.close()
        L7d:
            return r15
        L7e:
            r5 = move-exception
            goto L8c
        L80:
            r5 = move-exception
            r0 = r22
            goto L8c
        L84:
            r0 = move-exception
            r1 = r22
            goto Lb1
        L88:
            r5 = move-exception
            r0 = r22
            r6 = r7
        L8c:
            com.google.android.gms.measurement.internal.zzgo r0 = r22.zzj()     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.measurement.internal.zzgq r4 = r0.zzg()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgo.zza(r16)     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.measurement.internal.zzgh r0 = r22.zzi()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r0.zzc(r1)     // Catch: java.lang.Throwable -> Lab
            r4.zza(r3, r2, r0, r5)     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto Laa
            r6.close()
        Laa:
            return r7
        Lab:
            r0 = move-exception
            goto Lb0
        Lad:
            r0 = move-exception
            r1 = r22
        Lb0:
            r7 = r6
        Lb1:
            if (r7 == 0) goto Lb6
            r7.close()
        Lb6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zze(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzop");
    }

    public final zzan zzf(String str) throws Throwable {
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        Cursor cursor = null;
        try {
            cursorQuery = e_().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                if (!cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                byte[] blob = cursorQuery.getBlob(0);
                String string = cursorQuery.getString(1);
                String string2 = cursorQuery.getString(2);
                if (cursorQuery.moveToNext()) {
                    zzj().zzg().zza("Got multiple records for app config, expected one. appId", zzgo.zza(str));
                }
                if (blob == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                zzan zzanVar = new zzan(blob, string, string2);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return zzanVar;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e3) {
            e = e3;
            zzj().zzg().zza("Error querying remote config. appId", zzgo.zza(str), e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        }
        th = th2;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    final Map<Integer, List<zzfo.zzb>> zzf(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<zzfo.zzb>> mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return mapEmptyMap;
                }
                do {
                    try {
                        zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), cursorQuery.getBlob(1))).zzai());
                        int i2 = cursorQuery.getInt(0);
                        List arrayList = (List) arrayMap.get(Integer.valueOf(i2));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayMap.put(Integer.valueOf(i2), arrayList);
                        }
                        arrayList.add(zzbVar);
                    } catch (IOException e2) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e2);
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayMap;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e3);
                Map<Integer, List<zzfo.zzb>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final zzax zzg(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzax.zza(zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    final Map<Integer, List<zzfo.zze>> zzg(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = e_().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<zzfo.zze>> mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return mapEmptyMap;
                }
                do {
                    try {
                        zzfo.zze zzeVar = (zzfo.zze) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zze.zza) zzoo.zza(zzfo.zze.zzc(), cursorQuery.getBlob(1))).zzai());
                        int i2 = cursorQuery.getInt(0);
                        List arrayList = (List) arrayMap.get(Integer.valueOf(i2));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayMap.put(Integer.valueOf(i2), arrayList);
                        }
                        arrayList.add(zzeVar);
                    } catch (IOException e2) {
                        zzj().zzg().zza("Failed to merge filter", zzgo.zza(str), e2);
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayMap;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e3);
                Map<Integer, List<zzfo.zze>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final zzje zzh(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzje.zzb(zza("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void zzh(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            e_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error deleting user property. appId", zzgo.zza(str), zzi().zzc(str2), e2);
        }
    }

    public final zzje zzi(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        zzje zzjeVar = (zzje) zza("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new zzau() { // from class: com.google.android.gms.measurement.internal.zzao
            @Override // com.google.android.gms.measurement.internal.zzau
            public final Object zza(Cursor cursor) {
                return zzje.zza(cursor.getString(0), cursor.getInt(1));
            }
        });
        return zzjeVar == null ? zzje.zza : zzjeVar;
    }

    public final zzoj zzj(String str) throws Throwable {
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        Cursor cursor = null;
        if (zzpu.zza() && !zze().zza(zzbh.zzcb)) {
            return null;
        }
        try {
            cursorQuery = e_().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, "app_id=? AND NOT " + zzao(), new String[]{str}, null, null, "creation_timestamp ASC", "1");
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                if (!cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                String string = cursorQuery.getString(3);
                if (TextUtils.isEmpty(string)) {
                    zzj().zzc().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                try {
                    zzfy.zzj.zza zzaVar = (zzfy.zzj.zza) zzoo.zza(zzfy.zzj.zzb(), cursorQuery.getBlob(2));
                    zznt zzntVar = zznt.values()[cursorQuery.getInt(5)];
                    if ((zzntVar == zznt.SGTM || zzntVar == zznt.GOOGLE_ANALYTICS) && cursorQuery.getInt(6) > 0) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<zzfy.zzk> it = zzaVar.zzd().iterator();
                        while (it.hasNext()) {
                            zzfy.zzk.zza zzaVarZzcd = it.next().zzcd();
                            zzfy.zzk.zza zzaVar2 = zzaVarZzcd;
                            zzfy.zzk.zza zzaVar3 = zzaVarZzcd;
                            zzaVar3.zzi(cursorQuery.getInt(6));
                            arrayList.add((zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzaVar3.zzai()));
                        }
                        zzaVar.zzb();
                        zzaVar.zza(arrayList);
                    }
                    HashMap map = new HashMap();
                    String string2 = cursorQuery.getString(4);
                    if (string2 != null) {
                        String[] strArrSplit = string2.split("\r\n");
                        int length = strArrSplit.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            String str2 = strArrSplit[i2];
                            if (str2.isEmpty()) {
                                break;
                            }
                            String[] strArrSplit2 = str2.split("=", 2);
                            if (strArrSplit2.length != 2) {
                                zzj().zzg().zza("Invalid upload header: ", str2);
                                break;
                            }
                            map.put(strArrSplit2[0], strArrSplit2[1]);
                            i2++;
                        }
                    }
                    zzoj zzojVarZza = new zzom().zza(cursorQuery.getLong(0)).zza((zzfy.zzj) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai())).zza(string).zza(map).zza(zzntVar).zza();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return zzojVarZza;
                } catch (IOException e3) {
                    zzj().zzg().zza("Failed to queued MeasurementBatch from upload_queue. appId", str, e3);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (SQLiteException e4) {
                e = e4;
                zzj().zzg().zza("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = cursorQuery;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<zzno> zzk(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = e_().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new zzno(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error querying trigger uris. appId", zzgo.zza(str), e2);
                List<zzno> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzop> zzl(java.lang.String r23) throws java.lang.Throwable {
        /*
            r22 = this;
            r16 = r23
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r16)
            r22.zzt()
            r22.zzal()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r7 = r22.e_()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            java.lang.String r8 = "user_attributes"
            r1 = 4
            java.lang.String[] r9 = new java.lang.String[r1]     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            java.lang.String r1 = "name"
            r2 = 0
            r9[r2] = r1     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            java.lang.String r4 = "origin"
            r1 = 1
            r9[r1] = r4     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            java.lang.String r4 = "set_timestamp"
            r5 = 2
            r9[r5] = r4     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            java.lang.String r6 = "value"
            r4 = 3
            r9[r4] = r6     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            java.lang.String r10 = "app_id=?"
            java.lang.String[] r11 = new java.lang.String[r1]     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            r11[r2] = r16     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            java.lang.String r14 = "rowid"
            java.lang.String r15 = "1000"
            r12 = 0
            r13 = 0
            android.database.Cursor r0 = r7.query(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            boolean r6 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            if (r6 != 0) goto L4a
            if (r0 == 0) goto L49
            r0.close()
        L49:
            return r3
        L4a:
            java.lang.String r18 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            java.lang.String r17 = r0.getString(r1)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            if (r17 != 0) goto L56
            java.lang.String r17 = ""
        L56:
            long r19 = r0.getLong(r5)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lab
            r6 = r22
            java.lang.Object r21 = r6.zza(r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> La9
            if (r21 != 0) goto L78
            com.google.android.gms.measurement.internal.zzgo r6 = r22.zzj()     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> La9
            com.google.android.gms.measurement.internal.zzgq r8 = r6.zzg()     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> La9
            java.lang.String r7 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgo.zza(r16)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> La9
            r8.zza(r7, r6)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> La9
        L73:
            boolean r6 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> La9
            goto L81
        L78:
            com.google.android.gms.measurement.internal.zzop r15 = new com.google.android.gms.measurement.internal.zzop     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> La9
            r15.<init>(r16, r17, r18, r19, r21)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> La9
            r3.add(r15)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> La9
            goto L73
        L81:
            if (r6 != 0) goto L4a
            if (r0 == 0) goto L88
            r0.close()
        L88:
            return r3
        L89:
            r4 = move-exception
            goto L8e
        L8b:
            r4 = move-exception
            r1 = r22
        L8e:
            com.google.android.gms.measurement.internal.zzgo r1 = r22.zzj()     // Catch: java.lang.Throwable -> La9
            com.google.android.gms.measurement.internal.zzgq r3 = r1.zzg()     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = "Error querying user properties. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzgo.zza(r16)     // Catch: java.lang.Throwable -> La9
            r3.zza(r2, r1, r4)     // Catch: java.lang.Throwable -> La9
            java.util.List r1 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto La8
            r0.close()
        La8:
            return r1
        La9:
            r1 = move-exception
            goto Lae
        Lab:
            r1 = move-exception
            r2 = r22
        Lae:
            if (r0 == 0) goto Lb3
            r0.close()
        Lb3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzl(java.lang.String):java.util.List");
    }

    final Map<Integer, zzfy.zzm> zzm(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = e_().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, zzfy.zzm> mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return mapEmptyMap;
                }
                ArrayMap arrayMap = new ArrayMap();
                do {
                    int i2 = cursorQuery.getInt(0);
                    try {
                        arrayMap.put(Integer.valueOf(i2), (zzfy.zzm) ((com.google.android.gms.internal.measurement.zzjt) ((zzfy.zzm.zza) zzoo.zza(zzfy.zzm.zze(), cursorQuery.getBlob(1))).zzai()));
                    } catch (IOException e2) {
                        zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzgo.zza(str), Integer.valueOf(i2), e2);
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayMap;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Database error querying filter results. appId", zzgo.zza(str), e3);
                Map<Integer, zzfy.zzm> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    final Map<Integer, List<zzfo.zzb>> zzn(String str) {
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<zzfo.zzb>> mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return mapEmptyMap;
                }
                do {
                    try {
                        zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), cursorQuery.getBlob(1))).zzai());
                        if (zzbVar.zzk()) {
                            int i2 = cursorQuery.getInt(0);
                            List arrayList = (List) arrayMap.get(Integer.valueOf(i2));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                arrayMap.put(Integer.valueOf(i2), arrayList);
                            }
                            arrayList.add(zzbVar);
                        }
                    } catch (IOException e2) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e2);
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayMap;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e3);
                Map<Integer, List<zzfo.zzb>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    final Map<Integer, List<Integer>> zzo(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = e_().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!cursorRawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> mapEmptyMap = Collections.emptyMap();
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return mapEmptyMap;
                }
                do {
                    int i2 = cursorRawQuery.getInt(0);
                    List arrayList = (List) arrayMap.get(Integer.valueOf(i2));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        arrayMap.put(Integer.valueOf(i2), arrayList);
                    }
                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                } while (cursorRawQuery.moveToNext());
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying scoped filters. appId", zzgo.zza(str), e2);
                Map<Integer, List<Integer>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzp() {
        zzal();
        e_().beginTransaction();
    }

    public final void zzp(String str) {
        zzt();
        zzal();
        try {
            e_().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error clearing default event params", e2);
        }
    }

    public final void zzq(String str) {
        zzbb zzbbVarZzd;
        zzi("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = e_().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return;
                    }
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (zzbbVarZzd = zzd(str, string)) != null) {
                        zza("events_snapshot", zzbbVarZzd);
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error creating snapshot. appId", zzgo.zza(str), e2);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzr(java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzr(java.lang.String):void");
    }

    public final boolean zzs(String str) {
        return (!zzpu.zza() || zze().zza(zzbh.zzcb)) && zzb(new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ").append(zzao()).toString(), new String[]{str}) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean zzt(java.lang.String r11) {
        /*
            r10 = this;
            r7 = 1
            r6 = 0
            r5 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.e_()     // Catch: android.database.sqlite.SQLiteException -> L42 java.lang.Throwable -> L6a
            java.lang.String r1 = "select timestamp from raw_events where app_id=? and name = '_f' limit 1;"
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch: android.database.sqlite.SQLiteException -> L42 java.lang.Throwable -> L6a
            r0[r6] = r11     // Catch: android.database.sqlite.SQLiteException -> L42 java.lang.Throwable -> L6a
            android.database.Cursor r5 = r2.rawQuery(r1, r0)     // Catch: android.database.sqlite.SQLiteException -> L42 java.lang.Throwable -> L6a
            boolean r0 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L42 java.lang.Throwable -> L6a
            if (r0 != 0) goto L1d
            if (r5 == 0) goto L1c
            r5.close()
        L1c:
            return r6
        L1d:
            long r8 = r5.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L42 java.lang.Throwable -> L6a
            com.google.android.gms.common.util.Clock r0 = r10.zzb()     // Catch: android.database.sqlite.SQLiteException -> L42 java.lang.Throwable -> L6a
            long r2 = r0.currentTimeMillis()     // Catch: android.database.sqlite.SQLiteException -> L42 java.lang.Throwable -> L6a
            r0 = 15000(0x3a98, double:7.411E-320)
            long r8 = r8 + r0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L32
            r8 = r7
            goto L33
        L32:
            r8 = r6
        L33:
            java.lang.String r1 = "select count(*) from raw_events where app_id=? and name not like '!_%' escape '!' limit 1;"
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L6a
            r0[r6] = r11     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L6a
            r3 = 0
            long r1 = r10.zza(r1, r0, r3)     // Catch: android.database.sqlite.SQLiteException -> L40 java.lang.Throwable -> L6a
            goto L58
        L40:
            r2 = move-exception
            goto L44
        L42:
            r2 = move-exception
            r8 = r6
        L44:
            com.google.android.gms.measurement.internal.zzgo r0 = r10.zzj()     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzg()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "Error checking backfill conditions"
            r1.zza(r0, r2)     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L56
            r5.close()
        L56:
            r0 = r6
            goto L62
        L58:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L67
            r0 = r7
        L5d:
            if (r5 == 0) goto L62
            r5.close()
        L62:
            if (r8 == 0) goto L69
            if (r0 != 0) goto L69
            return r7
        L67:
            r0 = r6
            goto L5d
        L69:
            return r6
        L6a:
            r0 = move-exception
            if (r5 == 0) goto L70
            r5.close()
        L70:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzt(java.lang.String):boolean");
    }

    public final void zzu() {
        zzal();
        e_().endTransaction();
    }

    final void zzv() {
        int iDelete;
        zzt();
        zzal();
        if (zzaa()) {
            long jZza = zzn().zza.zza();
            long jElapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jZza) > zzag.zzn()) {
                zzn().zza.zza(jElapsedRealtime);
                zzt();
                zzal();
                if (!zzaa() || (iDelete = e_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(zzag.zzm())})) <= 0) {
                    return;
                }
                zzj().zzp().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    public final void zzw() {
        zzal();
        e_().setTransactionSuccessful();
    }

    public final boolean zzx() {
        return zzb("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }
}
