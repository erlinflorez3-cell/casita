package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ba implements e00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx f259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u30 f263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u30 f264f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f258h = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ba.class, "userId", "getUserId()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ba.class, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z9 f257g = new z9();

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ba(lx lxVar, JSONObject jSONObject, double d2, int i2) {
        double dNowInSecondsPrecise = d2;
        JSONObject jSONObject2 = (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? new JSONObject() : jSONObject;
        dNowInSecondsPrecise = (i2 + 4) - (i2 | 4) != 0 ? DateTimeUtils.nowInSecondsPrecise() : dNowInSecondsPrecise;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        this(lxVar, jSONObject2, dNowInSecondsPrecise, string);
    }

    public ba(lx type, JSONObject data, double d2, String uniqueIdentifier) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        this.f259a = type;
        this.f260b = data;
        this.f261c = d2;
        this.f262d = uniqueIdentifier;
        this.f263e = new u30();
        this.f264f = new u30();
        if (type == lx.UNKNOWN) {
            throw new IllegalArgumentException("Event type cannot be unknown.");
        }
    }

    public final void a(cc0 cc0Var) {
        this.f264f.setValue(this, f258h[1], cc0Var);
    }

    public final void a(String str) {
        this.f263e.setValue(this, f258h[0], str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f262d, ((ba) obj).f262d);
    }

    @Override // com.braze.models.IPutIntoJson
    public final JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f259a.f1239a);
            jSONObject.put("data", this.f260b);
            jSONObject.put("time", this.f261c);
            u30 u30Var = this.f263e;
            KProperty[] kPropertyArr = f258h;
            KProperty property = kPropertyArr[0];
            u30Var.getClass();
            Intrinsics.checkNotNullParameter(this, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            String str = (String) u30Var.f1909a;
            if (str != null && str.length() != 0) {
                u30 u30Var2 = this.f263e;
                KProperty property2 = kPropertyArr[0];
                u30Var2.getClass();
                Intrinsics.checkNotNullParameter(this, "thisRef");
                Intrinsics.checkNotNullParameter(property2, "property");
                jSONObject.put("user_id", (String) u30Var2.f1909a);
            }
            u30 u30Var3 = this.f264f;
            KProperty property3 = kPropertyArr[1];
            u30Var3.getClass();
            Intrinsics.checkNotNullParameter(this, "thisRef");
            Intrinsics.checkNotNullParameter(property3, "property");
            cc0 cc0Var = (cc0) u30Var3.f1909a;
            if (cc0Var != null) {
                jSONObject.put("session_id", cc0Var.f335b);
            }
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) aa.f186a, 4, (Object) null);
        }
        return jSONObject;
    }

    public final int hashCode() {
        return this.f262d.hashCode();
    }

    public final String toString() {
        String string = forJsonPut().toString();
        Intrinsics.checkNotNullExpressionValue(string, "forJsonPut().toString()");
        return string;
    }
}
