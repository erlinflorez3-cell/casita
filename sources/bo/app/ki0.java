package bo.app;

import com.braze.support.ValidationUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ki0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1114a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki0(String str) {
        super(0);
        this.f1114a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "The currencyCode " + this.f1114a + " is invalid. Expected one of " + ValidationUtils.INSTANCE.getVALID_CURRENCY_CODES();
    }
}
