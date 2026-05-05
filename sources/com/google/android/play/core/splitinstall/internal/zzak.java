package com.google.android.play.core.splitinstall.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
public final class zzak implements com.google.android.play.core.splitinstall.zzh {
    private final Context zza;
    private final com.google.android.play.core.splitcompat.zze zzb;
    private final zzam zzc;
    private final Executor zzd;
    private final com.google.android.play.core.splitcompat.zzs zze;

    public zzak(Context context, Executor executor, zzam zzamVar, com.google.android.play.core.splitcompat.zze zzeVar, com.google.android.play.core.splitcompat.zzs zzsVar) {
        this.zza = context;
        this.zzb = zzeVar;
        this.zzc = zzamVar;
        this.zzd = executor;
        this.zze = zzsVar;
    }

    static /* bridge */ /* synthetic */ void zzb(zzak zzakVar, List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        Integer numZze = zzakVar.zze(list);
        if (numZze == null) {
            return;
        }
        if (numZze.intValue() == 0) {
            zzfVar.zzc();
        } else {
            zzfVar.zzb(numZze.intValue());
        }
    }

    static /* bridge */ /* synthetic */ void zzc(zzak zzakVar, com.google.android.play.core.splitinstall.zzf zzfVar) {
        try {
            if (SplitCompat.zzd(zzbr.zza(zzakVar.zza))) {
                zzfVar.zza();
            } else {
                zzfVar.zzb(-12);
            }
        } catch (Exception e2) {
            zzfVar.zzb(-12);
        }
    }

