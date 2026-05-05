package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class sf extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf f1765a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(tf tfVar) {
        super(0);
        this.f1765a = tfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Updated shouldRequestTriggersInNextRequest to: " + this.f1765a.f1856s;
    }
}
