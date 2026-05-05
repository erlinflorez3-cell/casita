package bo.app;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class om extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f1452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f1453b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(LinkedHashSet linkedHashSet, Set set) {
        super(0);
        this.f1452a = linkedHashSet;
        this.f1453b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Retaining card ids: " + this.f1452a + " among cached card ids: " + this.f1453b;
    }
}
