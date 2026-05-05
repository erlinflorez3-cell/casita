package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class fj extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(String str, JSONObject jSONObject) {
        super(0);
        this.f675a = str;
        this.f676b = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to set custom json attribute " + this.f675a + " with value \n" + JsonUtils.getPrettyPrintedString(this.f676b) + '.';
    }
}
