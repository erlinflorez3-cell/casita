package com.incode.welcome_sdk.data.local.db.c.a;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class aa implements ac {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f8049f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f8050h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> f8051a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> f8054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final RoomDatabase f8055e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final SharedSQLiteStatement f8056i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.incode.welcome_sdk.data.local.model.delayed_onboarding.g f8053c = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.incode.welcome_sdk.data.local.model.delayed_onboarding.b f8052b = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.b();

    public aa(RoomDatabase roomDatabase) {
        this.f8055e = roomDatabase;
        this.f8054d = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.aa.5

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8073d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8074e = 1;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) throws JSONException {
                int i2 = 2 % 2;
                int i3 = f8074e + 109;
                f8073d = i3 % 128;
                int i4 = i3 % 2;
                e(supportSQLiteStatement, aVar);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8074e;
                int i4 = i3 + 7;
                f8073d = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 73;
                f8073d = i6 % 128;
                if (i6 % 2 == 0) {
                    return "INSERT OR REPLACE INTO `selfie_scan` (`id`,`image_path`,`face_coordinates`,`capture_type`,`is_completed`,`is_synced`) VALUES (nullif(?, 0),?,?,?,?,?)";
                }
                throw null;
            }

            private void e(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) throws JSONException {
                int i2;
                int i3 = 2 % 2;
                int i4 = 1;
                supportSQLiteStatement.bindLong(1, aVar.d());
                if (((String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a.d(new Object[]{aVar}, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), -1555909154, ValidatingTaxIdPresenter.a.c(), 1555909155)) == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, (String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a.d(new Object[]{aVar}, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), -1555909154, ValidatingTaxIdPresenter.a.c(), 1555909155));
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.g gVar = aa.this.f8053c;
                String strB = com.incode.welcome_sdk.data.local.model.delayed_onboarding.g.b(aVar.c());
                if (strB == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, strB);
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.b bVar = aa.this.f8052b;
                supportSQLiteStatement.bindLong(4, com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.a(aVar.b()));
                if (aVar.a()) {
                    int i5 = f8074e + 19;
                    f8073d = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                supportSQLiteStatement.bindLong(5, i2);
                if (((Boolean) com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a.d(new Object[]{aVar}, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), -988071999, ValidatingTaxIdPresenter.a.c(), 988071999)).booleanValue()) {
                    int i7 = f8074e + 87;
                    f8073d = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 5 / 2;
                    }
                } else {
                    i4 = 0;
                }
                supportSQLiteStatement.bindLong(6, i4);
                int i9 = f8073d + 31;
                f8074e = i9 % 128;
                int i10 = i9 % 2;
            }
        };
        this.f8051a = new EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.aa.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8060a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8061d = 0;

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) throws JSONException {
                int i2 = 2 % 2;
                int i3 = f8060a + 65;
                f8061d = i3 % 128;
                int i4 = i3 % 2;
                b(supportSQLiteStatement, aVar);
                int i5 = f8061d + 65;
                f8060a = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8060a + 109;
                f8061d = i3 % 128;
                if (i3 % 2 == 0) {
                    return "UPDATE OR ABORT `selfie_scan` SET `id` = ?,`image_path` = ?,`face_coordinates` = ?,`capture_type` = ?,`is_completed` = ?,`is_synced` = ? WHERE `id` = ?";
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00ee  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void b(androidx.sqlite.db.SupportSQLiteStatement r14, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a r15) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 275
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.aa.AnonymousClass2.b(androidx.sqlite.db.SupportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a):void");
            }
        };
        this.f8056i = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.aa.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8057c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8058d = 1;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8058d + 39;
                f8057c = i3 % 128;
                if (i3 % 2 == 0) {
                    return "DELETE FROM selfie_scan";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.aa$3, reason: invalid class name */
    public class AnonymousClass3 implements Callable<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f8063a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f8064b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f8065c = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f8066g = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a f8067d;

        AnonymousClass3(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
            this.f8067d = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Long call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8064b + 51;
            f8066g = i3 % 128;
            int i4 = i3 % 2;
            Long lE = e();
            if (i4 == 0) {
                int i5 = 17 / 0;
            }
            return lE;
        }

        private Long e() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8064b + 67;
            f8066g = i3 % 128;
            int i4 = i3 % 2;
            aa.this.f8055e.beginTransaction();
            try {
                Long lValueOf = Long.valueOf(aa.this.f8054d.insertAndReturnId(this.f8067d));
                aa.this.f8055e.setTransactionSuccessful();
                aa.this.f8055e.endTransaction();
                int i5 = f8064b + 53;
                f8066g = i5 % 128;
                int i6 = i5 % 2;
                return lValueOf;
            } catch (Throwable th) {
                aa.this.f8055e.endTransaction();
                throw th;
            }
        }

        public static int a() {
            int i2 = f8063a;
            int i3 = i2 % 9309164;
            f8063a = i2 + 1;
            if (i3 != 0) {
                return f8065c;
            }
            int iNextInt = new Random().nextInt();
            f8065c = iNextInt;
            return iNextInt;
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.ac
    public final Single<Long> e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new AnonymousClass3(aVar));
        int i3 = f8049f + 75;
        f8050h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
        return singleFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.ac
    public final Completable a(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.aa.4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8069b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8070c = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                Void voidC;
                int i3 = 2 % 2;
                int i4 = f8069b + 75;
                f8070c = i4 % 128;
                if (i4 % 2 != 0) {
                    voidC = c();
                    int i5 = 91 / 0;
                } else {
                    voidC = c();
                }
                int i6 = f8070c + 9;
                f8069b = i6 % 128;
                int i7 = i6 % 2;
                return voidC;
            }

            private Void c() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8069b + 113;
                f8070c = i4 % 128;
                int i5 = i4 % 2;
                aa.this.f8055e.beginTransaction();
                try {
                    aa.this.f8051a.handle(aVar);
                    aa.this.f8055e.setTransactionSuccessful();
                    aa.this.f8055e.endTransaction();
                    int i6 = f8069b + 3;
                    f8070c = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 70 / 0;
                    }
                    return null;
                } catch (Throwable th) {
                    aa.this.f8055e.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8050h + 69;
        f8049f = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.ac
    public final Completable d() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.aa.6

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8076a = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8077e = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8076a + 123;
                f8077e = i4 % 128;
                int i5 = i4 % 2;
                Void voidE = e();
                if (i5 == 0) {
                    int i6 = 15 / 0;
                }
                return voidE;
            }

            private Void e() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8077e + 97;
                f8076a = i4 % 128;
                int i5 = i4 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = aa.this.f8056i.acquire();
                try {
                    aa.this.f8055e.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        aa.this.f8055e.setTransactionSuccessful();
                        aa.this.f8056i.release(supportSQLiteStatementAcquire);
                        int i6 = f8077e + 75;
                        f8076a = i6 % 128;
                        int i7 = i6 % 2;
                        return null;
                    } finally {
                        aa.this.f8055e.endTransaction();
                    }
                } catch (Throwable th) {
                    aa.this.f8056i.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8050h + 29;
        f8049f = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.ac
    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> e(long j2) {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM selfie_scan WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> maybeFromCallable = Maybe.fromCallable(new Callable<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.aa.7

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8079a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8080d = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8080d + 85;
                f8079a = i4 % 128;
                int i5 = i4 % 2;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVarD = d();
                int i6 = f8079a + 63;
                f8080d = i6 % 128;
                int i7 = i6 % 2;
                return aVarD;
            }

            private com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a d() throws Exception {
                String string;
                int i3 = 2 % 2;
                int i4 = f8079a + 59;
                f8080d = i4 % 128;
                int i5 = i4 % 2;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar = null;
                String string2 = null;
                Cursor cursorQuery = DBUtil.query(aa.this.f8055e, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "image_path");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_coordinates");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "capture_type");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_completed");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_synced");
                    if (cursorQuery.moveToFirst()) {
                        long j3 = cursorQuery.getLong(columnIndexOrThrow);
                        if (cursorQuery.isNull(columnIndexOrThrow2)) {
                            int i6 = f8080d + 91;
                            f8079a = i6 % 128;
                            int i7 = i6 % 2;
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow2);
                            int i8 = f8079a + 57;
                            f8080d = i8 % 128;
                            int i9 = i8 % 2;
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow3)) {
                            int i10 = f8079a + 19;
                            f8080d = i10 % 128;
                            int i11 = i10 % 2;
                        } else {
                            string2 = cursorQuery.getString(columnIndexOrThrow3);
                        }
                        com.incode.welcome_sdk.data.local.model.delayed_onboarding.g gVar = aa.this.f8053c;
                        Map<String, Float> mapB = com.incode.welcome_sdk.data.local.model.delayed_onboarding.g.b(string2);
                        int i12 = cursorQuery.getInt(columnIndexOrThrow4);
                        com.incode.welcome_sdk.data.local.model.delayed_onboarding.b bVar = aa.this.f8052b;
                        com.incode.welcome_sdk.data.remote.beans.f fVarC = com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c(i12);
                        boolean z2 = true;
                        boolean z3 = cursorQuery.getInt(columnIndexOrThrow5) != 0;
                        if (cursorQuery.getInt(columnIndexOrThrow6) == 0) {
                            z2 = false;
                        }
                        aVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a(j3, string, mapB, fVarC, z3, z2);
                    }
                    return aVar;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8079a + 13;
                f8080d = i4 % 128;
                if (i4 % 2 == 0) {
                    roomSQLiteQueryAcquire.release();
                    int i5 = f8080d + 99;
                    f8079a = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                roomSQLiteQueryAcquire.release();
                throw null;
            }
        });
        int i3 = f8050h + 57;
        f8049f = i3 % 128;
        int i4 = i3 % 2;
        return maybeFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.ac
    public final Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a>> e() {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM selfie_scan WHERE is_synced = 1 AND image_path IS NOT NULL", 0);
        Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a>> singleCreateSingle = RxRoom.createSingle(new Callable<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a>>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.aa.9

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8083c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8084e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8083c + 87;
                f8084e = i4 % 128;
                int i5 = i4 % 2;
                List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> listA = a();
                int i6 = f8084e + 7;
                f8083c = i6 % 128;
                int i7 = i6 % 2;
                return listA;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private java.util.List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> a() throws java.lang.Exception {
                /*
                    Method dump skipped, instruction units count: 215
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.aa.AnonymousClass9.a():java.util.List");
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8084e + 105;
                f8083c = i4 % 128;
                if (i4 % 2 != 0) {
                    roomSQLiteQueryAcquire.release();
                } else {
                    roomSQLiteQueryAcquire.release();
                    throw null;
                }
            }
        });
        int i3 = f8050h + 21;
        f8049f = i3 % 128;
        if (i3 % 2 != 0) {
            return singleCreateSingle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static List<Class<?>> b() {
        int i2 = 2 % 2;
        int i3 = f8049f + 45;
        f8050h = i3 % 128;
        int i4 = i3 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i5 = f8050h + 117;
        f8049f = i5 % 128;
        if (i5 % 2 != 0) {
            return listEmptyList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
