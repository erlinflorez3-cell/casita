package o.ad;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import java.lang.reflect.Method;
import java.util.List;
import o.f.a;
import o.m.c;
import o.m.f;
import o.m.h;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e {
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f20151b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f20152d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f20153e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f20154f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f20155g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f20156h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f20157i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f20158j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20159l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f20160m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.h.d f20161a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20162c;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r8, short r9, short r10) {
        /*
            int r0 = r8 * 2
            int r8 = r0 + 1
            int r7 = 105 - r9
            byte[] r6 = o.ad.e.$$c
            int r0 = r10 * 2
            int r5 = 3 - r0
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r6 != 0) goto L27
            r0 = r8
            r2 = r3
        L13:
            int r7 = r7 + r0
            r1 = r2
        L15:
            int r5 = r5 + 1
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r2 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r6[r5]
            goto L13
        L27:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ad.e.$$g(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20159l = 0;
        f20160m = 1;
        f20157i = 0;
        f20155g = 1;
        c();
        Gravity.getAbsoluteGravity(0, 0);
        int i2 = f20159l + 93;
        f20160m = i2 % 128;
        int i3 = i2 % 2;
    }

    public e(Context context, o.h.d dVar) {
        this.f20161a = dVar;
        this.f20162c = o.f.b.c(context);
    }

    private static List<h> a() {
        int i2 = 2 % 2;
        int i3 = f20155g + 103;
        f20157i = i3 % 128;
        int i4 = i3 % 2;
        List<h> listA = c.d().a(f.f26439e);
        int i5 = f20157i + 37;
        f20155g = i5 % 128;
        int i6 = i5 % 2;
        return listA;
    }

    static void c() {
        f20151b = new char[]{2558, 2527, 2508, 2509, 2511, 2526, 2524, 2556, 2496, 2498, 2499, 2525, 2506, 2521, 2522, 2502, 2530, 2520, 2501, 2507, 2321, 2306, 2523, 2486, 2504, 2551, 2505, 2497, 2510, 2540, 2330, 2538};
        f20153e = 2040400177;
        f20152d = true;
        f20156h = true;
        f20158j = new char[]{38016, 16475, 15641, 60153, 51118, 45944, 26719, 17703, 13031, 61354, 56162, 45139, 27916, 23258, 14259, 58213, 55379, 46346, 25283, 24505, 2924, 57454, 56663, 35462, 26550, 21367, 2094, 58710, 53964, 36737, 31598, 20582, 3348, 64215, 55172, 33650, 30818, 21999, 724, 65439, 43826, 32813, 32255, 10975, 1942, 62287, 43064, 34282, 29399, 12254, 6987, 61475, 44534, 39590, 30623, 9032, 6182, 62967, 41641, 40855, 19286, 8199, 7669, 51880, 42962, 37719, 18436, 9654, 4771, 52859, 47950, 36878, 19959, 15024, 5758, 50015, 47105, 38351, 17070, 15983, 60253, 49168, 48617, 27321, 18028, 13114, 59423, 50654, 45734, 38016, 16475, 15641, 60153, 51118, 45944, 26719, 17703, 13031, 61354, 56162, 45139, 27916, 23258, 14259, 58213, 55379, 46346, 25283, 24505, 2924, 57454, 56663, 35462, 26547, 21355, 2110, 58654, 53959, 36736, 31598, 20527, 3345, 64223, 55198, 33663, 30765, 21984, 761, 65417, 43900, 32810, 32239, 10958, 1942, 62222, 43059, 34293, 29330, 12176, 7007, 61498, 44526, 58884, 13023, 20381, 39037, 46378, 49660, 6875, 14243, 16483, 40238, 43494, 49879, 8072, 10334, 17719, 37345, 43735, 51086, 4167, 11581, 31208, 37610, 45011, 63490, 5408, 8699, 31394, 38811, 41026, 64842, 2559, 8887, 32642, 34898, 42251, 61948, 2738, 10083, 28765, 36099, 55778, 62131, 3937, 22620, 30022, 33247, 55982, 63334, 'W', 23822, 27083, 33522, 57204, 59439, 1295, 20951, 27315, 34665, 53306, 60754, 14784, 21125, 28523, 47148, 54546, 38016, 16475, 15641, 60153, 51118, 45944, 26719, 17703, 13031, 61354, 56162, 45139, 27916, 23258, 14259, 58213, 55379, 46346, 25283, 24505, 2924, 57454, 56663, 35462, 26559, 21367, 2105, 58629, 53963, 36736, 31613, 20582, 3347, 64203, 55198, 33662, 30759, 21984, 718, 65423, 43889, 32831, 32254, 10975, 1933, 62272, 43130, 34291, 29378, 12186, 6987, 61474, 44519, 39662, 30600, 9027, 6179, 62955, 41647, 40837, 19286};
        f20154f = -8453843782180519874L;
    }

    static void init$0() {
        $$c = new byte[]{34, -117, -98, -86};
        $$f = 199;
    }

    private static void k(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i3 = 2;
        int i4 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr3 = f20151b;
        Object obj = null;
        if (cArr3 != null) {
            int i5 = $11 + 75;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
            } else {
                length = cArr3.length;
                cArr = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 97;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = o.d.d.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 593, (char) (13181 - ((Process.getThreadPriority(0) + 20) >> 6)), ((Process.getThreadPriority(0) + 20) >> 6) + 11, -1225586509, false, $$g(b2, (byte) ((b2 + 38) - (38 & b2)), b2), new Class[]{Integer.TYPE});
                        }
                        cArr[i6] = ((Character) ((Method) objA).invoke(obj, objArr2)).charValue();
                        i6--;
                        i3 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                    Object objA2 = o.d.d.a(1618406102);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + IptcDirectory.TAG_BY_LINE, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 13181), (-16777205) - Color.rgb(0, 0, 0), -1225586509, false, $$g(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 38))), b3), new Class[]{Integer.TYPE});
                    }
                    cArr[i6] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i6++;
                    i3 = 2;
                    obj = null;
                }
            }
            cArr3 = cArr;
        }
        Object[] objArr4 = {Integer.valueOf(f20153e)};
        Object objA3 = o.d.d.a(-1503702982);
        if (objA3 == null) {
            objA3 = o.d.d.a(((byte) KeyEvent.getModifierMetaStateMask()) + 33, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
        if (f20156h) {
            int i8 = $10 + 47;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b4 = (byte) 0;
                    objA4 = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 458, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, -1923924106, false, $$g(b4, (byte) (32 | b4), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f20152d) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            int i10 = $11 + 101;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = cArr2.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            cArr6[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr6 = {fVar, fVar};
            Object objA5 = o.d.d.a(1540807955);
            if (objA5 == null) {
                byte b5 = (byte) 0;
                objA5 = o.d.d.a(458 - Color.alpha(0), (char) ((-1) - MotionEvent.axisFromString("")), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, -1923924106, false, $$g(b5, (byte) (32 | b5), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(char r21, int r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ad.e.o(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.ad.d a(o.i.d r25) {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ad.e.a(o.i.d):o.ad.d");
    }

    public boolean b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20157i + 97;
        f20155g = i3 % 128;
        int i4 = i3 % 2;
        if (this.f20162c != a.f25705e) {
            int i5 = f20155g + 27;
            f20157i = i5 % 128;
            if (i5 % 2 != 0) {
                a aVar = a.f25702a;
                throw null;
            }
            if (this.f20162c != a.f25702a && this.f20162c != a.f25704c) {
                if (o.ea.f.a()) {
                    int i6 = f20157i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f20155g = i6 % 128;
                    int i7 = i6 % 2;
                    Object[] objArr = new Object[1];
                    k(126 - MotionEvent.axisFromString(""), null, null, "\u0085\u008f\u0092\u0086\u008b\u0086\u0091\u008b\u0089\u0090\u0084\u0086\u0087\u0090\u0084\u008b\u008f\u008e\u0084\u008d\u0081\u008c\u008b\u0086\u008a\u008a\u0089\u0088\u0084\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    k(127 - (ViewConfiguration.getTapTimeout() >> 16), null, null, "\u0083\u009f\u0095\u009a\u0083\u008d\u0084\u0086\u0084\u0083\u0095\u0083\u0093\u0086\u0090\u0084\u008b\u008f\u008c\u008f\u0085\u0087\u0095\u0096\u0095\u0089\u008b\u0095\u0096\u0095\u008c\u008f\u0084\u0085\u0089\u009c\u009c\u008d\u009e\u008f\u0084\u0086\u008c\u009c \u008b\u0089\u0090\u0084\u0086\u0087\u0090\u0084\u008b\u008f\u008e\u0084\u008d\u0081\u0083\u0090", objArr2);
                    o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), this.f20162c));
                }
                return false;
            }
        }
        return true;
    }

    protected abstract boolean b(o.i.d dVar);

    protected abstract boolean d();

    protected final boolean e() throws Throwable {
        int i2 = 2 % 2;
        if (this.f20162c != a.f25703b) {
            int i3 = f20155g + 69;
            f20157i = i3 % 128;
            int i4 = i3 % 2;
            if (this.f20162c != a.f25702a) {
                return true;
            }
        }
        if (!(!o.ea.f.a())) {
            int i5 = f20157i + 31;
            f20155g = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            k((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, null, "\u0085\u008f\u0092\u0086\u008b\u0086\u0091\u008b\u0089\u0090\u0084\u0086\u0087\u0090\u0084\u008b\u008f\u008e\u0084\u008d\u0081\u008c\u008b\u0086\u008a\u008a\u0089\u0088\u0084\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k(TextUtils.lastIndexOf("", '0') + 128, null, null, "\u0083\u009f\u0095\u009a\u0083\u008d\u0084\u0086\u0084\u0083\u0095\u0083\u0093\u0086\u0090\u0084\u008b\u008f\u008c\u008f\u0085\u0087\u0095\u0096\u0095\u0089\u008b\u0095\u0096\u0095\u008c\u008f\u0084\u0085\u0089\u009c\u009c\u008d\u009e\u008b\u0089\u0090\u0084\u0086\u0087\u0090\u0084\u008b\u008f\u008e\u0084\u008d\u0081\u0083\u0090", objArr2);
            o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), this.f20162c));
        }
        int i7 = f20155g + 19;
        f20157i = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
