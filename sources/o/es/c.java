package o.es;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o.a.g;
import o.ea.f;
import o.ea.h;
import o.ea.j;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public interface c<Response> {

    public interface a<T> {
        void a(T t2);

        void d(o.by.c cVar);
    }

    /* JADX INFO: renamed from: o.es.c$c */
    public interface InterfaceC0350c {
        void c(String str);

        void d(o.by.c cVar);
    }

    public static final class e extends Enum<e> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static char f25297a = 0;

        /* JADX INFO: renamed from: b */
        public static final e f25298b;

        /* JADX INFO: renamed from: c */
        public static final e f25299c;

        /* JADX INFO: renamed from: d */
        public static final e f25300d;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ e[] f25301e;

        /* JADX INFO: renamed from: f */
        private static char f25302f = 0;

        /* JADX INFO: renamed from: g */
        private static char f25303g = 0;

        /* JADX INFO: renamed from: h */
        private static int f25304h = 0;

        /* JADX INFO: renamed from: i */
        private static int f25305i = 0;

        /* JADX INFO: renamed from: j */
        private static char f25306j = 0;

        /* JADX INFO: renamed from: k */
        private static int f25307k = 0;

        /* JADX INFO: renamed from: m */
        private static int f25308m = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r8, int r9, int r10) {
            /*
                int r7 = r10 * 2
                int r1 = r7 + 1
                byte[] r6 = o.es.c.e.$$a
                int r0 = r8 * 4
                int r5 = 4 - r0
                int r0 = r9 * 3
                int r2 = r0 + 69
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r6 != 0) goto L29
                r2 = r5
                r0 = r7
                r1 = r3
            L16:
                int r5 = r5 + 1
                int r2 = r2 + r0
            L19:
                byte r0 = (byte) r2
                r4[r1] = r0
                if (r1 != r7) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L24:
                r0 = r6[r5]
                int r1 = r1 + 1
                goto L16
            L29:
                r1 = r3
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.es.c.e.$$c(int, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f25308m = 0;
            f25307k = 1;
            f25304h = 0;
            f25305i = 1;
            b();
            Object[] objArr = new Object[1];
            l("\uddb3\ue352╰릚\udf89櫎", 5 - ImageFormat.getBitsPerPixel(0), objArr);
            f25300d = new e(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            l("ꎮ槳\ufbc5ןꌊ璾ู쉽\u2fde졞陮챙犠쟮", Color.rgb(0, 0, 0) + 16777229, objArr2);
            f25299c = new e(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            l("ꎮ槳竏ㆠᾛ쎙ꡭ\uddfb鬒ꮘ忒ᖹ\u2008\uf04cᶂ嘓ᕜෑჶ敶", Color.argb(0, 0, 0, 0) + 20, objArr3);
            f25298b = new e(((String) objArr3[0]).intern(), 2);
            f25301e = a();
            int i2 = f25307k + 23;
            f25308m = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        private e(String str, int i2) {
            super(str, i2);
        }

        private static /* synthetic */ e[] a() {
            e[] eVarArr;
            int i2 = 2 % 2;
            int i3 = f25305i + 65;
            int i4 = i3 % 128;
            f25304h = i4;
            if (i3 % 2 != 0) {
                eVarArr = new e[4];
                eVarArr[1] = f25300d;
                eVarArr[0] = f25299c;
                eVarArr[2] = f25298b;
            } else {
                eVarArr = new e[]{f25300d, f25299c, f25298b};
            }
            int i5 = i4 + 77;
            f25305i = i5 % 128;
            int i6 = i5 % 2;
            return eVarArr;
        }

        static void b() {
            f25297a = (char) 3896;
            f25306j = (char) 1400;
            f25302f = (char) 6979;
            f25303g = (char) 48775;
        }

        static void init$0() {
            $$a = new byte[]{113, 60, -124, 107};
            $$b = 181;
        }

        private static void l(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            if (str2 != null) {
                int i4 = $11 + 63;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            char[] cArr = (char[]) charArray;
            g gVar = new g();
            char[] cArr2 = new char[cArr.length];
            gVar.f19924d = 0;
            char[] cArr3 = new char[2];
            while (gVar.f19924d < cArr.length) {
                int i6 = $10 + 57;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
                int i8 = 58224;
                for (int i9 = 0; i9 < 16; i9++) {
                    char c2 = cArr3[1];
                    char c3 = cArr3[0];
                    try {
                        Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i8) ^ ((c3 << 4) + ((char) (((long) f25302f) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f25303g)};
                        Object objA = o.d.d.a(1603517628);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(271 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 11 - (ViewConfiguration.getTouchSlop() >> 8), -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f25297a) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f25306j)};
                        Object objA2 = o.d.d.a(1603517628);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(270 - (ViewConfiguration.getTapTimeout() >> 16), (char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
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
                    objA3 = o.d.d.a(271 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) Color.red(0), View.resolveSizeAndState(0, 0, 0) + 11, -2074123590, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        public static e valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f25305i + 45;
            f25304h = i3 % 128;
            int i4 = i3 % 2;
            e eVar = (e) Enum.valueOf(e.class, str);
            int i5 = f25305i + 33;
            f25304h = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 87 / 0;
            }
            return eVar;
        }

        public static e[] values() {
            int i2 = 2 % 2;
            int i3 = f25304h + 13;
            f25305i = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            e[] eVarArr = (e[]) f25301e.clone();
            int i4 = f25305i + 55;
            f25304h = i4 % 128;
            if (i4 % 2 == 0) {
                return eVarArr;
            }
            obj.hashCode();
            throw null;
        }
    }

    void a(a<String> aVar);

    default o.es.e b(o.ef.a aVar) throws Throwable {
        d dVarValueOf;
        int i2 = 2 % 2;
        if (aVar.d("tokenState")) {
            try {
                int i3 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i3;
                dVarValueOf = d.valueOf((String) o.ef.a.a(-781664457, new Object[]{aVar, "tokenState"}, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i3, Thread.currentThread().getPriority()));
            } catch (IllegalArgumentException e2) {
                dVarValueOf = d.f25311c;
                if (f.a()) {
                    f.e("IDevicePayWallet", "init() - deserializeToken", e2);
                }
            }
        } else {
            dVarValueOf = d.f25311c;
        }
        return new o.es.e(aVar.p("tokenIdentifier"), aVar.n("addTimestamp"), aVar.p("panLastFour"), aVar.f("tokenServiceProvider"), dVarValueOf, aVar.h("isDefaultToken"));
    }

    void b(Activity activity);

    default void c(Context context, List<o.es.e> list, String str) throws Throwable {
        int i2 = 2 % 2;
        String strYd = C1561oA.Yd("!.j\u001f-4&.24r'5<.6:<514<:4E5GO6KA;MAA=ORFHHVJTJM\\", (short) (ZN.Xd() ^ 15762));
        Class<?> cls = Class.forName(Xg.qd("CQHWUPL\u0017MZZaS]d\u001f5bbi[ol", (short) (Od.Xd() ^ (-30719)), (short) (Od.Xd() ^ (-8512))));
        Class<?>[] clsArr = {Class.forName(Jg.Wd("7\u0001\u001cYUVa\u0011\u00192}q~\u00194o", (short) (Od.Xd() ^ (-31236)), (short) (Od.Xd() ^ (-17200)))), Integer.TYPE};
        Object[] objArr = {strYd, 0};
        short sXd = (short) (C1633zX.Xd() ^ (-24660));
        short sXd2 = (short) (C1633zX.Xd() ^ (-29561));
        int[] iArr = new int["W\u007fo7Su7k\u001c4e}F0ocw^O;".length()];
        QB qb = new QB("W\u007fo7Su7k\u001c4e}F0ocw^O;");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            ((SharedPreferences) method.invoke(context, objArr)).edit().remove(str).apply();
            list.clear();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    void c(a<List<o.es.e>> aVar);

    default String d(o.es.e eVar) throws o.ef.b {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        aVar.a("tokenIdentifier", (Object) eVar.c());
        aVar.a("addTimestamp", eVar.e());
        aVar.a("panLastFour", (Object) eVar.d());
        aVar.a("tokenServiceProvider", (Object) eVar.b());
        aVar.a("tokenState", (Object) eVar.a().toString());
        aVar.a("isDefaultToken", eVar.h());
        return aVar.e();
    }

    @Deprecated
    void d(Activity activity, a<Object> aVar, j jVar);

    void d(a<e> aVar);

    void e(Activity activity, InterfaceC0350c interfaceC0350c, j jVar, o.ep.d dVar, o.es.e eVar, Response response, h hVar);

    default void e(Context context, List<o.es.e> list, String str) throws Throwable {
        int i2 = 2 % 2;
        HashSet hashSet = new HashSet();
        Iterator<o.es.e> it = list.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(d(it.next()));
            } catch (o.ef.b e2) {
                if (f.a()) {
                    f.e(C1593ug.zd("\u001b\u00179K?:=);T3>JKEU", (short) (Od.Xd() ^ (-30444)), (short) (Od.Xd() ^ (-20939))), C1561oA.od("\u0006y\u0006\u0006z\u0004\u0004.:,`xjjsk%xr\"teqg^hdt^\u0018ke`Ya", (short) (ZN.Xd() ^ 12259)), e2);
                }
            }
        }
        Object[] objArr = {C1626yg.Ud("\u0017;Jgdds\u0005lW\u0011Rl1-T\u001d\"Vf_\u0006\"\u0016\u0006w^\u0010XC'|hSb]\b!]\f>m\rlI\t#", (short) (C1499aX.Xd() ^ (-26098)), (short) (C1499aX.Xd() ^ (-10249))), 0};
        Method method = Class.forName(Ig.wd("[\u0018yj6r\u0014{uPO9zwX1\u0002.Rb\u0019Mm", (short) (FB.Xd() ^ 3073))).getMethod(C1561oA.Qd("LIW5IAQCA,M??=I;C78E", (short) (ZN.Xd() ^ 28182)), Class.forName(EO.Od("B\t.7\u0017\u0012X`\b\u0001\"c\f\u0013\u0002\u001f", (short) (C1580rY.Xd() ^ (-14759)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            ((SharedPreferences) method.invoke(context, objArr)).edit().putStringSet(str, hashSet).commit();
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    void e(a<String> aVar);
}
