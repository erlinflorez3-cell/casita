package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzxh extends zzxg {
    zzxh() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    final int zza(Map.Entry entry) {
        return ((zzxs) entry.getKey()).zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    final zzxk zzb(Object obj) {
        return ((zzxr) obj).zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    final zzxk zzc(Object obj) {
        return ((zzxr) obj).zzT();
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    final Object zzd(zzxf zzxfVar, zzzg zzzgVar, int i2) {
        return zzxfVar.zzb(zzzgVar, i2);
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    final Object zze(Object obj, zzzs zzzsVar, Object obj2, zzxf zzxfVar, zzxk zzxkVar, Object obj3, zzaak zzaakVar) throws IOException {
        Object objValueOf;
        Object objZzf;
        zzxt zzxtVar = (zzxt) obj2;
        zzaba zzabaVar = zzxtVar.zzd.zzc;
        if (zzabaVar != zzaba.ENUM) {
            switch (zzabaVar) {
                case DOUBLE:
                    objValueOf = Double.valueOf(zzzsVar.zza());
                    break;
                case FLOAT:
                    objValueOf = Float.valueOf(zzzsVar.zzb());
                    break;
                case INT64:
                    objValueOf = Long.valueOf(zzzsVar.zzl());
                    break;
                case UINT64:
                    objValueOf = Long.valueOf(zzzsVar.zzo());
                    break;
                case INT32:
                    objValueOf = Integer.valueOf(zzzsVar.zzg());
                    break;
                case FIXED64:
                    objValueOf = Long.valueOf(zzzsVar.zzk());
                    break;
                case FIXED32:
                    objValueOf = Integer.valueOf(zzzsVar.zzf());
                    break;
                case BOOL:
                    objValueOf = Boolean.valueOf(zzzsVar.zzP());
                    break;
                case STRING:
                    objValueOf = zzzsVar.zzt();
                    break;
                case GROUP:
                    zzxs zzxsVar = zzxtVar.zzd;
                    if (!zzxsVar.zzd) {
                        Object objZzf2 = zzxkVar.zzf(zzxsVar);
                        if (objZzf2 instanceof zzxv) {
                            zzzt zzztVarZzb = zzzp.zza().zzb(objZzf2.getClass());
                            if (!((zzxv) objZzf2).zzaq()) {
                                Object objZze = zzztVarZzb.zze();
                                zzztVarZzb.zzg(objZze, objZzf2);
                                zzxkVar.zzk(zzxtVar.zzd, objZze);
                                objZzf2 = objZze;
                            }
                            zzzsVar.zzv(objZzf2, zzztVarZzb, zzxfVar);
                            return obj3;
                        }
                    }
                    objValueOf = zzzsVar.zzr(zzxtVar.zzc.getClass(), zzxfVar);
                    break;
                case MESSAGE:
                    zzxs zzxsVar2 = zzxtVar.zzd;
                    if (!zzxsVar2.zzd) {
                        Object objZzf3 = zzxkVar.zzf(zzxsVar2);
                        if (objZzf3 instanceof zzxv) {
                            zzzt zzztVarZzb2 = zzzp.zza().zzb(objZzf3.getClass());
                            if (!((zzxv) objZzf3).zzaq()) {
                                Object objZze2 = zzztVarZzb2.zze();
                                zzztVarZzb2.zzg(objZze2, objZzf3);
                                zzxkVar.zzk(zzxtVar.zzd, objZze2);
                                objZzf3 = objZze2;
                            }
                            zzzsVar.zzw(objZzf3, zzztVarZzb2, zzxfVar);
                            return obj3;
                        }
                    }
                    objValueOf = zzzsVar.zzs(zzxtVar.zzc.getClass(), zzxfVar);
                    break;
                case BYTES:
                    objValueOf = zzzsVar.zzp();
                    break;
                case UINT32:
                    objValueOf = Integer.valueOf(zzzsVar.zzj());
                    break;
                case ENUM:
                    throw new IllegalStateException("Shouldn't reach here.");
                case SFIXED32:
                    objValueOf = Integer.valueOf(zzzsVar.zzh());
                    break;
                case SFIXED64:
                    objValueOf = Long.valueOf(zzzsVar.zzm());
                    break;
                case SINT32:
                    objValueOf = Integer.valueOf(zzzsVar.zzi());
                    break;
                case SINT64:
                    objValueOf = Long.valueOf(zzzsVar.zzn());
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iZzg = zzzsVar.zzg();
            if (zzxtVar.zzd.zza.zza(iZzg) == null) {
                return zzzv.zzp(obj, zzxtVar.zzd.zzb, iZzg, obj3, zzaakVar);
            }
            objValueOf = Integer.valueOf(iZzg);
        }
        zzxs zzxsVar3 = zzxtVar.zzd;
        if (zzxsVar3.zzd) {
            zzxkVar.zzh(zzxsVar3, objValueOf);
        } else {
            int iOrdinal = zzxsVar3.zzc.ordinal();
            if ((iOrdinal == 9 || iOrdinal == 10) && (objZzf = zzxkVar.zzf(zzxtVar.zzd)) != null) {
                byte[] bArr = zzye.zzd;
                objValueOf = ((zzzg) objZzf).zzav().zzx((zzzg) objValueOf).zzE();
            }
            zzxkVar.zzk(zzxtVar.zzd, objValueOf);
        }
        return obj3;
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    final void zzf(Object obj) {
        ((zzxr) obj).zza.zzi();
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    final void zzg(zzzs zzzsVar, Object obj, zzxf zzxfVar, zzxk zzxkVar) throws IOException {
        zzxt zzxtVar = (zzxt) obj;
        zzxkVar.zzk(zzxtVar.zzd, zzzsVar.zzs(zzxtVar.zzc.getClass(), zzxfVar));
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    final void zzh(zzud zzudVar, Object obj, zzxf zzxfVar, zzxk zzxkVar) throws IOException {
        zzua zzuaVar = (zzua) zzudVar;
        byte[] bArr = zzuaVar.zza;
        zzxt zzxtVar = (zzxt) obj;
        zzzf zzzfVarZzau = zzxtVar.zzc.zzau();
        zzuj zzujVarZzH = zzuj.zzH(bArr, 0, zzuaVar.zzd(), true);
        zzzfVarZzau.zzy(zzujVarZzH, zzxfVar);
        zzxkVar.zzk(zzxtVar.zzd, zzzfVarZzau.zzE());
        zzujVarZzH.zzz(0);
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    final boolean zzi(zzzg zzzgVar) {
        return zzzgVar instanceof zzxr;
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    final void zzj(zzur zzurVar, Map.Entry entry) throws IOException {
        zzxs zzxsVar = (zzxs) entry.getKey();
        if (!zzxsVar.zzd) {
            zzaba zzabaVar = zzaba.DOUBLE;
            switch (zzxsVar.zzc) {
                case DOUBLE:
                    zzurVar.zzf(zzxsVar.zzb, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    zzurVar.zzo(zzxsVar.zzb, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    zzurVar.zzt(zzxsVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    zzurVar.zzK(zzxsVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    zzurVar.zzr(zzxsVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    zzurVar.zzm(zzxsVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    zzurVar.zzk(zzxsVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    zzurVar.zzb(zzxsVar.zzb, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    zzurVar.zzG(zzxsVar.zzb, (String) entry.getValue());
                    break;
                case GROUP:
                    zzurVar.zzq(zzxsVar.zzb, entry.getValue(), zzzp.zza().zzb(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    zzurVar.zzv(zzxsVar.zzb, entry.getValue(), zzzp.zza().zzb(entry.getValue().getClass()));
                    break;
                case BYTES:
                    zzurVar.zzd(zzxsVar.zzb, (zzud) entry.getValue());
                    break;
                case UINT32:
                    zzurVar.zzI(zzxsVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    zzurVar.zzr(zzxsVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    zzurVar.zzx(zzxsVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    zzurVar.zzz(zzxsVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    zzurVar.zzB(zzxsVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    zzurVar.zzD(zzxsVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzaba zzabaVar2 = zzaba.DOUBLE;
        switch (zzxsVar.zzc) {
            case DOUBLE:
                zzzv.zzw(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case FLOAT:
                zzzv.zzA(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case INT64:
                zzzv.zzD(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case UINT64:
                zzzv.zzL(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case INT32:
                zzzv.zzC(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case FIXED64:
                zzzv.zzz(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case FIXED32:
                zzzv.zzy(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case BOOL:
                zzzv.zzu(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case STRING:
                zzzv.zzJ(zzxsVar.zzb, (List) entry.getValue(), zzurVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzzv.zzB(zzxsVar.zzb, (List) entry.getValue(), zzurVar, zzzp.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzzv.zzE(zzxsVar.zzb, (List) entry.getValue(), zzurVar, zzzp.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                zzzv.zzv(zzxsVar.zzb, (List) entry.getValue(), zzurVar);
                break;
            case UINT32:
                zzzv.zzK(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case ENUM:
                zzzv.zzC(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case SFIXED32:
                zzzv.zzF(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case SFIXED64:
                zzzv.zzG(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case SINT32:
                zzzv.zzH(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
            case SINT64:
                zzzv.zzI(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                break;
        }
    }
}
