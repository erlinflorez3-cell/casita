package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.OY;
import yg.Wg;

/* JADX INFO: loaded from: classes9.dex */
final class zzz extends zzv {
    final /* synthetic */ zzaf zza;

    zzz(zzaf zzafVar) {
        this.zza = zzafVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        synchronized (this.zza.zzg) {
            if (this.zza.zzl.get() > 0 && this.zza.zzl.decrementAndGet() > 0) {
                this.zza.zzc.zzd(C1561oA.Qd("Umh|nrj\"uhd\u001e`kih^[k_db\u0013aaU]\u000eS[]\nX\\OKW\u0004RPHOHLD{>;EDJ\u0004", (short) (C1499aX.Xd() ^ (-19510))), new Object[0]);
                return;
            }
            zzaf zzafVar = this.zza;
            if (zzafVar.zzn != null) {
                zzafVar.zzc.zzd(C1593ug.zd("\u0012,!)/&b*754g</=B614}", (short) (C1499aX.Xd() ^ (-19983)), (short) (C1499aX.Xd() ^ (-16914))), new Object[0]);
                zzaf zzafVar2 = this.zza;
                Context context = zzafVar2.zzb;
                Object[] objArr = {zzafVar2.zzm};
                Method method = Class.forName(C1561oA.od(">J?LHA;\u00048CAF6>C{\u0010;9>.@;", (short) (OY.Xd() ^ 20011))).getMethod(Wg.Zd("Y]9Q|bX\u001b\u000e\u0003\u001e(\u0013", (short) (C1607wl.Xd() ^ 9588), (short) (C1607wl.Xd() ^ LeicaMakernoteDirectory.TAG_CCD_VERSION)), Class.forName(C1561oA.Kd("ftkzxso:p}}\u0005v\u0001\bBh{\n\u000f\u0003}\u0001_\r\r\u000e\u0006\u0005\u0017\r\u0014\u0014", (short) (OY.Xd() ^ 29743))));
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                    this.zza.zzh = false;
                    this.zza.zzn = null;
                    this.zza.zzm = null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            this.zza.zzw();
        }
    }
}
