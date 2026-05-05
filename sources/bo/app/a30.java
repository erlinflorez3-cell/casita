package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a30 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f168a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(JSONObject jSONObject) {
        super(0);
        this.f168a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to deserialize the in-app message: " + JsonUtils.getPrettyPrintedString(this.f168a) + ". Returning null.";
    }
}
