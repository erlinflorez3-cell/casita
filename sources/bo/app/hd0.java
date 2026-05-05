package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class hd0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f825a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd0(JSONObject jSONObject) {
        super(0);
        this.f825a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Parsing templated triggered action with JSON: " + JsonUtils.getPrettyPrintedString(this.f825a);
    }
}
