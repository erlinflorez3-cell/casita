package o.y;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.Random;
import o.as.e;

/* JADX INFO: loaded from: classes6.dex */
abstract class e extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char[] f27131k = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f27132n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char f27133o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f27134p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f27135q = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f27136t = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f27137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final o.ep.i f27138m;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r7, byte r8, byte r9) {
        /*
            int r9 = 111 - r9
            int r0 = r8 * 3
            int r8 = 3 - r0
            int r0 = r7 * 4
            int r7 = r0 + 1
            byte[] r6 = o.y.e.$$d
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L2c
            r0 = r9
            r3 = r4
            r2 = r8
        L14:
            int r0 = -r0
            int r8 = r8 + r0
            r1 = r3
            r9 = r8
            r8 = r2
        L19:
            int r3 = r1 + 1
            byte r0 = (byte) r9
            r5[r1] = r0
            if (r3 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            int r2 = r8 + 1
            r0 = r6[r2]
            r8 = r9
            goto L14
        L2c:
            r1 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.e.$$j(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27134p = 0;
        f27135q = 1;
        f27132n = 0;
        f27136t = 1;
        m();
        ExpandableListView.getPackedPositionGroup(0L);
        Color.argb(0, 0, 0, 0);
        int i2 = f27135q + 125;
        f27134p = i2 % 128;
        int i3 = i2 % 2;
    }

    e(String str, o.ep.d dVar, boolean z2, o.ep.i iVar) {
        super(str, dVar);
        this.f27137l = z2;
        this.f27138m = iVar;
    }

    private static void B(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        int i5 = $10 + 41;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f27131k;
        int i7 = 421932776;
        int i8 = 1;
        if (cArr2 != null) {
            int i9 = $11 + 67;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                    Object objA = o.d.d.a(i7);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 270, (char) TextUtils.getTrimmedLength(""), Color.red(0) + 11, -811348851, false, $$j(b3, b4, (byte) (9 | b4)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i11++;
                    i7 = 421932776;
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
        Object[] objArr3 = {Integer.valueOf(f27133o)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = '0';
        char c3 = '\b';
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(269 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 11, -811348851, false, $$j(b5, b6, (byte) (9 | b6)), new Class[]{Integer.TYPE});
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
                hVar.f19925a = cArr[hVar.f19926b + i8];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i8] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[c3] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i8] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 824;
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iIndexOf = TextUtils.indexOf("", c2, 0) + 12;
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a(i12, scrollBarFadeDuration, iIndexOf, -611683395, false, $$j(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        int i13 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            c3 = '\b';
                            objA4 = o.d.d.a(218 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 212688716, false, $$j(b9, b10, (byte) (b10 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c3 = '\b';
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i15];
                    } else {
                        c3 = '\b';
                        if (hVar.f19928d == hVar.f19929e) {
                            int i16 = $10 + 19;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
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
                            i8 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i21];
                        }
                    }
                    i8 = 1;
                }
                hVar.f19926b += 2;
                c2 = '0';
            }
        }
        int i22 = 0;
        while (i22 < i2) {
            int i23 = $11 + 105;
            $10 = i23 % 128;
            if (i23 % 2 != 0) {
                cArr4[i22] = (char) (cArr4[i22] ^ 22013);
                i22 += 17;
            } else {
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
                i22++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static /* synthetic */ void a(e eVar) {
        int i2 = 2 % 2;
        int i3 = f27132n + 15;
        f27136t = i3 % 128;
        int i4 = i3 % 2;
        eVar.e();
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f27132n + 83;
        f27136t = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ o.x.f b(e eVar) {
        int i2 = 2 % 2;
        int i3 = f27132n + 69;
        f27136t = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = eVar.i();
        int i5 = f27132n + 61;
        f27136t = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return fVarI;
    }

    static /* synthetic */ o.x.f c(e eVar) {
        int i2 = 2 % 2;
        int i3 = f27136t + 61;
        f27132n = i3 % 128;
        if (i3 % 2 != 0) {
            eVar.i();
            throw null;
        }
        o.x.f fVarI = eVar.i();
        int i4 = f27136t + 117;
        f27132n = i4 % 128;
        int i5 = i4 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f d(e eVar) {
        int i2 = 2 % 2;
        int i3 = f27136t + 101;
        f27132n = i3 % 128;
        if (i3 % 2 != 0) {
            eVar.i();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.x.f fVarI = eVar.i();
        int i4 = f27132n + 73;
        f27136t = i4 % 128;
        int i5 = i4 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f e(e eVar) {
        int i2 = 2 % 2;
        int i3 = f27136t + 53;
        f27132n = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = eVar.i();
        int i5 = f27132n + 9;
        f27136t = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return fVarI;
    }

    static /* synthetic */ o.x.f g(e eVar) {
        int i2 = 2 % 2;
        int i3 = f27132n + 69;
        f27136t = i3 % 128;
        if (i3 % 2 != 0) {
            return eVar.i();
        }
        eVar.i();
        throw null;
    }

    static void init$0() {
        $$d = new byte[]{38, Ascii.CAN, 67, -113};
        $$e = 48;
    }

    static void m() {
        f27131k = new char[]{64612, 64606, 64583, 64620, 64607, 64598, 64608, 64590, 64588, 64629, 64578, 64582, 64597, 64517, 64586, 64599, 64577, 64604, 64589, 64602, 64605, 64595, 64593, 64576, 64584, 64610, 64609, 64630, 64603, 64580, 64592, 64611, 64625, 64587, 64616, 64581};
        f27133o = (char) 51641;
    }

    @Override // o.y.c
    final void a_() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27136t;
        int i4 = i3 + 57;
        f27132n = i4 % 128;
        int i5 = i4 % 2;
        if (this.f27137l) {
            int i6 = i3 + 59;
            f27132n = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr = new Object[1];
        B(22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0002\u0014\u000b\u0013\"#\u001b#\u001c\u000b\u0012\u001d\u0015#\u0015\u001c\u0015\u0011\u0014\t\u0011\u001d", (byte) (Color.alpha(0) + 68), objArr);
        String strIntern = ((String) objArr[0]).intern();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        B(11 - (ViewConfiguration.getTapTimeout() >> 16), "\u001e\u0014\u0013\u0011\u0002\u0014\u000b\u0013\u001f\u000f㘽", (byte) (TextUtils.getOffsetAfter("", 0) + 67), objArr2);
        StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern());
        Object[] objArr3 = {this.f27138m};
        int iNextInt = new Random().nextInt(829335317);
        int i7 = o.ep.i.f24595m * 1091325868;
        o.ep.i.f24595m = i7;
        StringBuilder sbAppend2 = sbAppend.append((String) o.ep.i.d((int) Runtime.getRuntime().freeMemory(), -2118374406, iNextInt, Thread.currentThread().getPriority(), i7, objArr3, 2118374413));
        Object[] objArr4 = new Object[1];
        B(29 - Color.blue(0), "\u001f\u0011\u0011\u000f\u001d\u000b\u000f\u001f\u0010\u0014\u0011\u0001\u0000\u0012\r\u000f\u0010\u0015\f\u0019\u001b#\u001c\u000b\u0012\u001d\u0015#㘤", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 55), objArr4);
        throw new WalletValidationException(walletValidationErrorCode, strIntern, sbAppend2.append(((String) objArr4[0]).intern()).toString());
    }

    @Override // o.x.i
    public final void c(Context context, o.en.b bVar, o.i.d dVar) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f27136t + 5;
            f27132n = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            B(26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\t\u0003#\u0015\f\u0003\u0003\u0000\u0002\u0014\u000b\u0013\"#\u001b#\u001c\u000b\u0015\u000b\u0010\u000f\u0011\u001d㘢㘢", (byte) (57 - ExpandableListView.getPackedPositionGroup(0L)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            B(9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\f!\u0003\u000f\u0010\u000f\u0011\u001d㘹㘹", (byte) (80 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f27132n + 107;
            f27136t = i5 % 128;
            int i6 = i5 % 2;
        }
        new o.as.e(context, new e.a() { // from class: o.y.e.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static char f27139a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static char f27140c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static char f27141d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static char f27142e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f27143f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static int f27144g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static int f27145h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f27146i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f27147j = 0;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static int f27148k = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(byte r9, byte r10, short r11) {
                /*
                    byte[] r8 = o.y.e.AnonymousClass2.$$a
                    int r7 = 115 - r11
                    int r0 = r10 * 2
                    int r6 = r0 + 1
                    int r0 = r9 * 2
                    int r5 = r0 + 4
                    byte[] r4 = new byte[r6]
                    r3 = 0
                    if (r8 != 0) goto L2b
                    r2 = r7
                    r1 = r3
                    r0 = r5
                L14:
                    int r5 = r5 + r2
                    int r0 = r0 + 1
                    r7 = r5
                    r5 = r0
                L19:
                    byte r0 = (byte) r7
                    r4[r1] = r0
                    int r1 = r1 + 1
                    if (r1 != r6) goto L26
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L26:
                    r2 = r8[r5]
                    r0 = r5
                    r5 = r7
                    goto L14
                L2b:
                    r1 = r3
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.e.AnonymousClass2.$$c(byte, byte, short):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f27148k = -1038045692;
                f27145h = 1525357626;
                f27144g = -57274572;
                f27147j = 0;
                f27146i = 1;
                f27140c = (char) 47416;
                f27142e = (char) 53725;
                f27139a = (char) 27474;
                f27141d = (char) 46420;
                f27143f = -1270219386;
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(Unknown Source)
                	at java.base/java.util.TreeMap.lastKey(Unknown Source)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] d(android.content.Context r25, int r26, int r27) {
                /*
                    Method dump skipped, instruction units count: 1416
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.e.AnonymousClass2.d(android.content.Context, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{117, -10, 112, 71};
                $$b = 77;
            }

            private static void l(String str, int i7, Object[] objArr3) throws Throwable {
                Object charArray;
                String str2 = str;
                int i8 = 2 % 2;
                if (str2 != null) {
                    int i9 = $11 + 5;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    charArray = str2.toCharArray();
                } else {
                    charArray = str2;
                }
                char[] cArr = (char[]) charArray;
                o.a.g gVar = new o.a.g();
                char[] cArr2 = new char[cArr.length];
                gVar.f19924d = 0;
                char[] cArr3 = new char[2];
                while (gVar.f19924d < cArr.length) {
                    int i11 = $10 + 23;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3[0] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d + 1];
                    int i13 = 58224;
                    for (int i14 = 0; i14 < 16; i14++) {
                        int i15 = $10 + 27;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        char c2 = cArr3[1];
                        char c3 = cArr3[0];
                        try {
                            Object[] objArr4 = {Integer.valueOf(c2), Integer.valueOf((c3 + i13) ^ ((c3 << 4) + ((char) (((long) f27139a) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f27141d)};
                            Object objA = o.d.d.a(1603517628);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a(269 - ExpandableListView.getPackedPositionChild(0L), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -1995022631, false, $$c(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 46)))), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objA).invoke(null, objArr4)).charValue();
                            cArr3[1] = cCharValue;
                            Object[] objArr5 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i13) ^ ((cCharValue << 4) + ((char) (((long) f27140c) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f27142e)};
                            Object objA2 = o.d.d.a(1603517628);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = o.d.d.a(269 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.myPid() >> 22) + 11, -1995022631, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 46)))), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr5)).charValue();
                            i13 -= 40503;
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
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(Color.rgb(0, 0, 0) + 16777486, (char) (ViewConfiguration.getLongPressTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, -2074123590, false, $$c(b6, b7, (byte) ((b7 + 43) - (43 & b7))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr6);
                }
                String str3 = new String(cArr2, 0, i7);
                int i17 = $11 + 51;
                $10 = i17 % 128;
                if (i17 % 2 == 0) {
                    objArr3[0] = str3;
                } else {
                    int i18 = 41 / 0;
                    objArr3[0] = str3;
                }
            }

            private static void m(int i7, String str, boolean z2, int i8, int i9, Object[] objArr3) throws Throwable {
                String str2 = str;
                int i10 = 2 % 2;
                int i11 = $11 + 13;
                $10 = i11 % 128;
                Object charArray = str2;
                if (i11 % 2 != 0) {
                    throw null;
                }
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                o.a.n nVar = new o.a.n();
                char[] cArr2 = new char[i7];
                nVar.f19944a = 0;
                while (nVar.f19944a < i7) {
                    nVar.f19946e = cArr[nVar.f19944a];
                    cArr2[nVar.f19944a] = (char) (i8 + nVar.f19946e);
                    int i12 = nVar.f19944a;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr2[i12]), Integer.valueOf(f27143f)};
                        Object objA = o.d.d.a(1376241034);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(270 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getScrollBarSize() >> 8) + 11, -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i12] = ((Character) ((Method) objA).invoke(null, objArr4)).charValue();
                        Object[] objArr5 = {nVar, nVar};
                        Object objA2 = o.d.d.a(-202660535);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 523, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13, 627984172, false, $$c(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr5);
                        int i13 = $10 + 69;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                if (i9 > 0) {
                    int i15 = $11 + 99;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    nVar.f19945b = i9;
                    char[] cArr3 = new char[i7];
                    System.arraycopy(cArr2, 0, cArr3, 0, i7);
                    System.arraycopy(cArr3, 0, cArr2, i7 - nVar.f19945b, nVar.f19945b);
                    System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i7 - nVar.f19945b);
                }
                if (z2) {
                    char[] cArr4 = new char[i7];
                    nVar.f19944a = 0;
                    while (nVar.f19944a < i7) {
                        int i17 = $11 + 109;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            cArr4[nVar.f19944a] = cArr2[i7 / nVar.f19944a];
                            Object[] objArr6 = {nVar, nVar};
                            Object objA3 = o.d.d.a(-202660535);
                            if (objA3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objA3 = o.d.d.a(522 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 627984172, false, $$c(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA3).invoke(null, objArr6);
                        } else {
                            cArr4[nVar.f19944a] = cArr2[(i7 - nVar.f19944a) - 1];
                            Object[] objArr7 = {nVar, nVar};
                            Object objA4 = o.d.d.a(-202660535);
                            if (objA4 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objA4 = o.d.d.a(Color.blue(0) + 522, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 11 - TextUtils.lastIndexOf("", '0', 0, 0), 627984172, false, $$c(b8, b9, (byte) (b9 + 2)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA4).invoke(null, objArr7);
                        }
                    }
                    cArr2 = cArr4;
                }
                objArr3[0] = new String(cArr2);
            }

            @Override // o.as.e.a
            public final void e() throws Throwable {
                int i7 = 2 % 2;
                int i8 = f27146i + 25;
                f27147j = i8 % 128;
                Object obj = null;
                if (i8 % 2 != 0) {
                    o.ea.f.a();
                    obj.hashCode();
                    throw null;
                }
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    l("⸮큰\ue77c낞？얤짍䊰ᓪ컳̣굖ᓆ翢染̶ﮤ\u0ee1ஜ㓍絯䌌ꅶҒ\ua8cbꔵ", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    l("ᬐﻠ\u2fe1Ữ絯䌌ꅶҒ\ua8cbꔵ儖ሇ丕\uf296ᓆ翢染̶ﮤ\u0ee1띄愁톱祉\ue7deⓘ\uf783䚄废砪ꅶҒ\ua8cbꔵ", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 34, objArr4);
                    o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
                }
                if (e.c(e.this) != null) {
                    int i9 = f27147j + 7;
                    f27146i = i9 % 128;
                    if (i9 % 2 == 0) {
                        e.d(e.this).onProcessSuccess();
                        obj.hashCode();
                        throw null;
                    }
                    e.d(e.this).onProcessSuccess();
                }
                int i10 = f27147j + 49;
                f27146i = i10 % 128;
                if (i10 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            @Override // o.as.e.a
            public final void e(o.bg.c cVar) throws Throwable {
                int i7 = 2 % 2;
                o.by.c cVarB = o.by.c.b(cVar);
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    l("⸮큰\ue77c낞？얤짍䊰ᓪ컳̣굖ᓆ翢染̶ﮤ\u0ee1ஜ㓍絯䌌ꅶҒ\ua8cbꔵ", 25 - ExpandableListView.getPackedPositionChild(0L), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr4 = new Object[1];
                    m(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 38, "\u000f\t\u0012\u0017￪\u0005\r\u0010\u0019\u0016\tￄ\uffd1ￄ\u0016\u0019\u0012\ufff4\u0016\u0013\u0007\t\u0017\u0017ￄ\uffd1ￄ\u0013\u0012\ufff1\u0005\u0012\u0005\u000b\t\ufff8\u0013", false, (ViewConfiguration.getPressedStateDuration() >> 16) + 249, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, objArr4);
                    o.ea.f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(cVarB.toString()).toString());
                }
                if (e.e(e.this) != null) {
                    int i8 = f27146i + 113;
                    f27147j = i8 % 128;
                    Object obj = null;
                    if (i8 % 2 != 0) {
                        cVar.c();
                        o.bg.a aVar = o.bg.a.az;
                        throw null;
                    }
                    if (cVar.c() != o.bg.a.az) {
                        e.g(e.this).onError(o.by.c.b(cVar));
                        return;
                    }
                    e.a(e.this);
                    e.b(e.this).onAuthenticationDeclined();
                    int i9 = f27147j + 43;
                    f27146i = i9 % 128;
                    if (i9 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        }, bVar).b(dVar, g(), n(), ((c) this).f27088r, this.f27138m);
    }

    protected final o.ep.i l() {
        int i2 = 2 % 2;
        int i3 = f27136t;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f27132n = i4 % 128;
        int i5 = i4 % 2;
        o.ep.i iVar = this.f27138m;
        int i6 = i3 + 123;
        f27132n = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 84 / 0;
        }
        return iVar;
    }

    public abstract e.c n();
}
