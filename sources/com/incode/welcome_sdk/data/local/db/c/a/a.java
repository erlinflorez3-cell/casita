package com.incode.welcome_sdk.data.local.db.c.a;

import android.database.Cursor;
import android.os.SystemClock;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.remote.beans.bf;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: f */
    public static int f8016f = 0;

    /* JADX INFO: renamed from: g */
    public static int f8017g = 0;

    /* JADX INFO: renamed from: i */
    private static int f8018i = 1;

    /* JADX INFO: renamed from: j */
    private static int f8019j = 0;

    /* JADX INFO: renamed from: a */
    final RoomDatabase f8020a;

    /* JADX INFO: renamed from: b */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> f8021b;

    /* JADX INFO: renamed from: c */
    final EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> f8022c;

    /* JADX INFO: renamed from: d */
    final SharedSQLiteStatement f8023d;

    /* JADX INFO: renamed from: e */
    final com.incode.welcome_sdk.data.local.model.delayed_onboarding.i f8024e = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.i();

    public a(RoomDatabase roomDatabase) {
        this.f8020a = roomDatabase;
        this.f8021b = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.a.5

            /* JADX INFO: renamed from: d */
            private static int f8043d = 1;

            /* JADX INFO: renamed from: e */
            private static int f8044e = 0;

            AnonymousClass5(RoomDatabase roomDatabase2) {
                super(roomDatabase2);
            }

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) throws JSONException {
                int i2 = 2 % 2;
                int i3 = f8043d + 115;
                f8044e = i3 % 128;
                int i4 = i3 % 2;
                d(supportSQLiteStatement, cVar);
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = f8044e + 121;
                f8043d = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8043d + 15;
                f8044e = i3 % 128;
                if (i3 % 2 == 0) {
                    return "INSERT OR REPLACE INTO `combined_consent` (`id`,`language_consent_id`,`consents`,`is_completed`,`is_synced`) VALUES (nullif(?, 0),?,?,?,?)";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private void d(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) throws JSONException {
                int i2 = 2 % 2;
                int iE = bf.a.e();
                int iE2 = bf.a.e();
                supportSQLiteStatement.bindLong(1, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c.c(bf.a.e(), bf.a.e(), iE2, 340780288, new Object[]{cVar}, iE, -340780287)).longValue());
                if (cVar.c() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, cVar.c());
                    int i3 = f8043d + 89;
                    f8044e = i3 % 128;
                    int i4 = i3 % 2;
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.i iVar = a.this.f8024e;
                String strA = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.a(cVar.a());
                if (strA == null) {
                    int i5 = f8043d + 33;
                    f8044e = i5 % 128;
                    if (i5 % 2 != 0) {
                        supportSQLiteStatement.bindNull(2);
                    } else {
                        supportSQLiteStatement.bindNull(3);
                    }
                } else {
                    supportSQLiteStatement.bindString(3, strA);
                }
                supportSQLiteStatement.bindLong(4, cVar.e() ? 1L : 0L);
                supportSQLiteStatement.bindLong(5, cVar.d() ? 1L : 0L);
                int i6 = f8044e + 37;
                f8043d = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        this.f8022c = new EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c>(roomDatabase2) { // from class: com.incode.welcome_sdk.data.local.db.c.a.a.1

            /* JADX INFO: renamed from: b */
            private static int f8025b = 0;

            /* JADX INFO: renamed from: c */
            private static int f8026c = 1;

            AnonymousClass1(RoomDatabase roomDatabase2) {
                super(roomDatabase2);
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) throws JSONException {
                int i2 = 2 % 2;
                int i3 = f8026c + 97;
                f8025b = i3 % 128;
                int i4 = i3 % 2;
                a(supportSQLiteStatement, cVar);
                if (i4 != 0) {
                    int i5 = 47 / 0;
                }
                int i6 = f8026c + 61;
                f8025b = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8025b;
                int i4 = i3 + 71;
                f8026c = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 44 / 0;
                }
                int i6 = i3 + 75;
                f8026c = i6 % 128;
                int i7 = i6 % 2;
                return "UPDATE OR ABORT `combined_consent` SET `id` = ?,`language_consent_id` = ?,`consents` = ?,`is_completed` = ?,`is_synced` = ? WHERE `id` = ?";
            }

            private void a(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) throws JSONException {
                int i2 = 2 % 2;
                int iE = bf.a.e();
                int i3 = 1;
                supportSQLiteStatement.bindLong(1, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c.c(bf.a.e(), bf.a.e(), bf.a.e(), 340780288, new Object[]{cVar}, iE, -340780287)).longValue());
                if (cVar.c() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, cVar.c());
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.i iVar = a.this.f8024e;
                String strA = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.a(cVar.a());
                if (strA == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, strA);
                }
                if (!cVar.e()) {
                    int i4 = f8026c + 13;
                    f8025b = i4 % 128;
                    int i5 = i4 % 2;
                    i3 = 0;
                } else {
                    int i6 = f8025b + 81;
                    f8026c = i6 % 128;
                    int i7 = i6 % 2;
                }
                supportSQLiteStatement.bindLong(4, i3);
                supportSQLiteStatement.bindLong(5, cVar.d() ? 1L : 0L);
                int iE2 = bf.a.e();
                supportSQLiteStatement.bindLong(6, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c.c(bf.a.e(), bf.a.e(), bf.a.e(), 340780288, new Object[]{cVar}, iE2, -340780287)).longValue());
            }
        };
        this.f8023d = new SharedSQLiteStatement(roomDatabase2) { // from class: com.incode.welcome_sdk.data.local.db.c.a.a.2

            /* JADX INFO: renamed from: a */
            private static int f8032a = 1;

            /* JADX INFO: renamed from: d */
            private static int f8033d = 0;

            AnonymousClass2(RoomDatabase roomDatabase2) {
                super(roomDatabase2);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8032a + 55;
                f8033d = i3 % 128;
                if (i3 % 2 == 0) {
                    return "DELETE FROM combined_consent";
                }
                int i4 = 36 / 0;
                return "DELETE FROM combined_consent";
            }
        };
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.a$5 */
    final class AnonymousClass5 extends EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> {

        /* JADX INFO: renamed from: d */
        private static int f8043d = 1;

        /* JADX INFO: renamed from: e */
        private static int f8044e = 0;

        AnonymousClass5(RoomDatabase roomDatabase2) {
            super(roomDatabase2);
        }

        @Override // androidx.room.EntityInsertionAdapter
        protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) throws JSONException {
            int i2 = 2 % 2;
            int i3 = f8043d + 115;
            f8044e = i3 % 128;
            int i4 = i3 % 2;
            d(supportSQLiteStatement, cVar);
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f8044e + 121;
            f8043d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected final String createQuery() {
            int i2 = 2 % 2;
            int i3 = f8043d + 15;
            f8044e = i3 % 128;
            if (i3 % 2 == 0) {
                return "INSERT OR REPLACE INTO `combined_consent` (`id`,`language_consent_id`,`consents`,`is_completed`,`is_synced`) VALUES (nullif(?, 0),?,?,?,?)";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) throws JSONException {
            int i2 = 2 % 2;
            int iE = bf.a.e();
            int iE2 = bf.a.e();
            supportSQLiteStatement.bindLong(1, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c.c(bf.a.e(), bf.a.e(), iE2, 340780288, new Object[]{cVar}, iE, -340780287)).longValue());
            if (cVar.c() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, cVar.c());
                int i3 = f8043d + 89;
                f8044e = i3 % 128;
                int i4 = i3 % 2;
            }
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.i iVar = a.this.f8024e;
            String strA = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.a(cVar.a());
            if (strA == null) {
                int i5 = f8043d + 33;
                f8044e = i5 % 128;
                if (i5 % 2 != 0) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindNull(3);
                }
            } else {
                supportSQLiteStatement.bindString(3, strA);
            }
            supportSQLiteStatement.bindLong(4, cVar.e() ? 1L : 0L);
            supportSQLiteStatement.bindLong(5, cVar.d() ? 1L : 0L);
            int i6 = f8044e + 37;
            f8043d = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.a$1 */
    final class AnonymousClass1 extends EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> {

        /* JADX INFO: renamed from: b */
        private static int f8025b = 0;

        /* JADX INFO: renamed from: c */
        private static int f8026c = 1;

        AnonymousClass1(RoomDatabase roomDatabase2) {
            super(roomDatabase2);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) throws JSONException {
            int i2 = 2 % 2;
            int i3 = f8026c + 97;
            f8025b = i3 % 128;
            int i4 = i3 % 2;
            a(supportSQLiteStatement, cVar);
            if (i4 != 0) {
                int i5 = 47 / 0;
            }
            int i6 = f8026c + 61;
            f8025b = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        protected final String createQuery() {
            int i2 = 2 % 2;
            int i3 = f8025b;
            int i4 = i3 + 71;
            f8026c = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 44 / 0;
            }
            int i6 = i3 + 75;
            f8026c = i6 % 128;
            int i7 = i6 % 2;
            return "UPDATE OR ABORT `combined_consent` SET `id` = ?,`language_consent_id` = ?,`consents` = ?,`is_completed` = ?,`is_synced` = ? WHERE `id` = ?";
        }

        private void a(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) throws JSONException {
            int i2 = 2 % 2;
            int iE = bf.a.e();
            int i3 = 1;
            supportSQLiteStatement.bindLong(1, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c.c(bf.a.e(), bf.a.e(), bf.a.e(), 340780288, new Object[]{cVar}, iE, -340780287)).longValue());
            if (cVar.c() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, cVar.c());
            }
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.i iVar = a.this.f8024e;
            String strA = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.a(cVar.a());
            if (strA == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, strA);
            }
            if (!cVar.e()) {
                int i4 = f8026c + 13;
                f8025b = i4 % 128;
                int i5 = i4 % 2;
                i3 = 0;
            } else {
                int i6 = f8025b + 81;
                f8026c = i6 % 128;
                int i7 = i6 % 2;
            }
            supportSQLiteStatement.bindLong(4, i3);
            supportSQLiteStatement.bindLong(5, cVar.d() ? 1L : 0L);
            int iE2 = bf.a.e();
            supportSQLiteStatement.bindLong(6, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c.c(bf.a.e(), bf.a.e(), bf.a.e(), 340780288, new Object[]{cVar}, iE2, -340780287)).longValue());
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.a$2 */
    final class AnonymousClass2 extends SharedSQLiteStatement {

        /* JADX INFO: renamed from: a */
        private static int f8032a = 1;

        /* JADX INFO: renamed from: d */
        private static int f8033d = 0;

        AnonymousClass2(RoomDatabase roomDatabase2) {
            super(roomDatabase2);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            int i2 = 2 % 2;
            int i3 = f8032a + 55;
            f8033d = i3 % 128;
            if (i3 % 2 == 0) {
                return "DELETE FROM combined_consent";
            }
            int i4 = 36 / 0;
            return "DELETE FROM combined_consent";
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.a$4 */
    final class AnonymousClass4 implements Callable<Long> {

        /* JADX INFO: renamed from: b */
        private static int f8039b = 0;

        /* JADX INFO: renamed from: e */
        private static int f8040e = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c f8041a;

        AnonymousClass4(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
            cVar = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Long call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8039b + 81;
            f8040e = i3 % 128;
            int i4 = i3 % 2;
            Long lE = e();
            if (i4 == 0) {
                int i5 = 33 / 0;
            }
            return lE;
        }

        private Long e() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8039b + 107;
            f8040e = i3 % 128;
            int i4 = i3 % 2;
            a.this.f8020a.beginTransaction();
            try {
                Long lValueOf = Long.valueOf(a.this.f8021b.insertAndReturnId(cVar));
                a.this.f8020a.setTransactionSuccessful();
                a.this.f8020a.endTransaction();
                int i5 = f8039b + 11;
                f8040e = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 83 / 0;
                }
                return lValueOf;
            } catch (Throwable th) {
                a.this.f8020a.endTransaction();
                throw th;
            }
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.e
    public final Single<Long> a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.a.4

            /* JADX INFO: renamed from: b */
            private static int f8039b = 0;

            /* JADX INFO: renamed from: e */
            private static int f8040e = 1;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c f8041a;

            AnonymousClass4(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar2) {
                cVar = cVar2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8039b + 81;
                f8040e = i3 % 128;
                int i4 = i3 % 2;
                Long lE = e();
                if (i4 == 0) {
                    int i5 = 33 / 0;
                }
                return lE;
            }

            private Long e() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8039b + 107;
                f8040e = i3 % 128;
                int i4 = i3 % 2;
                a.this.f8020a.beginTransaction();
                try {
                    Long lValueOf = Long.valueOf(a.this.f8021b.insertAndReturnId(cVar));
                    a.this.f8020a.setTransactionSuccessful();
                    a.this.f8020a.endTransaction();
                    int i5 = f8039b + 11;
                    f8040e = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 83 / 0;
                    }
                    return lValueOf;
                } catch (Throwable th) {
                    a.this.f8020a.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8018i + 23;
        f8019j = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 85 / 0;
        }
        return singleFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.a$3 */
    final class AnonymousClass3 implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        private static int f8035a = 0;

        /* JADX INFO: renamed from: c */
        private static int f8036c = 1;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c f8038d;

        AnonymousClass3(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
            cVar = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8035a + 81;
            f8036c = i3 % 128;
            if (i3 % 2 != 0) {
                return d();
            }
            d();
            throw null;
        }

        private Void d() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8036c + 83;
            f8035a = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    a.this.f8020a.beginTransaction();
                    a.this.f8022c.handle(cVar);
                    a.this.f8020a.setTransactionSuccessful();
                    a.this.f8020a.endTransaction();
                    int i4 = 65 / 0;
                } else {
                    a.this.f8020a.beginTransaction();
                    a.this.f8022c.handle(cVar);
                    a.this.f8020a.setTransactionSuccessful();
                }
                int i5 = f8035a + 93;
                f8036c = i5 % 128;
                int i6 = i5 % 2;
                return null;
            } finally {
                a.this.f8020a.endTransaction();
            }
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.e
    public final Completable b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.a.3

            /* JADX INFO: renamed from: a */
            private static int f8035a = 0;

            /* JADX INFO: renamed from: c */
            private static int f8036c = 1;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c f8038d;

            AnonymousClass3(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar2) {
                cVar = cVar2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8035a + 81;
                f8036c = i3 % 128;
                if (i3 % 2 != 0) {
                    return d();
                }
                d();
                throw null;
            }

            private Void d() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8036c + 83;
                f8035a = i3 % 128;
                try {
                    if (i3 % 2 != 0) {
                        a.this.f8020a.beginTransaction();
                        a.this.f8022c.handle(cVar);
                        a.this.f8020a.setTransactionSuccessful();
                        a.this.f8020a.endTransaction();
                        int i4 = 65 / 0;
                    } else {
                        a.this.f8020a.beginTransaction();
                        a.this.f8022c.handle(cVar);
                        a.this.f8020a.setTransactionSuccessful();
                    }
                    int i5 = f8035a + 93;
                    f8036c = i5 % 128;
                    int i6 = i5 % 2;
                    return null;
                } finally {
                    a.this.f8020a.endTransaction();
                }
            }
        });
        int i3 = f8018i + 87;
        f8019j = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return completableFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.a$8 */
    final class AnonymousClass8 implements Callable<Void> {

        /* JADX INFO: renamed from: c */
        private static int f8046c = 0;

        /* JADX INFO: renamed from: d */
        private static int f8047d = 1;

        AnonymousClass8() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8047d + 33;
            f8046c = i3 % 128;
            if (i3 % 2 != 0) {
                e();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Void voidE = e();
            int i4 = f8047d + 9;
            f8046c = i4 % 128;
            int i5 = i4 % 2;
            return voidE;
        }

        private Void e() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8046c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f8047d = i3 % 128;
            int i4 = i3 % 2;
            SupportSQLiteStatement supportSQLiteStatementAcquire = a.this.f8023d.acquire();
            try {
                a.this.f8020a.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    a.this.f8020a.setTransactionSuccessful();
                    a.this.f8023d.release(supportSQLiteStatementAcquire);
                    int i5 = f8047d + 19;
                    f8046c = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 81 / 0;
                    }
                    return null;
                } finally {
                    a.this.f8020a.endTransaction();
                }
            } catch (Throwable th) {
                a.this.f8023d.release(supportSQLiteStatementAcquire);
                throw th;
            }
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.e
    public final Completable e() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.a.8

            /* JADX INFO: renamed from: c */
            private static int f8046c = 0;

            /* JADX INFO: renamed from: d */
            private static int f8047d = 1;

            AnonymousClass8() {
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8047d + 33;
                f8046c = i3 % 128;
                if (i3 % 2 != 0) {
                    e();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Void voidE = e();
                int i4 = f8047d + 9;
                f8046c = i4 % 128;
                int i5 = i4 % 2;
                return voidE;
            }

            private Void e() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8046c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f8047d = i3 % 128;
                int i4 = i3 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = a.this.f8023d.acquire();
                try {
                    a.this.f8020a.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        a.this.f8020a.setTransactionSuccessful();
                        a.this.f8023d.release(supportSQLiteStatementAcquire);
                        int i5 = f8047d + 19;
                        f8046c = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 81 / 0;
                        }
                        return null;
                    } finally {
                        a.this.f8020a.endTransaction();
                    }
                } catch (Throwable th) {
                    a.this.f8023d.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8019j + 31;
        f8018i = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.a$10 */
    final class AnonymousClass10 implements Callable<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> {

        /* JADX INFO: renamed from: d */
        private static int f8028d = 1;

        /* JADX INFO: renamed from: e */
        private static int f8029e = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ RoomSQLiteQuery f8030a;

        AnonymousClass10(RoomSQLiteQuery roomSQLiteQuery) {
            roomSQLiteQuery = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8028d + 71;
            f8029e = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                d();
                obj.hashCode();
                throw null;
            }
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVarD = d();
            int i4 = f8028d + 113;
            f8029e = i4 % 128;
            if (i4 % 2 == 0) {
                return cVarD;
            }
            obj.hashCode();
            throw null;
        }

        private com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c d() throws Exception {
            String string;
            int i2 = 2 % 2;
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar = null;
            Cursor cursorQuery = DBUtil.query(a.this.f8020a, roomSQLiteQuery, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "language_consent_id");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "consents");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_completed");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_synced");
                if (cursorQuery.moveToFirst()) {
                    long j2 = cursorQuery.getLong(columnIndexOrThrow);
                    if (cursorQuery.isNull(columnIndexOrThrow2)) {
                        int i3 = f8028d + 31;
                        f8029e = i3 % 128;
                        int i4 = i3 % 2;
                        string = null;
                    } else {
                        string = cursorQuery.getString(columnIndexOrThrow2);
                    }
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    com.incode.welcome_sdk.data.local.model.delayed_onboarding.i iVar = a.this.f8024e;
                    Map<String, Boolean> mapD = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(string2);
                    boolean z2 = true;
                    boolean z3 = cursorQuery.getInt(columnIndexOrThrow4) != 0;
                    if (cursorQuery.getInt(columnIndexOrThrow5) != 0) {
                        int i5 = f8028d + 47;
                        f8029e = i5 % 128;
                        int i6 = i5 % 2;
                    } else {
                        z2 = false;
                    }
                    cVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c(j2, string, mapD, z3, z2);
                }
                return cVar;
            } finally {
                cursorQuery.close();
            }
        }

        protected final void finalize() {
            int i2 = 2 % 2;
            int i3 = f8029e + 51;
            f8028d = i3 % 128;
            if (i3 % 2 != 0) {
                roomSQLiteQuery.release();
                return;
            }
            roomSQLiteQuery.release();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.e
    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> a(long j2) {
        int i2 = 2 % 2;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM combined_consent WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> maybeFromCallable = Maybe.fromCallable(new Callable<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.a.10

            /* JADX INFO: renamed from: d */
            private static int f8028d = 1;

            /* JADX INFO: renamed from: e */
            private static int f8029e = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ RoomSQLiteQuery f8030a;

            AnonymousClass10(RoomSQLiteQuery roomSQLiteQueryAcquire2) {
                roomSQLiteQuery = roomSQLiteQueryAcquire2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c call() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8028d + 71;
                f8029e = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    d();
                    obj.hashCode();
                    throw null;
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVarD = d();
                int i4 = f8028d + 113;
                f8029e = i4 % 128;
                if (i4 % 2 == 0) {
                    return cVarD;
                }
                obj.hashCode();
                throw null;
            }

            private com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c d() throws Exception {
                String string;
                int i22 = 2 % 2;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar = null;
                Cursor cursorQuery = DBUtil.query(a.this.f8020a, roomSQLiteQuery, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "language_consent_id");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "consents");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_completed");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_synced");
                    if (cursorQuery.moveToFirst()) {
                        long j22 = cursorQuery.getLong(columnIndexOrThrow);
                        if (cursorQuery.isNull(columnIndexOrThrow2)) {
                            int i3 = f8028d + 31;
                            f8029e = i3 % 128;
                            int i4 = i3 % 2;
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow2);
                        }
                        String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        com.incode.welcome_sdk.data.local.model.delayed_onboarding.i iVar = a.this.f8024e;
                        Map<String, Boolean> mapD = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(string2);
                        boolean z2 = true;
                        boolean z3 = cursorQuery.getInt(columnIndexOrThrow4) != 0;
                        if (cursorQuery.getInt(columnIndexOrThrow5) != 0) {
                            int i5 = f8028d + 47;
                            f8029e = i5 % 128;
                            int i6 = i5 % 2;
                        } else {
                            z2 = false;
                        }
                        cVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c(j22, string, mapD, z3, z2);
                    }
                    return cVar;
                } finally {
                    cursorQuery.close();
                }
            }

            protected final void finalize() {
                int i22 = 2 % 2;
                int i3 = f8029e + 51;
                f8028d = i3 % 128;
                if (i3 % 2 != 0) {
                    roomSQLiteQuery.release();
                    return;
                }
                roomSQLiteQuery.release();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i3 = f8018i + 125;
        f8019j = i3 % 128;
        int i4 = i3 % 2;
        return maybeFromCallable;
    }

    public static List<Class<?>> b() {
        int i2 = 2 % 2;
        int i3 = f8018i + 69;
        f8019j = i3 % 128;
        if (i3 % 2 != 0) {
            Collections.emptyList();
            throw null;
        }
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i4 = f8018i + 101;
        f8019j = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return listEmptyList;
    }

    public static int c() {
        int i2 = f8017g;
        int i3 = i2 % 9657134;
        f8017g = i2 + 1;
        if (i3 != 0) {
            return f8016f;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        f8016f = iUptimeMillis;
        return iUptimeMillis;
    }
}
