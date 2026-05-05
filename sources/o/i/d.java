package o.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import o.a.j;
import o.ea.f;
import o.g.a;
import o.m.i;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26276b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26277d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f26278e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static short[] f26279f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static byte[] f26280g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26281h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26282i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26283j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f26284l = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<i, a> f26286c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26285a = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, short r10, short r11) {
        /*
            int r0 = r11 * 3
            int r8 = r0 + 4
            byte[] r7 = o.i.d.$$a
            int r6 = 104 - r9
            int r0 = r10 * 4
            int r5 = 1 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r7 != 0) goto L27
            r0 = r5
            r2 = r3
        L13:
            int r6 = r6 + r0
            int r8 = r8 + 1
            r1 = r2
        L17:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r5) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r7[r8]
            goto L13
        L27:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.i.d.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26282i = 0;
        f26284l = 1;
        f26281h = 0;
        f26283j = 1;
        a();
        ViewConfiguration.getZoomControlsTimeout();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        AndroidCharacter.getMirror('0');
        Process.getElapsedCpuTime();
        TextUtils.indexOf("", "", 0);
        int i2 = f26282i + 39;
        f26284l = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
    }

    static void a() {
        f26276b = -791463670;
        f26278e = 1150422500;
        f26277d = -1603248431;
        f26280g = new byte[]{-28, -115, MessagePack.Code.INT64, 126, -31, -108, MessagePack.Code.UINT64, -31, 126, -17, -115, -26, -22, -17, 126, 123, -25, -20, -31, -84, -104, -76, 93, -69, -89, -106, -91, -72, -95, -71, -109, -81, MessagePack.Code.TRUE, 115, -66, -65, -109, -92, -1, -4, -115, -115, -115};
    }

    static void init$0() {
        $$a = new byte[]{Ascii.NAK, 117, 119, 110};
        $$b = 44;
    }

    private static void k(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        int i5;
        long j2;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f26278e)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 239, (char) (44531 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf("", "", 0) + 11, 35969549, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                i5 = 1;
            } else {
                int i7 = $11 + 27;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i5 = 0;
            }
            if ((i5 ^ 1) != 1) {
                int i9 = $10 + 93;
                int i10 = i9 % 128;
                $11 = i10;
                int i11 = i9 % 2;
                byte[] bArr2 = f26280g;
                if (bArr2 != null) {
                    int i12 = i10 + 71;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    for (int i13 = 0; i13 < length; i13++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i13])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 1;
                            byte b6 = (byte) (b5 - 1);
                            objA2 = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28649), 11 - (KeyEvent.getMaxKeyCode() >> 16), 1621469864, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr[i13] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i14 = $11 + 59;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    byte[] bArr3 = f26280g;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f26276b)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 238, (char) (ExpandableListView.getPackedPositionChild(0L) + 44532), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), 35969549, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f26278e) ^ (-7649639543924978291L))));
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f26279f[i2 + ((int) (((long) f26276b) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f26278e) ^ (-7649639543924978291L))));
                }
            } else {
                j2 = -7649639543924978291L;
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f26276b) ^ j2)) + i5;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f26277d), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a(Process.myTid() >> 22, (char) (5357 - ImageFormat.getBitsPerPixel(0)), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f26280g;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i16 = 0;
                    while (i16 < length2) {
                        int i17 = $10 + 45;
                        $11 = i17 % 128;
                        if (i17 % 2 == 0) {
                            bArr5[i16] = (byte) (((long) bArr4[i16]) - 7649639543924978291L);
                        } else {
                            bArr5[i16] = (byte) (((long) bArr4[i16]) ^ (-7649639543924978291L));
                            i16++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = f26280g;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f26279f;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f26281h + 1;
        int i4 = i3 % 128;
        f26283j = i4;
        int i5 = i3 % 2;
        String str = this.f26285a;
        int i6 = i4 + 63;
        f26281h = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    final synchronized void b(a aVar) {
        int i2 = 2 % 2;
        int i3 = f26283j + 53;
        f26281h = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            k((short) ((-45) - (Process.myTid() >> 22)), 1807666041 + (ViewConfiguration.getPressedStateDuration() >> 16), 454929637 - Color.red(0), (-84) - Color.green(0), (byte) (ExpandableListView.getPackedPositionChild(0L) - 63), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            k((short) (KeyEvent.getDeadChar(0, 0) + 87), 1807666061 - TextUtils.indexOf("", "", 0, 0), 454929669 - Drawable.resolveOpacity(0, 0), KeyEvent.getDeadChar(0, 0) - 88, (byte) ((Process.myTid() >> 22) - 118), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(aVar.b()).toString());
            int i4 = f26281h + 87;
            f26283j = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.f26286c.put(aVar.b(), aVar);
    }

    public final synchronized Collection<a> c() {
        Collection<a> collectionValues;
        int i2 = 2 % 2;
        int i3 = f26281h + 31;
        f26283j = i3 % 128;
        if (i3 % 2 == 0) {
            collectionValues = this.f26286c.values();
            int i4 = 1 / 0;
        } else {
            collectionValues = this.f26286c.values();
        }
        int i5 = f26283j + 81;
        f26281h = i5 % 128;
        if (i5 % 2 == 0) {
            return collectionValues;
        }
        int i6 = 5 / 0;
        return collectionValues;
    }

    public final synchronized void e() {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f26283j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f26281h = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            k((short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 45), 1807666041 - Color.green(0), 454929637 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-84) - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (Color.green(0) - 64), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k((short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 74), (Process.myTid() >> 22) + 1807666077, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 454929674, 65484 - AndroidCharacter.getMirror('0'), (byte) (33 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f26283j + 91;
            f26281h = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        this.f26286c.clear();
        int i7 = f26283j + 41;
        f26281h = i7 % 128;
        int i8 = i7 % 2;
    }
}
