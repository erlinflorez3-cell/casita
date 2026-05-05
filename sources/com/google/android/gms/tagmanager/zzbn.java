package com.google.android.gms.tagmanager;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbn extends zzce {
    zzbn() {
    }

    @Override // com.google.android.gms.tagmanager.zzcf
    public final String zzb(String str, Map map) {
        CustomVariableProvider customVariableProvider;
        if (zzbo.zzd.containsKey(str)) {
            customVariableProvider = (CustomVariableProvider) zzbo.zzd.get(str);
        } else {
            customVariableProvider = (CustomVariableProvider) zzbo.zzj(str, CustomVariableProvider.class);
            zzbo.zzd.put(str, customVariableProvider);
        }
        if (customVariableProvider != null) {
            return customVariableProvider.getValue(map);
        }
        return null;
    }

    @Override // com.google.android.gms.tagmanager.zzcf
    public final void zzc(String str, Map map) {
        CustomTagProvider customTagProvider;
        if (zzbo.zzc.containsKey(str)) {
            customTagProvider = (CustomTagProvider) zzbo.zzc.get(str);
        } else {
            customTagProvider = (CustomTagProvider) zzbo.zzj(str, CustomTagProvider.class);
            zzbo.zzc.put(str, customTagProvider);
        }
        if (customTagProvider != null) {
            customTagProvider.execute(map);
        }
    }
}
