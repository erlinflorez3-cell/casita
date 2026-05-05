package bo.app;

import com.braze.support.ValidationUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ji0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public static final ji0 f1017a = new ji0();

    public ji0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "The currencyCode is empty. Expected one of " + ValidationUtils.INSTANCE.getVALID_CURRENCY_CODES();
    }
}
