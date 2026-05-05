package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class qe0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1599a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(String str) {
        super(0);
        this.f1599a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to add new local path for remote path " + this.f1599a;
    }
}
