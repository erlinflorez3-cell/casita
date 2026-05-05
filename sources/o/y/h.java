package o.y;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.ap.c;
import o.ap.f;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f27166k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f27167m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f27168o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static char[] f27169q = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static char f27170t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static int f27171u = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f27172w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static int f27173x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f27174y = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f27175l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    c.C0331c f27176n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f27177p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f27178s;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r7, int r8, int r9) {
        /*
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r0 = r8 * 2
            int r6 = r0 + 4
            int r5 = r9 + 102
            byte[] r4 = o.y.h.$$d
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L27
            r0 = r7
            r1 = r2
        L13:
            int r0 = -r0
            int r5 = r5 + r0
            int r6 = r6 + 1
        L17:
            byte r0 = (byte) r5
            r3[r1] = r0
            if (r1 != r7) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L22:
            int r1 = r1 + 1
            r0 = r4[r6]
            goto L13
        L27:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.h.$$j(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27167m = 423527664;
        f27168o = 141900459;
        f27166k = 1248395192;
        f27171u = 0;
        f27173x = 1;
        f27174y = 0;
        f27172w = 1;
        o();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        View.MeasureSpec.getSize(0);
        int i2 = f27173x + 25;
        f27171u = i2 % 128;
        int i3 = i2 % 2;
    }

    public h(String str, o.ep.d dVar, boolean z2, String str2) {
        super(str, dVar);
        this.f27175l = z2;
        this.f27177p = str2;
    }

    private static void B(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = $11 + 113;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f27169q;
        int i8 = 421932776;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 71;
                $11 = i10 % 128;
                int i11 = i10 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = o.d.d.a(i8);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(269 - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 11, -811348851, false, $$j(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i4 = 2;
                    i8 = 421932776;
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
        Object[] objArr3 = {Integer.valueOf(f27170t)};
        Object objA2 = o.d.d.a(421932776);
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(269 - TextUtils.lastIndexOf("", '0'), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 11, -811348851, false, $$j(b5, b6, b6), new Class[]{Integer.TYPE});
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
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = {hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar};
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 825, (char) Drawable.resolveOpacity(0, 0), Drawable.resolveOpacity(0, 0) + 11, -611683395, false, $$j(b7, b8, (byte) ((-1) - (((-1) - b8) & ((-1) - 9)))), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objA4 = o.d.d.a(218 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16), 11 - View.getDefaultSize(0, 0), 212688716, false, $$j(b9, b10, (byte) ((-1) - (((-1) - b10) & ((-1) - 7)))), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
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
                        cArr4[hVar.f19926b + 1] = cArr2[i16];
                    }
                }
                hVar.f19926b += 2;
            }
        }
        for (int i17 = 0; i17 < i2; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        String str3 = new String(cArr4);
        int i18 = $10 + 113;
        $11 = i18 % 128;
        int i19 = i18 % 2;
        objArr[0] = str3;
    }

    static /* synthetic */ o.x.f a(h hVar) {
        int i2 = 2 % 2;
        int i3 = f27172w + 9;
        f27174y = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = hVar.i();
        int i5 = f27172w + 125;
        f27174y = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f b(h hVar) {
        int i2 = 2 % 2;
        int i3 = f27174y + 65;
        f27172w = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = hVar.i();
        int i5 = f27172w + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f27174y = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return fVarI;
    }

    static /* synthetic */ void c(h hVar) {
        int i2 = 2 % 2;
        int i3 = f27174y + 19;
        f27172w = i3 % 128;
        int i4 = i3 % 2;
        hVar.e();
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f27174y + 69;
        f27172w = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ o.x.f d(h hVar) {
        int i2 = 2 % 2;
        int i3 = f27174y + 55;
        f27172w = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = hVar.i();
        int i5 = f27172w + 23;
        f27174y = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    public static /* synthetic */ Object e(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = ~i3;
        int i11 = (-1) - (((-1) - (~(((i8 + i9) - (i8 & i9)) | i10))) & ((-1) - (~(i5 | i6))));
        int i12 = ~((i3 + i6) - (i3 & i6));
        int i13 = i11 | i12;
        int i14 = ~(i8 | i6);
        int i15 = ~((i9 + i10) - (i9 & i10));
        int i16 = (-1) - (((-1) - i12) & ((-1) - ((i8 + i15) - (i8 & i15))));
        int i17 = i5 + i6 + i7 + (1349231875 * i2) + (1735201104 * i4);
        int i18 = i17 * i17;
        int i19 = ((-413510627) * i5) + 1558183936 + (237349861 * i6) + (i13 * 325430244) + (325430244 * i14) + ((-325430244) * i16) + ((-88080384) * i7) + ((-1337982976) * i2) + (469762048 * i4) + (1272971264 * i18);
        int i20 = ((i5 * 236314795) - 374860141) + (i6 * 236313123) + (i13 * (-836)) + (i14 * (-836)) + (i16 * 836) + (i7 * 236313959) + (i2 * (-66979019)) + (i4 * (-1872492752)) + (i18 * (-417333248));
        if (i19 + (i20 * i20 * 639631360) == 1) {
            int i21 = 2 % 2;
            int i22 = f27174y + 7;
            f27172w = i22 % 128;
            int i23 = i22 % 2;
            Object[] objArr2 = new Object[1];
            B(30 - KeyEvent.normalizeMetaState(0), "\u0010\u001d!\u000f\u0002\"\u001e\u0018\u0000\"!\u0014\u001e\u0013-\u0002-\u0002%\u001f*\u0018\"%\u0010! \f\u0004\u0000", (byte) (36 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            int i24 = f27172w + 105;
            f27174y = i24 % 128;
            int i25 = i24 % 2;
            return strIntern;
        }
        h hVar = (h) objArr[0];
        int i26 = 2 % 2;
        int i27 = f27174y + 41;
        int i28 = i27 % 128;
        f27172w = i28;
        int i29 = i27 % 2;
        if (hVar.f27175l) {
            int i30 = i28 + 91;
            f27174y = i30 % 128;
            int i31 = i30 % 2;
            return null;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr3 = new Object[1];
        B(View.combineMeasuredStates(0, 0) + 30, "\u0010\u001d!\u000f\u0002\"\u001e\u0018\u0000\"!\u0014\u001e\u0013-\u0002-\u0002%\u001f*\u0018\"%\u0010! \f\u0004\u0000", (byte) (ExpandableListView.getPackedPositionType(0L) + 36), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        StringBuilder sb = new StringBuilder();
        Object[] objArr4 = new Object[1];
        B(TextUtils.lastIndexOf("", '0', 0) + 18, "\u0002\u0017\u001f\u0017\u0017\u0001\t\u0006\t\u0019\u0003\u001c\u001b\u0002\u001f\u0015㙴", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 122), objArr4);
        StringBuilder sbAppend = sb.append(((String) objArr4[0]).intern()).append(((c) hVar).f27088r.b());
        Object[] objArr5 = new Object[1];
        B(Color.red(0) + 42, "\u0003\u001a\u001f\u0000\u001f\"\u001f\u0003\u0004\n\u001a\u001f\u001a\u0005-\u0005\u0004\r\u001a-\u001a(\u0011\u0017\n\u0004\u0019\n\n-\u001f,\u001b\u0003\"%\u0010! \f\u0004\u0000", (byte) (108 - View.combineMeasuredStates(0, 0)), objArr5);
        throw new WalletValidationException(walletValidationErrorCode, strIntern2, sbAppend.append(((String) objArr5[0]).intern()).toString());
    }

    static /* synthetic */ o.x.f e(h hVar) {
        int i2 = 2 % 2;
        int i3 = f27174y + 15;
        f27172w = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = hVar.i();
        int i5 = f27172w + 45;
        f27174y = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f h(h hVar) {
        int i2 = 2 % 2;
        int i3 = f27174y + 25;
        f27172w = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = hVar.i();
        int i5 = f27172w + 121;
        f27174y = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return fVarI;
    }

    static void init$0() {
        $$d = new byte[]{92, 54, -72, -111};
        $$e = 132;
    }

    static void o() {
        f27169q = new char[]{64585, 65466, 64588, 64586, 64584, 64581, 64599, 64541, 65461, 65465, 64533, 64593, 64521, 64578, 64532, 64630, 64589, 65469, 64620, 64592, 64535, 64631, 64609, 64580, 64517, 64583, 64624, 65470, 64577, 64582, 64576, 64614, 65462, 64598, 64629, 64594, 65471, 65468, 64590, 64520, 64605, 64596, 65463, 64579, 64625, 64587, 65467, 64597, 65464};
        f27170t = (char) 51640;
    }

    @Override // o.y.c
    final void a_() throws Throwable {
        int iNextInt = new Random().nextInt(1020990174);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = f27166k * 1953956506;
        f27166k = i2;
        e(i2, new Object[]{this}, iNextInt, Thread.currentThread().getPriority(), 57247023, -57247023, iElapsedRealtime);
    }

    @Override // o.x.i
    public final String c() {
        int i2 = 913010208 * f27168o;
        f27168o = i2;
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int i4 = f27167m * 1344460749;
        f27167m = i4;
        return (String) e(i4, new Object[]{this}, i2, (int) Runtime.getRuntime().maxMemory(), 509846136, -509846135, i3);
    }

    @Override // o.x.i
    public final void c(Context context, o.en.b bVar, o.i.d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27174y;
        int i4 = i3 + 5;
        f27172w = i4 % 128;
        int i5 = i4 % 2;
        if (context != null) {
            new o.ap.f(context, new f.a<c.C0331c>() { // from class: o.y.h.5
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static long f27179a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f27180b = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f27181e = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0016). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$c(byte r10, int r11, int r12) {
                    /*
                        byte[] r9 = o.y.h.AnonymousClass5.$$a
                        int r0 = r10 * 2
                        int r8 = r0 + 1
                        int r0 = r12 * 7
                        int r7 = 114 - r0
                        int r0 = r11 * 2
                        int r6 = 3 - r0
                        byte[] r5 = new byte[r8]
                        r4 = 0
                        if (r9 != 0) goto L2e
                        r0 = r8
                        r3 = r6
                        r2 = r4
                    L16:
                        int r0 = -r0
                        int r6 = r6 + r0
                        r1 = r2
                        r7 = r6
                        r6 = r3
                    L1b:
                        int r2 = r1 + 1
                        byte r0 = (byte) r7
                        r5[r1] = r0
                        if (r2 != r8) goto L28
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r5, r4)
                        return r0
                    L28:
                        int r3 = r6 + 1
                        r0 = r9[r3]
                        r6 = r7
                        goto L16
                    L2e:
                        r1 = r4
                        goto L1b
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.y.h.AnonymousClass5.$$c(byte, int, int):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f27180b = 0;
                    f27181e = 1;
                    f27179a = 9156586534006937562L;
                }

                private void a(c.C0331c c0331c) throws Throwable {
                    String strIntern;
                    Object obj;
                    int i6 = 2 % 2;
                    if (o.ea.f.a()) {
                        int i7 = f27181e + 65;
                        f27180b = i7 % 128;
                        if (i7 % 2 != 0) {
                            Object[] objArr = new Object[1];
                            c("㧈〫␉쎲㦁痥꼧ጷ⼺汘薬⒱ᒽ䋹鰬㸖稡륬\ueaa0\ud7a6掩꿧섊\ue933䤺虯\udf99芧뺻ﳣ㘝鐽ꐜ퍤ಢ궷趦짙ᬬ䜣\uf33d\u206e熺墦\ud8a7\u16f9䠙爠츧൨ꚬ\u0ba1㞻", View.combineMeasuredStates(1, 0), objArr);
                            strIntern = ((String) objArr[0]).intern();
                            Object[] objArr2 = new Object[1];
                            c("홀셥垒꠹혯蒫\udc82碬삳鴭\uf611伸גּ뎡\uef81喬閣䠦餷밪谳", KeyEvent.getDeadChar(0, 0), objArr2);
                            obj = objArr2[0];
                        } else {
                            Object[] objArr3 = new Object[1];
                            c("㧈〫␉쎲㦁痥꼧ጷ⼺汘薬⒱ᒽ䋹鰬㸖稡륬\ueaa0\ud7a6掩꿧섊\ue933䤺虯\udf99芧뺻ﳣ㘝鐽ꐜ퍤ಢ궷趦짙ᬬ䜣\uf33d\u206e熺墦\ud8a7\u16f9䠙爠츧൨ꚬ\u0ba1㞻", View.combineMeasuredStates(0, 0), objArr3);
                            strIntern = ((String) objArr3[0]).intern();
                            Object[] objArr4 = new Object[1];
                            c("홀셥垒꠹혯蒫\udc82碬삳鴭\uf611伸גּ뎡\uef81喬閣䠦餷밪谳", KeyEvent.getDeadChar(0, 0), objArr4);
                            obj = objArr4[0];
                        }
                        o.ea.f.c(strIntern, ((String) obj).intern());
                        int i8 = f27181e + 85;
                        f27180b = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    h.this.f27176n = c0331c;
                    if (h.e(h.this) != null) {
                        h.d(h.this).onProcessSuccess();
                    }
                }

                private static void c(String str, int i6, Object[] objArr) throws Throwable {
                    Object charArray;
                    String str2 = str;
                    int i7 = 2 % 2;
                    if (str2 != null) {
                        int i8 = $11 + 93;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            str2.toCharArray();
                            throw null;
                        }
                        charArray = str2.toCharArray();
                    } else {
                        charArray = str2;
                    }
                    o.a.k kVar = new o.a.k();
                    char[] cArrC = o.a.k.c(f27179a ^ (-5882309809461882246L), (char[]) charArray, i6);
                    kVar.f19939c = 4;
                    int i9 = $11 + 11;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    while (kVar.f19939c < cArrC.length) {
                        kVar.f19938a = kVar.f19939c - 4;
                        int i11 = kVar.f19939c;
                        try {
                            Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f27179a)};
                            Object objA = o.d.d.a(-1093976004);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a(View.MeasureSpec.getSize(0) + 229, (char) (51005 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 9 - TextUtils.getCapsMode("", 0, 0), 1749983833, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                            }
                            cArrC[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            Object[] objArr3 = {kVar, kVar};
                            Object objA2 = o.d.d.a(-912105096);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = o.d.d.a(675 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (Color.rgb(0, 0, 0) + 16777216), 12 - TextUtils.getTrimmedLength(""), 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                    objArr[0] = new String(cArrC, 4, cArrC.length - 4);
                }

                static void init$0() {
                    $$a = new byte[]{Base64.padSymbol, -67, -29, 104};
                    $$b = 221;
                }

                @Override // o.ap.f.a
                public final void a(o.bg.c cVar) throws Throwable {
                    int i6 = 2 % 2;
                    if (o.ea.f.a()) {
                        int i7 = f27181e + 27;
                        f27180b = i7 % 128;
                        int i8 = i7 % 2;
                        Object[] objArr = new Object[1];
                        c("㧈〫␉쎲㦁痥꼧ጷ⼺汘薬⒱ᒽ䋹鰬㸖稡륬\ueaa0\ud7a6掩꿧섊\ue933䤺虯\udf99芧뺻ﳣ㘝鐽ꐜ퍤ಢ궷趦짙ᬬ䜣\uf33d\u206e熺墦\ud8a7\u16f9䠙爠츧൨ꚬ\u0ba1㞻", View.MeasureSpec.getMode(0), objArr);
                        String strIntern = ((String) objArr[0]).intern();
                        Object[] objArr2 = new Object[1];
                        c("ꔫң巧ꃌꕄ䅭훷灙돘士ﱤ䟍衙癧\ue5e1嵍\ue6c2路鍒듞ｎ", ViewConfiguration.getDoubleTapTimeout() >> 16, objArr2);
                        o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                    }
                    o.by.c cVarB = o.by.c.b(cVar);
                    if (h.a(h.this) != null) {
                        int i9 = f27180b + 77;
                        f27181e = i9 % 128;
                        if (i9 % 2 == 0) {
                            cVar.c();
                            o.bg.a aVar = o.bg.a.az;
                            throw null;
                        }
                        if (cVar.c() != o.bg.a.az) {
                            h.h(h.this).onError(cVarB);
                        } else {
                            h.c(h.this);
                            h.b(h.this).onAuthenticationDeclined();
                        }
                    }
                }

                @Override // o.ap.f.a
                public final /* synthetic */ void b(c.C0331c c0331c) throws Throwable {
                    int i6 = 2 % 2;
                    int i7 = f27180b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f27181e = i7 % 128;
                    int i8 = i7 % 2;
                    a(c0331c);
                    int i9 = f27181e + 47;
                    f27180b = i9 % 128;
                    if (i9 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, bVar, new o.ap.c(new c.d(this.f27177p, this.f27178s))).b(dVar, g(), ((c) this).f27088r.b());
            int i6 = f27172w + 61;
            f27174y = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 51 / 0;
                return;
            }
            return;
        }
        int i8 = i3 + 113;
        f27172w = i8 % 128;
        if (i8 % 2 == 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            B((ViewConfiguration.getTapTimeout() >> 16) + 49, "\u0011.,\u001f\u0001\u0014\u001f\u001e\u0014\u0005\u001d\u0017\u0006\t\u0004\t\u0015\u0002\u001e\u0018\u0000\"!\u0014\u001e\u0013-\u0002-\u0002%\u001f*\u0018\"%\u0010! \f\u0004\u0000)\r\u0001\u001f\u001f\"㘏", (byte) (38 - (KeyEvent.getMaxKeyCode() >> 16)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            B(33 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0005\u00140\u001f\u0000\u0004\u001e\u001f㗮㗮\u0019&\u0016\u001f\n\u0003\t '\f\u001f\u0003\u000e\u0005\u0005\u0007\u0019\u0018\u0018\u0004\u0004\r", (byte) (5 - ExpandableListView.getPackedPositionGroup(0L)), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (i() != null) {
            i().onError(new o.by.c(AntelopErrorCode.InternalError));
        }
    }

    public final void c(String str) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f27172w + 33;
        int i4 = i3 % 128;
        f27174y = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            int i5 = i4 + 65;
            f27172w = i5 % 128;
            int i6 = i5 % 2;
            if (str.length() >= 0) {
                int i7 = f27172w + 37;
                f27174y = i7 % 128;
                if (i7 % 2 == 0) {
                }
            }
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            B((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8, "\u0017\u001c\f\u0012\u00030\u001b\u0005㙠", (byte) (106 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            B(42 - View.resolveSize(0, 0), "\u0000\u001a \t\u0014\u0005/\u0018\u0000\u0001\u0003\u001a\u0005\u0012 \f\u0019\u001a\u001f\u0017\u0017 \u0007'㘘㘘\u0003\u001f\u0011\u001f\u0018,\u001f\u0015\u000f\u000e\n\u0015\u0001\u00040\n", (byte) (TextUtils.indexOf("", "", 0) + 25), objArr2);
            throw new WalletValidationException(walletValidationErrorCode, strIntern, ((String) objArr2[0]).intern());
        }
        this.f27178s = str;
    }

    public final void d(Context context, o.x.f fVar) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f27174y + 117;
        f27172w = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            int i4 = f27174y + 85;
            f27172w = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            B(49 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0011.,\u001f\u0001\u0014\u001f\u001e\u0014\u0005\u001d\u0017\u0006\t\u0004\t\u0015\u0002\u001e\u0018\u0000\"!\u0014\u001e\u0013-\u0002-\u0002%\u001f*\u0018\"%\u0010! \f\u0004\u0000)\r\u0001\u001f\u001f\"㘏", (byte) (TextUtils.lastIndexOf("", '0', 0) + 39), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            B(13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0002\u0015\u0011/\u001e\u000f!\u0014\u0015\u0004\u0001\u001e", (byte) (View.combineMeasuredStates(0, 0) + 97), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        b(context, fVar);
    }

    public final c.C0331c l() {
        int i2 = 2 % 2;
        int i3 = f27172w + 61;
        int i4 = i3 % 128;
        f27174y = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        c.C0331c c0331c = this.f27176n;
        int i5 = i4 + 53;
        f27172w = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return c0331c;
    }
}
