package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import com.facebook.jni.HybridData;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
class CxxInspectorPackagerConnection implements IInspectorPackagerConnection {
    private final HybridData mHybridData;

    private static class DelegateImpl {
        private final Handler mHandler;
        private final OkHttpClient mHttpClient;

        private DelegateImpl() throws Throwable {
            this.mHttpClient = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES).build();
            short sXd = (short) (Od.Xd() ^ (-19676));
            short sXd2 = (short) (Od.Xd() ^ (-24311));
            int[] iArr = new int["htivrke.nq+Hjii]i".length()];
            QB qb = new QB("htivrke.nq+Hjii]i");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(hg.Vd("khvNahlIkjj^j", (short) (C1499aX.Xd() ^ (-18184)), (short) (C1499aX.Xd() ^ (-24225))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                this.mHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public IWebSocket connectWebSocket(String str, final WebSocketDelegate webSocketDelegate) {
            final WebSocket webSocketNewWebSocket = this.mHttpClient.newWebSocket(new Request.Builder().url(str).build(), new WebSocketListener() { // from class: com.facebook.react.devsupport.CxxInspectorPackagerConnection.DelegateImpl.1
                @Override // okhttp3.WebSocketListener
                public void onClosed(WebSocket webSocket, int i2, String str2) throws Throwable {
                    DelegateImpl.this.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.CxxInspectorPackagerConnection.DelegateImpl.1.3
                        @Override // java.lang.Runnable
                        public void run() {
                            webSocketDelegate.didClose();
                            webSocketDelegate.close();
                        }
                    }, 0L);
                }

                @Override // okhttp3.WebSocketListener
                public void onFailure(WebSocket webSocket, final Throwable th, Response response) throws Throwable {
                    DelegateImpl.this.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.CxxInspectorPackagerConnection.DelegateImpl.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            String message = th.getMessage();
                            WebSocketDelegate webSocketDelegate2 = webSocketDelegate;
                            if (message == null) {
                                message = "<Unknown error>";
                            }
                            webSocketDelegate2.didFailWithError(null, message);
                            webSocketDelegate.close();
                        }
                    }, 0L);
                }

                @Override // okhttp3.WebSocketListener
                public void onMessage(WebSocket webSocket, final String str2) throws Throwable {
                    DelegateImpl.this.scheduleCallback(new Runnable() { // from class: com.facebook.react.devsupport.CxxInspectorPackagerConnection.DelegateImpl.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            webSocketDelegate.didReceiveMessage(str2);
                        }
                    }, 0L);
                }
            });
            return new IWebSocket() { // from class: com.facebook.react.devsupport.CxxInspectorPackagerConnection.DelegateImpl.2
                @Override // com.facebook.react.devsupport.CxxInspectorPackagerConnection.IWebSocket, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    webSocketNewWebSocket.close(1000, "End of session");
                }

                @Override // com.facebook.react.devsupport.CxxInspectorPackagerConnection.IWebSocket
                public void send(String str2) {
                    webSocketNewWebSocket.send(str2);
                }
            };
        }

        public void scheduleCallback(Runnable runnable, long j2) throws Throwable {
            Handler handler = this.mHandler;
            Class<?> cls = Class.forName(C1561oA.ud("dpernga*jm'@XdY`Xd", (short) (C1633zX.Xd() ^ (-26840))));
            Class<?>[] clsArr = {Class.forName(C1561oA.yd(",$:&k+!/!h\u000e2$%\u0019\u001b\u001e\u0018", (short) (OY.Xd() ^ 2644))), Long.TYPE};
            Object[] objArr = {runnable, Long.valueOf(j2)};
            Method method = cls.getMethod(C1561oA.Yd("338:\u000b-5+D11", (short) (C1633zX.Xd() ^ (-17895))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private interface IWebSocket extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        void send(String str);
    }

    private static class WebSocketDelegate implements Closeable {
        private final HybridData mHybridData;

        private WebSocketDelegate(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mHybridData.resetNative();
        }

        public native void didClose();

        public native void didFailWithError(Integer num, String str);

        public native void didReceiveMessage(String str);
    }

    static {
        DevSupportSoLoader.staticInit();
    }

    public CxxInspectorPackagerConnection(String str, String str2) {
        this.mHybridData = initHybrid(str, str2, new DelegateImpl());
    }

    private static native HybridData initHybrid(String str, String str2, DelegateImpl delegateImpl);

    @Override // com.facebook.react.devsupport.IInspectorPackagerConnection
    public native void closeQuietly();

    @Override // com.facebook.react.devsupport.IInspectorPackagerConnection
    public native void connect();

    @Override // com.facebook.react.devsupport.IInspectorPackagerConnection
    public native void sendEventToAllConnections(String str);
}
