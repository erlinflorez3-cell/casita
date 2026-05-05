package o.ap;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import cz.msebera.android.httpclient.HttpStatus;
import java.lang.reflect.Method;
import o.a.i;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements b<d, C0331c> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f20443a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f20444b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f20445c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f20446e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f20447f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f20448g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f20449h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f20450j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f20451d;

    /* JADX INFO: renamed from: o.ap.c$c, reason: collision with other inner class name */
    public static final class C0331c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f20452b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f20453e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20454a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f20455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f20456d;

        public C0331c(String str, String str2, String str3) {
            this.f20454a = str;
            this.f20456d = str2;
            this.f20455c = str3;
        }

        public final String b() {
            int i2 = 2 % 2;
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = 106449033 ^ iIdentityHashCode;
            int i4 = (106449033 + iIdentityHashCode) - (106449033 | iIdentityHashCode);
            int i5 = ~((i3 + i4) - (i3 & i4));
            int i6 = (~iIdentityHashCode) | (-898920582);
            int i7 = (-1384468329) - (~(-(-((i5 | (~((i6 & (-106449034)) | (i6 ^ (-106449034))))) * (-406)))));
            int i8 = ~iIdentityHashCode;
            int i9 = ((-1) - (((-1) - 106449033) | ((-1) - i8))) | (106449033 ^ i8);
            int i10 = i9 ^ (-898920582);
            int i11 = (i9 - 898920582) - (i9 | (-898920582));
            int i12 = -(-((~((i11 + i10) - (i11 & i10))) * (-406)));
            int i13 = ~((-1) - (((-1) - iIdentityHashCode) & ((-1) - 898920581)));
            int i14 = i8 ^ (-106449034);
            int i15 = i8 & (-106449034);
            int i16 = ~((i14 + i15) - (i14 & i15));
            int i17 = (((i7 ^ i12) + (((-1) - (((-1) - i12) | ((-1) - i7))) << 1)) - (~((((i13 + i16) - (i13 | i16)) | (i13 ^ i16)) * HttpStatus.SC_NOT_ACCEPTABLE))) - 1;
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = ~iIdentityHashCode2;
            int i19 = ((-1) - (((-1) - ((i18 - 118784774) - (i18 | (-118784774)))) & ((-1) - ((-118784774) ^ i18)))) * 184;
            int i20 = (((-1) - (((-1) - (-315232689)) & ((-1) - i19))) << 1) - (i19 ^ (-315232689));
            int i21 = ~iIdentityHashCode2;
            int i22 = ~((-1) - (((-1) - (i21 & 415264946)) & ((-1) - (i21 ^ 415264946))));
            int i23 = 142622880 ^ i22;
            int i24 = (i22 + 142622880) - (i22 | 142622880);
            int i25 = (i24 + i23) - (i24 & i23);
            Object obj = null;
            if (i17 > (i20 - (~(-(-(((-1) - (((-1) - ((-1) - (((-1) - i25) | ((-1) - (-534049720))))) & ((-1) - (i25 ^ (-534049720))))) * 184))))) - 1) {
                throw null;
            }
            String str = this.f20456d;
            int i26 = f20452b;
            int i27 = ((i26 + 83) - (83 | i26)) + ((-1) - (((-1) - i26) & ((-1) - 83)));
            f20453e = i27 % 128;
            if (i27 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final String d() {
            int i2 = 2 % 2;
            int i3 = f20453e + 111;
            int i4 = i3 % 128;
            f20452b = i4;
            int i5 = i3 % 2;
            String str = this.f20454a;
            int i6 = i4 + 97;
            f20453e = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 18 / 0;
            }
            return str;
        }

        public final String e() {
            int i2 = 2 % 2;
            int i3 = f20453e;
            int i4 = i3 + 101;
            f20452b = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            String str = this.f20455c;
            int i5 = i3 + 53;
            f20452b = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f20457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f20458c;

        public d(String str, String str2) {
            this.f20457b = str;
            this.f20458c = str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, short r9, short r10) {
        /*
            byte[] r7 = o.ap.c.$$a
            int r0 = r9 + 4
            int r6 = r10 * 4
            int r1 = r6 + 1
            int r5 = 122 - r8
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r7 != 0) goto L26
            r2 = r0
            r5 = r6
            r1 = r3
        L12:
            int r5 = r5 + r0
            r0 = r2
        L14:
            int r2 = r0 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r6) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L21:
            int r1 = r1 + 1
            r0 = r7[r2]
            goto L12
        L26:
            r1 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ap.c.$$c(short, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20450j = 0;
        f20447f = 1;
        f20448g = 0;
        f20449h = 1;
        b();
        Color.alpha(0);
        int i2 = f20447f + 1;
        f20450j = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public c(d dVar) {
        this.f20451d = dVar;
    }

    static void b() {
        f20443a = 2145052573841130832L;
        f20446e = 740602047300126166L;
        f20445c = 1564493270;
        f20444b = (char) 1465;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.ap.c.C0331c c(o.ef.a r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ap.c.c(o.ef.a):o.ap.c$c");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ap.c.i(java.lang.String, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{78, MessagePack.Code.UINT16, MessagePack.Code.FALSE, 123};
        $$b = 193;
    }

    private static void k(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            int i4 = $11 + 49;
            $10 = i4 % 128;
            int i5 = i4 % 2;
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
            int i7 = $10 + 39;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 51 / 0;
                charArray3 = str4.toCharArray();
            } else {
                charArray3 = str4.toCharArray();
            }
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
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 107;
                    char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int offsetBefore = TextUtils.getOffsetBefore("", i6) + 11;
                    byte b2 = (byte) (-1);
                    String str$$c = $$c((byte) 57, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i6] = Object.class;
                    objA = o.d.d.a(modifierMetaStateMask, packedPositionChild, offsetBefore, -155898465, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    int packedPositionGroup = 847 - ExpandableListView.getPackedPositionGroup(0L);
                    char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6487);
                    int windowTouchSlop = 12 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b3 = (byte) (-1);
                    String str$$c2 = $$c((byte) 54, b3, (byte) (b3 + 1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i6] = Object.class;
                    objA2 = o.d.d.a(packedPositionGroup, c3, windowTouchSlop, -694521287, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                int i9 = cArr3[iVar.f19932b % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[i6] = iVar;
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) (-1);
                    objA3 = o.d.d.a(458 - TextUtils.indexOf("", "", i6), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 11 - TextUtils.indexOf("", ""), 1804962841, false, $$c((byte) 56, b4, (byte) (b4 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objA4 = o.d.d.a(639 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.getCapsMode("", 0, 0) + 65100), MotionEvent.axisFromString("") + 13, 1636969060, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f20446e ^ 740602047300126166L)) ^ ((long) ((int) (((long) f20445c) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f20444b) ^ 740602047300126166L))));
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
        objArr[0] = new String(cArr5);
    }

    @Override // o.ap.b
    public final /* synthetic */ C0331c a(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20449h + 53;
        f20448g = i3 % 128;
        int i4 = i3 % 2;
        C0331c c0331cC = c(aVar);
        if (i4 != 0) {
            int i5 = 15 / 0;
        }
        int i6 = f20449h + 95;
        f20448g = i6 % 128;
        int i7 = i6 % 2;
        return c0331cC;
    }

    @Override // o.ap.b
    public final void e(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20448g + 63;
        f20449h = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            i("衚ꗡ퍊¥㸆汫駃뜷\ue492ዎ䁒緋ꬦ\ud888\uf6db⑉冾輇뵰\ueacbᠯ㖑挓", 11676 - Process.getGidForName(""), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            i("衾퐔ゥ鴀阮䙅ꋰཱི欔람ᐍ炻\udd5f㧝", 23662 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f20448g + 89;
            f20449h = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 2;
            }
        }
        Object[] objArr3 = new Object[1];
        i("表ࣳ襩\u09d4詎પ謅\u0bbd谇ಏ", 32909 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        k((char) (28778 - (Process.myPid() >> 22)), "뻛ꉼ惍퀀", "\u0000\u0000\u0000\u0000", "\u0c4e렢檛並", TextUtils.getOffsetBefore("", 0), objArr4);
        aVar.a(strIntern2, (Object) ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        i("衺ϭ齒⫁꘏ㆥ촒墍퓹恔\ufbd0睕ʦ鸧⦂ꔔㅠ쳌塤편", TextUtils.indexOf("", "") + 35729, objArr5);
        aVar.a(((String) objArr5[0]).intern(), (Object) this.f20451d.f20457b);
        if (this.f20451d.f20458c != null) {
            Object[] objArr6 = new Object[1];
            i("衺▿폶脻㽁\uecb5髹䠿\ue675鎪䇔，굒", View.getDefaultSize(0, 0) + 44483, objArr6);
            aVar.a(((String) objArr6[0]).intern(), (Object) this.f20451d.f20458c);
        }
    }
}
