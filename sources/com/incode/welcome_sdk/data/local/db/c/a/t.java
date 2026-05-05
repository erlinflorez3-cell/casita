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
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.remote.beans.bf;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f8372g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f8373i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedSQLiteStatement f8374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> f8375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.incode.welcome_sdk.data.local.model.delayed_onboarding.b f8376c = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RoomDatabase f8377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> f8378e;

    public t(RoomDatabase roomDatabase) {
        this.f8377d = roomDatabase;
        this.f8378e = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.t.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8379a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8380d = 0;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
                int i2 = 2 % 2;
                int i3 = f8380d + 75;
                f8379a = i3 % 128;
                int i4 = i3 % 2;
                d(supportSQLiteStatement, cVar);
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
                int i3 = f8380d;
                int i4 = i3 + 43;
                f8379a = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 53;
                f8379a = i6 % 128;
                int i7 = i6 % 2;
                return "INSERT OR REPLACE INTO `id_scan` (`id`,`front_id_image_path`,`back_id_image_path`,`id_type`,`is_second_id`,`scan_step`,`capture_type`,`is_completed`,`is_synced`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            }

            private void d(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
                int i2;
                int i3;
                int i4 = 2 % 2;
                int i5 = 1;
                supportSQLiteStatement.bindLong(1, cVar.a());
                if (cVar.c() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, cVar.c());
                }
                if (cVar.d() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, cVar.d());
                }
                if (((String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c.d(bf.a.e(), bf.a.e(), new Object[]{cVar}, -1961997734, 1961997734, bf.a.e(), bf.a.e())) == null) {
                    supportSQLiteStatement.bindNull(4);
                    int i6 = f8380d + 45;
                    f8379a = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 2 % 4;
                    }
                } else {
                    supportSQLiteStatement.bindString(4, (String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c.d(bf.a.e(), bf.a.e(), new Object[]{cVar}, -1961997734, 1961997734, bf.a.e(), bf.a.e()));
                }
                if (cVar.e()) {
                    int i8 = f8379a + 25;
                    f8380d = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                supportSQLiteStatement.bindLong(5, i2);
                if (((String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c.d(bf.a.e(), bf.a.e(), new Object[]{cVar}, 419065736, -419065735, bf.a.e(), bf.a.e())) == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, (String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c.d(bf.a.e(), bf.a.e(), new Object[]{cVar}, 419065736, -419065735, bf.a.e(), bf.a.e()));
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.b bVar = t.this.f8376c;
                supportSQLiteStatement.bindLong(7, com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.a(cVar.f()));
                if (cVar.j()) {
                    int i10 = f8380d + 5;
                    f8379a = i10 % 128;
                    int i11 = i10 % 2;
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                supportSQLiteStatement.bindLong(8, i3);
                if (cVar.g()) {
                    int i12 = f8379a + 5;
                    f8380d = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    i5 = 0;
                }
                supportSQLiteStatement.bindLong(9, i5);
            }
        };
        this.f8375b = new EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.t.3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8386b = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8387e = 0;

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
                int i2 = 2 % 2;
                int i3 = f8386b + 69;
                f8387e = i3 % 128;
                int i4 = i3 % 2;
                e(supportSQLiteStatement, cVar);
                int i5 = f8386b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f8387e = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8386b + 123;
                int i4 = i3 % 128;
                f8387e = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 125;
                f8386b = i6 % 128;
                int i7 = i6 % 2;
                return "UPDATE OR ABORT `id_scan` SET `id` = ?,`front_id_image_path` = ?,`back_id_image_path` = ?,`id_type` = ?,`is_second_id` = ?,`scan_step` = ?,`capture_type` = ?,`is_completed` = ?,`is_synced` = ? WHERE `id` = ?";
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x012f  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void e(androidx.sqlite.db.SupportSQLiteStatement r17, com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c r18) {
                /*
                    Method dump skipped, instruction units count: 312
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.t.AnonymousClass3.e(androidx.sqlite.db.SupportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c):void");
            }
        };
        this.f8374a = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.t.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8393a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8394c = 1;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8393a + 63;
                int i4 = i3 % 128;
                f8394c = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 31;
                f8393a = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 69 / 0;
                }
                return "DELETE FROM id_scan";
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.q
    public final Single<Long> c(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.t.4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8389a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8390d = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8389a + 121;
                f8390d = i4 % 128;
                if (i4 % 2 != 0) {
                    a();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Long lA = a();
                int i5 = f8389a + 27;
                f8390d = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 13 / 0;
                }
                return lA;
            }

            private Long a() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8390d + 77;
                f8389a = i4 % 128;
                try {
                    if (i4 % 2 != 0) {
                        t.this.f8377d.beginTransaction();
                        Long lValueOf = Long.valueOf(t.this.f8378e.insertAndReturnId(cVar));
                        t.this.f8377d.setTransactionSuccessful();
                        return lValueOf;
                    }
                    t.this.f8377d.beginTransaction();
                    Long.valueOf(t.this.f8378e.insertAndReturnId(cVar));
                    t.this.f8377d.setTransactionSuccessful();
                    t.this.f8377d.endTransaction();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } finally {
                    t.this.f8377d.endTransaction();
                }
            }
        });
        int i3 = f8373i + 97;
        f8372g = i3 % 128;
        if (i3 % 2 == 0) {
            return singleFromCallable;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.q
    public final Completable e(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.t.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8382a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8383d = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8382a + 77;
                f8383d = i4 % 128;
                if (i4 % 2 == 0) {
                    return e();
                }
                e();
                throw null;
            }

            private Void e() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8383d + 123;
                f8382a = i4 % 128;
                int i5 = i4 % 2;
                t.this.f8377d.beginTransaction();
                try {
                    t.this.f8375b.handle(cVar);
                    t.this.f8377d.setTransactionSuccessful();
                    t.this.f8377d.endTransaction();
                    int i6 = f8382a + 81;
                    f8383d = i6 % 128;
                    int i7 = i6 % 2;
                    return null;
                } catch (Throwable th) {
                    t.this.f8377d.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8372g + 77;
        f8373i = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.q
    public final Completable d() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.t.8

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8400d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8401e = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8401e + 89;
                f8400d = i4 % 128;
                int i5 = i4 % 2;
                Void voidE = e();
                if (i5 != 0) {
                    int i6 = 70 / 0;
                }
                return voidE;
            }

            private Void e() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8401e + 45;
                f8400d = i4 % 128;
                int i5 = i4 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = t.this.f8374a.acquire();
                try {
                    t.this.f8377d.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        t.this.f8377d.setTransactionSuccessful();
                        t.this.f8374a.release(supportSQLiteStatementAcquire);
                        int i6 = f8400d + 15;
                        f8401e = i6 % 128;
                        int i7 = i6 % 2;
                        return null;
                    } finally {
                        t.this.f8377d.endTransaction();
                    }
                } catch (Throwable th) {
                    t.this.f8374a.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8373i + 45;
        f8372g = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.q
    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> b(long j2) {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM id_scan WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> maybeFromCallable = Maybe.fromCallable(new Callable<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.t.9

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8403a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8404c = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8403a + 69;
                f8404c = i4 % 128;
                int i5 = i4 % 2;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVarB = b();
                int i6 = f8404c + 11;
                f8403a = i6 % 128;
                int i7 = i6 % 2;
                return cVarB;
            }

            private com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c b() throws Exception {
                String string;
                String string2;
                boolean z2;
                int i3 = 2 % 2;
                int i4 = f8403a + 77;
                f8404c = i4 % 128;
                int i5 = i4 % 2;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar = null;
                String string3 = null;
                Cursor cursorQuery = DBUtil.query(t.this.f8377d, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "front_id_image_path");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "back_id_image_path");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id_type");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_second_id");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "scan_step");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "capture_type");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_completed");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_synced");
                    if (cursorQuery.moveToFirst()) {
                        int i6 = f8403a + 11;
                        f8404c = i6 % 128;
                        int i7 = i6 % 2;
                        long j3 = cursorQuery.getLong(columnIndexOrThrow);
                        boolean z3 = true;
                        if (!cursorQuery.isNull(columnIndexOrThrow2)) {
                            string = cursorQuery.getString(columnIndexOrThrow2);
                            int i8 = f8403a + 85;
                            f8404c = i8 % 128;
                            if (i8 % 2 == 0) {
                                int i9 = 5 / 5;
                            }
                        } else {
                            string = null;
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow3)) {
                            int i10 = f8404c + 15;
                            f8403a = i10 % 128;
                            int i11 = i10 % 2;
                            string2 = null;
                        } else {
                            string2 = cursorQuery.getString(columnIndexOrThrow3);
                        }
                        String string4 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        boolean z4 = cursorQuery.getInt(columnIndexOrThrow5) != 0;
                        if (cursorQuery.isNull(columnIndexOrThrow6)) {
                            int i12 = f8404c + 87;
                            f8403a = i12 % 128;
                            if (i12 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            string3 = cursorQuery.getString(columnIndexOrThrow6);
                        }
                        String str = string3;
                        int i13 = cursorQuery.getInt(columnIndexOrThrow7);
                        com.incode.welcome_sdk.data.local.model.delayed_onboarding.b bVar = t.this.f8376c;
                        com.incode.welcome_sdk.data.remote.beans.f fVarC = com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c(i13);
                        if (cursorQuery.getInt(columnIndexOrThrow8) != 0) {
                            int i14 = f8404c + 3;
                            f8403a = i14 % 128;
                            int i15 = i14 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (cursorQuery.getInt(columnIndexOrThrow9) == 0) {
                            z3 = false;
                        }
                        cVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c(j3, string, string2, string4, z4, str, fVarC, z2, z3);
                    }
                    return cVar;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8404c + 91;
                f8403a = i4 % 128;
                int i5 = i4 % 2;
                roomSQLiteQueryAcquire.release();
                int i6 = f8404c + 121;
                f8403a = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 87 / 0;
                }
            }
        });
        int i3 = f8372g + 87;
        f8373i = i3 % 128;
        int i4 = i3 % 2;
        return maybeFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.q
    public final Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c>> c() {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM id_scan WHERE is_synced = 1 AND (front_id_image_path IS NOT NULL || back_id_image_path IS NOT NULL)", 0);
        Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c>> singleCreateSingle = RxRoom.createSingle(new Callable<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c>>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.t.6

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8396d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8397e = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8397e + 29;
                f8396d = i4 % 128;
                if (i4 % 2 != 0) {
                    e();
                    throw null;
                }
                List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> listE = e();
                int i5 = f8396d + 23;
                f8397e = i5 % 128;
                int i6 = i5 % 2;
                return listE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> e() throws Exception {
                String string;
                String string2;
                boolean z2;
                int i3 = 2 % 2;
                int i4 = 0;
                Cursor cursorQuery = DBUtil.query(t.this.f8377d, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "front_id_image_path");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "back_id_image_path");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id_type");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_second_id");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "scan_step");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "capture_type");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_completed");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_synced");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        long j2 = cursorQuery.getLong(columnIndexOrThrow);
                        if (cursorQuery.isNull(columnIndexOrThrow2)) {
                            int i5 = f8397e + 45;
                            f8396d = i5 % 128;
                            int i6 = i5 % 2;
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow2);
                        }
                        int i7 = 1;
                        String string3 = !cursorQuery.isNull(columnIndexOrThrow3) ? cursorQuery.getString(columnIndexOrThrow3) : null;
                        String string4 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        if (cursorQuery.getInt(columnIndexOrThrow5) == 0) {
                            i7 = i4;
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow6)) {
                            int i8 = f8396d + 93;
                            f8397e = i8 % 128;
                            if (i8 % 2 == 0) {
                                int i9 = 54 / i4;
                            }
                            string2 = null;
                        } else {
                            string2 = cursorQuery.getString(columnIndexOrThrow6);
                            int i10 = f8397e + 41;
                            f8396d = i10 % 128;
                            int i11 = i10 % 2;
                        }
                        int i12 = cursorQuery.getInt(columnIndexOrThrow7);
                        com.incode.welcome_sdk.data.local.model.delayed_onboarding.b bVar = t.this.f8376c;
                        com.incode.welcome_sdk.data.remote.beans.f fVarC = com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c(i12);
                        boolean z3 = cursorQuery.getInt(columnIndexOrThrow8) != 0;
                        if (cursorQuery.getInt(columnIndexOrThrow9) != 0) {
                            int i13 = f8397e + 65;
                            f8396d = i13 % 128;
                            int i14 = i13 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList.add(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c(j2, string, string3, string4, i7, string2, fVarC, z3, z2));
                        i4 = 0;
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8397e + 37;
                f8396d = i4 % 128;
                if (i4 % 2 == 0) {
                    roomSQLiteQueryAcquire.release();
                    int i5 = f8397e + 65;
                    f8396d = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 32 / 0;
                        return;
                    }
                    return;
                }
                roomSQLiteQueryAcquire.release();
                throw null;
            }
        });
        int i3 = f8373i + 31;
        f8372g = i3 % 128;
        int i4 = i3 % 2;
        return singleCreateSingle;
    }

    public static List<Class<?>> e() {
        int i2 = 2 % 2;
        int i3 = f8372g + 17;
        f8373i = i3 % 128;
        if (i3 % 2 != 0) {
            return Collections.emptyList();
        }
        Collections.emptyList();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
