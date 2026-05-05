package o.g;

import android.os.Process;
import android.os.SystemClock;
import java.util.Date;
import java.util.Random;
import o.g.a;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f26209a = 1174540868;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f26210b = -1702813590;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f26211c = -15239007;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f26212d = -2040703891;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f26213e = -2131694030;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26214g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f26215h = 1626874820;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26216i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f26217j = 1155666881;

    public e(a.b bVar, Date date) {
        super(bVar, date);
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f26216i;
        int i4 = (i3 ^ 53) + ((i3 & 53) << 1);
        f26214g = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i4;
        int i9 = ~i7;
        int i10 = ~((-1) - (((-1) - i8) & ((-1) - i9)));
        int i11 = ~i3;
        int i12 = (-1) - (((-1) - i10) & ((-1) - (~((i11 + i7) - (i11 & i7)))));
        int i13 = (~(i7 | i8)) | (~((-1) - (((-1) - i9) & ((-1) - i11))));
        int i14 = ~((-1) - (((-1) - i4) & ((-1) - i3)));
        int i15 = i13 | i14;
        int i16 = (i14 + i12) - (i14 & i12);
        int i17 = i4 + i3 + i5 + ((-1585779005) * i2) + (640148872 * i6);
        int i18 = i17 * i17;
        int i19 = (i4 * 308833806) + 153878528 + (308833806 * i3) + ((-448846874) * i12) + ((-224423437) * i15) + (224423437 * i16) + (84410368 * i5) + (1159200768 * i2) + ((-734003200) * i6) + (2089549824 * i18);
        int i20 = (i4 * (-1291220770)) + 263398195 + (i3 * (-1291220770)) + (i12 * (-1802)) + (i15 * (-901)) + (i16 * 901) + (i5 * (-1291221671)) + (i2 * (-1079815989)) + (i6 * 669414472) + (i18 * 145489920);
        int i21 = i19 + (i20 * i20 * (-1699479552));
        if (i21 == 1) {
            return a(objArr);
        }
        if (i21 == 2) {
            return b(objArr);
        }
        int i22 = 2 % 2;
        int i23 = f26214g + 55;
        f26216i = i23 % 128;
        int i24 = i23 % 2;
        o.m.i iVar = o.m.i.f26497e;
        int i25 = f26214g;
        int i26 = ((29 | i25) << 1) - (i25 ^ 29);
        f26216i = i26 % 128;
        int i27 = i26 % 2;
        return iVar;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f26216i;
        int i4 = (i3 ^ 121) + ((i3 & 121) << 1);
        int i5 = i4 % 128;
        f26214g = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 45;
        f26216i = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // o.g.a
    public final byte[] a() {
        int i2 = 2 % 2;
        int i3 = f26214g + 87;
        f26216i = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        int i4 = 30 / 0;
        return null;
    }

    @Override // o.g.a
    public final o.m.i b() {
        int iMyTid = Process.myTid();
        int i2 = f26212d * 1610416266;
        f26212d = i2;
        int i3 = f26209a * (-319200350);
        f26209a = i3;
        int i4 = f26211c * (-11632763);
        f26211c = i4;
        return (o.m.i) b(i3, -1780038475, 1780038475, i2, i4, new Object[]{this}, iMyTid);
    }

    @Override // o.g.a
    public final String c() {
        int priority = Thread.currentThread().getPriority();
        int i2 = f26213e * (-1089874440);
        f26213e = i2;
        int i3 = f26215h * 2078196833;
        f26215h = i3;
        int i4 = f26217j * 653375806;
        f26217j = i4;
        return (String) b(i3, 1921770073, -1921770071, i2, i4, new Object[]{this}, priority);
    }

    @Override // o.g.a
    public final byte[] d() {
        int i2 = 2 % 2;
        int i3 = f26216i;
        int i4 = i3 + 91;
        f26214g = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 65;
        f26214g = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // o.g.a
    public final byte[] e() {
        int i2 = 2 % 2;
        int i3 = f26214g;
        int i4 = i3 + 123;
        f26216i = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 117;
        f26216i = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // o.g.a
    public final String j() {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iMyTid = Process.myTid();
        int i2 = f26210b * (-640874384);
        f26210b = i2;
        return (String) b(i2, 373429855, -373429854, iMyTid, new Random().nextInt(), new Object[]{this}, iUptimeMillis);
    }
}
