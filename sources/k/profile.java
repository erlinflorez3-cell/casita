package k;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yg.C1580rY;
import yg.C1607wl;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public final class profile implements j.superior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final proposal f19820b = new proposal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f19821a;

    public profile(Application application) {
        this.f19821a = application;
    }

    @Override // j.superior
    public final ArrayList a(ArrayList arrayList) throws Throwable {
        Application application = this.f19821a;
        Class<?> cls = Class.forName(Xg.qd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0013  '\u0019#*dz((/!52", (short) (C1580rY.Xd() ^ (-29437)), (short) (C1580rY.Xd() ^ (-6256))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 27494);
        short sXd2 = (short) (C1607wl.Xd() ^ 8547);
        int[] iArr = new int["\u0017\u007f~,!\u0011lP>\nad6\"".length()];
        QB qb = new QB("\u0017\u007f~,!\u0011lP>\nad6\"");
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
            String str = (String) method.invoke(application, objArr);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                e0.pair pairVar = (e0.pair) obj;
                List list = pairVar.f18463g;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (Intrinsics.areEqual(str2, str) && !Intrinsics.areEqual(str2, pairVar.f18457a)) {
                                arrayList2.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
            return arrayList2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
