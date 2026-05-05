package o.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.base.Ascii;
import fr.antelop.sdk.WalletLockReason;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.a.k;
import o.bh.a;
import o.bj.e;
import o.bm.a;
import o.c.a;
import o.ea.f;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    static final Object f21916a;

    /* JADX INFO: renamed from: c */
    static final List<b> f21917c;

    /* JADX INFO: renamed from: e */
    static boolean f21918e = false;

    /* JADX INFO: renamed from: f */
    public static int f21919f = 0;

    /* JADX INFO: renamed from: g */
    public static int f21920g = 0;

    /* JADX INFO: renamed from: h */
    public static int f21921h = 0;

    /* JADX INFO: renamed from: i */
    public static int f21922i = 0;

    /* JADX INFO: renamed from: j */
    public static int f21923j = 0;

    /* JADX INFO: renamed from: k */
    public static int f21924k = 0;

    /* JADX INFO: renamed from: l */
    private static boolean f21925l = false;

    /* JADX INFO: renamed from: m */
    private static boolean f21926m = false;

    /* JADX INFO: renamed from: n */
    public static int f21927n = 0;

    /* JADX INFO: renamed from: o */
    public static int f21928o = 0;

    /* JADX INFO: renamed from: p */
    private static final List<b> f21929p;

    /* JADX INFO: renamed from: q */
    private static int f21930q = 0;

    /* JADX INFO: renamed from: r */
    private static long f21931r = 0;

    /* JADX INFO: renamed from: s */
    private static char[] f21932s = null;

    /* JADX INFO: renamed from: t */
    private static int f21933t = 0;

    /* JADX INFO: renamed from: v */
    private static int f21934v = 0;

    /* JADX INFO: renamed from: w */
    private static int f21935w = 0;

    /* JADX INFO: renamed from: b */
    o.bh.a f21936b;

    /* JADX INFO: renamed from: d */
    final o.en.b f21937d;

    /* JADX INFO: renamed from: o.c.a$1 */
    final class AnonymousClass1 implements a.InterfaceC0341a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        public static int f21938a = 0;

        /* JADX INFO: renamed from: b */
        public static int f21939b = 0;

        /* JADX INFO: renamed from: c */
        public static int f21940c = 0;

        /* JADX INFO: renamed from: d */
        public static int f21941d = 0;

        /* JADX INFO: renamed from: e */
        public static int f21942e = 0;

        /* JADX INFO: renamed from: f */
        public static int f21943f = 0;

        /* JADX INFO: renamed from: k */
        private static char[] f21944k = null;

        /* JADX INFO: renamed from: l */
        private static char[] f21945l = null;

        /* JADX INFO: renamed from: m */
        private static int f21946m = 0;

        /* JADX INFO: renamed from: n */
        private static long f21947n = 0;

        /* JADX INFO: renamed from: o */
        private static char f21948o = 0;

        /* JADX INFO: renamed from: p */
        public static int f21949p = 0;

        /* JADX INFO: renamed from: r */
        private static int f21950r = 0;

        /* JADX INFO: renamed from: g */
        private /* synthetic */ Context f21951g;

        /* JADX INFO: renamed from: i */
        private /* synthetic */ e f21953i;

        /* JADX INFO: renamed from: j */
        private /* synthetic */ Handler f21954j;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0012). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(int r10, int r11, int r12) {
            /*
                byte[] r9 = o.c.a.AnonymousClass1.$$c
                int r0 = 111 - r11
                int r1 = r10 * 2
                int r8 = 1 - r1
                int r7 = r12 + 4
                byte[] r6 = new byte[r8]
                r5 = 0
                if (r9 != 0) goto L29
                r1 = r8
                r2 = r7
                r4 = r5
            L12:
                int r7 = r7 + r1
                r3 = r4
                r0 = r7
                r7 = r2
            L16:
                int r2 = r7 + 1
                byte r1 = (byte) r0
                int r4 = r3 + 1
                r6[r3] = r1
                if (r4 != r8) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L25:
                r1 = r9[r2]
                r7 = r0
                goto L12
            L29:
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.c.a.AnonymousClass1.$$g(int, int, int):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f21949p = 23309930;
            init$0();
            f21943f = 908419842;
            f21940c = 1731162069;
            f21941d = 829600819;
            f21939b = 422432681;
            f21942e = -1785727779;
            f21938a = 1819112539;
            f21946m = 0;
            f21950r = 1;
            f21945l = new char[]{38067, 55880, 2350, 30955, 45006, 7865, 19578, 45929, 57907, 20970, 32982, 63371, 9590, 38011, 56075, 2800, 31187, 43137, 7807, 19772, 38067, 55877, 2350, 30951, 45012, 7863, 19582, 45911, 57917, 20968, 33017, 63375, 9582, 37978, 56072, 2815, 31185, 43149, 7738, 19811, 48194, 58361, 21156, 33215, 63345, 9778, 38163, 50392, 2979, 31362, 43075, 7985, 19996, 48613, 60584, 21099, 33094, 61491, 10212, 38602, 50619, 2919, 31318, 43293, 6352, 20435, 48795, 60523, 21339, 33300, 61951, 8362, 38862, 50486, 13368, 31515, 43747, 6579, 18579, 48732, 60711, 23570, 33674, 62124, 8599, 38727, 50729, 13793, 25804, 44022, 6448, 18462, 45641, 64703, 12244, 24093, 35118, 14413, 27268, 38317, 50375, 30482, 42499, 53621, 916, 45728, 65010, 11269, 24363, 36471, 14528, 27545, 39608, 50435, 29790, 42821, 53643, 200, 46057, 57890, 11609, 23672, 36537, 14795, 26854, 39706, 51777, 29853, 42932, 55001, 258, 45089, 58120, 11729, 23776, 36849, 15882, 26942, 39039, 51862, 30184, 42150, 55104, 38067, 55877, 2350, 30951, 45012, 7863, 19582, 45911, 57917, 20968, 33017, 63375, 9582, 37978, 56072, 2815, 31185, 43149, 7738, 19811, 48194, 58361, 21156, 33215, 63345, 9778, 38163, 50392, 2979, 31362, 43075, 7985, 19996, 48613, 60597, 21091, 33106, 61498, 10223, 38602, 50615, 2914, 38039, 55882, 2363, 30974, 45009, 7859, 19566, 45932, 57911, 20967, 32982, 63386, 9579, 37979, 56079, 38035, 55880, 2366, 30972, 45005, 7871, 19566, 45840, 57907, 20982, 32970, 63424, 9539, 37973, 56094, 2807, 31172, 43151, 7790, 19767, 48182, 58366, 21176, 33179, 63347, 9762, 52500, 33750, 20653, 8569, 63042, 18237, 5627, 60154, 48039, 2163, 55635, 44546, 31972, 52690, 33435, 21362, 8280, 61709, 56048, 37929, 18260, 13963, 57789, 20692, 533, 64812, 44145, 8076, 52898, 47597, 27434, 55858, 38245, 17552, 38083, 55828, 2422, 30905, 44942, 7918, 19494, 45836, 57953, 20906, 32907, 63446, 9518, 21767, 7153, 51354, 47443, 28256, 57091, 36298, 29411, 9097, 36956, 16717, 13883, 58586, 21998, 6844, 52043, 47205, 26937, 57230, 36055, 32246, 8781, 37648, 16389, 14024, 59294, 21671, 1396, 51731, 47875, 27133, 56990, 36783, 31844, 11535, 37838, 16639, 12685, 58960, 22341, 1032, 51957, 48097, 26803, 55640, 36453, 38045, 55880, 2318, 30945, 45001, 7859, 19556, 45932, 57911, 20960, 32968, 63371, 9585, 37982, 56138, 2739, 31122, 43156, 7807, 19752, 48142, 58355, 21161, 33162, 63302, 9769, 38161, 50379, 2988, 31395, 43098, 7994, 19987, 48594, 60607};
            f21947n = 3937219321125414L;
            f21944k = new char[]{51641, 64604, 64590, 64614, 64520, 64586, 64576, 64523, 64595, 64583, 64630, 64588, 51646, 64578, 64579, 64543, 51642, 64591, 51643, 64517, 64612, 51645, 64593, 64610, 51644, 64582, 64598, 64597, 64580, 64599, 64577, 64584, 64626, 64587, 64618, 64585};
            f21948o = (char) 51641;
        }

        AnonymousClass1(e eVar, Handler handler, Context context) {
            this.f21953i = eVar;
            this.f21954j = handler;
            this.f21951g = context;
        }

        public static /* synthetic */ void a(e eVar) {
            int i2 = 2 % 2;
            int i3 = f21950r + 31;
            f21946m = i3 % 128;
            int i4 = i3 % 2;
            eVar.d();
            int i5 = f21950r + 31;
            f21946m = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
            }
        }

        public /* synthetic */ void a(e eVar, o.bg.c cVar, o.by.g gVar) {
            int i2 = 2 % 2;
            int i3 = f21946m + 13;
            f21950r = i3 % 128;
            int i4 = i3 % 2;
            eVar.a(a.this.f21937d, cVar, gVar);
            if (i4 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ void a(e eVar, o.bx.d dVar, o.j.b bVar, o.bg.c cVar) {
            Object[] objArr = {eVar, dVar, bVar, cVar};
            int i2 = f21938a * (-1539508620);
            f21938a = i2;
            int i3 = f21942e * 1719539165;
            f21942e = i3;
            int i4 = f21939b * (-500953705);
            f21939b = i4;
            int i5 = f21941d * (-1567483664);
            f21941d = i5;
            e(i5, 1564200943, i2, i3, -1564200943, objArr, i4);
        }

        public static /* synthetic */ void b(e eVar) {
            int i2 = 2 % 2;
            int i3 = f21950r + 39;
            f21946m = i3 % 128;
            int i4 = i3 % 2;
            eVar.b();
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f21950r + 37;
            f21946m = i5 % 128;
            int i6 = i5 % 2;
        }

        public static /* synthetic */ void b(e eVar, o.bx.d dVar, o.j.b bVar, o.bg.c cVar) {
            Object[] objArr = {eVar, dVar, bVar, cVar};
            e((int) Runtime.getRuntime().totalMemory(), 1732297012, (int) Process.getElapsedCpuTime(), Process.myPid(), -1732297010, objArr, Thread.currentThread().getPriority());
        }

        private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
            ArrayList<b> arrayList;
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) objArr[0];
            final o.bg.c cVar = (o.bg.c) objArr[1];
            synchronized (a.f21916a) {
                if (f.a()) {
                    Object[] objArr2 = new Object[1];
                    q((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19, objArr2);
                    String strIntern = ((String) objArr2[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr3 = new Object[1];
                    q((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 9979), Drawable.resolveOpacity(0, 0) + 92, 50 - TextUtils.lastIndexOf("", '0'), objArr3);
                    f.d(strIntern, sb.append(((String) objArr3[0]).intern()).append(cVar.c()).toString());
                }
                a.f21918e = false;
                a.this.f21936b = null;
                arrayList = new ArrayList(a.f21917c);
                a.f21917c.clear();
                a aVar = a.this;
                a.e();
            }
            for (b bVar : arrayList) {
                final e eVarF = bVar.f21968e.f();
                if (eVarF != null) {
                    Object[] objArr4 = {bVar.f21968e};
                    int i2 = 1488862647 * g.f21999c;
                    g.f21999c = i2;
                    int priority = Thread.currentThread().getPriority();
                    int iNextInt = new Random().nextInt();
                    int i3 = (-1873876582) * g.f21998b;
                    g.f21998b = i3;
                    Handler handler = (Handler) g.d(i2, objArr4, i3, iNextInt, -367277091, priority, 367277092);
                    Runnable runnable = new Runnable() { // from class: o.c.a$1$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.AnonymousClass1.c(eVarF, cVar);
                        }
                    };
                    Class<?> cls = Class.forName(C1626yg.Ud(" yC\u000ek\u0010YF>/I^@\"gh\u0002J", (short) (Od.Xd() ^ (-14355)), (short) (Od.Xd() ^ (-6870))));
                    Class<?>[] clsArr = new Class[1];
                    short sXd = (short) (Od.Xd() ^ (-723));
                    int[] iArr = new int["7ej/\"4Ga|_\nKxz\u00121mp".length()];
                    QB qb = new QB("7ej/\"4Ga|_\nKxz\u00121mp");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd + i4)));
                        i4++;
                    }
                    clsArr[0] = Class.forName(new String(iArr, 0, i4));
                    Object[] objArr5 = {runnable};
                    Method method = cls.getMethod(EO.Od("<p\u00197", (short) (OY.Xd() ^ 2939)), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr5);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
            final e eVar = anonymousClass1.f21953i;
            if (eVar != null) {
                Handler handler2 = anonymousClass1.f21954j;
                Object[] objArr6 = {new Runnable() { // from class: o.c.a$1$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.AnonymousClass1.d(eVar, cVar);
                    }
                }};
                Method method2 = Class.forName(C1561oA.Qd("\u0015!\u0016#\u001f\u0018\u0012Z\u001b\u001eWp\t\u0015\n\u0011\t\u0015", (short) (C1580rY.Xd() ^ (-8138)))).getMethod(C1561oA.od("\u000e\f\u000f\u000f", (short) (C1607wl.Xd() ^ 9368)), Class.forName(C1593ug.zd("ZRhT\"aWe_'Lpjk_alf", (short) (C1633zX.Xd() ^ (-22056)), (short) (C1633zX.Xd() ^ (-27375)))));
                try {
                    method2.setAccessible(true);
                    method2.invoke(handler2, objArr6);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            return null;
        }

        public static /* synthetic */ void c(e eVar) {
            int i2 = 2 % 2;
            int i3 = f21950r + 105;
            f21946m = i3 % 128;
            int i4 = i3 % 2;
            eVar.d();
            int i5 = f21946m + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f21950r = i5 % 128;
            int i6 = i5 % 2;
        }

        public static /* synthetic */ void c(e eVar, o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f21950r + 115;
            f21946m = i3 % 128;
            int i4 = i3 % 2;
            eVar.e(cVar);
            int i5 = f21950r + 59;
            f21946m = i5 % 128;
            int i6 = i5 % 2;
        }

        public /* synthetic */ void c(e eVar, o.bg.c cVar, o.by.g gVar) {
            int i2 = 2 % 2;
            int i3 = f21946m + 81;
            f21950r = i3 % 128;
            int i4 = i3 % 2;
            eVar.a(a.this.f21937d, cVar, gVar);
            int i5 = f21946m + 61;
            f21950r = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        private static /* synthetic */ Object d(Object[] objArr) {
            e eVar = (e) objArr[0];
            o.bx.d dVar = (o.bx.d) objArr[1];
            o.j.b bVar = (o.j.b) objArr[2];
            o.bg.c cVar = (o.bg.c) objArr[3];
            int i2 = 2 % 2;
            int i3 = f21950r + 81;
            f21946m = i3 % 128;
            int i4 = i3 % 2;
            eVar.d(dVar, bVar, cVar);
            int i5 = f21950r + 99;
            f21946m = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
            return null;
        }

        public static /* synthetic */ void d(Context context) throws Throwable {
            int i2 = 2 % 2;
            try {
                new o.bo.e();
                o.bo.e.d(context);
                int i3 = f21946m + 105;
                f21950r = i3 % 128;
                int i4 = i3 % 2;
            } catch (o.bo.f e2) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    q((char) TextUtils.indexOf("", "", 0, 0), ViewConfiguration.getScrollDefaultDelay() >> 16, TextUtils.indexOf("", "", 0, 0) + 20, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    q((char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.indexOf("", "", 0, 0) + ExifDirectoryBase.TAG_PRIMARY_CHROMATICITIES, 35 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
                    f.e(strIntern, ((String) objArr2[0]).intern(), e2);
                    int i5 = f21946m + 77;
                    f21950r = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        }

        public static /* synthetic */ void d(e eVar, o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f21946m + 81;
            f21950r = i3 % 128;
            int i4 = i3 % 2;
            eVar.e(cVar);
            int i5 = f21950r + 65;
            f21946m = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
            int i8 = ~i3;
            int i9 = ~i6;
            int i10 = ~i4;
            int i11 = (-1) - (((-1) - (~((i9 + i10) - (i9 & i10)))) & ((-1) - i8));
            int i12 = ~(i4 | i6);
            int i13 = i11 | i12;
            int i14 = (-1) - (((-1) - ((-1) - (((-1) - (~((-1) - (((-1) - i8) & ((-1) - i6))))) & ((-1) - (~((-1) - (((-1) - i8) & ((-1) - i10)))))))) & ((-1) - (~(i10 | i6))));
            int i15 = i6 + i3 + i5 + (669352129 * i7) + (266941808 * i2);
            int i16 = i15 * i15;
            int i17 = (720661947 * i6) + 1572077568 + ((-1243901369) * i3) + (1165201990 * i13) + (i12 * (-1165201990)) + ((-1165201990) * i14) + (1885863936 * i5) + ((-1100480512) * i7) + ((-1249902592) * i2) + ((-491520000) * i16);
            int i18 = (i6 * 1617402437) + 56426783 + (i3 * 1617401273) + (i13 * (-582)) + (i12 * IptcDirectory.TAG_PROGRAM_VERSION) + (i14 * IptcDirectory.TAG_PROGRAM_VERSION) + (i5 * 1617401855) + (i7 * 1244927807) + (i2 * (-404665712)) + (i16 * (-45350912));
            int i19 = i17 + (i18 * i18 * 1565261824);
            return i19 != 1 ? i19 != 2 ? e(objArr) : d(objArr) : c(objArr);
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            e eVar = (e) objArr[0];
            o.bx.d dVar = (o.bx.d) objArr[1];
            o.j.b bVar = (o.j.b) objArr[2];
            o.bg.c cVar = (o.bg.c) objArr[3];
            int i2 = 2 % 2;
            int i3 = f21950r + 43;
            f21946m = i3 % 128;
            int i4 = i3 % 2;
            eVar.d(dVar, bVar, cVar);
            if (i4 == 0) {
                return null;
            }
            int i5 = 0 / 0;
            return null;
        }

        public static /* synthetic */ void e(e eVar) {
            int i2 = 2 % 2;
            int i3 = f21946m + 103;
            f21950r = i3 % 128;
            int i4 = i3 % 2;
            eVar.b();
            int i5 = f21950r + 3;
            f21946m = i5 % 128;
            int i6 = i5 % 2;
        }

        static void init$0() {
            $$a = new byte[]{Ascii.ETB, 117, 49, -107};
            $$b = 2;
        }

        static void init$1() {
            $$d = new byte[]{81, 52, -106, MessagePack.Code.FIXEXT4, MessagePack.Code.EXT32, 65, Ascii.RS, -65, 65, MessagePack.Code.EXT32, Ascii.SUB};
            $$e = 190;
        }

        static void init$2() {
            $$c = new byte[]{Base64.padSymbol, 59, -113, -1};
            $$f = Mp4VideoDirectory.TAG_DEPTH;
        }

        /* JADX WARN: Removed duplicated region for block: B:116:0x0304  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0305  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void q(char r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 798
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.c.a.AnonymousClass1.q(char, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0163  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void s(int r23, java.lang.String r24, byte r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 912
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.c.a.AnonymousClass1.s(int, java.lang.String, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void t(short r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r0 = 98 - r7
                int r1 = r8 * 4
                int r8 = r1 + 4
                int r7 = r9 * 2
                int r1 = r7 + 1
                byte[] r6 = o.c.a.AnonymousClass1.$$a
                byte[] r5 = new byte[r1]
                r4 = 0
                if (r6 != 0) goto L2b
                r3 = r8
                r2 = r4
            L13:
                int r0 = -r0
                int r8 = r8 + 1
                int r0 = r0 + r3
            L17:
                byte r1 = (byte) r0
                r5[r2] = r1
                if (r2 != r7) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r10[r4] = r0
                return
            L24:
                int r2 = r2 + 1
                r1 = r6[r8]
                r3 = r0
                r0 = r1
                goto L13
            L2b:
                r2 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.c.a.AnonymousClass1.t(short, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void u(short r9, short r10, byte r11, java.lang.Object[] r12) {
            /*
                byte[] r8 = o.c.a.AnonymousClass1.$$d
                int r7 = r10 * 7
                int r1 = r7 + 1
                int r0 = r9 * 7
                int r6 = 11 - r0
                int r0 = r11 * 11
                int r5 = r0 + 100
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r8 != 0) goto L2d
                r0 = r3
                r2 = r6
            L15:
                int r6 = r6 + r5
                int r6 = r6 + (-10)
                int r2 = r2 + 1
                r1 = r0
            L1b:
                byte r0 = (byte) r6
                r4[r1] = r0
                int r0 = r1 + 1
                if (r1 != r7) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r12[r3] = r0
                return
            L2a:
                r5 = r8[r2]
                goto L15
            L2d:
                r1 = r3
                r2 = r6
                r6 = r5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.c.a.AnonymousClass1.u(short, short, byte, java.lang.Object[]):void");
        }

        @Override // o.bh.a.InterfaceC0341a
        public final void b(final o.bg.c cVar, boolean z2, final o.by.g gVar) throws Throwable {
            ArrayList<b> arrayList;
            synchronized (a.f21916a) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    q((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), ViewConfiguration.getKeyRepeatTimeout() >> 16, ExpandableListView.getPackedPositionGroup(0L) + 20, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    q((char) (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.getSize(0) + 143, (Process.myPid() >> 22) + 42, objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                a.f21918e = false;
                a.this.f21936b = null;
                a.e(this.f21951g, c.f21970c);
                a.c(this.f21951g, null);
                a.this.b(this.f21951g).e(true);
                arrayList = new ArrayList(a.f21917c);
                a.f21917c.clear();
                a.e();
            }
            for (b bVar : arrayList) {
                final e eVarF = bVar.f21968e.f();
                if (eVarF != null) {
                    Object[] objArr3 = {bVar.f21968e};
                    int i2 = 1488862647 * g.f21999c;
                    g.f21999c = i2;
                    int priority = Thread.currentThread().getPriority();
                    int iNextInt = new Random().nextInt();
                    int i3 = (-1873876582) * g.f21998b;
                    g.f21998b = i3;
                    Handler handler = (Handler) g.d(i2, objArr3, i3, iNextInt, -367277091, priority, 367277092);
                    Runnable runnable = new Runnable() { // from class: o.c.a$1$$ExternalSyntheticLambda7
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.c(eVarF, cVar, gVar);
                        }
                    };
                    short sXd = (short) (C1499aX.Xd() ^ (-6277));
                    int[] iArr = new int["\u0012 \u0017&$\u001f\u001be(-h\u0004\u001e,#,&4".length()];
                    QB qb = new QB("\u0012 \u0017&$\u001f\u001be(-h\u0004\u001e,#,&4");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i4));
                        i4++;
                    }
                    Object[] objArr4 = {runnable};
                    Method method = Class.forName(new String(iArr, 0, i4)).getMethod(C1561oA.Xd("bbgi", (short) (C1607wl.Xd() ^ 18076)), Class.forName(Wg.Zd("e\u0014\\|\u0001t\u001d_\u0010\nc>l H\u0001@l", (short) (C1633zX.Xd() ^ (-9781)), (short) (C1633zX.Xd() ^ (-14374)))));
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr4);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
            final e eVar = this.f21953i;
            if (eVar != null) {
                Handler handler2 = this.f21954j;
                Object[] objArr5 = {new Runnable() { // from class: o.c.a$1$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(eVar, cVar, gVar);
                    }
                }};
                Method method2 = Class.forName(Wg.vd("\u0005\u0013\u0006\u0015\u000f\n\u0002L\u001b Wr\t\u0017\n\u0013x\u0007", (short) (C1633zX.Xd() ^ (-7390)))).getMethod(hg.Vd("\u0001~\u0002\u0002", (short) (ZN.Xd() ^ 13923), (short) (ZN.Xd() ^ 18343)), Class.forName(Qg.kd("|r\u0007p<ymyq7Z|tseenf", (short) (ZN.Xd() ^ 16255), (short) (ZN.Xd() ^ 1985))));
                try {
                    method2.setAccessible(true);
                    method2.invoke(handler2, objArr5);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            o.en.b.c();
            o.en.b.e(this.f21951g, true);
            if (z2) {
                if (f.a()) {
                    Object[] objArr6 = new Object[1];
                    q((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, 20 - (ViewConfiguration.getEdgeSlop() >> 16), objArr6);
                    String strIntern2 = ((String) objArr6[0]).intern();
                    Object[] objArr7 = new Object[1];
                    s(Color.rgb(0, 0, 0) + 16777293, C1561oA.ud("\u001a \u001c\u000e\r\u001c\u0018\n\u0002!\u0001\u0017ᬽᬼ\u0003\u0013\u0011v\u000bt\nr\u0011\u0005\u000b\u0001rt\r\u0006yrine\u0007\u007f\u0003jqjΗr\\nxuyt`kgcYhjea_eaSRa]OGfT`JQEUNEᬅ", (short) (C1580rY.Xd() ^ (-3806))), (byte) (TextUtils.getOffsetBefore("", 0) + 22), objArr7);
                    f.c(strIntern2, ((String) objArr7[0]).intern());
                }
                if (o.m.c.d().j()) {
                    o.f.b.e();
                }
                new o.cd.d();
                o.cd.d.b(this.f21951g).a(this.f21951g);
            }
            if (cVar.e().g()) {
                final Context context = this.f21951g;
                new Thread(new Runnable() { // from class: o.c.a$1$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        a.AnonymousClass1.d(context);
                    }
                }).start();
            }
        }

        @Override // o.bh.a.InterfaceC0341a
        public final void c() throws Throwable {
            ArrayList<b> arrayList;
            synchronized (a.f21916a) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    q((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0, 0) + 1, TextUtils.lastIndexOf("", '0') + 21, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    s(46 - TextUtils.lastIndexOf("", '0', 0, 0), C1561oA.yd("iqoc\\mk_QrTl䭘䭙Vh\u0001h~jyd\u0007\t䭲䭳erxdowMABSI=7XQQM<3N䭁", (short) (C1580rY.Xd() ^ (-307))), (byte) (66 - ExpandableListView.getPackedPositionType(0L)), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                arrayList = new ArrayList(a.f21917c);
            }
            for (b bVar : arrayList) {
                final e eVarF = bVar.f21968e.f();
                if (eVarF != null) {
                    Object[] objArr3 = {bVar.f21968e};
                    int i2 = 1488862647 * g.f21999c;
                    g.f21999c = i2;
                    int priority = Thread.currentThread().getPriority();
                    int iNextInt = new Random().nextInt();
                    int i3 = (-1873876582) * g.f21998b;
                    g.f21998b = i3;
                    Handler handler = (Handler) g.d(i2, objArr3, i3, iNextInt, -367277091, priority, 367277092);
                    Runnable runnable = new Runnable() { // from class: o.c.a$1$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.AnonymousClass1.b(eVarF);
                        }
                    };
                    short sXd = (short) (FB.Xd() ^ 17092);
                    int[] iArr = new int["\\japnie0rw3Nhvmvp~".length()];
                    QB qb = new QB("\\japnie0rw3Nhvmvp~");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i4));
                        i4++;
                    }
                    Object[] objArr4 = {runnable};
                    Method method = Class.forName(new String(iArr, 0, i4)).getMethod(Jg.Wd("\u007feNV", (short) (OY.Xd() ^ 28502), (short) (OY.Xd() ^ 11066)), Class.forName(Xg.qd("\f\u0004\u001a\u0006S\u0013\t\u0017\u0011X}\"\u001c\u001d\u0011\u0013\u001e\u0018", (short) (C1499aX.Xd() ^ (-16211)), (short) (C1499aX.Xd() ^ (-20856)))));
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr4);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
            final e eVar = this.f21953i;
            if (eVar != null) {
                Handler handler2 = this.f21954j;
                Runnable runnable2 = new Runnable() { // from class: o.c.a$1$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.AnonymousClass1.e(eVar);
                    }
                };
                short sXd2 = (short) (Od.Xd() ^ (-5927));
                short sXd3 = (short) (Od.Xd() ^ (-6231));
                int[] iArr2 = new int["h2\u00193%\u0012G-FS1/amgF\u00173".length()];
                QB qb2 = new QB("h2\u00193%\u0012G-FS1/amgF\u00173");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd3) + sXd2)));
                    i5++;
                }
                Object[] objArr5 = {runnable2};
                Method method2 = Class.forName(new String(iArr2, 0, i5)).getMethod(Ig.wd("z1g\u0005", (short) (OY.Xd() ^ 28799)), Class.forName(C1626yg.Ud(".4Xd\u001bFm\u0011v^Chq2=n\"y", (short) (C1499aX.Xd() ^ (-17352)), (short) (C1499aX.Xd() ^ (-1126)))));
                try {
                    method2.setAccessible(true);
                    method2.invoke(handler2, objArr5);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:121:0x0228  */
        @Override // o.bh.a.InterfaceC0341a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1800
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.c.a.AnonymousClass1.d():void");
        }

        @Override // o.bh.a.InterfaceC0341a
        public final void e(o.bg.c cVar) {
            int i2 = f21940c * 795911385;
            f21940c = i2;
            int i3 = f21943f * (-387338140);
            f21943f = i3;
            int iMyUid = Process.myUid();
            e(new Random().nextInt(), -1413277785, i2, i3, 1413277786, new Object[]{this, cVar}, iMyUid);
        }

        @Override // o.bh.a.InterfaceC0341a
        public final void e(final o.bx.d dVar, final o.j.b bVar, final o.bg.c cVar) throws Throwable {
            ArrayList<b> arrayList;
            synchronized (a.f21916a) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    q((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 20 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr2 = new Object[1];
                    q((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 21 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 72, objArr2);
                    StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(dVar);
                    int iIndexOf = 21 - TextUtils.indexOf("", "", 0);
                    short sXd = (short) (C1580rY.Xd() ^ (-4455));
                    int[] iArr = new int["\u001a\u000b%\u000f$*\u000f-\u0005\u0013\u0004\u0017\u0017\u000b\u001e\u001du\u0017\n\u0003㭻".length()];
                    QB qb = new QB("\u001a\u000b%\u000f$*\u000f-\u0005\u0013\u0004\u0017\u0017\u000b\u001e\u001du\u0017\n\u0003㭻");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                        i2++;
                    }
                    Object[] objArr3 = new Object[1];
                    s(iIndexOf, new String(iArr, 0, i2), (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 85), objArr3);
                    f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).append(bVar).toString());
                }
                a.f21918e = false;
                a.this.f21936b = null;
                arrayList = new ArrayList(a.f21917c);
                a.f21917c.clear();
                a.e();
            }
            for (b bVar2 : arrayList) {
                final e eVarF = bVar2.f21968e.f();
                if (eVarF != null) {
                    Object[] objArr4 = {bVar2.f21968e};
                    int i3 = 1488862647 * g.f21999c;
                    g.f21999c = i3;
                    int priority = Thread.currentThread().getPriority();
                    int iNextInt = new Random().nextInt();
                    int i4 = (-1873876582) * g.f21998b;
                    g.f21998b = i4;
                    Handler handler = (Handler) g.d(i3, objArr4, i4, iNextInt, -367277091, priority, 367277092);
                    Runnable runnable = new Runnable() { // from class: o.c.a$1$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.AnonymousClass1.a(eVarF, dVar, bVar, cVar);
                        }
                    };
                    Class<?> cls = Class.forName(C1561oA.Yd("Q_Vec^Z%gl(C]kbkes", (short) (OY.Xd() ^ 29762)));
                    Class<?>[] clsArr = new Class[1];
                    short sXd2 = (short) (OY.Xd() ^ 23178);
                    short sXd3 = (short) (OY.Xd() ^ 25008);
                    int[] iArr2 = new int["F>T@\u000eMCQK\u00138\\VWKMXR".length()];
                    QB qb2 = new QB("F>T@\u000eMCQK\u00138\\VWKMXR");
                    int i5 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i5] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i5)) + sXd3);
                        i5++;
                    }
                    clsArr[0] = Class.forName(new String(iArr2, 0, i5));
                    Object[] objArr5 = {runnable};
                    Method method = cls.getMethod(Jg.Wd("V5M/", (short) (FB.Xd() ^ 28954), (short) (FB.Xd() ^ 9478)), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr5);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
            final e eVar = this.f21953i;
            if (eVar != null) {
                Handler handler2 = this.f21954j;
                Runnable runnable2 = new Runnable() { // from class: o.c.a$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.AnonymousClass1.b(eVar, dVar, bVar, cVar);
                    }
                };
                Class<?> cls2 = Class.forName(ZO.xd("+RUnXJsow\u001c!zI5\f\n]%", (short) (ZN.Xd() ^ 19857), (short) (ZN.Xd() ^ 15144)));
                Class<?>[] clsArr2 = {Class.forName(C1626yg.Ud("-<q|m86EE\"2 qQ\\F|i", (short) (C1607wl.Xd() ^ 26812), (short) (C1607wl.Xd() ^ 31678)))};
                Object[] objArr6 = {runnable2};
                short sXd4 = (short) (FB.Xd() ^ 1367);
                int[] iArr3 = new int["+qE,".length()];
                QB qb3 = new QB("+qE,");
                int i6 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i6] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd4 + i6)));
                    i6++;
                }
                Method method2 = cls2.getMethod(new String(iArr3, 0, i6), clsArr2);
                try {
                    method2.setAccessible(true);
                    method2.invoke(handler2, objArr6);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.c.a$5 */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f21955a;

        /* JADX INFO: renamed from: b */
        private static int f21956b = 1;

        /* JADX INFO: renamed from: c */
        private static int f21957c = 0;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f21958d;

        static {
            int[] iArr = new int[c.values().length];
            f21958d = iArr;
            try {
                iArr[c.f21969a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21958d[c.f21972e.ordinal()] = 2;
                int i2 = f21957c + 67;
                f21956b = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21958d[c.f21970c.ordinal()] = 3;
                int i4 = f21956b + 49;
                f21957c = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21958d[c.f21971d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.values().length];
            f21955a = iArr2;
            try {
                iArr2[d.f21984a.ordinal()] = 1;
                int i6 = f21956b;
                int i7 = (((-1) - (((-1) - i6) & ((-1) - 87))) << 1) - (i6 ^ 87);
                f21957c = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21955a[d.f21988e.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21955a[d.f21986c.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int f21959a = 0;

        /* JADX INFO: renamed from: b */
        private static int f21960b = 0;

        /* JADX INFO: renamed from: c */
        private static long f21961c = 0;

        /* JADX INFO: renamed from: f */
        public static int f21962f = 0;

        /* JADX INFO: renamed from: g */
        public static int f21963g = 0;

        /* JADX INFO: renamed from: h */
        public static int f21964h = 0;

        /* JADX INFO: renamed from: i */
        public static int f21965i = 0;

        /* JADX INFO: renamed from: j */
        public static int f21966j = 0;

        /* JADX INFO: renamed from: d */
        final a f21967d;

        /* JADX INFO: renamed from: e */
        final g f21968e;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(int r9, short r10, short r11) {
            /*
                byte[] r8 = o.c.a.b.$$c
                int r2 = r11 * 4
                int r1 = 1 - r2
                int r0 = r10 * 4
                int r7 = r0 + 4
                int r0 = r9 * 7
                int r0 = r0 + 107
                byte[] r6 = new byte[r1]
                r5 = 0
                int r4 = 0 - r2
                if (r8 != 0) goto L2c
                r1 = r7
                r3 = r5
            L17:
                int r0 = -r0
                int r7 = r7 + r0
                int r1 = r1 + 1
                r2 = r3
            L1c:
                byte r0 = (byte) r7
                r6[r2] = r0
                int r3 = r2 + 1
                if (r2 != r4) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L29:
                r0 = r8[r1]
                goto L17
            L2c:
                r2 = r5
                r1 = r7
                r7 = r0
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.c.a.b.$$e(int, short, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f21966j = 2047506141;
            f21965i = -902608823;
            f21964h = -394588313;
            f21963g = 1455701479;
            f21962f = 219321169;
            init$0();
            f21960b = 0;
            f21959a = 1;
            f21961c = 1099509361364172347L;
        }

        b(a aVar, g gVar) {
            this.f21967d = aVar;
            this.f21968e = gVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:219|142|(1:144)(4:145|213|146|(9:148|150|151|216|156|(2:159|(1:161)(1:157))(4:164|210|165|166)|(6:212|170|(1:172)(1:199)|173|(3:175|(1:177)(1:192)|(1:179)(1:191))(4:193|220|194|195)|(3:183|(1:185)(1:190)|(1:(2:188|189))(2:200|201)))|181|182)(1:149))|155|216|156|(0)(0)|(0)|181|182) */
        /* JADX WARN: Not initialized variable reg: 9, insn: 0x0150: ARITH (r7 I:??[int, boolean]) = (r9 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:122:0x0150 */
        /* JADX WARN: Removed duplicated region for block: B:159:0x04bf  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x04cf A[Catch: Exception -> 0x04bb, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x04bb, blocks: (B:156:0x0499, B:164:0x04cf, B:166:0x04f9, B:168:0x0501, B:169:0x0507, B:165:0x04d9), top: B:216:0x0499, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:212:0x0508 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] e(int r26, int r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1664
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.c.a.b.e(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{Ascii.SUB, -20, MessagePack.Code.NIL, 88};
            $$b = 153;
        }

        static void init$1() {
            $$c = new byte[]{112, 68, MessagePack.Code.BIN8, -81};
            $$d = 25;
        }

        private static void k(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            Object obj = null;
            if (str2 != null) {
                int i4 = $10 + 17;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    str2.toCharArray();
                    obj.hashCode();
                    throw null;
                }
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            k kVar = new k();
            char[] cArrC = k.c(f21961c ^ (-5882309809461882246L), (char[]) charArray, i2);
            kVar.f19939c = 4;
            while (kVar.f19939c < cArrC.length) {
                int i5 = $10 + 5;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                kVar.f19938a = kVar.f19939c - 4;
                int i7 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f21961c)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((-16776987) - Color.rgb(0, 0, 0), (char) (51004 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9, 1749983833, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 675;
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i8 = 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int i9 = $$d;
                        byte b4 = (byte) ((i9 + 7) - (i9 | 7));
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(offsetBefore, doubleTapTimeout, i8, 522683165, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrC, 4, cArrC.length - 4);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void l(short r9, int r10, int r11, java.lang.Object[] r12) {
            /*
                int r0 = r11 * 3
                int r8 = r0 + 1
                byte[] r7 = o.c.a.b.$$a
                int r0 = r10 * 4
                int r0 = 3 - r0
                int r1 = r9 * 2
                int r6 = 100 - r1
                byte[] r5 = new byte[r8]
                r4 = 0
                if (r7 != 0) goto L2c
                r1 = r0
                r3 = r4
            L15:
                int r6 = r6 + r0
                r0 = r1
                r2 = r3
            L18:
                int r1 = r0 + 1
                int r3 = r2 + 1
                byte r0 = (byte) r6
                r5[r2] = r0
                if (r3 != r8) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r12[r4] = r0
                return
            L29:
                r0 = r7[r1]
                goto L15
            L2c:
                r2 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.c.a.b.l(short, int, int, java.lang.Object[]):void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, int r9, short r10) {
        /*
            byte[] r7 = o.c.a.$$a
            int r6 = r8 + 4
            int r0 = r10 + 99
            int r1 = r9 * 3
            int r5 = 1 - r1
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r7 != 0) goto L25
            r2 = r6
            r1 = r3
        L11:
            int r0 = -r0
            int r6 = r6 + r0
        L13:
            byte r0 = (byte) r6
            r4[r1] = r0
            int r1 = r1 + 1
            int r2 = r2 + 1
            if (r1 != r5) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L22:
            r0 = r7[r2]
            goto L11
        L25:
            r1 = r3
            r2 = r6
            r6 = r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c.a.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21928o = 1843750241;
        f21924k = 1008529798;
        f21927n = -1713656567;
        f21921h = -146404113;
        f21919f = 625847457;
        f21923j = 1676810679;
        f21922i = 739678278;
        f21920g = 109031769;
        f21934v = 0;
        f21935w = 1;
        f21933t = 0;
        f21930q = 1;
        a();
        TextUtils.getTrimmedLength("");
        ExpandableListView.getPackedPositionType(0L);
        TypedValue.complexToFloat(0);
        f21916a = new Object();
        f21925l = false;
        f21918e = false;
        f21929p = new ArrayList();
        f21917c = new ArrayList();
        int i2 = f21934v + 85;
        f21935w = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public a(Context context) throws IllegalArgumentException {
        synchronized (f21916a) {
            if (context == null) {
                Object[] objArr = new Object[1];
                u((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.red(0) + 22, objArr);
                throw new IllegalArgumentException(((String) objArr[0]).intern());
            }
            if (f.a()) {
                f.c("Log Manager", "nothing to do");
            }
            int i2 = (-498977415) * f.f23511d;
            f.f23511d = i2;
            int i3 = 620257954 * f.f23512e;
            f.f23512e = i3;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i4 = f.f23515h * 1539730836;
            f.f23515h = i4;
            f.d(i2, i3, new Object[0], 1138136590, iFreeMemory, -1138136589, i4);
            this.f21937d = o.en.b.c();
        }
    }

    private o.bg.c a(g gVar) {
        int iNextInt = new Random().nextInt(2090606680);
        int iNextInt2 = new Random().nextInt(1965067082);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i2 = f21920g * 93609594;
        f21920g = i2;
        return (o.bg.c) e(new Object[]{this, gVar}, -1835013151, i2, iNextInt, iNextInt2, 1835013151, iUptimeMillis);
    }

    static void a() {
        char[] cArr = new char[2159];
        ByteBuffer.wrap("\u0094±ô\"Uâ¶»\u0016kw1Ðü1ë\u0091iò$Sê¼©\u001ci}5Þ ?¡\u009fgø}Yòºª\u001ar{5\u0094³ô#Uø¶ª\u0016bw&Ðø1\u009c\u0091kò)Sè¼¢\u001cr}\fÞá?\u00ad\u009fcø:Yùº\u00ad\u0094\u0091ô\"Uâ¶¡\u0016kw*ÐüÀÍ ~\u0001¾âýB7#v\u0084 e·Å{¦9\u0007¹èøH.)t\u008aªkþË*¬h\r¯îíNb/j\u0090ªq§Ñ!²f\u0013¡ôåT-¾\nÞ¹\u007fy\u009c:<ð]±úg\u001bp»¼Øþym\u009696úW³ôh\u0015,µüÒ´sn\u0090*0âQâî`\u000f/¯ïÌ mj\u008a/*ùKêèy\t-©øÆ\u0083gR\u0084\u0007$ÁEÒâR\u0003\u0003£\u0091À\u009caPþ\t\u001eÓ¿\u009eÜ\u001b}\n\u009dÜ:\u0097[Rø\u0001\u0018Ö¹\u0096ßo¿Ü\u001e\u001cý_]\u0095<Ô\u009b\u0002z\u0015ÚÙ¹\u009b\u0018\b÷\\W\u009f6Ö\u0095\rtIÔ\u0099³Ñ\u0012\u000bñOQ\u00870\u0087\u008f\u0005nJÎ\u008a\u00adÅ\f\u000fëJK\u009c*\u008f\u0089\u001chHÈ\u009d§æ\u00067åbE¤$·\u00837bfÂô¡ë\u0000?\u009fw\u007f¼Þö½0\u001czüü[ñ:'\u0099pyµØâ·5\u0016q\u0094\u0091ô\"Uâ¶¡\u0016kw*Ðü1ë\u0091'òeS÷¼³\u001cg}3Þô?ª\u009flø:Y¼º¼\u001aq{7Äö%¾\u0085yæ!\u0094\u0091ô\"Uâ¶¡\u0016kw*Ðü1ë\u0091'òeSó¼¦\u001cj}-Þå?·\u009f\"ø4Yïºÿ\u001a\u007f{5Äê%¾\u0085{æ1Gí ÷\u0000da$Âþ#½\u0083{ì\u0003MË\u0094\u0091ô\"Uâ¶¡\u0016kw*Ðü1ë\u0091'òeSó¼¦\u001cj}-Þå?·\u009f\"ø4Yïºÿ\u001ap{6Äì%û\u0085cæ0Gà ÷\u0000da$Âþ#½\u0083{ì\u0003MË\n£j\u0010ËÐ(\u0093\u0088Yé\u0018NÎ¯Ù\u000f\u0015lWÍÕ\"\u009a\u0082Zã\u0007@×¡\u0089\u0001DfOÇÞ$\u009f\u0084Cå\u001dZÃ»\u008d\u001bMx\u0003Ù\u0086\u0094\u0091ô\"Uâ¶¡\u0016kw*Ðü1ë\u0091'òeSå¼²\u001cr})Þå?\u00ad\u009fvø4Yÿº¾\u001aj{0Ä÷%µ\u0085:æ6Gû ¹\u0000ba4Âè#§\u00832ì\u001dMÞ®\u0080\u000eXo\u0000ÈÌ)\u008e\u0089NùB\u0099ñ81Ûr{¸\u001aù½/\\8üô\u009f¶>6Ñaq¡\u0010ú³6R~ò¥\u0095ç4,×mw¹\u0016ã©$Hfèé\u008bó*7Í`m¤\fö¯&N î³\u0081Û \u000eÃIc\u0098\u0002É¥\u000fD\u0018ä\u0089\u0087Ä&\u0018¹BY\u009cøÖ\u009b\u0016:T\u0094\u0091ô\"Uâ¶¡\u0016kw*Ðü1ë\u0091'òeSç¼¯\u001cc}\"Þë?ª\u009flø:Y¼º¹\u001aq{+Ä¸%º\u0085:æ%Gû ¤\u0000ea8Âò#¿\u0083wìMMÍ®\u008c\u000eZo\u0000ÈÞ)\u008a\u0089^ê\fKËÔ\u00894\u0006\u0095\u0015öÒW\u008a·E\u0010\u001aqÙÒ\u008d2W\u0093\u0017üß\u0094\u0091ô\"Uâ¶¡\u0016kw*Ðü1ë\u0091'òeSó¼¦\u001cj}-Þå?·\u009f\"ø.Yèº¾\u001aj{,Äë%û\u0085 æu\u0094\u0091ô\"Uâ¶¡\u0016kw*Ðü1ë\u0091'òeSó¼¦\u001cj}-Þå?·\u009f\"ø3Yóº«\u001a>{)Äê%´\u0085læ<Gç ¾\u0000ya?Âõ#·§ßÇlf¬\u0085ï%%Ddã²\u0002¥¢iÁ+`©\u008fá/-Nlí¥\f\u00ad¬\u0003Ë@jò\u0089â)5He÷ \u0016ü¶7Õ~tú\u0093ê3-Roñ®\u0010ò°.ßW~Â\u009dÎ=\u000e\\\u0007û\u0082\u001aÀº\u0012ÙBx\u0089çÌ\u000b\u0005k¶Êv)5\u0089ÿè¾Oh®\u007f\u000e³mñÌ~#<\u0083²â\u009aAG w\u0000Åg¬Æz%=\u0085ãä®[iºo\u001aïy·Øa?*\u009fîþ¤]f¼+\u001cãsÙÒW1\u0015\u0091\u009að\u0099WY¶\t\u0016×u\u0092ÔUKI«\u0092\u0094\u0091ô\"Uâ¶¡\u0016kw*Ðü1ë\u0091'òeSç¼¯\u001cc}\"Þë?ã\u009frø8Yîº²\u001aw{*Äë%²\u0085uæ;Gç\u0094\u0091ô\"Uâ¶¡\u0016kw*Ðü1ë\u0091'òeSé¼¦\u001ch}%Þá?·\u009fmø/Yåºÿ\u001an{<Äê%¶\u0085sæ&Gç ¾\u0000ya?Âã#ó\u0083sì\u001fMÉ®Ï\u000eCo\u0000ÈÛ)\u0098\u0089Cê\u000bKÃ\u0005]eîÄ.'m\u0087§ææA0 '\u0000ëc©Â+-d\u008d¤ìþO9®c\u000eºiøÈ>+t\u008bòêöU;´y\u0014¸wüÖ;1o\u0091³ðòS2²?\u0012¿}ÔÜ\u0014?K\u009f\u008dþ×Y\r¸S\u0018\u009f\u0094\u0091ô\"Uâ¶¡\u0016kw*Ðü1ë\u0091'òeSå¼¤\u001cr}(Þö?¢\u009fvø4Yóº±\u001a>{8Äô%·\u0085uæ\"Gñ ³¯\u0013Ï n`\u008d#-éL¨ë~\niª¥Éçhg\u0087&'ðFªåt\u0004 ¤ôÃ¶bq\u00813!¼@ºÿv\u001e5¾÷Ý |s\u009b1;´Z¤ù{\u0018%¸ø×ÏvO\u0095\u00185ØT\u0083óO\u0012\u0007²ÜÑ\u008epEï\u0004\u000fÐ®\u008aÍMl\u000fn¢\u000e\u0011¯ÑL\u0092ìX\u008d\u0019*ÏËØk\u0014\bV©ÅF\u0091æD\u0087\u0007$ÚÅ\u0082eT\u0002\n£\u008f@\u008dàX\u0081\u001e>Ãß\u008d\u007fG\u001c\u0012½ÎZ\u0087úD\u009b\u00168ÊÙ\u008fyO\u0016~·úT¤ôm\u009562òÓ»sp\u0010\"±û.\u00adÎ5o;\fý\u00ad´Mxê-\u008bî(¸Èhi.\u0006«§¼Gfäf\u0085å\"¡Â%c1\u0000è¡©AqþÎ\u009f\u009a?X\u0094\u0091ô\"Uâ¶¡\u0016kw*Ðü1ë\u0091'òeSå¼¤\u001cr}(Þö?¢\u009fvø4Yóº±\u001a>{7Ä÷%¯\u0085:æ4Gø »\u0000ya&Âõ#·\u0083>ìMMÈ®\u008a\u000eMo\u0005ÈÁ)\u0085\u0089Cê\u000bKÃëÑ\u008bc*¶Éîi\"\bn¯\u0084Nëî+\u008dd,®Ãëc=\u0002H¡½@ãà \u0087\\&¶Åèe%\u0004F»²Zúú1\u0099s8µßÿ\u007f\u000b\u001e{½®\\éü8\u0093Q2\u0097Ñ\u0080qL\u0010\u0006·\u008bVÅö\u0010\u0095D4\u0088«ÀK\u0000ê@\u0089\u0088(\u008cÈ\u0003oW\u000e\u008b\u00adÄMQìD\u0083\u0092\"ÅÂ\u0000a_\u0000\u0088§ÌGYæL\u0085\u009a$ÛÄ\u0014{±\u001a÷º%Ysø£\u009fã\u0094\u0086ô?Uí¶¡\u0016}w/Ðí1¹\u0091Kò&Sð¼®\u001cp} Þô?ª\u009fmø3YÈº°\u001aP{<Äà%¯\u0085Xæ:Gá ¹\u0000ra\u001cÂñ#½\u0083sì\nMÉ®\u009d\u000e\u000eoDÈ\u0088)\u009f\u0089Xê\u0004KÊÔ\u00944@\u0095\u0004öÒW\u0091·K\u0010\u0013qÛÒß2_\u0093\u001aüÌ]\u0092½L\u001e\u0014\u007fÀØ\u009e8Y\u0099\u001fú\u0090[\u0087»]\u0004\u00ade¢Åj&6\u0087ýàè@i¡%\u0002ðcªÃc,f\u008dóî¥Nr¯7\bøi¯Ék\u0094\u0096ô\"UÍ¶¬\u0016zw Ðþ1ª\u0091~ò,Së¼©F:&\u0093\u0087Cd!ÄÅ¥³\u0002Pã\u0004CØ \u0088\u0081^n\bÎÔ¯\u0095\fUí;MØ*\u008a\u008bKh\u0006ÈÄ©\u0081\u0016H8\u00adX\u0010ùÀ\u001a¾ºXÛ\u001f|Õ\u009d\u0081=e^\u001cÿÐ\u0010\u0093°[Ñ\rr\u0098\u0093Ö3\u001aT\u0017õË\u0016\u0092¶R×\bhÎ\u0089\u0086)\u0002J\u0002ëÂ\fÏ¬MÍ\u0006nÆ\u008f\u0085/O@6áà\u0002÷¢;Ãqdâ\u0085¶%tF/çùx¬\u0098v9yZûû\u00ad\u001bw\u0094\u0096ô$Uÿ¶¬\u0016aw'Ðæ1®\u0091iò1S¤¼ý\u001c&\u0094\u0096ô$Uÿ¶¬\u0016aw'Ðæ1®\u0091iò1S¤¼ý\u001c&} Þã?·\u009fkø+Yýº«\u001aw{6Äö%û\u0085uæ;G´ °\u0000ya8Âþ#´¾ßÞm\u007f¶\u009cå<(]nú¯\u001bç» Øxyí\u0096£6oWlô \u0015ùµ(Ò{s»\u0090ø02Qsî¥\u000fû¯<Ìrmý\u008aø*-Kwè´\tº©:ÆGg\u0091\u0084Ï$\u0011EAâ\u0095\u0003Ë£\fÀBaÍþÜ\u001e\n¿[Ü\u0099}Å\u009d\u0005:G[\u009cøÔ\u0018\u001b¹UÖÑwÓ\u0097\u001d4HU\u0098òÒ\u0012\u0010³HÐÙqÍ\u0091\u001a.¨Oéï#\fs\u00adàÊìj#\u008bm(\u00adIêé+\u0006}\u0019ZyèØ3;`\u009b\u00adúë]*¼b\u001c¥\u007fýÞh1&\u0091êðãS#²/\u0012¡uåÔ87v\u0097 öµI7¨v\bºkõÊ:-z\u008d¹ìöO|®v\u000e\u00ada\u0081À\u0012#F\u0083\u0085âÌE\u0017¤S\u0004\u0083gÛÆ\rYO¹Ê\u0018\u0097{LÚD:\u0087\u009dÝü\u001c_Z¿\u009c\u001eÒqTÐV0\u0095\u0093Íò\u0011UMµ\u009b\u0014Éw\u0015ÖP6\u0090\u0095#õ\u0091TJ·\u0019\u0017Ôv\u0092ÑS0\u001b\u0090Üó\u0084R\u0011½_\u001d\u0093|\u0090ß\\>\u0005\u009eÔù\u0087XG»\u0004\u001bÎz\u008fÅY$\u0007\u0084Àç\u008eF\u0001¡\u0004\u0001Ñ`\u008bÃH\"F\u0082Êí¹Lw¯;\u000fün¹Éo(~\u0088ñë¿JeÕr5á\u0094±÷fV&¶ø\u0011¦pzÓ#3é\u0092 ýh\\n¼à\u001f¦~!Ù#9à\u0098°ûlZ0ºæ\u0005Ld\u0010ÄÕ'\u0095\u0094\u009eô\"Uï¶¤\u0016Hw;Ðç1¦\u0091Kò5SôK±+8\u008aôi·É\u007f¨)\u0094¥ô,Uà¶£\u0016kw=Ð¨1¢\u0091yòeSê¼¨\u001cr}aÞò?¶\u009flø3Yõº±\u001ay{uÄ¸%¸\u0085uæ;Gú ²\u0000ua%Âù#¼\u0083|ìMMÞ®\u008a\u000e_o\u001cÈÁ)\u0099\u0089Oê\u0001\u0094\u009eô\"Uë¶ \u0016{w=ÐÎ1¹\u0091eò(SÅ¼·\u001cv\u0094\u0091ô,Uâ¶¬\u0016kw%ÐÉ1¾\u0091~ò-Sá¼©\u001cr}(Þã?¢\u009fvø4Yóº±\u001a_{7Äü%\u008f\u0085hæ4Gú ¤\u0000wa2Âä#º\u0083}ì\u0003\u0094\u0094ô?U¢¶®\u0016`w=Ðí1§\u0091eò5Sª¼¦\u001ch}5Þå?¯\u009fmø-Yôº¼\u001a{{5Äñ%¹\u0085hæ4Gæ ®\u0000Ia\"Âø#²\u0083`ì\bMÈ®°\u000e^o\u001bÈÍ)\u008d\u0089Oê\u0017KÁÔ\u00894E\u0095\u0004öÓ³ÞÓfy?\u0019\u0082¸R[6ûÐ\u009a\u0082=VÜ\u0014|Ó\u001fÏ¾\u0003QMñÞ\u0090\u008e3^Ò\u001brÁ\u0015\u0092´@W\u0010÷Ð\u0096Ó)DÈ\u0010hÜ\u000b\u008aª[M]íØ\u008c\u0094/_Î\nn\u0098\u0001© iC1ã¤\u0082®%cÄ5dã\u0007§¦.9,Ùâx²\u001b*º:Züý¶\u009cb? ßç~ó\u0011(°qPòó¾\u0092}56Õ¼t¯\u0017u¶yVÖéH\u0088\u0012(õË\u0096jL\r\u0014\u00adÈL\u0093ïF\u008e\u0001.ÃÁ\u0089`O²®Ò\u0013sÃ\u0090§0AQ\u0013öÇ\u0017\u0085·BÔ^u\u0092\u009aÜ:O[\u001føÏ\u0019\u008d¹KÞ\b\u007f\u009d\u009cÄ+2K\u009bêK\t/©ÉÈ\u009boO\u008e\r.ÊMÖì\u001a\u0003T£ÆÂ\u0086aR\u0080\u0004 ÄG\u009dæ\u0015\u0005LjÓ\nt«·Híè\f\u0089z.©Ïêo;\fx\u00ad²Bðâ\u001b\u0083} \u009eÁþa7\u0006f§ ¼nÜÒZÅ:l\u009b¼xØØ!¹d\u001e¼ÿß_/<r\u009d³ràÒ-³a\u0010¡ñÈQ(6U\u0097·tüÔ3µs\nüë²K~(b\u0089»núÎ\"¯E\fµíäM%\"J\u0083\u0087`ÏÀ\u000f¡\u0017\u0006Ìé+\u0089\u0097(ZË\u0011kì\n\u009d\u00adQL\u0012ìÚ\u008f\u0084\u008dZíæL+¯`\u000f\u009dnìÉ (c\u0088«ëõJ`¥.\u0005âdÆÇ1&u\u0086´áü@6£o\u0003úbîÝ(<~\u009cªÿä^#¹)\u0019òÓU³ë\u0012#ñiQ¹0ï\u0094\u0087ô#Uà¶ \u0016mw\"Ðß1ª\u0091fò)Sá¼³\u001c&}lÞ ?°\u009fiø4Yìº\u008f\u001a\u007f{*Äë%¸\u0085uæ1Gñ í\u00006Zi:Í\u009b\u000exNØ\u0083¹Ì\u001e1ÿD_\u0088<Ç\u009d\u000fr]ÒÈ³\u0082\u0010Nñ@Q\u00836Å\u0097\u001bt_Ô\u0097µ\u0097\n\u0019ë@K\u0080(\u009b\u0089\u001cnKÎ\u0097¯Ò\f^íQM\u0093\"à\u0083)`dÀ¤¡§\u00065çqG¥$ÿ\u0085/\u0002úb_Ãº Ï\u0080\u0003áDF\u008c§Þ\u0007*dHÅ\u0097*Ã\u008a\u0006ëDH\u0098©ò\t\u0011nSÏ\u008b,×\u008c\fíQR\u0096³Ô\u0013\u001epPÑÕ6\u009b\u0096W÷CT\u0085µÓ\u0015\u0007zyÛ¾8®\u0098uù(°¯Ð\u0012qÎ\u0092\u00942JS\u0017ôÌ\u0015\u0089µIÖ\u0001wÇ\u0098\u008d8hY\u0003úÀ\u001b\u009e»CÜ\u0015}Å\u009e\u009b>\\_\u001aàà\u0001\u0086¡SÂ\u0019cÍ\u0084\u009f$hE\bæÜ\u0007\u008a§JÈ3i¡\u008aï*#K4ì÷\r©\u00adqÎ!oúð£\u0010d±\"Òäs \u0093h4pUâö§\u0016p·7Øðy¥\u0099d:>[ìü¶\u001c7½|Þð\u007f±\u009fi ÉA\u008fáE\u0002C£ÐÄ\u008ad\u0006\u0085\u000b&ÇG\u008eçM\b\u000e©ÈÊÍjA\u008b\u001a,ÄMÑíA\u000e\u0007¯Õ0\u0081PS\u0094\u009eô\"Uë¶ \u0016{w=Ð¨1æ\u0091*ò&Sñ¼µ\u001ct}$Þî?·\u009f\"ø.Yèº¾\u001aj{,Äë%û\u0085 æu\u0094\u009eô\"Uë¶ \u0016{w=Ð¨1æ\u0091*ò)Së¼ \u001ca}(Þî?¤\u009f\"ø2Yéº«\u001a>{?Äê%´\u0085wæuGú ¸\u0000baqÂà#¶\u0083`ì\u0000MÅ®\u009b\u000eZo\fÈÌ)Ë\u0089Yê\u0011KÅÔ\u00934C\u0095Aö\u009aWÃ·C\u0010\u001fqÓÒ\u008d2J\u0093\u0010üÖ]\u009c½\u001a\u001e\u0019\u007fÛØ\u00908Y\u0099\u0004úÄ\u0094\u0096ô(Uà¶ª\u0016zw,ÐÉ1¥\u0091nò\u0017Sá¼´\u001cc}5ÞÅ?µ\u009fgø/Yåº«\u001av{0Äö%¼\u0013ïsvÒ¤1è\u00914ðaW¢¶ö\u0016*ucÔ£;Ê\u009b\rú&Y\u00ad¸è\u0094\u0096ô,Uø¶®\u0016Jw Ðú1ë\u0091zò$Sð¼¯\u001c&}{Þ \u0094\u009dô/Uî\u0094\u009dô/Uî¶ï\u0016~w(Ðü1£\u0091*ò\u007fS¤N\u0081.3\u008fÿlùÌ%\u00ads\n¨ëìKy()\u0089÷x\u0080\u00182¹óZÒúu\u009b\u001d<ÙÝ\u0093}\u0017\u001e\u001c¿ÜP\u0096ð^\u0091\b2ØÓ\u009as\u001f\u0014Zµ\u0081".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2159);
        f21932s = cArr;
        f21931r = 452611448202064973L;
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        a aVar = (a) objArr[0];
        Context context = (Context) objArr[1];
        a.InterfaceC0341a interfaceC0341a = (a.InterfaceC0341a) objArr[2];
        o.i.d dVar = (o.i.d) objArr[3];
        o.h.d dVar2 = (o.h.d) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        o.dd.g gVar = (o.dd.g) objArr[6];
        boolean zBooleanValue2 = ((Boolean) objArr[7]).booleanValue();
        int i2 = 2 % 2;
        if (!(!f.a())) {
            int i3 = f21930q + 121;
            f21933t = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr2 = new Object[1];
            u((char) View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 22, Color.green(0) + 20, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            u((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 1056, TextUtils.indexOf((CharSequence) "", '0') + 13, objArr3);
            f.c(strIntern, ((String) objArr3[0]).intern());
        }
        o.bh.a aVar2 = new o.bh.a(context, aVar.f21937d, interfaceC0341a, gVar);
        aVar.f21936b = aVar2;
        f21918e = true;
        aVar2.b(dVar, dVar2, zBooleanValue, zBooleanValue2);
        int i5 = f21933t + 59;
        f21930q = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static void b(o.en.b bVar, Context context) throws Throwable {
        int i2 = f21922i * 1809095941;
        f21922i = i2;
        int i3 = f21923j * (-208500124);
        f21923j = i3;
        e(new Object[]{bVar, context}, 367855230, (int) Runtime.getRuntime().freeMemory(), i2, i3, -367855229, (int) SystemClock.uptimeMillis());
    }

    public static boolean b(Context context, boolean z2) {
        synchronized (f21916a) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                u((char) KeyEvent.keyCodeFromString(""), 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 20 - (Process.myPid() >> 22), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                u((char) (ViewConfiguration.getTouchSlop() >> 8), 1773 - (Process.myPid() >> 22), 29 - Color.alpha(0), objArr2);
                f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(z2).toString());
            }
            if (AnonymousClass5.f21958d[e(context).ordinal()] != 1) {
                return false;
            }
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                u((char) TextUtils.indexOf("", "", 0), 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 20, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                u((char) (52974 - KeyEvent.keyCodeFromString("")), 1801 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 43 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
                f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            f21925l = false;
            e(context, c.f21971d);
            c(context, Boolean.valueOf(z2));
            return true;
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        boolean z2;
        Context context = (Context) objArr[0];
        synchronized (f21916a) {
            c cVarE = e(context);
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                u((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 21 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr3 = new Object[1];
                u((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 38497), KeyEvent.keyCodeFromString("") + 1845, 37 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
                f.c(strIntern, sb.append(((String) objArr3[0]).intern()).append(cVarE).toString());
            }
            z2 = cVarE != c.f21972e;
        }
        return Boolean.valueOf(z2);
    }

    static void c(Context context, Boolean bool) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21933t + 11;
        f21930q = i3 % 128;
        if (i3 % 2 == 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            u((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getEdgeSlop() >> 16) + 22, 20 - TextUtils.indexOf("", "", 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            u((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52804), 1689 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 38 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(bool).toString());
        }
        Object[] objArr3 = new Object[1];
        u((char) Gravity.getAbsoluteGravity(0, 0), KeyEvent.keyCodeFromString("") + 1501, (-16777169) - Color.rgb(0, 0, 0), objArr3);
        Object[] objArr4 = {((String) objArr3[0]).intern(), 0};
        Method method = Class.forName(EO.Od("\u001eZt(w7\u0014/8E\\\u0007'$8\u0019S\b0|1q\u0012", (short) (C1607wl.Xd() ^ 30025))).getMethod(C1593ug.zd("\u001d\u001c,\f\"\u001c.\"\"\u000f2&((6*4*-<", (short) (FB.Xd() ^ 32751), (short) (FB.Xd() ^ 30262)), Class.forName(C1561oA.Qd("#\u0019-\u0017b \u0014 \u0018]\u0002\"\u001f\u0015\u0019\u0011", (short) (C1633zX.Xd() ^ (-28060)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr4)).edit();
            if (bool == null) {
                Object[] objArr5 = new Object[1];
                u((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10480), View.MeasureSpec.getMode(0) + 1687, ExpandableListView.getPackedPositionType(0L) + 2, objArr5);
                editorEdit.remove(((String) objArr5[0]).intern());
            } else {
                Object[] objArr6 = new Object[1];
                u((char) (10480 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1687 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2 - TextUtils.getOffsetAfter("", 0), objArr6);
                editorEdit.putBoolean(((String) objArr6[0]).intern(), bool.booleanValue());
            }
            editorEdit.commit();
            int i4 = f21930q + 67;
            f21933t = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void c(Context context, a.InterfaceC0341a interfaceC0341a, o.i.d dVar, o.h.d dVar2, boolean z2, o.dd.g gVar, boolean z3) throws Throwable {
        Object[] objArr = {this, context, interfaceC0341a, dVar, dVar2, Boolean.valueOf(z2), gVar, Boolean.valueOf(z3)};
        int iMyUid = Process.myUid();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = f21924k * (-765574006);
        f21924k = i2;
        int i3 = 1135234966 * f21928o;
        f21928o = i3;
        e(objArr, -711026883, i3, iMyUid, iFreeMemory, 711026887, i2);
    }

    public static boolean c() {
        int i2 = 2 % 2;
        int i3 = f21933t + 125;
        f21930q = i3 % 128;
        if (i3 % 2 != 0) {
            return f21925l;
        }
        throw null;
    }

    public static boolean c(Context context) {
        boolean z2;
        synchronized (f21916a) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                u((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 20 - KeyEvent.getDeadChar(0, 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                u((char) (ExpandableListView.getPackedPositionType(0L) + 32181), 1727 - ExpandableListView.getPackedPositionChild(0L), 10 - Color.red(0), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            c cVarE = e(context);
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                u((char) Drawable.resolveOpacity(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 22, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr4 = new Object[1];
                u((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 6596), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1738, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28, objArr4);
                f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(cVarE.name()).toString());
            }
            if (cVarE == c.f21972e) {
                return false;
            }
            if (cVarE != c.f21969a) {
                o.en.b.c().e(false);
                o.en.b.c();
                o.en.b.e(context, false);
                o.f.b.b();
                e(context, c.f21969a);
                c(context, null);
                z2 = true;
            } else {
                z2 = false;
            }
            o.en.b.c().c(context);
            new o.dk.a(context).a(8, 8, "", null, null, null, null);
            f21925l = true;
            return z2;
        }
    }

    private boolean c(o.bh.a aVar) throws Throwable {
        int i2 = 2 % 2;
        List<b> list = f21917c;
        if (list.isEmpty()) {
            return false;
        }
        int i3 = f21933t + 65;
        f21930q = i3 % 128;
        int i4 = i3 % 2;
        b bVarRemove = list.remove(0);
        if (f.a()) {
            int i5 = f21930q + 45;
            f21933t = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            u((char) (KeyEvent.getMaxKeyCode() >> 16), 22 - Color.green(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.getSize(0) + 971, 84 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        bVarRemove.f21967d.f21936b = aVar;
        a.InterfaceC0341a interfaceC0341aH = bVarRemove.f21968e.h();
        Object[] objArr3 = {bVarRemove.f21968e};
        int i7 = g.f22002h * (-1804521718);
        g.f22002h = i7;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i8 = g.f22003i * (-46183980);
        g.f22003i = i8;
        int i9 = g.f22004j * 118451907;
        g.f22004j = i9;
        aVar.c(interfaceC0341aH, (Context) g.d(i7, objArr3, i9, i8, 1393938958, iElapsedRealtime, -1393938955));
        this.f21936b = null;
        return true;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        o.en.b bVar = (o.en.b) objArr[0];
        Context context = (Context) objArr[1];
        int i2 = 2 % 2;
        int i3 = f21933t + 107;
        f21930q = i3 % 128;
        if (i3 % 2 == 0) {
            bVar.a();
            throw null;
        }
        if (!bVar.a()) {
            bVar.b(context);
        }
        int i4 = f21933t + 23;
        f21930q = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static void d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21930q + 99;
        f21933t = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            f.a();
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            u((char) ((-1) - MotionEvent.axisFromString("")), 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), AndroidCharacter.getMirror('0') - 28, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u((char) (Color.rgb(0, 0, 0) + 16777216), 1467 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 35, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        new o.dt.d();
        o.dt.d.b().e();
        o.dr.c.b().d();
        int i4 = f21930q + 107;
        f21933t = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static boolean d(Context context) {
        Object[] objArr = {context};
        int i2 = f21919f * 462846520;
        f21919f = i2;
        return ((Boolean) e(objArr, -113923029, (int) SystemClock.uptimeMillis(), i2, Process.myUid(), 113923031, new Random().nextInt(1563722654))).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1995
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c.a.e(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object e(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = (~((-1) - (((-1) - i2) & ((-1) - i4)))) | i6;
        int i9 = i4 | i2 | i6;
        int i10 = ~i2;
        int i11 = i2 + i6 + i5 + ((-421447895) * i7) + ((-859425246) * i3);
        int i12 = i11 * i11;
        int i13 = (i2 * (-629045104)) + 1817116672 + ((-629045104) * i6) + (i8 * (-1407420559)) + ((-1407420559) * i9) + (1407420559 * i10) + ((-2036465664) * i5) + ((-2125594624) * i7) + (888930304 * i3) + (441384960 * i12);
        int i14 = (i2 * 1303038832) + 2077918271 + (i6 * 1303038832) + (i8 * (-49)) + (i9 * (-49)) + (i10 * 49) + (i5 * 1303038783) + (i7 * 1583617559) + (i3 * (-1102559138)) + (i12 * 510722048);
        int i15 = i13 + (i14 * i14 * 607191040);
        if (i15 == 1) {
            return d(objArr);
        }
        if (i15 == 2) {
            return c(objArr);
        }
        if (i15 != 3) {
            return i15 != 4 ? e(objArr) : b(objArr);
        }
        Context context = (Context) objArr[0];
        int i16 = 2 % 2;
        int i17 = f21933t + 97;
        f21930q = i17 % 128;
        int i18 = i17 % 2;
        if (f.a()) {
            Object[] objArr2 = new Object[1];
            u((char) (ViewConfiguration.getScrollBarSize() >> 8), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 19 - ExpandableListView.getPackedPositionChild(0L), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            u((char) (ExpandableListView.getPackedPositionType(0L) + 65106), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1668, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18, objArr3);
            f.c(strIntern, ((String) objArr3[0]).intern());
        }
        Object[] objArr4 = new Object[1];
        u((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 1501, 47 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        Object[] objArr5 = {((String) objArr4[0]).intern(), 0};
        Method method = Class.forName(C1561oA.od("\".#0,%\u001fg\u001c'%*\u001a\"'_s\u001f\u001d\"\u0012$\u001f", (short) (Od.Xd() ^ (-1109)))).getMethod(Wg.Zd("mE*\u001f[jQ\u001c\u0001B:\u0003*@c,\\g?'", (short) (Od.Xd() ^ (-23347)), (short) (Od.Xd() ^ (-345))), Class.forName(C1561oA.Kd("kcye3rhvp8^\u0001\u007fw}w", (short) (C1633zX.Xd() ^ (-18643)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr5);
            Object[] objArr6 = new Object[1];
            u((char) (10479 - View.getDefaultSize(0, 0)), 1688 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 2, objArr6);
            boolean z2 = sharedPreferences.getBoolean(((String) objArr6[0]).intern(), false);
            int i19 = f21933t + 123;
            f21930q = i19 % 128;
            int i20 = i19 % 2;
            return Boolean.valueOf(z2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private a.InterfaceC0341a e(Context context, e eVar, Handler handler) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f21933t + 51;
            f21930q = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            u((char) Color.red(0), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 21, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u((char) (ImageFormat.getBitsPerPixel(0) + 53948), 1066 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f21930q + 29;
            f21933t = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 4;
            }
        }
        return new AnonymousClass1(eVar, handler, context);
    }

    public static c e(Context context) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        u((char) (ViewConfiguration.getTapTimeout() >> 16), 1501 - Color.green(0), 47 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        Object[] objArr2 = {((String) objArr[0]).intern(), 0};
        Method method = Class.forName(C1561oA.Xd("ftkzxso:p}}\u0005v\u0001\bBX\u0006\u0006\r~\u0013\u0010", (short) (ZN.Xd() ^ 27432))).getMethod(Qg.kd("<9G%91A31\u001c=//-9+3'(5", (short) (OY.Xd() ^ 27055), (short) (OY.Xd() ^ 32647)), Class.forName(Wg.vd("$\u001c.\u001ac#\u0015#)p\u001350(*$", (short) (C1633zX.Xd() ^ (-14910)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
            Object[] objArr3 = new Object[1];
            u((char) (10079 - KeyEvent.getDeadChar(0, 0)), 1548 - Color.argb(0, 0, 0, 0), 3 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
            c cVarD = c.d(sharedPreferences.getInt(((String) objArr3[0]).intern(), c.f21972e.c()));
            if (cVarD == null) {
                int i3 = f21930q + 87;
                f21933t = i3 % 128;
                int i4 = i3 % 2;
                if (f.a()) {
                    int i5 = f21933t + 97;
                    f21930q = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr4 = new Object[1];
                    u((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19, objArr4);
                    String strIntern = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    u((char) (60842 - Color.red(0)), AndroidCharacter.getMirror('0') + 1502, (ViewConfiguration.getTouchSlop() >> 8) + 78, objArr5);
                    f.c(strIntern, ((String) objArr5[0]).intern());
                }
                cVarD = c.f21972e;
                int i7 = f21930q + 85;
                f21933t = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 5;
                }
            }
            if (f.a()) {
                Object[] objArr6 = new Object[1];
                u((char) TextUtils.getCapsMode("", 0, 0), 22 - (ViewConfiguration.getPressedStateDuration() >> 16), 20 - Drawable.resolveOpacity(0, 0), objArr6);
                String strIntern2 = ((String) objArr6[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr7 = new Object[1];
                u((char) (View.combineMeasuredStates(0, 0) + 9787), 1627 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getTapTimeout() >> 16) + 20, objArr7);
                f.c(strIntern2, sb.append(((String) objArr7[0]).intern()).append(cVarD).toString());
            }
            return cVarD;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void e(Context context, c cVar) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            u((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, 20 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            u((char) (TextUtils.indexOf("", "", 0, 0) + 49075), 1647 - TextUtils.lastIndexOf("", '0', 0), 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(cVar).toString());
            int i3 = f21930q + 81;
            f21933t = i3 % 128;
            int i4 = i3 % 2;
        }
        Object[] objArr3 = new Object[1];
        u((char) (ImageFormat.getBitsPerPixel(0) + 1), 1501 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf("", "", 0, 0) + 47, objArr3);
        Object[] objArr4 = {((String) objArr3[0]).intern(), 0};
        Method method = Class.forName(hg.Vd("\u0007\u0013\b\u0015\u0011\n\u0004L\u0001\f\n\u000f~\u0007\fDX\u0004\u0002\u0007v\t\u0004", (short) (Od.Xd() ^ (-22110)), (short) (Od.Xd() ^ (-18087)))).getMethod(C1561oA.yd("rq\u0002aoi{owd\b{uu\u0004w\n\u007f\u0003\u0012", (short) (C1633zX.Xd() ^ (-26545))), Class.forName(C1561oA.ud("\u0003x\rvB\u007fs\u007fw=a\u0002~txp", (short) (C1499aX.Xd() ^ (-31424)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr4)).edit();
            Object[] objArr5 = new Object[1];
            u((char) (TextUtils.indexOf("", "", 0) + 10079), 1548 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 3, objArr5);
            editorEdit.putInt(((String) objArr5[0]).intern(), cVar.c()).commit();
            int i5 = f21933t + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f21930q = i5 % 128;
            int i6 = i5 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void e(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f21933t + 121;
        int i4 = i3 % 128;
        f21930q = i4;
        int i5 = i3 % 2;
        f21926m = z2;
        int i6 = i4 + 61;
        f21933t = i6 % 128;
        int i7 = i6 % 2;
    }

    static boolean e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21933t + 43;
        f21930q = i3 % 128;
        if (i3 % 2 == 0) {
            if (f21929p.isEmpty()) {
                return true;
            }
        } else if (f21929p.isEmpty()) {
            return false;
        }
        b bVarRemove = f21929p.remove(0);
        if (f.a()) {
            Object[] objArr = new Object[1];
            u((char) View.resolveSizeAndState(0, 0, 0), 22 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u((char) (32590 - TextUtils.lastIndexOf("", '0', 0, 0)), 948 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 71, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        Object[] objArr3 = {bVarRemove.f21967d, bVarRemove.f21968e};
        int iNextInt = new Random().nextInt(2090606680);
        int iNextInt2 = new Random().nextInt(1965067082);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i4 = f21920g * 93609594;
        f21920g = i4;
        int i5 = f21930q + 103;
        f21933t = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public static boolean f(Context context) {
        synchronized (f21916a) {
            c cVarE = e(context);
            if (f.a()) {
                Object[] objArr = new Object[1];
                u((char) Color.alpha(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, 20 - (Process.myTid() >> 22), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                u((char) (ViewConfiguration.getScrollBarSize() >> 8), 1971 - (ViewConfiguration.getFadingEdgeLength() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, objArr2);
                f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(cVarE).toString());
            }
            int i2 = AnonymousClass5.f21958d[cVarE.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    o.en.b.c().e(false);
                    o.en.b.c();
                    o.en.b.e(context, false);
                    o.f.b.b();
                    e(context, c.f21971d);
                    c(context, null);
                    o.en.b.c().a(context);
                    new o.dk.a(context).a(9, 8, "", null, null, null, null);
                    return true;
                }
                if (i2 != 4) {
                    throw new IllegalArgumentException();
                }
            }
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                u((char) TextUtils.indexOf("", "", 0, 0), 22 - Color.blue(0), 20 - Color.red(0), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                u((char) Color.alpha(0), TextUtils.getOffsetAfter("", 0) + 1997, View.MeasureSpec.makeMeasureSpec(0, 0) + 63, objArr4);
                f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            return false;
        }
    }

    public static void h(Context context) {
        Object obj;
        synchronized (f21916a) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                u((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, 19 - TextUtils.lastIndexOf("", '0', 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                u((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2059, (ViewConfiguration.getFadingEdgeLength() >> 16) + 24, objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            o.en.b.c().e(false);
            o.en.b.c();
            o.en.b.e(context, false);
            o.f.b.b();
            f21925l = false;
            e(context, c.f21972e);
            c(context, null);
            o.en.b.c().d(context);
            o.en.g.a();
            new o.dk.a(context).a(15, 8, "", null, null, null, null);
            Object[] objArr3 = new Object[1];
            u((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 47 - View.resolveSizeAndState(0, 0, 0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Class<?> cls = Class.forName(C1561oA.Yd("GUL[YTP\u001bQ^^eWah#9ffm_sp", (short) (C1633zX.Xd() ^ (-15789))));
            Class<?>[] clsArr = {Class.forName(Xg.qd("=5K7\u0005D:HB\n0RQIOI", (short) (C1499aX.Xd() ^ (-25680)), (short) (C1499aX.Xd() ^ (-1116)))), Integer.TYPE};
            Object[] objArr4 = {strIntern2, 0};
            short sXd = (short) (C1499aX.Xd() ^ (-29279));
            short sXd2 = (short) (C1499aX.Xd() ^ (-7769));
            int[] iArr = new int["_E#\u00032;\u0012;G}{5<{SF\u000ek7 ".length()];
            QB qb = new QB("_E#\u00032;\u0012;G}{5<{SF\u000ek7 ");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                ((SharedPreferences) method.invoke(context, objArr4)).edit().clear().commit();
                Object[] objArr5 = new Object[1];
                u((char) (AndroidCharacter.getMirror('0') + 34585), 2084 - View.MeasureSpec.getSize(0), 16 - Color.red(0), objArr5);
                String strIntern3 = ((String) objArr5[0]).intern();
                Class<?> cls2 = Class.forName(ZO.xd(":\\4\u001f/rU##\u0010|R\u001fD8I@Xu)t:V", (short) (FB.Xd() ^ 1457), (short) (FB.Xd() ^ 5318)));
                Class<?>[] clsArr2 = new Class[1];
                short sXd3 = (short) (C1580rY.Xd() ^ (-28541));
                short sXd4 = (short) (C1580rY.Xd() ^ (-18472));
                int[] iArr2 = new int["5\u0014DZ`bE}+.\u00040gRYl".length()];
                QB qb2 = new QB("5\u0014DZ`bE}+.\u00040gRYl");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                    i3++;
                }
                clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr6 = {strIntern3};
                Method method2 = cls2.getMethod(Ig.wd("a)Nj1m4\u0019\n\u0006\u0011&\ny", (short) (ZN.Xd() ^ 26686)), clsArr2);
                try {
                    method2.setAccessible(true);
                    method2.invoke(context, objArr6);
                    Class<?> cls3 = Class.forName(EO.Od("7uYO\\\u001cC\u0014!\u0001\u0002a\u001e\u001dGZ\u001d_\u0016s\u001cfD", (short) (Od.Xd() ^ (-873))));
                    Class<?>[] clsArr3 = new Class[0];
                    Object[] objArr7 = new Object[0];
                    short sXd5 = (short) (C1607wl.Xd() ^ 25558);
                    int[] iArr3 = new int["\u001e\u001b)t#\"\u001d\u0019\u0012\u000f!\u0015\u001a\u0018q\u0016\r\u0015".length()];
                    QB qb3 = new QB("\u001e\u001b)t#\"\u001d\u0019\u0012\u000f!\u0015\u001a\u0018q\u0016\r\u0015");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(sXd5 + sXd5 + sXd5 + i4 + xuXd3.CK(iKK3));
                        i4++;
                    }
                    Method method3 = cls3.getMethod(new String(iArr3, 0, i4), clsArr3);
                    try {
                        method3.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method3.invoke(context, objArr7);
                        String strZd = C1593ug.zd(";I@OMHD\u000fERRYKU\\\u0017ZX\u001a.^_\\ZUTh^eeAg`j", (short) (C1607wl.Xd() ^ 4437), (short) (C1607wl.Xd() ^ 14891));
                        String strOd = C1561oA.od("\u0010\f\u001e\nk\u0010\u0018", (short) (C1633zX.Xd() ^ (-2427)));
                        try {
                            Class<?> cls4 = Class.forName(strZd);
                            Field field = 1 != 0 ? cls4.getField(strOd) : cls4.getDeclaredField(strOd);
                            field.setAccessible(true);
                            obj = field.get(applicationInfo);
                        } catch (Throwable th) {
                            obj = null;
                        }
                        String str = (String) obj;
                        if (f.a()) {
                            Object[] objArr8 = new Object[1];
                            u((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20, objArr8);
                            String strIntern4 = ((String) objArr8[0]).intern();
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr9 = new Object[1];
                            u((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2100 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr9);
                            f.c(strIntern4, sb.append(((String) objArr9[0]).intern()).append(str).toString());
                        }
                        File file = new File(str);
                        Object[] objArr10 = new Object[1];
                        u((char) (ViewConfiguration.getEdgeSlop() >> 16), 2115 - (Process.myPid() >> 22), 3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr10);
                        File file2 = new File(file, ((String) objArr10[0]).intern());
                        if (f.a()) {
                            Object[] objArr11 = new Object[1];
                            u((char) Color.argb(0, 0, 0, 0), 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 20 - TextUtils.getTrimmedLength(""), objArr11);
                            String strIntern5 = ((String) objArr11[0]).intern();
                            StringBuilder sb2 = new StringBuilder();
                            Object[] objArr12 = new Object[1];
                            u((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 2118, 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr12);
                            StringBuilder sbAppend = sb2.append(((String) objArr12[0]).intern()).append(file2.getAbsolutePath());
                            Object[] objArr13 = new Object[1];
                            u((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 55891), TextUtils.lastIndexOf("", '0') + 2130, 11 - TextUtils.getOffsetBefore("", 0), objArr13);
                            f.c(strIntern5, sbAppend.append(((String) objArr13[0]).intern()).append(file2.exists()).toString());
                        }
                        boolean zDelete = file2.delete();
                        if (f.a()) {
                            Object[] objArr14 = new Object[1];
                            u((char) Gravity.getAbsoluteGravity(0, 0), 22 - (ViewConfiguration.getEdgeSlop() >> 16), 20 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr14);
                            String strIntern6 = ((String) objArr14[0]).intern();
                            StringBuilder sb3 = new StringBuilder();
                            Object[] objArr15 = new Object[1];
                            u((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 60477), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2141, TextUtils.indexOf("", "") + 19, objArr15);
                            f.c(strIntern6, sb3.append(((String) objArr15[0]).intern()).append(zDelete).toString());
                        }
                        o.bu.e.a().e();
                        new o.bo.g();
                        o.bo.g.c();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    private static boolean i(Context context) {
        Object[] objArr = {context};
        int iNextInt = new Random().nextInt(1067763962);
        int i2 = f21921h * (-1134788016);
        f21921h = i2;
        int i3 = f21927n * (-294443711);
        f21927n = i3;
        return ((Boolean) e(objArr, 1008424473, Process.myTid(), iNextInt, i2, -1008424470, i3)).booleanValue();
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ESC, -10, MessagePack.Code.FIXEXT8, 7};
        $$b = Mp4VideoDirectory.TAG_COLOR_TABLE;
    }

    public static void j(Context context) {
        synchronized (f21916a) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                u((char) KeyEvent.normalizeMetaState(0), 21 - TextUtils.lastIndexOf("", '0'), 20 - Color.green(0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                u((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 9261), ExpandableListView.getPackedPositionGroup(0L) + 1883, TextUtils.getOffsetBefore("", 0) + 88, objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            e(context, c.f21971d);
            c(context, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0341  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void u(char r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c.a.u(char, int, int, java.lang.Object[]):void");
    }

    public final void a(Context context) {
        Object[] objArr = new Object[1];
        u((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 22 - Color.red(0), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.NAK, objArr);
        String strIntern = ((String) objArr[0]).intern();
        synchronized (f21916a) {
            if (f.a()) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                u((char) View.MeasureSpec.makeMeasureSpec(0, 0), 1139 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 13 - ExpandableListView.getPackedPositionType(0L), objArr2);
                f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(context).toString());
            }
            Iterator<b> it = f21917c.iterator();
            while (it.hasNext()) {
                if (it.next().f21967d == this) {
                    it.remove();
                }
            }
            Iterator<b> it2 = f21929p.iterator();
            while (it2.hasNext()) {
                if (it2.next().f21967d == this) {
                    it2.remove();
                }
            }
            if (f21918e) {
                if (f.a()) {
                    Object[] objArr3 = new Object[1];
                    u((char) View.getDefaultSize(0, 0), 1152 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 32, objArr3);
                    f.c(strIntern, ((String) objArr3[0]).intern());
                }
                if (this.f21936b != null) {
                    if (f.a()) {
                        Object[] objArr4 = new Object[1];
                        u((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10825), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1185, 77 - TextUtils.indexOf("", "", 0, 0), objArr4);
                        f.c(strIntern, ((String) objArr4[0]).intern());
                    }
                    if (!c(this.f21936b)) {
                        if (f.a()) {
                            Object[] objArr5 = new Object[1];
                            u((char) (36300 - TextUtils.getCapsMode("", 0, 0)), 1261 - View.getDefaultSize(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 65, objArr5);
                            f.c(strIntern, ((String) objArr5[0]).intern());
                        }
                        o.bh.a aVar = this.f21936b;
                        if (aVar != null) {
                            int i2 = o.bh.a.f21130c * (-1080928184);
                            o.bh.a.f21130c = i2;
                            int i3 = o.bh.a.f21132e * 1427279142;
                            o.bh.a.f21132e = i3;
                            o.bh.a.d(i2, 1038993847, i3, -1038993846, new Object[]{aVar}, (int) Process.getElapsedCpuTime(), Process.myTid());
                        }
                        f21918e = false;
                        e();
                    }
                } else if (f.a()) {
                    Object[] objArr6 = new Object[1];
                    u((char) (437 - KeyEvent.normalizeMetaState(0)), 1326 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 68 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr6);
                    f.c(strIntern, ((String) objArr6[0]).intern());
                }
            }
        }
    }

    public final void a(Context context, e.d dVar) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f21930q + 121;
            f21933t = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            u((char) Color.argb(0, 0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, Gravity.getAbsoluteGravity(0, 0) + 20, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), KeyEvent.getDeadChar(0, 0) + 1454, 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f21933t + 55;
            f21930q = i5 % 128;
            int i6 = i5 % 2;
        }
        if (this.f21937d.s()) {
            new o.bj.e(context, dVar, this.f21937d).l();
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr3 = new Object[1];
        u((char) (Color.green(0) + 57108), 1406 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Process.getGidForName("") + 7, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        u((char) TextUtils.indexOf("", ""), Process.getGidForName("") + 1413, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41, objArr4);
        throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
    }

    final o.en.b b(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21933t + 43;
        f21930q = i3 % 128;
        if (i3 % 2 == 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            u((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, View.resolveSize(0, 0) + 20, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44088), ExpandableListView.getPackedPositionChild(0L) + 1091, 49 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i4 = f21930q + 51;
            f21933t = i4 % 128;
            int i5 = i4 % 2;
        }
        o.m.c.d().d(context, this.f21937d);
        return this.f21937d;
    }

    public final void b(Context context, a.c cVar, WalletLockReason walletLockReason) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21933t + 115;
        f21930q = i3 % 128;
        if (i3 % 2 == 0) {
            f.a();
            throw null;
        }
        if (!(!f.a())) {
            Object[] objArr = new Object[1];
            u((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, 19 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u((char) TextUtils.getOffsetAfter("", 0), TextUtils.getOffsetBefore("", 0) + 1395, 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (this.f21937d.s()) {
            new o.bm.a(context, cVar, this.f21937d).b(walletLockReason);
            int i4 = f21930q + 101;
            f21933t = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr3 = new Object[1];
        u((char) (57107 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 1407, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        u((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1411, Color.green(0) + 42, objArr4);
        throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.content.Context r12, o.bi.a.d r13) throws java.lang.Throwable {
        /*
            r11 = this;
            r10 = 2
            int r0 = r10 % r10
            int r0 = o.c.a.f21930q
            int r1 = r0 + 83
            int r0 = r1 % 128
            o.c.a.f21933t = r0
            int r1 = r1 % r10
            r5 = 1
            r9 = 0
            if (r1 == 0) goto L26
            boolean r1 = o.ea.f.a()
            r0 = 9
            int r0 = r0 / r9
            if (r1 == r5) goto L2d
        L19:
            o.bi.a r1 = new o.bi.a
            o.en.b r0 = r11.f21937d
            r1.<init>(r12, r13, r0)
            o.bi.d r0 = o.bi.d.f21256d
            r1.a(r0)
            return
        L26:
            boolean r0 = o.ea.f.a()
            if (r0 == r5) goto L2d
            goto L19
        L2d:
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            int r0 = r0 + (-1)
            char r3 = (char) r0
            float r0 = android.util.TypedValue.complexToFloat(r9)
            r8 = 0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            int r2 = 22 - r0
            int r0 = android.graphics.Color.alpha(r9)
            int r1 = r0 + 20
            java.lang.Object[] r0 = new java.lang.Object[r5]
            u(r3, r2, r1, r0)
            r0 = r0[r9]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.intern()
            long r6 = android.os.SystemClock.currentThreadTimeMillis()
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            int r0 = 18372 - r0
            char r3 = (char) r0
            float r0 = android.media.AudioTrack.getMinVolume()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            int r2 = r0 + 1767
            int r0 = android.view.ViewConfiguration.getPressedStateDuration()
            int r0 = r0 >> 16
            int r1 = r0 + 6
            java.lang.Object[] r0 = new java.lang.Object[r5]
            u(r3, r2, r1, r0)
            r0 = r0[r9]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r4, r0)
            int r0 = o.c.a.f21933t
            int r1 = r0 + 71
            int r0 = r1 % 128
            o.c.a.f21930q = r0
            int r1 = r1 % r10
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c.a.e(android.content.Context, o.bi.a$d):void");
    }

    public final void e(Context context, e eVar, o.c.b bVar, o.i.d dVar, o.h.d dVar2) {
        synchronized (f21916a) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                u((char) View.MeasureSpec.makeMeasureSpec(0, 0), 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 20 - View.resolveSize(0, 0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                u((char) TextUtils.getTrimmedLength(""), 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7, objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            o.ea.e eVar2 = new o.ea.e(Looper.myLooper());
            g gVar = new g(context, eVar, e(context, eVar, eVar2), bVar, dVar, dVar2, eVar2);
            if (f21918e) {
                if (f.a()) {
                    Object[] objArr3 = new Object[1];
                    u((char) View.getDefaultSize(0, 0), (Process.myPid() >> 22) + 22, (ViewConfiguration.getWindowTouchSlop() >> 8) + 20, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    u((char) (21597 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 49, 29 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
                    f.c(strIntern2, ((String) objArr4[0]).intern());
                }
                Object[] objArr5 = {gVar};
                int iActiveCount = Thread.activeCount();
                int i2 = g.f22001e * 1064173618;
                g.f22001e = i2;
                if (((Boolean) g.d(iActiveCount, objArr5, new Random().nextInt(), (int) Runtime.getRuntime().totalMemory(), -218606638, i2, 218606638)).booleanValue()) {
                    if (f.a()) {
                        Object[] objArr6 = new Object[1];
                        u((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 22 - Color.green(0), 20 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr6);
                        String strIntern3 = ((String) objArr6[0]).intern();
                        Object[] objArr7 = new Object[1];
                        u((char) (10908 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 78 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 54 - Color.red(0), objArr7);
                        f.c(strIntern3, ((String) objArr7[0]).intern());
                    }
                    f21917c.add(new b(this, gVar));
                } else {
                    if (f.a()) {
                        Object[] objArr8 = new Object[1];
                        u((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getEdgeSlop() >> 16) + 22, 20 - Color.red(0), objArr8);
                        String strIntern4 = ((String) objArr8[0]).intern();
                        Object[] objArr9 = new Object[1];
                        u((char) (ExpandableListView.getPackedPositionChild(0L) + 19455), Process.getGidForName("") + 133, 56 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr9);
                        f.c(strIntern4, ((String) objArr9[0]).intern());
                    }
                    f21929p.add(new b(this, gVar));
                }
            } else {
                int iNextInt = new Random().nextInt(2090606680);
                int iNextInt2 = new Random().nextInt(1965067082);
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i3 = f21920g * 93609594;
                f21920g = i3;
                o.bg.c cVar = (o.bg.c) e(new Object[]{this, gVar}, -1835013151, i3, iNextInt, iNextInt2, 1835013151, iUptimeMillis);
                if (cVar != null) {
                    int i4 = o.bg.c.f21082a * 1232037242;
                    o.bg.c.f21082a = i4;
                    int iMyUid = Process.myUid();
                    int i5 = o.bg.c.f21083c * 1942342535;
                    o.bg.c.f21083c = i5;
                    if (((Boolean) o.bg.c.a(i4, i5, iMyUid, -1017985026, new Object[]{cVar}, 1017985027, new Random().nextInt())).booleanValue()) {
                        eVar.a(b(context), cVar, null);
                    } else {
                        eVar.e(cVar);
                    }
                }
            }
        }
    }
}
