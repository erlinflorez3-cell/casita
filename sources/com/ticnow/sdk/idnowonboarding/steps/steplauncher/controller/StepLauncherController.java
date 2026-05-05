package com.ticnow.sdk.idnowonboarding.steps.steplauncher.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.model.step.IDStepKind;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public class StepLauncherController {
    Activity activity;
    Context context;
    IDNowOnboardingConfiguration onboardingConfiguration;
    IDStepKind stepKind;
    EnrollPath stepParams;

    public static class Builder {
        Activity activity;
        Context context;
        IDNowOnboardingConfiguration onboardingConfiguration;
        IDStepKind stepKind;
        EnrollPath stepParams;

        public Builder(Context context, Activity activity) {
            this.activity = activity;
            this.context = context;
        }

        public StepLauncherController Build() {
            return new StepLauncherController(this);
        }

        public Builder configuration(IDNowOnboardingConfiguration iDNowOnboardingConfiguration) throws IllegalArgumentException {
            this.onboardingConfiguration = iDNowOnboardingConfiguration;
            return this;
        }

        public Builder stepKind(IDStepKind iDStepKind) throws IllegalArgumentException {
            this.stepKind = iDStepKind;
            return this;
        }

        public Builder stepParams(EnrollPath enrollPath) throws IllegalArgumentException {
            this.stepParams = enrollPath;
            return this;
        }
    }

    public StepLauncherController(Builder builder) {
        this.activity = builder.activity;
        this.context = builder.context;
        this.stepParams = builder.stepParams;
        this.stepKind = builder.stepKind;
        this.onboardingConfiguration = builder.onboardingConfiguration;
    }

    public void Start() throws Exception {
        Intent intent = new Intent(this.context, (Class<?>) StepLauncherActivity.class);
        intent.putExtra("stepparams", this.stepParams);
        intent.putExtra("stepkind", this.stepKind);
        intent.putExtra("configuration", this.onboardingConfiguration);
        Activity activity = (Activity) this.context;
        CX.ud();
        activity.startActivityForResult(intent, IDStepResponseCodes.STEP_LAUNCH_REQUEST);
    }
}
