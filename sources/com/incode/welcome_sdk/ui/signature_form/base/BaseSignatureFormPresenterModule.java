package com.incode.welcome_sdk.ui.signature_form.base;

import com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract;
import dagger.Module;
import dagger.Provides;

/* JADX INFO: loaded from: classes5.dex */
@Module
public class BaseSignatureFormPresenterModule {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17475d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17476e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BaseSignatureFormContract.View f17477c;

    public BaseSignatureFormPresenterModule(BaseSignatureFormContract.View view) {
        this.f17477c = view;
    }

    @Provides
    BaseSignatureFormContract.View e() {
        int i2 = 2 % 2;
        int i3 = f17475d + 51;
        int i4 = i3 % 128;
        f17476e = i4;
        int i5 = i3 % 2;
        BaseSignatureFormContract.View view = this.f17477c;
        int i6 = i4 + 1;
        f17475d = i6 % 128;
        if (i6 % 2 == 0) {
            return view;
        }
        throw null;
    }
}
