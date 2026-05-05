package bo.app;

import com.braze.Braze;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.ValidationUtils;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class k3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BigDecimal f1065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Braze f1067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BrazeProperties f1068f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(String str, String str2, BigDecimal bigDecimal, int i2, Braze braze, BrazeProperties brazeProperties) {
        super(0);
        this.f1063a = str;
        this.f1064b = str2;
        this.f1065c = bigDecimal;
        this.f1066d = i2;
        this.f1067e = braze;
        this.f1068f = brazeProperties;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = this.f1063a;
        if (ValidationUtils.isValidLogPurchaseInput(str, this.f1064b, this.f1065c, this.f1066d, ((ci0) this.f1067e.getUdm$android_sdk_base_release()).f389h)) {
            BrazeProperties brazeProperties = this.f1068f;
            if (brazeProperties == null || !brazeProperties.isInvalid()) {
                String productId = ValidationUtils.ensureBrazeFieldLength(str);
                z9 z9Var = ba.f257g;
                String currencyCode = this.f1064b;
                Intrinsics.checkNotNull(currencyCode);
                BigDecimal price = this.f1065c;
                Intrinsics.checkNotNull(price);
                int i2 = this.f1066d;
                BrazeProperties brazeProperties2 = this.f1068f;
                z9Var.getClass();
                Intrinsics.checkNotNullParameter(productId, "productId");
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                Intrinsics.checkNotNullParameter(price, "price");
                e00 e00VarA = z9Var.a(new p9(productId, currencyCode, price, i2, brazeProperties2));
                if (e00VarA != null && ((ci0) this.f1067e.getUdm$android_sdk_base_release()).f403v.a(e00VarA)) {
                    ((ci0) this.f1067e.getUdm$android_sdk_base_release()).f404w.b(new i60(productId, this.f1068f, e00VarA));
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1067e, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) j3.f967a, 6, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1067e, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) i3.f867a, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
