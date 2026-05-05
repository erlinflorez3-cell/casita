package o;

import android.location.LocationManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class tongue extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationManager f26834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ apparatus f26835b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tongue(LocationManager locationManager, apparatus apparatusVar) {
        super(1);
        this.f26834a = locationManager;
        this.f26835b = apparatusVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f26834a.removeUpdates(this.f26835b);
        return Unit.INSTANCE;
    }
}
