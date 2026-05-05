package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class to extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1881a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(long j2) {
        super(0);
        this.f1881a = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Posting new sync runnable with delay " + this.f1881a + " ms";
    }
}
