package com.dynatrace.android.agent.conf;

import com.dynatrace.agent.OneAgentConfiguration;
import com.dynatrace.agent.common.InstrumentationFlavor;
import com.dynatrace.android.agent.SessionReplayComponentProvider;
import com.dynatrace.android.agent.UserActionModifier;
import com.dynatrace.android.agent.Version;
import com.dynatrace.android.agent.comm.CommunicationProblemListener;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.KeyManager;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Call;

/* JADX INFO: loaded from: classes3.dex */
public class Configuration {
    public final boolean activityMonitoring;
    public final boolean anrReporting;
    public final String appIdEncoded;
    public final String applicationId;
    public final boolean applicationMonitoring;
    public final boolean autoStart;
    public final UserActionModifier autoUserActionModifier;
    public final String beaconUrl;
    public final boolean certificateValidation;
    public final CommunicationProblemListener communicationProblemListener;
    public final boolean crashReporting;
    public final boolean debugLogLevel;
    public final int eventThrottlingLimit;
    public final boolean fileDomainCookies;
    public final int graceTime;
    public final Call.Factory httpFactory;
    public final boolean hybridApp;
    public final InstrumentationFlavor instrumentationFlavor;
    public final boolean isRageTapDetectionEnabled;
    public final KeyManager[] keyManagers;
    public final KeyStore keyStore;
    public final AgentMode mode;
    public final String[] monitoredDomains;
    public final String[] monitoredHttpsDomains;
    public final boolean namePrivacy;
    public final boolean nativeCrashReporting;
    public final boolean sendEmptyAction;
    public final SessionReplayComponentProvider sessionReplayComponentProvider;
    public final boolean startupLoadBalancing;
    public final boolean startupWithGrailEnabled;
    public final boolean userOptIn;
    public final int waitTime;
    public final boolean webRequestTiming;

    Configuration(String str, String str2, String str3, AgentMode agentMode, boolean z2, KeyStore keyStore, KeyManager[] keyManagerArr, int i2, int i3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String[] strArr, String[] strArr2, boolean z11, boolean z12, boolean z13, boolean z14, CommunicationProblemListener communicationProblemListener, boolean z15, boolean z16, boolean z17, InstrumentationFlavor instrumentationFlavor, SessionReplayComponentProvider sessionReplayComponentProvider, boolean z18, UserActionModifier userActionModifier, Call.Factory factory, int i4) {
        this.applicationId = str;
        this.appIdEncoded = str2;
        this.beaconUrl = str3;
        this.mode = agentMode;
        this.certificateValidation = z2;
        this.keyStore = keyStore;
        this.keyManagers = keyManagerArr;
        this.graceTime = i2;
        this.waitTime = i3;
        this.sendEmptyAction = z3;
        this.namePrivacy = z4;
        this.applicationMonitoring = z5;
        this.activityMonitoring = z6;
        this.crashReporting = z7;
        this.nativeCrashReporting = z8;
        this.anrReporting = z9;
        this.webRequestTiming = z10;
        this.monitoredDomains = strArr;
        this.monitoredHttpsDomains = strArr2;
        this.hybridApp = z11;
        this.fileDomainCookies = z12;
        this.debugLogLevel = z13;
        this.autoStart = z14;
        this.communicationProblemListener = communicationProblemListener;
        this.userOptIn = z15;
        this.startupLoadBalancing = z16;
        this.startupWithGrailEnabled = z17;
        this.instrumentationFlavor = instrumentationFlavor;
        this.sessionReplayComponentProvider = sessionReplayComponentProvider;
        this.isRageTapDetectionEnabled = z18;
        this.autoUserActionModifier = userActionModifier;
        this.httpFactory = factory;
        this.eventThrottlingLimit = i4;
    }

    private static String objectToString(Object obj) {
        return obj == null ? "null" : obj.getClass().getName() + "@" + System.identityHashCode(obj);
    }

    public String getServerUrl() {
        return this.beaconUrl;
    }

    public OneAgentConfiguration toOneAgentConfiguration() {
        return new OneAgentConfiguration(Version.getFullVersion(), this.applicationId, this.beaconUrl, this.applicationMonitoring, this.activityMonitoring, this.nativeCrashReporting, this.anrReporting, this.eventThrottlingLimit, this.instrumentationFlavor);
    }

    public String toString() {
        return "Configuration{applicationId='" + this.applicationId + "', appIdEncoded='" + this.appIdEncoded + "', beaconUrl='" + this.beaconUrl + "', mode=" + this.mode + ", certificateValidation=" + this.certificateValidation + ", keyStore=" + this.keyStore + ", keyManagers=" + Arrays.toString(this.keyManagers) + ", graceTime=" + this.graceTime + ", waitTime=" + this.waitTime + ", sendEmptyAction=" + this.sendEmptyAction + ", namePrivacy=" + this.namePrivacy + ", applicationMonitoring=" + this.applicationMonitoring + ", activityMonitoring=" + this.activityMonitoring + ", crashReporting=" + this.crashReporting + ", nativeCrashReporting=" + this.nativeCrashReporting + ", anrReporting=" + this.anrReporting + ", webRequestTiming=" + this.webRequestTiming + ", monitoredDomains=" + Arrays.toString(this.monitoredDomains) + ", monitoredHttpsDomains=" + Arrays.toString(this.monitoredHttpsDomains) + ", hybridApp=" + this.hybridApp + ", fileDomainCookies=" + this.fileDomainCookies + ", debugLogLevel=" + this.debugLogLevel + ", autoStart=" + this.autoStart + ", communicationProblemListener=" + objectToString(this.communicationProblemListener) + ", userOptIn=" + this.userOptIn + ", startupLoadBalancing=" + this.startupLoadBalancing + ", startupWithGrailEnabled=" + this.startupWithGrailEnabled + ", instrumentationFlavor=" + this.instrumentationFlavor + ", sessionReplayComponentProvider=" + this.sessionReplayComponentProvider + ", isRageTapDetectionEnabled=" + this.isRageTapDetectionEnabled + ", autoUserActionModifier=" + objectToString(this.autoUserActionModifier) + ", httpFactory=" + objectToString(this.httpFactory) + ", eventThrottlingLimit=" + this.eventThrottlingLimit + AbstractJsonLexerKt.END_OBJ;
    }
}
