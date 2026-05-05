package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.DateTimeUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class ju {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f1034a;

    public ju(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Kd("IVV]Oc`", (short) (C1580rY.Xd() ^ (-30260))));
        Object[] objArr = {Wg.Zd("u6x\u0016<\u0014GQ\u0010\u0002lA\u0001)=.N\tv\u001cwl0w\u0012J\u000bi\u001c_T(k\u0005<\u0013ZQOJ\u0014o\u0007.\u00132SxN/", (short) (FB.Xd() ^ 14456), (short) (FB.Xd() ^ 7325)), 0};
        Method method = Class.forName(C1561oA.Xd("&4+:83/y0==D6@G\u0002\u0018EEL>RO", (short) (FB.Xd() ^ 1373))).getMethod(Qg.kd("\u001b\u0018&\u0004\u0018\u0010 \u0012\u0010z\u001c\u000e\u000e\f\u0018\n\u0012\u0006\u0007\u0014", (short) (C1607wl.Xd() ^ 29343), (short) (C1607wl.Xd() ^ 7493)), Class.forName(Wg.vd("c[q]+j`nX Fhg_e_", (short) (ZN.Xd() ^ 2407))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            short sXd = (short) (OY.Xd() ^ 22224);
            short sXd2 = (short) (OY.Xd() ^ 27364);
            int[] iArr = new int["\u001c'%*\u001a,'_\u0018\u0015#\u0001\u0015\r\u001d\u000f\rw\u0019\u000b\u000b\t\u0015\u0007埊kcI<^\n\b\r|\u000f\nB`aUUn^_UaK]M0".length()];
            QB qb = new QB("\u001c'%*\u001a,'_\u0018\u0015#\u0001\u0015\r\u001d\u000f\rw\u0019\u000b\u000b\t\u0015\u0007埊kcI<^\n\b\r|\u000f\nB`aUUn^_UaK]M0");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, new String(iArr, 0, i2));
            this.f1034a = sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final long a(b90 target) {
        Intrinsics.checkNotNullParameter(target, "target");
        String str = "uri-" + target.f253a.hashCode();
        long j2 = this.f1034a.getLong(str, 0L);
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.f1034a.edit().putLong(str, jNowInMilliseconds).apply();
        return Math.min(jNowInMilliseconds - j2, 7200000L);
    }

    public final long b(b90 target) {
        Intrinsics.checkNotNullParameter(target, "target");
        String str = "uri-at-" + target.f253a.hashCode();
        long j2 = this.f1034a.getLong(str, 1L);
        this.f1034a.edit().putLong(str, 1 + j2).apply();
        return j2;
    }

    public final void c(b90 target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f1034a.edit().putLong("uri-at-" + target.f253a.hashCode(), 1L).apply();
    }
}
