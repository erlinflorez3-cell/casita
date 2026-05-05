package com.incode.welcome_sdk.data.local.db.c.a;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.npmdavi.davinotification.DatabaseHelper;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8186a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8187b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final RoomDatabase f8188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> f8189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> f8190e;

    public g(RoomDatabase roomDatabase) {
        this.f8188c = roomDatabase;
        this.f8189d = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.g.3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8201b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8202c = 0;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
                int i2 = 2 % 2;
                int i3 = f8202c + 65;
                f8201b = i3 % 128;
                int i4 = i3 % 2;
                e(supportSQLiteStatement, dVar);
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = f8201b + 47;
                f8202c = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8202c;
                int i4 = i3 + 21;
                f8201b = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 57;
                f8201b = i5 % 128;
                if (i5 % 2 != 0) {
                    return "INSERT OR REPLACE INTO `document_scan` (`id`,`document_path`,`document_type`,`mime_type`,`is_completed`,`is_synced`) VALUES (nullif(?, 0),?,?,?,?,?)";
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void e(androidx.sqlite.db.SupportSQLiteStatement r14, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d r15) {
                /*
                    r13 = this;
                    r1 = 2
                    int r0 = r1 % r1
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass3.f8202c
                    int r2 = r0 + 97
                    int r0 = r2 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass3.f8201b = r0
                    int r2 = r2 % r1
                    long r2 = r15.e()
                    r0 = 1
                    r14.bindLong(r0, r2)
                    java.lang.String r2 = r15.b()
                    if (r2 != 0) goto La7
                    r14.bindNull(r1)
                L1d:
                    com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r2 = r15.d()
                    r3 = 3
                    if (r2 != 0) goto L9b
                    r14.bindNull(r3)
                L27:
                    java.lang.String r2 = r15.a()
                    r3 = 4
                    if (r2 != 0) goto L93
                    r14.bindNull(r3)
                L31:
                    java.lang.Object[] r4 = new java.lang.Object[]{r15}
                    int r5 = com.incode.welcome_sdk.IncodeWelcome.cm.d()
                    int r3 = com.incode.welcome_sdk.IncodeWelcome.cm.d()
                    int r2 = com.incode.welcome_sdk.IncodeWelcome.cm.d()
                    int r7 = com.incode.welcome_sdk.IncodeWelcome.cm.d()
                    r6 = -1018733746(0xffffffffc3475b4e, float:-199.35666)
                    r8 = 1018733746(0x3cb8a4b2, float:0.02253947)
                    java.lang.Object r2 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.c(r2, r3, r4, r5, r6, r7, r8)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    r5 = 0
                    r4 = 5
                    long r2 = (long) r2
                    r14.bindLong(r4, r2)
                    java.lang.Object[] r8 = new java.lang.Object[]{r15}
                    int r9 = com.incode.welcome_sdk.IncodeWelcome.cm.d()
                    int r7 = com.incode.welcome_sdk.IncodeWelcome.cm.d()
                    int r6 = com.incode.welcome_sdk.IncodeWelcome.cm.d()
                    int r11 = com.incode.welcome_sdk.IncodeWelcome.cm.d()
                    r10 = -1648933131(0xffffffff9db746f5, float:-4.8513065E-21)
                    r12 = 1648933132(0x6248b90c, float:9.256707E20)
                    java.lang.Object r2 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.c(r6, r7, r8, r9, r10, r11, r12)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L8c
                    int r2 = com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass3.f8202c
                    int r3 = r2 + 37
                    int r2 = r3 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass3.f8201b = r2
                    int r3 = r3 % r1
                    if (r3 != 0) goto L8d
                L8c:
                    r0 = r5
                L8d:
                    r2 = 6
                    long r0 = (long) r0
                    r14.bindLong(r2, r0)
                    return
                L93:
                    java.lang.String r2 = r15.a()
                    r14.bindString(r3, r2)
                    goto L31
                L9b:
                    com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r2 = r15.d()
                    java.lang.String r2 = com.incode.welcome_sdk.data.local.db.c.a.g.c(r2)
                    r14.bindString(r3, r2)
                    goto L27
                La7:
                    java.lang.String r2 = r15.b()
                    r14.bindString(r1, r2)
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass3.e(androidx.sqlite.db.SupportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d):void");
            }
        };
        this.f8190e = new EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.g.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8191a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8192d = 0;

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
                int i2 = 2 % 2;
                int i3 = f8191a + 17;
                f8192d = i3 % 128;
                int i4 = i3 % 2;
                c(supportSQLiteStatement, dVar);
                if (i4 != 0) {
                    throw null;
                }
                int i5 = f8192d + 53;
                f8191a = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8192d + 35;
                int i4 = i3 % 128;
                f8191a = i4;
                if (i3 % 2 == 0) {
                    int i5 = 0 / 0;
                }
                int i6 = i4 + 75;
                f8192d = i6 % 128;
                if (i6 % 2 == 0) {
                    return "UPDATE OR ABORT `document_scan` SET `id` = ?,`document_path` = ?,`document_type` = ?,`mime_type` = ?,`is_completed` = ?,`is_synced` = ? WHERE `id` = ?";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void c(androidx.sqlite.db.SupportSQLiteStatement r10, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d r11) {
                /*
                    Method dump skipped, instruction units count: 208
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass1.c(androidx.sqlite.db.SupportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d):void");
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.f
    public final Single<Long> d(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.g.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8208a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8209d = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8209d + 117;
                f8208a = i4 % 128;
                int i5 = i4 % 2;
                Long lB = b();
                int i6 = f8209d + 107;
                f8208a = i6 % 128;
                int i7 = i6 % 2;
                return lB;
            }

            private Long b() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8208a + 67;
                f8209d = i4 % 128;
                int i5 = i4 % 2;
                g.this.f8188c.beginTransaction();
                try {
                    Long lValueOf = Long.valueOf(g.this.f8189d.insertAndReturnId(dVar));
                    g.this.f8188c.setTransactionSuccessful();
                    g.this.f8188c.endTransaction();
                    int i6 = f8208a + 29;
                    f8209d = i6 % 128;
                    int i7 = i6 % 2;
                    return lValueOf;
                } catch (Throwable th) {
                    g.this.f8188c.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8187b + 95;
        f8186a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
        return singleFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.f
    public final Completable c(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.g.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8197a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8198b = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8198b + 109;
                f8197a = i4 % 128;
                int i5 = i4 % 2;
                Void voidA = a();
                int i6 = f8197a + 63;
                f8198b = i6 % 128;
                int i7 = i6 % 2;
                return voidA;
            }

            private Void a() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8197a + 21;
                f8198b = i4 % 128;
                Object obj = null;
                try {
                    if (i4 % 2 == 0) {
                        g.this.f8188c.beginTransaction();
                        g.this.f8190e.handle(dVar);
                        g.this.f8188c.setTransactionSuccessful();
                        return null;
                    }
                    g.this.f8188c.beginTransaction();
                    g.this.f8190e.handle(dVar);
                    g.this.f8188c.setTransactionSuccessful();
                    g.this.f8188c.endTransaction();
                    obj.hashCode();
                    throw null;
                } finally {
                    g.this.f8188c.endTransaction();
                }
            }
        });
        int i3 = f8186a + 55;
        f8187b = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.f
    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> b(long j2) {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM document_scan WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> maybeFromCallable = Maybe.fromCallable(new Callable<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.g.4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8204b = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8205d = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8205d + 79;
                f8204b = i4 % 128;
                int i5 = i4 % 2;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVarC = c();
                if (i5 == 0) {
                    int i6 = 28 / 0;
                }
                return dVarC;
            }

            private com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d c() throws Exception {
                String string;
                DocumentType documentTypeB;
                boolean z2;
                int i3 = 2 % 2;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar = null;
                String string2 = null;
                Cursor cursorQuery = DBUtil.query(g.this.f8188c, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "document_path");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DatabaseHelper.COLUMN_DOCUMENT_TYPE);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_completed");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_synced");
                    if (cursorQuery.moveToFirst()) {
                        long j3 = cursorQuery.getLong(columnIndexOrThrow);
                        if (cursorQuery.isNull(columnIndexOrThrow2)) {
                            int i4 = f8204b + 37;
                            f8205d = i4 % 128;
                            if (i4 % 2 != 0) {
                                dVar.hashCode();
                                throw null;
                            }
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow2);
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow3)) {
                            int i5 = f8205d + 27;
                            f8204b = i5 % 128;
                            int i6 = i5 % 2;
                            documentTypeB = null;
                        } else {
                            documentTypeB = g.b(cursorQuery.getString(columnIndexOrThrow3));
                            int i7 = f8205d + 23;
                            f8204b = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow4)) {
                            int i9 = f8205d + 33;
                            f8204b = i9 % 128;
                            if (i9 % 2 == 0) {
                                dVar.hashCode();
                                throw null;
                            }
                        } else {
                            string2 = cursorQuery.getString(columnIndexOrThrow4);
                        }
                        String str = string2;
                        boolean z3 = true;
                        if (cursorQuery.getInt(columnIndexOrThrow5) != 0) {
                            int i10 = f8205d + 39;
                            f8204b = i10 % 128;
                            int i11 = i10 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (cursorQuery.getInt(columnIndexOrThrow6) == 0) {
                            int i12 = f8205d + 79;
                            f8204b = i12 % 128;
                            int i13 = i12 % 2;
                            z3 = false;
                        }
                        dVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d(j3, string, documentTypeB, str, z2, z3);
                    }
                    return dVar;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8205d + 15;
                f8204b = i4 % 128;
                int i5 = i4 % 2;
                roomSQLiteQueryAcquire.release();
                int i6 = f8205d + 45;
                f8204b = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i3 = f8187b + 45;
        f8186a = i3 % 128;
        if (i3 % 2 == 0) {
            return maybeFromCallable;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.f
    public final Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d>> c() {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM document_scan WHERE is_synced = 1 AND document_path IS NOT NULL", 0);
        Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d>> singleCreateSingle = RxRoom.createSingle(new Callable<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d>>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.g.7

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8212c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8213e = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8213e + 39;
                f8212c = i4 % 128;
                if (i4 % 2 == 0) {
                    return b();
                }
                b();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private java.util.List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> b() throws java.lang.Exception {
                /*
                    r22 = this;
                    r2 = r22
                    r13 = 2
                    int r0 = r13 % r13
                    com.incode.welcome_sdk.data.local.db.c.a.g r0 = com.incode.welcome_sdk.data.local.db.c.a.g.this
                    androidx.room.RoomDatabase r1 = r0.f8188c
                    androidx.room.RoomSQLiteQuery r0 = r2
                    r9 = 0
                    r8 = 0
                    android.database.Cursor r7 = androidx.room.util.DBUtil.query(r1, r0, r9, r8)
                    java.lang.String r0 = "id"
                    int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r7, r0)     // Catch: java.lang.Throwable -> Lbc
                    java.lang.String r0 = "document_path"
                    int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r7, r0)     // Catch: java.lang.Throwable -> Lbc
                    java.lang.String r0 = "document_type"
                    int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r7, r0)     // Catch: java.lang.Throwable -> Lbc
                    java.lang.String r0 = "mime_type"
                    int r4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r7, r0)     // Catch: java.lang.Throwable -> Lbc
                    java.lang.String r0 = "is_completed"
                    int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r7, r0)     // Catch: java.lang.Throwable -> Lbc
                    java.lang.String r0 = "is_synced"
                    int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r7, r0)     // Catch: java.lang.Throwable -> Lbc
                    java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbc
                    int r0 = r7.getCount()     // Catch: java.lang.Throwable -> Lbc
                    r2.<init>(r0)     // Catch: java.lang.Throwable -> Lbc
                L3e:
                    boolean r0 = r7.moveToNext()     // Catch: java.lang.Throwable -> Lbc
                    if (r0 == 0) goto Lb8
                    long r15 = r7.getLong(r12)     // Catch: java.lang.Throwable -> Lbc
                    boolean r0 = r7.isNull(r6)     // Catch: java.lang.Throwable -> Lbc
                    if (r0 == 0) goto L61
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass7.f8212c
                    int r1 = r0 + 9
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass7.f8213e = r0
                    int r1 = r1 % r13
                    int r1 = r0 + 123
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass7.f8212c = r0
                    int r1 = r1 % r13
                    r17 = r8
                    goto L65
                L61:
                    java.lang.String r17 = r7.getString(r6)     // Catch: java.lang.Throwable -> Lbc
                L65:
                    boolean r0 = r7.isNull(r5)     // Catch: java.lang.Throwable -> Lbc
                    if (r0 == 0) goto L79
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass7.f8213e
                    int r1 = r0 + 115
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass7.f8212c = r0
                    int r1 = r1 % r13
                    if (r1 != 0) goto Lb7
                    r18 = r8
                    goto L81
                L79:
                    java.lang.String r0 = r7.getString(r5)     // Catch: java.lang.Throwable -> Lbc
                    com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r18 = com.incode.welcome_sdk.data.local.db.c.a.g.b(r0)     // Catch: java.lang.Throwable -> Lbc
                L81:
                    boolean r0 = r7.isNull(r4)     // Catch: java.lang.Throwable -> Lbc
                    r1 = 1
                    r0 = r0 ^ r1
                    if (r0 == r1) goto L8c
                    r19 = r8
                    goto L90
                L8c:
                    java.lang.String r19 = r7.getString(r4)     // Catch: java.lang.Throwable -> Lbc
                L90:
                    int r0 = r7.getInt(r11)     // Catch: java.lang.Throwable -> Lbc
                    if (r0 == 0) goto L97
                    r9 = r1
                L97:
                    int r0 = r7.getInt(r3)     // Catch: java.lang.Throwable -> Lbc
                    if (r0 == 0) goto La8
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass7.f8213e
                    int r10 = r0 + 25
                    int r0 = r10 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass7.f8212c = r0
                    int r10 = r10 % r13
                    if (r10 == 0) goto La9
                La8:
                    r1 = 0
                La9:
                    com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d r14 = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d     // Catch: java.lang.Throwable -> Lbc
                    r20 = r9
                    r21 = r1
                    r14.<init>(r15, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> Lbc
                    r2.add(r14)     // Catch: java.lang.Throwable -> Lbc
                    r9 = 0
                    goto L3e
                Lb7:
                    throw r8     // Catch: java.lang.Throwable -> Lbc
                Lb8:
                    r7.close()
                    return r2
                Lbc:
                    r0 = move-exception
                    r7.close()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.g.AnonymousClass7.b():java.util.List");
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8212c + 113;
                f8213e = i4 % 128;
                int i5 = i4 % 2;
                roomSQLiteQueryAcquire.release();
                int i6 = f8213e + 97;
                f8212c = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i3 = f8187b + 53;
        f8186a = i3 % 128;
        int i4 = i3 % 2;
        return singleCreateSingle;
    }

    public static List<Class<?>> b() {
        int i2 = 2 % 2;
        int i3 = f8187b + 111;
        f8186a = i3 % 128;
        int i4 = i3 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i5 = f8187b + 83;
        f8186a = i5 % 128;
        int i6 = i5 % 2;
        return listEmptyList;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.g$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f8194a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f8195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f8196e = 0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            f8195d = iArr;
            try {
                iArr[DocumentType.NONE.ordinal()] = 1;
                int i2 = f8196e + 45;
                f8194a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8195d[DocumentType.FRONT_ID.ordinal()] = 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8195d[DocumentType.BACK_ID.ordinal()] = 3;
                int i5 = f8196e + 105;
                f8194a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8195d[DocumentType.ADDRESS_STATEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8195d[DocumentType.PAYMENT_PROOF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8195d[DocumentType.MEDICAL_DOC.ordinal()] = 6;
                int i8 = f8196e + 49;
                f8194a = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8195d[DocumentType.OTHER_DOCUMENT_1.ordinal()] = 7;
                int i10 = f8194a + 15;
                f8196e = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 2 % 2;
                }
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8195d[DocumentType.OTHER_DOCUMENT_2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8195d[DocumentType.OTHER_DOCUMENT_3.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8195d[DocumentType.PASSPORT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static String c(DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = f8187b + 87;
        f8186a = i3 % 128;
        int i4 = i3 % 2;
        switch (AnonymousClass10.f8195d[documentType.ordinal()]) {
            case 1:
                int i5 = f8187b + 79;
                f8186a = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 10 / 0;
                }
                return "NONE";
            case 2:
                return "FRONT_ID";
            case 3:
                return "BACK_ID";
            case 4:
                return "ADDRESS_STATEMENT";
            case 5:
                return "PAYMENT_PROOF";
            case 6:
                return "MEDICAL_DOC";
            case 7:
                return "OTHER_DOCUMENT_1";
            case 8:
                return "OTHER_DOCUMENT_2";
            case 9:
                return "OTHER_DOCUMENT_3";
            case 10:
                return "PASSPORT";
            default:
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(String.valueOf(documentType)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType b(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.g.b(java.lang.String):com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType");
    }
}
