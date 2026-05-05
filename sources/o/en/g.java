package o.en;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class g {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f24209a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f24210b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f24211c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f24212d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f24213e = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f24214j = 0;

    private static String $$c(byte b2, int i2, byte b3) {
        byte[] bArr = $$a;
        int i3 = (b2 * 4) + 116;
        int i4 = 4 - (b3 * 4);
        int i5 = i2 * 2;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + i5;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = i4;
            i3 += bArr[i4];
            i4 = i7 + 1;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24211c = 0;
        f24214j = 1;
        f24212d = 0;
        f24210b = 1;
        b();
        f24209a = 0L;
        int i2 = f24214j + 11;
        f24211c = i2 % 128;
        int i3 = i2 % 2;
    }

    private static long a(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24212d;
        int i4 = i3 + 105;
        f24210b = i4 % 128;
        int i5 = i4 % 2;
        if (f24209a == 0) {
            int i6 = i3 + 35;
            f24210b = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            f(C1593ug.zd("K؝؞NOPQRSTئVWXYZ[\\خد_`aسcdeطgعijklؾnoفqrstنvwىي", (short) (ZN.Xd() ^ 3152), (short) (ZN.Xd() ^ 25855)), new int[]{132, 47, 14, 0}, true, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Class<?> cls = Class.forName(C1561oA.od("0<1>:3-u*538(05m\u0002-+0 2-", (short) (FB.Xd() ^ 10616)));
            Class<?>[] clsArr = {Class.forName(C1561oA.Kd("g_ua/ndrl4Z|{sys", (short) (C1633zX.Xd() ^ (-27159)))), Integer.TYPE};
            Object[] objArr2 = {strIntern, 0};
            short sXd = (short) (C1607wl.Xd() ^ 13281);
            short sXd2 = (short) (C1607wl.Xd() ^ 17651);
            int[] iArr = new int["kclDJ=G44\u00195!\u0013\f\u0012}\tvry".length()];
            QB qb = new QB("kclDJ=G44\u00195!\u0013\f\u0012}\tvry");
            int i8 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i8] = xuXd.fK(((i8 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i8++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i8), clsArr);
            try {
                method.setAccessible(true);
                SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
                Object[] objArr3 = new Object[1];
                f(C1561oA.Xd("*+,-./", (short) (C1607wl.Xd() ^ 1829)), new int[]{179, 6, 69, 0}, true, objArr3);
                f24209a = sharedPreferences.getLong(((String) objArr3[0]).intern(), -1L);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return f24209a;
    }

    public static void a() {
        int i2 = 2 % 2;
        int i3 = f24212d + 37;
        int i4 = i3 % 128;
        f24210b = i4;
        int i5 = i3 % 2;
        f24209a = 0L;
        int i6 = i4 + 125;
        f24212d = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        f24213e = new char[]{56524, 56362, 56375, 56374, 56370, 56370, 56354, 56344, 56368, 56370, 56351, 56349, 56365, 56365, 56362, 56364, 56369, 56464, 56493, 56493, 56514, 56548, 56551, 56551, 56551, 56558, 56561, 56558, 56519, 56519, 56553, 56549, 56547, 56513, 56521, 56554, 56548, 56516, 56514, 56556, 56554, 56530, 56498, 56522, 56556, 56556, 56560, 56561, 56548, 56505, 56523, 56558, 56553, 56519, 56496, 56496, 56486, 56486, 56514, 56556, 56554, 56530, 56540, 56556, 56556, 56560, 56561, 56548, 56547, 56563, 56556, 56548, 56553, 56560, 56561, 56541, 56378, 56381, 56381, 56381, 56388, 56391, 56388, 56349, 56349, 56383, 56379, 56377, 56343, 56354, 56388, 56376, 56377, 56385, 56389, 56380, 56342, 56351, 56384, 56378, 56346, 56344, 56386, 56384, 56360, 56328, 56352, 56386, 56386, 56390, 56391, 56378, 56335, 56572, 56572, 56344, 56386, 56384, 56360, 56370, 56386, 56386, 56390, 56391, 56378, 56377, 56393, 56386, 56378, 56383, 56390, 56391, 56512, 56570, 56562, 56566, 56567, 56569, 56569, 56563, 56563, 56569, 56575, 56565, 56559, 56562, 56569, 56567, 56562, 56571, 56567, 56570, 56323, 56567, 56567, 56568, 56563, 56568, 56566, 56562, 56563, 56570, 56573, 56571, 56566, 56570, 56575, 56565, 56533, 56541, 56573, 56571, 56566, 56570, 56575, 56565, 56533, 56542, 56570, 56532, 56368, 56341, 56338, 56365, 56368};
    }

    private static void d(Context context, long j2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24210b + 31;
        f24212d = i3 % 128;
        int i4 = i3 % 2;
        f24209a = j2;
        Object[] objArr = new Object[1];
        f(Wg.vd("eӜӟfa`cb]\\ӗ^YX[ZutӯӮqpsӪmloӦiӠkj\u0006\u0005ӿ\u0007\u0002Ӹ\u0004\u0003}|ӷ~yӰӳ", (short) (OY.Xd() ^ 31578)), new int[]{132, 47, 14, 0}, true, objArr);
        String strIntern = ((String) objArr[0]).intern();
        short sXd = (short) (C1633zX.Xd() ^ (-27919));
        short sXd2 = (short) (C1633zX.Xd() ^ (-7041));
        int[] iArr = new int["JVKXTMG\u0010DOMRBJO\b\u001cGEJ:LG".length()];
        QB qb = new QB("JVKXTMG\u0010DOMRBJO\b\u001cGEJ:LG");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(((sXd + i5) + xuXd.CK(iKK)) - sXd2);
            i5++;
        }
        Object[] objArr2 = {strIntern, 0};
        Method method = Class.forName(new String(iArr, 0, i5)).getMethod(C1561oA.ud("UR`>RJZLJ5VHHFRDL@AN", (short) (OY.Xd() ^ 30791)), Class.forName(hg.Vd("\u0003x\rvB\u007fs\u007fw=a\u0002~txp", (short) (C1607wl.Xd() ^ 29398), (short) (C1607wl.Xd() ^ 27390))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr2)).edit();
            Object[] objArr3 = new Object[1];
            f(C1561oA.yd("\\[ZY`_", (short) (C1633zX.Xd() ^ (-960))), new int[]{179, 6, 69, 0}, true, objArr3);
            editorEdit.putLong(((String) objArr3[0]).intern(), j2).commit();
            int i6 = f24210b + 21;
            f24212d = i6 % 128;
            int i7 = i6 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean e(Context context, long j2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24210b;
        int i4 = i3 + 99;
        f24212d = i4 % 128;
        int i5 = i4 % 2;
        if (j2 == -1) {
            int i6 = i3 + 43;
            f24212d = i6 % 128;
            return i6 % 2 != 0;
        }
        if (j2 != a(context)) {
            d(context, j2);
            Date date = new Date(j2 * 1000);
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                f("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{0, 17, 70, 0}, false, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                f("\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{17, 58, 0, 0}, true, objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(date).toString());
            }
            return true;
        }
        if (o.ea.f.a()) {
            Object[] objArr3 = new Object[1];
            f("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{0, 17, 70, 0}, false, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            f("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{75, 57, 86, 0}, true, objArr4);
            o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
        }
        int i7 = f24210b + 115;
        f24212d = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 64 / 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6 A[PHI: r10
  0x00d6: PHI (r10v12 char) = (r10v0 char), (r10v16 char) binds: [B:34:0x0139, B:27:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(java.lang.String r24, int[] r25, boolean r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.g.f(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{49, -6, 40, 32};
        $$b = 15;
    }
}
