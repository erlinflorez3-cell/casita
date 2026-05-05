package d1;

import android.app.Application;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public final class taste extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ misplace f18439a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taste(misplace misplaceVar) {
        super(0);
        this.f18439a = misplaceVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        Application application = this.f18439a.f18434a;
        short sXd = (short) (C1607wl.Xd() ^ 25758);
        short sXd2 = (short) (C1607wl.Xd() ^ 19455);
        int[] iArr = new int["ydpzb\u0003)?e\u0016\"6Q5mN1AwS\u0019;Pv".length()];
        QB qb = new QB("ydpzb\u0003)?e\u0016\"6Q5mN1AwS\u0019;Pv");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2), 0};
        Method method = Class.forName(Ig.wd("\u001bUy+xF1*\u0015\u0011\u0012u\u0018'E`!_\u0016o&pZ", (short) (C1580rY.Xd() ^ (-31429)))).getMethod(C1561oA.Qd("+(6\u0014( 0\" \u000b,\u001e\u001e\u001c(\u001a\"\u0016\u0017$", (short) (C1499aX.Xd() ^ (-22918))), Class.forName(EO.Od("\u007fM2z`tC\"b:c\u001dfel\u0001", (short) (C1633zX.Xd() ^ (-30651)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return (SharedPreferences) method.invoke(application, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
