package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class fv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f688b = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f689a;

    public fv(Context context, String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.od("=HFK;MH", (short) (ZN.Xd() ^ 28446)));
        short sXd = (short) (C1607wl.Xd() ^ 18701);
        int[] iArr = new int["}\u000e\bj\u0006\u001b".length()];
        QB qb = new QB("}\u000e\bj\u0006\u001b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str2, new String(iArr, 0, i2));
        String str3 = Wg.Zd("B\r\r_xY[_J8\\&\u001bylZb2^*?}b\rk2!Z9q\r\fvGHWD!\u001a", (short) (ZN.Xd() ^ 25755), (short) (ZN.Xd() ^ 25416)) + StringUtils.getCacheFileSuffix(context, str, str2);
        Class<?> cls = Class.forName(C1561oA.Xd("\u0017%\u001c+)$ j!..5'18r\t66=/C@", (short) (C1499aX.Xd() ^ (-23465))));
        Class<?>[] clsArr = new Class[2];
        short sXd2 = (short) (FB.Xd() ^ 15663);
        int[] iArr2 = new int[")\u001f3\u001dp.\"..s\u00188=37/".length()];
        QB qb2 = new QB(")\u001f3\u001dp.\"..s\u00188=37/");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {str3, 0};
        Method method = cls.getMethod(Qg.kd("\u0001}\fi}u\u0006wu`\u0002ssq}owkly", (short) (ZN.Xd() ^ 136), (short) (ZN.Xd() ^ 21576)), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            short sXd3 = (short) (OY.Xd() ^ 15555);
            short sXd4 = (short) (OY.Xd() ^ 17412);
            int[] iArr3 = new int["HSQVFXS\fDAO-A9I;9$E775A3雷;9>.@;s\u0012\u0013\u0007\u0007 \u0010\u0011\u0007\u0013|\u000f~BWVUT\\".length()];
            QB qb3 = new QB("HSQVFXS\fDAO-A9I;9$E775A3雷;9>.@;s\u0012\u0013\u0007\u0007 \u0010\u0011\u0007\u0013|\u000f~BWVUT\\");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd3 + i4 + xuXd3.CK(iKK3) + sXd4);
                i4++;
            }
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, new String(iArr3, 0, i4));
            this.f689a = sharedPreferences;
            a();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void a() {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        for (Map.Entry<String, ?> entry : this.f689a.getAll().entrySet()) {
            try {
                Object value = entry.getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                if (jNowInMilliseconds >= ((Long) value).longValue()) {
                    String key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                    this.f689a.edit().remove(key).apply();
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new dv(entry), 4, (Object) null);
                String key2 = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key2, "entry.key");
                this.f689a.edit().remove(key2).apply();
            }
        }
    }

    public final boolean a(e00 event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        ba baVar = (ba) event;
        if (baVar.f259a != lx.PUSH_CLICKED) {
            return true;
        }
        a();
        Intrinsics.checkNotNullParameter(event, "event");
        int i2 = n60.f1344i;
        Intrinsics.checkNotNullParameter(event, "event");
        String string = baVar.f260b.getString("cid");
        Intrinsics.checkNotNullExpressionValue(string, "event.data.getString(IBrazeEvent.DATA_CAMPAIGN_ID)");
        String eventKey = baVar.f259a + string;
        if (this.f689a.contains(eventKey)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ev(event), 7, (Object) null);
            return false;
        }
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds() + f688b;
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        this.f689a.edit().putLong(eventKey, jNowInMilliseconds).apply();
        return true;
    }
}
