package bo.app;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONArray f503d;

    public dm(String serializedCardJson) {
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        this.f502c = false;
        this.f500a = -1L;
        this.f501b = -1L;
        this.f503d = new JSONArray().put(new JSONObject(serializedCardJson));
    }

    public dm(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f500a = jsonObject.optLong("last_card_updated_at", -1L);
        this.f501b = jsonObject.optLong("last_full_sync_at", -1L);
        this.f502c = jsonObject.optBoolean("full_sync", false);
        this.f503d = jsonObject.optJSONArray("cards");
    }
}
