package bo.app;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public enum k00 {
    CONTENT_CARD_SYNC("content_cards/sync"),
    FEATURE_FLAG_SYNC("feature_flags/sync"),
    V3_DATA("data"),
    TEMPLATE_REQUEST("template"),
    PUSH_DELIVERY_EVENTS("push/delivery_events"),
    GEOFENCE_REFRESH("geofence/request"),
    GEOFENCE_REPORT("geofence/report"),
    PUSH_REDELIVER("push/redeliver"),
    SDK_DEBUGGER_INIT("debugger/init"),
    SDK_DEBUGGER_LOG("debugger/log"),
    DUST_CONFIG("dust/config");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j00 f1043b = new j00();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f1044c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1057a;

    static {
        k00[] k00VarArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(k00VarArrValues.length), 16));
        for (k00 k00Var : k00VarArrValues) {
            linkedHashMap.put(k00Var.f1057a, k00Var);
        }
        f1044c = linkedHashMap;
    }

    k00(String str) {
        this.f1057a = str;
    }
}
