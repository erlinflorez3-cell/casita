package com.dynatrace.android.callback;

import android.app.Application;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.AgentUtil;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.WebReqTag;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.ConfigurationPreset;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge;
import com.dynatrace.android.agent.mixed.WebRequestTraceContext;
import com.dynatrace.android.agent.mixed.WebRequestTraceContextCallback;
import com.dynatrace.android.agent.mixed.WebRequestTraceContextInizializer;
import com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import com.dynatrace.android.internal.api.ProcessAnalyzer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
final class CallbackCore {
    private static final String INITIATE = "Initiate ";
    private static final String TOUCH_ON = "Touch on ";
    private static final String LOGTAG = Global.LOG_PREFIX + "CallbackCore";
    static AtomicBoolean isInitialized = new AtomicBoolean(false);
    static Configuration configuration = ConfigurationPreset.generateImproperConfiguration();
    static boolean captureTestData = false;
    private static WeakHashMap<HttpURLConnection, CbWebReqTracker> httpConns = new WeakHashMap<>();
    private static volatile DTXAutoAction currentAutoAction = null;
    private static volatile ListenerActionType currentActionType = null;

    private static class ConnRegistration extends Thread {
        private static HashSet<Integer> requests = new HashSet<>();
        private HttpURLConnection conn;

