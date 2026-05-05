package com.incode.welcome_sdk.data.e;

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
import com.c.a.g;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f7642c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f7643f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f7644g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f7645h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f7646i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f7647j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f7648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7649b = 8192;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f7650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f7651e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, byte r9, int r10) {
        /*
            byte[] r7 = com.incode.welcome_sdk.data.e.b.$$a
            int r6 = r8 + 4
            int r1 = r9 * 4
            int r0 = 1 - r1
            int r5 = r10 + 113
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r7 != 0) goto L28
            r1 = r3
            r0 = r6
        L13:
            int r6 = r6 + r5
            r5 = r6
            r6 = r0
        L16:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r2) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L21:
            int r0 = r6 + 1
            r6 = r7[r0]
            int r1 = r1 + 1
            goto L13
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.e.b.$$c(int, byte, int):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ESC, -99, -92, 1};
        $$b = 114;
    }

    public b() throws Throwable {
        Object[] objArr = new Object[1];
        k(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 41931), objArr);
        this.f7650d = ((String) objArr[0]).intern();
        this.f7651e = "";
        Object[] objArr2 = new Object[1];
        k((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 44 - Color.green(0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
        Object[] objArr3 = new Object[1];
        k(45 - Drawable.resolveOpacity(0, 0), (Process.myPid() >> 22) + 44, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr3);
        Object[] objArr4 = new Object[1];
        k((Process.myTid() >> 22) + 89, TextUtils.indexOf((CharSequence) "", '0') + 45, (char) (53782 - View.resolveSize(0, 0)), objArr4);
        Object[] objArr5 = new Object[1];
        k(134 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 45, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29025), objArr5);
        Object[] objArr6 = new Object[1];
        k(KeyEvent.keyCodeFromString("") + 177, 44 - (ViewConfiguration.getEdgeSlop() >> 16), (char) TextUtils.getCapsMode("", 0, 0), objArr6);
        Object[] objArr7 = new Object[1];
        k((ViewConfiguration.getTouchSlop() >> 8) + 221, 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 23760), objArr7);
        Object[] objArr8 = new Object[1];
        k(264 - TextUtils.lastIndexOf("", '0'), (Process.myPid() >> 22) + 44, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34597), objArr8);
        Object[] objArr9 = new Object[1];
        k(View.getDefaultSize(0, 0) + 309, (ViewConfiguration.getScrollBarSize() >> 8) + 44, (char) (22319 - TextUtils.lastIndexOf("", '0', 0)), objArr9);
        Object[] objArr10 = new Object[1];
        k((ViewConfiguration.getScrollBarSize() >> 8) + 353, TextUtils.indexOf((CharSequence) "", '0') + 45, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 64805), objArr10);
        Object[] objArr11 = new Object[1];
        k(396 - TextUtils.indexOf((CharSequence) "", '0'), 44 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 44746), objArr11);
        Object[] objArr12 = new Object[1];
        k(441 - KeyEvent.keyCodeFromString(""), 43 - MotionEvent.axisFromString(""), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr12);
        Object[] objArr13 = new Object[1];
        k(485 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 45, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr13);
        Object[] objArr14 = new Object[1];
        k(528 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, (char) TextUtils.getOffsetAfter("", 0), objArr14);
        Object[] objArr15 = new Object[1];
        k(MotionEvent.axisFromString("") + IptcDirectory.TAG_DIGITAL_DATE_CREATED, (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, (char) View.combineMeasuredStates(0, 0), objArr15);
        Object[] objArr16 = new Object[1];
        k((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + IptcDirectory.TAG_HEADLINE, View.MeasureSpec.getMode(0) + 44, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43851), objArr16);
        Object[] objArr17 = new Object[1];
        k((ViewConfiguration.getEdgeSlop() >> 16) + 661, (ViewConfiguration.getWindowTouchSlop() >> 8) + 44, (char) (Color.red(0) + 22763), objArr17);
        Object[] objArr18 = new Object[1];
        k(KeyEvent.normalizeMetaState(0) + TypedValues.TransitionType.TYPE_INTERPOLATOR, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, (char) View.resolveSize(0, 0), objArr18);
        Object[] objArr19 = new Object[1];
        k(749 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47132), objArr19);
        Object[] objArr20 = new Object[1];
        k((ViewConfiguration.getKeyRepeatDelay() >> 16) + 793, 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), objArr20);
        Object[] objArr21 = new Object[1];
        k(837 - (ViewConfiguration.getTapTimeout() >> 16), Color.green(0) + 44, (char) (MotionEvent.axisFromString("") + 30544), objArr21);
        Object[] objArr22 = new Object[1];
        k((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 881, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), objArr22);
        Object[] objArr23 = new Object[1];
        k((Process.myPid() >> 22) + 925, '\\' - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr23);
        Object[] objArr24 = new Object[1];
        k(969 - View.MeasureSpec.makeMeasureSpec(0, 0), View.combineMeasuredStates(0, 0) + 44, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr24);
        Object[] objArr25 = new Object[1];
        k(1013 - (ViewConfiguration.getFadingEdgeLength() >> 16), 43 - MotionEvent.axisFromString(""), (char) TextUtils.getOffsetAfter("", 0), objArr25);
        Object[] objArr26 = new Object[1];
        k((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + PhotoshopDirectory.TAG_VERSION, 44 - Color.blue(0), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr26);
        Object[] objArr27 = new Object[1];
        k(1101 - (ViewConfiguration.getPressedStateDuration() >> 16), 44 - Color.argb(0, 0, 0, 0), (char) TextUtils.getOffsetBefore("", 0), objArr27);
        Object[] objArr28 = new Object[1];
        k(TextUtils.indexOf("", "", 0) + 1145, (Process.myPid() >> 22) + 44, (char) (48329 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr28);
        Object[] objArr29 = new Object[1];
        k(ImageFormat.getBitsPerPixel(0) + 1190, 43 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr29);
        Object[] objArr30 = new Object[1];
        k(1234 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777260, (char) View.resolveSize(0, 0), objArr30);
        Object[] objArr31 = new Object[1];
        k((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1277, 44 - Drawable.resolveOpacity(0, 0), (char) (35372 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr31);
        Object[] objArr32 = new Object[1];
        k(1321 - TextUtils.indexOf("", "", 0), TextUtils.lastIndexOf("", '0', 0, 0) + 45, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18077), objArr32);
        Object[] objArr33 = new Object[1];
        k((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1365, 43 - TextUtils.indexOf((CharSequence) "", '0'), (char) (50961 - ExpandableListView.getPackedPositionChild(0L)), objArr33);
        Object[] objArr34 = new Object[1];
        k((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1409, 44 - View.getDefaultSize(0, 0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr34);
        Object[] objArr35 = new Object[1];
        k(1454 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 44, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54126), objArr35);
        Object[] objArr36 = new Object[1];
        k(1498 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 44 - View.MeasureSpec.getSize(0), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 28075), objArr36);
        Object[] objArr37 = new Object[1];
        k(1589 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 2932), objArr37);
        Object[] objArr38 = new Object[1];
        k(TextUtils.getOffsetAfter("", 0) + 1585, 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (48361 - ExpandableListView.getPackedPositionType(0L)), objArr38);
        Object[] objArr39 = new Object[1];
        k(TextUtils.getOffsetAfter("", 0) + 1629, TextUtils.indexOf((CharSequence) "", '0', 0) + 45, (char) (TextUtils.lastIndexOf("", '0') + 1), objArr39);
        Object[] objArr40 = new Object[1];
        k(1721 - AndroidCharacter.getMirror('0'), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, (char) KeyEvent.keyCodeFromString(""), objArr40);
        Object[] objArr41 = new Object[1];
        k(1717 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "", 0) + 44, (char) (10963 - (ViewConfiguration.getTouchSlop() >> 8)), objArr41);
        Object[] objArr42 = new Object[1];
        k(1761 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, (char) (View.resolveSize(0, 0) + 16819), objArr42);
        Object[] objArr43 = new Object[1];
        k(1805 - Color.argb(0, 0, 0, 0), 43 - TextUtils.indexOf((CharSequence) "", '0'), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr43);
        Object[] objArr44 = new Object[1];
        k(TextUtils.getTrimmedLength("") + 1849, 44 - View.MeasureSpec.getSize(0), (char) (MotionEvent.axisFromString("") + 6274), objArr44);
        Object[] objArr45 = new Object[1];
        k((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1893, 44 - Color.blue(0), (char) View.MeasureSpec.getMode(0), objArr45);
        Object[] objArr46 = new Object[1];
        k(1936 - TextUtils.indexOf((CharSequence) "", '0'), 43 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr46);
        Object[] objArr47 = new Object[1];
        k(TextUtils.indexOf("", "") + 1981, 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr47);
        Object[] objArr48 = new Object[1];
        k(2025 - KeyEvent.getDeadChar(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 44, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr48);
        Object[] objArr49 = new Object[1];
        k(TextUtils.indexOf("", "") + 2069, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, (char) Color.green(0), objArr49);
        Object[] objArr50 = new Object[1];
        k(2114 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 44 - TextUtils.getTrimmedLength(""), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2647), objArr50);
        Object[] objArr51 = new Object[1];
        k(2157 - View.MeasureSpec.getMode(0), 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr51);
        Object[] objArr52 = new Object[1];
        k(KeyEvent.normalizeMetaState(0) + 2201, 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr52);
        Object[] objArr53 = new Object[1];
        k(((Process.getThreadPriority(0) + 20) >> 6) + 2245, 44 - ExpandableListView.getPackedPositionType(0L), (char) TextUtils.indexOf("", "", 0, 0), objArr53);
        Object[] objArr54 = new Object[1];
        k(2289 - ExpandableListView.getPackedPositionType(0L), View.resolveSizeAndState(0, 0, 0) + 44, (char) ExpandableListView.getPackedPositionType(0L), objArr54);
        Object[] objArr55 = new Object[1];
        k(2333 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29716), objArr55);
        Object[] objArr56 = new Object[1];
        k(2378 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.red(0) + 44, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), objArr56);
        Object[] objArr57 = new Object[1];
        k(View.MeasureSpec.getMode(0) + 2421, 44 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr57);
        Object[] objArr58 = new Object[1];
        k(2465 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, (char) (41542 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr58);
        Object[] objArr59 = new Object[1];
        k(2509 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf("", "", 0) + 44, (char) (49252 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr59);
        Object[] objArr60 = new Object[1];
        k((ViewConfiguration.getTouchSlop() >> 8) + 2553, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, (char) (42581 - ExpandableListView.getPackedPositionGroup(0L)), objArr60);
        Object[] objArr61 = new Object[1];
        k(2596 - TextUtils.lastIndexOf("", '0'), View.resolveSizeAndState(0, 0, 0) + 44, (char) KeyEvent.getDeadChar(0, 0), objArr61);
        Object[] objArr62 = new Object[1];
        k((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2640, 44 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr62);
        Object[] objArr63 = new Object[1];
        k(2685 - Gravity.getAbsoluteGravity(0, 0), 43 - ExpandableListView.getPackedPositionChild(0L), (char) (48195 - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr63);
        Object[] objArr64 = new Object[1];
        k((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2728, 43 - Process.getGidForName(""), (char) View.resolveSizeAndState(0, 0, 0), objArr64);
        Object[] objArr65 = new Object[1];
        k(View.getDefaultSize(0, 0) + 2773, ((byte) KeyEvent.getModifierMetaStateMask()) + 45, (char) (8290 - View.combineMeasuredStates(0, 0)), objArr65);
        Object[] objArr66 = new Object[1];
        k(TextUtils.indexOf("", "", 0) + 2817, TextUtils.lastIndexOf("", '0') + 45, (char) TextUtils.indexOf("", "", 0, 0), objArr66);
        Object[] objArr67 = new Object[1];
        k((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2861, 44 - (ViewConfiguration.getTapTimeout() >> 16), (char) (TextUtils.indexOf("", "", 0) + 38039), objArr67);
        Object[] objArr68 = new Object[1];
        k(Color.rgb(0, 0, 0) + 16780121, 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr68);
        Object[] objArr69 = new Object[1];
        k((ViewConfiguration.getFadingEdgeLength() >> 16) + 2949, 44 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5104), objArr69);
        Object[] objArr70 = new Object[1];
        k((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2993, KeyEvent.keyCodeFromString("") + 44, (char) Color.red(0), objArr70);
        Object[] objArr71 = new Object[1];
        k(Color.argb(0, 0, 0, 0) + 3037, 44 - Color.green(0), (char) (63339 - Drawable.resolveOpacity(0, 0)), objArr71);
        Object[] objArr72 = new Object[1];
        k(3081 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44, (char) (13742 - Process.getGidForName("")), objArr72);
        Object[] objArr73 = new Object[1];
        k(3124 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr73);
        Object[] objArr74 = new Object[1];
        k(3169 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.resolveSize(0, 0) + 44, (char) Color.blue(0), objArr74);
        Object[] objArr75 = new Object[1];
        k(3212 - TextUtils.lastIndexOf("", '0', 0, 0), 44 - View.resolveSizeAndState(0, 0, 0), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10627), objArr75);
        Object[] objArr76 = new Object[1];
        k(3257 - ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr76);
        Object[] objArr77 = new Object[1];
        k(3300 - Process.getGidForName(""), (Process.myPid() >> 22) + 44, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr77);
        Object[] objArr78 = new Object[1];
        k(TextUtils.indexOf("", "", 0) + 3345, View.combineMeasuredStates(0, 0) + 44, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr78);
        Object[] objArr79 = new Object[1];
        k(3389 - TextUtils.indexOf("", "", 0, 0), 44 - KeyEvent.normalizeMetaState(0), (char) (Process.getGidForName("") + 1), objArr79);
        Object[] objArr80 = new Object[1];
        k(3433 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 44 - Drawable.resolveOpacity(0, 0), (char) Color.green(0), objArr80);
        Object[] objArr81 = new Object[1];
        k((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3477, 43 - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr81);
        Object[] objArr82 = new Object[1];
        k((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3520, 44 - View.resolveSize(0, 0), (char) ((-16769023) - Color.rgb(0, 0, 0)), objArr82);
        Object[] objArr83 = new Object[1];
        k(3564 - TextUtils.lastIndexOf("", '0', 0), ExpandableListView.getPackedPositionGroup(0L) + 44, (char) (34201 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr83);
        Object[] objArr84 = new Object[1];
        k(3608 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43, (char) (60803 - TextUtils.indexOf("", "", 0)), objArr84);
        Object[] objArr85 = new Object[1];
        k(3653 - KeyEvent.keyCodeFromString(""), TextUtils.getCapsMode("", 0, 0) + 44, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr85);
        Object[] objArr86 = new Object[1];
        k(TextUtils.getOffsetAfter("", 0) + 3697, TextUtils.indexOf("", "") + 44, (char) TextUtils.indexOf("", "", 0), objArr86);
        Object[] objArr87 = new Object[1];
        k(3741 - TextUtils.getOffsetBefore("", 0), '\\' - AndroidCharacter.getMirror('0'), (char) View.getDefaultSize(0, 0), objArr87);
        Object[] objArr88 = new Object[1];
        k(3784 - TextUtils.indexOf((CharSequence) "", '0', 0), View.MeasureSpec.getMode(0) + 44, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr88);
        Object[] objArr89 = new Object[1];
        k((ViewConfiguration.getDoubleTapTimeout() >> 16) + 3829, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 39885), objArr89);
        Object[] objArr90 = new Object[1];
        k(View.MeasureSpec.makeMeasureSpec(0, 0) + 3873, ((byte) KeyEvent.getModifierMetaStateMask()) + 45, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 18932), objArr90);
        Object[] objArr91 = new Object[1];
        k(TextUtils.indexOf("", "", 0, 0) + 3917, ((Process.getThreadPriority(0) + 20) >> 6) + 44, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr91);
        Object[] objArr92 = new Object[1];
        k((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3961, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, (char) (24444 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr92);
        Object[] objArr93 = new Object[1];
        k(4005 - KeyEvent.keyCodeFromString(""), ExpandableListView.getPackedPositionGroup(0L) + 44, (char) Color.argb(0, 0, 0, 0), objArr93);
        Object[] objArr94 = new Object[1];
        k((ViewConfiguration.getTouchSlop() >> 8) + 4049, 44 - TextUtils.indexOf("", "", 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 53607), objArr94);
        Object[] objArr95 = new Object[1];
        k(4092 - MotionEvent.axisFromString(""), 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr95);
        Object[] objArr96 = new Object[1];
        k(4137 - ExpandableListView.getPackedPositionGroup(0L), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44, (char) (17413 - (ViewConfiguration.getTouchSlop() >> 8)), objArr96);
        Object[] objArr97 = new Object[1];
        k(4181 - Color.green(0), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr97);
        Object[] objArr98 = new Object[1];
        k((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4225, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44, (char) (28391 - Gravity.getAbsoluteGravity(0, 0)), objArr98);
        Object[] objArr99 = new Object[1];
        k(4268 - MotionEvent.axisFromString(""), 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (45990 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr99);
        Object[] objArr100 = new Object[1];
        k(View.getDefaultSize(0, 0) + 4313, 44 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr100);
        Object[] objArr101 = new Object[1];
        k(KeyEvent.normalizeMetaState(0) + 4357, View.MeasureSpec.makeMeasureSpec(0, 0) + 44, (char) Color.alpha(0), objArr101);
        this.f7648a = new String[]{((String) objArr2[0]).intern(), ((String) objArr3[0]).intern(), ((String) objArr4[0]).intern(), ((String) objArr5[0]).intern(), ((String) objArr6[0]).intern(), ((String) objArr7[0]).intern(), ((String) objArr8[0]).intern(), ((String) objArr9[0]).intern(), ((String) objArr10[0]).intern(), ((String) objArr11[0]).intern(), ((String) objArr12[0]).intern(), ((String) objArr13[0]).intern(), ((String) objArr14[0]).intern(), ((String) objArr15[0]).intern(), ((String) objArr16[0]).intern(), ((String) objArr17[0]).intern(), ((String) objArr18[0]).intern(), ((String) objArr19[0]).intern(), ((String) objArr20[0]).intern(), ((String) objArr21[0]).intern(), ((String) objArr22[0]).intern(), ((String) objArr23[0]).intern(), ((String) objArr24[0]).intern(), ((String) objArr25[0]).intern(), ((String) objArr26[0]).intern(), ((String) objArr27[0]).intern(), ((String) objArr28[0]).intern(), ((String) objArr29[0]).intern(), ((String) objArr30[0]).intern(), ((String) objArr31[0]).intern(), ((String) objArr32[0]).intern(), ((String) objArr33[0]).intern(), ((String) objArr34[0]).intern(), ((String) objArr35[0]).intern(), ((String) objArr36[0]).intern(), ((String) objArr37[0]).intern(), ((String) objArr38[0]).intern(), ((String) objArr39[0]).intern(), ((String) objArr40[0]).intern(), ((String) objArr41[0]).intern(), ((String) objArr42[0]).intern(), ((String) objArr43[0]).intern(), ((String) objArr44[0]).intern(), ((String) objArr45[0]).intern(), ((String) objArr46[0]).intern(), ((String) objArr47[0]).intern(), ((String) objArr48[0]).intern(), ((String) objArr49[0]).intern(), ((String) objArr50[0]).intern(), ((String) objArr51[0]).intern(), ((String) objArr52[0]).intern(), ((String) objArr53[0]).intern(), ((String) objArr54[0]).intern(), ((String) objArr55[0]).intern(), ((String) objArr56[0]).intern(), ((String) objArr57[0]).intern(), ((String) objArr58[0]).intern(), ((String) objArr59[0]).intern(), ((String) objArr60[0]).intern(), ((String) objArr61[0]).intern(), ((String) objArr62[0]).intern(), ((String) objArr63[0]).intern(), ((String) objArr64[0]).intern(), ((String) objArr65[0]).intern(), ((String) objArr66[0]).intern(), ((String) objArr67[0]).intern(), ((String) objArr68[0]).intern(), ((String) objArr69[0]).intern(), ((String) objArr70[0]).intern(), ((String) objArr71[0]).intern(), ((String) objArr72[0]).intern(), ((String) objArr73[0]).intern(), ((String) objArr74[0]).intern(), ((String) objArr75[0]).intern(), ((String) objArr76[0]).intern(), ((String) objArr77[0]).intern(), ((String) objArr78[0]).intern(), ((String) objArr79[0]).intern(), ((String) objArr80[0]).intern(), ((String) objArr81[0]).intern(), ((String) objArr82[0]).intern(), ((String) objArr83[0]).intern(), ((String) objArr84[0]).intern(), ((String) objArr85[0]).intern(), ((String) objArr86[0]).intern(), ((String) objArr87[0]).intern(), ((String) objArr88[0]).intern(), ((String) objArr89[0]).intern(), ((String) objArr90[0]).intern(), ((String) objArr91[0]).intern(), ((String) objArr92[0]).intern(), ((String) objArr93[0]).intern(), ((String) objArr94[0]).intern(), ((String) objArr95[0]).intern(), ((String) objArr96[0]).intern(), ((String) objArr97[0]).intern(), ((String) objArr98[0]).intern(), ((String) objArr99[0]).intern(), ((String) objArr100[0]).intern(), ((String) objArr101[0]).intern()};
    }

    private static void k(int i2, int i3, char c2, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        g gVar = new g();
        long[] jArr = new long[i3];
        gVar.f2752c = 0;
        while (gVar.f2752c < i3) {
            int i5 = gVar.f2752c;
            try {
                Object[] objArr2 = {Integer.valueOf(f7642c[i2 + i5])};
                Object objC = com.c.a.e.e.c(-542847437);
                if (objC == null) {
                    char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int deadChar = 19 - KeyEvent.getDeadChar(0, 0);
                    int doubleTapTimeout = 1028 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b2 = (byte) (-$$a[3]);
                    byte b3 = (byte) (b2 + 1);
                    objC = com.c.a.e.e.e(c3, deadChar, doubleTapTimeout, -549532598, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objC).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f7646i), Integer.valueOf(c2)};
                Object objC2 = com.c.a.e.e.c(1506450485);
                if (objC2 == null) {
                    char packedPositionType = (char) (60521 - ExpandableListView.getPackedPositionType(0L));
                    int iAlpha = Color.alpha(0) + 20;
                    int keyRepeatTimeout = 922 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b4 = $$a[3];
                    byte b5 = (byte) (-b4);
                    objC2 = com.c.a.e.e.e(packedPositionType, iAlpha, keyRepeatTimeout, 1498455628, false, $$c(b5, (byte) (b5 + 1), b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objC2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {gVar, gVar};
                Object objC3 = com.c.a.e.e.c(-364489268);
                if (objC3 == null) {
                    char cResolveSize = (char) (9087 - View.resolveSize(0, 0));
                    int iAlpha2 = Color.alpha(0) + 19;
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 242;
                    byte b6 = (byte) (-$$a[3]);
                    byte b7 = (byte) (b6 + 1);
                    objC3 = com.c.a.e.e.e(cResolveSize, iAlpha2, scrollBarFadeDuration, -354658379, false, $$c(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        gVar.f2752c = 0;
        int i6 = $10 + 15;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (gVar.f2752c < i3) {
            int i8 = $11 + 107;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[gVar.f2752c] = (char) jArr[gVar.f2752c];
            Object[] objArr5 = {gVar, gVar};
            Object objC4 = com.c.a.e.e.c(-364489268);
            if (objC4 == null) {
                char doubleTapTimeout2 = (char) (9087 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 19;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 243;
                byte b8 = (byte) (-$$a[3]);
                byte b9 = (byte) (b8 + 1);
                objC4 = com.c.a.e.e.e(doubleTapTimeout2, maxKeyCode, bitsPerPixel, -354658379, false, $$c(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objC4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r3 = android.util.Base64.encodeToString(r6.b().getBytes(java.nio.charset.StandardCharsets.UTF_8), 2);
        r2 = com.incode.welcome_sdk.commons.utils.ae.e(r3, com.incode.welcome_sdk.commons.utils.ae.c(new java.lang.StringBuilder().append(r3).append(r6.a()).toString(), com.incode.welcome_sdk.commons.utils.ae.c()));
        r1 = com.incode.welcome_sdk.data.e.b.f7647j + 57;
        com.incode.welcome_sdk.data.e.b.f7645h = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(com.incode.welcome_sdk.data.remote.beans.s r6) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.io.UnsupportedEncodingException {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.data.e.b.f7645h
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.e.b.f7647j = r0
            int r1 = r1 % r4
            r5 = 0
            if (r1 != 0) goto L16
            r0 = 67
            int r0 = r0 / 0
            if (r6 != 0) goto L19
        L15:
            return r5
        L16:
            if (r6 != 0) goto L19
            goto L15
        L19:
            java.lang.String r1 = r6.b()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r1.getBytes(r0)
            java.lang.String r3 = android.util.Base64.encodeToString(r0, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r3)
            long r0 = r6.a()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r1 = r0.toString()
            byte[] r0 = com.incode.welcome_sdk.commons.utils.ae.c()
            java.lang.String r0 = com.incode.welcome_sdk.commons.utils.ae.c(r1, r0)
            java.lang.String r2 = com.incode.welcome_sdk.commons.utils.ae.e(r3, r0)
            int r0 = com.incode.welcome_sdk.data.e.b.f7647j
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.e.b.f7645h = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L54
            return r2
        L54:
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.e.b.e(com.incode.welcome_sdk.data.remote.beans.s):java.lang.String");
    }

    static void e() {
        char[] cArr = new char[4402];
        ByteBuffer.wrap("Á\u001bbÄâ\u0001c9àÒa®á\u000bf*çÏd\u009bä[e\u0014êék¥ëwh|éÍnéïµomì+m\u008bò\u0089r|ó'pÓñ±q)ö?wÆôýt}õ6z:ûÒx\u0088øYy\fþÈ\u007f\u0086ÿ^|:ýÜB\u0091Â!b\u0080âec\u0002àÞaÓáTf^ç\u0094d¿ä#e-êÒkùëVh\réÎnÞï\u0091o\u007fìHmèòÓroó\npÕñ£q{ö\u0015wòô\u0090t8õ.z\u0019ûÖx¶øXy1þþ\u007f\u009aÿA|4ýâB\u0091Â!°\u00940\r±\f2\u0085³½3d´\u001a5È¶\u00816{·\u001a8Ì¹ç99º1;É¼ò=§½B>A¿Á À H!\"¢å#\u0096£X$,¥®&¹¦\\'b¨\")áª\u0086*x«\u0007,\u0086\u00ad¨-o®)/æ\u0090\u0097\u00107\u0013×\u0093l\u0012T\u0091º\u0010é\u0090+\u0017h\u0096¥\u0015\u0084\u0095<\u0014u\u009bÖ\u001aÃ\u009a'\u0019\u001c\u0098Õ\u001f¿\u009eù\u001e\u0017\u009dL\u001cö\u0083²\u0003$\u0082W\u0001\u0087\u0080Þ\u0000J\u0087{\u0006\u008f\u0085ç\u0005\u0010\u0084g\u000b!\u008a¿\t²\u0089\u0010\bY\u008f\u0090\u000eà\u008e\u0017\r\t\u008c¼3Ê³@b\u0091âlc5à\u008fa\u008eálf\u0002çéd\u0084äne\u0010ê³kºëLh\u0005éØnßï\u0087oLì\u000fm\u008fò\u0090r_ó_pÙñ¡q-ö9w¯ô¦t\\õxz\"û\u0085x©øty6þó\u007f¯ÿn| ýåBìÂ!>s¾\u009d?Î¼Z=t½\u0098:\u008d»D89¸ö9Ò¶$7W·\u00864Òµ\u001226³U3Ú°\u00871\u001c®~.\u0095¯ð,y\u00adA-ýªã+\u0014¨f(«©õ&Á§\u0012$\u001e¤Þ%\u0088¢;#I£\u0094 Â¡\u000e\u001eM\u009eñå½egä\u0012gñæ\u0091fyá{`»ã¸cRâ\u001bm\u008dì\u0083l\u000eï>nËé£h§è2kvêãu¸õft\f÷\u0083v\u0083ö\u007fq*ðÖs£óBr\u0018ý\r|úÿ´\u007f-þnyÂø\u0080xDûLzÃÅ\u008eE\u00045±µM48·æ6ä¶\u007f19°Í3\u0083³E2=½í<\u0091¼y?\u001a¾È9¯¸£8#»\b:¨¥¿%A¤\u0019'\u0094¦\u0090&\u0019¡\u0004 \u0088£\u0098#\t¢N-$¬à/\u0090¯=.8©ù(©¨R+\rªê\u0015©\u0095\u0011\u009f\u008e\u001f@\u009e4\u001dñ\u009cª\u001cE\u009b\"\u001a»\u0099¸\u0019D\u0098)\u0017Õ\u0096¡\u0016v\u0095U\u0014\u009e\u0093ø\u0012à\u0092p\u0011`\u0090÷\u000f\u0083\u008f`\u000ec\u008dÀ\f\u0088\u008cY\u000b@\u008a\u0092\t¸\u0089E\b\u000e\u0087\u0004\u0006 \u0085ï\u0005O\u0084\"\u0003ê\u0082¼\u0002@\u0081\u0006\u0000Ñ¿½?\u0005ÌVL»ÍäN\u0005Ï{O¨ÈÃI\u0007ÊxJ¹Ë¥DcÅcE\u009dÆàG%À\u001cA\u0007ÁÁBãÃ,\\YÜ\u00ad]\u0096Þ\u0000_oß\u0080X¡Ù\u000bZ:Úð[ïÔÈU\u0018ÖGV\u0083×ÙP*ÑwQ\u0083ÒÙS7ìelëb´âcc5àýa\u0090á\\fQç\u009fdçäRe\u000fê«k\u0098ëFhzéúnåï¿oTì\u000bmôòªrjó'p¥ñ¬qNö\u001bw×ôýt]õ:z\nûÆxÈøhyYþ×\u007f¡ÿc|\u0014ýíB\u0091Â!b¦â\u007fcIà\u008eaÔá\u000bf\u0007çôd\u009fäZe\u000eêÅk´ësh\u0004éÊn\u0082ï\u0081oaì,mäò\u009draó\u001apòñ\u009dq*önwÚô¨tjõgz[û÷x\u009eøZy6þÔ\u007f¥ÿ\u001d|\u0002ý BàÂ!b\u009aâLc.àåa®á\u001cf çËd\u0095äpe\u0001êÖk\u0081ëmh=éánýï\u0081o]ìEm\u0094òÝr\u0007ó)p¿ñ±qTöewóô\u0095t0õyz\u0004ûÑx\u0094øyy\u0011þò\u007f ÿJ|\u0017ýØB\u009dÂ!bÃâ\u0006c\u0017àïa°áhf\u0005çÀdºäfelêªkôërh8éÄnýï\u008doHì?máòÔrdó=pâñæqqödwäô¥tYõ/z\u001eûÙxÁøPy\u0016þà\u007f£ÿA| ý§B¯Â!ÉëI\fÈfKÏÊÉJ\u001aÍ\fL\u0090ÏÑO\rÎjA¦ÀÊ@<ÃlB\u0081ÅÎDèÄ9GGÆÜYÌÙ\u000bXlÛ®ZØÚx]DÜ³_ºß ^mÑ\nPÆÓõS\u0012ÒiU¦ÔÅT\u0006×SVèéÚij:Aºï;Ê¸\u00039G¹\u0097>ä¿\r<z¼±=ö²>3E³ß0À±\u000b62·i7\u009b´Å53ªJ*\u0096«É(\u0002©S)\u0086®\u008f/\n¬W,\u0084\u00adå\"ö£\u0007 _ \u009a!Ä¦?'5§þ$í¥P\u001az\u009aÊb\u0084â\rcWàÈa¹áhf\u0000çàd\u009däAe\u0013êøkïë^h\u007fé¾nãïÄo[ì4m÷òÒrló\u0019p£ñ\u0090q!ö+wïô\u0088t1õ:z\u0007ûÜx\u008cøJyWþ\u0092\u007f\u008dÿx|býßB«Â!Ú¯ZzÛ!XêÙ\u0088YAÞ\u0005_ÖÜ\u009d\\_ÝpRéÓ´SZÐ\u0012QÖÖëW\u0083×\nT'ÕòJ\u008cÊoK=ÈõI¢É=N7ÏûL\u009dÌLMfÂ!CþÀ\u0082@MÁEFÜÇ\u0093GAÄ\u0001Eßú\u009cz<b¿â\u0003cSàýaÓá`f)çäd\u0091ä|e:ê×kµëKhyéànÔïÌokì\u001amçò\u009crió#pÄñ\u0092qmö*wõô\u0087tZõ=z9û\u009fx\u0088ø\ry\u0019þ\u009c\u007f¢ÿ\u001f|\u0002ý¢B\u0081Â!\u0015Ø\u00952\u0014b\u0097¸\u0016à\u0096\u0001\u0011Q\u0090\u0092\u0013Õ\u0093\u001c\u0012V\u009d\u009d\u001c½\u009c\u000f\u001f~\u009e\u0092\u0019´\u0098\u008f\u0018.\u009bU\u001a \u0085Ä\u0005\b\u0084\u0012\u0007í\u0086ñ\u0006\u0004\u0081a\u0000»\u0083é\u0003 \u0082a\rS\u008c\u0095\u000fÇ\u008f*\u000eZ\u0089\u0092\bå\u0088W\u000bx\u008að5§µnbßâgc\u001bàÕa\u0097áLf\u0010ç\u0095d\u0098äyehê·k«ëQh8éÝn×ïÄozì+mÁò\u008frLó\u0000pâñ\u00adq7ö=wæô\u0091t1õ$z\u0017ûÂx½ø\fy\u000bþÏ\u007f\u008aÿC|\u001aýÓBìÂ!b§âVc-àía×áLf\u001aç\u009fd\u009dä&e)êòk¨ë~h\u0010éýnñïÛo@ìMm\u0098ò\u00adrzó*pÓñ¬qKö9w×ô\u0097t=õ\nz5ûÙxÁøty\u0005þî\u007f¢ÿ\u0018| ý\u00adB»Â!b\u0085âLc\u000eà\u008ba\u00adáMf>çÔdûä-e\rê÷kòëah\u0005éÀnôï»o\fì:máò\u0093rnó\u0000põñ³q)ö3wÎô\u0088t1õuz\u0002ûÖxÈøUy\u000bþþ\u007fÝÿX|aý»B¿Â!b²âBc:à\u0085a§á]f\fç\u009ad\u0095äue2êÙk\u0086ëgh\u000béÖnÈï\u0093o`ì7mëòËrnó_pÓñ¢q\\ö.w÷ô\u0093tcõ\u001bz\u0016ûþx¶ø\u0005y7þÀ\u007f¼ÿX|1ýÂB\u0081Â!b»â\\c\u0000àËa\u0086á}f\tçàdæä%e\nêÏk\u0096ëih-éÿnéï³o~ì\u0011mÔò\u0094rAó\u0000pýñ\u0083qqö$w¸ô¼t\u007fõgz\u0002ûúx³øqy\bþñ\u007fÇÿA|\u0002ýåB\u0095Â!bÆâ\u007fc\u001càÄa\u008cábf$çâd¸äfe\"êæk\u0086ëEhqéânÚï\u0099oRìJmîò rLó?pÝñµq^ö$wøô\u0086tLõ\"z)û\u0087x¨ø\u0004y:þý\u007fºÿu|\u0007ýßB\u009dÂ!ÞK^\u009eßÁ\\LÝi]\u009cÚÊ[SØ\u007fX\u0091Ù¦V'×PW\u009fÔëU\u0001Ò\u001aSFÓ¸PæÑ]NbÎ¦OÈÌ\u0016MqÍ\u0092J¤ËgHAÈïIÁÆ\u0088G\fÄXD\u0080ÅÜBXÃ\u0010CÝÀ·A2þI~éb\u0098â\u001fc+àóa\u0096átf+ç\u009dd¡äRe\"êÚk\u0087ëkh:é¹nÊï²ozì\u001bmÙò\u008frjó\u001bpúñ»qVö3w°ô\u0086tEõ?z&ûøx«øqy-þÔ\u007f£ÿm|\u0013ýðBàÂ!bºâLc1àía¡ávf+çâd\u0086äFe\u0000êíkõë@h\u0007éÃnÑï\u009boJì2m\u0098ò\u00adraó\u001dpôñ\u009eqböowËô¯tiõ%z%ûóx®øSy\u0017þ\u0097\u007f¼ÿ@|\u0014ýãB»Â!è\u008dhpémj©ë\u009fkLì+mìîÅnVï\u0016`\u0082áßa\u007fâ cÈäêe³åPffçöx\u00adø~y\u0013úì{°û_|\u0003ýè~\u009fþI\u007f\u0017ð*qÛò r#ó\u0000tÃõ\u0087uUöHwÐÈ¡H\r$(¤\u009e%Ò¦m'\u0004§Ý ²¡a\"\u0005¢å#\u00ad¬--&\u00adí.\u0084¯~(\u0017©&)üªÚ+t´\u001d4ãµ¼6o·+7©°\u00841R²\u001b2¯³ê<¢½B>7¾æ?Õ¸I95¹Å:´»3\u0004)\u0084¿¥Ð%K¤('Â¦¡&@¡5 Ì£ð#W¢,-Ã¬ê,@¯+.Ý©Ï(«¨C+&ªê5±µ\u00024\u0012·È6\u0084¶i1\u0006°Å3\u0080³525½4<Ó¿¨?L¾19ü¸\u008d8W»\u0000:ö\u0085\u008b\u00053bÛâYc.àøaØá\u0015f\u0018çëd\u0097äqe\u0010êÞk\u008bë0h*éãn\u0088ï§oYì\u0018mÐò«r\u0010ó-pÅñáq^ö\u0005w¹ô\u0092tRõ\u0003z$ûíx¿øZy3þÍ\u007f\u0091ÿV|(ýþB\u008dÂ!±Ó1#°^3\u0087²ä2dµ14»·\u008c7\u000e¶@9Ë¸É8&»H:©½¸<¬¼\u000f?F¾®!ý¡w q£\u0097\"é¢\u001f%{¤¾'\u009d§4&\u0016©+(¾«Ð+6ªU-\u0093¬à,\u0015¯Z.\u009a\u0091À\u0011N\u000f)\u008fØ\u000e¢\u008db\fx\u008cý\u000b\u009a\u008aR\t\u001e\u0089Å\b\u0081\u0087U\u0006\u0013\u0086Ä\u0005 \u0084]\u0003w\u0082\u0012\u0002«\u0081\u009b\u0000~\u009f\u001c\u001fÉ\u009e\u009f\u001d~\u009c\u001a\u001cá\u009b¾\u001a\u0004\u0099-\u0019Ð\u0098¿\u0017¸\u0096X\u0015'\u0095¼\u0014ò\u0093x\u0012+\u0092ï\u0011\u009e\u0090I/2¯\u008aiÏé\u0013hvë\u008ejâê:mfì¾oõï\u0010n\u001aáÜ`\u0085à1c\bâÊe\u0097äÖd(ç1f\u0097ùÑy&ør{\u0082ú\u0090z\býO|¹ÿ\u0087\u007fDþNqvð÷sÜó\u000erFõàtÒô\u0013wnö\u0082I\u0098ÉUÞ}^§ßÁ\\\u0013ÝB]¯Úª[4ØlX\u0093Ù\u009aV\r×MW¯ÔÍU\u0013Ò\u0018S)Ó\u0090PíÑ0NaÎµOõÌKMRÍ\u009bJâË\u000bH\\ÈÓI\u0090Æ¶G\tÄcD ÅøB\u0015ÃbC ÀýA\u0016þV~ÈbÃâ\\c;àÖa©áSfQçæd\u0094ä,e\u0000êûk²ëRh\u0011éÛn\u009bï³ovì+mõò¶rOó[pèñ\u009cqVö\nwïô°tpõ8z9ûÄx\u0099ø\u0005yYþá\u007f\u008cÿi| ý÷B«Â!b±âZc\u0012à\u0089a¸ájf\u0006çídèä~e\u0002ê×kªë1h{éþnÉï³o@ìIméò¨r\u001bó\u000bpõñ¤qOö%w²ô\u008ctLõ\u0019z\u0017û\u009fx\u0099øSy\u0013þé\u007fÃÿ[|*ýâB³Â!HaÈ¦IçÊ7KfË¼L\u008bÍ\u0014NkÎ\u009fOÅÀ:AeÁ¹BÞÃoD2Å@E Æ×GBØ^X\u0088Ù\u0089Z ÛQ[²Üì]\u0006Þq^\u0099ßýPÑÑ\u0011RnÒ¢SéÔ:UCÕºVÄ×\rhNèò#\u0013£ó\"\u009e¡g % Ù'½¦I%3¥É$Ò«}*#ªÒ)¬¨G/b®\u007f.¿\u00ad\u0088,!³\u000e3Ì²é1Z°\u000f0ò·\u00896TµD5ÿ´®;\u008fºi9:¹à8\u0092¿N>6¾Ê=\u0093¼t\u0003:\u0083\u0092b\u009aâfc\fà\u008da£áUf çâd\u0098äZenêäk¡ë/h\u007féÅnüï\u009co}ì>mÄòÒr~ó\u0005pÜñ\u0097qVö\u001awåô\u0087tIõ;z_ûÙxÊøEy+þö\u007f©ÿH|)ý§BìÂ!z+úÅ{Ìø[y1ùÎ~\u009eÿF|\u0014üÝ}éòIsjóÏp«ñ]vx÷\u0007wÎôÅuRêRjæë\u009ah^é\u0003iýî»o8ì\flýí®bµãg`\u0017àßa¶æ\u007fg\u0002çÉdáå#Z*Ú b\u0093âEc2àûa\u0097áOf^çÛd\u0099ä]e>êïk¸ëohqé»nÚï½o{ì.múò\u0096rpó\u000bpÂñåqYö\u0014wêô\u0095t:õ8z\"ûÂx\u0081øxy\u0006þÁ\u007f§ÿY|2ý»B\u0091Â!b¤âzc4àêa¸áMf$çÔd¦äAe-êåk\u0097ëCh\néín\u0080ïµonì\u0018míò\u008erEóXpÜñâqHö\bwÏô\u0094tRõ9z\u0018ûøx½øKyWþÖ\u007fºÿ\u001b|{ýÇB\u008dÂ!b¥âyc-àèa\u0095áQf\u001eçád´ä#e,ê¬kºë3h|éÀn\u0081ï¡oPì:m÷ò¦rLóXpãñ§q`ö+wöô³t^õ\u0003z1ûÖxªøVy\rþ\u009c\u007f¤ÿ\u001a|#ýÝB»Â!bÇâWc*àßa\u008cásf)ç\u009cd¿äAe\u0002ê÷k\u0082ëch\u0019é´nÝï¤oSì0mÊòÕrLó:p¦ñ\u0091qRö4wÅô tNõ\u0005z\u0000ûÝxÓøHy\u0005þÕ\u007f\u0081ÿa|\u0011ý£B³Â!bßâ\u0004c1àÚa\u0092á\u001df\u000fçåd\u0082ä}elêèkªë~hpéånüï\u008eoWìNmèòÔrmó\u0007p§ñáqRö-wÓô¯tlõ\u0016z6ûùxÍø\ny7þÀ\u007f\u0091ÿz|9ýÑB\u0099Â!hëè,i\u001fê\u0083kÙë!loí¬nÍî\bo=à\u009aaÿábbfã\u0083d\u008aåÇe%æxgÃøÔx-ùAzòû×{;ü>}±þë~\u001dÿ*pnñ¯rßò\\sAô\u0091uÉõ\u0011vj÷ðHüÈvb¥âRc\u0017àÈa³á\u001df;çÍd½äme\u001cêÛk\u008fëGh&éÎnöï\u0084orì\u001dmÏò©rbó:p¡ñ²q-ö\u0018wõô÷tzõzz ûÂxÌøry\u0010þö\u007f\u0098ÿI|aýÄB«Â!b©â[c+àÄa\u0087áGf:çïd¨äReiêÊköëah0é¾n\u0087ï°oMì\rmúò²r{ó=p¨ñ\u0083qHö\fw±ôôtQõ9z\nûàx\u009eø\u0013yOþê\u007fØÿ]|\u001cýÄB\u0099Â!b¦âmc\u001càða¨áCf'çÄd\u009bäEekêÎk¥ëOh-éÿnòï£o_ì\u000emïò\u00adryóTpÝñ\u0099q{ö\u001ewµô\u008ct^õ\u0001z;ûÞx\u0089ø}yOþÎ\u007fªÿA|\u0004ýÜB«Â!b\u0091âNc?àØa\u0088áVf+çßd\u0097ä[eoê×k¡ë=h=éÀnûï\u0087ozì/mÆò¯rxó6pôñ\u0099qRödw×ô¯t1õ\u000ez)ûÂx¹øLyUþþ\u007f©ÿX|\u0000ýÐBìÂ!\u0016\u008e\u0096\u0014\u00177\u0094Í\u0015¦\u0095B\u0012\n\u0093Ú\u0010\u0083\u0090Y\u0011f\u009e¼\u001f\u0094\u009fw\u001c\u0011\u009dÝ\u001a\u009c\u009b\u0089\u001bX\u0098_\u0019ø\u0086\u0097\u0006R\u00878\u0004ö\u0085\u008a\u0005}\u0082<\u0003Û\u0080\u009c\u0000L\u0081\r\u000e=\u008f\u0093\f»\u008cc\r\u001b\u008aÖ\u000bÏ\u008b`\b-\u0089æ6\u009c¶4b\u0092âvc!à\u0089a¤á^f\u001dçÖdèäye,êÌk¤ë2h|éÝnÔï¿ouì:môò\u0087r`ó\u0007pÓñ¤q ö6wâôýtkõ9z\u0002ûâxÁø\tyXþ\u008b\u007f²ÿH|\u0017ýåB\u0091Â!b¸âCc\u0011à\u008aa\u008eáQf,çæd£äAe3êÊkõë+h$éýn\u0088ïºoqìNmÙò\u0085r\u0007ó\u001bpæñ¿q ö\u000bw×ô°tJõ>z\tûåx°øFy\u001aþå\u007f«ÿH|)ý÷B\u0089Â!À×@0ÁzBÃÃ÷C\u0007ÄvE\u008bÆïF%Ç\u007fH\u008aÉàI%Ê6K\u0092Ì MàÍ\nNtÏ\u0085PÃÐ\fQOÒùSæÓ\u0019TpÕ\u0081VíÖ)WcØ\u007fY\u0095ÚêZ7Ûv\\ÖÝã]=ÞY_¢àß`g¢Ý\"#£~ \u008c¡à!4¦M'¤¤Ý$4¥\u0003*³«á+>¨\u001a)×®\u0085/í¯!,e\u00ad¬2ö²\u001f38°Æ1Ù±06s·Ñ4Å´-5BºJ;î¸Ü8(¹1>\u009d¿À?\u0004¼C=Ä\u0082Ø\u0002BÄóD;Å\\F\u0091ÇùG(ÀRA\u008eÂýB+Ã&LªÍÅM2ÎgO\u009eÈ¤IÎÉ&J\u0010Ë³T\u0081Ô*UzÖôWë×\u001aPCÑíRÕÒ\u0015SUÜ]]\u0080ÞÜ^\u001aßwX\u0090ÙÕY\fÚg[\u0099ä½dtb©âwc0àÅa\u0095á\u0012f*çüd\u0091äYe*ê«k\u0090ë\\h;éünÆï\u0091ouì*m\u0099òÓr\u001fó'pÕñ§q{ö2wÓô\u0089tPõ\u0005zBûÞx¬øpy\u0007þî\u007f¥ÿU|\u001dý×B\u008dÂ!b\u0085âGc@àïa\u0081áQf\u001eçØd¶äpe\fê«k\u0090ëshcéÉn\u0081ïÇoyì\u0016m\u008bò\u0083roó\u0015pÂñ°qlö&wéô©t=õ z\u001dûýxªøNy/þÍ\u007f\u00adÿj|\u0001ýÞB\u0099Â!Þò^\u0001ßt\\¿ÝÜ]'Úz[¹ØÚX>ÙVV¯×òWoÔbUçÒ±SæÓ:P\tÑ¼NÇÎ\tO\u001eÌ\u0093M¦Í\u0015J\\Ë\u009dHÔÈcIdÆwG\u009eÄØD9ÅKBÐÃäCQÀ|A\u0080þ¤~eb\u0088â\rcKàía¥áCf!çÖdéäce>êÙk\u008aëlh\u0001éõnÛï\u0096oKì\u000bm×ò\u0086reó\npÂñ½qQö6wÙô\u00adt`õ\bzAûÀx³øtySþÐ\u007f\u0084ÿ\u0018|`ýÁB«Â!B§Â<CQÀèA³Á\nF`Ç\u0083DçÄ\u0012EUÊ\u009dKàË<HSÉ\u0081N\u009fÏúOlÌ(M±ÒÃR\u0012Ó~P\u0080Ñ\u0083Q\u0011Ö\u007fW±ÔÌT'Õ{ZzÛ\u008fXØØnY:Þ\u008c_Óß'\\fÝÅbëâCb¦âFcMàÑaÐáSf_çÛd\u0086ä`e6ê«k\u0090ë]h;éÃn\u0086ï¬o\u000fì\u0012mìò\u008dr\u001bó-pòñ¾qRö\u001awÇô\u008bt^õ z\u0003ûðx¯øuy5þü\u007f¯ÿh|%ý¦B\u0091Â!ö\"vÀ÷ÛtQõGu\u0083òËsið\u0011pòñ\u0086~<ÿ.\u007fàü¹}~út{\u000eûÚx\u0093ùFfAæÞg¸äLe\u000eåÈb»ãT`\u0015àöa\u0096î\u0088oMì\u001el\u0084í²jTë\u001dkÈèõikÖ\u000eV¶bÁâzc\u0010à\u008fa¡áBf'ç\u0087d\u0086äle\u000bêùk¤ëeh\u007féünÿï½o|ìImÏò¨rXó\u0001pÚñ\u008eq`ö\u001awåô\u008dtbõ z2ûãx·øKyYþ\u0093\u007f\u0099ÿ{|\bý¤B¿Â!q9ñ\u0084pÇó;r%ò±uúô:wd÷\u0080vÿù!xSøÆ{Öú4}\u001bün|¨ÿÔ~há\\a\u00adàÐc+â]b¥åëd\bçCg·æùi×è|k&ë«jÀí1loì´oäî\u001fQZÑÐb\u0093â\u0006c1à\u0089a\u0092á\u0017f=çÇd©äne*êäk\u0084ë3h0éånäï\u0091opì\fmÍò\u008drmó>pýñ\u009aqvö&wÂô\u0096t[õ\u001dz\u001dûõx\u0091øZy\u0019þÁ\u007fØÿO|gý¬BàÂ!\u0095Ê\u0015(\u0094v\u0017á\u0096Í\u0016&\u0091v\u0010ð\u0093\u008a\u0013\u001d\u0092\n\u001dØ\u009cò\u001c&\u009fP\u001e¤\u0099¯\u0018Æ\u0098\u001d\u001b<\u009a\u009f\u0005ø\u00856\u0004u\u0087¨\u0006û\u00862\u0001_\u0080º\u0003Ë\u00831\u0002M\u008d#\f°\u008fÑ\u000f\u0002\u008es\t¾\u0088°\bu\u008bS\n·µò5JWk×ÑV¸ÕpT\u001cÔåSèÒgQ\u0017ÑýP¢ßE^-ÞÁ]ÕÜJ[gÚ+ZîÙ\u009cX Ç\u0011GÊÆ\u008cEIÄ*DØÃµBuÁ\u0003AôÀ¶O¨Î0M\u0004ÍØLúËeJ\u000eÊÍI\u0087È\u0002w6÷\u008eb¦â\u001bcKà\u0093a\u0098áPf\u001eçþd£äae\têæk³ëSh$éÇnúï³oyìLmÈò\u009erXó\u0005põñìqBö)wÙô\u008ctjõ/z\u001bûÆx\u008aø~y\bþÅ\u007f¥ÿI|3ýÓB\u008dÂ!b£â@cAà×aªáUf\\çùd¥ä]e\u000bê÷k\u008dënh\"éÀnçï\u0084o\\ìImïò¶rDóYpþñ¬qAö\u001ew¶ôðtjõ\tz8û\u0082x\u0094øOy\u0001þ\u008f\u007fÜÿ\\|=ý¡B»Â!KKËÃJ\u009cÉ\rH*ÈãOÝÎkM\u0010ÍåL¸Ã[B9ÂÌA\u0083À>G\u0018Æ&F\u008dÅ\u0086DyÛ\u0016[çÚ\u009bYDØ`XÒßî^sÝt]ÓÜ\u0096SÊÒ\u007fQ\u0003Ñ\u008cP¢×oV\u0019ÖûUøÔ'k<ë¢b³âec(àÌaÏájf0çÖd\u009cäDe\u0015êäk\u008bëvh\u001dé¹n\u009fïÂo`ì\u0015mÌò\u0085rkó>pêñáqAöewÇôµtOõ z\u0017û\u0080xºømy\u0014þ\u0096\u007f\u0081ÿo|#ý¤B\u0099Â!b¥âPc\u001bà\u008aa\u008báGf>çídáä^e2êÈk®ërh\u0005éÛnÁï£oSì\bm÷òÜrBó:p×ñ\u0098qNö\u000bw«ô\u0082tgõ\u0018z#ûÅx¬øoyUþ÷\u007f\u0083ÿ{|*ýðB\u0099Â!b½â}cLà\u0084aËáWf2çÈd\u0089äqe2êøk\u0081ë@h\u0001éÔnÀï\u00ado~ì*mÆò\u008br|ó5pÄñ\u0096qmö\u001awòô\u00adtEõ\u001bz#ûñxÈøYyWþÊ\u007f¿ÿt|*ýüB\u0099Â!bÄâ\u001fc+àäa\u008cáUfZçÙd\u009cäYe\têîk\u0089ënh8éÔn\u0085ïºoHì/m\u008bòÕrNó5pßñ\u0082q}ö4wöô\u009ctPõ\u0000z6ûÁx\u008aø~yXþ\u0090\u007f\u008bÿ\u0015|3ýÆB¯Â!b¿âZc;àñaÐá\u0017f\u0018çÍd\u0093ä'e\u001bêþkëë}h{éýn\u0080ï\u0092o~ì\nmèò\u0090rMó\"pøñ\u009eq,ö:wÑô¨t8õ9z_ûÂx¼øRy\u001aþè\u007f¯ÿ\u007f|býòB\u0095Â!b¸âZc àÉa\u0088álf8ç\u0099dûäCejêÑk²ëTh=é¼næïÆoQì\u0004m\u0099ò´rió\u000fpÛñ¤qzö\u001ewúô\u0082tqõ\u0002z\u0014ûòxºø]y\u0014þõ\u007f\u0087ÿ\u001e|#ýäB»Â!BÉÂ\u001eC?À÷A¢Á\u0011F3ÇøD\u0099Ä|E\u0012ÊêK¤Ë=H\u000bÉúNÞÏ\u0092OmÌ\u0016M\u0095ÒÕRYÓ\u0004PÔÑ¦QuÖ%WÕÔ÷ThÕ\fZ3ÛÙX\u008bØxY/Þ\u009d_\u0083ß_\\&Ý¦b\u0088â ç?gÚæ¡eUä:déã\u0080blá+aØàµoPî;n«íælXëKjZêãiÐèYw&÷ÅvÍõlt+ôúsóò]q\fñãp\u008eÿ®~yý\n}ÔüÊ{qú<zÛù§x:Ç\u0019G¹\u008f\u0004\u000f\u009c\u008e\u008e\rh\u008cL\fÁ\u008b³\nF\u00891\tØ\u0088\u009d\u0007u\u00864\u0006ñ\u0085¹\u0004v\u0083\u001c\u0002\u0015\u0082â\u0001È\u0080r\u001fU\u009fÒ\u001eÝ\u009d<\u001c\u0018\u009cú\u001b¥\u009aO\u00195\u0099â\u0018¦\u0097\u0096\u0016o\u00957\u0015Ì\u0094¹\u0013\f\u0092\u001e\u0012â\u0091á\u0010N¯(/¢bÂâgc(à\u0085a\u0087áIf\u001fçãd¾äpe\u001eêÚk\u0096ëVh.éÆnÞï\u0085o\u000bì\u0017m\u0092ò\u0093rFó\u0019p¨ñåqiö\u001dwùôªt^õ4z\u0017ûüx\u0088øoy\u0013þ×\u007f\u0087ÿ\u0007|\u0019ýÜB\u0095Â!b\u0080â\u0004c\u0019àþaµácf\u001bçîd\u0091äre\u0012êíkõëah8éènÞï\u009aoSì\bmçò×rQó\u001fpäñ\u0080qsö$wãô\u0086t;õ%z\u001aûþxÉøFy\u000bþë\u007f¬ÿX|*ýÖB\u0091Â!b¼âEcNàËaºájf\u0011çßdµä@e7êøk÷ëkh\u0001éínýï§obì:m\u0091òÖr^ó(pÈñçqMö7wèô\u0087t<õ4z:û\u008cx²ø\fyTþå\u007f\u008fÿN|\u0016ýÓB\u008dÂ!b¢â\fc\nà\u008caÙáPf\u001açôd\u009däxe êÍkùë0h0éÙnÁï\u00adoqìEmõò\u0086r\u007fó>pÂñ\u00adqAö$wêô¢trõ\u0005zGûäxÎø[y.þ\u0093\u007f®ÿH|\tý¿B\u0081Â!ùtyµø\u008d{@ú\u001dzÞý\u0095|8ÿk\u007fêþºq~ðZpüóìrpõ\u001ctuô\u009bwÉö4i\u0010éÜhÉë,j{ê±màì#oeï³nõá×`\u000bãYc\u0089âÅe:äOd\u0088çÅf+ÙrYì+\\«\u0097*ã©\u0004(F¨\u0097/Ì®\u0002-P\u00ad×,ÿ£\u0006\"\u0001¢ª!ß ('\f¦n&ô¥°$1»z;\u0090ºÉ9\r¸D8§¿Ü>&½t=\u0090¼Ê3Í²+1T±\u008d0»·;6-¶\u008b5ê´\u0011\u000bm\u008bÕb¤â`cMà\u0088a\u008eáof\u000eçÏd äge5êÏk\u0096ëHh-éänÂï¥oTìImÃò¾r\u007fó\u0000pÞñ³qrö\nwÒô tXõcz!ûÕx\u0082øhy\u0004þì\u007f\u0090ÿB|\u0003ýÍBàÂ!=£½.<k¿\u0097>Û¾j9C¸å;ë»^:\u0013µ®4\u008c´+7c¶É1\u0084°Ï0\u0016³12®\u00adÞ-d¬B/«®Ì.1©x(\u0096«À+5ª`%D¤\u008b'Ã§t&o¡© ø \u0000#\\¢\u0082\u001dý\u009d]bÄâ\u0004c\"àøa\u008báKf0çÖd\u0080ä}e\u001bêÙk\u008aë/h2éÂnâï\u009ao^ì$mÓò\u0095rjó;p÷ñ\u008eqBöhwÉô½tMõ)z\u001eûæx®øwy.þ÷\u007fªÿ\u0018|`ýùBìÂ!³ç33²S1ñ°ó0/·\u007f6¹µ×5C´X;\u008bºó:\u0012¹]8\u0080¿\u0097>ö¾4=`¼\u0083#º£+\"X¡\u0092 È K'\n¦\u0082%\u009b¥!$\u0018«{*\u0084©é)\u0012¨2/ó®ý.\u0010\u00adl,¨\u0093Ý\u0013GbÀâScWàÑaµáuf8ç\u009dd\u0098äye9êôk¬ë6h0éûnÆï\u0085obì5m\u0094ò\u0095rló\u001fpÿñ q3ö,wêô\u0083tpõ\bz\u001bûÒx\u008eøJyWþâ\u007f¢ÿ]|aýÞB³Â!&°¦\u0006'M¤Ò%Ñ¥\u0012\"$£\u0082 \u00ad Y!h®Ó/\u0087¯F,\b\u00adÜ*\u008c«\u0098+[¨+)\u0096¶»6N·?4 µ¹5T²v3ã°¸0~±<>\u0007¿á<»¼U=1ºË;\u0088»\u00108\u0007¹Ë\u0006ª\u0086$bÇâLc\u001fàÒa±áGf\u0001çêd\u009bä,elêÒkµë7h\u001déþnúï\u0082o\u0001ì\u001fmÅò¦r\u0019ó_pÂñºqWö*w´ô©tkõ=z6û\u0085x®øOy0þÌ\u007fØÿ\u001d|2ýØB\u0099Â!\f'\u008c°\rø\u008e>\u000f}\u008fõ\bù\u00891\nM\u008a\u0083\u000b×\u00847\u0005i\u0085\u008d\u0006Ý\u0087\t\u0000<\u0081T\u0001\u0097\u0082Ë\u0003~\u009c;\u001c¡\u009dí\u001e2\u009fJ\u001f¼\u0098\u008c\u0019/\u009ap\u001a \u009bÏ\u0014À\u0095)\u0016f\u0096¨\u0017å\u0090h\u0011[\u0091\u0098\u0012Ï\u0093*,H¬ÆÑ\"QëÐ¸S/Ò\tR·ÕªTi×7WôÖ\u0095Y{Ø.XÌÛ¦ZgÝs\\\u001bÜÑ_\u0094ÞmA\u001aÁÁ@\u0083Ã\u0002B\u0013ÂÑEÈÄ\u001fG\u001aÇüFÝÉ\u0097HfË\bKùÊ³MPÌ7LæÏ°N\u0019ñ3q\u0087bºâSc\u0012àÓa\u0084áCf\u001eç\u009ad\u0085äye\u000bê¨k¦ëOh\né¹nûï\u008eo~ìWmÚò\u0081rKó[páñûqYö5wÎô¢tbõ6zAû×x\u0090ø}y\u0004þæ\u007f¡ÿ\u001b|\u0004ýÑB³Â!b±âEc\rà\u0093a·áuf\u0006ç\u009edûädejêÒk\u008eë\\h\u0019éünÄï¤oUìEmÖò\u0083r\u001aó\\pÞñ²q{ö$wµô®tOõ\u0005z#ûÅx\u0092ø\u0013y)þ\u009c\u007f«ÿf|\"ýÃB·Â!bÊ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 4402);
        f7642c = cArr;
        f7646i = -2603878988887170508L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f7643f = 0;
        f7644g = 1;
        f7645h = 0;
        f7647j = 1;
        e();
        PointF.length(0.0f, 0.0f);
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getLongPressTimeout();
        int i2 = f7643f + 41;
        f7644g = i2 % 128;
        int i3 = i2 % 2;
    }
}
