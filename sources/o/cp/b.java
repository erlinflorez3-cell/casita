package o.cp;

import o.et.g;
import o.et.j;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends o.cn.b<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22532b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22533e = 1;

    private static j b(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        j jVar = new j(str, str2, i2, str3);
        int i4 = f22532b;
        int i5 = ((23 | i4) << 1) - (i4 ^ 23);
        f22533e = i5 % 128;
        int i6 = i5 % 2;
        return jVar;
    }

    @Override // o.cn.b
    public final /* synthetic */ g e(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = f22533e;
        int i5 = (((i4 + 83) - (83 & i4)) << 1) - (i4 ^ 83);
        f22532b = i5 % 128;
        int i6 = i5 % 2;
        j jVarB = b(str, str2, i2, str3);
        int i7 = f22533e + 25;
        f22532b = i7 % 128;
        int i8 = i7 % 2;
        return jVarB;
    }
}
