package com.dynatrace.android.agent.communication;

import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.android.agent.conf.ServerConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public interface ServerConfigurationListener {
    void onAgentStateChanged(AgentState state);

    void onServerConfigurationChanged(ServerConfiguration configurationV3);
}
