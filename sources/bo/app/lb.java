package bo.app;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class lb extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f1183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(List list) {
        super(0);
        this.f1183a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Received new geofence list of size: " + this.f1183a.size();
    }
}
