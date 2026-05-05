package com.google.android.gms.cloudmessaging;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzc extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z2) throws ClassNotFoundException {
        return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? !Log.isLoggable("CloudMessengerCompat", 3) ? zzd.class : zzd.class : super.loadClass(str, z2);
    }
}
