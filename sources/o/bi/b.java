package o.bi;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends AsyncTask<d, Void, Void> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f21234b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f21235d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f21236e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21237f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f21238g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21239h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21240i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21241j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21242a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f21243c;

    public interface e {
        void onDeleteWalletCompleted();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, byte r10, int r11) {
        /*
            byte[] r8 = o.bi.b.$$a
            int r0 = r9 * 6
            int r7 = 73 - r0
            int r0 = r10 * 4
            int r6 = 4 - r0
            int r0 = r11 * 2
            int r5 = r0 + 1
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r8 != 0) goto L2c
            r1 = r6
            r7 = r5
            r2 = r3
        L16:
            int r7 = r7 + r6
            int r6 = r1 + 1
            r1 = r2
        L1a:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r2 != r5) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r8[r6]
            r1 = r6
            r6 = r0
            goto L16
        L2c:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bi.b.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21241j = 0;
        f21237f = 1;
        f21239h = 0;
        f21240i = 1;
        c();
        TextUtils.lastIndexOf("", '0', 0);
        int i2 = f21237f + 11;
        f21241j = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public b(Context context, e eVar) {
        this.f21242a = context;
        this.f21243c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Void a() throws java.lang.Throwable {
        /*
            r12 = this;
            r11 = 2
            int r0 = r11 % r11
            int r0 = o.bi.b.f21240i
            int r1 = r0 + 89
            int r0 = r1 % 128
            o.bi.b.f21239h = r0
            int r1 = r1 % r11
            r10 = 0
            r2 = 0
            if (r1 == 0) goto L1a
            o.en.b r1 = o.en.b.c()
            r0 = 17
            int r0 = r0 / r10
            if (r1 == 0) goto Lae
            goto L20
        L1a:
            o.en.b r0 = o.en.b.c()
            if (r0 == 0) goto Lae
        L20:
            o.en.b.t()     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            android.content.Context r0 = r12.f21242a     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            o.c.a.h(r0)     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            o.by.g r1 = new o.by.g     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            java.lang.Object[] r3 = new java.lang.Object[]{r1}     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            int r7 = o.by.g.f21850a     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            r0 = -1858193773(0xffffffff913e3693, float:-1.5005174E-28)
            int r7 = r7 * r0
            o.by.g.f21850a = r7     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            int r4 = o.by.g.f21853d     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            r0 = 1414328504(0x544cf0b8, float:3.5208477E12)
            int r4 = r4 * r0
            o.by.g.f21853d = r4     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            int r5 = o.by.g.f21852c     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            r0 = -2003308375(0xffffffff8897f0a9, float:-9.144561E-34)
            int r5 = r5 * r0
            o.by.g.f21852c = r5     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            int r6 = o.by.g.f21854e     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            r0 = 1746513136(0x6819acf0, float:2.9028488E24)
            int r6 = r6 * r0
            o.by.g.f21854e = r6     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            r8 = -192268551(0xfffffffff48a36f9, float:-8.7604E31)
            r9 = 192268551(0xb75c907, float:4.733652E-32)
            o.by.g.e(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            android.content.Context r0 = r12.f21242a     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            r1.d(r0)     // Catch: java.lang.InterruptedException -> L60 java.lang.Throwable -> La6
            goto Lab
        L60:
            r8 = move-exception
            boolean r0 = o.ea.f.a()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L99
            int r0 = android.graphics.Color.green(r10)     // Catch: java.lang.Throwable -> La6
            int r3 = r0 + 127
            java.lang.String r1 = "\u008e\u008a\u0086\u008d\u008d\u008c\u008b\u0082\u008a\u0089\u0083\u0088\u0088\u0087\u0084\u0082\u0083\u0083\u0086\u0085\u0082\u0084\u0082\u0083\u0082\u0081"
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> La6
            k(r3, r2, r2, r1, r0)     // Catch: java.lang.Throwable -> La6
            r0 = r0[r10]     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La6
            java.lang.String r7 = r0.intern()     // Catch: java.lang.Throwable -> La6
            long r5 = android.os.SystemClock.currentThreadTimeMillis()     // Catch: java.lang.Throwable -> La6
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            int r3 = 128 - r0
            java.lang.String r1 = "\u008e\u008a\u0095\u008c\u0094\u0093\u0092\u0091\u0086\u0090\u008a\u008f\u008c\u008e"
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> La6
            k(r3, r2, r2, r1, r0)     // Catch: java.lang.Throwable -> La6
            r0 = r0[r10]     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Throwable -> La6
            o.ea.f.e(r7, r0, r8)     // Catch: java.lang.Throwable -> La6
        L99:
            o.en.b.r()
            int r0 = o.bi.b.f21239h
            int r1 = r0 + 27
            int r0 = r1 % 128
            o.bi.b.f21240i = r0
            int r1 = r1 % r11
            goto Lae
        La6:
            r0 = move-exception
            o.en.b.r()
            throw r0
        Lab:
            o.en.b.r()
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bi.b.a():java.lang.Void");
    }

    private void b(Void r9) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21239h + 95;
        f21240i = i3 % 128;
        if (i3 % 2 == 0) {
            super.onPostExecute(r9);
            f.a();
            throw null;
        }
        super.onPostExecute(r9);
        if (f.a()) {
            Object[] objArr = new Object[1];
            k(Color.red(0) + 127, null, null, "\u008e\u008a\u0086\u008d\u008d\u008c\u008b\u0082\u008a\u0089\u0083\u0088\u0088\u0087\u0084\u0082\u0083\u0083\u0086\u0085\u0082\u0084\u0082\u0083\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k(127 - Color.argb(0, 0, 0, 0), null, null, "\u0082\u0084\u0095\u0091\u0082\u0099\u0098\u0084\u0097\u008c\u0096\u008a\u008c", objArr2);
            f.d(strIntern, ((String) objArr2[0]).intern());
        }
        e eVar = this.f21243c;
        if (eVar != null) {
            eVar.onDeleteWalletCompleted();
            int i4 = f21239h + 51;
            f21240i = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static void c() {
        f21235d = new char[]{2466, 2435, 2442, 2162, 2449, 2439, 2473, 2432, 2447, 2440, 2469, 2441, 2443, 2434, 2479, 2468, 2437, 2445, 2433, 2164, 2163, 2454, 2165, 2467, 2174};
        f21236e = 2040400358;
        f21234b = true;
        f21238g = true;
    }

    static void init$0() {
        $$a = new byte[]{97, 52, 124, MessagePack.Code.EXT16};
        $$b = 106;
    }

    private static void k(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
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
        char[] cArr3 = f21235d;
        int i4 = 0;
        if (cArr3 != null) {
            int i5 = $11 + 39;
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
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        int capsMode = 593 - TextUtils.getCapsMode("", i4, i4);
                        char cIndexOf = (char) (13181 - TextUtils.indexOf("", ""));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(i4) + 11;
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(capsMode, cIndexOf, iNormalizeMetaState, -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        Object[] objArr3 = {Integer.valueOf(f21236e)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (!(!f21238g)) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i7 = $11 + 81;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a(458 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (TextUtils.lastIndexOf("", '0') + 1), 10 - TextUtils.indexOf((CharSequence) "", '0', 0), -1923924106, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i9 = $11 + 35;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 2 / 5;
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i11 = 0;
        if (f21234b) {
            fVar.f19923e = cArr2.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            int i12 = $11 + 81;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            while (fVar.f19922a < fVar.f19923e) {
                int i14 = $11 + 33;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr5[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA4 = o.d.d.a(458 - TextUtils.getOffsetAfter("", 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, -1923924106, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i11;
            if (fVar.f19922a >= fVar.f19923e) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i16 = $10 + 51;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e % 1) + fVar.f19922a] / i2] % iIntValue);
                i11 = fVar.f19922a;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i11 = fVar.f19922a + 1;
            }
        }
    }

    public final void d(d dVar) {
        int i2 = 2 % 2;
        int i3 = f21239h + 35;
        f21240i = i3 % 128;
        int i4 = i3 % 2;
        execute(dVar);
        int i5 = f21240i + 121;
        f21239h = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Void doInBackground(d[] dVarArr) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21239h + 39;
        f21240i = i3 % 128;
        int i4 = i3 % 2;
        Void voidA = a();
        if (i4 == 0) {
            int i5 = 10 / 0;
        }
        return voidA;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Void r4) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21239h + 1;
        f21240i = i3 % 128;
        int i4 = i3 % 2;
        b(r4);
        if (i4 == 0) {
            int i5 = 2 / 0;
        }
        int i6 = f21239h + 97;
        f21240i = i6 % 128;
        int i7 = i6 % 2;
    }
}
