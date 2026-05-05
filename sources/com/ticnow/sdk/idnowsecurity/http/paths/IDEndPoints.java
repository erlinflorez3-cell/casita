package com.ticnow.sdk.idnowsecurity.http.paths;

import android.app.Activity;
import android.content.Context;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDBaseUrl;

/* JADX INFO: loaded from: classes5.dex */
public class IDEndPoints {
    private static IDEndPoints endpoints = null;
    private String analizeDni;
    private String analizePassport;
    private String authorizeTransaction;
    private String commitGenericStep;
    private String commitGenericStepImage;
    private String compareSignature;
    private String findUserByCredentials;
    private String finishEnrollment;
    private String getDeviceStatus;
    private String getEnrollmentReintentNews;
    private String getRegisterPath;
    private String initEnrollment;
    private String matchEnrollFaceZoom;
    private String matchFaceZoom;
    private String ommitEnrollStep;
    private String updateEnrollmentReintentNews;
    private String updateNotificationId;

    public static IDEndPoints getCurrentInstance() {
        if (endpoints == null) {
            endpoints = new IDEndPoints();
        }
        return endpoints;
    }

    public String getAnalizeDni() {
        return this.analizeDni;
    }

    public String getAnalizePassport() {
        return this.analizePassport;
    }

    public String getAuthorizeTransaction() {
        return this.authorizeTransaction;
    }

    public String getCommitGenericStep() {
        return this.commitGenericStep;
    }

    public String getCommitGenericStepImage() {
        return this.commitGenericStepImage;
    }

    public String getCompareSignature() {
        return this.compareSignature;
    }

    public String getFindUserByCredentials() {
        return this.findUserByCredentials;
    }

    public String getFinishEnrollment() {
        return this.finishEnrollment;
    }

    public String getGetDeviceStatus() {
        return this.getDeviceStatus;
    }

    public String getGetEnrollmentReintenNews() {
        return this.getEnrollmentReintentNews;
    }

    public String getGetRegisterPath() {
        return this.getRegisterPath;
    }

    public String getInitEnrollment() {
        return this.initEnrollment;
    }

    public String getMatchEnrollFaceZoom() {
        return this.matchEnrollFaceZoom;
    }

    public String getMatchFaceZoom() {
        return this.matchFaceZoom;
    }

    public String getOmmitEnrollStep() {
        return this.ommitEnrollStep;
    }

    public String getUpdateEnrollmentReintentNews() {
        return this.updateEnrollmentReintentNews;
    }

    public String getUpdateNotificationId() {
        return this.updateNotificationId;
    }

    public void setAnalizeDni(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.analizeDni = idNowHost.getBaseIDUrl() + str;
        } else {
            this.analizeDni = "HOST IS NULL ";
        }
    }

    public void setAnalizePassport(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.analizePassport = idNowHost.getBaseIDUrl() + str;
        } else {
            this.analizePassport = "HOST IS NULL ";
        }
    }

    public void setAuthorizeTransaction(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.authorizeTransaction = idNowHost.getBaseIDUrl() + str;
        } else {
            this.authorizeTransaction = "HOST IS NULL ";
        }
    }

    public void setCommitGenericStep(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.commitGenericStep = idNowHost.getBaseIDUrl() + str;
        } else {
            this.commitGenericStep = "HOST IS NULL ";
        }
    }

    public void setCommitGenericStepImage(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.commitGenericStepImage = idNowHost.getBaseIDUrl() + str;
        } else {
            this.commitGenericStepImage = "HOST IS NULL ";
        }
    }

    public void setCompareSignature(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.compareSignature = idNowHost.getBaseIDUrl() + str;
        } else {
            this.compareSignature = "HOST IS NULL ";
        }
    }

    public void setFindUserByCredentials(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.findUserByCredentials = idNowHost.getBaseIDUrl() + str;
        } else {
            this.findUserByCredentials = "HOST IS NULL ";
        }
    }

    public void setFinishEnrollment(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.finishEnrollment = idNowHost.getBaseIDUrl() + str;
        } else {
            this.finishEnrollment = "HOST IS NULL ";
        }
    }

    public void setGetDeviceStatus(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.getDeviceStatus = idNowHost.getBaseIDUrl() + str;
        } else {
            this.getDeviceStatus = "HOST IS NULL ";
        }
    }

    public void setGetEnrollmentReintentNews(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.getEnrollmentReintentNews = idNowHost.getBaseIDUrl() + str;
        } else {
            this.getEnrollmentReintentNews = "HOST IS NULL ";
        }
    }

    public void setGetRegisterPath(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.getRegisterPath = idNowHost.getBaseIDUrl() + str;
        } else {
            this.getRegisterPath = "HOST IS NULL ";
        }
    }

    public void setInitEnrollment(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.initEnrollment = idNowHost.getBaseIDUrl() + str;
        } else {
            this.initEnrollment = "HOST IS NULL ";
        }
    }

    public void setMatchEnrollFaceZoom(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.matchEnrollFaceZoom = idNowHost.getBaseIDUrl() + str;
        } else {
            this.matchEnrollFaceZoom = "HOST IS NULL ";
        }
    }

    public void setMatchFaceZoom(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.matchFaceZoom = idNowHost.getBaseIDUrl() + str;
        } else {
            this.matchFaceZoom = "HOST IS NULL ";
        }
    }

    public void setOmmitEnrollStep(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.ommitEnrollStep = idNowHost.getBaseIDUrl() + str;
        } else {
            this.ommitEnrollStep = "HOST IS NULL ";
        }
    }

    public void setUpdateEnrollmentReintentNews(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.updateEnrollmentReintentNews = idNowHost.getBaseIDUrl() + str;
        } else {
            this.updateEnrollmentReintentNews = "HOST IS NULL ";
        }
    }

    public void setUpdateNotificationId(Context context, Activity activity, String str) {
        IDBaseUrl idNowHost = new IDSecurityApiImpl().getIdNowHost(context, activity);
        if (idNowHost != null) {
            this.updateNotificationId = idNowHost.getBaseIDUrl() + str;
        } else {
            this.updateNotificationId = "HOST IS NULL ";
        }
    }
}
