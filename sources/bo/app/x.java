package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2173b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, String str2) {
        super(0);
        this.f2172a = str;
        this.f2173b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to load image from disk cache: " + this.f2172a + '/' + this.f2173b;
    }
}
