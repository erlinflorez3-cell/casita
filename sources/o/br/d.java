package o.br;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
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
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusRawInfoMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.n;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f21571a = 0;

    /* JADX INFO: renamed from: c */
    private static int f21572c = 0;

    /* JADX INFO: renamed from: d */
    private static long f21573d = 0;

    /* JADX INFO: renamed from: e */
    private static char[] f21574e = null;

    /* JADX INFO: renamed from: g */
    private static int f21575g = 0;

    /* JADX INFO: renamed from: i */
    private static int f21576i = 0;

    /* JADX INFO: renamed from: j */
    private static int f21577j = 0;

    /* JADX INFO: renamed from: b */
    private final o.ef.a f21578b;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, int r10, int r11) {
        /*
            int r0 = r11 * 4
            int r8 = 1 - r0
            int r0 = r10 * 4
            int r7 = r0 + 4
            byte[] r6 = o.br.d.$$a
            int r0 = 115 - r9
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r6 != 0) goto L27
            r1 = r7
            r3 = r4
        L13:
            int r7 = r7 + r0
            int r1 = r1 + 1
            r2 = r3
        L17:
            byte r0 = (byte) r7
            int r3 = r2 + 1
            r5[r2] = r0
            if (r3 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r0 = r6[r1]
            goto L13
        L27:
            r2 = r4
            r1 = r7
            r7 = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.br.d.$$c(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21575g = 0;
        f21577j = 1;
        f21572c = 0;
        f21576i = 1;
        h();
        ViewConfiguration.getTapTimeout();
        Color.rgb(0, 0, 0);
        ExpandableListView.getPackedPositionType(0L);
        PointF.length(0.0f, 0.0f);
        View.getDefaultSize(0, 0);
        ViewConfiguration.getKeyRepeatTimeout();
        Color.blue(0);
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getWindowTouchSlop();
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getKeyRepeatDelay();
        ViewConfiguration.getTapTimeout();
        KeyEvent.getMaxKeyCode();
        Gravity.getAbsoluteGravity(0, 0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewConfiguration.getMaximumFlingVelocity();
        ViewConfiguration.getGlobalActionKeyTimeout();
        Process.getElapsedCpuTime();
        Process.getGidForName("");
        MotionEvent.axisFromString("");
        KeyEvent.normalizeMetaState(0);
        TextUtils.indexOf("", "", 0);
        ExpandableListView.getPackedPositionGroup(0L);
        TextUtils.getOffsetBefore("", 0);
        Process.getGidForName("");
        Color.green(0);
        KeyEvent.getDeadChar(0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        Gravity.getAbsoluteGravity(0, 0);
        ExpandableListView.getPackedPositionType(0L);
        Color.argb(0, 0, 0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        PointF.length(0.0f, 0.0f);
        Process.myTid();
        ViewConfiguration.getDoubleTapTimeout();
        Color.red(0);
        int i2 = f21577j + 63;
        f21575g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:173|115|116|183|117|(4:118|(1:120)(1:185)|157|158)|121|179|122|156|157|158) */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0267: MOVE (r3 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:160:0x0265 */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.content.Context r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.br.d.<init>(android.content.Context):void");
    }

    private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 73;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i7 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(f21571a)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 270, (char) (ViewConfiguration.getTapTimeout() >> 16), 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 522;
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 12;
                    byte b4 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 15)));
                    byte b5 = (byte) (b4 - 2);
                    objA2 = o.d.d.a(maximumDrawingCacheSize, cIndexOf, scrollBarSize, 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            int i8 = $10 + 5;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i10 = $10 + 65;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    int mirror = AndroidCharacter.getMirror('0') + 474;
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int i12 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13;
                    byte b6 = (byte) ($$b & 15);
                    byte b7 = (byte) (b6 - 2);
                    objA3 = o.d.d.a(mirror, threadPriority, i12, 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i13 = $10 + 23;
                $11 = i13 % 128;
                int i14 = i13 % 2;
            }
            cArr2 = cArr4;
        }
        String str3 = new String(cArr2);
        int i15 = $11 + 117;
        $10 = i15 % 128;
        int i16 = i15 % 2;
        objArr[0] = str3;
    }

    static void h() {
        f21571a = -1270219354;
        f21574e = new char[]{36439, 59339, 23884, 51214, 41347, 6915, 62597, 28197, 51154, 45407, 10985, 33906, 32271, 55179, 16677, 15026, 37956, 3570, 59244, 20657, 51775, 42055, 7641, 63333, 24755, 55891, 46016, 11629, 34551, 28812, 59933, 17337, 15667, 38596, 'V', 63913, 21359, 52467, 42692, 4123, 35245, 25383, 56448, 46679, 12257, 39274, 29442, 60569, 44743, 51018, 32202, 37451, 2293, 41241, 55199, 19499, 58041, 6356, 45395, 10182, 23675, 62093, 27412, 33192, 13879, 44202, 49884, 31580, 37368, 1650, 48261, 54551, 19432, 57466, 5638, 36051, 9581, 23521, 61447, 26259, 40737, 13756, 43579, 49165, 30431, 61284, 1524, 47631, 53393, 18720, 65443, 5591, 35413, 8439, 22907, 53134, 25630, 39647, 13088, 43442, 57304, 29723, 60142, 892, 47502, 11806, 17576, 64816, 4928, 24518, 13899, 36039, 25457, 63983, 20510, 9880, 48406, 5034, 38042, 64784, 18335, 46393, 56505, 26162, 35216, 4872, 47868, 52338, 22497, 63826, 816, 43684, 15384, 18319, 59759, 28867, 39517};
        f21573d = 2692371092084620669L;
    }

    static void init$0() {
        $$a = new byte[]{91, 84, -6, Ascii.ETB};
        $$b = 82;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(char r21, int r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.br.d.k(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0015, code lost:
    
        if (r15.f21578b == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0017, code lost:
    
        r1 = r3 + 67;
        o.br.d.f21572c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x001e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0021, code lost:
    
        if (r15.f21578b == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0025, code lost:
    
        r1 = r15.f21578b;
        r13 = new java.lang.Object[1];
        f((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 13, "\b\u0002\r\ufffa￼\u0002\u0005\t\t\ufffa�￢\u0007", true, android.graphics.Color.blue(0) + com.drew.metadata.exif.makernotes.OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, android.graphics.Color.red(0) + 10, r13);
        r9 = new java.lang.Object[]{r1, ((java.lang.String) r13[0]).intern()};
        r13 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return (java.lang.String) o.ef.a.a(-781664457, r9, java.lang.Thread.activeCount(), (int) android.os.SystemClock.elapsedRealtime(), 781664467, r13, java.lang.Thread.currentThread().getPriority());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (o.ea.f.a() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        r13 = new java.lang.Object[1];
        f(28 - android.widget.ExpandableListView.getPackedPositionType(0), "\u0002\uffff\u0007\bￜ\ufffe\u0005\u0002\uffdf\t\tￚ\u000b\ufffe�\u0002\u000f\b\u000b￩\u0007\b\u0002\r\ufffa\u000b\u000e\u0000", true, 292 - android.graphics.Color.red(0), android.widget.ExpandableListView.getPackedPositionChild(0) + 13, r13);
        r6 = ((java.lang.String) r13[0]).intern();
        r0 = new java.lang.Object[1];
        k((char) (android.graphics.Color.green(0) + 23707), android.text.TextUtils.getTrimmedLength("") + 3, 45 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), r0);
        o.ea.f.d(r6, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
    
        return null;
     */
    @Override // o.br.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() throws java.lang.Throwable {
        /*
            r15 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = o.br.d.f21572c
            int r0 = r0 + 119
            int r3 = r0 % 128
            o.br.d.f21576i = r3
            int r0 = r0 % r4
            r7 = 0
            r2 = 0
            if (r0 != 0) goto L1f
            o.ef.a r1 = r15.f21578b
            r0 = 25
            int r0 = r0 / r2
            if (r1 != 0) goto L24
        L17:
            int r1 = r3 + 67
            int r0 = r1 % 128
            o.br.d.f21572c = r0
            int r1 = r1 % r4
            return r7
        L1f:
            o.ef.a r0 = r15.f21578b
            if (r0 != 0) goto L24
            goto L17
        L24:
            r3 = 1
            o.ef.a r1 = r15.f21578b     // Catch: o.ef.b -> L75
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()     // Catch: o.ef.b -> L75
            int r0 = r0 >> 16
            int r8 = r0 + 13
            java.lang.String r9 = "\b\u0002\r\ufffa￼\u0002\u0005\t\t\ufffa�￢\u0007"
            int r0 = android.graphics.Color.blue(r2)     // Catch: o.ef.b -> L75
            int r11 = r0 + 292
            int r0 = android.graphics.Color.red(r2)     // Catch: o.ef.b -> L75
            int r12 = r0 + 10
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch: o.ef.b -> L75
            r10 = 1
            f(r8, r9, r10, r11, r12, r13)     // Catch: o.ef.b -> L75
            r0 = r13[r2]     // Catch: o.ef.b -> L75
            java.lang.String r0 = (java.lang.String) r0     // Catch: o.ef.b -> L75
            java.lang.String r0 = r0.intern()     // Catch: o.ef.b -> L75
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r0}     // Catch: o.ef.b -> L75
            int r13 = o.ef.a.f23782p     // Catch: o.ef.b -> L75
            r0 = -1576737484(0xffffffffa204e534, float:-1.8010675E-18)
            int r13 = r13 * r0
            o.ef.a.f23782p = r13     // Catch: o.ef.b -> L75
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: o.ef.b -> L75
            int r14 = r0.getPriority()     // Catch: o.ef.b -> L75
            int r10 = java.lang.Thread.activeCount()     // Catch: o.ef.b -> L75
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: o.ef.b -> L75
            int r11 = (int) r0     // Catch: o.ef.b -> L75
            r8 = -781664457(0xffffffffd168bf37, float:-6.247753E10)
            r12 = 781664467(0x2e9740d3, float:6.8782E-11)
            java.lang.Object r0 = o.ef.a.a(r8, r9, r10, r11, r12, r13, r14)     // Catch: o.ef.b -> L75
            java.lang.String r0 = (java.lang.String) r0     // Catch: o.ef.b -> L75
            return r0
        L75:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto Lc7
            r4 = 0
            int r0 = android.widget.ExpandableListView.getPackedPositionType(r4)
            int r8 = 28 - r0
            int r0 = android.graphics.Color.red(r2)
            int r11 = 292 - r0
            int r0 = android.widget.ExpandableListView.getPackedPositionChild(r4)
            int r12 = r0 + 13
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.String r9 = "\u0002\uffff\u0007\bￜ\ufffe\u0005\u0002\uffdf\t\tￚ\u000b\ufffe�\u0002\u000f\b\u000b￩\u0007\b\u0002\r\ufffa\u000b\u000e\u0000"
            r10 = 1
            f(r8, r9, r10, r11, r12, r13)
            r0 = r13[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = r0.intern()
            int r0 = android.graphics.Color.green(r2)
            int r0 = r0 + 23707
            char r5 = (char) r0
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.getTrimmedLength(r0)
            int r4 = r0 + 3
            r1 = 0
            float r0 = android.util.TypedValue.complexToFraction(r2, r1, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            int r1 = 45 - r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            k(r5, r4, r1, r0)
            r0 = r0[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.d(r6, r0)
        Lc7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.br.d.a():java.lang.String");
    }

    @Override // o.br.c
    public final String b() {
        int i2 = 2 % 2;
        int i3 = f21572c + 117;
        f21576i = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.br.c
    public final o.bk.c c() throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = this.f21578b;
        if (aVar == null) {
            int i3 = f21572c + 63;
            f21576i = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        Object[] objArr = new Object[1];
        k((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 117 - TextUtils.indexOf((CharSequence) "", '0'), Color.blue(0) + 3, objArr);
        o.ef.a aVarV = aVar.v(((String) objArr[0]).intern());
        if (aVarV == null) {
            if (f.a()) {
                int i5 = f21572c + 69;
                f21576i = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr2 = new Object[1];
                f(28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0002\uffff\u0007\bￜ\ufffe\u0005\u0002\uffdf\t\tￚ\u000b\ufffe�\u0002\u000f\b\u000b￩\u0007\b\u0002\r\ufffa\u000b\u000e\u0000", true, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                f((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 50, "\u0005\b\r\u0004\u0003\u0006\u0004\u0013\uffe7\f\u0012￢\u000e\r\u0005\b\u0006\u0014\u0011\u0000\u0013\b\u000e\r\uffbfￌ\uffbf\u0007\f\u0012\uffbf\u0002\u000e\r\u0005\b\u0006\u0014\u0011\u0000\u0013\b\u000e\r\uffbf\r\u000e\u0013\uffbf\u0003\u0004", false, TextUtils.lastIndexOf("", '0') + OlympusImageProcessingMakernoteDirectory.TagWbGLevel, 5 - View.resolveSize(0, 0), objArr3);
                f.c(strIntern, ((String) objArr3[0]).intern());
            }
            return null;
        }
        try {
            Object[] objArr4 = new Object[1];
            f((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13, "\b\u0002\r\ufffa￼\u0002\u0005\t\t\ufffa�￢\u0007", true, (ViewConfiguration.getFadingEdgeLength() >> 16) + OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, (ViewConfiguration.getLongPressTimeout() >> 16) + 10, objArr4);
            Object[] objArr5 = {aVarV, ((String) objArr4[0]).intern()};
            int i7 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i7;
            String str = (String) o.ef.a.a(-781664457, objArr5, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority());
            Object[] objArr6 = new Object[1];
            k((char) (52036 - View.MeasureSpec.getMode(0)), 109 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 8 - ExpandableListView.getPackedPositionChild(0L), objArr6);
            Object[] objArr7 = {aVarV, ((String) objArr6[0]).intern()};
            int i8 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i8;
            String str2 = (String) o.ef.a.a(-781664457, objArr7, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i8, Thread.currentThread().getPriority());
            Object[] objArr8 = new Object[1];
            k((char) (8618 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 121 - (ViewConfiguration.getPressedStateDuration() >> 16), 15 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr8);
            Object[] objArr9 = {aVarV, ((String) objArr8[0]).intern()};
            int i9 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i9;
            return new o.bk.c(str, str2, (String) o.ef.a.a(-781664457, objArr9, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i9, Thread.currentThread().getPriority()));
        } catch (o.ef.b unused) {
            if (f.a()) {
                Object[] objArr10 = new Object[1];
                f(Color.rgb(0, 0, 0) + 16777244, "\u0002\uffff\u0007\bￜ\ufffe\u0005\u0002\uffdf\t\tￚ\u000b\ufffe�\u0002\u000f\b\u000b￩\u0007\b\u0002\r\ufffa\u000b\u000e\u0000", true, 292 - Color.green(0), 12 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr10);
                String strIntern2 = ((String) objArr10[0]).intern();
                Object[] objArr11 = new Object[1];
                f(63 - TextUtils.indexOf("", ""), "\u0006ￂ\b\u0011\u0014\u000f\u0003\u0016\t\u0007\u0016￪\u000f\u0015￥\u0011\u0010\b\u000b\t\u0017\u0014\u0003\u0016\u000b\u0011\u0010ￊￋￂￏￂ\n\u000f\u0015ￂ\u0005\u0011\u0010\b\u000b\t\u0017\u0014\u0003\u0016\u000b\u0011\u0010ￂ\n\u0003\u0015ￂ\u0003\u0010ￂ\u000b\u0010\u0018\u0003\u000e\u000b", false, 283 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr11);
                f.d(strIntern2, ((String) objArr11[0]).intern());
            }
            int i10 = f21576i + 77;
            f21572c = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }
    }

    @Override // o.br.c
    public final String d() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21572c + 109;
        f21576i = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            f(104 << (ViewConfiguration.getTouchSlop() << 76), "\u0002\uffff\u0007\bￜ\ufffe\u0005\u0002\uffdf\t\tￚ\u000b\ufffe�\u0002\u000f\b\u000b￩\u0007\b\u0002\r\ufffa\u000b\u000e\u0000", true, (ViewConfiguration.getMinimumFlingVelocity() * 115) + 6925, 127 - AndroidCharacter.getMirror((char) 25), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            f(28 - (ViewConfiguration.getTouchSlop() >> 8), "\u0002\uffff\u0007\bￜ\ufffe\u0005\u0002\uffdf\t\tￚ\u000b\ufffe�\u0002\u000f\b\u000b￩\u0007\b\u0002\r\ufffa\u000b\u000e\u0000", true, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, AndroidCharacter.getMirror('0') - '$', objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f21572c + 9;
        f21576i = i4 % 128;
        if (i4 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // o.br.c
    public final void d(Context context) {
        int i2 = 2 % 2;
        int i3 = f21576i + 87;
        f21572c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 64 / 0;
        }
    }

    @Override // o.br.c
    public final o.bk.a e() throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = this.f21578b;
        if (aVar == null) {
            int i3 = f21576i + 51;
            f21572c = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        Object[] objArr = new Object[1];
        f(8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\ufffa�\n\u0001\ufffe�\u000b\ufff9", true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 293, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5, objArr);
        o.ef.a aVarV = aVar.v(((String) objArr[0]).intern());
        if (aVarV == null) {
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                f(28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0002\uffff\u0007\bￜ\ufffe\u0005\u0002\uffdf\t\tￚ\u000b\ufffe�\u0002\u000f\b\u000b￩\u0007\b\u0002\r\ufffa\u000b\u000e\u0000", true, ((Process.getThreadPriority(0) + 20) >> 6) + OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, TextUtils.indexOf((CharSequence) "", '0') + 13, objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                k((char) ((-16762286) - Color.rgb(0, 0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 49, 61 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
                f.c(strIntern, ((String) objArr3[0]).intern());
            }
            return null;
        }
        try {
            Object[] objArr4 = new Object[1];
            f(View.getDefaultSize(0, 0) + 8, "\t\uffff\u0000\r￤\uffff\u000e\u0000", false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 289, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6, objArr4);
            Object[] objArr5 = {aVarV, ((String) objArr4[0]).intern()};
            int i5 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i5;
            String str = (String) o.ef.a.a(-781664457, objArr5, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
            Object[] objArr6 = new Object[1];
            f(13 - View.resolveSize(0, 0), "\b\u0002\r\ufffa￼\u0002\u0005\t\t\ufffa�￢\u0007", true, 292 - Color.blue(0), 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr6);
            Object[] objArr7 = {aVarV, ((String) objArr6[0]).intern()};
            int i6 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i6;
            String str2 = (String) o.ef.a.a(-781664457, objArr7, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i6, Thread.currentThread().getPriority());
            Object[] objArr8 = new Object[1];
            k((char) (Color.alpha(0) + 52036), ExpandableListView.getPackedPositionType(0L) + 109, 8 - TextUtils.lastIndexOf("", '0', 0), objArr8);
            Object[] objArr9 = {aVarV, ((String) objArr8[0]).intern()};
            int i7 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i7;
            String str3 = (String) o.ef.a.a(-781664457, objArr9, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority());
            Object[] objArr10 = new Object[1];
            f(6 - (ViewConfiguration.getLongPressTimeout() >> 16), "￼\u000b\u0004￦\u0000\u0014", false, 290 - View.resolveSize(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, objArr10);
            Object[] objArr11 = {aVarV, ((String) objArr10[0]).intern()};
            int i8 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i8;
            return new o.bk.a(str, str2, str3, (String) o.ef.a.a(-781664457, objArr11, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i8, Thread.currentThread().getPriority()));
        } catch (o.ef.b unused) {
            if (!f.a()) {
                return null;
            }
            Object[] objArr12 = new Object[1];
            f(28 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0002\uffff\u0007\bￜ\ufffe\u0005\u0002\uffdf\t\tￚ\u000b\ufffe�\u0002\u000f\b\u000b￩\u0007\b\u0002\r\ufffa\u000b\u000e\u0000", true, 291 - TextUtils.indexOf((CharSequence) "", '0'), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, objArr12);
            String strIntern2 = ((String) objArr12[0]).intern();
            Object[] objArr13 = new Object[1];
            f(73 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0006\u0015\uffe7\n\u0013\u0006\u0003\u0002\u0014\u0006￤\u0010\u000f\u0007\n\b\u0016\u0013\u0002\u0015\n\u0010\u000f\uffc9ￊ\uffc1ￎ\uffc1\u0007\n\u0013\u0006\u0003\u0002\u0014\u0006\uffc1\u0004\u0010\u000f\u0007\n\b\u0016\u0013\u0002\u0015\n\u0010\u000f\uffc1\t\u0002\u0014\uffc1\u0002\u000f\uffc1\n\u000f\u0017\u0002\r\n\u0005\uffc1\u0007\u0010\u0013\u000e\u0002\u0015\b", false, 283 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), Color.blue(0) + 72, objArr13);
            f.d(strIntern2, ((String) objArr13[0]).intern());
            int i9 = f21576i + 55;
            f21572c = i9 % 128;
            int i10 = i9 % 2;
            return null;
        }
    }
}
