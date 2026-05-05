package o.eg;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.facebook.imageutils.JfifUtil;
import java.lang.reflect.Method;
import java.util.TimeZone;
import o.a.f;
import o.a.h;
import o.d.d;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f23851a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23852b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f23853c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f23854d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final TimeZone f23855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23856f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23857g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23858h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char[] f23859i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f23860j = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f23861o = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, byte r8, byte r9) {
        /*
            int r2 = r8 * 4
            int r1 = 1 - r2
            byte[] r8 = o.eg.a.$$a
            int r7 = r7 + 67
            int r0 = r9 * 2
            int r6 = r0 + 4
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r8 != 0) goto L2c
            r7 = r3
            r1 = r6
            r2 = r4
        L16:
            int r7 = r7 + r6
            int r6 = r1 + 1
            r1 = r2
        L1a:
            byte r0 = (byte) r7
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r0 = r8[r6]
            r1 = r6
            r6 = r0
            goto L16
        L2c:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eg.a.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23856f = 0;
        f23861o = 1;
        f23858h = 0;
        f23857g = 1;
        e();
        SystemClock.elapsedRealtimeNanos();
        ViewConfiguration.getTapTimeout();
        Object[] objArr = new Object[1];
        l(2 - Process.getGidForName(""), "\u0006\u0015㘟", (byte) (80 - TextUtils.lastIndexOf("", '0')), objArr);
        f23855e = TimeZone.getTimeZone(((String) objArr[0]).intern());
        int i2 = f23856f + 45;
        f23861o = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int b(String str, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6 = 2 % 2;
        if (i2 >= 0 && i3 <= str.length()) {
            int i7 = f23858h + 17;
            int i8 = i7 % 128;
            f23857g = i8;
            if (i7 % 2 == 0) {
                throw null;
            }
            if (i2 <= i3) {
                if (i2 < i3) {
                    int i9 = i8 + 65;
                    f23858h = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = i2 + 1;
                    int iDigit = Character.digit(str.charAt(i2), 10);
                    if (iDigit < 0) {
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr = new Object[1];
                        l(16 - TextUtils.indexOf("", ""), "\b\u0002\u000f\u0007\u0006\u000e\u0018\u0011\u0002\r\u0018\u0016\r\u000f\u0004\u000f", (byte) (99 - Gravity.getAbsoluteGravity(0, 0)), objArr);
                        throw new NumberFormatException(sb.append(((String) objArr[0]).intern()).append(str.substring(i2, i3)).toString());
                    }
                    i5 = -iDigit;
                    int i11 = f23858h + 45;
                    f23857g = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    i4 = i2;
                    i5 = 0;
                }
                while (i4 < i3) {
                    int i13 = i4 + 1;
                    int iDigit2 = Character.digit(str.charAt(i4), 10);
                    if (iDigit2 < 0) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr2 = new Object[1];
                        l(Color.alpha(0) + 16, "\b\u0002\u000f\u0007\u0006\u000e\u0018\u0011\u0002\r\u0018\u0016\r\u000f\u0004\u000f", (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 99), objArr2);
                        throw new NumberFormatException(sb2.append(((String) objArr2[0]).intern()).append(str.substring(i2, i3)).toString());
                    }
                    i5 = (i5 * 10) - iDigit2;
                    i4 = i13;
                }
                return -i5;
            }
        }
        throw new NumberFormatException(str);
    }

    private static boolean b(String str, int i2, char c2) {
        int i3 = 2 % 2;
        if (i2 < str.length()) {
            int i4 = f23857g + 123;
            f23858h = i4 % 128;
            int i5 = i4 % 2;
            char cCharAt = str.charAt(i2);
            if (i5 != 0) {
                int i6 = 68 / 0;
                if (cCharAt == c2) {
                    return true;
                }
            } else if (cCharAt == c2) {
                return true;
            }
        }
        int i7 = f23857g + 77;
        f23858h = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[PHI: r1
  0x001e: PHI (r1v5 char) = (r1v2 char), (r1v6 char) binds: [B:16:0x0030, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int d(java.lang.String r5, int r6) {
        /*
            r4 = 2
            int r0 = r4 % r4
        L3:
            int r0 = r5.length()
            if (r6 >= r0) goto L46
            int r0 = o.eg.a.f23857g
            int r1 = r0 + 65
            int r0 = r1 % 128
            o.eg.a.f23858h = r0
            int r1 = r1 % r4
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L2a
            char r1 = r5.charAt(r6)
            r0 = 54
            if (r1 < r0) goto L33
        L1e:
            r0 = 57
            if (r1 <= r0) goto L28
            r0 = r3
        L23:
            if (r0 == 0) goto L33
            int r6 = r6 + 1
            goto L3
        L28:
            r0 = r2
            goto L23
        L2a:
            char r1 = r5.charAt(r6)
            r0 = 48
            if (r1 < r0) goto L33
            goto L1e
        L33:
            int r0 = o.eg.a.f23857g
            int r1 = r0 + 53
            int r0 = r1 % 128
            o.eg.a.f23858h = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L3f
            r2 = r3
        L3f:
            if (r2 == 0) goto L42
            return r6
        L42:
            r0 = 24
            int r0 = r0 / r3
            return r6
        L46:
            int r0 = r5.length()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eg.a.d(java.lang.String, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date d(java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eg.a.d(java.lang.String):java.util.Date");
    }

    static void e() {
        f23851a = new char[]{2540, 2509, 2330, 2486, 2499, 2511, 2503, 2480, 2508, 2502, 2521, 2523, 2504, 2305, 2314, 2544, 2543, 2505, 2498, 2501, 2484, 2318, 2510, 2531, 2309};
        f23852b = 2040400186;
        f23853c = true;
        f23854d = true;
        f23859i = new char[]{64543, 64610, 64526, 64587, 64542, 64580, 64538, 64620, 64625, 64585, 64576, 64588, 64592, 64533, 64539, 64541, 64616, 64595, 64599, 64517, 64540, 64583, 64577, 64584, 64514};
        f23860j = (char) 51642;
    }

    static void init$0() {
        $$a = new byte[]{Utf8.REPLACEMENT_BYTE, -81, -107, -8};
        $$b = 188;
    }

    private static void k(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f23851a;
        float f2 = 0.0f;
        if (cArr2 != null) {
            int i4 = $11 + 53;
            int i5 = i4 % 128;
            $10 = i5;
            int i6 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = i5 + 19;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = d.a(1618406102);
                    if (objA == null) {
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 593;
                        char cMyTid = (char) (13181 - (Process.myTid() >> 22));
                        int i10 = (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1)) + 11;
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a(maximumFlingVelocity, cMyTid, i10, -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
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
        Object[] objArr3 = {Integer.valueOf(f23852b)};
        Object objA2 = d.a(-1503702982);
        char c2 = '0';
        if (objA2 == null) {
            objA2 = d.a(31 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        int i11 = 6;
        if (!f23854d) {
            if (!f23853c) {
                fVar.f19923e = iArr.length;
                char[] cArr4 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr4[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    fVar.f19922a++;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i12 = $10 + 49;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            fVar.f19923e = cArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = d.a(457 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) TextUtils.indexOf("", "", 0), MotionEvent.axisFromString("") + 12, -1923924106, false, $$c((byte) 6, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = bArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i14 = $11 + 7;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr6[fVar.f19922a] = (char) (cArr2[bArr[fVar.f19923e >> fVar.f19922a] + i2] << iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = d.a(1540807955);
                if (objA4 == null) {
                    byte b5 = (byte) i11;
                    byte b6 = (byte) 0;
                    objA4 = d.a(458 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (TextUtils.indexOf("", c2, 0) + 1), ExpandableListView.getPackedPositionChild(0L) + 12, -1923924106, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = d.a(1540807955);
                if (objA5 == null) {
                    byte b7 = (byte) 0;
                    objA5 = d.a(458 - TextUtils.getTrimmedLength(""), (char) (Process.myTid() >> 22), 11 - KeyEvent.getDeadChar(0, 0), -1923924106, false, $$c((byte) 6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            c2 = '0';
            i11 = 6;
        }
        objArr[0] = new String(cArr6);
    }

    private static void l(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        int length;
        char[] cArr;
        String str2 = str;
        int i4 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        h hVar = new h();
        char[] cArr3 = f23859i;
        int i5 = 35;
        int i6 = 421932776;
        if (cArr3 != null) {
            int i7 = $11 + 1;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
            } else {
                length = cArr3.length;
                cArr = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                    Object objA = d.a(i6);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        objA = d.a(270 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((Process.getThreadPriority(0) + 20) >> 6), 11 - Drawable.resolveOpacity(0, 0), -811348851, false, $$c((byte) i5, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    i5 = 35;
                    i6 = 421932776;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        Object[] objArr3 = {Integer.valueOf(f23860j)};
        Object objA2 = d.a(421932776);
        char c2 = '\b';
        if (objA2 == null) {
            byte b4 = (byte) 0;
            objA2 = d.a(270 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, -811348851, false, $$c((byte) 35, b4, b4), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i9 = $11 + 71;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                i3 = i2 + 31;
                cArr4[i3] = (char) (cArr2[i3] >> b2);
            } else {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr2[i3] - b2);
            }
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr2[hVar.f19926b];
                hVar.f19925a = cArr2[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = d.a(219124184);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        objA3 = d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 825, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), View.combineMeasuredStates(0, 0) + 11, -611683395, false, $$c((byte) ($$b & 111), b5, b5), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = d.a(-634864343);
                        if (objA4 == null) {
                            byte b6 = (byte) 0;
                            c2 = '\b';
                            objA4 = d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + JfifUtil.MARKER_SOS, (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, 212688716, false, $$c((byte) 42, b6, b6), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = '\b';
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i10 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr3[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr3[i10];
                    } else {
                        c2 = '\b';
                        if (hVar.f19928d == hVar.f19929e) {
                            int i11 = $11 + 15;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i13 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i14 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr3[i13];
                            cArr4[hVar.f19926b + 1] = cArr3[i14];
                        } else {
                            int i15 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i16 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr3[i15];
                            cArr4[hVar.f19926b + 1] = cArr3[i16];
                        }
                    }
                }
                hVar.f19926b += 2;
                int i17 = $11 + 95;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        for (int i19 = 0; i19 < i2; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
