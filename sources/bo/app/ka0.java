package bo.app;

import android.content.Context;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ka0 {

    /* JADX INFO: renamed from: a */
    public final q f1095a;

    public ka0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1095a = new q(context);
    }

    public final void a(boolean z2) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new ja0(z2), 6, (Object) null);
        this.f1095a.edit().putBoolean("appboy_sdk_disabled", z2).apply();
    }

    public final boolean a() {
        return this.f1095a.getBoolean("appboy_sdk_disabled", false);
    }
}
