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
import yg.C1499aX;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralHashCommitter implements Committer {
    private final int byteLength;
    private final Digest digest;
    private final SecureRandom random;

    public GeneralHashCommitter(ExtendedDigest extendedDigest, SecureRandom secureRandom) {
        this.digest = extendedDigest;
        this.byteLength = extendedDigest.getByteLength();
        this.random = secureRandom;
    }

    private byte[] calculateCommitment(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[this.digest.getDigestSize()];
        this.digest.update(bArr, 0, bArr.length);
        this.digest.update(bArr2, 0, bArr2.length);
        this.digest.update((byte) (bArr2.length >>> 8));
        this.digest.update((byte) bArr2.length);
        this.digest.doFinal(bArr3, 0);
        return bArr3;
    }

    @Override // org.spongycastle.crypto.Committer
    public Commitment commit(byte[] bArr) throws Throwable {
        int length = bArr.length;
        int i2 = this.byteLength;
        if (length > i2 / 2) {
            throw new DataLengthException(Jg.Wd("\u0002\t^m3H.7$m&[2w\u0007&wbjHX\u0018\u0007Qu\u007f\u007fCN\u001d\u001d5=B\u0002\f\u0019sg6z\u000f\u001b\t]{C\r", (short) (Od.Xd() ^ (-31417)), (short) (Od.Xd() ^ (-15144))));
        }
        byte[] bArr2 = new byte[i2 - bArr.length];
        SecureRandom secureRandom = this.random;
        short sXd = (short) (FB.Xd() ^ 12923);
        int[] iArr = new int["vn\u0005p>\u0005wv\n\b\u007f\f\u0012Gm\u0001\u007f\u0013\u0011\u0005r\u0003\u0011\b\u0014\u0013".length()];
        QB qb = new QB("vn\u0005p>\u0005wv\n\b\u007f\f\u0012Gm\u0001\u007f\u0013\u0011\u0005r\u0003\u0011\b\u0014\u0013");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        Object[] objArr = {bArr2};
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Xg.qd(" \u0018,)w0,\u001e-", (short) (C1499aX.Xd() ^ (-24028)), (short) (C1499aX.Xd() ^ (-3494))), byte[].class);
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
