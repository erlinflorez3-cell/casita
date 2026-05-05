package bo.app;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class z8 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f2360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cc0 f2361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(Throwable th, cc0 cc0Var, boolean z2) {
        super(0);
        this.f2360a = th;
        this.f2361b = cc0Var;
        this.f2362c = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        StringBuilder sbAppend = new StringBuilder("\n                original_sdk_version: 32.1.0\n                exception_class: ").append(this.f2360a.getClass().getName()).append("\n                available_cpus: ").append(Runtime.getRuntime().availableProcessors()).append("\n                ");
        cc0 cc0Var = this.f2361b;
        StringBuilder sbAppend2 = sbAppend.append(cc0Var != null ? "session_id: " + cc0Var : null).append("\n                ");
        z9 z9Var = ba.f257g;
        Throwable throwable = this.f2360a;
        z9Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        JSONObject eventData = new JSONObject().put("e", StringsKt.trimIndent(sbAppend2.append(StringsKt.take(string, 5000)).append("\n            ").toString()));
        if (!this.f2362c) {
            eventData.put("nop", true);
        }
        lx lxVar = lx.INTERNAL_ERROR;
        Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
        return new ba(lxVar, eventData, 0.0d, 12);
    }
}
