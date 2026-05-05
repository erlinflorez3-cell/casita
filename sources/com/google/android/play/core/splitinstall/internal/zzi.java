package com.google.android.play.core.splitinstall.internal;

import android.util.Pair;
import com.drew.metadata.mov.metadata.QuickTimeMetadataDirectory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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

/* JADX INFO: loaded from: classes9.dex */
public final class zzi {
    public static X509Certificate[][] zza(String str) throws zzf, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairZzc = zzj.zzc(randomAccessFile);
            if (pairZzc == null) {
                throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairZzc.first;
            long jLongValue = ((Long) pairZzc.second).longValue();
            long j2 = (-20) + jLongValue;
            if (j2 >= 0) {
                randomAccessFile.seek(j2);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzf("ZIP64 APK not supported");
                }
            }
            long jZza = zzj.zza(byteBuffer);
            if (jZza >= jLongValue) {
                throw new zzf("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (zzj.zzb(byteBuffer) + jZza != jLongValue) {
                throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jZza < 32) {
                throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.seek(jZza - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new zzf("No APK Signing Block before ZIP Central Directory");
            }
            long j3 = byteBufferAllocate.getLong(0);
            if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
                throw new zzf("APK Signing Block size out of range: " + j3);
            }
            int i2 = (int) (8 + j3);
            long j4 = jZza - ((long) i2);
            if (j4 < 0) {
                throw new zzf("APK Signing Block offset out of range: " + j4);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.seek(j4);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j5 = byteBufferAllocate2.getLong(0);
            if (j5 != j3) {
                throw new zzf("APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j3);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j4));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != ByteOrder.LITTLE_ENDIAN) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i3 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    i3++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i3);
                    }
                    long j6 = byteBufferSlice.getLong();
                    if (j6 < 4 || j6 > 2147483647L) {
                        throw new zzf("APK Signing Block entry #" + i3 + " size out of range: " + j6);
                    }
                    int i4 = (int) j6;
                    int iPosition2 = byteBufferSlice.position() + i4;
                    if (i4 > byteBufferSlice.remaining()) {
                        throw new zzf("APK Signing Block entry #" + i3 + " size out of range: " + i4 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrZzl = zzl(randomAccessFile.getChannel(), new zze(zze(byteBufferSlice, i4 - 4), jLongValue2, jZza, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        return x509CertificateArrZzl;
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int zzb(int i2) {
        if (i2 == 1) {
            return 32;
        }
        if (i2 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i2);
    }

    private static int zzc(int i2) {
        if (i2 == 513) {
            return 1;
        }
        if (i2 == 514) {
            return 2;
        }
        if (i2 == 769) {
            return 1;
        }
        switch (i2) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
        }
    }

    private static String zzd(int i2) {
        if (i2 == 1) {
            return "SHA-256";
        }
        if (i2 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i2);
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i2) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (i3 < iPosition || i3 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i3);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i3);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            return zze(byteBuffer, i2);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i2 + ", remaining: " + byteBuffer.remaining());
    }

    private static void zzg(int i2, byte[] bArr, int i3) {
        bArr[1] = (byte) ((i2 + 255) - (255 | i2));
        bArr[2] = (byte) ((-1) - (((-1) - (i2 >>> 8)) | ((-1) - 255)));
        bArr[3] = (byte) ((-1) - (((-1) - (i2 >>> 16)) | ((-1) - 255)));
        bArr[4] = (byte) (i2 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j2, long j3, long j4, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzc zzcVar = new zzc(fileChannel, 0L, j2);
        zzc zzcVar2 = new zzc(fileChannel, j3, j4 - j3);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzj.zzd(byteBufferDuplicate, j2);
        zza zzaVar = new zza(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        try {
            byte[][] bArrZzk = zzk(iArr, new zzb[]{zzcVar, zzcVar2, zzaVar});
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = iArr[i3];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i4)), bArrZzk[i3])) {
                    throw new SecurityException(zzd(i4).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e2) {
            throw new SecurityException("Failed to compute digest(s) of contents", e2);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IOException("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i2];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i2 + ", available: " + byteBuffer.remaining());
    }

    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws Throwable {
        String strVd;
        Pair pairCreate;
        ByteBuffer byteBufferZzf = zzf(byteBuffer);
        ByteBuffer byteBufferZzf2 = zzf(byteBuffer);
        byte[] bArrZzi = zzi(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        int i2 = -1;
        int i3 = 0;
        while (byteBufferZzf2.hasRemaining()) {
            i3++;
            try {
                ByteBuffer byteBufferZzf3 = zzf(byteBufferZzf2);
                if (byteBufferZzf3.remaining() < 8) {
                    short sXd = (short) (C1580rY.Xd() ^ (-21222));
                    short sXd2 = (short) (C1580rY.Xd() ^ (-9913));
                    int[] iArr = new int["i\u0001\u007f\b{\u0010\u0012\u0010\u0004?\u0013\u0007\u0006\u0013\u0017\nF\u001c\u0018\u0019J\u001f\u0015\u001d!$".length()];
                    QB qb = new QB("i\u0001\u007f\b{\u0010\u0012\u0010\u0004?\u0013\u0007\u0006\u0013\u0017\nF\u001c\u0018\u0019J\u001f\u0015\u001d!$");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) - sXd2);
                        i4++;
                    }
                    throw new SecurityException(new String(iArr, 0, i4));
                }
                int i5 = byteBufferZzf3.getInt();
                arrayList.add(Integer.valueOf(i5));
                if (i5 != 513 && i5 != 514 && i5 != 769) {
                    switch (i5) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i2 != -1) {
                    int iZzc = zzc(i5);
                    int iZzc2 = zzc(i2);
                    if (iZzc != 1 && iZzc2 == 1) {
                    }
                }
                bArrZzi3 = zzi(byteBufferZzf3);
                i2 = i5;
            } catch (IOException | BufferUnderflowException e2) {
                throw new SecurityException(C1561oA.od("4NUWOM\b[U\u0005TDTTE~QFCI;MMI;tF85@B3mo", (short) (C1607wl.Xd() ^ 30177)) + i3, e2);
            }
        }
        if (i2 == -1) {
            if (i3 == 0) {
                throw new SecurityException(C1561oA.Kd("4V\b\\SRZNbdbVe\u0013Zdke\\", (short) (Od.Xd() ^ (-13292))));
            }
            throw new SecurityException(Wg.Zd("\rrg_\"a\u0006I\rS\t))A[\u001ae\u001dt\u0016W\u000f>/:\bNk&", (short) (OY.Xd() ^ 28186), (short) (OY.Xd() ^ 11242)));
        }
        short sXd3 = (short) (Od.Xd() ^ (-11952));
        int[] iArr2 = new int["e\u007f}\u0002\u0004\r\u00057\f\u0003\u0002\n}\u0012\u0014\u0012\u0006A\u0004\u0010\f\u0015\u0019\u0011\u001d\u0012\u0018eL]'".length()];
        QB qb2 = new QB("e\u007f}\u0002\u0004\r\u00057\f\u0003\u0002\n}\u0012\u0014\u0012\u0006A\u0004\u0010\f\u0015\u0019\u0011\u001d\u0012\u0018eL]'");
        int i6 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i6));
            i6++;
        }
        String str = new String(iArr2, 0, i6);
        if (i2 == 513 || i2 == 514) {
            strVd = hg.Vd("XU", (short) (ZN.Xd() ^ 1991), (short) (ZN.Xd() ^ 11627));
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                case 258:
                case 259:
                case 260:
                    strVd = Wg.vd("79$", (short) (C1633zX.Xd() ^ (-6166)));
                    break;
                default:
                    throw new IllegalArgumentException(str.concat(String.valueOf(Long.toHexString(i2))));
            }
        } else {
            short sXd4 = (short) (OY.Xd() ^ 17652);
            short sXd5 = (short) (OY.Xd() ^ 22726);
            int[] iArr3 = new int["^lY".length()];
            QB qb3 = new QB("^lY");
            int i7 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i7] = xuXd3.fK(((sXd4 + i7) + xuXd3.CK(iKK3)) - sXd5);
                i7++;
            }
            strVd = new String(iArr3, 0, i7);
        }
        if (i2 == 513) {
            pairCreate = Pair.create(C1593ug.zd("\u0010\u0006\u007fquw:-9.\f\u000b\r\u001d\f", (short) (C1607wl.Xd() ^ 7216), (short) (C1607wl.Xd() ^ 25365)), null);
        } else if (i2 == 514) {
            pairCreate = Pair.create(C1561oA.Qd("#\u0017\u000f\u0002||A2</\u000b\b\b\u0016\u0003", (short) (ZN.Xd() ^ 28318)), null);
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                    pairCreate = Pair.create(Ig.wd(">\n\u0015!\f0Y+g\u001b\u000b&I)Nn2", (short) (C1580rY.Xd() ^ (-16607))), new PSSParameterSpec(ZO.xd("\u0006WYNEZ;", (short) (OY.Xd() ^ 8043), (short) (OY.Xd() ^ 24999)), C1626yg.Ud("\u0013\u0006!X", (short) (FB.Xd() ^ 16755), (short) (FB.Xd() ^ 26983)), MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create(Jg.Wd("pnj*)u>;\b\u00072>/h\rY\\", (short) (C1499aX.Xd() ^ (-22925)), (short) (C1499aX.Xd() ^ (-4127))), new PSSParameterSpec(C1561oA.Yd("J@:'0-/", (short) (C1580rY.Xd() ^ (-4461))), Xg.qd("OJJ6", (short) (C1607wl.Xd() ^ 2898), (short) (C1607wl.Xd() ^ 10910)), MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create(C1561oA.yd("?5/!%'i\\XM8:)", (short) (C1580rY.Xd() ^ (-7623))), null);
                    break;
                case 260:
                    short sXd6 = (short) (C1499aX.Xd() ^ (-429));
                    int[] iArr4 = new int["E91$\u001f\u001fcT^Q::'".length()];
                    QB qb4 = new QB("E91$\u001f\u001fcT^Q::'");
                    int i8 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i8] = xuXd4.fK(sXd6 + i8 + xuXd4.CK(iKK4));
                        i8++;
                    }
                    pairCreate = Pair.create(new String(iArr4, 0, i8), null);
                    break;
                default:
                    throw new IllegalArgumentException(str.concat(String.valueOf(Long.toHexString(i2))));
            }
        } else {
            pairCreate = Pair.create(EO.Od("\tOJbFl\u0012s2Y\f\u0001=", (short) (C1607wl.Xd() ^ 14081)), null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(strVd).generatePublic(new X509EncodedKeySpec(bArrZzi));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzf);
            if (!signature.verify(bArrZzi3)) {
                throw new SecurityException(String.valueOf(str2).concat(Xg.qd("qF=<D8LNL@{AGC\u007fOQW\u0004[KYQOc", (short) (FB.Xd() ^ 22116), (short) (FB.Xd() ^ 32619))));
            }
            byteBufferZzf.clear();
            ByteBuffer byteBufferZzf4 = zzf(byteBufferZzf);
            ArrayList arrayList2 = new ArrayList();
            int i9 = 0;
            while (byteBufferZzf4.hasRemaining()) {
                i9++;
                try {
                    ByteBuffer byteBufferZzf5 = zzf(byteBufferZzf4);
                    if (byteBufferZzf5.remaining() < 8) {
                        throw new IOException(C1561oA.od("j|y\u0005\u0007w2\u0006\u007f~.\u0001tz|}", (short) (C1499aX.Xd() ^ (-31404))));
                    }
                    int i10 = byteBufferZzf5.getInt();
                    arrayList2.add(Integer.valueOf(i10));
                    if (i10 == i2) {
                        bArrZzi2 = zzi(byteBufferZzf5);
                    }
                } catch (IOException | BufferUnderflowException e3) {
                    throw new IOException(C1561oA.Kd("Ws|\u0001zz7\r\t:\f}\u0010\u0012\u0005@\u0006\f\u000b\n\u0019\u001bG\u001b\u000f\u000e\u001b\u001f\u0012NR", (short) (OY.Xd() ^ 13987)) + i9, e3);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException(C1561oA.Yd("Ypowk\u007f\u0002\u007fs/q}y\u0003\u0007~\u000b\u007f\u0006\r:\u007f\f\fE\u0014@\u000f\u0004\u0018\b\u000eF\n\u000e\u001e\"\u0011\u0012\u001cN\u0014\u001a\u0019\u0018'))V\u0019'\u001eZ/&%-!575)8e9-,9=0@", (short) (C1499aX.Xd() ^ (-22545))));
            }
            int iZzc3 = zzc(i2);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzc3), bArrZzi2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzi2)) {
                String strZzd = zzd(iZzc3);
                short sXd7 = (short) (C1580rY.Xd() ^ (-30596));
                short sXd8 = (short) (C1580rY.Xd() ^ (-194));
                int[] iArr5 = new int[":1731\b\n\n\u0001\"PSH80.Q\f\u0010ou\u0017_NJg. \u001b~}/z\u0015\fA\u007ff]W_Uj6,\u0017~\u007fvn`K\u007f8Ij\u0012F\u0010\u000ej]UPNyj iE:?/2".length()];
                QB qb5 = new QB(":1731\b\n\n\u0001\"PSH80.Q\f\u0010ou\u0017_NJg. \u001b~}/z\u0015\fA\u007ff]W_Uj6,\u0017~\u007fvn`K\u007f8Ij\u0012F\u0010\u000ej]UPNyj iE:?/2");
                int i11 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i11] = xuXd5.fK(((i11 * sXd8) ^ sXd7) + xuXd5.CK(iKK5));
                    i11++;
                }
                throw new SecurityException(strZzd.concat(new String(iArr5, 0, i11)));
            }
            ByteBuffer byteBufferZzf6 = zzf(byteBufferZzf);
            ArrayList arrayList3 = new ArrayList();
            int i12 = 0;
            while (byteBufferZzf6.hasRemaining()) {
                i12++;
                byte[] bArrZzi4 = zzi(byteBufferZzf6);
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrZzi4);
                    Class<?> cls = Class.forName(C1561oA.Xd("YQgS!gZYljbnt*`cqt/Ehvyomqlk\u007fqSor\u0005\u0001\u0005\r", (short) (ZN.Xd() ^ 12321)));
                    Class<?>[] clsArr = new Class[1];
                    clsArr[0] = Class.forName(Wg.vd("i_s]1kp.Ptuy\u007f]}zTOZ", (short) (C1499aX.Xd() ^ (-32096))));
                    Object[] objArr = {byteArrayInputStream};
                    Method method = cls.getMethod(Qg.kd("\u0004\u0001\t~\u000bx\u000bzWx\u0005\u0006yuwpm\u007fo", (short) (Od.Xd() ^ (-8216)), (short) (Od.Xd() ^ (-31333))), clsArr);
                    try {
                        method.setAccessible(true);
                        arrayList3.add(new zzg((X509Certificate) ((Certificate) method.invoke(certificateFactory, objArr)), bArrZzi4));
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (CertificateException e5) {
                    throw new SecurityException(hg.Vd("Rlsumk&ys#ffcnbb\u001c^_kl`\\^WTfV\u0010\u0012", (short) (Od.Xd() ^ (-21391)), (short) (Od.Xd() ^ (-31899))) + i12, e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException(C1561oA.yd("Hh\u0018Z[gh\\hjc`rbo\u001bVR[[KI", (short) (C1580rY.Xd() ^ (-1354))));
            }
            if (Arrays.equals(bArrZzi, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException(C1561oA.ud("[\u007fktpi%oh{!mhqj]o]a\u0018Y[ikXW_\u0010RS_`TPRKHZJ\u0004DPE\u007fRGDJ<NNJ<uG96AC4", (short) (C1633zX.Xd() ^ (-7882))));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e6) {
            throw new SecurityException(Jg.Wd("\\8\u0007Nu57P\u001a\u000b([\u0017N\u0012i~", (short) (FB.Xd() ^ 11070), (short) (FB.Xd() ^ 3634)) + str2 + ZO.xd("<\u0018\u0016\nL!wa6}", (short) (FB.Xd() ^ 20909), (short) (FB.Xd() ^ 8581)), e6);
        }
    }

    private static byte[][] zzk(int[] iArr, zzb[] zzbVarArr) throws DigestException {
        long j2;
        int i2;
        int length;
        int i3 = 0;
        long j3 = 0;
        int i4 = 0;
        long jZza = 0;
        while (true) {
            j2 = 1048576;
            if (i4 >= 3) {
                break;
            }
            jZza += (zzbVarArr[i4].zza() + 1048575) / 1048576;
            i4++;
        }
        if (jZza >= 2097151) {
            throw new DigestException("Too many chunks: " + jZza);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i5 = 0;
        while (true) {
            length = iArr.length;
            if (i5 >= length) {
                break;
            }
            int i6 = (int) jZza;
            byte[] bArr2 = new byte[(zzb(iArr[i5]) * i6) + 5];
            bArr2[0] = 90;
            zzg(i6, bArr2, 1);
            bArr[i5] = bArr2;
            i5++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            String strZzd = zzd(iArr[i7]);
            try {
                messageDigestArr[i7] = MessageDigest.getInstance(strZzd);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(strZzd.concat(" digest not supported"), e2);
            }
        }
        int i8 = 0;
        int i9 = 0;
        for (i2 = 3; i8 < i2; i2 = 3) {
            zzb zzbVar = zzbVarArr[i8];
            long jZza2 = zzbVar.zza();
            long j4 = j3;
            while (jZza2 > j3) {
                int iMin = (int) Math.min(jZza2, j2);
                zzg(iMin, bArr3, 1);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr3);
                }
                try {
                    zzbVar = zzbVar;
                    zzbVar.zzb(messageDigestArr, j4, iMin);
                    for (int i11 = 0; i11 < iArr.length; i11++) {
                        int i12 = iArr[i11];
                        byte[] bArr4 = bArr[i11];
                        int iZzb = zzb(i12);
                        MessageDigest messageDigest = messageDigestArr[i11];
                        int iDigest = messageDigest.digest(bArr4, (i9 * iZzb) + 5, iZzb);
                        if (iDigest != iZzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                    }
                    long j5 = iMin;
                    j4 += j5;
                    jZza2 -= j5;
                    i9++;
                    j3 = 0;
                    j2 = 1048576;
                } catch (IOException e3) {
                    throw new DigestException("Failed to digest chunk #" + i9 + " of section #" + i3, e3);
                }
            }
            i3++;
            i8++;
            j3 = 0;
            j2 = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr6 = bArr[i13];
            String strZzd2 = zzd(i14);
            try {
                bArr5[i13] = MessageDigest.getInstance(strZzd2).digest(bArr6);
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(strZzd2.concat(" digest not supported"), e4);
            }
        }
        return bArr5;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zze zzeVar) throws Throwable {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        String strUd = C1626yg.Ud("t\u0016V&\b", (short) (C1580rY.Xd() ^ (-23373)), (short) (C1580rY.Xd() ^ (-10382)));
        try {
            Class<?> cls = Class.forName(Ig.wd("Q\u001bBD\t\u0012g-\u0015!\u0016G\u001aP\u0002)}u\u0007S;$\u0010\u0005cZ2cl+opF5'oP", (short) (C1499aX.Xd() ^ (-27353))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (Od.Xd() ^ (-18542));
            int[] iArr = new int["L|s>\u0013\u0007\u0010Tp+FMzs\u0019w".length()];
            QB qb = new QB("L|s>\u0013\u0007\u0010Tp+FMzs\u0019w");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {strUd};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Qd("\b\u0005\u0013f\u000b\u000f\u000fz\u0007z{", (short) (OY.Xd() ^ 24309)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr);
                try {
                    ByteBuffer byteBufferZzf = zzf(zzeVar.zza);
                    int i3 = 0;
                    while (byteBufferZzf.hasRemaining()) {
                        i3++;
                        try {
                            arrayList.add(zzj(zzf(byteBufferZzf), map, certificateFactory));
                        } catch (IOException | SecurityException | BufferUnderflowException e2) {
                            short sXd2 = (short) (FB.Xd() ^ 871);
                            short sXd3 = (short) (FB.Xd() ^ 27559);
                            int[] iArr2 = new int["\u0012.7;55qGCtF8JL?\nRBPHFZ\u0002VMLTLZ\t\r".length()];
                            QB qb2 = new QB("\u0012.7;55qGCtF8JL?\nRBPHFZ\u0002VMLTLZ\t\r");
                            int i4 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i4)) - sXd3);
                                i4++;
                            }
                            throw new SecurityException(new String(iArr2, 0, i4) + i3 + C1561oA.od("3t}\u007fry", (short) (C1633zX.Xd() ^ (-25857))), e2);
                        }
                    }
                    if (i3 <= 0) {
                        throw new SecurityException(Wg.Zd("(2tPXl\u0018%DU\u0014@]yt\u0003", (short) (FB.Xd() ^ 20762), (short) (FB.Xd() ^ QuickTimeMetadataDirectory.TAG_PRODUCER)));
                    }
                    if (map.isEmpty()) {
                        throw new SecurityException(C1561oA.Kd("\u001c>o4AAH:DKw=CBAPRR\u007fGQXRI", (short) (ZN.Xd() ^ 11829)));
                    }
                    zzh(map, fileChannel, zzeVar.zzb, zzeVar.zzc, zzeVar.zzd, zzeVar.zze);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (IOException e3) {
                    throw new SecurityException(C1561oA.Xd("'CLPJJ\u0007\\X\n]QNR\u000f\\Zeg\u0014d\\\u0017kbaiaoq", (short) (ZN.Xd() ^ 16016)), e3);
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (CertificateException e5) {
            throw new RuntimeException(Wg.vd("C]dffd\u001frt$rd}ipt\rD\u0019\u001f!)\u000f1Zfg[_aZW\u0012\u0002a{\u0005\u0015\u000f\u0011\u001f", (short) (Od.Xd() ^ (-263))), e5);
        }
    }
}
