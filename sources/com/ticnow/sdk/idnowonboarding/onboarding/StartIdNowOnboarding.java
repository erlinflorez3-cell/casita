package com.ticnow.sdk.idnowonboarding.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowsecurity.http.paths.IDEndPoints;
import com.ticnow.sdk.idnowsecurity.http.paths.IDEnpointBuilder;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public class StartIdNowOnboarding {
    Activity activity;
    IDNowOnboardingConfiguration config;
    Context context;

    public static class Builder {
        Activity activity;
        IDNowOnboardingConfiguration config;
        Context context;

        public Builder(Context context, Activity activity) {
            this.activity = activity;
            this.context = context;
        }

        public StartIdNowOnboarding Build() {
            return new StartIdNowOnboarding(this);
        }

        public Builder config(IDNowOnboardingConfiguration iDNowOnboardingConfiguration) throws IllegalArgumentException {
            if (iDNowOnboardingConfiguration == null) {
                throw new IllegalArgumentException("Configuración no existente");
            }
            this.config = iDNowOnboardingConfiguration;
            return this;
        }
    }

    public StartIdNowOnboarding(Builder builder) {
        this.activity = builder.activity;
        this.context = builder.context;
        this.config = builder.config;
    }

    public void Start() throws Exception {
        IDEndPoints.getCurrentInstance().setInitEnrollment(this.context, this.activity, new IDEnpointBuilder("api", 6, "mobile-hub", "enrollment", "cipher/initEnrollment").buildEndPoint());
        IDEndPoints.getCurrentInstance().setGetRegisterPath(this.context, this.activity, new IDEnpointBuilder("api", 6, "mobile-hub", "enrollment", "cipher/getRegisterPath").buildEndPoint());
        IDEndPoints.getCurrentInstance().setFinishEnrollment(this.context, this.activity, new IDEnpointBuilder("api", 6, "mobile-hub", "enrollment", "cipher/finishEnrollment").buildEndPoint());
        IDEndPoints.getCurrentInstance().setUpdateNotificationId(this.context, this.activity, new IDEnpointBuilder("api", 3, "mobile-hub", "enrollment", "updateNotificationId").buildEndPoint());
        IDEndPoints.getCurrentInstance().setFindUserByCredentials(this.context, this.activity, new IDEnpointBuilder("api", 3, "mobile-hub", "authentication", "findUserByCredentials").buildEndPoint());
        IDEndPoints.getCurrentInstance().setGetDeviceStatus(this.context, this.activity, new IDEnpointBuilder("api", 3, "mobile-hub", "authentication", "getDeviceStatus").buildEndPoint());
        IDEndPoints.getCurrentInstance().setAuthorizeTransaction(this.context, this.activity, new IDEnpointBuilder("api", 3, "mobile-hub", "authentication", "authorizeTransaction").buildEndPoint());
        IDEndPoints.getCurrentInstance().setAnalizeDni(this.context, this.activity, new IDEnpointBuilder("api", 6, "mobile-hub", "enrollment", "").buildEndPoint());
        IDEndPoints.getCurrentInstance().setAnalizePassport(this.context, this.activity, new IDEnpointBuilder("api", 2, "mobile-hub", "enrollment", "analizePassport").buildEndPoint());
        IDEndPoints.getCurrentInstance().setMatchFaceZoom(this.context, this.activity, new IDEnpointBuilder("api", 6, "mobile-hub", "enrollment", "").buildEndPoint());
        IDEndPoints.getCurrentInstance().setMatchEnrollFaceZoom(this.context, this.activity, new IDEnpointBuilder("api", 3, "mobile-hub", "enrollment", "").buildEndPoint());
        IDEndPoints.getCurrentInstance().setCompareSignature(this.context, this.activity, new IDEnpointBuilder("api", 3, "mobile-hub", "enrollment", "compareSignature").buildEndPoint());
        IDEndPoints.getCurrentInstance().setCommitGenericStep(this.context, this.activity, new IDEnpointBuilder("api", 2, "mobile-hub", "enrollment", "commitGenericStep").buildEndPoint());
        IDEndPoints.getCurrentInstance().setCommitGenericStepImage(this.context, this.activity, new IDEnpointBuilder("api", 2, "mobile-hub", "enrollment", "commitGenericStepImage").buildEndPoint());
        IDEndPoints.getCurrentInstance().setOmmitEnrollStep(this.context, this.activity, new IDEnpointBuilder("api", 3, "mobile-hub", "enrollment", "ommitEnrollStep").buildEndPoint());
        IDEndPoints.getCurrentInstance().setUpdateEnrollmentReintentNews(this.context, this.activity, new IDEnpointBuilder("api", 6, "mobile-hub", "enrollment", "cipher/updateEnrollmentReintenNews").buildEndPoint());
        IDEndPoints.getCurrentInstance().setGetEnrollmentReintentNews(this.context, this.activity, new IDEnpointBuilder("api", 3, "mobile-hub", "enrollment", "getEnrollmentReintenNews").buildEndPoint());
        Intent intent = new Intent(this.context, (Class<?>) ProcessOnboardingActivity.class);
        intent.putExtra("configuration", this.config);
        Activity activity = (Activity) this.context;
        CX.ud();
        activity.startActivityForResult(intent, 998);
    }
}
