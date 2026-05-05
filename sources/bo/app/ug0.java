package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ug0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1943a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug0(String str) {
        super(0);
        this.f1943a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Deleting outdated triggered action id "), this.f1943a, " from stored re-eligibility list. In-memory re-eligibility list is unchanged.");
    }
}
