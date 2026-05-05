package o.y;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import o.ap.a;
import o.ep.i;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends d<a.d, a.c, o.ap.a<o.es.a>, o.es.a> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static final byte[] $$r = null;
    private static final int $$s = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static char A = 0;
    private static int B = 0;
    private static char[] C = null;
    private static int D = 0;
    private static int F = 0;
    private static int I = 0;
    public static int J = 0;
    public static int K = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f27158q = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f27159t = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f27160w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f27161x = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f27162z = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private o.ea.j f27163u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private o.es.a f27164v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Activity f27165y;

    private static String $$t(short s2, byte b2, int i2) {
        byte[] bArr = $$r;
        int i3 = i2 + 102;
        int i4 = 2 - (s2 * 3);
        int i5 = b2 * 4;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + (-i3);
            i4 = i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = i4 + 1;
            i3 += -bArr[i7];
            i4 = i7;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        K = 669066245;
        J = 208889427;
        init$0();
        f27160w = 441509374;
        f27161x = 2117566304;
        f27159t = -1109768263;
        f27158q = -2101618331;
        I = 0;
        F = 1;
        D = 0;
        f27162z = 1;
        q();
        AudioTrack.getMinVolume();
        AudioTrack.getMaxVolume();
        TypedValue.complexToFloat(0);
        int i2 = I + 85;
        F = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
    }

    public g(String str, o.ep.d dVar, boolean z2) {
        super(str, dVar, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void Q(int r20, java.lang.String r21, boolean r22, int r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.g.Q(int, java.lang.String, boolean, int, int, java.lang.Object[]):void");
    }

    private static void R(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = C;
        int i5 = 421932776;
        long j2 = 0;
        int i6 = 1;
        if (cArr2 != null) {
            int i7 = $11 + 65;
            $10 = i7 % 128;
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
                        byte b4 = b3;
                        objA = o.d.d.a(270 - (Process.myPid() >> 22), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)), -811348851, false, $$t(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i5 = 421932776;
                    j2 = 0;
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
        Object[] objArr3 = {Integer.valueOf(A)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = '\n';
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(271 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) TextUtils.indexOf("", ""), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -811348851, false, $$t(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i10 = $11 + 53;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i6];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i6] = (char) (hVar.f19925a - b2);
                    int i12 = $11 + 95;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[c2] = hVar;
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
                        byte b8 = b7;
                        objA3 = o.d.d.a(825 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 10 - TextUtils.lastIndexOf("", '0', 0), -611683395, false, $$t(b7, b8, (byte) (9 | b8)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        int i14 = $11 + 55;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            c2 = '\n';
                            objA4 = o.d.d.a(219 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 212688716, false, $$t(b9, b10, (byte) (7 | b10)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = '\n';
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i16 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i16];
                    } else {
                        c2 = '\n';
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
                            i6 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i20];
                        }
                    }
                    i6 = 1;
                }
                hVar.f19926b += 2;
                int i21 = $11 + 41;
                $10 = i21 % 128;
                int i22 = i21 % 2;
            }
        }
        for (int i23 = 0; i23 < i2; i23++) {
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void S(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 * 4
            int r8 = r0 + 1
            int r7 = r7 + 4
            int r0 = r6 * 3
            int r6 = r0 + 97
            byte[] r5 = o.y.g.$$d
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r5 != 0) goto L29
            r0 = r8
            r2 = r3
        L13:
            int r6 = r6 + r0
            r1 = r2
        L15:
            int r7 = r7 + 1
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r8) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r9[r3] = r0
            return
        L26:
            r0 = r5[r7]
            goto L13
        L29:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.g.S(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void T(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            byte[] r6 = o.y.g.$$j
            int r5 = r8 * 2
            int r1 = r5 + 1
            int r0 = r9 * 4
            int r4 = r0 + 97
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r6 != 0) goto L28
            r0 = r5
            r1 = r2
        L13:
            int r4 = r4 + r0
        L14:
            byte r0 = (byte) r4
            r3[r1] = r0
            if (r1 != r5) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            r10[r2] = r0
            return
        L21:
            int r7 = r7 + 1
            int r1 = r1 + 1
            r0 = r6[r7]
            goto L13
        L28:
            r1 = r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.g.T(byte, byte, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) throws Throwable {
        Object obj;
        int i8 = ~i7;
        int i9 = (-1) - (((-1) - (~((-1) - (((-1) - i8) & ((-1) - i5))))) & ((-1) - (~((i6 + i5) - (i6 & i5)))));
        int i10 = (-1) - (((-1) - i6) & ((-1) - i7));
        int i11 = ~((-1) - (((-1) - i8) & ((-1) - (~i6))));
        int i12 = ~i5;
        int i13 = ((-1) - (((-1) - (~((i7 + i12) - (i7 & i12)))) & ((-1) - i11))) | (~i10);
        int i14 = i6 + i5 + i2 + (1350191703 * i3) + ((-44904237) * i4);
        int i15 = i14 * i14;
        int i16 = ((i6 * (-560584373)) - 948043776) + ((-560584373) * i5) + ((-826660534) * i9) + (i10 * 826660534) + (826660534 * i13) + (266076160 * i2) + ((-71041024) * i3) + ((-766246912) * i4) + (1339949056 * i15);
        int i17 = (i6 * 1657715387) + 2046152777 + (i5 * 1657715387) + (i9 * (-918)) + (i10 * 918) + (i13 * 918) + (i2 * 1657716305) + (i3 * 1507858311) + (i4 * 1845144771) + (i15 * 155058176);
        if (i16 + (i17 * i17 * 417464320) == 1) {
            return b(objArr);
        }
        int i18 = 2 % 2;
        int i19 = f27162z + 63;
        D = i19 % 128;
        if (i19 % 2 != 0) {
            Object[] objArr2 = new Object[1];
            Q((ViewConfiguration.getFadingEdgeLength() * 11) + 87, "￪\u001c\u0004\ufff3ￃ\b\u000f\n\u0012\u0012", true, Color.green(1) * 102, -TextUtils.indexOf((CharSequence) "", (char) 0, 1, 0), objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            Q(10 - (ViewConfiguration.getFadingEdgeLength() >> 16), "￪\u001c\u0004\ufff3ￃ\b\u000f\n\u0012\u0012", true, Color.green(0) + 98, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
            obj = objArr3[0];
        }
        String strIntern = ((String) obj).intern();
        int i20 = f27162z + 113;
        D = i20 % 128;
        int i21 = i20 % 2;
        return strIntern;
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        g gVar = (g) objArr[0];
        int i2 = 2 % 2;
        int i3 = D + 37;
        f27162z = i3 % 128;
        int i4 = i3 % 2;
        if (!((d) gVar).f27099l) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr2 = new Object[1];
            Q(16 - (Process.myPid() >> 22), "\u0007\u0002\n\n￢\u0000\ufffe\u0004\u0011\r\u0000￮\u0014￼￫\u0000", true, 106 - Color.blue(0), TextUtils.lastIndexOf("", '0', 0, 0) + 6, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            Q(18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0016\u000b\u001e\u0013\u0011\u0013￮ￊ\u000f\u0012\ufffe\nￊ\u000e\u001c\u000b￭ￊ", true, (ViewConfiguration.getScrollBarSize() >> 8) + 91, 11 - ExpandableListView.getPackedPositionType(0L), objArr3);
            StringBuilder sbAppend = sb.append(((String) objArr3[0]).intern()).append(((c) gVar).f27088r.b());
            Object[] objArr4 = new Object[1];
            Q((ViewConfiguration.getPressedStateDuration() >> 16) + 36, "\uffc1\u000f\u0010\u0015\uffc1\u0014\u0016\u0011\u0011\u0010\u0013\u0015\uffc1\u0011\u0016\u0014\t\uffc1\u0015\u0010\uffc1￨\u0010\u0010\b\r\u0006\ufff1\u0002\u001a\u0001\uffc1\u0005\u0010\u0006\u0014", false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 100, View.resolveSizeAndState(0, 0, 0) + 30, objArr4);
            throw new WalletValidationException(walletValidationErrorCode, strIntern, sbAppend.append(((String) objArr4[0]).intern()).toString());
        }
        if (((c) gVar).f27088r.j() == null && ((c) gVar).f27088r.h() == null) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr5 = new Object[1];
            Q(15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\u0007\u0002\n\n￢\u0000\ufffe\u0004\u0011\r\u0000￮\u0014￼￫\u0000", true, 106 - KeyEvent.keyCodeFromString(""), MotionEvent.axisFromString("") + 6, objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            Q(58 - TextUtils.getOffsetAfter("", 0), "\u0017\u000b\u0012\u0018\u0017ￃ\u0017\u0016\u0013\uffef\u0004\u0005\b\u000fￃ\u0012\u0015ￃ\u000f\u0004\u0005\b\u000f￦\u0004\u0011\u0011\u0012\u0017ￃ\u0013\u0018\u0016\u000bￃ\u0017\u0012ￃ\n\u0012\u0012\n\u000f\bￃ\u0013\u0004\u001cￃ\u0004ￃ\u0006\u0004\u0015\u0007ￃ\u001a\f", false, 98 - (Process.myTid() >> 22), 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr6);
            throw new WalletValidationException(walletValidationErrorCode2, strIntern2, ((String) objArr6[0]).intern());
        }
        if (((c) gVar).f27088r.s() != null) {
            int i5 = D + 31;
            f27162z = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr7 = {((c) gVar).f27088r.s()};
            int i7 = o.ep.c.f24438e * 574268897;
            o.ep.c.f24438e = i7;
            int id = (int) Thread.currentThread().getId();
            int i8 = o.ep.c.f24436c * 1169734117;
            o.ep.c.f24436c = i8;
            int i9 = o.ep.c.f24434a * (-2104816085);
            o.ep.c.f24434a = i9;
            if (((String) o.ep.c.c(i7, id, i9, 1241915024, objArr7, -1241915024, i8)) == null) {
                WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.WrongState;
                Object[] objArr8 = new Object[1];
                Q(16 - TextUtils.getTrimmedLength(""), "\u0007\u0002\n\n￢\u0000\ufffe\u0004\u0011\r\u0000￮\u0014￼￫\u0000", true, 106 - TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, objArr8);
                String strIntern3 = ((String) objArr8[0]).intern();
                Object[] objArr9 = new Object[1];
                R((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51, "\u000f\u001b㙟㙟\u001a\u0005\u0011\u0017 \u001d\u0005\u0007\u0005\u001a\u0007\u0011㙠㙠\u0013\u001f\u001d\n\u000f\u0017\u0011\b\u0017\t!\u0013\u0017\u0004\n\u0011\u001a\u0000\u0005\u0019 \u0005\u0007\u001d\u0014\u001b\u0005\b\u0000\u001d\f\u0019\b ", (byte) (107 - View.MeasureSpec.getSize(0)), objArr9);
                throw new WalletValidationException(walletValidationErrorCode3, strIntern3, ((String) objArr9[0]).intern());
            }
        }
        int i10 = f27162z + 83;
        D = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static o.ap.a<o.es.a> b(o.es.a aVar, o.ea.h hVar) {
        int i2 = 2 % 2;
        o.ap.a<o.es.a> aVar2 = new o.ap.a<>(aVar, hVar);
        int i3 = D + 61;
        f27162z = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 35 / 0;
        }
        return aVar2;
    }

    private o.es.a e(Context context) {
        int i2 = 2 % 2;
        int i3 = f27162z;
        int i4 = i3 + 9;
        D = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (this.f27164v == null) {
            int i5 = i3 + 61;
            D = i5 % 128;
            if (i5 % 2 != 0) {
                o.ea.c.a();
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                this.f27164v = (o.es.a) o.ea.b.a((int) Runtime.getRuntime().freeMemory(), 2135872852, iElapsedRealtime, new Object[]{context}, Process.myUid(), Thread.activeCount(), -2135872847);
                int i6 = 57 / 0;
            } else {
                o.ea.c.a();
                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                this.f27164v = (o.es.a) o.ea.b.a((int) Runtime.getRuntime().freeMemory(), 2135872852, iElapsedRealtime2, new Object[]{context}, Process.myUid(), Thread.activeCount(), -2135872847);
            }
        }
        return this.f27164v;
    }

    static void init$0() {
        $$d = new byte[]{4, 39, -92, -86};
        $$e = 62;
    }

    static void init$1() {
        $$j = new byte[]{100, 68, -66, 16};
        $$k = 88;
    }

    static void init$2() {
        $$r = new byte[]{32, MessagePack.Code.STR16, MessagePack.Code.NEVER_USED};
        $$s = 136;
    }

    static void q() {
        B = -1270219490;
        C = new char[]{51643, 64589, 64593, 51644, 64584, 64577, 51642, 64523, 51645, 64614, 64610, 64517, 64583, 64578, 64604, 64629, 64594, 64597, 64612, 64615, 51646, 64580, 64599, 64579, 64588, 64585, 64598, 64630, 64576, 64586, 64625, 64582, 64587, 64590, 64621, 64592};
        A = (char) 51641;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f4  */
    @Override // o.y.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ o.es.c a(android.content.Context r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.g.a(android.content.Context):o.es.c");
    }

    @Override // o.y.c
    final void a_() throws Throwable {
        int i2 = f27161x * 218474983;
        f27161x = i2;
        int i3 = f27160w * 1064917594;
        f27160w = i3;
        a(i3, (int) Runtime.getRuntime().totalMemory(), (int) SystemClock.uptimeMillis(), -842230800, 842230801, new Object[]{this}, i2);
    }

    @Override // o.y.d
    final /* bridge */ /* synthetic */ o.ap.b b(o.es.c cVar, o.ea.h hVar) {
        int i2 = 2 % 2;
        int i3 = f27162z + 83;
        D = i3 % 128;
        int i4 = i3 % 2;
        o.ap.a<o.es.a> aVarB = b((o.es.a) cVar, hVar);
        int i5 = D + 41;
        f27162z = i5 % 128;
        int i6 = i5 % 2;
        return aVarB;
    }

    @Override // o.x.i
    public final String c() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f27162z + 45;
        D = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            R(23 - KeyEvent.normalizeMetaState(1), "\u001c\u001d \u001e\u001c\"\u000f\u001b\u0017\u0004\u0011!\u0019\u0002#\u0018\u000b\u001c\u0019\u0011\u001a\u001d\u0015\u001b㘉", (byte) (35 - (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1))), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            R(KeyEvent.normalizeMetaState(0) + 25, "\u001c\u001d \u001e\u001c\"\u000f\u001b\u0017\u0004\u0011!\u0019\u0002#\u0018\u000b\u001c\u0019\u0011\u001a\u001d\u0015\u001b㘉", (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 37), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    public final o.ea.j c(Activity activity, o.x.f fVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = D + 41;
        f27162z = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            Q(TextUtils.indexOf((CharSequence) "", '0') + 45, "\u000e￤\t\t\u0000\r￮\u0000\ufffe\u0010\r\u0000\uffdf\u0004\u0002\u0004\u000f￼\u0007\uffde￼\r\uffff￫\u0010\u000e\u0003\uffef\n￢\n\n\u0002\u0007\u0000￫￼\u0014￫\r\n\ufffe\u0000\u000e", false, 106 - TextUtils.indexOf("", "", 0), 1 - View.resolveSize(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            R(11 - TextUtils.lastIndexOf("", '0'), "\u001b\u0013\u001e!\u0001\u0007\u0011!\r\u0018\u0019\u001e", (byte) (30 - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f27165y = activity;
        this.f27163u = new o.ea.j();
        b(activity, fVar);
        o.ea.j jVar = this.f27163u;
        int i4 = D + 11;
        f27162z = i4 % 128;
        if (i4 % 2 != 0) {
            return jVar;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.y.d
    final String k() {
        int i2 = f27158q * 1404541663;
        f27158q = i2;
        int iMyTid = Process.myTid();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i3 = f27159t * (-2111334210);
        f27159t = i3;
        return (String) a(iMyTid, elapsedCpuTime, i3, 1205884641, -1205884641, new Object[]{this}, i2);
    }

    @Override // o.y.d
    final Activity l() {
        int i2 = 2 % 2;
        int i3 = D + 11;
        f27162z = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f27165y;
        }
        throw null;
    }

    @Override // o.y.d
    final i.c m() {
        int i2 = 2 % 2;
        int i3 = f27162z + 1;
        D = i3 % 128;
        int i4 = i3 % 2;
        i.c cVar = i.c.f24665b;
        if (i4 == 0) {
            return cVar;
        }
        throw null;
    }

    @Override // o.y.d
    final String n() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27162z + 47;
        D = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        Q(44 - View.getDefaultSize(0, 0), "\u000e￤\t\t\u0000\r￮\u0000\ufffe\u0010\r\u0000\uffdf\u0004\u0002\u0004\u000f￼\u0007\uffde￼\r\uffff￫\u0010\u000e\u0003\uffef\n￢\n\n\u0002\u0007\u0000￫￼\u0014￫\r\n\ufffe\u0000\u000e", false, 106 - Color.blue(0), -TextUtils.lastIndexOf("", '0', 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f27162z + 117;
        D = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    @Override // o.y.d
    final AntelopErrorCode o() {
        AntelopErrorCode antelopErrorCode;
        int i2 = 2 % 2;
        int i3 = f27162z + 49;
        D = i3 % 128;
        if (i3 % 2 != 0) {
            antelopErrorCode = AntelopErrorCode.GooglePayWalletNotAvailable;
            int i4 = 37 / 0;
        } else {
            antelopErrorCode = AntelopErrorCode.GooglePayWalletNotAvailable;
        }
        int i5 = D + 57;
        f27162z = i5 % 128;
        int i6 = i5 % 2;
        return antelopErrorCode;
    }

    @Override // o.y.d
    final o.ea.j t() {
        int i2 = 2 % 2;
        int i3 = D;
        int i4 = i3 + 17;
        f27162z = i4 % 128;
        int i5 = i4 % 2;
        o.ea.j jVar = this.f27163u;
        int i6 = i3 + 9;
        f27162z = i6 % 128;
        int i7 = i6 % 2;
        return jVar;
    }
}
