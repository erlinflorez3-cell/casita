package com.incode.welcome_sdk.data.local.db.c;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.remote.b;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.incode.welcome_sdk.ui.geolocation.GeolocationActivity_MembersInjector;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8504a = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f8505f = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.d> f8506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.incode.welcome_sdk.data.local.model.delayed_onboarding.g f8507c = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RoomDatabase f8508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.d> f8509e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object e(java.lang.Object[] r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.e.e(java.lang.Object[], int, int, int, int, int, int):java.lang.Object");
    }

    public e(RoomDatabase roomDatabase) {
        this.f8508d = roomDatabase;
        this.f8509e = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.d>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.e.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8518a = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8519e = 1;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.d dVar) throws JSONException {
                int i2 = 2 % 2;
                int i3 = f8518a + 89;
                f8519e = i3 % 128;
                int i4 = i3 % 2;
                d(supportSQLiteStatement, dVar);
                if (i4 == 0) {
                    throw null;
                }
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8518a + 69;
                f8519e = i3 % 128;
                if (i3 % 2 != 0) {
                    return "INSERT OR REPLACE INTO `face_login_attempt` (`id`,`base64_frame`,`face_coordinates`,`bitmap_width`,`bitmap_height`,`face_recognition_confidence`,`face_recognition_threshold`,`liveness_confidence`,`liveness_threshold`,`brightness_level`,`blurriness_level`,`authentication_type`,`customer_id`,`face_auth_mode`,`sync_status`,`sync_result`,`error`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                }
                throw null;
            }

            private void d(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.d dVar) throws JSONException {
                int i2 = 2 % 2;
                supportSQLiteStatement.bindLong(1, dVar.b());
                if (dVar.c() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, dVar.c());
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.g gVar = e.this.f8507c;
                String strB = com.incode.welcome_sdk.data.local.model.delayed_onboarding.g.b((Map<String, Float>) com.incode.welcome_sdk.data.local.d.d(new Object[]{dVar}, -581205358, 581205359, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a()));
                if (strB == null) {
                    supportSQLiteStatement.bindNull(3);
                    int i3 = f8519e + 33;
                    f8518a = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    supportSQLiteStatement.bindString(3, strB);
                }
                supportSQLiteStatement.bindLong(4, ((Integer) com.incode.welcome_sdk.data.local.d.d(new Object[]{dVar}, -1333266828, 1333266828, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a())).intValue());
                supportSQLiteStatement.bindLong(5, dVar.d());
                supportSQLiteStatement.bindDouble(6, dVar.f());
                supportSQLiteStatement.bindDouble(7, dVar.h());
                supportSQLiteStatement.bindDouble(8, dVar.g());
                supportSQLiteStatement.bindDouble(9, dVar.i());
                supportSQLiteStatement.bindDouble(10, ((Float) com.incode.welcome_sdk.data.local.d.d(new Object[]{dVar}, -608352159, 608352162, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a())).floatValue());
                supportSQLiteStatement.bindDouble(11, ((Float) com.incode.welcome_sdk.data.local.d.d(new Object[]{dVar}, 938647139, -938647137, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a())).floatValue());
                if (dVar.k() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, dVar.k());
                }
                if (dVar.m() == null) {
                    int i5 = f8519e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f8518a = i5 % 128;
                    if (i5 % 2 != 0) {
                        supportSQLiteStatement.bindNull(88);
                    } else {
                        supportSQLiteStatement.bindNull(13);
                    }
                    int i6 = f8518a + 121;
                    f8519e = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    supportSQLiteStatement.bindString(13, dVar.m());
                }
                supportSQLiteStatement.bindString(14, e.d(dVar.n()));
                supportSQLiteStatement.bindString(15, e.c(dVar.o()));
                if (dVar.t() == null) {
                    int i8 = f8519e + 3;
                    f8518a = i8 % 128;
                    if (i8 % 2 != 0) {
                        supportSQLiteStatement.bindNull(47);
                    } else {
                        supportSQLiteStatement.bindNull(16);
                    }
                } else {
                    supportSQLiteStatement.bindString(16, e.a(dVar.t()));
                }
                if (dVar.r() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindString(17, dVar.r());
                }
            }
        };
        this.f8506b = new EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.d>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.e.4

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8521c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8522d = 0;

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.d dVar) throws JSONException {
                int i2 = 2 % 2;
                int i3 = f8522d + 51;
                f8521c = i3 % 128;
                int i4 = i3 % 2;
                e(supportSQLiteStatement, dVar);
                int i5 = f8522d + 35;
                f8521c = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8521c + 13;
                f8522d = i3 % 128;
                if (i3 % 2 == 0) {
                    return "UPDATE OR ABORT `face_login_attempt` SET `id` = ?,`base64_frame` = ?,`face_coordinates` = ?,`bitmap_width` = ?,`bitmap_height` = ?,`face_recognition_confidence` = ?,`face_recognition_threshold` = ?,`liveness_confidence` = ?,`liveness_threshold` = ?,`brightness_level` = ?,`blurriness_level` = ?,`authentication_type` = ?,`customer_id` = ?,`face_auth_mode` = ?,`sync_status` = ?,`sync_result` = ?,`error` = ? WHERE `id` = ?";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private void e(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.d dVar) throws JSONException {
                int i2 = 2 % 2;
                supportSQLiteStatement.bindLong(1, dVar.b());
                if (dVar.c() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, dVar.c());
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.g gVar = e.this.f8507c;
                String strB = com.incode.welcome_sdk.data.local.model.delayed_onboarding.g.b((Map<String, Float>) com.incode.welcome_sdk.data.local.d.d(new Object[]{dVar}, -581205358, 581205359, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a()));
                if (strB == null) {
                    int i3 = f8521c + 63;
                    f8522d = i3 % 128;
                    if (i3 % 2 != 0) {
                        supportSQLiteStatement.bindNull(4);
                    } else {
                        supportSQLiteStatement.bindNull(3);
                    }
                } else {
                    supportSQLiteStatement.bindString(3, strB);
                }
                supportSQLiteStatement.bindLong(4, ((Integer) com.incode.welcome_sdk.data.local.d.d(new Object[]{dVar}, -1333266828, 1333266828, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a())).intValue());
                supportSQLiteStatement.bindLong(5, dVar.d());
                supportSQLiteStatement.bindDouble(6, dVar.f());
                supportSQLiteStatement.bindDouble(7, dVar.h());
                supportSQLiteStatement.bindDouble(8, dVar.g());
                supportSQLiteStatement.bindDouble(9, dVar.i());
                supportSQLiteStatement.bindDouble(10, ((Float) com.incode.welcome_sdk.data.local.d.d(new Object[]{dVar}, -608352159, 608352162, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a())).floatValue());
                supportSQLiteStatement.bindDouble(11, ((Float) com.incode.welcome_sdk.data.local.d.d(new Object[]{dVar}, 938647139, -938647137, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a())).floatValue());
                if (dVar.k() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, dVar.k());
                }
                if (dVar.m() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindString(13, dVar.m());
                }
                supportSQLiteStatement.bindString(14, e.d(dVar.n()));
                supportSQLiteStatement.bindString(15, e.c(dVar.o()));
                if (dVar.t() == null) {
                    supportSQLiteStatement.bindNull(16);
                } else {
                    supportSQLiteStatement.bindString(16, e.a(dVar.t()));
                }
                if (dVar.r() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindString(17, dVar.r());
                }
                supportSQLiteStatement.bindLong(18, dVar.b());
                int i4 = f8522d + 39;
                f8521c = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a
    public final Completable a(final com.incode.welcome_sdk.data.local.d dVar) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.e.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8524a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8525c = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8525c + 115;
                f8524a = i4 % 128;
                if (i4 % 2 != 0) {
                    b();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Void voidB = b();
                int i5 = f8524a + 9;
                f8525c = i5 % 128;
                int i6 = i5 % 2;
                return voidB;
            }

            private Void b() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8525c + 113;
                f8524a = i4 % 128;
                int i5 = i4 % 2;
                e.this.f8508d.beginTransaction();
                try {
                    e.this.f8509e.insert(dVar);
                    e.this.f8508d.setTransactionSuccessful();
                    e.this.f8508d.endTransaction();
                    int i6 = f8524a + 109;
                    f8525c = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 19 / 0;
                    }
                    return null;
                } catch (Throwable th) {
                    e.this.f8508d.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8505f + 105;
        f8504a = i3 % 128;
        if (i3 % 2 == 0) {
            return completableFromCallable;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a
    public final Completable d(final com.incode.welcome_sdk.data.local.d dVar) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.e.2

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8514c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8515e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8515e + 59;
                f8514c = i4 % 128;
                int i5 = i4 % 2;
                Void voidD = d();
                int i6 = f8515e + 35;
                f8514c = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 8 / 0;
                }
                return voidD;
            }

            private Void d() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8514c + 89;
                f8515e = i4 % 128;
                int i5 = i4 % 2;
                e.this.f8508d.beginTransaction();
                try {
                    e.this.f8506b.handle(dVar);
                    e.this.f8508d.setTransactionSuccessful();
                    e.this.f8508d.endTransaction();
                    int i6 = f8515e + 91;
                    f8514c = i6 % 128;
                    int i7 = i6 % 2;
                    return null;
                } catch (Throwable th) {
                    e.this.f8508d.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8505f + 105;
        f8504a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
        return completableFromCallable;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a
    public final Single<List<com.incode.welcome_sdk.data.local.d>> b(List<? extends com.incode.welcome_sdk.data.local.h> list) {
        int i2 = 2 % 2;
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT * FROM face_login_attempt WHERE sync_status in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<? extends com.incode.welcome_sdk.data.local.h> it = list.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            int i4 = f8504a + 63;
            f8505f = i4 % 128;
            if (i4 % 2 == 0) {
                roomSQLiteQueryAcquire.bindString(i3, c(it.next()));
                i3 += 105;
            } else {
                roomSQLiteQueryAcquire.bindString(i3, c(it.next()));
                i3++;
            }
        }
        Single<List<com.incode.welcome_sdk.data.local.d>> singleCreateSingle = RxRoom.createSingle(new Callable<List<com.incode.welcome_sdk.data.local.d>>() { // from class: com.incode.welcome_sdk.data.local.db.c.e.1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8510d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8511e = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ List<com.incode.welcome_sdk.data.local.d> call() throws Exception {
                int i5 = 2 % 2;
                int i6 = f8510d + 43;
                f8511e = i6 % 128;
                int i7 = i6 % 2;
                List<com.incode.welcome_sdk.data.local.d> listB = b();
                int i8 = f8511e + 3;
                f8510d = i8 % 128;
                int i9 = i8 % 2;
                return listB;
            }

            private List<com.incode.welcome_sdk.data.local.d> b() throws Exception {
                String string;
                com.incode.welcome_sdk.data.local.f fVar;
                String string2;
                AnonymousClass1 anonymousClass1 = this;
                int i5 = 2 % 2;
                Cursor cursorQuery = DBUtil.query(e.this.f8508d, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "base64_frame");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_coordinates");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bitmap_width");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bitmap_height");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_recognition_confidence");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_recognition_threshold");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "liveness_confidence");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "liveness_threshold");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "brightness_level");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "blurriness_level");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "authentication_type");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "customer_id");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_auth_mode");
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_result");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "error");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        long j2 = cursorQuery.getLong(columnIndexOrThrow);
                        if (!(!cursorQuery.isNull(columnIndexOrThrow2))) {
                            int i6 = f8511e + 81;
                            f8510d = i6 % 128;
                            int i7 = i6 % 2;
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow2);
                        }
                        String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        com.incode.welcome_sdk.data.local.model.delayed_onboarding.g gVar = e.this.f8507c;
                        Map<String, Float> mapB = com.incode.welcome_sdk.data.local.model.delayed_onboarding.g.b(string3);
                        int i8 = cursorQuery.getInt(columnIndexOrThrow4);
                        int i9 = cursorQuery.getInt(columnIndexOrThrow5);
                        float f2 = cursorQuery.getFloat(columnIndexOrThrow6);
                        float f3 = cursorQuery.getFloat(columnIndexOrThrow7);
                        float f4 = cursorQuery.getFloat(columnIndexOrThrow8);
                        float f5 = cursorQuery.getFloat(columnIndexOrThrow9);
                        float f6 = cursorQuery.getFloat(columnIndexOrThrow10);
                        float f7 = cursorQuery.getFloat(columnIndexOrThrow11);
                        String string4 = cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12);
                        String string5 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                        SelfieScan.FaceAuthMode faceAuthMode = (SelfieScan.FaceAuthMode) e.e(new Object[]{cursorQuery.getString(columnIndexOrThrow14)}, b.d.e.c(), b.d.e.c(), b.d.e.c(), 1236831263, b.d.e.c(), -1236831263);
                        Cursor cursor = cursorQuery;
                        com.incode.welcome_sdk.data.local.h hVarA = e.a(cursor.getString(columnIndexOrThrow15));
                        cursorQuery = cursor;
                        if (cursorQuery.isNull(columnIndexOrThrow16)) {
                            int i10 = f8510d + 111;
                            f8511e = i10 % 128;
                            int i11 = i10 % 2;
                            fVar = null;
                        } else {
                            fVar = (com.incode.welcome_sdk.data.local.f) e.e(new Object[]{cursorQuery.getString(columnIndexOrThrow16)}, b.d.e.c(), b.d.e.c(), b.d.e.c(), -1165087850, b.d.e.c(), 1165087851);
                        }
                        if (!(!cursorQuery.isNull(columnIndexOrThrow17))) {
                            int i12 = f8510d + 29;
                            f8511e = i12 % 128;
                            int i13 = i12 % 2;
                            string2 = null;
                        } else {
                            string2 = cursorQuery.getString(columnIndexOrThrow17);
                        }
                        arrayList.add(new com.incode.welcome_sdk.data.local.d(j2, string, mapB, i8, i9, f2, f3, f4, f5, f6, f7, string4, string5, faceAuthMode, hVarA, fVar, string2));
                        anonymousClass1 = this;
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i5 = 2 % 2;
                int i6 = f8510d + 105;
                f8511e = i6 % 128;
                if (i6 % 2 != 0) {
                    roomSQLiteQueryAcquire.release();
                    int i7 = f8510d + 53;
                    f8511e = i7 % 128;
                    int i8 = i7 % 2;
                    return;
                }
                roomSQLiteQueryAcquire.release();
                throw null;
            }
        });
        int i5 = f8505f + 111;
        f8504a = i5 % 128;
        if (i5 % 2 == 0) {
            return singleCreateSingle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a
    public final Single<List<com.incode.welcome_sdk.data.local.d>> e(List<? extends com.incode.welcome_sdk.data.local.h> list, List<Long> list2) {
        int i2 = 2 % 2;
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT * FROM face_login_attempt WHERE sync_status in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(") AND id in (");
        int size2 = list2.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size2);
        sbNewStringBuilder.append(")");
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size2 + size);
        Iterator<? extends com.incode.welcome_sdk.data.local.h> it = list.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            int i4 = f8504a + 37;
            f8505f = i4 % 128;
            int i5 = i4 % 2;
            roomSQLiteQueryAcquire.bindString(i3, c(it.next()));
            i3++;
        }
        int i6 = size + 1;
        for (Long l2 : list2) {
            if (l2 == null) {
                int i7 = f8504a + 83;
                f8505f = i7 % 128;
                int i8 = i7 % 2;
                roomSQLiteQueryAcquire.bindNull(i6);
            } else {
                roomSQLiteQueryAcquire.bindLong(i6, l2.longValue());
            }
            i6++;
        }
        return RxRoom.createSingle(new Callable<List<com.incode.welcome_sdk.data.local.d>>() { // from class: com.incode.welcome_sdk.data.local.db.c.e.9

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8533a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f8534b = 1;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ List<com.incode.welcome_sdk.data.local.d> call() throws Exception {
                int i9 = 2 % 2;
                int i10 = f8534b + 123;
                f8533a = i10 % 128;
                Object obj = null;
                if (i10 % 2 != 0) {
                    d();
                    obj.hashCode();
                    throw null;
                }
                List<com.incode.welcome_sdk.data.local.d> listD = d();
                int i11 = f8533a + 25;
                f8534b = i11 % 128;
                if (i11 % 2 != 0) {
                    return listD;
                }
                obj.hashCode();
                throw null;
            }

            private List<com.incode.welcome_sdk.data.local.d> d() throws Exception {
                String string;
                String string2;
                com.incode.welcome_sdk.data.local.f fVar;
                AnonymousClass9 anonymousClass9 = this;
                int i9 = 2 % 2;
                Cursor cursorQuery = DBUtil.query(e.this.f8508d, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "base64_frame");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_coordinates");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bitmap_width");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bitmap_height");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_recognition_confidence");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_recognition_threshold");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "liveness_confidence");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "liveness_threshold");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "brightness_level");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "blurriness_level");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "authentication_type");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "customer_id");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_auth_mode");
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_result");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "error");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        int i10 = f8533a + 75;
                        f8534b = i10 % 128;
                        int i11 = i10 % 2;
                        long j2 = cursorQuery.getLong(columnIndexOrThrow);
                        String string3 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        String string4 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        com.incode.welcome_sdk.data.local.model.delayed_onboarding.g gVar = e.this.f8507c;
                        Map<String, Float> mapB = com.incode.welcome_sdk.data.local.model.delayed_onboarding.g.b(string4);
                        int i12 = cursorQuery.getInt(columnIndexOrThrow4);
                        int i13 = cursorQuery.getInt(columnIndexOrThrow5);
                        float f2 = cursorQuery.getFloat(columnIndexOrThrow6);
                        float f3 = cursorQuery.getFloat(columnIndexOrThrow7);
                        float f4 = cursorQuery.getFloat(columnIndexOrThrow8);
                        float f5 = cursorQuery.getFloat(columnIndexOrThrow9);
                        float f6 = cursorQuery.getFloat(columnIndexOrThrow10);
                        float f7 = cursorQuery.getFloat(columnIndexOrThrow11);
                        if (cursorQuery.isNull(columnIndexOrThrow12)) {
                            int i14 = f8533a + 117;
                            f8534b = i14 % 128;
                            int i15 = i14 % 2;
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow12);
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow13)) {
                            int i16 = f8533a + 59;
                            int i17 = i16 % 128;
                            f8534b = i17;
                            int i18 = i16 % 2;
                            int i19 = i17 + 69;
                            f8533a = i19 % 128;
                            if (i19 % 2 != 0) {
                                int i20 = 4 % 3;
                            }
                            string2 = null;
                        } else {
                            string2 = cursorQuery.getString(columnIndexOrThrow13);
                        }
                        SelfieScan.FaceAuthMode faceAuthMode = (SelfieScan.FaceAuthMode) e.e(new Object[]{cursorQuery.getString(columnIndexOrThrow14)}, b.d.e.c(), b.d.e.c(), b.d.e.c(), 1236831263, b.d.e.c(), -1236831263);
                        Cursor cursor = cursorQuery;
                        com.incode.welcome_sdk.data.local.h hVarA = e.a(cursor.getString(columnIndexOrThrow15));
                        cursorQuery = cursor;
                        if (cursorQuery.isNull(columnIndexOrThrow16)) {
                            fVar = null;
                        } else {
                            cursorQuery = cursorQuery;
                            fVar = (com.incode.welcome_sdk.data.local.f) e.e(new Object[]{cursorQuery.getString(columnIndexOrThrow16)}, b.d.e.c(), b.d.e.c(), b.d.e.c(), -1165087850, b.d.e.c(), 1165087851);
                        }
                        arrayList.add(new com.incode.welcome_sdk.data.local.d(j2, string3, mapB, i12, i13, f2, f3, f4, f5, f6, f7, string, string2, faceAuthMode, hVarA, fVar, cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17)));
                        anonymousClass9 = this;
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i9 = 2 % 2;
                int i10 = f8533a + 5;
                f8534b = i10 % 128;
                int i11 = i10 % 2;
                roomSQLiteQueryAcquire.release();
                int i12 = f8534b + 15;
                f8533a = i12 % 128;
                int i13 = i12 % 2;
            }
        });
    }

    public static List<Class<?>> a() {
        int i2 = 2 % 2;
        int i3 = f8505f + 117;
        f8504a = i3 % 128;
        int i4 = i3 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i5 = f8505f + 115;
        f8504a = i5 % 128;
        int i6 = i5 % 2;
        return listEmptyList;
    }

    static String d(SelfieScan.FaceAuthMode faceAuthMode) {
        int i2 = 2 % 2;
        int i3 = f8505f + 117;
        f8504a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass7.f8528a[faceAuthMode.ordinal()];
        if (i5 == 1) {
            int i6 = f8504a + 1;
            f8505f = i6 % 128;
            int i7 = i6 % 2;
            return "SERVER";
        }
        if (i5 != 2) {
            throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(String.valueOf(faceAuthMode)));
        }
        int i8 = f8505f + 25;
        f8504a = i8 % 128;
        if (i8 % 2 == 0) {
            return "LOCAL";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static String c(com.incode.welcome_sdk.data.local.h hVar) {
        int i2 = 2 % 2;
        int i3 = AnonymousClass7.f8532e[hVar.ordinal()];
        if (i3 == 1) {
            return "PENDING";
        }
        if (i3 == 2) {
            return "TEMPORARY_ERROR";
        }
        if (i3 == 3) {
            int i4 = f8505f + 3;
            f8504a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 41 / 0;
            }
            return "PERMANENT_ERROR";
        }
        if (i3 != 4) {
            throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(String.valueOf(hVar)));
        }
        int i6 = f8504a + 61;
        f8505f = i6 % 128;
        int i7 = i6 % 2;
        return "SUCCESS";
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.e$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f8529b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f8530c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f8531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f8532e;

        static {
            int[] iArr = new int[com.incode.welcome_sdk.data.local.f.values().length];
            f8531d = iArr;
            try {
                iArr[com.incode.welcome_sdk.data.local.f.f8581b.ordinal()] = 1;
                int i2 = f8529b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f8530c = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8531d[com.incode.welcome_sdk.data.local.f.f8584e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.incode.welcome_sdk.data.local.h.values().length];
            f8532e = iArr2;
            try {
                iArr2[com.incode.welcome_sdk.data.local.h.f8588b.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8532e[com.incode.welcome_sdk.data.local.h.f8590d.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8532e[com.incode.welcome_sdk.data.local.h.f8591e.ordinal()] = 3;
                int i5 = f8530c + 53;
                f8529b = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8532e[com.incode.welcome_sdk.data.local.h.f8587a.ordinal()] = 4;
                int i8 = f8529b + 115;
                f8530c = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[SelfieScan.FaceAuthMode.values().length];
            f8528a = iArr3;
            try {
                iArr3[SelfieScan.FaceAuthMode.SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8528a[SelfieScan.FaceAuthMode.LOCAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static String a(com.incode.welcome_sdk.data.local.f fVar) {
        int i2 = 2 % 2;
        int i3 = AnonymousClass7.f8531d[fVar.ordinal()];
        if (i3 == 1) {
            int i4 = f8505f + 69;
            f8504a = i4 % 128;
            if (i4 % 2 == 0) {
                return "SUCCESS";
            }
            throw null;
        }
        if (i3 != 2) {
            throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(String.valueOf(fVar)));
        }
        int i5 = f8505f + 81;
        f8504a = i5 % 128;
        int i6 = i5 % 2;
        return "ERROR";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object d(java.lang.Object[] r6) {
        /*
            r5 = 0
            r4 = r6[r5]
            java.lang.String r4 = (java.lang.String) r4
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.data.local.db.c.e.f8504a
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.e.f8505f = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L5b
            int r3 = r4.hashCode()
            r0 = -1852497085(0xffffffff91952343, float:-2.3529787E-28)
            r1 = -1
            r2 = 1
            if (r3 == r0) goto L35
            r0 = 72607563(0x453e74b, float:2.4909135E-36)
            if (r3 == r0) goto L2b
        L23:
            r5 = r1
        L24:
            if (r5 == 0) goto L58
            if (r5 != r2) goto L48
            com.incode.welcome_sdk.modules.SelfieScan$FaceAuthMode r0 = com.incode.welcome_sdk.modules.SelfieScan.FaceAuthMode.LOCAL
            return r0
        L2b:
            java.lang.String r0 = "LOCAL"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L23
            r5 = r2
            goto L24
        L35:
            java.lang.String r0 = "SERVER"
            boolean r0 = r4.equals(r0)
            r0 = r0 ^ r2
            if (r0 == r2) goto L23
            int r0 = com.incode.welcome_sdk.data.local.db.c.e.f8504a
            int r1 = r0 + 59
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.e.f8505f = r0
            int r1 = r1 % r6
            goto L24
        L48:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't convert value to enum, unknown value: "
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r1.concat(r0)
            r2.<init>(r0)
            throw r2
        L58:
            com.incode.welcome_sdk.modules.SelfieScan$FaceAuthMode r0 = com.incode.welcome_sdk.modules.SelfieScan.FaceAuthMode.SERVER
            return r0
        L5b:
            r4.hashCode()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.e.d(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.incode.welcome_sdk.data.local.h a(java.lang.String r6) {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.data.local.db.c.e.f8504a
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.e.f8505f = r0
            int r1 = r1 % r4
            int r0 = r6.hashCode()
            r3 = 3
            r2 = 1
            switch(r0) {
                case -2032566537: goto L21;
                case -1452891558: goto L34;
                case -1149187101: goto L46;
                case 35394935: goto L64;
                default: goto L15;
            }
        L15:
            r5 = -1
        L16:
            if (r5 == 0) goto L91
            if (r5 == r2) goto L8e
            if (r5 == r4) goto L8b
            if (r5 != r3) goto L7b
            com.incode.welcome_sdk.data.local.h r0 = com.incode.welcome_sdk.data.local.h.f8587a
            return r0
        L21:
            java.lang.String r0 = "PERMANENT_ERROR"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L15
            int r0 = com.incode.welcome_sdk.data.local.db.c.e.f8505f
            int r1 = r0 + 31
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.e.f8504a = r0
            int r1 = r1 % r4
            r5 = r4
            goto L16
        L34:
            java.lang.String r0 = "TEMPORARY_ERROR"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L15
            int r0 = com.incode.welcome_sdk.data.local.db.c.e.f8505f
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.e.f8504a = r0
            int r1 = r1 % r4
            goto L77
        L46:
            java.lang.String r0 = "SUCCESS"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L15
            int r0 = com.incode.welcome_sdk.data.local.db.c.e.f8505f
            int r1 = r0 + 95
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.e.f8504a = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L62
            r5 = 5
        L5a:
            int r1 = r0 + 97
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.e.f8505f = r0
            int r1 = r1 % r4
            goto L16
        L62:
            r5 = r3
            goto L5a
        L64:
            java.lang.String r0 = "PENDING"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L15
            int r0 = com.incode.welcome_sdk.data.local.db.c.e.f8504a
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.db.c.e.f8505f = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L79
        L77:
            r5 = r2
            goto L16
        L79:
            r5 = 0
            goto L16
        L7b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't convert value to enum, unknown value: "
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r0 = r1.concat(r0)
            r2.<init>(r0)
            throw r2
        L8b:
            com.incode.welcome_sdk.data.local.h r0 = com.incode.welcome_sdk.data.local.h.f8591e
            return r0
        L8e:
            com.incode.welcome_sdk.data.local.h r0 = com.incode.welcome_sdk.data.local.h.f8590d
            return r0
        L91:
            com.incode.welcome_sdk.data.local.h r0 = com.incode.welcome_sdk.data.local.h.f8588b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.e.a(java.lang.String):com.incode.welcome_sdk.data.local.h");
    }

    static com.incode.welcome_sdk.data.local.f d(String str) {
        return (com.incode.welcome_sdk.data.local.f) e(new Object[]{str}, b.d.e.c(), b.d.e.c(), b.d.e.c(), -1165087850, b.d.e.c(), 1165087851);
    }

    static SelfieScan.FaceAuthMode e(String str) {
        return (SelfieScan.FaceAuthMode) e(new Object[]{str}, b.d.e.c(), b.d.e.c(), b.d.e.c(), 1236831263, b.d.e.c(), -1236831263);
    }
}
