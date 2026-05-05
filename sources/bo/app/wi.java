package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class wi extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2150b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(String str, Object obj) {
        super(0);
        this.f2149a = str;
        this.f2150b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Could not build NestedCustomAttributeEvent for key " + this.f2149a + " and " + this.f2150b;
    }
}
