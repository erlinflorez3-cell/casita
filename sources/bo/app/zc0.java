package bo.app;

import com.braze.models.IPutIntoJson;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public enum zc0 implements IPutIntoJson {
    SUBSCRIBED,
    UNSUBSCRIBED;

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "subscribed";
        }
        if (iOrdinal == 1) {
            return "unsubscribed";
        }
        throw new NoWhenBranchMatchedException();
    }
}
