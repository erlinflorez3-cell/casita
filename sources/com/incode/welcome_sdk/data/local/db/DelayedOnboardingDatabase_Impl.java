package com.incode.welcome_sdk.data.local.db;

import androidx.core.provider.FontsContractCompat;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.incode.welcome_sdk.data.local.db.c.a.aa;
import com.incode.welcome_sdk.data.local.db.c.a.ab;
import com.incode.welcome_sdk.data.local.db.c.a.ac;
import com.incode.welcome_sdk.data.local.db.c.a.ad;
import com.incode.welcome_sdk.data.local.db.c.a.ae;
import com.incode.welcome_sdk.data.local.db.c.a.af;
import com.incode.welcome_sdk.data.local.db.c.a.ah;
import com.incode.welcome_sdk.data.local.db.c.a.ai;
import com.incode.welcome_sdk.data.local.db.c.a.f;
import com.incode.welcome_sdk.data.local.db.c.a.g;
import com.incode.welcome_sdk.data.local.db.c.a.h;
import com.incode.welcome_sdk.data.local.db.c.a.i;
import com.incode.welcome_sdk.data.local.db.c.a.j;
import com.incode.welcome_sdk.data.local.db.c.a.k;
import com.incode.welcome_sdk.data.local.db.c.a.l;
import com.incode.welcome_sdk.data.local.db.c.a.m;
import com.incode.welcome_sdk.data.local.db.c.a.n;
import com.incode.welcome_sdk.data.local.db.c.a.o;
import com.incode.welcome_sdk.data.local.db.c.a.p;
import com.incode.welcome_sdk.data.local.db.c.a.q;
import com.incode.welcome_sdk.data.local.db.c.a.r;
import com.incode.welcome_sdk.data.local.db.c.a.s;
import com.incode.welcome_sdk.data.local.db.c.a.t;
import com.incode.welcome_sdk.data.local.db.c.a.u;
import com.incode.welcome_sdk.data.local.db.c.a.v;
import com.incode.welcome_sdk.data.local.db.c.a.w;
import com.incode.welcome_sdk.data.local.db.c.a.x;
import com.incode.welcome_sdk.data.local.db.c.a.y;
import com.incode.welcome_sdk.data.local.db.c.a.z;
import com.incode.welcome_sdk.ui.tutorial.TutorialPresenterModule;
import com.npmdavi.davinotification.DatabaseHelper;
import io.sentry.protocol.Geo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class DelayedOnboardingDatabase_Impl extends DelayedOnboardingDatabase {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f7971s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f7972t = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.incode.welcome_sdk.data.local.db.c.a.d f7973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile n f7974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile p f7975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile ai f7976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile w f7977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile u f7978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile y f7979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile q f7980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile ad f7981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile f f7982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile o f7983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile h f7984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile ac f7985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile af f7986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile k f7987o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile com.incode.welcome_sdk.data.local.db.c.a.b f7988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile com.incode.welcome_sdk.data.local.db.c.a.e f7989r;

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~(i8 | i2);
        int i10 = (~(i6 | i5)) | i9;
        int i11 = (~(i5 | (~i2))) | (~((~i6) | i8)) | i9;
        int i12 = i8 | i6 | i2;
        int i13 = i6 + i2 + i3 + (1050315579 * i4) + (2086215248 * i7);
        int i14 = i13 * i13;
        int i15 = (i6 * (-1156115713)) + 1671168000 + ((-1156115713) * i2) + ((-1856302338) * i10) + (i11 * 1856302338) + (1856302338 * i12) + (700186624 * i3) + ((-1303117824) * i4) + (314572800 * i7) + (431423488 * i14);
        int i16 = ((i6 * (-961373039)) - 1316831794) + (i2 * (-961373039)) + (i10 * (-990)) + (i11 * 990) + (i12 * 990) + (i3 * (-961372049)) + (i4 * 755842709) + (i7 * (-1858722640)) + (i14 * (-2040987648));
        int i17 = i15 + (i16 * i16 * 1361641472);
        if (i17 == 1) {
            return b(objArr);
        }
        if (i17 == 2) {
            return d(objArr);
        }
        if (i17 == 3) {
            return e(objArr);
        }
        if (i17 == 4) {
            return c(objArr);
        }
        int i18 = 2 % 2;
        InvalidationTracker invalidationTracker = new InvalidationTracker((DelayedOnboardingDatabase_Impl) objArr[0], new HashMap(0), new HashMap(0), "delayed_onboarding", "session_config", "flow_config", "module_types", "flow_modules", "id_scan", "id_scan_result", "process_id", "process_id_result", "document_scan", "document_scan_result", "selfie_scan", "selfie_scan_result", "face_match", "face_match_result", "combined_consent", "combined_consent_result");
        int i19 = f7971s + 9;
        f7972t = i19 % 128;
        int i20 = i19 % 2;
        return invalidationTracker;
    }

    static /* synthetic */ List a(DelayedOnboardingDatabase_Impl delayedOnboardingDatabase_Impl) {
        int i2 = 2 % 2;
        int i3 = f7972t + 43;
        f7971s = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        List<? extends RoomDatabase.Callback> list = delayedOnboardingDatabase_Impl.mCallbacks;
        if (i4 != 0) {
            throw null;
        }
        int i5 = f7972t + 57;
        f7971s = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ List b(DelayedOnboardingDatabase_Impl delayedOnboardingDatabase_Impl) {
        int i2 = 2 % 2;
        int i3 = f7971s + 105;
        f7972t = i3 % 128;
        int i4 = i3 % 2;
        List<? extends RoomDatabase.Callback> list = delayedOnboardingDatabase_Impl.mCallbacks;
        if (i4 == 0) {
            int i5 = 29 / 0;
        }
        int i6 = f7972t + 95;
        f7971s = i6 % 128;
        if (i6 % 2 == 0) {
            return list;
        }
        throw null;
    }

    static /* synthetic */ SupportSQLiteDatabase c(DelayedOnboardingDatabase_Impl delayedOnboardingDatabase_Impl, SupportSQLiteDatabase supportSQLiteDatabase) {
        int i2 = 2 % 2;
        int i3 = f7971s + 39;
        f7972t = i3 % 128;
        int i4 = i3 % 2;
        delayedOnboardingDatabase_Impl.mDatabase = supportSQLiteDatabase;
        int i5 = f7971s + 9;
        f7972t = i5 % 128;
        int i6 = i5 % 2;
        return supportSQLiteDatabase;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        DelayedOnboardingDatabase_Impl delayedOnboardingDatabase_Impl = (DelayedOnboardingDatabase_Impl) objArr[0];
        SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) objArr[1];
        int i2 = 2 % 2;
        int i3 = f7971s + 53;
        f7972t = i3 % 128;
        int i4 = i3 % 2;
        delayedOnboardingDatabase_Impl.internalInitInvalidationTracker(supportSQLiteDatabase);
        int i5 = f7971s + 55;
        f7972t = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return null;
    }

    static /* synthetic */ List d(DelayedOnboardingDatabase_Impl delayedOnboardingDatabase_Impl) {
        int i2 = 2 % 2;
        int i3 = f7972t + 57;
        f7971s = i3 % 128;
        int i4 = i3 % 2;
        List<? extends RoomDatabase.Callback> list = delayedOnboardingDatabase_Impl.mCallbacks;
        int i5 = f7972t + 27;
        f7971s = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    protected final SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        int i2 = 2 % 2;
        SupportSQLiteOpenHelper supportSQLiteOpenHelperCreate = databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate() { // from class: com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase_Impl.5

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f7990c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f7991e = 0;

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                int i3 = 2 % 2;
                int i4 = f7991e + 89;
                f7990c = i4 % 128;
                int i5 = i4 % 2;
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `delayed_onboarding` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `session_config_id` INTEGER NOT NULL, `flow_config_id` INTEGER NOT NULL, `is_completed` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `result_code` TEXT)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `session_config` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `interview_id` TEXT, `configuration_id` TEXT, `validation_module_list` TEXT NOT NULL, `region_iso_code` TEXT, `queue_name` TEXT, `external_id` TEXT, `external_customer_id` TEXT, `external_token` TEXT, `custom_fields` TEXT)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `flow_config` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `flow_tag` TEXT)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `module_types` (`table_name` TEXT NOT NULL, PRIMARY KEY(`table_name`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `flow_modules` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `flow_config_id` INTEGER NOT NULL, `module_type_name` TEXT NOT NULL, `module_id` INTEGER NOT NULL, `module_index` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `id_scan` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `front_id_image_path` TEXT, `back_id_image_path` TEXT, `id_type` TEXT, `is_second_id` INTEGER NOT NULL, `scan_step` TEXT, `capture_type` INTEGER NOT NULL, `is_completed` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `id_scan_result` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id_scan_id` INTEGER NOT NULL, `scan_step` TEXT, `classification` INTEGER NOT NULL, `readability` INTEGER NOT NULL, `type_of_id` TEXT NOT NULL, `issue_name` TEXT NOT NULL, `issue_year` INTEGER NOT NULL, `country_code` TEXT NOT NULL, `result_code` TEXT NOT NULL, `error` TEXT, `fail_reason` TEXT NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `process_id` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_completed` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `process_id_result` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `process_id` INTEGER NOT NULL, `ocr_data` TEXT, `extended_ocr_data` TEXT, `result_code` TEXT, `error` TEXT)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `document_scan` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `document_path` TEXT, `document_type` TEXT, `mime_type` TEXT, `is_completed` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `document_scan_result` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `document_scan_id` INTEGER NOT NULL, `is_success` INTEGER NOT NULL, `document_Type` TEXT, `document_ocr_data` TEXT, `document_extended_ocr_data` TEXT, `error` TEXT)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `selfie_scan` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `image_path` TEXT, `face_coordinates` TEXT, `capture_type` INTEGER NOT NULL, `is_completed` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `selfie_scan_result` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `selfie_scan_id` INTEGER NOT NULL, `is_spoof_attempt` INTEGER NOT NULL, `result_code` TEXT NOT NULL, `error` TEXT)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `face_match` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `match_type` TEXT NOT NULL, `is_completed` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `face_match_result` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `face_match_id` INTEGER NOT NULL, `face_match_confidence` REAL NOT NULL, `is_face_matched` INTEGER NOT NULL, `is_existing_user` INTEGER NOT NULL, `existing_interview_id` TEXT NOT NULL, `is_name_matched` INTEGER NOT NULL, `result_code` TEXT NOT NULL, `error` TEXT NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `combined_consent` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `language_consent_id` TEXT NOT NULL, `consents` TEXT NOT NULL, `is_completed` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `combined_consent_result` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `result_code` TEXT NOT NULL, `error` TEXT)");
                supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '06f0e639c3288709acc37921d6686dd0')");
                int i6 = f7990c + 27;
                f7991e = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                Iterator it;
                int i3 = 2 % 2;
                int i4 = f7990c + 27;
                f7991e = i4 % 128;
                int i5 = i4 % 2;
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `delayed_onboarding`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `session_config`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `flow_config`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `module_types`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `flow_modules`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `id_scan`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `id_scan_result`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `process_id`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `process_id_result`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `document_scan`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `document_scan_result`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `selfie_scan`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `selfie_scan_result`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `face_match`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `face_match_result`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `combined_consent`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `combined_consent_result`");
                List listA = DelayedOnboardingDatabase_Impl.a(DelayedOnboardingDatabase_Impl.this);
                if (listA != null) {
                    int i6 = f7991e + 59;
                    f7990c = i6 % 128;
                    if (i6 % 2 == 0) {
                        it = listA.iterator();
                        int i7 = 35 / 0;
                    } else {
                        it = listA.iterator();
                    }
                    while (it.hasNext()) {
                        int i8 = f7991e + 69;
                        f7990c = i8 % 128;
                        if (i8 % 2 != 0) {
                            ((RoomDatabase.Callback) it.next()).onDestructiveMigration(supportSQLiteDatabase);
                            int i9 = f7990c + 35;
                            f7991e = i9 % 128;
                            int i10 = i9 % 2;
                        } else {
                            ((RoomDatabase.Callback) it.next()).onDestructiveMigration(supportSQLiteDatabase);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                int i3 = 2 % 2;
                int i4 = f7991e + 7;
                f7990c = i4 % 128;
                int i5 = i4 % 2;
                List listB = DelayedOnboardingDatabase_Impl.b(DelayedOnboardingDatabase_Impl.this);
                if (listB != null) {
                    int i6 = f7991e + 7;
                    f7990c = i6 % 128;
                    if (i6 % 2 != 0) {
                        Iterator it = listB.iterator();
                        while (it.hasNext()) {
                            ((RoomDatabase.Callback) it.next()).onCreate(supportSQLiteDatabase);
                        }
                        return;
                    }
                    listB.iterator();
                    throw null;
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                int i3 = 2 % 2;
                DelayedOnboardingDatabase_Impl.c(DelayedOnboardingDatabase_Impl.this, supportSQLiteDatabase);
                DelayedOnboardingDatabase_Impl.e(DelayedOnboardingDatabase_Impl.this, supportSQLiteDatabase);
                List listD = DelayedOnboardingDatabase_Impl.d(DelayedOnboardingDatabase_Impl.this);
                if (listD != null) {
                    int i4 = f7991e + 103;
                    f7990c = i4 % 128;
                    if (i4 % 2 != 0) {
                        Iterator it = listD.iterator();
                        while (it.hasNext()) {
                            int i5 = f7990c + 29;
                            f7991e = i5 % 128;
                            if (i5 % 2 != 0) {
                                ((RoomDatabase.Callback) it.next()).onOpen(supportSQLiteDatabase);
                                int i6 = 56 / 0;
                            } else {
                                ((RoomDatabase.Callback) it.next()).onOpen(supportSQLiteDatabase);
                            }
                        }
                        return;
                    }
                    listD.iterator();
                    throw null;
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
                int i3 = 2 % 2;
                int i4 = f7990c + 103;
                f7991e = i4 % 128;
                if (i4 % 2 != 0) {
                    DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
                    int i5 = 44 / 0;
                } else {
                    DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                int i3 = 2 % 2;
                int i4 = f7990c + 81;
                f7991e = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                int i3 = 2 % 2;
                HashMap map = new HashMap(6);
                map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map.put("session_config_id", new TableInfo.Column("session_config_id", "INTEGER", true, 0, null, 1));
                map.put("flow_config_id", new TableInfo.Column("flow_config_id", "INTEGER", true, 0, null, 1));
                map.put("is_completed", new TableInfo.Column("is_completed", "INTEGER", true, 0, null, 1));
                map.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, 1));
                map.put(FontsContractCompat.Columns.RESULT_CODE, new TableInfo.Column(FontsContractCompat.Columns.RESULT_CODE, "TEXT", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("delayed_onboarding", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "delayed_onboarding");
                if (!tableInfo.equals(tableInfo2)) {
                    RoomOpenHelper.ValidationResult validationResult = new RoomOpenHelper.ValidationResult(false, new StringBuilder("delayed_onboarding(com.incode.welcome_sdk.data.local.model.delayed_onboarding.DelayedOnboardingEntity).\n Expected:\n").append(tableInfo).append("\n Found:\n").append(tableInfo2).toString());
                    int i4 = f7991e + 117;
                    f7990c = i4 % 128;
                    if (i4 % 2 != 0) {
                        return validationResult;
                    }
                    throw null;
                }
                HashMap map2 = new HashMap(10);
                map2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map2.put("interview_id", new TableInfo.Column("interview_id", "TEXT", false, 0, null, 1));
                map2.put("configuration_id", new TableInfo.Column("configuration_id", "TEXT", false, 0, null, 1));
                map2.put("validation_module_list", new TableInfo.Column("validation_module_list", "TEXT", true, 0, null, 1));
                map2.put("region_iso_code", new TableInfo.Column("region_iso_code", "TEXT", false, 0, null, 1));
                map2.put("queue_name", new TableInfo.Column("queue_name", "TEXT", false, 0, null, 1));
                map2.put(DatabaseHelper.COLUMN_EXTERNAL_ID, new TableInfo.Column(DatabaseHelper.COLUMN_EXTERNAL_ID, "TEXT", false, 0, null, 1));
                map2.put("external_customer_id", new TableInfo.Column("external_customer_id", "TEXT", false, 0, null, 1));
                map2.put("external_token", new TableInfo.Column("external_token", "TEXT", false, 0, null, 1));
                map2.put("custom_fields", new TableInfo.Column("custom_fields", "TEXT", false, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("session_config", map2, new HashSet(0), new HashSet(0));
                TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "session_config");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("session_config(com.incode.welcome_sdk.data.local.model.delayed_onboarding.SessionConfigEntity).\n Expected:\n").append(tableInfo3).append("\n Found:\n").append(tableInfo4).toString());
                }
                HashMap map3 = new HashMap(2);
                map3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map3.put("flow_tag", new TableInfo.Column("flow_tag", "TEXT", false, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("flow_config", map3, new HashSet(0), new HashSet(0));
                TableInfo tableInfo6 = TableInfo.read(supportSQLiteDatabase, "flow_config");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("flow_config(com.incode.welcome_sdk.data.local.model.delayed_onboarding.FlowConfigEntity).\n Expected:\n").append(tableInfo5).append("\n Found:\n").append(tableInfo6).toString());
                }
                HashMap map4 = new HashMap(1);
                map4.put("table_name", new TableInfo.Column("table_name", "TEXT", true, 1, null, 1));
                TableInfo tableInfo7 = new TableInfo("module_types", map4, new HashSet(0), new HashSet(0));
                TableInfo tableInfo8 = TableInfo.read(supportSQLiteDatabase, "module_types");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("module_types(com.incode.welcome_sdk.data.local.model.delayed_onboarding.ModuleTypeEntity).\n Expected:\n").append(tableInfo7).append("\n Found:\n").append(tableInfo8).toString());
                }
                HashMap map5 = new HashMap(5);
                map5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map5.put("flow_config_id", new TableInfo.Column("flow_config_id", "INTEGER", true, 0, null, 1));
                map5.put("module_type_name", new TableInfo.Column("module_type_name", "TEXT", true, 0, null, 1));
                map5.put("module_id", new TableInfo.Column("module_id", "INTEGER", true, 0, null, 1));
                map5.put("module_index", new TableInfo.Column("module_index", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo9 = new TableInfo("flow_modules", map5, new HashSet(0), new HashSet(0));
                TableInfo tableInfo10 = TableInfo.read(supportSQLiteDatabase, "flow_modules");
                if (!tableInfo9.equals(tableInfo10)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("flow_modules(com.incode.welcome_sdk.data.local.model.delayed_onboarding.FlowModulesEntity).\n Expected:\n").append(tableInfo9).append("\n Found:\n").append(tableInfo10).toString());
                }
                HashMap map6 = new HashMap(9);
                map6.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map6.put("front_id_image_path", new TableInfo.Column("front_id_image_path", "TEXT", false, 0, null, 1));
                map6.put("back_id_image_path", new TableInfo.Column("back_id_image_path", "TEXT", false, 0, null, 1));
                map6.put("id_type", new TableInfo.Column("id_type", "TEXT", false, 0, null, 1));
                map6.put("is_second_id", new TableInfo.Column("is_second_id", "INTEGER", true, 0, null, 1));
                map6.put("scan_step", new TableInfo.Column("scan_step", "TEXT", false, 0, null, 1));
                map6.put("capture_type", new TableInfo.Column("capture_type", "INTEGER", true, 0, null, 1));
                map6.put("is_completed", new TableInfo.Column("is_completed", "INTEGER", true, 0, null, 1));
                map6.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo11 = new TableInfo("id_scan", map6, new HashSet(0), new HashSet(0));
                TableInfo tableInfo12 = TableInfo.read(supportSQLiteDatabase, "id_scan");
                if (!tableInfo11.equals(tableInfo12)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("id_scan(com.incode.welcome_sdk.data.local.model.delayed_onboarding.id_scan.IdScanEntity).\n Expected:\n").append(tableInfo11).append("\n Found:\n").append(tableInfo12).toString());
                }
                HashMap map7 = new HashMap(12);
                map7.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, 1));
                map7.put("id_scan_id", new TableInfo.Column("id_scan_id", "INTEGER", true, 0, null, 1));
                map7.put("scan_step", new TableInfo.Column("scan_step", "TEXT", false, 0, null, 1));
                map7.put("classification", new TableInfo.Column("classification", "INTEGER", true, 0, null, 1));
                map7.put("readability", new TableInfo.Column("readability", "INTEGER", true, 0, null, 1));
                map7.put("type_of_id", new TableInfo.Column("type_of_id", "TEXT", true, 0, null, 1));
                map7.put("issue_name", new TableInfo.Column("issue_name", "TEXT", true, 0, null, 1));
                map7.put("issue_year", new TableInfo.Column("issue_year", "INTEGER", true, 0, null, 1));
                map7.put(Geo.JsonKeys.COUNTRY_CODE, new TableInfo.Column(Geo.JsonKeys.COUNTRY_CODE, "TEXT", true, 0, null, 1));
                map7.put(FontsContractCompat.Columns.RESULT_CODE, new TableInfo.Column(FontsContractCompat.Columns.RESULT_CODE, "TEXT", true, 0, null, 1));
                map7.put("error", new TableInfo.Column("error", "TEXT", false, 0, null, 1));
                map7.put("fail_reason", new TableInfo.Column("fail_reason", "TEXT", true, 0, null, 1));
                TableInfo tableInfo13 = new TableInfo("id_scan_result", map7, new HashSet(0), new HashSet(0));
                TableInfo tableInfo14 = TableInfo.read(supportSQLiteDatabase, "id_scan_result");
                if (!tableInfo13.equals(tableInfo14)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("id_scan_result(com.incode.welcome_sdk.data.local.model.delayed_onboarding.id_scan.IdScanResultEntity).\n Expected:\n").append(tableInfo13).append("\n Found:\n").append(tableInfo14).toString());
                }
                HashMap map8 = new HashMap(3);
                map8.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, 1));
                map8.put("is_completed", new TableInfo.Column("is_completed", "INTEGER", true, 0, null, 1));
                map8.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo15 = new TableInfo("process_id", map8, new HashSet(0), new HashSet(0));
                TableInfo tableInfo16 = TableInfo.read(supportSQLiteDatabase, "process_id");
                if (!tableInfo15.equals(tableInfo16)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("process_id(com.incode.welcome_sdk.data.local.model.delayed_onboarding.process_id.ProcessIdEntity).\n Expected:\n").append(tableInfo15).append("\n Found:\n").append(tableInfo16).toString());
                }
                HashMap map9 = new HashMap(6);
                map9.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, 1));
                map9.put("process_id", new TableInfo.Column("process_id", "INTEGER", true, 0, null, 1));
                map9.put("ocr_data", new TableInfo.Column("ocr_data", "TEXT", false, 0, null, 1));
                map9.put("extended_ocr_data", new TableInfo.Column("extended_ocr_data", "TEXT", false, 0, null, 1));
                map9.put(FontsContractCompat.Columns.RESULT_CODE, new TableInfo.Column(FontsContractCompat.Columns.RESULT_CODE, "TEXT", false, 0, null, 1));
                map9.put("error", new TableInfo.Column("error", "TEXT", false, 0, null, 1));
                TableInfo tableInfo17 = new TableInfo("process_id_result", map9, new HashSet(0), new HashSet(0));
                TableInfo tableInfo18 = TableInfo.read(supportSQLiteDatabase, "process_id_result");
                if (!tableInfo17.equals(tableInfo18)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("process_id_result(com.incode.welcome_sdk.data.local.model.delayed_onboarding.process_id.ProcessIdResultEntity).\n Expected:\n").append(tableInfo17).append("\n Found:\n").append(tableInfo18).toString());
                }
                HashMap map10 = new HashMap(6);
                map10.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map10.put("document_path", new TableInfo.Column("document_path", "TEXT", false, 0, null, 1));
                map10.put(DatabaseHelper.COLUMN_DOCUMENT_TYPE, new TableInfo.Column(DatabaseHelper.COLUMN_DOCUMENT_TYPE, "TEXT", false, 0, null, 1));
                map10.put("mime_type", new TableInfo.Column("mime_type", "TEXT", false, 0, null, 1));
                map10.put("is_completed", new TableInfo.Column("is_completed", "INTEGER", true, 0, null, 1));
                map10.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo19 = new TableInfo("document_scan", map10, new HashSet(0), new HashSet(0));
                TableInfo tableInfo20 = TableInfo.read(supportSQLiteDatabase, "document_scan");
                if (!tableInfo19.equals(tableInfo20)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("document_scan(com.incode.welcome_sdk.data.local.model.delayed_onboarding.document_scan.DocumentScanEntity).\n Expected:\n").append(tableInfo19).append("\n Found:\n").append(tableInfo20).toString());
                }
                HashMap map11 = new HashMap(7);
                map11.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map11.put("document_scan_id", new TableInfo.Column("document_scan_id", "INTEGER", true, 0, null, 1));
                map11.put("is_success", new TableInfo.Column("is_success", "INTEGER", true, 0, null, 1));
                map11.put("document_Type", new TableInfo.Column("document_Type", "TEXT", false, 0, null, 1));
                map11.put("document_ocr_data", new TableInfo.Column("document_ocr_data", "TEXT", false, 0, null, 1));
                map11.put("document_extended_ocr_data", new TableInfo.Column("document_extended_ocr_data", "TEXT", false, 0, null, 1));
                map11.put("error", new TableInfo.Column("error", "TEXT", false, 0, null, 1));
                TableInfo tableInfo21 = new TableInfo("document_scan_result", map11, new HashSet(0), new HashSet(0));
                TableInfo tableInfo22 = TableInfo.read(supportSQLiteDatabase, "document_scan_result");
                if (!tableInfo21.equals(tableInfo22)) {
                    RoomOpenHelper.ValidationResult validationResult2 = new RoomOpenHelper.ValidationResult(false, new StringBuilder("document_scan_result(com.incode.welcome_sdk.data.local.model.delayed_onboarding.document_scan.DocumentScanResultEntity).\n Expected:\n").append(tableInfo21).append("\n Found:\n").append(tableInfo22).toString());
                    int i5 = f7990c + 65;
                    f7991e = i5 % 128;
                    int i6 = i5 % 2;
                    return validationResult2;
                }
                HashMap map12 = new HashMap(6);
                map12.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map12.put("image_path", new TableInfo.Column("image_path", "TEXT", false, 0, null, 1));
                map12.put("face_coordinates", new TableInfo.Column("face_coordinates", "TEXT", false, 0, null, 1));
                map12.put("capture_type", new TableInfo.Column("capture_type", "INTEGER", true, 0, null, 1));
                map12.put("is_completed", new TableInfo.Column("is_completed", "INTEGER", true, 0, null, 1));
                map12.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo23 = new TableInfo("selfie_scan", map12, new HashSet(0), new HashSet(0));
                TableInfo tableInfo24 = TableInfo.read(supportSQLiteDatabase, "selfie_scan");
                if (!tableInfo23.equals(tableInfo24)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("selfie_scan(com.incode.welcome_sdk.data.local.model.delayed_onboarding.selfie_scan.SelfieScanEntity).\n Expected:\n").append(tableInfo23).append("\n Found:\n").append(tableInfo24).toString());
                }
                HashMap map13 = new HashMap(5);
                map13.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, 1));
                map13.put("selfie_scan_id", new TableInfo.Column("selfie_scan_id", "INTEGER", true, 0, null, 1));
                map13.put("is_spoof_attempt", new TableInfo.Column("is_spoof_attempt", "INTEGER", true, 0, null, 1));
                map13.put(FontsContractCompat.Columns.RESULT_CODE, new TableInfo.Column(FontsContractCompat.Columns.RESULT_CODE, "TEXT", true, 0, null, 1));
                map13.put("error", new TableInfo.Column("error", "TEXT", false, 0, null, 1));
                TableInfo tableInfo25 = new TableInfo("selfie_scan_result", map13, new HashSet(0), new HashSet(0));
                TableInfo tableInfo26 = TableInfo.read(supportSQLiteDatabase, "selfie_scan_result");
                if (!tableInfo25.equals(tableInfo26)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("selfie_scan_result(com.incode.welcome_sdk.data.local.model.delayed_onboarding.selfie_scan.SelfieScanResultEntity).\n Expected:\n").append(tableInfo25).append("\n Found:\n").append(tableInfo26).toString());
                }
                HashMap map14 = new HashMap(4);
                map14.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map14.put("match_type", new TableInfo.Column("match_type", "TEXT", true, 0, null, 1));
                map14.put("is_completed", new TableInfo.Column("is_completed", "INTEGER", true, 0, null, 1));
                map14.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo27 = new TableInfo("face_match", map14, new HashSet(0), new HashSet(0));
                TableInfo tableInfo28 = TableInfo.read(supportSQLiteDatabase, "face_match");
                if (!tableInfo27.equals(tableInfo28)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("face_match(com.incode.welcome_sdk.data.local.model.delayed_onboarding.face_match.FaceMatchEntity).\n Expected:\n").append(tableInfo27).append("\n Found:\n").append(tableInfo28).toString());
                }
                HashMap map15 = new HashMap(9);
                map15.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, 1));
                map15.put("face_match_id", new TableInfo.Column("face_match_id", "INTEGER", true, 0, null, 1));
                map15.put("face_match_confidence", new TableInfo.Column("face_match_confidence", "REAL", true, 0, null, 1));
                map15.put("is_face_matched", new TableInfo.Column("is_face_matched", "INTEGER", true, 0, null, 1));
                map15.put("is_existing_user", new TableInfo.Column("is_existing_user", "INTEGER", true, 0, null, 1));
                map15.put("existing_interview_id", new TableInfo.Column("existing_interview_id", "TEXT", true, 0, null, 1));
                map15.put("is_name_matched", new TableInfo.Column("is_name_matched", "INTEGER", true, 0, null, 1));
                map15.put(FontsContractCompat.Columns.RESULT_CODE, new TableInfo.Column(FontsContractCompat.Columns.RESULT_CODE, "TEXT", true, 0, null, 1));
                map15.put("error", new TableInfo.Column("error", "TEXT", true, 0, null, 1));
                TableInfo tableInfo29 = new TableInfo("face_match_result", map15, new HashSet(0), new HashSet(0));
                TableInfo tableInfo30 = TableInfo.read(supportSQLiteDatabase, "face_match_result");
                if (!tableInfo29.equals(tableInfo30)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("face_match_result(com.incode.welcome_sdk.data.local.model.delayed_onboarding.face_match.FaceMatchResultEntity).\n Expected:\n").append(tableInfo29).append("\n Found:\n").append(tableInfo30).toString());
                }
                HashMap map16 = new HashMap(5);
                map16.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map16.put("language_consent_id", new TableInfo.Column("language_consent_id", "TEXT", true, 0, null, 1));
                map16.put("consents", new TableInfo.Column("consents", "TEXT", true, 0, null, 1));
                map16.put("is_completed", new TableInfo.Column("is_completed", "INTEGER", true, 0, null, 1));
                map16.put("is_synced", new TableInfo.Column("is_synced", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo31 = new TableInfo("combined_consent", map16, new HashSet(0), new HashSet(0));
                TableInfo tableInfo32 = TableInfo.read(supportSQLiteDatabase, "combined_consent");
                if (!tableInfo31.equals(tableInfo32)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("combined_consent(com.incode.welcome_sdk.data.local.model.delayed_onboarding.combined_consent.CombinedConsentEntity).\n Expected:\n").append(tableInfo31).append("\n Found:\n").append(tableInfo32).toString());
                }
                HashMap map17 = new HashMap(3);
                map17.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map17.put(FontsContractCompat.Columns.RESULT_CODE, new TableInfo.Column(FontsContractCompat.Columns.RESULT_CODE, "TEXT", true, 0, null, 1));
                map17.put("error", new TableInfo.Column("error", "TEXT", false, 0, null, 1));
                TableInfo tableInfo33 = new TableInfo("combined_consent_result", map17, new HashSet(0), new HashSet(0));
                TableInfo tableInfo34 = TableInfo.read(supportSQLiteDatabase, "combined_consent_result");
                return !tableInfo33.equals(tableInfo34) ? new RoomOpenHelper.ValidationResult(false, new StringBuilder("combined_consent_result(com.incode.welcome_sdk.data.local.model.delayed_onboarding.combined_consent.CombinedConsentResultEntity).\n Expected:\n").append(tableInfo33).append("\n Found:\n").append(tableInfo34).toString()) : new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "06f0e639c3288709acc37921d6686dd0", "e47494ce4a30bc16684aa9acfe74a259")).build());
        int i3 = f7971s + 15;
        f7972t = i3 % 128;
        int i4 = i3 % 2;
        return supportSQLiteOpenHelperCreate;
    }

    /* JADX WARN: Finally extract failed */
    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        int i2 = 2 % 2;
        int i3 = f7972t + 81;
        f7971s = i3 % 128;
        int i4 = i3 % 2;
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `delayed_onboarding`");
            writableDatabase.execSQL("DELETE FROM `session_config`");
            writableDatabase.execSQL("DELETE FROM `flow_config`");
            writableDatabase.execSQL("DELETE FROM `module_types`");
            writableDatabase.execSQL("DELETE FROM `flow_modules`");
            writableDatabase.execSQL("DELETE FROM `id_scan`");
            writableDatabase.execSQL("DELETE FROM `id_scan_result`");
            writableDatabase.execSQL("DELETE FROM `process_id`");
            writableDatabase.execSQL("DELETE FROM `process_id_result`");
            writableDatabase.execSQL("DELETE FROM `document_scan`");
            writableDatabase.execSQL("DELETE FROM `document_scan_result`");
            writableDatabase.execSQL("DELETE FROM `selfie_scan`");
            writableDatabase.execSQL("DELETE FROM `selfie_scan_result`");
            writableDatabase.execSQL("DELETE FROM `face_match`");
            writableDatabase.execSQL("DELETE FROM `face_match_result`");
            writableDatabase.execSQL("DELETE FROM `combined_consent`");
            writableDatabase.execSQL("DELETE FROM `combined_consent_result`");
            super.setTransactionSuccessful();
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (writableDatabase.inTransaction()) {
                return;
            }
            writableDatabase.execSQL("VACUUM");
            int i5 = f7971s + 1;
            f7972t = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
            throw th;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        map.put(com.incode.welcome_sdk.data.local.db.c.a.d.class, i.d());
        map.put(n.class, s.d());
        map.put(ai.class, ae.e());
        map.put(w.class, x.e());
        map.put(p.class, r.a());
        map.put(q.class, t.e());
        map.put(y.class, v.a());
        map.put(u.class, ab.a());
        map.put(ad.class, z.e());
        map.put(f.class, g.b());
        map.put(h.class, j.d());
        map.put(ac.class, aa.b());
        map.put(af.class, ah.e());
        map.put(k.class, m.d());
        map.put(o.class, l.a());
        map.put(com.incode.welcome_sdk.data.local.db.c.a.e.class, com.incode.welcome_sdk.data.local.db.c.a.a.b());
        map.put(com.incode.welcome_sdk.data.local.db.c.a.b.class, com.incode.welcome_sdk.data.local.db.c.a.c.a());
        int i3 = f7971s + 125;
        f7972t = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        int i2 = 2 % 2;
        HashSet hashSet = new HashSet();
        int i3 = f7971s + 11;
        f7972t = i3 % 128;
        if (i3 % 2 != 0) {
            return hashSet;
        }
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public final List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        arrayList.add(new c());
        int i3 = f7971s + 25;
        f7972t = i3 % 128;
        if (i3 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        com.incode.welcome_sdk.data.local.db.c.a.d dVar;
        DelayedOnboardingDatabase_Impl delayedOnboardingDatabase_Impl = (DelayedOnboardingDatabase_Impl) objArr[0];
        if (delayedOnboardingDatabase_Impl.f7973a != null) {
            return delayedOnboardingDatabase_Impl.f7973a;
        }
        synchronized (delayedOnboardingDatabase_Impl) {
            if (delayedOnboardingDatabase_Impl.f7973a == null) {
                delayedOnboardingDatabase_Impl.f7973a = new i(delayedOnboardingDatabase_Impl);
            }
            dVar = delayedOnboardingDatabase_Impl.f7973a;
        }
        return dVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final n e() {
        n nVar;
        if (this.f7974b != null) {
            return this.f7974b;
        }
        synchronized (this) {
            if (this.f7974b == null) {
                this.f7974b = new s(this);
            }
            nVar = this.f7974b;
        }
        return nVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final ai a() {
        ai aiVar;
        if (this.f7976d != null) {
            return this.f7976d;
        }
        synchronized (this) {
            if (this.f7976d == null) {
                this.f7976d = new ae(this);
            }
            aiVar = this.f7976d;
        }
        return aiVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final w c() {
        w wVar;
        if (this.f7977e != null) {
            return this.f7977e;
        }
        synchronized (this) {
            if (this.f7977e == null) {
                this.f7977e = new x(this);
            }
            wVar = this.f7977e;
        }
        return wVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final p d() {
        p pVar;
        if (this.f7975c != null) {
            return this.f7975c;
        }
        synchronized (this) {
            if (this.f7975c == null) {
                this.f7975c = new r(this);
            }
            pVar = this.f7975c;
        }
        return pVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final q f() {
        q qVar;
        if (this.f7980h != null) {
            return this.f7980h;
        }
        synchronized (this) {
            if (this.f7980h == null) {
                this.f7980h = new t(this);
            }
            qVar = this.f7980h;
        }
        return qVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final y j() {
        y yVar;
        if (this.f7979g != null) {
            return this.f7979g;
        }
        synchronized (this) {
            if (this.f7979g == null) {
                this.f7979g = new v(this);
            }
            yVar = this.f7979g;
        }
        return yVar;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        u uVar;
        DelayedOnboardingDatabase_Impl delayedOnboardingDatabase_Impl = (DelayedOnboardingDatabase_Impl) objArr[0];
        if (delayedOnboardingDatabase_Impl.f7978f != null) {
            return delayedOnboardingDatabase_Impl.f7978f;
        }
        synchronized (delayedOnboardingDatabase_Impl) {
            if (delayedOnboardingDatabase_Impl.f7978f == null) {
                delayedOnboardingDatabase_Impl.f7978f = new ab(delayedOnboardingDatabase_Impl);
            }
            uVar = delayedOnboardingDatabase_Impl.f7978f;
        }
        return uVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final ad i() {
        ad adVar;
        if (this.f7981i != null) {
            return this.f7981i;
        }
        synchronized (this) {
            if (this.f7981i == null) {
                this.f7981i = new z(this);
            }
            adVar = this.f7981i;
        }
        return adVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final f g() {
        f fVar;
        if (this.f7982j != null) {
            return this.f7982j;
        }
        synchronized (this) {
            if (this.f7982j == null) {
                this.f7982j = new g(this);
            }
            fVar = this.f7982j;
        }
        return fVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final h k() {
        h hVar;
        if (this.f7984l != null) {
            return this.f7984l;
        }
        synchronized (this) {
            if (this.f7984l == null) {
                this.f7984l = new j(this);
            }
            hVar = this.f7984l;
        }
        return hVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final ac l() {
        ac acVar;
        if (this.f7985m != null) {
            return this.f7985m;
        }
        synchronized (this) {
            if (this.f7985m == null) {
                this.f7985m = new aa(this);
            }
            acVar = this.f7985m;
        }
        return acVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final af m() {
        af afVar;
        if (this.f7986n != null) {
            return this.f7986n;
        }
        synchronized (this) {
            if (this.f7986n == null) {
                this.f7986n = new ah(this);
            }
            afVar = this.f7986n;
        }
        return afVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final k n() {
        k kVar;
        if (this.f7987o != null) {
            return this.f7987o;
        }
        synchronized (this) {
            if (this.f7987o == null) {
                this.f7987o = new m(this);
            }
            kVar = this.f7987o;
        }
        return kVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final o o() {
        o oVar;
        if (this.f7983k != null) {
            return this.f7983k;
        }
        synchronized (this) {
            if (this.f7983k == null) {
                this.f7983k = new l(this);
            }
            oVar = this.f7983k;
        }
        return oVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final com.incode.welcome_sdk.data.local.db.c.a.e r() {
        com.incode.welcome_sdk.data.local.db.c.a.e eVar;
        if (this.f7989r != null) {
            return this.f7989r;
        }
        synchronized (this) {
            if (this.f7989r == null) {
                this.f7989r = new com.incode.welcome_sdk.data.local.db.c.a.a(this);
            }
            eVar = this.f7989r;
        }
        return eVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final com.incode.welcome_sdk.data.local.db.c.a.b t() {
        com.incode.welcome_sdk.data.local.db.c.a.b bVar;
        if (this.f7988q != null) {
            return this.f7988q;
        }
        synchronized (this) {
            if (this.f7988q == null) {
                this.f7988q = new com.incode.welcome_sdk.data.local.db.c.a.c(this);
            }
            bVar = this.f7988q;
        }
        return bVar;
    }

    static /* synthetic */ void e(DelayedOnboardingDatabase_Impl delayedOnboardingDatabase_Impl, SupportSQLiteDatabase supportSQLiteDatabase) {
        int iB = TutorialPresenterModule.b();
        c(-99204883, TutorialPresenterModule.b(), TutorialPresenterModule.b(), iB, new Object[]{delayedOnboardingDatabase_Impl, supportSQLiteDatabase}, 99204885, TutorialPresenterModule.b());
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final u h() {
        int iB = TutorialPresenterModule.b();
        return (u) c(792950243, TutorialPresenterModule.b(), TutorialPresenterModule.b(), iB, new Object[]{this}, -792950239, TutorialPresenterModule.b());
    }

    @Override // com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase
    public final com.incode.welcome_sdk.data.local.db.c.a.d b() {
        int iB = TutorialPresenterModule.b();
        return (com.incode.welcome_sdk.data.local.db.c.a.d) c(240500769, TutorialPresenterModule.b(), TutorialPresenterModule.b(), iB, new Object[]{this}, -240500768, TutorialPresenterModule.b());
    }

    @Override // androidx.room.RoomDatabase
    protected final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        int iB = TutorialPresenterModule.b();
        return (Map) c(-959848428, TutorialPresenterModule.b(), TutorialPresenterModule.b(), iB, new Object[]{this}, 959848431, TutorialPresenterModule.b());
    }

    @Override // androidx.room.RoomDatabase
    protected final InvalidationTracker createInvalidationTracker() {
        int iB = TutorialPresenterModule.b();
        return (InvalidationTracker) c(-771102491, TutorialPresenterModule.b(), TutorialPresenterModule.b(), iB, new Object[]{this}, 771102491, TutorialPresenterModule.b());
    }
}
