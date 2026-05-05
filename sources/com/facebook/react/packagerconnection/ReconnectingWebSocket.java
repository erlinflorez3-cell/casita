package com.facebook.react.packagerconnection;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.logging.FLog;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class ReconnectingWebSocket extends WebSocketListener {
    private static final int RECONNECT_DELAY_MS = 2000;
    private static final String TAG = "ReconnectingWebSocket";
    private boolean mClosed = false;
    private ConnectionCallback mConnectionCallback;
    private final Handler mHandler;
    private MessageCallback mMessageCallback;
    private final OkHttpClient mOkHttpClient;
    private boolean mSuppressConnectionErrors;
    private final String mUrl;
    private WebSocket mWebSocket;

    /* JADX INFO: renamed from: com.facebook.react.packagerconnection.ReconnectingWebSocket$1 */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReconnectingWebSocket.this.delayedReconnect();
        }
    }

    public interface ConnectionCallback {
        void onConnected();

        void onDisconnected();
    }

    public interface MessageCallback {
        void onMessage(String str);

        void onMessage(ByteString byteString);
    }

    public ReconnectingWebSocket(String str, MessageCallback messageCallback, ConnectionCallback connectionCallback) throws Throwable {
        this.mUrl = str;
        this.mMessageCallback = messageCallback;
        this.mConnectionCallback = connectionCallback;
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Xd("|\u000b\u0002\u0011\u000f\n\u0006P\u0013\u0018Sr\u0017\u0018\u001a\u0010\u001e", (short) (Od.Xd() ^ (-10298)))).getDeclaredMethod(Wg.vd("_^nH]flK_`bXf", (short) (C1633zX.Xd() ^ (-9268))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.mOkHttpClient = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES).build();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void abort(String str, Throwable th) {
        FLog.e(TAG, "Error occurred, shutting down websocket connection: " + str, th);
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

    public synchronized void delayedReconnect() {
        if (!this.mClosed) {
            connect();
        }
    }

    private void reconnect() throws Throwable {
        if (this.mClosed) {
            throw new IllegalStateException(Xg.qd("[z\tB\u0011=\u0011\u0005\u0004\u0011\u0011\u0012\n\t\u001bG\f\u0016\u001a\u001f\u0012\u0012N\u0013\u001d\u001b\u0018\")", (short) (ZN.Xd() ^ 24425), (short) (ZN.Xd() ^ 1184)));
        }
        if (!this.mSuppressConnectionErrors) {
            String str = TAG;
            StringBuilder sbAppend = new StringBuilder(Qg.kd("9di_V_\u0017c\u000eP[YXNK[\u0006YS\u0003\u0004", (short) (C1580rY.Xd() ^ (-21998)), (short) (C1580rY.Xd() ^ (-27508)))).append(this.mUrl);
            short sXd = (short) (C1607wl.Xd() ^ 11716);
            short sXd2 = (short) (C1607wl.Xd() ^ 12430);
            int[] iArr = new int["ktg>/10b5*,$,1(4Y+\u001d+(.".length()];
            QB qb = new QB("ktg>/10b5*,$,1(4Y+\u001d+(.");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            FLog.w(str, sbAppend.append(new String(iArr, 0, i2)).toString());
            this.mSuppressConnectionErrors = true;
        }
        Handler handler = this.mHandler;
        AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.facebook.react.packagerconnection.ReconnectingWebSocket.1
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ReconnectingWebSocket.this.delayedReconnect();
            }
        };
        short sXd3 = (short) (C1607wl.Xd() ^ 26325);
        int[] iArr2 = new int["frgtpic,lo)BZf[bZf".length()];
        QB qb2 = new QB("frgtpic,lo)BZf[bZf");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = {Class.forName(C1561oA.yd("\u0012\b \nY\u0017\u000f\u001b\u0017\\\u0004&\"!\u0017\u0017\u0004{", (short) (C1607wl.Xd() ^ 18859))), Long.TYPE};
        Object[] objArr = {anonymousClass1, 2000L};
        short sXd4 = (short) (Od.Xd() ^ (-30074));
        int[] iArr3 = new int["$$)+{\u001e&\u001c5\"\"".length()];
        QB qb3 = new QB("$$)+{\u001e&\u001c5\"\"");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd4 + sXd4) + sXd4) + i4));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void closeQuietly() {
        this.mClosed = true;
        closeWebSocketQuietly();
        this.mMessageCallback = null;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onDisconnected();
        }
    }

    public void connect() {
        if (this.mClosed) {
            throw new IllegalStateException("Can't connect closed client");
        }
        this.mOkHttpClient.newWebSocket(new Request.Builder().url(this.mUrl).build(), this);
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onClosed(WebSocket webSocket, int i2, String str) {
        this.mWebSocket = null;
        if (!this.mClosed) {
            ConnectionCallback connectionCallback = this.mConnectionCallback;
            if (connectionCallback != null) {
                connectionCallback.onDisconnected();
            }
            reconnect();
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onFailure(WebSocket webSocket, Throwable th, Response response) {
        if (this.mWebSocket != null) {
            abort("Websocket exception", th);
        }
        if (!this.mClosed) {
            ConnectionCallback connectionCallback = this.mConnectionCallback;
            if (connectionCallback != null) {
                connectionCallback.onDisconnected();
            }
            reconnect();
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onMessage(WebSocket webSocket, String str) {
        MessageCallback messageCallback = this.mMessageCallback;
        if (messageCallback != null) {
            messageCallback.onMessage(str);
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onMessage(WebSocket webSocket, ByteString byteString) {
        MessageCallback messageCallback = this.mMessageCallback;
        if (messageCallback != null) {
            messageCallback.onMessage(byteString);
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onOpen(WebSocket webSocket, Response response) {
        this.mWebSocket = webSocket;
        this.mSuppressConnectionErrors = false;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onConnected();
        }
    }

    public synchronized void sendMessage(String str) throws IOException {
        WebSocket webSocket = this.mWebSocket;
        if (webSocket == null) {
            throw new ClosedChannelException();
        }
        webSocket.send(str);
    }

    public synchronized void sendMessage(ByteString byteString) throws IOException {
        WebSocket webSocket = this.mWebSocket;
        if (webSocket == null) {
            throw new ClosedChannelException();
        }
        webSocket.send(byteString);
    }
}
