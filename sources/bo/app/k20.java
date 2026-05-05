package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class k20 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1062a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k20(String str) {
        super(0);
        this.f1062a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Trigger id not found (this is expected for test sends). Not logging html in-app message button click for id: " + this.f1062a;
    }
}
