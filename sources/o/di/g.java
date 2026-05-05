package o.di;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.i;

/* JADX INFO: loaded from: classes6.dex */
final class g extends d {
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23056a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static short[] f23057b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f23058c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23059d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23060e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f23061f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23062g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23063h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f23064i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23065j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f23066k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f23067m = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r8, short r9, int r10) {
        /*
            int r0 = r10 * 2
            int r7 = r0 + 4
            int r6 = r9 + 65
            byte[] r5 = o.di.g.$$c
            int r4 = r8 * 4
            int r0 = r4 + 1
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r5 != 0) goto L27
            r0 = r6
            r1 = r2
            r6 = r4
        L14:
            int r7 = r7 + 1
            int r6 = r6 + r0
        L17:
            byte r0 = (byte) r6
            r3[r1] = r0
            if (r1 != r4) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L22:
            int r1 = r1 + 1
            r0 = r5[r7]
            goto L14
        L27:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.di.g.$$e(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23066k = 0;
        f23067m = 1;
        f23063h = 0;
        f23065j = 1;
        b();
        TextUtils.lastIndexOf("", '0', 0);
        Gravity.getAbsoluteGravity(0, 0);
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getPressedStateDuration();
        Drawable.resolveOpacity(0, 0);
        int i2 = f23066k + 117;
        f23067m = i2 % 128;
        int i3 = i2 % 2;
    }

    g() {
    }

    static void b() {
        f23059d = 33665416;
        f23060e = 1150422436;
        f23056a = 1293788977;
        f23058c = new byte[]{126, 111, -97, 103, -115, 113, -109, -97, 104, 71, -76, -99, 100, -105, 113, -100, -104, 97, -97, -105, 103, 67, -72, 109, -101, 98, 105, 104, 115, -76, 72, -72, 79, 78, 64, 76, Ascii.FF, -71, -13, -78, 75, -72, 94, -77, -73, 78, -80, -72, 72, 76, 3, -22, 72, 73, 78, 69, 8, -66, 64, -11, 72, -94, 94, -68, -80, 71, 72, 104, -88, -92, 94, -93, 83, 91, 68, -70, -90, 68, -86, -93, -84, 104, -94, -89, 85, -87, 94, -93, 68, -68, 82, -92, 93, 86, -73, 110, Ascii.NAK, -31, Ascii.CAN, -28, Ascii.DC4, 6, 5, -12, 19, -22, -20};
        f23061f = 740602047300126166L;
        f23062g = 1564493270;
        f23064i = (char) 4795;
    }

    static void init$0() {
        $$c = new byte[]{60, 66, -100, 104};
        $$d = 62;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01c0 A[PHI: r4
  0x01c0: PHI (r4v32 int) = (r4v3 int), (r4v35 int) binds: [B:42:0x01d5, B:38:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d8 A[PHI: r4
  0x01d8: PHI (r4v4 int) = (r4v3 int), (r4v35 int) binds: [B:42:0x01d5, B:38:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(short r28, int r29, int r30, int r31, byte r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.di.g.p(short, int, int, int, byte, java.lang.Object[]):void");
    }

    private static void q(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        int i4 = $10 + 53;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object obj = str6;
        if (str6 != null) {
            char[] charArray = str6.toCharArray();
            int i6 = $11 + 73;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            int i8 = $11 + 91;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            charArray3 = str4.toCharArray();
        }
        i iVar = new i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i10 = 0;
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
                    int offsetBefore = TextUtils.getOffsetBefore("", i10) + 106;
                    char threadPriority = (char) ((Process.getThreadPriority(i10) + 20) >> 6);
                    int offsetBefore2 = TextUtils.getOffsetBefore("", i10) + 11;
                    byte b2 = (byte) i10;
                    byte b3 = b2;
                    String str$$e = $$e(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i10] = Object.class;
                    objA = o.d.d.a(offsetBefore, threadPriority, offsetBefore2, -155898465, false, str$$e, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    int i11 = 848 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i10, i10) + 6489);
                    int scrollDefaultDelay = 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b4 = (byte) i10;
                    byte b5 = (byte) (b4 + 3);
                    String str$$e2 = $$e(b4, b5, (byte) (b5 - 3));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i10] = Object.class;
                    objA2 = o.d.d.a(i11, cLastIndexOf, scrollDefaultDelay, -694521287, false, str$$e2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                int i12 = cArr3[iVar.f19932b % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i12);
                objArr4[i10] = iVar;
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) i10;
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 458, (char) ('0' - AndroidCharacter.getMirror('0')), 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1804962841, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    objA4 = o.d.d.a(639 - TextUtils.getOffsetBefore("", 0), (char) (TextUtils.getOffsetAfter("", 0) + 65100), 12 - TextUtils.indexOf("", ""), 1636969060, false, $$e(b8, (byte) ((b8 + 57) - (57 & b8)), b8), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f23061f ^ 740602047300126166L)) ^ ((long) ((int) (((long) f23062g) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f23064i) ^ 740602047300126166L))));
                iVar.f19932b++;
                i10 = 0;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f5  */
    @Override // o.di.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.di.b a(android.content.Context r22, o.ef.a r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.di.g.a(android.content.Context, o.ef.a):o.di.b");
    }
}
