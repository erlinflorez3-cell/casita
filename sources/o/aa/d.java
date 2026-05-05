package o.aa;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import o.a.m;
import o.ef.c;
import o.er.o;

/* JADX INFO: loaded from: classes6.dex */
final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f20060a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f20061b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f20062c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f20063d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f20064e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, byte r9, byte r10) {
        /*
            int r0 = r8 * 2
            int r8 = 1 - r0
            int r0 = r10 * 2
            int r7 = 4 - r0
            int r0 = r9 * 4
            int r6 = 120 - r0
            byte[] r5 = o.aa.d.$$a
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r5 != 0) goto L2b
            r0 = r7
            r2 = r3
        L15:
            int r7 = r7 + 1
            int r6 = r6 + r0
            r1 = r2
        L19:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r8) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r1 = r5[r7]
            r0 = r6
            r6 = r1
            goto L15
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aa.d.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20063d = 0;
        f20064e = 1;
        f20062c = 0;
        f20060a = 1;
        d();
        int i2 = f20064e + 89;
        f20063d = i2 % 128;
        int i3 = i2 % 2;
    }

    d() {
    }

    static c b(List<o> list) throws o.ef.b {
        int i2 = 2 % 2;
        c cVar = new c();
        Iterator<o> it = list.iterator();
        while (it.hasNext()) {
            int i3 = f20060a + 83;
            f20062c = i3 % 128;
            if (i3 % 2 != 0) {
                cVar.a(c(it.next()));
                int i4 = 86 / 0;
            } else {
                cVar.a(c(it.next()));
            }
        }
        int i5 = f20062c + 83;
        f20060a = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }

    private static o b(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20060a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f20062c = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f("\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 6, 0, 4}, false, objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i5 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i5;
        String str = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
        Object[] objArr3 = new Object[1];
        f("\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001", new int[]{6, 14, 14, 7}, false, objArr3);
        String strS = aVar.s(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        f("\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{74, 14, 111, 0}, true, objArr4);
        o.ef.a aVarV = aVar.v(((String) objArr4[0]).intern());
        o.e eVar = null;
        if (aVarV != null) {
            Object[] objArr5 = new Object[1];
            f("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{20, 8, 48, 0}, false, objArr5);
            String strS2 = aVarV.s(((String) objArr5[0]).intern());
            Object[] objArr6 = new Object[1];
            f("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{28, 8, 81, 0}, false, objArr6);
            String strS3 = aVarV.s(((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            f("\u0001\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{36, 7, 0, 2}, true, objArr7);
            String strS4 = aVarV.s(((String) objArr7[0]).intern());
            Object[] objArr8 = new Object[1];
            f(null, new int[]{43, 8, 56, 2}, true, objArr8);
            String strS5 = aVarV.s(((String) objArr8[0]).intern());
            Object[] objArr9 = new Object[1];
            f("\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{51, 13, 0, 0}, false, objArr9);
            String strS6 = aVarV.s(((String) objArr9[0]).intern());
            Object[] objArr10 = new Object[1];
            f("\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001", new int[]{64, 10, 0, 8}, true, objArr10);
            eVar = new o.e(strS2, strS3, strS4, strS5, strS6, aVarV.s(((String) objArr10[0]).intern()));
        }
        o oVar = new o(str, strS, eVar);
        int i6 = f20062c + 121;
        f20060a = i6 % 128;
        int i7 = i6 % 2;
        return oVar;
    }

    private static o.ef.a c(o oVar) throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        Object[] objArr = new Object[1];
        f("\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 6, 0, 4}, false, objArr);
        aVar.a(((String) objArr[0]).intern(), (Object) oVar.c());
        Object[] objArr2 = new Object[1];
        f("\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001", new int[]{6, 14, 14, 7}, false, objArr2);
        aVar.a(((String) objArr2[0]).intern(), (Object) oVar.d());
        if (oVar.a() != null) {
            o.ef.a aVar2 = new o.ef.a();
            Object[] objArr3 = new Object[1];
            f("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{20, 8, 48, 0}, false, objArr3);
            aVar2.a(((String) objArr3[0]).intern(), (Object) oVar.a().c());
            Object[] objArr4 = new Object[1];
            f("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{28, 8, 81, 0}, false, objArr4);
            aVar2.a(((String) objArr4[0]).intern(), (Object) oVar.a().d());
            Object[] objArr5 = new Object[1];
            f("\u0001\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{36, 7, 0, 2}, true, objArr5);
            String strIntern = ((String) objArr5[0]).intern();
            Object[] objArr6 = {oVar.a()};
            o.e.f25108b = o.e.f25108b * (-315355158);
            o.e.f25109c = o.e.f25109c * 1761739739;
            o.e.f25110d = o.e.f25110d * 1489632990;
            aVar2.a(strIntern, o.e.d(1099404672, (int) Process.getElapsedCpuTime(), r12, r13, objArr6, r15, -1099404672));
            Object[] objArr7 = new Object[1];
            f(null, new int[]{43, 8, 56, 2}, true, objArr7);
            String strIntern2 = ((String) objArr7[0]).intern();
            Object[] objArr8 = {oVar.a()};
            o.e.f25112h = o.e.f25112h * 918936327;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            o.e.f25113i = o.e.f25113i * 1875991940;
            aVar2.a(strIntern2, o.e.d(-764060794, r11, iFreeMemory, r13, objArr8, iElapsedRealtime, 764060796));
            Object[] objArr9 = new Object[1];
            f("\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{51, 13, 0, 0}, false, objArr9);
            String strIntern3 = ((String) objArr9[0]).intern();
            Object[] objArr10 = {oVar.a()};
            o.e.f25107a = o.e.f25107a * (-2020098597);
            o.e.f25111e = o.e.f25111e * 461577263;
            aVar2.a(strIntern3, o.e.d(581231350, new Random().nextInt(), (int) SystemClock.elapsedRealtime(), r13, objArr10, r15, -581231349));
            Object[] objArr11 = new Object[1];
            f("\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001", new int[]{64, 10, 0, 8}, true, objArr11);
            aVar2.a(((String) objArr11[0]).intern(), (Object) oVar.a().i());
            Object[] objArr12 = new Object[1];
            f("\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{74, 14, 111, 0}, true, objArr12);
            aVar.a(((String) objArr12[0]).intern(), aVar2);
        }
        int i3 = f20062c + 93;
        f20060a = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    static void d() {
        f20061b = new char[]{56505, 56555, 56534, 56534, 56547, 56546, 56505, 56562, 56569, 56558, 56549, 56565, 56567, 56562, 56560, 56567, 56569, 56548, 56553, 56571, 56521, 56337, 56336, 56341, 56346, 56347, 56345, 56571, 56537, 56370, 56369, 56374, 56379, 56380, 56378, 56348, 56496, 56545, 56557, 56566, 56558, 56550, 56545, 56345, 56346, 56349, 56364, 56345, 56364, 56363, 56343, 56497, 56545, 56544, 56551, 56559, 56561, 56563, 56554, 56550, 56535, 56537, 56553, 56548, 56506, 56561, 56561, 56562, 56553, 56545, 56544, 56545, 56557, 56565, 56561, 56418, 56411, 56410, 56410, 56403, 56385, 56387, 56409, 56410, 56409, 56411, 56409, 56404};
    }

    static List<o> e(c cVar) throws o.ef.b {
        int i2 = 2 % 2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i3 = c.f23799b * 1567746851;
        c.f23799b = i3;
        int i4 = c.f23798a * 1136425123;
        c.f23798a = i4;
        int iIntValue = ((Integer) c.b((int) Runtime.getRuntime().maxMemory(), i4, i3, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue();
        ArrayList arrayList = new ArrayList(iIntValue);
        int i5 = f20062c + 5;
        f20060a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < iIntValue) {
            int i8 = f20062c + 61;
            f20060a = i8 % 128;
            if (i8 % 2 == 0) {
                arrayList.add(b(cVar.d(i7)));
                i7 += 12;
            } else {
                arrayList.add(b(cVar.d(i7)));
                i7++;
            }
        }
        return arrayList;
    }

    private static void f(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = f20061b;
        long j2 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(250 - (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)), (char) ((SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") + 11, 1376582792, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i4 = 0;
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
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i6) {
                if (bArr[mVar.f19943d] == 1) {
                    int i10 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(MotionEvent.axisFromString("") + 12, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA3 = o.d.d.a(836 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (27279 - (ViewConfiguration.getPressedStateDuration() >> 16)), 10 - ImageFormat.getBitsPerPixel(0), -1210801192, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 35715), 11 - (Process.myTid() >> 22), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i12 = $11 + 75;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                char[] cArr5 = new char[i6];
                i2 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i6);
                System.arraycopy(cArr5, 0, cArr3, i6 + i8, i8);
                System.arraycopy(cArr5, i8, cArr3, 0, i6 << i8);
            } else {
                i2 = 0;
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr3, 0, cArr6, 0, i6);
                int i13 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr3, i13, i8);
                System.arraycopy(cArr6, i8, cArr3, 0, i13);
            }
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr7 = new char[i6];
            mVar.f19943d = i2;
            while (mVar.f19943d < i6) {
                cArr7[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - 1];
                mVar.f19943d++;
                int i14 = $11 + 23;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            cArr3 = cArr7;
        }
        if (i7 > 0) {
            int i16 = $10 + 73;
            $11 = i16 % 128;
            char c3 = 2;
            int i17 = i16 % 2;
            mVar.f19943d = 0;
            while (mVar.f19943d < i6) {
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[c3]);
                mVar.f19943d++;
                int i18 = $10 + 89;
                $11 = i18 % 128;
                c3 = 2;
                int i19 = i18 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{90, -4, -67, Ascii.NAK};
        $$b = 252;
    }
}
