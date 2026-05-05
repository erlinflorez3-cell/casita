package com.incode.welcome_sdk.listeners;

import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.results.InterviewEventResult;
import java.util.HashMap;
import kotlin.Deprecated;

/* JADX INFO: loaded from: classes5.dex */
public interface EventListener extends BaseListener {
    @Deprecated(message = "Use onEvent(event: InterviewEventResult)")
    void onEvent(Event event, HashMap<String, Object> map);

    void onEvent(InterviewEventResult interviewEventResult);
}
