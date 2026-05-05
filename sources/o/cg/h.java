package o.cg;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f22339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f22340b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f22341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f22342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f22343f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22344g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22345h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ h[] f22346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f22347j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f22348l = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f22349o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22350c;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, byte r10, byte r11) {
        /*
            byte[] r8 = o.cg.h.$$a
            int r0 = r10 * 2
            int r7 = 4 - r0
            int r0 = r9 * 4
            int r6 = 1 - r0
            int r0 = r11 + 102
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L2a
            r2 = r6
            r3 = r4
        L13:
            int r0 = -r0
            int r0 = r0 + r2
            int r7 = r7 + 1
            r2 = r3
        L18:
            byte r1 = (byte) r0
            int r3 = r2 + 1
            r5[r2] = r1
            if (r3 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            r1 = r8[r7]
            r2 = r0
            r0 = r1
            goto L13
        L2a:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.h.$$c(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22349o = 0;
        f22348l = 1;
        f22344g = 0;
        f22345h = 1;
        c();
        Object[] objArr = new Object[1];
        k(6 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0013\r\b\u0006\u0001\f", (byte) (23 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        k(6 - ExpandableListView.getPackedPositionType(0L), "\u0013\b\b\r\u000e\u0012", (byte) (ExpandableListView.getPackedPositionGroup(0L) + 51), objArr2);
        f22342e = new h(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        k(6 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0010\u0007\r\u0018\f\r", (byte) (3 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        k(6 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u000f\u0016\u0006\u0018\u0011\u0018", (byte) (69 - ExpandableListView.getPackedPositionChild(0L)), objArr4);
        f22339a = new h(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        k(TextUtils.getTrimmedLength("") + 7, "\u0015\f\u0015\u000e\u0006\f㙓", (byte) (TextUtils.lastIndexOf("", '0', 0) + 86), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        k(Color.alpha(0) + 7, "\u0018\u0011\u0012\u000f\u0004\u0012㘭", (byte) (79 - Color.alpha(0)), objArr6);
        f22340b = new h(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        k(6 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0010\u0007\u0010\u0005\u0002\u0006", (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 56), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        k(View.combineMeasuredStates(0, 0) + 6, "\u000f\u0016\u000f\u0015\r\u0000", (byte) (99 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr8);
        f22341d = new h(strIntern4, 3, ((String) objArr8[0]).intern());
        f22346i = e();
        int i2 = f22349o + 29;
        f22348l = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private h(String str, int i2, String str2) {
        this.f22350c = str2;
    }

    static void c() {
        f22347j = new char[]{51645, 64592, 64595, 64625, 51646, 64588, 64586, 64593, 64620, 64614, 64624, 64576, 64577, 64627, 64582, 64578, 64610, 64617, 64612, 64608, 64618, 64622, 64609, 64590, 64585};
        f22343f = (char) 51642;
    }

    public static h e(String str) {
        int i2 = 2 % 2;
        int i3 = f22344g + 27;
        f22345h = i3 % 128;
        int i4 = i3 % 2;
        if (str == null) {
            return null;
        }
        for (h hVar : values()) {
            if (hVar.f22350c.equals(str)) {
                int i5 = f22345h + 19;
                f22344g = i5 % 128;
                int i6 = i5 % 2;
                return hVar;
            }
        }
        return null;
    }

    private static /* synthetic */ h[] e() {
        h[] hVarArr;
        int i2 = 2 % 2;
        int i3 = f22344g + 3;
        int i4 = i3 % 128;
        f22345h = i4;
        if (i3 % 2 == 0) {
            hVarArr = new h[3];
            hVarArr[1] = f22342e;
            hVarArr[1] = f22339a;
            hVarArr[4] = f22340b;
            hVarArr[4] = f22341d;
        } else {
            hVarArr = new h[]{f22342e, f22339a, f22340b, f22341d};
        }
        int i5 = i4 + 69;
        f22344g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return hVarArr;
    }

    static void init$0() {
        $$a = new byte[]{81, 52, -106, MessagePack.Code.FIXEXT4};
        $$b = 182;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(int r27, java.lang.String r28, byte r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.h.k(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    public static h valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f22344g + 77;
        f22345h = i3 % 128;
        int i4 = i3 % 2;
        h hVar = (h) Enum.valueOf(h.class, str);
        if (i4 == 0) {
            int i5 = 35 / 0;
        }
        int i6 = f22345h + 125;
        f22344g = i6 % 128;
        if (i6 % 2 == 0) {
            return hVar;
        }
        throw null;
    }

    public static h[] values() {
        int i2 = 2 % 2;
        int i3 = f22345h + 69;
        f22344g = i3 % 128;
        int i4 = i3 % 2;
        h[] hVarArr = f22346i;
        if (i4 == 0) {
            return (h[]) hVarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f22345h + 23;
        int i4 = i3 % 128;
        f22344g = i4;
        int i5 = i3 % 2;
        String str = this.f22350c;
        int i6 = i4 + 9;
        f22345h = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
