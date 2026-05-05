package bo.app;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class fl extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f678a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(JSONArray jSONArray) {
        super(1);
        this.f678a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f678a.opt(((Number) obj).intValue()) instanceof String);
    }
}
