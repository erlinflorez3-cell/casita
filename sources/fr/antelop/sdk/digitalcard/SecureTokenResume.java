package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import o.a.i;
import o.a.k;
import o.a.m;
import o.d.d;
import o.ea.f;
import o.x.j;
import o.y.l;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class SecureTokenResume implements CustomerAuthenticatedProcess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f19202a = 0;

    /* JADX INFO: renamed from: b */
    private static long f19203b = 0;

    /* JADX INFO: renamed from: c */
    private static char[] f19204c = null;

    /* JADX INFO: renamed from: d */
    private static char f19205d = 0;

    /* JADX INFO: renamed from: e */
    private static long f19206e = 0;

    /* JADX INFO: renamed from: f */
    public static int f19207f = 0;

    /* JADX INFO: renamed from: g */
    private static int f19208g = 0;

    /* JADX INFO: renamed from: h */
    private static int f19209h = 0;

    /* JADX INFO: renamed from: i */
    private static int f19210i = 0;

    /* JADX INFO: renamed from: j */
    private static int f19211j = 0;

    /* JADX INFO: renamed from: k */
    public static int f19212k = 0;

    /* JADX INFO: renamed from: l */
    public static int f19213l = 0;

    /* JADX INFO: renamed from: m */
    public static int f19214m = 0;
    private final l innerTokenResumeProcess;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r7, short r8, short r9) {
        /*
            int r0 = r7 + 65
            int r8 = r8 * 4
            int r2 = r8 + 1
            int r1 = r9 * 4
            int r7 = 4 - r1
            byte[] r6 = fr.antelop.sdk.digitalcard.SecureTokenResume.$$c
            byte[] r5 = new byte[r2]
            r4 = 0
            if (r6 != 0) goto L2b
            r3 = r8
            r1 = r7
            r2 = r4
        L14:
            int r7 = r7 + r3
            int r1 = r1 + 1
            r0 = r7
            r7 = r1
        L19:
            byte r1 = (byte) r0
            r5[r2] = r1
            if (r2 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r3 = r6[r7]
            int r2 = r2 + 1
            r1 = r7
            r7 = r0
            goto L14
        L2b:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureTokenResume.$$g(short, short, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f19214m = -1504328254;
        f19213l = -491288397;
        f19212k = -1929661639;
        f19207f = -968966828;
        init$0();
        f19211j = 0;
        f19210i = 1;
        f19208g = 0;
        f19209h = 1;
        a();
        f19203b = 7022970036914765725L;
        int i2 = f19210i + 43;
        f19211j = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
    }

    public SecureTokenResume(l lVar) {
        this.innerTokenResumeProcess = lVar;
    }

    static void a() {
        f19204c = new char[]{56501, 56551, 56553, 56557, 56535, 56536, 56553, 56556, 56563, 56566, 56550, 56512, 56528, 56561, 56526, 56521, 56550, 56556, 56560, 56555, 56553, 56551, 56498, 56553, 56555, 56558, 56560, 56550, 56547, 56539, 56539, 56548, 56556, 56561, 56552, 56550, 56552, 56471, 56521, 56550, 56556, 56560, 56555, 56553, 56551, 56548, 56558, 56555, 56547, 56532, 56505, 56528, 56561, 56564, 56715, 56752, 56752, 56715, 56711, 56738, 56741, 56746, 56739, 56738, 56711, 56707, 56734, 56733, 56741, 56744, 56709, 56715, 56749, 56739, 56732, 56736, 56741, 56740, 56709, 56715, 56749, 56739, 56732, 56736, 56741, 56740, 56733, 56737, 56744};
        f19206e = 3183398697244558619L;
        f19202a = 1564493270;
        f19205d = (char) 17878;
    }

    public static void b(Context context, long j2, long j3) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19208g + 77;
        f19209h = i3 % 128;
        int i4 = i3 % 2;
        long j4 = j2 ^ (j3 << 32);
        try {
            f.class.getMethod("a", null).setAccessible(true);
            if (!(!((Boolean) r2.invoke(null, null)).booleanValue())) {
                int i5 = f19208g + 47;
                f19209h = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                r("龢鱣瑮鿪\u31eb⃡⿏⤿⡺礪杰\ue1d5\uf0f9脈뼁塣뤘", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                Object objNewInstance = declaredConstructor.newInstance(null);
                Object[] objArr2 = new Object[1];
                r("랄\ueb05ﴵ럶䚃又Ꚉ娍P軩\uee30鋲\ud8f8\uf67f㙇⭀鄳㿊翲挥槔板윫뮅⇧ꢙ಄챊暑ხ否ү닠", TextUtils.getCapsMode("", 0, 0) + 1, objArr2);
                Object[] objArr3 = {(String) objArr2[0]};
                Object[] objArr4 = new Object[1];
                r("\uec80\uf72d\u0fed\uece1媺뱘呓떈孲鋊", 1 - KeyEvent.keyCodeFromString(""), objArr4);
                Method method = StringBuilder.class.getMethod((String) objArr4[0], String.class);
                method.setAccessible(true);
                Object objInvoke = method.invoke(objNewInstance, objArr3);
                Object[] objArr5 = {Long.valueOf(j4)};
                Object[] objArr6 = new Object[1];
                r("\uec80\uf72d\u0fed\uece1媺뱘呓떈孲鋊", View.MeasureSpec.getMode(0) + 1, objArr6);
                Method method2 = StringBuilder.class.getMethod((String) objArr6[0], Long.TYPE);
                method2.setAccessible(true);
                Object objInvoke2 = method2.invoke(objInvoke, objArr5);
                Object[] objArr7 = new Object[1];
                r("濶饶磝澂㓾團⍀廙\ud818ﲜ毙阮", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr7);
                Method method3 = StringBuilder.class.getMethod((String) objArr7[0], null);
                method3.setAccessible(true);
                Object[] objArr8 = {strIntern, method3.invoke(objInvoke2, null)};
                Method method4 = f.class.getMethod("c", String.class, Object.class);
                method4.setAccessible(true);
                method4.invoke(null, objArr8);
                int i7 = f19209h + 61;
                f19208g = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 / 5;
                }
            }
            byte b2 = (byte) 0;
            byte b3 = (byte) ((b2 + 6) - (6 & b2));
            byte b4 = (byte) (b3 - 1);
            Object[] objArr9 = new Object[1];
            q(b2, b3, b4, objArr9);
            Class<?> cls = Class.forName((String) objArr9[0]);
            byte[] bArr = $$d;
            byte b5 = (byte) (-bArr[5]);
            Object[] objArr10 = new Object[1];
            q(b5, (byte) (b5 + 4), b2, objArr10);
            Method method5 = cls.getMethod((String) objArr10[0], null);
            method5.setAccessible(true);
            Object objInvoke3 = method5.invoke(null, null);
            int i9 = (int) j4;
            Object[] objArr11 = new Object[1];
            q(b2, b3, b4, objArr11);
            Class.forName((String) objArr11[0]).getField("d").setInt(objInvoke3, i9);
            Object[] objArr12 = new Object[1];
            q(b2, b3, b4, objArr12);
            Class<?> cls2 = Class.forName((String) objArr12[0]);
            byte b6 = (byte) (-bArr[5]);
            Object[] objArr13 = new Object[1];
            q(b6, (byte) (b6 + 4), b2, objArr13);
            Method method6 = cls2.getMethod((String) objArr13[0], null);
            method6.setAccessible(true);
            Object objInvoke4 = method6.invoke(null, null);
            Object[] objArr14 = new Object[1];
            q(b2, b3, b4, objArr14);
            Class.forName((String) objArr14[0]).getField("b").setBoolean(objInvoke4, true);
            int i10 = f19209h + 35;
            f19208g = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:192|136)|(1:138)(6:139|199|140|(1:142)(1:146)|143|(9:145|147|195|153|(1:155)(7:156|197|157|158|(6:164|196|165|(1:167)(5:176|204|177|178|(2:(1:171)(1:175)|(2:182|183)))|168|(0))|173|174)|162|(0)|173|174)(1:148))|152|195|153|(0)(0)|162|(0)|173|174) */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0497 A[Catch: Exception -> 0x04ce, TRY_LEAVE, TryCatch #2 {Exception -> 0x04ce, blocks: (B:153:0x0460, B:156:0x0497, B:158:0x04bf, B:160:0x04c7, B:161:0x04cd, B:157:0x04a1), top: B:195:0x0460, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] e(int r26, int r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureTokenResume.e(int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{69, -20, MessagePack.Code.INT64, -20};
        $$b = 199;
    }

    static void init$1() {
        $$d = new byte[]{32, MessagePack.Code.STR16, MessagePack.Code.NEVER_USED, 58, MessagePack.Code.BIN32, -7, 44, MessagePack.Code.BIN16, 55, -20, 58, MessagePack.Code.BIN16, -21, 59, MessagePack.Code.BIN16};
        $$e = 65;
    }

    static void init$2() {
        $$c = new byte[]{53, 97, -95, 41};
        $$f = 183;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(short r9, byte r10, byte r11, java.lang.Object[] r12) {
        /*
            int r8 = 101 - r11
            byte[] r7 = fr.antelop.sdk.digitalcard.SecureTokenResume.$$a
            int r0 = r9 * 3
            int r6 = r0 + 4
            int r0 = r10 * 2
            int r5 = 1 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r7 != 0) goto L2a
            r0 = r8
            r2 = r3
            r8 = r6
        L14:
            int r6 = r6 + 1
            int r8 = r8 + r0
            r1 = r2
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r5) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L27:
            r0 = r7[r6]
            goto L14
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureTokenResume.n(short, byte, byte, java.lang.Object[]):void");
    }

    private static void o(int[] iArr, String str, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = f19204c;
        char c2 = '0';
        long j2 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objA = d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = d.a((ExpandableListView.getPackedPositionForChild(i4, i4) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == j2 ? 0 : -1)) + 250, (char) (TextUtils.indexOf("", c2, 0) + 1), 11 - (ViewConfiguration.getScrollBarSize() >> 8), 1376582792, false, $$g((byte) ((-1) - (((-1) - $$f) | ((-1) - 123))), b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i4 = 0;
                    c2 = '0';
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $11 + 55;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            int i12 = $10 + 69;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            int i14 = $10 + 61;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char c3 = 0;
            while (mVar.f19943d < i6) {
                if (bArr[mVar.f19943d] == 1) {
                    int i16 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c3)};
                    Object objA2 = d.a(120026474);
                    if (objA2 == null) {
                        objA2 = d.a(View.resolveSize(0, 0) + 11, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 9 - TextUtils.indexOf((CharSequence) "", '0'), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i17 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c3)};
                    Object objA3 = d.a(1632715197);
                    if (objA3 == null) {
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 836;
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 27279);
                        int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11;
                        int i18 = $$f;
                        byte b3 = (byte) ((i18 + 127) - (i18 | 127));
                        byte b4 = (byte) 0;
                        objA3 = d.a(keyRepeatDelay, cMakeMeasureSpec, keyRepeatDelay2, -1210801192, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = d.a(21 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 35715), 11 - (Process.myPid() >> 22), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i19 = $11 + 43;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            char[] cArr5 = new char[i6];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i21 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i21, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i21);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i6];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i6) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i22 = 0;
            while (true) {
                mVar.f19943d = i22;
                if (mVar.f19943d >= i6) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i22 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void p(char c2, String str, int i2, String str2, String str3, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            int i5 = $10 + 123;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                str6.toCharArray();
                throw null;
            }
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        int i6 = 0;
        Object charArray3 = str4;
        if (str4 != null) {
            int i7 = $11 + 47;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 / 0;
                charArray3 = str4.toCharArray();
            } else {
                charArray3 = str4.toCharArray();
            }
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
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            int i9 = $11 + 37;
            $10 = i9 % 128;
            int i10 = i9 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = d.a(540069882);
                if (objA == null) {
                    int maxKeyCode = 106 - (KeyEvent.getMaxKeyCode() >> 16);
                    char cIndexOf = (char) TextUtils.indexOf("", "", i6, i6);
                    int maxKeyCode2 = 11 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b2 = (byte) i6;
                    byte b3 = b2;
                    String str$$g = $$g(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i6] = Object.class;
                    objA = d.a(maxKeyCode, cIndexOf, maxKeyCode2, -155898465, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = d.a(2068572);
                if (objA2 == null) {
                    int i11 = 848 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    char cMyPid = (char) (6488 - (Process.myPid() >> 22));
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12;
                    byte b4 = (byte) ($$f & 11);
                    byte b5 = (byte) (b4 - 3);
                    String str$$g2 = $$g(b4, b5, b5);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i6] = Object.class;
                    objA2 = d.a(i11, cMyPid, keyRepeatTimeout, -694521287, false, str$$g2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                int i12 = cArr4[iVar.f19932b % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i12);
                objArr4[i6] = iVar;
                Object objA3 = d.a(-1122996612);
                if (objA3 == null) {
                    int i13 = 459 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int iAlpha = Color.alpha(i6) + 11;
                    byte b6 = (byte) ((-1) - (((-1) - $$f) | ((-1) - 1)));
                    byte b7 = (byte) (b6 - 1);
                    objA3 = d.a(i13, tapTimeout, iAlpha, 1804962841, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objA4 = d.a(-1223178239);
                if (objA4 == null) {
                    int iIndexOf = TextUtils.indexOf("", "") + 639;
                    char cKeyCodeFromString = (char) (65100 - KeyEvent.keyCodeFromString(""));
                    int i14 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12;
                    byte b8 = (byte) 0;
                    String str$$g3 = $$g((byte) 57, b8, b8);
                    i3 = 2;
                    objA4 = d.a(iIndexOf, cKeyCodeFromString, i14, 1636969060, false, str$$g3, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i3 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iVar.f19933e;
                cArr6[iVar.f19932b] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iVar.f19932b])) ^ (f19206e ^ 740602047300126166L)) ^ ((long) ((int) (((long) f19202a) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f19205d) ^ 740602047300126166L))));
                iVar.f19932b++;
                i6 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r0 = r7 * 2
            int r7 = 111 - r0
            byte[] r6 = fr.antelop.sdk.digitalcard.SecureTokenResume.$$d
            int r0 = r8 + 3
            int r1 = r9 + 1
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L2a
            r2 = r0
            r1 = r4
        L11:
            int r0 = -r0
            int r7 = r7 + r0
            int r7 = r7 + (-7)
            r0 = r2
        L16:
            byte r3 = (byte) r7
            int r2 = r0 + 1
            r5[r1] = r3
            if (r1 != r9) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r10[r4] = r0
            return
        L25:
            r0 = r6[r2]
            int r1 = r1 + 1
            goto L11
        L2a:
            r1 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureTokenResume.q(int, int, byte, java.lang.Object[]):void");
    }

    private static void r(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f19203b ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        int i4 = $10 + 39;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i6 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f19203b)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a((ViewConfiguration.getEdgeSlop() >> 16) + 229, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 51004), 9 - Color.blue(0), 1749983833, false, $$g((byte) ($$c[3] + 1), b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = d.a(KeyEvent.getDeadChar(0, 0) + 675, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 12 - Gravity.getAbsoluteGravity(0, 0), 522683165, false, $$g((byte) ($$f & 121), b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i7 = $10 + 45;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 % 4;
                }
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
        int i3 = f19208g + 51;
        f19209h = i3 % 128;
        int i4 = i3 % 2;
        List<CustomerAuthenticationMethodType> listB = o.ea.m.b(this.innerTokenResumeProcess.d());
        int i5 = f19209h + 111;
        f19208g = i5 % 128;
        int i6 = i5 % 2;
        return listB;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        int i2 = 2 % 2;
        int i3 = f19208g + 73;
        f19209h = i3 % 128;
        int i4 = i3 % 2;
        String strG = this.innerTokenResumeProcess.g();
        int i5 = f19208g + 113;
        f19209h = i5 % 128;
        int i6 = i5 % 2;
        return strG;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = f19208g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f19209h = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 91;
        f19208g = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        int i2 = 2 % 2;
        int i3 = f19209h + 3;
        f19208g = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerTokenResumeProcess};
            int i4 = o.x.i.f26925h * 601961010;
            o.x.i.f26925h = i4;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int iNextInt = new Random().nextInt(1592817291);
            int i5 = o.x.i.f26927j * 826423998;
            o.x.i.f26927j = i5;
            ((Boolean) o.x.i.c(-571425008, i4, 571425009, iFreeMemory, i5, iNextInt, objArr)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.innerTokenResumeProcess};
        int i6 = o.x.i.f26925h * 601961010;
        o.x.i.f26925h = i6;
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int iNextInt2 = new Random().nextInt(1592817291);
        int i7 = o.x.i.f26927j * 826423998;
        o.x.i.f26927j = i7;
        if (((Boolean) o.x.i.c(-571425008, i6, 571425009, iFreeMemory2, i7, iNextInt2, objArr2)).booleanValue()) {
            return false;
        }
        int i8 = f19209h + 109;
        f19208g = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x054c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void launch(android.content.Context r32, fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureTokenResume.launch(android.content.Context, fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback):void");
    }

    public final void launch(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        this.innerTokenResumeProcess.c(context, new j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerTokenResumeProcess));
        int i3 = f19209h + 117;
        f19208g = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19209h + 31;
        f19208g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.innerTokenResumeProcess.e(context, customerAuthenticationCredentials);
            obj.hashCode();
            throw null;
        }
        this.innerTokenResumeProcess.e(context, customerAuthenticationCredentials);
        int i4 = f19209h + 121;
        f19208g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
