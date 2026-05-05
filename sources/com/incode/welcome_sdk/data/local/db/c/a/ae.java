package com.incode.welcome_sdk.data.local.db.c.a;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.OnboardingValidationModule;
import com.incode.welcome_sdk.ui.camera.video_selfie.DaggerVideoSelfieComponent;
import com.npmdavi.davinotification.DatabaseHelper;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class ae implements ai {

    /* JADX INFO: renamed from: f */
    private static int f8117f = 1;

    /* JADX INFO: renamed from: j */
    private static int f8118j = 0;

    /* JADX INFO: renamed from: a */
    final SharedSQLiteStatement f8119a;

    /* JADX INFO: renamed from: b */
    final RoomDatabase f8120b;

    /* JADX INFO: renamed from: c */
    final com.incode.welcome_sdk.data.local.model.delayed_onboarding.l f8121c = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.l();

    /* JADX INFO: renamed from: d */
    final EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.n> f8122d;

    /* JADX INFO: renamed from: e */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.n> f8123e;

    public ae(RoomDatabase roomDatabase) {
        this.f8120b = roomDatabase;
        this.f8123e = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.n>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.ae.3

            /* JADX INFO: renamed from: b */
            private static int f8131b = 1;

            /* JADX INFO: renamed from: d */
            private static int f8132d = 0;

            AnonymousClass3(RoomDatabase roomDatabase2) {
                super(roomDatabase2);
            }

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
                int i2 = 2 % 2;
                int i3 = f8132d + 83;
                f8131b = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                b(supportSQLiteStatement, nVar);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = f8131b + 117;
                f8132d = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8132d;
                int i4 = i3 + 43;
                f8131b = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i3 + 55;
                f8131b = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 57 / 0;
                }
                return "INSERT OR REPLACE INTO `session_config` (`id`,`interview_id`,`configuration_id`,`validation_module_list`,`region_iso_code`,`queue_name`,`external_id`,`external_customer_id`,`external_token`,`custom_fields`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            }

            private void b(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
                int i2 = 2 % 2;
                int iB = DaggerVideoSelfieComponent.b.b();
                int iB2 = DaggerVideoSelfieComponent.b.b();
                int iB3 = DaggerVideoSelfieComponent.b.b();
                supportSQLiteStatement.bindLong(1, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-750161443, iB2, DaggerVideoSelfieComponent.b.b(), iB, iB3, 750161444, new Object[]{nVar})).longValue());
                if (nVar.c() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, nVar.c());
                }
                if (nVar.e() == null) {
                    int i3 = f8132d + 91;
                    f8131b = i3 % 128;
                    if (i3 % 2 == 0) {
                        supportSQLiteStatement.bindNull(5);
                    } else {
                        supportSQLiteStatement.bindNull(3);
                    }
                } else {
                    supportSQLiteStatement.bindString(3, nVar.e());
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.l lVar = ae.this.f8121c;
                String strE = com.incode.welcome_sdk.data.local.model.delayed_onboarding.l.e(nVar.a());
                if (strE == null) {
                    int i4 = f8132d + 3;
                    f8131b = i4 % 128;
                    if (i4 % 2 == 0) {
                        supportSQLiteStatement.bindNull(5);
                    } else {
                        supportSQLiteStatement.bindNull(4);
                    }
                    int i5 = f8132d + 45;
                    f8131b = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    supportSQLiteStatement.bindString(4, strE);
                }
                if (nVar.d() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, nVar.d());
                }
                if (nVar.h() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, nVar.h());
                }
                if (nVar.g() == null) {
                    int i7 = f8131b + 33;
                    f8132d = i7 % 128;
                    int i8 = i7 % 2;
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, nVar.g());
                }
                int iB4 = DaggerVideoSelfieComponent.b.b();
                int iB5 = DaggerVideoSelfieComponent.b.b();
                int iB6 = DaggerVideoSelfieComponent.b.b();
                if (((String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-1522893158, iB5, DaggerVideoSelfieComponent.b.b(), iB4, iB6, 1522893158, new Object[]{nVar})) == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    int iB7 = DaggerVideoSelfieComponent.b.b();
                    int iB8 = DaggerVideoSelfieComponent.b.b();
                    int iB9 = DaggerVideoSelfieComponent.b.b();
                    supportSQLiteStatement.bindString(8, (String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-1522893158, iB8, DaggerVideoSelfieComponent.b.b(), iB7, iB9, 1522893158, new Object[]{nVar}));
                    int i9 = f8132d + 27;
                    f8131b = i9 % 128;
                    int i10 = i9 % 2;
                }
                if (nVar.f() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, nVar.f());
                    int i11 = f8131b + 107;
                    f8132d = i11 % 128;
                    int i12 = i11 % 2;
                }
                if (nVar.j() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, nVar.j());
                }
            }
        };
        this.f8122d = new EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.n>(roomDatabase2) { // from class: com.incode.welcome_sdk.data.local.db.c.a.ae.1

            /* JADX INFO: renamed from: b */
            private static int f8124b = 0;

            /* JADX INFO: renamed from: d */
            private static int f8125d = 1;

            AnonymousClass1(RoomDatabase roomDatabase2) {
                super(roomDatabase2);
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
                int i2 = 2 % 2;
                int i3 = f8125d + 51;
                f8124b = i3 % 128;
                int i4 = i3 % 2;
                b(supportSQLiteStatement, nVar);
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = f8124b + 113;
                f8125d = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8125d;
                int i4 = i3 + 123;
                f8124b = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 61;
                f8124b = i6 % 128;
                int i7 = i6 % 2;
                return "UPDATE OR ABORT `session_config` SET `id` = ?,`interview_id` = ?,`configuration_id` = ?,`validation_module_list` = ?,`region_iso_code` = ?,`queue_name` = ?,`external_id` = ?,`external_customer_id` = ?,`external_token` = ?,`custom_fields` = ? WHERE `id` = ?";
            }

            private void b(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
                int i2 = 2 % 2;
                int i3 = f8125d + 105;
                f8124b = i3 % 128;
                int i4 = i3 % 2;
                int iB = DaggerVideoSelfieComponent.b.b();
                int iB2 = DaggerVideoSelfieComponent.b.b();
                int iB3 = DaggerVideoSelfieComponent.b.b();
                supportSQLiteStatement.bindLong(1, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-750161443, iB2, DaggerVideoSelfieComponent.b.b(), iB, iB3, 750161444, new Object[]{nVar})).longValue());
                if (nVar.c() == null) {
                    int i5 = f8125d + 5;
                    f8124b = i5 % 128;
                    int i6 = i5 % 2;
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, nVar.c());
                }
                if (nVar.e() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, nVar.e());
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.l lVar = ae.this.f8121c;
                String strE = com.incode.welcome_sdk.data.local.model.delayed_onboarding.l.e(nVar.a());
                if (strE == null) {
                    int i7 = f8125d + 95;
                    f8124b = i7 % 128;
                    if (i7 % 2 != 0) {
                        supportSQLiteStatement.bindNull(5);
                    } else {
                        supportSQLiteStatement.bindNull(4);
                    }
                } else {
                    supportSQLiteStatement.bindString(4, strE);
                }
                if (nVar.d() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, nVar.d());
                }
                if (nVar.h() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, nVar.h());
                    int i8 = f8124b + 41;
                    f8125d = i8 % 128;
                    int i9 = i8 % 2;
                }
                if (nVar.g() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, nVar.g());
                }
                int iB4 = DaggerVideoSelfieComponent.b.b();
                int iB5 = DaggerVideoSelfieComponent.b.b();
                int iB6 = DaggerVideoSelfieComponent.b.b();
                if (((String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-1522893158, iB5, DaggerVideoSelfieComponent.b.b(), iB4, iB6, 1522893158, new Object[]{nVar})) == null) {
                    int i10 = f8125d + 1;
                    f8124b = i10 % 128;
                    if (i10 % 2 != 0) {
                        supportSQLiteStatement.bindNull(59);
                    } else {
                        supportSQLiteStatement.bindNull(8);
                    }
                } else {
                    int iB7 = DaggerVideoSelfieComponent.b.b();
                    int iB8 = DaggerVideoSelfieComponent.b.b();
                    int iB9 = DaggerVideoSelfieComponent.b.b();
                    supportSQLiteStatement.bindString(8, (String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-1522893158, iB8, DaggerVideoSelfieComponent.b.b(), iB7, iB9, 1522893158, new Object[]{nVar}));
                }
                if (nVar.f() == null) {
                    int i11 = f8124b + 55;
                    f8125d = i11 % 128;
                    int i12 = i11 % 2;
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, nVar.f());
                }
                if (nVar.j() == null) {
                    int i13 = f8125d + 73;
                    f8124b = i13 % 128;
                    int i14 = i13 % 2;
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, nVar.j());
                }
                int iB10 = DaggerVideoSelfieComponent.b.b();
                int iB11 = DaggerVideoSelfieComponent.b.b();
                int iB12 = DaggerVideoSelfieComponent.b.b();
                supportSQLiteStatement.bindLong(11, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-750161443, iB11, DaggerVideoSelfieComponent.b.b(), iB10, iB12, 750161444, new Object[]{nVar})).longValue());
            }
        };
        this.f8119a = new SharedSQLiteStatement(roomDatabase2) { // from class: com.incode.welcome_sdk.data.local.db.c.a.ae.4

            /* JADX INFO: renamed from: c */
            private static int f8134c = 1;

            /* JADX INFO: renamed from: d */
            private static int f8135d = 0;

            AnonymousClass4(RoomDatabase roomDatabase2) {
                super(roomDatabase2);
            }

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8135d + 107;
                int i4 = i3 % 128;
                f8134c = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 91;
                f8135d = i6 % 128;
                int i7 = i6 % 2;
                return "DELETE FROM session_config";
            }
        };
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.ae$3 */
    final class AnonymousClass3 extends EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.n> {

        /* JADX INFO: renamed from: b */
        private static int f8131b = 1;

        /* JADX INFO: renamed from: d */
        private static int f8132d = 0;

        AnonymousClass3(RoomDatabase roomDatabase2) {
            super(roomDatabase2);
        }

        @Override // androidx.room.EntityInsertionAdapter
        protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
            int i2 = 2 % 2;
            int i3 = f8132d + 83;
            f8131b = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            b(supportSQLiteStatement, nVar);
            if (i4 == 0) {
                throw null;
            }
            int i5 = f8131b + 117;
            f8132d = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected final String createQuery() {
            int i2 = 2 % 2;
            int i3 = f8132d;
            int i4 = i3 + 43;
            f8131b = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 55;
            f8131b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 57 / 0;
            }
            return "INSERT OR REPLACE INTO `session_config` (`id`,`interview_id`,`configuration_id`,`validation_module_list`,`region_iso_code`,`queue_name`,`external_id`,`external_customer_id`,`external_token`,`custom_fields`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
        }

        private void b(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
            int i2 = 2 % 2;
            int iB = DaggerVideoSelfieComponent.b.b();
            int iB2 = DaggerVideoSelfieComponent.b.b();
            int iB3 = DaggerVideoSelfieComponent.b.b();
            supportSQLiteStatement.bindLong(1, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-750161443, iB2, DaggerVideoSelfieComponent.b.b(), iB, iB3, 750161444, new Object[]{nVar})).longValue());
            if (nVar.c() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, nVar.c());
            }
            if (nVar.e() == null) {
                int i3 = f8132d + 91;
                f8131b = i3 % 128;
                if (i3 % 2 == 0) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindNull(3);
                }
            } else {
                supportSQLiteStatement.bindString(3, nVar.e());
            }
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.l lVar = ae.this.f8121c;
            String strE = com.incode.welcome_sdk.data.local.model.delayed_onboarding.l.e(nVar.a());
            if (strE == null) {
                int i4 = f8132d + 3;
                f8131b = i4 % 128;
                if (i4 % 2 == 0) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindNull(4);
                }
                int i5 = f8132d + 45;
                f8131b = i5 % 128;
                int i6 = i5 % 2;
            } else {
                supportSQLiteStatement.bindString(4, strE);
            }
            if (nVar.d() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, nVar.d());
            }
            if (nVar.h() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, nVar.h());
            }
            if (nVar.g() == null) {
                int i7 = f8131b + 33;
                f8132d = i7 % 128;
                int i8 = i7 % 2;
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, nVar.g());
            }
            int iB4 = DaggerVideoSelfieComponent.b.b();
            int iB5 = DaggerVideoSelfieComponent.b.b();
            int iB6 = DaggerVideoSelfieComponent.b.b();
            if (((String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-1522893158, iB5, DaggerVideoSelfieComponent.b.b(), iB4, iB6, 1522893158, new Object[]{nVar})) == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                int iB7 = DaggerVideoSelfieComponent.b.b();
                int iB8 = DaggerVideoSelfieComponent.b.b();
                int iB9 = DaggerVideoSelfieComponent.b.b();
                supportSQLiteStatement.bindString(8, (String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-1522893158, iB8, DaggerVideoSelfieComponent.b.b(), iB7, iB9, 1522893158, new Object[]{nVar}));
                int i9 = f8132d + 27;
                f8131b = i9 % 128;
                int i10 = i9 % 2;
            }
            if (nVar.f() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, nVar.f());
                int i11 = f8131b + 107;
                f8132d = i11 % 128;
                int i12 = i11 % 2;
            }
            if (nVar.j() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, nVar.j());
            }
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.ae$1 */
    final class AnonymousClass1 extends EntityDeletionOrUpdateAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.n> {

        /* JADX INFO: renamed from: b */
        private static int f8124b = 0;

        /* JADX INFO: renamed from: d */
        private static int f8125d = 1;

        AnonymousClass1(RoomDatabase roomDatabase2) {
            super(roomDatabase2);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
            int i2 = 2 % 2;
            int i3 = f8125d + 51;
            f8124b = i3 % 128;
            int i4 = i3 % 2;
            b(supportSQLiteStatement, nVar);
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f8124b + 113;
            f8125d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        protected final String createQuery() {
            int i2 = 2 % 2;
            int i3 = f8125d;
            int i4 = i3 + 123;
            f8124b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 61;
            f8124b = i6 % 128;
            int i7 = i6 % 2;
            return "UPDATE OR ABORT `session_config` SET `id` = ?,`interview_id` = ?,`configuration_id` = ?,`validation_module_list` = ?,`region_iso_code` = ?,`queue_name` = ?,`external_id` = ?,`external_customer_id` = ?,`external_token` = ?,`custom_fields` = ? WHERE `id` = ?";
        }

        private void b(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
            int i2 = 2 % 2;
            int i3 = f8125d + 105;
            f8124b = i3 % 128;
            int i4 = i3 % 2;
            int iB = DaggerVideoSelfieComponent.b.b();
            int iB2 = DaggerVideoSelfieComponent.b.b();
            int iB3 = DaggerVideoSelfieComponent.b.b();
            supportSQLiteStatement.bindLong(1, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-750161443, iB2, DaggerVideoSelfieComponent.b.b(), iB, iB3, 750161444, new Object[]{nVar})).longValue());
            if (nVar.c() == null) {
                int i5 = f8125d + 5;
                f8124b = i5 % 128;
                int i6 = i5 % 2;
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, nVar.c());
            }
            if (nVar.e() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, nVar.e());
            }
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.l lVar = ae.this.f8121c;
            String strE = com.incode.welcome_sdk.data.local.model.delayed_onboarding.l.e(nVar.a());
            if (strE == null) {
                int i7 = f8125d + 95;
                f8124b = i7 % 128;
                if (i7 % 2 != 0) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindNull(4);
                }
            } else {
                supportSQLiteStatement.bindString(4, strE);
            }
            if (nVar.d() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, nVar.d());
            }
            if (nVar.h() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, nVar.h());
                int i8 = f8124b + 41;
                f8125d = i8 % 128;
                int i9 = i8 % 2;
            }
            if (nVar.g() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, nVar.g());
            }
            int iB4 = DaggerVideoSelfieComponent.b.b();
            int iB5 = DaggerVideoSelfieComponent.b.b();
            int iB6 = DaggerVideoSelfieComponent.b.b();
            if (((String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-1522893158, iB5, DaggerVideoSelfieComponent.b.b(), iB4, iB6, 1522893158, new Object[]{nVar})) == null) {
                int i10 = f8125d + 1;
                f8124b = i10 % 128;
                if (i10 % 2 != 0) {
                    supportSQLiteStatement.bindNull(59);
                } else {
                    supportSQLiteStatement.bindNull(8);
                }
            } else {
                int iB7 = DaggerVideoSelfieComponent.b.b();
                int iB8 = DaggerVideoSelfieComponent.b.b();
                int iB9 = DaggerVideoSelfieComponent.b.b();
                supportSQLiteStatement.bindString(8, (String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-1522893158, iB8, DaggerVideoSelfieComponent.b.b(), iB7, iB9, 1522893158, new Object[]{nVar}));
            }
            if (nVar.f() == null) {
                int i11 = f8124b + 55;
                f8125d = i11 % 128;
                int i12 = i11 % 2;
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, nVar.f());
            }
            if (nVar.j() == null) {
                int i13 = f8125d + 73;
                f8124b = i13 % 128;
                int i14 = i13 % 2;
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, nVar.j());
            }
            int iB10 = DaggerVideoSelfieComponent.b.b();
            int iB11 = DaggerVideoSelfieComponent.b.b();
            int iB12 = DaggerVideoSelfieComponent.b.b();
            supportSQLiteStatement.bindLong(11, ((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.n.b(-750161443, iB11, DaggerVideoSelfieComponent.b.b(), iB10, iB12, 750161444, new Object[]{nVar})).longValue());
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.ae$4 */
    final class AnonymousClass4 extends SharedSQLiteStatement {

        /* JADX INFO: renamed from: c */
        private static int f8134c = 1;

        /* JADX INFO: renamed from: d */
        private static int f8135d = 0;

        AnonymousClass4(RoomDatabase roomDatabase2) {
            super(roomDatabase2);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            int i2 = 2 % 2;
            int i3 = f8135d + 107;
            int i4 = i3 % 128;
            f8134c = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 91;
            f8135d = i6 % 128;
            int i7 = i6 % 2;
            return "DELETE FROM session_config";
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.ae$2 */
    final class AnonymousClass2 implements Callable<Long> {

        /* JADX INFO: renamed from: b */
        private static int f8127b = 0;

        /* JADX INFO: renamed from: d */
        private static int f8128d = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.n f8129a;

        AnonymousClass2(com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
            nVar = nVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Long call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8127b + 3;
            f8128d = i3 % 128;
            int i4 = i3 % 2;
            Long lC = c();
            int i5 = f8128d + 21;
            f8127b = i5 % 128;
            if (i5 % 2 == 0) {
                return lC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Long c() throws Exception {
            Long lValueOf;
            int i2 = 2 % 2;
            int i3 = f8127b + 67;
            f8128d = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    ae.this.f8120b.beginTransaction();
                    lValueOf = Long.valueOf(ae.this.f8123e.insertAndReturnId(nVar));
                    ae.this.f8120b.setTransactionSuccessful();
                    ae.this.f8120b.endTransaction();
                    int i4 = 73 / 0;
                } else {
                    ae.this.f8120b.beginTransaction();
                    lValueOf = Long.valueOf(ae.this.f8123e.insertAndReturnId(nVar));
                    ae.this.f8120b.setTransactionSuccessful();
                }
                int i5 = f8128d + 113;
                f8127b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 79 / 0;
                }
                return lValueOf;
            } finally {
                ae.this.f8120b.endTransaction();
            }
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.ai
    public final Single<Long> b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.ae.2

            /* JADX INFO: renamed from: b */
            private static int f8127b = 0;

            /* JADX INFO: renamed from: d */
            private static int f8128d = 1;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.n f8129a;

            AnonymousClass2(com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar2) {
                nVar = nVar2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8127b + 3;
                f8128d = i3 % 128;
                int i4 = i3 % 2;
                Long lC = c();
                int i5 = f8128d + 21;
                f8127b = i5 % 128;
                if (i5 % 2 == 0) {
                    return lC;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private Long c() throws Exception {
                Long lValueOf;
                int i22 = 2 % 2;
                int i3 = f8127b + 67;
                f8128d = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        ae.this.f8120b.beginTransaction();
                        lValueOf = Long.valueOf(ae.this.f8123e.insertAndReturnId(nVar));
                        ae.this.f8120b.setTransactionSuccessful();
                        ae.this.f8120b.endTransaction();
                        int i4 = 73 / 0;
                    } else {
                        ae.this.f8120b.beginTransaction();
                        lValueOf = Long.valueOf(ae.this.f8123e.insertAndReturnId(nVar));
                        ae.this.f8120b.setTransactionSuccessful();
                    }
                    int i5 = f8128d + 113;
                    f8127b = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 79 / 0;
                    }
                    return lValueOf;
                } finally {
                    ae.this.f8120b.endTransaction();
                }
            }
        });
        int i3 = f8117f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8118j = i3 % 128;
        int i4 = i3 % 2;
        return singleFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.ae$5 */
    final class AnonymousClass5 implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        private static int f8137a = 1;

        /* JADX INFO: renamed from: b */
        private static int f8138b = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.n f8139c;

        AnonymousClass5(com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
            nVar = nVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            Void voidE;
            int i2 = 2 % 2;
            int i3 = f8137a + 57;
            f8138b = i3 % 128;
            if (i3 % 2 != 0) {
                voidE = e();
                int i4 = 22 / 0;
            } else {
                voidE = e();
            }
            int i5 = f8137a + 111;
            f8138b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 66 / 0;
            }
            return voidE;
        }

        private Void e() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8138b + 53;
            f8137a = i3 % 128;
            Object obj = null;
            try {
                if (i3 % 2 == 0) {
                    ae.this.f8120b.beginTransaction();
                    ae.this.f8122d.handle(nVar);
                    ae.this.f8120b.setTransactionSuccessful();
                    ae.this.f8120b.endTransaction();
                    obj.hashCode();
                    throw null;
                }
                ae.this.f8120b.beginTransaction();
                ae.this.f8122d.handle(nVar);
                ae.this.f8120b.setTransactionSuccessful();
                ae.this.f8120b.endTransaction();
                int i4 = f8137a + 17;
                f8138b = i4 % 128;
                if (i4 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            } catch (Throwable th) {
                ae.this.f8120b.endTransaction();
                throw th;
            }
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.ai
    public final Completable d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.ae.5

            /* JADX INFO: renamed from: a */
            private static int f8137a = 1;

            /* JADX INFO: renamed from: b */
            private static int f8138b = 0;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.n f8139c;

            AnonymousClass5(com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar2) {
                nVar = nVar2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                Void voidE;
                int i22 = 2 % 2;
                int i3 = f8137a + 57;
                f8138b = i3 % 128;
                if (i3 % 2 != 0) {
                    voidE = e();
                    int i4 = 22 / 0;
                } else {
                    voidE = e();
                }
                int i5 = f8137a + 111;
                f8138b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 66 / 0;
                }
                return voidE;
            }

            private Void e() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8138b + 53;
                f8137a = i3 % 128;
                Object obj = null;
                try {
                    if (i3 % 2 == 0) {
                        ae.this.f8120b.beginTransaction();
                        ae.this.f8122d.handle(nVar);
                        ae.this.f8120b.setTransactionSuccessful();
                        ae.this.f8120b.endTransaction();
                        obj.hashCode();
                        throw null;
                    }
                    ae.this.f8120b.beginTransaction();
                    ae.this.f8122d.handle(nVar);
                    ae.this.f8120b.setTransactionSuccessful();
                    ae.this.f8120b.endTransaction();
                    int i4 = f8137a + 17;
                    f8138b = i4 % 128;
                    if (i4 % 2 == 0) {
                        return null;
                    }
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    ae.this.f8120b.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8117f + 109;
        f8118j = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.ae$9 */
    final class AnonymousClass9 implements Callable<Void> {

        /* JADX INFO: renamed from: b */
        private static int f8147b = 1;

        /* JADX INFO: renamed from: e */
        private static int f8148e = 0;

        AnonymousClass9() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            Void voidD;
            int i2 = 2 % 2;
            int i3 = f8147b + 117;
            f8148e = i3 % 128;
            if (i3 % 2 != 0) {
                voidD = d();
                int i4 = 25 / 0;
            } else {
                voidD = d();
            }
            int i5 = f8147b + 105;
            f8148e = i5 % 128;
            int i6 = i5 % 2;
            return voidD;
        }

        private Void d() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8147b + 59;
            f8148e = i3 % 128;
            int i4 = i3 % 2;
            SupportSQLiteStatement supportSQLiteStatementAcquire = ae.this.f8119a.acquire();
            try {
                ae.this.f8120b.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    ae.this.f8120b.setTransactionSuccessful();
                    ae.this.f8119a.release(supportSQLiteStatementAcquire);
                    int i5 = f8148e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f8147b = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 11 / 0;
                    }
                    return null;
                } finally {
                    ae.this.f8120b.endTransaction();
                }
            } catch (Throwable th) {
                ae.this.f8119a.release(supportSQLiteStatementAcquire);
                throw th;
            }
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.ai
    public final Completable c() {
        int i2 = 2 % 2;
        Completable completableFromCallable = Completable.fromCallable(new Callable<Void>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.ae.9

            /* JADX INFO: renamed from: b */
            private static int f8147b = 1;

            /* JADX INFO: renamed from: e */
            private static int f8148e = 0;

            AnonymousClass9() {
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                Void voidD;
                int i22 = 2 % 2;
                int i3 = f8147b + 117;
                f8148e = i3 % 128;
                if (i3 % 2 != 0) {
                    voidD = d();
                    int i4 = 25 / 0;
                } else {
                    voidD = d();
                }
                int i5 = f8147b + 105;
                f8148e = i5 % 128;
                int i6 = i5 % 2;
                return voidD;
            }

            private Void d() throws Exception {
                int i22 = 2 % 2;
                int i3 = f8147b + 59;
                f8148e = i3 % 128;
                int i4 = i3 % 2;
                SupportSQLiteStatement supportSQLiteStatementAcquire = ae.this.f8119a.acquire();
                try {
                    ae.this.f8120b.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        ae.this.f8120b.setTransactionSuccessful();
                        ae.this.f8119a.release(supportSQLiteStatementAcquire);
                        int i5 = f8148e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                        f8147b = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 11 / 0;
                        }
                        return null;
                    } finally {
                        ae.this.f8120b.endTransaction();
                    }
                } catch (Throwable th) {
                    ae.this.f8119a.release(supportSQLiteStatementAcquire);
                    throw th;
                }
            }
        });
        int i3 = f8117f + 101;
        f8118j = i3 % 128;
        int i4 = i3 % 2;
        return completableFromCallable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.ae$8 */
    public class AnonymousClass8 implements Callable<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c> {

        /* JADX INFO: renamed from: a */
        private static int f8141a = 0;

        /* JADX INFO: renamed from: b */
        public static int f8142b = 0;

        /* JADX INFO: renamed from: c */
        public static int f8143c = 0;

        /* JADX INFO: renamed from: i */
        private static int f8144i = 1;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ RoomSQLiteQuery f8145d;

        AnonymousClass8(RoomSQLiteQuery roomSQLiteQuery) {
            this.f8145d = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c call() throws Exception {
            int i2 = 2 % 2;
            int i3 = f8141a + 71;
            f8144i = i3 % 128;
            if (i3 % 2 == 0) {
                b();
                throw null;
            }
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c cVarB = b();
            int i4 = f8144i + 43;
            f8141a = i4 % 128;
            int i5 = i4 % 2;
            return cVarB;
        }

        private com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c b() throws Exception {
            String string;
            String string2;
            String string3;
            int i2 = 2 % 2;
            ae.this.f8120b.beginTransaction();
            try {
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c cVar = null;
                String string4 = null;
                Cursor cursorQuery = DBUtil.query(ae.this.f8120b, this.f8145d, true, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interview_id");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "configuration_id");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "validation_module_list");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "region_iso_code");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "queue_name");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DatabaseHelper.COLUMN_EXTERNAL_ID);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "external_customer_id");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "external_token");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "custom_fields");
                    LongSparseArray<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> longSparseArray = new LongSparseArray<>();
                    while (cursorQuery.moveToNext()) {
                        try {
                            longSparseArray.put(cursorQuery.getLong(columnIndexOrThrow), null);
                        } catch (Throwable th) {
                            th = th;
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    ae.this.a(longSparseArray);
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(columnIndexOrThrow);
                        String string5 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        if (cursorQuery.isNull(columnIndexOrThrow3)) {
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow3);
                            int i3 = f8141a + 59;
                            f8144i = i3 % 128;
                            int i4 = i3 % 2;
                        }
                        String string6 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        com.incode.welcome_sdk.data.local.model.delayed_onboarding.l lVar = ae.this.f8121c;
                        List<OnboardingValidationModule> listD = com.incode.welcome_sdk.data.local.model.delayed_onboarding.l.d(string6);
                        String string7 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        if (cursorQuery.isNull(columnIndexOrThrow6)) {
                            int i5 = f8141a + 43;
                            f8144i = i5 % 128;
                            int i6 = i5 % 2;
                            string2 = null;
                        } else {
                            string2 = cursorQuery.getString(columnIndexOrThrow6);
                        }
                        String string8 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                        String string9 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                        if (cursorQuery.isNull(columnIndexOrThrow9)) {
                            int i7 = f8144i + 51;
                            f8141a = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 12 / 0;
                            }
                            string3 = null;
                        } else {
                            string3 = cursorQuery.getString(columnIndexOrThrow9);
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow10)) {
                            int i9 = f8144i + 45;
                            int i10 = i9 % 128;
                            f8141a = i10;
                            int i11 = i9 % 2;
                            int i12 = i10 + 125;
                            f8144i = i12 % 128;
                            int i13 = i12 % 2;
                        } else {
                            string4 = cursorQuery.getString(columnIndexOrThrow10);
                        }
                        cVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.n(j2, string5, string, listD, string7, string2, string8, string9, string3, string4), longSparseArray.get(cursorQuery.getLong(columnIndexOrThrow)));
                    }
                    ae.this.f8120b.setTransactionSuccessful();
                    cursorQuery.close();
                    return cVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            } finally {
                ae.this.f8120b.endTransaction();
            }
        }

        protected final void finalize() {
            int i2 = 2 % 2;
            int i3 = f8144i + 21;
            f8141a = i3 % 128;
            int i4 = i3 % 2;
            this.f8145d.release();
            int i5 = f8144i + 47;
            f8141a = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static int a() {
            int i2 = f8143c;
            int i3 = i2 % 6353830;
            f8143c = i2 + 1;
            if (i3 != 0) {
                return f8142b;
            }
            int iNextInt = new Random().nextInt();
            f8142b = iNextInt;
            return iNextInt;
        }
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.ai
    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c> b(long j2) {
        int i2 = 2 % 2;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM session_config WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c> maybeFromCallable = Maybe.fromCallable(new AnonymousClass8(roomSQLiteQueryAcquire));
        int i3 = f8117f + 121;
        f8118j = i3 % 128;
        if (i3 % 2 == 0) {
            return maybeFromCallable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static List<Class<?>> e() {
        int i2 = 2 % 2;
        int i3 = f8117f + 7;
        f8118j = i3 % 128;
        if (i3 % 2 == 0) {
            return Collections.emptyList();
        }
        Collections.emptyList();
        throw null;
    }

    public /* synthetic */ Unit d(LongSparseArray longSparseArray) {
        int i2 = 2 % 2;
        int i3 = f8117f + 121;
        f8118j = i3 % 128;
        int i4 = i3 % 2;
        a(longSparseArray);
        Unit unit = Unit.INSTANCE;
        int i5 = f8117f + 53;
        f8118j = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    void a(LongSparseArray<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> longSparseArray) {
        int i2 = 2 % 2;
        int i3 = f8118j + 9;
        f8117f = i3 % 128;
        int i4 = i3 % 2;
        if (longSparseArray.isEmpty()) {
            return;
        }
        if (longSparseArray.size() > 999) {
            int i5 = f8118j + 117;
            f8117f = i5 % 128;
            RelationUtil.recursiveFetchLongSparseArray(longSparseArray, false, i5 % 2 == 0 ? new Function1() { // from class: com.incode.welcome_sdk.data.local.db.c.a.ae$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f$0.d((LongSparseArray) obj);
                }
            } : new Function1() { // from class: com.incode.welcome_sdk.data.local.db.c.a.ae$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f$0.d((LongSparseArray) obj);
                }
            });
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `id`,`session_config_id`,`flow_config_id`,`is_completed`,`is_synced`,`result_code` FROM `delayed_onboarding` WHERE `session_config_id` IN (");
        int size = longSparseArray.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        int i6 = 1;
        int i7 = 0;
        while (i7 < longSparseArray.size()) {
            int i8 = f8117f + 21;
            f8118j = i8 % 128;
            if (i8 % 2 != 0) {
                roomSQLiteQueryAcquire.bindLong(i6, longSparseArray.keyAt(i7));
                i6 += 89;
                i7 += 84;
            } else {
                roomSQLiteQueryAcquire.bindLong(i6, longSparseArray.keyAt(i7));
                i6++;
                i7++;
            }
        }
        Cursor cursorQuery = DBUtil.query(this.f8120b, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "session_config_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                int i9 = f8118j + 23;
                f8117f = i9 % 128;
                if (i9 % 2 == 0) {
                    longSparseArray.containsKey(cursorQuery.getLong(columnIndex));
                    throw null;
                }
                long j2 = cursorQuery.getLong(columnIndex);
                if (longSparseArray.containsKey(j2)) {
                    int i10 = f8118j + 5;
                    f8117f = i10 % 128;
                    int i11 = i10 % 2;
                    longSparseArray.put(j2, new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d(cursorQuery.getLong(0), cursorQuery.getLong(1), cursorQuery.getLong(2), cursorQuery.getInt(3) != 0, cursorQuery.getInt(4) != 0, cursorQuery.isNull(5) ? null : cursorQuery.getString(5)));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }
}
