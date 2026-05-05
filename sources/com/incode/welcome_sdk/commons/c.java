package com.incode.welcome_sdk.commons;

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
import com.incode.welcome_sdk.modules.IdScan;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static String f4649a = null;

    /* JADX INFO: renamed from: b */
    public static String f4650b = null;

    /* JADX INFO: renamed from: c */
    public static String f4651c = null;

    /* JADX INFO: renamed from: d */
    public static String f4652d = null;

    /* JADX INFO: renamed from: e */
    public static String f4653e = null;

    /* JADX INFO: renamed from: f */
    public static String f4654f = null;

    /* JADX INFO: renamed from: g */
    public static final IdScan.AutocaptureUXMode f4655g;

    /* JADX INFO: renamed from: h */
    private static char[] f4656h = null;

    /* JADX INFO: renamed from: i */
    public static List<String> f4657i = null;

    /* JADX INFO: renamed from: j */
    private static long f4658j = 0;

    /* JADX INFO: renamed from: m */
    private static int f4659m = 0;

    /* JADX INFO: renamed from: n */
    private static int f4660n = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, short r10, byte r11) {
        /*
            int r8 = 116 - r11
            int r0 = r10 * 3
            int r7 = 4 - r0
            byte[] r6 = com.incode.welcome_sdk.commons.c.$$a
            int r0 = r9 * 2
            int r5 = 1 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r6 != 0) goto L27
            r0 = r7
            r2 = r3
        L13:
            int r7 = r7 + 1
            int r8 = r8 + r0
            r1 = r2
        L17:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r5) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r6[r7]
            goto L13
        L27:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.c.$$c(byte, short, byte):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{53, -94, -28, -114};
        $$b = 57;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f4660n = 0;
        f4659m = 1;
        e();
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getDoubleTapTimeout();
        AudioTrack.getMaxVolume();
        ViewConfiguration.getScrollBarSize();
        ExpandableListView.getPackedPositionType(0L);
        AudioTrack.getMinVolume();
        KeyEvent.keyCodeFromString("");
        ImageFormat.getBitsPerPixel(0);
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        KeyEvent.getModifierMetaStateMask();
        AudioTrack.getMinVolume();
        TextUtils.indexOf("", "", 0);
        TextUtils.indexOf("", "", 0);
        TextUtils.lastIndexOf("", '0', 0);
        ViewConfiguration.getPressedStateDuration();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ViewConfiguration.getWindowTouchSlop();
        ExpandableListView.getPackedPositionForGroup(0);
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getJumpTapTimeout();
        TextUtils.lastIndexOf("", '0', 0, 0);
        Gravity.getAbsoluteGravity(0, 0);
        AudioTrack.getMaxVolume();
        ViewConfiguration.getMaximumDrawingCacheSize();
        ViewConfiguration.getMaximumFlingVelocity();
        Color.red(0);
        ViewConfiguration.getScrollBarFadeDuration();
        View.combineMeasuredStates(0, 0);
        SystemClock.elapsedRealtimeNanos();
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getFadingEdgeLength();
        TextUtils.lastIndexOf("", '0', 0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getMaximumDrawingCacheSize();
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getLongPressTimeout();
        TypedValue.complexToFloat(0);
        ViewConfiguration.getEdgeSlop();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ExpandableListView.getPackedPositionForGroup(0);
        ImageFormat.getBitsPerPixel(0);
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        View.getDefaultSize(0, 0);
        ViewConfiguration.getKeyRepeatTimeout();
        View.combineMeasuredStates(0, 0);
        TextUtils.getOffsetAfter("", 0);
        Color.blue(0);
        TextUtils.getOffsetBefore("", 0);
        SystemClock.uptimeMillis();
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getMaximumFlingVelocity();
        ViewConfiguration.getWindowTouchSlop();
        TextUtils.getCapsMode("", 0, 0);
        Process.getThreadPriority(0);
        ExpandableListView.getPackedPositionForGroup(0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        View.MeasureSpec.getSize(0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ViewConfiguration.getScrollDefaultDelay();
        MotionEvent.axisFromString("");
        SystemClock.elapsedRealtimeNanos();
        View.MeasureSpec.getMode(0);
        TextUtils.lastIndexOf("", '0', 0);
        Process.getElapsedCpuTime();
        Process.getThreadPriority(0);
        SystemClock.elapsedRealtimeNanos();
        Color.rgb(0, 0, 0);
        View.combineMeasuredStates(0, 0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getScrollFriction();
        TextUtils.lastIndexOf("", '0', 0, 0);
        Color.green(0);
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getDoubleTapTimeout();
        SystemClock.elapsedRealtime();
        Process.myTid();
        TypedValue.complexToFloat(0);
        ExpandableListView.getPackedPositionForGroup(0);
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getScrollDefaultDelay();
        SystemClock.elapsedRealtimeNanos();
        ViewConfiguration.getScrollFriction();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        ViewConfiguration.getLongPressTimeout();
        ExpandableListView.getPackedPositionChild(0L);
        SystemClock.uptimeMillis();
        MotionEvent.axisFromString("");
        KeyEvent.getModifierMetaStateMask();
        SystemClock.elapsedRealtime();
        ViewConfiguration.getKeyRepeatDelay();
        ViewConfiguration.getPressedStateDuration();
        TextUtils.getTrimmedLength("");
        ExpandableListView.getPackedPositionChild(0L);
        KeyEvent.getDeadChar(0, 0);
        View.MeasureSpec.getMode(0);
        ExpandableListView.getPackedPositionForGroup(0);
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getScrollBarFadeDuration();
        Color.red(0);
        Gravity.getAbsoluteGravity(0, 0);
        TextUtils.lastIndexOf("", '0', 0);
        KeyEvent.getDeadChar(0, 0);
        Color.argb(0, 0, 0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        Process.myTid();
        ViewConfiguration.getPressedStateDuration();
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getJumpTapTimeout();
        ViewConfiguration.getKeyRepeatDelay();
        AudioTrack.getMaxVolume();
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getMaximumFlingVelocity();
        ViewConfiguration.getGlobalActionKeyTimeout();
        TextUtils.indexOf("", "", 0, 0);
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getPressedStateDuration();
        View.getDefaultSize(0, 0);
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getJumpTapTimeout();
        ViewConfiguration.getScrollFriction();
        ExpandableListView.getPackedPositionType(0L);
        TextUtils.indexOf("", "", 0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        SystemClock.currentThreadTimeMillis();
        ExpandableListView.getPackedPositionType(0L);
        KeyEvent.getDeadChar(0, 0);
        PointF.length(0.0f, 0.0f);
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getMinimumFlingVelocity();
        KeyEvent.getModifierMetaStateMask();
        KeyEvent.normalizeMetaState(0);
        TypedValue.complexToFloat(0);
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getTapTimeout();
        SystemClock.uptimeMillis();
        Gravity.getAbsoluteGravity(0, 0);
        TextUtils.indexOf("", "", 0, 0);
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.lastIndexOf("", '0', 0, 0);
        View.getDefaultSize(0, 0);
        ViewConfiguration.getKeyRepeatDelay();
        Color.alpha(0);
        ViewConfiguration.getMaximumFlingVelocity();
        ViewConfiguration.getMaximumDrawingCacheSize();
        ViewConfiguration.getGlobalActionKeyTimeout();
        ExpandableListView.getPackedPositionForGroup(0);
        PointF.length(0.0f, 0.0f);
        TextUtils.getOffsetBefore("", 0);
        Gravity.getAbsoluteGravity(0, 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        ViewConfiguration.getTapTimeout();
        TextUtils.indexOf((CharSequence) "", '0');
        ViewConfiguration.getPressedStateDuration();
        SystemClock.uptimeMillis();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        TextUtils.indexOf("", "");
        KeyEvent.keyCodeFromString("");
        ImageFormat.getBitsPerPixel(0);
        ViewConfiguration.getKeyRepeatDelay();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getMaximumFlingVelocity();
        AudioTrack.getMinVolume();
        ViewConfiguration.getLongPressTimeout();
        KeyEvent.getMaxKeyCode();
        KeyEvent.getModifierMetaStateMask();
        TextUtils.indexOf("", "");
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getPressedStateDuration();
        KeyEvent.getMaxKeyCode();
        View.MeasureSpec.getMode(0);
        SystemClock.elapsedRealtime();
        Color.rgb(0, 0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        Process.myPid();
        ViewConfiguration.getScrollBarFadeDuration();
        TextUtils.indexOf((CharSequence) "", '0');
        Process.myPid();
        TextUtils.lastIndexOf("", '0', 0, 0);
        SystemClock.currentThreadTimeMillis();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        AudioTrack.getMinVolume();
        KeyEvent.getMaxKeyCode();
        Color.alpha(0);
        ViewConfiguration.getScrollFriction();
        TextUtils.getOffsetAfter("", 0);
        TextUtils.getCapsMode("", 0, 0);
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getMaximumDrawingCacheSize();
        Process.getGidForName("");
        KeyEvent.keyCodeFromString("");
        Object[] objArr = new Object[1];
        k(1501 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 3 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (56134 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr);
        f4649a = ((String) objArr[0]).intern();
        f4651c = "";
        Object[] objArr2 = new Object[1];
        k(1504 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 18 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr2);
        f4653e = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        k(TextUtils.getOffsetAfter("", 0) + 1522, 41 - ExpandableListView.getPackedPositionChild(0L), (char) (Color.red(0) + 5669), objArr3);
        Object[] objArr4 = new Object[1];
        k((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1564, 47 - KeyEvent.getDeadChar(0, 0), (char) KeyEvent.getDeadChar(0, 0), objArr4);
        Object[] objArr5 = new Object[1];
        k((Process.myPid() >> 22) + 1611, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 44, (char) (Process.getGidForName("") + 23981), objArr5);
        f4657i = Arrays.asList(((String) objArr3[0]).intern(), ((String) objArr4[0]).intern(), ((String) objArr5[0]).intern());
        f4655g = new IdScan.AutocaptureUXMode.HoldStill();
        int i2 = f4659m + 7;
        f4660n = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
    }

    private static void k(int i2, int i3, char c2, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        com.c.a.g gVar = new com.c.a.g();
        long[] jArr = new long[i3];
        gVar.f2752c = 0;
        while (gVar.f2752c < i3) {
            int i5 = gVar.f2752c;
            try {
                Object[] objArr2 = {Integer.valueOf(f4656h[i2 + i5])};
                Object objC = com.c.a.e.e.c(-542847437);
                if (objC == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objC = com.c.a.e.e.e((char) TextUtils.indexOf("", ""), 19 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf("", "", 0, 0) + 1028, -549532598, false, $$c(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objC).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f4658j), Integer.valueOf(c2)};
                Object objC2 = com.c.a.e.e.c(1506450485);
                if (objC2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objC2 = com.c.a.e.e.e((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 60521), 20 - ExpandableListView.getPackedPositionGroup(0L), 923 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1498455628, false, $$c(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objC2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {gVar, gVar};
                Object objC3 = com.c.a.e.e.c(-364489268);
                if (objC3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objC3 = com.c.a.e.e.e((char) (KeyEvent.normalizeMetaState(0) + 9087), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18, 242 - TextUtils.indexOf("", "", 0), -354658379, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 57;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (gVar.f2752c < i3) {
            int i8 = $10 + 109;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr[gVar.f2752c] = (char) jArr[gVar.f2752c];
                Object[] objArr5 = {gVar, gVar};
                Object objC4 = com.c.a.e.e.c(-364489268);
                if (objC4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objC4 = com.c.a.e.e.e((char) (Color.argb(0, 0, 0, 0) + 9087), 19 - View.MeasureSpec.getMode(0), View.MeasureSpec.getSize(0) + 242, -354658379, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objC4).invoke(null, objArr5);
                int i9 = 15 / 0;
            } else {
                cArr[gVar.f2752c] = (char) jArr[gVar.f2752c];
                Object[] objArr6 = {gVar, gVar};
                Object objC5 = com.c.a.e.e.c(-364489268);
                if (objC5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objC5 = com.c.a.e.e.e((char) (9087 - (Process.myTid() >> 22)), 19 - View.MeasureSpec.makeMeasureSpec(0, 0), 242 - View.resolveSize(0, 0), -354658379, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objC5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr);
        int i10 = $10 + 9;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    static void e() {
        char[] cArr = new char[1656];
        ByteBuffer.wrap("\u0003µ\u0011,&\u0090ôªæ>Ñ\u009dÃe¾ê¨x\u009bóv\u0081`0S«MX8Æ*h\u0005\tð\u0084âuÝüÏ_ºã\u0094j\u0087\u001b·6¥®\u0092\u0010\u0080ÇýlëßØN56#\u0091\u0010\u0004\u000e³{~iÀF½³.¡\u0096\u009ex\u008cäùb×ÚÄ¡1\u001a/Ã\u001cw\nÓgBTsB¼¿\f\u00ad¿\u009aC\u0088ßå¶Ò\u0012À\u009e=\b+ë\u0018_vÄc·P\u0012N »~©ý\u0086Ló'á¤Þ\rÌìb\u0093p\u000bGµUb(É>z\rëà\u0093ö4Å¡Û\u0016®Û¼e\u0093\u0018f\u008bt3KÝYA,Ç\u0002\u007f\u0011\u0004ä¿úfÉÒßv²ç\u0081Ö\u0097\u0019j©x\u001aOæ]z0\u0013\u0007·\u0015;è\u00adþNÍÀ£}¶\b\u0085¿\u009b6nÑ|MSì&µ4\u000b\u000b¨\u0019YìÒÂqÑø¤\u0099b\u0093p\u000bGµUb(É>z\rëà\u0093ö4Å¡Û\u0016®Û¼e\u0093\u0018f\u008bt3KÝYA,Ç\u0002\u007f\u0011\u0004ä¿úfÉÒßv²ç\u0081Ö\u0097\u0019j©x\u001aOæ]s0>\u0007\u0082\u0015;è\u0084þAÍæ£l¶\u000b\u0085±\u009b6nÝ|mSã&\u00804\u0001\u000bª\u0019YìÐÂab\u0093p\u000bGµUb(É>z\rëà\u0093ö4Å¡Û\u0016®Û¼e\u0093\u0018f\u008bt3KÝYA,Ç\u0002\u007f\u0011\u0004ä¿úfÉÒßv²ç\u0081Ö\u0097\u0019j©x\u001aOí]x0\u0019\u0007\u0090\u0015\u0017è¯þRÍÕ£k¶\b\u0085¹\u009b2nÑ|XSùZ§H?\u007f\u0081mV\u0010ý\u0006N5ßØ§Î\u0000ý\u0095ã\"\u0096ï\u0084Q«,^¿L\u0007séau\u0014ó:K)0Ü\u008bÂRñæçB\u008aÓ¹â¯-R\u009d@.wÒeN\b'?\u0083-\u0015Ð\u0095ÆvõÏ\u009bP\u008e\u000b½\u008b£\u001eVêDqkÆ\u001e\u00ad\f=3\u009c!mÔÿúBéù\u009c·\u0082\u0014±\u0095§~JÍxDo5\u0080ï\u0092w¥É·\u001eÊµÜ\u0006ï\u0097\u0002ï\u0014H'Ý9jL§^\u0019qd\u0084÷\u0096O©¡»=Î»à\u0003óx\u0006Ã\u0018\u001a+®=\nP\u009bcªu`\u0088Ý\u009a;\u00ad§¿\u0010Òcåê÷P\n\u009e\u001c)/\u0081AZTEgÈyQ\u008c°\u009e\u001f±\u009fÄúÖUéÃû8\u000e± \u00123\u0099FèXQû\u0019é¾Þ\u0011Ì\u008e±x§ê\u0094Ay o\u0093\\\u001aBà7.%Ü\n¼ÿ\"b\u0086p\u0017G\u0087U-(Õ>p\ráà\u0093b\u0086p\u0017G\u0087U:(Ï>}\rëà\u0099ö\u000fÅ§ÛW®Â¼s\u0093\u0011f\u0086t(KïYW,ý\u0002`\u0011\u0006ä½ú-):;«\f;\u001e\u0094csuËFA«-½\u0089\u008e\u0016\u0090ð(®:?\r¯\u001f\u0014bétOGÓª¤¼\u0017\u008f\u009e\u0091dÄÝÖLáÜó~\u008e\u009f\u0098\u0010«±FÆPhcô\\èNyyékK\u0016ª\u0000%3\u0080ÞàÈQûÄå\"b\u0086p\u0017G\u0087U?(Å>x\rîà\u0095ö5Ï£Ý ê\u008aø\u0018\u0085í\u0093A öM¿[\u0010h\u0086vr\u0003Ò\u0011H>1\u001d\u0011\u000f\u009288*ªW_AórD\u009f\t\u0089±º8¤ÅÑKÃÌì\u008e\u0019\u001fb\u0082p\u000bG\u00adU\"(Ä>q\rìà£ö Å¥ÛK®ß¼p\u0093\u001bf\u009at(b\u0080p\u0005G«U?(Ð>{\rúà\u0088N\u0098\\\u0011k·y8\u0004Þ\u0012k!öÌ¹Ú%éª÷J\u0082Ó\u0090h¿1J\u0096X)gÉua\u0000±b\u009fp\u0010G°U)(Ò>K\rìà\u0093ö3Å\u009bÛ\u000bb\u0082p\u000bG\u00adU\"(Ä>q\rìà£ö?Å°ÛP®É¼r\u0093+f\u008ct3KÓY{,ªb\u009fp\u0010G°U)(Ò>K\rìà\u0093ö3Å\u009bÛ\nb\u0082p\u000bG\u00adU\"(Ä>q\rìà£ö?Å°ÛP®É¼r\u0093+f\u008ct3KÓY{,©b\u009fp\u0010G°U)(Ò>K\rìà\u0093ö3Å\u009bÛ\tb\u0082p\u000bG\u00adU\"(Ä>q\rìà£ö=Å¡Û\\®Å¼c\u0093\u0015f\u0084t\u0003KÔYK,û[£I?~\u0082l\u001b\u0011ý\u0007K4ÚÙ\u009dÏ\nü\u0095âeb\u0082p\u000bG\u00adU\"(Ä>q\rìà£ö Å¥ÛA®Á¼e\u0093\u001af\u009ct\u0003KÀYV,÷\u0002c\u0011\u0006b\u0080p\u0005G¡U!(Å>z\rüà£ö Å¶ÛW®Ã¼f\u0006<\u0014µ#\u00131\u009cLzZÏiR\u0084\u001d\u0092\u008f¡\u001e¿âÊ`ØÛ÷¹\u0002%\u0010½/}=îHGfÆu»\u0080\u0007\u009e\u0093\u00adl»Úb\u0091p\u0000G¼U>(Å>g\rûk\fy\u0090N)\\\u0081!A7ã\u0004vé\bÿ«Ì3dËvLAéS}.¢8/\u000b§æÀð`ÃüÝ:¨\u0082º8\u0095E`ÓrhM\u0088HêZhmÝ\u007fC\u0002 \u0014\u0018b\u0083p\u0001G»U#(Î>p\r×à\u0095ö4Å\u009bÛ^®Þ¼o\u0093\u001af\u009ct\u0003KÖYE,û\u0002i\u0011?ä·ú:ÉÓß`c0q©F.T\u0083){?Ò\fOá!÷¦Ä\u000bÚð¯f½Ì\u0092\u0082g\"u\u0087JvXýb\u0082p\u000bG\u00adU\"(Ä>q\rìà£ö2Å¥Û[®Ç¼_\u0093\u001df\u008cb\u0099p\u0000G\u0087U.(Á>w\rãk&y¯N\t\\\u0086!`7Õ\u0004Hé\u0007ÿ\u0092Ì\u0012Òó§fµÐ\u009a\u008fo%}\u009cP\u0093B\nu\u008dg \u001aØ\fq?ìÒ\u0082bÞp\u0013G½U (Ã>{\råà\u0099ö\u000fÅ·Û\\®Ç¼.\u0093\u0012f\u0081t0KÕY{,è\u0002~\u0011\u000fä¢ú!ÉØßu²öï ý\u0013Ê\u00adØ?¥\u0096³l\u0080ñm\u009e{fH´VA#Ï1x\u001e\u0006ëÐ\u0017À\u0005Q2ð e]\u0080K,x«\u0095Ô\u0083t°ö®\u0012Û\u008eÉ)æG\u0013Ð\u0001h>\u009e,\u0007Yº\u0004¼\u0016%!\u00823\u001dNüXAkÈ\u0086¦\u0090\u0000£\u008f½|ÈêÚFõ4\u0000½\u0012\r-ô?cJÑdLb\u0092p\u0005G»U'b\u0096p\u0016G·U\"(Ôb¶p(G\u0097U\u001bb\u0098p\u0010G¬U<(Ó>.\r§àÓöeÅ÷Û\f®Ï¼b\u0093Af\u008cthK\u0081YE,ý\u0002?\u0011VäàúzÉ\u0089ßv²³\u0081\u009e\u0097Zj¥xUOË]y0F\u0007\u0081\u0015nèûþ\u0015Í¢£9¶\u001a\u0085\u0090\u009b+n\u008c|\u0019S°&Â4\\\u000bï\u0019\u0005ì\u009cÂ Ñ»¤Øºf\u0089ü\u009f\u0004r©@2WV*\u00858.\u000fÓ\u001dMðïÇ\u0084ÕJ¨«¾)\u008dÎc`vúE\u0085[~.\u00ad<W\u0013\u0083á4ôAËØÙj¬\u0084\u0082\u0017\u0091\u00adg4zYIä_~2\u0088\u0000\"\u0017½êÌøXl\u009f~\u0004I½[%&Â0l\u0003©î·ø\u001eË\u009cÕN Ó²e\u009d2hÝziEÎW^\"í\fZ\u001f=ê¼ô\nÇèÑX¼Î\u008f\u009f\u0099\u0006d¸v@A\u0097SJ>\u0013\t¥\u001b\u0012æñðxÃÝ\u00ad@¸B\u008b®\u0095;`ör\u0013]á(Ë:-\u0005\u0085\u0017MâËF&T©c\u001cqÛ\f0\u001a\u0087)\u0002Ä\u001bÒ¡á\u0011ÿó\u008am\u0098Ï·ºB\u0002P\u0089o`}Í\b\u0012&Ã5õÀ\u0019Þ®ítûò\u0096D¥\u001b³£N\u0011\\Ækoyï\u0014²#w1\u0084Ì\u0018Úàéz\u0087Ù\u0092\u008d¡8¿\u0091JQXùwD\u0002\u0018\u0010¼/\u0011=ÒÈXæ\u0080K\u000fY\u0095n2|\u008d\u0001Q\u0017æ$rÉ!ß®ì\u0010òø\u0087m\u0095òº¾Oc]\u0099bSpÔ\u0005~+Ö8\u0087Í\rÓ¾àCöî\u009ba¨~¾\u0089C2QïfBtú\u0019\u0084.?<ÓÁF×ßäu\u008aî\u009f¿¬%²\u009cGRUíz\u007f\u000f\u0006\u001d°\">0ÇÅUëÄøp\u008d\u0012\u0093\u008f >¶î[kiæ~ú\u00030\u0011»&V4«Ùwî\fü\u0095\u0081.\u0097¼¤]Jõ_Pl\u0004r®\u00076\u0015Í:tÈ÷Ý\u0096â(ð \u0085b«ï¸HNèS\u0092`\fv\u00ad\u001b|)õ>\u0005Ã,Ñ\u0099æ=ôÅ\u0099w¯ß¼\u009aAeWÒd7\nÆ\u001fr-õ2¨Ç5ÕÅú2\u0088´\u009dU¢\u001f°\u0095E@kÐxy\u000eé\u0013k \u000b6 Û\u000féåþr\u008cà\u0091ú¦g´\u0096YPo÷|B\u0001\u0012\u0017\u0082$!Ê\u0098ßEíñò\u000e\u0087\u0006\u0095»º1Hç]Fc×p\u0091\u0005/+¼8bÎúÓGáÊö\u0082\u009b2©\u009f¾}LÅQ\u007ff\u0005t¨\u0019\u0016/Ð<]ÂË×\u0099äg\u008a\u0080\u009f\t\u00adÄ²a@ÏU\u009bz*\b¡\u001dn#È0YÅ\u007fë\u0094ø\b\u008e÷\u0093\\¡Ê¶|[ i\u0086~0\fç\u0011R'Æ4ºÙ\u0019ï\u0083ü>\u0082ö\u0097A¤1Jµ_#m±re\u0000þ\u0015|:?È\u008bÝ>ãúðo\u0086Å«ÿ¸!N¨Svaçv\u0000\u0004Ý)¼>\u0012Ì¸ÑEçÎô\u0000\u0099)¯ë¼\u0002BæWveÞ\n¤\u001f\u001e-¨2\u000eÀ¼Õ~û\u0089\u0088ä\u009d\t£Â°@F«kBx\f\u000e\u0090\u0013[!ï6 Äøéjþ;\u008c¬\u0091\u000e§Ý´IZýo²|\u0007\u0002\u0082\u0017h%ÓÊ\\ßuí\u0098ò\t\u0080\u009a\u0095t»\u009fH\u007f]xc\u0094p>\u0006Ì+y¼K®Þ\u0099`\u008b¨ö@àð!\u00033\u0090\u0004!\u0016¹k^}ëØ&Ê\u008dý<ï©\u0092O\u0084Ç·mZ\u0010L¶\u007f-aÝ\u0014\u0002\u0006í)\u0084Ü\\\u009f{\u008dðºA¨ÔÕ2Ã¶ð\u0006\u001dd\u000bÁ8_&¬S4A¢ný\u009bp\u0089Ì¶=¤\u0086Ñ\u0013ÿ\u0098ìù\u0019L\u0007Út=f\u008eQ?C§>@(õb¹p\nG»U#(Ä>q\rÌà\u0099ö<Å¥ÛA®É¼d\u0093;f\u0086t>KßYE,ê\u0002h\u0011\täºú/b¹p\nG»U#(Ä>q\rÞà\u0095ö4Å¡ÛW®þ¼e\u0093\u0017f\u0087t.KÔYM,ö\u0002k\u0011\u0013\bY\u001aê-[?ÃB$T\u0091g;\u008a\u007f\u009cÂ¯A±½Ä\"Ö²ùñ\fk\u001eÓ!\"3 F\u0011h\u0082{ç\u008eG&\u008a4\u0010\u0003¯\u00117lÓz`Iù¤\u0097²<b³p+G\u008aU\u001e(å>X\rÉà¨ö\u0019Å\u008bÛvb¢p!G\u009bU\u0003(ç>Z\rÁà¨ö\u0019Å\u008bÛv¹\u0087«\f\u009c®b\u0098p\u0010G¬U<(Ó>.\r§àÓö9ÅªÛ[®Ã¼d\u0093\u0011fÆt?KßYIt½f5Q\u0089C\u0019>ö(\u000b\u001b\u0082ööà\u001cÓ\u008fÍ~¸æªA\u00854pàb\n]áO`:Ú\u0014L\u00070ò\u0082ì@ßøÉE¤È\u0097ó\u0081 |\u008bnrYâK]&0\u0011²\u0003\u0010þ\u0080èiÛÔµ\u0003 :\u0093\u009a\u008d\fb\u0098p\u0010G¬U<(Ó>.\r§àÓö9ÅªÛ[®Ã¼d\u0093\u0011fÅt/KÄYE,ÿ\u0002i\u0011\u0015ä§úeÉÝß`²í\u0081Ö\u0097\u001fj´xUOÏ]y0^\u0007\u008d\u00156è¯þOÍð£m¶\b\u0085µ\u009b7nÌ|\u0002Sã&\u009b4\u0005?4-¼\u001a\u0000\b\u0090u\u007fc\u0082P\u000b½\u007f«\u0089\u0098\u001b\u0086ñórá\u0081Î«;!)\u0082\u0016j\u0004áqW_ÅLá¹\u0013§Ü\u0094c\u0082\u0092ï[Ü Ê¡7\u000b%ý\u0012*\u0000Ùm²Z+H\u009bµ\u0004£é\u0090LþÁë£Ø\bÆÆ3w!ï\u000eA".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1656);
        f4656h = cArr;
        f4658j = 2085684958817382500L;
    }
}
