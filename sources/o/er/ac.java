package o.er;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ac extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f24801f = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f24802j = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o.ex.e f24803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24804h;

    public ac(boolean z2, String str, List<o.ex.c> list) {
        super(z2);
        this.f24804h = str;
        o.ex.e eVar = new o.ex.e();
        this.f24803g = eVar;
        if (list != null) {
            eVar.c(list);
        }
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f24801f;
        int i4 = i3 + 67;
        f24802j = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f24804h;
        int i5 = i3 + 117;
        f24802j = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean c(o.ex.c cVar) {
        int i2 = 2 % 2;
        int i3 = f24802j;
        int i4 = i3 + 33;
        f24801f = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        o.ex.e eVar = this.f24803g;
        if (eVar == null) {
            Boolean bool = Boolean.FALSE;
            int i5 = f24802j + 97;
            f24801f = i5 % 128;
            if (i5 % 2 == 0) {
                return bool;
            }
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 27;
        f24801f = i6 % 128;
        int i7 = i6 % 2;
        Boolean boolB = eVar.b(cVar);
        int i8 = f24802j;
        int i9 = (i8 ^ 125) + (((i8 + 125) - (i8 | 125)) << 1);
        f24801f = i9 % 128;
        if (i9 % 2 == 0) {
            return boolB;
        }
        obj.hashCode();
        throw null;
    }
}
