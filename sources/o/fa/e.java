package o.fa;

import android.os.Process;
import android.os.SystemClock;
import java.util.Random;
import o.eu.a;
import o.eu.b;
import o.eu.d;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends b<o.fh.a, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25727a = 512738649;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f25728b = -144332167;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25729c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f25730d = 1494951324;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f25731e = -948084228;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25732i = 1;

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i2;
        int i9 = (i5 + i8) - (i5 & i8);
        int i10 = (~(i4 | i2)) | i5;
        int i11 = ~i4;
        int i12 = (~(i2 | i4 | i5)) | (~((i8 + i11) - (i8 & i11))) | (~((~i5) | i11));
        int i13 = i4 + i5 + i6 + (1609234610 * i7) + (1307081305 * i3);
        int i14 = i13 * i13;
        int i15 = (((-490261092) * i4) - 1772093440) + (1576585830 * i5) + (i9 * 1033423461) + ((-2066846922) * i10) + (1033423461 * i12) + (543162368 * i6) + ((-2101346304) * i7) + (23068672 * i3) + ((-2103967744) * i14);
        int i16 = (i4 * 273352028) + 245730370 + (i5 * 273352646) + (i9 * 309) + (i10 * (-618)) + (i12 * 309) + (i6 * 273352337) + (i7 * (-770635566)) + (i3 * (-73506199)) + (i14 * (-2011693056));
        return i15 + ((i16 * i16) * 1080557568) != 1 ? d(objArr) : b(objArr);
    }

    private static a a(String str, String str2, boolean z2) {
        int i2 = 2 % 2;
        a aVar = new a(str, str2, z2);
        int i3 = f25732i;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 21))) + ((-1) - (((-1) - i3) & ((-1) - 21)));
        f25729c = i4 % 128;
        if (i4 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    private static o.fh.a a(boolean z2, o.ff.b bVar, short s2) {
        Object[] objArr = {Boolean.valueOf(z2), bVar, Short.valueOf(s2)};
        int i2 = f25727a * 926381197;
        f25727a = i2;
        int iNextInt = new Random().nextInt();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i3 = f25730d * (-1290801401);
        f25730d = i3;
        return (o.fh.a) a(i2, i3, -2015270941, 2015270942, objArr, iNextInt, elapsedCpuTime);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ((Boolean) objArr[0]).booleanValue();
        int i2 = 2 % 2;
        o.fh.a aVar = new o.fh.a(false, (o.ff.b) objArr[1], ((Short) objArr[2]).shortValue());
        int i3 = f25729c;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 77))) << 1) - (i3 ^ 77);
        f25732i = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return aVar;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f25732i;
        int i4 = (((i3 + 25) - (25 & i3)) << 1) - (i3 ^ 25);
        f25729c = i4 % 128;
        int i5 = i4 % 2;
        a.d dVar = a.d.f25444c;
        int i6 = f25729c + 117;
        f25732i = i6 % 128;
        if (i6 % 2 != 0) {
            return dVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ff.a a(o.ff.b bVar, short s2) {
        int i2 = 2 % 2;
        int i3 = f25732i;
        int i4 = (i3 & 9) + ((i3 + 9) - (i3 & 9));
        f25729c = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {false, bVar, Short.valueOf(s2)};
        int i6 = f25727a * 926381197;
        f25727a = i6;
        int iNextInt = new Random().nextInt();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i7 = f25730d * (-1290801401);
        f25730d = i7;
        o.fh.a aVar = (o.fh.a) a(i6, i7, -2015270941, 2015270942, objArr, iNextInt, elapsedCpuTime);
        int i8 = f25729c;
        int i9 = ((i8 + 37) - (37 | i8)) + ((-1) - (((-1) - i8) & ((-1) - 37)));
        f25732i = i9 % 128;
        int i10 = i9 % 2;
        return aVar;
    }

    @Override // o.eu.a
    public final a.d b() {
        int id = (int) Thread.currentThread().getId();
        int i2 = f25728b * 1656218902;
        f25728b = i2;
        int i3 = f25731e * 676700435;
        f25731e = i3;
        return (a.d) a(id, (int) SystemClock.elapsedRealtime(), 1960001168, -1960001168, new Object[]{this}, i2, i3);
    }

    @Override // o.eu.a
    public final /* synthetic */ d d(String str, String str2, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f25732i;
        int i4 = (((i3 + 83) - (83 & i3)) << 1) - (i3 ^ 83);
        f25729c = i4 % 128;
        int i5 = i4 % 2;
        a aVarA = a(str, str2, z2);
        if (i5 != 0) {
            int i6 = 14 / 0;
        }
        return aVarA;
    }
}
