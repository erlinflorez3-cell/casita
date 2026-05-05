package o.fm;

/* JADX INFO: loaded from: classes6.dex */
abstract class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26053a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f26054e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26055b;

    e(boolean z2) {
        this.f26055b = z2;
    }

    final boolean b() {
        int i2 = 2 % 2;
        int i3 = f26053a + 15;
        f26054e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f26055b;
        }
        throw null;
    }

    final void c(String str) throws o.en.j {
        int i2 = 2 % 2;
        int i3 = f26053a + 7;
        f26054e = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            b();
            obj.hashCode();
            throw null;
        }
        if (!b()) {
            throw new o.en.j(str);
        }
        int i4 = f26053a;
        int i5 = (((i4 + 35) - (35 & i4)) << 1) - (i4 ^ 35);
        f26054e = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
