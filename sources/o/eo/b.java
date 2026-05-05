package o.eo;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import o.a.m;

/* JADX INFO: loaded from: classes6.dex */
abstract class b<T> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f24249a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f24250b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f24251c = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f24252f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f24253g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f24254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<T> f24255e;

    public interface d<T> {
        void a(o.by.c cVar);

        void c(List<T> list);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, int r10) {
        /*
            byte[] r7 = o.eo.b.$$a
            int r2 = r9 * 3
            int r1 = 1 - r2
            int r0 = r8 * 3
            int r6 = 3 - r0
            int r0 = r10 * 4
            int r5 = 120 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r7 != 0) goto L2b
            r1 = r2
            r0 = r3
        L17:
            int r5 = r5 + r1
            r1 = r0
        L19:
            int r6 = r6 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r2) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L28:
            r1 = r7[r6]
            goto L17
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eo.b.$$c(byte, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24252f = 0;
        f24253g = 1;
        f24250b = 0;
        f24251c = 1;
        a();
        int i2 = f24253g + 69;
        f24252f = i2 % 128;
        int i3 = i2 % 2;
    }

    b() {
        this(new ArrayList());
    }

    private b(List<T> list) {
        this.f24255e = list;
        this.f24254d = 0L;
    }

    static void a() {
        f24249a = new char[]{56564, 56431, 56429, 56405, 56407, 56432, 56432, 56426, 56432, 56438, 56431, 56430, 56496, 56554, 56554, 56546};
    }

    static void init$0() {
        $$a = new byte[]{90, -4, -67, Ascii.NAK};
        $$b = 186;
    }

    private static void k(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2 % 2;
        Object obj = str2;
        if (str2 != null) {
            int i4 = $10 + 53;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            byte[] bytes = str2.getBytes("ISO-8859-1");
            int i6 = $11 + 29;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            obj = bytes;
        }
        byte[] bArr = (byte[]) obj;
        m mVar = new m();
        int i8 = 0;
        int i9 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        char[] cArr = f24249a;
        long j2 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i8;
                        byte b3 = b2;
                        objA = o.d.d.a(TextUtils.lastIndexOf("", '0') + 250, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) + 10, 1376582792, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i13++;
                    i8 = 0;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i10];
        System.arraycopy(cArr, i9, cArr3, 0, i10);
        if (bArr != null) {
            char[] cArr4 = new char[i10];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i10) {
                if (bArr[mVar.f19943d] == 1) {
                    int i14 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(11 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 10 - (Process.myTid() >> 22), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA3 = o.d.d.a(836 - View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 27279), 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1210801192, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20, (char) (35715 - ExpandableListView.getPackedPositionGroup(0L)), Color.green(0) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i16 = $10 + 33;
                $11 = i16 % 128;
                int i17 = i16 % 2;
            }
            int i18 = $10 + 87;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            cArr3 = cArr4;
        }
        if (i12 > 0) {
            char[] cArr5 = new char[i10];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i10);
            int i20 = i10 - i12;
            System.arraycopy(cArr5, 0, cArr3, i20, i12);
            System.arraycopy(cArr5, i12, cArr3, 0, i20);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i10];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i10) {
                    break;
                }
                int i21 = $10 + 55;
                $11 = i21 % 128;
                int i22 = i21 % 2;
                cArr6[mVar.f19943d] = cArr3[(i10 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i11 > 0) {
            int i23 = 0;
            while (true) {
                mVar.f19943d = i23;
                if (mVar.f19943d >= i10) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i23 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    protected abstract T b(o.ef.a aVar) throws o.ef.b;

    o.ef.a b() throws o.ef.b {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        o.ef.c cVar = new o.ef.c();
        Iterator<T> it = this.f24255e.iterator();
        int i3 = f24250b + 19;
        f24251c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 % 3;
        }
        while (it.hasNext()) {
            int i5 = f24251c + 89;
            f24250b = i5 % 128;
            if (i5 % 2 != 0) {
                cVar.a(e(it.next()));
                int i6 = 6 / 0;
            } else {
                cVar.a(e(it.next()));
            }
        }
        Object[] objArr = new Object[1];
        k("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{0, 12, 131, 0}, true, objArr);
        aVar.a(((String) objArr[0]).intern(), this.f24254d);
        Object[] objArr2 = new Object[1];
        k("\u0001\u0001\u0001\u0001", new int[]{12, 4, 0, 0}, true, objArr2);
        aVar.a(((String) objArr2[0]).intern(), cVar);
        return aVar;
    }

    public long c() {
        int i2 = 2 % 2;
        int i3 = f24251c + 53;
        f24250b = i3 % 128;
        int i4 = i3 % 2;
        long jLongValue = this.f24254d.longValue();
        int i5 = f24250b + 49;
        f24251c = i5 % 128;
        int i6 = i5 % 2;
        return jLongValue;
    }

    void c(o.ef.a aVar) throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f24250b + 77;
        f24251c = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        Object[] objArr = new Object[1];
        k("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{0, 12, 131, 0}, true, objArr);
        Long lE = aVar.e(((String) objArr[0]).intern(), (Long) 0L);
        this.f24254d = lE;
        if (lE.longValue() == 0) {
            this.f24254d = Long.valueOf(new Date().getTime());
        }
        this.f24255e.clear();
        Object[] objArr2 = new Object[1];
        k("\u0001\u0001\u0001\u0001", new int[]{12, 4, 0, 0}, true, objArr2);
        Object[] objArr3 = {aVar, ((String) objArr2[0]).intern()};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyUid = Process.myUid();
        int i6 = o.ef.a.f23780n * (-1229108307);
        o.ef.a.f23780n = i6;
        o.ef.c cVar = (o.ef.c) o.ef.a.a(-1398121910, objArr3, iMyUid, i6, 1398121917, iUptimeMillis, iElapsedRealtime);
        int i7 = f24250b + 57;
        f24251c = i7 % 128;
        int i8 = i7 % 2;
        while (true) {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i9 = o.ef.c.f23799b * 1567746851;
            o.ef.c.f23799b = i9;
            int i10 = o.ef.c.f23798a * 1136425123;
            o.ef.c.f23798a = i10;
            if (i5 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i10, i9, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                return;
            }
            int i11 = f24251c + 117;
            f24250b = i11 % 128;
            int i12 = i11 % 2;
            this.f24255e.add(b(cVar.d(i5)));
            i5++;
        }
    }

    public List<T> d() {
        int i2 = 2 % 2;
        int i3 = f24250b + 55;
        int i4 = i3 % 128;
        f24251c = i4;
        int i5 = i3 % 2;
        List<T> list = this.f24255e;
        int i6 = i4 + 33;
        f24250b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 36 / 0;
        }
        return list;
    }

    protected final void d(List<T> list, Long l2) {
        int i2 = 2 % 2;
        int i3 = f24251c + 17;
        f24250b = i3 % 128;
        if (i3 % 2 == 0) {
            this.f24255e.clear();
            this.f24255e.addAll(list);
            this.f24254d = l2;
        } else {
            this.f24255e.clear();
            this.f24255e.addAll(list);
            this.f24254d = l2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    protected abstract o.ef.a e(T t2) throws o.ef.b;

    public void e() {
        int i2 = 2 % 2;
        int i3 = f24250b + 81;
        f24251c = i3 % 128;
        int i4 = i3 % 2;
        this.f24255e.clear();
        this.f24254d = 0L;
    }
}
