package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class vp extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2059a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(String str) {
        super(0);
        this.f2059a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Adding bitmap to mem cache for key " + this.f2059a;
    }
}
