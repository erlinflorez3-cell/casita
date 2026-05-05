package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class j90 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f996a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(String str) {
        super(0);
        this.f996a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Setting signature to: " + this.f996a;
    }
}
