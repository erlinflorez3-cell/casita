package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f697a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(String str) {
        super(0);
        this.f697a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Changing anonymous user to " + this.f697a;
    }
}
