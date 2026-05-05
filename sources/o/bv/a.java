package o.bv;

import android.content.Context;
import o.bv.b;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a<T extends b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21715b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21716d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T f21717e;

    public a(T t2) {
        this.f21717e = t2;
    }

    protected final boolean b(Context context) {
        int i2 = 2 % 2;
        int i3 = f21715b;
        int i4 = (i3 ^ 45) + ((i3 & 45) << 1);
        f21716d = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            this.f21717e.a(context);
            i iVar = i.f21755b;
            throw null;
        }
        if (this.f21717e.a(context) == i.f21755b) {
            int i5 = f21716d + 23;
            f21715b = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i6 = f21716d;
        int i7 = (i6 & 7) + (i6 | 7);
        f21715b = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }
}
