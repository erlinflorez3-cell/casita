package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class gj extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONArray f763b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(String str, JSONArray jSONArray) {
        super(0);
        this.f762a = str;
        this.f763b = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to set custom json attribute " + this.f762a + " with value \n" + JsonUtils.getPrettyPrintedString(this.f763b) + '.';
    }
}
