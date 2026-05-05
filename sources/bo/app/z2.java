package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class z2 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f2341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(Braze braze, String str) {
        super(0);
        this.f2340a = str;
        this.f2341b = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = this.f2340a;
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2341b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) y2.f2259a, 6, (Object) null);
        } else {
            z9 z9Var = ba.f257g;
            String cardId = this.f2340a;
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            e00 e00VarA = z9Var.a(new b9(cardId));
            if (e00VarA != null) {
                ((ci0) this.f2341b.getUdm$android_sdk_base_release()).f403v.a(e00VarA);
            }
        }
        return Unit.INSTANCE;
    }
}
