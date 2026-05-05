package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.imageutils.JfifUtil;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import o.a.f;
import o.a.g;
import o.d.d;
import o.ea.m;
import o.x.i;
import o.x.j;
import o.y.q;

/* JADX INFO: loaded from: classes5.dex */
public final class SecurePinUpdate implements CustomerAuthenticatedProcess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f19188a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f19189b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f19190c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f19191d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f19192e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f19193f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f19194g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f19195h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f19196i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f19197j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f19198k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f19199l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f19200m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f19201o = 0;
    private final q innerSecurePinUpdate;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r9, byte r10, int r11) {
        /*
            int r0 = r10 * 3
            int r8 = 4 - r0
            int r0 = r11 * 2
            int r7 = 1 - r0
            int r6 = 73 - r9
            byte[] r5 = fr.antelop.sdk.digitalcard.SecurePinUpdate.$$c
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r5 != 0) goto L29
            r2 = r8
            r6 = r7
            r1 = r3
        L14:
            int r6 = r6 + r8
            int r8 = r2 + 1
        L17:
            byte r0 = (byte) r6
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r5[r8]
            r2 = r8
            r8 = r0
            goto L14
        L29:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecurePinUpdate.$$e(int, byte, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f19200m = -1542610146;
        f19198k = 393519611;
        init$0();
        f19201o = 0;
        f19199l = 1;
        f19197j = 0;
        f19195h = 1;
        d();
        f19192e = (char) 24214;
        f19190c = (char) 11545;
        f19191d = (char) 12242;
        f19188a = (char) 36342;
        int i2 = f19199l + 61;
        f19201o = i2 % 128;
        int i3 = i2 % 2;
    }

    public SecurePinUpdate(q qVar) {
        this.innerSecurePinUpdate = qVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:89|31|(1:33)(4:36|92|37|(7:39|84|45|(2:47|54)(4:48|82|49|50)|(5:85|56|(1:58)(6:65|86|66|67|68|(2:61|(2:63|64)))|59|(0))|72|73)(2:40|41))|34|35|84|45|(0)(0)|(0)|72|73) */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0135: ARITH (r4 I:??[int, boolean]) = (r9 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:15:0x0135 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0427 A[Catch: Exception -> 0x045c, TRY_LEAVE, TryCatch #1 {Exception -> 0x045c, blocks: (B:45:0x0407, B:48:0x0427, B:50:0x044d, B:52:0x0455, B:53:0x045b, B:49:0x0431), top: B:84:0x0407, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x045f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] a(int r29, int r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecurePinUpdate.a(int, int):java.lang.Object[]");
    }

    static void d() {
        f19189b = new char[]{2306, 2312, 2361, 2310, 2331, 2550, 2308, 2315, 2360, 2316, 2319, 2328, 2313, 2329, 2548, 2330, 2343, 2383, 2380, 2546, 2304, 2305, 2332, 2317, 2311};
        f19196i = 2040400253;
        f19193f = true;
        f19194g = true;
    }

    static void init$0() {
        $$a = new byte[]{90, 91, 103, -77};
        $$b = JfifUtil.MARKER_RST7;
    }

    static void init$1() {
        $$c = new byte[]{108, -10, -111, 117};
        $$d = 9;
    }

    private static void n(int[] iArr, String str, int i2, String str2, Object[] objArr) throws Throwable {
        int i3;
        char[] cArr;
        char[] charArray;
        String str3 = str;
        String str4 = str2;
        int i4 = 2 % 2;
        int i5 = $10 + 55;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        int i7 = 0;
        Object obj = str3;
        if (str3 != null) {
            int i8 = $11 + 15;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 25 / 0;
                charArray = str3.toCharArray();
            } else {
                charArray = str3.toCharArray();
            }
            int i10 = $10 + 81;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            obj = charArray;
        }
        char[] cArr2 = (char[]) obj;
        f fVar = new f();
        char[] cArr3 = f19189b;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i12])};
                    Object objA = d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i7;
                        objA = d.a(MotionEvent.axisFromString("") + 594, (char) (View.resolveSizeAndState(i7, i7, i7) + 13181), View.MeasureSpec.getSize(i7) + 11, -1225586509, false, $$e((byte) ($$d - 3), b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i12++;
                    i7 = 0;
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
        Object[] objArr3 = {Integer.valueOf(f19196i)};
        Object objA2 = d.a(-1503702982);
        if (objA2 == null) {
            objA2 = d.a((-16777184) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f19194g) {
            int i13 = $11 + 107;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                fVar.f19923e = bArr.length;
                cArr = new char[fVar.f19923e];
                i3 = 0;
            } else {
                i3 = 0;
                fVar.f19923e = bArr.length;
                cArr = new char[fVar.f19923e];
            }
            fVar.f19922a = i3;
            while (fVar.f19922a < fVar.f19923e) {
                cArr[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = d.a(1540807955);
                if (objA3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA3 = d.a(458 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 11 - TextUtils.indexOf("", "", 0, 0), -1923924106, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr);
            return;
        }
        int i14 = 0;
        if (f19193f) {
            fVar.f19923e = cArr2.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = d.a(1540807955);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA4 = d.a(TextUtils.getTrimmedLength("") + 458, (char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.getTrimmedLength("") + 11, -1923924106, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i14;
            if (fVar.f19922a >= fVar.f19923e) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i14 = fVar.f19922a + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r0 = r8 * 4
            int r8 = 4 - r0
            int r0 = r7 * 2
            int r7 = 100 - r0
            byte[] r6 = fr.antelop.sdk.digitalcard.SecurePinUpdate.$$a
            int r1 = r9 * 4
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r6 != 0) goto L2e
            r1 = r8
            r0 = r3
            r2 = r4
        L18:
            int r0 = -r0
            int r8 = r8 + r0
            int r1 = r1 + 1
        L1c:
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r2 != r3) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r10[r4] = r0
            return
        L29:
            int r2 = r2 + 1
            r0 = r6[r1]
            goto L18
        L2e:
            r2 = r4
            r1 = r8
            r8 = r7
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecurePinUpdate.p(int, short, short, java.lang.Object[]):void");
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 121;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i6] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i7 = 58224;
            int i8 = i6;
            while (i8 < 16) {
                int i9 = $11 + 41;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i6];
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) f19191d) ^ (-7511683281764982996L))));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f19188a);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i6] = Integer.valueOf(c2);
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        int iArgb = Color.argb(i6, i6, i6, i6) + 270;
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i6, i6) + 1);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11;
                        byte length = (byte) $$c.length;
                        byte b2 = (byte) (length - 4);
                        String str$$e = $$e(length, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i6] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = d.a(iArgb, cLastIndexOf, keyRepeatDelay, -1995022631, false, str$$e, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) f19192e) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f19190c)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 270;
                        char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i13 = 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        byte length2 = (byte) $$c.length;
                        byte b3 = (byte) (length2 - 4);
                        objA2 = d.a(scrollDefaultDelay, c4, i13, -1995022631, false, $$e(length2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    int i14 = $11 + 69;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    i6 = 0;
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
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = d.a(1390051551);
            if (objA3 == null) {
                int iLastIndexOf = 269 - TextUtils.lastIndexOf("", '0', 0, 0);
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 11;
                byte b4 = (byte) ($$d & 7);
                byte b5 = (byte) (b4 - 1);
                objA3 = d.a(iLastIndexOf, keyRepeatTimeout, maxKeyCode, -2074123590, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() {
        int i2 = 2 % 2;
        int i3 = f19197j + 109;
        f19195h = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            m.b(this.innerSecurePinUpdate.d());
            throw null;
        }
        List<CustomerAuthenticationMethodType> listB = m.b(this.innerSecurePinUpdate.d());
        int i4 = f19197j + 5;
        f19195h = i4 % 128;
        if (i4 % 2 != 0) {
            return listB;
        }
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        int i2 = 2 % 2;
        int i3 = f19195h + 45;
        f19197j = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerSecurePinUpdate.g();
            throw null;
        }
        String strG = this.innerSecurePinUpdate.g();
        int i4 = f19195h + 29;
        f19197j = i4 % 128;
        int i5 = i4 % 2;
        return strG;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = f19195h + 35;
        f19197j = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        int i4 = 86 / 0;
        return null;
    }

    public final int getRemainingAttemptNumber() {
        int i2 = 2 % 2;
        int i3 = f19195h + 21;
        f19197j = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerSecurePinUpdate.l();
            throw null;
        }
        int iL = this.innerSecurePinUpdate.l();
        int i4 = f19195h + 39;
        f19197j = i4 % 128;
        int i5 = i4 % 2;
        return iL;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        int i2 = 2 % 2;
        int i3 = f19197j + 9;
        f19195h = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerSecurePinUpdate};
            int i4 = i.f26925h * 601961010;
            i.f26925h = i4;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int iNextInt = new Random().nextInt(1592817291);
            int i5 = i.f26927j * 826423998;
            i.f26927j = i5;
            ((Boolean) i.c(-571425008, i4, 571425009, iFreeMemory, i5, iNextInt, objArr)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.innerSecurePinUpdate};
        int i6 = i.f26925h * 601961010;
        i.f26925h = i6;
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int iNextInt2 = new Random().nextInt(1592817291);
        int i7 = i.f26927j * 826423998;
        i.f26927j = i7;
        if (((Boolean) i.c(-571425008, i6, 571425009, iFreeMemory2, i7, iNextInt2, objArr2)).booleanValue()) {
            return false;
        }
        int i8 = f19195h + 115;
        f19197j = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public final void launch(Context context, SecurePinInput securePinInput, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        this.innerSecurePinUpdate.c(context, securePinInput, new o.x.d(context, customCustomerAuthenticatedProcessCallback, this, this.innerSecurePinUpdate));
        int i3 = f19197j + 35;
        f19195h = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void launch(Context context, SecurePinInput securePinInput, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        this.innerSecurePinUpdate.a(context, securePinInput, new j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerSecurePinUpdate));
        int i3 = f19197j + 23;
        f19195h = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setActivityCallback(CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) {
        int i2 = 2 % 2;
        int i3 = f19195h + 85;
        f19197j = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerSecurePinUpdate.a(customerAuthenticatedProcessActivityCallback);
        } else {
            this.innerSecurePinUpdate.a(customerAuthenticatedProcessActivityCallback);
            throw null;
        }
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19197j + 71;
        f19195h = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerSecurePinUpdate.e(context, customerAuthenticationCredentials);
            return;
        }
        this.innerSecurePinUpdate.e(context, customerAuthenticationCredentials);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
