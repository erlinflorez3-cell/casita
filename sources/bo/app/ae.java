package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ae extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f194a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(String str) {
        super(0);
        this.f194a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("BrazeLogger log level set to "), this.f194a, " via device system property. Note that subsequent calls to BrazeLogger.setLogLevel() will have no effect.");
    }
}
