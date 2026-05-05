package a0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class civilian extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ taste f76a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public civilian(taste tasteVar) {
        super(0);
        this.f76a = tasteVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new apparatus(this.f76a);
    }
}
