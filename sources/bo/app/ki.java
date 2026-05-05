package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ki extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1113b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(String str, int i2) {
        super(0);
        this.f1112a = str;
        this.f1113b = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to increment custom attribute " + this.f1112a + " by " + this.f1113b + '.';
    }
}
