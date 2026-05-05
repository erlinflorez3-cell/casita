package k;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class tongue extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Application f19828a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tongue(Application application) {
        super(0);
        this.f19828a = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        Intent intent = new Intent(ZO.xd("Jk]\u0014mvE\u0010=f\u0003c\u0003C\u000e\u0004*\u0018\tmd{\u0003%T\u00193h*.\fN)~@N\f\u0019C", (short) (C1580rY.Xd() ^ (-26011)), (short) (C1580rY.Xd() ^ (-19043))));
        Application application = this.f19828a;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud(";c/\u001eEQD>O\u0016\u001a`B9iRI/B9~CY", (short) (Od.Xd() ^ (-27949)), (short) (Od.Xd() ^ (-28316)))).getMethod(Ig.wd("C\u00154.F\u000bt1\f\u0010s,\u0006x\r/\u0003", (short) (C1607wl.Xd() ^ 15313)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(application, objArr);
            if (Build.VERSION.SDK_INT < 33) {
                Class<?> cls = Class.forName(C1561oA.Kd("\"0'64/+u,99@2<C}A?\u0001$69B9@?(=K?FES", (short) (C1499aX.Xd() ^ (-30573))));
                Class<?>[] clsArr = {Class.forName(Wg.Zd(":?\u0019\u0006fO}3K7\u0019^3+\u0001)(\ruF2$", (short) (C1499aX.Xd() ^ (-2395)), (short) (C1499aX.Xd() ^ (-30191)))), Integer.TYPE};
                Object[] objArr2 = {intent, 0};
                short sXd = (short) (FB.Xd() ^ 12384);
                int[] iArr = new int["\u0005\nz\t\u0011Z\f\n|\u0001\u0001\u007f\u0013\u0015s\b\u0007\n\u000f\u001d\r\u001b\u001d".length()];
                QB qb = new QB("\u0005\nz\t\u0011Z\f\n|\u0001\u0001\u007f\u0013\u0015s\b\u0007\n\u000f\u001d\r\u001b\u001d");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    return (List) method2.invoke(packageManager, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            PackageManager.ResolveInfoFlags resolveInfoFlagsOf = PackageManager.ResolveInfoFlags.of(0L);
            Class<?> cls2 = Class.forName(EO.Od("|?%\u0012\u0019G\\X4CF$?PH^]va:a>VJfnvS\u0005(H`\u0018", (short) (ZN.Xd() ^ 31574)));
            Class<?>[] clsArr2 = new Class[2];
            clsArr2[0] = Class.forName(C1561oA.Qd("\u007f\f\u0001\u000e\n\u0003|Ey\u0005\u0003\bw\u007f\u0005=W{\u0001px}", (short) (C1633zX.Xd() ^ (-19601))));
            short sXd2 = (short) (ZN.Xd() ^ 18226);
            short sXd3 = (short) (ZN.Xd() ^ 11858);
            int[] iArr2 = new int["\\japnie0fsszlv}8{y;^ps|szybw\u0006y\u0001\u007f\u000e@o\u0004\u0013\u0010\u000e\u0019\tm\u0014\r\u0017n\u0016\f\u0013 ".length()];
            QB qb2 = new QB("\\japnie0fsszlv}8{y;^ps|szybw\u0006y\u0001\u007f\u000e@o\u0004\u0013\u0010\u000e\u0019\tm\u0014\r\u0017n\u0016\f\u0013 ");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                i3++;
            }
            clsArr2[1] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr3 = {intent, resolveInfoFlagsOf};
            short sXd4 = (short) (Od.Xd() ^ (-32610));
            int[] iArr3 = new int["\b\u000by\u0006\fS\u0003~oqol}}Zlijmygss".length()];
            QB qb3 = new QB("\b\u000by\u0006\fS\u0003~oqol}}Zlijmygss");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                i4++;
            }
            Method method3 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
            try {
                method3.setAccessible(true);
                return (List) method3.invoke(packageManager, objArr3);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
