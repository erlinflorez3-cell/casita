package com.dynatrace.android.agent.conf;

import android.content.Context;
import android.content.SharedPreferences;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.comm.RequestExecutor;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;
import com.dynatrace.android.agent.util.Utility;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class PreferencesManager {

    @Deprecated
    private static final String KEY_BEACON = "DTX_BeaconSignal";
    private static final String KEY_DATA_COLLECTION_LEVEL = "DTXDataCollectionLevel";
    private static final String KEY_NEW_VISITOR_SENT = "DTXNewVisitorSent";
    private static final String KEY_OPT_IN_CRASHES = "DTXOptInCrashes";
    private static final String KEY_REPLAY_CRASHES = "DTXCrashReplayOptedIn";
    private static final String KEY_SCREEN_RECORDING = "DTXCScreenRecordOptedIn";
    private static final String KEY_SERVER_CONFIG = "ServerConfig";
    private static final String SHARED_PREFERENCES = "com.dynatrace.android.dtxPref";
    private static final String TAG = Global.LOG_PREFIX + "PreferencesManager";
    private final ServerConfigurationManager serverConfigurationManager;
    private final SharedPreferences sharedPreferences;

    PreferencesManager(SharedPreferences sharedPreferences, ServerConfigurationManager serverConfigurationManager) {
        this.sharedPreferences = sharedPreferences;
        this.serverConfigurationManager = serverConfigurationManager;
    }

    public static PreferencesManager createPreferencesManager(Context context, ServerConfigurationManager serverConfigurationManager) {
        String strXd = ZO.xd("\u001c(u\u0018\r\u000eXM\u0007a\u000bi\u001a}\u0014F>Kzs3r.6&\u001baul", (short) (C1499aX.Xd() ^ (-18023)), (short) (C1499aX.Xd() ^ (-12804)));
        short sXd = (short) (OY.Xd() ^ 30129);
        short sXd2 = (short) (OY.Xd() ^ 23807);
        int[] iArr = new int["65\u0015\u000eI\\GG\u0003$Yd\u0007\u0019\b@*'N9Q,\u0015".length()];
        QB qb = new QB("65\u0015\u000eI\\GG\u0003$Yd\u0007\u0019\b@*'N9Q,\u0015");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {strXd, 0};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("\u007f.-q\u0018V\u0012\u000ed\"H\u0013_V\u0006T\u000b\u0014O3", (short) (C1607wl.Xd() ^ 11096)), Class.forName(Ig.wd("7\b).\"\u0003eaz\u0004)n\u001d\b\u000f\u0010", (short) (C1499aX.Xd() ^ (-531)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return new PreferencesManager((SharedPreferences) method.invoke(context, objArr), serverConfigurationManager);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private String loadPrefValue(String str, String str2) {
        try {
            return this.sharedPreferences.getString(str, str2);
        } catch (ClassCastException unused) {
            this.sharedPreferences.edit().remove(str).apply();
            return str2;
        }
    }

    private boolean loadPrefValue(String str, boolean z2) {
        try {
            return this.sharedPreferences.getBoolean(str, z2);
        } catch (ClassCastException unused) {
            this.sharedPreferences.edit().remove(str).apply();
            return z2;
        }
    }

    private ServerConfiguration prepareConfiguration(ServerConfiguration serverConfiguration, int i2, boolean z2) {
        return (serverConfiguration != null ? serverConfiguration.newBuilder() : new ServerConfiguration.Builder().withServerId(i2).withGen3Enabled(z2)).withTimestamp(0L).withCapture(1).withMultiplicity(1).withSwitchServer(false).withTrafficControlPercentage(-1).build();
    }

    private ServerConfiguration readConfiguration() {
        if (!this.sharedPreferences.contains(KEY_SERVER_CONFIG)) {
            return null;
        }
        String strLoadPrefValue = loadPrefValue(KEY_SERVER_CONFIG, (String) null);
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "stored configuration: " + strLoadPrefValue);
        }
        try {
            return this.serverConfigurationManager.fromMemory(strLoadPrefValue);
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "can't parse stored configuration", e2);
            }
            removeServerConfiguration();
            return null;
        }
    }

    @Deprecated
    public String getBeacon() {
        return loadPrefValue(KEY_BEACON, RequestExecutor.APPMON_DEFAULT_MONITOR);
    }

    public boolean getNewVisitorFlag() {
        return loadPrefValue(KEY_NEW_VISITOR_SENT, true);
    }

    public ServerConfiguration getServerConfiguration(int i2, boolean z2) {
        return prepareConfiguration(readConfiguration(), i2, z2);
    }

    public UserPrivacyOptions readPrivacySettings() {
        UserPrivacyOptions userPrivacyOptions = PrivacyRules.NO_USER_DEFINED_VALUE;
        try {
            boolean z2 = this.sharedPreferences.getBoolean(KEY_OPT_IN_CRASHES, userPrivacyOptions.isCrashReportingOptedIn());
            DataCollectionLevel dataCollectionLevelValueOf = DataCollectionLevel.valueOf(this.sharedPreferences.getString(KEY_DATA_COLLECTION_LEVEL, userPrivacyOptions.getDataCollectionLevel().name()));
            boolean z3 = this.sharedPreferences.getBoolean(KEY_REPLAY_CRASHES, userPrivacyOptions.isCrashReportingOptedIn());
            if (!z2 && z3) {
                this.sharedPreferences.edit().putBoolean(KEY_REPLAY_CRASHES, false).apply();
                if (Global.DEBUG) {
                    Utility.zlogE(TAG, "CrashReplayOptedIn cannot be true when CrashReportOptIn is false");
                }
                z3 = false;
            }
            UserPrivacyOptions.Builder builderWithCrashReportingOptedIn = new UserPrivacyOptions.Builder().withDataCollectionLevel(dataCollectionLevelValueOf).withCrashReportingOptedIn(z2);
            int i2 = this.sharedPreferences.getInt(KEY_SCREEN_RECORDING, -1);
            if (i2 != -1) {
                builderWithCrashReportingOptedIn.withScreenRecordOptedIn(Boolean.valueOf(i2 == 1));
            } else {
                builderWithCrashReportingOptedIn.withScreenRecordOptedIn(null);
                builderWithCrashReportingOptedIn.withCrashReplayOptedIn(z3);
            }
            return builderWithCrashReportingOptedIn.build();
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "could not read privacy settings", e2);
            }
            removePrivacySettings();
            return userPrivacyOptions;
        }
    }

    @Deprecated
    public void removeBeacon() {
        this.sharedPreferences.edit().remove(KEY_BEACON).apply();
    }

    public void removePrivacySettings() {
        this.sharedPreferences.edit().remove(KEY_OPT_IN_CRASHES).remove(KEY_DATA_COLLECTION_LEVEL).remove(KEY_REPLAY_CRASHES).remove(KEY_SCREEN_RECORDING).apply();
    }

    public void removeServerConfiguration() {
        this.sharedPreferences.edit().remove(KEY_SERVER_CONFIG).apply();
    }

    @Deprecated
    public void setBeacon(String str) {
        if (RequestExecutor.APPMON_DEFAULT_MONITOR.equals(str)) {
            removeBeacon();
        } else {
            this.sharedPreferences.edit().putString(KEY_BEACON, str).apply();
        }
    }

    public void setNewVisitorSent(boolean z2) {
        this.sharedPreferences.edit().putBoolean(KEY_NEW_VISITOR_SENT, z2).apply();
    }

    public void setServerConfiguration(ServerConfiguration serverConfiguration) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        try {
            editorEdit.putString(KEY_SERVER_CONFIG, this.serverConfigurationManager.generateStorableConfiguration(serverConfiguration));
        } catch (JSONException e2) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "unable to generate configuration", e2);
            }
            editorEdit.remove(KEY_SERVER_CONFIG);
        }
        editorEdit.apply();
    }

    public void storePrivacySettings(UserPrivacyOptions userPrivacyOptions) {
        SharedPreferences.Editor editorPutBoolean = this.sharedPreferences.edit().putBoolean(KEY_OPT_IN_CRASHES, userPrivacyOptions.isCrashReportingOptedIn()).putString(KEY_DATA_COLLECTION_LEVEL, userPrivacyOptions.getDataCollectionLevel().name()).putBoolean(KEY_REPLAY_CRASHES, userPrivacyOptions.isCrashReplayOptedIn());
        Boolean boolIsScreenRecordOptedIn = userPrivacyOptions.isScreenRecordOptedIn();
        if (boolIsScreenRecordOptedIn == null) {
            editorPutBoolean.putInt(KEY_SCREEN_RECORDING, -1);
        } else {
            editorPutBoolean.putInt(KEY_SCREEN_RECORDING, boolIsScreenRecordOptedIn.booleanValue() ? 1 : 0);
        }
        editorPutBoolean.apply();
    }
}
