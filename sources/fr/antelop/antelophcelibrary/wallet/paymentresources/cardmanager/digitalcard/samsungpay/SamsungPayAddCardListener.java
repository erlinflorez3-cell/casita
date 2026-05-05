package fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.samsung.android.sdk.samsungpay.v2.card.AddCardListener;
import com.samsung.android.sdk.samsungpay.v2.card.Card;
import java.lang.reflect.Method;
import o.a.g;
import o.a.o;
import o.ea.f;
import o.es.c;

/* JADX INFO: loaded from: classes5.dex */
public class SamsungPayAddCardListener implements AddCardListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f18543b = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f18544f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f18545g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f18546h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f18547i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f18548j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f18549k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f18550l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f18551n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f18552o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f18553a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f18555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c.InterfaceC0350c f18556e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, byte r10) {
        /*
            int r7 = r9 * 4
            int r1 = r7 + 1
            byte[] r6 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayAddCardListener.$$a
            int r0 = r8 * 3
            int r5 = 4 - r0
            int r4 = 105 - r10
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r6 != 0) goto L26
            r0 = r7
            r1 = r2
        L13:
            int r4 = r4 + r0
            int r5 = r5 + 1
        L16:
            byte r0 = (byte) r4
            r3[r1] = r0
            if (r1 != r7) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L21:
            int r1 = r1 + 1
            r0 = r6[r5]
            goto L13
        L26:
            r1 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayAddCardListener.$$c(byte, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18550l = 0;
        f18551n = 1;
        f18552o = 0;
        f18549k = 1;
        a();
        TextUtils.getOffsetBefore("", 0);
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getScrollBarSize();
        int i2 = f18550l + 33;
        f18551n = i2 % 128;
        int i3 = i2 % 2;
    }

    protected SamsungPayAddCardListener(Context context, b bVar, String str, c.InterfaceC0350c interfaceC0350c) {
        this.f18555d = context;
        this.f18553a = bVar;
        this.f18554c = str;
        this.f18556e = interfaceC0350c;
    }

    static void a() {
        f18543b = new char[]{53274, 24019, 52178, 31179, 59344, 5568, 33740, 12740, 49136, 11747, 23494, 51684, 30697, 58805, 5010, 33166, 3997, 48558, 11142, 22939, 51105, 30139, 58293, 4513, 40883, 49344, 19767, 56185, 27004, 63346, 1391, 37678, 8459, 44820, 38018, 6524, 36727, 15723, 41821, 20852, 51042, 30027, 64258, 26888, 7964, 36118, 13078, 41260, 22316, 50467, 19201, 63800, 28454, 7479, 33614, 12554, 42766, 21817, 56091, 18712, 65504, 29600, 65118, 26709, 55881, 17535, 46678, 8256, 37481, 7200, 36394, 63550, 27188, 54324, 17934, 45070, 8705, 44067, 7706, 34820, 64021, 25708, 54824, 16428, 45595, 15417, 44602, 6338, 35465, 62601, 26271, 53487, 17094, 52437, 16121, 43174, 6882, 34045, 63225, 24817, 53896, 23684, 52879, 14491, 43677, 5332, 34474, 61624, 25271, 60591, 24233, 38018, 6524, 36727, 15723, 41821, 20852, 51042, 30027, 64258, 26888, 7964, 36118, 13078, 41260, 22316, 50467, 19201, 63800, 28454, 7479, 33614, 12554, 42766, 21817, 56091, 18712, 65504, 28075, 5035, 33213, 14333, 42469, 11232, 55750, 20438, 64899, 25476, 4501, 38039, 6523, 36726, 15724, 41836, 20807, 51061, 30030, 64345, 26958, 8018, 6064, 39502, 3141, 48729, 8303, 53830, 17488, 63097, 30768, 59962, 39982, 3620, 45092, 8720, 54292, 17957, 51202, 31236, 60417, 40467, '9', 45604, 9249, 54893, 22571, 51746, 31954, 61141, 37078, 718, 46281, 9934, 43136, 23282, 52453, 32433, 57583, 37606, 1262, 46737, 14493, 43671, 23758, 52947, 28868};
        f18547i = -6395518922064062199L;
        f18545g = (char) 57429;
        f18546h = (char) 598;
        f18548j = (char) 7791;
        f18544f = (char) 23535;
    }

    static void init$0() {
        $$a = new byte[]{106, 120, -13, -92};
        $$b = 51;
    }

    private static void m(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f18543b[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(Drawable.resolveOpacity(0, 0) + 742, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 11 - Process.getGidForName(""), 632508977, false, $$c(b2, b3, (byte) (6 | b3)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f18547i), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(765 - Process.getGidForName(""), (char) (12471 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 12, 1946853218, false, $$c(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a((Process.myPid() >> 22) + 387, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, 39570797, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i6 = $11 + 105;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 5;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(386 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16), 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 39570797, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i8 = $10 + 45;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void p(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        char c2 = 2;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $10 + 85;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = str2.toCharArray();
            int i6 = $11 + 33;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = 58224;
            int i9 = 0;
            while (i9 < 16) {
                char c3 = cArr3[1];
                char c4 = cArr3[0];
                int i10 = (c4 + i8) ^ ((c4 << 4) + ((char) (((long) f18548j) ^ (-7511683281764982996L))));
                int i11 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f18544f);
                    objArr2[c2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 270, (char) KeyEvent.normalizeMetaState(0), 11 - TextUtils.indexOf("", "", 0, 0), -1995022631, false, $$c(b2, b3, (byte) (36 | b3)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f18545g) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f18546h)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(270 - TextUtils.getCapsMode("", 0, 0), (char) Gravity.getAbsoluteGravity(0, 0), 11 - TextUtils.indexOf("", "", 0), -1995022631, false, $$c(b4, b5, (byte) ((b5 + 36) - (36 & b5))), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    c2 = 2;
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
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                c2 = 2;
                objA3 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 271, (char) (Process.getGidForName("") + 1), 11 - (ViewConfiguration.getScrollBarSize() >> 8), -2074123590, false, $$c(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 33)))), new Class[]{Object.class, Object.class});
            } else {
                c2 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0045 A[PHI: r3
  0x0045: PHI (r3v7 java.lang.String) = (r3v1 java.lang.String), (r3v10 java.lang.String) binds: [B:12:0x00c5, B:5:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFail(int r20, android.os.Bundle r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.SamsungPayAddCardListener.onFail(int, android.os.Bundle):void");
    }

    public void onProgress(int i2, int i3, Bundle bundle) throws Throwable {
        int i4 = 2 % 2;
        int i5 = f18552o + 79;
        f18549k = i5 % 128;
        if (i5 % 2 == 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            m((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 17596), ((byte) KeyEvent.getModifierMetaStateMask()) + 1, 25 - TextUtils.indexOf("", ""), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            m((char) (33585 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 160, (KeyEvent.getMaxKeyCode() >> 16) + 45, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(i2);
            Object[] objArr3 = new Object[1];
            p("汫箁韉샒", 4 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
            f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).append(i3).toString());
        }
        int i6 = f18552o + 1;
        f18549k = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onSuccess(int i2, Card card) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f18549k + 35;
        f18552o = i4 % 128;
        int i5 = i4 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            m((char) (17595 - Gravity.getAbsoluteGravity(0, 0)), ViewConfiguration.getTapTimeout() >> 16, KeyEvent.keyCodeFromString("") + 25, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            p("㤲ꍤ첯偠㊯闍꽐枦馮\uf16d뛘╡㬧쐥堎륏㊯闍꽐枦\ue269\ue079\u2001\ue532먖ᛪዺ檂뛘╡\ue269\ue079满踈鱓咰梻욕㇙存", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39, objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(i2);
            Object[] objArr3 = new Object[1];
            m((char) (21534 - Color.blue(0)), 25 - TextUtils.indexOf("", ""), 10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
            f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).append(card.toString()).toString());
            int i6 = f18549k + 37;
            f18552o = i6 % 128;
            int i7 = i6 % 2;
        }
        b bVar = this.f18553a;
        this.f18556e.c(bVar.d(this.f18555d, bVar.e(), card.getCardId(), this.f18554c, o.es.d.f25311c).c());
    }
}
