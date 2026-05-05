package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class mx extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ox f1322a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(ox oxVar) {
        super(0);
        this.f1322a = oxVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Computing new sleep delay. Previous sleep delay: " + this.f1322a.f1471f;
    }
}
