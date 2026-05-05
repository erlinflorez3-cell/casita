package o.be;

import android.os.Process;
import android.os.SystemClock;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f20946a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f20947b = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f20948f = 628814852;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f20949g = 1997264283;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f20950j = -1418286033;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f20951k = -1508356230;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f20952o = -579966986;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20953e;

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i5;
        int i9 = ~i4;
        int i10 = ~(i8 | i9);
        int i11 = ~((i8 + i3) - (i8 & i3));
        int i12 = (-1) - (((-1) - i10) & ((-1) - i11));
        int i13 = ~((-1) - (((-1) - i9) & ((-1) - i3)));
        int i14 = (i12 + i13) - (i12 & i13);
        int i15 = i11 | i4;
        int i16 = ~i3;
        int i17 = ~(((-1) - (((-1) - i8) & ((-1) - i16))) | i9);
        int i18 = i16 | i5;
        int i19 = ((-1) - (((-1) - (~((i4 + i18) - (i4 & i18)))) & ((-1) - i17))) | (~(i9 | i5 | i3));
        int i20 = i5 + i3 + i7 + ((-1329026341) * i2) + ((-1277752516) * i6);
        int i21 = i20 * i20;
        int i22 = ((1212708917 * i5) - 1912602624) + ((-659060787) * i3) + ((-1871769704) * i14) + (i15 * 935884852) + (935884852 * i19) + (276824064 * i7) + (494927872 * i2) + (1577058304 * i6) + ((-1783103488) * i21);
        int i23 = (i5 * 595972471) + 129777640 + (i3 * 595971967) + (i14 * (-504)) + (i15 * 252) + (i19 * 252) + (i7 * 595972219) + (i2 * (-1341978823)) + (i6 * 731850196) + (i21 * 1869086720);
        int i24 = i22 + (i23 * i23 * (-846725120));
        if (i24 == 1) {
            c cVar = (c) objArr[0];
            int i25 = 2 % 2;
            int i26 = f20947b + 59;
            f20946a = i26 % 128;
            int i27 = i26 % 2;
            String string = super.toString();
            int i28 = f20947b + 115;
            f20946a = i28 % 128;
            int i29 = i28 % 2;
            return string;
        }
        if (i24 == 2) {
            return e(objArr);
        }
        c cVar2 = (c) objArr[0];
        int i30 = 2 % 2;
        int i31 = f20946a + 35;
        int i32 = i31 % 128;
        f20947b = i32;
        int i33 = i31 % 2;
        String str = cVar2.f20953e;
        int i34 = (i32 & 73) + (i32 | 73);
        f20946a = i34 % 128;
        int i35 = i34 % 2;
        return str;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f20946a;
        int i4 = ((i3 + 1) - (1 | i3)) + ((i3 + 1) - (i3 & 1));
        f20947b = i4 % 128;
        if (i4 % 2 != 0) {
            super.finalize();
            return null;
        }
        super.finalize();
        int i5 = 9 / 0;
        return null;
    }

    public final String b() {
        int i2 = f20950j * 1447608726;
        f20950j = i2;
        int iActiveCount = Thread.activeCount();
        int i3 = f20948f * (-256061114);
        f20948f = i3;
        int i4 = f20949g * 1407037253;
        f20949g = i4;
        return (String) a(i3, 1945454185, i2, -1945454185, i4, new Object[]{this}, iActiveCount);
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final void d(String str) {
        int i2 = 2 % 2;
        int i3 = f20947b;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 55))) << 1) - (i3 ^ 55);
        int i5 = i4 % 128;
        f20946a = i5;
        int i6 = i4 % 2;
        this.f20953e = str;
        int i7 = (i5 ^ 109) + (((-1) - (((-1) - i5) | ((-1) - 109))) << 1);
        f20947b = i7 % 128;
        int i8 = i7 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f20946a + 91;
        f20947b = i3 % 128;
        int i4 = i3 % 2;
        boolean zEquals = super.equals(obj);
        if (i4 == 0) {
            int i5 = 88 / 0;
        }
        int i6 = f20946a + 65;
        f20947b = i6 % 128;
        int i7 = i6 % 2;
        return zEquals;
    }

    protected final void finalize() throws Throwable {
        int i2 = f20952o * 1600689685;
        f20952o = i2;
        int iMyTid = Process.myTid();
        a((int) SystemClock.elapsedRealtime(), 1399564341, i2, -1399564339, (int) Runtime.getRuntime().totalMemory(), new Object[]{this}, iMyTid);
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f20947b + 21;
        f20946a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = super.hashCode();
        int i5 = f20946a + 13;
        f20947b = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int iNextInt = new Random().nextInt(1364935016);
        int priority = Thread.currentThread().getPriority();
        int iMyUid = Process.myUid();
        int i2 = f20951k * 1182536043;
        f20951k = i2;
        return (String) a(iMyUid, 2039420530, iNextInt, -2039420529, i2, new Object[]{this}, priority);
    }
}
