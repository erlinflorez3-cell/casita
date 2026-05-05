package d1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pair {

    /* JADX INFO: renamed from: a */
    public final misplace f18437a;

    public pair(c.civilian civilianVar) {
        i1.misplace misplaceVar = new i1.misplace();
        misplace misplaceVar2 = new misplace(civilianVar.f2449c, misplaceVar);
        civilian civilianVar2 = new civilian(civilianVar.f2449c, misplaceVar, misplaceVar2);
        String strB = civilianVar2.f18430c.b("is_migrated");
        if (!Intrinsics.areEqual(strB != null ? Boolean.valueOf(Intrinsics.areEqual(strB, "1")) : null, Boolean.TRUE)) {
            civilianVar2.b();
            civilianVar2.a();
            civilianVar2.f18430c.a("is_migrated", "1");
        }
        this.f18437a = misplaceVar2;
    }
}
