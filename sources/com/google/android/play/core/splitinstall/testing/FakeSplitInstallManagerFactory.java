package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.internal.zzby;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
public final class FakeSplitInstallManagerFactory {
    private static FakeSplitInstallManager zza = null;

    private FakeSplitInstallManagerFactory() {
    }

    public static FakeSplitInstallManager create(Context context) {
        try {
            File fileZzb = com.google.android.play.core.splitinstall.zzu.zza(context).zzb();
            if (fileZzb == null) {
                throw new LocalTestingException("Failed to retrieve local testing directory path");
            }
            if (fileZzb.exists()) {
                return create(context, fileZzb);
            }
            throw new LocalTestingException(String.format("Local testing directory not found: %s", fileZzb));
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static synchronized FakeSplitInstallManager create(Context context, File file) {
        FakeSplitInstallManager fakeSplitInstallManager = zza;
        if (fakeSplitInstallManager == null) {
            zza = createNewInstance(context, file);
        } else if (!fakeSplitInstallManager.zzc().getAbsolutePath().equals(file.getAbsolutePath())) {
            throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", zza.zzc().getAbsolutePath(), file.getAbsolutePath()));
        }
        return zza;
    }

    public static FakeSplitInstallManager createNewInstance(Context context, final File file) throws Throwable {
        SplitCompat.install(context);
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("2>3@<5/w,75:*27o\u0004/-2\"4/", (short) (C1633zX.Xd() ^ (-18453)), (short) (C1633zX.Xd() ^ (-15926)))).getMethod(C1561oA.ud("jguP`ah]b_GYd[", (short) (C1607wl.Xd() ^ 32507)), new Class[0]);
        try {
            method.setAccessible(true);
            return new FakeSplitInstallManager(context, file, new com.google.android.play.core.splitinstall.zzs(context, (String) method.invoke(context, objArr)), new zzby() { // from class: com.google.android.play.core.splitinstall.testing.zzs
                @Override // com.google.android.play.core.splitinstall.internal.zzby
                public final Object zza() {
                    return zzaa.zza(file);
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
