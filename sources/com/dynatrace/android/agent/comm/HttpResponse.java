package com.dynatrace.android.agent.comm;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class HttpResponse {
    public final String body;
    public final Map<String, List<String>> headers;
    public final int responseCode;
    public final String responseMessage;

    public HttpResponse(int i2, String str, String str2, Map<String, List<String>> map) {
        this.responseCode = i2;
        this.responseMessage = str;
        this.body = str2;
        this.headers = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (this.responseCode != httpResponse.responseCode) {
            return false;
        }
        String str = this.responseMessage;
        if (str == null ? httpResponse.responseMessage != null : !str.equals(httpResponse.responseMessage)) {
            return false;
        }
        String str2 = this.body;
        String str3 = httpResponse.body;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public boolean isSuccessful() {
        int i2 = this.responseCode;
        return i2 >= 200 && i2 <= 299;
    }
}
