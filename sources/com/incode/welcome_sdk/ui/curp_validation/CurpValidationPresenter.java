package com.incode.welcome_sdk.ui.curp_validation;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.results.CurpValidationResult;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.curp_validation.CurpValidationContract;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CurpValidationPresenter extends BaseModulePresenter implements CurpValidationContract.Presenter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13102b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13103c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CurpValidationContract.View f13104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public CurpValidationPresenter(CurpValidationContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.f13104d = view;
    }

    @Override // com.incode.welcome_sdk.ui.curp_validation.CurpValidationContract.Presenter
    public final void publishResult(CurpValidationResult curpValidationResult) {
        int i2 = 2 % 2;
        int i3 = f13102b + 3;
        f13103c = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(curpValidationResult, "");
            publishResult(IncodeWelcome.Companion.getInstance().getCurpValidationBus(), curpValidationResult);
        } else {
            Intrinsics.checkNotNullParameter(curpValidationResult, "");
            publishResult(IncodeWelcome.Companion.getInstance().getCurpValidationBus(), curpValidationResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.curp_validation.CurpValidationContract.Presenter
    public final void notifyResult(CurpValidationResult curpValidationResult) {
        int i2 = 2 % 2;
        int i3 = f13102b + 95;
        f13103c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(curpValidationResult, "");
            IncodeWelcome.Companion.getInstance().getCurpValidationBus().onNext(curpValidationResult);
            throw null;
        }
        Intrinsics.checkNotNullParameter(curpValidationResult, "");
        IncodeWelcome.Companion.getInstance().getCurpValidationBus().onNext(curpValidationResult);
        int i4 = f13103c + 63;
        f13102b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f13102b + 115;
        f13103c = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
