package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class rf extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf f1687a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(tf tfVar) {
        super(0);
        this.f1687a = tfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Updated shouldRequestFeedInNextRequest to: " + this.f1687a.f1857t;
    }
}
