package j;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class apparatus extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Application f19785a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apparatus(Application application) {
        super(0);
        this.f19785a = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        List list;
        if (Build.VERSION.SDK_INT >= 33) {
            Application application = this.f19785a;
            Class<?> cls = Class.forName(Qg.kd("|\t}\u000b\u0007\u007fyBv\u0002\u007f\u0005t|\u0002:Nyw|l~y", (short) (C1607wl.Xd() ^ 13943), (short) (C1607wl.Xd() ^ 2437)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-16477));
            short sXd2 = (short) (Od.Xd() ^ (-9253));
            int[] iArr = new int["jguP`ah]b_FYeW\\Ye".length()];
            QB qb = new QB("jguP`ah]b_FYeW\\Ye");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(application, objArr);
                Object[] objArr2 = {PackageManager.PackageInfoFlags.of(0L)};
                Method method2 = Class.forName(C1561oA.ud("dpernga*^igl\\di\"c_\u001f@PQXMRO6IUGLIU", (short) (C1499aX.Xd() ^ (-5381)))).getMethod(C1561oA.Yd("ML\\2X^`NZ[UUBTW`W^]l", (short) (ZN.Xd() ^ 18215)), Class.forName(C1561oA.yd("[i\\ke`X#ernucmp+zx6Ygjofyx]r|psr\r?hzy\u0003u|\bl\u000f\b\u000ee\t~\u0012\u001f", (short) (Od.Xd() ^ (-13037)))));
                try {
                    method2.setAccessible(true);
                    list = (List) method2.invoke(packageManager, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } else {
            Application application2 = this.f19785a;
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(Xg.qd("[i`omhd/erryku|7Mzz\u0002s\b\u0005", (short) (C1607wl.Xd() ^ 25104), (short) (C1607wl.Xd() ^ 30641))).getMethod(Jg.Wd("@1z}\tFdd\u0006:\u001d[\u001f\r-r\u001a", (short) (FB.Xd() ^ 3622), (short) (FB.Xd() ^ 15813)), new Class[0]);
            try {
                method3.setAccessible(true);
                PackageManager packageManager2 = (PackageManager) method3.invoke(application2, objArr3);
                Object[] objArr4 = {0};
                Method method4 = Class.forName(ZO.xd("\u0013ga\u00060_P%\n\u000f`\u00019e\u000eLr,R\u0006f*[E]CW.[Yi|]", (short) (C1607wl.Xd() ^ 10593), (short) (C1607wl.Xd() ^ 24660))).getMethod(C1626yg.Ud(")CFr}D#}=H{/a\\~EDhsd", (short) (C1580rY.Xd() ^ (-25894)), (short) (C1580rY.Xd() ^ (-14771))), Integer.TYPE);
                try {
                    method4.setAccessible(true);
                    list = (List) method4.invoke(packageManager2, objArr4);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PackageInfo) it.next()).packageName);
        }
        return arrayList;
    }
}
