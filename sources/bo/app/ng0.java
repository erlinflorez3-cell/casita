package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ng0 {

    /* JADX INFO: renamed from: a */
    public static final ng0 f1362a = new ng0();

    /* JADX INFO: renamed from: b */
    public static final String f1363b = BrazeLogger.getBrazeLogTag((Class<?>) ng0.class);

    public static InAppMessageBase a(JSONObject jSONObject, h00 brazeManager) {
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f1363b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) eg0.f573a, 14, (Object) null);
                return null;
            }
            String string = jSONObject.getString("type");
            if (!Intrinsics.areEqual(string, "inapp")) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f1363b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new fg0(string), 12, (Object) null);
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null) {
                return null;
            }
            return com.braze.support.j.a(jSONObject2, brazeManager);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f1363b, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new gg0(jSONObject), 8, (Object) null);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:69:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList a(org.json.JSONArray r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.ng0.a(org.json.JSONArray):java.util.ArrayList");
    }

    public final ArrayList a(JSONArray jSONArray, h00 brazeManager) {
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            if (jSONArray == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f1363b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) lg0.f1195a, 14, (Object) null);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject actionJson = jSONArray.getJSONObject(i2);
                Intrinsics.checkNotNullExpressionValue(actionJson, "actionJson");
                dh0 dh0VarB = b(actionJson, brazeManager);
                if (dh0VarB != null) {
                    arrayList.add(dh0VarB);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f1363b, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new mg0(jSONArray), 8, (Object) null);
            return null;
        }
    }

    public final dh0 b(JSONObject actionJson, h00 brazeManager) {
        String string;
        Intrinsics.checkNotNullParameter(actionJson, "actionJson");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            string = actionJson.getString("type");
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f1363b, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new kg0(actionJson), 8, (Object) null);
        }
        if (Intrinsics.areEqual(string, "inapp")) {
            return new q30(actionJson, brazeManager);
        }
        if (Intrinsics.areEqual(string, "templated_iam")) {
            return new md0(actionJson, brazeManager);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new jg0(string), 6, (Object) null);
        return null;
    }
}
