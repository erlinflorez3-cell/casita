package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Processor {

    public interface SessionTokenErrorCallback {
        void onError();
    }

    public abstract boolean isSuccess();
}
