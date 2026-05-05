package com.incode.welcome_sdk.data.local.db.c.a;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.modules.FaceMatch;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8291b = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f8292f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedSQLiteStatement f8293a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final RoomDatabase f8294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> f8295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> f8296e;

    public m(RoomDatabase roomDatabase) {
        this.f8294c = roomDatabase;
        this.f8295d = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.m.4

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8311d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8312e = 1;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar) {
                int i2 = 2 % 2;
                int i3 = f8311d + 31;
                f8312e = i3 % 128;
                int i4 = i3 % 2;
                e(supportSQLiteStatement, aVar);
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = f8312e + 47;
                f8311d = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8312e + 23;
                int i4 = i3 % 128;
                f8311d = i4;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 103;
                f8312e = i5 % 128;
                int i6 = i5 % 2;
                return "INSERT OR REPLACE INTO `face_match` (`id`,`match_type`,`is_completed`,`is_synced`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void e(androidx.sqlite.db.SupportSQLiteStatement r7, com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a r8) {
                /*
                    r6 = this;
                    r4 = 2
                    int r0 = r4 % r4
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.m.AnonymousClass4.f8311d
                    int r1 = r0 + 5
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.m.AnonymousClass4.f8312e = r0
                    int r1 = r1 % r4
                    r3 = 4
                    r5 = 0
                    r2 = 1
                    if (r1 != 0) goto L41
                    long r0 = r8.a()
                    r7.bindLong(r5, r0)
                    com.incode.welcome_sdk.modules.FaceMatch$MatchType r0 = r8.c()
                    java.lang.String r0 = com.incode.welcome_sdk.data.local.db.c.a.m.e(r0)
                    r7.bindString(r3, r0)
                    boolean r0 = r8.d()
                    if (r0 == 0) goto L33
                L29:
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.m.AnonymousClass4.f8311d
                    int r1 = r0 + 27
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.m.AnonymousClass4.f8312e = r0
                    int r1 = r1 % r4
                    r5 = r2
                L33:
                    r2 = 3
                    long r0 = (long) r5
                    r7.bindLong(r2, r0)
                    boolean r0 = r8.b()
                    long r0 = (long) r0
                    r7.bindLong(r3, r0)
                    return
                L41:
                    long r0 = r8.a()
                    r7.bindLong(r2, r0)
                    com.incode.welcome_sdk.modules.FaceMatch$MatchType r0 = r8.c()
                    java.lang.String r0 = com.incode.welcome_sdk.data.local.db.c.a.m.e(r0)
                    r7.bindString(r4, r0)
                    boolean r0 = r8.d()
                    if (r0 == 0) goto L33
                    goto L29
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.m.AnonymousClass4.e(androidx.sqlite.db.SupportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a):void");
            }
        };
        this.f8296e = new EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.m.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8308a = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8309e = 0;

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar) {
                int i2 = 2 % 2;
                int i3 = f8308a + 19;
                f8309e = i3 % 128;
                int i4 = i3 % 2;
                e(supportSQLiteStatement, aVar);
                int i5 = f8308a + 47;
                f8309e = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8309e;
                int i4 = i3 + 107;
                f8308a = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i3 + 47;
                f8308a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 33 / 0;
                }
                return "UPDATE OR ABORT `face_match` SET `id` = ?,`match_type` = ?,`is_completed` = ?,`is_synced` = ? WHERE `id` = ?";
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void e(androidx.sqlite.db.SupportSQLiteStatement r8, com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a r9) {
                /*
                    r7 = this;
                    r5 = 2
                    int r0 = r5 % r5
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.m.AnonymousClass3.f8308a
                    int r1 = r0 + 105
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.m.AnonymousClass3.f8309e = r0
                    int r1 = r1 % r5
                    r6 = 0
                    r3 = 5
                    r4 = 1
                    if (r1 == 0) goto L4c
                    long r0 = r9.a()
                    r8.bindLong(r4, r0)
                    com.incode.welcome_sdk.modules.FaceMatch$MatchType r0 = r9.c()
                    java.lang.String r0 = com.incode.welcome_sdk.data.local.db.c.a.m.e(r0)
                    r8.bindString(r3, r0)
                    boolean r0 = r9.d()
                    if (r0 == 0) goto L64
                L29:
                    r0 = r4
                L2a:
                    r2 = 3
                    long r0 = (long) r0
                    r8.bindLong(r2, r0)
                    boolean r0 = r9.b()
                    if (r0 == 0) goto L3f
                    int r0 = com.incode.welcome_sdk.data.local.db.c.a.m.AnonymousClass3.f8308a
                    int r1 = r0 + 93
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.local.db.c.a.m.AnonymousClass3.f8309e = r0
                    int r1 = r1 % r5
                    r6 = r4
                L3f:
                    r2 = 4
                    long r0 = (long) r6
                    r8.bindLong(r2, r0)
                    long r0 = r9.a()
                    r8.bindLong(r3, r0)
                    return
                L4c:
                    long r0 = r9.a()
                    r8.bindLong(r4, r0)
                    com.incode.welcome_sdk.modules.FaceMatch$MatchType r0 = r9.c()
                    java.lang.String r0 = com.incode.welcome_sdk.data.local.db.c.a.m.e(r0)
                    r8.bindString(r5, r0)
                    boolean r0 = r9.d()
                    if (r0 != 0) goto L29
                L64:
                    r0 = r6
                    goto L2a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.m.AnonymousClass3.e(androidx.sqlite.db.SupportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a):void");
            }
        };
        this.f8293a = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.m.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8314a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8315d = 0;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8314a + 15;
                f8315d = i3 % 128;
                if (i3 % 2 == 0) {
                    return "DELETE FROM face_match";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.k
    public final Single<Long> b(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.m.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8304b = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8305e = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                Long lB;
                int i3 = 2 % 2;
                int i4 = f8305e + 69;
                f8304b = i4 % 128;
                if (i4 % 2 != 0) {
                    lB = b();
                    int i5 = 51 / 0;
                } else {
                    lB = b();
                }
                int i6 = f8305e + 79;
                f8304b = i6 % 128;
                int i7 = i6 % 2;
                return lB;
            }

            private Long b() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8304b + 101;
                f8305e = i4 % 128;
                int i5 = i4 % 2;
                m.this.f8294c.beginTransaction();
                try {
                    Long lValueOf = Long.valueOf(m.this.f8295d.insertAndReturnId(aVar));
                    m.this.f8294c.setTransactionSuccessful();
                    m.this.f8294c.endTransaction();
                    int i6 = f8305e + 29;
                    f8304b = i6 % 128;
                    int i7 = i6 % 2;
                    return lValueOf;
                } catch (Throwable th) {
                    m.this.f8294c.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8291b + 9;
        f8292f = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
        return singleFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.k
    public final Completable d(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.m.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8297a = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8298c = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8297a + 103;
                f8298c = i4 % 128;
                int i5 = i4 % 2;
                Void voidA = a();
                if (i5 != 0) {
                    int i6 = 13 / 0;
                }
                return voidA;
            }

            private Void a() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8297a + 69;
                f8298c = i4 % 128;
                int i5 = i4 % 2;
                m.this.f8294c.beginTransaction();
                try {
                    m.this.f8296e.handle(aVar);
                    m.this.f8294c.setTransactionSuccessful();
                    m.this.f8294c.endTransaction();
                    int i6 = f8297a + 13;
                    f8298c = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 17 / 0;
                    }
                    return null;
                } catch (Throwable th) {
                    m.this.f8294c.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8291b + 59;
        f8292f = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.k
    public final Completable a() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.m.10

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8301c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8302d = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8301c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f8302d = i4 % 128;
                int i5 = i4 % 2;
                Void voidE = e();
                int i6 = f8302d + 81;
                f8301c = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 37 / 0;
                }
                return voidE;
            }

            private Void e() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8302d + 39;
                f8301c = i4 % 128;
                int i5 = i4 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = m.this.f8293a.acquire();
                try {
                    m.this.f8294c.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        m.this.f8294c.setTransactionSuccessful();
                        m.this.f8293a.release(supportSQLiteStatementAcquire);
                        int i6 = f8302d + 75;
                        f8301c = i6 % 128;
                        int i7 = i6 % 2;
                        return null;
                    } finally {
                        m.this.f8294c.endTransaction();
                    }
                } catch (Throwable th) {
                    m.this.f8293a.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8292f + 47;
        f8291b = i3 % 128;
        if (i3 % 2 == 0) {
            return completableFromCallable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.k
    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> d(long j2) {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM face_match WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> maybeFromCallable = Maybe.fromCallable(new Callable<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.m.9

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8320b = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8321d = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8321d + 37;
                f8320b = i4 % 128;
                if (i4 % 2 == 0) {
                    c();
                    throw null;
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVarC = c();
                int i5 = f8320b + 113;
                f8321d = i5 % 128;
                int i6 = i5 % 2;
                return aVarC;
            }

            private com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a c() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8320b + 95;
                f8321d = i4 % 128;
                int i5 = i4 % 2;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar = null;
                Cursor cursorQuery = DBUtil.query(m.this.f8294c, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "match_type");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_completed");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_synced");
                    if (cursorQuery.moveToFirst()) {
                        int i6 = f8321d + 25;
                        f8320b = i6 % 128;
                        int i7 = i6 % 2;
                        long j3 = cursorQuery.getLong(columnIndexOrThrow);
                        FaceMatch.MatchType matchTypeE = m.e(cursorQuery.getString(columnIndexOrThrow2));
                        boolean z2 = true;
                        boolean z3 = cursorQuery.getInt(columnIndexOrThrow3) != 0;
                        if (cursorQuery.getInt(columnIndexOrThrow4) == 0) {
                            int i8 = f8321d + 113;
                            f8320b = i8 % 128;
                            int i9 = i8 % 2;
                            z2 = false;
                        }
                        aVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a(j3, matchTypeE, z3, z2);
                    }
                    return aVar;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i3 = 2 % 2;
                int i4 = f8321d + 35;
                f8320b = i4 % 128;
                int i5 = i4 % 2;
                roomSQLiteQueryAcquire.release();
                int i6 = f8321d + 125;
                f8320b = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i3 = f8291b + 3;
        f8292f = i3 % 128;
        int i4 = i3 % 2;
        return maybeFromCallable;
    }

    public static List<Class<?>> d() {
        int i2 = 2 % 2;
        int i3 = f8291b + 17;
        f8292f = i3 % 128;
        if (i3 % 2 != 0) {
            return Collections.emptyList();
        }
        Collections.emptyList();
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.m$8, reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f8317a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f8318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f8319d = 1;

        static {
            int[] iArr = new int[FaceMatch.MatchType.values().length];
            f8318c = iArr;
            try {
                iArr[FaceMatch.MatchType.ID_SELFIE.ordinal()] = 1;
                int i2 = f8319d + 77;
                f8317a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8318c[FaceMatch.MatchType.NFC_SELFIE.ordinal()] = 2;
                int i4 = f8319d + 67;
                f8317a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8318c[FaceMatch.MatchType.NFC_3_WAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static String e(FaceMatch.MatchType matchType) {
        int i2 = 2 % 2;
        int i3 = f8291b + 125;
        f8292f = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = AnonymousClass8.f8318c[matchType.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    return "NFC_SELFIE";
                }
                if (i4 == 3) {
                    return "NFC_3_WAY";
                }
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(String.valueOf(matchType)));
            }
            int i5 = f8292f + 51;
            f8291b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 54 / 0;
            }
            return "ID_SELFIE";
        }
        int i7 = AnonymousClass8.f8318c[matchType.ordinal()];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.incode.welcome_sdk.modules.FaceMatch.MatchType e(java.lang.String r4) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.data.local.db.c.a.m.f8291b
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.a.m.f8292f = r0
            int r1 = r1 % r3
            int r1 = r4.hashCode()
            r0 = 298133775(0x11c5290f, float:3.1106424E-28)
            r2 = 1
            if (r1 == r0) goto L47
            r0 = 307608844(0x1255bd0c, float:6.7443967E-28)
            if (r1 == r0) goto L34
            r0 = 1544010396(0x5c07ba9c, float:1.528172E17)
            if (r1 == r0) goto L2a
        L20:
            r0 = -1
        L21:
            if (r0 == 0) goto L6d
            if (r0 == r2) goto L6a
            if (r0 != r3) goto L5a
            com.incode.welcome_sdk.modules.FaceMatch$MatchType r0 = com.incode.welcome_sdk.modules.FaceMatch.MatchType.NFC_3_WAY
            return r0
        L2a:
            java.lang.String r0 = "NFC_SELFIE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L20
            r0 = r2
            goto L21
        L34:
            java.lang.String r0 = "ID_SELFIE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L20
            int r0 = com.incode.welcome_sdk.data.local.db.c.a.m.f8292f
            int r1 = r0 + 119
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.a.m.f8291b = r0
            int r1 = r1 % r3
            r0 = 0
            goto L21
        L47:
            java.lang.String r0 = "NFC_3_WAY"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L20
            int r0 = com.incode.welcome_sdk.data.local.db.c.a.m.f8292f
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.a.m.f8291b = r0
            int r1 = r1 % r3
            r0 = r3
            goto L21
        L5a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't convert value to enum, unknown value: "
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r1.concat(r0)
            r2.<init>(r0)
            throw r2
        L6a:
            com.incode.welcome_sdk.modules.FaceMatch$MatchType r0 = com.incode.welcome_sdk.modules.FaceMatch.MatchType.NFC_SELFIE
            return r0
        L6d:
            com.incode.welcome_sdk.modules.FaceMatch$MatchType r2 = com.incode.welcome_sdk.modules.FaceMatch.MatchType.ID_SELFIE
            int r0 = com.incode.welcome_sdk.data.local.db.c.a.m.f8291b
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.a.m.f8292f = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L7b
            return r2
        L7b:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.a.m.e(java.lang.String):com.incode.welcome_sdk.modules.FaceMatch$MatchType");
    }
}
