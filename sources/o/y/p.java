package o.y;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import o.au.e;
import o.ep.h;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: l */
    public static int f27329l = 0;

    /* JADX INFO: renamed from: n */
    public static int f27330n = 0;

    /* JADX INFO: renamed from: o */
    public static int f27331o = 0;

    /* JADX INFO: renamed from: p */
    private static boolean f27332p = false;

    /* JADX INFO: renamed from: q */
    private static int f27333q = 0;

    /* JADX INFO: renamed from: s */
    private static boolean f27334s = false;

    /* JADX INFO: renamed from: t */
    private static char[] f27335t = null;

    /* JADX INFO: renamed from: u */
    private static int f27336u = 0;

    /* JADX INFO: renamed from: v */
    private static int f27337v = 0;

    /* JADX INFO: renamed from: x */
    private static int f27338x = 0;

    /* JADX INFO: renamed from: y */
    private static int f27339y = 0;

    /* JADX INFO: renamed from: k */
    private final boolean f27340k;

    /* JADX INFO: renamed from: m */
    private final o.ep.h f27341m;

    /* JADX INFO: renamed from: o.y.p$5 */
    final class AnonymousClass5 implements e.d {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int f27342a = 0;

        /* JADX INFO: renamed from: c */
        private static char[] f27343c = null;

        /* JADX INFO: renamed from: e */
        private static int f27344e = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r6, short r7, short r8) {
            /*
                int r0 = r7 * 4
                int r0 = r0 + 116
                int r1 = r8 * 4
                int r8 = 3 - r1
                int r1 = r6 * 2
                int r7 = r1 + 1
                byte[] r6 = o.y.p.AnonymousClass5.$$a
                byte[] r5 = new byte[r7]
                r4 = 0
                if (r6 != 0) goto L2d
                r2 = r8
                r3 = r4
            L15:
                int r0 = -r0
                int r0 = r0 + r8
                r8 = r2
                r2 = r3
            L19:
                int r3 = r2 + 1
                byte r1 = (byte) r0
                r5[r2] = r1
                int r2 = r8 + 1
                if (r3 != r7) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L28:
                r1 = r6[r2]
                r8 = r0
                r0 = r1
                goto L15
            L2d:
                r2 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.p.AnonymousClass5.$$c(byte, short, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f27344e = 0;
            f27342a = 1;
            f27343c = new char[]{56505, 56563, 56556, 56548, 56553, 56560, 56545, 56538, 56553, 56561, 56564, 56556, 56539, 56539, 56550, 56548, 56551, 56551, 56535, 56541, 56552, 56540, 56541, 56555, 56553, 56530, 56535, 56550, 56554, 56558, 56552, 56552, 56534, 56532, 56555, 56563, 56556, 56548, 56540, 56546, 56555, 56553, 56558, 56539, 56505, 56563, 56561, 56543, 56545, 56560, 56553, 56548, 56556, 56563, 56521, 56486, 56486, 56519, 56558, 56541, 56535, 56551, 56551, 56548, 56550, 56541, 56540, 56552, 56544, 56548, 56556, 56547, 56548, 56556, 56563, 56542, 56381, 56379, 56361, 56363, 56378, 56371, 56366, 56374, 56381, 56339, 56560, 56560, 56337, 56376, 56359, 56353, 56369, 56369, 56366, 56368, 56359, 56358, 56370, 56356, 56349, 56367, 56372, 56378, 56381, 56373, 56332, 56560, 56560};
        }

        AnonymousClass5() {
        }

        /* JADX WARN: Removed duplicated region for block: B:116:0x00ee A[Catch: all -> 0x020f, TryCatch #0 {all -> 0x020f, blocks: (B:94:0x0036, B:96:0x0047, B:97:0x007a, B:114:0x00d6, B:116:0x00ee, B:117:0x0125, B:129:0x01b5, B:131:0x01c6, B:132:0x01ff, B:122:0x0142, B:124:0x015b, B:125:0x0194), top: B:160:0x0036 }] */
        /* JADX WARN: Removed duplicated region for block: B:124:0x015b A[Catch: all -> 0x020f, TryCatch #0 {all -> 0x020f, blocks: (B:94:0x0036, B:96:0x0047, B:97:0x007a, B:114:0x00d6, B:116:0x00ee, B:117:0x0125, B:129:0x01b5, B:131:0x01c6, B:132:0x01ff, B:122:0x0142, B:124:0x015b, B:125:0x0194), top: B:160:0x0036 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void b(java.lang.String r26, int[] r27, boolean r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 659
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.p.AnonymousClass5.b(java.lang.String, int[], boolean, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{Ascii.ETB, 121, MessagePack.Code.FALSE, Ascii.SI};
            $$b = 242;
        }

        @Override // o.au.e.d
        public final void c(o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f27342a + 11;
            f27344e = i3 % 128;
            int i4 = i3 % 2;
            o.by.c cVarB = o.by.c.b(cVar);
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                b("\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{0, 44, 0, 0}, true, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                b("\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{75, 34, 74, 0}, false, objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(cVarB).toString());
            }
            Object[] objArr3 = {p.this};
            int iMyPid = Process.myPid();
            int i5 = 1488805623 * p.f27331o;
            p.f27331o = i5;
            if (((o.x.f) p.a(objArr3, i5, iMyPid, 2074524128, -2074524127, (int) Process.getElapsedCpuTime(), (int) Runtime.getRuntime().totalMemory())) != null) {
                if (cVar.c() != o.bg.a.az) {
                    p.f(p.this).onError(o.by.c.b(cVar));
                    int i6 = f27342a + 121;
                    f27344e = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
                p.a(p.this);
                Object[] objArr4 = {p.this};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i8 = 1695930166 * p.f27330n;
                p.f27330n = i8;
                int i9 = p.f27329l * 1735757295;
                p.f27329l = i9;
                ((o.x.f) p.a(objArr4, i8, iElapsedRealtime, -625856951, 625856951, i9, Thread.currentThread().getPriority())).onAuthenticationDeclined();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0019  */
        @Override // o.au.e.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e() throws java.lang.Throwable {
            /*
                r8 = this;
                r7 = 2
                int r0 = r7 % r7
                int r0 = o.y.p.AnonymousClass5.f27342a
                int r1 = r0 + 45
                int r0 = r1 % 128
                o.y.p.AnonymousClass5.f27344e = r0
                int r1 = r1 % r7
                r6 = 1
                r5 = 0
                if (r1 == 0) goto L61
                boolean r1 = o.ea.f.a()
                r0 = 72
                int r0 = r0 / r5
                if (r1 == 0) goto L46
            L19:
                r4 = 44
                int[] r2 = new int[]{r5, r4, r5, r5}
                java.lang.Object[] r1 = new java.lang.Object[r6]
                java.lang.String r0 = "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001"
                b(r0, r2, r6, r1)
                r0 = r1[r5]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r3 = r0.intern()
                r0 = 31
                int[] r2 = new int[]{r4, r0, r5, r5}
                java.lang.Object[] r1 = new java.lang.Object[r6]
                java.lang.String r0 = "\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000"
                b(r0, r2, r5, r1)
                r0 = r1[r5]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                o.ea.f.c(r3, r0)
            L46:
                o.y.p r0 = o.y.p.this
                o.x.f r0 = o.y.p.e(r0)
                if (r0 == 0) goto L60
                int r0 = o.y.p.AnonymousClass5.f27344e
                int r1 = r0 + 85
                int r0 = r1 % 128
                o.y.p.AnonymousClass5.f27342a = r0
                int r1 = r1 % r7
                o.y.p r0 = o.y.p.this
                o.x.f r0 = o.y.p.c(r0)
                r0.onProcessSuccess()
            L60:
                return
            L61:
                boolean r0 = o.ea.f.a()
                if (r0 == r6) goto L19
                goto L46
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.p.AnonymousClass5.e():void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r9, int r10, int r11) {
        /*
            int r0 = r11 * 4
            int r8 = 1 - r0
            int r0 = r9 * 6
            int r7 = 73 - r0
            byte[] r6 = o.y.p.$$d
            int r0 = r10 * 2
            int r5 = r0 + 4
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r6 != 0) goto L2a
            r0 = r8
            r2 = r3
        L15:
            int r5 = r5 + 1
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
        L1a:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r2 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r6[r5]
            goto L15
        L2a:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.p.$$j(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27331o = 797954549;
        f27329l = -2120338947;
        f27330n = 462474064;
        f27338x = 0;
        f27339y = 1;
        f27336u = 0;
        f27337v = 1;
        o();
        ViewConfiguration.getWindowTouchSlop();
        int i2 = f27338x + 33;
        f27339y = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public p(String str, o.ep.d dVar, boolean z2, o.ep.h hVar) {
        super(str, dVar);
        this.f27340k = z2;
        this.f27341m = hVar;
    }

    private static void B(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        int i4 = $11 + 39;
        $10 = i4 % 128;
        int i5 = i4 % 2;
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
        o.a.f fVar = new o.a.f();
        char[] cArr2 = f27335t;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(Color.alpha(0) + 593, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13180), 11 - (ViewConfiguration.getEdgeSlop() >> 16), -1225586509, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(f27333q)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - Color.alpha(0), (char) TextUtils.getOffsetAfter("", 0), 11 - (ViewConfiguration.getTouchSlop() >> 8), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f27332p) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a(458 - (Process.myTid() >> 22), (char) Color.argb(0, 0, 0, 0), 11 - ((Process.getThreadPriority(0) + 20) >> 6), -1923924106, false, $$j(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f27334s) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i7 = $10 + 39;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        int i9 = $11 + 59;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        while (fVar.f19922a < fVar.f19923e) {
            cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = o.d.d.a(1540807955);
            if (objA4 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA4 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 459, (char) KeyEvent.normalizeMetaState(0), 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1923924106, false, $$j(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    public static /* synthetic */ Object a(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (-1) - (((-1) - i5) & ((-1) - i3));
        int i9 = ~i3;
        int i10 = ~((i9 + i5) - (i9 & i5));
        int i11 = ~i5;
        int i12 = (-1) - (((-1) - i10) & ((-1) - (~(((-1) - (((-1) - i11) & ((-1) - i4))) | i3))));
        int i13 = (~((i3 + i11) - (i3 & i11))) | i4;
        int i14 = i5 + i4 + i2 + (2127773517 * i6) + (1026174006 * i7);
        int i15 = i14 * i14;
        int i16 = (i5 * (-484454144)) + 743702528 + ((-484454144) * i4) + (i8 * (-1605095679)) + (1605095679 * i12) + ((-1605095679) * i13) + ((-2089549824) * i2) + (367263744 * i6) + ((-1434976256) * i7) + (1105526784 * i15);
        int i17 = (i5 * 21308160) + 1622758390 + (i4 * 21308160) + (i8 * 947) + (i12 * (-947)) + (i13 * 947) + (i2 * 21309107) + (i6 * 1708896471) + (i7 * 664464834) + (i15 * 287244288);
        if (i16 + (i17 * i17 * 966983680) != 1) {
            return c(objArr);
        }
        p pVar = (p) objArr[0];
        int i18 = 2 % 2;
        int i19 = f27337v + 99;
        f27336u = i19 % 128;
        int i20 = i19 % 2;
        o.x.f fVarI = pVar.i();
        int i21 = f27337v + 37;
        f27336u = i21 % 128;
        int i22 = i21 % 2;
        return fVarI;
    }

    static /* synthetic */ void a(p pVar) {
        int i2 = 2 % 2;
        int i3 = f27336u + 29;
        f27337v = i3 % 128;
        int i4 = i3 % 2;
        pVar.e();
        if (i4 == 0) {
            throw null;
        }
    }

    static /* synthetic */ o.x.f b(p pVar) {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = 1695930166 * f27330n;
        f27330n = i2;
        int i3 = f27329l * 1735757295;
        f27329l = i3;
        return (o.x.f) a(new Object[]{pVar}, i2, iElapsedRealtime, -625856951, 625856951, i3, Thread.currentThread().getPriority());
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        p pVar = (p) objArr[0];
        int i2 = 2 % 2;
        int i3 = f27337v + 89;
        f27336u = i3 % 128;
        if (i3 % 2 == 0) {
            return pVar.i();
        }
        pVar.i();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ o.x.f c(p pVar) {
        int i2 = 2 % 2;
        int i3 = f27337v + 63;
        f27336u = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = pVar.i();
        int i5 = f27336u + 117;
        f27337v = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f d(p pVar) {
        int iMyPid = Process.myPid();
        int i2 = 1488805623 * f27331o;
        f27331o = i2;
        return (o.x.f) a(new Object[]{pVar}, i2, iMyPid, 2074524128, -2074524127, (int) Process.getElapsedCpuTime(), (int) Runtime.getRuntime().totalMemory());
    }

    static /* synthetic */ o.x.f e(p pVar) {
        int i2 = 2 % 2;
        int i3 = f27337v + 11;
        f27336u = i3 % 128;
        if (i3 % 2 == 0) {
            return pVar.i();
        }
        pVar.i();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ o.x.f f(p pVar) {
        int i2 = 2 % 2;
        int i3 = f27337v + 19;
        f27336u = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = pVar.i();
        int i5 = f27337v + 9;
        f27336u = i5 % 128;
        if (i5 % 2 == 0) {
            return fVarI;
        }
        throw null;
    }

    static void init$0() {
        $$d = new byte[]{85, MessagePack.Code.BIN32, -28, 50};
        $$e = 252;
    }

    static void o() {
        f27335t = new char[]{2463, 2442, 2163, 2161, 2174, 2434, 2441, 2464, 2433, 2455, 2166, 2435, 2446, 2474, 2167, 2448, 2432, 2465, 2444, 2454, 2451, 2160, 2453, 2164, 2175};
        f27333q = 2040400357;
        f27334s = true;
        f27332p = true;
    }

    public final void a(Context context, o.x.f fVar) throws WalletValidationException {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f27337v + 25;
        f27336u = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            obj2.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            int i4 = f27336u + 71;
            f27337v = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[1];
                B(Color.alpha(1) * 7, null, null, "\u0096\u0096\u008d\u0091\u0098\u0083\u0097\u008d\u008b\u0085\u0096\u008d\u0095\u008d\u0093\u0086\u008f\u0086\u0094\u008f\u0091\u0081\u0089\u0083\u0086\u0088\u0087\u0086\u0084\u0082\u0093\u0082\u0092\u008d\u0083\u0085\u0091\u008d\u0090\u0083\u008d\u008f\u008f\u008e", objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                B(26050 >> MotionEvent.axisFromString(""), null, null, "\u008d\u008b\u0085\u0096\u008d\u0083", objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                B(Color.alpha(0) + 127, null, null, "\u0096\u0096\u008d\u0091\u0098\u0083\u0097\u008d\u008b\u0085\u0096\u008d\u0095\u008d\u0093\u0086\u008f\u0086\u0094\u008f\u0091\u0081\u0089\u0083\u0086\u0088\u0087\u0086\u0084\u0082\u0093\u0082\u0092\u008d\u0083\u0085\u0091\u008d\u0090\u0083\u008d\u008f\u008f\u008e", objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                B(MotionEvent.axisFromString("") + 128, null, null, "\u008d\u008b\u0085\u0096\u008d\u0083", objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        Object[] objArr5 = {this.f27341m};
        int i5 = o.ep.h.f24529j * (-1456136215);
        o.ep.h.f24529j = i5;
        int i6 = o.ep.h.f24527h * 389977318;
        o.ep.h.f24527h = i6;
        int i7 = o.ep.h.f24528i * (-407821031);
        o.ep.h.f24528i = i7;
        int i8 = o.ep.h.f24526f * (-2143292461);
        o.ep.h.f24526f = i8;
        if (((h.e) o.ep.h.c(-1791483773, i5, 1791483775, i6, objArr5, i7, i8)) == h.e.f24570a) {
            b(context, fVar);
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr6 = new Object[1];
        B(127 - (ViewConfiguration.getScrollBarSize() >> 8), null, null, "\u0083\u008d\u008c\u008b\u0085\u008a\u0089\u0083\u0086\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr6);
        throw new WalletValidationException(walletValidationErrorCode, ((String) objArr6[0]).intern());
    }

    @Override // o.y.c
    final void a_() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27336u + 29;
        int i4 = i3 % 128;
        f27337v = i4;
        int i5 = i3 % 2;
        if (!this.f27340k) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            B(127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, null, "\u008d\u0091\u0082\u0099\u0083\u008d\u0090\u0083\u008d\u008c\u008b\u0085\u008a\u0089\u0083\u0086\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        int i6 = i4 + 61;
        f27336u = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
        }
    }

    @Override // o.x.i
    public final String c() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f27337v + 55;
        f27336u = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            B(72 >>> (ViewConfiguration.getFadingEdgeLength() * 34), null, null, "\u0083\u008d\u008c\u008b\u0085\u008a\u0089\u0083\u0086\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            B(127 - (ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "\u0083\u008d\u008c\u008b\u0085\u008a\u0089\u0083\u0086\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f27336u + 115;
        f27337v = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // o.x.i
    public final void c(Context context, o.en.b bVar, o.i.d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27337v + 55;
        f27336u = i3 % 128;
        int i4 = i3 % 2;
        if (!(!o.ea.f.a())) {
            int i5 = f27337v + 75;
            f27336u = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            B((ViewConfiguration.getTapTimeout() >> 16) + 127, null, null, "\u0096\u0096\u008d\u0091\u0098\u0083\u0097\u008d\u008b\u0085\u0096\u008d\u0095\u008d\u0093\u0086\u008f\u0086\u0094\u008f\u0091\u0081\u0089\u0083\u0086\u0088\u0087\u0086\u0084\u0082\u0093\u0082\u0092\u008d\u0083\u0085\u0091\u008d\u0090\u0083\u008d\u008f\u008f\u008e", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            B(127 - Color.blue(0), null, null, "\u0096\u0096\u008d\u0091\u0098\u0083\u0097\u008f\u0085\u0083", objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        new o.au.e(context, new e.d() { // from class: o.y.p.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            private static int f27342a = 0;

            /* JADX INFO: renamed from: c */
            private static char[] f27343c = null;

            /* JADX INFO: renamed from: e */
            private static int f27344e = 0;

            private static String $$c(byte v2, short v3, short v4) {
                /*
                    int r0 = r7 * 4
                    int r0 = r0 + 116
                    int r1 = r8 * 4
                    int r8 = 3 - r1
                    int r1 = r6 * 2
                    int r7 = r1 + 1
                    byte[] r6 = o.y.p.AnonymousClass5.$$a
                    byte[] r5 = new byte[r7]
                    r4 = 0
                    if (r6 != 0) goto L2d
                    r2 = r8
                    r3 = r4
                L15:
                    int r0 = -r0
                    int r0 = r0 + r8
                    r8 = r2
                    r2 = r3
                L19:
                    int r3 = r2 + 1
                    byte r1 = (byte) r0
                    r5[r2] = r1
                    int r2 = r8 + 1
                    if (r3 != r7) goto L28
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L28:
                    r1 = r6[r2]
                    r8 = r0
                    r0 = r1
                    goto L15
                L2d:
                    r2 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.p.AnonymousClass5.$$c(byte, short, short):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f27344e = 0;
                f27342a = 1;
                f27343c = new char[]{56505, 56563, 56556, 56548, 56553, 56560, 56545, 56538, 56553, 56561, 56564, 56556, 56539, 56539, 56550, 56548, 56551, 56551, 56535, 56541, 56552, 56540, 56541, 56555, 56553, 56530, 56535, 56550, 56554, 56558, 56552, 56552, 56534, 56532, 56555, 56563, 56556, 56548, 56540, 56546, 56555, 56553, 56558, 56539, 56505, 56563, 56561, 56543, 56545, 56560, 56553, 56548, 56556, 56563, 56521, 56486, 56486, 56519, 56558, 56541, 56535, 56551, 56551, 56548, 56550, 56541, 56540, 56552, 56544, 56548, 56556, 56547, 56548, 56556, 56563, 56542, 56381, 56379, 56361, 56363, 56378, 56371, 56366, 56374, 56381, 56339, 56560, 56560, 56337, 56376, 56359, 56353, 56369, 56369, 56366, 56368, 56359, 56358, 56370, 56356, 56349, 56367, 56372, 56378, 56381, 56373, 56332, 56560, 56560};
            }

            AnonymousClass5() {
            }

            /* JADX WARN: Removed duplicated region for block: B:116:0x00ee A[Catch: all -> 0x020f, TryCatch #0 {all -> 0x020f, blocks: (B:94:0x0036, B:96:0x0047, B:97:0x007a, B:114:0x00d6, B:116:0x00ee, B:117:0x0125, B:129:0x01b5, B:131:0x01c6, B:132:0x01ff, B:122:0x0142, B:124:0x015b, B:125:0x0194), top: B:160:0x0036 }] */
            /* JADX WARN: Removed duplicated region for block: B:124:0x015b A[Catch: all -> 0x020f, TryCatch #0 {all -> 0x020f, blocks: (B:94:0x0036, B:96:0x0047, B:97:0x007a, B:114:0x00d6, B:116:0x00ee, B:117:0x0125, B:129:0x01b5, B:131:0x01c6, B:132:0x01ff, B:122:0x0142, B:124:0x015b, B:125:0x0194), top: B:160:0x0036 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void b(java.lang.String r26, int[] r27, boolean r28, java.lang.Object[] r29) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 659
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.p.AnonymousClass5.b(java.lang.String, int[], boolean, java.lang.Object[]):void");
            }

            static void init$0() {
                $$a = new byte[]{Ascii.ETB, 121, MessagePack.Code.FALSE, Ascii.SI};
                $$b = 242;
            }

            @Override // o.au.e.d
            public final void c(o.bg.c cVar) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f27342a + 11;
                f27344e = i32 % 128;
                int i42 = i32 % 2;
                o.by.c cVarB = o.by.c.b(cVar);
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    b("\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{0, 44, 0, 0}, true, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr22 = new Object[1];
                    b("\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{75, 34, 74, 0}, false, objArr22);
                    o.ea.f.c(strIntern2, sb.append(((String) objArr22[0]).intern()).append(cVarB).toString());
                }
                Object[] objArr32 = {p.this};
                int iMyPid = Process.myPid();
                int i52 = 1488805623 * p.f27331o;
                p.f27331o = i52;
                if (((o.x.f) p.a(objArr32, i52, iMyPid, 2074524128, -2074524127, (int) Process.getElapsedCpuTime(), (int) Runtime.getRuntime().totalMemory())) != null) {
                    if (cVar.c() != o.bg.a.az) {
                        p.f(p.this).onError(o.by.c.b(cVar));
                        int i62 = f27342a + 121;
                        f27344e = i62 % 128;
                        int i7 = i62 % 2;
                        return;
                    }
                    p.a(p.this);
                    Object[] objArr4 = {p.this};
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i8 = 1695930166 * p.f27330n;
                    p.f27330n = i8;
                    int i9 = p.f27329l * 1735757295;
                    p.f27329l = i9;
                    ((o.x.f) p.a(objArr4, i8, iElapsedRealtime, -625856951, 625856951, i9, Thread.currentThread().getPriority())).onAuthenticationDeclined();
                }
            }

            @Override // o.au.e.d
            public final void e() throws Throwable {
                /*
                    this = this;
                    r7 = 2
                    int r0 = r7 % r7
                    int r0 = o.y.p.AnonymousClass5.f27342a
                    int r1 = r0 + 45
                    int r0 = r1 % 128
                    o.y.p.AnonymousClass5.f27344e = r0
                    int r1 = r1 % r7
                    r6 = 1
                    r5 = 0
                    if (r1 == 0) goto L61
                    boolean r1 = o.ea.f.a()
                    r0 = 72
                    int r0 = r0 / r5
                    if (r1 == 0) goto L46
                L19:
                    r4 = 44
                    int[] r2 = new int[]{r5, r4, r5, r5}
                    java.lang.Object[] r1 = new java.lang.Object[r6]
                    java.lang.String r0 = "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001"
                    b(r0, r2, r6, r1)
                    r0 = r1[r5]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r3 = r0.intern()
                    r0 = 31
                    int[] r2 = new int[]{r4, r0, r5, r5}
                    java.lang.Object[] r1 = new java.lang.Object[r6]
                    java.lang.String r0 = "\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000"
                    b(r0, r2, r5, r1)
                    r0 = r1[r5]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r0 = r0.intern()
                    o.ea.f.c(r3, r0)
                L46:
                    o.y.p r0 = o.y.p.this
                    o.x.f r0 = o.y.p.e(r0)
                    if (r0 == 0) goto L60
                    int r0 = o.y.p.AnonymousClass5.f27344e
                    int r1 = r0 + 85
                    int r0 = r1 % 128
                    o.y.p.AnonymousClass5.f27342a = r0
                    int r1 = r1 % r7
                    o.y.p r0 = o.y.p.this
                    o.x.f r0 = o.y.p.c(r0)
                    r0.onProcessSuccess()
                L60:
                    return
                L61:
                    boolean r0 = o.ea.f.a()
                    if (r0 == r6) goto L19
                    goto L46
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.p.AnonymousClass5.e():void");
            }
        }, bVar).a(dVar, g(), e.c.f20672a, ((c) this).f27088r, this.f27341m);
    }
}
