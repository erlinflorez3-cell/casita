package com.dynatrace.android.agent.conf;

import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import com.dynatrace.android.agent.conf.ReplayConfiguration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import java.text.ParseException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface ServerConfigurationParser {
    ServerConfiguration fromJSON(ServerConfiguration oldConfiguration, String json) throws JSONException, InvalidConfigurationException, ClassCastException;

    ServerConfiguration fromMap(Map<String, String> keyValueString, AgentMode agentMode);

    void parseAppConfigV3(ServerConfiguration.Builder serverConfigBuilder, ReplayConfiguration.Builder replayConfigBuilder, JSONObject appConfigJson) throws JSONException, ParseException;

    void parseDynamicConfigV3(ServerConfiguration.Builder serverConfigBuilder, JSONObject dynamicConfigJson) throws JSONException, ParseException;

    void parseMobileAgentConfigV3(ServerConfiguration.Builder serverConfigBuilder, ReplayConfiguration.Builder replayConfigBuilder, JSONObject agentJsonObject) throws JSONException;
}
