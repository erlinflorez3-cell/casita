package com.npmdavi.davinotification;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes5.dex */
public class UserInformationModule extends ReactContextBaseJavaModule {
    private final DatabaseHelper dbHelper;

    public UserInformationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.dbHelper = new DatabaseHelper(reactApplicationContext);
    }

    @ReactMethod
    public void deleteUserInformation(String str, Promise promise) {
        if (this.dbHelper.getWritableDatabase().delete(DatabaseHelper.TABLE_USER_INFORMATION, "id = ?", new String[]{str}) > 0) {
            promise.resolve(null);
        } else {
            promise.reject("ERROR", "Failed to delete user information");
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return DatabaseHelper.TABLE_USER_INFORMATION;
    }

    @ReactMethod
    public void getUserInformation(String str, Promise promise) {
        Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(DatabaseHelper.TABLE_USER_INFORMATION, null, "id = ?", new String[]{str}, null, null, null);
        if (cursorQuery.moveToFirst()) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("documentType", cursorQuery.getString(cursorQuery.getColumnIndex(DatabaseHelper.COLUMN_DOCUMENT_TYPE)));
            writableMapCreateMap.putString("documentNumber", cursorQuery.getString(cursorQuery.getColumnIndex(DatabaseHelper.COLUMN_DOCUMENT_NUMBER)));
            writableMapCreateMap.putString("externalId", cursorQuery.getString(cursorQuery.getColumnIndex(DatabaseHelper.COLUMN_EXTERNAL_ID)));
            writableMapCreateMap.putString("firebaseToken", cursorQuery.getString(cursorQuery.getColumnIndex(DatabaseHelper.COLUMN_FIREBASE_TOKEN)));
            promise.resolve(writableMapCreateMap);
        } else {
            promise.reject("ERROR", "User not found");
        }
        cursorQuery.close();
    }

    @ReactMethod
    public void saveUserInformation(ReadableMap readableMap, Promise promise) {
        SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.COLUMN_DOCUMENT_TYPE, readableMap.getString("documentType"));
        contentValues.put(DatabaseHelper.COLUMN_DOCUMENT_NUMBER, readableMap.getString("documentNumber"));
        contentValues.put(DatabaseHelper.COLUMN_EXTERNAL_ID, readableMap.getString("externalId"));
        contentValues.put(DatabaseHelper.COLUMN_FIREBASE_TOKEN, readableMap.getString("firebaseToken"));
        long jInsert = writableDatabase.insert(DatabaseHelper.TABLE_USER_INFORMATION, null, contentValues);
        if (jInsert != -1) {
            promise.resolve(Long.valueOf(jInsert));
        } else {
            promise.reject("ERROR", "Failed to save user information");
        }
    }

    @ReactMethod
    public void updateUserInformation(String str, ReadableMap readableMap, Promise promise) {
        SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        if (readableMap.hasKey("documentType") && !readableMap.isNull("documentType")) {
            contentValues.put(DatabaseHelper.COLUMN_DOCUMENT_TYPE, readableMap.getString("documentType"));
        }
        if (readableMap.hasKey("documentNumber") && !readableMap.isNull("documentNumber")) {
            contentValues.put(DatabaseHelper.COLUMN_DOCUMENT_NUMBER, readableMap.getString("documentNumber"));
        }
        if (readableMap.hasKey("externalId") && !readableMap.isNull("externalId")) {
            contentValues.put(DatabaseHelper.COLUMN_EXTERNAL_ID, readableMap.getString("externalId"));
        }
        if (readableMap.hasKey("firebaseToken") && !readableMap.isNull("firebaseToken")) {
            contentValues.put(DatabaseHelper.COLUMN_FIREBASE_TOKEN, readableMap.getString("firebaseToken"));
        }
        if (writableDatabase.update(DatabaseHelper.TABLE_USER_INFORMATION, contentValues, "id = ?", new String[]{str}) > 0) {
            promise.resolve(null);
        } else {
            promise.reject("ERROR", "Failed to update user information");
        }
    }
}
