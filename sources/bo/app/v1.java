package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1991a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(String str) {
        super(0);
        this.f1991a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to deserialize in-app message json. Payload: " + this.f1991a;
    }
}
