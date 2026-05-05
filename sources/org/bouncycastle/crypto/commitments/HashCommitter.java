package org.bouncycastle.crypto.commitments;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Commitment;
import org.bouncycastle.crypto.Committer;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes9.dex */
public class HashCommitter implements Committer {
    private final int byteLength;
    private final Digest digest;
    private final SecureRandom random;

    public HashCommitter(ExtendedDigest extendedDigest, SecureRandom secureRandom) {
        this.digest = extendedDigest;
        this.byteLength = extendedDigest.getByteLength();
        this.random = secureRandom;
    }

    private byte[] calculateCommitment(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[this.digest.getDigestSize()];
        this.digest.update(bArr, 0, bArr.length);
        this.digest.update(bArr2, 0, bArr2.length);
        this.digest.doFinal(bArr3, 0);
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.Committer
    public Commitment commit(byte[] bArr) throws Throwable {
        int length = bArr.length;
        int i2 = this.byteLength;
        if (length > i2 / 2) {
            throw new DataLengthException(ZO.xd("kLw\u0010\th|Hx\u0014\u0007\n>-v0N\u0004zj,K%)'H\u001e*)Z;!Lh8{RBkb\u0011dX\u001el5A+", (short) (Od.Xd() ^ (-11962)), (short) (Od.Xd() ^ (-14967))));
        }
        byte[] bArr2 = new byte[i2 - bArr.length];
        SecureRandom secureRandom = this.random;
        Object[] objArr = {bArr2};
        Method method = Class.forName(Xg.qd("og}i7}po\u0003\u0001x\u0005\u000b@fyx\f\n}k{\n\u0001\r\f", (short) (ZN.Xd() ^ 12765), (short) (ZN.Xd() ^ 25212))).getMethod(Jg.Wd("mQ]S\"QB$,", (short) (FB.Xd() ^ 3338), (short) (FB.Xd() ^ 2155)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            return new Commitment(bArr2, calculateCommitment(bArr2, bArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.crypto.Committer
    public boolean isRevealed(Commitment commitment, byte[] bArr) {
        if (bArr.length + commitment.getSecret().length != this.byteLength) {
            throw new DataLengthException("Message and witness secret lengths do not match.");
        }
        return Arrays.constantTimeAreEqual(commitment.getCommitment(), calculateCommitment(commitment.getSecret(), bArr));
    }
}
