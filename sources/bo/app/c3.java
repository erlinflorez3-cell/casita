package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class c3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f312b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(Braze braze, String str) {
        super(0);
        this.f311a = str;
        this.f312b = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = this.f311a;
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f312b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) b3.f237a, 6, (Object) null);
        } else {
            z9 z9Var = ba.f257g;
            String cardId = this.f311a;
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            e00 e00VarA = z9Var.a(new c9(cardId));
            if (e00VarA != null) {
                ((ci0) this.f312b.getUdm$android_sdk_base_release()).f403v.a(e00VarA);
            }
            ((ci0) this.f312b.getUdm$android_sdk_base_release()).A.markCardAsViewed(this.f311a);
        }
        return Unit.INSTANCE;
    }
}
