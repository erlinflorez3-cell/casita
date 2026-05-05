package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.braze.BrazeFlushPushDeliveryReceiver;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.sync.Mutex;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class tf implements h00 {

    /* JADX INFO: renamed from: v */
    public static final String[] f1837v = {"android.os.deadsystemexception"};

    /* JADX INFO: renamed from: a */
    public final Context f1838a;

    /* JADX INFO: renamed from: b */
    public final String f1839b;

    /* JADX INFO: renamed from: c */
    public final ci f1840c;

    /* JADX INFO: renamed from: d */
    public final v00 f1841d;

    /* JADX INFO: renamed from: e */
    public final BrazeConfigurationProvider f1842e;

    /* JADX INFO: renamed from: f */
    public final vb0 f1843f;

    /* JADX INFO: renamed from: g */
    public final kx f1844g;

    /* JADX INFO: renamed from: h */
    public final yf f1845h;

    /* JADX INFO: renamed from: i */
    public final ka0 f1846i;

    /* JADX INFO: renamed from: j */
    public final b70 f1847j;

    /* JADX INFO: renamed from: k */
    public final s60 f1848k;

    /* JADX INFO: renamed from: l */
    public final y60 f1849l;

    /* JADX INFO: renamed from: m */
    public final AtomicInteger f1850m;

    /* JADX INFO: renamed from: n */
    public final AtomicInteger f1851n;

    /* JADX INFO: renamed from: o */
    public final ReentrantLock f1852o;

    /* JADX INFO: renamed from: p */
    public Job f1853p;

    /* JADX INFO: renamed from: q */
    public final fv f1854q;

    /* JADX INFO: renamed from: r */
    public volatile String f1855r;

    /* JADX INFO: renamed from: s */
    public final AtomicBoolean f1856s;

    /* JADX INFO: renamed from: t */
    public final AtomicBoolean f1857t;

    /* JADX INFO: renamed from: u */
    public Class f1858u;

    public tf(Context context, String str, String apiKey, ci sessionManager, vw internalEventPublisher, BrazeConfigurationProvider configurationProvider, vb0 serverConfigStorageProvider, kx eventStorageManager, yf messagingSessionManager, ka0 sdkEnablementProvider, b70 pushMaxManager, s60 pushDeliveryManager, y60 pushIdentifierStorageProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(eventStorageManager, "eventStorageManager");
        Intrinsics.checkNotNullParameter(messagingSessionManager, "messagingSessionManager");
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        Intrinsics.checkNotNullParameter(pushMaxManager, "pushMaxManager");
        Intrinsics.checkNotNullParameter(pushDeliveryManager, "pushDeliveryManager");
        Intrinsics.checkNotNullParameter(pushIdentifierStorageProvider, "pushIdentifierStorageProvider");
        this.f1838a = context;
        this.f1839b = str;
        this.f1840c = sessionManager;
        this.f1841d = internalEventPublisher;
        this.f1842e = configurationProvider;
        this.f1843f = serverConfigStorageProvider;
        this.f1844g = eventStorageManager;
        this.f1845h = messagingSessionManager;
        this.f1846i = sdkEnablementProvider;
        this.f1847j = pushMaxManager;
        this.f1848k = pushDeliveryManager;
        this.f1849l = pushIdentifierStorageProvider;
        this.f1850m = new AtomicInteger(0);
        this.f1851n = new AtomicInteger(0);
        this.f1852o = new ReentrantLock();
        this.f1853p = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.f1854q = new fv(context, a(), apiKey);
        this.f1855r = "";
        this.f1856s = new AtomicBoolean(false);
        this.f1857t = new AtomicBoolean(false);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) he.f826a, 6, (Object) null);
        internalEventPublisher.c(new IEventSubscriber() { // from class: bo.app.tf$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                tf.a(this.f$0, (h90) obj);
            }
        }, h90.class);
        internalEventPublisher.c(new IEventSubscriber() { // from class: bo.app.tf$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                tf.a(this.f$0, (ca0) obj);
            }
        }, ca0.class);
        internalEventPublisher.c(new IEventSubscriber() { // from class: bo.app.tf$$ExternalSyntheticLambda2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                tf.a(this.f$0, (ia0) obj);
            }
        }, ia0.class);
    }

    public static final void a(tf this$0, ca0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, priority, (Throwable) null, false, (Function0) ie.f900a, 6, (Object) null);
        if (this$0.f1843f.E()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, priority, (Throwable) null, false, (Function0) ne.f1357a, 6, (Object) null);
            this$0.a(new ba0(this$0.f1843f, this$0.f1842e.getBaseUrlForRequests(), this$0.f1839b));
        }
    }

    public static final void a(tf this$0, h90 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        throw null;
    }

    public static final void a(tf this$0, ia0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.D;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, priority, (Throwable) null, true, (Function0) je.f1007a, 2, (Object) null);
        List list = it.f892a;
        this$0.getClass();
        if (list.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, priority, (Throwable) null, true, (Function0) qf.f1600a, 2, (Object) null);
        this$0.a(new ha0(this$0.f1843f, this$0.f1842e.getBaseUrlForRequests(), this$0.f1839b, list));
    }

    public final String a() {
        return this.f1839b;
    }

    public final void a(long j2) throws Throwable {
        Context context = this.f1838a;
        Object[] objArr = {EO.Od("\u00038\u001b\u0014\u0006", (short) (C1607wl.Xd() ^ 25882))};
        Method method = Class.forName(C1561oA.Qd("#/$1-& h\u001d(&+\u001b#(`t \u001e#\u0013% ", (short) (C1580rY.Xd() ^ (-15604)))).getMethod(C1561oA.od("# .\f1**\u001a!\u0006\u0017#&\u0018\u0011\u0012", (short) (FB.Xd() ^ 24076)), Class.forName(C1593ug.zd("\u000e\u0006\u001c\bU\u0015\u000b\u0019\u0013Z\u0001#\"\u001a \u001a", (short) (Od.Xd() ^ (-10353)), (short) (Od.Xd() ^ (-1142)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke, C1561oA.Kd("<D<=q65CDFLx<@{@?RT\u0001VR\u0004SUU\u0015W_WX\rbh`V\u0012TbYhfa](\\lm,@lbtpQfthon|", (short) (ZN.Xd() ^ 21370)));
            AlarmManager alarmManager = (AlarmManager) objInvoke;
            Intent intent = new Intent(this.f1838a, (Class<?>) BrazeFlushPushDeliveryReceiver.class);
            intent.setAction(Wg.Zd("Gf~bs\u0016 \u0016#\u0007s\u0014@\u001b*T\"Ibs][\u0001br\u001ce\u00169", (short) (ZN.Xd() ^ 848), (short) (ZN.Xd() ^ 32218)));
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f1838a, 0, intent, (-1) - (((-1) - IntentUtils.getImmutablePendingIntentFlags()) & ((-1) - 134217728)));
            if (j2 > 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jf(j2), 7, (Object) null);
                alarmManager.set(2, SystemClock.elapsedRealtime() + j2, broadcast);
                return;
            }
            alarmManager.cancel(broadcast);
            ArrayList arrayListA = this.f1848k.a();
            if (arrayListA.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) Cif.f903a, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) hf.f828a, 7, (Object) null);
                a(new u60(this.f1843f, this.f1842e.getBaseUrlForRequests(), this.f1839b, arrayListA));
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void a(j50 respondWithBuilder) {
        Intrinsics.checkNotNullParameter(respondWithBuilder, "respondWithBuilder");
        vb0 vb0Var = this.f1843f;
        vb0Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) vb0Var, priority, (Throwable) null, false, (Function0) jb0.f1001a, 6, (Object) null);
        Pair pair = null;
        if (Mutex.DefaultImpls.tryLock$default(vb0Var.f2035c, null, 1, null)) {
            pair = new Pair(Long.valueOf(vb0Var.d()), Boolean.valueOf(vb0Var.d() <= 0));
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) vb0Var, priority, (Throwable) null, false, (Function0) kb0.f1097a, 6, (Object) null);
        }
        if (pair != null) {
            i50 outboundConfigParams = new i50(((Number) pair.getFirst()).longValue(), ((Boolean) pair.getSecond()).booleanValue());
            Intrinsics.checkNotNullParameter(outboundConfigParams, "outboundConfigParams");
            respondWithBuilder.f979d = outboundConfigParams;
        }
        if (this.f1856s.get()) {
            respondWithBuilder.f978c = Boolean.TRUE;
        }
        respondWithBuilder.f976a = this.f1839b;
        a(new cp(this.f1843f, this.f1842e.getBaseUrlForRequests(), respondWithBuilder.a()));
        this.f1856s.set(false);
    }

    public final void a(tg request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f1846i.f1095a.getBoolean("appboy_sdk_disabled", false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) ke.f1104a, 6, (Object) null);
            return;
        }
        request.f1860b = this.f1839b;
        v00 v00Var = this.f1841d;
        Intrinsics.checkNotNullParameter(request, "request");
        ((vw) v00Var).b(tr.class, new tr(4, null, null, request, 6));
    }

    public final void a(Throwable throwable, boolean z2) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            if (a(throwable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new pe(throwable), 6, (Object) null);
                return;
            }
            String string = throwable.toString();
            String str = f1837v[0];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = string.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) str, false, 2, (Object) null)) {
                return;
            }
            z9 z9Var = ba.f257g;
            cc0 cc0VarD = this.f1840c.d();
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            e00 e00VarA = z9Var.a(new z8(throwable, cc0VarD, z2));
            if (e00VarA != null) {
                a(e00VarA);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) qe.f1598a, 4, (Object) null);
        }
    }

    public final void a(boolean z2) {
        this.f1856s.set(z2);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new sf(this), 6, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(bo.app.e00 r25) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.tf.a(bo.app.e00):boolean");
    }

    public final boolean a(Throwable th) {
        ReentrantLock reentrantLock = this.f1852o;
        reentrantLock.lock();
        try {
            this.f1850m.getAndIncrement();
            if (Intrinsics.areEqual(this.f1855r, th.getMessage()) && this.f1851n.get() > 3 && this.f1850m.get() < 25) {
                reentrantLock.unlock();
                return true;
            }
            if (Intrinsics.areEqual(this.f1855r, th.getMessage())) {
                this.f1851n.getAndIncrement();
            } else {
                this.f1851n.set(0);
            }
            if (this.f1850m.get() >= 25) {
                this.f1850m.set(0);
            }
            this.f1855r = th.getMessage();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b() {
        w40 w40Var;
        if (this.f1846i.f1095a.getBoolean("appboy_sdk_disabled", false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) cf.f341a, 6, (Object) null);
            return;
        }
        ci ciVar = this.f1840c;
        ReentrantLock reentrantLock = ciVar.f377h;
        reentrantLock.lock();
        try {
            if (ciVar.c() && (w40Var = ciVar.f381l) != null) {
                ciVar.f371b.a(w40Var);
            }
            Job.DefaultImpls.cancel$default(ciVar.f380k, (CancellationException) null, 1, (Object) null);
            ciVar.a();
            ((vw) ciVar.f372c).b(ec0.class, ec0.f566a);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new df(this), 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
