package o.g;

import android.os.Process;
import java.util.Date;
import java.util.Random;
import o.g.a;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f26218a = 1191957041;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f26219b = 1504337965;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f26220c = -53528032;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f26221d = -494157198;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f26222e = 1958136463;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26223h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26224i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f26225j = -804590009;

    public f(a.b bVar, Date date, d dVar) {
        super(bVar, date, dVar);
    }

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = ~i4;
        int i12 = ~((i9 + i11) - (i9 & i11));
        int i13 = (i10 + i12) - (i10 & i12);
        int i14 = (i3 + i2) - (i3 & i2);
        int i15 = ~((i4 + i14) - (i4 & i14));
        int i16 = i13 | i15;
        int i17 = i11 | i3;
        int i18 = i3 + i2 + i5 + (112060874 * i7) + ((-1891258303) * i6);
        int i19 = i18 * i18;
        int i20 = (i3 * 1286644997) + 1783103488 + (1286644997 * i2) + (i16 * (-1821943044)) + ((-651081208) * i15) + ((-1821943044) * i17) + ((-535298048) * i5) + ((-1427111936) * i7) + (1712848896 * i6) + (159514624 * i19);
        int i21 = ((i3 * (-1669307009)) - 1771304782) + (i2 * (-1669307009)) + (i16 * 564) + (i15 * (-1128)) + (i17 * 564) + (i5 * (-1669306445)) + (i7 * (-1582645698)) + (i6 * (-198941581)) + (i19 * (-203030528));
        int i22 = i20 + (i21 * i21 * (-2008154112));
        if (i22 != 1) {
            return i22 != 2 ? e(objArr) : d(objArr);
        }
        int i23 = 2 % 2;
        int i24 = f26224i + 101;
        int i25 = i24 % 128;
        f26223h = i25;
        int i26 = i24 % 2;
        int i27 = (i25 & 1) + (1 | i25);
        f26224i = i27 % 128;
        int i28 = i27 % 2;
        return null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        f fVar = (f) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26223h;
        int i4 = (i3 ^ 35) + (((i3 + 35) - (i3 | 35)) << 1);
        f26224i = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr2 = {fVar.m().a()};
        int iNextInt = new Random().nextInt();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i6 = o.by.b.f21798b * 486364844;
        o.by.b.f21798b = i6;
        byte[] bArr = (byte[]) o.by.b.c(iNextInt, 148913438, objArr2, elapsedCpuTime, i6, (int) Thread.currentThread().getId(), -148913437);
        int i7 = f26224i + 97;
        f26223h = i7 % 128;
        if (i7 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        f fVar = (f) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26223h;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 45))) + ((-1) - (((-1) - i3) & ((-1) - 45)));
        f26224i = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArrD = fVar.m().a().d();
        int i6 = f26223h + 97;
        f26224i = i6 % 128;
        if (i6 % 2 == 0) {
            return bArrD;
        }
        throw null;
    }

    @Override // o.g.a
    public final byte[] a() {
        int i2 = 2 % 2;
        int i3 = f26223h + 49;
        f26224i = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {m().a()};
        int iNextInt = new Random().nextInt();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i5 = o.by.b.f21798b * 486364844;
        o.by.b.f21798b = i5;
        byte[] bArr = (byte[]) o.by.b.c(iNextInt, 148913438, objArr, elapsedCpuTime, i5, (int) Thread.currentThread().getId(), -148913437);
        int i6 = f26223h + 103;
        f26224i = i6 % 128;
        if (i6 % 2 == 0) {
            return bArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.g.a
    public final o.m.i b() {
        int i2 = 2 % 2;
        int i3 = f26223h + 25;
        f26224i = i3 % 128;
        int i4 = i3 % 2;
        o.m.i iVarG = o.m.c.d().g();
        int i5 = f26223h + 87;
        f26224i = i5 % 128;
        if (i5 % 2 == 0) {
            return iVarG;
        }
        throw null;
    }

    @Override // o.g.a
    public final String c() {
        int i2 = f26218a * (-569167051);
        f26218a = i2;
        int i3 = f26220c * (-913732990);
        f26220c = i3;
        int iMyUid = Process.myUid();
        int i4 = f26221d * 637549145;
        f26221d = i4;
        return (String) d(-1213252329, 1213252330, i2, i3, new Object[]{this}, i4, iMyUid);
    }

    @Override // o.g.a
    public final byte[] d() {
        int iActiveCount = Thread.activeCount();
        int i2 = f26219b * (-1820302048);
        f26219b = i2;
        int i3 = f26222e * 1282086979;
        f26222e = i3;
        return (byte[]) d(1001457243, -1001457243, iActiveCount, i2, new Object[]{this}, Process.myTid(), i3);
    }

    @Override // o.g.a
    public final byte[] e() {
        int i2 = f26225j * 1556698394;
        f26225j = i2;
        return (byte[]) d(-900472570, 900472572, i2, (int) Process.getElapsedCpuTime(), new Object[]{this}, (int) Runtime.getRuntime().maxMemory(), Process.myPid());
    }

    @Override // o.g.a
    public final String j() {
        int i2 = 2 % 2;
        int i3 = f26223h;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 47))) << 1) - (i3 ^ 47);
        f26224i = i4 % 128;
        int i5 = i4 % 2;
        int i6 = (i3 ^ 123) + (((-1) - (((-1) - i3) | ((-1) - 123))) << 1);
        f26224i = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
