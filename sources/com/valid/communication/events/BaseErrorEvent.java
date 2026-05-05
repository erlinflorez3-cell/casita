package com.valid.communication.events;

import com.valid.communication.k;
import com.valid.communication.models.ErrorData;

/* JADX INFO: loaded from: classes5.dex */
public class BaseErrorEvent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18287d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ErrorData f18288f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f18289n;

    public BaseErrorEvent() {
    }

    public BaseErrorEvent(String str, Integer num) {
        ErrorData errorData = new ErrorData();
        this.f18288f = errorData;
        errorData.setErrorType(num);
        this.f18288f.setMessage(str);
    }

    public String getBodyAsString() {
        return this.f18289n;
    }

    public ErrorData getErrorData() {
        return this.f18288f;
    }

    public int getHttpStatusCode() {
        return this.f18287d;
    }

    public void setBodyAsString(String str) {
        try {
            this.f18289n = str;
        } catch (k unused) {
        }
    }

    public void setErrorData(ErrorData errorData) {
        try {
            this.f18288f = errorData;
        } catch (k unused) {
        }
    }

    public void setHttpStatusCode(int i2) {
        try {
            this.f18287d = i2;
        } catch (k unused) {
        }
    }
}
