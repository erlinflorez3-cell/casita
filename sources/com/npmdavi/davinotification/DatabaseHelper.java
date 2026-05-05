package com.npmdavi.davinotification;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes5.dex */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String COLUMN_CATEGORY = "category";
    public static final String COLUMN_CATEGORY_AVAILABILITY_TIME = "category_availability_time";
    public static final String COLUMN_CATEGORY_FLAG = "category_flag";
    public static final String COLUMN_CATEGORY_FLAG_COLOR = "category_flag_color";
    public static final String COLUMN_CATEGORY_FLAG_TEXT = "category_flag_text";
    public static final String COLUMN_CATEGORY_ID = "category_id";
    public static final String COLUMN_CATEGORY_LIFE_EXPECTANCY = "category_life_expectancy";
    public static final String COLUMN_CATEGORY_TYPE = "category_type";
    public static final String COLUMN_DATA = "data";
    public static final String COLUMN_DATA_CHANNEL_ID = "data_channel_id";
    public static final String COLUMN_DATA_CONFIRM_TRANSACTION_ID = "data_confirm_transaction_id";
    public static final String COLUMN_DATA_MESSAGE = "data_message";
    public static final String COLUMN_DATA_TARGET_PACKAGE_NAME = "data_target_package_name";
    public static final String COLUMN_DOCUMENT_NUMBER = "document_number";
    public static final String COLUMN_DOCUMENT_TYPE = "document_type";
    public static final String COLUMN_EXTERNAL_ID = "external_id";
    public static final String COLUMN_FIREBASE_TOKEN = "firebase_token";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_ID_NOTIFICATION = "id_notification";
    public static final String COLUMN_IS_EXPIRED = "is_expired";
    public static final String COLUMN_MESSAGE = "message";
    public static final String COLUMN_REGISTER_DATE = "register_date";
    public static final String COLUMN_STATUS = "status";
    public static final String COLUMN_TIMESTAMP = "created_at";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_USER_ID = "id";
    public static final String COLUMN_USER_KEY = "user_key";
    private static final String DATABASE_NAME = "notification.db";
    private static final int DATABASE_VERSION = 2;
    public static final String TABLE_NOTIFICATIONS = "Notifications";
    private static final String TABLE_NOTIFICATION_CREATE = "CREATE TABLE IF NOT EXISTS Notifications (id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT, data_channel_id TEXT, data_confirm_transaction_id TEXT, data_message TEXT, data_target_package_name TEXT, category TEXT, category_id TEXT, category_type TEXT, category_life_expectancy INTEGER, category_availability_time INTEGER, category_flag INTEGER DEFAULT 0, category_flag_text TEXT, category_flag_color TEXT, register_date DATETIME, id_notification TEXT, message TEXT, status TEXT, title TEXT, user_key TEXT, is_expired INTEGER DEFAULT 0 );";
    private static final String TABLE_USER_CREATE = "CREATE TABLE IF NOT EXISTS UserInformation (id INTEGER PRIMARY KEY AUTOINCREMENT, document_type TEXT, document_number TEXT, external_id TEXT, firebase_token TEXT, created_at DATETIME DEFAULT CURRENT_TIMESTAMP);";
    public static final String TABLE_USER_INFORMATION = "UserInformation";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(TABLE_NOTIFICATION_CREATE);
        sQLiteDatabase.execSQL(TABLE_USER_CREATE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Notifications");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS UserInformation");
        onCreate(sQLiteDatabase);
    }
}
