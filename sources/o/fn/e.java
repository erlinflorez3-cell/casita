package o.fn;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.util.Date;
import o.ef.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short[] f26121a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26122b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26123c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static byte[] f26124d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f26125e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26126g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26127h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26128i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26129j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, int r10, int r11) {
        /*
            byte[] r8 = o.fn.e.$$a
            int r2 = r9 + 4
            int r3 = r11 * 4
            int r0 = 1 - r3
            int r1 = r10 + 103
            byte[] r7 = new byte[r0]
            r6 = 0
            int r5 = 0 - r3
            if (r8 != 0) goto L2b
            r0 = r2
            r3 = r5
            r4 = r6
        L14:
            int r1 = -r2
            int r1 = r1 + r3
            r3 = r4
            r2 = r0
        L18:
            int r0 = r2 + 1
            byte r2 = (byte) r1
            r7[r3] = r2
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r6)
            return r0
        L27:
            r2 = r8[r0]
            r3 = r1
            goto L14
        L2b:
            r3 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fn.e.$$c(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26129j = 0;
        f26127h = 1;
        f26126g = 0;
        f26128i = 1;
        c();
        SystemClock.elapsedRealtime();
        TextUtils.indexOf("", "", 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ViewConfiguration.getJumpTapTimeout();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.indexOf((CharSequence) "", '0');
        Process.getThreadPriority(0);
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getDoubleTapTimeout();
        AndroidCharacter.getMirror('0');
        KeyEvent.getMaxKeyCode();
        TextUtils.lastIndexOf("", '0', 0, 0);
        View.MeasureSpec.getMode(0);
        TextUtils.lastIndexOf("", '0');
        View.resolveSizeAndState(0, 0, 0);
        SystemClock.currentThreadTimeMillis();
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getEdgeSlop();
        KeyEvent.keyCodeFromString("");
        ImageFormat.getBitsPerPixel(0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        KeyEvent.keyCodeFromString("");
        Color.alpha(0);
        Process.getGidForName("");
        TextUtils.indexOf("", "");
        int i2 = f26127h + 29;
        f26129j = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void c() {
        f26125e = 1050886966;
        f26123c = 1150422505;
        f26122b = 696450022;
        f26124d = new byte[]{-106, 88, -126, -97, 87, -103, 119, 117, 112, -118, 120, -125, 126, -121, -103, 109, -126, -97, 87, -103, 119, 124, -98, MessagePack.Code.FIXARRAY_PREFIX, 70, -118, -124, 116, 117, -66, 92, -126, -97, 87, -103, 119, 124, -98, MessagePack.Code.FIXARRAY_PREFIX, 81, 120, -125, 126, -127, -116, -98, 83, -126, -97, 87, -103, 119, 120, 122, -88, 86, -101, 119, 112, 112, -110, 100, 116, -120, 123, -115, -125, -113, 121, 112, -81, 81, -126, -97, 87, -103, 119, -115, -115, -115, -115, -115};
    }

    public static a d(c cVar) throws Throwable {
        int i2 = 2 % 2;
        a aVar = new a();
        Object[] objArr = new Object[1];
        f((short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-2050051771) - View.MeasureSpec.getMode(0), (-1829828096) - TextUtils.indexOf("", "", 0, 0), (-93) - TextUtils.indexOf((CharSequence) "", '0'), (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        c.f26114e = c.f26114e * 1488666621;
        c.f26111b = c.f26111b * (-93354780);
        c.f26113d = c.f26113d * (-729426029);
        aVar.a(strIntern, c.b(new Object[]{cVar}, r13, 1651825128, iUptimeMillis, r16, r17, -1651825128));
        Object[] objArr2 = new Object[1];
        f((short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0) - 2050051764, KeyEvent.normalizeMetaState(0) - 1829828096, (-84) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) ExpandableListView.getPackedPositionType(0L), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        int i3 = c.f26112c * (-665734691);
        c.f26112c = i3;
        int id = (int) Thread.currentThread().getId();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i4 = c.f26110a * 798041572;
        c.f26110a = i4;
        aVar.c(strIntern2, ((Integer) c.b(new Object[]{cVar}, i4, -682160894, i3, id, iMaxMemory, 682160895)).intValue());
        if (cVar.d() != null) {
            int i5 = f26128i + 117;
            f26126g = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr3 = new Object[1];
            f((short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-2050051750) - ExpandableListView.getPackedPositionType(0L), (-1829828096) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-84) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) Color.alpha(0), objArr3);
            aVar.c(((String) objArr3[0]).intern(), cVar.d().getTime());
        }
        if (cVar.b() != null) {
            Object[] objArr4 = new Object[1];
            f((short) View.resolveSizeAndState(0, 0, 0), ExpandableListView.getPackedPositionChild(0L) - 2050051734, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1829828096, (-83) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr4);
            aVar.c(((String) objArr4[0]).intern(), cVar.b().getTime());
        }
        int i7 = f26128i + 73;
        f26126g = i7 % 128;
        int i8 = i7 % 2;
        return aVar;
    }

    public static c d(a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        f((short) (ViewConfiguration.getScrollBarSize() >> 8), Color.rgb(0, 0, 0) - 2033274555, (-1829828096) - View.getDefaultSize(0, 0), (-91) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) ExpandableListView.getPackedPositionGroup(0L), objArr);
        String strS = aVar.s(((String) objArr[0]).intern());
        if (strS == null) {
            int i3 = f26128i + 67;
            f26126g = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        Object[] objArr2 = new Object[1];
        f((short) (TextUtils.indexOf((CharSequence) "", '0') + 1), TextUtils.lastIndexOf("", '0') - 2050051763, Gravity.getAbsoluteGravity(0, 0) - 1829828096, (-85) - TextUtils.getOffsetAfter("", 0), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
        Object[] objArr3 = {aVar, ((String) objArr2[0]).intern(), 0};
        int priority = Thread.currentThread().getPriority();
        int i5 = a.f23777k * (-845283131);
        a.f23777k = i5;
        int iIntValue = ((Integer) a.a(1647814368, objArr3, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority, i5)).intValue();
        Object[] objArr4 = new Object[1];
        f((short) View.resolveSizeAndState(0, 0, 0), (-2050051750) - Color.argb(0, 0, 0, 0), (-1829828096) - (ViewConfiguration.getFadingEdgeLength() >> 16), View.combineMeasuredStates(0, 0) - 84, (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), objArr4);
        Date dateE = aVar.e(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        f((short) View.MeasureSpec.getMode(0), (Process.myPid() >> 22) - 2050051735, (-1829828095) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) - 82, (byte) TextUtils.getOffsetAfter("", 0), objArr5);
        c cVar = new c(strS, iIntValue, dateE, aVar.e(((String) objArr5[0]).intern(), true));
        int i6 = f26126g + 107;
        f26128i = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 35 / 0;
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2 A[PHI: r7
  0x00a2: PHI (r7v20 byte[] A[IMMUTABLE_TYPE]) = (r7v4 byte[]), (r7v22 byte[]) binds: [B:26:0x010a, B:16:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fn.e.f(short, int, int, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
        $$b = 152;
    }
}
