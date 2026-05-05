package fr.antelop.sdk;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.LiveData;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.CustomerCredentialsRequiredReason;
import fr.antelop.sdk.authentication.LocalAuthenticationErrorReason;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.transaction.hce.HceTransaction;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.a.f;
import o.a.l;
import o.a.m;
import o.by.h;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletManager {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f18734a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f18735b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f18736c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f18737d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18738e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f18739f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f18740g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f18741h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f18742i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f18743j = 0;
    private final h innerWalletManager;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r8, short r9, short r10) {
        /*
            byte[] r7 = fr.antelop.sdk.WalletManager.$$c
            int r0 = r9 * 4
            int r6 = 120 - r0
            int r0 = r8 * 4
            int r5 = 1 - r0
            int r0 = r10 * 3
            int r4 = 4 - r0
            byte[] r3 = new byte[r5]
            r2 = 0
            if (r7 != 0) goto L28
            r0 = r5
            r1 = r2
        L15:
            int r4 = r4 + 1
            int r6 = r6 + r0
        L18:
            byte r0 = (byte) r6
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L25:
            r0 = r7[r4]
            goto L15
        L28:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletManager.$$g(int, short, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f18743j = 2078057659;
        f18742i = -499233001;
        f18741h = -1245403655;
        f18740g = -180439282;
        f18739f = -2093433746;
        f18737d = -358576440;
        f18736c = -918516502;
        init$0();
        f18738e = 0;
        f18734a = 1;
        f18735b = new char[]{56513, 56328, 56330, 56332, 56337, 56333, 56327, 56554, 56559, 56338, 56561, 56545, 56327, 56343, 56340, 56333, 56330, 56569, 56568, 56334, 56330, 56328, 56502, 56556, 56560, 56562, 56565, 56567, 56557, 56554, 56546, 56546, 56555, 56563, 56568, 56559, 56557, 56545, 56360, 56366, 56391, 56392, 56395, 56363, 56353, 56391, 56407, 56404, 56397, 56394, 56396, 56390, 56396, 56505, 56557, 56533, 56537, 56553, 56548, 56551, 56550, 56548, 56553, 56561, 56558, 56558, 56566, 56544, 56532, 56573, 56716, 56732, 56724, 56725, 56725, 56724, 56721, 56440, 56413, 56437, 56726, 56718, 56429, 56431, 56716, 56722, 56726, 56721, 56719, 56717, 56712, 56712, 56713, 56721, 56723, 56334, 56730, 56726, 56722, 56730, 56734, 56732, 56734, 56728, 56732, 56739, 56738, 56731, 56729, 56737, 56714, 56712, 56736};
    }

    public WalletManager(Context context, WalletManagerCallback walletManagerCallback) throws WalletValidationException {
        this.innerWalletManager = new h(context, walletManagerCallback);
    }

    @Deprecated
    public WalletManager(Context context, final WalletManagerCallbackCompat walletManagerCallbackCompat, final Object obj) throws WalletValidationException {
        this.innerWalletManager = new h(context, walletManagerCallbackCompat != null ? new WalletManagerCallback() { // from class: fr.antelop.sdk.WalletManager.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;
            public static int A = 0;
            public static int B = 0;
            public static int C = 0;
            public static int D = 0;
            public static int E = 0;
            public static int F = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static boolean f18744a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static char[] f18745b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int[] f18746c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static boolean f18747d = false;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f18748e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f18749f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static long f18750g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static char f18751h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f18752i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f18753j = 0;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static int f18754k = 0;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static int f18755l = 0;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static int f18756m = 0;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static int f18757n = 0;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static int f18758o = 0;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static int f18759p = 0;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static int f18760q = 0;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static int f18761r = 0;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static int f18762s = 0;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static int f18763t = 0;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public static int f18764u = 0;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static int f18765v = 0;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public static int f18766w = 0;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static int f18767x = 0;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public static int f18768y = 0;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public static int f18769z = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(int r6, byte r7, byte r8) {
                /*
                    int r0 = r7 * 2
                    int r0 = r0 + 4
                    int r1 = r8 + 65
                    int r2 = r6 * 2
                    int r8 = 1 - r2
                    byte[] r7 = fr.antelop.sdk.WalletManager.AnonymousClass1.$$c
                    byte[] r6 = new byte[r8]
                    r5 = 0
                    if (r7 != 0) goto L2b
                    r2 = r8
                    r4 = r0
                    r3 = r5
                L14:
                    int r1 = -r0
                    int r1 = r1 + r2
                    int r0 = r4 + 1
                L18:
                    byte r2 = (byte) r1
                    r6[r3] = r2
                    int r3 = r3 + 1
                    if (r3 != r8) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r6, r5)
                    return r0
                L25:
                    r2 = r7[r0]
                    r4 = r0
                    r0 = r2
                    r2 = r1
                    goto L14
                L2b:
                    r3 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletManager.AnonymousClass1.$$e(int, byte, byte):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                F = 343421460;
                E = 1468609020;
                D = -1919630154;
                C = 1339263504;
                B = 964700603;
                A = 1470684851;
                f18769z = 118347391;
                f18768y = 1985898198;
                f18767x = -1356713873;
                f18766w = -821561133;
                f18765v = -1141915324;
                f18764u = -1856180759;
                f18763t = -972741808;
                f18762s = -294724115;
                f18761r = -86441453;
                f18760q = -400424772;
                f18759p = 1718633555;
                f18758o = -934065342;
                f18756m = -562817805;
                f18755l = -1497483996;
                init$0();
                f18757n = 0;
                f18754k = 1;
                f18752i = 0;
                f18753j = 1;
                a();
                f18745b = new char[]{2493};
                f18748e = 2040400359;
                f18747d = true;
                f18744a = true;
                int i2 = f18754k + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f18757n = i2 % 128;
                int i3 = i2 % 2;
            }

            private static void G(int[] iArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                l lVar = new l();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = f18746c;
                int i5 = 989264422;
                int i6 = 16;
                int i7 = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i8 = $10 + 45;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $10 + 39;
                        $11 = i11 % 128;
                        if (i11 % i3 == 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                                Object objA = d.a(i5);
                                if (objA == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objA = d.a(675 - (ViewConfiguration.getPressedStateDuration() >> i6), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, -328001469, false, $$e(b2, b3, (byte) ((b3 + 56) - (b3 & 56))), new Class[]{Integer.TYPE});
                                }
                                iArr3[i10] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i10])};
                            Object objA2 = d.a(989264422);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = d.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 675, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 11 - Process.getGidForName(""), -328001469, false, $$e(b4, b5, (byte) (56 | b5)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                            i10++;
                        }
                        i3 = 2;
                        i5 = 989264422;
                        i6 = 16;
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = f18746c;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i12 = $10 + 107;
                    $11 = i12 % 128;
                    int i13 = 2;
                    int i14 = i12 % 2;
                    int i15 = 0;
                    while (i15 < length3) {
                        int i16 = $10 + 49;
                        $11 = i16 % 128;
                        int i17 = i16 % i13;
                        Object[] objArr4 = {Integer.valueOf(iArr5[i15])};
                        Object objA3 = d.a(989264422);
                        if (objA3 == null) {
                            byte b6 = (byte) i7;
                            byte b7 = b6;
                            objA3 = d.a(675 - Drawable.resolveOpacity(i7, i7), (char) (ImageFormat.getBitsPerPixel(i7) + 1), 12 - (CdmaCellLocation.convertQuartSecToDecDegrees(i7) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i7) == 0.0d ? 0 : -1)), -328001469, false, $$e(b6, b7, (byte) (56 | b7)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i15] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                        i15++;
                        i13 = 2;
                        i7 = 0;
                    }
                    iArr5 = iArr6;
                }
                System.arraycopy(iArr5, i7, iArr4, i7, length2);
                lVar.f19941d = i7;
                while (lVar.f19941d < iArr.length) {
                    cArr[i7] = (char) (iArr[lVar.f19941d] >> 16);
                    cArr[1] = (char) iArr[lVar.f19941d];
                    cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                    cArr[3] = (char) iArr[lVar.f19941d + 1];
                    lVar.f19942e = (cArr[0] << 16) + cArr[1];
                    lVar.f19940a = (cArr[2] << 16) + cArr[3];
                    l.a(iArr4);
                    int i18 = 0;
                    for (int i19 = 16; i18 < i19; i19 = 16) {
                        int i20 = $10 + 17;
                        $11 = i20 % 128;
                        int i21 = i20 % 2;
                        lVar.f19942e ^= iArr4[i18];
                        Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                        Object objA4 = d.a(2098218801);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objA4 = d.a(TextUtils.getCapsMode("", 0, 0) + 301, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 52697), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1416256172, false, $$e(b8, b9, (byte) ((b9 + 54) - (54 & b9))), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue;
                        i18++;
                    }
                    int i22 = lVar.f19942e;
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = i22;
                    lVar.f19940a ^= iArr4[16];
                    lVar.f19942e ^= iArr4[17];
                    int i23 = lVar.f19942e;
                    int i24 = lVar.f19940a;
                    cArr[0] = (char) (lVar.f19942e >>> 16);
                    cArr[1] = (char) lVar.f19942e;
                    cArr[2] = (char) (lVar.f19940a >>> 16);
                    cArr[3] = (char) lVar.f19940a;
                    l.a(iArr4);
                    cArr2[lVar.f19941d * 2] = cArr[0];
                    cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                    cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                    cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                    Object[] objArr6 = {lVar, lVar};
                    Object objA5 = d.a(986820978);
                    if (objA5 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        objA5 = d.a(TextUtils.indexOf("", "") + 229, (char) (51004 - ExpandableListView.getPackedPositionGroup(0L)), ExpandableListView.getPackedPositionType(0L) + 9, -330018025, false, $$e(b10, b11, (byte) ((-1) - (((-1) - b11) & ((-1) - 52)))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                    i7 = 0;
                }
                objArr[0] = new String(cArr2, 0, i2);
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void H(char r17, java.lang.String r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.Object[] r22) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 562
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletManager.AnonymousClass1.H(char, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0012). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void I(int r8, byte r9, byte r10, java.lang.Object[] r11) {
                /*
                    int r7 = r9 * 2
                    int r1 = r7 + 1
                    int r6 = r10 + 4
                    byte[] r5 = fr.antelop.sdk.WalletManager.AnonymousClass1.$$a
                    int r0 = r8 + 97
                    byte[] r4 = new byte[r1]
                    r3 = 0
                    if (r5 != 0) goto L28
                    r2 = r7
                    r1 = r6
                    r0 = r3
                L12:
                    int r6 = r6 + r2
                    r2 = r0
                L14:
                    byte r0 = (byte) r6
                    int r1 = r1 + 1
                    r4[r2] = r0
                    int r0 = r2 + 1
                    if (r2 != r7) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    r11[r3] = r0
                    return
                L25:
                    r2 = r5[r1]
                    goto L12
                L28:
                    r2 = r3
                    r1 = r6
                    r6 = r0
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletManager.AnonymousClass1.I(int, byte, byte, java.lang.Object[]):void");
            }

            private static void J(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
                char[] cArr;
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
                char[] cArr2 = (char[]) charArray;
                f fVar = new f();
                char[] cArr3 = f18745b;
                char c2 = '0';
                if (cArr3 != null) {
                    int i4 = $10 + 53;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                            Object objA = d.a(1618406102);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + IptcDirectory.TAG_BY_LINE, (char) (13181 - (ViewConfiguration.getFadingEdgeLength() >> 16)), AndroidCharacter.getMirror(c2) - '%', -1225586509, false, $$e(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                            }
                            cArr4[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            i6++;
                            c2 = '0';
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr4;
                }
                Object[] objArr3 = {Integer.valueOf(f18748e)};
                Object objA2 = d.a(-1503702982);
                if (objA2 == null) {
                    objA2 = d.a(32 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 10 - Process.getGidForName(""), 1893380703, false, "F", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                if (f18744a) {
                    int i7 = $10 + 113;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        fVar.f19923e = bArr.length;
                        cArr = new char[fVar.f19923e];
                        fVar.f19922a = 1;
                    } else {
                        fVar.f19923e = bArr.length;
                        cArr = new char[fVar.f19923e];
                        fVar.f19922a = 0;
                    }
                    while (fVar.f19922a < fVar.f19923e) {
                        cArr[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                        Object[] objArr4 = {fVar, fVar};
                        Object objA3 = d.a(1540807955);
                        if (objA3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA3 = d.a(TextUtils.indexOf((CharSequence) "", '0') + 459, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, -1923924106, false, $$e(b4, b5, (byte) (8 | b5)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr);
                    return;
                }
                if (!f18747d) {
                    fVar.f19923e = iArr.length;
                    char[] cArr5 = new char[fVar.f19923e];
                    fVar.f19922a = 0;
                    while (fVar.f19922a < fVar.f19923e) {
                        cArr5[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                        fVar.f19922a++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                fVar.f19923e = cArr2.length;
                char[] cArr6 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr6[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = d.a(1540807955);
                    if (objA4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA4 = d.a(458 - Gravity.getAbsoluteGravity(0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, -1923924106, false, $$e(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 8)))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr6);
            }

            static void a() {
                f18746c = new int[]{-768013411, 1118273497, 173507982, -184504710, -1030684327, -2039337877, 529222016, 201689717, 1230142913, 1380746173, 1408308966, -611434746, 1104139187, 955143030, 404130689, -2122326500, 1896272677, 350801166};
                f18750g = 740602047300126166L;
                f18749f = -1556209622;
                f18751h = (char) 17878;
            }

            /* JADX WARN: Code restructure failed: missing block: B:240:0x12b5, code lost:
            
                r1 = new java.lang.Object[]{new int[1], new int[1], r2, null, new int[1]};
                r11 = r11;
                r2 = (java.lang.String) java.lang.Class.forName(r2).getField(r2).get(r20);
                ((int[]) r1[0])[0] = r11;
                ((int[]) r1[4])[0] = r11 ^ 20;
                r3 = ~((-1) - (((-1) - 867412763) & ((-1) - r11)));
                r4 = 1406140019 + (((r3 - 975760128) - (r3 & (-975760128))) * (-964));
                r2 = ~r11;
                r3 = ~((867412763 + r2) - (867412763 & r2));
                r2 = r38 + ((r4 + (((r3 - 1002171392) - (r3 & (-1002171392))) * (-964))) + 16);
                r2 = r2 ^ (r2 << 13);
                r2 = r2 ^ (r2 >>> 17);
                r5 = 0;
                ((int[]) r1[1])[0] = r2 ^ (r2 << 5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:245:0x1501, code lost:
            
                r4 = 1;
             */
            /* JADX WARN: Removed duplicated region for block: B:223:0x1269 A[Catch: Exception -> 0x1276, IOException -> 0x12ae, all -> 0x1515, TryCatch #10 {Exception -> 0x1276, blocks: (B:86:0x0d27, B:228:0x126e, B:230:0x1274, B:231:0x1275, B:97:0x0dad, B:221:0x1263, B:223:0x1269, B:224:0x126a, B:108:0x0e05, B:112:0x0e7d, B:205:0x124b, B:207:0x124d, B:209:0x1253, B:210:0x1254, B:214:0x1258, B:216:0x125e, B:217:0x125f), top: B:369:0x0d27 }] */
            /* JADX WARN: Removed duplicated region for block: B:224:0x126a A[Catch: Exception -> 0x1276, IOException -> 0x12ae, all -> 0x1515, TRY_LEAVE, TryCatch #10 {Exception -> 0x1276, blocks: (B:86:0x0d27, B:228:0x126e, B:230:0x1274, B:231:0x1275, B:97:0x0dad, B:221:0x1263, B:223:0x1269, B:224:0x126a, B:108:0x0e05, B:112:0x0e7d, B:205:0x124b, B:207:0x124d, B:209:0x1253, B:210:0x1254, B:214:0x1258, B:216:0x125e, B:217:0x125f), top: B:369:0x0d27 }] */
            /* JADX WARN: Removed duplicated region for block: B:230:0x1274 A[Catch: Exception -> 0x1276, IOException -> 0x12ae, all -> 0x1515, TryCatch #10 {Exception -> 0x1276, blocks: (B:86:0x0d27, B:228:0x126e, B:230:0x1274, B:231:0x1275, B:97:0x0dad, B:221:0x1263, B:223:0x1269, B:224:0x126a, B:108:0x0e05, B:112:0x0e7d, B:205:0x124b, B:207:0x124d, B:209:0x1253, B:210:0x1254, B:214:0x1258, B:216:0x125e, B:217:0x125f), top: B:369:0x0d27 }] */
            /* JADX WARN: Removed duplicated region for block: B:231:0x1275 A[Catch: Exception -> 0x1276, IOException -> 0x12ae, all -> 0x1515, TRY_LEAVE, TryCatch #10 {Exception -> 0x1276, blocks: (B:86:0x0d27, B:228:0x126e, B:230:0x1274, B:231:0x1275, B:97:0x0dad, B:221:0x1263, B:223:0x1269, B:224:0x126a, B:108:0x0e05, B:112:0x0e7d, B:205:0x124b, B:207:0x124d, B:209:0x1253, B:210:0x1254, B:214:0x1258, B:216:0x125e, B:217:0x125f), top: B:369:0x0d27 }] */
            /* JADX WARN: Removed duplicated region for block: B:262:0x1682  */
            /* JADX WARN: Removed duplicated region for block: B:268:0x1892 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0a5d  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0cac  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] c(android.content.Context r35, int r36, int r37, int r38) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 9476
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletManager.AnonymousClass1.c(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{78, MessagePack.Code.UINT16, MessagePack.Code.FALSE, 123};
                $$b = 191;
            }

            static void init$1() {
                $$c = new byte[]{40, 101, 74, -30};
                $$d = 187;
            }

            @Override // fr.antelop.sdk.WalletManagerCallback
            public void onAsyncRequestError(AsyncRequestType asyncRequestType, AntelopError antelopError) {
                int i2 = 2 % 2;
                int i3 = f18753j + 67;
                f18752i = i3 % 128;
                int i4 = i3 % 2;
                walletManagerCallbackCompat.onAsyncRequestError(asyncRequestType, antelopError, obj);
                int i5 = f18753j + 111;
                f18752i = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // fr.antelop.sdk.WalletManagerCallback
            public void onAsyncRequestSuccess(AsyncRequestType asyncRequestType) {
                int i2 = 2 % 2;
                int i3 = f18752i + 7;
                f18753j = i3 % 128;
                if (i3 % 2 != 0) {
                    walletManagerCallbackCompat.onAsyncRequestSuccess(asyncRequestType, obj);
                } else {
                    walletManagerCallbackCompat.onAsyncRequestSuccess(asyncRequestType, obj);
                    throw null;
                }
            }

            @Override // fr.antelop.sdk.WalletManagerCallback
            public void onConnectionError(AntelopError antelopError) {
                int i2 = 2 % 2;
                int i3 = f18752i + 123;
                f18753j = i3 % 128;
                if (i3 % 2 != 0) {
                    walletManagerCallbackCompat.onConnectionError(antelopError, obj);
                    return;
                }
                walletManagerCallbackCompat.onConnectionError(antelopError, obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override // fr.antelop.sdk.WalletManagerCallback
            public void onConnectionSuccess(Wallet wallet) {
                int i2 = 2 % 2;
                int i3 = f18752i + 69;
                f18753j = i3 % 128;
                if (i3 % 2 != 0) {
                    walletManagerCallbackCompat.onConnectionSuccess(wallet, obj);
                } else {
                    walletManagerCallbackCompat.onConnectionSuccess(wallet, obj);
                    int i4 = 53 / 0;
                }
            }

            @Override // fr.antelop.sdk.WalletManagerCallback
            public void onCredentialsRequired(CustomerCredentialsRequiredReason customerCredentialsRequiredReason, AntelopError antelopError) {
                int i2 = 2 % 2;
                int i3 = f18752i + 99;
                f18753j = i3 % 128;
                int i4 = i3 % 2;
                walletManagerCallbackCompat.onCredentialsRequired(customerCredentialsRequiredReason, antelopError, obj);
                int i5 = f18752i + 1;
                f18753j = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 71 / 0;
                }
            }

            @Override // fr.antelop.sdk.WalletManagerCallback
            public void onLocalAuthenticationError(CustomerAuthenticationMethodType customerAuthenticationMethodType, LocalAuthenticationErrorReason localAuthenticationErrorReason, String str) {
                int i2 = 2 % 2;
                int i3 = f18752i + 83;
                f18753j = i3 % 128;
                int i4 = i3 % 2;
                walletManagerCallbackCompat.onLocalAuthenticationError(customerAuthenticationMethodType, localAuthenticationErrorReason, str, obj);
                int i5 = f18753j + 9;
                f18752i = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override // fr.antelop.sdk.WalletManagerCallback
            public void onLocalAuthenticationSuccess(CustomerAuthenticationMethodType customerAuthenticationMethodType) {
                int i2 = 2 % 2;
                int i3 = f18752i + 47;
                f18753j = i3 % 128;
                if (i3 % 2 != 0) {
                    walletManagerCallbackCompat.onLocalAuthenticationSuccess(customerAuthenticationMethodType, obj);
                } else {
                    walletManagerCallbackCompat.onLocalAuthenticationSuccess(customerAuthenticationMethodType, obj);
                    throw null;
                }
            }

            @Override // fr.antelop.sdk.WalletManagerCallback
            public void onProvisioningRequired() {
                int i2 = 2 % 2;
                int i3 = f18753j + 71;
                f18752i = i3 % 128;
                int i4 = i3 % 2;
                walletManagerCallbackCompat.onProvisioningRequired(obj);
                int i5 = f18753j + 103;
                f18752i = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 64 / 0;
                }
            }
        } : null);
    }

    static void init$0() {
        $$a = new byte[]{121, -71, 80, 66};
        $$b = 1;
    }

    static void init$1() {
        $$d = new byte[]{60, -17, 3, Ascii.NAK, -12, 68, MessagePack.Code.UINT16, -13, -6, Ascii.SI, -7, -3, -1, 66, -69, Ascii.SI, -7, Base64.padSymbol, MessagePack.Code.FLOAT32, -5, 2, -2, -11, 19, -11, 9, 2, -17, Ascii.SO, 54, MessagePack.Code.STR32, -18, 2, -18, 3, Ascii.CR, 17, -27, 4, 6, -9, Ascii.FS, -19, -14, -2, 8, 8, 65, -75, 75, MessagePack.Code.UINT8, 62, -13, -12, 68, MessagePack.Code.UINT16, -13, -6, Ascii.SI, -7, -3, -1, 66, -69, Ascii.SI, -7, Base64.padSymbol, MessagePack.Code.FLOAT64, 2, -17, Ascii.SO, 54, MessagePack.Code.EXT32, -8, -9, Ascii.NAK, -15, 0, 4, 3, 6, 2, -19, Ascii.VT, -6, 1, 64, -26, -27, -2, 32, MessagePack.Code.FIXEXT16, -9, 53, MessagePack.Code.INT16, 0, 4, 3, 6, 2, -19, Ascii.VT, -6, 1, 74, -13, -12, 68, MessagePack.Code.UINT16, -13, -6, Ascii.SI, -7, -3, -1, 66, -69, Ascii.SI, -7, Base64.padSymbol, MessagePack.Code.FLOAT32, -5, 2, -2, -11, 19, -11, 9, 2, -17, Ascii.SO, 54, -21, MessagePack.Code.FIXEXT8, 3, 6, -8, Ascii.ETB, -27, Ascii.US, -17, -24, 41, MessagePack.Code.STR32, 2, Ascii.VT, 37, -30, -17, Ascii.SO, Ascii.SYN, MessagePack.Code.MAP32, -5, 36, MessagePack.Code.MAP16, 3, Ascii.FF, -2, -14, 0, Ascii.SO, 1};
        $$e = 183;
    }

    static void init$2() {
        $$c = new byte[]{113, 60, -124, 107};
        $$f = PanasonicMakernoteDirectory.TAG_BURST_SPEED;
    }

    private static void k(int[] iArr, String str, boolean z2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i2 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = f18735b;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = $11 + 117;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                    Object objA = d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 + 1);
                        objA = d.a(249 - View.getDefaultSize(i3, i3), (char) (Process.myPid() >> 22), 11 - TextUtils.getCapsMode("", i3, i3), 1376582792, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i5) {
                if (bArr[mVar.f19943d] == 1) {
                    int i11 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = d.a(120026474);
                    if (objA2 == null) {
                        objA2 = d.a(11 - Color.alpha(0), (char) KeyEvent.normalizeMetaState(0), 10 - ExpandableListView.getPackedPositionGroup(0L), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA3 = d.a(835 - TextUtils.lastIndexOf("", '0', 0), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27279), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, -1210801192, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = d.a(Color.green(0) + 21, (char) (35714 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i13 = $10 + 21;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
        }
        if (z2) {
            int i16 = $11 + 27;
            $10 = i16 % 128;
            int i17 = 2;
            int i18 = i16 % 2;
            char[] cArr6 = new char[i5];
            mVar.f19943d = 0;
            int i19 = $10 + 97;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            while (mVar.f19943d < i5) {
                int i21 = $10 + 101;
                $11 = i21 % 128;
                int i22 = i21 % i17;
                cArr6[mVar.f19943d] = cArr3[(i5 - mVar.f19943d) - 1];
                mVar.f19943d++;
                i17 = 2;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i23 = 0;
            while (true) {
                mVar.f19943d = i23;
                if (mVar.f19943d >= i5) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i23 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 106 - r6
            int r3 = r7 * 4
            int r2 = 1 - r3
            int r1 = r8 * 2
            int r8 = r1 + 4
            byte[] r7 = fr.antelop.sdk.WalletManager.$$a
            byte[] r6 = new byte[r2]
            r5 = 0
            int r4 = 0 - r3
            if (r7 != 0) goto L2e
            r1 = r8
            r3 = r5
        L15:
            int r0 = -r0
            int r0 = r0 + r8
            int r8 = r1 + 1
        L19:
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r3 != r4) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r9[r5] = r0
            return
        L26:
            int r3 = r3 + 1
            r2 = r7[r8]
            r1 = r8
            r8 = r0
            r0 = r2
            goto L15
        L2e:
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletManager.l(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x000f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r0 = 105 - r9
            byte[] r6 = fr.antelop.sdk.WalletManager.$$d
            int r1 = r8 + 1
            int r5 = 111 - r7
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r6 != 0) goto L26
            r2 = r0
            r1 = r3
        Lf:
            int r0 = -r0
            int r5 = r5 + r0
            r0 = r2
        L12:
            int r2 = r0 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r8) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r10[r3] = r0
            return
        L21:
            int r1 = r1 + 1
            r0 = r6[r2]
            goto Lf
        L26:
            r1 = r3
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletManager.m(int, int, int, java.lang.Object[]):void");
    }

    public final void activateAuthenticationMethod(CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18738e + 91;
        f18734a = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerWalletManager.a(customerAuthenticationMethodType, customerAuthenticationCredentials);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.innerWalletManager.a(customerAuthenticationMethodType, customerAuthenticationCredentials);
        int i4 = f18738e + 51;
        f18734a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
    }

    public final void cancelOngoingTransaction() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18734a + 9;
        f18738e = i3 % 128;
        int i4 = i3 % 2;
        this.innerWalletManager.f();
        int i5 = f18738e + 73;
        f18734a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void changeCredentials(CustomerAuthenticationCredentials customerAuthenticationCredentials, CustomerAuthenticationCredentials customerAuthenticationCredentials2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18738e + 37;
        f18734a = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerWalletManager.c(customerAuthenticationCredentials, customerAuthenticationCredentials2);
        } else {
            this.innerWalletManager.c(customerAuthenticationCredentials, customerAuthenticationCredentials2);
            throw null;
        }
    }

    public final void checkCredentials(CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18734a + 89;
        f18738e = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerWalletManager, customerAuthenticationCredentials};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i4 = h.f21883e * 1504880926;
            h.f21883e = i4;
            int i5 = h.f21881c * (-803734112);
            h.f21881c = i5;
            h.b(Thread.activeCount(), iFreeMemory, objArr, 1439178664, -1439178663, i4, i5);
            throw null;
        }
        Object[] objArr2 = {this.innerWalletManager, customerAuthenticationCredentials};
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int i6 = h.f21883e * 1504880926;
        h.f21883e = i6;
        int i7 = h.f21881c * (-803734112);
        h.f21881c = i7;
        h.b(Thread.activeCount(), iFreeMemory2, objArr2, 1439178664, -1439178663, i6, i7);
        int i8 = f18738e + 17;
        f18734a = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public final void clean() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18734a + 71;
        f18738e = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerWalletManager.h();
            return;
        }
        this.innerWalletManager.h();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0e5b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0ff6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x1188  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0379 A[PHI: r9
  0x0379: PHI (r9v103 long) = (r9v26 long), (r9v109 long) binds: [B:132:0x0e57, B:27:0x0377] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0805  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void connect() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletManager.connect():void");
    }

    public final void connect(CustomerAuthenticationCredentials customerAuthenticationCredentials, CustomerAuthenticationCredentials customerAuthenticationCredentials2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18734a + 45;
        f18738e = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerWalletManager, customerAuthenticationCredentials, customerAuthenticationCredentials2};
            int i4 = h.f21889k * (-1238973549);
            h.f21889k = i4;
            int i5 = h.f21891m * 914587477;
            h.f21891m = i5;
            h.b(Process.myUid(), i4, objArr, 1825671495, -1825671490, i5, Process.myPid());
            return;
        }
        Object[] objArr2 = {this.innerWalletManager, customerAuthenticationCredentials, customerAuthenticationCredentials2};
        int i6 = h.f21889k * (-1238973549);
        h.f21889k = i6;
        int i7 = h.f21891m * 914587477;
        h.f21891m = i7;
        h.b(Process.myUid(), i6, objArr2, 1825671495, -1825671490, i7, Process.myPid());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void deactivateAuthenticationMethod(CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18738e + 65;
        f18734a = i3 % 128;
        int i4 = i3 % 2;
        this.innerWalletManager.d(customerAuthenticationMethodType, customerAuthenticationCredentials);
        int i5 = f18738e + 101;
        f18734a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
    }

    public final void delete() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18734a + 13;
        f18738e = i3 % 128;
        int i4 = i3 % 2;
        this.innerWalletManager.n();
        int i5 = f18738e + 5;
        f18734a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void disconnect() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18734a + 45;
        f18738e = i3 % 128;
        int i4 = i3 % 2;
        this.innerWalletManager.i();
        int i5 = f18734a + 47;
        f18738e = i5 % 128;
        int i6 = i5 % 2;
    }

    public final LiveData<List<HceTransaction>> listHceTransactions(Application application, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f18738e + 3;
        f18734a = i5 % 128;
        int i6 = i5 % 2;
        LiveData<List<HceTransaction>> liveDataB = h.b(application, i2, i3);
        if (i6 == 0) {
            int i7 = 66 / 0;
        }
        return liveDataB;
    }

    public final void lock(WalletLockReason walletLockReason) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18738e + 113;
        f18734a = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerWalletManager.d(walletLockReason);
            return;
        }
        this.innerWalletManager.d(walletLockReason);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void logout() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18738e + 109;
        f18734a = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerWalletManager};
            int i4 = h.f21886h * 91661242;
            h.f21886h = i4;
            int iNextInt = new Random().nextInt();
            int iActiveCount = Thread.activeCount();
            int i5 = h.f21892n * 821554727;
            h.f21892n = i5;
            h.b(i5, i4, objArr, -819918458, 819918462, iNextInt, iActiveCount);
            return;
        }
        Object[] objArr2 = {this.innerWalletManager};
        int i6 = h.f21886h * 91661242;
        h.f21886h = i6;
        int iNextInt2 = new Random().nextInt();
        int iActiveCount2 = Thread.activeCount();
        int i7 = h.f21892n * 821554727;
        h.f21892n = i7;
        h.b(i7, i6, objArr2, -819918458, 819918462, iNextInt2, iActiveCount2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean setCustomerCredentialsForTransaction(CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18738e + 23;
        f18734a = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = this.innerWalletManager.c(customerAuthenticationCredentials);
        int i5 = f18738e + 117;
        f18734a = i5 % 128;
        if (i5 % 2 != 0) {
            return zC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void synchronizeAuthenticationMethod(CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18738e + 9;
        f18734a = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerWalletManager, customerAuthenticationMethodType, customerAuthenticationCredentials};
            int iMyTid = Process.myTid();
            int i4 = h.f21888j * 1093664850;
            h.f21888j = i4;
            int i5 = h.f21884f * (-1094765284);
            h.f21884f = i5;
            int i6 = h.f21885g * 1692211606;
            h.f21885g = i6;
            h.b(i6, iMyTid, objArr, 1814670375, -1814670372, i4, i5);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.innerWalletManager, customerAuthenticationMethodType, customerAuthenticationCredentials};
        int iMyTid2 = Process.myTid();
        int i7 = h.f21888j * 1093664850;
        h.f21888j = i7;
        int i8 = h.f21884f * (-1094765284);
        h.f21884f = i8;
        int i9 = h.f21885g * 1692211606;
        h.f21885g = i9;
        h.b(i9, iMyTid2, objArr2, 1814670375, -1814670372, i7, i8);
        int i10 = f18738e + 55;
        f18734a = i10 % 128;
        int i11 = i10 % 2;
    }
}
