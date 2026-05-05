package bo.app;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class kr implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pr f1138a;

    public kr(pr prVar) {
        this.f1138a = prVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f1138a) {
            pr prVar = this.f1138a;
            if (prVar.f1541i == null) {
                return null;
            }
            while (prVar.f1540h > prVar.f1538f) {
                prVar.d((String) ((Map.Entry) prVar.f1542j.entrySet().iterator().next()).getKey());
            }
            if (this.f1138a.a()) {
                this.f1138a.d();
                this.f1138a.f1543k = 0;
            }
            return null;
        }
    }
}
