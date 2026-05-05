package w;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class superior extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Application f28372a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public superior(Application application) {
        super(1);
        this.f28372a = application;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f28372a.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) obj);
        return Unit.INSTANCE;
    }
}
