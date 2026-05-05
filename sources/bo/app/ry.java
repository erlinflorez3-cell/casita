package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ry extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1714a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry(String str) {
        super(0);
        this.f1714a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Cannot create card control event for Feed card. Returning null. Card id: " + this.f1714a;
    }
}
