package o.fc;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import o.a.n;
import o.a.o;
import o.ef.c;
import o.eu.a;
import o.ff.b;
import o.fk.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends o.eu.a<o.fk.d, d> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f25759a = 0;

    /* JADX INFO: renamed from: b */
    public static int f25760b = 0;

    /* JADX INFO: renamed from: c */
    public static int f25761c = 0;

    /* JADX INFO: renamed from: e */
    public static int f25762e = 0;

    /* JADX INFO: renamed from: l */
    private static int f25763l = 0;

    /* JADX INFO: renamed from: p */
    private static long f25764p = 0;

    /* JADX INFO: renamed from: q */
    private static int f25765q = 0;

    /* JADX INFO: renamed from: r */
    private static int f25766r = 0;

    /* JADX INFO: renamed from: s */
    private static char[] f25767s = null;

    /* JADX INFO: renamed from: t */
    private static int f25768t = 0;

    /* JADX INFO: renamed from: x */
    private static int f25769x = 0;

    /* JADX INFO: renamed from: d */
    private final String f25770d;

    /* JADX INFO: renamed from: f */
    private final String f25771f;

    /* JADX INFO: renamed from: g */
    private final String f25772g;

    /* JADX INFO: renamed from: h */
    private final String f25773h;

    /* JADX INFO: renamed from: i */
    private final String f25774i;

    /* JADX INFO: renamed from: j */
    private final String f25775j;

    /* JADX INFO: renamed from: k */
    private final String f25776k;

    /* JADX INFO: renamed from: m */
    private final String f25777m;

    /* JADX INFO: renamed from: n */
    private final String f25778n;

    /* JADX INFO: renamed from: o */
    private final String f25779o;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$d(short r6, short r7, byte r8) {
        /*
            int r0 = r8 * 4
            int r0 = 3 - r0
            int r2 = r7 * 3
            int r1 = 1 - r2
            byte[] r8 = o.fc.a.$$a
            int r7 = r6 + 99
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2b
            r1 = r0
            r3 = r5
        L15:
            int r0 = -r0
            int r7 = r7 + r0
            r0 = r1
            r2 = r3
        L19:
            byte r1 = (byte) r7
            r6[r2] = r1
            int r1 = r0 + 1
            int r3 = r2 + 1
            if (r2 != r4) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L28:
            r0 = r8[r1]
            goto L15
        L2b:
            r2 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fc.a.$$d(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25762e = -216179746;
        f25759a = 1849482630;
        f25761c = 1946650223;
        f25760b = 238053520;
        f25765q = 0;
        f25769x = 1;
        f25768t = 0;
        f25766r = 1;
        a();
        Gravity.getAbsoluteGravity(0, 0);
        ViewConfiguration.getKeyRepeatDelay();
        ImageFormat.getBitsPerPixel(0);
        int i2 = f25769x + 123;
        f25765q = i2 % 128;
        int i3 = i2 % 2;
    }

    public a() throws Throwable {
        Object[] objArr = new Object[1];
        w(TextUtils.getOffsetBefore("", 0) + 15, "\u0007\ufffb\t\b\ufffb\n\u0004\u000b\u0005\uffd9\ufffb\ufff9\u0004\ufffb\u000b", true, View.getDefaultSize(0, 0) + 232, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3, objArr);
        this.f25770d = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        w(17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0010\ufff9\u0005\n�\ufffa\u0005\r￦\f\u0006�\u0005\u0011\ufff9￨", true, Gravity.getAbsoluteGravity(0, 0) + 230, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2, objArr2);
        this.f25772g = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        w(ExpandableListView.getPackedPositionType(0L) + 3, "\u0001￼\u0003", false, ExpandableListView.getPackedPositionGroup(0L) + 230, 1 - View.resolveSize(0, 0), objArr3);
        this.f25775j = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        y((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ViewConfiguration.getFadingEdgeLength() >> 16, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, objArr4);
        this.f25771f = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        w(3 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\b\u0001\ufff9", false, 230 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2 - (ViewConfiguration.getEdgeSlop() >> 16), objArr5);
        this.f25773h = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        w(13 - View.getDefaultSize(0, 0), "\n\f￼￡\u0006\u0007\u0001\f\ufffb\ufff9\u000b\u0006\ufff9", true, (ViewConfiguration.getJumpTapTimeout() >> 16) + 230, TextUtils.indexOf("", "", 0, 0) + 2, objArr6);
        this.f25774i = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        y((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 15 - (ViewConfiguration.getLongPressTimeout() >> 16), 15 - TextUtils.indexOf((CharSequence) "", '0'), objArr7);
        this.f25778n = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        y((char) (TextUtils.getOffsetBefore("", 0) + 44154), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32, 19 - KeyEvent.keyCodeFromString(""), objArr8);
        this.f25776k = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        y((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14170), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, Color.alpha(0) + 3, objArr9);
        this.f25777m = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        y((char) (43580 - TextUtils.getOffsetBefore("", 0)), 53 - View.resolveSize(0, 0), 5 - TextUtils.lastIndexOf("", '0', 0), objArr10);
        this.f25779o = ((String) objArr10[0]).intern();
    }

    private o.ef.a a(d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25768t + 53;
        f25766r = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarA = super.a(dVar);
        Object[] objArr = new Object[1];
        y((char) (43099 - View.getDefaultSize(0, 0)), 59 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 18, objArr);
        aVarA.c(((String) objArr[0]).intern(), dVar.s());
        int i5 = f25768t + 55;
        f25766r = i5 % 128;
        int i6 = i5 % 2;
        return aVarA;
    }

    private static o.fk.d a(boolean z2, b bVar, short s2) {
        int i2 = 2 % 2;
        o.fk.d dVar = new o.fk.d(false, bVar, s2);
        int i3 = f25766r + 57;
        f25768t = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 46 / 0;
        }
        return dVar;
    }

    static void a() {
        f25763l = -1270219419;
        f25767s = new char[]{38041, 19438, 10873, 2764, 59749, 51662, 43075, 35032, 28530, 20442, 11835, 3765, 60721, 52645, 44053, 38022, 19426, 10861, 2812, 59749, 51675, 43077, 35024, 28490, 20448, 11821, 3746, 60721, 52665, 44040, 35990, 14589, 59295, 34314, 42641, 17673, 26033, 1079, 9380, 49972, 58280, 33360, 41687, 16705, 25059, 'c', 8434, 53114, 61412, 36472, 41929, 31909, 7481, 16061, 57795, 32861, 41169, 17247, 25568, 15562, 58277, 33321, 41648, 16680, 24986, 11, 8365, 50948, 59281, 34386, 42734, 17766, 26079, 1091, 9439, 52043, 60372, 38043, 19429, 10870, 2808, 59770, 51654, 43072, 34973, 28490, 20434, 11825, 3756, 60731, 52665, 44056, 36037, 25353, 17310, 8713, 297, 57842, 49254, 41188, 34632, 38103, 19387, 10802, 2753};
        f25764p = 7289998043939097483L;
    }

    private d b(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25766r + 3;
        f25768t = i3 % 128;
        int i4 = i3 % 2;
        d dVar = (d) super.a(aVar);
        Object[] objArr = new Object[1];
        y((char) (Color.rgb(0, 0, 0) + 16820315), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 59, (ViewConfiguration.getPressedStateDuration() >> 16) + 18, objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i5 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i5;
        int i6 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i6;
        dVar.a(((Integer) o.ef.a.a(1122077797, objArr2, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i5, i6)).intValue());
        int i7 = f25766r + 71;
        f25768t = i7 % 128;
        int i8 = i7 % 2;
        return dVar;
    }

    private o.ef.a c(o.fk.d dVar) throws o.ef.b {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int iMyUid = Process.myUid();
        int iActiveCount = Thread.activeCount();
        int i3 = 1854771825 * f25760b;
        f25760b = i3;
        return (o.ef.a) e(iMyUid, i2, i3, 1434644551, -1434644551, iActiveCount, new Object[]{this, dVar});
    }

    private o.fk.d c(o.ef.a aVar) throws o.ef.b {
        int i2 = f25761c * (-2004400144);
        f25761c = i2;
        int iNextInt = new Random().nextInt();
        int i3 = f25759a * (-357359646);
        f25759a = i3;
        int i4 = 2124523106 * f25762e;
        f25762e = i4;
        return (o.fk.d) e(iNextInt, i2, i4, 1756636694, -1756636693, i3, new Object[]{this, aVar});
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) throws Throwable {
        c cVar;
        int i8 = ~i5;
        int i9 = (~i6) | i8;
        int i10 = ~((i9 + i3) - (i9 & i3));
        int i11 = ~i3;
        int i12 = (i11 + i8) - (i11 & i8);
        int i13 = ~(i12 | i6);
        int i14 = (-1) - (((-1) - ((i10 + i13) - (i10 & i13))) & ((-1) - (~((-1) - (((-1) - ((i5 + i6) - (i5 & i6))) & ((-1) - i3))))));
        int i15 = ~i12;
        int i16 = (~((i3 + i5) - (i3 & i5))) | ((-1) - (((-1) - i6) & ((-1) - i15)));
        int i17 = ~((-1) - (((-1) - i8) & ((-1) - i6)));
        int i18 = (i17 + i15) - (i17 & i15);
        int i19 = i5 + i6 + i2 + (933655473 * i7) + ((-1037598838) * i4);
        int i20 = i19 * i19;
        int i21 = ((i5 * (-727610197)) - 1081761860) + (i6 * (-727608285)) + (i14 * 956) + (i16 * (-956)) + (i18 * 956) + ((-727609241) * i2) + (1532828727 * i7) + ((-747900794) * i4) + (i20 * 556466176);
        if ((((-1556109539) * i5) - 925892608) + (470833381 * i6) + (i14 * (-1134012188)) + (1134012188 * i16) + ((-1134012188) * i18) + (1604845568 * i2) + ((-1691877376) * i7) + ((-393216000) * i4) + ((-1633878016) * i20) + (i21 * i21 * (-1911357440)) == 1) {
            return e(objArr);
        }
        a aVar = (a) objArr[0];
        o.fk.d dVar = (o.fk.d) objArr[1];
        int i22 = 2 % 2;
        o.ef.a aVarA = super.a(dVar);
        Object[] objArr2 = new Object[1];
        w(TextUtils.indexOf("", "", 0) + 15, "\u0007\ufffb\t\b\ufffb\n\u0004\u000b\u0005\uffd9\ufffb\ufff9\u0004\ufffb\u000b", true, 233 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 4 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        aVarA.c(((String) objArr2[0]).intern(), dVar.g());
        Object[] objArr3 = new Object[1];
        w(16 - Color.red(0), "\u0010\ufff9\u0005\n�\ufffa\u0005\r￦\f\u0006�\u0005\u0011\ufff9￨", true, 230 - ExpandableListView.getPackedPositionGroup(0L), 3 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
        aVarA.c(((String) objArr3[0]).intern(), dVar.j());
        Object[] objArr4 = new Object[1];
        w(3 - TextUtils.getTrimmedLength(""), "\b\u0001\ufff9", false, 230 - TextUtils.getOffsetBefore("", 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, objArr4);
        aVarA.a(((String) objArr4[0]).intern(), dVar.n());
        Object[] objArr5 = new Object[1];
        w(3 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0001￼\u0003", false, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 230, 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr5);
        String strIntern = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        y((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 101, 4 - TextUtils.indexOf("", "", 0), objArr6);
        aVarA.a(strIntern, String.format(((String) objArr6[0]).intern(), Byte.valueOf(dVar.l())));
        if (dVar.i() != null) {
            cVar = new c();
            Iterator<d.C0351d> it = dVar.i().iterator();
            int i23 = f25766r + 41;
            f25768t = i23 % 128;
            while (true) {
                int i24 = i23 % 2;
                if (!it.hasNext()) {
                    break;
                }
                d.C0351d next = it.next();
                o.ef.a aVar2 = new o.ef.a();
                Object[] objArr7 = new Object[1];
                w(12 - TextUtils.lastIndexOf("", '0', 0), "\n\f￼￡\u0006\u0007\u0001\f\ufffb\ufff9\u000b\u0006\ufff9", true, (ViewConfiguration.getLongPressTimeout() >> 16) + 230, TextUtils.indexOf("", "", 0, 0) + 2, objArr7);
                aVar2.a(((String) objArr7[0]).intern(), (Object) next.d());
                Object[] objArr8 = new Object[1];
                y((char) (44153 - Process.getGidForName("")), (ViewConfiguration.getEdgeSlop() >> 16) + 31, ExpandableListView.getPackedPositionGroup(0L) + 19, objArr8);
                aVar2.a(((String) objArr8[0]).intern(), (Object) o.dl.d.e(next.c()));
                Object[] objArr9 = new Object[1];
                y((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15, 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
                aVar2.c(((String) objArr9[0]).intern(), next.a());
                Object[] objArr10 = new Object[1];
                y((char) (ImageFormat.getBitsPerPixel(0) + 14171), 49 - ((byte) KeyEvent.getModifierMetaStateMask()), 3 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr10);
                aVar2.c(((String) objArr10[0]).intern(), next.g());
                Object[] objArr11 = new Object[1];
                y((char) (43580 - View.resolveSizeAndState(0, 0, 0)), Process.getGidForName("") + 54, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5, objArr11);
                aVar2.a(((String) objArr11[0]).intern(), (Object) next.e().a());
                cVar.a(aVar2);
                i23 = f25768t + 53;
                f25766r = i23 % 128;
            }
        } else {
            cVar = null;
        }
        Object[] objArr12 = new Object[1];
        y((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.keyCodeFromString(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, objArr12);
        aVarA.a(((String) objArr12[0]).intern(), cVar);
        return aVarA;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        ArrayList arrayList;
        int i2 = 0;
        a aVar = (a) objArr[0];
        o.ef.a aVar2 = (o.ef.a) objArr[1];
        int i3 = 2;
        int i4 = 2 % 2;
        o.fk.d dVar = (o.fk.d) super.d(aVar2);
        Object[] objArr2 = new Object[1];
        w(15 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0007\ufffb\t\b\ufffb\n\u0004\u000b\u0005\uffd9\ufffb\ufff9\u0004\ufffb\u000b", true, 232 - (ViewConfiguration.getTouchSlop() >> 8), 4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
        Object[] objArr3 = {aVar2, ((String) objArr2[0]).intern()};
        int i5 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i5;
        int i6 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i6;
        dVar.c(((Integer) o.ef.a.a(1122077797, objArr3, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i5, i6)).intValue());
        Object[] objArr4 = new Object[1];
        w(15 - Process.getGidForName(""), "\u0010\ufff9\u0005\n�\ufffa\u0005\r￦\f\u0006�\u0005\u0011\ufff9￨", true, TextUtils.indexOf("", "", 0, 0) + 230, 3 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr4);
        dVar.e(aVar2.l(((String) objArr4[0]).intern()).shortValue());
        Object[] objArr5 = new Object[1];
        w(2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\b\u0001\ufff9", false, TextUtils.getOffsetBefore("", 0) + 230, 2 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr5);
        Object[] objArr6 = {aVar2, ((String) objArr5[0]).intern()};
        int i7 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i7;
        int i8 = -781664457;
        dVar.e((String) o.ef.a.a(-781664457, objArr6, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority()));
        Object[] objArr7 = new Object[1];
        w(3 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0001￼\u0003", false, 230 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr7);
        dVar.a(aVar2.B(((String) objArr7[0]).intern()).byteValue());
        char c2 = '0';
        Object[] objArr8 = new Object[1];
        y((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 1, Color.rgb(0, 0, 0) + 16777231, objArr8);
        if (aVar2.d(((String) objArr8[0]).intern())) {
            Object[] objArr9 = new Object[1];
            y((char) KeyEvent.getDeadChar(0, 0), KeyEvent.keyCodeFromString(""), 15 - KeyEvent.getDeadChar(0, 0), objArr9);
            Object[] objArr10 = {aVar2, ((String) objArr9[0]).intern()};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iMyUid = Process.myUid();
            int i9 = o.ef.a.f23780n * (-1229108307);
            o.ef.a.f23780n = i9;
            c cVar = (c) o.ef.a.a(-1398121910, objArr10, iMyUid, i9, 1398121917, iUptimeMillis, iElapsedRealtime);
            arrayList = new ArrayList();
            int i10 = f25768t + 121;
            f25766r = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 0;
            while (true) {
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i13 = c.f23799b * 1567746851;
                c.f23799b = i13;
                int i14 = c.f23798a * 1136425123;
                c.f23798a = i14;
                if (i12 >= ((Integer) c.b((int) Runtime.getRuntime().maxMemory(), i14, i13, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                    break;
                }
                int i15 = f25766r + 83;
                f25768t = i15 % 128;
                int i16 = i15 % i3;
                o.ef.a aVarD = cVar.d(i12);
                Object[] objArr11 = new Object[1];
                w(13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\n\f￼￡\u0006\u0007\u0001\f\ufffb\ufff9\u000b\u0006\ufff9", true, 230 - TextUtils.getOffsetAfter("", i2), 2 - TextUtils.getOffsetAfter("", i2), objArr11);
                Object[] objArr12 = {aVarD, ((String) objArr11[i2]).intern()};
                int i17 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i17;
                String str = (String) o.ef.a.a(i8, objArr12, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i17, Thread.currentThread().getPriority());
                Object[] objArr13 = new Object[1];
                y((char) (KeyEvent.getMaxKeyCode() >> 16), 15 - TextUtils.indexOf("", ""), 16 - Color.alpha(i2), objArr13);
                long jLongValue = aVarD.n(((String) objArr13[i2]).intern()).longValue();
                Object[] objArr14 = new Object[1];
                y((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 44154), 31 - (ViewConfiguration.getEdgeSlop() >> 16), Drawable.resolveOpacity(i2, i2) + 19, objArr14);
                byte[] bArrD = aVarD.D(((String) objArr14[i2]).intern());
                Object[] objArr15 = new Object[1];
                y((char) ((Process.myPid() >> 22) + 14170), 49 - TextUtils.indexOf("", c2, i2, i2), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3, objArr15);
                Object[] objArr16 = {aVarD, ((String) objArr15[i2]).intern()};
                int i18 = o.ef.a.f23778l * 493926616;
                o.ef.a.f23778l = i18;
                int i19 = o.ef.a.f23779m * 1131312688;
                o.ef.a.f23779m = i19;
                int iIntValue = ((Integer) o.ef.a.a(1122077797, objArr16, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i18, i19)).intValue();
                try {
                    Object[] objArr17 = new Object[1];
                    y((char) (43581 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 52 - TextUtils.indexOf((CharSequence) "", '0', i2, i2), 6 - (ViewConfiguration.getEdgeSlop() >> 16), objArr17);
                    Object[] objArr18 = {aVarD, ((String) objArr17[0]).intern()};
                    int i20 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i20;
                    i8 = -781664457;
                    arrayList.add(new d.C0351d(str, jLongValue, bArrD, iIntValue, b.e((String) o.ef.a.a(-781664457, objArr18, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i20, Thread.currentThread().getPriority()))));
                    i12++;
                    i2 = 0;
                    i3 = 2;
                    c2 = '0';
                } catch (IllegalArgumentException unused) {
                    Object[] objArr19 = new Object[1];
                    y((char) View.getDefaultSize(0, 0), 78 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.combineMeasuredStates(0, 0) + 24, objArr19);
                    throw new o.ef.b(((String) objArr19[0]).intern());
                }
            }
        } else {
            arrayList = null;
        }
        int i21 = o.fk.d.f25964e * 683229526;
        o.fk.d.f25964e = i21;
        o.fk.d.b(1823901947, (int) Runtime.getRuntime().freeMemory(), -1823901946, new Object[]{dVar, arrayList}, Thread.currentThread().getPriority(), Process.myTid(), i21);
        return dVar;
    }

    private static d e(String str, String str2, boolean z2) {
        int i2 = 2 % 2;
        d dVar = new d(str, str2, z2);
        int i3 = f25768t + 113;
        f25766r = i3 % 128;
        int i4 = i3 % 2;
        return dVar;
    }

    static void init$0() {
        $$a = new byte[]{113, 60, -124, 107};
        $$b = 243;
    }

    private static void w(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i6 = $11 + 5;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 87 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i8 = $11 + 37;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i10 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f25763l)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(270 - Color.green(0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), View.resolveSizeAndState(0, 0, 0) + 11, -2071844881, false, $$d((byte) ($$b & 28), b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 522, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12 - (KeyEvent.getMaxKeyCode() >> 16), 627984172, false, $$d((byte) 14, b3, b3), new Class[]{Object.class, Object.class});
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
        if (i4 > 0) {
            int i11 = $11 + 87;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            int i13 = $10 + 65;
            $11 = i13 % 128;
            while (true) {
                int i14 = i13 % 2;
                if (nVar.f19944a >= i2) {
                    break;
                }
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(523 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 12, 627984172, false, $$d((byte) 14, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                i13 = $11 + 99;
                $10 = i13 % 128;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void y(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f25767s[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(Process.getGidForName("") + 743, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 12 - View.combineMeasuredStates(0, 0), 632508977, false, $$d(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f25764p), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    int doubleTapTimeout = 766 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 12470);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 13;
                    byte b4 = (byte) ($$b & 5);
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(doubleTapTimeout, maxKeyCode, iLastIndexOf, 1946853218, false, $$d(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 388, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 18 - (Process.myPid() >> 22), 39570797, false, $$d((byte) 6, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
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
            int i6 = $11 + 77;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                objA4 = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 387, (char) View.combineMeasuredStates(0, 0), 17 - TextUtils.lastIndexOf("", '0', 0, 0), 39570797, false, $$d((byte) 6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i8 = $11 + 107;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 % 2;
            }
        }
        objArr[0] = new String(cArr);
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ef.a a(o.eu.d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25766r + 85;
        f25768t = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarA = a((d) dVar);
        int i5 = f25766r + 57;
        f25768t = i5 % 128;
        if (i5 % 2 == 0) {
            return aVarA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ef.a a(o.ff.a aVar) throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f25768t + 95;
        f25766r = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this, (o.fk.d) aVar};
        Runtime runtime = Runtime.getRuntime();
        if (i4 == 0) {
            int i5 = (int) runtime.totalMemory();
            int iMyUid = Process.myUid();
            int iActiveCount = Thread.activeCount();
            int i6 = f25760b * 1854771825;
            f25760b = i6;
            throw null;
        }
        int i7 = (int) runtime.totalMemory();
        int iMyUid2 = Process.myUid();
        int iActiveCount2 = Thread.activeCount();
        int i8 = f25760b * 1854771825;
        f25760b = i8;
        o.ef.a aVar2 = (o.ef.a) e(iMyUid2, i7, i8, 1434644551, -1434644551, iActiveCount2, objArr);
        int i9 = f25766r + 109;
        f25768t = i9 % 128;
        int i10 = i9 % 2;
        return aVar2;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.eu.d a(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25768t + 65;
        f25766r = i3 % 128;
        int i4 = i3 % 2;
        d dVarB = b(aVar);
        int i5 = f25768t + 55;
        f25766r = i5 % 128;
        if (i5 % 2 != 0) {
            return dVarB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.a
    public final /* bridge */ /* synthetic */ o.ff.a a(b bVar, short s2) {
        int i2 = 2 % 2;
        int i3 = f25768t + 125;
        f25766r = i3 % 128;
        o.fk.d dVarA = a(i3 % 2 == 0, bVar, s2);
        int i4 = f25766r + 47;
        f25768t = i4 % 128;
        int i5 = i4 % 2;
        return dVarA;
    }

    @Override // o.eu.a
    public final a.d b() {
        int i2 = 2 % 2;
        int i3 = f25766r + 115;
        f25768t = i3 % 128;
        int i4 = i3 % 2;
        a.d dVar = a.d.f25442a;
        int i5 = f25766r + 109;
        f25768t = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.eu.d d(String str, String str2, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f25766r + 9;
        f25768t = i3 % 128;
        if (i3 % 2 == 0) {
            return e(str, str2, z2);
        }
        e(str, str2, z2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ff.a d(o.ef.a aVar) throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f25766r + 69;
        f25768t = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = f25761c * (-2004400144);
            f25761c = i4;
            int iNextInt = new Random().nextInt();
            int i5 = f25759a * (-357359646);
            f25759a = i5;
            int i6 = f25762e * 2124523106;
            f25762e = i6;
            return (o.fk.d) e(iNextInt, i4, i6, 1756636694, -1756636693, i5, new Object[]{this, aVar});
        }
        int i7 = f25761c * (-2004400144);
        f25761c = i7;
        int iNextInt2 = new Random().nextInt();
        int i8 = f25759a * (-357359646);
        f25759a = i8;
        int i9 = f25762e * 2124523106;
        f25762e = i9;
        throw null;
    }
}
