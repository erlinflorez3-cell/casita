package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.crashlytics.internal.Logger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
class BatteryState {
    static final int VELOCITY_CHARGING = 2;
    static final int VELOCITY_FULL = 3;
    static final int VELOCITY_UNPLUGGED = 1;
    private final Float level;
    private final boolean powerConnected;

    private BatteryState(Float f2, boolean z2) {
        this.powerConnected = z2;
        this.level = f2;
    }

    public static BatteryState get(Context context) throws Throwable {
        boolean zIsPowerConnected = false;
        Float level = null;
        try {
            IntentFilter intentFilter = new IntentFilter(Qg.kd("_k`mib\\%_chX`e\u001ePQaUZX\u0017*(:9)5;@#'\u001f+# \u001e", (short) (FB.Xd() ^ 3363), (short) (FB.Xd() ^ 29609)));
            Class<?> cls = Class.forName(hg.Vd("codqmf`)]hfk[ch!5`^cSe`", (short) (C1499aX.Xd() ^ (-5318)), (short) (C1499aX.Xd() ^ (-3452))));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.ud("4@5B>71y.97<,49q\u000540!#!\u001e//\f\u001e\u001b\u001c\u001f+\u0019%", (short) (ZN.Xd() ^ 21155)));
            clsArr[1] = Class.forName(C1561oA.yd("@NAPJE=\bJWSZHRU\u00108^aSY`/SclZh", (short) (C1580rY.Xd() ^ (-14361))));
            Object[] objArr = {null, intentFilter};
            short sXd = (short) (FB.Xd() ^ 15562);
            int[] iArr = new int["YMPS^`R`AUTW\\jZh".length()];
            QB qb = new QB("YMPS^`R`AUTW\\jZh");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                Intent intent = (Intent) method.invoke(context, objArr);
                if (intent != null) {
                    zIsPowerConnected = isPowerConnected(intent);
                    level = getLevel(intent);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalStateException e3) {
            Logger.getLogger().e(Xg.qd("!O\u0002HVWUY\bXMNa_`TT\u0011YXhi_e_\u0019\\\\pqcqy!uweyk5", (short) (OY.Xd() ^ 17787), (short) (OY.Xd() ^ 14978)), e3);
        }
        return new BatteryState(level, zIsPowerConnected);
    }

    private static Float getLevel(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean isPowerConnected(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float getBatteryLevel() {
        return this.level;
    }

    public int getBatteryVelocity() {
        Float f2;
        if (!this.powerConnected || (f2 = this.level) == null) {
            return 1;
        }
        return ((double) f2.floatValue()) < 0.99d ? 2 : 3;
    }

    boolean isPowerConnected() {
        return this.powerConnected;
    }
}
