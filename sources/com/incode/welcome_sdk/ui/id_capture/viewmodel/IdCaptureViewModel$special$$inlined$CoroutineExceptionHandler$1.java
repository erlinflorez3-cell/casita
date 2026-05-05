package com.incode.welcome_sdk.ui.id_capture.viewmodel;

import com.incode.welcome_sdk.commons.exceptions.DeviceEnvironmentException;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureViewModel$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f16223a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16224d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ IdCaptureViewModel f16225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdCaptureViewModel$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key, IdCaptureViewModel idCaptureViewModel) {
        super(key);
        this.f16225e = idCaptureViewModel;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        int i2 = 2 % 2;
        Timber.Forest.e(th);
        if (!(th instanceof IdCaptureUploadError.RetryCountLimit)) {
            int i3 = f16223a + 27;
            f16224d = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z2 = th instanceof DeviceEnvironmentException;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(th instanceof DeviceEnvironmentException)) {
                IdCaptureViewModel.access$showError(this.f16225e, th);
                int i4 = f16223a + 27;
                f16224d = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 97 / 0;
                    return;
                }
                return;
            }
        }
        if (th instanceof DeviceEnvironmentException) {
            IdCaptureViewModel.access$getIdCaptureRepository$p(this.f16225e).reportTerminalError(th);
            int i6 = f16223a + 47;
            f16224d = i6 % 128;
            int i7 = i6 % 2;
        }
        IdCaptureViewModel.access$getActivityActionsHandler$p(this.f16225e).getCloseScreenAction().invoke();
    }
}
