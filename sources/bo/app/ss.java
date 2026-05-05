package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ss extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1786a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss(int i2) {
        super(0);
        this.f1786a = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Lacked logic to ingest message! Type: ".concat(s00.a(this.f1786a));
    }
}
