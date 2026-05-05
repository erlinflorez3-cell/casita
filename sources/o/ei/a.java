package o.ei;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Arrays;
import o.a.k;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23869a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f23870b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23871c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23872d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23873e = 0;

    private static String $$c(byte b2, int i2, byte b3) {
        int i3 = b3 + 4;
        int i4 = 114 - (i2 * 7);
        int i5 = b2 * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 += i6;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i3++;
            i4 += bArr[i3];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23873e = 0;
        f23869a = 1;
        f23871c = 0;
        f23872d = 1;
        d();
        Process.getElapsedCpuTime();
        ViewConfiguration.getWindowTouchSlop();
        Color.rgb(0, 0, 0);
        int i2 = f23869a + 83;
        f23873e = i2 % 128;
        int i3 = i2 % 2;
    }

    public static short a(byte[] bArr) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23871c + 3;
        f23872d = i3 % 128;
        int i4 = i3 % 2;
        if (bArr.length != 2) {
            Object[] objArr = new Object[1];
            f("ᝋ멩\u171b哈쾼ት汴ꁻ걮ဒ圫\uebd5懳\udf63鯰⼗⛎骧쀖鉄﨎昙Ԟ헽뽕ⵃ䦾ᢵ璮\ue890身屁࠺랮㍪螖쵅猽", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern());
        }
        while (bArr[0] == 0) {
            int i5 = f23872d + 121;
            f23871c = i5 % 128;
            int i6 = i5 % 2;
            bArr = Arrays.copyOfRange(bArr, 1, bArr.length);
            int i7 = f23871c + 9;
            f23872d = i7 % 128;
            int i8 = i7 % 2;
        }
        return Short.valueOf(o.dl.d.e(bArr)).shortValue();
    }

    public static byte[] b(short s2) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        String strValueOf = String.valueOf((int) s2);
        if (strValueOf.length() > 3) {
            Object[] objArr = new Object[1];
            f("遖\u09d2逆\ue773뻧挮輢䌭⭳ꎩ♰ࢃ\ue6ee泐\ueab7챃ꇇ⤑녍焖紕헱瑅㛤㡅麽㢩﮸\uf3f0嬮", 1 - KeyEvent.normalizeMetaState(0), objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern());
        }
        while (strValueOf.length() < 4) {
            int i3 = f23871c + 71;
            f23872d = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                f("\u2d7d㒶ⵍ\uf8cf\udebb", 1 << TextUtils.indexOf("", ""), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                f("\u2d7d㒶ⵍ\uf8cf\udebb", 1 - TextUtils.indexOf("", ""), objArr3);
                obj = objArr3[0];
            }
            strValueOf = ((String) obj).intern().concat(strValueOf);
            int i4 = f23872d + 67;
            f23871c = i4 % 128;
            int i5 = i4 % 2;
        }
        return o.dl.d.e(strValueOf);
    }

    static void d() {
        f23870b = -230862530838758231L;
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 77;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        k kVar = new k();
        char[] cArrC = k.c(f23870b ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        int i6 = $10 + 79;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (kVar.f19939c < cArrC.length) {
            int i8 = $10 + 91;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i10 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f23870b)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a(229 - Drawable.resolveOpacity(0, 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 51004), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8, 1749983833, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - Color.blue(0), (char) TextUtils.getOffsetAfter("", 0), 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 522683165, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    static void init$0() {
        $$a = new byte[]{37, 84, 56, -21};
        $$b = 204;
    }
}
