package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static final String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private static final SparseArray<PowerManager.WakeLock> sActiveWakeLocks = new SparseArray<>();
    private static int mNextId = 1;

    public static ComponentName startWakefulService(Context context, Intent intent) {
        short sXd = (short) (Od.Xd() ^ (-14555));
        int[] iArr = new int["y\b~\u000e\f\u0007\u0003\u0018N\u0005\u0012\u0016\n_\u001e\tsnD".length()];
        QB qb = new QB("y\b~\u000e\f\u0007\u0003\u0018N\u0005\u0012\u0016\n_\u001e\tsnD");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        SparseArray<PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            int i3 = mNextId;
            int i4 = i3 + 1;
            mNextId = i4;
            if (i4 <= 0) {
                mNextId = 1;
            }
            intent.putExtra(C1561oA.Yd("@NETRMI^\u0015KXX_Q[b_QXWe\"Xeel^ho*t_jemqfonj", (short) (ZN.Xd() ^ 12843)), i3);
            Object[] objArr = {intent};
            Method method = Class.forName(Xg.qd("p~u\u0005\u0003}yDz\b\b\u000f\u0001\u000b\u0012Lb\u0010\u0010\u0017\t\u001d\u001a", (short) (C1580rY.Xd() ^ (-7412)), (short) (C1580rY.Xd() ^ (-10135)))).getMethod(ZO.xd("\tdk\u0004~x.\b\u0005\u0005\bY", (short) (C1499aX.Xd() ^ (-27371)), (short) (C1499aX.Xd() ^ (-12171))), Class.forName(Jg.Wd("Q^p^wQl\u0016gSnXEnP*!jL]Bh", (short) (ZN.Xd() ^ 18702), (short) (ZN.Xd() ^ 10659))));
            try {
                method.setAccessible(true);
                ComponentName componentName = (ComponentName) method.invoke(context, objArr);
                if (componentName == null) {
                    return null;
                }
                short sXd2 = (short) (C1633zX.Xd() ^ (-8017));
                short sXd3 = (short) (C1633zX.Xd() ^ (-24972));
                int[] iArr2 = new int["7\u001fPJ\t".length()];
                QB qb2 = new QB("7\u001fPJ\t");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i5 * sXd3))) + xuXd2.CK(iKK2));
                    i5++;
                }
                Object[] objArr2 = {new String(iArr2, 0, i5)};
                Method method2 = Class.forName(Ig.wd("\fCi\u001a|Q\"JHb]\f\u0011\"Fd,\\\u0002q+d@", (short) (C1499aX.Xd() ^ (-27656)))).getMethod(C1561oA.Qd("IFT2WPP@G,=IL>78", (short) (ZN.Xd() ^ 28050)), Class.forName(EO.Od("Dc->\u0014/}U)\u0002'd14?X", (short) (C1633zX.Xd() ^ (-21638)))));
                try {
                    method2.setAccessible(true);
                    PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) method2.invoke(context, objArr2)).newWakeLock(1, str + componentName.flattenToShortString());
                    wakeLockNewWakeLock.setReferenceCounted(false);
                    wakeLockNewWakeLock.acquire(StatsigLoggerKt.FLUSH_TIMER_MS);
                    sparseArray.put(i3, wakeLockNewWakeLock);
                    return componentName;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    public static boolean completeWakefulIntent(Intent intent) {
        int intExtra = intent.getIntExtra(EXTRA_WAKE_LOCK_ID, 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock == null) {
                String str = "No active wake lock id #" + intExtra;
                return true;
            }
            wakeLock.release();
            sparseArray.remove(intExtra);
            return true;
        }
    }
}
