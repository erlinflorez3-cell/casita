package v0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes2.dex */
public final class tongue extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f28363a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ civilian f28364b;

    public tongue(List list, civilian civilianVar) {
        this.f28363a = list;
        this.f28364b = civilianVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List list = this.f28363a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (networkCapabilities.hasTransport(((Number) it.next()).intValue())) {
                    try {
                        if (this.f28364b.f28357c.isLocked()) {
                            Mutex.DefaultImpls.unlock$default(this.f28364b.f28357c, null, 1, null);
                            return;
                        }
                        return;
                    } catch (IllegalStateException unused) {
                        return;
                    }
                }
            }
        }
        Mutex.DefaultImpls.tryLock$default(this.f28364b.f28357c, null, 1, null);
    }
}
