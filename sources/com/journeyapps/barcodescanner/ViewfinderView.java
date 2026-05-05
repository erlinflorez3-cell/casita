package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.R;
import com.journeyapps.barcodescanner.CameraPreview;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public class ViewfinderView extends View {
    protected static final long ANIMATION_DELAY = 80;
    protected static final int CURRENT_POINT_OPACITY = 160;
    protected static final int MAX_RESULT_POINTS = 20;
    protected static final int POINT_SIZE = 6;
    protected static final int[] SCANNER_ALPHA = {0, 64, 128, 192, 255, 192, 128, 64};
    protected static final String TAG = "ViewfinderView";
    protected CameraPreview cameraPreview;
    protected Rect framingRect;
    protected final int laserColor;
    protected boolean laserVisibility;
    protected List<ResultPoint> lastPossibleResultPoints;
    protected int maskColor;
    protected final Paint paint;
    protected List<ResultPoint> possibleResultPoints;
    protected Size previewSize;
    protected Bitmap resultBitmap;
    protected final int resultColor;
    protected final int resultPointColor;
    protected int scannerAlpha;

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.ViewfinderView$1 */
    class AnonymousClass1 implements CameraPreview.StateListener {
        AnonymousClass1() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void cameraClosed() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void cameraError(Exception exc) {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void previewSized() {
            ViewfinderView.this.refreshSizes();
            ViewfinderView.this.invalidate();
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void previewStarted() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
        public void previewStopped() {
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.paint = new Paint(1);
        Resources resources = getResources();
        Context context2 = getContext();
        int[] iArr = R.styleable.zxing_finder;
        Class<?> cls = Class.forName(C1561oA.ud("\u001a&\u001b($\u001d\u0017_\u0014\u001f\u001d\"\u0012\u001a\u001fWk\u0017\u0015\u001a\n\u001c\u0017", (short) (C1499aX.Xd() ^ (-4943))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1499aX.Xd() ^ (-7394));
        int[] iArr2 = new int["M[N]_ZR\u001dii[_&:jkNF<PTF1DX".length()];
        QB qb = new QB("M[N]_ZR\u001dii[_&:jkNF<PTF1DX");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i2));
        clsArr[1] = int[].class;
        Object[] objArr = {attributeSet, iArr};
        Method method = cls.getMethod(C1561oA.Yd("RFYGPV<^dXRR0ded\\Vjj\\k", (short) (C1607wl.Xd() ^ 16042)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context2, objArr);
            this.maskColor = typedArray.getColor(R.styleable.zxing_finder_zxing_viewfinder_mask, resources.getColor(R.color.zxing_viewfinder_mask));
            this.resultColor = typedArray.getColor(R.styleable.zxing_finder_zxing_result_view, resources.getColor(R.color.zxing_result_view));
            this.laserColor = typedArray.getColor(R.styleable.zxing_finder_zxing_viewfinder_laser, resources.getColor(R.color.zxing_viewfinder_laser));
            this.resultPointColor = typedArray.getColor(R.styleable.zxing_finder_zxing_possible_result_points, resources.getColor(R.color.zxing_possible_result_points));
            this.laserVisibility = typedArray.getBoolean(R.styleable.zxing_finder_zxing_viewfinder_laser_visibility, true);
            typedArray.recycle();
            this.scannerAlpha = 0;
            this.possibleResultPoints = new ArrayList(20);
            this.lastPossibleResultPoints = new ArrayList(20);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void addPossibleResultPoint(ResultPoint resultPoint) {
        if (this.possibleResultPoints.size() < 20) {
            this.possibleResultPoints.add(resultPoint);
        }
    }

    public void drawResultBitmap(Bitmap bitmap) {
        this.resultBitmap = bitmap;
        invalidate();
    }

    public void drawViewfinder() {
        Bitmap bitmap = this.resultBitmap;
        this.resultBitmap = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Size size;
        refreshSizes();
        Rect rect = this.framingRect;
        if (rect == null || (size = this.previewSize) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.paint.setColor(this.resultBitmap != null ? this.resultColor : this.maskColor);
        float f2 = width;
        canvas.drawRect(0.0f, 0.0f, f2, rect.top, this.paint);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.paint);
        canvas.drawRect(rect.right + 1, rect.top, f2, rect.bottom + 1, this.paint);
        canvas.drawRect(0.0f, rect.bottom + 1, f2, height, this.paint);
        if (this.resultBitmap != null) {
            this.paint.setAlpha(160);
            canvas.drawBitmap(this.resultBitmap, (Rect) null, rect, this.paint);
            return;
        }
        if (this.laserVisibility) {
            this.paint.setColor(this.laserColor);
            Paint paint = this.paint;
            int[] iArr = SCANNER_ALPHA;
            paint.setAlpha(iArr[this.scannerAlpha]);
            this.scannerAlpha = (this.scannerAlpha + 1) % iArr.length;
            int iHeight = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, iHeight - 1, rect.right - 1, iHeight + 2, this.paint);
        }
        float width2 = getWidth() / size.width;
        float height2 = getHeight() / size.height;
        if (!this.lastPossibleResultPoints.isEmpty()) {
            this.paint.setAlpha(80);
            this.paint.setColor(this.resultPointColor);
            for (ResultPoint resultPoint : this.lastPossibleResultPoints) {
                canvas.drawCircle((int) (resultPoint.getX() * width2), (int) (resultPoint.getY() * height2), 3.0f, this.paint);
            }
            this.lastPossibleResultPoints.clear();
        }
        if (!this.possibleResultPoints.isEmpty()) {
            this.paint.setAlpha(160);
            this.paint.setColor(this.resultPointColor);
            for (ResultPoint resultPoint2 : this.possibleResultPoints) {
                canvas.drawCircle((int) (resultPoint2.getX() * width2), (int) (resultPoint2.getY() * height2), 6.0f, this.paint);
            }
            List<ResultPoint> list = this.possibleResultPoints;
            List<ResultPoint> list2 = this.lastPossibleResultPoints;
            this.possibleResultPoints = list2;
            this.lastPossibleResultPoints = list;
            list2.clear();
        }
        postInvalidateDelayed(ANIMATION_DELAY, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    protected void refreshSizes() {
        CameraPreview cameraPreview = this.cameraPreview;
        if (cameraPreview == null) {
            return;
        }
        Rect framingRect = cameraPreview.getFramingRect();
        Size previewSize = this.cameraPreview.getPreviewSize();
        if (framingRect == null || previewSize == null) {
            return;
        }
        this.framingRect = framingRect;
        this.previewSize = previewSize;
    }

    public void setCameraPreview(CameraPreview cameraPreview) {
        this.cameraPreview = cameraPreview;
        cameraPreview.addStateListener(new CameraPreview.StateListener() { // from class: com.journeyapps.barcodescanner.ViewfinderView.1
            AnonymousClass1() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void cameraClosed() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void cameraError(Exception exc) {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewSized() {
                ViewfinderView.this.refreshSizes();
                ViewfinderView.this.invalidate();
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewStarted() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewStopped() {
            }
        });
    }

    public void setLaserVisibility(boolean z2) {
        this.laserVisibility = z2;
    }

    public void setMaskColor(int i2) {
        this.maskColor = i2;
    }
}
