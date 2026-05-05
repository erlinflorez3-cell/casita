package w0;

import com.dynatrace.android.callback.OkCallback;
import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class apparatus implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f28375a;

    public apparatus(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f28375a = cancellableContinuationImpl;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        OkCallback.onFailure_enter(call, iOException);
        try {
            CancellableContinuationImpl cancellableContinuationImpl = this.f28375a;
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(iOException)));
        } finally {
            OkCallback.onFailure_exit();
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        OkCallback.onResponse_enter(call, response);
        try {
            this.f28375a.resume(response, new tongue(response));
        } finally {
            OkCallback.onResponse_exit();
        }
    }
}
