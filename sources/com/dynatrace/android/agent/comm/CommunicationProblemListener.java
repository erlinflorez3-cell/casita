package com.dynatrace.android.agent.comm;

/* JADX INFO: loaded from: classes3.dex */
public interface CommunicationProblemListener {
    void onError(Throwable th);

    void onFailure(int i2, String str, String str2);
}
