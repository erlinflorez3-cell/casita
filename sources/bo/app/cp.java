package bo.app;

import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import io.sentry.protocol.App;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class cp extends tg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k50 f417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SdkFlavor f418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l50 f419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ca f420m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EnumSet f421n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f422o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f423p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k00 f424q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp(vb0 serverConfigStorageProvider, String urlBase, k50 outboundRespondWith) {
        super(new b90(urlBase + "data"), serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(outboundRespondWith, "outboundRespondWith");
        this.f417j = outboundRespondWith;
        this.f424q = k00.V3_DATA;
    }

    @Override // bo.app.tg, bo.app.b10
    public final void a(v00 internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        if (this.f417j.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) ap.f219a, 7, (Object) null);
            ((vw) internalPublisher).b(te0.class, new te0(this));
        }
    }

    @Override // bo.app.tg, bo.app.b10
    public final void a(vw internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        if (this.f417j.c()) {
            internalPublisher.b(ue0.class, new ue0(this));
        }
    }

    @Override // bo.app.tg, bo.app.l00
    public final void a(HashMap existingHeaders) {
        boolean z2;
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        if (this.f417j.isEmpty()) {
            return;
        }
        if (this.f417j.b()) {
            existingHeaders.put("X-Braze-FeedRequest", "true");
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f417j.c()) {
            existingHeaders.put("X-Braze-TriggersRequest", "true");
        } else if (!z2) {
            return;
        }
        existingHeaders.put("X-Braze-DataRequest", "true");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    @Override // bo.app.l00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r2 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            bo.app.nq r0 = r2.f1866h
            r1.add(r0)
            bo.app.l50 r0 = r2.f419l
            r1.add(r0)
            bo.app.ca r0 = r2.f420m
            r1.add(r0)
            bo.app.k50 r0 = r2.f417j
            r1.add(r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L45
        L1f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            bo.app.nq r0 = r2.f1866h
            r1.add(r0)
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r1.next()
            bo.app.u00 r0 = (bo.app.u00) r0
            if (r0 == 0) goto L2d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L41:
            r0 = 0
        L42:
            return r0
        L43:
            r0 = 1
            goto L42
        L45:
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.next()
            bo.app.u00 r0 = (bo.app.u00) r0
            if (r0 == 0) goto L49
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L41
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.cp.a():boolean");
    }

    @Override // bo.app.tg, bo.app.l00
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            String str = this.f422o;
            if (str != null) {
                jSONObjectB.put(App.JsonKeys.APP_VERSION, str);
            }
            String str2 = this.f423p;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                jSONObjectB.put("app_version_code", this.f423p);
            }
            l50 l50Var = this.f419l;
            if (l50Var != null && !l50Var.isEmpty()) {
                JSONArray jsonArrayForJsonPut = l50Var.f1167b;
                Intrinsics.checkNotNullExpressionValue(jsonArrayForJsonPut, "jsonArrayForJsonPut");
                jSONObjectB.put("attributes", jsonArrayForJsonPut);
            }
            ca caVar = this.f420m;
            if (caVar != null && !caVar.f329b) {
                jSONObjectB.put("events", JsonUtils.constructJsonArray(caVar.f328a));
            }
            SdkFlavor sdkFlavor = this.f418k;
            if (sdkFlavor != null) {
                jSONObjectB.put("sdk_flavor", sdkFlavor.forJsonPut());
            }
            EnumSet<BrazeSdkMetadata> set = this.f421n;
            if (set != null) {
                BrazeSdkMetadata.Companion.getClass();
                Intrinsics.checkNotNullParameter(set, "set");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                for (BrazeSdkMetadata it : set) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    arrayList.add(it.jsonKey);
                }
                jSONObjectB.put("sdk_metadata", new JSONArray((Collection) CollectionsKt.sorted(arrayList)));
            }
            jSONObjectB.put("respond_with", this.f417j.forJsonPut());
            return jSONObjectB;
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) bp.f295a, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l00
    public final k00 c() {
        return this.f424q;
    }

    public final k50 f() {
        return this.f417j;
    }
}
