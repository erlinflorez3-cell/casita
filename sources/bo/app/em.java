package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class em extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f583b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(String str, String str2) {
        super(0);
        this.f582a = str;
        this.f583b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Detected SDK update from '").append(this.f582a).append("' -> '"), this.f583b, "'. Clearing config update time.");
    }
}
