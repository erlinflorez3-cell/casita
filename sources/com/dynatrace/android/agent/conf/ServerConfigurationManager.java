package com.dynatrace.android.agent.conf;

import androidx.compose.ui.layout.LayoutKt;
import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import com.dynatrace.android.agent.conf.RageTapConfiguration;
import com.dynatrace.android.agent.conf.ReplayConfiguration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.text.ParseException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes3.dex */
public class ServerConfigurationManager implements ServerConfigurationParser {
    private static final ServerConfiguration CONFIG_AGENT_ERROR = new ServerConfiguration.Builder().withCaptureOff().withStatus(ServerConfiguration.Status.ERROR).build();
    private static final ServerConfiguration CONFIG_INIT_MEMORY = new ServerConfiguration.Builder().withTimestamp(-1).build();
    private static final String KEY_APPLICATION_ID = "applicationId";
    private static final String KEY_APP_CONFIG = "appConfig";
    private static final String KEY_CAPTURE = "capture";
    private static final String KEY_COLOR_MASKING_ENABLED = "colorMasking";
    private static final String KEY_COMPOSE_ENABLED = "composeEnabled";
    private static final String KEY_DISPERSION_RADIUS = "dispersionRadius";
    private static final String KEY_DYNAMIC_CONFIG = "dynamicConfig";
    private static final String KEY_GEN3_ENABLED = "gen3Enabled";
    private static final String KEY_MAX_BEACON_SIZE_KB = "maxBeaconSizeKb";
    private static final String KEY_MAX_CACHED_CRASHES = "maxCachedCrashesCount";
    private static final String KEY_MAX_SESSION_DURATION_MINS = "maxSessionDurationMins";
    private static final String KEY_MINIMUM_NUMBER_OF_TAPS = "minimumNumberOfTaps";
    private static final String KEY_MOBILE_AGENT_CONFIG = "mobileAgentConfig";
    private static final String KEY_MULTIPLICITY = "multiplicity";
    private static final String KEY_PIXEL_COPY_ENABLED = "pixelCopy";
    private static final String KEY_RAGE_TAP_CONFIG = "rageTapConfig";
    private static final String KEY_REPLAY_CAPTURE = "capture";
    private static final String KEY_REPLAY_CONFIG = "replayConfig";
    private static final String KEY_REPLAY_CRASHES_ENABLED = "crashesEnabled";
    private static final String KEY_REPLAY_PROTOCOL_VERSION = "protocolVersion";
    private static final String KEY_REPLAY_RETENTION_TIME = "imageRetentionTimeInMinutes";
    private static final String KEY_REPLAY_SELFMONITORING = "selfmonitoring";
    private static final String KEY_REPLAY_TRAFFIC_CONTROL_PERCENTAGE = "trafficControlPercentage";
    private static final String KEY_SELFMONITORING = "selfmonitoring";
    private static final String KEY_SEND_INTERVAL_SEC = "sendIntervalSec";
    private static final String KEY_SERVERID = "serverId";
    private static final String KEY_SESSION_TIMEOUT_SEC = "sessionTimeoutSec";
    private static final String KEY_STATUS = "status";
    private static final String KEY_SWITCH_SERVER = "switchServer";
    private static final String KEY_TAP_DURATION = "tapDuration";
    private static final String KEY_TIMESPAN_DIFFERENCE = "timespanDifference";
    private static final String KEY_TIMESTAMP = "timestamp";
    private static final String KEY_TRAFFIC_CONTROL_PERCENTAGE = "trafficControlPercentage";
    private final String appIdEncoded;

    public ServerConfigurationManager(String appIdEncoded) {
        this.appIdEncoded = appIdEncoded;
    }

