package bo.app;

import com.braze.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k60 extends ba {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f1078j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1079i;

    public k60(JSONObject jSONObject, String str) {
        super(lx.PUSH_ACTION_BUTTON_CLICKED, jSONObject, 0.0d, 12);
        this.f1079i = Intrinsics.areEqual(str, Constants.BRAZE_PUSH_ACTION_TYPE_NONE);
    }
}
