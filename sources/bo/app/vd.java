package bo.app;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class vd {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.EnumSet] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.EnumSet] */
    public final EnumSet a(BrazeConfigurationProvider appConfigurationProvider) {
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
        if (!appConfigurationProvider.getCustomLocationProviderNames().isEmpty()) {
            objectRef.element = appConfigurationProvider.getCustomLocationProviderNames();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new ud(objectRef), 6, (Object) null);
        }
        T allowedLocationProviders = objectRef.element;
        Intrinsics.checkNotNullExpressionValue(allowedLocationProviders, "allowedLocationProviders");
        return (EnumSet) allowedLocationProviders;
    }
}
