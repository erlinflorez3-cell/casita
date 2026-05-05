package o.bq;

/* JADX INFO: loaded from: classes6.dex */
final class c {

    static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final o.ej.c[] f21536b = {o.ej.c.f23962e, o.ej.c.f23961d};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f21537c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f21538d = 1;

        static {
            o.ej.c[] cVarArr = new o.ej.c[2];
            o.ej.c cVar = o.ej.c.f23959b;
            o.ej.c cVar2 = o.ej.c.f23958a;
            int i2 = f21537c;
            int i3 = (i2 ^ 1) + (((-1) - (((-1) - i2) | ((-1) - 1))) << 1);
            f21538d = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    c() {
    }
}
