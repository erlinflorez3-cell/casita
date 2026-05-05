package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
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

/* JADX INFO: loaded from: classes4.dex */
final class MultiDexExtractor implements Closeable {
    private static final int BUFFER_SIZE = 16384;
    private static final String DEX_PREFIX = "classes";
    static final String DEX_SUFFIX = ".dex";
    private static final String EXTRACTED_NAME_EXT = ".classes";
    static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_CRC = "crc";
    private static final String KEY_DEX_CRC = "dex.crc.";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String KEY_DEX_TIME = "dex.time.";
    private static final String KEY_TIME_STAMP = "timestamp";
    private static final String LOCK_FILENAME = "MultiDex.lock";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final String PREFS_FILE = "multidex.version";
    private static final String TAG = "MultiDex";
    private final FileLock cacheLock;
    private final File dexDir;
    private final FileChannel lockChannel;
    private final RandomAccessFile lockRaf;
    private final File sourceApk;
    private final long sourceCrc;

    private static class ExtractedDex extends File {
        public long crc;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    MultiDexExtractor(File file, File file2) throws IOException {
        String str = "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")";
        this.sourceApk = file;
        this.dexDir = file2;
        this.sourceCrc = getZipCrc(file);
        File file3 = new File(file2, LOCK_FILENAME);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.lockRaf = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.lockChannel = channel;
            try {
                String str2 = "Blocking on lock " + file3.getPath();
                this.cacheLock = channel.lock();
                String str3 = file3.getPath() + " locked";
            } catch (IOException | Error | RuntimeException e2) {
                closeQuietly(this.lockChannel);
                throw e2;
            }
        } catch (IOException | Error | RuntimeException e3) {
            closeQuietly(this.lockRaf);
            throw e3;
        }
    }

    List<? extends File> load(Context context, String str, boolean z2) throws Throwable {
        List<ExtractedDex> listPerformExtractions;
        String str2 = "MultiDexExtractor.load(" + this.sourceApk.getPath() + ", " + z2 + ", " + str + ")";
        if (!this.cacheLock.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z2 && !isModified(context, this.sourceApk, this.sourceCrc, str)) {
            try {
                listPerformExtractions = loadExistingExtractions(context, str);
            } catch (IOException e2) {
                listPerformExtractions = performExtractions();
                putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, listPerformExtractions);
            }
        } else {
            if (z2) {
            }
            listPerformExtractions = performExtractions();
            putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, listPerformExtractions);
        }
        String str3 = "load found " + listPerformExtractions.size() + " secondary dex files";
        return listPerformExtractions;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cacheLock.release();
        this.lockChannel.close();
        this.lockRaf.close();
    }

    private List<ExtractedDex> loadExistingExtractions(Context context, String str) throws Throwable {
        String str2 = this.sourceApk.getName() + EXTRACTED_NAME_EXT;
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        int i2 = multiDexPreferences.getInt(str + KEY_DEX_NUMBER, 1);
        ArrayList arrayList = new ArrayList(i2 - 1);
        for (int i3 = 2; i3 <= i2; i3++) {
            ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str2 + i3 + EXTRACTED_SUFFIX);
            if (extractedDex.isFile()) {
                extractedDex.crc = getZipCrc(extractedDex);
                long j2 = multiDexPreferences.getLong(str + KEY_DEX_CRC + i3, -1L);
                long j3 = multiDexPreferences.getLong(str + KEY_DEX_TIME + i3, -1L);
                long jLastModified = extractedDex.lastModified();
                if (j3 != jLastModified || j2 != extractedDex.crc) {
                    throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j3 + ", modification time: " + jLastModified + ", expected crc: " + j2 + ", file crc: " + extractedDex.crc);
                }
                arrayList.add(extractedDex);
            } else {
                throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
            }
        }
        return arrayList;
    }

    private static boolean isModified(Context context, File file, long j2, String str) throws Throwable {
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        return (multiDexPreferences.getLong(new StringBuilder().append(str).append("timestamp").toString(), -1L) == getTimeStamp(file) && multiDexPreferences.getLong(new StringBuilder().append(str).append(KEY_CRC).toString(), -1L) == j2) ? false : true;
    }

    private static long getTimeStamp(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long getZipCrc(File file) throws IOException {
        long zipCrc = ZipUtil.getZipCrc(file);
        return zipCrc == -1 ? zipCrc - 1 : zipCrc;
    }

    private List<ExtractedDex> performExtractions() throws Throwable {
        EO.Od("aB\u001e\b\u000bF\u001c\u001bPs7\u001cM]U0G2\u001b-mIV^", (short) (FB.Xd() ^ 27546));
        short sXd = (short) (ZN.Xd() ^ 21600);
        int[] iArr = new int["\u0019@6=1\u000b+=".length()];
        QB qb = new QB("\u0019@6=1\u000b+=");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        new String(iArr, 0, i2);
        String str = this.sourceApk.getName() + C1593ug.zd("\u001cR\\RefYh", (short) (OY.Xd() ^ 10710), (short) (OY.Xd() ^ 5340));
        clearDexDir();
        ArrayList arrayList = new ArrayList();
        Object[] objArr = {this.sourceApk};
        Constructor<?> constructor = Class.forName(C1561oA.od(",\"6 k20$&f2 &b\u000e\u001c\"v\u0019\u001b\u0013", (short) (C1607wl.Xd() ^ 24153))).getConstructor(Class.forName(C1561oA.Kd(")!7#p-4s\r15/", (short) (C1633zX.Xd() ^ (-22031)))));
        try {
            constructor.setAccessible(true);
            ZipFile zipFile = (ZipFile) constructor.newInstance(objArr);
            String strZd = Wg.Zd("K\u0017\u0010:}i\u001a\u001b)i\u001c[", (short) (ZN.Xd() ^ 7331), (short) (ZN.Xd() ^ 11078));
            try {
                Class<?> cls = Class.forName(C1561oA.Xd("\u0011\t\u001f\u000bX!!\u0017\u001b]+\u001b#a\u000f\u001f'}\"& ", (short) (C1580rY.Xd() ^ (-14273))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(Wg.vd("7-A+~<0<,q\u00166;15-", (short) (Od.Xd() ^ (-11407))));
                Object[] objArr2 = {strZd};
                Method method = cls.getMethod(Qg.kd("*'5\u0005-2/5", (short) (OY.Xd() ^ 29314), (short) (OY.Xd() ^ 25761)), clsArr);
                try {
                    method.setAccessible(true);
                    ZipEntry zipEntry = (ZipEntry) method.invoke(zipFile, objArr2);
                    int i3 = 2;
                    while (zipEntry != null) {
                        ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str + i3 + hg.Vd("&q_e", (short) (C1607wl.Xd() ^ 3829), (short) (C1607wl.Xd() ^ 23898)));
                        arrayList.add(extractedDex);
                        String str2 = C1561oA.ud("8jebPQaUZX\tQZ\u0006SIHFFD~DLNz@BD<u", (short) (C1580rY.Xd() ^ (-14379))) + extractedDex;
                        int i4 = 0;
                        boolean z2 = false;
                        while (i4 < 3 && !z2) {
                            i4++;
                            extract(zipFile, zipEntry, extractedDex, str);
                            try {
                                extractedDex.crc = getZipCrc(extractedDex);
                                z2 = true;
                            } catch (IOException e2) {
                                String str3 = C1561oA.yd("\n$+--+e9+Z,\u001e!#] &\u0016Q\u0017*&#T", (short) (OY.Xd() ^ 7411)) + extractedDex.getAbsolutePath();
                                z2 = false;
                            }
                            StringBuilder sbAppend = new StringBuilder().append(C1561oA.Yd("T\t\u0006\u0005tw\n\u007f\u0007\u00079", (short) (C1580rY.Xd() ^ (-2520)))).append(z2 ? Xg.qd("cfUVYZZ\\\\", (short) (Od.Xd() ^ (-27735)), (short) (Od.Xd() ^ (-19559))) : Jg.Wd("b=%\u0003Y7", (short) (C1499aX.Xd() ^ (-14767)), (short) (C1499aX.Xd() ^ (-13806)))).append(ZO.xd("<\u0003", (short) (C1633zX.Xd() ^ (-21274)), (short) (C1633zX.Xd() ^ (-27875)))).append(extractedDex.getAbsolutePath()).append(C1626yg.Ud("C%_&`0aX\u001d`", (short) (Od.Xd() ^ (-11856)), (short) (Od.Xd() ^ (-17166)))).append(extractedDex.length());
                            short sXd2 = (short) (ZN.Xd() ^ 18915);
                            int[] iArr2 = new int["#Y|b0s d".length()];
                            QB qb2 = new QB("#Y|b0s d");
                            int i5 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd2 + i5)));
                                i5++;
                            }
                            sbAppend.append(new String(iArr2, 0, i5)).append(extractedDex.crc).toString();
                            if (!z2) {
                                extractedDex.delete();
                                if (extractedDex.exists()) {
                                    String str4 = EO.Od("nd.\u000e~\"\u0006\u00030A[\u0007\\GF]\\\u000ebQ\u0014_\u0005\u0005w\u001f|\u0001\u0019)]\u0003\t$&c4\u0019z Gf", (short) (C1633zX.Xd() ^ (-7008))) + extractedDex.getPath() + C1561oA.Qd("\u0016", (short) (C1607wl.Xd() ^ 7630));
                                }
                            }
                        }
                        if (!z2) {
                            throw new IOException(Wg.vd("\u0001,1'&`..*T\u0017%\u001f\u001a,\u001cM'\u0015\u001bQ\u0017\u0019\u001b\u000bD", (short) (ZN.Xd() ^ OlympusMakernoteDirectory.TAG_COLOR_TEMPERATURE_RG)) + extractedDex.getAbsolutePath() + Qg.kd("/t|~+}nkvtieu{!ddv\u001d$", (short) (FB.Xd() ^ 6495), (short) (FB.Xd() ^ 15219)) + i3 + hg.Vd(Global.SEMICOLON, (short) (C1633zX.Xd() ^ (-13072)), (short) (C1633zX.Xd() ^ (-16399))));
                        }
                        i3++;
                        String str5 = C1593ug.zd("JTJ]^Q`", (short) (C1633zX.Xd() ^ (-4560)), (short) (C1633zX.Xd() ^ (-25436))) + i3 + C1561oA.od("\u000277I", (short) (C1633zX.Xd() ^ (-14830)));
                        short sXd3 = (short) (Od.Xd() ^ (-1495));
                        int[] iArr3 = new int[" \u0018.\u001ag00&*l:*2p\u001e.6\r15/".length()];
                        QB qb3 = new QB(" \u0018.\u001ag00&*l:*2p\u001e.6\r15/");
                        int i6 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i6] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd3 + sXd3) + i6));
                            i6++;
                        }
                        Class<?> cls2 = Class.forName(new String(iArr3, 0, i6));
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[0] = Class.forName(Wg.Zd("w\rPid_\u0003>eL o\u001cO\u0003*", (short) (C1580rY.Xd() ^ (-26985)), (short) (C1580rY.Xd() ^ (-7169))));
                        Object[] objArr3 = {str5};
                        Method method2 = cls2.getMethod(C1561oA.Xd("\b\u0007\u0017h\u0013\u001a\u0019!", (short) (OY.Xd() ^ 6803)), clsArr2);
                        try {
                            method2.setAccessible(true);
                            zipEntry = (ZipEntry) method2.invoke(zipFile, objArr3);
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    try {
                        Object[] objArr4 = new Object[0];
                        Method method3 = Class.forName(C1561oA.ud("MCWA\rSQEG\bSAG\u0004/=C\u0018:<4", (short) (ZN.Xd() ^ 25751))).getMethod(C1561oA.yd("EMORC", (short) (Od.Xd() ^ (-12158))), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            method3.invoke(zipFile, objArr4);
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    } catch (IOException e5) {
                    }
                    return arrayList;
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            } catch (Throwable th) {
                short sXd4 = (short) (C1607wl.Xd() ^ 4888);
                int[] iArr4 = new int["5-C/|EE;?\u0002O?G\u00063CK\"FJD".length()];
                QB qb4 = new QB("5-C/|EE;?\u0002O?G\u00063CK\"FJD");
                int i7 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i7] = xuXd4.fK(xuXd4.CK(iKK4) - (((sXd4 + sXd4) + sXd4) + i7));
                    i7++;
                }
                try {
                    Object[] objArr5 = new Object[0];
                    Method method4 = Class.forName(new String(iArr4, 0, i7)).getMethod(Xg.qd("jtx}p", (short) (C1633zX.Xd() ^ (-3619)), (short) (C1633zX.Xd() ^ (-24943))), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        method4.invoke(zipFile, objArr5);
                    } catch (InvocationTargetException e7) {
                        throw e7.getCause();
                    }
                } catch (IOException e8) {
                }
                throw th;
            }
        } catch (InvocationTargetException e9) {
            throw e9.getCause();
        }
    }

    private static void putStoredApkInfo(Context context, String str, long j2, long j3, List<ExtractedDex> list) {
        SharedPreferences.Editor editorEdit = getMultiDexPreferences(context).edit();
        editorEdit.putLong(str + "timestamp", j2);
        editorEdit.putLong(str + KEY_CRC, j3);
        editorEdit.putInt(str + KEY_DEX_NUMBER, list.size() + 1);
        int i2 = 2;
        for (ExtractedDex extractedDex : list) {
            editorEdit.putLong(str + KEY_DEX_CRC + i2, extractedDex.crc);
            editorEdit.putLong(str + KEY_DEX_TIME + i2, extractedDex.lastModified());
            i2++;
        }
        editorEdit.commit();
    }

    private static SharedPreferences getMultiDexPreferences(Context context) throws Throwable {
        Object[] objArr = {Jg.Wd("|_Z^PG,:j/\"\f\tz\u0004y", (short) (C1607wl.Xd() ^ 13595), (short) (C1607wl.Xd() ^ 25939)), 4};
        Method method = Class.forName(ZO.xd(",\u0002\u001a/]^I3\u000bSc\u007f\bmFNnz\\/Fsg", (short) (C1499aX.Xd() ^ (-25942)), (short) (C1499aX.Xd() ^ (-9099)))).getMethod(Ig.wd("/}^\u0016b\u001eSN\"^~W%&/\tXC\u001ec", (short) (FB.Xd() ^ 8856)), Class.forName(C1626yg.Ud("[c5t\r;@)\u0004NG(I\u0007.,", (short) (C1580rY.Xd() ^ (-5337)), (short) (C1580rY.Xd() ^ (-27221)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return (SharedPreferences) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: androidx.multidex.MultiDexExtractor$1 */
    class AnonymousClass1 implements FileFilter {
        AnonymousClass1() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals(MultiDexExtractor.LOCK_FILENAME);
        }
    }

    private void clearDexDir() {
        File[] fileArrListFiles = this.dexDir.listFiles(new FileFilter() { // from class: androidx.multidex.MultiDexExtractor.1
            AnonymousClass1() {
            }

            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return !file.getName().equals(MultiDexExtractor.LOCK_FILENAME);
            }
        });
        if (fileArrListFiles == null) {
            String str = "Failed to list secondary dex dir content (" + this.dexDir.getPath() + ").";
            return;
        }
        for (File file : fileArrListFiles) {
            String str2 = "Trying to delete old file " + file.getPath() + " of size " + file.length();
            if (file.delete()) {
                String str3 = "Deleted old file " + file.getPath();
            } else {
                String str4 = "Failed to delete old file " + file.getPath();
            }
        }
    }

    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-20733));
        int[] iArr = new int["80B.w@<2B\u0005N>B\u0001*:.\u0005%)\u001f".length()];
        QB qb = new QB("80B.w@<2B\u0005N>B\u0001*:.\u0005%)\u001f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("ldzf4||rv9\u0007v~=jz\u0003X\u0003\n\t\u0011", (short) (ZN.Xd() ^ 8991)))};
        Object[] objArr = {zipEntry};
        short sXd2 = (short) (ZN.Xd() ^ 16744);
        short sXd3 = (short) (ZN.Xd() ^ 15697);
        int[] iArr2 = new int["XWg=cfllLnma^k".length()];
        QB qb2 = new QB("XWg=cfllLnma^k");
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
            InputStream inputStream = (InputStream) method.invoke(zipFile, objArr);
            File fileCreateTempFile = File.createTempFile(Jg.Wd("*sj+", (short) (ZN.Xd() ^ 21288), (short) (ZN.Xd() ^ 17662)) + str, ZO.xd("GR\u0004\\", (short) (C1499aX.Xd() ^ (-16120)), (short) (C1499aX.Xd() ^ (-25074))), file.getParentFile());
            String str2 = C1626yg.Ud("\u00011^\u001d@:IKr_H", (short) (ZN.Xd() ^ 7341), (short) (ZN.Xd() ^ 24682)) + fileCreateTempFile.getPath();
            Ig.wd("nsz\u001d\u007f\u0015\u0014\u0016", (short) (OY.Xd() ^ 1519));
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
                try {
                    String strOd = EO.Od("\rD)!\u00129aU3&=", (short) (C1633zX.Xd() ^ (-30387)));
                    Class<?> cls2 = Class.forName(C1561oA.Qd("OEYC\u000fUSGI\nUCI\u00061?E\u0019AFCI", (short) (C1499aX.Xd() ^ (-1877))));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Class.forName(C1593ug.zd("#\u001b1\u001dj* .(o\u001687/5/", (short) (C1607wl.Xd() ^ 12034), (short) (C1607wl.Xd() ^ 10666)));
                    Object[] objArr2 = {strOd};
                    Constructor<?> constructor = cls2.getConstructor(clsArr2);
                    try {
                        constructor.setAccessible(true);
                        ZipEntry zipEntry2 = (ZipEntry) constructor.newInstance(objArr2);
                        Object[] objArr3 = new Object[0];
                        Method method2 = Class.forName(C1561oA.od("\b}\u0012{G\u000e\f\u007f\u0002B\u000e{\u0002>iw}Qy~{\u0002", (short) (OY.Xd() ^ 20426))).getMethod(C1561oA.Kd("\u000e\r\u001d}\u0014\u0019\u0012", (short) (C1499aX.Xd() ^ (-18371))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            long jLongValue = ((Long) method2.invoke(zipEntry, objArr3)).longValue();
                            Class<?> cls3 = Class.forName(Wg.Zd("T-\b(\u001a\u0017[\u0006nes\u0018D7)mZdS\u000f.z", (short) (C1633zX.Xd() ^ (-28469)), (short) (C1633zX.Xd() ^ (-18899))));
                            Class<?>[] clsArr3 = {Long.TYPE};
                            Object[] objArr4 = {Long.valueOf(jLongValue)};
                            Method method3 = cls3.getMethod(C1561oA.Xd("I<L-CHA", (short) (Od.Xd() ^ (-11747))), clsArr3);
                            try {
                                method3.setAccessible(true);
                                method3.invoke(zipEntry2, objArr4);
                                zipOutputStream.putNextEntry(zipEntry2);
                                byte[] bArr = new byte[16384];
                                for (int i4 = inputStream.read(bArr); i4 != -1; i4 = inputStream.read(bArr)) {
                                    zipOutputStream.write(bArr, 0, i4);
                                }
                                zipOutputStream.closeEntry();
                                zipOutputStream.close();
                                if (!fileCreateTempFile.setReadOnly()) {
                                    StringBuilder sbAppend = new StringBuilder().append(C1561oA.yd("\b\")++)c7)X%\u00180([-\u0017\u0012\u0014\u001e$!-RK", (short) (Od.Xd() ^ (-6642)))).append(fileCreateTempFile.getAbsolutePath());
                                    short sXd4 = (short) (C1580rY.Xd() ^ (-18512));
                                    int[] iArr3 = new int["CBK\u0019\u0013\u0017G\u0018\u0010JM".length()];
                                    QB qb3 = new QB("CBK\u0019\u0013\u0017G\u0018\u0010JM");
                                    int i5 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd4 + sXd4) + sXd4) + i5));
                                        i5++;
                                    }
                                    throw new IOException(sbAppend.append(new String(iArr3, 0, i5)).append(file.getAbsolutePath()).append(Xg.qd("QY", (short) (C1580rY.Xd() ^ (-2894)), (short) (C1580rY.Xd() ^ (-1958)))).toString());
                                }
                                String str3 = Wg.vd("Vjthmjpj,\u0002}/", (short) (OY.Xd() ^ 32611)) + file.getPath();
                                if (!fileCreateTempFile.renameTo(file)) {
                                    throw new IOException(Qg.kd("s\u000e\u0015\u0017\u000f\rG\u001b\u0015D\u0016\b\u0010\u0002\r\u0004=>", (short) (Od.Xd() ^ (-28365)), (short) (Od.Xd() ^ (-30410))) + fileCreateTempFile.getAbsolutePath() + hg.Vd("\u0010\r`Z\n\u000b", (short) (FB.Xd() ^ 30282), (short) (FB.Xd() ^ 5952)) + file.getAbsolutePath() + C1561oA.ud("\u0003", (short) (C1580rY.Xd() ^ (-15072))));
                                }
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (Throwable th) {
                    zipOutputStream.close();
                    throw th;
                }
            } finally {
                closeQuietly(inputStream);
                fileCreateTempFile.delete();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
        }
    }
}
