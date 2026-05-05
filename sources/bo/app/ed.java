package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ed extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f567a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(Exception exc) {
        super(0);
        this.f567a = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Exception occurred when attempting to retrieve local bitmap. " + this.f567a.getMessage();
    }
}
