package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ku extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uu f1142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1143b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(long j2, uu uuVar) {
        super(0);
        this.f1142a = uuVar;
        this.f1143b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Added request now to queue " + this.f1142a.c(this.f1143b);
    }
}
