package k;

import android.app.Application;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class fabricate implements j.superior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gregarious f19815c = new gregarious();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final slide f19816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19817b;

    public fabricate(Application application) {
        slide slideVar = new slide(application);
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOf((Object[]) new String[]{"android.permission.NFC", "android.permission.BIND_NFC_SERVICE"}), (Iterable) (i1.pair.g() ? CollectionsKt.listOf((Object[]) new String[]{"android.permission.NFC_PREFERRED_PAYMENT_INFO", "android.permission.NFC_TRANSACTION_EVENT"}) : i1.pair.e() ? CollectionsKt.listOf("android.permission.NFC_TRANSACTION_EVENT") : CollectionsKt.emptyList()));
        this.f19816a = slideVar;
        this.f19817b = listPlus;
    }

    @Override // j.superior
    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            e0.pair pairVar = (e0.pair) obj;
            if (pairVar.f18470n == e0.tongue.f18481b) {
                List list = this.f19817b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            slide slideVar = this.f19816a;
                            slideVar.getClass();
                            if (Boolean.valueOf(j.gregarious.a(pairVar, slideVar.f19826a, str)).booleanValue()) {
                                arrayList2.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return arrayList2;
    }
}
