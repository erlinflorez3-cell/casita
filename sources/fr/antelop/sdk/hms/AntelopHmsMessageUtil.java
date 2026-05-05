package fr.antelop.sdk.hms;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.huawei.hms.push.RemoteMessage;
import java.lang.reflect.Method;
import kotlin.jvm.internal.CharCompanionObject;
import o.a.m;
import o.bo.a;
import o.bo.c;
import o.bo.h;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class AntelopHmsMessageUtil {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19490a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f19491b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f19492c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f19493d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f19494e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19495f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f19496g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f19497h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f19498i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f19499j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f19500k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f19501l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f19502m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f19503n = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r9, short r10, short r11) {
        /*
            int r0 = r10 * 2
            int r8 = 3 - r0
            byte[] r7 = fr.antelop.sdk.hms.AntelopHmsMessageUtil.$$c
            int r0 = r11 * 4
            int r6 = r0 + 1
            int r0 = 120 - r9
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L29
            r1 = r8
            r0 = r6
            r3 = r4
        L14:
            int r0 = -r0
            int r8 = r8 + r0
            r2 = r3
        L17:
            int r3 = r2 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            int r1 = r1 + 1
            if (r3 != r6) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r7[r1]
            goto L14
        L29:
            r2 = r4
            r1 = r8
            r8 = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.hms.AntelopHmsMessageUtil.$$e(short, short, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f19503n = -1609885845;
        f19502m = -1351179642;
        f19501l = 976761669;
        f19500k = 1903530214;
        f19498i = -644863822;
        init$0();
        f19495f = 0;
        f19496g = 1;
        f19497h = 0;
        f19499j = 1;
        d();
        f19494e = new char[]{2435};
        f19493d = 2040400306;
        f19491b = true;
        f19490a = true;
        int i2 = f19496g + 19;
        f19495f = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(2:77|26)|(1:28)(4:29|81|30|(9:32|38|78|39|(1:41)(7:45|79|46|47|(4:86|51|(4:53|75|54|55)(2:59|60)|(2:63|64))|65|66)|42|(0)|65|66)(1:33))|37|38|78|39|(0)(0)|42|(0)|65|66) */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0123: ARITH (r10 I:??[int, boolean]) = (r8 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:10:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0430 A[Catch: Exception -> 0x042c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x042c, blocks: (B:39:0x0403, B:45:0x0430, B:47:0x045e, B:49:0x0466, B:50:0x046c, B:46:0x043a), top: B:78:0x0403, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x046d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] b(int r28, int r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.hms.AntelopHmsMessageUtil.b(int, int):java.lang.Object[]");
    }

    static void d() {
        f19492c = new char[]{56505, 56539, 56532, 56547, 56555, 56558, 56551, 56550, 56555, 56538, 56537, 56558, 56558, 56553, 56548, 56555, 56556, 56548, 56550, 56364, 56361, CharCompanionObject.MIN_LOW_SURROGATE, 56353, 56360, 56355, 56366, 56355, 56347, 56369, 56364, 56351, 56353, 56353, 56367, 56348, 56351, 56574, 56326, 56433, 56438, 56729, 56440, 56417, 56444, 56715, 56723, 56726, 56716, 56719, 56721, 56723, 56728, 56724, 56498, 56548, 56546, 56553, 56563, 56553, 56553, 56561, 56553, 56555, 56562, 56563, 56556, 56521, 56523, 56554, 56555, 56550, 56546, 56553, 56563, 56529, 56523, 56558, 56555, 56547, 56548, 56521, 56525, 56552, 56553, 56560, 56555, 56552, 56525, 56529, 56566, 56566, 56529, 56528, 56573, 56441, 56440, 56498, 56548, 56552, 56551, 56545, 56551, 56553, 56546, 56546, 56548, 56546, 56553, 56563, 56557, 56522, 56525, 56552, 56553, 56560, 56555, 56552, 56525, 56529, 56566, 56566, 56529, 56521, 56553, 56560, 56561, 56527, 56740, 56416, 56735, 56736, 56720, 56728, 56735, 56730, 56724, 56722, 56739, 56741, 56416, 56728, 56735, 56730, 56724, 56722, 56739, 56741, 56416, 56728, 56742, 56723, 56726, 56725, 56416, 56733, 56726, 56735, 56739, 56726, 56732, 56416, 56740, 56746};
    }

    static void init$0() {
        $$a = new byte[]{7, 42, -92, 85};
        $$b = 0;
    }

    static void init$1() {
        $$c = new byte[]{42, MessagePack.Code.FLOAT64, -71, 92};
        $$d = 30;
    }

    private static void o(int[] iArr, String str, boolean z2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i2 = 2;
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
        char[] cArr = f19492c;
        char c2 = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 99;
                $10 = i10 % 128;
                int i11 = i10 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objA = d.a(-2071388435);
                    if (objA == null) {
                        int iBlue = Color.blue(i4) + 249;
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf("", c2));
                        int size = View.MeasureSpec.getSize(i4) + 11;
                        byte length2 = (byte) $$c.length;
                        byte b2 = (byte) (length2 - 4);
                        objA = d.a(iBlue, cIndexOf, size, 1376582792, false, $$e(length2, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i2 = 2;
                    i4 = 0;
                    c2 = '0';
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
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            char c3 = 0;
            while (mVar.f19943d < i6) {
                if (bArr[mVar.f19943d] == 1) {
                    int i12 = $10 + 57;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c3)};
                    Object objA2 = d.a(120026474);
                    if (objA2 == null) {
                        objA2 = d.a(12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) View.MeasureSpec.getSize(0), 10 - (Process.myPid() >> 22), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c3)};
                    Object objA3 = d.a(1632715197);
                    if (objA3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA3 = d.a(836 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (KeyEvent.getDeadChar(0, 0) + 27279), TextUtils.indexOf("", "") + 11, -1210801192, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = d.a(20 - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35714), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i16 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i16, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i16);
            int i17 = $10 + 51;
            $11 = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = 1;
        if (z2) {
            char[] cArr6 = new char[i6];
            mVar.f19943d = 0;
            while (mVar.f19943d < i6) {
                cArr6[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - i19];
                mVar.f19943d += i19;
                i19 = 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i20 = $11 + 113;
            $10 = i20 % 128;
            int i21 = i20 % 2;
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

    public static boolean onMessageReceived(Context context, RemoteMessage remoteMessage) throws Throwable {
        boolean zC;
        int i2 = 2 % 2;
        int i3 = f19499j + 33;
        f19497h = i3 % 128;
        int i4 = i3 % 2;
        h hVarD = c.d(remoteMessage);
        if (i4 != 0) {
            zC = a.c(context, hVarD);
            int i5 = 10 / 0;
        } else {
            zC = a.c(context, hVarD);
        }
        int i6 = f19497h + 97;
        f19499j = i6 % 128;
        int i7 = i6 % 2;
        return zC;
    }

    public static void onTokenRefresh(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19497h + 85;
        f19499j = i3 % 128;
        int i4 = i3 % 2;
        a.a(context);
        int i5 = f19497h + 3;
        f19499j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 * 3
            int r0 = 4 - r0
            int r1 = r8 * 4
            int r1 = 100 - r1
            int r3 = r7 * 3
            int r2 = 1 - r3
            byte[] r8 = fr.antelop.sdk.hms.AntelopHmsMessageUtil.$$a
            byte[] r7 = new byte[r2]
            r6 = 0
            int r5 = 0 - r3
            if (r8 != 0) goto L31
            r4 = r0
            r2 = r5
            r3 = r6
        L18:
            int r1 = -r0
            int r1 = r1 + r2
            int r0 = r4 + 1
        L1c:
            byte r2 = (byte) r1
            r7[r3] = r2
            if (r3 != r5) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r6)
            r9[r6] = r0
            return
        L29:
            int r3 = r3 + 1
            r2 = r8[r0]
            r4 = r0
            r0 = r2
            r2 = r1
            goto L18
        L31:
            r3 = r6
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.hms.AntelopHmsMessageUtil.p(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(int r21, java.lang.String r22, int[] r23, java.lang.String r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.hms.AntelopHmsMessageUtil.q(int, java.lang.String, int[], java.lang.String, java.lang.Object[]):void");
    }
}
