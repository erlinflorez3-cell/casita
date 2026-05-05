package com.incode.welcome_sdk.listeners;

import com.incode.welcome_sdk.data.remote.beans.Workflow;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface FetchWorkflowListener {
    void onError(Throwable th);

    void onWorkflowsFetched(List<Workflow> list);
}
