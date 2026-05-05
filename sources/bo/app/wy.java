package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class wy extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2170b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(String str, String str2) {
        super(0);
        this.f2169a = str;
        this.f2170b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("The received cards are for user ").append(this.f2169a).append(" and the current user is "), this.f2170b, ", the cards will be discarded and no changes will be made.");
    }
}
