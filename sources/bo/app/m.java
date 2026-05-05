package bo.app;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends p40 {
    public m(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // bo.app.n00
    public final boolean a(g10 g10Var) {
        Iterator it = this.f1485a.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (!((n00) it.next()).a(g10Var)) {
                return false;
            }
            z2 = true;
        }
        return z2;
    }
}
