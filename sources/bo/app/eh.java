package bo.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class eh extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih f574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(ih ihVar, ArrayList arrayList) {
        super(0);
        this.f574a = ihVar;
        this.f575b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((vw) this.f574a.f907a).b(eh0.class, new eh0(this.f575b));
        return Unit.INSTANCE;
    }
}
