package o.cl;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.h;
import o.a.n;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f22454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f22455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f22456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f22457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f22458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f22459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f22460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f22461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f22462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f22463j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f22464l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static char f22465m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char[] f22466n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ d[] f22467o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f22468p = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f22469r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f22470s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f22471t = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f22472k;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, short r9, byte r10) {
        /*
            int r7 = r9 + 102
            int r6 = r10 * 4
            int r1 = r6 + 1
            int r0 = r8 * 4
            int r5 = 4 - r0
            byte[] r4 = o.cl.d.$$a
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L28
            r7 = r5
            r0 = r6
            r1 = r2
        L14:
            int r5 = r5 + 1
            int r0 = -r0
            int r7 = r7 + r0
        L18:
            byte r0 = (byte) r7
            r3[r1] = r0
            if (r1 != r6) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L23:
            r0 = r4[r5]
            int r1 = r1 + 1
            goto L14
        L28:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cl.d.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22470s = 0;
        f22468p = 1;
        f22471t = 0;
        f22469r = 1;
        a();
        Object[] objArr = new Object[1];
        u((KeyEvent.getMaxKeyCode() >> 16) + 10, "\n\u0010\f\u0005\b\u0002\"\t\u001f\u000e", (byte) (ExpandableListView.getPackedPositionType(0L) + 110), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        u((ViewConfiguration.getDoubleTapTimeout() >> 16) + 7, "\u0003\u001c\n\u001a\u0007\u0005㙜", (byte) (125 - TextUtils.getCapsMode("", 0, 0)), objArr2);
        f22455b = new d(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        u(4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0001\u0010\u0005\u000e", (byte) (34 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        u((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, "\u0005\u0004\u001f\u0000", (byte) (Color.blue(0) + 32), objArr4);
        f22457d = new d(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        q(Color.rgb(0, 0, 0) + 16777219, "￭\u000b\n", false, 251 - TextUtils.lastIndexOf("", '0', 0, 0), 3 - KeyEvent.normalizeMetaState(0), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        u((ViewConfiguration.getPressedStateDuration() >> 16) + 3, "\u0017\u0013㘍", (byte) (68 - TextUtils.getCapsMode("", 0, 0)), objArr6);
        f22454a = new d(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        u(5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u001a\u0019\u0002\b", (byte) (42 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        u((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, "\u001d\u0013\f!\n\u001a\u0007\u0005㘗", (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 55), objArr8);
        f22456c = new d(strIntern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        q((ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, "￦\u0001\u0002\n\u0006\ufffe￭\u0012\u000f\u0002", false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 246, ExpandableListView.getPackedPositionGroup(0L) + 10, objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        u(14 - Color.alpha(0), "!\u0004\"\u0000#\n\u0007\u001a\u0015\u0011 \u0006\u001c\u001d", (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 111), objArr10);
        f22458e = new d(strIntern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        q(11 - (KeyEvent.getMaxKeyCode() >> 16), "\u0006\u0007\u000e\uffe7\u0002\u0003\u000b\u0007\uffff￫\u0001", false, TextUtils.getOffsetBefore("", 0) + 245, Process.getGidForName("") + 4, objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        q(TextUtils.lastIndexOf("", '0', 0) + 13, "\ufffa\uffff\u0006\uffff\ufffe\ufff9\u0003\u0015\ufff7\uffff\u0003\ufffb", true, 222 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2 - View.resolveSizeAndState(0, 0, 0), objArr12);
        f22463j = new d(strIntern6, 5, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        q(10 - View.getDefaultSize(0, 0), "￦\u0001\u0002\n\u0006\ufffe\ufff4\u0006\u0010\u0002", false, 247 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 10 - (ViewConfiguration.getScrollBarSize() >> 8), objArr13);
        String strIntern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        u(3 - ImageFormat.getBitsPerPixel(0), "\u0016!\u0000\u001f", (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 61), objArr14);
        f22461h = new d(strIntern7, 6, ((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        q(2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\ufff0\b\t", true, 237 - TextUtils.indexOf("", ""), -Process.getGidForName(""), objArr15);
        String strIntern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        u((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, "\u0015\u0019㗥", (byte) (13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr16);
        f22460g = new d(strIntern8, 7, ((String) objArr16[0]).intern());
        Object[] objArr17 = new Object[1];
        u(10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0015\u001f\u0003\u0011\u0010\b\b\n\r\u0011", (byte) (TextUtils.lastIndexOf("", '0', 0) + 39), objArr17);
        String strIntern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        u(ExpandableListView.getPackedPositionType(0L) + 11, "\u0015\u0019\u001a\n\u0011\u001b\n\u0005 \u0016㗣", (byte) (5 - ImageFormat.getBitsPerPixel(0)), objArr18);
        f22459f = new d(strIntern9, 8, ((String) objArr18[0]).intern());
        Object[] objArr19 = new Object[1];
        u(10 - ImageFormat.getBitsPerPixel(0), "\t\u000f\u000f\n\u0004\u0006\t\u0018\b\"㘇", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9), objArr19);
        String strIntern10 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        q(((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR, "\u0000\ufffb\ufffb\t\ufff8\ufffa\u0016\u0003\ufff8\u000b\u0000\ufffe", true, 220 - KeyEvent.normalizeMetaState(0), 2 - Color.blue(0), objArr20);
        f22462i = new d(strIntern10, 9, ((String) objArr20[0]).intern());
        f22467o = b();
        int i2 = f22470s + 79;
        f22468p = i2 % 128;
        int i3 = i2 % 2;
    }

    private d(String str, int i2, String str2) {
        this.f22472k = str2;
    }

    static void a() {
        f22464l = -1270219384;
        f22466n = new char[]{64593, 64630, 64576, 64609, 64616, 64583, 64585, 64584, 64634, 64588, 64580, 64612, 64587, 64577, 64586, 64631, 64578, 64598, 64625, 64623, 64619, 64626, 64627, 64624, 64592, 64629, 64590, 64614, 64615, 64618, 64608, 64610, 64599, 64582, 64620, 64591};
        f22465m = (char) 51641;
    }

    private static /* synthetic */ d[] b() {
        int i2 = 2 % 2;
        int i3 = f22469r + 113;
        int i4 = i3 % 128;
        f22471t = i4;
        int i5 = i3 % 2;
        d[] dVarArr = {f22455b, f22457d, f22454a, f22456c, f22458e, f22463j, f22461h, f22460g, f22459f, f22462i};
        int i6 = i4 + 25;
        f22469r = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 0;
        }
        return dVarArr;
    }

    public static d e(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22471t + 107;
        f22469r = i3 % 128;
        int i4 = i3 % 2;
        d[] dVarArrValues = values();
        int i5 = f22471t + 5;
        f22469r = i5 % 128;
        int i6 = i5 % 2;
        for (d dVar : dVarArrValues) {
            int i7 = f22469r + 105;
            f22471t = i7 % 128;
            int i8 = i7 % 2;
            if (str.equals(dVar.f22472k)) {
                return dVar;
            }
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        q(Color.red(0) + 34, "ￃ￤\u0013\u0013\u000f\f\u0006\u0004\u0017\f\u0012\u0011ￃ￩\u0012\u0015\u0010\u0004\u0017ￃ\ufff7\u001c\u0013\bￃ\u0018\u0011\u000e\u0011\u0012\u001a\u0011ￃ\uffdd", false, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 239, 1 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        throw new IllegalArgumentException(sb.append(((String) objArr[0]).intern()).append(str).toString());
    }

    static void init$0() {
        $$a = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
        $$b = Mp4VideoDirectory.TAG_COLOR_TABLE;
    }

    private static void q(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i6 = $10 + 89;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f22464l)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(270 - Color.alpha(0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -2071844881, false, $$c(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 13))), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(522 - View.combineMeasuredStates(0, 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 12, 627984172, false, $$c(b3, (byte) ((b3 + Ascii.VT) - (11 & b3)), b3), new Class[]{Object.class, Object.class});
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
            int i9 = $10 + 81;
            $11 = i9 % 128;
            int i10 = i9 % 2;
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
                int i11 = $11 + 19;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(521 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) Color.green(0), 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 627984172, false, $$c(b4, (byte) ((b4 + Ascii.VT) - (11 & b4)), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i13 = $11 + 65;
                $10 = i13 % 128;
                int i14 = i13 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void u(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f22466n;
        long j2 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 33;
                $11 = i7 % 128;
                if (i7 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objA = o.d.d.a(421932776);
                        if (objA == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objA = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 270, (char) TextUtils.getOffsetBefore("", 0), (SystemClock.currentThreadTimeMillis() > j2 ? 1 : (SystemClock.currentThreadTimeMillis() == j2 ? 0 : -1)) + 10, -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objA2 = o.d.d.a(421932776);
                    if (objA2 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA2 = o.d.d.a(Color.blue(0) + 270, (char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10, -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i4 = 2;
                j2 = -1;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(f22465m)};
        Object objA3 = o.d.d.a(421932776);
        char c2 = 11;
        if (objA3 == null) {
            byte b7 = (byte) 0;
            byte b8 = b7;
            objA3 = o.d.d.a(270 - Gravity.getAbsoluteGravity(0, 0), (char) ((-1) - Process.getGidForName("")), Color.alpha(0) + 11, -811348851, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i8 = $11 + 51;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                i3 = i2 + 127;
                cArr4[i3] = (char) (cArr[i3] * b2);
            } else {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            }
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i9 = $11 + 49;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                hVar.f19926b = 1;
            } else {
                hVar.f19926b = 0;
            }
            while (hVar.f19926b < i3) {
                int i10 = $11 + 75;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = hVar;
                    objArr5[c2] = Integer.valueOf(cCharValue);
                    objArr5[10] = hVar;
                    objArr5[9] = hVar;
                    objArr5[8] = Integer.valueOf(cCharValue);
                    objArr5[7] = hVar;
                    objArr5[6] = hVar;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = hVar;
                    objArr5[3] = hVar;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[1] = hVar;
                    objArr5[0] = hVar;
                    Object objA4 = o.d.d.a(219124184);
                    if (objA4 == null) {
                        byte b9 = (byte) 0;
                        objA4 = o.d.d.a(Drawable.resolveOpacity(0, 0) + 825, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 10 - ExpandableListView.getPackedPositionChild(0L), -611683395, false, $$c(b9, (byte) ((b9 + 9) - (9 & b9)), b9), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA4).invoke(null, objArr5)).intValue() == hVar.f19930g) {
                        int i12 = $10 + 13;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA5 = o.d.d.a(-634864343);
                        if (objA5 == null) {
                            c2 = 11;
                            byte b10 = (byte) 0;
                            objA5 = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 217, (char) (AndroidCharacter.getMirror('0') - '0'), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 212688716, false, $$c(b10, (byte) ((b10 + 7) - (7 & b10)), b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = 11;
                        }
                        int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                        int i14 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i14];
                    } else {
                        c2 = 11;
                        if (hVar.f19928d == hVar.f19929e) {
                            int i15 = $10 + 117;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i17 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i18 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i17];
                            cArr4[hVar.f19926b + 1] = cArr2[i18];
                        } else {
                            int i19 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i20 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i19];
                            cArr4[hVar.f19926b + 1] = cArr2[i20];
                        }
                    }
                }
                hVar.f19926b += 2;
            }
        }
        for (int i21 = 0; i21 < i2; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static d valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f22471t + 39;
        f22469r = i3 % 128;
        int i4 = i3 % 2;
        d dVar = (d) Enum.valueOf(d.class, str);
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        return dVar;
    }

    public static d[] values() {
        int i2 = 2 % 2;
        int i3 = f22469r + 113;
        f22471t = i3 % 128;
        int i4 = i3 % 2;
        d[] dVarArr = (d[]) f22467o.clone();
        int i5 = f22469r + 13;
        f22471t = i5 % 128;
        int i6 = i5 % 2;
        return dVarArr;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f22469r;
        int i4 = i3 + 15;
        f22471t = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f22472k;
        int i6 = i3 + 107;
        f22471t = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
