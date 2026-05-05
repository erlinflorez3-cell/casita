package o.c;

import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f21984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ d[] f21985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f21986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21987d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f21988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21989f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static byte[] f21990g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21991h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21992i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static short[] f21993j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f21994k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21995n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21996o = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, int r10, short r11) {
        /*
            int r0 = r10 * 4
            int r8 = 1 - r0
            int r0 = r11 * 4
            int r7 = r0 + 4
            int r6 = r9 + 103
            byte[] r5 = o.c.d.$$a
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r5 != 0) goto L29
            r0 = r7
            r2 = r3
        L13:
            int r7 = r7 + 1
            int r6 = r6 + r0
            r1 = r2
        L17:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r1 = r5[r7]
            r0 = r6
            r6 = r1
            goto L13
        L29:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c.d.$$c(int, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21996o = 0;
        f21994k = 1;
        f21989f = 0;
        f21995n = 1;
        b();
        Object[] objArr = new Object[1];
        l((short) (((Process.getThreadPriority(0) + 20) >> 6) + 76), 4633 - AndroidCharacter.getMirror('0'), AndroidCharacter.getMirror('0') + 39178, (-46) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (28 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr);
        f21984a = new d(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        l((short) (((Process.getThreadPriority(0) + 20) >> 6) - 65), (-2010967568) - ((Process.getThreadPriority(0) + 20) >> 6), 617650490 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) - 45, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 71), objArr2);
        f21988e = new d(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        l((short) (111 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.getOffsetAfter("", 0) - 2010967542, 617650496 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) - 46, (byte) ((-111) - TextUtils.indexOf("", "")), objArr3);
        f21986c = new d(((String) objArr3[0]).intern(), 2);
        f21985b = d();
        int i2 = f21996o + 109;
        f21994k = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private d(String str, int i2) {
    }

    static void b() {
        f21987d = 860808090;
        f21991h = 1150422432;
        f21992i = -1614976374;
        f21990g = new byte[]{87, Ascii.NAK, 36, 74, 65, 66, 105, 96, 112, 10, -115, 0, 102, 5, 9, 0, -115, 124, 8, 3, 10, 67, 44, 3, 126, 97, 6, 10, Ascii.NAK, 127, 118, 119, 94, 81, -91, -83, -84, 119, -85, 124, -81, MessagePack.Code.BIN16};
    }

    private static /* synthetic */ d[] d() {
        d[] dVarArr;
        int i2 = 2 % 2;
        int i3 = f21995n;
        int i4 = i3 + 121;
        f21989f = i4 % 128;
        if (i4 % 2 != 0) {
            dVarArr = new d[4];
            dVarArr[0] = f21984a;
            dVarArr[1] = f21988e;
            dVarArr[4] = f21986c;
        } else {
            dVarArr = new d[]{f21984a, f21988e, f21986c};
        }
        int i5 = i3 + 69;
        f21989f = i5 % 128;
        if (i5 % 2 == 0) {
            return dVarArr;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{69, -20, MessagePack.Code.INT64, -20};
        $$b = 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c.d.l(short, int, int, int, byte, java.lang.Object[]):void");
    }

    public static d valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f21995n + 31;
        f21989f = i3 % 128;
        int i4 = i3 % 2;
        d dVar = (d) Enum.valueOf(d.class, str);
        int i5 = f21989f + 113;
        f21995n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return dVar;
    }

    public static d[] values() {
        int i2 = 2 % 2;
        int i3 = f21995n + 57;
        f21989f = i3 % 128;
        int i4 = i3 % 2;
        d[] dVarArr = (d[]) f21985b.clone();
        int i5 = f21995n + 117;
        f21989f = i5 % 128;
        int i6 = i5 % 2;
        return dVarArr;
    }
}
