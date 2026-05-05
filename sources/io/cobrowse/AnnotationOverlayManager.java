package io.cobrowse;

import android.app.Activity;
import android.app.Application;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewTreeObserver;
import io.cobrowse.ActivityWatcher;
import io.cobrowse.Session;
import io.cobrowse.StreamProtocol;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes3.dex */
final class AnnotationOverlayManager extends SessionContextModule implements ActivityWatcher.Observer, Session.Listener, StreamProtocol.Listener, ViewTreeObserver.OnWindowFocusChangeListener, DisplayManager.DisplayListener {
    private Activity activity;
    private int currentDisplayHeight;
    private int currentDisplayId;
    private int currentDisplayWidth;
    private AnnotationOverlay overlay;

    AnnotationOverlayManager(Application application, Session session) throws Throwable {
        super(application, session);
        session.registerSessionListener(this);
        ActivityWatcher.registerActivityObserver(this);
        DisplayManager displayManager = getDisplayManager();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.Zd(")G^5Cey\\^{f\u0016J\u00135R)", (short) (Od.Xd() ^ (-24975)), (short) (Od.Xd() ^ (-4657)))).getDeclaredMethod(C1561oA.Xd("lk{UjsyX|}\u007fu\u0004", (short) (Od.Xd() ^ (-14455))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            displayManager.registerDisplayListener(this, new Handler((Looper) declaredMethod.invoke(null, objArr)));
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            DisplayMetrics metrics = DisplayScaling.getMetrics(defaultDisplay);
            this.currentDisplayId = defaultDisplay.getDisplayId();
            this.currentDisplayWidth = metrics.widthPixels;
            this.currentDisplayHeight = metrics.heightPixels;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void handleAppOverlayEvent(AnnotationOverlay annotationOverlay, AgentEvent agentEvent, String[] strArr) {
        if (agentEvent instanceof Drawing) {
            if (SessionCapabilities.isForbidden(strArr, "drawing")) {
                return;
            }
            annotationOverlay.updateDrawing((Drawing) agentEvent);
        } else if (agentEvent instanceof Laser) {
            if (SessionCapabilities.isForbidden(strArr, "laser")) {
                return;
            }
            annotationOverlay.updateLaser((Laser) agentEvent);
        } else {
            if ((agentEvent instanceof Touch) && !SessionCapabilities.isForbidden(strArr, "pointer")) {
                annotationOverlay.updateTouches((Touch) agentEvent);
            }
        }
    }

    private static void handleFullDeviceOverlayEvent(Application application, AgentEvent agentEvent, String[] strArr) {
        if (agentEvent instanceof Laser) {
            if (SessionCapabilities.isForbidden(strArr, "laser")) {
                return;
            }
            FullDeviceOverlayAccessibility.inject(application, (Laser) agentEvent);
        } else {
            if ((agentEvent instanceof Drawing) && !SessionCapabilities.isForbidden(strArr, "drawing")) {
                FullDeviceOverlayAccessibility.inject(application, (Drawing) agentEvent);
            }
        }
    }

    private synchronized void hide() {
        AnnotationOverlay annotationOverlay = this.overlay;
        if (annotationOverlay != null) {
            annotationOverlay.hide();
            this.overlay = null;
        }
        setActivity(null);
    }

    private void setActivity(Activity activity) {
        Activity activity2 = this.activity;
        if (activity2 != null) {
            activity2.getWindow().getDecorView().getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
        this.activity = activity;
        if (activity != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().addOnWindowFocusChangeListener(this);
        }
    }

    private synchronized void show(Activity activity) {
        if (this.session.isActive()) {
            if (this.activity != activity) {
                hide();
                setActivity(activity);
                this.overlay = new AnnotationOverlay(activity);
            }
            AnnotationOverlay annotationOverlay = this.overlay;
            if (annotationOverlay != null) {
                annotationOverlay.show();
            }
        }
    }

    @Override // io.cobrowse.ActivityWatcher.Observer
    public void activityChanged(Activity activity, Activity activity2) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed() || activity.isChangingConfigurations()) {
            hide();
        } else {
            show(activity);
        }
    }

    @Override // io.cobrowse.StreamProtocol.Listener
    public void agentEventReceived(Session session, AgentEvent agentEvent) {
        AnnotationOverlay annotationOverlay = this.overlay;
        if (annotationOverlay != null) {
            handleAppOverlayEvent(annotationOverlay, agentEvent, session.capabilities());
        }
        handleFullDeviceOverlayEvent(getApplication(), agentEvent, session.capabilities());
    }

    @Override // io.cobrowse.SessionContextModule
    void destroy() {
        hide();
        this.session.removeSessionListener(this);
        ActivityWatcher.removeActivityObserver(this);
        getDisplayManager().unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i2) {
        Display display = getDisplayManager().getDisplay(i2);
        if (display == null) {
            return;
        }
        DisplayMetrics metrics = DisplayScaling.getMetrics(display);
        if (this.currentDisplayId == i2 && this.currentDisplayWidth == metrics.widthPixels && this.currentDisplayHeight == metrics.heightPixels) {
            return;
        }
        this.currentDisplayId = i2;
        this.currentDisplayWidth = metrics.widthPixels;
        this.currentDisplayHeight = metrics.heightPixels;
        AnnotationOverlay annotationOverlay = this.overlay;
        if (annotationOverlay != null) {
            annotationOverlay.hide();
            this.overlay.show();
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i2) {
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z2) {
        Activity activity = this.activity;
        hide();
        if (activity != null) {
            show(activity);
        }
    }

    @Override // io.cobrowse.Session.Listener
    public void sessionDidEnd(Session session) {
        FullDeviceOverlayAccessibility.notifySessionStateChanged(getApplication(), session);
        hide();
    }

    @Override // io.cobrowse.Session.Listener
    public void sessionDidUpdate(Session session) {
        FullDeviceOverlayAccessibility.notifySessionStateChanged(getApplication(), session);
        if (getActivity() != null) {
            show(getActivity());
        }
    }
}
