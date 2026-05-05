package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.controllers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public class IDRegisterPhoneController {
    Activity activity;
    Context context;
    IDNowOnboardingConfiguration onboardingConfiguration;
    EnrollPath stepParams;

    public static class Builder {
        Activity activity;
        Context context;
        IDNowOnboardingConfiguration onboardingConfiguration;
        EnrollPath stepParams;

        public Builder(Context context, Activity activity) {
            this.activity = activity;
            this.context = context;
        }

        public IDRegisterPhoneController Build() {
            return new IDRegisterPhoneController(this);
        }

        public Builder configuration(IDNowOnboardingConfiguration iDNowOnboardingConfiguration) throws IllegalArgumentException {
            this.onboardingConfiguration = iDNowOnboardingConfiguration;
            return this;
        }

        public Builder stepParams(EnrollPath enrollPath) throws IllegalArgumentException {
            this.stepParams = enrollPath;
            return this;
        }
    }

    public IDRegisterPhoneController(Builder builder) {
        this.activity = builder.activity;
        this.context = builder.context;
        this.stepParams = builder.stepParams;
        this.onboardingConfiguration = builder.onboardingConfiguration;
    }

    public void Start() throws Exception {
        Intent intent = new Intent(this.context, (Class<?>) RegisterPhoneActivity.class);
        intent.putExtra("stepparams", this.stepParams);
        intent.putExtra("configuration", this.onboardingConfiguration);
        Activity activity = (Activity) this.context;
        CX.ud();
        activity.startActivityForResult(intent, IDStepResponseCodes.STEP_REQUEST);
    }
}
