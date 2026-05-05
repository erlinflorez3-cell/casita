package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UnpackingSoSource extends DirectorySoSource implements AsyncInitSoSource {
    protected static final String DEPS_FILE_NAME = "dso_deps";
    protected static final String LOCK_FILE_NAME = "dso_lock";
    private static final byte STATE_CLEAN = 1;
    private static final byte STATE_DIRTY = 0;
    protected static final String STATE_FILE_NAME = "dso_state";
    private static final String TAG = "fb-UnpackingSoSource";

    @Nullable
    private String[] mAbis;
    protected final Context mContext;

    /* JADX INFO: renamed from: com.facebook.soloader.UnpackingSoSource$1 */
    class AnonymousClass1 implements FilenameFilter {
        AnonymousClass1() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str.equals(UnpackingSoSource.STATE_FILE_NAME) || str.equals(UnpackingSoSource.LOCK_FILE_NAME) || str.equals(UnpackingSoSource.DEPS_FILE_NAME)) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.soloader.UnpackingSoSource$2 */
    class AnonymousClass2 implements Runnable {
        final /* synthetic */ FileLocker val$lock;
        final /* synthetic */ boolean val$runFsync;
        final /* synthetic */ File val$stateFileName;

        AnonymousClass2(boolean z2, File file, FileLocker fileLocker) {
            z = z2;
            file = file;
            fileLocker = fileLocker;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.v(UnpackingSoSource.TAG, "starting syncer worker");
            try {
                try {
                    if (z) {
                        SysUtil.fsyncAll(UnpackingSoSource.this.soDirectory);
                    }
                    UnpackingSoSource.writeState(file, (byte) 1, z);
                } finally {
                    LogUtil.v(UnpackingSoSource.TAG, "releasing dso store lock for " + UnpackingSoSource.this.soDirectory + " (from syncer thread)");
                    fileLocker.close();
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public static class Dso {
        public final String hash;
        public final String name;

        public Dso(String str, String str2) {
            this.name = str;
            this.hash = str2;
        }
    }

    protected static final class InputDso implements Closeable {
        private final InputStream content;
        private final Dso dso;

        public InputDso(Dso dso, InputStream inputStream) {
            this.dso = dso;
            this.content = inputStream;
        }

        public int available() throws IOException {
            return this.content.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.content.close();
        }

        public Dso getDso() {
            return this.dso;
        }
    }

    protected static abstract class Unpacker implements Closeable {
        protected Unpacker() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        /* JADX WARN: Removed duplicated region for block: B:75:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x006f A[Catch: all -> 0x00be, TryCatch #7 {all -> 0x00be, blocks: (B:73:0x005b, B:76:0x006f, B:77:0x0081), top: B:116:0x005b }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void extractDso(com.facebook.soloader.UnpackingSoSource.InputDso r16, byte[] r17, java.io.File r18) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 286
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.Unpacker.extractDso(com.facebook.soloader.UnpackingSoSource$InputDso, byte[], java.io.File):void");
        }

        public abstract Dso[] getDsos() throws IOException;

        public abstract void unpack(File file) throws IOException;
    }

    protected UnpackingSoSource(Context context, File file) {
        this(context, file, true);
    }

    protected UnpackingSoSource(Context context, File file, boolean z2) {
        super(file, z2 ? 1 : 0);
        this.mContext = context;
    }

    protected UnpackingSoSource(Context context, String str) {
        this(context, str, true);
    }

    protected UnpackingSoSource(Context context, String str, boolean z2) {
        super(getSoStorePath(context, str), z2 ? 1 : 0);
        this.mContext = context;
    }

    private void deleteSoFiles() throws IOException {
        File[] fileArrListFiles = this.soDirectory.listFiles(new FilenameFilter() { // from class: com.facebook.soloader.UnpackingSoSource.1
            AnonymousClass1() {
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return (str.equals(UnpackingSoSource.STATE_FILE_NAME) || str.equals(UnpackingSoSource.LOCK_FILE_NAME) || str.equals(UnpackingSoSource.DEPS_FILE_NAME)) ? false : true;
            }
        });
        if (fileArrListFiles == null) {
            throw new IOException("unable to list directory " + this.soDirectory);
        }
        for (File file : fileArrListFiles) {
            LogUtil.v(TAG, "Deleting " + file);
            SysUtil.dumbDelete(file);
        }
    }

    private static boolean forceRefresh(int i2) {
        return (i2 + 2) - (i2 | 2) != 0;
    }

    public static File getSoStorePath(Context context, String str) throws Throwable {
        Object obj;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("z\t\u007f\u000f\r\b\u0004N\u0005\u0012\u0012\u0019\u000b\u0015\u001cVl\u001a\u001a!\u0013'$", (short) (C1499aX.Xd() ^ (-24501)))).getMethod(Wg.vd("\u001b\u001a*w()&$\u001f\u001e2(//\u000b1\n\u0014", (short) (OY.Xd() ^ 1607)), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strKd = Qg.kd("gshuqjd-aljo_gl%fb\"4ba\\XQN`TYW1ULT", (short) (FB.Xd() ^ 15850), (short) (FB.Xd() ^ 27724));
            short sXd = (short) (C1633zX.Xd() ^ (-8205));
            short sXd2 = (short) (C1633zX.Xd() ^ (-9239));
            int[] iArr = new int["\u007f{\u000ey[\u007f\b".length()];
            QB qb = new QB("\u007f{\u000ey[\u007f\b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            String str2 = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 1 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            return new File(sb.append((String) obj).append(C1561oA.ud("t", (short) (C1607wl.Xd() ^ 16315))).append(str).toString());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private boolean libraryIsCorrupted(Dso dso, File file) {
        return (file.exists() && dso.hash.equals(computeFileHash(file))) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean refreshLocked(com.facebook.soloader.FileLocker r16, int r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.refreshLocked(com.facebook.soloader.FileLocker, int):boolean");
    }

    private static boolean rewriteStateAsync(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 1)) != 0;
    }

    public static void writeState(File file, byte b2, boolean z2) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b2);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z2) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e2) {
            LogUtil.w(TAG, "state file sync failed", e2);
        }
    }

    protected String computeFileHash(File file) {
        try {
            MessageDigest hashingAlgorithm = getHashingAlgorithm();
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, hashingAlgorithm);
                    try {
                        while (digestInputStream.read(new byte[8192]) != -1) {
                        }
                        byte[] bArrDigest = hashingAlgorithm.digest();
                        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
                        for (byte b2 : bArrDigest) {
                            sb.append(String.format("%02x", Byte.valueOf(b2)));
                        }
                        String string = sb.toString();
                        digestInputStream.close();
                        fileInputStream.close();
                        return string;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e2) {
                LogUtil.w(TAG, "Failed to calculate hash for " + file.getName(), e2);
                return "-1";
            }
        } catch (NoSuchAlgorithmException e3) {
            LogUtil.w(TAG, "Failed to calculate hash for " + file.getName(), e3);
            return "-1";
        }
    }

    protected boolean depsChanged(byte[] bArr) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.soDirectory, DEPS_FILE_NAME), "rw");
            try {
                if (randomAccessFile.length() == 0) {
                    randomAccessFile.close();
                    return true;
                }
                int length = (int) randomAccessFile.length();
                byte[] bArr2 = new byte[length];
                if (randomAccessFile.read(bArr2) != length) {
                    LogUtil.v(TAG, "short read of so store deps file: marking unclean");
                    randomAccessFile.close();
                    return true;
                }
                boolean zDepsChanged = depsChanged(bArr2, bArr);
                randomAccessFile.close();
                return zDepsChanged;
            } finally {
            }
        } catch (IOException e2) {
            LogUtil.w(TAG, "failed to compare whether deps changed", e2);
            return true;
        }
    }

    protected boolean depsChanged(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    protected byte[] getDepsBlock() throws IOException {
        Parcel parcelObtain = Parcel.obtain();
        Unpacker unpackerMakeUnpacker = makeUnpacker();
        try {
            Dso[] dsos = unpackerMakeUnpacker.getDsos();
            parcelObtain.writeInt(dsos.length);
            for (Dso dso : dsos) {
                parcelObtain.writeString(dso.name);
                parcelObtain.writeString(dso.hash);
            }
            if (unpackerMakeUnpacker != null) {
                unpackerMakeUnpacker.close();
            }
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            if (unpackerMakeUnpacker != null) {
                try {
                    unpackerMakeUnpacker.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Dso[] getDsosBaseApk() throws IOException {
        Unpacker unpackerMakeUnpacker = makeUnpacker();
        try {
            Dso[] dsos = unpackerMakeUnpacker.getDsos();
            if (unpackerMakeUnpacker != null) {
                unpackerMakeUnpacker.close();
            }
            return dsos;
        } catch (Throwable th) {
            if (unpackerMakeUnpacker != null) {
                try {
                    unpackerMakeUnpacker.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected MessageDigest getHashingAlgorithm() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256");
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    @Nullable
    public String getLibraryPath(String str) throws IOException {
        File soFileByName = getSoFileByName(str);
        if (soFileByName == null) {
            return null;
        }
        return soFileByName.getCanonicalPath();
    }

    @Override // com.facebook.soloader.SoSource
    public String[] getSoSourceAbis() {
        String[] strArr = this.mAbis;
        return strArr == null ? super.getSoSourceAbis() : strArr;
    }

    protected abstract Unpacker makeUnpacker() throws IOException;

    @Override // com.facebook.soloader.SoSource
    public void prepare(int i2) throws IOException {
        SysUtil.mkdirOrThrow(this.soDirectory);
        if (!this.soDirectory.canWrite() && !this.soDirectory.setWritable(true)) {
            throw new IOException("error adding " + this.soDirectory.getCanonicalPath() + " write permission");
        }
        FileLocker fileLocker = null;
        try {
            try {
                FileLocker orCreateLockOnDir = SysUtil.getOrCreateLockOnDir(this.soDirectory, new File(this.soDirectory, LOCK_FILE_NAME));
                try {
                    LogUtil.v(TAG, "locked dso store " + this.soDirectory);
                    if (!this.soDirectory.canWrite() && !this.soDirectory.setWritable(true)) {
                        throw new IOException("error adding " + this.soDirectory.getCanonicalPath() + " write permission");
                    }
                    if (!refreshLocked(orCreateLockOnDir, i2)) {
                        LogUtil.i(TAG, "dso store is up-to-date: " + this.soDirectory);
                        fileLocker = orCreateLockOnDir;
                    }
                    if (fileLocker != null) {
                        LogUtil.v(TAG, "releasing dso store lock for " + this.soDirectory);
                        fileLocker.close();
                    } else {
                        LogUtil.v(TAG, "not releasing dso store lock for " + this.soDirectory + " (syncer thread started)");
                    }
                    if (this.soDirectory.canWrite() && !this.soDirectory.setWritable(false)) {
                        throw new IOException("error removing " + this.soDirectory.getCanonicalPath() + " write permission");
                    }
                } catch (Throwable th) {
                    th = th;
                    fileLocker = orCreateLockOnDir;
                    if (fileLocker != null) {
                        LogUtil.v(TAG, "releasing dso store lock for " + this.soDirectory);
                        fileLocker.close();
                    } else {
                        LogUtil.v(TAG, "not releasing dso store lock for " + this.soDirectory + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (this.soDirectory.canWrite() && !this.soDirectory.setWritable(false)) {
                throw new IOException("error removing " + this.soDirectory.getCanonicalPath() + " write permission");
            }
            throw th3;
        }
    }

    public void setSoSourceAbis(String[] strArr) {
        this.mAbis = strArr;
    }

    @Override // com.facebook.soloader.AsyncInitSoSource
    public void waitUntilInitCompleted() throws Throwable {
        try {
            FileLocker orCreateLockOnDir = SysUtil.getOrCreateLockOnDir(this.soDirectory, new File(this.soDirectory, LOCK_FILE_NAME));
            if (orCreateLockOnDir != null) {
                orCreateLockOnDir.close();
            }
        } catch (Exception e2) {
            LogUtil.e(TAG, "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + this.soDirectory + "): ", e2);
        }
    }
}
