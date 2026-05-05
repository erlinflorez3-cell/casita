package com.google.android.gms.internal.vision;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class zzu {
    public static boolean zza(Context context, String str) {
        return DynamiteModule.getLocalVersion(context, str) > DynamiteModule.getRemoteVersion(context, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID);
    }
}
