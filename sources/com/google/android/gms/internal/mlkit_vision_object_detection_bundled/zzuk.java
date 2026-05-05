package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import android.content.Context;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;

/* JADX INFO: loaded from: classes8.dex */
public final class zzuk {
    private static zzuk zza = null;
    private final zzui zzb;
    private final zzup zzc;
    private final zzun zzd;
    private zzuq zze;

    public zzuk(Context context, zzuj zzujVar) {
        zzun zzunVar = new zzun(context);
        this.zzd = zzunVar;
        this.zzc = new zzup(context);
        this.zzb = new zzui(zzujVar, zzunVar);
    }

    public static synchronized zzuk zzb(Context context) {
        if (zza == null) {
            zza = new zzuk(context, zzur.zza);
        }
        return zza;
    }

    public final zzuf zza() {
        Preconditions.checkState(this.zze != null);
        return this.zze.zzb();
    }

    public final String zzc() throws InterruptedException {
        Preconditions.checkState(this.zze != null);
        Preconditions.checkState(this.zze != null);
        if (this.zze.zze()) {
            zzum zzumVar = new zzum();
            zzumVar.zzg();
            try {
                if (this.zzb.zzc(zzumVar)) {
                    this.zze = this.zzb.zza();
                }
            } finally {
                zzumVar.zze();
                this.zzd.zza(zzpb.INSTALLATION_ID_REFRESH_TEMPORARY_TOKEN, zzumVar);
            }
        }
        Preconditions.checkState(this.zze != null);
        return this.zze.zzd();
    }

    public final void zzd() throws InterruptedException, IOException {
        zzun zzunVar;
        zzpb zzpbVar;
        zzum zzumVar = new zzum();
        zzumVar.zzg();
        try {
            zzuq zzuqVarZza = this.zzc.zza(zzumVar);
            if (zzuqVarZza != null) {
                this.zze = zzuqVarZza;
            } else {
                final zzum zzumVar2 = new zzum();
                zzumVar2.zzg();
                try {
                    int i2 = zzul.zzb;
                    byte[] bArr = new byte[17];
                    zzul.zza.nextBytes(bArr);
                    byte b2 = bArr[0];
                    bArr[0] = (byte) (((b2 + Ascii.SI) - (b2 | Ascii.SI)) | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
                    Object[] objArr = {bArr, 11};
                    Method declaredMethod = Class.forName(C1561oA.Qd("6B7D@93{B@46v\n(9*yv", (short) (C1499aX.Xd() ^ (-1294)))).getDeclaredMethod(C1593ug.zd("S]S`VXHdIkjbhb", (short) (FB.Xd() ^ 16656), (short) (FB.Xd() ^ 26216)), byte[].class, Integer.TYPE);
                    try {
                        declaredMethod.setAccessible(true);
                        String strSubstring = ((String) declaredMethod.invoke(null, objArr)).substring(0, 22);
                        C1561oA.od("XVTq{Oswwcml`rfkiC]?\\dZfTf`b", (short) (C1580rY.Xd() ^ (-2335)));
                        C1561oA.Kd("Nmwo}m\u0002ss0z\u0001\u0007\tv\u0003\u0004y\u000e\u0004\u000b\u000b=\b\u0004ZA", (short) (C1633zX.Xd() ^ (-32038))).concat(String.valueOf(strSubstring));
                        final zzuf zzufVar = new zzuf(strSubstring);
                        final zzui zzuiVar = this.zzb;
                        if (zzwj.zza(new zzwi() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzuh
                            @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwi
                            public final boolean zza() {
                                return zzuiVar.zzb(zzufVar, zzumVar2);
                            }
                        })) {
                            zzuq zzuqVarZza2 = this.zzb.zza();
                            this.zze = zzuqVarZza2;
                            if (zzuqVarZza2 != null) {
                                this.zzc.zzc(zzuqVarZza2, zzumVar2);
                            }
                            zzumVar2.zze();
                            zzunVar = this.zzd;
                            zzpbVar = zzpb.INSTALLATION_ID_REGISTER_NEW_ID;
                        } else {
                            zzumVar2.zzd(zzsw.RPC_EXPONENTIAL_BACKOFF_FAILED);
                            zzumVar2.zzd(zzsw.RPC_ERROR);
                            zzumVar2.zze();
                            zzunVar = this.zzd;
                            zzpbVar = zzpb.INSTALLATION_ID_REGISTER_NEW_ID;
                        }
                        zzunVar.zza(zzpbVar, zzumVar2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (Throwable th) {
                    zzumVar2.zze();
                    this.zzd.zza(zzpb.INSTALLATION_ID_REGISTER_NEW_ID, zzumVar2);
                    throw th;
                }
            }
        } finally {
            zzumVar.zze();
            this.zzd.zza(zzpb.INSTALLATION_ID_INIT, zzumVar);
        }
    }
}
