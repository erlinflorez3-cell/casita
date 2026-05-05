package com.ticnow.sdk.idnowonboarding.services.enrollment.enrolmentcallbacks;

import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.response.FinishEnrollmentResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface FinishEnrollmentRequestCallback {
    void onFinishEnrollmentRequestResponse(FinishEnrollmentResponse finishEnrollmentResponse, IDEnrollmentResponseCodes iDEnrollmentResponseCodes);
}
