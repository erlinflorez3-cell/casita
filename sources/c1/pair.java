package c1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import y0.hay;
import y0.match;
import y0.professor;
import y0.survey;

/* JADX INFO: loaded from: classes4.dex */
public final class pair extends b1.superior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pair f2502b = new pair();

    @Override // b1.superior
    public final List b(Object obj) {
        i0.pair pairVar = (i0.pair) obj;
        LinkedHashMap linkedHashMap = pairVar.f19700f;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add((hay) hay.a().a((String) entry.getKey()).b((String) entry.getValue()).build());
        }
        List<i0.superior> list = pairVar.f19695a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (i0.superior superiorVar : list) {
            arrayList2.add((y0.crisis) y0.crisis.a().a(superiorVar.f19703a).a().b(superiorVar.f19705c).c(superiorVar.f19706d).build());
        }
        match matchVarA = ((match) this.f157a.invoke()).a((professor) professor.d().b(pairVar.f19698d).c(pairVar.f19697c).a(pairVar.f19699e).a(pairVar.f19701g).b(arrayList).a(arrayList2).build());
        pairVar.f19702h.a(matchVarA);
        return CollectionsKt.listOf((survey) matchVarA.build());
    }
}
