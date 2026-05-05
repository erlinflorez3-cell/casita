package bo.app;

import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ee0 {
    public final ConcurrentHashMap a(SharedPreferences storagePrefs) {
        Intrinsics.checkNotNullParameter(storagePrefs, "storagePrefs");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = storagePrefs.getAll();
        if (all != null && !all.isEmpty()) {
            for (String remoteAssetKey : all.keySet()) {
                try {
                    String string = storagePrefs.getString(remoteAssetKey, null);
                    if (string != null && !StringsKt.isBlank(string)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ae0(string, remoteAssetKey), 7, (Object) null);
                        Intrinsics.checkNotNullExpressionValue(remoteAssetKey, "remoteAssetKey");
                        concurrentHashMap.put(remoteAssetKey, string);
                    }
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new be0(remoteAssetKey), 4, (Object) null);
                }
            }
        }
        return concurrentHashMap;
    }
}
