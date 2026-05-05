package n;

import android.app.Application;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class tongue extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Application f19889a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tongue(Application application) {
        super(0);
        this.f19889a = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(this.f19889a, TelephonyManager.class);
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }
}
