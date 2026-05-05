package o.fj;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import o.a.n;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f25922d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f25923e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f25924f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f25925g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25926h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f25927i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25930c;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(byte r9, int r10, short r11) {
        /*
            byte[] r8 = o.fj.c.$$c
            int r0 = r11 * 3
            int r0 = 3 - r0
            int r1 = r9 * 3
            int r7 = 1 - r1
            int r1 = r10 * 2
            int r6 = r1 + 113
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r8 != 0) goto L2c
            r6 = r7
            r1 = r0
            r3 = r4
        L16:
            int r0 = -r0
            int r6 = r6 + r0
            r0 = r1
            r2 = r3
        L1a:
            int r1 = r0 + 1
            int r3 = r2 + 1
            byte r0 = (byte) r6
            r5[r2] = r0
            if (r3 != r7) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L29:
            r0 = r8[r1]
            goto L16
        L2c:
            r2 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fj.c.$$e(byte, int, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f25927i = -120376837;
        f25925g = 1843848233;
        f25924f = 1180176130;
        init$0();
        f25922d = 0;
        f25926h = 1;
        f25923e = -1270219400;
    }

    public static Object[] c(int i2, int i3) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        String line;
        boolean zEquals;
        boolean zEquals2;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        File file2;
        File file3;
        int i4 = 2 % 2;
        try {
            Object[] objArr3 = new Object[1];
            k((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19, "\b\b\t\uffdd\f\uffff\u0001\u0001\u000f￼\uffff\uffde\r\u0003\ufffe\uffff\u000e�\uffff", true, 201 - TextUtils.getCapsMode("", 0, 0), 13 - TextUtils.lastIndexOf("", '0', 0), objArr3);
            Object[] objArr4 = new Object[1];
            k(Color.green(0) + 18, "\u0002\ufffa\u0010\u000b\ufffe\u0000\u0000\u000e\ufffb\ufffe\uffdd\u000b\b\uffdf\u0000\u0007\u0002\r", true, 202 - KeyEvent.keyCodeFromString(""), Color.red(0) + 3, objArr4);
            String[] strArr = {((String) objArr3[0]).intern(), ((String) objArr4[0]).intern()};
            int i5 = f25922d + 3;
            f25926h = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 2;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= 2) {
                    objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
                    int i8 = ~i2;
                    int i9 = i3 + (-1719450377) + ((((-117973793) + i8) - ((-117973793) & i8)) * 494) + (((-1) - (((-1) - (~((-1) - (((-1) - i8) & ((-1) - (-120402867)))))) & ((-1) - 683006170))) * 494);
                    int i10 = i9 ^ (i9 << 13);
                    int i11 = i10 ^ (i10 >>> 17);
                    break;
                }
                String str = strArr[i7];
                Object[] objArr5 = new Object[1];
                k((ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, "￤ￎ\u0013\u000fￎ\u0004\t\u000f\u0012\u0004\u000e\u0001\u0007\u0015\u0002\u0005", true, 195 - TextUtils.indexOf("", "", 0, 0), 12 - (ViewConfiguration.getTapTimeout() >> 16), objArr5);
                Class<?> cls = Class.forName(((String) objArr5[0]).intern());
                if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                    int i12 = f25922d + 49;
                    f25926h = i12 % 128;
                    int i13 = i12 % 2;
                    objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 1}};
                    int i14 = f25924f * 358546975;
                    f25924f = i14;
                    int i15 = (-1315556657) + (((~((-142868481) | i14)) | (~((~i14) | 535279541))) * (-318));
                    int i16 = ~(159875249 | i14);
                    int i17 = i15 + (((i16 + 375404292) - (i16 & 375404292)) * (-318));
                    int i18 = ~(i14 | (-159875250));
                    int i19 = i3 + i17 + (((i18 - 518272773) - (i18 & (-518272773))) * 318) + 16;
                    int i20 = i19 ^ (i19 << 13);
                    int i21 = i20 ^ (i20 >>> 17);
                    break;
                }
                i7++;
            }
        } catch (Exception unused) {
            objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 2}};
            int i22 = ~i2;
            int i23 = (-1) - (((-1) - (~((-13154306) | i22))) & ((-1) - (-664993717)));
            int i24 = ~((13154305 + i2) - (13154305 & i2));
            int i25 = i3 + (-1887059623) + (((i23 + i24) - (i23 & i24)) * (-564)) + ((~((-1) - (((-1) - (-656558005)) & ((-1) - i2)))) * 1128) + (((-1) - (((-1) - (~((-1) - (((-1) - i22) & ((-1) - (-664993717)))))) & ((-1) - (-669712310)))) * 564) + 16;
            int i26 = i25 ^ (i25 << 13);
            int i27 = i26 ^ (i26 >>> 17);
        }
        if (i2 != ((int[]) objArr[3])[0]) {
            return objArr;
        }
        try {
            Object objA = o.d.d.a(26976634);
            if (objA == null) {
                int i28 = 324 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int i29 = 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                l(b2, b3, b3, objArr6);
                objA = o.d.d.a(i28, maxKeyCode, i29, -685882593, false, (String) objArr6[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objA).invoke(null, null)).longValue();
            long j2 = 397051765;
            long j3 = (((long) 960) * j2) + (((long) (-1917)) * jLongValue);
            long j4 = 959;
            long j5 = -1;
            long j6 = jLongValue ^ j5;
            long jMyPid = Process.myPid();
            long j7 = jMyPid ^ j5;
            long j8 = j3 + ((((j6 | j7) ^ j5) | (((-1) - (((-1) - j2) & ((-1) - jMyPid))) ^ j5)) * j4) + (((long) (-959)) * j6);
            long j9 = ((j6 + jMyPid) - (j6 & jMyPid)) ^ j5;
            long j10 = j5 ^ ((j7 + j2) - (j7 & j2));
            long j11 = j8 + (j4 * ((j9 + j10) - (j9 & j10))) + ((long) (-935332923));
            int i30 = ~i2;
            int i31 = (-1) - (((-1) - ((int) (j11 >> 32))) | ((-1) - ((((-1453938172) + (((~((-1) - (((-1) - 1071072099) & ((-1) - i30)))) | (-1786668786)) * 519)) + (((~((-1076372625) | i30)) | (~(((-710296162) + i2) - ((-710296162) & i2)))) * (-519))) + (((-1) - (((-1) - (~((-1) - (((-1) - (-1786668786)) & ((-1) - i2))))) & ((-1) - (-1071072100)))) * 519))));
            int i32 = (int) j11;
            int iMyPid = Process.myPid();
            int i33 = ~iMyPid;
            int i34 = (((~((-1) - (((-1) - (-170526742)) & ((-1) - i33)))) | (~((-1) - (((-1) - 1782569269) & ((-1) - iMyPid))))) * 988) + 710258225;
            int i35 = ~((-1) - (((-1) - iMyPid) & ((-1) - (-1245698358))));
            if ((-1) - (((-1) - i31) & ((-1) - (i32 & (i34 + (((-1) - (((-1) - ((i35 + 1075171616) - (i35 & 1075171616))) & ((-1) - (~(i33 | 1782569269))))) * 988))))) == 1) {
                objArr2 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 10}};
                int i36 = ~((-576729858) | i2);
                int i37 = i3 + (-1320337447) + (((67241088 + i36) - (67241088 & i36)) * (-476)) + (i36 * 952) + ((~(((-576729858) + i30) - ((-576729858) & i30))) * 476) + 16;
                int i38 = i37 ^ (i37 << 13);
                int i39 = i38 ^ (i38 >>> 17);
            } else {
                objArr2 = new Object[]{new int[1], new int[]{i2}, null, new int[]{i2}};
                int i40 = ~((int) SystemClock.elapsedRealtime());
                int i41 = i3 + (((~((-836768357) | i40)) | 813695040) * (-241)) + 1609928436 + (((~(i40 | (-23073317))) | (-972315375)) * 241);
                int i42 = i41 ^ (i41 << 13);
                int i43 = i42 ^ (i42 >>> 17);
                ((int[]) objArr2[0])[0] = i43 ^ (i43 << 5);
            }
            if (i2 != ((int[]) objArr2[3])[0]) {
                return objArr2;
            }
            try {
                Object[] objArr7 = new Object[1];
                k(41 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\b\u0002\u000f\u000b\u0002\tￌ\u0001\u0002\uffff\u0012\u0004ￌ\u0011\u000f\ufffe\u0000\u0006\u000b\u0004ￌ\u0000\u0012\u000f\u000f\u0002\u000b\u0011￼\u0011\u000f\ufffe\u0000\u0002\u000fￌ\u0010\u0016\u0010ￌ", false, AndroidCharacter.getMirror('0') + 150, ExpandableListView.getPackedPositionChild(0L) + 36, objArr7);
                file3 = new File(((String) objArr7[0]).intern());
            } catch (Exception unused2) {
            }
            if ((!file3.canRead() ? '8' : (char) 7) != 7) {
                line = null;
            } else {
                fileReader = new FileReader(file3);
                bufferedReader = new BufferedReader(fileReader);
                try {
                    line = bufferedReader.readLine();
                    Object[] objArr8 = new Object[1];
                    k(3 - View.combineMeasuredStates(0, 0), "\u0000\u0001\uffff", false, 210 - (ViewConfiguration.getPressedStateDuration() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 2, objArr8);
                    if (line.equals(((String) objArr8[0]).intern())) {
                        fileReader.close();
                        bufferedReader.close();
                        int i44 = f25926h + 59;
                        f25922d = i44 % 128;
                        int i45 = i44 % 2;
                        line = null;
                    } else {
                        fileReader.close();
                        bufferedReader.close();
                    }
                } finally {
                }
            }
            try {
                Object[] objArr9 = new Object[1];
                k(30 - Process.getGidForName(""), "\f\u0003�\u0003\u0001\uffff\u0010\u0012\u0004ￍ\n\u0003\f\u0010\u0003\tￍ\u0011\u0017\u0011ￍ\u0001\r\u0010\u000eￍ\u0002\u0003\n\u0000\uffff", true, 197 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0, 0) + 26, objArr9);
                file2 = new File(((String) objArr9[0]).intern());
            } catch (Exception unused3) {
                zEquals = false;
            }
            if (file2.canRead()) {
                fileReader = new FileReader(file2);
                bufferedReader = new BufferedReader(fileReader);
                try {
                    String line2 = bufferedReader.readLine();
                    Object[] objArr10 = new Object[1];
                    k(1 - ((Process.getThreadPriority(0) + 20) >> 6), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false, TextUtils.lastIndexOf("", '0') + 149, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr10);
                    zEquals = line2.equals(((String) objArr10[0]).intern());
                    fileReader.close();
                    bufferedReader.close();
                } finally {
                }
            } else {
                zEquals = false;
            }
            if (zEquals) {
                try {
                    Object[] objArr11 = new Object[1];
                    k(ImageFormat.getBitsPerPixel(0) + 37, "\u0005\f\u0007\u0001\uffff\u0010\u0012ￍ\u0005\u0013\u0000\u0003\u0002ￍ\n\u0003\f\u0010\u0003\tￍ\u0011\u0017\u0011ￍ\f\r�\u0005\f\u0007\u0001\uffff\u0010\u0012ￍ", true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 197, 26 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr11);
                    file = new File(((String) objArr11[0]).intern());
                } catch (Exception unused4) {
                    zEquals2 = false;
                }
                if (file.canRead()) {
                    fileReader = new FileReader(file);
                    bufferedReader = new BufferedReader(fileReader);
                    try {
                        String line3 = bufferedReader.readLine();
                        Object[] objArr12 = new Object[1];
                        k(1 - Color.alpha(0), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false, TextUtils.indexOf((CharSequence) "", '0') + 149, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr12);
                        zEquals2 = line3.equals(((String) objArr12[0]).intern());
                        fileReader.close();
                        bufferedReader.close();
                    } finally {
                    }
                } else {
                    zEquals2 = false;
                }
                if (zEquals2) {
                    int i46 = f25926h + 123;
                    f25922d = i46 % 128;
                    int i47 = i46 % 2;
                    if (line != null) {
                        Object[] objArr13 = {new int[]{i ^ (i << 5)}, new int[]{i2}, line, new int[]{i2 ^ 20}};
                        int i48 = f25925g * 1021243449;
                        f25925g = i48;
                        int i49 = i3 + (-552024753) + (((-1) - (((-1) - (~((-1) - (((-1) - (-230902343)) & ((-1) - i48))))) & ((-1) - (-535523184)))) * (-502)) + ((~((~i48) | (-88277505))) * (-502)) + (((-1) - (((-1) - (~(i48 | (-447245680)))) & ((-1) - (-230902343)))) * 502) + 16;
                        int i50 = i49 ^ (i49 << 13);
                        int i51 = i50 ^ (i50 >>> 17);
                        return objArr13;
                    }
                }
            }
            Object[] objArr14 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
            int i52 = f25927i * 328334229;
            f25927i = i52;
            int i53 = 675555838 + ((~((~i52) | (-302137353))) * 433);
            int i54 = ~((-1) - (((-1) - (-225001448)) & ((-1) - i52)));
            int i55 = i3 + i53 + (((i54 - 453146575) - (i54 & (-453146575))) * (-433)) + (((-1) - (((-1) - (~((-1) - (((-1) - i52) & ((-1) - (-453146575)))))) & ((-1) - (-527138800)))) * 433);
            int i56 = i55 ^ (i55 << 13);
            int i57 = i56 ^ (i56 >>> 17);
            return objArr14;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        $$a = new byte[]{34, 36, MessagePack.Code.EXT32, -5};
        $$b = 155;
    }

    static void init$1() {
        $$c = new byte[]{Ascii.EM, -93, 95, -122};
        $$d = 202;
    }

    private static void k(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 31;
        $10 = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        int i7 = $11 + 105;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (nVar.f19944a < i2) {
            int i9 = $11 + 59;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i11 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i11]), Integer.valueOf(f25923e)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a(Color.red(0) + 270, (char) (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -2071844881, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 522, (char) (Process.getGidForName("") + 1), Color.red(0) + 12, 627984172, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i12 = $11 + 7;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(522 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 12 - (ViewConfiguration.getPressedStateDuration() >> 16), 627984172, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void l(byte b2, byte b3, byte b4, Object[] objArr) {
        int i2 = b2 * 2;
        byte[] bArr = $$a;
        int i3 = 4 - (b3 * 3);
        int i4 = 100 - (b4 * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + i4;
            i3++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 += bArr[i3];
                i3++;
            }
        }
    }

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f25926h + 67;
        int i4 = i3 % 128;
        f25922d = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f25928a;
        int i6 = i4 + 79;
        f25926h = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final void b() {
        int i2 = 2 % 2;
        int i3 = f25922d + 97;
        f25926h = i3 % 128;
        int i4 = i3 % 2;
        this.f25930c = true;
    }

    public final boolean c() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f25922d + 75;
        int i4 = i3 % 128;
        f25926h = i4;
        if (i3 % 2 == 0) {
            z2 = this.f25930c;
            int i5 = 98 / 0;
        } else {
            z2 = this.f25930c;
        }
        int i6 = i4 + 9;
        f25922d = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final void d() {
        int i2 = 2 % 2;
        int i3 = f25922d + 103;
        f25926h = i3 % 128;
        int i4 = i3 % 2;
        this.f25928a = true;
    }

    public final void e() {
        int i2 = 2 % 2;
        int i3 = f25926h;
        int i4 = i3 + 27;
        f25922d = i4 % 128;
        this.f25929b = i4 % 2 == 0;
        int i5 = i3 + 15;
        f25922d = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean j() {
        int i2 = 2 % 2;
        int i3 = f25926h + 113;
        f25922d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f25929b;
        }
        throw null;
    }
}
