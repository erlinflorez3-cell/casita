package o.bj;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.q;
import o.ab.j;
import o.bg.c;
import o.cg.b;
import o.cg.f;
import o.ef.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends o.ab.e<d> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f21262f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f21263g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21264j = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21265n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21266o = 0;

    public interface d {
        void c(c cVar);

        void e();
    }

    /* JADX INFO: renamed from: o.bj.e$e, reason: collision with other inner class name */
    static final class C0342e extends j<e> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f21267b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f21268c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f21269d = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static long f21270h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f21271i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f21272j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(int r9, int r10, int r11) {
            /*
                byte[] r8 = o.bj.e.C0342e.$$a
                int r0 = r10 * 2
                int r7 = 1 - r0
                int r0 = r11 * 7
                int r6 = r0 + 71
                int r0 = r9 * 4
                int r5 = r0 + 4
                byte[] r4 = new byte[r7]
                r3 = 0
                if (r8 != 0) goto L2a
                r0 = r7
                r2 = r3
            L15:
                int r5 = r5 + 1
                int r0 = -r0
                int r6 = r6 + r0
                r1 = r2
            L1a:
                int r2 = r1 + 1
                byte r0 = (byte) r6
                r4[r1] = r0
                if (r2 != r7) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L27:
                r0 = r8[r5]
                goto L15
            L2a:
                r1 = r3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bj.e.C0342e.$$d(int, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f21269d = -1340710073;
            f21268c = -586936643;
            f21267b = 629434699;
            f21272j = 0;
            f21271i = 1;
            f21270h = -2729353416821573076L;
        }

        C0342e(e eVar) {
            super(eVar, true);
        }

        public static /* synthetic */ Object c(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
            int i8 = ~(((-1) - (((-1) - (~i2)) & ((-1) - i4))) | i3);
            int i9 = (-1) - (((-1) - i4) & ((-1) - i3));
            int i10 = (i2 + i9) - (i2 & i9);
            int i11 = (~((-1) - (((-1) - (~i4)) & ((-1) - (~i3))))) | i8;
            int i12 = i4 + i3 + i7 + (1512347918 * i5) + (2033855975 * i6);
            int i13 = i12 * i12;
            int i14 = ((i4 * 1295388527) - 26148864) + (1295388527 * i3) + (2139102940 * i8) + (i10 * 1077932178) + (1077932178 * i11) + ((-1921646592) * i7) + (1114898432 * i5) + (1668939776 * i6) + (346619904 * i13);
            int i15 = ((i4 * 1848112433) - 751391395) + (i3 * 1848112433) + (i8 * (-92)) + (i10 * 46) + (i11 * 46) + (i7 * 1848112479) + (i5 * (-818859470)) + (i6 * (-357164103)) + (i13 * 1740046336);
            return i14 + ((i15 * i15) * 1721171968) != 1 ? e(objArr) : d(objArr);
        }

        private static b c(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v("\uf757㣺栁馯짳駱⪣嫏訜뮤\uebcdᬒ䲺糂걯\uddbcව㵭溷", 53161 - (Process.myPid() >> 22), objArr);
            b bVar = new b(context, 9, ((String) objArr[0]).intern());
            int i3 = f21271i + 91;
            f21272j = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        private static /* synthetic */ Object d(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f21271i + 71;
            f21272j = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f21271i + 117;
            f21272j = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{Ascii.ESC, -10, MessagePack.Code.FIXEXT8, 7};
            $$b = 55;
        }

        private static void v(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            Object obj = str2;
            if (str2 != null) {
                int i4 = $10 + 117;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                char[] charArray = str2.toCharArray();
                int i6 = $11 + 75;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                obj = charArray;
            }
            char[] cArr = (char[]) obj;
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i8 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(731 - Color.red(0), (char) (7933 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 355847088, false, $$d(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f21270h ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(ExpandableListView.getPackedPositionGroup(0L) + 836, (char) (27279 - (KeyEvent.getMaxKeyCode() >> 16)), 11 - TextUtils.getOffsetAfter("", 0), -2145994442, false, $$d(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                    int i9 = $11 + 77;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
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
            while (qVar.f19948a < cArr.length) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = o.d.d.a(1452497747);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 836, (char) (TextUtils.indexOf("", "", 0) + 27279), 11 - View.resolveSizeAndState(0, 0, 0), -2145994442, false, $$d(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i11 = $11 + 67;
                $10 = i11 % 128;
                int i12 = i11 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        @Override // o.ab.j
        public final /* synthetic */ f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f21272j + 23;
            f21271i = i3 % 128;
            int i4 = i3 % 2;
            b bVarC = c(context);
            int i5 = f21271i + 9;
            f21272j = i5 % 128;
            int i6 = i5 % 2;
            return bVarC;
        }

        @Override // o.ab.j
        public final void a(a aVar) throws o.ef.b {
            c((int) Runtime.getRuntime().totalMemory(), -417868589, new Object[]{this, aVar}, 417868589, (int) Thread.currentThread().getId(), Thread.currentThread().getPriority(), Thread.currentThread().getPriority());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(c cVar) {
            int i2 = 2 % 2;
            int i3 = f21271i + 39;
            f21272j = i3 % 128;
            if (i3 % 2 == 0) {
                ((e) e()).g().c(cVar);
            } else {
                ((e) e()).g().c(cVar);
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(c cVar) {
            int i2 = 2 % 2;
            int i3 = f21272j + 69;
            f21271i = i3 % 128;
            int i4 = i3 % 2;
            ((e) e()).g().e();
            int i5 = f21271i + 95;
            f21272j = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = f21267b * 2017096040;
            f21267b = i2;
            int i3 = f21268c * 812283600;
            f21268c = i3;
            int i4 = f21269d * (-211804680);
            f21269d = i4;
            return (o.cg.j) c(i2, 462838635, new Object[]{this}, -462838634, i4, (int) SystemClock.uptimeMillis(), i3);
        }

        @Override // o.ab.j
        public final a m() throws o.ef.b {
            int i2 = 2 % 2;
            a aVar = new a();
            int i3 = f21272j + 27;
            f21271i = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 28 / 0;
            }
            return aVar;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f21272j + 111;
            f21271i = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                v("\uf70f穵\uedf6彧싲㑊", 36218 << (ExpandableListView.getPackedPositionForChild(1, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 0) == 0L ? 0 : -1)), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                v("\uf70f穵\uedf6彧싲㑊", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36218, objArr2);
                obj = objArr2[0];
            }
            return ((String) obj).intern();
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f21272j;
            int i4 = i3 + 51;
            f21271i = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 16 / 0;
            }
            int i6 = i3 + 121;
            f21271i = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        @Override // o.ab.j
        public final void q() {
            int i2 = 2 % 2;
            int i3 = f21271i + 49;
            f21272j = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                o.c.a.f(h());
                throw null;
            }
            o.c.a.f(h());
            int i4 = f21272j + 83;
            f21271i = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static String $$j(short s2, byte b2, short s3) {
        int i2 = b2 * 3;
        int i3 = 120 - (s2 * 4);
        byte[] bArr = $$d;
        int i4 = (s3 * 3) + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i3 += i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i4];
            i4++;
            i3 += b3;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21266o = 0;
        f21265n = 1;
        f21263g = 0;
        f21264j = 1;
        n();
        int i2 = f21266o + 91;
        f21265n = i2 % 128;
        int i3 = i2 % 2;
    }

    public e(Context context, d dVar, o.en.b bVar) {
        super(context, dVar, bVar, o.bg.e.f21108f);
    }

    static void init$0() {
        $$d = new byte[]{Ascii.EM, -77, -1, MessagePack.Code.INT8};
        $$e = Mp4VideoDirectory.TAG_COLOR_TABLE;
    }

    private C0342e k() {
        int i2 = 2 % 2;
        C0342e c0342e = new C0342e(this);
        int i3 = f21264j + 59;
        f21263g = i3 % 128;
        int i4 = i3 % 2;
        return c0342e;
    }

    static void n() {
        f21262f = new char[]{56486, 56541, 56555, 56555, 56562, 56564, 56539, 56537, 56558, 56557, 56551, 56551, 56553, 56536, 56369, 56367, 56360, 56360, 56362};
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[PHI: r10
  0x00d0: PHI (r10v7 char) = (r10v0 char), (r10v10 char) binds: [B:32:0x013b, B:24:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(java.lang.String r22, int[] r23, boolean r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bj.e.q(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f21263g + 27;
        f21264j = i3 % 128;
        int i4 = i3 % 2;
        C0342e c0342eK = k();
        int i5 = f21264j + 67;
        f21263g = i5 % 128;
        int i6 = i5 % 2;
        return c0342eK;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21264j + 125;
        f21263g = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        q("\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{0, 13, 0, 0}, false, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f21263g + 39;
        f21264j = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    public final void l() {
        int i2 = 2 % 2;
        int i3 = f21264j + 41;
        f21263g = i3 % 128;
        if (i3 % 2 == 0) {
            a();
            return;
        }
        a();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
