package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class n70 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1346a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n70(String str) {
        super(0);
        this.f1346a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Failed to find "), this.f1346a, " on ${clazz.name} or any parent classes");
    }
}
