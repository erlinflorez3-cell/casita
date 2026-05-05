package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class z20 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f2342a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z20(JSONObject jSONObject) {
        super(0);
        this.f2342a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Unknown in-app message type. Returning null: " + JsonUtils.getPrettyPrintedString(this.f2342a);
    }
}
