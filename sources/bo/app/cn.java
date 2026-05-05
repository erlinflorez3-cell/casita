package bo.app;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class cn extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f413a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(JSONArray jSONArray) {
        super(1);
        this.f413a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f413a.opt(((Number) obj).intValue()) instanceof JSONObject);
    }
}
