package o.ff;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.a.f;
import o.d.d;

/* JADX INFO: loaded from: classes6.dex */
public class e extends a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f25858b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f25859c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f25860d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f25861e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25862f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25863i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25864a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, byte r9, int r10) {
        /*
            int r0 = r10 * 6
            int r7 = r0 + 67
            int r6 = r8 + 4
            int r0 = r9 * 4
            int r5 = r0 + 1
            byte[] r4 = o.ff.e.$$a
            byte[] r3 = new byte[r5]
            r2 = 0
            if (r4 != 0) goto L26
            r0 = r5
            r1 = r2
        L13:
            int r7 = r7 + r0
        L14:
            byte r0 = (byte) r7
            r3[r1] = r0
            int r1 = r1 + 1
            int r6 = r6 + 1
            if (r1 != r5) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L23:
            r0 = r4[r6]
            goto L13
        L26:
            r1 = r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ff.e.$$c(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25862f = 0;
        f25863i = 1;
        f25859c = new char[]{2435, 2174, 2433, 2161, 2175};
        f25860d = 2040400354;
        f25861e = true;
        f25858b = true;
    }

    public e(boolean z2, b bVar, short s2) {
        super(z2, bVar, s2);
    }

    static void init$0() {
        $$a = new byte[]{82, -6, -97, -22};
        $$b = 81;
    }

    private static void l(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int i3;
        String str3 = str;
        String str4 = str2;
        int i4 = 2 % 2;
        int i5 = $10 + 79;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f25859c;
        int i7 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objA = d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i7;
                        byte b3 = (byte) (b2 + 1);
                        objA = d.a(593 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (13181 - (KeyEvent.getMaxKeyCode() >> 16)), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    i7 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f25860d)};
        Object objA2 = d.a(-1503702982);
        if (objA2 == null) {
            objA2 = d.a(32 - (Process.myTid() >> 22), (char) (ViewConfiguration.getTapTimeout() >> 16), 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f25858b) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA3 = d.a(Color.blue(0) + 458, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, -1923924106, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (f25861e) {
            fVar.f19923e = cArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objA4 = d.a(459 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 11 - View.resolveSize(0, 0), -1923924106, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i9 = $10 + 103;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e / 0) >>> fVar.f19922a] * i2] / iIntValue);
                i3 = fVar.f19922a;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i3 = fVar.f19922a + 1;
            }
            fVar.f19922a = i3;
        }
        objArr[0] = new String(cArr6);
    }

    public final void a(int i2) {
        int i3 = 2 % 2;
        int i4 = f25862f + 11;
        f25863i = i4 % 128;
        if (i4 % 2 != 0) {
            this.f25864a = i2;
        } else {
            this.f25864a = i2;
            int i5 = 54 / 0;
        }
    }

    @Override // o.ff.a
    public void d() {
        int i2 = 2 % 2;
        int i3 = f25863i + 65;
        f25862f = i3 % 128;
        int i4 = i3 % 2;
        c(b.f25843a);
        int i5 = f25863i + 37;
        f25862f = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (b() == o.ff.b.f25845c) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (b() == o.ff.b.f25845c) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        c(o.ff.b.f25844b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r7 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        r1 = o.ff.e.f25863i + 83;
        o.ff.e.f25862f = r1 % 128;
        r1 = r1 % 2;
        r7.d(r6, r5.f25864a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        return true;
     */
    @Override // o.ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(java.lang.String r6, o.dk.a r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = o.ff.e.f25862f
            int r1 = r0 + 17
            int r0 = r1 % 128
            o.ff.e.f25863i = r0
            int r1 = r1 % r4
            r3 = 0
            if (r1 != 0) goto L31
            o.ff.b r2 = r5.b()
            o.ff.b r1 = o.ff.b.f25845c
            r0 = 64
            int r0 = r0 / r3
            if (r2 != r1) goto L3a
        L1a:
            o.ff.b r0 = o.ff.b.f25844b
            r5.c(r0)
            if (r7 == 0) goto L2f
            int r0 = o.ff.e.f25863i
            int r1 = r0 + 83
            int r0 = r1 % 128
            o.ff.e.f25862f = r0
            int r1 = r1 % r4
            int r0 = r5.f25864a
            r7.d(r6, r0)
        L2f:
            r0 = 1
            return r0
        L31:
            o.ff.b r1 = r5.b()
            o.ff.b r0 = o.ff.b.f25845c
            if (r1 != r0) goto L3a
            goto L1a
        L3a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ff.e.d(java.lang.String, o.dk.a):boolean");
    }

    @Override // o.ff.a
    public final short h() {
        int i2 = 2 % 2;
        int i3 = f25862f;
        int i4 = i3 + 85;
        f25863i = i4 % 128;
        short s2 = i4 % 2 == 0 ? (short) 0 : (short) 1;
        int i5 = i3 + 49;
        f25863i = i5 % 128;
        int i6 = i5 % 2;
        return s2;
    }

    public final int i() {
        int i2 = 2 % 2;
        int i3 = f25863i;
        int i4 = i3 + 67;
        f25862f = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f25864a;
        int i7 = i3 + 21;
        f25862f = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final o.ef.a j() throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        Object[] objArr = new Object[1];
        Object obj = null;
        l(View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, null, "\u0083\u0082\u0081", objArr);
        aVar.c(((String) objArr[0]).intern(), this.f25864a);
        Object[] objArr2 = new Object[1];
        l(127 - (ViewConfiguration.getTouchSlop() >> 8), null, null, "\u0084\u0085\u0082\u0081\u0082\u0084", objArr2);
        aVar.a(((String) objArr2[0]).intern(), (Object) b().a());
        int i3 = f25862f + 47;
        f25863i = i3 % 128;
        if (i3 % 2 != 0) {
            return aVar;
        }
        obj.hashCode();
        throw null;
    }
}
