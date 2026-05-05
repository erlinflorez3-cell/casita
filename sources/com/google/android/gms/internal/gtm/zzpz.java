package com.google.android.gms.internal.gtm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzpz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ byte[] zzb;
    final /* synthetic */ zzqa zzc;

    zzpz(zzqa zzqaVar, String str, byte[] bArr) {
        this.zzc = zzqaVar;
        this.zza = str;
        this.zzb = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileOutputStream fileOutputStream;
        zzqa zzqaVar = this.zzc;
        String str = this.zza;
        File fileZzb = zzqaVar.zzb(str);
        byte[] bArr = this.zzb;
        try {
            try {
                fileOutputStream = new FileOutputStream(fileZzb);
                try {
                    fileOutputStream.write(bArr);
                    try {
                        fileOutputStream.close();
                        zzho.zzd("Resource " + str + " saved on Disk.");
                    } catch (IOException unused) {
                        zzho.zza("Error closing stream for writing resource to disk");
                    }
                } catch (IOException unused2) {
                    zzho.zza("Error writing resource to disk. Removing resource from disk");
                    fileZzb.delete();
                    try {
                        fileOutputStream.close();
                        zzho.zzd("Resource " + str + " saved on Disk.");
                    } catch (IOException unused3) {
                        zzho.zza("Error closing stream for writing resource to disk");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                    zzho.zzd("Resource " + str + " saved on Disk.");
                } catch (IOException unused4) {
                    zzho.zza("Error closing stream for writing resource to disk");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            zzho.zza("Error opening resource file for writing");
        }
    }
}
