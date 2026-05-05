package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uu {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1967k = BrazeLogger.getBrazeLogTag((Class<?>) uu.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00 f1968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cs f1969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d10 f1972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f1974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ox f1976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public rd0 f1977j;

    public uu(k00 destination, cs dispatchDataProvider) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        this.f1968a = destination;
        this.f1969b = dispatchDataProvider;
        this.f1973f = new ArrayList();
        int iOrdinal = destination.ordinal();
        this.f1975h = iOrdinal != 0 ? iOrdinal != 2 ? 0L : 75L : 25L;
        this.f1976i = new ox(c().e(), c().f(), c().g());
    }

    public ox a() {
        return this.f1976i;
    }

    public abstract void a(long j2);

    public void a(long j2, z80 requestInfo, n apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        Long l2 = apiResponse.f1328b;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        this.f1970c = j2;
        s50 s50Var = apiResponse instanceof s50 ? (s50) apiResponse : null;
        this.f1972e = s50Var != null ? s50Var.f1730d : null;
        ox oxVarA = a();
        int i2 = oxVarA.f1467b;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) oxVarA, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mx(oxVarA), 7, (Object) null);
        Random random = oxVarA.f1470e;
        int i3 = oxVarA.f1471f * oxVarA.f1469d;
        Intrinsics.checkNotNullParameter(random, "random");
        int iMin = Math.min(i2, i3) + random.nextInt(Math.abs(i2 - i3) + 1);
        oxVarA.f1471f = Math.max(oxVarA.f1468c, Math.min(oxVarA.f1466a, iMin));
        BrazeLogger.brazelog$default(brazeLogger, (Object) oxVarA, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new nx(oxVarA, i2, iMin), 7, (Object) null);
        this.f1974g = jLongValue + j2 + ((long) oxVarA.f1471f);
        BrazeLogger.brazelog$default(brazeLogger, f1967k, (BrazeLogger.Priority) null, (Throwable) null, d(), (Function0) new ru(j2, this), 6, (Object) null);
    }

    public void a(long j2, z80 requestInfo, s50 apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        a().f1471f = 0;
        this.f1971d = j2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f1967k, (BrazeLogger.Priority) null, (Throwable) null, d(), (Function0) new su(j2, this), 6, (Object) null);
    }

    public final rd0 b() throws Throwable {
        Map mapQ;
        vb0 vb0VarC = c();
        ReentrantLock reentrantLock = vb0VarC.f2034b;
        reentrantLock.lock();
        try {
            fb0 fb0Var = vb0VarC.f2036d;
            if (fb0Var == null || (mapQ = fb0Var.E) == null) {
                mapQ = vb0VarC.q();
            }
            reentrantLock.unlock();
            ra0 ra0Var = (ra0) mapQ.get(this.f1968a);
            if (ra0Var == null) {
                this.f1977j = null;
                return null;
            }
            rd0 rd0Var = this.f1977j;
            int i2 = ra0Var.f1663b;
            int i3 = ra0Var.f1662a;
            if (rd0Var == null) {
                cs csVar = this.f1969b;
                String strValueOf = String.valueOf(this.f1968a.hashCode());
                Intrinsics.checkNotNullParameter(csVar, C1561oA.Yd("*0;9+?/5\u00120D2\"ECK?;=K", (short) (Od.Xd() ^ (-1682))));
                Intrinsics.checkNotNullParameter(Jg.Wd("H]hr3Q\t/'9|\u0010Rks;L\\&3o\u000e\u0006\u001cos<@U\u00173.\u0003\u0007\"", (short) (OY.Xd() ^ 6187), (short) (OY.Xd() ^ 7496)), Xg.qd(">BF@,OCEIY", (short) (FB.Xd() ^ 21313), (short) (FB.Xd() ^ 9549)));
                Intrinsics.checkNotNullParameter(strValueOf, ZO.xd("\r$|8{3\u0017F\u000e)f!", (short) (C1499aX.Xd() ^ (-24992)), (short) (C1499aX.Xd() ^ (-11714))));
                ci0 ci0Var = (ci0) csVar.f430a;
                Context context = ci0Var.f382a;
                String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, ci0Var.f387f, ci0Var.f388g);
                short sXd = (short) (OY.Xd() ^ 5690);
                short sXd2 = (short) (OY.Xd() ^ 8117);
                int[] iArr = new int["CkWisBW%tDRJ \u0011?\u0010\u001fm\u001f$& \"VPZ`\u0001f5\u0011M\u001alMN".length()];
                QB qb = new QB("CkWisBW%tDRJ \u0011?\u0010\u001fm\u001f$& \"VPZ`\u0001f5\u0011M\u001alMN");
                int i4 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i4 * sXd2))) + xuXd.CK(iKK));
                    i4++;
                }
                Object[] objArr = {new String(iArr, 0, i4) + strValueOf + cacheFileSuffix, 0};
                Method method = Class.forName(Ig.wd("F\u001a\"OD\nh\u0002\u0011\u0018\u0015A\b\u000b\u001d{Tb9\u0007a\u001c\u0006", (short) (C1580rY.Xd() ^ (-24531)))).getMethod(C1561oA.Qd("sp~\\phxjhStffdpbj^_l", (short) (C1580rY.Xd() ^ (-8333))), Class.forName(EO.Od("0L\u0016\")E\u0018nC\u0007,m;>9Q", (short) (OY.Xd() ^ 3833))), Integer.TYPE);
                try {
                    method.setAccessible(true);
                    SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
                    Intrinsics.checkNotNullExpressionValue(sharedPreferences, C1593ug.zd("\u000e\u001b\u001b\"\u0014(%_\u001a\u0019)\t\u001f\u0019+\u001f\u001f\f/#%%3'疼\u0013\t\u000b&\u0018\u001b\u0013!\r!\u0013Xopqrstuvwxyz\u0005", (short) (Od.Xd() ^ (-8214)), (short) (Od.Xd() ^ (-25110))));
                    rd0Var = new rd0(i3, i2, sharedPreferences);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else if (i3 >= 1 && i2 >= 1 && (rd0Var.f1676a != i3 || rd0Var.f1677b != i2)) {
                rd0Var.f1676a = i3;
                rd0Var.f1677b = i2;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rd0Var, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new qd0(i3, i2), 6, (Object) null);
            }
            this.f1977j = rd0Var;
            return rd0Var;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(long j2) {
        ArrayList arrayList = this.f1973f;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            a90 a90Var = ((z80) obj).f2366d;
            if (a90Var == a90.PENDING_START || a90Var == a90.PENDING_RETRY) {
                arrayList2.add(obj);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList2, new nu());
        if (listSortedWith.size() >= 2) {
            int size = listSortedWith.size();
            for (int i2 = 1; i2 < size; i2++) {
                z80 z80Var = (z80) listSortedWith.get(i2);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f1967k, (BrazeLogger.Priority) null, (Throwable) null, d(), (Function0) new ou(z80Var), 6, (Object) null);
                z80Var.a(j2, a90.BATCHED);
            }
        }
    }

    public final vb0 c() {
        return ((ci0) this.f1969b.f430a).f389h;
    }

    public final String c(long j2) {
        String string;
        String strJoinToString$default = CollectionsKt.joinToString$default(this.f1973f, "\n\n", null, null, 0, null, new tu(j2), 30, null);
        StringBuilder sbAppend = new StringBuilder("\n            |EndpointQueue: ").append(this.f1968a).append("\n            |   lastFailureAt = ").append(this.f1970c - j2).append("\n            |   lastSuccessAt = ").append(this.f1971d - j2).append("\n            |   failureBackoffUntil = ").append(this.f1974g - j2).append("\n            |   lastResponseError = ").append(this.f1972e).append("\n            |   pendingWaitDuration = ").append(this.f1975h).append("\n            |   endpointRateLimiter = ");
        rd0 rd0Var = this.f1977j;
        if (rd0Var == null || (string = rd0Var.toString()) == null) {
            string = "unset";
        }
        return StringsKt.trimMargin$default(sbAppend.append(string).append("\n            |   requestInfoQueue: \n            |").append(strJoinToString$default).append("\n        ").toString(), null, 1, null);
    }

    public boolean d() {
        return false;
    }
}
