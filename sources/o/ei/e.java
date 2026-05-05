package o.ei;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import java.util.HashMap;
import o.a.n;
import o.a.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f23938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static e f23939b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f23940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f23941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f23942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static e f23943f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static e f23944g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static e f23945i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static e f23946j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f23947k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f23948l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ e[] f23949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char[] f23950n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final HashMap<Pair<String, String>, e> f23951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f23952p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static long f23953q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f23954r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f23955s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f23956t = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f23957h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, byte r9, int r10) {
        /*
            int r8 = 115 - r8
            byte[] r7 = o.ei.e.$$a
            int r0 = r10 * 4
            int r6 = r0 + 1
            int r0 = r9 * 2
            int r5 = 4 - r0
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L28
            r2 = r5
            r1 = r3
        L13:
            int r5 = r5 + 1
            int r8 = r8 + r2
        L16:
            byte r0 = (byte) r8
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            r0 = r7[r5]
            r2 = r8
            r8 = r0
            goto L13
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ei.e.$$c(short, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x083f A[PHI: r4
  0x083f: PHI (r4v45 java.util.Map$Entry<android.util.Pair<java.lang.String, java.lang.String>, o.ei.e>) = 
  (r4v44 java.util.Map$Entry<android.util.Pair<java.lang.String, java.lang.String>, o.ei.e>)
  (r4v47 java.util.Map$Entry<android.util.Pair<java.lang.String, java.lang.String>, o.ei.e>)
 binds: [B:12:0x0884, B:8:0x083d] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            Method dump skipped, instruction units count: 2184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ei.e.<clinit>():void");
    }

    private e(String str, int i2, String str2) {
        this.f23957h = str2;
    }

    static void a() {
        f23948l = -1270219466;
        f23950n = new char[]{38070, 4496, 40695, 6960, 32785, 3443, 35765, 12429, 38079, 4536, 40663, 6919, 32827, 3415, 35763, 12478, 48600, 14869, 38052, 4528, 40663, 6930, 38079, 4536, 40641, 6912, 32810, 3415, 35743, 51885, 20353, 49377, 17712, 56846, 21365, 54703, 28298, 58357, 25634, 63748, 29289, 62655, 2447, 33527, 1830, 38941, 7531, 38833, 38080, 4587, 40598, 6978, 38081, 4585, 40605, 48383, 14802, 46760, 13173, 38081, 4588, 40604, 6986, 63023, 29440, 38081, 4577, 38081, 4576, 14859, 38087, 4576, 2897, 36476, 256, 34007, 38084, 4588, 10718, 44282};
        f23953q = 1302245981421965785L;
    }

    private static Pair<String, String> b(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f23954r;
        int i4 = i3 + 123;
        f23956t = i4 % 128;
        int i5 = i4 % 2;
        if (str2 == null) {
            int i6 = i3 + 23;
            f23956t = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            str2 = str;
        }
        return new Pair<>(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064 A[PHI: r3
  0x0064: PHI (r3v2 java.util.Map$Entry<android.util.Pair<java.lang.String, java.lang.String>, o.ei.e>) = 
  (r3v1 java.util.Map$Entry<android.util.Pair<java.lang.String, java.lang.String>, o.ei.e>)
  (r3v4 java.util.Map$Entry<android.util.Pair<java.lang.String, java.lang.String>, o.ei.e>)
 binds: [B:23:0x00ae, B:16:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.ei.e b(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ei.e.b(java.lang.String):o.ei.e");
    }

    private static HashMap<Pair<String, String>, e> c() {
        int i2 = 2 % 2;
        int i3 = f23954r;
        int i4 = i3 + 55;
        f23956t = i4 % 128;
        int i5 = i4 % 2;
        HashMap<Pair<String, String>, e> map = f23951o;
        int i6 = i3 + 65;
        f23956t = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 41 / 0;
        }
        return map;
    }

    private static /* synthetic */ e[] d() {
        int i2 = 2 % 2;
        int i3 = f23956t + 65;
        int i4 = i3 % 128;
        f23954r = i4;
        int i5 = i3 % 2;
        e[] eVarArr = {f23939b, f23945i, f23943f, f23941d, f23942e, f23940c, f23938a, f23946j, f23944g};
        int i6 = i4 + 93;
        f23956t = i6 % 128;
        int i7 = i6 % 2;
        return eVarArr;
    }

    private static boolean e(String str, String str2, String str3) {
        int i2 = 2 % 2;
        int i3 = f23954r + 83;
        f23956t = i3 % 128;
        int i4 = i3 % 2;
        int iMin = Math.min(str.length(), str2.length());
        int iMin2 = Math.min(str.length(), str3.length());
        if (Integer.parseInt(str.substring(0, iMin)) < Integer.parseInt(str2.substring(0, iMin))) {
            int i5 = f23956t + 115;
            f23954r = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Integer.parseInt(str.substring(0, iMin2)) > Integer.parseInt(str3.substring(0, iMin2))) {
            return false;
        }
        int i7 = f23954r + 17;
        f23956t = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{97, 98, -19, -80};
        $$b = 61;
    }

    private static void u(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 5;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f23948l)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(270 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) View.resolveSize(0, 0), 11 - Color.green(0), -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 2);
                    objA2 = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 521, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 12, 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i9 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 2;
                    byte b7 = (byte) (b6 - 2);
                    objA3 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 523, (char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i11 = $10 + 113;
                $11 = i11 % 128;
                int i12 = i11 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void v(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f23950n[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(742 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ImageFormat.getBitsPerPixel(0) + 1), 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 632508977, false, $$c((byte) ($$b & 80), b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f23953q), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 766, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12470), View.resolveSizeAndState(0, 0, 0) + 12, 1946853218, false, $$c((byte) ($$b >>> 2), b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 387, (char) View.resolveSize(0, 0), 18 - (ViewConfiguration.getLongPressTimeout() >> 16), 39570797, false, $$c((byte) 10, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i6 = $10 + 89;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b5 = (byte) 0;
                objA4 = o.d.d.a(387 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), Color.rgb(0, 0, 0) + 16777234, 39570797, false, $$c((byte) 10, b5, b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i8 = $11 + 63;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public static e valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f23954r + 61;
        f23956t = i3 % 128;
        int i4 = i3 % 2;
        e eVar = (e) Enum.valueOf(e.class, str);
        if (i4 == 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static e[] values() {
        int i2 = 2 % 2;
        int i3 = f23954r + 41;
        f23956t = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        e[] eVarArr = (e[]) f23949m.clone();
        int i4 = f23954r + 31;
        f23956t = i4 % 128;
        int i5 = i4 % 2;
        return eVarArr;
    }

    @Override // java.lang.Enum
    public final String toString() {
        String str;
        int i2 = 2 % 2;
        int i3 = f23956t + 33;
        int i4 = i3 % 128;
        f23954r = i4;
        if (i3 % 2 == 0) {
            str = this.f23957h;
            int i5 = 8 / 0;
        } else {
            str = this.f23957h;
        }
        int i6 = i4 + 37;
        f23956t = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
