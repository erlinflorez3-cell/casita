package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Semaphore f600a = SemaphoreKt.Semaphore$default(1, 0, 2, null);

    public final synchronized Object a() {
        Object objB;
        if (this.f600a.tryAcquire()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c(this), 7, (Object) null);
            objB = b();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) d.f445a, 7, (Object) null);
            objB = null;
        }
        return objB;
    }

    public final synchronized void a(Object obj, boolean z2) {
        if (this.f600a.getAvailablePermits() != 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new a(obj, z2), 6, (Object) null);
            return;
        }
        b(obj, z2);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b(this), 6, (Object) null);
        this.f600a.release();
    }

    public abstract Object b();

    public abstract void b(Object obj, boolean z2);
}
