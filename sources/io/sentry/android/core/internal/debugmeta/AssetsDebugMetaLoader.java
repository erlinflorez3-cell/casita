package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import android.content.res.AssetManager;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.ContextUtils;
import io.sentry.internal.debugmeta.IDebugMetaLoader;
import io.sentry.util.DebugMetaPropertiesApplier;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class AssetsDebugMetaLoader implements IDebugMetaLoader {
    private final Context context;
    private final ILogger logger;

    public AssetsDebugMetaLoader(Context context, ILogger iLogger) {
        this.context = ContextUtils.getApplicationContext(context);
        this.logger = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.IDebugMetaLoader
    public List<Properties> loadDebugMeta() throws Throwable {
        Context context = this.context;
        short sXd = (short) (OY.Xd() ^ 30032);
        int[] iArr = new int[",8-:6/)q6A?D4<Ay\u001eIGL<NI".length()];
        QB qb = new QB(",8-:6/)q6A?D4<Ay\u001eIGL<NI");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1633zX.Xd() ^ (-20304));
        short sXd3 = (short) (C1633zX.Xd() ^ (-11840));
        int[] iArr2 = new int["52@\f=<-;9".length()];
        QB qb2 = new QB("52@\f=<-;9");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(((AssetManager) method.invoke(context, objArr)).open(DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    List<Properties> listSingletonList = Collections.singletonList(properties);
                    bufferedInputStream.close();
                    return listSingletonList;
                } finally {
                }
            } catch (FileNotFoundException e2) {
                this.logger.log(SentryLevel.INFO, e2, C1561oA.yd("X(Q\u0019!%\u001bV3\u001e-Z.02^*471,v", (short) (OY.Xd() ^ 8330)), DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
                return null;
            } catch (IOException e3) {
                this.logger.log(SentryLevel.ERROR, C1561oA.ud("\u0003/.*,X\u001f\u001c*)\u001d!\u0019P\u007f!\u001d\u0014!\f\u001c\rG{zmg\u0016O", (short) (C1580rY.Xd() ^ (-18309))), e3);
                return null;
            } catch (RuntimeException e4) {
                this.logger.log(SentryLevel.ERROR, e4, hg.Vd("\nW\u0003HJLD}FOzG:D=EGA86~", (short) (C1580rY.Xd() ^ (-10724)), (short) (C1580rY.Xd() ^ (-10295))), DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
                return null;
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }
}
