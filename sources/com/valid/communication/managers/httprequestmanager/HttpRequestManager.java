package com.valid.communication.managers.httprequestmanager;

import android.content.Context;
import com.valid.communication.events.BaseErrorEvent;
import com.valid.communication.events.BaseSuccessEvent;
import com.valid.communication.managers.communicationmanager.CommunicationManagerCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface HttpRequestManager {

    public class NullPointerException extends RuntimeException {
    }

    void cancelRequests();

    void consumeWebService(int i2, String str, Map<String, String> map, Map<String, Object> map2);

    void execute();

    void publishEvent(BaseSuccessEvent baseSuccessEvent, BaseErrorEvent baseErrorEvent);

    void setBaseURL(String str);

    void setCallback(CommunicationManagerCallback communicationManagerCallback);

    void setContext(Context context);

    void setTimeOut(int i2);
}
