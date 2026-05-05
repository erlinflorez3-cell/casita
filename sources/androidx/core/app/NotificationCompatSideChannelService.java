package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.support.v4.app.INotificationSideChannel;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NotificationCompatSideChannelService extends Service {
    public abstract void cancel(String str, int i2, String str2);

    public abstract void cancelAll(String str);

    public abstract void notify(String str, int i2, String str2, Notification notification);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getAction().equals(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL);
        return null;
    }

    private class NotificationSideChannelStub extends INotificationSideChannel.Stub {
        NotificationSideChannelStub() {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(String str, int i2, String str2, Notification notification) throws Throwable {
            NotificationCompatSideChannelService.this.checkPermission(getCallingUid(), str);
            long jClearCallingIdentity = clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.notify(str, i2, str2, notification);
            } finally {
                restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(String str, int i2, String str2) throws Throwable {
            NotificationCompatSideChannelService.this.checkPermission(getCallingUid(), str);
            long jClearCallingIdentity = clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancel(str, i2, str2);
            } finally {
                restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(String str) throws Throwable {
            NotificationCompatSideChannelService.this.checkPermission(getCallingUid(), str);
            long jClearCallingIdentity = clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancelAll(str);
            } finally {
                restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    void checkPermission(int i2, String str) throws Throwable {
        PackageManager packageManager = getPackageManager();
        Class<?> cls = Class.forName(Ig.wd("pD\u0018\u0006\u001aOfgJB+\u000bMdJ]{Vn9\bM/)\rNQ\f]\\|\u0013N", (short) (OY.Xd() ^ 23310)));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        short sXd = (short) (C1499aX.Xd() ^ (-6263));
        int[] iArr = new int["\u001cLM\u0006f5Ms$\u0013\u001fS+(\u0013\u00065".length()];
        QB qb = new QB("\u001cLM\u0006f5Ms$\u0013\u001fS+(\u0013\u00065");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            String[] strArr = (String[]) method.invoke(packageManager, objArr);
            for (String str2 : strArr) {
                if (str2.equals(str)) {
                    return;
                }
            }
            short sXd2 = (short) (ZN.Xd() ^ 11539);
            int[] iArr2 = new int["-MQEAC<9K?DB&;55\u00126.:9/5\u001b,8;-&'z_\u0014'![".length()];
            QB qb2 = new QB("-MQEAC<9K?DB&;55\u00126.:9/5\u001b,8;-&'z_\u0014'![");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i4 + xuXd2.CK(iKK2));
                i4++;
            }
            StringBuilder sbAppend = new StringBuilder(new String(iArr2, 0, i4)).append(i2);
            short sXd3 = (short) (C1580rY.Xd() ^ (-17713));
            short sXd4 = (short) (C1580rY.Xd() ^ (-26518));
            int[] iArr3 = new int["e0;h8:@l/DD9AE=O;;w?IM{M?BKBIH\u0004".length()];
            QB qb3 = new QB("e0;h8:@l/DD9AE=O;;w?IM{M?BKBIH\u0004");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i5)) - sXd4);
                i5++;
            }
            throw new SecurityException(sbAppend.append(new String(iArr3, 0, i5)).append(str).toString());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
