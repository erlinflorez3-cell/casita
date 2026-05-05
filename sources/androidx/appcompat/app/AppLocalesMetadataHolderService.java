package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public static ServiceInfo getServiceInfo(Context context) throws Throwable {
        int disabledComponentFlag = Api24Impl.getDisabledComponentFlag();
        int i2 = (disabledComponentFlag + 128) - (disabledComponentFlag & 128);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("\f\u001a\u0011 \u001e\u0019\u0015_\u0016##*\u001c&-g}++2$85", (short) (FB.Xd() ^ 10062), (short) (FB.Xd() ^ 13037))).getMethod(C1561oA.od("$!/\n\u001a\u001b\"\u0017\u001c\u0019\u007f\u0013\u001f\u0011\u0016\u0013\u001f", (short) (OY.Xd() ^ 26094)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            ComponentName componentName = new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class);
            Class<?> cls = Class.forName(C1561oA.Kd("&4+:83/y0==D6@G\u0002EC\u0005(:=F=DC,AOCJIW", (short) (OY.Xd() ^ 14283)));
            Class<?>[] clsArr = {Class.forName(Wg.Zd("\u001f\u000fZX44>6\u0002\u001evhH\u001b|%\u0014\f\u0018Ed-{\b'\t~tD", (short) (C1607wl.Xd() ^ 18125), (short) (C1607wl.Xd() ^ 17558))), Integer.TYPE};
            Object[] objArr2 = {componentName, Integer.valueOf(i2)};
            Method method2 = cls.getMethod(C1561oA.Xd("65E%8FK?:=\"HAK", (short) (ZN.Xd() ^ 16447)), clsArr);
            try {
                method2.setAccessible(true);
                return (ServiceInfo) method2.invoke(packageManager, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static class Api24Impl {
        static int getDisabledComponentFlag() {
            return 512;
        }

        private Api24Impl() {
        }
    }
}
