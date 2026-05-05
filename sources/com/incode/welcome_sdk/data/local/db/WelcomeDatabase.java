package com.incode.welcome_sdk.data.local.db;

import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.incode.welcome_sdk.data.local.db.c.h;

/* JADX INFO: loaded from: classes5.dex */
public abstract class WelcomeDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: c */
    private static int f7995c = 0;

    /* JADX INFO: renamed from: e */
    private static int f7996e = 1;

    /* JADX INFO: renamed from: b */
    public static Migration f7994b = new Migration() { // from class: com.incode.welcome_sdk.data.local.db.WelcomeDatabase.2

        /* JADX INFO: renamed from: d */
        private static int f7999d = 0;

        /* JADX INFO: renamed from: e */
        private static int f8000e = 1;

        AnonymousClass2() {
        }

        @Override // androidx.room.migration.Migration
        public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            int i2 = 2 % 2;
            int i3 = f7999d + 65;
            f8000e = i3 % 128;
            if (i3 % 2 == 0) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `feature_config` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `feature` TEXT NOT NULL, `enabled` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("DELETE FROM `face_info_table` WHERE `face_info_id` NOT IN (SELECT MAX(`face_info_id`) FROM `face_info_table` GROUP BY `template_id`)");
                supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_face_info_table_template_id` ON `face_info_table` (`template_id`)");
                int i4 = 72 / 0;
            } else {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `feature_config` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `feature` TEXT NOT NULL, `enabled` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("DELETE FROM `face_info_table` WHERE `face_info_id` NOT IN (SELECT MAX(`face_info_id`) FROM `face_info_table` GROUP BY `template_id`)");
                supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_face_info_table_template_id` ON `face_info_table` (`template_id`)");
            }
            int i5 = f7999d + 71;
            f8000e = i5 % 128;
            int i6 = i5 % 2;
        }
    };

    /* JADX INFO: renamed from: a */
    public static Migration f7993a = new Migration() { // from class: com.incode.welcome_sdk.data.local.db.WelcomeDatabase.1

        /* JADX INFO: renamed from: b */
        private static int f7997b = 1;

        /* JADX INFO: renamed from: c */
        private static int f7998c = 0;

        AnonymousClass1() {
        }

        @Override // androidx.room.migration.Migration
        public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            int i2 = 2 % 2;
            int i3 = f7997b + 85;
            f7998c = i3 % 128;
            int i4 = i3 % 2;
            supportSQLiteDatabase.execSQL("DELETE FROM `face_info_table` WHERE `face_info_id` NOT IN (SELECT MAX(`face_info_id`) FROM `face_info_table` GROUP BY `template_id`)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_face_info_table_template_id` ON `face_info_table` (`template_id`)");
            int i5 = f7998c + 67;
            f7997b = i5 % 128;
            int i6 = i5 % 2;
        }
    };

    public abstract com.incode.welcome_sdk.data.local.db.c.a b();

    public abstract h c();

    public abstract com.incode.welcome_sdk.data.local.db.c.c d();

    public abstract com.incode.welcome_sdk.data.local.db.c.b e();

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.WelcomeDatabase$2 */
    final class AnonymousClass2 extends Migration {

        /* JADX INFO: renamed from: d */
        private static int f7999d = 0;

        /* JADX INFO: renamed from: e */
        private static int f8000e = 1;

        AnonymousClass2() {
        }

        @Override // androidx.room.migration.Migration
        public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            int i2 = 2 % 2;
            int i3 = f7999d + 65;
            f8000e = i3 % 128;
            if (i3 % 2 == 0) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `feature_config` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `feature` TEXT NOT NULL, `enabled` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("DELETE FROM `face_info_table` WHERE `face_info_id` NOT IN (SELECT MAX(`face_info_id`) FROM `face_info_table` GROUP BY `template_id`)");
                supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_face_info_table_template_id` ON `face_info_table` (`template_id`)");
                int i4 = 72 / 0;
            } else {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `feature_config` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `feature` TEXT NOT NULL, `enabled` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("DELETE FROM `face_info_table` WHERE `face_info_id` NOT IN (SELECT MAX(`face_info_id`) FROM `face_info_table` GROUP BY `template_id`)");
                supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_face_info_table_template_id` ON `face_info_table` (`template_id`)");
            }
            int i5 = f7999d + 71;
            f8000e = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    static {
        int i2 = f7996e + 117;
        f7995c = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.WelcomeDatabase$1 */
    final class AnonymousClass1 extends Migration {

        /* JADX INFO: renamed from: b */
        private static int f7997b = 1;

        /* JADX INFO: renamed from: c */
        private static int f7998c = 0;

        AnonymousClass1() {
        }

        @Override // androidx.room.migration.Migration
        public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            int i2 = 2 % 2;
            int i3 = f7997b + 85;
            f7998c = i3 % 128;
            int i4 = i3 % 2;
            supportSQLiteDatabase.execSQL("DELETE FROM `face_info_table` WHERE `face_info_id` NOT IN (SELECT MAX(`face_info_id`) FROM `face_info_table` GROUP BY `template_id`)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_face_info_table_template_id` ON `face_info_table` (`template_id`)");
            int i5 = f7998c + 67;
            f7997b = i5 % 128;
            int i6 = i5 % 2;
        }
    }
}
