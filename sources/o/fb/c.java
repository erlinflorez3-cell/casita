package o.fb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import o.a.j;
import o.a.k;
import o.ea.f;
import o.eu.d;
import o.ff.a;
import o.fl.e;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends d<e> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static final byte[] $$l = null;
    private static final int $$m = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f */
    private static int f25746f = 0;

    /* JADX INFO: renamed from: h */
    private static int f25747h = 0;

    /* JADX INFO: renamed from: j */
    public static int f25748j = 0;

    /* JADX INFO: renamed from: k */
    private static int f25749k = 0;

    /* JADX INFO: renamed from: l */
    private static long f25750l = 0;

    /* JADX INFO: renamed from: m */
    private static short[] f25751m = null;

    /* JADX INFO: renamed from: n */
    private static byte[] f25752n = null;

    /* JADX INFO: renamed from: o */
    private static int f25753o = 0;

    /* JADX INFO: renamed from: p */
    private static int f25754p = 0;

    /* JADX INFO: renamed from: q */
    private static int f25755q = 0;

    /* JADX INFO: renamed from: t */
    private static int f25756t = 0;

    /* JADX INFO: renamed from: u */
    public static int f25757u = 0;

    /* JADX INFO: renamed from: g */
    private int f25758g;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r9, int r10, byte r11) {
        /*
            int r8 = 114 - r11
            int r0 = r9 * 4
            int r7 = r0 + 4
            byte[] r6 = o.fb.c.$$l
            int r1 = r10 * 2
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r6 != 0) goto L2d
            r2 = r7
            r0 = r3
            r1 = r4
        L16:
            int r7 = r7 + r0
            int r0 = r2 + 1
            r8 = r7
            r7 = r0
        L1b:
            byte r0 = (byte) r8
            r5[r1] = r0
            if (r1 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            int r1 = r1 + 1
            r0 = r6[r7]
            r2 = r7
            r7 = r8
            goto L16
        L2d:
            r1 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fb.c.$$n(byte, int, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f25757u = 1228619836;
        init$0();
        f25748j = 1795070057;
        f25756t = 0;
        f25754p = 1;
        f25753o = 0;
        f25755q = 1;
        p();
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getEdgeSlop();
        ViewConfiguration.getScrollBarSize();
        View.getDefaultSize(0, 0);
        ViewConfiguration.getZoomControlsTimeout();
        int i2 = f25754p + 5;
        f25756t = i2 % 128;
        int i3 = i2 % 2;
    }

    public c(String str, String str2, boolean z2) {
        super(str, str2, z2);
        this.f25758g = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void H(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r2 = r6 * 6
            int r1 = 7 - r2
            int r0 = r7 * 6
            int r7 = r0 + 4
            int r0 = r5 * 11
            int r6 = r0 + 100
            byte[] r5 = o.fb.c.$$j
            byte[] r4 = new byte[r1]
            int r3 = 6 - r2
            r2 = 0
            if (r5 != 0) goto L2d
            r0 = r6
            r6 = r3
            r1 = r2
        L18:
            int r7 = r7 + 1
            int r6 = r6 + r0
        L1b:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r2)
            r8[r2] = r0
            return
        L28:
            r0 = r5[r7]
            int r1 = r1 + 1
            goto L18
        L2d:
            r1 = r2
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fb.c.H(int, byte, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        if (cVar.g() == null || cVar.g().get(0) == null) {
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                v((short) ((-66) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 416150124, 1627067819 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 125, (byte) ExpandableListView.getPackedPositionType(0L), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr3 = new Object[1];
                w("ꗱ롸ଅꖖ飅碱䫁᩷⛴\u1c38칡鴊ꍘ龎䌒ᆕ⾴ዕ삦鑼\ua83a际䑌࣭㕾ক\ud9e6讼뇷贏庇ษ㈰y툸苼뺟菔垕Ԕ㮱ܡ\ueb65砩葝憎栖ﲘ¥緩\uedba罷赑\uf11a愕", KeyEvent.getMaxKeyCode() >> 16, objArr3);
                StringBuilder sbAppend = sb.append(((String) objArr3[0]).intern()).append(cVar.c());
                Object[] objArr4 = new Object[1];
                w("ᬦɫ臞ᬆ⋛䱑쀏⺪顦\ua63d䒡ꦙᶀ▁짋╪酮ꢳ䩥ꂜᛟⱀ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                f.c(strIntern, sbAppend.append(((String) objArr4[0]).intern()).toString());
            }
            return null;
        }
        if (cVar.i() == null) {
            int i3 = f25755q + 49;
            f25753o = i3 % 128;
            if (i3 % 2 != 0) {
                f.a();
                throw null;
            }
            if (f.a()) {
                Object[] objArr5 = new Object[1];
                v((short) (TextUtils.lastIndexOf("", '0', 0, 0) - 66), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 416150124, 1627067819 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-125) - TextUtils.getOffsetAfter("", 0), (byte) (ViewConfiguration.getTapTimeout() >> 16), objArr5);
                String strIntern2 = ((String) objArr5[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                w("ꗱ롸ଅꖖ飅碱䫁᩷⛴\u1c38칡鴊ꍘ龎䌒ᆕ⾴ዕ삦鑼\ua83a际䑌࣭㕾ক\ud9e6讼뇷贏庇ษ㈰y툸苼뺟菔垕Ԕ㮱ܡ\ueb65砩葝憎栖ﲘ¥緩\uedba罷赑\uf11a愕", TextUtils.getOffsetBefore("", 0), objArr6);
                StringBuilder sbAppend2 = sb2.append(((String) objArr6[0]).intern()).append(cVar.c());
                Object[] objArr7 = new Object[1];
                w("패ۃᦏ팈♳핷塞람偨ꊕ\udcf0タ햃ℾ円밟奸걚툭㦾\udec5⣾囋ꔚ䎺뜈쬿♬윍㎯", ViewConfiguration.getScrollBarSize() >> 8, objArr7);
                f.c(strIntern2, sbAppend2.append(((String) objArr7[0]).intern()).toString());
            }
            return null;
        }
        Date dateD = cVar.i().d();
        if (dateD != null && dateD.before(new Date())) {
            if (f.a()) {
                Object[] objArr8 = new Object[1];
                v((short) (ImageFormat.getBitsPerPixel(0) - 66), (-416150124) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 1627067820, (ViewConfiguration.getTapTimeout() >> 16) - 125, (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr8);
                String strIntern3 = ((String) objArr8[0]).intern();
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr9 = new Object[1];
                w("ꗱ롸ଅꖖ飅碱䫁᩷⛴\u1c38칡鴊ꍘ龎䌒ᆕ⾴ዕ삦鑼\ua83a际䑌࣭㕾ক\ud9e6讼뇷贏庇ษ㈰y툸苼뺟菔垕Ԕ㮱ܡ\ueb65砩葝憎栖ﲘ¥緩\uedba罷赑\uf11a愕", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr9);
                StringBuilder sbAppend3 = sb3.append(((String) objArr9[0]).intern()).append(cVar.c());
                Object[] objArr10 = new Object[1];
                v((short) (Color.blue(0) - 112), (-416149973) - ExpandableListView.getPackedPositionGroup(0L), 1627067764 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-125) - View.resolveSize(0, 0), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr10);
                f.c(strIntern3, sbAppend3.append(((String) objArr10[0]).intern()).toString());
            }
            return null;
        }
        Iterator<e> it = cVar.g().iterator();
        while (it.hasNext()) {
            int i4 = f25755q + 35;
            f25753o = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr11 = {it.next(), Integer.valueOf(cVar.f25758g)};
            int i6 = e.f26002a * 645608949;
            e.f26002a = i6;
            int i7 = e.f26006e * 1360166262;
            e.f26006e = i7;
            int i8 = e.f26004c * (-292459287);
            e.f26004c = i8;
            o.fl.d dVar = (o.fl.d) e.c(i6, i8, -1668709194, i7, Thread.activeCount(), 1668709195, objArr11);
            if (dVar != null) {
                return dVar;
            }
            int i9 = f25753o + 59;
            f25755q = i9 % 128;
            int i10 = i9 % 2;
        }
        if (f.a()) {
            Object[] objArr12 = new Object[1];
            v((short) ((-68) - Process.getGidForName("")), (-416150124) - Drawable.resolveOpacity(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1627067819, TextUtils.getOffsetBefore("", 0) - 125, (byte) TextUtils.indexOf("", "", 0), objArr12);
            String strIntern4 = ((String) objArr12[0]).intern();
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr13 = new Object[1];
            w("ꗱ롸ଅꖖ飅碱䫁᩷⛴\u1c38칡鴊ꍘ龎䌒ᆕ⾴ዕ삦鑼\ua83a际䑌࣭㕾ক\ud9e6讼뇷贏庇ษ㈰y툸苼뺟菔垕Ԕ㮱ܡ\ueb65砩葝憎栖ﲘ¥緩\uedba罷赑\uf11a愕", View.MeasureSpec.getMode(0), objArr13);
            StringBuilder sbAppend4 = sb4.append(((String) objArr13[0]).intern()).append(cVar.c());
            Object[] objArr14 = new Object[1];
            w("辤鑡귇辄듑匼\uec16㇇\u0ce4〷梸뛴褅뎏\ue5d6㨝ר㻸晵뿸艁먙\ue29c⍑Ἵ", ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), objArr14);
            f.c(strIntern4, sbAppend4.append(((String) objArr14[0]).intern()).toString());
        }
        return null;
    }

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~i7;
        int i10 = (i8 + i9) - (i8 & i9);
        int i11 = ~i6;
        int i12 = ~((i10 + i11) - (i10 & i11));
        int i13 = ~((-1) - (((-1) - ((i2 + i7) - (i2 & i7))) & ((-1) - i6)));
        int i14 = (i12 + i13) - (i12 & i13);
        int i15 = (~(i9 | i6)) | (~(i9 | i2));
        int i16 = ~(i6 | i7);
        int i17 = (i16 + i2) - (i16 & i2);
        int i18 = i2 + i7 + i5 + (1661237432 * i3) + (961048624 * i4);
        int i19 = i18 * i18;
        int i20 = ((119520104 * i2) - 281083904) + ((-1329838950) * i7) + (i14 * 724679527) + (724679527 * i15) + ((-724679527) * i17) + ((-605159424) * i5) + ((-1559232512) * i3) + (1553989632 * i4) + (2020540416 * i19);
        int i21 = (i2 * (-2040814728)) + 92927091 + (i7 * (-2040813538)) + (i14 * (-595)) + (i15 * (-595)) + (i17 * 595) + (i5 * (-2040814133)) + (i3 * (-1614655000)) + (i4 * 500164112) + (i19 * 184877056);
        return i20 + ((i21 * i21) * 1800994816) != 1 ? d(objArr) : a(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x056c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object d(java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fb.c.d(java.lang.Object[]):java.lang.Object");
    }

    private boolean e(e eVar) throws Throwable {
        int i2 = 2 % 2;
        if (g() == null) {
            c(new ArrayList());
        }
        ListIterator<e> listIterator = g().listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().g() == eVar.g()) {
                int i3 = f25753o + 39;
                f25755q = i3 % 128;
                int i4 = i3 % 2;
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    v((short) ((-67) - ExpandableListView.getPackedPositionType(0L)), (-416150124) + (ViewConfiguration.getScrollBarSize() >> 8), View.getDefaultSize(0, 0) + 1627067819, (-125) - View.MeasureSpec.getSize(0), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    v((short) ((-102) - TextUtils.indexOf("", "", 0, 0)), TextUtils.lastIndexOf("", '0', 0) - 416150100, KeyEvent.normalizeMetaState(0) + 1627067841, (-125) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
                    f.c(strIntern, String.format(((String) objArr2[0]).intern(), c()));
                }
                listIterator.set(eVar);
                int i5 = f25755q + 117;
                f25753o = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
        }
        g().add(eVar);
        int i7 = f25753o + 47;
        f25755q = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$d = new byte[]{54, -126, MessagePack.Code.INT32, 96};
        $$e = 88;
    }

    static void init$1() {
        $$j = new byte[]{37, 121, MessagePack.Code.MAP32, 74, -65, 75, -75, 52, MessagePack.Code.FALSE, Ascii.SO};
        $$k = 171;
    }

    static void init$2() {
        $$l = new byte[]{37, -107, Ascii.NAK, -25};
        $$m = 106;
    }

    static void p() {
        f25746f = 1549795087;
        f25747h = 1150422513;
        f25749k = -610867423;
        f25752n = new byte[]{Ascii.ETB, -15, -27, -6, 16, MessagePack.Code.EXT8, -15, -24, -8, -29, Ascii.ETB, Ascii.DC4, -94, -11, 56, -77, -30, -29, -4, Ascii.SI, -25, Ascii.FF, Ascii.SYN, MessagePack.Code.ARRAY32, -73, MessagePack.Code.BIN16, MessagePack.Code.BIN32, -67, MessagePack.Code.BIN8, MessagePack.Code.UINT64, -30, -128, MessagePack.Code.STR16, MessagePack.Code.INT8, -105, MessagePack.Code.BIN8, MessagePack.Code.NEVER_USED, -74, -70, MessagePack.Code.FIXEXT4, MessagePack.Code.STR8, -93, -72, MessagePack.Code.NIL, MessagePack.Code.FIXEXT16, 75, -24, MessagePack.Code.FIXEXT16, -2, -25, -27, -23, MessagePack.Code.FIXEXT1, 53, -107, -30, -21, -28, 37, -98, -11, MessagePack.Code.INT32, 35, -128, -9, -19, 60, -107, MessagePack.Code.INT8, -29, -22, -28, 60, -128, -10, -28, -17, MessagePack.Code.FIXEXT1, -31, -4, 42, -107, -2, 42, -21, MessagePack.Code.FIXEXT1, -2, -98, 57, -26, MessagePack.Code.NEVER_USED, Ascii.CR, -81, Ascii.FF, -78, -21, Ascii.CAN, -68, -30, -29, 38, MessagePack.Code.FIXEXT1, -2, -128, -9, Ascii.CR, MessagePack.Code.NEVER_USED, -23, MessagePack.Code.FIXEXT4, -2, MessagePack.Code.INT64, Ascii.VT, 120, 2, 76, 72, Utf8.REPLACEMENT_BYTE, 34, 77, 78, 54, 52, 32, 68, Ascii.EM, 118, 56, 98, 127, 77, 106, 102, 85, 88, 107, 100, 108, 82, 94, 98, 3, 4, 38, 56, -18, Ascii.DC2, 44, Ascii.FS, Ascii.GS, 38, Ascii.SYN, 47, 91, -27, 54, 76, 53, 54, 79, -122, 34, 68, -28, 55, 48, 66, 36, 80, Ascii.SYN, 79, 76, 62, 51, Ascii.SYN, -14, -17, 78, -102, 9, -25, 54, -95, -30, -18, -12, -28, -27, Ascii.SO, 56, -81, -16, 60, MessagePack.Code.FIXARRAY_PREFIX, Ascii.SI, -28, 53};
        f25750l = -6077420513376816478L;
    }

    private static b t() {
        int i2 = 2 % 2;
        b bVar = new b();
        int i3 = f25753o + 57;
        f25755q = i3 % 128;
        int i4 = i3 % 2;
        return bVar;
    }

    private static void v(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        long j2;
        boolean z2;
        int i5 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f25747h)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objA = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 238, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 44531), 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 35969549, false, $$n(b3, b4, (byte) (10 | b4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f25752n;
                long j3 = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA2 = o.d.d.a(629 - (SystemClock.elapsedRealtime() > j3 ? 1 : (SystemClock.elapsedRealtime() == j3 ? 0 : -1)), (char) (28648 - TextUtils.indexOf((CharSequence) "", '0', 0)), Color.rgb(0, 0, 0) + 16777227, 1621469864, false, $$n(b5, b6, (byte) (11 | b6)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i7++;
                        j3 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f25752n;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f25746f)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 238, (char) (44531 - (Process.myTid() >> 22)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, 35969549, false, $$n(b7, b8, (byte) ((b8 + 10) - (10 & b8))), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f25747h) ^ (-7649639543924978291L))));
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f25751m[i2 + ((int) (((long) f25746f) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f25747h) ^ (-7649639543924978291L))));
                }
            } else {
                j2 = -7649639543924978291L;
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f25746f) ^ j2)) + i6;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f25749k), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a(ViewConfiguration.getJumpTapTimeout() >> 16, (char) (5358 - TextUtils.getOffsetAfter("", 0)), View.getDefaultSize(0, 0) + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f25752n;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i8 = 0; i8 < length2; i8++) {
                        int i9 = $10 + 81;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        bArr5[i8] = (byte) (((long) bArr4[i8]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i11 = $10 + 65;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = f25752n;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f25751m;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void w(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 113;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f25750l ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        int i6 = $10 + 115;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 3;
        }
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f25750l)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(229 - Color.blue(0), (char) (51005 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Color.green(0) + 9, 1749983833, false, $$n(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 7)))), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) View.combineMeasuredStates(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR, 522683165, false, $$n(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i9 = $11 + 5;
                $10 = i9 % 128;
                int i10 = i9 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void x(short r8, byte r9, int r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 3
            int r8 = 101 - r0
            int r0 = r9 * 4
            int r7 = 3 - r0
            byte[] r6 = o.fb.c.$$d
            int r0 = r10 * 2
            int r5 = r0 + 1
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r6 != 0) goto L2c
            r0 = r8
            r8 = r5
            r2 = r3
        L16:
            int r8 = r8 + r0
            r1 = r2
        L18:
            int r7 = r7 + 1
            byte r0 = (byte) r8
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r5) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L29:
            r0 = r6[r7]
            goto L16
        L2c:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fb.c.x(short, byte, int, java.lang.Object[]):void");
    }

    private static o.da.c y() {
        int i2 = 2 % 2;
        o.da.c cVar = new o.da.c();
        int i3 = f25755q + 91;
        f25753o = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }

    @Override // o.eu.d
    public final /* synthetic */ boolean a(Context context, a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25755q + 99;
        f25753o = i3 % 128;
        int i4 = i3 % 2;
        boolean zE = e((e) aVar);
        if (i4 != 0) {
            int i5 = 45 / 0;
        }
        return zE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    @Override // o.eu.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.ef.a b(o.ek.e r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fb.c.b(o.ek.e):o.ef.a");
    }

    @Override // o.eu.d
    public final void b() {
        int i2 = 2 % 2;
        int i3 = f25755q + 109;
        f25753o = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.eu.d
    public final /* synthetic */ o.eu.a d() {
        int i2 = 2 % 2;
        int i3 = f25755q + 31;
        f25753o = i3 % 128;
        int i4 = i3 % 2;
        b bVarT = t();
        int i5 = f25753o + 25;
        f25755q = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return bVarT;
    }

    @Override // o.eu.d
    public final /* synthetic */ o.cr.d e() {
        int i2 = 2 % 2;
        int i3 = f25753o + 75;
        f25755q = i3 % 128;
        if (i3 % 2 == 0) {
            y();
            throw null;
        }
        o.da.c cVarY = y();
        int i4 = f25755q + 71;
        f25753o = i4 % 128;
        int i5 = i4 % 2;
        return cVarY;
    }

    public final void e(int i2) {
        int i3 = 2 % 2;
        int i4 = f25753o + 123;
        int i5 = i4 % 128;
        f25755q = i5;
        if (i4 % 2 == 0) {
            this.f25758g = i2;
            throw null;
        }
        this.f25758g = i2;
        int i6 = i5 + 69;
        f25753o = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.eu.d
    public final o.ff.e m() {
        int i2 = f25748j * 472982668;
        f25748j = i2;
        int iNextInt = new Random().nextInt();
        return (o.ff.e) d(849453150, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), iNextInt, new Object[]{this}, i2, -849453149);
    }

    public final int s() {
        int iMyTid = Process.myTid();
        int iMyPid = Process.myPid();
        return ((Integer) d(-1462814612, (int) Process.getElapsedCpuTime(), (int) SystemClock.elapsedRealtime(), iMyPid, new Object[]{this}, iMyTid, 1462814612)).intValue();
    }
}
