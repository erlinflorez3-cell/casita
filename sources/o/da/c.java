package o.da;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.m;
import o.cr.d;
import o.ef.a;
import o.ff.b;
import o.fl.e;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d<e> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22707a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f22708b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22709c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22710d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22711e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r10, short r11, short r12) {
        /*
            int r0 = r11 * 3
            int r9 = r0 + 1
            int r0 = r12 * 2
            int r8 = 3 - r0
            int r0 = r10 * 4
            int r0 = 120 - r0
            byte[] r7 = o.da.c.$$a
            byte[] r6 = new byte[r9]
            r5 = 0
            if (r7 != 0) goto L2d
            r2 = r8
            r4 = r5
        L15:
            int r0 = -r0
            int r0 = r0 + r8
            r8 = r2
            r3 = r4
        L19:
            int r2 = r8 + 1
            byte r1 = (byte) r0
            int r4 = r3 + 1
            r6[r3] = r1
            if (r4 != r9) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L28:
            r1 = r7[r2]
            r8 = r0
            r0 = r1
            goto L15
        L2d:
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.da.c.$$c(int, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22709c = 0;
        f22707a = 1;
        f22711e = 0;
        f22710d = 1;
        c();
        int i2 = f22707a + 125;
        f22709c = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static e c(a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        f("\u0001\u0001\u0000\u0001\u0001", new int[]{0, 5, 0, 5}, false, objArr);
        short sShortValue = aVar.l(((String) objArr[0]).intern()).shortValue();
        Object[] objArr2 = new Object[1];
        f(null, new int[]{5, 3, 49, 1}, true, objArr2);
        Object[] objArr3 = {aVar, ((String) objArr2[0]).intern()};
        int i3 = a.f23778l * 493926616;
        a.f23778l = i3;
        int i4 = a.f23779m * 1131312688;
        a.f23779m = i4;
        int iIntValue = ((Integer) a.a(1122077797, objArr3, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i3, i4)).intValue();
        e eVar = new e(true, b.f25845c, sShortValue);
        eVar.c(0);
        eVar.d(1);
        eVar.e(iIntValue);
        int i5 = f22710d + 87;
        f22711e = i5 % 128;
        int i6 = i5 % 2;
        return eVar;
    }

    static void c() {
        f22708b = new char[]{56500, 56555, 56553, 56548, 56558, 56338, 56340, 56357, 56505, 56555, 56548, 56546, 56547, 56539, 56549, 56559, 56536, 56543, 56561, 56553, 56553, 56563, 56557, 56536, 56538, 56556, 56558, 56544};
    }

    private static void f(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i2 = 2 % 2;
        Object obj = str2;
        if (str2 != null) {
            byte[] bytes = str2.getBytes("ISO-8859-1");
            int i3 = $10 + 99;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            obj = bytes;
        }
        byte[] bArr = (byte[]) obj;
        m mVar = new m();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = 1;
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr = f22708b;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i11])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i7;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a((ExpandableListView.getPackedPositionForGroup(i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i5) == 0L ? 0 : -1)) + 249, (char) View.MeasureSpec.makeMeasureSpec(i5, i5), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1376582792, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
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
                int i12 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                if (bArr[mVar.f19943d] == 1) {
                    int i14 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(10 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.getTrimmedLength(""), View.MeasureSpec.getMode(0) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA3 = o.d.d.a(836 - View.MeasureSpec.getMode(0), (char) (27279 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.indexOf((CharSequence) "", '0') + 12, -1210801192, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(View.resolveSize(0, 0) + 21, (char) (KeyEvent.normalizeMetaState(0) + 35715), (-16777205) - Color.rgb(0, 0, 0), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i10 > 0) {
            char[] cArr5 = new char[i8];
            System.arraycopy(cArr3, 0, cArr5, 0, i8);
            int i16 = i8 - i10;
            System.arraycopy(cArr5, 0, cArr3, i16, i10);
            System.arraycopy(cArr5, i10, cArr3, 0, i16);
        }
        if (z2) {
            int i17 = $11 + 7;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr6 = new char[i8];
            int i19 = 0;
            while (true) {
                mVar.f19943d = i19;
                if (mVar.f19943d >= i8) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr3[(i8 - mVar.f19943d) - 1];
                i19 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i9 > 0) {
            mVar.f19943d = 0;
            while (mVar.f19943d < i8) {
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                mVar.f19943d++;
                int i20 = $10 + 81;
                $11 = i20 % 128;
                int i21 = i20 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{44, -120, 71, -108};
        $$b = 204;
    }

    @Override // o.cr.d
    public final /* synthetic */ o.ff.a e(a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22711e + 59;
        f22710d = i3 % 128;
        int i4 = i3 % 2;
        e eVarC = c(aVar);
        int i5 = f22711e + 35;
        f22710d = i5 % 128;
        if (i5 % 2 != 0) {
            return eVarC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
