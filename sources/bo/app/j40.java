package bo.app;

import com.braze.support.JsonUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class j40 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lazy f970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b90 f971b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o40 f972c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Map f973d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ JSONObject f974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(Lazy lazy, b90 b90Var, o40 o40Var, HashMap map, JSONObject jSONObject) {
        super(0);
        this.f970a = lazy;
        this.f971b = b90Var;
        this.f972c = o40Var;
        this.f973d = map;
        this.f974e = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return StringsKt.trimMargin$default(d1.a(new StringBuilder("\n                |Making request with id => \"").append((String) this.f970a.getValue()).append("\"\n                |to url: ").append(this.f971b).append("\n                \n                |with headers:\n                ").append(o40.a(this.f972c, this.f973d)).append("\n                |\n                |"), this.f974e == null ? "" : "and JSON :\n" + JsonUtils.getPrettyPrintedString(this.f974e), "\n                "), null, 1, null);
    }
}
