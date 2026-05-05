package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f789a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Exception exc) {
        super(0);
        this.f789a = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Manifest not authored properly to support ADM. ADM manifest exception: " + this.f789a;
    }
}
