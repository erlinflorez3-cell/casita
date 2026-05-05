package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.results.FaceLoginResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ResponseFaceLoginKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9147c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9148d = 0;

    public static final FaceLoginResult toFaceLoginResult(ResponseFaceLogin responseFaceLogin) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(responseFaceLogin, "");
        FaceLoginResult faceLoginResult = new FaceLoginResult(responseFaceLogin.faceMatch, responseFaceLogin.customerId, responseFaceLogin.interviewId, responseFaceLogin.interviewToken, responseFaceLogin.token, responseFaceLogin.transactionId);
        int i3 = f9148d + 23;
        f9147c = i3 % 128;
        int i4 = i3 % 2;
        return faceLoginResult;
    }
}
