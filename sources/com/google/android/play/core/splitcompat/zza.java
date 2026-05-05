package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.StrictMode;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import yg.C1499aX;
import yg.C1561oA;
import yg.EO;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public final class zza {
    private final zze zza;

    public zza(zze zzeVar) {
        this.zza = zzeVar;
    }

    public static final int zzc(AssetManager assetManager, File file) {
        int iIntValue = ((Integer) zzbk.zzd(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        String str = "addAssetPath completed with " + iIntValue;
        return iIntValue;
    }

    public final synchronized void zza(Context context, Set set) {
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("*\u0012\u0016Ch\bn\u0018\u000545U10*> :\u0012\u007f'\u0003`", (short) (ZN.Xd() ^ 16682))).getMethod(C1561oA.Qd("WTb._^O][", (short) (C1499aX.Xd() ^ (-21601))), new Class[0]);
        try {
            method.setAccessible(true);
            AssetManager assetManager = (AssetManager) method.invoke(context, objArr);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                zzc(assetManager, (File) it.next());
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    final synchronized boolean zzb(Context context, Set set) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.allowThreadDiskReads();
                StrictMode.allowThreadDiskWrites();
            } catch (Exception e2) {
            }
        } catch (Exception e3) {
            threadPolicy = null;
        }
        try {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(this.zza.zzg((String) it.next()));
            }
            zza(context, hashSet);
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Exception e4) {
            if (threadPolicy == null) {
                return false;
            }
            StrictMode.setThreadPolicy(threadPolicy);
            return false;
        } catch (Throwable th) {
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
            throw th;
        }
        return true;
    }
}
