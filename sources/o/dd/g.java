package o.dd;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import com.google.zxing.pdf417.PDF417Common;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import o.a.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static final g A;
    public static final g C;
    public static final g D;
    private static int E = 0;
    private static final /* synthetic */ g[] F;
    private static char[] G = null;
    private static long H = 0;
    private static int I = 0;
    private static int K = 0;
    private static int N = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f22856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f22857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f22858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f22859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f22860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f22861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f22862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f22863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f22864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f22865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f22866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f22867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g f22868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f22869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f22870o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f22871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g f22872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f22873r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f22874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f22875t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g f22876u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f22877v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g f22878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f22879x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final g f22880y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final g f22881z;
    private final String B;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, byte r7, byte r8) {
        /*
            int r1 = r8 + 99
            int r0 = r7 * 2
            int r8 = 1 - r0
            byte[] r7 = o.dd.g.$$a
            int r0 = r6 * 4
            int r2 = 3 - r0
            byte[] r6 = new byte[r8]
            r5 = 0
            if (r7 != 0) goto L2b
            r0 = r2
            r3 = r8
            r4 = r5
        L14:
            int r1 = -r2
            int r1 = r1 + r3
            r3 = r4
            r2 = r0
        L18:
            byte r0 = (byte) r1
            int r4 = r3 + 1
            r6[r3] = r0
            int r0 = r2 + 1
            if (r4 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            r2 = r7[r0]
            r3 = r1
            goto L14
        L2b:
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dd.g.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        K = 0;
        N = 1;
        I = 0;
        E = 1;
        a();
        Object[] objArr = new Object[1];
        J((char) (12053 - View.MeasureSpec.makeMeasureSpec(0, 0)), ViewConfiguration.getScrollBarSize() >> 8, MotionEvent.axisFromString("") + 34, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        J((char) View.getDefaultSize(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33, 23 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        f22858c = new g(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        J((char) (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 56, 32 - ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        J((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 59393), 89 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
        f22859d = new g(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        J((char) ('0' - AndroidCharacter.getMirror('0')), 113 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        J((char) (43398 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 168 - TextUtils.getOffsetAfter("", 0), Color.alpha(0) + 30, objArr6);
        f22857b = new g(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        J((char) (19503 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 198 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 67, objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        J((char) (ViewConfiguration.getLongPressTimeout() >> 16), 265 - KeyEvent.normalizeMetaState(0), 41 - Process.getGidForName(""), objArr8);
        f22860e = new g(strIntern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        J((char) ExpandableListView.getPackedPositionGroup(0L), Drawable.resolveOpacity(0, 0) + 307, (ViewConfiguration.getJumpTapTimeout() >> 16) + 45, objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        J((char) (44961 - AndroidCharacter.getMirror('0')), 352 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 26, objArr10);
        f22856a = new g(strIntern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        J((char) (32926 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getWindowTouchSlop() >> 8) + IptcDirectory.TAG_ARM_VERSION, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 55, objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        J((char) (37968 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 434, ExpandableListView.getPackedPositionType(0L) + 38, objArr12);
        f22861f = new g(strIntern6, 5, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        J((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47270), View.combineMeasuredStates(0, 0) + 472, ((Process.getThreadPriority(0) + 20) >> 6) + 50, objArr13);
        String strIntern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        J((char) (20581 - ((byte) KeyEvent.getModifierMetaStateMask())), ((Process.getThreadPriority(0) + 20) >> 6) + 522, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, objArr14);
        f22862g = new g(strIntern7, 6, ((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        J((char) Color.red(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 553, Color.green(0) + 61, objArr15);
        String strIntern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        J((char) (Color.green(0) + 43712), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME, 39 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr16);
        f22864i = new g(strIntern8, 7, ((String) objArr16[0]).intern());
        Object[] objArr17 = new Object[1];
        J((char) (TextUtils.getCapsMode("", 0, 0) + 24564), TextUtils.indexOf("", "", 0) + 653, 48 - TextUtils.getOffsetAfter("", 0), objArr17);
        String strIntern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        J((char) (TextUtils.indexOf("", "", 0) + 19954), 701 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, objArr18);
        f22863h = new g(strIntern9, 8, ((String) objArr18[0]).intern());
        Object[] objArr19 = new Object[1];
        J((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), View.resolveSizeAndState(0, 0, 0) + 719, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, objArr19);
        String strIntern10 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        J((char) (54837 - KeyEvent.getDeadChar(0, 0)), 770 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19, objArr20);
        f22865j = new g(strIntern10, 9, ((String) objArr20[0]).intern());
        Object[] objArr21 = new Object[1];
        J((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 59113), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 790, 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr21);
        String strIntern11 = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        J((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 60902), Color.red(0) + LeicaMakernoteDirectory.TAG_CONTROLLER_BOARD_VERSION, 19 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr22);
        f22868m = new g(strIntern11, 10, ((String) objArr22[0]).intern());
        Object[] objArr23 = new Object[1];
        J((char) (ViewConfiguration.getLongPressTimeout() >> 16), 836 - ImageFormat.getBitsPerPixel(0), ExpandableListView.getPackedPositionChild(0L) + 20, objArr23);
        String strIntern12 = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        J((char) View.combineMeasuredStates(0, 0), 857 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.combineMeasuredStates(0, 0) + 12, objArr24);
        f22869n = new g(strIntern12, 11, ((String) objArr24[0]).intern());
        Object[] objArr25 = new Object[1];
        J((char) (61613 - TextUtils.indexOf("", "")), 868 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 38, objArr25);
        String strIntern13 = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        J((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + TypedValues.Custom.TYPE_REFERENCE, 23 - TextUtils.indexOf("", "", 0, 0), objArr26);
        f22867l = new g(strIntern13, 12, ((String) objArr26[0]).intern());
        Object[] objArr27 = new Object[1];
        J((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + PDF417Common.NUMBER_OF_CODEWORDS, KeyEvent.keyCodeFromString("") + 32, objArr27);
        String strIntern14 = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        J((char) TextUtils.getOffsetAfter("", 0), 961 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 26 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr28);
        f22866k = new g(strIntern14, 13, ((String) objArr28[0]).intern());
        Object[] objArr29 = new Object[1];
        J((char) ExpandableListView.getPackedPositionGroup(0L), Process.getGidForName("") + 989, ExpandableListView.getPackedPositionGroup(0L) + 46, objArr29);
        String strIntern15 = ((String) objArr29[0]).intern();
        Object[] objArr30 = new Object[1];
        J((char) (1994 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1033 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 31, objArr30);
        f22870o = new g(strIntern15, 14, ((String) objArr30[0]).intern());
        Object[] objArr31 = new Object[1];
        J((char) (33756 - View.MeasureSpec.getSize(0)), 1065 - TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionType(0L) + 47, objArr31);
        String strIntern16 = ((String) objArr31[0]).intern();
        Object[] objArr32 = new Object[1];
        J((char) TextUtils.getOffsetAfter("", 0), ImageFormat.getBitsPerPixel(0) + 1113, 38 - TextUtils.indexOf("", "", 0, 0), objArr32);
        f22875t = new g(strIntern16, 15, ((String) objArr32[0]).intern());
        Object[] objArr33 = new Object[1];
        J((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1150 - View.combineMeasuredStates(0, 0), 54 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr33);
        String strIntern17 = ((String) objArr33[0]).intern();
        Object[] objArr34 = new Object[1];
        J((char) (52540 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1203, TextUtils.getTrimmedLength("") + 47, objArr34);
        f22871p = new g(strIntern17, 16, ((String) objArr34[0]).intern());
        Object[] objArr35 = new Object[1];
        J((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1251, (Process.myTid() >> 22) + 27, objArr35);
        String strIntern18 = ((String) objArr35[0]).intern();
        Object[] objArr36 = new Object[1];
        J((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), ((Process.getThreadPriority(0) + 20) >> 6) + 1278, 21 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr36);
        f22872q = new g(strIntern18, 17, ((String) objArr36[0]).intern());
        Object[] objArr37 = new Object[1];
        J((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.argb(0, 0, 0, 0) + 1300, 27 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr37);
        String strIntern19 = ((String) objArr37[0]).intern();
        Object[] objArr38 = new Object[1];
        J((char) (52056 - (ViewConfiguration.getTouchSlop() >> 8)), ExpandableListView.getPackedPositionChild(0L) + 1328, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, objArr38);
        f22874s = new g(strIntern19, 18, ((String) objArr38[0]).intern());
        Object[] objArr39 = new Object[1];
        J((char) View.MeasureSpec.getMode(0), 1341 - (ViewConfiguration.getScrollBarSize() >> 8), 30 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr39);
        String strIntern20 = ((String) objArr39[0]).intern();
        Object[] objArr40 = new Object[1];
        J((char) (36276 - ImageFormat.getBitsPerPixel(0)), (-16775844) - Color.rgb(0, 0, 0), 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr40);
        f22873r = new g(strIntern20, 19, ((String) objArr40[0]).intern());
        Object[] objArr41 = new Object[1];
        J((char) (57941 - TextUtils.lastIndexOf("", '0', 0)), 1386 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr41);
        String strIntern21 = ((String) objArr41[0]).intern();
        Object[] objArr42 = new Object[1];
        J((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32446), KeyEvent.keyCodeFromString("") + 1412, 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr42);
        f22876u = new g(strIntern21, 20, ((String) objArr42[0]).intern());
        Object[] objArr43 = new Object[1];
        J((char) (TextUtils.getCapsMode("", 0, 0) + 32699), KeyEvent.getDeadChar(0, 0) + 1430, 21 - TextUtils.getOffsetAfter("", 0), objArr43);
        String strIntern22 = ((String) objArr43[0]).intern();
        Object[] objArr44 = new Object[1];
        J((char) (54623 - TextUtils.indexOf("", "", 0, 0)), 1451 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.blue(0) + 22, objArr44);
        f22880y = new g(strIntern22, 21, ((String) objArr44[0]).intern());
        Object[] objArr45 = new Object[1];
        J((char) (AndroidCharacter.getMirror('0') - '0'), 1474 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 28 - TextUtils.getCapsMode("", 0, 0), objArr45);
        String strIntern23 = ((String) objArr45[0]).intern();
        Object[] objArr46 = new Object[1];
        J((char) (58643 - ((Process.getThreadPriority(0) + 20) >> 6)), MotionEvent.axisFromString("") + 1502, 32 - TextUtils.indexOf((CharSequence) "", '0'), objArr46);
        f22878w = new g(strIntern23, 22, ((String) objArr46[0]).intern());
        Object[] objArr47 = new Object[1];
        J((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.MeasureSpec.getSize(0) + 1534, 13 - (KeyEvent.getMaxKeyCode() >> 16), objArr47);
        String strIntern24 = ((String) objArr47[0]).intern();
        Object[] objArr48 = new Object[1];
        J((char) (Color.rgb(0, 0, 0) + 16817501), 1547 - (ViewConfiguration.getLongPressTimeout() >> 16), 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr48);
        f22877v = new g(strIntern24, 23, ((String) objArr48[0]).intern());
        Object[] objArr49 = new Object[1];
        J((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2616), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1560, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, objArr49);
        String strIntern25 = ((String) objArr49[0]).intern();
        Object[] objArr50 = new Object[1];
        J((char) (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1572, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, objArr50);
        f22879x = new g(strIntern25, 24, ((String) objArr50[0]).intern());
        Object[] objArr51 = new Object[1];
        J((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), ExpandableListView.getPackedPositionGroup(0L) + 1586, Color.green(0) + 10, objArr51);
        String strIntern26 = ((String) objArr51[0]).intern();
        Object[] objArr52 = new Object[1];
        J((char) Color.red(0), 1595 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, objArr52);
        A = new g(strIntern26, 25, ((String) objArr52[0]).intern());
        Object[] objArr53 = new Object[1];
        J((char) (((Process.getThreadPriority(0) + 20) >> 6) + 8880), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1606, 20 - TextUtils.lastIndexOf("", '0'), objArr53);
        String strIntern27 = ((String) objArr53[0]).intern();
        Object[] objArr54 = new Object[1];
        J((char) ((-1) - MotionEvent.axisFromString("")), 1628 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23, objArr54);
        f22881z = new g(strIntern27, 26, ((String) objArr54[0]).intern());
        Object[] objArr55 = new Object[1];
        J((char) (42312 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1651 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 27, objArr55);
        String strIntern28 = ((String) objArr55[0]).intern();
        Object[] objArr56 = new Object[1];
        J((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35734), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1679, View.resolveSize(0, 0) + 21, objArr56);
        D = new g(strIntern28, 27, ((String) objArr56[0]).intern());
        Object[] objArr57 = new Object[1];
        J((char) TextUtils.indexOf("", "", 0, 0), 1700 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 27 - TextUtils.getTrimmedLength(""), objArr57);
        String strIntern29 = ((String) objArr57[0]).intern();
        Object[] objArr58 = new Object[1];
        J((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 1726, 30 - Drawable.resolveOpacity(0, 0), objArr58);
        C = new g(strIntern29, 28, ((String) objArr58[0]).intern());
        F = d();
        int i2 = K + 121;
        N = i2 % 128;
        int i3 = i2 % 2;
    }

    private g(String str, int i2, String str2) {
        this.B = str2;
    }

    private static void J(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        int i5 = $10 + 67;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 % 3;
        }
        while (oVar.f19947b < i3) {
            int i7 = $11 + 89;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(G[i2 + i9])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getTapTimeout() >> 16) + 742, (char) Color.blue(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(H), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(765 - TextUtils.lastIndexOf("", '0', 0), (char) (12470 - View.resolveSize(0, 0)), TextUtils.lastIndexOf("", '0', 0) + 13, 1946853218, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(387 - (Process.myPid() >> 22), (char) TextUtils.indexOf("", "", 0), 17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 39570797, false, $$c(b6, b7, (byte) ((b7 + 6) - (6 & b7))), new Class[]{Object.class, Object.class});
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
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(388 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 18, 39570797, false, $$c(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i10 = $11 + 19;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    static void a() {
        char[] cArr = new char[1756];
        ByteBuffer.wrap("»¦ \u0090\u008d¤êµ×Ø<ô\u0019ó\u0006\u000ec#H4µJ\u0092VÿrÛ\u008dÀ\u008b-\u0085\nÂwÄ\\ß¹ú¦\u000e\u0083.è:ÕE2s\u001f^{\u008e`\u008fM²ªÑ\u0097ÖüêÙ\u000b\u0094³\u008f¥¢\u0091Å\u0091øì\u0013Ó6Ý)!L\u0002g\u0007\u009ac½cÐGô¸ï¾\u0002\u0081%ÿXçsÎ\u0096Ë\u00890¬\u001fÇ\u000búr\u0094³\u008f\u0085¢±Å øÍ\u0013á6æ)\u001bL6g!\u009a_½CÐgô\u0098ï\u009e\u0002\u009d%ÓXÔsþ\u0096Þ\u0089\u0010¬9Ç,úW\u001d~0cT¯O\u009eb¦\u0085×¸ÞÓû|±g§J\u0093-\u0093\u0010ãûÕÞÚÁ8¤\u000f\u008f\u0014rjUc8F\u001c½\u0007¤ê\u0099Íï°ñ\u009bÈ~Èa!D\u0000/\r\u0094³\u008f\u0085¢±Å øÍ\u0013á6æ)\u001bL6g!\u009a_½CÐgô\u0098ï\u009e\u0002\u0090%×XÒsí\u0096á\u0089\u0010¬=Ç&ú[\u001da0uT»O\u008db¶\u0085ß¸ÜÓÿö\u0006é\u000f\f5' Zm}x\u0090K´\u008e¯¢ÂªåÓ\u0018Í3ãV\u0002I\u0003l1\u0087\\ºeÝuð`\u0014\u008c\u000f³\"©EÊ=5&#\u000b\u0017l\u0017QjºG\u009f@\u0080§å\u0095Î\u00833è\u0014áyÒ]1F8«\u0011\u008c{ñnÚC?I ´\u0005\u0080n\u0093Sû´Û\u0099Îý2æ-Ë\u0007,dØ\u009cÃªî\u009e\u0089\u008f´â_ÎzÉe4\u0000\u0019+\u000eÖpñl\u009cH¸·£±N¿iø\u0014ý?ÂÚÎÅ?à\u0012\u008b\t¶tQN|Z\u0018\u0094\u0003¢.\u0099Éðôó\u009fÐº)¥ @\u001ak\u000f\u0016B1WÜdø¡ã\u008d\u008e\u0085©üTâ\u007fÌ\u001a-\u0005, \u001eËsöJ\u0091Z¼OX£C\u009cn\u0086\tå4êßÀú!å)\u00808«iVbqC\u001d¼8\u00ad#\u0090\u0094³\u008f¥¢\u0091Å\u0091øì\u0013Á6Æ)!L\u0013g\u0005\u009an½gÐTô·ï¾\u0002\u0097%ýXèsÅ\u0096Ï\u00892¬\u0006Ç\u0015ú}\u001d]0HT´O«b\u0081\u0085â¸õÓßö\"é6\f\u0005'\u001bZr}Q\u0090X´¿¯\u0096Â\u0083\u0094³\u008f\u0085¢±Å øÍ\u0013á6æ)\u001bL6g!\u009a_½CÐgô\u0098ï\u009e\u0002\u0090%×XÒsí\u0096á\u0089\u0010¬=Ç&ú[\u001da0uT»O\u008db¶\u0085ß¸ÜÓÿö\u0006é\u000f\f5' Zm}x\u0090Z´\u009f¯«Â«åß\u0018À3ö;Â Ô\ràjàW\u009d¼°\u0099·\u0086PãbÈt5\u001f\u0012\u0016\u007f%[Æ@Ï\u00adæ\u008a\u008c÷\u0099Ü´9¯&R\u0003~hvU\n²-\u009f#\u0014-\u000f\u001b\"/E>xS\u0093\u007f¶x©\u0085Ì¨ç¿\u001aÁ=ÝPùt\u0006o\u0000\u0082\u000e¥IØLós\u0016\u007f\t\u008e,£G¸zÅ\u009dÿ°ëÔ%Ï\u0013â(\u0005A8BSav\u0098i\u0091\u008c«§¾Úóýæ\u0010Ä4\u0001/5B5eA\u0098^³hÖ¿É\u009dì´\u0007Ä:í]ôp÷\u0094\u000e\u008f)¢0ÅE\u0000ü\u001bê6ÞQÞl£\u0087\u008e¢\u0089½nØ\\óJ\u000e!)(D\u001b`ø{ñ\u0096Ø±²Ì§ç\u008a\u0002\u0091\u001dl8@SHn4\u0089\u0013¤\u001dÀêÛàöÝ\u0011©,ºG\u0084bm}n\u0098G³@Î)é\u001c,\u00157#\u001a\u0017}\u0006@k«G\u008e@\u0091½ô\u0090ß\u0087\"ù\u0005åhÁL>W8º6\u009dqàtËK.G1¶\u0014\u009b\u007f\u0080Bý¥Ç\u0088Óì\u001d÷+Ú\u0010=y\u0000zkYN Q©´\u0093\u009f\u0086âËÅÞ(â\f7\u0017\u0000z\t]z a\u008bGî±ñ¸Ô\u0091?û\u0002îÄÕßÃò÷\u0095÷¨\u008aC§f yG\u001cu7cÊ\bí\u0001\u00802¤Ñ¿ØRñu\u009b\b\u008e#£Æ¦ÙKüd\u0097eª\u001eM=`#\u0004Ý\u001fÜ2íÕ\u009fè\u0082\u0094³\u008f\u0085¢±Å øÍ\u0013á6æ)\u001bL6g!\u009a_½CÐgô\u0098ï\u009e\u0002\u0090%×XÒsí\u0096á\u0089\u0010¬=Ç&ú[\u001da0uT»O\u008db¶\u0085ß¸ÜÓÿö\u0006é\u000f\f5' Zm}x\u0090D´\u0091¯¦Â¯åÜ\u0018Ç3áV\u0017I\u001el7\u0087]ºHÝMðg\u0014\u0096\u000f¾\"\u009fEÎxõ\u0093ô¶\u001b©\nÌ'>s%e\bQoQR,¹\u0001\u009c\u0006\u0083áæÓÍÅ0®\u0017§z\u0094^wE~¨W\u008f=ò(Ù\u0005<\u0000#í\u0006ÂmÃP¸·\u009b\u009a\u0085þ{åzÈK/9\u0012$y\u0001\\çCö¦Ý\u008dÜð£×\u0092:\u008fËGÐqýE\u009aT§9L\u0015i\u0012vï\u0013Â8ÕÅ«â·\u008f\u0093«l°j]iz)\u0007<,\rÉ\u0016ÖãóÑ\u0098×¥¼B\u0083o±\u000bf\u0010\u007f=UÚ)ç\n\u008c\u0018©ç¶üSÝxÛ\u0005µ\"\u0096Ï\u0097ëeðH\u009d}º;G.l\u0015\tí\u0016ó3ÏÙAÂWïc\u0088cµ\u0013^+{6dÏ\u0001ì*á×\u009bð\u0095\u009d¦¹A¢GOoh\u0014\u0015\u001b\u0094³\u008f\u0085¢±Å øÍ\u0013á6æ)\u001bL6g!\u009a_½CÐgô\u0098ï\u009e\u0002\u0097%ÜXÅsõ\u0096à\u0089\u0001¬:Ç?úM\u001d{0pT\u009fO\u00adbª\u0085Ó¸ÉÓõö&é\u0014\f;' ZQ}w\u0090i´\u008a¯»Â©åÔ\u0018á3÷V\u0002I\tl1\u0087_ºCB\u0086Y\u0090t¤\u0013¤.ÞÅíàüÿ\u0004\u009a)±0LCkN\u0006d\"\u008a9\u0089Ô®óØ\u008eÐ¥û@ôrZilDX#I\u001e$õ\bÐ\u000fÏòªß\u0081È|¶[ª6\u008e\u0012q\twägÃ)¾ \u0095\u0005p\u000eoøJÖ!Ì\u001c¹û¯Ö\u0080²x©b\u0084EyTbBOv(v\u0015\u0015þ#Û\"ÄÏ¡ü\u008aòw\u0094P\u0086=«\u0019N\u0002YïvÈ\u001eµ\u0004\u009e3\u0094 \u008f\u0083¢®Å¼øÛ\u0013Å6þ)\fL3g2\u009a_½IÐ{ô¸ï\u0085\u0002¬%ßXÇsö\u0094 \u008f£¢\u008eÅ\u009cøû\u0013É6Ä)1L\u0000g\u000b\u009a{½bd\r\u007f.R\u00035\u0011\bvãhÆSÙ¡¼\u009e\u0097\u009fjòMä Ö\u0004\u0015\u001f(ò\u0001Õr¨j\u0083[fmyª\\\u008f7\u0090\nüíÍÀÀ¤\u0019¿,\u0092\u001buZHq#R\u0006¶\u0019§ü\u0096×\u0081ªã\u008dÞ\u0094 \u008f£¢\u008eÅ\u009cøû\u0013É6Ä)1L\u0000g\u000b\u009a{½bÐ]ô¸ï¥\u0002\u0081%üXãsÎ\u0096Ù\u0089-¬\u0004Ç\u0001\u0094 \u008f\u0083¢®Å¼øÛ\u0013Å6þ)\fL3g2\u009a_½IÐ{ô³ï\u0092\u0002®%×XÅsî\u0096ç\u0089\f¬1Ç\u0001ú[\u001dk0TT\u009fO\u0088b°\u0085Ó¸ÙÓö\u0094 \u008f£¢\u008eÅ\u009cøû\u0013É6Ï)&L\u0002g\u0003\u009ay½zÐKô¸ï\u00ad\u0002\u0081%ùXãsÃ\u0096Ñ\u00890¬\u0013Ç\fúl\u001dW0UT²\u0094 \u008f\u0083¢®Å¼øÛ\u0013Å6þ)\fL3g2\u009a_½IÐ{ô³ï\u0092\u0002®%×XÅsî\u0096ç\u0089\f¬1Ç\u0001ú[\u001dk0TT\u009fO\u0088b°\u0085Ó¸ÙÓöö4é\t\f('\u001aZP}w\u0090d´\u008d¯³Â¥åÎ\u0018Ç3íV\u0018\u0093j\u0088i¥DÂVÿ1\u0014\u00031\u0005.ìKÈ`É\u009d³º°×\u0081órèg\u0005K\"3_)t\t\u0091\u001b\u008eú«ÙÀÆý¦\u001a\u009d7\u009fSxH{e\\\u0082.¿8\u0017|\f_!rF`{\u0007\u0090\u0019µ\"ªÐÏïäî\u0019\u0083>\u0095S§wolN\u0081r¦\u000bÛ\u0019ð2\u0015;\nÐ/íDÝy\u0087\u009e·³\u0088×CÌTál\u0006\u000f;\u0005P*uïjÜ\u008fò¤÷Ù\u008cþ\u008b\u0013µ7V,gAlf\u0007\u009b\u0006°7ÕÅÊØ\u0094 \u008f£¢\u008eÅ\u009cøû\u0013É6Ï)&L\u0002g\u0003\u009ay½zÐKô¸ï\u00ad\u0002\u0081%ùXãsÃ\u0096Ñ\u00890¬\u0013Ç\fúl\u001dW0UT²O±b\u0083\u0085õ¸þÓ×ö$é'\f\u000e'\u0007Zm}X\u0094 \u008f\u0083¢®Å¼øÛ\u0013Å6þ)\fL3g2\u009a_½IÐ{ô³ï\u0092\u0002®%×XÅsî\u0096ç\u0089\f¬1Ç\u0001ú[\u001dk0TT\u009fO\u0088b°\u0085Ó¸ÙÓöö3é\u0000\f.'+ZP}U\u0090k´\u008c¯¶Â\u0096åÈ\u0018Á3äV\u001fI\u0006l;\u0087gºVÝ~ðo\u0014\u0096\u000f³Y\u009cB\u009fo²\b 5ÇÞõûóä\u001a\u0081>ª?WEpF\u001dw9\u0084\"\u0091Ï½èÅ\u0095ß¾ÿ[íD\fa/\n07PÐkýi\u0099\u008e\u0082\u008d¯½HËuÄ\u001eæ;\u0011$\nÁ4ê=\u0097X°c]zy\u0087b±\u000f¯(ÖÕÖþÿ\u009b\u001e\u0084\u0013\u0094 \u008f\u0083¢®Å¼øÛ\u0013Å6þ)\fL3g2\u009a_½IÐ{ô¡ï\u008b\u0002·%ÆXÏsô\u0096é\u00891¬?Ç'ú}\u001ds0tT\u009e\u0094 \u008f£¢\u008eÅ\u009cøû\u0013É6Ý)?L\u001bg\u0012\u009as½`ÐEô©ï¹\u0002\u0097%ÿXùsÙ\u0096Ï\u00890¬\u0012\u0094°\u008f\u008a¢µÅ\u00adøÉ\u0013ó6î)4L=g$\u009a|½OÐkô\u009aï\u008f\u0002º%æXÔsû\u0096à\u0089\u0011¬7Ç)úJ\u001d{0iT\u0094_èDòiÍ\u000eÕ3±Ø\u008bý\u0096ây\u0087A¬QQ=v\"\u001b\b?ö\u0094°\u008f\u008a¢µÅ\u00adøÉ\u0013ó6î)4L=g$\u009ai½[Ðaô\u0095ï\u008f\u0002\u00ad%ÁXÀsï\u0096â\u00896¬$Ç+úP\u001da0gT\u0099O\u009ab«\u0085Ù¸Ä\u0019\u0005\u0002\u001f/ H8u\\\u009ef»{¤\u0094Á¨ê¸\u0017Ð0Ï]åy\u001bvæmÜ@ã'û\u001a\u009fñ¥Ô¸Ëb®k\u0085rx>_\u001d29\u0016Ï\rÈàíÇ©º\u0091\u0091¢t¹kSNe%q\u0018\rÿ*Ò$ê\rñ\u0017Ü(»0\u0086TmnHsW\u009c2½\u0019¾äÊÃÜ®ë\u008a\u000e\u0091\b|.[H&Oë\u0019ð/Ý\u000eº\u0011\u0087llNIEV\u008c3\u0087\u0018\u0094åõÂü¯Ø\u008b!\u00908}\u001fZh'i\fHéZö·AýZëwÊ\u0010Õ-¨Æ\u008aã\u0081ü~\u0099D²WO,h%\u0005\u0014!è:ù×Èð·\u008d¸¦\u0091C\u0098\\ryG\u0094·\u008f\u008b¢¬Å\u008føÒ\u0013æ6Ø)\u001bL3g\"\u009aC½hÐmô\u0084ïº\u0002¬%ÝXÐsó\u0096ý\u0089\u000b¬9Ç$új\u001d}0mT\u009fO\u0080q¤j¸G\u009f \u0082\u001dðöÕÓÉÌ2©\u0013\u0082\u0010\u007fhXy5H\u0011º\n¿ç\u0082Àó½ê\u0096ÙsÏl>I\u0013\"\u0010\u001f~øHÕZ±§ª¢\u0087\u0085`ê]ò6È\u0013/\u0094¡\u008f\u0083¢¨Å¸øÇ\u0013ä6Ø)\u001bL#g3\u009a_½]Ðv\tü\u0012þ?ÕXÅeº\u008e\u0099«\u0088´qÑJúJ\u00072 6M\fiÿ\u009e\u008e\u0085»¨\u0094Ï\u009fòù\u0019Ë<à##F\bm\u0011\u0090m·b\u0094¶\u008f£¢\u008cÅ\u0087øá\u0013Ó6Õ),L\u0017g\u0004\u009au½aÐV\u0094¡\u008f\u009f¢©ÅºøÇ\u0013û6Á)\u0017L>g*\u0094¡\u008f¿¢\u0089Å\u009aøç\u0013Û6Õ)5L\u001bg\n\u009av¶\u0010\u00ad9\u0080\u0005ç\nÚW1K\u0014O\u000b¢n\u0083E\u0082¸å\u009fìòöÖ#Í. \u000b\u0007azbQC´Q«¼\u0094 \u008f©¢\u0095Å\u009aøý\u0013Ó6Ç)+L\u001eg\u0007\u009an½aÐPô©ï®\u0002\u009b%æXãsÙ\u0096Ú\u0089+¬\u0019Ç\u00041ê*Û\u0007á`î]¤¶±\u0093¶\u008c_é|Âg?\u0011\u0018\u0007u>Q×JÍ§ø\u0080®ý\u0081Ö¹3£,D\tKbr_\u0012¸;\u0095:ñ×\u001f\"\u00049)\u001eN\u001dsv\u0098A½O¢\u00adÇ\u009bì\u0084\u0011ã6ó[Ñ\u007f.d#\u0089\u001d®tÓtøM\u001dL\u0002±\u0094´\u008f\u0083¢®Å\u00adøÊ\u0013Ò6ã)\u0019L;g2\u009a[½BÐAô\u0097ï\u0098\u0002º%ûXÈsü\u0096á\u0089\u0010¬;Ç+úJ\u001d{0iT\u0094\u0094´\u008f£¢\u008eÅ\u008døê\u0013É6Î)7L\u0015g\u000f\u009an½oÐNô©ï©\u0002\u009f%àXâsÅ\u0096Ç\u0089,¬\u0010Ç\u0005úl\u001d_0GT®O§b\u008d\u0085ø".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1756);
        G = cArr;
        H = 4031424175892238310L;
    }

    public static g d(String str) {
        int i2 = 2 % 2;
        if (str == null) {
            return null;
        }
        g[] gVarArrValues = values();
        int length = gVarArrValues.length;
        int i3 = 0;
        while (i3 < length) {
            g gVar = gVarArrValues[i3];
            if (gVar.B.equals(str)) {
                int i4 = I + 37;
                E = i4 % 128;
                int i5 = i4 % 2;
                return gVar;
            }
            i3++;
            int i6 = E + 55;
            I = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = I + 107;
        E = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    private static /* synthetic */ g[] d() {
        int i2 = 2 % 2;
        int i3 = I + 31;
        int i4 = i3 % 128;
        E = i4;
        int i5 = i3 % 2;
        g[] gVarArr = {f22858c, f22859d, f22857b, f22860e, f22856a, f22861f, f22862g, f22864i, f22863h, f22865j, f22868m, f22869n, f22867l, f22866k, f22870o, f22875t, f22871p, f22872q, f22874s, f22873r, f22876u, f22880y, f22878w, f22877v, f22879x, A, f22881z, D, C};
        int i6 = i4 + 97;
        I = i6 % 128;
        if (i6 % 2 == 0) {
            return gVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{60, -17, 3, Ascii.NAK};
        $$b = 231;
    }

    public static g valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = E + 23;
        I = i3 % 128;
        int i4 = i3 % 2;
        g gVar = (g) Enum.valueOf(g.class, str);
        if (i4 != 0) {
            int i5 = 33 / 0;
        }
        int i6 = E + 107;
        I = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 0 / 0;
        }
        return gVar;
    }

    public static g[] values() {
        int i2 = 2 % 2;
        int i3 = E + 55;
        I = i3 % 128;
        int i4 = i3 % 2;
        g[] gVarArr = (g[]) F.clone();
        int i5 = E + 85;
        I = i5 % 128;
        int i6 = i5 % 2;
        return gVarArr;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i2 = 2 % 2;
        int i3 = I + 41;
        int i4 = i3 % 128;
        E = i4;
        int i5 = i3 % 2;
        String str = this.B;
        int i6 = i4 + 3;
        I = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
