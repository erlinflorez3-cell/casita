package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class y30 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONArray f2263b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(int i2, JSONArray jSONArray) {
        super(0);
        this.f2262a = i2;
        this.f2263b = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to get string for item at index: " + this.f2262a + " and array: " + this.f2263b;
    }
}
