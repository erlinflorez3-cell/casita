package com.incode.welcome_sdk.data.local.db;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.f;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.k;
import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends RoomDatabase.Callback {

    /* JADX INFO: renamed from: d */
    private static int f8572d = 0;

    /* JADX INFO: renamed from: e */
    private static int f8573e = 1;

    @Override // androidx.room.RoomDatabase.Callback
    public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
        int i2 = 2 % 2;
        int i3 = f8573e + 53;
        f8572d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        super.onCreate(supportSQLiteDatabase);
        b();
        int i5 = f8572d + 83;
        f8573e = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void a(f[] fVarArr) {
        int i2 = 2 % 2;
        int i3 = f8573e + 25;
        f8572d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fVarArr, "");
            IncodeWelcome.Companion.getInstance().getDelayedOnboardingRepositoryComponent().a().a(fVarArr);
        } else {
            Intrinsics.checkNotNullParameter(fVarArr, "");
            IncodeWelcome.Companion.getInstance().getDelayedOnboardingRepositoryComponent().a().a(fVarArr);
            int i4 = 48 / 0;
        }
    }

    private static void b() {
        int i2 = 2 % 2;
        final f[] fVarArr = {new f(k.f8922b.b()), new f(k.f8925e.b()), new f(k.f8924d.b()), new f(k.f8921a.b()), new f(k.f8923c.b()), new f(k.f8926f.b())};
        Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.data.local.db.e$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Action
            public final void run() {
                e.a(fVarArr);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe();
        int i3 = f8573e + 49;
        f8572d = i3 % 128;
        int i4 = i3 % 2;
    }
}
