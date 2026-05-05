package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AFh1mSDK {
    public Map<String, Object> AFAdRevenueData;
    public String areAllFieldsValid;
    public String component1;
    public String component2;
    public String component3;
    public int component4;
    public String copydefault;
    public AppsFlyerRequestListener getCurrencyIso4217Code;
    public final Map<String, String> getMediationNetwork;
    public String getMonetizationNetwork;
    public Map<String, Object> getRevenue;
    private byte[] hashCode;
    private final boolean toString;

    public AFh1mSDK() {
        this(null, null, null);
    }

    public AFh1mSDK(String str, String str2, Boolean bool) {
        this.AFAdRevenueData = new HashMap();
        this.getMediationNetwork = new HashMap();
        this.areAllFieldsValid = str;
        this.component2 = str2;
        this.toString = bool != null ? bool.booleanValue() : true;
    }

    public static boolean getRevenue(double d2) {
        if (d2 < 0.0d || d2 >= 1.0d) {
            return false;
        }
        if (d2 == 0.0d) {
            return true;
        }
        int i2 = (int) (1.0d / d2);
        if (i2 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i2)) + 1.0d)) != i2;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public abstract AFe1pSDK AFAdRevenueData();

    public final AFh1mSDK AFAdRevenueData(int i2) {
        this.component4 = i2;
        synchronized (this.AFAdRevenueData) {
            if (this.AFAdRevenueData.containsKey("counter")) {
                this.AFAdRevenueData.put("counter", Integer.toString(i2));
            }
            if (this.AFAdRevenueData.containsKey("launch_counter")) {
                this.AFAdRevenueData.put("launch_counter", Integer.toString(i2));
            }
        }
        return this;
    }

    public final AFh1mSDK AFAdRevenueData(Map<String, ?> map) {
        synchronized (map) {
            this.AFAdRevenueData.putAll(map);
        }
        return this;
    }

    public boolean areAllFieldsValid() {
        return false;
    }

    public boolean component1() {
        return true;
    }

    public boolean component4() {
        return true;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.toString;
    }

    public final AFh1mSDK getMediationNetwork(byte[] bArr) {
        this.hashCode = bArr;
        return this;
    }

    public boolean getMediationNetwork() {
        return true;
    }

    public final AFh1mSDK getMonetizationNetwork(String str, Object obj) {
        synchronized (this.AFAdRevenueData) {
            this.AFAdRevenueData.put(str, obj);
        }
        return this;
    }

    public final byte[] getMonetizationNetwork() {
        return this.hashCode;
    }

    public final boolean getRevenue() {
        return this.areAllFieldsValid == null && this.component3 == null;
    }
}
