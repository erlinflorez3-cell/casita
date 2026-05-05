package c1;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import y0.dine;
import y0.fling;
import y0.flow;
import y0.guilt;
import y0.match;
import y0.survey;

/* JADX INFO: loaded from: classes4.dex */
public final class stain extends b1.superior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final stain f2514b = new stain();

    public final survey a(List list, guilt guiltVar) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((y0.proposal) skate.f2506g.a((e0.pair) it.next()));
        }
        return (survey) ((match) this.f157a.invoke()).a((y0.stain) y0.stain.b().a(guiltVar).a(arrayList).build()).build();
    }

    @Override // b1.superior
    public final List b(Object obj) {
        flow flowVar;
        d0.civilian civilianVar = (d0.civilian) obj;
        ArrayList arrayList = new ArrayList();
        fling flingVarD = dine.a().d(civilianVar.f18402b.f18419a);
        civilianVar.f18402b.getClass();
        String str = Build.VERSION.RELEASE;
        fling flingVarE = flingVarD.b().b(civilianVar.f18402b.f18420b).g(civilianVar.f18402b.f18421c).c(civilianVar.f18402b.f18422d).f(civilianVar.f18402b.f18423e).e(civilianVar.f18402b.f18424f);
        civilianVar.f18402b.getClass();
        fling flingVarC = flingVarE.a().a(civilianVar.f18402b.f18425g).b(civilianVar.f18402b.f18426h).a(civilianVar.f18408h).c(civilianVar.f18401a);
        int iOrdinal = civilianVar.f18410j.ordinal();
        if (iOrdinal == 0) {
            flowVar = flow.f28476b;
        } else if (iOrdinal == 1) {
            flowVar = flow.f28477c;
        } else if (iOrdinal == 2) {
            flowVar = flow.f28479e;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            flowVar = flow.f28478d;
        }
        match matchVarA = ((match) this.f157a.invoke()).a((dine) flingVarC.a(flowVar).build());
        civilianVar.f18409i.a(matchVarA);
        arrayList.add(matchVarA.build());
        List list = civilianVar.f18403c;
        survey surveyVarA = list != null ? a(list, guilt.f28486g) : null;
        List list2 = civilianVar.f18404d;
        survey surveyVarA2 = list2 != null ? a(list2, guilt.f28485f) : null;
        List list3 = civilianVar.f18406f;
        survey surveyVarA3 = list3 != null ? a(list3, guilt.f28483d) : null;
        List list4 = civilianVar.f18405e;
        survey surveyVarA4 = list4 != null ? a(list4, guilt.f28484e) : null;
        List list5 = civilianVar.f18407g;
        CollectionsKt.addAll(arrayList, CollectionsKt.listOfNotNull((Object[]) new survey[]{surveyVarA, surveyVarA2, surveyVarA3, surveyVarA4, list5 != null ? a(list5, guilt.f28488i) : null}));
        return arrayList;
    }
}
