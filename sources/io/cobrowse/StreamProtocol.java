package io.cobrowse;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Display;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.reactnativecommunity.clipboard.ClipboardModule;
import io.cobrowse.ActivityWatcher;
import io.cobrowse.CBORSocket;
import io.cobrowse.Encoder;
import io.cobrowse.Session;
import io.sentry.cache.EnvelopeCache;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.Request;
import okhttp3.Response;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
final class StreamProtocol extends SessionContextModule implements Session.Listener, ActivityWatcher.Observer, ViewTreeObserver.OnWindowFocusChangeListener, Encoder.Delegate, LifecycleObserver {
    private static final String ControlTokenField = "control_token";
    private static final String ControlUrlField = "control_url";
    private static final String StreamTokenField = "stream_token";
    private static final String StreamUrlField = "stream_url";
    private static int frameId = 0;
    private CBORSocket control;
    private final SparseArray<Encoder> encoders;
    private Handler handler;
    private boolean isDestroyed;
    private final Set<Listener> listeners;
    private CBORSocket stream;

    interface Listener {
        void agentEventReceived(Session session, AgentEvent agentEvent);
    }

    StreamProtocol(Application application, Session session) throws Throwable {
        super(application, session);
        this.encoders = new SparseArray<>();
        this.listeners = new HashSet();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Kd("We\\kid`+mr.Mqrtjx", (short) (FB.Xd() ^ 23591))).getDeclaredMethod(Wg.Zd("pf\r[\f\u0007&\u0004.4AyN", (short) (C1499aX.Xd() ^ (-10825)), (short) (C1499aX.Xd() ^ (-23880))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            session.registerSessionListener(this);
            ActivityWatcher.registerActivityObserver(this);
            Looper looperMyLooper = Looper.myLooper();
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.Xd("Vd[jhc_*lq-Lpqsiw", (short) (C1633zX.Xd() ^ (-29555)))).getDeclaredMethod(Wg.vd("DAO'BIM*TSSG[", (short) (C1633zX.Xd() ^ (-14025))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                if (looperMyLooper == ((Looper) declaredMethod2.invoke(null, objArr2))) {
                    ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
                    return;
                }
                Handler handler = this.handler;
                Object[] objArr3 = {new Runnable() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda14
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m8847lambda$new$0$iocobrowseStreamProtocol();
                    }
                }};
                Method method = Class.forName(Qg.kd("\u000b\u0017\f\u0019\u0015\u000e\bP\u0011\u0014Mf~\u000b\u007f\u0007~\u000b", (short) (OY.Xd() ^ 3659), (short) (OY.Xd() ^ 17576))).getMethod(C1561oA.ud("dbee", (short) (Od.Xd() ^ (-3041))), Class.forName(hg.Vd("^ThR\u001e[O[S\u0019<^VUGGPH", (short) (OY.Xd() ^ 14679), (short) (OY.Xd() ^ 31084))));
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr3);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private void agentEventReceived(final Session session, final AgentEvent agentEvent) throws Throwable {
        Handler handler = this.handler;
        if (handler != null) {
            Runnable runnable = new Runnable() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8837lambda$agentEventReceived$14$iocobrowseStreamProtocol(session, agentEvent);
                }
            };
            Class<?> cls = Class.forName(C1561oA.yd("*8/>4/+u05p\f\u001e,#,>L", (short) (C1607wl.Xd() ^ 20054)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (ZN.Xd() ^ 18840);
            int[] iArr = new int["tl\u0003n<{q\u007fyAf\u000b\u0005\u0006y{\u0007\u0001".length()];
            QB qb = new QB("tl\u0003n<{q\u007fyAf\u000b\u0005\u0006y{\u0007\u0001");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {runnable};
            Method method = cls.getMethod(Xg.qd("EEJL", (short) (FB.Xd() ^ 21147), (short) (FB.Xd() ^ 11387)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private void connectControl(final Session session) {
        if (this.control != null) {
            return;
        }
        CBORSocket cBORSocketSocket = socket(session, ControlUrlField, ControlTokenField);
        this.control = cBORSocketSocket;
        cBORSocketSocket.onMessage(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, new CBORSocket.MessageListener() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda1
            @Override // io.cobrowse.CBORSocket.MessageListener
            public final void onMessage(Map map) throws Throwable {
                this.f$0.m8838lambda$connectControl$4$iocobrowseStreamProtocol(session, map);
            }
        });
        this.control.onConnect(new Runnable() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                session.fetch(null);
            }
        });
    }

    private void connectStream(final Session session) {
        if (this.stream != null) {
            return;
        }
        CBORSocket cBORSocketSocket = socket(session, StreamUrlField, StreamTokenField);
        this.stream = cBORSocketSocket;
        cBORSocketSocket.onMessage("drawing", new CBORSocket.MessageListener() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda6
            @Override // io.cobrowse.CBORSocket.MessageListener
            public final void onMessage(Map map) throws Throwable {
                this.f$0.m8842lambda$connectStream$6$iocobrowseStreamProtocol(session, map);
            }
        });
        this.stream.onMessage("laser", new CBORSocket.MessageListener() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda7
            @Override // io.cobrowse.CBORSocket.MessageListener
            public final void onMessage(Map map) throws Throwable {
                this.f$0.m8843lambda$connectStream$7$iocobrowseStreamProtocol(session, map);
            }
        });
        this.stream.onMessage(PointerEventHelper.POINTER_TYPE_TOUCH, new CBORSocket.MessageListener() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda8
            @Override // io.cobrowse.CBORSocket.MessageListener
            public final void onMessage(Map map) throws Throwable {
                this.f$0.m8844lambda$connectStream$8$iocobrowseStreamProtocol(session, map);
            }
        });
        this.stream.onMessage("keypress", new CBORSocket.MessageListener() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda9
            @Override // io.cobrowse.CBORSocket.MessageListener
            public final void onMessage(Map map) throws Throwable {
                this.f$0.m8845lambda$connectStream$9$iocobrowseStreamProtocol(session, map);
            }
        });
        this.stream.onConnect(new Runnable() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8839lambda$connectStream$10$iocobrowseStreamProtocol();
            }
        });
        this.stream.onMessage(BaseJavaModule.METHOD_TYPE_SYNC, new CBORSocket.MessageListener() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda11
            @Override // io.cobrowse.CBORSocket.MessageListener
            public final void onMessage(Map map) {
                this.f$0.m8840lambda$connectStream$11$iocobrowseStreamProtocol(map);
            }
        });
        this.stream.onMessage("probe", new CBORSocket.MessageListener() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda12
            @Override // io.cobrowse.CBORSocket.MessageListener
            public final void onMessage(Map map) {
                this.f$0.m8841lambda$connectStream$12$iocobrowseStreamProtocol(map);
            }
        });
    }

    private void disconnectControl() {
        CBORSocket cBORSocket = this.control;
        if (cBORSocket != null) {
            cBORSocket.disconnect();
            this.control = null;
        }
    }

    private void disconnectStream() {
        CBORSocket cBORSocket = this.stream;
        if (cBORSocket != null) {
            cBORSocket.disconnect();
            this.stream = null;
        }
    }

    private Encoder encoderForDisplay(Display display) {
        Encoder h264Encoder = this.encoders.get(display.getDisplayId());
        String strPreferredEncoder = preferredEncoder(this.session.videoCodecs());
        if (h264Encoder == null || !h264Encoder.mimeType().equals(strPreferredEncoder)) {
            if (h264Encoder != null) {
                h264Encoder.destroy();
            }
            h264Encoder = strPreferredEncoder.equals("video/avc") ? new H264Encoder(this) : new JPEGEncoder(this);
            this.encoders.put(display.getDisplayId(), h264Encoder);
        }
        return h264Encoder;
    }

    static /* synthetic */ void lambda$socket$3(String str, Throwable th, Response response) {
        String str2 = "Socket error (" + str + ") " + th;
    }

    private String preferredEncoder(List<String> list) {
        return !H264Encoder.isSupported() ? ClipboardModule.MIMETYPE_JPEG : (list == null || list.isEmpty() || list.contains("video/avc")) ? "video/avc" : ClipboardModule.MIMETYPE_JPEG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sessionUpdateReceived, reason: merged with bridge method [inline-methods] */
    public void m8838lambda$connectControl$4$iocobrowseStreamProtocol(final Session session, final Map<String, Object> map) throws Throwable {
        Handler handler = this.handler;
        if (handler != null) {
            Object[] objArr = {new Runnable() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    session.updateResource(map);
                }
            }};
            Method method = Class.forName(Jg.Wd("Z{egXN]\u001bPP~-:C-)69", (short) (C1633zX.Xd() ^ (-23986)), (short) (C1633zX.Xd() ^ (-23117)))).getMethod(C1626yg.Ud("d-6,", (short) (C1607wl.Xd() ^ 10453), (short) (C1607wl.Xd() ^ 2411)), Class.forName(ZO.xd("\u007f{;X\"aQ\u0007y}k?2p*f\u000en", (short) (C1499aX.Xd() ^ (-20433)), (short) (C1499aX.Xd() ^ (-31878)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private CBORSocket socket(final Session session, final String str, final String str2) {
        CBORSocket cBORSocket = new CBORSocket(new CBORSocket.URLRequest() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda4
            @Override // io.cobrowse.CBORSocket.URLRequest
            public final Request create() {
                return this.f$0.m8848lambda$socket$2$iocobrowseStreamProtocol(session, str, str2);
            }
        });
        cBORSocket.onError(new CBORSocket.ErrorListener() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda5
            @Override // io.cobrowse.CBORSocket.ErrorListener
            public final void onError(Throwable th, Response response) {
                StreamProtocol.lambda$socket$3(str, th, response);
            }
        });
        return cBORSocket;
    }

    private void syncRequestReceived() {
        for (int i2 = 0; i2 < this.encoders.size(); i2++) {
            this.encoders.valueAt(i2).reset();
        }
        sendMessage(new StreamScreenStateMessage(ActivityWatcher.foregroundActivity(), getActivity() != null));
    }

    private void updateSockets(Session session) {
        if (session.field(ControlUrlField, String.class) == null || session.field(ControlTokenField, String.class) == null) {
            disconnectControl();
        } else {
            connectControl(session);
        }
        if (session.field(StreamUrlField, String.class) == null || session.field(StreamTokenField, String.class) == null) {
            disconnectStream();
        } else {
            connectStream(session);
        }
    }

    @Override // io.cobrowse.ActivityWatcher.Observer
    public void activityChanged(Activity activity, Activity activity2) {
        if (activity2 != null) {
            activity2.getWindow().getDecorView().getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
        if (activity != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().addOnWindowFocusChangeListener(this);
        }
        sendMessage(new StreamScreenStateMessage(activity, true));
    }

    @Override // io.cobrowse.SessionContextModule
    void destroy() throws Throwable {
        this.isDestroyed = true;
        Runnable runnable = new Runnable() { // from class: io.cobrowse.StreamProtocol$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8846lambda$destroy$1$iocobrowseStreamProtocol();
            }
        };
        Looper looperMyLooper = Looper.myLooper();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Ig.wd("^6:w,qPi\u0005\u0018L\u0015\n\b`vK", (short) (Od.Xd() ^ (-31848)))).getDeclaredMethod(EO.Od("I\u0015s&<\u0002\u001d4\u0007da:r", (short) (C1580rY.Xd() ^ (-22295))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                runnable.run();
            } else {
                Handler handler = this.handler;
                if (handler != null) {
                    short sXd = (short) (C1633zX.Xd() ^ (-3971));
                    int[] iArr = new int["4@5B>71y:=v\u0010(4)0(4".length()];
                    QB qb = new QB("4@5B>71y:=v\u0010(4)0(4");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i2));
                    Class<?>[] clsArr = new Class[1];
                    short sXd2 = (short) (OY.Xd() ^ 21344);
                    short sXd3 = (short) (OY.Xd() ^ 3118);
                    int[] iArr2 = new int["zr\ttB\u0002w\u0006\u007fGl\u0011\u000b\f\u007f\u0002\r\u0007".length()];
                    QB qb2 = new QB("zr\ttB\u0002w\u0006\u007fGl\u0011\u000b\f\u007f\u0002\r\u0007");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                        i3++;
                    }
                    clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                    Object[] objArr2 = {runnable};
                    Method method = cls.getMethod(C1561oA.od("\" ##", (short) (C1633zX.Xd() ^ (-12751))), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
            this.session.removeSessionListener(this);
            ActivityWatcher.removeActivityObserver(this);
            disconnectControl();
            disconnectStream();
            this.listeners.clear();
            for (int i4 = 0; i4 < this.encoders.size(); i4++) {
                this.encoders.valueAt(i4).destroy();
            }
            this.encoders.clear();
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX INFO: renamed from: lambda$agentEventReceived$14$io-cobrowse-StreamProtocol, reason: not valid java name */
    /* synthetic */ void m8837lambda$agentEventReceived$14$iocobrowseStreamProtocol(Session session, AgentEvent agentEvent) {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().agentEventReceived(session, agentEvent);
        }
    }

    /* JADX INFO: renamed from: lambda$connectStream$10$io-cobrowse-StreamProtocol, reason: not valid java name */
    /* synthetic */ void m8839lambda$connectStream$10$iocobrowseStreamProtocol() {
        sendMessage(new StreamScreenStateMessage(ActivityWatcher.foregroundActivity(), getActivity() != null));
    }

    /* JADX INFO: renamed from: lambda$connectStream$11$io-cobrowse-StreamProtocol, reason: not valid java name */
    /* synthetic */ void m8840lambda$connectStream$11$iocobrowseStreamProtocol(Map map) {
        syncRequestReceived();
    }

    /* JADX INFO: renamed from: lambda$connectStream$12$io-cobrowse-StreamProtocol, reason: not valid java name */
    /* synthetic */ void m8841lambda$connectStream$12$iocobrowseStreamProtocol(Map map) {
        sendMessage(new StreamAliveMessage(map));
    }

    /* JADX INFO: renamed from: lambda$connectStream$6$io-cobrowse-StreamProtocol, reason: not valid java name */
    /* synthetic */ void m8842lambda$connectStream$6$iocobrowseStreamProtocol(Session session, Map map) throws Throwable {
        try {
            agentEventReceived(session, new Drawing(map));
        } catch (SerializationError e2) {
            String str = "Error parsing drawing event: " + e2.getMessage();
        }
    }

    /* JADX INFO: renamed from: lambda$connectStream$7$io-cobrowse-StreamProtocol, reason: not valid java name */
    /* synthetic */ void m8843lambda$connectStream$7$iocobrowseStreamProtocol(Session session, Map map) throws Throwable {
        try {
            agentEventReceived(session, new Laser(map));
        } catch (SerializationError e2) {
            String str = "Error parsing laser event: " + e2.getMessage();
        }
    }

    /* JADX INFO: renamed from: lambda$connectStream$8$io-cobrowse-StreamProtocol, reason: not valid java name */
    /* synthetic */ void m8844lambda$connectStream$8$iocobrowseStreamProtocol(Session session, Map map) throws Throwable {
        try {
            agentEventReceived(session, new Touch((Map<String, Object>) map));
        } catch (SerializationError e2) {
            String str = "Error parsing touch event: " + e2.getMessage();
        }
    }

    /* JADX INFO: renamed from: lambda$connectStream$9$io-cobrowse-StreamProtocol, reason: not valid java name */
    /* synthetic */ void m8845lambda$connectStream$9$iocobrowseStreamProtocol(Session session, Map map) throws Throwable {
        try {
            agentEventReceived(session, new KeyEvent(map));
        } catch (SerializationError e2) {
            String str = "Error parsing keypress event: " + e2.getMessage();
        }
    }

    /* JADX INFO: renamed from: lambda$destroy$1$io-cobrowse-StreamProtocol, reason: not valid java name */
    /* synthetic */ void m8846lambda$destroy$1$iocobrowseStreamProtocol() {
        ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
        this.handler = null;
    }

    /* JADX INFO: renamed from: lambda$new$0$io-cobrowse-StreamProtocol, reason: not valid java name */
    /* synthetic */ void m8847lambda$new$0$iocobrowseStreamProtocol() {
        if (this.isDestroyed) {
            return;
        }
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
    }

    /* JADX INFO: renamed from: lambda$socket$2$io-cobrowse-StreamProtocol, reason: not valid java name */
    /* synthetic */ Request m8848lambda$socket$2$iocobrowseStreamProtocol(Session session, String str, String str2) {
        return CobrowseIO.request(this.application).url(SocketURL.resolve((String) session.field(str, String.class), CobrowseIO.instance().apiUrl())).header("Authorization", "Bearer " + ((String) session.field(str2, String.class))).build();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onBackground() {
        sendMessage(new StreamScreenStateMessage(ActivityWatcher.foregroundActivity(), false));
    }

    @Override // io.cobrowse.Encoder.Delegate
    public void onEncodedFrameData(Encoder encoder, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        SparseArray<Encoder> sparseArray = this.encoders;
        int iKeyAt = sparseArray.keyAt(sparseArray.indexOfValue(encoder));
        int i2 = frameId;
        frameId = i2 + 1;
        sendMessage(new StreamFrameMessage(iKeyAt, i2, bArr, encoder.mimeType()));
    }

    @Override // io.cobrowse.Encoder.Delegate
    public void onEncoderError(Encoder encoder, Error error) {
        String str = "Encoder error " + error;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onForeground() {
        sendMessage(new StreamScreenStateMessage(ActivityWatcher.foregroundActivity(), true));
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z2) {
        sendMessage(new StreamScreenStateMessage(ActivityWatcher.foregroundActivity(), true));
    }

    void registerStreamProtocolListener(Listener listener) {
        this.listeners.add(listener);
    }

    void removeStreamProtocolListener(Listener listener) {
        this.listeners.remove(listener);
    }

    boolean sendFrame(Display display, Frame frame) {
        CBORSocket cBORSocket = this.stream;
        if (cBORSocket == null || !cBORSocket.isConnected() || this.stream.queueSize() > 30000) {
            return false;
        }
        Encoder encoderEncoderForDisplay = encoderForDisplay(display);
        if (this.stream.messageLag() >= encoderEncoderForDisplay.maximumFramesInFlight()) {
            return false;
        }
        frame.setScale(this.session.scale(display));
        encoderEncoderForDisplay.encode(frame);
        return true;
    }

    void sendMessage(StreamMessage streamMessage) {
        CBORSocket cBORSocket = this.stream;
        if (cBORSocket == null) {
            return;
        }
        try {
            cBORSocket.send(streamMessage.getMessageKey(), streamMessage);
        } catch (IOException e2) {
            String.format("Failed to send \"%s\" message: %s", streamMessage.getMessageKey(), e2.getMessage());
        }
    }

    @Override // io.cobrowse.Session.Listener
    public void sessionDidEnd(Session session) throws Throwable {
        destroy();
    }

    @Override // io.cobrowse.Session.Listener
    public void sessionDidUpdate(Session session) {
        updateSockets(session);
    }
}
