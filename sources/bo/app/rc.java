package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.IEventSubscriber;
import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import com.dynatrace.android.agent.Global;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f1666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f1667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f1668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f1669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1673h;

    public rc(Context context, String str, vb0 vb0Var, v00 v00Var) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1626yg.Ud("\\` ~el'", (short) (C1633zX.Xd() ^ (-5484)), (short) (C1633zX.Xd() ^ (-2760))));
        Intrinsics.checkNotNullParameter(str, Ig.wd("j4]\\\u0014s", (short) (OY.Xd() ^ 21671)));
        Intrinsics.checkNotNullParameter(vb0Var, EO.Od("W\u001ahUC%\nV\u0018d]A{\u001fyc'\u0017M\u0001e\u000fkbP%\u0015", (short) (ZN.Xd() ^ 26671)));
        Intrinsics.checkNotNullParameter(v00Var, C1561oA.Qd("gkp`lgYc?:jX`e=Ta`QYQNZ", (short) (ZN.Xd() ^ 23185)));
        ((vw) v00Var).c(new IEventSubscriber() { // from class: bo.app.rc$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                rc.a(this.f$0, (ac0) obj);
            }
        }, ac0.class);
        String str2 = C1593ug.zd("x\u0006\u0005Fz\u000b\f~\r\u0018M\u000e\u0003\u0011\u0005\f\u000b\u0019\u001bV\u0011\u0010\u001b\u0013\u0013\u001d\u0013\u0016%`\u0019!\u001f\u001e!\u001b#'%17l'-1%%1s", (short) (FB.Xd() ^ 18240), (short) (FB.Xd() ^ 8194)) + str;
        short sXd = (short) (C1607wl.Xd() ^ 27924);
        int[] iArr = new int["FRGTPIC\f@KIN>FK\u0004\u0018CAF6HC".length()];
        QB qb = new QB("FRGTPIC\f@KIN>FK\u0004\u0018CAF6HC");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[2];
        short sXd2 = (short) (C1499aX.Xd() ^ (-1307));
        int[] iArr2 = new int["\b\u007f\u0016\u0002O\u000f\u0005\u0013\rTz\u001d\u001c\u0014\u001a\u0014".length()];
        QB qb2 = new QB("\b\u007f\u0016\u0002O\u000f\u0005\u0013\rTz\u001d\u001c\u0014\u001a\u0014");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {str2, 0};
        Method method = cls.getMethod(Wg.Zd("\f\u001290V'P[k+Y`v\nry\u0014!z\u0012", (short) (ZN.Xd() ^ 12850), (short) (ZN.Xd() ^ 19809)), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            String strXd = C1561oA.Xd("P]]dVjg\"\\[kKa[maaNqeggui㽬uu|n\u0003\u007f:Z]SUpbe]kWk]#:;<=G", (short) (FB.Xd() ^ 28701));
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, strXd);
            this.f1666a = sharedPreferences;
            Object[] objArr2 = {Wg.vd("p}x:jzwjt\u007f1qbp`gbpn*`_f^ZdVYd T\\\u0017\u0016\u0015\u000f\u0013\u0017\u0011\u001d\u001fT\r\u0013\u0006\f\u0016\n\u0002\u0014|\tG", (short) (C1580rY.Xd() ^ (-7424))) + str, 0};
            Method method2 = Class.forName(Qg.kd(".:/<81+s(316&.3k\u007f+).\u001e0+", (short) (Od.Xd() ^ (-17951)), (short) (Od.Xd() ^ (-7121)))).getMethod(C1561oA.ud("_\\jH\\TdVT?`RRP\\NVJKX", (short) (C1633zX.Xd() ^ (-16650))), Class.forName(yg.hg.Vd("RH\\F\u0012OCOG\r1QNDH@", (short) (OY.Xd() ^ 8347), (short) (OY.Xd() ^ 18267))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                SharedPreferences sharedPreferences2 = (SharedPreferences) method2.invoke(context, objArr2);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences2, strXd);
                this.f1667b = sharedPreferences2;
                this.f1668c = a(sharedPreferences2);
                this.f1669d = new AtomicBoolean(false);
                this.f1670e = sharedPreferences.getLong(C1561oA.yd("(\u001c--\u001f1#.9(55'.24.,6", (short) (C1580rY.Xd() ^ (-6206))), 0L);
                this.f1671f = sharedPreferences.getLong(C1561oA.Yd("&\u001c/1\u001d1%1158$-37++7", (short) (C1633zX.Xd() ^ (-12112))), 0L);
                this.f1672g = vb0Var.n();
                this.f1673h = vb0Var.m();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static final void a(rc this$0, ac0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f1669d.set(false);
    }

    public final String a(String reEligibilityId) {
        Intrinsics.checkNotNullParameter(reEligibilityId, "reEligibilityId");
        try {
            return new Regex(Global.UNDERSCORE).split(reEligibilityId, 2).get(1);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new nc(reEligibilityId), 4, (Object) null);
            return null;
        }
    }

    public final ConcurrentHashMap a(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            Set<String> setKeySet = all.keySet();
            if (setKeySet.isEmpty()) {
                return concurrentHashMap;
            }
            for (String reEligibilityId : setKeySet) {
                long j2 = sharedPreferences.getLong(reEligibilityId, 0L);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new cc(this, reEligibilityId), 7, (Object) null);
                Long lValueOf = Long.valueOf(j2);
                Intrinsics.checkNotNullExpressionValue(reEligibilityId, "reEligibilityId");
                concurrentHashMap.put(reEligibilityId, lValueOf);
            }
        }
        return concurrentHashMap;
    }

    public final void a(long j2) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qc(j2), 7, (Object) null);
        this.f1670e = j2;
        this.f1666a.edit().putLong("last_request_global", this.f1670e).apply();
    }

    public final boolean a(long j2, BrazeGeofence geofence, GeofenceTransitionType transitionType) {
        Intrinsics.checkNotNullParameter(geofence, "geofence");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        String geofenceId = geofence.getId();
        long j3 = j2 - this.f1671f;
        if (this.f1673h > j3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dc(j3, this, geofenceId), 7, (Object) null);
            return false;
        }
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        StringBuilder sb = new StringBuilder();
        String string = transitionType.toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = string.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String string2 = sb.append(lowerCase).append('_').append(geofenceId).toString();
        int cooldownEnterSeconds = transitionType == GeofenceTransitionType.ENTER ? geofence.getCooldownEnterSeconds() : geofence.getCooldownExitSeconds();
        if (this.f1668c.containsKey(string2)) {
            Long l2 = (Long) this.f1668c.get(string2);
            if (l2 != null) {
                long jLongValue = j2 - l2.longValue();
                if (cooldownEnterSeconds > jLongValue) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ec(jLongValue, cooldownEnterSeconds, geofenceId, transitionType), 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new fc(jLongValue, cooldownEnterSeconds, geofenceId, transitionType), 7, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new gc(geofenceId, transitionType), 7, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hc(j3, this, geofenceId), 7, (Object) null);
        this.f1668c.put(string2, Long.valueOf(j2));
        this.f1667b.edit().putLong(string2, j2).apply();
        this.f1671f = j2;
        this.f1666a.edit().putLong("last_report_global", j2).apply();
        return true;
    }
}
