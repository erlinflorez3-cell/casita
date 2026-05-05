package k;

import android.app.Application;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class skate implements j.superior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final close f19823c = new close();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final abundant f19824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19825b;

    public skate(Application application, boolean z2) {
        this.f19824a = new abundant(application);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add("android.permission.RECEIVE_BOOT_COMPLETED");
        listCreateListBuilder.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        if (z2) {
            if (i1.pair.g()) {
                listCreateListBuilder.add("android.permission.QUERY_ALL_PACKAGES");
            }
            if (i1.pair.d()) {
                listCreateListBuilder.add("android.permission.REQUEST_DELETE_PACKAGES");
            }
        }
        this.f19825b = CollectionsKt.build(listCreateListBuilder);
    }

    @Override // j.superior
    public final ArrayList a(ArrayList arrayList) {
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            e0.pair pairVar = (e0.pair) obj;
            List list = sea.f19822a;
            if ((list instanceof Collection) && list.isEmpty()) {
                z2 = true;
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (StringsKt.startsWith$default(pairVar.f18457a, (String) it.next(), false, 2, (Object) null)) {
                        z2 = false;
                        break;
                    }
                }
                z2 = true;
            }
            abundant abundantVar = this.f19824a;
            abundantVar.getClass();
            boolean zBooleanValue = Boolean.valueOf(j.gregarious.a(pairVar, abundantVar.f19810a, "android.permission.SYSTEM_ALERT_WINDOW")).booleanValue();
            List list2 = pairVar.f18467k;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z3 = false;
            } else {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((e0.civilian) it2.next()).f18454b, "android.permission.BIND_ACCESSIBILITY_SERVICE")) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            }
            if (zBooleanValue) {
                z4 = true;
                break;
            }
            if (z3) {
                List<String> list3 = this.f19825b;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (String str : list3) {
                        abundant abundantVar2 = this.f19824a;
                        abundantVar2.getClass();
                        if (Boolean.valueOf(j.gregarious.a(pairVar, abundantVar2.f19810a, str)).booleanValue()) {
                            z4 = true;
                            break;
                        }
                    }
                }
            }
            z4 = false;
            boolean z5 = pairVar.f18470n == e0.tongue.f18481b;
            String str2 = "Package name: " + pairVar.f18457a + ", isFromUnsafeVendor: " + z2 + ", hasOverlayPermissions: " + z4 + ", isInstalledByUser: " + z5;
            if (z2 && z4 && z5) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
