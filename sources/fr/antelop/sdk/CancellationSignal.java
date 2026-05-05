package fr.antelop.sdk;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import java.lang.reflect.Method;
import o.a.j;
import o.a.q;
import o.d.d;

/* JADX INFO: loaded from: classes5.dex */
public class CancellationSignal {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f18695a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f18696b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f18697c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static short[] f18698d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18699e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f18700f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f18701g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f18702h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f18703i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f18704j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f18705k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f18706l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f18707m = 0;
    private final android.os.CancellationSignal osCancellationSignal;

    private static String $$e(int i2, byte b2, int i3) {
        byte[] bArr = $$c;
        int i4 = i3 * 3;
        int i5 = 104 - i2;
        int i6 = 3 - (b2 * 3);
        byte[] bArr2 = new byte[i4 + 1];
        int i7 = -1;
        if (bArr == null) {
            i5 = i6 + (-i4);
            i6 = i6;
        }
        while (true) {
            int i8 = i6 + 1;
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            i5 += -bArr[i8];
            i6 = i8;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f18707m = 1260268902;
        f18706l = 974817475;
        f18705k = 1489502039;
        init$0();
        f18701g = 0;
        f18704j = 1;
        f18702h = 0;
        f18700f = 1;
        c();
        f18699e = 1450376384;
        f18695a = 1150422491;
        f18696b = -1727573171;
        f18697c = new byte[]{-115};
        int i2 = f18701g + 67;
        f18704j = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
    }

    public CancellationSignal(android.os.CancellationSignal cancellationSignal) {
        this.osCancellationSignal = cancellationSignal;
    }

    static void c() {
        f18703i = 6462397052542395217L;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] c(int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 1601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.CancellationSignal.c(int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{90, 91, 103, -77};
        $$b = 186;
    }

    static void init$1() {
        $$c = new byte[]{108, -10, -111, 117};
        $$d = 101;
    }

    private static void n(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i4 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a(732 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (7981 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, 355847088, false, $$e((byte) ($$d & 187), b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i4] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f18703i ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = d.a(1452497747);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 836, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27278), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, -2145994442, false, $$e((byte) 26, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        int i5 = $11 + 21;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = d.a(1452497747);
            if (objA3 == null) {
                byte b4 = (byte) 0;
                objA3 = d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 836, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 27279), 11 - (ViewConfiguration.getEdgeSlop() >> 16), -2145994442, false, $$e((byte) 26, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        String str3 = new String(cArr2);
        int i7 = $10 + 33;
        $11 = i7 % 128;
        if (i7 % 2 != 0) {
            objArr[0] = str3;
        } else {
            int i8 = 43 / 0;
            objArr[0] = str3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(int r9, byte r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = fr.antelop.sdk.CancellationSignal.$$a
            int r0 = r10 * 2
            int r7 = r0 + 4
            int r0 = r9 * 3
            int r6 = r0 + 100
            int r1 = r11 * 2
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r8 != 0) goto L2d
            r1 = r7
            r0 = r3
            r2 = r4
        L18:
            int r7 = r7 + r0
            int r1 = r1 + 1
        L1b:
            byte r0 = (byte) r7
            r5[r2] = r0
            if (r2 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L28:
            int r2 = r2 + 1
            r0 = r8[r1]
            goto L18
        L2d:
            r2 = r4
            r1 = r7
            r7 = r6
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.CancellationSignal.o(int, byte, short, java.lang.Object[]):void");
    }

    private static void p(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        boolean z2;
        long j2;
        int i5;
        boolean z3;
        int i6 = 2;
        int i7 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f18695a)};
            Object objA = d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objA = d.a(238 - KeyEvent.getDeadChar(0, 0), (char) (44531 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.lastIndexOf("", '0', 0) + 12, 35969549, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 51;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                byte[] bArr = f18697c;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $10 + 77;
                        $11 = i11 % 128;
                        if (i11 % i6 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                            Object objA2 = d.a(-1239398195);
                            if (objA2 == null) {
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + IptcDirectory.TAG_COPYRIGHT_NOTICE;
                                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 28649);
                                int offsetBefore = 11 - TextUtils.getOffsetBefore("", 0);
                                byte b5 = (byte) ((-1) - (((-1) - $$d) | ((-1) - 3)));
                                byte b6 = (byte) (b5 - 1);
                                objA2 = d.a(edgeSlop, tapTimeout, offsetBefore, 1621469864, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i10])};
                            Object objA3 = d.a(-1239398195);
                            if (objA3 == null) {
                                int i12 = 629 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                char mode = (char) (28649 - View.MeasureSpec.getMode(0));
                                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 11;
                                byte b7 = (byte) ((-1) - (((-1) - $$d) | ((-1) - 3)));
                                byte b8 = (byte) (b7 - 1);
                                objA3 = d.a(i12, mode, pressedStateDuration, 1621469864, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objA3).invoke(null, objArr4)).byteValue();
                            i10++;
                        }
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f18697c;
                    Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(f18699e)};
                    Object objA4 = d.a(-727631768);
                    if (objA4 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objA4 = d.a(238 - KeyEvent.getDeadChar(0, 0), (char) (44531 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, 35969549, false, $$e(b9, b10, b10), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f18695a) ^ (-7649639543924978291L))));
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f18698d[i2 + ((int) (((long) f18699e) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f18695a) ^ (-7649639543924978291L))));
                }
            } else {
                j2 = -7649639543924978291L;
            }
            if (iIntValue > 0) {
                int i13 = ((i2 + iIntValue) - 2) + ((int) (((long) f18699e) ^ j2));
                if (z2) {
                    i5 = 1;
                } else {
                    int i14 = $11 + 1;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    i5 = 0;
                }
                jVar.f19936d = i13 + i5;
                Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f18696b), sb};
                Object objA5 = d.a(1819197256);
                if (objA5 == null) {
                    objA5 = d.a(ExpandableListView.getPackedPositionChild(0L) + 1, (char) (5358 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f18697c;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i17 = $10 + 69;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z3) {
                        byte[] bArr6 = f18697c;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f18698d;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
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

    public void cancel() {
        int i2 = 2 % 2;
        int i3 = f18702h + 75;
        f18700f = i3 % 128;
        if (i3 % 2 != 0) {
            this.osCancellationSignal.cancel();
        } else {
            this.osCancellationSignal.cancel();
            throw null;
        }
    }
}
