package t;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class tongue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28324a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f28325b = new ArrayList();

    public final void a(k0.pair pairVar, m0.civilian civilianVar) {
        if (civilianVar instanceof m0.tongue) {
            this.f28324a.add(new superior(pairVar, (m0.apparatus) civilianVar));
            return;
        }
        if (civilianVar instanceof m0.pair) {
            this.f28325b.add(new superior(pairVar, (m0.apparatus) civilianVar));
            return;
        }
        if (civilianVar instanceof m0.superior) {
            d0.apparatus apparatusVar = (d0.apparatus) ((m0.superior) civilianVar);
            apparatusVar.getClass();
            Iterator it = CollectionsKt.listOf((Object[]) new m0.apparatus[]{new l0.pair(apparatusVar), new l0.superior(apparatusVar)}).iterator();
            while (it.hasNext()) {
                a(pairVar, (m0.civilian) it.next());
            }
        }
    }
}
