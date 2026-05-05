package o.ez;

import android.os.Process;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import o.eu.e;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e<o.fg.d> {

    /* JADX INFO: renamed from: f */
    public static int f25687f = 1710718892;

    /* JADX INFO: renamed from: g */
    public static int f25688g = -693796912;

    /* JADX INFO: renamed from: h */
    public static int f25689h = 681764978;

    /* JADX INFO: renamed from: j */
    public static int f25690j = -2005962400;

    /* JADX INFO: renamed from: l */
    private static int f25691l = 1;

    /* JADX INFO: renamed from: m */
    private static int f25692m = 0;

    /* JADX INFO: renamed from: o */
    public static int f25693o = -1015975778;

    public a(String str, String str2, boolean z2) {
        super(str, str2, z2);
    }

    public static /* synthetic */ Object a(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = i8 | i6;
        int i10 = ~i9;
        int i11 = ~i2;
        int i12 = i10 | (~((-1) - (((-1) - i11) & ((-1) - i6))));
        int i13 = (i9 + i11) - (i9 & i11);
        int i14 = (~(i2 | i6)) | (~((-1) - (((-1) - i8) & ((-1) - (~i6)))));
        int i15 = i6 + i3 + i7 + ((-1311665080) * i5) + (1761575915 * i4);
        int i16 = i15 * i15;
        int i17 = ((-2073022045) * i6) + 412680192 + (1917570655 * i3) + (i12 * (-1995296350)) + (1995296350 * i13) + ((-1995296350) * i14) + ((-77725696) * i7) + (175112192 * i5) + ((-649461760) * i4) + (1783169024 * i16);
        int i18 = ((i6 * 1226044109) - 1701849991) + (i3 * 1226043089) + (i12 * TypedValues.PositionType.TYPE_POSITION_TYPE) + (i13 * (-510)) + (i14 * TypedValues.PositionType.TYPE_POSITION_TYPE) + (i7 * 1226043599) + (i5 * (-858626504)) + (i4 * 1069087493) + (i16 * 1627848704);
        if (i17 + (i18 * i18 * 739704832) != 1) {
            return c(objArr);
        }
        int i19 = 2 % 2;
        d dVar = new d();
        int i20 = f25691l + 71;
        f25692m = i20 % 128;
        int i21 = i20 % 2;
        return dVar;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f25691l;
        int i4 = (i3 ^ 109) + ((i3 & 109) << 1);
        f25692m = i4 % 128;
        int i5 = i4 % 2;
        o.cu.e eVarT = t();
        int i6 = f25691l + 1;
        f25692m = i6 % 128;
        if (i6 % 2 == 0) {
            return eVarT;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static d s() {
        int priority = Thread.currentThread().getPriority();
        int iMyUid = Process.myUid();
        int i2 = f25693o * 1261171101;
        f25693o = i2;
        return (d) a(priority, 457974527, new Object[0], (int) Runtime.getRuntime().freeMemory(), i2, -457974526, iMyUid);
    }

    private static o.cu.e t() {
        int i2 = 2 % 2;
        o.cu.e eVar = new o.cu.e();
        int i3 = f25692m + 59;
        f25691l = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
        return eVar;
    }

    @Override // o.eu.d
    public final /* synthetic */ o.eu.a d() {
        d dVar;
        int i2 = 2 % 2;
        int i3 = f25691l;
        int i4 = ((59 | i3) << 1) - (i3 ^ 59);
        f25692m = i4 % 128;
        Object[] objArr = new Object[0];
        if (i4 % 2 != 0) {
            int priority = Thread.currentThread().getPriority();
            int iMyUid = Process.myUid();
            int i5 = f25693o * 1261171101;
            f25693o = i5;
            dVar = (d) a(priority, 457974527, objArr, (int) Runtime.getRuntime().freeMemory(), i5, -457974526, iMyUid);
            int i6 = 30 / 0;
        } else {
            int priority2 = Thread.currentThread().getPriority();
            int iMyUid2 = Process.myUid();
            int i7 = f25693o * 1261171101;
            f25693o = i7;
            dVar = (d) a(priority2, 457974527, objArr, (int) Runtime.getRuntime().freeMemory(), i7, -457974526, iMyUid2);
        }
        int i8 = f25691l + 7;
        f25692m = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 57 / 0;
        }
        return dVar;
    }

    @Override // o.eu.d
    public final /* synthetic */ o.cr.d e() {
        int i2 = f25689h * 237397027;
        f25689h = i2;
        int i3 = f25690j * 1731778484;
        f25690j = i3;
        int i4 = f25688g * (-769475113);
        f25688g = i4;
        int i5 = (-1388945166) * f25687f;
        f25687f = i5;
        return (o.cr.d) a(i2, -352105660, new Object[]{this}, i5, i4, 352105660, i3);
    }
}
