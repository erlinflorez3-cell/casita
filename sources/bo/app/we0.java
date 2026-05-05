package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.Jg;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public abstract class we0 implements g10 {

    /* JADX INFO: renamed from: d */
    public static final String f2138d = BrazeLogger.getBrazeLogTag((Class<?>) we0.class);

    /* JADX INFO: renamed from: a */
    public final long f2139a;

    /* JADX INFO: renamed from: b */
    public final long f2140b;

    /* JADX INFO: renamed from: c */
    public final e00 f2141c;

    public we0() {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.f2140b = jNowInMilliseconds;
        this.f2139a = jNowInMilliseconds / 1000;
    }

    public we0(e00 e00Var) {
        this();
        this.f2141c = e00Var;
    }

    public static String a(String str) throws Throwable {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(C1561oA.ud("iujwslf/usgi*=[l]-*", (short) (ZN.Xd() ^ 26294)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.yd("JBXD\u0012QGUO\u0017=_^V\\V", (short) (C1633zX.Xd() ^ (-9061))));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str, 0};
            short sXd = (short) (C1633zX.Xd() ^ (-3875));
            int[] iArr = new int[".0/<24".length()];
            QB qb = new QB(".0/<24");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                return new String((byte[]) declaredMethod.invoke(null, objArr)).split(Xg.qd("L", (short) (C1633zX.Xd() ^ (-4731)), (short) (C1633zX.Xd() ^ (-7536))))[0];
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            BrazeLogger.e(f2138d, Jg.Wd("\u000b3T]!E}V\u0001nvr*x0\u001b\u0004VAvN2q|pYF[\u0019\u0019e\u000bp\u0005xe<_[\"X\u000bR\u0016\u0005DG+ln\u0003\u0014\u001a", (short) (C1607wl.Xd() ^ 15375), (short) (C1607wl.Xd() ^ 7921)) + str, e3);
            return null;
        }
    }
}
