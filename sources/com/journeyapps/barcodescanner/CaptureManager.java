package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.BeepManager;
import com.google.zxing.client.android.InactivityTimer;
import com.google.zxing.client.android.Intents;
import com.google.zxing.client.android.R;
import com.journeyapps.barcodescanner.CameraPreview;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class CaptureManager {
    private static final String SAVED_ORIENTATION_LOCK = "SAVED_ORIENTATION_LOCK";
    private static final String TAG = "CaptureManager";
    private static int cameraPermissionReqCode = 250;
    private Activity activity;
    private boolean askedPermission;
    private DecoratedBarcodeView barcodeView;
    private BeepManager beepManager;
    private Handler handler;
    private InactivityTimer inactivityTimer;
    private final CameraPreview.StateListener stateListener;
    private int orientationLock = -1;
    private boolean returnBarcodeImagePath = false;
    private boolean showDialogIfMissingCameraPermission = true;
    private String missingCameraPermissionDialogMessage = "";
    private boolean destroyed = false;
    private boolean finishWhenClosed = false;
    private BarcodeCallback callback = new AnonymousClass1();

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CaptureManager$1, reason: invalid class name */
    class AnonymousClass1 implements BarcodeCallback {
        AnonymousClass1() {
        }

        @Override // com.journeyapps.barcodescanner.BarcodeCallback
        public void barcodeResult(final BarcodeResult barcodeResult) throws Throwable {
            CaptureManager.this.barcodeView.pause();
            CaptureManager.this.beepManager.playBeepSoundAndVibrate();
            Handler handler = CaptureManager.this.handler;
            Runnable runnable = new Runnable() { // from class: com.journeyapps.barcodescanner.CaptureManager$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.m8612xddc42d84(barcodeResult);
                }
            };
            short sXd = (short) (C1607wl.Xd() ^ 7212);
            int[] iArr = new int["5y\u001eLb\u0011g\"\nB~3v\n\u0004&[v".length()];
            QB qb = new QB("5y\u001eLb\u0011g\"\nB~3v\n\u0004&[v");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[1];
            short sXd2 = (short) (FB.Xd() ^ 25949);
            int[] iArr2 = new int["aWkU!^R^V\u001c?aYXJJSK".length()];
            QB qb2 = new QB("aWkU!^R^V\u001c?aYXJJSK");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = {runnable};
            Method method = cls.getMethod(C1593ug.zd("@@EG", (short) (C1580rY.Xd() ^ (-14945)), (short) (C1580rY.Xd() ^ (-27502))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: lambda$barcodeResult$0$com-journeyapps-barcodescanner-CaptureManager$1, reason: not valid java name */
        /* synthetic */ void m8612xddc42d84(BarcodeResult barcodeResult) throws Throwable {
            CaptureManager.this.returnResult(barcodeResult);
        }

        @Override // com.journeyapps.barcodescanner.BarcodeCallback
        public void possibleResultPoints(List<ResultPoint> list) {
        }
    }

    public CaptureManager(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        CameraPreview.StateListener stateListener = new CameraPreview.StateListener() { // from class: com.journeyapps.barcodescanner.CaptureManager.2
            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void cameraClosed() {
                if (CaptureManager.this.finishWhenClosed) {
                    String unused = CaptureManager.TAG;
                    CaptureManager.this.finish();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void cameraError(Exception exc) {
                CaptureManager captureManager = CaptureManager.this;
                captureManager.displayFrameworkBugMessageAndExit(captureManager.activity.getString(R.string.zxing_msg_camera_framework_bug));
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewSized() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewStarted() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
            public void previewStopped() {
            }
        };
        this.stateListener = stateListener;
        this.askedPermission = false;
        this.activity = activity;
        this.barcodeView = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().addStateListener(stateListener);
        this.handler = new Handler();
        this.inactivityTimer = new InactivityTimer(activity, new Runnable() { // from class: com.journeyapps.barcodescanner.CaptureManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8611lambda$new$0$comjourneyappsbarcodescannerCaptureManager();
            }
        });
        this.beepManager = new BeepManager(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finish() {
        this.activity.finish();
    }

    private String getBarcodeImagePath(BarcodeResult barcodeResult) {
        if (this.returnBarcodeImagePath) {
            Bitmap bitmap = barcodeResult.getBitmap();
            try {
                File fileCreateTempFile = File.createTempFile("barcodeimage", ".jpg", this.activity.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return fileCreateTempFile.getAbsolutePath();
            } catch (IOException e2) {
                String str = TAG;
                String str2 = "Unable to create temporary file and store bitmap! " + e2;
            }
        }
        return null;
    }

    public static int getCameraPermissionReqCode() {
        return cameraPermissionReqCode;
    }

    private void openCameraWithPermission() {
        if (ContextCompat.checkSelfPermission(this.activity, "android.permission.CAMERA") == 0) {
            this.barcodeView.resume();
        } else {
            if (this.askedPermission) {
                return;
            }
            ActivityCompat.requestPermissions(this.activity, new String[]{"android.permission.CAMERA"}, cameraPermissionReqCode);
            this.askedPermission = true;
        }
    }

    public static Intent resultIntent(BarcodeResult barcodeResult, String str) {
        Intent intent = new Intent(Intents.Scan.ACTION);
        intent.addFlags(524288);
        intent.putExtra(Intents.Scan.RESULT, barcodeResult.toString());
        intent.putExtra(Intents.Scan.RESULT_FORMAT, barcodeResult.getBarcodeFormat().toString());
        byte[] rawBytes = barcodeResult.getRawBytes();
        if (rawBytes != null && rawBytes.length > 0) {
            intent.putExtra(Intents.Scan.RESULT_BYTES, rawBytes);
        }
        Map<ResultMetadataType, Object> resultMetadata = barcodeResult.getResultMetadata();
        if (resultMetadata != null) {
            if (resultMetadata.containsKey(ResultMetadataType.UPC_EAN_EXTENSION)) {
                intent.putExtra(Intents.Scan.RESULT_UPC_EAN_EXTENSION, resultMetadata.get(ResultMetadataType.UPC_EAN_EXTENSION).toString());
            }
            Number number = (Number) resultMetadata.get(ResultMetadataType.ORIENTATION);
            if (number != null) {
                intent.putExtra(Intents.Scan.RESULT_ORIENTATION, number.intValue());
            }
            String str2 = (String) resultMetadata.get(ResultMetadataType.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra(Intents.Scan.RESULT_ERROR_CORRECTION_LEVEL, str2);
            }
            Iterable iterable = (Iterable) resultMetadata.get(ResultMetadataType.BYTE_SEGMENTS);
            if (iterable != null) {
                Iterator it = iterable.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    intent.putExtra(Intents.Scan.RESULT_BYTE_SEGMENTS_PREFIX + i2, (byte[]) it.next());
                    i2++;
                }
            }
        }
        if (str != null) {
            intent.putExtra(Intents.Scan.RESULT_BARCODE_IMAGE_PATH, str);
        }
        return intent;
    }

    public static void setCameraPermissionReqCode(int i2) {
        cameraPermissionReqCode = i2;
    }

    private void setMissingCameraPermissionResult() {
        Intent intent = new Intent(Intents.Scan.ACTION);
        intent.putExtra(Intents.Scan.MISSING_CAMERA_PERMISSION, true);
        this.activity.setResult(0, intent);
    }

    protected void closeAndFinish() throws Throwable {
        if (this.barcodeView.getBarcodeView().isCameraClosed()) {
            finish();
        } else {
            this.finishWhenClosed = true;
        }
        this.barcodeView.pause();
        this.inactivityTimer.cancel();
    }

    public void decode() {
        this.barcodeView.decodeSingle(this.callback);
    }

    protected void displayFrameworkBugMessageAndExit(String str) {
        if (this.activity.isFinishing() || this.destroyed || this.finishWhenClosed) {
            return;
        }
        if (str.isEmpty()) {
            str = this.activity.getString(R.string.zxing_msg_camera_framework_bug);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.activity);
        builder.setTitle(this.activity.getString(R.string.zxing_app_name));
        builder.setMessage(str);
        builder.setPositiveButton(R.string.zxing_button_ok, new DialogInterface.OnClickListener() { // from class: com.journeyapps.barcodescanner.CaptureManager$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f$0.m8609x170613e1(dialogInterface, i2);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.journeyapps.barcodescanner.CaptureManager$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f$0.m8610x8c803a22(dialogInterface);
            }
        });
        builder.show();
    }

    public void initializeFromIntent(Intent intent, Bundle bundle) {
        this.activity.getWindow().addFlags(128);
        if (bundle != null) {
            this.orientationLock = bundle.getInt(C1561oA.od("M:N<:TCE;6>C/A5:8H46)0", (short) (C1607wl.Xd() ^ 12240)), -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra(C1561oA.Kd("@10>PAE=:DK9MCJJ\\JNCLGG", (short) (ZN.Xd() ^ 23196)), true)) {
                lockOrientation();
            }
            if (Wg.Zd("OmMo\u000b%~X?Jt+\u000bMtOov\"\u0001^A)\u0005\u001axHxW#\u007f3z<\u001c\u000b", (short) (C1633zX.Xd() ^ (-27085)), (short) (C1633zX.Xd() ^ (-22611))).equals(intent.getAction())) {
                this.barcodeView.initializeFromIntent(intent);
            }
            if (!intent.getBooleanExtra(C1561oA.Xd("IMNZjQ[OQ\\VV", (short) (OY.Xd() ^ 1807)), true)) {
                this.beepManager.setBeepEnabled(false);
            }
            String strVd = Wg.vd("aW[dq`YdYPRLiNIVcq]|rhrn_jg^iiw]wpx|y", (short) (Od.Xd() ^ (-22112)));
            if (intent.hasExtra(strVd)) {
                boolean booleanExtra = intent.getBooleanExtra(strVd, true);
                short sXd = (short) (C1607wl.Xd() ^ 18284);
                short sXd2 = (short) (C1607wl.Xd() ^ 17841);
                int[] iArr = new int["\u0006\u0001\n\t}\u0002y\u0011sp{r~l\nymysnwvkpn~bf]gi`wd[hgTYV".length()];
                QB qb = new QB("\u0006\u0001\n\t}\u0002y\u0011sp{r~l\nymysnwvkpn~bf]gi`wd[hgTYV");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                    i2++;
                }
                setShowMissingCameraPermissionDialog(booleanExtra, intent.getStringExtra(new String(iArr, 0, i2)));
            }
            String strVd2 = hg.Vd("[ORIRWU", (short) (C1580rY.Xd() ^ (-1517)), (short) (C1580rY.Xd() ^ (-21068)));
            if (intent.hasExtra(strVd2)) {
                Handler handler = this.handler;
                Runnable runnable = new Runnable() { // from class: com.journeyapps.barcodescanner.CaptureManager$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f$0.returnResultTimeout();
                    }
                };
                long longExtra = intent.getLongExtra(strVd2, 0L);
                Class<?> cls = Class.forName(C1561oA.ud("\u001b'\u001c)%\u001e\u0018`!$]v\u000f\u001b\u0010\u0017\u000f\u001b", (short) (C1607wl.Xd() ^ 2895)));
                Class<?>[] clsArr = new Class[2];
                short sXd3 = (short) (C1580rY.Xd() ^ (-11243));
                int[] iArr2 = new int["_WmY\u001f^Tbd,Qugh\\^QK".length()];
                QB qb2 = new QB("_WmY\u001f^Tbd,Qugh\\^QK");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                clsArr[1] = Long.TYPE;
                Object[] objArr = {runnable, Long.valueOf(longExtra)};
                Method method = cls.getMethod(C1561oA.Yd("66;=\u000e08.G44", (short) (Od.Xd() ^ (-28066))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            short sXd4 = (short) (OY.Xd() ^ 4191);
            short sXd5 = (short) (OY.Xd() ^ 15534);
            int[] iArr3 = new int["{{\u000e\u007f\r\u0003\u0005 \u000b\u0010\u0005\f\u000b&\r\u0017\u000b\r\u0018\u0012\u0012".length()];
            QB qb3 = new QB("{{\u000e\u007f\r\u0003\u0005 \u000b\u0010\u0005\f\u000b&\r\u0017\u000b\r\u0018\u0012\u0012");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) + sXd5);
                i4++;
            }
            if (intent.getBooleanExtra(new String(iArr3, 0, i4), false)) {
                this.returnBarcodeImagePath = true;
            }
        }
    }

    /* JADX INFO: renamed from: lambda$displayFrameworkBugMessageAndExit$1$com-journeyapps-barcodescanner-CaptureManager, reason: not valid java name */
    /* synthetic */ void m8609x170613e1(DialogInterface dialogInterface, int i2) {
        finish();
    }

    /* JADX INFO: renamed from: lambda$displayFrameworkBugMessageAndExit$2$com-journeyapps-barcodescanner-CaptureManager, reason: not valid java name */
    /* synthetic */ void m8610x8c803a22(DialogInterface dialogInterface) {
        finish();
    }

    /* JADX INFO: renamed from: lambda$new$0$com-journeyapps-barcodescanner-CaptureManager, reason: not valid java name */
    /* synthetic */ void m8611lambda$new$0$comjourneyappsbarcodescannerCaptureManager() {
        String str = TAG;
        finish();
    }

    protected void lockOrientation() {
        if (this.orientationLock == -1) {
            int rotation = this.activity.getWindowManager().getDefaultDisplay().getRotation();
            int i2 = this.activity.getResources().getConfiguration().orientation;
            int i3 = 0;
            if (i2 == 2) {
                if (rotation != 0 && rotation != 1) {
                    i3 = 8;
                }
            } else if (i2 == 1) {
                i3 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.orientationLock = i3;
        }
        this.activity.setRequestedOrientation(this.orientationLock);
    }

    public void onDestroy() {
        this.destroyed = true;
        this.inactivityTimer.cancel();
        this.handler.removeCallbacksAndMessages(null);
    }

    public void onPause() {
        this.inactivityTimer.cancel();
        this.barcodeView.pauseAndWait();
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 == cameraPermissionReqCode) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.barcodeView.resume();
                return;
            }
            setMissingCameraPermissionResult();
            if (this.showDialogIfMissingCameraPermission) {
                displayFrameworkBugMessageAndExit(this.missingCameraPermissionDialogMessage);
            } else {
                closeAndFinish();
            }
        }
    }

    public void onResume() {
        openCameraWithPermission();
        this.inactivityTimer.start();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(SAVED_ORIENTATION_LOCK, this.orientationLock);
    }

    protected void returnResult(BarcodeResult barcodeResult) throws Throwable {
        this.activity.setResult(-1, resultIntent(barcodeResult, getBarcodeImagePath(barcodeResult)));
        closeAndFinish();
    }

    protected void returnResultTimeout() throws Throwable {
        Intent intent = new Intent(Intents.Scan.ACTION);
        intent.putExtra("TIMEOUT", true);
        this.activity.setResult(0, intent);
        closeAndFinish();
    }

    public void setShowMissingCameraPermissionDialog(boolean z2) {
        setShowMissingCameraPermissionDialog(z2, "");
    }

    public void setShowMissingCameraPermissionDialog(boolean z2, String str) {
        this.showDialogIfMissingCameraPermission = z2;
        if (str == null) {
            str = "";
        }
        this.missingCameraPermissionDialogMessage = str;
    }
}
