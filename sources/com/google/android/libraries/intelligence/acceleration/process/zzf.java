package com.google.android.libraries.intelligence.acceleration.process;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zzf implements LifecycleOwner {
    private static final zzf zzb = new zzf();
    private Handler zzg;
    private int zzc = 0;
    private int zzd = 0;
    private boolean zze = true;
    private boolean zzf = true;
    private final LifecycleRegistry zzh = new LifecycleRegistry(this);
    private final Runnable zzi = new zzb(this);
    final zzc zza = new zzc(this);

    private zzf() {
    }

    public static LifecycleOwner zza() {
        return zzb;
    }

    static void zzh(Context context) throws Throwable {
        zzf zzfVar = zzb;
        zzfVar.zzg = new Handler();
        zzfVar.zzh.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("\u001ccG6z9`*6\u0007\bg#\"<P\u0012L\u0004\u00129tR", (short) (OY.Xd() ^ 14090))).getMethod(C1561oA.Qd("\u0019\u0016$o\u001e\u001d\u0018\u0014\r\n\u001c\u0010\u0015\u0013f\u0012\u0010\u0015\u0005\u0017\u0012", (short) (FB.Xd() ^ 15687)), new Class[0]);
        try {
            method.setAccessible(true);
            Application application = (Application) ((Context) method.invoke(context, objArr));
            zze zzeVar = new zze(zzfVar);
            Class<?> cls = Class.forName(C1593ug.zd("R`Wfd_[&Zjk*>noljedxnuu", (short) (FB.Xd() ^ 17543), (short) (FB.Xd() ^ 12439)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1499aX.Xd() ^ (-17910));
            int[] iArr = new int["\t\u0015\n\u0017\u0013\f\u0006N\u0001\u000f\u000eJ\\\u000b\n\u0005\u0001yv\t|\u0002\u007f4Pq\u0002u\u0002s}\u0002Sokif{dldA^hg\\Z[bi".length()];
            QB qb = new QB("\t\u0015\n\u0017\u0013\f\u0006N\u0001\u000f\u000eJ\\\u000b\n\u0005\u0001yv\t|\u0002\u007f4Pq\u0002u\u0002s}\u0002Sokif{dldA^hg\\Z[bi");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr2 = {zzeVar};
            Method method2 = cls.getMethod(C1561oA.Kd("\u007fsvy\u0005\u0007x\u0007Vy\f\u0002\u0010\u0004\u0010\u0016i\b\u0006\u0006\u0005\u001c\u0007\u0011\u000bi\t\u0015\u0016\r\r\u0010\u0019\"", (short) (C1580rY.Xd() ^ (-26838))), clsArr);
            try {
                method2.setAccessible(true);
                method2.invoke(application, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.zzh;
    }

    final void zzb() {
        int i2 = this.zzd - 1;
        this.zzd = i2;
        if (i2 == 0) {
            Handler handler = this.zzg;
            Object[] objArr = {this.zzi, 0L};
            Method method = Class.forName(Wg.Zd("\u001an;@\u0014D\u0017V_y+\\,P=K\u001c_", (short) (C1607wl.Xd() ^ 1989), (short) (C1607wl.Xd() ^ 16565))).getMethod(Wg.vd("}{\u0003\u0003Mmwk\u000fy{", (short) (OY.Xd() ^ 23330)), Class.forName(C1561oA.Xd("ph~j8wm{u=b\u0007\u0001\u0002uw\u0003|", (short) (C1580rY.Xd() ^ (-3664)))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    final void zzc() {
        int i2 = this.zzd + 1;
        this.zzd = i2;
        if (i2 == 1) {
            if (!this.zze) {
                this.zzg.removeCallbacks(this.zzi);
            } else {
                this.zzh.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                this.zze = false;
            }
        }
    }

    final void zzd() {
        int i2 = this.zzc + 1;
        this.zzc = i2;
        if (i2 == 1 && this.zzf) {
            this.zzh.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.zzf = false;
        }
    }

    final void zze() {
        this.zzc--;
        zzg();
    }

    final void zzf() {
        if (this.zzd == 0) {
            this.zze = true;
            this.zzh.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    final void zzg() {
        if (this.zzc == 0 && this.zze) {
            this.zzh.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.zzf = true;
        }
    }
}