        private ConnRegistration(HttpURLConnection httpURLConnection) {
            this.conn = httpURLConnection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CbWebReqTracker register() {
            CbWebReqTracker cbWebReqTracker;
            WeakHashMap weakHashMap;
            CbWebReqTracker cbWebReqTrackerRegisterConn = null;
            try {
                cbWebReqTracker = (CbWebReqTracker) CallbackCore.httpConns.get(this.conn);
            } catch (Exception e2) {
                if (Global.DEBUG) {
                    Utility.zlogD(CallbackCore.LOGTAG, "can't access tracking state", e2);
                }
            }
            if (cbWebReqTracker != null) {
                return cbWebReqTracker;
            }
            String strFetchWebReqTag = WebReqTag.fetchWebReqTag(this.conn, Dynatrace.getRequestTagHeader());
            if (strFetchWebReqTag != null) {
                synchronized (CallbackCore.httpConns) {
                    weakHashMap = new WeakHashMap(CallbackCore.httpConns);
                }
                for (Map.Entry entry : weakHashMap.entrySet()) {
                    if (((CbWebReqTracker) entry.getValue()).webReqTag.sameAs(strFetchWebReqTag)) {
                        if (Global.DEBUG) {
                            Utility.zlogD(CallbackCore.LOGTAG, "replace tracking for tag " + strFetchWebReqTag);
                        }
                        CallbackCore.httpConns.remove(entry.getKey());
                        CallbackCore.httpConns.put(this.conn, (CbWebReqTracker) entry.getValue());
                        return (CbWebReqTracker) entry.getValue();
                    }
                }
                return null;
            }
            if (requests.contains(Integer.valueOf(this.conn.hashCode()))) {
                return null;
            }
            requests.add(Integer.valueOf(this.conn.hashCode()));
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 > 3) {
                    break;
                }
                try {
                    cbWebReqTrackerRegisterConn = CallbackCore.registerConn(this.conn);
                    break;
                } catch (Exception unused) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused2) {
                    }
                    i2 = i3;
                }
            }
            requests.remove(Integer.valueOf(this.conn.hashCode()));
            return cbWebReqTrackerRegisterConn;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            register();
        }
    }

    enum ListenerActionType {
        Clicked,
        ItemClicked,
        ItemSelected,
        MenuItemClick,
        OptionsItemSelected,
        PageSelected,
        SwipeToRefresh
    }

    private CallbackCore() {
    }

    static CbWebReqTracker addConnection(HttpURLConnection httpURLConnection, boolean z2) {
        if (httpURLConnection != null && Dynatrace.getCaptureStatus() && Session.currentSession().getPrivacyRules().shouldCollectEvent(EventType.WEB_REQUEST)) {
            ConnRegistration connRegistration = new ConnRegistration(httpURLConnection);
            if (z2) {
                return connRegistration.register();
            }
            try {
                httpURLConnection.getURL().toString();
                return connRegistration.register();
            } catch (Exception unused) {
                connRegistration.start();
            }
        }
        return null;
    }

    static String defaultUserAgent() {
        String property = System.getProperty("http.agent");
        return property != null ? property : "Java/" + System.getProperty("java.version");
    }

    private static WebReqTag generateWebReqTag(DTXAutoAction dTXAutoAction, HttpURLConnection httpURLConnection) {
        WebReqTag webReqTagInternalTagRequest;
        return (dTXAutoAction == null || (webReqTagInternalTagRequest = AgentUtil.internalTagRequest(dTXAutoAction, httpURLConnection)) == null) ? AgentUtil.getRequestTag() : webReqTagInternalTagRequest;
    }

    private static String getMenuDesc(MenuItem menuItem) {
        if (configuration.namePrivacy) {
            return TOUCH_ON + menuItem.getClass().getSimpleName();
        }
        CharSequence title = menuItem.getTitle();
        return (title == null || title.length() <= 0) ? TOUCH_ON + menuItem.getClass().getSimpleName() : TOUCH_ON + ((Object) title);
    }

    private static String getViewDesc(View view) {
        if (configuration.namePrivacy) {
            return TOUCH_ON + view.getClass().getSimpleName();
        }
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null && contentDescription.length() > 0) {
            return TOUCH_ON + ((Object) contentDescription);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int inputType = textView.getInputType();
            if (TextViewHelper.isPasswordInputType(inputType) || TextViewHelper.isVisiblePasswordInputType(inputType)) {
                return "Touch on ****";
            }
            CharSequence text = textView.getText();
            if (text != null && text.length() > 0) {
                return TOUCH_ON + ((Object) text);
            }
        }
        return TOUCH_ON + view.getClass().getSimpleName();
    }

    static void init(Context context, Configuration configuration2) {
        OneAgentLifecycleManagerBridge oneAgentLifecycleManagerBridge;
        if (context == null) {
            return;
        }
        short sXd = (short) (C1607wl.Xd() ^ 25353);
        int[] iArr = new int["+90?50,v%229#-4n\u001dJJQ;OL".length()];
        QB qb = new QB("+90?50,v%229#-4n\u001dJJQ;OL");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("\u0017\u0014\"m\u001c\u001b\u0016\u0012\u000b\b\u001a\u000e\u0013\u0011d\u0010\u000e\u0013\u0003\u0015\u0010", (short) (Od.Xd() ^ (-32358)), (short) (Od.Xd() ^ (-8249))), new Class[0]);
        try {
            method.setAccessible(true);
            Application application = (Application) ((Context) method.invoke(context, objArr));
            if (isInitialized.getAndSet(true)) {
                return;
            }
            if (AdkSettings.getInstance().getConfiguration() != null) {
                configuration2 = AdkSettings.getInstance().getConfiguration();
            } else if (configuration2 == null) {
                return;
            }
            if (configuration2.debugLogLevel) {
                Global.DEBUG = true;
            }
            configuration = configuration2;
            if (!configuration2.autoStart && Global.DEBUG) {
                Utility.zlogD(LOGTAG, hg.Vd("a\u0004{\u0001twn(wxtthtuidq7\u001c", (short) (C1633zX.Xd() ^ (-25164)), (short) (C1633zX.Xd() ^ (-16425))) + configuration);
            }
            if (Utility.isIsolatedProcess()) {
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, C1561oA.ud("\u0010940$6&$^1\".1#\u001c\u001dV\u001a\u001a(\u0018\u0015%\u0015\u0013[Lx\u001a\u0018\u0012\u001c\u0016\u0018\u000e\u0012\nA\u0005\u0005\u007f\u0001\u0011\u0005\u0011z\r|z5z\u0003\u00051\u0005ww\u0001,{|xklyx", (short) (C1580rY.Xd() ^ (-23174))));
                    return;
                }
                return;
            }
            if (!ProcessAnalyzer.isMainProcess(application)) {
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, C1561oA.yd("\u0010#\u001e+'\u001e\u0018*.U#& \u0015\u0014# M\u000f\u0011\u001d\u000f\n\u001c\n\nPCm\u0011\r\t\u0011\r\r\u0005\u0007\u00016{yvu\by\bo\u0004qq*qw{&{lnu#psmbbqn", (short) (OY.Xd() ^ 30422)));
                    return;
                }
                return;
            }
            if (configuration.autoStart) {
                Dynatrace.startup(application, configuration);
            }
            if (AdkSettings.getInstance().getContext() == null) {
                try {
                    AdkSettings.getInstance().setup(configuration, application);
                } catch (Exception e2) {
                    if (Global.DEBUG) {
                        Utility.zlogD(LOGTAG, C1561oA.Yd("\u000e\b{}\t\u0003>\u0014\u0010A\u0016\u0018\u0006\u0018\u001bG\n\u0011\u0010\u001a!YN #!\u0015 \u001a#V!'Y.!12(.(5b7*:<8", (short) (ZN.Xd() ^ 11052)), e2);
                        return;
                    }
                    return;
                }
            }
            if (AdkSettings.getInstance().getServerConfiguration().isGen3Enabled() && (oneAgentLifecycleManagerBridge = Core.getOneAgentLifecycleManagerBridge()) != null) {
                oneAgentLifecycleManagerBridge.onAppStart();
            }
            if (configuration.applicationMonitoring) {
                Core.getApplicationStartMonitor().onApplicationStart(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static void onUserActionEnter(ListenerActionType listenerActionType) {
        onUserActionEnter(listenerActionType, INITIATE + listenerActionType.toString());
    }

    static void onUserActionEnter(ListenerActionType listenerActionType, MenuItem menuItem) {
        if (menuItem == null) {
            onUserActionEnter(listenerActionType);
        } else {
            onUserActionEnter(listenerActionType, getMenuDesc(menuItem));
        }
    }

    static void onUserActionEnter(ListenerActionType listenerActionType, View view) {
        if (view == null) {
            onUserActionEnter(listenerActionType);
            return;
        }
        onUserActionEnter(listenerActionType, getViewDesc(view));
        OneAgentUserInteractionManagerBridge oneAgentUserInteractionManagerBridge = Core.getOneAgentUserInteractionManagerBridge();
        if (oneAgentUserInteractionManagerBridge != null) {
            oneAgentUserInteractionManagerBridge.onViewClick(view);
        }
    }

    static void onUserActionEnter(ListenerActionType listenerActionType, String str) {
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: %s entry=true actionName=%s", listenerActionType, str));
        }
        if (currentAutoAction != null && currentActionType != listenerActionType) {
            currentAutoAction.startTimer(0);
            currentAutoAction = null;
            currentActionType = null;
        }
        if (currentAutoAction == null && Global.isAlive.get()) {
            currentAutoAction = DTXAutoAction.createAutoAction(str, Session.determineActiveSession(false), AdkSettings.getInstance().serverId);
            currentActionType = listenerActionType;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: %s entry=true", listenerActionType));
        }
    }

    static void onUserActionExit(ListenerActionType listenerActionType) {
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "onUA: " + listenerActionType + " entry=false");
        }
        if (currentAutoAction == null || currentActionType != listenerActionType) {
            return;
        }
        currentAutoAction.startTimer();
        currentAutoAction = null;
        currentActionType = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CbWebReqTracker registerConn(final HttpURLConnection httpURLConnection) {
        DTXAutoAction autoAction;
        WebReqTag webReqTagGenerateWebReqTag;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("Add WR %s to %s", httpURLConnection.getClass().getSimpleName(), httpURLConnection.getURL().toString()));
        }
        if (!isInitialized.get()) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "OneAgent not correctly initialized");
            }
            return null;
        }
        if (!configuration.webRequestTiming || (webReqTagGenerateWebReqTag = generateWebReqTag((autoAction = DTXAutoAction.getAutoAction()), httpURLConnection)) == null) {
            return null;
        }
        CbWebReqTracker cbWebReqTracker = new CbWebReqTracker(autoAction, webReqTagGenerateWebReqTag.getSession());
        if (webReqTagGenerateWebReqTag.getSession().isGrailEventsShouldBeCaptured()) {
            try {
                WebRequestTraceContext webRequestTraceContextInitialize = WebRequestTraceContextInizializer.initialize(httpURLConnection.getRequestProperty("traceparent"), new WebRequestTraceContextCallback() { // from class: com.dynatrace.android.callback.CallbackCore$$ExternalSyntheticLambda0
                    @Override // com.dynatrace.android.agent.mixed.WebRequestTraceContextCallback
                    public final void invoke(String str) {
                        httpURLConnection.setRequestProperty("traceparent", str);
                    }
                });
                cbWebReqTracker.setTraceContext(webRequestTraceContextInitialize);
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "traceId: " + webRequestTraceContextInitialize.getTraceId() + " spanId: " + webRequestTraceContextInitialize.getSpanId() + " hint: " + webRequestTraceContextInitialize.getHint());
            } catch (Exception e2) {
                if (Global.DEBUG) {
                    Utility.zlogE(LOGTAG, e2.toString());
                }
            }
        }
        synchronized (httpConns) {
            httpConns.put(httpURLConnection, cbWebReqTracker);
        }
        cbWebReqTracker.setWebReqTag(webReqTagGenerateWebReqTag);
        return cbWebReqTracker;
    }

    public static void setWebReqTag(HttpURLConnection httpURLConnection) {
        CbWebReqTracker cbWebReqTracker = httpConns.get(httpURLConnection);
        if (cbWebReqTracker != null) {
            httpURLConnection.setRequestProperty(Dynatrace.getRequestTagHeader(), cbWebReqTracker.webReqTag.toString());
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "webReqState is: " + cbWebReqTracker);
        }
    }

    static void updateConnection(ConnStateParms connStateParms) {
        if (connStateParms.conn == null || !configuration.webRequestTiming) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("%s of %s of %s to %s", connStateParms.state, connStateParms.trackingMethod, connStateParms.conn.getClass().getSimpleName(), connStateParms.getRequestDesc()));
        }
        CbWebReqTracker cbWebReqTracker = httpConns.get(connStateParms.conn);
        if (cbWebReqTracker == null) {
            return;
        }
        if (CbConstants.WrStates.PRE_EXEC == connStateParms.state) {
            cbWebReqTracker.checkForManualTag(WebReqTag.fetchWebReqTag(connStateParms.conn, Dynatrace.getRequestTagHeader()), WebReqTag.fetchWebReqTag(connStateParms.conn, "x-dtc"));
        }
        cbWebReqTracker.procNewState(connStateParms);
        if (cbWebReqTracker.canFinalize) {
            synchronized (httpConns) {
                httpConns.remove(connStateParms.conn);
            }
            cbWebReqTracker.sendEvents(connStateParms);
        }
    }
}
