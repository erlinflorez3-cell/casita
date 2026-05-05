package org.spongycastle.crypto.commitments;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.Commitment;
import org.spongycastle.crypto.Committer;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Arrays;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
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

    @Override // org.spongycastle.crypto.Committer
    public Commitment commit(byte[] bArr) throws Throwable {
        int length = bArr.length;
        int i2 = this.byteLength;
        if (length > i2 / 2) {
            throw new DataLengthException(Ig.wd("V \u001c|\u001bs\u000ePV\u00013\u0018L\r@u\u001b-`c%Mb>\u0018\u001fp\u001d\"S \u0016\u001fQ|D\u001c~\u0007s\u001d9s\f\u000b1,7", (short) (FB.Xd() ^ 18570)));
        }
        byte[] bArr2 = new byte[i2 - bArr.length];
        SecureRandom secureRandom = this.random;
        Object[] objArr = {bArr2};
        Method method = Class.forName(ZO.xd("/*v\u000eu1D1O\u0015%\u0019!t='u*aNBl|\f\u0015\\", (short) (FB.Xd() ^ 17115), (short) (FB.Xd() ^ 32154))).getMethod(C1626yg.Ud("z$)\bnRC}U", (short) (Od.Xd() ^ (-21713)), (short) (Od.Xd() ^ (-24122))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            return new Commitment(bArr2, calculateCommitment(bArr2, bArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.crypto.Committer
    public boolean isRevealed(Commitment commitment, byte[] bArr) {
        if (bArr.length + commitment.getSecret().length != this.byteLength) {
            throw new DataLengthException("Message and witness secret lengths do not match.");
        }
        return Arrays.constantTimeAreEqual(commitment.getCommitment(), calculateCommitment(commitment.getSecret(), bArr));
    }
}
