package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class xd0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2206b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd0(String str, String str2) {
        super(0);
        this.f2205a = str;
        this.f2206b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Removing obsolete local path ").append(this.f2205a).append(" for obsolete remote path "), this.f2206b, " from cache.");
    }
}
