package w;

import android.app.Application;
import b0.taste;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Unit;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public final class apparatus {

    /* JADX INFO: renamed from: a */
    public final pair f28365a;

    /* JADX INFO: renamed from: b */
    public final superior f28366b;

    /* JADX INFO: renamed from: c */
    public final taste f28367c;

    /* JADX INFO: renamed from: d */
    public final y.superior f28368d;

    /* JADX INFO: renamed from: e */
    public tongue f28369e;

    public apparatus(Application application, taste tasteVar, y.superior superiorVar) {
        pair pairVar = new pair(application);
        superior superiorVar2 = new superior(application);
        this.f28365a = pairVar;
        this.f28366b = superiorVar2;
        this.f28367c = tasteVar;
        this.f28368d = superiorVar;
    }

    public final void a() throws Throwable {
        if (this.f28369e == null) {
            if (this.f28367c == null && this.f28368d == null) {
                return;
            }
            tongue tongueVar = new tongue(this);
            this.f28369e = tongueVar;
            pair pairVar = this.f28365a;
            pairVar.getClass();
            Application application = pairVar.f28371a;
            Class<?> cls = Class.forName(C1626yg.Ud("nn\r@\u0013\u0019w\u00068/&\u000b\u000f\u007f[\u000e;7k7(\u0013;", (short) (C1580rY.Xd() ^ (-24123)), (short) (C1580rY.Xd() ^ (-6848))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1580rY.Xd() ^ (-8919));
            int[] iArr = new int["\u0018t|.{){=2PV.\u0017H\u001c5\u0006uKr)\u000b\u001cU4&\u00199<\u0001cFx{N\u001br`-@1fZ[\u0005jFoua".length()];
            QB qb = new QB("\u0018t|.{){=2PV.\u0017H\u001c5\u0006uKr)\u000b\u001cU4&\u00199<\u0001cFx{N\u001br`-@1fZ[\u0005jFoua");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {tongueVar};
            Method method = cls.getMethod(EO.Od("&aw\u001c\u007f=\f\u0004\rM^s/.P3KN#N\be1>\u000388\u0015ZB\u0011rR@", (short) (C1633zX.Xd() ^ (-21006))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(application, objArr);
                Unit unit = Unit.INSTANCE;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
