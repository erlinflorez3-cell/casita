package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.measurement.AppMeasurement;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbo {
    private static volatile DynamiteModule zza = null;
    private static volatile zzcr zzb = null;
    private static final Map zzc = new HashMap();
    private static final Map zzd = new HashMap();

    private zzbo() {
    }

    static IBinder zza(Context context) {
        try {
            try {
                return zzct.asInterface(zzg(context).instantiate("com.google.android.gms.tagmanager.TagManagerServiceProviderImpl")).getService(ObjectWrapper.wrap(context), zzh(context), new zzbn()).asBinder();
            } catch (RemoteException e2) {
                throw new IllegalStateException(e2);
            }
        } catch (DynamiteModule.LoadingException e3) {
            throw new RuntimeException(e3);
        }
    }

    static void zze(Context context) {
        zzcr zzcrVarZzi = zzi(context);
        synchronized (zzbo.class) {
            try {
                zzcrVarZzi.initialize(ObjectWrapper.wrap(context), zzh(context), new zzbn());
            } catch (RemoteException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    static void zzf(Intent intent, Context context) {
        zzcr zzcrVarZzi = zzi(context);
        synchronized (zzbo.class) {
            try {
                zzcrVarZzi.previewIntent(intent, ObjectWrapper.wrap(context), ObjectWrapper.wrap(zza.getModuleContext()), zzh(context), new zzbn());
            } catch (RemoteException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    private static DynamiteModule zzg(Context context) throws DynamiteModule.LoadingException {
        DynamiteModule dynamiteModuleLoad = zza;
        if (dynamiteModuleLoad == null) {
            synchronized (zzbo.class) {
                dynamiteModuleLoad = zza;
                if (zza == null) {
                    dynamiteModuleLoad = DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION, ModuleDescriptor.MODULE_ID);
                    zza = dynamiteModuleLoad;
                }
            }
        }
        return dynamiteModuleLoad;
    }

    private static zzco zzh(Context context) {
        return new zzbm(AppMeasurement.getInstance(context));
    }

    private static zzcr zzi(Context context) {
        zzcr zzcrVarAsInterface = zzb;
        if (zzcrVarAsInterface == null) {
            synchronized (zzbo.class) {
                zzcrVarAsInterface = zzb;
                if (zzcrVarAsInterface == null) {
                    try {
                        zzcrVarAsInterface = zzcq.asInterface(zzg(context).instantiate("com.google.android.gms.tagmanager.TagManagerApiImpl"));
                        zzb = zzcrVarAsInterface;
                    } catch (DynamiteModule.LoadingException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
        return zzcrVarAsInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object zzj(String str, Class cls) {
        Object objNewInstance = null;
        try {
            Class<?> cls2 = Class.forName(str);
            for (Class<?> cls3 : cls2.getInterfaces()) {
                if (cls3.equals(cls)) {
                    try {
                        try {
                            try {
                                try {
                                    objNewInstance = cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
                                    return objNewInstance;
                                } catch (IllegalAccessException unused) {
                                    String str2 = str + " doesn't have an accessible no-arg constructor";
                                    return objNewInstance;
                                } catch (NoSuchMethodException unused2) {
                                    String str3 = str + " doesn't have a valid no-arg constructor";
                                    return objNewInstance;
                                }
                            } catch (InstantiationException unused3) {
                                String str4 = str + " is an abstract class.";
                                return objNewInstance;
                            }
                        } catch (SecurityException unused4) {
                            String str5 = str + " doesn't have an accessible no-arg constructor";
                            return objNewInstance;
                        }
                    } catch (InvocationTargetException unused5) {
                        String str6 = str + " construction threw an exception.";
                        return objNewInstance;
                    }
                }
            }
            String str7 = str + " doesn't implement " + cls.getCanonicalName() + " interface.";
            return null;
        } catch (ClassNotFoundException unused6) {
            String.valueOf(str).concat(" can't be found in the application.");
            return objNewInstance;
        }
    }
}
