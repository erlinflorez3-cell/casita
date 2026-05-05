package o.fm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.settings.WalletSettingsRights;
import fr.antelop.sdk.settings.WalletSettingsValue;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import o.ea.f;
import o.ea.m;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e<a> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f26020f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26021i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f26022j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f26023k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f26024m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f26025n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BigDecimal f26028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f26030e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f26031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f26032h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, int r10, int r11) {
        /*
            int r0 = r11 * 4
            int r8 = 3 - r0
            int r7 = r10 * 2
            int r1 = r7 + 1
            byte[] r6 = o.fm.a.$$a
            int r0 = r9 + 102
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L29
            r0 = r7
            r1 = r8
            r3 = r4
        L14:
            int r0 = -r0
            int r8 = r8 + r0
            r2 = r3
        L17:
            byte r0 = (byte) r8
            r5[r2] = r0
            int r1 = r1 + 1
            int r3 = r2 + 1
            if (r2 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r6[r1]
            goto L14
        L29:
            r2 = r4
            r1 = r8
            r8 = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.a.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26025n = 0;
        f26023k = 1;
        f26021i = 0;
        f26024m = 1;
        f();
        ExpandableListView.getPackedPositionChild(0L);
        Process.getGidForName("");
        ViewConfiguration.getScrollBarSize();
        Drawable.resolveOpacity(0, 0);
        ExpandableListView.getPackedPositionForGroup(0);
        Color.argb(0, 0, 0, 0);
        int i2 = f26025n + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f26023k = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public a() {
        super(false);
        this.f26028c = null;
        this.f26027b = 0;
        this.f26030e = 0;
        this.f26026a = 0;
        this.f26029d = 0;
        this.f26031g = 0;
        this.f26032h = 0;
    }

    public a(BigDecimal bigDecimal, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(true);
        this.f26028c = bigDecimal;
        this.f26027b = i2 == 0 ? 1 : i2;
        this.f26030e = i3;
        this.f26026a = i4;
        this.f26029d = i5;
        this.f26031g = i6;
        this.f26032h = i7;
        o.m.c.d();
    }

    static void f() {
        f26022j = new char[]{51639, 64595, 51638, 64520, 64578, 64587, 51642, 64599, 64576, 51640, 64582, 64588, 64592, 64584, 64625, 64579, 64580, 64620, 64517, 51645, 64607, 64597, 64586, 64598, 64585, 51643, 51644, 51641, 64614, 64577, 64521, 51646, 64593, 64523, 64617, 51637};
        f26020f = (char) 51641;
    }

    private int h() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f26021i + 9;
        f26024m = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            l(55 - ((byte) KeyEvent.getModifierMetaStateMask()), "#\n\u0011\u0007#\u0014\u0016\f\b\t\u0017\u0000\u0014\"\u0017\u0006\u000b\u0011#\b\f\u001c\b\u0017\u000b\u001a", (byte) (79 / TextUtils.indexOf((CharSequence) "", 'e', 0, 0)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            l(((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.ESC, "#\n\u0011\u0007#\u0014\u0016\f\b\t\u0017\u0000\u0014\"\u0017\u0006\u000b\u0011#\b\f\u001c\b\u0017\u000b\u001a", (byte) (14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr2);
            obj = objArr2[0];
        }
        c(((String) obj).intern());
        int i4 = this.f26027b;
        int i5 = f26024m + 9;
        f26021i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return i4;
    }

    static void init$0() {
        $$a = new byte[]{8, -110, 120, 122};
        $$b = 175;
    }

    private static void l(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = $11 + 39;
        $10 = i6 % 128;
        Object charArray = str2;
        if (i6 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f26022j;
        int i7 = 421932776;
        float f2 = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 75;
                $11 = i9 % 128;
                int i10 = i9 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objA = o.d.d.a(i7);
                    if (objA == null) {
                        int deadChar = 270 - KeyEvent.getDeadChar(0, 0);
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int i11 = (AudioTrack.getMaxVolume() > f2 ? 1 : (AudioTrack.getMaxVolume() == f2 ? 0 : -1)) + 10;
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(deadChar, cIndexOf, i11, -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    i4 = 2;
                    i7 = 421932776;
                    f2 = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f26020f)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = 11;
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(270 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11, -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i12 = $11 + 75;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                i3 = i2 + 35;
                cArr4[i3] = (char) (cArr[i3] >>> b2);
            } else {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            }
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i13 = $11 + 29;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    int i15 = $10 + 39;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        objA3 = o.d.d.a(KeyEvent.getDeadChar(0, 0) + 825, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -611683395, false, $$c((byte) ($$b & 25), b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            int i17 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + JfifUtil.MARKER_SOS;
                            char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            c2 = 11;
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11;
                            int i18 = $$b;
                            byte b8 = (byte) 0;
                            objA4 = o.d.d.a(i17, c3, scrollBarFadeDuration, 212688716, false, $$c((byte) ((i18 + 23) - (i18 | 23)), b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = 11;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i19 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i19];
                    } else {
                        c2 = 11;
                        if (hVar.f19928d == hVar.f19929e) {
                            int i20 = $10 + 103;
                            $11 = i20 % 128;
                            int i21 = i20 % 2;
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i22 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i23 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i22];
                            cArr4[hVar.f19926b + 1] = cArr2[i23];
                        } else {
                            int i24 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i25 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i24];
                            cArr4[hVar.f19926b + 1] = cArr2[i25];
                        }
                    }
                }
                hVar.f19926b += 2;
            }
        }
        for (int i26 = 0; i26 < i2; i26++) {
            cArr4[i26] = (char) (cArr4[i26] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public final int a(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26024m + 47;
        f26021i = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                return h();
            }
            h();
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (o.en.j unused) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                l(10 - TextUtils.lastIndexOf("", '0'), "\u0017\u000b\u0002\u000b\n\u001f\u0007\u0011\b#㗰", (byte) (8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                l(82 - ((Process.getThreadPriority(0) + 20) >> 6), "\u0002\n\"\u001a\u0017\u0004\u0002\u000b\b\"\n\u0017\u0002\u0011\u0007\u0011\n\u0014\u000e\u001e\u0015\u0000\u0018\u001e\u0007\u0011\b#\u0012\u0013\u0004\u0017\u001e\u0014\u0011\u000b\b#\n\u0011\u001d\u0006\u001a\u000e\u0018#\u0013\u0006\t\u000e\t\b\b\u0006\u0000\u0005\u0014\u001e\u0017\u0013\u000e\u0011\u000b\u0011\u000e\t\u0014#\u0017\u0018\t\u000e\u0011\u000b\u000b\u001a\u0013\u0000\f\u001c\u000e\u0006", (byte) (31 - (ViewConfiguration.getTapTimeout() >> 16)), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
                int i4 = f26024m + 85;
                f26021i = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 4;
                }
            }
            try {
                Object[] objArr3 = new Object[1];
                l(35 - ExpandableListView.getPackedPositionType(0L), "\r\t\"\u000f\u0002#\u0006\u001a\u0017\u0016#\t\u000b\u0011#\b\f\u001c\"\u001c㘀㘀\t\u000b#\b\u0017\u0004\u0011\b\u000e\u0007\u0012\u0010㗺", (byte) (AndroidCharacter.getMirror('0') - '$'), objArr3);
                int i6 = Integer.parseInt(m.d(context, ((String) objArr3[0]).intern()));
                int i7 = f26021i + 83;
                f26024m = i7 % 128;
                int i8 = i7 % 2;
                return i6;
            } catch (PackageManager.NameNotFoundException unused2) {
                if (f.a()) {
                    Object[] objArr4 = new Object[1];
                    l((ViewConfiguration.getScrollDefaultDelay() >> 16) + 11, "\u0017\u000b\u0002\u000b\n\u001f\u0007\u0011\b#㗰", (byte) (Color.red(0) + 7), objArr4);
                    String strIntern2 = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    l(69 - TextUtils.indexOf("", "", 0, 0), "\u0002\n\"\u001a\u0017\u0004\u0002\u000b\b\"\n\u0017\u0002\u0011\u0007\u0011\n\u0014\u000e\u001e\u0015\u0000\u0013\f\u0011\u0004\t\u0011\u000b\u0014\u001e\u0014\u0004\r\u001e\u0012\u0006\u0014\u0004\u0017\u001e\u0014\u0010\u0015\u0011\u0000\u0018\u0017\u0000\u0015\u0011\u0012\u0011\u000b\u0000\u0016\u001a\u000b\u0010\u0011\u0012\u001e\u001e\u0014\u0004\r\u001e\u0012㙉", (byte) (74 - View.resolveSize(0, 0)), objArr5);
                    f.c(strIntern2, ((String) objArr5[0]).intern());
                }
                return 60;
            }
        }
    }

    public final BigDecimal a() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f26021i + 117;
        f26024m = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            l(124 << ImageFormat.getBitsPerPixel(1), "#\n\u0011\u0007#\u0014\u0016\f\b\t\u0017\u0000\u0014\"\u0017\u0006\u000b\u0011#\b\f\u001c\b\u0017\u000b\u001a", (byte) (60 << (ViewConfiguration.getJumpTapTimeout() - 90)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            l(25 - ImageFormat.getBitsPerPixel(0), "#\n\u0011\u0007#\u0014\u0016\f\b\t\u0017\u0000\u0014\"\u0017\u0006\u000b\u0011#\b\f\u001c\b\u0017\u000b\u001a", (byte) (15 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr2);
            obj = objArr2[0];
        }
        c(((String) obj).intern());
        BigDecimal bigDecimal = this.f26028c;
        int i4 = f26021i + 47;
        f26024m = i4 % 128;
        if (i4 % 2 != 0) {
            return bigDecimal;
        }
        throw null;
    }

    public final int c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26024m + 47;
        f26021i = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        l(27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "#\n\u0011\u0007#\u0014\u0016\f\b\t\u0017\u0000\u0014\"\u0017\u0006\u000b\u0011#\b\f\u001c\b\u0017\u000b\u001a", (byte) (15 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr);
        c(((String) objArr[0]).intern());
        int i5 = this.f26030e;
        int i6 = f26021i + 113;
        f26024m = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(o.fm.a r8) {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            java.math.BigDecimal r1 = r7.f26028c
            r2 = 1
            r5 = 0
            if (r1 == 0) goto La7
            java.math.BigDecimal r0 = r8.f26028c
            boolean r0 = r1.equals(r0)
        Lf:
            if (r0 == 0) goto La4
            int r1 = r7.f26027b
            int r0 = r8.f26027b
            if (r1 != r0) goto La4
            int r0 = o.fm.a.f26021i
            int r1 = r0 + 103
            int r0 = r1 % 128
            o.fm.a.f26024m = r0
            int r1 = r1 % r6
            r0 = r2
        L21:
            if (r0 == 0) goto L3c
            int r0 = o.fm.a.f26024m
            int r1 = r0 + 47
            int r0 = r1 % 128
            o.fm.a.f26021i = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L96
            int r4 = r7.f26030e
            int r3 = r8.f26030e
            r0 = 50
            int r0 = r0 / r5
            r1 = 23
            if (r4 != r3) goto L94
            r0 = r1
        L3a:
            if (r0 == r1) goto La2
        L3c:
            r0 = r5
        L3d:
            if (r0 != 0) goto L83
        L3f:
            r0 = r5
        L40:
            r1 = 50
            if (r0 == 0) goto L81
            r0 = 52
        L46:
            if (r0 == r1) goto L7f
            int r1 = r7.f26029d
            int r0 = r8.f26029d
            if (r1 != r0) goto L7f
            r0 = r2
        L4f:
            r1 = 15
            if (r0 == 0) goto L7d
            r0 = 84
        L55:
            if (r0 == r1) goto L7b
            int r0 = o.fm.a.f26024m
            int r1 = r0 + 91
            int r0 = r1 % 128
            o.fm.a.f26021i = r0
            int r1 = r1 % r6
            if (r1 != 0) goto Lb2
            int r1 = r7.f26031g
            int r0 = r8.f26031g
            if (r1 != r0) goto L7b
            r0 = r2
        L69:
            if (r0 == 0) goto Lb1
            int r0 = o.fm.a.f26024m
            int r1 = r0 + 115
            int r0 = r1 % 128
            o.fm.a.f26021i = r0
            int r1 = r1 % r6
            int r1 = r7.f26032h
            int r0 = r8.f26032h
            if (r1 != r0) goto Lb1
            return r2
        L7b:
            r0 = r5
            goto L69
        L7d:
            r0 = r1
            goto L55
        L7f:
            r0 = r5
            goto L4f
        L81:
            r0 = r1
            goto L46
        L83:
            int r0 = o.fm.a.f26024m
            int r1 = r0 + 11
            int r0 = r1 % 128
            o.fm.a.f26021i = r0
            int r1 = r1 % r6
            int r1 = r7.f26026a
            int r0 = r8.f26026a
            if (r1 != r0) goto L3f
            r0 = r2
            goto L40
        L94:
            r0 = r6
            goto L3a
        L96:
            int r1 = r7.f26030e
            int r0 = r8.f26030e
            if (r1 != r0) goto La0
            r0 = r2
        L9d:
            if (r0 == r2) goto La2
            goto L3c
        La0:
            r0 = r5
            goto L9d
        La2:
            r0 = r2
            goto L3d
        La4:
            r0 = r5
            goto L21
        La7:
            java.math.BigDecimal r0 = r8.f26028c
            if (r0 != 0) goto Lae
            r0 = r2
            goto Lf
        Lae:
            r0 = r5
            goto Lf
        Lb1:
            return r5
        Lb2:
            int r0 = r8.f26031g
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.a.c(o.fm.a):boolean");
    }

    public final int d() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f26021i + 117;
        f26024m = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            l((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 63, "#\n\u0011\u0007#\u0014\u0016\f\b\t\u0017\u0000\u0014\"\u0017\u0006\u000b\u0011#\b\f\u001c\b\u0017\u000b\u001a", (byte) (90 >> MotionEvent.axisFromString("")), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            l(27 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "#\n\u0011\u0007#\u0014\u0016\f\b\t\u0017\u0000\u0014\"\u0017\u0006\u000b\u0011#\b\f\u001c\b\u0017\u000b\u001a", (byte) (MotionEvent.axisFromString("") + 16), objArr2);
            obj = objArr2[0];
        }
        c(((String) obj).intern());
        int i4 = this.f26029d;
        int i5 = f26021i + 59;
        f26024m = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return i4;
    }

    public final WalletSettingsValue<BigDecimal> e() {
        int i2 = 2 % 2;
        int i3 = f26021i + 27;
        f26024m = i3 % 128;
        BigDecimal bigDecimalA = null;
        if (i3 % 2 == 0) {
            a();
            throw null;
        }
        bigDecimalA = a();
        int i4 = f26024m + 5;
        f26021i = i4 % 128;
        int i5 = i4 % 2;
        return new WalletSettingsValue<>(bigDecimalA, WalletSettingsRights.ReadOnly);
    }

    public final int g() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26021i + 81;
        f26024m = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        l(Drawable.resolveOpacity(0, 0) + 26, "#\n\u0011\u0007#\u0014\u0016\f\b\t\u0017\u0000\u0014\"\u0017\u0006\u000b\u0011#\b\f\u001c\b\u0017\u000b\u001a", (byte) (15 - TextUtils.getTrimmedLength("")), objArr);
        c(((String) objArr[0]).intern());
        int i5 = this.f26031g;
        int i6 = f26024m + 61;
        f26021i = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
