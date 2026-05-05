package c1;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import y0.hay;
import y0.match;
import y0.professor;
import y0.survey;

/* JADX INFO: loaded from: classes4.dex */
public final class sea extends b1.superior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sea f2505b = new sea();

    @Override // b1.superior
    public final List b(Object obj) {
        i0.tongue tongueVar = (i0.tongue) obj;
        hay hayVar = (hay) hay.a().a("uniqueid").b(tongueVar.f19708b).build();
        List<i0.superior> list = tongueVar.f19707a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (i0.superior superiorVar : list) {
            arrayList.add((y0.crisis) y0.crisis.a().a(superiorVar.f19703a).a().b(superiorVar.f19705c).c(superiorVar.f19706d).build());
        }
        match matchVarA = ((match) this.f157a.invoke()).a((professor) professor.d().a(hayVar).c(tongueVar.f19709c).a(arrayList).build());
        tongueVar.f19710d.a(matchVarA);
        return CollectionsKt.listOf((survey) matchVarA.build());
    }
}
