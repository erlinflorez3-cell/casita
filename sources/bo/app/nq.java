package bo.app;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class nq implements IPutIntoJson, u00 {

    /* JADX INFO: renamed from: n */
    public static final lq f1377n = new lq();

    /* JADX INFO: renamed from: a */
    public final BrazeConfigurationProvider f1378a;

    /* JADX INFO: renamed from: b */
    public final String f1379b;

    /* JADX INFO: renamed from: c */
    public final String f1380c;

    /* JADX INFO: renamed from: d */
    public final String f1381d;

    /* JADX INFO: renamed from: e */
    public final String f1382e;

    /* JADX INFO: renamed from: f */
    public final String f1383f;

    /* JADX INFO: renamed from: g */
    public final String f1384g;

    /* JADX INFO: renamed from: h */
    public final String f1385h;

    /* JADX INFO: renamed from: i */
    public final Boolean f1386i;

    /* JADX INFO: renamed from: j */
    public final Boolean f1387j;

    /* JADX INFO: renamed from: k */
    public final String f1388k;

    /* JADX INFO: renamed from: l */
    public final Boolean f1389l;

    /* JADX INFO: renamed from: m */
    public boolean f1390m;

    public nq(BrazeConfigurationProvider configurationProvider, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, Boolean bool3) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f1378a = configurationProvider;
        this.f1379b = str;
        this.f1380c = str2;
        this.f1381d = str3;
        this.f1382e = str4;
        this.f1383f = str5;
        this.f1384g = str6;
        this.f1385h = str7;
        this.f1386i = bool;
        this.f1387j = bool2;
        this.f1388k = str8;
        this.f1389l = bool3;
    }

    @Override // com.braze.models.IPutIntoJson
    public final JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            lq lqVar = f1377n;
            lqVar.a(this.f1378a, jSONObject, DeviceKey.ANDROID_VERSION, this.f1379b);
            lqVar.a(this.f1378a, jSONObject, DeviceKey.CARRIER, this.f1380c);
            lqVar.a(this.f1378a, jSONObject, DeviceKey.BRAND, this.f1381d);
            lqVar.a(this.f1378a, jSONObject, DeviceKey.MODEL, this.f1382e);
            lqVar.a(this.f1378a, jSONObject, DeviceKey.RESOLUTION, this.f1385h);
            lqVar.a(this.f1378a, jSONObject, DeviceKey.LOCALE, this.f1383f);
            lqVar.a(this.f1378a, jSONObject, DeviceKey.NOTIFICATIONS_ENABLED, this.f1386i);
            lqVar.a(this.f1378a, jSONObject, DeviceKey.IS_BACKGROUND_RESTRICTED, this.f1387j);
            String str = this.f1388k;
            if (str != null && !StringsKt.isBlank(str)) {
                lqVar.a(this.f1378a, jSONObject, DeviceKey.GOOGLE_ADVERTISING_ID, this.f1388k);
            }
            Boolean bool = this.f1389l;
            if (bool != null) {
                lqVar.a(this.f1378a, jSONObject, DeviceKey.AD_TRACKING_ENABLED, bool);
            }
            String str2 = this.f1384g;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                lqVar.a(this.f1378a, jSONObject, DeviceKey.TIMEZONE, this.f1384g);
            }
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) mq.f1314a, 4, (Object) null);
        }
        return jSONObject;
    }

    @Override // bo.app.u00
    public final boolean isEmpty() {
        return forJsonPut().length() == 0;
    }
}
