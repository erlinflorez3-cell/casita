package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class r8 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public r8(CoroutineExceptionHandler.Key key) {
        super(key);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) BrazeCoroutineScope.INSTANCE, BrazeLogger.Priority.E, th, false, (Function0) new p8(th), 4, (Object) null);
    }
}
