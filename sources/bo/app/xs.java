package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
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
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class xs {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f2237f = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vb0 f2238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v00 f2239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f2240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fu f2241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Job f2242e;

    public xs(Context context, vw vwVar, vb0 vb0Var, String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(vb0Var, Xg.qd("\u0007y\b\r|\u000b\\\n\n\u0003\u0007\u0006r\u0015\u0011\u0015\u0005\f\u000bv\u001a\u0018 \u0014\u0010\u0012 ", (short) (C1499aX.Xd() ^ (-28204)), (short) (C1499aX.Xd() ^ (-17278))));
        Intrinsics.checkNotNullParameter(vwVar, Jg.Wd("e&4cc\u001f\u0018_X=NU\u000b\u0013KG+", (short) (Od.Xd() ^ (-15458)), (short) (Od.Xd() ^ (-13177))));
        Intrinsics.checkNotNullParameter(context, ZO.xd("r?\u0003\\Z54", (short) (C1580rY.Xd() ^ (-11396)), (short) (C1580rY.Xd() ^ (-22389))));
        this.f2238a = vb0Var;
        this.f2239b = vwVar;
        Object[] objArr = {C1626yg.Ud("O5\rCo-~i\u0011\\F\tR#2rl\u0012x\u0016\u0007YujJ\u0001~NJ7.\f", (short) (C1580rY.Xd() ^ (-19027)), (short) (C1580rY.Xd() ^ (-14344))) + StringUtils.getCacheFileSuffix(context, str, str2), 0};
        Method method = Class.forName(Ig.wd("\rCu)|\"\u00076)fm\f.3;\fL\rQm\u001c\u0005)", (short) (OY.Xd() ^ 16086))).getMethod(C1561oA.Qd("\u0011\u000e\u001cy\u000e\u0006\u0016\b\u0006p\u0012\u0004\u0004\u0002\u000e\u007f\b{|\n", (short) (FB.Xd() ^ 6889)), Class.forName(EO.Od("Nu?G\u0006\u0012POsk\u0011N{n\u001a2", (short) (C1633zX.Xd() ^ (-8098)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, C1593ug.zd("\u0010\u001d\u001d$\u0016*'a\u001c\u001b+\u000b!\u001b-!!\u000e1%''5)鐁>;u\u0016\u0019\u000f\u0011,\u001e!\u0019'\u0013'\u0019^uvwxyz{|\u0007", (short) (C1607wl.Xd() ^ 25577), (short) (C1607wl.Xd() ^ 4170)));
            this.f2240c = sharedPreferences;
            this.f2241d = new fu();
            vwVar.c(new IEventSubscriber() { // from class: bo.app.xs$$ExternalSyntheticLambda0
                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) throws InterruptedException {
                    xs.a(this.f$0, (ec0) obj);
                }
            }, ec0.class);
            vwVar.c(new IEventSubscriber() { // from class: bo.app.xs$$ExternalSyntheticLambda1
                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) {
                    xs.a(this.f$0, (hc0) obj);
                }
            }, hc0.class);
            vwVar.c(new IEventSubscriber() { // from class: bo.app.xs$$ExternalSyntheticLambda2
                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) throws InterruptedException {
                    xs.a(this.f$0, (a50) obj);
                }
            }, a50.class);
            vwVar.c(new IEventSubscriber() { // from class: bo.app.xs$$ExternalSyntheticLambda3
                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) throws InterruptedException {
                    xs.a(this.f$0, (ys) obj);
                }
            }, ys.class);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final void a(xs this$0, a50 it) throws InterruptedException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ns(it), 7, (Object) null);
        z40 z40Var = it.f173b;
        z40 z40Var2 = z40.NONE;
        if (z40Var == z40Var2) {
            this$0.a();
        } else if (it.f172a == z40Var2) {
            this$0.a(true);
        }
    }

    public static final void a(xs this$0, ec0 it) throws InterruptedException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) js.f1032a, 7, (Object) null);
        Job job = this$0.f2242e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this$0.a(true);
    }

    public static final void a(xs this$0, hc0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) ks.f1139a, 7, (Object) null);
        this$0.f2242e = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(f2237f), null, new ms(this$0, null), 2, null);
    }

    public static final void a(xs this$0, ys it) throws InterruptedException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) os.f1459a, 7, (Object) null);
        String string = this$0.f2240c.getString("mite", null);
        String str = it.f2328a;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ts(str), 7, (Object) null);
        this$0.f2240c.edit().putString("mite", str).apply();
        this$0.a(Intrinsics.areEqual(string, it.f2328a));
    }

    public final void a() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) qs.f1621a, 7, (Object) null);
        fu fuVar = this.f2241d;
        fuVar.getClass();
        BrazeLogger.brazelog$default(brazeLogger, (Object) fuVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new gt(fuVar), 7, (Object) null);
        Job job = fuVar.f687a;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        fuVar.f687a = null;
    }

    public final void a(boolean z2) throws InterruptedException {
        String string = this.f2240c.getString("mite", null);
        if (string == null || !this.f2238a.x()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new us(string, this), 7, (Object) null);
            return;
        }
        String url = "https://dust.k8s.test-001.d-usw-2.braze.com/sse?mite=".concat(string);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vs(z2, string, url), 7, (Object) null);
        fu fuVar = this.f2241d;
        ws ingestor = new ws(this);
        fuVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(ingestor, "ingestor");
        BrazeLogger.brazelog$default(brazeLogger, (Object) fuVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new st(url), 7, (Object) null);
        if (z2 && fuVar.f687a != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) fuVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new tt(fuVar), 7, (Object) null);
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new ut(fuVar, null), 1, null);
        fuVar.f687a = BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new du(fuVar, ingestor, url, null), 3, null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) fuVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new eu(fuVar), 7, (Object) null);
    }
}
