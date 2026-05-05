package fr.antelop.sdk.sca;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.exception.WalletValidationDomain;
import java.lang.reflect.Method;
import java.util.List;
import o.a.g;
import o.d.d;
import o.ea.f;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomerAuthenticatedSignature implements CustomerAuthenticatedProcess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f19504a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f19505b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f19506c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f19507d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f19508e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19509f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f19510g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f19511h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f19512i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f19513j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f19514k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f19515l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f19516m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f19517n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f19518o = 0;
    private final String TAG = WalletValidationDomain.DIGITAL_CARD;

    public enum SignatureType {
        LocalJws
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r9, short r10, byte r11) {
        /*
            byte[] r8 = fr.antelop.sdk.sca.CustomerAuthenticatedSignature.$$c
            int r0 = r9 * 3
            int r7 = 72 - r0
            int r0 = r10 * 4
            int r6 = r0 + 4
            int r1 = r11 * 3
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r8 != 0) goto L2d
            r7 = r6
            r0 = r3
            r2 = r4
        L18:
            int r6 = r6 + 1
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
        L1d:
            byte r0 = (byte) r7
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L2a:
            r0 = r8[r6]
            goto L18
        L2d:
            r1 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.sca.CustomerAuthenticatedSignature.$$e(int, short, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f19517n = -775311848;
        f19516m = 1675935578;
        f19514k = -530940190;
        init$0();
        f19518o = 0;
        f19515l = 1;
        f19509f = 0;
        f19512i = 1;
        e();
        f19505b = (char) 50988;
        f19508e = (char) 28900;
        f19507d = (char) 45936;
        f19504a = (char) 42395;
        int i2 = f19518o + 73;
        f19515l = i2 % 128;
        int i3 = i2 % 2;
    }

    public CustomerAuthenticatedSignature(String str, String str2, SignatureType signatureType, byte[] bArr) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.DIGITAL_CARD, "CustomerAuthenticatedSignature - Not supported : Feature SCA Disabled");
        }
    }

    static void e() {
        f19506c = (char) 1935;
        f19510g = (char) 7957;
        f19511h = (char) 53279;
        f19513j = (char) 44959;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] e(android.content.Context r26, int r27, int r28, int r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.sca.CustomerAuthenticatedSignature.e(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{Ascii.CR, Ascii.ESC, 39, 17};
        $$b = 48;
    }

    static void init$1() {
        $$c = new byte[]{Ascii.ETB, 117, 49, -107};
        $$d = 240;
    }

    private static void p(String str, int i2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i6 = $11 + 55;
            $10 = i6 % 128;
            int i7 = 58224;
            if (i6 % i4 != 0) {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[0] = cArr[gVar.f19924d];
                i3 = 1;
            } else {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
                i3 = 0;
            }
            while (i3 < 16) {
                int i8 = $10 + 79;
                $11 = i8 % 128;
                int i9 = i8 % i4;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i10 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) f19511h) ^ (-7511683281764982996L))));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f19513j);
                    objArr2[i4] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objA = d.a(271 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, -1995022631, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) f19506c) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f19510g)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = d.a(View.resolveSizeAndState(0, 0, 0) + 270, (char) Color.alpha(0), 10 - MotionEvent.axisFromString(""), -1995022631, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i3++;
                    int i12 = $10 + 21;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 2;
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
                int i14 = 271 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                char cGreen = (char) Color.green(0);
                int deadChar = 11 - KeyEvent.getDeadChar(0, 0);
                byte b6 = (byte) 0;
                byte b7 = b6;
                String str$$e = $$e(b6, b7, b7);
                i4 = 2;
                objA3 = d.a(i14, cGreen, deadChar, -2074123590, false, str$$e, new Class[]{Object.class, Object.class});
            } else {
                i4 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r2 = r7 * 3
            int r1 = 1 - r2
            int r0 = r6 * 4
            int r7 = 4 - r0
            int r0 = 101 - r8
            byte[] r6 = fr.antelop.sdk.sca.CustomerAuthenticatedSignature.$$a
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L2c
            r2 = r7
            r1 = r3
            r0 = r4
        L16:
            int r7 = r7 + r1
            int r2 = r2 + 1
            r1 = r0
        L1a:
            byte r0 = (byte) r7
            r5[r1] = r0
            int r0 = r1 + 1
            if (r1 != r3) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r9[r4] = r0
            return
        L29:
            r1 = r6[r2]
            goto L16
        L2c:
            r1 = r4
            r2 = r7
            r7 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.sca.CustomerAuthenticatedSignature.q(short, byte, byte, java.lang.Object[]):void");
    }

    private static void r(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i6] = cArr[gVar.f19924d];
            int i7 = 1;
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = 58224;
            int i9 = i6;
            while (i9 < 16) {
                int i10 = $11 + 21;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c2 = cArr3[i7];
                char c3 = cArr3[i6];
                int i12 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) f19507d) ^ (-7511683281764982996L))));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f19504a);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[i7] = Integer.valueOf(i12);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 270;
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 11;
                        byte b2 = (byte) i7;
                        byte b3 = (byte) (b2 - 1);
                        String str$$e = $$e(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[i7] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = d.a(maximumFlingVelocity, cNormalizeMetaState, absoluteGravity, -1995022631, false, str$$e, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[i7] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f19505b) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f19508e)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = d.a(270 - TextUtils.indexOf("", "", 0, 0), (char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, -1995022631, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    int i14 = $10 + 53;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i6 = 0;
                    i7 = 1;
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
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = d.a(ExpandableListView.getPackedPositionType(0L) + 270, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 11 - ExpandableListView.getPackedPositionGroup(0L), -2074123590, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19512i + 93;
        f19509f = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (f.a()) {
            int i5 = f19509f + 123;
            f19512i = i5 % 128;
            if (i5 % 2 == 0) {
                f.d(WalletValidationDomain.DIGITAL_CARD, "getAuthenticatedMethods - Not supported : Feature SCA Disabled");
                obj.hashCode();
                throw null;
            }
            f.d(WalletValidationDomain.DIGITAL_CARD, "getAuthenticatedMethods - Not supported : Feature SCA Disabled");
        }
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19512i + 75;
        f19509f = i3 % 128;
        int i4 = i3 % 2;
        if (!f.a()) {
            return "";
        }
        int i5 = f19512i + 111;
        f19509f = i5 % 128;
        int i6 = i5 % 2;
        f.d(WalletValidationDomain.DIGITAL_CARD, "getCustomerAuthenticationPatternName - Not supported : Feature SCA Disabled");
        return "";
    }

    public final byte[] getInputData() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19509f + 19;
        f19512i = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            f.d(WalletValidationDomain.DIGITAL_CARD, "getInputData - Not supported : Feature SCA Disabled");
            int i5 = f19512i + 115;
            f19509f = i5 % 128;
            int i6 = i5 % 2;
        }
        return new byte[0];
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19512i + 105;
        f19509f = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            f.d(WalletValidationDomain.DIGITAL_CARD, "getMessage - Not supported : Feature SCA Disabled");
        }
        int i5 = f19512i + 63;
        f19509f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return "";
    }

    public final String getResult() throws Throwable {
        int i2 = 2 % 2;
        if (!(!f.a())) {
            int i3 = f19512i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f19509f = i3 % 128;
            int i4 = i3 % 2;
            f.d(WalletValidationDomain.DIGITAL_CARD, "getResult - Not supported : Feature SCA Disabled");
            int i5 = f19512i + 51;
            f19509f = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = f19509f + 47;
        f19512i = i7 % 128;
        int i8 = i7 % 2;
        return "";
    }

    public final SignatureType getType() throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f19509f + 109;
            f19512i = i3 % 128;
            if (i3 % 2 == 0) {
                f.d(WalletValidationDomain.DIGITAL_CARD, "getType - Not supported : Feature SCA Disabled");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            f.d(WalletValidationDomain.DIGITAL_CARD, "getType - Not supported : Feature SCA Disabled");
            int i4 = f19509f + 117;
            f19512i = i4 % 128;
            int i5 = i4 % 2;
        }
        return SignatureType.LocalJws;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19509f + 31;
        f19512i = i3 % 128;
        int i4 = i3 % 2;
        if (!f.a()) {
            return false;
        }
        f.d(WalletValidationDomain.DIGITAL_CARD, "isOnline - Not supported : Feature SCA Disabled");
        int i5 = f19512i + 71;
        f19509f = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19512i + 125;
        f19509f = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
            if (!f.a()) {
                return;
            }
        } else if (!f.a()) {
            return;
        }
        f.d(WalletValidationDomain.DIGITAL_CARD, "setCustomerCredentials - Not supported : Feature SCA Disabled");
        int i5 = f19509f + 33;
        f19512i = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setOnlineAuthentication(boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19512i + 19;
        f19509f = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (f.a()) {
            int i5 = f19509f + 65;
            f19512i = i5 % 128;
            if (i5 % 2 == 0) {
                f.d(WalletValidationDomain.DIGITAL_CARD, "setOnlineAuthentication - Not supported : Feature SCA Disabled");
                throw null;
            }
            f.d(WalletValidationDomain.DIGITAL_CARD, "setOnlineAuthentication - Not supported : Feature SCA Disabled");
        }
        int i6 = f19512i + 51;
        f19509f = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void sign(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19512i + 45;
        f19509f = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f19509f + 105;
            f19512i = i5 % 128;
            if (i5 % 2 == 0) {
                f.d(WalletValidationDomain.DIGITAL_CARD, "sign - Not supported : Feature SCA Disabled");
                throw null;
            }
            f.d(WalletValidationDomain.DIGITAL_CARD, "sign - Not supported : Feature SCA Disabled");
        }
        int i6 = f19512i + 31;
        f19509f = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void sign(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19512i + 23;
        f19509f = i3 % 128;
        int i4 = i3 % 2;
        if (!(!f.a())) {
            int i5 = f19509f + 29;
            f19512i = i5 % 128;
            int i6 = i5 % 2;
            f.d(WalletValidationDomain.DIGITAL_CARD, "sign - Not supported : Feature SCA Disabled");
        }
    }
}
