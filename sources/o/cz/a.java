package o.cz;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.h;
import o.cr.d;
import o.ff.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements d<o.fh.a> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22694a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22695b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22696c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f22697d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f22698e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22699f = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, int r8, int r9) {
        /*
            int r0 = r8 * 4
            int r8 = 4 - r0
            int r7 = 111 - r7
            int r6 = r9 * 4
            int r0 = r6 + 1
            byte[] r5 = o.cz.a.$$a
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r5 != 0) goto L29
            r2 = r8
            r1 = r3
        L13:
            int r0 = -r8
            int r7 = r7 + r0
            int r8 = r2 + 1
        L17:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r6) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L22:
            r0 = r5[r8]
            int r1 = r1 + 1
            r2 = r8
            r8 = r0
            goto L13
        L29:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cz.a.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22694a = 0;
        f22699f = 1;
        f22696c = 0;
        f22695b = 1;
        e();
        TextUtils.getOffsetBefore("", 0);
        TextUtils.indexOf("", "");
        int i2 = f22694a + 39;
        f22699f = i2 % 128;
        int i3 = i2 % 2;
    }

    private static o.fh.a a(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        g(3 - Color.green(0), "\n\r㘇", (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 14), objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i3 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i3;
        int i4 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i4;
        int iIntValue = ((Integer) o.ef.a.a(1122077797, objArr2, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i3, i4)).intValue();
        Object[] objArr3 = new Object[1];
        g(TextUtils.indexOf("", "") + 5, "\b\u0007\u0005\u0002㘞", (byte) (Color.red(0) + 60), objArr3);
        o.fh.a aVar2 = new o.fh.a(true, b.f25845c, aVar.l(((String) objArr3[0]).intern()).shortValue());
        aVar2.a(iIntValue);
        int i5 = f22695b + 3;
        f22696c = i5 % 128;
        int i6 = i5 % 2;
        return aVar2;
    }

    static void e() {
        f22697d = new char[]{64631, 64576, 64605, 64582, 64587, 64629, 64577, 64630, 64599, 64580, 64592, 64588, 64604, 64622, 64593, 64584};
        f22698e = (char) 51643;
    }

    private static void g(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = $10 + 101;
        $11 = i6 % 128;
        Object charArray = str2;
        if (i6 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f22697d;
        long j2 = 0;
        char c2 = '\t';
        if (cArr2 != null) {
            int i7 = $11 + 5;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 79;
                $10 = i10 % 128;
                if (i10 % i4 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                        Object objA = o.d.d.a(421932776);
                        if (objA == null) {
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 270;
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(j2) + 12;
                            byte b3 = (byte) 0;
                            objA = o.d.d.a(maxKeyCode, maximumFlingVelocity, packedPositionChild, -811348851, false, $$c((byte) 9, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i9])};
                    Object objA2 = o.d.d.a(421932776);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        objA2 = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 270, (char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, -811348851, false, $$c((byte) 9, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                }
                i9++;
                i4 = 2;
                j2 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(f22698e)};
        Object objA3 = o.d.d.a(421932776);
        if (objA3 == null) {
            byte b5 = (byte) 0;
            objA3 = o.d.d.a(270 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) View.MeasureSpec.getSize(0), 11 - ExpandableListView.getPackedPositionType(0L), -811348851, false, $$c((byte) 9, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                int i11 = $11 + 67;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = hVar;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = hVar;
                    objArr5[c2] = hVar;
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
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA4 = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 824, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), View.getDefaultSize(0, 0) + 11, -611683395, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA4).invoke(null, objArr5)).intValue() == hVar.f19930g) {
                        Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA5 = o.d.d.a(-634864343);
                        if (objA5 == null) {
                            byte b8 = (byte) 2;
                            byte b9 = (byte) (b8 - 2);
                            c2 = '\t';
                            objA5 = o.d.d.a(218 - KeyEvent.getDeadChar(0, 0), (char) Color.green(0), 11 - Color.blue(0), 212688716, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = '\t';
                        }
                        int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                        int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i13];
                        int i14 = $10 + 61;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        c2 = '\t';
                        if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i16 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i17 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i16];
                            cArr4[hVar.f19926b + 1] = cArr2[i17];
                        } else {
                            int i18 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i19 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i18];
                            cArr4[hVar.f19926b + 1] = cArr2[i19];
                        }
                    }
                }
                hVar.f19926b += 2;
            }
        }
        for (int i20 = 0; i20 < i2; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        String str3 = new String(cArr4);
        int i21 = $11 + 125;
        $10 = i21 % 128;
        int i22 = i21 % 2;
        objArr[0] = str3;
    }

    static void init$0() {
        $$a = new byte[]{54, MessagePack.Code.BIN8, MessagePack.Code.UINT64, -16};
        $$b = 193;
    }

    @Override // o.cr.d
    public final /* synthetic */ o.ff.a e(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22696c + 57;
        f22695b = i3 % 128;
        int i4 = i3 % 2;
        o.fh.a aVarA = a(aVar);
        int i5 = f22695b + 99;
        f22696c = i5 % 128;
        if (i5 % 2 == 0) {
            return aVarA;
        }
        throw null;
    }
}
