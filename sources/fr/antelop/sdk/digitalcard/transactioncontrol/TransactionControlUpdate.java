package fr.antelop.sdk.digitalcard.transactioncontrol;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import o.a.f;
import o.a.i;
import o.a.n;
import o.d.d;
import o.ex.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class TransactionControlUpdate<T> {
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
    public static int G = 0;
    public static int H = 0;
    public static int I = 0;
    public static int J = 0;
    public static int K = 0;
    public static int L = 0;
    public static int M = 0;
    public static int N = 0;
    public static int O = 0;
    public static int P = 0;
    public static int Q = 0;
    public static int R = 0;
    public static int S = 0;
    public static int T = 0;
    public static int U = 0;
    public static int V = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f19358a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19359b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f19360c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f19361d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f19362e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f19363f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f19364g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f19365h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f19366i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f19367j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f19368k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f19369l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f19370m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f19371n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f19372o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f19373p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f19374q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f19375r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f19376s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f19377t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f19378u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f19379v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f19380w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f19381x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f19382y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f19383z = 0;
    private final a<T> innerTransactionControlUpdate;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r8, short r9, int r10) {
        /*
            int r2 = r8 * 4
            int r1 = 1 - r2
            byte[] r8 = fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdate.$$c
            int r7 = r10 + 65
            int r0 = r9 * 4
            int r6 = 3 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r8 != 0) goto L2e
            r0 = r3
            r2 = r6
            r1 = r4
        L16:
            int r0 = -r0
            int r6 = r6 + r0
            int r0 = r2 + 1
            r7 = r6
            r6 = r0
        L1c:
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r0 = r8[r6]
            int r1 = r1 + 1
            r2 = r6
            r6 = r7
            goto L16
        L2e:
            r1 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdate.$$e(short, short, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        V = 1086030939;
        U = 278069282;
        T = -53599594;
        S = 146138797;
        R = -830699606;
        Q = -1991523112;
        P = 1975176507;
        O = 1756233953;
        N = -1605172267;
        M = 1564428924;
        L = 1606963608;
        K = 1213878920;
        J = 1043783689;
        I = 1386082152;
        H = -625998681;
        G = -1528016914;
        F = -1044738326;
        E = 1880079619;
        D = -628990480;
        C = -366463759;
        B = -1412659979;
        A = -1329269440;
        f19383z = 2036888312;
        f19382y = -720273308;
        f19381x = 14843025;
        f19380w = -2086991270;
        f19379v = -135719635;
        f19378u = 917631602;
        f19377t = -736202846;
        f19376s = -1298671285;
        f19375r = -834382235;
        f19374q = -1528403374;
        f19373p = -841029695;
        f19372o = 1485856462;
        f19371n = 707965264;
        f19370m = -1832550744;
        init$0();
        f19369l = 0;
        f19368k = 1;
        f19365h = 0;
        f19367j = 1;
        a();
        f19361d = -1270219376;
        int i2 = f19369l + 61;
        f19368k = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public TransactionControlUpdate(a<T> aVar) {
        this.innerTransactionControlUpdate = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void W(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r2 = r7 * 4
            int r1 = 1 - r2
            byte[] r7 = fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdate.$$a
            int r0 = r6 * 3
            int r6 = 3 - r0
            int r0 = r5 + 97
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L2c
            r1 = r6
            r2 = r3
            r0 = r4
        L16:
            int r6 = r6 + r2
            r2 = r0
        L18:
            byte r0 = (byte) r6
            r5[r2] = r0
            int r0 = r2 + 1
            if (r2 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r8[r4] = r0
            return
        L27:
            int r1 = r1 + 1
            r2 = r7[r1]
            goto L16
        L2c:
            r2 = r4
            r1 = r6
            r6 = r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdate.W(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void X(char r17, java.lang.String r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.Object[] r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdate.X(char, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    private static void Y(int[] iArr, String str, int i2, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object obj = null;
        Object charArray = str3;
        if (str3 != null) {
            int i4 = $11 + 65;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str3.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f19360c;
        float f2 = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objA = d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a((TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1)) + 593, (char) (Color.argb(0, 0, 0, 0) + 13181), View.resolveSizeAndState(0, 0, 0) + 11, -1225586509, false, $$e(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i5++;
                    f2 = 0.0f;
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
        Object[] objArr3 = {Integer.valueOf(f19364g)};
        Object objA2 = d.a(-1503702982);
        long j2 = -1;
        if (objA2 == null) {
            objA2 = d.a(31 - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f19363f) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = d.a(458 - ExpandableListView.getPackedPositionGroup(0L), (char) (1 - (SystemClock.currentThreadTimeMillis() > j2 ? 1 : (SystemClock.currentThreadTimeMillis() == j2 ? 0 : -1))), 11 - TextUtils.indexOf("", "", 0), -1923924106, false, $$e(b4, b5, (byte) (8 | b5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                j2 = -1;
            }
            String str5 = new String(cArr4);
            int i6 = $10 + 55;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str5;
            return;
        }
        if (!f19366i) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = d.a(1540807955);
            if (objA4 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA4 = d.a(MotionEvent.axisFromString("") + 459, (char) Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", '0') + 12, -1923924106, false, $$e(b6, b7, (byte) (8 | b7)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    private static void Z(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 109;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i8 = $10 + 7;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i10 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f19361d)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 269, (char) ExpandableListView.getPackedPositionType(0L), 11 - TextUtils.getOffsetAfter("", 0), -2071844881, false, $$e(b2, b3, (byte) ((b3 + 50) - (50 & b3))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(522 - TextUtils.getTrimmedLength(""), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 13, 627984172, false, $$e(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 48)))), new Class[]{Object.class, Object.class});
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
        if (i4 > 0) {
            int i11 = $10 + 43;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (!(!z2)) {
            int i13 = $10 + 17;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i15 = $11 + 69;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr4[nVar.f19944a] = cArr2[(nVar.f19944a * i2) - 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = d.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 522, (char) TextUtils.getOffsetBefore("", 0), 12 - TextUtils.indexOf("", ""), 627984172, false, $$e(b6, b7, (byte) (48 | b7)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = d.a(-202660535);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = d.a(View.getDefaultSize(0, 0) + 522, (char) Color.argb(0, 0, 0, 0), View.combineMeasuredStates(0, 0) + 12, 627984172, false, $$e(b8, b9, (byte) (48 | b9)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void a() {
        f19362e = -7063119564541927541L;
        f19359b = 1564493270;
        f19358a = (char) 17878;
        f19360c = new char[]{2482, 2501, 2486, 2499, 2508, 2481, 2487, 2550, 2484, 2496, 2480, 2483, 2493, 2497, 2505, 2510, 2498, 2503, 2507, 2509, 2504, 2313, 2511, 2547, 2490, 2495, 2551, 2492, 2494, 2523, 2548, 2557, 2521, 2315};
        f19364g = 2040400164;
        f19366i = true;
        f19363f = true;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] a$4a7e738d(int r40, java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 16817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdate.a$4a7e738d(int, java.lang.Object):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{49, 53, Ascii.ETB, 7};
        $$b = 55;
    }

    static void init$1() {
        $$c = new byte[]{32, MessagePack.Code.STR16, MessagePack.Code.NEVER_USED};
        $$d = 200;
    }

    public final void commit(Context context, final OperationCallback<Void> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        new SecureTransactionControlUpdateCommit(this.innerTransactionControlUpdate.d()).launch(context, new DefaultCustomerAuthenticatedProcessCallback() { // from class: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdate.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f19384a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f19385b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static int f19386c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static int f19387d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static int f19388e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f19389f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static int f19390g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f19391h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f19392i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static int f19393j = 0;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static short[] f19394k = null;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static byte[] f19395l = null;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private static int f19396m = 0;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static long f19397n = 0;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static char f19398o = 0;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static int f19399p = 0;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private static int f19400q = 0;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private static int f19401t = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(short r9, short r10, short r11) {
                /*
                    int r8 = r10 + 65
                    int r0 = r11 * 2
                    int r7 = r0 + 4
                    byte[] r6 = fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdate.AnonymousClass1.$$a
                    int r5 = r9 * 2
                    int r0 = r5 + 1
                    byte[] r4 = new byte[r0]
                    r3 = 0
                    if (r6 != 0) goto L29
                    r1 = r7
                    r2 = r3
                L13:
                    int r7 = r7 + 1
                    int r8 = r8 + r1
                    r1 = r2
                L17:
                    byte r0 = (byte) r8
                    r4[r1] = r0
                    int r2 = r1 + 1
                    if (r1 != r5) goto L24
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L24:
                    r0 = r6[r7]
                    r1 = r8
                    r8 = r0
                    goto L13
                L29:
                    r1 = r3
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdate.AnonymousClass1.$$c(short, short, short):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f19399p = 1967832916;
                f19390g = 1243244313;
                f19393j = 822501923;
                f19384a = 884711250;
                f19386c = -309317070;
                f19387d = -1692039236;
                f19388e = -1817605542;
                f19385b = -1093542928;
                f19401t = 0;
                f19400q = 1;
                f19389f = -1640439180;
                f19392i = 1150422513;
                f19391h = 1587335811;
                f19395l = new byte[]{-122, 124, -118, -117, 120, -120, 122, -81, -83, -115, 118, 80, -89, 115, -115, 118, 48, MessagePack.Code.EXT8, 75, 121, 114, -103, -66, 56, -120, -122, 122, 112, -97, 115, 127, MessagePack.Code.EXT16, 59, -102, 102, -104, 122, 127, -98, 112, -84, -87, 49, 118, 119, 112, -125, 123, MessagePack.Code.FIXSTR_PREFIX, -119, 98, -122, -102, 69, 118, 119, 112, -125, 123, MessagePack.Code.FIXSTR_PREFIX, -119, 99, -82, 84, 115, -107, 119, -128, 115, -117, 126, -128, -103, 101, 115, -117, 123, -123, -113, -100, 81, -126, 115, -124, 117, -88, 105, 115, -117, 123, -123, -113, -100, 81, -126, 115, -125, 126, 112, -116, -98, 126, -118, 115, 123, -124, 118, -118, 91, -118, -114, 118, -100, -113, -106, 108, 124, -98, 115, 119, -114, 112, 120, -113, -128, -81, -104, 55, -113, -128, -113, -72, 56, -120, -122, 122, 112, -97, 115, 127, MessagePack.Code.EXT16, 64, 102, -104, 122, 126, 112, -116, -98, 126, -118, 115, -101, -88, 76, 112, MessagePack.Code.UINT64, 55, -117, -124, 124, -117, 114, -127, -72, 71, 118, 119, 112, -125, 123, -128, -122, 124, -118, -117, 120, -120, 122, -81, -83, -115, 118, 80, 105, -100, 115, 118, -123, 96, -81, 82, -126, 115, -115, -115, -115, -115, -115, -115, -115, -115, -115};
                f19397n = 740602047300126166L;
                f19396m = 1564493270;
                f19398o = (char) 53228;
            }

            public static Object[] d(Context context2, int i3, int i4) {
                if (context2 == null) {
                    Object[] objArr = {new int[1], new int[]{i3}, null, new int[]{i3}};
                    int iMyTid = Process.myTid();
                    int i5 = (((-605886468) + (((~((-678690889) | iMyTid)) | (~(((-542867) + iMyTid) - ((-542867) & iMyTid)))) * 69)) + (((-1) - (((-1) - (~((-1) - (((-1) - iMyTid) & ((-1) - (-336326323)))))) & ((-1) - ((~(((-1014474345) + iMyTid) - ((-1014474345) & iMyTid))) | 335783456)))) * (-69))) - 1316710823;
                    int i6 = f19385b * (-1410169939);
                    f19385b = i6;
                    int i7 = i5 * (-375);
                    int i8 = ~i5;
                    int i9 = (-1) ^ i8;
                    int i10 = ~((i8 + i9) - (i8 & i9));
                    int i11 = (i10 + i6) - (i10 & i6);
                    int i12 = ~i5;
                    int i13 = ((-1) - (((-1) - ((i11 + i12) - (i11 | i12))) & ((-1) - (i11 ^ i12)))) * IptcDirectory.TAG_ARM_IDENTIFIER;
                    int i14 = (((-1) - (((-1) - i7) & ((-1) - i13))) << 1) - (i7 ^ i13);
                    int i15 = ~(~i6);
                    int i16 = ~i5;
                    int i17 = -(-(((i15 + i16) - (i15 & i16)) * (-376)));
                    int i18 = (i14 ^ i17) + (((i17 + i14) - (i17 | i14)) << 1);
                    int i19 = ~(i6 | ((-1) ^ i6));
                    int i20 = -(-(((-1) - (((-1) - ((i19 + i5) - (i19 | i5))) & ((-1) - (i5 ^ i19)))) * IptcDirectory.TAG_ARM_IDENTIFIER));
                    int i21 = (i18 ^ i20) + (((i20 + i18) - (i20 | i18)) << 1);
                    int i22 = i21 * 866;
                    int i23 = -(-(i4 * (-864)));
                    int i24 = ((-1) - (((-1) - i22) | ((-1) - i23))) + ((-1) - (((-1) - i22) & ((-1) - i23)));
                    int i25 = ~i4;
                    int i26 = ~i21;
                    int i27 = ~i3;
                    int i28 = ~(((i26 + i27) - (i26 | i27)) | (i26 ^ i27));
                    int i29 = -(-(((-1) - (((-1) - (i25 & i28)) & ((-1) - (i25 ^ i28)))) * (-865)));
                    int i30 = (i24 ^ i29) + (((-1) - (((-1) - i29) | ((-1) - i24))) << 1);
                    int i31 = -(-((~((-1) - (((-1) - (i3 & i21)) & ((-1) - (i21 ^ i3))))) * 865));
                    int i32 = ((i30 + i31) - (i30 | i31)) + ((i31 + i30) - (i31 & i30));
                    int i33 = ~i4;
                    int i34 = i33 ^ i27;
                    int i35 = i33 & i27;
                    int i36 = ~((i35 + i34) - (i35 & i34));
                    int i37 = i27 ^ i21;
                    int i38 = (-1) - (((-1) - i21) | ((-1) - i27));
                    int i39 = ~((i37 + i38) - (i37 & i38));
                    int i40 = i36 ^ i39;
                    int i41 = (-1) - (((-1) - i36) | ((-1) - i39));
                    int i42 = -(-(((i41 + i40) - (i41 & i40)) * 865));
                    int i43 = (((i32 + i42) - (i32 & i42)) << 1) - (i42 ^ i32);
                    int i44 = i43 << 13;
                    int i45 = (-1) - (((-1) - ((i44 + i43) - (i44 & i43))) | ((-1) - (~((-1) - (((-1) - i43) | ((-1) - i44))))));
                    int i46 = i45 >>> 17;
                    int i47 = (-1) - (((-1) - (~i46)) | ((-1) - i45));
                    int i48 = (-1) - (((-1) - (~i45)) | ((-1) - i46));
                    int i49 = (i48 + i47) - (i48 & i47);
                    int i50 = i49 << 5;
                    int i51 = (-1) - (((-1) - (~i50)) | ((-1) - i49));
                    int i52 = ~i49;
                    ((int[]) objArr[0])[0] = (-1) - (((-1) - ((i52 + i50) - (i52 | i50))) & ((-1) - i51));
                    return objArr;
                }
                try {
                    short s2 = (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i53 = (-87) - (~(-(ViewConfiguration.getTouchSlop() >> 8)));
                    byte offsetAfter = (byte) TextUtils.getOffsetAfter("", 0);
                    int i54 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i55 = (i54 * (-523)) + 985220484;
                    int i56 = ~((-1) - (((-1) - (~i54)) & ((-1) - (-437182116))));
                    int i57 = ~(437182115 | i54);
                    int i58 = (i56 ^ i57) | ((-1) - (((-1) - i56) | ((-1) - i57)));
                    int i59 = ~((437182115 ^ iUptimeMillis) | ((437182115 + iUptimeMillis) - (437182115 | iUptimeMillis)));
                    int i60 = i58 ^ i59;
                    int i61 = i58 & i59;
                    int i62 = -(-(((i60 + i61) - (i60 & i61)) * 262));
                    int i63 = ((((i55 + i62) - (i55 & i62)) << 1) - (i55 ^ i62)) + ((~((437182115 ^ i54) | (437182115 & i54))) * (-786));
                    int i64 = ~iUptimeMillis;
                    int i65 = ~((-1) - (((-1) - ((437182115 + i64) - (i64 | 437182115))) & ((-1) - (437182115 ^ i64))));
                    int i66 = ~((~i54) | (-437182116));
                    int i67 = ((-1) - (((-1) - i65) | ((-1) - i66))) | (i65 ^ i66);
                    int i68 = ~(437182115 | i54);
                    Object[] objArr2 = new Object[1];
                    r(s2, i53, offsetAfter, (i63 - (~((((-1) - (((-1) - i67) | ((-1) - i68))) | (i67 ^ i68)) * 262))) - 1, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 626331655, objArr2);
                    Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
                    int i69 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i70 = i69 * 71;
                    int i71 = (i70 ^ (-2784012)) + (((-1) - (((-1) - i70) | ((-1) - (-2784012)))) << 1);
                    int i72 = ~i69;
                    int i73 = ~((-1) - (((-1) - i72) & ((-1) - 40348)));
                    int i74 = i3 ^ 40348;
                    int i75 = (i3 + 40348) - (i3 | 40348);
                    int i76 = ~((i74 + i75) - (i74 & i75));
                    int i77 = i73 ^ i76;
                    int i78 = (i73 + i76) - (i73 | i76);
                    int i79 = ((i78 + i77) - (i78 & i77)) * (-140);
                    int i80 = (i71 ^ i79) + (((i71 + i79) - (i71 | i79)) << 1);
                    int i81 = (-1) - (((-1) - (i69 ^ 40348)) & ((-1) - ((-1) - (((-1) - i69) | ((-1) - 40348)))));
                    int i82 = i81 ^ i3;
                    int i83 = i81 & i3;
                    int i84 = (~((i83 + i82) - (i83 & i82))) * 70;
                    int i85 = (i80 & i84) + ((i84 + i80) - (i84 & i80));
                    int i86 = i72 ^ 40348;
                    int i87 = (i72 + 40348) - (i72 | 40348);
                    int i88 = ~((i87 + i86) - (i87 & i86));
                    int i89 = ~(((-1) - (((-1) - (-40349)) | ((-1) - i69))) | ((-40349) ^ i69));
                    int i90 = i88 ^ i89;
                    int i91 = (i88 + i89) - (i88 | i89);
                    int i92 = (i91 + i90) - (i91 & i90);
                    int i93 = ~(((-1) - (((-1) - i69) | ((-1) - i3))) | (i69 ^ i3));
                    int i94 = ((i93 + i92) - (i93 & i92)) * 70;
                    int i95 = -(-ExpandableListView.getPackedPositionType(0L));
                    Object[] objArr4 = new Object[1];
                    s((char) ((((i85 + i94) - (i85 & i94)) << 1) - (i94 ^ i85)), "㗶⭌鳱\ud99d", ((i95 - 248820683) - (i95 | (-248820683))) + (i95 | (-248820683)), "\u0000\u0000\u0000\u0000", "\u31ec蜞\uf15b\uda52㰌च賽焻䰖ՙ⦈ꚥ\udfcf䡹酈䰝蛈甆腢\u1af5鬅\ud83c캌ꛖ큻㛯蟒㧿鏜৶ⷁ", objArr4);
                    try {
                        Object[] objArr5 = {(String) objArr4[0]};
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                        int i96 = (packedPositionChild * (-183)) + 185;
                        int i97 = ~packedPositionChild;
                        int i98 = -(-(((-1) - (((-1) - (i97 & 1)) & ((-1) - (i97 ^ 1)))) * (-368)));
                        int i99 = (((i96 + i98) - (i96 & i98)) << 1) - (i96 ^ i98);
                        int i100 = packedPositionChild | (-2);
                        int i101 = ~i3;
                        int i102 = i100 ^ i101;
                        int i103 = (-1) - (((-1) - i100) | ((-1) - i101));
                        int i104 = i99 + (((i103 + i102) - (i103 & i102)) * 184);
                        int i105 = ~packedPositionChild;
                        int i106 = ~((-1) - (((-1) - (i105 & (-2))) & ((-1) - (i105 ^ (-2)))));
                        int i107 = ~((i101 ^ packedPositionChild) | ((-1) - (((-1) - i101) | ((-1) - packedPositionChild))));
                        int i108 = (i106 ^ i107) | (i106 & i107);
                        int i109 = packedPositionChild ^ 1;
                        int i110 = (packedPositionChild + 1) - (packedPositionChild | 1);
                        int i111 = ~((i110 + i109) - (i110 & i109));
                        int i112 = ((-1) - (((-1) - ((-1) - (((-1) - i111) | ((-1) - i108)))) & ((-1) - (i108 ^ i111)))) * 184;
                        short s3 = (short) ((i104 & i112) + (i112 | i104));
                        int i113 = -View.MeasureSpec.getMode(0);
                        int i114 = (i113 ^ (-86)) + (((-1) - (((-1) - i113) | ((-1) - (-86)))) << 1);
                        byte b2 = (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int iArgb = Color.argb(0, 0, 0, 0);
                        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                        int i115 = (iArgb * 755) - 1514348444;
                        int i116 = ~iArgb;
                        int i117 = ~((-1) - (((-1) - (i116 ^ (-437182116))) & ((-1) - ((i116 - 437182116) - (i116 | (-437182116))))));
                        int i118 = ~iArgb;
                        int i119 = ~((-1) - (((-1) - (i118 ^ iUptimeMillis2)) & ((-1) - ((-1) - (((-1) - i118) | ((-1) - iUptimeMillis2))))));
                        int i120 = (-1) - (((-1) - (i117 ^ i119)) & ((-1) - (i119 & i117)));
                        int i121 = ~((-1) - (((-1) - iUptimeMillis2) & ((-1) - (-437182116))));
                        int i122 = ((i120 ^ i121) | (i120 & i121)) * (-754);
                        int i123 = (i115 ^ i122) + (((-1) - (((-1) - i115) | ((-1) - i122))) << 1);
                        int i124 = (-1) - (((-1) - (i118 ^ (-437182116))) & ((-1) - ((-1) - (((-1) - i118) | ((-1) - (-437182116))))));
                        int i125 = ~((-1) - (((-1) - ((-1) - (((-1) - i124) | ((-1) - iUptimeMillis2)))) & ((-1) - (i124 ^ iUptimeMillis2))));
                        int i126 = ~iUptimeMillis2;
                        int i127 = i126 ^ iArgb;
                        int i128 = (i126 + iArgb) - (i126 | iArgb);
                        int i129 = (i128 + i127) - (i128 & i127);
                        int i130 = ~(((i129 - 437182116) - (i129 | (-437182116))) | (i129 ^ (-437182116)));
                        int i131 = i125 ^ i130;
                        int i132 = (-1) - (((-1) - i125) | ((-1) - i130));
                        int i133 = i123 + (((i132 + i131) - (i132 & i131)) * (-754));
                        int i134 = ~iUptimeMillis2;
                        int i135 = (((-1) - (((-1) - i134) | ((-1) - i116))) | (i116 ^ i134)) * 754;
                        Object[] objArr6 = new Object[1];
                        r(s3, i114, b2, (i133 ^ i135) + (((-1) - (((-1) - i135) | ((-1) - i133))) << 1), 626331655 - Color.alpha(0), objArr6);
                        objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                        short s4 = (short) (0 - (~Process.getGidForName("")));
                        int i136 = (-93) - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        byte defaultSize = (byte) View.getDefaultSize(0, 0);
                        int i137 = (-437182156) - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                        int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                        Object[] objArr7 = new Object[1];
                        r(s4, i136, defaultSize, i137, (touchSlop ^ 626331692) + (((touchSlop + 626331692) - (touchSlop | 626331692)) << 1), objArr7);
                        try {
                            Object[] objArr8 = {(String) objArr7[0]};
                            int i138 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            short s5 = (short) (((-1) - (((-1) - i138) | ((-1) - 1))) + ((-1) - (((-1) - i138) & ((-1) - 1))));
                            int iRed = Color.red(0);
                            int i139 = ~iRed;
                            int i140 = (i139 ^ 85) | ((-1) - (((-1) - i139) | ((-1) - 85)));
                            int i141 = ~((-1) - (((-1) - ((-1) - (((-1) - i140) | ((-1) - i3)))) & ((-1) - (i140 ^ i3))));
                            int i142 = (-1) - (((-1) - (iRed ^ (-86))) & ((-1) - ((-86) & iRed)));
                            int i143 = ~((-1) - (((-1) - ((-1) - (((-1) - i142) | ((-1) - i3)))) & ((-1) - (i142 ^ i3))));
                            int i144 = (((iRed * 70) + 5848) - (~(((-1) - (((-1) - ((-1) - (((-1) - i141) | ((-1) - i143)))) & ((-1) - (i141 ^ i143)))) * 69))) - 1;
                            int i145 = i139 ^ (-86);
                            int i146 = (-1) - (((-1) - i139) | ((-1) - (-86)));
                            int i147 = (-1) - (((-1) - (~((i146 + i145) - (i146 & i145)))) & ((-1) - (~((-1) - (((-1) - (~iRed)) & ((-1) - i3))))));
                            int i148 = i3 ^ (-86);
                            int i149 = i3 & (-86);
                            int i150 = (i147 | (~((i148 + i149) - (i148 & i149)))) * (-69);
                            int i151 = (((((i144 + i150) - (i144 & i150)) << 1) - (i144 ^ i150)) - (~(-(-((~((-1) - (((-1) - ((85 + iRed) - (85 | iRed))) & ((-1) - (85 ^ iRed))))) * 69))))) - 1;
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                            int i152 = iLastIndexOf * 569;
                            int i153 = (i152 & 569) + (i152 | 569);
                            int i154 = ~iLastIndexOf;
                            int i155 = ~((i154 ^ (-2)) | ((-1) - (((-1) - i154) | ((-1) - (-2)))));
                            int i156 = ~iLastIndexOf;
                            int i157 = ~elapsedCpuTime;
                            int i158 = ~(i156 | i157);
                            int i159 = ~elapsedCpuTime;
                            int i160 = i153 + (((-1) - (((-1) - (~((-1) - (((-1) - ((-2) ^ i159)) & ((-1) - ((-1) - (((-1) - (-2)) | ((-1) - i159)))))))) & ((-1) - ((-1) - (((-1) - (i155 ^ i158)) & ((-1) - (i155 & i158))))))) * (-1136));
                            int i161 = ~((i154 + elapsedCpuTime) - (i154 & elapsedCpuTime));
                            int i162 = ~((-1) - (((-1) - ((-2) ^ elapsedCpuTime)) & ((-1) - (((-2) + elapsedCpuTime) - ((-2) | elapsedCpuTime)))));
                            int i163 = i161 ^ i162;
                            int i164 = (i161 + i162) - (i161 | i162);
                            int i165 = (i163 + i164) - (i163 & i164);
                            int i166 = ~(((-1) - (((-1) - (i159 ^ iLastIndexOf)) & ((-1) - (i159 & iLastIndexOf)))) | 1);
                            int i167 = (i160 - (~(((-1) - (((-1) - (i165 ^ i166)) & ((-1) - ((i165 + i166) - (i165 | i166))))) * (-568)))) - 1;
                            int i168 = i157 ^ iLastIndexOf;
                            int i169 = (-1) - (((-1) - iLastIndexOf) | ((-1) - i157));
                            int i170 = ~((i169 + i168) - (i169 & i168));
                            int i171 = ~((i157 + 1) - (i157 & 1));
                            int i172 = (i171 + i170) - (i171 & i170);
                            int i173 = (i154 ^ (-2)) | ((i154 - 2) - (i154 | (-2)));
                            int i174 = ~((-1) - (((-1) - ((-1) - (((-1) - i173) | ((-1) - elapsedCpuTime)))) & ((-1) - (i173 ^ elapsedCpuTime))));
                            int i175 = i172 ^ i174;
                            int i176 = (i172 + i174) - (i172 | i174);
                            int i177 = ((i176 + i175) - (i176 & i175)) * 568;
                            byte b3 = (byte) ((((-1) - (((-1) - i167) & ((-1) - i177))) << 1) - (i177 ^ i167));
                            int i178 = -((byte) KeyEvent.getModifierMetaStateMask());
                            Object[] objArr9 = new Object[1];
                            r(s5, i151, b3, (i178 ^ (-437182117)) + (((i178 - 437182117) - (i178 | (-437182117))) << 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 626331655, objArr9);
                            objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                            try {
                                char defaultSize2 = (char) View.getDefaultSize(0, 0);
                                int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                                int iMyUid = Process.myUid();
                                int i179 = edgeSlop * (-813);
                                int i180 = (i179 ^ 1751557824) + (((-1) - (((-1) - i179) | ((-1) - 1751557824))) << 1);
                                int i181 = ~((1101029431 ^ edgeSlop) | ((-1) - (((-1) - 1101029431) | ((-1) - edgeSlop))));
                                int i182 = edgeSlop ^ iMyUid;
                                int i183 = edgeSlop & iMyUid;
                                int i184 = (i182 + i183) - (i182 & i183);
                                int i185 = ~i184;
                                int i186 = (i180 - (~(((-1) - (((-1) - ((-1) - (((-1) - i181) | ((-1) - i185)))) & ((-1) - (i181 ^ i185)))) * (-814)))) - 1;
                                int i187 = ~((-1) - (((-1) - 1101029431) & ((-1) - (~iMyUid))));
                                int i188 = ~edgeSlop;
                                int i189 = i188 ^ (-1101029432);
                                int i190 = (i188 - 1101029432) - (i188 | (-1101029432));
                                int i191 = ~((i189 + i190) - (i189 & i190));
                                int i192 = i187 ^ i191;
                                int i193 = (i187 + i191) - (i187 | i191);
                                int i194 = (i193 + i192) - (i193 & i192);
                                int i195 = ~i184;
                                int i196 = -(-(((-1) - (((-1) - (i194 & i195)) & ((-1) - (i194 ^ i195)))) * HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED));
                                int i197 = (i186 ^ i196) + (((-1) - (((-1) - i196) | ((-1) - i186))) << 1);
                                int i198 = ~edgeSlop;
                                int i199 = i198 ^ (-1101029432);
                                int i200 = (i198 - 1101029432) - (i198 | (-1101029432));
                                int i201 = (-1) - (((-1) - (~((i200 + i199) - (i200 & i199)))) & ((-1) - (~((-1) - (((-1) - (i188 ^ iMyUid)) & ((-1) - ((-1) - (((-1) - i188) | ((-1) - iMyUid)))))))));
                                int i202 = ~(((-1) - (((-1) - iMyUid) | ((-1) - (-1101029432)))) | (iMyUid ^ (-1101029432)));
                                int i203 = i201 ^ i202;
                                int i204 = i201 & i202;
                                Object[] objArr10 = new Object[1];
                                s(defaultSize2, "졝徟趾䗄", (i197 - (~(-(-(((i204 + i203) - (i204 & i203)) * HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED))))) - 1, "\u0000\u0000\u0000\u0000", "\uebfd꿐燰쑙迣హ\uf03f\ue8e0ꌹ单ꪎ띏뇢〮\uaad7襄藀\uda62㍴ླ璫뙇㗈", objArr10);
                                Class<?> cls = Class.forName((String) objArr10[0]);
                                short sIndexOf = (short) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                                int i205 = f19388e * 1519088673;
                                f19388e = i205;
                                int i206 = iIndexOf * (-1529);
                                int i207 = ((-1) - (((-1) - i206) | ((-1) - 80984))) + ((-1) - (((-1) - i206) & ((-1) - 80984)));
                                int i208 = ~iIndexOf;
                                int i209 = i208 ^ 105;
                                int i210 = (-1) - (((-1) - i208) | ((-1) - 105));
                                int i211 = (i209 + i210) - (i209 & i210);
                                int i212 = ~i205;
                                int i213 = i211 ^ i212;
                                int i214 = i211 & i212;
                                int i215 = ~((i214 + i213) - (i214 & i213));
                                int i216 = i208 ^ (-106);
                                int i217 = (-106) & i208;
                                int i218 = (i216 + i217) - (i216 & i217);
                                int i219 = ~(((i218 + i205) - (i218 | i205)) | (i218 ^ i205));
                                int i220 = (i215 + i219) - (i215 & i219);
                                int i221 = (105 + iIndexOf) - (105 & iIndexOf);
                                int i222 = i221 ^ i205;
                                int i223 = (-1) - (((-1) - i221) | ((-1) - i205));
                                int i224 = ~((i223 + i222) - (i223 & i222));
                                int i225 = (i207 - (~(((-1) - (((-1) - ((i220 + i224) - (i220 | i224))) & ((-1) - (i220 ^ i224)))) * 765))) - 1;
                                int i226 = ~iIndexOf;
                                int i227 = i226 ^ 105;
                                int i228 = i226 & 105;
                                int i229 = ~((i228 + i227) - (i228 & i227));
                                int i230 = i208 ^ i212;
                                int i231 = (-1) - (((-1) - i208) | ((-1) - i212));
                                int i232 = ~((i230 + i231) - (i230 & i231));
                                int i233 = i225 + (((i229 + i232) - (i229 & i232)) * 1530);
                                int i234 = ~(((i205 + i208) - (i205 | i208)) | (i208 ^ i205));
                                int i235 = (-1) - (((-1) - (105 & i212)) & ((-1) - (105 ^ i212)));
                                int i236 = ~((-1) - (((-1) - ((i235 + iIndexOf) - (i235 | iIndexOf))) & ((-1) - (i235 ^ iIndexOf))));
                                int i237 = i234 ^ i236;
                                int i238 = i234 & i236;
                                int i239 = (i233 - (~(-(-(((i238 + i237) - (i238 & i237)) * 765))))) - 1;
                                byte jumpTapTimeout = (byte) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                int i240 = ((-1) - (((-1) - iIndexOf2) | ((-1) - (-437182118)))) + ((-437182118) | iIndexOf2);
                                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0');
                                int i241 = (iIndexOf3 * (-1529)) - 1776066516;
                                int i242 = ~iIndexOf3;
                                int i243 = (-1) - (((-1) - (i242 ^ (-626331724))) & ((-1) - (i242 & (-626331724))));
                                int i244 = i243 ^ i101;
                                int i245 = i243 & i101;
                                int i246 = (-1) - (((-1) - (~((i245 + i244) - (i245 & i244)))) & ((-1) - (~(((-1) - (((-1) - ((-1) - (((-1) - 626331723) | ((-1) - i242)))) & ((-1) - (i242 ^ 626331723)))) | i3))));
                                int i247 = ((-626331724) & iIndexOf3) | ((-626331724) ^ iIndexOf3);
                                int i248 = i247 ^ i3;
                                int i249 = (-1) - (((-1) - i247) | ((-1) - i3));
                                int i250 = ~((i249 + i248) - (i249 & i248));
                                int i251 = i246 ^ i250;
                                int i252 = (i246 + i250) - (i246 | i250);
                                int i253 = -(-(((i252 + i251) - (i252 & i251)) * 765));
                                int i254 = (((i241 + i253) - (i241 & i253)) << 1) - (i241 ^ i253);
                                int i255 = ~iIndexOf3;
                                int i256 = ~(((-1) - (((-1) - i255) | ((-1) - (-626331724)))) | (i255 ^ (-626331724)));
                                int i257 = ~((i242 ^ i101) | (i242 & i101));
                                int i258 = (i254 - (~(-(-((((-1) - (((-1) - i256) | ((-1) - i257))) | (i256 ^ i257)) * 1530))))) - 1;
                                int i259 = ~((-1) - (((-1) - i242) & ((-1) - i3)));
                                int i260 = ~i3;
                                int i261 = -(-((i259 | (~(iIndexOf3 | ((-1) - (((-1) - ((-1) - (((-1) - (-626331724)) | ((-1) - i260)))) & ((-1) - ((-626331724) ^ i260))))))) * 765));
                                Object[] objArr11 = new Object[1];
                                r(sIndexOf, i239, jumpTapTimeout, i240, ((i258 | i261) << 1) - (i261 ^ i258), objArr11);
                                Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context2, null);
                                try {
                                    Object[] objArr12 = new Object[1];
                                    s((char) View.resolveSizeAndState(0, 0, 0), "졝徟趾䗄", (-1101029433) - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))))), "\u0000\u0000\u0000\u0000", "\uebfd꿐燰쑙迣హ\uf03f\ue8e0ꌹ单ꪎ띏뇢〮\uaad7襄藀\uda62㍴ླ璫뙇㗈", objArr12);
                                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                                    Object[] objArr13 = new Object[1];
                                    s((char) (Color.green(0) + 51737), "ꊀ\ue854ᦎ퇊", ViewConfiguration.getDoubleTapTimeout() >> 16, "\u0000\u0000\u0000\u0000", "찋\uf60e쥰値ज़\ua8ca趀䚣럔됣\ue553ឆ\udb19\uaac6", objArr13);
                                    try {
                                        Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context2, null), 64};
                                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                                        int i262 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int i263 = f19387d * 1388651503;
                                        f19387d = i263;
                                        int i264 = i262 * (-159);
                                        int i265 = ((i264 | 504995787) << 1) - (i264 ^ 504995787);
                                        int i266 = ~i262;
                                        int i267 = (i265 - (~(-(-(((-1) - (((-1) - (i266 & 726157995)) & ((-1) - (i266 ^ 726157995)))) * 160))))) - 1;
                                        int i268 = ~i263;
                                        int i269 = i268 ^ i262;
                                        int i270 = i268 & i262;
                                        int i271 = ~((i269 + i270) - (i269 & i270));
                                        int i272 = ~((726157995 + i262) - (726157995 & i262));
                                        int i273 = -(-((((i271 + i272) - (i271 | i272)) | (i271 ^ i272)) * (-160)));
                                        int i274 = (i267 ^ i273) + (((i273 + i267) - (i273 | i267)) << 1);
                                        int i275 = ~((-1) - (((-1) - ((-1) - (((-1) - i268) | ((-1) - (-726157996))))) & ((-1) - ((-726157996) ^ i268))));
                                        int i276 = -(-(((-1) - (((-1) - ((i262 + i275) - (i262 | i275))) & ((-1) - (i262 ^ i275)))) * 160));
                                        int i277 = (((i274 + i276) - (i274 & i276)) << 1) - (i276 ^ i274);
                                        Object[] objArr15 = new Object[1];
                                        s(cIndexOf, "\uabfb䡊퐫\ue7cc", i277, "\u0000\u0000\u0000\u0000", "Ϛ\uf308䔼蟃磟ꅘ鑭ி빃ꡡࢇ癏⧸쑉峾陲楯䓕⍔田閹㴼赐ꀝ̍뽧ꒉﰷ䃯ꐼ뻅\uee79䡣", objArr15);
                                        Class<?> cls3 = Class.forName((String) objArr15[0]);
                                        short maximumFlingVelocity = (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        int offsetBefore = TextUtils.getOffsetBefore("", 0);
                                        byte bResolveOpacity = (byte) Drawable.resolveOpacity(0, 0);
                                        int iIndexOf4 = (-437182120) - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                        int i278 = -KeyEvent.normalizeMetaState(0);
                                        int i279 = (i278 & 626331738) + (i278 | 626331738);
                                        Object[] objArr16 = new Object[1];
                                        r(maximumFlingVelocity, (((offsetBefore - 110) - ((-110) & offsetBefore)) << 1) - (offsetBefore ^ (-110)), bResolveOpacity, iIndexOf4, i279, objArr16);
                                        Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                        Object[] objArr17 = new Object[1];
                                        s((char) (22768 - (~(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), "癩旳\uf2e1㉘", View.getDefaultSize(0, 0), "\u0000\u0000\u0000\u0000", "⟽棅偳ᕣꁙⲀꁰ솆ߓ杅㰫㲊쒫\uf6a3锟鳋㬮፬\ud854䣃怿צּꋼ峗识鷕㙍캁垴ჾ", objArr17);
                                        Class<?> cls4 = Class.forName((String) objArr17[0]);
                                        short s6 = (short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                        int i280 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        byte scrollBarSize = (byte) (ViewConfiguration.getScrollBarSize() >> 8);
                                        int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                        int i281 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                                        int i282 = (i281 & 626331751) + ((i281 + 626331751) - (i281 & 626331751));
                                        Object[] objArr18 = new Object[1];
                                        r(s6, ((i280 - 113) - ((-113) | i280)) + ((-1) - (((-1) - i280) & ((-1) - (-113)))), scrollBarSize, (keyRepeatTimeout ^ (-437182107)) + (((keyRepeatTimeout - 437182107) - (keyRepeatTimeout | (-437182107))) << 1), i282, objArr18);
                                        Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                        int length = objArr19.length;
                                        for (int i283 = 0; i283 < length; i283 = ((i283 & 1) << 1) + (i283 ^ 1)) {
                                            Object obj = objArr19[i283];
                                            short keyRepeatTimeout2 = (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                                            int i284 = (absoluteGravity ^ (-119)) + ((absoluteGravity & (-119)) << 1);
                                            byte b4 = (byte) ((-2) - ((-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))) ^ (-1)));
                                            int i285 = (-437182135) - (~(-Color.argb(0, 0, 0, 0)));
                                            int i286 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            int i287 = i286 * 471;
                                            int i288 = ((-1) - (((-1) - i287) | ((-1) - (-1350484464)))) + ((i287 - 1350484464) - (i287 & (-1350484464)));
                                            int i289 = -(-(((i286 ^ 626331760) | ((i286 + 626331760) - (i286 | 626331760))) * (-470)));
                                            int i290 = (((-1) - (((-1) - i288) & ((-1) - i289))) << 1) - (i288 ^ i289);
                                            int i291 = ~i286;
                                            int i292 = i291 ^ (-626331761);
                                            int i293 = (i291 - 626331761) - (i291 | (-626331761));
                                            int i294 = ~((i292 + i293) - (i292 & i293));
                                            int i295 = (-626331761) ^ i3;
                                            int i296 = (-1) - (((-1) - (-626331761)) | ((-1) - i3));
                                            int i297 = ~((i295 + i296) - (i295 & i296));
                                            int i298 = (i294 ^ i297) | (i297 & i294);
                                            int i299 = (i260 + i286) - (i260 & i286);
                                            int i300 = i299 ^ 626331760;
                                            int i301 = (i299 + 626331760) - (i299 | 626331760);
                                            int i302 = i290 + (((-1) - (((-1) - i298) & ((-1) - (~((i300 + i301) - (i300 & i301)))))) * (-470));
                                            int i303 = (-626331761) ^ i286;
                                            int i304 = (-1) - (((-1) - (-626331761)) | ((-1) - i286));
                                            int i305 = (i304 + i303) - (i304 & i303);
                                            int i306 = ~((-1) - (((-1) - (i305 & i3)) & ((-1) - (i305 ^ i3))));
                                            int i307 = i260 ^ i286;
                                            int i308 = (-1) - (((-1) - i286) | ((-1) - i260));
                                            int i309 = (i308 + i307) - (i308 & i307);
                                            int i310 = ~((i309 & 626331760) | (i309 ^ 626331760));
                                            int i311 = ((-1) - (((-1) - ((-1) - (((-1) - i310) | ((-1) - i306)))) & ((-1) - (i306 ^ i310)))) * 470;
                                            int i312 = ((-1) - (((-1) - i302) | ((-1) - i311))) + ((i302 + i311) - (i302 & i311));
                                            Object[] objArr20 = new Object[1];
                                            r(keyRepeatTimeout2, i284, b4, i285, i312, objArr20);
                                            try {
                                                Object[] objArr21 = {(String) objArr20[0]};
                                                short sArgb = (short) Color.argb(0, 0, 0, 0);
                                                int i313 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                int i314 = f19386c * (-1140649463);
                                                f19386c = i314;
                                                int i315 = i313 * 477;
                                                int i316 = ((-1) - (((-1) - i315) | ((-1) - 41325))) + ((i315 + 41325) - (i315 & 41325));
                                                int i317 = ~i313;
                                                int i318 = ~((-1) - (((-1) - ((i317 - 87) - (i317 | (-87)))) & ((-1) - (i317 ^ (-87)))));
                                                int i319 = (-1) - (((-1) - (86 ^ i313)) & ((-1) - ((-1) - (((-1) - 86) | ((-1) - i313)))));
                                                int i320 = ~((i319 ^ i314) | ((-1) - (((-1) - i319) | ((-1) - i314))));
                                                int i321 = i318 ^ i320;
                                                int i322 = (-1) - (((-1) - i318) | ((-1) - i320));
                                                int i323 = (i316 - (~(((i321 + i322) - (i321 & i322)) * (-476)))) - 1;
                                                int i324 = i320 * 952;
                                                int i325 = ((i323 + i324) - (i323 | i324)) + ((-1) - (((-1) - i323) & ((-1) - i324)));
                                                int i326 = ~i314;
                                                int i327 = (-1) - (((-1) - (86 ^ i326)) & ((-1) - ((i326 + 86) - (i326 | 86))));
                                                int i328 = i325 + ((~(((i313 + i327) - (i313 | i327)) | (i327 ^ i313))) * 476);
                                                byte bResolveSizeAndState = (byte) View.resolveSizeAndState(0, 0, 0);
                                                int i329 = -Color.red(0);
                                                int i330 = ((i329 - 437182116) - (i329 | (-437182116))) + ((i329 - 437182116) - (i329 & (-437182116)));
                                                int i331 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                int i332 = ((-1) - (((-1) - i331) | ((-1) - 626331764))) + (i331 | 626331764);
                                                Object[] objArr22 = new Object[1];
                                                r(sArgb, i328, bResolveSizeAndState, i330, i332, objArr22);
                                                Class<?> cls5 = Class.forName((String) objArr22[0]);
                                                Object[] objArr23 = new Object[1];
                                                s((char) Color.alpha(0), "箋൫嚩覈", ExpandableListView.getPackedPositionGroup(0L) - 1458738309, "\u0000\u0000\u0000\u0000", "艞꘩熠灯ᠽ윃㏙␇Ŕ氘\ue5f5", objArr23);
                                                Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                                try {
                                                    short maxKeyCode = (short) (KeyEvent.getMaxKeyCode() >> 16);
                                                    int i333 = -TextUtils.indexOf((CharSequence) "", '0');
                                                    int i334 = f19384a * (-1321767422);
                                                    f19384a = i334;
                                                    int i335 = i333 * 370;
                                                    int i336 = (i335 ^ (-35890)) + (((i335 - 35890) - (i335 | (-35890))) << 1);
                                                    int i337 = (-97) | i333;
                                                    int i338 = ~i334;
                                                    int i339 = i337 ^ i338;
                                                    int i340 = i338 & i337;
                                                    int i341 = ((i339 + i340) - (i339 & i340)) * (-369);
                                                    int i342 = ((i336 | i341) << 1) - (i336 ^ i341);
                                                    int i343 = ~i333;
                                                    int i344 = ~i334;
                                                    int i345 = ~((-1) - (((-1) - i343) & ((-1) - i344)));
                                                    int i346 = ((i345 ^ (-97)) | (i345 & (-97))) * (-369);
                                                    int i347 = (i342 ^ i346) + (((i346 + i342) - (i346 | i342)) << 1);
                                                    int i348 = ~(((96 + i333) - (96 | i333)) | (96 ^ i333));
                                                    int i349 = ~((-1) - (((-1) - (i333 & i334)) & ((-1) - (i333 ^ i334))));
                                                    int i350 = (-1) - (((-1) - (i348 & i349)) & ((-1) - (i348 ^ i349)));
                                                    int i351 = i343 ^ i344;
                                                    int i352 = (i343 + i344) - (i343 | i344);
                                                    int i353 = ~(((i352 + i351) - (i352 & i351)) | (-97));
                                                    int i354 = i350 ^ i353;
                                                    int i355 = (-1) - (((-1) - i353) | ((-1) - i350));
                                                    int i356 = (i347 - (~(((i355 + i354) - (i355 & i354)) * 369))) - 1;
                                                    byte b5 = (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    int iBlue = Color.blue(0);
                                                    int i357 = iBlue * ExifDirectoryBase.TAG_PRIMARY_CHROMATICITIES;
                                                    int i358 = ((i357 | 1147780153) << 1) - (i357 ^ 1147780153);
                                                    int i359 = ~iBlue;
                                                    int i360 = i359 ^ i3;
                                                    int i361 = (-1) - (((-1) - i359) | ((-1) - i3));
                                                    int i362 = ~((i361 + i360) - (i361 & i360));
                                                    int i363 = 437182124 ^ i362;
                                                    int i364 = (i362 + 437182124) - (i362 | 437182124);
                                                    int i365 = i358 + (((i364 + i363) - (i364 & i363)) * (-318));
                                                    int i366 = ~((437182124 + i3) - (437182124 & i3));
                                                    int i367 = (i260 ^ iBlue) | ((i260 + iBlue) - (i260 | iBlue));
                                                    int i368 = ~((i367 ^ (-437182125)) | (i367 & (-437182125)));
                                                    int i369 = ((i366 ^ i368) | ((i366 + i368) - (i366 | i368))) * 318;
                                                    int i370 = (i365 & i369) + ((i369 + i365) - (i369 & i365));
                                                    int i371 = 437182124 | i101;
                                                    int i372 = ~((-1) - (((-1) - ((i371 + iBlue) - (i371 | iBlue))) & ((-1) - (i371 ^ iBlue))));
                                                    int i373 = ~((-1) - (((-1) - ((-1) - (((-1) - (iBlue & (-437182125))) & ((-1) - (iBlue ^ (-437182125)))))) & ((-1) - i3)));
                                                    int i374 = ((-1) - (((-1) - (i372 & i373)) & ((-1) - (i372 ^ i373)))) * 318;
                                                    Object[] objArr24 = new Object[1];
                                                    r(maxKeyCode, i356, b5, (i370 ^ i374) + (((-1) - (((-1) - i374) | ((-1) - i370))) << 1), 626331799 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16)))), objArr24);
                                                    Class<?> cls6 = Class.forName((String) objArr24[0]);
                                                    Object[] objArr25 = new Object[1];
                                                    s((char) (ViewConfiguration.getTouchSlop() >> 8), "轎칢Ꞧ\ue125", (-1496423792) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", "⚐ș嚩玹犫ꧦ摸䞎黉簤춦", objArr25);
                                                    try {
                                                        Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                        int i375 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                        int i376 = ((i375 | (-87)) << 1) - (i375 ^ (-87));
                                                        byte bArgb = (byte) Color.argb(0, 0, 0, 0);
                                                        int iKeyCodeFromString = (-437182116) - KeyEvent.keyCodeFromString("");
                                                        int i377 = -Process.getGidForName("");
                                                        int i378 = (i377 & 626331763) + ((i377 + 626331763) - (i377 & 626331763));
                                                        Object[] objArr27 = new Object[1];
                                                        r((short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), i376, bArgb, iKeyCodeFromString, i378, objArr27);
                                                        Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                        int i379 = -Color.argb(0, 0, 0, 0);
                                                        int i380 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int i381 = f19393j * 843762480;
                                                        f19393j = i381;
                                                        int i382 = i380 * (-300);
                                                        int i383 = (i382 ^ 1420802780) + (((i382 + 1420802780) - (i382 | 1420802780)) << 1);
                                                        int i384 = i380 ^ 1114000834;
                                                        int i385 = 1114000834 & i380;
                                                        int i386 = (i385 + i384) - (i385 & i384);
                                                        int i387 = i386 ^ i381;
                                                        int i388 = (i386 + i381) - (i386 | i381);
                                                        int i389 = (~((i388 + i387) - (i388 & i387))) * (-301);
                                                        int i390 = (i383 & i389) + (i389 | i383);
                                                        int i391 = (-1114000835) ^ i381;
                                                        int i392 = ((-1114000835) + i381) - ((-1114000835) | i381);
                                                        int i393 = ~((i392 + i391) - (i392 & i391));
                                                        int i394 = ~i381;
                                                        int i395 = ~((-1) - (((-1) - (i394 ^ i380)) & ((-1) - ((i394 + i380) - (i394 | i380)))));
                                                        int i396 = ((-1) - (((-1) - (i393 ^ i395)) & ((-1) - ((-1) - (((-1) - i393) | ((-1) - i395)))))) * (-301);
                                                        int i397 = (((-1) - (((-1) - i390) & ((-1) - i396))) << 1) - (i396 ^ i390);
                                                        int i398 = ~((~i380) | i381);
                                                        int i399 = (i397 - (~(((i398 & (-1114000835)) | ((-1114000835) ^ i398)) * 301))) - 1;
                                                        Object[] objArr28 = new Object[1];
                                                        s((char) ((((-1) - (((-1) - i379) & ((-1) - 45269))) << 1) - (i379 ^ 45269)), "싰晍핂늰", i399, "\u0000\u0000\u0000\u0000", "㇙魡盛窸麿趜禌稐ﴰ戛蘥抲ӵ\ude2b\ued5d益ᕦ펠媙", objArr28);
                                                        Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                        int length2 = objArr3.length;
                                                        int i400 = 0;
                                                        for (int i401 = 2; i400 < i401; i401 = 2) {
                                                            Object obj2 = objArr3[i400];
                                                            try {
                                                                Object[] objArr29 = new Object[1];
                                                                s((char) TextUtils.getCapsMode("", 0, 0), "\ue722祟ᵜ㣮", ViewConfiguration.getLongPressTimeout() >> 16, "\u0000\u0000\u0000\u0000", "쒐긮䱘蠲ࠕ倂邺㗁쇆ߒ\ueaa1砮琇\ueccc\ue2ab豐ᱡ빜\u0d64℻箏邿\uf22b᭗⇙뛶炝鬡Ϯ\udff6㒝坨獳\uebec", objArr29);
                                                                Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                                short offsetBefore2 = (short) TextUtils.getOffsetBefore("", 0);
                                                                int i402 = (-102) - (~(-(-(Process.myTid() >> 22))));
                                                                byte b6 = (byte) ((-2) - ((-TextUtils.indexOf((CharSequence) "", '0', 0, 0)) ^ (-1)));
                                                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                                                int i403 = iResolveSizeAndState * 1773;
                                                                int i404 = ((i403 + 359118675) - (i403 | 359118675)) + (i403 | 359118675);
                                                                int i405 = ~iResolveSizeAndState;
                                                                int i406 = ~((i405 ^ 437182118) | ((i405 + 437182118) - (i405 | 437182118)));
                                                                int i407 = ~((437182118 ^ i3) | (437182118 & i3));
                                                                int i408 = i406 ^ i407;
                                                                int i409 = i407 & i406;
                                                                int i410 = (i408 + i409) - (i408 & i409);
                                                                int i411 = i101 ^ iResolveSizeAndState;
                                                                int i412 = i101 & iResolveSizeAndState;
                                                                int i413 = (i411 + i412) - (i411 & i412);
                                                                int i414 = i413 ^ (-437182119);
                                                                int i415 = i413 & (-437182119);
                                                                int i416 = ~((i414 + i415) - (i414 & i415));
                                                                int i417 = -(-(((i410 + i416) - (i410 & i416)) * 886));
                                                                int i418 = ((i404 + i417) - (i404 | i417)) + ((i404 + i417) - (i404 & i417));
                                                                int i419 = ~((i260 - 437182119) - (i260 & (-437182119)));
                                                                int i420 = ((iResolveSizeAndState ^ i419) | ((-1) - (((-1) - i419) | ((-1) - iResolveSizeAndState)))) * (-1772);
                                                                int i421 = ((((i418 + i420) - (i418 & i420)) << 1) - (i420 ^ i418)) + ((~((iResolveSizeAndState + i101) - (iResolveSizeAndState & i101))) * 886);
                                                                int maximumFlingVelocity2 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                                                Object[] objArr30 = new Object[1];
                                                                r(offsetBefore2, i402, b6, i421, ((maximumFlingVelocity2 | 626331827) << 1) - (maximumFlingVelocity2 ^ 626331827), objArr30);
                                                                if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                                    Object[] objArr31 = {new int[1], new int[]{i3}, null, new int[]{(~((-1) - (((-1) - i3) | ((-1) - 1)))) & ((i3 + 1) - (1 & i3))}};
                                                                    int i422 = ~(Process.myTid() | 237536247);
                                                                    int i423 = ((((-1) - (((-1) - 342601801) & ((-1) - i422))) * (-658)) - 662348089) + (((i422 + 272838664) - (i422 & 272838664)) * 658);
                                                                    int i424 = ((-1) - (((-1) - i423) | ((-1) - 16))) + (i423 | 16) + i4;
                                                                    int i425 = i424 ^ (i424 << 13);
                                                                    int i426 = i425 >>> 17;
                                                                    int i427 = (-1) - (((-1) - (~i426)) | ((-1) - i425));
                                                                    int i428 = ~i425;
                                                                    int i429 = ((i428 + i426) - (i428 | i426)) | i427;
                                                                    int i430 = i429 << 5;
                                                                    int i431 = (~i430) & i429;
                                                                    int i432 = (~i429) & i430;
                                                                    ((int[]) objArr31[0])[0] = (i432 + i431) - (i432 & i431);
                                                                    return objArr31;
                                                                }
                                                                i400 = ((i400 + 1) - (i400 & 1)) + (i400 & 1);
                                                            } catch (Throwable th) {
                                                                Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        }
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
                Object[] objArr32 = {new int[]{(i + i) - (i & i)}, new int[]{i3}, null, new int[]{i3}};
                int i433 = f19399p * 34148925;
                f19399p = i433;
                int i434 = ~i433;
                int i435 = ~((27680829 + i434) - (27680829 & i434));
                int i436 = (-1424959103) + ((i435 | 650467192) * 764) + (((-1) - (((-1) - (~((i434 + 650467192) - (i434 & 650467192)))) & ((-1) - 19013637))) * (-1528)) + (((660813637 + i435) - (660813637 & i435)) * 764);
                int i437 = f19390g * 692975464;
                f19390g = i437;
                int i438 = i436 * (-1939);
                int i439 = -(-(i4 * 971));
                int i440 = ((i438 | i439) << 1) - (i438 ^ i439);
                int i441 = ~((~i4) | i436);
                int i442 = ~i437;
                int i443 = i442 ^ i4;
                int i444 = (i442 + i4) - (i442 | i4);
                int i445 = ~((i444 + i443) - (i444 & i443));
                int i446 = (i440 - (~(-(-(((-1) - (((-1) - (i441 & i445)) & ((-1) - (i441 ^ i445)))) * (-970)))))) - 1;
                int i447 = ~i436;
                int i448 = (i446 - (~((~((i447 & i4) | (i447 ^ i4))) * 1940))) - 1;
                int i449 = ~i436;
                int i450 = ~i4;
                int i451 = ~((-1) - (((-1) - (i449 & i450)) & ((-1) - (i449 ^ i450))));
                int i452 = ~i437;
                int i453 = ~((-1) - (((-1) - ((i452 + i4) - (i452 | i4))) & ((-1) - (i452 ^ i4))));
                int i454 = ((-1) - (((-1) - (i453 & i451)) & ((-1) - (i451 ^ i453)))) * 970;
                int i455 = ((i448 | i454) << 1) - (i454 ^ i448);
                int i456 = i455 << 13;
                int i457 = ~i456;
                int i458 = ((-1) - (((-1) - i456) | ((-1) - (~i455)))) | ((i457 + i455) - (i457 | i455));
                int i459 = i458 >>> 17;
                int i460 = (-1) - (((-1) - ((i458 + i459) - (i458 & i459))) | ((-1) - (~((i458 + i459) - (i458 | i459)))));
                int i461 = i460 << 5;
                int i462 = ~i461;
                int i463 = (i462 + i460) - (i462 | i460);
                int i464 = ~i460;
                int i465 = (i464 + i461) - (i464 | i461);
                return objArr32;
            }

            static void init$0() {
                $$a = new byte[]{60, -17, 3, Ascii.NAK};
                $$b = 43;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x00a0 A[PHI: r3
  0x00a0: PHI (r3v26 byte[] A[IMMUTABLE_TYPE]) = (r3v20 byte[]), (r3v28 byte[]) binds: [B:34:0x0170, B:15:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x017b  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x01e6  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void r(short r25, int r26, byte r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 830
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlUpdate.AnonymousClass1.r(short, int, byte, int, int, java.lang.Object[]):void");
            }

            private static void s(char c2, String str, int i3, String str2, String str3, Object[] objArr) throws Throwable {
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                char c3 = 2;
                int i4 = 2 % 2;
                int i5 = $10;
                int i6 = i5 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                Object charArray = str6;
                if (str6 != null) {
                    int i8 = i5 + 7;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    charArray = str6.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str5;
                if (str5 != null) {
                    charArray2 = str5.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str4;
                if (str4 != null) {
                    charArray3 = str4.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                i iVar = new i();
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int length2 = cArr2.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr3, 0, cArr4, 0, length);
                System.arraycopy(cArr2, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c2);
                cArr5[2] = (char) (cArr5[2] + ((char) i3));
                int length3 = cArr.length;
                char[] cArr6 = new char[length3];
                iVar.f19932b = 0;
                while (iVar.f19932b < length3) {
                    try {
                        Object[] objArr2 = {iVar};
                        Object objA = d.a(540069882);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = d.a(105 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -155898465, false, $$c(b2, b3, b3), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {iVar};
                        Object objA2 = d.a(2068572);
                        if (objA2 == null) {
                            int deadChar = 847 - KeyEvent.getDeadChar(0, 0);
                            char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6488);
                            int iMyPid = 12 - (Process.myPid() >> 22);
                            byte b4 = $$a[c3];
                            objA2 = d.a(deadChar, maximumDrawingCacheSize, iMyPid, -694521287, false, $$c((byte) 0, b4, (byte) (b4 - 3)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {iVar, Integer.valueOf(cArr4[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objA3 = d.a(-1122996612);
                        if (objA3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 1);
                            objA3 = d.a(458 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, 1804962841, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objA4 = d.a(-1223178239);
                        if (objA4 == null) {
                            byte b7 = (byte) 0;
                            objA4 = d.a(640 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65100), 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1636969060, false, $$c(b7, (byte) (57 | b7), b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = iVar.f19933e;
                        cArr6[iVar.f19932b] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iVar.f19932b])) ^ (f19397n ^ 740602047300126166L)) ^ ((long) ((int) (((long) f19396m) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f19398o) ^ 740602047300126166L))));
                        iVar.f19932b++;
                        c3 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                String str7 = new String(cArr6);
                int i10 = $11 + 61;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                objArr[0] = str7;
            }

            @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
            public CustomerAuthenticationPrompt buildCustomerAuthenticationPrompt(CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationPromptBuilder customerAuthenticationPromptBuilder) {
                int i3 = 2 % 2;
                int i4 = f19401t + 99;
                f19400q = i4 % 128;
                int i5 = i4 % 2;
                CustomerAuthenticationPrompt customerAuthenticationPromptBuild = customerAuthenticationPromptBuilder.build();
                int i6 = f19401t + 13;
                f19400q = i6 % 128;
                if (i6 % 2 != 0) {
                    return customerAuthenticationPromptBuild;
                }
                throw null;
            }

            @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
            public void onAuthenticationDeclined(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i3 = 2 % 2;
                int i4 = f19401t + 79;
                f19400q = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
            public void onError(AntelopError antelopError, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i3 = 2 % 2;
                int i4 = f19400q + 49;
                f19401t = i4 % 128;
                int i5 = i4 % 2;
                operationCallback.onError(antelopError);
                int i6 = f19401t + 73;
                f19400q = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 11 / 0;
                }
            }

            @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
            public void onProcessStart(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i3 = 2 % 2;
                int i4 = f19400q + 95;
                f19401t = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback
            public void onProcessSuccess(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i3 = 2 % 2;
                int i4 = f19400q + 69;
                f19401t = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    operationCallback.onSuccess(null);
                    obj.hashCode();
                    throw null;
                }
                operationCallback.onSuccess(null);
                int i5 = f19401t + 71;
                f19400q = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i3 = f19367j + 115;
        f19365h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
    }

    final a<T> getInner() {
        int i2 = 2 % 2;
        int i3 = f19365h + 75;
        int i4 = i3 % 128;
        f19367j = i4;
        int i5 = i3 % 2;
        a<T> aVar = this.innerTransactionControlUpdate;
        int i6 = i4 + 11;
        f19365h = i6 % 128;
        if (i6 % 2 == 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SecureTransactionControlUpdateCommit getSecureTransactionControlUpdateCommit() throws WalletValidationException {
        int i2 = 2 % 2;
        SecureTransactionControlUpdateCommit secureTransactionControlUpdateCommit = new SecureTransactionControlUpdateCommit(this.innerTransactionControlUpdate.d());
        int i3 = f19367j + 73;
        f19365h = i3 % 128;
        int i4 = i3 % 2;
        return secureTransactionControlUpdateCommit;
    }

    public final T getValue() {
        int i2 = 2 % 2;
        int i3 = f19365h + 81;
        f19367j = i3 % 128;
        int i4 = i3 % 2;
        T tC = this.innerTransactionControlUpdate.c();
        if (i4 == 0) {
            int i5 = 97 / 0;
        }
        return tC;
    }
}
