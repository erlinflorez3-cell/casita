package com.google.android.gms.internal.gtm;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzxn {
    private static final Logger zza = Logger.getLogger(zzuq.class.getName());
    private static final String zzb = "com.google.android.gms.internal.gtm.zztr";

    zzxn() {
    }

    static zzxf zzb(Class cls) {
        String str;
        ClassLoader classLoader = zzxn.class.getClassLoader();
        if (cls.equals(zzxf.class)) {
            str = zzb;
        } else {
            if (!cls.getPackage().equals(zzxn.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return (zzxf) cls.cast(((zzxn) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
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
            Iterator it = ServiceLoader.load(zzxn.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzxf) cls.cast(((zzxn) it.next()).zza()));
                } catch (ServiceConfigurationError e6) {
                    zza.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(cls.getSimpleName())), (Throwable) e6);
                }
            }
            if (arrayList.size() == 1) {
                return (zzxf) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzxf) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }

    protected abstract zzxf zza();
}
