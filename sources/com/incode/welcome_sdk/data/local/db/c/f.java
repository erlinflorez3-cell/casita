package com.incode.welcome_sdk.data.local.db.c;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.incode.welcome_sdk.data.local.i;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8537a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8538d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final EntityInsertionAdapter<i> f8539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final RoomDatabase f8540c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SharedSQLiteStatement f8541e;

    public f(RoomDatabase roomDatabase) {
        this.f8540c = roomDatabase;
        this.f8539b = new EntityInsertionAdapter<i>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.f.4

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8553d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8554e = 0;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, i iVar) {
                int i2 = 2 % 2;
                int i3 = f8554e + 15;
                f8553d = i3 % 128;
                int i4 = i3 % 2;
                e(supportSQLiteStatement, iVar);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8553d + 1;
                int i4 = i3 % 128;
                f8554e = i4;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i5 = i4 + 123;
                f8553d = i5 % 128;
                int i6 = i5 % 2;
                return "INSERT OR REPLACE INTO `feature_config` (`id`,`feature`,`enabled`) VALUES (nullif(?, 0),?,?)";
            }

            private static void e(SupportSQLiteStatement supportSQLiteStatement, i iVar) {
                int i2 = 2 % 2;
                int i3 = f8553d + 109;
                f8554e = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 1;
                supportSQLiteStatement.bindLong(1, iVar.c());
                if (iVar.d() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, iVar.d());
                }
                if (iVar.b()) {
                    int i6 = f8553d + 33;
                    f8554e = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    int i8 = f8553d + 7;
                    f8554e = i8 % 128;
                    int i9 = i8 % 2;
                    i5 = 0;
                }
                supportSQLiteStatement.bindLong(3, i5);
                int i10 = f8553d + 111;
                f8554e = i10 % 128;
                int i11 = i10 % 2;
            }
        };
        this.f8541e = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.f.2

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8546c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8547e = 1;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8546c + 57;
                f8547e = i3 % 128;
                if (i3 % 2 != 0) {
                    return "DELETE FROM feature_config";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.c
    public final Single<Long> a(final i iVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.f.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8542b = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8543e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8543e + 81;
                f8542b = i4 % 128;
                int i5 = i4 % 2;
                Long lD = d();
                int i6 = f8543e + 43;
                f8542b = i6 % 128;
                int i7 = i6 % 2;
                return lD;
            }

            private Long d() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8543e + 31;
                f8542b = i4 % 128;
                try {
                    if (i4 % 2 != 0) {
                        f.this.f8540c.beginTransaction();
                        Long lValueOf = Long.valueOf(f.this.f8539b.insertAndReturnId(iVar));
                        f.this.f8540c.setTransactionSuccessful();
                        return lValueOf;
                    }
                    f.this.f8540c.beginTransaction();
                    Long.valueOf(f.this.f8539b.insertAndReturnId(iVar));
                    f.this.f8540c.setTransactionSuccessful();
                    f.this.f8540c.endTransaction();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } finally {
                    f.this.f8540c.endTransaction();
                }
            }
        });
        int i3 = f8537a + 103;
        f8538d = i3 % 128;
        int i4 = i3 % 2;
        return singleFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.c
    public final Completable b() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.f.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8556a = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8557c = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8557c + 59;
                f8556a = i4 % 128;
                if (i4 % 2 == 0) {
                    d();
                    throw null;
                }
                Void voidD = d();
                int i5 = f8557c + 85;
                f8556a = i5 % 128;
                if (i5 % 2 != 0) {
                    return voidD;
                }
                throw null;
            }

            private Void d() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8557c + 113;
                f8556a = i4 % 128;
                int i5 = i4 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = f.this.f8541e.acquire();
                try {
                    f.this.f8540c.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        f.this.f8540c.setTransactionSuccessful();
                        f.this.f8541e.release(supportSQLiteStatementAcquire);
                        int i6 = f8556a + 93;
                        f8557c = i6 % 128;
                        if (i6 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    } finally {
                        f.this.f8540c.endTransaction();
                    }
                } catch (Throwable th) {
                    f.this.f8541e.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8537a + 7;
        f8538d = i3 % 128;
        if (i3 % 2 != 0) {
            return completableFromCallable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.c
    public final Single<List<i>> c() {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM feature_config", 0);
        Single<List<i>> singleCreateSingle = RxRoom.createSingle(new Callable<List<i>>() { // from class: com.incode.welcome_sdk.data.local.db.c.f.3

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8549c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8550e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ List<i> call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8550e + 109;
                f8549c = i4 % 128;
                int i5 = i4 % 2;
                List<i> listE = e();
                int i6 = f8549c + 111;
                f8550e = i6 % 128;
                int i7 = i6 % 2;
                return listE;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private java.util.List<com.incode.welcome_sdk.data.local.i> e() throws java.lang.Exception {
                /*
                    r14 = this;
                    r13 = 2
                    int r0 = r13 % r13
                    com.incode.welcome_sdk.data.local.db.c.f r0 = com.incode.welcome_sdk.data.local.db.c.f.this
                    androidx.room.RoomDatabase r1 = r0.f8540c
                    androidx.room.RoomSQLiteQuery r0 = r2
                    r12 = 0
                    r11 = 0
                    android.database.Cursor r10 = androidx.room.util.DBUtil.query(r1, r0, r12, r11)
                    java.lang.String r0 = "id"
                    int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r10, r0)     // Catch: java.lang.Throwable -> L76
                    java.lang.String r0 = "feature"
                    int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r10, r0)     // Catch: java.lang.Throwable -> L76
                    java.lang.String r0 = "enabled"
                    int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r10, r0)     // Catch: java.lang.Throwable -> L76
                    java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L76
                    int r0 = r10.getCount()     // Catch: java.lang.Throwable -> L76
                    r6.<init>(r0)     // Catch: java.lang.Throwable -> L76
                L2a:
                    boolean r0 = r10.moveToNext()     // Catch: java.lang.Throwable -> L76
                    r5 = 1
                    r0 = r0 ^ r5
                    if (r0 == r5) goto L72
                    int r0 = com.incode.welcome_sdk.data.local.db.c.f.AnonymousClass3.f8549c
                    int r1 = r0 + 109
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.f.AnonymousClass3.f8550e = r0
                    int r1 = r1 % r13
                    if (r1 != 0) goto L68
                    long r2 = r10.getLong(r9)     // Catch: java.lang.Throwable -> L76
                    boolean r0 = r10.isNull(r8)     // Catch: java.lang.Throwable -> L76
                    if (r0 == 0) goto L49
                    r4 = r11
                    goto L4d
                L49:
                    java.lang.String r4 = r10.getString(r8)     // Catch: java.lang.Throwable -> L76
                L4d:
                    int r0 = r10.getInt(r7)     // Catch: java.lang.Throwable -> L76
                    if (r0 == 0) goto L5e
                    int r0 = com.incode.welcome_sdk.data.local.db.c.f.AnonymousClass3.f8550e
                    int r1 = r0 + 107
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.f.AnonymousClass3.f8549c = r0
                    int r1 = r1 % r13
                    if (r1 != 0) goto L5f
                L5e:
                    r5 = r12
                L5f:
                    com.incode.welcome_sdk.data.local.i r0 = new com.incode.welcome_sdk.data.local.i     // Catch: java.lang.Throwable -> L76
                    r0.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L76
                    r6.add(r0)     // Catch: java.lang.Throwable -> L76
                    goto L2a
                L68:
                    r10.getLong(r9)     // Catch: java.lang.Throwable -> L76
                    r10.isNull(r8)     // Catch: java.lang.Throwable -> L76
                    r11.hashCode()     // Catch: java.lang.Throwable -> L76
                    throw r11     // Catch: java.lang.Throwable -> L76
                L72:
                    r10.close()
                    return r6
                L76:
                    r0 = move-exception
                    r10.close()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.f.AnonymousClass3.e():java.util.List");
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8549c + 27;
                f8550e = i4 % 128;
                int i5 = i4 % 2;
                roomSQLiteQueryAcquire.release();
                int i6 = f8549c + 101;
                f8550e = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i3 = f8537a + 33;
        f8538d = i3 % 128;
        int i4 = i3 % 2;
        return singleCreateSingle;
    }

    public static List<Class<?>> e() {
        int i2 = 2 % 2;
        int i3 = f8538d + 27;
        f8537a = i3 % 128;
        int i4 = i3 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i5 = f8537a + 95;
        f8538d = i5 % 128;
        if (i5 % 2 != 0) {
            return listEmptyList;
        }
        throw null;
    }
}
