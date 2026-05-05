package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.facebook.imageutils.JfifUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.internal.zzje;
import com.google.firebase.messaging.Constants;
import io.sentry.protocol.App;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class zznv implements zzjc {
    private static volatile zznv zza = null;
    private List<Long> zzaa;
    private long zzab;
    private final Map<String, zzje> zzac;
    private final Map<String, zzax> zzad;
    private final Map<String, zzb> zzae;
    private zzlk zzaf;
    private String zzag;
    private final zzor zzah;
    private zzhl zzb;
    private zzgr zzc;
    private zzal zzd;
    private zzgy zze;
    private zznq zzf;
    private zzt zzg;
    private final zzoo zzh;
    private zzli zzi;
    private zzmw zzj;
    private final zznu zzk;
    private zzhf zzl;
    private final zzhy zzm;
    private boolean zzn;
    private boolean zzo;
    private long zzp;
    private List<Runnable> zzq;
    private final Set<String> zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List<Long> zzz;

    private class zza implements zzas {
        zzfy.zzk zza;
        List<Long> zzb;
        List<zzfy.zzf> zzc;
        private long zzd;

        private zza() {
        }

        /* synthetic */ zza(zznv zznvVar, zzoi zzoiVar) {
            this();
        }

        private static long zza(zzfy.zzf zzfVar) {
            return ((zzfVar.zzd() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.zzas
        public final void zza(zzfy.zzk zzkVar) {
            Preconditions.checkNotNull(zzkVar);
            this.zza = zzkVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzas
        public final boolean zza(long j2, zzfy.zzf zzfVar) {
            Preconditions.checkNotNull(zzfVar);
            if (this.zzc == null) {
                this.zzc = new ArrayList();
            }
            if (this.zzb == null) {
                this.zzb = new ArrayList();
            }
            if (!this.zzc.isEmpty() && zza(this.zzc.get(0)) != zza(zzfVar)) {
                return false;
            }
            long jZzcb = this.zzd + ((long) zzfVar.zzcb());
            zznv.this.zze();
            if (jZzcb >= Math.max(0, zzbh.zzi.zza(null).intValue())) {
                return false;
            }
            this.zzd = jZzcb;
            this.zzc.add(zzfVar);
            this.zzb.add(Long.valueOf(j2));
            int size = this.zzc.size();
            zznv.this.zze();
            return size < Math.max(1, zzbh.zzj.zza(null).intValue());
        }
    }

    private class zzb {
        final String zza;
        long zzb;

        private zzb(zznv zznvVar) {
            this(zznvVar, zznvVar.zzq().zzp());
        }

        /* synthetic */ zzb(zznv zznvVar, zzoi zzoiVar) {
            this(zznvVar);
        }

        private zzb(zznv zznvVar, String str) {
            this.zza = str;
            this.zzb = zznvVar.zzb().elapsedRealtime();
        }

        /* synthetic */ zzb(zznv zznvVar, String str, zzoi zzoiVar) {
            this(zznvVar, str);
        }
    }

    private zznv(zzok zzokVar) {
        this(zzokVar, null);
    }

    private zznv(zzok zzokVar, zzhy zzhyVar) {
        this.zzn = false;
        this.zzr = new HashSet();
        this.zzah = new zzof(this);
        Preconditions.checkNotNull(zzokVar);
        this.zzm = zzhy.zza(zzokVar.zza, null, null);
        this.zzab = -1L;
        this.zzk = new zznu(this);
        zzoo zzooVar = new zzoo(this);
        zzooVar.zzam();
        this.zzh = zzooVar;
        zzgr zzgrVar = new zzgr(this);
        zzgrVar.zzam();
        this.zzc = zzgrVar;
        zzhl zzhlVar = new zzhl(this);
        zzhlVar.zzam();
        this.zzb = zzhlVar;
        this.zzac = new HashMap();
        this.zzad = new HashMap();
        this.zzae = new HashMap();
        zzl().zzb(new zznx(this, zzokVar));
    }

    private final int zza(String str, zzah zzahVar) {
        zzjh zzjhVarZza;
        if (this.zzb.zzb(str) == null) {
            zzahVar.zza(zzje.zza.AD_PERSONALIZATION, zzak.FAILSAFE);
            return 1;
        }
        zzg zzgVarZze = zzf().zze(str);
        if (zzgVarZze == null || zzf.zza(zzgVarZze.zzak()).zza() != zzjh.POLICY || (zzjhVarZza = this.zzb.zza(str, zzje.zza.AD_PERSONALIZATION)) == zzjh.UNINITIALIZED) {
            zzahVar.zza(zzje.zza.AD_PERSONALIZATION, zzak.REMOTE_DEFAULT);
            return this.zzb.zzc(str, zzje.zza.AD_PERSONALIZATION) ? 0 : 1;
        }
        zzahVar.zza(zzje.zza.AD_PERSONALIZATION, zzak.REMOTE_ENFORCED_DEFAULT);
        return zzjhVarZza == zzjh.GRANTED ? 0 : 1;
    }

    private final int zza(FileChannel fileChannel) {
        zzl().zzt();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzj().zzg().zza("Bad channel to read from");
            return 0;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int i2 = fileChannel.read(byteBufferAllocate);
            if (i2 == 4) {
                byteBufferAllocate.flip();
                return byteBufferAllocate.getInt();
            }
            if (i2 != -1) {
                zzj().zzu().zza("Unexpected data length. Bytes read", Integer.valueOf(i2));
            }
            return 0;
        } catch (IOException e2) {
            zzj().zzg().zza("Failed to read from channel", e2);
            return 0;
        }
    }

    private final zzax zza(String str, zzax zzaxVar, zzje zzjeVar, zzah zzahVar) {
        int iZza = 90;
        boolean z2 = true;
        if (zzi().zzb(str) == null) {
            if (zzaxVar.zzc() == zzjh.DENIED) {
                iZza = zzaxVar.zza();
                zzahVar.zza(zzje.zza.AD_USER_DATA, iZza);
            } else {
                zzahVar.zza(zzje.zza.AD_USER_DATA, zzak.FAILSAFE);
            }
            return new zzax((Boolean) false, iZza, (Boolean) true, Global.HYPHEN);
        }
        zzjh zzjhVarZzc = zzaxVar.zzc();
        if (zzjhVarZzc == zzjh.GRANTED || zzjhVarZzc == zzjh.DENIED) {
            iZza = zzaxVar.zza();
            zzahVar.zza(zzje.zza.AD_USER_DATA, iZza);
        } else if (zzjhVarZzc != zzjh.POLICY || (zzjhVarZzc = this.zzb.zza(str, zzje.zza.AD_USER_DATA)) == zzjh.UNINITIALIZED) {
            zzje.zza zzaVarZzb = this.zzb.zzb(str, zzje.zza.AD_USER_DATA);
            zzjhVarZzc = zzjeVar.zzc();
            if (zzjhVarZzc != zzjh.GRANTED && zzjhVarZzc != zzjh.DENIED) {
                z2 = false;
            }
            if (zzaVarZzb == zzje.zza.AD_STORAGE && z2) {
                zzahVar.zza(zzje.zza.AD_USER_DATA, zzak.REMOTE_DELEGATION);
            } else {
                zzahVar.zza(zzje.zza.AD_USER_DATA, zzak.REMOTE_DEFAULT);
                zzjhVarZzc = this.zzb.zzc(str, zzje.zza.AD_USER_DATA) ? zzjh.GRANTED : zzjh.DENIED;
            }
        } else {
            zzahVar.zza(zzje.zza.AD_USER_DATA, zzak.REMOTE_ENFORCED_DEFAULT);
        }
        boolean zZzm = this.zzb.zzm(str);
        SortedSet<String> sortedSetZzh = zzi().zzh(str);
        if (zzjhVarZzc == zzjh.DENIED || sortedSetZzh.isEmpty()) {
            return new zzax((Boolean) false, iZza, Boolean.valueOf(zZzm), Global.HYPHEN);
        }
        return new zzax((Boolean) true, iZza, Boolean.valueOf(zZzm), zZzm ? TextUtils.join("", sortedSetZzh) : "");
    }

    private static zznr zza(zznr zznrVar) {
        if (zznrVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zznrVar.zzan()) {
            return zznrVar;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(zznrVar.getClass()));
    }

    public static zznv zza(Context context) throws Throwable {
        Preconditions.checkNotNull(context);
        short sXd = (short) (FB.Xd() ^ 28097);
        int[] iArr = new int["q}r\u007f{tn7kvtyiqv/Cnlqasn".length()];
        QB qb = new QB("q}r\u007f{tn7kvtyiqv/Cnlqasn");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Kd("\u0004\u0003\u0013`\u0011\u0012\u000f\r\b\u0007\u001b\u0011\u0018\u0018m\u001b\u001b\"\u0014(%", (short) (ZN.Xd() ^ JfifUtil.MARKER_APP1)), new Class[0]);
        try {
            method.setAccessible(true);
            Preconditions.checkNotNull((Context) method.invoke(context, objArr));
            if (zza == null) {
                synchronized (zznv.class) {
                    if (zza == null) {
                        zza = new zznv((zzok) Preconditions.checkNotNull(new zzok(context)));
                    }
                }
            }
            return zza;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final Boolean zza(zzg zzgVar) {
        try {
            if (zzgVar.zze() != -2147483648L) {
                if (zzgVar.zze() == Wrappers.packageManager(this.zzm.zza()).getPackageInfo(zzgVar.zzac(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzm.zza()).getPackageInfo(zzgVar.zzac(), 0).versionName;
                String strZzaf = zzgVar.zzaf();
                if (strZzaf != null && strZzaf.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final String zza(zzje zzjeVar) throws Throwable {
        if (!zzjeVar.zzh()) {
            return null;
        }
        byte[] bArr = new byte[16];
        SecureRandom secureRandomZzv = zzq().zzv();
        Object[] objArr = {bArr};
        Method method = Class.forName(Wg.Zd(";k9]DCmB\u000eCS\u0019Wd@\f\"m%p\u0017\\\u00031uN", (short) (OY.Xd() ^ 24342), (short) (OY.Xd() ^ 6780))).getMethod(C1561oA.Xd(";3GD\u0013KG9H", (short) (FB.Xd() ^ 20025)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandomZzv, objArr);
            return String.format(Locale.US, Wg.vd("{\b\f\fS", (short) (C1580rY.Xd() ^ (-19562))), new BigInteger(1, bArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String zza(Map<String, List<String>> map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                if (entry.getValue().isEmpty()) {
                    return null;
                }
                return entry.getValue().get(0);
            }
        }
        return null;
    }

    private static void zza(zzfy.zzf.zza zzaVar, int i2, String str) {
        List<zzfy.zzh> listZzf = zzaVar.zzf();
        for (int i3 = 0; i3 < listZzf.size(); i3++) {
            if ("_err".equals(listZzf.get(i3).zzg())) {
                return;
            }
        }
        zzaVar.zza((zzfy.zzh) ((com.google.android.gms.internal.measurement.zzjt) zzfy.zzh.zze().zza("_err").zza(Long.valueOf(i2).longValue()).zzai())).zza((zzfy.zzh) ((com.google.android.gms.internal.measurement.zzjt) zzfy.zzh.zze().zza("_ev").zzb(str).zzai()));
    }

    private static void zza(zzfy.zzf.zza zzaVar, String str) {
        List<zzfy.zzh> listZzf = zzaVar.zzf();
        for (int i2 = 0; i2 < listZzf.size(); i2++) {
            if (str.equals(listZzf.get(i2).zzg())) {
                zzaVar.zza(i2);
                return;
            }
        }
    }

    private final void zza(zzfy.zzk.zza zzaVar, long j2, boolean z2) {
        String str = z2 ? "_se" : "_lte";
        zzop zzopVarZze = zzf().zze(zzaVar.zzt(), str);
        zzop zzopVar = (zzopVarZze == null || zzopVarZze.zze == null) ? new zzop(zzaVar.zzt(), "auto", str, zzb().currentTimeMillis(), Long.valueOf(j2)) : new zzop(zzaVar.zzt(), "auto", str, zzb().currentTimeMillis(), Long.valueOf(((Long) zzopVarZze.zze).longValue() + j2));
        zzfy.zzo zzoVar = (zzfy.zzo) ((com.google.android.gms.internal.measurement.zzjt) zzfy.zzo.zze().zza(str).zzb(zzb().currentTimeMillis()).zza(((Long) zzopVar.zze).longValue()).zzai());
        int iZza = zzoo.zza(zzaVar, str);
        if (iZza >= 0) {
            zzaVar.zza(iZza, zzoVar);
        } else {
            zzaVar.zza(zzoVar);
        }
        if (j2 > 0) {
            zzf().zza(zzopVar);
            zzj().zzp().zza("Updated engagement user property. scope, value", z2 ? "session-scoped" : "lifetime", zzopVar.zze);
        }
    }

    static /* synthetic */ void zza(zznv zznvVar, zzok zzokVar) {
        zznvVar.zzl().zzt();
        zznvVar.zzl = new zzhf(zznvVar);
        zzal zzalVar = new zzal(zznvVar);
        zzalVar.zzam();
        zznvVar.zzd = zzalVar;
        zznvVar.zze().zza((zzai) Preconditions.checkNotNull(zznvVar.zzb));
        zzmw zzmwVar = new zzmw(zznvVar);
        zzmwVar.zzam();
        zznvVar.zzj = zzmwVar;
        zzt zztVar = new zzt(zznvVar);
        zztVar.zzam();
        zznvVar.zzg = zztVar;
        zzli zzliVar = new zzli(zznvVar);
        zzliVar.zzam();
        zznvVar.zzi = zzliVar;
        zznq zznqVar = new zznq(zznvVar);
        zznqVar.zzam();
        zznvVar.zzf = zznqVar;
        zznvVar.zze = new zzgy(zznvVar);
        if (zznvVar.zzs != zznvVar.zzt) {
            zznvVar.zzj().zzg().zza("Not all upload components initialized", Integer.valueOf(zznvVar.zzs), Integer.valueOf(zznvVar.zzt));
        }
        zznvVar.zzn = true;
    }

    private final void zza(String str, zzfy.zzh.zza zzaVar, Bundle bundle, String str2) {
        List listListOf = CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"});
        long jZzb = (zzos.zzg(zzaVar.zzf()) || zzos.zzg(str)) ? zze().zzb(str2, true) : zze().zza(str2, true);
        long jCodePointCount = zzaVar.zzg().codePointCount(0, zzaVar.zzg().length());
        zzq();
        String strZzf = zzaVar.zzf();
        zze();
        String strZza = zzos.zza(strZzf, 40, true);
        if (jCodePointCount <= jZzb || listListOf.contains(zzaVar.zzf())) {
            return;
        }
        if ("_ev".equals(zzaVar.zzf())) {
            zzq();
            bundle.putString("_ev", zzos.zza(zzaVar.zzg(), zze().zzb(str2, true), true));
            return;
        }
        zzj().zzv().zza("Param value is too long; discarded. Name, value length", strZza, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strZza);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(zzaVar.zzf());
    }

    private final void zza(String str, zzje zzjeVar) {
        zzl().zzt();
        zzs();
        this.zzac.put(str, zzjeVar);
        zzf().zzb(str, zzjeVar);
    }

    private final void zza(String str, boolean z2, Long l2, Long l3) {
        zzg zzgVarZze = zzf().zze(str);
        if (zzgVarZze != null) {
            zzgVarZze.zzd(z2);
            zzgVarZze.zza(l2);
            zzgVarZze.zzb(l3);
            if (zzgVarZze.zzas()) {
                zzf().zza(zzgVarZze, false, false);
            }
        }
    }

    private final void zza(List<Long> list) {
        Preconditions.checkArgument(!list.isEmpty());
        if (this.zzz != null) {
            zzj().zzg().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    private final boolean zza(int i2, FileChannel fileChannel) {
        zzl().zzt();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzj().zzg().zza("Bad channel to read from");
            return false;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(byteBufferAllocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                zzj().zzg().zza("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            zzj().zzg().zza("Failed to write to channel", e2);
            return false;
        }
    }

    private final boolean zza(zzfy.zzf.zza zzaVar, zzfy.zzf.zza zzaVar2) {
        Preconditions.checkArgument("_e".equals(zzaVar.zze()));
        zzp();
        zzfy.zzh zzhVarZza = zzoo.zza((zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai()), "_sc");
        String strZzh = zzhVarZza == null ? null : zzhVarZza.zzh();
        zzp();
        zzfy.zzh zzhVarZza2 = zzoo.zza((zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) zzaVar2.zzai()), "_pc");
        String strZzh2 = zzhVarZza2 != null ? zzhVarZza2.zzh() : null;
        if (strZzh2 == null || !strZzh2.equals(strZzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzaVar.zze()));
        zzp();
        zzfy.zzh zzhVarZza3 = zzoo.zza((zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai()), "_et");
        if (zzhVarZza3 == null || !zzhVarZza3.zzl() || zzhVarZza3.zzd() <= 0) {
            return true;
        }
        long jZzd = zzhVarZza3.zzd();
        zzp();
        zzfy.zzh zzhVarZza4 = zzoo.zza((zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) zzaVar2.zzai()), "_et");
        if (zzhVarZza4 != null && zzhVarZza4.zzd() > 0) {
            jZzd += zzhVarZza4.zzd();
        }
        zzp();
        zzoo.zza(zzaVar2, "_et", Long.valueOf(jZzd));
        zzp();
        zzoo.zza(zzaVar, "_fr", (Object) 1L);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1073:0x0da1 A[Catch: all -> 0x1155, TryCatch #2 {all -> 0x1155, blocks: (B:640:0x000d, B:717:0x0237, B:718:0x023a, B:720:0x023e, B:725:0x0256, B:726:0x0271, B:729:0x0281, B:732:0x02a8, B:734:0x02dd, B:737:0x02ef, B:739:0x02f9, B:896:0x07f3, B:740:0x0315, B:742:0x0323, B:745:0x0341, B:747:0x0347, B:749:0x0357, B:751:0x0365, B:753:0x0375, B:754:0x0382, B:755:0x0385, B:757:0x0399, B:806:0x0588, B:807:0x0594, B:810:0x059e, B:817:0x05c2, B:813:0x05af, B:820:0x05c8, B:822:0x05d4, B:824:0x05e0, B:832:0x0612, B:833:0x062a, B:835:0x0634, B:846:0x0660, B:848:0x0673, B:850:0x0681, B:864:0x06dc, B:866:0x06e2, B:867:0x06ee, B:869:0x06f4, B:871:0x0704, B:873:0x070e, B:874:0x071f, B:876:0x0725, B:877:0x073e, B:879:0x0744, B:880:0x075b, B:881:0x0760, B:885:0x0788, B:882:0x0766, B:884:0x0772, B:886:0x078e, B:887:0x07a2, B:889:0x07a8, B:891:0x07bc, B:892:0x07cb, B:894:0x07d5, B:895:0x07e1, B:852:0x068c, B:854:0x0698, B:857:0x06ad, B:859:0x06c0, B:861:0x06ce, B:830:0x0601, B:839:0x0647, B:841:0x064d, B:844:0x0658, B:760:0x03ae, B:763:0x03ba, B:766:0x03c2, B:768:0x03d0, B:773:0x041f, B:769:0x03ef, B:771:0x03fd, B:776:0x0426, B:778:0x0454, B:779:0x0480, B:781:0x04b5, B:782:0x04b8, B:787:0x04c8, B:789:0x04ff, B:790:0x051a, B:792:0x0520, B:794:0x052e, B:798:0x0544, B:795:0x0539, B:801:0x054b, B:803:0x0551, B:804:0x056f, B:899:0x07fe, B:901:0x080c, B:903:0x0815, B:914:0x0845, B:915:0x0849, B:904:0x0819, B:906:0x0825, B:908:0x082b, B:911:0x0837, B:913:0x083f, B:916:0x084c, B:917:0x0858, B:920:0x0860, B:922:0x0872, B:923:0x087d, B:925:0x0885, B:926:0x0889, B:928:0x08a3, B:929:0x08b4, B:931:0x08ba, B:933:0x08c6, B:935:0x08e0, B:937:0x0900, B:936:0x08f1, B:943:0x092b, B:945:0x0931, B:947:0x0941, B:948:0x0948, B:950:0x0954, B:951:0x095b, B:952:0x095e, B:954:0x0969, B:956:0x0975, B:958:0x09ae, B:960:0x09b4, B:961:0x09c1, B:963:0x09c7, B:964:0x09d0, B:966:0x09d6, B:978:0x0a1c, B:980:0x0a22, B:982:0x0a28, B:967:0x09dc, B:969:0x09e2, B:971:0x09f4, B:973:0x0a03, B:975:0x0a13, B:984:0x0a37, B:986:0x0a3d, B:987:0x0a52, B:989:0x0a58, B:991:0x0a68, B:993:0x0a80, B:995:0x0a92, B:997:0x0ab9, B:999:0x0ae1, B:1001:0x0af3, B:1002:0x0b14, B:1004:0x0b3f, B:1006:0x0b70, B:1008:0x0b82, B:1009:0x0ba3, B:1011:0x0bce, B:998:0x0ad4, B:1013:0x0bff, B:1014:0x0c03, B:1016:0x0c09, B:1018:0x0c15, B:1019:0x0c47, B:1021:0x0c57, B:1022:0x0c6a, B:1024:0x0c70, B:1027:0x0c8b, B:1029:0x0ca6, B:1031:0x0cbc, B:1033:0x0cc1, B:1035:0x0cc5, B:1037:0x0cc9, B:1039:0x0cd5, B:1040:0x0cdd, B:1042:0x0ce1, B:1044:0x0ce9, B:1045:0x0cf7, B:1046:0x0d02, B:1118:0x0f2d, B:1047:0x0d07, B:1051:0x0d39, B:1052:0x0d41, B:1054:0x0d47, B:1056:0x0d57, B:1058:0x0d5b, B:1073:0x0da1, B:1074:0x0dc6, B:1076:0x0dd2, B:1078:0x0de6, B:1079:0x0e22, B:1085:0x0e3c, B:1087:0x0e43, B:1089:0x0e54, B:1091:0x0e58, B:1093:0x0e5c, B:1095:0x0e60, B:1096:0x0e6c, B:1097:0x0e71, B:1099:0x0e7a, B:1101:0x0e96, B:1102:0x0e9f, B:1116:0x0f27, B:1103:0x0eb1, B:1105:0x0eb5, B:1109:0x0ecb, B:1111:0x0ef5, B:1112:0x0f03, B:1113:0x0f13, B:1115:0x0f1b, B:1106:0x0ebc, B:1060:0x0d69, B:1062:0x0d6d, B:1064:0x0d77, B:1066:0x0d7b, B:1070:0x0d8b, B:1120:0x0f62, B:1122:0x0f6c, B:1123:0x0f73, B:1124:0x0f7b, B:1126:0x0f81, B:1127:0x0f95, B:1129:0x0fa5, B:1130:0x0fbc, B:1132:0x0fc2, B:1134:0x0fd2, B:1142:0x102a, B:1139:0x0fe9, B:1136:0x0fd8, B:1138:0x0fe4, B:1141:0x1012, B:1140:0x0ffa, B:1172:0x10c2, B:1175:0x10ca, B:1176:0x10cf, B:1177:0x10df, B:1179:0x10f9, B:1180:0x1112, B:1181:0x111a, B:1184:0x113b, B:1183:0x112a, B:1143:0x1032, B:1145:0x1038, B:1147:0x1042, B:1148:0x1045, B:1157:0x105e, B:1158:0x1061, B:1160:0x1067, B:1162:0x1073, B:1164:0x1080, B:1165:0x1090, B:1167:0x10ac, B:1168:0x10af, B:1169:0x10b9, B:1170:0x10bd, B:1156:0x105a, B:1151:0x1050, B:1119:0x0f35, B:938:0x0904, B:939:0x0908, B:941:0x090e, B:722:0x0246, B:674:0x0104, B:688:0x01a4, B:702:0x01fa, B:703:0x01fe, B:707:0x0216, B:716:0x0233, B:1192:0x1151, B:1193:0x1154, B:667:0x00b3, B:676:0x010d), top: B:1201:0x000d, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1074:0x0dc6 A[Catch: all -> 0x1155, TryCatch #2 {all -> 0x1155, blocks: (B:640:0x000d, B:717:0x0237, B:718:0x023a, B:720:0x023e, B:725:0x0256, B:726:0x0271, B:729:0x0281, B:732:0x02a8, B:734:0x02dd, B:737:0x02ef, B:739:0x02f9, B:896:0x07f3, B:740:0x0315, B:742:0x0323, B:745:0x0341, B:747:0x0347, B:749:0x0357, B:751:0x0365, B:753:0x0375, B:754:0x0382, B:755:0x0385, B:757:0x0399, B:806:0x0588, B:807:0x0594, B:810:0x059e, B:817:0x05c2, B:813:0x05af, B:820:0x05c8, B:822:0x05d4, B:824:0x05e0, B:832:0x0612, B:833:0x062a, B:835:0x0634, B:846:0x0660, B:848:0x0673, B:850:0x0681, B:864:0x06dc, B:866:0x06e2, B:867:0x06ee, B:869:0x06f4, B:871:0x0704, B:873:0x070e, B:874:0x071f, B:876:0x0725, B:877:0x073e, B:879:0x0744, B:880:0x075b, B:881:0x0760, B:885:0x0788, B:882:0x0766, B:884:0x0772, B:886:0x078e, B:887:0x07a2, B:889:0x07a8, B:891:0x07bc, B:892:0x07cb, B:894:0x07d5, B:895:0x07e1, B:852:0x068c, B:854:0x0698, B:857:0x06ad, B:859:0x06c0, B:861:0x06ce, B:830:0x0601, B:839:0x0647, B:841:0x064d, B:844:0x0658, B:760:0x03ae, B:763:0x03ba, B:766:0x03c2, B:768:0x03d0, B:773:0x041f, B:769:0x03ef, B:771:0x03fd, B:776:0x0426, B:778:0x0454, B:779:0x0480, B:781:0x04b5, B:782:0x04b8, B:787:0x04c8, B:789:0x04ff, B:790:0x051a, B:792:0x0520, B:794:0x052e, B:798:0x0544, B:795:0x0539, B:801:0x054b, B:803:0x0551, B:804:0x056f, B:899:0x07fe, B:901:0x080c, B:903:0x0815, B:914:0x0845, B:915:0x0849, B:904:0x0819, B:906:0x0825, B:908:0x082b, B:911:0x0837, B:913:0x083f, B:916:0x084c, B:917:0x0858, B:920:0x0860, B:922:0x0872, B:923:0x087d, B:925:0x0885, B:926:0x0889, B:928:0x08a3, B:929:0x08b4, B:931:0x08ba, B:933:0x08c6, B:935:0x08e0, B:937:0x0900, B:936:0x08f1, B:943:0x092b, B:945:0x0931, B:947:0x0941, B:948:0x0948, B:950:0x0954, B:951:0x095b, B:952:0x095e, B:954:0x0969, B:956:0x0975, B:958:0x09ae, B:960:0x09b4, B:961:0x09c1, B:963:0x09c7, B:964:0x09d0, B:966:0x09d6, B:978:0x0a1c, B:980:0x0a22, B:982:0x0a28, B:967:0x09dc, B:969:0x09e2, B:971:0x09f4, B:973:0x0a03, B:975:0x0a13, B:984:0x0a37, B:986:0x0a3d, B:987:0x0a52, B:989:0x0a58, B:991:0x0a68, B:993:0x0a80, B:995:0x0a92, B:997:0x0ab9, B:999:0x0ae1, B:1001:0x0af3, B:1002:0x0b14, B:1004:0x0b3f, B:1006:0x0b70, B:1008:0x0b82, B:1009:0x0ba3, B:1011:0x0bce, B:998:0x0ad4, B:1013:0x0bff, B:1014:0x0c03, B:1016:0x0c09, B:1018:0x0c15, B:1019:0x0c47, B:1021:0x0c57, B:1022:0x0c6a, B:1024:0x0c70, B:1027:0x0c8b, B:1029:0x0ca6, B:1031:0x0cbc, B:1033:0x0cc1, B:1035:0x0cc5, B:1037:0x0cc9, B:1039:0x0cd5, B:1040:0x0cdd, B:1042:0x0ce1, B:1044:0x0ce9, B:1045:0x0cf7, B:1046:0x0d02, B:1118:0x0f2d, B:1047:0x0d07, B:1051:0x0d39, B:1052:0x0d41, B:1054:0x0d47, B:1056:0x0d57, B:1058:0x0d5b, B:1073:0x0da1, B:1074:0x0dc6, B:1076:0x0dd2, B:1078:0x0de6, B:1079:0x0e22, B:1085:0x0e3c, B:1087:0x0e43, B:1089:0x0e54, B:1091:0x0e58, B:1093:0x0e5c, B:1095:0x0e60, B:1096:0x0e6c, B:1097:0x0e71, B:1099:0x0e7a, B:1101:0x0e96, B:1102:0x0e9f, B:1116:0x0f27, B:1103:0x0eb1, B:1105:0x0eb5, B:1109:0x0ecb, B:1111:0x0ef5, B:1112:0x0f03, B:1113:0x0f13, B:1115:0x0f1b, B:1106:0x0ebc, B:1060:0x0d69, B:1062:0x0d6d, B:1064:0x0d77, B:1066:0x0d7b, B:1070:0x0d8b, B:1120:0x0f62, B:1122:0x0f6c, B:1123:0x0f73, B:1124:0x0f7b, B:1126:0x0f81, B:1127:0x0f95, B:1129:0x0fa5, B:1130:0x0fbc, B:1132:0x0fc2, B:1134:0x0fd2, B:1142:0x102a, B:1139:0x0fe9, B:1136:0x0fd8, B:1138:0x0fe4, B:1141:0x1012, B:1140:0x0ffa, B:1172:0x10c2, B:1175:0x10ca, B:1176:0x10cf, B:1177:0x10df, B:1179:0x10f9, B:1180:0x1112, B:1181:0x111a, B:1184:0x113b, B:1183:0x112a, B:1143:0x1032, B:1145:0x1038, B:1147:0x1042, B:1148:0x1045, B:1157:0x105e, B:1158:0x1061, B:1160:0x1067, B:1162:0x1073, B:1164:0x1080, B:1165:0x1090, B:1167:0x10ac, B:1168:0x10af, B:1169:0x10b9, B:1170:0x10bd, B:1156:0x105a, B:1151:0x1050, B:1119:0x0f35, B:938:0x0904, B:939:0x0908, B:941:0x090e, B:722:0x0246, B:674:0x0104, B:688:0x01a4, B:702:0x01fa, B:703:0x01fe, B:707:0x0216, B:716:0x0233, B:1192:0x1151, B:1193:0x1154, B:667:0x00b3, B:676:0x010d), top: B:1201:0x000d, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1167:0x10ac A[Catch: all -> 0x1155, TryCatch #2 {all -> 0x1155, blocks: (B:640:0x000d, B:717:0x0237, B:718:0x023a, B:720:0x023e, B:725:0x0256, B:726:0x0271, B:729:0x0281, B:732:0x02a8, B:734:0x02dd, B:737:0x02ef, B:739:0x02f9, B:896:0x07f3, B:740:0x0315, B:742:0x0323, B:745:0x0341, B:747:0x0347, B:749:0x0357, B:751:0x0365, B:753:0x0375, B:754:0x0382, B:755:0x0385, B:757:0x0399, B:806:0x0588, B:807:0x0594, B:810:0x059e, B:817:0x05c2, B:813:0x05af, B:820:0x05c8, B:822:0x05d4, B:824:0x05e0, B:832:0x0612, B:833:0x062a, B:835:0x0634, B:846:0x0660, B:848:0x0673, B:850:0x0681, B:864:0x06dc, B:866:0x06e2, B:867:0x06ee, B:869:0x06f4, B:871:0x0704, B:873:0x070e, B:874:0x071f, B:876:0x0725, B:877:0x073e, B:879:0x0744, B:880:0x075b, B:881:0x0760, B:885:0x0788, B:882:0x0766, B:884:0x0772, B:886:0x078e, B:887:0x07a2, B:889:0x07a8, B:891:0x07bc, B:892:0x07cb, B:894:0x07d5, B:895:0x07e1, B:852:0x068c, B:854:0x0698, B:857:0x06ad, B:859:0x06c0, B:861:0x06ce, B:830:0x0601, B:839:0x0647, B:841:0x064d, B:844:0x0658, B:760:0x03ae, B:763:0x03ba, B:766:0x03c2, B:768:0x03d0, B:773:0x041f, B:769:0x03ef, B:771:0x03fd, B:776:0x0426, B:778:0x0454, B:779:0x0480, B:781:0x04b5, B:782:0x04b8, B:787:0x04c8, B:789:0x04ff, B:790:0x051a, B:792:0x0520, B:794:0x052e, B:798:0x0544, B:795:0x0539, B:801:0x054b, B:803:0x0551, B:804:0x056f, B:899:0x07fe, B:901:0x080c, B:903:0x0815, B:914:0x0845, B:915:0x0849, B:904:0x0819, B:906:0x0825, B:908:0x082b, B:911:0x0837, B:913:0x083f, B:916:0x084c, B:917:0x0858, B:920:0x0860, B:922:0x0872, B:923:0x087d, B:925:0x0885, B:926:0x0889, B:928:0x08a3, B:929:0x08b4, B:931:0x08ba, B:933:0x08c6, B:935:0x08e0, B:937:0x0900, B:936:0x08f1, B:943:0x092b, B:945:0x0931, B:947:0x0941, B:948:0x0948, B:950:0x0954, B:951:0x095b, B:952:0x095e, B:954:0x0969, B:956:0x0975, B:958:0x09ae, B:960:0x09b4, B:961:0x09c1, B:963:0x09c7, B:964:0x09d0, B:966:0x09d6, B:978:0x0a1c, B:980:0x0a22, B:982:0x0a28, B:967:0x09dc, B:969:0x09e2, B:971:0x09f4, B:973:0x0a03, B:975:0x0a13, B:984:0x0a37, B:986:0x0a3d, B:987:0x0a52, B:989:0x0a58, B:991:0x0a68, B:993:0x0a80, B:995:0x0a92, B:997:0x0ab9, B:999:0x0ae1, B:1001:0x0af3, B:1002:0x0b14, B:1004:0x0b3f, B:1006:0x0b70, B:1008:0x0b82, B:1009:0x0ba3, B:1011:0x0bce, B:998:0x0ad4, B:1013:0x0bff, B:1014:0x0c03, B:1016:0x0c09, B:1018:0x0c15, B:1019:0x0c47, B:1021:0x0c57, B:1022:0x0c6a, B:1024:0x0c70, B:1027:0x0c8b, B:1029:0x0ca6, B:1031:0x0cbc, B:1033:0x0cc1, B:1035:0x0cc5, B:1037:0x0cc9, B:1039:0x0cd5, B:1040:0x0cdd, B:1042:0x0ce1, B:1044:0x0ce9, B:1045:0x0cf7, B:1046:0x0d02, B:1118:0x0f2d, B:1047:0x0d07, B:1051:0x0d39, B:1052:0x0d41, B:1054:0x0d47, B:1056:0x0d57, B:1058:0x0d5b, B:1073:0x0da1, B:1074:0x0dc6, B:1076:0x0dd2, B:1078:0x0de6, B:1079:0x0e22, B:1085:0x0e3c, B:1087:0x0e43, B:1089:0x0e54, B:1091:0x0e58, B:1093:0x0e5c, B:1095:0x0e60, B:1096:0x0e6c, B:1097:0x0e71, B:1099:0x0e7a, B:1101:0x0e96, B:1102:0x0e9f, B:1116:0x0f27, B:1103:0x0eb1, B:1105:0x0eb5, B:1109:0x0ecb, B:1111:0x0ef5, B:1112:0x0f03, B:1113:0x0f13, B:1115:0x0f1b, B:1106:0x0ebc, B:1060:0x0d69, B:1062:0x0d6d, B:1064:0x0d77, B:1066:0x0d7b, B:1070:0x0d8b, B:1120:0x0f62, B:1122:0x0f6c, B:1123:0x0f73, B:1124:0x0f7b, B:1126:0x0f81, B:1127:0x0f95, B:1129:0x0fa5, B:1130:0x0fbc, B:1132:0x0fc2, B:1134:0x0fd2, B:1142:0x102a, B:1139:0x0fe9, B:1136:0x0fd8, B:1138:0x0fe4, B:1141:0x1012, B:1140:0x0ffa, B:1172:0x10c2, B:1175:0x10ca, B:1176:0x10cf, B:1177:0x10df, B:1179:0x10f9, B:1180:0x1112, B:1181:0x111a, B:1184:0x113b, B:1183:0x112a, B:1143:0x1032, B:1145:0x1038, B:1147:0x1042, B:1148:0x1045, B:1157:0x105e, B:1158:0x1061, B:1160:0x1067, B:1162:0x1073, B:1164:0x1080, B:1165:0x1090, B:1167:0x10ac, B:1168:0x10af, B:1169:0x10b9, B:1170:0x10bd, B:1156:0x105a, B:1151:0x1050, B:1119:0x0f35, B:938:0x0904, B:939:0x0908, B:941:0x090e, B:722:0x0246, B:674:0x0104, B:688:0x01a4, B:702:0x01fa, B:703:0x01fe, B:707:0x0216, B:716:0x0233, B:1192:0x1151, B:1193:0x1154, B:667:0x00b3, B:676:0x010d), top: B:1201:0x000d, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1169:0x10b9 A[Catch: all -> 0x1155, TryCatch #2 {all -> 0x1155, blocks: (B:640:0x000d, B:717:0x0237, B:718:0x023a, B:720:0x023e, B:725:0x0256, B:726:0x0271, B:729:0x0281, B:732:0x02a8, B:734:0x02dd, B:737:0x02ef, B:739:0x02f9, B:896:0x07f3, B:740:0x0315, B:742:0x0323, B:745:0x0341, B:747:0x0347, B:749:0x0357, B:751:0x0365, B:753:0x0375, B:754:0x0382, B:755:0x0385, B:757:0x0399, B:806:0x0588, B:807:0x0594, B:810:0x059e, B:817:0x05c2, B:813:0x05af, B:820:0x05c8, B:822:0x05d4, B:824:0x05e0, B:832:0x0612, B:833:0x062a, B:835:0x0634, B:846:0x0660, B:848:0x0673, B:850:0x0681, B:864:0x06dc, B:866:0x06e2, B:867:0x06ee, B:869:0x06f4, B:871:0x0704, B:873:0x070e, B:874:0x071f, B:876:0x0725, B:877:0x073e, B:879:0x0744, B:880:0x075b, B:881:0x0760, B:885:0x0788, B:882:0x0766, B:884:0x0772, B:886:0x078e, B:887:0x07a2, B:889:0x07a8, B:891:0x07bc, B:892:0x07cb, B:894:0x07d5, B:895:0x07e1, B:852:0x068c, B:854:0x0698, B:857:0x06ad, B:859:0x06c0, B:861:0x06ce, B:830:0x0601, B:839:0x0647, B:841:0x064d, B:844:0x0658, B:760:0x03ae, B:763:0x03ba, B:766:0x03c2, B:768:0x03d0, B:773:0x041f, B:769:0x03ef, B:771:0x03fd, B:776:0x0426, B:778:0x0454, B:779:0x0480, B:781:0x04b5, B:782:0x04b8, B:787:0x04c8, B:789:0x04ff, B:790:0x051a, B:792:0x0520, B:794:0x052e, B:798:0x0544, B:795:0x0539, B:801:0x054b, B:803:0x0551, B:804:0x056f, B:899:0x07fe, B:901:0x080c, B:903:0x0815, B:914:0x0845, B:915:0x0849, B:904:0x0819, B:906:0x0825, B:908:0x082b, B:911:0x0837, B:913:0x083f, B:916:0x084c, B:917:0x0858, B:920:0x0860, B:922:0x0872, B:923:0x087d, B:925:0x0885, B:926:0x0889, B:928:0x08a3, B:929:0x08b4, B:931:0x08ba, B:933:0x08c6, B:935:0x08e0, B:937:0x0900, B:936:0x08f1, B:943:0x092b, B:945:0x0931, B:947:0x0941, B:948:0x0948, B:950:0x0954, B:951:0x095b, B:952:0x095e, B:954:0x0969, B:956:0x0975, B:958:0x09ae, B:960:0x09b4, B:961:0x09c1, B:963:0x09c7, B:964:0x09d0, B:966:0x09d6, B:978:0x0a1c, B:980:0x0a22, B:982:0x0a28, B:967:0x09dc, B:969:0x09e2, B:971:0x09f4, B:973:0x0a03, B:975:0x0a13, B:984:0x0a37, B:986:0x0a3d, B:987:0x0a52, B:989:0x0a58, B:991:0x0a68, B:993:0x0a80, B:995:0x0a92, B:997:0x0ab9, B:999:0x0ae1, B:1001:0x0af3, B:1002:0x0b14, B:1004:0x0b3f, B:1006:0x0b70, B:1008:0x0b82, B:1009:0x0ba3, B:1011:0x0bce, B:998:0x0ad4, B:1013:0x0bff, B:1014:0x0c03, B:1016:0x0c09, B:1018:0x0c15, B:1019:0x0c47, B:1021:0x0c57, B:1022:0x0c6a, B:1024:0x0c70, B:1027:0x0c8b, B:1029:0x0ca6, B:1031:0x0cbc, B:1033:0x0cc1, B:1035:0x0cc5, B:1037:0x0cc9, B:1039:0x0cd5, B:1040:0x0cdd, B:1042:0x0ce1, B:1044:0x0ce9, B:1045:0x0cf7, B:1046:0x0d02, B:1118:0x0f2d, B:1047:0x0d07, B:1051:0x0d39, B:1052:0x0d41, B:1054:0x0d47, B:1056:0x0d57, B:1058:0x0d5b, B:1073:0x0da1, B:1074:0x0dc6, B:1076:0x0dd2, B:1078:0x0de6, B:1079:0x0e22, B:1085:0x0e3c, B:1087:0x0e43, B:1089:0x0e54, B:1091:0x0e58, B:1093:0x0e5c, B:1095:0x0e60, B:1096:0x0e6c, B:1097:0x0e71, B:1099:0x0e7a, B:1101:0x0e96, B:1102:0x0e9f, B:1116:0x0f27, B:1103:0x0eb1, B:1105:0x0eb5, B:1109:0x0ecb, B:1111:0x0ef5, B:1112:0x0f03, B:1113:0x0f13, B:1115:0x0f1b, B:1106:0x0ebc, B:1060:0x0d69, B:1062:0x0d6d, B:1064:0x0d77, B:1066:0x0d7b, B:1070:0x0d8b, B:1120:0x0f62, B:1122:0x0f6c, B:1123:0x0f73, B:1124:0x0f7b, B:1126:0x0f81, B:1127:0x0f95, B:1129:0x0fa5, B:1130:0x0fbc, B:1132:0x0fc2, B:1134:0x0fd2, B:1142:0x102a, B:1139:0x0fe9, B:1136:0x0fd8, B:1138:0x0fe4, B:1141:0x1012, B:1140:0x0ffa, B:1172:0x10c2, B:1175:0x10ca, B:1176:0x10cf, B:1177:0x10df, B:1179:0x10f9, B:1180:0x1112, B:1181:0x111a, B:1184:0x113b, B:1183:0x112a, B:1143:0x1032, B:1145:0x1038, B:1147:0x1042, B:1148:0x1045, B:1157:0x105e, B:1158:0x1061, B:1160:0x1067, B:1162:0x1073, B:1164:0x1080, B:1165:0x1090, B:1167:0x10ac, B:1168:0x10af, B:1169:0x10b9, B:1170:0x10bd, B:1156:0x105a, B:1151:0x1050, B:1119:0x0f35, B:938:0x0904, B:939:0x0908, B:941:0x090e, B:722:0x0246, B:674:0x0104, B:688:0x01a4, B:702:0x01fa, B:703:0x01fe, B:707:0x0216, B:716:0x0233, B:1192:0x1151, B:1193:0x1154, B:667:0x00b3, B:676:0x010d), top: B:1201:0x000d, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1170:0x10bd A[Catch: all -> 0x1155, TryCatch #2 {all -> 0x1155, blocks: (B:640:0x000d, B:717:0x0237, B:718:0x023a, B:720:0x023e, B:725:0x0256, B:726:0x0271, B:729:0x0281, B:732:0x02a8, B:734:0x02dd, B:737:0x02ef, B:739:0x02f9, B:896:0x07f3, B:740:0x0315, B:742:0x0323, B:745:0x0341, B:747:0x0347, B:749:0x0357, B:751:0x0365, B:753:0x0375, B:754:0x0382, B:755:0x0385, B:757:0x0399, B:806:0x0588, B:807:0x0594, B:810:0x059e, B:817:0x05c2, B:813:0x05af, B:820:0x05c8, B:822:0x05d4, B:824:0x05e0, B:832:0x0612, B:833:0x062a, B:835:0x0634, B:846:0x0660, B:848:0x0673, B:850:0x0681, B:864:0x06dc, B:866:0x06e2, B:867:0x06ee, B:869:0x06f4, B:871:0x0704, B:873:0x070e, B:874:0x071f, B:876:0x0725, B:877:0x073e, B:879:0x0744, B:880:0x075b, B:881:0x0760, B:885:0x0788, B:882:0x0766, B:884:0x0772, B:886:0x078e, B:887:0x07a2, B:889:0x07a8, B:891:0x07bc, B:892:0x07cb, B:894:0x07d5, B:895:0x07e1, B:852:0x068c, B:854:0x0698, B:857:0x06ad, B:859:0x06c0, B:861:0x06ce, B:830:0x0601, B:839:0x0647, B:841:0x064d, B:844:0x0658, B:760:0x03ae, B:763:0x03ba, B:766:0x03c2, B:768:0x03d0, B:773:0x041f, B:769:0x03ef, B:771:0x03fd, B:776:0x0426, B:778:0x0454, B:779:0x0480, B:781:0x04b5, B:782:0x04b8, B:787:0x04c8, B:789:0x04ff, B:790:0x051a, B:792:0x0520, B:794:0x052e, B:798:0x0544, B:795:0x0539, B:801:0x054b, B:803:0x0551, B:804:0x056f, B:899:0x07fe, B:901:0x080c, B:903:0x0815, B:914:0x0845, B:915:0x0849, B:904:0x0819, B:906:0x0825, B:908:0x082b, B:911:0x0837, B:913:0x083f, B:916:0x084c, B:917:0x0858, B:920:0x0860, B:922:0x0872, B:923:0x087d, B:925:0x0885, B:926:0x0889, B:928:0x08a3, B:929:0x08b4, B:931:0x08ba, B:933:0x08c6, B:935:0x08e0, B:937:0x0900, B:936:0x08f1, B:943:0x092b, B:945:0x0931, B:947:0x0941, B:948:0x0948, B:950:0x0954, B:951:0x095b, B:952:0x095e, B:954:0x0969, B:956:0x0975, B:958:0x09ae, B:960:0x09b4, B:961:0x09c1, B:963:0x09c7, B:964:0x09d0, B:966:0x09d6, B:978:0x0a1c, B:980:0x0a22, B:982:0x0a28, B:967:0x09dc, B:969:0x09e2, B:971:0x09f4, B:973:0x0a03, B:975:0x0a13, B:984:0x0a37, B:986:0x0a3d, B:987:0x0a52, B:989:0x0a58, B:991:0x0a68, B:993:0x0a80, B:995:0x0a92, B:997:0x0ab9, B:999:0x0ae1, B:1001:0x0af3, B:1002:0x0b14, B:1004:0x0b3f, B:1006:0x0b70, B:1008:0x0b82, B:1009:0x0ba3, B:1011:0x0bce, B:998:0x0ad4, B:1013:0x0bff, B:1014:0x0c03, B:1016:0x0c09, B:1018:0x0c15, B:1019:0x0c47, B:1021:0x0c57, B:1022:0x0c6a, B:1024:0x0c70, B:1027:0x0c8b, B:1029:0x0ca6, B:1031:0x0cbc, B:1033:0x0cc1, B:1035:0x0cc5, B:1037:0x0cc9, B:1039:0x0cd5, B:1040:0x0cdd, B:1042:0x0ce1, B:1044:0x0ce9, B:1045:0x0cf7, B:1046:0x0d02, B:1118:0x0f2d, B:1047:0x0d07, B:1051:0x0d39, B:1052:0x0d41, B:1054:0x0d47, B:1056:0x0d57, B:1058:0x0d5b, B:1073:0x0da1, B:1074:0x0dc6, B:1076:0x0dd2, B:1078:0x0de6, B:1079:0x0e22, B:1085:0x0e3c, B:1087:0x0e43, B:1089:0x0e54, B:1091:0x0e58, B:1093:0x0e5c, B:1095:0x0e60, B:1096:0x0e6c, B:1097:0x0e71, B:1099:0x0e7a, B:1101:0x0e96, B:1102:0x0e9f, B:1116:0x0f27, B:1103:0x0eb1, B:1105:0x0eb5, B:1109:0x0ecb, B:1111:0x0ef5, B:1112:0x0f03, B:1113:0x0f13, B:1115:0x0f1b, B:1106:0x0ebc, B:1060:0x0d69, B:1062:0x0d6d, B:1064:0x0d77, B:1066:0x0d7b, B:1070:0x0d8b, B:1120:0x0f62, B:1122:0x0f6c, B:1123:0x0f73, B:1124:0x0f7b, B:1126:0x0f81, B:1127:0x0f95, B:1129:0x0fa5, B:1130:0x0fbc, B:1132:0x0fc2, B:1134:0x0fd2, B:1142:0x102a, B:1139:0x0fe9, B:1136:0x0fd8, B:1138:0x0fe4, B:1141:0x1012, B:1140:0x0ffa, B:1172:0x10c2, B:1175:0x10ca, B:1176:0x10cf, B:1177:0x10df, B:1179:0x10f9, B:1180:0x1112, B:1181:0x111a, B:1184:0x113b, B:1183:0x112a, B:1143:0x1032, B:1145:0x1038, B:1147:0x1042, B:1148:0x1045, B:1157:0x105e, B:1158:0x1061, B:1160:0x1067, B:1162:0x1073, B:1164:0x1080, B:1165:0x1090, B:1167:0x10ac, B:1168:0x10af, B:1169:0x10b9, B:1170:0x10bd, B:1156:0x105a, B:1151:0x1050, B:1119:0x0f35, B:938:0x0904, B:939:0x0908, B:941:0x090e, B:722:0x0246, B:674:0x0104, B:688:0x01a4, B:702:0x01fa, B:703:0x01fe, B:707:0x0216, B:716:0x0233, B:1192:0x1151, B:1193:0x1154, B:667:0x00b3, B:676:0x010d), top: B:1201:0x000d, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:672:0x00f1 A[Catch: SQLiteException -> 0x021c, all -> 0x114b, TryCatch #5 {all -> 0x114b, blocks: (B:651:0x006b, B:655:0x0075, B:669:0x00c0, B:670:0x00c7, B:672:0x00f1, B:675:0x0109, B:676:0x010d, B:677:0x011f, B:679:0x0125, B:680:0x0136, B:682:0x0142, B:684:0x0160, B:686:0x0191, B:690:0x01aa, B:691:0x01b3, B:692:0x01be, B:698:0x01f1, B:697:0x01e0, B:683:0x0155, B:705:0x0203, B:714:0x0220, B:664:0x00ab, B:668:0x00b8), top: B:1201:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:675:0x0109 A[Catch: SQLiteException -> 0x021c, all -> 0x114b, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x114b, blocks: (B:651:0x006b, B:655:0x0075, B:669:0x00c0, B:670:0x00c7, B:672:0x00f1, B:675:0x0109, B:676:0x010d, B:677:0x011f, B:679:0x0125, B:680:0x0136, B:682:0x0142, B:684:0x0160, B:686:0x0191, B:690:0x01aa, B:691:0x01b3, B:692:0x01be, B:698:0x01f1, B:697:0x01e0, B:683:0x0155, B:705:0x0203, B:714:0x0220, B:664:0x00ab, B:668:0x00b8), top: B:1201:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:762:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:835:0x0634 A[Catch: all -> 0x1155, TryCatch #2 {all -> 0x1155, blocks: (B:640:0x000d, B:717:0x0237, B:718:0x023a, B:720:0x023e, B:725:0x0256, B:726:0x0271, B:729:0x0281, B:732:0x02a8, B:734:0x02dd, B:737:0x02ef, B:739:0x02f9, B:896:0x07f3, B:740:0x0315, B:742:0x0323, B:745:0x0341, B:747:0x0347, B:749:0x0357, B:751:0x0365, B:753:0x0375, B:754:0x0382, B:755:0x0385, B:757:0x0399, B:806:0x0588, B:807:0x0594, B:810:0x059e, B:817:0x05c2, B:813:0x05af, B:820:0x05c8, B:822:0x05d4, B:824:0x05e0, B:832:0x0612, B:833:0x062a, B:835:0x0634, B:846:0x0660, B:848:0x0673, B:850:0x0681, B:864:0x06dc, B:866:0x06e2, B:867:0x06ee, B:869:0x06f4, B:871:0x0704, B:873:0x070e, B:874:0x071f, B:876:0x0725, B:877:0x073e, B:879:0x0744, B:880:0x075b, B:881:0x0760, B:885:0x0788, B:882:0x0766, B:884:0x0772, B:886:0x078e, B:887:0x07a2, B:889:0x07a8, B:891:0x07bc, B:892:0x07cb, B:894:0x07d5, B:895:0x07e1, B:852:0x068c, B:854:0x0698, B:857:0x06ad, B:859:0x06c0, B:861:0x06ce, B:830:0x0601, B:839:0x0647, B:841:0x064d, B:844:0x0658, B:760:0x03ae, B:763:0x03ba, B:766:0x03c2, B:768:0x03d0, B:773:0x041f, B:769:0x03ef, B:771:0x03fd, B:776:0x0426, B:778:0x0454, B:779:0x0480, B:781:0x04b5, B:782:0x04b8, B:787:0x04c8, B:789:0x04ff, B:790:0x051a, B:792:0x0520, B:794:0x052e, B:798:0x0544, B:795:0x0539, B:801:0x054b, B:803:0x0551, B:804:0x056f, B:899:0x07fe, B:901:0x080c, B:903:0x0815, B:914:0x0845, B:915:0x0849, B:904:0x0819, B:906:0x0825, B:908:0x082b, B:911:0x0837, B:913:0x083f, B:916:0x084c, B:917:0x0858, B:920:0x0860, B:922:0x0872, B:923:0x087d, B:925:0x0885, B:926:0x0889, B:928:0x08a3, B:929:0x08b4, B:931:0x08ba, B:933:0x08c6, B:935:0x08e0, B:937:0x0900, B:936:0x08f1, B:943:0x092b, B:945:0x0931, B:947:0x0941, B:948:0x0948, B:950:0x0954, B:951:0x095b, B:952:0x095e, B:954:0x0969, B:956:0x0975, B:958:0x09ae, B:960:0x09b4, B:961:0x09c1, B:963:0x09c7, B:964:0x09d0, B:966:0x09d6, B:978:0x0a1c, B:980:0x0a22, B:982:0x0a28, B:967:0x09dc, B:969:0x09e2, B:971:0x09f4, B:973:0x0a03, B:975:0x0a13, B:984:0x0a37, B:986:0x0a3d, B:987:0x0a52, B:989:0x0a58, B:991:0x0a68, B:993:0x0a80, B:995:0x0a92, B:997:0x0ab9, B:999:0x0ae1, B:1001:0x0af3, B:1002:0x0b14, B:1004:0x0b3f, B:1006:0x0b70, B:1008:0x0b82, B:1009:0x0ba3, B:1011:0x0bce, B:998:0x0ad4, B:1013:0x0bff, B:1014:0x0c03, B:1016:0x0c09, B:1018:0x0c15, B:1019:0x0c47, B:1021:0x0c57, B:1022:0x0c6a, B:1024:0x0c70, B:1027:0x0c8b, B:1029:0x0ca6, B:1031:0x0cbc, B:1033:0x0cc1, B:1035:0x0cc5, B:1037:0x0cc9, B:1039:0x0cd5, B:1040:0x0cdd, B:1042:0x0ce1, B:1044:0x0ce9, B:1045:0x0cf7, B:1046:0x0d02, B:1118:0x0f2d, B:1047:0x0d07, B:1051:0x0d39, B:1052:0x0d41, B:1054:0x0d47, B:1056:0x0d57, B:1058:0x0d5b, B:1073:0x0da1, B:1074:0x0dc6, B:1076:0x0dd2, B:1078:0x0de6, B:1079:0x0e22, B:1085:0x0e3c, B:1087:0x0e43, B:1089:0x0e54, B:1091:0x0e58, B:1093:0x0e5c, B:1095:0x0e60, B:1096:0x0e6c, B:1097:0x0e71, B:1099:0x0e7a, B:1101:0x0e96, B:1102:0x0e9f, B:1116:0x0f27, B:1103:0x0eb1, B:1105:0x0eb5, B:1109:0x0ecb, B:1111:0x0ef5, B:1112:0x0f03, B:1113:0x0f13, B:1115:0x0f1b, B:1106:0x0ebc, B:1060:0x0d69, B:1062:0x0d6d, B:1064:0x0d77, B:1066:0x0d7b, B:1070:0x0d8b, B:1120:0x0f62, B:1122:0x0f6c, B:1123:0x0f73, B:1124:0x0f7b, B:1126:0x0f81, B:1127:0x0f95, B:1129:0x0fa5, B:1130:0x0fbc, B:1132:0x0fc2, B:1134:0x0fd2, B:1142:0x102a, B:1139:0x0fe9, B:1136:0x0fd8, B:1138:0x0fe4, B:1141:0x1012, B:1140:0x0ffa, B:1172:0x10c2, B:1175:0x10ca, B:1176:0x10cf, B:1177:0x10df, B:1179:0x10f9, B:1180:0x1112, B:1181:0x111a, B:1184:0x113b, B:1183:0x112a, B:1143:0x1032, B:1145:0x1038, B:1147:0x1042, B:1148:0x1045, B:1157:0x105e, B:1158:0x1061, B:1160:0x1067, B:1162:0x1073, B:1164:0x1080, B:1165:0x1090, B:1167:0x10ac, B:1168:0x10af, B:1169:0x10b9, B:1170:0x10bd, B:1156:0x105a, B:1151:0x1050, B:1119:0x0f35, B:938:0x0904, B:939:0x0908, B:941:0x090e, B:722:0x0246, B:674:0x0104, B:688:0x01a4, B:702:0x01fa, B:703:0x01fe, B:707:0x0216, B:716:0x0233, B:1192:0x1151, B:1193:0x1154, B:667:0x00b3, B:676:0x010d), top: B:1201:0x000d, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:852:0x068c A[Catch: all -> 0x1155, TryCatch #2 {all -> 0x1155, blocks: (B:640:0x000d, B:717:0x0237, B:718:0x023a, B:720:0x023e, B:725:0x0256, B:726:0x0271, B:729:0x0281, B:732:0x02a8, B:734:0x02dd, B:737:0x02ef, B:739:0x02f9, B:896:0x07f3, B:740:0x0315, B:742:0x0323, B:745:0x0341, B:747:0x0347, B:749:0x0357, B:751:0x0365, B:753:0x0375, B:754:0x0382, B:755:0x0385, B:757:0x0399, B:806:0x0588, B:807:0x0594, B:810:0x059e, B:817:0x05c2, B:813:0x05af, B:820:0x05c8, B:822:0x05d4, B:824:0x05e0, B:832:0x0612, B:833:0x062a, B:835:0x0634, B:846:0x0660, B:848:0x0673, B:850:0x0681, B:864:0x06dc, B:866:0x06e2, B:867:0x06ee, B:869:0x06f4, B:871:0x0704, B:873:0x070e, B:874:0x071f, B:876:0x0725, B:877:0x073e, B:879:0x0744, B:880:0x075b, B:881:0x0760, B:885:0x0788, B:882:0x0766, B:884:0x0772, B:886:0x078e, B:887:0x07a2, B:889:0x07a8, B:891:0x07bc, B:892:0x07cb, B:894:0x07d5, B:895:0x07e1, B:852:0x068c, B:854:0x0698, B:857:0x06ad, B:859:0x06c0, B:861:0x06ce, B:830:0x0601, B:839:0x0647, B:841:0x064d, B:844:0x0658, B:760:0x03ae, B:763:0x03ba, B:766:0x03c2, B:768:0x03d0, B:773:0x041f, B:769:0x03ef, B:771:0x03fd, B:776:0x0426, B:778:0x0454, B:779:0x0480, B:781:0x04b5, B:782:0x04b8, B:787:0x04c8, B:789:0x04ff, B:790:0x051a, B:792:0x0520, B:794:0x052e, B:798:0x0544, B:795:0x0539, B:801:0x054b, B:803:0x0551, B:804:0x056f, B:899:0x07fe, B:901:0x080c, B:903:0x0815, B:914:0x0845, B:915:0x0849, B:904:0x0819, B:906:0x0825, B:908:0x082b, B:911:0x0837, B:913:0x083f, B:916:0x084c, B:917:0x0858, B:920:0x0860, B:922:0x0872, B:923:0x087d, B:925:0x0885, B:926:0x0889, B:928:0x08a3, B:929:0x08b4, B:931:0x08ba, B:933:0x08c6, B:935:0x08e0, B:937:0x0900, B:936:0x08f1, B:943:0x092b, B:945:0x0931, B:947:0x0941, B:948:0x0948, B:950:0x0954, B:951:0x095b, B:952:0x095e, B:954:0x0969, B:956:0x0975, B:958:0x09ae, B:960:0x09b4, B:961:0x09c1, B:963:0x09c7, B:964:0x09d0, B:966:0x09d6, B:978:0x0a1c, B:980:0x0a22, B:982:0x0a28, B:967:0x09dc, B:969:0x09e2, B:971:0x09f4, B:973:0x0a03, B:975:0x0a13, B:984:0x0a37, B:986:0x0a3d, B:987:0x0a52, B:989:0x0a58, B:991:0x0a68, B:993:0x0a80, B:995:0x0a92, B:997:0x0ab9, B:999:0x0ae1, B:1001:0x0af3, B:1002:0x0b14, B:1004:0x0b3f, B:1006:0x0b70, B:1008:0x0b82, B:1009:0x0ba3, B:1011:0x0bce, B:998:0x0ad4, B:1013:0x0bff, B:1014:0x0c03, B:1016:0x0c09, B:1018:0x0c15, B:1019:0x0c47, B:1021:0x0c57, B:1022:0x0c6a, B:1024:0x0c70, B:1027:0x0c8b, B:1029:0x0ca6, B:1031:0x0cbc, B:1033:0x0cc1, B:1035:0x0cc5, B:1037:0x0cc9, B:1039:0x0cd5, B:1040:0x0cdd, B:1042:0x0ce1, B:1044:0x0ce9, B:1045:0x0cf7, B:1046:0x0d02, B:1118:0x0f2d, B:1047:0x0d07, B:1051:0x0d39, B:1052:0x0d41, B:1054:0x0d47, B:1056:0x0d57, B:1058:0x0d5b, B:1073:0x0da1, B:1074:0x0dc6, B:1076:0x0dd2, B:1078:0x0de6, B:1079:0x0e22, B:1085:0x0e3c, B:1087:0x0e43, B:1089:0x0e54, B:1091:0x0e58, B:1093:0x0e5c, B:1095:0x0e60, B:1096:0x0e6c, B:1097:0x0e71, B:1099:0x0e7a, B:1101:0x0e96, B:1102:0x0e9f, B:1116:0x0f27, B:1103:0x0eb1, B:1105:0x0eb5, B:1109:0x0ecb, B:1111:0x0ef5, B:1112:0x0f03, B:1113:0x0f13, B:1115:0x0f1b, B:1106:0x0ebc, B:1060:0x0d69, B:1062:0x0d6d, B:1064:0x0d77, B:1066:0x0d7b, B:1070:0x0d8b, B:1120:0x0f62, B:1122:0x0f6c, B:1123:0x0f73, B:1124:0x0f7b, B:1126:0x0f81, B:1127:0x0f95, B:1129:0x0fa5, B:1130:0x0fbc, B:1132:0x0fc2, B:1134:0x0fd2, B:1142:0x102a, B:1139:0x0fe9, B:1136:0x0fd8, B:1138:0x0fe4, B:1141:0x1012, B:1140:0x0ffa, B:1172:0x10c2, B:1175:0x10ca, B:1176:0x10cf, B:1177:0x10df, B:1179:0x10f9, B:1180:0x1112, B:1181:0x111a, B:1184:0x113b, B:1183:0x112a, B:1143:0x1032, B:1145:0x1038, B:1147:0x1042, B:1148:0x1045, B:1157:0x105e, B:1158:0x1061, B:1160:0x1067, B:1162:0x1073, B:1164:0x1080, B:1165:0x1090, B:1167:0x10ac, B:1168:0x10af, B:1169:0x10b9, B:1170:0x10bd, B:1156:0x105a, B:1151:0x1050, B:1119:0x0f35, B:938:0x0904, B:939:0x0908, B:941:0x090e, B:722:0x0246, B:674:0x0104, B:688:0x01a4, B:702:0x01fa, B:703:0x01fe, B:707:0x0216, B:716:0x0233, B:1192:0x1151, B:1193:0x1154, B:667:0x00b3, B:676:0x010d), top: B:1201:0x000d, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:866:0x06e2 A[Catch: all -> 0x1155, TryCatch #2 {all -> 0x1155, blocks: (B:640:0x000d, B:717:0x0237, B:718:0x023a, B:720:0x023e, B:725:0x0256, B:726:0x0271, B:729:0x0281, B:732:0x02a8, B:734:0x02dd, B:737:0x02ef, B:739:0x02f9, B:896:0x07f3, B:740:0x0315, B:742:0x0323, B:745:0x0341, B:747:0x0347, B:749:0x0357, B:751:0x0365, B:753:0x0375, B:754:0x0382, B:755:0x0385, B:757:0x0399, B:806:0x0588, B:807:0x0594, B:810:0x059e, B:817:0x05c2, B:813:0x05af, B:820:0x05c8, B:822:0x05d4, B:824:0x05e0, B:832:0x0612, B:833:0x062a, B:835:0x0634, B:846:0x0660, B:848:0x0673, B:850:0x0681, B:864:0x06dc, B:866:0x06e2, B:867:0x06ee, B:869:0x06f4, B:871:0x0704, B:873:0x070e, B:874:0x071f, B:876:0x0725, B:877:0x073e, B:879:0x0744, B:880:0x075b, B:881:0x0760, B:885:0x0788, B:882:0x0766, B:884:0x0772, B:886:0x078e, B:887:0x07a2, B:889:0x07a8, B:891:0x07bc, B:892:0x07cb, B:894:0x07d5, B:895:0x07e1, B:852:0x068c, B:854:0x0698, B:857:0x06ad, B:859:0x06c0, B:861:0x06ce, B:830:0x0601, B:839:0x0647, B:841:0x064d, B:844:0x0658, B:760:0x03ae, B:763:0x03ba, B:766:0x03c2, B:768:0x03d0, B:773:0x041f, B:769:0x03ef, B:771:0x03fd, B:776:0x0426, B:778:0x0454, B:779:0x0480, B:781:0x04b5, B:782:0x04b8, B:787:0x04c8, B:789:0x04ff, B:790:0x051a, B:792:0x0520, B:794:0x052e, B:798:0x0544, B:795:0x0539, B:801:0x054b, B:803:0x0551, B:804:0x056f, B:899:0x07fe, B:901:0x080c, B:903:0x0815, B:914:0x0845, B:915:0x0849, B:904:0x0819, B:906:0x0825, B:908:0x082b, B:911:0x0837, B:913:0x083f, B:916:0x084c, B:917:0x0858, B:920:0x0860, B:922:0x0872, B:923:0x087d, B:925:0x0885, B:926:0x0889, B:928:0x08a3, B:929:0x08b4, B:931:0x08ba, B:933:0x08c6, B:935:0x08e0, B:937:0x0900, B:936:0x08f1, B:943:0x092b, B:945:0x0931, B:947:0x0941, B:948:0x0948, B:950:0x0954, B:951:0x095b, B:952:0x095e, B:954:0x0969, B:956:0x0975, B:958:0x09ae, B:960:0x09b4, B:961:0x09c1, B:963:0x09c7, B:964:0x09d0, B:966:0x09d6, B:978:0x0a1c, B:980:0x0a22, B:982:0x0a28, B:967:0x09dc, B:969:0x09e2, B:971:0x09f4, B:973:0x0a03, B:975:0x0a13, B:984:0x0a37, B:986:0x0a3d, B:987:0x0a52, B:989:0x0a58, B:991:0x0a68, B:993:0x0a80, B:995:0x0a92, B:997:0x0ab9, B:999:0x0ae1, B:1001:0x0af3, B:1002:0x0b14, B:1004:0x0b3f, B:1006:0x0b70, B:1008:0x0b82, B:1009:0x0ba3, B:1011:0x0bce, B:998:0x0ad4, B:1013:0x0bff, B:1014:0x0c03, B:1016:0x0c09, B:1018:0x0c15, B:1019:0x0c47, B:1021:0x0c57, B:1022:0x0c6a, B:1024:0x0c70, B:1027:0x0c8b, B:1029:0x0ca6, B:1031:0x0cbc, B:1033:0x0cc1, B:1035:0x0cc5, B:1037:0x0cc9, B:1039:0x0cd5, B:1040:0x0cdd, B:1042:0x0ce1, B:1044:0x0ce9, B:1045:0x0cf7, B:1046:0x0d02, B:1118:0x0f2d, B:1047:0x0d07, B:1051:0x0d39, B:1052:0x0d41, B:1054:0x0d47, B:1056:0x0d57, B:1058:0x0d5b, B:1073:0x0da1, B:1074:0x0dc6, B:1076:0x0dd2, B:1078:0x0de6, B:1079:0x0e22, B:1085:0x0e3c, B:1087:0x0e43, B:1089:0x0e54, B:1091:0x0e58, B:1093:0x0e5c, B:1095:0x0e60, B:1096:0x0e6c, B:1097:0x0e71, B:1099:0x0e7a, B:1101:0x0e96, B:1102:0x0e9f, B:1116:0x0f27, B:1103:0x0eb1, B:1105:0x0eb5, B:1109:0x0ecb, B:1111:0x0ef5, B:1112:0x0f03, B:1113:0x0f13, B:1115:0x0f1b, B:1106:0x0ebc, B:1060:0x0d69, B:1062:0x0d6d, B:1064:0x0d77, B:1066:0x0d7b, B:1070:0x0d8b, B:1120:0x0f62, B:1122:0x0f6c, B:1123:0x0f73, B:1124:0x0f7b, B:1126:0x0f81, B:1127:0x0f95, B:1129:0x0fa5, B:1130:0x0fbc, B:1132:0x0fc2, B:1134:0x0fd2, B:1142:0x102a, B:1139:0x0fe9, B:1136:0x0fd8, B:1138:0x0fe4, B:1141:0x1012, B:1140:0x0ffa, B:1172:0x10c2, B:1175:0x10ca, B:1176:0x10cf, B:1177:0x10df, B:1179:0x10f9, B:1180:0x1112, B:1181:0x111a, B:1184:0x113b, B:1183:0x112a, B:1143:0x1032, B:1145:0x1038, B:1147:0x1042, B:1148:0x1045, B:1157:0x105e, B:1158:0x1061, B:1160:0x1067, B:1162:0x1073, B:1164:0x1080, B:1165:0x1090, B:1167:0x10ac, B:1168:0x10af, B:1169:0x10b9, B:1170:0x10bd, B:1156:0x105a, B:1151:0x1050, B:1119:0x0f35, B:938:0x0904, B:939:0x0908, B:941:0x090e, B:722:0x0246, B:674:0x0104, B:688:0x01a4, B:702:0x01fa, B:703:0x01fe, B:707:0x0216, B:716:0x0233, B:1192:0x1151, B:1193:0x1154, B:667:0x00b3, B:676:0x010d), top: B:1201:0x000d, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:904:0x0819 A[Catch: all -> 0x1155, TryCatch #2 {all -> 0x1155, blocks: (B:640:0x000d, B:717:0x0237, B:718:0x023a, B:720:0x023e, B:725:0x0256, B:726:0x0271, B:729:0x0281, B:732:0x02a8, B:734:0x02dd, B:737:0x02ef, B:739:0x02f9, B:896:0x07f3, B:740:0x0315, B:742:0x0323, B:745:0x0341, B:747:0x0347, B:749:0x0357, B:751:0x0365, B:753:0x0375, B:754:0x0382, B:755:0x0385, B:757:0x0399, B:806:0x0588, B:807:0x0594, B:810:0x059e, B:817:0x05c2, B:813:0x05af, B:820:0x05c8, B:822:0x05d4, B:824:0x05e0, B:832:0x0612, B:833:0x062a, B:835:0x0634, B:846:0x0660, B:848:0x0673, B:850:0x0681, B:864:0x06dc, B:866:0x06e2, B:867:0x06ee, B:869:0x06f4, B:871:0x0704, B:873:0x070e, B:874:0x071f, B:876:0x0725, B:877:0x073e, B:879:0x0744, B:880:0x075b, B:881:0x0760, B:885:0x0788, B:882:0x0766, B:884:0x0772, B:886:0x078e, B:887:0x07a2, B:889:0x07a8, B:891:0x07bc, B:892:0x07cb, B:894:0x07d5, B:895:0x07e1, B:852:0x068c, B:854:0x0698, B:857:0x06ad, B:859:0x06c0, B:861:0x06ce, B:830:0x0601, B:839:0x0647, B:841:0x064d, B:844:0x0658, B:760:0x03ae, B:763:0x03ba, B:766:0x03c2, B:768:0x03d0, B:773:0x041f, B:769:0x03ef, B:771:0x03fd, B:776:0x0426, B:778:0x0454, B:779:0x0480, B:781:0x04b5, B:782:0x04b8, B:787:0x04c8, B:789:0x04ff, B:790:0x051a, B:792:0x0520, B:794:0x052e, B:798:0x0544, B:795:0x0539, B:801:0x054b, B:803:0x0551, B:804:0x056f, B:899:0x07fe, B:901:0x080c, B:903:0x0815, B:914:0x0845, B:915:0x0849, B:904:0x0819, B:906:0x0825, B:908:0x082b, B:911:0x0837, B:913:0x083f, B:916:0x084c, B:917:0x0858, B:920:0x0860, B:922:0x0872, B:923:0x087d, B:925:0x0885, B:926:0x0889, B:928:0x08a3, B:929:0x08b4, B:931:0x08ba, B:933:0x08c6, B:935:0x08e0, B:937:0x0900, B:936:0x08f1, B:943:0x092b, B:945:0x0931, B:947:0x0941, B:948:0x0948, B:950:0x0954, B:951:0x095b, B:952:0x095e, B:954:0x0969, B:956:0x0975, B:958:0x09ae, B:960:0x09b4, B:961:0x09c1, B:963:0x09c7, B:964:0x09d0, B:966:0x09d6, B:978:0x0a1c, B:980:0x0a22, B:982:0x0a28, B:967:0x09dc, B:969:0x09e2, B:971:0x09f4, B:973:0x0a03, B:975:0x0a13, B:984:0x0a37, B:986:0x0a3d, B:987:0x0a52, B:989:0x0a58, B:991:0x0a68, B:993:0x0a80, B:995:0x0a92, B:997:0x0ab9, B:999:0x0ae1, B:1001:0x0af3, B:1002:0x0b14, B:1004:0x0b3f, B:1006:0x0b70, B:1008:0x0b82, B:1009:0x0ba3, B:1011:0x0bce, B:998:0x0ad4, B:1013:0x0bff, B:1014:0x0c03, B:1016:0x0c09, B:1018:0x0c15, B:1019:0x0c47, B:1021:0x0c57, B:1022:0x0c6a, B:1024:0x0c70, B:1027:0x0c8b, B:1029:0x0ca6, B:1031:0x0cbc, B:1033:0x0cc1, B:1035:0x0cc5, B:1037:0x0cc9, B:1039:0x0cd5, B:1040:0x0cdd, B:1042:0x0ce1, B:1044:0x0ce9, B:1045:0x0cf7, B:1046:0x0d02, B:1118:0x0f2d, B:1047:0x0d07, B:1051:0x0d39, B:1052:0x0d41, B:1054:0x0d47, B:1056:0x0d57, B:1058:0x0d5b, B:1073:0x0da1, B:1074:0x0dc6, B:1076:0x0dd2, B:1078:0x0de6, B:1079:0x0e22, B:1085:0x0e3c, B:1087:0x0e43, B:1089:0x0e54, B:1091:0x0e58, B:1093:0x0e5c, B:1095:0x0e60, B:1096:0x0e6c, B:1097:0x0e71, B:1099:0x0e7a, B:1101:0x0e96, B:1102:0x0e9f, B:1116:0x0f27, B:1103:0x0eb1, B:1105:0x0eb5, B:1109:0x0ecb, B:1111:0x0ef5, B:1112:0x0f03, B:1113:0x0f13, B:1115:0x0f1b, B:1106:0x0ebc, B:1060:0x0d69, B:1062:0x0d6d, B:1064:0x0d77, B:1066:0x0d7b, B:1070:0x0d8b, B:1120:0x0f62, B:1122:0x0f6c, B:1123:0x0f73, B:1124:0x0f7b, B:1126:0x0f81, B:1127:0x0f95, B:1129:0x0fa5, B:1130:0x0fbc, B:1132:0x0fc2, B:1134:0x0fd2, B:1142:0x102a, B:1139:0x0fe9, B:1136:0x0fd8, B:1138:0x0fe4, B:1141:0x1012, B:1140:0x0ffa, B:1172:0x10c2, B:1175:0x10ca, B:1176:0x10cf, B:1177:0x10df, B:1179:0x10f9, B:1180:0x1112, B:1181:0x111a, B:1184:0x113b, B:1183:0x112a, B:1143:0x1032, B:1145:0x1038, B:1147:0x1042, B:1148:0x1045, B:1157:0x105e, B:1158:0x1061, B:1160:0x1067, B:1162:0x1073, B:1164:0x1080, B:1165:0x1090, B:1167:0x10ac, B:1168:0x10af, B:1169:0x10b9, B:1170:0x10bd, B:1156:0x105a, B:1151:0x1050, B:1119:0x0f35, B:938:0x0904, B:939:0x0908, B:941:0x090e, B:722:0x0246, B:674:0x0104, B:688:0x01a4, B:702:0x01fa, B:703:0x01fe, B:707:0x0216, B:716:0x0233, B:1192:0x1151, B:1193:0x1154, B:667:0x00b3, B:676:0x010d), top: B:1201:0x000d, inners: #1, #3 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.measurement.internal.zzal] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v241, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v242 */
    /* JADX WARN: Type inference failed for: r0v250, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v257, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r37v0, types: [com.google.android.gms.measurement.internal.zznv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zza(java.lang.String r38, long r39) {
        /*
            Method dump skipped, instruction units count: 4446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.zza(java.lang.String, long):boolean");
    }

    private final void zzaa() {
        zzl().zzt();
        if (this.zzu || this.zzv || this.zzw) {
            zzj().zzp().zza("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
        zzj().zzp().zza("Stopping uploading service(s)");
        List<Runnable> list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    private final void zzab() throws Throwable {
        zzl().zzt();
        for (String str : this.zzr) {
            if (zzpn.zza() && zze().zze(str, zzbh.zzch)) {
                zzj().zzc().zza(Qg.kd("Zz~rn\u0001osk#cqp\u001fre]o\u001amj`]\\Ye\u0012FB8a\rM]O\tI]GNPDDME\r}\u001eLKy\"\u001c", (short) (C1580rY.Xd() ^ (-2395)), (short) (C1580rY.Xd() ^ (-21914))), str);
                Intent intent = new Intent();
                intent.setAction(hg.Vd("mxu5mtsjnf.`lanjc]&^ch\"`WRcd`RYPX]\u0016;8.+*'33>\u001f3\u001d$&\u001a\u001a#\u001b", (short) (C1633zX.Xd() ^ (-30804)), (short) (C1633zX.Xd() ^ (-1978))));
                intent.setPackage(str);
                Context contextZza = this.zzm.zza();
                Class<?> cls = Class.forName(C1561oA.ud("NZO\\XQK\u0014HSQVFNS\f KIN>PK", (short) (C1580rY.Xd() ^ (-27148))));
                Class<?>[] clsArr = {Class.forName(C1561oA.yd("FTGVPKC\u000eP]Y`NX[\u0016\u001eDG9?F", (short) (C1633zX.Xd() ^ (-4675))))};
                Object[] objArr = {intent};
                short sXd = (short) (Od.Xd() ^ (-5818));
                int[] iArr = new int["!\u0014\u001e\u0015s%#\u0016\u001a\u001a\u0019,.".length()];
                QB qb = new QB("!\u0014\u001e\u0015s%#\u0016\u001a\u001a\u0019,.");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(contextZza, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        this.zzr.clear();
    }

    private final void zzac() {
        long jMax;
        long jMax2;
        zzl().zzt();
        zzs();
        if (this.zzp > 0) {
            long jAbs = 3600000 - Math.abs(zzb().elapsedRealtime() - this.zzp);
            if (jAbs > 0) {
                zzj().zzp().zza("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzy().zzb();
                zzz().zzu();
                return;
            }
            this.zzp = 0L;
        }
        if (!this.zzm.zzaf() || !zzad()) {
            zzj().zzp().zza("Nothing to upload or uploading impossible");
            zzy().zzb();
            zzz().zzu();
            return;
        }
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        zze();
        long jMax3 = Math.max(0L, zzbh.zzab.zza(null).longValue());
        boolean z2 = zzf().zzz() || zzf().zzy();
        if (z2) {
            String strZzo = zze().zzo();
            if (TextUtils.isEmpty(strZzo) || ".none.".equals(strZzo)) {
                zze();
                jMax = Math.max(0L, zzbh.zzv.zza(null).longValue());
            } else {
                zze();
                jMax = Math.max(0L, zzbh.zzw.zza(null).longValue());
            }
        } else {
            zze();
            jMax = Math.max(0L, zzbh.zzu.zza(null).longValue());
        }
        long jZza = this.zzj.zzd.zza();
        long jZza2 = this.zzj.zze.zza();
        long jMax4 = Math.max(zzf().c_(), zzf().d_());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = jCurrentTimeMillis - Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            long jMax5 = Math.max(jAbs3, jAbs4);
            jMax2 = jAbs2 + jMax3;
            if (z2 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            if (!zzp().zza(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i2 = 0;
                while (true) {
                    zze();
                    if (i2 >= Math.min(20, Math.max(0, zzbh.zzad.zza(null).intValue()))) {
                        break;
                    }
                    zze();
                    jMax2 += Math.max(0L, zzbh.zzac.zza(null).longValue()) * (1 << i2);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        if (jMax2 == 0) {
            zzj().zzp().zza("Next upload time is 0");
            zzy().zzb();
            zzz().zzu();
            return;
        }
        if (!zzh().zzu()) {
            zzj().zzp().zza("No network");
            zzy().zza();
            zzz().zzu();
            return;
        }
        long jZza3 = this.zzj.zzc.zza();
        zze();
        long jMax6 = Math.max(0L, zzbh.zzs.zza(null).longValue());
        if (!zzp().zza(jZza3, jMax6)) {
            jMax2 = Math.max(jMax2, jZza3 + jMax6);
        }
        zzy().zzb();
        long jCurrentTimeMillis2 = jMax2 - zzb().currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zze();
            jCurrentTimeMillis2 = Math.max(0L, zzbh.zzx.zza(null).longValue());
            this.zzj.zzd.zza(zzb().currentTimeMillis());
        }
        zzj().zzp().zza("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzz().zza(jCurrentTimeMillis2);
    }

    private final boolean zzad() {
        zzl().zzt();
        zzs();
        return zzf().zzx() || !TextUtils.isEmpty(zzf().f_());
    }

    private final boolean zzae() throws Throwable {
        zzl().zzt();
        FileLock fileLock = this.zzx;
        String strQd = Xg.qd("y\u001c\u0018\u001c\f\u0013\u0012M\u0012\u001f\u001f\u0015(&'\u001b%,X\u001b\u001e\u001f\"12_0-$=", (short) (OY.Xd() ^ 8459), (short) (OY.Xd() ^ 14915));
        if (fileLock != null && fileLock.isValid()) {
            zzj().zzp().zza(strQd);
            return true;
        }
        Context contextZza = this.zzm.zza();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("|\u0004$^\f.WK/u!Ur$\\>\u007fj\u0016Fe#M", (short) (ZN.Xd() ^ 32361), (short) (ZN.Xd() ^ 6319))).getMethod(ZO.xd("TfJZ?3g,fr\u0018", (short) (Od.Xd() ^ (-15383)), (short) (Od.Xd() ^ (-23211))), new Class[0]);
        try {
            method.setAccessible(true);
            File file = (File) method.invoke(contextZza, objArr);
            com.google.android.gms.internal.measurement.zzci zzciVarZza = com.google.android.gms.internal.measurement.zzcf.zza();
            short sXd = (short) (Od.Xd() ^ (-27756));
            short sXd2 = (short) (Od.Xd() ^ (-16072));
            int[] iArr = new int["Fh@w&\u000f\u001e\\TJFV\u0007.5'\u001a]d.Vr,<d".length()];
            QB qb = new QB("Fh@w&\u000f\u001e\\TJFV\u0007.5'\u001a]d.Vr,<d");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            try {
                FileChannel channel = new RandomAccessFile(new File(zzciVarZza.zza(file, new String(iArr, 0, i2))), Ig.wd("R)", (short) (C1499aX.Xd() ^ (-23543)))).getChannel();
                this.zzy = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.zzx = fileLockTryLock;
                if (fileLockTryLock != null) {
                    zzj().zzp().zza(strQd);
                    return true;
                }
                zzj().zzg().zza(EO.Od("{li\u0010\u007f+\u0011;2mC\"\u0003qqK\u0019\u0015\t\tH4\u000bMQC&`\\/Cz;/+[", (short) (C1633zX.Xd() ^ (-27760))));
                return false;
            } catch (FileNotFoundException e2) {
                zzj().zzg().zza(C1561oA.od("3MTVNL\u0007ZT\u0004DERUHPB{NNHJ8=:s?A4;", (short) (C1607wl.Xd() ^ 26634)), e2);
                return false;
            } catch (IOException e3) {
                zzj().zzg().zza(C1593ug.zd("\u000f+4822nD@q478;JKxMOKO?FE\u0001NRGP\u0006MQUO", (short) (C1499aX.Xd() ^ (-28419)), (short) (C1499aX.Xd() ^ (-25357))), e3);
                return false;
            } catch (OverlappingFileLockException e4) {
                zzj().zzu().zza(C1561oA.Qd("^~xzhmj$oqdk\u001f_in`[]q\u0017WXeh[cUS", (short) (C1633zX.Xd() ^ (-25980))), e4);
                return false;
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private final void zzb(zzbf zzbfVar, zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        zzgs zzgsVarZza = zzgs.zza(zzbfVar);
        zzq().zza(zzgsVarZza.zzc, zzf().zzd(zzoVar.zza));
        zzq().zza(zzgsVarZza, zze().zzb(zzoVar.zza));
        zzbf zzbfVarZza = zzgsVarZza.zza();
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzbfVarZza.zza) && "referrer API v2".equals(zzbfVarZza.zzb.zzd("_cis"))) {
            String strZzd = zzbfVarZza.zzb.zzd("gclid");
            if (!TextUtils.isEmpty(strZzd)) {
                zza(new zzon("_lgclid", zzbfVarZza.zzd, strZzd, "auto"), zzoVar);
            }
        }
        zza(zzbfVarZza, zzoVar);
    }

    private final void zzb(zzg zzgVar) {
        zzl().zzt();
        if (TextUtils.isEmpty(zzgVar.zzah()) && TextUtils.isEmpty(zzgVar.zzaa())) {
            zza((String) Preconditions.checkNotNull(zzgVar.zzac()), 204, null, null, null);
            return;
        }
        ArrayMap arrayMap = null;
        if (zzpb.zza() && zze().zza(zzbh.zzcf)) {
            String str = (String) Preconditions.checkNotNull(zzgVar.zzac());
            zzj().zzp().zza("Fetching remote configuration", str);
            zzfr.zzd zzdVarZzc = zzi().zzc(str);
            String strZze = zzi().zze(str);
            if (zzdVarZzc != null) {
                if (!TextUtils.isEmpty(strZze)) {
                    arrayMap = new ArrayMap();
                    arrayMap.put("If-Modified-Since", strZze);
                }
                String strZzd = zzi().zzd(str);
                if (!TextUtils.isEmpty(strZzd)) {
                    if (arrayMap == null) {
                        arrayMap = new ArrayMap();
                    }
                    arrayMap.put("If-None-Match", strZzd);
                }
            }
            this.zzu = true;
            zzgr zzgrVarZzh = zzh();
            zzgu zzguVar = new zzgu() { // from class: com.google.android.gms.measurement.internal.zzny
                @Override // com.google.android.gms.measurement.internal.zzgu
                public final void zza(String str2, int i2, Throwable th, byte[] bArr, Map map) {
                    this.zza.zza(str2, i2, th, bArr, map);
                }
            };
            zzgrVarZzh.zzt();
            zzgrVarZzh.zzal();
            Preconditions.checkNotNull(zzgVar);
            Preconditions.checkNotNull(zzguVar);
            String strZza = zzgrVarZzh.zzo().zza(zzgVar);
            try {
                zzgrVarZzh.zzl().zza(new zzgw(zzgrVarZzh, zzgVar.zzac(), new URI(strZza).toURL(), null, arrayMap, zzguVar));
                return;
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                zzgrVarZzh.zzj().zzg().zza("Failed to parse config URL. Not fetching. appId", zzgo.zza(zzgVar.zzac()), strZza);
                return;
            }
        }
        String strZza2 = this.zzk.zza(zzgVar);
        try {
            String str2 = (String) Preconditions.checkNotNull(zzgVar.zzac());
            URL url = new URL(strZza2);
            zzj().zzp().zza("Fetching remote configuration", str2);
            zzfr.zzd zzdVarZzc2 = zzi().zzc(str2);
            String strZze2 = zzi().zze(str2);
            if (zzdVarZzc2 != null) {
                if (!TextUtils.isEmpty(strZze2)) {
                    arrayMap = new ArrayMap();
                    arrayMap.put("If-Modified-Since", strZze2);
                }
                String strZzd2 = zzi().zzd(str2);
                if (!TextUtils.isEmpty(strZzd2)) {
                    if (arrayMap == null) {
                        arrayMap = new ArrayMap();
                    }
                    arrayMap.put("If-None-Match", strZzd2);
                }
            }
            this.zzu = true;
            zzgr zzgrVarZzh2 = zzh();
            zzod zzodVar = new zzod(this);
            zzgrVarZzh2.zzt();
            zzgrVarZzh2.zzal();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzodVar);
            zzgrVarZzh2.zzl().zza(new zzgw(zzgrVarZzh2, str2, url, null, arrayMap, zzodVar));
        } catch (MalformedURLException unused2) {
            zzj().zzg().zza("Failed to parse config URL. Not fetching. appId", zzgo.zza(zzgVar.zzac()), strZza2);
        }
    }

    private final zzo zzc(String str) {
        zzg zzgVarZze = zzf().zze(str);
        if (zzgVarZze == null || TextUtils.isEmpty(zzgVarZze.zzaf())) {
            zzj().zzc().zza("No app data available; dropping", str);
            return null;
        }
        Boolean boolZza = zza(zzgVarZze);
        if (boolZza == null || boolZza.booleanValue()) {
            return new zzo(str, zzgVarZze.zzah(), zzgVarZze.zzaf(), zzgVarZze.zze(), zzgVarZze.zzae(), zzgVarZze.zzq(), zzgVarZze.zzn(), (String) null, zzgVarZze.zzar(), false, zzgVarZze.zzag(), zzgVarZze.zzd(), 0L, 0, zzgVarZze.zzaq(), false, zzgVarZze.zzaa(), zzgVarZze.zzx(), zzgVarZze.zzo(), zzgVarZze.zzan(), (String) null, zzb(str).zzf(), "", (String) null, zzgVarZze.zzat(), zzgVarZze.zzw(), zzb(str).zza(), zzd(str).zzf(), zzgVarZze.zza(), zzgVarZze.zzf(), zzgVarZze.zzam(), zzgVarZze.zzak());
        }
        zzj().zzg().zza("App version does not match; dropping. appId", zzgo.zza(str));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:454:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0308 A[Catch: all -> 0x0a8c, TryCatch #4 {all -> 0x0a8c, blocks: (B:400:0x016b, B:403:0x017a, B:405:0x0184, B:410:0x0190, B:458:0x033b, B:460:0x037e, B:462:0x0383, B:463:0x039a, B:467:0x03ab, B:469:0x03c3, B:471:0x03ca, B:472:0x03e1, B:477:0x0405, B:682:0x0a66, B:683:0x0a7d, B:480:0x0427, B:483:0x0446, B:484:0x0460, B:486:0x046a, B:488:0x0476, B:490:0x047c, B:491:0x0485, B:493:0x0491, B:495:0x049b, B:497:0x04a5, B:499:0x04ab, B:501:0x04af, B:502:0x04bb, B:504:0x04c7, B:505:0x04dc, B:507:0x0506, B:510:0x051d, B:514:0x056c, B:515:0x058b, B:517:0x05c9, B:518:0x05ce, B:520:0x05d6, B:521:0x05db, B:523:0x05e3, B:524:0x05e8, B:526:0x05f0, B:527:0x05f5, B:529:0x05fe, B:530:0x0604, B:532:0x0611, B:533:0x0616, B:535:0x063d, B:537:0x0645, B:538:0x064a, B:540:0x0650, B:542:0x065e, B:544:0x0669, B:548:0x067e, B:553:0x069c, B:555:0x06a3, B:559:0x06b4, B:563:0x06ca, B:567:0x06db, B:571:0x06f1, B:575:0x0707, B:579:0x0717, B:584:0x072b, B:585:0x0739, B:587:0x073f, B:588:0x0744, B:590:0x0753, B:591:0x0756, B:593:0x0772, B:595:0x0776, B:597:0x0780, B:599:0x078a, B:601:0x078e, B:603:0x0799, B:604:0x07a4, B:606:0x07ac, B:608:0x07b8, B:610:0x07c4, B:612:0x07ca, B:616:0x07e4, B:618:0x07f0, B:625:0x0827, B:619:0x0807, B:621:0x080d, B:622:0x0818, B:624:0x081e, B:626:0x0833, B:628:0x087a, B:630:0x0884, B:631:0x0887, B:633:0x0893, B:635:0x08b3, B:636:0x08c0, B:637:0x08f6, B:639:0x08fc, B:641:0x0906, B:642:0x0913, B:644:0x091d, B:645:0x092a, B:646:0x0935, B:648:0x093b, B:650:0x0979, B:652:0x0983, B:654:0x0995, B:655:0x0998, B:657:0x099e, B:658:0x09ae, B:660:0x09b6, B:661:0x09bc, B:663:0x09c2, B:674:0x0a26, B:676:0x0a2c, B:677:0x0a30, B:666:0x09cf, B:668:0x09fb, B:673:0x0a10, B:513:0x055d, B:414:0x019e, B:416:0x01a8, B:418:0x01bf, B:423:0x01d8, B:430:0x0214, B:432:0x021a, B:434:0x0228, B:436:0x0241, B:453:0x02d3, B:455:0x02fe, B:457:0x0308, B:438:0x0247, B:439:0x0261, B:442:0x0273, B:444:0x0279, B:445:0x0290, B:452:0x02b7, B:451:0x02a6, B:426:0x01e6, B:429:0x020a), top: B:698:0x016b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x037e A[Catch: all -> 0x0a8c, TryCatch #4 {all -> 0x0a8c, blocks: (B:400:0x016b, B:403:0x017a, B:405:0x0184, B:410:0x0190, B:458:0x033b, B:460:0x037e, B:462:0x0383, B:463:0x039a, B:467:0x03ab, B:469:0x03c3, B:471:0x03ca, B:472:0x03e1, B:477:0x0405, B:682:0x0a66, B:683:0x0a7d, B:480:0x0427, B:483:0x0446, B:484:0x0460, B:486:0x046a, B:488:0x0476, B:490:0x047c, B:491:0x0485, B:493:0x0491, B:495:0x049b, B:497:0x04a5, B:499:0x04ab, B:501:0x04af, B:502:0x04bb, B:504:0x04c7, B:505:0x04dc, B:507:0x0506, B:510:0x051d, B:514:0x056c, B:515:0x058b, B:517:0x05c9, B:518:0x05ce, B:520:0x05d6, B:521:0x05db, B:523:0x05e3, B:524:0x05e8, B:526:0x05f0, B:527:0x05f5, B:529:0x05fe, B:530:0x0604, B:532:0x0611, B:533:0x0616, B:535:0x063d, B:537:0x0645, B:538:0x064a, B:540:0x0650, B:542:0x065e, B:544:0x0669, B:548:0x067e, B:553:0x069c, B:555:0x06a3, B:559:0x06b4, B:563:0x06ca, B:567:0x06db, B:571:0x06f1, B:575:0x0707, B:579:0x0717, B:584:0x072b, B:585:0x0739, B:587:0x073f, B:588:0x0744, B:590:0x0753, B:591:0x0756, B:593:0x0772, B:595:0x0776, B:597:0x0780, B:599:0x078a, B:601:0x078e, B:603:0x0799, B:604:0x07a4, B:606:0x07ac, B:608:0x07b8, B:610:0x07c4, B:612:0x07ca, B:616:0x07e4, B:618:0x07f0, B:625:0x0827, B:619:0x0807, B:621:0x080d, B:622:0x0818, B:624:0x081e, B:626:0x0833, B:628:0x087a, B:630:0x0884, B:631:0x0887, B:633:0x0893, B:635:0x08b3, B:636:0x08c0, B:637:0x08f6, B:639:0x08fc, B:641:0x0906, B:642:0x0913, B:644:0x091d, B:645:0x092a, B:646:0x0935, B:648:0x093b, B:650:0x0979, B:652:0x0983, B:654:0x0995, B:655:0x0998, B:657:0x099e, B:658:0x09ae, B:660:0x09b6, B:661:0x09bc, B:663:0x09c2, B:674:0x0a26, B:676:0x0a2c, B:677:0x0a30, B:666:0x09cf, B:668:0x09fb, B:673:0x0a10, B:513:0x055d, B:414:0x019e, B:416:0x01a8, B:418:0x01bf, B:423:0x01d8, B:430:0x0214, B:432:0x021a, B:434:0x0228, B:436:0x0241, B:453:0x02d3, B:455:0x02fe, B:457:0x0308, B:438:0x0247, B:439:0x0261, B:442:0x0273, B:444:0x0279, B:445:0x0290, B:452:0x02b7, B:451:0x02a6, B:426:0x01e6, B:429:0x020a), top: B:698:0x016b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0a2c A[Catch: all -> 0x0a8c, TryCatch #4 {all -> 0x0a8c, blocks: (B:400:0x016b, B:403:0x017a, B:405:0x0184, B:410:0x0190, B:458:0x033b, B:460:0x037e, B:462:0x0383, B:463:0x039a, B:467:0x03ab, B:469:0x03c3, B:471:0x03ca, B:472:0x03e1, B:477:0x0405, B:682:0x0a66, B:683:0x0a7d, B:480:0x0427, B:483:0x0446, B:484:0x0460, B:486:0x046a, B:488:0x0476, B:490:0x047c, B:491:0x0485, B:493:0x0491, B:495:0x049b, B:497:0x04a5, B:499:0x04ab, B:501:0x04af, B:502:0x04bb, B:504:0x04c7, B:505:0x04dc, B:507:0x0506, B:510:0x051d, B:514:0x056c, B:515:0x058b, B:517:0x05c9, B:518:0x05ce, B:520:0x05d6, B:521:0x05db, B:523:0x05e3, B:524:0x05e8, B:526:0x05f0, B:527:0x05f5, B:529:0x05fe, B:530:0x0604, B:532:0x0611, B:533:0x0616, B:535:0x063d, B:537:0x0645, B:538:0x064a, B:540:0x0650, B:542:0x065e, B:544:0x0669, B:548:0x067e, B:553:0x069c, B:555:0x06a3, B:559:0x06b4, B:563:0x06ca, B:567:0x06db, B:571:0x06f1, B:575:0x0707, B:579:0x0717, B:584:0x072b, B:585:0x0739, B:587:0x073f, B:588:0x0744, B:590:0x0753, B:591:0x0756, B:593:0x0772, B:595:0x0776, B:597:0x0780, B:599:0x078a, B:601:0x078e, B:603:0x0799, B:604:0x07a4, B:606:0x07ac, B:608:0x07b8, B:610:0x07c4, B:612:0x07ca, B:616:0x07e4, B:618:0x07f0, B:625:0x0827, B:619:0x0807, B:621:0x080d, B:622:0x0818, B:624:0x081e, B:626:0x0833, B:628:0x087a, B:630:0x0884, B:631:0x0887, B:633:0x0893, B:635:0x08b3, B:636:0x08c0, B:637:0x08f6, B:639:0x08fc, B:641:0x0906, B:642:0x0913, B:644:0x091d, B:645:0x092a, B:646:0x0935, B:648:0x093b, B:650:0x0979, B:652:0x0983, B:654:0x0995, B:655:0x0998, B:657:0x099e, B:658:0x09ae, B:660:0x09b6, B:661:0x09bc, B:663:0x09c2, B:674:0x0a26, B:676:0x0a2c, B:677:0x0a30, B:666:0x09cf, B:668:0x09fb, B:673:0x0a10, B:513:0x055d, B:414:0x019e, B:416:0x01a8, B:418:0x01bf, B:423:0x01d8, B:430:0x0214, B:432:0x021a, B:434:0x0228, B:436:0x0241, B:453:0x02d3, B:455:0x02fe, B:457:0x0308, B:438:0x0247, B:439:0x0261, B:442:0x0273, B:444:0x0279, B:445:0x0290, B:452:0x02b7, B:451:0x02a6, B:426:0x01e6, B:429:0x020a), top: B:698:0x016b, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzc(com.google.android.gms.measurement.internal.zzbf r35, com.google.android.gms.measurement.internal.zzo r36) {
        /*
            Method dump skipped, instruction units count: 2709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.zzc(com.google.android.gms.measurement.internal.zzbf, com.google.android.gms.measurement.internal.zzo):void");
    }

    private final zzax zzd(String str) {
        zzl().zzt();
        zzs();
        zzax zzaxVar = this.zzad.get(str);
        if (zzaxVar != null) {
            return zzaxVar;
        }
        zzax zzaxVarZzg = zzf().zzg(str);
        this.zzad.put(str, zzaxVarZzg);
        return zzaxVarZzg;
    }

    private final void zze(String str) {
        zzl().zzt();
        zzs();
        this.zzw = true;
        try {
            Boolean boolZzab = this.zzm.zzr().zzab();
            if (boolZzab == null) {
                zzj().zzu().zza("Upload data called on the client side before use of service was decided");
                return;
            }
            if (boolZzab.booleanValue()) {
                zzj().zzg().zza("Upload called in the client side when service should be used");
                return;
            }
            if (this.zzp > 0) {
                zzac();
                return;
            }
            if (!zzh().zzu()) {
                zzj().zzp().zza("Network not connected, ignoring upload request");
                zzac();
                return;
            }
            if (!zzf().zzs(str)) {
                zzj().zzp().zza("Upload queue has no batches for appId", str);
                return;
            }
            zzoj zzojVarZzj = zzf().zzj(str);
            if (zzojVarZzj == null) {
                return;
            }
            zzfy.zzj zzjVarZzc = zzojVarZzj.zzc();
            if (zzjVarZzc == null) {
                return;
            }
            String strZza = zzp().zza(zzjVarZzc);
            byte[] bArrZzca = zzjVarZzc.zzca();
            zzj().zzp().zza("Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrZzca.length), strZza);
            if (zzpb.zza() && zze().zza(zzbh.zzcf)) {
                this.zzv = true;
                zzh().zza(str, zzojVarZzj.zzb(), zzjVarZzc, new zzob(this, str, zzojVarZzj));
            } else {
                try {
                    this.zzv = true;
                    zzh().zza(str, new URL(zzojVarZzj.zzd()), bArrZzca, zzojVarZzj.zze(), new zzoe(this, str, zzojVarZzj));
                } catch (MalformedURLException unused) {
                    zzj().zzg().zza("Failed to parse URL. Not uploading MeasurementBatch. appId", zzgo.zza(str), zzojVarZzj.zzd());
                }
            }
        } finally {
            this.zzw = false;
            zzaa();
        }
    }

    private static Boolean zzh(zzo zzoVar) {
        Boolean bool = zzoVar.zzq;
        if (TextUtils.isEmpty(zzoVar.zzad)) {
            return bool;
        }
        int i2 = zzoa.zza[zzf.zza(zzoVar.zzad).zza().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return false;
            }
            if (i2 == 3) {
                return true;
            }
            if (i2 != 4) {
                return bool;
            }
        }
        return null;
    }

    private static boolean zzi(zzo zzoVar) {
        return (TextUtils.isEmpty(zzoVar.zzb) && TextUtils.isEmpty(zzoVar.zzp)) ? false : true;
    }

    private final long zzx() {
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        zzmw zzmwVar = this.zzj;
        zzmwVar.zzal();
        zzmwVar.zzt();
        long jZza = zzmwVar.zzf.zza();
        if (jZza == 0) {
            jZza = ((long) zzmwVar.zzq().zzv().nextInt(86400000)) + 1;
            zzmwVar.zzf.zza(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    private final zzgy zzy() {
        zzgy zzgyVar = this.zze;
        if (zzgyVar != null) {
            return zzgyVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zznq zzz() {
        return (zznq) zza(this.zzf);
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    public final Context zza() {
        return this.zzm.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    final Bundle zza(String str) {
        zzl().zzt();
        zzs();
        if (zzi().zzb(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzje zzjeVarZzb = zzb(str);
        bundle.putAll(zzjeVarZzb.zzb());
        bundle.putAll(zza(str, zzd(str), zzjeVarZzb, new zzah()).zzb());
        zzop zzopVarZze = zzf().zze(str, "_npa");
        bundle.putString("ad_personalization", (zzopVarZze != null ? zzopVarZze.zze.equals(1L) : zza(str, new zzah())) == 1 ? "denied" : "granted");
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.google.android.gms.measurement.internal.zzg zza(com.google.android.gms.measurement.internal.zzo r14) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.zza(com.google.android.gms.measurement.internal.zzo):com.google.android.gms.measurement.internal.zzg");
    }

    final void zza(zzae zzaeVar) {
        zzo zzoVarZzc = zzc((String) Preconditions.checkNotNull(zzaeVar.zza));
        if (zzoVarZzc != null) {
            zza(zzaeVar, zzoVarZzc);
        }
    }

    final void zza(zzae zzaeVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotEmpty(zzaeVar.zza);
        Preconditions.checkNotNull(zzaeVar.zzc);
        Preconditions.checkNotEmpty(zzaeVar.zzc.zza);
        zzl().zzt();
        zzs();
        if (zzi(zzoVar)) {
            if (!zzoVar.zzh) {
                zza(zzoVar);
                return;
            }
            zzf().zzp();
            try {
                zza(zzoVar);
                String str = (String) Preconditions.checkNotNull(zzaeVar.zza);
                zzae zzaeVarZzc = zzf().zzc(str, zzaeVar.zzc.zza);
                if (zzaeVarZzc != null) {
                    zzj().zzc().zza("Removing conditional user property", zzaeVar.zza, this.zzm.zzk().zzc(zzaeVar.zzc.zza));
                    zzf().zza(str, zzaeVar.zzc.zza);
                    if (zzaeVarZzc.zze) {
                        zzf().zzh(str, zzaeVar.zzc.zza);
                    }
                    if (zzaeVar.zzk != null) {
                        zzc((zzbf) Preconditions.checkNotNull(zzq().zza(str, ((zzbf) Preconditions.checkNotNull(zzaeVar.zzk)).zza, zzaeVar.zzk.zzb != null ? zzaeVar.zzk.zzb.zzb() : null, zzaeVarZzc.zzb, zzaeVar.zzk.zzd, true, true)), zzoVar);
                    }
                } else {
                    zzj().zzu().zza("Conditional user property doesn't exist", zzgo.zza(zzaeVar.zza), this.zzm.zzk().zzc(zzaeVar.zzc.zza));
                }
                zzf().zzw();
            } finally {
                zzf().zzu();
            }
        }
    }

    final void zza(zzbf zzbfVar, zzo zzoVar) {
        zzbf zzbfVar2;
        List<zzae> listZza;
        List<zzae> listZza2;
        List<zzae> listZza3;
        String str;
        Preconditions.checkNotNull(zzoVar);
        Preconditions.checkNotEmpty(zzoVar.zza);
        zzl().zzt();
        zzs();
        String str2 = zzoVar.zza;
        long j2 = zzbfVar.zzd;
        zzgs zzgsVarZza = zzgs.zza(zzbfVar);
        zzl().zzt();
        zzos.zza((this.zzaf == null || (str = this.zzag) == null || !str.equals(str2)) ? null : this.zzaf, zzgsVarZza.zzc, false);
        zzbf zzbfVarZza = zzgsVarZza.zza();
        zzp();
        if (zzoo.zza(zzbfVarZza, zzoVar)) {
            if (!zzoVar.zzh) {
                zza(zzoVar);
                return;
            }
            if (zzoVar.zzs == null) {
                zzbfVar2 = zzbfVarZza;
            } else if (!zzoVar.zzs.contains(zzbfVarZza.zza)) {
                zzj().zzc().zza("Dropping non-safelisted event. appId, event name, origin", str2, zzbfVarZza.zza, zzbfVarZza.zzc);
                return;
            } else {
                Bundle bundleZzb = zzbfVarZza.zzb.zzb();
                bundleZzb.putLong("ga_safelisted", 1L);
                zzbfVar2 = new zzbf(zzbfVarZza.zza, new zzbe(bundleZzb), zzbfVarZza.zzc, zzbfVarZza.zzd);
            }
            zzf().zzp();
            try {
                zzal zzalVarZzf = zzf();
                Preconditions.checkNotEmpty(str2);
                zzalVarZzf.zzt();
                zzalVarZzf.zzal();
                if (j2 < 0) {
                    zzalVarZzf.zzj().zzu().zza("Invalid time querying timed out conditional properties", zzgo.zza(str2), Long.valueOf(j2));
                    listZza = Collections.emptyList();
                } else {
                    listZza = zzalVarZzf.zza("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j2)});
                }
                for (zzae zzaeVar : listZza) {
                    if (zzaeVar != null) {
                        zzj().zzp().zza("User property timed out", zzaeVar.zza, this.zzm.zzk().zzc(zzaeVar.zzc.zza), zzaeVar.zzc.zza());
                        if (zzaeVar.zzg != null) {
                            zzc(new zzbf(zzaeVar.zzg, j2), zzoVar);
                        }
                        zzf().zza(str2, zzaeVar.zzc.zza);
                    }
                }
                zzal zzalVarZzf2 = zzf();
                Preconditions.checkNotEmpty(str2);
                zzalVarZzf2.zzt();
                zzalVarZzf2.zzal();
                if (j2 < 0) {
                    zzalVarZzf2.zzj().zzu().zza("Invalid time querying expired conditional properties", zzgo.zza(str2), Long.valueOf(j2));
                    listZza2 = Collections.emptyList();
                } else {
                    listZza2 = zzalVarZzf2.zza("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(listZza2.size());
                for (zzae zzaeVar2 : listZza2) {
                    if (zzaeVar2 != null) {
                        zzj().zzp().zza("User property expired", zzaeVar2.zza, this.zzm.zzk().zzc(zzaeVar2.zzc.zza), zzaeVar2.zzc.zza());
                        zzf().zzh(str2, zzaeVar2.zzc.zza);
                        if (zzaeVar2.zzk != null) {
                            arrayList.add(zzaeVar2.zzk);
                        }
                        zzf().zza(str2, zzaeVar2.zzc.zza);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    zzc(new zzbf((zzbf) obj, j2), zzoVar);
                }
                zzal zzalVarZzf3 = zzf();
                String str3 = zzbfVar2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzalVarZzf3.zzt();
                zzalVarZzf3.zzal();
                if (j2 < 0) {
                    zzalVarZzf3.zzj().zzu().zza("Invalid time querying triggered conditional properties", zzgo.zza(str2), zzalVarZzf3.zzi().zza(str3), Long.valueOf(j2));
                    listZza3 = Collections.emptyList();
                } else {
                    listZza3 = zzalVarZzf3.zza("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(listZza3.size());
                for (zzae zzaeVar3 : listZza3) {
                    if (zzaeVar3 != null) {
                        zzon zzonVar = zzaeVar3.zzc;
                        zzop zzopVar = new zzop((String) Preconditions.checkNotNull(zzaeVar3.zza), zzaeVar3.zzb, zzonVar.zza, j2, Preconditions.checkNotNull(zzonVar.zza()));
                        if (zzf().zza(zzopVar)) {
                            zzj().zzp().zza("User property triggered", zzaeVar3.zza, this.zzm.zzk().zzc(zzopVar.zzc), zzopVar.zze);
                        } else {
                            zzj().zzg().zza("Too many active user properties, ignoring", zzgo.zza(zzaeVar3.zza), this.zzm.zzk().zzc(zzopVar.zzc), zzopVar.zze);
                        }
                        if (zzaeVar3.zzi != null) {
                            arrayList2.add(zzaeVar3.zzi);
                        }
                        zzaeVar3.zzc = new zzon(zzopVar);
                        zzaeVar3.zze = true;
                        zzf().zza(zzaeVar3);
                    }
                }
                zzc(zzbfVar2, zzoVar);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    zzc(new zzbf((zzbf) obj2, j2), zzoVar);
                }
                zzf().zzw();
            } finally {
                zzf().zzu();
            }
        }
    }

    final void zza(zzbf zzbfVar, String str) {
        zzg zzgVarZze = zzf().zze(str);
        if (zzgVarZze == null || TextUtils.isEmpty(zzgVarZze.zzaf())) {
            zzj().zzc().zza("No app data available; dropping event", str);
            return;
        }
        Boolean boolZza = zza(zzgVarZze);
        if (boolZza == null) {
            if (!"_ui".equals(zzbfVar.zza)) {
                zzj().zzu().zza("Could not find package. appId", zzgo.zza(str));
            }
        } else if (!boolZza.booleanValue()) {
            zzj().zzg().zza("App version does not match; dropping event. appId", zzgo.zza(str));
            return;
        }
        zzb(zzbfVar, new zzo(str, zzgVarZze.zzah(), zzgVarZze.zzaf(), zzgVarZze.zze(), zzgVarZze.zzae(), zzgVarZze.zzq(), zzgVarZze.zzn(), (String) null, zzgVarZze.zzar(), false, zzgVarZze.zzag(), zzgVarZze.zzd(), 0L, 0, zzgVarZze.zzaq(), false, zzgVarZze.zzaa(), zzgVarZze.zzx(), zzgVarZze.zzo(), zzgVarZze.zzan(), (String) null, zzb(str).zzf(), "", (String) null, zzgVarZze.zzat(), zzgVarZze.zzw(), zzb(str).zza(), zzd(str).zzf(), zzgVarZze.zza(), zzgVarZze.zzf(), zzgVarZze.zzam(), zzgVarZze.zzak()));
    }

    final void zza(zzg zzgVar, zzfy.zzk.zza zzaVar) {
        zzfy.zzo next;
        zzl().zzt();
        zzs();
        zzah zzahVarZza = zzah.zza(zzaVar.zzv());
        String strZzac = zzgVar.zzac();
        zzl().zzt();
        zzs();
        zzje zzjeVarZzb = zzb(strZzac);
        int i2 = zzoa.zza[zzjeVarZzb.zzc().ordinal()];
        if (i2 == 1) {
            zzahVarZza.zza(zzje.zza.AD_STORAGE, zzak.REMOTE_ENFORCED_DEFAULT);
        } else if (i2 == 2 || i2 == 3) {
            zzahVarZza.zza(zzje.zza.AD_STORAGE, zzjeVarZzb.zza());
        } else {
            zzahVarZza.zza(zzje.zza.AD_STORAGE, zzak.FAILSAFE);
        }
        int i3 = zzoa.zza[zzjeVarZzb.zzd().ordinal()];
        if (i3 == 1) {
            zzahVarZza.zza(zzje.zza.ANALYTICS_STORAGE, zzak.REMOTE_ENFORCED_DEFAULT);
        } else if (i3 == 2 || i3 == 3) {
            zzahVarZza.zza(zzje.zza.ANALYTICS_STORAGE, zzjeVarZzb.zza());
        } else {
            zzahVarZza.zza(zzje.zza.ANALYTICS_STORAGE, zzak.FAILSAFE);
        }
        String strZzac2 = zzgVar.zzac();
        zzl().zzt();
        zzs();
        zzax zzaxVarZza = zza(strZzac2, zzd(strZzac2), zzb(strZzac2), zzahVarZza);
        zzaVar.zzb(((Boolean) Preconditions.checkNotNull(zzaxVarZza.zzd())).booleanValue());
        if (!TextUtils.isEmpty(zzaxVarZza.zze())) {
            zzaVar.zzh(zzaxVarZza.zze());
        }
        zzl().zzt();
        zzs();
        Iterator<zzfy.zzo> it = zzaVar.zzab().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if ("_npa".equals(next.zzg())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next == null) {
            int iZza = zza(zzgVar.zzac(), zzahVarZza);
            zzaVar.zza((zzfy.zzo) ((com.google.android.gms.internal.measurement.zzjt) zzfy.zzo.zze().zza("_npa").zzb(zzb().currentTimeMillis()).zza(iZza).zzai()));
            zzj().zzp().zza("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iZza));
        } else if (zzahVarZza.zza(zzje.zza.AD_PERSONALIZATION) == zzak.UNSET) {
            zzop zzopVarZze = zzf().zze(zzgVar.zzac(), "_npa");
            if (zzopVarZze == null) {
                Boolean boolZzx = zzgVar.zzx();
                if (boolZzx == null || ((boolZzx == Boolean.TRUE && next.zzc() != 1) || (boolZzx == Boolean.FALSE && next.zzc() != 0))) {
                    zzahVarZza.zza(zzje.zza.AD_PERSONALIZATION, zzak.API);
                } else {
                    zzahVarZza.zza(zzje.zza.AD_PERSONALIZATION, zzak.MANIFEST);
                }
            } else if ("tcf".equals(zzopVarZze.zzb)) {
                zzahVarZza.zza(zzje.zza.AD_PERSONALIZATION, zzak.TCF);
            } else if (App.TYPE.equals(zzopVarZze.zzb)) {
                zzahVarZza.zza(zzje.zza.AD_PERSONALIZATION, zzak.API);
            } else {
                zzahVarZza.zza(zzje.zza.AD_PERSONALIZATION, zzak.MANIFEST);
            }
        }
        zzaVar.zzf(zzahVarZza.toString());
        boolean zZzm = this.zzb.zzm(zzgVar.zzac());
        List<zzfy.zzf> listZzaa = zzaVar.zzaa();
        int i4 = 0;
        for (int i5 = 0; i5 < listZzaa.size(); i5++) {
            if ("_tcf".equals(listZzaa.get(i5).zzg())) {
                zzfy.zzf.zza zzaVarZzcd = listZzaa.get(i5).zzcd();
                List<zzfy.zzh> listZzf = zzaVarZzcd.zzf();
                while (true) {
                    if (i4 >= listZzf.size()) {
                        break;
                    }
                    if ("_tcfd".equals(listZzf.get(i4).zzg())) {
                        zzaVarZzcd.zza(i4, zzfy.zzh.zze().zza("_tcfd").zzb(zznm.zza(listZzf.get(i4).zzh(), zZzm)));
                        break;
                    }
                    i4++;
                }
                zzaVar.zza(i5, zzaVarZzcd);
                return;
            }
        }
    }

    final void zza(zzon zzonVar, zzo zzoVar) {
        zzop zzopVarZze;
        long jLongValue;
        zzl().zzt();
        zzs();
        if (zzi(zzoVar)) {
            if (!zzoVar.zzh) {
                zza(zzoVar);
                return;
            }
            int iZzb = zzq().zzb(zzonVar.zza);
            if (iZzb != 0) {
                zzq();
                String str = zzonVar.zza;
                zze();
                String strZza = zzos.zza(str, 24, true);
                length = zzonVar.zza != null ? zzonVar.zza.length() : 0;
                zzq();
                zzos.zza(this.zzah, zzoVar.zza, iZzb, "_ev", strZza, length);
                return;
            }
            int iZza = zzq().zza(zzonVar.zza, zzonVar.zza());
            if (iZza != 0) {
                zzq();
                String str2 = zzonVar.zza;
                zze();
                String strZza2 = zzos.zza(str2, 24, true);
                Object objZza = zzonVar.zza();
                if (objZza != null && ((objZza instanceof String) || (objZza instanceof CharSequence))) {
                    length = String.valueOf(objZza).length();
                }
                zzq();
                zzos.zza(this.zzah, zzoVar.zza, iZza, "_ev", strZza2, length);
                return;
            }
            Object objZzc = zzq().zzc(zzonVar.zza, zzonVar.zza());
            if (objZzc == null) {
                return;
            }
            if ("_sid".equals(zzonVar.zza)) {
                long j2 = zzonVar.zzb;
                String str3 = zzonVar.zze;
                String str4 = (String) Preconditions.checkNotNull(zzoVar.zza);
                zzop zzopVarZze2 = zzf().zze(str4, "_sno");
                if (zzopVarZze2 == null || !(zzopVarZze2.zze instanceof Long)) {
                    if (zzopVarZze2 != null) {
                        zzj().zzu().zza("Retrieved last session number from database does not contain a valid (long) value", zzopVarZze2.zze);
                    }
                    zzbb zzbbVarZzd = zzf().zzd(str4, "_s");
                    if (zzbbVarZzd != null) {
                        jLongValue = zzbbVarZzd.zzc;
                        zzj().zzp().zza("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                    } else {
                        jLongValue = 0;
                    }
                } else {
                    jLongValue = ((Long) zzopVarZze2.zze).longValue();
                }
                zza(new zzon("_sno", j2, Long.valueOf(jLongValue + 1), str3), zzoVar);
            }
            zzop zzopVar = new zzop((String) Preconditions.checkNotNull(zzoVar.zza), (String) Preconditions.checkNotNull(zzonVar.zze), zzonVar.zza, zzonVar.zzb, objZzc);
            zzj().zzp().zza("Setting user property", this.zzm.zzk().zzc(zzopVar.zzc), objZzc);
            zzf().zzp();
            try {
                if ("_id".equals(zzopVar.zzc) && (zzopVarZze = zzf().zze(zzoVar.zza, "_id")) != null && !zzopVar.zze.equals(zzopVarZze.zze)) {
                    zzf().zzh(zzoVar.zza, "_lair");
                }
                zza(zzoVar);
                boolean zZza = zzf().zza(zzopVar);
                if ("_sid".equals(zzonVar.zza)) {
                    long jZza = zzp().zza(zzoVar.zzv);
                    zzg zzgVarZze = zzf().zze(zzoVar.zza);
                    if (zzgVarZze != null) {
                        zzgVarZze.zzs(jZza);
                        if (zzgVarZze.zzas()) {
                            zzf().zza(zzgVarZze, false, false);
                        }
                    }
                }
                zzf().zzw();
                if (!zZza) {
                    zzj().zzg().zza("Too many unique user properties are set. Ignoring user property", this.zzm.zzk().zzc(zzopVar.zzc), zzopVar.zze);
                    zzq();
                    zzos.zza(this.zzah, zzoVar.zza, 9, (String) null, (String) null, 0);
                }
            } finally {
                zzf().zzu();
            }
        }
    }

    final void zza(Runnable runnable) {
        zzl().zzt();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    final void zza(String str, int i2, Throwable th, byte[] bArr, zzoj zzojVar) {
        zzl().zzt();
        zzs();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzv = false;
                zzaa();
            }
        }
        if ((i2 == 200 || i2 == 204) && th == null) {
            if (zzojVar != null) {
                zzal zzalVarZzf = zzf();
                Long lValueOf = Long.valueOf(zzojVar.zza());
                zzalVarZzf.zzt();
                zzalVarZzf.zzal();
                Preconditions.checkNotNull(lValueOf);
                if (!zzpu.zza() || zzalVarZzf.zze().zza(zzbh.zzcb)) {
                    try {
                        if (zzalVarZzf.e_().delete("upload_queue", "rowid=?", new String[]{String.valueOf(lValueOf)}) != 1) {
                            zzalVarZzf.zzj().zzu().zza("Deleted fewer rows from upload_queue than expected");
                        }
                    } catch (SQLiteException e2) {
                        zzalVarZzf.zzj().zzg().zza("Failed to delete a MeasurementBatch in a upload_queue table", e2);
                        throw e2;
                    }
                }
            }
            zzj().zzp().zza("Successfully uploaded batch from upload queue. appId, status", str, Integer.valueOf(i2));
            if (zze().zza(zzbh.zzcb) && zzh().zzu() && zzf().zzs(str)) {
                zze(str);
            } else {
                zzac();
            }
        } else {
            String str2 = new String(bArr, StandardCharsets.UTF_8);
            String strSubstring = str2.substring(0, Math.min(32, str2.length()));
            zzgq zzgqVarZzv = zzj().zzv();
            Integer numValueOf = Integer.valueOf(i2);
            Object obj = th;
            if (th == null) {
                obj = strSubstring;
            }
            zzgqVarZzv.zza("Network upload failed. Will retry later. appId, status, error", str, numValueOf, obj);
            if (zzojVar != null) {
                zzf().zza(Long.valueOf(zzojVar.zza()));
            }
            zzac();
        }
    }

    final void zza(String str, zzfy.zzk.zza zzaVar) {
        int iZza;
        int iIndexOf;
        Set<String> setZzg = zzi().zzg(str);
        if (setZzg != null) {
            zzaVar.zzd(setZzg);
        }
        if (zzi().zzp(str)) {
            zzaVar.zzj();
        }
        if (zzi().zzs(str)) {
            String strZzy = zzaVar.zzy();
            if (!TextUtils.isEmpty(strZzy) && (iIndexOf = strZzy.indexOf(".")) != -1) {
                zzaVar.zzo(strZzy.substring(0, iIndexOf));
            }
        }
        if (zzi().zzt(str) && (iZza = zzoo.zza(zzaVar, "_id")) != -1) {
            zzaVar.zzc(iZza);
        }
        if (zzi().zzr(str)) {
            zzaVar.zzk();
        }
        if (zzi().zzo(str)) {
            zzaVar.zzh();
            if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcy) || zzb(str).zzh()) {
                zzb zzbVar = this.zzae.get(str);
                if (zzbVar == null || zzbVar.zzb + zze().zzc(str, zzbh.zzaw) < zzb().elapsedRealtime()) {
                    zzbVar = new zzb();
                    this.zzae.put(str, zzbVar);
                }
                zzaVar.zzk(zzbVar.zza);
            }
        }
        if (zzi().zzq(str)) {
            zzaVar.zzr();
        }
    }

    public final void zza(String str, zzlk zzlkVar) {
        zzl().zzt();
        String str2 = this.zzag;
        if (str2 == null || str2.equals(str) || zzlkVar != null) {
            this.zzag = str;
            this.zzaf = zzlkVar;
        }
    }

    final void zza(String str, zzo zzoVar) {
        zzl().zzt();
        zzs();
        if (zzi(zzoVar)) {
            if (!zzoVar.zzh) {
                zza(zzoVar);
                return;
            }
            Boolean boolZzh = zzh(zzoVar);
            if ("_npa".equals(str) && boolZzh != null) {
                zzj().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zza(new zzon("_npa", zzb().currentTimeMillis(), Long.valueOf(boolZzh.booleanValue() ? 1L : 0L), "auto"), zzoVar);
                return;
            }
            zzj().zzc().zza("Removing user property", this.zzm.zzk().zzc(str));
            zzf().zzp();
            try {
                zza(zzoVar);
                if ("_id".equals(str)) {
                    zzf().zzh((String) Preconditions.checkNotNull(zzoVar.zza), "_lair");
                }
                zzf().zzh((String) Preconditions.checkNotNull(zzoVar.zza), str);
                zzf().zzw();
                zzj().zzc().zza("User property removed", this.zzm.zzk().zzc(str));
            } finally {
                zzf().zzu();
            }
        }
    }

    final void zza(boolean z2) {
        zzac();
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00de A[Catch: SQLiteException -> 0x01f9, all -> 0x022a, TryCatch #1 {SQLiteException -> 0x01f9, blocks: (B:138:0x00c0, B:139:0x00cf, B:143:0x00ec, B:144:0x0102, B:172:0x01a5, B:174:0x01b8, B:176:0x01be, B:177:0x01c1, B:178:0x01c4, B:180:0x01d0, B:182:0x01da, B:184:0x01e4, B:185:0x01e8, B:187:0x01f1, B:188:0x01f8, B:142:0x00de), top: B:197:0x00c0, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0117 A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:145:0x0109, B:147:0x0117, B:148:0x011b, B:150:0x0121, B:151:0x0144, B:152:0x0148, B:154:0x014e, B:155:0x0154, B:156:0x016f, B:159:0x017a, B:160:0x0181, B:162:0x0183, B:163:0x0190, B:165:0x0192, B:167:0x0196, B:170:0x019d, B:171:0x019e), top: B:196:0x0109, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x014e A[Catch: all -> 0x01f0, TRY_LEAVE, TryCatch #0 {all -> 0x01f0, blocks: (B:145:0x0109, B:147:0x0117, B:148:0x011b, B:150:0x0121, B:151:0x0144, B:152:0x0148, B:154:0x014e, B:155:0x0154, B:156:0x016f, B:159:0x017a, B:160:0x0181, B:162:0x0183, B:163:0x0190, B:165:0x0192, B:167:0x0196, B:170:0x019d, B:171:0x019e), top: B:196:0x0109, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01c4 A[Catch: SQLiteException -> 0x01f9, all -> 0x022a, TryCatch #1 {SQLiteException -> 0x01f9, blocks: (B:138:0x00c0, B:139:0x00cf, B:143:0x00ec, B:144:0x0102, B:172:0x01a5, B:174:0x01b8, B:176:0x01be, B:177:0x01c1, B:178:0x01c4, B:180:0x01d0, B:182:0x01da, B:184:0x01e4, B:185:0x01e8, B:187:0x01f1, B:188:0x01f8, B:142:0x00de), top: B:197:0x00c0, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01e8 A[Catch: SQLiteException -> 0x01f9, all -> 0x022a, TryCatch #1 {SQLiteException -> 0x01f9, blocks: (B:138:0x00c0, B:139:0x00cf, B:143:0x00ec, B:144:0x0102, B:172:0x01a5, B:174:0x01b8, B:176:0x01be, B:177:0x01c1, B:178:0x01c4, B:180:0x01d0, B:182:0x01da, B:184:0x01e4, B:185:0x01e8, B:187:0x01f1, B:188:0x01f8, B:142:0x00de), top: B:197:0x00c0, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zza(boolean r17, int r18, java.lang.Throwable r19, byte[] r20, java.lang.String r21, java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzfy.zzj, com.google.android.gms.measurement.internal.zznw>> r22) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.zza(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    public final Clock zzb() {
        return ((zzhy) Preconditions.checkNotNull(this.zzm)).zzb();
    }

    final zzje zzb(String str) {
        zzl().zzt();
        zzs();
        zzje zzjeVarZzi = this.zzac.get(str);
        if (zzjeVarZzi == null) {
            zzjeVarZzi = zzf().zzi(str);
            if (zzjeVarZzi == null) {
                zzjeVarZzi = zzje.zza;
            }
            zza(str, zzjeVarZzi);
        }
        return zzjeVarZzi;
    }

    final String zzb(zzo zzoVar) {
        try {
            return (String) zzl().zza(new zzog(this, zzoVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            zzj().zzg().zza("Failed to get app instance id. appId", zzgo.zza(zzoVar.zza), e2);
            return null;
        }
    }

    final void zzb(zzae zzaeVar) {
        zzo zzoVarZzc = zzc((String) Preconditions.checkNotNull(zzaeVar.zza));
        if (zzoVarZzc != null) {
            zzb(zzaeVar, zzoVarZzc);
        }
    }

    final void zzb(zzae zzaeVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotEmpty(zzaeVar.zza);
        Preconditions.checkNotNull(zzaeVar.zzb);
        Preconditions.checkNotNull(zzaeVar.zzc);
        Preconditions.checkNotEmpty(zzaeVar.zzc.zza);
        zzl().zzt();
        zzs();
        if (zzi(zzoVar)) {
            if (!zzoVar.zzh) {
                zza(zzoVar);
                return;
            }
            zzae zzaeVar2 = new zzae(zzaeVar);
            boolean z2 = false;
            zzaeVar2.zze = false;
            zzf().zzp();
            try {
                zzae zzaeVarZzc = zzf().zzc((String) Preconditions.checkNotNull(zzaeVar2.zza), zzaeVar2.zzc.zza);
                if (zzaeVarZzc != null && !zzaeVarZzc.zzb.equals(zzaeVar2.zzb)) {
                    zzj().zzu().zza("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzm.zzk().zzc(zzaeVar2.zzc.zza), zzaeVar2.zzb, zzaeVarZzc.zzb);
                }
                if (zzaeVarZzc != null && zzaeVarZzc.zze) {
                    zzaeVar2.zzb = zzaeVarZzc.zzb;
                    zzaeVar2.zzd = zzaeVarZzc.zzd;
                    zzaeVar2.zzh = zzaeVarZzc.zzh;
                    zzaeVar2.zzf = zzaeVarZzc.zzf;
                    zzaeVar2.zzi = zzaeVarZzc.zzi;
                    zzaeVar2.zze = zzaeVarZzc.zze;
                    zzaeVar2.zzc = new zzon(zzaeVar2.zzc.zza, zzaeVarZzc.zzc.zzb, zzaeVar2.zzc.zza(), zzaeVarZzc.zzc.zze);
                } else if (TextUtils.isEmpty(zzaeVar2.zzf)) {
                    zzaeVar2.zzc = new zzon(zzaeVar2.zzc.zza, zzaeVar2.zzd, zzaeVar2.zzc.zza(), zzaeVar2.zzc.zze);
                    z2 = true;
                    zzaeVar2.zze = true;
                }
                if (zzaeVar2.zze) {
                    zzon zzonVar = zzaeVar2.zzc;
                    zzop zzopVar = new zzop((String) Preconditions.checkNotNull(zzaeVar2.zza), zzaeVar2.zzb, zzonVar.zza, zzonVar.zzb, Preconditions.checkNotNull(zzonVar.zza()));
                    if (zzf().zza(zzopVar)) {
                        zzj().zzc().zza("User property updated immediately", zzaeVar2.zza, this.zzm.zzk().zzc(zzopVar.zzc), zzopVar.zze);
                    } else {
                        zzj().zzg().zza("(2)Too many active user properties, ignoring", zzgo.zza(zzaeVar2.zza), this.zzm.zzk().zzc(zzopVar.zzc), zzopVar.zze);
                    }
                    if (z2 && zzaeVar2.zzi != null) {
                        zzc(new zzbf(zzaeVar2.zzi, zzaeVar2.zzd), zzoVar);
                    }
                }
                if (zzf().zza(zzaeVar2)) {
                    zzj().zzc().zza("Conditional property added", zzaeVar2.zza, this.zzm.zzk().zzc(zzaeVar2.zzc.zza), zzaeVar2.zzc.zza());
                } else {
                    zzj().zzg().zza("Too many conditional properties, ignoring", zzgo.zza(zzaeVar2.zza), this.zzm.zzk().zzc(zzaeVar2.zzc.zza), zzaeVar2.zzc.zza());
                }
                zzf().zzw();
            } finally {
                zzf().zzu();
            }
        }
    }

    final void zzb(zzg zzgVar, zzfy.zzk.zza zzaVar) {
        zzl().zzt();
        zzs();
        zzfy.zza.C0181zza c0181zzaZzc = zzfy.zza.zzc();
        byte[] bArrZzav = zzgVar.zzav();
        if (bArrZzav != null) {
            try {
                c0181zzaZzc = (zzfy.zza.C0181zza) zzoo.zza(c0181zzaZzc, bArrZzav);
            } catch (com.google.android.gms.internal.measurement.zzkb unused) {
                zzj().zzu().zza("Failed to parse locally stored ad campaign info. appId", zzgo.zza(zzgVar.zzac()));
            }
        }
        for (zzfy.zzf zzfVar : zzaVar.zzaa()) {
            if (zzfVar.zzg().equals(Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                String str = (String) zzoo.zza(zzfVar, "gclid", "");
                String str2 = (String) zzoo.zza(zzfVar, "gbraid", "");
                String str3 = (String) zzoo.zza(zzfVar, "gad_source", "");
                if (!str.isEmpty() || !str2.isEmpty()) {
                    long jLongValue = ((Long) zzoo.zza(zzfVar, "click_timestamp", (Object) 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = zzfVar.zzd();
                    }
                    if ("referrer API v2".equals(zzoo.zzb(zzfVar, "_cis"))) {
                        if (jLongValue > c0181zzaZzc.zzb()) {
                            if (str.isEmpty()) {
                                c0181zzaZzc.zzh();
                            } else {
                                c0181zzaZzc.zzf(str);
                            }
                            if (str2.isEmpty()) {
                                c0181zzaZzc.zzg();
                            } else {
                                c0181zzaZzc.zze(str2);
                            }
                            if (str3.isEmpty()) {
                                c0181zzaZzc.zzf();
                            } else {
                                c0181zzaZzc.zzd(str3);
                            }
                            c0181zzaZzc.zzb(jLongValue);
                        }
                    } else if (jLongValue > c0181zzaZzc.zza()) {
                        if (str.isEmpty()) {
                            c0181zzaZzc.zze();
                        } else {
                            c0181zzaZzc.zzc(str);
                        }
                        if (str2.isEmpty()) {
                            c0181zzaZzc.zzd();
                        } else {
                            c0181zzaZzc.zzb(str2);
                        }
                        if (str3.isEmpty()) {
                            c0181zzaZzc.zzc();
                        } else {
                            c0181zzaZzc.zza(str3);
                        }
                        c0181zzaZzc.zza(jLongValue);
                    }
                }
            }
        }
        if (!((zzfy.zza) ((com.google.android.gms.internal.measurement.zzjt) c0181zzaZzc.zzai())).equals(zzfy.zza.zze())) {
            zzaVar.zza((zzfy.zza) ((com.google.android.gms.internal.measurement.zzjt) c0181zzaZzc.zzai()));
        }
        zzgVar.zza(((zzfy.zza) ((com.google.android.gms.internal.measurement.zzjt) c0181zzaZzc.zzai())).zzca());
        if (zzgVar.zzas()) {
            zzf().zza(zzgVar, false, false);
        }
    }

    /* JADX INFO: renamed from: zzb */
    public final void zza(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        String strZza;
        String strZza2;
        zzl().zzt();
        zzs();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzu = false;
                zzaa();
            }
        }
        zzj().zzp().zza("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        zzf().zzp();
        try {
            zzg zzgVarZze = zzf().zze(str);
            boolean z2 = (i2 == 200 || i2 == 204 || i2 == 304) && th == null;
            if (zzgVarZze == null) {
                zzj().zzu().zza("App does not exist in onConfigFetched. appId", zzgo.zza(str));
            } else if (z2 || i2 == 404) {
                if (zzpb.zza() && zze().zza(zzbh.zzcf)) {
                    strZza = zza(map, "Last-Modified");
                    strZza2 = zza(map, "ETag");
                } else {
                    List<String> list = map != null ? map.get("Last-Modified") : null;
                    strZza = (list == null || list.isEmpty()) ? null : list.get(0);
                    List<String> list2 = map != null ? map.get("ETag") : null;
                    strZza2 = (list2 == null || list2.isEmpty()) ? null : list2.get(0);
                }
                if (i2 == 404 || i2 == 304) {
                    if (zzi().zzc(str) == null && !zzi().zza(str, null, null, null)) {
                        return;
                    }
                } else if (!zzi().zza(str, bArr, strZza, strZza2)) {
                    return;
                }
                zzgVarZze.zzd(zzb().currentTimeMillis());
                zzf().zza(zzgVarZze, false, false);
                if (i2 == 404) {
                    zzj().zzv().zza("Config not found. Using empty config. appId", str);
                } else {
                    zzj().zzp().zza("Successfully fetched config. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                }
                if (zzh().zzu() && zzad()) {
                    zzw();
                } else if (zze().zza(zzbh.zzcb) && zzh().zzu() && zzf().zzs(zzgVarZze.zzac())) {
                    zze(zzgVarZze.zzac());
                } else {
                    zzac();
                }
            } else {
                zzgVarZze.zzm(zzb().currentTimeMillis());
                zzf().zza(zzgVarZze, false, false);
                zzj().zzp().zza("Fetching config failed. code, error", Integer.valueOf(i2), th);
                zzi().zzi(str);
                this.zzj.zze.zza(zzb().currentTimeMillis());
                if (i2 == 503 || i2 == 429) {
                    this.zzj.zzc.zza(zzb().currentTimeMillis());
                }
                zzac();
            }
            zzf().zzw();
        } finally {
            zzf().zzu();
        }
    }

    public final zzt zzc() {
        return (zzt) zza(this.zzg);
    }

    final void zzc(zzo zzoVar) throws Throwable {
        zzl().zzt();
        zzs();
        Preconditions.checkNotNull(zzoVar);
        Preconditions.checkNotEmpty(zzoVar.zza);
        if (zze().zza(zzbh.zzdc)) {
            int i2 = 0;
            if (zze().zza(zzbh.zzbj)) {
                long jCurrentTimeMillis = zzb().currentTimeMillis();
                int iZzb = zze().zzb((String) null, zzbh.zzau);
                zze();
                long jZzg = jCurrentTimeMillis - zzag.zzg();
                while (i2 < iZzb && zza((String) null, jZzg)) {
                    i2++;
                }
            } else {
                zze();
                long jZzh = zzag.zzh();
                while (i2 < jZzh && zza(zzoVar.zza, 0L)) {
                    i2++;
                }
            }
            if (zze().zza(zzbh.zzbk)) {
                zzab();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    public final zzab zzd() {
        return this.zzm.zzd();
    }

    final void zzd(zzo zzoVar) {
        int i2;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Object obj;
        long j2;
        Object obj2;
        boolean z2;
        String str;
        String strKd = C1561oA.Kd("Mbidg", (short) (C1607wl.Xd() ^ 12905));
        short sXd = (short) (FB.Xd() ^ 10485);
        short sXd2 = (short) (FB.Xd() ^ 28160);
        int[] iArr = new int["\toM\u000b".length()];
        QB qb = new QB("\toM\u000b");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i3++;
        }
        String str2 = new String(iArr, 0, i3);
        String strXd = C1561oA.Xd("`ris", (short) (OY.Xd() ^ 5421));
        String strVd = Wg.vd("\u0017\"#b\u0011\u001d\u0016#\u001b\u0014\u0012Z\u001e\f\u0018\r-1-", (short) (C1607wl.Xd() ^ 3784));
        String strKd2 = Qg.kd("0>?/", (short) (ZN.Xd() ^ 13959), (short) (ZN.Xd() ^ 26452));
        short sXd3 = (short) (C1580rY.Xd() ^ (-10683));
        short sXd4 = (short) (C1580rY.Xd() ^ (-12150));
        int[] iArr2 = new int["\\qr[".length()];
        QB qb2 = new QB("\\qr[");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(sXd3 + i4 + xuXd2.CK(iKK2) + sXd4);
            i4++;
        }
        String str3 = new String(iArr2, 0, i4);
        short sXd5 = (short) (FB.Xd() ^ 3379);
        int[] iArr3 = new int["\u001c*)\u0017 \u001aqr".length()];
        QB qb3 = new QB("\u001c*)\u0017 \u001aqr");
        int i5 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i5] = xuXd3.fK(sXd5 + i5 + xuXd3.CK(iKK3));
            i5++;
        }
        String str4 = new String(iArr3, 0, i5);
        zzl().zzt();
        zzs();
        Preconditions.checkNotNull(zzoVar);
        Preconditions.checkNotEmpty(zzoVar.zza);
        if (zzi(zzoVar)) {
            zzg zzgVarZze = zzf().zze(zzoVar.zza);
            if (zzgVarZze != null && TextUtils.isEmpty(zzgVarZze.zzah()) && !TextUtils.isEmpty(zzoVar.zzb)) {
                zzgVarZze.zzd(0L);
                zzf().zza(zzgVarZze, false, false);
                zzi().zzj(zzoVar.zza);
            }
            if (!zzoVar.zzh) {
                zza(zzoVar);
                return;
            }
            long jCurrentTimeMillis = zzoVar.zzl;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = zzb().currentTimeMillis();
            }
            this.zzm.zzg().zzt();
            int i6 = zzoVar.zzm;
            if (i6 != 0 && i6 != 1) {
                zzj().zzu().zza(C1561oA.yd("\u007f$\u0018#%$\u0016\u0013#M\u000e\u001c\u001bI\u001d!7+pc$545,'+#Z#'+K7A@86p1?>zk,:9\u0011K\u0012\u0005ESR5YOC", (short) (C1633zX.Xd() ^ (-22396))), zzgo.zza(zzoVar.zza), Integer.valueOf(i6));
                i6 = 0;
            }
            zzf().zzp();
            try {
                zzop zzopVarZze = zzf().zze(zzoVar.zza, strKd2);
                Boolean boolZzh = zzh(zzoVar);
                if (zzopVarZze != null && !C1561oA.Yd("[ppl", (short) (C1633zX.Xd() ^ (-6455))).equals(zzopVarZze.zzb)) {
                    i2 = 1;
                } else if (boolZzh != null) {
                    short sXd6 = (short) (C1499aX.Xd() ^ (-23598));
                    short sXd7 = (short) (C1499aX.Xd() ^ (-12479));
                    int[] iArr4 = new int["7GJ<".length()];
                    QB qb4 = new QB("7GJ<");
                    int i7 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i7] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd6 + i7)) + sXd7);
                        i7++;
                    }
                    i2 = 1;
                    zzon zzonVar = new zzon(new String(iArr4, 0, i7), jCurrentTimeMillis, Long.valueOf(boolZzh.booleanValue() ? 1L : 0L), Jg.Wd("e\u0002j\u007f", (short) (C1580rY.Xd() ^ (-4198)), (short) (C1580rY.Xd() ^ (-9980))));
                    if (zzopVarZze == null || !zzopVarZze.zze.equals(zzonVar.zzc)) {
                        zza(zzonVar, zzoVar);
                    }
                } else {
                    i2 = 1;
                    if (zzopVarZze != null) {
                        zza(strKd2, zzoVar);
                    }
                }
                zzg zzgVarZze2 = zzf().zze((String) Preconditions.checkNotNull(zzoVar.zza));
                if (zzgVarZze2 != null) {
                    zzq();
                    if (zzos.zza(zzoVar.zzb, zzgVarZze2.zzah(), zzoVar.zzp, zzgVarZze2.zzaa())) {
                        zzj().zzu().zza(ZO.xd("`Hf#\u0010OisC\u001d{\u0004Z4T\u0011\u0007\f\u0019KS*>\u001e_L#\u000b$M-\u0006\u001c+\u0018\u001aCjjb`\u001d6T]c;jd/o\r\rS\n%0K,' 2", (short) (C1607wl.Xd() ^ 14432), (short) (C1607wl.Xd() ^ 9931)), zzgo.zza(zzgVarZze2.zzac()));
                        zzal zzalVarZzf = zzf();
                        String strZzac = zzgVarZze2.zzac();
                        zzalVarZzf.zzal();
                        zzalVarZzf.zzt();
                        Preconditions.checkNotEmpty(strZzac);
                        try {
                            SQLiteDatabase sQLiteDatabaseE_ = zzalVarZzf.e_();
                            String[] strArr = new String[i2];
                            strArr[0] = strZzac;
                            int iDelete = sQLiteDatabaseE_.delete(C1626yg.Ud("c/B\u0018+\u001a", (short) (C1633zX.Xd() ^ (-25542)), (short) (C1633zX.Xd() ^ (-24609))), str4, strArr) + sQLiteDatabaseE_.delete(Ig.wd("\u0005SS\u0005\u001261*H\u0004~0_FT", (short) (ZN.Xd() ^ 30833)), str4, strArr) + sQLiteDatabaseE_.delete(EO.Od("D\u001b,EBz?]'z\u0004X84)\tRU P\u0007m", (short) (ZN.Xd() ^ 18093)), str4, strArr);
                            short sXd8 = (short) (Od.Xd() ^ (-14446));
                            int[] iArr5 = new int["\u0012 \u001f!".length()];
                            QB qb5 = new QB("\u0012 \u001f!");
                            int i8 = 0;
                            while (qb5.YK()) {
                                int iKK5 = qb5.KK();
                                Xu xuXd5 = Xu.Xd(iKK5);
                                iArr5[i8] = xuXd5.fK(sXd8 + sXd8 + sXd8 + i8 + xuXd5.CK(iKK5));
                                i8++;
                            }
                            int iDelete2 = iDelete + sQLiteDatabaseE_.delete(new String(iArr5, 0, i8), str4, strArr) + sQLiteDatabaseE_.delete(C1593ug.zd("\u0012\u0002\u0019\u0002\t\u001b\u000b\u0015\u001c\u001c", (short) (OY.Xd() ^ 25147), (short) (OY.Xd() ^ 11460)), str4, strArr) + sQLiteDatabaseE_.delete(C1561oA.od("\rz\u0010v{\fy\u0002\u0007\u0005o|s\u0002mok}i", (short) (OY.Xd() ^ 13727)), str4, strArr) + sQLiteDatabaseE_.delete(C1561oA.Kd("y\f{\u0006\rx\u0001\u0005\t\u0012\u0004\u0012\u0014", (short) (C1580rY.Xd() ^ (-21480))), str4, strArr) + sQLiteDatabaseE_.delete(Wg.Zd("^o\u00042Pz\u0004&5i\u0004$ESw&", (short) (ZN.Xd() ^ 1386), (short) (ZN.Xd() ^ 8274)), str4, strArr) + sQLiteDatabaseE_.delete(C1561oA.Xd("q\u0007v|y\u0004y|w\u007f\u0004\b\u0011\u0003\u0011~\u0017\u0003\u000f\u0019\n\u0019", (short) (C1633zX.Xd() ^ (-27208))), str4, strArr);
                            short sXd9 = (short) (C1499aX.Xd() ^ (-18181));
                            int[] iArr6 = new int["\f\u0019\u0019\u001f\u0012\u001c#\u000f\u0014\u0007\u0017\u0018\u000e\u0014\u000e\u001b".length()];
                            QB qb6 = new QB("\f\u0019\u0019\u001f\u0012\u001c#\u000f\u0014\u0007\u0017\u0018\u000e\u0014\u000e\u001b");
                            int i9 = 0;
                            while (qb6.YK()) {
                                int iKK6 = qb6.KK();
                                Xu xuXd6 = Xu.Xd(iKK6);
                                iArr6[i9] = xuXd6.fK((sXd9 ^ i9) + xuXd6.CK(iKK6));
                                i9++;
                            }
                            int iDelete3 = iDelete2 + sQLiteDatabaseE_.delete(new String(iArr6, 0, i9), str4, strArr);
                            short sXd10 = (short) (FB.Xd() ^ 5997);
                            short sXd11 = (short) (FB.Xd() ^ 20892);
                            int[] iArr7 = new int["AAA;NDK5:J8@E/?/?-8=".length()];
                            QB qb7 = new QB("AAA;NDK5:J8@E/?/?-8=");
                            int i10 = 0;
                            while (qb7.YK()) {
                                int iKK7 = qb7.KK();
                                Xu xuXd7 = Xu.Xd(iKK7);
                                iArr7[i10] = xuXd7.fK(((sXd10 + i10) + xuXd7.CK(iKK7)) - sXd11);
                                i10++;
                            }
                            int iDelete4 = iDelete3 + sQLiteDatabaseE_.delete(new String(iArr7, 0, i10), str4, strArr) + sQLiteDatabaseE_.delete(hg.Vd("a^TQPMYEZVLU", (short) (ZN.Xd() ^ 28044), (short) (ZN.Xd() ^ 1415)), str4, strArr);
                            if (iDelete4 > 0) {
                                zzalVarZzf.zzj().zzp().zza(C1561oA.ud("\\|\u0003z\txv1q\u007f~yunk}qvt%hdvb.\u001f_ml'\u001ak]ZegXf", (short) (Od.Xd() ^ (-29082))), strZzac, Integer.valueOf(iDelete4));
                            }
                        } catch (SQLiteException e2) {
                            zzalVarZzf.zzj().zzg().zza(C1561oA.yd("\u007f,+'1]!!/'5)5-d%\u001b\u001a\u0015\u0011\u0012\u000f!\u0015\" P\u0014\u0018*\u0016a:z\t\bg\u0002H;\b\u0014\u0013\u000f\u0019", (short) (C1499aX.Xd() ^ (-9249))), zzgo.zza(strZzac), e2);
                        }
                        zzgVarZze2 = null;
                    }
                }
                if (zzgVarZze2 != null) {
                    int i11 = (zzgVarZze2.zze() == -2147483648L || zzgVarZze2.zze() == zzoVar.zzj) ? 0 : 1;
                    String strZzaf = zzgVarZze2.zzaf();
                    if ((-1) - (((-1) - i11) & ((-1) - ((zzgVarZze2.zze() != -2147483648L || strZzaf == null || strZzaf.equals(zzoVar.zzc)) ? 0 : 1))) != 0) {
                        Bundle bundle = new Bundle();
                        bundle.putString(C1561oA.Yd("EW^", (short) (C1633zX.Xd() ^ (-3040))), strZzaf);
                        zza(new zzbf(Xg.qd("FI^", (short) (C1633zX.Xd() ^ (-18990)), (short) (C1633zX.Xd() ^ (-31978))), new zzbe(bundle), Jg.Wd("f%+X", (short) (C1607wl.Xd() ^ 32499), (short) (C1607wl.Xd() ^ 14700)), jCurrentTimeMillis), zzoVar);
                    }
                }
                zza(zzoVar);
                if ((i6 == 0 ? zzf().zzd(zzoVar.zza, ZO.xd("\n~", (short) (C1580rY.Xd() ^ (-24334)), (short) (C1580rY.Xd() ^ (-9765)))) : i6 == 1 ? zzf().zzd(zzoVar.zza, C1626yg.Ud("5\u007f", (short) (ZN.Xd() ^ 18131), (short) (ZN.Xd() ^ 1009))) : null) == null) {
                    long j3 = ((jCurrentTimeMillis / 3600000) + 1) * 3600000;
                    String strWd = Ig.wd("p#\u0012l", (short) (C1580rY.Xd() ^ (-32163)));
                    String strOd = EO.Od("#RS", (short) (C1499aX.Xd() ^ (-19287)));
                    String strQd = C1561oA.Qd("DV", (short) (OY.Xd() ^ 13415));
                    String strZd = C1593ug.zd("{\u0001", (short) (C1580rY.Xd() ^ (-20267)), (short) (C1580rY.Xd() ^ (-13053)));
                    if (i6 == 0) {
                        zza(new zzon(C1561oA.od("\u0007\r\u0015\u0019", (short) (OY.Xd() ^ 27786)), jCurrentTimeMillis, Long.valueOf(j3), C1561oA.Kd("!662", (short) (C1633zX.Xd() ^ (-9212)))), zzoVar);
                        zzl().zzt();
                        zzhf zzhfVar = (zzhf) Preconditions.checkNotNull(this.zzl);
                        String str5 = zzoVar.zza;
                        if (str5 == null || str5.isEmpty()) {
                            zzhfVar.zza.zzj().zzw().zza(C1593ug.zd(",RXZHTU\n=QSSabVd\u0013FZffjm_m\u001ct_r dcopjj'\u007fr~s,v|\u0006q}{w4v\u0007\b8\n{~\b~\u0006\u0005@\u0010\u0004\u0011\n", (short) (C1580rY.Xd() ^ (-9392)), (short) (C1580rY.Xd() ^ (-22232))));
                        } else {
                            zzhfVar.zza.zzl().zzt();
                            if (zzhfVar.zza()) {
                                zzhi zzhiVar = new zzhi(zzhfVar, str5);
                                zzhfVar.zza.zzl().zzt();
                                short sXd12 = (short) (ZN.Xd() ^ 3456);
                                int[] iArr8 = new int[";HG\tCLMFLF\u0010DRIXVQM\u0018QU[aZi\u001f4<B9U>=MYDJPR@LMaUIKKYZN\\j_R`eYTW".length()];
                                QB qb8 = new QB(";HG\tCLMFLF\u0010DRIXVQM\u0018QU[aZi\u001f4<B9U>=MYDJPR@LMaUIKKYZN\\j_R`eYTW");
                                int i12 = 0;
                                while (qb8.YK()) {
                                    int iKK8 = qb8.KK();
                                    Xu xuXd8 = Xu.Xd(iKK8);
                                    iArr8[i12] = xuXd8.fK(xuXd8.CK(iKK8) - (sXd12 + i12));
                                    i12++;
                                }
                                Intent intent = new Intent(new String(iArr8, 0, i12));
                                intent.setComponent(new ComponentName(strVd, Wg.vd("}\u000b\u0006G\u0006\u000f\f\u0005~x>r\u0005{\u0007\u0005\u0014\u0010V\u0010\u0018\u001e \u0019\u001cQ\u0006\u001a\u001b\r\u0017\u0014[gj^ddnoWe\u001e8[k=c}\u007fiuzaqsgurfxZiwQE<?", (short) (C1633zX.Xd() ^ (-9186)))));
                                Context contextZza = zzhfVar.zza.zza();
                                Object[] objArr = new Object[0];
                                Method method = Class.forName(Qg.kd("\u000f\u001b\u0010\u001d\u0019\u0012\fT\t\u0014\u0012\u0017\u0007\u000f\u0014L`\f\n\u000f~\u0011\f", (short) (C1499aX.Xd() ^ (-21780)), (short) (C1499aX.Xd() ^ (-24721)))).getMethod(hg.Vd("\t\u0006\u0014n~\u007f\u0007{\u0001}dw\u0004uzw\u0004", (short) (C1580rY.Xd() ^ (-8635)), (short) (C1580rY.Xd() ^ (-32232))), new Class[0]);
                                try {
                                    method.setAccessible(true);
                                    PackageManager packageManager = (PackageManager) method.invoke(contextZza, objArr);
                                    if (packageManager == null) {
                                        zzhfVar.zza.zzj().zzw().zza(C1561oA.ud("@Zac[Y\u0014ga\u0011_QbNUY\n9IJQFKH\u0002.AM?DAMyMGvL:F<8Jo17;0480g*53(,6*/-1\\\"*,X\u0001%))\u0015\u001f\u001eP\u0002\u0014\u0014\u0012\u001e\u001d\u000f\u001b", (short) (C1607wl.Xd() ^ 30561)));
                                    } else {
                                        Class<?> cls = Class.forName(C1561oA.yd("&4'683+u -)0&03m%#`\u0004\u001a\u001d\"\u0019\u0014\u0013w\r\u001f\u0013\u0016\u0015W", (short) (C1633zX.Xd() ^ (-12463))));
                                        Class<?>[] clsArr = new Class[2];
                                        short sXd13 = (short) (OY.Xd() ^ 15295);
                                        int[] iArr9 = new int["\u001d+\"1/*&p'44;-7>x\u0015;B4>E".length()];
                                        QB qb9 = new QB("\u001d+\"1/*&p'44;-7>x\u0015;B4>E");
                                        int i13 = 0;
                                        while (qb9.YK()) {
                                            int iKK9 = qb9.KK();
                                            Xu xuXd9 = Xu.Xd(iKK9);
                                            iArr9[i13] = xuXd9.fK(xuXd9.CK(iKK9) - (((sXd13 + sXd13) + sXd13) + i13));
                                            i13++;
                                        }
                                        clsArr[0] = Class.forName(new String(iArr9, 0, i13));
                                        clsArr[1] = Integer.TYPE;
                                        Object[] objArr2 = {intent, 0};
                                        Method method2 = cls.getMethod(Xg.qd("\u0005\nz\t\u0011a\b\u000f\u0001\u000b\u0012q\u0005\u0013\u0018\f\u0007\n\u0019", (short) (C1499aX.Xd() ^ (-8475)), (short) (C1499aX.Xd() ^ (-6806))), clsArr);
                                        try {
                                            method2.setAccessible(true);
                                            List list = (List) method2.invoke(packageManager, objArr2);
                                            if (list == null || list.isEmpty()) {
                                                zzgq zzgqVarZzo = zzhfVar.zza.zzj().zzo();
                                                short sXd14 = (short) (ZN.Xd() ^ 17204);
                                                int[] iArr10 = new int["\f'\u001b2W\n\u001b'*\u001c\u0015\u0016O\u0015\u001d\u001fK\u0011\u000f\u001d\u000b\u000f\u000f\u0013\u000bBj\u000f\u0013\u0013~\t\b:k}}{\b\u0007x\u00051y\u0003.\u0003zl\u0001jqsggph\"pn\u001fbbrd]^".length()];
                                                QB qb10 = new QB("\f'\u001b2W\n\u001b'*\u001c\u0015\u0016O\u0015\u001d\u001fK\u0011\u000f\u001d\u000b\u000f\u000f\u0013\u000bBj\u000f\u0013\u0013~\t\b:k}}{\b\u0007x\u00051y\u0003.\u0003zl\u0001jqsggph\"pn\u001fbbrd]^");
                                                int i14 = 0;
                                                while (qb10.YK()) {
                                                    int iKK10 = qb10.KK();
                                                    Xu xuXd10 = Xu.Xd(iKK10);
                                                    iArr10[i14] = xuXd10.fK(sXd14 + sXd14 + sXd14 + i14 + xuXd10.CK(iKK10));
                                                    i14++;
                                                }
                                                zzgqVarZzo.zza(new String(iArr10, 0, i14));
                                            } else {
                                                ResolveInfo resolveInfo = (ResolveInfo) list.get(0);
                                                if (resolveInfo.serviceInfo != null) {
                                                    String str6 = resolveInfo.serviceInfo.packageName;
                                                    if (resolveInfo.serviceInfo.name != null && strVd.equals(str6) && zzhfVar.zza()) {
                                                        try {
                                                            boolean zBindService = ConnectionTracker.getInstance().bindService(zzhfVar.zza.zza(), new Intent(intent), zzhiVar, 1);
                                                            zzgq zzgqVarZzp = zzhfVar.zza.zzj().zzp();
                                                            String strWd2 = Jg.Wd("\u001d\u0003DE^\u0016f6`w%D.Fm\u0007\u001cs^\b@;i\u0004ZHz", (short) (ZN.Xd() ^ 19222), (short) (ZN.Xd() ^ 29620));
                                                            if (zBindService) {
                                                                str = ZO.xd("k9T.\u0001i^]$", (short) (C1633zX.Xd() ^ (-21534)), (short) (C1633zX.Xd() ^ (-16683)));
                                                            } else {
                                                                short sXd15 = (short) (C1499aX.Xd() ^ (-3003));
                                                                short sXd16 = (short) (C1499aX.Xd() ^ (-27295));
                                                                int[] iArr11 = new int["f\u001bz\u001c=9HA\"2gjM".length()];
                                                                QB qb11 = new QB("f\u001bz\u001c=9HA\"2gjM");
                                                                int i15 = 0;
                                                                while (qb11.YK()) {
                                                                    int iKK11 = qb11.KK();
                                                                    Xu xuXd11 = Xu.Xd(iKK11);
                                                                    iArr11[i15] = xuXd11.fK((C1561oA.Xd[i15 % C1561oA.Xd.length] ^ ((sXd15 + sXd15) + (i15 * sXd16))) + xuXd11.CK(iKK11));
                                                                    i15++;
                                                                }
                                                                str = new String(iArr11, 0, i15);
                                                            }
                                                            zzgqVarZzp.zza(strWd2, str);
                                                        } catch (RuntimeException e3) {
                                                            zzhfVar.zza.zzj().zzg().zza(Ig.wd("ali\u0003\u000fN\u001f\u0015A\u0002Wi7STq<!4S\u0002Nc\\0\u001f\u00044\u0018jK\"Fhkidmu\u0005uP\"C#&1_ZBU>\u007fJ&\u0003\u0001Aky", (short) (OY.Xd() ^ 24879)), e3.getMessage());
                                                        }
                                                    } else {
                                                        zzhfVar.zza.zzj().zzu().zza(EO.Od("2\u0007\u001eU\u0004laTz!QNl{\u001d8s\u0005N.f8\t\u000e\\EwG>yN3\u0014srf\u0014bs\nyk\u0005\u001e[6#~y\u0004\u0001Z7tFZ\u0010\\:ADkH)~", (short) (FB.Xd() ^ 29924)));
                                                    }
                                                }
                                            }
                                        } catch (InvocationTargetException e4) {
                                            throw e4.getCause();
                                        }
                                    }
                                } catch (InvocationTargetException e5) {
                                    throw e5.getCause();
                                }
                            } else {
                                zzhfVar.zza.zzj().zzo().zza(Wg.Zd("|f\u0019\u0003\u001d\u0019Fb@\u0001b\u000f\u00052\u0016N)D\u0005\u0011=)V4rM\u007f7D>,Z3e({/\u001f\u0015\u00036\\", (short) (Od.Xd() ^ (-7883)), (short) (Od.Xd() ^ (-5177))));
                            }
                        }
                        zzl().zzt();
                        zzs();
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong(strZd, 1L);
                        bundle2.putLong(strQd, 1L);
                        bundle2.putLong(str3, 0L);
                        bundle2.putLong(strXd, 0L);
                        bundle2.putLong(str2, 0L);
                        bundle2.putLong(strKd, 0L);
                        bundle2.putLong(strOd, 1L);
                        if (zzoVar.zzo) {
                            bundle2 = bundle2;
                            bundle2.putLong(strWd, 1L);
                        }
                        String str7 = (String) Preconditions.checkNotNull(zzoVar.zza);
                        zzal zzalVarZzf2 = zzf();
                        Preconditions.checkNotEmpty(str7);
                        zzalVarZzf2.zzt();
                        zzalVarZzf2.zzal();
                        short sXd17 = (short) (FB.Xd() ^ 8881);
                        int[] iArr12 = new int["*,444\u001e--!)\u0019\u001c',$)".length()];
                        QB qb12 = new QB("*,444\u001e--!)\u0019\u001c',$)");
                        int i16 = 0;
                        while (qb12.YK()) {
                            int iKK12 = qb12.KK();
                            Xu xuXd12 = Xu.Xd(iKK12);
                            iArr12[i16] = xuXd12.fK(sXd17 + sXd17 + i16 + xuXd12.CK(iKK12));
                            i16++;
                        }
                        long jZzb = zzalVarZzf2.zzb(str7, new String(iArr12, 0, i16));
                        Context contextZza2 = this.zzm.zza();
                        short sXd18 = (short) (ZN.Xd() ^ 18114);
                        int[] iArr13 = new int["*8/><73}4AAH:DK\u0006\u001cIIPBVS".length()];
                        QB qb13 = new QB("*8/><73}4AAH:DK\u0006\u001cIIPBVS");
                        int i17 = 0;
                        while (qb13.YK()) {
                            int iKK13 = qb13.KK();
                            Xu xuXd13 = Xu.Xd(iKK13);
                            iArr13[i17] = xuXd13.fK(xuXd13.CK(iKK13) - ((sXd18 + sXd18) + i17));
                            i17++;
                        }
                        Class<?> cls2 = Class.forName(new String(iArr13, 0, i17));
                        Class<?>[] clsArr2 = new Class[0];
                        Object[] objArr3 = new Object[0];
                        short sXd19 = (short) (C1607wl.Xd() ^ 30358);
                        short sXd20 = (short) (C1607wl.Xd() ^ OlympusImageProcessingMakernoteDirectory.TagKeystoneValue);
                        int[] iArr14 = new int["Ot\u001dk\b<>FSke\u0005\u0001-%+R".length()];
                        QB qb14 = new QB("Ot\u001dk\b<>FSke\u0005\u0001-%+R");
                        int i18 = 0;
                        while (qb14.YK()) {
                            int iKK14 = qb14.KK();
                            Xu xuXd14 = Xu.Xd(iKK14);
                            iArr14[i18] = xuXd14.fK(((i18 * sXd20) ^ sXd19) + xuXd14.CK(iKK14));
                            i18++;
                        }
                        Method method3 = cls2.getMethod(new String(iArr14, 0, i18), clsArr2);
                        try {
                            method3.setAccessible(true);
                            if (((PackageManager) method3.invoke(contextZza2, objArr3)) == null) {
                                zzj().zzg().zza(C1561oA.Xd("|\u000f\u0012\u001b\u0012\u0019\u0018\u0001\u0016$\u0018\u001f\u001e,Z%0]-5-.nc+/9;=i:<2<nB6BBFIuDA@BO{?C~IOCFGZXH\\N\u0018\u000bM]^8T", (short) (C1633zX.Xd() ^ (-1246))), zzgo.zza(str7));
                            } else {
                                try {
                                    packageInfo = Wrappers.packageManager(this.zzm.zza()).getPackageInfo(str7, 0);
                                } catch (PackageManager.NameNotFoundException e6) {
                                    zzj().zzg().zza(Wg.vd("dty\u0001qvw1\u0006\n\u0005\r8\u0001\u000e9rxrq,\u001fhj~~\u0003-wwowT&\u001c& \"'Q*%&&-W\u001d\u001fD\r\u0015\u0007\u0004\u0003\u0018\u0014\u000e \u0014[H\t\u001b\u001a\u001e8", (short) (C1499aX.Xd() ^ (-6394))), zzgo.zza(str7), e6);
                                    packageInfo = null;
                                }
                                if (packageInfo != null && packageInfo.firstInstallTime != 0) {
                                    if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                        if (!zze().zza(zzbh.zzbs) || jZzb == 0) {
                                            bundle2.putLong(str3, 1L);
                                        }
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    zza(new zzon(Qg.kd("ntv", (short) (ZN.Xd() ^ 15049), (short) (ZN.Xd() ^ 29121)), jCurrentTimeMillis, Long.valueOf(z2 ? 1L : 0L), hg.Vd("7JHB", (short) (C1633zX.Xd() ^ (-13522)), (short) (C1633zX.Xd() ^ (-17772)))), zzoVar);
                                }
                                try {
                                    applicationInfo = Wrappers.packageManager(this.zzm.zza()).getApplicationInfo(str7, 0);
                                } catch (PackageManager.NameNotFoundException e7) {
                                    zzj().zzg().zza(C1561oA.ud("@nmhd]Zl`ec\u0014\\`W_\u000fW`\fY_UT\u0013\u0006KMUUU\u007fNNBJzL>HFHIs@;88Cm/1j37)*):6$6&m^\u001f-,\u0004\u001e", (short) (FB.Xd() ^ 18179)), zzgo.zza(str7), e7);
                                    applicationInfo = null;
                                }
                                if (applicationInfo != null) {
                                    String strYd = C1561oA.yd("O]P_YTL\u0017YfbiWad\u001fnl*>jkdbihxnqqIo4>", (short) (FB.Xd() ^ 11349));
                                    String strYd2 = C1561oA.Yd("=D:AN", (short) (FB.Xd() ^ 14379));
                                    try {
                                        Class<?> cls3 = Class.forName(strYd);
                                        Field field = 1 != 0 ? cls3.getField(strYd2) : cls3.getDeclaredField(strYd2);
                                        field.setAccessible(true);
                                        obj = field.get(applicationInfo);
                                    } catch (Throwable th) {
                                        obj = null;
                                    }
                                    if ((-1) - (((-1) - ((Integer) obj).intValue()) | ((-1) - 1)) != 0) {
                                        j2 = 1;
                                        bundle2.putLong(str2, 1L);
                                    } else {
                                        j2 = 1;
                                    }
                                    String strQd2 = Xg.qd("DRIXVQM\u0018N[[bT^e ca#7ghec^]qgnnJpis", (short) (C1580rY.Xd() ^ (-11739)), (short) (C1580rY.Xd() ^ (-24952)));
                                    String strWd3 = Jg.Wd(")z?\u0011h", (short) (C1633zX.Xd() ^ (-9484)), (short) (C1633zX.Xd() ^ (-11377)));
                                    try {
                                        Class<?> cls4 = Class.forName(strQd2);
                                        Field field2 = 1 != 0 ? cls4.getField(strWd3) : cls4.getDeclaredField(strWd3);
                                        field2.setAccessible(true);
                                        obj2 = field2.get(applicationInfo);
                                    } catch (Throwable th2) {
                                        obj2 = null;
                                    }
                                    if ((-1) - (((-1) - ((Integer) obj2).intValue()) | ((-1) - 128)) != 0) {
                                        bundle2.putLong(strKd, j2);
                                    }
                                }
                            }
                            if (jZzb >= 0) {
                                bundle2.putLong(strXd, jZzb);
                            }
                            zzb(new zzbf(ZO.xd("0!", (short) (Od.Xd() ^ (-31111)), (short) (Od.Xd() ^ (-6801))), new zzbe(bundle2), C1626yg.Ud("L1}l", (short) (ZN.Xd() ^ 10087), (short) (ZN.Xd() ^ 2173)), jCurrentTimeMillis), zzoVar);
                        } catch (InvocationTargetException e8) {
                            throw e8.getCause();
                        }
                    } else if (i6 == 1) {
                        zza(new zzon(Ig.wd("d1Sq", (short) (OY.Xd() ^ 30572)), jCurrentTimeMillis, Long.valueOf(j3), EO.Od("B\u00101L", (short) (C1607wl.Xd() ^ 14381))), zzoVar);
                        zzl().zzt();
                        zzs();
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong(strZd, 1L);
                        bundle3.putLong(strQd, 1L);
                        bundle3.putLong(strOd, 1L);
                        if (zzoVar.zzo) {
                            bundle3 = bundle3;
                            bundle3.putLong(strWd, 1L);
                        }
                        zzb(new zzbf(C1561oA.Qd("]s", (short) (FB.Xd() ^ 9509)), new zzbe(bundle3), C1593ug.zd("\u0011&&\"", (short) (ZN.Xd() ^ 2755), (short) (ZN.Xd() ^ 10261)), jCurrentTimeMillis), zzoVar);
                    }
                } else if (zzoVar.zzi) {
                    Bundle bundle4 = new Bundle();
                    short sXd21 = (short) (C1499aX.Xd() ^ (-28252));
                    int[] iArr15 = new int["*--".length()];
                    QB qb15 = new QB("*--");
                    int i19 = 0;
                    while (qb15.YK()) {
                        int iKK15 = qb15.KK();
                        Xu xuXd15 = Xu.Xd(iKK15);
                        iArr15[i19] = xuXd15.fK(sXd21 + sXd21 + i19 + xuXd15.CK(iKK15));
                        i19++;
                    }
                    String str8 = new String(iArr15, 0, i19);
                    zzbe zzbeVar = new zzbe(bundle4);
                    short sXd22 = (short) (C1580rY.Xd() ^ (-6852));
                    int[] iArr16 = new int["Wllh".length()];
                    QB qb16 = new QB("Wllh");
                    int i20 = 0;
                    while (qb16.YK()) {
                        int iKK16 = qb16.KK();
                        Xu xuXd16 = Xu.Xd(iKK16);
                        iArr16[i20] = xuXd16.fK(xuXd16.CK(iKK16) - ((sXd22 + sXd22) + i20));
                        i20++;
                    }
                    zzb(new zzbf(str8, zzbeVar, new String(iArr16, 0, i20), jCurrentTimeMillis), zzoVar);
                }
                zzf().zzw();
            } finally {
                zzf().zzu();
            }
        }
    }

    public final zzag zze() {
        return ((zzhy) Preconditions.checkNotNull(this.zzm)).zzf();
    }

    final void zze(zzo zzoVar) {
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzaa = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzal zzalVarZzf = zzf();
        String str = (String) Preconditions.checkNotNull(zzoVar.zza);
        Preconditions.checkNotEmpty(str);
        zzalVarZzf.zzt();
        zzalVarZzf.zzal();
        try {
            SQLiteDatabase sQLiteDatabaseE_ = zzalVarZzf.e_();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseE_.delete("apps", "app_id=?", strArr) + sQLiteDatabaseE_.delete("events", "app_id=?", strArr) + sQLiteDatabaseE_.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseE_.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseE_.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseE_.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseE_.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseE_.delete("queue", "app_id=?", strArr) + sQLiteDatabaseE_.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseE_.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseE_.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseE_.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseE_.delete("upload_queue", "app_id=?", strArr);
            if (iDelete > 0) {
                zzalVarZzf.zzj().zzp().zza("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e2) {
            zzalVarZzf.zzj().zzg().zza("Error resetting analytics data. appId, error", zzgo.zza(str), e2);
        }
        if (zzoVar.zzh) {
            zzd(zzoVar);
        }
    }

    public final zzal zzf() {
        return (zzal) zza(this.zzd);
    }

    final void zzf(zzo zzoVar) {
        zzl().zzt();
        zzs();
        Preconditions.checkNotEmpty(zzoVar.zza);
        zzax zzaxVarZza = zzax.zza(zzoVar.zzz);
        zzj().zzp().zza("Setting DMA consent for package", zzoVar.zza, zzaxVarZza);
        String str = zzoVar.zza;
        zzl().zzt();
        zzs();
        zzjh zzjhVarZzc = zzax.zza(zza(str), 100).zzc();
        this.zzad.put(str, zzaxVarZza);
        zzf().zza(str, zzaxVarZza);
        zzjh zzjhVarZzc2 = zzax.zza(zza(str), 100).zzc();
        zzl().zzt();
        zzs();
        boolean z2 = true;
        boolean z3 = zzjhVarZzc == zzjh.DENIED && zzjhVarZzc2 == zzjh.GRANTED;
        boolean z4 = zzjhVarZzc == zzjh.GRANTED && zzjhVarZzc2 == zzjh.DENIED;
        if (zze().zza(zzbh.zzcq)) {
            if (!z3 && !z4) {
                z2 = false;
            }
            z3 = z2;
        }
        if (z3) {
            zzj().zzp().zza("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (zzf().zza(zzx(), str, false, false, false, false, false, false, false).zzf < zze().zzb(str, zzbh.zzay)) {
                bundle.putLong("_r", 1L);
                zzj().zzp().zza("_dcu realtime event count", str, Long.valueOf(zzf().zza(zzx(), str, false, false, false, false, false, true, false).zzf));
            }
            this.zzah.zza(str, "_dcu", bundle);
        }
    }

    public final zzgh zzg() {
        return this.zzm.zzk();
    }

    final void zzg(zzo zzoVar) {
        zzl().zzt();
        zzs();
        Preconditions.checkNotEmpty(zzoVar.zza);
        zzje zzjeVarZza = zzje.zza(zzoVar.zzt, zzoVar.zzy);
        zzje zzjeVarZzb = zzb(zzoVar.zza);
        zzj().zzp().zza("Setting storage consent for package", zzoVar.zza, zzjeVarZza);
        zza(zzoVar.zza, zzjeVarZza);
        if (!(com.google.android.gms.internal.measurement.zznm.zza() && zze().zza(zzbh.zzcy)) && zzjeVarZza.zzc(zzjeVarZzb)) {
            zze(zzoVar);
        }
    }

    public final zzgr zzh() {
        return (zzgr) zza(this.zzc);
    }

    public final zzhl zzi() {
        return (zzhl) zza(this.zzb);
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    public final zzgo zzj() {
        return ((zzhy) Preconditions.checkNotNull(this.zzm)).zzj();
    }

    final zzhy zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    public final zzhv zzl() {
        return ((zzhy) Preconditions.checkNotNull(this.zzm)).zzl();
    }

    public final zzli zzm() {
        return (zzli) zza(this.zzi);
    }

    public final zzmw zzn() {
        return this.zzj;
    }

    public final zznu zzo() {
        return this.zzk;
    }

    public final zzoo zzp() {
        return (zzoo) zza(this.zzh);
    }

    public final zzos zzq() {
        return ((zzhy) Preconditions.checkNotNull(this.zzm)).zzt();
    }

    final void zzr() {
        zzl().zzt();
        zzs();
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        if (zzae()) {
            int iZza = zza(this.zzy);
            int iZzab = this.zzm.zzh().zzab();
            zzl().zzt();
            if (iZza > iZzab) {
                zzj().zzg().zza("Panic: can't downgrade version. Previous, current version", Integer.valueOf(iZza), Integer.valueOf(iZzab));
            } else if (iZza < iZzab) {
                if (zza(iZzab, this.zzy)) {
                    zzj().zzp().zza("Storage version upgraded. Previous, current version", Integer.valueOf(iZza), Integer.valueOf(iZzab));
                } else {
                    zzj().zzg().zza("Storage version upgrade failed. Previous, current version", Integer.valueOf(iZza), Integer.valueOf(iZzab));
                }
            }
        }
    }

    final void zzs() {
        if (!this.zzn) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzt() {
        this.zzt++;
    }

    final void zzu() {
        this.zzs++;
    }

    protected final void zzv() {
        int iDelete;
        zzl().zzt();
        zzf().zzv();
        zzal zzalVarZzf = zzf();
        zzalVarZzf.zzt();
        zzalVarZzf.zzal();
        if (zzalVarZzf.zzaa() && zzbh.zzbh.zza(null).longValue() != 0 && (iDelete = zzalVarZzf.e_().delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(zzalVarZzf.zzb().currentTimeMillis()), String.valueOf(zzbh.zzbh.zza(null))})) > 0) {
            zzalVarZzf.zzj().zzp().zza("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
        }
        if (this.zzj.zzd.zza() == 0) {
            this.zzj.zzd.zza(zzb().currentTimeMillis());
        }
        zzac();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:414:0x04be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzw() {
        /*
            Method dump skipped, instruction units count: 1555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.zzw():void");
    }
}
