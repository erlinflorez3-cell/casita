package com.valid.vssh_android_core.basecore;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class BaseRquestModel extends BaseModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Object> f18337a;

    public class ParseException extends RuntimeException {
    }

    @Override // com.valid.vssh_android_core.basecore.BaseModel
    public Map<String, Object> getPrincipalData() {
        return this.f18337a;
    }

    @Override // com.valid.vssh_android_core.basecore.BaseModel
    public void setPrincipalData(Map<String, Object> map) {
        try {
            this.f18337a = map;
        } catch (ParseException unused) {
        }
    }
}
