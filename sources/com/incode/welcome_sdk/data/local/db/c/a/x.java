package com.incode.welcome_sdk.data.local.db.c.a;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Maybe;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8425a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8426c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RoomDatabase f8427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.f> f8428e;

    public x(RoomDatabase roomDatabase) {
        this.f8427d = roomDatabase;
        this.f8428e = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.f>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.x.4

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8433c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8434e = 0;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.f fVar) {
                int i2 = 2 % 2;
                int i3 = f8433c + 35;
                f8434e = i3 % 128;
                int i4 = i3 % 2;
                b(supportSQLiteStatement, fVar);
                int i5 = f8434e + 27;
                f8433c = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8433c;
                int i4 = i3 + 33;
                f8434e = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 37;
                f8434e = i6 % 128;
                int i7 = i6 % 2;
                return "INSERT OR REPLACE INTO `module_types` (`table_name`) VALUES (?)";
            }

            private static void b(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.f fVar) {
                int i2 = 2 % 2;
                int i3 = f8433c + 9;
                f8434e = i3 % 128;
                if (i3 % 2 == 0) {
                    if (fVar.e() == null) {
                        supportSQLiteStatement.bindNull(1);
                        int i4 = f8433c + 45;
                        f8434e = i4 % 128;
                        int i5 = i4 % 2;
                        return;
                    }
                    supportSQLiteStatement.bindString(1, fVar.e());
                    return;
                }
                fVar.e();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.w
    public final void a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.f... fVarArr) {
        int i2 = 2 % 2;
        int i3 = f8426c + 31;
        f8425a = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.f8427d.assertNotSuspendingTransaction();
                this.f8427d.beginTransaction();
                this.f8428e.insert(fVarArr);
                this.f8427d.setTransactionSuccessful();
                this.f8427d.endTransaction();
                throw null;
            }
            this.f8427d.assertNotSuspendingTransaction();
            this.f8427d.beginTransaction();
            this.f8428e.insert(fVarArr);
            this.f8427d.setTransactionSuccessful();
            this.f8427d.endTransaction();
            int i4 = f8426c + 85;
            f8425a = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            this.f8427d.endTransaction();
            throw th;
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.w
    public final Maybe<String> e(String str) {
        int i2 = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM module_types WHERE table_name = ? LIMIT 1", 1);
        if (str == null) {
            int i3 = f8426c + 23;
            f8425a = i3 % 128;
            int i4 = i3 % 2;
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
            int i5 = f8425a + 109;
            f8426c = i5 % 128;
            int i6 = i5 % 2;
        }
        Maybe<String> maybeFromCallable = Maybe.fromCallable(new Callable<String>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.x.3

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8429c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8430e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ String call() throws Exception {
                int i7 = 2 % 2;
                int i8 = f8429c + 3;
                f8430e = i8 % 128;
                int i9 = i8 % 2;
                String strD = d();
                int i10 = f8430e + 105;
                f8429c = i10 % 128;
                int i11 = i10 % 2;
                return strD;
            }

            private String d() throws Exception {
                int i7 = 2 % 2;
                String string = null;
                Cursor cursorQuery = DBUtil.query(x.this.f8427d, roomSQLiteQueryAcquire, false, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i8 = f8429c + 15;
                        f8430e = i8 % 128;
                        int i9 = i8 % 2;
                        if (!cursorQuery.isNull(0)) {
                            int i10 = f8430e + 71;
                            f8429c = i10 % 128;
                            int i11 = i10 % 2;
                            string = cursorQuery.getString(0);
                        }
                    }
                    return string;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i7 = 2 % 2;
                int i8 = f8429c + 21;
                f8430e = i8 % 128;
                int i9 = i8 % 2;
                roomSQLiteQueryAcquire.release();
                int i10 = f8429c + 109;
                f8430e = i10 % 128;
                if (i10 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i7 = f8425a + 15;
        f8426c = i7 % 128;
        if (i7 % 2 != 0) {
            return maybeFromCallable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static List<Class<?>> e() {
        int i2 = 2 % 2;
        int i3 = f8426c + 125;
        f8425a = i3 % 128;
        int i4 = i3 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i5 = f8425a + 45;
        f8426c = i5 % 128;
        if (i5 % 2 != 0) {
            return listEmptyList;
        }
        throw null;
    }
}
