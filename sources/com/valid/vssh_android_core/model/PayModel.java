package com.valid.vssh_android_core.model;

import com.valid.vssh_android_core.basecore.BaseModel;

/* JADX INFO: loaded from: classes5.dex */
public class PayModel extends BaseModel {
    public Double amount;

    public class ParseException extends RuntimeException {
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double d2) {
        try {
            this.amount = d2;
        } catch (ParseException unused) {
        }
    }
}
