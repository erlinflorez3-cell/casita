package com.ticnow.sdk.idnowonboarding.services.enrollment.enrolmentcallbacks;

import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.response.InitEnrollmentResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface InitEnrollmentRequestCallback {
    void onInitEnrollmentRequestResponse(InitEnrollmentResponse initEnrollmentResponse, IDEnrollmentResponseCodes iDEnrollmentResponseCodes);
}
