package io.sentry.android.core.internal.util;

import android.content.ContentProvider;
import android.content.Context;
import io.sentry.NoOpLogger;
import io.sentry.android.core.BuildInfoProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Qg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentProviderSecurityChecker {
    private final BuildInfoProvider buildInfoProvider;

    public ContentProviderSecurityChecker() {
        this(new BuildInfoProvider(NoOpLogger.getInstance()));
    }

    public ContentProviderSecurityChecker(BuildInfoProvider buildInfoProvider) {
        this.buildInfoProvider = buildInfoProvider;
    }

    public void checkPrivilegeEscalation(ContentProvider contentProvider) throws Throwable {
        int sdkInfoVersion = this.buildInfoProvider.getSdkInfoVersion();
        if (sdkInfoVersion < 26 || sdkInfoVersion > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        Context context = contentProvider.getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("\b\u0014\t\u0016\u0012\u000b\u0005M\u0002\r\u000b\u0010\u007f\b\rEY\u0005\u0003\bw\n\u0005", (short) (C1580rY.Xd() ^ (-7828)), (short) (C1580rY.Xd() ^ (-17851)))).getMethod(hg.Vd("qn|WghodifN`kb", (short) (ZN.Xd() ^ 8040), (short) (ZN.Xd() ^ 16231)), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(context, objArr);
            if (callingPackage == null || !callingPackage.equals(str)) {
                throw new SecurityException(C1561oA.ud("Rsougaam\u001a]g\\i\u0015bbf\u0011Q[Z\\c\u000bPXZ\u0007MWEQVJNF}LBz/KAvF:F@;DC8=;?", (short) (FB.Xd() ^ 18073)));
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
