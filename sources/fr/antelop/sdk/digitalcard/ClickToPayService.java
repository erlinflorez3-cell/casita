package fr.antelop.sdk.digitalcard;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import o.a.m;
import o.a.n;
import o.d.d;
import o.er.k;
import o.er.l;
import o.er.o;

/* JADX INFO: loaded from: classes5.dex */
public class ClickToPayService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f19050a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19051b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f19052c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f19053d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f19054e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f19055f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f19056g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f19057h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f19058j = 0;
    private final l innerService;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r8, short r9, int r10) {
        /*
            int r8 = r8 * 3
            int r1 = r8 + 1
            int r0 = r10 * 3
            int r7 = 4 - r0
            int r0 = 120 - r9
            byte[] r6 = fr.antelop.sdk.digitalcard.ClickToPayService.$$c
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L27
            r1 = r7
            r3 = r4
        L13:
            int r7 = r7 + r0
            int r1 = r1 + 1
            r2 = r3
        L17:
            byte r0 = (byte) r7
            r5[r2] = r0
            int r3 = r2 + 1
            if (r2 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r0 = r6[r1]
            goto L13
        L27:
            r2 = r4
            r1 = r7
            r7 = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayService.$$e(int, short, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f19057h = -1934654217;
        f19056g = -2025181905;
        f19055f = 582276784;
        init$0();
        f19052c = 0;
        f19058j = 1;
        f19050a = 0;
        f19054e = 1;
        a();
        f19051b = -1270219387;
        int i2 = f19052c + 39;
        f19058j = i2 % 128;
        int i3 = i2 % 2;
    }

    public ClickToPayService(l lVar) {
        this.innerService = lVar;
    }

    static void a() {
        f19053d = new char[]{56500, 56558, 56539, 56532, 56547, 56555, 56558, 56551, 56550, 56555, 56538, 56537, 56558, 56558, 56553, 56548, 56555, 56556, 56548, 56566, 56422, 56417, 56418, 56425, 56422, 56414, 56399, 56406, 56427, 56405, 56401, 56421, 56422, 56425, 56425, 56416, 56423, 56496, 56551, 56553, 56555, 56560, 56556, 56550, 56521, 56526, 56561, 56528, 56505, 56532, 56547, 56555, 56558, 56531, 56351, 56344, 56342, 56349, 56359, 56349, 56349, 56357, 56349, 56351, 56358, 56359, 56352, 56573, 56575, 56350, 56351, 56346, 56342, 56349, 56359, 56325, 56575, 56354, 56351, 56343, 56344, 56573, 56321, 56348, 56349, 56356, 56351, 56348, 56321, 56325, 56362, 56362, 56325, 56504, 56559, 56558, 56340, 56745, 56749, 56748, 56742, 56748, 56750, 56743, 56743, 56745, 56743, 56750, 56760, 56754, 56719, 56722, 56749, 56750, 56757, 56752, 56749, 56722, 56726, 56763, 56763, 56726, 56718, 56750, 56757, 56758, 56724, 56527, 56573, 56569, 56340, 56343, 56348, 56341, 56340, 56569, 56565, 56336, 56335, 56343, 56346, 56567, 56573, 56351, 56341, 56334, 56338, 56343, 56342, 56567, 56573, 56351, 56341, 56334, 56338, 56343, 56342, 56335, 56339, 56346, 56570, 56573, 56354};
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:83|34)|(1:36)(4:37|87|38|(8:40|84|46|(1:48)(8:52|92|53|54|55|(4:94|59|(2:61|62)(4:67|89|68|69)|(2:65|66))|73|74)|49|(0)|73|74)(1:41))|45|84|46|(0)(0)|49|(0)|73|74) */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0431 A[Catch: Exception -> 0x042d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x042d, blocks: (B:46:0x0401, B:52:0x0431, B:54:0x046b, B:57:0x047d, B:58:0x0483, B:53:0x043b), top: B:84:0x0401, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0484 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] a(int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayService.a(int, int):java.lang.Object[]");
    }

    private static void i(int[] iArr, String str, boolean z2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i2 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            int i3 = $10 + 77;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = f19053d;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                    Object objA = d.a(-2071388435);
                    if (objA == null) {
                        int absoluteGravity = 249 - Gravity.getAbsoluteGravity(i5, i5);
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(i5, i5);
                        int mode = View.MeasureSpec.getMode(i5) + 11;
                        byte length2 = (byte) $$c.length;
                        objA = d.a(absoluteGravity, cCombineMeasuredStates, mode, 1376582792, false, $$e((byte) i5, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    i5 = 0;
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
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i6, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i7) {
                if (bArr[mVar.f19943d] == 1) {
                    int i11 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = d.a(120026474);
                    if (objA2 == null) {
                        objA2 = d.a(11 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 10 - (ViewConfiguration.getLongPressTimeout() >> 16), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = d.a(1632715197);
                    if (objA3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA3 = d.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 836, (char) (TextUtils.getTrimmedLength("") + 27279), 10 - ImageFormat.getBitsPerPixel(0), -1210801192, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = d.a((Process.myPid() >> 22) + 21, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 35715), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            int i13 = $10 + 71;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr5 = new char[i7];
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i15 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i15, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i15);
        }
        if (z2) {
            int i16 = $11 + 89;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr6 = new char[i7];
            int i18 = 0;
            while (true) {
                mVar.f19943d = i18;
                if (mVar.f19943d >= i7) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) - 1];
                i18 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i19 = $10 + 103;
            $11 = i19 % 128;
            mVar.f19943d = i19 % 2 == 0 ? 1 : 0;
            int i20 = $11 + 57;
            $10 = i20 % 128;
            char c3 = 2;
            if (i20 % 2 != 0) {
                int i21 = 2 % 3;
            }
            while (mVar.f19943d < i7) {
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[c3]);
                mVar.f19943d++;
                c3 = 2;
            }
        }
        String str3 = new String(cArr3);
        int i22 = $11 + 85;
        $10 = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
        objArr[0] = str3;
    }

    static void init$0() {
        $$a = new byte[]{37, -107, Ascii.NAK, -25};
        $$b = 227;
    }

    static void init$1() {
        $$c = new byte[]{93, 121, -117, 60};
        $$d = 255;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r2 = r7 * 4
            int r1 = 1 - r2
            int r0 = r8 * 4
            int r8 = r0 + 100
            byte[] r7 = fr.antelop.sdk.digitalcard.ClickToPayService.$$a
            int r0 = r6 * 2
            int r6 = 3 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L30
            r2 = r8
            r1 = r4
            r0 = r6
        L18:
            int r6 = r6 + r2
            r8 = r6
            r6 = r0
        L1b:
            byte r0 = (byte) r8
            r5[r1] = r0
            if (r1 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r9[r4] = r0
            return
        L28:
            int r0 = r6 + 1
            int r1 = r1 + 1
            r2 = r7[r0]
            r6 = r8
            goto L18
        L30:
            r1 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayService.k(short, byte, int, java.lang.Object[]):void");
    }

    private static void l(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i6 = $10 + 17;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i7 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(f19051b)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 5);
                    objA = d.a(270 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0') + 12, -2071844881, false, $$e(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    objA2 = d.a(522 - View.resolveSize(0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 627984172, false, $$e(b4, (byte) ((b4 + 7) - (7 & b4)), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i8 = $11 + 103;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            int i10 = $11 + 31;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
            int i12 = $10 + 121;
            $11 = i12 % 128;
            int i13 = i12 % 2;
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = d.a(-202660535);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    objA3 = d.a(522 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.combineMeasuredStates(0, 0) + 12, 627984172, false, $$e(b5, (byte) ((b5 + 7) - (7 & b5)), b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[PHI: r2
  0x002c: PHI (r2v1 o.er.l) = (r2v0 o.er.l), (r2v4 o.er.l) binds: [B:10:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 o.er.l) = (r2v0 o.er.l), (r2v4 o.er.l) binds: [B:10:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fr.antelop.sdk.digitalcard.ClickToPayCardProfile buildCardProfile(java.lang.String r6, fr.antelop.sdk.digitalcard.ClickToPayCardProfile.BillingAddress.Builder r7) throws fr.antelop.sdk.exception.WalletValidationException {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r3 = fr.antelop.sdk.digitalcard.ClickToPayService.f19054e
            int r1 = r3 + 59
            int r0 = r1 % 128
            fr.antelop.sdk.digitalcard.ClickToPayService.f19050a = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L27
            o.er.l r2 = r5.innerService
            r0 = 98
            int r0 = r0 / 0
            if (r7 != 0) goto L2c
        L16:
            int r1 = r3 + 21
            int r0 = r1 % 128
            fr.antelop.sdk.digitalcard.ClickToPayService.f19050a = r0
            int r1 = r1 % r4
            r0 = 0
        L1e:
            o.er.o r0 = r2.e(r6, r0)
            fr.antelop.sdk.digitalcard.ClickToPayCardProfile r0 = r0.b()
            return r0
        L27:
            o.er.l r2 = r5.innerService
            if (r7 != 0) goto L2c
            goto L16
        L2c:
            fr.antelop.sdk.digitalcard.ClickToPayCardProfile$BillingAddress r0 = r7.build()
            o.er.o$e r0 = r0.getInnerBillingAddress()
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayService.buildCardProfile(java.lang.String, fr.antelop.sdk.digitalcard.ClickToPayCardProfile$BillingAddress$Builder):fr.antelop.sdk.digitalcard.ClickToPayCardProfile");
    }

    public void getCardProfile(final OperationCallback<ClickToPayCardProfile> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        this.innerService.e(new OperationCallback<o>() { // from class: fr.antelop.sdk.digitalcard.ClickToPayService.1
            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                operationCallback.onError(antelopError);
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onSuccess(o oVar) {
                operationCallback.onSuccess(oVar.b());
            }
        });
        int i3 = f19050a + 81;
        f19054e = i3 % 128;
        int i4 = i3 % 2;
    }

    public DigitalCardServiceStatus getStatus() {
        int i2 = 2 % 2;
        int i3 = f19054e + 65;
        f19050a = i3 % 128;
        int i4 = i3 % 2;
        if (!this.innerService.c()) {
            return DigitalCardServiceStatus.Disabled;
        }
        int i5 = f19050a + 39;
        f19054e = i5 % 128;
        if (i5 % 2 != 0) {
            return DigitalCardServiceStatus.Active;
        }
        DigitalCardServiceStatus digitalCardServiceStatus = DigitalCardServiceStatus.Active;
        throw null;
    }

    public void isCardIn(OperationCallback<Boolean> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19054e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f19050a = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerService.a(operationCallback);
            throw null;
        }
        this.innerService.a(operationCallback);
        int i4 = f19050a + 19;
        f19054e = i4 % 128;
        int i5 = i4 % 2;
    }

    public void pushCard(ClickToPayCustomerProfile clickToPayCustomerProfile, ClickToPayCardProfile clickToPayCardProfile, ClickToPayComplianceSettings clickToPayComplianceSettings, final OperationCallback<ClickToPayPushCardNotProcessed> operationCallback) throws Throwable {
        o.er.n innerClickToPayComplianceSettings;
        int i2 = 2 % 2;
        int i3 = f19050a + 77;
        f19054e = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.innerService;
        k innerCustomerProfile = clickToPayCustomerProfile.getInnerCustomerProfile();
        o innerCardProfile = clickToPayCardProfile.getInnerCardProfile();
        if (clickToPayComplianceSettings == null) {
            int i5 = f19050a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f19054e = i5 % 128;
            int i6 = i5 % 2;
            innerClickToPayComplianceSettings = null;
        } else {
            innerClickToPayComplianceSettings = clickToPayComplianceSettings.getInnerClickToPayComplianceSettings();
            int i7 = f19054e + 1;
            f19050a = i7 % 128;
            int i8 = i7 % 2;
        }
        lVar.b(innerCustomerProfile, innerCardProfile, innerClickToPayComplianceSettings, new OperationCallback<o.er.m>() { // from class: fr.antelop.sdk.digitalcard.ClickToPayService.2
            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                operationCallback.onError(antelopError);
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onSuccess(o.er.m mVar) {
                operationCallback.onSuccess(mVar == null ? null : mVar.d());
            }
        });
    }

    public void removeCard(OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19054e + 71;
        f19050a = i3 % 128;
        int i4 = i3 % 2;
        this.innerService.b(operationCallback);
        int i5 = f19050a + 87;
        f19054e = i5 % 128;
        int i6 = i5 % 2;
    }
}
