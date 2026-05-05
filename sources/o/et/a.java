package o.et;

import android.os.Process;
import fr.antelop.sdk.card.emvapplication.EmvApplicationType;

/* JADX INFO: loaded from: classes6.dex */
public class a extends c {
    public static int A = -189415691;
    private static int C = 1;
    private static int D = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f25332g = 145435585;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f25333h = -1128861050;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f25334i = 1941054028;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f25335j = 408594549;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f25336x = -609663120;

    public a(String str, String str2, int i2, String str3) {
        super(str, o.dp.b.f23218f, str2, i2, str3);
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = (~((i8 + i4) - (i8 & i4))) | i3;
        int i10 = ~i3;
        int i11 = ~(i8 | i10);
        int i12 = ~i4;
        int i13 = i11 | (~(i10 | i12));
        int i14 = ~((i8 + i12) - (i8 & i12));
        int i15 = ~((i4 + i10) - (i4 & i10));
        int i16 = (i15 + i14) - (i15 & i14);
        int i17 = i5 + i3 + i7 + (417615942 * i2) + (566850886 * i6);
        int i18 = i17 * i17;
        int i19 = ((-370608051) * i5) + 147849216 + ((-2147356519) * i3) + (i9 * 1776748468) + (i13 * 1776748468) + (1776748468 * i16) + (1406140416 * i7) + ((-354418688) * i2) + ((-85983232) * i6) + ((-608960512) * i18);
        int i20 = (i5 * (-1357469509)) + 140661806 + (i3 * (-1357469617)) + (i9 * 108) + (i13 * 108) + (i16 * 108) + (i7 * (-1357469401)) + (i2 * 1137340586) + (i6 * 304092074) + (i18 * 1282146304);
        return i19 + ((i20 * i20) * 1158414336) != 1 ? e(objArr) : b(objArr);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = D;
        int i4 = ((i3 + 27) - (27 | i3)) + ((i3 + 27) - (i3 & 27));
        int i5 = i4 % 128;
        C = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = (i5 ^ 103) + (((-1) - (((-1) - i5) | ((-1) - 103))) << 1);
        D = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 38 / 0;
        }
        return null;
    }

    private o.ew.d d(String str) {
        int i2 = 2 % 2;
        o.ew.d dVar = new o.ew.d(k(), str, false);
        int i3 = D + 9;
        C = i3 % 128;
        int i4 = i3 % 2;
        return dVar;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        a aVar = (a) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = (i3 ^ 27) + (((i3 + 27) - (i3 | 27)) << 1);
        D = i4 % 128;
        if (i4 % 2 != 0) {
            aVar.d(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.ew.d dVarD = aVar.d(str);
        int i5 = C;
        int i6 = ((81 | i5) << 1) - (i5 ^ 81);
        D = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 82 / 0;
        }
        return dVarD;
    }

    @Override // o.et.c
    public final byte[] F() {
        int i2 = f25333h * 1904378900;
        f25333h = i2;
        int i3 = f25336x * 1969558230;
        f25336x = i3;
        int priority = Thread.currentThread().getPriority();
        int i4 = A * (-1392563157);
        A = i4;
        return (byte[]) b(priority, -202760289, i2, new Object[]{this}, 202760290, i4, i3);
    }

    @Override // o.et.c
    public final EmvApplicationType a() {
        int i2 = 2 % 2;
        int i3 = C + 87;
        D = i3 % 128;
        if (i3 % 2 != 0) {
            EmvApplicationType emvApplicationType = EmvApplicationType.HceJcb;
            throw null;
        }
        EmvApplicationType emvApplicationType2 = EmvApplicationType.HceJcb;
        int i4 = D;
        int i5 = (((-1) - (((-1) - i4) & ((-1) - 17))) << 1) - (i4 ^ 17);
        C = i5 % 128;
        int i6 = i5 % 2;
        return emvApplicationType2;
    }

    @Override // o.et.c
    protected c b(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        a aVar = new a(str, str2, i2, str3);
        int i4 = C + 121;
        D = i4 % 128;
        int i5 = i4 % 2;
        return aVar;
    }

    @Override // o.eq.b
    public final /* synthetic */ o.eu.d c(String str) {
        int i2 = f25332g * 1217453290;
        f25332g = i2;
        int i3 = f25334i * (-249610302);
        f25334i = i3;
        int i4 = 464089265 * f25335j;
        f25335j = i4;
        return (o.eu.d) b(i4, 317512903, i2, new Object[]{this, str}, -317512903, (int) Process.getElapsedCpuTime(), i3);
    }
}
