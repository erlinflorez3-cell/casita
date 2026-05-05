package r0;

import d1.misplace;
import i1.close;

/* JADX INFO: loaded from: classes2.dex */
public final class civilian {

    /* JADX INFO: renamed from: a */
    public final misplace f28266a;

    public civilian(misplace misplaceVar) {
        this.f28266a = misplaceVar;
    }

    public final String a() {
        String strB = this.f28266a.b("browser_id");
        if (strB == null) {
            strB = null;
        }
        if (strB != null && strB.length() != 0) {
            String str = "Browser ID: " + strB;
            return strB;
        }
        String strA = close.a();
        this.f28266a.a("browser_id", strA != null ? strA : null);
        String str2 = "New Browser ID: " + strA;
        return strA;
    }
}
