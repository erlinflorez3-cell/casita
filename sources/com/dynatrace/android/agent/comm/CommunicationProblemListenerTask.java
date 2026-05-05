package com.dynatrace.android.agent.comm;

/* JADX INFO: loaded from: classes3.dex */
public class CommunicationProblemListenerTask implements Runnable {
    private CommunicationProblemListener communicationProblemListener;
    private Throwable throwable;

    public CommunicationProblemListenerTask(CommunicationProblemListener communicationProblemListener, Throwable th) {
        this.communicationProblemListener = communicationProblemListener;
        this.throwable = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th = this.throwable;
        if (!(th instanceof InvalidResponseException)) {
            this.communicationProblemListener.onError(th);
        } else {
            HttpResponse response = ((InvalidResponseException) th).getResponse();
            this.communicationProblemListener.onFailure(response.responseCode, response.responseMessage, response.body);
        }
    }
}
