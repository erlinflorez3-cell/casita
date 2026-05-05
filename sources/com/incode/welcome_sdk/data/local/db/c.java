package com.incode.welcome_sdk.data.local.db;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes5.dex */
final class c extends Migration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8014a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8015e = 0;

    public c() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        int i2 = 2 % 2;
        int i3 = f8015e + 27;
        f8014a = i3 % 128;
        if (i3 % 2 == 0) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `combined_consent` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `language_consent_id` TEXT NOT NULL, `consents` TEXT NOT NULL, `is_completed` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `combined_consent_result` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `result_code` TEXT NOT NULL, `error` TEXT)");
            int i4 = 24 / 0;
        } else {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `combined_consent` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `language_consent_id` TEXT NOT NULL, `consents` TEXT NOT NULL, `is_completed` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `combined_consent_result` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `result_code` TEXT NOT NULL, `error` TEXT)");
        }
    }
}
