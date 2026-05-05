package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1626yg;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zzby {
    private final Context zza;
    private final Context zzb;

    public zzby(Context context) throws Throwable {
        Preconditions.checkNotNull(context);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("\u0012\u001a29\u0010\u000e*q|&)\rv\u001a!>m\u0017su\u0004\u0015n", (short) (FB.Xd() ^ 11806), (short) (FB.Xd() ^ 7514))).getMethod(ZO.xd("n5\u0012B<pJ=\u0003#lF\u001clU*Q\u0014o-Z", (short) (ZN.Xd() ^ 22213), (short) (ZN.Xd() ^ 3560)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Preconditions.checkNotNull(context2, C1626yg.Ud("~\u0016:i|<x>hI\u0003\u0004p\t3\u0010yz\u0005?ul8\u0003r%r.6\u0019(\rJ", (short) (OY.Xd() ^ 32346), (short) (OY.Xd() ^ OlympusCameraSettingsMakernoteDirectory.TagPictureModeSharpness)));
            this.zza = context2;
            this.zzb = context2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final Context zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }
}
