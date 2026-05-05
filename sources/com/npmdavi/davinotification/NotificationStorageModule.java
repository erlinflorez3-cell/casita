package com.npmdavi.davinotification;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.dynatrace.android.agent.Global;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public class NotificationStorageModule extends ReactContextBaseJavaModule {
    private final DatabaseHelper dbHelper;
    private final ReactApplicationContext reactContext;
    private final ScheduledExecutorService scheduler;

    public NotificationStorageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.scheduler = Executors.newSingleThreadScheduledExecutor();
        this.reactContext = reactApplicationContext;
        this.dbHelper = new DatabaseHelper(reactApplicationContext);
        startExpirationChecker();
    }

    private void deleteNotificationsBatch(SQLiteDatabase sQLiteDatabase, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(Global.QUESTION);
            if (i2 < list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        sQLiteDatabase.delete(DatabaseHelper.TABLE_NOTIFICATIONS, sb.toString(), (String[]) list.toArray(new String[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchNotifications(boolean z2, int i2, int i3, Promise promise) {
        SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        StringBuilder sb = new StringBuilder("SELECT * FROM Notifications WHERE register_date");
        ArrayList arrayList = new ArrayList();
        String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        sb.append(z2 ? " >= ?" : " < ?");
        arrayList.add(str);
        sb.append(" ORDER BY register_date DESC LIMIT ? OFFSET ?");
        arrayList.add(String.valueOf(i3));
        arrayList.add(String.valueOf(i2));
        Cursor cursorRawQuery = readableDatabase.rawQuery(sb.toString(), (String[]) arrayList.toArray(new String[0]));
        while (cursorRawQuery.moveToNext()) {
            writableArrayCreateArray.pushMap(mapCursorToNotification(cursorRawQuery));
        }
        cursorRawQuery.close();
        promise.resolve(writableArrayCreateArray);
    }

    private long getTodayStartMillis() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getNotificationsCount$2(Promise promise) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = this.dbHelper.getReadableDatabase().rawQuery("SELECT status, COUNT(*) FROM Notifications WHERE is_expired = 0 AND (status = 'READ' OR status = 'CONFIRM') GROUP BY status", null);
                while (cursorRawQuery != null && cursorRawQuery.moveToNext()) {
                    writableMapCreateMap.putInt(cursorRawQuery.getString(0), cursorRawQuery.getInt(1));
                }
                promise.resolve(writableMapCreateMap);
            } catch (Exception unused) {
                promise.reject("ERROR", "Error counting notifications");
                if (cursorRawQuery == null) {
                }
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hasUnreadNotifications$1(Promise promise) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = this.dbHelper.getReadableDatabase().rawQuery("SELECT 1 FROM Notifications WHERE status = ? LIMIT 1", new String[]{"CONFIRM"});
                promise.resolve(Boolean.valueOf(cursorRawQuery != null && cursorRawQuery.moveToFirst()));
            } catch (Exception unused) {
                promise.reject("ERROR", "Error checking unread notifications");
                if (cursorRawQuery == null) {
                }
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startExpirationChecker$0() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long todayStartMillis = getTodayStartMillis();
            SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
            Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT id_notification, register_date, is_expired, category_life_expectancy, category_flag FROM Notifications WHERE is_expired = 0 AND register_date >= ? AND category_flag = 1", new String[]{String.valueOf(todayStartMillis)});
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(DatabaseHelper.COLUMN_ID_NOTIFICATION));
                    cursorRawQuery.getString(cursorRawQuery.getColumnIndex(DatabaseHelper.COLUMN_CATEGORY_FLAG));
                    long j2 = parseregisterDate(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(DatabaseHelper.COLUMN_REGISTER_DATE)));
                    if (j2 != -1) {
                        boolean z2 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(DatabaseHelper.COLUMN_IS_EXPIRED)) == 1;
                        if (jCurrentTimeMillis - j2 >= ((long) cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(DatabaseHelper.COLUMN_CATEGORY_LIFE_EXPECTANCY))) * 1000 && !z2) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(DatabaseHelper.COLUMN_IS_EXPIRED, (Integer) 1);
                            String str = "Rows updated: " + writableDatabase.update(DatabaseHelper.TABLE_NOTIFICATIONS, contentValues, "id_notification = ?", new String[]{string});
                            String.valueOf(string);
                            WritableMap writableMapCreateMap = Arguments.createMap();
                            writableMapCreateMap.putString(Constant.NOTIFICATION_DETAILS_ID_NOTIFICATION, string);
                            writableMapCreateMap.putBoolean("isExpired", true);
                            sendNotificationExpiredEvent(writableMapCreateMap);
                        }
                    }
                }
                cursorRawQuery.close();
            }
        } catch (Exception e2) {
        }
    }

    private WritableMap mapCursorToNotification(Cursor cursor) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", cursor.getString(cursor.getColumnIndex("id")));
        writableMapCreateMap.putString("registerDate", cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_REGISTER_DATE)));
        writableMapCreateMap.putString(Constant.NOTIFICATION_DETAILS_ID_NOTIFICATION, cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_ID_NOTIFICATION)));
        writableMapCreateMap.putString("message", cursor.getString(cursor.getColumnIndex("message")));
        writableMapCreateMap.putString("status", cursor.getString(cursor.getColumnIndex("status")));
        writableMapCreateMap.putString("title", cursor.getString(cursor.getColumnIndex("title")));
        writableMapCreateMap.putString("userKey", cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_USER_KEY)));
        writableMapCreateMap.putBoolean("isExpired", cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_IS_EXPIRED)) != 0);
        String string = cursor.getString(cursor.getColumnIndex("data"));
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        writableMapCreateMap2.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        writableMapCreateMap2.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        writableMapCreateMap2.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Boolean) {
                        writableMapCreateMap2.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Long) {
                        writableMapCreateMap2.putDouble(next, ((Long) obj).doubleValue());
                    } else {
                        writableMapCreateMap2.putString(next, obj != null ? obj.toString() : null);
                    }
                }
                writableMapCreateMap.putMap("data", writableMapCreateMap2);
            } catch (JSONException unused) {
                writableMapCreateMap.putNull("data");
            }
        }
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putString("categoryId", cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CATEGORY_ID)));
        writableMapCreateMap3.putString("type", cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CATEGORY_TYPE)));
        writableMapCreateMap3.putInt("lifeExpectancy", cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_CATEGORY_LIFE_EXPECTANCY)));
        writableMapCreateMap3.putInt("availabilityTime", cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_CATEGORY_AVAILABILITY_TIME)));
        writableMapCreateMap3.putBoolean("flag", cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_CATEGORY_FLAG)) != 0);
        writableMapCreateMap3.putString("flagText", cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CATEGORY_FLAG_TEXT)));
        writableMapCreateMap3.putString("flagColor", cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CATEGORY_FLAG_COLOR)));
        writableMapCreateMap.putMap("category", writableMapCreateMap3);
        return writableMapCreateMap;
    }

    private long parseregisterDate(String str) {
        long time = -1;
        if (str == null) {
            return -1L;
        }
        try {
            String str2 = str.split("\\.")[0];
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = simpleDateFormat.parse(str2);
            if (date == null) {
                return -1L;
            }
            time = date.getTime();
            return time;
        } catch (Exception e2) {
            String str3 = "Failed to parse registerDate: " + str;
            return time;
        }
    }

    private void sendNotificationExpiredEvent(WritableMap writableMap) {
        if (this.reactContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onNotificationExpired", writableMap);
        }
    }

    private void startExpirationChecker() {
        this.scheduler.scheduleAtFixedRate(new Runnable() { // from class: com.npmdavi.davinotification.NotificationStorageModule$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$startExpirationChecker$0();
            }
        }, 0L, 1L, TimeUnit.SECONDS);
    }

    @ReactMethod
    public void checkAndDeleteByAvailabilityTime(Promise promise) {
        SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT id, category_availability_time, category_life_expectancy, register_date FROM Notifications WHERE category_availability_time > 0", null);
                if (cursorRawQuery != null) {
                    String str = "Cursor count: " + cursorRawQuery.getCount();
                    int columnIndex = cursorRawQuery.getColumnIndex("id");
                    int columnIndex2 = cursorRawQuery.getColumnIndex(DatabaseHelper.COLUMN_CATEGORY_AVAILABILITY_TIME);
                    int columnIndex3 = cursorRawQuery.getColumnIndex(DatabaseHelper.COLUMN_REGISTER_DATE);
                    while (cursorRawQuery.moveToNext()) {
                        String str2 = "Row - id: " + cursorRawQuery.getString(columnIndex) + ", availabilityTime: " + cursorRawQuery.getLong(columnIndex2) + ", registerDate: " + cursorRawQuery.getString(columnIndex3);
                    }
                    cursorRawQuery.moveToPosition(-1);
                }
                while (cursorRawQuery != null && cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("id"));
                    long j2 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(DatabaseHelper.COLUMN_CATEGORY_AVAILABILITY_TIME));
                    long j3 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(DatabaseHelper.COLUMN_CATEGORY_LIFE_EXPECTANCY));
                    long j4 = parseregisterDate(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(DatabaseHelper.COLUMN_REGISTER_DATE)));
                    if (j4 != -1) {
                        if (jCurrentTimeMillis - j4 >= (j3 * 1000) + (j2 * 1000)) {
                            arrayList.add(string);
                        }
                    }
                }
                deleteNotificationsBatch(writableDatabase, arrayList);
                arrayList.clear();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                if (!arrayList.isEmpty()) {
                    deleteNotificationsBatch(writableDatabase, arrayList);
                }
                promise.resolve(true);
            } catch (Exception e2) {
                promise.reject("ERROR", "Error checking availability time");
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @ReactMethod
    public void deleteAllNotifications(Promise promise) {
        int iDelete = this.dbHelper.getWritableDatabase().delete(DatabaseHelper.TABLE_NOTIFICATIONS, null, null);
        if (iDelete >= 0) {
            promise.resolve(Integer.valueOf(iDelete));
        } else {
            promise.reject("ERROR", "Failed to delete all notifications");
        }
    }

    @ReactMethod
    public void deleteNotification(String str, Promise promise) {
        try {
            int iDelete = this.dbHelper.getWritableDatabase().delete(DatabaseHelper.TABLE_NOTIFICATIONS, "id_notification = ?", new String[]{str});
            if (iDelete > 0) {
                promise.resolve(Integer.valueOf(iDelete));
            } else {
                promise.reject("ERROR", "Failed to delete notification");
            }
        } catch (Exception e2) {
            promise.reject("ERROR", e2.getMessage());
        }
    }

    @ReactMethod
    public void getAllNotifications(String str, String str2, Promise promise) {
        boolean z2;
        SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
        StringBuilder sb = new StringBuilder("SELECT * FROM Notifications");
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            sb.append(" WHERE status = ?");
            arrayList.add(str);
            z2 = true;
        } else {
            z2 = false;
        }
        if (str2 != null) {
            if (z2) {
                sb.append(" AND ");
            } else {
                sb.append(" WHERE ");
            }
            if (str2.equals(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()))) {
                sb.append("register_date >= ?");
            } else {
                sb.append("register_date <= ?");
            }
            arrayList.add(str2);
        }
        Cursor cursorRawQuery = readableDatabase.rawQuery(sb.toString(), arrayList.isEmpty() ? null : (String[]) arrayList.toArray(new String[0]));
        WritableArray writableArrayCreateArray = Arguments.createArray();
        while (cursorRawQuery.moveToNext()) {
            writableArrayCreateArray.pushMap(mapCursorToNotification(cursorRawQuery));
        }
        cursorRawQuery.close();
        promise.resolve(writableArrayCreateArray);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NotificationStorage";
    }

    @ReactMethod
    public void getNotifications(final boolean z2, final int i2, final int i3, final Promise promise) {
        if (i2 == 0) {
            checkAndDeleteByAvailabilityTime(new Promise() { // from class: com.npmdavi.davinotification.NotificationStorageModule.1
                @Override // com.facebook.react.bridge.Promise
                public void reject(String str) {
                    promise.reject("ERROR", str);
                }

                @Override // com.facebook.react.bridge.Promise
                public void reject(String str, WritableMap writableMap) {
                    promise.reject(str, writableMap);
                }

                @Override // com.facebook.react.bridge.Promise
                public void reject(String str, String str2) {
                    promise.reject(str, str2);
                }

                @Override // com.facebook.react.bridge.Promise
                public void reject(String str, String str2, WritableMap writableMap) {
                    promise.reject(str, str2, writableMap);
                }

                @Override // com.facebook.react.bridge.Promise
                public void reject(String str, String str2, Throwable th) {
                    promise.reject(str, str2, th);
                }

                @Override // com.facebook.react.bridge.Promise
                public void reject(String str, String str2, Throwable th, WritableMap writableMap) {
                    promise.reject(str, str2, th, writableMap);
                }

                @Override // com.facebook.react.bridge.Promise
                public void reject(String str, Throwable th) {
                    promise.reject(str, th);
                }

                @Override // com.facebook.react.bridge.Promise
                public void reject(String str, Throwable th, WritableMap writableMap) {
                    promise.reject(str, th, writableMap);
                }

                @Override // com.facebook.react.bridge.Promise
                public void reject(Throwable th) {
                    promise.reject(th);
                }

                @Override // com.facebook.react.bridge.Promise
                public void reject(Throwable th, WritableMap writableMap) {
                    promise.reject(th, writableMap);
                }

                @Override // com.facebook.react.bridge.Promise
                public void resolve(Object obj) {
                    NotificationStorageModule.this.fetchNotifications(z2, i2, i3, promise);
                }
            });
        } else {
            fetchNotifications(z2, i2, i3, promise);
        }
    }

    @ReactMethod
    public void getNotificationsCount(final Promise promise) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 27657);
        short sXd2 = (short) (C1607wl.Xd() ^ 2224);
        int[] iArr = new int["AckY\u0010 N\u001fy\u0017,5\t=TAW(\n\bF4\u001d\u001b\u001cQ\u00112gG".length()];
        QB qb = new QB("AckY\u0010 N\u001fy\u0017,5\t=TAW(\n\bF4\u001d\u001b\u001cQ\u00112gG");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (C1499aX.Xd() ^ (-11623));
        int[] iArr2 = new int["y\u001b\u0019j\u0016v\u0002$f+7\t,6QT>1W]\u0015<Y".length()];
        QB qb2 = new QB("y\u001b\u0019j\u0016v\u0002$f+7\t,6QT>1W]\u0015<Y");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            ((ExecutorService) declaredMethod.invoke(null, objArr)).execute(new Runnable() { // from class: com.npmdavi.davinotification.NotificationStorageModule$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$getNotificationsCount$2(promise);
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void hasUnreadNotifications(final Promise promise) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(EO.Od("D\u0014+6\u001a6\tV\u001c\u0002-_-$&I\u001e\u0013TrnB\ft%c\u0005,i|", (short) (FB.Xd() ^ 32476))).getDeclaredMethod(C1561oA.Qd("\u0012\b\u0019s\t\r\u0005\t\u0001n\u0002\u000b|wyY\fwt\u0006\u0004}\u007f", (short) (FB.Xd() ^ 18767)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            ((ExecutorService) declaredMethod.invoke(null, objArr)).execute(new Runnable() { // from class: com.npmdavi.davinotification.NotificationStorageModule$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$hasUnreadNotifications$1(promise);
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void saveNotification(ReadableMap readableMap, Promise promise) {
        SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
        Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT id_notification FROM Notifications WHERE id_notification = ?", new String[]{readableMap.getString(Constant.NOTIFICATION_DETAILS_ID_NOTIFICATION)});
        if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
            cursorRawQuery.close();
            promise.reject("ERROR", "Notification with this idNotification already exists");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.COLUMN_REGISTER_DATE, readableMap.getString("registerDate"));
        contentValues.put(DatabaseHelper.COLUMN_ID_NOTIFICATION, readableMap.getString(Constant.NOTIFICATION_DETAILS_ID_NOTIFICATION));
        contentValues.put("message", readableMap.getString("message"));
        contentValues.put("status", readableMap.getString("status"));
        contentValues.put("title", readableMap.getString("title"));
        contentValues.put(DatabaseHelper.COLUMN_USER_KEY, readableMap.getString("userKey"));
        contentValues.put(DatabaseHelper.COLUMN_IS_EXPIRED, (Boolean) false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = parseregisterDate(readableMap.getString("registerDate"));
        if (readableMap.hasKey("data")) {
            try {
                contentValues.put("data", new JSONObject(readableMap.getMap("data").toHashMap()).toString());
            } catch (Exception unused) {
                contentValues.putNull("data");
            }
        }
        if (readableMap.hasKey("category")) {
            ReadableMap map = readableMap.getMap("category");
            if (map.hasKey("categoryId")) {
                contentValues.put(DatabaseHelper.COLUMN_CATEGORY_ID, map.getString("categoryId"));
            }
            if (map.hasKey("type")) {
                contentValues.put(DatabaseHelper.COLUMN_CATEGORY_TYPE, map.getString("type"));
            }
            if (map.hasKey("lifeExpectancy")) {
                contentValues.put(DatabaseHelper.COLUMN_CATEGORY_LIFE_EXPECTANCY, String.valueOf(map.getDouble("lifeExpectancy")));
                long j3 = ((long) ((int) map.getDouble("lifeExpectancy"))) * 1000;
                if (j2 != -1 && map.getBoolean("flag")) {
                    contentValues.put(DatabaseHelper.COLUMN_IS_EXPIRED, Boolean.valueOf(jCurrentTimeMillis - j2 >= j3));
                }
            }
            if (map.hasKey("availabilityTime")) {
                contentValues.put(DatabaseHelper.COLUMN_CATEGORY_AVAILABILITY_TIME, Double.valueOf(map.getDouble("availabilityTime")));
            }
            if (map.hasKey("flag")) {
                contentValues.put(DatabaseHelper.COLUMN_CATEGORY_FLAG, Boolean.valueOf(map.getBoolean("flag")));
            }
            if (map.hasKey("flagText")) {
                contentValues.put(DatabaseHelper.COLUMN_CATEGORY_FLAG_TEXT, map.getString("flagText"));
            }
            if (map.hasKey("flagColor")) {
                contentValues.put(DatabaseHelper.COLUMN_CATEGORY_FLAG_COLOR, map.getString("flagColor"));
            }
        }
        long jInsert = writableDatabase.insert(DatabaseHelper.TABLE_NOTIFICATIONS, null, contentValues);
        if (jInsert != -1) {
            promise.resolve(String.valueOf(jInsert));
        } else {
            promise.reject("ERROR", "Failed to save notification");
        }
    }

    @ReactMethod
    public void updateNotification(String str, ReadableMap readableMap, Promise promise) {
        SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
        StringBuilder sb = new StringBuilder("UPDATE Notifications SET ");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (readableMap.hasKey("registerDate") && !readableMap.isNull("registerDate")) {
            arrayList2.add("register_date = ?");
            arrayList.add(readableMap.getString("registerDate"));
        }
        if (readableMap.hasKey("message") && !readableMap.isNull("message")) {
            arrayList2.add("message = ?");
            arrayList.add(readableMap.getString("message"));
        }
        if (readableMap.hasKey("status") && !readableMap.isNull("status")) {
            arrayList2.add("status = ?");
            arrayList.add(readableMap.getString("status"));
        }
        if (readableMap.hasKey("title") && !readableMap.isNull("title")) {
            arrayList2.add("title = ?");
            arrayList.add(readableMap.getString("title"));
        }
        if (readableMap.hasKey("data") && !readableMap.isNull("data")) {
            try {
                JSONObject jSONObject = new JSONObject(readableMap.getMap("data").toHashMap());
                arrayList2.add("data = ?");
                arrayList.add(jSONObject.toString());
            } catch (Exception unused) {
                promise.reject("ERROR", "Failed to serialize data field");
                return;
            }
        }
        if (readableMap.hasKey("category") && !readableMap.isNull("category")) {
            ReadableMap map = readableMap.getMap("category");
            if (map.hasKey("categoryId") && !map.isNull("categoryId")) {
                arrayList2.add("category_id = ?");
                arrayList.add(map.getString("categoryId"));
            }
            if (map.hasKey("type") && !map.isNull("type")) {
                arrayList2.add("category_type = ?");
                arrayList.add(map.getString("type"));
            }
        }
        sb.append(String.join(", ", arrayList2));
        sb.append(" WHERE id_notification = ?");
        arrayList.add(str);
        try {
            writableDatabase.execSQL(sb.toString(), (String[]) arrayList.toArray(new String[0]));
            promise.resolve("Notification updated successfully");
        } catch (Exception e2) {
            promise.reject("ERROR", "Failed to update notification: " + e2.getMessage());
        }
    }
}
