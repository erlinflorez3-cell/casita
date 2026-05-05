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
import kotlin.text.StringsKt;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class y60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f2272b = TimeUnit.DAYS.toSeconds(45);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f2273a;

    public y60(Context context, String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.ud("'205%72", (short) (C1633zX.Xd() ^ (-16051))));
        Object[] objArr = {C1561oA.yd("2=:y5D2J<\u0004HHJL:?D\fMQVJ@IKKSXTPRM!\r  \"$\u0012\u0017\u001c", (short) (C1633zX.Xd() ^ (-12568))) + StringUtils.getCacheFileSuffix(context, str2, str), 0};
        Method method = Class.forName(C1561oA.Yd("iwn}{vr=s\u0001\u0001\by\u0004\u000bE[\t\t\u0010\u0002\u0016\u0013", (short) (FB.Xd() ^ 14152))).getMethod(Jg.Wd("\u000bR|g\u0017\u001a\u0004\u0001\u001a\u0013PL&0VUy8Rk", (short) (OY.Xd() ^ 10156), (short) (OY.Xd() ^ 9668)), Class.forName(Xg.qd("`XnZ(g]ke-Sutlrl", (short) (C1580rY.Xd() ^ (-28618)), (short) (C1580rY.Xd() ^ (-21576)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, ZO.xd("as=\th\u0011 'Xh1{6d_C\u0015F^8I3M6弅\u001cyx29u\bS\u001d.6'p8\u0015hzs4c9MjWG", (short) (Od.Xd() ^ (-7095)), (short) (Od.Xd() ^ (-29785))));
            this.f2273a = sharedPreferences;
            a();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void a() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds() - f2272b;
        SharedPreferences.Editor editorEdit = this.f2273a.edit();
        Map<String, ?> all = this.f2273a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "storagePrefs.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            Long l2 = (Long) entry.getValue();
            if (l2 == null || l2.longValue() < jNowInSeconds) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new v60(entry, jNowInSeconds), 6, (Object) null);
                editorEdit.remove(entry.getKey());
            }
        }
        editorEdit.apply();
    }

    public final boolean a(String pushId) {
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        if (StringsKt.isBlank(pushId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) w60.f2107a, 7, (Object) null);
            return true;
        }
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        if (this.f2273a.contains(pushId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x60(pushId), 7, (Object) null);
            return false;
        }
        a();
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        this.f2273a.edit().putLong(pushId, DateTimeUtils.nowInSeconds()).apply();
        return true;
    }
}
