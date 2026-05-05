package o.dg;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.i;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f22954a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22955b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f22956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22957d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f22958e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22959j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, byte r8, byte r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 + 65
            byte[] r6 = o.dg.a.$$a
            int r1 = r9 * 4
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r6 != 0) goto L28
            r1 = r8
            r0 = r4
        L13:
            int r7 = r7 + r1
        L14:
            byte r1 = (byte) r7
            r5[r0] = r1
            int r8 = r8 + 1
            if (r0 != r3) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L21:
            r2 = r6[r8]
            int r0 = r0 + 1
            r1 = r7
            r7 = r2
            goto L13
        L28:
            r0 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dg.a.$$c(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22955b = 0;
        f22959j = 1;
        e();
        TextUtils.lastIndexOf("", '0', 0, 0);
        View.resolveSizeAndState(0, 0, 0);
        f22956c = new Object();
        int i2 = f22955b + 63;
        f22959j = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void b() {
        synchronized (f22956c) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f((char) (ViewConfiguration.getWindowTouchSlop() >> 8), "塚鞁겑㯐\ue746抋㙕䇁㉻䖑敒桯鵥䶂ẚ頿⇯\ue775\uf756橠䵠", "㋗鋯⊴齀", "퍊ꊀ达∶", (-1096646445) - Gravity.getAbsoluteGravity(0, 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f((char) (Color.rgb(0, 0, 0) + 16777216), "৾髮䅇\uf1e8뙉鵞뼏㇤\uec3b創蝴ࡃ篴箴練黩䟹笏抻諯ꗌൈ춲浚", "㋗鋯⊴齀", "\uf292璜\u244e楜", Process.myTid() >> 22, objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
        }
    }

    static void e() {
        f22958e = -7708184438371289343L;
        f22957d = 1564493270;
        f22954a = (char) 17878;
    }

    private static void f(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            int i4 = $10 + 45;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
                charArray2 = str5.toCharArray();
            } else {
                charArray2 = str5.toCharArray();
            }
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
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 107, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), View.getDefaultSize(0, 0) + 11, -155898465, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) 3;
                    byte b5 = (byte) (b4 - 4);
                    objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 848, (char) (6488 - Color.blue(0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12, -694521287, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    int bitsPerPixel = 457 - ImageFormat.getBitsPerPixel(0);
                    char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 12;
                    int i6 = $$b;
                    byte b6 = (byte) ((i6 + 3) - (i6 | 3));
                    byte b7 = (byte) (-b6);
                    objA3 = o.d.d.a(bitsPerPixel, c3, packedPositionChild, 1804962841, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) (-1);
                    objA4 = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 639, (char) (AndroidCharacter.getMirror('0') + 65052), 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1636969060, false, $$c((byte) 57, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f22958e ^ 740602047300126166L)) ^ ((long) ((int) (((long) f22957d) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f22954a) ^ 740602047300126166L))));
                iVar.f19932b++;
                int i7 = $11 + 1;
                $10 = i7 % 128;
                int i8 = i7 % 2;
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
        $$a = new byte[]{82, -6, -97, -22};
        $$b = 157;
    }
}
