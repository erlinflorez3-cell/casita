package io.cobrowse;

import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.upokecenter.cbor.CBORException;
import com.upokecenter.cbor.CBORObject;
import com.upokecenter.cbor.CBORType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
final class CBORSocket {
    private final OkHttpClient client;
    private final Handler handler;
    private Timer reconnectTimer;
    private final URLRequest request;
    private WebSocket socket;
    private final WebSocketListener socketListener;
    private boolean connected = false;
    private int attempts = 0;
    private double maxReconnectDelay = 30000.0d;
    private final Object socketLock = new Object();
    private long messageId = 0;
    private long lastMessageAck = 0;
    private final HashMap<String, HashSet<MessageListener>> messageListeners = new HashMap<>();
    private final HashSet<Runnable> connectListeners = new HashSet<>();
    private final HashSet<ErrorListener> errorListeners = new HashSet<>();

    /* JADX INFO: renamed from: io.cobrowse.CBORSocket$1 */
    class AnonymousClass1 extends WebSocketListener {
        AnonymousClass1() {
        }

        /* JADX INFO: renamed from: lambda$onFailure$1$io-cobrowse-CBORSocket$1 */
        /* synthetic */ void m8801lambda$onFailure$1$iocobrowseCBORSocket$1(Throwable th, Response response) {
            Iterator it = new HashSet(CBORSocket.this.errorListeners).iterator();
            while (it.hasNext()) {
                ((ErrorListener) it.next()).onError(th, response);
            }
        }

