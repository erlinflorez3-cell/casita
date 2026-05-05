package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class u9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f1925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(String str, String[] strArr) {
        super(0);
        this.f1924a = str;
        this.f1925b = strArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", this.f1924a);
        String[] strArr = this.f1925b;
        if (strArr == null) {
            jSONObject.put("value", JSONObject.NULL);
        } else {
            jSONObject.put("value", JsonUtils.constructJsonArray(strArr));
        }
        return new ba(lx.SET_CUSTOM_ATTRIBUTE_ARRAY, jSONObject, 0.0d, 12);
    }
}
