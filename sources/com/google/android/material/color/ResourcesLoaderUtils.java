package com.google.android.material.color;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
final class ResourcesLoaderUtils {
    private ResourcesLoaderUtils() {
    }

    static boolean addResourcesLoaderToContext(Context context, Map<Integer, Integer> map) throws Throwable {
        ResourcesLoader resourcesLoaderCreate = ColorResourcesLoaderCreator.create(context, map);
        if (resourcesLoaderCreate == null) {
            return false;
        }
        short sXd = (short) (ZN.Xd() ^ 17331);
        int[] iArr = new int["\"0'6,'#m\u001c))0\u001a$+es!!(\u0012&#".length()];
        QB qb = new QB("\"0'6,'#m\u001c))0\u001a$+es!!(\u0012&#");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd(".+9\u0016(5051!\"/", (short) (OY.Xd() ^ 4080), (short) (OY.Xd() ^ 21086)), new Class[0]);
        try {
            method.setAccessible(true);
            ((Resources) method.invoke(context, objArr)).addLoaders(resourcesLoaderCreate);
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static boolean isColorResource(int i2) {
        return 28 <= i2 && i2 <= 31;
    }
}
