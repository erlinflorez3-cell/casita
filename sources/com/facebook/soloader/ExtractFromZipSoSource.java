package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.UnpackingSoSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
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

/* JADX INFO: loaded from: classes3.dex */
public class ExtractFromZipSoSource extends UnpackingSoSource {
    private static final String TAG = "soloader.ExtractFromZipSoSource";
    protected final File mZipFileName;
    protected final String mZipSearchPattern;

    protected static final class ZipDso extends UnpackingSoSource.Dso implements Comparable<ZipDso> {
        final int abiScore;
        final ZipEntry backingEntry;

        /* JADX WARN: Illegal instructions before constructor call */
        ZipDso(String str, ZipEntry zipEntry, int i2) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("/%9#v=;/9yE3A})7E\u0019AFKQ", (short) (OY.Xd() ^ 30292))).getMethod(Qg.kd("\u0012\u000f\u001dj\u0019\t", (short) (FB.Xd() ^ 26119), (short) (FB.Xd() ^ 32510)), new Class[0]);
            try {
                method.setAccessible(true);
                super(str, String.valueOf(((Long) method.invoke(zipEntry, objArr)).longValue()));
                this.backingEntry = zipEntry;
                this.abiScore = i2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(ZipDso zipDso) {
            return this.name.compareTo(zipDso.name);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ZipDso zipDso = (ZipDso) obj;
            return this.backingEntry.equals(zipDso.backingEntry) && this.abiScore == zipDso.abiScore;
        }

        public int hashCode() throws Throwable {
            int i2 = this.abiScore * 31;
            ZipEntry zipEntry = this.backingEntry;
            short sXd = (short) (ZN.Xd() ^ 25371);
            short sXd2 = (short) (ZN.Xd() ^ 15071);
            int[] iArr = new int["\u000b\u0001\u0015~J\u0011\u000f\u0003\u0005E\u0011~\u0005Alz\u0001T|\u0002~\u0005".length()];
            QB qb = new QB("\u000b\u0001\u0015~J\u0011\u000f\u0003\u0005E\u0011~\u0005Alz\u0001T|\u0002~\u0005");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
                i3++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i3)).getMethod(C1561oA.ud("]UfZ4_SS", (short) (FB.Xd() ^ 30315)), new Class[0]);
            try {
                method.setAccessible(true);
                return i2 + ((Integer) method.invoke(zipEntry, objArr)).intValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    protected class ZipUnpacker extends UnpackingSoSource.Unpacker {

        @Nullable
        protected ZipDso[] mDsos;
        private final UnpackingSoSource mSoSource;
        private final ZipFile mZipFile;

        ZipUnpacker(UnpackingSoSource unpackingSoSource) throws Throwable {
            Object[] objArr = {ExtractFromZipSoSource.this.mZipFileName};
            Constructor<?> constructor = Class.forName(C1561oA.yd("_WmY\u001fgg]Y\u001ciYY\u0018EUuLptf", (short) (ZN.Xd() ^ 23900))).getConstructor(Class.forName(C1561oA.Yd("@8N:\bDK\u000b$HLF", (short) (FB.Xd() ^ 22476))));
            try {
                constructor.setAccessible(true);
                this.mZipFile = (ZipFile) constructor.newInstance(objArr);
                this.mSoSource = unpackingSoSource;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            ZipFile zipFile = this.mZipFile;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Xg.qd("\u001a\u0012(\u0014a** $f4$,j\u0018(0\u0007+/)", (short) (OY.Xd() ^ 32314), (short) (OY.Xd() ^ 25695))).getMethod(Jg.Wd("S{GM\u0007", (short) (Od.Xd() ^ (-3340)), (short) (Od.Xd() ^ (-3462))), new Class[0]);
            try {
                method.setAccessible(true);
                method.invoke(zipFile, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        ZipDso[] computeDsosFromZip() throws Throwable {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap map = new HashMap();
            Pattern patternCompile = Pattern.compile(ExtractFromZipSoSource.this.mZipSearchPattern);
            String[] supportedAbis = SysUtil.getSupportedAbis();
            ZipFile zipFile = this.mZipFile;
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("T\u0018\u0007Umz\u001c&MAy\tD\f@q]/\u0015i\u000f", (short) (C1580rY.Xd() ^ (-22270)), (short) (C1580rY.Xd() ^ (-5275)))).getMethod(C1626yg.Ud("<[z\u001c1\u00044", (short) (C1607wl.Xd() ^ 4619), (short) (C1607wl.Xd() ^ 23618)), new Class[0]);
            try {
                method.setAccessible(true);
                Enumeration enumeration = (Enumeration) method.invoke(zipFile, objArr);
                while (enumeration.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) enumeration.nextElement();
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Ig.wd("\t(k\u0006I<_\u0004@q8\u0011I\u0005I:hO0>uT", (short) (Od.Xd() ^ (-13432)))).getMethod(EO.Od("\"GF\u0007cLV", (short) (ZN.Xd() ^ 24144)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        Matcher matcher = patternCompile.matcher((String) method2.invoke(zipEntry, objArr2));
                        if (matcher.matches()) {
                            int iGroupCount = matcher.groupCount();
                            String strGroup = matcher.group(iGroupCount - 1);
                            String strGroup2 = matcher.group(iGroupCount);
                            int iFindAbiScore = SysUtil.findAbiScore(supportedAbis, strGroup);
                            if (iFindAbiScore >= 0) {
                                linkedHashSet.add(strGroup);
                                ZipDso zipDso = (ZipDso) map.get(strGroup2);
                                if (zipDso == null || iFindAbiScore < zipDso.abiScore) {
                                    map.put(strGroup2, new ZipDso(strGroup2, zipEntry, iFindAbiScore));
                                }
                            }
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                this.mSoSource.setSoSourceAbis((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                ZipDso[] zipDsoArr = (ZipDso[]) map.values().toArray(new ZipDso[map.size()]);
                Arrays.sort(zipDsoArr);
                return zipDsoArr;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public final UnpackingSoSource.Dso[] getDsos() throws IOException {
            return getExtractableDsosFromZip();
        }

        ZipDso[] getExtractableDsosFromZip() throws Throwable {
            ZipDso[] zipDsoArr = this.mDsos;
            if (zipDsoArr != null) {
                return zipDsoArr;
            }
            ZipDso[] zipDsoArrComputeDsosFromZip = computeDsosFromZip();
            this.mDsos = zipDsoArrComputeDsosFromZip;
            return zipDsoArrComputeDsosFromZip;
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public void unpack(File file) throws Throwable {
            byte[] bArr = new byte[32768];
            for (ZipDso zipDso : getExtractableDsosFromZip()) {
                ZipFile zipFile = this.mZipFile;
                ZipEntry zipEntry = zipDso.backingEntry;
                short sXd = (short) (Od.Xd() ^ (-10514));
                int[] iArr = new int["&\u001c0\u001ae,*\u001e `,\u001a \\\b\u0016\u001cp\u0013\u0015\r".length()];
                QB qb = new QB("&\u001c0\u001ae,*\u001e `,\u001a \\\b\u0016\u001cp\u0013\u0015\r");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[1];
                short sXd2 = (short) (C1499aX.Xd() ^ (-24050));
                short sXd3 = (short) (C1499aX.Xd() ^ (-5393));
                int[] iArr2 = new int[",$:&s<<26xF6>|*:B\u0018BIHP".length()];
                QB qb2 = new QB(",$:&s<<26xF6>|*:B\u0018BIHP");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr = {zipEntry};
                Method method = cls.getMethod(C1561oA.od("GDR&JKOM+KH:5@", (short) (FB.Xd() ^ 4094)), clsArr);
                try {
                    method.setAccessible(true);
                    InputStream inputStream = (InputStream) method.invoke(zipFile, objArr);
                    try {
                        UnpackingSoSource.InputDso inputDso = new UnpackingSoSource.InputDso(zipDso, inputStream);
                        try {
                            extractDso(inputDso, bArr, file);
                            inputDso.close();
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    public ExtractFromZipSoSource(Context context, File file, File file2, String str) {
        super(context, file);
        this.mZipFileName = file2;
        this.mZipSearchPattern = str;
    }

    public ExtractFromZipSoSource(Context context, String str, File file, String str2) {
        super(context, str);
        this.mZipFileName = file;
        this.mZipSearchPattern = str2;
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    protected String computeFileHash(File file) {
        FileInputStream fileInputStream;
        CRC32 crc32;
        byte[] bArr;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                crc32 = new CRC32();
                bArr = new byte[1024];
            } finally {
            }
        } catch (IOException e2) {
            LogUtil.w(TAG, "Failed to compute file hash ", e2);
            return "";
        }
        while (true) {
            int i2 = fileInputStream.read(bArr);
            if (i2 == -1) {
                String strValueOf = String.valueOf(crc32.getValue());
                fileInputStream.close();
                return strValueOf;
            }
            crc32.update(bArr, 0, i2);
            LogUtil.w(TAG, "Failed to compute file hash ", e2);
            return "";
        }
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public String getName() {
        return "ExtractFromZipSoSource";
    }

    public boolean hasZippedLibs() throws Throwable {
        ZipUnpacker zipUnpacker = new ZipUnpacker(this);
        try {
            boolean z2 = zipUnpacker.computeDsosFromZip().length != 0;
            zipUnpacker.close();
            return z2;
        } catch (Throwable th) {
            try {
                zipUnpacker.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    protected UnpackingSoSource.Unpacker makeUnpacker() throws IOException {
        return new ZipUnpacker(this);
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public String toString() {
        try {
            return this.mZipFileName.getCanonicalPath();
        } catch (IOException unused) {
            return this.mZipFileName.getName();
        }
    }
}
