package bo.app;

import com.braze.models.IBrazeLocation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class yd extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zd f2299a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(zd zdVar) {
        super(1);
        this.f2299a = zdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IBrazeLocation it = (IBrazeLocation) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f2299a.a(it);
        return Unit.INSTANCE;
    }
}
