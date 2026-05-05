package o.bs;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.n;
import o.a.o;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f21609a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21610b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f21611c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f21612d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f21613e = 0;

    private static String $$c(byte b2, int i2, byte b3) {
        byte[] bArr = $$a;
        int i3 = b2 * 2;
        int i4 = i2 + 99;
        int i5 = 4 - (b3 * 4);
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5++;
            i4 = (-i4) + i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i5++;
            i4 = (-bArr[i5]) + i4;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21613e = 0;
        f21609a = 1;
        f21611c = new char[]{38033, 8503, 65486, 46203, 16901, 6313, 54616, 25591, 38035, 8507, 65493, 46187, 16908, 6322, 38038, 8503, 65486, 46203, 38047, 8499, 65480, 46205, 16906, 6311, 54596, 25594, 14733, 63064, 36091, 23187, 5927, 60628, 22904, 34691, 52278, 14913, 24812, 44303, 7089, 16858, 36380, 62629, 8912, 28526, 54658, 563, 18524, 46778, 58162, 10581, 38896, 21740, 57674, 16309, 29703, 33344, 55506, 5427, 38033, 8503, 65480, 46202, 16957, 6314, 54603, 25580, 14775, 63066, 35161, 15615, 57856, 43442, 24565, 1388, 51339, 32296, 38046, 8505, 65492, 46201, 16907, 6322, 54623, 25578, 14775, 60209, 24192, 32891, 38042, 8511, 65501, 46198, 16957, 6320, 54603, 25570, 14759, 63059};
        f21612d = -2398465292892495530L;
        f21610b = -1270219345;
    }

    c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0129, code lost:
    
        if (r24.d(((java.lang.String) r1[0]).intern()) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x012b, code lost:
    
        r1 = new java.lang.Object[1];
        g(8 - android.view.View.MeasureSpec.getSize(0), "\ufff6\u0001\ufff8\u0005\u0005\b\ufff6\f", true, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 289, android.view.KeyEvent.getDeadChar(0, 0) + 7, r1);
        r17 = new java.lang.Object[]{r24, ((java.lang.String) r1[0]).intern()};
        r21 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = r21;
        r22 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = r22;
        r18 = new java.lang.Object[]{r6, o.ei.c.c(((java.lang.Integer) o.ef.a.a(1122077797, r17, (int) android.os.SystemClock.elapsedRealtime(), new java.util.Random().nextInt(1747993327), -1122077791, r21, r22)).intValue())};
        r20 = new java.util.Random().nextInt();
        r22 = java.lang.Thread.currentThread().getPriority();
        r16 = new java.util.Random().nextInt(394647635);
        r17 = o.dq.c.f23265y * (-1625678718);
        o.dq.c.f23265y = r17;
        o.dq.c.e(r16, r17, r18, 2100515447, r20, -2100515436, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x01bc, code lost:
    
        r1 = new java.lang.Object[1];
        f((char) android.graphics.Color.green(0), 15 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 3 - android.text.TextUtils.lastIndexOf("", '0'), r1);
        r18 = new java.lang.Object[]{r6, r24.e(((java.lang.String) r1[0]).intern(), true)};
        r8 = (int) java.lang.Thread.currentThread().getId();
        r22 = java.lang.Thread.currentThread().getPriority();
        r16 = android.os.Process.myUid();
        r17 = o.dq.c.F * 1706170942;
        o.dq.c.F = r17;
        o.dq.c.e(r16, r17, r18, -2081493663, r8, 2081493681, r22);
        r1 = new java.lang.Object[1];
        f((char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 17, android.os.Process.getGidForName("") + 14, r1);
        r6.c(r24.s(((java.lang.String) r1[0]).intern()));
        r1 = new java.lang.Object[1];
        f((char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30795), 31 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 19 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), r1);
        r18 = new java.lang.Object[]{r6, r24.s(((java.lang.String) r1[0]).intern())};
        r20 = o.dq.c.ac * 1323193544;
        o.dq.c.ac = r20;
        r22 = new java.util.Random().nextInt();
        r8 = (int) java.lang.Thread.currentThread().getId();
        r17 = o.dq.c.Z * (-636728898);
        o.dq.c.Z = r17;
        o.dq.c.e(r8, r17, r18, 295617363, r20, -295617336, r22);
        r1 = new java.lang.Object[1];
        f((char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 49277), 50 - android.widget.ExpandableListView.getPackedPositionChild(0), 6 - android.text.TextUtils.lastIndexOf("", '0'), r1);
        r18 = new java.lang.Object[]{r6, r24.s(((java.lang.String) r1[0]).intern())};
        r20 = o.dq.c.aa * 1028486063;
        o.dq.c.aa = r20;
        r22 = android.os.Process.myPid();
        r16 = o.dq.c.ad * 1511617071;
        o.dq.c.ad = r16;
        r17 = o.dq.c.ae * (-456636140);
        o.dq.c.ae = r17;
        o.dq.c.e(r16, r17, r18, -1484062829, r20, 1484062858, r22);
        r1 = new java.lang.Object[1];
        f((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 1), 58 - android.text.TextUtils.getCapsMode("", 0, 0), 10 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), r1);
        r18 = new java.lang.Object[]{r6, r24.s(((java.lang.String) r1[0]).intern())};
        r20 = android.os.Process.myTid();
        r22 = o.dq.c.I * (-1080485619);
        o.dq.c.I = r22;
        r16 = o.dq.c.G * 1126145498;
        o.dq.c.G = r16;
        r17 = o.dq.c.N * 1706398790;
        o.dq.c.N = r17;
        o.dq.c.e(r16, r17, r18, 1732468454, r20, -1732468435, r22);
        r1 = new java.lang.Object[1];
        f((char) (android.view.View.resolveSizeAndState(0, 0, 0) + 7624), android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 69, 8 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), r1);
        r6.e(r24.s(((java.lang.String) r1[0]).intern()));
        r1 = new java.lang.Object[1];
        g(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 16, "\ufffe\u0000\u000b\n\ufffa\ufff8\t\ufffb\ufff6\u0003\ufff8\n\u000b\ufff6\ufffb\u0000", false, 285 - android.view.Gravity.getAbsoluteGravity(0, 0), 4 - (android.os.Process.myPid() >> 22), r1);
        r6.a(r24.s(((java.lang.String) r1[0]).intern()));
        r1 = new java.lang.Object[1];
        g((android.os.Process.myTid() >> 22) + 21, "\f\t\ufffa￼\ufffa\ufff8\t\ufffb\ufff6\ufffe\t\ufff8\u0007\uffff\u0000\ufffa\ufff6\t￼\n\u0006", false, 285 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 4 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), r1);
        r6.h(r24.s(((java.lang.String) r1[0]).intern()));
        r1 = new java.lang.Object[1];
        g((android.view.KeyEvent.getMaxKeyCode() >> 16) + 8, "\n\u0004\u0007￼\ufff9\ufffe\ufff4\u0005", true, 287 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 3 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), r1);
        r6.o(r24.s(((java.lang.String) r1[0]).intern()));
        r1 = new java.lang.Object[1];
        g(android.view.MotionEvent.axisFromString("") + 12, "\u0007\ufff6\u0003\ufff8\ufff9￼\u0003\ufffe\t\u0006\f", false, 285 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), 6 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), r1);
        r6.k(r24.s(((java.lang.String) r1[0]).intern()));
        r1 = new java.lang.Object[1];
        g(18 - android.widget.ExpandableListView.getPackedPositionGroup(0), "\ufff6\ufff8\u0007\u0007\u0003\u0000\ufffa\ufff8\u000b\u0000\u0006\u0005\ufff6\u0000\ufffb￼\u0004\r", false, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 285, android.graphics.Color.green(0) + 15, r1);
        r18 = new java.lang.Object[]{r6, r24.s(((java.lang.String) r1[0]).intern())};
        r20 = o.dq.c.f23255o * (-1462558457);
        o.dq.c.f23255o = r20;
        r22 = o.dq.c.f23252l * (-431129044);
        o.dq.c.f23252l = r22;
        o.dq.c.e(java.lang.Thread.currentThread().getPriority(), (int) java.lang.Runtime.getRuntime().maxMemory(), r18, 561374006, r20, -561374001, r22);
        r1 = new java.lang.Object[1];
        g(android.text.TextUtils.getCapsMode("", 0, 0) + 8, "\ufff9\ufffa\u0001\ufff6\t\ufffe\t\n", false, (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory.TagWbGLevel, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 3, r1);
        r6.c(r24.b(((java.lang.String) r1[0]).intern(), java.lang.Double.valueOf(-1.0d)).doubleValue());
        r1 = new java.lang.Object[1];
        f((char) android.view.KeyEvent.keyCodeFromString(""), (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 75, 8 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), r1);
        r6.a(r24.b(((java.lang.String) r1[0]).intern(), java.lang.Double.valueOf(-1.0d)).doubleValue());
        r1 = new java.lang.Object[1];
        g((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 11, "\f\ufffb\u0006\r\ufffe￼￡\u0004\ufff9\u0006\u0007\u0001", true, 284 - android.text.TextUtils.indexOf("", ""), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 5, r1);
        r17 = new java.lang.Object[]{r24, ((java.lang.String) r1[0]).intern(), r25};
        r21 = o.ef.a.f23773g * 1081559339;
        o.ef.a.f23773g = r21;
        r8 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r18 = o.ef.a.f23772f * (-1705304066);
        o.ef.a.f23772f = r18;
        r18 = new java.lang.Object[]{r6, (java.lang.String) o.ef.a.a(1581939473, r17, r18, (int) android.os.SystemClock.uptimeMillis(), -1581939469, r21, r8)};
        r20 = o.dq.c.R * 165990070;
        o.dq.c.R = r20;
        r22 = android.os.Process.myUid();
        r16 = o.dq.c.T * 56027633;
        o.dq.c.T = r16;
        o.dq.c.e(r16, android.os.Process.myTid(), r18, -872378002, r20, 872378025, r22);
        r1 = new java.lang.Object[1];
        g((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5, "\u0006\u0004\ufff6\u0003\u0005�", true, 291 - android.text.TextUtils.indexOf("", "", 0, 0), android.os.Process.getGidForName("") + 5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x05af, code lost:
    
        if (r24.d(((java.lang.String) r1[0]).intern()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x05b1, code lost:
    
        r1 = new java.lang.Object[1];
        g((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6, "\u0006\u0004\ufff6\u0003\u0005�", true, 291 - android.text.TextUtils.getOffsetAfter("", 0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, r1);
        r17 = new java.lang.Object[]{r24, ((java.lang.String) r1[0]).intern()};
        r21 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = r21;
        r22 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = r22;
        r6.e(o.dq.e.d(((java.lang.Integer) o.ef.a.a(1122077797, r17, (int) android.os.SystemClock.elapsedRealtime(), new java.util.Random().nextInt(1747993327), -1122077791, r21, r22)).intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0619, code lost:
    
        r1 = new java.lang.Object[1];
        f((char) (android.text.TextUtils.getTrimmedLength("") + 32674), 84 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), 4 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0641, code lost:
    
        if (r24.d(((java.lang.String) r1[0]).intern()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0643, code lost:
    
        r2 = o.bs.c.f21609a + 9;
        o.bs.c.f21613e = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x064d, code lost:
    
        if ((r2 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x064f, code lost:
    
        r1 = new java.lang.Object[1];
        f((char) (27170 << (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 15 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '7', 0), 4 << (android.view.ViewConfiguration.getMaximumFlingVelocity() % 111), r1);
        r17 = new java.lang.Object[]{r24, ((java.lang.String) r1[0]).intern()};
        r21 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = r21;
        r22 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = r22;
        r1 = o.ef.a.a(1122077797, r17, (int) android.os.SystemClock.elapsedRealtime(), new java.util.Random().nextInt(1747993327), -1122077791, r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x06a5, code lost:
    
        r6.b(((java.lang.Integer) r1).intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x06ae, code lost:
    
        r1 = new java.lang.Object[1];
        g((android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 3, "\u0000\ufff5\u0004\t", false, 292 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.widget.ExpandableListView.getPackedPositionType(0) + 2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x06e0, code lost:
    
        if (r24.d(((java.lang.String) r1[0]).intern()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x06e2, code lost:
    
        r1 = new java.lang.Object[1];
        g((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, "\u0000\ufff5\u0004\t", false, android.os.Process.getGidForName("") + 293, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2, r1);
        r16 = new java.lang.Object[]{r24, ((java.lang.String) r1[0]).intern()};
        r20 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = r20;
        r21 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = r21;
        r16 = new java.lang.Object[]{r6, o.dq.d.a(((java.lang.Integer) o.ef.a.a(1122077797, r16, (int) android.os.SystemClock.elapsedRealtime(), new java.util.Random().nextInt(1747993327), -1122077791, r20, r21)).intValue())};
        r18 = new java.util.Random().nextInt(1759596137);
        r20 = android.os.Process.myTid();
        r14 = o.dq.c.ag * 1555996728;
        o.dq.c.ag = r14;
        r15 = o.dq.c.ah * (-805012015);
        o.dq.c.ah = r15;
        o.dq.c.e(r14, r15, r16, 1891140439, r18, -1891140408, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0777, code lost:
    
        r1 = new java.lang.Object[1];
        f((char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1))), 88 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (-16777206) - android.graphics.Color.rgb(0, 0, 0), r1);
        r15 = new java.lang.Object[]{r24, ((java.lang.String) r1[0]).intern(), java.lang.Boolean.FALSE};
        r19 = new java.util.Random().nextInt();
        r20 = o.ef.a.f23781o * (-1229447468);
        o.ef.a.f23781o = r20;
        r16 = android.os.Process.myUid();
        r17 = o.ef.a.f23784r * 1570495625;
        o.ef.a.f23784r = r17;
        r6.a(((java.lang.Boolean) o.ef.a.a(821341192, r15, r16, r17, -821341184, r19, r20)).booleanValue());
        r1 = new java.lang.Object[1];
        g(20 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), "\t\u0004\ufff7\b\n\ufff5\ufffb\u0004\uffff\u0002￼￼\u0005\u0004\u0005\uffff\n\ufff9\ufff7", true, 287 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), android.graphics.Color.rgb(0, 0, 0) + 16777229, r1);
        r15 = new java.lang.Object[]{r24, ((java.lang.String) r1[0]).intern(), java.lang.Boolean.FALSE};
        r19 = new java.util.Random().nextInt();
        r20 = o.ef.a.f23781o * (-1229447468);
        o.ef.a.f23781o = r20;
        r16 = android.os.Process.myUid();
        r17 = o.ef.a.f23784r * 1570495625;
        o.ef.a.f23784r = r17;
        r6.c(((java.lang.Boolean) o.ef.a.a(821341192, r15, r16, r17, -821341184, r19, r20)).booleanValue());
        r1 = new java.lang.Object[1];
        g(19 - android.text.TextUtils.indexOf("", "", 0, 0), "\u0004\u0005\ufffa\ufffb\b\uffff\u000b\u0007\ufffb\b\ufff5\u0004\uffff\u0006\ufff5\ufffb\u0004\uffff\u0002", true, 286 - android.view.Gravity.getAbsoluteGravity(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2, r1);
        r15 = new java.lang.Object[]{r24, ((java.lang.String) r1[0]).intern(), java.lang.Boolean.FALSE};
        r19 = new java.util.Random().nextInt();
        r20 = o.ef.a.f23781o * (-1229447468);
        o.ef.a.f23781o = r20;
        r16 = android.os.Process.myUid();
        r17 = o.ef.a.f23784r * 1570495625;
        o.ef.a.f23784r = r17;
        r6.b(((java.lang.Boolean) o.ef.a.a(821341192, r15, r16, r17, -821341184, r19, r20)).booleanValue());
        r12 = new java.lang.Object[1];
        g(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 18, "\ufff6\u0003￼\ufffe\b\ufff9\ufffa\u0007\ufffe\n\u0006\ufffa\u0007\ufff4\ufffa\u0007\n\t", true, android.view.View.resolveSize(0, 0) + com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory.TagWbGLevel, android.text.TextUtils.lastIndexOf("", '0') + 6, r12);
        r15 = new java.lang.Object[]{r24, ((java.lang.String) r12[0]).intern(), java.lang.Boolean.FALSE};
        r19 = new java.util.Random().nextInt();
        r20 = o.ef.a.f23781o * (-1229447468);
        o.ef.a.f23781o = r20;
        r16 = android.os.Process.myUid();
        r17 = o.ef.a.f23784r * 1570495625;
        o.ef.a.f23784r = r17;
        r9 = new java.lang.Object[]{r6, java.lang.Boolean.valueOf(((java.lang.Boolean) o.ef.a.a(821341192, r15, r16, r17, -821341184, r19, r20)).booleanValue())};
        r11 = (int) java.lang.Runtime.getRuntime().totalMemory();
        r13 = (int) java.lang.Runtime.getRuntime().freeMemory();
        r7 = o.dq.c.E * (-529545878);
        o.dq.c.E = r7;
        o.dq.c.e(r7, new java.util.Random().nextInt(), r9, -1584129099, r11, 1584129115, r13);
        r1 = new java.lang.Object[1];
        g(10 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), "\ufff8\u0002�\ufffb\u0002\u0007�\u0002\u0007\u0000", false, (android.os.Process.myTid() >> 22) + 283, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 3, r1);
        r6.s(r24.s(((java.lang.String) r1[0]).intern()));
        r12 = new java.lang.Object[1];
        g((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, "\b￩\r\u0007\ufffa\u0001￼\u000b\ufffe\u0006\ufffe�\bￜ\u0005\ufffa\r\f", true, android.view.View.resolveSize(0, 0) + 283, android.widget.ExpandableListView.getPackedPositionType(0) + 10, r12);
        r6.m(r24.s(((java.lang.String) r12[0]).intern()));
        r1 = o.bs.c.f21609a + 47;
        o.bs.c.f21613e = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0987, code lost:
    
        if ((r1 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0989, code lost:
    
        r0 = 2 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x098b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x098c, code lost:
    
        r1 = new java.lang.Object[1];
        f((char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32673), 84 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), 3 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), r1);
        r17 = new java.lang.Object[]{r24, ((java.lang.String) r1[0]).intern()};
        r21 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = r21;
        r22 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = r22;
        r1 = o.ef.a.a(1122077797, r17, (int) android.os.SystemClock.elapsedRealtime(), new java.util.Random().nextInt(1747993327), -1122077791, r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0a39, code lost:
    
        if (r2 == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0a3d, code lost:
    
        r4 = new java.lang.StringBuilder();
        r3 = new java.lang.Object[1];
        g(android.text.TextUtils.indexOf("", "") + 18, "\u0013\b\u0006\u0017\b\u0007ￃ\ufff9\u0004\u000f\u0018\b\uffddￃ\ufff8\u0011\b\u001b", false, (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 272, 15 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0a7c, code lost:
    
        throw new java.lang.UnsupportedOperationException(r4.append(((java.lang.String) r3[0]).intern()).append(r2).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006f, code lost:
    
        if (r2 == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0071, code lost:
    
        r6 = new o.dq.c();
        r19 = android.os.Process.myTid();
        r21 = android.os.Process.myUid();
        r15 = o.dq.c.V * 2054036048;
        o.dq.c.V = r15;
        r16 = o.dq.c.W * 702719824;
        o.dq.c.W = r16;
        o.dq.c.e(r15, r16, new java.lang.Object[]{r6, r25}, -1624624042, r19, 1624624066, r21);
        r1 = new java.lang.Object[1];
        f((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.getTrimmedLength("") + 8, android.view.KeyEvent.getDeadChar(0, 0) + 6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00c3, code lost:
    
        if (r24.d(((java.lang.String) r1[0]).intern()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00c5, code lost:
    
        r1 = new java.lang.Object[1];
        f((char) android.text.TextUtils.getTrimmedLength(""), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, android.graphics.ImageFormat.getBitsPerPixel(0) + 7, r1);
        r6.d(r24.o(((java.lang.String) r1[0]).intern()).abs());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00f0, code lost:
    
        r1 = new java.lang.Object[1];
        g((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 7, "\ufff6\u0001\ufff8\u0005\u0005\b\ufff6\f", true, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + com.drew.metadata.exif.makernotes.OlympusRawInfoMakernoteDirectory.TagWbRbLevelsFineWeather, 7 - android.graphics.Color.blue(0), r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static o.dq.c e(o.ef.a r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bs.c.e(o.ef.a, java.lang.String):o.dq.c");
    }

    private static void f(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        int i5 = $10 + 111;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (oVar.f19947b < i3) {
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f21611c[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(MotionEvent.axisFromString("") + 743, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.getTrimmedLength("") + 12, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f21612d), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(766 - Color.alpha(0), (char) (12469 - TextUtils.lastIndexOf("", '0')), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12, 1946853218, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(View.combineMeasuredStates(0, 0) + 387, (char) TextUtils.getCapsMode("", 0, 0), 18 - (ViewConfiguration.getTapTimeout() >> 16), 39570797, false, $$c(b6, (byte) ((b6 + 6) - (6 & b6)), b6), new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 39;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    objA4 = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 387, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 18 - TextUtils.indexOf("", "", 0), 39570797, false, $$c(b7, (byte) (6 | b7), b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr6 = {oVar, oVar};
            Object objA5 = o.d.d.a(-723636472);
            if (objA5 == null) {
                byte b8 = (byte) 0;
                objA5 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + 388, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 18 - TextUtils.getOffsetAfter("", 0), 39570797, false, $$c(b8, (byte) (6 | b8), b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    private static void g(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        int i6 = $10 + 65;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f21610b)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(270 - (KeyEvent.getMaxKeyCode() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, -2071844881, false, $$c(b2, (byte) ((b2 + 16) - (16 & b2)), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(522 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), 12 - (Process.myTid() >> 22), 627984172, false, $$c(b3, (byte) (14 | b3), b3), new Class[]{Object.class, Object.class});
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
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
            int i9 = $11 + 101;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        if (z2) {
            int i11 = $11 + 27;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 522, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 12 - (KeyEvent.getMaxKeyCode() >> 16), 627984172, false, $$c(b4, (byte) ((b4 + Ascii.SO) - (14 & b4)), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{112, 68, MessagePack.Code.BIN8, -81};
        $$b = 165;
    }
}
