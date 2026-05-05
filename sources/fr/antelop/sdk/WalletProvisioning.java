package fr.antelop.sdk;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import o.a.q;
import o.d.d;
import o.en.c;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletProvisioning {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f18770a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f18771b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f18772c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f18773d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18774e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f18775f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f18776g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f18777h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f18778i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f18779j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f18780k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f18781l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f18782m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f18783n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f18784o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f18785p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f18786q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f18787r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f18788s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f18789t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f18790u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f18791v = 0;
    private final c walletProvisioning;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r7, byte r8, byte r9) {
        /*
            int r0 = r8 * 3
            int r8 = 3 - r0
            int r0 = r9 * 7
            int r0 = 78 - r0
            int r1 = r7 * 2
            int r7 = 1 - r1
            byte[] r6 = fr.antelop.sdk.WalletProvisioning.$$c
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L2a
            r3 = r8
            r2 = r4
        L15:
            int r0 = -r0
            int r8 = r8 + r0
            r1 = r2
        L18:
            byte r0 = (byte) r8
            int r2 = r1 + 1
            r5[r1] = r0
            if (r2 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            int r3 = r3 + 1
            r0 = r6[r3]
            goto L15
        L2a:
            r1 = r4
            r3 = r8
            r8 = r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletProvisioning.$$g(byte, byte, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f18791v = 1220505245;
        f18790u = 220129931;
        f18789t = -370219113;
        f18788s = -1450117625;
        f18787r = 750376612;
        f18786q = -1043854225;
        f18785p = 1383769697;
        f18784o = 1136580706;
        f18783n = 1547962584;
        f18782m = 1757904367;
        f18781l = -254062762;
        f18780k = 1537002351;
        f18779j = -2084082294;
        f18778i = 1875310279;
        f18777h = -208315521;
        f18776g = -1160765056;
        f18775f = 1901608391;
        f18772c = 897693788;
        f18771b = -963044166;
        init$0();
        f18774e = 0;
        f18773d = 1;
        f18770a = 93040022354117677L;
    }

    public WalletProvisioning(Context context, WalletProvisioningCallback walletProvisioningCallback) throws WalletValidationException {
        this.walletProvisioning = new c(context, walletProvisioningCallback);
    }

    static void init$0() {
        $$a = new byte[]{114, MessagePack.Code.FIXEXT8, -31, MessagePack.Code.FIXEXT4};
        $$b = 9;
    }

    static void init$1() {
        $$d = new byte[]{90, -73, MessagePack.Code.BIN8, 52, Ascii.SO, -66, 53, Ascii.SI, 8, -13, 9, 5, 3, MessagePack.Code.NIL, 71, -13, 9, MessagePack.Code.BIN16, 56, 7, 0, 4, Ascii.CR, -17, Ascii.CR, -7, 0, 19, -12, MessagePack.Code.UINT8, Ascii.ETB, 44, 8, MessagePack.Code.INT8, 36, 19, -9, Ascii.SI, -19, Ascii.NAK, -9, 8, 1, -25, Ascii.DC4, Ascii.SI, 6, -11, -4, 4, MessagePack.Code.NEVER_USED, 57, Ascii.VT, MessagePack.Code.FALSE, 58, MessagePack.Code.NEVER_USED, 53, 2, MessagePack.Code.UINT64, 54, MessagePack.Code.BIN8, Ascii.SI, Ascii.SO, -66, 53, Ascii.SI, 8, -13, 9, 5, 3, MessagePack.Code.NIL, 71, -13, 9, MessagePack.Code.BIN16, Ascii.ETB, 32, Ascii.SI, -9, 4, 9, 2, -9, Ascii.NAK, -9, 8, 1, -25, Ascii.CAN, 0, 9, -11, Ascii.CR, Ascii.SO, -66, 53, Ascii.SI, 8, -13, 9, 5, 3, MessagePack.Code.NIL, 71, -13, 9, MessagePack.Code.BIN16, 56, 7, 0, 4, Ascii.CR, -17, Ascii.CR, -7, 0, 19, -12, MessagePack.Code.UINT8, 42, Ascii.NAK, Ascii.VT, 4, 3, -18, Ascii.CR, MessagePack.Code.STR8, 32, 19, -12, -20, 41, -6, -9, 5, Ascii.SI, MessagePack.Code.MAP32, 35, 6, -9, 8, 1, -72, 32, 53, -10, 5, -6, 3, Ascii.SI, MessagePack.Code.NEVER_USED, 57, Ascii.SYN, -73, 57, MessagePack.Code.NEVER_USED, Ascii.SI, MessagePack.Code.NEVER_USED, 57, Ascii.SYN, -73, 57, MessagePack.Code.NEVER_USED, 19, -15, 16, MessagePack.Code.NEVER_USED, 53, 17, MessagePack.Code.NIL, 54, MessagePack.Code.BIN8, 67, MessagePack.Code.NEVER_USED, 66, MessagePack.Code.FALSE, 56, MessagePack.Code.FALSE, 19, Ascii.SO, -66, 53, Ascii.SI, 8, -13, 9, 5, 3, MessagePack.Code.NIL, 71, -13, 9, MessagePack.Code.BIN16, 73, 1, -9, 5, MessagePack.Code.BIN8, Ascii.NAK, 37, 2, 16, -11, 16, 2, MessagePack.Code.NEVER_USED, 57, Ascii.SI, -66, 56, MessagePack.Code.NEVER_USED, 57, Ascii.SI, -66, 56, MessagePack.Code.FALSE, Ascii.ETB, MessagePack.Code.NEVER_USED, 57, Ascii.VT, MessagePack.Code.FALSE, 54, MessagePack.Code.BIN8, 16, MessagePack.Code.NEVER_USED, 72, -68, 55};
        $$e = 46;
    }

    static void init$2() {
        $$c = new byte[]{3, 32, 122, 114};
        $$f = 70;
    }

    private static void w(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 117;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        if (str2 != null) {
            int i7 = i5 + 57;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i9 = $11 + 3;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(731 - Color.green(0), (char) (7932 - MotionEvent.axisFromString("")), (Process.myTid() >> 22) + 11, 355847088, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i11] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f18770a ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a((ViewConfiguration.getEdgeSlop() >> 16) + 836, (char) (27279 - View.combineMeasuredStates(0, 0)), TextUtils.getTrimmedLength("") + 11, -2145994442, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = d.a(Process.getGidForName("") + 837, (char) (27279 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, -2145994442, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        String str3 = new String(cArr2);
        int i12 = $11 + 69;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void x(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 * 3
            int r8 = 3 - r0
            int r7 = 106 - r7
            int r0 = r6 * 3
            int r6 = r0 + 1
            byte[] r5 = fr.antelop.sdk.WalletProvisioning.$$a
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L2a
            r0 = r6
            r1 = r8
            r2 = r3
        L14:
            int r0 = -r0
            int r8 = r8 + r0
        L16:
            byte r0 = (byte) r8
            r4[r2] = r0
            int r1 = r1 + 1
            int r2 = r2 + 1
            if (r2 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r9[r3] = r0
            return
        L27:
            r0 = r5[r1]
            goto L14
        L2a:
            r2 = r3
            r1 = r8
            r8 = r7
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletProvisioning.x(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void y(byte r9, byte r10, int r11, java.lang.Object[] r12) {
        /*
            int r8 = r10 + 97
            byte[] r7 = fr.antelop.sdk.WalletProvisioning.$$d
            int r6 = 224 - r11
            int r0 = 58 - r9
            byte[] r5 = new byte[r0]
            int r4 = 57 - r9
            r3 = 0
            if (r7 != 0) goto L2b
            r1 = r6
            r2 = r3
        L11:
            int r6 = r6 + r8
            int r8 = r6 + (-2)
            r6 = r1
        L15:
            int r1 = r6 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r2 != r4) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r3)
            r12[r3] = r0
            return
        L24:
            r0 = r7[r1]
            int r2 = r2 + 1
            r6 = r8
            r8 = r0
            goto L11
        L2b:
            r2 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletProvisioning.y(byte, byte, int, java.lang.Object[]):void");
    }

    public final void checkEligibility(boolean z2) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i2 = 2 % 2;
        Object[] objArr5 = new Object[1];
        w(C1626yg.Ud("躟餹⺋ở잆⧄ἷ\uef33勠覀퍅竨뙔\uf894\uea4f霆ユप펣蘒\udf7c\uf826", (short) (C1607wl.Xd() ^ 3816), (short) (C1607wl.Xd() ^ 30027)), 43669 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr5);
        String str = (String) objArr5[0];
        Object[] objArr6 = new Object[1];
        w(Ig.wd("䔇쾽㽲꼫㔌⳦鑹\u0891灠昴헥䖵떎ꔔᏢ", (short) (C1580rY.Xd() ^ (-24607))), ExpandableListView.getPackedPositionGroup(0L) + 28711, objArr6);
        String str2 = (String) objArr6[0];
        Object objA = d.a(-556749232);
        if (objA == null) {
            int scrollBarFadeDuration = 196 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 46266);
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 11;
            byte b2 = (byte) 0;
            Object[] objArr7 = new Object[1];
            x(b2, (byte) (8 | b2), b2, objArr7);
            objA = d.a(scrollBarFadeDuration, offsetBefore, iResolveSizeAndState, 139807797, false, (String) objArr7[0], null);
        }
        long j2 = ((Field) objA).getLong(null);
        if (j2 == -1 || j2 + 1856 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object[] objArr8 = new Object[1];
            w(EO.Od("騗욛\u206f瀥\u0fe6憺굃ﴑ\udf1e㋡蒃堓釼\ue3be㩛బ淳랢西\ue92e䇉鄿懋멠ᓔ\udb47", (short) (C1633zX.Xd() ^ (-29507))), 53791 - ((Process.getThreadPriority(0) + 20) >> 6), objArr8);
            Class<?> cls = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            w(C1561oA.Qd("漢\ude7bԱẶ諅滪쌐꜃⅘絸冀떛꧇ᗧ\ue210䘛뱓ꁲ", (short) (C1580rY.Xd() ^ (-22049))), 25633 - View.MeasureSpec.getSize(0), objArr9);
            Context context = (Context) cls.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (context != null) {
                if ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) {
                    context = null;
                } else {
                    Object[] objArr10 = new Object[0];
                    Method method = Class.forName(C1593ug.zd("SaXge`\\']jjqcmt/Erryk\u007f|", (short) (C1633zX.Xd() ^ (-10835)), (short) (C1633zX.Xd() ^ (-26079)))).getMethod(C1561oA.od("SP^*XWRNGDVJOM!LJO?QL", (short) (C1499aX.Xd() ^ (-8814))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        context = (Context) method.invoke(context, objArr10);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
            Object[] objArr11 = new Object[1];
            w(C1561oA.Kd("豸滿잀눗ﻬ\ue144䧃㱎ꃥ茲찭뢏ᬉ讼港쫋", (short) (FB.Xd() ^ 12939)), View.MeasureSpec.getMode(0) + 25229, objArr11);
            Class<?> cls2 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            w(Wg.Zd("豷億㑋া챊놧蛲쥧㣶య亩똘辭쯁댲\u0cbb", (short) (C1499aX.Xd() ^ (-23432)), (short) (C1499aX.Xd() ^ (-2373))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27328, objArr12);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i3 = f18773d + 89;
            f18774e = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr13 = {context, Integer.valueOf(iIntValue), 0, 1164511739};
                byte b3 = (byte) ($$e + 4);
                byte[] bArr = $$d;
                byte b4 = bArr[4];
                Object[] objArr14 = new Object[1];
                y(b3, b4, b4, objArr14);
                Class<?> cls3 = Class.forName((String) objArr14[0]);
                byte b5 = bArr[51];
                byte b6 = bArr[57];
                Object[] objArr15 = new Object[1];
                y(b5, b6, (short) ((-1) - (((-1) - b6) & ((-1) - 173))), objArr15);
                objArr = (Object[]) cls3.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (context != null) {
                    Object objA2 = d.a(-557672753);
                    if (objA2 == null) {
                        int scrollBarSize = 196 - (ViewConfiguration.getScrollBarSize() >> 8);
                        char scrollBarSize2 = (char) (46266 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int iGreen = Color.green(0) + 11;
                        byte b7 = (byte) 0;
                        Object[] objArr16 = new Object[1];
                        x(b7, (byte) $$b, b7, objArr16);
                        objA2 = d.a(scrollBarSize, scrollBarSize2, iGreen, 138900650, false, (String) objArr16[0], null);
                    }
                    ((Field) objA2).set(null, objArr);
                    try {
                        Long lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                        Object objA3 = d.a(-556749232);
                        if (objA3 == null) {
                            int iIndexOf = 196 - TextUtils.indexOf("", "", 0);
                            char cResolveSizeAndState = (char) (46266 - View.resolveSizeAndState(0, 0, 0));
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 12;
                            byte b8 = (byte) 0;
                            Object[] objArr17 = new Object[1];
                            x(b8, (byte) (8 | b8), b8, objArr17);
                            objA3 = d.a(iIndexOf, cResolveSizeAndState, iIndexOf2, 139807797, false, (String) objArr17[0], null);
                        }
                        ((Field) objA3).set(null, lValueOf);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            Object objA4 = d.a(-557672753);
            if (objA4 == null) {
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 196;
                char offsetBefore2 = (char) (46266 - TextUtils.getOffsetBefore("", 0));
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 11;
                byte b9 = (byte) 0;
                Object[] objArr18 = new Object[1];
                x(b9, (byte) $$b, b9, objArr18);
                objA4 = d.a(threadPriority, offsetBefore2, touchSlop, 138900650, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objA4).get(null);
            objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i}, str, new int[]{i}};
            int i5 = ((int[]) objArr19[1])[0];
            int i6 = ((int[]) objArr19[3])[0];
            String str3 = (String) objArr19[2];
            int i7 = f18788s * 1465282524;
            f18788s = i7;
            int i8 = ~((-1) - (((-1) - (-459200490)) & ((-1) - (~i7))));
            int i9 = (((~((-1) - (((-1) - i7) & ((-1) - 459200489)))) | 67110916 | i8) * (-338)) + 1886801149 + (((~(i7 | 526311405)) | i8) * ExifDirectoryBase.TAG_EXTRA_SAMPLES) + 1164511739;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
        }
        int i12 = ((int[]) objArr[3])[0];
        int i13 = ((int[]) objArr[1])[0];
        if (i13 == i12) {
            int i14 = f18773d + 115;
            f18774e = i14 % 128;
            int i15 = i14 % 2;
            Object[] objArr20 = {new int[1], new int[]{i}, str, new int[]{i}};
            int i16 = ((int[]) objArr[0])[0];
            int i17 = ((int[]) objArr[1])[0];
            int i18 = ((int[]) objArr[3])[0];
            String str4 = (String) objArr[2];
            int iNextInt = new Random().nextInt(1767768766);
            int i19 = 681548603 + (((~iNextInt) | (-663365542)) * 1444);
            int i20 = ~((-1) - (((-1) - 569428525) & ((-1) - iNextInt)));
            int i21 = (i20 - 670756782) - (i20 & (-670756782));
            int i22 = ~((iNextInt + 108719496) - (iNextInt & 108719496));
            int i23 = i16 + ((i19 + (((i22 + i21) - (i22 & i21)) * (-1444))) - 2086416550);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr20[0])[0] = i25 ^ (i25 << 5);
        } else {
            int[] iArr = new int[i13];
            int i26 = i13 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i26) % 2) - 1], 1).show();
            int i27 = ((int[]) objArr[0])[0];
            int i28 = ((int[]) objArr[1])[0];
            int i29 = ((int[]) objArr[3])[0];
            new int[1][0] = i28;
            new int[1][0] = i29;
            int i30 = f18789t * 1114591163;
            f18789t = i30;
            int i31 = ~(((-957150041) + i30) - ((-957150041) & i30));
            int i32 = 728897275 + ((((i31 + 268448512) - (i31 & 268448512)) | (~((-1) - (((-1) - (-279002019)) & ((-1) - i30))))) * (-754));
            int i33 = ~((-268448513) | i30);
            int i34 = ~i30;
            int i35 = ~(((-10553507) + i34) - ((-10553507) & i34));
            int i36 = i27 + i32 + (((i33 + i35) - (i33 & i35)) * (-754)) + (((i34 - 957150041) - (i34 & (-957150041))) * 754);
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            int[] iArr2 = {i38 ^ (i38 << 5)};
        }
        Object objA5 = d.a(-553978669);
        if (objA5 == null) {
            int iIndexOf3 = 195 - TextUtils.indexOf((CharSequence) "", '0');
            char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46265);
            int iIndexOf4 = 10 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte b10 = (byte) 0;
            byte b11 = (byte) (b10 + 5);
            Object[] objArr21 = new Object[1];
            x(b10, b11, (byte) (b11 - 5), objArr21);
            objA5 = d.a(iIndexOf3, c2, iIndexOf4, 142546614, false, (String) objArr21[0], null);
        }
        long j3 = ((Field) objA5).getLong(null);
        if (j3 == -1 || j3 + 2040 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object[] objArr22 = new Object[1];
            w(C1561oA.Xd("䡞⫥荦淽뫒鴪ﶩ\uf034峋㼘蠓瑵컯䞢⨕蚱", (short) (ZN.Xd() ^ 18854)), 25229 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            int iAlpha = Color.alpha(0) + 27329;
            Object[] objArr23 = new Object[1];
            short sXd = (short) (C1580rY.Xd() ^ (-8052));
            int[] iArr3 = new int["붞顛ᄖ緡嚩텦㸥ᛲ鎽\uf666휴叛볌靠ᐥ糦".length()];
            QB qb = new QB("붞顛ᄖ緡嚩텦㸥ᛲ鎽\uf666휴叛볌靠ᐥ糦");
            int i39 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr3[i39] = xuXd.fK((sXd ^ i39) + xuXd.CK(iKK));
                i39++;
            }
            w(new String(iArr3, 0, i39), iAlpha, objArr23);
            Object[] objArr24 = {Integer.valueOf(((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue()), -1085257141};
            byte b12 = (byte) ($$e + 4);
            byte[] bArr2 = $$d;
            Object[] objArr25 = new Object[1];
            y(b12, bArr2[4], bArr2[19], objArr25);
            Class<?> cls5 = Class.forName((String) objArr25[0]);
            Object[] objArr26 = new Object[1];
            y(bArr2[51], bArr2[21], (short) 163, objArr26);
            objArr2 = (Object[]) cls5.getMethod((String) objArr26[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr24);
            Object objA6 = d.a(-549361064);
            if (objA6 == null) {
                int offsetAfter = 196 - TextUtils.getOffsetAfter("", 0);
                char cArgb = (char) (46266 - Color.argb(0, 0, 0, 0));
                int keyRepeatTimeout = 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte b13 = (byte) 0;
                byte b14 = b13;
                Object[] objArr27 = new Object[1];
                x(b13, b14, b14, objArr27);
                objA6 = d.a(offsetAfter, cArgb, keyRepeatTimeout, 163874877, false, (String) objArr27[0], null);
            }
            ((Field) objA6).set(null, objArr2);
            try {
                Long lValueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                Object objA7 = d.a(-553978669);
                if (objA7 == null) {
                    int offsetBefore3 = TextUtils.getOffsetBefore("", 0) + 196;
                    char keyRepeatTimeout2 = (char) (46266 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 11;
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 + 5);
                    Object[] objArr28 = new Object[1];
                    x(b15, b16, (byte) (b16 - 5), objArr28);
                    objA7 = d.a(offsetBefore3, keyRepeatTimeout2, packedPositionType, 142546614, false, (String) objArr28[0], null);
                }
                ((Field) objA7).set(null, lValueOf2);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        } else {
            Object objA8 = d.a(-549361064);
            if (objA8 == null) {
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 196;
                char c3 = (char) (46267 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int mirror = AndroidCharacter.getMirror('0') - '%';
                byte b17 = (byte) 0;
                byte b18 = b17;
                Object[] objArr29 = new Object[1];
                x(b17, b18, b18, objArr29);
                objA8 = d.a(tapTimeout, c3, mirror, 163874877, false, (String) objArr29[0], null);
            }
            Object[] objArr30 = (Object[]) ((Field) objA8).get(null);
            objArr2 = new Object[]{new int[1], new int[]{i}, str, new int[]{i}};
            int i40 = ((int[]) objArr30[1])[0];
            int i41 = ((int[]) objArr30[3])[0];
            String str5 = (String) objArr30[2];
            int iIdentityHashCode = System.identityHashCode(this);
            int i42 = ~iIdentityHashCode;
            int i43 = ~((-1) - (((-1) - (-495401502)) & ((-1) - i42)));
            int i44 = (((921898169 + ((((i43 - 182746521) - (i43 & (-182746521))) | (~((495401501 + iIdentityHashCode) - (495401501 & iIdentityHashCode)))) * (-564))) + ((~((iIdentityHashCode - 39863681) - (iIdentityHashCode & (-39863681)))) * 1128)) + (((-1) - (((-1) - (~(((-182746521) + i42) - ((-182746521) & i42)))) & ((-1) - (-535265182)))) * 564)) - 1085257141;
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr2[0])[0] = i46 ^ (i46 << 5);
        }
        int i47 = ((int[]) objArr2[3])[0];
        int i48 = ((int[]) objArr2[1])[0];
        if (i48 == i47) {
            int i49 = f18774e + 55;
            f18773d = i49 % 128;
            int i50 = i49 % 2;
            Object[] objArr31 = {new int[1], new int[]{i}, str, new int[]{i}};
            int i51 = ((int[]) objArr2[0])[0];
            int i52 = ((int[]) objArr2[1])[0];
            int i53 = ((int[]) objArr2[3])[0];
            String str6 = (String) objArr2[2];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i54 = ~iIdentityHashCode2;
            int i55 = ~(((-822706759) + i54) - ((-822706759) & i54));
            int i56 = (-680832691) + ((((i55 + 822083654) - (i55 & 822083654)) | (~(144558736 | i54))) * (-1136));
            int i57 = ~((-1) - (((-1) - (-822706759)) & ((-1) - iIdentityHashCode2)));
            int i58 = ~((144558736 + iIdentityHashCode2) - (144558736 & iIdentityHashCode2));
            int i59 = (i57 + i58) - (i57 & i58);
            int i60 = ~((-143935633) | i54);
            int i61 = i51 + i56 + (((i59 + i60) - (i59 & i60)) * (-568)) + (((-1) - (((-1) - (~((iIdentityHashCode2 - 822083655) - (iIdentityHashCode2 & (-822083655))))) & ((-1) - ((-1) - (((-1) - (~((-1) - (((-1) - i54) & ((-1) - (-144558737)))))) & ((-1) - (~(822706758 | i54)))))))) * 568);
            int i62 = (i61 << 13) ^ i61;
            int i63 = i62 ^ (i62 >>> 17);
            ((int[]) objArr31[0])[0] = i63 ^ (i63 << 5);
        } else {
            new ArrayList().add((String) objArr2[2]);
            Toast.makeText((Context) null, i48 / (((i48 - 1) * i48) % 2), 0).show();
            Object[] objArr32 = {new int[1], new int[]{i}, str, new int[]{i}};
            int i64 = ((int[]) objArr2[0])[0];
            int i65 = ((int[]) objArr2[1])[0];
            int i66 = ((int[]) objArr2[3])[0];
            String str7 = (String) objArr2[2];
            int id = (int) Thread.currentThread().getId();
            int i67 = (-1546597885) + (((~((-470637848) | id)) | (-207510175)) * (-318));
            int i68 = ~((-1) - (((-1) - (-207510175)) & ((-1) - id)));
            int i69 = ~id;
            int i70 = i64 + i67 + (((-1) - (((-1) - i68) & ((-1) - (~((-1) - (((-1) - 476012447) & ((-1) - i69))))))) * 318) + (((~((id + 476012447) - (id & 476012447))) | (~((-5374601) | i69))) * 318);
            int i71 = (i70 << 13) ^ i70;
            int i72 = i71 ^ (i71 >>> 17);
            ((int[]) objArr32[0])[0] = i72 ^ (i72 << 5);
        }
        Object objA9 = d.a(-555825711);
        if (objA9 == null) {
            int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 196;
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 46267);
            int mirror2 = ';' - AndroidCharacter.getMirror('0');
            byte b19 = (byte) 0;
            Object[] objArr33 = new Object[1];
            x(b19, (byte) ((b19 + 7) - (7 & b19)), b19, objArr33);
            objA9 = d.a(threadPriority2, packedPositionChild, mirror2, 140191668, false, (String) objArr33[0], null);
        }
        long j4 = ((Field) objA9).getLong(null);
        if (j4 == -1 || j4 + 1971 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object[] objArr34 = new Object[1];
            w(Qg.kd("\ue442㙑衵\uda89鲬\ueeca䃵鋍甲씻Ὑ\ue94d⮊緄쿕ꈊఓ堲⩥沂뺅\u18ab\ue2e3䓶霒朧", (short) (FB.Xd() ^ 15123), (short) (FB.Xd() ^ 108)), TextUtils.indexOf((CharSequence) "", '0', 0) + 53792, objArr34);
            Class<?> cls6 = Class.forName((String) objArr34[0]);
            Object[] objArr35 = new Object[1];
            w(hg.Vd("\ueb4f쾃Ի྾篍忲되頋በ満䊈ꚣ髏ﻯ팘㜣굛酺", (short) (C1499aX.Xd() ^ (-7908)), (short) (C1499aX.Xd() ^ (-15570))), Drawable.resolveOpacity(0, 0) + 25633, objArr35);
            Context context2 = (Context) cls6.getMethod((String) objArr35[0], new Class[0]).invoke(null, null);
            if (context2 != null) {
                if ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) {
                    int i73 = f18774e + 5;
                    f18773d = i73 % 128;
                    int i74 = i73 % 2;
                    context2 = null;
                } else {
                    Object[] objArr36 = new Object[0];
                    Method method2 = Class.forName(C1561oA.ud("\u0013\u001f\u0014!\u001d\u0016\u0010X\r\u0018\u0016\u001b\u000b\u0013\u0018Pd\u0010\u000e\u0013\u0003\u0015\u0010", (short) (OY.Xd() ^ 28139))).getMethod(C1561oA.yd("mjxDzytpa^pdqoCndiYkn", (short) (OY.Xd() ^ 3475)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        context2 = (Context) method2.invoke(context2, objArr36);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            }
            Object[] objArr37 = new Object[1];
            w(C1561oA.Yd("骒紙햚쀱ᔆ\uef5e埝䩨껿酌\uda47용⤣駖籉\ud8e5", (short) (ZN.Xd() ^ 32222)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25228, objArr37);
            Class<?> cls7 = Class.forName((String) objArr37[0]);
            Object[] objArr38 = new Object[1];
            w(Xg.qd("낂謿ﯾ烉䦍쑊ㄍ\u09da蚡\ue94a쨜䛃꾰詄－濎", (short) (C1607wl.Xd() ^ 20885), (short) (C1607wl.Xd() ^ 18690)), Color.argb(0, 0, 0, 0) + 27329, objArr38);
            Object[] objArr39 = {context2, Integer.valueOf(((Integer) cls7.getMethod((String) objArr38[0], Object.class).invoke(null, this)).intValue()), 554087918};
            byte[] bArr3 = $$d;
            Object[] objArr40 = new Object[1];
            y(bArr3[6], bArr3[4], bArr3[20], objArr40);
            Class<?> cls8 = Class.forName((String) objArr40[0]);
            Object[] objArr41 = new Object[1];
            y(bArr3[51], bArr3[12], bArr3[173], objArr41);
            objArr3 = (Object[]) cls8.getMethod((String) objArr41[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr39);
            if (context2 != null) {
                int i75 = f18773d + 105;
                f18774e = i75 % 128;
                int i76 = i75 % 2;
                Object objA10 = d.a(-554902190);
                if (objA10 == null) {
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 196;
                    char offsetAfter2 = (char) (TextUtils.getOffsetAfter("", 0) + 46266);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 11;
                    byte b20 = (byte) 0;
                    Object[] objArr42 = new Object[1];
                    x(b20, (byte) ((b20 + 6) - (6 & b20)), b20, objArr42);
                    objA10 = d.a(edgeSlop, offsetAfter2, iMakeMeasureSpec, 141115191, false, (String) objArr42[0], null);
                }
                ((Field) objA10).set(null, objArr3);
                try {
                    Long lValueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objA11 = d.a(-555825711);
                    if (objA11 == null) {
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 197;
                        char bitsPerPixel = (char) (46265 - ImageFormat.getBitsPerPixel(0));
                        int i77 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11;
                        byte b21 = (byte) 0;
                        Object[] objArr43 = new Object[1];
                        x(b21, (byte) ((-1) - (((-1) - b21) & ((-1) - 7))), b21, objArr43);
                        objA11 = d.a(iLastIndexOf, bitsPerPixel, i77, 140191668, false, (String) objArr43[0], null);
                    }
                    ((Field) objA11).set(null, lValueOf3);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
        } else {
            Object objA12 = d.a(-554902190);
            if (objA12 == null) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 196;
                char minimumFlingVelocity = (char) (46266 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0') + 12;
                byte b22 = (byte) 0;
                Object[] objArr44 = new Object[1];
                x(b22, (byte) ((b22 + 6) - (6 & b22)), b22, objArr44);
                objA12 = d.a(iMakeMeasureSpec2, minimumFlingVelocity, iIndexOf5, 141115191, false, (String) objArr44[0], null);
            }
            Object[] objArr45 = (Object[]) ((Field) objA12).get(null);
            objArr3 = new Object[]{new int[1], new int[]{i}, str, new int[]{i}};
            int i78 = ((int[]) objArr45[1])[0];
            int i79 = ((int[]) objArr45[3])[0];
            String str8 = (String) objArr45[2];
            int i80 = ((((-1) - (((-1) - (~((-346038121) | r11))) & ((-1) - 69207840))) * (-283)) - 1210869739) + ((~((-1) - (((-1) - ((int) Thread.currentThread().getId())) & ((-1) - (-276830281))))) * 283) + 554087918;
            int i81 = (i80 << 13) ^ i80;
            int i82 = i81 ^ (i81 >>> 17);
            ((int[]) objArr3[0])[0] = i82 ^ (i82 << 5);
        }
        int i83 = ((int[]) objArr3[3])[0];
        int i84 = ((int[]) objArr3[1])[0];
        if (i84 == i83) {
            Object[] objArr46 = {new int[1], new int[]{i}, str, new int[]{i}};
            int i85 = ((int[]) objArr3[0])[0];
            int i86 = ((int[]) objArr3[1])[0];
            int i87 = ((int[]) objArr3[3])[0];
            String str9 = (String) objArr3[2];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i88 = ~iIdentityHashCode3;
            int i89 = (-1) - (((-1) - (~((-91522134) | i88))) & ((-1) - 83919893));
            int i90 = ~((-1) - (((-1) - i88) & ((-1) - 586625888)));
            int i91 = i85 + ((((i90 + i89) - (i90 & i89)) * (-397)) - 1560973547) + (((iIdentityHashCode3 + 662943541) - (iIdentityHashCode3 & 662943541)) * 397);
            int i92 = (i91 << 13) ^ i91;
            int i93 = i92 ^ (i92 >>> 17);
            ((int[]) objArr46[0])[0] = i93 ^ (i93 << 5);
        } else {
            Toast.makeText((Context) null, i84 / (((i84 - 1) * i84) % 2), 0).show();
            int i94 = ((int[]) objArr3[0])[0];
            int i95 = ((int[]) objArr3[1])[0];
            int i96 = ((int[]) objArr3[3])[0];
            new int[1][0] = i95;
            new int[1][0] = i96;
            int i97 = f18790u * (-1764278245);
            f18790u = i97;
            int i98 = (-1579243097) + (((-1) - (((-1) - (~i97)) & ((-1) - 376888))) * OlympusCameraSettingsMakernoteDirectory.TagMagicFilter);
            int i99 = ~((4575544 + i97) - (4575544 & i97));
            int i100 = ~((-1) - (((-1) - i97) & ((-1) - 673572477)));
            int i101 = i94 + i98 + (((i100 + i99) - (i100 & i99)) * (-1324)) + 1758391406;
            int i102 = (i101 << 13) ^ i101;
            int i103 = i102 ^ (i102 >>> 17);
            int[] iArr4 = {i103 ^ (i103 << 5)};
        }
        this.walletProvisioning.a(z2);
        Object objA13 = d.a(1450039107);
        if (objA13 == null) {
            int bitsPerPixel2 = 259 - ImageFormat.getBitsPerPixel(0);
            char c4 = (char) (5597 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
            byte b23 = (byte) 0;
            Object[] objArr47 = new Object[1];
            x(b23, (byte) ((b23 + 8) - (8 & b23)), b23, objArr47);
            objA13 = d.a(bitsPerPixel2, c4, scrollBarFadeDuration2, -2132265690, false, (String) objArr47[0], null);
        }
        long j5 = ((Field) objA13).getLong(null);
        if (j5 == -1 || j5 + 2040 < ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue()) {
            Object[] objArr48 = new Object[1];
            w(Jg.Wd("䲝꾞邭﮾탹㯛ⓘ頍蔪\udff1녚☶श望斄䪪", (short) (OY.Xd() ^ 29565), (short) (OY.Xd() ^ 30573)), 25229 - KeyEvent.getDeadChar(0, 0), objArr48);
            Class<?> cls9 = Class.forName((String) objArr48[0]);
            Object[] objArr49 = new Object[1];
            w(ZO.xd("丹弈棢갶𢡊瀙脩쐫㶙傟閘\uf7e2ᲂ山鉹휅", (short) (FB.Xd() ^ 4637), (short) (FB.Xd() ^ 15253)), View.MeasureSpec.getSize(0) + 27329, objArr49);
            try {
                Object[] objArr50 = {Integer.valueOf(((Integer) cls9.getMethod((String) objArr49[0], Object.class).invoke(null, this)).intValue()), 0, 430407604};
                Object objA14 = d.a(1335508849);
                if (objA14 == null) {
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 260;
                    char cAlpha = (char) (Color.alpha(0) + 5596);
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 10;
                    byte b24 = (byte) 0;
                    Object[] objArr51 = new Object[1];
                    x(b24, (byte) (6 | b24), b24, objArr51);
                    objA14 = d.a(packedPositionGroup, cAlpha, touchSlop2, -1725965036, false, (String) objArr51[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                }
                objArr4 = (Object[]) ((Method) objA14).invoke(null, objArr50);
                Object objA15 = d.a(1452809670);
                if (objA15 == null) {
                    int i104 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 260;
                    char cLastIndexOf = (char) (5595 - TextUtils.lastIndexOf("", '0', 0));
                    int iIndexOf6 = 9 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte b25 = (byte) 0;
                    byte b26 = (byte) (b25 + 5);
                    Object[] objArr52 = new Object[1];
                    x(b25, b26, (byte) (b26 - 5), objArr52);
                    objA15 = d.a(i104, cLastIndexOf, iIndexOf6, -2145517661, false, (String) objArr52[0], null);
                }
                ((Field) objA15).set(null, objArr4);
                try {
                    Long lValueOf4 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue());
                    Object objA16 = d.a(1450039107);
                    if (objA16 == null) {
                        int iCombineMeasuredStates = 260 - View.combineMeasuredStates(0, 0);
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5596);
                        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
                        byte b27 = (byte) 0;
                        Object[] objArr53 = new Object[1];
                        x(b27, (byte) ((b27 + 8) - (8 & b27)), b27, objArr53);
                        objA16 = d.a(iCombineMeasuredStates, maximumDrawingCacheSize, iMakeMeasureSpec3, -2132265690, false, (String) objArr53[0], null);
                    }
                    ((Field) objA16).set(null, lValueOf4);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        } else {
            Object objA17 = d.a(1452809670);
            if (objA17 == null) {
                int packedPositionChild2 = 259 - ExpandableListView.getPackedPositionChild(0L);
                char maxKeyCode = (char) (5596 - (KeyEvent.getMaxKeyCode() >> 16));
                int offsetAfter3 = TextUtils.getOffsetAfter("", 0) + 10;
                byte b28 = (byte) 0;
                byte b29 = (byte) (b28 + 5);
                Object[] objArr54 = new Object[1];
                x(b28, b29, (byte) (b29 - 5), objArr54);
                objA17 = d.a(packedPositionChild2, maxKeyCode, offsetAfter3, -2145517661, false, (String) objArr54[0], null);
            }
            Object[] objArr55 = (Object[]) ((Field) objA17).get(null);
            objArr4 = new Object[]{str, str, str, str, new int[]{i}, str, str, new int[]{i}, str, new int[]{i ^ (i << 5)}};
            int i105 = ((int[]) objArr55[4])[0];
            int i106 = ((int[]) objArr55[7])[0];
            String str10 = (String) objArr55[2];
            String str11 = (String) objArr55[8];
            String str12 = (String) objArr55[1];
            String str13 = (String) objArr55[6];
            String str14 = (String) objArr55[0];
            String str15 = (String) objArr55[5];
            String str16 = (String) objArr55[3];
            int i107 = f18791v * 2105983532;
            f18791v = i107;
            int i108 = (((~((-492518196) | i107)) | 731080460) * 262) + 1621354160 + (((~((-1) - (((-1) - (~i107)) & ((-1) - (-492518196))))) | 731080460) * 262) + 430407604;
            int i109 = (i108 << 13) ^ i108;
            int i110 = i109 ^ (i109 >>> 17);
        }
        int i111 = ((int[]) objArr4[7])[0];
        int i112 = ((int[]) objArr4[4])[0];
        if (i112 == i111) {
            Object[] objArr56 = {str, str, str, str, new int[]{i}, str, str, new int[]{i}, str, new int[1]};
            int i113 = ((int[]) objArr4[9])[0];
            int i114 = ((int[]) objArr4[4])[0];
            int i115 = ((int[]) objArr4[7])[0];
            String str17 = (String) objArr4[2];
            String str18 = (String) objArr4[8];
            String str19 = (String) objArr4[1];
            String str20 = (String) objArr4[6];
            String str21 = (String) objArr4[0];
            String str22 = (String) objArr4[5];
            String str23 = (String) objArr4[3];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i116 = ~((-1) - (((-1) - (-1008716443)) & ((-1) - iIdentityHashCode4)));
            int i117 = ~iIdentityHashCode4;
            int i118 = (-1) - (((-1) - i116) & ((-1) - (~((402902232 + i117) - (402902232 & i117)))));
            int i119 = ~(1008716442 | i117);
            int i120 = 479138426 + (((i118 + i119) - (i118 & i119)) * (-516));
            int i121 = ~((-1) - (((-1) - iIdentityHashCode4) & ((-1) - (-402901145))));
            int i122 = ~(i117 | (-1089));
            int i123 = i113 + i120 + (((i121 + i122) - (i121 & i122)) * 516) + (((-1) - (((-1) - PhotoshopDirectory.TAG_PATH_SELECTION_STATE) & ((-1) - i119))) * 516);
            int i124 = (i123 << 13) ^ i123;
            int i125 = i124 ^ (i124 >>> 17);
            ((int[]) objArr56[9])[0] = i125 ^ (i125 << 5);
            Object[] objArr57 = {str, str, str, str, new int[]{i}, str, str, new int[]{i}, str, new int[1]};
            int i126 = ((int[]) objArr56[9])[0];
            int i127 = ((int[]) objArr56[4])[0];
            int i128 = ((int[]) objArr56[7])[0];
            String str24 = (String) objArr56[2];
            String str25 = (String) objArr56[8];
            String str26 = (String) objArr56[1];
            String str27 = (String) objArr56[6];
            String str28 = (String) objArr56[0];
            String str29 = (String) objArr56[5];
            String str30 = (String) objArr56[3];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i129 = ~((-1282103092) | iIdentityHashCode5);
            int i130 = 109445758 + (((i129 - 129515584) - (i129 & (-129515584))) * (-964));
            int i131 = ~((-1) - (((-1) - (~iIdentityHashCode5)) & ((-1) - (-1282103092))));
            int i132 = i126 + i130 + (((i131 + 1212356352) - (i131 & 1212356352)) * (-964));
            int i133 = (i132 << 13) ^ i132;
            int i134 = i133 ^ (i133 >>> 17);
            ((int[]) objArr57[9])[0] = i134 ^ (i134 << 5);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((String) objArr4[2]);
        arrayList.add((String) objArr4[8]);
        arrayList.add((String) objArr4[1]);
        arrayList.add((String) objArr4[6]);
        arrayList.add((String) objArr4[0]);
        arrayList.add((String) objArr4[5]);
        arrayList.add((String) objArr4[3]);
        Object[] objArr58 = new Object[1];
        w(C1626yg.Ud("잽\udfc0擗ⱌഴ\ue6af諯\ue6e4₌\uf5ee锓矢\uf872\udaa7垯片掙ફ\ude37嵅嶃\udcfc\ud90f攣暖熈", (short) (ZN.Xd() ^ 16979), (short) (ZN.Xd() ^ 28272)), 53791 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr58);
        Class<?> cls10 = Class.forName((String) objArr58[0]);
        Object[] objArr59 = new Object[1];
        w(Ig.wd("ᴑ\udbbaʁᭇ泲僛ꑭ蘤\uf84b戃㖑饊赌\uf0de즅\u2d2eꍊ軻", (short) (C1580rY.Xd() ^ (-22543))), 25633 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr59);
        Context context3 = (Context) cls10.getMethod((String) objArr59[0], new Class[0]).invoke(null, null);
        if (context3 != null) {
            if ((context3 instanceof ContextWrapper) && ((ContextWrapper) context3).getBaseContext() == null) {
                context3 = null;
            } else {
                Class<?> cls11 = Class.forName(EO.Od("8\u001caJ`/\b$ :=_\u001b,4\n{\u0010Yi1jz", (short) (Od.Xd() ^ (-30853))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr60 = new Object[0];
                short sXd2 = (short) (C1607wl.Xd() ^ 2085);
                int[] iArr5 = new int["A>L\u0018FE@<52D8=;\u000f:8=-?:".length()];
                QB qb2 = new QB("A>L\u0018FE@<52D8=;\u000f:8=-?:");
                int i135 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr5[i135] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i135 + xuXd2.CK(iKK2));
                    i135++;
                }
                Method method3 = cls11.getMethod(new String(iArr5, 0, i135), clsArr);
                try {
                    method3.setAccessible(true);
                    context3 = (Context) method3.invoke(context3, objArr60);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
        }
        if (Looper.myLooper() == null) {
            int i136 = f18773d + 5;
            f18774e = i136 % 128;
            int i137 = i136 % 2;
            context3 = null;
        }
        try {
            Object[] objArr61 = {context3, Long.valueOf(((long) (i111 ^ i112)) ^ (-2547335113163669504L)), -593097673L};
            byte[] bArr4 = $$d;
            Object[] objArr62 = new Object[1];
            y(bArr4[20], bArr4[11], (short) 131, objArr62);
            Class<?> cls12 = Class.forName((String) objArr62[0]);
            byte b30 = bArr4[51];
            byte b31 = bArr4[20];
            Object[] objArr63 = new Object[1];
            y(b30, b31, (short) (170 | b31), objArr63);
            cls12.getMethod((String) objArr63[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr61);
            Object[] objArr64 = {str, str, str, str, new int[]{i}, str, str, new int[]{i}, str, new int[1]};
            int i138 = ((int[]) objArr4[9])[0];
            int i139 = ((int[]) objArr4[4])[0];
            int i140 = ((int[]) objArr4[7])[0];
            String str31 = (String) objArr4[2];
            String str32 = (String) objArr4[8];
            String str33 = (String) objArr4[1];
            String str34 = (String) objArr4[6];
            String str35 = (String) objArr4[0];
            String str36 = (String) objArr4[5];
            String str37 = (String) objArr4[3];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i141 = ~(((-1142878660) + iIdentityHashCode6) - ((-1142878660) & iIdentityHashCode6));
            int i142 = ~iIdentityHashCode6;
            int i143 = (-170377430) + ((i141 | (~((-1) - (((-1) - 1411315183) & ((-1) - i142))))) * (-406)) + ((~((-1) - (((-1) - (-1142575169)) & ((-1) - i142)))) * (-406));
            int i144 = ~(iIdentityHashCode6 | (-268740016));
            int i145 = ~(1142878659 | i142);
            int i146 = i138 + i143 + (((i144 + i145) - (i144 & i145)) * HttpStatus.SC_NOT_ACCEPTABLE);
            int i147 = (i146 << 13) ^ i146;
            int i148 = i147 ^ (i147 >>> 17);
            ((int[]) objArr64[9])[0] = i148 ^ (i148 << 5);
            int[] iArr6 = new int[i112];
            int i149 = i112 - 1;
            iArr6[i149] = 1;
            Toast.makeText((Context) null, iArr6[((i112 * i149) % 2) - 1], 1).show();
            Object[] objArr65 = {str, str, str, str, new int[]{i}, str, str, new int[]{i}, str, new int[1]};
            int i150 = ((int[]) objArr64[9])[0];
            int i151 = ((int[]) objArr64[4])[0];
            int i152 = ((int[]) objArr64[7])[0];
            String str38 = (String) objArr64[2];
            String str39 = (String) objArr64[8];
            String str40 = (String) objArr64[1];
            String str41 = (String) objArr64[6];
            String str42 = (String) objArr64[0];
            String str43 = (String) objArr64[5];
            String str44 = (String) objArr64[3];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i153 = ~(197301315 | iIdentityHashCode7);
            int i154 = (i153 - 1273206640) - (i153 & (-1273206640));
            int i155 = ~(1214317359 | iIdentityHashCode7);
            int i156 = i150 + (-860654558) + (((i154 + i155) - (i154 & i155)) * (-744)) + (((~iIdentityHashCode7) | 138412035) * 744) + (((iIdentityHashCode7 + 1273206639) - (iIdentityHashCode7 & 1273206639)) * 744);
            int i157 = (i156 << 13) ^ i156;
            int i158 = i157 ^ (i157 >>> 17);
            ((int[]) objArr65[9])[0] = i158 ^ (i158 << 5);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    public final void clean() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18773d + 49;
        f18774e = i3 % 128;
        int i4 = i3 % 2;
        this.walletProvisioning.e();
        int i5 = f18773d + 33;
        f18774e = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void initialize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18774e + 85;
        f18773d = i3 % 128;
        if (i3 % 2 != 0) {
            this.walletProvisioning.c();
            return;
        }
        this.walletProvisioning.c();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0ec1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0eca  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x1133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void launch(java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletProvisioning.launch(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x113d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x1214  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x1215  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x07c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void launch(byte[] r31, java.lang.String r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletProvisioning.launch(byte[], java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0cdd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void launch(byte[] r33, byte[] r34, java.lang.String r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.WalletProvisioning.launch(byte[], byte[], java.lang.String):void");
    }
}
