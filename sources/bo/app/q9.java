package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class q9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(String str, String str2) {
        super(0);
        this.f1586a = str;
        this.f1587b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject eventData = new JSONObject().put("cid", this.f1586a).put("a", this.f1587b);
        lx lxVar = lx.PUSH_STORY_PAGE_CLICK;
        Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
        return new ba(lxVar, eventData, 0.0d, 12);
    }
}
