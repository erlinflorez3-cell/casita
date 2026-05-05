package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.play.core.splitinstall.internal.zzah;
import com.google.android.play.core.splitinstall.internal.zzak;
import com.google.android.play.core.splitinstall.internal.zzam;
import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzao;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.zzbe;
import com.google.android.play.core.splitinstall.zzx;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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

/* JADX INFO: loaded from: classes9.dex */
public class SplitCompat {
    public static final /* synthetic */ int zza = 0;
    private static final AtomicReference zzb = new AtomicReference(null);
    private final zze zzc;
    private final zzbe zzd;
    private final Set zze = new HashSet();
    private final zza zzf;

    private SplitCompat(Context context) {
        try {
            zze zzeVar = new zze(context);
            this.zzc = zzeVar;
            this.zzf = new zza(zzeVar);
            this.zzd = new zzbe(context);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new zzbh("Failed to initialize FileStorage", e2);
        }
    }

    public static boolean install(Context context) {
        return zzi(context, false);
    }

    public static boolean installActivity(Context context) throws Throwable {
        if (zzj()) {
            return false;
        }
        SplitCompat splitCompat = (SplitCompat) zzb.get();
        if (splitCompat != null) {
            return splitCompat.zzf.zzb(context, splitCompat.zzf());
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("<JAPNIE\u0010FSSZLV]\u0018.[[bThe", (short) (OY.Xd() ^ 11313), (short) (OY.Xd() ^ IDStepResponseCodes.STEP_RESULT_DOCUMENT_MAX_LOCAL_ATTEMPS))).getMethod(C1561oA.od("a^l8fe`\\URdX][/ZX]M_Z", (short) (C1607wl.Xd() ^ 32255)), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Context) method.invoke(context, objArr)) != null) {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Kd("iwn}{vr=s\u0001\u0001\by\u0004\u000bE[\t\t\u0010\u0002\u0016\u0013", (short) (FB.Xd() ^ 14439))).getMethod(Wg.Zd("\u0015/rsWT\u00056h#+X\u0013N\u0018x0r\u0018 P", (short) (C1633zX.Xd() ^ (-4824)), (short) (C1633zX.Xd() ^ (-3028))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    install((Context) method2.invoke(context, objArr2));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return install(context);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static boolean zzd(Context context) {
        return zzi(context, true);
    }

    public static boolean zze() {
        return zzb.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set zzf() {
        HashSet hashSet;
        synchronized (this.zze) {
            hashSet = new HashSet(this.zze);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zze.zzl(this.zzc.zzg((String) it.next()));
        }
        this.zzd.zzb();
    }

    private final synchronized void zzh(Context context, boolean z2) throws IOException {
        ZipFile zipFile;
        if (z2) {
            this.zzc.zzk();
        } else {
            zzd.zza().execute(new zzq(this));
        }
        short sXd = (short) (C1499aX.Xd() ^ (-26019));
        int[] iArr = new int["\u0018&\u001d,*%!k\"//6(29s\n77>0DA".length()];
        QB qb = new QB("\u0018&\u001d,*%!k\"//6(29s\n77>0DA");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (FB.Xd() ^ 6025);
        int[] iArr2 = new int[":7I$01<1B?+=D;".length()];
        QB qb2 = new QB(":7I$01<1B?+=D;");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(context, objArr);
            try {
                short sXd3 = (short) (C1633zX.Xd() ^ (-29552));
                short sXd4 = (short) (C1633zX.Xd() ^ (-21196));
                int[] iArr3 = new int["EQFSOHB\u000b?JHM=EJ\u0003\u0017B@E5GB".length()];
                QB qb3 = new QB("EQFSOHB\u000b?JHM=EJ\u0003\u0017B@E5GB");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(((sXd3 + i4) + xuXd3.CK(iKK3)) - sXd4);
                    i4++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr3, 0, i4)).getMethod(hg.Vd("liwRbcj_daH[gY^[g", (short) (OY.Xd() ^ 3136), (short) (OY.Xd() ^ 1733)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method2.invoke(context, objArr2);
                    Class<?> cls2 = Class.forName(C1561oA.ud("@LANJC=\u0006:ECH8@E}?;z\u001c,-4).+\u0012%1#(%1", (short) (C1580rY.Xd() ^ (-27456))));
                    Class<?>[] clsArr2 = new Class[2];
                    short sXd5 = (short) (C1607wl.Xd() ^ 25701);
                    int[] iArr4 = new int["\u001b\u0011%\u000fZ\u0018\f\u0018\u0010Uy\u001a\u0017\r\u0011\t".length()];
                    QB qb4 = new QB("\u001b\u0011%\u000fZ\u0018\f\u0018\u0010Uy\u001a\u0017\r\u0011\t");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 ^ i5));
                        i5++;
                    }
                    clsArr2[0] = Class.forName(new String(iArr4, 0, i5));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    Method method3 = cls2.getMethod(C1561oA.Yd("jiyVhktkrqV|u\u007f", (short) (C1580rY.Xd() ^ (-9862))), clsArr2);
                    try {
                        method3.setAccessible(true);
                        PackageInfo packageInfo = (PackageInfo) method3.invoke(packageManager, objArr3);
                        List<String> arrayList = packageInfo.splitNames == null ? new ArrayList() : Arrays.asList(packageInfo.splitNames);
                        Set<zzt> setZzj = this.zzc.zzj();
                        Set setZza = this.zzd.zza();
                        HashSet hashSet = new HashSet();
                        Iterator it = setZzj.iterator();
                        while (it.hasNext()) {
                            String strZzb = ((zzt) it.next()).zzb();
                            if (arrayList.contains(strZzb) || setZza.contains(com.google.android.play.core.splitinstall.zzs.zzb(strZzb))) {
                                hashSet.add(strZzb);
                                it.remove();
                            }
                        }
                        if (z2) {
                            zzg(hashSet);
                        } else if (!hashSet.isEmpty()) {
                            zzd.zza().execute(new zzr(this, hashSet));
                        }
                        HashSet hashSet2 = new HashSet();
                        Iterator it2 = setZzj.iterator();
                        while (it2.hasNext()) {
                            String strZzb2 = ((zzt) it2.next()).zzb();
                            if (!com.google.android.play.core.splitinstall.zzs.zze(strZzb2)) {
                                hashSet2.add(strZzb2);
                            }
                        }
                        for (String str2 : arrayList) {
                            if (!com.google.android.play.core.splitinstall.zzs.zze(str2)) {
                                hashSet2.add(str2);
                            }
                        }
                        HashSet<zzt> hashSet3 = new HashSet(setZzj.size());
                        for (zzt zztVar : setZzj) {
                            String strZzb3 = zztVar.zzb();
                            int i6 = com.google.android.play.core.splitinstall.zzs.zza;
                            short sXd6 = (short) (C1499aX.Xd() ^ (-12815));
                            short sXd7 = (short) (C1499aX.Xd() ^ (-32230));
                            int[] iArr5 = new int["\u007f\r\r\u0006\n\tP".length()];
                            QB qb5 = new QB("\u007f\r\r\u0006\n\tP");
                            int i7 = 0;
                            while (qb5.YK()) {
                                int iKK5 = qb5.KK();
                                Xu xuXd5 = Xu.Xd(iKK5);
                                iArr5[i7] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd6 + i7)) + sXd7);
                                i7++;
                            }
                            if (strZzb3.startsWith(new String(iArr5, 0, i7)) || hashSet2.contains(com.google.android.play.core.splitinstall.zzs.zzb(zztVar.zzb()))) {
                                hashSet3.add(zztVar);
                            }
                        }
                        zzn zznVar = new zzn(this.zzc);
                        zzan zzanVarZza = zzao.zza();
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(Jg.Wd("w'ZV\r4k#\u001aD\u0011p0V*E\u0018q*\u001eL\rJ", (short) (C1499aX.Xd() ^ (-17860)), (short) (C1499aX.Xd() ^ (-8876)))).getMethod(ZO.xd(";/P#\u0014%\r\u001e\u00018>JL-", (short) (FB.Xd() ^ 13226), (short) (FB.Xd() ^ 27935)), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            ClassLoader classLoader = (ClassLoader) method4.invoke(context, objArr4);
                            if (z2) {
                                zzanVarZza.zza(classLoader, zznVar.zzc());
                            } else {
                                Iterator it3 = hashSet3.iterator();
                                while (it3.hasNext()) {
                                    Set setZzb = zznVar.zzb((zzt) it3.next());
                                    if (setZzb == null) {
                                        it3.remove();
                                    } else {
                                        zzanVarZza.zza(classLoader, setZzb);
                                    }
                                }
                            }
                            HashSet hashSet4 = new HashSet();
                            for (zzt zztVar2 : hashSet3) {
                                try {
                                    Object[] objArr5 = {zztVar2.zza()};
                                    Constructor<?> constructor = Class.forName(C1626yg.Ud("er4J-JVf|\t)$(\u0019T,A%PhW", (short) (C1499aX.Xd() ^ (-11712)), (short) (C1499aX.Xd() ^ (-15850)))).getConstructor(Class.forName(Ig.wd("9W+5\u001a1\u0013)\u000f=j=", (short) (C1607wl.Xd() ^ 10252))));
                                    try {
                                        constructor.setAccessible(true);
                                        zipFile = (ZipFile) constructor.newInstance(objArr5);
                                    } catch (InvocationTargetException e2) {
                                        throw e2.getCause();
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    zipFile = null;
                                }
                                try {
                                    short sXd8 = (short) (C1580rY.Xd() ^ (-22709));
                                    int[] iArr6 = new int["Z1unAW\u0010taUl".length()];
                                    QB qb6 = new QB("Z1unAW\u0010taUl");
                                    int i8 = 0;
                                    while (qb6.YK()) {
                                        int iKK6 = qb6.KK();
                                        Xu xuXd6 = Xu.Xd(iKK6);
                                        iArr6[i8] = xuXd6.fK((C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((sXd8 + sXd8) + i8)) + xuXd6.CK(iKK6));
                                        i8++;
                                    }
                                    Object[] objArr6 = {new String(iArr6, 0, i8)};
                                    Method method5 = Class.forName(C1561oA.Qd("\u0005z\u000fxD\u000b\t|~?\u000bx~;ftzOqsk", (short) (Od.Xd() ^ (-12266)))).getMethod(C1561oA.od("zw\u0006U}\u0003\u007f\u0006", (short) (OY.Xd() ^ 25905)), Class.forName(C1593ug.zd("#\u001b1\u001dj* .(o\u001687/5/", (short) (FB.Xd() ^ 8696), (short) (FB.Xd() ^ 4705))));
                                    try {
                                        method5.setAccessible(true);
                                        ZipEntry zipEntry = (ZipEntry) method5.invoke(zipFile, objArr6);
                                        short sXd9 = (short) (OY.Xd() ^ 5);
                                        int[] iArr7 = new int["h`vb0xxnr5\u0003rz9fv~Uy}w".length()];
                                        QB qb7 = new QB("h`vb0xxnr5\u0003rz9fv~Uy}w");
                                        int i9 = 0;
                                        while (qb7.YK()) {
                                            int iKK7 = qb7.KK();
                                            Xu xuXd7 = Xu.Xd(iKK7);
                                            iArr7[i9] = xuXd7.fK(xuXd7.CK(iKK7) - ((sXd9 + sXd9) + i9));
                                            i9++;
                                        }
                                        Object[] objArr7 = new Object[0];
                                        Method method6 = Class.forName(new String(iArr7, 0, i9)).getMethod(Wg.Zd("8vW\u001fM", (short) (OY.Xd() ^ 12893), (short) (OY.Xd() ^ 21883)), new Class[0]);
                                        try {
                                            method6.setAccessible(true);
                                            method6.invoke(zipFile, objArr7);
                                            if (zipEntry == null || zzanVarZza.zzb(classLoader, this.zzc.zza(zztVar2.zzb()), zztVar2.zza(), z2)) {
                                                hashSet4.add(zztVar2.zza());
                                            } else {
                                                C1561oA.Xd(" \u001e\u001b\u0019%Q*\u0015(U%'-Y$*02 ,-''c", (short) (C1607wl.Xd() ^ 8851)).concat(zztVar2.zza().toString());
                                                Wg.vd("$@;7I\u0017B?9);", (short) (ZN.Xd() ^ 9092));
                                            }
                                        } catch (InvocationTargetException e4) {
                                            throw e4.getCause();
                                        }
                                    } catch (InvocationTargetException e5) {
                                        throw e5.getCause();
                                    }
                                } catch (IOException e6) {
                                    e = e6;
                                    if (zipFile != null) {
                                        try {
                                            Class<?> cls3 = Class.forName(Qg.kd("\u0012\b\u001c\u0006Q\u0018\u0016\n\fL\u0018\u0006\fHs\u0002\b\\~\u0001x", (short) (Od.Xd() ^ (-9054)), (short) (Od.Xd() ^ (-30175))));
                                            Class<?>[] clsArr3 = new Class[0];
                                            Object[] objArr8 = new Object[0];
                                            short sXd10 = (short) (C1607wl.Xd() ^ 31312);
                                            short sXd11 = (short) (C1607wl.Xd() ^ 7199);
                                            int[] iArr8 = new int[" (*-\u001e".length()];
                                            QB qb8 = new QB(" (*-\u001e");
                                            int i10 = 0;
                                            while (qb8.YK()) {
                                                int iKK8 = qb8.KK();
                                                Xu xuXd8 = Xu.Xd(iKK8);
                                                iArr8[i10] = xuXd8.fK(sXd10 + i10 + xuXd8.CK(iKK8) + sXd11);
                                                i10++;
                                            }
                                            Method method7 = cls3.getMethod(new String(iArr8, 0, i10), clsArr3);
                                            try {
                                                method7.setAccessible(true);
                                                method7.invoke(zipFile, objArr8);
                                            } catch (InvocationTargetException e7) {
                                                throw e7.getCause();
                                            }
                                        } catch (IOException e8) {
                                            try {
                                                Throwable.class.getDeclaredMethod(C1561oA.ud("$&%\u00134.-. -,\u001d\u001b", (short) (FB.Xd() ^ 3271)), Throwable.class).invoke(e, e8);
                                            } catch (Exception unused) {
                                            }
                                        }
                                    }
                                    throw e;
                                }
                            }
                            this.zzf.zza(context, hashSet4);
                            HashSet hashSet5 = new HashSet();
                            for (zzt zztVar3 : hashSet3) {
                                if (hashSet4.contains(zztVar3.zza())) {
                                    String strZzb4 = zztVar3.zzb();
                                    StringBuilder sb = new StringBuilder();
                                    short sXd12 = (short) (FB.Xd() ^ 23929);
                                    int[] iArr9 = new int["\u0003!\u001a\u0018(TX".length()];
                                    QB qb9 = new QB("\u0003!\u001a\u0018(TX");
                                    int i11 = 0;
                                    while (qb9.YK()) {
                                        int iKK9 = qb9.KK();
                                        Xu xuXd9 = Xu.Xd(iKK9);
                                        iArr9[i11] = xuXd9.fK(xuXd9.CK(iKK9) - (sXd12 ^ i11));
                                        i11++;
                                    }
                                    sb.append(new String(iArr9, 0, i11));
                                    sb.append(strZzb4);
                                    short sXd13 = (short) (C1633zX.Xd() ^ (-17098));
                                    int[] iArr10 = new int["\n\u0004NTZ\\JVWMaW^^\u0011W`iaWk]]".length()];
                                    QB qb10 = new QB("\n\u0004NTZ\\JVWMaW^^\u0011W`iaWk]]");
                                    int i12 = 0;
                                    while (qb10.YK()) {
                                        int iKK10 = qb10.KK();
                                        Xu xuXd10 = Xu.Xd(iKK10);
                                        iArr10[i12] = xuXd10.fK(xuXd10.CK(iKK10) - (((sXd13 + sXd13) + sXd13) + i12));
                                        i12++;
                                    }
                                    sb.append(new String(iArr10, 0, i12));
                                    sb.toString();
                                    Xg.qd("e\u0004\u0001~\u000bZ\b\u0007\u000b|\u0011", (short) (C1607wl.Xd() ^ 27390), (short) (C1607wl.Xd() ^ 11731));
                                    hashSet5.add(zztVar3.zzb());
                                } else {
                                    String strZzb5 = zztVar3.zzb();
                                    StringBuilder sb2 = new StringBuilder();
                                    short sXd14 = (short) (C1499aX.Xd() ^ (-24476));
                                    short sXd15 = (short) (C1499aX.Xd() ^ (-10397));
                                    int[] iArr11 = new int["MgT>:TL".length()];
                                    QB qb11 = new QB("MgT>:TL");
                                    int i13 = 0;
                                    while (qb11.YK()) {
                                        int iKK11 = qb11.KK();
                                        Xu xuXd11 = Xu.Xd(iKK11);
                                        iArr11[i13] = xuXd11.fK(xuXd11.CK(iKK11) - ((i13 * sXd15) ^ sXd14));
                                        i13++;
                                    }
                                    sb2.append(new String(iArr11, 0, i13));
                                    sb2.append(strZzb5);
                                    sb2.append(ZO.xd("MO\"%/\u001e9\u0017\t6\u0001V%4\u00132%LEo+80\n\u001e5|e", (short) (C1499aX.Xd() ^ (-17779)), (short) (C1499aX.Xd() ^ (-13861))));
                                    sb2.toString();
                                    C1626yg.Ud("\u001b\u000fkID;-\b8QS", (short) (C1580rY.Xd() ^ (-1900)), (short) (C1580rY.Xd() ^ (-24593)));
                                }
                            }
                            synchronized (this.zze) {
                                this.zze.addAll(hashSet5);
                            }
                        } catch (InvocationTargetException e9) {
                            throw e9.getCause();
                        }
                    } catch (InvocationTargetException e10) {
                        throw e10.getCause();
                    }
                } catch (InvocationTargetException e11) {
                    throw e11.getCause();
                }
            } catch (PackageManager.NameNotFoundException e12) {
                throw new IOException(String.format(Ig.wd("/%\u0004\\>}EBq4=Vgne1FrT?)7\u0018\u0018l6Mv8:\\xVjQm2", (short) (C1580rY.Xd() ^ (-30138))), str), e12);
            }
        } catch (InvocationTargetException e13) {
            throw e13.getCause();
        }
    }

    private static boolean zzi(final Context context, boolean z2) {
        boolean z3;
        if (zzj()) {
            return false;
        }
        AtomicReference atomicReference = zzb;
        SplitCompat splitCompat = new SplitCompat(context);
        while (true) {
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, splitCompat)) {
                z3 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z3 = false;
                break;
            }
        }
        SplitCompat splitCompat2 = (SplitCompat) zzb.get();
        if (z3) {
            com.google.android.play.core.splitinstall.zzo.INSTANCE.zzb(new zzak(context, zzd.zza(), new zzam(context, splitCompat2.zzc, new zzah()), splitCompat2.zzc, new zzs()));
            com.google.android.play.core.splitinstall.zzr.zzb(new zzp(splitCompat2));
            zzd.zza().execute(new Runnable() { // from class: com.google.android.play.core.splitcompat.zzo
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    int i2 = SplitCompat.zza;
                    try {
                        zzx.zzg(context2).zzc(true);
                    } catch (SecurityException unused) {
                    }
                }
            });
        }
        try {
            splitCompat2.zzh(context, z2);
            return true;
        } catch (Exception e2) {
            return false;
        }
    }

    private static boolean zzj() {
        return false;
    }
}
