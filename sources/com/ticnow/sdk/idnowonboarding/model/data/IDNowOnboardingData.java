package com.ticnow.sdk.idnowonboarding.model.data;

import com.google.gson.Gson;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class IDNowOnboardingData implements Serializable {
    public IDNowOnboardingConfiguration configuration;
    public EnrollPath enrollDefinition;
    public String uuidTransaction;

    public IDNowOnboardingConfiguration getConfiguration() {
        return this.configuration;
    }

    public EnrollPath getEnrollDefinition() {
        return this.enrollDefinition;
    }

    public String getUuidTransaction() {
        return this.uuidTransaction;
    }

    public void setConfiguration(IDNowOnboardingConfiguration iDNowOnboardingConfiguration) {
        this.configuration = iDNowOnboardingConfiguration;
    }

    public void setEnrollDefinition(EnrollPath enrollPath) {
        this.enrollDefinition = enrollPath;
    }

    public void setUuidTransaction(String str) {
        this.uuidTransaction = str;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
