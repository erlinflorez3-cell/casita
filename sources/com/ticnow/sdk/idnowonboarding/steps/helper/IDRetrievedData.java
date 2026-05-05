package com.ticnow.sdk.idnowonboarding.steps.helper;

/* JADX INFO: loaded from: classes5.dex */
public class IDRetrievedData {
    private static IDRetrievedData retrievedData = null;
    private String dniBack;
    private String dniFront;
    String documentCancelColor;
    String documentDetectedColor;
    String documentNonDetectedColor;
    Integer dueIntents;
    private String errorDesc;
    private Boolean errorExc;
    private String faceMap;
    Boolean isGeneric;
    private String jsonBody;
    private String jsonBodyDni;
    Integer maxIntents;
    private String selfie;
    private String sessionId;
    String zoomBackgroundLoadingColor;
    String zoomLoaderColor;

    public static IDRetrievedData getCurrentRetrievedData() {
        if (retrievedData == null) {
            retrievedData = new IDRetrievedData();
        }
        return retrievedData;
    }

    public String getDniBack() {
        return this.dniBack;
    }

    public String getDniFront() {
        return this.dniFront;
    }

    public String getDocumentCancelColor() {
        String str = this.documentCancelColor;
        return str == null ? "#87bdb0" : str;
    }

    public String getDocumentDetectedColor() {
        String str = this.documentDetectedColor;
        return str == null ? "#87bdb0" : str;
    }

    public String getDocumentNonDetectedColor() {
        String str = this.documentNonDetectedColor;
        return str == null ? "#ff0000" : str;
    }

    public Integer getDueIntents() {
        return this.dueIntents;
    }

    public String getErrorDesc() {
        return this.errorDesc;
    }

    public Boolean getErrorExc() {
        return this.errorExc;
    }

    public String getFaceMap() {
        return this.faceMap;
    }

    public Boolean getIsGeneric() {
        Boolean bool = this.isGeneric;
        if (bool == null) {
            return false;
        }
        return bool;
    }

    public String getJsonBody() {
        return this.jsonBody;
    }

    public String getJsonBodyDni() {
        return this.jsonBodyDni;
    }

    public Integer getMaxIntents() {
        return this.maxIntents;
    }

    public String getSelfie() {
        return this.selfie;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getZoomBackgroundLoadingColor() {
        String str = this.zoomBackgroundLoadingColor;
        return str == null ? "#87bdb0" : str;
    }

    public String getZoomLoaderColor() {
        String str = this.zoomLoaderColor;
        return str == null ? "#ffffff" : str;
    }

    public void setDniBack(String str) {
        this.dniBack = str;
    }

    public void setDniFront(String str) {
        this.dniFront = str;
    }

    public void setDocumentCancelColor(String str) {
        this.documentCancelColor = str;
    }

    public void setDocumentDetectedColor(String str) {
        this.documentDetectedColor = str;
    }

    public void setDocumentNonDetectedColor(String str) {
        this.documentNonDetectedColor = str;
    }

    public void setDueIntents(Integer num) {
        this.dueIntents = num;
    }

    public void setErrorDesc(String str) {
        this.errorDesc = str;
    }

    public void setErrorExc(Boolean bool) {
        this.errorExc = bool;
    }

    public void setFaceMap(String str) {
        this.faceMap = str;
    }

    public void setIsGeneric(Boolean bool) {
        this.isGeneric = bool;
    }

    public void setJsonBody(String str) {
        this.jsonBody = str;
    }

    public void setJsonBodyDni(String str) {
        this.jsonBodyDni = str;
    }

    public void setMaxIntents(Integer num) {
        this.maxIntents = num;
    }

    public void setSelfie(String str) {
        this.selfie = str;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setZoomBackgroundLoadingColor(String str) {
        this.zoomBackgroundLoadingColor = str;
    }

    public void setZoomLoaderColor(String str) {
        this.zoomLoaderColor = str;
    }
}
