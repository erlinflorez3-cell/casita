package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.firebase.inject.Provider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public final class ComponentDiscovery<T> {
    private static final String COMPONENT_KEY_PREFIX = "com.google.firebase.components:";
    private static final String COMPONENT_SENTINEL_VALUE = "com.google.firebase.components.ComponentRegistrar";
    static final String TAG = "ComponentDiscovery";
    private final T context;
    private final RegistrarNameRetriever<T> retriever;

    private static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever<Context> {
        private final Class<? extends Service> discoveryService;

        private MetadataRegistrarNameRetriever(Class<? extends Service> cls) {
            this.discoveryService = cls;
        }

        /* synthetic */ MetadataRegistrarNameRetriever(Class cls, AnonymousClass1 anonymousClass1) {
            this(cls);
        }

        private Bundle getMetadata(Context context) throws Throwable {
            short sXd = (short) (ZN.Xd() ^ 11589);
            short sXd2 = (short) (ZN.Xd() ^ 23554);
            int[] iArr = new int["fDl\u0012;]?j;-{g\u00020bsK5".length()];
            QB qb = new QB("fDl\u0012;]?j;-{g\u00020bsK5");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            new String(iArr, 0, i2);
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Xd("4B9HFA=\b>KKRDNU\u0010&SSZL`]", (short) (Od.Xd() ^ (-6728)))).getMethod(Wg.vd("#\".\u000b\u0019\u001c!\u0018\u001b\u001a~\u0014\u001e\u0012\u0015\u0014\u001e", (short) (C1499aX.Xd() ^ (-18067))), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    if (packageManager == null) {
                        Qg.kd("k\u0017\u0015\u001a\n\u001c\u0017A\t\u0001\u0012=\u000b\u000b:iyz\u0002v{x_r~pur~9", (short) (ZN.Xd() ^ 7131), (short) (ZN.Xd() ^ 23075));
                        return null;
                    }
                    ComponentName componentName = new ComponentName(context, this.discoveryService);
                    Class<?> cls = Class.forName(hg.Vd("\b\u0014\t\u0016\u0012\u000b\u0005M\u0002\r\u000b\u0010\u007f\b\rE\u0007\u0003Bcst{purYlxjolx", (short) (C1499aX.Xd() ^ (-2628)), (short) (C1499aX.Xd() ^ (-8500))));
                    Class<?>[] clsArr = new Class[2];
                    short sXd3 = (short) (Od.Xd() ^ (-29992));
                    int[] iArr2 = new int["\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0011\u0013\u0011\u000f\u0005\r\u0012j|\b~".length()];
                    QB qb2 = new QB("\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0011\u0013\u0011\u000f\u0005\r\u0012j|\b~");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                        i3++;
                    }
                    clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr2 = {componentName, 128};
                    short sXd4 = (short) (FB.Xd() ^ 1976);
                    int[] iArr3 = new int["EBP.GSVH9:\u001dA@H".length()];
                    QB qb3 = new QB("EBP.GSVH9:\u001dA@H");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
                        i4++;
                    }
                    Method method2 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                    try {
                        method2.setAccessible(true);
                        ServiceInfo serviceInfo = (ServiceInfo) method2.invoke(packageManager, objArr2);
                        if (serviceInfo != null) {
                            return serviceInfo.metaData;
                        }
                        String str = this.discoveryService + C1561oA.Yd("\u0018a[n\u001ckm\u001fsftymhk'qwpz:", (short) (C1499aX.Xd() ^ (-2529)));
                        return null;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Xg.qd("l\u001d\u001e\u001b\u0019\u0014\u0013'\u001d$$V!' *[+-3_'182)s", (short) (C1633zX.Xd() ^ (-1352)), (short) (C1633zX.Xd() ^ (-1405)));
                return null;
            }
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        public List<String> retrieve(Context context) throws Throwable {
            Bundle metadata = getMetadata(context);
            if (metadata == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : metadata.keySet()) {
                if (ComponentDiscovery.COMPONENT_SENTINEL_VALUE.equals(metadata.get(str)) && str.startsWith(ComponentDiscovery.COMPONENT_KEY_PREFIX)) {
                    arrayList.add(str.substring(ComponentDiscovery.COMPONENT_KEY_PREFIX.length()));
                }
            }
            return arrayList;
        }
    }

    interface RegistrarNameRetriever<T> {
        List<String> retrieve(T t2);
    }

    ComponentDiscovery(T t2, RegistrarNameRetriever<T> registrarNameRetriever) {
        this.context = t2;
        this.retriever = registrarNameRetriever;
    }

    public static ComponentDiscovery<Context> forContext(Context context, Class<? extends Service> cls) {
        return new ComponentDiscovery<>(context, new MetadataRegistrarNameRetriever(cls));
    }

    public static ComponentRegistrar instantiate(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, COMPONENT_SENTINEL_VALUE));
        } catch (ClassNotFoundException unused) {
            String.format("Class %s is not an found.", str);
            return null;
        } catch (IllegalAccessException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (InstantiationException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e3);
        } catch (NoSuchMethodException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        } catch (InvocationTargetException e5) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e5);
        }
    }

    @Deprecated
    public List<ComponentRegistrar> discover() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.retriever.retrieve(this.context).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar componentRegistrarInstantiate = instantiate(it.next());
                if (componentRegistrarInstantiate != null) {
                    arrayList.add(componentRegistrarInstantiate);
                }
            } catch (InvalidRegistrarException e2) {
            }
        }
        return arrayList;
    }

    public List<Provider<ComponentRegistrar>> discoverLazy() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.retriever.retrieve(this.context)) {
            arrayList.add(new Provider() { // from class: com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentDiscovery.instantiate(str);
                }
            });
        }
        return arrayList;
    }
}
