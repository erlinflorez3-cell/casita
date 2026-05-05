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
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes9.dex */
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

    @Override // org.bouncycastle.crypto.Committer
    public Commitment commit(byte[] bArr) throws Throwable {
        int length = bArr.length;
        int i2 = this.byteLength;
        if (length > i2 / 2) {
            short sXd = (short) (C1580rY.Xd() ^ (-24362));
            int[] iArr = new int["9RabQXW\u0013hd\u0016Y]\u0019]jijgstff#xt&{wx*wm\u007fut0w\u0002\u00064y\u007f~}\r\u000fI".length()];
            QB qb = new QB("9RabQXW\u0013hd\u0016Y]\u0019]jijgstff#xt&{wx*wm\u007fut0w\u0002\u00064y\u007f~}\r\u000fI");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
                i3++;
            }
            throw new DataLengthException(new String(iArr, 0, i3));
        }
        byte[] bArr2 = new byte[i2 - bArr.length];
        SecureRandom secureRandom = this.random;
        short sXd2 = (short) (C1499aX.Xd() ^ (-14494));
        int[] iArr2 = new int["\u001c\u0012&\u0010[ \u0011\u000e\u001f\u001b\u0011\u001b\u001fRv\b\u0005\u0016\u0012\u0004o}\n~\t\u0006".length()];
        QB qb2 = new QB("\u001c\u0012&\u0010[ \u0011\u000e\u001f\u001b\u0011\u001b\u001fRv\b\u0005\u0016\u0012\u0004o}\n~\t\u0006");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(sXd2 + i4 + xuXd2.CK(iKK2));
            i4++;
        }
        Object[] objArr = {bArr2};
        Method method = Class.forName(new String(iArr2, 0, i4)).getMethod(C1561oA.yd("WMc^'][KT", (short) (C1580rY.Xd() ^ (-8548))), byte[].class);
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
