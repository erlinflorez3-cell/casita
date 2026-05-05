package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
interface zzfr {
    void zza(int i2, double d2) throws IOException;

    void zza(int i2, float f2) throws IOException;

    void zza(int i2, long j2) throws IOException;

    void zza(int i2, zzbb zzbbVar) throws IOException;

    <K, V> void zza(int i2, zzdh<K, V> zzdhVar, Map<K, V> map) throws IOException;

    void zza(int i2, Object obj) throws IOException;

    void zza(int i2, Object obj, zzef zzefVar) throws IOException;

    void zza(int i2, String str) throws IOException;

    void zza(int i2, List<String> list) throws IOException;

    void zza(int i2, List<?> list, zzef zzefVar) throws IOException;

    void zza(int i2, List<Integer> list, boolean z2) throws IOException;

    @Deprecated
    void zzaa(int i2) throws IOException;

    @Deprecated
    void zzab(int i2) throws IOException;

    int zzaj();

    void zzb(int i2, long j2) throws IOException;

    @Deprecated
    void zzb(int i2, Object obj, zzef zzefVar) throws IOException;

    void zzb(int i2, List<zzbb> list) throws IOException;

    @Deprecated
    void zzb(int i2, List<?> list, zzef zzefVar) throws IOException;

    void zzb(int i2, List<Integer> list, boolean z2) throws IOException;

    void zzb(int i2, boolean z2) throws IOException;

    void zzc(int i2, int i3) throws IOException;

    void zzc(int i2, long j2) throws IOException;

    void zzc(int i2, List<Long> list, boolean z2) throws IOException;

    void zzd(int i2, int i3) throws IOException;

    void zzd(int i2, List<Long> list, boolean z2) throws IOException;

    void zze(int i2, int i3) throws IOException;

    void zze(int i2, List<Long> list, boolean z2) throws IOException;

    void zzf(int i2, int i3) throws IOException;

    void zzf(int i2, List<Float> list, boolean z2) throws IOException;

    void zzg(int i2, List<Double> list, boolean z2) throws IOException;

    void zzh(int i2, List<Integer> list, boolean z2) throws IOException;

    void zzi(int i2, long j2) throws IOException;

    void zzi(int i2, List<Boolean> list, boolean z2) throws IOException;

    void zzj(int i2, long j2) throws IOException;

    void zzj(int i2, List<Integer> list, boolean z2) throws IOException;

    void zzk(int i2, List<Integer> list, boolean z2) throws IOException;

    void zzl(int i2, List<Long> list, boolean z2) throws IOException;

    void zzm(int i2, int i3) throws IOException;

    void zzm(int i2, List<Integer> list, boolean z2) throws IOException;

    void zzn(int i2, int i3) throws IOException;

    void zzn(int i2, List<Long> list, boolean z2) throws IOException;
}
