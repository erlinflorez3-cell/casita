package com.valid.vssh_android_core.model;

import com.valid.vssh_android_core.basecore.BaseModel;

/* JADX INFO: loaded from: classes5.dex */
public class TransactionsModel extends BaseModel {
    public Integer index;
    public Integer sizeLimit;

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    public Integer getIndex() {
        return this.index;
    }

    public Integer getSizeLimit() {
        return this.sizeLimit;
    }

    public void setIndex(Integer num) {
        try {
            this.index = num;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setSizeLimit(Integer num) {
        try {
            this.sizeLimit = num;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }
}
