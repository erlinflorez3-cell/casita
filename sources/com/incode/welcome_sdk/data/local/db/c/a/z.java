package com.incode.welcome_sdk.data.local.db.c.a;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class z implements ad {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8436d = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f8437g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.incode.welcome_sdk.data.local.model.delayed_onboarding.h f8438a = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final RoomDatabase f8439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.d> f8440c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SharedSQLiteStatement f8441e;

    public z(RoomDatabase roomDatabase) {
        this.f8439b = roomDatabase;
        this.f8440c = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.d>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.z.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8442b = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8443e = 1;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.d dVar) throws JSONException {
                int i2 = 2 % 2;
                int i3 = f8442b + 113;
                f8443e = i3 % 128;
                int i4 = i3 % 2;
                b(supportSQLiteStatement, dVar);
                int i5 = f8443e + 33;
                f8442b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 61 / 0;
                }
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8443e;
                int i4 = i3 + 15;
                f8442b = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 5;
                f8442b = i6 % 128;
                int i7 = i6 % 2;
                return "INSERT OR REPLACE INTO `process_id_result` (`_id`,`process_id`,`ocr_data`,`extended_ocr_data`,`result_code`,`error`) VALUES (nullif(?, 0),?,?,?,?,?)";
            }

            private void b(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.d dVar) throws JSONException {
                int i2 = 2 % 2;
                supportSQLiteStatement.bindLong(1, dVar.e());
                supportSQLiteStatement.bindLong(2, dVar.c());
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.h hVar = z.this.f8438a;
                String strE = com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e(dVar.a());
                if (strE == null) {
                    int i3 = f8442b + 65;
                    f8443e = i3 % 128;
                    int i4 = i3 % 2;
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, strE);
                    int i5 = f8443e + 57;
                    f8442b = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 3 / 4;
                    }
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.h hVar2 = z.this.f8438a;
                String strE2 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e(dVar.b());
                if (strE2 == null) {
                    int i7 = f8443e + 109;
                    f8442b = i7 % 128;
                    int i8 = i7 % 2;
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, strE2);
                }
                if (dVar.d() == null) {
                    int i9 = f8442b + 115;
                    f8443e = i9 % 128;
                    if (i9 % 2 == 0) {
                        supportSQLiteStatement.bindNull(3);
                    } else {
                        supportSQLiteStatement.bindNull(5);
                    }
                } else {
                    supportSQLiteStatement.bindString(5, dVar.d());
                }
                if (dVar.j() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, dVar.j());
                }
            }
        };
        this.f8441e = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.z.3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8445b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8446c = 0;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8445b;
                int i4 = i3 + 107;
                f8446c = i4 % 128;
                if (i4 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 51;
                f8446c = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 52 / 0;
                }
                return "DELETE FROM process_id_result";
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.ad
    public final Single<Long> a(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.d dVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.z.4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8448a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8449b = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8448a + 105;
                f8449b = i4 % 128;
                if (i4 % 2 == 0) {
                    a();
                    throw null;
                }
                Long lA = a();
                int i5 = f8449b + 27;
                f8448a = i5 % 128;
                if (i5 % 2 == 0) {
                    return lA;
                }
                throw null;
            }

            private Long a() throws Exception {
                Long lValueOf;
                int i3 = 2 % 2;
                int i4 = f8448a + 31;
                f8449b = i4 % 128;
                try {
                    if (i4 % 2 == 0) {
                        z.this.f8439b.beginTransaction();
                        lValueOf = Long.valueOf(z.this.f8440c.insertAndReturnId(dVar));
                        z.this.f8439b.setTransactionSuccessful();
                        z.this.f8439b.endTransaction();
                        int i5 = 33 / 0;
                    } else {
                        z.this.f8439b.beginTransaction();
                        lValueOf = Long.valueOf(z.this.f8440c.insertAndReturnId(dVar));
                        z.this.f8439b.setTransactionSuccessful();
                    }
                    return lValueOf;
                } finally {
                    z.this.f8439b.endTransaction();
                }
            }
        });
        int i3 = f8436d + 111;
        f8437g = i3 % 128;
        int i4 = i3 % 2;
        return singleFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.z$5, reason: invalid class name */
    public class AnonymousClass5 implements Callable<Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f8452b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f8453c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f8454d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f8455e = 0;

        AnonymousClass5() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8453c + 73;
            f8452b = i3 % 128;
            if (i3 % 2 != 0) {
                return c();
            }
            c();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Void c() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8452b + 41;
            f8453c = i3 % 128;
            int i4 = i3 % 2;
            SupportSQLiteStatement supportSQLiteStatementAcquire = z.this.f8441e.acquire();
            try {
                z.this.f8439b.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    z.this.f8439b.setTransactionSuccessful();
                    z.this.f8441e.release(supportSQLiteStatementAcquire);
                    int i5 = f8452b + 125;
                    f8453c = i5 % 128;
                    if (i5 % 2 == 0) {
                        return null;
                    }
                    throw null;
                } finally {
                    z.this.f8439b.endTransaction();
                }
            } catch (Throwable th) {
                z.this.f8441e.release(supportSQLiteStatementAcquire);
                throw th;
            }
        }

        public static int d() {
            int i2 = f8454d;
            int i3 = i2 % 7304112;
            f8454d = i2 + 1;
            if (i3 != 0) {
                return f8455e;
            }
            int iNextInt = new Random().nextInt();
            f8455e = iNextInt;
            return iNextInt;
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.ad
    public final Completable d() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new AnonymousClass5());
        int i3 = f8436d + 123;
        f8437g = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    public static List<Class<?>> e() {
        int i2 = 2 % 2;
        int i3 = f8437g + 63;
        f8436d = i3 % 128;
        int i4 = i3 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        if (i4 != 0) {
            int i5 = 58 / 0;
        }
        return listEmptyList;
    }
}
