package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zztn implements zztk {
    final List zza;

    public zztn(Context context, zztm zztmVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zztmVar.zzc()) {
            arrayList.add(new zzub(context, zztmVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztk
    public final void zza(zztj zztjVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zztk) it.next()).zza(zztjVar);
        }
    }
}
