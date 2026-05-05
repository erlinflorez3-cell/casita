package androidx.webkit.internal;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.webkit.ServiceWorkerClientCompat;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1607wl;
import yg.C1626yg;
import yg.Ig;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class ApiHelperForN {
    private ApiHelperForN() {
    }

    public static File getDataDir(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("+T? }N)T+o$\"Ar\u0005#&v\u0007T\u0003E\u0004", (short) (C1607wl.Xd() ^ 19847), (short) (C1607wl.Xd() ^ 23730))).getMethod(Ig.wd("]\u0013P8.\u0004T\u0010y\u000f", (short) (ZN.Xd() ^ 3938)), new Class[0]);
        try {
            method.setAccessible(true);
            return (File) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static ServiceWorkerController getServiceWorkerControllerInstance() {
        return ServiceWorkerController.getInstance();
    }

    public static ServiceWorkerWebSettings getServiceWorkerWebSettings(ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    public static ServiceWorkerWebSettingsImpl getServiceWorkerWebSettingsImpl(ServiceWorkerController serviceWorkerController) {
        return new ServiceWorkerWebSettingsImpl(getServiceWorkerWebSettings(serviceWorkerController));
    }

    public static void setServiceWorkerClient(ServiceWorkerController serviceWorkerController, ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    public static void setServiceWorkerClientCompat(ServiceWorkerController serviceWorkerController, ServiceWorkerClientCompat serviceWorkerClientCompat) {
        serviceWorkerController.setServiceWorkerClient(new FrameworkServiceWorkerClient(serviceWorkerClientCompat));
    }

    public static void setCacheMode(ServiceWorkerWebSettings serviceWorkerWebSettings, int i2) {
        serviceWorkerWebSettings.setCacheMode(i2);
    }

    public static int getCacheMode(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    public static void setAllowContentAccess(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z2) {
        serviceWorkerWebSettings.setAllowContentAccess(z2);
    }

    public static boolean getAllowContentAccess(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    public static void setAllowFileAccess(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z2) {
        serviceWorkerWebSettings.setAllowFileAccess(z2);
    }

    public static boolean getAllowFileAccess(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    public static void setBlockNetworkLoads(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z2) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z2);
    }

    public static boolean getBlockNetworkLoads(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }

    public static boolean isRedirect(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    public static void setDisabledActionModeMenuItems(WebSettings webSettings, int i2) {
        webSettings.setDisabledActionModeMenuItems(i2);
    }

    public static int getDisabledActionModeMenuItems(WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }
}
