package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
class TooltipCompatHandler implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static final long HOVER_HIDE_TIMEOUT_MS = 15000;
    private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000;
    private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500;
    private static final String TAG = "TooltipCompatHandler";
    private static TooltipCompatHandler sActiveHandler = null;
    private static TooltipCompatHandler sPendingHandler = null;
    private final View mAnchor;
    private int mAnchorX;
    private int mAnchorY;
    private boolean mForceNextChangeSignificant;
    private boolean mFromTouch;
    private final int mHoverSlop;
    private TooltipPopup mPopup;
    private final CharSequence mTooltipText;
    private final Runnable mShowRunnable = new Runnable() { // from class: androidx.appcompat.widget.TooltipCompatHandler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            this.f$0.m28lambda$new$0$androidxappcompatwidgetTooltipCompatHandler();
        }
    };
    private final Runnable mHideRunnable = new Runnable() { // from class: androidx.appcompat.widget.TooltipCompatHandler$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            this.f$0.hide();
        }
    };

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-appcompat-widget-TooltipCompatHandler, reason: not valid java name */
    /* synthetic */ void m28lambda$new$0$androidxappcompatwidgetTooltipCompatHandler() throws Throwable {
        show(false);
    }

    public static void setTooltipText(View view, CharSequence charSequence) throws Throwable {
        TooltipCompatHandler tooltipCompatHandler = sPendingHandler;
        if (tooltipCompatHandler != null && tooltipCompatHandler.mAnchor == view) {
            setPendingHandler(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            TooltipCompatHandler tooltipCompatHandler2 = sActiveHandler;
            if (tooltipCompatHandler2 != null && tooltipCompatHandler2.mAnchor == view) {
                tooltipCompatHandler2.hide();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new TooltipCompatHandler(view, charSequence);
    }

    private TooltipCompatHandler(View view, CharSequence charSequence) {
        this.mAnchor = view;
        this.mTooltipText = charSequence;
        this.mHoverSlop = ViewConfigurationCompat.getScaledHoverSlop(ViewConfiguration.get(view.getContext()));
        forceNextChangeSignificant();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Throwable {
        this.mAnchorX = view.getWidth() / 2;
        this.mAnchorY = view.getHeight() / 2;
        show(true);
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) throws Throwable {
        if (this.mPopup != null && this.mFromTouch) {
            return false;
        }
        Context context = this.mAnchor.getContext();
        Object[] objArr = {C1561oA.yd("]`adklc]mqo{y", (short) (C1607wl.Xd() ^ OlympusMakernoteDirectory.TAG_OLYMPUS_IMAGE_WIDTH))};
        Method method = Class.forName(C1561oA.Yd(")7.=;62|3@@G9CJ\u0005\u001bHHOAUR", (short) (OY.Xd() ^ 6346))).getMethod(Jg.Wd("`?7)\u007f\\d\u000e`g$\n5J\u0015J", (short) (Od.Xd() ^ (-23104)), (short) (Od.Xd() ^ (-28989))), Class.forName(Xg.qd("\u0012\n \fY\u0019\u000f\u001d\u0017^\u0005'&\u001e$\u001e", (short) (Od.Xd() ^ (-21380)), (short) (Od.Xd() ^ (-12567)))));
        try {
            method.setAccessible(true);
            AccessibilityManager accessibilityManager = (AccessibilityManager) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(ZO.xd("|G3@i\tUt\rz\u0001\u0006Y\u0015\u0011P@8RO\u0001l\n\u000f,kP@d;)$\u0018nQ~!02\u0019d,Xc\u0005\u0015h", (short) (C1607wl.Xd() ^ 24942), (short) (C1607wl.Xd() ^ 5982))).getMethod(C1626yg.Ud(";:6):er\\f", (short) (C1499aX.Xd() ^ (-14796)), (short) (C1499aX.Xd() ^ (-31543))), new Class[0]);
            try {
                method2.setAccessible(true);
                if (((Boolean) method2.invoke(accessibilityManager, objArr2)).booleanValue()) {
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(Ig.wd("u6\u001c\t\u001c9\u0016ECkc\u001a}1Qt\u001eH}I\bLwr~>\u000ep/Z~2D]l7Sjt\u000e[M\u0004\u0013\u001c05", (short) (C1580rY.Xd() ^ (-14374)))).getMethod(EO.Od("\u0014t\u0019\u0014\u0011TmaX4&\u000faR5\u0010klz\\\u0013O/$\u0017", (short) (C1633zX.Xd() ^ (-29068))), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        if (((Boolean) method3.invoke(accessibilityManager, objArr3)).booleanValue()) {
                            return false;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        forceNextChangeSignificant();
                        hide();
                    }
                } else if (this.mAnchor.isEnabled() && this.mPopup == null && updateAnchorPos(motionEvent)) {
                    setPendingHandler(this);
                }
                return false;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) throws Throwable {
        hide();
    }

    void show(boolean z2) throws Throwable {
        long longPressTimeout;
        long j2;
        long j3;
        if (this.mAnchor.isAttachedToWindow()) {
            setPendingHandler(null);
            TooltipCompatHandler tooltipCompatHandler = sActiveHandler;
            if (tooltipCompatHandler != null) {
                tooltipCompatHandler.hide();
            }
            sActiveHandler = this;
            this.mFromTouch = z2;
            TooltipPopup tooltipPopup = new TooltipPopup(this.mAnchor.getContext());
            this.mPopup = tooltipPopup;
            tooltipPopup.show(this.mAnchor, this.mAnchorX, this.mAnchorY, this.mFromTouch, this.mTooltipText);
            this.mAnchor.addOnAttachStateChangeListener(this);
            if (this.mFromTouch) {
                j3 = LONG_CLICK_HIDE_TIMEOUT_MS;
            } else {
                int windowSystemUiVisibility = ViewCompat.getWindowSystemUiVisibility(this.mAnchor);
                if ((windowSystemUiVisibility + 1) - (windowSystemUiVisibility | 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            this.mAnchor.removeCallbacks(this.mHideRunnable);
            this.mAnchor.postDelayed(this.mHideRunnable, j3);
        }
    }

    void hide() throws Throwable {
        if (sActiveHandler == this) {
            sActiveHandler = null;
            TooltipPopup tooltipPopup = this.mPopup;
            if (tooltipPopup != null) {
                tooltipPopup.hide();
                this.mPopup = null;
                forceNextChangeSignificant();
                this.mAnchor.removeOnAttachStateChangeListener(this);
            }
        }
        if (sPendingHandler == this) {
            setPendingHandler(null);
        }
        this.mAnchor.removeCallbacks(this.mHideRunnable);
    }

    private static void setPendingHandler(TooltipCompatHandler tooltipCompatHandler) {
        TooltipCompatHandler tooltipCompatHandler2 = sPendingHandler;
        if (tooltipCompatHandler2 != null) {
            tooltipCompatHandler2.cancelPendingShow();
        }
        sPendingHandler = tooltipCompatHandler;
        if (tooltipCompatHandler != null) {
            tooltipCompatHandler.scheduleShow();
        }
    }

    private void scheduleShow() {
        this.mAnchor.postDelayed(this.mShowRunnable, ViewConfiguration.getLongPressTimeout());
    }

    private void cancelPendingShow() {
        this.mAnchor.removeCallbacks(this.mShowRunnable);
    }

    private boolean updateAnchorPos(MotionEvent motionEvent) {
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (!this.mForceNextChangeSignificant && Math.abs(x2 - this.mAnchorX) <= this.mHoverSlop && Math.abs(y2 - this.mAnchorY) <= this.mHoverSlop) {
            return false;
        }
        this.mAnchorX = x2;
        this.mAnchorY = y2;
        this.mForceNextChangeSignificant = false;
        return true;
    }

    private void forceNextChangeSignificant() {
        this.mForceNextChangeSignificant = true;
    }
}
