package bo.app;

import android.content.Context;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class md0 extends dh0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h00 f1278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f1280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f1281j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md0(JSONObject json, h00 brazeManager) throws JSONException {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f1280i = new ArrayList();
        this.f1281j = -1L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hd0(json), 7, (Object) null);
        this.f1278g = brazeManager;
        JSONObject jSONObject = json.getJSONObject("data");
        String string = jSONObject.getString(InAppMessageBase.TRIGGER_ID);
        Intrinsics.checkNotNullExpressionValue(string, "dataObject.getString(TRIGGER_ID)");
        this.f1279h = string;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("prefetch_image_urls");
        if (jSONArrayOptJSONArray != null) {
            a(jSONArrayOptJSONArray, t70.IMAGE);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("prefetch_zip_urls");
        if (jSONArrayOptJSONArray2 != null) {
            a(jSONArrayOptJSONArray2, t70.ZIP);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("prefetch_file_urls");
        if (jSONArrayOptJSONArray3 != null) {
            a(jSONArrayOptJSONArray3, t70.FILE);
        }
    }

    @Override // bo.app.k10
    public final ArrayList a() {
        return new ArrayList(this.f1280i);
    }

    @Override // bo.app.k10
    public final void a(Context context, v00 internalEventPublisher, g10 triggerEvent, long j2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.f1281j = j2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ld0(this), 7, (Object) null);
        tf tfVar = (tf) this.f1278g;
        tfVar.getClass();
        Intrinsics.checkNotNullParameter(this, "templatedTriggeredAction");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        tfVar.a(new gd0(tfVar.f1843f, tfVar.f1842e.getBaseUrlForRequests(), this, triggerEvent, tfVar.f1839b));
    }

    public final void a(JSONArray jSONArray, t70 t70Var) {
        Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new id0(jSONArray)), new jd0(jSONArray)).iterator();
        while (it.hasNext()) {
            this.f1280i.add(new s70(t70Var, (String) it.next()));
        }
    }

    public final String d() {
        return this.f1279h;
    }

    public final long e() {
        return this.f1281j;
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        try {
            JSONObject jSONObjectB = super.b();
            if (jSONObjectB == null) {
                return null;
            }
            jSONObjectB.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.f1279h);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (s70 s70Var : this.f1280i) {
                int iOrdinal = s70Var.f1747a.ordinal();
                if (iOrdinal == 0) {
                    jSONArray2.put(s70Var.f1748b);
                } else if (iOrdinal == 1) {
                    jSONArray.put(s70Var.f1748b);
                } else if (iOrdinal == 2) {
                    jSONArray3.put(s70Var.f1748b);
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            jSONObjectB.put("data", jSONObject);
            return jSONObjectB;
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) kd0.f1103a, 4, (Object) null);
            return null;
        }
    }
}
