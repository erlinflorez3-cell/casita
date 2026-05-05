package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.google.android.gms.common.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;

/* JADX INFO: loaded from: classes8.dex */
public class StringResourceValueReader {
    private final Resources zza;
    private final String zzb;

    public StringResourceValueReader(Context context) throws Throwable {
        Preconditions.checkNotNull(context);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd(":F;HD=7\u007f4?=B2:?w\f75:*<7", (short) (FB.Xd() ^ OlympusMakernoteDirectory.TAG_LIGHT_VALUE_PERIPHERY))).getMethod(C1593ug.zd("ut\u0005cw\u0007\u0004\u000b\tz}\r", (short) (C1633zX.Xd() ^ (-29985)), (short) (C1633zX.Xd() ^ (-28280))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            this.zza = resources;
            this.zzb = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public String getString(String str) {
        int identifier = this.zza.getIdentifier(str, "string", this.zzb);
        if (identifier == 0) {
            return null;
        }
        return this.zza.getString(identifier);
    }
}
