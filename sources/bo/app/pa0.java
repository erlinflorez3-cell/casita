package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class pa0 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public pa0(CoroutineExceptionHandler.Key key) {
        super(key);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) qa0.f1589a, BrazeLogger.Priority.E, th, false, (Function0) new oa0(th), 4, (Object) null);
            v00 v00Var = qa0.f1590b;
            if (v00Var != null) {
                ((vw) v00Var).b(Throwable.class, th);
            }
        } catch (Exception unused) {
        }
    }
}
