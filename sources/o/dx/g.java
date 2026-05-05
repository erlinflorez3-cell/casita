package o.dx;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.i;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements b<o.dy.e, o.dv.d, o.dz.d, Drawable> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static long f23428a = 0;

    /* JADX INFO: renamed from: b */
    private static char f23429b = 0;

    /* JADX INFO: renamed from: d */
    private static char f23430d = 0;

    /* JADX INFO: renamed from: e */
    private static int f23431e = 0;

    /* JADX INFO: renamed from: f */
    private static char f23432f = 0;

    /* JADX INFO: renamed from: g */
    private static int f23433g = 0;

    /* JADX INFO: renamed from: h */
    private static int f23434h = 0;

    /* JADX INFO: renamed from: i */
    private static char f23435i = 0;

    /* JADX INFO: renamed from: j */
    private static char f23436j = 0;

    /* JADX INFO: renamed from: k */
    private static int f23437k = 0;

    /* JADX INFO: renamed from: l */
    public static int f23438l = 0;

    /* JADX INFO: renamed from: n */
    private static int f23439n = 0;

    /* JADX INFO: renamed from: c */
    private final o.dv.d f23440c;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r1 = r8 + 65
            int r2 = r7 + 4
            int r8 = r6 * 3
            int r0 = r8 + 1
            byte[] r7 = o.dx.g.$$c
            byte[] r6 = new byte[r0]
            r5 = 0
            if (r7 != 0) goto L28
            r4 = r8
            r0 = r2
            r3 = r5
        L12:
            int r1 = -r2
            int r1 = r1 + r4
            r2 = r0
        L15:
            int r0 = r2 + 1
            byte r2 = (byte) r1
            r6[r3] = r2
            if (r3 != r8) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L22:
            int r3 = r3 + 1
            r2 = r7[r0]
            r4 = r1
            goto L12
        L28:
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dx.g.$$g(byte, int, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f23438l = -2101618331;
        init$0();
        f23437k = 0;
        f23439n = 1;
        f23434h = 0;
        f23433g = 1;
        j();
        ViewConfiguration.getKeyRepeatDelay();
        int i2 = f23439n + 115;
        f23437k = i2 % 128;
        int i3 = i2 % 2;
    }

    public g(String str) {
        this.f23440c = new o.dv.d(str);
    }

    private static o.dy.e g() {
        int i2 = 2 % 2;
        int i3 = f23433g + 53;
        f23434h = i3 % 128;
        int i4 = i3 % 2;
        o.dy.e eVar = o.dy.e.f23458c;
        int i5 = f23434h + 83;
        f23433g = i5 % 128;
        int i6 = i5 % 2;
        return eVar;
    }

    private static o.dz.d h() {
        int i2 = 2 % 2;
        int i3 = f23434h + 9;
        f23433g = i3 % 128;
        int i4 = i3 % 2;
        o.dz.d dVar = o.dz.d.f23474e;
        int i5 = f23433g + 79;
        f23434h = i5 % 128;
        if (i5 % 2 == 0) {
            return dVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{68, -108, -67, 58};
        $$b = 208;
    }

    static void init$1() {
        $$d = new byte[]{108, -10, -111, 117};
        $$e = 3;
    }

    static void init$2() {
        $$c = new byte[]{84, 109, 90, 4};
        $$f = 49;
    }

    static void j() {
        f23428a = 740602047300126166L;
        f23431e = 1564493270;
        f23429b = (char) 45601;
        f23430d = (char) 20769;
        f23435i = (char) 34978;
        f23432f = (char) 31456;
        f23436j = (char) 55563;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(short r8, byte r9, short r10, java.lang.Object[] r11) {
        /*
            int r8 = 98 - r8
            int r0 = r9 * 2
            int r7 = 1 - r0
            int r0 = r10 * 2
            int r6 = r0 + 4
            byte[] r5 = o.dx.g.$$a
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r5 != 0) goto L29
            r0 = r7
            r2 = r3
        L13:
            int r8 = r8 + r0
            int r6 = r6 + 1
            r1 = r2
        L17:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L26:
            r0 = r5[r6]
            goto L13
        L29:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dx.g.m(short, byte, short, java.lang.Object[]):void");
    }

    private static void o(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        int i4 = $11 + 33;
        $10 = i4 % 128;
        Object obj = str6;
        if (i4 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (str6 != null) {
            char[] charArray = str6.toCharArray();
            int i5 = $11 + 9;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            charArray3 = str4.toCharArray();
        }
        i iVar = new i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i7 = 0;
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
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int iIndexOf = TextUtils.indexOf("", "") + 106;
                    char threadPriority = (char) ((Process.getThreadPriority(i7) + 20) >> 6);
                    int iGreen = Color.green(i7) + 11;
                    byte b2 = (byte) i7;
                    byte b3 = (byte) (b2 - 1);
                    String str$$g = $$g(b2, b3, (byte) (b3 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i7] = Object.class;
                    objA = o.d.d.a(iIndexOf, threadPriority, iGreen, -155898465, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) i7;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(847 - ((Process.getThreadPriority(i7) + 20) >> 6), (char) (6489 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -694521287, false, $$g(b4, b5, (byte) (b5 + 4)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 458, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 11 - View.MeasureSpec.getSize(0), 1804962841, false, $$g(b6, b7, (byte) (-b7)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objA4 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, (char) (65099 - TextUtils.indexOf((CharSequence) "", '0')), 12 - (Process.myPid() >> 22), 1636969060, false, $$g(b8, b9, (byte) ((b9 + 57) - (57 | b9))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r7[iVar.f19932b])) ^ (f23428a ^ 740602047300126166L)) ^ ((long) ((int) (((long) f23431e) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f23429b) ^ 740602047300126166L))));
                iVar.f19932b++;
                int i8 = $10 + 101;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i7 = 0;
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

    private static void p(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 117;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
            charArray = str2 != null ? str2.toCharArray() : str2;
        } else if (str2 != null) {
        }
        char[] cArr = (char[]) charArray;
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i6 = $11 + 27;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = 58224;
            for (int i9 = 0; i9 < 16; i9++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i8) ^ ((c3 << 4) + ((char) (((long) f23432f) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f23436j)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(270 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 10 - ExpandableListView.getPackedPositionChild(0L), -1995022631, false, $$g(b2, (byte) (b2 - 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f23430d) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f23435i)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a(271 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1995022631, false, $$g(b3, (byte) (b3 - 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b4 = (byte) 0;
                byte b5 = (byte) (b4 - 1);
                objA3 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 269, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, -2074123590, false, $$g(b4, b5, (byte) ((-1) - (((-1) - b5) | ((-1) - 7)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(byte r8, short r9, int r10, java.lang.Object[] r11) {
        /*
            int r0 = r10 * 4
            int r7 = 101 - r0
            int r6 = r8 * 4
            int r1 = r6 + 1
            int r0 = r9 * 4
            int r5 = r0 + 4
            byte[] r4 = o.dx.g.$$d
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L2a
            r0 = r6
            r1 = r2
        L15:
            int r7 = r7 + r0
            int r5 = r5 + 1
        L18:
            byte r0 = (byte) r7
            r3[r1] = r0
            if (r1 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            r11[r2] = r0
            return
        L25:
            int r1 = r1 + 1
            r0 = r4[r5]
            goto L15
        L2a:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dx.g.q(byte, short, int, java.lang.Object[]):void");
    }

    @Override // o.dx.b
    public final /* synthetic */ o.dz.c a() {
        int i2 = 2 % 2;
        int i3 = f23433g + 49;
        f23434h = i3 % 128;
        int i4 = i3 % 2;
        o.dz.d dVarH = h();
        int i5 = f23433g + 99;
        f23434h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return dVarH;
    }

    public final o.dv.d b() {
        int i2 = 2 % 2;
        int i3 = f23434h + 95;
        f23433g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f23440c;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0299  */
    @Override // o.dx.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dx.g.c():java.lang.String");
    }

    @Override // o.dx.b
    public final /* synthetic */ o.dv.c d() {
        o.dv.d dVarB;
        int i2 = 2 % 2;
        int i3 = f23434h + 51;
        f23433g = i3 % 128;
        if (i3 % 2 == 0) {
            dVarB = b();
            int i4 = 95 / 0;
        } else {
            dVarB = b();
        }
        int i5 = f23434h + 97;
        f23433g = i5 % 128;
        int i6 = i5 % 2;
        return dVarB;
    }

    @Override // o.dx.b
    public final /* synthetic */ o.dy.d e() {
        int i2 = 2 % 2;
        int i3 = f23434h + 55;
        f23433g = i3 % 128;
        int i4 = i3 % 2;
        o.dy.e eVarG = g();
        int i5 = f23433g + 21;
        f23434h = i5 % 128;
        int i6 = i5 % 2;
        return eVarG;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23434h + 65;
        int i4 = i3 % 128;
        f23433g = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 69;
            f23434h = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 52 / 0;
            }
            return true;
        }
        if (obj != null) {
            int i8 = i4 + 111;
            f23434h = i8 % 128;
            int i9 = i8 % 2;
            if (getClass() == obj.getClass()) {
                return Objects.equals(this.f23440c, ((g) obj).f23440c);
            }
        }
        return false;
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        p("䷰\udd3b謭ꄀ膻Þ\udef1픦磸ᨪ䅁癇ꩲ㷠㛐\u2439쒁㡳黖\ue43a読\ud946臲\uebbd黖\ue43a\uf112컱靑携氰垡纊\ueb19仜挑ᙈ炲ꓯ韇꧊賦", 41 - View.MeasureSpec.getMode(0), objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(g().toString());
        Object[] objArr2 = new Object[1];
        p("灻⤩\ueaa4遛릴ᒉ愆밍☚\uf517⑬㭉", 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(b().toString());
        Object[] objArr3 = new Object[1];
        o((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37231), "\ue880覠ꎕ\u2d74둉Ꜭ᳭蓼ꇢ\uef0f锎䭯댳", "\u0000\u0000\u0000\u0000", "攽홝濵\ue391", (-170500763) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
        String string = sbAppend2.append(((String) objArr3[0]).intern()).append(h().toString()).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f23433g + 57;
        f23434h = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }
}
