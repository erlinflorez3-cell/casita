package com.facebook.react.modules.websocket;

import com.facebook.common.logging.FLog;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.CustomClientBuilder;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.google.common.net.HttpHeaders;
import cz.msebera.android.httpclient.entity.mime.MIME;
import io.sentry.clientreport.DiscardedEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0017$ \u0010+\u001e%\u001e,\u0004%\u0019)\u001f\u0017")
public final class WebSocketModule extends NativeWebSocketModuleSpec {
    private static CustomClientBuilder customClientBuilder = null;
    private final Map<Integer, ContentHandler> mContentHandlers;
    private ForwardingCookieHandler mCookieHandler;
    private final Map<Integer, WebSocket> mWebSocketConnections;

    /* JADX INFO: renamed from: com.facebook.react.modules.websocket.WebSocketModule$1 */
    class AnonymousClass1 extends WebSocketListener {
        final /* synthetic */ int val$id;

        AnonymousClass1(int i2) {
            i = i2;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i2, String str) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", i);
            writableMapCreateMap.putInt("code", i2);
            writableMapCreateMap.putString(DiscardedEvent.JsonKeys.REASON, str);
            WebSocketModule.this.sendEvent("websocketClosed", writableMapCreateMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i2, String str) {
            webSocket.close(i2, str);
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th, Response response) {
            WebSocketModule.this.notifyWebSocketFailed(i, th.getMessage());
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", i);
            writableMapCreateMap.putString("type", "text");
            ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
            if (contentHandler != null) {
                contentHandler.onMessage(str, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", str);
            }
            WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, ByteString byteString) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", i);
            writableMapCreateMap.putString("type", MIME.ENC_BINARY);
            ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
            if (contentHandler != null) {
                contentHandler.onMessage(byteString, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", byteString.base64());
            }
            WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(i), webSocket);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", i);
            writableMapCreateMap.putString("protocol", response.header(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, ""));
            WebSocketModule.this.sendEvent("websocketOpen", writableMapCreateMap);
        }
    }

    public interface ContentHandler {
        void onMessage(String str, WritableMap writableMap);

        void onMessage(ByteString byteString, WritableMap writableMap);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mWebSocketConnections = new ConcurrentHashMap();
        this.mContentHandlers = new ConcurrentHashMap();
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
        CustomClientBuilder customClientBuilder2 = customClientBuilder;
        if (customClientBuilder2 != null) {
            customClientBuilder2.apply(builder);
        }
    }

