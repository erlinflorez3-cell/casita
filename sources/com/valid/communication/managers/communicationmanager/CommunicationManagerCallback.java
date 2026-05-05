package com.valid.communication.managers.communicationmanager;

import com.valid.communication.events.BaseErrorEvent;
import com.valid.communication.events.BaseSuccessEvent;

/* JADX INFO: loaded from: classes5.dex */
public interface CommunicationManagerCallback {

    public class ParseException extends RuntimeException {
    }

    void errorEvent(BaseErrorEvent baseErrorEvent);

    void successEvent(BaseSuccessEvent baseSuccessEvent);
}
