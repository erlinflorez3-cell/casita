package o.ea;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.o;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends Handler {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f23504a = 0;

    /* JADX INFO: renamed from: b */
    private static long f23505b = 0;

    /* JADX INFO: renamed from: c */
    private static int f23506c = 0;

    /* JADX INFO: renamed from: e */
    private static char[] f23507e = null;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r5, short r6, short r7) {
        /*
            int r0 = r6 * 4
            int r0 = 3 - r0
            int r1 = r7 * 2
            int r7 = r1 + 1
            int r6 = 105 - r5
            byte[] r5 = o.ea.e.$$a
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r5 != 0) goto L27
            r2 = r0
            r1 = r3
        L13:
            int r6 = r6 + r0
            r0 = r2
        L15:
            int r2 = r0 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r5[r2]
            goto L13
        L27:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.e.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23506c = 0;
        f23504a = 1;
        f23507e = new char[]{38974, 40426, 37873, 35316, 36850, 34291, 48117, 45514, 47074, 44514, 41961, 55778, 57322, 54778, 52137, 49575, 51115, 65008, 62460, 59877, 61415, 58865, 7141, 4593, 6139, 3537, 1016, 14829, 16364, 13817, 11262, 8703, 38039, 37247, 40830, 34144, 33660, 35113, 46975, 48483, 47971, 41321, 44897, 54567, 54114, 55656, 51059, 52595, 52067, 61801, 65407, 58743, 58231, 59767, 6015, 7483, 7031, 368, 3943, 13668, 13175, 14710, 10101, 11571, 11120, 20820, 24332, 17755, 17222, 18764, 30472, 32071, 31557, 24906, 28500, 38210, 37716};
        f23505b = -150520468921085683L;
    }

    public e() {
    }

    public e(Looper looper) {
        super(looper);
    }

    private static void d(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        int i5 = $11 + 13;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (oVar.f19947b < i3) {
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f23507e[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 743, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf("", "", 0, 0) + 12, 632508977, false, $$c((byte) ($$b & 14), b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f23505b), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    int iAxisFromString = MotionEvent.axisFromString("") + 767;
                    char gidForName = (char) (Process.getGidForName("") + 12471);
                    int iIndexOf = 11 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte b3 = (byte) ($$b & 13);
                    byte b4 = (byte) (b3 - 5);
                    objA2 = o.d.d.a(iAxisFromString, gidForName, iIndexOf, 1946853218, false, $$c(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA3 = o.d.d.a(387 - TextUtils.getOffsetBefore("", 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 18, 39570797, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objA4 = o.d.d.a((Process.myTid() >> 22) + 387, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, 39570797, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i8 = $10 + 115;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{37, Ascii.SUB, MessagePack.Code.FLOAT32, 10};
        $$b = 183;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23506c + 111;
        f23504a = i3 % 128;
        int i4 = i3 % 2;
        try {
            super.dispatchMessage(message);
            int i5 = f23504a + 89;
            f23506c = i5 % 128;
            int i6 = i5 % 2;
        } catch (RuntimeException e2) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                d((char) (3208 - Process.getGidForName("")), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 32, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                d((char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getTapTimeout() >> 16) + 32, (ViewConfiguration.getTapTimeout() >> 16) + 45, objArr2);
                f.e(strIntern, ((String) objArr2[0]).intern(), e2);
            }
        }
    }
}
