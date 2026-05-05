package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ug extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1942a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(Object obj) {
        super(0);
        this.f1942a = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Encountered exception while parsing server response for " + this.f1942a;
    }
}
