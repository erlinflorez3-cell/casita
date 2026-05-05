package o.l;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Process;
import androidx.fragment.app.FragmentActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f26335a = -1340672950;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f26336b = -1406247599;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f26337c = -1573076212;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f26338d = -114816744;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f26339e = 217432423;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f26340f = -669369679;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f26341g = 107166316;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f26342h = -2132217544;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f26343i = 912296569;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f26344j = -2004824187;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f26345o = -1306193736;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f26346s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f26347t = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c f26348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f26349l = Objects.hash(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f26350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f26351n;

    public c(String str, int i2) {
        this.f26351n = str;
        this.f26350m = i2;
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) throws CloneNotSupportedException {
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = (-1) - (((-1) - i8) & ((-1) - i9));
        int i11 = ~i7;
        int i12 = ~((i10 + i11) - (i10 & i11));
        int i13 = ~(((i5 + i6) - (i5 & i6)) | i7);
        int i14 = (i12 + i13) - (i12 & i13);
        int i15 = (~((i9 + i7) - (i9 & i7))) | (~(i9 | i5));
        int i16 = (~((i7 + i6) - (i7 & i6))) | i5;
        int i17 = i5 + i6 + i4 + (1661237432 * i2) + (961048624 * i3);
        int i18 = i17 * i17;
        int i19 = ((119520104 * i5) - 281083904) + ((-1329838950) * i6) + (i14 * 724679527) + (724679527 * i15) + ((-724679527) * i16) + ((-605159424) * i4) + ((-1559232512) * i2) + (1553989632 * i3) + (2020540416 * i18);
        int i20 = (i5 * (-2040814728)) + 92927091 + (i6 * (-2040813538)) + (i14 * (-595)) + (i15 * (-595)) + (i16 * 595) + (i4 * (-2040814133)) + (i2 * (-1614655000)) + (i3 * 500164112) + (i18 * 184877056);
        int i21 = i19 + (i20 * i20 * 1800994816);
        if (i21 == 1) {
            return b(objArr);
        }
        if (i21 == 2) {
            return e(objArr);
        }
        if (i21 != 3) {
            if (i21 == 4) {
                return d(objArr);
            }
            int i22 = 2 % 2;
            throw new CloneNotSupportedException();
        }
        c cVar = (c) objArr[0];
        int i23 = 2 % 2;
        int i24 = f26346s;
        int i25 = (i24 ^ 35) + ((35 & i24) << 1);
        f26347t = i25 % 128;
        int i26 = i25 % 2;
        String str = cVar.f26351n;
        int i27 = ((15 | i24) << 1) - (i24 ^ 15);
        f26347t = i27 % 128;
        int i28 = i27 % 2;
        return str;
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26347t;
        int i4 = (i3 ^ 13) + ((i3 & 13) << 1);
        f26346s = i4 % 128;
        if (i4 % 2 != 0) {
            super.finalize();
            throw null;
        }
        super.finalize();
        int i5 = f26346s;
        int i6 = (((i5 + 19) - (19 & i5)) << 1) - (i5 ^ 19);
        f26347t = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26346s;
        int i4 = ((i3 + 47) - (47 | i3)) + (i3 | 47);
        f26347t = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            super.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = super.hashCode();
        int i5 = f26347t;
        int i6 = (((i5 + 19) - (19 & i5)) << 1) - (i5 ^ 19);
        f26346s = i6 % 128;
        if (i6 % 2 == 0) {
            return Integer.valueOf(iHashCode);
        }
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26347t + 97;
        f26346s = i3 % 128;
        int i4 = i3 % 2;
        c cVar2 = cVar.f26348k;
        if (i4 == 0) {
            return cVar2;
        }
        throw null;
    }

    public abstract boolean a();

    public final long b() {
        int i2 = 2 % 2;
        int i3 = f26347t + 13;
        f26346s = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f26349l;
        }
        int i4 = 20 / 0;
        return this.f26349l;
    }

    public final void b(Context context, a aVar, CancellationSignal cancellationSignal) {
        int i2 = 2 % 2;
        int i3 = f26346s + 23;
        f26347t = i3 % 128;
        if (i3 % 2 != 0) {
            e.e(context, this, aVar, cancellationSignal);
            return;
        }
        e.e(context, this, aVar, cancellationSignal);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final c c() {
        int i2 = f26343i * 1393535565;
        f26343i = i2;
        int iMyUid = Process.myUid();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i3 = f26342h * 1493295148;
        f26342h = i3;
        return (c) b(iFreeMemory, i3, iMyUid, 1058468260, new Object[]{this}, -1058468258, i2);
    }

    protected final Object clone() throws CloneNotSupportedException {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i2 = f26335a * 2098809405;
        f26335a = i2;
        int priority = Thread.currentThread().getPriority();
        int i3 = f26338d * 1361718828;
        f26338d = i3;
        return b(priority, i3, i2, 818028441, new Object[]{this}, -818028441, iMaxMemory);
    }

    public final String d() {
        int i2 = f26344j * 1328650834;
        f26344j = i2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i3 = f26341g * 888483883;
        f26341g = i3;
        int i4 = f26340f * (-671371960);
        f26340f = i4;
        return (String) b(i3, i4, elapsedCpuTime, 1230426459, new Object[]{this}, -1230426456, i2);
    }

    public final int e() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f26347t;
        int i5 = i4 + 27;
        f26346s = i5 % 128;
        if (i5 % 2 != 0) {
            i2 = this.f26350m;
            int i6 = 4 / 0;
        } else {
            i2 = this.f26350m;
        }
        int i7 = i4 + 71;
        f26346s = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    public abstract void e(FragmentActivity fragmentActivity, int i2, CancellationSignal cancellationSignal, a aVar);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r9.getClass().equals(getClass()) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r3 = o.l.c.f26347t;
        r2 = (r3 ^ 125) + (((-1) - (((-1) - r3) | ((-1) - 125))) << 1);
        o.l.c.f26346s = r2 % 128;
        r2 = r2 % 2;
        r1 = r3 + 77;
        o.l.c.f26346s = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r8.f26348k = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r9 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        r1 = r1 + 59;
        r0 = r1 % 128;
        o.l.c.f26347t = r0;
        r1 = r1 % 2;
        r8.f26348k = null;
        r1 = r0 + 23;
        o.l.c.f26346s = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r9 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(o.l.c r9) {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = o.l.c.f26347t
            int r0 = r0 + 101
            int r1 = r0 % 128
            o.l.c.f26346s = r1
            int r0 = r0 % r7
            r6 = 0
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L27
            r0 = 69
            int r0 = r0 / r6
            if (r9 != 0) goto L2a
        L16:
            int r1 = r1 + 59
            int r0 = r1 % 128
            o.l.c.f26347t = r0
            int r1 = r1 % r7
            r8.f26348k = r4
            int r1 = r0 + 23
            int r0 = r1 % 128
            o.l.c.f26346s = r0
            int r1 = r1 % r7
            return r5
        L27:
            if (r9 != 0) goto L2a
            goto L16
        L2a:
            java.lang.Class r1 = r9.getClass()
            java.lang.Class r0 = r8.getClass()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5a
            int r3 = o.l.c.f26347t
            r2 = r3 ^ 125(0x7d, float:1.75E-43)
            r0 = 125(0x7d, float:1.75E-43)
            int r1 = (-1) - r3
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r0 = r0 << r5
            int r2 = r2 + r0
            int r0 = r2 % 128
            o.l.c.f26346s = r0
            int r2 = r2 % r7
            int r1 = r3 + 77
            int r0 = r1 % 128
            o.l.c.f26346s = r0
            int r1 = r1 % r7
            if (r1 != 0) goto L56
            return r6
        L56:
            r4.hashCode()
            throw r4
        L5a:
            r8.f26348k = r9
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l.c.e(o.l.c):boolean");
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f26347t;
        int i4 = (i3 ^ 103) + ((i3 & 103) << 1);
        f26346s = i4 % 128;
        int i5 = i4 % 2;
        boolean zEquals = super.equals(obj);
        if (i5 != 0) {
            int i6 = 76 / 0;
        }
        return zEquals;
    }

    protected final void finalize() throws Throwable {
        int i2 = f26339e * (-241855739);
        f26339e = i2;
        int i3 = f26337c * (-2086445439);
        f26337c = i3;
        int id = (int) Thread.currentThread().getId();
        int i4 = f26336b * (-1191975094);
        f26336b = i4;
        b(id, i4, i3, -2062927049, new Object[]{this}, 2062927050, i2);
    }

    public final int hashCode() {
        int i2 = f26345o * (-567660016);
        f26345o = i2;
        int priority = Thread.currentThread().getPriority();
        return ((Integer) b((int) Runtime.getRuntime().maxMemory(), Thread.activeCount(), priority, -226979321, new Object[]{this}, 226979325, i2)).intValue();
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f26347t + 35;
        f26346s = i3 % 128;
        int i4 = i3 % 2;
        String string = super.toString();
        int i5 = f26347t + 19;
        f26346s = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }
}
