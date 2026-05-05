package com.incode.welcome_sdk.data.local.db.c.a;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
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

/* JADX INFO: loaded from: classes5.dex */
public final class ab implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8087b = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f8088f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> f8089a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> f8090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RoomDatabase f8091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SharedSQLiteStatement f8092e;

    public ab(RoomDatabase roomDatabase) {
        this.f8091d = roomDatabase;
        this.f8090c = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.ab.4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8106a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8107c = 1;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
                int i2 = 2 % 2;
                int i3 = f8106a + 65;
                f8107c = i3 % 128;
                int i4 = i3 % 2;
                a(supportSQLiteStatement, bVar);
                if (i4 == 0) {
                    int i5 = 84 / 0;
                }
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8106a;
                int i4 = i3 + 67;
                f8107c = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 61;
                f8107c = i6 % 128;
                if (i6 % 2 != 0) {
                    return "INSERT OR REPLACE INTO `process_id` (`_id`,`is_completed`,`is_synced`) VALUES (nullif(?, 0),?,?)";
                }
                throw null;
            }

            private static void a(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
                int i2;
                int i3 = 2 % 2;
                int i4 = 1;
                supportSQLiteStatement.bindLong(1, bVar.e());
                if (bVar.d()) {
                    int i5 = f8107c + 29;
                    f8106a = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 1;
                } else {
                    int i7 = f8107c + 101;
                    f8106a = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = 0;
                }
                supportSQLiteStatement.bindLong(2, i2);
                if (!bVar.a()) {
                    i4 = 0;
                } else {
                    int i9 = f8107c + 43;
                    f8106a = i9 % 128;
                    int i10 = i9 % 2;
                }
                supportSQLiteStatement.bindLong(3, i4);
            }
        };
        this.f8089a = new EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.ab.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8093c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8094e = 1;

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
                int i2 = 2 % 2;
                int i3 = f8094e + 47;
                f8093c = i3 % 128;
                int i4 = i3 % 2;
                d(supportSQLiteStatement, bVar);
                int i5 = f8094e + 41;
                f8093c = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8094e + 53;
                f8093c = i3 % 128;
                if (i3 % 2 == 0) {
                    return "UPDATE OR ABORT `process_id` SET `_id` = ?,`is_completed` = ?,`is_synced` = ? WHERE `_id` = ?";
                }
                int i4 = 33 / 0;
                return "UPDATE OR ABORT `process_id` SET `_id` = ?,`is_completed` = ?,`is_synced` = ? WHERE `_id` = ?";
            }

            private static void d(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
                int i2;
                int i3 = 2 % 2;
                int i4 = 1;
                supportSQLiteStatement.bindLong(1, bVar.e());
                if (bVar.d()) {
                    int i5 = f8093c + 37;
                    int i6 = i5 % 128;
                    f8094e = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 89;
                    f8093c = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                supportSQLiteStatement.bindLong(2, i2);
                if (bVar.a()) {
                    int i10 = f8094e + 51;
                    f8093c = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    i4 = 0;
                }
                supportSQLiteStatement.bindLong(3, i4);
                supportSQLiteStatement.bindLong(4, bVar.e());
            }
        };
        this.f8092e = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.ab.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8099a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8100b = 0;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8100b;
                int i4 = i3 + 21;
                f8099a = i4 % 128;
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 115;
                f8099a = i5 % 128;
                int i6 = i5 % 2;
                return "DELETE FROM process_id";
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.u
    public final Single<Long> e(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.ab.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8102a = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8103e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8102a + 13;
                f8103e = i4 % 128;
                if (i4 % 2 == 0) {
                    return c();
                }
                c();
                throw null;
            }

            private Long c() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8102a + 91;
                f8103e = i4 % 128;
                try {
                    if (i4 % 2 != 0) {
                        ab.this.f8091d.beginTransaction();
                        Long.valueOf(ab.this.f8090c.insertAndReturnId(bVar));
                        ab.this.f8091d.setTransactionSuccessful();
                        ab.this.f8091d.endTransaction();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ab.this.f8091d.beginTransaction();
                    Long lValueOf = Long.valueOf(ab.this.f8090c.insertAndReturnId(bVar));
                    ab.this.f8091d.setTransactionSuccessful();
                    ab.this.f8091d.endTransaction();
                    int i5 = f8102a + 95;
                    f8103e = i5 % 128;
                    int i6 = i5 % 2;
                    return lValueOf;
                } catch (Throwable th) {
                    ab.this.f8091d.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8088f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8087b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 39 / 0;
        }
        return singleFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.u
    public final Completable a(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.ab.5

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8109d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8110e = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8109d + 63;
                f8110e = i4 % 128;
                if (i4 % 2 == 0) {
                    a();
                    throw null;
                }
                Void voidA = a();
                int i5 = f8110e + 107;
                f8109d = i5 % 128;
                int i6 = i5 % 2;
                return voidA;
            }

            private Void a() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8110e + 95;
                f8109d = i4 % 128;
                try {
                    if (i4 % 2 == 0) {
                        ab.this.f8091d.beginTransaction();
                        ab.this.f8089a.handle(bVar);
                        ab.this.f8091d.setTransactionSuccessful();
                        ab.this.f8091d.endTransaction();
                        int i5 = f8110e + 41;
                        f8109d = i5 % 128;
                        int i6 = i5 % 2;
                        return null;
                    }
                    ab.this.f8091d.beginTransaction();
                    ab.this.f8089a.handle(bVar);
                    ab.this.f8091d.setTransactionSuccessful();
                    throw null;
                } finally {
                    ab.this.f8091d.endTransaction();
                }
            }
        });
        int i3 = f8088f + 75;
        f8087b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 56 / 0;
        }
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.u
    public final Completable d() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.ab.10

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8096d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8097e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8096d + 17;
                f8097e = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    a();
                    obj.hashCode();
                    throw null;
                }
                Void voidA = a();
                int i5 = f8097e + 33;
                f8096d = i5 % 128;
                if (i5 % 2 != 0) {
                    return voidA;
                }
                obj.hashCode();
                throw null;
            }

            private Void a() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8096d + 29;
                f8097e = i4 % 128;
                int i5 = i4 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = ab.this.f8092e.acquire();
                try {
                    ab.this.f8091d.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        ab.this.f8091d.setTransactionSuccessful();
                        ab.this.f8092e.release(supportSQLiteStatementAcquire);
                        int i6 = f8097e + 41;
                        f8096d = i6 % 128;
                        Object obj = null;
                        if (i6 % 2 != 0) {
                            return null;
                        }
                        obj.hashCode();
                        throw null;
                    } finally {
                        ab.this.f8091d.endTransaction();
                    }
                } catch (Throwable th) {
                    ab.this.f8092e.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8087b + 41;
        f8088f = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.u
    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> b(long j2) {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM process_id WHERE _id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> maybeFromCallable = Maybe.fromCallable(new Callable<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.ab.7

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8113b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8114d = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8114d + 83;
                f8113b = i4 % 128;
                if (i4 % 2 != 0) {
                    e();
                    throw null;
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVarE = e();
                int i5 = f8114d + 11;
                f8113b = i5 % 128;
                if (i5 % 2 == 0) {
                    return bVarE;
                }
                throw null;
            }

            private com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b e() throws Exception {
                int i3 = 2 % 2;
                boolean z2 = false;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar = null;
                Cursor cursorQuery = DBUtil.query(ab.this.f8091d, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_completed");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_synced");
                    if (cursorQuery.moveToFirst()) {
                        int i4 = f8113b + 31;
                        f8114d = i4 % 128;
                        int i5 = i4 % 2;
                        long j3 = cursorQuery.getLong(columnIndexOrThrow);
                        boolean z3 = cursorQuery.getInt(columnIndexOrThrow2) != 0;
                        if (cursorQuery.getInt(columnIndexOrThrow3) != 0) {
                            z2 = true;
                        } else {
                            int i6 = f8113b + 43;
                            f8114d = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i7 = 3 % 3;
                            }
                        }
                        bVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b(j3, z3, z2);
                    }
                    return bVar;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8113b + 3;
                f8114d = i4 % 128;
                if (i4 % 2 != 0) {
                    roomSQLiteQueryAcquire.release();
                    return;
                }
                roomSQLiteQueryAcquire.release();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i3 = f8087b + 67;
        f8088f = i3 % 128;
        if (i3 % 2 != 0) {
            return maybeFromCallable;
        }
        throw null;
    }

    public static List<Class<?>> a() {
        int i2 = 2 % 2;
        int i3 = f8087b + 97;
        f8088f = i3 % 128;
        if (i3 % 2 == 0) {
            Collections.emptyList();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i4 = f8087b + 15;
        f8088f = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }
}
