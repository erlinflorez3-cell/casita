package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import android.content.res.AssetFileDescriptor;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzt {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] zzc;
    private static final String[] zzd;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        strArr[1] = (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : "";
        zzc = strArr;
        zzd = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x02ce, code lost:
    
        if (r18.zzb != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0411, code lost:
    
        if (r18.zzb == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04b4 A[Catch: IOException -> 0x056e, FileNotFoundException -> 0x0589, TryCatch #9 {FileNotFoundException -> 0x0589, IOException -> 0x056e, blocks: (B:93:0x0445, B:95:0x046f, B:98:0x048b, B:100:0x0491, B:102:0x049a, B:132:0x050a, B:108:0x04b4, B:110:0x04ba, B:112:0x04c0, B:115:0x04cb, B:117:0x04d8, B:119:0x04dc, B:122:0x04e7, B:123:0x04ea, B:125:0x04f7, B:127:0x04fb, B:130:0x0506, B:105:0x04a5, B:155:0x054a, B:157:0x0562, B:158:0x056d), top: B:184:0x0445 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0510  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.AssetFileDescriptor zza(final android.content.Context r16, android.net.Uri r17, java.lang.String r18) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instruction units count: 1448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzt.zza(android.content.Context, android.net.Uri, java.lang.String):android.content.res.AssetFileDescriptor");
    }

    private static Object zzb(Object obj) throws FileNotFoundException {
        if (obj != null) {
            return obj;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }

    private static String zzc(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith(RemoteSettings.FORWARD_SLASH_STRING) ? String.valueOf(canonicalPath).concat(RemoteSettings.FORWARD_SLASH_STRING) : canonicalPath;
    }

    private static void zzd(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
        try {
            StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat structStatLstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
            } catch (ErrnoException e2) {
                throw new IOException(e2);
            }
        } catch (ErrnoException e3) {
            throw new IOException(e3);
        }
    }

    private static void zze(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e2) {
            fileNotFoundException.addSuppressed(e2);
        }
    }

    private static File[] zzf(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
