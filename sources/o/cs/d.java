package o.cs;

import android.os.SystemClock;
import fr.antelop.sdk.card.EmvApplicationActivationMethod;
import fr.antelop.sdk.card.EmvApplicationActivationMethodType;
import java.util.Random;
import o.ea.a;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements a<EmvApplicationActivationMethod> {

    /* JADX INFO: renamed from: a */
    public static int f22589a = 1425708441;

    /* JADX INFO: renamed from: b */
    public static int f22590b = 1509005900;

    /* JADX INFO: renamed from: c */
    public static int f22591c = -1205219098;

    /* JADX INFO: renamed from: d */
    public static int f22592d = -508425499;

    /* JADX INFO: renamed from: e */
    public static int f22593e = -1703208983;

    /* JADX INFO: renamed from: f */
    public static int f22594f = 271861382;

    /* JADX INFO: renamed from: g */
    public static int f22595g = 1587249404;

    /* JADX INFO: renamed from: i */
    public static int f22596i = -223439549;

    /* JADX INFO: renamed from: l */
    private static int f22597l = 1;

    /* JADX INFO: renamed from: o */
    private static int f22598o = 0;

    /* JADX INFO: renamed from: h */
    private final c f22599h;

    /* JADX INFO: renamed from: j */
    private final String f22600j;

    /* JADX INFO: renamed from: k */
    private final String f22601k;

    /* JADX INFO: renamed from: m */
    private final String f22602m;

    /* JADX INFO: renamed from: n */
    private final String f22603n;

    d(String str, c cVar, String str2, String str3, String str4) {
        this.f22600j = str;
        this.f22599h = cVar;
        this.f22602m = str2;
        this.f22603n = str3;
        this.f22601k = str4;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f22598o;
        int i4 = i3 + 41;
        f22597l = i4 % 128;
        int i5 = i4 % 2;
        String str = dVar.f22600j;
        int i6 = (((i3 + 57) - (57 & i3)) << 1) - (i3 ^ 57);
        f22597l = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~i3;
        int i10 = ~((i8 + i9) - (i8 & i9));
        int i11 = (-1) - (((-1) - (~(i8 | i6))) & ((-1) - i10));
        int i12 = ~((-1) - (((-1) - i9) & ((-1) - i6)));
        int i13 = (i11 + i12) - (i11 & i12);
        int i14 = ~i6;
        int i15 = ~((-1) - (((-1) - i9) & ((-1) - i14)));
        int i16 = (i15 + i10) - (i15 & i10);
        int i17 = (-1) - (((-1) - (~(i14 | i8))) & ((-1) - i3));
        int i18 = i4 + i3 + i7 + ((-700610695) * i5) + ((-1151578525) * i2);
        int i19 = i18 * i18;
        int i20 = (1165304685 * i4) + 1030029312 + ((-1366800679) * i3) + (i13 * (-1762861932)) + (i16 * (-1762861932)) + ((-1762861932) * i17) + ((-597557248) * i7) + ((-665714688) * i5) + (367394816 * i2) + (374145024 * i19);
        int i21 = ((i4 * 323709325) - 650539883) + (i3 * 323709049) + (i13 * 276) + (i16 * 276) + (i17 * 276) + (i7 * 323709601) + (i5 * (-499299047)) + (i2 * 1568885315) + (i19 * (-395509760));
        int i22 = i20 + (i21 * i21 * (-772603904));
        return i22 != 1 ? i22 != 2 ? i22 != 3 ? e(objArr) : b(objArr) : c(objArr) : a(objArr);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f22597l;
        int i4 = (i3 ^ 9) + (((-1) - (((-1) - i3) | ((-1) - 9))) << 1);
        f22598o = i4 % 128;
        int i5 = i4 % 2;
        String str = dVar.f22602m;
        if (i5 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        int i2 = 2 % 2;
        EmvApplicationActivationMethod emvApplicationActivationMethod = new EmvApplicationActivationMethod((d) objArr[0]);
        int i3 = f22598o + 15;
        f22597l = i3 % 128;
        if (i3 % 2 != 0) {
            return emvApplicationActivationMethod;
        }
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f22598o;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 83))) << 1) - (i3 ^ 83);
        f22597l = i4 % 128;
        int i5 = i4 % 2;
        EmvApplicationActivationMethodType emvApplicationActivationMethodTypeD = dVar.f22599h.d();
        if (i5 == 0) {
            int i6 = 12 / 0;
        }
        int i7 = f22598o;
        int i8 = ((31 | i7) << 1) - (i7 ^ 31);
        f22597l = i8 % 128;
        int i9 = i8 % 2;
        return emvApplicationActivationMethodTypeD;
    }

    private EmvApplicationActivationMethod i() {
        int iActiveCount = Thread.activeCount();
        int i2 = f22595g * 892156447;
        f22595g = i2;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        return (EmvApplicationActivationMethod) b((int) SystemClock.elapsedRealtime(), 582538189, -582538187, new Object[]{this}, iMaxMemory, iActiveCount, i2);
    }

    public final String a() {
        int i2 = f22590b * 2033895861;
        f22590b = i2;
        int i3 = f22593e * 1121861622;
        f22593e = i3;
        int priority = Thread.currentThread().getPriority();
        int i4 = f22589a * (-121879155);
        f22589a = i4;
        return (String) b(i4, 1953396095, -1953396094, new Object[]{this}, priority, i2, i3);
    }

    public final d b() {
        int i2 = 2 % 2;
        d dVar = new d(this.f22600j, this.f22599h, this.f22602m, this.f22603n, this.f22601k);
        int i3 = f22598o + 77;
        f22597l = i3 % 128;
        int i4 = i3 % 2;
        return dVar;
    }

    public final String c() {
        String str;
        int i2 = 2 % 2;
        int i3 = f22597l;
        int i4 = ((i3 + 41) - (41 | i3)) + ((-1) - (((-1) - i3) & ((-1) - 41)));
        f22598o = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.f22603n;
            int i5 = 67 / 0;
        } else {
            str = this.f22603n;
        }
        int i6 = i3 + 101;
        f22598o = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final EmvApplicationActivationMethodType d() {
        int i2 = f22592d * (-1580426530);
        f22592d = i2;
        int i3 = f22591c * 1801994784;
        f22591c = i3;
        int priority = Thread.currentThread().getPriority();
        return (EmvApplicationActivationMethodType) b(Thread.activeCount(), -1645654662, 1645654662, new Object[]{this}, priority, i2, i3);
    }

    @Override // o.ea.a
    public final /* synthetic */ EmvApplicationActivationMethod e() {
        int i2 = 2 % 2;
        int i3 = f22598o;
        int i4 = (i3 ^ 61) + (((i3 + 61) - (i3 | 61)) << 1);
        f22597l = i4 % 128;
        int i5 = i4 % 2;
        int iActiveCount = Thread.activeCount();
        int i6 = f22595g * 892156447;
        f22595g = i6;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        EmvApplicationActivationMethod emvApplicationActivationMethod = (EmvApplicationActivationMethod) b((int) SystemClock.elapsedRealtime(), 582538189, -582538187, new Object[]{this}, iMaxMemory, iActiveCount, i6);
        int i7 = f22598o + 35;
        f22597l = i7 % 128;
        int i8 = i7 % 2;
        return emvApplicationActivationMethod;
    }

    public final String h() {
        int i2 = 2 % 2;
        int i3 = f22597l;
        int i4 = (i3 ^ 33) + (((i3 + 33) - (i3 | 33)) << 1);
        int i5 = i4 % 128;
        f22598o = i5;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f22601k;
        int i6 = ((61 | i5) << 1) - (i5 ^ 61);
        f22597l = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String j() {
        int i2 = f22594f * (-2099637768);
        f22594f = i2;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i3 = f22596i * 1831495389;
        f22596i = i3;
        return (String) b(new Random().nextInt(1327362422), -1030571470, 1030571473, new Object[]{this}, i3, i2, iElapsedRealtime);
    }
}
