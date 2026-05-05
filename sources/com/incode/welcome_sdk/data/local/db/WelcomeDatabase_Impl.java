package com.incode.welcome_sdk.data.local.db;

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
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.local.db.c.f;
import com.incode.welcome_sdk.data.local.db.c.g;
import com.incode.welcome_sdk.data.local.db.c.h;
import com.incode.welcome_sdk.ui.name.NamePresenter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class WelcomeDatabase_Impl extends WelcomeDatabase {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f8001f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f8002g = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile h f8003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.incode.welcome_sdk.data.local.db.c.b f8004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile com.incode.welcome_sdk.data.local.db.c.c f8005e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.incode.welcome_sdk.data.local.db.c.a f8006h;

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~((~i5) | i8);
        int i10 = ~i2;
        int i11 = i9 | (~(i10 | i5)) | (~(i6 | i5));
        int i12 = i8 | i5;
        int i13 = i10 | i12;
        int i14 = i6 + i5 + i4 + ((-1542968645) * i3) + (1789173782 * i7);
        int i15 = i14 * i14;
        int i16 = (1553370224 * i6) + 752877568 + ((-368479342) * i5) + (i11 * 1186558865) + (1921849566 * i12) + (1186558865 * i13) + ((-1555038208) * i4) + (1802502144 * i3) + (148897792 * i7) + (289275904 * i15);
        int i17 = (i6 * (-930071408)) + 1959937684 + (i5 * (-930070194)) + (i11 * 607) + (i12 * (-1214)) + (i13 * 607) + (i4 * (-930070801)) + (i3 * 1059663509) + (i7 * (-1428764534)) + (i15 * 484573184);
        int i18 = i16 + (i17 * i17 * 411172864);
        return i18 != 1 ? i18 != 2 ? d(objArr) : e(objArr) : a(objArr);
    }

    static /* synthetic */ SupportSQLiteDatabase a(WelcomeDatabase_Impl welcomeDatabase_Impl, SupportSQLiteDatabase supportSQLiteDatabase) {
        int i2 = 2 % 2;
        int i3 = f8002g + 55;
        f8001f = i3 % 128;
        int i4 = i3 % 2;
        welcomeDatabase_Impl.mDatabase = supportSQLiteDatabase;
        if (i4 != 0) {
            int i5 = 69 / 0;
        }
        return supportSQLiteDatabase;
    }

    static /* synthetic */ List a(WelcomeDatabase_Impl welcomeDatabase_Impl) {
        int i2 = 2 % 2;
        int i3 = f8002g + 25;
        f8001f = i3 % 128;
        int i4 = i3 % 2;
        List<? extends RoomDatabase.Callback> list = welcomeDatabase_Impl.mCallbacks;
        int i5 = f8002g + 83;
        f8001f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return list;
    }

    static /* synthetic */ List b(WelcomeDatabase_Impl welcomeDatabase_Impl) {
        int i2 = 2 % 2;
        int i3 = f8001f + 41;
        f8002g = i3 % 128;
        int i4 = i3 % 2;
        List<? extends RoomDatabase.Callback> list = welcomeDatabase_Impl.mCallbacks;
        int i5 = f8001f + 13;
        f8002g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return list;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        WelcomeDatabase_Impl welcomeDatabase_Impl = (WelcomeDatabase_Impl) objArr[0];
        SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8001f + 81;
        f8002g = i3 % 128;
        int i4 = i3 % 2;
        welcomeDatabase_Impl.internalInitInvalidationTracker(supportSQLiteDatabase);
        if (i4 != 0) {
            return null;
        }
        throw null;
    }

    static /* synthetic */ List e(WelcomeDatabase_Impl welcomeDatabase_Impl) {
        int i2 = 2 % 2;
        int i3 = f8002g + 43;
        f8001f = i3 % 128;
        int i4 = i3 % 2;
        List<? extends RoomDatabase.Callback> list = welcomeDatabase_Impl.mCallbacks;
        if (i4 == 0) {
            return list;
        }
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    protected final SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        int i2 = 2 % 2;
        SupportSQLiteOpenHelper supportSQLiteOpenHelperCreate = databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate() { // from class: com.incode.welcome_sdk.data.local.db.WelcomeDatabase_Impl.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8007a = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8008d = 1;

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                int i3 = 2 % 2;
                int i4 = f8007a + 123;
                f8008d = i4 % 128;
                int i5 = i4 % 2;
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `templates` (`templateId` TEXT NOT NULL, `template` TEXT, PRIMARY KEY(`templateId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `face_info_table` (`face_info_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `template_id` TEXT NOT NULL, `face_template` TEXT NOT NULL, `customer_uuid` TEXT)");
                supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_face_info_table_template_id` ON `face_info_table` (`template_id`)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `feature_config` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `feature` TEXT NOT NULL, `enabled` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `face_login_attempt` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `base64_frame` TEXT NOT NULL, `face_coordinates` TEXT, `bitmap_width` INTEGER NOT NULL, `bitmap_height` INTEGER NOT NULL, `face_recognition_confidence` REAL NOT NULL, `face_recognition_threshold` REAL NOT NULL, `liveness_confidence` REAL NOT NULL, `liveness_threshold` REAL NOT NULL, `brightness_level` REAL NOT NULL, `blurriness_level` REAL NOT NULL, `authentication_type` TEXT NOT NULL, `customer_id` TEXT, `face_auth_mode` TEXT NOT NULL, `sync_status` TEXT NOT NULL, `sync_result` TEXT, `error` TEXT)");
                supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8ea05841f79b4cd220895ac53dc315cc')");
                int i6 = f8008d + 61;
                f8007a = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 29 / 0;
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                int i3 = 2 % 2;
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `templates`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `face_info_table`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `feature_config`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `face_login_attempt`");
                List listE = WelcomeDatabase_Impl.e(WelcomeDatabase_Impl.this);
                if (listE == null) {
                    return;
                }
                int i4 = f8007a + 51;
                f8008d = i4 % 128;
                int i5 = i4 % 2;
                Iterator it = listE.iterator();
                int i6 = f8007a + 37;
                while (true) {
                    f8008d = i6 % 128;
                    int i7 = i6 % 2;
                    if (!it.hasNext()) {
                        return;
                    }
                    int i8 = f8007a + 17;
                    f8008d = i8 % 128;
                    int i9 = i8 % 2;
                    ((RoomDatabase.Callback) it.next()).onDestructiveMigration(supportSQLiteDatabase);
                    i6 = f8007a + 121;
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                Iterator it;
                int i3 = 2 % 2;
                List listB = WelcomeDatabase_Impl.b(WelcomeDatabase_Impl.this);
                if (listB != null) {
                    int i4 = f8007a + 37;
                    f8008d = i4 % 128;
                    if (i4 % 2 == 0) {
                        it = listB.iterator();
                        int i5 = 65 / 0;
                    } else {
                        it = listB.iterator();
                    }
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onCreate(supportSQLiteDatabase);
                    }
                }
                int i6 = f8007a + 49;
                f8008d = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                int i3 = 2 % 2;
                int i4 = f8008d + 43;
                f8007a = i4 % 128;
                int i5 = i4 % 2;
                WelcomeDatabase_Impl.a(WelcomeDatabase_Impl.this, supportSQLiteDatabase);
                WelcomeDatabase_Impl.b(WelcomeDatabase_Impl.this, supportSQLiteDatabase);
                List listA = WelcomeDatabase_Impl.a(WelcomeDatabase_Impl.this);
                if (listA != null) {
                    int i6 = f8007a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f8008d = i6 % 128;
                    int i7 = i6 % 2;
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onOpen(supportSQLiteDatabase);
                        int i8 = f8008d + 49;
                        f8007a = i8 % 128;
                        int i9 = i8 % 2;
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
                int i3 = 2 % 2;
                int i4 = f8008d + 59;
                f8007a = i4 % 128;
                if (i4 % 2 != 0) {
                    DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
                    int i5 = 80 / 0;
                } else {
                    DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
                }
                int i6 = f8008d + 89;
                f8007a = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                int i3 = 2 % 2;
                int i4 = f8007a + 59;
                f8008d = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                int i3 = 2 % 2;
                HashMap map = new HashMap(2);
                map.put("templateId", new TableInfo.Column("templateId", "TEXT", true, 1, null, 1));
                map.put("template", new TableInfo.Column("template", "TEXT", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("templates", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "templates");
                if (!tableInfo.equals(tableInfo2)) {
                    RoomOpenHelper.ValidationResult validationResult = new RoomOpenHelper.ValidationResult(false, new StringBuilder("templates(com.incode.welcome_sdk.data.TemplateModel).\n Expected:\n").append(tableInfo).append("\n Found:\n").append(tableInfo2).toString());
                    int i4 = f8007a + 21;
                    f8008d = i4 % 128;
                    int i5 = i4 % 2;
                    return validationResult;
                }
                HashMap map2 = new HashMap(4);
                map2.put("face_info_id", new TableInfo.Column("face_info_id", "INTEGER", true, 1, null, 1));
                map2.put("template_id", new TableInfo.Column("template_id", "TEXT", true, 0, null, 1));
                map2.put("face_template", new TableInfo.Column("face_template", "TEXT", true, 0, null, 1));
                map2.put("customer_uuid", new TableInfo.Column("customer_uuid", "TEXT", false, 0, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new TableInfo.Index("index_face_info_table_template_id", true, Arrays.asList("template_id"), Arrays.asList("ASC")));
                TableInfo tableInfo3 = new TableInfo("face_info_table", map2, hashSet, hashSet2);
                TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "face_info_table");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("face_info_table(com.incode.welcome_sdk.data.local.FaceInfo).\n Expected:\n").append(tableInfo3).append("\n Found:\n").append(tableInfo4).toString());
                }
                HashMap map3 = new HashMap(3);
                map3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map3.put("feature", new TableInfo.Column("feature", "TEXT", true, 0, null, 1));
                map3.put("enabled", new TableInfo.Column("enabled", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("feature_config", map3, new HashSet(0), new HashSet(0));
                TableInfo tableInfo6 = TableInfo.read(supportSQLiteDatabase, "feature_config");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("feature_config(com.incode.welcome_sdk.data.local.FeatureConfig).\n Expected:\n").append(tableInfo5).append("\n Found:\n").append(tableInfo6).toString());
                }
                HashMap map4 = new HashMap(17);
                map4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map4.put("base64_frame", new TableInfo.Column("base64_frame", "TEXT", true, 0, null, 1));
                map4.put("face_coordinates", new TableInfo.Column("face_coordinates", "TEXT", false, 0, null, 1));
                map4.put("bitmap_width", new TableInfo.Column("bitmap_width", "INTEGER", true, 0, null, 1));
                map4.put("bitmap_height", new TableInfo.Column("bitmap_height", "INTEGER", true, 0, null, 1));
                map4.put("face_recognition_confidence", new TableInfo.Column("face_recognition_confidence", "REAL", true, 0, null, 1));
                map4.put("face_recognition_threshold", new TableInfo.Column("face_recognition_threshold", "REAL", true, 0, null, 1));
                map4.put("liveness_confidence", new TableInfo.Column("liveness_confidence", "REAL", true, 0, null, 1));
                map4.put("liveness_threshold", new TableInfo.Column("liveness_threshold", "REAL", true, 0, null, 1));
                map4.put("brightness_level", new TableInfo.Column("brightness_level", "REAL", true, 0, null, 1));
                map4.put("blurriness_level", new TableInfo.Column("blurriness_level", "REAL", true, 0, null, 1));
                map4.put("authentication_type", new TableInfo.Column("authentication_type", "TEXT", true, 0, null, 1));
                map4.put("customer_id", new TableInfo.Column("customer_id", "TEXT", false, 0, null, 1));
                map4.put("face_auth_mode", new TableInfo.Column("face_auth_mode", "TEXT", true, 0, null, 1));
                map4.put("sync_status", new TableInfo.Column("sync_status", "TEXT", true, 0, null, 1));
                map4.put("sync_result", new TableInfo.Column("sync_result", "TEXT", false, 0, null, 1));
                map4.put("error", new TableInfo.Column("error", "TEXT", false, 0, null, 1));
                TableInfo tableInfo7 = new TableInfo("face_login_attempt", map4, new HashSet(0), new HashSet(0));
                TableInfo tableInfo8 = TableInfo.read(supportSQLiteDatabase, "face_login_attempt");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenHelper.ValidationResult(false, new StringBuilder("face_login_attempt(com.incode.welcome_sdk.data.local.FaceLoginAttemptEntity).\n Expected:\n").append(tableInfo7).append("\n Found:\n").append(tableInfo8).toString());
                }
                RoomOpenHelper.ValidationResult validationResult2 = new RoomOpenHelper.ValidationResult(true, null);
                int i6 = f8007a + 109;
                f8008d = i6 % 128;
                int i7 = i6 % 2;
                return validationResult2;
            }
        }, "8ea05841f79b4cd220895ac53dc315cc", "5859a239fe3c69bf2057d8183fffd57d")).build());
        int i3 = f8002g + 123;
        f8001f = i3 % 128;
        int i4 = i3 % 2;
        return supportSQLiteOpenHelperCreate;
    }

    @Override // androidx.room.RoomDatabase
    protected final InvalidationTracker createInvalidationTracker() {
        int i2 = 2 % 2;
        InvalidationTracker invalidationTracker = new InvalidationTracker(this, new HashMap(0), new HashMap(0), "templates", "face_info_table", "feature_config", "face_login_attempt");
        int i3 = f8001f + 45;
        f8002g = i3 % 128;
        int i4 = i3 % 2;
        return invalidationTracker;
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        int i2 = 2 % 2;
        int i3 = f8001f + 1;
        f8002g = i3 % 128;
        int i4 = i3 % 2;
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `templates`");
            writableDatabase.execSQL("DELETE FROM `face_info_table`");
            writableDatabase.execSQL("DELETE FROM `feature_config`");
            writableDatabase.execSQL("DELETE FROM `face_login_attempt`");
            super.setTransactionSuccessful();
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (writableDatabase.inTransaction()) {
                return;
            }
            int i5 = f8001f + 85;
            f8002g = i5 % 128;
            int i6 = i5 % 2;
            writableDatabase.execSQL("VACUUM");
        } catch (Throwable th) {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
            throw th;
        }
    }

    @Override // androidx.room.RoomDatabase
    protected final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        map.put(h.class, g.b());
        map.put(com.incode.welcome_sdk.data.local.db.c.b.class, com.incode.welcome_sdk.data.local.db.c.d.a());
        map.put(com.incode.welcome_sdk.data.local.db.c.c.class, f.e());
        map.put(com.incode.welcome_sdk.data.local.db.c.a.class, com.incode.welcome_sdk.data.local.db.c.e.a());
        int i3 = f8002g + 41;
        f8001f = i3 % 128;
        if (i3 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        int i2 = 2 % 2;
        HashSet hashSet = new HashSet();
        int i3 = f8001f + 51;
        f8002g = i3 % 128;
        int i4 = i3 % 2;
        return hashSet;
    }

    @Override // androidx.room.RoomDatabase
    public final List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
        arrayList.add(new d());
        int i3 = f8002g + 15;
        f8001f = i3 % 128;
        int i4 = i3 % 2;
        return arrayList;
    }

    @Override // com.incode.welcome_sdk.data.local.db.WelcomeDatabase
    public final h c() {
        h hVar;
        if (this.f8003c != null) {
            return this.f8003c;
        }
        synchronized (this) {
            if (this.f8003c == null) {
                this.f8003c = new g(this);
            }
            hVar = this.f8003c;
        }
        return hVar;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        com.incode.welcome_sdk.data.local.db.c.b bVar;
        WelcomeDatabase_Impl welcomeDatabase_Impl = (WelcomeDatabase_Impl) objArr[0];
        if (welcomeDatabase_Impl.f8004d != null) {
            return welcomeDatabase_Impl.f8004d;
        }
        synchronized (welcomeDatabase_Impl) {
            if (welcomeDatabase_Impl.f8004d == null) {
                welcomeDatabase_Impl.f8004d = new com.incode.welcome_sdk.data.local.db.c.d(welcomeDatabase_Impl);
            }
            bVar = welcomeDatabase_Impl.f8004d;
        }
        return bVar;
    }

    @Override // com.incode.welcome_sdk.data.local.db.WelcomeDatabase
    public final com.incode.welcome_sdk.data.local.db.c.c d() {
        com.incode.welcome_sdk.data.local.db.c.c cVar;
        if (this.f8005e != null) {
            return this.f8005e;
        }
        synchronized (this) {
            if (this.f8005e == null) {
                this.f8005e = new f(this);
            }
            cVar = this.f8005e;
        }
        return cVar;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        com.incode.welcome_sdk.data.local.db.c.a aVar;
        WelcomeDatabase_Impl welcomeDatabase_Impl = (WelcomeDatabase_Impl) objArr[0];
        if (welcomeDatabase_Impl.f8006h != null) {
            return welcomeDatabase_Impl.f8006h;
        }
        synchronized (welcomeDatabase_Impl) {
            if (welcomeDatabase_Impl.f8006h == null) {
                welcomeDatabase_Impl.f8006h = new com.incode.welcome_sdk.data.local.db.c.e(welcomeDatabase_Impl);
            }
            aVar = welcomeDatabase_Impl.f8006h;
        }
        return aVar;
    }

    static /* synthetic */ void b(WelcomeDatabase_Impl welcomeDatabase_Impl, SupportSQLiteDatabase supportSQLiteDatabase) {
        int iA = NamePresenter.b.a();
        int iA2 = NamePresenter.b.a();
        a(iA, NamePresenter.b.a(), iA2, new Object[]{welcomeDatabase_Impl, supportSQLiteDatabase}, -814058824, 814058826, NamePresenter.b.a());
    }

    @Override // com.incode.welcome_sdk.data.local.db.WelcomeDatabase
    public final com.incode.welcome_sdk.data.local.db.c.a b() {
        int iA = NamePresenter.b.a();
        int iA2 = NamePresenter.b.a();
        return (com.incode.welcome_sdk.data.local.db.c.a) a(iA, NamePresenter.b.a(), iA2, new Object[]{this}, -1292245794, 1292245794, NamePresenter.b.a());
    }

    @Override // com.incode.welcome_sdk.data.local.db.WelcomeDatabase
    public final com.incode.welcome_sdk.data.local.db.c.b e() {
        int iA = NamePresenter.b.a();
        int iA2 = NamePresenter.b.a();
        return (com.incode.welcome_sdk.data.local.db.c.b) a(iA, NamePresenter.b.a(), iA2, new Object[]{this}, 394468046, -394468045, NamePresenter.b.a());
    }
}
