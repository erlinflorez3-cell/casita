package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class gi0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f761a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi0(String str) {
        super(0);
        this.f761a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("The custom event is a blocklisted custom event: "), this.f761a, ". Invalid custom event.");
    }
}
