package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class x4 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f2182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2183b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(Braze braze, String str) {
        super(0);
        this.f2182a = braze;
        this.f2183b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this.f2182a, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new v4(this.f2183b), 6, (Object) null);
        String str = this.f2183b;
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this.f2182a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) w4.f2102a, 6, (Object) null);
        } else {
            z00 z00Var = this.f2182a.registrationDataProvider;
            if (z00Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
                z00Var = null;
            }
            ((i70) z00Var).a(this.f2183b);
            ((ci0) this.f2182a.getUdm$android_sdk_base_release()).j().c();
            this.f2182a.requestImmediateDataFlush();
        }
        return Unit.INSTANCE;
    }
}
