package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public final class ServiceCompat {
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_Q = 255;
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U = 1073745919;
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
    }

    public static void startForeground(Service service, int i2, Notification notification, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.startForeground(service, i2, notification, i3);
        } else if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.startForeground(service, i2, notification, i3);
        } else {
            service.startForeground(i2, notification);
        }
    }

    public static void stopForeground(Service service, int i2) {
        Api24Impl.stopForeground(service, i2);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void stopForeground(Service service, int i2) {
            service.stopForeground(i2);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void startForeground(Service service, int i2, Notification notification, int i3) {
            if (i3 == 0 || i3 == -1) {
                service.startForeground(i2, notification, i3);
            } else {
                service.startForeground(i2, notification, (i3 + 255) - (i3 | 255));
            }
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static void startForeground(Service service, int i2, Notification notification, int i3) {
            if (i3 == 0 || i3 == -1) {
                service.startForeground(i2, notification, i3);
            } else {
                service.startForeground(i2, notification, (-1) - (((-1) - i3) | ((-1) - ServiceCompat.FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U)));
            }
        }
    }
}
