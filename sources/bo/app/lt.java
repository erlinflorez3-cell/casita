package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class lt extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f1208a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt(JSONObject jSONObject) {
        super(0);
        this.f1208a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Parsed dust message json to:\n" + JsonUtils.getPrettyPrintedString(this.f1208a);
    }
}
