package com.incode.welcome_sdk.ui.camera.id_validation.base;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.c.a.e.e;
import com.c.a.l;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.lang.reflect.Method;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class ValidationState extends Enum<ValidationState> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static final ValidationState A;
    public static final ValidationState B;
    public static final ValidationState C;
    public static final ValidationState D;
    public static final ValidationState E;
    public static final ValidationState F;
    public static final ValidationState G;
    public static final ValidationState H;
    public static final ValidationState I;
    public static final ValidationState J;
    public static final ValidationState K;
    public static final ValidationState L;
    public static final ValidationState M;
    public static final ValidationState N;
    public static final ValidationState O;
    public static final ValidationState P;
    public static final ValidationState Q;
    public static final ValidationState R;
    public static final ValidationState S;
    public static final ValidationState T;
    public static final ValidationState U;
    public static final ValidationState V;
    public static final ValidationState W;
    public static final ValidationState X;
    public static final ValidationState Y;
    public static final ValidationState Z;

    /* JADX INFO: renamed from: a */
    public static final ValidationState f11841a;
    public static final ValidationState aa;
    public static final ValidationState ab;
    public static final ValidationState ac;
    private static int ad = 0;
    private static ValidationState ae = null;
    private static final /* synthetic */ ValidationState[] af;
    private static ValidationState ag = null;
    private static int ah = 0;
    private static int ai = 0;
    private static int aj = 0;
    private static int ak = 0;
    private static byte[] al = null;
    private static short[] am = null;
    private static int aq = 0;
    private static int ar = 0;

    /* JADX INFO: renamed from: b */
    public static final ValidationState f11842b;

    /* JADX INFO: renamed from: c */
    public static final ValidationState f11843c;

    /* JADX INFO: renamed from: d */
    public static final ValidationState f11844d;

    /* JADX INFO: renamed from: e */
    public static final ValidationState f11845e;

    /* JADX INFO: renamed from: f */
    public static final ValidationState f11846f;

    /* JADX INFO: renamed from: g */
    public static final ValidationState f11847g;

    /* JADX INFO: renamed from: h */
    public static final ValidationState f11848h;

    /* JADX INFO: renamed from: i */
    public static final ValidationState f11849i;

    /* JADX INFO: renamed from: j */
    public static final ValidationState f11850j;

    /* JADX INFO: renamed from: k */
    public static final ValidationState f11851k;

    /* JADX INFO: renamed from: l */
    public static final ValidationState f11852l;

    /* JADX INFO: renamed from: m */
    public static final ValidationState f11853m;

    /* JADX INFO: renamed from: n */
    public static final ValidationState f11854n;

    /* JADX INFO: renamed from: o */
    public static final ValidationState f11855o;

    /* JADX INFO: renamed from: p */
    public static final ValidationState f11856p;

    /* JADX INFO: renamed from: q */
    public static final ValidationState f11857q;

    /* JADX INFO: renamed from: r */
    public static final ValidationState f11858r;

    /* JADX INFO: renamed from: s */
    public static final ValidationState f11859s;

    /* JADX INFO: renamed from: t */
    public static final ValidationState f11860t;

    /* JADX INFO: renamed from: u */
    public static final ValidationState f11861u;

    /* JADX INFO: renamed from: v */
    public static final ValidationState f11862v;

    /* JADX INFO: renamed from: w */
    public static final ValidationState f11863w;

    /* JADX INFO: renamed from: x */
    public static final ValidationState f11864x;

    /* JADX INFO: renamed from: y */
    public static final ValidationState f11865y;

    /* JADX INFO: renamed from: z */
    public static final ValidationState f11866z;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r6, byte r7, short r8) {
        /*
            int r0 = r7 + 4
            int r7 = r6 + 65
            int r2 = r8 * 3
            int r1 = 1 - r2
            byte[] r6 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState.$$a
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L28
            r2 = r0
            r1 = r4
        L13:
            int r0 = -r0
            int r7 = r7 + r0
            r0 = r2
        L16:
            byte r2 = (byte) r7
            r5[r1] = r2
            int r2 = r0 + 1
            if (r1 != r3) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L23:
            r0 = r6[r2]
            int r1 = r1 + 1
            goto L13
        L28:
            r1 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState.$$c(byte, byte, short):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{84, 120, MessagePack.Code.STR16, -81};
        $$b = 109;
    }

    private ValidationState(String str, int i2) {
        super(str, i2);
    }

    public static ValidationState valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = aj + 41;
        ai = i3 % 128;
        int i4 = i3 % 2;
        ValidationState validationState = (ValidationState) Enum.valueOf(ValidationState.class, str);
        int i5 = ai + 33;
        aj = i5 % 128;
        if (i5 % 2 != 0) {
            return validationState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ValidationState[] values() {
        int i2 = 2 % 2;
        int i3 = aj + 55;
        ai = i3 % 128;
        int i4 = i3 % 2;
        ValidationState[] validationStateArr = (ValidationState[]) af.clone();
        int i5 = aj + 105;
        ai = i5 % 128;
        int i6 = i5 % 2;
        return validationStateArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ar = 0;
        aq = 1;
        ai = 0;
        aj = 1;
        e();
        ValidationState validationState = new ValidationState("SCAN_ID_FRONT", 0);
        f11842b = validationState;
        ValidationState validationState2 = new ValidationState("ID_FRONT_DETECTED", 1);
        f11841a = validationState2;
        ValidationState validationState3 = new ValidationState("PASSPORT_DETECTED", 2);
        f11845e = validationState3;
        ValidationState validationState4 = new ValidationState("ID_FRONT_VALIDATION_IN_PROGRESS", 3);
        f11844d = validationState4;
        ValidationState validationState5 = new ValidationState("ID_FRONT_VALIDATION_COMPLETED", 4);
        f11843c = validationState5;
        ValidationState validationState6 = new ValidationState("ID_FRONT_VALIDATION_TOTAL_FAILURE", 5);
        f11850j = validationState6;
        ValidationState validationState7 = new ValidationState("ID_FRONT_NO_FACES_FOUND", 6);
        f11847g = validationState7;
        ValidationState validationState8 = new ValidationState("ID_FRONT_VALIDATION_ERROR", 7);
        f11849i = validationState8;
        ValidationState validationState9 = new ValidationState("ID_FRONT_CLASSIFICATION_ERROR", 8);
        f11848h = validationState9;
        ValidationState validationState10 = new ValidationState("ID_FRONT_SHARPNESS_ERROR", 9);
        f11846f = validationState10;
        ValidationState validationState11 = new ValidationState("ID_FRONT_GLARE_ERROR", 10);
        f11853m = validationState11;
        ValidationState validationState12 = new ValidationState("ID_FRONT_SHADOW_ERROR", 11);
        f11852l = validationState12;
        ValidationState validationState13 = new ValidationState("ID_PROCESSING_TOO_DARK", 12);
        f11854n = validationState13;
        ae = new ValidationState("ID_PROCESSING_NOT_CLASSIFIED", 13);
        ValidationState validationState14 = new ValidationState("ID_PROCESSING_TOO_SMALL_ID_DETECTED", 14);
        f11855o = validationState14;
        ValidationState validationState15 = new ValidationState("ID_PROCESSING_TOO_LARGE_ID_DETECTED", 15);
        f11851k = validationState15;
        ValidationState validationState16 = new ValidationState("ID_PROCESSING_BLURRED", 16);
        f11858r = validationState16;
        ValidationState validationState17 = new ValidationState("ID_PROCESSING_GLARE_DETECTED", 17);
        f11860t = validationState17;
        ValidationState validationState18 = new ValidationState("ID_PROCESSING_CLASSIFICATION_OK", 18);
        f11859s = validationState18;
        ValidationState validationState19 = new ValidationState("ID_FRONT_WRONG_SIDE", 19);
        f11856p = validationState19;
        ValidationState validationState20 = new ValidationState("ID_BACK_WRONG_SIDE", 20);
        f11857q = validationState20;
        Object[] objArr = new Object[1];
        an((ViewConfiguration.getDoubleTapTimeout() >> 16) - 2131092262, (byte) (ImageFormat.getBitsPerPixel(0) + 1), (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (-1314831258) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-33) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        ValidationState validationState21 = new ValidationState(((String) objArr[0]).intern(), 21);
        f11862v = validationState21;
        ValidationState validationState22 = new ValidationState("ID_FRONT_READABILITY_ERROR", 22);
        f11864x = validationState22;
        ValidationState validationState23 = new ValidationState("ID_BACK_READABILITY_ERROR", 23);
        f11861u = validationState23;
        ValidationState validationState24 = new ValidationState("SCAN_ID_BACK", 24);
        f11863w = validationState24;
        ValidationState validationState25 = new ValidationState("ID_FRONT_BACK_ID_DETECTED", 25);
        f11865y = validationState25;
        ValidationState validationState26 = new ValidationState("ID_BACK_FRONT_ID_DETECTED", 26);
        D = validationState26;
        ValidationState validationState27 = new ValidationState("ID_BACK_DETECTED", 27);
        C = validationState27;
        ValidationState validationState28 = new ValidationState("ID_BACK_VALIDATION_IN_PROGRESS", 28);
        B = validationState28;
        ValidationState validationState29 = new ValidationState("ID_BACK_VALIDATION_COMPLETED", 29);
        f11866z = validationState29;
        ValidationState validationState30 = new ValidationState("ID_BACK_VALIDATION_TOTAL_FAILURE", 30);
        A = validationState30;
        ValidationState validationState31 = new ValidationState("ID_BACK_VALIDATION_ERROR", 31);
        E = validationState31;
        ValidationState validationState32 = new ValidationState("ID_BACK_CLASSIFICATION_ERROR", 32);
        I = validationState32;
        ValidationState validationState33 = new ValidationState("ID_BACK_SHARPNESS_ERROR", 33);
        G = validationState33;
        ValidationState validationState34 = new ValidationState("ID_BACK_GLARE_ERROR", 34);
        H = validationState34;
        ValidationState validationState35 = new ValidationState("ID_BACK_SHADOW_ERROR", 35);
        F = validationState35;
        ValidationState validationState36 = new ValidationState("SCAN_DOCUMENT", 36);
        L = validationState36;
        ValidationState validationState37 = new ValidationState("DOCUMENT_VALIDATION_IN_PROGRESS", 37);
        N = validationState37;
        ValidationState validationState38 = new ValidationState("DOCUMENT_VALIDATION_COMPLETED", 38);
        M = validationState38;
        ValidationState validationState39 = new ValidationState("DOCUMENT_VALIDATION_ERROR", 39);
        K = validationState39;
        ValidationState validationState40 = new ValidationState("DOCUMENT_VALIDATION_TOTAL_FAILURE", 40);
        J = validationState40;
        ValidationState validationState41 = new ValidationState("DETECTION_EMPTY", 41);
        O = validationState41;
        ValidationState validationState42 = new ValidationState("PREVIOUS", 42);
        S = validationState42;
        ValidationState validationState43 = new ValidationState("SCAN_PASSPORT", 43);
        Q = validationState43;
        ValidationState validationState44 = new ValidationState("PASSPORT_VALIDATION_IN_PROGRESS", 44);
        R = validationState44;
        ValidationState validationState45 = new ValidationState("PASSPORT_VALIDATION_COMPLETED", 45);
        P = validationState45;
        ValidationState validationState46 = new ValidationState("PASSPORT_VALIDATION_ERROR", 46);
        X = validationState46;
        ValidationState validationState47 = new ValidationState("PASSPORT_VALIDATION_TOTAL_FAILURE", 47);
        V = validationState47;
        ValidationState validationState48 = new ValidationState("PASSPORT_CLASSIFICATION_ERROR", 48);
        W = validationState48;
        ValidationState validationState49 = new ValidationState("PASSPORT_SHARPNESS_ERROR", 49);
        T = validationState49;
        ValidationState validationState50 = new ValidationState("PASSPORT_GLARE_ERROR", 50);
        U = validationState50;
        ValidationState validationState51 = new ValidationState("PASSPORT_SHADOW_ERROR", 51);
        ab = validationState51;
        ValidationState validationState52 = new ValidationState("PASSPORT_READABILITY_ERROR", 52);
        aa = validationState52;
        ag = new ValidationState("BARCODE_DETECTED_UNREADABLE", 53);
        ValidationState validationState53 = new ValidationState("NOT_READY", 54);
        Y = validationState53;
        ValidationState validationState54 = new ValidationState("BARCODE_NOT_PASSING", 55);
        Z = validationState54;
        ValidationState validationState55 = new ValidationState("TEXT_READABILITY_NOT_PASSING", 56);
        ac = validationState55;
        af = new ValidationState[]{validationState, validationState2, validationState3, validationState4, validationState5, validationState6, validationState7, validationState8, validationState9, validationState10, validationState11, validationState12, validationState13, ae, validationState14, validationState15, validationState16, validationState17, validationState18, validationState19, validationState20, validationState21, validationState22, validationState23, validationState24, validationState25, validationState26, validationState27, validationState28, validationState29, validationState30, validationState31, validationState32, validationState33, validationState34, validationState35, validationState36, validationState37, validationState38, validationState39, validationState40, validationState41, validationState42, validationState43, validationState44, validationState45, validationState46, validationState47, validationState48, validationState49, validationState50, validationState51, validationState52, ag, validationState53, validationState54, validationState55};
        int i2 = aq + 115;
        ar = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void an(int i2, byte b2, short s2, int i3, int i4, Object[] objArr) throws Throwable {
        boolean z2;
        char c2;
        int length;
        byte[] bArr;
        int i5;
        int length2;
        byte[] bArr2;
        int i6;
        int i7 = 2 % 2;
        l lVar = new l();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(ad)};
            Object objC = e.c(1394921452);
            long j2 = 0;
            if (objC == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 - 1);
                objC = e.e((char) (7675 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 27 - View.resolveSize(0, 0), 575 - AndroidCharacter.getMirror('0'), 1405013397, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objC).invoke(null, objArr2)).intValue();
            int i8 = iIntValue == -1 ? 1 : 0;
            int i9 = 3;
            if (i8 != 0) {
                int i10 = $10 + 125;
                int i11 = i10 % 128;
                $11 = i11;
                int i12 = i10 % 2;
                byte[] bArr3 = al;
                if (bArr3 != null) {
                    int i13 = i11 + 7;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i6 = 1;
                    } else {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i6 = 0;
                    }
                    while (i6 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr3[i6])};
                        Object objC2 = e.c(-713221154);
                        if (objC2 == null) {
                            byte b5 = (byte) i9;
                            byte b6 = (byte) (b5 - 4);
                            objC2 = e.e((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 65414), 19 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), 261 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -706274905, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objC2).invoke(null, objArr3)).byteValue();
                        i6++;
                        j2 = 0;
                        i9 = 3;
                    }
                    bArr3 = bArr2;
                }
                if (bArr3 != null) {
                    byte[] bArr4 = al;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(ah)};
                    Object objC3 = e.c(1394921452);
                    if (objC3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        objC3 = e.e((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7673), TextUtils.lastIndexOf("", '0', 0) + 28, (ViewConfiguration.getLongPressTimeout() >> 16) + 527, 1405013397, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objC3).invoke(null, objArr4)).intValue()]) ^ 8033500363701343155L)) + ((int) (((long) ad) ^ 8033500363701343155L)));
                } else {
                    iIntValue = (short) (((short) (((long) am[i2 + ((int) (((long) ah) ^ 8033500363701343155L))]) ^ 8033500363701343155L)) + ((int) (((long) ad) ^ 8033500363701343155L)));
                }
            }
            if (iIntValue > 0) {
                int i14 = $11 + 77;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                lVar.f2775b = ((i2 + iIntValue) - 2) + ((int) (((long) ah) ^ 8033500363701343155L)) + i8;
                Object[] objArr5 = {lVar, Integer.valueOf(i3), Integer.valueOf(ak), sb};
                Object objC4 = e.c(-893097792);
                if (objC4 == null) {
                    char c3 = (char) (19418 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    int iAxisFromString = MotionEvent.axisFromString("") + 21;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + PhotoshopDirectory.TAG_ALTERNATE_SPOT_COLORS;
                    byte b9 = (byte) ($$b & 3);
                    byte b10 = (byte) (-b9);
                    objC4 = e.e(c3, iAxisFromString, maximumDrawingCacheSize, -899781959, false, $$c(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objC4).invoke(null, objArr5)).append(lVar.f2776c);
                lVar.f2774a = lVar.f2776c;
                byte[] bArr5 = al;
                if (bArr5 != null) {
                    int i16 = $10 + 81;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        int i17 = $10 + 123;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        bArr[i5] = (byte) (((long) bArr5[i5]) ^ 8033500363701343155L);
                        i5++;
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i19 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                lVar.f2777d = 1;
                while (lVar.f2777d < iIntValue) {
                    int i21 = $10;
                    int i22 = i21 + 11;
                    $11 = i22 % 128;
                    if (i22 % 2 == 0) {
                        throw null;
                    }
                    if (z2) {
                        int i23 = i21 + 21;
                        $11 = i23 % 128;
                        if (i23 % 2 == 0) {
                            byte[] bArr6 = al;
                            lVar.f2775b = lVar.f2775b;
                            c2 = (char) (lVar.f2774a >>> (((byte) (((byte) (((long) bArr6[r1]) | 8033500363701343155L)) >> s2)) ^ b2));
                        } else {
                            byte[] bArr7 = al;
                            lVar.f2775b = lVar.f2775b - 1;
                            c2 = (char) (lVar.f2774a + (((byte) (((byte) (((long) bArr7[r2]) ^ 8033500363701343155L)) + s2)) ^ b2));
                        }
                        lVar.f2776c = c2;
                    } else {
                        short[] sArr = am;
                        lVar.f2775b = lVar.f2775b - 1;
                        lVar.f2776c = (char) (lVar.f2774a + (((short) (((short) (((long) sArr[r2]) ^ 8033500363701343155L)) + s2)) ^ b2));
                    }
                    sb.append(lVar.f2776c);
                    lVar.f2774a = lVar.f2776c;
                    lVar.f2777d++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void e() {
        ah = 107360405;
        ad = 2036585388;
        ak = 926771287;
        al = new byte[]{70, 74, -71, -78, 94, -73, -72, -79, -77, -79, 64, 74, 69, -87, 70, 68, -74, 70, -88, 72};
    }
}
