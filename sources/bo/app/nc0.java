package bo.app;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nc0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f1355a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(Set set) {
        super(0);
        this.f1355a = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Storage provider is closed. Not deleting events: " + this.f1355a;
    }
}
