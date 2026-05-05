package bo.app;

import com.braze.support.JsonUtils;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class l40 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lazy f1159a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b90 f1160b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f1161c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ o40 f1162d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Map f1163e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ JSONObject f1164f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l40(Lazy lazy, b90 b90Var, long j2, o40 o40Var, Map map, JSONObject jSONObject) {
        super(0);
        this.f1159a = lazy;
        this.f1160b = b90Var;
        this.f1161c = j2;
        this.f1162d = o40Var;
        this.f1163e = map;
        this.f1164f = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return StringsKt.trimMargin$default("\n                |Made request with id => \"" + ((String) this.f1159a.getValue()) + "\"\n                |to url: " + this.f1160b + "\n                |took: " + this.f1161c + "ms\n                \n                |with response headers:\n                " + o40.a(this.f1162d, this.f1163e) + "\n                |\n                |and response JSON:\n                |" + JsonUtils.getPrettyPrintedString(this.f1164f) + "\n                ", null, 1, null);
    }
}
