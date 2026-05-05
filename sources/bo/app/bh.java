package bo.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class bh extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih f278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f279b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(ih ihVar, ArrayList arrayList) {
        super(0);
        this.f278a = ihVar;
        this.f279b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((vw) this.f278a.f907a).b(uz.class, new uz(this.f279b));
        return Unit.INSTANCE;
    }
}
