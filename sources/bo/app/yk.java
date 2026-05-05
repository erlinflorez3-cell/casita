package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class yk extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(String str, Object obj) {
        super(0);
        this.f2318a = str;
        this.f2319b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Using resources value for key: '" + this.f2318a + "' and value: '" + this.f2319b + '\'';
    }
}
