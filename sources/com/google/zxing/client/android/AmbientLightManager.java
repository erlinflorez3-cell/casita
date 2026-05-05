package com.google.zxing.client.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.journeyapps.barcodescanner.camera.CameraManager;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public final class AmbientLightManager implements SensorEventListener {
    private static final float BRIGHT_ENOUGH_LUX = 450.0f;
    private static final float TOO_DARK_LUX = 45.0f;
    private CameraManager cameraManager;
    private CameraSettings cameraSettings;
    private Context context;
    private Handler handler = new Handler();
    private Sensor lightSensor;

    public AmbientLightManager(Context context, CameraManager cameraManager, CameraSettings cameraSettings) {
        this.context = context;
        this.cameraManager = cameraManager;
        this.cameraSettings = cameraSettings;
    }

    private void setTorch(final boolean z2) throws Throwable {
        Handler handler = this.handler;
        Object[] objArr = {new Runnable() { // from class: com.google.zxing.client.android.AmbientLightManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7797x2388a1df(z2);
            }
        }};
        Method method = Class.forName(EO.Od("\u0010lt\"\u007f7\u000e74[\u0014L\u0015,9 ]\\", (short) (Od.Xd() ^ (-27764)))).getMethod(C1593ug.zd("\u0006\u0006\u000b\r", (short) (FB.Xd() ^ 7628), (short) (FB.Xd() ^ 24059)), Class.forName(C1561oA.Qd("]SgQ\u001dZNZR\u0018;]UTFFOG", (short) (OY.Xd() ^ 2096))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: lambda$setTorch$0$com-google-zxing-client-android-AmbientLightManager, reason: not valid java name */
    /* synthetic */ void m7797x2388a1df(boolean z2) {
        this.cameraManager.setTorch(z2);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) throws Throwable {
        float f2 = sensorEvent.values[0];
        if (this.cameraManager != null) {
            if (f2 <= TOO_DARK_LUX) {
                setTorch(true);
            } else if (f2 >= BRIGHT_ENOUGH_LUX) {
                setTorch(false);
            }
        }
    }

    public void start() {
        if (this.cameraSettings.isAutoTorchEnabled()) {
            Context context = this.context;
            Object[] objArr = {C1561oA.od("\u001b\f\u0014\u0018\u0013\u0015", (short) (FB.Xd() ^ 31281))};
            Method method = Class.forName(C1561oA.Kd("\u001c*!0.)%o&33:,6=w\u000e;;B4HE", (short) (C1633zX.Xd() ^ (-21902)))).getMethod(C1561oA.Xd("IHX8_Z\\NW>Q_dXSV", (short) (C1499aX.Xd() ^ (-23287))), Class.forName(Wg.Zd("w hccq\u0018Xa[P#T[\u0014\\", (short) (Od.Xd() ^ (-15465)), (short) (Od.Xd() ^ (-22687)))));
            try {
                method.setAccessible(true);
                SensorManager sensorManager = (SensorManager) method.invoke(context, objArr);
                Sensor defaultSensor = sensorManager.getDefaultSensor(5);
                this.lightSensor = defaultSensor;
                if (defaultSensor != null) {
                    sensorManager.registerListener(this, defaultSensor, 3);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public void stop() {
        if (this.lightSensor != null) {
            Context context = this.context;
            String strVd = Wg.vd("\u0007w\u0004\b\u0007\t", (short) (C1633zX.Xd() ^ (-5811)));
            Class<?> cls = Class.forName(Qg.kd("BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?", (short) (C1607wl.Xd() ^ 20109), (short) (C1607wl.Xd() ^ 19694)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (OY.Xd() ^ 9237);
            short sXd2 = (short) (OY.Xd() ^ 28403);
            int[] iArr = new int["* 4\u001ei'\u001b'\u001fd\t)&\u001c \u0018".length()];
            QB qb = new QB("* 4\u001ei'\u001b'\u001fd\t)&\u001c \u0018");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {strVd};
            short sXd3 = (short) (C1499aX.Xd() ^ (-26958));
            int[] iArr2 = new int["liwUzsscjO`loaZ[".length()];
            QB qb2 = new QB("liwUzsscjO`loaZ[");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                ((SensorManager) method.invoke(context, objArr)).unregisterListener(this);
                this.lightSensor = null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
