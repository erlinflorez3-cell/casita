package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.tutorial.TutorialContract;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialFrontPresenter extends BaseModulePresenter implements TutorialContract.Presenter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17846b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17847c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IncodeWelcomeRepository f17848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public TutorialFrontPresenter(IncodeWelcomeRepository incodeWelcomeRepository, TutorialContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f17848d = incodeWelcomeRepository;
    }

    @Override // com.incode.welcome_sdk.ui.tutorial.TutorialContract.Presenter
    public final void submitCancelledResult() {
        int i2 = 2 % 2;
        IdScanResult idScanResult = new IdScanResult(null, null, -2, null, null, null, false, false, null, null, null, null, null, false, null, null, 65531, null);
        this.f17848d.persistIdFrontResult(idScanResult);
        publishResultOnModuleBus(idScanResult);
        int i3 = f17847c + 15;
        f17846b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f17847c + 55;
        f17846b = i3 % 128;
        int i4 = i3 % 2;
    }
}
