package com.incode.welcome_sdk.ui.camera.id_validation.base;

import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract;
import dagger.Module;
import dagger.Provides;

/* JADX INFO: loaded from: classes5.dex */
@Module
public class BaseValidationPresenterModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11788b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11789e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BaseValidationContract.View f11790a;

    public BaseValidationPresenterModule(BaseValidationContract.View view) {
        this.f11790a = view;
    }

    @Provides
    BaseValidationContract.View b() {
        int i2 = 2 % 2;
        int i3 = f11789e + 15;
        int i4 = i3 % 128;
        f11788b = i4;
        int i5 = i3 % 2;
        BaseValidationContract.View view = this.f11790a;
        int i6 = i4 + 47;
        f11789e = i6 % 128;
        if (i6 % 2 == 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
