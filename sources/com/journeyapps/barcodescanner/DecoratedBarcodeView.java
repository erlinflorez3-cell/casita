package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.DecodeFormatManager;
import com.google.zxing.client.android.DecodeHintManager;
import com.google.zxing.client.android.Intents;
import com.google.zxing.client.android.R;
import com.journeyapps.barcodescanner.camera.CameraParametersCallback;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yg.C1499aX;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class DecoratedBarcodeView extends FrameLayout {
    private BarcodeView barcodeView;
    private TextView statusView;
    private TorchListener torchListener;
    private ViewfinderView viewFinder;

    public interface TorchListener {
        void onTorchOff();

        void onTorchOn();
    }

    private class WrappedCallback implements BarcodeCallback {
        private BarcodeCallback delegate;

        public WrappedCallback(BarcodeCallback barcodeCallback) {
            this.delegate = barcodeCallback;
        }

        @Override // com.journeyapps.barcodescanner.BarcodeCallback
        public void barcodeResult(BarcodeResult barcodeResult) {
            this.delegate.barcodeResult(barcodeResult);
        }

        @Override // com.journeyapps.barcodescanner.BarcodeCallback
        public void possibleResultPoints(List<ResultPoint> list) {
            Iterator<ResultPoint> it = list.iterator();
            while (it.hasNext()) {
                DecoratedBarcodeView.this.viewFinder.addPossibleResultPoint(it.next());
            }
            this.delegate.possibleResultPoints(list);
        }
    }

    public DecoratedBarcodeView(Context context) throws Throwable {
        super(context);
        initialize();
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        initialize(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        initialize(attributeSet);
    }

    private void initialize() throws Throwable {
        initialize(null);
    }

    private void initialize(AttributeSet attributeSet) throws Throwable {
        Context context = getContext();
        int[] iArr = R.styleable.zxing_view;
        short sXd = (short) (C1633zX.Xd() ^ (-3771));
        short sXd2 = (short) (C1633zX.Xd() ^ (-22141));
        int[] iArr2 = new int["Fg\u001fEgu6\u0014+X\f\u001b@n) z;c}0[5".length()];
        QB qb = new QB("Fg\u001fEgu6\u0014+X\f\u001b@n) z;c}0[5");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Object[] objArr = {attributeSet, iArr};
        Method method = Class.forName(new String(iArr2, 0, i2)).getMethod(C1626yg.Ud("z,=\u001bDb \u000f4\u0018CTY\bd\"z/%}~&", (short) (C1633zX.Xd() ^ (-7928)), (short) (C1633zX.Xd() ^ (-17323))), Class.forName(ZO.xd("KM6,<\u0016\u0013)sI9I=qU\t\t\u00183\r<(/lk", (short) (C1499aX.Xd() ^ (-139)), (short) (C1499aX.Xd() ^ (-29577)))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int resourceId = typedArray.getResourceId(R.styleable.zxing_view_zxing_scanner_layout, R.layout.zxing_barcode_scanner);
            typedArray.recycle();
            inflate(getContext(), resourceId, this);
            BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
            this.barcodeView = barcodeView;
            if (barcodeView == null) {
                throw new IllegalArgumentException(EO.Od("+\u0011\u001cQWgOj^z\u007f\f\u0019_%\rh\u0011\u0017eCe5*6\u0014\u00030#-?\u001a\u0015]q\"R~\u0014\u0002\r6\u0001m\u0019#\nJo\u0015|K\n\u000f6u\u001e\u000e<i`\u00024GcH\u0005-9\u0004SY4\u0003Mm#sh9Od;\u001ea78^\u000fc}|h1xV(e|3\u0007\u0016\fD\u0011\u000e\f+ycj@", (short) (FB.Xd() ^ 17869)));
            }
            barcodeView.initializeAttributes(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
            this.viewFinder = viewfinderView;
            if (viewfinderView == null) {
                throw new IllegalArgumentException(Ig.wd("_\u001e\u000by\u001a(\b/!A>VetT\u0007;y^K\u0016?UT\u0019-Z\u00156\u001fg\u000b@W\f7`\u000b\u000e\u0002\u000b;zu((#oO\u001fq\u0019;t\"v\fi,JJ\u0014\u001cN\u0019]%`AB\u0016=l8\nrdL\u001c\u0015P\u00156\n][T65:Gab\u00114X9|\u007f:\u0014%\u001a;\u000e}\u0013=q'A%tJ8", (short) (OY.Xd() ^ 17307)));
            }
            viewfinderView.setCameraPreview(this.barcodeView);
            this.statusView = (TextView) findViewById(R.id.zxing_status_view);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void changeCameraParameters(CameraParametersCallback cameraParametersCallback) {
        this.barcodeView.changeCameraParameters(cameraParametersCallback);
    }

    public void decodeContinuous(BarcodeCallback barcodeCallback) {
        this.barcodeView.decodeContinuous(new WrappedCallback(barcodeCallback));
    }

    public void decodeSingle(BarcodeCallback barcodeCallback) {
        this.barcodeView.decodeSingle(new WrappedCallback(barcodeCallback));
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public CameraSettings getCameraSettings() {
        return this.barcodeView.getCameraSettings();
    }

    public DecoderFactory getDecoderFactory() {
        return this.barcodeView.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.statusView;
    }

    public ViewfinderView getViewFinder() {
        return this.viewFinder;
    }

    public void initializeFromIntent(Intent intent) {
        int intExtra;
        Set<BarcodeFormat> decodeFormats = DecodeFormatManager.parseDecodeFormats(intent);
        Map<DecodeHintType, ?> decodeHints = DecodeHintManager.parseDecodeHints(intent);
        CameraSettings cameraSettings = new CameraSettings();
        if (intent.hasExtra(Intents.Scan.CAMERA_ID) && (intExtra = intent.getIntExtra(Intents.Scan.CAMERA_ID, -1)) >= 0) {
            cameraSettings.setRequestedCameraId(intExtra);
        }
        if (intent.hasExtra(Intents.Scan.TORCH_ENABLED) && intent.getBooleanExtra(Intents.Scan.TORCH_ENABLED, false)) {
            setTorchOn();
        }
        String stringExtra = intent.getStringExtra(Intents.Scan.PROMPT_MESSAGE);
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra(Intents.Scan.SCAN_TYPE, 0);
        String stringExtra2 = intent.getStringExtra(Intents.Scan.CHARACTER_SET);
        new MultiFormatReader().setHints(decodeHints);
        this.barcodeView.setCameraSettings(cameraSettings);
        this.barcodeView.setDecoderFactory(new DefaultDecoderFactory(decodeFormats, decodeHints, stringExtra2, intExtra2));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 24) {
            setTorchOn();
            return true;
        }
        if (i2 == 25) {
            setTorchOff();
            return true;
        }
        if (i2 == 27 || i2 == 80) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public void pause() {
        this.barcodeView.pause();
    }

    public void pauseAndWait() {
        this.barcodeView.pauseAndWait();
    }

    public void resume() {
        this.barcodeView.resume();
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.barcodeView.setCameraSettings(cameraSettings);
    }

    public void setDecoderFactory(DecoderFactory decoderFactory) {
        this.barcodeView.setDecoderFactory(decoderFactory);
    }

    public void setStatusText(String str) {
        TextView textView = this.statusView;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(TorchListener torchListener) {
        this.torchListener = torchListener;
    }

    public void setTorchOff() {
        this.barcodeView.setTorch(false);
        TorchListener torchListener = this.torchListener;
        if (torchListener != null) {
            torchListener.onTorchOff();
        }
    }

    public void setTorchOn() {
        this.barcodeView.setTorch(true);
        TorchListener torchListener = this.torchListener;
        if (torchListener != null) {
            torchListener.onTorchOn();
        }
    }
}
