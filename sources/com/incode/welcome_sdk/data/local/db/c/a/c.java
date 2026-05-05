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
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8168b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8169d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedSQLiteStatement f8170a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.d> f8171c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final RoomDatabase f8172e;

    public c(RoomDatabase roomDatabase) {
        this.f8172e = roomDatabase;
        this.f8171c = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.d>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.c.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8173b = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8174d = 0;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.d dVar) {
                int i2 = 2 % 2;
                int i3 = f8174d + 97;
                f8173b = i3 % 128;
                int i4 = i3 % 2;
                a(supportSQLiteStatement, dVar);
                int i5 = f8173b + 49;
                f8174d = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8173b + 3;
                f8174d = i3 % 128;
                if (i3 % 2 == 0) {
                    return "INSERT OR REPLACE INTO `combined_consent_result` (`id`,`result_code`,`error`) VALUES (nullif(?, 0),?,?)";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void a(androidx.sqlite.db.SupportSQLiteStatement r4, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.d r5) {
                /*
                    r3 = 2
                    int r0 = r3 % r3
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.c.AnonymousClass1.f8174d
                    int r1 = r0 + 123
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.c.AnonymousClass1.f8173b = r0
                    int r1 = r1 % r3
                    if (r1 != 0) goto L35
                    r2 = 0
                    long r0 = r5.c()
                    r4.bindLong(r2, r0)
                    java.lang.String r0 = r5.a()
                    if (r0 != 0) goto L44
                L1c:
                    r4.bindNull(r3)
                L1f:
                    java.lang.String r0 = r5.d()
                    r2 = 3
                    if (r0 != 0) goto L50
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.c.AnonymousClass1.f8174d
                    int r1 = r0 + 109
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.c.AnonymousClass1.f8173b = r0
                    int r1 = r1 % r3
                    if (r1 != 0) goto L4c
                    r4.bindNull(r2)
                    return
                L35:
                    r2 = 1
                    long r0 = r5.c()
                    r4.bindLong(r2, r0)
                    java.lang.String r0 = r5.a()
                    if (r0 != 0) goto L44
                    goto L1c
                L44:
                    java.lang.String r0 = r5.a()
                    r4.bindString(r3, r0)
                    goto L1f
                L4c:
                    r4.bindNull(r2)
                    return
                L50:
                    java.lang.String r0 = r5.d()
                    r4.bindString(r2, r0)
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.c.AnonymousClass1.f8174d
                    int r1 = r0 + 101
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.c.AnonymousClass1.f8173b = r0
                    int r1 = r1 % r3
                    if (r1 == 0) goto L63
                    return
                L63:
                    r0 = 0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.c.AnonymousClass1.a(androidx.sqlite.db.SupportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.d):void");
            }
        };
        this.f8170a = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.c.4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8180a = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8181d = 1;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8180a + 31;
                int i4 = i3 % 128;
                f8181d = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 101;
                f8180a = i6 % 128;
                int i7 = i6 % 2;
                return "DELETE FROM combined_consent_result";
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.b
    public final Single<Long> b(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.d dVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.c.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8176a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8177b = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8177b + 51;
                f8176a = i4 % 128;
                int i5 = i4 % 2;
                Long lB = b();
                int i6 = f8176a + 47;
                f8177b = i6 % 128;
                int i7 = i6 % 2;
                return lB;
            }

            private Long b() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8176a + 99;
                f8177b = i4 % 128;
                int i5 = i4 % 2;
                c.this.f8172e.beginTransaction();
                try {
                    Long lValueOf = Long.valueOf(c.this.f8171c.insertAndReturnId(dVar));
                    c.this.f8172e.setTransactionSuccessful();
                    c.this.f8172e.endTransaction();
                    int i6 = f8177b + 35;
                    f8176a = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 73 / 0;
                    }
                    return lValueOf;
                } catch (Throwable th) {
                    c.this.f8172e.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8169d + 115;
        f8168b = i3 % 128;
        int i4 = i3 % 2;
        return singleFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.b
    public final Completable b() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.c.5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8183b = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8184d = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8183b + 13;
                f8184d = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    a();
                    obj.hashCode();
                    throw null;
                }
                Void voidA = a();
                int i5 = f8184d + 31;
                f8183b = i5 % 128;
                if (i5 % 2 != 0) {
                    return voidA;
                }
                throw null;
            }

            private Void a() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8183b + 93;
                f8184d = i4 % 128;
                int i5 = i4 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = c.this.f8170a.acquire();
                try {
                    c.this.f8172e.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        c.this.f8172e.setTransactionSuccessful();
                        c.this.f8170a.release(supportSQLiteStatementAcquire);
                        int i6 = f8183b + 11;
                        f8184d = i6 % 128;
                        int i7 = i6 % 2;
                        return null;
                    } finally {
                        c.this.f8172e.endTransaction();
                    }
                } catch (Throwable th) {
                    c.this.f8170a.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8169d + 115;
        f8168b = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    public static List<Class<?>> a() {
        int i2 = 2 % 2;
        int i3 = f8168b + 63;
        f8169d = i3 % 128;
        int i4 = i3 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i5 = f8168b + 71;
        f8169d = i5 % 128;
        int i6 = i5 % 2;
        return listEmptyList;
    }
}
