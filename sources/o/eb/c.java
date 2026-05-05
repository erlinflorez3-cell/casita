package o.eb;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.g;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends d<i> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f23599a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f23600b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f23601c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23602d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f23603e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23604h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f23605i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f23606k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f23607l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f23608m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f23609n = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f23610q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f23611r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f23612s = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, short r7, int r8) {
        /*
            int r0 = r8 * 2
            int r8 = 1 - r0
            int r0 = r7 + 4
            byte[] r7 = o.eb.c.$$c
            int r1 = r6 * 3
            int r6 = r1 + 69
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r7 != 0) goto L28
            r1 = r0
            r3 = r4
        L13:
            int r6 = r6 + r0
            r0 = r1
            r2 = r3
        L16:
            int r3 = r2 + 1
            byte r1 = (byte) r6
            r5[r2] = r1
            if (r3 != r8) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L23:
            int r1 = r0 + 1
            r0 = r7[r1]
            goto L13
        L28:
            r2 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.c.$$i(short, short, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f23612s = 674549636;
        f23611r = -209806573;
        f23610q = 1686232971;
        f23609n = 80213348;
        f23608m = -1862777082;
        f23607l = 1701890415;
        f23606k = -1739064134;
        f23605i = -2022366620;
        init$0();
        f23602d = 0;
        f23604h = 1;
        f23603e = (char) 57967;
        f23601c = (char) 32876;
        f23599a = (char) 33795;
        f23600b = (char) 60588;
    }

    static void init$0() {
        $$a = new byte[]{37, 121, MessagePack.Code.MAP32, 74};
        $$b = 154;
    }

    static void init$1() {
        $$g = new byte[]{114, MessagePack.Code.FIXEXT8, -31, MessagePack.Code.FIXEXT4, -65, 74, -74, 59, -69, Ascii.SI, -65, 55, 4, MessagePack.Code.BIN16, 52, -65, 54, 1, MessagePack.Code.EXT32, 51, -65, 54, 5, MessagePack.Code.BIN16, 54};
        $$h = 6;
    }

    static void init$2() {
        $$c = new byte[]{Ascii.EM, -93, 95, -122};
        $$f = 239;
    }

    private static void t(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i4 = $10 + 109;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i6 = 58224;
            for (int i7 = 0; i7 < 16; i7++) {
                int i8 = $10 + 39;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) f23599a) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f23600b)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(KeyEvent.getDeadChar(0, 0) + 270, (char) (Process.myTid() >> 22), 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1995022631, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) f23603e) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f23601c)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a((KeyEvent.getMaxKeyCode() >> 16) + 270, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, -1995022631, false, $$i(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
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
                int iRed = Color.red(0) + 270;
                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                int iMakeMeasureSpec = 11 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b6 = (byte) ((-1) - (((-1) - $$f) | ((-1) - 1)));
                byte b7 = (byte) (-b6);
                objA3 = o.d.d.a(iRed, absoluteGravity, iMakeMeasureSpec, -2074123590, false, $$i(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void y(int r8, byte r9, short r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 4
            int r8 = 3 - r0
            int r7 = 106 - r9
            byte[] r6 = o.eb.c.$$a
            int r0 = r10 * 3
            int r5 = 1 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r6 != 0) goto L2d
            r0 = r7
            r2 = r3
            r1 = r8
        L14:
            int r0 = -r0
            int r8 = r8 + r0
            r7 = r8
            r8 = r1
        L18:
            int r1 = r8 + 1
            byte r0 = (byte) r7
            r4[r2] = r0
            int r2 = r2 + 1
            if (r2 != r5) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L29:
            r0 = r6[r1]
            r8 = r7
            goto L14
        L2d:
            r2 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.c.y(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void z(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 111 - r7
            byte[] r6 = o.eb.c.$$g
            int r1 = 7 - r9
            int r0 = 24 - r8
            byte[] r5 = new byte[r1]
            int r4 = 6 - r9
            r3 = 0
            if (r6 != 0) goto L27
            r2 = r0
            r1 = r3
        L11:
            int r7 = r7 + r0
            r0 = r2
        L13:
            byte r2 = (byte) r7
            r5[r1] = r2
            int r2 = r0 + 1
            if (r1 != r4) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r3)
            r10[r3] = r0
            return
        L22:
            int r1 = r1 + 1
            r0 = r6[r2]
            goto L11
        L27:
            r1 = r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.c.z(short, int, short, java.lang.Object[]):void");
    }

    public abstract int getThemeResource();

    /* JADX WARN: Removed duplicated region for block: B:131:0x0cf1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0a22  */
    @Override // o.eb.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void launch(android.content.Context r29, o.eb.i r30, java.lang.String r31, android.os.CancellationSignal r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.c.launch(android.content.Context, java.lang.Object, java.lang.String, android.os.CancellationSignal):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0b19  */
    /* JADX INFO: renamed from: launch, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void launch2(android.content.Context r30, o.eb.i r31, java.lang.String r32, android.os.CancellationSignal r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.c.launch2(android.content.Context, o.eb.i, java.lang.String, android.os.CancellationSignal):void");
    }
}
