package org.spongycastle.pqc.crypto.ntru;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.Arrays;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class NTRUEncryptionKeyGenerationParameters extends KeyGenerationParameters implements Cloneable {
    public int N;
    public int bufferLenBits;
    int bufferLenTrits;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28146c;
    public int db;
    public int df;
    public int df1;
    public int df2;
    public int df3;
    public int dg;
    public int dm0;
    public int dr;
    public int dr1;
    public int dr2;
    public int dr3;
    public boolean fastFp;
    public Digest hashAlg;
    public boolean hashSeed;
    int llen;
    public int maxMsgLenBytes;
    public int minCallsMask;
    public int minCallsR;
    public byte[] oid;
    public int pkLen;
    public int polyType;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f28147q;
    public boolean sparse;
    public static final NTRUEncryptionKeyGenerationParameters EES1087EP2 = new NTRUEncryptionKeyGenerationParameters(PhotoshopDirectory.TAG_AUTO_SAVE_FORMAT, 2048, 120, 120, 256, 13, 25, 14, true, new byte[]{0, 6, 3}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters EES1171EP1 = new NTRUEncryptionKeyGenerationParameters(1171, 2048, 106, 106, 256, 13, 20, 15, true, new byte[]{0, 6, 4}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters EES1499EP1 = new NTRUEncryptionKeyGenerationParameters(1499, 2048, 79, 79, 256, 13, 17, 19, true, new byte[]{0, 6, 5}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_439 = new NTRUEncryptionKeyGenerationParameters(439, 2048, 146, 130, 128, 9, 32, 9, true, new byte[]{0, 7, 101}, true, false, new SHA256Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_439_FAST = new NTRUEncryptionKeyGenerationParameters(439, 2048, 9, 8, 5, 130, 128, 9, 32, 9, true, new byte[]{0, 7, 101}, true, true, new SHA256Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_743 = new NTRUEncryptionKeyGenerationParameters(743, 2048, 248, 220, 256, 10, 27, 14, true, new byte[]{0, 7, 105}, false, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_743_FAST = new NTRUEncryptionKeyGenerationParameters(743, 2048, 11, 11, 15, 220, 256, 10, 27, 14, true, new byte[]{0, 7, 105}, false, true, new SHA512Digest());

    /* JADX WARN: Illegal instructions before constructor call */
    public NTRUEncryptionKeyGenerationParameters(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2, byte[] bArr, boolean z3, boolean z4, Digest digest) throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1626yg.Ud("\u000b_R\f\tTS8//uk)qwBk\\n\u0018Z\u000e+\u001b.V", (short) (Od.Xd() ^ (-433)), (short) (Od.Xd() ^ (-84)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            super((SecureRandom) constructor.newInstance(objArr), i8);
            this.N = i2;
            this.f28147q = i3;
            this.df1 = i4;
            this.df2 = i5;
            this.df3 = i6;
            this.db = i8;
            this.dm0 = i7;
            this.f28146c = i9;
            this.minCallsR = i10;
            this.minCallsMask = i11;
            this.hashSeed = z2;
            this.oid = bArr;
            this.sparse = z3;
            this.fastFp = z4;
            this.polyType = 1;
            this.hashAlg = digest;
            init();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NTRUEncryptionKeyGenerationParameters(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2, byte[] bArr, boolean z3, boolean z4, Digest digest) throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Ig.wd("{!(jTD\u0018\u0005Ona\u0011JvJ\u0001!;nG\\6ogz3", (short) (C1633zX.Xd() ^ (-11721)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            super((SecureRandom) constructor.newInstance(objArr), i6);
            this.N = i2;
            this.f28147q = i3;
            this.df = i4;
            this.db = i6;
            this.dm0 = i5;
            this.f28146c = i7;
            this.minCallsR = i8;
            this.minCallsMask = i9;
            this.hashSeed = z2;
            this.oid = bArr;
            this.sparse = z3;
            this.fastFp = z4;
            this.polyType = 0;
            this.hashAlg = digest;
            init();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NTRUEncryptionKeyGenerationParameters(InputStream inputStream) throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(EO.Od("0lQ\"),0o1\u0010\u0003m\u001eb\"\u00183)\u007f8d=b^x1", (short) (OY.Xd() ^ TypedValues.MotionType.TYPE_DRAW_PATH))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            super((SecureRandom) constructor.newInstance(objArr), -1);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.N = dataInputStream.readInt();
            this.f28147q = dataInputStream.readInt();
            this.df = dataInputStream.readInt();
            this.df1 = dataInputStream.readInt();
            this.df2 = dataInputStream.readInt();
            this.df3 = dataInputStream.readInt();
            this.db = dataInputStream.readInt();
            this.dm0 = dataInputStream.readInt();
            this.f28146c = dataInputStream.readInt();
            this.minCallsR = dataInputStream.readInt();
            this.minCallsMask = dataInputStream.readInt();
            this.hashSeed = dataInputStream.readBoolean();
            byte[] bArr = new byte[3];
            this.oid = bArr;
            dataInputStream.read(bArr);
            this.sparse = dataInputStream.readBoolean();
            this.fastFp = dataInputStream.readBoolean();
            this.polyType = dataInputStream.read();
            String utf = dataInputStream.readUTF();
            if (C1561oA.Qd(", \u0018\u0003\n\u0005\u0005", (short) (C1607wl.Xd() ^ 12238)).equals(utf)) {
                this.hashAlg = new SHA512Digest();
            } else {
                short sXd = (short) (OY.Xd() ^ 3476);
                short sXd2 = (short) (OY.Xd() ^ 15142);
                int[] iArr = new int["\u0011\u0007\u0001mswy".length()];
                QB qb = new QB("\u0011\u0007\u0001mswy");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                    i2++;
                }
                if (new String(iArr, 0, i2).equals(utf)) {
                    this.hashAlg = new SHA256Digest();
                }
            }
            init();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void init() {
        this.dr = this.df;
        this.dr1 = this.df1;
        this.dr2 = this.df2;
        this.dr3 = this.df3;
        int i2 = this.N;
        this.dg = i2 / 3;
        this.llen = 1;
        int i3 = this.db;
        this.maxMsgLenBytes = (((((i2 * 3) / 2) / 8) - 1) - (i3 / 8)) - 1;
        this.bufferLenBits = (((((i2 * 3) / 2) + 7) / 8) * 8) + 1;
        this.bufferLenTrits = i2 - 1;
        this.pkLen = i3;
    }

    public NTRUEncryptionKeyGenerationParameters clone() {
        return this.polyType == 0 ? new NTRUEncryptionKeyGenerationParameters(this.N, this.f28147q, this.df, this.dm0, this.db, this.f28146c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg) : new NTRUEncryptionKeyGenerationParameters(this.N, this.f28147q, this.df1, this.df2, this.df3, this.dm0, this.db, this.f28146c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters = (NTRUEncryptionKeyGenerationParameters) obj;
        if (this.N != nTRUEncryptionKeyGenerationParameters.N || this.bufferLenBits != nTRUEncryptionKeyGenerationParameters.bufferLenBits || this.bufferLenTrits != nTRUEncryptionKeyGenerationParameters.bufferLenTrits || this.f28146c != nTRUEncryptionKeyGenerationParameters.f28146c || this.db != nTRUEncryptionKeyGenerationParameters.db || this.df != nTRUEncryptionKeyGenerationParameters.df || this.df1 != nTRUEncryptionKeyGenerationParameters.df1 || this.df2 != nTRUEncryptionKeyGenerationParameters.df2 || this.df3 != nTRUEncryptionKeyGenerationParameters.df3 || this.dg != nTRUEncryptionKeyGenerationParameters.dg || this.dm0 != nTRUEncryptionKeyGenerationParameters.dm0 || this.dr != nTRUEncryptionKeyGenerationParameters.dr || this.dr1 != nTRUEncryptionKeyGenerationParameters.dr1 || this.dr2 != nTRUEncryptionKeyGenerationParameters.dr2 || this.dr3 != nTRUEncryptionKeyGenerationParameters.dr3 || this.fastFp != nTRUEncryptionKeyGenerationParameters.fastFp) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUEncryptionKeyGenerationParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUEncryptionKeyGenerationParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return this.hashSeed == nTRUEncryptionKeyGenerationParameters.hashSeed && this.llen == nTRUEncryptionKeyGenerationParameters.llen && this.maxMsgLenBytes == nTRUEncryptionKeyGenerationParameters.maxMsgLenBytes && this.minCallsMask == nTRUEncryptionKeyGenerationParameters.minCallsMask && this.minCallsR == nTRUEncryptionKeyGenerationParameters.minCallsR && Arrays.equals(this.oid, nTRUEncryptionKeyGenerationParameters.oid) && this.pkLen == nTRUEncryptionKeyGenerationParameters.pkLen && this.polyType == nTRUEncryptionKeyGenerationParameters.polyType && this.f28147q == nTRUEncryptionKeyGenerationParameters.f28147q && this.sparse == nTRUEncryptionKeyGenerationParameters.sparse;
    }

    public NTRUEncryptionParameters getEncryptionParameters() {
        return this.polyType == 0 ? new NTRUEncryptionParameters(this.N, this.f28147q, this.df, this.dm0, this.db, this.f28146c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg) : new NTRUEncryptionParameters(this.N, this.f28147q, this.df1, this.df2, this.df3, this.dm0, this.db, this.f28146c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
    }

    public int getMaxMessageLength() {
        return this.maxMsgLenBytes;
    }

    public int hashCode() {
        int i2 = (((((((((((((((((((((((((((((((this.N + 31) * 31) + this.bufferLenBits) * 31) + this.bufferLenTrits) * 31) + this.f28146c) * 31) + this.db) * 31) + this.df) * 31) + this.df1) * 31) + this.df2) * 31) + this.df3) * 31) + this.dg) * 31) + this.dm0) * 31) + this.dr) * 31) + this.dr1) * 31) + this.dr2) * 31) + this.dr3) * 31) + (this.fastFp ? 1231 : 1237)) * 31;
        Digest digest = this.hashAlg;
        return ((((((((((((((((((((i2 + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + (this.hashSeed ? 1231 : 1237)) * 31) + this.llen) * 31) + this.maxMsgLenBytes) * 31) + this.minCallsMask) * 31) + this.minCallsR) * 31) + Arrays.hashCode(this.oid)) * 31) + this.pkLen) * 31) + this.polyType) * 31) + this.f28147q) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EncryptionParameters(N=" + this.N + " q=" + this.f28147q);
        if (this.polyType == 0) {
            sb.append(" polyType=SIMPLE df=" + this.df);
        } else {
            sb.append(" polyType=PRODUCT df1=" + this.df1 + " df2=" + this.df2 + " df3=" + this.df3);
        }
        sb.append(" dm0=" + this.dm0 + " db=" + this.db + " c=" + this.f28146c + " minCallsR=" + this.minCallsR + " minCallsMask=" + this.minCallsMask + " hashSeed=" + this.hashSeed + " hashAlg=" + this.hashAlg + " oid=" + Arrays.toString(this.oid) + " sparse=" + this.sparse + ")");
        return sb.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.N);
        dataOutputStream.writeInt(this.f28147q);
        dataOutputStream.writeInt(this.df);
        dataOutputStream.writeInt(this.df1);
        dataOutputStream.writeInt(this.df2);
        dataOutputStream.writeInt(this.df3);
        dataOutputStream.writeInt(this.db);
        dataOutputStream.writeInt(this.dm0);
        dataOutputStream.writeInt(this.f28146c);
        dataOutputStream.writeInt(this.minCallsR);
        dataOutputStream.writeInt(this.minCallsMask);
        dataOutputStream.writeBoolean(this.hashSeed);
        dataOutputStream.write(this.oid);
        dataOutputStream.writeBoolean(this.sparse);
        dataOutputStream.writeBoolean(this.fastFp);
        dataOutputStream.write(this.polyType);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    }
}
