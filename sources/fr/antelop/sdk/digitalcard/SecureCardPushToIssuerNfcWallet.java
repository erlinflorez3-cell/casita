package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import o.a.g;
import o.a.k;
import o.d.d;
import o.ea.m;
import o.x.i;
import o.x.j;
import o.y.a;

/* JADX INFO: loaded from: classes5.dex */
public final class SecureCardPushToIssuerNfcWallet implements CustomerAuthenticatedProcess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f19151a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f19152b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f19153c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f19154d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f19155e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19156f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f19157g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f19158h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f19159i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f19160j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f19161k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f19162l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f19163m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f19164n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f19165o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f19166p = 0;
    private final a innerSecureCardPushToIssuerNfcWallet;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(byte r9, byte r10, short r11) {
        /*
            byte[] r8 = fr.antelop.sdk.digitalcard.SecureCardPushToIssuerNfcWallet.$$c
            int r0 = r9 * 2
            int r7 = 3 - r0
            int r2 = 114 - r10
            int r0 = r11 * 4
            int r6 = 1 - r0
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L28
            r3 = r7
            r0 = r6
            r2 = r4
        L14:
            int r7 = r7 + r0
            r1 = r2
        L16:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r5[r1] = r0
            int r3 = r3 + 1
            if (r2 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            r0 = r8[r3]
            goto L14
        L28:
            r1 = r4
            r3 = r7
            r7 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardPushToIssuerNfcWallet.$$e(byte, byte, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f19166p = -1973155335;
        f19165o = 1763418386;
        f19164n = -1576044770;
        f19163m = 1188532001;
        f19162l = 1857637509;
        f19161k = -304915082;
        f19159i = -1238973549;
        init$0();
        f19158h = 0;
        f19156f = 1;
        f19160j = 0;
        f19157g = 1;
        a();
        f19154d = -8101770578925505350L;
        int i2 = f19158h + 73;
        f19156f = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SecureCardPushToIssuerNfcWallet(a aVar) {
        this.innerSecureCardPushToIssuerNfcWallet = aVar;
    }

    static void a() {
        f19152b = (char) 3675;
        f19153c = (char) 59179;
        f19151a = (char) 59997;
        f19155e = (char) 55154;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] c(android.content.Context r28, int r29, int r30, int r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardPushToIssuerNfcWallet.c(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{108, -10, -111, 117};
        $$b = 65;
    }

    static void init$1() {
        $$c = new byte[]{117, -127, -11, 113};
        $$d = 221;
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 63;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i7 = $11 + 21;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr3[i6] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i9 = 58224;
            int i10 = i6;
            while (i10 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i6];
                int i11 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) f19151a) ^ (-7511683281764982996L))));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f19155e);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i6] = Integer.valueOf(c2);
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        int i13 = 271 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(i6);
                        int maxKeyCode = 11 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b2 = (byte) i6;
                        String str$$e = $$e(b2, (byte) (45 | b2), b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i6] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = d.a(i13, cNormalizeMetaState, maxKeyCode, -1995022631, false, str$$e, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f19152b) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f19153c)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = d.a(TextUtils.getTrimmedLength("") + 270, (char) View.resolveSize(0, 0), 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1995022631, false, $$e(b3, (byte) (45 | b3), b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    int i14 = $11 + 21;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 2 / 3;
                    }
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
                byte b4 = (byte) 0;
                objA3 = d.a(ImageFormat.getBitsPerPixel(0) + 271, (char) (AndroidCharacter.getMirror('0') - '0'), 11 - (KeyEvent.getMaxKeyCode() >> 16), -2074123590, false, $$e(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 42))), b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void r(byte r8, int r9, byte r10, java.lang.Object[] r11) {
        /*
            byte[] r7 = fr.antelop.sdk.digitalcard.SecureCardPushToIssuerNfcWallet.$$a
            int r2 = r8 * 2
            int r1 = 1 - r2
            int r0 = r10 * 2
            int r6 = 4 - r0
            int r5 = r9 + 97
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r7 != 0) goto L2b
            r0 = r5
            r1 = r3
            r5 = r2
        L16:
            int r6 = r6 + 1
            int r5 = r5 + r0
        L19:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r2) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L26:
            int r1 = r1 + 1
            r0 = r7[r6]
            goto L16
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardPushToIssuerNfcWallet.r(byte, int, byte, java.lang.Object[]):void");
    }

    private static void s(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $11 + 87;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f19154d ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i6 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f19154d)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a(229 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (51003 - TextUtils.indexOf((CharSequence) "", '0')), (KeyEvent.getMaxKeyCode() >> 16) + 9, 1749983833, false, $$e(b2, (byte) ((b2 + 7) - (7 & b2)), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA2 = d.a(674 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) View.getDefaultSize(0, 0), 12 - ExpandableListView.getPackedPositionType(0L), 522683165, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i7 = $10 + 43;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() {
        int i2 = 2 % 2;
        int i3 = f19157g + 113;
        f19160j = i3 % 128;
        int i4 = i3 % 2;
        List<CustomerAuthenticationMethodType> listB = m.b(this.innerSecureCardPushToIssuerNfcWallet.d());
        int i5 = f19160j + 19;
        f19157g = i5 % 128;
        int i6 = i5 % 2;
        return listB;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        int i2 = 2 % 2;
        int i3 = f19160j + 99;
        f19157g = i3 % 128;
        int i4 = i3 % 2;
        String strG = this.innerSecureCardPushToIssuerNfcWallet.g();
        if (i4 == 0) {
            int i5 = 58 / 0;
        }
        return strG;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = f19160j;
        int i4 = i3 + 25;
        f19157g = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 95;
        f19157g = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        int i2 = 2 % 2;
        int i3 = f19157g + 125;
        f19160j = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerSecureCardPushToIssuerNfcWallet};
            int i4 = i.f26925h * 601961010;
            i.f26925h = i4;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int iNextInt = new Random().nextInt(1592817291);
            int i5 = i.f26927j * 826423998;
            i.f26927j = i5;
            ((Boolean) i.c(-571425008, i4, 571425009, iFreeMemory, i5, iNextInt, objArr)).booleanValue();
            throw null;
        }
        Object[] objArr2 = {this.innerSecureCardPushToIssuerNfcWallet};
        int i6 = i.f26925h * 601961010;
        i.f26925h = i6;
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int iNextInt2 = new Random().nextInt(1592817291);
        int i7 = i.f26927j * 826423998;
        i.f26927j = i7;
        if (((Boolean) i.c(-571425008, i6, 571425009, iFreeMemory2, i7, iNextInt2, objArr2)).booleanValue()) {
            return false;
        }
        int i8 = f19160j + 93;
        f19157g = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 36 / 0;
        }
        return true;
    }

    public final void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        this.innerSecureCardPushToIssuerNfcWallet.d(context, new o.x.d(context, customCustomerAuthenticatedProcessCallback, this, this.innerSecureCardPushToIssuerNfcWallet));
        int i3 = f19157g + 61;
        f19160j = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void launch(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        this.innerSecureCardPushToIssuerNfcWallet.d(context, new j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerSecureCardPushToIssuerNfcWallet));
        int i3 = f19157g + 103;
        f19160j = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void requireTermsAndConditionsApproval(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f19157g + 3;
        f19160j = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerSecureCardPushToIssuerNfcWallet.a(z2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.innerSecureCardPushToIssuerNfcWallet.a(z2);
        int i4 = f19157g + 65;
        f19160j = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19160j + 5;
        f19157g = i3 % 128;
        int i4 = i3 % 2;
        this.innerSecureCardPushToIssuerNfcWallet.e(context, customerAuthenticationCredentials);
        int i5 = f19157g + 55;
        f19160j = i5 % 128;
        int i6 = i5 % 2;
    }
}
