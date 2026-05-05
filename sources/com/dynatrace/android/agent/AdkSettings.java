package com.dynatrace.android.agent;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.PreferencesManager;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.ServerConfigurationManager;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.dynatrace.android.agent.util.Utility;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class AdkSettings {
    public static final int GLOBAL_CHAR_LIMIT = 250;
    static final String ONE_AGENT_PROTOCOL_VERSION = "3";
    public static final String PLATFORM_TYPE_MOBILE = "0";
    public static final int SELF_MONITORING_PAYLOAD_CHAR_LIMIT = 1000;
    public static final String TECHNOLOGY_TYPE = "maandroid";
    private AgentStateListener agentStateListener;
    private Configuration configuration;
    private Context context;
    private volatile ServerConfiguration serverConfiguration;
    private static final String LOGTAG = Global.LOG_PREFIX + "AdkSettings";
    public static String appIdEncoded = "";
    public static String applName = "";
    public static String applIdentifier = "";
    public static volatile Map<String, String> customBeaconHeaders = null;
    private static AdkSettings theInstance = new AdkSettings();
    public AtomicBoolean newVisitorSentPending = new AtomicBoolean(false);
    public AtomicBoolean newVisitorSent = new AtomicBoolean(true);
    public int serverId = 1;
    public PreferencesManager preferencesManager = null;
    boolean hybridApp = false;

    private AdkSettings() {
        switchServerConfiguration(new ServerConfiguration.Builder().withServerId(1).build());
    }

    static String getADKName() {
        return "Dynatrace OneAgent (Android)";
    }

    public static AdkSettings getInstance() {
        return theInstance;
    }

    public AgentStateListener getAgentStateListener() {
        return this.agentStateListener;
    }

    public Configuration getConfiguration() {
        return this.configuration;
    }

    public Context getContext() {
        return this.context;
    }

    public ServerConfiguration getServerConfiguration() {
        return this.serverConfiguration;
    }

    public SessionSplitConfiguration getSessionSplitConfiguration() {
        return this.serverConfiguration.getSessionSplitConfiguration();
    }

    public void setAgentStateListener(AgentStateListener agentStateListener) {
        this.agentStateListener = agentStateListener;
    }

    public void setNewVisitorSent(boolean z2) {
        this.newVisitorSent.set(z2);
        this.preferencesManager.setNewVisitorSent(z2);
    }

    public void setup(Configuration configuration, Context context) throws Throwable {
        this.configuration = configuration;
        this.hybridApp = configuration.hybridApp;
        if (context != null) {
            Context context2 = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("[g`mmfd-eprwks|5Mxz\u007fs\u0006\u0005", (short) (Od.Xd() ^ (-18316)))).getMethod(C1561oA.Yd("54D\u0012BC@>98LBII\u001fLLSEYV", (short) (ZN.Xd() ^ 20630)), new Class[0]);
            try {
                method.setAccessible(true);
                if (context2 == ((Context) method.invoke(context, objArr))) {
                    return;
                }
                this.context = context;
                Class<?> cls = Class.forName(Xg.qd("$2)861-w.;;B4>E\u007f\u0016CCJ<PM", (short) (FB.Xd() ^ 23490), (short) (FB.Xd() ^ 16655)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (C1580rY.Xd() ^ (-17065));
                short sXd2 = (short) (C1580rY.Xd() ^ (-2931));
                int[] iArr = new int["LT5EM5\u0003H\u0018ya\u001ey]qZ$\u0014".length()];
                QB qb = new QB("LT5EM5\u0003H\u0018ya\u001ey]qZ$\u0014");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(context, objArr2);
                    Context context3 = this.context;
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(ZO.xd("\u001a\u0006K#o\u0010,:\bW\u0003\bp\bB$\u0007~r2|u\\", (short) (Od.Xd() ^ (-203)), (short) (Od.Xd() ^ (-635)))).getMethod(C1626yg.Ud("}\n( \u000bq\bV/\\^4kwoJ2", (short) (C1580rY.Xd() ^ (-31806)), (short) (C1580rY.Xd() ^ (-32630))), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        applName = Utility.truncateString(applicationInfo.loadLabel((PackageManager) method3.invoke(context3, objArr3)).toString(), 250);
                        Context context4 = this.context;
                        short sXd3 = (short) (ZN.Xd() ^ 28765);
                        int[] iArr2 = new int["-\u0003FI]\"=\u0017%\u0006~j,31M)K#\f6\u0005+".length()];
                        QB qb2 = new QB("-\u0003FI]\"=\u0017%\u0006~j,31M)K#\f6\u0005+");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                            i3++;
                        }
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(new String(iArr2, 0, i3)).getMethod(EO.Od("a7\nD0V\u0001!Y:z2\rx", (short) (C1499aX.Xd() ^ (-19641))), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            applIdentifier = Utility.truncateString((String) method4.invoke(context4, objArr4), 250);
                            PreferencesManager preferencesManagerCreatePreferencesManager = PreferencesManager.createPreferencesManager(this.context, new ServerConfigurationManager(configuration.appIdEncoded));
                            this.preferencesManager = preferencesManagerCreatePreferencesManager;
                            this.newVisitorSent.set(preferencesManagerCreatePreferencesManager.getNewVisitorFlag());
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
    }

    public void switchServerConfiguration(ServerConfiguration serverConfiguration) {
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "switching settings: " + serverConfiguration);
        }
        this.serverConfiguration = serverConfiguration;
    }
}
