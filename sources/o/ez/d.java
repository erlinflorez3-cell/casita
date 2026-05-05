package o.ez;

import android.os.Process;
import o.eu.a;
import o.eu.b;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends b<o.fg.d, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25694a = -691860548;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f25695b = 1988797496;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f25696c = -1409750202;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f25697d = 982449326;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f25698e = 416766617;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f25699g = -1502448384;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25700h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25701i = 1;

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i2;
        int i9 = ~i3;
        int i10 = (-1) - (((-1) - (~i5)) & ((-1) - i9));
        int i11 = i8 | (~i10);
        int i12 = i5 | i9;
        int i13 = ~((i10 + i2) - (i10 & i2));
        int i14 = i3 + i2 + i4 + (1075552530 * i7) + ((-1519595880) * i6);
        int i15 = i14 * i14;
        int i16 = (((-1050772794) * i3) - 1639710720) + ((-2116975300) * i2) + (i11 * (-533101253)) + (533101253 * i12) + ((-533101253) * i13) + ((-1583874048) * i4) + ((-189792256) * i7) + (1111490560 * i6) + (1415839744 * i15);
        int i17 = (i3 * 251836610) + 257048825 + (i2 * 251838484) + (i11 * 937) + (i12 * (-937)) + (i13 * 937) + (i4 * 251837547) + (i7 * 1710852742) + (i6 * (-1855850104)) + (i15 * (-1244921856));
        return i16 + ((i17 * i17) * (-1300496384)) != 1 ? c(objArr) : e(objArr);
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        int i2 = 2 % 2;
        a aVar = new a((String) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue());
        int i3 = f25701i + 91;
        f25700h = i3 % 128;
        if (i3 % 2 == 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static a c(String str, String str2, boolean z2) {
        Object[] objArr = {str, str2, Boolean.valueOf(z2)};
        int i2 = f25695b * (-1520688335);
        f25695b = i2;
        int i3 = f25694a * 507885638;
        f25694a = i3;
        int i4 = f25697d * 1683618920;
        f25697d = i4;
        return (a) a(1184278146, -1184278146, i3, i2, (int) Process.getElapsedCpuTime(), i4, objArr);
    }

    private static o.fg.d d(boolean z2, o.ff.b bVar, short s2) {
        int i2 = 2 % 2;
        o.fg.d dVar = new o.fg.d(false, bVar, s2);
        int i3 = f25701i;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 99))) + (i3 | 99);
        f25700h = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return dVar;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        a aVar;
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i2 = 2 % 2;
        int i3 = f25700h + 59;
        f25701i = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr2 = {str, str2, Boolean.valueOf(zBooleanValue)};
        int i5 = f25695b * (-1520688335);
        f25695b = i5;
        int i6 = f25694a * 507885638;
        f25694a = i6;
        int i7 = f25697d * 1683618920;
        f25697d = i7;
        if (i4 == 0) {
            aVar = (a) a(1184278146, -1184278146, i6, i5, (int) Process.getElapsedCpuTime(), i7, objArr2);
            int i8 = 90 / 0;
        } else {
            aVar = (a) a(1184278146, -1184278146, i6, i5, (int) Process.getElapsedCpuTime(), i7, objArr2);
        }
        int i9 = f25700h + 99;
        f25701i = i9 % 128;
        int i10 = i9 % 2;
        return aVar;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ff.a a(o.ff.b bVar, short s2) {
        int i2 = 2 % 2;
        int i3 = f25700h + 43;
        f25701i = i3 % 128;
        int i4 = i3 % 2;
        o.fg.d dVarD = d(false, bVar, s2);
        int i5 = f25700h;
        int i6 = (i5 ^ 105) + ((i5 & 105) << 1);
        f25701i = i6 % 128;
        int i7 = i6 % 2;
        return dVarD;
    }

    @Override // o.eu.a
    public final a.d b() {
        int i2 = 2 % 2;
        int i3 = f25701i;
        int i4 = (i3 ^ 65) + ((i3 & 65) << 1);
        f25700h = i4 % 128;
        int i5 = i4 % 2;
        a.d dVar = a.d.f25443b;
        int i6 = f25701i;
        int i7 = (i6 ^ 69) + (((i6 + 69) - (i6 | 69)) << 1);
        f25700h = i7 % 128;
        int i8 = i7 % 2;
        return dVar;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.eu.d d(String str, String str2, boolean z2) {
        Object[] objArr = {this, str, str2, Boolean.valueOf(z2)};
        int iMyTid = Process.myTid();
        int i2 = f25698e * 961656756;
        f25698e = i2;
        int i3 = f25696c * 36092;
        f25696c = i3;
        int i4 = f25699g * 1957713013;
        f25699g = i4;
        return (o.eu.d) a(587923719, -587923718, i2, iMyTid, i4, i3, objArr);
    }
}
