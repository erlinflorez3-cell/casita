package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class hn extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f840a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(String str) {
        super(0);
        this.f840a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Removing card from storage with id: " + this.f840a;
    }
}
