package io.cobrowse;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import io.cobrowse.ActivityWatcher;
import io.cobrowse.FrameLoop;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class ViewRenderingFrameSource implements ActivityWatcher.Observer, FrameLoop.Source {
    private static final int CAPTURE_RESULT_FAIL = 2;
    private static final int CAPTURE_RESULT_OK = 0;
    private static final int CAPTURE_RESULT_PARTIAL = 1;
    private Frame mostRecent;
    private Bitmap previousBitmap;
    private long renderingForScreenshot;
    private long suppressUntil;
    private boolean updateScheduled;
    private Bitmap writableBitmap;
    private final HashSet<ViewTreeObserver> watchedWindows = new HashSet<>();
    private final SurfaceCapture surfaceCapture = new SurfaceCapture();
    private final ViewTreeObserver.OnDrawListener changeListener = new ViewTreeObserver.OnDrawListener() { // from class: io.cobrowse.ViewRenderingFrameSource.1
        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            if (ViewRenderingFrameSource.this.isProbablyScreenshotRender()) {
                return;
            }
            ViewRenderingFrameSource.this.suppressFor(0L);
            ViewRenderingFrameSource.this.renderingForScreenshot = 0L;
        }
    };
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.cobrowse.ViewRenderingFrameSource.2
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ViewRenderingFrameSource.this.isProbablyScreenshotRender()) {
                return;
            }
            ViewRenderingFrameSource.this.suppressFor(0L);
            ViewRenderingFrameSource.this.renderingForScreenshot = 0L;
        }
    };
    private final ViewTreeObserver.OnWindowFocusChangeListener windowListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: io.cobrowse.ViewRenderingFrameSource$$ExternalSyntheticLambda0
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z2) {
            this.f$0.m8851lambda$new$0$iocobrowseViewRenderingFrameSource(z2);
        }
    };

    ViewRenderingFrameSource() {
    }

    private static int captureView(View view, Canvas canvas) {
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return 0;
        }
        int i2 = 2;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        canvas.save();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.flags;
        if ((i3 + 2) - (i3 | 2) != 0) {
            Paint paint = new Paint();
            paint.setColor(ViewCompat.MEASURED_STATE_MASK);
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha((int) (layoutParams.dimAmount * 255.0f));
            canvas.drawPaint(paint);
        }
        canvas.translate(iArr[0], iArr[1]);
        try {
            view.draw(canvas);
            canvas.restore();
            i2 = 0;
        } catch (Exception e2) {
            if (isHardwareBitmapError(e2)) {
                String str = "Cannot capture the app view: " + e2.getMessage();
                i2 = 1;
            } else {
                if (!isComposeDrawRenderNodeError(e2)) {
                    throw e2;
                }
                String str2 = "Cannot capture hardware-accelerated Compose UI: " + e2.getMessage();
            }
        } finally {
            canvas.restore();
        }
        if (i2 == 1) {
            canvas.restoreToCount(1);
            canvas.save();
            Paint paint2 = new Paint();
            paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
            paint2.setStyle(Paint.Style.FILL);
            canvas.drawRect(iArr[0], iArr[1], r1 + view.getWidth(), iArr[1] + view.getHeight(), paint2);
        }
        return i2;
    }

    private static boolean isComposeDrawRenderNodeError(Exception exc) {
        return (exc instanceof IllegalArgumentException) && Objects.equals(exc.getMessage(), "Software rendering doesn't support drawRenderNode");
    }

    private static boolean isHardwareBitmapError(Exception exc) {
        return ((exc instanceof IllegalStateException) || (exc instanceof IllegalArgumentException)) && Objects.equals(exc.getMessage(), "Software rendering doesn't support hardware bitmaps");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isProbablyScreenshotRender() {
        return System.currentTimeMillis() - this.renderingForScreenshot < 90;
    }

    private boolean isSuppressed() {
        return this.suppressUntil > System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void suppressFor(long j2) {
        this.suppressUntil = Math.max(System.currentTimeMillis() + j2, this.suppressUntil);
        this.updateScheduled = true;
    }

    private boolean unwatchWindow(ViewTreeObserver viewTreeObserver) {
        boolean z2;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnDrawListener(this.changeListener);
            viewTreeObserver.removeOnWindowFocusChangeListener(this.windowListener);
            viewTreeObserver.removeOnGlobalLayoutListener(this.layoutListener);
            z2 = true;
        } else {
            z2 = false;
        }
        this.watchedWindows.remove(viewTreeObserver);
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    private boolean unwatchWindows(HashSet<ViewTreeObserver> hashSet) {
        Iterator it = new HashSet(hashSet).iterator();
        ?? r1 = 0;
        while (it.hasNext()) {
            int i2 = (-1) - (((-1) - r1) & ((-1) - (unwatchWindow((ViewTreeObserver) it.next()) ? 1 : 0)));
            r1 = 1;
            if (i2 != 1) {
                r1 = 0;
            }
        }
        return r1;
    }

    private void updateWatchedWindows() {
        HashSet<ViewTreeObserver> hashSet = new HashSet<>(this.watchedWindows);
        Iterator<View> it = Windows.getAll().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ViewTreeObserver viewTreeObserver = it.next().getRootView().getViewTreeObserver();
            int i3 = (-1) - (((-1) - i2) & ((-1) - (watchWindow(viewTreeObserver) ? 1 : 0)));
            i2 = 1;
            if (i3 != 1) {
                i2 = 0;
            }
            hashSet.remove(viewTreeObserver);
        }
        if (((unwatchWindows(hashSet) ? 1 : 0) | i2) != 0) {
            suppressFor(0L);
        }
    }

    private boolean wasRecentlySuppressed() {
        long jCurrentTimeMillis = this.suppressUntil - System.currentTimeMillis();
        return jCurrentTimeMillis < 0 && jCurrentTimeMillis > -1000;
    }

    private boolean watchWindow(ViewTreeObserver viewTreeObserver) {
        if (!viewTreeObserver.isAlive() || !this.watchedWindows.add(viewTreeObserver)) {
            return false;
        }
        viewTreeObserver.addOnDrawListener(this.changeListener);
        viewTreeObserver.addOnWindowFocusChangeListener(this.windowListener);
        viewTreeObserver.addOnGlobalLayoutListener(this.layoutListener);
        return true;
    }

    @Override // io.cobrowse.ActivityWatcher.Observer
    public void activityChanged(Activity activity, Activity activity2) {
        suppressFor(0L);
        if (activity != null) {
            updateWatchedWindows();
            watchWindow(activity.getWindow().getDecorView().getRootView().getViewTreeObserver());
        }
    }

    @Override // io.cobrowse.FrameLoop.Source
    public void capturingWillStart(Display display) {
        ActivityWatcher.registerActivityObserver(this);
        updateWatchedWindows();
        this.updateScheduled = true;
        this.suppressUntil = 0L;
    }

    @Override // io.cobrowse.FrameLoop.Source
    public void capturingWillStop(Display display) {
        this.updateScheduled = false;
        this.surfaceCapture.clear();
        ActivityWatcher.removeActivityObserver(this);
        unwatchWindows(this.watchedWindows);
        this.previousBitmap = null;
        this.writableBitmap = null;
    }

    @Override // io.cobrowse.FrameLoop.Source
    public boolean isNewFrameAvailable(Display display) {
        updateWatchedWindows();
        if (isSuppressed()) {
            return false;
        }
        return this.updateScheduled || wasRecentlySuppressed();
    }

    /* JADX INFO: renamed from: lambda$new$0$io-cobrowse-ViewRenderingFrameSource, reason: not valid java name */
    /* synthetic */ void m8851lambda$new$0$iocobrowseViewRenderingFrameSource(boolean z2) {
        updateWatchedWindows();
        suppressFor(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.cobrowse.FrameLoop.Source
    public Frame newFrame(Display display) throws Throwable {
        Bitmap bitmap;
        this.renderingForScreenshot = System.currentTimeMillis();
        if (!display.isValid()) {
            return null;
        }
        DisplayMetrics metrics = DisplayScaling.getMetrics(display);
        int i2 = metrics.widthPixels;
        int i3 = metrics.heightPixels;
        if (i2 == 0 || i3 == 0) {
            return null;
        }
        if (this.mostRecent == null || (bitmap = this.writableBitmap) == null || bitmap.getWidth() != i2 || this.writableBitmap.getHeight() != i3) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            this.writableBitmap = bitmapCreateBitmap;
            if (bitmapCreateBitmap == null) {
                throw new RuntimeException(String.format("Failed to create a bitmap %d:%d", Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            this.mostRecent = new Frame(this.writableBitmap);
        } else {
            this.writableBitmap.eraseColor(0);
        }
        Canvas canvas = new Canvas(this.writableBitmap);
        boolean z2 = 0;
        for (View view : Windows.getAll()) {
            Context context = view.getContext();
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                if (view.isAttachedToWindow() && view.getDisplay().getDisplayId() == display.getDisplayId()) {
                    if (captureView(view, canvas) == 2) {
                        return null;
                    }
                    boolean zCapture = this.surfaceCapture.capture(view, canvas);
                    z2 = ((z2 ? 1 : 0) + (zCapture ? 1 : 0)) - ((z2 ? 1 : 0) & (zCapture ? 1 : 0));
                }
            }
        }
        this.updateScheduled = z2;
        Bitmap bitmap2 = this.previousBitmap;
        if (bitmap2 == null || !BitmapUtils.sameSize(bitmap2, this.writableBitmap)) {
            this.mostRecent.setDirty(true);
            this.previousBitmap = BitmapUtils.copy(this.writableBitmap);
        } else if (this.previousBitmap.sameAs(this.writableBitmap)) {
            this.mostRecent.setDirty(false);
        } else {
            this.mostRecent.setDirty(true);
            BitmapUtils.copy(this.writableBitmap, this.previousBitmap);
        }
        return this.mostRecent;
    }
}
