package com.ticnow.sdk.idnowonboarding.services.enrollment.enrolmentcallbacks;

import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.response.RegisterPathResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface GetRegisterPathRequestCallBack {
    void onGetRegisterPathRequestResponse(RegisterPathResponse registerPathResponse, IDEnrollmentResponseCodes iDEnrollmentResponseCodes);
}
