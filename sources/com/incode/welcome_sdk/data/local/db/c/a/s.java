package com.incode.welcome_sdk.data.local.db.c.a;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8350b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8351e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedSQLiteStatement f8352a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final RoomDatabase f8353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c> f8354d;

    public s(RoomDatabase roomDatabase) {
        this.f8353c = roomDatabase;
        this.f8354d = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.s.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8369a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8370b = 1;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.c cVar) {
                int i2 = 2 % 2;
                int i3 = f8370b + 17;
                f8369a = i3 % 128;
                int i4 = i3 % 2;
                a(supportSQLiteStatement, cVar);
                int i5 = f8370b + 105;
                f8369a = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8369a + 41;
                int i4 = i3 % 128;
                f8370b = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 99;
                f8369a = i6 % 128;
                int i7 = i6 % 2;
                return "INSERT OR REPLACE INTO `flow_config` (`id`,`flow_tag`) VALUES (nullif(?, 0),?)";
            }

            private static void a(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.c cVar) {
                int i2 = 2 % 2;
                int i3 = f8369a + 113;
                f8370b = i3 % 128;
                int i4 = i3 % 2;
                supportSQLiteStatement.bindLong(1, cVar.d());
                if (cVar.a() == null) {
                    supportSQLiteStatement.bindNull(2);
                    return;
                }
                supportSQLiteStatement.bindString(2, cVar.a());
                int i5 = f8369a + 19;
                f8370b = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 31 / 0;
                }
            }
        };
        this.f8352a = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.s.1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8355d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8356e = 1;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8355d + 121;
                int i4 = i3 % 128;
                f8356e = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 1;
                f8355d = i6 % 128;
                int i7 = i6 % 2;
                return "DELETE FROM flow_config";
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.n
    public final Single<Long> c(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.c cVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.s.3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8362b = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8363e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8363e + 83;
                f8362b = i4 % 128;
                int i5 = i4 % 2;
                Long lD = d();
                int i6 = f8363e + 109;
                f8362b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 51 / 0;
                }
                return lD;
            }

            private Long d() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8362b + 51;
                f8363e = i4 % 128;
                try {
                    if (i4 % 2 == 0) {
                        s.this.f8353c.beginTransaction();
                        Long lValueOf = Long.valueOf(s.this.f8354d.insertAndReturnId(cVar));
                        s.this.f8353c.setTransactionSuccessful();
                        return lValueOf;
                    }
                    s.this.f8353c.beginTransaction();
                    Long.valueOf(s.this.f8354d.insertAndReturnId(cVar));
                    s.this.f8353c.setTransactionSuccessful();
                    s.this.f8353c.endTransaction();
                    throw null;
                } finally {
                    s.this.f8353c.endTransaction();
                }
            }
        });
        int i3 = f8351e + 39;
        f8350b = i3 % 128;
        int i4 = i3 % 2;
        return singleFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.n
    public final Completable a() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.s.4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8366b = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8367e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8366b + 83;
                f8367e = i4 % 128;
                int i5 = i4 % 2;
                Void voidD = d();
                if (i5 != 0) {
                    int i6 = 95 / 0;
                }
                return voidD;
            }

            private Void d() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8366b + 95;
                f8367e = i4 % 128;
                int i5 = i4 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = s.this.f8352a.acquire();
                try {
                    s.this.f8353c.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        s.this.f8353c.setTransactionSuccessful();
                        s.this.f8352a.release(supportSQLiteStatementAcquire);
                        int i6 = f8367e + 15;
                        f8366b = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 25 / 0;
                        }
                        return null;
                    } finally {
                        s.this.f8353c.endTransaction();
                    }
                } catch (Throwable th) {
                    s.this.f8352a.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8351e + 55;
        f8350b = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.n
    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e> b(long j2) {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM flow_config WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e> maybeFromCallable = Maybe.fromCallable(new Callable<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.s.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8358a = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8359d = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8359d + 101;
                f8358a = i4 % 128;
                int i5 = i4 % 2;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e eVarB = b();
                int i6 = f8359d + 115;
                f8358a = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 75 / 0;
                }
                return eVarB;
            }

            private com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e b() throws Exception {
                int i3 = 2 % 2;
                s.this.f8353c.beginTransaction();
                try {
                    com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e eVar = null;
                    String string = null;
                    Cursor cursorQuery = DBUtil.query(s.this.f8353c, roomSQLiteQueryAcquire, true, null);
                    try {
                        int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                        int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flow_tag");
                        LongSparseArray<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> longSparseArray = new LongSparseArray<>();
                        while (cursorQuery.moveToNext()) {
                            int i4 = f8358a + 57;
                            f8359d = i4 % 128;
                            if (i4 % 2 == 0) {
                                longSparseArray.put(cursorQuery.getLong(columnIndexOrThrow), null);
                                throw null;
                            }
                            longSparseArray.put(cursorQuery.getLong(columnIndexOrThrow), null);
                        }
                        cursorQuery.moveToPosition(-1);
                        s.this.d(longSparseArray);
                        if (cursorQuery.moveToFirst()) {
                            long j3 = cursorQuery.getLong(columnIndexOrThrow);
                            if (cursorQuery.isNull(columnIndexOrThrow2)) {
                                int i5 = f8358a + 67;
                                f8359d = i5 % 128;
                                int i6 = i5 % 2;
                            } else {
                                string = cursorQuery.getString(columnIndexOrThrow2);
                                int i7 = f8359d + 19;
                                f8358a = i7 % 128;
                                int i8 = i7 % 2;
                            }
                            eVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.c(j3, string), longSparseArray.get(cursorQuery.getLong(columnIndexOrThrow)));
                        }
                        s.this.f8353c.setTransactionSuccessful();
                        return eVar;
                    } finally {
                        cursorQuery.close();
                    }
                } finally {
                    s.this.f8353c.endTransaction();
                }
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8358a + 95;
                f8359d = i4 % 128;
                if (i4 % 2 == 0) {
                    roomSQLiteQueryAcquire.release();
                    int i5 = 46 / 0;
                } else {
                    roomSQLiteQueryAcquire.release();
                }
                int i6 = f8358a + 97;
                f8359d = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i3 = f8350b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8351e = i3 % 128;
        int i4 = i3 % 2;
        return maybeFromCallable;
    }

    public static List<Class<?>> d() {
        int i2 = 2 % 2;
        int i3 = f8350b + 51;
        f8351e = i3 % 128;
        int i4 = i3 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i5 = f8351e + 107;
        f8350b = i5 % 128;
        int i6 = i5 % 2;
        return listEmptyList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit b(LongSparseArray longSparseArray) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = f8351e + 1;
        f8350b = i3 % 128;
        if (i3 % 2 == 0) {
            d(longSparseArray);
            unit = Unit.INSTANCE;
            int i4 = 69 / 0;
        } else {
            d(longSparseArray);
            unit = Unit.INSTANCE;
        }
        int i5 = f8351e + 77;
        f8350b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r21.size() <= 999) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        androidx.room.util.RelationUtil.recursiveFetchLongSparseArray(r21, false, new com.incode.welcome_sdk.data.local.db.c.a.s$$ExternalSyntheticLambda0(r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = androidx.room.util.StringUtil.newStringBuilder();
        r2.append("SELECT `id`,`session_config_id`,`flow_config_id`,`is_completed`,`is_synced`,`result_code` FROM `delayed_onboarding` WHERE `flow_config_id` IN (");
        r1 = r21.size();
        androidx.room.util.StringUtil.appendPlaceholders(r2, r1);
        r2.append(")");
        r9 = androidx.room.RoomSQLiteQuery.acquire(r2.toString(), r1);
        r3 = 0;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r3 >= r21.size()) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r9.bindLong(r2, r21.keyAt(r3));
        r2 = r2 + 1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        r4 = null;
        r3 = androidx.room.util.DBUtil.query(r20.f8353c, r9, false, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        r2 = androidx.room.util.CursorUtil.getColumnIndex(r3, "flow_config_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r2 != (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        r1 = com.incode.welcome_sdk.data.local.db.c.a.s.f8351e + 77;
        com.incode.welcome_sdk.data.local.db.c.a.s.f8350b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if ((r1 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        r3.close();
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r3.moveToNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        r0 = r3.getLong(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r21.containsKey(r0) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        r11 = r3.getLong(0);
        r13 = r3.getLong(1);
        r15 = r3.getLong(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (r3.getInt(3) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        r9 = com.incode.welcome_sdk.data.local.db.c.a.s.f8351e + 87;
        com.incode.welcome_sdk.data.local.db.c.a.s.f8350b = r9 % 128;
        r9 = r9 % 2;
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        if (r3.getInt(4) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        if (r3.isNull(5) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        r19 = r3.getString(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        r21.put(r0, new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d(r11, r13, r15, r17, r18, r19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r21.isEmpty() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        r1 = com.incode.welcome_sdk.data.local.db.c.a.s.f8350b + 25;
        com.incode.welcome_sdk.data.local.db.c.a.s.f8351e = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r21.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void d(androidx.collection.LongSparseArray<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> r21) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.s.d(androidx.collection.LongSparseArray):void");
    }
}
