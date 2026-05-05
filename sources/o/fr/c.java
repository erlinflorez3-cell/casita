package o.fr;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import o.a.i;
import o.a.l;
import o.d.d;
import o.ea.f;
import o.ef.a;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f26138a = 0;

    /* JADX INFO: renamed from: b */
    public static int f26139b = 0;

    /* JADX INFO: renamed from: c */
    public static int f26140c = 0;

    /* JADX INFO: renamed from: d */
    public static int f26141d = 0;

    /* JADX INFO: renamed from: e */
    public static int f26142e = 0;

    /* JADX INFO: renamed from: l */
    private static int[] f26143l = null;

    /* JADX INFO: renamed from: m */
    private static int f26144m = 0;

    /* JADX INFO: renamed from: o */
    private static long f26145o = 0;

    /* JADX INFO: renamed from: p */
    private static int f26146p = 0;

    /* JADX INFO: renamed from: q */
    private static int f26147q = 0;

    /* JADX INFO: renamed from: r */
    private static char f26148r = 0;

    /* JADX INFO: renamed from: s */
    private static int f26149s = 0;

    /* JADX INFO: renamed from: t */
    private static int f26150t = 0;

    /* JADX INFO: renamed from: f */
    private String f26151f;

    /* JADX INFO: renamed from: h */
    private String f26153h;

    /* JADX INFO: renamed from: j */
    private boolean f26155j = false;

    /* JADX INFO: renamed from: i */
    private final HashMap<String, String> f26154i = new HashMap<>();

    /* JADX INFO: renamed from: g */
    private final HashMap<String, HashMap<String, String>> f26152g = new HashMap<>();

    /* JADX INFO: renamed from: k */
    private final HashMap<String, String> f26156k = new HashMap<>();

    /* JADX INFO: renamed from: n */
    private final HashMap<String, HashMap<String, String>> f26157n = new HashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, short r10, byte r11) {
        /*
            int r1 = r10 + 4
            byte[] r8 = o.fr.c.$$a
            int r7 = r11 + 65
            int r6 = r9 * 3
            int r0 = r6 + 1
            byte[] r5 = new byte[r0]
            r4 = 0
            if (r8 != 0) goto L28
            r2 = r4
            r0 = r1
        L11:
            int r1 = -r1
            int r1 = r1 + r7
            r3 = r2
            r7 = r1
            r1 = r0
        L16:
            byte r2 = (byte) r7
            int r0 = r1 + 1
            r5[r3] = r2
            int r2 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            r1 = r8[r0]
            goto L11
        L28:
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fr.c.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26138a = 1036803548;
        f26142e = 1762909048;
        f26141d = 1600303577;
        f26139b = 582781299;
        f26140c = 471213602;
        f26150t = 0;
        f26149s = 1;
        f26147q = 0;
        f26146p = 1;
        g();
        Color.blue(0);
        Color.rgb(0, 0, 0);
        TypedValue.complexToFloat(0);
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getKeyRepeatDelay();
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getScrollBarSize();
        Process.getElapsedCpuTime();
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getScrollFriction();
        TextUtils.lastIndexOf("", '0');
        TextUtils.indexOf("", "", 0);
        TextUtils.getOffsetAfter("", 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getScrollBarFadeDuration();
        int i2 = f26150t + 19;
        f26149s = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26147q;
        int i4 = i3 + 93;
        f26146p = i4 % 128;
        int i5 = i4 % 2;
        String str = cVar.f26151f;
        int i6 = i3 + 11;
        f26146p = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26147q + 27;
        f26146p = i3 % 128;
        int i4 = i3 % 2;
        String str = cVar.f26153h;
        if (i4 == 0) {
            int i5 = 66 / 0;
        }
        return str;
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~((i2 + i7) - (i2 & i7));
        int i9 = ~((-1) - (((-1) - i7) & ((-1) - i4)));
        int i10 = (-1) - (((-1) - i8) & ((-1) - i9));
        int i11 = ~i2;
        int i12 = ~i7;
        int i13 = (-1) - (((-1) - ((-1) - (((-1) - (~((i11 + i4) - (i11 & i4)))) & ((-1) - (~((i11 + i12) - (i11 & i12))))))) & ((-1) - (~(i12 | i4))));
        int i14 = ~i4;
        int i15 = ~(((-1) - (((-1) - i14) & ((-1) - i2))) | i7);
        int i16 = (i13 + i15) - (i13 & i15);
        int i17 = (~(i14 | i12)) | i2;
        int i18 = (i17 + i9) - (i17 & i9);
        int i19 = i2 + i7 + i6 + (1962400304 * i3) + (1167700406 * i5);
        int i20 = i19 * i19;
        int i21 = ((i2 * (-1019457937)) - 559939584) + ((-1019457937) * i7) + (2001489518 * i10) + (i16 * (-2001489518)) + ((-2001489518) * i18) + (1274019840 * i6) + ((-1660944384) * i3) + ((-325058560) * i5) + (867827712 * i20);
        int i22 = ((i2 * (-1629562239)) - 1134582380) + (i7 * (-1629562239)) + (i10 * (-910)) + (i16 * 910) + (i18 * 910) + (i6 * (-1629561329)) + (i3 * (-1621399344)) + (i5 * (-873382486)) + (i20 * 1407582208);
        int i23 = i21 + (i22 * i22 * (-1895432192));
        if (i23 == 1) {
            return d(objArr);
        }
        if (i23 == 2) {
            return b(objArr);
        }
        if (i23 != 3) {
            c cVar = (c) objArr[0];
            int i24 = 2 % 2;
            int i25 = f26147q + 93;
            int i26 = i25 % 128;
            f26146p = i26;
            int i27 = i25 % 2;
            boolean z2 = cVar.f26155j;
            int i28 = i26 + 59;
            f26147q = i28 % 128;
            int i29 = i28 % 2;
            return Boolean.valueOf(z2);
        }
        c cVar2 = (c) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i30 = 2 % 2;
        int i31 = f26146p + 105;
        f26147q = i31 % 128;
        int i32 = i31 % 2;
        HashMap<String, String> map = cVar2.f26157n.get(str);
        if (map != null) {
            map.remove(str2);
            int i33 = f26147q + 53;
            f26146p = i33 % 128;
            int i34 = i33 % 2;
        }
        return null;
    }

    static void g() {
        f26143l = new int[]{1430425843, 1578569436, -2016895957, -2058941790, -697125880, -867097596, -1934763846, -395186564, 943176687, -771419459, -51364079, -2096188296, -625314902, 1632390581, 1252507926, 1418751004, -308724111, 1209636412};
        f26145o = 740602047300126166L;
        f26144m = 1564493270;
        f26148r = (char) 12087;
    }

    static void init$0() {
        $$a = new byte[]{101, -104, -88, -105};
        $$b = 231;
    }

    private static void u(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f26143l;
        char c2 = '0';
        int i5 = 989264422;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 53;
                $10 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objA = d.a(i5);
                    if (objA == null) {
                        int iArgb = Color.argb(i6, i6, i6, i6) + 675;
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int iLastIndexOf = 11 - TextUtils.lastIndexOf("", c2, i6);
                        byte b2 = (byte) i6;
                        byte b3 = (byte) (b2 - 1);
                        objA = d.a(iArgb, trimmedLength, iLastIndexOf, -328001469, false, $$c(b2, b3, (byte) (56 & b3)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    int i10 = $11 + 75;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    i3 = 2;
                    c2 = '0';
                    i5 = 989264422;
                    i6 = 0;
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
        int[] iArr5 = f26143l;
        int i12 = 16;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i13])};
                Object objA2 = d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = d.a(674 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> i12), 12 - (KeyEvent.getMaxKeyCode() >> 16), -328001469, false, $$c(b4, b5, (byte) (56 & b5)), new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i13++;
                i12 = 16;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i14 = $11 + 5;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                lVar.f19942e ^= iArr4[i16];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA3 = d.a(301 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 52698), TextUtils.getCapsMode("", 0, 0) + 11, -1416256172, false, $$c(b6, b7, (byte) ((-1) - (((-1) - b7) | ((-1) - 54)))), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i16++;
                int i18 = $10 + 69;
                $11 = i18 % 128;
                int i19 = i18 % 2;
            }
            int i20 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i20;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i21 = lVar.f19942e;
            int i22 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = d.a(986820978);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 - 1);
                objA4 = d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 229, (char) (51005 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 9, -330018025, false, $$c(b8, b9, (byte) (52 & b9)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void v(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 47;
        $10 = i5 % 128;
        Object obj = null;
        Object charArray = str6;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str6 != null) {
            int i6 = i4 + 121;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                str6.toCharArray();
                throw null;
            }
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            int i7 = $10 + 31;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            charArray3 = str4.toCharArray();
        }
        i iVar = new i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = d.a(106 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getTrimmedLength("") + 11, -155898465, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = d.a(847 - Color.alpha(0), (char) (6488 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11, -694521287, false, $$c(b4, b5, (byte) (b5 + 4)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA3 = d.a(458 - KeyEvent.getDeadChar(0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, 1804962841, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objA4 = d.a(639 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (View.MeasureSpec.getMode(0) + 65100), View.MeasureSpec.getSize(0) + 12, 1636969060, false, $$c(b8, b9, (byte) ((b9 + 57) - (57 | b9))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (r8[iVar.f19932b] ^ cArr3[iIntValue2])) ^ (f26145o ^ 740602047300126166L)) ^ ((long) ((int) (((long) f26144m) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f26148r) ^ 740602047300126166L))));
                iVar.f19932b++;
                obj = null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    public final String a(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f26147q + 75;
        f26146p = i3 % 128;
        if (i3 % 2 == 0) {
            this.f26152g.get(str);
            throw null;
        }
        HashMap<String, String> map = this.f26152g.get(str);
        if (map != null) {
            return map.get(str2);
        }
        int i4 = f26146p + 71;
        f26147q = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    final a a() throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        a aVar = new a();
        Object[] objArr = new Object[1];
        v((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7194), "酕㏬", "\u0000\u0000\u0000\u0000", "ﴗ춲ᩆ㼜", ExpandableListView.getPackedPositionGroup(0L), objArr);
        aVar.a(((String) objArr[0]).intern(), this.f26153h);
        o.ef.c cVar = new o.ef.c();
        Iterator<Map.Entry<String, String>> it = this.f26154i.entrySet().iterator();
        while (true) {
            i2 = 1805847377;
            i3 = -387671709;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            a aVar2 = new a();
            Object[] objArr2 = new Object[1];
            u(new int[]{-387671709, 1805847377}, (Process.myTid() >> 22) + 1, objArr2);
            aVar2.a(((String) objArr2[0]).intern(), (Object) next.getKey());
            Object[] objArr3 = new Object[1];
            v((char) (53696 - ImageFormat.getBitsPerPixel(0)), "骗", "\u0000\u0000\u0000\u0000", "聫撺솘엑", Color.argb(0, 0, 0, 0) - 1738229120, objArr3);
            aVar2.a(((String) objArr3[0]).intern(), (Object) next.getValue());
            cVar.a(aVar2);
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i5 = o.ef.c.f23799b * 1567746851;
        o.ef.c.f23799b = i5;
        int i6 = o.ef.c.f23798a * 1136425123;
        o.ef.c.f23798a = i6;
        if (((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i6, i5, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue() != 0) {
            Object[] objArr4 = new Object[1];
            v((char) (25002 - (KeyEvent.getMaxKeyCode() >> 16)), "\uddea䑠", "\u0000\u0000\u0000\u0000", "礗摽ꨝ㩡", Color.alpha(0), objArr4);
            aVar.a(((String) objArr4[0]).intern(), cVar);
        }
        o.ef.c cVar2 = new o.ef.c();
        for (Map.Entry<String, HashMap<String, String>> entry : this.f26152g.entrySet()) {
            if (entry.getValue().size() != 0) {
                a aVar3 = new a();
                o.ef.c cVar3 = new o.ef.c();
                Object[] objArr5 = new Object[1];
                u(new int[]{i3, i2}, 1 - ((Process.getThreadPriority(0) + 20) >> 6), objArr5);
                aVar3.a(((String) objArr5[0]).intern(), entry.getKey());
                int i7 = f26146p + 81;
                f26147q = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 / 5;
                }
                for (Map.Entry<String, String> entry2 : entry.getValue().entrySet()) {
                    a aVar4 = new a();
                    Object[] objArr6 = new Object[1];
                    v((char) (53697 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "骗", "\u0000\u0000\u0000\u0000", "聫撺솘엑", (-1738229120) - View.MeasureSpec.makeMeasureSpec(0, 0), objArr6);
                    aVar4.a(((String) objArr6[0]).intern(), (Object) entry2.getKey());
                    Object[] objArr7 = new Object[1];
                    v((char) (Color.rgb(0, 0, 0) + 16841463), "├", "\u0000\u0000\u0000\u0000", "ᙿ朌\uf7c7䛺", (ViewConfiguration.getScrollDefaultDelay() >> 16) - 949548010, objArr7);
                    aVar4.a(((String) objArr7[0]).intern(), (Object) entry2.getValue());
                    cVar3.a(aVar4);
                    int i9 = f26146p + 75;
                    f26147q = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 5 % 5;
                    }
                }
                Object[] objArr8 = new Object[1];
                v((char) (11195 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "䋁숅", "\u0000\u0000\u0000\u0000", "ꑅ\ue4ef뭀\uda2b", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr8);
                aVar3.a(((String) objArr8[0]).intern(), cVar3);
                cVar2.a(aVar3);
            }
            i2 = 1805847377;
            i3 = -387671709;
        }
        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
        int i11 = o.ef.c.f23799b * 1567746851;
        o.ef.c.f23799b = i11;
        int i12 = o.ef.c.f23798a * 1136425123;
        o.ef.c.f23798a = i12;
        if (((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i12, i11, -1513293186, elapsedCpuTime2, 1513293186, new Object[]{cVar2})).intValue() != 0) {
            int i13 = f26146p + 51;
            f26147q = i13 % 128;
            int i14 = i13 % 2;
            Object[] objArr9 = new Object[1];
            v((char) (23703 - (ViewConfiguration.getPressedStateDuration() >> 16)), "ꦗ\ue6ce", "\u0000\u0000\u0000\u0000", "呪ģ靝襜", ViewConfiguration.getEdgeSlop() >> 16, objArr9);
            aVar.a(((String) objArr9[0]).intern(), cVar2);
        }
        return aVar;
    }

    public final void a(String str) {
        int i2 = 2 % 2;
        int i3 = f26147q + 77;
        int i4 = i3 % 128;
        f26146p = i4;
        if (i3 % 2 == 0) {
            this.f26151f = str;
            int i5 = 70 / 0;
        } else {
            this.f26151f = str;
        }
        int i6 = i4 + 73;
        f26147q = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void a(a aVar) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = 1;
        int i5 = 0;
        if (f.a()) {
            Object[] objArr = new Object[1];
            u(new int[]{2144438059, -1624181260, 1981950087, -370709386, -1651744041, -289575189, 4539685, -1128467332}, 15 - Color.argb(0, 0, 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u(new int[]{410842843, 1078041636, 835773973, 651117662, -765221917, 1029187650, 380774294, 649342166, 2116981388, -1101553790, -1303085827, 1166096593}, KeyEvent.normalizeMetaState(0) + 24, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            u(new int[]{2144438059, -1624181260, 1981950087, -370709386, -1651744041, -289575189, 4539685, -1128467332}, 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr4 = new Object[1];
            v((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 63608), "ﭑテ\ude7cዯꋍꛢ軩셟夽岘솋ᬔ뗘渌休콿㷽솢ـ帖탈䨜䂂\udbfd唍홻⫧ꝶ⟤", "\u0000\u0000\u0000\u0000", "鶖嗇祾\ue0f8", TextUtils.lastIndexOf("", '0', 0, 0) + 2119550878, objArr4);
            f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(aVar.e()).toString());
        }
        Object[] objArr5 = new Object[1];
        v((char) (Color.rgb(0, 0, 0) + 16784410), "酕㏬", "\u0000\u0000\u0000\u0000", "ﴗ춲ᩆ㼜", View.combineMeasuredStates(0, 0), objArr5);
        this.f26153h = aVar.s(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        v((char) (25002 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\uddea䑠", "\u0000\u0000\u0000\u0000", "礗摽ꨝ㩡", ViewConfiguration.getWindowTouchSlop() >> 8, objArr6);
        o.ef.c cVarT = aVar.t(((String) objArr6[0]).intern());
        int i6 = 1136425123;
        int i7 = 1567746851;
        float f2 = 0.0f;
        int i8 = -1576737484;
        if (cVarT != null) {
            int i9 = 0;
            while (true) {
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i10 = o.ef.c.f23799b * i7;
                o.ef.c.f23799b = i10;
                int i11 = o.ef.c.f23798a * i6;
                o.ef.c.f23798a = i11;
                if (i9 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i11, i10, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVarT})).intValue()) {
                    break;
                }
                a aVarD = cVarT.d(i9);
                HashMap<String, String> map = this.f26154i;
                Object[] objArr7 = new Object[1];
                u(new int[]{-387671709, 1805847377}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr7);
                Object[] objArr8 = {aVarD, ((String) objArr7[0]).intern()};
                int i12 = a.f23782p * i8;
                a.f23782p = i12;
                String str = (String) a.a(-781664457, objArr8, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i12, Thread.currentThread().getPriority());
                Object[] objArr9 = new Object[1];
                v((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 53697), "骗", "\u0000\u0000\u0000\u0000", "聫撺솘엑", (TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1)) - 1738229120, objArr9);
                Object[] objArr10 = {aVarD, ((String) objArr9[0]).intern()};
                int i13 = a.f23782p * i8;
                a.f23782p = i13;
                map.put(str, (String) a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i13, Thread.currentThread().getPriority()));
                i9++;
                i6 = 1136425123;
                i7 = 1567746851;
                f2 = 0.0f;
                i8 = -1576737484;
            }
        }
        Object[] objArr11 = new Object[1];
        v((char) (23703 - View.resolveSizeAndState(0, 0, 0)), "ꦗ\ue6ce", "\u0000\u0000\u0000\u0000", "呪ģ靝襜", TextUtils.indexOf("", "", 0), objArr11);
        o.ef.c cVarT2 = aVar.t(((String) objArr11[0]).intern());
        if (cVarT2 == null) {
            return;
        }
        int i14 = f26147q + 21;
        f26146p = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (true) {
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i17 = o.ef.c.f23799b * 1567746851;
            o.ef.c.f23799b = i17;
            int i18 = o.ef.c.f23798a * 1136425123;
            o.ef.c.f23798a = i18;
            if (i16 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i18, i17, -1513293186, elapsedCpuTime2, 1513293186, new Object[]{cVarT2})).intValue()) {
                return;
            }
            a aVarD2 = cVarT2.d(i16);
            Object[] objArr12 = new Object[i4];
            u(new int[]{-387671709, 1805847377}, TextUtils.getTrimmedLength("") + i4, objArr12);
            Object[] objArr13 = {aVarD2, ((String) objArr12[i5]).intern()};
            int i19 = a.f23782p * (-1576737484);
            a.f23782p = i19;
            String str2 = (String) a.a(-781664457, objArr13, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i19, Thread.currentThread().getPriority());
            Object[] objArr14 = new Object[i4];
            v((char) (11195 - View.getDefaultSize(i5, i5)), "䋁숅", "\u0000\u0000\u0000\u0000", "ꑅ\ue4ef뭀\uda2b", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr14);
            Object[] objArr15 = {aVarD2, ((String) objArr14[i5]).intern()};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iMyUid = Process.myUid();
            int i20 = a.f23780n * (-1229108307);
            a.f23780n = i20;
            o.ef.c cVar = (o.ef.c) a.a(-1398121910, objArr15, iMyUid, i20, 1398121917, iUptimeMillis, iElapsedRealtime);
            HashMap<String, String> map2 = this.f26152g.get(str2);
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            while (true) {
                int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                int i21 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i21;
                int i22 = o.ef.c.f23798a * 1136425123;
                o.ef.c.f23798a = i22;
                if (i5 < ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i22, i21, -1513293186, elapsedCpuTime3, 1513293186, new Object[]{cVar})).intValue()) {
                    int i23 = f26147q + 87;
                    f26146p = i23 % 128;
                    int i24 = i23 % i2;
                    a aVarD3 = cVar.d(i5);
                    Object[] objArr16 = new Object[1];
                    v((char) (Color.red(0) + 53697), "骗", "\u0000\u0000\u0000\u0000", "聫撺솘엑", TextUtils.indexOf((CharSequence) "", '0') - 1738229119, objArr16);
                    Object[] objArr17 = {aVarD3, ((String) objArr16[0]).intern()};
                    int i25 = a.f23782p * (-1576737484);
                    a.f23782p = i25;
                    String str3 = (String) a.a(-781664457, objArr17, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i25, Thread.currentThread().getPriority());
                    Object[] objArr18 = new Object[1];
                    v((char) (TextUtils.lastIndexOf("", '0') + 64248), "├", "\u0000\u0000\u0000\u0000", "ᙿ朌\uf7c7䛺", TextUtils.getCapsMode("", 0, 0) - 949548010, objArr18);
                    Object[] objArr19 = {aVarD3, ((String) objArr18[0]).intern()};
                    int i26 = a.f23782p * (-1576737484);
                    a.f23782p = i26;
                    map2.put(str3, (String) a.a(-781664457, objArr19, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i26, Thread.currentThread().getPriority()));
                    i5++;
                    i2 = 2;
                }
            }
            i5 = 0;
            this.f26152g.put(str2, map2);
            i16++;
            i2 = 2;
            i4 = 1;
        }
    }

    public final String b(String str, String str2) {
        int i2 = 2 % 2;
        HashMap<String, String> map = this.f26157n.get(str);
        Object obj = null;
        if (map == null) {
            int i3 = f26147q + 45;
            f26146p = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        String str3 = map.get(str2);
        int i5 = f26147q + 99;
        f26146p = i5 % 128;
        if (i5 % 2 != 0) {
            return str3;
        }
        obj.hashCode();
        throw null;
    }

    public final void b(String str) {
        int i2 = 2 % 2;
        int i3 = f26146p + 53;
        f26147q = i3 % 128;
        int i4 = i3 % 2;
        this.f26156k.remove(str);
        int i5 = f26146p + 123;
        f26147q = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean b() {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = 1682793917 * f26140c;
        f26140c = i3;
        return ((Boolean) e(520817126, i3, iUptimeMillis, Process.myUid(), new Object[]{this}, i2, -520817126)).booleanValue();
    }

    public final String c() {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = f26139b * (-863778220);
        f26139b = i3;
        return (String) e(-788983384, (int) Runtime.getRuntime().maxMemory(), i2, Process.myTid(), new Object[]{this}, i3, 788983385);
    }

    public final String c(String str) {
        int i2 = 2 % 2;
        int i3 = f26147q + 57;
        f26146p = i3 % 128;
        int i4 = i3 % 2;
        String str2 = this.f26156k.get(str);
        int i5 = f26146p + 115;
        f26147q = i5 % 128;
        int i6 = i5 % 2;
        return str2;
    }

    public final void c(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f26147q + 123;
        f26146p = i3 % 128;
        if (i3 % 2 != 0) {
            this.f26156k.put(str, str2);
        } else {
            this.f26156k.put(str, str2);
            throw null;
        }
    }

    public final void d() {
        int i2 = 2 % 2;
        int i3 = f26146p;
        int i4 = i3 + 15;
        f26147q = i4 % 128;
        int i5 = i4 % 2;
        this.f26155j = false;
        int i6 = i3 + 123;
        f26147q = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void d(String str) {
        int i2 = 2 % 2;
        int i3 = f26147q + 47;
        f26146p = i3 % 128;
        int i4 = i3 % 2;
        this.f26155j = true;
        this.f26153h = str;
    }

    public final void d(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f26146p + 73;
        f26147q = i3 % 128;
        int i4 = i3 % 2;
        this.f26155j = true;
        this.f26154i.put(str, str2);
    }

    public final void d(String str, String str2, String str3) {
        int i2 = 2 % 2;
        int i3 = f26147q + 31;
        f26146p = i3 % 128;
        int i4 = i3 % 2;
        this.f26155j = true;
        if (this.f26152g.get(str) == null) {
            this.f26152g.put(str, new HashMap<>());
        }
        this.f26152g.get(str).put(str2, str3);
        int i5 = f26146p + 57;
        f26147q = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:252:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x01f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.LinkedHashMap<java.lang.String, o.ep.d> r20) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fr.c.d(java.util.LinkedHashMap):void");
    }

    public final String e(String str) {
        String str2;
        int i2 = 2 % 2;
        int i3 = f26147q + 117;
        f26146p = i3 % 128;
        if (i3 % 2 == 0) {
            str2 = this.f26154i.get(str);
            int i4 = 15 / 0;
        } else {
            str2 = this.f26154i.get(str);
        }
        int i5 = f26146p + 43;
        f26147q = i5 % 128;
        int i6 = i5 % 2;
        return str2;
    }

    public final void e() {
        int i2 = 2 % 2;
        int i3 = f26146p + 43;
        f26147q = i3 % 128;
        int i4 = i3 % 2;
        this.f26155j = true;
        this.f26151f = null;
        this.f26156k.clear();
        this.f26157n.clear();
        this.f26153h = null;
        this.f26154i.clear();
        this.f26152g.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = o.fr.c.f26147q
            int r1 = r0 + 113
            int r0 = r1 % 128
            o.fr.c.f26146p = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L30
            r0 = 0
            r3.f26155j = r0
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> r0 = r3.f26152g
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L24
        L19:
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> r0 = r3.f26152g
            java.lang.Object r0 = r0.get(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.remove(r5)
        L24:
            int r0 = o.fr.c.f26147q
            int r1 = r0 + 73
            int r0 = r1 % 128
            o.fr.c.f26146p = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L3c
            return
        L30:
            r0 = 1
            r3.f26155j = r0
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> r0 = r3.f26152g
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L24
            goto L19
        L3c:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fr.c.e(java.lang.String, java.lang.String):void");
    }

    public final void e(String str, String str2, String str3) {
        int i2 = 2 % 2;
        int i3 = f26147q + 65;
        f26146p = i3 % 128;
        if (i3 % 2 == 0) {
            this.f26157n.get(str);
            throw null;
        }
        if (this.f26157n.get(str) == null) {
            this.f26157n.put(str, new HashMap<>());
        }
        this.f26157n.get(str).put(str2, str3);
        int i4 = f26147q + 101;
        f26146p = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String h() {
        int i2 = f26141d * (-1971829739);
        f26141d = i2;
        int i3 = f26142e * 624053279;
        f26142e = i3;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i4 = 241563593 * f26138a;
        f26138a = i4;
        return (String) e(1824317076, iMaxMemory, i2, i4, new Object[]{this}, i3, -1824317074);
    }

    public final void j() {
        int i2 = 2 % 2;
        int i3 = f26147q;
        int i4 = i3 + 73;
        f26146p = i4 % 128;
        if (i4 % 2 == 0) {
            this.f26151f = null;
            int i5 = 20 / 0;
        } else {
            this.f26151f = null;
        }
        int i6 = i3 + 35;
        f26146p = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void j(String str, String str2) {
        int iMyUid = Process.myUid();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        e(1557381128, (int) SystemClock.uptimeMillis(), iMyUid, new Random().nextInt(), new Object[]{this, str, str2}, elapsedCpuTime, -1557381125);
    }
}
