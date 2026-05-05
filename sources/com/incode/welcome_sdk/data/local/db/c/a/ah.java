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
public final class ah implements af {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8150b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8151e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedSQLiteStatement f8152a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final RoomDatabase f8153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d> f8154d;

    public ah(RoomDatabase roomDatabase) {
        this.f8153c = roomDatabase;
        this.f8154d = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.ah.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8155a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8156c = 1;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d dVar) {
                int i2 = 2 % 2;
                int i3 = f8156c + 29;
                f8155a = i3 % 128;
                int i4 = i3 % 2;
                b(supportSQLiteStatement, dVar);
                int i5 = f8155a + 89;
                f8156c = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8156c + 9;
                int i4 = i3 % 128;
                f8155a = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 71;
                f8156c = i6 % 128;
                int i7 = i6 % 2;
                return "INSERT OR REPLACE INTO `selfie_scan_result` (`_id`,`selfie_scan_id`,`is_spoof_attempt`,`result_code`,`error`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void b(androidx.sqlite.db.SupportSQLiteStatement r6, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d r7) {
                /*
                    r3 = 2
                    int r0 = r3 % r3
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.ah.AnonymousClass1.f8156c
                    int r1 = r0 + 55
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.ah.AnonymousClass1.f8155a = r0
                    int r1 = r1 % r3
                    r4 = 4
                    r5 = 1
                    if (r1 == 0) goto L57
                    long r0 = r7.c()
                    r6.bindLong(r5, r0)
                    long r0 = r7.d()
                    r6.bindLong(r4, r0)
                    boolean r0 = r7.e()
                    if (r0 == 0) goto L6b
                L24:
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.ah.AnonymousClass1.f8155a
                    int r1 = r0 + 19
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.ah.AnonymousClass1.f8156c = r0
                    int r1 = r1 % r3
                L2d:
                    r2 = 3
                    long r0 = (long) r5
                    r6.bindLong(r2, r0)
                    java.lang.String r0 = r7.b()
                    if (r0 != 0) goto L4f
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.ah.AnonymousClass1.f8156c
                    int r1 = r0 + 33
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.ah.AnonymousClass1.f8155a = r0
                    int r1 = r1 % r3
                    r6.bindNull(r4)
                L44:
                    java.lang.String r0 = r7.a()
                    r1 = 5
                    if (r0 != 0) goto L6d
                    r6.bindNull(r1)
                    return
                L4f:
                    java.lang.String r0 = r7.b()
                    r6.bindString(r4, r0)
                    goto L44
                L57:
                    long r0 = r7.c()
                    r6.bindLong(r5, r0)
                    long r0 = r7.d()
                    r6.bindLong(r3, r0)
                    boolean r0 = r7.e()
                    if (r0 == r5) goto L24
                L6b:
                    r5 = 0
                    goto L2d
                L6d:
                    java.lang.String r0 = r7.a()
                    r6.bindString(r1, r0)
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.ah.AnonymousClass1.f8156c
                    int r1 = r0 + 99
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.ah.AnonymousClass1.f8155a = r0
                    int r1 = r1 % r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.ah.AnonymousClass1.b(androidx.sqlite.db.SupportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d):void");
            }
        };
        this.f8152a = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.ah.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8158a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8159d = 0;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8159d + 61;
                f8158a = i3 % 128;
                if (i3 % 2 != 0) {
                    return "DELETE FROM selfie_scan_result";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.af
    public final Single<Long> d(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d dVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.ah.3

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8161c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8162e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8161c + 35;
                f8162e = i4 % 128;
                if (i4 % 2 == 0) {
                    return b();
                }
                b();
                throw null;
            }

            private Long b() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8162e + 63;
                f8161c = i4 % 128;
                int i5 = i4 % 2;
                ah.this.f8153c.beginTransaction();
                try {
                    Long lValueOf = Long.valueOf(ah.this.f8154d.insertAndReturnId(dVar));
                    ah.this.f8153c.setTransactionSuccessful();
                    ah.this.f8153c.endTransaction();
                    int i6 = f8162e + 27;
                    f8161c = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 96 / 0;
                    }
                    return lValueOf;
                } catch (Throwable th) {
                    ah.this.f8153c.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8150b + 47;
        f8151e = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 99 / 0;
        }
        return singleFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.af
    public final Completable d() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.ah.4

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8165c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8166d = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8165c + 47;
                f8166d = i4 % 128;
                if (i4 % 2 != 0) {
                    return b();
                }
                b();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private Void b() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8166d + 41;
                f8165c = i4 % 128;
                int i5 = i4 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = ah.this.f8152a.acquire();
                try {
                    ah.this.f8153c.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        ah.this.f8153c.setTransactionSuccessful();
                        ah.this.f8152a.release(supportSQLiteStatementAcquire);
                        int i6 = f8166d + 45;
                        f8165c = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 1 / 0;
                        }
                        return null;
                    } finally {
                        ah.this.f8153c.endTransaction();
                    }
                } catch (Throwable th) {
                    ah.this.f8152a.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8151e + 41;
        f8150b = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    public static List<Class<?>> e() {
        int i2 = 2 % 2;
        int i3 = f8151e + 39;
        f8150b = i3 % 128;
        int i4 = i3 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i5 = f8151e + 79;
        f8150b = i5 % 128;
        int i6 = i5 % 2;
        return listEmptyList;
    }
}
