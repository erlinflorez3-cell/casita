package o.dw;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.biocatch.android.commonsdk.core.Utils;
import com.dynatrace.android.callback.Callback;
import com.facebook.imageutils.JfifUtil;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import o.a.h;
import o.dv.d;
import o.dx.a;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23387a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23388c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f23389d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f23390e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23391f = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23392j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f23393b;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:5:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r5 = r7 + 4
            byte[] r4 = o.dw.b.$$a
            int r0 = r8 + 102
            byte[] r3 = new byte[r1]
            r1 = -1
            if (r4 != 0) goto L25
            r2 = r5
        L10:
            int r0 = -r0
            int r5 = r5 + r0
        L12:
            int r1 = r1 + 1
            byte r0 = (byte) r5
            r3[r1] = r0
            if (r1 != r6) goto L20
            java.lang.String r1 = new java.lang.String
            r0 = 0
            r1.<init>(r3, r0)
            return r1
        L20:
            int r2 = r2 + 1
            r0 = r4[r2]
            goto L10
        L25:
            r2 = r5
            r5 = r0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dw.b.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23392j = 0;
        f23391f = 1;
        f23387a = 0;
        f23388c = 1;
        a();
        ViewConfiguration.getScrollDefaultDelay();
        Drawable.resolveOpacity(0, 0);
        int i2 = f23391f + 39;
        f23392j = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
    }

    public b(d dVar) {
        this.f23393b = dVar;
    }

    static void a() {
        f23390e = new char[]{64585, 64620, 64605, 64593, 64576, 64595, 64599, 65471, 64578, 64592, 64586, 64587, 64589, 64590, 64624, 64579, 64517, 64588, 64598, 64582, 64619, 64543, 64580, 64577, 64614, 64583, 64584, 64630, 64631, 64621, 65470, 64597, 64581, 65469, 64594, 64520};
        f23389d = (char) 51641;
    }

    private static void g(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f23390e;
        int i5 = 421932776;
        int i6 = 1;
        if (cArr2 != null) {
            int i7 = $10 + 21;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objA = o.d.d.a((ViewConfiguration.getScrollBarSize() >> 8) + 270, (char) TextUtils.indexOf("", "", 0, 0), 11 - KeyEvent.keyCodeFromString(""), -811348851, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i5 = 421932776;
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
        Object[] objArr3 = {Integer.valueOf(f23389d)};
        Object objA2 = o.d.d.a(421932776);
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = (byte) (b5 - 1);
            objA2 = o.d.d.a(270 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getTapTimeout() >> 16), 11 - Color.alpha(0), -811348851, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i10 = $11 + 121;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                i3 = i2 + 115;
                cArr4[i3] = (char) (cArr[i3] / b2);
            } else {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            }
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i6];
                if (hVar.f19927c == hVar.f19925a) {
                    int i11 = $10 + 19;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c << b2);
                        cArr4[hVar.f19926b >>> i6] = (char) (hVar.f19925a >> b2);
                    } else {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + i6] = (char) (hVar.f19925a - b2);
                    }
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i6] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        objA3 = o.d.d.a(825 - TextUtils.getTrimmedLength(""), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -611683395, false, $$c(b7, b8, (byte) (9 & b8)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 - 1);
                            objA4 = o.d.d.a(TextUtils.getOffsetBefore("", 0) + JfifUtil.MARKER_SOS, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 10 - MotionEvent.axisFromString(""), 212688716, false, $$c(b9, b10, (byte) ((-1) - (((-1) - b10) | ((-1) - 7)))), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i12 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i12];
                    } else if (hVar.f19928d == hVar.f19929e) {
                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                        int i13 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                        int i14 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[i13];
                        cArr4[hVar.f19926b + 1] = cArr2[i14];
                    } else {
                        int i15 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                        int i16 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                        cArr4[hVar.f19926b] = cArr2[i15];
                        i6 = 1;
                        cArr4[hVar.f19926b + 1] = cArr2[i16];
                    }
                    i6 = 1;
                }
                hVar.f19926b += 2;
            }
        }
        int i17 = 0;
        while (i17 < i2) {
            int i18 = $11 + 91;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                cArr4[i17] = (char) (cArr4[i17] ^ 15613);
                i17 += 4;
            } else {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                i17++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void init$0() {
        $$a = new byte[]{39, 4, 32, -80};
        $$b = 156;
    }

    @Override // o.dw.c
    public final InputStream d() throws Throwable {
        int i2 = 2 % 2;
        try {
            new o.ce.b();
            HttpsURLConnection httpsURLConnectionC = o.ce.b.c(new URL(this.f23393b.b()));
            httpsURLConnectionC.setConnectTimeout(10000);
            httpsURLConnectionC.setReadTimeout(Utils.miliSecondsInMinute);
            httpsURLConnectionC.setUseCaches(false);
            for (Map.Entry<String, String> entry : this.f23393b.c().entrySet()) {
                httpsURLConnectionC.setRequestProperty(entry.getKey(), entry.getValue());
                int i3 = f23388c + 33;
                f23387a = i3 % 128;
                int i4 = i3 % 2;
            }
            if (Callback.getResponseCode(httpsURLConnectionC) >= 200) {
                int i5 = f23388c + 91;
                f23387a = i5 % 128;
                int i6 = i5 % 2;
                if (Callback.getResponseCode(httpsURLConnectionC) < 300) {
                    return Callback.getInputStream((URLConnection) httpsURLConnectionC);
                }
            }
            if (f.a()) {
                Object[] objArr = new Object[1];
                g(33 - View.resolveSize(0, 0), "\u001b\u0005\u0001!\u0016\u0018\u0002\u001c\t\u0004\n\"\u0000\u0016\u000b\n\u0007\u0012\u0003\u001c\u000b\n\u0007\u0012\n\"\u0000\u0016\u0006\u0004\u0000\u0005㙣", (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 122), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                g((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33, "\n\u0000\u0016\u0006\u0001\u0000\n\u0016\"\u0011\u0005\u0007\u0004\u0017\u0005\f\u0016\u0011\"\n\u0013\u001e\u000b\u0006\u0016\u0000\f\u001c\u000b\u0016\n\u0016\u0016\u000f", (byte) (11 - TextUtils.lastIndexOf("", '0', 0)), objArr2);
                f.d(strIntern, sb.append(((String) objArr2[0]).intern()).append(Callback.getResponseCode(httpsURLConnectionC)).toString());
            }
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr3 = new Object[1];
            g((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, "\u0016\u0002\u0004!\u000b\u0007\u000e\u0011\u0005\u0003\u0016\u0001!\u0001\u0010\u000b\n\u0011\"\u0011\u0005\u0007\u0004\u0017\u0005\f\u0016\u0011\"\n\u0013\u001e\u000b\u0006\u0016\u0000\f\u001c\u000b\u0016\n\u0016\u0016\u000f", (byte) (60 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr3);
            throw new a(sb2.append(((String) objArr3[0]).intern()).append(Callback.getResponseCode(httpsURLConnectionC)).toString());
        } catch (IOException | ClassCastException | o.ce.d e2) {
            if (f.a()) {
                Object[] objArr4 = new Object[1];
                g(33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u001b\u0005\u0001!\u0016\u0018\u0002\u001c\t\u0004\n\"\u0000\u0016\u000b\n\u0007\u0012\u0003\u001c\u000b\n\u0007\u0012\n\"\u0000\u0016\u0006\u0004\u0000\u0005㙣", (byte) (ExpandableListView.getPackedPositionGroup(0L) + 123), objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr5 = new Object[1];
                g(Color.green(0) + 27, "\n\u0000\u0016\u0006\u0001\u0000\n\u0016\"\u0011\u0011\b\u0013\u001c\u0001\u0005\u000f\u0004\u0010\u0016\u0010\u0003\u0001\u0015\u000f\u0012㖿", (byte) (5 - (ViewConfiguration.getTapTimeout() >> 16)), objArr5);
                f.e(strIntern2, sb3.append(((String) objArr5[0]).intern()).append(e2.getMessage()).toString(), e2);
            }
            throw new a(e2.getMessage());
        }
    }
}
