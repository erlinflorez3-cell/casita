package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f162a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(String str) {
        super(0);
        this.f162a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to set external id to: " + this.f162a;
    }
}
