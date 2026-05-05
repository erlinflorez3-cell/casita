package o.ap;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.AntelopErrorCode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import o.a.g;
import o.a.o;
import o.a.q;
import o.ap.b;
import o.es.a;
import o.es.c;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class a<T extends o.es.a> implements b<c, d> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f20401b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f20402c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f20403e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f20404g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f20405h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f20406i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f20407j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.ea.h f20408a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T f20409d;

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f20422a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f20423e = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o.ea.h f20424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f20425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f20426d;

        public c(String str, String str2, o.ea.h hVar) {
            this.f20425c = str;
            this.f20426d = str2;
            this.f20424b = hVar;
        }

        public final String a() {
            int i2 = 2 % 2;
            int i3 = f20422a;
            int i4 = (i3 ^ 19) + ((i3 & 19) << 1);
            int i5 = i4 % 128;
            f20423e = i5;
            int i6 = i4 % 2;
            String str = this.f20425c;
            int i7 = i5 + 93;
            f20422a = i7 % 128;
            int i8 = i7 % 2;
            return str;
        }

        public final o.ea.h c() {
            int i2 = 2 % 2;
            int i3 = f20422a;
            int i4 = ((i3 + 51) - (51 | i3)) + (51 | i3);
            f20423e = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                throw null;
            }
            o.ea.h hVar = this.f20424b;
            int i5 = i3 + 43;
            f20423e = i5 % 128;
            if (i5 % 2 != 0) {
                return hVar;
            }
            obj.hashCode();
            throw null;
        }

        public final String e() {
            int i2 = 2 % 2;
            int i3 = f20422a;
            int i4 = ((i3 + 89) - (89 | i3)) + ((-1) - (((-1) - i3) & ((-1) - 89)));
            f20423e = i4 % 128;
            int i5 = i4 % 2;
            String str = this.f20426d;
            int i6 = (i3 ^ 63) + ((i3 & 63) << 1);
            f20423e = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    public static final class d {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static char f20427a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static char f20428b = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static char f20429f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f20430g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static char f20431h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f20432i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f20433j = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f20434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f20435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f20436e;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(short r9, short r10, byte r11) {
            /*
                int r8 = r11 + 4
                int r7 = r9 * 2
                int r1 = r7 + 1
                int r0 = r10 * 3
                int r6 = r0 + 69
                byte[] r5 = o.ap.a.d.$$c
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r5 != 0) goto L29
                r0 = r8
                r2 = r3
            L13:
                int r6 = r6 + r0
                r1 = r2
            L15:
                int r8 = r8 + 1
                byte r0 = (byte) r6
                r4[r1] = r0
                int r2 = r1 + 1
                if (r1 != r7) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L24:
                r1 = r5[r8]
                r0 = r6
                r6 = r1
                goto L13
            L29:
                r1 = r3
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ap.a.d.$$g(short, short, byte):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f20432i = 822546422;
            init$0();
            f20433j = 0;
            f20430g = 1;
            f20428b = (char) 1863;
            f20427a = (char) 25545;
            f20429f = (char) 52250;
            f20431h = (char) 62059;
        }

        public d(byte[] bArr, String str, String str2) {
            this.f20434c = bArr;
            this.f20436e = str;
            this.f20435d = str2;
        }

        static void init$0() {
            $$a = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
            $$b = 87;
        }

        static void init$1() {
            $$d = new byte[]{39, 4, 32, -80};
            $$e = 142;
        }

        static void init$2() {
            $$c = new byte[]{46, -113, 33, 42};
            $$f = 58;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void k(byte r8, int r9, short r10, java.lang.Object[] r11) {
            /*
                byte[] r7 = o.ap.a.d.$$a
                int r6 = r10 * 4
                int r1 = r6 + 1
                int r0 = r8 * 2
                int r5 = 3 - r0
                int r4 = r9 + 97
                byte[] r3 = new byte[r1]
                r2 = 0
                if (r7 != 0) goto L29
                r0 = r6
                r1 = r2
            L13:
                int r0 = -r0
                int r4 = r4 + r0
            L15:
                byte r0 = (byte) r4
                r3[r1] = r0
                int r5 = r5 + 1
                if (r1 != r6) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                r11[r2] = r0
                return
            L24:
                int r1 = r1 + 1
                r0 = r7[r5]
                goto L13
            L29:
                r1 = r2
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ap.a.d.k(byte, int, short, java.lang.Object[]):void");
        }

        private static void l(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10 + 77;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 10 / 0;
                charArray = str2 != null ? str2.toCharArray() : str2;
            } else {
                if (str2 != null) {
                }
            }
            char[] cArr = (char[]) charArray;
            g gVar = new g();
            char[] cArr2 = new char[cArr.length];
            gVar.f19924d = 0;
            char[] cArr3 = new char[2];
            while (gVar.f19924d < cArr.length) {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
                int i6 = 58224;
                int i7 = 0;
                while (i7 < 16) {
                    char c2 = cArr3[1];
                    char c3 = cArr3[0];
                    try {
                        Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) f20429f) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f20431h)};
                        Object objA = o.d.d.a(1603517628);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(Color.argb(0, 0, 0, 0) + 270, (char) (ViewConfiguration.getTapTimeout() >> 16), 11 - View.resolveSizeAndState(0, 0, 0), -1995022631, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) f20428b) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f20427a)};
                        Object objA2 = o.d.d.a(1603517628);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(270 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, -1995022631, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        int i8 = $11 + 71;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[gVar.f19924d] = cArr3[0];
                cArr2[gVar.f19924d + 1] = cArr3[1];
                Object[] objArr4 = {gVar, gVar};
                Object objA3 = o.d.d.a(1390051551);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a(269 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 10 - ExpandableListView.getPackedPositionChild(0L), -2074123590, false, $$g(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void m(int r8, short r9, int r10, java.lang.Object[] r11) {
            /*
                byte[] r7 = o.ap.a.d.$$d
                int r6 = r8 + 4
                int r2 = r9 * 3
                int r1 = 1 - r2
                int r0 = r10 * 3
                int r5 = 99 - r0
                byte[] r4 = new byte[r1]
                r3 = 0
                int r2 = 0 - r2
                if (r7 != 0) goto L2b
                r0 = r5
                r1 = r3
                r5 = r2
            L16:
                int r5 = r5 + r0
            L17:
                byte r0 = (byte) r5
                r4[r1] = r0
                if (r1 != r2) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r11[r3] = r0
                return
            L24:
                int r6 = r6 + 1
                int r1 = r1 + 1
                r0 = r7[r6]
                goto L16
            L2b:
                r1 = r3
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ap.a.d.m(int, short, int, java.lang.Object[]):void");
        }

        public final byte[] b() {
            int i2 = 2 % 2;
            int i3 = f20433j + 105;
            int i4 = i3 % 128;
            f20430g = i4;
            int i5 = i3 % 2;
            byte[] bArr = this.f20434c;
            int i6 = i4 + 49;
            f20433j = i6 % 128;
            if (i6 % 2 == 0) {
                return bArr;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x01eb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String d() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ap.a.d.d():java.lang.String");
        }

        public final String e() {
            int i2 = 2 % 2;
            int i3 = f20430g;
            int i4 = i3 + 45;
            f20433j = i4 % 128;
            int i5 = i4 % 2;
            String str = this.f20436e;
            int i6 = i3 + 59;
            f20433j = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    private static String $$c(short s2, int i2, byte b2) {
        byte[] bArr = $$a;
        int i3 = (i2 * 2) + 4;
        int i4 = 105 - s2;
        int i5 = b2 * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            int i8 = -i3;
            i3++;
            i4 = i6 + i8;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i3++;
            i4 += -bArr[i3];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20406i = 0;
        f20407j = 1;
        f20404g = 0;
        f20405h = 1;
        a();
        TextUtils.getOffsetBefore("", 0);
        int i2 = f20407j + 87;
        f20406i = i2 % 128;
        int i3 = i2 % 2;
    }

    public a(T t2, o.ea.h hVar) {
        this.f20409d = t2;
        this.f20408a = hVar;
    }

    static void a() {
        f20401b = -6801245964182002005L;
        f20403e = new char[]{38069, 37311, 40633, 39859, 32950, 36285, 35489, 47020, 48291, 47545, 38037, 37279, 40601, 39827, 32918, 36253, 35502, 47005, 48283, 47524, 42627, 41874, 43139, 54667, 53899, 57275, 50355, 49596, 52922, 52145, 61614, 64913, 64186};
        f20402c = 7579785769241448944L;
    }

    private static d b(o.ef.a aVar) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f20405h + 105;
            f20404g = i3 % 128;
            int i4 = i3 % 2;
            String strOd = C1561oA.od("䞦箯徬鏁韘谖꿭ꏩꠘ\udc19뼢\ueb31\uef35", (short) (C1633zX.Xd() ^ (-30171)));
            short sXd = (short) (C1633zX.Xd() ^ (-7631));
            int[] iArr = new int["林ᷫﭧ냫㹴ᯩ텔廩㑱\uf1d2罧哏ቝ鿔畢㋕졉闡卑\ue8d7뙜珓ल".length()];
            QB qb = new QB("林ᷫﭧ냫㹴ᯩ텔廩㑱\uf1d2罧哏ቝ鿔畢㋕졉闡卑\ue8d7뙜珓ल");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i5));
                i5++;
            }
            String str = new String(iArr, 0, i5);
            if (i4 != 0) {
                Object[] objArr = new Object[1];
                f(str, 19735 >> (ViewConfiguration.getTouchSlop() / 18), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f(strOd, 62476 >>> (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                f(str, 19069 - (ViewConfiguration.getTouchSlop() >> 8), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                f(strOd, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 62476, objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        Object[] objArr5 = new Object[1];
        f(Wg.Zd("⻍咢矷ꑄ삎\ue468ᣐߗ\uf14fᴊ䩴淠", (short) (C1633zX.Xd() ^ (-22659)), (short) (C1633zX.Xd() ^ (-11653))), (Process.myPid() >> 22) + 41507, objArr5);
        Object[] objArr6 = {aVar, ((String) objArr5[0]).intern()};
        int i6 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i6;
        String str2 = (String) o.ef.a.a(-781664457, objArr6, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i6, Thread.currentThread().getPriority());
        Class<?> cls = Class.forName(C1561oA.Xd("IWN][VR\u001dee[_\"7Wj]/.", (short) (FB.Xd() ^ 16571)));
        Class<?>[] clsArr = new Class[2];
        short sXd2 = (short) (C1633zX.Xd() ^ (-12930));
        int[] iArr2 = new int["\u0007~\u0011|N\u000e\u007f\u000e{Ce\b\u000b\u0003\u0005~".length()];
        QB qb2 = new QB("\u0007~\u0011|N\u000e\u007f\u000e{Ce\b\u000b\u0003\u0005~");
        int i7 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i7] = xuXd2.fK((sXd2 ^ i7) + xuXd2.CK(iKK2));
            i7++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i7));
        clsArr[1] = Integer.TYPE;
        Object[] objArr7 = {str2, 10};
        short sXd3 = (short) (ZN.Xd() ^ 5261);
        short sXd4 = (short) (ZN.Xd() ^ 15071);
        int[] iArr3 = new int["IIFQEE".length()];
        QB qb3 = new QB("IIFQEE");
        int i8 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i8] = xuXd3.fK(((sXd3 + i8) + xuXd3.CK(iKK3)) - sXd4);
            i8++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i8), clsArr);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr7);
            Object[] objArr8 = new Object[1];
            f(hg.Vd("㊦ʭ禶\ued4eꃓ㱨ꠋ授케膺ᴬ裋䑋꿿䭨\uf705橶☆邩Ⱒ", (short) (C1499aX.Xd() ^ (-17573)), (short) (C1499aX.Xd() ^ (-29238))), 27791 - TextUtils.indexOf("", "", 0), objArr8);
            Object[] objArr9 = {aVar, ((String) objArr8[0]).intern()};
            int i9 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i9;
            String str3 = (String) o.ef.a.a(-781664457, objArr9, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i9, Thread.currentThread().getPriority());
            Object[] objArr10 = new Object[1];
            f(C1561oA.ud("⍸噴㦐沔瞕媦跥邶箲꺿뇐ꓠ웮짭봕\ue019\ueb20\ude0dम\uf433＾⩑", (short) (ZN.Xd() ^ 30459)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 62730, objArr10);
            Object[] objArr11 = {aVar, ((String) objArr10[0]).intern()};
            int i10 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i10;
            d dVar = new d(bArr, str3, (String) o.ef.a.a(-781664457, objArr11, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i10, Thread.currentThread().getPriority()));
            int i11 = f20405h + 113;
            f20404g = i11 % 128;
            int i12 = i11 % 2;
            return dVar;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 63;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i6 = $11 + 77;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 730, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7932), 11 - KeyEvent.normalizeMetaState(0), 355847088, false, $$c((byte) 34, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() - ((-1) - (((-1) - f20401b) | ((-1) - 4743694005979712847L)));
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 836, (char) (27279 - KeyEvent.getDeadChar(0, 0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10, -2145994442, false, $$c((byte) 27, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = qVar.f19948a;
                Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA3 = o.d.d.a(-1011865131);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 732, (char) (7933 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, 355847088, false, $$c((byte) 34, b4, b4), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i8] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f20401b ^ 4743694005979712847L);
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = o.d.d.a(1452497747);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    objA4 = o.d.d.a(836 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 27279), TextUtils.getOffsetBefore("", 0) + 11, -2145994442, false, $$c((byte) 27, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i9 = $11 + 113;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr6 = {qVar, qVar};
                Object objA5 = o.d.d.a(1452497747);
                if (objA5 == null) {
                    byte b6 = (byte) 0;
                    objA5 = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 835, (char) (27279 - Color.red(0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, -2145994442, false, $$c((byte) 27, b6, b6), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objA5).invoke(null, objArr6);
                obj.hashCode();
                throw null;
            }
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr7 = {qVar, qVar};
            Object objA6 = o.d.d.a(1452497747);
            if (objA6 == null) {
                byte b7 = (byte) 0;
                objA6 = o.d.d.a(836 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27279), TextUtils.indexOf("", "", 0) + 11, -2145994442, false, $$c((byte) 27, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA6).invoke(null, objArr7);
        }
        String str3 = new String(cArr2);
        int i10 = $10 + 91;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str3;
    }

    static void init$0() {
        $$a = new byte[]{8, -110, 120, 122};
        $$b = 67;
    }

    private static void k(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $11 + 69;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f20403e[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(742 - View.combineMeasuredStates(0, 0), (char) View.MeasureSpec.getSize(0), 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 632508977, false, $$c((byte) 6, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f20402c), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 5;
                    byte b4 = (byte) (b3 - 5);
                    objA2 = o.d.d.a(KeyEvent.normalizeMetaState(0) + 766, (char) (12470 - Drawable.resolveOpacity(0, 0)), 12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1946853218, false, $$c(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA3 = o.d.d.a(((byte) KeyEvent.getModifierMetaStateMask()) + 388, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 18, 39570797, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $10 + 113;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objA4 = o.d.d.a(386 - ExpandableListView.getPackedPositionChild(0L), (char) Gravity.getAbsoluteGravity(0, 0), Gravity.getAbsoluteGravity(0, 0) + 18, 39570797, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    @Override // o.ap.b
    public final /* synthetic */ d a(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20405h + 67;
        f20404g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            b(aVar);
            throw null;
        }
        d dVarB = b(aVar);
        int i4 = f20404g + 85;
        f20405h = i4 % 128;
        if (i4 % 2 != 0) {
            return dVarB;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.ap.b
    public final void e(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            f("殣⇶ｱ듴䉼\u1ff0핚拮㡵\uf5d5荩壐ᙝꏓ祠㛒책駜坋\uecd0메矊ന", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19068, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f("殅䟩㍒\uee8d\uda25떘懧嵞ࣟ\ue421ힺ茆罼⫐", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11369, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final AtomicReference atomicReference3 = new AtomicReference();
        this.f20409d.e(new c.a<String>() { // from class: o.ap.a.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f20416a = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f20417g = 1;

            private void b(String str) {
                int i3 = 2 % 2;
                int i4 = f20417g;
                int i5 = ((99 | i4) << 1) - (i4 ^ 99);
                f20416a = i5 % 128;
                int i6 = i5 % 2;
                atomicReference2.set(str);
                countDownLatch.countDown();
                int i7 = f20417g + 15;
                f20416a = i7 % 128;
                int i8 = i7 % 2;
            }

            @Override // o.es.c.a
            public final /* synthetic */ void a(String str) {
                int i3 = 2 % 2;
                int i4 = f20416a;
                int i5 = (i4 ^ 111) + (((-1) - (((-1) - i4) | ((-1) - 111))) << 1);
                f20417g = i5 % 128;
                int i6 = i5 % 2;
                b(str);
                int i7 = f20417g;
                int i8 = (i7 ^ 27) + (((-1) - (((-1) - i7) | ((-1) - 27))) << 1);
                f20416a = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 62 / 0;
                }
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) {
                int i3 = 2 % 2;
                int i4 = f20417g + 3;
                f20416a = i4 % 128;
                if (i4 % 2 != 0) {
                    atomicReference.set(cVar);
                    countDownLatch.countDown();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                atomicReference.set(cVar);
                countDownLatch.countDown();
                int i5 = f20416a;
                int i6 = (((i5 + 19) - (19 & i5)) << 1) - (i5 ^ 19);
                f20417g = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        this.f20409d.a(new c.a<String>() { // from class: o.ap.a.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f20410a = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f20411g = 1;

            /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
            private void a2(String str) {
                int i3 = 2 % 2;
                int i4 = f20410a;
                int i5 = (i4 & 113) + ((i4 + 113) - (i4 & 113));
                f20411g = i5 % 128;
                int i6 = i5 % 2;
                atomicReference3.set(str);
                countDownLatch.countDown();
                int i7 = f20411g + 13;
                f20410a = i7 % 128;
                int i8 = i7 % 2;
            }

            @Override // o.es.c.a
            public final /* synthetic */ void a(String str) {
                int i3 = 2 % 2;
                int i4 = f20411g + 77;
                f20410a = i4 % 128;
                int i5 = i4 % 2;
                a2(str);
                if (i5 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) {
                int i3 = 2 % 2;
                int i4 = f20410a;
                int i5 = ((-1) - (((-1) - i4) | ((-1) - PanasonicMakernoteDirectory.TAG_BURST_SPEED))) + ((-1) - (((-1) - i4) & ((-1) - PanasonicMakernoteDirectory.TAG_BURST_SPEED)));
                f20411g = i5 % 128;
                Object obj = null;
                if (i5 % 2 == 0) {
                    atomicReference.set(cVar);
                    countDownLatch.countDown();
                    obj.hashCode();
                    throw null;
                }
                atomicReference.set(cVar);
                countDownLatch.countDown();
                int i6 = f20411g + 1;
                f20410a = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        try {
            countDownLatch.await();
            String str = (String) atomicReference2.get();
            String str2 = (String) atomicReference3.get();
            if (atomicReference.get() != null) {
                throw new b.e((o.by.c) atomicReference.get());
            }
            if (str != null) {
                int i3 = f20405h + 69;
                f20404g = i3 % 128;
                int i4 = i3 % 2;
                if (str2 != null) {
                    c cVar = new c(str, str2, this.f20408a);
                    Object[] objArr3 = new Object[1];
                    f("殓ፘ騲ğ裵㟁뺞▖굼呄", Color.alpha(0) + 30941, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    k((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 10 - Color.argb(0, 0, 0, 0), objArr4);
                    aVar.a(strIntern2, (Object) ((String) objArr4[0]).intern());
                    Object[] objArr5 = new Object[1];
                    k((char) View.MeasureSpec.makeMeasureSpec(0, 0), 9 - Process.getGidForName(""), TextUtils.indexOf((CharSequence) "", '0') + 24, objArr5);
                    aVar.a(((String) objArr5[0]).intern(), (Object) cVar.a());
                    Object[] objArr6 = new Object[1];
                    f("殃ᓐ锽ᖒ雤ᝆ鞖ჸ酅ᆔ鈆፤鏅ᰕ鵪᷵鸱ẙ鿫ᡆ额᧚驒", (ViewConfiguration.getTapTimeout() >> 16) + 32603, objArr6);
                    aVar.a(((String) objArr6[0]).intern(), (Object) cVar.e());
                    if (cVar.c() != null) {
                        int i5 = f20404g + 61;
                        f20405h = i5 % 128;
                        int i6 = i5 % 2;
                        Object[] objArr7 = new Object[1];
                        f("殆熎徎▁\u0381\ue985\uf791\uddb0뮘膛澈疠厳㦰", 6659 - ExpandableListView.getPackedPositionGroup(0L), objArr7);
                        aVar.a(((String) objArr7[0]).intern(), o.ap.d.e(cVar.c()));
                        return;
                    }
                    return;
                }
            }
            throw new b.e(new o.by.c(AntelopErrorCode.InternalError));
        } catch (InterruptedException unused) {
            throw new b.e(new o.by.c(AntelopErrorCode.InternalError));
        }
    }
}
