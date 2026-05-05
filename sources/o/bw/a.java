package o.bw;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.a.i;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f21769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<String> f21770b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f21771c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f21772d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f21773e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f21774g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21775h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21776i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21777j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r5, byte r6, byte r7) {
        /*
            int r0 = r7 * 2
            int r7 = 4 - r0
            int r6 = 122 - r6
            int r5 = r5 * 3
            int r0 = r5 + 1
            byte[] r4 = o.bw.a.$$a
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r4 != 0) goto L28
            r6 = r5
            r0 = r7
            r1 = r2
        L14:
            int r7 = r7 + 1
            int r0 = -r0
            int r6 = r6 + r0
        L18:
            byte r0 = (byte) r6
            r3[r1] = r0
            if (r1 != r5) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L23:
            r0 = r4[r7]
            int r1 = r1 + 1
            goto L14
        L28:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bw.a.$$c(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21774g = 0;
        f21777j = 1;
        f21775h = 0;
        f21776i = 1;
        e();
        ViewConfiguration.getJumpTapTimeout();
        Process.myPid();
        Object[] objArr = new Object[1];
        f((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), "꽌糖࿓ᜣﴲ㔺㤁嚫焳蝭\udb5f쬞孪쉯哹꧍뼊\ueae4댋ྗ핰㷎", "\u0000\u0000\u0000\u0000", "돆ꧧᬓ釓", KeyEvent.keyCodeFromString(""), objArr);
        Object[] objArr2 = new Object[1];
        f((char) (TextUtils.indexOf("", "", 0, 0) + 26650), "蘳폠\udc44ڵ䨢\ue21c쏉\ude72Ǔ㞾怲ం肀畑❛䞁赱ᐠग़䘤磕ᩦꛆ絬\u09b1텟ᦏ", "\u0000\u0000\u0000\u0000", "钁ཬ\u1ad4穨", (-737186668) - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        Object[] objArr3 = new Object[1];
        f((char) (TextUtils.getTrimmedLength("") + 47402), "\ue3a9㒑䷅❵䞃溂헿ӟ\ue5f9ʼ쐤海햊靰\ue094퐢\ueefe羌\uf194貼㝞ሮᆯ텲굯읪풗0㷱略狐볽Ƣ甁ꄇ䤿䫒䩀饾", "\u0000\u0000\u0000\u0000", "赫笌⪎\ue3b9", (-1904538483) - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
        Object[] objArr4 = new Object[1];
        f((char) (6563 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), "尉\u07fb\ue454矛\uf208虼畩\u0abaṜ\ue93d雊伖抏璶\ue760粡囙䋜\u2d9e⫚㘽䪄ꎼ躞\uf481Å䘬ꏆ犍뒝ꤙאַ耧挮▙苆ᮩ櫏Ⳏ⇒\ue3fa", "\u0000\u0000\u0000\u0000", "쎒链ꊹ쨙", (-1181417789) - Color.argb(0, 0, 0, 0), objArr4);
        f21769a = new String[]{((String) objArr[0]).intern(), ((String) objArr2[0]).intern(), ((String) objArr3[0]).intern(), ((String) objArr4[0]).intern()};
        int i2 = f21777j + 115;
        f21774g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> a(android.content.Context r4) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = o.bw.a.f21776i
            int r1 = r0 + 3
            int r0 = r1 % 128
            o.bw.a.f21775h = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L30
            java.util.List<java.lang.String> r1 = o.bw.a.f21770b
            r0 = 36
            int r0 = r0 / 0
            if (r1 != 0) goto L22
        L16:
            java.lang.String[] r0 = o.bw.a.f21769a
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = a(r4, r0)
            o.bw.a.f21770b = r0
        L22:
            java.util.List<java.lang.String> r2 = o.bw.a.f21770b
            int r0 = o.bw.a.f21775h
            int r1 = r0 + 1
            int r0 = r1 % 128
            o.bw.a.f21776i = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L35
            return r2
        L30:
            java.util.List<java.lang.String> r0 = o.bw.a.f21770b
            if (r0 != 0) goto L22
            goto L16
        L35:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bw.a.a(android.content.Context):java.util.List");
    }

    private static List<String> a(Context context, List<String> list) throws Throwable {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!e(context, str)) {
                int i3 = f21775h + 25;
                f21776i = i3 % 128;
                if (i3 % 2 == 0) {
                    f.a();
                    throw null;
                }
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    f((char) (Color.blue(0) + 362), "禬縼侀췭ሒ\udc87\ue1e0\uf57c\ue141烅Ꙙ\ueac1\uf643ಎ࡞겔靳ﯸ", "\u0000\u0000\u0000\u0000", "\udfa0\ued57権ꈁ", Color.alpha(0), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr2 = new Object[1];
                    f((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 2127), "\ud88d岮잟䓘넖鹻範쨜ᷭאָፆ㰑\uda70䇓遦\udc7f纔⨨奤", "\u0000\u0000\u0000\u0000", "ᢱ頔亙済", ExpandableListView.getPackedPositionGroup(0L) - 1718086632, objArr2);
                    f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
                    int i4 = f21776i + 51;
                    f21775h = i4 % 128;
                    int i5 = i4 % 2;
                }
                arrayList.add(str);
                int i6 = f21776i + 25;
                f21775h = i6 % 128;
                int i7 = i6 % 2;
            } else if (f.a()) {
                Object[] objArr3 = new Object[1];
                f((char) (362 - TextUtils.getTrimmedLength("")), "禬縼侀췭ሒ\udc87\ue1e0\uf57c\ue141烅Ꙙ\ueac1\uf643ಎ࡞겔靳ﯸ", "\u0000\u0000\u0000\u0000", "\udfa0\ued57権ꈁ", KeyEvent.getMaxKeyCode() >> 16, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr4 = new Object[1];
                f((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), "\udac1癃䯙\ue711⏸耛횿胑붉ᄓ朶", "\u0000\u0000\u0000\u0000", "ﲍ\uf79d鯣誌", (-470311427) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
                StringBuilder sbAppend = sb2.append(((String) objArr4[0]).intern()).append(str);
                Object[] objArr5 = new Object[1];
                f((char) (23778 - ((byte) KeyEvent.getModifierMetaStateMask())), "\ue282㋚ퟎ尼見탪熪摊ᎂ\u0df6ᱦ灥৭킨苢렻", "\u0000\u0000\u0000\u0000", "햿⤝\ue388❜", ViewConfiguration.getEdgeSlop() >> 16, objArr5);
                f.c(strIntern2, sbAppend.append(((String) objArr5[0]).intern()).toString());
            }
        }
        return arrayList;
    }

    public static void b() {
        int i2 = 2 % 2;
        int i3 = f21776i + 113;
        int i4 = i3 % 128;
        f21775h = i4;
        int i5 = i3 % 2;
        f21770b = null;
        int i6 = i4 + 15;
        f21776i = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 98 / 0;
        }
    }

    static void e() {
        f21772d = 740602047300126166L;
        f21773e = -841951249;
        f21771c = (char) 17878;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r5, r6) != (-1)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        r1 = o.bw.a.f21775h + 59;
        o.bw.a.f21776i = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r5, r6) != (-1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = o.bw.a.f21775h
            int r1 = r0 + 73
            int r0 = r1 % 128
            o.bw.a.f21776i = r0
            int r1 = r1 % r4
            r3 = 0
            r2 = -1
            if (r1 != 0) goto L24
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r5, r6)
            r0 = 62
            int r0 = r0 / r3
            if (r1 == r2) goto L2b
        L19:
            int r0 = o.bw.a.f21775h
            int r1 = r0 + 59
            int r0 = r1 % 128
            o.bw.a.f21776i = r0
            int r1 = r1 % r4
            r0 = 1
            return r0
        L24:
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r5, r6)
            if (r0 == r2) goto L2b
            goto L19
        L2b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bw.a.e(android.content.Context, java.lang.String):boolean");
    }

    private static void f(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        char c3 = 2;
        int i3 = 2 % 2;
        int i4 = $10 + 45;
        $11 = i4 % 128;
        Object obj = null;
        Object charArray = str6;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            int i5 = $10 + 81;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                str5.toCharArray();
                throw null;
            }
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object obj2 = str4;
        if (str4 != null) {
            char[] charArray3 = str4.toCharArray();
            int i6 = $10 + 57;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            obj2 = charArray3;
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
        int length3 = ((char[]) obj2).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int i8 = 106 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    char cRed = (char) Color.red(0);
                    int i9 = 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b2 = $$a[c3];
                    byte b3 = b2;
                    objA = o.d.d.a(i8, cRed, i9, -155898465, false, $$c(b3, (byte) (57 | b3), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    int iResolveSize = View.resolveSize(0, 0) + 847;
                    char c4 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6487);
                    int i10 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12;
                    byte b4 = $$a[2];
                    byte b5 = b4;
                    objA2 = o.d.d.a(iResolveSize, c4, i10, -694521287, false, $$c(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 54))), b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    int iArgb = 458 - Color.argb(0, 0, 0, 0);
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int iAxisFromString = 10 - MotionEvent.axisFromString("");
                    byte b6 = $$a[2];
                    byte b7 = b6;
                    objA3 = o.d.d.a(iArgb, bitsPerPixel, iAxisFromString, 1804962841, false, $$c(b7, (byte) ((b7 + 56) - (56 & b7)), b6), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    int iRgb = (-16776577) - Color.rgb(0, 0, 0);
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 65100);
                    int iGreen = 12 - Color.green(0);
                    c3 = 2;
                    byte b8 = $$a[2];
                    byte b9 = b8;
                    objA4 = o.d.d.a(iRgb, deadChar, iGreen, 1636969060, false, $$c(b8, b9, b9), new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c3 = 2;
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f21772d ^ 740602047300126166L)) ^ ((long) ((int) (((long) f21773e) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f21771c) ^ 740602047300126166L))));
                iVar.f19932b++;
                obj = null;
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
        $$a = new byte[]{99, Ascii.EM, 0, 108};
        $$b = 111;
    }
}
