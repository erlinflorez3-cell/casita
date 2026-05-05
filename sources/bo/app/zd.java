package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zd implements y00 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vd f2383c = new vd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00 f2384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sd f2385b;

    public zd(Context context, h00 brazeManager, BrazeConfigurationProvider appConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        this.f2384a = brazeManager;
        sd sdVar = new sd(context, f2383c.a(appConfigurationProvider), appConfigurationProvider);
        this.f2385b = sdVar;
        if (sdVar.a()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) td.f1833a, 6, (Object) null);
    }

    public final boolean a(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new wd(location), 6, (Object) null);
            e00 e00VarA = ba.f257g.a(location);
            if (e00VarA != null) {
                ((tf) this.f2384a).a(e00VarA);
            }
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) xd.f2204a, 4, (Object) null);
            return false;
        }
    }
}
