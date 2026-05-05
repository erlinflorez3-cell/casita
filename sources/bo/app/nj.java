package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nj extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1368a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(String str) {
        super(0);
        this.f1368a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Email address is not valid: " + this.f1368a;
    }
}