    private String getCookie(String str) {
        try {
            List<String> list = this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getDefaultOrigin(java.lang.String r10) {
        /*
            java.net.URI r4 = new java.net.URI     // Catch: java.net.URISyntaxException -> L9b
            r4.<init>(r10)     // Catch: java.net.URISyntaxException -> L9b
            java.lang.String r9 = r4.getScheme()     // Catch: java.net.URISyntaxException -> L9b
            int r8 = r9.hashCode()     // Catch: java.net.URISyntaxException -> L9b
            r0 = 3804(0xedc, float:5.33E-42)
            java.lang.String r3 = "https"
            java.lang.String r7 = "http"
            r6 = 3
            r5 = 2
            r1 = 1
            r2 = -1
            if (r8 == r0) goto L51
            r0 = 118039(0x1cd17, float:1.65408E-40)
            if (r8 == r0) goto L46
            r0 = 3213448(0x310888, float:4.503E-39)
            if (r8 == r0) goto L3e
            r0 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r8 == r0) goto L36
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L6f
            if (r0 == r1) goto L5c
            java.lang.String r3 = ""
            if (r0 == r5) goto L5e
            if (r0 == r6) goto L5e
            goto L6f
        L36:
            boolean r0 = r9.equals(r3)     // Catch: java.net.URISyntaxException -> L9b
            if (r0 == 0) goto L2a
            r0 = r6
            goto L2b
        L3e:
            boolean r0 = r9.equals(r7)     // Catch: java.net.URISyntaxException -> L9b
            if (r0 == 0) goto L2a
            r0 = r5
            goto L2b
        L46:
            java.lang.String r0 = "wss"
            boolean r0 = r9.equals(r0)     // Catch: java.net.URISyntaxException -> L9b
            if (r0 == 0) goto L2a
            r0 = 0
            goto L2b
        L51:
            java.lang.String r0 = "ws"
            boolean r0 = r9.equals(r0)     // Catch: java.net.URISyntaxException -> L9b
            if (r0 == 0) goto L2a
            r0 = r1
            goto L2b
        L5c:
            r3 = r7
            goto L6f
        L5e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> L9b
            r1.<init>(r3)     // Catch: java.net.URISyntaxException -> L9b
            java.lang.String r0 = r4.getScheme()     // Catch: java.net.URISyntaxException -> L9b
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.net.URISyntaxException -> L9b
            java.lang.String r3 = r0.toString()     // Catch: java.net.URISyntaxException -> L9b
        L6f:
            int r0 = r4.getPort()     // Catch: java.net.URISyntaxException -> L9b
            if (r0 == r2) goto L8c
            java.lang.String r2 = "%s://%s:%s"
            java.lang.String r1 = r4.getHost()     // Catch: java.net.URISyntaxException -> L9b
            int r0 = r4.getPort()     // Catch: java.net.URISyntaxException -> L9b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.net.URISyntaxException -> L9b
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r1, r0}     // Catch: java.net.URISyntaxException -> L9b
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch: java.net.URISyntaxException -> L9b
            goto L9a
        L8c:
            java.lang.String r1 = "%s://%s"
            java.lang.String r0 = r4.getHost()     // Catch: java.net.URISyntaxException -> L9b
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}     // Catch: java.net.URISyntaxException -> L9b
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch: java.net.URISyntaxException -> L9b
        L9a:
            return r0
        L9b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to set "
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r0 = " as default origin header"
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.websocket.WebSocketModule.getDefaultOrigin(java.lang.String):java.lang.String");
    }

    public void notifyWebSocketFailed(int i2, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i2);
        writableMapCreateMap.putString("message", str);
        sendEvent("websocketFailed", writableMapCreateMap);
    }

    public void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(str, writableMap);
        }
    }

    public static void setCustomClientBuilder(CustomClientBuilder customClientBuilder2) {
        customClientBuilder = customClientBuilder2;
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double d2, String str, double d3) {
        int i2 = (int) d3;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i2));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.close((int) d2, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i2));
            this.mContentHandlers.remove(Integer.valueOf(i2));
        } catch (Exception e2) {
            FLog.e(ReactConstants.TAG, "Could not close WebSocket connection for id " + i2, e2);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d2) {
        boolean z2;
        int i2 = (int) d2;
        OkHttpClient.Builder timeout = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES);
        applyCustomBuilder(timeout);
        OkHttpClient okHttpClientBuild = timeout.build();
        Request.Builder builderUrl = new Request.Builder().tag(Integer.valueOf(i2)).url(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            builderUrl.addHeader("Cookie", cookie);
        }
        if (readableMap != null && readableMap.hasKey("headers") && readableMap.getType("headers").equals(ReadableType.Map)) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            z2 = false;
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(strNextKey))) {
                    if (strNextKey.equalsIgnoreCase("origin")) {
                        z2 = true;
                    }
                    builderUrl.addHeader(strNextKey, map.getString(strNextKey));
                } else {
                    FLog.w(ReactConstants.TAG, "Ignoring: requested " + strNextKey + ", value not a string");
                }
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            builderUrl.addHeader("origin", getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            for (int i3 = 0; i3 < readableArray.size(); i3++) {
                String strTrim = readableArray.getString(i3).trim();
                if (!strTrim.isEmpty() && !strTrim.contains(",")) {
                    sb.append(strTrim);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.replace(sb.length() - 1, sb.length(), "");
                builderUrl.addHeader(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, sb.toString());
            }
        }
        okHttpClientBuild.newWebSocket(builderUrl.build(), new WebSocketListener() { // from class: com.facebook.react.modules.websocket.WebSocketModule.1
            final /* synthetic */ int val$id;

            AnonymousClass1(int i22) {
                i = i22;
            }

            @Override // okhttp3.WebSocketListener
            public void onClosed(WebSocket webSocket, int i22, String str2) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("id", i);
                writableMapCreateMap.putInt("code", i22);
                writableMapCreateMap.putString(DiscardedEvent.JsonKeys.REASON, str2);
                WebSocketModule.this.sendEvent("websocketClosed", writableMapCreateMap);
            }

            @Override // okhttp3.WebSocketListener
            public void onClosing(WebSocket webSocket, int i22, String str2) {
                webSocket.close(i22, str2);
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                WebSocketModule.this.notifyWebSocketFailed(i, th.getMessage());
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String str2) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("id", i);
                writableMapCreateMap.putString("type", "text");
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                if (contentHandler != null) {
                    contentHandler.onMessage(str2, writableMapCreateMap);
                } else {
                    writableMapCreateMap.putString("data", str2);
                }
                WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, ByteString byteString) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("id", i);
                writableMapCreateMap.putString("type", MIME.ENC_BINARY);
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                if (contentHandler != null) {
                    contentHandler.onMessage(byteString, writableMapCreateMap);
                } else {
                    writableMapCreateMap.putString("data", byteString.base64());
                }
                WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
            }

            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(i), webSocket);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("id", i);
                writableMapCreateMap.putString("protocol", response.header(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, ""));
                WebSocketModule.this.sendEvent("websocketOpen", writableMapCreateMap);
            }
        });
        okHttpClientBuild.dispatcher().executorService().shutdown();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        Iterator<WebSocket> it = this.mWebSocketConnections.values().iterator();
        while (it.hasNext()) {
            it.next().close(1001, null);
        }
        this.mWebSocketConnections.clear();
        this.mContentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double d2) {
        int i2 = (int) d2;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i2));
        if (webSocket != null) {
            try {
                webSocket.send(ByteString.EMPTY);
                return;
            } catch (Exception e2) {
                notifyWebSocketFailed(i2, e2.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i2);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i2);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString(DiscardedEvent.JsonKeys.REASON, "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i2));
        this.mContentHandlers.remove(Integer.valueOf(i2));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double d2) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String str, double d2) {
        int i2 = (int) d2;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i2));
        if (webSocket != null) {
            try {
                webSocket.send(str);
                return;
            } catch (Exception e2) {
                notifyWebSocketFailed(i2, e2.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i2);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i2);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString(DiscardedEvent.JsonKeys.REASON, "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i2));
        this.mContentHandlers.remove(Integer.valueOf(i2));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String str, double d2) {
        int i2 = (int) d2;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i2));
        if (webSocket != null) {
            try {
                webSocket.send(ByteString.decodeBase64(str));
                return;
            } catch (Exception e2) {
                notifyWebSocketFailed(i2, e2.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i2);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i2);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString(DiscardedEvent.JsonKeys.REASON, "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i2));
        this.mContentHandlers.remove(Integer.valueOf(i2));
    }

    public void sendBinary(ByteString byteString, int i2) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i2));
        if (webSocket != null) {
            try {
                webSocket.send(byteString);
                return;
            } catch (Exception e2) {
                notifyWebSocketFailed(i2, e2.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i2);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i2);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString(DiscardedEvent.JsonKeys.REASON, "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i2));
        this.mContentHandlers.remove(Integer.valueOf(i2));
    }

    public void setContentHandler(int i2, ContentHandler contentHandler) {
        if (contentHandler != null) {
            this.mContentHandlers.put(Integer.valueOf(i2), contentHandler);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i2));
        }
    }
}
