package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.location.IBrazeLocationApi;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sd {

    /* JADX INFO: renamed from: a */
    public final IBrazeLocationApi f1760a;

    public sd(Context context, EnumSet allowedProviders, BrazeConfigurationProvider appConfigurationProvider) {
        IBrazeLocationApi iBrazeLocationApi;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        try {
            Object objNewInstance = Class.forName("com.braze.location.BrazeInternalLocationApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.braze.location.IBrazeLocationApi");
            iBrazeLocationApi = (IBrazeLocationApi) objNewInstance;
        } catch (Exception unused) {
            iBrazeLocationApi = null;
        }
        this.f1760a = iBrazeLocationApi;
        if (iBrazeLocationApi != null) {
            iBrazeLocationApi.initWithContext(context, allowedProviders, appConfigurationProvider);
        }
    }

    public final boolean a() {
        return this.f1760a != null;
    }
}
