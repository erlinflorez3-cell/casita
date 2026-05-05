package com.ticnow.sdk.idnowonboarding.model.config;

import com.google.gson.Gson;
import com.ticnow.sdk.idnowonboarding.model.customization.IDNowOnboardingCustomization;
import com.ticnow.sdk.idnowonboarding.model.customization.IdNowCustomization;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.request.DeviceDataRequest;
import com.ticnow.sdk.idnowsecurity.http.request.UserDataRequest;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class IDNowOnboardingConfiguration implements Serializable {
    public ArrayList<KeyValue> additionalHeaders;
    public CommonParamsRequest commonParams;
    public CommonUserDataRequest commonUserData;
    public String country;
    public IDNowOnboardingCustomization customization;
    public DeviceDataRequest deviceData;
    public String enrollType;
    public IdNowCustomization idNowCustomization;
    public Integer maxBackAttemps;
    public Integer maxFrontAttemps;
    public Integer maxSelfieAttemps;
    public String notificationId;
    public String regulaLicenseText;
    public String regulaOrientation;
    public String regulaScenarioBack;
    public String regulaScenarioFront;
    public String typeSegment;
    public UserDataRequest userData;
    public String userId;
    public String userType;
    public String uuidTransaction;
    public String zoomLicenceKey;
    public String zoomLicenceText;
    public String zoomPublicKey;
    public String zoomServerBaseURL;

    public ArrayList<KeyValue> getAdditionalHeaders() {
        return this.additionalHeaders;
    }

    public CommonParamsRequest getCommonParams() {
        return this.commonParams;
    }

    public CommonUserDataRequest getCommonUserData() {
        return this.commonUserData;
    }

    public String getCountry() {
        return this.country;
    }

    public IDNowOnboardingCustomization getCustomization() {
        return this.customization;
    }

    public DeviceDataRequest getDeviceData() {
        return this.deviceData;
    }

    public String getEnrollType() {
        return this.enrollType;
    }

    public Integer getMaxBackAttemps() {
        return this.maxBackAttemps;
    }

    public Integer getMaxFrontAttemps() {
        return this.maxFrontAttemps;
    }

    public Integer getMaxSelfieAttemps() {
        return this.maxSelfieAttemps;
    }

    public String getNotificationId() {
        return this.notificationId;
    }

    public String getTypeSegment() {
        return this.typeSegment;
    }

    public UserDataRequest getUserData() {
        return this.userData;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserType() {
        return this.userType;
    }

    public String getUuidTransaction() {
        return this.uuidTransaction;
    }

    public String getZoomLicenceKey() {
        return this.zoomLicenceKey;
    }

    public String getZoomLicenceText() {
        return this.zoomLicenceText;
    }

    public String getZoomPublicKey() {
        return this.zoomPublicKey;
    }

    public String getZoomServerBaseURL() {
        return this.zoomServerBaseURL;
    }

    public void setAdditionalHeaders(ArrayList<KeyValue> arrayList) {
        this.additionalHeaders = arrayList;
    }

    public void setCommonParams(CommonParamsRequest commonParamsRequest) {
        this.commonParams = commonParamsRequest;
    }

    public void setCommonUserData(CommonUserDataRequest commonUserDataRequest) {
        this.commonUserData = commonUserDataRequest;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCustomization(IDNowOnboardingCustomization iDNowOnboardingCustomization) {
        this.customization = iDNowOnboardingCustomization;
    }

    public void setDeviceData(DeviceDataRequest deviceDataRequest) {
        this.deviceData = deviceDataRequest;
    }

    public void setEnrollType(String str) {
        this.enrollType = str;
    }

    public void setIdNowCustomization(IdNowCustomization idNowCustomization) {
        this.idNowCustomization = idNowCustomization;
    }

    public void setMaxBackAttemps(Integer num) {
        this.maxBackAttemps = num;
    }

    public void setMaxFrontAttemps(Integer num) {
        this.maxFrontAttemps = num;
    }

    public void setMaxSelfieAttemps(Integer num) {
        this.maxSelfieAttemps = num;
    }

    public void setNotificationId(String str) {
        this.notificationId = str;
    }

    public void setTypeSegment(String str) {
        this.typeSegment = str;
    }

    public void setUserData(UserDataRequest userDataRequest) {
        this.userData = userDataRequest;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserType(String str) {
        this.userType = str;
    }

    public void setUuidTransaction(String str) {
        this.uuidTransaction = str;
    }

    public void setZoomLicenceKey(String str) {
        this.zoomLicenceKey = str;
    }

    public void setZoomLicenceText(String str) {
        this.zoomLicenceText = str;
    }

    public void setZoomPublicKey(String str) {
        this.zoomPublicKey = str;
    }

    public void setZoomServerBaseURL(String str) {
        this.zoomServerBaseURL = str;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
