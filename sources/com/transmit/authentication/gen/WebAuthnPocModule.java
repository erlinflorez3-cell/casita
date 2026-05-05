package com.transmit.authentication.gen;

import android.content.Context;
import com.ts.coresdk.ITSModuleInfo;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class WebAuthnPocModule implements ITSModuleInfo {
    public static final String CLIENT_ID = "lssz8nodqv0jrj4ftw25rj1vo8nsrkdq";
    private static final String MODULE_NAME = "WebAuthnPoc";
    public static final String SECRET = "b4e6e3ac-b137-43ce-a442-60a492a484af";
    public static final String SERVER_URL = "https://api.idsec-stg.com/";

    @Override // com.ts.coresdk.ITSModuleInfo
    public List<String> endpointIgnoreList(Context context) {
        return null;
    }

    @Override // com.ts.coresdk.ITSModuleInfo
    public boolean isLoggerEnabled(Context context) {
        return false;
    }

    @Override // com.ts.coresdk.ITSModuleInfo
    public String subSystemName() {
        return MODULE_NAME;
    }

    @Override // com.ts.coresdk.ITSModuleInfo
    public String tenantID() {
        return CLIENT_ID;
    }

    @Override // com.ts.coresdk.ITSModuleInfo
    public String version() {
        return "1.0.0";
    }
}
