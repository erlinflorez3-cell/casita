package com.incode.welcome_sdk.data.local.db;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes5.dex */
final class a extends Migration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8010a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8011d = 1;

    public a() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        int i2 = 2 % 2;
        int i3 = f8010a + 73;
        f8011d = i3 % 128;
        int i4 = i3 % 2;
        supportSQLiteDatabase.execSQL("ALTER TABLE `session_config` ADD COLUMN `external_customer_id` TEXT DEFAULT NULL");
        int i5 = f8011d + 41;
        f8010a = i5 % 128;
        int i6 = i5 % 2;
    }
}
