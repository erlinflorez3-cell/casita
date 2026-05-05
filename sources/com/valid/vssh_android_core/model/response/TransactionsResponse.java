package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import com.valid.vssh_android_core.basecore.BaseResponse;
import java.util.List;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class TransactionsResponse extends BaseResponse {

    @SerializedName(alternate = {}, value = "\u000b\u0007\u0019\u0005")
    @InterfaceC1492Gx
    public List<TransactionModel> data;

    @SerializedName(alternate = {}, value = "\f\u0014\u0006\u0006\u000f\u0007s\u000f\u0011\u0012\u0006\n\u0002")
    @InterfaceC1492Gx
    public boolean enableSorting;

    @SerializedName(alternate = {}, value = "\u0010\u0014\t\t\u001b")
    @InterfaceC1492Gx
    public Integer index;

    @SerializedName(alternate = {}, value = "\u0015\u001b\u0012\u0006\b\u0014r\u000f\u0016\u0011r\u0005\u000e\u000fy\u0004\u007f\u0010yw")
    @InterfaceC1492Gx
    public Integer numberRowsVisualized;

    @SerializedName(alternate = {}, value = "\u001b\u0015\u0019\u0005\u000fo\u0016\r\u0001\u0003\u000fm\n\u0011\f")
    @InterfaceC1492Gx
    public Integer totalNumberRows;

    public class IOException extends RuntimeException {
    }

    public List<TransactionModel> getData() {
        return this.data;
    }

    public Integer getIndex() {
        return this.index;
    }

    public Integer getNumberRowsVisualized() {
        return this.numberRowsVisualized;
    }

    public Integer getTotalNumberRows() {
        return this.totalNumberRows;
    }

    public boolean isEnableSorting() {
        return this.enableSorting;
    }

    public void setData(List<TransactionModel> list) {
        try {
            this.data = list;
        } catch (IOException unused) {
        }
    }

    public void setEnableSorting(boolean z2) {
        try {
            this.enableSorting = z2;
        } catch (IOException unused) {
        }
    }

    public void setIndex(Integer num) {
        try {
            this.index = num;
        } catch (IOException unused) {
        }
    }

    public void setNumberRowsVisualized(Integer num) {
        try {
            this.numberRowsVisualized = num;
        } catch (IOException unused) {
        }
    }

    public void setTotalNumberRows(Integer num) {
        try {
            this.totalNumberRows = num;
        } catch (IOException unused) {
        }
    }
}
