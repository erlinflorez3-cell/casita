package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.vision.L;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzt<T> {
    private final Context zza;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private T zzh;
    private final Object zzb = new Object();
    private boolean zzf = false;
    private boolean zzg = false;

    public zzt(Context context, String str, String str2) {
        this.zza = context;
        this.zzc = str;
        String strValueOf = String.valueOf("com.google.android.gms.vision.dynamite.");
        String strValueOf2 = String.valueOf(str2);
        this.zzd = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        this.zze = str2;
    }

    protected abstract T zza(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException;

    protected abstract void zza() throws RemoteException;

    public final boolean zzb() {
        return zzd() != null;
    }

    public final void zzc() {
        synchronized (this.zzb) {
            if (this.zzh == null) {
                return;
            }
            try {
                zza();
            } catch (RemoteException e2) {
                String str = this.zzc;
            }
        }
    }

    @InterfaceC1492Gx
    @RequiresNonNull({"#dS3n7Q", "4]N\"t\u0005Bo*)*x\r(&y", "&ZF3~1B\\\u0017!\u001d"})
    protected final T zzd() {
        DynamiteModule dynamiteModuleLoad;
        synchronized (this.zzb) {
            T t2 = this.zzh;
            if (t2 != null) {
                return t2;
            }
            try {
                dynamiteModuleLoad = DynamiteModule.load(this.zza, DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION, this.zzd);
            } catch (DynamiteModule.LoadingException unused) {
                String str = String.format(C1626yg.Ud("m\u001a2\u00134", (short) (C1499aX.Xd() ^ (-669)), (short) (C1499aX.Xd() ^ (-19725))), Ig.wd("5i\u001a~W\u0002\"J\u0004a(=vn)\r-*,\nT\u000b+{/9\u000ej+", (short) (ZN.Xd() ^ 25707)), this.zze);
                L.d(EO.Od("V\u001a\u001b}\u0019zD\u001bx),Gjj\u0002\\\tA?2i\u0010x\u0005\u001b^Ej_+2\u0017%\u0010,\b\u001asWBJlo8 >Q\u001a\u001cAw\u0004Za\u0005)$;p4\u001cBSF\u0015YS\u001cH", (short) (C1633zX.Xd() ^ (-11798))), str);
                try {
                    dynamiteModuleLoad = DynamiteModule.load(this.zza, DynamiteModule.PREFER_REMOTE, str);
                } catch (DynamiteModule.LoadingException e2) {
                    L.e(e2, C1561oA.Qd("f\u0013\u0012\u000e\u0010<\b\nz|\u0001\u0005|4\u0003\u0003\u0006y~|nx+wxl|rj$(u", (short) (C1633zX.Xd() ^ (-12416))), str);
                    if (!this.zzf) {
                        L.d(C1593ug.zd("^\u0010\u000e\u0001\u0005\u0005\u0004\u0017\u0019\u000f\u0015\u000fH\u000e\u001a#\u001b\u001a\u001e\u0011\u0015Q\u001c\")\u001b%,X *.\\\"$0&0')3)@gm=", (short) (C1499aX.Xd() ^ (-2752)), (short) (C1499aX.Xd() ^ (-19371))), this.zze);
                        String str2 = this.zze;
                        Intent intent = new Intent();
                        intent.setClassName(C1561oA.od("bmj*bih_c[#UaVc_XR\u001bSX]", (short) (C1580rY.Xd() ^ (-3476))), C1561oA.Kd("=JI\u000bENOHNH\u0012FTKZXSO\u001aT[b\u001eg[f]dd%<^j`jacmczDusfjji|~]qpsx\u0007v\u0005c\u0007\u0005\u000f\u0011", (short) (ZN.Xd() ^ 17280)));
                        intent.putExtra(Wg.Zd("i\u00124\u001d~/Sw!2#~0R\u0005*L_M3]\fn_v\u001d7e\tt/X\f\u0019Fh\u000e;`\u0007/q", (short) (C1607wl.Xd() ^ 27356), (short) (C1607wl.Xd() ^ 17629)), str2);
                        intent.setAction(C1561oA.Xd("N[Z\u001cV_`Y_Y#We\\kid`+els/xlwnuu6MO[Q[RT^Tk", (short) (C1499aX.Xd() ^ (-1464))));
                        Context context = this.zza;
                        Object[] objArr = {intent};
                        Method method = Class.forName(Wg.vd("We\\ka\\X#Q^^eOY`\u001b)VV]G[X", (short) (C1499aX.Xd() ^ (-25745)))).getMethod(hg.Vd("5&.#\u007f/+\u001c\u001e\u001c\u0019**", (short) (C1607wl.Xd() ^ 9847), (short) (C1607wl.Xd() ^ 3760)), Class.forName(Qg.kd("{\b|\n\u0006~xAu\u0001~\u0004s{\u00019Sw|lty", (short) (C1499aX.Xd() ^ (-5161)), (short) (C1499aX.Xd() ^ (-8025)))));
                        try {
                            method.setAccessible(true);
                            method.invoke(context, objArr);
                            this.zzf = true;
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    dynamiteModuleLoad = null;
                }
            }
            if (dynamiteModuleLoad != null) {
                try {
                    this.zzh = zza(dynamiteModuleLoad, this.zza);
                } catch (RemoteException | DynamiteModule.LoadingException e4) {
                    String str3 = this.zzc;
                    C1561oA.ud(")UTPR~AOA<NBF>uG9@AE5n<.@4@.g/'3(/'", (short) (C1607wl.Xd() ^ 30475));
                }
            }
            boolean z2 = this.zzg;
            if (!z2 && this.zzh == null) {
                String str4 = this.zzc;
                C1561oA.yd("i{\u000e\u0002\u000e{5|t\u0001u|t.{{ J#\u000e\u001cF\u0007\u001b\u0005\f\u000e\u0002\u0002\u000b\u0003J[\r\u001f/\u001d)*\u001e\"\u001aQ%\u001fN\u001c\u001cx::h0(4)0(o", (short) (Od.Xd() ^ (-28070)));
                this.zzg = true;
            } else if (z2 && this.zzh != null) {
                String str5 = this.zzc;
                short sXd = (short) (C1607wl.Xd() ^ 18677);
                int[] iArr = new int["\u0003\u0017+!/\u001fZ$\u001e,#,&a,7d46?h+A-6:02=7\u0001".length()];
                QB qb = new QB("\u0003\u0017+!/\u001fZ$\u001e,#,&a,7d46?h+A-6:02=7\u0001");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                new String(iArr, 0, i2);
            }
            return this.zzh;
        }
    }
}
