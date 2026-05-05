package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class d6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(Function0 function0) {
        super(0);
        this.f462a = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > " + ((String) this.f462a.invoke());
    }
}
