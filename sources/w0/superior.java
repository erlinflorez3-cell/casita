package w0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class superior extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Call f28404a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public superior(Call call) {
        super(1);
        this.f28404a = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f28404a.cancel();
        return Unit.INSTANCE;
    }
}
