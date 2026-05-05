package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class fy extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(long j2) {
        super(0);
        this.f692a = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Updating last Feature Flags refresh time: " + this.f692a;
    }
}
