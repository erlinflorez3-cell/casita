package io.cobrowse;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.lifecycle.LifecycleObserver;
import com.dynatrace.android.agent.Global;
import io.cobrowse.ActivityWatcher;
import io.cobrowse.CobrowseIO;
import io.cobrowse.Session;
import io.cobrowse.ui.RemoteControlConsentDialogFragment;
import io.cobrowse.ui.SessionConsentDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
final class SessionUIManager extends SessionContextModule implements Session.Listener, ActivityWatcher.Observer, LifecycleObserver {
    private View[] controls;
    private boolean handleSessionCalled;
    private RemoteControlConsentDialogFragment remoteControlRequest;
    private SessionConsentDialogFragment sessionRequest;
    private final ViewTreeObserver.OnWindowFocusChangeListener windowFocus;

    SessionUIManager(Application application, Session session) {
        super(application, session);
        this.windowFocus = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: io.cobrowse.SessionUIManager$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z2) throws Exception {
                this.f$0.m8836lambda$new$1$iocobrowseSessionUIManager(z2);
            }
        };
        session.registerSessionListener(this);
        ActivityWatcher.registerActivityObserver(this);
    }

    private View[] createDefaultControls(Activity activity) {
        return activity.isInMultiWindowMode() ? (Build.VERSION.SDK_INT < 30 || activity.getWindowManager().getCurrentWindowMetrics().getBounds().top != 0) ? createDefaultControlsMultiWindow(activity) : createDefaultControlsFullScreen(activity) : createDefaultControlsFullScreen(activity);
    }

    private static View[] createDefaultControlsFullScreen(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        TextView textView = new TextView(activity);
        textView.setBackgroundColor(SupportMenu.CATEGORY_MASK);
        textView.setTextAlignment(4);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, rect.top));
        textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: io.cobrowse.SessionUIManager$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                SessionUIManager.lambda$createDefaultControlsFullScreen$0(view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
        return new View[]{textView};
    }

    private static View[] createDefaultControlsMultiWindow(Activity activity) {
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(new Rect());
        int i2 = (int) (activity.getResources().getDisplayMetrics().density * 6.0f);
        View textView = new TextView(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, -1);
        layoutParams.gravity = 3;
        textView.setBackgroundColor(SupportMenu.CATEGORY_MASK);
        textView.setLayoutParams(layoutParams);
        View textView2 = new TextView(activity);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i2);
        layoutParams2.gravity = 48;
        textView2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
        textView2.setLayoutParams(layoutParams2);
        View textView3 = new TextView(activity);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i2, -1);
        layoutParams3.gravity = 5;
        textView3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
        textView3.setLayoutParams(layoutParams3);
        View textView4 = new TextView(activity);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, i2);
        layoutParams4.gravity = 80;
        textView4.setBackgroundColor(SupportMenu.CATEGORY_MASK);
        textView4.setLayoutParams(layoutParams4);
        return new View[]{textView, textView2, textView3, textView4};
    }

    private ViewGroup getControlsContainer() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.getWindow().getDecorView();
    }

    private void hideControls(Activity activity, Session session) throws Exception {
        if (!CobrowseService.needMediaProjectionPermissionBeforeStart()) {
            CobrowseService.setBackground();
        }
        CobrowseIO.SessionControlsDelegate sessionControlsDelegate = (CobrowseIO.SessionControlsDelegate) CobrowseIO.instance().getDelegate(CobrowseIO.SessionControlsDelegate.class);
        if (sessionControlsDelegate != null) {
            sessionControlsDelegate.hideSessionControls(activity, session);
        }
        hideDefaultControls();
    }

    private void hideDefaultControls() {
        View[] viewArr = this.controls;
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        this.controls = null;
    }

    private void hideDefaultRemoteControlConsent() {
        RemoteControlConsentDialogFragment remoteControlConsentDialogFragment = this.remoteControlRequest;
        if (remoteControlConsentDialogFragment != null) {
            if (remoteControlConsentDialogFragment.isAdded()) {
                this.remoteControlRequest.dismiss();
            }
            this.remoteControlRequest = null;
        }
    }

    private void hideDefaultSessionConsent() {
        SessionConsentDialogFragment sessionConsentDialogFragment = this.sessionRequest;
        if (sessionConsentDialogFragment != null) {
            if (sessionConsentDialogFragment.isAdded()) {
                this.sessionRequest.dismiss();
            }
            this.sessionRequest = null;
        }
    }

    static /* synthetic */ void lambda$createDefaultControlsFullScreen$0(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Activity activity = (Activity) view.getContext();
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, rect.top));
    }

    private static void setDefaultIndicatorLayoutParams(View view, Activity activity) {
        int i2;
        int i3;
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            i2 = rect.top - currentWindowMetrics.getBounds().top;
            i3 = currentWindowMetrics.getBounds().right - currentWindowMetrics.getBounds().left;
            String str = "rectangle.top: " + rect.top + "; cwm.getBounds().top: " + currentWindowMetrics.getBounds().top + Global.SEMICOLON;
        } else {
            i2 = rect.top;
            i3 = -1;
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(i3, i2));
    }

    private void showControls(Activity activity, Session session) throws Exception {
        if (!CobrowseService.needMediaProjectionPermissionBeforeStart()) {
            CobrowseService.setForeground();
        }
        CobrowseIO.SessionControlsDelegate sessionControlsDelegate = (CobrowseIO.SessionControlsDelegate) CobrowseIO.instance().getDelegate(CobrowseIO.SessionControlsDelegate.class);
        if (sessionControlsDelegate != null) {
            sessionControlsDelegate.showSessionControls(activity, session);
        } else if (activity != null) {
            showDefaultControls(activity);
        }
    }

    private void showDefaultControls(Activity activity) {
        hideDefaultControls();
        this.controls = createDefaultControls(activity);
        ViewGroup controlsContainer = getControlsContainer();
        if (controlsContainer != null) {
            for (View view : this.controls) {
                controlsContainer.addView(view);
                view.bringToFront();
            }
        }
    }

    private void showRemoteControlConsent(Activity activity, Session session) throws Exception {
        CobrowseIO.RemoteControlRequestDelegate remoteControlRequestDelegate = (CobrowseIO.RemoteControlRequestDelegate) CobrowseIO.instance().getDelegate(CobrowseIO.RemoteControlRequestDelegate.class);
        if (remoteControlRequestDelegate != null) {
            remoteControlRequestDelegate.handleRemoteControlRequest(activity, session);
        } else if (this.remoteControlRequest == null) {
            RemoteControlConsentDialogFragment remoteControlConsentDialogFragment = new RemoteControlConsentDialogFragment();
            this.remoteControlRequest = remoteControlConsentDialogFragment;
            remoteControlConsentDialogFragment.show(activity);
        }
    }

    private void showSessionConsent(Activity activity, Session session) throws Exception {
        CobrowseIO.SessionRequestDelegate sessionRequestDelegate = (CobrowseIO.SessionRequestDelegate) CobrowseIO.instance().getDelegate(CobrowseIO.SessionRequestDelegate.class);
        if (sessionRequestDelegate != null) {
            if (activity == null) {
                return;
            }
            if (!this.handleSessionCalled) {
                sessionRequestDelegate.handleSessionRequest(activity, session);
            }
            this.handleSessionCalled = true;
            return;
        }
        if (activity == null) {
            CobrowseIO.instance().launchApp();
        } else if (this.sessionRequest == null) {
            SessionConsentDialogFragment sessionConsentDialogFragment = new SessionConsentDialogFragment();
            this.sessionRequest = sessionConsentDialogFragment;
            sessionConsentDialogFragment.show(activity);
        }
    }

    private void updateFullDeviceConsent(Activity activity, Session session) throws Throwable {
        if (session.isEnded() || session.fullDeviceState() != Session.FullDeviceState.Requested) {
            return;
        }
        CobrowseIO.FullDeviceRequestDelegate fullDeviceRequestDelegate = (CobrowseIO.FullDeviceRequestDelegate) CobrowseIO.instance().getDelegate(CobrowseIO.FullDeviceRequestDelegate.class);
        if (fullDeviceRequestDelegate == null || activity == null) {
            session.setFullDeviceState(Session.FullDeviceState.On, null);
        } else {
            fullDeviceRequestDelegate.handleFullDeviceRequest(activity, session);
        }
    }

    private void updateRemoteControlConsent(Session session) throws Exception {
        if (session.isEnded() || session.remoteControl() != Session.RemoteControlState.Requested) {
            hideDefaultRemoteControlConsent();
        } else if (getActivity() != null) {
            showRemoteControlConsent(getActivity(), session);
        }
    }

    private void updateSessionConsent(Session session) throws Exception {
        if (session.isAuthorizing()) {
            showSessionConsent(getActivity(), session);
        } else {
            hideDefaultSessionConsent();
        }
    }

    private void updateSessionControls(Activity activity, Session session) throws Exception {
        if (session.isActive()) {
            showControls(activity, session);
        } else {
            hideControls(activity, session);
        }
    }

    @Override // io.cobrowse.ActivityWatcher.Observer
    public void activityChanged(Activity activity, Activity activity2) throws Exception {
        if (activity != null && activity2 == null && !CobrowseService.needMediaProjectionPermissionBeforeStart()) {
            if (this.session.isActive()) {
                CobrowseService.setForeground();
            } else {
                CobrowseService.setBackground();
            }
        }
        updateSessionControls(activity, this.session);
        updateSessionConsent(this.session);
        updateRemoteControlConsent(this.session);
        if (activity2 != null) {
            activity2.getWindow().getDecorView().getViewTreeObserver().removeOnWindowFocusChangeListener(this.windowFocus);
        }
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            viewTreeObserver.removeOnWindowFocusChangeListener(this.windowFocus);
            viewTreeObserver.addOnWindowFocusChangeListener(this.windowFocus);
        }
    }

    @Override // io.cobrowse.SessionContextModule
    void destroy() throws Exception {
        hideControls(getActivity(), this.session);
        if (getActivity() != null) {
            getActivity().getWindow().getDecorView().getViewTreeObserver().removeOnWindowFocusChangeListener(this.windowFocus);
        }
        this.session.removeSessionListener(this);
        sessionDidEnd(this.session);
        ActivityWatcher.removeActivityObserver(this);
    }

    /* JADX INFO: renamed from: lambda$new$1$io-cobrowse-SessionUIManager, reason: not valid java name */
    /* synthetic */ void m8836lambda$new$1$iocobrowseSessionUIManager(boolean z2) throws Exception {
        updateSessionControls(getActivity(), this.session);
    }

    @Override // io.cobrowse.Session.Listener
    public void sessionDidEnd(Session session) {
        hideDefaultSessionConsent();
        hideDefaultRemoteControlConsent();
    }

    @Override // io.cobrowse.Session.Listener
    public void sessionDidUpdate(Session session) throws Exception {
        updateSessionConsent(session);
        updateRemoteControlConsent(session);
        updateFullDeviceConsent(getActivity(), session);
        updateSessionControls(getActivity(), session);
    }
}
