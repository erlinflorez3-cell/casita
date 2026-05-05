package o.eh;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.imageutils.JfifUtil;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o.a.h;
import o.a.n;
import o.d.d;
import o.ea.g;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23862a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23863b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f23864c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23865d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f23866e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23867h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23868j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, int r10) {
        /*
            int r7 = 115 - r10
            int r3 = r8 * 4
            int r2 = 1 - r3
            byte[] r6 = o.eh.e.$$a
            int r0 = r9 * 4
            int r1 = 3 - r0
            byte[] r5 = new byte[r2]
            r4 = 0
            int r3 = 0 - r3
            if (r6 != 0) goto L2b
            r2 = r4
            r0 = r1
        L15:
            int r1 = -r1
            int r1 = r1 + r7
            r7 = r1
            r1 = r0
        L19:
            byte r0 = (byte) r7
            r5[r2] = r0
            int r0 = r1 + 1
            if (r2 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r1 = r6[r0]
            int r2 = r2 + 1
            goto L15
        L2b:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eh.e.$$c(byte, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23867h = 0;
        f23868j = 1;
        f23862a = 0;
        f23863b = 1;
        a();
        e();
        TextUtils.getOffsetBefore("", 0);
        ViewConfiguration.getLongPressTimeout();
        Color.argb(0, 0, 0, 0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        ViewConfiguration.getLongPressTimeout();
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getJumpTapTimeout();
        View.MeasureSpec.getSize(0);
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getWindowTouchSlop();
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getMaximumFlingVelocity();
        ExpandableListView.getPackedPositionType(0L);
        TextUtils.lastIndexOf("", '0', 0);
        ExpandableListView.getPackedPositionForGroup(0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        KeyEvent.getMaxKeyCode();
        View.MeasureSpec.getSize(0);
        int i2 = f23868j + 49;
        f23867h = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
    }

    static void a() {
        f23866e = new char[]{64616, 64612, 64592, 64598, 64593, 64591, 64578, 64607, 64523, 64577, 64611, 64610, 64576, 64580, 64608, 64604, 64599, 64588, 64597, 64609, 64595, 64582, 64615, 64613, 64614};
        f23864c = (char) 51642;
    }

    public static byte[] a(byte[] bArr) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        int i3 = f23863b + 45;
        f23862a = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                f(4 << View.MeasureSpec.getMode(1), "\ufff3\u0015\n\u0003\uffef", true, Gravity.getAbsoluteGravity(0, 0) * 13765, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                f(5 - View.MeasureSpec.getMode(0), "\ufff3\u0015\n\u0003\uffef", false, 192 - Gravity.getAbsoluteGravity(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            MessageDigest messageDigest = MessageDigest.getInstance(strIntern);
            messageDigest.reset();
            try {
                Object[] objArr3 = new Object[1];
                g("\b\n\u0017\n\r\b\u000b\u0016\u0001\u0011\u0013\u0002\u0012\u0005\u0002\n㙔㙔\u000b\b\u000e\u0011\u0010\u0007\r\u0002㙙", TextUtils.indexOf((CharSequence) "", '0', 0) + 28, (byte) (107 - View.MeasureSpec.getMode(0)), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                g("\u0003\u0011\b\u000e\u0002\u000e", 6 - ExpandableListView.getPackedPositionGroup(0L), (byte) (TextUtils.getTrimmedLength("") + 87), objArr4);
                cls.getMethod((String) objArr4[0], byte[].class).invoke(messageDigest, bArr);
                byte[] bArrDigest = messageDigest.digest();
                int i4 = f23863b + 107;
                f23862a = i4 % 128;
                int i5 = i4 % 2;
                return bArrDigest;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    public static byte[] b(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23863b + 51;
        f23862a = i3 % 128;
        int i4 = i3 % 2;
        byte[] bytes = str.getBytes(g.c());
        if (i4 == 0) {
            return a(bytes);
        }
        a(bytes);
        throw null;
    }

    public static byte[] b(byte[] bArr) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        int i3 = f23863b + 53;
        f23862a = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                f(3 >>> Gravity.getAbsoluteGravity(1, 1), "\ufff3\u000b\u0002", false, 17956 >>> View.resolveSizeAndState(1, 1, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                f(3 - Gravity.getAbsoluteGravity(0, 0), "\ufff3\u000b\u0002", false, 196 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            MessageDigest messageDigest = MessageDigest.getInstance(strIntern);
            messageDigest.reset();
            int i4 = f23862a + 113;
            f23863b = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr3 = new Object[1];
                g("\b\n\u0017\n\r\b\u000b\u0016\u0001\u0011\u0013\u0002\u0012\u0005\u0002\n㙔㙔\u000b\b\u000e\u0011\u0010\u0007\r\u0002㙙", 27 - ExpandableListView.getPackedPositionGroup(0L), (byte) (TextUtils.getOffsetAfter("", 0) + 107), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                g("\u0003\u0011\b\u000e\u0002\u000e", 6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (87 - Color.red(0)), objArr4);
                cls.getMethod((String) objArr4[0], byte[].class).invoke(messageDigest, bArr);
                return messageDigest.digest();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    public static byte[] c(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f23862a + 57;
        f23863b = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object[] objArr = new Object[1];
            f(TextUtils.indexOf((CharSequence) "", '0') + 7, "\ufff7\ufff4\u0003\n\u0015\ufff8", true, 192 - TextUtils.indexOf("", ""), TextUtils.lastIndexOf("", '0', 0) + 6, objArr);
            MessageDigest messageDigest = MessageDigest.getInstance(((String) objArr[0]).intern());
            messageDigest.reset();
            try {
                Object[] objArr2 = new Object[1];
                g("\b\n\u0017\n\r\b\u000b\u0016\u0001\u0011\u0013\u0002\u0012\u0005\u0002\n㙔㙔\u000b\b\u000e\u0011\u0010\u0007\r\u0002㙙", 28 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (107 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                g("\u0003\u0011\b\u000e\u0002\u000e", 7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 86), objArr3);
                cls.getMethod((String) objArr3[0], byte[].class).invoke(messageDigest, bArr);
                int i5 = f23863b + 93;
                f23862a = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr4 = new Object[1];
                    g("\b\n\u0017\n\r\b\u000b\u0016\u0001\u0011\u0013\u0002\u0012\u0005\u0002\n㙔㙔\u000b\b\u000e\u0011\u0010\u0007\r\u0002㙙", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, (byte) (107 - View.combineMeasuredStates(0, 0)), objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    g("\u0007\u0013\u0007\u000b\u0004\u0000", 6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (Color.blue(0) + 63), objArr5);
                    return (byte[]) cls2.getMethod((String) objArr5[0], byte[].class).invoke(messageDigest, bArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    public static byte[] d(String str) {
        int i2 = 2 % 2;
        int i3 = f23862a + 57;
        f23863b = i3 % 128;
        int i4 = i3 % 2;
        byte[] bytes = str.getBytes(g.c());
        if (i4 != 0) {
            return d(bytes);
        }
        d(bytes);
        throw null;
    }

    public static byte[] d(byte[] bArr) {
        int i2 = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            f((ViewConfiguration.getLongPressTimeout() >> 16) + 6, "\ufff7\ufff4\u0003\n\u0015\ufff8", true, TextUtils.lastIndexOf("", '0') + 193, 5 - TextUtils.getOffsetBefore("", 0), objArr);
            MessageDigest messageDigest = MessageDigest.getInstance(((String) objArr[0]).intern());
            messageDigest.reset();
            int i3 = f23863b + 51;
            f23862a = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = new Object[1];
                g("\b\n\u0017\n\r\b\u000b\u0016\u0001\u0011\u0013\u0002\u0012\u0005\u0002\n㙔㙔\u000b\b\u000e\u0011\u0010\u0007\r\u0002㙙", 27 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 107), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                g("\u0003\u0011\b\u000e\u0002\u000e", 6 - View.combineMeasuredStates(0, 0), (byte) (View.getDefaultSize(0, 0) + 87), objArr3);
                cls.getMethod((String) objArr3[0], byte[].class).invoke(messageDigest, bArr);
                byte[] bArrDigest = messageDigest.digest();
                int i5 = f23862a + 51;
                f23863b = i5 % 128;
                if (i5 % 2 != 0) {
                    return bArrDigest;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    static void e() {
        f23865d = -1270219367;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] e(byte[] r14, java.lang.String r15) throws java.lang.Throwable {
        /*
            r7 = 2
            int r0 = r7 % r7
            int r0 = o.eh.e.f23863b
            int r1 = r0 + 85
            int r0 = r1 % 128
            o.eh.e.f23862a = r0
            int r1 = r1 % r7
            int r4 = r15.hashCode()
            r0 = -903629273(0xffffffffca23b627, float:-2682249.8)
            java.lang.String r3 = ""
            r2 = 1
            r1 = 0
            if (r4 == r0) goto L56
            r0 = 3528965(0x35d905, float:4.945133E-39)
            if (r4 == r0) goto L26
        L1e:
            r0 = -1
        L1f:
            if (r0 == 0) goto L96
            if (r0 == r2) goto L91
            byte[] r0 = new byte[r1]
            return r0
        L26:
            r0 = 48
            char r0 = android.text.AndroidCharacter.getMirror(r0)
            int r4 = 52 - r0
            int r0 = android.view.ViewConfiguration.getTouchSlop()
            int r0 = r0 >> 8
            int r7 = r0 + 221
            int r0 = android.view.KeyEvent.keyCodeFromString(r3)
            int r8 = r0 + 4
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.String r5 = "ￖ\u0006\r\u0018"
            r6 = 1
            f(r4, r5, r6, r7, r8, r9)
            r0 = r9[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r15.equals(r0)
            r0 = r0 ^ r2
            if (r0 == r2) goto L1e
            r0 = r1
            goto L1f
        L56:
            int r0 = android.text.TextUtils.getCapsMode(r3, r1, r1)
            int r8 = 6 - r0
            double r5 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r1)
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            int r11 = 208 - r0
            float r3 = android.media.AudioTrack.getMinVolume()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            int r12 = 3 - r0
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.String r9 = "￤\uffe7￨%\u001a\u0013"
            r10 = 0
            f(r8, r9, r10, r11, r12, r13)
            r0 = r13[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L1e
            int r0 = o.eh.e.f23863b
            int r3 = r0 + 51
            int r0 = r3 % 128
            o.eh.e.f23862a = r0
            int r3 = r3 % r7
            r0 = r2
            goto L1f
        L91:
            byte[] r0 = d(r14)
            return r0
        L96:
            byte[] r0 = a(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eh.e.e(byte[], java.lang.String):byte[]");
    }

    private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i6 = $10 + 67;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f23865d)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) ($$b - 4);
                    byte b3 = b2;
                    objA = d.a(ExpandableListView.getPackedPositionChild(0L) + 271, (char) KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0', 0, 0) + 12, -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) ($$b - 4);
                    objA2 = d.a(522 - Color.green(0), (char) ('0' - AndroidCharacter.getMirror('0')), 13 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 627984172, false, $$c(b4, b4, (byte) (-$$a[1])), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i9 = $11 + 101;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 3 / 5;
                }
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
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i11 = $10 + 49;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr4[nVar.f19944a] = cArr2[nVar.f19944a + i2];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = d.a(-202660535);
                    if (objA3 == null) {
                        byte b5 = (byte) ($$b - 4);
                        objA3 = d.a(522 - TextUtils.indexOf("", "", 0), (char) KeyEvent.keyCodeFromString(""), 11 - TextUtils.lastIndexOf("", '0', 0), 627984172, false, $$c(b5, b5, (byte) (-$$a[1])), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = d.a(-202660535);
                    if (objA4 == null) {
                        byte b6 = (byte) ($$b - 4);
                        objA4 = d.a(523 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSizeAndState(0, 0, 0) + 12, 627984172, false, $$c(b6, b6, (byte) (-$$a[1])), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void g(String str, int i2, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f23866e;
        long j2 = 0;
        int i4 = 421932776;
        int i5 = 8;
        char c2 = 11;
        int i6 = 4;
        int i7 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objA = d.a(i4);
                    if (objA == null) {
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> i5) + 11;
                        byte b3 = (byte) ($$b - i6);
                        byte b4 = b3;
                        objA = d.a(270 - ExpandableListView.getPackedPositionGroup(j2), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), scrollBarSize, -811348851, false, $$c(b3, b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 13)))), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    j2 = 0;
                    i4 = 421932776;
                    i5 = 8;
                    i6 = 4;
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
        Object[] objArr3 = {Integer.valueOf(f23864c)};
        Object objA2 = d.a(421932776);
        char c3 = 6;
        if (objA2 == null) {
            int threadPriority = 11 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte b5 = (byte) ($$b - 4);
            byte b6 = b5;
            objA2 = d.a(270 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), threadPriority, -811348851, false, $$c(b5, b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 13)))), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i7];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i7] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[c3] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i7] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = d.a(219124184);
                    if (objA3 == null) {
                        int iLastIndexOf = 824 - TextUtils.lastIndexOf("", '0');
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int i9 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10;
                        int i10 = $$b;
                        byte b7 = (byte) (i10 - 4);
                        objA3 = d.a(iLastIndexOf, cNormalizeMetaState, i9, -611683395, false, $$c(b7, b7, (byte) i10), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = d.a(-634864343);
                        if (objA4 == null) {
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + JfifUtil.MARKER_SOS;
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int gidForName = 10 - Process.getGidForName("");
                            byte b8 = (byte) ($$b - 4);
                            byte b9 = b8;
                            String str$$c = $$c(b8, b9, (byte) (6 | b9));
                            c2 = 11;
                            c3 = 6;
                            objA4 = d.a(offsetBefore, edgeSlop, gidForName, 212688716, false, str$$c, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = 11;
                            c3 = 6;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i11 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i11];
                    } else {
                        c2 = 11;
                        c3 = 6;
                        if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i12 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i12];
                            cArr4[hVar.f19926b + 1] = cArr2[i13];
                        } else {
                            int i14 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i15 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i14];
                            i7 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i15];
                        }
                    }
                    i7 = 1;
                }
                hVar.f19926b += 2;
            }
        }
        for (int i16 = 0; i16 < i2; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void init$0() {
        $$a = new byte[]{93, -2, -4, -85};
        $$b = 4;
    }
}
