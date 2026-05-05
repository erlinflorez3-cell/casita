package o.y;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import fr.antelop.sdk.card.CardStatus;
import fr.antelop.sdk.digitalcard.SecurePinInput;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import o.al.a;
import o.ee.e;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static char f27346p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f27347q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static char[] f27348s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f27349t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static int f27350u = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f27351y = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f27352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final String f27353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f27354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CustomerAuthenticatedProcessActivityCallback f27355n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SecurePinInput f27356o;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r10, short r11, byte r12) {
        /*
            int r9 = r12 + 4
            int r8 = 111 - r11
            byte[] r7 = o.y.q.$$d
            int r6 = r10 * 3
            int r0 = r6 + 1
            byte[] r5 = new byte[r0]
            r4 = 0
            if (r7 != 0) goto L28
            r1 = r9
            r3 = r4
        L11:
            int r8 = r8 + r9
            r9 = r1
            r2 = r3
        L14:
            int r1 = r9 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            int r3 = r2 + 1
            if (r2 != r6) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L23:
            r0 = r7[r1]
            r9 = r8
            r8 = r0
            goto L11
        L28:
            r2 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.q.$$j(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27350u = 0;
        f27351y = 1;
        f27349t = 0;
        f27347q = 1;
        m();
        Color.argb(0, 0, 0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        int i2 = f27350u + 111;
        f27351y = i2 % 128;
        int i3 = i2 % 2;
    }

    public q(String str, o.ep.d dVar, boolean z2) {
        super(str, dVar);
        this.f27353l = str;
        this.f27354m = z2;
    }

    private static void B(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f27348s;
        long j2 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 3;
                $10 = i7 % 128;
                if (i7 % i4 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objA = o.d.d.a(421932776);
                        if (objA == null) {
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 270;
                            char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)));
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11;
                            byte b3 = $$d[i4];
                            byte b4 = b3;
                            objA = o.d.d.a(scrollDefaultDelay, c2, doubleTapTimeout, -811348851, false, $$j(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 9))), (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i6 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objA2 = o.d.d.a(421932776);
                    if (objA2 == null) {
                        int i8 = 270 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11;
                        byte b5 = $$d[2];
                        byte b6 = b5;
                        objA2 = o.d.d.a(i8, packedPositionChild, keyRepeatDelay, -811348851, false, $$j(b6, (byte) ((b6 + 9) - (9 & b6)), (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i4 = 2;
                j2 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(f27346p)};
        Object objA3 = o.d.d.a(421932776);
        char c3 = '\n';
        if (objA3 == null) {
            int capsMode = 270 - TextUtils.getCapsMode("", 0, 0);
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            int iLastIndexOf = 10 - TextUtils.lastIndexOf("", '0', 0);
            byte b7 = $$d[2];
            byte b8 = b7;
            objA3 = o.d.d.a(capsMode, cLastIndexOf, iLastIndexOf, -811348851, false, $$j(b8, (byte) ((b8 + 9) - (9 & b8)), (byte) (b7 - 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
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
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = hVar;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[c3] = hVar;
                    objArr5[9] = hVar;
                    objArr5[8] = Integer.valueOf(cCharValue);
                    objArr5[7] = hVar;
                    objArr5[6] = hVar;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = hVar;
                    objArr5[3] = hVar;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[1] = hVar;
                    objArr5[0] = hVar;
                    Object objA4 = o.d.d.a(219124184);
                    if (objA4 == null) {
                        int i9 = 825 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int fadingEdgeLength = 11 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte b9 = $$d[2];
                        byte b10 = b9;
                        objA4 = o.d.d.a(i9, cMyTid, fadingEdgeLength, -611683395, false, $$j(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA4).invoke(null, objArr5)).intValue() == hVar.f19930g) {
                        Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA5 = o.d.d.a(-634864343);
                        if (objA5 == null) {
                            int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 217;
                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int i11 = 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte b11 = $$d[2];
                            byte b12 = (byte) (b11 + 2);
                            String str$$j = $$j(b11, b12, (byte) (b12 - 3));
                            c3 = '\n';
                            objA5 = o.d.d.a(i10, scrollBarSize, i11, 212688716, false, str$$j, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c3 = '\n';
                        }
                        int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                        int i12 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i12];
                    } else {
                        c3 = '\n';
                        if (hVar.f19928d == hVar.f19929e) {
                            int i13 = $10 + 71;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i15 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i16 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i15];
                            cArr4[hVar.f19926b + 1] = cArr2[i16];
                            int i17 = $10 + 9;
                            $11 = i17 % 128;
                            int i18 = i17 % 2;
                        } else {
                            int i19 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i20 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i19];
                            cArr4[hVar.f19926b + 1] = cArr2[i20];
                        }
                    }
                }
                hVar.f19926b += 2;
            }
        }
        int i21 = 0;
        while (i21 < i2) {
            int i22 = $11 + 93;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                cArr4[i21] = (char) (cArr4[i21] ^ 9903);
                i21 += 18;
            } else {
                cArr4[i21] = (char) (cArr4[i21] ^ 13722);
                i21++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static /* synthetic */ void b(q qVar) {
        int i2 = 2 % 2;
        int i3 = f27349t + 27;
        f27347q = i3 % 128;
        int i4 = i3 % 2;
        qVar.e();
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void c(Context context, e.d dVar, e.b bVar, e.a aVar) {
        int i2 = 2 % 2;
        new o.ee.e(aVar, dVar, bVar, new CustomerAuthenticatedProcessActivityCallback() { // from class: o.y.q.3

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f27357c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f27358e = 1;

            @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback
            public final void onActivityStart(Context context2) {
                int i3 = 2 % 2;
                int i4 = f27358e + 77;
                f27357c = i4 % 128;
                int i5 = i4 % 2;
                if (q.this.f27355n != null) {
                    int i6 = f27358e;
                    int i7 = (i6 ^ 97) + (((-1) - (((-1) - i6) | ((-1) - 97))) << 1);
                    f27357c = i7 % 128;
                    if (i7 % 2 != 0) {
                        q.this.f27355n.onActivityStart(context2);
                        int i8 = 25 / 0;
                    } else {
                        q.this.f27355n.onActivityStart(context2);
                    }
                }
                int i9 = f27358e;
                int i10 = (i9 ^ 121) + (((-1) - (((-1) - i9) | ((-1) - 121))) << 1);
                f27357c = i10 % 128;
                int i11 = i10 % 2;
            }

            @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback
            public final void onActivityStop() {
                int i3 = 2 % 2;
                int i4 = f27358e;
                int i5 = (i4 ^ 21) + (((-1) - (((-1) - i4) | ((-1) - 21))) << 1);
                f27357c = i5 % 128;
                if (i5 % 2 != 0) {
                    CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback = q.this.f27355n;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (q.this.f27355n != null) {
                    q.this.f27355n.onActivityStop();
                    int i6 = f27358e + 29;
                    f27357c = i6 % 128;
                    int i7 = i6 % 2;
                }
                int i8 = f27358e;
                int i9 = ((-1) - (((-1) - i8) | ((-1) - 93))) + ((i8 + 93) - (i8 & 93));
                f27357c = i9 % 128;
                int i10 = i9 % 2;
            }
        }).b(context);
        int i3 = f27347q + 79;
        f27349t = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 84 / 0;
        }
    }

    static void init$0() {
        $$d = new byte[]{99, Ascii.EM, 0, 108};
        $$e = 196;
    }

    static void m() {
        f27348s = new char[]{64587, 64599, 64589, 64576, 64597, 64586, 64577, 64582, 64614, 64630, 64598, 64578, 64625, 64620, 64585, 64624, 64580, 64588, 64581, 64629, 64593, 64517, 64609, 64592, 64595};
        f27346p = (char) 51642;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r9, fr.antelop.sdk.digitalcard.SecurePinInput r10, o.x.j r11) throws java.lang.Throwable {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = o.y.q.f27347q
            int r1 = r0 + 79
            int r0 = r1 % 128
            o.y.q.f27349t = r0
            int r1 = r1 % r7
            r3 = 0
            if (r1 == 0) goto L2a
            boolean r1 = o.ea.f.a()
            r0 = 3
            int r0 = r0 / r3
            if (r1 != 0) goto L30
        L17:
            r8.f27356o = r10
            r8.b(r9, r11)
            int r0 = o.y.q.f27347q
            int r1 = r0 + 11
            int r0 = r1 % 128
            o.y.q.f27349t = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L29
            r0 = 3
            int r0 = r0 / r3
        L29:
            return
        L2a:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L17
        L30:
            java.lang.String r1 = ""
            int r0 = android.text.TextUtils.getTrimmedLength(r1)
            int r4 = r0 + 20
            r0 = 48
            int r0 = android.text.TextUtils.indexOf(r1, r0)
            int r0 = 5 - r0
            byte r2 = (byte) r0
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "\n\u0003\u0001\u0004\u0004\u0006\u0002\b\u0015\u0003\u0004\u0012\u000f\u0002\u0013\u0000\u000b\u0015\u0017\u0000"
            B(r4, r0, r2, r1)
            r0 = r1[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = r0.intern()
            int r0 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r0 = r0 >> 16
            int r4 = 6 - r0
            int r0 = android.view.View.getDefaultSize(r3, r3)
            int r0 = r0 + 110
            byte r2 = (byte) r0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "\u000b\u0013\u0014\u0003\f\u0007"
            B(r4, r0, r2, r1)
            r0 = r1[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r5, r0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.q.a(android.content.Context, fr.antelop.sdk.digitalcard.SecurePinInput, o.x.j):void");
    }

    public final void a(CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) {
        int i2 = 2 % 2;
        int i3 = f27349t + 109;
        int i4 = i3 % 128;
        f27347q = i4;
        int i5 = i3 % 2;
        this.f27355n = customerAuthenticatedProcessActivityCallback;
        int i6 = i4 + 107;
        f27349t = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.y.c
    final void a_() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27349t + 25;
        f27347q = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {((c) this).f27088r};
        int i5 = o.ep.d.f24461m * (-222457364);
        o.ep.d.f24461m = i5;
        int i6 = o.ep.d.f24462n * 325900588;
        o.ep.d.f24462n = i6;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i7 = o.ep.d.f24460l * 323941697;
        o.ep.d.f24460l = i7;
        if (((CardStatus) o.ep.d.e(1555433584, -1555433578, objArr, i6, iElapsedRealtime, i7, i5)) != CardStatus.Active) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr2 = new Object[1];
            B((ViewConfiguration.getTouchSlop() >> 8) + 4, "\u0006\u0012\u0006\u000b", (byte) (81 - Color.green(0)), objArr2);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr2[0]).intern());
        }
        if (this.f27354m) {
            int i8 = f27349t + 35;
            f27347q = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
        Object[] objArr3 = new Object[1];
        B((ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, "\u000f\u0012\u0005\u0014\u0001\t\u000f\u0015\u0004\b\u0004\u0002\u0016\u0013\b\u0002", (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 95), objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        StringBuilder sb = new StringBuilder();
        Object[] objArr4 = new Object[1];
        B((ViewConfiguration.getLongPressTimeout() >> 16) + 17, "\u0011\u0007\u0001\u0017\u0002\u0016\f\u0010\u0015\u000f\r\t\u0015\u0006\u000b\u0001㘔", (byte) (26 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr4);
        StringBuilder sbAppend = sb.append(((String) objArr4[0]).intern()).append(((c) this).f27088r.b());
        Object[] objArr5 = new Object[1];
        B(28 - ImageFormat.getBitsPerPixel(0), "\u0010\u0017\u0007\u0006\u0000\r\u0014\u0001\n\u0000\u0014\u000b\u0018\u0003\u0000\t\u0000\u0015\u0018\u0001\u000f\u0002\u0016\u0018\u0001\t\u000f\u0015㙝", (byte) (94 - (ViewConfiguration.getFadingEdgeLength() >> 16)), objArr5);
        throw new WalletValidationException(walletValidationErrorCode2, strIntern, sbAppend.append(((String) objArr5[0]).intern()).toString());
    }

    @Override // o.x.i
    public final String c() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f27349t + 101;
        f27347q = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            B(65 / TextUtils.getOffsetBefore("", 1), "\u000f\u0012\u0005\u0014\u0001\t\u000f\u0015\u0004\b\u0004\u0002\u0016\u0013\b\u0002", (byte) (56 >>> TextUtils.getTrimmedLength("")), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            B(TextUtils.getOffsetBefore("", 0) + 16, "\u000f\u0012\u0005\u0014\u0001\t\u000f\u0015\u0004\b\u0004\u0002\u0016\u0013\b\u0002", (byte) (95 - TextUtils.getTrimmedLength("")), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f27347q + 7;
        f27349t = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    public final void c(Context context, SecurePinInput securePinInput, o.x.f fVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27347q + 85;
        f27349t = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f27349t + 69;
            f27347q = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            B(KeyEvent.keyCodeFromString("") + 20, "\n\u0003\u0001\u0004\u0004\u0006\u0002\b\u0015\u0003\u0004\u0012\u000f\u0002\u0013\u0000\u000b\u0015\u0017\u0000", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            B(6 - ((Process.getThreadPriority(0) + 20) >> 6), "\u000b\u0013\u0014\u0003\f\u0007", (byte) (110 - Color.blue(0)), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f27356o = securePinInput;
        b(context, fVar);
        int i7 = f27349t + 39;
        f27347q = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // o.x.i
    public final void c(Context context, o.en.b bVar, final o.i.d dVar) throws Throwable {
        e.b bVar2;
        int i2 = 2 % 2;
        int i3 = f27347q + 33;
        f27349t = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            B(TextUtils.indexOf((CharSequence) "", '0') + 21, "\n\u0003\u0001\u0004\u0004\u0006\u0002\b\u0015\u0003\u0004\u0012\u000f\u0002\u0013\u0000\u000b\u0015\u0017\u0000", (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 6), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            B(TextUtils.getOffsetAfter("", 0) + 10, "\u0003\u0015\u0004\u000f\u0000\u0006\b\u0002㙔㙔", (byte) (107 - Color.blue(0)), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        final o.x.f fVarI = i();
        final o.al.a aVar = new o.al.a(context, new a.d() { // from class: o.y.q.4
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static char[] f27360b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f27361c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long f27362d = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f27363h = 0;

            private static String $$c(int i5, byte b2, byte b3) {
                int i6 = (b2 * 3) + 4;
                int i7 = b3 + 99;
                int i8 = i5 * 2;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i8 + 1];
                int i9 = -1;
                if (bArr == null) {
                    i6++;
                    i7 += -i6;
                }
                while (true) {
                    i9++;
                    bArr2[i9] = (byte) i7;
                    if (i9 == i8) {
                        return new String(bArr2, 0);
                    }
                    byte b4 = bArr[i6];
                    i6++;
                    i7 += -b4;
                }
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f27361c = 0;
                f27363h = 1;
                f27360b = new char[]{38075, 49896, 14452, 38859, 52560, 9445, 37423, 51645, 10023, 40596, 62495, 8798, 39403, 63352, 12031, 33870, 62422, 10535, 32942, 65035, 14835, 28550, 38182, 15013, 24604, 35249, 16202, 25843, 35421, 13306, 22896, 36659, 13465, 23067, 33703, 10549, 24239, 33883, 47348, 61057, 5153, 48034, 57627, 2230, 48717, 58868, 2906, 45821, 55415, 3617, 46474, 56086, 687, 43042, 57257, 1354};
                f27362d = -2842208872998845818L;
            }

            private static void f(char c2, int i5, int i6, Object[] objArr3) throws Throwable {
                int i7 = 2;
                int i8 = 2 % 2;
                o.a.o oVar = new o.a.o();
                long[] jArr = new long[i6];
                oVar.f19947b = 0;
                while (oVar.f19947b < i6) {
                    int i9 = $10 + 49;
                    $11 = i9 % 128;
                    if (i9 % i7 == 0) {
                        int i10 = oVar.f19947b;
                        try {
                            Object[] objArr4 = {Integer.valueOf(f27360b[i5 >>> i10])};
                            Object objA = o.d.d.a(-214519724);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 741, (char) ExpandableListView.getPackedPositionGroup(0L), 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr5 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr4)).longValue()), Long.valueOf(i10), Long.valueOf(f27362d), Integer.valueOf(c2)};
                            Object objA2 = o.d.d.a(-1567654649);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = o.d.d.a(765 - TextUtils.lastIndexOf("", '0', 0), (char) (12470 - Drawable.resolveOpacity(0, 0)), 11 - TextUtils.indexOf((CharSequence) "", '0', 0), 1946853218, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i10] = ((Long) ((Method) objA2).invoke(null, objArr5)).longValue();
                            Object[] objArr6 = {oVar, oVar};
                            Object objA3 = o.d.d.a(-723636472);
                            if (objA3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objA3 = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 386, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), MotionEvent.axisFromString("") + 19, 39570797, false, $$c(b6, b7, (byte) ((b7 + 6) - (6 & b7))), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA3).invoke(null, objArr6);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i11 = oVar.f19947b;
                        Object[] objArr7 = {Integer.valueOf(f27360b[i5 + i11])};
                        Object objA4 = o.d.d.a(-214519724);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objA4 = o.d.d.a(743 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 632508977, false, $$c(b8, b9, b9), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr8 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr7)).longValue()), Long.valueOf(i11), Long.valueOf(f27362d), Integer.valueOf(c2)};
                        Object objA5 = o.d.d.a(-1567654649);
                        if (objA5 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objA5 = o.d.d.a(TextUtils.indexOf("", "") + 766, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12470), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12, 1946853218, false, $$c(b10, b11, (byte) (b11 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i11] = ((Long) ((Method) objA5).invoke(null, objArr8)).longValue();
                        Object[] objArr9 = {oVar, oVar};
                        Object objA6 = o.d.d.a(-723636472);
                        if (objA6 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            objA6 = o.d.d.a(TextUtils.indexOf("", "", 0, 0) + 387, (char) KeyEvent.getDeadChar(0, 0), 18 - (ViewConfiguration.getLongPressTimeout() >> 16), 39570797, false, $$c(b12, b13, (byte) ((b13 + 6) - (6 & b13))), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA6).invoke(null, objArr9);
                    }
                    int i12 = $11 + 79;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i7 = 2;
                }
                char[] cArr = new char[i6];
                oVar.f19947b = 0;
                while (oVar.f19947b < i6) {
                    int i14 = $10 + 43;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                        Object[] objArr10 = {oVar, oVar};
                        Object objA7 = o.d.d.a(-723636472);
                        if (objA7 == null) {
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            objA7 = o.d.d.a(386 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.getTrimmedLength(""), (Process.myTid() >> 22) + 18, 39570797, false, $$c(b14, b15, (byte) (6 | b15)), new Class[]{Object.class, Object.class});
                        }
                        Object obj = null;
                        ((Method) objA7).invoke(null, objArr10);
                        obj.hashCode();
                        throw null;
                    }
                    cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                    Object[] objArr11 = {oVar, oVar};
                    Object objA8 = o.d.d.a(-723636472);
                    if (objA8 == null) {
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        objA8 = o.d.d.a(KeyEvent.normalizeMetaState(0) + 387, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 18 - View.combineMeasuredStates(0, 0), 39570797, false, $$c(b16, b17, (byte) ((-1) - (((-1) - b17) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA8).invoke(null, objArr11);
                }
                objArr3[0] = new String(cArr);
            }

            static void init$0() {
                $$a = new byte[]{37, -107, Ascii.NAK, -25};
                $$b = 221;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
            @Override // o.al.a.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void c() throws java.lang.Throwable {
                /*
                    r8 = this;
                    r7 = 2
                    int r0 = r7 % r7
                    int r0 = o.y.q.AnonymousClass4.f27361c
                    int r1 = r0 + 33
                    int r0 = r1 % 128
                    o.y.q.AnonymousClass4.f27363h = r0
                    int r1 = r1 % r7
                    r6 = 1
                    r5 = 0
                    if (r1 != 0) goto L83
                    boolean r1 = o.ea.f.a()
                    r0 = 96
                    int r0 = r0 / r5
                    r1 = r1 ^ r6
                    if (r1 == r6) goto L67
                L1a:
                    long r3 = android.os.SystemClock.currentThreadTimeMillis()
                    r1 = -1
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    int r0 = 1 - r0
                    char r3 = (char) r0
                    int r2 = android.view.KeyEvent.normalizeMetaState(r5)
                    r0 = 0
                    int r0 = android.widget.ExpandableListView.getPackedPositionGroup(r0)
                    int r1 = r0 + 20
                    java.lang.Object[] r0 = new java.lang.Object[r6]
                    f(r3, r2, r1, r0)
                    r0 = r0[r5]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r4 = r0.intern()
                    r1 = 44398(0xad6e, float:6.2215E-41)
                    int r0 = android.view.View.resolveSizeAndState(r5, r5, r5)
                    int r0 = r0 + r1
                    char r3 = (char) r0
                    int r0 = android.view.ViewConfiguration.getEdgeSlop()
                    int r0 = r0 >> 16
                    int r2 = r0 + 20
                    java.lang.String r0 = ""
                    int r0 = android.text.TextUtils.indexOf(r0, r0)
                    int r1 = 18 - r0
                    java.lang.Object[] r0 = new java.lang.Object[r6]
                    f(r3, r2, r1, r0)
                    r0 = r0[r5]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r0 = r0.intern()
                    o.ea.f.c(r4, r0)
                L67:
                    o.x.f r2 = r2
                    if (r2 == 0) goto L79
                    int r0 = o.y.q.AnonymousClass4.f27361c
                    int r1 = r0 + 49
                    int r0 = r1 % 128
                    o.y.q.AnonymousClass4.f27363h = r0
                    int r1 = r1 % r7
                    if (r1 == 0) goto L8a
                    r2.onProcessSuccess()
                L79:
                    int r0 = o.y.q.AnonymousClass4.f27361c
                    int r1 = r0 + 109
                    int r0 = r1 % 128
                    o.y.q.AnonymousClass4.f27363h = r0
                    int r1 = r1 % r7
                    return
                L83:
                    boolean r0 = o.ea.f.a()
                    if (r0 == 0) goto L67
                    goto L1a
                L8a:
                    r2.onProcessSuccess()
                    r0 = 0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.q.AnonymousClass4.c():void");
            }

            @Override // o.al.a.d
            public final void d(o.bg.c cVar, int i5) throws Throwable {
                int i6 = 2 % 2;
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    f((char) (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.getMaxKeyCode() >> 16, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    f((char) (11369 - KeyEvent.getDeadChar(0, 0)), 38 - View.getDefaultSize(0, 0), (Process.myTid() >> 22) + 18, objArr4);
                    o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
                    int i7 = f27363h + 123;
                    f27361c = i7 % 128;
                    int i8 = i7 % 2;
                }
                if (fVarI != null) {
                    o.bg.a aVarC = cVar.c();
                    if (aVarC == o.bg.a.az) {
                        q.b(q.this);
                        fVarI.onAuthenticationDeclined();
                        return;
                    }
                    if (aVarC == o.bg.a.aF) {
                        int i9 = f27363h + 41;
                        f27361c = i9 % 128;
                        int i10 = i9 % 2;
                        q.this.f27352k = i5;
                    }
                    fVarI.onError(o.by.c.b(cVar));
                    int i11 = f27363h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f27361c = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
        }, bVar);
        SecurePinInput securePinInput = this.f27356o;
        e.d dVar2 = null;
        e.b bVar3 = null;
        if (securePinInput != null) {
            int i5 = f27349t + 51;
            f27347q = i5 % 128;
            int i6 = i5 % 2;
            e.d dVar3 = securePinInput.getCurrentPinInputProperties() != null ? new e.d(this.f27356o.getCurrentPinInputProperties()) : null;
            if (this.f27356o.getNewPinInputProperties() != null) {
                bVar3 = new e.b(context, this.f27356o.getNewPinInputProperties());
                int i7 = f27347q + 45;
                f27349t = i7 % 128;
                int i8 = i7 % 2;
            }
            bVar2 = bVar3;
            dVar2 = dVar3;
        } else {
            bVar2 = null;
        }
        if (dVar2 != null || bVar2 != null) {
            c(context, dVar2, bVar2, new e.a() { // from class: o.y.q.5

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f27366e = 0;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static int f27367f = 1;

                @Override // o.ee.e.a
                public final void b() {
                    int i9 = 2 % 2;
                    int i10 = f27366e + 91;
                    f27367f = i10 % 128;
                    Object obj = null;
                    if (i10 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    o.x.f fVar = fVarI;
                    if (fVar != null) {
                        fVar.onError(new o.by.c(AntelopErrorCode.UserCancelled));
                        int i11 = f27367f;
                        int i12 = ((-1) - (((-1) - i11) | ((-1) - 65))) + (i11 | 65);
                        f27366e = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    int i14 = f27366e + 53;
                    f27367f = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                }

                @Override // o.ee.e.a
                public final void c(byte[] bArr, byte[] bArr2) throws Throwable {
                    int i9 = 2 % 2;
                    int i10 = f27367f;
                    int i11 = (i10 & 115) + ((-1) - (((-1) - i10) & ((-1) - 115)));
                    f27366e = i11 % 128;
                    int i12 = i11 % 2;
                    aVar.a(bArr, bArr2, dVar, q.this.f27353l, ((c) q.this).f27088r);
                    int i13 = f27366e + 121;
                    f27367f = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                }
            });
            return;
        }
        int i9 = f27347q + 5;
        f27349t = i9 % 128;
        int i10 = i9 % 2;
        aVar.a(null, null, dVar, this.f27353l, ((c) this).f27088r);
    }

    public final int l() {
        int i2 = 2 % 2;
        int i3 = f27347q + 111;
        f27349t = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f27352k;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
