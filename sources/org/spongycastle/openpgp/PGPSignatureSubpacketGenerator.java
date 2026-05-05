package org.spongycastle.openpgp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.spongycastle.bcpg.SignatureSubpacket;
import org.spongycastle.bcpg.sig.EmbeddedSignature;
import org.spongycastle.bcpg.sig.Exportable;
import org.spongycastle.bcpg.sig.Features;
import org.spongycastle.bcpg.sig.IssuerKeyID;
import org.spongycastle.bcpg.sig.KeyExpirationTime;
import org.spongycastle.bcpg.sig.KeyFlags;
import org.spongycastle.bcpg.sig.NotationData;
import org.spongycastle.bcpg.sig.PreferredAlgorithms;
import org.spongycastle.bcpg.sig.PrimaryUserID;
import org.spongycastle.bcpg.sig.Revocable;
import org.spongycastle.bcpg.sig.RevocationKey;
import org.spongycastle.bcpg.sig.RevocationReason;
import org.spongycastle.bcpg.sig.SignatureCreationTime;
import org.spongycastle.bcpg.sig.SignatureExpirationTime;
import org.spongycastle.bcpg.sig.SignerUserID;
import org.spongycastle.bcpg.sig.TrustSignature;

/* JADX INFO: loaded from: classes2.dex */
public class PGPSignatureSubpacketGenerator {
    List list = new ArrayList();

    public PGPSignatureSubpacketVector generate() {
        List list = this.list;
        return new PGPSignatureSubpacketVector((SignatureSubpacket[]) list.toArray(new SignatureSubpacket[list.size()]));
    }

    public void setEmbeddedSignature(boolean z2, PGPSignature pGPSignature) throws IOException {
        byte[] encoded = pGPSignature.getEncoded();
        byte[] bArr = encoded.length + (-1) > 256 ? new byte[encoded.length - 3] : new byte[encoded.length - 2];
        System.arraycopy(encoded, encoded.length - bArr.length, bArr, 0, bArr.length);
        this.list.add(new EmbeddedSignature(z2, false, bArr));
    }

    public void setExportable(boolean z2, boolean z3) {
        this.list.add(new Exportable(z2, z3));
    }

    public void setFeature(boolean z2, byte b2) {
        this.list.add(new Features(z2, b2));
    }

    public void setIssuerKeyID(boolean z2, long j2) {
        this.list.add(new IssuerKeyID(z2, j2));
    }

    public void setKeyExpirationTime(boolean z2, long j2) {
        this.list.add(new KeyExpirationTime(z2, j2));
    }

    public void setKeyFlags(boolean z2, int i2) {
        this.list.add(new KeyFlags(z2, i2));
    }

    public void setNotationData(boolean z2, boolean z3, String str, String str2) {
        this.list.add(new NotationData(z2, z3, str, str2));
    }

    public void setPreferredCompressionAlgorithms(boolean z2, int[] iArr) {
        this.list.add(new PreferredAlgorithms(22, z2, iArr));
    }

    public void setPreferredHashAlgorithms(boolean z2, int[] iArr) {
        this.list.add(new PreferredAlgorithms(21, z2, iArr));
    }

    public void setPreferredSymmetricAlgorithms(boolean z2, int[] iArr) {
        this.list.add(new PreferredAlgorithms(11, z2, iArr));
    }

    public void setPrimaryUserID(boolean z2, boolean z3) {
        this.list.add(new PrimaryUserID(z2, z3));
    }

    public void setRevocable(boolean z2, boolean z3) {
        this.list.add(new Revocable(z2, z3));
    }

    public void setRevocationKey(boolean z2, int i2, byte[] bArr) {
        this.list.add(new RevocationKey(z2, (byte) -128, i2, bArr));
    }

    public void setRevocationReason(boolean z2, byte b2, String str) {
        this.list.add(new RevocationReason(z2, b2, str));
    }

    public void setSignatureCreationTime(boolean z2, Date date) {
        this.list.add(new SignatureCreationTime(z2, date));
    }

    public void setSignatureExpirationTime(boolean z2, long j2) {
        this.list.add(new SignatureExpirationTime(z2, j2));
    }

    public void setSignerUserID(boolean z2, String str) {
        if (str == null) {
            throw new IllegalArgumentException("attempt to set null SignerUserID");
        }
        this.list.add(new SignerUserID(z2, str));
    }

    public void setSignerUserID(boolean z2, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("attempt to set null SignerUserID");
        }
        this.list.add(new SignerUserID(z2, false, bArr));
    }

    public void setTrust(boolean z2, int i2, int i3) {
        this.list.add(new TrustSignature(z2, i2, i3));
    }
}
