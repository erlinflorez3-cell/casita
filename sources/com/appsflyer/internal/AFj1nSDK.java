package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import yg.C1561oA;
import yg.C1593ug;
import yg.FB;
import yg.OY;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1nSDK implements SensorEventListener {
    private final String AFAdRevenueData;
    private long component1;
    private final Executor component3;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final String getMonetizationNetwork;
    private double getRevenue;
    private final float[][] areAllFieldsValid = new float[2][];
    private final long[] component4 = new long[2];

    AFj1nSDK(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.getMediationNetwork = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFAdRevenueData = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.component3 = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F_, reason: merged with bridge method [inline-methods] */
    public void G_(SensorEvent sensorEvent) {
        long j2 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.areAllFieldsValid;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.component4[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.areAllFieldsValid[1] = fArrCopyOf;
            this.component4[1] = jCurrentTimeMillis;
            this.getRevenue = getRevenue(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j2 - this.component1) {
            this.component1 = j2;
            if (Arrays.equals(fArr4, fArr)) {
                this.component4[1] = jCurrentTimeMillis;
                return;
            }
            double revenue = getRevenue(fArr3, fArr);
            if (revenue > this.getRevenue) {
                this.areAllFieldsValid[1] = Arrays.copyOf(fArr, fArr.length);
                this.component4[1] = jCurrentTimeMillis;
                this.getRevenue = revenue;
            }
        }
    }

    private boolean getCurrencyIso4217Code(int i2, String str, String str2) {
        return this.getMediationNetwork == i2 && this.AFAdRevenueData.equals(str) && this.getMonetizationNetwork.equals(str2);
    }

    private Map<String, Object> getMediationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getMediationNetwork));
        concurrentHashMap.put("sN", this.AFAdRevenueData);
        concurrentHashMap.put("sV", this.getMonetizationNetwork);
        float[] fArr = this.areAllFieldsValid[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getRevenue(fArr));
        }
        float[] fArr2 = this.areAllFieldsValid[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getRevenue(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean getMonetizationNetwork() {
        return this.areAllFieldsValid[0] != null;
    }

    private static double getRevenue(float[] fArr, float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i2 = 0; i2 < iMin; i2++) {
            dPow += StrictMath.pow(fArr[i2] - fArr2[i2], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    private static List<Float> getRevenue(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f2 : fArr) {
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    final void AFAdRevenueData(Map<AFj1nSDK, Map<String, Object>> map, boolean z2) {
        if (!getMonetizationNetwork()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, getMediationNetwork());
            return;
        }
        map.put(this, getMediationNetwork());
        if (z2) {
            int length = this.areAllFieldsValid.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.areAllFieldsValid[i2] = null;
            }
            int length2 = this.component4.length;
            for (int i3 = 0; i3 < length2; i3++) {
                this.component4[i3] = 0;
            }
            this.getRevenue = 0.0d;
            this.component1 = 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1nSDK)) {
            return false;
        }
        AFj1nSDK aFj1nSDK = (AFj1nSDK) obj;
        return getCurrencyIso4217Code(aFj1nSDK.getMediationNetwork, aFj1nSDK.AFAdRevenueData, aFj1nSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) throws Throwable {
        Looper looperMyLooper = Looper.myLooper();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Qd("FRGTPIC\fLO\t&HGG;G", (short) (FB.Xd() ^ 32470))).getDeclaredMethod(C1593ug.zd("cbrLajpOstvlz", (short) (OY.Xd() ^ 23510), (short) (OY.Xd() ^ 26207)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                this.component3.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1nSDK$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.G_(sensorEvent);
                    }
                });
            } else {
                G_(sensorEvent);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
