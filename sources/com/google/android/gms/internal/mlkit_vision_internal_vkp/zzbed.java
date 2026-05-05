package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbed {
    static zzbdv zzb(Class cls) {
        String str;
        ClassLoader classLoader = zzbed.class.getClassLoader();
        if (cls.equals(zzbdv.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(zzbed.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return (zzbdv) cls.cast(((zzbed) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                } catch (IllegalAccessException e2) {
                    throw new IllegalStateException(e2);
                } catch (InstantiationException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            } catch (InvocationTargetException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzbed.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzbdv) cls.cast(((zzbed) it.next()).zza()));
                } catch (ServiceConfigurationError e6) {
                    Logger.getLogger(zzbdq.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(cls.getSimpleName())), (Throwable) e6);
                }
            }
            if (arrayList.size() == 1) {
                return (zzbdv) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzbdv) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }

    protected abstract zzbdv zza();
}
