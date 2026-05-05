package o.dg;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static e f23006b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23007c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23008d = 0;

    private e(Context context) {
        super(context);
    }

    public static synchronized e a(Context context) {
        e eVar;
        int i2 = 2 % 2;
        int i3 = f23008d;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 25))) << 1) - (i3 ^ 25);
        int i5 = i4 % 128;
        f23007c = i5;
        int i6 = i4 % 2;
        if (f23006b == null) {
            int i7 = i5 + 101;
            f23008d = i7 % 128;
            if (i7 % 2 != 0) {
                e(context);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            e(context);
        }
        eVar = f23006b;
        int i8 = f23008d;
        int i9 = (i8 ^ 93) + (((-1) - (((-1) - i8) | ((-1) - 93))) << 1);
        f23007c = i9 % 128;
        int i10 = i9 % 2;
        return eVar;
    }

    private static synchronized void e(Context context) {
        int i2 = 2 % 2;
        f23006b = new e(context);
        int i3 = f23008d;
        int i4 = ((i3 + 21) - (21 | i3)) + (i3 | 21);
        f23007c = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.dg.c
    public final /* bridge */ /* synthetic */ void e(Context context, List list) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23008d;
        int i4 = (((i3 + 109) - (109 & i3)) << 1) - (i3 ^ 109);
        f23007c = i4 % 128;
        int i5 = i4 % 2;
        super.e(context, list);
        if (i5 == 0) {
            throw null;
        }
        int i6 = f23007c;
        int i7 = (i6 ^ 7) + ((i6 & 7) << 1);
        f23008d = i7 % 128;
        int i8 = i7 % 2;
    }
}
