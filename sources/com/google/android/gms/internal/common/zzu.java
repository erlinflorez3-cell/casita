package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes8.dex */
@NullMarked
public final class zzu extends zzs {
    public static boolean zza(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
