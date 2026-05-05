package bo.app;

import com.biocatch.client.android.sdk.core.Constants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w80 {
    public static final HashMap a() {
        HashMap map = new HashMap();
        map.put("Accept-Encoding", "gzip, deflate");
        map.put("Content-Type", Constants.WUP_CONTENT_TYPE);
        return map;
    }
}
