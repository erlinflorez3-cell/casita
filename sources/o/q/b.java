package o.q;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short[] f26692a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26693b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26694c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26695d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f26696e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f26697f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26698g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26699i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26700j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, byte r10, byte r11) {
        /*
            byte[] r8 = o.q.b.$$a
            int r0 = r11 * 2
            int r7 = r0 + 1
            int r0 = r9 * 3
            int r6 = r0 + 4
            int r3 = r10 + 103
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r8 != 0) goto L29
            r3 = r6
            r0 = r7
            r2 = r4
        L14:
            int r0 = -r0
            int r6 = r6 + 1
            int r3 = r3 + r0
            r1 = r2
        L19:
            byte r0 = (byte) r3
            int r2 = r1 + 1
            r5[r1] = r0
            if (r2 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r8[r6]
            goto L14
        L29:
            r1 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.q.b.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26699i = 0;
        f26697f = 1;
        f26698g = 0;
        f26700j = 1;
        a();
        KeyEvent.getModifierMetaStateMask();
        SystemClock.uptimeMillis();
        TextUtils.lastIndexOf("", '0', 0, 0);
        ViewConfiguration.getDoubleTapTimeout();
        KeyEvent.normalizeMetaState(0);
        int i2 = f26697f + 123;
        f26699i = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void a() {
        f26695d = -269948242;
        f26693b = 1150422467;
        f26694c = 855554871;
        f26696e = new byte[]{75, -66, 72, 78, -116, -83, 85, -67, 77, -86, -87, 74, 77, -124, 64, -66, 64, 89, -83, 118};
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0209 A[PHI: r4
  0x0209: PHI (r4v18 int) = (r4v3 int), (r4v21 int) binds: [B:47:0x021e, B:43:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0220 A[PHI: r4
  0x0220: PHI (r4v4 int) = (r4v3 int), (r4v21 int) binds: [B:47:0x021e, B:43:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.q.b.h(short, int, int, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{60, -28, -86, -124};
        $$b = 155;
    }

    @Override // o.q.a
    public final void a(o.ef.a aVar) {
        int i2 = 2 % 2;
        int i3 = f26700j + 73;
        f26698g = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.q.a
    public final String c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26698g + 95;
        f26700j = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        h((short) (TextUtils.lastIndexOf("", '0', 0, 0) + 5), TextUtils.indexOf("", "", 0, 0) + 1418008797, Color.argb(0, 0, 0, 0) - 1986836086, ExpandableListView.getPackedPositionChild(0L) - 78, (byte) ((-37) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f26700j + 19;
        f26698g = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    @Override // o.q.a
    public final o.ef.a d() {
        int i2 = 2 % 2;
        int i3 = f26698g + 23;
        int i4 = i3 % 128;
        f26700j = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 111;
        f26698g = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // o.q.a
    public final void e(a aVar) {
        int i2 = 2 % 2;
        int i3 = f26700j + 93;
        f26698g = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f26700j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f26698g = i3 % 128;
        boolean z2 = obj instanceof b;
        if (i3 % 2 == 0) {
            return z2;
        }
        throw null;
    }
}
