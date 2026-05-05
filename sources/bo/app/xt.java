package bo.app;

import com.dynatrace.android.callback.Callback;
import java.net.HttpURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class xt extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2243a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt(Ref.ObjectRef objectRef) {
        super(0);
        this.f2243a = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "DUST stream response code " + Callback.getResponseCode((HttpURLConnection) this.f2243a.element);
    }
}
