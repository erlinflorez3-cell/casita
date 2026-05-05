package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v00 f2304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vb0 f2305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f2306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2307d;

    public yf(Context context, vw vwVar, vb0 vb0Var) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-28536));
        short sXd2 = (short) (C1580rY.Xd() ^ (-30312));
        int[] iArr = new int["\u001e\u0016RhQX{&w3Sca }.Wj".length()];
        QB qb = new QB("\u001e\u0016RhQX{&w3Sca }.Wj");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        short sXd3 = (short) (C1607wl.Xd() ^ 31410);
        int[] iArr2 = new int["\"\u000bI,x\bKe1kyN!.".length()];
        QB qb2 = new QB("\"\u000bI,x\bKe1kyN!.");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
            i3++;
        }
        Intrinsics.checkNotNullParameter(vwVar, new String(iArr2, 0, i3));
        Intrinsics.checkNotNullParameter(vb0Var, EO.Od("Ho-KU\u0017Ed\n07Qg\u0011\u000e-Xf\u000f\u0004>~[J\u001du`", (short) (ZN.Xd() ^ 29126)));
        this.f2304a = vwVar;
        this.f2305b = vb0Var;
        Object[] objArr = {C1561oA.Qd("&1.m .-\u001e*3f++%'\u0015\u001a\u0017^#\u0014! \u0015\u001a\u0018\u001cU\u0014\u000b\u0018\u0017\u0004\t\n\u000e\u0006|\u0010\u0001\u000e\r\u0002\u0007\u0005", (short) (C1499aX.Xd() ^ (-11076))), 0};
        Method method = Class.forName(C1593ug.zd("R`Wfd_[&\\iipbls.Dqqxj~{", (short) (FB.Xd() ^ 30386), (short) (FB.Xd() ^ 14136))).getMethod(C1561oA.Kd("~}\u000em\u0004}\u0010\u0004\u0004p\u0014\b\n\n\u0018\f\u0016\f\u000f\u001e", (short) (C1580rY.Xd() ^ (-2963))), Class.forName(C1561oA.od("C9M7\u0003@4@8}\"B?591", (short) (C1607wl.Xd() ^ 1533))), Integer.TYPE);
        try {
            method.setAccessible(true);
            this.f2306c = (SharedPreferences) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void a() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xf(jNowInSeconds), 7, (Object) null);
        this.f2306c.edit().putLong("messaging_session_timestamp", jNowInSeconds).apply();
        this.f2307d = false;
    }
}
