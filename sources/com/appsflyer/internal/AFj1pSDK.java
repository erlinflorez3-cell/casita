package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.appsflyer.AFLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1pSDK implements AFj1lSDK {
    private static final BitSet component2;
    boolean AFAdRevenueData;
    private final Map<AFj1nSDK, AFj1nSDK> areAllFieldsValid;
    private final SensorManager component1;
    private final Map<AFj1nSDK, Map<String, Object>> component3;
    private final ExecutorService component4;
    private boolean copy;
    private final Runnable equals;
    final Runnable getCurrencyIso4217Code;
    final Runnable getMediationNetwork;
    final Object getMonetizationNetwork;
    final Handler getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1pSDK$2 */
    final class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFj1pSDK.this.getMonetizationNetwork) {
                AFj1pSDK.this.getRevenue();
                Handler handler = AFj1pSDK.this.getRevenue;
                Runnable runnable = AFj1pSDK.this.getCurrencyIso4217Code;
                Class<?> cls = Class.forName(C1561oA.od("AMBOKD>\u0007GJ\u0004\u001d5A6=5A", (short) (Od.Xd() ^ (-6077))));
                Class<?>[] clsArr = {Class.forName(C1561oA.Kd("sk\u0002m;zp~x@e\n\u0004\u0005xz\u0006\u007f", (short) (C1607wl.Xd() ^ 2889))), Long.TYPE};
                Object[] objArr = {runnable, 150L};
                short sXd = (short) (C1633zX.Xd() ^ (-14825));
                short sXd2 = (short) (C1633zX.Xd() ^ (-14792));
                int[] iArr = new int["W@ib[k\u0018DFaE".length()];
                QB qb = new QB("W@ib[k\u0018DFaE");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                    AFj1pSDK.this.AFAdRevenueData = true;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1pSDK$5 */
    final class AnonymousClass5 implements Runnable {
        AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFj1pSDK.this.getMonetizationNetwork) {
                if (AFj1pSDK.this.AFAdRevenueData) {
                    AFj1pSDK.this.getRevenue.removeCallbacks(AFj1pSDK.this.getMediationNetwork);
                    AFj1pSDK.this.getRevenue.removeCallbacks(AFj1pSDK.this.getCurrencyIso4217Code);
                    AFj1pSDK.this.getCurrencyIso4217Code();
                    AFj1pSDK.this.AFAdRevenueData = false;
                }
            }
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        component2 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    public AFj1pSDK(Context context, ExecutorService executorService) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 15749);
        int[] iArr = new int["\u001e,#20+'q(55<.8?y\u0010==D6JG".length()];
        QB qb = new QB("\u001e,#20+'q(55<.8?y\u0010==D6JG");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (OY.Xd() ^ 11391);
        int[] iArr2 = new int["\u0007\u0006\u0016c\u0014\u0015\u0012\u0010zy\u000e\u0004\u000b\u000b`\u000e\u001e%\u0017+(".length()];
        QB qb2 = new QB("\u0007\u0006\u0016c\u0014\u0015\u0012\u0010zy\u000e\u0004\u000b\u000b`\u000e\u001e%\u0017+(");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Object[] objArr2 = {Qg.kd(")\u001a\"&!#", (short) (Od.Xd() ^ (-32167)), (short) (Od.Xd() ^ (-26701)))};
            Method method2 = Class.forName(hg.Vd("BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?", (short) (ZN.Xd() ^ 989), (short) (ZN.Xd() ^ 24902))).getMethod(C1561oA.yd("\u001b\u001a&\u00061,*\u001c\u0019\u007f\u000f\u001d&\u001a\u0011\u0014", (short) (C1607wl.Xd() ^ 14256)), Class.forName(C1561oA.ud("5+?)t2&2*o\u001441'+#", (short) (ZN.Xd() ^ 1103))));
            try {
                method2.setAccessible(true);
                SensorManager sensorManager = (SensorManager) method2.invoke(context2, objArr2);
                HandlerThread handlerThread = new HandlerThread(C1561oA.Yd("@FM?MJ>J", (short) (Od.Xd() ^ (-14604))));
                handlerThread.start();
                this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private AFj1pSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.getMonetizationNetwork = new Object();
        BitSet bitSet = component2;
        this.areAllFieldsValid = new HashMap(bitSet.size());
        this.component3 = new ConcurrentHashMap(bitSet.size());
        this.getMediationNetwork = new Runnable() { // from class: com.appsflyer.internal.AFj1pSDK.2
            AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1pSDK.this.getMonetizationNetwork) {
                    AFj1pSDK.this.getRevenue();
                    Handler handler2 = AFj1pSDK.this.getRevenue;
                    Runnable runnable = AFj1pSDK.this.getCurrencyIso4217Code;
                    Class<?> cls = Class.forName(C1561oA.od("AMBOKD>\u0007GJ\u0004\u001d5A6=5A", (short) (Od.Xd() ^ (-6077))));
                    Class<?>[] clsArr = {Class.forName(C1561oA.Kd("sk\u0002m;zp~x@e\n\u0004\u0005xz\u0006\u007f", (short) (C1607wl.Xd() ^ 2889))), Long.TYPE};
                    Object[] objArr = {runnable, 150L};
                    short sXd = (short) (C1633zX.Xd() ^ (-14825));
                    short sXd2 = (short) (C1633zX.Xd() ^ (-14792));
                    int[] iArr = new int["W@ib[k\u0018DFaE".length()];
                    QB qb = new QB("W@ib[k\u0018DFaE");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                        i2++;
                    }
                    Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler2, objArr);
                        AFj1pSDK.this.AFAdRevenueData = true;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        };
        this.getCurrencyIso4217Code = new Runnable() { // from class: com.appsflyer.internal.AFj1pSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.component3();
            }
        };
        this.equals = new Runnable() { // from class: com.appsflyer.internal.AFj1pSDK.5
            AnonymousClass5() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1pSDK.this.getMonetizationNetwork) {
                    if (AFj1pSDK.this.AFAdRevenueData) {
                        AFj1pSDK.this.getRevenue.removeCallbacks(AFj1pSDK.this.getMediationNetwork);
                        AFj1pSDK.this.getRevenue.removeCallbacks(AFj1pSDK.this.getCurrencyIso4217Code);
                        AFj1pSDK.this.getCurrencyIso4217Code();
                        AFj1pSDK.this.AFAdRevenueData = false;
                    }
                }
            }
        };
        this.component1 = sensorManager;
        this.getRevenue = handler;
        this.component4 = executorService;
    }

    private List<Map<String, Object>> areAllFieldsValid() {
        synchronized (this.getMonetizationNetwork) {
            if (!this.areAllFieldsValid.isEmpty() && this.copy) {
                Iterator<AFj1nSDK> it = this.areAllFieldsValid.values().iterator();
                while (it.hasNext()) {
                    it.next().AFAdRevenueData(this.component3, false);
                }
            }
            if (this.component3.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.component3.values());
        }
    }

    private List<Map<String, Object>> component1() {
        synchronized (this.getMonetizationNetwork) {
            Iterator<AFj1nSDK> it = this.areAllFieldsValid.values().iterator();
            while (it.hasNext()) {
                it.next().AFAdRevenueData(this.component3, true);
            }
            if (this.component3.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.component3.values());
        }
    }

    public /* synthetic */ void component2() {
        try {
            for (Sensor sensor : this.component1.getSensorList(-1)) {
                if (getCurrencyIso4217Code(sensor.getType())) {
                    AFj1nSDK aFj1nSDK = new AFj1nSDK(sensor, this.component4);
                    if (!this.areAllFieldsValid.containsKey(aFj1nSDK)) {
                        this.areAllFieldsValid.put(aFj1nSDK, aFj1nSDK);
                    }
                    this.component1.registerListener(this.areAllFieldsValid.get(aFj1nSDK), sensor, 1, this.getRevenue);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.copy = true;
    }

    public /* synthetic */ void component3() {
        synchronized (this.getMonetizationNetwork) {
            Handler handler = this.getRevenue;
            Object[] objArr = {new AFj1pSDK$$ExternalSyntheticLambda0(this)};
            Method method = Class.forName(Xg.qd("r\u0001w\u0007\u0005\u007f{F\t\u000eId~\r\u0004\r\u0007\u0015", (short) (C1580rY.Xd() ^ (-23205)), (short) (C1580rY.Xd() ^ (-8904)))).getMethod(ZO.xd("oOw\f", (short) (C1580rY.Xd() ^ (-2268)), (short) (C1580rY.Xd() ^ (-20325))), Class.forName(Jg.Wd("\u0006\u0012JHOAI\u001a.\u0018~5G\u001b!EJ&", (short) (OY.Xd() ^ 7068), (short) (OY.Xd() ^ 3101))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public /* synthetic */ void component4() {
        try {
            if (!this.areAllFieldsValid.isEmpty()) {
                for (AFj1nSDK aFj1nSDK : this.areAllFieldsValid.values()) {
                    this.component1.unregisterListener(aFj1nSDK);
                    aFj1nSDK.AFAdRevenueData(this.component3, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.copy = false;
    }

    private static boolean getCurrencyIso4217Code(int i2) {
        return i2 >= 0 && component2.get(i2);
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final void AFAdRevenueData() throws Throwable {
        Handler handler = this.getRevenue;
        Object[] objArr = {this.equals};
        Method method = Class.forName(C1626yg.Ud("Bx\"u>%'Z\fN\u0005el~\u0017t6\u0018", (short) (C1607wl.Xd() ^ 4884), (short) (C1607wl.Xd() ^ 30604))).getMethod(EO.Od("\u001fe7\u001c", (short) (C1607wl.Xd() ^ 7574)), Class.forName(Ig.wd("\u0019G\u000b\rBD%\u0002<\"H\u000eXNA\fM`", (short) (C1607wl.Xd() ^ 32267))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
            Handler handler2 = this.getRevenue;
            Runnable runnable = this.getMediationNetwork;
            Class<?> cls = Class.forName(C1561oA.Qd("nzo|xqk4tw1Jbncjbn", (short) (C1580rY.Xd() ^ (-8744))));
            Class<?>[] clsArr = {Class.forName(C1593ug.zd("\u000e\u0006\u001c\bU\u0015\u000b\u0019\u0013Z\u007f$\u001e\u001f\u0013\u0015 \u001a", (short) (C1633zX.Xd() ^ (-24828)), (short) (C1633zX.Xd() ^ (-19661))))};
            Object[] objArr2 = {runnable};
            short sXd = (short) (OY.Xd() ^ 8804);
            int[] iArr = new int["-+..".length()];
            QB qb = new QB("-+..");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method2.setAccessible(true);
                method2.invoke(handler2, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    final void getCurrencyIso4217Code() throws Throwable {
        Handler handler = this.getRevenue;
        Object[] objArr = {new AFj1pSDK$$ExternalSyntheticLambda0(this)};
        Method method = Class.forName(C1561oA.Kd("\u001b) /-($n16q\r'5,5/=", (short) (C1607wl.Xd() ^ 1268))).getMethod(C1561oA.Xd("^^ce", (short) (OY.Xd() ^ 12944)), Class.forName(Wg.Zd("*\u0011W1)6\u0001<!\u0016\f?fTyJ?M", (short) (C1499aX.Xd() ^ (-4418)), (short) (C1499aX.Xd() ^ (-29007)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final Map<String, Object> getMediationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listAreAllFieldsValid = areAllFieldsValid();
        if (listAreAllFieldsValid.isEmpty()) {
            List<Map<String, Object>> listComponent1 = component1();
            if (!listComponent1.isEmpty()) {
                concurrentHashMap.put("sensors", listComponent1);
            }
        } else {
            concurrentHashMap.put("sensors", listAreAllFieldsValid);
        }
        return concurrentHashMap;
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final synchronized void getMonetizationNetwork() {
        Handler handler = this.getRevenue;
        Runnable runnable = this.equals;
        Class<?> cls = Class.forName(Wg.vd("UcZigb^)kp,GaofoIW", (short) (FB.Xd() ^ 668)));
        Class<?>[] clsArr = {Class.forName(Qg.kd("\u0011\u0007\u001b\u0005P\u000e\u0002\u000e\u0006Kn\u0011\t\byy\u0003z", (short) (C1607wl.Xd() ^ 22044), (short) (C1607wl.Xd() ^ 24199)))};
        Object[] objArr = {runnable};
        short sXd = (short) (C1607wl.Xd() ^ 6170);
        short sXd2 = (short) (C1607wl.Xd() ^ 13067);
        int[] iArr = new int["\u0006\u0004\u0007\u0007".length()];
        QB qb = new QB("\u0006\u0004\u0007\u0007");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    final void getRevenue() throws Throwable {
        Handler handler = this.getRevenue;
        Object[] objArr = {new Runnable() { // from class: com.appsflyer.internal.AFj1pSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.component2();
            }
        }};
        Method method = Class.forName(C1561oA.ud("\r\u0019\u000e\u001b\u0017\u0010\nR\u0013\u0016Oh\u0001\r\u0002\t\u0001\r", (short) (Od.Xd() ^ (-2341)))).getMethod(C1561oA.Yd("ootv", (short) (ZN.Xd() ^ 12667)), Class.forName(C1561oA.yd("G=U?\u000fLDP<\u0002)KGF<<91", (short) (Od.Xd() ^ (-2740)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
