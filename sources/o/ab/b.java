package o.ab;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import yg.C1580rY;
import yg.FB;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f20071a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f20072b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f20073c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f20074d = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f20075h = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f20076e;

    static {
        int i2 = f20075h + 121;
        f20071a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public b() throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-12609));
        int[] iArr = new int["A7O9\tOQEK\fDOQEZVYKW\\\u0019/eQRce_ee".length()];
        QB qb = new QB("A7O9\tOQEK\fDOQEZVYKW\\\u0019/eQRce_ee");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (FB.Xd() ^ 2586);
        short sXd3 = (short) (FB.Xd() ^ 27072);
        int[] iArr2 = new int["zp\u0002\\qumqiWjse`bBt`]nlfh".length()];
        QB qb2 = new QB("zp\u0002\\qumqiWjse`bBt`]nlfh");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            this.f20076e = (ExecutorService) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static b e() {
        int i2 = 2 % 2;
        int i3 = f20074d;
        int i4 = (((i3 + 69) - (69 & i3)) << 1) - (i3 ^ 69);
        int i5 = i4 % 128;
        f20073c = i5;
        int i6 = i4 % 2;
        b bVar = f20072b;
        int i7 = (i5 ^ 27) + ((i5 & 27) << 1);
        f20074d = i7 % 128;
        if (i7 % 2 != 0) {
            return bVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void e(c<?> cVar) {
        int i2 = 2 % 2;
        int i3 = f20073c + 73;
        f20074d = i3 % 128;
        if (i3 % 2 != 0) {
            this.f20076e.execute(cVar);
        } else {
            this.f20076e.execute(cVar);
            int i4 = 41 / 0;
        }
    }
}
