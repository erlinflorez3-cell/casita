package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class wx extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2168a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(String str) {
        super(0);
        this.f2168a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Received null or blank serialized Feature Flag string for Feature Flag id "), this.f2168a, " from shared preferences. Not parsing.");
    }
}
