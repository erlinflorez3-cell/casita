package com.incode.welcome_sdk.data.local.db.c.a;

import android.database.Cursor;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8324a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8325c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j> f8326b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RoomDatabase f8327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SharedSQLiteStatement f8328e;

    public r(RoomDatabase roomDatabase) {
        this.f8327d = roomDatabase;
        this.f8326b = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.r.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8335a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8336c = 1;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar) {
                int i2 = 2 % 2;
                int i3 = f8336c + 103;
                f8335a = i3 % 128;
                int i4 = i3 % 2;
                e(supportSQLiteStatement, jVar);
                if (i4 != 0) {
                    int i5 = 11 / 0;
                }
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8335a;
                int i4 = i3 + 73;
                f8336c = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 103;
                f8336c = i6 % 128;
                if (i6 % 2 != 0) {
                    return "INSERT OR ABORT INTO `flow_modules` (`id`,`flow_config_id`,`module_type_name`,`module_id`,`module_index`) VALUES (nullif(?, 0),?,?,?,?)";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void e(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar) {
                int i2 = 2 % 2;
                supportSQLiteStatement.bindLong(1, jVar.d());
                supportSQLiteStatement.bindLong(2, jVar.c());
                if (jVar.a() != null) {
                    supportSQLiteStatement.bindString(3, jVar.a());
                } else {
                    int i3 = f8336c + 69;
                    f8335a = i3 % 128;
                    int i4 = i3 % 2;
                    supportSQLiteStatement.bindNull(3);
                }
                supportSQLiteStatement.bindLong(4, jVar.e());
                supportSQLiteStatement.bindLong(5, jVar.b());
                int i5 = f8335a + 93;
                f8336c = i5 % 128;
                int i6 = i5 % 2;
            }
        };
        this.f8328e = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.r.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8332a = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8333c = 0;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8333c + 19;
                f8332a = i3 % 128;
                if (i3 % 2 != 0) {
                    return "DELETE FROM flow_modules";
                }
                int i4 = 24 / 0;
                return "DELETE FROM flow_modules";
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.p
    public final Completable c(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.r.4

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8338c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8339d = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8338c + 61;
                f8339d = i4 % 128;
                int i5 = i4 % 2;
                Void voidD = d();
                int i6 = f8338c + 1;
                f8339d = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 15 / 0;
                }
                return voidD;
            }

            private Void d() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8339d + 37;
                f8338c = i4 % 128;
                try {
                    if (i4 % 2 != 0) {
                        r.this.f8327d.beginTransaction();
                        r.this.f8326b.insert(jVar);
                        r.this.f8327d.setTransactionSuccessful();
                        return null;
                    }
                    r.this.f8327d.beginTransaction();
                    r.this.f8326b.insert(jVar);
                    r.this.f8327d.setTransactionSuccessful();
                    throw null;
                } finally {
                    r.this.f8327d.endTransaction();
                }
            }
        });
        int i3 = f8325c + 69;
        f8324a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.p
    public final Completable b() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.r.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8329a = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8330e = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8330e + 19;
                f8329a = i4 % 128;
                int i5 = i4 % 2;
                Void voidD = d();
                int i6 = f8330e + 27;
                f8329a = i6 % 128;
                int i7 = i6 % 2;
                return voidD;
            }

            private Void d() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8329a + 25;
                f8330e = i4 % 128;
                int i5 = i4 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = r.this.f8328e.acquire();
                try {
                    r.this.f8327d.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        r.this.f8327d.setTransactionSuccessful();
                        r.this.f8328e.release(supportSQLiteStatementAcquire);
                        int i6 = f8330e + 29;
                        f8329a = i6 % 128;
                        int i7 = i6 % 2;
                        return null;
                    } finally {
                        r.this.f8327d.endTransaction();
                    }
                } catch (Throwable th) {
                    r.this.f8328e.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8324a + 41;
        f8325c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 76 / 0;
        }
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.p
    public final Maybe<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j>> b(long j2) {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM flow_modules WHERE flow_config_id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        Maybe<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j>> maybeFromCallable = Maybe.fromCallable(new Callable<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j>>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.r.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8342a = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8343e = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j> call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8343e + 71;
                f8342a = i4 % 128;
                int i5 = i4 % 2;
                List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j> listA = a();
                int i6 = f8342a + 69;
                f8343e = i6 % 128;
                int i7 = i6 % 2;
                return listA;
            }

            private List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j> a() throws Exception {
                String string;
                int i3 = 2 % 2;
                r.this.f8327d.beginTransaction();
                try {
                    Object obj = null;
                    Cursor cursorQuery = DBUtil.query(r.this.f8327d, roomSQLiteQueryAcquire, false, null);
                    try {
                        int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                        int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flow_config_id");
                        int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "module_type_name");
                        int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "module_id");
                        int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "module_index");
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        int i4 = f8342a + 19;
                        f8343e = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 2 / 3;
                        }
                        while (cursorQuery.moveToNext()) {
                            long j3 = cursorQuery.getLong(columnIndexOrThrow);
                            long j4 = cursorQuery.getLong(columnIndexOrThrow2);
                            if (!cursorQuery.isNull(columnIndexOrThrow3)) {
                                string = cursorQuery.getString(columnIndexOrThrow3);
                            } else {
                                int i6 = f8343e + 5;
                                f8342a = i6 % 128;
                                if (i6 % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                string = null;
                            }
                            arrayList.add(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.j(j3, j4, string, cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5)));
                        }
                        r.this.f8327d.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        cursorQuery.close();
                    }
                } finally {
                    r.this.f8327d.endTransaction();
                }
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8342a + 123;
                f8343e = i4 % 128;
                int i5 = i4 % 2;
                roomSQLiteQueryAcquire.release();
                int i6 = f8343e + 97;
                f8342a = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i3 = f8325c + 37;
        f8324a = i3 % 128;
        if (i3 % 2 == 0) {
            return maybeFromCallable;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.p
    public final Maybe<Long> c(long j2, String str) {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT module_id FROM flow_modules WHERE flow_config_id = ? AND module_type_name = ?", 2);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str);
            int i3 = f8324a + 61;
            f8325c = i3 % 128;
            int i4 = i3 % 2;
        }
        Maybe<Long> maybeFromCallable = Maybe.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.r.8

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8346a = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8347d = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i5 = 2 % 2;
                int i6 = f8347d + 1;
                f8346a = i6 % 128;
                int i7 = i6 % 2;
                Long lA = a();
                int i8 = f8346a + 9;
                f8347d = i8 % 128;
                int i9 = i8 % 2;
                return lA;
            }

            private Long a() throws Exception {
                int i5 = 2 % 2;
                Long lValueOf = null;
                Cursor cursorQuery = DBUtil.query(r.this.f8327d, roomSQLiteQueryAcquire, false, null);
                try {
                    if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                        int i6 = f8346a + 75;
                        f8347d = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 3 / 5;
                        }
                    } else {
                        int i8 = f8346a + 61;
                        f8347d = i8 % 128;
                        int i9 = i8 % 2;
                        lValueOf = Long.valueOf(cursorQuery.getLong(0));
                    }
                    cursorQuery.close();
                    int i10 = f8347d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f8346a = i10 % 128;
                    int i11 = i10 % 2;
                    return lValueOf;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }

            protected final void finalize() {
                int i5 = 2 % 2;
                int i6 = f8346a + 3;
                f8347d = i6 % 128;
                int i7 = i6 % 2;
                roomSQLiteQueryAcquire.release();
                int i8 = f8347d + 69;
                f8346a = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        int i5 = f8325c + 27;
        f8324a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return maybeFromCallable;
    }

    public static List<Class<?>> a() {
        int i2 = 2 % 2;
        int i3 = f8324a + 97;
        f8325c = i3 % 128;
        if (i3 % 2 != 0) {
            return Collections.emptyList();
        }
        Collections.emptyList();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
