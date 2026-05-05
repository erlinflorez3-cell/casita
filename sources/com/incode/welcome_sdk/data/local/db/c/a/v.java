package com.incode.welcome_sdk.data.local.db.c.a;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.incode.welcome_sdk.i;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8407c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8408e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final RoomDatabase f8409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.e> f8410b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final SharedSQLiteStatement f8411d;

    public v(RoomDatabase roomDatabase) {
        this.f8409a = roomDatabase;
        this.f8410b = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.e>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.v.2

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8415c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8416e = 1;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.e eVar) {
                int i2 = 2 % 2;
                int i3 = f8415c + 101;
                f8416e = i3 % 128;
                int i4 = i3 % 2;
                c(supportSQLiteStatement, eVar);
                int i5 = f8415c + 25;
                f8416e = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8415c + 31;
                f8416e = i3 % 128;
                if (i3 % 2 != 0) {
                    return "INSERT OR REPLACE INTO `id_scan_result` (`_id`,`id_scan_id`,`scan_step`,`classification`,`readability`,`type_of_id`,`issue_name`,`issue_year`,`country_code`,`result_code`,`error`,`fail_reason`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
                }
                throw null;
            }

            private static void c(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.e eVar) {
                int i2 = 2 % 2;
                int i3 = f8416e + 111;
                f8415c = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 1;
                supportSQLiteStatement.bindLong(1, eVar.c());
                int iB = i.b.b();
                supportSQLiteStatement.bindLong(2, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.e.d(i.b.b(), i.b.b(), iB, -554425373, 554425373, i.b.b(), new Object[]{eVar})).longValue());
                if (eVar.b() == null) {
                    int i6 = f8416e + 63;
                    f8415c = i6 % 128;
                    int i7 = i6 % 2;
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, eVar.b());
                }
                if (eVar.e()) {
                    int i8 = f8415c + 59;
                    f8416e = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    i5 = 0;
                }
                supportSQLiteStatement.bindLong(4, i5);
                int iB2 = i.b.b();
                supportSQLiteStatement.bindLong(5, ((Boolean) com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.e.d(i.b.b(), i.b.b(), iB2, 114314993, -114314992, i.b.b(), new Object[]{eVar})).booleanValue() ? 1L : 0L);
                if (eVar.j() == null) {
                    int i10 = f8415c + 33;
                    f8416e = i10 % 128;
                    int i11 = i10 % 2;
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, eVar.j());
                }
                if (eVar.h() == null) {
                    int i12 = f8416e + 121;
                    f8415c = i12 % 128;
                    int i13 = i12 % 2;
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, eVar.h());
                }
                supportSQLiteStatement.bindLong(8, eVar.g());
                if (eVar.i() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, eVar.i());
                }
                if (eVar.f() == null) {
                    int i14 = f8415c + 43;
                    f8416e = i14 % 128;
                    if (i14 % 2 == 0) {
                        supportSQLiteStatement.bindNull(37);
                    } else {
                        supportSQLiteStatement.bindNull(10);
                    }
                } else {
                    supportSQLiteStatement.bindString(10, eVar.f());
                }
                if (eVar.n() == null) {
                    int i15 = f8416e + 31;
                    f8415c = i15 % 128;
                    int i16 = i15 % 2;
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, eVar.n());
                }
                int iB3 = i.b.b();
                if (((String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.e.d(i.b.b(), i.b.b(), iB3, 1960378389, -1960378387, i.b.b(), new Object[]{eVar})) == null) {
                    supportSQLiteStatement.bindNull(12);
                    return;
                }
                int iB4 = i.b.b();
                supportSQLiteStatement.bindString(12, (String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.e.d(i.b.b(), i.b.b(), iB4, 1960378389, -1960378387, i.b.b(), new Object[]{eVar}));
            }
        };
        this.f8411d = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.v.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8412a = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8413c = 0;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8413c + 21;
                int i4 = i3 % 128;
                f8412a = i4;
                if (i3 % 2 == 0) {
                    int i5 = 44 / 0;
                }
                int i6 = i4 + 107;
                f8413c = i6 % 128;
                if (i6 % 2 == 0) {
                    return "DELETE FROM id_scan_result";
                }
                throw null;
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.y
    public final Single<Long> b(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.e eVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.v.3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8418b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8419c = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8418b + 65;
                f8419c = i4 % 128;
                if (i4 % 2 == 0) {
                    return d();
                }
                d();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private Long d() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8418b + 77;
                f8419c = i4 % 128;
                int i5 = i4 % 2;
                v.this.f8409a.beginTransaction();
                try {
                    Long lValueOf = Long.valueOf(v.this.f8410b.insertAndReturnId(eVar));
                    v.this.f8409a.setTransactionSuccessful();
                    v.this.f8409a.endTransaction();
                    int i6 = f8418b + 121;
                    f8419c = i6 % 128;
                    int i7 = i6 % 2;
                    return lValueOf;
                } catch (Throwable th) {
                    v.this.f8409a.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8408e + 41;
        f8407c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 44 / 0;
        }
        return singleFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.y
    public final Completable d() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.v.4

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8422c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8423e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8423e + 3;
                f8422c = i4 % 128;
                if (i4 % 2 == 0) {
                    e();
                    throw null;
                }
                Void voidE = e();
                int i5 = f8422c + 91;
                f8423e = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 23 / 0;
                }
                return voidE;
            }

            private Void e() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8422c + 101;
                f8423e = i4 % 128;
                int i5 = i4 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = v.this.f8411d.acquire();
                try {
                    v.this.f8409a.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        v.this.f8409a.setTransactionSuccessful();
                        v.this.f8411d.release(supportSQLiteStatementAcquire);
                        int i6 = f8423e + 35;
                        f8422c = i6 % 128;
                        if (i6 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    } finally {
                        v.this.f8409a.endTransaction();
                    }
                } catch (Throwable th) {
                    v.this.f8411d.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8408e + 15;
        f8407c = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    public static List<Class<?>> a() {
        int i2 = 2 % 2;
        int i3 = f8408e + 27;
        f8407c = i3 % 128;
        int i4 = i3 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i5 = f8407c + 123;
        f8408e = i5 % 128;
        if (i5 % 2 == 0) {
            return listEmptyList;
        }
        throw null;
    }
}
