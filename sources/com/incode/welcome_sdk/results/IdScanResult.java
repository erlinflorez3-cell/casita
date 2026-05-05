package com.incode.welcome_sdk.results;

import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.data.remote.beans.bc;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter_Factory;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdScanResult extends BaseResult {
    public IdScan.IdType chosenIdType;
    public String classifiedIdType;
    public String countryCode;
    public String croppedFacePath;
    public String failReason;
    public IdCategory idCategory;
    public String idImageBase64;
    public String idImagePath;
    public Integer idealCaptureEnvironmentTestResult;
    public boolean isOnlyBack;
    public boolean isOnlyFront;
    public String issueName;
    public Integer issueYear;
    public String metadata;
    public int scanStatus;
    public boolean skipBackIdCapture;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public IdScanResult() {
        this(null, null, 0, null, null, null, false, false, null, null, null, null, null, false, null, null, 65535, null);
    }

    public static /* synthetic */ IdScanResult copy$default(IdScanResult idScanResult, String str, String str2, int i2, IdScan.IdType idType, String str3, IdCategory idCategory, boolean z2, boolean z3, String str4, String str5, Integer num, String str6, String str7, boolean z4, Integer num2, String str8, int i3, Object obj) {
        String str9 = str2;
        String str10 = str;
        String str11 = str3;
        IdScan.IdType idType2 = idType;
        int i4 = i2;
        boolean z5 = z3;
        boolean z6 = z2;
        IdCategory idCategory2 = idCategory;
        Integer num3 = num;
        String str12 = str5;
        String str13 = str4;
        boolean z7 = z4;
        String str14 = str7;
        String str15 = str6;
        String str16 = str8;
        Integer num4 = num2;
        if ((i3 & 1) != 0) {
            str10 = idScanResult.idImagePath;
        }
        if ((i3 & 2) != 0) {
            str9 = idScanResult.idImageBase64;
        }
        if ((i3 & 4) != 0) {
            i4 = idScanResult.scanStatus;
        }
        if ((i3 & 8) != 0) {
            idType2 = idScanResult.chosenIdType;
        }
        if ((i3 & 16) != 0) {
            str11 = idScanResult.classifiedIdType;
        }
        if ((i3 & 32) != 0) {
            idCategory2 = idScanResult.idCategory;
        }
        if ((i3 & 64) != 0) {
            z6 = idScanResult.isOnlyFront;
        }
        if ((i3 & 128) != 0) {
            z5 = idScanResult.isOnlyBack;
        }
        if ((i3 & 256) != 0) {
            str13 = idScanResult.croppedFacePath;
        }
        if ((i3 & 512) != 0) {
            str12 = idScanResult.issueName;
        }
        if ((i3 & 1024) != 0) {
            num3 = idScanResult.issueYear;
        }
        if ((i3 & 2048) != 0) {
            str15 = idScanResult.countryCode;
        }
        if ((i3 & 4096) != 0) {
            str14 = idScanResult.failReason;
        }
        if ((i3 & 8192) != 0) {
            z7 = idScanResult.skipBackIdCapture;
        }
        if ((i3 & 16384) != 0) {
            num4 = idScanResult.idealCaptureEnvironmentTestResult;
        }
        if ((i3 & 32768) != 0) {
            str16 = idScanResult.metadata;
        }
        return idScanResult.copy(str10, str9, i4, idType2, str11, idCategory2, z6, z5, str13, str12, num3, str15, str14, z7, num4, str16);
    }

    @Deprecated(message = "This info is part of metadata", replaceWith = @ReplaceWith(expression = "IdScanResult.metadata", imports = {}))
    public static /* synthetic */ void getIdealCaptureEnvironmentTestResult$annotations() {
    }

    public final String component1() {
        return this.idImagePath;
    }

    public final String component10() {
        return this.issueName;
    }

    public final Integer component11() {
        return this.issueYear;
    }

    public final String component12() {
        return this.countryCode;
    }

    public final String component13() {
        return this.failReason;
    }

    public final boolean component14() {
        return this.skipBackIdCapture;
    }

    public final Integer component15() {
        return this.idealCaptureEnvironmentTestResult;
    }

    public final String component16() {
        return this.metadata;
    }

    public final String component2() {
        return this.idImageBase64;
    }

    public final int component3() {
        return this.scanStatus;
    }

    public final IdScan.IdType component4() {
        return this.chosenIdType;
    }

    public final String component5() {
        return this.classifiedIdType;
    }

    public final IdCategory component6() {
        return this.idCategory;
    }

    public final boolean component7() {
        return this.isOnlyFront;
    }

    public final boolean component8() {
        return this.isOnlyBack;
    }

    public final String component9() {
        return this.croppedFacePath;
    }

    public final IdScanResult copy(String str, String str2, int i2, IdScan.IdType idType, String str3, IdCategory idCategory, boolean z2, boolean z3, String str4, String str5, Integer num, String str6, String str7, boolean z4, Integer num2, String str8) {
        return new IdScanResult(str, str2, i2, idType, str3, idCategory, z2, z3, str4, str5, num, str6, str7, z4, num2, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdScanResult)) {
            return false;
        }
        IdScanResult idScanResult = (IdScanResult) obj;
        return Intrinsics.areEqual(this.idImagePath, idScanResult.idImagePath) && Intrinsics.areEqual(this.idImageBase64, idScanResult.idImageBase64) && this.scanStatus == idScanResult.scanStatus && this.chosenIdType == idScanResult.chosenIdType && Intrinsics.areEqual(this.classifiedIdType, idScanResult.classifiedIdType) && this.idCategory == idScanResult.idCategory && this.isOnlyFront == idScanResult.isOnlyFront && this.isOnlyBack == idScanResult.isOnlyBack && Intrinsics.areEqual(this.croppedFacePath, idScanResult.croppedFacePath) && Intrinsics.areEqual(this.issueName, idScanResult.issueName) && Intrinsics.areEqual(this.issueYear, idScanResult.issueYear) && Intrinsics.areEqual(this.countryCode, idScanResult.countryCode) && Intrinsics.areEqual(this.failReason, idScanResult.failReason) && this.skipBackIdCapture == idScanResult.skipBackIdCapture && Intrinsics.areEqual(this.idealCaptureEnvironmentTestResult, idScanResult.idealCaptureEnvironmentTestResult) && Intrinsics.areEqual(this.metadata, idScanResult.metadata);
    }

    public final int hashCode() {
        String str = this.idImagePath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.idImageBase64;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.scanStatus)) * 31;
        IdScan.IdType idType = this.chosenIdType;
        int iHashCode3 = (iHashCode2 + (idType == null ? 0 : idType.hashCode())) * 31;
        String str3 = this.classifiedIdType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        IdCategory idCategory = this.idCategory;
        int iHashCode5 = (((((iHashCode4 + (idCategory == null ? 0 : idCategory.hashCode())) * 31) + Boolean.hashCode(this.isOnlyFront)) * 31) + Boolean.hashCode(this.isOnlyBack)) * 31;
        String str4 = this.croppedFacePath;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.issueName;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.issueYear;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.countryCode;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.failReason;
        int iHashCode10 = (((iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31) + Boolean.hashCode(this.skipBackIdCapture)) * 31;
        Integer num2 = this.idealCaptureEnvironmentTestResult;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.metadata;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "IdScanResult(idImagePath=" + this.idImagePath + ", idImageBase64=" + this.idImageBase64 + ", scanStatus=" + this.scanStatus + ", chosenIdType=" + this.chosenIdType + ", classifiedIdType=" + this.classifiedIdType + ", idCategory=" + this.idCategory + ", isOnlyFront=" + this.isOnlyFront + ", isOnlyBack=" + this.isOnlyBack + ", croppedFacePath=" + this.croppedFacePath + ", issueName=" + this.issueName + ", issueYear=" + this.issueYear + ", countryCode=" + this.countryCode + ", failReason=" + this.failReason + ", skipBackIdCapture=" + this.skipBackIdCapture + ", idealCaptureEnvironmentTestResult=" + this.idealCaptureEnvironmentTestResult + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ IdScanResult(String str, String str2, int i2, IdScan.IdType idType, String str3, IdCategory idCategory, boolean z2, boolean z3, String str4, String str5, Integer num, String str6, String str7, boolean z4, Integer num2, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? null : idType, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : idCategory, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? false : z3, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : str5, (i3 & 1024) != 0 ? null : num, (i3 & 2048) != 0 ? null : str6, (i3 & 4096) != 0 ? null : str7, (i3 & 8192) == 0 ? z4 : false, (i3 & 16384) != 0 ? null : num2, (i3 & 32768) != 0 ? null : str8);
    }

    public IdScanResult(String str, String str2, int i2, IdScan.IdType idType, String str3, IdCategory idCategory, boolean z2, boolean z3, String str4, String str5, Integer num, String str6, String str7, boolean z4, Integer num2, String str8) {
        super(null, null, null, 7, null);
        this.idImagePath = str;
        this.idImageBase64 = str2;
        this.scanStatus = i2;
        this.chosenIdType = idType;
        this.classifiedIdType = str3;
        this.idCategory = idCategory;
        this.isOnlyFront = z2;
        this.isOnlyBack = z3;
        this.croppedFacePath = str4;
        this.issueName = str5;
        this.issueYear = num;
        this.countryCode = str6;
        this.failReason = str7;
        this.skipBackIdCapture = z4;
        this.idealCaptureEnvironmentTestResult = num2;
        this.metadata = str8;
    }

    public final IdScan.IdType getActualIdType() {
        String str = this.classifiedIdType;
        if (str != null) {
            return Intrinsics.areEqual(str, "Passport") ? IdScan.IdType.PASSPORT : IdScan.IdType.ID;
        }
        IdScan.IdType idType = this.chosenIdType;
        return idType == null ? IdScan.IdType.ID : idType;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IdScanResult from(IdScan idScan, IdScan.IdType chosenIdType) {
            Intrinsics.checkNotNullParameter(idScan, "idScan");
            Intrinsics.checkNotNullParameter(chosenIdType, "chosenIdType");
            IdScanResult idScanResult = new IdScanResult(null, null, 0, null, null, null, false, false, null, null, null, null, null, false, null, null, 65535, null);
            idScanResult.chosenIdType = chosenIdType;
            idScanResult.idCategory = idScan.getIdCategory();
            idScanResult.isOnlyFront = idScan.getScanStep() == IdScan.ScanStep.FRONT;
            idScanResult.isOnlyBack = idScan.getScanStep() == IdScan.ScanStep.BACK;
            return idScanResult;
        }

        public final IdScanResult from(bc response, IdScan idScan, IdScan.IdType chosenIdType) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(idScan, "idScan");
            Intrinsics.checkNotNullParameter(chosenIdType, "chosenIdType");
            IdScanResult idScanResultFrom = from(idScan, chosenIdType);
            idScanResultFrom.resultCode = ResultCode.SUCCESS;
            idScanResultFrom.classifiedIdType = response.f9398b;
            idScanResultFrom.issueName = response.c();
            idScanResultFrom.issueYear = Integer.valueOf(response.f());
            int iE = BaseValidationPresenter_Factory.e();
            int iE2 = BaseValidationPresenter_Factory.e();
            idScanResultFrom.countryCode = (String) bc.e(BaseValidationPresenter_Factory.e(), new Object[]{response}, -210598799, BaseValidationPresenter_Factory.e(), iE, 210598801, iE2);
            idScanResultFrom.failReason = response.g();
            idScanResultFrom.skipBackIdCapture = response.j();
            return idScanResultFrom;
        }
    }
}
