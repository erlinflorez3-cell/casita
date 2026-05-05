package androidx.security.crypto;

import android.content.Context;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTemplates;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import com.google.crypto.tink.streamingaead.StreamingAeadConfig;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class EncryptedFile {
    private static final String KEYSET_ALIAS = "__androidx_security_crypto_encrypted_file_keyset__";
    private static final String KEYSET_PREF_NAME = "__androidx_security_crypto_encrypted_file_pref__";
    final Context mContext;
    final File mFile;
    final String mMasterKeyAlias;
    final StreamingAead mStreamingAead;

    EncryptedFile(File file, String str, StreamingAead streamingAead, Context context) {
        this.mFile = file;
        this.mContext = context;
        this.mMasterKeyAlias = str;
        this.mStreamingAead = streamingAead;
    }

    public enum FileEncryptionScheme {
        AES256_GCM_HKDF_4KB("AES256_GCM_HKDF_4KB");

        private final String mKeyTemplateName;

        FileEncryptionScheme(String str) {
            this.mKeyTemplateName = str;
        }

        KeyTemplate getKeyTemplate() throws GeneralSecurityException {
            return KeyTemplates.get(this.mKeyTemplateName);
        }
    }

    public static final class Builder {
        private static final Object sLock = new Object();
        final Context mContext;
        File mFile;
        final FileEncryptionScheme mFileEncryptionScheme;
        String mKeysetAlias;
        String mKeysetPrefName;
        final String mMasterKeyAlias;

        @Deprecated
        public Builder(File file, Context context, String str, FileEncryptionScheme fileEncryptionScheme) throws Throwable {
            short sXd = (short) (OY.Xd() ^ 11009);
            short sXd2 = (short) (OY.Xd() ^ 17677);
            int[] iArr = new int["\u0013\u0014\u0017%\u001c+)$ 5\u001d2%$75-9?&+;C;@<-4>4DLDI;;7?CGA<NQEGAB".length()];
            QB qb = new QB("\u0013\u0014\u0017%\u001c+)$ 5\u001d2%$75-9?&+;C;@<-4>4DLDI;;7?CGA<NQEGAB");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            this.mKeysetPrefName = new String(iArr, 0, i2);
            this.mKeysetAlias = C1561oA.od("&%&2'40)#6\u001c/ \u001d.* *.\u0013\u0016$* #\u001d\f\u0011\u0019\r\u001b!\u0017\u001a\n\b\u0002\b\n\f\u0004|\b\u0001\u0014\r}\fut", (short) (C1580rY.Xd() ^ (-10366)));
            this.mFile = file;
            this.mFileEncryptionScheme = fileEncryptionScheme;
            Class<?> cls = Class.forName(C1561oA.Kd(";I@OMHD\u000fERRYKU\\\u0017-ZZaSgd", (short) (Od.Xd() ^ (-20234))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd3 = (short) (FB.Xd() ^ 25749);
            short sXd4 = (short) (FB.Xd() ^ 976);
            int[] iArr2 = new int["*Pl\u0013OG`g>DT#7\u001f_\u00152A\u001e\u001a$".length()];
            QB qb2 = new QB("*Pl\u0013OG`g>DT#7\u001f_\u00152A\u001e\u001a$");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd4) ^ sXd3) + xuXd2.CK(iKK2));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                this.mContext = (Context) method.invoke(context, objArr);
                this.mMasterKeyAlias = str;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Builder(Context context, File file, MasterKey masterKey, FileEncryptionScheme fileEncryptionScheme) throws Throwable {
            this.mKeysetPrefName = C1626yg.Ud("*vpti\ny!Pk#OhH=nzGk+\u0013a*J5M@\u00053~3j-Tq\u001cH\u0018)~\\a}@K|&\t", (short) (C1499aX.Xd() ^ (-3053)), (short) (C1499aX.Xd() ^ (-5654)));
            this.mKeysetAlias = Ig.wd("0\u007fO@V\b%^~\u0013{m\u0011\u0005~]0-ys=$\t\u0004]\u0018eC\u001e\u0001Cj\b,:i\u00116\f#\u001a:v\u0001iyd%@b", (short) (C1499aX.Xd() ^ (-20978)));
            this.mFile = file;
            this.mFileEncryptionScheme = fileEncryptionScheme;
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("{X\\\u0006\u0014;\u001eOc@9%`gy\u0016w\u000eU'V.\u0018", (short) (C1607wl.Xd() ^ 6278))).getMethod(C1561oA.Qd("hes?mlgc\\Yk_db6a_dTfa", (short) (ZN.Xd() ^ 13280)), new Class[0]);
            try {
                method.setAccessible(true);
                this.mContext = (Context) method.invoke(context, objArr);
                this.mMasterKeyAlias = masterKey.getKeyAlias();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Builder setKeysetPrefName(String str) {
            this.mKeysetPrefName = str;
            return this;
        }

        public Builder setKeysetAlias(String str) {
            this.mKeysetAlias = str;
            return this;
        }

        public EncryptedFile build() throws GeneralSecurityException, IOException {
            AndroidKeysetManager androidKeysetManagerBuild;
            StreamingAeadConfig.register();
            AndroidKeysetManager.Builder builderWithMasterKeyUri = new AndroidKeysetManager.Builder().withKeyTemplate(this.mFileEncryptionScheme.getKeyTemplate()).withSharedPref(this.mContext, this.mKeysetAlias, this.mKeysetPrefName).withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + this.mMasterKeyAlias);
            synchronized (sLock) {
                androidKeysetManagerBuild = builderWithMasterKeyUri.build();
            }
            return new EncryptedFile(this.mFile, this.mKeysetAlias, (StreamingAead) androidKeysetManagerBuild.getKeysetHandle().getPrimitive(StreamingAead.class), this.mContext);
        }
    }

    public FileOutputStream openFileOutput() throws GeneralSecurityException, IOException {
        if (this.mFile.exists()) {
            throw new IOException("output file already exists, please use a new file: " + this.mFile.getName());
        }
        FileOutputStream fileOutputStream = new FileOutputStream(this.mFile);
        return new EncryptedFileOutputStream(fileOutputStream.getFD(), this.mStreamingAead.newEncryptingStream(fileOutputStream, this.mFile.getName().getBytes(StandardCharsets.UTF_8)));
    }

    public FileInputStream openFileInput() throws GeneralSecurityException, IOException {
        if (!this.mFile.exists()) {
            throw new FileNotFoundException("file doesn't exist: " + this.mFile.getName());
        }
        FileInputStream fileInputStream = new FileInputStream(this.mFile);
        return new EncryptedFileInputStream(fileInputStream.getFD(), this.mStreamingAead.newDecryptingStream(fileInputStream, this.mFile.getName().getBytes(StandardCharsets.UTF_8)));
    }

    private static final class EncryptedFileOutputStream extends FileOutputStream {
        private final OutputStream mEncryptedOutputStream;

        EncryptedFileOutputStream(FileDescriptor fileDescriptor, OutputStream outputStream) {
            super(fileDescriptor);
            this.mEncryptedOutputStream = outputStream;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.mEncryptedOutputStream.write(bArr);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(int i2) throws IOException {
            this.mEncryptedOutputStream.write(i2);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.mEncryptedOutputStream.write(bArr, i2, i3);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mEncryptedOutputStream.close();
        }

        @Override // java.io.FileOutputStream
        public FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.mEncryptedOutputStream.flush();
        }
    }

    private static final class EncryptedFileInputStream extends FileInputStream {
        private final InputStream mEncryptedInputStream;
        private final Object mLock;

        EncryptedFileInputStream(FileDescriptor fileDescriptor, InputStream inputStream) {
            super(fileDescriptor);
            this.mLock = new Object();
            this.mEncryptedInputStream = inputStream;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read() throws IOException {
            return this.mEncryptedInputStream.read();
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            return this.mEncryptedInputStream.read(bArr);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            return this.mEncryptedInputStream.read(bArr, i2, i3);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public long skip(long j2) throws IOException {
            return this.mEncryptedInputStream.skip(j2);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int available() throws IOException {
            return this.mEncryptedInputStream.available();
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mEncryptedInputStream.close();
        }

        @Override // java.io.FileInputStream
        public FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            synchronized (this.mLock) {
                this.mEncryptedInputStream.mark(i2);
            }
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            synchronized (this.mLock) {
                this.mEncryptedInputStream.reset();
            }
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.mEncryptedInputStream.markSupported();
        }
    }
}
