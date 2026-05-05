package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class gd extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f743a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(String str) {
        super(0);
        this.f743a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "SDK is in offline mode, not downloading remote bitmap with uri: " + this.f743a;
    }
}
