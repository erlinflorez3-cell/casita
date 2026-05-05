package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import com.drew.metadata.exif.ExifDirectoryBase;
import io.reactivex.annotations.SchedulerSupport;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class uh0 extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z00 f1945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ka0 f1946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferences f1947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SharedPreferences f1948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1949f;

    public /* synthetic */ uh0(Context context, z00 z00Var, ka0 ka0Var) {
        this(context, z00Var, ka0Var, null, null);
    }

    public uh0(Context context, z00 z00Var, ka0 ka0Var, String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Xd("5BBI;OL", (short) (OY.Xd() ^ 16012)));
        Intrinsics.checkNotNullParameter(z00Var, Wg.vd("qwrhOcbelniYi_bbUs\u0004q]\u0001z\u0003rnlz", (short) (OY.Xd() ^ 20121)));
        short sXd = (short) (Od.Xd() ^ (-10689));
        short sXd2 = (short) (Od.Xd() ^ (-27270));
        int[] iArr = new int["5%+\u0004,\u001e\u001e'\u001f&\u001d%*\u0005&\"(\u001a\u0014\u0014 ".length()];
        QB qb = new QB("5%+\u0004,\u001e\u001e'\u001f&\u001d%*\u0005&\"(\u001a\u0014\u0014 ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(ka0Var, new String(iArr, 0, i2));
        this.f1945b = z00Var;
        this.f1946c = ka0Var;
        this.f1949f = str;
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, str, str2);
        String str3 = yg.hg.Vd("\u001f*'f\u0019'&\u0017#,_$$\u001e \u000e\u0013\u0010W\u001e\u001b\f\u0018\u0004\u0007\u0004\u0005\t\u0005L\u0014O", (short) (Od.Xd() ^ (-28002)), (short) (Od.Xd() ^ (-16361))) + cacheFileSuffix;
        short sXd3 = (short) (FB.Xd() ^ 24172);
        int[] iArr2 = new int["\u001f+ -)\"\u001cd\u0019$\"'\u0017\u001f$\\p\u001c\u001a\u001f\u000f!\u001c".length()];
        QB qb2 = new QB("\u001f+ -)\"\u001cd\u0019$\"'\u0017\u001f$\\p\u001c\u001a\u001f\u000f!\u001c");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = {str3, 0};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Yd("\t\b\u0018w\u000e\b\u001a\u000e\u000ez\u001e\u0012\u0014\u0014\"\u0016 \u0016\u0019(", (short) (C1633zX.Xd() ^ (-4118))), Class.forName(C1561oA.yd("XNbL ]Q]M\u00137W\\RVN", (short) (FB.Xd() ^ 22472))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            short sXd4 = (short) (OY.Xd() ^ 8279);
            short sXd5 = (short) (OY.Xd() ^ 15432);
            int[] iArr3 = new int["jww~p\u0005\u0002<vu\u0006e{u\b{{h\f\u007f\u0002\u0002\u0010\u0004ᑝ\u0019\u0016Ppsik\u0007x{s\u0002m\u0002s9PQRSTUVWa".length()];
            QB qb3 = new QB("jww~p\u0005\u0002<vu\u0006e{u\b{{h\f\u007f\u0002\u0002\u0010\u0004ᑝ\u0019\u0016Ppsik\u0007x{s\u0002m\u0002s9PQRSTUVWa");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) + sXd5);
                i4++;
            }
            String str4 = new String(iArr3, 0, i4);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, str4);
            this.f1947d = sharedPreferences;
            short sXd6 = (short) (C1607wl.Xd() ^ 27011);
            short sXd7 = (short) (C1607wl.Xd() ^ 32526);
            int[] iArr4 = new int["3*)P\u0005.{!%<\n{u!Li\b\u0019\u007fNH\u0001&ZW2W\u0017\u0001[\u001fN;!;\u0005!$\f\u0015*\u0016\t|v".length()];
            QB qb4 = new QB("3*)P\u0005.{!%<\n{u!Li\b\u0019\u007fNH\u0001&ZW2W\u0017\u0001[\u001fN;!;\u0005!$\f\u0015*\u0016\t|v");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((i5 * sXd7) ^ sXd6));
                i5++;
            }
            Object[] objArr2 = {new String(iArr4, 0, i5) + cacheFileSuffix, 0};
            Method method2 = Class.forName(ZO.xd("\u001c\n 7CYRnH5H\u0016\tSciY\u0001i\u0019`Aq", (short) (ZN.Xd() ^ ExifDirectoryBase.TAG_SUB_IFD_OFFSET), (short) (ZN.Xd() ^ 31087))).getMethod(Ig.wd("a(\tK0l\u001e t4T)wxa:\u000bqK-", (short) (C1633zX.Xd() ^ (-8928))), Class.forName(C1626yg.Ud("]\u0011$u8E(_\u0001Ub\u001832\u0012r", (short) (C1499aX.Xd() ^ (-31385)), (short) (C1499aX.Xd() ^ (-23270)))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                SharedPreferences sharedPreferences2 = (SharedPreferences) method2.invoke(context, objArr2);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences2, str4);
                this.f1948e = sharedPreferences2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final synchronized void a(NotificationSubscriptionType notificationSubscriptionType) {
        b("push_subscribe", notificationSubscriptionType != null ? notificationSubscriptionType.forJsonPut() : null);
    }

    public final boolean a(String key, Object obj) {
        JSONObject jSONObject;
        Object obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObjectC = c();
        if (jSONObjectC.has(SchedulerSupport.CUSTOM)) {
            try {
                jSONObject = jSONObjectC.getJSONObject(SchedulerSupport.CUSTOM);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "userObjectFromCache.getJ…OM_ATTRIBUTES_OBJECT_KEY)");
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) lh0.f1197a, 4, (Object) null);
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new sh0(key, obj), 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        jSONObject.put(key, obj2);
        return b(SchedulerSupport.CUSTOM, jSONObject);
    }

    public final boolean a(JSONObject jSONObject) {
        if (this.f1946c.f1095a.getBoolean("appboy_sdk_disabled", false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) rh0.f1693a, 6, (Object) null);
            return false;
        }
        this.f1947d.edit().putString("user_cache_attributes_object", jSONObject.toString()).apply();
        return true;
    }

    @Override // bo.app.f
    public final Object b() {
        StringUtils.ifNonEmpty(this.f1949f, new oh0(this));
        JSONObject outboundJson = c();
        Intrinsics.checkNotNullParameter(outboundJson, "outboundJson");
        try {
            String strA = ((i70) this.f1945b).a();
            if (strA == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) jh0.f1015a, 7, (Object) null);
            } else if (!Intrinsics.areEqual(strA, this.f1948e.getString("push_token", null))) {
                outboundJson.put("push_token", strA);
            }
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) kh0.f1111a, 4, (Object) null);
        }
        this.f1947d.edit().clear().apply();
        return new l50(outboundJson);
    }

    @Override // bo.app.f
    public final void b(Object obj, boolean z2) {
        l50 outboundObject = (l50) obj;
        Intrinsics.checkNotNullParameter(outboundObject, "outboundObject");
        JSONObject jSONObject = outboundObject.f1166a;
        if (z2) {
            if (jSONObject.has("push_token")) {
                this.f1948e.edit().putString("push_token", jSONObject.optString("push_token")).apply();
                return;
            }
            return;
        }
        JSONObject jSONObjectC = c();
        JSONObject jSONObjectPlus = JsonUtils.plus(jSONObject, jSONObjectC);
        jSONObjectPlus.remove("push_token");
        JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(SchedulerSupport.CUSTOM);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(SchedulerSupport.CUSTOM);
        try {
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) mh0.f1296a, 4, (Object) null);
        }
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject2 != null) {
            jSONObjectPlus.put(SchedulerSupport.CUSTOM, JsonUtils.plus(jSONObjectOptJSONObject2, jSONObjectOptJSONObject));
        } else {
            if (jSONObjectOptJSONObject == null) {
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectPlus.put(SchedulerSupport.CUSTOM, jSONObjectOptJSONObject2);
                }
                this.f1947d.edit().putString("user_cache_attributes_object", jSONObjectPlus.toString()).apply();
            }
            jSONObjectPlus.put(SchedulerSupport.CUSTOM, jSONObjectOptJSONObject);
        }
        this.f1947d.edit().putString("user_cache_attributes_object", jSONObjectPlus.toString()).apply();
    }

    public final boolean b(String str, Object obj) {
        Object obj2;
        JSONObject jSONObjectC = c();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new th0(str, obj), 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        jSONObjectC.put(str, obj2);
        return a(jSONObjectC);
    }

    public final JSONObject c() {
        String string = this.f1947d.getString("user_cache_attributes_object", null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new ph0(string), 4, (Object) null);
            return new JSONObject();
        }
    }

    public final synchronized void d() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) nh0.f1365a, 6, (Object) null);
        this.f1948e.edit().clear().apply();
    }
}
