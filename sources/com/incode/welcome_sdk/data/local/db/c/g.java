package com.incode.welcome_sdk.data.local.db.c;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.TemplateModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8559a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8560e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RoomDatabase f8561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EntityInsertionAdapter<TemplateModel> f8562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedSQLiteStatement f8563d;

    public g(RoomDatabase roomDatabase) {
        this.f8561b = roomDatabase;
        this.f8562c = new EntityInsertionAdapter<TemplateModel>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.g.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8567a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8568d = 0;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, TemplateModel templateModel) {
                int i2 = 2 % 2;
                int i3 = f8568d + 75;
                f8567a = i3 % 128;
                int i4 = i3 % 2;
                e(supportSQLiteStatement, templateModel);
                int i5 = f8567a + 61;
                f8568d = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8567a + 9;
                int i4 = i3 % 128;
                f8568d = i4;
                Object obj = null;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 115;
                f8567a = i5 % 128;
                if (i5 % 2 != 0) {
                    return "INSERT OR ABORT INTO `templates` (`templateId`,`template`) VALUES (?,?)";
                }
                throw null;
            }

            private static void e(SupportSQLiteStatement supportSQLiteStatement, TemplateModel templateModel) {
                int i2 = 2 % 2;
                int i3 = f8567a + 91;
                f8568d = i3 % 128;
                int i4 = i3 % 2;
                if (templateModel.getTemplateId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, templateModel.getTemplateId());
                }
                if (templateModel.getTemplate() == null) {
                    supportSQLiteStatement.bindNull(2);
                    int i5 = f8567a + 99;
                    f8568d = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                supportSQLiteStatement.bindString(2, templateModel.getTemplate());
            }
        };
        this.f8563d = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.g.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8564a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8565b = 1;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8564a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                int i4 = i3 % 128;
                f8565b = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 1;
                f8564a = i5 % 128;
                if (i5 % 2 == 0) {
                    return "DELETE FROM templates";
                }
                throw null;
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.h
    public final List<TemplateModel> c() {
        String string;
        String string2;
        int i2 = 2 % 2;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM templates", 0);
        this.f8561b.assertNotSuspendingTransaction();
        Object obj = null;
        Cursor cursorQuery = DBUtil.query(this.f8561b, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "templateId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "template");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                if (!cursorQuery.isNull(columnIndexOrThrow)) {
                    string = cursorQuery.getString(columnIndexOrThrow);
                } else {
                    int i3 = f8560e + 51;
                    f8559a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 45 / 0;
                    }
                    string = null;
                }
                if (cursorQuery.isNull(columnIndexOrThrow2)) {
                    int i5 = f8560e + 5;
                    f8559a = i5 % 128;
                    if (i5 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    string2 = null;
                } else {
                    string2 = cursorQuery.getString(columnIndexOrThrow2);
                }
                arrayList.add(new TemplateModel(string, string2));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:5:0x0028, B:11:0x0054, B:15:0x0060, B:19:0x0074, B:18:0x0070, B:14:0x005c, B:9:0x0046), top: B:26:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[Catch: all -> 0x008a, TRY_ENTER, TryCatch #0 {all -> 0x008a, blocks: (B:5:0x0028, B:11:0x0054, B:15:0x0060, B:19:0x0074, B:18:0x0070, B:14:0x005c, B:9:0x0046), top: B:26:0x0016 }] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // com.incode.welcome_sdk.data.local.db.c.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.data.TemplateModel a() {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.incode.welcome_sdk.data.local.db.c.g.f8559a
            int r4 = r0 + 49
            int r0 = r4 % 128
            com.incode.welcome_sdk.data.local.db.c.g.f8560e = r0
            int r4 = r4 % r7
            java.lang.String r3 = "template"
            java.lang.String r2 = "templateId"
            java.lang.String r0 = "SELECT * FROM templates LIMIT 1"
            r1 = 0
            r6 = 0
            if (r4 == 0) goto L37
            androidx.room.RoomSQLiteQuery r4 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            androidx.room.RoomDatabase r0 = r8.f8561b
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r1 = r8.f8561b
            r0 = 1
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r1, r4, r0, r6)
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r2)     // Catch: java.lang.Throwable -> L8a
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L83
            goto L54
        L37:
            androidx.room.RoomSQLiteQuery r4 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            androidx.room.RoomDatabase r0 = r8.f8561b
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r8.f8561b
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r0, r4, r1, r6)
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r2)     // Catch: java.lang.Throwable -> L8a
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L83
        L54:
            boolean r0 = r5.isNull(r2)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L5c
            r3 = r6
            goto L60
        L5c:
            java.lang.String r3 = r5.getString(r2)     // Catch: java.lang.Throwable -> L8a
        L60:
            boolean r0 = r5.isNull(r1)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L70
            int r0 = com.incode.welcome_sdk.data.local.db.c.g.f8559a
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.g.f8560e = r0
            int r1 = r1 % r7
            goto L74
        L70:
            java.lang.String r6 = r5.getString(r1)     // Catch: java.lang.Throwable -> L8a
        L74:
            com.incode.welcome_sdk.data.TemplateModel r2 = new com.incode.welcome_sdk.data.TemplateModel     // Catch: java.lang.Throwable -> L8a
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L8a
            int r0 = com.incode.welcome_sdk.data.local.db.c.g.f8559a
            int r1 = r0 + 119
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.g.f8560e = r0
            int r1 = r1 % r7
            r6 = r2
        L83:
            r5.close()
            r4.release()
            return r6
        L8a:
            r0 = move-exception
            r5.close()
            r4.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.g.a():com.incode.welcome_sdk.data.TemplateModel");
    }

    public static List<Class<?>> b() {
        int i2 = 2 % 2;
        int i3 = f8560e + 47;
        f8559a = i3 % 128;
        if (i3 % 2 == 0) {
            Collections.emptyList();
            throw null;
        }
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i4 = f8560e + 45;
        f8559a = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }
}
