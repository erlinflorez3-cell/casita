package com.incode.welcome_sdk.data.local.db;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes5.dex */
final class d extends Migration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8570a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8571b = 1;

    public d() {
        super(4, 5);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        int i2 = 2 % 2;
        int i3 = f8570a + 55;
        f8571b = i3 % 128;
        int i4 = i3 % 2;
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `face_login_attempt` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `base64_frame` TEXT NOT NULL, `face_coordinates` TEXT, `bitmap_width` INTEGER NOT NULL, `bitmap_height` INTEGER NOT NULL, `face_recognition_confidence` REAL NOT NULL, `face_recognition_threshold` REAL NOT NULL, `liveness_confidence` REAL NOT NULL, `liveness_threshold` REAL NOT NULL, `brightness_level` REAL NOT NULL, `blurriness_level` REAL NOT NULL, `authentication_type` TEXT NOT NULL, `customer_id` TEXT, `face_auth_mode` TEXT NOT NULL, `sync_status` TEXT NOT NULL, `sync_result` TEXT, `error` TEXT)");
        int i5 = f8571b + 85;
        f8570a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
    }
}
