package o.cv;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.o;
import o.cr.d;
import o.ef.a;
import o.fe.e;
import o.ff.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d<e> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22670a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f22671b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22672c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f22673d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22674e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22675h = 0;

    private static String $$c(byte b2, short s2, int i2) {
        int i3 = (s2 * 3) + 4;
        int i4 = b2 * 2;
        byte[] bArr = $$a;
        int i5 = 105 - i2;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 = i3 + i4;
            i3++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i3;
            i5 = bArr[i3] + i5;
            i3 = i7 + 1;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22672c = 0;
        f22675h = 1;
        f22670a = 0;
        f22674e = 1;
        a();
        SystemClock.uptimeMillis();
        TypedValue.complexToFloat(0);
        AudioTrack.getMaxVolume();
        int i2 = f22675h + 69;
        f22672c = i2 % 128;
        int i3 = i2 % 2;
    }

    private static e a(a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        f((char) (20856 - TextUtils.lastIndexOf("", '0')), ViewConfiguration.getJumpTapTimeout() >> 16, TextUtils.getOffsetBefore("", 0) + 2, objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i3 = a.f23778l * 493926616;
        a.f23778l = i3;
        int i4 = a.f23779m * 1131312688;
        a.f23779m = i4;
        int iIntValue = ((Integer) a.a(1122077797, objArr2, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i3, i4)).intValue();
        Object[] objArr3 = new Object[1];
        f((char) Color.argb(0, 0, 0, 0), 2 - View.getDefaultSize(0, 0), 7 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
        Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
        int i5 = a.f23778l * 493926616;
        a.f23778l = i5;
        int i6 = a.f23779m * 1131312688;
        a.f23779m = i6;
        int iIntValue2 = ((Integer) a.a(1122077797, objArr4, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i5, i6)).intValue();
        Object[] objArr5 = new Object[1];
        f((char) (AndroidCharacter.getMirror('0') + 33522), 9 - TextUtils.indexOf("", "", 0), 6 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr5);
        e eVar = new e(true, b.f25845c, aVar.l(((String) objArr5[0]).intern()).shortValue());
        eVar.e(iIntValue);
        eVar.b(0);
        eVar.d(iIntValue2);
        int i7 = f22670a + 117;
        f22674e = i7 % 128;
        if (i7 % 2 != 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void a() {
        f22671b = new char[]{50680, 54134, 38047, 33293, 47542, 55160, 52967, 58768, 4917, 6073, 288, 14984, 21615, 19920, 38072, 33295, 47532, 55160, 52971, 58781, 4907, 2757, 8300, 24328, 30357, 27741, 39907, 45734, 43059, 51153, 64886, 5353, 924};
        f22673d = 6226904608991380076L;
    }

    private static void f(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f22671b[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 741, (char) (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0', 0, 0) + 13, 632508977, false, $$c(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 6)))), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f22673d), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 767, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12470), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1946853218, false, $$c(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(388 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - View.resolveSizeAndState(0, 0, 0), 39570797, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 13;
        $10 = i6 % 128;
        while (true) {
            int i7 = i6 % 2;
            if (oVar.f19947b >= i3) {
                String str = new String(cArr);
                int i8 = $10 + 85;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                objArr[0] = str;
                return;
            }
            int i10 = $11 + 95;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(View.getDefaultSize(0, 0) + 387, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 39570797, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            i6 = $11 + 65;
            $10 = i6 % 128;
        }
    }

    static void init$0() {
        $$a = new byte[]{120, 70, -13, MessagePack.Code.FIXEXT4};
        $$b = 71;
    }

    @Override // o.cr.d
    public final /* synthetic */ o.ff.a e(a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22674e + 21;
        f22670a = i3 % 128;
        int i4 = i3 % 2;
        e eVarA = a(aVar);
        int i5 = f22674e + 91;
        f22670a = i5 % 128;
        int i6 = i5 % 2;
        return eVarA;
    }
}