    private int fitOrClosest(JSONObject jsonObject, String name, int lowerBorder, int higherBorder, int defaultValue) {
        if (jsonObject.has(name)) {
            try {
                return Math.max(Math.min(jsonObject.getInt(name), higherBorder), lowerBorder);
            } catch (JSONException unused) {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "parsing v3 config: expected JSON property \"" + name + "\" to be an Integer, but it was not");
            }
        }
        return defaultValue;
    }

    private int fitOrDefault(JSONObject jsonObject, String name, int lowerBorder, int higherBorder, int defaultValue) {
        return fitOrDefault(jsonObject, name, lowerBorder, higherBorder, defaultValue, defaultValue);
    }

    private int fitOrDefault(JSONObject jsonObject, String name, int lowerBorder, int higherBorder, int defaultMinValue, int defaultMaxValue) {
        if (jsonObject.has(name)) {
            try {
                int i2 = jsonObject.getInt(name);
                return i2 < lowerBorder ? defaultMinValue : i2 > higherBorder ? defaultMaxValue : i2;
            } catch (JSONException unused) {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "parsing v3 config: expected JSON property \"" + name + "\" to be an Integer, but it was not");
            }
        }
        return defaultMinValue;
    }

    private JSONObject generateAppConfiguration(ServerConfiguration serverConfig) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_REPLAY_CONFIG, generateReplayConfigurationApp(serverConfig));
        jSONObject.put(KEY_GEN3_ENABLED, serverConfig.isGen3Enabled());
        return jSONObject;
    }

    private JSONObject generateDynamicConfiguration(ServerConfiguration serverConfig) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_SERVERID, serverConfig.getServerId());
        return jSONObject;
    }

    private JSONObject generateMobileAgentConfiguration(ServerConfiguration serverConfig) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_MAX_BEACON_SIZE_KB, serverConfig.getMaxBeaconSizeKb());
        jSONObject.put("selfmonitoring", serverConfig.isSelfmonitoring());
        SessionSplitConfiguration sessionSplitConfiguration = serverConfig.getSessionSplitConfiguration();
        jSONObject.put(KEY_MAX_SESSION_DURATION_MINS, sessionSplitConfiguration.getMaxSessionDurationMinutes());
        jSONObject.put(KEY_SESSION_TIMEOUT_SEC, sessionSplitConfiguration.getInactivityTimeoutSeconds());
        jSONObject.put(KEY_SEND_INTERVAL_SEC, serverConfig.getSendIntervalSec());
        jSONObject.put(KEY_MAX_CACHED_CRASHES, serverConfig.getMaxCachedCrashesCount());
        jSONObject.put(KEY_RAGE_TAP_CONFIG, generateRageTapConfiguration(serverConfig));
        jSONObject.put(KEY_REPLAY_CONFIG, generateReplayConfigurationMobileAgent(serverConfig));
        return jSONObject;
    }

    private JSONObject generateRageTapConfiguration(ServerConfiguration serverConfig) throws JSONException {
        RageTapConfiguration rageTapConfiguration = serverConfig.getRageTapConfiguration();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_TAP_DURATION, rageTapConfiguration.getTapDuration());
        jSONObject.put(KEY_DISPERSION_RADIUS, rageTapConfiguration.getDispersionRadius());
        jSONObject.put(KEY_TIMESPAN_DIFFERENCE, rageTapConfiguration.getTimespanDifference());
        jSONObject.put(KEY_MINIMUM_NUMBER_OF_TAPS, rageTapConfiguration.getMinimumNumberOfTaps());
        return jSONObject;
    }

    private JSONObject generateReplayConfigurationApp(ServerConfiguration serverConfig) throws JSONException {
        ReplayConfiguration replayConfiguration = serverConfig.getReplayConfiguration();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("capture", replayConfiguration.isCaptureOn());
        jSONObject.put(KEY_REPLAY_RETENTION_TIME, replayConfiguration.getRetentionTimeInMinutes());
        if (replayConfiguration.getFullSessionConfigReceived()) {
            jSONObject.put("trafficControlPercentage", replayConfiguration.getTrafficControlPercentage());
            jSONObject.put(KEY_REPLAY_CRASHES_ENABLED, replayConfiguration.getCrashesEnabled());
        }
        return jSONObject;
    }

    private JSONObject generateReplayConfigurationMobileAgent(ServerConfiguration serverConfig) throws JSONException {
        ReplayConfiguration replayConfiguration = serverConfig.getReplayConfiguration();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_REPLAY_PROTOCOL_VERSION, replayConfiguration.getProtocolVersion());
        jSONObject.put(KEY_PIXEL_COPY_ENABLED, replayConfiguration.isPixelCopyEnabled());
        jSONObject.put(KEY_COLOR_MASKING_ENABLED, replayConfiguration.isColorMaskingEnabled());
        jSONObject.put(KEY_COMPOSE_ENABLED, replayConfiguration.isComposeEnabled());
        return jSONObject;
    }

    private boolean tryBooleanOrDefault(JSONObject jsonObject, String name, boolean defaultValue) {
        try {
            return jsonObject.getBoolean(name);
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "parsing v3 config: expected JSON property \"" + name + "\" to be a Boolean, but it was not");
            return defaultValue;
        }
    }

    @Override // com.dynatrace.android.agent.conf.ServerConfigurationParser
    public ServerConfiguration fromJSON(ServerConfiguration oldServerConfig, String json) throws JSONException, InvalidConfigurationException, ClassCastException {
        ServerConfiguration.Builder builderNewBuilder;
        JSONObject jSONObject = (JSONObject) new JSONTokener(json).nextValue();
        if (!jSONObject.has(KEY_DYNAMIC_CONFIG)) {
            throw new InvalidConfigurationException("The configuration is missing the dynamicConfig block");
        }
        if (jSONObject.has("timestamp") && jSONObject.has(KEY_APP_CONFIG) && jSONObject.has(KEY_MOBILE_AGENT_CONFIG)) {
            builderNewBuilder = ServerConfiguration.builder();
            try {
                long j2 = jSONObject.getLong("timestamp");
                if (j2 <= oldServerConfig.getTimestamp()) {
                    return oldServerConfig;
                }
                builderNewBuilder.withTimestamp(j2);
                ReplayConfiguration.Builder builder = ReplayConfiguration.builder();
                parseMobileAgentConfigV3(builderNewBuilder, builder, jSONObject.getJSONObject(KEY_MOBILE_AGENT_CONFIG));
                try {
                    parseAppConfigV3(builderNewBuilder, builder, jSONObject.getJSONObject(KEY_APP_CONFIG));
                    builderNewBuilder.withReplayConfiguration(builder.build());
                } catch (ParseException unused) {
                    return CONFIG_AGENT_ERROR;
                }
            } catch (JSONException unused2) {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "parsing v3 config: timestamp must be of type long");
                return CONFIG_AGENT_ERROR;
            }
        } else {
            builderNewBuilder = oldServerConfig.newBuilder(true);
        }
        try {
            parseDynamicConfigV3(builderNewBuilder, jSONObject.getJSONObject(KEY_DYNAMIC_CONFIG));
            return builderNewBuilder.build();
        } catch (ParseException unused3) {
            return CONFIG_AGENT_ERROR;
        }
    }

    @Override // com.dynatrace.android.agent.conf.ServerConfigurationParser
    public ServerConfiguration fromMap(Map<String, String> keyValueConfig, AgentMode agentMode) {
        ServerConfiguration.Builder builder = new ServerConfiguration.Builder();
        builder.withCapture(Utility.parseInt(keyValueConfig, "cp", 0, 1, 1, true));
        builder.withSendIntervalSec(Utility.parseInt(keyValueConfig, "si", 60, 540, 120));
        builder.withServerId(Utility.parseInt(keyValueConfig, "id", 0, Integer.MAX_VALUE, 1));
        builder.withMaxBeaconSizeKb(Utility.parseInt(keyValueConfig, "bl", 1, Integer.MAX_VALUE, agentMode == AgentMode.APP_MON ? 30 : 150));
        builder.withSessionSplitConfiguration(SessionSplitConfiguration.builder().withInactivityTimeout(Utility.parseInt(keyValueConfig, "st", 0, Integer.MAX_VALUE, 600)).build());
        builder.withTrafficControlPercentage(Utility.parseInt(keyValueConfig, "tc", 1, 100, 100, true));
        builder.withMultiplicity(Utility.parseInt(keyValueConfig, "mp", 0, Integer.MAX_VALUE, 1, true));
        builder.withSelfmonitoring(Utility.parseInt(keyValueConfig, "sm", 0, 1, 1, true) == 1);
        return builder.build();
    }

    public ServerConfiguration fromMemory(String json) throws JSONException, InvalidConfigurationException {
        ServerConfiguration serverConfigurationFromJSON = fromJSON(CONFIG_INIT_MEMORY, json);
        if (serverConfigurationFromJSON.getStatus() == ServerConfiguration.Status.OK) {
            return serverConfigurationFromJSON;
        }
        throw new InvalidConfigurationException("unexpected status code: " + serverConfigurationFromJSON.getStatus());
    }

    public String generateStorableConfiguration(ServerConfiguration serverConfig) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_MOBILE_AGENT_CONFIG, generateMobileAgentConfiguration(serverConfig));
        jSONObject.put(KEY_APP_CONFIG, generateAppConfiguration(serverConfig));
        jSONObject.put(KEY_DYNAMIC_CONFIG, generateDynamicConfiguration(serverConfig));
        jSONObject.put("timestamp", 0L);
        return jSONObject.toString();
    }

    @Override // com.dynatrace.android.agent.conf.ServerConfigurationParser
    public void parseAppConfigV3(ServerConfiguration.Builder serverConfigBuilder, ReplayConfiguration.Builder replayConfigBuilder, JSONObject appConfigJson) throws JSONException, ParseException {
        if (appConfigJson.has(KEY_APPLICATION_ID)) {
            if (!this.appIdEncoded.equals(appConfigJson.getString(KEY_APPLICATION_ID))) {
                throw new ParseException("No application id", 0);
            }
        }
        if (appConfigJson.has("capture")) {
            serverConfigBuilder.withCapture(fitOrDefault(appConfigJson, "capture", 0, 1, 1));
        }
        if (appConfigJson.has("trafficControlPercentage")) {
            serverConfigBuilder.withTrafficControlPercentage(fitOrDefault(appConfigJson, "trafficControlPercentage", 1, 100, 100));
        }
        if (appConfigJson.has(KEY_GEN3_ENABLED)) {
            serverConfigBuilder.withGen3Enabled(tryBooleanOrDefault(appConfigJson, KEY_GEN3_ENABLED, false));
        }
        if (appConfigJson.has(KEY_REPLAY_CONFIG)) {
            JSONObject jSONObject = appConfigJson.getJSONObject(KEY_REPLAY_CONFIG);
            if (jSONObject.has("capture")) {
                replayConfigBuilder.withCapture(tryBooleanOrDefault(jSONObject, "capture", false));
            }
            if (jSONObject.has(KEY_REPLAY_CRASHES_ENABLED)) {
                replayConfigBuilder.withCrashesEnabled(tryBooleanOrDefault(jSONObject, KEY_REPLAY_CRASHES_ENABLED, false));
                replayConfigBuilder.withFullSessionConfigReceived(true);
            }
            if (jSONObject.has("trafficControlPercentage")) {
                replayConfigBuilder.withTrafficControlPercentage(fitOrDefault(jSONObject, "trafficControlPercentage", 0, 100, 0, 100));
            }
            if (jSONObject.has(KEY_REPLAY_RETENTION_TIME)) {
                replayConfigBuilder.withRetentionTimeInMinutes(fitOrClosest(jSONObject, KEY_REPLAY_RETENTION_TIME, 0, Integer.MAX_VALUE, 0));
            }
        }
    }

    @Override // com.dynatrace.android.agent.conf.ServerConfigurationParser
    public void parseDynamicConfigV3(ServerConfiguration.Builder configuration, JSONObject dynamicConfigJson) throws JSONException, ParseException {
        if (dynamicConfigJson.has("status") && dynamicConfigJson.getString("status").compareToIgnoreCase("ERROR") == 0) {
            throw new ParseException("Error status detected", 0);
        }
        configuration.withStatus(ServerConfiguration.Status.OK);
        if (dynamicConfigJson.has(KEY_MULTIPLICITY)) {
            configuration.withMultiplicity(fitOrDefault(dynamicConfigJson, KEY_MULTIPLICITY, 0, Integer.MAX_VALUE, 1));
        }
        if (dynamicConfigJson.has(KEY_SERVERID)) {
            configuration.withServerId(fitOrDefault(dynamicConfigJson, KEY_SERVERID, 0, Integer.MAX_VALUE, 1));
        }
        if (dynamicConfigJson.has(KEY_SWITCH_SERVER)) {
            configuration.withSwitchServer(tryBooleanOrDefault(dynamicConfigJson, KEY_SWITCH_SERVER, false));
        }
    }

    @Override // com.dynatrace.android.agent.conf.ServerConfigurationParser
    public void parseMobileAgentConfigV3(ServerConfiguration.Builder serverConfigBuilder, ReplayConfiguration.Builder replayConfigBuilder, JSONObject agentJsonObject) throws JSONException {
        if (agentJsonObject.has(KEY_MAX_BEACON_SIZE_KB)) {
            serverConfigBuilder.withMaxBeaconSizeKb(fitOrClosest(agentJsonObject, KEY_MAX_BEACON_SIZE_KB, 10, Integer.MAX_VALUE, 150));
        }
        if (agentJsonObject.has("selfmonitoring")) {
            serverConfigBuilder.withSelfmonitoring(tryBooleanOrDefault(agentJsonObject, "selfmonitoring", true));
        }
        serverConfigBuilder.withSessionSplitConfiguration(parseSessionSplitConfiguration(agentJsonObject));
        if (agentJsonObject.has(KEY_SEND_INTERVAL_SEC)) {
            serverConfigBuilder.withSendIntervalSec(fitOrClosest(agentJsonObject, KEY_SEND_INTERVAL_SEC, 10, 120, 120));
        }
        if (agentJsonObject.has(KEY_MAX_CACHED_CRASHES)) {
            serverConfigBuilder.withMaxCachedCrashesCount(fitOrClosest(agentJsonObject, KEY_MAX_CACHED_CRASHES, 0, 100, 0));
        }
        if (agentJsonObject.has(KEY_RAGE_TAP_CONFIG)) {
            serverConfigBuilder.withRageTapConfiguration(parseRageTapConfiguration(agentJsonObject.getJSONObject(KEY_RAGE_TAP_CONFIG)));
        }
        if (agentJsonObject.has(KEY_REPLAY_CONFIG)) {
            JSONObject jSONObject = agentJsonObject.getJSONObject(KEY_REPLAY_CONFIG);
            if (jSONObject.has(KEY_REPLAY_PROTOCOL_VERSION)) {
                replayConfigBuilder.withProtocolVersion(fitOrClosest(jSONObject, KEY_REPLAY_PROTOCOL_VERSION, 1, LayoutKt.LargeDimension, 1));
            }
            if (jSONObject.has("selfmonitoring")) {
                replayConfigBuilder.withSelfMonitoring(fitOrClosest(jSONObject, "selfmonitoring", 0, Integer.MAX_VALUE, 0));
            }
            if (jSONObject.has(KEY_PIXEL_COPY_ENABLED)) {
                replayConfigBuilder.withPixelCopyEnabled(tryBooleanOrDefault(jSONObject, KEY_PIXEL_COPY_ENABLED, false));
            }
            if (jSONObject.has(KEY_COLOR_MASKING_ENABLED)) {
                replayConfigBuilder.withColorMaskingEnabled(tryBooleanOrDefault(jSONObject, KEY_COLOR_MASKING_ENABLED, false));
            }
            if (jSONObject.has(KEY_COMPOSE_ENABLED)) {
                replayConfigBuilder.withComposeEnabled(tryBooleanOrDefault(jSONObject, KEY_COMPOSE_ENABLED, true));
            }
        }
    }

    RageTapConfiguration parseRageTapConfiguration(JSONObject rageTapConfigObject) {
        RageTapConfiguration.Builder builder = RageTapConfiguration.builder();
        if (rageTapConfigObject.has(KEY_TAP_DURATION)) {
            builder.withTapDuration(fitOrClosest(rageTapConfigObject, KEY_TAP_DURATION, 0, Integer.MAX_VALUE, 100));
        }
        if (rageTapConfigObject.has(KEY_DISPERSION_RADIUS)) {
            builder.withDispersionRadius(fitOrClosest(rageTapConfigObject, KEY_DISPERSION_RADIUS, 0, Integer.MAX_VALUE, 100));
        }
        if (rageTapConfigObject.has(KEY_TIMESPAN_DIFFERENCE)) {
            builder.withTimespanDifference(fitOrClosest(rageTapConfigObject, KEY_TIMESPAN_DIFFERENCE, 0, Integer.MAX_VALUE, 300));
        }
        if (rageTapConfigObject.has(KEY_MINIMUM_NUMBER_OF_TAPS)) {
            builder.withMinimumNumberOfTaps(fitOrClosest(rageTapConfigObject, KEY_MINIMUM_NUMBER_OF_TAPS, 3, Integer.MAX_VALUE, 3));
        }
        return builder.build();
    }

    SessionSplitConfiguration parseSessionSplitConfiguration(JSONObject mobileAgentConfigJson) {
        SessionSplitConfiguration.Builder builder = SessionSplitConfiguration.builder();
        if (mobileAgentConfigJson.has(KEY_MAX_SESSION_DURATION_MINS)) {
            builder.withMaxSessionDuration(fitOrClosest(mobileAgentConfigJson, KEY_MAX_SESSION_DURATION_MINS, 10, Integer.MAX_VALUE, SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS));
        }
        if (mobileAgentConfigJson.has(KEY_SESSION_TIMEOUT_SEC)) {
            builder.withInactivityTimeout(fitOrClosest(mobileAgentConfigJson, KEY_SESSION_TIMEOUT_SEC, 30, Integer.MAX_VALUE, 600));
        }
        return builder.build();
    }
}
