package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class c80 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z80 f325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(boolean z2, z80 z80Var, long j2) {
        super(0);
        this.f324a = z2;
        this.f325b = z80Var;
        this.f326c = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Running on " + (this.f324a ? "no-op" : "network") + " executor for " + this.f325b.a(this.f326c);
    }
}
