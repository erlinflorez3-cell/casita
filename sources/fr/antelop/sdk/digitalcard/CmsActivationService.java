package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.List;
import o.a.l;
import o.a.n;
import o.by.c;
import o.d.d;
import o.er.r;
import o.m.h;
import o.x.f;
import o.y.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class CmsActivationService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f19059a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f19060b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f19061c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f19062d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f19063e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f19064f = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f19065j = 0;
    private final r innerCmsActivationService;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r9, short r10, int r11) {
        /*
            byte[] r8 = fr.antelop.sdk.digitalcard.CmsActivationService.$$c
            int r0 = r10 * 2
            int r7 = r0 + 1
            int r6 = r9 + 4
            int r0 = r11 + 71
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r8 != 0) goto L26
            r3 = r6
            r0 = r7
            r2 = r4
        L12:
            int r6 = r6 + r0
            r1 = r2
        L14:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r5[r1] = r0
            int r3 = r3 + 1
            if (r2 != r7) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L23:
            r0 = r8[r3]
            goto L12
        L26:
            r1 = r4
            r3 = r6
            r6 = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.CmsActivationService.$$e(int, short, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f19064f = 1105885806;
        init$0();
        f19062d = 0;
        f19065j = 1;
        f19061c = 0;
        f19059a = 1;
        b();
        f19063e = 3670460449349752573L;
        int i2 = f19062d + 97;
        f19065j = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
    }

    public CmsActivationService(r rVar) {
        this.innerCmsActivationService = rVar;
    }

    static void b() {
        f19060b = new int[]{-358243118, -177815192, -1201432754, -1658367035, -2067099415, 938846806, -264645676, -144423578, -1277472531, 209743483, -579936603, -1082114376, -1445259691, 1508736241, 278461583, 2021717270, -963611157, 2049885417};
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] c(android.content.Context r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.CmsActivationService.c(android.content.Context, int, int, int):java.lang.Object[]");
    }

    private static void g(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f19060b;
        long j2 = 0;
        int i5 = 989264422;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 9;
                $11 = i8 % 128;
                if (i8 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objA = d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) (-1);
                            byte b3 = (byte) (b2 + 1);
                            objA = d.a(675 - (ViewConfiguration.getScrollBarSize() >> 8), (char) TextUtils.getOffsetBefore("", 0), 11 - ExpandableListView.getPackedPositionChild(j2), -328001469, false, $$e(b2, b3, (byte) ((b3 + 50) - (b3 & 50))), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objA2 = d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objA2 = d.a(TextUtils.lastIndexOf("", '0') + 676, (char) View.resolveSize(0, 0), 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -328001469, false, $$e(b4, b5, (byte) (50 | b5)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i3 = 2;
                j2 = 0;
                i5 = 989264422;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f19060b;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = $10 + 3;
            $11 = i9 % 128;
            int i10 = 2;
            int i11 = i9 % 2;
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $11 + 91;
                $10 = i13 % 128;
                int i14 = i13 % i10;
                Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                Object objA3 = d.a(989264422);
                if (objA3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objA3 = d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 674, (char) (TextUtils.lastIndexOf("", '0', i6, i6) + 1), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, -328001469, false, $$e(b6, b7, (byte) (50 | b7)), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                i12++;
                i6 = 0;
                i10 = 2;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i6, iArr4, i6, length2);
        lVar.f19941d = i6;
        while (lVar.f19941d < iArr.length) {
            int i15 = $10 + 27;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                int i19 = $10 + 59;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    lVar.f19942e ^= iArr4[i17];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = d.a(2098218801);
                    if (objA4 == null) {
                        byte b8 = (byte) (-1);
                        byte b9 = (byte) (b8 + 1);
                        objA4 = d.a(301 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (Color.argb(0, 0, 0, 0) + 52697), 11 - TextUtils.indexOf("", "", 0), -1416256172, false, $$e(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 48)))), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i17 += 71;
                } else {
                    lVar.f19942e ^= iArr4[i17];
                    Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA5 = d.a(2098218801);
                    if (objA5 == null) {
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) (b10 + 1);
                        objA5 = d.a(349 - AndroidCharacter.getMirror('0'), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 52698), 11 - (ViewConfiguration.getEdgeSlop() >> 16), -1416256172, false, $$e(b10, b11, (byte) ((b11 + 48) - (48 & b11))), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i17++;
                }
            }
            int i20 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i20;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i21 = lVar.f19942e;
            int i22 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr7 = {lVar, lVar};
            Object objA6 = d.a(986820978);
            if (objA6 == null) {
                byte b12 = (byte) (-1);
                byte b13 = (byte) (b12 + 1);
                objA6 = d.a(View.MeasureSpec.getSize(0) + 229, (char) (51004 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) + 9, -330018025, false, $$e(b12, b13, (byte) (46 | b13)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r8, short r9, byte r10, java.lang.Object[] r11) {
        /*
            int r0 = r9 * 2
            int r7 = 3 - r0
            byte[] r6 = fr.antelop.sdk.digitalcard.CmsActivationService.$$a
            int r1 = r10 * 4
            int r0 = 1 - r1
            int r5 = r8 + 97
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r6 != 0) goto L2b
            r1 = r2
            r0 = r3
        L15:
            int r5 = r5 + r1
            r1 = r0
        L17:
            byte r0 = (byte) r5
            int r7 = r7 + 1
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r2) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L28:
            r1 = r6[r7]
            goto L15
        L2b:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.CmsActivationService.h(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(java.lang.String r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.CmsActivationService.i(java.lang.String, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{Ascii.CR, MessagePack.Code.FALSE, -97, -84};
        $$b = 252;
    }

    static void init$1() {
        $$c = new byte[]{Ascii.SUB, -20, MessagePack.Code.NIL, 88};
        $$d = 19;
    }

    public final void activate(Context context, SecurePinInput securePinInput, final OperationCallback<Boolean> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        final b bVarD = this.innerCmsActivationService.d();
        bVarD.d(context, securePinInput, new f() { // from class: fr.antelop.sdk.digitalcard.CmsActivationService.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static final int $$f = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f19066a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f19067c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f19068d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f19069e = 0;

            private static String $$g(byte b2, int i3, short s2) {
                int i4 = b2 + 4;
                int i5 = 115 - (i3 * 2);
                byte[] bArr = $$c;
                int i6 = s2 * 3;
                byte[] bArr2 = new byte[1 - i6];
                int i7 = 0 - i6;
                int i8 = -1;
                if (bArr == null) {
                    i5 = i4 + i7;
                    i4 = i4;
                }
                while (true) {
                    i8++;
                    int i9 = i4 + 1;
                    bArr2[i8] = (byte) i5;
                    if (i8 == i7) {
                        return new String(bArr2, 0);
                    }
                    i5 = bArr[i9] + i5;
                    i4 = i9;
                }
            }

            static {
                init$2();
                $10 = 0;
                $11 = 1;
                init$1();
                f19066a = 255009603;
                init$0();
                f19069e = 0;
                f19068d = 1;
                f19067c = -1270219358;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:5:0x0011). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void b(short r7, int r8, int r9, java.lang.Object[] r10) {
                /*
                    int r0 = 101 - r7
                    int r2 = r8 + 4
                    byte[] r8 = fr.antelop.sdk.digitalcard.CmsActivationService.AnonymousClass1.$$a
                    int r7 = r9 * 3
                    int r1 = r7 + 1
                    byte[] r6 = new byte[r1]
                    r5 = 0
                    if (r8 != 0) goto L29
                    r4 = r7
                    r3 = r5
                L11:
                    int r0 = -r0
                    int r0 = r0 + r4
                L13:
                    byte r1 = (byte) r0
                    r6[r3] = r1
                    if (r3 != r7) goto L20
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r6, r5)
                    r10[r5] = r0
                    return
                L20:
                    int r3 = r3 + 1
                    int r2 = r2 + 1
                    r1 = r8[r2]
                    r4 = r0
                    r0 = r1
                    goto L11
                L29:
                    r3 = r5
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.CmsActivationService.AnonymousClass1.b(short, int, int, java.lang.Object[]):void");
            }

            private static void f(int i3, int i4, int i5, boolean z2, String str, Object[] objArr) throws Throwable {
                Object charArray;
                String str2 = str;
                int i6 = 2 % 2;
                int i7 = $10;
                int i8 = i7 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 91 / 0;
                    if (str2 != null) {
                        int i10 = i7 + 115;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        charArray = str2.toCharArray();
                    } else {
                        charArray = str2;
                    }
                } else {
                    if (str2 != null) {
                        int i102 = i7 + 115;
                        $11 = i102 % 128;
                        int i112 = i102 % 2;
                        charArray = str2.toCharArray();
                    }
                    charArray = str2;
                }
                char[] cArr = (char[]) charArray;
                n nVar = new n();
                char[] cArr2 = new char[i3];
                nVar.f19944a = 0;
                while (nVar.f19944a < i3) {
                    nVar.f19946e = cArr[nVar.f19944a];
                    cArr2[nVar.f19944a] = (char) (i4 + nVar.f19946e);
                    int i12 = nVar.f19944a;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i12]), Integer.valueOf(f19067c)};
                        Object objA = d.a(1376241034);
                        if (objA == null) {
                            byte b2 = (byte) (-1);
                            byte b3 = (byte) (b2 + 1);
                            objA = d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 269, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (KeyEvent.getMaxKeyCode() >> 16) + 11, -2071844881, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {nVar, nVar};
                        Object objA2 = d.a(-202660535);
                        if (objA2 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (-b4);
                            objA2 = d.a(521 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12, 627984172, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
                if (i5 > 0) {
                    int i13 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    nVar.f19945b = i5;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    System.arraycopy(cArr3, 0, cArr2, i3 - nVar.f19945b, nVar.f19945b);
                    System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i3 - nVar.f19945b);
                    int i15 = $11 + 81;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    nVar.f19944a = 0;
                    while (nVar.f19944a < i3) {
                        cArr4[nVar.f19944a] = cArr2[(i3 - nVar.f19944a) - 1];
                        Object[] objArr4 = {nVar, nVar};
                        Object objA3 = d.a(-202660535);
                        if (objA3 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (-b6);
                            objA3 = d.a(523 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, 627984172, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0016). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void g(int r9, int r10, byte r11, java.lang.Object[] r12) {
                /*
                    int r0 = r11 * 43
                    int r8 = r0 + 4
                    int r0 = r9 * 43
                    int r7 = r0 + 1
                    byte[] r6 = fr.antelop.sdk.digitalcard.CmsActivationService.AnonymousClass1.$$d
                    int r0 = r10 * 4
                    int r5 = 102 - r0
                    byte[] r4 = new byte[r7]
                    r3 = 0
                    if (r6 != 0) goto L2e
                    r5 = r7
                    r1 = r8
                    r2 = r3
                L16:
                    int r5 = r5 + r8
                    int r8 = r1 + 1
                    r1 = r2
                L1a:
                    int r2 = r1 + 1
                    byte r0 = (byte) r5
                    r4[r1] = r0
                    if (r2 != r7) goto L29
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    r12[r3] = r0
                    return
                L29:
                    r0 = r6[r8]
                    r1 = r8
                    r8 = r0
                    goto L16
                L2e:
                    r1 = r3
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.CmsActivationService.AnonymousClass1.g(int, int, byte, java.lang.Object[]):void");
            }

            static void init$0() {
                $$a = new byte[]{47, MessagePack.Code.BIN8, Ascii.FS, 43};
                $$b = 151;
            }

            static void init$1() {
                $$d = new byte[]{54, MessagePack.Code.BIN8, MessagePack.Code.UINT64, -16, Ascii.FF, -68, 51, Ascii.CR, 6, -15, 7, 3, 1, -66, 69, -15, 7, MessagePack.Code.TRUE, 54, 5, -2, 2, Ascii.VT, -19, Ascii.VT, -9, -2, 17, -14, MessagePack.Code.FLOAT32, 37, Ascii.DC2, -2, Ascii.DC2, -3, -13, -17, Ascii.ESC, -4, -6, 9, -28, 19, Ascii.SO, 2, -8, -8};
                $$e = 51;
            }

            static void init$2() {
                $$c = new byte[]{91, 84, -6, Ascii.ETB};
                $$f = 55;
            }

            public void abortPrompt() {
                int i3 = 2 % 2;
                int i4 = f19068d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f19069e = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // o.x.f
            public void onAuthenticationDeclined() {
                int i3 = 2 % 2;
                int i4 = f19068d + 105;
                f19069e = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 0;
                }
            }

            @Override // o.x.f
            public void onCustomerCredentialsInvalid(o.j.b bVar) {
                int i3 = 2 % 2;
                int i4 = f19068d + 105;
                f19069e = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.x.f
            public void onCustomerCredentialsRequired(List<h> list) {
                int i3 = 2 % 2;
                operationCallback.onError(new c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
                int i4 = f19069e + 73;
                f19068d = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x00fb  */
            @Override // o.x.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onError(o.by.c r30) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 2086
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.CmsActivationService.AnonymousClass1.onError(o.by.c):void");
            }

            @Override // o.x.f
            public void onProcessStart() {
                int i3 = 2 % 2;
                int i4 = f19069e + 29;
                f19068d = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // o.x.f
            public void onProcessSuccess() {
                int i3 = 2 % 2;
                int i4 = f19068d + 105;
                f19069e = i4 % 128;
                int i5 = i4 % 2;
                OperationCallback operationCallback2 = operationCallback;
                Object[] objArr = {bVarD};
                int i6 = (int) Runtime.getRuntime().totalMemory();
                int i7 = b.f27029n * 411550838;
                b.f27029n = i7;
                operationCallback2.onSuccess(Boolean.valueOf(((Boolean) b.c((int) SystemClock.elapsedRealtime(), objArr, -2067062937, i7, 2067062937, (int) SystemClock.uptimeMillis(), i6)).booleanValue()));
                int i8 = f19068d + 35;
                f19069e = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        int i3 = f19059a + 21;
        f19061c = i3 % 128;
        int i4 = i3 % 2;
    }

    public final SecureCmsActivation getSecureCmsActivation() {
        int i2 = 2 % 2;
        SecureCmsActivation secureCmsActivation = new SecureCmsActivation(this.innerCmsActivationService.d());
        int i3 = f19059a + 99;
        f19061c = i3 % 128;
        if (i3 % 2 == 0) {
            return secureCmsActivation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DigitalCardServiceStatus getStatus() {
        int i2 = 2 % 2;
        int i3 = f19061c + 71;
        f19059a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.innerCmsActivationService.c();
            throw null;
        }
        if (this.innerCmsActivationService.c()) {
            int i4 = f19061c + 5;
            f19059a = i4 % 128;
            if (i4 % 2 != 0) {
                return DigitalCardServiceStatus.Active;
            }
            DigitalCardServiceStatus digitalCardServiceStatus = DigitalCardServiceStatus.Active;
            obj.hashCode();
            throw null;
        }
        DigitalCardServiceStatus digitalCardServiceStatus2 = DigitalCardServiceStatus.Disabled;
        int i5 = f19059a + 75;
        f19061c = i5 % 128;
        if (i5 % 2 == 0) {
            return digitalCardServiceStatus2;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean isPinCodeRequired() {
        int i2 = 2 % 2;
        int i3 = f19061c + 85;
        f19059a = i3 % 128;
        int i4 = i3 % 2;
        boolean zB = this.innerCmsActivationService.b();
        int i5 = f19059a + 33;
        f19061c = i5 % 128;
        int i6 = i5 % 2;
        return zB;
    }
}
