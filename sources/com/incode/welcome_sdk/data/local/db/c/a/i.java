package com.incode.welcome_sdk.data.local.db.c.a;

import android.database.Cursor;
import androidx.core.provider.FontsContractCompat;
import androidx.room.EmptyResultSetException;
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
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8216b = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f8217i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final RoomDatabase f8218a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> f8219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> f8220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SharedSQLiteStatement f8221e;

    public i(RoomDatabase roomDatabase) {
        this.f8218a = roomDatabase;
        this.f8220d = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.i.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8229a = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8230e = 1;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
                int i2 = 2 % 2;
                int i3 = f8229a + 39;
                f8230e = i3 % 128;
                int i4 = i3 % 2;
                e(supportSQLiteStatement, dVar);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = f8229a + 9;
                f8230e = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8229a + 3;
                int i4 = i3 % 128;
                f8230e = i4;
                if (i3 % 2 == 0) {
                    int i5 = 0 / 0;
                }
                int i6 = i4 + 93;
                f8229a = i6 % 128;
                if (i6 % 2 == 0) {
                    return "INSERT OR REPLACE INTO `delayed_onboarding` (`id`,`session_config_id`,`flow_config_id`,`is_completed`,`is_synced`,`result_code`) VALUES (nullif(?, 0),?,?,?,?,?)";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void e(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
                int i2;
                int i3 = 2 % 2;
                supportSQLiteStatement.bindLong(1, dVar.b());
                supportSQLiteStatement.bindLong(2, dVar.a());
                supportSQLiteStatement.bindLong(3, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.a(-977628280, 977628281, IdCaptureViewModel.ai.d(), new Object[]{dVar}, IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d())).longValue());
                int i4 = 0;
                if (dVar.c()) {
                    int i5 = f8229a + 61;
                    f8230e = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                supportSQLiteStatement.bindLong(4, i2);
                if (dVar.j()) {
                    int i7 = f8229a + 105;
                    int i8 = i7 % 128;
                    f8230e = i8;
                    int i9 = i7 % 2 == 0 ? 0 : 1;
                    int i10 = i8 + 77;
                    f8229a = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = i9;
                }
                supportSQLiteStatement.bindLong(5, i4);
                if (dVar.f() != null) {
                    supportSQLiteStatement.bindString(6, dVar.f());
                    return;
                }
                int i12 = f8229a + 13;
                f8230e = i12 % 128;
                if (i12 % 2 == 0) {
                    supportSQLiteStatement.bindNull(110);
                } else {
                    supportSQLiteStatement.bindNull(6);
                }
            }
        };
        this.f8219c = new EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.i.3

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8232d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8233e = 0;

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
                int i2 = 2 % 2;
                int i3 = f8232d + 69;
                f8233e = i3 % 128;
                int i4 = i3 % 2;
                a(supportSQLiteStatement, dVar);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8233e + 69;
                f8232d = i3 % 128;
                if (i3 % 2 != 0) {
                    return "UPDATE OR ABORT `delayed_onboarding` SET `id` = ?,`session_config_id` = ?,`flow_config_id` = ?,`is_completed` = ?,`is_synced` = ?,`result_code` = ? WHERE `id` = ?";
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0055  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void a(androidx.sqlite.db.SupportSQLiteStatement r13, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d r14) {
                /*
                    r2 = 2
                    int r0 = r2 % r2
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.i.AnonymousClass3.f8233e
                    int r1 = r0 + 61
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.i.AnonymousClass3.f8232d = r0
                    int r1 = r1 % r2
                    long r0 = r14.b()
                    r5 = 1
                    r13.bindLong(r5, r0)
                    long r0 = r14.a()
                    r13.bindLong(r2, r0)
                    java.lang.Object[] r9 = new java.lang.Object[]{r14}
                    int r8 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.d()
                    int r12 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.d()
                    int r10 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.d()
                    int r11 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.d()
                    r7 = 977628281(0x3a456c79, float:7.5311173E-4)
                    r6 = -977628280(0xffffffffc5ba9388, float:-5970.4414)
                    java.lang.Object r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.a(r6, r7, r8, r9, r10, r11, r12)
                    java.lang.Long r0 = (java.lang.Long) r0
                    long r3 = r0.longValue()
                    r0 = 3
                    r13.bindLong(r0, r3)
                    boolean r0 = r14.c()
                    r4 = 7
                    r6 = 0
                    if (r0 == 0) goto L55
                    int r1 = com.incode.welcome_sdk.data.local.db.c.a.i.AnonymousClass3.f8233e
                    int r1 = r1 + r4
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.i.AnonymousClass3.f8232d = r0
                    int r1 = r1 % r2
                    if (r1 != 0) goto L94
                L55:
                    r0 = r6
                L56:
                    r3 = 4
                    long r0 = (long) r0
                    r13.bindLong(r3, r0)
                    boolean r0 = r14.j()
                    if (r0 == 0) goto L92
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.i.AnonymousClass3.f8232d
                    int r1 = r0 + 99
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.i.AnonymousClass3.f8233e = r0
                    int r1 = r1 % r2
                L6a:
                    r3 = 5
                    long r0 = (long) r5
                    r13.bindLong(r3, r0)
                    java.lang.String r0 = r14.f()
                    r1 = 6
                    if (r0 != 0) goto L8a
                    r13.bindNull(r1)
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.i.AnonymousClass3.f8233e
                    int r1 = r0 + 75
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.i.AnonymousClass3.f8232d = r0
                    int r1 = r1 % r2
                L82:
                    long r0 = r14.b()
                    r13.bindLong(r4, r0)
                    return
                L8a:
                    java.lang.String r0 = r14.f()
                    r13.bindString(r1, r0)
                    goto L82
                L92:
                    r5 = r6
                    goto L6a
                L94:
                    r0 = r5
                    goto L56
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.i.AnonymousClass3.a(androidx.sqlite.db.SupportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d):void");
            }
        };
        this.f8221e = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.i.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8222c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8223e = 1;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8222c + 1;
                f8223e = i3 % 128;
                if (i3 % 2 != 0) {
                    return "DELETE FROM delayed_onboarding";
                }
                throw null;
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.d
    public final Single<Long> c(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.i.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8239a = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8240c = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8240c + 33;
                f8239a = i4 % 128;
                int i5 = i4 % 2;
                Long lE = e();
                int i6 = f8239a + 113;
                f8240c = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 24 / 0;
                }
                return lE;
            }

            private Long e() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8239a + 27;
                f8240c = i4 % 128;
                int i5 = i4 % 2;
                i.this.f8218a.beginTransaction();
                try {
                    Long lValueOf = Long.valueOf(i.this.f8220d.insertAndReturnId(dVar));
                    i.this.f8218a.setTransactionSuccessful();
                    i.this.f8218a.endTransaction();
                    int i6 = f8239a + 111;
                    f8240c = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 27 / 0;
                    }
                    return lValueOf;
                } catch (Throwable th) {
                    i.this.f8218a.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8216b + 31;
        f8217i = i3 % 128;
        int i4 = i3 % 2;
        return singleFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.d
    public final Completable a(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.i.10

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8225d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8226e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                Void voidD;
                int i3 = 2 % 2;
                int i4 = f8225d + 83;
                f8226e = i4 % 128;
                if (i4 % 2 != 0) {
                    voidD = d();
                    int i5 = 21 / 0;
                } else {
                    voidD = d();
                }
                int i6 = f8226e + 39;
                f8225d = i6 % 128;
                int i7 = i6 % 2;
                return voidD;
            }

            private Void d() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8225d + 101;
                f8226e = i4 % 128;
                try {
                    if (i4 % 2 == 0) {
                        i.this.f8218a.beginTransaction();
                        i.this.f8219c.handle(dVar);
                        i.this.f8218a.setTransactionSuccessful();
                        i.this.f8218a.endTransaction();
                        int i5 = f8226e + 115;
                        f8225d = i5 % 128;
                        int i6 = i5 % 2;
                        return null;
                    }
                    i.this.f8218a.beginTransaction();
                    i.this.f8219c.handle(dVar);
                    i.this.f8218a.setTransactionSuccessful();
                    throw null;
                } finally {
                    i.this.f8218a.endTransaction();
                }
            }
        });
        int i3 = f8216b + 47;
        f8217i = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.d
    public final Completable a() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.i.9

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8251d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8252e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8251d + 39;
                f8252e = i4 % 128;
                int i5 = i4 % 2;
                Void voidA = a();
                int i6 = f8252e + 71;
                f8251d = i6 % 128;
                int i7 = i6 % 2;
                return voidA;
            }

            private Void a() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8252e + 25;
                f8251d = i4 % 128;
                int i5 = i4 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = i.this.f8221e.acquire();
                try {
                    i.this.f8218a.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        i.this.f8218a.setTransactionSuccessful();
                        i.this.f8221e.release(supportSQLiteStatementAcquire);
                        int i6 = f8252e + 3;
                        f8251d = i6 % 128;
                        int i7 = i6 % 2;
                        return null;
                    } finally {
                        i.this.f8218a.endTransaction();
                    }
                } catch (Throwable th) {
                    i.this.f8221e.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8216b + 49;
        f8217i = i3 % 128;
        if (i3 % 2 != 0) {
            return completableFromCallable;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.d
    public final Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>> b() {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM delayed_onboarding WHERE is_completed = 1 AND is_synced = 0", 0);
        Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>> singleCreateSingle = RxRoom.createSingle(new Callable<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.i.8

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8247a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8248b = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8247a + 77;
                f8248b = i4 % 128;
                int i5 = i4 % 2;
                List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> listC = c();
                if (i5 != 0) {
                    int i6 = 87 / 0;
                }
                return listC;
            }

            private List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> c() throws Exception {
                boolean z2;
                String string;
                int i3 = 2 % 2;
                Cursor cursorQuery = DBUtil.query(i.this.f8218a, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "session_config_id");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flow_config_id");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_completed");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_synced");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, FontsContractCompat.Columns.RESULT_CODE);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    int i4 = f8247a + 113;
                    f8248b = i4 % 128;
                    int i5 = i4 % 2;
                    while (cursorQuery.moveToNext()) {
                        long j2 = cursorQuery.getLong(columnIndexOrThrow);
                        long j3 = cursorQuery.getLong(columnIndexOrThrow2);
                        long j4 = cursorQuery.getLong(columnIndexOrThrow3);
                        boolean z3 = true;
                        if (cursorQuery.getInt(columnIndexOrThrow4) != 0) {
                            int i6 = f8247a + 5;
                            f8248b = i6 % 128;
                            int i7 = i6 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (cursorQuery.getInt(columnIndexOrThrow5) != 0) {
                            int i8 = f8247a + 111;
                            f8248b = i8 % 128;
                            int i9 = i8 % 2;
                        } else {
                            z3 = false;
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow6)) {
                            int i10 = f8248b + 75;
                            f8247a = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 47 / 0;
                            }
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow6);
                        }
                        arrayList.add(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d(j2, j3, j4, z2, z3, string));
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8247a + 89;
                f8248b = i4 % 128;
                if (i4 % 2 == 0) {
                    roomSQLiteQueryAcquire.release();
                    int i5 = f8247a + 37;
                    f8248b = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                roomSQLiteQueryAcquire.release();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i3 = f8217i + 111;
        f8216b = i3 % 128;
        int i4 = i3 % 2;
        return singleCreateSingle;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.d
    public final Single<Long> c(long j2) {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT flow_config_id FROM delayed_onboarding WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        Single<Long> singleCreateSingle = RxRoom.createSingle(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.i.6

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8243d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8244e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8243d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f8244e = i4 % 128;
                int i5 = i4 % 2;
                Long lE = e();
                int i6 = f8243d + 43;
                f8244e = i6 % 128;
                int i7 = i6 % 2;
                return lE;
            }

            private Long e() throws Exception {
                int i3 = 2 % 2;
                Long lValueOf = null;
                Cursor cursorQuery = DBUtil.query(i.this.f8218a, roomSQLiteQueryAcquire, false, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i4 = f8243d + 113;
                        f8244e = i4 % 128;
                        int i5 = i4 % 2;
                        if (!cursorQuery.isNull(0)) {
                            lValueOf = Long.valueOf(cursorQuery.getLong(0));
                            int i6 = f8243d + 95;
                            f8244e = i6 % 128;
                            int i7 = i6 % 2;
                        }
                    }
                    if (lValueOf != null) {
                        return lValueOf;
                    }
                    throw new EmptyResultSetException(new StringBuilder("Query returned empty result set: ").append(roomSQLiteQueryAcquire.getSql()).toString());
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8243d + 67;
                f8244e = i4 % 128;
                if (i4 % 2 != 0) {
                    roomSQLiteQueryAcquire.release();
                    int i5 = 82 / 0;
                } else {
                    roomSQLiteQueryAcquire.release();
                }
                int i6 = f8244e + 109;
                f8243d = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i3 = f8216b + 121;
        f8217i = i3 % 128;
        if (i3 % 2 != 0) {
            return singleCreateSingle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.d
    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> a(long j2) {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM delayed_onboarding WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> maybeFromCallable = Maybe.fromCallable(new Callable<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.i.4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8235b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8236d = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.d call() throws Exception {
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVarE;
                int i3 = 2 % 2;
                int i4 = f8236d + 53;
                f8235b = i4 % 128;
                if (i4 % 2 != 0) {
                    dVarE = e();
                    int i5 = 40 / 0;
                } else {
                    dVarE = e();
                }
                int i6 = f8236d + 107;
                f8235b = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 1 / 0;
                }
                return dVarE;
            }

            private com.incode.welcome_sdk.data.local.model.delayed_onboarding.d e() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8236d + 69;
                f8235b = i4 % 128;
                int i5 = i4 % 2;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar = null;
                String string = null;
                Cursor cursorQuery = DBUtil.query(i.this.f8218a, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "session_config_id");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flow_config_id");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_completed");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_synced");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, FontsContractCompat.Columns.RESULT_CODE);
                    if (cursorQuery.moveToFirst()) {
                        long j3 = cursorQuery.getLong(columnIndexOrThrow);
                        long j4 = cursorQuery.getLong(columnIndexOrThrow2);
                        long j5 = cursorQuery.getLong(columnIndexOrThrow3);
                        boolean z2 = true;
                        boolean z3 = cursorQuery.getInt(columnIndexOrThrow4) != 0;
                        if (cursorQuery.getInt(columnIndexOrThrow5) != 0) {
                            int i6 = f8236d + 55;
                            f8235b = i6 % 128;
                            int i7 = i6 % 2;
                        } else {
                            int i8 = f8235b + 77;
                            f8236d = i8 % 128;
                            int i9 = i8 % 2;
                            z2 = false;
                        }
                        if (!cursorQuery.isNull(columnIndexOrThrow6)) {
                            string = cursorQuery.getString(columnIndexOrThrow6);
                        }
                        dVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d(j3, j4, j5, z3, z2, string);
                    }
                    return dVar;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8236d + 3;
                f8235b = i4 % 128;
                if (i4 % 2 != 0) {
                    roomSQLiteQueryAcquire.release();
                    int i5 = 69 / 0;
                } else {
                    roomSQLiteQueryAcquire.release();
                }
            }
        });
        int i3 = f8216b + 13;
        f8217i = i3 % 128;
        int i4 = i3 % 2;
        return maybeFromCallable;
    }

    public static List<Class<?>> d() {
        int i2 = 2 % 2;
        int i3 = f8217i + 101;
        f8216b = i3 % 128;
        int i4 = i3 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i5 = f8217i + 113;
        f8216b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return listEmptyList;
    }
}
