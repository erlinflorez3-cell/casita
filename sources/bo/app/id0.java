package bo.app;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class id0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f899a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id0(JSONArray jSONArray) {
        super(1);
        this.f899a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f899a.opt(((Number) obj).intValue()) instanceof String);
    }
}
