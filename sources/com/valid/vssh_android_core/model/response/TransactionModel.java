package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class TransactionModel {

    @SerializedName(alternate = {}, value = "\b\t\b\u0013\u0018\u0010\u0015d\r\u0012\u000f\u0015n\u0013\t|")
    @InterfaceC1492Gx
    public String accountEntryType;

    @SerializedName(alternate = {}, value = "\b\t\b\u0013\u0018\u0010\u0015h\u0003")
    @InterfaceC1492Gx
    public Integer accountId;

    @SerializedName(alternate = {}, value = "\b\t\b\u0013\u0018\u0010\u0015m\u007f\u000b\u0002")
    @InterfaceC1492Gx
    public String accountName;

    @SerializedName(alternate = {}, value = "\b\t\b\u0013\u0018\u0010\u0015s\u0018\u000e\u0002")
    @InterfaceC1492Gx
    public String accountType;

    @SerializedName(alternate = {}, value = "\b\u001b\u0019\f\u0012\u0014\n\u001a\u007f\u0012\u0006\u000b\tg\u000e\u0005xz\u0007")
    @InterfaceC1492Gx
    public Long authorizationNumber;

    @SerializedName(alternate = {}, value = "\b\u001b\u0019\f\u0012\u0014\n\u001a\u007f\u0012\u0006\u000b\tk}\t\fz\b\b[u")
    @InterfaceC1492Gx
    public Long authorizationRequestId;

    @SerializedName(alternate = {}, value = "\n\u0007\u0017\bc\u0005\u0004\u0005\u000f\u0012\f\u000ehz\u0006|")
    @InterfaceC1492Gx
    public String cardAcceptorName;

    @SerializedName(alternate = {}, value = "\n\u0018\n\b\f\u0016l\t\r\u0003p\u0015\u000b~\\|\nx\u0007|\u0003\u0006y~|")
    @InterfaceC1492Gx
    public String creditLineTypeDescription;

    @SerializedName(alternate = {}, value = "\n\u001b\u0017\u0016\b\u0010\u0004\u0019g\u0002")
    @InterfaceC1492Gx
    public Short currencyId;

    @SerializedName(alternate = {}, value = "\n\u001b\u0017\u0016\b\u0010\u0004\u0019l~\n\u0001")
    @InterfaceC1492Gx
    public String currencyName;

    @SerializedName(alternate = {}, value = "\f\u0013\u0007\u0013\u0016\u0015\n\u000e\u0006k}\t\u007f")
    @InterfaceC1492Gx
    public String embossingName;

    @SerializedName(alternate = {}, value = "\r\u000f\u0013\u0005\u0011\u0005\n\u0001\u000b`\t|\u000e\r")
    @InterfaceC1492Gx
    public String financialClass;

    @SerializedName(alternate = {}, value = "\u0016\u0016\n\u0016\u0004\u0016\n\u000f\ra}\u0010\u007f")
    @InterfaceC1492Gx
    public String operationDate;

    @SerializedName(alternate = {}, value = "\u0016\u0016\n\u0016\u0004\u0016\n\u000f\rf\u0001")
    @InterfaceC1492Gx
    public Long operationId;

    @SerializedName(alternate = {}, value = "\u0016\u0016\n\u0016\u0004\u0016\n\u000f\rq\u0006\t\u007f")
    @InterfaceC1492Gx
    public String operationTime;

    @SerializedName(alternate = {}, value = "\u0016\u0016\n\u0016\u0004\u0016\n\u000f\rq\u0016\f\u007f]}\u000by")
    @InterfaceC1492Gx
    public String operationTypeDesc;

    @SerializedName(alternate = {}, value = "\u0016\u0016\n\u0016\u0004\u0016\n\u000f\rq\u0016\f\u007fb|")
    @InterfaceC1492Gx
    public Integer operationTypeId;

    @SerializedName(alternate = {}, value = "\u0017\u0015\u000e\u0012\u0017\u0015")
    @InterfaceC1492Gx
    public Double points;

    @SerializedName(alternate = {}, value = "\u001b\u0018\u0006\u0012\u0016\u0003\u0004\u0014\b\r\u000b\\\b\t\u000e\u0006\u000b")
    @InterfaceC1492Gx
    public Double transactionAmount;

    public class Exception extends RuntimeException {
    }

    public String getAccountEntryType() {
        return this.accountEntryType;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public Long getAuthorizationNumber() {
        return this.authorizationNumber;
    }

    public Long getAuthorizationRequestId() {
        return this.authorizationRequestId;
    }

    public String getCardAcceptorName() {
        return this.cardAcceptorName;
    }

    public String getCreditLineTypeDescription() {
        return this.creditLineTypeDescription;
    }

    public Short getCurrencyId() {
        return this.currencyId;
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public String getEmbossingName() {
        return this.embossingName;
    }

    public String getFinancialClass() {
        return this.financialClass;
    }

    public String getOperationDate() {
        return this.operationDate;
    }

    public Long getOperationId() {
        return this.operationId;
    }

    public String getOperationTime() {
        return this.operationTime;
    }

    public String getOperationTypeDesc() {
        return this.operationTypeDesc;
    }

    public Integer getOperationTypeId() {
        return this.operationTypeId;
    }

    public Double getPoints() {
        return this.points;
    }

    public Double getTransactionAmount() {
        return this.transactionAmount;
    }

    public void setAccountEntryType(String str) {
        try {
            this.accountEntryType = str;
        } catch (Exception unused) {
        }
    }

    public void setAccountId(Integer num) {
        try {
            this.accountId = num;
        } catch (Exception unused) {
        }
    }

    public void setAccountName(String str) {
        try {
            this.accountName = str;
        } catch (Exception unused) {
        }
    }

    public void setAccountType(String str) {
        try {
            this.accountType = str;
        } catch (Exception unused) {
        }
    }

    public void setAuthorizationNumber(Long l2) {
        try {
            this.authorizationNumber = l2;
        } catch (Exception unused) {
        }
    }

    public void setAuthorizationRequestId(Long l2) {
        try {
            this.authorizationRequestId = l2;
        } catch (Exception unused) {
        }
    }

    public void setCardAcceptorName(String str) {
        try {
            this.cardAcceptorName = str;
        } catch (Exception unused) {
        }
    }

    public void setCreditLineTypeDescription(String str) {
        try {
            this.creditLineTypeDescription = str;
        } catch (Exception unused) {
        }
    }

    public void setCurrencyId(Short sh) {
        try {
            this.currencyId = sh;
        } catch (Exception unused) {
        }
    }

    public void setCurrencyName(String str) {
        try {
            this.currencyName = str;
        } catch (Exception unused) {
        }
    }

    public void setEmbossingName(String str) {
        try {
            this.embossingName = str;
        } catch (Exception unused) {
        }
    }

    public void setFinancialClass(String str) {
        try {
            this.financialClass = str;
        } catch (Exception unused) {
        }
    }

    public void setOperationDate(String str) {
        try {
            this.operationDate = str;
        } catch (Exception unused) {
        }
    }

    public void setOperationId(Long l2) {
        try {
            this.operationId = l2;
        } catch (Exception unused) {
        }
    }

    public void setOperationTime(String str) {
        try {
            this.operationTime = str;
        } catch (Exception unused) {
        }
    }

    public void setOperationTypeDesc(String str) {
        try {
            this.operationTypeDesc = str;
        } catch (Exception unused) {
        }
    }

    public void setOperationTypeId(Integer num) {
        try {
            this.operationTypeId = num;
        } catch (Exception unused) {
        }
    }

    public void setPoints(Double d2) {
        try {
            this.points = d2;
        } catch (Exception unused) {
        }
    }

    public void setTransactionAmount(Double d2) {
        try {
            this.transactionAmount = d2;
        } catch (Exception unused) {
        }
    }
}
