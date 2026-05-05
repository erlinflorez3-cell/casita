package bo.app;

import com.braze.support.JsonUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class te extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00 f1835a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(e00 e00Var) {
        super(0);
        this.f1835a = e00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Not adding user id to event: " + JsonUtils.getPrettyPrintedString(((ba) this.f1835a).forJsonPut());
    }
}
