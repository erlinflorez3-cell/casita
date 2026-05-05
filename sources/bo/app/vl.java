package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class vl extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONArray f2055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(Object obj, JSONArray jSONArray) {
        super(0);
        this.f2054a = obj;
        this.f2055b = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Unable to create Card JSON in array. Ignoring. Was on element: " + this.f2054a + " of json array: " + this.f2055b;
    }
}
