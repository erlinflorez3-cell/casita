package bo.app;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class jx extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f1038a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(List list) {
        super(0);
        this.f1038a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Adding events to dispatch from storage: " + this.f1038a;
    }
}
