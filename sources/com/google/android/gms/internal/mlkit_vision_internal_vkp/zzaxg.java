package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import android.content.Context;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaxg {
    private static zzaxg zza = null;
    private final zzaxe zzb;
    private final zzaxl zzc;
    private final zzaxj zzd;
    private zzaxm zze;

    public zzaxg(Context context, zzaxf zzaxfVar) {
        zzaxj zzaxjVar = new zzaxj(context);
        this.zzd = zzaxjVar;
        this.zzc = new zzaxl(context);
        this.zzb = new zzaxe(zzaxfVar, zzaxjVar);
    }

    public static synchronized zzaxg zzb(Context context) {
        if (zza == null) {
            zza = new zzaxg(context, zzaxn.zza);
        }
        return zza;
    }

    public final zzaxc zza() {
        Preconditions.checkState(this.zze != null);
        return this.zze.zzb();
    }

    public final void zzc() throws InterruptedException, IOException {
        zzaxj zzaxjVar;
        zzary zzaryVar;
        zzaxi zzaxiVar = new zzaxi();
        zzaxiVar.zzg();
        try {
            zzaxm zzaxmVarZza = this.zzc.zza(zzaxiVar);
            if (zzaxmVarZza != null) {
                this.zze = zzaxmVarZza;
            } else {
                final zzaxi zzaxiVar2 = new zzaxi();
                zzaxiVar2.zzg();
                try {
                    int i2 = zzaxh.zzb;
                    byte[] bArr = new byte[17];
                    zzaxh.zza.nextBytes(bArr);
                    int i3 = bArr[0] & Ascii.SI;
                    bArr[0] = (byte) ((i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i3 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
                    short sXd = (short) (FB.Xd() ^ 17816);
                    short sXd2 = (short) (FB.Xd() ^ 15201);
                    int[] iArr = new int["^lcrpkg2zzpt7Ll\u007frDC".length()];
                    QB qb = new QB("^lcrpkg2zzpt7Ll\u007frDC");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) - sXd2);
                        i4++;
                    }
                    Object[] objArr = {bArr, 11};
                    Method declaredMethod = Class.forName(new String(iArr, 0, i4)).getDeclaredMethod(C1561oA.od("\u0018 \u0014\u001f\u0013\u0013\u0001\u001b}\u001e\u001b\u0011\u0015\r", (short) (ZN.Xd() ^ 32046)), byte[].class, Integer.TYPE);
                    try {
                        declaredMethod.setAccessible(true);
                        String strSubstring = ((String) declaredMethod.invoke(null, objArr)).substring(0, 22);
                        C1561oA.Kd("GGGfrHntvdpqg{qxxTpTs}u\u0004s\b\u0004\b", (short) (Od.Xd() ^ (-19218)));
                        Wg.Zd("H/`\f\u0002%\u0013d4\u0010F\f\u000b\u00016Y\"\u001cY\u000fq!\u001f\u001dbl+", (short) (ZN.Xd() ^ 19044), (short) (ZN.Xd() ^ 20582)).concat(String.valueOf(strSubstring));
                        final zzaxc zzaxcVar = new zzaxc(strSubstring);
                        final zzaxe zzaxeVar = this.zzb;
                        if (zzaym.zza(new zzayl() { // from class: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaxd
                            @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzayl
                            public final boolean zzb() {
                                return zzaxeVar.zzb(zzaxcVar, zzaxiVar2);
                            }
                        })) {
                            zzaxm zzaxmVarZza2 = this.zzb.zza();
                            this.zze = zzaxmVarZza2;
                            if (zzaxmVarZza2 != null) {
                                this.zzc.zzc(zzaxmVarZza2, zzaxiVar2);
                            }
                            zzaxiVar2.zze();
                            zzaxjVar = this.zzd;
                            zzaryVar = zzary.INSTALLATION_ID_REGISTER_NEW_ID;
                        } else {
                            zzaxiVar2.zzd(zzave.RPC_EXPONENTIAL_BACKOFF_FAILED);
                            zzaxiVar2.zzd(zzave.RPC_ERROR);
                            zzaxiVar2.zze();
                            zzaxjVar = this.zzd;
                            zzaryVar = zzary.INSTALLATION_ID_REGISTER_NEW_ID;
                        }
                        zzaxjVar.zza(zzaryVar, zzaxiVar2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (Throwable th) {
                    zzaxiVar2.zze();
                    this.zzd.zza(zzary.INSTALLATION_ID_REGISTER_NEW_ID, zzaxiVar2);
                    throw th;
                }
            }
        } finally {
            zzaxiVar.zze();
            this.zzd.zza(zzary.INSTALLATION_ID_INIT, zzaxiVar);
        }
    }
}
