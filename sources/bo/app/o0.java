package bo.app;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1407b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(long j2, long j3) {
        super(0);
        this.f1406a = j2;
        this.f1407b = j3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Braze SDK loaded in " + TimeUnit.MILLISECONDS.convert(this.f1406a - this.f1407b, TimeUnit.NANOSECONDS) + " ms / " + (this.f1406a - this.f1407b) + " nanos";
    }
}
