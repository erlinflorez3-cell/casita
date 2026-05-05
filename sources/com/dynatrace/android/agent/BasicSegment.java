package com.dynatrace.android.agent;

import com.dynatrace.agent.common.InstrumentationFlavor;
import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.android.agent.comm.MonitoringDataPacket;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;
import com.dynatrace.android.agent.crash.CrashCatcher;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.agent.metrics.ConnectionType;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class BasicSegment {
    private static final String CRASH_REP_LEVEL_CONFIRMED = "2";
    private static final String CRASH_REP_LEVEL_DISCONFIRMED = "1";
    private static final String CRASH_REP_LEVEL_OFF = "0";
    private static final String DEV_GENUINE = "g";
    private static final String DEV_ORIENT_L = "l";
    private static final String DEV_ORIENT_P = "p";
    private static final String DEV_ROOTED = "r";
    private static final int MAX_VERSION_NAME_LENGTH = 50;
    private static final long OCUPDT_STALE = 6000;
    private static final String TAG = Global.LOG_PREFIX + "BasicSegment";
    private final InstrumentationFlavor instrumentationFlavor;
    protected AndroidMetrics metrics = AndroidMetrics.getInstance();

    public static class UpdatableDataGenerator {
        public String generateUpdatableData(long j2, int i2, String str) {
            StringBuilder sb = new StringBuilder(SegmentConstants.B_TV);
            sb.append(j2);
            sb.append("&tx=__tsNow__&mp=");
            if (i2 < 0) {
                i2 = 1;
            }
            sb.append(i2);
            if (str != null) {
                sb.append("&sr=").append(str);
            }
            return sb.toString();
        }
    }

    protected BasicSegment(InstrumentationFlavor instrumentationFlavor) {
        this.instrumentationFlavor = instrumentationFlavor;
    }

    public static boolean addNewVisitorInfoToDataChunk(MonitoringDataPacket monitoringDataPacket) {
        Iterator<String> it = monitoringDataPacket.events.iterator();
        while (it.hasNext()) {
            if (it.next().contains("&pa=0")) {
                monitoringDataPacket.basicData += "&nu=1";
                return true;
            }
        }
        return false;
    }

    private String determineCrashReportingLevel(UserPrivacyOptions userPrivacyOptions) {
        return !CrashCatcher.registered ? "0" : userPrivacyOptions.isCrashReportingOptedIn() ? "2" : CRASH_REP_LEVEL_DISCONFIRMED;
    }

    public StringBuilder createEventData(Session session) {
        StringBuilder sb = new StringBuilder();
        ScreenMetrics screenMetrics = this.metrics.getScreenMetrics();
        sb.append("vv=3&va=");
        sb.append(Version.getFullVersion());
        sb.append("&ap=").append(AdkSettings.appIdEncoded);
        sb.append("&an=").append(Utility.urlEncode(AdkSettings.applName));
        sb.append("&ai=").append(Utility.urlEncode(AdkSettings.applIdentifier));
        AppVersion appVersion = this.metrics.getAppVersion();
        if (appVersion == null) {
            sb.append("&vb=0");
        } else {
            sb.append("&vb=").append(appVersion.getVersionCode());
            if (appVersion.getVersionName() != null) {
                sb.append("&vn=").append(Utility.urlEncode(Utility.truncateString(appVersion.getVersionName(), 50)));
            }
        }
        sb.append("&vi=").append(session.visitorId);
        sb.append("&sn=").append(session.sessionId);
        sb.append("&ss=").append(session.sequenceNumber);
        sb.append("&rm=").append(this.metrics.deviceMemorySize.intValue());
        sb.append("&cp=").append(Utility.urlEncode(this.metrics.cpuInformation));
        sb.append("&os=").append(Utility.urlEncode(this.metrics.operatingSystem));
        sb.append("&mf=").append(Utility.urlEncode(Utility.truncateString(this.metrics.manufacturer != null ? this.metrics.manufacturer : "unknown", 250)));
        sb.append("&md=").append(Utility.urlEncode(this.metrics.modelId));
        sb.append("&rj=").append(this.metrics.deviceRooted ? DEV_ROOTED : DEV_GENUINE);
        sb.append("&ul=").append(this.metrics.userLang);
        if (screenMetrics != null) {
            if (screenMetrics.getScreenWidth() > screenMetrics.getScreenHeight()) {
                sb.append("&sw=").append(screenMetrics.getScreenHeight());
                sb.append("&sh=").append(screenMetrics.getScreenWidth());
            } else {
                sb.append("&sw=").append(screenMetrics.getScreenWidth());
                sb.append("&sh=").append(screenMetrics.getScreenHeight());
            }
            sb.append("&sd=").append(screenMetrics.getScreenDensityDpi());
        }
        sb.append("&pt=0");
        String str = this.metrics.deviceOrientation == 2 ? DEV_ORIENT_L : this.metrics.deviceOrientation == 1 ? "p" : null;
        if (str != null) {
            sb.append("&so=").append(str);
        }
        if (this.metrics.batteryLevel >= 0) {
            sb.append("&bl=").append(this.metrics.batteryLevel);
        }
        if (this.metrics.deviceMemoryFree != null) {
            sb.append("&fm=").append(this.metrics.deviceMemoryFree.intValue());
        }
        if (this.metrics.deviceCarrier != null) {
            sb.append("&cr=").append(Utility.urlEncode(this.metrics.deviceCarrier));
        }
        if (this.metrics.connectionType != ConnectionType.OTHER) {
            sb.append("&ct=").append(this.metrics.connectionType.getProtocolValue());
            if (this.metrics.networkProtocol != null && this.metrics.networkProtocol.length() > 0) {
                sb.append("&np=").append(Utility.urlEncode(this.metrics.networkProtocol));
            }
        }
        PrivacyRules privacyRules = session.getPrivacyRules();
        if (this.metrics.mockDeviceLocation != null && privacyRules.allowLocationReporting()) {
            sb.append("&lx=").append(Utility.urlEncode(String.format(Locale.US, "%3.3fx%3.3f", Double.valueOf(this.metrics.mockDeviceLocation.getLatitude()), Double.valueOf(this.metrics.mockDeviceLocation.getLongitude()))));
        }
        sb.append("&tt=maandroid&dl=");
        sb.append(privacyRules.getPrivacySettings().getDataCollectionLevel().ordinal());
        sb.append("&cl=").append(determineCrashReportingLevel(privacyRules.getPrivacySettings()));
        sb.append("&fv=").append(this.instrumentationFlavor.getProtocolValue());
        return sb;
    }

    public void update(boolean z2) {
        if (z2) {
            this.metrics.updateBasicMetrics();
        }
        if (this.metrics.getCommonMetricsAge() <= 6000) {
            return;
        }
        this.metrics.updateCommonMetrics();
    }
}
