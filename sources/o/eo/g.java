package o.eo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import kotlin.io.encoding.Base64;
import o.a.k;
import o.a.l;
import o.a.m;
import o.av.a;
import o.eo.b;
import o.ep.h;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends b<h> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f24387a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f24388b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f24389c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f24390d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int[] f24391e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f24392h = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$f(byte r6, byte r7, byte r8) {
        /*
            int r0 = r8 + 107
            int r1 = r7 * 4
            int r8 = 3 - r1
            byte[] r7 = o.eo.g.$$d
            int r2 = r6 * 4
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2c
            r2 = r4
            r3 = r5
        L15:
            int r0 = -r0
            int r0 = r0 + r2
            r2 = r3
        L18:
            byte r1 = (byte) r0
            r6[r2] = r1
            int r3 = r2 + 1
            if (r2 != r4) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L25:
            int r8 = r8 + 1
            r1 = r7[r8]
            r2 = r0
            r0 = r1
            goto L15
        L2c:
            r2 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eo.g.$$f(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24388b = 0;
        f24392h = 1;
        f24389c = 0;
        f24387a = 1;
        j();
        KeyEvent.getDeadChar(0, 0);
        int i2 = f24388b + 67;
        f24392h = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static h a(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        i(new int[]{1622982872, -21839299}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1, objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i3 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i3;
        String str = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i3, Thread.currentThread().getPriority());
        Object[] objArr3 = new Object[1];
        l("坩圚埮\uf027옫팤䜻\uf25cᇘḭ", -MotionEvent.axisFromString(""), objArr3);
        h.e eVar = (h.e) aVar.e(h.e.class, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        l("発瘊吉쬡엊\ue82c赿㠚プᷛ良쎿ﮤ\uda90墨竈ꉒ", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
        Object[] objArr5 = {aVar, ((String) objArr4[0]).intern()};
        int i4 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i4;
        String str2 = (String) o.ef.a.a(-781664457, objArr5, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i4, Thread.currentThread().getPriority());
        Object[] objArr6 = new Object[1];
        l("䌺䍘\ue33c≘狤Ŕ䭭", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr6);
        Object[] objArr7 = {aVar, ((String) objArr6[0]).intern()};
        int i5 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i5;
        String str3 = (String) o.ef.a.a(-781664457, objArr7, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
        Object[] objArr8 = new Object[1];
        l("\u2e79⸕Ƹ\ud8a7遨﮶됶ő棹䡴釷\ufaefꎅ輢", 1 - ExpandableListView.getPackedPositionType(0L), objArr8);
        Object[] objArr9 = {aVar, ((String) objArr8[0]).intern()};
        int i6 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i6;
        String str4 = (String) o.ef.a.a(-781664457, objArr9, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i6, Thread.currentThread().getPriority());
        Object[] objArr10 = new Object[1];
        l("ꛥꚀ\ue69b\ue6ea睒엸뷧࢝\ue053꽞꾚\uf32b⬙栎", -MotionEvent.axisFromString(""), objArr10);
        Date dateA = aVar.a(((String) objArr10[0]).intern(), true);
        Object[] objArr11 = new Object[1];
        i(new int[]{390452699, 1299155037, 798247284, 2090350407}, Color.red(0) + 6, objArr11);
        Object[] objArr12 = {aVar, ((String) objArr11[0]).intern()};
        int i7 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i7;
        String str5 = (String) o.ef.a.a(-781664457, objArr12, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority());
        Object[] objArr13 = new Object[1];
        l("䱔䰺\udbea殅䨺䢊ぞ蔨", 1 - TextUtils.getTrimmedLength(""), objArr13);
        Object[] objArr14 = {aVar, ((String) objArr13[0]).intern()};
        int i8 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i8;
        String str6 = (String) o.ef.a.a(-781664457, objArr14, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i8, Thread.currentThread().getPriority());
        Object[] objArr15 = new Object[1];
        l("\uf7ad\uf7ce\ue410⧧痓ૠ歓\ude21넝귏悩▘穡檋멾鳟", View.resolveSizeAndState(0, 0, 0) + 1, objArr15);
        Date dateE = aVar.e(((String) objArr15[0]).intern(), true);
        Object[] objArr16 = new Object[1];
        i(new int[]{996033656, 1851578818, -821458608, -580649814, 53601537, 440695219, 835311522, -2039628649, -2060216244, -1321812296}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, objArr16);
        h hVar = new h(str, eVar, str2, str3, str4, dateA, str5, str6, dateE, aVar.g(((String) objArr16[0]).intern()));
        int i9 = f24387a + 73;
        f24389c = i9 % 128;
        int i10 = i9 % 2;
        return hVar;
    }

    private static o.ef.a c(h hVar) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        Object[] objArr = new Object[1];
        i(new int[]{1622982872, -21839299}, 2 - ExpandableListView.getPackedPositionType(0L), objArr);
        aVar.a(((String) objArr[0]).intern(), (Object) hVar.a());
        Object[] objArr2 = new Object[1];
        l("坩圚埮\uf027옫팤䜻\uf25cᇘḭ", -Process.getGidForName(""), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i3 = (-1456136215) * h.f24529j;
        h.f24529j = i3;
        int i4 = h.f24527h * 389977318;
        h.f24527h = i4;
        int i5 = h.f24528i * (-407821031);
        h.f24528i = i5;
        int i6 = h.f24526f * (-2143292461);
        h.f24526f = i6;
        aVar.a(strIntern, (Object) ((h.e) h.c(-1791483773, i3, 1791483775, i4, new Object[]{hVar}, i5, i6)).a());
        Object[] objArr3 = new Object[1];
        l("発瘊吉쬡엊\ue82c赿㠚プᷛ良쎿ﮤ\uda90墨竈ꉒ", -MotionEvent.axisFromString(""), objArr3);
        aVar.a(((String) objArr3[0]).intern(), (Object) hVar.d());
        Object[] objArr4 = new Object[1];
        l("䌺䍘\ue33c≘狤Ŕ䭭", 1 - ExpandableListView.getPackedPositionType(0L), objArr4);
        aVar.a(((String) objArr4[0]).intern(), (Object) hVar.b());
        Object[] objArr5 = new Object[1];
        l("\u2e79⸕Ƹ\ud8a7遨﮶됶ő棹䡴釷\ufaefꎅ輢", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr5);
        String strIntern2 = ((String) objArr5[0]).intern();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        h.f24523c = h.f24523c * (-1159367798);
        h.f24521a = h.f24521a * 1358326175;
        h.f24522b = h.f24522b * 1587957066;
        aVar.a(strIntern2, h.c(173556768, elapsedCpuTime, -173556768, r14, new Object[]{hVar}, r16, r17));
        Object[] objArr6 = new Object[1];
        l("ꛥꚀ\ue69b\ue6ea睒엸뷧࢝\ue053꽞꾚\uf32b⬙栎", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr6);
        aVar.c(((String) objArr6[0]).intern(), hVar.j().getTime());
        Object[] objArr7 = new Object[1];
        i(new int[]{390452699, 1299155037, 798247284, 2090350407}, 5 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr7);
        aVar.a(((String) objArr7[0]).intern(), (Object) hVar.g());
        Object[] objArr8 = new Object[1];
        l("䱔䰺\udbea殅䨺䢊ぞ蔨", 1 - Color.blue(0), objArr8);
        aVar.a(((String) objArr8[0]).intern(), (Object) hVar.h());
        if (hVar.f() != null) {
            int i7 = f24387a + 33;
            f24389c = i7 % 128;
            if (i7 % 2 != 0) {
                Object[] objArr9 = new Object[1];
                l("\uf7ad\uf7ce\ue410⧧痓ૠ歓\ude21넝귏悩▘穡檋멾鳟", 0 % (PointF.length(0.0f, 1.0f) > 1.0f ? 1 : (PointF.length(0.0f, 1.0f) == 1.0f ? 0 : -1)), objArr9);
                obj = objArr9[0];
            } else {
                Object[] objArr10 = new Object[1];
                l("\uf7ad\uf7ce\ue410⧧痓ૠ歓\ude21넝귏悩▘穡檋멾鳟", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr10);
                obj = objArr10[0];
            }
            aVar.c(((String) obj).intern(), hVar.f().getTime());
            int i8 = f24389c + 107;
            f24387a = i8 % 128;
            int i9 = i8 % 2;
        }
        Object[] objArr11 = new Object[1];
        i(new int[]{996033656, 1851578818, -821458608, -580649814, 53601537, 440695219, 835311522, -2039628649, -2060216244, -1321812296}, ExpandableListView.getPackedPositionChild(0L) + 18, objArr11);
        aVar.a(((String) objArr11[0]).intern(), (Object) hVar.i());
        return aVar;
    }

    private static void i(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f24391e;
        int i4 = 989264422;
        char c2 = '0';
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11 + 125;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objA = o.d.d.a(TextUtils.lastIndexOf("", c2, i5, i5) + 676, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -328001469, false, $$f(b2, b3, (byte) ((b3 + Ascii.SO) - (b3 & Ascii.SO))), new Class[]{Integer.TYPE});
                    }
                    iArr2[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = 989264422;
                    c2 = '0';
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f24391e;
        float f2 = 0.0f;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(676 - (ViewConfiguration.getScrollFriction() > f2 ? 1 : (ViewConfiguration.getScrollFriction() == f2 ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0') + 13, -328001469, false, $$f(b4, b5, (byte) (14 | b5)), new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i8++;
                f2 = 0.0f;
            }
            iArr5 = iArr6;
        }
        char c3 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            cArr[c3] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i9 = 0;
            for (int i10 = 16; i9 < i10; i10 = 16) {
                lVar.f19942e ^= iArr4[i9];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(301 - View.resolveSize(0, 0), (char) (52697 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1416256172, false, $$f(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 12)))), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i9++;
                int i11 = $11 + 109;
                $10 = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i13;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i14 = lVar.f19942e;
            int i15 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(TextUtils.indexOf("", "") + 229, (char) (51003 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, -330018025, false, $$f(b8, b9, (byte) ((b9 + 10) - (10 & b9))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i16 = $11 + 71;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            c3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$d = new byte[]{Base64.padSymbol, -67, -29, 104};
        $$e = 40;
    }

    static void j() {
        f24391e = new int[]{2052616410, -1998021373, 362639316, 2087976647, 1801516043, 315394080, -228660813, 2023839726, 547824711, -1175822217, 1935822688, -2105887994, 1893852389, 311794555, 1555078441, 1457474980, 1362082044, -606785864};
        f24390d = -2463135003571452981L;
    }

    private static void l(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 99;
        int i5 = i4 % 128;
        $10 = i5;
        int i6 = i4 % 2;
        Object obj = null;
        if (str2 != null) {
            int i7 = i5 + 117;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                str2.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f24390d ^ (-5882309809461882246L), (char[]) charArray, i2);
        int i8 = 4;
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - i8;
            int i9 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % i8]), Long.valueOf(kVar.f19938a), Long.valueOf(f24390d)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(229 - (Process.myTid() >> 22), (char) (51004 - KeyEvent.keyCodeFromString("")), TextUtils.indexOf((CharSequence) "", '0', 0) + 10, 1749983833, false, $$f(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(674 - TextUtils.indexOf((CharSequence) "", '0'), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 12 - Gravity.getAbsoluteGravity(0, 0), 522683165, false, $$f(b4, b5, (byte) (7 | b5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                i8 = 4;
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

    @Override // o.eo.b
    protected final /* synthetic */ h b(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24389c + 53;
        f24387a = i3 % 128;
        int i4 = i3 % 2;
        h hVarA = a(aVar);
        int i5 = f24387a + 41;
        f24389c = i5 % 128;
        int i6 = i5 % 2;
        return hVarA;
    }

    @Override // o.eo.b
    public final /* bridge */ /* synthetic */ long c() {
        int i2 = 2 % 2;
        int i3 = f24389c + 25;
        f24387a = i3 % 128;
        if (i3 % 2 != 0) {
            return super.c();
        }
        int i4 = 60 / 0;
        return super.c();
    }

    public final void c(Context context, String str, final b.d<h> dVar) throws WalletValidationException {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f24387a + 67;
            f24389c = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            l("ᷘᶎһ⬘镣ࠈ웩玎孩䵷扂蠚週訨뢆ㅛ짡\uf0f3ￄ華ں㧦㘛ꏙ籭暥赟攛딤꽯쎞⹀\uf2e9ᐋ\u1ad8힕", 1 - Color.alpha(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            i(new int[]{878172681, 786118152, 1560681445, 2119916817}, Color.argb(0, 0, 0, 0) + 7, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f24387a + 35;
            f24389c = i5 % 128;
            int i6 = i5 % 2;
        }
        if (o.en.b.c().s()) {
            new o.av.a(context, new a.c() { // from class: o.eo.g.2
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f24393a = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f24394c = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static char[] f24395d = null;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0017). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$c(short r7, short r8, int r9) {
                    /*
                        int r0 = r7 * 4
                        int r7 = r0 + 116
                        int r0 = r9 * 3
                        int r6 = 4 - r0
                        byte[] r5 = o.eo.g.AnonymousClass2.$$a
                        int r1 = r8 * 2
                        int r0 = 1 - r1
                        byte[] r4 = new byte[r0]
                        r3 = 0
                        int r2 = 0 - r1
                        if (r5 != 0) goto L2a
                        r0 = r2
                        r1 = r3
                    L17:
                        int r7 = r7 + r0
                        int r6 = r6 + 1
                    L1a:
                        byte r0 = (byte) r7
                        r4[r1] = r0
                        if (r1 != r2) goto L25
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        return r0
                    L25:
                        int r1 = r1 + 1
                        r0 = r5[r6]
                        goto L17
                    L2a:
                        r1 = r3
                        goto L1a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eo.g.AnonymousClass2.$$c(short, short, int):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f24394c = 0;
                    f24393a = 1;
                    f24395d = new char[]{56506, 56561, 56553, 56553, 56553, 56552, 56536, 56532, 56555, 56553, 56530, 56530, 56554, 56554, 56530, 56539, 56555, 56547, 56551, 56561, 56545, 56537, 56555, 56553, 56530, 56535, 56550, 56555, 56564, 56563, 56557, 56543, 56545, 56380, 56374, 56381, 56380, 56381, 56382, 56341, 56567, 56567, 56344, 56383, 56363, 56359, 56381, 56364, 56355, 56378, 56380, 56366, 56365, 56377, 56385, 56365, 56356, 56374, 56379, 56385, 56388, 56380, 56339, 56567, 56567};
                }

                private static void f(String str2, int[] iArr, boolean z2, Object[] objArr3) throws Throwable {
                    int i7;
                    String str3 = str2;
                    int i8 = 2 % 2;
                    Object obj = str3;
                    if (str3 != null) {
                        byte[] bytes = str3.getBytes("ISO-8859-1");
                        int i9 = $10 + 75;
                        $11 = i9 % 128;
                        obj = bytes;
                        if (i9 % 2 == 0) {
                            int i10 = 5 / 4;
                            obj = bytes;
                        }
                    }
                    byte[] bArr = (byte[]) obj;
                    m mVar = new m();
                    int i11 = 0;
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    int i14 = iArr[2];
                    int i15 = iArr[3];
                    char[] cArr = f24395d;
                    if (cArr != null) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        int i16 = 0;
                        while (i16 < length) {
                            try {
                                Object[] objArr4 = {Integer.valueOf(cArr[i16])};
                                Object objA = o.d.d.a(-2071388435);
                                if (objA == null) {
                                    byte b2 = (byte) i11;
                                    byte b3 = b2;
                                    objA = o.d.d.a(Process.getGidForName("") + 250, (char) View.MeasureSpec.makeMeasureSpec(i11, i11), (Process.myTid() >> 22) + 11, 1376582792, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                cArr2[i16] = ((Character) ((Method) objA).invoke(null, objArr4)).charValue();
                                i16++;
                                i11 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr = cArr2;
                    }
                    char[] cArr3 = new char[i13];
                    System.arraycopy(cArr, i12, cArr3, 0, i13);
                    if (bArr != null) {
                        char[] cArr4 = new char[i13];
                        mVar.f19943d = 0;
                        char c2 = 0;
                        while (mVar.f19943d < i13) {
                            if (bArr[mVar.f19943d] == 1) {
                                int i17 = mVar.f19943d;
                                Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                                Object objA2 = o.d.d.a(120026474);
                                if (objA2 == null) {
                                    objA2 = o.d.d.a(Color.rgb(0, 0, 0) + 16777227, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i17] = ((Character) ((Method) objA2).invoke(null, objArr5)).charValue();
                            } else {
                                int i18 = mVar.f19943d;
                                Object[] objArr6 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                                Object objA3 = o.d.d.a(1632715197);
                                if (objA3 == null) {
                                    byte b4 = (byte) 1;
                                    byte b5 = (byte) (b4 - 1);
                                    objA3 = o.d.d.a(836 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (Color.green(0) + 27279), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, -1210801192, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i18] = ((Character) ((Method) objA3).invoke(null, objArr6)).charValue();
                            }
                            c2 = cArr4[mVar.f19943d];
                            Object[] objArr7 = {mVar, mVar};
                            Object objA4 = o.d.d.a(-1041906996);
                            if (objA4 == null) {
                                objA4 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21, (char) (View.resolveSize(0, 0) + 35715), 10 - ExpandableListView.getPackedPositionChild(0L), 392175785, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA4).invoke(null, objArr7);
                        }
                        cArr3 = cArr4;
                    }
                    if (i15 > 0) {
                        char[] cArr5 = new char[i13];
                        i7 = 0;
                        System.arraycopy(cArr3, 0, cArr5, 0, i13);
                        int i19 = i13 - i15;
                        System.arraycopy(cArr5, 0, cArr3, i19, i15);
                        System.arraycopy(cArr5, i15, cArr3, 0, i19);
                    } else {
                        i7 = 0;
                    }
                    if (z2) {
                        char[] cArr6 = new char[i13];
                        while (true) {
                            mVar.f19943d = i7;
                            if (mVar.f19943d >= i13) {
                                break;
                            }
                            int i20 = $10 + 51;
                            $11 = i20 % 128;
                            int i21 = i20 % 2;
                            cArr6[mVar.f19943d] = cArr3[(i13 - mVar.f19943d) - 1];
                            i7 = mVar.f19943d + 1;
                        }
                        cArr3 = cArr6;
                    }
                    if (i14 > 0) {
                        int i22 = $10 + 67;
                        $11 = i22 % 128;
                        int i23 = i22 % 2;
                        int i24 = 0;
                        while (true) {
                            mVar.f19943d = i24;
                            if (mVar.f19943d >= i13) {
                                break;
                            }
                            cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                            i24 = mVar.f19943d + 1;
                        }
                    }
                    objArr3[0] = new String(cArr3);
                }

                static void init$0() {
                    $$a = new byte[]{75, Utf8.REPLACEMENT_BYTE, 5, -84};
                    $$b = 16;
                }

                @Override // o.av.a.c
                public final void b(List<h> list) {
                    int i7 = 2 % 2;
                    g.this.d(list, Long.valueOf(new Date().getTime()));
                    dVar.c(list);
                    int i8 = f24393a + 27;
                    f24394c = i8 % 128;
                    int i9 = i8 % 2;
                }

                @Override // o.av.a.c
                public final void e(o.bg.c cVar) throws Throwable {
                    int i7 = 2 % 2;
                    int i8 = f24393a + 123;
                    f24394c = i8 % 128;
                    int i9 = i8 % 2;
                    if (o.ea.f.a()) {
                        Object[] objArr3 = new Object[1];
                        f("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{0, 32, 0, 0}, true, objArr3);
                        String strIntern2 = ((String) objArr3[0]).intern();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr4 = new Object[1];
                        f("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{32, 33, 81, 0}, false, objArr4);
                        o.ea.f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(cVar.a()).toString());
                        int i10 = f24394c + 15;
                        f24393a = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    dVar.a(o.by.c.b(cVar));
                }
            }, o.en.b.c()).b(str);
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr3 = new Object[1];
        l("欩歾⸘濊뿈䳄窙쿦ⶈ柉", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        i(new int[]{1724129215, -1957929207, 498227379, 2999411, 1274807134, -770390458, -1882874761, 1635535434, -1517898683, 39976683, -1523392844, -606183475, 1949433730, -915695610, 526018266, 305542861, -1787461343, 1357913328, -916130819, -1348765660, 2038957147, -1758874864}, ((byte) KeyEvent.getModifierMetaStateMask()) + 43, objArr4);
        throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
    }

    @Override // o.eo.b
    public final /* bridge */ /* synthetic */ List<h> d() {
        int i2 = 2 % 2;
        int i3 = f24389c + 107;
        f24387a = i3 % 128;
        int i4 = i3 % 2;
        List<h> listD = super.d();
        int i5 = f24387a + 73;
        f24389c = i5 % 128;
        int i6 = i5 % 2;
        return listD;
    }

    @Override // o.eo.b
    protected final /* synthetic */ o.ef.a e(h hVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24387a + 9;
        f24389c = i3 % 128;
        h hVar2 = hVar;
        if (i3 % 2 == 0) {
            return c(hVar2);
        }
        c(hVar2);
        throw null;
    }

    @Override // o.eo.b
    public final /* bridge */ /* synthetic */ void e() {
        int i2 = 2 % 2;
        int i3 = f24387a + 55;
        f24389c = i3 % 128;
        int i4 = i3 % 2;
        super.e();
        if (i4 != 0) {
            int i5 = 25 / 0;
        }
    }
}
