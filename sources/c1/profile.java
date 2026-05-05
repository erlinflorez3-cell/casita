package c1;

import java.util.ArrayList;
import java.util.List;
import y0.constitutional;
import y0.guilt;
import y0.match;
import y0.wage;

/* JADX INFO: loaded from: classes4.dex */
public final class profile extends b1.superior {

    /* JADX INFO: renamed from: b */
    public static final profile f2503b = new profile();

    @Override // b1.superior
    public final List b(Object obj) {
        l0.pair pairVar = (l0.pair) obj;
        ArrayList arrayList = new ArrayList();
        if (pairVar.f19856a != null) {
            arrayList.add(((match) this.f157a.invoke()).a((wage) wage.a().a(pairVar.f19856a.booleanValue()).build()).build());
        }
        if (pairVar.f19857b != null) {
            arrayList.add(((match) this.f157a.invoke()).a((constitutional) constitutional.a().d(pairVar.f19857b.f18391a).a(pairVar.f19857b.f18392b).c(pairVar.f19857b.f18393c).b(pairVar.f19857b.f18394d).build()).build());
        }
        if (pairVar.f19859d != null) {
            arrayList.add(((match) this.f157a.invoke()).a((y0.stain) y0.stain.b().a(guilt.f28482c).a((y0.proposal) skate.f2506g.a(pairVar.f19859d)).build()).build());
        }
        return arrayList;
    }
}
