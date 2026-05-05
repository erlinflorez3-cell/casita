package c1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import y0.guilt;
import y0.match;
import y0.survey;

/* JADX INFO: loaded from: classes4.dex */
public final class cooperative extends b1.superior {

    /* JADX INFO: renamed from: c */
    public static final lifestyle f2493c = new lifestyle();

    /* JADX INFO: renamed from: b */
    public final b1.tongue f2494b = skate.f2506g;

    @Override // b1.superior
    public final List b(Object obj) {
        List list = ((e0.misplace) obj).f18456a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((y0.proposal) this.f2494b.a((e0.pair) it.next()));
        }
        return CollectionsKt.listOf((survey) ((match) this.f157a.invoke()).a((y0.stain) y0.stain.b().a(guilt.f28484e).a(arrayList).build()).build());
    }
}
