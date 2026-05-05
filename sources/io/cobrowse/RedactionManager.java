package io.cobrowse;

import android.app.Activity;
import android.app.Application;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import io.cobrowse.ActivityWatcher;
import io.cobrowse.FrameLoop;
import io.cobrowse.Session;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class RedactionManager extends SessionContextModule implements Session.Listener, FrameLoop.Listener, ActivityWatcher.Observer {
    final Delegate delegate;
    private final ViewTreeObserver.OnWindowFocusChangeListener focusChangeListener;
    private final ViewTreeObserver.OnGlobalFocusChangeListener globalFocusChangeListener;
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener;
    private final HashSet<Activity> redactedActivities;
    private final Redaction redaction;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final WebViewTrackerManager webViewTrackerManager;

    interface Delegate {
        List<Selector> redactionSelectors();

        List<Selector> unredactionSelectors();
    }

    RedactionManager(Delegate delegate, Application application, Session session) {
        super(application, session);
        WebViewTrackerManager webViewTrackerManager = new WebViewTrackerManager();
        this.webViewTrackerManager = webViewTrackerManager;
        this.redaction = new Redaction(webViewTrackerManager, RedactionExternalLoader.load());
        this.redactedActivities = new HashSet<>();
        this.layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.cobrowse.RedactionManager$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f$0.m8832lambda$new$0$iocobrowseRedactionManager();
            }
        };
        this.focusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: io.cobrowse.RedactionManager$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z2) {
                this.f$0.m8833lambda$new$1$iocobrowseRedactionManager(z2);
            }
        };
        this.globalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: io.cobrowse.RedactionManager$$ExternalSyntheticLambda2
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                this.f$0.m8834lambda$new$2$iocobrowseRedactionManager(view, view2);
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: io.cobrowse.RedactionManager$$ExternalSyntheticLambda3
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f$0.m8835lambda$new$3$iocobrowseRedactionManager();
            }
        };
        this.delegate = delegate;
        String str = "Redaction initialising with activities " + ActivityWatcher.getActivities();
        Iterator<Activity> it = ActivityWatcher.getActivities().iterator();
        while (it.hasNext()) {
            watchActivity(it.next());
        }
        session.registerSessionListener(this);
        ActivityWatcher.registerActivityObserver(this);
        m8832lambda$new$0$iocobrowseRedactionManager();
    }

    private void addObservers(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this.layoutListener);
        viewTreeObserver.addOnWindowFocusChangeListener(this.focusChangeListener);
        viewTreeObserver.addOnGlobalFocusChangeListener(this.globalFocusChangeListener);
        viewTreeObserver.addOnScrollChangedListener(this.scrollChangedListener);
    }

    private void removeObservers(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(this.layoutListener);
        viewTreeObserver.removeOnWindowFocusChangeListener(this.focusChangeListener);
        viewTreeObserver.removeOnGlobalFocusChangeListener(this.globalFocusChangeListener);
        viewTreeObserver.removeOnScrollChangedListener(this.scrollChangedListener);
    }

    private void unwatchActivity(Activity activity) {
        if (activity != null && this.redactedActivities.contains(activity)) {
            String str = "Un-watching activity " + activity;
            this.redactedActivities.remove(activity);
            removeObservers(activity.getWindow().getDecorView().getViewTreeObserver());
            this.webViewTrackerManager.untrackActivity(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateRedaction, reason: merged with bridge method [inline-methods] */
    public void m8832lambda$new$0$iocobrowseRedactionManager() {
        HashSet hashSet = new HashSet(this.redactedActivities);
        for (Activity activity : ActivityWatcher.getActivities()) {
            watchActivity(activity);
            hashSet.remove(activity);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            unwatchActivity((Activity) it.next());
        }
        this.redaction.redact(this.redactedActivities);
        if (this.session.fullDevice().booleanValue()) {
            getRedaction().show();
        }
        if (!this.redactedActivities.containsAll(ActivityWatcher.getActivities())) {
            String str = "Some activities are not redacted " + this.redactedActivities + " tracked " + ActivityWatcher.getActivities();
        }
        if (ActivityWatcher.getActivities().containsAll(this.redactedActivities)) {
            return;
        }
        String str2 = "Some un-tracked activities are redacted " + this.redactedActivities + " tracked " + ActivityWatcher.getActivities();
    }

    private void watchActivity(Activity activity) {
        if (activity == null || this.redactedActivities.contains(activity)) {
            return;
        }
        String str = "Watching activity " + activity;
        this.redactedActivities.add(activity);
        ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
        removeObservers(viewTreeObserver);
        addObservers(viewTreeObserver);
    }

    @Override // io.cobrowse.ActivityWatcher.Observer
    public void activityChanged(Activity activity, Activity activity2) {
        String str = "Focused activity changed from " + activity2 + " to " + activity;
        m8832lambda$new$0$iocobrowseRedactionManager();
    }

    @Override // io.cobrowse.SessionContextModule
    void destroy() {
        String str = "Destroying RedactionManager for activities: " + this.redactedActivities;
        this.session.removeSessionListener(this);
        ActivityWatcher.removeActivityObserver(this);
        Iterator it = new HashSet(this.redactedActivities).iterator();
        while (it.hasNext()) {
            unwatchActivity((Activity) it.next());
        }
        this.redaction.unredactAll();
        this.webViewTrackerManager.destroy();
    }

    @Override // io.cobrowse.FrameLoop.Listener
    public void didCaptureFrame(Display display, Frame frame) {
        if (this.session.fullDevice().booleanValue()) {
            return;
        }
        getRedaction().hide();
    }

    Redaction getRedaction() {
        return this.redaction;
    }

    /* JADX INFO: renamed from: lambda$new$1$io-cobrowse-RedactionManager, reason: not valid java name */
    /* synthetic */ void m8833lambda$new$1$iocobrowseRedactionManager(boolean z2) {
        m8832lambda$new$0$iocobrowseRedactionManager();
    }

    /* JADX INFO: renamed from: lambda$new$2$io-cobrowse-RedactionManager, reason: not valid java name */
    /* synthetic */ void m8834lambda$new$2$iocobrowseRedactionManager(View view, View view2) {
        m8832lambda$new$0$iocobrowseRedactionManager();
    }

    /* JADX INFO: renamed from: lambda$new$3$io-cobrowse-RedactionManager, reason: not valid java name */
    /* synthetic */ void m8835lambda$new$3$iocobrowseRedactionManager() {
        if (this.session.fullDevice().booleanValue()) {
            m8832lambda$new$0$iocobrowseRedactionManager();
        }
    }

    @Override // io.cobrowse.Session.Listener
    public void sessionDidEnd(Session session) {
        this.redaction.unredactAll();
    }

    @Override // io.cobrowse.Session.Listener
    public void sessionDidUpdate(Session session) {
        this.redaction.setSelectors(new ArrayList<Selector>(session) { // from class: io.cobrowse.RedactionManager.1
            final /* synthetic */ Session val$session;

            {
                this.val$session = session;
                addAll(session.redactionSelectors());
                addAll(RedactionManager.this.delegate.redactionSelectors());
            }
        }, new ArrayList<Selector>(session) { // from class: io.cobrowse.RedactionManager.2
            final /* synthetic */ Session val$session;

            {
                this.val$session = session;
                addAll(session.unredactionSelectors());
                addAll(RedactionManager.this.delegate.unredactionSelectors());
            }
        });
        m8832lambda$new$0$iocobrowseRedactionManager();
    }

    @Override // io.cobrowse.FrameLoop.Listener
    public boolean willCaptureFrame(Display display) {
        m8832lambda$new$0$iocobrowseRedactionManager();
        if (!this.webViewTrackerManager.isSettled()) {
            return false;
        }
        getRedaction().show();
        return true;
    }
}
