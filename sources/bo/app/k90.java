package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public final class k90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferences f1092d;

    public k90(Context context, String str, String str2) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 8664);
        int[] iArr = new int["|\b\u0006\u000bz\r\b".length()];
        QB qb = new QB("|\b\u0006\u000bz\r\b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        this.f1089a = context;
        this.f1090b = str;
        this.f1091c = str2;
        Object[] objArr = {C1561oA.yd("2=>}-<.F<\u0004LLBD6;$k4$&\u0019\u001e1;.(+$%-)", (short) (C1633zX.Xd() ^ (-30882))) + StringUtils.getCacheFileSuffix(context, str, str2), 0};
        Method method = Class.forName(C1561oA.Yd("\"0'64/+u,99@2<C}\u0014AAH:NK", (short) (C1633zX.Xd() ^ (-24392)))).getMethod(Jg.Wd("]`9\u001d$b|d%\u00162jlr91<fq\u0005", (short) (FB.Xd() ^ 17198), (short) (FB.Xd() ^ 27142)), Class.forName(Xg.qd("G?UA\u000fNDRL\u0014:\\[SYS", (short) (OY.Xd() ^ 14837), (short) (OY.Xd() ^ 24632))), Integer.TYPE);
        try {
            method.setAccessible(true);
            this.f1092d = (SharedPreferences) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void a(String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new j90(str), 6, (Object) null);
        this.f1092d.edit().putString("auth_signature", str).apply();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k90)) {
            return false;
        }
        k90 k90Var = (k90) obj;
        return Intrinsics.areEqual(this.f1089a, k90Var.f1089a) && Intrinsics.areEqual(this.f1090b, k90Var.f1090b) && Intrinsics.areEqual(this.f1091c, k90Var.f1091c);
    }

    public final int hashCode() {
        int iHashCode = this.f1089a.hashCode() * 31;
        String str = this.f1090b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1091c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return h1.a(new StringBuilder("SdkAuthenticationCache(context=").append(this.f1089a).append(", userId=").append(this.f1090b).append(", apiKey="), this.f1091c, ')');
    }
}
