package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import io.sentry.ProfilingTraceData;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public final class i70 implements z00 {

    /* JADX INFO: renamed from: a */
    public final BrazeConfigurationProvider f881a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f882b;

    public i70(Context context, BrazeConfigurationProvider brazeConfigurationProvider) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 3445);
        int[] iArr = new int["\ndg\u0014\u0007n<".length()];
        QB qb = new QB("\ndg\u0014\u0007n<");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(brazeConfigurationProvider, C1561oA.Qd("?JH?A>KG5G;@>\u001f@<B4..:", (short) (C1607wl.Xd() ^ 8947)));
        this.f881a = brazeConfigurationProvider;
        Object[] objArr = {C1593ug.zd("\u0018%$e\u001b,\u001c6\"k/54*\"6*-0;=<,@6==", (short) (OY.Xd() ^ 9850), (short) (OY.Xd() ^ 15285)), 0};
        Method method = Class.forName(C1561oA.od("(4)62+%m\"-+0 (-ey%#(\u0018*%", (short) (C1633zX.Xd() ^ (-9828)))).getMethod(Wg.Zd("\u0014zCsA\u0014f\u0013jws a:\u0001E\u0007e)o", (short) (C1633zX.Xd() ^ (-25085)), (short) (C1633zX.Xd() ^ (-8348))), Class.forName(C1561oA.Kd("ldzf4siwq9_\u0002\u0001x~x", (short) (C1499aX.Xd() ^ (-3260)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, C1561oA.Xd("\b\u0015\u0015\u001c\u000e\"\u001fY\u0014\u0013#\u0003\u0019\u0013%\u0019\u0019\u0006)\u001d\u001f\u001f-!䞓\u000b\u0004k`\u0005229+?<v\u0017\u001a\u0010\u0012-\u001f\"\u001a(\u0014(\u001a~", (short) (Od.Xd() ^ (-19712))));
            this.f882b = sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final synchronized String a() {
        int versionCode;
        int i2;
        if ((this.f881a.isFirebaseCloudMessagingRegistrationEnabled() || this.f881a.isAdmMessagingRegistrationEnabled()) && this.f882b.contains(ProfilingTraceData.JsonKeys.VERSION_CODE) && (versionCode = this.f881a.getVersionCode()) != (i2 = this.f882b.getInt(ProfilingTraceData.JsonKeys.VERSION_CODE, Integer.MIN_VALUE))) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new g70(i2, versionCode), 6, (Object) null);
            return null;
        }
        if (this.f882b.contains("device_identifier")) {
            if (!Intrinsics.areEqual(String.valueOf(722989291), this.f882b.getString("device_identifier", ""))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) h70.f809a, 6, (Object) null);
                return null;
            }
        }
        return this.f882b.getString("registration_id", null);
    }

    public final synchronized void a(String str) {
        if (str == null) {
            throw new NullPointerException("Provided push token is null. Cannot set null push token.");
        }
        this.f882b.edit().putString("registration_id", str).putInt(ProfilingTraceData.JsonKeys.VERSION_CODE, this.f881a.getVersionCode()).putString("device_identifier", String.valueOf(722989291)).apply();
    }
}
