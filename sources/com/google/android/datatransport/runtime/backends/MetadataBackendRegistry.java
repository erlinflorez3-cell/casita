package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
class MetadataBackendRegistry implements BackendRegistry {
    private static final String BACKEND_KEY_PREFIX = "backend:";
    private static final String TAG = "BackendRegistry";
    private final BackendFactoryProvider backendFactoryProvider;
    private final Map<String, TransportBackend> backends;
    private final CreationContextFactory creationContextFactory;

    static class BackendFactoryProvider {
        private final Context applicationContext;
        private Map<String, String> backendProviders = null;

        BackendFactoryProvider(Context context) {
            this.applicationContext = context;
        }

        private Map<String, String> discover(Context context) throws Throwable {
            Bundle metadata = getMetadata(context);
            if (metadata == null) {
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : metadata.keySet()) {
                Object obj = metadata.get(str);
                if ((obj instanceof String) && str.startsWith(MetadataBackendRegistry.BACKEND_KEY_PREFIX)) {
                    String[] strArrSplit = ((String) obj).split(",", -1);
                    for (String str2 : strArrSplit) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(MetadataBackendRegistry.BACKEND_KEY_PREFIX.length()));
                        }
                    }
                }
            }
            return map;
        }

        private Map<String, String> getBackendProviders() {
            if (this.backendProviders == null) {
                this.backendProviders = discover(this.applicationContext);
            }
            return this.backendProviders;
        }

        private static Bundle getMetadata(Context context) throws Throwable {
            C1561oA.ud("q\u0010\u0011\u0018\u0011\u0019\u000ez\r\u000e\u000f\u0018\u0018\u0015\u001b", (short) (C1499aX.Xd() ^ (-4728)));
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.yd("\u0012\u001e\u0017$$\u001d\u001bc\u001c').\"*3k\u0004/16*<;", (short) (FB.Xd() ^ 10258))).getMethod(C1561oA.Yd("DCS0BENELK4IWKRQ_", (short) (OY.Xd() ^ 12859)), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    if (packageManager == null) {
                        short sXd = (short) (C1580rY.Xd() ^ (-14339));
                        short sXd2 = (short) (C1580rY.Xd() ^ (-23527));
                        int[] iArr = new int["\u001fLLSEYV\u0003LFY\u0007VX\n;MPYPWV?TbV]\\j'".length()];
                        QB qb = new QB("\u001fLLSEYV\u0003LFY\u0007VX\n;MPYPWV?TbV]\\j'");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                            i2++;
                        }
                        new String(iArr, 0, i2);
                        return null;
                    }
                    ComponentName componentName = new ComponentName(context, (Class<?>) TransportBackendDiscovery.class);
                    Class<?> cls = Class.forName(Jg.Wd("&u\u001b\u0016>Go,\u0011y\u0004w\u0017\u0014F\u0010|7f<\u001bKAaw\u0012m0+)\u001cII", (short) (C1607wl.Xd() ^ 1357), (short) (C1607wl.Xd() ^ 8821)));
                    Class<?>[] clsArr = new Class[2];
                    short sXd3 = (short) (OY.Xd() ^ 8584);
                    short sXd4 = (short) (OY.Xd() ^ 17618);
                    int[] iArr2 = new int["\u0015,\"!1\nz}6Re\u001fy D>U\u007fd?)+,\u001da\\Ys\u0004".length()];
                    QB qb2 = new QB("\u0015,\"!1\nz}6Re\u001fy D>U\u007fd?)+,\u001da\\Ys\u0004");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                        i3++;
                    }
                    clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr2 = {componentName, 128};
                    Method method2 = cls.getMethod(C1626yg.Ud("`m5S=+\u000b& >3U\u0017S", (short) (Od.Xd() ^ (-16837)), (short) (Od.Xd() ^ (-8633))), clsArr);
                    try {
                        method2.setAccessible(true);
                        ServiceInfo serviceInfo = (ServiceInfo) method2.invoke(packageManager, objArr2);
                        if (serviceInfo != null) {
                            return serviceInfo.metaData;
                        }
                        Ig.wd("tC \u0011\u0015U|\u0017Z\f-\rfV?@V\u0010@j7t\f\u0017Rv_\u000fM\n\u00070\u0003zd*ZkdN\u0007vP4.f", (short) (C1580rY.Xd() ^ (-17136)));
                        return null;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                EO.Od("\u0006[O.d;WtD\t\b\u00191B0\u001anA|\fqbKW;\u00075", (short) (C1580rY.Xd() ^ (-2624)));
                return null;
            }
        }

        BackendFactory get(String str) {
            String str2 = getBackendProviders().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (BackendFactory) Class.forName(str2).asSubclass(BackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                String.format("Class %s is not found.", str2);
                return null;
            } catch (IllegalAccessException e3) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (InstantiationException e4) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (NoSuchMethodException e5) {
                String.format("Could not instantiate %s", str2);
                return null;
            } catch (InvocationTargetException e6) {
                String.format("Could not instantiate %s", str2);
                return null;
            }
        }
    }

    @Inject
    MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        this(new BackendFactoryProvider(context), creationContextFactory);
    }

    MetadataBackendRegistry(BackendFactoryProvider backendFactoryProvider, CreationContextFactory creationContextFactory) {
        this.backends = new HashMap();
        this.backendFactoryProvider = backendFactoryProvider;
        this.creationContextFactory = creationContextFactory;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    public synchronized TransportBackend get(String str) {
        if (this.backends.containsKey(str)) {
            return this.backends.get(str);
        }
        BackendFactory backendFactory = this.backendFactoryProvider.get(str);
        if (backendFactory == null) {
            return null;
        }
        TransportBackend transportBackendCreate = backendFactory.create(this.creationContextFactory.create(str));
        this.backends.put(str, transportBackendCreate);
        return transportBackendCreate;
    }
}
