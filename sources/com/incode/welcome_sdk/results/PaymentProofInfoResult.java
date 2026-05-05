package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class PaymentProofInfoResult {
    public static final int $stable = 0;
    private final String cancellationStatus;
    private final String certificationDate;
    private final String fiscalInvoice;
    private final String issueDate;
    private final String issuerName;
    private final String receiverName;
    private final String rfcIssuer;
    private final String rfcPac;
    private final String rfcReceiver;
    private final String status;
    private final String totalCfdi;
    private final String validationCode;
    private final String voucherEffect;

    public static /* synthetic */ PaymentProofInfoResult copy$default(PaymentProofInfoResult paymentProofInfoResult, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paymentProofInfoResult.rfcIssuer;
        }
        if ((i2 & 2) != 0) {
            str2 = paymentProofInfoResult.issuerName;
        }
        if ((i2 & 4) != 0) {
            str3 = paymentProofInfoResult.rfcReceiver;
        }
        if ((i2 & 8) != 0) {
            str4 = paymentProofInfoResult.receiverName;
        }
        if ((i2 & 16) != 0) {
            str5 = paymentProofInfoResult.fiscalInvoice;
        }
        if ((i2 & 32) != 0) {
            str6 = paymentProofInfoResult.issueDate;
        }
        if ((i2 & 64) != 0) {
            str7 = paymentProofInfoResult.certificationDate;
        }
        if ((i2 & 128) != 0) {
            str8 = paymentProofInfoResult.rfcPac;
        }
        if ((i2 & 256) != 0) {
            str9 = paymentProofInfoResult.totalCfdi;
        }
        if ((i2 & 512) != 0) {
            str10 = paymentProofInfoResult.voucherEffect;
        }
        if ((i2 & 1024) != 0) {
            str11 = paymentProofInfoResult.cancellationStatus;
        }
        if ((i2 & 2048) != 0) {
            str12 = paymentProofInfoResult.validationCode;
        }
        if ((i2 & 4096) != 0) {
            str13 = paymentProofInfoResult.status;
        }
        return paymentProofInfoResult.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    public final String component1() {
        return this.rfcIssuer;
    }

    public final String component10() {
        return this.voucherEffect;
    }

    public final String component11() {
        return this.cancellationStatus;
    }

    public final String component12() {
        return this.validationCode;
    }

    public final String component13() {
        return this.status;
    }

    public final String component2() {
        return this.issuerName;
    }

    public final String component3() {
        return this.rfcReceiver;
    }

    public final String component4() {
        return this.receiverName;
    }

    public final String component5() {
        return this.fiscalInvoice;
    }

    public final String component6() {
        return this.issueDate;
    }

    public final String component7() {
        return this.certificationDate;
    }

    public final String component8() {
        return this.rfcPac;
    }

    public final String component9() {
        return this.totalCfdi;
    }

    public final PaymentProofInfoResult copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        return new PaymentProofInfoResult(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentProofInfoResult)) {
            return false;
        }
        PaymentProofInfoResult paymentProofInfoResult = (PaymentProofInfoResult) obj;
        return Intrinsics.areEqual(this.rfcIssuer, paymentProofInfoResult.rfcIssuer) && Intrinsics.areEqual(this.issuerName, paymentProofInfoResult.issuerName) && Intrinsics.areEqual(this.rfcReceiver, paymentProofInfoResult.rfcReceiver) && Intrinsics.areEqual(this.receiverName, paymentProofInfoResult.receiverName) && Intrinsics.areEqual(this.fiscalInvoice, paymentProofInfoResult.fiscalInvoice) && Intrinsics.areEqual(this.issueDate, paymentProofInfoResult.issueDate) && Intrinsics.areEqual(this.certificationDate, paymentProofInfoResult.certificationDate) && Intrinsics.areEqual(this.rfcPac, paymentProofInfoResult.rfcPac) && Intrinsics.areEqual(this.totalCfdi, paymentProofInfoResult.totalCfdi) && Intrinsics.areEqual(this.voucherEffect, paymentProofInfoResult.voucherEffect) && Intrinsics.areEqual(this.cancellationStatus, paymentProofInfoResult.cancellationStatus) && Intrinsics.areEqual(this.validationCode, paymentProofInfoResult.validationCode) && Intrinsics.areEqual(this.status, paymentProofInfoResult.status);
    }

    public final int hashCode() {
        String str = this.rfcIssuer;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.issuerName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rfcReceiver;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.receiverName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fiscalInvoice;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.issueDate;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.certificationDate;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rfcPac;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.totalCfdi;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.voucherEffect;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.cancellationStatus;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.validationCode;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.status;
        return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentProofInfoResult(rfcIssuer=" + this.rfcIssuer + ", issuerName=" + this.issuerName + ", rfcReceiver=" + this.rfcReceiver + ", receiverName=" + this.receiverName + ", fiscalInvoice=" + this.fiscalInvoice + ", issueDate=" + this.issueDate + ", certificationDate=" + this.certificationDate + ", rfcPac=" + this.rfcPac + ", totalCfdi=" + this.totalCfdi + ", voucherEffect=" + this.voucherEffect + ", cancellationStatus=" + this.cancellationStatus + ", validationCode=" + this.validationCode + ", status=" + this.status + ")";
    }

    public PaymentProofInfoResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.rfcIssuer = str;
        this.issuerName = str2;
        this.rfcReceiver = str3;
        this.receiverName = str4;
        this.fiscalInvoice = str5;
        this.issueDate = str6;
        this.certificationDate = str7;
        this.rfcPac = str8;
        this.totalCfdi = str9;
        this.voucherEffect = str10;
        this.cancellationStatus = str11;
        this.validationCode = str12;
        this.status = str13;
    }

    public final String getRfcIssuer() {
        return this.rfcIssuer;
    }

    public final String getIssuerName() {
        return this.issuerName;
    }

    public final String getRfcReceiver() {
        return this.rfcReceiver;
    }

    public final String getReceiverName() {
        return this.receiverName;
    }

    public final String getFiscalInvoice() {
        return this.fiscalInvoice;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final String getCertificationDate() {
        return this.certificationDate;
    }

    public final String getRfcPac() {
        return this.rfcPac;
    }

    public final String getTotalCfdi() {
        return this.totalCfdi;
    }

    public final String getVoucherEffect() {
        return this.voucherEffect;
    }

    public final String getCancellationStatus() {
        return this.cancellationStatus;
    }

    public final String getValidationCode() {
        return this.validationCode;
    }

    public final String getStatus() {
        return this.status;
    }
}
