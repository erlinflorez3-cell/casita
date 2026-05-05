package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ay extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gy f228a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(gy gyVar) {
        super(0);
        this.f228a = gyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Not refreshing Feature Flags since another " + this.f228a.f787j.get() + " request is currently in-flight.";
    }
}
