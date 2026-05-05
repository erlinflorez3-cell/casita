package io.sentry.android.core.internal.modules;

import android.content.Context;
import android.content.res.AssetManager;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.ContextUtils;
import io.sentry.internal.modules.ModulesLoader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class AssetsModulesLoader extends ModulesLoader {
    private final Context context;

    public AssetsModulesLoader(Context context, ILogger iLogger) {
        super(iLogger);
        this.context = ContextUtils.getApplicationContext(context);
        new Thread(new Runnable() { // from class: io.sentry.android.core.internal.modules.AssetsModulesLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8923x4ed4c915();
            }
        }).start();
    }

    /* JADX INFO: renamed from: lambda$new$0$io-sentry-android-core-internal-modules-AssetsModulesLoader, reason: not valid java name */
    /* synthetic */ void m8923x4ed4c915() {
        getOrLoadModules();
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    protected Map<String, String> loadModules() throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-14806));
        short sXd2 = (short) (Od.Xd() ^ (-6347));
        int[] iArr = new int["\u0019G\u001ah8FD>\u001a]_3x*~HS%b|5rJU%p/".length()];
        QB qb = new QB("\u0019G\u001ah8FD>\u001a]_3x*~HS%b|5rJU%p/");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        TreeMap treeMap = new TreeMap();
        try {
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("d\u0007\u0010#\u001d\u0002\u001f:g(+w?F\u0014kn$wSq\u0006(", (short) (ZN.Xd() ^ 20334), (short) (ZN.Xd() ^ 26695))).getMethod(C1626yg.Ud("\u0016v\u0015sGR/7:", (short) (C1580rY.Xd() ^ (-13625)), (short) (C1580rY.Xd() ^ (-31901))), new Class[0]);
            try {
                method.setAccessible(true);
                InputStream inputStreamOpen = ((AssetManager) method.invoke(context, objArr)).open(str);
                try {
                    Map<String, String> stream = parseStream(inputStreamOpen);
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    return stream;
                } finally {
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (FileNotFoundException unused) {
            this.logger.log(SentryLevel.INFO, EO.Od("\u0007'!KNv \u0002\u0011Znx3*C\b\u001c\u0007di\u0017$", (short) (C1633zX.Xd() ^ (-18047))), str);
            return treeMap;
        } catch (IOException e3) {
            this.logger.log(SentryLevel.ERROR, Ig.wd("\u001c{kK[[?h\u00061$F\r\u0002\u001d1\u001d~6\u0005W\u0004\u0015%\u0001", (short) (FB.Xd() ^ 24587)), e3);
            return treeMap;
        }
    }
}
