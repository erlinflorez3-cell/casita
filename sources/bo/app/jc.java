package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class jc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1002a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(long j2) {
        super(0);
        this.f1002a = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Ignoring rate limit for this geofence request. Elapsed time since last request:" + this.f1002a;
    }
}
