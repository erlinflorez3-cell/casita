package fr.antelop.antelopsecurecmodule;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.g;
import o.d.d;
import o.ea.f;
import okio.Utf8;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class ScmJni {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f18674a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f18675b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f18676c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f18677d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f18678e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f18679f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f18680g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f18681h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f18682i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f18683j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f18684k = 0;
    private final Context mContext;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r2 = r8 * 2
            int r1 = 1 - r2
            int r0 = r7 * 3
            int r8 = 72 - r0
            int r7 = r6 + 4
            byte[] r6 = fr.antelop.antelopsecurecmodule.ScmJni.$$c
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L2c
            r2 = r8
            r1 = r4
            r0 = r7
        L16:
            int r7 = r7 + r2
            r8 = r7
            r7 = r0
        L19:
            byte r0 = (byte) r8
            r5[r1] = r0
            if (r1 != r3) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            int r0 = r7 + 1
            int r1 = r1 + 1
            r2 = r6[r0]
            r7 = r8
            goto L16
        L2c:
            r1 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelopsecurecmodule.ScmJni.$$g(byte, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f18684k = 1080202976;
        f18682i = 2066363357;
        init$0();
        f18679f = 0;
        f18683j = 1;
        f18681h = 0;
        f18680g = 1;
        b();
        if (f.a()) {
            f.c("ScmJni", "LoadLibrary - Before");
            int i2 = 2 % 2;
        }
        System.loadLibrary("scm");
        if (f.a()) {
            int i3 = f18679f + 87;
            f18683j = i3 % 128;
            if (i3 % 2 == 0) {
                f.c("ScmJni", "LoadLibrary - After");
                int i4 = 1 / 0;
            } else {
                f.c("ScmJni", "LoadLibrary - After");
            }
        }
        int i5 = f18683j + 15;
        f18679f = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ScmJni(Context context) throws Throwable {
        Object obj;
        this.mContext = context;
        if (f18676c) {
            return;
        }
        boolean zA = f.a();
        String strZd = Wg.Zd("%:mn<]", (short) (OY.Xd() ^ 24470), (short) (OY.Xd() ^ 1888));
        if (zA) {
            f.c(strZd, new StringBuilder(C1561oA.Xd("\u0005w\bdvy\u0003y\u0001\u007fi}\u000b\u0004GIAOC\u0007\u000b\r\u0017\u001b\u000fJeL", (short) (C1607wl.Xd() ^ 1853))).append(context).toString());
        }
        f18676c = true;
        short sXd = (short) (C1499aX.Xd() ^ (-27016));
        int[] iArr = new int["0<1>B;5}*53808=u\"MKPHZU".length()];
        QB qb = new QB("0<1>B;5}*53808=u\"MKPHZU");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("\u0005\u0002\u0010[\n\t\u0004\u007fxu\b{\u0001~X|s{", (short) (C1499aX.Xd() ^ (-25675)), (short) (C1499aX.Xd() ^ (-28766))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strVd = hg.Vd(":F;HD=7\u007f4?=B2:?w95t\u000754/+$!3',*\u0004(\u001f'", (short) (C1580rY.Xd() ^ (-2419)), (short) (C1580rY.Xd() ^ (-20442)));
            String strUd = C1561oA.ud("gcuaCgo", (short) (ZN.Xd() ^ 5590));
            try {
                Class<?> cls = Class.forName(strVd);
                Field field = 1 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            spn(false, (String) obj);
            if (f.a()) {
                short sXd2 = (short) (C1499aX.Xd() ^ (-32416));
                int[] iArr2 = new int["3&6\u0013\u001d ) \u001f\u001e\b\u001c!\u001a]_o}q42A3A".length()];
                QB qb2 = new QB("3&6\u0013\u001d ) \u001f\u001e\b\u001c!\u001a]_o}q42A3A");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                    i3++;
                }
                f.c(strZd, new String(iArr2, 0, i3));
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void b() {
        f18674a = (char) 24669;
        f18675b = (char) 9101;
        f18678e = (char) 56304;
        f18677d = (char) 52192;
    }

    static void init$0() {
        $$a = new byte[]{74, -74, 100, -77};
        $$b = 188;
    }

    static void init$1() {
        $$d = new byte[]{111, MessagePack.Code.MAP16, MessagePack.Code.TRUE, Ascii.DC4, 60, MessagePack.Code.BIN8, -16, Base64.padSymbol, MessagePack.Code.BIN8, -17, Utf8.REPLACEMENT_BYTE, MessagePack.Code.EXT16, -18, -11, 10, -12, -8, -6, Base64.padSymbol, -74, 10, -12, 56, MessagePack.Code.BIN16, -10, -3, -7, -16, Ascii.SO, -16, 4, -3, -22, 9, 49, -26, MessagePack.Code.INT32, -2, 1, -13, Ascii.DC2, MessagePack.Code.NEGFIXINT_PREFIX, Ascii.SUB, -22, -29, 49, MessagePack.Code.ARRAY32, -22, 9, Ascii.SI, MessagePack.Code.STR8, -2, 4, -8, -8, 2, 60, MessagePack.Code.ARRAY32, MessagePack.Code.FIXEXT1, -8, -5, -2, -10, 2, 33, MessagePack.Code.FIXEXT16, -5, -19, 8, -19, -5, 74, MessagePack.Code.ARRAY32, MessagePack.Code.EXT16, 7, -8, 3, -6, -18, -17, Utf8.REPLACEMENT_BYTE, MessagePack.Code.EXT16, -18, -11, 10, -12, -8, -6, Base64.padSymbol, -74, 10, -12, 56, MessagePack.Code.TRUE, -8, -14, 8, -2, -4, -23, 9, 50, -24, MessagePack.Code.UINT32, -11, 10, -12, -8, -6, 37, MessagePack.Code.FIXEXT16, -14, 8, -2, -4, -23, 9, 19, -29, -19, -5, Ascii.CR, -11, -7, -10, 2, Ascii.CR, MessagePack.Code.ARRAY16, 6, -8, -17, Utf8.REPLACEMENT_BYTE, MessagePack.Code.EXT16, -18, -11, 10, -12, -8, -6, Base64.padSymbol, -74, 10, -12, 56, MessagePack.Code.BIN16, -10, -3, -7, -16, Ascii.SO, -16, 4, -3, -22, 9, 49, MessagePack.Code.FIXEXT4, -23, -3, -23, -2, 8, Ascii.FF, MessagePack.Code.NEGFIXINT_PREFIX, -1, 1, -14, Ascii.ETB, -24, -19, -7, 3, 3};
        $$e = 146;
    }

    static void init$2() {
        $$c = new byte[]{34, -117, -98, -86};
        $$f = 191;
    }

    private static void l(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 87;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i5 = $10 + 91;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i7 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i7] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = 58224;
            int i9 = i7;
            while (i9 < 16) {
                int i10 = $11 + 35;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i7];
                int i12 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) f18678e) ^ (-7511683281764982996L))));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f18677d);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i7] = Integer.valueOf(c2);
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        int maxKeyCode = 270 - (KeyEvent.getMaxKeyCode() >> 16);
                        char cGreen = (char) Color.green(i7);
                        int iIndexOf = 11 - TextUtils.indexOf("", "", i7);
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (-b2);
                        String str$$g = $$g(b2, b3, (byte) (b3 - 1));
                        Class[] clsArr = new Class[4];
                        clsArr[i7] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = d.a(maxKeyCode, cGreen, iIndexOf, -1995022631, false, str$$g, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i7]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f18674a) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f18675b)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (-b4);
                        objA2 = d.a(270 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 11, -1995022631, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    i7 = 0;
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
                byte b6 = (byte) (-1);
                byte b7 = (byte) (b6 + 1);
                objA3 = d.a((ViewConfiguration.getTouchSlop() >> 8) + 270, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getTrimmedLength("") + 11, -2074123590, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i7 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(byte r9, int r10, short r11, java.lang.Object[] r12) {
        /*
            int r0 = r10 * 4
            int r8 = 4 - r0
            byte[] r7 = fr.antelop.antelopsecurecmodule.ScmJni.$$a
            int r6 = r11 + 97
            int r0 = r9 * 4
            int r5 = r0 + 1
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r7 != 0) goto L2d
            r2 = r3
            r1 = r8
        L13:
            int r8 = r8 + r6
            int r0 = r1 + 1
            r1 = r2
            r6 = r8
            r8 = r0
        L19:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r5) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L28:
            r0 = r7[r8]
            r1 = r8
            r8 = r0
            goto L13
        L2d:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelopsecurecmodule.ScmJni.n(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x000f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(int r9, int r10, byte r11, java.lang.Object[] r12) {
        /*
            int r8 = r10 + 4
            int r7 = 111 - r11
            byte[] r6 = fr.antelop.antelopsecurecmodule.ScmJni.$$d
            int r5 = 71 - r9
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r6 != 0) goto L29
            r2 = r5
            r1 = r3
        Lf:
            int r0 = -r7
            int r2 = r2 + r0
            int r7 = r2 + (-5)
        L13:
            byte r0 = (byte) r7
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r5) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L22:
            int r8 = r8 + 1
            r0 = r6[r8]
            r2 = r7
            r7 = r0
            goto Lf
        L29:
            r1 = r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelopsecurecmodule.ScmJni.o(int, int, byte, java.lang.Object[]):void");
    }

    private native byte[] p1(byte[] bArr, int i2, int i3, int i4, byte[] bArr2, boolean z2);

    private native byte[] p3(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2, int i3, int i4, int i5, byte[] bArr5, boolean z2);

    /* JADX WARN: Removed duplicated region for block: B:110:0x0ca9 A[Catch: all -> 0x11d8, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x11d8, blocks: (B:92:0x0aad, B:110:0x0ca9, B:131:0x0e6e), top: B:205:0x0e6e }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0e26  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x029d A[PHI: r11
  0x029d: PHI (r11v76 long) = (r11v11 long), (r11v83 long) binds: [B:108:0x0ca5, B:25:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0a3f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] c(byte[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelopsecurecmodule.ScmJni.c(byte[]):byte[]");
    }

    public final native byte[] m(int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][] bArr5);

    public final native int spn(boolean z2, String str);
}
