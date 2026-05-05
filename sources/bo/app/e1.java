package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f534a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(String str) {
        super(0);
        this.f534a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Received request to change current user "), this.f534a, " to the same user id. Not changing user.");
    }
}
