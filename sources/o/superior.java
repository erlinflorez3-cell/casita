package o;

import android.location.Location;
import java.util.function.Consumer;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class superior implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f26797a;

    public superior(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f26797a = cancellableContinuationImpl;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f26797a;
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(Result.m8980constructorimpl((Location) obj));
    }
}
