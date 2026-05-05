package o.eo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import o.a.h;
import o.a.n;
import o.am.b;
import o.ea.m;
import o.eo.b;
import o.er.w;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends b<w> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f24288a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f24289b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f24290c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f24291d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f24292e = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f24293j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$f(int r9, byte r10, byte r11) {
        /*
            int r0 = r10 * 2
            int r8 = r0 + 1
            int r0 = r11 * 2
            int r7 = 3 - r0
            int r6 = r9 + 102
            byte[] r5 = o.eo.d.$$d
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r5 != 0) goto L28
            r0 = r6
            r6 = r8
            r2 = r3
        L14:
            int r6 = r6 + r0
            r1 = r2
        L16:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            int r7 = r7 + 1
            if (r2 != r8) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r5[r7]
            goto L14
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eo.d.$$f(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24288a = 0;
        f24293j = 1;
        f24291d = 0;
        f24290c = 1;
        i();
        Color.red(0);
        View.MeasureSpec.getMode(0);
        int i2 = f24288a + 83;
        f24293j = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static o.ef.a b(w wVar) throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        Object[] objArr = new Object[1];
        h((ViewConfiguration.getFadingEdgeLength() >> 16) + 2, " \u0007", (byte) (105 - Color.blue(0)), objArr);
        aVar.a(((String) objArr[0]).intern(), (Object) wVar.e());
        Object[] objArr2 = new Object[1];
        h(TextUtils.lastIndexOf("", '0') + 11, "\u001e#\u0019\u000e\u000b\u0006#\u0014\u0013\r", (byte) (89 - TextUtils.getOffsetBefore("", 0)), objArr2);
        aVar.a(((String) objArr2[0]).intern(), m.b((Enum[]) wVar.b()));
        Object[] objArr3 = new Object[1];
        h(4 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0010\"\u0019\u0013", (byte) (ExpandableListView.getPackedPositionChild(0L) + 50), objArr3);
        aVar.a(((String) objArr3[0]).intern(), (Object) wVar.c());
        Object[] objArr4 = new Object[1];
        h((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7, "\u0010 \u001c\u001e\u001b\u000b㙤", (byte) (110 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr4);
        aVar.a(((String) objArr4[0]).intern(), (Object) wVar.d());
        int i3 = f24291d + 63;
        f24290c = i3 % 128;
        if (i3 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    private static w e(o.ef.a aVar) throws Throwable {
        o.dx.g gVar;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        h(2 - (ViewConfiguration.getJumpTapTimeout() >> 16), " \u0007", (byte) (View.resolveSize(0, 0) + 105), objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i3 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i3;
        String str = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i3, Thread.currentThread().getPriority());
        Object[] objArr3 = new Object[1];
        h((ViewConfiguration.getWindowTouchSlop() >> 8) + 10, "\u001e#\u0019\u000e\u000b\u0006#\u0014\u0013\r", (byte) (90 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr3);
        w.d[] dVarArr = (w.d[]) aVar.d(w.d.class, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        h((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, "\u0010\"\u0019\u0013", (byte) (View.resolveSizeAndState(0, 0, 0) + 49), objArr4);
        String strS = aVar.s(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        h(View.MeasureSpec.getSize(0) + 7, "\u0010 \u001c\u001e\u001b\u000b㙤", (byte) (View.resolveSizeAndState(0, 0, 0) + 110), objArr5);
        String strS2 = aVar.s(((String) objArr5[0]).intern());
        if (strS2 != null) {
            gVar = new o.dx.g(strS2);
            int i4 = f24290c + 47;
            f24291d = i4 % 128;
            int i5 = i4 % 2;
        } else {
            gVar = null;
        }
        w wVar = new w(str, dVarArr, strS, gVar);
        int i6 = f24290c + 67;
        f24291d = i6 % 128;
        if (i6 % 2 == 0) {
            return wVar;
        }
        throw null;
    }

    private static void h(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f24292e;
        int i5 = 421932776;
        long j2 = 0;
        int i6 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(ExpandableListView.getPackedPositionGroup(j2) + 270, (char) Drawable.resolveOpacity(0, 0), Color.red(0) + 11, -811348851, false, $$f(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $11 + 107;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
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
        Object[] objArr3 = {Integer.valueOf(f24289b)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = '\f';
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(270 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -811348851, false, $$f(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        char c3 = 3;
        if (i2 % 2 != 0) {
            int i10 = $11 + 3;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                i3 = i2 + 95;
                cArr4[i3] = (char) (cArr[i3] + b2);
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
                    int i11 = $10 + i6;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i6] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[c2] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[c3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i6] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        c2 = '\f';
                        objA3 = o.d.d.a(825 - View.getDefaultSize(0, 0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -611683395, false, $$f((byte) ($$e & 43), b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        int i13 = $11 + 15;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            objA4 = o.d.d.a(Color.rgb(0, 0, 0) + 16777434, (char) TextUtils.indexOf("", "", 0), KeyEvent.getDeadChar(0, 0) + 11, 212688716, false, $$f((byte) 7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i15];
                        int i16 = $10 + 123;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                    } else if (hVar.f19928d == hVar.f19929e) {
                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                        int i18 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                        int i19 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[i18];
                        cArr4[hVar.f19926b + 1] = cArr2[i19];
                    } else {
                        int i20 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                        int i21 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                        cArr4[hVar.f19926b] = cArr2[i20];
                        i6 = 1;
                        cArr4[hVar.f19926b + 1] = cArr2[i21];
                    }
                    i6 = 1;
                }
                hVar.f19926b += 2;
                c3 = 3;
            }
        }
        int i22 = $10 + 3;
        $11 = i22 % 128;
        int i23 = i22 % 2;
        for (int i24 = 0; i24 < i2; i24++) {
            int i25 = $10 + 37;
            $11 = i25 % 128;
            int i26 = i25 % 2;
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void i() {
        f24292e = new char[]{51640, 64517, 64608, 64582, 51644, 51643, 64592, 64598, 64577, 64599, 64587, 64625, 64579, 64576, 64585, 64589, 51641, 64614, 64596, 64584, 64521, 64626, 64609, 64597, 64578, 51645, 64590, 51639, 64580, 64624, 51642, 64588, 64604, 51646, 64586, 64593};
        f24289b = (char) 51641;
    }

    static void init$0() {
        $$d = new byte[]{90, -4, -67, Ascii.NAK};
        $$e = 93;
    }

    @Override // o.eo.b
    protected final /* synthetic */ w b(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24291d + 23;
        f24290c = i3 % 128;
        if (i3 % 2 == 0) {
            e(aVar);
            throw null;
        }
        w wVarE = e(aVar);
        int i4 = f24291d + 117;
        f24290c = i4 % 128;
        if (i4 % 2 != 0) {
            return wVarE;
        }
        throw null;
    }

    @Override // o.eo.b
    public final /* synthetic */ long c() {
        int i2 = 2 % 2;
        int i3 = f24290c + 89;
        f24291d = i3 % 128;
        if (i3 % 2 == 0) {
            return super.c();
        }
        super.c();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void c(Context context, String str, final b.d<w> dVar) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f24290c + 115;
        f24291d = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            h((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20, "\n#\u0019\u000e\u0010\u001c\u001d\"\u001d\u0010\u001b\n\u000e\b\u000f\u000e\u0019\u0013\u000b\"", (byte) (74 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            h(KeyEvent.getDeadChar(0, 0) + 7, "\u0007\u000f\u000f\u0006\u0013\r㘥", (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 51), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (o.en.b.c().s()) {
            new o.am.b(context, new b.InterfaceC0330b() { // from class: o.eo.d.3
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static char f24294a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f24295b = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static char f24296d = 0;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static char f24297f = 0;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static int f24298g = 0;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static char f24299h = 0;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static int f24300i = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0014). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$c(short r5, int r6, short r7) {
                    /*
                        int r7 = r7 * 4
                        int r1 = r7 + 1
                        int r6 = r6 + 69
                        int r0 = r5 * 2
                        int r5 = r0 + 4
                        byte[] r4 = o.eo.d.AnonymousClass3.$$a
                        byte[] r3 = new byte[r1]
                        r2 = 0
                        if (r4 != 0) goto L27
                        r0 = r6
                        r6 = r7
                        r1 = r2
                    L14:
                        int r5 = r5 + 1
                        int r6 = r6 + r0
                    L17:
                        byte r0 = (byte) r6
                        r3[r1] = r0
                        if (r1 != r7) goto L22
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r3, r2)
                        return r0
                    L22:
                        int r1 = r1 + 1
                        r0 = r4[r5]
                        goto L14
                    L27:
                        r1 = r2
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eo.d.AnonymousClass3.$$c(short, int, short):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f24298g = 0;
                    f24300i = 1;
                    f24295b = -1270219506;
                    f24296d = (char) 6820;
                    f24294a = (char) 19202;
                    f24297f = (char) 19418;
                    f24299h = (char) 4407;
                }

                public static Object[] a(Context context2, int i5, int i6) {
                    if (context2 == null) {
                        Object[] objArr3 = {new int[1], new int[]{i5}, null, new int[]{i5}};
                        int iMyPid = Process.myPid();
                        int i7 = ~iMyPid;
                        int i8 = ~((-1) - (((-1) - (-719695265)) & ((-1) - i7)));
                        int i9 = 1808006937 + (((-1) - (((-1) - ((-1) - (((-1) - ((i8 + 679741440) - (i8 & 679741440))) & ((-1) - (~(41547242 | i7)))))) & ((-1) - (~((-1) - (((-1) - (-1593419)) & ((-1) - iMyPid))))))) * (-84));
                        int i10 = ~((iMyPid + 41547242) - (iMyPid & 41547242));
                        int i11 = (i10 + 719695264) - (i10 & 719695264);
                        int i12 = ~((-1) - (((-1) - i7) & ((-1) - (-41547243))));
                        int i13 = i6 + i9 + (((i11 + i12) - (i11 & i12)) * (-84)) + (((-1) - (((-1) - 1593418) & ((-1) - i12))) * 84);
                        int i14 = i13 ^ (i13 << 13);
                        int i15 = i14 ^ (i14 >>> 17);
                        ((int[]) objArr3[0])[0] = i15 ^ (i15 << 5);
                        return objArr3;
                    }
                    try {
                        Object[] objArr4 = new Object[1];
                        j(38 - View.getDefaultSize(0, 0), "ￓ\u0018\n\b\u001a\u0017\u000e\u0019\u001eￓ\u0006\u001a\u0019\rￓ\u001dￚￕￕￓ�ￚￕￕ\ufff5\u0017\u000e\u0013\b\u000e\u0015\u0006\u0011\u000f\u0006\u001b\u0006\u001d", false, 112 - (ViewConfiguration.getScrollBarSize() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34, objArr4);
                        Object[] objArr5 = (Object[]) Array.newInstance(Class.forName(((String) objArr4[0]).intern()), 2);
                        Object[] objArr6 = new Object[1];
                        k("ជࠤ⚃갢鮧⯵ዀܘ\uf413揨㟢늿ﺥ瀼\ue6ca㊮萭ⴖ⚃갢鮧⯵ዀܘ\uf413揨컱ᵿ個廙ﱛ\u0cdb", 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr6);
                        try {
                            Object[] objArr7 = {((String) objArr6[0]).intern()};
                            Object[] objArr8 = new Object[1];
                            j(Color.alpha(0) + 38, "ￓ\u0018\n\b\u001a\u0017\u000e\u0019\u001eￓ\u0006\u001a\u0019\rￓ\u001dￚￕￕￓ�ￚￕￕ\ufff5\u0017\u000e\u0013\b\u000e\u0015\u0006\u0011\u000f\u0006\u001b\u0006\u001d", false, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32, objArr8);
                            objArr5[0] = Class.forName(((String) objArr8[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr7);
                            float f2 = 0.0f;
                            Object[] objArr9 = new Object[1];
                            j((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31, "\ufff9￮ￗ\u000f\u0014\u001a\u001d\u000f\u0019￬￨\ufffaￗ\ufffe\u0000￨￮\u0012 \r\u0010\uffefￋ\u000f\u0014\u001a\u001d\u000f\u0019￬￨", true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 106, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16, objArr9);
                            try {
                                Object[] objArr10 = {((String) objArr9[0]).intern()};
                                Object[] objArr11 = new Object[1];
                                j(38 - ((Process.getThreadPriority(0) + 20) >> 6), "ￓ\u0018\n\b\u001a\u0017\u000e\u0019\u001eￓ\u0006\u001a\u0019\rￓ\u001dￚￕￕￓ�ￚￕￕ\ufff5\u0017\u000e\u0013\b\u000e\u0015\u0006\u0011\u000f\u0006\u001b\u0006\u001d", false, (ViewConfiguration.getEdgeSlop() >> 16) + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, Color.green(0) + 33, objArr11);
                                objArr5[1] = Class.forName(((String) objArr11[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr10);
                                try {
                                    Object[] objArr12 = new Object[1];
                                    j(22 - Process.getGidForName(""), "\u0000\u000f\t\n\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff\t￼\u000f\u0013", true, 122 - TextUtils.getOffsetAfter("", 0), 21 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr12);
                                    Class<?> cls = Class.forName(((String) objArr12[0]).intern());
                                    Object[] objArr13 = new Object[1];
                                    k("굏⦒\ud99b夬䛚큱J꿒굏⦒䒖顠瓮\u07bc굏⦒⸹⫴", 17 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr13);
                                    Object objInvoke = cls.getMethod(((String) objArr13[0]).intern(), null).invoke(context2, null);
                                    try {
                                        Object[] objArr14 = new Object[1];
                                        j((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23, "\u0000\u000f\t\n\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff\t￼\u000f\u0013", true, 122 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 20 - Process.getGidForName(""), objArr14);
                                        Class<?> cls2 = Class.forName(((String) objArr14[0]).intern());
                                        char c2 = '0';
                                        Object[] objArr15 = new Object[1];
                                        j((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, "\ufffe\n\u0002\u0004\u0002\u0011￭\ufffe\u0000\b\ufffe\u0004\u0002￫", false, 120 - Color.alpha(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 4, objArr15);
                                        try {
                                            Object[] objArr16 = {cls2.getMethod(((String) objArr15[0]).intern(), null).invoke(context2, null), 64};
                                            Object[] objArr17 = new Object[1];
                                            j((-16777183) - Color.rgb(0, 0, 0), "\r\u0007\u0002ￌ\u0001\r\f\u0012\u0003\f\u0012ￌ\u000e\u000bￌ￮\uffff\u0001\t\uffff\u0005\u0003￫\uffff\f\uffff\u0005\u0003\u0010\uffff\f\u0002\u0010", false, Color.green(0) + PanasonicMakernoteDirectory.TAG_BURST_SPEED, 29 - KeyEvent.keyCodeFromString(""), objArr17);
                                            Class<?> cls3 = Class.forName(((String) objArr17[0]).intern());
                                            Object[] objArr18 = new Object[1];
                                            k("굏⦒\ud99b夬䛚큱J꿒굏⦒伵ᴬ炊橌", (ViewConfiguration.getTapTimeout() >> 16) + 14, objArr18);
                                            Object objInvoke2 = cls3.getMethod(((String) objArr18[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr16);
                                            Object[] objArr19 = new Object[1];
                                            k("ꧥ闅\uf34a৩ୗ┍믦ﶍ⬣㌽騞퀴쎑্\udde7塜끐걫뎁뾛䛚큱J꿒굏⦒伵ᴬ炊橌", TextUtils.indexOf("", "") + 30, objArr19);
                                            Class<?> cls4 = Class.forName(((String) objArr19[0]).intern());
                                            Object[] objArr20 = new Object[1];
                                            j(ExpandableListView.getPackedPositionChild(0L) + 11, "\u0005\b\u0007\ufff4\u0001\ufffa￼\u0006\u0006\ufff8", true, 130 - ExpandableListView.getPackedPositionType(0L), (Process.myPid() >> 22) + 8, objArr20);
                                            Object[] objArr21 = (Object[]) cls4.getField(((String) objArr20[0]).intern()).get(objInvoke2);
                                            int length = objArr21.length;
                                            int i16 = 0;
                                            while (i16 < length) {
                                                Object obj = objArr21[i16];
                                                Object[] objArr22 = new Object[1];
                                                k("꼄⤶叅炔꼲嬵", (ViewConfiguration.getTapTimeout() >> 16) + 5, objArr22);
                                                try {
                                                    Object[] objArr23 = {((String) objArr22[0]).intern()};
                                                    Object[] objArr24 = new Object[1];
                                                    k("㊋靮䞴⎨⩍徢친⾾䁹\ud966ӗ否㏩\ude0eꡁ蓀䳯劼ꤲ튐媶ꀶ\ue94d䰸↲픥ﻐ빛䡂䢄뿟\u200e쑑毸Ꞔ༖\ue843뱴", 36 - TextUtils.indexOf("", c2, 0, 0), objArr24);
                                                    Class<?> cls5 = Class.forName(((String) objArr24[0]).intern());
                                                    Object[] objArr25 = new Object[1];
                                                    j(Color.red(0) + 11, "\u0007\f\r\ufffa\u0007￼\ufffe\u0000\ufffe\r￢", false, TextUtils.lastIndexOf("", c2, 0, 0) + 125, 7 - (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)), objArr25);
                                                    Object objInvoke3 = cls5.getMethod(((String) objArr25[0]).intern(), String.class).invoke(null, objArr23);
                                                    try {
                                                        Object[] objArr26 = new Object[1];
                                                        j((ViewConfiguration.getTapTimeout() >> 16) + 28, "\u000b\u0005\u0000ￊ\uffff\u000b\n\u0010\u0001\n\u0010ￊ\f\tￊ\uffef\u0005\u0003\n�\u0010\u0011\u000e\u0001�\n\u0000\u000e", false, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 121, 24 - Color.green(0), objArr26);
                                                        Class<?> cls6 = Class.forName(((String) objArr26[0]).intern());
                                                        Object[] objArr27 = new Object[1];
                                                        k("\uddf4떁थᢟ䡂䢄칌鴃歚﮶\ue843뱴", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, objArr27);
                                                        try {
                                                            Object[] objArr28 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr27[0]).intern(), null).invoke(obj, null))};
                                                            Object[] objArr29 = new Object[1];
                                                            k("㊋靮䞴⎨⩍徢친⾾䁹\ud966ӗ否㏩\ude0eꡁ蓀䳯劼ꤲ튐媶ꀶ\ue94d䰸↲픥ﻐ빛䡂䢄뿟\u200e쑑毸Ꞔ༖\ue843뱴", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 38, objArr29);
                                                            Class<?> cls7 = Class.forName(((String) objArr29[0]).intern());
                                                            Object[] objArr30 = new Object[1];
                                                            j((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19, "\uffff\u0002\r\u000b\ufffeￜ\ufffe\r\ufffa\u000b\ufffe\u0007\ufffe\u0000\ufffe\r\ufffa￼\u0002", true, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 125, 14 - TextUtils.getTrimmedLength(""), objArr30);
                                                            Object objInvoke4 = cls7.getMethod(((String) objArr30[0]).intern(), InputStream.class).invoke(objInvoke3, objArr28);
                                                            int length2 = objArr5.length;
                                                            int i17 = 0;
                                                            for (int i18 = 2; i17 < i18; i18 = 2) {
                                                                Object obj2 = objArr5[i17];
                                                                try {
                                                                    Object[] objArr31 = new Object[1];
                                                                    k("㊋靮䞴⎨⩍徢친⾾䁹\ud966ӗ否㏩\ude0eꡁ蓀䳯劼ސ㑜叅炔벧ﶶ媶ꀶ\ue94d䰸↲픥ﻐ빛䡂䢄", View.getDefaultSize(0, 0) + 34, objArr31);
                                                                    Class<?> cls8 = Class.forName(((String) objArr31[0]).intern());
                                                                    Object[] objArr32 = new Object[1];
                                                                    k("굏⦒類橱뫋\ue274\uf319⤗쑑毸λ흔읦댧㾳㌩슭焾䢭\u0bd9\ue5fb钟ꭡ覍", Drawable.resolveOpacity(0, 0) + 23, objArr32);
                                                                    if (obj2.equals(cls8.getMethod(((String) objArr32[0]).intern(), null).invoke(objInvoke4, null))) {
                                                                        Object[] objArr33 = {new int[]{i ^ (i << 5)}, new int[]{i5}, null, new int[]{i5 ^ 1}};
                                                                        int i19 = ~i5;
                                                                        int i20 = i6 + (-848533835) + ((~(((-371728458) + i19) - ((-371728458) & i19))) * (-783)) + (((-1) - (((-1) - (~((i19 - 373074250) - (i19 & (-373074250))))) & ((-1) - (-1051222272)))) * 783) + 16;
                                                                        int i21 = i20 ^ (i20 << 13);
                                                                        int i22 = i21 ^ (i21 >>> 17);
                                                                        return objArr33;
                                                                    }
                                                                    i17++;
                                                                } catch (Throwable th) {
                                                                    Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            i16++;
                                                            f2 = 0.0f;
                                                            c2 = '0';
                                                        } catch (Throwable th2) {
                                                            Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    } catch (Throwable th3) {
                                                        Throwable cause3 = th3.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th3;
                                                    }
                                                } catch (Throwable th4) {
                                                    Throwable cause4 = th4.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th4;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    } catch (Throwable th6) {
                                        Throwable cause6 = th6.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th6;
                                    }
                                } catch (Throwable th7) {
                                    Throwable cause7 = th7.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th7;
                                }
                            } catch (Throwable th8) {
                                Throwable cause8 = th8.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th8;
                            }
                        } catch (Throwable th9) {
                            Throwable cause9 = th9.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th9;
                        }
                    } catch (Throwable unused) {
                    }
                    Object[] objArr34 = {new int[]{i ^ (i << 5)}, new int[]{i5}, null, new int[]{i5}};
                    int i23 = i6 + (((1811944453 + (((-1) - (((-1) - (~((-924599841) | i5))) & ((-1) - 822886400))) * 1504)) + ((~(i5 | (-101713441))) * (-1504))) - 1804360784);
                    int i24 = i23 ^ (i23 << 13);
                    int i25 = i24 ^ (i24 >>> 17);
                    return objArr34;
                }

                static void init$0() {
                    $$a = new byte[]{123, MessagePack.Code.FLOAT32, 0, -17};
                    $$b = 124;
                }

                private static void j(int i5, String str2, boolean z2, int i6, int i7, Object[] objArr3) throws Throwable {
                    Object charArray;
                    String str3 = str2;
                    int i8 = 2 % 2;
                    if (str3 != null) {
                        int i9 = $11 + 65;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        charArray = str3.toCharArray();
                    } else {
                        charArray = str3;
                    }
                    char[] cArr = (char[]) charArray;
                    n nVar = new n();
                    char[] cArr2 = new char[i5];
                    nVar.f19944a = 0;
                    int i11 = $11 + 85;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    while (nVar.f19944a < i5) {
                        int i13 = $10 + 121;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        nVar.f19946e = cArr[nVar.f19944a];
                        cArr2[nVar.f19944a] = (char) (i6 + nVar.f19946e);
                        int i15 = nVar.f19944a;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr2[i15]), Integer.valueOf(f24295b)};
                            Object objA = o.d.d.a(1376241034);
                            if (objA == null) {
                                int iMakeMeasureSpec = 270 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 11;
                                byte b2 = $$a[2];
                                byte b3 = b2;
                                objA = o.d.d.a(iMakeMeasureSpec, threadPriority, offsetBefore, -2071844881, false, $$c(b3, (byte) ((b3 + 46) - (46 & b3)), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr2[i15] = ((Character) ((Method) objA).invoke(null, objArr4)).charValue();
                            Object[] objArr5 = {nVar, nVar};
                            Object objA2 = o.d.d.a(-202660535);
                            if (objA2 == null) {
                                int windowTouchSlop = 12 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                byte b4 = $$a[2];
                                byte b5 = b4;
                                objA2 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 522, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), windowTouchSlop, 627984172, false, $$c(b5, (byte) ((b5 + 44) - (44 & b5)), b4), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA2).invoke(null, objArr5);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    if (i7 > 0) {
                        int i16 = $11 + 91;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        nVar.f19945b = i7;
                        char[] cArr3 = new char[i5];
                        System.arraycopy(cArr2, 0, cArr3, 0, i5);
                        System.arraycopy(cArr3, 0, cArr2, i5 - nVar.f19945b, nVar.f19945b);
                        System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i5 - nVar.f19945b);
                    }
                    if (z2) {
                        char[] cArr4 = new char[i5];
                        nVar.f19944a = 0;
                        while (nVar.f19944a < i5) {
                            cArr4[nVar.f19944a] = cArr2[(i5 - nVar.f19944a) - 1];
                            Object[] objArr6 = {nVar, nVar};
                            Object objA3 = o.d.d.a(-202660535);
                            if (objA3 == null) {
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 522;
                                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                int iIndexOf = 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                byte b6 = $$a[2];
                                byte b7 = b6;
                                objA3 = o.d.d.a(iNormalizeMetaState, packedPositionGroup, iIndexOf, 627984172, false, $$c(b7, (byte) (44 | b7), b6), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA3).invoke(null, objArr6);
                        }
                        cArr2 = cArr4;
                    }
                    objArr3[0] = new String(cArr2);
                }

                private static void k(String str2, int i5, Object[] objArr3) throws Throwable {
                    Object obj;
                    String str3 = str2;
                    int i6 = 2;
                    int i7 = 2 % 2;
                    int i8 = $11 + 103;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    if (str3 != null) {
                        char[] charArray = str3.toCharArray();
                        int i10 = $11 + 65;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        obj = charArray;
                    } else {
                        obj = str3;
                    }
                    char[] cArr = (char[]) obj;
                    o.a.g gVar = new o.a.g();
                    char[] cArr2 = new char[cArr.length];
                    gVar.f19924d = 0;
                    char[] cArr3 = new char[2];
                    while (gVar.f19924d < cArr.length) {
                        cArr3[0] = cArr[gVar.f19924d];
                        cArr3[1] = cArr[gVar.f19924d + 1];
                        int i12 = 58224;
                        int i13 = 0;
                        while (i13 < 16) {
                            int i14 = $10 + 47;
                            $11 = i14 % 128;
                            int i15 = i14 % i6;
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            int i16 = (c3 + i12) ^ ((c3 << 4) + ((char) (((long) f24297f) ^ (-7511683281764982996L))));
                            int i17 = c3 >>> 5;
                            try {
                                Object[] objArr4 = new Object[4];
                                objArr4[3] = Integer.valueOf(f24299h);
                                objArr4[i6] = Integer.valueOf(i17);
                                objArr4[1] = Integer.valueOf(i16);
                                objArr4[0] = Integer.valueOf(c2);
                                Object objA = o.d.d.a(1603517628);
                                if (objA == null) {
                                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 270;
                                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 11;
                                    byte b2 = $$a[i6];
                                    byte b3 = b2;
                                    objA = o.d.d.a(longPressTimeout, fadingEdgeLength, windowTouchSlop, -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                }
                                char cCharValue = ((Character) ((Method) objA).invoke(null, objArr4)).charValue();
                                cArr3[1] = cCharValue;
                                Object[] objArr5 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i12) ^ ((cCharValue << 4) + ((char) (((long) f24296d) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f24294a)};
                                Object objA2 = o.d.d.a(1603517628);
                                if (objA2 == null) {
                                    int i18 = 271 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                    int maximumDrawingCacheSize = 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    byte b4 = $$a[2];
                                    byte b5 = b4;
                                    objA2 = o.d.d.a(i18, tapTimeout, maximumDrawingCacheSize, -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                }
                                cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr5)).charValue();
                                i12 -= 40503;
                                i13++;
                                i6 = 2;
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
                        Object[] objArr6 = {gVar, gVar};
                        Object objA3 = o.d.d.a(1390051551);
                        if (objA3 == null) {
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 270;
                            char c4 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 11;
                            i6 = 2;
                            byte b6 = $$a[2];
                            byte b7 = b6;
                            objA3 = o.d.d.a(absoluteGravity, c4, iIndexOf, -2074123590, false, $$c(b7, (byte) (b7 + 3), b6), new Class[]{Object.class, Object.class});
                        } else {
                            i6 = 2;
                        }
                        ((Method) objA3).invoke(null, objArr6);
                    }
                    objArr3[0] = new String(cArr2, 0, i5);
                }

                @Override // o.am.b.InterfaceC0330b
                public final void a(List<w> list) {
                    int i5 = 2 % 2;
                    d.this.d(list, Long.valueOf(new Date().getTime()));
                    dVar.c(list);
                    int i6 = f24298g + 105;
                    f24300i = i6 % 128;
                    if (i6 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // o.am.b.InterfaceC0330b
                public final void c(o.bg.c cVar) throws Throwable {
                    int i5 = 2 % 2;
                    int i6 = f24298g + 115;
                    f24300i = i6 % 128;
                    int i7 = i6 % 2;
                    if (o.ea.f.a()) {
                        Object[] objArr3 = new Object[1];
                        j(TextUtils.getTrimmedLength("") + 20, "\u0002\n\u0002\u000b\u0011\ufff1\f\b\u0002\u000b￡\ufffe\u0011\ufffe￠\ufffe\u000f\u0001￢\t", false, 120 - (ViewConfiguration.getScrollBarSize() >> 8), 5 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
                        String strIntern2 = ((String) objArr3[0]).intern();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr4 = new Object[1];
                        j(47 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0010\u0013\u0014\uffe7\u0010\u0013\ufff1\u0016\u0014\t\uffe7\u0002\n\r\u0016\u0013\u0006\uffc1ￎ\uffc1\u0013\u0006\u0007\u0013\u0006\u0014\t\uffc1ￎ\uffc1\u0010\u000f￨\u0006\u0015\ufff5\u0010\f\u0006\u000f\ufff3\u0006\u0012\u0016\u0006\u0014\u0015", false, 117 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 20, objArr4);
                        o.ea.f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(cVar.a()).toString());
                        int i8 = f24300i + 15;
                        f24298g = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    dVar.a(o.by.c.b(cVar));
                }
            }, o.en.b.c()).c(str);
            int i5 = f24291d + 83;
            f24290c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
                return;
            }
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr3 = new Object[1];
        h(5 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0016\u001b㙳㙳\u0011\u001f", (byte) (126 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        h((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, "\u0016\u001b㗹㗹\u0011\u001f\u0007\u0001\r\u0007\u0010\u0004\u001f\u0005\n\u0007㗷㗷\"\u0007\u001a\u0012\u0002\u0004\u0004\u0010\u0007\u0010\u0005! #\u0007\u0004\u0007\u000f\u0018\f!\u0007\u000e\u0007", (byte) (3 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr4);
        throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
    }

    @Override // o.eo.b
    public final /* synthetic */ List<w> d() {
        int i2 = 2 % 2;
        int i3 = f24291d + 79;
        f24290c = i3 % 128;
        int i4 = i3 % 2;
        List<w> listD = super.d();
        int i5 = f24291d + 75;
        f24290c = i5 % 128;
        if (i5 % 2 != 0) {
            return listD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eo.b
    protected final /* synthetic */ o.ef.a e(w wVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24291d + 71;
        f24290c = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarB = b(wVar);
        int i5 = f24290c + 111;
        f24291d = i5 % 128;
        if (i5 % 2 == 0) {
            return aVarB;
        }
        throw null;
    }

    @Override // o.eo.b
    public final /* bridge */ /* synthetic */ void e() {
        int i2 = 2 % 2;
        int i3 = f24290c + 45;
        f24291d = i3 % 128;
        int i4 = i3 % 2;
        super.e();
        if (i4 != 0) {
            int i5 = 51 / 0;
        }
    }
}
