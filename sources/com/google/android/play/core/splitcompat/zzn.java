package com.google.android.play.core.splitcompat;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
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
public final class zzn {
    private static final Pattern zza = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    private final zze zzb;

    zzn(zze zzeVar) throws IOException {
        this.zzb = zzeVar;
    }

    static /* bridge */ /* synthetic */ Set zza(zzn zznVar, Set set, zzt zztVar, ZipFile zipFile) throws Throwable {
        HashSet hashSet = new HashSet();
        zznVar.zzf(zztVar, set, new zzj(zznVar, hashSet, zztVar, zipFile));
        return hashSet;
    }

    private static void zze(zzt zztVar, zzk zzkVar) throws Throwable {
        ZipFile zipFile;
        String strZzb;
        HashMap map;
        Enumeration enumeration;
        try {
            File fileZza = zztVar.zza();
            Class<?> cls = Class.forName(C1593ug.zd("yq\bsA\n\n\u007f\u0004F\u0014\u0004\fJw\b\u0010f\u000b\u000f\t", (short) (ZN.Xd() ^ 15557), (short) (ZN.Xd() ^ 25449)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.od("|r\u0007p<v{9Prtl", (short) (Od.Xd() ^ (-5040))));
            Object[] objArr = {fileZza};
            Constructor<?> constructor = cls.getConstructor(clsArr);
            try {
                constructor.setAccessible(true);
                zipFile = (ZipFile) constructor.newInstance(objArr);
                try {
                    strZzb = zztVar.zzb();
                    map = new HashMap();
                    short sXd = (short) (C1633zX.Xd() ^ (-4959));
                    int[] iArr = new int[" \u0018.\u001ag00&*l:*2p\u001e.6\r15/".length()];
                    QB qb = new QB(" \u0018.\u001ag00&*l:*2p\u001e.6\r15/");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                        i2++;
                    }
                    Object[] objArr2 = new Object[0];
                    Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd("&D\u001f1<M0", (short) (Od.Xd() ^ (-31670)), (short) (Od.Xd() ^ (-29219))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        enumeration = (Enumeration) method.invoke(zipFile, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (IOException e5) {
            e = e5;
            zipFile = null;
        }
        while (true) {
            boolean zHasMoreElements = enumeration.hasMoreElements();
            short sXd2 = (short) (Od.Xd() ^ (-29280));
            int[] iArr2 = new int["|\u001b\u0018\u0016\"q\u001f\u001e\"\u0014(".length()];
            QB qb2 = new QB("|\u001b\u0018\u0016\"q\u001f\u001e\"\u0014(");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                i3++;
            }
            new String(iArr2, 0, i3);
            if (!zHasMoreElements) {
                break;
            }
            ZipEntry zipEntry = (ZipEntry) enumeration.nextElement();
            Object[] objArr3 = new Object[0];
            Method method2 = Class.forName(Wg.vd("\u000b\u0003\u0015\u0001R\u001b\u0017\r\u0005G\u0011\u0001\rKt\u0005!v\u001d$'/", (short) (C1580rY.Xd() ^ (-24684)))).getMethod(Qg.kd("olzSepg", (short) (FB.Xd() ^ 5776), (short) (FB.Xd() ^ 1530)), new Class[0]);
            try {
                method2.setAccessible(true);
                Matcher matcher = zza.matcher((String) method2.invoke(zipEntry, objArr3));
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    String.format(hg.Vd("2DVJVD*F>M;KQ\u001cNIF45E?A\bl?;62<fli7ia)!2]+\u001d/#/\u001dV\"\u001e\u0016%\u0013#)NTQ\u001fQI\u000f\u0017\u0019EeekAGD\u0012D", (short) (Od.Xd() ^ (-650)), (short) (Od.Xd() ^ (-3199))), strZzb, strGroup2, strGroup);
                    Set hashSet = (Set) map.get(strGroup);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(strGroup, hashSet);
                    }
                    hashSet.add(new zzm(zipEntry, strGroup2));
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
            e = e3;
            if (zipFile != null) {
                try {
                    Object[] objArr4 = new Object[0];
                    Method method3 = Class.forName(C1626yg.Ud("Z,\u0018tE>TPjNB\u007f\\\u0001-e\u0016d\u00140R", (short) (C1633zX.Xd() ^ (-11)), (short) (C1633zX.Xd() ^ (-9176)))).getMethod(Ig.wd("oA\u0016y\u001b", (short) (C1633zX.Xd() ^ (-11232))), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        method3.invoke(zipFile, objArr4);
                    } catch (InvocationTargetException e7) {
                        throw e7.getCause();
                    }
                } catch (IOException e8) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e8);
                }
            }
            throw e;
        }
        HashMap map2 = new HashMap();
        for (String str : Build.SUPPORTED_ABIS) {
            if (map.containsKey(str)) {
                String.format(C1561oA.ud("$6H<H6\u001c80?-=C\u000e@;8&'713y^2%!-\u001fX\u0019)\u001bT\"\u0014&\u001a&\u0014M\u0019\u0015\r\u001c\n\u001a\u0010\u000b\u0018C\t\u0011\u0013?\u0012\u0013\r\f\n\f\r|z5UU[15\u0003I-\u0004tvu(|yj$wjjs\u001f??E", (short) (C1607wl.Xd() ^ 24277)), str);
                for (zzm zzmVar : (Set) map.get(str)) {
                    if (map2.containsKey(zzmVar.zza)) {
                        String.format(C1561oA.yd("\u0019-A7E5\u001d;5F6HP\u001dQN-\u001d 2.2za6/.67171J\u0018\u0016\u0010!\u0011#+RX(U\u001d'+Y[]e=C\u0013[A\u0004\u0010\u0017\u000b\b\f\"I{~r\u0002t~\u00062y\u0004\b6x8{\u007fopbp\u001fACK", (short) (C1633zX.Xd() ^ (-10373))), zzmVar.zza, str);
                    } else {
                        map2.put(zzmVar.zza, zzmVar);
                        String.format(C1561oA.Yd("G[oescKictdv~K\u007f|{kn\u0001|\u0001I0\u0007\u0006|\u0003|6\u0004\u0002{\r|\u000f\u0017>D\u0014A\t\u0013\u0017EgiqIO\u001f", (short) (C1580rY.Xd() ^ (-11064))), zzmVar.zza, str);
                    }
                }
            } else {
                String.format(Xg.qd("#7KAO?'E?P@RZ'[XWGJ\\X\\%\faVTbV\u0012TfZ\u0016eg\u0019h\\pftd mkevfxpm|*q{\u007f.\u0003\u0006\u0002\u0003\u0003\u0007\n{{8Z\\d<B\u0012", (short) (C1580rY.Xd() ^ (-31853)), (short) (C1580rY.Xd() ^ (-30729))), str);
            }
        }
        zzkVar.zza(zipFile, new HashSet(map2.values()));
        Object[] objArr5 = new Object[0];
        Method method4 = Class.forName(Jg.Wd("U\"\u000f3WX/]83W\u007f^UY\"\u0001,\u000bc\u0018", (short) (C1499aX.Xd() ^ (-8044)), (short) (C1499aX.Xd() ^ (-23764)))).getMethod(ZO.xd("rD^s4", (short) (C1580rY.Xd() ^ (-7023)), (short) (C1580rY.Xd() ^ (-17995))), new Class[0]);
        try {
            method4.setAccessible(true);
            method4.invoke(zipFile, objArr5);
        } catch (InvocationTargetException e9) {
            throw e9.getCause();
        }
    }

    public final void zzf(zzt zztVar, Set set, zzl zzlVar) throws Throwable {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzm zzmVar = (zzm) it.next();
            File fileZzc = this.zzb.zzc(zztVar.zzb(), zzmVar.zza);
            boolean z2 = false;
            if (fileZzc.exists()) {
                long length = fileZzc.length();
                ZipEntry zipEntry = zzmVar.zzb;
                Class<?> cls = Class.forName(EO.Od("\u0011ZA\tE9H\u000e[-w\t^\u0016*W3ugY\u0012a", (short) (Od.Xd() ^ (-21704))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (C1580rY.Xd() ^ (-5269));
                int[] iArr = new int["FCQ/DT>".length()];
                QB qb = new QB("FCQ/DT>");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    if (length == ((Long) method.invoke(zipEntry, objArr)).longValue() && zze.zzp(fileZzc)) {
                        z2 = true;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            zzlVar.zza(zzmVar, fileZzc, z2);
        }
    }

    final Set zzb(zzt zztVar) throws Throwable {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        zze(zztVar, new zzh(this, zztVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    final Set zzc() throws Throwable {
        Set<zzt> setZzj = this.zzb.zzj();
        for (String str : this.zzb.zzh()) {
            Iterator it = setZzj.iterator();
            while (true) {
                if (!it.hasNext()) {
                    String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str);
                    this.zzb.zzn(str);
                    break;
                }
                if (((zzt) it.next()).zzb().equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (zzt zztVar : setZzj) {
            HashSet hashSet2 = new HashSet();
            zze(zztVar, new zzi(this, hashSet2, zztVar));
            for (File file : this.zzb.zzi(zztVar.zzb())) {
                if (!hashSet2.contains(file)) {
                    String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), zztVar.zzb(), zztVar.zza().getAbsolutePath());
                    this.zzb.zzo(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }
}
