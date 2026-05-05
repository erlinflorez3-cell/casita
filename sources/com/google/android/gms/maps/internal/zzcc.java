package com.google.android.gms.maps.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcc {
    private static final String zza = "zzcc";
    private static Context zzb = null;
    private static zzf zzc = null;

    public static zzf zza(Context context, MapsInitializer.Renderer renderer) throws Throwable {
        Preconditions.checkNotNull(context);
        String str = zza;
        C1561oA.od("\u001e\u001f\u0011\u0011\u000f\u001b\u001a\f\nv\t\u0011\u0006\u0006\u0012\u0004\u0010V;", (short) (C1499aX.Xd() ^ (-1522))).concat(String.valueOf(String.valueOf(renderer)));
        zzf zzfVar = zzc;
        if (zzfVar != null) {
            return zzfVar;
        }
        int iIsGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (iIsGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
        zzf zzfVarZzd = zzd(context, renderer);
        zzc = zzfVarZzd;
        try {
            if (zzfVarZzd.zzd() == 2) {
                try {
                    zzc.zzm(ObjectWrapper.wrap(zzc(context, renderer)));
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                } catch (UnsatisfiedLinkError unused) {
                    String str2 = zza;
                    C1561oA.Kd("\u001d<QDFS\u007f6PVEYOZNROO8V\\Z5cdbf\u0015Wkl^gkpflf uq#ptgk(}rp,YOcUdf3\u0007z\u0005{}\f\u007f\u000eC\u0011>\u000e\u0002\u0016\f\u001a\nE\u0013\u0011\u000b\u001c\f\u001e&[Np%&\u0018!%* & Y/+\\32%`6+)d\u0012\f\u000f\n\r$k?3=46D8Ft?EKM?<@\u000b", (short) (OY.Xd() ^ 19466));
                    zzb = null;
                    zzc = zzd(context, MapsInitializer.Renderer.LEGACY);
                }
            }
            try {
                zzf zzfVar2 = zzc;
                Context contextZzc = zzc(context, renderer);
                contextZzc.getClass();
                Object[] objArr = new Object[0];
                Method method = Class.forName(Wg.Zd("\u0006o*m\u000fHs\u0016|Ik&\\Blm3\u0001@}C\u0013D", (short) (C1499aX.Xd() ^ (-25671)), (short) (C1499aX.Xd() ^ (-13193)))).getMethod(C1561oA.Xd("\f\u000b\u001by\u000e\u001d\u001a!\u001f\u0011\u0014#", (short) (FB.Xd() ^ 13661)), new Class[0]);
                try {
                    method.setAccessible(true);
                    zzfVar2.zzk(ObjectWrapper.wrap((Resources) method.invoke(contextZzc, objArr)), 18020000);
                    return zzc;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (RemoteException e4) {
                throw new RuntimeRemoteException(e4);
            }
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    private static Context zzb(Exception exc, Context context) {
        String str = zza;
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    private static Context zzc(Context context, MapsInitializer.Renderer renderer) {
        Context contextZzb;
        Context context2 = zzb;
        if (context2 != null) {
            return context2;
        }
        String str = renderer == MapsInitializer.Renderer.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextZzb = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, str).getModuleContext();
        } catch (Exception e2) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                contextZzb = zzb(e2, context);
            } else {
                try {
                    String str2 = zza;
                    contextZzb = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
                } catch (Exception e3) {
                    contextZzb = zzb(e3, context);
                }
            }
        }
        zzb = contextZzb;
        return contextZzb;
    }

    private static zzf zzd(Context context, MapsInitializer.Renderer renderer) throws Throwable {
        String str = zza;
        Wg.vd("l\u0002\r\f\n\u0004=a\n}z\u000f\u0003\u00075z\t~r\u007ftonzs\u0002", (short) (C1499aX.Xd() ^ (-31153)));
        Context contextZzc = zzc(context, renderer);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("AMBOKD>\u0007;FDI9AF~\u0013><A1C>", (short) (C1499aX.Xd() ^ (-15009)), (short) (C1499aX.Xd() ^ (-790)))).getMethod(hg.Vd("XUc1YM^]5WHJJV", (short) (Od.Xd() ^ (-10326)), (short) (Od.Xd() ^ (-17055))), new Class[0]);
        try {
            method.setAccessible(true);
            ClassLoader classLoader = (ClassLoader) method.invoke(contextZzc, objArr);
            short sXd = (short) (C1499aX.Xd() ^ (-25695));
            int[] iArr = new int["\u0010\u001b\u0018W\u0010\u0017\u0016\r\u0011\tP\u0003\u000f\u0004\u0011\r\u0006\u007fH\u0001\u0006\u000bD\u0003u\u0004\u0006?y}\u0003r~yku6JxjewqsIlni".length()];
            QB qb = new QB("\u0010\u001b\u0018W\u0010\u0017\u0016\r\u0011\tP\u0003\u000f\u0004\u0011\r\u0006\u007fH\u0001\u0006\u000bD\u0003u\u0004\u0006?y}\u0003r~yku6JxjewqsIlni");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            try {
                IBinder iBinder = (IBinder) zze(((ClassLoader) Preconditions.checkNotNull(classLoader)).loadClass(new String(iArr, 0, i2)));
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(C1561oA.yd("LWT\u0014T[ZQ]U\u001dOcXeab\\%]jo)gbpr,nrwg;6(2z\u0015\u000e<61C=G", (short) (C1499aX.Xd() ^ (-9585))));
                return iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new zze(iBinder);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException(C1561oA.Yd("\f&\u001a\u001c'!\\2._'+1(d*@6*74/l1;1DEr7DC\u0005?HIBHB\f@NETRMI\u0014NU\\\u0018XM]a\u001dY_fXfcWc&<l`]qmqInro", (short) (ZN.Xd() ^ 21192)), e2);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static Object zze(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(String.valueOf(cls.getName())), e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(String.valueOf(cls.getName())), e3);
        }
    }
}
