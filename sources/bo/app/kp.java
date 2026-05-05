package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class kp extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp(String str) {
        super(0);
        this.f1136a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Got bitmap from disk cache for key " + this.f1136a;
    }
}
