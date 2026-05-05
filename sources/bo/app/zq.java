package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class zq extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final sq f2423f = new sq();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f2424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f2425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferences f2426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public nq f2427e;

    public /* synthetic */ zq(Context context) {
        this(context, null, null);
    }

    public zq(Context context, String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Yd("lyy\u0001r\u0007\u0004", (short) (C1580rY.Xd() ^ (-21664))));
        this.f2424b = new BrazeConfigurationProvider(context);
        String str3 = Xg.qd("\u0013 \u001f`\u0015%&\u0019'2g.0,0 '&o');/*-(-,/53|F\u0004", (short) (C1580rY.Xd() ^ (-16706)), (short) (C1580rY.Xd() ^ (-5317))) + StringUtils.getCacheFileSuffix(context, str, str2);
        Class<?> cls = Class.forName(Jg.Wd("1Yl\u0004}\u0011\u0019\u001c\\\u0016\u000e!+A\u007fVv,8W\u0006\";", (short) (Od.Xd() ^ (-16595)), (short) (Od.Xd() ^ (-10694))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1607wl.Xd() ^ 1656);
        short sXd2 = (short) (C1607wl.Xd() ^ 24138);
        int[] iArr = new int["8\f\u00058tUd/:H}\t\u0005\u0016>-".length()];
        QB qb = new QB("8\f\u00058tUd/:H}\t\u0005\u0016>-");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {str3, 0};
        Method method = cls.getMethod(C1626yg.Ud("xJ~TipP\\u-Z4*@\u001f\u0011/\u001119", (short) (OY.Xd() ^ 1396), (short) (OY.Xd() ^ 22875)), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            String strWd = Ig.wd("\u001dYF-mCc=;\u0006\u0017W=,\u0016*dN\u0018\u0013Y{+\"毿wD\u0003\u0015E&Ft\u0003e\u0013y5*\u0015\u0012S\u0016\u0006rs)\rO\u0013", (short) (C1633zX.Xd() ^ (-26503)));
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, strWd);
            this.f2425c = sharedPreferences;
            Object[] objArr2 = {EO.Od("\fOoO|B\u0005\u0016$0k\u0013=BAl \u000bY\u0012e5\u0005\u0003O? nM=Y\u007fWI\u0017`8'\u0019", (short) (OY.Xd() ^ 16703)) + StringUtils.getCacheFileSuffix(context, str, str2), 0};
            Method method2 = Class.forName(C1561oA.Qd("\u0015!\u0016#\u001f\u0018\u0012Z\u000f\u001a\u0018\u001d\r\u0015\u001aRf\u0012\u0010\u0015\u0005\u0017\u0012", (short) (C1580rY.Xd() ^ (-1752)))).getMethod(C1561oA.od("xu\u0004aum}omXykkiugocdq", (short) (ZN.Xd() ^ 4391)), Class.forName(C1593ug.zd("\u000e\u0006\u001c\bU\u0015\u000b\u0019\u0013Z\u0001#\"\u001a \u001a", (short) (C1633zX.Xd() ^ (-12422)), (short) (C1633zX.Xd() ^ (-4059)))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                SharedPreferences sharedPreferences2 = (SharedPreferences) method2.invoke(context, objArr2);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences2, strWd);
                this.f2426d = sharedPreferences2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    @Override // bo.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.zq.b():java.lang.Object");
    }

    @Override // bo.app.f
    public final void b(Object obj, boolean z2) {
        nq outboundObject = (nq) obj;
        Intrinsics.checkNotNullParameter(outboundObject, "outboundObject");
        if (z2) {
            try {
                String string = this.f2425c.getString("cached_device", "{}");
                this.f2425c.edit().putString("cached_device", JsonUtils.mergeJsonObjects(new JSONObject(string != null ? string : "{}"), outboundObject.forJsonPut()).toString()).apply();
                this.f2426d.edit().putBoolean("sfone", false).putInt("ldov", Build.VERSION.SDK_INT).apply();
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) tq.f1883a, 4, (Object) null);
            }
        }
    }

    public final void c() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) uq.f1961a, 6, (Object) null);
        this.f2426d.edit().putBoolean("sfone", true).apply();
    }
}
