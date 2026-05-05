package io.cobrowse;

import android.app.Application;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowId;
import androidx.core.util.Pair;
import io.cobrowse.CobrowseIO;
import io.cobrowse.RedactionManager;
import io.cobrowse.StreamProtocol;

/* JADX INFO: loaded from: classes3.dex */
final class SessionContext extends SessionContextModule implements StreamProtocol.Listener {
    private final ControlInjector control;
    private final FrameLoopManager frames;
    private final AnnotationOverlayManager overlay;
    private final RedactionManager redaction;
    private final StreamProtocol stream;
    private final SessionUIManager ui;

    interface Delegate extends RedactionManager.Delegate {
    }

    SessionContext(Delegate delegate, Application application, Session session) {
        super(application, session);
        StreamProtocol streamProtocol = new StreamProtocol(application, session);
        this.stream = streamProtocol;
        FrameLoopManager frameLoopManager = new FrameLoopManager(application, streamProtocol);
        this.frames = frameLoopManager;
        this.ui = new SessionUIManager(application, session);
        RedactionManager redactionManager = new RedactionManager(delegate, application, session);
        this.redaction = redactionManager;
        frameLoopManager.registerFrameListener(redactionManager);
        AnnotationOverlayManager annotationOverlayManager = new AnnotationOverlayManager(application, session);
        this.overlay = annotationOverlayManager;
        streamProtocol.registerStreamProtocolListener(annotationOverlayManager);
        this.control = new ControlInjector(application, session);
        streamProtocol.registerStreamProtocolListener(this);
    }

    private boolean shouldAllowRemoteKeyEvent(View view) {
        return (this.redaction.getRedaction().isRedacted(view) || this.redaction.getRedaction().isRedactionExternalFocused()) ? false : true;
    }

    private boolean shouldAllowRemoteTouch(View view, PointF pointF) {
        for (View view2 : this.redaction.getRedaction().getRedactions()) {
            if (view == view2.getRootView()) {
                Rect rect = new Rect();
                if (view2.getGlobalVisibleRect(rect) && rect.contains((int) pointF.x, (int) pointF.y)) {
                    return false;
                }
            }
        }
        for (Pair<Rect, WindowId> pair : this.redaction.getRedaction().getRedactionsExternal()) {
            if (view != null && pair.second != null && pair.second.equals(view.getWindowId()) && pointF != null && pair.first != null && pair.first.contains((int) pointF.x, (int) pointF.y)) {
                return false;
            }
        }
        return true;
    }

    @Override // io.cobrowse.StreamProtocol.Listener
    public void agentEventReceived(Session session, AgentEvent agentEvent) throws Exception {
        Display display;
        if (session.allowRemoteControl() && (display = getDisplay(agentEvent.display)) != null) {
            View focused = Windows.getFocused(display);
            CobrowseIO.RemoteControlDelegate remoteControlDelegate = (CobrowseIO.RemoteControlDelegate) CobrowseIO.instance().getDelegate(CobrowseIO.RemoteControlDelegate.class);
            if (agentEvent instanceof Touch) {
                Touch touchScaledFor = ((Touch) agentEvent).scaledFor(display);
                if (!shouldAllowRemoteTouch(focused, touchScaledFor.position)) {
                    if (touchScaledFor.isMove()) {
                        return;
                    }
                    String str = "Blocking remote control for " + focused;
                    return;
                } else {
                    if (SessionCapabilities.isForbidden(session.capabilities(), "pointer")) {
                        return;
                    }
                    if (remoteControlDelegate != null && !remoteControlDelegate.shouldAllowTouch(focused, touchScaledFor, session)) {
                        return;
                    } else {
                        this.control.inject(focused, touchScaledFor);
                    }
                }
            }
            if (agentEvent instanceof KeyEvent) {
                View viewFindFocus = focused != null ? focused.findFocus() : null;
                if (viewFindFocus == null) {
                    viewFindFocus = focused;
                }
                if (!shouldAllowRemoteKeyEvent(viewFindFocus)) {
                    String str2 = "Blocking remote key events for " + viewFindFocus;
                } else {
                    if (SessionCapabilities.isForbidden(session.capabilities(), "keypress")) {
                        return;
                    }
                    if (remoteControlDelegate == null || remoteControlDelegate.shouldAllowKeyEvent(viewFindFocus, (KeyEvent) agentEvent, session)) {
                        this.control.inject(focused, (KeyEvent) agentEvent);
                    }
                }
            }
        }
    }

    @Override // io.cobrowse.SessionContextModule
    void destroy() {
        this.frames.removeFrameListener(this.redaction);
        this.stream.removeStreamProtocolListener(this.overlay);
        this.stream.removeStreamProtocolListener(this);
        this.stream.destroy();
        this.frames.destroy();
        this.redaction.destroy();
        this.overlay.destroy();
        this.control.destroy();
        this.ui.destroy();
        this.session.destroy();
    }
}
