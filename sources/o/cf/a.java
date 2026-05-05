package o.cf;

import android.content.Context;
import android.os.Process;
import fr.antelop.sdk.exception.WalletValidationException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f22195b = 1646580854;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f22196c = -318232637;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f22197d = 1093138269;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f22198f = -1319342159;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f22199g = 217697139;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f22200i = 386356063;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f22201j = -1530371942;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f22202n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f22203o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f22204a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f22205e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o.en.b f22206h;

    protected a(Context context, c cVar, o.en.b bVar) {
        this.f22205e = context;
        this.f22204a = cVar;
        this.f22206h = bVar;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        a aVar = (a) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f22203o;
        int i4 = ((i3 | 123) << 1) - (i3 ^ 123);
        f22202n = i4 % 128;
        int i5 = i4 % 2;
        boolean zEquals = super.equals(obj);
        int i6 = f22202n;
        int i7 = (((-1) - (((-1) - i6) & ((-1) - 81))) << 1) - (i6 ^ 81);
        f22203o = i7 % 128;
        if (i7 % 2 == 0) {
            return Boolean.valueOf(zEquals);
        }
        int i8 = 37 / 0;
        return Boolean.valueOf(zEquals);
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f22203o + 83;
        f22202n = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.finalize();
            return null;
        }
        super.finalize();
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object b(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) throws CloneNotSupportedException {
        int i8 = ~i5;
        int i9 = ~i4;
        int i10 = ~(i8 | i9);
        int i11 = ~i3;
        int i12 = ~((i11 + i5) - (i11 & i5));
        int i13 = i10 | i12 | (~(i5 | i4));
        int i14 = (-1) - (((-1) - (~(i4 | i3))) & ((-1) - (~((-1) - (((-1) - i8) & ((-1) - i3))))));
        int i15 = (i9 + i12) - (i9 & i12);
        int i16 = i3 + i5 + i6 + (793188503 * i7) + (2090109681 * i2);
        int i17 = i16 * i16;
        int i18 = (837707615 * i3) + 1286602752 + ((-1676358574) * i5) + (i13 * (-838022063)) + (1676044126 * i14) + ((-838022063) * i15) + ((-838336512) * i6) + (1186463744 * i7) + (1166540800 * i2) + ((-1956446208) * i17);
        int i19 = ((i3 * 1389925299) - 652765764) + (i5 * 1389927018) + (i13 * 573) + (i14 * (-1146)) + (i15 * 573) + (i6 * 1389926445) + (i7 * (-1551828341)) + (i2 * (-2047638435)) + (i17 * 1214709760);
        int i20 = i18 + (i19 * i19 * 445972480);
        if (i20 == 1) {
            return a(objArr);
        }
        if (i20 == 2) {
            return e(objArr);
        }
        if (i20 != 3) {
            return b(objArr);
        }
        int i21 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f22203o;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 123))) + ((-1) - (((-1) - i3) & ((-1) - 123)));
        f22202n = i4 % 128;
        int i5 = i4 % 2;
        Context context = aVar.f22205e;
        if (i5 == 0) {
            int i6 = 36 / 0;
        }
        return context;
    }

    public final Context a() {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int iMyUid = Process.myUid();
        int i2 = f22198f * (-1826585863);
        f22198f = i2;
        int i3 = f22199g * 1715447060;
        f22199g = i3;
        return (Context) b(new Object[]{this}, i3, -487326310, iMaxMemory, 487326312, iMyUid, i2);
    }

    public final o.en.b b() {
        int i2 = 2 % 2;
        int i3 = f22202n + 97;
        int i4 = i3 % 128;
        f22203o = i4;
        int i5 = i3 % 2;
        o.en.b bVar = this.f22206h;
        int i6 = ((-1) - (((-1) - i4) | ((-1) - 61))) + ((-1) - (((-1) - i4) & ((-1) - 61)));
        f22202n = i6 % 128;
        int i7 = i6 % 2;
        return bVar;
    }

    public final c c() {
        int i2 = 2 % 2;
        int i3 = f22202n;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 61))) << 1) - (i3 ^ 61);
        int i5 = i4 % 128;
        f22203o = i5;
        int i6 = i4 % 2;
        c cVar = this.f22204a;
        int i7 = i5 + 83;
        f22202n = i7 % 128;
        int i8 = i7 % 2;
        return cVar;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = f22200i * (-2072115729);
        f22200i = i2;
        return b(new Object[]{this}, (int) Thread.currentThread().getId(), 192447742, i2, -192447739, (int) Process.getElapsedCpuTime(), Process.myUid());
    }

    public abstract void e(o.i.d dVar) throws WalletValidationException;

    public final boolean equals(Object obj) {
        int i2 = f22196c * (-436897609);
        f22196c = i2;
        int i3 = f22195b * (-433341831);
        f22195b = i3;
        int i4 = f22201j * (-259583300);
        f22201j = i4;
        return ((Boolean) b(new Object[]{this, obj}, (int) Runtime.getRuntime().totalMemory(), 871530739, i2, -871530738, i3, i4)).booleanValue();
    }

    protected final void finalize() throws Throwable {
        int iActiveCount = Thread.activeCount();
        int i2 = f22197d * 746472749;
        f22197d = i2;
        b(new Object[]{this}, (int) Runtime.getRuntime().totalMemory(), -512839771, iActiveCount, 512839771, i2, (int) Process.getElapsedCpuTime());
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f22203o + 41;
        f22202n = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = super.hashCode();
        int i5 = f22202n;
        int i6 = (i5 ^ 81) + (((i5 + 81) - (i5 | 81)) << 1);
        f22203o = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f22203o;
        int i4 = ((i3 + 35) - (35 | i3)) + ((i3 + 35) - (i3 & 35));
        f22202n = i4 % 128;
        int i5 = i4 % 2;
        String string = super.toString();
        int i6 = f22202n;
        int i7 = ((-1) - (((-1) - i6) | ((-1) - 89))) + (i6 | 89);
        f22203o = i7 % 128;
        if (i7 % 2 == 0) {
            return string;
        }
        throw null;
    }
}
