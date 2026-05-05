package io.cobrowse;

import android.app.Activity;
import android.app.Application;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Display;
import io.cobrowse.ActivityWatcher;
import io.cobrowse.FrameLoop;
import io.cobrowse.FullDeviceFrameSource;
import io.cobrowse.Session;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
final class FrameLoopManager extends SessionContextModule implements Session.Listener, DisplayManager.DisplayListener, FrameLoop.Delegate, FullDeviceFrameSource.Delegate, ActivityWatcher.Observer {
    private final HashSet<FrameLoop.Listener> frameListeners;
    private final SparseArray<FrameLoop> loops;
    private final StreamProtocol stream;
    private FullDeviceFrameSource systemCaptureSource;
    private final ViewRenderingFrameSource viewRenderSource;
    private FullDeviceFrameSource.PermissionRequest waitingToShow;

    FrameLoopManager(Application application, StreamProtocol streamProtocol) throws Throwable {
        super(application, streamProtocol.session);
        this.frameListeners = new HashSet<>();
        this.loops = new SparseArray<>();
        this.stream = streamProtocol;
        this.session.registerSessionListener(this);
        DisplayManager displayManager = getDisplayManager();
        Class<?> cls = Class.forName(C1561oA.Yd("LZQ`^YU bg#Bfgi_m", (short) (C1633zX.Xd() ^ (-16921))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 21518);
        short sXd2 = (short) (C1607wl.Xd() ^ 24868);
        int[] iArr = new int["feuOdmsRvwyo}".length()];
        QB qb = new QB("feuOdmsRvwyo}");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            displayManager.registerDisplayListener(this, new Handler((Looper) declaredMethod.invoke(null, objArr)));
            ActivityWatcher.registerActivityObserver(this);
            this.viewRenderSource = new ViewRenderingFrameSource();
            this.systemCaptureSource = new FullDeviceFrameSource(application, this);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private FrameLoop[] allLoops() {
        FrameLoop[] frameLoopArr = new FrameLoop[this.loops.size()];
        for (int i2 = 0; i2 < this.loops.size(); i2++) {
            frameLoopArr[i2] = this.loops.get(this.loops.keyAt(i2));
        }
        return frameLoopArr;
    }

    private FrameLoop.Source currentSource() {
        FullDeviceFrameSource fullDeviceFrameSource;
        return (this.session.fullDeviceState() != Session.FullDeviceState.On || (fullDeviceFrameSource = this.systemCaptureSource) == null) ? this.viewRenderSource : fullDeviceFrameSource;
    }

    private void startLoop(Display display) {
        if (!display.getName().contains("cobrowse") && this.loops.get(display.getDisplayId()) == null) {
            FrameLoop frameLoop = new FrameLoop(display, this);
            frameLoop.start(currentSource());
            this.loops.put(display.getDisplayId(), frameLoop);
        }
    }

    @Override // io.cobrowse.ActivityWatcher.Observer
    public void activityChanged(Activity activity, Activity activity2) throws Exception {
        FullDeviceFrameSource.PermissionRequest permissionRequest = this.waitingToShow;
        if (permissionRequest == null || activity == null) {
            return;
        }
        permissionRequest.show(activity);
        this.waitingToShow = null;
    }

    @Override // io.cobrowse.SessionContextModule
    void destroy() throws Exception {
        this.session.removeSessionListener(this);
        getDisplayManager().unregisterDisplayListener(this);
        ActivityWatcher.removeActivityObserver(this);
        for (FrameLoop frameLoop : allLoops()) {
            frameLoop.stop();
        }
        this.loops.clear();
        this.frameListeners.clear();
        FullDeviceFrameSource.PermissionRequest permissionRequest = this.waitingToShow;
        if (permissionRequest != null) {
            permissionRequest.cancel();
            this.waitingToShow = null;
        }
    }

    @Override // io.cobrowse.FrameLoop.Listener
    public void didCaptureFrame(Display display, Frame frame) {
        Iterator<FrameLoop.Listener> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            it.next().didCaptureFrame(display, frame);
        }
    }

    @Override // io.cobrowse.FullDeviceFrameSource.Delegate
    public void fullDeviceCaptureRejected() throws Throwable {
        this.session.setFullDeviceState(Session.FullDeviceState.Rejected, null);
    }

    @Override // io.cobrowse.FullDeviceFrameSource.Delegate
    public void fullDeviceCaptureStarted() throws Throwable {
        this.session.setFullDeviceState(Session.FullDeviceState.On, null);
    }

    @Override // io.cobrowse.FullDeviceFrameSource.Delegate
    public void fullDeviceCaptureStopped() throws Throwable {
        this.session.setFullDeviceState(Session.FullDeviceState.Off, null);
        this.session.toggleCapabilitiesForFullDeviceState(true);
        this.session.update(new HashMap(), null);
    }

    @Override // io.cobrowse.FrameLoop.Delegate
    public void handleFrame(Display display, Frame frame) {
        this.stream.sendFrame(display, frame);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i2) {
        Display display = getDisplayManager().getDisplay(i2);
        if (!this.session.isActive() || display == null) {
            return;
        }
        startLoop(display);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i2) {
        FullDeviceFrameSource fullDeviceFrameSource;
        Display display = getDisplayManager().getDisplay(i2);
        if (display == null || (fullDeviceFrameSource = this.systemCaptureSource) == null) {
            return;
        }
        fullDeviceFrameSource.restart(display);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i2) {
        if (this.loops.get(i2) != null) {
            this.loops.get(i2).stop();
            this.loops.remove(i2);
        }
    }

    void registerFrameListener(FrameLoop.Listener listener) {
        this.frameListeners.add(listener);
    }

    void removeFrameListener(FrameLoop.Listener listener) {
        this.frameListeners.remove(listener);
    }

    @Override // io.cobrowse.FullDeviceFrameSource.Delegate
    public void requestFullDevicePermission(FullDeviceFrameSource.PermissionRequest permissionRequest) throws Exception {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            permissionRequest.show(activity);
            return;
        }
        if (CobrowseIO.instance().launchPermissionActivity()) {
            this.waitingToShow = permissionRequest;
        } else if (CobrowseIO.instance().launchApp()) {
            this.waitingToShow = permissionRequest;
        } else {
            permissionRequest.cancel();
        }
    }

    @Override // io.cobrowse.Session.Listener
    public void sessionDidEnd(Session session) throws Exception {
        destroy();
    }

    @Override // io.cobrowse.Session.Listener
    public void sessionDidUpdate(Session session) {
        if (session.isActive()) {
            for (FrameLoop frameLoop : allLoops()) {
                frameLoop.setFrameSource(currentSource());
            }
            for (Display display : getDisplayManager().getDisplays()) {
                startLoop(display);
            }
        }
    }

    @Override // io.cobrowse.FrameLoop.Listener
    public boolean willCaptureFrame(Display display) {
        Iterator<FrameLoop.Listener> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (!it.next().willCaptureFrame(display)) {
                return false;
            }
        }
        return true;
    }
}
