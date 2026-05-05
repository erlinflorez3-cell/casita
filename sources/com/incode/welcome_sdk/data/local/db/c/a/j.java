package com.incode.welcome_sdk.data.local.db.c.a;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.incode.welcome_sdk.ui.aes.AESViewModel;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8254e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f8255j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.incode.welcome_sdk.data.local.model.delayed_onboarding.h f8256a = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final RoomDatabase f8257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.c> f8258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedSQLiteStatement f8259d;

    public j(RoomDatabase roomDatabase) {
        this.f8257b = roomDatabase;
        this.f8258c = new EntityInsertionAdapter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.c>(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.j.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8260a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f8261d = 0;

            @Override // androidx.room.EntityInsertionAdapter
            protected final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.c cVar) throws JSONException {
                int i2 = 2 % 2;
                int i3 = f8260a + 9;
                f8261d = i3 % 128;
                int i4 = i3 % 2;
                c(supportSQLiteStatement, cVar);
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
                int i3 = f8260a + 59;
                f8261d = i3 % 128;
                if (i3 % 2 == 0) {
                    return "INSERT OR REPLACE INTO `document_scan_result` (`id`,`document_scan_id`,`is_success`,`document_Type`,`document_ocr_data`,`document_extended_ocr_data`,`error`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
                }
                throw null;
            }

            private void c(SupportSQLiteStatement supportSQLiteStatement, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.c cVar) throws JSONException {
                int i2 = 2 % 2;
                int i3 = 1;
                supportSQLiteStatement.bindLong(1, cVar.b());
                supportSQLiteStatement.bindLong(2, cVar.a());
                if (cVar.d()) {
                    int i4 = f8260a + 1;
                    int i5 = i4 % 128;
                    f8261d = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 41;
                    f8260a = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    i3 = 0;
                }
                supportSQLiteStatement.bindLong(3, i3);
                if (cVar.c() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, j.e(cVar.c()));
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.h hVar = j.this.f8256a;
                String strE = com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e((Map) com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.c.b(new Object[]{cVar}, AESViewModel.l.c(), 1179719868, -1179719867, AESViewModel.l.c(), AESViewModel.l.c(), AESViewModel.l.c()));
                if (strE == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, strE);
                }
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.h hVar2 = j.this.f8256a;
                String strE2 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e((Map) com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.c.b(new Object[]{cVar}, AESViewModel.l.c(), 1460091836, -1460091836, AESViewModel.l.c(), AESViewModel.l.c(), AESViewModel.l.c()));
                if (strE2 == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, strE2);
                }
                if (cVar.j() != null) {
                    supportSQLiteStatement.bindString(7, cVar.j());
                    return;
                }
                int i9 = f8261d + 67;
                f8260a = i9 % 128;
                int i10 = i9 % 2;
                supportSQLiteStatement.bindNull(7);
                int i11 = f8261d + 39;
                f8260a = i11 % 128;
                int i12 = i11 % 2;
            }
        };
        this.f8259d = new SharedSQLiteStatement(roomDatabase) { // from class: com.incode.welcome_sdk.data.local.db.c.a.j.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f8270a = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8271e = 1;

            @Override // androidx.room.SharedSQLiteStatement
            public final String createQuery() {
                int i2 = 2 % 2;
                int i3 = f8270a + 93;
                int i4 = i3 % 128;
                f8271e = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 97;
                f8270a = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 40 / 0;
                }
                return "DELETE FROM document_scan_result";
            }
        };
    }

    @Override // com.incode.welcome_sdk.data.local.db.c.a.h
    public final Single<Long> a(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.c cVar) {
        int i2 = 2 % 2;
        Single<Long> singleFromCallable = Single.fromCallable(new Callable<Long>() { // from class: com.incode.welcome_sdk.data.local.db.c.a.j.3

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f8263c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f8264e = 0;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Long call() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8263c + 95;
                f8264e = i4 % 128;
                int i5 = i4 % 2;
                Long lC = c();
                int i6 = f8264e + 11;
                f8263c = i6 % 128;
                int i7 = i6 % 2;
                return lC;
            }

            private Long c() throws Exception {
                int i3 = 2 % 2;
                int i4 = f8263c + 117;
                f8264e = i4 % 128;
                int i5 = i4 % 2;
                j.this.f8257b.beginTransaction();
                try {
                    Long lValueOf = Long.valueOf(j.this.f8258c.insertAndReturnId(cVar));
                    j.this.f8257b.setTransactionSuccessful();
                    j.this.f8257b.endTransaction();
                    int i6 = f8264e + 29;
                    f8263c = i6 % 128;
                    if (i6 % 2 != 0) {
                        return lValueOf;
                    }
                    throw null;
                } catch (Throwable th) {
                    j.this.f8257b.endTransaction();
                    throw th;
                }
            }
        });
        int i3 = f8255j + 31;
        f8254e = i3 % 128;
        if (i3 % 2 == 0) {
            return singleFromCallable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static List<Class<?>> d() {
        int i2 = 2 % 2;
        int i3 = f8255j + 61;
        f8254e = i3 % 128;
        int i4 = i3 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i5 = f8255j + 89;
        f8254e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return listEmptyList;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.db.c.a.j$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f8268b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f8269e = 1;

        static {
            int[] iArr = new int[DocumentType.values().length];
            f8267a = iArr;
            try {
                iArr[DocumentType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8267a[DocumentType.FRONT_ID.ordinal()] = 2;
                int i2 = f8269e + 47;
                f8268b = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8267a[DocumentType.BACK_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8267a[DocumentType.ADDRESS_STATEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8267a[DocumentType.PAYMENT_PROOF.ordinal()] = 5;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8267a[DocumentType.MEDICAL_DOC.ordinal()] = 6;
                int i6 = f8269e + 105;
                f8268b = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8267a[DocumentType.OTHER_DOCUMENT_1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8267a[DocumentType.OTHER_DOCUMENT_2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8267a[DocumentType.OTHER_DOCUMENT_3.ordinal()] = 9;
                int i9 = f8269e + 23;
                f8268b = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8267a[DocumentType.PASSPORT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static String e(DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = f8254e + 109;
        f8255j = i3 % 128;
        int i4 = i3 % 2;
        switch (AnonymousClass4.f8267a[documentType.ordinal()]) {
            case 1:
                return "NONE";
            case 2:
                return "FRONT_ID";
            case 3:
                int i5 = f8255j + 61;
                f8254e = i5 % 128;
                int i6 = i5 % 2;
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
}
