package com.valid.communication.events;

import com.valid.communication.d;
import com.valid.communication.models.BaseModelResponse;
import com.valid.communication.utils.Json;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class BaseSuccessEvent {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f18290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f18291i;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private JSONObject f18292x;

    public <T> BaseModelResponse<T> getBaseResponseModel(Class<?> cls) {
        try {
            return (BaseModelResponse) Json.deSerializeType(this.f18290h, Json.getType(BaseModelResponse.class, cls));
        } catch (d unused) {
            return null;
        }
    }

    public JSONObject getHeader() {
        return this.f18292x;
    }

    public int getHttpStatusCode() {
        return this.f18291i;
    }

    public String getResponse() {
        return this.f18290h;
    }

    public <T> T getTypedResponse(Class<T> cls) {
        try {
            return (T) Json.deSerialize(this.f18290h, cls);
        } catch (d unused) {
            return null;
        }
    }

    public void setHeader(JSONObject jSONObject) {
        try {
            this.f18292x = jSONObject;
        } catch (d unused) {
        }
    }

    public void setHttpStatusCode(int i2) {
        try {
            this.f18291i = i2;
        } catch (d unused) {
        }
    }

    public void setResponse(String str) {
        try {
            this.f18290h = str;
        } catch (d unused) {
        }
    }
}
