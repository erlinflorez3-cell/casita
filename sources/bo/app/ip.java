package bo.app;

import android.content.Context;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public final class ip {
    public final void a(Context context) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-31951));
        int[] iArr = new int["7BDI5GF".length()];
        QB qb = new QB("7BDI5GF");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u000b\u0016\u0014\u0019\t\u0011\u0016Nb\u000e\f\u0011\u0001\u0013\u000e", (short) (C1499aX.Xd() ^ (-10329)), (short) (C1499aX.Xd() ^ (-20315)))).getMethod(yg.hg.Vd("XUc1NOSO-QY", (short) (Od.Xd() ^ (-1648)), (short) (Od.Xd() ^ (-3510))), new Class[0]);
            try {
                method.setAccessible(true);
                File file = new File((File) method.invoke(context, objArr), C1561oA.ud("\u001b)(\u0019%.a\u001c\u001f\u0012\u0017\u0014\u001a\u001c\r\u000f\u000f\u001bU\u0013\u0018\u001aQ\u0006\u0003\u0004\b\u0004", (short) (FB.Xd() ^ 16150)));
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new gp(file), 6, (Object) null);
                BrazeFileUtils.deleteFileOrDirectory(file);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) hp.f842a, 4, (Object) null);
        }
    }
}
