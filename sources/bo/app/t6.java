package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class t6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f1814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1815b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(Braze braze, String str) {
        super(0);
        this.f1814a = braze;
        this.f1815b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this.f1814a, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new r6(this.f1815b), 6, (Object) null);
        if (StringsKt.isBlank(this.f1815b)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this.f1814a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) s6.f1742a, 6, (Object) null);
        } else {
            ((ci0) this.f1814a.getUdm$android_sdk_base_release()).f399r.a(this.f1815b);
        }
        return Unit.INSTANCE;
    }
}
