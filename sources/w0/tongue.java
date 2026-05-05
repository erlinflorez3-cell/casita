package w0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.Response;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class tongue extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Response f28407a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tongue(Response response) {
        super(1);
        this.f28407a = response;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Util.closeQuietly(this.f28407a);
        return Unit.INSTANCE;
    }
}
