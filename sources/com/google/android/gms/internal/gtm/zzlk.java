package com.google.android.gms.internal.gtm;

import com.braze.models.FeatureFlag;
import com.google.android.gms.common.internal.Preconditions;
import io.sentry.protocol.SentryStackFrame;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlk extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 1);
        Preconditions.checkArgument(!(zzqzVarArr[0] instanceof zzri));
        Preconditions.checkArgument(true ^ zzrl.zzi(zzqzVarArr[0]));
        zzqz zzqzVar = zzqzVarArr[0];
        return new zzrk(zzqzVar == zzrd.zze ? "undefined" : zzqzVar instanceof zzra ? "boolean" : zzqzVar instanceof zzrb ? FeatureFlag.PROPERTIES_TYPE_NUMBER : zzqzVar instanceof zzrk ? "string" : zzqzVar instanceof zzrc ? SentryStackFrame.JsonKeys.FUNCTION : "object");
    }
}
