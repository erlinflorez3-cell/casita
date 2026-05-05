package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.tutorial.TutorialContract;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialBackPresenter extends BaseModulePresenter implements TutorialContract.Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17792a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17793e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IncodeWelcomeRepository f17794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TutorialContract.View f17795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public TutorialBackPresenter(IncodeWelcomeRepository incodeWelcomeRepository, TutorialContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f17794b = incodeWelcomeRepository;
        this.f17795c = view;
    }

    @Override // com.incode.welcome_sdk.ui.tutorial.TutorialContract.Presenter
    public final void submitCancelledResult() {
        int i2 = 2 % 2;
        IdScanResult idScanResult = new IdScanResult(null, null, -2, null, null, null, false, false, null, null, null, null, null, false, null, null, 65531, null);
        this.f17794b.persistIdBackResult(idScanResult);
        publishResultOnModuleBus(idScanResult);
        int i3 = f17793e + 93;
        f17792a = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f17792a + 13;
        f17793e = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
