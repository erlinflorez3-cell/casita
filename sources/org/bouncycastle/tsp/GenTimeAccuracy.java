package org.bouncycastle.tsp;

import com.dynatrace.android.agent.AdkSettings;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.tsp.Accuracy;

/* JADX INFO: loaded from: classes2.dex */
public class GenTimeAccuracy {
    private Accuracy accuracy;

    public GenTimeAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy;
    }

    private String format(int i2) {
        StringBuilder sb;
        if (i2 < 10) {
            sb = new StringBuilder("00");
        } else {
            if (i2 >= 100) {
                return Integer.toString(i2);
            }
            sb = new StringBuilder(AdkSettings.PLATFORM_TYPE_MOBILE);
        }
        return sb.append(i2).toString();
    }

    private int getTimeComponent(ASN1Integer aSN1Integer) {
        if (aSN1Integer != null) {
            return aSN1Integer.getValue().intValue();
        }
        return 0;
    }

    public int getMicros() {
        return getTimeComponent(this.accuracy.getMicros());
    }

    public int getMillis() {
        return getTimeComponent(this.accuracy.getMillis());
    }

    public int getSeconds() {
        return getTimeComponent(this.accuracy.getSeconds());
    }

    public String toString() {
        return getSeconds() + "." + format(getMillis()) + format(getMicros());
    }
}
