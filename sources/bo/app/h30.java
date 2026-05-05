package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class h30 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f796a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(JSONObject jSONObject) {
        super(0);
        this.f796a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Attempting to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(this.f796a);
    }
}
