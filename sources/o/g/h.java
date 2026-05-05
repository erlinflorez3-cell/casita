package o.g;

import java.util.Date;
import o.g.a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26234a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26235b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f26236c;

    h(a.b bVar, Date date, d dVar) {
        super(bVar, date);
        this.f26236c = dVar;
    }

    final d m() {
        int i2 = 2 % 2;
        int i3 = f26234a;
        int i4 = (i3 ^ 17) + (((-1) - (((-1) - i3) | ((-1) - 17))) << 1);
        f26235b = i4 % 128;
        if (i4 % 2 != 0) {
            return this.f26236c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
