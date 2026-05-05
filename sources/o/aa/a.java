package o.aa;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.g;
import o.er.k;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f19950a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19951b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f19952c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f19953d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f19954e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19955f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f19956i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f19957j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, int r9, int r10) {
        /*
            int r0 = r8 * 3
            int r8 = 72 - r0
            byte[] r7 = o.aa.a.$$a
            int r0 = r10 + 4
            int r6 = r9 * 3
            int r1 = r6 + 1
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r7 != 0) goto L2a
            r8 = r6
            r1 = r0
            r3 = r4
        L14:
            int r0 = -r0
            int r8 = r8 + r0
            r0 = r1
            r2 = r3
        L18:
            byte r1 = (byte) r8
            r5[r2] = r1
            int r3 = r2 + 1
            if (r2 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            int r1 = r0 + 1
            r0 = r7[r1]
            goto L14
        L2a:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aa.a.$$c(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f19957j = 0;
        f19956i = 1;
        f19951b = 0;
        f19955f = 1;
        b();
        ExpandableListView.getPackedPositionType(0L);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TypedValue.complexToFloat(0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        Color.argb(0, 0, 0, 0);
        ExpandableListView.getPackedPositionForGroup(0);
        View.getDefaultSize(0, 0);
        int i2 = f19956i + 41;
        f19957j = i2 % 128;
        int i3 = i2 % 2;
    }

    a() {
    }

    static k b(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        g("࿆븊ቦ稌軖牓ᦁ\ue811ꞵ䜤", 9 - TextUtils.indexOf("", "", 0), objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i3 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i3;
        String str = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i3, Thread.currentThread().getPriority());
        Object[] objArr3 = new Object[1];
        g("骣ऄ㸧ꀚ፠쓱릱湺", 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
        Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
        int i4 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i4;
        String str2 = (String) o.ef.a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i4, Thread.currentThread().getPriority());
        Object[] objArr5 = new Object[1];
        g("ⵣ떋\u0e5c䨓퇋禷", 6 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr5);
        Object[] objArr6 = {aVar, ((String) objArr5[0]).intern()};
        int i5 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i5;
        String str3 = (String) o.ef.a.a(-781664457, objArr6, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
        Object[] objArr7 = new Object[1];
        g("툥猼\uec53潸壓坺\ue33a⯑뱐㭨힠霉㽋⭹ﻯ⚷碐⿏ോ걄蘒굪ꞵ䜤", 23 - ExpandableListView.getPackedPositionType(0L), objArr7);
        Object[] objArr8 = {aVar, ((String) objArr7[0]).intern()};
        int i6 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i6;
        String str4 = (String) o.ef.a.a(-781664457, objArr8, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i6, Thread.currentThread().getPriority());
        Object[] objArr9 = new Object[1];
        g("툥猼\uec53潸壓坺\ue33a⯑뱐㭨힠霉됣쬶\uf778铟䷲ǫ올뻔푮䉦漀\uf6e3", Color.rgb(0, 0, 0) + 16777239, objArr9);
        Object[] objArr10 = {aVar, ((String) objArr9[0]).intern()};
        int i7 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i7;
        String str5 = (String) o.ef.a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority());
        Object[] objArr11 = new Object[1];
        g("骣ऄ汭⏰鬊댆墇ຄ㽋⭹굻뷋", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, objArr11);
        Object[] objArr12 = {aVar, ((String) objArr11[0]).intern()};
        int i8 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i8;
        String str6 = (String) o.ef.a.a(-781664457, objArr12, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i8, Thread.currentThread().getPriority());
        Object[] objArr13 = new Object[1];
        g("ꈇ웍ﻯ⚷碐⿏ോ걄蘒굪ꞵ䜤", 11 - TextUtils.getTrimmedLength(""), objArr13);
        Object[] objArr14 = {aVar, ((String) objArr13[0]).intern()};
        int i9 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i9;
        k kVar = new k(str, str2, str3, str4, str5, str6, (String) o.ef.a.a(-781664457, objArr14, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i9, Thread.currentThread().getPriority()));
        int i10 = f19955f + 95;
        f19951b = i10 % 128;
        if (i10 % 2 == 0) {
            return kVar;
        }
        throw null;
    }

    static void b() {
        f19953d = (char) 22968;
        f19954e = (char) 38529;
        f19952c = (char) 53642;
        f19950a = (char) 64651;
    }

    static o.ef.a c(k kVar) throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        Object[] objArr = new Object[1];
        g("࿆븊ቦ稌軖牓ᦁ\ue811ꞵ䜤", 10 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int iNextInt = new Random().nextInt();
        int iMyPid = Process.myPid();
        k.f25018b = k.f25018b * (-91568461);
        k.f25017a = (-1816306970) * k.f25017a;
        aVar.a(strIntern, k.c(iMyPid, 2051927583, r12, iNextInt, new Object[]{kVar}, r15, -2051927583));
        Object[] objArr2 = new Object[1];
        g("骣ऄ㸧ꀚ፠쓱릱湺", 7 - ImageFormat.getBitsPerPixel(0), objArr2);
        aVar.a(((String) objArr2[0]).intern(), (Object) kVar.b());
        Object[] objArr3 = new Object[1];
        g("ⵣ떋\u0e5c䨓퇋禷", 5 - TextUtils.getOffsetAfter("", 0), objArr3);
        aVar.a(((String) objArr3[0]).intern(), (Object) kVar.d());
        Object[] objArr4 = new Object[1];
        g("툥猼\uec53潸壓坺\ue33a⯑뱐㭨힠霉㽋⭹ﻯ⚷碐⿏ോ걄蘒굪ꞵ䜤", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22, objArr4);
        aVar.a(((String) objArr4[0]).intern(), (Object) kVar.e());
        Object[] objArr5 = new Object[1];
        g("툥猼\uec53潸壓坺\ue33a⯑뱐㭨힠霉됣쬶\uf778铟䷲ǫ올뻔푮䉦漀\uf6e3", View.combineMeasuredStates(0, 0) + 23, objArr5);
        String strIntern2 = ((String) objArr5[0]).intern();
        k.f25019c = k.f25019c * (-1583409397);
        int iMyTid = Process.myTid();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        k.f25022g = k.f25022g * (-1155363413);
        aVar.a(strIntern2, k.c(iMyTid, 357010820, r12, r13, new Object[]{kVar}, iMaxMemory, -357010818));
        Object[] objArr6 = new Object[1];
        g("骣ऄ汭⏰鬊댆墇ຄ㽋⭹굻뷋", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12, objArr6);
        String strIntern3 = ((String) objArr6[0]).intern();
        int priority = Thread.currentThread().getPriority();
        int i3 = (int) Runtime.getRuntime().totalMemory();
        k.f25021e = k.f25021e * (-460678624);
        k.f25020d = k.f25020d * 1879643041;
        aVar.a(strIntern3, k.c(i3, -377784092, r12, priority, new Object[]{kVar}, r15, 377784093));
        Object[] objArr7 = new Object[1];
        g("ꈇ웍ﻯ⚷碐⿏ോ걄蘒굪ꞵ䜤", ExpandableListView.getPackedPositionGroup(0L) + 11, objArr7);
        aVar.a(((String) objArr7[0]).intern(), (Object) kVar.g());
        int i4 = f19951b + 97;
        f19955f = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return aVar;
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = i5 + 17;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        if (str2 != null) {
            int i8 = i5 + 85;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i10 = $10 + 89;
            $11 = i10 % 128;
            int i11 = i10 % i3;
            int i12 = 58224;
            int i13 = 0;
            while (i13 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i14 = (c3 + i12) ^ ((c3 << 4) + ((char) (((long) f19952c) ^ (-7511683281764982996L))));
                int i15 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f19950a);
                    objArr2[i3] = Integer.valueOf(i15);
                    objArr2[1] = Integer.valueOf(i14);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(270 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 10 - TextUtils.lastIndexOf("", '0'), -1995022631, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i12) ^ ((cCharValue << 4) + ((char) (((long) f19953d) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f19954e)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 271, (char) ExpandableListView.getPackedPositionType(0L), TextUtils.lastIndexOf("", '0') + 12, -1995022631, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i12 -= 40503;
                    i13++;
                    i3 = 2;
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
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 270;
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                int scrollBarSize = 11 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte b6 = (byte) 0;
                byte b7 = b6;
                String str$$c = $$c(b6, b7, (byte) (b7 - 1));
                i3 = 2;
                objA3 = o.d.d.a(absoluteGravity, cLastIndexOf, scrollBarSize, -2074123590, false, str$$c, new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{54, MessagePack.Code.BIN8, MessagePack.Code.UINT64, -16};
        $$b = 32;
    }
}
