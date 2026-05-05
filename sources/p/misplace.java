package p;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import androidx.core.content.ContextCompat;
import kotlin.collections.ArraysKt;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class misplace implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final MainCoroutineDispatcher f28213a;

    /* JADX INFO: renamed from: b */
    public final float[][] f28214b;

    /* JADX INFO: renamed from: c */
    public int f28215c;

    /* JADX INFO: renamed from: d */
    public boolean f28216d;

    /* JADX INFO: renamed from: e */
    public final float[][] f28217e;

    /* JADX INFO: renamed from: f */
    public int f28218f;

    /* JADX INFO: renamed from: g */
    public boolean f28219g;

    /* JADX INFO: renamed from: h */
    public final float[] f28220h;

    /* JADX INFO: renamed from: i */
    public int f28221i;

    /* JADX INFO: renamed from: j */
    public boolean f28222j;

    /* JADX INFO: renamed from: k */
    public final long[] f28223k;

    /* JADX INFO: renamed from: l */
    public final float[] f28224l;

    /* JADX INFO: renamed from: m */
    public int f28225m;

    /* JADX INFO: renamed from: n */
    public boolean f28226n;

    /* JADX INFO: renamed from: o */
    public final float[] f28227o;

    /* JADX INFO: renamed from: p */
    public final SensorManager f28228p;

    public misplace(Application application, MainCoroutineDispatcher mainCoroutineDispatcher) {
        this.f28213a = mainCoroutineDispatcher;
        float[][] fArr = new float[40][];
        for (int i2 = 0; i2 < 40; i2++) {
            fArr[i2] = new float[3];
        }
        this.f28214b = fArr;
        float[][] fArr2 = new float[40][];
        for (int i3 = 0; i3 < 40; i3++) {
            fArr2[i3] = new float[3];
        }
        this.f28217e = fArr2;
        this.f28220h = new float[40];
        this.f28223k = new long[40];
        this.f28224l = new float[40];
        this.f28227o = new float[3];
        this.f28228p = (SensorManager) ContextCompat.getSystemService(application, SensorManager.class);
    }

    public static final Boolean a(misplace misplaceVar) {
        if (!misplaceVar.f28226n) {
            return null;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int length = misplaceVar.f28223k.length;
        boolean z2 = false;
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = misplaceVar.f28223k[i2];
            if (j2 > 0 && j2 >= jElapsedRealtimeNanos - ((long) 500000000)) {
                if (misplaceVar.f28224l[i2] >= 5.0f) {
                    return Boolean.FALSE;
                }
                z2 = true;
            }
        }
        if (z2) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(misplaceVar.f28224l[(misplaceVar.f28225m + 39) % 40] < 5.0f);
    }

    public final void a() {
        SensorManager sensorManager = this.f28228p;
        if (sensorManager == null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        if (defaultSensor != null) {
            sensorManager.registerListener(this, defaultSensor, 50000);
        }
        SensorManager sensorManager2 = this.f28228p;
        Sensor defaultSensor2 = sensorManager2.getDefaultSensor(4);
        if (defaultSensor2 != null) {
            sensorManager2.registerListener(this, defaultSensor2, 50000);
        }
        SensorManager sensorManager3 = this.f28228p;
        Sensor defaultSensor3 = sensorManager3.getDefaultSensor(5);
        if (defaultSensor3 != null) {
            sensorManager3.registerListener(this, defaultSensor3, 50000);
        }
        SensorManager sensorManager4 = this.f28228p;
        Sensor defaultSensor4 = sensorManager4.getDefaultSensor(8);
        if (defaultSensor4 == null) {
            return;
        }
        sensorManager4.registerListener(this, defaultSensor4, 50000);
    }

    public final void b() {
        SensorManager sensorManager = this.f28228p;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this);
        for (float[] fArr : this.f28214b) {
            ArraysKt.fill$default(fArr, 0.0f, 0, 0, 6, (Object) null);
        }
        for (float[] fArr2 : this.f28217e) {
            ArraysKt.fill$default(fArr2, 0.0f, 0, 0, 6, (Object) null);
        }
        ArraysKt.fill$default(this.f28220h, 0.0f, 0, 0, 6, (Object) null);
        ArraysKt.fill$default(this.f28223k, 0L, 0, 0, 6, (Object) null);
        ArraysKt.fill$default(this.f28224l, 0.0f, 0, 0, 6, (Object) null);
        this.f28215c = 0;
        this.f28218f = 0;
        this.f28221i = 0;
        this.f28225m = 0;
        this.f28216d = false;
        this.f28219g = false;
        this.f28222j = false;
        this.f28226n = false;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.f28227o;
            float f2 = (fArr[0] * 0.19999999f) + (fArr2[0] * 0.8f);
            fArr2[0] = f2;
            fArr2[1] = (fArr[1] * 0.19999999f) + (fArr2[1] * 0.8f);
            fArr2[2] = (fArr[2] * 0.19999999f) + (fArr2[2] * 0.8f);
            this.f28214b[this.f28215c][0] = Math.abs(fArr[0] - f2);
            this.f28214b[this.f28215c][1] = Math.abs(fArr[1] - this.f28227o[1]);
            this.f28214b[this.f28215c][2] = Math.abs(fArr[2] - this.f28227o[2]);
            int i2 = (this.f28215c + 1) % 40;
            this.f28215c = i2;
            this.f28216d = this.f28216d || i2 == 0;
            return;
        }
        if (type == 8) {
            long[] jArr = this.f28223k;
            int i3 = this.f28225m;
            jArr[i3] = sensorEvent.timestamp;
            this.f28224l[i3] = sensorEvent.values[0];
            this.f28225m = (i3 + 1) % 40;
            this.f28226n = true;
            return;
        }
        if (type == 4) {
            float[] fArr3 = sensorEvent.values;
            this.f28217e[this.f28218f][0] = Math.abs(fArr3[0]);
            this.f28217e[this.f28218f][1] = Math.abs(fArr3[1]);
            this.f28217e[this.f28218f][2] = Math.abs(fArr3[2]);
            int i4 = (this.f28218f + 1) % 40;
            this.f28218f = i4;
            this.f28219g = this.f28219g || i4 == 0;
            return;
        }
        if (type != 5) {
            return;
        }
        float f3 = sensorEvent.values[0];
        float[] fArr4 = this.f28220h;
        int i5 = this.f28221i;
        fArr4[i5] = f3;
        int i6 = (i5 + 1) % 40;
        this.f28221i = i6;
        this.f28222j = this.f28222j || i6 == 0;
    }
}
