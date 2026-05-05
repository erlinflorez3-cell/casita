package bo.app;

import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cs {

    /* JADX INFO: renamed from: d */
    public static final wr f429d = new wr();

    /* JADX INFO: renamed from: a */
    public final l10 f430a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f431b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f432c;

    public cs(l10 udm) {
        Intrinsics.checkNotNullParameter(udm, "udm");
        this.f430a = udm;
        this.f431b = new ConcurrentHashMap();
        this.f432c = new ConcurrentHashMap();
        a().c(new IEventSubscriber() { // from class: bo.app.cs$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                cs.a(this.f$0, (tr) obj);
            }
        }, tr.class);
    }

    public static final void a(cs this$0, tr trVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(trVar, "<name for destructuring parameter 0>");
        int i2 = trVar.f1885a;
        List<e00> events = trVar.f1886b;
        cc0 cc0Var = trVar.f1887c;
        int iA = gc0.a(i2);
        if (iA == 0) {
            this$0.getClass();
            Intrinsics.checkNotNullParameter(events, "events");
            for (e00 e00Var : events) {
                this$0.f432c.putIfAbsent(((ba) e00Var).f262d, e00Var);
            }
            return;
        }
        if (iA == 1) {
            this$0.getClass();
            Intrinsics.checkNotNullParameter(events, "events");
            for (e00 e00Var2 : events) {
                this$0.f431b.putIfAbsent(((ba) e00Var2).f262d, e00Var2);
            }
            return;
        }
        if (iA != 2) {
            return;
        }
        if (cc0Var == null) {
            this$0.getClass();
            return;
        }
        ConcurrentHashMap concurrentHashMap = this$0.f432c;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) bs.f298a, 7, (Object) null);
        Collection collectionValues = concurrentHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "events.values");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((ba) ((e00) it.next())).a(cc0Var);
        }
        this$0.f431b.putAll(concurrentHashMap);
        Set setKeySet = concurrentHashMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "events.keys");
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            this$0.f432c.remove((String) it2.next());
        }
    }

    public final l00 a(l00 brazeRequest) {
        LinkedHashSet linkedHashSet;
        ca caVar;
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        wr wrVar = f429d;
        ci0 ci0Var = (ci0) this.f430a;
        BrazeConfigurationProvider configurationProvider = ci0Var.f383b;
        k90 sdkAuthenticationCache = ci0Var.f399r;
        String deviceId = ((jr) ci0Var.f384c).a();
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(sdkAuthenticationCache, "sdkAuthenticationCache");
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        tg tgVar = (tg) brazeRequest;
        tgVar.f1863e = deviceId;
        tgVar.f1864f = configurationProvider.getBrazeApiKey().f1746a;
        tgVar.f1865g = Constants.BRAZE_SDK_VERSION;
        tgVar.f1862d = Long.valueOf(DateTimeUtils.nowInSeconds());
        if (configurationProvider.isSdkAuthenticationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) wrVar, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new ur(sdkAuthenticationCache), 6, (Object) null);
            tgVar.f1867i = sdkAuthenticationCache.f1092d.getString("auth_signature", null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) wrVar, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) vr.f2061a, 6, (Object) null);
        }
        if (brazeRequest instanceof cp) {
            cp dataSyncRequest = (cp) brazeRequest;
            Intrinsics.checkNotNullParameter(dataSyncRequest, "dataSyncRequest");
            ci0 ci0Var2 = (ci0) this.f430a;
            dataSyncRequest.f422o = ((hr) ci0Var2.f386e).f847c;
            dataSyncRequest.f418k = ci0Var2.f383b.getSdkFlavor();
            dataSyncRequest.f423p = ((hr) ((ci0) this.f430a).f386e).b();
            ci0 ci0Var3 = (ci0) this.f430a;
            o00 o00Var = ci0Var3.f386e;
            zq deviceCache = ci0Var3.j();
            hr hrVar = (hr) o00Var;
            hrVar.getClass();
            Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
            deviceCache.f2427e = hrVar.a();
            nq nqVar = (nq) deviceCache.a();
            dataSyncRequest.f1866h = nqVar;
            if (nqVar != null && nqVar.f1390m) {
                if (((ci0) this.f430a).f383b.getShouldOptInWhenPushAuthorized()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) xr.f2236a, 6, (Object) null);
                    ((ci0) this.f430a).x().a(NotificationSubscriptionType.OPTED_IN);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) yr.f2327a, 6, (Object) null);
                }
            }
            if (nqVar != null && nqVar.forJsonPut().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey())) {
                ((ci0) this.f430a).x().d();
            }
            dataSyncRequest.f419l = (l50) ((ci0) this.f430a).x().a();
            synchronized (this) {
                Collection collectionValues = this.f431b.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "brazeEventMap.values");
                linkedHashSet = new LinkedHashSet();
                Iterator it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e00 event = (e00) it.next();
                    Intrinsics.checkNotNullExpressionValue(event, "event");
                    linkedHashSet.add(event);
                    collectionValues.remove(event);
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zr(event), 7, (Object) null);
                    if (linkedHashSet.size() >= 32) {
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) as.f222a, 6, (Object) null);
                        break;
                    }
                }
                caVar = new ca(linkedHashSet);
            }
            dataSyncRequest.f420m = caVar;
            if (!linkedHashSet.isEmpty()) {
                Iterator it2 = linkedHashSet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((ba) ((e00) it2.next())).f259a == lx.SESSION_START) {
                        ci0 ci0Var4 = (ci0) this.f430a;
                        dataSyncRequest.f421n = ci0Var4.f402u.b(ci0Var4.f383b.getSdkMetadata());
                        break;
                    }
                }
            }
        } else if (brazeRequest instanceof u60) {
            tgVar.f1866h = ((hr) ((ci0) this.f430a).f386e).a();
            ArrayList arrayListA = ((ci0) this.f430a).f385d.a();
            Intrinsics.checkNotNullParameter(arrayListA, "<set-?>");
            ((u60) brazeRequest).f1917j = arrayListA;
        } else if (brazeRequest instanceof mn) {
            kn knVar = ((ci0) this.f430a).B;
            mn mnVar = (mn) brazeRequest;
            mnVar.f1304j = knVar.f1125c;
            mnVar.f1305k = knVar.f1126d;
        }
        return brazeRequest;
    }

    public final vw a() {
        return ((ci0) this.f430a).f392k;
    }

    public final vb0 b() {
        return ((ci0) this.f430a).f389h;
    }
}
