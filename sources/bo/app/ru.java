package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ru extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uu f1708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1709b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(long j2, uu uuVar) {
        super(0);
        this.f1708a = uuVar;
        this.f1709b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "New state after request error " + this.f1708a.c(this.f1709b);
    }
}
