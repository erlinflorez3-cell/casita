package com.google.android.libraries.intelligence.acceleration;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.libraries.intelligence.acceleration.process.zzf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public class ProcessStateObserver implements LifecycleObserver {
    private static final ProcessStateObserver zza = new ProcessStateObserver();

    ProcessStateObserver() {
    }

    public static ProcessStateObserver zza() {
        return zza;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        Analytics.zza(false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        Analytics.zza(true);
    }

    public final void zzb() {
        try {
            Analytics.zzb();
            Looper looperMyLooper = Looper.myLooper();
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.ud("\t\u0015\n\u0017\u0013\f\u0006N\u000f\u0012Kh\u000b\n\n}\n", (short) (C1580rY.Xd() ^ (-1321)))).getDeclaredMethod(C1561oA.yd("\u0007\u0004\u0012i\u0005\f\u0010l\u0017\u0016\u0016\n\u001e", (short) (ZN.Xd() ^ 14563)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                    zzf.zza().getLifecycle().addObserver(this);
                    return;
                }
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(C1561oA.Yd("esjywrn9{\u0001<[\u007f\u0001\u0003x\u0007", (short) (FB.Xd() ^ 11618))).getDeclaredMethod(Xg.qd("xw\bav\u007f\u0006d\t\n\f\u0002\u0010", (short) (Od.Xd() ^ (-7261)), (short) (Od.Xd() ^ (-12264))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    Handler handler = new Handler((Looper) declaredMethod2.invoke(null, objArr2));
                    Runnable runnable = new Runnable() { // from class: com.google.android.libraries.intelligence.acceleration.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzf.zza().getLifecycle().addObserver(this.zza);
                        }
                    };
                    Class<?> cls = Class.forName(Jg.Wd(")bVek^_UL\u0012\u001epG\u0002t}|G", (short) (Od.Xd() ^ (-32440)), (short) (Od.Xd() ^ (-23836))));
                    Class<?>[] clsArr = new Class[1];
                    short sXd = (short) (C1607wl.Xd() ^ 26967);
                    short sXd2 = (short) (C1607wl.Xd() ^ 22518);
                    int[] iArr = new int["nI\u007f\n$a#DFtlc%3yB\u0013\u0007".length()];
                    QB qb = new QB("nI\u007f\n$a#DFtlc%3yB\u0013\u0007");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                        i2++;
                    }
                    clsArr[0] = Class.forName(new String(iArr, 0, i2));
                    Object[] objArr3 = {runnable};
                    Method method = cls.getMethod(C1626yg.Ud("V\u001f'#", (short) (ZN.Xd() ^ 10025), (short) (ZN.Xd() ^ 29856)), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (UnsatisfiedLinkError unused) {
            short sXd3 = (short) (ZN.Xd() ^ 28039);
            int[] iArr2 = new int["l3-\t8g\b\u001aZ\u0006Mx\u0018->W\u0003zCw?o|z@AXh8p9\"QYd4C1\u001e2_3\u0011]~\u00197\u0006R U\u001bZK\r\u0005sD\u0012%s\u001dg\u000b`\fO%}rI\u001dke\f\u0018\"Py\u0014z\u007f\u0013DL!(\n\u0004\tdWa\tvX?9`2\u0007\u0016\t4z\u0005A0l_\u0010a\u0016B\u0016 \u0014_?\u0002XS\u0016\u000fgS\u001bA-\u0016{|\u0006p/\u0017\\\u0015JtwOu(\u000b\u0001\u0016c`\u0006-\u001b\u001f4\u0001\u000fRb\u001es%\u0018%?N*I`JG$5My\u0005a<?x!b`,\u0017A|v\u0002L\u000fH:\u001ei)X\u001a\u0019\u0005X\u0017\u000fv0()GPy\u0005\u001f\u0002\b\u0018P^\u0006f)i\u00063/\u0013 :\u001dopW'\nO\u0004\u0016Hg\u0012B\u00015\u0014ZA\b".length()];
            QB qb2 = new QB("l3-\t8g\b\u001aZ\u0006Mx\u0018->W\u0003zCw?o|z@AXh8p9\"QYd4C1\u001e2_3\u0011]~\u00197\u0006R U\u001bZK\r\u0005sD\u0012%s\u001dg\u000b`\fO%}rI\u001dke\f\u0018\"Py\u0014z\u007f\u0013DL!(\n\u0004\tdWa\tvX?9`2\u0007\u0016\t4z\u0005A0l_\u0010a\u0016B\u0016 \u0014_?\u0002XS\u0016\u000fgS\u001bA-\u0016{|\u0006p/\u0017\\\u0015JtwOu(\u000b\u0001\u0016c`\u0006-\u001b\u001f4\u0001\u000fRb\u001es%\u0018%?N*I`JG$5My\u0005a<?x!b`,\u0017A|v\u0002L\u000fH:\u001ei)X\u001a\u0019\u0005X\u0017\u000fv0()GPy\u0005\u001f\u0002\b\u0018P^\u0006f)i\u00063/\u0013 :\u001dopW'\nO\u0004\u0016Hg\u0012B\u00015\u0014ZA\b");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                i3++;
            }
            throw new UnsatisfiedLinkError(new String(iArr2, 0, i3));
        }
    }
}
