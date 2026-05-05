package bo.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class bd0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f271a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(ArrayList arrayList) {
        super(0);
        this.f271a = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Enabling SSL protocols: " + this.f271a;
    }
}
