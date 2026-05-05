package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.results.NfcScanResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.tutorial.IDTypeChooserContract;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IDTypeChooserPresenter extends BaseModulePresenter implements IDTypeChooserContract.Presenter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17758b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17759c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IncodeWelcomeRepository f17760e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public IDTypeChooserPresenter(IncodeWelcomeRepository incodeWelcomeRepository, IDTypeChooserContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f17760e = incodeWelcomeRepository;
    }

    @Override // com.incode.welcome_sdk.ui.tutorial.IDTypeChooserContract.Presenter
    public final void submitCancelledResult() {
        int i2 = 2 % 2;
        IdScanResult idScanResult = new IdScanResult(null, null, -2, null, null, null, false, false, null, null, null, null, null, false, null, null, 65531, null);
        this.f17760e.persistIdFrontResult(idScanResult);
        publishResultOnModuleBus(idScanResult);
        int i3 = f17759c + 45;
        f17758b = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void submitNFCCancelledResult() {
        int i2 = 2 % 2;
        publishResult(IncodeWelcome.Companion.getInstance().getNfcScanBus(), new NfcScanResult(ResultCode.USER_CANCELLED, null, (char) 0, null, (char) 0, null, (char) 0, null, null, (char) 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null));
        int i3 = f17759c + 91;
        f17758b = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    @Override // com.incode.welcome_sdk.ui.tutorial.IDTypeChooserContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void persistIdType(com.incode.welcome_sdk.modules.IdScan.IdType r4, com.incode.welcome_sdk.IdCategory r5) {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.tutorial.IDTypeChooserPresenter.f17759c
            int r1 = r0 + 19
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.tutorial.IDTypeChooserPresenter.f17758b = r0
            int r1 = r1 % r2
            java.lang.String r0 = ""
            if (r1 != 0) goto L4e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
            com.incode.welcome_sdk.IncodeWelcome r0 = r0.getInstance()
            boolean r1 = r0.isDelayedMode()
            r0 = 37
            int r0 = r0 / 0
            if (r1 == 0) goto L3e
        L26:
            int r0 = com.incode.welcome_sdk.ui.tutorial.IDTypeChooserPresenter.f17759c
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.tutorial.IDTypeChooserPresenter.f17758b = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L44
            com.incode.welcome_sdk.c$b r0 = com.incode.welcome_sdk.c.f4426a
            com.incode.welcome_sdk.c r0 = com.incode.welcome_sdk.c.b.d()
            r0.e(r4)
            r0 = 36
            int r0 = r0 / 0
        L3e:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r3.f17760e
            r0.persistIdType(r4, r5)
            return
        L44:
            com.incode.welcome_sdk.c$b r0 = com.incode.welcome_sdk.c.f4426a
            com.incode.welcome_sdk.c r0 = com.incode.welcome_sdk.c.b.d()
            r0.e(r4)
            goto L3e
        L4e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
            com.incode.welcome_sdk.IncodeWelcome r0 = r0.getInstance()
            boolean r0 = r0.isDelayedMode()
            if (r0 == 0) goto L3e
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.tutorial.IDTypeChooserPresenter.persistIdType(com.incode.welcome_sdk.modules.IdScan$IdType, com.incode.welcome_sdk.IdCategory):void");
    }

    @Override // com.incode.welcome_sdk.ui.tutorial.IDTypeChooserContract.Presenter
    public final void persistNfcIdType(IdScan.IdType idType) {
        int i2 = 2 % 2;
        int i3 = f17758b + 101;
        f17759c = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(idType, "");
            this.f17760e.persistNfcIdType(idType);
        } else {
            Intrinsics.checkNotNullParameter(idType, "");
            this.f17760e.persistNfcIdType(idType);
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f17758b + 73;
        f17759c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
    }
}
