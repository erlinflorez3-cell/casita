package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f864b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(String str, String str2) {
        super(0);
        this.f863a = str;
        this.f864b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Changing current user ").append(this.f863a).append(" to new user "), this.f864b, '.');
    }
}
