package com.valid.vssh_android_core.model.response;

import com.valid.vssh_android_core.basecore.BaseResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class CoreGenericBridgeModelResponse extends BaseResponse {
    public Map<String, Object> response;

    public class IOException extends RuntimeException {
    }

    public Map<String, Object> getResponse() {
        return this.response;
    }

    public void setResponse(Map<String, Object> map) {
        try {
            this.response = map;
        } catch (IOException unused) {
        }
    }
}
