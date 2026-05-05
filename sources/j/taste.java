package j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class taste implements tongue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f19802b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ slide f19803c;

    public taste(slide slideVar, ArrayList arrayList) {
        this.f19803c = slideVar;
        this.f19801a = arrayList;
    }

    @Override // j.tongue
    public final List a(pair pairVar) {
        ArrayList arrayList;
        HashMap map = this.f19802b;
        slide slideVar = this.f19803c;
        Object obj = map.get(pairVar);
        Object obj2 = obj;
        if (obj == null) {
            superior superiorVar = (superior) slideVar.f19796b.get(pairVar);
            if (superiorVar != null) {
                ArrayList arrayListA = superiorVar.a(this.f19801a);
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListA, 10));
                int size = arrayListA.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayListA.get(i2);
                    i2++;
                    e0.pair pairVarA = (e0.pair) obj3;
                    if (!slideVar.f19795a.f2796h || pairVarA.f18470n != e0.tongue.f18481b || (!Intrinsics.areEqual(pairVarA.f18461e, "com.google.android.packageinstaller") && !Intrinsics.areEqual(pairVarA.f18461e, "com.android.packageinstaller"))) {
                        pairVarA = e0.pair.a(pairVarA, CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
                    }
                    arrayList.add(pairVarA);
                }
            } else {
                arrayList = null;
            }
            map.put(pairVar, arrayList);
            obj2 = arrayList;
        }
        return (List) obj2;
    }
}