        /* JADX INFO: renamed from: lambda$onMessage$0$io-cobrowse-CBORSocket$1 */
        /* synthetic */ void m8802lambda$onMessage$0$iocobrowseCBORSocket$1(CBORObject cBORObject, Map map) {
            HashSet hashSet = (HashSet) CBORSocket.this.messageListeners.get(cBORObject.AsString());
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((MessageListener) it.next()).onMessage(map);
                }
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i2, String str) {
            CBORSocket.this.connected = false;
            CBORSocket.this.reconnect();
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, final Throwable th, final Response response) throws Throwable {
            CBORSocket.this.connected = false;
            CBORSocket.this.reconnect();
            Handler handler = CBORSocket.this.handler;
            Runnable runnable = new Runnable() { // from class: io.cobrowse.CBORSocket$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8801lambda$onFailure$1$iocobrowseCBORSocket$1(th, response);
                }
            };
            Class<?> cls = Class.forName(Wg.vd("r\u0001s\u0003\u0005\u007fwB\t\u000eE`~\r\u007f\t\u0007\u0015", (short) (C1580rY.Xd() ^ (-3236))));
            Class<?>[] clsArr = {Class.forName(Qg.kd(":0D.y7+7/t\u0018:21##,$", (short) (C1499aX.Xd() ^ (-26824)), (short) (C1499aX.Xd() ^ (-30513))))};
            Object[] objArr = {runnable};
            short sXd = (short) (ZN.Xd() ^ 2785);
            short sXd2 = (short) (ZN.Xd() ^ 22620);
            int[] iArr = new int["{y||".length()];
            QB qb = new QB("{y||");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, ByteString byteString) throws Throwable {
            short sXd = (short) (OY.Xd() ^ 30418);
            int[] iArr = new int["\u000b6(73:5&\t\u000e".length()];
            QB qb = new QB("\u000b6(73:5&\t\u000e");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            new String(iArr, 0, i2);
            String strYd = C1561oA.yd("\u00128=)1/'c53C1lBD<\u001esV", (short) (C1633zX.Xd() ^ (-23779)));
            String strYd2 = C1561oA.Yd("\u0002(1\u001d)'#_&8(29\u007ff", (short) (Od.Xd() ^ (-16718)));
            try {
                CBORObject cBORObjectDecodeFromBytes = CBORObject.DecodeFromBytes(byteString.toByteArray());
                CBORObject cBORObject = cBORObjectDecodeFromBytes.get(Xg.qd("HKT", (short) (C1607wl.Xd() ^ 9982), (short) (C1607wl.Xd() ^ 28406)));
                if (cBORObject != null && cBORObject.getType() == CBORType.Integer) {
                    CBORSocket.this.lastMessageAck = cBORObject.AsInt64();
                    return;
                }
                final CBORObject cBORObject2 = cBORObjectDecodeFromBytes.get(Jg.Wd("lsXWW", (short) (OY.Xd() ^ 30703), (short) (OY.Xd() ^ 10704)));
                if (cBORObject2 == null || cBORObject2.getType() != CBORType.TextString) {
                    String str = strYd2 + cBORObject2;
                    return;
                }
                Object obj = CBORSocket.this.toNative(cBORObjectDecodeFromBytes.get(ZO.xd("__2v", (short) (FB.Xd() ^ 14972), (short) (FB.Xd() ^ 1768))));
                final HashMap map = new HashMap();
                if (obj != null) {
                    if (!(obj instanceof Map)) {
                        String str2 = strYd + obj;
                        return;
                    }
                    for (Object obj2 : ((Map) obj).keySet()) {
                        Object obj3 = ((Map) obj).get(obj2);
                        if (obj2 instanceof String) {
                            map.put((String) obj2, obj3);
                        }
                    }
                }
                Handler handler = CBORSocket.this.handler;
                Runnable runnable = new Runnable() { // from class: io.cobrowse.CBORSocket$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m8802lambda$onMessage$0$iocobrowseCBORSocket$1(cBORObject2, map);
                    }
                };
                Class<?> cls = Class.forName(C1626yg.Ud("vhz\u000fTz\u0017\u0015H[\u0003f}o\u000eU2\u0003", (short) (FB.Xd() ^ 17900), (short) (FB.Xd() ^ 7131)));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(Ig.wd("?mt7\u001c\u001e?K\u0016(RS\"\u0014zYGH", (short) (C1607wl.Xd() ^ 8746)));
                Object[] objArr = {runnable};
                Method method = cls.getMethod(EO.Od("v&\\|", (short) (C1607wl.Xd() ^ 1547)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (CBORException unused) {
                C1561oA.Qd("i\u000e\u0015~\t\u0005~9[Yeg", (short) (C1499aX.Xd() ^ (-9172)));
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) throws Throwable {
            CBORSocket.this.connected = true;
            CBORSocket.this.attempts = 0;
            for (Runnable runnable : new HashSet(CBORSocket.this.connectListeners)) {
                Handler handler = CBORSocket.this.handler;
                Object[] objArr = {runnable};
                Method method = Class.forName(C1593ug.zd("UcZigb^)kp,Gaofoiw", (short) (ZN.Xd() ^ 18218), (short) (ZN.Xd() ^ 1985))).getMethod(C1561oA.Kd("ootv", (short) (C1633zX.Xd() ^ (-22127))), Class.forName(C1561oA.od("-#7!l*\u001e*\"g\u000b-%$\u0016\u0016\u001f\u0017", (short) (C1633zX.Xd() ^ (-12290)))));
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.cobrowse.CBORSocket$2 */
    class AnonymousClass2 extends TimerTask {
        AnonymousClass2() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            synchronized (CBORSocket.this.socketLock) {
                CBORSocket.this.reconnectTimer = null;
                if (CBORSocket.this.socket == null) {
                    return;
                }
                CBORSocket cBORSocket = CBORSocket.this;
                cBORSocket.socket = cBORSocket.createSocket(cBORSocket.request);
            }
        }
    }

    /* JADX INFO: renamed from: io.cobrowse.CBORSocket$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$upokecenter$cbor$CBORType;

        static {
            int[] iArr = new int[CBORType.values().length];
            $SwitchMap$com$upokecenter$cbor$CBORType = iArr;
            try {
                iArr[CBORType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.SimpleValue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.ByteString.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.TextString.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Array.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Map.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Number.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Integer.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.FloatingPoint.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public interface ErrorListener {
        void onError(Throwable th, Response response);
    }

    public interface MessageListener {
        void onMessage(Map<String, Object> map);
    }

    public interface URLRequest {
        Request create();
    }

    CBORSocket(URLRequest uRLRequest) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.Zd("D\u001f8\u000e&7\u0006fC\u000fl\u0012\u000f&:\u0007/", (short) (ZN.Xd() ^ 16234), (short) (ZN.Xd() ^ 20485))).getDeclaredMethod(C1561oA.Xd("DCS-BKQ0TUWM[", (short) (OY.Xd() ^ 18611)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.socketListener = new AnonymousClass1();
            this.request = uRLRequest;
            this.client = Tls12OkHttpClient.reuse();
            this.socket = createSocket(uRLRequest);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public WebSocket createSocket(URLRequest uRLRequest) {
        this.lastMessageAck = 0L;
        this.messageId = 0L;
        return this.client.newWebSocket(uRLRequest.create(), this.socketListener);
    }

    public void reconnect() {
        synchronized (this.socketLock) {
            if (this.socket == null) {
                return;
            }
            if (this.reconnectTimer != null) {
                return;
            }
            Timer timer = new Timer();
            this.reconnectTimer = timer;
            timer.schedule(new TimerTask() { // from class: io.cobrowse.CBORSocket.2
                AnonymousClass2() {
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    synchronized (CBORSocket.this.socketLock) {
                        CBORSocket.this.reconnectTimer = null;
                        if (CBORSocket.this.socket == null) {
                            return;
                        }
                        CBORSocket cBORSocket = CBORSocket.this;
                        cBORSocket.socket = cBORSocket.createSocket(cBORSocket.request);
                    }
                }
            }, reconnectDelay(this.attempts));
            this.attempts++;
        }
    }

    private long reconnectDelay(int i2) {
        return (long) Math.min(Math.pow(i2 * 300, 1.2d) * ((Math.random() * 0.5d) + 1.0d), this.maxReconnectDelay);
    }

    public Object toNative(CBORObject cBORObject) {
        if (cBORObject == null) {
            return null;
        }
        switch (AnonymousClass3.$SwitchMap$com$upokecenter$cbor$CBORType[cBORObject.getType().ordinal()]) {
            case 5:
                ArrayList arrayList = new ArrayList();
                Iterator<CBORObject> it = cBORObject.getValues().iterator();
                while (it.hasNext()) {
                    arrayList.add(toNative(it.next()));
                }
                break;
            case 6:
                HashMap map = new HashMap();
                for (CBORObject cBORObject2 : cBORObject.getKeys()) {
                    map.put(cBORObject2.AsString(), toNative(cBORObject.get(cBORObject2)));
                }
                break;
            case 7:
            case 8:
                if (cBORObject.CanTruncatedIntFitInInt32()) {
                }
                break;
            case 9:
                if (cBORObject.CanFitInSingle()) {
                }
                break;
        }
        return null;
    }

    void disconnect() {
        synchronized (this.socketLock) {
            this.messageListeners.clear();
            this.errorListeners.clear();
            this.connectListeners.clear();
            WebSocket webSocket = this.socket;
            if (webSocket != null) {
                webSocket.close(1001, "client disconnect");
            }
            Timer timer = this.reconnectTimer;
            if (timer != null) {
                timer.cancel();
                this.reconnectTimer.purge();
                this.reconnectTimer = null;
            }
            this.socket = null;
        }
    }

    boolean isConnected() {
        return this.connected;
    }

    long messageLag() {
        long j2 = this.lastMessageAck;
        long j3 = this.messageId;
        if (j2 == 0) {
            return 0L;
        }
        return j3 - j2;
    }

    void onConnect(Runnable runnable) {
        this.connectListeners.add(runnable);
    }

    void onError(ErrorListener errorListener) {
        this.errorListeners.add(errorListener);
    }

    void onMessage(String str, MessageListener messageListener) {
        HashSet<MessageListener> hashSet = this.messageListeners.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.messageListeners.put(str, hashSet);
        }
        hashSet.add(messageListener);
    }

    long queueSize() {
        WebSocket webSocket;
        if (isConnected() && (webSocket = this.socket) != null) {
            return webSocket.queueSize();
        }
        return Long.MAX_VALUE;
    }

    void send(String str, Map<String, Object> map) throws IOException {
        if (!isConnected()) {
            String.format("Cannot send a socket message when not connected. Dropping \"%s\" event", str);
            return;
        }
        WebSocket webSocket = this.socket;
        if (webSocket == null) {
            String.format("Cannot send a socket message when socket is not ready. Dropping \"%s\" event", str);
            return;
        }
        long j2 = this.messageId;
        this.messageId = 1 + j2;
        HashMap map2 = new HashMap();
        map2.put(NotificationCompat.CATEGORY_EVENT, str);
        map2.put("data", map);
        map2.put("id", Long.valueOf(j2));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CBORObject.Write(CBORObject.FromObject(map2), (OutputStream) byteArrayOutputStream);
        webSocket.send(ByteString.of(byteArrayOutputStream.toByteArray()));
    }

    public void setMaxReconnectDelay(long j2) {
        this.maxReconnectDelay = j2;
    }
}
