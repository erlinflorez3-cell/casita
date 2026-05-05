package o.cx;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.Date;
import o.ef.a;
import o.ef.b;
import o.en.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f22679a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22680b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22681c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22682d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f22683e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22684f = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, byte r8, int r9) {
        /*
            int r7 = 105 - r7
            byte[] r6 = o.cx.c.$$a
            int r0 = r8 * 3
            int r5 = r0 + 1
            int r0 = r9 + 4
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r6 != 0) goto L26
            r1 = r0
            r2 = r3
        L11:
            int r0 = -r0
            int r7 = r7 + r0
            r0 = r1
        L14:
            byte r1 = (byte) r7
            r4[r2] = r1
            int r2 = r2 + 1
            if (r2 != r5) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L21:
            int r1 = r0 + 1
            r0 = r6[r1]
            goto L11
        L26:
            r2 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cx.c.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22680b = 0;
        f22684f = 1;
        f22681c = 0;
        f22682d = 1;
        e();
        TextUtils.indexOf("", "", 0, 0);
        TextUtils.indexOf("", "");
        ViewConfiguration.getKeyRepeatDelay();
        int i2 = f22684f + 69;
        f22680b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
    }

    public static o.fn.c c(a aVar) throws f {
        int i2 = 2 % 2;
        int i3 = f22682d + 29;
        f22681c = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                int i4 = 99 / 0;
                if (o.ea.f.a()) {
                    Object[] objArr = new Object[1];
                    g((char) (54409 - View.resolveSizeAndState(0, 0, 0)), Color.argb(0, 0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    g((char) TextUtils.indexOf("", "", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19, objArr2);
                    o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                }
            } else if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                g((char) (54409 - View.resolveSizeAndState(0, 0, 0)), Color.argb(0, 0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr22 = new Object[1];
                g((char) TextUtils.indexOf("", "", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19, objArr22);
                o.ea.f.c(strIntern2, ((String) objArr22[0]).intern());
            }
            if (aVar == null) {
                Object[] objArr4 = new Object[1];
                g((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 48 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 18, objArr4);
                throw new f(((String) objArr4[0]).intern());
            }
            Object[] objArr5 = new Object[1];
            g((char) TextUtils.indexOf("", "", 0, 0), 68 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') - '(', objArr5);
            Object[] objArr6 = {aVar, ((String) objArr5[0]).intern()};
            int i5 = a.f23782p * (-1576737484);
            a.f23782p = i5;
            String str = (String) a.a(-781664457, objArr6, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
            Object[] objArr7 = new Object[1];
            g((char) View.MeasureSpec.getMode(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 74, 4 - TextUtils.getTrimmedLength(""), objArr7);
            Object[] objArr8 = {aVar, ((String) objArr7[0]).intern()};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iMyUid = Process.myUid();
            int i6 = (-1229108307) * a.f23780n;
            a.f23780n = i6;
            Object[] objArr9 = new Object[1];
            g((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 79 - View.getDefaultSize(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr9);
            Object[] objArr10 = {aVar, ((String) objArr9[0]).intern(), 0};
            int priority = Thread.currentThread().getPriority();
            int i7 = a.f23777k * (-845283131);
            a.f23777k = i7;
            int iIntValue = ((Integer) a.a(1647814368, objArr10, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority, i7)).intValue();
            Object[] objArr11 = new Object[1];
            g((char) (21599 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 93 - ImageFormat.getBitsPerPixel(0), 14 - View.combineMeasuredStates(0, 0), objArr11);
            Date dateE = aVar.e(((String) objArr11[0]).intern(), false);
            Object[] objArr12 = new Object[1];
            g((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 108 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 15, objArr12);
            o.fn.c cVar = new o.fn.c(str, iIntValue, dateE, aVar.e(((String) objArr12[0]).intern(), false));
            int i8 = f22681c + 111;
            f22682d = i8 % 128;
            int i9 = i8 % 2;
            return cVar;
        } catch (b e2) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr13 = new Object[1];
            g((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6087), 123 - View.MeasureSpec.getSize(0), 69 - View.combineMeasuredStates(0, 0), objArr13);
            throw new f(sb.append(((String) objArr13[0]).intern()).append(e2.getMessage()).toString());
        }
    }

    static void e() {
        f22683e = new char[]{16427, 54040, 26118, 63760, 3094, 40735, 12803, 17726, 55310, 27408, 65084, 4360, 42007, 14129, 18950, 56599, 28730, 33588, 5690, 43305, 15414, 20259, 57892, 29959, 34862, 6952, 44587, 49448, 21553, 38016, 1941, 45719, 11664, 55473, 19357, 59015, 37295, 3207, 49044, 10934, 50565, 28824, 58249, 40579, 2441, 42150, 22453, 49828, 32167, 38043, 1950, 45702, 11649, 55438, 19416, 59060, 37263, 3213, 49038, 10950, 50573, 28825, 58312, 40576, 2457, 42174, 22460, 38041, 1941, 45711, 11687, 55455, 19340, 59063, 37272, 38041, 1941, 45711, 11655, 38044, 1938, 45757, 11665, 55427, 19339, 59050, 37268, 3216, 49029, 10901, 50572, 28805, 58244, 40586, 49350, 21450, 59088, 31192, 36064, 8159, 45777, 50634, 22735, 60358, 32509, 37338, 9409, 47058, 38041, 1941, 45711, 11655, 55464, 19357, 59032, 37262, 3207, 49043, 10894, 50592, 28811, 58268, 40587, 33648, 4171, 42321, 14930, 53010, 23669, 61774, 34391, 6991, 43096, 15706, 53829, 26445, 62542, 35078, 7745, 45940, 16507, 54641, 27241, 65404, 35940, 8563, 46694, 19311, 55404, 27950, 635, 38762, 9321, 47466, 20065, 58202, 28680, 1292, 39443, 12049, 48149, 20741, 58887, 31491, 2054, 40201, 12876, 50962, 21505, 59679, 32265, 4927, 41014, 13610, 51836, 24377, 60469, 33071, 5748, 43834, 14377, 52540, 25133, 63279, 33829, 6450, 44577, 17352, 53451, 26014, 64134, 36754};
        f22679a = -5806537975977867280L;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(char r22, int r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cx.c.g(char, int, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{112, 68, MessagePack.Code.BIN8, -81};
        $$b = 137;
    }
}
