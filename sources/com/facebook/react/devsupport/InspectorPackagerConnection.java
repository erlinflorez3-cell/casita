package com.facebook.react.devsupport;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Inspector;
import io.sentry.protocol.App;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class InspectorPackagerConnection implements IInspectorPackagerConnection {
    private static final String TAG = "InspectorPackagerConnection";
    private final Connection mConnection;
    private final Map<String, Inspector.LocalConnection> mInspectorConnections = new HashMap();
    private final String mPackageName;

    private class Connection extends WebSocketListener {
        private static final int RECONNECT_DELAY_MS = 2000;
        private boolean mClosed;
        private final Handler mHandler;
        private OkHttpClient mHttpClient;
        private boolean mSuppressConnectionErrors;
        private final String mUrl;
        private WebSocket mWebSocket;

        public Connection(String str) throws Throwable {
            this.mUrl = str;
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.Yd(":H?NLGC\u000ePU\u00110TUWM[", (short) (C1499aX.Xd() ^ (-19472)))).getDeclaredMethod(Xg.qd("baqK`ioNrsuky", (short) (C1580rY.Xd() ^ (-28137)), (short) (C1580rY.Xd() ^ (-19117))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                this.mHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private void abort(String str, Throwable th) {
            FLog.e(InspectorPackagerConnection.TAG, "Error occurred, shutting down websocket connection: " + str, th);
            InspectorPackagerConnection.this.closeAllConnections();
            closeWebSocketQuietly();
        }

        private void closeWebSocketQuietly() {
            WebSocket webSocket = this.mWebSocket;
            if (webSocket != null) {
                try {
                    webSocket.close(1000, "End of session");
                } catch (Exception unused) {
                }
                this.mWebSocket = null;
            }
        }

        private void reconnect() throws Throwable {
            if (this.mClosed) {
                throw new IllegalStateException(C1561oA.Qd("\f)5l9c5'$/-,\"\u001f/Y\u001c$&)\u001a\u0018R\u0015\u001d\u0019\u0014\u001c!", (short) (C1607wl.Xd() ^ 26676)));
            }
            if (!this.mSuppressConnectionErrors) {
                String strWd = Jg.Wd("\u0006u\u001c}\u0014o#_(.%H3F\u000eP\u001f:\fL\u0011A\u0005X\u000fB\u0002", (short) (ZN.Xd() ^ 26363), (short) (ZN.Xd() ^ 2647));
                short sXd = (short) (C1607wl.Xd() ^ 12048);
                short sXd2 = (short) (C1607wl.Xd() ^ 29064);
                int[] iArr = new int["\bw\u000b{\u0007*\u0018aFA?}\u0002\u001a\u00040\faB\u0003}V\r\u000bh$OXSn,%M\bWFF]G#3\u0007GYmU\u0012_n".length()];
                QB qb = new QB("\bw\u000b{\u0007*\u0018aFA?}\u0002\u001a\u00040\faB\u0003}V\r\u000bh$OXSn,%M\bWFF]G#3\u0007GYmU\u0012_n");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                    i2++;
                }
                FLog.w(strWd, new String(iArr, 0, i2));
                this.mSuppressConnectionErrors = true;
            }
            Handler handler = this.mHandler;
            Object[] objArr = {new Runnable() { // from class: com.facebook.react.devsupport.InspectorPackagerConnection.Connection.1
                @Override // java.lang.Runnable
                public void run() {
                    if (Connection.this.mClosed) {
                        return;
                    }
                    Connection.this.connect();
                }
            }, 2000L};
            Method method = Class.forName(C1626yg.Ud("rY% h\u000bu\u0003gGgs'\u0014\b(\u0002'", (short) (Od.Xd() ^ (-4040)), (short) (Od.Xd() ^ (-22099)))).getMethod(EO.Od("P\u001ddG)o\u001dC\u000fX/", (short) (C1607wl.Xd() ^ 20945)), Class.forName(Ig.wd("[!DR~pU2\u0001Fl.x~Y{Q,", (short) (Od.Xd() ^ (-14689)))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public void close() {
            this.mClosed = true;
            WebSocket webSocket = this.mWebSocket;
            if (webSocket != null) {
                try {
                    webSocket.close(1000, "End of session");
                } catch (Exception unused) {
                }
                this.mWebSocket = null;
            }
        }

        public void connect() {
            if (this.mClosed) {
                throw new IllegalStateException("Can't connect closed client");
            }
            if (this.mHttpClient == null) {
                this.mHttpClient = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES).build();
            }
            this.mHttpClient.newWebSocket(new Request.Builder().url(this.mUrl).build(), this);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i2, String str) throws Throwable {
            this.mWebSocket = null;
            InspectorPackagerConnection.this.closeAllConnections();
            if (this.mClosed) {
                return;
            }
            reconnect();
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th, Response response) throws Throwable {
            if (this.mWebSocket != null) {
                abort("Websocket exception", th);
            }
            if (this.mClosed) {
                return;
            }
            reconnect();
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            try {
                InspectorPackagerConnection.this.handleProxyMessage(new JSONObject(str));
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            this.mWebSocket = webSocket;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.react.devsupport.InspectorPackagerConnection$Connection$2] */
        public void send(final JSONObject jSONObject) {
            new AsyncTask<WebSocket, Void, Void>() { // from class: com.facebook.react.devsupport.InspectorPackagerConnection.Connection.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public Void doInBackground(WebSocket... webSocketArr) {
                    if (webSocketArr != null && webSocketArr.length != 0) {
                        try {
                            webSocketArr[0].send(jSONObject.toString());
                        } catch (Exception e2) {
                            FLog.w(InspectorPackagerConnection.TAG, "Couldn't send event to packager", e2);
                        }
                    }
                    return null;
                }
            }.execute(this.mWebSocket);
        }
    }

    public InspectorPackagerConnection(String str, String str2) {
        this.mConnection = new Connection(str);
        this.mPackageName = str2;
    }

    private JSONArray getPages() throws JSONException {
        List<Inspector.Page> pages = Inspector.getPages();
        JSONArray jSONArray = new JSONArray();
        for (Inspector.Page page : pages) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", String.valueOf(page.getId()));
            jSONObject.put("title", page.getTitle());
            jSONObject.put(App.TYPE, this.mPackageName);
            jSONObject.put("vm", page.getVM());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private void handleConnect(JSONObject jSONObject) throws JSONException {
        final String string = jSONObject.getString("pageId");
        if (this.mInspectorConnections.remove(string) != null) {
            throw new IllegalStateException("Already connected: " + string);
        }
        try {
            this.mInspectorConnections.put(string, Inspector.connect(Integer.parseInt(string), new Inspector.RemoteConnection() { // from class: com.facebook.react.devsupport.InspectorPackagerConnection.1
                @Override // com.facebook.react.bridge.Inspector.RemoteConnection
                public void onDisconnect() {
                    try {
                        InspectorPackagerConnection.this.mInspectorConnections.remove(string);
                        InspectorPackagerConnection inspectorPackagerConnection = InspectorPackagerConnection.this;
                        inspectorPackagerConnection.sendEvent("disconnect", inspectorPackagerConnection.makePageIdPayload(string));
                    } catch (JSONException e2) {
                        FLog.w(InspectorPackagerConnection.TAG, "Couldn't send event to packager", e2);
                    }
                }

                @Override // com.facebook.react.bridge.Inspector.RemoteConnection
                public void onMessage(String str) {
                    try {
                        InspectorPackagerConnection.this.sendWrappedEvent(string, str);
                    } catch (JSONException e2) {
                        FLog.w(InspectorPackagerConnection.TAG, "Couldn't send event to packager", e2);
                    }
                }
            }));
        } catch (Exception e2) {
            FLog.w(TAG, "Failed to open page: " + string, e2);
            sendEvent("disconnect", makePageIdPayload(string));
        }
    }

    private void handleDisconnect(JSONObject jSONObject) throws JSONException {
        Inspector.LocalConnection localConnectionRemove = this.mInspectorConnections.remove(jSONObject.getString("pageId"));
        if (localConnectionRemove == null) {
            return;
        }
        localConnectionRemove.disconnect();
    }

    private void handleWrappedEvent(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("pageId");
        String string2 = jSONObject.getString("wrappedEvent");
        Inspector.LocalConnection localConnection = this.mInspectorConnections.get(string);
        if (localConnection == null) {
            FLog.w(TAG, "PageID " + string + " is disconnected. Dropping event: " + string2);
        } else {
            localConnection.sendMessage(string2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject makePageIdPayload(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
        jSONObject.put("payload", obj);
        this.mConnection.send(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWrappedEvent(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageId", str);
        jSONObject.put("wrappedEvent", str2);
        sendEvent("wrappedEvent", jSONObject);
    }

    void closeAllConnections() {
        Iterator<Map.Entry<String, Inspector.LocalConnection>> it = this.mInspectorConnections.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().disconnect();
        }
        this.mInspectorConnections.clear();
    }

    @Override // com.facebook.react.devsupport.IInspectorPackagerConnection
    public void closeQuietly() {
        this.mConnection.close();
    }

    @Override // com.facebook.react.devsupport.IInspectorPackagerConnection
    public void connect() {
        this.mConnection.connect();
    }

    void handleProxyMessage(JSONObject jSONObject) throws JSONException, IOException {
        String string;
        string = jSONObject.getString(NotificationCompat.CATEGORY_EVENT);
        string.hashCode();
        switch (string) {
            case "disconnect":
                handleDisconnect(jSONObject.getJSONObject("payload"));
                return;
            case "connect":
                handleConnect(jSONObject.getJSONObject("payload"));
                return;
            case "wrappedEvent":
                handleWrappedEvent(jSONObject.getJSONObject("payload"));
                return;
            case "getPages":
                sendEvent("getPages", getPages());
                return;
            default:
                throw new IllegalArgumentException("Unknown event: " + string);
        }
    }

    @Override // com.facebook.react.devsupport.IInspectorPackagerConnection
    public void sendEventToAllConnections(String str) {
        Iterator<Map.Entry<String, Inspector.LocalConnection>> it = this.mInspectorConnections.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().sendMessage(str);
        }
    }
}
