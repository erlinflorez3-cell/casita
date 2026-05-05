package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ResponseAttachFlow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9123b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9124e = 0;
    private String flowId;

    public ResponseAttachFlow(String str) {
        this.flowId = str;
    }

    public String getFlowId() {
        int i2 = 2 % 2;
        int i3 = f9123b;
        int i4 = i3 + 99;
        f9124e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.flowId;
        int i6 = i3 + 73;
        f9124e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseAttachFlow{flowId='").append(this.flowId).append("'}").toString();
        int i3 = f9123b + 97;
        f9124e = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ResponseAttachFlow parse(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        ResponseAttachFlow responseAttachFlow = new ResponseAttachFlow(new JSONObject(responseBody.string()).getString("flowId"));
        int i3 = f9124e + 47;
        f9123b = i3 % 128;
        int i4 = i3 % 2;
        return responseAttachFlow;
    }
}
