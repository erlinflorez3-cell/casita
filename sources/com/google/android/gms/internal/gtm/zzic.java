package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomMasterTable;
import com.dynatrace.android.agent.AdkSettings;
import com.facebook.hermes.intl.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.npmdavi.davinotification.Constant;
import cz.msebera.android.httpclient.message.TokenParser;
import io.sentry.protocol.Device;
import io.sentry.protocol.SentryThread;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzic {
    private final Context zza;
    private final String zzb;
    private final zzqj zzc;
    private final com.google.android.gms.tagmanager.zzco zzd;
    private final com.google.android.gms.tagmanager.zzcf zze;
    private final zzie zzf;
    private final zzrh zzg;
    private final zzrh zzh;
    private final Set zzi;
    private int zzj;
    private zznw zzk;
    private zzgz zzl;
    private final zzib zzm;

    public zzic(Context context, String str, zzqj zzqjVar, zzqs zzqsVar, com.google.android.gms.tagmanager.zzco zzcoVar, com.google.android.gms.tagmanager.zzcf zzcfVar) {
        zzie zzieVar = new zzie();
        this.zzf = zzieVar;
        zzrh zzrhVar = new zzrh(new HashMap(50));
        this.zzg = zzrhVar;
        zzrh zzrhVar2 = new zzrh(new HashMap(10));
        this.zzh = zzrhVar2;
        this.zzi = new HashSet();
        zzhw zzhwVar = new zzhw(this);
        this.zzm = zzhwVar;
        Preconditions.checkNotNull(zzqjVar, "Internal Error: Container resource cannot be null");
        Preconditions.checkNotNull(zzqsVar, "Internal Error: Runtime resource cannot be null");
        Preconditions.checkNotEmpty(str, "Internal Error: ContainerId cannot be empty");
        Preconditions.checkNotNull(zzcoVar);
        Preconditions.checkNotNull(zzcfVar);
        this.zza = context;
        this.zzb = str;
        this.zzc = zzqjVar;
        this.zzd = zzcoVar;
        this.zze = zzcfVar;
        zzieVar.zzc("1", new zzrc(new zzkv()));
        zzieVar.zzc("12", new zzrc(new zzkw()));
        zzieVar.zzc("18", new zzrc(new zzkx()));
        zzieVar.zzc("19", new zzrc(new zzky()));
        zzieVar.zzc("20", new zzrc(new zzkz()));
        zzieVar.zzc("21", new zzrc(new zzla()));
        zzieVar.zzc("23", new zzrc(new zzlb()));
        zzieVar.zzc("24", new zzrc(new zzlc()));
        zzieVar.zzc("27", new zzrc(new zzld()));
        zzieVar.zzc("28", new zzrc(new zzle()));
        zzieVar.zzc("29", new zzrc(new zzlf()));
        zzieVar.zzc("30", new zzrc(new zzlg()));
        zzieVar.zzc("32", new zzrc(new zzlh()));
        zzieVar.zzc("33", new zzrc(new zzlh()));
        zzieVar.zzc("34", new zzrc(new zzli()));
        zzieVar.zzc("35", new zzrc(new zzli()));
        zzieVar.zzc("39", new zzrc(new zzlj()));
        zzieVar.zzc("40", new zzrc(new zzlk()));
        zzieVar.zzc(AdkSettings.PLATFORM_TYPE_MOBILE, new zzrc(new zzmh()));
        zzieVar.zzc("10", new zzrc(new zzmi()));
        zzieVar.zzc("25", new zzrc(new zzmj()));
        zzieVar.zzc("26", new zzrc(new zzmk()));
        zzieVar.zzc("37", new zzrc(new zzml()));
        zzieVar.zzc(ExifInterface.GPS_MEASUREMENT_2D, new zzrc(new zzll()));
        zzieVar.zzc(ExifInterface.GPS_MEASUREMENT_3D, new zzrc(new zzlm()));
        zzieVar.zzc("4", new zzrc(new zzln()));
        zzieVar.zzc("5", new zzrc(new zzlo()));
        zzieVar.zzc("6", new zzrc(new zzlp()));
        zzieVar.zzc("7", new zzrc(new zzlq()));
        zzieVar.zzc("8", new zzrc(new zzlr()));
        zzieVar.zzc("9", new zzrc(new zzlo()));
        zzieVar.zzc("13", new zzrc(new zzls()));
        zzieVar.zzc("47", new zzrc(new zzlt()));
        zzieVar.zzc("15", new zzrc(new zzlu()));
        zzieVar.zzc("48", new zzrc(new zzlv(this)));
        zzlw zzlwVar = new zzlw();
        zzieVar.zzc("16", new zzrc(zzlwVar));
        zzieVar.zzc("17", new zzrc(zzlwVar));
        zzieVar.zzc("22", new zzrc(new zzly()));
        zzieVar.zzc("45", new zzrc(new zzlz()));
        zzieVar.zzc("46", new zzrc(new zzma()));
        zzieVar.zzc("36", new zzrc(new zzmb()));
        zzieVar.zzc("43", new zzrc(new zzmc()));
        zzieVar.zzc("38", new zzrc(new zzmd()));
        zzieVar.zzc("44", new zzrc(new zzme()));
        zzieVar.zzc("41", new zzrc(new zzmf()));
        zzieVar.zzc(RoomMasterTable.DEFAULT_ID, new zzrc(new zzmg()));
        zzl(zza.CONTAINS, new zzot());
        zzl(zza.ENDS_WITH, new zzou());
        zzl(zza.EQUALS, new zzov());
        zzl(zza.GREATER_EQUALS, new zzow());
        zzl(zza.GREATER_THAN, new zzox());
        zzl(zza.LESS_EQUALS, new zzoy());
        zzl(zza.LESS_THAN, new zzoz());
        zzl(zza.REGEX, new zzpb());
        zzl(zza.STARTS_WITH, new zzpc());
        zzrhVar.zzf("advertiserId", new zzrc(new zznm(context)));
        zzrhVar.zzf("advertiserTrackingEnabled", new zzrc(new zznn(context)));
        zzrhVar.zzf("adwordsClickReferrer", new zzrc(new zzno(zzhwVar)));
        zzrhVar.zzf("applicationId", new zzrc(new zznp(context)));
        zzrhVar.zzf("applicationName", new zzrc(new zznq(context)));
        zzrhVar.zzf("applicationVersion", new zzrc(new zznr(context)));
        zzrhVar.zzf("applicationVersionName", new zzrc(new zzns(context)));
        zzrhVar.zzf("arbitraryPixieMacro", new zzrc(new zznj(1, zzieVar)));
        zzrhVar.zzf("carrier", new zzrc(new zznt(context)));
        zzrhVar.zzf(RRWebVideoEvent.REPLAY_FRAME_RATE_TYPE_CONSTANT, new zzrc(new zzmb()));
        zzrhVar.zzf("containerId", new zzrc(new zznu(new zzrk(str))));
        zzrhVar.zzf("containerVersion", new zzrc(new zznu(new zzrk(zzqjVar.zzb()))));
        zzrhVar.zzf("customMacro", new zzrc(new zzni(new zzia(this, null))));
        zzrhVar.zzf("deviceBrand", new zzrc(new zznx()));
        zzrhVar.zzf("deviceId", new zzrc(new zzny(context)));
        zzrhVar.zzf("deviceModel", new zzrc(new zznz()));
        zzrhVar.zzf("deviceName", new zzrc(new zzoa()));
        zzrhVar.zzf("encode", new zzrc(new zzob()));
        zzrhVar.zzf("encrypt", new zzrc(new zzoc()));
        zzrhVar.zzf(NotificationCompat.CATEGORY_EVENT, new zzrc(new zznv()));
        zzrhVar.zzf("eventParameters", new zzrc(new zzod(zzhwVar)));
        zzrhVar.zzf("version", new zzrc(new zzoe()));
        zzrhVar.zzf("hashcode", new zzrc(new zzof()));
        zzrhVar.zzf("installReferrer", new zzrc(new zzog(context)));
        zzrhVar.zzf("join", new zzrc(new zzoh()));
        zzrhVar.zzf(Device.JsonKeys.LANGUAGE, new zzrc(new zzoi()));
        zzrhVar.zzf("locale", new zzrc(new zzoj()));
        zzrhVar.zzf("adWordsUniqueId", new zzrc(new zzol(context)));
        zzrhVar.zzf("osVersion", new zzrc(new zzom()));
        zzrhVar.zzf("platform", new zzrc(new zzon()));
        zzrhVar.zzf("random", new zzrc(new zzoo()));
        zzrhVar.zzf("regexGroup", new zzrc(new zzop()));
        zzrhVar.zzf("resolution", new zzrc(new zzor(context)));
        zzrhVar.zzf("runtimeVersion", new zzrc(new zzoq()));
        zzrhVar.zzf("sdkVersion", new zzrc(new zzos()));
        this.zzk = new zznw();
        zzrhVar.zzf("currentTime", new zzrc(this.zzk));
        zzrhVar.zzf("userProperty", new zzrc(new zzok(zzhwVar)));
        zzrhVar.zzf("arbitraryPixel", new zzrc(new zzpf(zzgx.zza(context))));
        zzrhVar.zzf("customTag", new zzrc(new zzni(new zzhy(this, null))));
        zzrhVar.zzf("universalAnalytics", new zzrc(new zzpg(context, zzhwVar)));
        zzrhVar.zzf("queueRequest", new zzrc(new zzpd(zzgx.zza(context))));
        zzrhVar.zzf("sendMeasurement", new zzrc(new zzpe(zzcoVar, zzhwVar)));
        zzrhVar.zzf("arbitraryPixieTag", new zzrc(new zznj(0, zzieVar)));
        zzrhVar.zzf("suppressPassthrough", new zzrc(new zznl(context, zzhwVar)));
        zzrhVar2.zzf("decodeURI", new zzrc(new zznc()));
        zzrhVar2.zzf("decodeURIComponent", new zzrc(new zznd()));
        zzrhVar2.zzf("encodeURI", new zzrc(new zzne()));
        zzrhVar2.zzf("encodeURIComponent", new zzrc(new zznf()));
        zzrhVar2.zzf(Constant.NOTIFICATION_DETAILS_LOG, new zzrc(new zznk()));
        zzrhVar2.zzf("isArray", new zzrc(new zzng()));
        for (zzjv zzjvVar : zzqsVar.zza()) {
            zzjvVar.zzc(this.zzf);
            this.zzf.zzc(zzjvVar.zzb(), new zzrc(zzjvVar));
        }
        zzrh zzrhVar3 = new zzrh(new HashMap(1));
        zzrhVar3.zzf("mobile", this.zzg);
        zzrhVar3.zzf("common", this.zzh);
        this.zzf.zzc("gtmUtils", zzrhVar3);
        zzrh zzrhVar4 = new zzrh(new HashMap(this.zzg.zzi()));
        zzrhVar4.zzj();
        zzrh zzrhVar5 = new zzrh(new HashMap(this.zzh.zzi()));
        zzrhVar5.zzj();
        if (this.zzf.zzf(SentryThread.JsonKeys.MAIN) && (this.zzf.zzb(SentryThread.JsonKeys.MAIN) instanceof zzrc)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzrhVar3);
            zzrl.zzd(this.zzf, new zzri(SentryThread.JsonKeys.MAIN, arrayList));
        }
        this.zzg.zzf(Constants.SENSITIVITY_BASE, zzrhVar4);
        this.zzh.zzf(Constants.SENSITIVITY_BASE, zzrhVar5);
        zzrhVar3.zzj();
        this.zzg.zzj();
        this.zzh.zzj();
    }

    private final zzqz zzg(Map map) {
        zzri zzriVarZza;
        zzqz zzqzVar = (zzqz) map.get(zzb.FUNCTION.toString());
        if (!(zzqzVar instanceof zzrk)) {
            zzgv.zza("No function id in properties", this.zza);
            return zzrd.zze;
        }
        String strZzk = ((zzrk) zzqzVar).zzk();
        if (this.zzf.zzf(strZzk)) {
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((String) entry.getKey()).startsWith("vtp_")) {
                    map2.put(((String) entry.getKey()).substring(4), (zzqz) entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new zzrh(map2));
            zzriVarZza = new zzri(strZzk, arrayList);
        } else {
            String strZzb = zzju.zzb(strZzk);
            if (strZzb == null || !this.zzg.zzh(strZzb)) {
                zzgv.zza("functionId '" + strZzk + "' is not supported", this.zza);
                return zzrd.zze;
            }
            try {
                zzriVarZza = zzju.zza(strZzk, map, this.zzf);
            } catch (RuntimeException e2) {
                zzho.zza("Incorrect keys for function " + strZzk + ". " + e2.getMessage());
                zzriVarZza = null;
            }
        }
        if (zzriVarZza == null) {
            zzgv.zza("Internal error: failed to convert function to a valid statement", this.zza);
            return zzrd.zze;
        }
        zzho.zzd("Executing: ".concat(String.valueOf(zzriVarZza.zzi())));
        zzqz zzqzVarZzd = zzrl.zzd(this.zzf, zzriVarZza);
        if (!(zzqzVarZzd instanceof zzrd)) {
            return zzqzVarZzd;
        }
        zzrd zzrdVar = (zzrd) zzqzVarZzd;
        return zzrdVar.zzj() ? zzrdVar.zzi() : zzqzVarZzd;
    }

    private final zzqz zzh(zzqv zzqvVar) {
        switch (zzqvVar.zza()) {
            case 1:
                try {
                    return new zzrb(Double.valueOf(Double.parseDouble((String) zzqvVar.zzb())));
                } catch (NumberFormatException unused) {
                    return new zzrk((String) zzqvVar.zzb());
                }
            case 2:
                List list = (List) zzqvVar.zzb();
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzh((zzqv) it.next()));
                }
                return new zzrg(arrayList);
            case 3:
                Map map = (Map) zzqvVar.zzb();
                HashMap map2 = new HashMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    zzqz zzqzVarZzh = zzh((zzqv) entry.getKey());
                    map2.put(zzjx.zzd(zzqzVarZzh), zzh((zzqv) entry.getValue()));
                }
                return new zzrh(map2);
            case 4:
                zzqz zzqzVarZzi = zzi((String) zzqvVar.zzb());
                if (!(zzqzVarZzi instanceof zzrk) || zzqvVar.zzc().isEmpty()) {
                    return zzqzVarZzi;
                }
                String strZzk = ((zzrk) zzqzVarZzi).zzk();
                Iterator it2 = zzqvVar.zzc().iterator();
                while (it2.hasNext()) {
                    if (((Integer) it2.next()).intValue() == 12) {
                        try {
                            strZzk = URLEncoder.encode(strZzk, "UTF-8").replaceAll("\\+", "%20");
                        } catch (UnsupportedEncodingException e2) {
                            zzho.zzb("Escape URI: unsupported encoding", e2);
                        }
                    }
                }
                return new zzrk(strZzk);
            case 5:
                return new zzrk((String) zzqvVar.zzb());
            case 6:
                return new zzrb(Double.valueOf(((Integer) zzqvVar.zzb()).doubleValue()));
            case 7:
                StringBuilder sb = new StringBuilder();
                Iterator it3 = ((List) zzqvVar.zzb()).iterator();
                while (it3.hasNext()) {
                    sb.append(zzjx.zzd(zzh((zzqv) it3.next())));
                }
                return new zzrk(sb.toString());
            default:
                return new zzra((Boolean) zzqvVar.zzb());
        }
    }

    private final zzqz zzi(String str) {
        this.zzj++;
        zzho.zzd(zzj() + "Beginning to evaluate variable " + str);
        if (this.zzi.contains(str)) {
            this.zzj--;
            throw new IllegalStateException("Macro cycle detected.  Current macro reference: " + str + ". Previous macro references: " + this.zzi.toString());
        }
        this.zzi.add(str);
        zzqm zzqmVarZza = this.zzc.zza(str);
        if (zzqmVarZza == null) {
            this.zzj--;
            this.zzi.remove(str);
            throw new IllegalStateException(zzj() + "Attempting to resolve unknown macro " + str);
        }
        zzqz zzqzVarZzg = zzg(zzk(zzqmVarZza.zza()));
        zzho.zzd(zzj() + "Done evaluating variable " + str);
        this.zzj = this.zzj + (-1);
        this.zzi.remove(str);
        return zzqzVarZzg;
    }

    private final String zzj() {
        if (this.zzj <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.zzj));
        for (int i2 = 2; i2 < this.zzj; i2++) {
            sb.append(TokenParser.SP);
        }
        sb.append(": ");
        return sb.toString();
    }

    private final Map zzk(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), zzh((zzqv) entry.getValue()));
        }
        return map2;
    }

    private final void zzl(zza zzaVar, zzjw zzjwVar) {
        int i2 = zzju.zza;
        this.zzg.zzf(zzju.zzb(zzaVar.toString()), new zzrc(zzjwVar));
    }

    public final zzqz zzc(String str) {
        if (!this.zzi.contains(str)) {
            this.zzj = 0;
            return zzi(str);
        }
        throw new IllegalStateException("Macro cycle detected.  Current macro reference: " + str + ". Previous macro references: " + this.zzi.toString());
    }

    final zzqz zzd(zzqm zzqmVar) {
        this.zzi.clear();
        try {
            zzqz zzqzVarZzg = zzg(zzk(zzqmVar.zza()));
            if (zzqzVarZzg instanceof zzra) {
                return zzqzVarZzg;
            }
            zzgv.zza("Predicate must return a boolean value", this.zza);
            return new zzra(false);
        } catch (IllegalStateException unused) {
            zzho.zza("Error evaluating predicate.");
            return zzrd.zzd;
        }
    }

    public final void zze() {
        zzgx.zza(this.zza);
        zzin.zzf().zzi();
    }

    public final void zzf(zzgz zzgzVar) {
        boolean z2;
        zzqz zzraVar;
        this.zzf.zzc("gtm.globals.eventName", new zzrk(zzgzVar.zzb()));
        this.zzk.zza(zzgzVar);
        this.zzl = zzgzVar;
        HashSet<zzqm> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        Iterator it = this.zzc.zzc().iterator();
        while (true) {
            z2 = false;
            if (!it.hasNext()) {
                break;
            }
            zzqp zzqpVar = (zzqp) it.next();
            if (zzqpVar.zza().isEmpty() && zzqpVar.zzd().isEmpty()) {
                zzho.zzd("Trigger is not being evaluated since it has no associated tags: ".concat(String.valueOf(String.valueOf(zzqpVar))));
            } else {
                zzho.zzd("Evaluating trigger ".concat(String.valueOf(String.valueOf(zzqpVar))));
                Iterator it2 = zzqpVar.zzb().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zzqm zzqmVar = (zzqm) it2.next();
                        zzqz zzqzVarZzd = (zzqz) map.get(zzqmVar);
                        if (zzqzVarZzd == null) {
                            zzqzVarZzd = zzd(zzqmVar);
                            map.put(zzqmVar, zzqzVarZzd);
                        }
                        zzraVar = zzrd.zzd;
                        if (zzqzVarZzd != zzraVar) {
                            if (((zzra) zzqzVarZzd).zzi().booleanValue()) {
                                zzraVar = new zzra(false);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Iterator it3 = zzqpVar.zzc().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                zzraVar = new zzra(true);
                                break;
                            }
                            zzqm zzqmVar2 = (zzqm) it3.next();
                            zzqz zzqzVarZzd2 = (zzqz) map.get(zzqmVar2);
                            if (zzqzVarZzd2 == null) {
                                zzqzVarZzd2 = zzd(zzqmVar2);
                                map.put(zzqmVar2, zzqzVarZzd2);
                            }
                            zzraVar = zzrd.zzd;
                            if (zzqzVarZzd2 != zzraVar) {
                                if (!((zzra) zzqzVarZzd2).zzi().booleanValue()) {
                                    zzraVar = new zzra(false);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                if (zzraVar == zzrd.zzd) {
                    zzgv.zzc("Error encounted while evaluating trigger ".concat(String.valueOf(String.valueOf(zzqpVar))), this.zza);
                    if (!zzqpVar.zzd().isEmpty()) {
                        zzho.zzd("Blocking tags: ".concat(String.valueOf(String.valueOf(zzqpVar.zzd()))));
                        hashSet2.addAll(zzqpVar.zzd());
                    }
                } else if (((zzra) zzraVar).zzi().booleanValue()) {
                    zzho.zzd("Trigger is firing: ".concat(String.valueOf(String.valueOf(zzqpVar))));
                    if (!zzqpVar.zza().isEmpty()) {
                        zzho.zzd("Adding tags to firing candidates: ".concat(String.valueOf(String.valueOf(zzqpVar.zza()))));
                        hashSet.addAll(zzqpVar.zza());
                    }
                    if (!zzqpVar.zzd().isEmpty()) {
                        zzho.zzd("Blocking disabled tags: ".concat(String.valueOf(String.valueOf(zzqpVar.zzd()))));
                        hashSet2.addAll(zzqpVar.zzd());
                    }
                }
            }
        }
        hashSet.removeAll(hashSet2);
        for (zzqm zzqmVar3 : hashSet) {
            this.zzi.clear();
            zzho.zzd("Executing firing tag ".concat(String.valueOf(String.valueOf(zzqmVar3))));
            try {
                zzg(zzk(zzqmVar3.zza()));
                zzqv zzqvVar = (zzqv) zzqmVar3.zza().get(zzb.DISPATCH_ON_FIRE.toString());
                if (zzqvVar != null && zzqvVar.zza() == 8 && ((Boolean) zzqvVar.zzb()).booleanValue()) {
                    try {
                        zzho.zzd("Tag configured to dispatch on fire: " + String.valueOf(zzqmVar3));
                        z2 = true;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        z2 = true;
                        zzgv.zzb("Error firing tag " + String.valueOf(zzqmVar3) + ": ", e, this.zza);
                    }
                }
            } catch (IllegalStateException e3) {
                e = e3;
            }
        }
        this.zzf.zzd("gtm.globals.eventName");
        if (zzgzVar.zzf()) {
            zzho.zzd("Log passthrough event " + zzgzVar.zzb() + " to Firebase.");
            try {
                this.zzd.zzc(zzgzVar.zzc(), zzgzVar.zzb(), zzgzVar.zza(), zzgzVar.currentTimeMillis());
            } catch (RemoteException e4) {
                zzgv.zzb("Error calling measurement proxy: ", e4, this.zza);
            }
        } else {
            zzho.zzd("Non-passthrough event " + zzgzVar.zzb() + " doesn't get logged to Firebase directly.");
        }
        if (z2) {
            zzho.zzd("Dispatch called for dispatchOnFire tags.");
            zze();
        }
    }
}