    private final Integer zze(List list) {
        FileLock fileLockTryLock;
        int i2;
        File[] fileArrListFiles;
        C1561oA.Qd("-ID@J\u0018C@B2D", (short) (C1607wl.Xd() ^ 32002));
        try {
            FileChannel channel = new RandomAccessFile(this.zzb.zzd(), C1593ug.zd("\u007f\u0006", (short) (OY.Xd() ^ 31022), (short) (OY.Xd() ^ 10219))).getChannel();
            Integer numValueOf = null;
            try {
                try {
                    fileLockTryLock = channel.tryLock();
                } finally {
                }
            } catch (OverlappingFileLockException unused) {
                fileLockTryLock = null;
            }
            if (fileLockTryLock != null) {
                C1561oA.od("n\u001a\u001a\"\u0011\u0015\rD\u0017\u0013\u000e\n\u0014\u0012K", (short) (C1607wl.Xd() ^ 24857));
                try {
                    Iterator it = list.iterator();
                    while (true) {
                        i2 = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Intent intent = (Intent) it.next();
                        String stringExtra = intent.getStringExtra(C1561oA.Kd("\u000f\r\n\b\u0014\u007f\u000b\u0007", (short) (FB.Xd() ^ 2871)));
                        Context context = this.zza;
                        Object[] objArr = new Object[0];
                        Method method = Class.forName(Wg.Zd(":#\u0012w-~rsbJB I\u000b\t\u001bhmh'O;/", (short) (Od.Xd() ^ (-3197)), (short) (Od.Xd() ^ (-6883)))).getMethod(C1561oA.Xd("\u0018\u0017'v$$+\u001d'.\r!0-+6&4", (short) (ZN.Xd() ^ 26254)), new Class[0]);
                        try {
                            method.setAccessible(true);
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = ((ContentResolver) method.invoke(context, objArr)).openAssetFileDescriptor(intent.getData(), Wg.vd("\u0007", (short) (ZN.Xd() ^ 11572)));
                            try {
                                File fileZze = this.zzb.zze(stringExtra);
                                if ((fileZze.exists() && fileZze.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileZze.exists()) {
                                    if (!this.zzb.zzg(stringExtra).exists()) {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(fileZze);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                while (true) {
                                                    int i3 = bufferedInputStream.read(bArr);
                                                    if (i3 <= 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i3);
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    assetFileDescriptorOpenAssetFileDescriptor.close();
                                }
                            } catch (Throwable th) {
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    try {
                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    short sXd = (short) (ZN.Xd() ^ 20991);
                    short sXd2 = (short) (ZN.Xd() ^ 26060);
                    int[] iArr = new int["Xtokus\u001falld_]&".length()];
                    QB qb = new QB("Xtokus\u001falld_]&");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK(((sXd + i4) + xuXd.CK(iKK)) - sXd2);
                        i4++;
                    }
                    new String(iArr, 0, i4);
                    try {
                        fileArrListFiles = this.zzb.zzb().listFiles();
                        try {
                        } catch (Exception e3) {
                            C1561oA.Yd("X\u0007\b\u0006\n8\u0010\u007f\u000e\u0006\u0004\u0018\t\u000f\tB\u0017\u0015\u0012\u0010\u001c\u001cW", (short) (C1580rY.Xd() ^ (-31007)));
                        }
                    } catch (IOException e4) {
                        short sXd3 = (short) (C1607wl.Xd() ^ 32149);
                        short sXd4 = (short) (C1607wl.Xd() ^ 4049);
                        int[] iArr2 = new int["-LZ[]c\u0010RUVYhi\u0017\\bl`_qmqy!hrv%{u~n|trvss0\u0005\u0003\u007f}\n\nE".length()];
                        QB qb2 = new QB("-LZ[]c\u0010RUVYhi\u0017\\bl`_qmqy!hrv%{u~n|trvss0\u0005\u0003\u007f}\n\nE");
                        int i5 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i5] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i5)) + sXd4);
                            i5++;
                        }
                        new String(iArr2, 0, i5);
                    }
                } catch (Exception e5) {
                    Jg.Wd("\f\u000e\u0004v_\u0002;=$\u0007cV=s4\u001f\tcPDt", (short) (Od.Xd() ^ (-30375)), (short) (Od.Xd() ^ (-12981)));
                }
                if (this.zzc.zzc(fileArrListFiles)) {
                    if (this.zzc.zza(fileArrListFiles)) {
                        try {
                            File[] fileArrListFiles2 = this.zzb.zzb().listFiles();
                            Arrays.sort(fileArrListFiles2);
                            int length = fileArrListFiles2.length;
                            while (true) {
                                length--;
                                if (length < 0) {
                                    break;
                                }
                                com.google.android.play.core.splitcompat.zze.zzm(fileArrListFiles2[length]);
                                File file = fileArrListFiles2[length];
                                file.renameTo(this.zzb.zzf(file));
                            }
                            hg.Vd("\u0012.)%/-X.\u001c(\u001e\u001a\u001c\u0017\u0015]", (short) (C1633zX.Xd() ^ (-11952)), (short) (C1633zX.Xd() ^ (-5917)));
                        } catch (IOException e6) {
                            C1561oA.ud("\u00130<;;?i@:0:*c9'3)%'\" Z-)$ *b", (short) (C1607wl.Xd() ^ 4336));
                            i2 = -13;
                        }
                        numValueOf = Integer.valueOf(i2);
                        fileLockTryLock.release();
                    }
                }
                C1561oA.yd("h\u0007\u0004\u0002\u000e:\u0012\u0002\u0010\b\u0006\n\u0005\u0004\u0018\u000ett'njswqq<", (short) (C1607wl.Xd() ^ 426));
                i2 = -11;
                numValueOf = Integer.valueOf(i2);
                fileLockTryLock.release();
            }
            if (channel != null) {
                channel.close();
            }
            return numValueOf;
        } catch (Exception e7) {
            short sXd5 = (short) (C1499aX.Xd() ^ (-832));
            short sXd6 = (short) (C1499aX.Xd() ^ (-26575));
            int[] iArr3 = new int[";\u001eC\u0002@i.\u001d\u0010pn4\u007fW\"~*n'g".length()];
            QB qb3 = new QB(";\u001eC\u0002@i.\u001d\u0010pn4\u007fW\"~*n'g");
            int i6 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i6] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((i6 * sXd6) + sXd5)));
                i6++;
            }
            new String(iArr3, 0, i6);
            return -13;
        }
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    public final void zzd(List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        if (!SplitCompat.zze()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.zzd.execute(new zzaj(this, list, zzfVar));
    }
}
