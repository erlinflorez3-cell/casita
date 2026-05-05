package com.incode.welcome_sdk.data.local.db;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes5.dex */
final class b extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8012c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8013e = 1;

    public b() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        int i2 = 2 % 2;
        int i3 = f8013e + 73;
        f8012c = i3 % 128;
        int i4 = i3 % 2;
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `feature_config` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `feature` TEXT NOT NULL, `enabled` INTEGER NOT NULL)");
        int i5 = f8012c + 13;
        f8013e = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
