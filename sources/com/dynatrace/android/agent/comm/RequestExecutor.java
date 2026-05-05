package com.dynatrace.android.agent.comm;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.Version;
import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.ServerConfigurationParser;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class RequestExecutor {
    public static final String APPMON_DEFAULT_MONITOR = "dynaTraceMonitor";
    private static final int BEACON_MAX_ATTEMPTS = 3;
    private static final String TAG = Global.LOG_PREFIX + "RequestExecutor";
    private CommHandler commHandler;
    private Configuration configuration;
    private AtomicInteger failedBeaconAttempts = new AtomicInteger(0);
    private String monitor;
    private String serverUrl;
    private ServerConfigurationParser settingsParser;

    public RequestExecutor(CommHandler commHandler, Configuration configuration, ServerConfigurationParser serverConfigurationParser) {
        this.configuration = configuration;
        this.commHandler = commHandler;
        this.settingsParser = serverConfigurationParser;
        if (configuration.mode == AgentMode.SAAS) {
            this.serverUrl = configuration.getServerUrl();
        } else {
            this.monitor = AdkSettings.getInstance().preferencesManager.getBeacon();
            this.serverUrl = configuration.getServerUrl() + RemoteSettings.FORWARD_SLASH_STRING + this.monitor;
        }
    }

    private ServerConfiguration handleBeaconRequest(ServerConfiguration serverConfiguration, boolean z2, String str, int i2, long j2, int i3, boolean z3) throws Exception {
        HttpResponse httpResponseExecuteRequest = this.commHandler.executeRequest(getUriParms(serverConfiguration, z2, i2, j2, i3), str, z3);
        if (httpResponseExecuteRequest.isSuccessful()) {
            return processConfigResponse(serverConfiguration, httpResponseExecuteRequest);
        }
        if (httpResponseExecuteRequest.responseCode == 404) {
            handleInvalidBeacon();
        }
        throw new InvalidResponseException("invalid response code " + httpResponseExecuteRequest.responseCode, httpResponseExecuteRequest);
    }

    private void handleInvalidBeacon() {
        if (this.configuration.mode != AgentMode.APP_MON || APPMON_DEFAULT_MONITOR.equals(this.monitor)) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("Resetting beacon signal (%s) to (%s)", this.monitor, APPMON_DEFAULT_MONITOR));
        }
        this.monitor = APPMON_DEFAULT_MONITOR;
        AdkSettings.getInstance().preferencesManager.removeBeacon();
        this.failedBeaconAttempts.incrementAndGet();
    }

    private void setMonitor(String str) {
        if (str == null || str.length() <= 0 || this.failedBeaconAttempts.get() > 3) {
            str = APPMON_DEFAULT_MONITOR;
        } else if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("Setting dtMonitor: %s attempt: %s ", str, Integer.valueOf(this.failedBeaconAttempts.get())));
        }
        if (str.equals(this.monitor)) {
            return;
        }
        this.monitor = str;
        this.serverUrl = this.configuration.getServerUrl() + RemoteSettings.FORWARD_SLASH_STRING + this.monitor;
        AdkSettings.getInstance().preferencesManager.setBeacon(this.monitor);
    }

    String getUriParms(ServerConfiguration serverConfiguration, boolean z2, int i2, long j2, int i3) {
        StringBuilder sb = new StringBuilder(this.serverUrl);
        sb.append("?type=m&srvid=");
        sb.append(i2);
        sb.append("&app=");
        sb.append(AdkSettings.appIdEncoded);
        sb.append("&va=");
        sb.append(Utility.urlEncode(Version.getFullVersion()));
        sb.append("&tt=maandroid&pt=0");
        if (this.configuration.mode == AgentMode.SAAS) {
            sb.append("&resp=json&cts=");
            sb.append(serverConfiguration.getTimestamp());
        }
        if (z2) {
            sb.append("&ns=1");
        }
        sb.append("&si=").append(j2).append(Global.UNDERSCORE).append(i3);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.dynatrace.android.agent.conf.ServerConfiguration] */
    ServerConfiguration processConfigResponse(ServerConfiguration serverConfiguration, HttpResponse httpResponse) throws InvalidResponseException {
        if (httpResponse == null || httpResponse.body == null) {
            throw new InvalidResponseException("no message body", httpResponse);
        }
        String strFromJSON = "invalid message protocol";
        if (httpResponse.body.startsWith("{")) {
            if (this.configuration.mode == AgentMode.APP_MON) {
                throw new InvalidResponseException("invalid configuration format", httpResponse);
            }
            try {
                strFromJSON = this.settingsParser.fromJSON(serverConfiguration, httpResponse.body);
                return strFromJSON;
            } catch (InvalidConfigurationException | ClassCastException | JSONException e2) {
                throw new InvalidResponseException(strFromJSON, e2, httpResponse);
            }
        }
        Map<String, String> keyValueString = Utility.parseKeyValueString(httpResponse.body);
        if (keyValueString == null || !"m".equals(keyValueString.get("type"))) {
            throw new InvalidResponseException("invalid message protocol", httpResponse);
        }
        ServerConfiguration serverConfigurationFromMap = this.settingsParser.fromMap(keyValueString, this.configuration.mode);
        if (this.configuration.mode != AgentMode.APP_MON) {
            return serverConfigurationFromMap;
        }
        setMonitor(keyValueString.get("bn"));
        return serverConfigurationFromMap;
    }

    public void resetBeaconRetries() {
        this.failedBeaconAttempts.set(0);
    }

    public ServerConfiguration sendBeacon(ServerConfiguration serverConfiguration, boolean z2, int i2, Session session) throws Exception {
        return handleBeaconRequest(serverConfiguration, z2, null, i2, session.visitorId, session.sessionId, false);
    }

    public ServerConfiguration sendData(ServerConfiguration serverConfiguration, String str, int i2, long j2, int i3, boolean z2) throws Exception {
        return handleBeaconRequest(serverConfiguration, false, str, i2, j2, i3, z2);
    }
}
