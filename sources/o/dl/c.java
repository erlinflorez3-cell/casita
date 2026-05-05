package o.dl;

import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.CharCompanionObject;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23176a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f23177b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23178c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f23179d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f23180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23181f = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23182j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r6, byte r7, int r8) {
        /*
            int r6 = r6 + 4
            byte[] r5 = o.dl.c.$$a
            int r4 = r7 * 4
            int r1 = r4 + 1
            int r0 = 105 - r8
            byte[] r3 = new byte[r1]
            r2 = -1
            if (r5 != 0) goto L25
            r1 = r6
            r0 = r4
        L11:
            int r6 = r6 + r0
        L12:
            int r2 = r2 + 1
            byte r0 = (byte) r6
            r3[r2] = r0
            if (r2 != r4) goto L20
            java.lang.String r1 = new java.lang.String
            r0 = 0
            r1.<init>(r3, r0)
            return r1
        L20:
            int r1 = r1 + 1
            r0 = r5[r1]
            goto L11
        L25:
            r1 = r6
            r6 = r0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dl.c.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23181f = 0;
        f23182j = 1;
        f23176a = 0;
        f23178c = 1;
        b();
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getZoomControlsTimeout();
        Object[] objArr = new Object[1];
        g((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 5 - TextUtils.lastIndexOf("", '0'), Process.getGidForName("") + 29, objArr);
        f23180e = d.e(((String) objArr[0]).intern());
        int i2 = f23181f + 23;
        f23182j = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static byte[] a() {
        int i2 = 2 % 2;
        int i3 = f23176a + 53;
        f23178c = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = (byte[]) f23180e.clone();
        int i5 = f23176a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f23178c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return bArr;
    }

    static void b() {
        f23179d = new char[]{38027, 58789, 30435, 50997, 20526, 41328, 38081, 58862, 30363, 51016, 20606, 41253, 13267, 35977, 7600, 28201, 65291, 18491, 56047, 11165, 42051, 13683, 34336, 4281, 25082, 62124, 17246, CharCompanionObject.MIN_LOW_SURROGATE, 11570, 49126, 2193, 39356, 60013, 31513};
        f23177b = -5525329462246775332L;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(char r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dl.c.g(char, int, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{112, 68, MessagePack.Code.BIN8, -81};
        $$b = 126;
    }
}
