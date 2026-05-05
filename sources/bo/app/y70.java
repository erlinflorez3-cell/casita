package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class y70 implements c10 {

    /* JADX INFO: renamed from: a */
    public final x00 f2278a;

    /* JADX INFO: renamed from: b */
    public final v00 f2279b;

    /* JADX INFO: renamed from: c */
    public final v00 f2280c;

    /* JADX INFO: renamed from: d */
    public final xy f2281d;

    /* JADX INFO: renamed from: e */
    public final vb0 f2282e;

    /* JADX INFO: renamed from: f */
    public final kn f2283f;

    /* JADX INFO: renamed from: g */
    public final h00 f2284g;

    /* JADX INFO: renamed from: h */
    public final ju f2285h;

    public y70(o40 httpConnector, vw internalEventPublisher, v00 externalEventPublisher, xy feedStorageProvider, vb0 serverConfigStorageProvider, kn contentCardsStorageProvider, h00 brazeManager, ju endpointMetadataProvider) {
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(feedStorageProvider, "feedStorageProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(contentCardsStorageProvider, "contentCardsStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(endpointMetadataProvider, "endpointMetadataProvider");
        this.f2278a = httpConnector;
        this.f2279b = internalEventPublisher;
        this.f2280c = externalEventPublisher;
        this.f2281d = feedStorageProvider;
        this.f2282e = serverConfigStorageProvider;
        this.f2283f = contentCardsStorageProvider;
        this.f2284g = brazeManager;
        this.f2285h = endpointMetadataProvider;
    }

    public final void a(z80 z80Var, a80 a80Var) {
        n fh0Var;
        x00 x00Var = this.f2278a;
        v00 v00Var = this.f2279b;
        v00 v00Var2 = this.f2280c;
        xy xyVar = this.f2281d;
        h00 h00Var = this.f2284g;
        vb0 vb0Var = this.f2282e;
        kn knVar = this.f2283f;
        ju juVar = this.f2285h;
        ih ihVar = new ih(z80Var, x00Var, v00Var, v00Var2, xyVar, h00Var, vb0Var, knVar, juVar, a80Var);
        ((tg) ihVar.f913g).f1862d = Long.valueOf(DateTimeUtils.nowInSeconds());
        b90 b90VarE = ((tg) ihVar.f913g).e();
        JSONObject jSONObjectB = ihVar.f913g.b();
        if (jSONObjectB == null) {
            ihVar = ihVar;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ihVar, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new wg(b90VarE), 6, (Object) null);
            fh0Var = new fh0(ihVar.f913g, new w00(-1, (Map) null, 6));
        } else {
            ihVar.f912f.put("X-Braze-Last-Req-Ms-Ago", String.valueOf(juVar.a(b90VarE)));
            ihVar.f912f.put("X-Braze-Req-Attempt", String.valueOf(juVar.b(b90VarE)));
            ihVar.f912f.put("X-Braze-Req-Tokens-Remaining", String.valueOf(z80Var.f2367e));
            Integer num = z80Var.f2368f;
            if (num != null) {
                ihVar.f912f.put("X-Braze-Ept-Req-Tokens-Remaining", String.valueOf(num.intValue()));
            }
            int i2 = c00.f307a;
            w00 w00VarA = x00Var.a(b90VarE, ihVar.f912f, jSONObjectB);
            if (w00VarA.f2090c != null) {
                fh0Var = new s50(ihVar.f913g, w00VarA, h00Var);
            } else {
                ihVar = ihVar;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ihVar, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) xg.f2211a, 6, (Object) null);
                ((vw) v00Var2).b(BrazeNetworkFailureEvent.class, new BrazeNetworkFailureEvent(ihVar.f913g, w00VarA));
                fh0Var = new fh0(ihVar.f913g, w00VarA);
            }
        }
        if (!(fh0Var instanceof s50)) {
            ih ihVar2 = ihVar;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ihVar2, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) hh.f831a, 6, (Object) null);
            y40 y40Var = new y40(ihVar2.f913g, fh0Var.f1327a);
            ihVar2.f913g.a(v00Var, v00Var2, y40Var);
            ((vw) v00Var).b(ds.class, new ds(ihVar2.f913g));
            ihVar2.a(y40Var);
            a80Var.a(fh0Var);
            return;
        }
        s50 apiResponse = (s50) fh0Var;
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        d10 d10Var = apiResponse.f1730d;
        if (d10Var == null) {
            juVar.c(((tg) ihVar.f913g).e());
            ihVar.f913g.a(v00Var, v00Var2, apiResponse);
            a80Var.a(apiResponse);
        } else {
            ihVar.a(d10Var);
            ihVar.f913g.a(v00Var, v00Var2, apiResponse.f1730d);
            a80Var.a((n) apiResponse);
        }
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        String str = ((tf) h00Var).f1839b;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ihVar, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new fh(str), 6, (Object) null);
        JSONArray jSONArray = apiResponse.f1739m;
        if (jSONArray != null) {
            vg.a(jSONArray, new ah(ihVar, jSONArray, str));
        }
        dm dmVar = apiResponse.f1732f;
        if (dmVar != null) {
            vg.a(dmVar, new yg(ihVar, dmVar, str));
        }
        fb0 fb0Var = apiResponse.f1735i;
        if (fb0Var != null) {
            vg.a(fb0Var, new ch(ihVar, fb0Var));
        }
        ArrayList arrayList = apiResponse.f1734h;
        if (arrayList != null) {
            vg.a(arrayList, new eh(ihVar, arrayList));
        }
        ArrayList arrayList2 = apiResponse.f1736j;
        if (arrayList2 != null) {
            vg.a(arrayList2, new bh(ihVar, arrayList2));
        }
        JSONArray jSONArray2 = apiResponse.f1737k;
        if (jSONArray2 != null) {
            vg.a(jSONArray2, new zg(ihVar, jSONArray2));
        }
        InAppMessageBase inAppMessageBase = apiResponse.f1733g;
        if (inAppMessageBase != null) {
            vg.a(inAppMessageBase, new dh(ihVar, inAppMessageBase, str));
        }
        String str2 = apiResponse.f1738l;
        if (str2 != null) {
            ((vw) v00Var).b(ys.class, new ys(str2));
        }
        r90 r90Var = apiResponse.f1741o;
        if (r90Var != null) {
            ((vw) v00Var).b(x90.class, new x90(r90Var));
        }
        if (apiResponse.f1730d instanceof i90) {
            ((vw) v00Var).b(ds.class, new ds(ihVar.f913g));
        } else {
            ((vw) v00Var).b(es.class, new es(ihVar.f913g));
        }
    }

    @Override // bo.app.c10
    public final void a(z80 requestInfo, a80 requestDispatchCallback, boolean z2) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(requestDispatchCallback, "requestDispatchCallback");
        if (z2) {
            a(requestInfo, requestDispatchCallback);
        } else {
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new x70(this, requestInfo, requestDispatchCallback, null), 3, null);
        }
    }
}
