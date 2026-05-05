package bo.app;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class n40 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b90 f1338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f1339b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ JSONObject f1340c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n40(b90 b90Var, HashMap map, JSONObject jSONObject) {
        super(0);
        this.f1338a = b90Var;
        this.f1339b = map;
        this.f1340c = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object[] requestArgs = {this.f1338a, this.f1339b, this.f1340c};
        String str = com.braze.support.i.f2707a;
        Intrinsics.checkNotNullParameter(requestArgs, "requestArgs");
        long jHashCode = 1;
        for (int i2 = 0; i2 < 3; i2++) {
            jHashCode *= (long) requestArgs[i2].hashCode();
        }
        String hexString = Long.toHexString(jHashCode);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n    request…lement.hashCode()\n    }\n)");
        return hexString;
    }
}
