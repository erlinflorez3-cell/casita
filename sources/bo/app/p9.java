package bo.app;

import com.braze.models.outgoing.BrazeProperties;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class p9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeProperties f1496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BigDecimal f1499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(String str, String str2, BigDecimal bigDecimal, int i2, BrazeProperties brazeProperties) {
        super(0);
        this.f1496a = brazeProperties;
        this.f1497b = str;
        this.f1498c = str2;
        this.f1499d = bigDecimal;
        this.f1500e = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f1497b;
        String str2 = this.f1498c;
        BigDecimal bigDecimal = this.f1499d;
        int i2 = this.f1500e;
        jSONObject.put("pid", str);
        jSONObject.put("c", str2);
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "this.setScale(2, RoundingMode.HALF_UP)");
        jSONObject.put("p", scale.doubleValue());
        jSONObject.put("q", i2);
        BrazeProperties brazeProperties = this.f1496a;
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            jSONObject.put("pr", this.f1496a.forJsonPut());
        }
        return new ba(lx.PURCHASE, jSONObject, 0.0d, 12);
    }
}
