package o.y;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import o.as.e;
import o.ep.i;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends e {
    private static final byte[] $$k = null;
    private static final int $$l = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k */
    private static char[] f27231k = null;

    /* JADX INFO: renamed from: l */
    private static int f27232l = 0;

    /* JADX INFO: renamed from: m */
    private static char f27233m = 0;

    /* JADX INFO: renamed from: n */
    private static int f27234n = 0;

    /* JADX INFO: renamed from: o */
    private static int f27235o = 0;

    /* JADX INFO: renamed from: t */
    private static int f27236t = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$m(byte r8, int r9, short r10) {
        /*
            int r8 = r8 * 4
            int r3 = r8 + 1
            int r0 = r9 * 2
            int r2 = 3 - r0
            int r1 = r10 + 102
            byte[] r7 = o.y.l.$$k
            byte[] r6 = new byte[r3]
            r5 = 0
            if (r7 != 0) goto L2a
            r4 = r8
            r0 = r2
            r3 = r5
        L14:
            int r1 = -r2
            int r1 = r1 + r4
            r2 = r0
        L17:
            int r0 = r2 + 1
            byte r2 = (byte) r1
            r6[r3] = r2
            if (r3 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L24:
            r2 = r7[r0]
            int r3 = r3 + 1
            r4 = r1
            goto L14
        L2a:
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.l.$$m(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27234n = 0;
        f27236t = 1;
        f27232l = 0;
        f27235o = 1;
        o();
        ViewConfiguration.getKeyRepeatDelay();
        ExpandableListView.getPackedPositionGroup(0L);
        int i2 = f27236t + 111;
        f27234n = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
    }

    public l(String str, boolean z2, o.ep.d dVar, o.ep.i iVar) {
        super(str, dVar, z2, iVar);
    }

    private static void C(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        int i5 = $11 + 9;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f27231k;
        int i7 = 421932776;
        if (cArr2 != null) {
            int i8 = $10 + 125;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objA = o.d.d.a(i7);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(270 - Color.argb(0, 0, 0, 0), (char) TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", '0', 0) + 12, -811348851, false, $$m(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    i7 = 421932776;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = $11 + 81;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f27233m)};
        Object objA2 = o.d.d.a(421932776);
        long j2 = 0;
        int i13 = 8;
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(271 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, -811348851, false, $$m(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i14 = $11 + 79;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                i3 = i2 + 97;
                cArr4[i3] = (char) (cArr[i3] + b2);
            } else {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            }
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i15 = $10 + 77;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                hVar.f19926b = 1;
            } else {
                hVar.f19926b = 0;
            }
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[i13] = Integer.valueOf(cCharValue);
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
                        byte b8 = b7;
                        objA3 = o.d.d.a((SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)) + 824, (char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> i13) + 11, -611683395, false, $$m(b7, b8, (byte) ((-1) - (((-1) - b8) & ((-1) - 9)))), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            i13 = 8;
                            objA4 = o.d.d.a(218 - View.MeasureSpec.getMode(0), (char) Color.argb(0, 0, 0, 0), 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 212688716, false, $$m(b9, b10, (byte) ((-1) - (((-1) - b10) & ((-1) - 7)))), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            i13 = 8;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i16 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i16];
                    } else {
                        i13 = 8;
                        if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i17 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i18 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i17];
                            cArr4[hVar.f19926b + 1] = cArr2[i18];
                        } else {
                            int i19 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i20 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i19];
                            cArr4[hVar.f19926b + 1] = cArr2[i20];
                        }
                    }
                }
                hVar.f19926b += 2;
                j2 = 0;
            }
        }
        int i21 = $10 + 35;
        $11 = i21 % 128;
        int i22 = i21 % 2;
        for (int i23 = 0; i23 < i2; i23++) {
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void init$0() {
        $$k = new byte[]{120, 46, 101, 90};
        $$l = 24;
    }

    static void o() {
        f27231k = new char[]{64576, 65471, 64590, 64625, 64582, 64609, 64580, 64577, 64585, 64588, 64586, 64631, 64620, 64584, 65469, 64598, 64592, 65468, 64614, 64587, 64599, 64593, 65470, 64578, 64630};
        f27233m = (char) 51642;
    }

    @Override // o.x.i
    public final String c() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f27235o + 89;
        f27232l = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            C(68 % ExpandableListView.getPackedPositionType(1L), "\u0014\u0004\u0001\u0013\u0000\u0005\u0000\r\u0003\u0001\u0010\u000e\u0005\u0014\u0012\u000b㙀", (byte) (107 >>> View.MeasureSpec.getMode(0)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            C(ExpandableListView.getPackedPositionType(0L) + 17, "\u0014\u0004\u0001\u0013\u0000\u0005\u0000\r\u0003\u0001\u0010\u000e\u0005\u0014\u0012\u000b㙀", (byte) (View.MeasureSpec.getMode(0) + 65), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f27232l + 87;
        f27235o = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    public final void c(Context context, o.x.f fVar) throws WalletValidationException {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f27232l + 59;
            f27235o = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            C((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33, "\u000e\u0011\u000f\u0004\u0015\u0014\u0001\u0000\u000f\u0015\u0005\n\b\u0018\u0006\u0018\u0007\t\u0010\b\u0016\u0005\u0000\r\u0003\u0001\u0010\u000e\u0005\u0014\u0012\u000b㙇", (byte) (71 - Process.getGidForName("")), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            C(ExpandableListView.getPackedPositionType(0L) + 6, "\u0000\u0005\u0010\u0011\n\u0003", (byte) (67 - View.combineMeasuredStates(0, 0)), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (l().o() != i.b.f24653c) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            C(5 - KeyEvent.getDeadChar(0, 0), "\u0000\r\u0003\u0001㙧", (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 114), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern());
        }
        b(context, fVar);
        int i5 = f27235o + 103;
        f27232l = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
    }

    @Override // o.y.e
    public final e.c n() {
        e.c cVar;
        int i2 = 2 % 2;
        int i3 = f27232l + 85;
        f27235o = i3 % 128;
        if (i3 % 2 == 0) {
            cVar = e.c.f20616a;
            int i4 = 24 / 0;
        } else {
            cVar = e.c.f20616a;
        }
        int i5 = f27235o + 5;
        f27232l = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }
}
