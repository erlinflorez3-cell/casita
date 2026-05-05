package o.ay;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.g;
import o.ab.j;
import o.bg.c;
import o.bg.e;
import o.cg.f;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends o.ab.a<d> {
    private static final byte[] $$m = null;
    private static final int $$n = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f20767f = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char f20768k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20769l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static char f20770m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20771n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char f20772o = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f20773r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f20774s = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    o.cs.d f20775g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    o.eq.b f20776j;

    /* JADX INFO: renamed from: o.ay.a$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f20777a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20778b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f20779d = 0;

        static {
            int[] iArr = new int[o.bg.a.values().length];
            f20778b = iArr;
            try {
                iArr[o.bg.a.as.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20778b[o.bg.a.av.ordinal()] = 2;
                int i2 = f20777a + 109;
                f20779d = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20778b[o.bg.a.aA.ordinal()] = 3;
                int i5 = f20777a;
                int i6 = ((i5 | 123) << 1) - (i5 ^ 123);
                f20779d = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20778b[o.bg.a.aB.ordinal()] = 4;
                int i8 = f20779d;
                int i9 = (((-1) - (((-1) - i8) & ((-1) - 91))) << 1) - (i8 ^ 91);
                f20777a = i9 % 128;
                int i10 = i9 % 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class b extends j<a> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20780b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20781c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20782d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static char f20783f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static char f20784g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static char f20785h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f20786i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static char f20787j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f20788k = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f20789o = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(short r8, int r9, int r10) {
            /*
                int r2 = r10 * 3
                int r1 = 1 - r2
                byte[] r7 = o.ay.a.b.$$a
                int r0 = r8 * 3
                int r6 = r0 + 69
                int r0 = r9 + 4
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r7 != 0) goto L29
                r2 = r0
                r1 = r4
            L15:
                int r6 = r6 + r0
                r0 = r2
            L17:
                int r2 = r0 + 1
                byte r0 = (byte) r6
                r5[r1] = r0
                if (r1 != r3) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L24:
                int r1 = r1 + 1
                r0 = r7[r2]
                goto L15
            L29:
                r1 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ay.a.b.$$d(short, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20786i = 171740225;
            f20781c = -653195489;
            f20782d = -1721948877;
            f20780b = -896613576;
            f20789o = 0;
            f20788k = 1;
            f20787j = (char) 36046;
            f20783f = (char) 27804;
            f20784g = (char) 30827;
            f20785h = (char) 17369;
        }

        b(a aVar) {
            super(aVar, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object b(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) throws Throwable {
            int i8 = ~i7;
            int i9 = ~i6;
            int i10 = ~((i8 + i9) - (i8 & i9));
            int i11 = ~i3;
            int i12 = (-1) - (((-1) - i10) & ((-1) - (~((-1) - (((-1) - i11) & ((-1) - i6))))));
            int i13 = ~((-1) - (((-1) - i9) & ((-1) - i11)));
            int i14 = ~((i6 + i8) - (i6 & i8));
            int i15 = ~(i7 | i3);
            int i16 = ((i14 + i13) - (i14 & i13)) | i15;
            int i17 = i15 | i12;
            int i18 = i7 + i3 + i5 + ((-1585779005) * i4) + (640148872 * i2);
            int i19 = i18 * i18;
            int i20 = (i7 * 308833806) + 153878528 + (308833806 * i3) + ((-448846874) * i12) + ((-224423437) * i16) + (224423437 * i17) + (84410368 * i5) + (1159200768 * i4) + ((-734003200) * i2) + (2089549824 * i19);
            int i21 = (i7 * (-1291220770)) + 263398195 + (i3 * (-1291220770)) + (i12 * (-1802)) + (i16 * (-901)) + (i17 * 901) + (i5 * (-1291221671)) + (i4 * (-1079815989)) + (i2 * 669414472) + (i19 * 145489920);
            if (i20 + (i21 * i21 * (-1699479552)) == 1) {
                b bVar = (b) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i22 = 2 % 2;
                int i23 = f20789o + 53;
                f20788k = i23 % 128;
                int i24 = i23 % 2;
                if (iIntValue == 3003) {
                    return o.bg.a.as;
                }
                if (iIntValue != 3004) {
                    return iIntValue != 5001 ? iIntValue != 5002 ? super.b(iIntValue) : o.bg.a.aB : o.bg.a.aA;
                }
                o.bg.a aVar = o.bg.a.av;
                int i25 = f20789o + 47;
                f20788k = i25 % 128;
                int i26 = i25 % 2;
                return aVar;
            }
            b bVar2 = (b) objArr[0];
            int i27 = 2 % 2;
            o.ef.a aVar2 = new o.ef.a();
            Object[] objArr2 = new Object[1];
            v("\ue9f7긆㙭詾뷜ྉ\ud992걜ỿ蓧ᖁ꺫㿵ᣴ嚝弹", 15 - ImageFormat.getBitsPerPixel(0), objArr2);
            aVar2.a(((String) objArr2[0]).intern(), (Object) ((a) bVar2.e()).f20776j.k());
            Object[] objArr3 = new Object[1];
            v("礧쳨缩糊監ڴ埆₍飭픵ⳋ䪍嚝弹", Process.getGidForName("") + 15, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = {((a) bVar2.e()).f20775g};
            o.cs.d.f22590b = o.cs.d.f22590b * 2033895861;
            o.cs.d.f22593e = o.cs.d.f22593e * 1121861622;
            int priority = Thread.currentThread().getPriority();
            o.cs.d.f22589a = (-121879155) * o.cs.d.f22589a;
            aVar2.a(strIntern, o.cs.d.b(r9, 1953396095, -1953396094, objArr4, priority, r14, r15));
            Object[] objArr5 = new Object[1];
            v("篲魫ﲳ훾恕\ufdd4暵坂ꩊ뿫\ue7c5졛\ud992걜舝쀙", TextUtils.indexOf("", "") + 16, objArr5);
            aVar2.a(((String) objArr5[0]).intern(), (Object) ((a) bVar2.e()).f20776j.q());
            int i28 = f20789o + 49;
            f20788k = i28 % 128;
            int i29 = i28 % 2;
            return aVar2;
        }

        static void init$0() {
            $$a = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
            $$b = 220;
        }

        private static void v(String str, int i2, Object[] objArr) throws Throwable {
            int i3;
            String str2 = str;
            int i4 = 2 % 2;
            Object charArray = str2;
            if (str2 != null) {
                charArray = str2.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            g gVar = new g();
            char[] cArr2 = new char[cArr.length];
            int i5 = 0;
            gVar.f19924d = 0;
            char[] cArr3 = new char[2];
            while (gVar.f19924d < cArr.length) {
                int i6 = $10 + 37;
                $11 = i6 % 128;
                int i7 = 58224;
                if (i6 % 2 == 0) {
                    cArr3[i5] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d];
                    i3 = 1;
                } else {
                    cArr3[i5] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d + 1];
                    i3 = i5;
                }
                while (i3 < 16) {
                    int i8 = $10 + 19;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[i5];
                    int i10 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) f20784g) ^ (-7511683281764982996L))));
                    int i11 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(f20785h);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i5] = Integer.valueOf(c2);
                        Object objA = o.d.d.a(1603517628);
                        if (objA == null) {
                            int i12 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 269;
                            char cRed = (char) Color.red(i5);
                            int iArgb = 11 - Color.argb(i5, i5, i5, i5);
                            byte b2 = (byte) i5;
                            byte b3 = (byte) (b2 - 1);
                            String str$$d = $$d(b2, b3, (byte) (b3 + 1));
                            Class[] clsArr = new Class[4];
                            clsArr[i5] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objA = o.d.d.a(i12, cRed, iArgb, -1995022631, false, str$$d, clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) f20787j) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f20783f)};
                        Object objA2 = o.d.d.a(1603517628);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 - 1);
                            objA2 = o.d.d.a(270 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 11 - ExpandableListView.getPackedPositionType(0L), -1995022631, false, $$d(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i7 -= 40503;
                        i3++;
                        i5 = 0;
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
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (-b6);
                    objA3 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 270, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), View.MeasureSpec.getSize(0) + 11, -2074123590, false, $$d(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i13 = $10 + 55;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                i5 = 0;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v("ᘎ柮\u0cdc\uf802譓\ud9eb퀊ㅥ舢᠒₌釻숗畨潑귞\udcf3⣍줒愬", TextUtils.indexOf("", "", 0, 0) + 19, objArr);
            o.cg.b bVar = new o.cg.b(context, 23, ((String) objArr[0]).intern());
            int i3 = f20788k + 41;
            f20789o = i3 % 128;
            if (i3 % 2 == 0) {
                return bVar;
            }
            throw null;
        }

        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws o.ef.b {
            int i2 = 2 % 2;
            int i3 = f20789o + 55;
            f20788k = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 31 / 0;
            }
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            Object[] objArr = {this, Integer.valueOf(i2)};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int iMyUid = Process.myUid();
            int i3 = f20786i * (-1358057586);
            f20786i = i3;
            return (o.bg.a) b((int) Runtime.getRuntime().freeMemory(), 1213285304, objArr, i3, iMyUid, elapsedCpuTime, -1213285303);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20788k + 59;
            f20789o = i3 % 128;
            int i4 = i3 % 2;
            ((a) e()).g().a(cVar);
            int i5 = f20788k + 75;
            f20789o = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20789o + 29;
            f20788k = i3 % 128;
            int i4 = i3 % 2;
            ((a) e()).g().e();
            int i5 = f20788k + 73;
            f20789o = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20789o + 95;
            int i4 = i3 % 128;
            f20788k = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 95;
            f20789o = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // o.ab.j
        public final o.ef.a m() throws o.ef.b {
            int i2 = f20780b * 1834907772;
            f20780b = i2;
            int i3 = f20782d * (-996491991);
            f20782d = i3;
            int iNextInt = new Random().nextInt();
            int i4 = f20781c * (-1075272752);
            f20781c = i4;
            return (o.ef.a) b(i4, -1345897048, new Object[]{this}, iNextInt, i3, i2, 1345897048);
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20789o + 69;
            f20788k = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                v("齄ｇ뫡ꗫ恕\ufdd4ꅚ氩귫쨢ۖ絣퀟퐎鹌鎑⫉镙ⳋ䪍⪪懇", 71 << Color.argb(0, 1, 0, 1), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                v("齄ｇ뫡ꗫ恕\ufdd4ꅚ氩귫쨢ۖ絣퀟퐎鹌鎑⫉镙ⳋ䪍⪪懇", 21 - Color.argb(0, 0, 0, 0), objArr2);
                obj = objArr2[0];
            }
            return ((String) obj).intern();
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20789o + 39;
            int i4 = i3 % 128;
            f20788k = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 41;
            f20789o = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void q() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20789o + 29;
            f20788k = i3 % 128;
            if (i3 % 2 != 0) {
                j().e().j().a(((a) e()).f20776j, ((a) e()).f20775g);
                j().e(h());
            } else {
                j().e().j().a(((a) e()).f20776j, ((a) e()).f20775g);
                j().e(h());
                int i4 = 9 / 0;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
        
            if (r0 != 4) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            r2 = j();
            r1 = h();
            r9 = new java.lang.Object[]{((o.ay.a) e()).f20776j};
            r7 = android.os.Process.myUid();
            r5 = java.lang.Thread.currentThread().getPriority();
            r3 = java.lang.Thread.activeCount();
            r4 = o.eq.b.f24699e * (-280241304);
            o.eq.b.f24699e = r4;
            r2.d(r1, (java.lang.String) o.eq.b.e(r3, r4, r5, -688819955, r7, 688819957, r9));
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
        
            if (r1 != 4) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
        
            super.s();
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00da A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void s() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ay.a.b.s():void");
        }
    }

    public interface d {
        void a(c cVar);

        void e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$o(short r6, short r7, int r8) {
        /*
            int r2 = r6 * 3
            int r1 = 1 - r2
            int r0 = r7 * 3
            int r0 = 72 - r0
            int r8 = r8 + 4
            byte[] r7 = o.ay.a.$$m
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2d
            r1 = r4
            r2 = r8
            r3 = r5
        L16:
            int r0 = -r1
            int r8 = r8 + r0
            r0 = r8
            r8 = r2
        L1a:
            int r2 = r8 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r3 != r4) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            int r3 = r3 + 1
            r1 = r7[r2]
            r8 = r0
            goto L16
        L2d:
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ay.a.$$o(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20774s = 0;
        f20773r = 1;
        f20769l = 0;
        f20771n = 1;
        k();
        Process.getThreadPriority(0);
        TextUtils.lastIndexOf("", '0');
        int i2 = f20773r + 69;
        f20774s = i2 % 128;
        int i3 = i2 % 2;
    }

    public a(Context context, d dVar, o.en.b bVar) {
        super(context, dVar, bVar, e.f21113k);
    }

    static /* synthetic */ void e(a aVar, o.eq.b bVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20769l + 33;
        f20771n = i3 % 128;
        int i4 = i3 % 2;
        aVar.e(bVar);
        if (i4 == 0) {
            int i5 = 44 / 0;
        }
    }

    static void init$0() {
        $$m = new byte[]{Utf8.REPLACEMENT_BYTE, -81, -107, -8};
        $$n = 228;
    }

    static void k() {
        f20767f = (char) 14283;
        f20772o = (char) 18800;
        f20770m = (char) 37336;
        f20768k = (char) 40665;
    }

    private b n() {
        int i2 = 2 % 2;
        b bVar = new b(this);
        int i3 = f20769l + 53;
        f20771n = i3 % 128;
        int i4 = i3 % 2;
        return bVar;
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i5 = $10 + 57;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i7 = $10 + 15;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i9 = 58224;
            int i10 = 0;
            while (i10 < 16) {
                int i11 = $10 + 115;
                $11 = i11 % 128;
                int i12 = i11 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i13 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) f20770m) ^ (-7511683281764982996L))));
                int i14 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f20768k);
                    objArr2[i3] = Integer.valueOf(i14);
                    objArr2[1] = Integer.valueOf(i13);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 270, (char) View.resolveSizeAndState(0, 0, 0), 12 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1995022631, false, $$o(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f20767f) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f20772o)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(View.MeasureSpec.getMode(0) + 270, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 11 - TextUtils.getOffsetAfter("", 0), -1995022631, false, $$o(b4, b5, (byte) (-b5)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    i3 = 2;
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
                byte b7 = b6;
                i3 = 2;
                objA3 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 271, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 11 - View.combineMeasuredStates(0, 0), -2074123590, false, $$o(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20769l + 63;
        f20771n = i3 % 128;
        if (i3 % 2 == 0) {
            n();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        b bVarN = n();
        int i4 = f20769l + 77;
        f20771n = i4 % 128;
        int i5 = i4 % 2;
        return bVarN;
    }

    public final void c(o.eq.b bVar, o.cs.d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20769l + 63;
        f20771n = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            q("ᒟ䧠鈎\ue1d9栺\ue7ac씻濓唒굇\ue20c挄髏魷悏慚\udb28\uf245팏캡秽ﲗ䟮얀煻댗\ue824ສ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            q("좄\ud9d4ᒟ䧠鈎\ue1d9栺\ue7ac씻濓唒굇\ue20c挄髏魷悏慚\udb28\uf245팏캡鏿֔Ε幤蝢\u1cfd―띤\udf67쐋┢ԓ\ue3e3䐓Ε幤㉿ꅦ킢ゟᎏ㰯걥袥您懪⾠吷팏캡㧙䮈┢ԓ侹ሗ", 56 - Process.getGidForName(""), objArr2);
            String strIntern2 = ((String) objArr2[0]).intern();
            String strK = bVar.k();
            int i4 = o.cs.d.f22590b * 2033895861;
            o.cs.d.f22590b = i4;
            int i5 = o.cs.d.f22593e * 1121861622;
            o.cs.d.f22593e = i5;
            int priority = Thread.currentThread().getPriority();
            int i6 = o.cs.d.f22589a * (-121879155);
            o.cs.d.f22589a = i6;
            o.ea.f.c(strIntern, String.format(strIntern2, strK, (String) o.cs.d.b(i6, 1953396095, -1953396094, new Object[]{dVar}, priority, i4, i5)));
            int i7 = f20769l + 121;
            f20771n = i7 % 128;
            int i8 = i7 % 2;
        }
        this.f20776j = bVar;
        this.f20775g = dVar;
        a();
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20769l + 33;
        f20771n = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        q("ᒟ䧠鈎\ue1d9栺\ue7ac씻濓唒굇\ue20c挄髏魷悏慚\udb28\uf245팏캡秽ﲗ䟮얀煻댗\ue824ສ", 28 - View.resolveSize(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20771n + 61;
        f20769l = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }
}
