package bo.app;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class dv extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f525a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(Map.Entry entry) {
        super(0);
        this.f525a = entry;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to get expiration time. Deleting entry: " + this.f525a;
    }
}
