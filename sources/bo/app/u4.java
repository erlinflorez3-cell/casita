package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class u4 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1910a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(String str) {
        super(0);
        this.f1910a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to set the push token " + this.f1910a;
    }
}
