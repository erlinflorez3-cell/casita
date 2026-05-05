package com.braze.support;

import bo.app.nz;
import bo.app.oz;
import bo.app.pz;
import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f2705a = new g();

    public static final ArrayList a(JSONArray geofenceJson) {
        Intrinsics.checkNotNullParameter(geofenceJson, "geofenceJson");
        ArrayList arrayList = new ArrayList();
        int length = geofenceJson.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject = geofenceJson.optJSONObject(i2);
            if (jSONObjectOptJSONObject == null) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f2705a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) nz.f1404a, 6, (Object) null);
                } catch (JSONException e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f2705a, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new oz(jSONObjectOptJSONObject), 4, (Object) null);
                } catch (Exception e3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f2705a, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new pz(jSONObjectOptJSONObject), 4, (Object) null);
                }
            } else {
                arrayList.add(new BrazeGeofence(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }
}
