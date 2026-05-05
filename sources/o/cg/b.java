package o.cg;

import android.content.Context;
import o.ea.m;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22245f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22246h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22247i;

    public b(Context context, int i2, String str) {
        super(context, i2);
        this.f22247i = str;
    }

    @Override // o.cg.f
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f22245f + 51;
        int i4 = i3 % 128;
        f22246h = i4;
        int i5 = i3 % 2;
        String str = this.f22247i;
        int i6 = i4 + 67;
        f22245f = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 10 / 0;
        }
        return str;
    }

    @Override // o.cg.f
    public final void d() throws o.ef.b, o.bt.b, o.bu.c, o.bw.d {
        int i2 = 2 % 2;
        int i3 = f22246h + 11;
        f22245f = i3 % 128;
        if (i3 % 2 == 0) {
            j();
            l();
            m();
            o();
            n();
            m.c.d(h(), 2, 4, 3, 9, 8);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        j();
        l();
        m();
        o();
        n();
        if (m.c.d(h(), 2, 4, 3, 9, 8)) {
            k();
            int i4 = f22245f + 81;
            f22246h = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
