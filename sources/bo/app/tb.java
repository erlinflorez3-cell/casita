package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class tb extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1827a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(boolean z2) {
        super(0);
        this.f1827a = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Setting up geofences in setUpGeofences with reRegisterGeofences: " + this.f1827a;
    }
}
