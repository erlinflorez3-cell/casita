package bo.app;

import com.braze.models.IPutIntoJson;
import com.npmdavi.davinotification.Constant;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ea0 implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f559b;

    public ea0(String log, long j2) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.f558a = log;
        this.f559b = j2;
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return new JSONObject().put(Constant.NOTIFICATION_DETAILS_LOG, this.f558a).put("time", this.f559b);
    }
}
