package com.incode.welcome_sdk.data.local.db.c;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.local.FaceInfo;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements b {

    /* JADX INFO: renamed from: c */
    private static int f8457c = 0;

    /* JADX INFO: renamed from: g */
    private static int f8458g = 1;

    /* JADX INFO: renamed from: a */
    final SharedSQLiteStatement f8459a;

    /* JADX INFO: renamed from: b */
    final RoomDatabase f8460b;

    /* JADX INFO: renamed from: d */
    final SharedSQLiteStatement f8461d;

    /* JADX INFO: renamed from: e */
    final EntityInsertionAdapter<FaceInfo> f8462e;

    public d(RoomDatabase roomDatabase) {
        this.f8460b = roomDatabase;
        this.f8462e = new EntityInsertionAdapter<FaceInfo>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.d.2

            /* JADX INFO: renamed from: a */
            private static int f8473a = 0;

            /* JADX INFO: renamed from: c */
            private static int f8474c = 1;

            AnonymousClass2(RoomDatabase roomDatabase2) {
                super(roomDatabase2);
            }

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, FaceInfo faceInfo) {
                int i2 = 2 % 2;
                int i3 = f8474c + 105;
                f8473a = i3 % 128;
                int i4 = i3 % 2;
                e(supportSQLiteStatement, faceInfo);
                int i5 = f8474c + 67;
                f8473a = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 11 / 0;
                }
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8473a;
                int i4 = i3 + 111;
                f8474c = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 53 / 0;
                }
                int i6 = i3 + 107;
                f8474c = i6 % 128;
                if (i6 % 2 != 0) {
                    return "INSERT OR REPLACE INTO `face_info_table` (`face_info_id`,`template_id`,`face_template`,`customer_uuid`) VALUES (nullif(?, 0),?,?,?)";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void e(SupportSQLiteStatement supportSQLiteStatement, FaceInfo faceInfo) {
                int i2 = 2 % 2;
                supportSQLiteStatement.bindLong(1, faceInfo.getFaceInfoId());
                if (faceInfo.getTemplateId() == null) {
                    int i3 = f8474c + 55;
                    f8473a = i3 % 128;
                    int i4 = i3 % 2;
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, faceInfo.getTemplateId());
                }
                if (faceInfo.getFaceTemplate() == null) {
                    int i5 = f8473a + 37;
                    f8474c = i5 % 128;
                    int i6 = i5 % 2;
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, faceInfo.getFaceTemplate());
                    int i7 = f8474c + 67;
                    f8473a = i7 % 128;
                    int i8 = i7 % 2;
                }
                if (faceInfo.getCustomerUUID() != null) {
                    supportSQLiteStatement.bindString(4, faceInfo.getCustomerUUID());
                    return;
                }
                int i9 = f8474c + 49;
                f8473a = i9 % 128;
                if (i9 % 2 != 0) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindNull(4);
                }
            }
        };
        this.f8459a = new SharedSQLiteStatement(roomDatabase2) { // from class: com.incode.welcome_sdk.data.local.db.c.d.5

            /* JADX INFO: renamed from: a */
            private static int f8486a = 1;

            /* JADX INFO: renamed from: e */
            private static int f8487e = 0;

            AnonymousClass5(RoomDatabase roomDatabase2) {
                super(roomDatabase2);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8486a;
                int i4 = i3 + 51;
                f8487e = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = i3 + 7;
                f8487e = i5 % 128;
                if (i5 % 2 == 0) {
                    return "DELETE FROM face_info_table WHERE customer_uuid = ?";
                }
                throw null;
            }
        };
        this.f8461d = new SharedSQLiteStatement(roomDatabase2) { // from class: com.incode.welcome_sdk.data.local.db.c.d.1

            /* JADX INFO: renamed from: d */
            private static int f8463d = 0;

            /* JADX INFO: renamed from: e */
            private static int f8464e = 1;

            AnonymousClass1(RoomDatabase roomDatabase2) {
                super(roomDatabase2);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8464e + 123;
                int i4 = i3 % 128;
                f8463d = i4;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i5 = i4 + 23;
                f8464e = i5 % 128;
                int i6 = i5 % 2;
                return "DELETE FROM face_info_table";
            }
        };
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.d$2 */
    final class AnonymousClass2 extends EntityInsertionAdapter<FaceInfo> {

        /* JADX INFO: renamed from: a */
        private static int f8473a = 0;

        /* JADX INFO: renamed from: c */
        private static int f8474c = 1;

        AnonymousClass2(RoomDatabase roomDatabase2) {
            super(roomDatabase2);
        }

        @Override // androidx.room.EntityInsertionAdapter
        protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, FaceInfo faceInfo) {
            int i2 = 2 % 2;
            int i3 = f8474c + 105;
            f8473a = i3 % 128;
            int i4 = i3 % 2;
            e(supportSQLiteStatement, faceInfo);
            int i5 = f8474c + 67;
            f8473a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 11 / 0;
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected final String createQuery() {
            int i2 = 2 % 2;
            int i3 = f8473a;
            int i4 = i3 + 111;
            f8474c = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 53 / 0;
            }
            int i6 = i3 + 107;
            f8474c = i6 % 128;
            if (i6 % 2 != 0) {
                return "INSERT OR REPLACE INTO `face_info_table` (`face_info_id`,`template_id`,`face_template`,`customer_uuid`) VALUES (nullif(?, 0),?,?,?)";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void e(SupportSQLiteStatement supportSQLiteStatement, FaceInfo faceInfo) {
            int i2 = 2 % 2;
            supportSQLiteStatement.bindLong(1, faceInfo.getFaceInfoId());
            if (faceInfo.getTemplateId() == null) {
                int i3 = f8474c + 55;
                f8473a = i3 % 128;
                int i4 = i3 % 2;
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, faceInfo.getTemplateId());
            }
            if (faceInfo.getFaceTemplate() == null) {
                int i5 = f8473a + 37;
                f8474c = i5 % 128;
                int i6 = i5 % 2;
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, faceInfo.getFaceTemplate());
                int i7 = f8474c + 67;
                f8473a = i7 % 128;
                int i8 = i7 % 2;
            }
            if (faceInfo.getCustomerUUID() != null) {
                supportSQLiteStatement.bindString(4, faceInfo.getCustomerUUID());
                return;
            }
            int i9 = f8474c + 49;
            f8473a = i9 % 128;
            if (i9 % 2 != 0) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindNull(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.d$5 */
    final class AnonymousClass5 extends SharedSQLiteStatement {

        /* JADX INFO: renamed from: a */
        private static int f8486a = 1;

        /* JADX INFO: renamed from: e */
        private static int f8487e = 0;

        AnonymousClass5(RoomDatabase roomDatabase2) {
            super(roomDatabase2);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            int i2 = 2 % 2;
            int i3 = f8486a;
            int i4 = i3 + 51;
            f8487e = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = i3 + 7;
            f8487e = i5 % 128;
            if (i5 % 2 == 0) {
                return "DELETE FROM face_info_table WHERE customer_uuid = ?";
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.d$1 */
    final class AnonymousClass1 extends SharedSQLiteStatement {

        /* JADX INFO: renamed from: d */
        private static int f8463d = 0;

        /* JADX INFO: renamed from: e */
        private static int f8464e = 1;

        AnonymousClass1(RoomDatabase roomDatabase2) {
            super(roomDatabase2);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            int i2 = 2 % 2;
            int i3 = f8464e + 123;
            int i4 = i3 % 128;
            f8463d = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 23;
            f8464e = i5 % 128;
            int i6 = i5 % 2;
            return "DELETE FROM face_info_table";
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.d$8 */
    final class AnonymousClass8 implements Callable<Void> {

        /* JADX INFO: renamed from: d */
        private static int f8496d = 1;

        /* JADX INFO: renamed from: e */
        private static int f8497e = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ FaceInfo f8499b;

        AnonymousClass8(FaceInfo faceInfo) {
            faceInfo = faceInfo;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8496d + 97;
            f8497e = i3 % 128;
            int i4 = i3 % 2;
            Void voidE = e();
            int i5 = f8497e + 115;
            f8496d = i5 % 128;
            int i6 = i5 % 2;
            return voidE;
        }

        private Void e() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8496d + 57;
            f8497e = i3 % 128;
            int i4 = i3 % 2;
            d.this.f8460b.beginTransaction();
            try {
                d.this.f8462e.insert(faceInfo);
                d.this.f8460b.setTransactionSuccessful();
                d.this.f8460b.endTransaction();
                int i5 = f8497e + 21;
                f8496d = i5 % 128;
                int i6 = i5 % 2;
                return null;
            } catch (Throwable th) {
                d.this.f8460b.endTransaction();
                throw th;
            }
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.b
    public final Completable d(FaceInfo faceInfo) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.d.8

            /* JADX INFO: renamed from: d */
            private static int f8496d = 1;

            /* JADX INFO: renamed from: e */
            private static int f8497e = 0;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ FaceInfo f8499b;

            AnonymousClass8(FaceInfo faceInfo2) {
                faceInfo = faceInfo2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8496d + 97;
                f8497e = i3 % 128;
                int i4 = i3 % 2;
                Void voidE = e();
                int i5 = f8497e + 115;
                f8496d = i5 % 128;
                int i6 = i5 % 2;
                return voidE;
            }

            private Void e() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8496d + 57;
                f8497e = i3 % 128;
                int i4 = i3 % 2;
                d.this.f8460b.beginTransaction();
                try {
                    d.this.f8462e.insert(faceInfo);
                    d.this.f8460b.setTransactionSuccessful();
                    d.this.f8460b.endTransaction();
                    int i5 = f8497e + 21;
                    f8496d = i5 % 128;
                    int i6 = i5 % 2;
                    return null;
                } catch (Throwable th) {
                    d.this.f8460b.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8458g + 91;
        f8457c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 24 / 0;
        }
        return completableFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.d$9 */
    final class AnonymousClass9 implements Callable<Void> {

        /* JADX INFO: renamed from: c */
        private static int f8500c = 0;

        /* JADX INFO: renamed from: d */
        private static int f8501d = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ List f8503b;

        AnonymousClass9(List list) {
            list = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8501d + 5;
            f8500c = i3 % 128;
            int i4 = i3 % 2;
            Void voidA = a();
            int i5 = f8500c + 75;
            f8501d = i5 % 128;
            if (i5 % 2 != 0) {
                return voidA;
            }
            throw null;
        }

        private Void a() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8500c + 11;
            f8501d = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    d.this.f8460b.beginTransaction();
                    d.this.f8462e.insert(list);
                    d.this.f8460b.setTransactionSuccessful();
                    return null;
                }
                d.this.f8460b.beginTransaction();
                d.this.f8462e.insert(list);
                d.this.f8460b.setTransactionSuccessful();
                throw null;
            } finally {
                d.this.f8460b.endTransaction();
            }
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.b
    public final Completable e(List<FaceInfo> list) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.d.9

            /* JADX INFO: renamed from: c */
            private static int f8500c = 0;

            /* JADX INFO: renamed from: d */
            private static int f8501d = 1;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ List f8503b;

            AnonymousClass9(List list2) {
                list = list2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8501d + 5;
                f8500c = i3 % 128;
                int i4 = i3 % 2;
                Void voidA = a();
                int i5 = f8500c + 75;
                f8501d = i5 % 128;
                if (i5 % 2 != 0) {
                    return voidA;
                }
                throw null;
            }

            private Void a() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8500c + 11;
                f8501d = i3 % 128;
                try {
                    if (i3 % 2 != 0) {
                        d.this.f8460b.beginTransaction();
                        d.this.f8462e.insert(list);
                        d.this.f8460b.setTransactionSuccessful();
                        return null;
                    }
                    d.this.f8460b.beginTransaction();
                    d.this.f8462e.insert(list);
                    d.this.f8460b.setTransactionSuccessful();
                    throw null;
                } finally {
                    d.this.f8460b.endTransaction();
                }
            }
        });
        int i3 = f8457c + 121;
        f8458g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 60 / 0;
        }
        return completableFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.d$7 */
    final class AnonymousClass7 implements Callable<Void> {

        /* JADX INFO: renamed from: c */
        private static int f8492c = 1;

        /* JADX INFO: renamed from: d */
        private static int f8493d = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ String f8495b;

        AnonymousClass7(String str) {
            str = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8493d + 75;
            f8492c = i3 % 128;
            if (i3 % 2 != 0) {
                return e();
            }
            e();
            throw null;
        }

        private Void e() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8493d + 111;
            f8492c = i3 % 128;
            int i4 = i3 % 2;
            SupportSQLiteStatement supportSQLiteStatementAcquire = d.this.f8459a.acquire();
            String str = str;
            if (str == null) {
                int i5 = f8493d + 39;
                f8492c = i5 % 128;
                if (i5 % 2 == 0) {
                    supportSQLiteStatementAcquire.bindNull(0);
                } else {
                    supportSQLiteStatementAcquire.bindNull(1);
                }
                int i6 = f8492c + 31;
                f8493d = i6 % 128;
                int i7 = i6 % 2;
            } else {
                supportSQLiteStatementAcquire.bindString(1, str);
            }
            try {
                d.this.f8460b.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    d.this.f8460b.setTransactionSuccessful();
                    d.this.f8459a.release(supportSQLiteStatementAcquire);
                    return null;
                } finally {
                    d.this.f8460b.endTransaction();
                }
            } catch (Throwable th) {
                d.this.f8459a.release(supportSQLiteStatementAcquire);
                throw th;
            }
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.b
    public final Completable e(String str) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.d.7

            /* JADX INFO: renamed from: c */
            private static int f8492c = 1;

            /* JADX INFO: renamed from: d */
            private static int f8493d = 0;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ String f8495b;

            AnonymousClass7(String str2) {
                str = str2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8493d + 75;
                f8492c = i3 % 128;
                if (i3 % 2 != 0) {
                    return e();
                }
                e();
                throw null;
            }

            private Void e() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8493d + 111;
                f8492c = i3 % 128;
                int i4 = i3 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = d.this.f8459a.acquire();
                String str2 = str;
                if (str2 == null) {
                    int i5 = f8493d + 39;
                    f8492c = i5 % 128;
                    if (i5 % 2 == 0) {
                        supportSQLiteStatementAcquire.bindNull(0);
                    } else {
                        supportSQLiteStatementAcquire.bindNull(1);
                    }
                    int i6 = f8492c + 31;
                    f8493d = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    supportSQLiteStatementAcquire.bindString(1, str2);
                }
                try {
                    d.this.f8460b.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        d.this.f8460b.setTransactionSuccessful();
                        d.this.f8459a.release(supportSQLiteStatementAcquire);
                        return null;
                    } finally {
                        d.this.f8460b.endTransaction();
                    }
                } catch (Throwable th) {
                    d.this.f8459a.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8457c + 17;
        f8458g = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.d$6 */
    final class AnonymousClass6 implements Callable<Void> {

        /* JADX INFO: renamed from: d */
        private static int f8489d = 1;

        /* JADX INFO: renamed from: e */
        private static int f8490e = 0;

        AnonymousClass6() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8489d + 91;
            f8490e = i3 % 128;
            int i4 = i3 % 2;
            Void voidA = a();
            int i5 = f8490e + 75;
            f8489d = i5 % 128;
            if (i5 % 2 != 0) {
                return voidA;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Void a() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8489d + 123;
            f8490e = i3 % 128;
            int i4 = i3 % 2;
            SupportSQLiteStatement supportSQLiteStatementAcquire = d.this.f8461d.acquire();
            try {
                d.this.f8460b.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    d.this.f8460b.setTransactionSuccessful();
                    d.this.f8461d.release(supportSQLiteStatementAcquire);
                    int i5 = f8489d + 105;
                    f8490e = i5 % 128;
                    int i6 = i5 % 2;
                    return null;
                } finally {
                    d.this.f8460b.endTransaction();
                }
            } catch (Throwable th) {
                d.this.f8461d.release(supportSQLiteStatementAcquire);
                throw th;
            }
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.b
    public final Completable d() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.d.6

            /* JADX INFO: renamed from: d */
            private static int f8489d = 1;

            /* JADX INFO: renamed from: e */
            private static int f8490e = 0;

            AnonymousClass6() {
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8489d + 91;
                f8490e = i3 % 128;
                int i4 = i3 % 2;
                Void voidA = a();
                int i5 = f8490e + 75;
                f8489d = i5 % 128;
                if (i5 % 2 != 0) {
                    return voidA;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private Void a() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8489d + 123;
                f8490e = i3 % 128;
                int i4 = i3 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = d.this.f8461d.acquire();
                try {
                    d.this.f8460b.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        d.this.f8460b.setTransactionSuccessful();
                        d.this.f8461d.release(supportSQLiteStatementAcquire);
                        int i5 = f8489d + 105;
                        f8490e = i5 % 128;
                        int i6 = i5 % 2;
                        return null;
                    } finally {
                        d.this.f8460b.endTransaction();
                    }
                } catch (Throwable th) {
                    d.this.f8461d.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8458g + 67;
        f8457c = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.d$10 */
    final class AnonymousClass10 implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        private static int f8466a = 1;

        /* JADX INFO: renamed from: b */
        private static int f8467b = 0;

        AnonymousClass10() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8466a + 37;
            f8467b = i3 % 128;
            int i4 = i3 % 2;
            Void voidD = d();
            int i5 = f8467b + 115;
            f8466a = i5 % 128;
            if (i5 % 2 != 0) {
                return voidD;
            }
            throw null;
        }

        private Void d() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8467b + 45;
            f8466a = i3 % 128;
            int i4 = i3 % 2;
            SupportSQLiteStatement supportSQLiteStatementAcquire = d.this.f8461d.acquire();
            try {
                d.this.f8460b.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    d.this.f8460b.setTransactionSuccessful();
                    d.this.f8461d.release(supportSQLiteStatementAcquire);
                    int i5 = f8466a + 67;
                    f8467b = i5 % 128;
                    int i6 = i5 % 2;
                    return null;
                } finally {
                    d.this.f8460b.endTransaction();
                }
            } catch (Throwable th) {
                d.this.f8461d.release(supportSQLiteStatementAcquire);
                throw th;
            }
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.b
    public final Completable e() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.d.10

            /* JADX INFO: renamed from: a */
            private static int f8466a = 1;

            /* JADX INFO: renamed from: b */
            private static int f8467b = 0;

            AnonymousClass10() {
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8466a + 37;
                f8467b = i3 % 128;
                int i4 = i3 % 2;
                Void voidD = d();
                int i5 = f8467b + 115;
                f8466a = i5 % 128;
                if (i5 % 2 != 0) {
                    return voidD;
                }
                throw null;
            }

            private Void d() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8467b + 45;
                f8466a = i3 % 128;
                int i4 = i3 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = d.this.f8461d.acquire();
                try {
                    d.this.f8460b.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        d.this.f8460b.setTransactionSuccessful();
                        d.this.f8461d.release(supportSQLiteStatementAcquire);
                        int i5 = f8466a + 67;
                        f8467b = i5 % 128;
                        int i6 = i5 % 2;
                        return null;
                    } finally {
                        d.this.f8460b.endTransaction();
                    }
                } catch (Throwable th) {
                    d.this.f8461d.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8457c + 87;
        f8458g = i3 % 128;
        if (i3 % 2 != 0) {
            return completableFromCallable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.d$13 */
    final class AnonymousClass13 implements Callable<List<FaceInfo>> {

        /* JADX INFO: renamed from: a */
        private static int f8469a = 1;

        /* JADX INFO: renamed from: b */
        private static int f8470b = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ RoomSQLiteQuery f8471c;

        AnonymousClass13(RoomSQLiteQuery roomSQLiteQuery) {
            roomSQLiteQuery = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ List<FaceInfo> call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8469a + 117;
            f8470b = i3 % 128;
            if (i3 % 2 == 0) {
                return c();
            }
            c();
            throw null;
        }

        private List<FaceInfo> c() throws Exception {
            String string;
            String string2;
            int i2 = 2 % 2;
            Cursor cursorQuery = DBUtil.query(d.this.f8460b, roomSQLiteQuery, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_info_id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "template_id");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_template");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "customer_uuid");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    long j2 = cursorQuery.getLong(columnIndexOrThrow);
                    if (cursorQuery.isNull(columnIndexOrThrow2)) {
                        int i3 = f8469a + 79;
                        f8470b = i3 % 128;
                        int i4 = i3 % 2;
                        string = null;
                    } else {
                        string = cursorQuery.getString(columnIndexOrThrow2);
                    }
                    if (cursorQuery.isNull(columnIndexOrThrow3)) {
                        int i5 = f8469a + 121;
                        f8470b = i5 % 128;
                        int i6 = i5 % 2;
                        string2 = null;
                    } else {
                        string2 = cursorQuery.getString(columnIndexOrThrow3);
                        int i7 = f8470b + 91;
                        f8469a = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    arrayList.add(new FaceInfo(j2, string, string2, cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4)));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        protected final void finalize() {
            int i2 = 2 % 2;
            int i3 = f8469a + 55;
            f8470b = i3 % 128;
            int i4 = i3 % 2;
            roomSQLiteQuery.release();
            int i5 = f8469a + 83;
            f8470b = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.b
    public final Maybe<List<FaceInfo>> b() {
        int i2 = 2 % 2;
        Maybe<List<FaceInfo>> maybeFromCallable = Maybe.fromCallable(new Callable<List<FaceInfo>>() { // from class: com.incode.welcome_sdk.data.local.db.c.d.13

            /* JADX INFO: renamed from: a */
            private static int f8469a = 1;

            /* JADX INFO: renamed from: b */
            private static int f8470b = 0;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ RoomSQLiteQuery f8471c;

            AnonymousClass13(RoomSQLiteQuery roomSQLiteQuery) {
                roomSQLiteQuery = roomSQLiteQuery;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ List<FaceInfo> call() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8469a + 117;
                f8470b = i3 % 128;
                if (i3 % 2 == 0) {
                    return c();
                }
                c();
                throw null;
            }

            private List<FaceInfo> c() throws Exception {
                String string;
                String string2;
                int i22 = 2 % 2;
                Cursor cursorQuery = DBUtil.query(d.this.f8460b, roomSQLiteQuery, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_info_id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "template_id");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_template");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "customer_uuid");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        long j2 = cursorQuery.getLong(columnIndexOrThrow);
                        if (cursorQuery.isNull(columnIndexOrThrow2)) {
                            int i3 = f8469a + 79;
                            f8470b = i3 % 128;
                            int i4 = i3 % 2;
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow2);
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow3)) {
                            int i5 = f8469a + 121;
                            f8470b = i5 % 128;
                            int i6 = i5 % 2;
                            string2 = null;
                        } else {
                            string2 = cursorQuery.getString(columnIndexOrThrow3);
                            int i7 = f8470b + 91;
                            f8469a = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        arrayList.add(new FaceInfo(j2, string, string2, cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4)));
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i22 = 2 % 2;
                int i3 = f8469a + 55;
                f8470b = i3 % 128;
                int i4 = i3 % 2;
                roomSQLiteQuery.release();
                int i5 = f8469a + 83;
                f8470b = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i3 = f8458g + 39;
        f8457c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 42 / 0;
        }
        return maybeFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.d$4 */
    final class AnonymousClass4 implements Callable<List<FaceInfo>> {

        /* JADX INFO: renamed from: b */
        private static int f8482b = 1;

        /* JADX INFO: renamed from: e */
        private static int f8483e = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ RoomSQLiteQuery f8485d;

        AnonymousClass4(RoomSQLiteQuery roomSQLiteQuery) {
            roomSQLiteQuery = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ List<FaceInfo> call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8483e + 41;
            f8482b = i3 % 128;
            int i4 = i3 % 2;
            List<FaceInfo> listD = d();
            int i5 = f8483e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f8482b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 94 / 0;
            }
            return listD;
        }

        private List<FaceInfo> d() throws Exception {
            String string;
            String string2;
            String string3;
            int i2 = 2 % 2;
            Object obj = null;
            Cursor cursorQuery = DBUtil.query(d.this.f8460b, roomSQLiteQuery, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_info_id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "template_id");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_template");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "customer_uuid");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i3 = f8483e + 87;
                    f8482b = i3 % 128;
                    if (i3 % 2 == 0) {
                        cursorQuery.getLong(columnIndexOrThrow);
                        cursorQuery.isNull(columnIndexOrThrow2);
                        obj.hashCode();
                        throw null;
                    }
                    long j2 = cursorQuery.getLong(columnIndexOrThrow);
                    if (cursorQuery.isNull(columnIndexOrThrow2)) {
                        string = null;
                    } else {
                        string = cursorQuery.getString(columnIndexOrThrow2);
                        int i4 = f8482b + 13;
                        f8483e = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    if (cursorQuery.isNull(columnIndexOrThrow3)) {
                        int i6 = f8483e + 81;
                        f8482b = i6 % 128;
                        int i7 = i6 % 2;
                        string2 = null;
                    } else {
                        string2 = cursorQuery.getString(columnIndexOrThrow3);
                    }
                    if (cursorQuery.isNull(columnIndexOrThrow4)) {
                        string3 = null;
                    } else {
                        string3 = cursorQuery.getString(columnIndexOrThrow4);
                        int i8 = f8482b + 59;
                        f8483e = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    arrayList.add(new FaceInfo(j2, string, string2, string3));
                    int i10 = f8483e + 15;
                    f8482b = i10 % 128;
                    int i11 = i10 % 2;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        protected final void finalize() {
            int i2 = 2 % 2;
            int i3 = f8482b + 13;
            f8483e = i3 % 128;
            if (i3 % 2 == 0) {
                roomSQLiteQuery.release();
                return;
            }
            roomSQLiteQuery.release();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.b
    public final Maybe<List<FaceInfo>> d(String str) {
        int i2 = 2 % 2;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM face_info_table WHERE customer_uuid = ?", 1);
        if (str != null) {
            roomSQLiteQueryAcquire.bindString(1, str);
        } else {
            int i3 = f8458g + 59;
            f8457c = i3 % 128;
            int i4 = i3 % 2;
            roomSQLiteQueryAcquire.bindNull(1);
        }
        Maybe<List<FaceInfo>> maybeFromCallable = Maybe.fromCallable(new Callable<List<FaceInfo>>() { // from class: com.incode.welcome_sdk.data.local.db.c.d.4

            /* JADX INFO: renamed from: b */
            private static int f8482b = 1;

            /* JADX INFO: renamed from: e */
            private static int f8483e = 0;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ RoomSQLiteQuery f8485d;

            AnonymousClass4(RoomSQLiteQuery roomSQLiteQueryAcquire2) {
                roomSQLiteQuery = roomSQLiteQueryAcquire2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ List<FaceInfo> call() throws Exception {
                int i22 = 2 % 2;
                int i32 = f8483e + 41;
                f8482b = i32 % 128;
                int i42 = i32 % 2;
                List<FaceInfo> listD = d();
                int i5 = f8483e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f8482b = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 94 / 0;
                }
                return listD;
            }

            private List<FaceInfo> d() throws Exception {
                String string;
                String string2;
                String string3;
                int i22 = 2 % 2;
                Object obj = null;
                Cursor cursorQuery = DBUtil.query(d.this.f8460b, roomSQLiteQuery, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_info_id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "template_id");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "face_template");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "customer_uuid");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        int i32 = f8483e + 87;
                        f8482b = i32 % 128;
                        if (i32 % 2 == 0) {
                            cursorQuery.getLong(columnIndexOrThrow);
                            cursorQuery.isNull(columnIndexOrThrow2);
                            obj.hashCode();
                            throw null;
                        }
                        long j2 = cursorQuery.getLong(columnIndexOrThrow);
                        if (cursorQuery.isNull(columnIndexOrThrow2)) {
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow2);
                            int i42 = f8482b + 13;
                            f8483e = i42 % 128;
                            int i5 = i42 % 2;
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow3)) {
                            int i6 = f8483e + 81;
                            f8482b = i6 % 128;
                            int i7 = i6 % 2;
                            string2 = null;
                        } else {
                            string2 = cursorQuery.getString(columnIndexOrThrow3);
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow4)) {
                            string3 = null;
                        } else {
                            string3 = cursorQuery.getString(columnIndexOrThrow4);
                            int i8 = f8482b + 59;
                            f8483e = i8 % 128;
                            int i9 = i8 % 2;
                        }
                        arrayList.add(new FaceInfo(j2, string, string2, string3));
                        int i10 = f8483e + 15;
                        f8482b = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i22 = 2 % 2;
                int i32 = f8482b + 13;
                f8483e = i32 % 128;
                if (i32 % 2 == 0) {
                    roomSQLiteQuery.release();
                    return;
                }
                roomSQLiteQuery.release();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i5 = f8458g + 55;
        f8457c = i5 % 128;
        int i6 = i5 % 2;
        return maybeFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.d$3 */
    public class AnonymousClass3 implements Callable<String> {

        /* JADX INFO: renamed from: a */
        public static int f8476a = 0;

        /* JADX INFO: renamed from: d */
        public static int f8477d = 0;

        /* JADX INFO: renamed from: e */
        private static int f8478e = 0;

        /* JADX INFO: renamed from: f */
        private static int f8479f = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ RoomSQLiteQuery f8480b;

        AnonymousClass3(RoomSQLiteQuery roomSQLiteQuery) {
            this.f8480b = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ String call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8478e + 93;
            f8479f = i3 % 128;
            int i4 = i3 % 2;
            String strC = c();
            int i5 = f8478e + 109;
            f8479f = i5 % 128;
            if (i5 % 2 != 0) {
                return strC;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.String c() throws java.lang.Exception {
            /*
                r6 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.data.local.db.c.d.AnonymousClass3.f8479f
                int r1 = r0 + 43
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.db.c.d.AnonymousClass3.f8478e = r0
                int r1 = r1 % r5
                r4 = 0
                r3 = 0
                if (r1 == 0) goto L21
                com.incode.welcome_sdk.data.local.db.c.d r0 = com.incode.welcome_sdk.data.local.db.c.d.this
                androidx.room.RoomDatabase r1 = r0.f8460b
                androidx.room.RoomSQLiteQuery r0 = r6.f8480b
                android.database.Cursor r2 = androidx.room.util.DBUtil.query(r1, r0, r3, r4)
                boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L53
                if (r0 == 0) goto L46
                goto L33
            L21:
                com.incode.welcome_sdk.data.local.db.c.d r0 = com.incode.welcome_sdk.data.local.db.c.d.this
                androidx.room.RoomDatabase r1 = r0.f8460b
                androidx.room.RoomSQLiteQuery r0 = r6.f8480b
                android.database.Cursor r2 = androidx.room.util.DBUtil.query(r1, r0, r3, r4)
                boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L53
                r0 = 1
                r1 = r1 ^ r0
                if (r1 == r0) goto L46
            L33:
                boolean r0 = r2.isNull(r3)     // Catch: java.lang.Throwable -> L53
                if (r0 != 0) goto L46
                int r0 = com.incode.welcome_sdk.data.local.db.c.d.AnonymousClass3.f8478e
                int r1 = r0 + 75
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.db.c.d.AnonymousClass3.f8479f = r0
                int r1 = r1 % r5
                java.lang.String r4 = r2.getString(r3)     // Catch: java.lang.Throwable -> L53
            L46:
                r2.close()
                int r0 = com.incode.welcome_sdk.data.local.db.c.d.AnonymousClass3.f8479f
                int r1 = r0 + 49
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.db.c.d.AnonymousClass3.f8478e = r0
                int r1 = r1 % r5
                return r4
            L53:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.db.c.d.AnonymousClass3.c():java.lang.String");
        }

        protected final void finalize() {
            int i2 = 2 % 2;
            int i3 = f8478e + 89;
            f8479f = i3 % 128;
            int i4 = i3 % 2;
            this.f8480b.release();
            int i5 = f8479f + 5;
            f8478e = i5 % 128;
            int i6 = i5 % 2;
        }

        public static int b() {
            int i2 = f8477d;
            int i3 = i2 % 9030439;
            f8477d = i2 + 1;
            if (i3 != 0) {
                return f8476a;
            }
            int iNextInt = new Random().nextInt(1419682444);
            f8476a = iNextInt;
            return iNextInt;
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.b
    public final Maybe<String> a(String str) {
        int i2 = 2 % 2;
        int i3 = f8458g + 99;
        f8457c = i3 % 128;
        int i4 = i3 % 2;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT customer_uuid FROM face_info_table WHERE template_id = ?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        Maybe<String> maybeFromCallable = Maybe.fromCallable(new AnonymousClass3(roomSQLiteQueryAcquire));
        int i5 = f8457c + 11;
        f8458g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return maybeFromCallable;
    }

    public static List<Class<?>> a() {
        int i2 = 2 % 2;
        int i3 = f8457c + 59;
        f8458g = i3 % 128;
        if (i3 % 2 == 0) {
            Collections.emptyList();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i4 = f8457c + 5;
        f8458g = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }
}
