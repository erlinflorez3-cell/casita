package org.spongycastle.openpgp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import org.spongycastle.bcpg.SignaturePacket;
import org.spongycastle.bcpg.SignatureSubpacket;
import org.spongycastle.bcpg.sig.Features;
import org.spongycastle.bcpg.sig.IssuerKeyID;
import org.spongycastle.bcpg.sig.KeyExpirationTime;
import org.spongycastle.bcpg.sig.KeyFlags;
import org.spongycastle.bcpg.sig.NotationData;
import org.spongycastle.bcpg.sig.PreferredAlgorithms;
import org.spongycastle.bcpg.sig.PrimaryUserID;
import org.spongycastle.bcpg.sig.SignatureCreationTime;
import org.spongycastle.bcpg.sig.SignatureExpirationTime;
import org.spongycastle.bcpg.sig.SignerUserID;

/* JADX INFO: loaded from: classes2.dex */
public class PGPSignatureSubpacketVector {
    SignatureSubpacket[] packets;

    PGPSignatureSubpacketVector(SignatureSubpacket[] signatureSubpacketArr) {
        this.packets = signatureSubpacketArr;
    }

    public int[] getCriticalTags() {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            SignatureSubpacket[] signatureSubpacketArr = this.packets;
            if (i3 == signatureSubpacketArr.length) {
                break;
            }
            if (signatureSubpacketArr[i3].isCritical()) {
                i4++;
            }
            i3++;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        while (true) {
            SignatureSubpacket[] signatureSubpacketArr2 = this.packets;
            if (i2 == signatureSubpacketArr2.length) {
                return iArr;
            }
            if (signatureSubpacketArr2[i2].isCritical()) {
                iArr[i5] = this.packets[i2].getType();
                i5++;
            }
            i2++;
        }
    }

    public PGPSignatureList getEmbeddedSignatures() throws PGPException {
        SignatureSubpacket[] subpackets = getSubpackets(32);
        ArrayList arrayList = new ArrayList();
        for (SignatureSubpacket signatureSubpacket : subpackets) {
            try {
                arrayList.add(new PGPSignature(SignaturePacket.fromByteArray(signatureSubpacket.getData())));
            } catch (IOException e2) {
                throw new PGPException("Unable to parse signature packet: " + e2.getMessage(), e2);
            }
        }
        return new PGPSignatureList((PGPSignature[]) arrayList.toArray(new PGPSignature[arrayList.size()]));
    }

    public Features getFeatures() {
        SignatureSubpacket subpacket = getSubpacket(30);
        if (subpacket == null) {
            return null;
        }
        return new Features(subpacket.isCritical(), subpacket.isLongLength(), subpacket.getData());
    }

    public long getIssuerKeyID() {
        SignatureSubpacket subpacket = getSubpacket(16);
        if (subpacket == null) {
            return 0L;
        }
        return ((IssuerKeyID) subpacket).getKeyID();
    }

    public long getKeyExpirationTime() {
        SignatureSubpacket subpacket = getSubpacket(9);
        if (subpacket == null) {
            return 0L;
        }
        return ((KeyExpirationTime) subpacket).getTime();
    }

    public int getKeyFlags() {
        SignatureSubpacket subpacket = getSubpacket(27);
        if (subpacket == null) {
            return 0;
        }
        return ((KeyFlags) subpacket).getFlags();
    }

    public NotationData[] getNotationDataOccurences() {
        return getNotationDataOccurrences();
    }

    public NotationData[] getNotationDataOccurrences() {
        SignatureSubpacket[] subpackets = getSubpackets(20);
        NotationData[] notationDataArr = new NotationData[subpackets.length];
        for (int i2 = 0; i2 < subpackets.length; i2++) {
            notationDataArr[i2] = (NotationData) subpackets[i2];
        }
        return notationDataArr;
    }

    public int[] getPreferredCompressionAlgorithms() {
        SignatureSubpacket subpacket = getSubpacket(22);
        if (subpacket == null) {
            return null;
        }
        return ((PreferredAlgorithms) subpacket).getPreferences();
    }

    public int[] getPreferredHashAlgorithms() {
        SignatureSubpacket subpacket = getSubpacket(21);
        if (subpacket == null) {
            return null;
        }
        return ((PreferredAlgorithms) subpacket).getPreferences();
    }

    public int[] getPreferredSymmetricAlgorithms() {
        SignatureSubpacket subpacket = getSubpacket(11);
        if (subpacket == null) {
            return null;
        }
        return ((PreferredAlgorithms) subpacket).getPreferences();
    }

    public Date getSignatureCreationTime() {
        SignatureSubpacket subpacket = getSubpacket(2);
        if (subpacket == null) {
            return null;
        }
        return ((SignatureCreationTime) subpacket).getTime();
    }

    public long getSignatureExpirationTime() {
        SignatureSubpacket subpacket = getSubpacket(3);
        if (subpacket == null) {
            return 0L;
        }
        return ((SignatureExpirationTime) subpacket).getTime();
    }

    public String getSignerUserID() {
        SignatureSubpacket subpacket = getSubpacket(28);
        if (subpacket == null) {
            return null;
        }
        return ((SignerUserID) subpacket).getID();
    }

    public SignatureSubpacket getSubpacket(int i2) {
        int i3 = 0;
        while (true) {
            SignatureSubpacket[] signatureSubpacketArr = this.packets;
            if (i3 == signatureSubpacketArr.length) {
                return null;
            }
            if (signatureSubpacketArr[i3].getType() == i2) {
                return this.packets[i3];
            }
            i3++;
        }
    }

    public SignatureSubpacket[] getSubpackets(int i2) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            SignatureSubpacket[] signatureSubpacketArr = this.packets;
            if (i3 == signatureSubpacketArr.length) {
                return (SignatureSubpacket[]) arrayList.toArray(new SignatureSubpacket[0]);
            }
            if (signatureSubpacketArr[i3].getType() == i2) {
                arrayList.add(this.packets[i3]);
            }
            i3++;
        }
    }

    public boolean hasSubpacket(int i2) {
        return getSubpacket(i2) != null;
    }

    public boolean isPrimaryUserID() {
        PrimaryUserID primaryUserID = (PrimaryUserID) getSubpacket(25);
        if (primaryUserID != null) {
            return primaryUserID.isPrimaryUserID();
        }
        return false;
    }

    public int size() {
        return this.packets.length;
    }

    SignatureSubpacket[] toSubpacketArray() {
        return this.packets;
    }
}
