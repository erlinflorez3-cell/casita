package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.devsupport.JSDebuggerWebSocketClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class WebsocketJavaScriptExecutor implements JavaJSExecutor {
    private static final int CONNECT_RETRY_COUNT = 3;
    private static final long CONNECT_TIMEOUT_MS = 5000;
    private final HashMap<String, String> mInjectedObjects = new HashMap<>();
    private JSDebuggerWebSocketClient mWebSocketClient;

    private static class JSExecutorCallbackFuture implements JSDebuggerWebSocketClient.JSDebuggerCallback {
        private Throwable mCause;
        private String mResponse;
        private final Semaphore mSemaphore;

        private JSExecutorCallbackFuture() {
            this.mSemaphore = new Semaphore(0);
        }

        public String get() throws Throwable {
            this.mSemaphore.acquire();
            Throwable th = this.mCause;
            if (th == null) {
                return this.mResponse;
            }
            throw th;
        }

        @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
        public void onFailure(Throwable th) {
            this.mCause = th;
            this.mSemaphore.release();
        }

        @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
        public void onSuccess(String str) {
            this.mResponse = str;
            this.mSemaphore.release();
        }
    }

    public interface JSExecutorConnectCallback {
        void onFailure(Throwable th);

        void onSuccess();
    }

    public static class WebsocketExecutorTimeoutException extends Exception {
        public WebsocketExecutorTimeoutException(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectInternal(String str, final JSExecutorConnectCallback jSExecutorConnectCallback) throws Throwable {
        final JSDebuggerWebSocketClient jSDebuggerWebSocketClient = new JSDebuggerWebSocketClient();
        short sXd = (short) (C1499aX.Xd() ^ (-29691));
        int[] iArr = new int["NZO\\XQK\u0014TW\u0011.POOCO".length()];
        QB qb = new QB("NZO\\XQK\u0014TW\u0011.POOCO");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.yd("\u001f\u001e*\u0004\u001d&(\u0007/0.$6", (short) (ZN.Xd() ^ 27874)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            final Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            jSDebuggerWebSocketClient.connect(str, new JSDebuggerWebSocketClient.JSDebuggerCallback() { // from class: com.facebook.react.devsupport.WebsocketJavaScriptExecutor.2
                private boolean didSendResult = false;

                @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
                public void onFailure(Throwable th) {
                    handler.removeCallbacksAndMessages(null);
                    if (this.didSendResult) {
                        return;
                    }
                    jSExecutorConnectCallback.onFailure(th);
                    this.didSendResult = true;
                }

                @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
                public void onSuccess(String str2) {
                    jSDebuggerWebSocketClient.prepareJSRuntime(new JSDebuggerWebSocketClient.JSDebuggerCallback() { // from class: com.facebook.react.devsupport.WebsocketJavaScriptExecutor.2.1
                        @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
                        public void onFailure(Throwable th) {
                            handler.removeCallbacksAndMessages(null);
                            if (AnonymousClass2.this.didSendResult) {
                                return;
                            }
                            jSExecutorConnectCallback.onFailure(th);
                            AnonymousClass2.this.didSendResult = true;
                        }

                        @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
                        public void onSuccess(String str3) {
                            handler.removeCallbacksAndMessages(null);
                            WebsocketJavaScriptExecutor.this.mWebSocketClient = jSDebuggerWebSocketClient;
                            if (AnonymousClass2.this.didSendResult) {
                                return;
                            }
                            jSExecutorConnectCallback.onSuccess();
                            AnonymousClass2.this.didSendResult = true;
                        }
                    });
                }
            });
            Object[] objArr2 = {new Runnable() { // from class: com.facebook.react.devsupport.WebsocketJavaScriptExecutor.3
                @Override // java.lang.Runnable
                public void run() {
                    jSDebuggerWebSocketClient.closeQuietly();
                    jSExecutorConnectCallback.onFailure(new WebsocketExecutorTimeoutException("Timeout while connecting to remote debugger"));
                }
            }, 5000L};
            Method method = Class.forName(C1561oA.Yd("w\u0006|\f\n\u0005\u0001K\u000e\u0013Ni\u0004\u0012\t\u0012\f\u001a", (short) (OY.Xd() ^ 30261))).getMethod(Jg.Wd("\b\u001ca.O<\u0005E/e&", (short) (C1499aX.Xd() ^ (-18992)), (short) (C1499aX.Xd() ^ (-31212))), Class.forName(Xg.qd("YQgS!`Vd^&Koij^`ke", (short) (C1633zX.Xd() ^ (-28656)), (short) (C1633zX.Xd() ^ (-29665)))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void close() {
        JSDebuggerWebSocketClient jSDebuggerWebSocketClient = this.mWebSocketClient;
        if (jSDebuggerWebSocketClient != null) {
            jSDebuggerWebSocketClient.closeQuietly();
        }
    }

    public void connect(final String str, final JSExecutorConnectCallback jSExecutorConnectCallback) throws Throwable {
        final AtomicInteger atomicInteger = new AtomicInteger(3);
        connectInternal(str, new JSExecutorConnectCallback() { // from class: com.facebook.react.devsupport.WebsocketJavaScriptExecutor.1
            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onFailure(Throwable th) throws Throwable {
                if (atomicInteger.decrementAndGet() <= 0) {
                    jSExecutorConnectCallback.onFailure(th);
                } else {
                    WebsocketJavaScriptExecutor.this.connectInternal(str, this);
                }
            }

            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onSuccess() {
                jSExecutorConnectCallback.onSuccess();
            }
        });
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public String executeJSCall(String str, String str2) throws JavaJSExecutor.ProxyExecutorException {
        JSExecutorCallbackFuture jSExecutorCallbackFuture = new JSExecutorCallbackFuture();
        ((JSDebuggerWebSocketClient) Assertions.assertNotNull(this.mWebSocketClient)).executeJSCall(str, str2, jSExecutorCallbackFuture);
        try {
            return jSExecutorCallbackFuture.get();
        } catch (Throwable th) {
            throw new JavaJSExecutor.ProxyExecutorException(th);
        }
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void loadBundle(String str) throws JavaJSExecutor.ProxyExecutorException {
        JSExecutorCallbackFuture jSExecutorCallbackFuture = new JSExecutorCallbackFuture();
        ((JSDebuggerWebSocketClient) Assertions.assertNotNull(this.mWebSocketClient)).loadBundle(str, this.mInjectedObjects, jSExecutorCallbackFuture);
        try {
            jSExecutorCallbackFuture.get();
        } catch (Throwable th) {
            throw new JavaJSExecutor.ProxyExecutorException(th);
        }
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void setGlobalVariable(String str, String str2) {
        this.mInjectedObjects.put(str, str2);
    }
}
