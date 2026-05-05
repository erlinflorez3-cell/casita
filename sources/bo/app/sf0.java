package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class sf0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1766a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(String str) {
        super(0);
        this.f1766a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Received null or blank serialized triggered action string for action id "), this.f1766a, " from shared preferences. Not parsing.");
    }
}
