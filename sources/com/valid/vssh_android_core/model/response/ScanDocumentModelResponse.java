package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import com.valid.vssh_android_core.basecore.BaseResponse;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class ScanDocumentModelResponse extends BaseResponse {

    @SerializedName(alternate = {}, value = "\t\u000f\u0017\u0018\u000b\u0006\u0002\u0014\u0004")
    @InterfaceC1492Gx
    public String birthDate;

    @SerializedName(alternate = {}, value = "\t\u000f\u0017\u0018\u000b\u0006\u0002\u0014\u0004a}\u0015")
    @InterfaceC1492Gx
    public String birthDateDay;

    @SerializedName(alternate = {}, value = "\t\u000f\u0017\u0018\u000b\u0006\u0002\u0014\u0004j\f\n\u000f\u0002")
    @InterfaceC1492Gx
    public String birthDateMonth;

    @SerializedName(alternate = {}, value = "\t\u000f\u0017\u0018\u000b\u0006\u0002\u0014\u0004v\u0002|\r")
    @InterfaceC1492Gx
    public String birthDateYear;

    @SerializedName(alternate = {}, value = "\t\u0012\u0014\u0013\u0007u\u001a\u0010\u0004")
    @InterfaceC1492Gx
    public String bloodType;

    @SerializedName(alternate = {}, value = "\n\u000f\u0019\u001d")
    @InterfaceC1492Gx
    public PlaceModel city;

    @SerializedName(alternate = {}, value = "\n\u0015\tf\f\u0016\u001ac\u007f\f\u0002")
    @InterfaceC1492Gx
    public String codCityDane;

    @SerializedName(alternate = {}, value = "\n\u0015\tf\f\u0016\u001aq\u0004\u0005\u0006\u000f\u000f\fy\f\u007f\u0005\u0003")
    @InterfaceC1492Gx
    public String codCityRegistration;

    @SerializedName(alternate = {}, value = "\n\u0015\tg\b\u0012\u0002\u0012\u0013\u000b\u0002\n\u000f]y\u0006{")
    @InterfaceC1492Gx
    public String codDepartmentDane;

    @SerializedName(alternate = {}, value = "\n\u0015\tg\b\u0012\u0002\u0012\u0013\u000b\u0002\n\u000fk}~\u007f\t\t\u0006s\u0006y~|")
    @InterfaceC1492Gx
    public String codDepartmentRegistration;

    @SerializedName(alternate = {}, value = "\u000b\u000b\u0015\u0005\u0015\u0016\u000e\u0005\r\u0012")
    @InterfaceC1492Gx
    public PlaceModel department;

    @SerializedName(alternate = {}, value = "\f\u001e\u0015\t\u0007\u000b\u0015\t\u000e\f_\u0005\u000f\u0013")
    @InterfaceC1492Gx
    public String expeditionCity;

    @SerializedName(alternate = {}, value = "\f\u001e\u0015\t\u0007\u000b\u0015\t\u000e\f`|\u000f~")
    @InterfaceC1492Gx
    public String expeditionDate;

    @SerializedName(alternate = {}, value = "\r\u000f\u0017\u0017\u0017\u0010\u0002\r\u0004")
    @InterfaceC1492Gx
    public String firstName;

    @SerializedName(alternate = {}, value = "\r\u000f\u0017\u0017\u0017\u0010\u0002\r\u0004N")
    @InterfaceC1492Gx
    public String firstName1;

    @SerializedName(alternate = {}, value = "\r\u000f\u0017\u0017\u0017\u0010\u0002\r\u0004O")
    @InterfaceC1492Gx
    public String firstName2;

    @SerializedName(alternate = {}, value = "\u000e\u000b\u0013\b\b\u0014")
    @InterfaceC1492Gx
    public String gender;

    @SerializedName(alternate = {}, value = "\u0010\nr\u0019\u0010\u0004\u0006\u0012")
    @InterfaceC1492Gx
    public String idNumber;

    @SerializedName(alternate = {}, value = "\u0010\nx\u001d\u0013\u0007")
    @InterfaceC1492Gx
    public String idType;

    @SerializedName(alternate = {}, value = "\u0013\u0007\u0018\u0018\u0011\u0003\u000e\u0005")
    @InterfaceC1492Gx
    public String lastName;

    @SerializedName(alternate = {}, value = "\u0013\u0007\u0018\u0018\u0011\u0003\u000e\u0005O")
    @InterfaceC1492Gx
    public String lastName1;

    @SerializedName(alternate = {}, value = "\u0013\u0007\u0018\u0018\u0011\u0003\u000e\u0005P")
    @InterfaceC1492Gx
    public String lastName2;

    @SerializedName(alternate = {}, value = "\u0019\u000ej\u0005\u0006\u0016\u0010\u0012")
    @InterfaceC1492Gx
    public String rhFactor;

    public class IOException extends RuntimeException {
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getBirthDateDay() {
        return this.birthDateDay;
    }

    public String getBirthDateMonth() {
        return this.birthDateMonth;
    }

    public String getBirthDateYear() {
        return this.birthDateYear;
    }

    public String getBloodType() {
        return this.bloodType;
    }

    public PlaceModel getCity() {
        return this.city;
    }

    public String getCodCityDane() {
        return this.codCityDane;
    }

    public String getCodCityRegistration() {
        return this.codCityRegistration;
    }

    public String getCodDepartmentDane() {
        return this.codDepartmentDane;
    }

    public String getCodDepartmentRegistration() {
        return this.codDepartmentRegistration;
    }

    public PlaceModel getDepartment() {
        return this.department;
    }

    public String getExpeditionCity() {
        return this.expeditionCity;
    }

    public String getExpeditionDate() {
        return this.expeditionDate;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFirstName1() {
        return this.firstName1;
    }

    public String getFirstName2() {
        return this.firstName2;
    }

    public String getGender() {
        return this.gender;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public String getIdType() {
        return this.idType;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getLastName1() {
        return this.lastName1;
    }

    public String getLastName2() {
        return this.lastName2;
    }

    public String getRhFactor() {
        return this.rhFactor;
    }

    public void setBirthDate(String str) {
        try {
            this.birthDate = str;
        } catch (IOException unused) {
        }
    }

    public void setBirthDateDay(String str) {
        try {
            this.birthDateDay = str;
        } catch (IOException unused) {
        }
    }

    public void setBirthDateMonth(String str) {
        try {
            this.birthDateMonth = str;
        } catch (IOException unused) {
        }
    }

    public void setBirthDateYear(String str) {
        try {
            this.birthDateYear = str;
        } catch (IOException unused) {
        }
    }

    public void setBloodType(String str) {
        try {
            this.bloodType = str;
        } catch (IOException unused) {
        }
    }

    public void setCity(PlaceModel placeModel) {
        try {
            this.city = placeModel;
        } catch (IOException unused) {
        }
    }

    public void setCodCityDane(String str) {
        try {
            this.codCityDane = str;
        } catch (IOException unused) {
        }
    }

    public void setCodCityRegistration(String str) {
        try {
            this.codCityRegistration = str;
        } catch (IOException unused) {
        }
    }

    public void setCodDepartmentDane(String str) {
        try {
            this.codDepartmentDane = str;
        } catch (IOException unused) {
        }
    }

    public void setCodDepartmentRegistration(String str) {
        try {
            this.codDepartmentRegistration = str;
        } catch (IOException unused) {
        }
    }

    public void setDepartment(PlaceModel placeModel) {
        try {
            this.department = placeModel;
        } catch (IOException unused) {
        }
    }

    public void setExpeditionCity(String str) {
        try {
            this.expeditionCity = str;
        } catch (IOException unused) {
        }
    }

    public void setExpeditionDate(String str) {
        try {
            this.expeditionDate = str;
        } catch (IOException unused) {
        }
    }

    public void setFirstName(String str) {
        try {
            this.firstName = str;
        } catch (IOException unused) {
        }
    }

    public void setFirstName1(String str) {
        try {
            this.firstName1 = str;
        } catch (IOException unused) {
        }
    }

    public void setFirstName2(String str) {
        try {
            this.firstName2 = str;
        } catch (IOException unused) {
        }
    }

    public void setGender(String str) {
        try {
            this.gender = str;
        } catch (IOException unused) {
        }
    }

    public void setIdNumber(String str) {
        try {
            this.idNumber = str;
        } catch (IOException unused) {
        }
    }

    public void setIdType(String str) {
        try {
            this.idType = str;
        } catch (IOException unused) {
        }
    }

    public void setLastName(String str) {
        try {
            this.lastName = str;
        } catch (IOException unused) {
        }
    }

    public void setLastName1(String str) {
        try {
            this.lastName1 = str;
        } catch (IOException unused) {
        }
    }

    public void setLastName2(String str) {
        try {
            this.lastName2 = str;
        } catch (IOException unused) {
        }
    }

    public void setRhFactor(String str) {
        try {
            this.rhFactor = str;
        } catch (IOException unused) {
        }
    }
}
