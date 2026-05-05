package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdInfoResult extends BaseResult {
    public static final int $stable = 0;
    private final String address;
    private final String dateOfBirth;
    private final String documentExpiryDate;
    private final String documentNumber;
    private final String fullName;
    private final String sex;

    public IdInfoResult() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public /* synthetic */ IdInfoResult(ResultCode resultCode, String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ResultCode.SUCCESS : resultCode, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) == 0 ? str6 : null);
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getSex() {
        return this.sex;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final String getDocumentExpiryDate() {
        return this.documentExpiryDate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdInfoResult(ResultCode resultCode, String str, String str2, String str3, String str4, String str5, String str6) {
        super(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.fullName = str;
        this.dateOfBirth = str2;
        this.sex = str3;
        this.address = str4;
        this.documentNumber = str5;
        this.documentExpiryDate = str6;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "IdInfoResult{fullName='" + this.fullName + "', dateOfBirth='" + this.dateOfBirth + "', sex='" + this.sex + "', address='" + this.address + "', documentNumber='" + this.documentNumber + "', documentExpiryDate='" + this.documentExpiryDate + "', resultCode=" + this.resultCode + "}";
    }
}
