package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class pt extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f1548a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(Exception exc) {
        super(0);
        this.f1548a = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Stream producer job cancelled " + this.f1548a;
    }
}
