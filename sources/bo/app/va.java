package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class va extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2028a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(boolean z2) {
        super(0);
        this.f2028a = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Geofences enabled status of `" + this.f2028a + "` was unchanged during server config update.";
    }
}
