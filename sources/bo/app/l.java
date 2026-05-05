package bo.app;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f1149c = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z00 f1151b;

    public l(Context context, z00 admRegistrationDataProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(admRegistrationDataProvider, "admRegistrationDataProvider");
        this.f1150a = context;
        this.f1151b = admRegistrationDataProvider;
    }

    public final void a() {
        if (((i70) this.f1151b).a() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new j(this), 6, (Object) null);
            i70 i70Var = (i70) this.f1151b;
            i70Var.a(i70Var.a());
        } else {
            ADM adm = new ADM(this.f1150a);
            if (adm.isSupported()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) k.f1041a, 6, (Object) null);
                adm.startRegister();
            }
        }
    }
}
