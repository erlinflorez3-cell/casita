package v0;

import android.net.ConnectivityManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes2.dex */
public final class superior extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConnectivityManager f28359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tongue f28360b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ civilian f28361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public superior(ConnectivityManager connectivityManager, tongue tongueVar, civilian civilianVar) {
        super(1);
        this.f28359a = connectivityManager;
        this.f28360b = tongueVar;
        this.f28361c = civilianVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f28359a.unregisterNetworkCallback(this.f28360b);
        Mutex.DefaultImpls.tryLock$default(this.f28361c.f28357c, null, 1, null);
        return Unit.INSTANCE;
    }
}
