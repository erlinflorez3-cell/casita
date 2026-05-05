package o.dq;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.a.i;
import o.ea.g;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f23236a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23237b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23238c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23239d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f23240e = 0;

    private static String $$c(byte b2, byte b3, int i2) {
        int i3 = b3 + 65;
        int i4 = b2 + 4;
        int i5 = i2 * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3 = (-i4) + i3;
            i4 = i4;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            int i8 = i4 + 1;
            i3 = (-bArr[i8]) + i3;
            i4 = i8;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23237b = 0;
        f23238c = 1;
        f23236a = -7930787586687243773L;
        f23239d = 1564493270;
        f23240e = (char) 17878;
    }

    public static String b(String str, String str2) throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        byte[] bArrB = o.eh.e.b(new StringBuilder().append(str).append(str2).toString().getBytes(g.c()));
        int i3 = f23238c + 29;
        f23237b = i3 % 128;
        int i4 = i3 % 2;
        for (byte b2 : bArrB) {
            int i5 = b2 & 255;
            if (i5 < 16) {
                Object[] objArr = new Object[1];
                f((char) (22115 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "兾", "꿕\udf2dଖ鮷", "♄\ue923揹煖", Gravity.getAbsoluteGravity(0, 0) - 102161626, objArr);
                sb.append(((String) objArr[0]).intern()).append(Integer.toHexString(i5));
                int i6 = f23237b + 15;
                f23238c = i6 % 128;
                int i7 = i6 % 2;
            } else {
                sb.append(Integer.toHexString(i5));
            }
        }
        return sb.toString();
    }

    private static void f(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = 1;
        int i6 = $11 + 1;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object obj = null;
        Object charArray2 = str5;
        if (str5 != null) {
            int i8 = $11 + 69;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                str5.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            charArray3 = str4.toCharArray();
        }
        i iVar = new i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            int i9 = $11 + 65;
            $10 = i9 % 128;
            int i10 = i9 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 11;
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    String str$$c = $$c(b2, b3, b3);
                    Class[] clsArr = new Class[i5];
                    clsArr[0] = Object.class;
                    objA = o.d.d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 107, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), iCombineMeasuredStates, -155898465, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    int i11 = 847 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 6488);
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 12;
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 4);
                    String str$$c2 = $$c(b4, b5, (byte) (b5 - 3));
                    Class[] clsArr2 = new Class[i5];
                    clsArr2[0] = Object.class;
                    objA2 = o.d.d.a(i11, windowTouchSlop, iIndexOf, -694521287, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                int i12 = cArr3[iVar.f19932b % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[i5] = Integer.valueOf(i12);
                objArr4[0] = iVar;
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (-b6);
                    objA3 = o.d.d.a(Process.getGidForName("") + 459, (char) ((Process.getThreadPriority(0) + 20) >> 6), (Process.myTid() >> 22) + 11, 1804962841, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) (-1);
                    i3 = 2;
                    objA4 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 638, (char) (65100 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, 1636969060, false, $$c(b8, (byte) (57 & b8), (byte) 0), new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i3 = 2;
                }
                obj = null;
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r10[iVar.f19932b])) ^ (f23236a ^ 740602047300126166L)) ^ ((long) ((int) (((long) f23239d) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f23240e) ^ 740602047300126166L))));
                i5 = 1;
                iVar.f19932b++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    static void init$0() {
        $$a = new byte[]{120, 46, 101, 90};
        $$b = 74;
    }
}
