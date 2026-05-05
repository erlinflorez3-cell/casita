package com.ts.coresdk.db;

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
import com.braze.Constants;
import com.ts.coresdk.logger.db.a;
import com.ts.coresdk.logger.db.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class CDatabase_Impl extends CDatabase {
    private volatile a bu;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `te`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "te");
    }

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(1) { // from class: com.ts.coresdk.db.CDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `te` (`s` INTEGER NOT NULL, `cn` TEXT NOT NULL, `mn` TEXT NOT NULL, `t` TEXT NOT NULL, `pn` TEXT NOT NULL, `ssn` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
                supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9181a44e72d1556e48a2f26d2763ea6a')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `te`");
                if (CDatabase_Impl.this.mCallbacks != null) {
                    int size = CDatabase_Impl.this.mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((RoomDatabase.Callback) CDatabase_Impl.this.mCallbacks.get(i2)).onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (CDatabase_Impl.this.mCallbacks != null) {
                    int size = CDatabase_Impl.this.mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((RoomDatabase.Callback) CDatabase_Impl.this.mCallbacks.get(i2)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                CDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                CDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (CDatabase_Impl.this.mCallbacks != null) {
                    int size = CDatabase_Impl.this.mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((RoomDatabase.Callback) CDatabase_Impl.this.mCallbacks.get(i2)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
                DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap map = new HashMap(7);
                map.put(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, new TableInfo.Column(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "INTEGER", true, 0, null, 1));
                map.put("cn", new TableInfo.Column("cn", "TEXT", true, 0, null, 1));
                map.put("mn", new TableInfo.Column("mn", "TEXT", true, 0, null, 1));
                map.put("t", new TableInfo.Column("t", "TEXT", true, 0, null, 1));
                map.put("pn", new TableInfo.Column("pn", "TEXT", true, 0, null, 1));
                map.put("ssn", new TableInfo.Column("ssn", "TEXT", true, 0, null, 1));
                map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
                TableInfo tableInfo = new TableInfo("te", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "te");
                return !tableInfo.equals(tableInfo2) ? new RoomOpenHelper.ValidationResult(false, "te(com.ts.coresdk.logger.db.TSLogEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2) : new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "9181a44e72d1556e48a2f26d2763ea6a", "1a0f79798dd6185ead115f8cfcf0e83b")).build());
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[0]);
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(a.class, c.q());
        return map;
    }

    @Override // com.ts.coresdk.db.CDatabase
    public a l() {
        a aVar;
        if (this.bu != null) {
            return this.bu;
        }
        synchronized (this) {
            if (this.bu == null) {
                this.bu = new c(this);
            }
            aVar = this.bu;
        }
        return aVar;
    }
}
