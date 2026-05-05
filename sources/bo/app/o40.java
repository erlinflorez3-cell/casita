package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class o40 implements x00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x00 f1418a;

    public o40(b00 httpConnector) {
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        this.f1418a = httpConnector;
    }

    public static final String a(o40 o40Var, Map map) {
        o40Var.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add("|\"" + ((String) entry.getKey()) + "\" => \"" + ((String) entry.getValue()) + '\"');
        }
        return CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null);
    }

    @Override // bo.app.x00
    public final w00 a(b90 b90Var, HashMap requestHeaders, JSONObject payload) {
        b90 requestTarget = b90Var;
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Lazy lazy = LazyKt.lazy(new n40(requestTarget, requestHeaders, payload));
        try {
            boolean z2 = requestTarget.f256d;
            requestTarget = requestTarget;
            lazy = lazy;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z2, new j40(lazy, requestTarget, this, requestHeaders, payload), 3, (Object) null);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) k40.f1071a, 4, (Object) null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        w00 w00VarA = this.f1418a.a(requestTarget, requestHeaders, payload);
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l40(lazy, requestTarget, System.currentTimeMillis() - jCurrentTimeMillis, this, w00VarA.f2089b, w00VarA.f2090c), 7, (Object) null);
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) m40.f1254a, 4, (Object) null);
        }
        return w00VarA;
    }
}
