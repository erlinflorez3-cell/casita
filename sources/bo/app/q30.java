package bo.app;

import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class q30 extends dh0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InAppMessageBase f1570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f1571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h00 f1572i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(JSONObject json, h00 brazeManager) throws JSONException {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new h30(json), 6, (Object) null);
        JSONObject inAppMessageObject = json.getJSONObject("data");
        this.f1572i = brazeManager;
        this.f1571h = inAppMessageObject;
        Intrinsics.checkNotNullExpressionValue(inAppMessageObject, "inAppMessageObject");
        InAppMessageBase inAppMessageBaseA = com.braze.support.j.a(inAppMessageObject, brazeManager);
        this.f1570g = inAppMessageBaseA;
        if (inAppMessageBaseA != null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) i30.f868a, 6, (Object) null);
        throw new IllegalArgumentException("Failed to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(json));
    }

    @Override // bo.app.k10
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        InAppMessageBase inAppMessageBase = this.f1570g;
        List<String> remoteAssetPathsForPrefetch = inAppMessageBase != null ? inAppMessageBase.getRemoteAssetPathsForPrefetch() : null;
        if (remoteAssetPathsForPrefetch == null || remoteAssetPathsForPrefetch.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) o30.f1415a, 7, (Object) null);
            return arrayList;
        }
        InAppMessageBase inAppMessageBase2 = this.f1570g;
        MessageType messageType = inAppMessageBase2 != null ? inAppMessageBase2.getMessageType() : null;
        int i2 = messageType == null ? -1 : j30.f968a[messageType.ordinal()];
        if (i2 == 1) {
            arrayList.add(new s70(t70.ZIP, remoteAssetPathsForPrefetch.get(0)));
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            arrayList.add(new s70(t70.IMAGE, remoteAssetPathsForPrefetch.get(0)));
        } else if (i2 != 5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new p30(this), 6, (Object) null);
        } else {
            Iterator<String> it = remoteAssetPathsForPrefetch.iterator();
            while (it.hasNext()) {
                arrayList.add(new s70(t70.FILE, it.next()));
            }
        }
        return arrayList;
    }

    @Override // bo.app.k10
    public final void a(Context context, v00 internalEventPublisher, g10 triggerEvent, long j2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k30(this), 7, (Object) null);
            JSONObject jSONObject = this.f1571h;
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new l30(triggerEvent), 6, (Object) null);
                return;
            }
            InAppMessageBase inAppMessageBaseA = com.braze.support.j.a(jSONObject, this.f1572i);
            String strA = triggerEvent.a();
            int i2 = od0.f1438e;
            if (Intrinsics.areEqual(strA, "test")) {
                if (inAppMessageBaseA != null) {
                    inAppMessageBaseA.setTestSend(true);
                }
                this.f1571h.put(InAppMessageBase.IS_TEST_SEND, true);
            }
            if (inAppMessageBaseA == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new m30(triggerEvent), 6, (Object) null);
                return;
            }
            inAppMessageBaseA.setLocalPrefetchedAssetPaths(MapsKt.toMap(this.f494f));
            inAppMessageBaseA.setExpirationTimestamp(j2);
            ((vw) internalEventPublisher).b(d30.class, new d30(triggerEvent, this, inAppMessageBaseA, ((tf) this.f1572i).f1839b));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) n30.f1336a, 4, (Object) null);
        }
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        try {
            JSONObject jSONObjectB = super.b();
            if (jSONObjectB == null) {
                return null;
            }
            InAppMessageBase inAppMessageBase = this.f1570g;
            jSONObjectB.put("data", inAppMessageBase != null ? inAppMessageBase.forJsonPut() : null);
            jSONObjectB.put("type", "inapp");
            return jSONObjectB;
        } catch (JSONException unused) {
            return null;
        }
    }
}
