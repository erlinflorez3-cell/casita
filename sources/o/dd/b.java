package o.dd;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.a.l;
import o.a.m;
import o.az.e;
import o.ea.f;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements o.c.e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k */
    private static int f22809k = 0;

    /* JADX INFO: renamed from: l */
    private static int[] f22810l = null;

    /* JADX INFO: renamed from: m */
    private static int f22811m = 0;

    /* JADX INFO: renamed from: n */
    private static char[] f22812n = null;

    /* JADX INFO: renamed from: o */
    private static int f22813o = 0;

    /* JADX INFO: renamed from: t */
    private static int f22814t = 0;

    /* JADX INFO: renamed from: a */
    final c f22815a;

    /* JADX INFO: renamed from: b */
    final Context f22816b;

    /* JADX INFO: renamed from: c */
    HandlerThread f22817c;

    /* JADX INFO: renamed from: d */
    private final o.az.a f22818d;

    /* JADX INFO: renamed from: e */
    o.c.a f22819e;

    /* JADX INFO: renamed from: f */
    private o.az.e f22820f;

    /* JADX INFO: renamed from: g */
    private final g f22821g;

    /* JADX INFO: renamed from: h */
    private final String f22822h;

    /* JADX INFO: renamed from: i */
    private boolean f22823i;

    /* JADX INFO: renamed from: j */
    private final SharedPreferences f22824j;

    /* JADX INFO: renamed from: o.dd.b$5 */
    final class AnonymousClass5 implements e.c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static char[] f22825a = null;

        /* JADX INFO: renamed from: b */
        private static int f22826b = 0;

        /* JADX INFO: renamed from: c */
        private static int f22827c = 0;

        /* JADX INFO: renamed from: e */
        private static char f22828e = 0;

        private static String $$c(byte b2, int i2, int i3) {
            byte[] bArr = $$a;
            int i4 = 4 - (i2 * 4);
            int i5 = 111 - b2;
            int i6 = i3 * 4;
            byte[] bArr2 = new byte[i6 + 1];
            int i7 = -1;
            if (bArr == null) {
                i4++;
                i5 = (-i5) + i4;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i5;
                if (i7 == i6) {
                    return new String(bArr2, 0);
                }
                byte b3 = bArr[i4];
                i4++;
                i5 = (-b3) + i5;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f22827c = 0;
            f22826b = 1;
            f22825a = new char[]{64517, 64576, 64593, 64580, 64577, 64623, 64589, 64588, 64586, 64592, 64599, 64590, 64617, 64587, 64611, 64614, 64585, 64583, 64597, 64520, 64579, 64604, 64624, 64584, 64582};
            f22828e = (char) 51642;
        }

        AnonymousClass5() {
        }

        /* JADX WARN: Removed duplicated region for block: B:84:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void f(int r26, java.lang.String r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 879
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dd.b.AnonymousClass5.f(int, java.lang.String, byte, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{120, -15, 89, -97};
            $$b = 206;
        }

        @Override // o.az.e.c
        public final void b(o.bg.c cVar, o.by.g gVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f22827c + 81;
            f22826b = i3 % 128;
            int i4 = i3 % 2;
            if (f.a()) {
                Object[] objArr = new Object[1];
                f(TextUtils.indexOf("", "", 0) + 12, "\u0011\f\u0015\u0000\u0014\u0016\u0015\u0013\u0000\u0006\u0007\u0012", (byte) (45 - View.MeasureSpec.getSize(0)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f(44 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0015\t\u0004\u0015\n\u0001\b\u0013\u0000\u0004\u0003\u0002\u0004\u0014\u0001\u0012\u0011\u0012\u0004\u0017\n\u0001\u000f\u0004\r\u0012\u0010\u0005\u0004\u0015\f\u0015\u0013\u0003\u0004\u0003\u0004\u000b\u0002\b\u0013\u0006\u000b\u0000", (byte) (TextUtils.lastIndexOf("", '0', 0) + 113), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            b.this.c(false);
            b.this.f22815a.onJobEnd(cVar, b.this, gVar);
            if (b.this.f22819e != null) {
                int i5 = f22826b + 23;
                f22827c = i5 % 128;
                int i6 = i5 % 2;
                b.this.f22819e.a(b.this.f22816b);
            }
            b.this.f22817c.quitSafely();
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0018  */
        @Override // o.az.e.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(o.bg.c r11, o.by.g r12) throws java.lang.Throwable {
            /*
                r10 = this;
                r9 = 2
                int r0 = r9 % r9
                int r0 = o.dd.b.AnonymousClass5.f22827c
                int r1 = r0 + 11
                int r0 = r1 % 128
                o.dd.b.AnonymousClass5.f22826b = r0
                int r1 = r1 % r9
                r4 = 0
                if (r1 != 0) goto L96
                boolean r1 = o.ea.f.a()
                r0 = 54
                int r0 = r0 / r4
                if (r1 == 0) goto L66
            L18:
                int r0 = o.dd.b.AnonymousClass5.f22826b
                int r1 = r0 + 35
                int r0 = r1 % 128
                o.dd.b.AnonymousClass5.f22827c = r0
                int r1 = r1 % r9
                float r1 = android.util.TypedValue.complexToFloat(r4)
                r0 = 0
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                int r3 = r0 + 12
                int r0 = android.view.ViewConfiguration.getPressedStateDuration()
                int r0 = r0 >> 16
                int r0 = 45 - r0
                byte r2 = (byte) r0
                r8 = 1
                java.lang.Object[] r1 = new java.lang.Object[r8]
                java.lang.String r0 = "\u0011\f\u0015\u0000\u0014\u0016\u0015\u0013\u0000\u0006\u0007\u0012"
                f(r3, r0, r2, r1)
                r0 = r1[r4]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r5 = r0.intern()
                long r6 = android.os.SystemClock.elapsedRealtime()
                r1 = 0
                int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                int r3 = 47 - r0
                int r0 = android.graphics.Color.red(r4)
                int r0 = r0 + 68
                byte r2 = (byte) r0
                java.lang.Object[] r1 = new java.lang.Object[r8]
                java.lang.String r0 = "\u0015\t\u0004\u0015\n\u0001\b\u0013\u0000\u0004\u0003\u0002\u0004\u0014\u0001\u0012\u0011\u0012\u0004\u0017\n\u0001\u000f\u0004\r\u0012\u0010\u0005\u0004\u0015\f\u0015\u0013\u0003\u0004\u0003\u0000\u0010\r\u0003\u0013\u0011\u0002\u0003\u0002\u0000"
                f(r3, r0, r2, r1)
                r0 = r1[r4]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                o.ea.f.c(r5, r0)
            L66:
                o.dd.b r0 = o.dd.b.this
                r0.c(r4)
                o.dd.b r0 = o.dd.b.this
                o.dd.b$c r1 = r0.f22815a
                o.dd.b r0 = o.dd.b.this
                r1.onJobEnd(r11, r0, r12)
                o.dd.b r0 = o.dd.b.this
                o.c.a r0 = r0.f22819e
                if (r0 == 0) goto L8e
                int r0 = o.dd.b.AnonymousClass5.f22826b
                int r1 = r0 + 47
                int r0 = r1 % 128
                o.dd.b.AnonymousClass5.f22827c = r0
                int r1 = r1 % r9
                o.dd.b r0 = o.dd.b.this
                o.c.a r1 = r0.f22819e
                o.dd.b r0 = o.dd.b.this
                android.content.Context r0 = r0.f22816b
                r1.a(r0)
            L8e:
                o.dd.b r0 = o.dd.b.this
                android.os.HandlerThread r0 = r0.f22817c
                r0.quitSafely()
                return
            L96:
                boolean r0 = o.ea.f.a()
                if (r0 == 0) goto L66
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dd.b.AnonymousClass5.c(o.bg.c, o.by.g):void");
        }
    }

    public interface c {
        void onJobEnd(o.bg.c cVar, b bVar, o.by.g gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, short r8, short r9) {
        /*
            int r0 = r8 * 2
            int r6 = 4 - r0
            byte[] r5 = o.dd.b.$$a
            int r4 = r9 * 2
            int r1 = r4 + 1
            int r0 = 121 - r7
            byte[] r3 = new byte[r1]
            r1 = -1
            if (r5 != 0) goto L26
            r2 = r6
        L12:
            int r6 = r6 + r0
            int r2 = r2 + 1
        L15:
            int r1 = r1 + 1
            byte r0 = (byte) r6
            r3[r1] = r0
            if (r1 != r4) goto L23
            java.lang.String r1 = new java.lang.String
            r0 = 0
            r1.<init>(r3, r0)
            return r1
        L23:
            r0 = r5[r2]
            goto L12
        L26:
            r2 = r6
            r6 = r0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dd.b.$$c(int, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22811m = 0;
        f22814t = 1;
        f22813o = 0;
        f22809k = 1;
        h();
        Color.alpha(0);
        View.resolveSize(0, 0);
        int i2 = f22814t + 117;
        f22811m = i2 % 128;
        int i3 = i2 % 2;
    }

    b(Context context, c cVar, o.az.a aVar, String str, g gVar) throws Throwable {
        this.f22816b = context;
        this.f22815a = cVar;
        this.f22818d = aVar;
        this.f22822h = str;
        this.f22821g = gVar;
        Object[] objArr = new Object[1];
        p(new int[]{1418991422, 1251078992, -1927824797, 66202079, 1788877553, -424676274, -1927824797, 66202079, 165870358, -216570483, 1875580051, 479685464, -1553675867, 98334659, -158677107, -775294327, -1904242073, 619405033, -2003561861, -350358757, 1876680593, -932102879, 228355544, -461391209}, 47 - View.combineMeasuredStates(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        short sXd = (short) (C1633zX.Xd() ^ (-15936));
        int[] iArr = new int[" ,!.*#\u001de\u001a%#(\u0018 %]q\u001d\u001b \u0010\"\u001d".length()];
        QB qb = new QB(" ,!.*#\u001de\u001a%#(\u0018 %]q\u001d\u001b \u0010\"\u001d");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr2 = {strIntern, 0};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("\u007f|\u000bh|t\u0005vt_\u0001rrp|nvjkx", (short) (C1580rY.Xd() ^ (-23808))), Class.forName(C1593ug.zd("#\u001b1\u001dj* .(o\u001687/5/", (short) (C1499aX.Xd() ^ (-32255)), (short) (C1499aX.Xd() ^ (-24859)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            this.f22824j = (SharedPreferences) method.invoke(context, objArr2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean c(Context context) throws Throwable {
        SharedPreferences sharedPreferences;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f22809k + 35;
        f22813o = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            p(new int[]{1418991422, 1251078992, -1927824797, 66202079, 1788877553, -424676274, -1927824797, 66202079, 165870358, -216570483, 1875580051, 479685464, -1553675867, 98334659, -158677107, -775294327, -1904242073, 619405033, -2003561861, -350358757, 1876680593, -932102879, 228355544, -461391209}, 110 << (ViewConfiguration.getTouchSlop() - 88), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Class<?> cls = Class.forName(C1561oA.Kd("\u0002\u0010\u0007\u0016\u0014\u000f\u000bU\f\u0019\u0019 \u0012\u001c#]s!!(\u001a.+", (short) (C1633zX.Xd() ^ (-9530))));
            Class<?>[] clsArr = {Class.forName(Wg.Zd(":Xsd786LL\u0012z&0)qq", (short) (ZN.Xd() ^ 6061), (short) (ZN.Xd() ^ 20823))), Integer.TYPE};
            Object[] objArr2 = {strIntern, 1};
            short sXd = (short) (C1633zX.Xd() ^ (-24892));
            int[] iArr = new int["\u0001\u007f\u0010o\u0006\u007f\u0012\u0006\u0006r\u0016\n\f\f\u001a\u000e\u0018\u000e\u0011 ".length()];
            QB qb = new QB("\u0001\u007f\u0010o\u0006\u007f\u0012\u0006\u0006r\u0016\n\f\f\u001a\u000e\u0018\u000e\u0011 ");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd + i4));
                i4++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
                Object[] objArr3 = new Object[1];
                p(new int[]{-1479579671, 1234078790, -677959011, 1813750081, 149860605, 1783639371, 1502200915, -1013341370, -2125988116, -1038846249}, 20 >> (Process.myTid() / 79), objArr3);
                obj = objArr3[0];
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            Object[] objArr4 = new Object[1];
            p(new int[]{1418991422, 1251078992, -1927824797, 66202079, 1788877553, -424676274, -1927824797, 66202079, 165870358, -216570483, 1875580051, 479685464, -1553675867, 98334659, -158677107, -775294327, -1904242073, 619405033, -2003561861, -350358757, 1876680593, -932102879, 228355544, -461391209}, (ViewConfiguration.getTouchSlop() >> 8) + 47, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            short sXd2 = (short) (FB.Xd() ^ 22574);
            int[] iArr2 = new int["UcVegbZ%_lhoeor-Gtpwm\u0002z".length()];
            QB qb2 = new QB("UcVegbZ%_lhoeor-Gtpwm\u0002z");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK((sXd2 ^ i5) + xuXd2.CK(iKK2));
                i5++;
            }
            Object[] objArr5 = {strIntern2, 0};
            Method method2 = Class.forName(new String(iArr2, 0, i5)).getMethod(hg.Vd("pm{YmeugePqccam_g[\\i", (short) (Od.Xd() ^ (-23587)), (short) (Od.Xd() ^ (-2577))), Class.forName(Qg.kd(",\"6 k)\u001d)!f\u000b+(\u001e\"\u001a", (short) (Od.Xd() ^ (-23499)), (short) (Od.Xd() ^ (-18450)))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                sharedPreferences = (SharedPreferences) method2.invoke(context, objArr5);
                Object[] objArr6 = new Object[1];
                p(new int[]{-1479579671, 1234078790, -677959011, 1813750081, 149860605, 1783639371, 1502200915, -1013341370, -2125988116, -1038846249}, (Process.myTid() >> 22) + 17, objArr6);
                obj = objArr6[0];
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        boolean z2 = sharedPreferences.getBoolean(((String) obj).intern(), false);
        int i6 = f22813o + 59;
        f22809k = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    static void h() {
        f22810l = new int[]{772224105, -1589627397, 584213452, 468684145, 1951938593, -1928437940, 2084116593, -1691281045, 1385341579, 927469409, 1764904300, 1652518164, 2081050385, -1213964612, -923217436, -418101582, -991370838, 1315683228};
        f22812n = new char[]{56532, 56363, 56362, 56369, 56369, 56359, 56360, 56362, 56365, 56336, 56338, 56370, 56368, 56363, 56367, 56372, 56362, 56497, 56552, 56556, 56517, 56515, 56554, 56555, 56558, 56562, 56562, 56563, 56562, 56555, 56556, 56561, 56555, 56503, 56558, 56555, 56554, 56555, 56556, 56539, 56538, 56542, 56542, 56558, 56556, 56558, 56554, 56555, 56559, 56558, 56555, 56530, 56531, 56553, 56555, 56554, 56557, 56542, 56544, 56555, 56550, 56548, 56551, 56551, 56535, 56544, 56556, 56552, 56556, 56550, 56540, 56547, 56559, 56557, 56552, 56556, 56561, 56535, 56322, 56706, 56444, 56405, 56408, 56704, 56447, 56442, 56445, 56411, 56375, 56375, 56403, 56445, 56709, 56445, 56437, 56447, 56447, 56437, 56437, 56445, 56707, 56707, 56708, 56707, 56444, 56464, 56493, 56493, 56514, 56550, 56516, 56486, 56486, 56514, 56553, 56553, 56514, 56513, 56552, 56556, 56517, 56515, 56554, 56555, 56558, 56564, 56556, 56548, 56558, 56558};
    }

    public /* synthetic */ void i() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22809k + 31;
        f22813o = i3 % 128;
        try {
        } catch (InterruptedException e2) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                p(new int[]{-837798208, -883371944, -677959011, 1813750081, -1463195994, 1098177337}, Color.alpha(0) + 12, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                q("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{78, 27, 145, 19}, true, objArr2);
                f.e(strIntern, ((String) objArr2[0]).intern(), e2);
            }
            o.bg.c cVar = new o.bg.c(o.bg.e.f21105c);
            cVar.d(o.bg.a.al);
            this.f22815a.onJobEnd(cVar, this, new o.by.g());
            this.f22817c.quitSafely();
            int i4 = f22809k + 121;
            f22813o = i4 % 128;
            int i5 = i4 % 2;
        }
        if (i3 % 2 != 0) {
            Thread.sleep(1100L);
            throw null;
        }
        Thread.sleep(1100L);
        this.f22819e.e(this.f22816b, this, new o.dc.e(), null, null);
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            p(new int[]{-837798208, -883371944, -677959011, 1813750081, -1463195994, 1098177337}, 12 - Color.argb(0, 0, 0, 0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr4 = new Object[1];
            q("\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001", new int[]{105, 25, 0, 0}, true, objArr4);
            f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(this.f22822h).toString());
        }
    }

    static void init$0() {
        $$a = new byte[]{Ascii.FF, 10, -28, MessagePack.Code.NEGFIXINT_PREFIX};
        $$b = 96;
    }

    private static void p(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f22810l;
        int i5 = 989264422;
        long j2 = 0;
        int i6 = 16;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = $10 + 55;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 23;
                $11 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        int iMyPid = 675 - (Process.myPid() >> 22);
                        char c2 = (char) (1 - (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)));
                        int jumpTapTimeout = 12 - (ViewConfiguration.getJumpTapTimeout() >> i6);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(iMyPid, c2, jumpTapTimeout, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i9++;
                    i3 = 2;
                    i5 = 989264422;
                    j2 = 0;
                    i6 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f22810l;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i12])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(Process.getGidForName("") + 676, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 12 - (ViewConfiguration.getPressedStateDuration() >> 16), -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i12++;
                int i13 = $10 + 7;
                $11 = i13 % 128;
                int i14 = i13 % 2;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i15 = $10 + 89;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                lVar.f19942e ^= iArr4[i17];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 2;
                    byte b7 = (byte) (b6 - 2);
                    objA3 = o.d.d.a(301 - TextUtils.getCapsMode("", 0, 0), (char) (52696 - TextUtils.indexOf((CharSequence) "", '0', 0)), 11 - Gravity.getAbsoluteGravity(0, 0), -1416256172, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i17++;
            }
            int i19 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i19;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i20 = lVar.f19942e;
            int i21 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                int i22 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 228;
                char c3 = (char) (51003 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int i23 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9;
                byte length4 = (byte) $$a.length;
                byte b8 = (byte) (length4 - 4);
                objA4 = o.d.d.a(i22, c3, i23, -330018025, false, $$c(length4, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void q(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        String str2 = str;
        int i2 = 2;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = f22812n;
        if (cArr2 != null) {
            int i9 = $11 + 111;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 111;
                $11 = i11 % 128;
                int i12 = i11 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) 5;
                        byte b3 = (byte) (b2 - 5);
                        objA = o.d.d.a(249 - View.resolveSize(i4, i4), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1376582792, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr2, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i6) {
                if (bArr[mVar.f19943d] == 1) {
                    int i13 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(ExpandableListView.getPackedPositionChild(0L) + 12, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 10 - ExpandableListView.getPackedPositionType(0L), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA3 = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 837, (char) (27279 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 11, -1210801192, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(21 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (35715 - View.MeasureSpec.makeMeasureSpec(0, 0)), 11 - TextUtils.getOffsetBefore("", 0), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            int i15 = $11 + 69;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i17 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i17, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i17);
        }
        if (z2) {
            int i18 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr6 = new char[i6];
            int i20 = 0;
            while (true) {
                mVar.f19943d = i20;
                if (mVar.f19943d >= i6) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - 1];
                i20 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i21 = 0;
            while (true) {
                mVar.f19943d = i21;
                if (mVar.f19943d >= i6) {
                    break;
                }
                int i22 = $10 + 113;
                $11 = i22 % 128;
                int i23 = i22 % 2;
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i21 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0087 A[Catch: all -> 0x00b2, TryCatch #1 {, blocks: (B:43:0x0002, B:45:0x0014, B:46:0x004e, B:48:0x0052, B:50:0x005d, B:53:0x0065, B:54:0x0066, B:55:0x0069, B:57:0x0087, B:60:0x00a5, B:59:0x0096, B:69:0x00b1, B:65:0x00ad, B:51:0x0062), top: B:75:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized void a() {
        /*
            r7 = this;
            monitor-enter(r7)
            r6 = 2
            int r0 = r6 % r6
            int r0 = o.dd.b.f22813o     // Catch: java.lang.Throwable -> Lb2
            int r1 = r0 + 75
            int r0 = r1 % 128
            o.dd.b.f22809k = r0     // Catch: java.lang.Throwable -> Lb2
            int r1 = r1 % r6
            boolean r0 = o.ea.f.a()     // Catch: java.lang.Throwable -> Lb2
            r3 = 0
            if (r0 == 0) goto L4e
            r0 = 6
            int[] r2 = new int[r0]     // Catch: java.lang.Throwable -> Lb2
            r2 = {x00b6: FILL_ARRAY_DATA , data: [-837798208, -883371944, -677959011, 1813750081, -1463195994, 1098177337} // fill-array     // Catch: java.lang.Throwable -> Lb2
            int r0 = android.os.Process.getThreadPriority(r3)     // Catch: java.lang.Throwable -> Lb2
            int r0 = r0 + 20
            int r0 = r0 >> 6
            int r1 = 12 - r0
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lb2
            p(r2, r1, r0)     // Catch: java.lang.Throwable -> Lb2
            r0 = r0[r3]     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = r0.intern()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001"
            r1 = 17
            r0 = 16
            int[] r1 = new int[]{r1, r0, r3, r3}     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lb2
            q(r2, r1, r5, r0)     // Catch: java.lang.Throwable -> Lb2
            r0 = r0[r3]     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Throwable -> Lb2
            o.ea.f.c(r4, r0)     // Catch: java.lang.Throwable -> Lb2
            int r0 = r6 % r6
        L4e:
            o.az.e r2 = r7.f22820f     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto L69
            int r0 = o.dd.b.f22809k     // Catch: java.lang.Throwable -> Lb2
            int r1 = r0 + 55
            int r0 = r1 % 128
            o.dd.b.f22813o = r0     // Catch: java.lang.Throwable -> Lb2
            int r1 = r1 % r6
            if (r1 == 0) goto L66
            r2.m()     // Catch: java.lang.Throwable -> Lb2
            r0 = 52
            int r0 = r0 / r3
            goto L69
        L64:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lb2
        L66:
            r2.m()     // Catch: java.lang.Throwable -> Lb2
        L69:
            r7.c(r3)     // Catch: java.lang.Throwable -> Lb2
            o.bg.c r2 = new o.bg.c     // Catch: java.lang.Throwable -> Lb2
            o.bg.e r0 = o.bg.e.f21115m     // Catch: java.lang.Throwable -> Lb2
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lb2
            o.bg.a r0 = o.bg.a.ap     // Catch: java.lang.Throwable -> Lb2
            r2.d(r0)     // Catch: java.lang.Throwable -> Lb2
            o.dd.b$c r1 = r7.f22815a     // Catch: java.lang.Throwable -> Lb2
            o.by.g r0 = new o.by.g     // Catch: java.lang.Throwable -> Lb2
            r0.<init>()     // Catch: java.lang.Throwable -> Lb2
            r1.onJobEnd(r2, r7, r0)     // Catch: java.lang.Throwable -> Lb2
            o.c.a r1 = r7.f22819e     // Catch: java.lang.Throwable -> Lb2
            r2 = 7
            if (r1 == 0) goto L96
            android.content.Context r0 = r7.f22816b     // Catch: java.lang.Throwable -> Lb2
            r1.a(r0)     // Catch: java.lang.Throwable -> Lb2
            int r1 = o.dd.b.f22813o     // Catch: java.lang.Throwable -> Lb2
            int r1 = r1 + r2
            int r0 = r1 % 128
            o.dd.b.f22809k = r0     // Catch: java.lang.Throwable -> Lb2
            int r1 = r1 % r6
            if (r1 != 0) goto La5
        L96:
            android.os.HandlerThread r0 = r7.f22817c     // Catch: java.lang.Throwable -> Lb2
            r0.quitSafely()     // Catch: java.lang.Throwable -> Lb2
            int r0 = o.dd.b.f22809k     // Catch: java.lang.Throwable -> Lb2
            int r1 = r0 + 109
            int r0 = r1 % 128
            o.dd.b.f22813o = r0     // Catch: java.lang.Throwable -> Lb2
            int r1 = r1 % r6
            goto La8
        La5:
            int r0 = r6 % r6
            goto L96
        La8:
            if (r1 == 0) goto Lab
            goto Lad
        Lab:
            monitor-exit(r7)
            return
        Lad:
            int r2 = r2 / r3
            monitor-exit(r7)
            return
        Lb0:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dd.b.a():void");
    }

    @Override // o.c.e
    public final void a(o.en.b bVar, o.bg.c cVar, o.by.g gVar) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (this.f22823i) {
            int i3 = f22809k + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f22813o = i3 % 128;
            if (i3 % 2 != 0) {
                o.az.a aVar = o.az.a.f20791b;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.f22818d == o.az.a.f20791b) {
                if (f.a()) {
                    int i4 = f22813o + 115;
                    f22809k = i4 % 128;
                    if (i4 % 2 == 0) {
                        Object[] objArr = new Object[1];
                        p(new int[]{-837798208, -883371944, -677959011, 1813750081, -1463195994, 1098177337}, 64 / View.MeasureSpec.getSize(1), objArr);
                        strIntern = ((String) objArr[0]).intern();
                        Object[] objArr2 = new Object[1];
                        p(new int[]{153161250, -1567463369, -861719389, -412330033, -1380986213, 1211129721, -1547570326, 1090087521, 1555809991, -1986299272, -437927519, 925523832, 434182491, -1189429611, 622944668, -2107762464, -702197837, -135733869, 1930691874, -1763137762, -771417131, -1960134405, -1134905309, 619576956, -963091229, -814209983, -675011817, 1866305660, 697328471, -376300772, -1583431537, 764704881, 922668259, -554862257, 166548172, -389195412, 1114703865, -302111346, 747900093, 828342809, -1835410337, 1524729881, -534400776, -1529200907, 742687192, 724541063, 2139781002, 1662000702, 485912158, 510450503, -659248803, 1544164784, -437674637, 302267261, -1151121567, -365763787, -502646733, -2088474207, -297787913, 591197871, -1755947484, 1615783037, 464567755, -1878385604, 384412983, 1578262322, -1851756244, 1523684163, -191262205, 537711570, -1187882472, -2098699555, 2078916187, 1430375064}, 21630 - (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)), objArr2);
                        obj = objArr2[0];
                    } else {
                        Object[] objArr3 = new Object[1];
                        p(new int[]{-837798208, -883371944, -677959011, 1813750081, -1463195994, 1098177337}, View.MeasureSpec.getSize(0) + 12, objArr3);
                        strIntern = ((String) objArr3[0]).intern();
                        Object[] objArr4 = new Object[1];
                        p(new int[]{153161250, -1567463369, -861719389, -412330033, -1380986213, 1211129721, -1547570326, 1090087521, 1555809991, -1986299272, -437927519, 925523832, 434182491, -1189429611, 622944668, -2107762464, -702197837, -135733869, 1930691874, -1763137762, -771417131, -1960134405, -1134905309, 619576956, -963091229, -814209983, -675011817, 1866305660, 697328471, -376300772, -1583431537, 764704881, 922668259, -554862257, 166548172, -389195412, 1114703865, -302111346, 747900093, 828342809, -1835410337, 1524729881, -534400776, -1529200907, 742687192, 724541063, 2139781002, 1662000702, 485912158, 510450503, -659248803, 1544164784, -437674637, 302267261, -1151121567, -365763787, -502646733, -2088474207, -297787913, 591197871, -1755947484, 1615783037, 464567755, -1878385604, 384412983, 1578262322, -1851756244, 1523684163, -191262205, 537711570, -1187882472, -2098699555, 2078916187, 1430375064}, 146 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
                        obj = objArr4[0];
                    }
                    f.c(strIntern, ((String) obj).intern());
                }
                this.f22815a.onJobEnd(cVar, this, gVar);
                o.c.a aVar2 = this.f22819e;
                if (aVar2 != null) {
                    aVar2.a(this.f22816b);
                }
                this.f22817c.quitSafely();
                return;
            }
        }
        if (f.a()) {
            Object[] objArr5 = new Object[1];
            p(new int[]{-837798208, -883371944, -677959011, 1813750081, -1463195994, 1098177337}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr6 = new Object[1];
            p(new int[]{153161250, -1567463369, -861719389, -412330033, -1380986213, 1211129721, -1547570326, 1090087521, 1555809991, -1986299272, -437927519, 925523832, 434182491, -1189429611, 622944668, -2107762464, 80199823, 1380502676, -2105501771, 1557904072, 1772289389, 749648497, -1250093944, -929389322, -243710665, 1781186827, -302181010, 2041392583, 1069444844, 146240469, 1706373453, -985202379, 1823557715, 1749303570, 760556366, -5015283}, 69 - ExpandableListView.getPackedPositionChild(0L), objArr6);
            f.c(strIntern2, sb.append(((String) objArr6[0]).intern()).append(this.f22818d).toString());
            int i5 = f22813o + 29;
            f22809k = i5 % 128;
            int i6 = i5 % 2;
        }
        c(true);
        AnonymousClass5 anonymousClass5 = new e.c() { // from class: o.dd.b.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            private static char[] f22825a = null;

            /* JADX INFO: renamed from: b */
            private static int f22826b = 0;

            /* JADX INFO: renamed from: c */
            private static int f22827c = 0;

            /* JADX INFO: renamed from: e */
            private static char f22828e = 0;

            private static String $$c(byte b2, int i22, int i32) {
                byte[] bArr = $$a;
                int i42 = 4 - (i22 * 4);
                int i52 = 111 - b2;
                int i62 = i32 * 4;
                byte[] bArr2 = new byte[i62 + 1];
                int i7 = -1;
                if (bArr == null) {
                    i42++;
                    i52 = (-i52) + i42;
                }
                while (true) {
                    i7++;
                    bArr2[i7] = (byte) i52;
                    if (i7 == i62) {
                        return new String(bArr2, 0);
                    }
                    byte b3 = bArr[i42];
                    i42++;
                    i52 = (-b3) + i52;
                }
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f22827c = 0;
                f22826b = 1;
                f22825a = new char[]{64517, 64576, 64593, 64580, 64577, 64623, 64589, 64588, 64586, 64592, 64599, 64590, 64617, 64587, 64611, 64614, 64585, 64583, 64597, 64520, 64579, 64604, 64624, 64584, 64582};
                f22828e = (char) 51642;
            }

            AnonymousClass5() {
            }

            /* JADX WARN: Removed duplicated region for block: B:84:0x0016  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void f(int r26, java.lang.String r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 879
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.dd.b.AnonymousClass5.f(int, java.lang.String, byte, java.lang.Object[]):void");
            }

            static void init$0() {
                $$a = new byte[]{120, -15, 89, -97};
                $$b = 206;
            }

            @Override // o.az.e.c
            public final void b(o.bg.c cVar2, o.by.g gVar2) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f22827c + 81;
                f22826b = i32 % 128;
                int i42 = i32 % 2;
                if (f.a()) {
                    Object[] objArr7 = new Object[1];
                    f(TextUtils.indexOf("", "", 0) + 12, "\u0011\f\u0015\u0000\u0014\u0016\u0015\u0013\u0000\u0006\u0007\u0012", (byte) (45 - View.MeasureSpec.getSize(0)), objArr7);
                    String strIntern3 = ((String) objArr7[0]).intern();
                    Object[] objArr22 = new Object[1];
                    f(44 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0015\t\u0004\u0015\n\u0001\b\u0013\u0000\u0004\u0003\u0002\u0004\u0014\u0001\u0012\u0011\u0012\u0004\u0017\n\u0001\u000f\u0004\r\u0012\u0010\u0005\u0004\u0015\f\u0015\u0013\u0003\u0004\u0003\u0004\u000b\u0002\b\u0013\u0006\u000b\u0000", (byte) (TextUtils.lastIndexOf("", '0', 0) + 113), objArr22);
                    f.c(strIntern3, ((String) objArr22[0]).intern());
                }
                b.this.c(false);
                b.this.f22815a.onJobEnd(cVar2, b.this, gVar2);
                if (b.this.f22819e != null) {
                    int i52 = f22826b + 23;
                    f22827c = i52 % 128;
                    int i62 = i52 % 2;
                    b.this.f22819e.a(b.this.f22816b);
                }
                b.this.f22817c.quitSafely();
            }

            @Override // o.az.e.c
            public final void c(o.bg.c v2, o.by.g v3) throws Throwable {
                /*
                    this = this;
                    r9 = 2
                    int r0 = r9 % r9
                    int r0 = o.dd.b.AnonymousClass5.f22827c
                    int r1 = r0 + 11
                    int r0 = r1 % 128
                    o.dd.b.AnonymousClass5.f22826b = r0
                    int r1 = r1 % r9
                    r4 = 0
                    if (r1 != 0) goto L96
                    boolean r1 = o.ea.f.a()
                    r0 = 54
                    int r0 = r0 / r4
                    if (r1 == 0) goto L66
                L18:
                    int r0 = o.dd.b.AnonymousClass5.f22826b
                    int r1 = r0 + 35
                    int r0 = r1 % 128
                    o.dd.b.AnonymousClass5.f22827c = r0
                    int r1 = r1 % r9
                    float r1 = android.util.TypedValue.complexToFloat(r4)
                    r0 = 0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    int r3 = r0 + 12
                    int r0 = android.view.ViewConfiguration.getPressedStateDuration()
                    int r0 = r0 >> 16
                    int r0 = 45 - r0
                    byte r2 = (byte) r0
                    r8 = 1
                    java.lang.Object[] r1 = new java.lang.Object[r8]
                    java.lang.String r0 = "\u0011\f\u0015\u0000\u0014\u0016\u0015\u0013\u0000\u0006\u0007\u0012"
                    f(r3, r0, r2, r1)
                    r0 = r1[r4]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r5 = r0.intern()
                    long r6 = android.os.SystemClock.elapsedRealtime()
                    r1 = 0
                    int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                    int r3 = 47 - r0
                    int r0 = android.graphics.Color.red(r4)
                    int r0 = r0 + 68
                    byte r2 = (byte) r0
                    java.lang.Object[] r1 = new java.lang.Object[r8]
                    java.lang.String r0 = "\u0015\t\u0004\u0015\n\u0001\b\u0013\u0000\u0004\u0003\u0002\u0004\u0014\u0001\u0012\u0011\u0012\u0004\u0017\n\u0001\u000f\u0004\r\u0012\u0010\u0005\u0004\u0015\f\u0015\u0013\u0003\u0004\u0003\u0000\u0010\r\u0003\u0013\u0011\u0002\u0003\u0002\u0000"
                    f(r3, r0, r2, r1)
                    r0 = r1[r4]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r0 = r0.intern()
                    o.ea.f.c(r5, r0)
                L66:
                    o.dd.b r0 = o.dd.b.this
                    r0.c(r4)
                    o.dd.b r0 = o.dd.b.this
                    o.dd.b$c r1 = r0.f22815a
                    o.dd.b r0 = o.dd.b.this
                    r1.onJobEnd(r11, r0, r12)
                    o.dd.b r0 = o.dd.b.this
                    o.c.a r0 = r0.f22819e
                    if (r0 == 0) goto L8e
                    int r0 = o.dd.b.AnonymousClass5.f22826b
                    int r1 = r0 + 47
                    int r0 = r1 % 128
                    o.dd.b.AnonymousClass5.f22827c = r0
                    int r1 = r1 % r9
                    o.dd.b r0 = o.dd.b.this
                    o.c.a r1 = r0.f22819e
                    o.dd.b r0 = o.dd.b.this
                    android.content.Context r0 = r0.f22816b
                    r1.a(r0)
                L8e:
                    o.dd.b r0 = o.dd.b.this
                    android.os.HandlerThread r0 = r0.f22817c
                    r0.quitSafely()
                    return
                L96:
                    boolean r0 = o.ea.f.a()
                    if (r0 == 0) goto L66
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.dd.b.AnonymousClass5.c(o.bg.c, o.by.g):void");
            }
        };
        if (this.f22818d == o.az.a.f20790a) {
            this.f22820f = new o.bb.c(this.f22816b, anonymousClass5, bVar, this.f22821g);
        } else {
            this.f22820f = new o.bc.d(this.f22816b, anonymousClass5, bVar, this.f22821g);
        }
        this.f22820f.l();
        int i7 = f22809k + 91;
        f22813o = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.c.e
    public final void b() throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f22813o + 125;
        f22809k = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f22813o + 89;
            f22809k = i5 % 128;
            if (i5 % 2 == 0) {
                Object[] objArr = new Object[1];
                p(new int[]{-837798208, -883371944, -677959011, 1813750081, -1463195994, 1098177337}, 106 >>> (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                p(new int[]{153161250, -1567463369, -861719389, -412330033, -1380986213, 1211129721, -1547570326, 1090087521, 1555809991, -1986299272, 1499953207, 220170005, -687013577, -970501496, -931069990, 109595892, -21972673, -861286723, 976889482, -1355627156, -1944673829, 2086832941, 2023318605, 767175734}, 97 / (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                p(new int[]{-837798208, -883371944, -677959011, 1813750081, -1463195994, 1098177337}, 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                p(new int[]{153161250, -1567463369, -861719389, -412330033, -1380986213, 1211129721, -1547570326, 1090087521, 1555809991, -1986299272, 1499953207, 220170005, -687013577, -970501496, -931069990, 109595892, -21972673, -861286723, 976889482, -1355627156, -1944673829, 2086832941, 2023318605, 767175734}, 47 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        this.f22823i = false;
    }

    final synchronized void c() {
        int i2 = 2 % 2;
        int i3 = f22809k + 109;
        f22813o = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            p(new int[]{-837798208, -883371944, -677959011, 1813750081, -1463195994, 1098177337}, KeyEvent.normalizeMetaState(0) + 12, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            p(new int[]{-766825901, -1880849906, -979928695, -607989665, 1361504540, -374072144, -23531022, -995669708, -684839727, -133553906, 731061910, 616958651}, ExpandableListView.getPackedPositionGroup(0L) + 21, objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(this.f22822h).toString());
        }
        if (this.f22819e == null) {
            this.f22819e = new o.c.a(this.f22816b);
            int i4 = f22813o + 51;
            f22809k = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        Object[] objArr3 = new Object[1];
        q(C1561oA.ud("Ɣ\u0007\u0006ƑƐƏ\u0002\u0001\u007fƋƊ|{zyƅw", (short) (Od.Xd() ^ (-28103))), new int[]{0, 17, 67, 0}, true, objArr3);
        HandlerThread handlerThread = new HandlerThread(((String) objArr3[0]).intern());
        this.f22817c = handlerThread;
        handlerThread.start();
        o.ea.e eVar = new o.ea.e(this.f22817c.getLooper());
        Runnable runnable = new Runnable() { // from class: o.dd.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.i();
            }
        };
        Class<?> cls = Class.forName(C1561oA.yd("\r\u0019\u0012\u001f\u001f\u0018\u0016^#&c|\u0019%\u001e%!-", (short) (FB.Xd() ^ 27154)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1580rY.Xd() ^ (-14536));
        int[] iArr = new int["\u0005|\u0013~L\f\u0002\u0010\nQv\u001b\u0015\u0016\n\f\u0017\u0011".length()];
        QB qb = new QB("\u0005|\u0013~L\f\u0002\u0010\nQv\u001b\u0015\u0016\n\f\u0017\u0011");
        int i7 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i7] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i7));
            i7++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i7));
        Object[] objArr4 = {runnable};
        Method method = cls.getMethod(Xg.qd("OOTV", (short) (C1580rY.Xd() ^ (-7499)), (short) (C1580rY.Xd() ^ (-27288))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(eVar, objArr4);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    final void c(boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22809k + 1;
        f22813o = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences.Editor editorEdit = this.f22824j.edit();
        Object[] objArr = new Object[1];
        p(new int[]{-1479579671, 1234078790, -677959011, 1813750081, 149860605, 1783639371, 1502200915, -1013341370, -2125988116, -1038846249}, Color.alpha(0) + 17, objArr);
        editorEdit.putBoolean(((String) objArr[0]).intern(), z2).apply();
        int i5 = f22809k + 111;
        f22813o = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
    }

    @Override // o.c.e
    public final void d() throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f22809k + 5;
            f22813o = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            p(new int[]{-837798208, -883371944, -677959011, 1813750081, -1463195994, 1098177337}, (KeyEvent.getMaxKeyCode() >> 16) + 12, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            q("\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{33, 45, 0, 2}, true, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f22813o + 77;
            f22809k = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f22823i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0019  */
    @Override // o.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(o.bx.d r11, o.j.b r12, o.bg.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dd.b.d(o.bx.d, o.j.b, o.bg.c):void");
    }

    public final o.az.a e() {
        int i2 = 2 % 2;
        int i3 = f22813o + 107;
        int i4 = i3 % 128;
        f22809k = i4;
        int i5 = i3 % 2;
        o.az.a aVar = this.f22818d;
        int i6 = i4 + 97;
        f22813o = i6 % 128;
        int i7 = i6 % 2;
        return aVar;
    }

    @Override // o.c.e
    public final void e(o.bg.c cVar) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f22809k + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f22813o = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            p(new int[]{-837798208, -883371944, -677959011, 1813750081, -1463195994, 1098177337}, 12 - Color.alpha(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p(new int[]{153161250, -1567463369, -861719389, -412330033, -1380986213, 1211129721, -1547570326, 1090087521, 1555809991, -1986299272, -437927519, 925523832, 434182491, -1189429611, -716604005, 328763637, -197278488, -1340915724, -1409727371, -610763784}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 38, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f22813o + 113;
            f22809k = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 4;
            }
        }
        c(false);
        this.f22815a.onJobEnd(cVar, this, new o.by.g());
        this.f22817c.quitSafely();
    }
}
