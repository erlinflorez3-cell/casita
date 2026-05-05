package o.bv;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import java.lang.reflect.Method;
import o.a.l;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int[] f21718a = null;

    /* JADX INFO: renamed from: b */
    private static int f21719b = 0;

    /* JADX INFO: renamed from: c */
    private static int f21720c = 0;

    /* JADX INFO: renamed from: d */
    private static int f21721d = 0;

    /* JADX INFO: renamed from: e */
    private static int f21722e = 0;

    private static String $$c(int i2, int i3, int i4) {
        int i5 = 121 - (i3 * 2);
        int i6 = i4 * 2;
        int i7 = 3 - (i2 * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        int i8 = 0 - i6;
        int i9 = -1;
        if (bArr == null) {
            i5 = i7 + (-i5);
            i7 = i7;
        }
        while (true) {
            int i10 = i7 + 1;
            i9++;
            bArr2[i9] = (byte) i5;
            if (i9 == i8) {
                return new String(bArr2, 0);
            }
            i5 += -bArr[i10];
            i7 = i10;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21721d = 0;
        f21720c = 1;
        f21722e = 0;
        f21719b = 1;
        a();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        int i2 = f21721d + 41;
        f21720c = i2 % 128;
        int i3 = i2 % 2;
    }

    static void a() {
        f21718a = new int[]{1820116205, 1671829416, 876677411, -1417667192, 951346125, -1547670432, 2035143561, 1005336925, -1211923447, -2067959587, -600407938, 326056714, -1048616812, -429148851, -1741954609, -945426568, 413835530, -1149039429};
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0022, code lost:
    
        if (r7 != 18) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0026, code lost:
    
        return o.bv.i.f21760g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0031, code lost:
    
        if (r7 != 18) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0036, code lost:
    
        return o.bv.i.f21757d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.bv.i b(int r7) {
        /*
            r6 = 2
            int r0 = r6 % r6
            int r0 = o.bv.c.f21719b
            int r5 = r0 + 45
            int r0 = r5 % 128
            o.bv.c.f21722e = r0
            int r5 = r5 % r6
            r4 = 18
            r3 = 9
            r2 = 3
            r1 = 1
            if (r5 == 0) goto L27
            r0 = 40
            int r0 = r0 / 0
            if (r7 == 0) goto L43
            if (r7 == r1) goto L40
            if (r7 == r6) goto L3d
            if (r7 == r2) goto L3a
            if (r7 == r3) goto L37
            if (r7 == r4) goto L34
        L24:
            o.bv.i r0 = o.bv.i.f21760g
            return r0
        L27:
            if (r7 == 0) goto L43
            if (r7 == r1) goto L40
            if (r7 == r6) goto L3d
            if (r7 == r2) goto L3a
            if (r7 == r3) goto L37
            if (r7 == r4) goto L34
            goto L24
        L34:
            o.bv.i r0 = o.bv.i.f21757d
            return r0
        L37:
            o.bv.i r0 = o.bv.i.f21754a
            return r0
        L3a:
            o.bv.i r0 = o.bv.i.f21756c
            return r0
        L3d:
            o.bv.i r0 = o.bv.i.f21758e
            return r0
        L40:
            o.bv.i r0 = o.bv.i.f21760g
            return r0
        L43:
            o.bv.i r2 = o.bv.i.f21755b
            int r0 = o.bv.c.f21719b
            int r1 = r0 + 107
            int r0 = r1 % 128
            o.bv.c.f21722e = r0
            int r1 = r1 % r6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bv.c.b(int):o.bv.i");
    }

    private static void f(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f21718a;
        int i4 = 989264422;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(Color.alpha(0) + 675, (char) Gravity.getAbsoluteGravity(0, 0), KeyEvent.getDeadChar(0, 0) + 12, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 989264422;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f21718a;
        if (iArr5 != null) {
            int i7 = $11 + 51;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $11 + 25;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) i5;
                        byte b5 = b4;
                        objA2 = o.d.d.a(TextUtils.getOffsetBefore("", i5) + 675, (char) ((-1) - TextUtils.lastIndexOf("", '0', i5)), 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(675 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 12 - View.MeasureSpec.getMode(0), -328001469, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i9++;
                }
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        lVar.f19941d = i5;
        while (lVar.f19941d < iArr.length) {
            int i11 = $11 + 61;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                lVar.f19942e ^= iArr4[i13];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objA4 = o.d.d.a(301 - View.MeasureSpec.getSize(0), (char) (52697 - Color.argb(0, 0, 0, 0)), ExpandableListView.getPackedPositionType(0L) + 11, -1416256172, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i13++;
            }
            int i15 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i15;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i16 = lVar.f19942e;
            int i17 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr6 = {lVar, lVar};
            Object objA5 = o.d.d.a(986820978);
            if (objA5 == null) {
                byte b10 = (byte) 0;
                byte b11 = (byte) (b10 + 2);
                objA5 = o.d.d.a(229 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (View.resolveSize(0, 0) + 51004), 9 - TextUtils.indexOf("", "", 0, 0), -330018025, false, $$c(b10, b11, (byte) (b11 - 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        String str = new String(cArr2, 0, i2);
        int i18 = $10 + 31;
        $11 = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void init$0() {
        $$a = new byte[]{78, MessagePack.Code.UINT64, MessagePack.Code.NIL, -88};
        $$b = 118;
    }

    @Override // o.bv.b
    public final i a(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21722e + 45;
        f21719b = i3 % 128;
        int i4 = i3 % 2;
        o.ea.c.a();
        int priority = Thread.currentThread().getPriority();
        int iMyUid = Process.myUid();
        int i5 = o.ea.b.f23481b * (-1773581773);
        o.ea.b.f23481b = i5;
        i iVarB = b(((Integer) o.ea.b.a(iMyUid, 1428818465, priority, new Object[]{context}, Thread.activeCount(), i5, -1428818463)).intValue());
        if (f.a()) {
            Object[] objArr = new Object[1];
            f(new int[]{215552651, -913304138, 861818263, -698633624, -336793330, -2114770636, 1591556280, 522222952, -898584122, 942873836, 1794897177, 519595439, -1911081238, -938089823}, (ViewConfiguration.getTouchSlop() >> 8) + 27, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            f(new int[]{-674041943, 66862907, 1449504017, -1145458885, -1513469229, 38210703}, 12 - View.resolveSize(0, 0), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(iVarB).toString());
        }
        int i6 = f21722e + 99;
        f21719b = i6 % 128;
        if (i6 % 2 != 0) {
            return iVarB;
        }
        throw null;
    }

    @Override // o.bv.b
    public final void c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21719b + 21;
        f21722e = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                ProviderInstaller.installIfNeeded(context);
            } else {
                ProviderInstaller.installIfNeeded(context);
                int i4 = 27 / 0;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e2) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f(new int[]{215552651, -913304138, 861818263, -698633624, -336793330, -2114770636, 1591556280, 522222952, -898584122, 942873836, 1794897177, 519595439, -1911081238, -938089823}, 27 - View.combineMeasuredStates(0, 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f(new int[]{1997520215, -1781567085, 1156970827, -40735907, -422992074, -2039612903, -651342638, -1055453698, -709702251, 1696983701, -1798063543, 886340850, -577709063, 1770648215, 1284952743, 1469501523, 1965348441, 1790672510, -121157782, 1404043723, 1547457595, -58159167, 930005957, 1187930131, 1669060328, -135954796, 1343057715, -1160207404, 797763941, -1840761126}, Color.alpha(0) + 58, objArr2);
                f.e(strIntern, ((String) objArr2[0]).intern(), e2);
                int i5 = f21722e + 65;
                f21719b = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    @Override // o.bv.b
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21722e + 55;
        f21719b = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f(new int[]{215552651, -913304138, 861818263, -698633624, -336793330, -2114770636, 1591556280, 522222952, -898584122, 942873836, 1794897177, 519595439, -1911081238, -938089823}, ImageFormat.getBitsPerPixel(0) + 28, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f21719b + 65;
        f21722e = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }
}
