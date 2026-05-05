package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class xx extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2247a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(String str) {
        super(0);
        this.f2247a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Encountered unexpected exception while parsing stored feature flags: " + this.f2247a;
    }
}
