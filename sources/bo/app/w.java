package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2086b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, String str2) {
        super(0);
        this.f2085a = str;
        this.f2086b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to get bitmap from disk cache for key " + this.f2085a + " diskKey " + this.f2086b;
    }
}
