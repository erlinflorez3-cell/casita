package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class uf extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1940c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(long j2, long j3, long j4) {
        super(0);
        this.f1938a = j2;
        this.f1939b = j3;
        this.f1940c = j4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Messaging session timeout: " + this.f1938a + ", current diff: " + (this.f1939b - this.f1940c);
    }
}
