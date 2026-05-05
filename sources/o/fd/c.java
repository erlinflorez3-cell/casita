package o.fd;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.util.Iterator;
import java.util.List;
import kotlin.io.encoding.Base64;
import o.cr.d;
import o.ea.f;
import o.eu.e;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends e<o.fi.a> {
    private static final byte[] $$k = null;
    private static final int $$l = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f */
    private static int f25805f = 0;

    /* JADX INFO: renamed from: h */
    private static int f25806h = 0;

    /* JADX INFO: renamed from: j */
    private static int f25807j = 0;

    /* JADX INFO: renamed from: k */
    private static byte[] f25808k = null;

    /* JADX INFO: renamed from: l */
    private static int f25809l = 0;

    /* JADX INFO: renamed from: m */
    private static int f25810m = 0;

    /* JADX INFO: renamed from: n */
    private static int f25811n = 0;

    /* JADX INFO: renamed from: o */
    private static short[] f25812o = null;

    /* JADX INFO: renamed from: r */
    private static int f25813r = 0;

    /* JADX INFO: renamed from: g */
    private String f25814g;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$m(int r8, short r9, int r10) {
        /*
            int r8 = 104 - r8
            int r0 = r9 + 4
            int r2 = r10 * 4
            int r1 = 1 - r2
            byte[] r7 = o.fd.c.$$k
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L29
            r1 = r0
            r3 = r5
        L13:
            int r0 = -r0
            int r8 = r8 + r0
            r0 = r1
            r2 = r3
        L17:
            byte r1 = (byte) r8
            r6[r2] = r1
            int r3 = r2 + 1
            int r1 = r0 + 1
            if (r2 != r4) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L26:
            r0 = r7[r1]
            goto L13
        L29:
            r2 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fd.c.$$m(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25810m = 0;
        f25813r = 1;
        f25809l = 0;
        f25811n = 1;
        t();
        TextUtils.indexOf((CharSequence) "", '0');
        ViewConfiguration.getWindowTouchSlop();
        KeyEvent.normalizeMetaState(0);
        ViewConfiguration.getPressedStateDuration();
        Drawable.resolveOpacity(0, 0);
        TextUtils.indexOf("", "");
        View.resolveSize(0, 0);
        MotionEvent.axisFromString("");
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getPressedStateDuration();
        ExpandableListView.getPackedPositionChild(0L);
        SystemClock.elapsedRealtimeNanos();
        View.resolveSizeAndState(0, 0, 0);
        MotionEvent.axisFromString("");
        Color.rgb(0, 0, 0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        TextUtils.getOffsetAfter("", 0);
        KeyEvent.normalizeMetaState(0);
        ViewConfiguration.getKeyRepeatDelay();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getJumpTapTimeout();
        ViewConfiguration.getScrollBarFadeDuration();
        SystemClock.elapsedRealtime();
        ViewConfiguration.getJumpTapTimeout();
        int i2 = f25813r + 17;
        f25810m = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public c(String str, String str2, boolean z2) {
        super(str, str2, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void H(short r26, int r27, int r28, int r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fd.c.H(short, int, int, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$k = new byte[]{75, Utf8.REPLACEMENT_BYTE, 5, -84};
        $$l = 189;
    }

    static void t() {
        f25805f = -2015928293;
        f25806h = 1150422519;
        f25807j = 1725977197;
        f25808k = new byte[]{Ascii.US, Ascii.ETB, Ascii.SI, Ascii.EM, 47, 33, -12, 4, 19, 2, 16, 0, Ascii.GS, Ascii.DC2, 42, -2, 47, Ascii.CAN, 6, 78, 100, 126, 43, 83, 64, 85, 105, 100, 55, 88, 81, 65, 109, 68, 80, 94, 117, 62, 105, 90, 64, 39, 16, 60, Ascii.SYN, 56, 42, 36, 54, Ascii.CAN, Ascii.NAK, 33, Base64.padSymbol, 46, 76, 2, 60, 47, 41, 46, -8, -11, 7, -23, Ascii.NAK, MessagePack.Code.STR16, -13, Ascii.SI, -30, -31, -16, Ascii.CR, -11, -5, -25, 43, MessagePack.Code.NEVER_USED, -5, -16, -31, 5, -12, -24, -15, 9, -21, -8, Ascii.VT, -3, -13, Ascii.FF, -21, -14, -11, 40, MessagePack.Code.UINT32, 0, Ascii.RS, MessagePack.Code.ARRAY32, -14, Ascii.SI, -4, MessagePack.Code.NEGFIXINT_PREFIX, Ascii.FS, 7, MessagePack.Code.STR32, 10, -9, Ascii.GS, 116, Base64.padSymbol, MessagePack.Code.INT8, 39, 60, 45, 51, 36, 40, 37, 42, 38, 55, 97, MessagePack.Code.INT64, 47, 49, 125, -24, 47, 119, MessagePack.Code.FIXEXT2, 40, 50, 40, 123, -23, 41, Base64.padSymbol, Base64.padSymbol, 16, 49, 36, Ascii.SYN, 56, Base64.padSymbol, 98, 19, 53, -22, 39, Ascii.DC4, 48, 47, 57, 51, Ascii.NAK, 41, 35, 35, 47, 37, 64, 0, 39, 60, 45, 51, 36, 40, 37, 42, 38, 87, -5, 57, 94, Ascii.SI, 39, -115, -115, -115, -115, -115, -115};
    }

    private static a u() {
        int i2 = 2 % 2;
        a aVar = new a();
        int i3 = f25809l + 121;
        f25811n = i3 % 128;
        if (i3 % 2 != 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static o.cy.a v() {
        int i2 = 2 % 2;
        o.cy.a aVar = new o.cy.a();
        int i3 = f25809l + 3;
        f25811n = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private o.ef.a y() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fd.c.y():o.ef.a");
    }

    public final void a(String str) {
        int i2 = 2 % 2;
        int i3 = f25811n + 61;
        int i4 = i3 % 128;
        f25809l = i4;
        if (i3 % 2 != 0) {
            this.f25814g = str;
            throw null;
        }
        this.f25814g = str;
        int i5 = i4 + 13;
        f25811n = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.eu.e, o.eu.d
    public final o.ef.a b(o.ek.e eVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25811n + 31;
        f25809l = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarB = super.b(eVar);
        Object[] objArr = new Object[1];
        H((short) (MotionEvent.axisFromString("") + 109), Process.getGidForName("") + 1018860139, (-577920883) - ExpandableListView.getPackedPositionType(0L), KeyEvent.getDeadChar(0, 0) - 102, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr);
        aVarB.a(((String) objArr[0]).intern(), y());
        Object[] objArr2 = new Object[1];
        H((short) ((ViewConfiguration.getEdgeSlop() >> 16) + 42), 1018860157 + (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.myPid() >> 22) - 577920883, (-98) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        aVarB.a(((String) objArr2[0]).intern(), o.bb.c.a(this.f25814g));
        int i5 = f25811n + 23;
        f25809l = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return aVarB;
    }

    @Override // o.eu.d
    public final /* synthetic */ o.eu.a d() {
        int i2 = 2 % 2;
        int i3 = f25809l + 1;
        f25811n = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            u();
            obj.hashCode();
            throw null;
        }
        a aVarU = u();
        int i4 = f25809l + 107;
        f25811n = i4 % 128;
        if (i4 % 2 != 0) {
            return aVarU;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.d
    public final void d(Context context) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f25811n + 35;
            f25809l = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            H((short) ((-121) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1018860226 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) - 577920915, (-100) - MotionEvent.axisFromString(""), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            H((short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 85), Color.green(0) + 1018860247, (-577920881) - Color.red(0), (-52) - Gravity.getAbsoluteGravity(0, 0), (byte) (TextUtils.lastIndexOf("", '0') + 1), objArr2);
            f.c(strIntern, String.format(((String) objArr2[0]).intern(), c()));
        }
        List<T> listG = g();
        if (listG != 0) {
            int i5 = f25809l + 7;
            f25811n = i5 % 128;
            int i6 = i5 % 2;
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                ((o.ff.a) it.next()).d(c(), new o.dk.a(context));
            }
        }
        Object obj = null;
        c((List) null);
        int i7 = f25809l + 99;
        f25811n = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.d
    public final /* synthetic */ d e() {
        int i2 = 2 % 2;
        int i3 = f25811n + 123;
        f25809l = i3 % 128;
        int i4 = i3 % 2;
        o.cy.a aVarV = v();
        int i5 = f25811n + 33;
        f25809l = i5 % 128;
        int i6 = i5 % 2;
        return aVarV;
    }

    public final String s() {
        int i2 = 2 % 2;
        int i3 = f25809l + 3;
        int i4 = i3 % 128;
        f25811n = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f25814g;
        int i5 = i4 + 115;
        f25809l = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
