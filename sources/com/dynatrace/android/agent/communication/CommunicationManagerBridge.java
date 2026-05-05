package com.dynatrace.android.agent.communication;

import com.dynatrace.android.agent.conf.ServerConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public interface CommunicationManagerBridge {
    void updateConfigurationInOneAgent(ServerConfiguration serverConfigurationV3);

    void updateServerId(int serverId);
}
