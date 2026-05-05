package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1435a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(String str) {
        super(0);
        this.f1435a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Deleting outdated id "), this.f1435a, " from re-eligibility list.");
    }
}
