package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import com.valid.vssh_android_core.basecore.BaseResponse;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class CardAccountInfoResponse extends BaseResponse {

    @SerializedName(alternate = {}, value = "\b\t\b\u0013\u0018\u0010\u0015b\u000b~\u0010\u000f")
    @InterfaceC1492Gx
    public String accountClass;

    @SerializedName(alternate = {}, value = "\b\t\b\u0013\u0018\u0010\u0015h\u0003")
    @InterfaceC1492Gx
    public Long accountId;

    @SerializedName(alternate = {}, value = "\b\t\b\u0013\u0018\u0010\u0015r\u0013~\u0011\u0011\u000e")
    @InterfaceC1492Gx
    public String accountStatus;

    @SerializedName(alternate = {}, value = "\b\t\b\u0013\u0018\u0010\u0015r\u0013~\u0011\u0011\u000em\u0002\u0005{")
    @InterfaceC1492Gx
    public String accountStatusTime;

    @SerializedName(alternate = {}, value = "\b\u001c\u0006\r\u000f\u0003\u0003\f\u0004_}\b{\b{|")
    @InterfaceC1492Gx
    public Double availableBalance;

    @SerializedName(alternate = {}, value = "\t\u0007\u0011\u0005\u0011\u0005\u0006n\re\f\b~")
    @InterfaceC1492Gx
    public Integer balanceOnHold;

    @SerializedName(alternate = {}, value = "\n\u0007\u0017\bk\u0006")
    @InterfaceC1492Gx
    public String cardId;

    @SerializedName(alternate = {}, value = "\n\u0018\n\b\f\u0016l\t\r\u0003p\u0015\u000b~\\|\nx")
    @InterfaceC1492Gx
    public String creditLineTypeDesc;

    @SerializedName(alternate = {}, value = "\n\u0018\n\b\f\u0016l\t\r\u0003p\u0015\u000b~a{")
    @InterfaceC1492Gx
    public Integer creditLineTypeId;

    @SerializedName(alternate = {}, value = "\n\u001b\u0017\u0016\b\u0010\u0004\u0019g\u0002")
    @InterfaceC1492Gx
    public Integer currencyId;

    @SerializedName(alternate = {}, value = "\u0014\u0007\u0018\u000f\b\u0006c\u0001\u0011\u0002e\u007f")
    @InterfaceC1492Gx
    public String maskedCardId;

    @SerializedName(alternate = {}, value = "\u0017\u0015\u000e\u0012\u0017\u0015b\u0001\u000b~\u000b~\u007f")
    @InterfaceC1492Gx
    public Long pointsBalance;

    @SerializedName(alternate = {}, value = "\u0017\u0018\u0014\b\u0018\u0005\u0015c\u0004\u0011\u007f")
    @InterfaceC1492Gx
    public String productDesc;

    @SerializedName(alternate = {}, value = "\u0017\u0018\u0014\b\u0018\u0005\u0015h\u0003")
    @InterfaceC1492Gx
    public Integer productId;

    @SerializedName(alternate = {}, value = "\u0019\u000b\u001c\u0005\u0015\u0006a\u0016\u007f\u0007\t||\u0006}Yw\u0002u\u0002uv")
    @InterfaceC1492Gx
    public Double rewardAvailableBalance;

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    public String getAccountClass() {
        return this.accountClass;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public String getAccountStatus() {
        return this.accountStatus;
    }

    public String getAccountStatusTime() {
        return this.accountStatusTime;
    }

    public Double getAvailableBalance() {
        return this.availableBalance;
    }

    public Integer getBalanceOnHold() {
        return this.balanceOnHold;
    }

    public String getCardId() {
        return this.cardId;
    }

    public String getCreditLineTypeDesc() {
        return this.creditLineTypeDesc;
    }

    public Integer getCreditLineTypeId() {
        return this.creditLineTypeId;
    }

    public Integer getCurrencyId() {
        return this.currencyId;
    }

    public String getMaskedCardId() {
        return this.maskedCardId;
    }

    public Long getPointsBalance() {
        return this.pointsBalance;
    }

    public String getProductDesc() {
        return this.productDesc;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public Double getRewardAvailableBalance() {
        return this.rewardAvailableBalance;
    }

    public void setAccountClass(String str) {
        try {
            this.accountClass = str;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setAccountId(Long l2) {
        try {
            this.accountId = l2;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setAccountStatus(String str) {
        try {
            this.accountStatus = str;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setAccountStatusTime(String str) {
        try {
            this.accountStatusTime = str;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setAvailableBalance(Double d2) {
        try {
            this.availableBalance = d2;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setBalanceOnHold(Integer num) {
        try {
            this.balanceOnHold = num;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setCardId(String str) {
        try {
            this.cardId = str;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setCreditLineTypeDesc(String str) {
        try {
            this.creditLineTypeDesc = str;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setCreditLineTypeId(Integer num) {
        try {
            this.creditLineTypeId = num;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setCurrencyId(Integer num) {
        try {
            this.currencyId = num;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setMaskedCardId(String str) {
        try {
            this.maskedCardId = str;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setPointsBalance(Long l2) {
        try {
            this.pointsBalance = l2;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setProductDesc(String str) {
        try {
            this.productDesc = str;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setProductId(Integer num) {
        try {
            this.productId = num;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public void setRewardAvailableBalance(Double d2) {
        try {
            this.rewardAvailableBalance = d2;
        } catch (ArrayOutOfBoundsException unused) {
        }
    }
}
