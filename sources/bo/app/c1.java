package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f308a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(String str) {
        super(0);
        this.f308a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Rejected user id with byte length longer than 997. Not changing user. Input user id: " + this.f308a;
    }
}
