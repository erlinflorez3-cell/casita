package com.incode.welcome_sdk.data.local.db.c.a;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8273a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8274d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.d> f8275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final SharedSQLiteStatement f8276c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final RoomDatabase f8277e;

    public l(RoomDatabase roomDatabase) {
        this.f8277e = roomDatabase;
        this.f8275b = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.d>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.l.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8278a = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8279d = 1;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.d dVar) {
                int i2 = 2 % 2;
                int i3 = f8279d + 49;
                f8278a = i3 % 128;
                int i4 = i3 % 2;
                e(supportSQLiteStatement, dVar);
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = f8278a + 117;
                f8279d = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 85 / 0;
                }
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8279d;
                int i4 = i3 + 107;
                f8278a = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 29;
                f8278a = i6 % 128;
                int i7 = i6 % 2;
                return "INSERT OR REPLACE INTO `face_match_result` (`_id`,`face_match_id`,`face_match_confidence`,`is_face_matched`,`is_existing_user`,`existing_interview_id`,`is_name_matched`,`result_code`,`error`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            }

            private static void e(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.d dVar) {
                int i2 = 2 % 2;
                int i3 = 1;
                supportSQLiteStatement.bindLong(1, dVar.b());
                supportSQLiteStatement.bindLong(2, dVar.d());
                supportSQLiteStatement.bindDouble(3, dVar.a());
                if (dVar.c()) {
                    int i4 = f8278a + 39;
                    f8279d = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    i3 = 0;
                }
                supportSQLiteStatement.bindLong(4, i3);
                supportSQLiteStatement.bindLong(5, dVar.e() ? 1L : 0L);
                if (dVar.i() == null) {
                    int i6 = f8279d + 79;
                    f8278a = i6 % 128;
                    if (i6 % 2 != 0) {
                        supportSQLiteStatement.bindNull(85);
                    } else {
                        supportSQLiteStatement.bindNull(6);
                    }
                } else {
                    supportSQLiteStatement.bindString(6, dVar.i());
                }
                supportSQLiteStatement.bindLong(7, dVar.f() ? 1L : 0L);
                if (dVar.h() == null) {
                    supportSQLiteStatement.bindNull(8);
                    int i7 = f8278a + 85;
                    f8279d = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    supportSQLiteStatement.bindString(8, dVar.h());
                }
                if (dVar.g() == null) {
                    int i9 = f8279d + 103;
                    f8278a = i9 % 128;
                    int i10 = i9 % 2;
                    supportSQLiteStatement.bindNull(9);
                    return;
                }
                supportSQLiteStatement.bindString(9, dVar.g());
                int i11 = f8279d + 17;
                f8278a = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 49 / 0;
                }
            }
        };
        this.f8276c = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.l.4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8288b = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8289e = 0;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8288b + 89;
                int i4 = i3 % 128;
                f8289e = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 99;
                f8288b = i6 % 128;
                int i7 = i6 % 2;
                return "DELETE FROM face_match_result";
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.o
    public final Single<Long> e(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.d dVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.l.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8281a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8282b = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8282b + 13;
                f8281a = i4 % 128;
                int i5 = i4 % 2;
                Long lA = a();
                int i6 = f8282b + 37;
                f8281a = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 21 / 0;
                }
                return lA;
            }

            private Long a() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8281a + 3;
                f8282b = i4 % 128;
                try {
                    if (i4 % 2 != 0) {
                        l.this.f8277e.beginTransaction();
                        Long lValueOf = Long.valueOf(l.this.f8275b.insertAndReturnId(dVar));
                        l.this.f8277e.setTransactionSuccessful();
                        return lValueOf;
                    }
                    l.this.f8277e.beginTransaction();
                    Long.valueOf(l.this.f8275b.insertAndReturnId(dVar));
                    l.this.f8277e.setTransactionSuccessful();
                    l.this.f8277e.endTransaction();
                    throw null;
                } finally {
                    l.this.f8277e.endTransaction();
                }
            }
        });
        int i3 = f8273a + 41;
        f8274d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 24 / 0;
        }
        return singleFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.o
    public final Completable e() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.l.3

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8285c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8286e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8286e + 59;
                f8285c = i4 % 128;
                int i5 = i4 % 2;
                Void voidC = c();
                int i6 = f8285c + 83;
                f8286e = i6 % 128;
                if (i6 % 2 == 0) {
                    return voidC;
                }
                throw null;
            }

            private Void c() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8286e + 45;
                f8285c = i4 % 128;
                int i5 = i4 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = l.this.f8276c.acquire();
                try {
                    l.this.f8277e.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        l.this.f8277e.setTransactionSuccessful();
                        l.this.f8276c.release(supportSQLiteStatementAcquire);
                        int i6 = f8285c + 5;
                        f8286e = i6 % 128;
                        if (i6 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    } finally {
                        l.this.f8277e.endTransaction();
                    }
                } catch (Throwable th) {
                    l.this.f8276c.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8273a + 73;
        f8274d = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    public static List<Class<?>> a() {
        int i2 = 2 % 2;
        int i3 = f8273a + 105;
        f8274d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Collections.emptyList();
            throw null;
        }
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i4 = f8274d + 65;
        f8273a = i4 % 128;
        if (i4 % 2 == 0) {
            return listEmptyList;
        }
        obj.hashCode();
        throw null;
    }
}
