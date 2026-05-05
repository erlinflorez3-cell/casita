package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.location.IBrazeLocationApi;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes4.dex */
public final class iw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y00 f935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v00 f936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h00 f937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uh0 f938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zq f939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h10 f940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j10 f941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kx f942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BrazeGeofenceManager f943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v00 f944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BrazeConfigurationProvider f945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kn f946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final la0 f947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final vb0 f948o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gy f949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s60 f950q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f951r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ve0 f953t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f954u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f955v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f956w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f957x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f958y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f959z;

    public iw(Context applicationContext, zd locationManager, vw internalEventPublisher, h00 brazeManager, uh0 userCache, zq deviceCache, cg0 triggerManager, j10 triggerReEligibilityManager, kx eventStorageManager, BrazeGeofenceManager geofenceManager, v00 externalEventPublisher, BrazeConfigurationProvider configurationProvider, kn contentCardsStorageProvider, la0 sdkMetadataCache, vb0 serverConfigStorageProvider, gy featureFlagsManager, s60 pushDeliveryManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(userCache, "userCache");
        Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
        Intrinsics.checkNotNullParameter(triggerManager, "triggerManager");
        Intrinsics.checkNotNullParameter(triggerReEligibilityManager, "triggerReEligibilityManager");
        Intrinsics.checkNotNullParameter(eventStorageManager, "eventStorageManager");
        Intrinsics.checkNotNullParameter(geofenceManager, "geofenceManager");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(contentCardsStorageProvider, "contentCardsStorageProvider");
        Intrinsics.checkNotNullParameter(sdkMetadataCache, "sdkMetadataCache");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(featureFlagsManager, "featureFlagsManager");
        Intrinsics.checkNotNullParameter(pushDeliveryManager, "pushDeliveryManager");
        this.f934a = applicationContext;
        this.f935b = locationManager;
        this.f936c = internalEventPublisher;
        this.f937d = brazeManager;
        this.f938e = userCache;
        this.f939f = deviceCache;
        this.f940g = triggerManager;
        this.f941h = triggerReEligibilityManager;
        this.f942i = eventStorageManager;
        this.f943j = geofenceManager;
        this.f944k = externalEventPublisher;
        this.f945l = configurationProvider;
        this.f946m = contentCardsStorageProvider;
        this.f947n = sdkMetadataCache;
        this.f948o = serverConfigStorageProvider;
        this.f949p = featureFlagsManager;
        this.f950q = pushDeliveryManager;
        this.f951r = new AtomicBoolean(false);
        this.f952s = new AtomicBoolean(false);
        this.f954u = new AtomicBoolean(false);
        this.f955v = new AtomicBoolean(false);
        this.f956w = new AtomicBoolean(false);
        this.f957x = new AtomicBoolean(false);
        this.f958y = new AtomicBoolean(false);
        this.f959z = new AtomicBoolean(false);
    }

    public static final void a(iw this$0, ac0 it) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) wv.f2165a, 7, (Object) null);
        zd zdVar = (zd) this$0.f935b;
        sd sdVar = zdVar.f2385b;
        yd manualLocationUpdateCallback = new yd(zdVar);
        sdVar.getClass();
        Intrinsics.checkNotNullParameter(manualLocationUpdateCallback, "manualLocationUpdateCallback");
        IBrazeLocationApi iBrazeLocationApi = sdVar.f1760a;
        if (iBrazeLocationApi != null) {
            iBrazeLocationApi.requestSingleLocationUpdate(manualLocationUpdateCallback);
        }
        z9 z9Var = ba.f257g;
        cc0 sessionId = it.f191a.f2375a;
        z9Var.getClass();
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        e00 e00VarA = z9Var.a(new t9(sessionId));
        if (e00VarA != null) {
            ((ba) e00VarA).a(it.f191a.f2375a);
        }
        if (e00VarA != null) {
            ((tf) this$0.f937d).a(e00VarA);
        }
        ((tf) this$0.f937d).a(true);
        tf tfVar = (tf) this$0.f937d;
        tfVar.f1857t.set(true);
        BrazeLogger.brazelog$default(brazeLogger, (Object) tfVar, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new rf(tfVar), 6, (Object) null);
        this$0.f938e.d();
        this$0.f939f.c();
        BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) tv.f1892a, 7, (Object) null);
        ((tf) this$0.f937d).a(0L);
        if (this$0.f945l.isAutomaticGeofenceRequestsEnabled()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) xv.f2245a, 7, (Object) null);
            BrazeInternal.requestGeofenceRefresh(this$0.f934a, false);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) yv.f2331a, 7, (Object) null);
        }
        this$0.f949p.b();
        this$0.v();
    }

    public static final void a(iw this$0, am it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            h00 h00Var = this$0.f937d;
            kn knVar = this$0.f946m;
            h00.a(h00Var, knVar.f1125c, knVar.f1126d);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) gv.f775a, 4, (Object) null);
        }
    }

    public static final void a(iw this$0, ch0 ch0Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ch0Var, "<name for destructuring parameter 0>");
        ((cg0) this$0.f940g).a(ch0Var.f365a, ch0Var.f366b);
    }

    public static final void a(iw this$0, d30 d30Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d30Var, "<name for destructuring parameter 0>");
        g10 g10Var = d30Var.f452a;
        k10 k10Var = d30Var.f453b;
        IInAppMessage iInAppMessage = d30Var.f454c;
        String str = d30Var.f455d;
        synchronized (this$0.f941h) {
            if (((zg0) this$0.f941h).a(k10Var)) {
                ((vw) this$0.f944k).b(InAppMessageEvent.class, new InAppMessageEvent(g10Var, k10Var, iInAppMessage, str));
                ((zg0) this$0.f941h).a(k10Var, DateTimeUtils.nowInSeconds());
                h10 h10Var = this$0.f940g;
                long jNowInSeconds = DateTimeUtils.nowInSeconds();
                cg0 cg0Var = (cg0) h10Var;
                cg0Var.f359l = cg0Var.f360m;
                cg0Var.f360m = jNowInSeconds;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) cg0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new kf0(jNowInSeconds), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new sv(k10Var), 7, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void a(iw this$0, dc0 message) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "message");
        this$0.getClass();
        zb0 zb0Var = message.f480a;
        z9 z9Var = ba.f257g;
        long jB = zb0Var.b();
        z9Var.getClass();
        e00 e00VarA = z9Var.a(new s9(jB));
        if (e00VarA != null) {
            ((ba) e00VarA).a(zb0Var.f2375a);
            ((tf) this$0.f937d).a(e00VarA);
        }
        Braze.Companion.getInstance(this$0.f934a).requestImmediateDataFlush();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) tv.f1892a, 7, (Object) null);
        ((tf) this$0.f937d).a(0L);
    }

    public static final void a(iw this$0, ds dsVar) {
        ve0 ve0Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dsVar, "<name for destructuring parameter 0>");
        l00 l00Var = dsVar.f516a;
        nq nqVar = ((tg) l00Var).f1866h;
        if (nqVar != null) {
            this$0.f939f.a(nqVar, false);
        }
        if (l00Var instanceof cp) {
            cp cpVar = (cp) l00Var;
            if (cpVar.f417j.c()) {
                if (this$0.f951r.compareAndSet(true, false)) {
                    ((cg0) this$0.f940g).b(new g50());
                }
                if (this$0.f952s.compareAndSet(true, false) && (ve0Var = this$0.f953t) != null) {
                    ((cg0) this$0.f940g).b(new m60(ve0Var.f2041a, ve0Var.f2042b));
                    this$0.f953t = null;
                }
                ((tf) this$0.f937d).a(true);
            }
            l50 l50Var = cpVar.f419l;
            if (l50Var != null) {
                this$0.f938e.a((Object) l50Var, false);
                if (l50Var.f1166a.has("push_token")) {
                    this$0.f938e.d();
                    this$0.f939f.c();
                }
            }
            ca caVar = cpVar.f420m;
            if (caVar != null) {
                for (e00 e00Var : caVar.f328a) {
                    v00 v00Var = this$0.f936c;
                    List events = CollectionsKt.listOf(e00Var);
                    Intrinsics.checkNotNullParameter(events, "events");
                    ((vw) v00Var).b(tr.class, new tr(2, events, null, null, 12));
                }
            }
            if (cpVar.f417j.f1076d != null) {
                vb0 vb0Var = this$0.f948o;
                vb0Var.getClass();
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) vb0Var, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) pb0.f1503a, 6, (Object) null);
                if (vb0Var.f2035c.isLocked()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) vb0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) qb0.f1593a, 7, (Object) null);
                    Mutex.DefaultImpls.unlock$default(vb0Var.f2035c, null, 1, null);
                }
            }
        }
        if (l00Var instanceof u60) {
            s60 s60Var = this$0.f950q;
            List events2 = ((u60) l00Var).f1917j;
            s60Var.getClass();
            Intrinsics.checkNotNullParameter(events2, "events");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) s60Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new r60(events2), 7, (Object) null);
            ReentrantLock reentrantLock = s60Var.f1743a;
            reentrantLock.lock();
            try {
                s60Var.f1744b.addAll(events2);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final void a(iw this$0, ec0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) zv.f2440a, 7, (Object) null);
        this$0.f954u.set(true);
        if (this$0.f948o.w()) {
            this$0.r();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) aw.f226a, 7, (Object) null);
        }
        if (!this$0.f948o.z()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) bw.f302a, 7, (Object) null);
        } else if (this$0.f956w.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) mv.f1320a, 7, (Object) null);
            tf tfVar = (tf) this$0.f949p.f781d;
            tfVar.getClass();
            BrazeLogger.brazelog$default(brazeLogger, (Object) tfVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) lf.f1192a, 7, (Object) null);
            tfVar.a(new ny(tfVar.f1843f, tfVar.f1842e.getBaseUrlForRequests(), tfVar.f1839b));
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) nv.f1398a, 7, (Object) null);
        }
        if (this$0.f948o.D()) {
            this$0.t();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) cw.f437a, 7, (Object) null);
        }
        if (this$0.f948o.x()) {
            this$0.s();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) dw.f526a, 7, (Object) null);
        }
        if (this$0.f948o.E()) {
            this$0.u();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) ew.f594a, 7, (Object) null);
        }
    }

    public static final void a(iw this$0, eh0 eh0Var) {
        ve0 ve0Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(eh0Var, "<name for destructuring parameter 0>");
        ((cg0) this$0.f940g).a(eh0Var.f576a);
        if (this$0.f951r.compareAndSet(true, false)) {
            ((cg0) this$0.f940g).b(new g50());
        }
        if (!this$0.f952s.compareAndSet(true, false) || (ve0Var = this$0.f953t) == null) {
            return;
        }
        ((cg0) this$0.f940g).b(new m60(ve0Var.f2041a, ve0Var.f2042b));
        this$0.f953t = null;
    }

    public static final void a(iw this$0, es esVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(esVar, "<name for destructuring parameter 0>");
        l00 l00Var = esVar.f589a;
        nq nqVar = ((tg) l00Var).f1866h;
        if (nqVar != null) {
            this$0.f939f.a(nqVar, true);
        }
        if (l00Var instanceof cp) {
            cp cpVar = (cp) l00Var;
            l50 l50Var = cpVar.f419l;
            if (l50Var != null) {
                this$0.f938e.a((Object) l50Var, true);
            }
            ca caVar = cpVar.f420m;
            if (caVar != null) {
                kx kxVar = this$0.f942i;
                Set events = caVar.f328a;
                kxVar.getClass();
                Intrinsics.checkNotNullParameter(events, "events");
                if (kxVar.f1146b) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) kxVar, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new gx(events), 6, (Object) null);
                } else {
                    kxVar.f1145a.a(events);
                }
            }
            if (cpVar.f417j.c()) {
                ((tf) this$0.f937d).a(false);
            }
            EnumSet enumSet = cpVar.f421n;
            if (enumSet != null) {
                this$0.f947n.a(enumSet);
            }
            if (cpVar.f417j.f1076d != null) {
                vb0 vb0Var = this$0.f948o;
                vb0Var.getClass();
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) vb0Var, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) pb0.f1503a, 6, (Object) null);
                if (vb0Var.f2035c.isLocked()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) vb0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) qb0.f1593a, 7, (Object) null);
                    Mutex.DefaultImpls.unlock$default(vb0Var.f2035c, null, 1, null);
                }
            }
        }
        if (l00Var instanceof u60) {
            this$0.f950q.a(((u60) l00Var).f1917j);
        }
    }

    public static final void a(iw this$0, gb0 gb0Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(gb0Var, "<name for destructuring parameter 0>");
        fb0 fb0Var = gb0Var.f739a;
        this$0.f943j.configureFromServerConfig(fb0Var);
        if (this$0.f954u.get()) {
            if (fb0Var.f642j) {
                this$0.r();
            }
            if (fb0Var.f645m) {
                if (this$0.f956w.compareAndSet(false, true)) {
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) mv.f1320a, 7, (Object) null);
                    tf tfVar = (tf) this$0.f949p.f781d;
                    tfVar.getClass();
                    BrazeLogger.brazelog$default(brazeLogger, (Object) tfVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) lf.f1192a, 7, (Object) null);
                    tfVar.a(new ny(tfVar.f1843f, tfVar.f1842e.getBaseUrlForRequests(), tfVar.f1839b));
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) nv.f1398a, 7, (Object) null);
                }
            }
            if (fb0Var.f647o) {
                this$0.t();
            }
            if (fb0Var.f652t) {
                this$0.s();
            }
            if (fb0Var.f657y) {
                this$0.u();
            }
        }
    }

    public static final void a(iw this$0, hy hyVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(hyVar, "<name for destructuring parameter 0>");
        ((vw) this$0.f944k).b(FeatureFlagsUpdatedEvent.class, this$0.f949p.a(hyVar.f859a));
    }

    public static final void a(iw this$0, uc0 throwable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(throwable, "storageException");
        try {
            tf tfVar = (tf) this$0.f937d;
            tfVar.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            tfVar.a((Throwable) throwable, false);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) fw.f690a, 4, (Object) null);
        }
    }

    public static final void a(iw this$0, uz uzVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(uzVar, "<name for destructuring parameter 0>");
        this$0.f943j.registerGeofences(uzVar.f1987a);
    }

    public static final void a(iw this$0, v40 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((tf) this$0.f937d).a(true);
        this$0.v();
    }

    public static final void a(iw this$0, ve0 message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "message");
        this$0.f952s.set(true);
        this$0.f953t = message;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) hw.f857a, 6, (Object) null);
        h00 h00Var = this$0.f937d;
        j50 j50Var = new j50();
        j50Var.f978c = Boolean.TRUE;
        ((tf) h00Var).a(j50Var);
    }

    public static final void a(iw this$0, xe0 xe0Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(xe0Var, "<name for destructuring parameter 0>");
        ((cg0) this$0.f940g).b(xe0Var.f2208a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(bo.app.iw r8, java.util.concurrent.Semaphore r9, java.lang.Throwable r10) {
        /*
            java.lang.String r0 = "this$0"
            r2 = r8
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r10 == 0) goto L30
            bo.app.h00 r1 = r2.f937d     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L29
            bo.app.tf r1 = (bo.app.tf) r1     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L29
            r1.getClass()     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L29
            java.lang.String r0 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L29
            r0 = 1
            r1.a(r10, r0)     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L29
            goto L30
        L1b:
            r4 = move-exception
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L29
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.E     // Catch: java.lang.Throwable -> L29
            bo.app.hv r6 = bo.app.hv.f856a     // Catch: java.lang.Throwable -> L29
            r7 = 4
            r8 = 0
            r5 = 0
            com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L29
            goto L33
        L29:
            r0 = move-exception
            if (r9 == 0) goto L2f
            r9.release()
        L2f:
            throw r0
        L30:
            if (r9 == 0) goto L38
            goto L35
        L33:
            if (r9 == 0) goto L38
        L35:
            r9.release()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.iw.a(bo.app.iw, java.util.concurrent.Semaphore, java.lang.Throwable):void");
    }

    public final IEventSubscriber a() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda13
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (am) obj);
            }
        };
    }

    public final IEventSubscriber b() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda9
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (ds) obj);
            }
        };
    }

    public final IEventSubscriber c() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda16
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (es) obj);
            }
        };
    }

    public final IEventSubscriber d() {
        final Semaphore semaphore = null;
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda12
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, semaphore, (Throwable) obj);
            }
        };
    }

    public final IEventSubscriber e() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (hy) obj);
            }
        };
    }

    public final IEventSubscriber f() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda14
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (uz) obj);
            }
        };
    }

    public final IEventSubscriber g() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (d30) obj);
            }
        };
    }

    public final IEventSubscriber h() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda5
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (v40) obj);
            }
        };
    }

    public final IEventSubscriber i() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (gb0) obj);
            }
        };
    }

    public final IEventSubscriber j() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) throws Throwable {
                iw.a(this.f$0, (ac0) obj);
            }
        };
    }

    public final IEventSubscriber k() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda6
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) throws Throwable {
                iw.a(this.f$0, (dc0) obj);
            }
        };
    }

    public final IEventSubscriber l() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (ec0) obj);
            }
        };
    }

    public final IEventSubscriber m() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (uc0) obj);
            }
        };
    }

    public final IEventSubscriber n() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda15
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (ve0) obj);
            }
        };
    }

    public final IEventSubscriber o() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda4
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (xe0) obj);
            }
        };
    }

    public final IEventSubscriber p() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda11
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (ch0) obj);
            }
        };
    }

    public final IEventSubscriber q() {
        return new IEventSubscriber() { // from class: bo.app.iw$$ExternalSyntheticLambda10
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                iw.a(this.f$0, (eh0) obj);
            }
        };
    }

    public final void r() {
        if (!this.f955v.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) jv.f1035a, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) iv.f933a, 7, (Object) null);
        h00 h00Var = this.f937d;
        kn knVar = this.f946m;
        h00.a(h00Var, knVar.f1125c, knVar.f1126d);
    }

    public final void s() {
        if (!this.f958y.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) lv.f1212a, 7, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) kv.f1144a, 7, (Object) null);
        tf tfVar = (tf) this.f937d;
        if (tfVar.f1843f.x()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) tfVar, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) nf.f1359a, 6, (Object) null);
            tfVar.a(new hs(tfVar.f1843f, tfVar.f1842e.getBaseUrlForRequests(), tfVar.f1839b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    public final void t() {
        ?? arrayList;
        if (!this.f957x.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) pv.f1553a, 7, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) ov.f1462a, 7, (Object) null);
        tf tfVar = (tf) this.f937d;
        if (tfVar.f1843f.D()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) tfVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) pf.f1512a, 7, (Object) null);
            vb0 vb0Var = tfVar.f1843f;
            String baseUrlForRequests = tfVar.f1842e.getBaseUrlForRequests();
            String str = tfVar.f1839b;
            b70 b70Var = tfVar.f1847j;
            long j2 = b70Var.f249c.getLong("lastUpdateTime", -1L) - b70Var.f247a.o();
            SharedPreferences pushMaxPrefs = b70Var.f248b;
            Intrinsics.checkNotNullExpressionValue(pushMaxPrefs, "pushMaxPrefs");
            ArrayList arrayList2 = new ArrayList();
            Map<String, ?> all = pushMaxPrefs.getAll();
            Intrinsics.checkNotNullExpressionValue(all, "this.all");
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (it.hasNext()) {
                String campaignId = it.next().getKey();
                Intrinsics.checkNotNullExpressionValue(campaignId, "campaignId");
                arrayList2.add(new z60(campaignId, pushMaxPrefs.getLong(campaignId, 0L)));
            }
            List list = CollectionsKt.toList(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (((z60) obj).f2357b > j2) {
                    arrayList3.add(obj);
                }
            }
            List list2 = CollectionsKt.toList(arrayList3);
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((z60) it2.next()).f2356a);
            }
            long j3 = tfVar.f1847j.f249c.getLong("lastUpdateTime", -1L);
            y60 y60Var = tfVar.f1849l;
            long jP = tfVar.f1843f.p();
            y60Var.getClass();
            if (jP <= 0) {
                arrayList = CollectionsKt.emptyList();
            } else {
                long jNowInSeconds = DateTimeUtils.nowInSeconds() - jP;
                arrayList = new ArrayList();
                Map<String, ?> all2 = y60Var.f2273a.getAll();
                Intrinsics.checkNotNullExpressionValue(all2, "storagePrefs.all");
                for (Map.Entry<String, ?> entry : all2.entrySet()) {
                    Long l2 = (Long) entry.getValue();
                    if (l2 != null && l2.longValue() >= jNowInSeconds) {
                        String key = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key, "it.key");
                        arrayList.add(key);
                    }
                }
            }
            tfVar.a(new f70(vb0Var, baseUrlForRequests, str, arrayList4, j3, arrayList));
        }
    }

    public final void u() {
        if (!this.f959z.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) rv.f1710a, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) qv.f1628a, 7, (Object) null);
        ((vw) this.f936c).b(ca0.class, new ca0());
    }

    public final void v() {
        j50 j50Var = new j50();
        if (((tf) this.f937d).f1857t.get()) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) uv.f1978a, 7, (Object) null);
            j50Var.f977b = Boolean.TRUE;
            tf tfVar = (tf) this.f937d;
            tfVar.f1857t.set(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) tfVar, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new rf(tfVar), 6, (Object) null);
        }
        if (((tf) this.f937d).f1856s.get()) {
            this.f951r.set(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) vv.f2072a, 7, (Object) null);
            j50Var.f978c = Boolean.TRUE;
            ((tf) this.f937d).a(false);
        }
        Boolean bool = j50Var.f978c;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2) || Intrinsics.areEqual(j50Var.f977b, bool2)) {
            ((tf) this.f937d).a(j50Var);
        }
    }
}
