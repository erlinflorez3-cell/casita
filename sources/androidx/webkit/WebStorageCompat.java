package androidx.webkit;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebStorage;
import androidx.webkit.internal.WebStorageAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class WebStorageCompat {
    private WebStorageCompat() {
    }

    public static void deleteBrowsingData(WebStorage webStorage, Executor executor, Runnable runnable) {
        if (WebViewFeatureInternal.DELETE_BROWSING_DATA.isSupportedByWebView()) {
            getAdapter(webStorage).deleteBrowsingData(executor, runnable);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void deleteBrowsingData(WebStorage webStorage, Runnable runnable) {
        deleteBrowsingData(webStorage, new Executor() { // from class: androidx.webkit.WebStorageCompat$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable2) throws Throwable {
                WebStorageCompat.lambda$deleteBrowsingData$0(runnable2);
            }
        }, runnable);
    }

    static /* synthetic */ void lambda$deleteBrowsingData$0(Runnable runnable) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Xg.qd("\u000e\u001c\u0013\" \u001b\u0017a$)d\u0004()+!/", (short) (C1633zX.Xd() ^ (-27071)), (short) (C1633zX.Xd() ^ (-29567)))).getDeclaredMethod(Jg.Wd(":\ra\u0014\u000em=\u0001m5\fj>", (short) (OY.Xd() ^ 27744), (short) (OY.Xd() ^ 29321)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Object[] objArr2 = {runnable};
            Method method = Class.forName(ZO.xd("\u0001m\u00105A>=`By1\u001f=\u0014vM\u000e0", (short) (C1499aX.Xd() ^ (-9611)), (short) (C1499aX.Xd() ^ (-16280)))).getMethod(Ig.wd("){\f6", (short) (OY.Xd() ^ 12717)), Class.forName(C1626yg.Ud("\u0017%\u001bb|,\u007f\u000335&<q\u000e3\u0014\u0001X", (short) (C1499aX.Xd() ^ (-17203)), (short) (C1499aX.Xd() ^ (-21045)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static String deleteBrowsingDataForSite(WebStorage webStorage, String str, Executor executor, Runnable runnable) {
        if (WebViewFeatureInternal.DELETE_BROWSING_DATA.isSupportedByWebView()) {
            return getAdapter(webStorage).deleteBrowsingDataForSite(str, executor, runnable);
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static String deleteBrowsingDataForSite(WebStorage webStorage, String str, Runnable runnable) {
        return deleteBrowsingDataForSite(webStorage, str, new Executor() { // from class: androidx.webkit.WebStorageCompat$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable2) throws Throwable {
                WebStorageCompat.lambda$deleteBrowsingDataForSite$1(runnable2);
            }
        }, runnable);
    }

    static /* synthetic */ void lambda$deleteBrowsingDataForSite$1(Runnable runnable) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(EO.Od("@{aNL\u00130\u0004\u0004\u000bA?\r\r\ba\u001b", (short) (C1499aX.Xd() ^ (-12984)))).getDeclaredMethod(C1561oA.Qd("pm{SfmqNpooco", (short) (Od.Xd() ^ (-31102))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Class<?> cls = Class.forName(C1593ug.zd("HVM\\ZUQ\u001c^c\u001f:TbYb\\j", (short) (Od.Xd() ^ (-31100)), (short) (Od.Xd() ^ (-4318))));
            Class<?>[] clsArr = {Class.forName(C1561oA.od("~t\tr>{o{s9\\~vuggph", (short) (C1580rY.Xd() ^ (-32644))))};
            Object[] objArr2 = {runnable};
            short sXd = (short) (OY.Xd() ^ 13534);
            int[] iArr = new int["OOTV".length()];
            QB qb = new QB("OOTV");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static WebStorageAdapter getAdapter(WebStorage webStorage) {
        return WebViewGlueCommunicator.getCompatConverter().convertWebStorage(webStorage);
    }
}
