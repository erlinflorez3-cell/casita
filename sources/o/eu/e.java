package o.eu;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import o.a.h;
import o.a.l;
import o.ea.f;
import o.ff.e;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e<T extends o.ff.e> extends d<T> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f */
    private static int[] f25479f = null;

    /* JADX INFO: renamed from: g */
    private static int f25480g = 0;

    /* JADX INFO: renamed from: h */
    private static char[] f25481h = null;

    /* JADX INFO: renamed from: j */
    private static char f25482j = 0;

    /* JADX INFO: renamed from: k */
    private static int f25483k = 0;

    /* JADX INFO: renamed from: m */
    private static int f25484m = 0;

    /* JADX INFO: renamed from: o */
    private static int f25485o = 0;

    private static String $$j(short s2, int i2, int i3) {
        byte[] bArr = $$d;
        int i4 = 121 - s2;
        int i5 = i3 * 4;
        int i6 = (i2 * 4) + 4;
        byte[] bArr2 = new byte[i5 + 1];
        int i7 = -1;
        if (bArr == null) {
            i6++;
            i4 = i6 + (-i5);
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = bArr[i6];
            i6++;
            i4 += -i8;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25484m = 0;
        f25483k = 1;
        f25480g = 0;
        f25485o = 1;
        p();
        TextUtils.lastIndexOf("", '0');
        int i2 = f25484m + 3;
        f25483k = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public e(String str, String str2, boolean z2) {
        super(str, str2, z2);
    }

    private boolean d(T t2) {
        int i2 = 2 % 2;
        if (g() == null) {
            c(new ArrayList());
        }
        ListIterator<T> listIterator = g().listIterator();
        while (listIterator.hasNext()) {
            T next = listIterator.next();
            if (next.i() == t2.i()) {
                if (next.b() == o.ff.b.f25845c) {
                    int i3 = f25480g + 47;
                    f25485o = i3 % 128;
                    if (i3 % 2 == 0) {
                        listIterator.set(t2);
                        throw null;
                    }
                    listIterator.set(t2);
                }
                int i4 = f25480g + 39;
                f25485o = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        g().add(t2);
        return true;
    }

    static void init$0() {
        $$d = new byte[]{Ascii.EM, -93, 95, -122};
        $$e = 149;
    }

    static void p() {
        f25479f = new int[]{-848760301, 1925781038, -2143115404, 800421130, -1890266840, 1995229980, -292973734, -1826126158, 1591204296, 777839426, -300393902, -591810111, -1043273534, 2056823495, -1318388781, 430706681, 241806720, -893938523};
        f25481h = new char[]{51646, 64605, 64587, 64604, 64585, 64593, 64578, 64629, 64630, 64620, 64592, 64525, 64517, 64589, 64597, 64590, 64619, 64595, 64579, 64598, 64599, 64520, 64576, 64543, 64582, 64624, 64588, 64611, 64622, 64577, 64625, 64583, 64584, 64580, 64586, 64524};
        f25482j = (char) 51641;
    }

    private static void w(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f25479f;
        int i4 = 989264422;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(675 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 12 - View.MeasureSpec.makeMeasureSpec(0, 0), -328001469, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $10 + 13;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 989264422;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f25479f;
        if (iArr5 != null) {
            int i9 = $10 + 9;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i11])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) i5;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16), 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -328001469, false, $$j(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i11++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        lVar.f19941d = i5;
        while (lVar.f19941d < iArr.length) {
            cArr[i5] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i12 = $10 + 3;
            $11 = i12 % 128;
            int i13 = 2;
            int i14 = i12 % 2;
            int i15 = 0;
            while (i15 < 16) {
                int i16 = $10 + 11;
                $11 = i16 % 128;
                int i17 = i16 % i13;
                lVar.f19942e ^= iArr4[i15];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 2;
                    byte b7 = (byte) (b6 - 2);
                    objA3 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 301, (char) (52697 - KeyEvent.normalizeMetaState(0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, -1416256172, false, $$j(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i15++;
                int i18 = $10 + 35;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                i13 = 2;
            }
            int i20 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i20;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i21 = lVar.f19942e;
            int i22 = lVar.f19940a;
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
                int i23 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 228;
                char maximumDrawingCacheSize = (char) (51004 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int threadPriority = 9 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte length4 = (byte) $$d.length;
                byte b8 = (byte) (length4 - 4);
                objA4 = o.d.d.a(i23, maximumDrawingCacheSize, threadPriority, -330018025, false, $$j(length4, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void x(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i5 = $10 + 47;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f25481h;
        int i7 = 19;
        int i8 = 421932776;
        float f2 = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = o.d.d.a(i8);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        objA = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 270, (char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > f2 ? 1 : (ViewConfiguration.getScrollFriction() == f2 ? 0 : -1)) + 10, -811348851, false, $$j((byte) i7, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i7 = 19;
                    i8 = 421932776;
                    f2 = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f25482j)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = 11;
        if (objA2 == null) {
            byte b4 = (byte) 0;
            objA2 = o.d.d.a(318 - AndroidCharacter.getMirror('0'), (char) View.MeasureSpec.getSize(0), Color.green(0) + 11, -811348851, false, $$j((byte) 19, b4, b4), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i10 = $11 + 85;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                hVar.f19926b = 1;
            } else {
                hVar.f19926b = 0;
            }
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    int i11 = $11 + 91;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        objA3 = o.d.d.a(825 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 10 - Process.getGidForName(""), -611683395, false, $$j((byte) 10, b5, b5), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            c2 = 11;
                            byte b6 = (byte) 0;
                            objA4 = o.d.d.a(218 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - (ViewConfiguration.getEdgeSlop() >> 16), 212688716, false, $$j((byte) 12, b6, b6), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = 11;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i13];
                    } else {
                        c2 = 11;
                        if (hVar.f19928d == hVar.f19929e) {
                            int i14 = $11 + 75;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i16 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i17 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i16];
                            cArr4[hVar.f19926b + 1] = cArr2[i17];
                        } else {
                            int i18 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i19 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i18];
                            cArr4[hVar.f19926b + 1] = cArr2[i19];
                        }
                    }
                }
                hVar.f19926b += 2;
            }
        }
        for (int i20 = 0; i20 < i2; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // o.eu.d
    public final /* synthetic */ boolean a(Context context, o.ff.a aVar) {
        int i2 = 2 % 2;
        int i3 = f25485o + 3;
        f25480g = i3 % 128;
        o.ff.e eVar = (o.ff.e) aVar;
        if (i3 % 2 != 0) {
            d(eVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zD = d(eVar);
        int i4 = f25485o + 25;
        f25480g = i4 % 128;
        int i5 = i4 % 2;
        return zD;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    @Override // o.eu.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.ef.a b(o.ek.e r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eu.e.b(o.ek.e):o.ef.a");
    }

    @Override // o.eu.d
    public final void b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25485o + 85;
        f25480g = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f25480g + 53;
            f25485o = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            w(new int[]{220552986, 1569093730, 1424950999, 205330411, -326789558, -896001781, 1954537388, 645982780, 922569377, 603777166}, View.resolveSizeAndState(0, 0, 0) + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            w(new int[]{1223595827, -943322480, -1032797258, -558698622, 1541925328, 1526494156, -637047438, -1941642425, -959746376, 146162729, -602465210, -521214733, -1310291197, -1865263001, 772496790, -1642166224, -1936216599, -279898107}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 36, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        c((List) null);
    }

    @Override // o.eu.d
    public final o.ff.e m() throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        w(new int[]{220552986, 1569093730, 1424950999, 205330411, -326789558, -896001781, 1954537388, 645982780, 922569377, 603777166}, AndroidCharacter.getMirror('0') - 29, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (g() != null) {
            int i3 = f25485o + 11;
            f25480g = i3 % 128;
            int i4 = i3 % 2;
            if (!g().isEmpty()) {
                if (i() == null) {
                    int i5 = f25480g + 61;
                    f25485o = i5 % 128;
                    int i6 = i5 % 2;
                    if (f.a()) {
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr2 = new Object[1];
                        x(TextUtils.indexOf((CharSequence) "", '0') + 52, "\n\u0012\u0004\u0011\u0013\u0004\u0002\u000b \b\n\u0000\u0013\u001c\u0014\u0017\"\u001c\u0000!\u001f\u001c\u0014\u0017\u001c!\u0013\b\u0003\t\"\u0014\u0003\u0000\u000f\u0012\u000f\u001e㙚㙚\u0002\u001c\u001b\u001e\u0002\u001d \u0004\u0011\u0012㘪", (byte) (TextUtils.getCapsMode("", 0, 0) + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), objArr2);
                        StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(c());
                        Object[] objArr3 = new Object[1];
                        x((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, "\r\u000e\u001f\u0015\u000e\u0000\u001e\u0010\u0010\u0015\u0000\u000f\u000f \u0015 \"\u0014\u0004\u0017\u0015\u0014\r\u0012\u0017\u0004", (byte) (View.resolveSize(0, 0) + 115), objArr3);
                        f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
                    }
                    return null;
                }
                Date dateD = i().d();
                if (dateD != null && dateD.before(new Date(new Date().getTime() - 120000))) {
                    if (f.a()) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr4 = new Object[1];
                        x(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 52, "\n\u0012\u0004\u0011\u0013\u0004\u0002\u000b \b\n\u0000\u0013\u001c\u0014\u0017\"\u001c\u0000!\u001f\u001c\u0014\u0017\u001c!\u0013\b\u0003\t\"\u0014\u0003\u0000\u000f\u0012\u000f\u001e㙚㙚\u0002\u001c\u001b\u001e\u0002\u001d \u0004\u0011\u0012㘪", (byte) (((Process.getThreadPriority(0) + 20) >> 6) + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), objArr4);
                        StringBuilder sbAppend2 = sb2.append(((String) objArr4[0]).intern()).append(c());
                        Object[] objArr5 = new Object[1];
                        x(TextUtils.indexOf((CharSequence) "", '0') + 24, "\r\u000e\u001f\u0015\u000f\u001e\u0000\u000e\u0013\u0004\u0014 \u0015\u0017\u0018\u0011\u0010\u0015\u0000\u000f\u0014\u0017㙃", (byte) ((Process.myPid() >> 22) + 85), objArr5);
                        f.c(strIntern, sbAppend2.append(((String) objArr5[0]).intern()).toString());
                    }
                    return null;
                }
                for (T t2 : g()) {
                    if (t2.c()) {
                        if (f.a()) {
                            StringBuilder sb3 = new StringBuilder();
                            Object[] objArr6 = new Object[1];
                            x((ViewConfiguration.getEdgeSlop() >> 16) + 43, "\n\u0012\u0004\u0011\u0013\u0004\u0004\u001d\u0015\u0004\u0012\u001f\u001f\u001c\u0014\u0017\u001c!\u0013\b\u0003\t\"\u0014\u0003\u0000\u000f\u0012\u000f\u001e㗻㗻\u0002\u001c\u001b\u001e\u0002\u001d \u0004\u0011\u0012㗋", (byte) (16 - TextUtils.lastIndexOf("", '0')), objArr6);
                            StringBuilder sbAppend3 = sb3.append(((String) objArr6[0]).intern()).append(c());
                            Object[] objArr7 = new Object[1];
                            x(ExpandableListView.getPackedPositionType(0L) + 33, "\r\u000e\u001f\u0015\r\u0010\u0015\u0004\u0007\u0017\u001e\u0011#\u000f \u001b\u0003\"\"\u0001\u0012\u0010\u0016\u001e\u0012\u000e\u000f \u0002!\u0014\u0004㗰", (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1), objArr7);
                            f.c(strIntern, sbAppend3.append(((String) objArr7[0]).intern()).toString());
                        }
                        return t2;
                    }
                }
                if (f.a()) {
                    StringBuilder sb4 = new StringBuilder();
                    Object[] objArr8 = new Object[1];
                    x((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43, "\n\u0012\u0004\u0011\u0013\u0004\u0004\u001d\u0015\u0004\u0012\u001f\u001f\u001c\u0014\u0017\u001c!\u0013\b\u0003\t\"\u0014\u0003\u0000\u000f\u0012\u000f\u001e㗻㗻\u0002\u001c\u001b\u001e\u0002\u001d \u0004\u0011\u0012㗋", (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16), objArr8);
                    StringBuilder sbAppend4 = sb4.append(((String) objArr8[0]).intern()).append(c());
                    Object[] objArr9 = new Object[1];
                    x(34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\r\u000e\u001f\u0015\u000e\u0000\u001e\u0010\u0010\u0015\u0000\u000f#\u000f \u001b\u0003\"\"\u0001\u0012\u0010\u0016\u001e\u0012\u000e\u000f \u0002!\u0014\u0004㘜", (byte) (46 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr9);
                    f.c(strIntern, sbAppend4.append(((String) objArr9[0]).intern()).toString());
                }
                return null;
            }
        }
        if (f.a()) {
            StringBuilder sb5 = new StringBuilder();
            Object[] objArr10 = new Object[1];
            x(51 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\n\u0012\u0004\u0011\u0013\u0004\u0002\u000b \b\n\u0000\u0013\u001c\u0014\u0017\"\u001c\u0000!\u001f\u001c\u0014\u0017\u001c!\u0013\b\u0003\t\"\u0014\u0003\u0000\u000f\u0012\u000f\u001e㙚㙚\u0002\u001c\u001b\u001e\u0002\u001d \u0004\u0011\u0012㘪", (byte) (112 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr10);
            StringBuilder sbAppend5 = sb5.append(((String) objArr10[0]).intern()).append(c());
            Object[] objArr11 = new Object[1];
            x('B' - AndroidCharacter.getMirror('0'), "\r\u000e\u001f\u0015\u000e\u0000\u001e\u0010\u0013\u0015\u0017\u0014\u000e\r\u0010\u0015\u0001\u0015", (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33), objArr11);
            f.c(strIntern, sbAppend5.append(((String) objArr11[0]).intern()).toString());
        }
        return null;
    }
}
