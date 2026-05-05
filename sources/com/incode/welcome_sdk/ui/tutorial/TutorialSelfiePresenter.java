package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.tutorial.TutorialSelfieContract;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialSelfiePresenter extends BaseModulePresenter implements TutorialSelfieContract.Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17901a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17902d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TutorialSelfieContract.View f17903e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public TutorialSelfiePresenter(TutorialSelfieContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.f17903e = view;
    }

    @Override // com.incode.welcome_sdk.ui.tutorial.TutorialSelfieContract.Presenter
    public final void setupUI(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17902d + 107;
        f17901a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (z2) {
            this.f17903e.showAgeAssuranceUI();
            int i4 = f17901a + 113;
            f17902d = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f17903e.showTutorialUI();
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f17902d + 17;
        f17901a = i3 % 128;
        int i4 = i3 % 2;
    }
}
