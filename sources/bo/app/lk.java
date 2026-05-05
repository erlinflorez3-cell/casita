package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class lk extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1201a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(String str) {
        super(0);
        this.f1201a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): " + this.f1201a;
    }
}
