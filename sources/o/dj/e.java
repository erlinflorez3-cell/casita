package o.dj;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.m;
import o.dd.g;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements o.c.b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23130a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23131b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23132c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23133d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f23134e = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, int r9, int r10) {
        /*
            int r0 = r8 * 4
            int r8 = 120 - r0
            byte[] r7 = o.dj.e.$$a
            int r0 = r10 + 4
            int r1 = r9 * 3
            int r6 = r1 + 1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L29
            r1 = r0
            r3 = r4
        L13:
            int r0 = -r0
            int r8 = r8 + r0
            r0 = r1
            r2 = r3
        L17:
            byte r1 = (byte) r8
            int r3 = r2 + 1
            r5[r2] = r1
            int r1 = r0 + 1
            if (r3 != r6) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r7[r1]
            goto L13
        L29:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dj.e.$$c(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23132c = 0;
        f23130a = 1;
        f23133d = 0;
        f23131b = 1;
        c();
        int i2 = f23132c + 69;
        f23130a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static void c() {
        f23134e = new char[]{56497, 56546, 56554, 56558, 56556, 56558, 56539, 56542, 56555, 56530, 56537, 56558, 56558, 56553, 56548, 56555, 56558, 56556, 56558, 56535, 56539, 56564, 56558, 56555, 56560, 56557, 56558, 56566, 56547, 56542, 56561, 56558, 56551, 56551, 56562, 56434, 56434, 56718, 56761, 56761, 56751, 56751, 56760, 56718, 56427, 56717, 56745, 56755, 56760, 56754, 56753, 56731, 56732, 56755, 56753, 56755, 56751, 56752, 56756, 56755, 56752, 56727, 56735, 56755, 56498, 56548, 56558, 56563, 56557, 56556, 56550, 56512, 56521, 56566, 56557, 56556, 56561, 56550, 56512, 56519, 56558, 56556, 56558, 56554, 56555, 56559, 56558, 56555, 56546, 56512, 56486, 56486, 56746, 56738, 56740, 56737, 56738, 56745, 56756, 56748, 56747, 56744, 56736, 56446, 56747, 56748, 56742, 56753, 56734, 56755, 56742, 56753, 56736, 56446, 56752, 56752, 56738, 56745, 56744, 56751, 56748, 56756, 56753, 56738, 56715, 56753, 56738, 56740, 56740, 56747, 56742, 56749, 56413, 56738, 56753, 56734, 56742, 56737, 56738, 56746, 56746, 56742, 56413, 56740, 56747, 56742, 56753, 56752, 56738, 56754, 56750, 56738, 56751, 56413, 56426, 56413, 56737, 56738, 56753, 56736, 56738, 56753, 56738, 56737, 56413, 56738, 56737, 56734, 56751, 56740, 56749, 56754, 56413, 56749, 56749, 56734, 56413, 56426, 56413, 56751, 56738, 56740, 56740, 56742, 56751, 56721, 56753, 56747, 56738, 56504, 56560, 56520, 56522, 56562, 56555, 56556, 56553, 56546, 56548, 56514, 56514, 56548, 56556, 56556, 56548, 56555, 56556, 56548, 56549, 56550, 56556, 56545, 56537, 56556, 56565, 56563, 56560, 56558, 56555, 56552, 56556, 56563, 56538, 56530, 56555, 56558, 56559, 56555, 56554, 56558, 56556, 56558, 56535, 56530, 56551, 56556, 56558, 56563, 56561, 56552, 56548, 56549, 56550, 56553, 56553, 56553, 56561, 56548, 56547, 56557, 56552, 56551, 56550, 56555, 56521, 56486, 56486, 56519, 56558, 56519, 56512};
    }

    private static void f(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i2 = 2 % 2;
        int i3 = $10 + 121;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = 1;
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr = f23134e;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i11])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        int iBlue = 249 - Color.blue(i5);
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + i7);
                        int iResolveSize = View.resolveSize(i5, i5) + 11;
                        int i12 = $$b;
                        byte b2 = (byte) ((i12 + 1) - (i12 | 1));
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(iBlue, cLastIndexOf, iResolveSize, 1376582792, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i11++;
                    i5 = 0;
                    i7 = 1;
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
        char[] cArr3 = new char[i8];
        System.arraycopy(cArr, i6, cArr3, 0, i8);
        if (bArr != null) {
            char[] cArr4 = new char[i8];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i8) {
                if (bArr[mVar.f19943d] == 1) {
                    int i13 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(11 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 10 - ((Process.getThreadPriority(0) + 20) >> 6), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    int i14 = $10 + 89;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    int i16 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA3 = o.d.d.a(836 - (Process.myPid() >> 22), (char) ((Process.myPid() >> 22) + 27279), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, -1210801192, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(21 - (Process.myPid() >> 22), (char) (View.MeasureSpec.getSize(0) + 35715), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            int i17 = $10 + 103;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            cArr3 = cArr4;
        }
        if (i10 > 0) {
            char[] cArr5 = new char[i8];
            System.arraycopy(cArr3, 0, cArr5, 0, i8);
            int i19 = i8 - i10;
            System.arraycopy(cArr5, 0, cArr3, i19, i10);
            System.arraycopy(cArr5, i10, cArr3, 0, i19);
            int i20 = $10 + 65;
            $11 = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 2 / 2;
            }
        }
        if (z2) {
            char[] cArr6 = new char[i8];
            int i22 = 0;
            while (true) {
                mVar.f19943d = i22;
                if (mVar.f19943d >= i8) {
                    break;
                }
                int i23 = $11 + 27;
                $10 = i23 % 128;
                if (i23 % 2 != 0) {
                    cArr6[mVar.f19943d] = cArr3[i8 << mVar.f19943d];
                    i22 = mVar.f19943d;
                } else {
                    cArr6[mVar.f19943d] = cArr3[(i8 - mVar.f19943d) - 1];
                    i22 = mVar.f19943d + 1;
                }
            }
            cArr3 = cArr6;
        }
        if (i9 > 0) {
            int i24 = 0;
            while (true) {
                mVar.f19943d = i24;
                if (mVar.f19943d >= i8) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i24 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{Ascii.EM, -93, 95, -122};
        $$b = 39;
    }

    @Override // o.c.b
    public final o.c.d a(Context context, o.c.c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23131b + 39;
        f23133d = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            f("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 34, 0, 28}, false, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            f("\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000", new int[]{34, 30, 197, 0}, true, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(cVar);
            Object[] objArr3 = new Object[1];
            f("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{64, 28, 0, 0}, true, objArr3);
            f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
            int i5 = f23133d + 9;
            f23131b = i5 % 128;
            int i6 = i5 % 2;
        }
        return o.c.d.f21984a;
    }

    @Override // o.c.b
    public final g a(Context context) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (new o.by.a().c(context)) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 34, 0, 28}, false, objArr);
                String strIntern2 = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f(null, new int[]{92, 97, 189, 36}, true, objArr2);
                f.c(strIntern2, ((String) objArr2[0]).intern());
                int i3 = f23133d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f23131b = i3 % 128;
                int i4 = i3 % 2;
            }
            g gVar = g.f22864i;
            int i5 = f23133d + 63;
            f23131b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 11 / 0;
            }
            return gVar;
        }
        if (f.a()) {
            int i7 = f23133d + 3;
            f23131b = i7 % 128;
            if (i7 % 2 == 0) {
                Object[] objArr3 = new Object[1];
                f("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 34, 0, 28}, false, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                f("\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{189, 72, 0, 19}, false, objArr4);
                obj = objArr4[0];
            } else {
                Object[] objArr5 = new Object[1];
                f("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 34, 0, 28}, false, objArr5);
                strIntern = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                f("\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{189, 72, 0, 19}, false, objArr6);
                obj = objArr6[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        return g.f22862g;
    }
}
