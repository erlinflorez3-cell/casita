package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ l f962a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar) {
        super(0);
        this.f962a = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: " + ((i70) this.f962a.f1151b).a();
    }
}
