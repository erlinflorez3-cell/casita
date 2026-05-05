package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.CommonNotificationBuilder;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
class DisplayNotification {
    private static final int IMAGE_DOWNLOAD_TIMEOUT_SECONDS = 5;
    private final Context context;
    private final ExecutorService networkIoExecutor;
    private final NotificationParams params;

    public DisplayNotification(Context context, NotificationParams notificationParams, ExecutorService executorService) {
        this.networkIoExecutor = executorService;
        this.context = context;
        this.params = notificationParams;
    }

    private boolean isAppForeground() throws Throwable {
        Context context = this.context;
        String strQd = Xg.qd("gbwfubtg", (short) (OY.Xd() ^ 10669), (short) (OY.Xd() ^ 3308));
        Class<?> cls = Class.forName(Jg.Wd("\u0019c\u001ea%\\4C/x<O\u0007M\b\u0007zd(c\u001b\u0004\u0014", (short) (C1607wl.Xd() ^ 13873), (short) (C1607wl.Xd() ^ 17337)));
        Class<?>[] clsArr = {Class.forName(ZO.xd("0\u000fT~0yW\u000e'\u000b\f5:3\u0003_", (short) (C1499aX.Xd() ^ (-8613)), (short) (C1499aX.Xd() ^ (-20669))))};
        Object[] objArr = {strQd};
        short sXd = (short) (C1499aX.Xd() ^ (-25521));
        short sXd2 = (short) (C1499aX.Xd() ^ (-14513));
        int[] iArr = new int["\u000fTqR\u0018*&\u00184v*/a=+X".length()];
        QB qb = new QB("\u000fTqR\u0018*&\u00184v*/a=+X");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            if (((KeyguardManager) method.invoke(context, objArr)).inKeyguardRestrictedInputMode()) {
                return false;
            }
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10L);
            }
            int iMyPid = Process.myPid();
            Context context2 = this.context;
            Object[] objArr2 = {Ig.wd("sQ.\u0002%Jo\u0013", (short) (C1607wl.Xd() ^ 10227))};
            Method method2 = Class.forName(EO.Od("\u001by='t\u001c?0E`Y\u0006BI[6\u0019/uGwNx", (short) (OY.Xd() ^ 9124))).getMethod(C1593ug.zd("baqQxsugpWjx}qlo", (short) (Od.Xd() ^ (-19247)), (short) (Od.Xd() ^ (-26423))), Class.forName(C1561oA.Qd("ZPdN\u001aWKWO\u00159YVLPH", (short) (OY.Xd() ^ 6132))));
            try {
                method2.setAccessible(true);
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) method2.invoke(context2, objArr2)).getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    return false;
                }
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private void showNotification(CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfo) throws Throwable {
        if (Log.isLoggable(C1561oA.od("Vx\u0001rnl}nUlyxejkog", (short) (ZN.Xd() ^ 17291)), 3)) {
            C1561oA.Kd(" 6>G:@:sCEKA?C>=QGNN", (short) (C1499aX.Xd() ^ (-14232)));
        }
        Context context = this.context;
        Object[] objArr = {Wg.Zd("M\u00049\u00013\u0007S\u0003j\u000el9", (short) (C1607wl.Xd() ^ 27508), (short) (C1607wl.Xd() ^ 24439))};
        Method method = Class.forName(C1561oA.Xd("6D;JHC?\n@MMTFPW\u0012(UU\\Nb_", (short) (C1580rY.Xd() ^ (-4179)))).getMethod(Qg.kd("_\\jHmffV]BS_bTMN", (short) (C1499aX.Xd() ^ (-28945)), (short) (C1499aX.Xd() ^ (-26034))), Class.forName(Wg.vd("ias_)hZhn6Xzumoi", (short) (C1633zX.Xd() ^ (-22446)))));
        try {
            method.setAccessible(true);
            ((NotificationManager) method.invoke(context, objArr)).notify(displayNotificationInfo.tag, displayNotificationInfo.id, displayNotificationInfo.notificationBuilder.build());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private ImageDownload startImageDownloadInBackground() {
        ImageDownload imageDownloadCreate = ImageDownload.create(this.params.getString(Constants.MessageNotificationKeys.IMAGE_URL));
        if (imageDownloadCreate != null) {
            imageDownloadCreate.start(this.networkIoExecutor);
        }
        return imageDownloadCreate;
    }

    private void waitForAndApplyImageDownload(NotificationCompat.Builder builder, ImageDownload imageDownload) {
        if (imageDownload == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(imageDownload.getTask(), 5L, TimeUnit.SECONDS);
            builder.setLargeIcon(bitmap);
            builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
        } catch (InterruptedException unused) {
            imageDownload.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            String str = "Failed to download image: " + e2.getCause();
        } catch (TimeoutException unused2) {
            imageDownload.close();
        }
    }

    boolean handleNotification() throws Throwable {
        if (this.params.getBoolean(Constants.MessageNotificationKeys.NO_UI)) {
            return true;
        }
        if (isAppForeground()) {
            return false;
        }
        ImageDownload imageDownloadStartImageDownloadInBackground = startImageDownloadInBackground();
        CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfoCreateNotificationInfo = CommonNotificationBuilder.createNotificationInfo(this.context, this.params);
        waitForAndApplyImageDownload(displayNotificationInfoCreateNotificationInfo.notificationBuilder, imageDownloadStartImageDownloadInBackground);
        showNotification(displayNotificationInfoCreateNotificationInfo);
        return true;
    }
}
