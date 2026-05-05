package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class tk extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1877a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(String str) {
        super(0);
        this.f1877a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Failed to unset custom location attribute with key '"), this.f1877a, '\'');
    }
}
