package bo.app;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class lq {
    public final void a(BrazeConfigurationProvider configurationProvider, JSONObject deviceExport, DeviceKey exportKey, Object obj) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(deviceExport, "deviceExport");
        Intrinsics.checkNotNullParameter(exportKey, "exportKey");
        if (!configurationProvider.isDeviceObjectAllowlistEnabled() || configurationProvider.getDeviceObjectAllowlist().contains(exportKey)) {
            deviceExport.putOpt(exportKey.getKey(), obj);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new kq(exportKey), 6, (Object) null);
        }
    }
}
