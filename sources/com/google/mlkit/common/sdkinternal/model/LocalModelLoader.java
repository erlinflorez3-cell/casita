package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.drew.metadata.bmp.BmpReader;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.LocalModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class LocalModelLoader {
    private MappedByteBuffer zza;
    private final Context zzb;
    private final LocalModel zzc;

    public LocalModelLoader(Context context, LocalModel localModel) {
        this.zzb = context;
        this.zzc = localModel;
    }

    public LocalModel getLocalModel() {
        return this.zzc;
    }

    public MappedByteBuffer load() throws Throwable {
        FileChannel channel;
        Preconditions.checkNotNull(this.zzb, Qg.kd("Z\u0006\u0004\tx\u000b\u00060ro{,yy}(ik%rxnm", (short) (C1580rY.Xd() ^ (-25573)), (short) (C1580rY.Xd() ^ (-25791))));
        Preconditions.checkNotNull(this.zzc, hg.Vd("\u0002#\u0017\u0017\u001dO\"\u001d\"\u001e\u000e\u000fH\u000b\b\u0014D\u0012\u0012\u0016@\u0002\u0004=\u000b\u0011\u0007\u0006", (short) (OY.Xd() ^ 3249), (short) (OY.Xd() ^ 8304)));
        MappedByteBuffer mappedByteBuffer = this.zza;
        if (mappedByteBuffer != null) {
            return mappedByteBuffer;
        }
        LocalModel localModel = this.zzc;
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        String assetFilePath = localModel.getAssetFilePath();
        Uri uri = localModel.getUri();
        String strUd = C1561oA.ud("8", (short) (C1607wl.Xd() ^ 26776));
        if (absoluteFilePath != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(absoluteFilePath, strUd);
                try {
                    FileChannel channel2 = randomAccessFile.getChannel();
                    try {
                        this.zza = channel2.map(FileChannel.MapMode.READ_ONLY, 0L, channel2.size());
                        if (channel2 != null) {
                            channel2.close();
                        }
                        randomAccessFile.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e2) {
                throw new MlKitException(C1561oA.yd("A^j\u001bppt\u001fuuiq*}pl.y{ns}0u\u007f\u0002yM:", (short) (Od.Xd() ^ (-22186))).concat(String.valueOf(this.zzc.getAbsoluteFilePath())), 14, e2);
            }
        } else if (assetFilePath != null) {
            try {
                Context context = this.zzb;
                short sXd = (short) (ZN.Xd() ^ 7711);
                int[] iArr = new int["u\u0004z\n\b\u0003~I\u007f\r\r\u0014\u0006\u0010\u0017Qg\u0015\u0015\u001c\u000e\"\u001f".length()];
                QB qb = new QB("u\u0004z\n\b\u0003~I\u007f\r\r\u0014\u0006\u0010\u0017Qg\u0015\u0015\u001c\u000e\"\u001f");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd2 = (short) (C1499aX.Xd() ^ (-17952));
                short sXd3 = (short) (C1499aX.Xd() ^ (-9401));
                int[] iArr2 = new int["\u0003\u0002\u0012_\u0013\u0014\u0007\u0017\u0017".length()];
                QB qb2 = new QB("\u0003\u0002\u0012_\u0013\u0014\u0007\u0017\u0017");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    AssetFileDescriptor assetFileDescriptorOpenFd = ((AssetManager) method.invoke(context, objArr)).openFd(assetFilePath);
                    try {
                        channel = new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel();
                        try {
                            this.zza = channel.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
                            if (channel != null) {
                                channel.close();
                            }
                            if (assetFileDescriptorOpenFd != null) {
                                assetFileDescriptorOpenFd.close();
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (IOException e4) {
                StringBuilder sb = new StringBuilder(Jg.Wd("=iExY\u001d0\u0002|\u0002\"+\u0015\u0010\u0016U>j<AHI\u001eL{\bXL`\u0013\u0003HL$", (short) (C1580rY.Xd() ^ (-24849)), (short) (C1580rY.Xd() ^ (-12790))));
                sb.append(assetFilePath);
                short sXd4 = (short) (C1607wl.Xd() ^ 2826);
                short sXd5 = (short) (C1607wl.Xd() ^ BmpReader.OS2_BITMAP_ARRAY);
                int[] iArr3 = new int["0134..\u0016\nH\u001f**#G\u001f\u0018\u0002\u0006-6,m\u001b<U\bTl,NW\u0013\u00165+EU1C\u0011:aCw=k\\\u0010\u0015m~\u001ae\u0002,\u0002\u001f^}&AG:[6B,\"$\u0019\u0010\u00198us[\u001b:\u0010hnx]:u:\u00036\u0012\u00068\u000e\u0017o\r,f(D\u0012{uZ\u0018X7+%r9qk5@;#80$t?:%p\u001c-6q\u001a\u0006n\u001dU\"IY&g\u001e\u000epZo\u0011*G-=\u001eM?\u0018".length()];
                QB qb3 = new QB("0134..\u0016\nH\u001f**#G\u001f\u0018\u0002\u0006-6,m\u001b<U\bTl,NW\u0013\u00165+EU1C\u0011:aCw=k\\\u0010\u0015m~\u001ae\u0002,\u0002\u001f^}&AG:[6B,\"$\u0019\u0010\u00198us[\u001b:\u0010hnx]:u:\u00036\u0012\u00068\u000e\u0017o\r,f(D\u0012{uZ\u0018X7+%r9qk5@;#80$t?:%p\u001c-6q\u001a\u0006n\u001dU\"IY&g\u001e\u000epZo\u0011*G-=\u001eM?\u0018");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                    i4++;
                }
                sb.append(new String(iArr3, 0, i4));
                throw new MlKitException(sb.toString(), 14, e4);
            }
        } else {
            if (uri == null) {
                throw new MlKitException(Ig.wd("\u0002ONcrGd'\u00167-P@\u0015\u000f(\u0015f\u001f\u001e_\rfZ*g~\b[\u0003Z=^\u0006D{%VItf~EYSx3 ~Z\u001cg\u0019C'ePY_hAp\u0019\u0001U@(-\fHx0[:)=^%(;\u0017\u0019{$s\u0001\u000et", (short) (C1607wl.Xd() ^ 12578)), 14);
            }
            try {
                AssetFileDescriptor assetFileDescriptorZza = zzi.zza(this.zzb, uri, strUd);
                try {
                    channel = assetFileDescriptorZza.createInputStream().getChannel();
                    try {
                        this.zza = channel.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorZza.getStartOffset(), assetFileDescriptorZza.getLength());
                        if (channel != null) {
                            channel.close();
                        }
                        if (assetFileDescriptorZza != null) {
                            assetFileDescriptorZza.close();
                        }
                    } finally {
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    }
                } finally {
                }
            } catch (IOException e5) {
                throw new MlKitException(C1626yg.Ud("\u007fAeR\u0014\u001c{OltR1MYnE#j\u0012\u00062X>)ky\u0019Ms(Fg", (short) (C1499aX.Xd() ^ (-24319)), (short) (C1499aX.Xd() ^ (-3913))).concat(uri.toString()), 14, e5);
            }
        }
        return this.zza;
    }
}
