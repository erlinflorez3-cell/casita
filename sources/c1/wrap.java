package c1;

import java.util.List;
import kotlin.collections.CollectionsKt;
import y0.free;
import y0.match;
import y0.survey;

/* JADX INFO: loaded from: classes4.dex */
public final class wrap extends b1.superior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wrap f2518b = new wrap();

    @Override // b1.superior
    public final List b(Object obj) {
        n0.pair pairVar = (n0.pair) obj;
        match matchVarA = ((match) this.f157a.invoke()).a(free.a().a(pairVar.f19892c).b(pairVar.f19890a).c(pairVar.f19891b).a());
        pairVar.f19893d.a(matchVarA);
        return CollectionsKt.listOf((survey) matchVarA.build());
    }
}
