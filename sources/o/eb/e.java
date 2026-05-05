package o.eb;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.g;
import o.a.q;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e extends d<b> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f23622a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f23623b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f23624c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f23625d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f23626e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f23627h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23628i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23629j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f23630k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f23631l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f23632m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f23633n = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r8, byte r9, byte r10) {
        /*
            int r8 = 78 - r8
            int r0 = r10 * 3
            int r7 = 1 - r0
            byte[] r6 = o.eb.e.$$c
            int r5 = r9 + 4
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r6 != 0) goto L25
            r0 = r7
            r2 = r3
        L11:
            int r8 = r8 + r0
            r1 = r2
        L13:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r7) goto L20
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L20:
            int r5 = r5 + 1
            r0 = r6[r5]
            goto L11
        L25:
            r1 = r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.e.$$i(byte, byte, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f23633n = -51319219;
        f23632m = 2002002164;
        f23631l = -961990582;
        f23630k = -2073849923;
        f23627h = 1053880030;
        init$0();
        f23629j = 0;
        f23628i = 1;
        f23625d = -7846114708370397905L;
        f23623b = (char) 19654;
        f23624c = (char) 24887;
        f23622a = (char) 40676;
        f23626e = (char) 15826;
    }

    static void init$0() {
        $$a = new byte[]{60, 66, -100, 104};
        $$b = 95;
    }

    static void init$1() {
        $$g = new byte[]{96, -114, MessagePack.Code.EXT16, -13, 62, MessagePack.Code.BIN32, -16, 65, -74, 78, -16, 62, -78, 72, MessagePack.Code.NEVER_USED, 67, -20, 62, MessagePack.Code.FLOAT32, -6, 51, MessagePack.Code.EXT8};
        $$h = 140;
    }

    static void init$2() {
        $$c = new byte[]{37, -107, Ascii.NAK, -25};
        $$f = 75;
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i4 = $10 + 87;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) (-1);
                        objA = o.d.d.a(731 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (7933 - KeyEvent.normalizeMetaState(0)), TextUtils.getTrimmedLength("") + 11, 355847088, false, $$i((byte) 7, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() - (f23625d % 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objA2 = o.d.d.a(836 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (27279 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), ExpandableListView.getPackedPositionChild(0L) + 12, -2145994442, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = qVar.f19948a;
                Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA3 = o.d.d.a(-1011865131);
                if (objA3 == null) {
                    byte b5 = (byte) (-1);
                    objA3 = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 731, (char) (7933 - (ViewConfiguration.getTouchSlop() >> 8)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, 355847088, false, $$i((byte) 7, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f23625d ^ 4743694005979712847L);
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = o.d.d.a(1452497747);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA4 = o.d.d.a(835 - ExpandableListView.getPackedPositionChild(0L), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27278), 11 - ExpandableListView.getPackedPositionGroup(0L), -2145994442, false, $$i(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr6 = {qVar, qVar};
            Object objA5 = o.d.d.a(1452497747);
            if (objA5 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 - 1);
                objA5 = o.d.d.a(836 - TextUtils.indexOf("", "", 0, 0), (char) (27279 - TextUtils.getTrimmedLength("")), (-16777205) - Color.rgb(0, 0, 0), -2145994442, false, $$i(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
            int i7 = $10 + 93;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static void r(int i2, int i3, short s2, Object[] objArr) {
        int i4 = 4 - (i3 * 4);
        int i5 = 106 - i2;
        int i6 = s2 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6 + 1];
        int i7 = -1;
        if (bArr == null) {
            i5 = i6 + i4;
            i4++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i8 = i4;
                i5 += bArr[i4];
                i4 = i8 + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void s(byte r9, short r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.eb.e.$$g
            int r7 = r11 + 98
            int r0 = r10 + 4
            int r1 = 8 - r9
            byte[] r6 = new byte[r1]
            int r5 = 7 - r9
            r4 = 0
            if (r8 != 0) goto L2b
            r3 = r4
            r2 = r0
        L11:
            int r0 = -r0
            int r7 = r7 + r0
            int r7 = r7 + (-3)
            int r0 = r2 + 1
        L17:
            byte r1 = (byte) r7
            r6[r3] = r1
            if (r3 != r5) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r4)
            r12[r4] = r0
            return
        L24:
            r1 = r8[r0]
            int r3 = r3 + 1
            r2 = r0
            r0 = r1
            goto L11
        L2b:
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.e.s(byte, short, short, java.lang.Object[]):void");
    }

    private static void t(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object obj = str2;
        if (str2 != null) {
            int i4 = $11 + 29;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = str2.toCharArray();
            int i6 = $11 + 39;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i8 = 58224;
            for (int i9 = 0; i9 < 16; i9++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i8) ^ ((c3 << 4) + ((char) (((long) f23622a) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f23626e)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) (-1);
                        objA = o.d.d.a(270 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 11 - KeyEvent.getDeadChar(0, 0), -1995022631, false, $$i((byte) ($$f & 61), b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f23623b) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f23624c)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 270;
                        char c4 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11;
                        int i10 = $$f;
                        byte b3 = (byte) (-1);
                        objA2 = o.d.d.a(edgeSlop, c4, keyRepeatTimeout, -1995022631, false, $$i((byte) ((i10 + 61) - (i10 | 61)), b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b4 = (byte) (-1);
                objA3 = o.d.d.a(270 - Color.alpha(0), (char) Color.blue(0), 10 - ExpandableListView.getPackedPositionChild(0L), -2074123590, false, $$i((byte) 6, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            int i11 = $11 + 45;
            $10 = i11 % 128;
            int i12 = i11 % 2;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public abstract int getThemeResource(b bVar);

    /* JADX WARN: Removed duplicated region for block: B:85:0x0ae1  */
    @Override // o.eb.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void launch(android.content.Context r25, o.eb.b r26, java.lang.String r27, android.os.CancellationSignal r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.e.launch(android.content.Context, java.lang.Object, java.lang.String, android.os.CancellationSignal):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0ff5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x128f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0c2e  */
    /* JADX INFO: renamed from: launch, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void launch2(android.content.Context r29, o.eb.b r30, java.lang.String r31, android.os.CancellationSignal r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.e.launch2(android.content.Context, o.eb.b, java.lang.String, android.os.CancellationSignal):void");
    }
}
