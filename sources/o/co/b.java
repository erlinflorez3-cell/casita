package o.co;

import android.os.Process;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends a<o.et.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22524a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f22525b = 1931894271;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f22526c = 1738735540;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f22527d = -2022310912;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22528e = 0;

    private static /* synthetic */ Object a(Object[] objArr) {
        b bVar = (b) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        String str3 = (String) objArr[4];
        int i2 = 2 % 2;
        int i3 = f22524a;
        int i4 = (i3 ^ 65) + (((i3 + 65) - (i3 | 65)) << 1);
        f22528e = i4 % 128;
        if (i4 % 2 == 0) {
            return super.c(str, str2, iIntValue, str3);
        }
        super.c(str, str2, iIntValue, str3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~((-1) - (((-1) - i8) & ((-1) - i6)));
        int i10 = ~i3;
        int i11 = ~i6;
        int i12 = (-1) - (((-1) - i9) & ((-1) - (~(((-1) - (((-1) - i10) & ((-1) - i11))) | i7))));
        int i13 = ~((-1) - (((-1) - i11) & ((-1) - i8)));
        int i14 = ~(i6 | i10 | i7);
        int i15 = (i14 + i13) - (i14 & i13);
        int i16 = ~((i8 + i10) - (i8 & i10));
        int i17 = i3 + i7 + i2 + (563899752 * i4) + (667302295 * i5);
        int i18 = i17 * i17;
        int i19 = ((i3 * 1426164010) - 416808960) + (1426164010 * i7) + (i12 * 480671447) + (i15 * 480671447) + (480671447 * i16) + (1906835456 * i2) + ((-1270874112) * i4) + (1914175488 * i5) + ((-1995833344) * i18);
        int i20 = (i3 * (-901935710)) + 144807674 + (i7 * (-901935710)) + (i12 * 171) + (i15 * 171) + (i16 * 171) + (i2 * (-901935539)) + (i4 * 42244168) + (i5 * (-913566613)) + (i18 * (-1006501888));
        return i19 + ((i20 * i20) * (-1006239744)) != 1 ? c(objArr) : a(objArr);
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f22528e;
        int i4 = (i3 & 9) + ((-1) - (((-1) - i3) & ((-1) - 9)));
        f22524a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return null;
    }

    @Override // o.co.a
    public final /* synthetic */ o.et.a c(String str, String str2, int i2, String str3) {
        Object[] objArr = {this, str, str2, Integer.valueOf(i2), str3};
        int priority = Thread.currentThread().getPriority();
        int id = (int) Thread.currentThread().getId();
        int i3 = f22525b * (-1528403374);
        f22525b = i3;
        return (o.et.a) c(id, 197112690, i3, new Random().nextInt(), objArr, priority, -197112689);
    }

    @Override // o.co.a
    final void c(List<o.et.a> list, o.ef.a aVar) {
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = f22527d * 2133415709;
        f22527d = i2;
        int i3 = f22526c * 1708475495;
        f22526c = i3;
        c(i2, -224017720, i3, (int) Runtime.getRuntime().totalMemory(), new Object[]{this, list, aVar}, elapsedCpuTime, 224017720);
    }

    @Override // o.co.a, o.cl.c
    public final /* bridge */ /* synthetic */ List d(String str, String str2, int i2, String str3, o.ef.a aVar) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22524a;
        int i5 = ((i4 + 21) - (21 | i4)) + ((i4 + 21) - (i4 & 21));
        f22528e = i5 % 128;
        int i6 = i5 % 2;
        List listD = super.d(str, str2, i2, str3, aVar);
        int i7 = f22528e;
        int i8 = ((57 | i7) << 1) - (i7 ^ 57);
        f22524a = i8 % 128;
        int i9 = i8 % 2;
        return listD;
    }

    @Override // o.co.a
    final o.et.a e(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        o.et.a aVar = new o.et.a(str, str2, i2, str3);
        int i4 = f22524a;
        int i5 = (i4 ^ 1) + (((-1) - (((-1) - i4) | ((-1) - 1))) << 1);
        f22528e = i5 % 128;
        int i6 = i5 % 2;
        return aVar;
    }
}
