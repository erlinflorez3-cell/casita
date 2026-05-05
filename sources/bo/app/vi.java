package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class vi extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2049b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(String str, Object obj) {
        super(0);
        this.f2048a = str;
        this.f2049b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Could not add unsupported custom attribute value with key: " + this.f2048a + " and value: " + this.f2049b;
    }
}
