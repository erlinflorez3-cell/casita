package i1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import yg.C1561oA;
import yg.C1626yg;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class civilian extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final civilian f19713a = new civilian();

    public civilian() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Class<?> cls = Class.forName(C1626yg.Ud("\u001c/7HlU.\u0010\u00144\u0005Q\\\n<+\b\u0016\u001c", (short) (OY.Xd() ^ 13312), (short) (OY.Xd() ^ 16344)));
        Class<?>[] clsArr = {Class.forName(Ig.wd("T\u0007LQ|\u0006h4\nb\fM\u0018\u0007\u0012'", (short) (ZN.Xd() ^ 5119))), Integer.TYPE};
        Object[] objArr = {(String) obj, 0};
        short sXd = (short) (OY.Xd() ^ 8491);
        int[] iArr = new int["6pP<Y ".length()];
        QB qb = new QB("6pP<Y ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (byte[]) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
