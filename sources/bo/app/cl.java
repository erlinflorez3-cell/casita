package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class cl extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xk f410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(xk xkVar, String str, Object obj) {
        super(0);
        this.f410a = xkVar;
        this.f411b = str;
        this.f412c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Unable to find the xml " + this.f410a + " configuration value with primary key '" + this.f411b + "'. Using default value '" + this.f412c + "'.";
    }
}
