package o.ak;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.i;
import o.a.k;
import o.ab.j;
import o.bg.a;
import o.cg.f;
import o.d.d;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends o.ab.e<b> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f20283f = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f20284k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20285l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f20286m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20287n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char f20288o = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f20289t = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f20290g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f20291j;

    /* JADX INFO: renamed from: o.ak.c$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f20292a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f20293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f20294d = 1;

        static {
            int[] iArr = new int[a.values().length];
            f20293c = iArr;
            try {
                iArr[a.aA.ordinal()] = 1;
                int i2 = f20292a;
                int i3 = ((i2 + 55) - (55 | i2)) + (i2 | 55);
                f20294d = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20293c[a.aB.ordinal()] = 2;
                int i6 = f20292a + 95;
                f20294d = i6 % 128;
                int i7 = i6 % 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b {
        void d(o.bg.c cVar);

        void e();
    }

    static final class e extends j<c> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f20295b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static long f20296c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20297d = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f20298g = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(byte r7, byte r8, int r9) {
            /*
                int r0 = r7 * 7
                int r7 = r0 + 107
                byte[] r6 = o.ak.c.e.$$a
                int r0 = r8 * 2
                int r5 = 3 - r0
                int r0 = r9 * 4
                int r4 = 1 - r0
                byte[] r3 = new byte[r4]
                r2 = 0
                if (r6 != 0) goto L28
                r0 = r4
                r1 = r2
            L15:
                int r7 = r7 + r0
            L16:
                byte r0 = (byte) r7
                r3[r1] = r0
                int r5 = r5 + 1
                int r1 = r1 + 1
                if (r1 != r4) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L25:
                r0 = r6[r5]
                goto L15
            L28:
                r1 = r2
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ak.c.e.$$d(byte, byte, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20297d = -203564127;
            f20295b = 0;
            f20298g = 1;
            f20296c = 966526333642788126L;
        }

        e(c cVar) {
            super(cVar, true);
        }

        public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) throws Throwable {
            int i8 = (~((-1) - (((-1) - (~i5)) & ((-1) - i6)))) | (~(i5 | i4));
            int i9 = ~i6;
            int i10 = (-1) - (((-1) - (~(i9 | i4))) & ((-1) - i5));
            int i11 = ~i4;
            int i12 = (~(i4 | i6)) | (~((i9 + i11) - (i9 & i11))) | i5;
            int i13 = i6 + i5 + i2 + ((-737137436) * i7) + ((-1840598144) * i3);
            int i14 = i13 * i13;
            int i15 = (((-699670985) * i6) - 818937856) + (24099949 * i5) + (723770934 * i8) + ((-1447541868) * i10) + ((-723770934) * i12) + ((-1423441920) * i2) + (1335885824 * i7) + ((-1946157056) * i3) + ((-1593638912) * i14);
            int i16 = (i6 * 1252406331) + 1981669868 + (i5 * 1252405337) + (i8 * (-994)) + (i10 * 1988) + (i12 * 994) + (i2 * 1252407325) + (i7 * (-1820396076)) + (i3 * 1320834432) + (i14 * (-447283200));
            if (i15 + (i16 * i16 * 1511325696) != 1) {
                int i17 = 2 % 2;
                int i18 = f20295b + 45;
                f20298g = i18 % 128;
                int i19 = i18 % 2;
                return null;
            }
            Context context = (Context) objArr[1];
            int i20 = 2 % 2;
            Object[] objArr2 = new Object[1];
            v("댪킾댙껨捶迫ဗ絫캊\u0c72銆\uf8f8䠾訃᜵稏쮨\u0893馤\uf599䕛蔣ᯘ", View.resolveSize(0, 0), objArr2);
            o.cg.b bVar = new o.cg.b(context, 46, ((String) objArr2[0]).intern());
            int i21 = f20295b + 9;
            f20298g = i21 % 128;
            int i22 = i21 % 2;
            return bVar;
        }

        static void init$0() {
            $$a = new byte[]{113, 60, -124, 107};
            $$b = 162;
        }

        private static void v(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            Object charArray = str2;
            if (str2 != null) {
                int i4 = $10 + 1;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    str2.toCharArray();
                    throw null;
                }
                charArray = str2.toCharArray();
            }
            k kVar = new k();
            char[] cArrC = k.c(f20296c ^ (-5882309809461882246L), (char[]) charArray, i2);
            kVar.f19939c = 4;
            int i5 = $10 + 41;
            $11 = i5 % 128;
            while (true) {
                int i6 = i5 % 2;
                if (kVar.f19939c >= cArrC.length) {
                    objArr[0] = new String(cArrC, 4, cArrC.length - 4);
                    return;
                }
                int i7 = $10 + 107;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                kVar.f19938a = kVar.f19939c - 4;
                int i9 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f20296c)};
                    Object objA = d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 229, (char) (51004 - View.combineMeasuredStates(0, 0)), 9 - View.MeasureSpec.getMode(0), 1749983833, false, $$d(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = d.a(-912105096);
                    if (objA2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = d.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 675, (char) (Process.myPid() >> 22), 12 - (KeyEvent.getMaxKeyCode() >> 16), 522683165, false, $$d(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                    i5 = $11 + 71;
                    $10 = i5 % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        @Override // o.ab.j
        public final f a(Context context) {
            int i2 = f20297d * (-1008073156);
            f20297d = i2;
            int id = (int) Thread.currentThread().getId();
            int iActiveCount = Thread.activeCount();
            return (f) a(id, Process.myTid(), i2, new Object[]{this, context}, -622871118, 622871119, iActiveCount);
        }

        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            a(iUptimeMillis, Process.myPid(), iFreeMemory, new Object[]{this, aVar}, 1257458720, -1257458720, iElapsedRealtime);
        }

        @Override // o.ab.j
        public final a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20295b + 61;
            f20298g = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == 5001) {
                return a.aA;
            }
            if (i2 == 5002) {
                return a.aB;
            }
            a aVarB = super.b(i2);
            int i6 = f20295b + 63;
            f20298g = i6 % 128;
            if (i6 % 2 != 0) {
                return aVarB;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20298g + 61;
            f20295b = i3 % 128;
            int i4 = i3 % 2;
            ((c) e()).g().d(cVar);
            int i5 = f20295b + 79;
            f20298g = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20295b + 13;
            f20298g = i3 % 128;
            if (i3 % 2 == 0) {
                ((c) e()).g().e();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((c) e()).g().e();
            int i4 = f20298g + 71;
            f20295b = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20295b;
            int i4 = i3 + 79;
            f20298g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 32 / 0;
            }
            int i6 = i3 + 29;
            f20298g = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            v("僬\uf551傏禮\uddc9꩔윔쎁ⴵ⧁", TextUtils.indexOf("", "", 0), objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((c) e()).f20290g);
            int i3 = f20298g + 125;
            f20295b = i3 % 128;
            if (i3 % 2 == 0) {
                return aVar;
            }
            throw null;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20298g + 51;
            f20295b = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v("ጲ棚ፖ륏냜㟛߫꺕滖둋蕒⬃\ue87d㈳ôꧤ毣낺蹞♣\ue526㴑బꓕ悌", ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f20295b + 61;
            f20298g = i5 % 128;
            int i6 = i5 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20298g;
            int i4 = i3 + 111;
            f20295b = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 51;
            f20295b = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void q() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20295b + 61;
            f20298g = i3 % 128;
            int i4 = i3 % 2;
            j().e().j().a(((c) e()).f20290g, ((c) e()).f20291j, o.ep.b.f24426d);
            j().e(h());
            int i5 = f20295b + 71;
            f20298g = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        
            if (r0 != 2) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            j().d(h(), ((o.ak.c) e()).f20290g);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
        
            if (r1 != 2) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
        
            super.s();
            r1 = o.ak.c.e.f20298g + 47;
            o.ak.c.e.f20295b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        
            return;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void s() throws java.lang.Throwable {
            /*
                r4 = this;
                r2 = 2
                int r0 = r2 % r2
                int r0 = o.ak.c.e.f20295b
                int r1 = r0 + 29
                int r0 = r1 % 128
                o.ak.c.e.f20298g = r0
                int r1 = r1 % r2
                r3 = 1
                if (r1 != 0) goto L34
                int[] r1 = o.ak.c.AnonymousClass2.f20293c
                o.bg.c r0 = r4.f()
                o.bg.a r0 = r0.c()
                int r0 = r0.ordinal()
                r1 = r1[r0]
                r0 = 10
                int r0 = r0 / 0
                if (r1 == r3) goto L5d
                if (r1 == r2) goto L49
            L27:
                super.s()
                int r0 = o.ak.c.e.f20298g
                int r1 = r0 + 47
                int r0 = r1 % 128
                o.ak.c.e.f20295b = r0
                int r1 = r1 % r2
                return
            L34:
                int[] r1 = o.ak.c.AnonymousClass2.f20293c
                o.bg.c r0 = r4.f()
                o.bg.a r0 = r0.c()
                int r0 = r0.ordinal()
                r0 = r1[r0]
                if (r0 == r3) goto L5d
                if (r0 == r2) goto L49
                goto L27
            L49:
                o.en.b r2 = r4.j()
                android.content.Context r1 = r4.h()
                o.ab.e r0 = r4.e()
                o.ak.c r0 = (o.ak.c) r0
                java.lang.String r0 = r0.f20290g
                r2.d(r1, r0)
                return
            L5d:
                o.en.b r2 = r4.j()
                android.content.Context r1 = r4.h()
                o.ab.e r0 = r4.e()
                o.ak.c r0 = (o.ak.c) r0
                java.lang.String r0 = r0.f20290g
                r2.c(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ak.c.e.s():void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r7, int r8, byte r9) {
        /*
            int r2 = r8 * 2
            int r1 = 1 - r2
            int r0 = r7 * 3
            int r8 = 3 - r0
            int r7 = 122 - r9
            byte[] r6 = o.ak.c.$$d
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L2c
            r0 = r8
            r7 = r3
            r2 = r4
        L16:
            int r8 = r8 + r7
            r1 = r2
            r7 = r8
            r8 = r0
        L1a:
            byte r0 = (byte) r7
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            int r0 = r8 + 1
            r8 = r6[r0]
            goto L16
        L2c:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ak.c.$$j(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20284k = 0;
        f20289t = 1;
        f20286m = 0;
        f20287n = 1;
        n();
        Process.getGidForName("");
        ViewConfiguration.getDoubleTapTimeout();
        TextUtils.getOffsetBefore("", 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        int i2 = f20284k + 75;
        f20289t = i2 % 128;
        int i3 = i2 % 2;
    }

    public c(Context context, b bVar, o.en.b bVar2) {
        super(context, bVar, bVar2, o.bg.e.C);
    }

    static void init$0() {
        $$d = new byte[]{80, 70, 7, 82};
        $$e = 202;
    }

    static void n() {
        f20283f = 4607592393748163252L;
        f20285l = 1564493270;
        f20288o = (char) 17878;
    }

    private static void q(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object obj = null;
        Object charArray2 = str5;
        if (str5 != null) {
            int i4 = $11 + 55;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str5.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            charArray3 = str4.toCharArray();
        }
        i iVar = new i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 105, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0) + 12, -155898465, false, $$j(b2, b3, (byte) ((b3 + 57) - (57 & b3))), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(Color.rgb(0, 0, 0) + 16778063, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 6488), 12 - (ViewConfiguration.getJumpTapTimeout() >> 16), -694521287, false, $$j(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 54)))), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = d.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 458, (char) TextUtils.getCapsMode("", 0, 0), 11 - TextUtils.indexOf("", "", 0), 1804962841, false, $$j(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 56)))), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = d.a(640 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 65099), 12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1636969060, false, $$j(b8, b9, b9), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                obj = null;
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f20283f ^ 740602047300126166L)) ^ ((long) ((int) (((long) f20285l) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f20288o) ^ 740602047300126166L))));
                iVar.f19932b++;
                int i5 = $11 + 45;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    @Override // o.ab.e
    public final o.ab.c<?> c() {
        int i2 = 2 % 2;
        e eVar = new e(this);
        int i3 = f20287n + 47;
        f20286m = i3 % 128;
        if (i3 % 2 == 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20286m + 35;
        f20287n = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        q((char) (20570 - KeyEvent.normalizeMetaState(0)), "擢\ue6df悰軇ꤗ镩\uf110톅歽⑅즼鱅㼽ꋅ矑‘䈁㚼瑕ꄌ₌ꌳ㩳섧鹣\uf091혹錛", "\uef62\ue666兽㖶", "拐탔媲홐", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20286m + 67;
        f20287n = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    public final void e(String str, String str2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20286m + 105;
        f20287n = i3 % 128;
        if (i3 % 2 != 0) {
            this.f20290g = str;
            this.f20291j = str2;
            a();
        } else {
            this.f20290g = str;
            this.f20291j = str2;
            a();
            int i4 = 39 / 0;
        }
    }
}
