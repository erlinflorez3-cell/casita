package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class eu extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fu f592a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(fu fuVar) {
        super(0);
        this.f592a = fuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Started stream job " + this.f592a.f687a;
    }
}
